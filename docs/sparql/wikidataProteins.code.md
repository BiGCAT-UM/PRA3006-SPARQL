# wikidataProteins.rq
| **Database** | Wikidata |
| **SPARQl endpoint** | [https://query.wikidata.org/bigdata/namespace/wdq/sparql](https://query.wikidata.org/bigdata/namespace/wdq/sparql) |
| **License** | CCZero |
**Code examples:** [curl](#curl)
### SPARQL
```sparql
PREFIX wdt: <http://www.wikidata.org/prop/direct/>

SELECT * WHERE {
  ?o wdt:P31 wd:Q8054.
  ?o rdfs:label ?l.
  FILTER(LANG(?l)='en')
} LIMIT 10
```
[Run](https://query.wikidata.org/embed.html#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0A%0ASELECT%20*%20WHERE%20%7B%0A%20%20%3Fo%20wdt%3AP31%20wd%3AQ8054.%0A%20%20%3Fo%20rdfs%3Alabel%20%3Fl.%0A%20%20FILTER%28LANG%28%3Fl%29%3D%27en%27%29%0A%7D%20LIMIT%2010%0A) or [Edit](https://query.wikidata.org/#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0A%0ASELECT%20*%20WHERE%20%7B%0A%20%20%3Fo%20wdt%3AP31%20wd%3AQ8054.%0A%20%20%3Fo%20rdfs%3Alabel%20%3Fl.%0A%20%20FILTER%28LANG%28%3Fl%29%3D%27en%27%29%0A%7D%20LIMIT%2010%0A)


### Output
<!-- https://query.wikidata.org/bigdata/namespace/wdq/sparql -->
<table>
  <tr>
    <td><b>o</b></td>
    <td><b>l</b></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q409065</td>
    <td>Uroporphyrinogen decarboxylase</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q409106</td>
    <td>marker of proliferation Ki-67</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q409114</td>
    <td>Sex determining region Y</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q409166</td>
    <td>Coagulation factor II, thrombin</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q417867</td>
    <td>Galanin and GMAP prepropeptide</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q418097</td>
    <td>glucose-6-phosphate isomerase</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q418137</td>
    <td>Hypoxanthine phosphoribosyltransferase 1</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q418404</td>
    <td>C-C motif chemokine receptor 5</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q418732</td>
    <td>Proliferating cell nuclear antigen</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q24190</td>
    <td>Neurotrophin 3</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o wikidataProteins.rq https://raw.githubusercontent.com/BiGCAT-UM/PRA3006-SPARQL/master/sparql/wikidataProteins.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@wikidataProteins.rq
```
This SPARQL query is available under CCZero.
