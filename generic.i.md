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

<out limit="10">rdfType-1</out>

And when we run this on WikiPathways, we get:

<out limit="10">rdfType-2</out>

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

<sparql>wikidataProteins</sparql>

which gives:

<out>wikidataProteins</out>

## Listing all properties of some class

Second, one you have identified a class of interest, then you want to see what properties
are used for that class. For proteins, you can do:

<sparql>wikidataProteinProperties</sparql>

which gives:

<out limit="25">wikidataProteinProperties</out>

Actually, this query has a limit to 100 as it times out otherwise. The Wikidata model is complicated.
