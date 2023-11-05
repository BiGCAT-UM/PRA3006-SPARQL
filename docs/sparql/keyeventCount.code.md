# keyeventCount.rq
| **Database** | AOP-Wiki |
| **SPARQl endpoint** | [https://aopwiki.rdf.bigcat-bioinformatics.org/sparql](https://aopwiki.rdf.bigcat-bioinformatics.org/sparql) |
| **License** | Ask Marvin |
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT (count (?KE) as ?nKE) 
WHERE {
  ?KE a aopo:KeyEvent .
}
```
[Run](https://aopwiki.rdf.bigcat-bioinformatics.org/sparql/?query=SELECT%20%28count%20%28%3FKE%29%20as%20%3FnKE%29%20%0AWHERE%20%7B%0A%20%20%3FKE%20a%20aopo%3AKeyEvent%20.%0A%7D%0A) or [Edit](https://aopwiki.rdf.bigcat-bioinformatics.org/?q=SELECT%20%28count%20%28%3FKE%29%20as%20%3FnKE%29%20%0AWHERE%20%7B%0A%20%20%3FKE%20a%20aopo%3AKeyEvent%20.%0A%7D%0A)


### Output
<!-- https://aopwiki.rdf.bigcat-bioinformatics.org/sparql -->
<table>
  <tr>
    <td><b>nKE</b></td>
  </tr>
  <tr>
    <td>1371</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o keyeventCount.rq https://raw.githubusercontent.com/BiGCAT-UM/PRA3006-SPARQL/master/sparql/keyeventCount.rq
curl -H "Accept: text/tab-separated-values" -G https://aopwiki.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@keyeventCount.rq
```
This SPARQL query is available under CCZero.
