# WikiPathways

<topic>WikiPathways</topic> is a database with machine-readable models of <topic>biological process</topic>es for human
and multiple other species [<cite>Q21092742</cite>,<cite>Q102205677</cite>].
It comes with a SPARQL endpoint with a human-oriented interface at [sparql.wikipathways.org](https://sparql.wikipathways.org/) [<cite>Q26261238</cite>].

WikiPathways RDF has two parts. The first is the GPMLRDF which is an RDF representation of the Graphical Pathway Markup
Language (GPML) in which the biological pathways are stored in the database. The second is the WPRDF
which is the represented biological knowledge  [<cite>Q26261238</cite>,<cite>Q111656837</cite>].
This chapter focuses on the WPRDF only.

## Entities

* Pathway: a biological pathway
* GeneProduct: can be a gene, strand of RNA, and a protein.
* Rna: RNA, e.g. miRNA.
* Protein: a protein. Post-translational modifications can be indicated with *states*
* Metabolite: metabolites, ions, and other small molecules. It includes peptides.
* Interaction: can be a lot of things: translocation, inhibition, metabolic conversions (see [<cite>Q111656837</cite>]).

In all cases, the specific meaning is not clearly defined. Each of the above types is roughly defined by the
database identifies linked to the entity. For example, a UniProt identifier linked to a GeneProduct
suggests the entity is actually a protein.

## Data model



## Example queries

For example, we can ask a list of pathways describing the biology of oxygenated hydrocarbons (`LMFA12`):

<sparql>lipidPathways</sparql>

This gives:

<out>lipidPathways</out>

## References

<references/>
