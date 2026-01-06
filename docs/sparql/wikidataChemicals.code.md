# wikidataChemicals.rq

| **Database** | Wikidata |
| **SPARQl endpoint** | [https://query.wikidata.org/bigdata/namespace/wdq/sparql](https://query.wikidata.org/bigdata/namespace/wdq/sparql) |
| **License** | CCZero |

**Code examples:** [curl](#curl)

### SPARQL

```sparql
PREFIX wdt: <http://www.wikidata.org/prop/direct/>

SELECT * WHERE {
  ?o wdt:P31 wd:Q113145171 .
  ?o rdfs:label ?l.
  FILTER(LANG(?l)='en')
} LIMIT 50
```

[Run](https://query.wikidata.org/embed.html#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0A%0ASELECT%20*%20WHERE%20%7B%0A%20%20%3Fo%20wdt%3AP31%20wd%3AQ113145171%20.%0A%20%20%3Fo%20rdfs%3Alabel%20%3Fl.%0A%20%20FILTER%28LANG%28%3Fl%29%3D%27en%27%29%0A%7D%20LIMIT%2050%0A) or [Edit](https://query.wikidata.org/#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0A%0ASELECT%20*%20WHERE%20%7B%0A%20%20%3Fo%20wdt%3AP31%20wd%3AQ113145171%20.%0A%20%20%3Fo%20rdfs%3Alabel%20%3Fl.%0A%20%20FILTER%28LANG%28%3Fl%29%3D%27en%27%29%0A%7D%20LIMIT%2050%0A)



### Output

<!-- https://query.wikidata.org/bigdata/namespace/wdq/sparql -->
<table>
  <tr>
    <td><b>o</b></td>
    <td><b>l</b></td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q150808</td>
    <td>tetradecane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q150831</td>
    <td>pentadecane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q150843</td>
    <td>hexadecane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q116587</td>
    <td>diisononyl adipate</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q116907</td>
    <td>glutathione</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q117422</td>
    <td>glycol salicylate</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q118033</td>
    <td>cycloundecane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q118040</td>
    <td>cyclododecane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161507</td>
    <td>(1E)-1,3-dichloropropene</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161510</td>
    <td>1,3-indandione</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161514</td>
    <td>1,3-propanediol</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161515</td>
    <td>tetraxetan</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161516</td>
    <td>1,4-bis(2-methylstyryl)benzene</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161521</td>
    <td>1,4-butanediol</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161522</td>
    <td>1,4-dibromobutane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q52822</td>
    <td>2,3,7,8-tetrachlorodibenzo-p-dioxin</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q52858</td>
    <td>ethane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q50703</td>
    <td>cesium iodide</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q50980</td>
    <td>xanthine</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q52353</td>
    <td>benzyl alcohol</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q283</td>
    <td>water</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q153</td>
    <td>ethanol</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q150955</td>
    <td>heneicosane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q150968</td>
    <td>docosane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q150977</td>
    <td>tricosane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q150988</td>
    <td>tetracosane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q151007</td>
    <td>pentacosane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q151016</td>
    <td>hexacosane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q151446</td>
    <td>propyne</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q151733</td>
    <td>1-pentanol</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161597</td>
    <td>1-butyne</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161601</td>
    <td>1-chloro-1,1-difluoroethane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161607</td>
    <td>1-chloronaphthalene</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161608</td>
    <td>1-chlorobutane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161610</td>
    <td>1-chloropentane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q118551</td>
    <td>clarithromycin</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q118815</td>
    <td>cyclodecane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q119915</td>
    <td>hordenine</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161624</td>
    <td>1-fluoropropane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161632</td>
    <td>cetyl alcohol</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161637</td>
    <td>1-hexene</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161638</td>
    <td>1-hexyne</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161640</td>
    <td>propyl iodide</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161641</td>
    <td>1-hydroxybenzotriazole</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161642</td>
    <td>1-methyladenine</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q2314</td>
    <td>sodium chloride</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q2270</td>
    <td>benzene</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q151185</td>
    <td>hexatriacontane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q151192</td>
    <td>heptatriacontane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q151204</td>
    <td>octatriacontane</td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -o wikidataChemicals.rq https://raw.githubusercontent.com/BiGCAT-UM/PRA3006-SPARQL/master/sparql/wikidataChemicals.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@wikidataChemicals.rq
```

This SPARQL query is available under CCZero.
