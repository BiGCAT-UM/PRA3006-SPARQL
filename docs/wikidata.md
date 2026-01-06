# Wikidata

| **Website** | [https://www.wikidata.org/](https://www.wikidata.org/) |
| **License** | [CCZero](https://creativecommons.org/public-domain/cc0/) |

<a name="tp1">Wikidata</a> is not a life sciences database, but a general database related to <a name="tp2">Wikipedia</a> [<a href="#citeref1">1</a>]. That said,
various research groups have started using Wikidata for the life sciences [<a href="#citeref2">2</a>,<a href="#citeref3">3</a>]. For example, CAS registry
numbers in Wikidata and Wikipedia have been validated against the Common Chemistry database [<a href="#citeref4">4</a>], and Wikidata has been used to make
chemicals in taxon available in the LOTUS project [<a href="#citeref5">5</a>].

## Entities

The RDF contains all pathways, their datanodes (genes, proteins, metabolites, etc.), author information, molecular descriptors,
and more. The main classes are:

* Pathway: a <a name="tp3">biological pathway</a>
* GeneProduct: can be a <a name="tp4">gene</a>, strand of <a name="tp5">RNA</a>, and a <a name="tp6">protein</a>.
* Rna: RNA, e.g. <a name="tp7">miRNA</a>.
* Protein: a <a name="tp8">protein</a>. Post-translational modifications can be indicated with *states*
* Metabolite: metabolites, ions, and other small molecules. It includes peptides.


## Data model

...

## Example queries

### Proteins

We can list proteins with the following query:

**SPARQL** [sparql/wikidataProteins.rq](sparql/wikidataProteins.code.html) ([run](https://query.wikidata.org/embed.html#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0A%0ASELECT%20*%20WHERE%20%7B%0A%20%20%3Fo%20wdt%3AP31%20wd%3AQ8054.%0A%20%20%3Fo%20rdfs%3Alabel%20%3Fl.%0A%20%20FILTER%28LANG%28%3Fl%29%3D%27en%27%29%0A%7D%20LIMIT%2010%0A), [edit](https://query.wikidata.org/#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0A%0ASELECT%20*%20WHERE%20%7B%0A%20%20%3Fo%20wdt%3AP31%20wd%3AQ8054.%0A%20%20%3Fo%20rdfs%3Alabel%20%3Fl.%0A%20%20FILTER%28LANG%28%3Fl%29%3D%27en%27%29%0A%7D%20LIMIT%2010%0A))

```sparql
PREFIX wdt: <http://www.wikidata.org/prop/direct/>
SELECT * WHERE {
  ?o wdt:P31 wd:Q8054.
  ?o rdfs:label ?l.
  FILTER(LANG(?l)='en')
} LIMIT 10
```

which gives:

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

### Chemicals

We can also list chemicals, with this query:

**SPARQL** [sparql/wikidataChemicals.rq](sparql/wikidataChemicals.code.html) ([run](https://query.wikidata.org/embed.html#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0A%0ASELECT%20*%20WHERE%20%7B%0A%20%20%3Fo%20wdt%3AP31%20wd%3AQ113145171%20.%0A%20%20%3Fo%20rdfs%3Alabel%20%3Fl.%0A%20%20FILTER%28LANG%28%3Fl%29%3D%27en%27%29%0A%7D%20LIMIT%2050%0A), [edit](https://query.wikidata.org/#PREFIX%20wdt%3A%20%3Chttp%3A%2F%2Fwww.wikidata.org%2Fprop%2Fdirect%2F%3E%0A%0ASELECT%20*%20WHERE%20%7B%0A%20%20%3Fo%20wdt%3AP31%20wd%3AQ113145171%20.%0A%20%20%3Fo%20rdfs%3Alabel%20%3Fl.%0A%20%20FILTER%28LANG%28%3Fl%29%3D%27en%27%29%0A%7D%20LIMIT%2050%0A))

```sparql
PREFIX wdt: <http://www.wikidata.org/prop/direct/>
SELECT * WHERE {
  ?o wdt:P31 wd:Q113145171 .
  ?o rdfs:label ?l.
  FILTER(LANG(?l)='en')
} LIMIT 50
```

which gives:

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
  <tr><td colspan="2">This table is truncated. See the full table at <a href="sparql/wikidataChemicals.code.html">sparql/wikidataChemicals.rq</a></td></tr>
</table>

## References

1. <a name="citeref1"></a> Vrandečić D, Pintscher L, Krötzsch M. Wikidata: The Making Of. In: WWW ’23 Companion: Companion Proceedings of the ACM Web Conference 2023 [Internet]. 2023. Available from: https://dl.acm.org/doi/10.1145/3543873.3585579 doi:[10.1145/3543873.3585579](https://doi.org/10.1145/3543873.3585579) ([Scholia](https://scholia.toolforge.org/doi/10.1145/3543873.3585579))
2. <a name="citeref2"></a> Waagmeester A, Stupp G, Burgstaller-Muehlbacher S, Good BM, Griffith M, Griffith O, et al. Wikidata as a knowledge graph for the life sciences. eLife [Internet]. 2020 Mar 17;9. Available from: https://elifesciences.org/articles/52614 doi:[10.7554/ELIFE.52614](https://doi.org/10.7554/ELIFE.52614) ([Scholia](https://scholia.toolforge.org/doi/10.7554/ELIFE.52614))
3. <a name="citeref3"></a> Waagmeester A, Willighagen EL, Su AI, Kutmon M, Gayo JEL, Fernández-Álvarez D, et al. A protocol for adding knowledge to Wikidata: aligning resources on human coronaviruses. BMC Biol [Internet]. 2021 Jan 22;19(1):12. Available from: https://bmcbiol.biomedcentral.com/track/pdf/10.1186/s12915-020-00940-y.pdf doi:[10.1186/S12915-020-00940-Y](https://doi.org/10.1186/S12915-020-00940-Y) ([Scholia](https://scholia.toolforge.org/doi/10.1186/S12915-020-00940-Y))
4. <a name="citeref4"></a> Jacobs A, Williams D, Hickey K, Patrick N, Williams AJ, Chalk S, et al. CAS Common Chemistry in 2021: Expanding Access to Trusted Chemical Information for the Scientific Community. JCIM. 2022 May 13;  doi:[10.1021/ACS.JCIM.2C00268](https://doi.org/10.1021/ACS.JCIM.2C00268) ([Scholia](https://scholia.toolforge.org/doi/10.1021/ACS.JCIM.2C00268))
5. <a name="citeref5"></a> Rutz A, Sorokina M, Galgonek J, Mietchen D, Willighagen E, Gaudry A, et al. The LOTUS initiative for open knowledge management in natural products research. eLife [Internet]. 2022 May 26;11. Available from: https://doi.org/10.7554/elife.70780 doi:[10.7554/ELIFE.70780](https://doi.org/10.7554/ELIFE.70780) ([Scholia](https://scholia.toolforge.org/doi/10.7554/ELIFE.70780))

