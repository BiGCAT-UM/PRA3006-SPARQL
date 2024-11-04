# ChEMBL

| **Website** | [https://www.ebi.ac.uk/chembl/](https://www.ebi.ac.uk/chembl/) |
| **SPARQL endpoint** | [https://chemblmirror.rdf.bigcat-bioinformatics.org/sparql/](https://chemblmirror.rdf.bigcat-bioinformatics.org/sparql/) |
| **License** | [CC BY-SA 3.0](https://creativecommons.org/licenses/by-sa/3.0/) |

<topic>ChEMBL</topic> is a manually curated database of bioactive
molecules with drug-like properties [<cite>Q27144224</cite>,<cite>Q27062334</cite>].
It brings together chemical, bioactivity and genomic data to aid the translation of
genomic information into effective new drugs. Built upon the ChEMBL database, an RDF
representation of the ChEMBL database is produced by the European Molecular Biology
Laboratory - European Bioinformatics Institute (EMBL-EBI) and provided for
[download](https://www.ebi.ac.uk/rdf/services/sparql). The ChEMBL RDF model uses a
basic internal ontology, called the <topic>ChEMBL Core Ontology</topic> (CCO), to identify all of
the primary entities (e.g., Documents, Assays, Substances, Targets) in the
ChEMBL database.

The Department of Bioinformatics (BiGCaT) at Maastricht University
took the initiative to host the RDF and expose it to the scientific community through
a SPARQL endpoint where queries can be executed against the RDF to find answers to
biological questions. The tool is available through https://chemblmirror.rdf.bigcat-bioinformatics.org/.

## Entities

The main classes are:

* Protein: <topic>protein</topic> targets
* Metabolite: ligand, e.g. <topic>drug</topic> / drug-like compound
* Assay: measures some property of, for example, the protein-ligand binding
* Document: source of the data or knowledge

## Data model

![Graphical representation of RDF schema](images/chembl_18_rdf_summary.png "ChEMBL RDF")

## Exercises

The simplest SPARQL queries to explore RDF is to retrieve full lists of subjects of a
particular type, which is frequently defined with the predicate `rdfs:type` or "a" which
can be used interchangably. The type itself can be part of a hierarchy and then we can
specify the type of a particular subclass using the predicate `rdfs:subClassOf`. See
the below example of listing all molecules in the ChEMBL RDF where the molecule type is
a subclass of the `cco:Substance` class.

<sparql>substances</sparql>


### ChEMBL sources

<sparql>chemblSources</sparql>

### Counting assays

This query gets the count of the assays used to measure the activity of the molecule with ID (CHEMBL294873):

<sparql>countingChEMBLAssays</sparql>

### Binding affinities

To get all assay, <topic>binding affinity</topic> type (Kd, Ki, IC50) and affinity value for all compounds
targeting Thrombin protein (`CHEMBL204`):

<sparql>bindingAffinities</sparql>

The above query get assays and molecules information along with binding affinity type and value limited ti the top 100 entry.

### Assays and UniProt IDs

To list all assays, target names and UniProt IDs for the drug Paracetamol (`CHEBI:46195`):

<sparql>paracetamol</sparql>

The above query will get assay types, target and UniProt identifier for all the proteins tested fo binding with a single molecule (chembl_molecule:CHEMBL46195):

<out>paracetamol</out>

## References

<references/>
