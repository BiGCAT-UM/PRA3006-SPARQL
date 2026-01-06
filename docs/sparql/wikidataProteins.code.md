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
    <td>http://www.wikidata.org/entity/Q24190</td>
    <td>Neurotrophin 3</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q25902</td>
    <td>chymosin</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q30530</td>
    <td>Histidine ammonia-lyase</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q58321</td>
    <td>protein kinase</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q63398</td>
    <td>Chromogranin B</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q74314</td>
    <td>titin</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q418781</td>
    <td>Catechol-O-methyltransferase</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q418896</td>
    <td>proopiomelanocortin</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q418934</td>
    <td>TNF superfamily member 11</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q419004</td>
    <td>Cannabinoid receptor 1</td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -o wikidataProteins.rq https://raw.githubusercontent.com/BiGCAT-UM/PRA3006-SPARQL/master/sparql/wikidataProteins.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@wikidataProteins.rq
```

This SPARQL query is available under CCZero.
