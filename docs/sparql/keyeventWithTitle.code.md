# keyeventWithTitle.rq
**Code examples:** [curl](#curl)
### SPARQL
```sparql
SELECT ?KE ?KEtitle
WHERE {
  ?KE a aopo:KeyEvent .
  ?KE dc:title ?KEtitle .
}
```
[Run](https://aopwiki.rdf.bigcat-bioinformatics.org/sparql/?query=SELECT%20%3FKE%20%3FKEtitle%0AWHERE%20%7B%0A%20%20%3FKE%20a%20aopo%3AKeyEvent%20.%0A%20%20%3FKE%20dc%3Atitle%20%3FKEtitle%20.%0A%7D%0A) or [Edit](https://aopwiki.rdf.bigcat-bioinformatics.org/?q=SELECT%20%3FKE%20%3FKEtitle%0AWHERE%20%7B%0A%20%20%3FKE%20a%20aopo%3AKeyEvent%20.%0A%20%20%3FKE%20dc%3Atitle%20%3FKEtitle%20.%0A%7D%0A)


### Output
<!-- https://aopwiki.rdf.bigcat-bioinformatics.org/sparql -->
<table>
  <tr>
    <td><b>KE</b></td>
    <td><b>KEtitle</b></td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2069</td>
    <td>Occurrence, Vascular Remodeling </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2070</td>
    <td>Increase, Glycolysis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2071</td>
    <td>Decrease, Glucose pool</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2072</td>
    <td>Increase, Mitochondrial swelling</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2073</td>
    <td>increase oxidation of the di-copper moiety of the hemocyanin active site </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2074</td>
    <td>Decreased, oxygen binding capacity by hemocyanin</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2075</td>
    <td>Cognitive, sensed as hypoxic/low oxygen environment</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2076</td>
    <td>Increase, hemocyanin mRNA</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2077</td>
    <td>Increase, pulmonate breathing</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2078</td>
    <td>Loss of drebrin</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2079</td>
    <td>Increased glycolipid levels  in testis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2080</td>
    <td>Impaired, blood testis barrier</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2081</td>
    <td>Increased Modified Proteins</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2083</td>
    <td>Occurrence of Cataracts</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1000</td>
    <td>stabilization, PPAR alpha co-repressor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1002</td>
    <td>Inhibition, Deiodinase 2</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1003</td>
    <td>Decreased, Triiodothyronine (T3)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1009</td>
    <td>Inhibition, Deiodinase 1</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/110</td>
    <td>Impairment, Endothelial network</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1108</td>
    <td>Abnormal, Role change within caste</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/112</td>
    <td>Antagonism, Estrogen receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/115</td>
    <td>Increase, FA Influx</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/116</td>
    <td>Activation, FAS</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1172</td>
    <td>Increase activation, Nuclear factor kappa B (NF-kB)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/119</td>
    <td>N/A, Gap</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1193</td>
    <td>N/A, Breast Cancer</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/12</td>
    <td>Acetylcholinesterase (AchE) Inhibition</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1202</td>
    <td>Suppression, IL-2 and IL-4 production</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1214</td>
    <td>Altered gene expression specific to CAR activation, Hepatocytes</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1243</td>
    <td>Altered, Ca2+-calmodulin activated signal transduction</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1253</td>
    <td> MLL chromosomal translocation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1254</td>
    <td>Infant leukaemia</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1269</td>
    <td>Increase, COX-2 expression</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/139</td>
    <td>N/A, Hepatotoxicity, Hepatopathy, including a constellation of observable effects</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1391</td>
    <td>Activation of Cyp2E1</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1458</td>
    <td>Pulmonary fibrosis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1477</td>
    <td>Decrease, Oxidative phosphorylation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1494</td>
    <td>Leukocyte recruitment/activation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1498</td>
    <td>Loss of alveolar capillary membrane integrity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1499</td>
    <td>Increased, activation of T (T) helper (h) type 2 cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1500</td>
    <td>Increased, fibroblast proliferation and myofibroblast differentiation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1501</td>
    <td>Increased, extracellular matrix deposition</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1502</td>
    <td>Histone deacetylase inhibition</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1503</td>
    <td>Histone acetylation, increase</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1506</td>
    <td>Testicular atrophy</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1508</td>
    <td>CYP2E1 Activation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1510</td>
    <td>Oxidative Stress in Brain</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1512</td>
    <td>Unfolded Protein Response</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1513</td>
    <td>General Apoptosis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1522</td>
    <td>Inhibition, Chitin synthase 1</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1528</td>
    <td>Fatty Acid Beta Oxidation, Decreased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1542</td>
    <td>Increase, Mitochondrial complex III antagonism</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1543</td>
    <td>Mitochondrial Complex IV inhibition</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1544</td>
    <td>Mitochondrial Complex V inhibition</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1549</td>
    <td>Liver Injury</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/155</td>
    <td>Inadequate DNA repair</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1557</td>
    <td>Neural crest cell migration, reduced</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1564</td>
    <td>Chemical induced Fanconi syndrome</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1574</td>
    <td>Inhibition, IKK complex</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1575</td>
    <td>Activation, Caspase 8 pathway</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1599</td>
    <td>Inflamatory events in light-exposed tissues</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1604</td>
    <td>Inhibition of N-linked glycosylation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1614</td>
    <td>Decrease, androgen receptors (AR) activation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1616</td>
    <td>Malformation, cryptorchidism - maldescended testis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/165</td>
    <td>Activation, Long term AHR receptor driven direct and indirect gene expression changes</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1650</td>
    <td>Epithelial-mesenchymal transition</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1651</td>
    <td>Treatment-resistant gastric cancer</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1656</td>
    <td>Antagonism, Thyroid Receptor </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/167</td>
    <td>Activation, LXR</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1688</td>
    <td>anogenital distance (AGD), decreased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1700</td>
    <td>Impaired IL-1R1 signaling in T cell</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1702</td>
    <td>Suppression of  T cell activation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1706</td>
    <td>Stimulation, TLR7/8</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1707</td>
    <td>Increase, IL-23 from matured dendritic cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1708</td>
    <td>Th17 cell migration and inflammation induction</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1709</td>
    <td>Psoriatic skin disease</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1710</td>
    <td>Binding to estrogen receptor (ER)-α in immune cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1711</td>
    <td>Induction of GATA3 expression</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1712</td>
    <td>Increase of Th2 cells producing IL-4</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1713</td>
    <td>Increase of anti-DNA antibody from autoreactive B cell</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1714</td>
    <td>Exacerbation of systemic lupus erythematosus (SLE)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1715</td>
    <td>Inhibition of JAK3</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1716</td>
    <td>Blockade of STAT5 phosphorylation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1717</td>
    <td>Suppression of STAT5 binding to cytokine gene promoters</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1718</td>
    <td>Suppression of IL-4 production</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1719</td>
    <td>Impairment of T-cell dependent antibody response</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1720</td>
    <td>Trypsin inhibition</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1721</td>
    <td>Increased intestinal monitor peptide level</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1722</td>
    <td>Increased blood CCK level</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1723</td>
    <td>Increased exocrine secretion from pancreatic acinar cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1724</td>
    <td>Acinar cell proliferation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1725</td>
    <td>Pancreatic acinar cell tumors</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1739</td>
    <td>Binding to ACE2</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1754</td>
    <td>Porcupine-induced Wnt secretion and Wnt signaling activation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1759</td>
    <td>Increase, Cripto-1 expression</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1760</td>
    <td>Inhibition, Activin signaling</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/18</td>
    <td>Activation, AhR</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1822</td>
    <td>Maturation of TNF/iNOS-Producing Dendritic Cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1841</td>
    <td>Encephalitis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1848</td>
    <td>Toll Like Receptor (TLR) Dysregulation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/186</td>
    <td>Altered, Neuroanatomy</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/201</td>
    <td>Binding of antagonist, NMDA receptors</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/258</td>
    <td>Activation, SCD-1</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/26</td>
    <td>Antagonism, Androgen receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/264</td>
    <td>Activation, SREBP-1c</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/272</td>
    <td>Activation/Proliferation, T-cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/277</td>
    <td>Thyroid hormone synthesis, Decreased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/279</td>
    <td>Thyroperoxidase, Inhibition</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/28</td>
    <td>Reduction, Angiogenesis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/280</td>
    <td>Thyroxine (T4) in neuronal tissue, Decreased </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/281</td>
    <td> Thyroxine (T4) in serum, Decreased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/286</td>
    <td>Altered, Transcription of genes by AR</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/298</td>
    <td>Insufficiency, Vascular</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/305</td>
    <td>Inhibition, VegfR2</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/350</td>
    <td>Increase, Mortality</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/352</td>
    <td>N/A, Neurodegeneration</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/36</td>
    <td>Inhibition, Aromatase</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/369</td>
    <td>Uroporphyria</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/381</td>
    <td>Reduced levels of BDNF</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/385</td>
    <td>Decrease of synaptogenesis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/389</td>
    <td>Increased, Intracellular Calcium overload</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/408</td>
    <td>reduction in ovarian granulosa cells, Aromatase (Cyp19a1)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/41</td>
    <td>Inhibition, Bile Salt Export Pump (ABCB11)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/424</td>
    <td>Inhibition, Na+/I- symporter (NIS)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/425</td>
    <td>Decrease of Thyroidal iodide</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/51</td>
    <td>Inhibition, Ca++ ATPase</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/54</td>
    <td>Up Regulation, CD36</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/584</td>
    <td>Inhibition, sodium channel</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/619</td>
    <td>Inhibition, 5-hydroxytryptamine transporter (5-HTT; SERT)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/66</td>
    <td>Activation, ChREBP</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/663</td>
    <td>Desensitization, Nicotinic acetylcholine receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/669</td>
    <td>Reduction, Neuronal synaptic inhibition</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/715</td>
    <td>Activation, Constitutive androstane receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/716</td>
    <td>Increase, cell proliferation (hepatocytes)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/752</td>
    <td>Altered, Meiotic chromosome dynamics</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/79</td>
    <td>Inhibition, Cyclooxygenase activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/826</td>
    <td>Activation, Keratinocytes</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/851</td>
    <td>Decrease of GABAergic interneurons</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/853</td>
    <td>Changes/Inhibition, Cellular Homeostasis and Apoptosis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/856</td>
    <td>Formation, Hepatocellular and Bile duct tumors</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/858</td>
    <td>Decreased, PPARalpha transactivation of gene expression</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/877</td>
    <td>Inhibition, organic anion transporter 1 (OAT1)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/887</td>
    <td>Inhibition, NADH-ubiquinone oxidoreductase  (complex I)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/888</td>
    <td>Binding of inhibitor, NADH-ubiquinone oxidoreductase (complex I)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/89</td>
    <td>Synthesis, De Novo FA</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/927</td>
    <td>KE1 : S-Glutathionylation, eNOS</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/935</td>
    <td>KE2 : Decrease, GTPCH-1</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/941</td>
    <td>Activation, EGFR</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/944</td>
    <td>dimerization, AHR/ARNT</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/948</td>
    <td>reduced production, VEGF</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/957</td>
    <td>Binding, Transthyretin in serum</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/958</td>
    <td>Displacement, Serum thyroxine (T4) from transthyretin</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/959</td>
    <td>Increased, Free serum thyroxine (T4)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/960</td>
    <td>Increased, Uptake of thyroxine into tissue</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/961</td>
    <td>Increased, Clearance of thyroxine from serum</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/962</td>
    <td>Increase, Mucin production</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/973</td>
    <td>KE5 : Decrease, AKT/eNOS activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/979</td>
    <td>Interference, nuclear localization of NFAT</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/980</td>
    <td>Inhibition, Calcineurin Activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/981</td>
    <td>Reduction, NFAT/AP-1 complex formation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/984</td>
    <td>Impairment, T-cell dependent antibody response</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/10</td>
    <td>Acetylcholine accumulation in synapses</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1001</td>
    <td>Increased, Developmental Defects</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1004</td>
    <td>Reduced, Posterior swim bladder inflation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1005</td>
    <td>Reduced, Swimming performance</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1007</td>
    <td>Reduced, Anterior swim bladder inflation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1012</td>
    <td>Increased, Inhibitory postsynaptic potential</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1014</td>
    <td>Induction, Somatic muscle paralysis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1015</td>
    <td>Increased, Neuronal synaptic inhibition</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1016</td>
    <td>Inhibition, Feeding</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1018</td>
    <td>Activation, Glutamate-gated chloride channels</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1019</td>
    <td>Induction, pharyngeal muscle paralysis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1023</td>
    <td>Increased, Thyroid-stimulating hormone (TSH)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1028</td>
    <td>Activation of specific nuclear receptors, PPAR-gamma activation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1029</td>
    <td>Increased, adipogenesis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/103</td>
    <td>Increase, Ecdysone receptor agonism</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1032</td>
    <td>Increased, secretion of local growth factors</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1033</td>
    <td>Increased, proliferation of mesenchymal cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1034</td>
    <td>Increased, IGF-1 (mouse)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1035</td>
    <td>Increased, Firbrosarcoma</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1036</td>
    <td>Increased, liposarcoma</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1037</td>
    <td>Increased, hemagiosarcoma</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1038</td>
    <td>Activation, beta-2 adrenergic receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1039</td>
    <td>Increased activity, beta-2 adrenergic receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1040</td>
    <td>relaxation, smooth muscle</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1042</td>
    <td>Proliferation/Clonal Expansion, smooth muscle</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1043</td>
    <td>Hypertrophy/hyperplasia, smooth muscle</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1044</td>
    <td>Promotion, mesovarian leiomyomas</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1045</td>
    <td>Decreased, Ovarian E2</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1046</td>
    <td>Suppression, Estrogen receptor (ER) activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1047</td>
    <td>Increased, secretion of GnRH from hypothalamus</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1049</td>
    <td>Increased, secrection of FSH from anterior pituitary</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1050</td>
    <td>Increased, secretion of LH from anterior pituitary</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1051</td>
    <td>Hyperplasia, ovarian stromal cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1052</td>
    <td>Hyperplasia, ovarian epithelium</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1053</td>
    <td>Promotion, ovarian adenomas</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1054</td>
    <td>Promotion, ovarian granular cell tumors</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1056</td>
    <td>Decrease, E2 blood concentrations at hypothalamus</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1057</td>
    <td>Increased, PPAR-alpha activation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1058</td>
    <td>Decreased, bile flow</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1059</td>
    <td>Increased, cholestasis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/106</td>
    <td>Reduction, Eggshell thickness</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1060</td>
    <td>Alteration, lipid metabolism</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1061</td>
    <td>prolonged, elevation of serun CCK</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1062</td>
    <td>Increased, Cellular proliferation / hyperplasia of acinar cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1063</td>
    <td>Increased, Pancreatic acinar tumors</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1064</td>
    <td>prepubertal increase, Estrogen receptor (ER) activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1065</td>
    <td>Activation, estrogen receptor alpha</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1066</td>
    <td>Promotion, SIX-1 postive basal-type progenitor cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1067</td>
    <td>Proliferation/Clonal Expansion, aberrant basal cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1068</td>
    <td>squamous metaplasia, aberrant basal cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1069</td>
    <td>Increased, Hyperplasia (glandular epithelial cells of endometrium)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1070</td>
    <td>Increased, adenosquamous carcinomas of endometrium</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1071</td>
    <td>Decreased, GnRH pulsatility/release in hypothalamus</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1072</td>
    <td>Decreased, LH Surge from anterior pituitary</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1074</td>
    <td>interruption, Ovulation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1075</td>
    <td>prolonged, estrus</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1076</td>
    <td>Increased, circulating estrogen levels</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1077</td>
    <td>Increased, prolactin exposure</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1078</td>
    <td>Hyperplasia, Mammary gland</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1079</td>
    <td>Increased, Adenomas/carcinomas (mammary)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1080</td>
    <td>Increased, latency period</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1081</td>
    <td>Increased, lactotroph hyperplasia and hypertrophy</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1082</td>
    <td>Increased, adenomas (pituitary)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1083</td>
    <td>Decreased, Dopaminergic activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1084</td>
    <td>Increased, prolactin secretion</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1085</td>
    <td>Increased, hyperplasia (mammary gland)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1086</td>
    <td>persistent, cytotoxicity (pleura or peritoneum)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1087</td>
    <td>Increased, inflammation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1088</td>
    <td>Increased, Oxidative Stress</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1089</td>
    <td>Increased, Cell Proliferation (mesothelium)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1090</td>
    <td>Increased, mesotheliomas</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1096</td>
    <td>Increased, blood uric acid concentration</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1097</td>
    <td>Occurrence, renal proximal tubular necrosis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1098</td>
    <td>Increased, blood potassium concentration</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1101</td>
    <td>Altered, Amphibian metamorphosis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1102</td>
    <td>Occurrence, tophi (urate) deposition</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1103</td>
    <td>Inhibition, Cyclooxygenase 1 activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1104</td>
    <td>Decreased, Prostaglandin F2alpha concentration, plasma </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1105</td>
    <td>Occurrence, renal ischemia</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1106</td>
    <td>Occurrence, cardiac arrhythmia</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1107</td>
    <td>Weakened, Colony</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1109</td>
    <td>Increased, Deformed Wing Virus levels</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/111</td>
    <td>Agonism, Estrogen receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1110</td>
    <td>Increased, Energetic demands and therefore metabolic stress</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1114</td>
    <td>Unknown, MIE</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1115</td>
    <td>Increased, Reactive oxygen species</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1116</td>
    <td>Decreased, Triiodothyronine (T3) in tissues</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1122</td>
    <td>Under carboxylated clotting factors will not assemble on cell surfaces to form clot, Failure of secondary hemostasis  </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1130</td>
    <td>Failure in vascular repair mechanisms, Unresolved blood loss (hemorrhage)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1131</td>
    <td>Failure in gamma-glutamyl carboxylation of  clotting factors II, VII, IX and X, Under carboxylation of clotting factors (e.g., des-gamma-carboxy prothrombin) </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1132</td>
    <td>Blood loss and development of anemia, Impaired oxygen delivery and nutrient delivery to tissue, impaired carbon dioxide and waste product removal</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1133</td>
    <td>Hemostasis, Depletion from blood of fully functional carboxylated clotting factors</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1134</td>
    <td>Irreversible inhibition of hepatic VKOR by binding of AR at tyrosine 139, Failure to cycle vitamin K epoxide to vitamin K to form vitamin K hydroquinone</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1135</td>
    <td>Reduced fitness or even mortality, Acidosis, hypovolemic shock and organ dysfunction</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1136</td>
    <td>Impaired recruitment , Population trajectory</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1138</td>
    <td>Uncoupling of oxidative phosphorylation, Reduced ability to generate ATP</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1139</td>
    <td>Increased, water retention in foot</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1141</td>
    <td>Decreased, Reproductive Success</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1142</td>
    <td>Increased, valve movement</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1143</td>
    <td>Depletion, energy reserves</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1151</td>
    <td>Osteoporosis and vascular calcification, Bone deterioration</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1152</td>
    <td>Inhibition, Iodotyrosine deiodinase (IYD)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1153</td>
    <td>Inhibition, Deiodinase 3</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1154</td>
    <td>Increased, Triiodothyronine (T3) in tissues</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1155</td>
    <td>Inhibition, Pendrin</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1156</td>
    <td>Inhibition, Dual oxidase</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1157</td>
    <td>Activation, Hepatic nuclear receptor(s)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1158</td>
    <td>Increased, Hepatic thyroid hormone uptake/transport</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1161</td>
    <td>Increased, oocyte maturation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1163</td>
    <td>Increased, Reproductive Success</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1164</td>
    <td>Increased, Population</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1169</td>
    <td>Anticoagulant rodenticide interferes with carboxylation of Gla proteins in bone, Impairment of post-translational modification (carboxylation) of osteocalcin</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1170</td>
    <td>Increase, Phenotypic enzyme activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1171</td>
    <td>Increase, Clonal Expansion of Altered Hepatic Foci</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1174</td>
    <td>Activation, NADPH Oxidase</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1176</td>
    <td>Decreased, sodium conductance 2</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1179</td>
    <td>Decreased, GABA release</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/118</td>
    <td>Formation, Formation of hemoglobin adducts</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1181</td>
    <td>Activation, Estrogen receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1182</td>
    <td>Increase, Cell Proliferation (Epithelial Cells)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1183</td>
    <td>Decreased, Apoptosis (Epithelial Cells)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1187</td>
    <td>Increased, ER binding to DNA (classical pathway) </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1188</td>
    <td>Increased, ER binding to T.F. to DNA (non-classical pathway)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1189</td>
    <td>Increased, Proliferation (Endothelial cells) </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1190</td>
    <td>Increased, Migration (Endothelial Cells)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1191</td>
    <td>Increased, Non-genomic signaling</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1192</td>
    <td>Increased, Ductal Hyperplasia </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1194</td>
    <td>Increase, DNA damage</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1195</td>
    <td>modulation, Extracellular Matrix Composition </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1196</td>
    <td>Increased, Invasion</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1197</td>
    <td>Activation, Fibroblasts</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1198</td>
    <td>Activation, Macrophages</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1205</td>
    <td>Activation, Juvenile hormone receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1206</td>
    <td>Induction, Doublesex1 gene</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1208</td>
    <td>Increased, Male offspring</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1209</td>
    <td>Induction, Male reproductive tract</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1210</td>
    <td>Alteration, Food-web structures</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1213</td>
    <td>Increased, Angiogenesis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1215</td>
    <td>TRPA1 activation, TRPA1 Receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1218</td>
    <td>Opening of calcium channel, Calcium influx</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/122</td>
    <td>Activation, Glucocorticoid Receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1220</td>
    <td>Trigeminal nerve activation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1222</td>
    <td>SP (Substance P) release, Local increase of SP</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1223</td>
    <td>Trigeminal and/or vagal nerve excitation causes Airway Hyper-responsiveness,Cough, Dyspnea</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1226</td>
    <td>Increased Respiratory irritability and Chronic Cough, </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1239</td>
    <td>Altered, Gene Expression</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1240</td>
    <td>Altered, Protein Production</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1241</td>
    <td>Increased, Motility</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1242</td>
    <td>Increased, Second Messenger Production</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1250</td>
    <td>Decrease, Lung function</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1252</td>
    <td>Binding to (interferes with) topoisomerase II enzyme</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1255</td>
    <td>induced spawning</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1256</td>
    <td>increased mantel display</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1257</td>
    <td>Induced parturition</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1258</td>
    <td>Decompartmentalization</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1259</td>
    <td>narcosis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1260</td>
    <td>Direct mitochondrial inhibition</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1261</td>
    <td>Mitochondrial impairment</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1262</td>
    <td>Apoptosis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1263</td>
    <td>Necrosis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1264</td>
    <td>Increase, Nuclear receptor E75b gene expression</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1265</td>
    <td>Increase, Fushi tarazu factor-1 gene expression</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1266</td>
    <td>Decrease, Circulating crustacean cardioactive peptide</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1267</td>
    <td>Decrease, Ecdysis motoneuron bursts</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1268</td>
    <td>Decrease, Excitatory postsynaptic potential</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1270</td>
    <td>Inactivation of PPARγ</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1271</td>
    <td>Activation of TGF-β signaling</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1275</td>
    <td>Collagen Deposition</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1276</td>
    <td>Lung fibrosis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1277</td>
    <td>Reproductive failure</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1278</td>
    <td>ROS formation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1279</td>
    <td>Increase, Oxidative Stress / Activation, PMK-1 P38 MAPK</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1280</td>
    <td>Activation, HIF-1</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1281</td>
    <td>Increased, DNA Damage-Repair</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1282</td>
    <td>Activation, JAK/STAT pathway</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1283</td>
    <td>Activation, TGF-beta pathway</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1284</td>
    <td>Up Regulation, SREBF2</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1285</td>
    <td>Up Regulation, Unsaturated fatty acid</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1286</td>
    <td>Down Regulation, GSS and GSTs gene</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1287</td>
    <td>Glutathione synthesis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1288</td>
    <td>Activation, 3-hydroxy-3-methylglutaryl-CoA reductase gene</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1289</td>
    <td>Perturbation of cholesterol</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/129</td>
    <td>Reduction, Gonadotropins, circulating concentrations</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1290</td>
    <td>Glutathione homeostasis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1291</td>
    <td>Hepatotoxicity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1292</td>
    <td>Activation, JNK</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1293</td>
    <td>Activation, FOXO</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1294</td>
    <td>Inhibition, Wnt pathway</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1295</td>
    <td>Defect of Embryogenesis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1305</td>
    <td>Increase, cytosolic fatty acid</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/131</td>
    <td>Down Regulation, Gulcose-6-phosphate dehydrogenase</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1316</td>
    <td>Inhibit, serotonin transporter activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1317</td>
    <td>Decreased, serotonin transporter activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1318</td>
    <td>Decreased, extracellular sodium (Na+) </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1319</td>
    <td>Decreased, extracellular chloride (Cl-)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1320</td>
    <td>Increased, extracellular serotonin</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1321</td>
    <td>Increased, intracellular sodium (Na+)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1322</td>
    <td>Increased, intracellular chloride (Cl-)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1323</td>
    <td>Decreased, intracellular serotonin</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1324</td>
    <td>Decreased, packaged serotonin</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1325</td>
    <td>Decreased, synaptic release</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1326</td>
    <td>Increased, 5-HT3 (5-hydroxytryptamine)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1328</td>
    <td>Inactivated, 5-HTR (serotonin receptors)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1329</td>
    <td>Reduce expression, BDNF (Brain-derived neurotrophic factor)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1330</td>
    <td>Decreased, neuroplasticity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1334</td>
    <td>Increase, cortisone</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1335</td>
    <td>Reduced, BDNF (Brain-derived neurotrophic factor)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1336</td>
    <td>Activation, 5-HT2A (Serotonin 2A)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1337</td>
    <td>Activate, PLC (Phospholipase C)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1338</td>
    <td>Increase, inositol triphosphate</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1339</td>
    <td>Increase, intracellular calcium</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1340</td>
    <td>Activate, calmodulin</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1341</td>
    <td>Increase, myosin light chain phosphorylation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1342</td>
    <td>Increase, vascular smooth muscle contraction</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1343</td>
    <td>Increase, hypertension</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1344</td>
    <td>Increased, seizure</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1345</td>
    <td>Increased, agitation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1346</td>
    <td>Increased, depression</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1347</td>
    <td>Decreased, extracellular serotonin</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1348</td>
    <td>Increase, seizure</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1349</td>
    <td>Activated, presynaptic neuron 1</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1350</td>
    <td>Increased, glutamate</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1351</td>
    <td>Activated, NMDA receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1352</td>
    <td>Activated, voltage-gated sodium channel</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1353</td>
    <td>Inhibit, voltage-gated sodium channel</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1354</td>
    <td>Treat, carbamazepine</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1355</td>
    <td>Activated, membrane depolarization</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1356</td>
    <td>Inactive, membrane depolarization</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1357</td>
    <td>Increased, RDX dose</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1358</td>
    <td>Repress, GABA-A receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1359</td>
    <td>Activate, GABA-A receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1360</td>
    <td>Activate, presynaptic neuron 2</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1361</td>
    <td>Increase, GABA</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1362</td>
    <td>Increased, hippocampal hyperdepolarization</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1363</td>
    <td>Increased, epilepsy</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1364</td>
    <td>Increase, Reactive oxygen species</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1365</td>
    <td>Increase, Apoptosis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1366</td>
    <td>Decrease, Oogenesis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1367</td>
    <td>Inhibit, gastric ulcer formation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1368</td>
    <td>Inhibition, PTGS-1 (Prostaglandin-endoperoxide synthase 1)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1369</td>
    <td>Activation, PTGS-1 (Prostaglandin-endoperoxide synthase 1)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1370</td>
    <td>Activation, PTGS-2 (Prostaglandin-endoperoxide synthase 2)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1371</td>
    <td>Inhibition, PTGS-2 (Prostaglandin-endoperoxide synthase 2)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1372</td>
    <td>Increase, bicarbonate </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1373</td>
    <td>Increase, mucous</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1374</td>
    <td>Increase, mucosal blood flow</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1375</td>
    <td>Increase, platelet aggregation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1376</td>
    <td>Increase, angiogenesis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1377</td>
    <td>Decrease, leukocyte adherence</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1378</td>
    <td>Increase, leukocyte adherence</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1379</td>
    <td>Activate, leukocyte </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1380</td>
    <td>Activate, mucosal defense</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1381</td>
    <td>Increase, surfactant</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1382</td>
    <td>Decrease, surfactant</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1383</td>
    <td>Activate, phospholipase</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1384</td>
    <td>Increase, ammonium (NH4+)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1385</td>
    <td>Activated, gastric ulcer formation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1386</td>
    <td>CYP7B activity, inhibition</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1387</td>
    <td>7α-hydroxypregnenolone synthesis in the brain, decreased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1388</td>
    <td>Dopamine release in the brain, decreased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1389</td>
    <td>Locomotor activity, decreased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1390</td>
    <td>Sexual behavior, decreased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1392</td>
    <td>Oxidative Stress </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1393</td>
    <td>Hepatocytotoxicity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1394</td>
    <td>Induction, persistent proliferation/sustained proliferation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1395</td>
    <td>Liver Cancer</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1396</td>
    <td>Increased, glucocorticoid receptor activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1397</td>
    <td>Increased, serotonin transporter activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1398</td>
    <td>Increased, intracellular serotonin</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1399</td>
    <td>Increased, packaged serotonin</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/140</td>
    <td>Decreased, HSD17B10 expression</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1400</td>
    <td>Increased, synaptic release</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1401</td>
    <td>Decreased, 5-HT3</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1402</td>
    <td>Reduced, PTGS1 function</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1403</td>
    <td>Reduced, platelet aggregation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1404</td>
    <td>Decreased, mucosal blood flow</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1405</td>
    <td>Reduced, mucosal defense</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1406</td>
    <td>Decreased, mucous</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1407</td>
    <td>Decreased, bicarbonate</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1408</td>
    <td>Reduced, PTGS2 function</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1409</td>
    <td>Decreased, angiogenesis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1410</td>
    <td>Increased, leukocyte adherence</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1411</td>
    <td>Increased, leukocyte activation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1412</td>
    <td>Helicobacter pylori infection</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1413</td>
    <td>Reduced, presynaptic neuron 2 activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1414</td>
    <td>Decreased, GABA</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1415</td>
    <td>Reduced, GABA-A receptor activation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1416</td>
    <td>Decreased, intracellular chloride</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1417</td>
    <td>NFE2/Nrf2 repression</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1418</td>
    <td>Increased, steatosis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1419</td>
    <td>Reduced, FXR activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/142</td>
    <td>Hyperplasia, Hyperplasia</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1420</td>
    <td>Reduced, SHP activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1421</td>
    <td>Activated, LXR</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1422</td>
    <td>Reduced, PPARalpha</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1423</td>
    <td>Reduced, HSD17B4 activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1424</td>
    <td>Reduced, fatty acid beta oxidation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1425</td>
    <td>Mu Opioid Receptor Agonism</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1426</td>
    <td>Release of G Proteins</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1427</td>
    <td>Opening of G protein gated inward rectifying K channels</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1428</td>
    <td>Analgesia</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1429</td>
    <td>Inhibition of N-type Ca ion channels</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1430</td>
    <td>Inhibition of neurotransmitter vesicle release</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1431</td>
    <td>Serotonin 1A Receptor Agonism</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1432</td>
    <td>Anti-depressant Activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1433</td>
    <td>Increased CGRP, neuronal release of CGRP</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1434</td>
    <td>Irritation of nasal mucosa inducing sneeze reflex</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1435</td>
    <td>Increased neurokinin A (NKA) by neuronal cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1438</td>
    <td>Acute phase proteins expression, Increased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1439</td>
    <td>Systemic acute phase response</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1443</td>
    <td>Atherosclerosis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1444</td>
    <td>Increase, Follicular atresia</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1445</td>
    <td>Increase, Lipid peroxidation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1446</td>
    <td>Decrease, Coupling of oxidative phosphorylation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1447</td>
    <td>obesity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1448</td>
    <td>activation of CCAAT/enhancer-binding protein alpha</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1449</td>
    <td>increased adipogenesis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/145</td>
    <td>Induction, IKB inhibitory protein</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1450</td>
    <td>decreased dopamine</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1451</td>
    <td>decreased reward</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1452</td>
    <td>decreased DNA methylation of tyrosine hydroxylase</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1453</td>
    <td>decreased methylation of dopamine transporter promoter</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1454</td>
    <td>chronic high fat diet</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1456</td>
    <td>Increase, Differentiation of fibroblasts</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1457</td>
    <td>Induction, Epithelial Mesenchymal Transition</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1461</td>
    <td>DNA double-strand break </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1462</td>
    <td>Thiol group of chemicals interact with sulfuhydryl groups of proteins to form thiol adducts</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1463</td>
    <td>Inhibition of lysyl oxidase</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1464</td>
    <td>Reduction of collagen crosslinking</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1465</td>
    <td>Weak collagen matrix</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1466</td>
    <td>Notochord distortion or malformations</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1467</td>
    <td>Growth, reduction</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1468</td>
    <td>Activation, Latent Transforming Growth Factor Beta 1</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1469</td>
    <td>Activation, Transforming Growth Factor beta pathway</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/147</td>
    <td>Inhibition, Inducible Nitric Oxide Synthase by Metabolite CGA 265307</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1471</td>
    <td>Increase, Uncoupling of photophosphorylation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1472</td>
    <td>Decrease, ATP production</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1473</td>
    <td>Decrease, Chlorophyll synthesis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1474</td>
    <td>Decrease, Light harvest capacity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1475</td>
    <td>Decrease, Photosynthesis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1476</td>
    <td>Decrease, Glycolysis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1478</td>
    <td>Decrease, Leaf cell mitosis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1479</td>
    <td>Decrease, Leaf development</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1481</td>
    <td>Inhibition of mitochondrial DNA polymerase gamma (Pol gamma)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1482</td>
    <td>Depletion, mtDNA </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1483</td>
    <td>Dysfunction, Mitochondria </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1486</td>
    <td>Binding of substrate, endocytic receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1487</td>
    <td>Binding, Thiol/seleno-proteins involved in protection against oxidative stress</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1488</td>
    <td>Glutamate dyshomeostasis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1489</td>
    <td>N/A, Steatohepatisis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/149</td>
    <td>Increase, Inflammation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1490</td>
    <td>Inhibition, Fatty Acid Beta Oxidation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1491</td>
    <td>Increased, Oncotic Necrosis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1492</td>
    <td>Tissue resident cell activation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1493</td>
    <td>Increased Pro-inflammatory mediators</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1495</td>
    <td>Substance interaction with the lung resident cell membrane components</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1496</td>
    <td>Increased, secretion of proinflammatory mediators</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1497</td>
    <td>Increased, recruitment of inflammatory cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1505</td>
    <td>Cell cycle, disrupted</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1509</td>
    <td>Protein Adduct Formation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1511</td>
    <td>Lipid Peroxidation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1514</td>
    <td>Neurodegeneration</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1515</td>
    <td>Spermatocyte depletion</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/152</td>
    <td>Suppression, Inflammatory cytokines</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1521</td>
    <td>Decrease, Growth</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1523</td>
    <td>Decrease, Cuticular chitin content</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1524</td>
    <td>Increase, Premature molting</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1525</td>
    <td>Increase, Sulfonylurea receptor binding</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1526</td>
    <td>Increase, Opening of voltage-dependent calcium channel</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1527</td>
    <td>Increase, Cell membrane depolarization</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1529</td>
    <td>Blockade, L-Type Calcium Channels </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1530</td>
    <td>Decrease, Calcium currents</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1531</td>
    <td>Decrease, Calcium binding to Troponin C</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1532</td>
    <td>Decrease, Cardiac contractility </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1533</td>
    <td>Decrease, Cardiac ejection fraction </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1535</td>
    <td>Heart failure </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1536</td>
    <td>Disruption, Intracellular calcium mobilization</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1537</td>
    <td>Disruption, Sarcomere assembly</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1538</td>
    <td>Decreased protection against oxidative stress</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1539</td>
    <td>Endocytotic lysosomal uptake</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1545</td>
    <td>Decrease in mitochondrial oxidative phosphorylation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1546</td>
    <td>Increased reactive oxygen species (in the mitochondria)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1547</td>
    <td>Mitochondrial Injury</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1548</td>
    <td>Necrotic Tissue</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1556</td>
    <td>Increase, lung cancer</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1558</td>
    <td>Collagen production, reduced</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1559</td>
    <td>Facial cartilage structures are reduced in size and morphologically distorted</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1560</td>
    <td>Altered differentiation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1561</td>
    <td>Neural tube defects</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1562</td>
    <td>Decreased Na/K ATPase activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1563</td>
    <td>Decreased proximal tubular vectorial transport</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1576</td>
    <td>Activation, Tissue resident cells (Kuppfer cells)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1579</td>
    <td>Increase, proinflammatory mediators (TNFalpha)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1580</td>
    <td>Binding of microtubule stabilizing agents (MSA) to microtubules</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1581</td>
    <td>Disturbance in microtubule dynamic instability</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1582</td>
    <td>Impaired axonial transport</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1583</td>
    <td>Sensory axonal peripheral neuropathy</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1584</td>
    <td>Interaction of α-diketones with arginine residues</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1585</td>
    <td>Proteasomal dysfunction</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1586</td>
    <td>Airway epithelial injury</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1587</td>
    <td>Fibroproliferative airway lesions</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1588</td>
    <td>Bronchiolitis obliterans</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1592</td>
    <td>ROS generation from photoactivated chemicals</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1594</td>
    <td>Oxidation of membrane lipids</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1595</td>
    <td>Oxidation/denatuation of membrane proteins</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1602</td>
    <td>Activation, Muscarinic Acetylcholine Receptors</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1603</td>
    <td>Chronic kidney disease</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1605</td>
    <td>Accumulation of misfolded proteins</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1606</td>
    <td>Activation of hepatic stellate cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1608</td>
    <td>Increase, Oxidative DNA damage</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1609</td>
    <td>Inhibition, Cytochrome P450 enzyme (CYP17A1) activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/161</td>
    <td>Increase, Liver and splenic hemosiderosis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1610</td>
    <td>Reduction, 17-OH-pregnenolone conversion in DHEA</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1611</td>
    <td>Reduction, 17-OH-progesterone conversion in androstenedione</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1612</td>
    <td>Decrease, testosterone synthesis/level</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1613</td>
    <td>Decrease, dihydrotestosterone (DHT) level</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1615</td>
    <td>Impaired inguinoscrotal testicular descent phase</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1617</td>
    <td>5α-reductase, inhibition</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1619</td>
    <td>Increase, DNA methyltransferase inhibition</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1623</td>
    <td>Occurrence, Focal Seizure</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1627</td>
    <td>Inhibition of tyrosinase </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1628</td>
    <td>Reduction of L-Dopaquinone</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1629</td>
    <td>Reduction in melanin level</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1630</td>
    <td>Reduction of melanosome level</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1631</td>
    <td>Reduction fo Pigmentation pattern </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1632</td>
    <td>Increase in reactive oxygen and nitrogen species (RONS)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1633</td>
    <td>Increase in inflammation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1634</td>
    <td>Increase, Oxidative damage to DNA</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1635</td>
    <td>Increase, DNA strand breaks</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1636</td>
    <td>Increase, Chromosomal aberrations</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1637</td>
    <td>Retinaldehyde dehydrogenase inhibition</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/164</td>
    <td>Induction, Liver “Dysfunctional” Changes by CGA 330050</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1640</td>
    <td>Altered, Photoreceptor patterning</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1641</td>
    <td>Decreased retinoic acid (RA) synthesis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1642</td>
    <td>Decreased plasma RA level</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1643</td>
    <td>Altered, Visual function</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1653</td>
    <td>Binding of inhibitor to mitochondrial complex III</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1654</td>
    <td>Binding of inhibitor to mitochondrial complex IV</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1655</td>
    <td>Binding of inhibitor to mitochondrial complex V</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1657</td>
    <td>Inhibition of cystathionine beta-synthase</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/166</td>
    <td>Decreased, Long-term potentiation (LTP)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1661</td>
    <td>Increased Homocysteine level </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1665</td>
    <td>Increased, Plasma HCY level</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1666</td>
    <td>Induced, dysfunction of microcirculation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1667</td>
    <td>Impaired,anterior-posterior axis development</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1668</td>
    <td>Frustrated phagocytosis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1669</td>
    <td>Increased, DNA damage and mutation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1670</td>
    <td>Lung cancer</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1672</td>
    <td>Inhibition of lung surfactant function</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1673</td>
    <td>Alveolar collapse</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1677</td>
    <td>Reduced tidal volume </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/168</td>
    <td>Decreased, Lymphocytes</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1680</td>
    <td>Inhibition, TBX1</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1681</td>
    <td>Disruption, Neural crest cell migration</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1682</td>
    <td>Disruption, Progenitor cells of second heart field</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1683</td>
    <td>Impairment, Fourth pharyngeal arch development</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1684</td>
    <td>Abnormalities, Cardiac outflow tract formation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1685</td>
    <td>Anomalies, Congenital cardiac conotruncal</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1686</td>
    <td>Deposition of Energy</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1687</td>
    <td>decrease, transcription of genes by AR </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/169</td>
    <td>Disruption, Membrane integrity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1690</td>
    <td>reduction, testosterone levels </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1691</td>
    <td>Antagonism,LH receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1692</td>
    <td>Reduction, Progesterone synthesis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1693</td>
    <td>Reduction, Plasma progesterone concentration </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1694</td>
    <td>Reduction, progesterone uptake, decresed maturation </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1695</td>
    <td>Impaired ovulation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1696</td>
    <td>Decrease of egg production and cummulative fecundity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1697</td>
    <td>Increase, DNA methyltransferase expression</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1698</td>
    <td>Increase, hypermethylation of the promotor region of gonadotropin releasing hormone receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1699</td>
    <td>Decrease, expression of gonadotropin releasing hormone receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1703</td>
    <td>Dysregulation of heart rate and vascular tone</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1705</td>
    <td>Impaired coordination and movement</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/173</td>
    <td>N/A, Methemoglobinemia, decreased hemoglobin, hematocrit, red blood cell number</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1738</td>
    <td>SARS-CoV-2 cell entry </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1740</td>
    <td>Induced dysregulation of ACE2 </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1741</td>
    <td>Induced, Angiotensin (Ang) II accumulation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1743</td>
    <td>Increase plasma Ang II</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1748</td>
    <td>Increase, the risk of acute respiratory failure</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1750</td>
    <td>Increased inflammatory immune responses</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1752</td>
    <td>Increased Angiotensin II </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1753</td>
    <td>Chronic reactive oxygen species</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1755</td>
    <td>beta-catenin activation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1756</td>
    <td>Decreased,  plasma 11-ketotestosterone level</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1757</td>
    <td>Reduce, Sperm count</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1758</td>
    <td>Impaired, Spermatogenesis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/176</td>
    <td>Damaging, Mitochondria</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1761</td>
    <td>Inhibition, Fin regeneration</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1762</td>
    <td>Urothelial cell injury/death</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1763</td>
    <td>Urothelial Tumor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1765</td>
    <td>Increase, Formation of DNA photoproducts</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1766</td>
    <td>Increase, DNA double-strand break</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1767</td>
    <td>Increase, Protein oxidation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1768</td>
    <td>Increase, Abnormal osmoregulation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1769</td>
    <td>Increase, Body fluid overload</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/177</td>
    <td>N/A, Mitochondrial dysfunction 1</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1770</td>
    <td>Decrease, Mitochondrial membrane potential</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1771</td>
    <td>Decrease, Adenosine triphosphate pool</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1772</td>
    <td>Decrease, Neutral lipids</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1773</td>
    <td>Decrease, Global DNA methylation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1774</td>
    <td>Increase, Caspase transcription</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1775</td>
    <td>Increase, Oocyte apoptosis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1776</td>
    <td>Increase, Ovarian somatic cell apoptosis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1777</td>
    <td>Increase, Ovarian follicle breakdown</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1778</td>
    <td>Decrease, Heritable DNA methylation (F3)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1779</td>
    <td>Increase, Caspase transcription (F3)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/178</td>
    <td>Disruption, Mitochondrial electron transport chain</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1780</td>
    <td>Increase, Oocyte apoptosis (F3)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1781</td>
    <td>Decrease, Fecundity (F3)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1782</td>
    <td>Decrease, Oogenesis (F3)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1783</td>
    <td>Increase, Ovarian somatic cell apoptosis (F3)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1784</td>
    <td>Increase, Ovarian follicle breakdown (F3)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1785</td>
    <td>Increase, Mitochondrial ATP synthase antagonism</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1786</td>
    <td>Nipple retention (NR), increased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1787</td>
    <td>Downregulation, ACE2</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1788</td>
    <td>Status epilepticus</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1789</td>
    <td>Reduction, 17beta-estradiol synthesis by the undifferentiated gonad </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/179</td>
    <td>Decreased, Mitochondrial fatty acid beta-oxidation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1790</td>
    <td>Increased, Differentiation to Testis </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1791</td>
    <td>Increased, Male Biased Sex Ratio</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1792</td>
    <td>Toll-like receptor 4 activation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1793</td>
    <td>Activator protein 1 activation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1794</td>
    <td>Pin-1 activation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1795</td>
    <td>Latent Transforming growth Factor beta expression</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1796</td>
    <td>11β-hydroxylase inhibition</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1798</td>
    <td>Decreased spermatogenesis </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1799</td>
    <td>Inhibition of 11β-HSD </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1800</td>
    <td>Granulosa cell proliferation of gonadotropin-independent follicles, Reduced</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1806</td>
    <td>Inhibition, Chitinase </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1807</td>
    <td>Inhibition, Chitobiase</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1814</td>
    <td>benzoquinone imine and acylglucuronide metabolites</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1815</td>
    <td>Activation of ER stress</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1816</td>
    <td>Mitochondrial dysfunction</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1817</td>
    <td>Apoptotic cell death</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1818</td>
    <td>Immune cell activation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1819</td>
    <td>IFNγ signaling</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1820</td>
    <td>Immune mediated hepatitis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1821</td>
    <td>Decrease, Cell proliferation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1825</td>
    <td>Increase, Cell death</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1827</td>
    <td>Increase, Global DNA methylation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1828</td>
    <td>Increased, Thyroxine (T4) in serum</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1829</td>
    <td>Altered, Thyroid hormone-dependent gene expression</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1830</td>
    <td>Displacement, Serum thyroxine (T4) from carrier protein</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1831</td>
    <td>Binding, Thyroid binding globulin in serum</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1834</td>
    <td>Decrease, Acyl-CoA dehydrogenases</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1835</td>
    <td>Cortisol and 11β-(OH) testosterone decreased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1836</td>
    <td>Decreased plasma Cortisol level</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1837</td>
    <td>decreased oocyte maturation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1839</td>
    <td>Testicular Cancer</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1840</td>
    <td>Inhibition, cytochrome oxidase</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1842</td>
    <td>Prolonged TLR9 activation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1843</td>
    <td>Multi Organ Failure involving Acute Respiratory Distress Syndrome</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1844</td>
    <td>systemic inflammatory response syndrome</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1845</td>
    <td>Coagulation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1846</td>
    <td>Thrombosis and Disseminated Intravascular Coagulation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1847</td>
    <td>Increased SARS-CoV-2 production</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1849</td>
    <td>Impaired gustatory nerve</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/185</td>
    <td>Increase, Mutations</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1850</td>
    <td>dysgeusia</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1851</td>
    <td>Binding of agonist, Angiotensin II receptor type 1 receptor (AT1R)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1852</td>
    <td>Increased Ang II type 1 receptor (AT1R)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1853</td>
    <td>Hyperactivation of ACE/Ang-II/AT1R axis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1854</td>
    <td>Dysregulation, ACE2 expression and activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/188</td>
    <td>Neuroinflammation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/192</td>
    <td>Altered, Neurophysiology</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/193</td>
    <td>Decreased, Nitric Oxide</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/195</td>
    <td>Inhibition, NMDARs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/202</td>
    <td>Inhibition, Nuclear factor kappa B (NF-kB)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/209</td>
    <td>Peptide Oxidation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/21</td>
    <td>Altered regulation, Alpha hemoglobin</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/211</td>
    <td>Propagation, Oxidative stress</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/213</td>
    <td>N/A, Parent compound is converted to the reactive metabolite and forms free radicals leading to oxidation of heme iron(II) in hemoglobin to iron(III)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/214</td>
    <td>Bile accumulation, Pathological condition</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/216</td>
    <td>Decreased, PCK1 expression (control point for glycolysis/gluconeogenesis pathway)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/219</td>
    <td>Reduction, Plasma 17beta-estradiol concentrations</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/220</td>
    <td>Increase, Plasma vitellogenin concentrations</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/221</td>
    <td>Reduction, Plasma vitellogenin concentrations</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/227</td>
    <td>Activation, PPARα</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/228</td>
    <td>peroxisome proliferator activated receptor promoter demethylation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/231</td>
    <td>Decreased, PPAR-alpha activation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/232</td>
    <td>Decreased, PPAR-beta activation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/233</td>
    <td>Decreased, PPAR-gamma activation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/239</td>
    <td>Activation, Pregnane-X receptor, NR1l2</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/240</td>
    <td>Feminisation or incomplete development, Primary and accessory male sex organs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/243</td>
    <td>Reduction, Prostaglandin E2 concentration</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/244</td>
    <td>Alkylation, Protein</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/245</td>
    <td>Activation, PXR/SXR</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/246</td>
    <td>Increase, RBC congestion in liver</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/249</td>
    <td>Production, Reactive oxygen species</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/25</td>
    <td>Agonism, Androgen receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/250</td>
    <td>Damaging, Red blood cells; hemolysis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/252</td>
    <td>Increase, Renal pathology due to VTG deposition</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/253</td>
    <td>N/A, Reproductive failure</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/257</td>
    <td>Increase, Reactive Oxygen Species production</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/265</td>
    <td>Activation, Stellate cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/266</td>
    <td>Decrease, Steroidogenic acute regulatory protein (STAR)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/269</td>
    <td>Induction, Sustained Cell Proliferation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/27</td>
    <td>N/A, Androgen receptor, Antagonism</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/270</td>
    <td>Induction, Sustained Hepatotoxicity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/274</td>
    <td>Reduction, Testosterone synthesis by ovarian theca cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/285</td>
    <td>Reduction, Vitellogenin synthesis in liver</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/288</td>
    <td>Activation of specific nuclear receptors, Transcriptional change</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/289</td>
    <td>Decrease, Translocator protein (TSPO)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/291</td>
    <td>Accumulation, Triglyceride</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/294</td>
    <td>N/A, Unknown</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/295</td>
    <td>Induction, Upregulation of glucuronyltransferase activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/3</td>
    <td>Reduction, 17beta-estradiol synthesis by ovarian granulosa cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/307</td>
    <td>Increase, Vitellogenin synthesis in liver</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/309</td>
    <td>Reduction, Vitellogenin accumulation into oocytes and oocyte growth/development</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/310</td>
    <td>Alteration, Wnt pathway</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/313</td>
    <td>Increase, Allergic Respiratory Hypersensitivity Response</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/317</td>
    <td>Altered, Cardiovascular development/function</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/319</td>
    <td>Loss, Cochlear function</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/321</td>
    <td>N/A, Cyanosis occurs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/323</td>
    <td>Increased, Disease susceptibility</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/327</td>
    <td>Accumulation, Fatty acid</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/328</td>
    <td>Decrease, Fecundity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/330</td>
    <td>Decrease, Fertility</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/334</td>
    <td>Promotion, Hepatocelluar carcinoma</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/336</td>
    <td>Increase, Heritable mutations in offspring</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/337</td>
    <td>N/A, Impairment of reproductive capacity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/339</td>
    <td>Altered, Larval development</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/341</td>
    <td>Impairment, Learning and memory</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/344</td>
    <td>N/A, Liver fibrosis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/345</td>
    <td>N/A, Liver Steatosis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/347</td>
    <td>Formation, Liver tumor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/348</td>
    <td>Malformation, Male reproductive tract</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/351</td>
    <td>Increased Mortality</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/356</td>
    <td>Increased, Oxidative damage</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/357</td>
    <td>Cholestasis, Pathology</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/360</td>
    <td>Decrease, Population growth rate</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/361</td>
    <td>Decline, Population</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/363</td>
    <td>Altered, Reproductive behaviour</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/364</td>
    <td>Impaired development of, Reproductive organs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/373</td>
    <td>Formation, Pro-mutagenic DNA Adducts</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/376</td>
    <td>Increased, Induced Mutations in Critical Genes</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/378</td>
    <td>Tumorigenesis, Hepatocellular carcinoma</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/382</td>
    <td>Aberrant, Dendritic morphology</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/383</td>
    <td>Reduced, Presynaptic release of glutamate</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/386</td>
    <td>Decrease of neuronal network function</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/388</td>
    <td>Overactivation, NMDARs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/39</td>
    <td>Increased Cholinergic Signaling</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/396</td>
    <td>Covalent Binding, Protein</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/398</td>
    <td>Activation, Dendritic Cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/40</td>
    <td>Decrease, Mitochondrial ATP production</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/402</td>
    <td>Cognitive Function, Decreased </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/403</td>
    <td>Suppression, Immune system</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/405</td>
    <td>irregularities, ovarian cycle</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/406</td>
    <td>impaired, Fertility</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/409</td>
    <td>Metabolism of AFB1, Production of Reactive Electrophiles</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/413</td>
    <td>Reduction, Testosterone synthesis in Leydig cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/414</td>
    <td>Increase, Luteinizing hormone (LH) </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/415</td>
    <td>Hyperplasia, Leydig cell</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/416</td>
    <td>Increase proliferation, Leydig cell </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/417</td>
    <td>skewed, sex ratio</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/418</td>
    <td>Increased, Vitellogenin synthesis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/419</td>
    <td>Increased, renal vitellogenin deposition</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/421</td>
    <td>Increased, glomerular rupture and renal hemorrhaging</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/422</td>
    <td>Increased, nephropathy</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/442</td>
    <td>Decreased, Population trajectory</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/444</td>
    <td>Increased, Atrioventricular block and bradycardia</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/445</td>
    <td>Respiratory distress/arrest</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/446</td>
    <td>Reduction, testosterone level</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/447</td>
    <td>Reduction, Cholesterol transport in mitochondria</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/450</td>
    <td>Suppression, VLDL secretion</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/451</td>
    <td>Inhibition, Mitochondrial fatty acid beta-oxidation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/454</td>
    <td>Increased, Triglyceride formation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/455</td>
    <td>Accumulation, Liver lipid</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/456</td>
    <td>Suppression, Constitutive androstane receptor, NR1l3</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/457</td>
    <td>Activation, SREBF1</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/458</td>
    <td>Increased, De Novo FA synthesis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/459</td>
    <td>Increased, Liver Steatosis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/46</td>
    <td>Accumulation, Biological membranes</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/461</td>
    <td>Suppression, HNF4alpha</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/462</td>
    <td>Up Regulation, SCD-1</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/463</td>
    <td>Up Regulation, FAS</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/465</td>
    <td>Increased, FA Influx</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/466</td>
    <td>Up Regulation, LDLR (low density lipoprotein receptor)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/467</td>
    <td>Increased, LDL uptake</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/468</td>
    <td>Inhibition, PPAR alpha</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/470</td>
    <td>Up Regulation, Acetyl-CoA carboxylase-1 (ACC-1)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/471</td>
    <td>Inhibition, FoxA2</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/472</td>
    <td>Down Regulation, CPT1A</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/474</td>
    <td>Down Regulation, HMGCS2</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/477</td>
    <td>Decreased, Ketogenesis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/478</td>
    <td>Activation, NRF2</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/479</td>
    <td>Activation, NR1H4</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/480</td>
    <td>Activation, SHP</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/482</td>
    <td>Decreased, DHB4/HSD17B4</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/483</td>
    <td>Activation, LXR alpha</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/484</td>
    <td>Activation, AKT2</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/486</td>
    <td>systemic inflammation leading to hepatic steatosis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/488</td>
    <td>Decrease, Ovulation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/49</td>
    <td>Reduction, Ca and HCO3 transport to shell gland</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/491</td>
    <td>Clonal Expansion/Cell Proliferation, to form Altered Hepatic Foci (AHF)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/493</td>
    <td>Increased, Insufficient repair or mis-repair of pro-mutagenic DNA adducts</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/494</td>
    <td>Glucocorticoid Receptor Agonist, Activation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/495</td>
    <td>Repressed expression of steroidogenic enzymes </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/496</td>
    <td>Increased apoptosis, decreased number of adult Leydig Cells </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/50</td>
    <td>Increase, Ca++ (intracellular)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/505</td>
    <td>Decreased sperm quantity / quality in the adult, Decreased fertility </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/52</td>
    <td>Decreased, Calcium influx</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/520</td>
    <td>Decreased sperm quantity or quality in the adult, Decreased fertility </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/525</td>
    <td>Apoptosis of adult Leydig cells, Decreased testosterone by adult Leydig cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/526</td>
    <td>Inhibition, Inhibition of Dopamine-beta-hydroxylase</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/527</td>
    <td>Decreased, Decreased fecundity </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/528</td>
    <td>Decreased, Synthesis of NE</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/529</td>
    <td>Decreased, GnRH cfos activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/530</td>
    <td>Decreased, GnRH pulsatility/release</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/531</td>
    <td>Decreased, LH Surge</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/532</td>
    <td>Delayed, Ovulation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/533</td>
    <td>Decreased, Cortical granule release/distribution upon fertilization</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/534</td>
    <td>Altered, Formation of cortical envelope</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/535</td>
    <td>Abnormal, Sperm penetration (polyspermy)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/536</td>
    <td>Altered, Chromosome number (polyploid) zygote</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/540</td>
    <td>Decreased testosterone by the fetal Leydig cells, Dysgensis of fetal Leydig cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/541</td>
    <td>Decreased testosterone by the fetal Leydig cells, Decreased COUP-TFII stem Leydig cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/543</td>
    <td>Decreased fertility in the adult, Decreased sperm quantity and/or quality in the adult testis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/55</td>
    <td>Cell injury/death</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/559</td>
    <td>Activation, Nicotinic acetylcholine receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/560</td>
    <td>Abnormal, Foraging activity and behavior</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/561</td>
    <td>Reduced, Food storage</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/563</td>
    <td>Death/Failure, Colony</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/564</td>
    <td>Abnormal, Roll change within caste</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/565</td>
    <td>Reduced, Brood care</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/566</td>
    <td>impaired, Larval development</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/568</td>
    <td>impaired, Hive thermoregulation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/57</td>
    <td>Proliferation, Cell proliferation in the absence of cytotoxicity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/570</td>
    <td>Accumulation, Damaged mitochondrial DNA</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/571</td>
    <td>Accelerated, Aging</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/572</td>
    <td>Decrease, Number of worker bees</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/573</td>
    <td>Increase, Energetic demands and therefore metabolic stress</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/574</td>
    <td>Increased, Appetite and hunger</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/576</td>
    <td>Increased, Viral susceptibility</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/577</td>
    <td>impaired, Development</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/578</td>
    <td>Decreased, Glucose oxidase enzyme activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/579</td>
    <td>Decreased, Hydrogen peroxide production</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/580</td>
    <td>Reduced, Antiseptic incorporated in food</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/585</td>
    <td>Decreased, Sodium conductance 1</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/586</td>
    <td>Reduced, swimming speed</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/587</td>
    <td>Reduced, feeding 1</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/588</td>
    <td>Increased, predation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/590</td>
    <td>N/A, hypoxia</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/591</td>
    <td>Increased, amputations</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/592</td>
    <td>Reduced, survival</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/593</td>
    <td>Inhibition, Ether-a-go-go (ERG) voltage-gated potassium channel </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/598</td>
    <td>modulation, sodium channel</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/599</td>
    <td>prolonged, Depolarization of neuronal membrane</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/600</td>
    <td>Overactivation, Neuronotransmitter release</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/601</td>
    <td>Overactivation, muscle contraction</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/602</td>
    <td>Increased, Ataxia, paralysis, or hyperactivity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/613</td>
    <td>Occurrence, Epileptic seizure</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/616</td>
    <td>Occurrence, A paroxysmal depolarizing shift</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/618</td>
    <td>Decreased, Neuronal network function in adult brain</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/621</td>
    <td>Increase, cilia movement</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/622</td>
    <td>Increased, locomotion</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/623</td>
    <td>Increase, predation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/624</td>
    <td>Increased, foot detachment</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/625</td>
    <td>Increased, muscular waves in foot</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/626</td>
    <td>Increased, serotonin (5-HT) </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/627</td>
    <td>Decreased, anxiety</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/629</td>
    <td>Decreased, sheltering</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/633</td>
    <td>Decrease, histaminergic neuron excitation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/634</td>
    <td>N/A, sedation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/635</td>
    <td>Decreased, locomotion</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/636</td>
    <td>Decreased, survival</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/638</td>
    <td>Antagonism, Histamine Receptor (H2)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/64</td>
    <td>Reduction, Ionotropic GABA receptor chloride channel conductance</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/640</td>
    <td>Decreased steroidogenesis, Proteomic alterations in the adult Leydig cell</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/642</td>
    <td>Decreased Cholesterol, Decreased De Novo Biosynthesis of Choleseterol</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/643</td>
    <td>Decreased Cholesterol, Decreased Uptake of Lipoproteins</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/644</td>
    <td>Decreased Cholesterol, Decreased Transport of Cholesterol to the Inner Mitochondrial Membrane</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/645</td>
    <td>Decreased Cholesterol, Decreased Testosterone Production by Adult Leydig Cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/646</td>
    <td>Decreased Cholesterol, Decreased sperm quantity and/or quality in the adult testis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/647</td>
    <td>Decreased steroidogenesis, Decreased Activity of Steroidogenic Enzymes in Adult Leydig cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/648</td>
    <td>Decreased steroidogenesis, Increased Apoptosis of Adult Leydig Cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/649</td>
    <td>Decreased steroidogenesis, Alterations in the Leydig Cell Cytoskeleton</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/650</td>
    <td>Stimulation of adult Leydig cells via the Adrenal Corticosterone, Increased Glucocorticoid</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/651</td>
    <td>Glucocorticoid Receptor mediated alterations in steriodogenic enzymes, Decreased testosterone by adult Leydig cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/652</td>
    <td>Direct effects of Corticosterone on steroidogenesis, Decreased testosterone by adult Leydig cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/653</td>
    <td>Decreased testosterone by the fetal Leydig cells, Increased corticosterone</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/654</td>
    <td>Decreased testosterone by the fetal Leydig cells, Activation by other glucocorticoid receptor agonists</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/655</td>
    <td>Decreased testosterone by the fetal Leydig cells, Increased COUP-TFII in fetal Leydig cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/656</td>
    <td>Decreased number and function of adult Leydig cells, Decreased COUP-TFII stem Leydig cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/657</td>
    <td>Decreased testosterone by the fetal Leydig cells, Dysgenesis of fetal Leydig cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/658</td>
    <td>Decreased testosterone by the fetal Leydig cells, Increased estradiol</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/659</td>
    <td>Decreased testosterone by the fetal Leydig cells, Activation by other estradiol agonists</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/660</td>
    <td>decreased testosterone by fetal Leydig cells, Dysgenesis of fetal Leydig cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/661</td>
    <td>Decreased testosterone by the fetal Leydig cells, Alterations in the fetal testis proteome</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/662</td>
    <td>Decreased testosterone by the fetal Leydig cells, Hypermethylation in the fetal testis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/664</td>
    <td>Overwhelmed, Mitochondrial DNA repair mechanisms</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/667</td>
    <td>Binding at picrotoxin site, iGABAR chloride channel</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/671</td>
    <td>Reduced, Prostaglandin F2alpha concentration, plasma </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/672</td>
    <td>Reduced, Prostaglandin F2alpha synthesis, ovary  </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/673</td>
    <td>Reduced, Spawning behavior</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/674</td>
    <td>Reduced, Ability to attract spawning mates</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/675</td>
    <td>Reduced, Reproductive Success</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/678</td>
    <td>Reduced, Pheromone release</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/679</td>
    <td>Decline, Population trajectory</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/68</td>
    <td>Accumulation, Collagen</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/681</td>
    <td>Decreased, Prostaglandin F2alpha synthesis, ovary  </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/682</td>
    <td>Generation, Amplified excitatory postsynaptic potential (EPSP)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/685</td>
    <td>Reduced, Prostaglandins, ovary</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/687</td>
    <td>Reduced, Prostaglandin E2 concentration, hypothalamus</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/689</td>
    <td>Reduced, Gonadotropin releasing hormone, hypothalamus</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/690</td>
    <td>Reduced, Luteinizing hormone (LH), plasma </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/691</td>
    <td>Reduced, Maturation inducing steroid, plasma</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/692</td>
    <td>Reduced, Maturation inducing steroid receptor signalling, oocyte</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/693</td>
    <td>Increased, cyclic adenosine monophosphate</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/694</td>
    <td>Reduced, Meiotic prophase I/metaphase I transition, oocyte</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/695</td>
    <td>Upregulated, Spindle assembly checkpoint protein Mad2-oocyte</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/696</td>
    <td>Increased, Chromosome misseggregation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/697</td>
    <td>impaired, ion channels</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/698</td>
    <td>Altered, Action Potential</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/699</td>
    <td>Increased, cardiac arrthymia</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/708</td>
    <td>Increased, Accumulation of alpha2u microglobulin (proximal tubular epithelium)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/709</td>
    <td>Increase, Cytotoxicity (renal tubular cell)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/710</td>
    <td>Increase, Regenerative cell proliferation (tubular epithelial cells)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/713</td>
    <td>Increase, Adenomas/carcinomas (renal tubular)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/714</td>
    <td>Increased, Binding of chemicals to 2u (serum)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/718</td>
    <td>Binding, Tubulin</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/719</td>
    <td>Increase, hepatocellular adenomas and carcinomas</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/720</td>
    <td>Disruption, Microtubule dynamics</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/721</td>
    <td>Disorganization, Meiotic Spindle</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/723</td>
    <td>Altered, Chromosome number</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/724</td>
    <td>Inhibition, Pyruvate dehydrogenase kinase (PDK) enzyme</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/726</td>
    <td>Increased, Induction of pyruvate dehydrogenase (PDH)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/728</td>
    <td>Increase, Aneuploid offspring</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/733</td>
    <td>Increase, Necrosis (terminal bronchiolar cells)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/734</td>
    <td>Increase, Regenerative cell proliferation (terminal bronchiolar epithelial cells)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/735</td>
    <td>Increase, Hyperplasia (terminal bronchiolar cells)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/736</td>
    <td>Increase, Adenomas/carcinomas (bronchioloalveolar)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/739</td>
    <td>Increase, Hypertrophy and proliferation (follicular cell)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/740</td>
    <td>Increase, Hyperplasia (follicular cells)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/741</td>
    <td>Increase, Adenomas/carcinomas (follicular cell)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/742</td>
    <td>Decreased, Androgen receptor activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/743</td>
    <td>Decreased, Testosterone binding to androgen receptor (hypothalamus)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/744</td>
    <td>Increase, Hyperplasia (Leydig cells)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/745</td>
    <td>Increase, Leydig cell tumors</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/746</td>
    <td>Increase, Dopaminergic activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/747</td>
    <td>Decreased, Prolactin</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/748</td>
    <td>Increased, Estrogen receptor (ER) activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/749</td>
    <td>Decreased, Progesterone from corpus luteum</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/754</td>
    <td>Increased, Luteinizing hormone (LH) </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/756</td>
    <td>Hippocampal gene expression, Altered </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/757</td>
    <td>Hippocampal anatomy, Altered </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/758</td>
    <td>Hippocampal Physiology, Altered</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/759</td>
    <td>Increased, Kidney Failure</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/760</td>
    <td>Activation, Glutamate-gated chloride channel</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/761</td>
    <td>Increased, Chloride conductance</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/762</td>
    <td>Activation, ionotropic GABA Receptor chloride channel</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/763</td>
    <td>hyperpolarisation, neuron</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/764</td>
    <td>N/A, Ataxia, paralysis, or hyperactivity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/765</td>
    <td>Decreased, population 1</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/766</td>
    <td>Inhibition, 4-hydroxyphenyl-pyruvate dioxygenase (HPPD) enzyme</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/767</td>
    <td>Increase, Hyperplasia (renal tubular cells)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/768</td>
    <td>Increase, Cytotoxicity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/769</td>
    <td>Increase, Oxidative metabolism</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/77</td>
    <td>Production, Critical Metabolites (CGA 330050 and CGA 265307)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/770</td>
    <td>Increase, Cytotoxicity (club cells)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/771</td>
    <td>Decrease, Serum thyroid hormone (T4/T3)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/772</td>
    <td>Increase, Hyperplasia (glandular epithelial cells of endometrium)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/773</td>
    <td>Increase, Endometrial adenocarcinomas</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/774</td>
    <td>Increase, Preneoplastic foci (hepatocytes)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/775</td>
    <td>Increased, Plasma tyrosine</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/776</td>
    <td>Increase, Cytotoxicity (corneal cells)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/777</td>
    <td>Increase, Inflammation (corneal cells)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/778</td>
    <td>Increase, Regenerative cell proliferation (corneal cells)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/779</td>
    <td>Increase, Papillomas/carcinomas (squamous cells)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/78</td>
    <td>Reduction, Cumulative fecundity and spawning</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/780</td>
    <td>Increase, Cytotoxicity (epithelial cells)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/781</td>
    <td>Increase, Regenerative cell proliferation (forestomach epithelial cells)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/782</td>
    <td>Increase, Hyperplasia (forestomach epithelial cells)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/783</td>
    <td>Increase, Cytotoxicity (tubular epithelial cells)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/784</td>
    <td>Increase, Hyperplasia (tubular epithelial cells)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/785</td>
    <td>Activation, Androgen receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/786</td>
    <td>Increase, Cytotoxicity (hepatocytes)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/787</td>
    <td>Increase, Regenerative cell proliferation (hepatocytes)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/790</td>
    <td>Inhibition, 5α-reductase activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/791</td>
    <td>Increased, Leutinizing hormone (LH)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/792</td>
    <td>Decrease, Bioactivation of testosterone</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/793</td>
    <td>Increase, Urinary bladder calculi</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/794</td>
    <td>Increase, Cytotoxicity (urothelial cells)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/795</td>
    <td>Increase, Regenerative cell proliferation (urothelial cells)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/796</td>
    <td>Increase, Hyperplasia (urothelial)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/797</td>
    <td>Increase, Adenomas/carcinomas (urothelial)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/798</td>
    <td>Inhibition, Prolyl hydroxylases</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/799</td>
    <td>Increased, HIF-1 heterodimer</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/8</td>
    <td>Decreased, 3-hydroxyacyl-CoA dehydrogenase type-2 activity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/80</td>
    <td>Up Regulation, CYP1A1</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/800</td>
    <td>Decreased, Aromatase (Cyp19a1) mRNA</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/801</td>
    <td>modulation, Unknown</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/802</td>
    <td>Increased, HIF-1 alpha transcription</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/804</td>
    <td>Inhibition, HMG-CoA reductase</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/805</td>
    <td>Decreased, mevalonate</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/807</td>
    <td>Decreased, cholesterol</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/808</td>
    <td>Decreased, Testosterone</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/809</td>
    <td>malformed, Male reproductive tract</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/813</td>
    <td>Increased, Serum creatinine</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/814</td>
    <td>Occurrence, Kidney toxicity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/818</td>
    <td>Occurrence, Cytoplasmic vacuolization (Renal tubule)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/819</td>
    <td>Decreased, Glomerular filtration</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/820</td>
    <td>Decreased, Renal plasma flow</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/821</td>
    <td>Decreased, Sodium reabsorption</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/823</td>
    <td>Occurrence, Cystic dilatation (renal tubule)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/824</td>
    <td>Occurrence, Cytoplasmic vacuolization (podocyte)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/825</td>
    <td>Decreased, Renal ability to dilute urine</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/827</td>
    <td>sensitisation, skin</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/828</td>
    <td>Inhibition, Phospholipase A</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/829</td>
    <td>Damage, Lipid bilayer</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/831</td>
    <td>Disturbance, Lysosomal function</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/832</td>
    <td>Injury, Mitochondria</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/833</td>
    <td>Occurrence, Cytoplasmic vacuolization (hepatocyte)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/835</td>
    <td>Occurrence, Ballooning degeneration (hepatocyte)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/836</td>
    <td>Occurrence, Cytoplasmic vacuolization (Bile duct cell)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/837</td>
    <td>Occurrence, Cytoplasmic vacuolization (kupffer cell)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/838</td>
    <td>Induction, Microvesicular fat</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/839</td>
    <td>Formation, Mallory body</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/840</td>
    <td>Formation, Liver fibrosis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/844</td>
    <td>Oxidation, Uroporphyrinogen</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/845</td>
    <td>Inhibition, UROD</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/846</td>
    <td>Accumulation, Highly carboxylated porphyrins</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/848</td>
    <td>Decreased, Binding of NE to NE receptors on GnRH neurons</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/849</td>
    <td>Inhibition, Antgonism of NE receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/850</td>
    <td>Induction, CYP1A2/CYP1A5</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/854</td>
    <td>Alterations, Cellular proliferation / hyperplasia</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/860</td>
    <td>Decreased, Mitochondrial Fatty Acid Beta Oxidation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/861</td>
    <td>Decreased, Ketogenesis (production of ketone bodies)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/862</td>
    <td>Not Increased, Circulating Ketone Bodies</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/863</td>
    <td>Increased, Catabolism of Muscle Protein</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/864</td>
    <td>Decreased, Body Weight</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/867</td>
    <td>Decrease, Intracellular pH</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/868</td>
    <td>Increase, Tissue Degeneration, Necrosis & Atrophy </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/869</td>
    <td>Increase, Respiratory or Squamous Metaplasia</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/87</td>
    <td>Release, Cytokine</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/870</td>
    <td>Increase, Cell Proliferation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/872</td>
    <td>Increase, Site of Contact Nasal Tumors</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/875</td>
    <td>Binding of agonist, Ionotropic glutamate receptors</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/876</td>
    <td>Increase, Mutations in Critical Genes</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/878</td>
    <td>Inhibition, SREBP1c</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/879</td>
    <td>Activation, MTTP</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/880</td>
    <td>Increased, ApoB100</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/881</td>
    <td>Increased, Triglyceride</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/885</td>
    <td>Increase, Cancer</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/889</td>
    <td>Impaired, Proteostasis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/890</td>
    <td>Degeneration of dopaminergic neurons of the nigrostriatal pathway</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/896</td>
    <td>Parkinsonian motor deficits</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/898</td>
    <td>Disruption, Lysosome</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/9</td>
    <td>Activation, 5HT2c</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/926</td>
    <td>Oxidation, Glutathione (To be considered with MIE)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/932</td>
    <td>KE4 : Uncoupling, eNOS</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/933</td>
    <td>KE6 : Depletion, Nitric Oxide</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/934</td>
    <td>KE3 : Decrease, Tetrahydrobiopterin</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/937</td>
    <td>KE7 : Impaired, Vasodilation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/945</td>
    <td>reduced dimerization, ARNT/HIF1-alpha</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/947</td>
    <td>Increase, Early Life Stage Mortality</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/951</td>
    <td>KE8 : Increase, Vascular Resistance</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/952</td>
    <td>Hypertension</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/964</td>
    <td>Inhibition of Aromatase Enzyme, Chemical exposure during critical window of estrous cycle between diestrus 2 and proestrus inhibits aromatase conversion of testosterone to estradiol</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/965</td>
    <td>reduction in ovarian granulosa cells synthesis of estradiol, Reduced steroidogenic production of estradiol in granulosa cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/966</td>
    <td>Reduced Estradiol in Circulation, Reduced steroidogenic production of estradiol in granulosa cells leading to decreased estradiol in circulation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/967</td>
    <td>Decreased positive estrogenic feedback on hypothalamus, Reduced estradiol in circulation decreases estrogen concentration at hypothalamus</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/968</td>
    <td>Decreased Kisspeptin release from neurons in AVPV, Decreased hypothalamic estrogen reduces kisspeptinergic neuron response </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/969</td>
    <td>Decreased GnRH Release, Decreased Kisspeptin stimulation of GnRH neurons </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/97</td>
    <td>Alkylation, DNA</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/970</td>
    <td>Decreased LH release from Anterior Pituitary, Decreased GnRH stimulation of Anterior Pituitary Gonadotrophs</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/971</td>
    <td>Ovulation of oocytes Reduced, Delayed, or Blocked, Decrease or delay in LH surge required for ovulation </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/972</td>
    <td>Decreased fertility, Reduced number of oocytes ovulated </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/986</td>
    <td>Impairment of TDAR</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/988</td>
    <td>Decrease, Circulating ecdysis triggering hormone</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/990</td>
    <td>Increase, Incomplete ecdysis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/993</td>
    <td>Decrease, Abdominal muscle contraction</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/996</td>
    <td>Decrease, Digestion of old cuticle</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/998</td>
    <td>Binding of antagonist, PPAR alpha</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1895</td>
    <td>NLRP3 inflammasome activity, increased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1864</td>
    <td>Increase, Programmed cell death</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1555</td>
    <td>Increase cell proliferation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/17</td>
    <td>Altered gene expression, AHR nuclear translocator (ARNT)-dependent pathway</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1857</td>
    <td>Platelet-neutrophil interactions, Increased </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1866</td>
    <td>Fibrinolysis, decreased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1867</td>
    <td>Bradykinin system, hyperactivated</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1869</td>
    <td>Diminished protective oxidative stress response</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1875</td>
    <td>Cerebrovascular disease (stroke)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1881</td>
    <td>Decreased, all-trans retinoic acid (atRA) concentration</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1901</td>
    <td>Interferon-I antiviral response, antagonized by SARS-CoV-2</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1902</td>
    <td>Repression of Gbx2 expression</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1906</td>
    <td>Cystic Fibrosis Transmembrane Regulator Function, Decreased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1907</td>
    <td>Airway Surface Liquid Height, Decreased </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1908</td>
    <td>Cilia Beat Frequency, Decreased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1909</td>
    <td>Mucociliary Clearance, Decreased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1911</td>
    <td>FOXJ1 Protein, Decreased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1912</td>
    <td>Motile Cilia Number/Length, Decreased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1939</td>
    <td>Viral infection and host-to-host transmission, proliferated</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1967</td>
    <td>Pyroptosis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1970</td>
    <td>transposition of the great arteries</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1981</td>
    <td>Decreased SIRT1 expression</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1008</td>
    <td>Reduced, Hearing</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/105</td>
    <td>Inhibition, Mitochondrial Electron Transport Chain Complexes</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1550</td>
    <td>Deposition of Ionizing Energy</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1607</td>
    <td>Increase, Necrosis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1647</td>
    <td>GSK3beta inactivation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1809</td>
    <td>Increase, Tissue/organ damage</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1855</td>
    <td>Increased Sodium-sensitive hypertension</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1856</td>
    <td>Imbalanced salty and sweet taste responses</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1861</td>
    <td>Increase, D1 protein deactivation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1862</td>
    <td>Decrease, Photosystem II efficiency</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1863</td>
    <td>Decrease, Reproduction</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1865</td>
    <td>Increase, Oxygen-evolving complex damage</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1868</td>
    <td>Hyperinflammation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1870</td>
    <td>Sustentacular cells, decrease </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1871</td>
    <td>olfactory sensory neurons, decrease </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1872</td>
    <td>Olfactory epithelium degeneration</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1873</td>
    <td>impaired olfactory function (anosmia) </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1874</td>
    <td>blood brain barrier disruption </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1877</td>
    <td>Altered, retinal layer structure</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1878</td>
    <td>Decreased, Eye size</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1879</td>
    <td>Bulky DNA adducts, increase</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1880</td>
    <td>Inhibition of ALDH1A (RALDH)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1882</td>
    <td>Disrupted meiotic initiation of fetal oogonia of the ovary</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1883</td>
    <td>Reduced size of the ovarian follicle pool </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1884</td>
    <td>Inhibition of Fyna</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1885</td>
    <td>Inhibition of Plxna2</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1886</td>
    <td>Overexpression of rasl11b</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1888</td>
    <td>Increased (ectopic) all-trans retinoic acid concentration</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1889</td>
    <td>Premature initiation of meiosis in fetal male germ cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1890</td>
    <td>Decrease (loss of) fetal male germ cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1891</td>
    <td>abnormal, placental labyrinth vasculature morphology</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1892</td>
    <td>increase, placental insufficiency</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1893</td>
    <td>increase, Preeclampsia</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1896</td>
    <td>Genomic instability</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1897</td>
    <td>increased MyD88 activation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1898</td>
    <td>increased release of danger/damage associated molecular patterns</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1899</td>
    <td>formation of neutrophil extracellular traps (NETs)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1900</td>
    <td>increased platelet surface TLR9 expression</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1903</td>
    <td>foxi1 expression, increased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1904</td>
    <td>six1b expression, increased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1905</td>
    <td>eya1 expression, inhibited</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1913</td>
    <td>Endothelial cell dysfunction </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1914</td>
    <td>Platelet activation, Increased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1915</td>
    <td>Neutrophil activation, Increased </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1916</td>
    <td>Thromboinflammation, Increased </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1917</td>
    <td>Altered gene expression, NRF2 dependent antioxidant pathway</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1920</td>
    <td>Altered gene expression, TGF-β dependent fibrosis pathway</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1921</td>
    <td>Altered gene expression, NF-kB dependent Interleukin-6 pathway</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1922</td>
    <td>Increased, Reactive metabolites production</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1923</td>
    <td>Altered gene expression, P53 dependent apoptosis pathway</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1930</td>
    <td>altered, inner ear development</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1931</td>
    <td>Intestinal barrier, disruption</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1933</td>
    <td>Increased, Interleukin-6 production</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1934</td>
    <td>Myocardial Infarction</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1935</td>
    <td>Angiotensin (1-7) levels diminished</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1936</td>
    <td>Angiotensin II degradation reduced</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1937</td>
    <td>ADAM17 expression induction</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1938</td>
    <td>ACE2 increased shedding</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1940</td>
    <td>Increases in cellular reactive oxygen species</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1941</td>
    <td>Memory Loss</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1942</td>
    <td>Accumulation, Cytosolic toxic Tau oligomers</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1943</td>
    <td>Hyperphosphorylation of Tau</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1944</td>
    <td>Synaptic dysfunction</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1945</td>
    <td>Dysfunctional Autophagy</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1946</td>
    <td>Impaired mechanotransduction of pericytes</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1947</td>
    <td>Pericyte dysfunction</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1948</td>
    <td>Increased ACE2 expression</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1949</td>
    <td>Decrease, GLUT4</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1950</td>
    <td>Increase, TNF</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1951</td>
    <td>Decrease, Glucose uptake</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1952</td>
    <td>Abnormal, Glucose homeostasis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1953</td>
    <td>Gestational diabetes mellitus</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1954</td>
    <td>Gut microbiota, alteration</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1955</td>
    <td>Acute Myeloid Leukemia</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1961</td>
    <td>Prolongation of Action Potential Duration</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1962</td>
    <td>Prolongation of QT interval</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1963</td>
    <td>Torsades de Pointes</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1964</td>
    <td>Sudden cardiac death</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1965</td>
    <td>Increase, Pollen abnormal</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1968</td>
    <td>Increase, Mitochondrial Dysfunction</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1969</td>
    <td>Increase, Oxidative Stress</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1971</td>
    <td>Increased, tumor growth</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1972</td>
    <td>Increased, Steroidogenic acute regulatory protein (StAR) </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1973</td>
    <td>Increased, estrogens </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1974</td>
    <td>Activation of Tumor Protein 53</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1977</td>
    <td>Disruption of sodium channel gating kinetics</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1978</td>
    <td>Increase risk, microcephaly</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1979</td>
    <td>Premature cell differentiation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1980</td>
    <td>Increased micro RNA expression</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1982</td>
    <td>metastatic breast cancer</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1983</td>
    <td>Disruption, action potential</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/902</td>
    <td>Inflammation, Liver</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/997</td>
    <td>Decreased, Population size</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2020</td>
    <td>Decrease, sox9 expression</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2021</td>
    <td>Increase, slincR expression</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2024</td>
    <td>Reduced complex sphingolipids</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2027</td>
    <td>Antagonism, Smoothened receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2040</td>
    <td>Decrease, GLI1/2 target gene expression</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2042</td>
    <td>Ororofacial clefting</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2043</td>
    <td>Decrease, Sonic Hedgehog second messenger production</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2044</td>
    <td>Decrease, Smoothend relocation and activation </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1299</td>
    <td>Activation, AKT</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1300</td>
    <td>Activation, mTORC1</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1310</td>
    <td>Activation, PI3K</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1554</td>
    <td>Increase Chromosomal Aberrations</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1985</td>
    <td>Increased, Kisspeptin signalling</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1986</td>
    <td>Decreased, Gonadotropins</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1987</td>
    <td>Decreased, Androgen and Progestin </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1988</td>
    <td>Decreased, Maturation Inducing Steroid Surge by Granulosa cells</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1989</td>
    <td>Impaired, Oocyte maturation and ovulation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1990</td>
    <td>Increased, Oocyte Atresia</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1991</td>
    <td>Impaired, Reproduction</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1995</td>
    <td>Abnormal lipid metabolism</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2005</td>
    <td>Altered neurotransmission in development</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2006</td>
    <td>Secondary genotoxicity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2007</td>
    <td>Non-coding RNA expression profile alteration</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2008</td>
    <td>Chronic obstructive pulmonary disease</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2009</td>
    <td>Activation of inflammation pathway</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2010</td>
    <td>Pulmonary inflammation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2011</td>
    <td>Emphysema</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2012</td>
    <td>Fibroblast proliferation and differentiation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2013</td>
    <td>Airway remodeling</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2017</td>
    <td>Endoplasmic reticulum stress</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2018</td>
    <td>Insulin resistance</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2019</td>
    <td>Non-alcoholic fatty liver disease</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2022</td>
    <td>Altered function of the brain</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2023</td>
    <td>Inhibition of Ceramide Synthase </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2025</td>
    <td>Affected folate transporter</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2026</td>
    <td>decreased folate uptake</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2028</td>
    <td>Decrease, GLI1/2 translocation to nucleus </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2029</td>
    <td>protein-coupled estrogen receptor 1 (GPER) activation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2030</td>
    <td>Activation, PARP1</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2031</td>
    <td>Releasing, Apoptosis-Inducing Factor (AIF)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2032</td>
    <td>Viable offspring, decreased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2033</td>
    <td>Increased sphingolipid-1-phosphate</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2034</td>
    <td>liver dysfunction</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2036</td>
    <td>Activation of metabotropic glutamate receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2037</td>
    <td>Inositol triphosphate receptor activation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2038</td>
    <td>Activation of calpain signalling</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2039</td>
    <td>Inhibition GABAA receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2041</td>
    <td>Decrease, palatal shelf outgrowth</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2045</td>
    <td>Increase, Alcohol dehydrogenase</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2046</td>
    <td>Increase, Vitellogenin mRNA</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2047</td>
    <td>Delay, Ovarian maturation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2048</td>
    <td>Increase, Body volume of female adults</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2049</td>
    <td>Increase, sex ratio (F/M)</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2050</td>
    <td>Increase, developmental abnormalities</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2051</td>
    <td>Decrease, Tyrosine</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2052</td>
    <td>Decrease, dopa decarboxylase</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2053</td>
    <td>Increase, Defects in tanning of new cuticle</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2054</td>
    <td>Increase,  impairment of cuticle sclerotization</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2055</td>
    <td>Increase,  pigmentation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2056</td>
    <td>Increase,  delay in oviposition</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2057</td>
    <td>Decrease,  hatching of egg</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2058</td>
    <td>Decrease, 20-hydroxyecdysone</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2059</td>
    <td>Decrease, knickkopf gene</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2060</td>
    <td>Decrease, Chitin laminar organization</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2061</td>
    <td>Decrease, Prevent chitin degradation by chitinases</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2062</td>
    <td>Weak, Procuticle protection</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2063</td>
    <td>Decrease, New cuticle secretion</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2064</td>
    <td>Increase, Cytosolic calcium</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2065</td>
    <td>Inhibition, Fatty acid oxidation </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2066</td>
    <td>Altered Signaling Pathways</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2067</td>
    <td>Altered, Nitric Oxide Levels</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2068</td>
    <td>Increase, Endothelial Dysfunction</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2096</td>
    <td>Occurrence, (Micro)vascular dysfunction</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/1998</td>
    <td>Activation, Microglia</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2082</td>
    <td>Hypospadias, increased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2084</td>
    <td>Increase, Cardiac remodelling</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2085</td>
    <td>Alveolar epithelial injury</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2086</td>
    <td>Airway inflammation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2087</td>
    <td>Increased incidence of respiratory disease</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2088</td>
    <td>Dysfunction of respiratory system</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2089</td>
    <td>Altered Bone Cell Homeostasis</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2090</td>
    <td>Increase, Bone Remodeling</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2091</td>
    <td>Occurrence, Bone Loss</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2092</td>
    <td>Promotion, Ovarian Cancer </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2093</td>
    <td>Brain thyroid hormone (T4/T3) decreased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2094</td>
    <td>Abnormal, neuroblast migration</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2095</td>
    <td>Periventricular heterotopia formation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2097</td>
    <td>Increase, Pro-Inflammatory Mediators</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2098</td>
    <td>Increase, Neural Remodeling</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2099</td>
    <td>hERG channel blockade</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2100</td>
    <td>Inhibition of rapid delayed rectifying potassium current </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2104</td>
    <td>Decreased, thyroid hormone binding to thyroid hormone receptor</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2105</td>
    <td>Decreased, myelin basic protein expression in oligodendrocytes</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2106</td>
    <td>Impaired, oligodendrocyte maturation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2107</td>
    <td>Hypomyelination</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2108</td>
    <td>Altered, white brain matter</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2109</td>
    <td>Binding, extracellular matrix protein laminin</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2110</td>
    <td>Disrupted binding, laminin-beta1-integrin receptors with laminin</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2111</td>
    <td>Decreased, neural progenitor cell adhesion to laminin</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2112</td>
    <td>Disturbed, radial glia cell alignment and migration</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2113</td>
    <td>Decreased, radial glia cell density</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2114</td>
    <td>Disturbed, cortical architecture</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2115</td>
    <td>Altered, cholesterol metabolism</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2116</td>
    <td>Decreased, oligodendrocyte differentiation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2117</td>
    <td>Increase, goblet cell number</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2118</td>
    <td>Succinate dehydrogenase, inhibited</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/130</td>
    <td>Depletion, GSH</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2119</td>
    <td>Insulin resistance, increased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2120</td>
    <td>Superoxide generation, increased</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2121</td>
    <td>decreased, Intellectual Quotient</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2122</td>
    <td>increased, Economic Burden</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2123</td>
    <td>decreased, Bcl-2 expression</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2124</td>
    <td>increased, Bax expression</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2125</td>
    <td>Increased fat mass</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2126</td>
    <td>Estrogen receptor alpha inactivation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2127</td>
    <td>Increased adipocyte size</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2128</td>
    <td>Increased adipocyte numbers</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2129</td>
    <td>Metabolically unhealthy Obesity</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2130</td>
    <td>increased lipid accumulation</td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2131</td>
    <td>Conjugation, Glutathione </td>
  </tr>
  <tr>
    <td>https://identifiers.org/aop.events/2132</td>
    <td>Increased pro-inflammatory cytokine expression</td>
  </tr>
</table>
## Code examples
### curl
```shell
curl -o keyeventWithTitle.rq https://raw.githubusercontent.com/BiGCAT-UM/PRA3006-SPARQL/master/sparql/keyeventWithTitle.rq
curl -H "Accept: text/tab-separated-values" -G https://query.wikidata.org/bigdata/namespace/wdq/sparql --data-urlencode query@keyeventWithTitle.rq
```
This SPARQL query is available under CCZero.
