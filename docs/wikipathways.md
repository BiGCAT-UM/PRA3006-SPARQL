# WikiPathways

<a name="tp1">WikiPathways</a> is a database with machine-readable models of <a name="tp2">biological process</a>es for human
and multiple other species [<a href="#citeref1">1</a>,<a href="#citeref2">2</a>].
It comes with a SPARQL endpoint with a human-oriented interface at [sparql.wikipathways.org](https://sparql.wikipathways.org/) [<a href="#citeref3">3</a>].

WikiPathways RDF has two parts. The first is the GPMLRDF which is an RDF representation of the Graphical Pathway Markup
Language (GPML) in which the biological pathways are stored in the database. The second is the WPRDF
which is the represented biological knowledge  [<a href="#citeref3">3</a>,<a href="#citeref4">4</a>].
This chapter focuses on the WPRDF only.

Figure of simplified RDF schema:

<img src="images/WP RDF simple schema.png">

## Entities

The RDF contains all pathways, their datanodes (genes, proteins, metabolites, etc.), author information, molecular descriptors,
and more. The main classes are:

* Pathway: a <a name="tp3">biological pathway</a>
* GeneProduct: can be a <a name="tp4">gene</a>, strand of <a name="tp5">RNA</a>, and a <a name="tp6">protein</a>.
* Rna: RNA, e.g. <a name="tp7">miRNA</a>.
* Protein: a <a name="tp8">protein</a>. Post-translational modifications can be indicated with *states*
* Metabolite: metabolites, ions, and other small molecules. It includes peptides.
* Interaction: can be a lot of things: translocation, inhibition, metabolic conversions (see [<a href="#citeref4">4</a>]).

In all cases, the specific meaning is not clearly defined. Each of the above types is roughly defined by the
database identifies linked to the entity. For example, a UniProt identifier linked to a GeneProduct
suggests the entity is actually a protein.

## Data model

Because the WikiPathways RDF contains many properties of all subjects (such as pathways), we can also directly request all
contents through the SPARQL query. For example, to extract the pathway title, we add `?pathway dc:title ?pathwaytitle`
to the SPARQL query and add `?pathwaytitle` in the `SELECT` list. The returned table upon running the query will get
wider, so you might need to scroll to the right to see it all. 

## Example queries

The simplest SPARQL queries to explore RDF is to retrieve full lists of subjects of a particular type, which is
frequently defined with the predicate `rdfs:type` or `a` which can be used interchangably. See the below example
of listing all pathways.

```sparql
SELECT ?pathway 
WHERE {
?pathway a wp:Pathway .
}
```

### Asking information for a specific pathway

With this exercise, the RDF will be explored a little more extensively. By combining statements in the RDF query,
we can link multiple subjects and filter for content that we want to get back from the service. Important: when
filtering for a literal (gene label, organism, etc.) the literal should have the following format: 
`"text"^^xsd:string`. For example, the next query returns the title for pathway with ID `WP4846`:

```sparql
SELECT ?pathwaytitle WHERE{
    ?pathway a wp:Pathway .
    ?pathway dc:title ?pathwaytitle .
    ?pathway dcterms:identifier "WP4868"^^xsd:string .
}
```


### A lipid pathway

For example, we can ask a list of pathways describing the biology of oxygenated hydrocarbons (`LMFA12`):

**SPARQL** [sparql/lipidPathways.rq](sparql/lipidPathways.code.html) ([run](https://sparql.wikipathways.org/sparq/?q=%23Pathways%20describing%20the%20biology%20of%20oxygenated%20hydrocarbons%20%28LMFA12%29%0APREFIX%20chebi%3A%20%3Chttp%3A%2F%2Fpurl.obolibrary.org%2Fobo%2Fchebi%2F%3E%0A%0ASELECT%20%3Flipid%20%3Fname%20%3Fformula%20%3Flmid%20%28GROUP_CONCAT%28%3Fwpid_%3Bseparator%3D%22%2C%20%22%29%20AS%20%3Fpathway%29%0AWHERE%20%7B%0A%20%20SERVICE%20%3Chttps%3A%2F%2Flipidmaps.org%2Fsparql%3E%20%7B%0A%20%20%20%20VALUES%20%3Fcategory%20%7B%20%3Chttps%3A%2F%2Fwww.lipidmaps.org%2Frdf%2Fcategory%2F112%3E%20%3Chttps%3A%2F%2Fwww.lipidmaps.org%2Frdf%2Fcategory%2F11200%3E%20%7D%20%0A%20%20%20%20%3Flipidmaps%20rdfs%3Alabel%20%3Fname%20%3B%0A%20%20%20%20%20%20rdfs%3AsubClassOf*%20%3Fcategory%20%3B%0A%20%20%20%20%20%20chebi%3Aformula%20%3Fformula%20.%0A%20%20%7D%0A%20%20BIND%20%28IRI%28CONCAT%28%22https%3A%2F%2Fidentifiers.org%2Flipidmaps%2F%22%2C%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20SUBSTR%28STR%28%3Flipidmaps%29%2C%2031%29%29%29%20AS%20%3Flmid%29%0A%20%20%3Flipid%20wp%3AbdbLipidMaps%20%3Flmid%20%3B%0A%20%20%20%20%20%20%20%20%20dcterms%3AisPartOf%20%3Fpathway%20.%0A%20%20%3Fpathway%20a%20wp%3APathway%20%3B%20dcterms%3Aidentifier%20%3Fwpid_%20.%0A%7D%0A), [edit](https://sparql.wikipathways.org/?q=%23Pathways%20describing%20the%20biology%20of%20oxygenated%20hydrocarbons%20%28LMFA12%29%0APREFIX%20chebi%3A%20%3Chttp%3A%2F%2Fpurl.obolibrary.org%2Fobo%2Fchebi%2F%3E%0A%0ASELECT%20%3Flipid%20%3Fname%20%3Fformula%20%3Flmid%20%28GROUP_CONCAT%28%3Fwpid_%3Bseparator%3D%22%2C%20%22%29%20AS%20%3Fpathway%29%0AWHERE%20%7B%0A%20%20SERVICE%20%3Chttps%3A%2F%2Flipidmaps.org%2Fsparql%3E%20%7B%0A%20%20%20%20VALUES%20%3Fcategory%20%7B%20%3Chttps%3A%2F%2Fwww.lipidmaps.org%2Frdf%2Fcategory%2F112%3E%20%3Chttps%3A%2F%2Fwww.lipidmaps.org%2Frdf%2Fcategory%2F11200%3E%20%7D%20%0A%20%20%20%20%3Flipidmaps%20rdfs%3Alabel%20%3Fname%20%3B%0A%20%20%20%20%20%20rdfs%3AsubClassOf*%20%3Fcategory%20%3B%0A%20%20%20%20%20%20chebi%3Aformula%20%3Fformula%20.%0A%20%20%7D%0A%20%20BIND%20%28IRI%28CONCAT%28%22https%3A%2F%2Fidentifiers.org%2Flipidmaps%2F%22%2C%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20SUBSTR%28STR%28%3Flipidmaps%29%2C%2031%29%29%29%20AS%20%3Flmid%29%0A%20%20%3Flipid%20wp%3AbdbLipidMaps%20%3Flmid%20%3B%0A%20%20%20%20%20%20%20%20%20dcterms%3AisPartOf%20%3Fpathway%20.%0A%20%20%3Fpathway%20a%20wp%3APathway%20%3B%20dcterms%3Aidentifier%20%3Fwpid_%20.%0A%7D%0A))

```sparql
PREFIX chebi: <http://purl.obolibrary.org/obo/chebi/>
SELECT ?lipid ?name ?formula ?lmid (GROUP_CONCAT(?wpid_;separator=", ") AS ?pathway)
WHERE {
  SERVICE <https://lipidmaps.org/sparql> {
    VALUES ?category { <https://www.lipidmaps.org/rdf/category/112> <https://www.lipidmaps.org/rdf/category/11200> } 
    ?lipidmaps rdfs:label ?name ;
      rdfs:subClassOf* ?category ;
      chebi:formula ?formula .
  }
  BIND (IRI(CONCAT("https://identifiers.org/lipidmaps/",
               SUBSTR(STR(?lipidmaps), 31))) AS ?lmid)
  ?lipid wp:bdbLipidMaps ?lmid ;
         dcterms:isPartOf ?pathway .
  ?pathway a wp:Pathway ; dcterms:identifier ?wpid_ .
}
```

This gives:

<!-- https://sparql.wikipathways.org/sparql -->
<table>
  <tr>
    <td><b>lipid</b></td>
    <td><b>name</b></td>
    <td><b>formula</b></td>
    <td><b>lmid</b></td>
    <td><b>pathway</b></td>
  </tr>
  <tr>
    <td>https://identifiers.org/chebi/CHEBI:28398</td>
    <td>Butan-2-one </td>
    <td>C4H8O</td>
    <td>https://identifiers.org/lipidmaps/LMFA12000043</td>
    <td>WP4838</td>
  </tr>
  <tr>
    <td>https://identifiers.org/kegg.compound/C00207</td>
    <td>Propan-2-one </td>
    <td>C3H6O</td>
    <td>https://identifiers.org/lipidmaps/LMFA12000057</td>
    <td>WP3602</td>
  </tr>
  <tr>
    <td>https://identifiers.org/chebi/CHEBI:15347</td>
    <td>Propan-2-one </td>
    <td>C3H6O</td>
    <td>https://identifiers.org/lipidmaps/LMFA12000057</td>
    <td>WP4742, WP5175</td>
  </tr>
</table>

### A federated SPARQL query

This final example adds an extra level of difficulty by linking the AOP-Wiki RDF with another database
through SPARQL (this is called a Federated SPARQL query). In this exercise we will explore the connection
between WikiPathways and <a name="tp9">AOP-Wiki</a> (see [this chapter](aopwiki.md)). 

<!-- To do this exercise, you might want to do
the [AOP-Wiki SPARQL endpoint tutorial](AOP-Wiki.md) first. -->

The SPARQL query will need to contain a `SERVICE` function and the final query will have the following structure:

```sparql
PREFIX aopo: <http://vocabularies.wikipathways.org/wp#>
SELECT [variables] WHERE {
  [query WikiPathways]
  SERVICE <https://aopwiki.rdf.bigcat-bioinformatics.org/sparql> {
    [query AOP-Wiki]
  }
}
```


## References

1. <a name="citeref1"></a>Pico AR, Kelder T, van Iersel MP, Hanspers K, Conklin BR, Evelo C. WikiPathways: pathway editing for the people. PLoS Biol. 2008 Jul 22;6(7):e184.  doi:[10.1371/JOURNAL.PBIO.0060184](https://doi.org/10.1371/JOURNAL.PBIO.0060184) ([Scholia](https://scholia.toolforge.org/doi/10.1371/JOURNAL.PBIO.0060184))
2. <a name="citeref2"></a>Martens M, Ammar A, Riutta A, Waagmeester A, Slenter D, Hanspers K, et al. WikiPathways: connecting communities. NAR [Internet]. 2021 Jan 8;49(D1):D613–21. Available from: https://academic.oup.com/nar/article/49/D1/D613/5992285 doi:[10.1093/NAR/GKAA1024](https://doi.org/10.1093/NAR/GKAA1024) ([Scholia](https://scholia.toolforge.org/doi/10.1093/NAR/GKAA1024))
3. <a name="citeref3"></a>Waagmeester A, Summer-Kutmon M, Riutta A, Miller R, Willighagen E, Evelo CT, et al. Using the Semantic Web for Rapid Integration of WikiPathways with Other Biological Online Data Resources. PLoS Comput Biol. 2016 Jun;12(6):e1004989.  doi:[10.1371/JOURNAL.PCBI.1004989](https://doi.org/10.1371/JOURNAL.PCBI.1004989) ([Scholia](https://scholia.toolforge.org/doi/10.1371/JOURNAL.PCBI.1004989))
4. <a name="citeref4"></a>Miller RA, Kutmon M, Bohler A, Waagmeester A, Evelo CT, Willighagen EL. Understanding signaling and metabolic paths using semantified and harmonized information about biological interactions. PLOS ONE. 2022 Apr 18;17(4):e0263057.  doi:[10.1371/JOURNAL.PONE.0263057](https://doi.org/10.1371/JOURNAL.PONE.0263057) ([Scholia](https://scholia.toolforge.org/doi/10.1371/JOURNAL.PONE.0263057))

