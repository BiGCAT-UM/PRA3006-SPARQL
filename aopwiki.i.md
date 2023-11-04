# AOP-Wiki

The <topic>AOP-Wiki</topic> SPARQL endpoint is loaded with RDF of the
<topic>Adverse Outcome Pathway</topic> (AOP)-Wiki database
(https://aopwiki.org/)  [<cite>Q111081275</cite>]. The AOP-Wiki serves as the primary repository of qualitative information
for AOPs and is a central component in the AOP development effort coordinated by the Organisation
for Economic Co-operation and Development (OECD). These AOPs describe mechanistic information about
toxicodynamic processes and can be used to develop effective risk assessment strategies. An AOP
is initiated by a stressor (e.g. a chemical) that causes a <topic>Molecular Initiating Event</topic>, which is
followed by <topic>Key Eevent</topic>s (measurable, essential steps) along a pathway towards an Adverse Outcome
for an organism or population. KEs are connected through Key Event Relationships (KERs), which
capture the evidence supporting the AOP in a structured way. 

The AOP-Wiki SPARQL endpoint is accessible on [https://aopwiki.rdf.bigcat-bioinformatics.org](https://aopwiki.rdf.bigcat-bioinformatics.org/)

## Entities

The main classes are:

* Adverse Outcome Pathway: a pathway that describes how an initiating event leads to an adverse outcome
* Gene
* Protein 

## Data model

The figure describing the RDF schema:

<img src="images/AOP-Wiki-RDF-simple.png">

## Example queries

The simplest SPARQL queries to explore RDF is to retrieve full lists of subjects of a particular type, which is
frequently defined with the predicate `rdfs:type` or `a` which can be used interchangably. See the below
example of listing all Key Events.

<sparql>keyevent</sparql>

Since the Key Event links can bring you to the AOP-Wiki for further exploration of the corresponding webpage,
we can also directly request all their contents through the SPARQL query. For example, to extract the
Key Event title, we add `?KE dc:title ?KEtitle` to the SPARQL query. The returned table upon running the
query will get wider, so you might need to scroll to the right. 

<sparql>keyeventWithTitle</sparql>

### Counting key events

This exercise is about creating simple SPARQL queries that count particular types of subjects in the
RDF. See the example SPARQL query below that counts the number of Key Events in the RDF.

```sparql
SELECT (count (?KE) as ?nKE) 
WHERE {
  ?KE a aopo:KeyEvent .
}
```

## References

<references/>
