# pathwayWP4846.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?pathwaytitle WHERE{
    ?pathway a wp:Pathway .
    ?pathway dc:title ?pathwaytitle .
    ?pathway dcterms:identifier "WP4868"^^xsd:string .
}
```
[Run](https://sparql.wikipathways.org/sparql/?query=SELECT%20%3Fpathwaytitle%20WHERE%7B%0A%20%20%20%20%3Fpathway%20a%20wp%3APathway%20.%0A%20%20%20%20%3Fpathway%20dc%3Atitle%20%3Fpathwaytitle%20.%0A%20%20%20%20%3Fpathway%20dcterms%3Aidentifier%20%22WP4868%22%5E%5Exsd%3Astring%20.%0A%7D%0A) or [Edit](https://sparql.wikipathways.org/?q=SELECT%20%3Fpathwaytitle%20WHERE%7B%0A%20%20%20%20%3Fpathway%20a%20wp%3APathway%20.%0A%20%20%20%20%3Fpathway%20dc%3Atitle%20%3Fpathwaytitle%20.%0A%20%20%20%20%3Fpathway%20dcterms%3Aidentifier%20%22WP4868%22%5E%5Exsd%3Astring%20.%0A%7D%0A)


### Output
<!-- https://sparql.wikipathways.org/sparql -->
<table>
  <tr>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o pathwayWP4846.rq https://raw.githubusercontent.com/BiGCAT-UM/PRA3006-SPARQL/master/sparql/pathwayWP4846.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@pathwayWP4846.rq
```
This SPARQL query is available under CCZero.
