package virtuoso.query;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Literal;
import org.eclipse.rdf4j.model.Value;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.query.BindingSet;
import org.eclipse.rdf4j.query.TupleQuery;
import org.eclipse.rdf4j.query.TupleQueryResult;
import org.eclipse.rdf4j.repository.Repository;
import org.eclipse.rdf4j.repository.RepositoryConnection;
import virtuoso.rdf4j.driver.VirtuosoRepository;

public class Demo {

	public static void main(String[] args) {
		String namespace = "http://example.com/";
		Repository myRespository = new VirtuosoRepository("jdbc:virtuoso://localhost:1111", "dba", "dba");
		try(RepositoryConnection conn = myRespository.getConnection())
		{
			ValueFactory vf = conn.getValueFactory();
			IRI PERSON = vf.createIRI(namespace, "Person");
			IRI label  = vf.createIRI(namespace, "label");
			Literal labelPerson = vf.createLiteral("duccao");
			conn.add(vf.createStatement(PERSON, label, labelPerson));
			
			String queryString = "PREFIX a:<http://example.com/> \n"
					+ "Select ?s ?o \n"
					+ "where { \n"
					+ "?s a:label ?o \n"
					+ "}";
			TupleQuery query = conn.prepareTupleQuery(queryString);
			
			try {
				TupleQueryResult result = query.evaluate();
				while(result.hasNext()) {
					BindingSet solution = result.next();
					Value cn = solution.getValue("s");
					Value vn = solution.getValue("o");
					System.out.println(cn);
					System.out.println(vn);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
					
		}
	}
}


