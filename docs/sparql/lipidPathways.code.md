# lipidPathways.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
#Pathways describing the biology of oxygenated hydrocarbons (LMFA12)
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
[Execute](https://query.wikidata.org/embed.html#%23Pathways%20describing%20the%20biology%20of%20oxygenated%20hydrocarbons%20%28LMFA12%29%0APREFIX%20chebi%3A%20%3Chttp%3A%2F%2Fpurl.obolibrary.org%2Fobo%2Fchebi%2F%3E%0A%0ASELECT%20%3Flipid%20%3Fname%20%3Fformula%20%3Flmid%20%28GROUP_CONCAT%28%3Fwpid_%3Bseparator%3D%22%2C%20%22%29%20AS%20%3Fpathway%29%0AWHERE%20%7B%0A%20%20SERVICE%20%3Chttps%3A%2F%2Flipidmaps.org%2Fsparql%3E%20%7B%0A%20%20%20%20VALUES%20%3Fcategory%20%7B%20%3Chttps%3A%2F%2Fwww.lipidmaps.org%2Frdf%2Fcategory%2F112%3E%20%3Chttps%3A%2F%2Fwww.lipidmaps.org%2Frdf%2Fcategory%2F11200%3E%20%7D%20%0A%20%20%20%20%3Flipidmaps%20rdfs%3Alabel%20%3Fname%20%3B%0A%20%20%20%20%20%20rdfs%3AsubClassOf*%20%3Fcategory%20%3B%0A%20%20%20%20%20%20chebi%3Aformula%20%3Fformula%20.%0A%20%20%7D%0A%20%20BIND%20%28IRI%28CONCAT%28%22https%3A%2F%2Fidentifiers.org%2Flipidmaps%2F%22%2C%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20SUBSTR%28STR%28%3Flipidmaps%29%2C%2031%29%29%29%20AS%20%3Flmid%29%0A%20%20%3Flipid%20wp%3AbdbLipidMaps%20%3Flmid%20%3B%0A%20%20%20%20%20%20%20%20%20dcterms%3AisPartOf%20%3Fpathway%20.%0A%20%20%3Fpathway%20a%20wp%3APathway%20%3B%20dcterms%3Aidentifier%20%3Fwpid_%20.%0A%7D%0A) or [Edit](https://query.wikidata.org/#%23Pathways%20describing%20the%20biology%20of%20oxygenated%20hydrocarbons%20%28LMFA12%29%0APREFIX%20chebi%3A%20%3Chttp%3A%2F%2Fpurl.obolibrary.org%2Fobo%2Fchebi%2F%3E%0A%0ASELECT%20%3Flipid%20%3Fname%20%3Fformula%20%3Flmid%20%28GROUP_CONCAT%28%3Fwpid_%3Bseparator%3D%22%2C%20%22%29%20AS%20%3Fpathway%29%0AWHERE%20%7B%0A%20%20SERVICE%20%3Chttps%3A%2F%2Flipidmaps.org%2Fsparql%3E%20%7B%0A%20%20%20%20VALUES%20%3Fcategory%20%7B%20%3Chttps%3A%2F%2Fwww.lipidmaps.org%2Frdf%2Fcategory%2F112%3E%20%3Chttps%3A%2F%2Fwww.lipidmaps.org%2Frdf%2Fcategory%2F11200%3E%20%7D%20%0A%20%20%20%20%3Flipidmaps%20rdfs%3Alabel%20%3Fname%20%3B%0A%20%20%20%20%20%20rdfs%3AsubClassOf*%20%3Fcategory%20%3B%0A%20%20%20%20%20%20chebi%3Aformula%20%3Fformula%20.%0A%20%20%7D%0A%20%20BIND%20%28IRI%28CONCAT%28%22https%3A%2F%2Fidentifiers.org%2Flipidmaps%2F%22%2C%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20SUBSTR%28STR%28%3Flipidmaps%29%2C%2031%29%29%29%20AS%20%3Flmid%29%0A%20%20%3Flipid%20wp%3AbdbLipidMaps%20%3Flmid%20%3B%0A%20%20%20%20%20%20%20%20%20dcterms%3AisPartOf%20%3Fpathway%20.%0A%20%20%3Fpathway%20a%20wp%3APathway%20%3B%20dcterms%3Aidentifier%20%3Fwpid_%20.%0A%7D%0A)


### Output
<!-- https://sparql.wikipathways.org/sparql --><table>
  <tr>
    <td><b>lipid</b></td>
    <td><b>name</b></td>
    <td><b>formula</b></td>
    <td><b>lmid</b></td>
    <td><b>pathway</b></td>
  </tr>
  <tr>
    <td>https://identifiers.org/chebi/CHEBI:15347</td>
    <td>Propan-2-one </td>
    <td>C3H6O</td>
    <td>https://identifiers.org/lipidmaps/LMFA12000057</td>
    <td>WP5175, WP4742</td>
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
</table>
## Code examples
### curl
```shell
curl -o lipidPathways.rq https://raw.githubusercontent.com/egonw/SARS-CoV-2-Queries/master/sparql/lipidPathways.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@lipidPathways.rq
```
This SPARQL query is available under CCZero.
