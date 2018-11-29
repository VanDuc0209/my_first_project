package org.example;


import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.Statement;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.vocabulary.FOAF;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import org.eclipse.rdf4j.model.vocabulary.RDFS;
import org.eclipse.rdf4j.query.QueryResults;
import org.eclipse.rdf4j.repository.Repository;
import org.eclipse.rdf4j.repository.RepositoryConnection;
import org.eclipse.rdf4j.repository.RepositoryResult;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.Rio;

import virtuoso.rdf4j.driver.VirtuosoRepository;
public class VirtuosoRDF {

	public static void main(String[] args) {
		Repository myRepository = new VirtuosoRepository("jdbc:virtuoso://localhost:1111","dba","dba");
		myRepository.initialize();
		
		String namespace = "http://exampleaaa.org/";
		ValueFactory f = myRepository.getValueFactory();
		IRI hoang = f.createIRI(namespace, "long");
		try (RepositoryConnection conn = myRepository.getConnection()) {
			conn.add(hoang, RDF.TYPE, FOAF.AGE);
			conn.add(hoang, RDFS.LABEL, f.createLiteral("2001-20-10"));
			conn.add(hoang, RDF.TYPE, FOAF.BIRTHDAY);
			conn.add(hoang, RDFS.LABEL, f.createLiteral("1998"));
			RepositoryResult<Statement> statements = conn.getStatements(hoang, null, null);
			Model model = QueryResults.asModel(statements);
			model.setNamespace("rdf",RDF.NAMESPACE);
			model.setNamespace("rdfs",RDFS.NAMESPACE);
			model.setNamespace("foaf",FOAF.NAMESPACE);
			model.setNamespace("ex", namespace);
			Rio.write(model, System.out, RDFFormat.TURTLE);
			System.out.println("thuyen");
			conn.close();
		}
	}	
}
