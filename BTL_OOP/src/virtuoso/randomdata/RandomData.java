package virtuoso.randomdata;

import java.util.Calendar;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Value;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.query.BindingSet;
import org.eclipse.rdf4j.query.TupleQuery;
import org.eclipse.rdf4j.query.TupleQueryResult;
import org.eclipse.rdf4j.repository.RepositoryConnection;

import virtuoso.connectdb.ConnectionDB;
import virtuoso.filedata.FileData;
import virtuoso.relationship.Relasionship;

public class RandomData {
	String namespace = connection.getRELATIONSHIP().toString() + "/";
	FileData FD = new FileData();
	static ConnectionDB connection = new ConnectionDB();
	static RandomEntity RE = new RandomEntity();
	Relasionship relationship = new Relasionship(FD.getRELATIONSHIP());
	public IRI genEntity() {
		IRI entity = null;
		int tmp = (int)(Math.random() * 4);
		//a = tmp;
		switch (tmp){
		case 0:
			entity = RE.person();
			break;
		case 1:
			entity = RE.country();
			break;
		case 2:
			entity = RE.location();
			break;
		case 3:
			entity = RE.organization();
			break;
		case 4:
			entity = RE.event();
			break;
			default:
				
		}
		return entity;
	}
	public void genRelasionship() {
		int tmp1 = 5;
		int tmp2 = 5;
		IRI entity1 = genEntity();
		IRI entity2 = genEntity();
		/*switch (tmp1) {
		case 0:
			switch (tmp2) {
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				break;
			}
			break;
		case 1:
			switch (tmp2) {
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				break;
			}
			break;
		case 2:
			switch (tmp2) {
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				break;
			}
			break;
		case 3:
			switch (tmp2) {
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				break;
			}
			break;
		case 4:
			switch (tmp2) {
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				break;
			}
			break;
		default:
			break;
		}*/
		IRI iriRelationship = connection.myvf.createIRI(namespace, relationship.getRelationship());
		connection.conn.add(entity1, iriRelationship , entity2);
		iriRelationship = connection.myvf.createIRI(namespace, relationship.getRelationship());
		connection.conn.add(entity1, iriRelationship , entity2);
		iriRelationship = connection.myvf.createIRI(namespace, relationship.getRelationship());
		connection.conn.add(entity1, iriRelationship , entity2);
	}
	public static void main(String[] args) {
//		RepositoryConnection con = connection.getConn();
		long begin = Calendar.getInstance().getTimeInMillis();
		RandomData RD = new RandomData();
		for(int i = 0; i < 1000000; i++) {
			RD.genRelasionship();
		}
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.println("end.");
		System.out.println("Time insert: " + (end - begin) + " ms");
		/*String queryString = "PREFIX a:<http://database.com/virtuoso/Relationship/>\n"
				+ "prefix b:<http://database.com/virtuoso/Location/>\n"
				+ "prefix c:<http://database.com/virtuoso/Person/>\n"
				+ "Select ?s ?t \n"
				+ "Where {\n"
				+ "b:Bằng_Lũng a:concern ?o.\n"
				+ "?o c:label ?t\n"
	//			+ "?s b:label ?t "
				+ "}";
		int count = 0;
		TupleQuery query = connection.conn.prepareTupleQuery(queryString);
		try {
			TupleQueryResult result = query.evaluate();
			while(result.hasNext()) {
				BindingSet solution = result.next();
				Value s = solution.getValue("s");
				//Value p = solution.getValue("p");
				Value o = solution.getValue("o");
				Value t = solution.getValue("t");
				//System.out.println("Yima" + " reply " + t);
//				System.out.println(s);
//				System.out.println(o);
				System.out.println(t);
				System.out.println("/");
				count++;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		//System.out.println("counter =" +count);
	}
}
