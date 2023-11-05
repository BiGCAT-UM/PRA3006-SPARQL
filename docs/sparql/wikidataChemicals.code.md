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
    <td>http://www.wikidata.org/entity/Q153</td>
    <td>ethanol</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q150681</td>
    <td>octane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q150694</td>
    <td>nonane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q116073</td>
    <td>disilane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q116163</td>
    <td>ethyl sulfate</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q116269</td>
    <td>silicon dioxide</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q1997</td>
    <td>carbon dioxide</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161498</td>
    <td>1,3-propanediamine</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161503</td>
    <td>1,3-butadiene</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161505</td>
    <td>1,3-diiodopropane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161506</td>
    <td>trimethylene carbonate</td>
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
    <td>http://www.wikidata.org/entity/Q118551</td>
    <td>clarithromycin</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q118815</td>
    <td>cyclodecane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161557</td>
    <td>1,5-pentanediol</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161558</td>
    <td>1,6-dibromohexane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161559</td>
    <td>1,6-dichlorohexane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161560</td>
    <td>1,6-diiodohexane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161563</td>
    <td>1,6-hexanediol</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161564</td>
    <td>1,8-bis(dimethylamino)naphthalene</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q161572</td>
    <td>eucalyptol</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q2025</td>
    <td>carbon monoxide</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q283</td>
    <td>water</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q2270</td>
    <td>benzene</td>
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
    <td>http://www.wikidata.org/entity/Q150888</td>
    <td>heptadecane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q150900</td>
    <td>octadecane</td>
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
    <td>http://www.wikidata.org/entity/Q121802</td>
    <td>beta-sitosterol</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q121874</td>
    <td>potassium iodide</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q121881</td>
    <td>cobalt(III) oxide</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q122043</td>
    <td>keto-D-fructose</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57054</td>
    <td>i-urobilinogen</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q57055</td>
    <td>paracetamol</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q150717</td>
    <td>decane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q150731</td>
    <td>undecane</td>
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
    <td>http://www.wikidata.org/entity/Q151028</td>
    <td>heptacosane</td>
  </tr>
  <tr>
    <td>http://www.wikidata.org/entity/Q151038</td>
    <td>nonacosane</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o wikidataChemicals.rq https://raw.githubusercontent.com/BiGCAT-UM/PRA3006-SPARQL/master/sparql/wikidataChemicals.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@wikidataChemicals.rq
```
This SPARQL query is available under CCZero.
