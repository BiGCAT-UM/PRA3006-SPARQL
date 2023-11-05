# paracetamol.rq
| **Database** | ChEMBL |
| **SPARQl endpoint** | [https://chemblmirror.rdf.bigcat-bioinformatics.org/sparql](https://chemblmirror.rdf.bigcat-bioinformatics.org/sparql) |
| **License** | CC-BY-SA 3.0 Unported |
**Code examples:** [curl](#curl)
### SPARQL
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
SELECT ?activity ?activityLabel ?assayType ?target ?targetLabel ?uniprot
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
[Run](https://chemblmirror.rdf.bigcat-bioinformatics.org/sparql/?query=PREFIX%20rdf%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F1999%2F02%2F22-rdf-syntax-ns%23%3E%0APREFIX%20rdfs%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F2000%2F01%2Frdf-schema%23%3E%0APREFIX%20owl%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F2002%2F07%2Fowl%23%3E%0APREFIX%20xsd%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F2001%2FXMLSchema%23%3E%0APREFIX%20dc%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0APREFIX%20dcterms%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0APREFIX%20dbpedia2%3A%20%3Chttp%3A%2F%2Fdbpedia.org%2Fproperty%2F%3E%0APREFIX%20dbpedia%3A%20%3Chttp%3A%2F%2Fdbpedia.org%2F%3E%0APREFIX%20foaf%3A%20%3Chttp%3A%2F%2Fxmlns.com%2Ffoaf%2F0.1%2F%3E%0APREFIX%20skos%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F2004%2F02%2Fskos%2Fcore%23%3E%0A%0APREFIX%20cco%3A%20%3Chttp%3A%2F%2Frdf.ebi.ac.uk%2Fterms%2Fchembl%23%3E%0APREFIX%20chembl_molecule%3A%20%3Chttp%3A%2F%2Frdf.ebi.ac.uk%2Fresource%2Fchembl%2Fmolecule%2F%3E%0ASELECT%20%3Factivity%20%3FactivityLabel%20%3FassayType%20%3Ftarget%20%3FtargetLabel%20%3Funiprot%0AWHERE%20%7B%0A%0A%20%20%3Factivity%20a%20cco%3AActivity%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20rdfs%3Alabel%20%3FactivityLabel%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20cco%3AhasMolecule%20chembl_molecule%3ACHEMBL46195%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20cco%3AhasAssay%20%3Fassay%20.%0A%0A%20%20%3Fassay%20cco%3AassayType%20%3FassayType.%0A%20%20%3Fassay%20cco%3AhasTarget%20%3Ftarget%20.%0A%20%20%0A%20%20%3Ftarget%20rdfs%3Alabel%20%3FtargetLabel.%0A%20%20%3Ftarget%20cco%3AhasTargetComponent%20%3Ftargetcmpt%20.%0A%20%20%3Ftargetcmpt%20cco%3AtargetCmptXref%20%3Funiprot%20.%0A%20%20%3Funiprot%20a%20cco%3AUniprotRef%0A%7D%0A) or [Edit](https://chemblmirror.rdf.bigcat-bioinformatics.org/?q=PREFIX%20rdf%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F1999%2F02%2F22-rdf-syntax-ns%23%3E%0APREFIX%20rdfs%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F2000%2F01%2Frdf-schema%23%3E%0APREFIX%20owl%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F2002%2F07%2Fowl%23%3E%0APREFIX%20xsd%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F2001%2FXMLSchema%23%3E%0APREFIX%20dc%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0APREFIX%20dcterms%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0APREFIX%20dbpedia2%3A%20%3Chttp%3A%2F%2Fdbpedia.org%2Fproperty%2F%3E%0APREFIX%20dbpedia%3A%20%3Chttp%3A%2F%2Fdbpedia.org%2F%3E%0APREFIX%20foaf%3A%20%3Chttp%3A%2F%2Fxmlns.com%2Ffoaf%2F0.1%2F%3E%0APREFIX%20skos%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F2004%2F02%2Fskos%2Fcore%23%3E%0A%0APREFIX%20cco%3A%20%3Chttp%3A%2F%2Frdf.ebi.ac.uk%2Fterms%2Fchembl%23%3E%0APREFIX%20chembl_molecule%3A%20%3Chttp%3A%2F%2Frdf.ebi.ac.uk%2Fresource%2Fchembl%2Fmolecule%2F%3E%0ASELECT%20%3Factivity%20%3FactivityLabel%20%3FassayType%20%3Ftarget%20%3FtargetLabel%20%3Funiprot%0AWHERE%20%7B%0A%0A%20%20%3Factivity%20a%20cco%3AActivity%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20rdfs%3Alabel%20%3FactivityLabel%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20cco%3AhasMolecule%20chembl_molecule%3ACHEMBL46195%20%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20cco%3AhasAssay%20%3Fassay%20.%0A%0A%20%20%3Fassay%20cco%3AassayType%20%3FassayType.%0A%20%20%3Fassay%20cco%3AhasTarget%20%3Ftarget%20.%0A%20%20%0A%20%20%3Ftarget%20rdfs%3Alabel%20%3FtargetLabel.%0A%20%20%3Ftarget%20cco%3AhasTargetComponent%20%3Ftargetcmpt%20.%0A%20%20%3Ftargetcmpt%20cco%3AtargetCmptXref%20%3Funiprot%20.%0A%20%20%3Funiprot%20a%20cco%3AUniprotRef%0A%7D%0A)


### Output
<!-- https://chemblmirror.rdf.bigcat-bioinformatics.org/sparql -->
<table>
  <tr>
    <td><b>activity</b></td>
    <td><b>assayType</b></td>
    <td><b>target</b></td>
    <td><b>uniprot</b></td>
  </tr>
  <tr>
    <td><a href="http://rdf.ebi.ac.uk/resource/chembl/activity/CHEMBL_ACT_1293374">CHEMBL_ACT_1293374</a></td>
    <td>Binding</td>
    <td><a href="http://rdf.ebi.ac.uk/resource/chembl/target/CHEMBL1785">Endothelin receptor ET-B</a></td>
    <td>http://purl.uniprot.org/uniprot/P24530</td>
  </tr>
  <tr>
    <td><a href="http://rdf.ebi.ac.uk/resource/chembl/activity/CHEMBL_ACT_1293373">CHEMBL_ACT_1293373</a></td>
    <td>Binding</td>
    <td><a href="http://rdf.ebi.ac.uk/resource/chembl/target/CHEMBL252">Endothelin receptor ET-A</a></td>
    <td>http://purl.uniprot.org/uniprot/P25101</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o paracetamol.rq https://raw.githubusercontent.com/BiGCAT-UM/PRA3006-SPARQL/master/sparql/paracetamol.rq
curl -H "Accept: text/tab-separated-values" -G https://chemblmirror.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@paracetamol.rq
```
This SPARQL query is available under CCZero.
