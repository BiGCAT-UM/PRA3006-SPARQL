# ChEMBL

ChEMBL is a manually curated database of bioactive molecules with drug-like properties.
It brings together chemical, bioactivity and genomic data to aid the translation of
genomic information into effective new drugs. Built upon the ChEMBL database, an RDF
representation of the ChEMBL database is produced by the European Molecular Biology
Laboratory - European Bioinformatics Institute (EMBL-EBI) and provided for
[download](https://www.ebi.ac.uk/rdf/services/sparql). The ChEMBL RDF model uses a
basic internal ontology, called the ChEMBL Core Ontology (CCO), to identify all of
the primary entities (e.g., Documents, Assays, Substances, Targets) in the
ChEMBL database. The Department of Bioinformatics (BiGCaT) at Maastricht University
took the initiative to host the RDF and expose it to the scientific community through
a SPARQL endpoint where queries can be executed against the RDF to find answers to
biological questions. The tool is available through https://chemblmirror.rdf.bigcat-bioinformatics.org/.

## Entities

The main classes are:

* Protein 
* Drug / drug-like compound

## Data model

![Graphical representation of RDF schema](chembl_18_rdf_summary.png "ChEMBL RDF")

## Exercises

The simplest SPARQL queries to explore RDF is to retrieve full lists of subjects of a
particular type, which is frequently defined with the predicate rdfs:type or "a" which
can be used interchangably. The type itself can be part of a hierarchy and then we can
specify the type of a particular subclass using the predicate `rdfs:subClassOf`. See
the below example of listing all molecules in the ChEMBL RDF where the molecule type is
a subclass of the `cco:Substance` class.

```sparql
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX owl: <http://www.w3.org/2002/07/owl#>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX dcterms: <http://purl.org/dc/terms/>
PREFIX dbpedia2: <http://dbpedia.org/property/>
PREFIX dbpedia: <http://dbpedia.org/>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX skos: <http://www.w3.org/2004/02/skos/core#>

PREFIX cco: <http://rdf.ebi.ac.uk/terms/chembl#>
SELECT ?molecule
WHERE {
  ?molecule a ?type .
  ?type rdfs:subClassOf* cco:Substance .
} limit 20
```


### ChEMBL sources

```sparql
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX owl: <http://www.w3.org/2002/07/owl#>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX dcterms: <http://purl.org/dc/terms/>
PREFIX dbpedia2: <http://dbpedia.org/property/>
PREFIX dbpedia: <http://dbpedia.org/>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX skos: <http://www.w3.org/2004/02/skos/core#>

PREFIX cco: <http://rdf.ebi.ac.uk/terms/chembl#>
SELECT ?Source
   WHERE {
   ?Source ?p cco:Source .
} LIMIT 100
```

### Counting assays

This query gets the count of the assays used to measure the activity of the molecule with ID (CHEMBL294873):

```sparql
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX owl: <http://www.w3.org/2002/07/owl#>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX dcterms: <http://purl.org/dc/terms/>
PREFIX dbpedia2: <http://dbpedia.org/property/>
PREFIX dbpedia: <http://dbpedia.org/>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX skos: <http://www.w3.org/2004/02/skos/core#>
PREFIX cco: <http://rdf.ebi.ac.uk/terms/chembl#>
PREFIX chembl_molecule: <http://rdf.ebi.ac.uk/resource/chembl/molecule/>

SELECT (count(?assay) as ?assayCount)
WHERE {

  ?activity a cco:Activity ;
		cco:hasMolecule chembl_molecule:CHEMBL294873 ;
		cco:hasAssay ?assay .

  ?assay cco:hasSource ?source .
}
```

### Binding affinities

To get all assay, binding affinity type (Kd, Ki, IC50) and affinity value for all compounds
targeting Thrombin protein (CHEMBL204):

```sparql
PREFIX chembl: <http://rdf.ebi.ac.uk/terms/chembl#>
PREFIX cco: <http://rdf.ebi.ac.uk/terms/chembl#>
PREFIX chembl_molecule: <http://rdf.ebi.ac.uk/resource/chembl/molecule/>
PREFIX chembl_target: <http://rdf.ebi.ac.uk/resource/chembl/target/>

SELECT distinct ?assayLabel ?assayType ?molLabel ?bindingAffinityType ?value WHERE {

  ?assay  chembl:hasTarget chembl_target:CHEMBL204.
  
  ?activity chembl:hasAssay  ?assay.
  ?assay cco:assayType ?assayType.
  ?activity chembl:hasMolecule ?molecule .

  chembl_target:CHEMBL204 rdfs:label ?targetLabel.
  ?molecule rdfs:label ?molLabel.
  ?assay  rdfs:label ?assayLabel.
  
  VALUES ?bindingAffinityType {"Kd" "Ki" "IC50"}
  ?activity chembl:type ?bindingAffinityType.
  ?activity chembl:standardValue ?value.

} limit 100
```

The above query get assays and molecules information along with binding affinity type and value limited ti the top 100 entry.

### Assays and UniProt IDs


To list all assays, target names and UniProt IDs for the drug Paracetamol (CHEBI:46195):

```sparql
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX owl: <http://www.w3.org/2002/07/owl#>
PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>
PREFIX dc: <http://purl.org/dc/elements/1.1/>
PREFIX dcterms: <http://purl.org/dc/terms/>
PREFIX dbpedia2: <http://dbpedia.org/property/>
PREFIX dbpedia: <http://dbpedia.org/>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
PREFIX skos: <http://www.w3.org/2004/02/skos/core#>

PREFIX cco: <http://rdf.ebi.ac.uk/terms/chembl#>
PREFIX chembl_molecule: <http://rdf.ebi.ac.uk/resource/chembl/molecule/>
SELECT ?activityLabel ?assayType ?targetLabel ?uniprot
WHERE {

  ?activity a cco:Activity ;
		rdfs:label ?activityLabel;
		cco:hasMolecule chembl_molecule:CHEMBL46195 ;
		cco:hasAssay ?assay .

  ?assay cco:assayType ?assayType.
  ?assay cco:hasTarget ?target .
  
  ?target rdfs:label ?targetLabel.
  ?target cco:hasTargetComponent ?targetcmpt .
  ?targetcmpt cco:targetCmptXref ?uniprot .
  ?uniprot a cco:UniprotRef
}
```

The above query will get assay types, target and UniProt identifier for all the proteins tested fo binding with a single molecule (chembl_molecule:CHEMBL46195).

- CHEMBL2094079
- CHEMBL334894
- CHEMBL62704
- CHEMBL553740
- CHEMBL108214
- CHEMBL33384
