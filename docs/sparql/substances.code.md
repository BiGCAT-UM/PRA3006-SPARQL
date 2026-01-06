# substances.rq

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
SELECT ?molecule
WHERE {
  ?molecule a ?type .
  ?type rdfs:subClassOf* cco:Substance .
} limit 20
```

[Run](https://chemblmirror.rdf.bigcat-bioinformatics.org/sparql/?query=PREFIX%20rdf%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F1999%2F02%2F22-rdf-syntax-ns%23%3E%0APREFIX%20rdfs%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F2000%2F01%2Frdf-schema%23%3E%0APREFIX%20owl%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F2002%2F07%2Fowl%23%3E%0APREFIX%20xsd%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F2001%2FXMLSchema%23%3E%0APREFIX%20dc%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0APREFIX%20dcterms%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0APREFIX%20dbpedia2%3A%20%3Chttp%3A%2F%2Fdbpedia.org%2Fproperty%2F%3E%0APREFIX%20dbpedia%3A%20%3Chttp%3A%2F%2Fdbpedia.org%2F%3E%0APREFIX%20foaf%3A%20%3Chttp%3A%2F%2Fxmlns.com%2Ffoaf%2F0.1%2F%3E%0APREFIX%20skos%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F2004%2F02%2Fskos%2Fcore%23%3E%0A%0APREFIX%20cco%3A%20%3Chttp%3A%2F%2Frdf.ebi.ac.uk%2Fterms%2Fchembl%23%3E%0ASELECT%20%3Fmolecule%0AWHERE%20%7B%0A%20%20%3Fmolecule%20a%20%3Ftype%20.%0A%20%20%3Ftype%20rdfs%3AsubClassOf*%20cco%3ASubstance%20.%0A%7D%20limit%2020%0A) or [Edit](https://chemblmirror.rdf.bigcat-bioinformatics.org/?q=PREFIX%20rdf%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F1999%2F02%2F22-rdf-syntax-ns%23%3E%0APREFIX%20rdfs%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F2000%2F01%2Frdf-schema%23%3E%0APREFIX%20owl%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F2002%2F07%2Fowl%23%3E%0APREFIX%20xsd%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F2001%2FXMLSchema%23%3E%0APREFIX%20dc%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0APREFIX%20dcterms%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0APREFIX%20dbpedia2%3A%20%3Chttp%3A%2F%2Fdbpedia.org%2Fproperty%2F%3E%0APREFIX%20dbpedia%3A%20%3Chttp%3A%2F%2Fdbpedia.org%2F%3E%0APREFIX%20foaf%3A%20%3Chttp%3A%2F%2Fxmlns.com%2Ffoaf%2F0.1%2F%3E%0APREFIX%20skos%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F2004%2F02%2Fskos%2Fcore%23%3E%0A%0APREFIX%20cco%3A%20%3Chttp%3A%2F%2Frdf.ebi.ac.uk%2Fterms%2Fchembl%23%3E%0ASELECT%20%3Fmolecule%0AWHERE%20%7B%0A%20%20%3Fmolecule%20a%20%3Ftype%20.%0A%20%20%3Ftype%20rdfs%3AsubClassOf*%20cco%3ASubstance%20.%0A%7D%20limit%2020%0A)



### Output

<!-- https://chemblmirror.rdf.bigcat-bioinformatics.org/sparql -->
<table>
  <tr>
    <td><b>molecule</b></td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/molecule/CHEMBL286494</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/molecule/CHEMBL1201580</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/molecule/CHEMBL1201586</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/molecule/CHEMBL1201608</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/molecule/CHEMBL1201439</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/molecule/CHEMBL1201575</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/molecule/CHEMBL1201583</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/molecule/CHEMBL1201584</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/molecule/CHEMBL1201585</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/molecule/CHEMBL1201587</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/molecule/CHEMBL1201825</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/molecule/CHEMBL1201831</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/molecule/CHEMBL1201833</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/molecule/CHEMBL1201834</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/molecule/CHEMBL3137721</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/molecule/CHEMBL1743009</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/molecule/CHEMBL1743012</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/molecule/CHEMBL1743016</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/molecule/CHEMBL1743018</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/molecule/CHEMBL1743023</td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -o substances.rq https://raw.githubusercontent.com/BiGCAT-UM/PRA3006-SPARQL/master/sparql/substances.rq
curl -H "Accept: text/tab-separated-values" -G https://chemblmirror.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@substances.rq
```

This SPARQL query is available under CCZero.
