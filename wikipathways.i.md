# WikiPathways

<topic>WikiPathways</topic> is a database with machine-readable models of <topic>biological process</topic>es for human
and multiple other species [<cite>Q21092742</cite>,<cite>Q102205677</cite>].
It comes with a SPARQL endpoint with a human-oriented interface at [sparql.wikipathways.org](https://sparql.wikipathways.org/) [<cite>Q26261238</cite>].

WikiPathways RDF has two parts. The first is the GPMLRDF which is an RDF representation of the Graphical Pathway Markup
Language (GPML) in which the biological pathways are stored in the database. The second is the WPRDF
which is the represented biological knowledge  [<cite>Q26261238</cite>,<cite>Q111656837</cite>].
This chapter focuses on the WPRDF only.

Figure of simplified RDF schema:

<img src="images/WP RDF simple schema.png">

## Entities

The RDF contains all pathways, their datanodes (genes, proteins, metabolites, etc.), author information, molecular descriptors,
and more. The main classes are:

* Pathway: a <topic>biological pathway</topic>
* GeneProduct: can be a <topic>gene</topic>, strand of <topic>RNA</topic>, and a <topic>protein</topic>.
* Rna: RNA, e.g. <topic>miRNA</topic>.
* Protein: a <topic>protein</topic>. Post-translational modifications can be indicated with *states*
* Metabolite: metabolites, ions, and other small molecules. It includes peptides.
* Interaction: can be a lot of things: translocation, inhibition, metabolic conversions (see [<cite>Q111656837</cite>]).

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

<sparql>lipidPathways</sparql>

This gives:

<out>lipidPathways</out>

### A federated SPARQL query

This final example adds an extra level of difficulty by linking the AOP-Wiki RDF with another database
through SPARQL (this is called a Federated SPARQL query). In this exercise we will explore the connection
between WikiPathways and <topic>AOP-Wiki</topic> (see [this chapter](aopwiki.i.md)). 

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

<references/>
