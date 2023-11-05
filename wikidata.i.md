# Wikidata

| **License** | [CCZero](https://creativecommons.org/public-domain/cc0/) |

<topic>Wikidata</topic> is not a life sciences database, but a general database related to <topic>Wikipedia</topic> [<cite>Q118130164</cite>]. That said,
various research groups have started using Wikidata for the life sciences [<cite>Q87830400</cite>,<cite>Q105037759</cite>]. For example, CAS registry
numbers in Wikidata and Wikipedia have been validated against the Common Chemistry database [<cite>Q111987319</cite>], and Wikidata has been used to make
chemicals in taxon available in the LOTUS project [<cite>Q112143478</cite>].

## Entities

The RDF contains all pathways, their datanodes (genes, proteins, metabolites, etc.), author information, molecular descriptors,
and more. The main classes are:

* Pathway: a <topic>biological pathway</topic>
* GeneProduct: can be a <topic>gene</topic>, strand of <topic>RNA</topic>, and a <topic>protein</topic>.
* Rna: RNA, e.g. <topic>miRNA</topic>.
* Protein: a <topic>protein</topic>. Post-translational modifications can be indicated with *states*
* Metabolite: metabolites, ions, and other small molecules. It includes peptides.


## Data model

...

## Example queries

### Proteins

We can list proteins with the following query:

<sparql>wikidataProteins</sparql>

which gives:

<out>wikidataProteins</out>

### Chemicals

We can also list chemicals, with this query:

<sparql>wikidataChemicals</sparql>

which gives:

<out limit="10">wikidataChemicals</out>

## References

<references/>
