# Using SPARQL to query Life Science Databases

<script type="application/ld+json">
{
  "@context":"http://schema.org/",
  "@type":"CreativeWork",
  "about":"This book describes various life sciences databases with SPARQL endpoints.",
  "genre":[{
    "@type":"URL","url":"http://edamontology.org/topic_4019"
  }],
  "name":"Using SPARQL to query Life Science Databases",
  "keywords":"cheminformatics, chemoinformatics, bioinformatics, databases, SPARQL",
  "license":"CC BY-SA 4.0",
  "url": "https://bigcat-um.github.io/PRA3006-SPARQL/"
}
</script>

**Ammar Ammar&nbsp;<a href="https://orcid.org/0000-0002-8399-8990"><img alt="ORCID icon" src="./images/orcid.png">&nbsp;0000-0002-8399-8990</a>,
Marvin Martens&nbsp;<a href="https://orcid.org/0000-0003-2230-0840"><img alt="ORCID icon" src="./images/orcid.png">&nbsp;0000-0003-2230-0840</a>,
Egon L. Willighagen&nbsp;<a href="https://orcid.org/0000-0001-7542-0286"><img alt="ORCID icon" src="./images/orcid.png">&nbsp;0000-0001-7542-0286</a>**

© 2021-2023 The Authors

License: CC-BY-SA 4.0 International

This book is written in Markdown with additional instructions that are preprocessed.
Part of the content is based on previous workshops, funded by various projects
funded by the European Commission.

Wishes, comments, and pull requests can be send to
[this GitHub repository](https://github.com/BiGCAT-UM/PRA3006-SPARQL/).

## Contents

1. [Introduction](intro.md) <br />
1.1. [SPARQL query language](intro.md#sparql-query-language) <br />
1.2. [This book](intro.md#this-book) <br />
2. [List of Databases](list.md) <br />
2.1. [Other useful resources](list.md#other-useful-resources) <br />
3. [Biology](entities.md) <br />
3.1. [Biological entities](entities.md#biological-entities) <br />
3.1.1. [Genes](entities.md#genes) <br />
3.1.2. [Proteins](entities.md#proteins) <br />
3.1.3. [Small compounds](entities.md#small-compounds) <br />
4. [Generic queries](generic.md) <br />
4.1. [Listing all classess](generic.md#listing-all-classess) <br />
4.2. [Listing all items of some class](generic.md#listing-all-items-of-some-class) <br />
4.3. [Listing all properties of some class](generic.md#listing-all-properties-of-some-class) <br />
5. [AOP-Wiki](aopwiki.md) <br />
5.1. [Entities](aopwiki.md#entities) <br />
5.2. [Data model](aopwiki.md#data-model) <br />
5.3. [Example queries](aopwiki.md#example-queries) <br />
5.3.1. [Counting key events](aopwiki.md#counting-key-events) <br />
6. [ChEMBL](chembl.md) <br />
6.1. [Entities](chembl.md#entities) <br />
6.2. [Data model](chembl.md#data-model) <br />
6.3. [Exercises](chembl.md#exercises) <br />
6.3.1. [ChEMBL sources](chembl.md#chembl-sources) <br />
6.3.2. [Counting assays](chembl.md#counting-assays) <br />
6.3.3. [Binding affinities](chembl.md#binding-affinities) <br />
6.3.4. [Assays and UniProt IDs](chembl.md#assays-and-uniprot-ids) <br />
7. [Wikidata](wikidata.md) <br />
7.1. [Entities](wikidata.md#entities) <br />
7.2. [Data model](wikidata.md#data-model) <br />
7.3. [Example queries](wikidata.md#example-queries) <br />
7.3.1. [Proteins](wikidata.md#proteins) <br />
7.3.2. [Chemicals](wikidata.md#chemicals) <br />
8. [WikiPathways](wikipathways.md) <br />
8.1. [Entities](wikipathways.md#entities) <br />
8.2. [Data model](wikipathways.md#data-model) <br />
8.3. [Example queries](wikipathways.md#example-queries) <br />
8.3.1. [Asking information for a specific pathway](wikipathways.md#asking-information-for-a-specific-pathway) <br />
8.3.2. [A lipid pathway](wikipathways.md#a-lipid-pathway) <br />
8.3.3. [A federated SPARQL query](wikipathways.md#a-federated-sparql-query) <br />

[Index](indexList.md) <br />
