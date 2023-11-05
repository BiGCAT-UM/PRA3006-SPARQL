# chemblSources.rq

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
SELECT ?Source
   WHERE {
   ?Source ?p cco:Source .
} LIMIT 100
```

[Run](https://chemblmirror.rdf.bigcat-bioinformatics.org/sparql/?query=PREFIX%20rdf%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F1999%2F02%2F22-rdf-syntax-ns%23%3E%0APREFIX%20rdfs%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F2000%2F01%2Frdf-schema%23%3E%0APREFIX%20owl%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F2002%2F07%2Fowl%23%3E%0APREFIX%20xsd%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F2001%2FXMLSchema%23%3E%0APREFIX%20dc%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0APREFIX%20dcterms%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0APREFIX%20dbpedia2%3A%20%3Chttp%3A%2F%2Fdbpedia.org%2Fproperty%2F%3E%0APREFIX%20dbpedia%3A%20%3Chttp%3A%2F%2Fdbpedia.org%2F%3E%0APREFIX%20foaf%3A%20%3Chttp%3A%2F%2Fxmlns.com%2Ffoaf%2F0.1%2F%3E%0APREFIX%20skos%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F2004%2F02%2Fskos%2Fcore%23%3E%0A%0APREFIX%20cco%3A%20%3Chttp%3A%2F%2Frdf.ebi.ac.uk%2Fterms%2Fchembl%23%3E%0ASELECT%20%3FSource%0A%20%20%20WHERE%20%7B%0A%20%20%20%3FSource%20%3Fp%20cco%3ASource%20.%0A%7D%20LIMIT%20100%0A) or [Edit](https://chemblmirror.rdf.bigcat-bioinformatics.org/?q=PREFIX%20rdf%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F1999%2F02%2F22-rdf-syntax-ns%23%3E%0APREFIX%20rdfs%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F2000%2F01%2Frdf-schema%23%3E%0APREFIX%20owl%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F2002%2F07%2Fowl%23%3E%0APREFIX%20xsd%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F2001%2FXMLSchema%23%3E%0APREFIX%20dc%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Felements%2F1.1%2F%3E%0APREFIX%20dcterms%3A%20%3Chttp%3A%2F%2Fpurl.org%2Fdc%2Fterms%2F%3E%0APREFIX%20dbpedia2%3A%20%3Chttp%3A%2F%2Fdbpedia.org%2Fproperty%2F%3E%0APREFIX%20dbpedia%3A%20%3Chttp%3A%2F%2Fdbpedia.org%2F%3E%0APREFIX%20foaf%3A%20%3Chttp%3A%2F%2Fxmlns.com%2Ffoaf%2F0.1%2F%3E%0APREFIX%20skos%3A%20%3Chttp%3A%2F%2Fwww.w3.org%2F2004%2F02%2Fskos%2Fcore%23%3E%0A%0APREFIX%20cco%3A%20%3Chttp%3A%2F%2Frdf.ebi.ac.uk%2Fterms%2Fchembl%23%3E%0ASELECT%20%3FSource%0A%20%20%20WHERE%20%7B%0A%20%20%20%3FSource%20%3Fp%20cco%3ASource%20.%0A%7D%20LIMIT%20100%0A)



### Output

<!-- https://chemblmirror.rdf.bigcat-bioinformatics.org/sparql -->
<table>
  <tr>
    <td><b>Source</b></td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_11</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_0</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_1</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_10</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_12</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_13</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_14</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_15</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_16</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_17</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_18</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_19</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_2</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_20</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_21</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_22</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_23</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_24</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_25</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_26</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_27</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_28</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_29</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_3</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_30</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_31</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_32</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_33</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_34</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_35</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_36</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_37</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_38</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_39</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_4</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_40</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_41</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_42</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_43</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_48</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_49</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_5</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_51</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_52</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_53</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_54</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_55</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_56</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_57</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_59</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_6</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_60</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_7</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_8</td>
  </tr>
  <tr>
    <td>http://rdf.ebi.ac.uk/resource/chembl/source/CHEMBL_SRC_9</td>
  </tr>
  <tr>
    <td>b45e5d02f4e7d16710824dac9fcf3780</td>
  </tr>
  <tr>
    <td>c0762d2c501410c6ce72659d957b809b</td>
  </tr>
  <tr>
    <td>93f72e4f285400acbb3bfbe9e53905a5</td>
  </tr>
  <tr>
    <td>cco:hasSource</td>
  </tr>
</table>

## Code examples

### curl

```shell
curl -o chemblSources.rq https://raw.githubusercontent.com/BiGCAT-UM/PRA3006-SPARQL/master/sparql/chemblSources.rq
curl -H "Accept: text/tab-separated-values" -G https://chemblmirror.rdf.bigcat-bioinformatics.org/sparql --data-urlencode query@chemblSources.rq
```

This SPARQL query is available under CCZero.
