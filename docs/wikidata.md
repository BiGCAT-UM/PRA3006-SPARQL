# Wikidata

<a name="tp1">Wikidata</a> is not a life sciences database, but a general database related to <a name="tp2">Wikipedia</a> [<a href="#citeref1">1</a>]. That said,
various research groups have started using Wikidata for the life sciences [<a href="#citeref2">2</a>,<a href="#citeref3">3</a>].

## Entities

The RDF contains all pathways, their datanodes (genes, proteins, metabolites, etc.), author information, molecular descriptors,
and more. The main classes are:

* Pathway: a <a name="tp3">biological pathway</a>
* GeneProduct: can be a <a name="tp4">gene</a>, strand of <a name="tp5">RNA</a>, and a <a name="tp6">protein</a>.
* Rna: RNA, e.g. <a name="tp7">miRNA</a>.
* Protein: a <a name="tp8">protein</a>. Post-translational modifications can be indicated with *states*
* Metabolite: metabolites, ions, and other small molecules. It includes peptides.


## Data model

...

## Example queries

### Proteins

We can list proteins with the following query:

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

### Chemicals

We can also list chemicals, with this query:

**SPARQL** [sparql/wikidataChemicals.rq](sparql/wikidataChemicals.code.html) ([run](https://query.wikidata.org/embed.html#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0A%0ASELECT%20*%20WHERE%20%7B%0A%20%20%3Fo%20wdt%3AP31%20wd%3AQ113145171%20.%0A%20%20%3Fo%20rdfs%3Alabel%20%3Fl.%0A%20%20FILTER%28LANG%28%3Fl%29%3D%27en%27%29%0A%7D%20LIMIT%2050%0A), [edit](https://query.wikidata.org/#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0A%0ASELECT%20*%20WHERE%20%7B%0A%20%20%3Fo%20wdt%3AP31%20wd%3AQ113145171%20.%0A%20%20%3Fo%20rdfs%3Alabel%20%3Fl.%0A%20%20FILTER%28LANG%28%3Fl%29%3D%27en%27%29%0A%7D%20LIMIT%2050%0A))

```sparql
PREFIX wdt: <http://www.wikidata.org/prop/direct/>
SELECT * WHERE {
  ?o wdt:P31 wd:Q113145171 .
  ?o rdfs:label ?l.
  FILTER(LANG(?l)='en')
} LIMIT 50
```

which gives:

<!-- https://query.wikidata.org/bigdata/namespace/wdq/sparql -->
<table>
  <tr>
    <td><b>o</b></td>
    <td><b>l</b></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q153</td>
    <td>ethanol</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q50703</td>
    <td>cesium iodide</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q50980</td>
    <td>xanthine</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q52353</td>
    <td>benzyl alcohol</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q150681</td>
    <td>octane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q150694</td>
    <td>nonane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q150717</td>
    <td>decane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q150731</td>
    <td>undecane</td>
  </tr>
  <tr><td colspan="2">This table is truncated. See the full table at <a href="sparql/wikidataChemicals.code.html">sparql/wikidataChemicals.rq</a></td></tr>
</table>

## References

1. <a name="citeref1"></a>Vrandečić D, Pintscher L, Krötzsch M. Wikidata: The Making Of. WWW ’23 Companion: Companion Proceedings of the ACM Web Conference 2023 [Internet]. 2023 Apr 30; Available from: https://dl.acm.org/doi/10.1145/3543873.3585579 doi:[10.1145/3543873.3585579](https://doi.org/10.1145/3543873.3585579) ([Scholia](https://scholia.toolforge.org/doi/10.1145/3543873.3585579))
2. <a name="citeref2"></a>Waagmeester A, Stupp G, Burgstaller-Muehlbacher S, Good BM, Griffith M, Griffith O, et al. Wikidata as a knowledge graph for the life sciences. eLife [Internet]. 2020 Mar 17;9. Available from: https://elifesciences.org/articles/52614 doi:[10.7554/ELIFE.52614](https://doi.org/10.7554/ELIFE.52614) ([Scholia](https://scholia.toolforge.org/doi/10.7554/ELIFE.52614))
3. <a name="citeref3"></a>Waagmeester A, Willighagen EL, Su AI, Kutmon M, Gayo JEL, Fernández-Álvarez D, et al. A protocol for adding knowledge to Wikidata: aligning resources on human coronaviruses. BMC Biol [Internet]. 2021 Jan 22;19(1):12. Available from: https://bmcbiol.biomedcentral.com/track/pdf/10.1186/s12915-020-00940-y.pdf doi:[10.1186/S12915-020-00940-Y](https://doi.org/10.1186/S12915-020-00940-Y) ([Scholia](https://scholia.toolforge.org/doi/10.1186/S12915-020-00940-Y))

