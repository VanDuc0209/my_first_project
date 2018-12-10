package virtuoso.query;

import java.util.Calendar;

import org.eclipse.rdf4j.model.Value;
import org.eclipse.rdf4j.query.BindingSet;
import org.eclipse.rdf4j.query.TupleQuery;
import org.eclipse.rdf4j.query.TupleQueryResult;

import virtuoso.connectdb.ConnectionDB;

public class BasicQuery {
	ConnectionDB connection = new ConnectionDB();
	/**
	 * Lấy thông tin description
	 * @param entity loại thực thể
	 * @param personIdentifier định danh của thức thể
	 * @return query lấy thông tin description của thực thể có định danh đó
	 */
	public String basicQuery1(String entity, String entityIdentifier) {
		String query = "PREFIX  b:<http://database.com/virtuoso/" + entity + "/>"
				+ "select ?s ?description\n"
				+ "where{\n"
				+ "?s b:identifier ?o."
				+ "?s b:description ?description"
				+ "filter regex(?o, \"" + entityIdentifier + "\").\n"
				+ "}";
		return query;
	}
	/**
	 * Lấy tất cả thông tin của thực thể có tên: entityName
	 * @param entity loại thực thể
	 * @param entityName tên của thực thể
	 * @return quyre lấy tất cả thông tin của thực thể đó
	 */
	public String basicQuery2(String entity, String entityName) {
		String query = "PREFIX  b:<http://database.com/virtuoso/" + entity + "/>"
				+ "select ?identifier ?label ?description ?link ?time\n"
				+ "where{\n"
				+ "b:" + entityName + "b:identigier ?identigier.\n"
				+ "b:label ?label.\n"
				+ "b:description ?description.\n"
				+ "b:link ?link.\n"
				+ "b:time ?time.\n"
				+ "}";
		return query; 
	}
	/** 
	 * @param nameCountry: tên đất nước 
	 * In ra tên của tất cả những người có quốc tịch ở đất nước đã truyền vào
	 */
	public void basicQuery3(String nameCountry) {
		String queryString = "prefix :<http://database.com/virtuoso/Person/>\n"
				+ "select ?o\n"
				+ "where{\n"
				+ "?s :nationality ?t.\n"
				+ "?s :label ?o\n"
				+ "filter regex (?t, \"" + nameCountry +"\")\n"
				+ "}";
		int count = 0;
		long begin = Calendar.getInstance().getTimeInMillis();
		TupleQuery query = connection.conn.prepareTupleQuery(queryString);
		long end = Calendar.getInstance().getTimeInMillis();
		try {
			TupleQueryResult result = query.evaluate();
			
			while(result.hasNext()) {
				BindingSet solution = result.next();
				String o = solution.getValue("o").toString();
				System.out.println(o);
				System.out.println("--------------------------------");
				count++;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Counter: " + count);
		System.out.println("Time query: " + (end - begin) + " ms");
	}
	/**
	 * @param nameCity tên thành phố bất kì
	 * In ra tên tất cả công ty có trụ sở chính tại thành phố trên 
	 */
	public void basicQuery4(String nameCity) {
		String queryString = "prefix :<http://database.com/virtuoso/Organnization/>\n"
				+ "select ?o\n"
				+ "where{\n"
				+ "?s :headquarter ?t\n."
				+ "filter regex (?t, \"" + nameCity +"\")\n"
				+ "?s :label ?o\n"
				+ "}";
		System.out.println("listName Organization has headquarter in: " + nameCity);
		long begin = Calendar.getInstance().getTimeInMillis();
		TupleQuery query = connection.conn.prepareTupleQuery(queryString);
		long end = Calendar.getInstance().getTimeInMillis();
		try {
			TupleQueryResult result = query.evaluate();
			
			while(result.hasNext()) {
				BindingSet solution = result.next();
				String o = solution.getValue("o").toString();
				System.out.println(o);
				System.out.println("--------------------------------");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Time query: " + (end - begin) + " ms");
	}
	/**
	 * lấy thông tin 1 thuộc tính nào đó của tất cả các thực thể Person
	 * @param properties: 1 trong các thuộc tính của Person: label, description, time, link, nationality
	 */
	public void basicQuery5(String properties) {
		String queryString = "prefix :<http://database.com/virtuoso/Person/>\n"
				+ "select ?s ?o\n"
				+ "where{\n"
				+ "?s :" + properties + "?o\n"
				+ "}";
		long begin = Calendar.getInstance().getTimeInMillis();
		TupleQuery query = connection.conn.prepareTupleQuery(queryString);
		long end = Calendar.getInstance().getTimeInMillis();
		try {
			TupleQueryResult result = query.evaluate();
			
			while(result.hasNext()) {
				BindingSet solution = result.next();
				String s = solution.getValue("s").toString();
				String o = solution.getValue("o").toString();
				System.out.println(s);
				System.out.println(properties + ": " + o);
				System.out.println("--------------------------------");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Time query: " + (end - begin) + " ms");
	}
	/**
	 * in ra tên những người có quốc tịch Việt Nam
	 */
	public void basicQuery6() {
		String queryString = "prefix :<http://database.com/virtuoso/Person/>\n"
				+ "select ?o\n"
				+ "where{\n"
				+ "?s :nationality ?t.\n"
				+ "?s :label ?o\n"
				+ "filter regex(?t, \"Vietnam\")\n"
				+ "}";
		long begin = Calendar.getInstance().getTimeInMillis();
		TupleQuery query = connection.conn.prepareTupleQuery(queryString);
		long end = Calendar.getInstance().getTimeInMillis();
		int count = 0;
		try {
			TupleQueryResult result = query.evaluate();
			while(result.hasNext()) {
				BindingSet solution = result.next();
				String o = solution.getValue("o").toString();
				System.out.println(o);
				System.out.println("--------------------------------");
				count++;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Time query: " + (end - begin) + " ms");
		System.out.println("Số người có quốc tịch Việt Nam là: " + count);
	}
	
	public static void main(String[] args) {
		BasicQuery BQ = new BasicQuery();
		BQ.basicQuery3("Vietnam");
	}
}
