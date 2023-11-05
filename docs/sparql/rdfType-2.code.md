# rdfType-2.rq

| **Database** | WikiPathways |
| **SPARQl endpoint** | [https://sparql.wikipathways.org/sparql](https://sparql.wikipathways.org/sparql) |
| **License** | CCZero |

**Code examples:** [curl](#curl)

### SPARQL

```sparql
SELECT DISTINCT ?type WHERE {
  [] a ?type .
}
```

[Run](https://sparql.wikipathways.org/sparql/?query=SELECT%20DISTINCT%20%3Ftype%20WHERE%20%7B%0A%20%20%5B%5D%20a%20%3Ftype%20.%0A%7D%0A) or [Edit](https://sparql.wikipathways.org/?q=SELECT%20DISTINCT%20%3Ftype%20WHERE%20%7B%0A%20%20%5B%5D%20a%20%3Ftype%20.%0A%7D%0A)



### Output

<!-- https://sparql.wikipathways.org/sparql -->
<table>
  <tr>
    <td><b>type</b></td>
  </tr>
  <tr>
    <td>http://www.openlinksw.com/schemas/virtrdf#QuadMapFormat</td>
  </tr>
  <tr>
    <td>http://www.openlinksw.com/schemas/virtrdf#QuadStorage</td>
  </tr>
  <tr>
    <td>http://www.openlinksw.com/schemas/virtrdf#array-of-QuadMapFormat</td>
  </tr>
  <tr>
    <td>http://www.openlinksw.com/schemas/virtrdf#QuadMap</td>
  </tr>
  <tr>
    <td>http://www.openlinksw.com/schemas/virtrdf#QuadMapValue</td>
  </tr>
  <tr>
    <td>http://www.openlinksw.com/schemas/virtrdf#array-of-QuadMapColumn</td>
  </tr>
  <tr>
    <td>http://www.openlinksw.com/schemas/virtrdf#QuadMapColumn</td>
  </tr>
  <tr>
    <td>http://www.openlinksw.com/schemas/virtrdf#array-of-QuadMapATable</td>
  </tr>
  <tr>
    <td>http://www.openlinksw.com/schemas/virtrdf#QuadMapATable</td>
  </tr>
  <tr>
    <td>http://www.openlinksw.com/schemas/virtrdf#QuadMapFText</td>
  </tr>
  <tr>
    <td>http://www.openlinksw.com/schemas/virtrdf#array-of-string</td>
  </tr>
  <tr>
    <td>http://www.openlinksw.com/schemas/virtrdf#array-of-QuadMap</td>
  </tr>
  <tr>
    <td>http://www.w3.org/2002/07/owl#Class</td>
  </tr>
  <tr>
    <td>http://www.w3.org/2002/07/owl#Ontology</td>
  </tr>
  <tr>
    <td>http://www.w3.org/2002/07/owl#AnnotationProperty</td>
  </tr>
  <tr>
    <td>http://www.w3.org/2002/07/owl#Restriction</td>
  </tr>
  <tr>
    <td>http://www.w3.org/2002/07/owl#ObjectProperty</td>
  </tr>
  <tr>
    <td>http://www.w3.org/2002/07/owl#DatatypeProperty</td>
  </tr>
  <tr>
    <td>http://www.w3.org/ns/sparql-service-description#Service</td>
  </tr>
  <tr>
    <td>http://www.w3.org/2004/02/skos/core#Collection</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/gpml#Anchor</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/gpml#Comment</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/gpml#DataNode</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/gpml#GraphicalLine</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/gpml#Group</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/gpml#InfoBox</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/gpml#Interaction</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/gpml#Label</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/gpml#Point</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/gpml#PublicationXref</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/gpml#State</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/gpml#shape</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/wp#Binding</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/wp#Catalysis</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/wp#Complex</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/wp#ComplexBinding</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/wp#Conversion</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/wp#DataNode</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/wp#DirectedInteraction</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/wp#GeneProduct</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/wp#Inhibition</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/wp#Interaction</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/wp#Metabolite</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/wp#Pathway</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/wp#Protein</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/wp#PublicationReference</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/wp#Rna</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/wp#Stimulation</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/wp#TranscriptionTranslation</td>
  </tr>
  <tr>
    <td>http://xmlns.com/foaf/0.1/Image</td>
  </tr>
  <tr>
    <td>http://rdfs.org/ns/void#Dataset</td>
  </tr>
  <tr>
    <td>http://www.w3.org/ns/dcat#Distribution</td>
  </tr>
  <tr>
    <td>http://rdfs.org/ns/void#DatasetDescription</td>
  </tr>
  <tr>
    <td>http://rdfs.org/ns/void#Linkset</td>
  </tr>
  <tr>
    <td>http://www.w3.org/2002/07/owl#Axiom</td>
  </tr>
  <tr>
    <td>http://www.w3.org/2004/02/skos/core#ConceptScheme</td>
  </tr>
  <tr>
    <td>http://vocabularies.wikipathways.org/wp#Translocation</td>
  </tr>
  <tr>
    <td>http://xmlns.com/foaf/0.1/Person</td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -o rdfType-2.rq https://raw.githubusercontent.com/BiGCAT-UM/PRA3006-SPARQL/master/sparql/rdfType-2.rq
curl -H "Accept: text/tab-separated-values" -G https://sparql.wikipathways.org/sparql --data-urlencode query@rdfType-2.rq
```

This SPARQL query is available under CCZero.
