# Generic queries

The following two queries are generic and can be run on all SPARQL endpoints. They provide
some simple initial way to explore the content of an SPARQL endpoint. One of the advantages
of RDF is that it can be self-explanatory.

## Listing all classess

While there are exceptions, many databases use `rdf:type` and `rdf:subClassOf` to organize
the content. Exploring this can be informative and at least give some initial idea of the
data model used by the database (`a` is synonymous to `rdf:type` in the SPARQL language):

```sparql
SELECT DISTINCT ?type WHERE {
  [] a ?type .
}
```

When we run this on Wikidata, we get:

<!-- https://query.wikidata.org/bigdata/namespace/wdq/sparql -->
<table>
  <tr>
    <td><b>type</b></td>
  </tr>
  <tr>
    <td>http://schema.org/Dataset</td>
  </tr>
  <tr>
    <td>http://wikiba.se/ontology#GeoAutoPrecision</td>
  </tr>
  <tr>
    <td>http://wikiba.se/ontology#Property</td>
  </tr>
  <tr>
    <td>http://www.w3.org/ns/lemon/ontolex#LexicalSense</td>
  </tr>
  <tr>
    <td>http://wikiba.se/ontology#BestRank</td>
  </tr>
  <tr>
    <td>http://schema.org/Article</td>
  </tr>
  <tr>
    <td>http://www.w3.org/2002/07/owl#Class</td>
  </tr>
  <tr>
    <td>http://www.w3.org/2002/07/owl#DatatypeProperty</td>
  </tr>
  <tr><td colspan="2">This table is truncated. See the full table at <a href="sparql/rdfType-1.code.html">sparql/rdfType-1.rq</a></td></tr>
</table>

And when we run this on WikiPathways, we get:

<!-- https://sparql.wikipathways.org/sparql -->
<table>
  <tr>
    <td><b>type</b></td>
  </tr>
  <tr>
    <td>http://www.openlinksw.com/schemas/virtrdf#QuadMapFormat</td>
  </tr>
  <tr>
    <td>http://www.openlinksw.com/schemas/virtrdf#QuadStorage</td>
  </tr>
  <tr>
    <td>http://www.openlinksw.com/schemas/virtrdf#array-of-QuadMapFormat</td>
  </tr>
  <tr>
    <td>http://www.openlinksw.com/schemas/virtrdf#QuadMap</td>
  </tr>
  <tr>
    <td>http://www.openlinksw.com/schemas/virtrdf#QuadMapValue</td>
  </tr>
  <tr>
    <td>http://www.openlinksw.com/schemas/virtrdf#array-of-QuadMapColumn</td>
  </tr>
  <tr>
    <td>http://www.openlinksw.com/schemas/virtrdf#QuadMapColumn</td>
  </tr>
  <tr>
    <td>http://www.openlinksw.com/schemas/virtrdf#array-of-QuadMapATable</td>
  </tr>
  <tr><td colspan="2">This table is truncated. See the full table at <a href="sparql/rdfType-2.code.html">sparql/rdfType-2.rq</a></td></tr>
</table>

In both cases the output is not easy to deal with. For Wikidata, this is because it actually
uses a different property than `rdf:type` and for WikiPathways because it first returns classes
content that comes from the SPARQL endpoint software, and not from the WikiPathways RDF.
You may want to browse the full lists and see what interesting things you can find in those long lists.
You can also check the respective chapters elsewhere in this book for more specific queries.

## Listing all items of some class

For listing example things in the database of a certain type, we can take the output from
the above examples and ask for anything of a specific type. I here replace the `rdf:type` 
with the Wikidata `wdt:P31` and noting a protein is an example type in Wikidata with
`Q8054` (only 10):

**SPARQL** [sparql/wikidataProteins.rq](sparql/wikidataProteins.code.html) ([run](https://query.wikidata.org/embed.html#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0A%0ASELECT%20*%20WHERE%20%7B%0A%20%20%3Fo%20wdt%3AP31%20wd%3AQ8054.%0A%20%20%3Fo%20rdfs%3Alabel%20%3Fl.%0A%20%20FILTER%28LANG%28%3Fl%29%3D%27en%27%29%0A%7D%20LIMIT%2010%0A), [edit](https://query.wikidata.org/#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0A%0ASELECT%20*%20WHERE%20%7B%0A%20%20%3Fo%20wdt%3AP31%20wd%3AQ8054.%0A%20%20%3Fo%20rdfs%3Alabel%20%3Fl.%0A%20%20FILTER%28LANG%28%3Fl%29%3D%27en%27%29%0A%7D%20LIMIT%2010%0A))

```sparql
PREFIX wdt: <http://www.wikidata.org/prop/direct/>
SELECT * WHERE {
  ?o wdt:P31 wd:Q8054.
  ?o rdfs:label ?l.
  FILTER(LANG(?l)='en')
} LIMIT 10
```

which gives:

<!-- https://query.wikidata.org/bigdata/namespace/wdq/sparql -->
<table>
  <tr>
    <td><b>o</b></td>
    <td><b>l</b></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q409065</td>
    <td>Uroporphyrinogen decarboxylase</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q409106</td>
    <td>marker of proliferation Ki-67</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q409114</td>
    <td>Sex determining region Y</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q409166</td>
    <td>Coagulation factor II, thrombin</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q24190</td>
    <td>Neurotrophin 3</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q30530</td>
    <td>Histidine ammonia-lyase</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q58321</td>
    <td>protein kinase</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q63398</td>
    <td>Chromogranin B</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q74314</td>
    <td>Titin</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q74581</td>
    <td>Growth differentiation factor 15</td>
  </tr>
</table>

## Listing all properties of some class

Second, one you have identified a class of interest, then you want to see what properties
are used for that class. For proteins, you can do:

**SPARQL** [sparql/wikidataProteinProperties.rq](sparql/wikidataProteinProperties.code.html) ([run](https://query.wikidata.org/embed.html#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0A%0ASELECT%20DISTINCT%20%3Fp%20WHERE%20%7B%0A%20%20%3Fo%20wdt%3AP31%20wd%3AQ8054.%0A%20%20%3Fo%20%3Fp%20%5B%5D.%0A%7D%20LIMIT%20100%0A), [edit](https://query.wikidata.org/#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0A%0ASELECT%20DISTINCT%20%3Fp%20WHERE%20%7B%0A%20%20%3Fo%20wdt%3AP31%20wd%3AQ8054.%0A%20%20%3Fo%20%3Fp%20%5B%5D.%0A%7D%20LIMIT%20100%0A))

```sparql
PREFIX wdt: <http://www.wikidata.org/prop/direct/>
SELECT DISTINCT ?p WHERE {
  ?o wdt:P31 wd:Q8054.
  ?o ?p [].
} LIMIT 100
```

which gives:

<!-- https://query.wikidata.org/bigdata/namespace/wdq/sparql -->
<table>
  <tr>
    <td><b>p</b></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/prop/direct/P352</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/prop/direct-normalized/P352</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/prop/direct/P361</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/prop/direct/P486</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/prop/direct-normalized/P486</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/prop/direct/P527</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/prop/direct/P638</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/prop/direct-normalized/P637</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/prop/direct/P637</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/prop/direct/P646</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/prop/direct/P682</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/prop/direct/P680</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/prop/direct/P681</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/prop/direct/P692</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/prop/direct/P702</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/prop/direct/P703</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/prop/direct/P705</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/prop/direct/P2892</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/prop/direct/P2888</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/prop/direct/P6366</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/prop/direct/P10283</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/prop/P31</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/prop/direct/P31</td>
  </tr>
  <tr><td colspan="2">This table is truncated. See the full table at <a href="sparql/wikidataProteinProperties.code.html">sparql/wikidataProteinProperties.rq</a></td></tr>
</table>

Actually, this query has a limit to 100 as it times out otherwise. The Wikidata model is complicated.
