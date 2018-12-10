package virtuoso.randomdata;

import java.util.Calendar;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Literal;
import org.eclipse.rdf4j.model.Value;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.query.BindingSet;
import org.eclipse.rdf4j.query.TupleQuery;
import org.eclipse.rdf4j.query.TupleQueryResult;
import org.eclipse.rdf4j.repository.RepositoryConnection;

import virtuoso.connectdb.ConnectionDB;
import virtuoso.createntities.CreateCountry;
import virtuoso.createntities.CreateEntities;
import virtuoso.createntities.CreateEvent;
import virtuoso.createntities.CreateLocation;
import virtuoso.createntities.CreateOrganization;
import virtuoso.createntities.CreatePerson;
import virtuoso.entity.Country;
import virtuoso.entity.Event;
import virtuoso.entity.Location;
import virtuoso.entity.Organization;
import virtuoso.entity.Person;
import virtuoso.filedata.FileData;

public class RandomEntity {
	static ConnectionDB connection = new ConnectionDB();
	
	public IRI person()
	{
		String namespace = connection.getPERSON().toString() + "/";
		CreatePerson cp = new CreatePerson();
		Person person = new Person(cp.getPersonIdentfier(), cp.getPersonLabel(), cp.getPersonDescription(), 
				cp.getTime(), cp.getLink(), cp.getPersonNationality());
//		RepositoryConnection con = connection.getConn();
//		ValueFactory vf = connection.getMyvf();
//		String strlabel = person.getLabel();
//		String irilabel = strlabel.replace(" ", "_");
		String iriIdentifier = person.getIdentifier();
		IRI iriPerson = connection.myvf.createIRI(namespace, iriIdentifier);
		connection.genIRI(namespace);
		connection.setNationality(namespace);
//		Literal identifier = vf.createLiteral(iriIdentifier);
		Literal label = connection.myvf.createLiteral(person.getLabel());
		Literal des = connection.myvf.createLiteral(person.getDescription());
		Literal time = connection.myvf.createLiteral(person.getTime());
		Literal link = connection.myvf.createLiteral(person.getLink());
		Literal national = connection.myvf.createLiteral(person.getNationality());
//		con.add(vf.createStatement(iriPerson, connection.getIdentifier(), identifier));
		connection.conn.add(connection.myvf.createStatement(iriPerson, connection.getLabel(), label));
		connection.conn.add(connection.myvf.createStatement(iriPerson, connection.getDescription(), des));
		connection.conn.add(connection.myvf.createStatement(iriPerson, connection.getTime(), time));
		connection.conn.add(connection.myvf.createStatement(iriPerson, connection.getLink(), link));
		connection.conn.add(connection.myvf.createStatement(iriPerson, connection.getNationality(), national));
		return iriPerson;
	}
	public IRI country() {
		String namespace = connection.getCOUNTRY().toString() + "/";
		CreateCountry cc = new CreateCountry();
		Country country = new Country(cc.getIdentifier(), cc.getCountryLabel(), cc.getCountryDescription(), cc.getTime(), cc.getLink());
		RepositoryConnection con = connection.getConn();
		ValueFactory vf = connection.getMyvf();
		String strlabel = country.getLabel();
		String irilabel = strlabel.replace(" ", "_");
		IRI iriCountry = vf.createIRI(namespace, irilabel);
		connection.genIRI(namespace);
		Literal identifier = vf.createLiteral(country.getIdentifier());
		Literal label = vf.createLiteral(country.getLabel());
		Literal des = vf.createLiteral(country.getDescription());
		Literal time = vf.createLiteral(country.getTime());
		Literal link = vf.createLiteral(country.getLink());
		con.add(vf.createStatement(iriCountry, connection.getIdentifier(), identifier));
		con.add(vf.createStatement(iriCountry, connection.getLabel(), label));
		con.add(vf.createStatement(iriCountry, connection.getDescription(), des));
		con.add(vf.createStatement(iriCountry, connection.getTime(), time));
		con.add(vf.createStatement(iriCountry, connection.getLink(), link));
		return iriCountry;
	}
	
	public IRI location() {
		String namespace = connection.getLOCATION().toString() + "/";
		CreateLocation cl = new CreateLocation();
		Location location = new Location(cl.getIdentifier(), cl.getLocationLabel(), cl.getLocationDescription(), cl.getTime(), cl.getLink());
		RepositoryConnection con = connection.getConn();
		ValueFactory vf = connection.getMyvf();
		String strlabel = location.getLabel();
		String irilabel = strlabel.replace(" ", "_");
		IRI iriLocation = vf.createIRI(namespace, irilabel);
		connection.genIRI(namespace);
		Literal identifier = vf.createLiteral(location.getIdentifier());
		Literal label = vf.createLiteral(location.getLabel());
		Literal des = vf.createLiteral(location.getDescription());
		Literal time = vf.createLiteral(location.getTime());
		Literal link = vf.createLiteral(location.getLink());
		con.add(vf.createStatement(iriLocation, connection.getIdentifier(), identifier));
		con.add(vf.createStatement(iriLocation, connection.getLabel(), label));
		con.add(vf.createStatement(iriLocation, connection.getDescription(), des));
		con.add(vf.createStatement(iriLocation, connection.getTime(), time));
		con.add(vf.createStatement(iriLocation, connection.getLink(), link));
		return iriLocation;
	}
	
	public IRI organization() {
		String namespace = connection.getORGANIZATION().toString() + "/";
		CreateOrganization co = new CreateOrganization();
		Organization organization = new Organization(co.getIdentifier(), co.getOrganizationLabel(), co.getOrganizationDescription(), co.getTime(), co.getLink(), co.getOrganizationheadquarter());
		RepositoryConnection con = connection.getConn();
		ValueFactory vf = connection.getMyvf();
		String strlabel = organization.getLabel();
		String irilabel = strlabel.replace(" ", "_");
		String iriIdentifier = organization.getIdentifier();
		IRI iriOrganization = vf.createIRI(namespace, iriIdentifier);
		//IRI iriOrganization = vf.createIRI(namespace, irilabel);
		connection.genIRI(namespace);
		connection.setHeadquarter(namespace);
		//Literal identifier = vf.createLiteral(organization.getIdentifier());
		Literal label = vf.createLiteral(organization.getLabel());
		Literal des = vf.createLiteral(organization.getDescription());
		Literal time = vf.createLiteral(organization.getTime());
		Literal link = vf.createLiteral(organization.getLink());
		Literal headquater = vf.createLiteral(organization.getHeadquarter());
	//	con.add(vf.createStatement(iriOrganization, connection.getIdentifier(), identifier));
		con.add(vf.createStatement(iriOrganization, connection.getLabel(), label));
		con.add(vf.createStatement(iriOrganization, connection.getDescription(), des));
		con.add(vf.createStatement(iriOrganization, connection.getTime(), time));
		con.add(vf.createStatement(iriOrganization, connection.getLink(), link));
		con.add(vf.createStatement(iriOrganization, connection.getHeadquarter(), headquater));
		return iriOrganization;
	}
	public IRI event() {
		String namespace = connection.getORGANIZATION().toString() + "/";
		CreateEvent ce = new CreateEvent();
		Event event = new Event(ce.getIdentifier(), ce.getEventLabel(), ce.getEventDescripion(), ce.getTime(), ce.getLink(), ce.getEventAddress());
		RepositoryConnection con = connection.getConn();
		ValueFactory vf = connection.getMyvf();
		String strlabel = event.getLabel();
		String irilabel = strlabel.replace(" ", "_");
		IRI iriEvent = vf.createIRI(namespace, irilabel);
		connection.genIRI(namespace);
		connection.setAddress(namespace);
		Literal identifier = vf.createLiteral(event.getIdentifier());
		Literal label = vf.createLiteral(event.getLabel());
		Literal des = vf.createLiteral(event.getDescription());
		Literal time = vf.createLiteral(event.getTime());
		Literal link = vf.createLiteral(event.getLink());;
		Literal address= vf.createLiteral(event.getAddress());
		con.add(vf.createStatement(iriEvent, connection.getIdentifier(), identifier));
		con.add(vf.createStatement(iriEvent, connection.getLabel(), label));
		con.add(vf.createStatement(iriEvent, connection.getDescription(), des));
		con.add(vf.createStatement(iriEvent, connection.getTime(), time));
		con.add(vf.createStatement(iriEvent, connection.getLink(), link));
		con.add(vf.createStatement(iriEvent, connection.getAddress(), address));
		return iriEvent;
	}
	public RandomEntity() {
		FileData FD = new FileData();
		CreateEntities CE = new CreateEntities();
		String time1  = FD.getTIME();
		CE.setTime(time1);
		CreatePerson CP = new CreatePerson(FD.getPERSON_LABEL(), FD.getPERSON_DESCRIPTION(), FD.getPERSON_NATIONALITY());
		CreateLocation CL = new CreateLocation(FD.getLOCATION_LABEL(), FD.getLOCATION_DESCRIPTION());
		CreateCountry CC = new CreateCountry(FD.getCOUNTRY_LABEL(), FD.getCOUNTRY_DESCRIPTION());
		CreateOrganization CO = new CreateOrganization(FD.getORGANZATION_LABEL(), FD.getORGANZATION_DESCRIPTION(), FD.getORGANZATION_HEADQUARTER());
		CreateEvent CEV = new CreateEvent(FD.getEVENT_LABEL(), FD.getEVENT_DESCRIPTION(), FD.getEVENT_ADDRESS());
	}
	
	
	public static void main(String[] args) {
		RepositoryConnection con = connection.getConn();
//		FileData FD = new FileData();
//		CreateEntities CE = new CreateEntities();
//		String time1  = FD.getTIME();
//		CE.setTime(time1);
//		CreatePerson CP = new CreatePerson(FD.getPERSON_LABEL(), FD.getPERSON_DESCRIPTION(), FD.getPERSON_NATIONALITY());
//		CreateLocation CL = new CreateLocation(FD.getLOCATION_LABEL(), FD.getLOCATION_DESCRIPTION());
//		CreateCountry CC = new CreateCountry(FD.getCOUNTRY_LABEL(), FD.getCOUNTRY_DESCRIPTION());
//		CreateOrganization CO = new CreateOrganization(FD.getORGANZATION_LABEL(), FD.getCOUNTRY_DESCRIPTION(), FD.getORGANZATION_HEADQUATER());
//		long begin = Calendar.getInstance().getTimeInMillis();
//		RandomEntity re = new RandomEntity();
//		for(int i = 0; i < 1000; i++) {
//			re.country();
//		}
//		long end = Calendar.getInstance().getTimeInMillis();
//		System.out.println("Time insert 1000000 : " + (end - begin) + "ms");
		// m  muon truy vaan cai gi y nhi
		//des  cua person co identifier la Person 0
		// chả có cái nào là prersonn01 cả		\ok
		String queryString = "PREFIX b:<http://database.com/virtuoso/Person/>\n"
				+ "select ?s ?o\n"
				+ "where{\n"
				+ "?s b:description ?o\n"
		
				
				 //+ "?s b:identifier ?o"
				+ "}";
//		String queryString = "PREFIX b:<http://database.com/virtuoso/Organization/>"
//				+ "select ?s ?t\n"
//				+ "where{\n"
//				+ "?s b:headquarter ?o\n"
//	
//				+ "filter regex(?o, \"Silae\")"
//				+ "?s b:label ?t"
//				+ "}";
//				//+ "limit 1000";
//		
//		/* queryString = "PREFIX b:<http://database.com/virtuoso/Country/>"
//				+ "select ?s ?p ?o \n"
//				+ "where{ \n"
//				+ "?s ?p ?o. \n"
//				+ "} \n";*/
		//int count = 0;
		//long begin = Calendar.getInstance().getTimeInMillis();
		TupleQuery query = con.prepareTupleQuery(queryString);
		//long end = Calendar.getInstance().getTimeInMillis();
		//System.out.println("Time insert 1000000 : " + (end - begin) + "ms");
		try {
			TupleQueryResult result = query.evaluate();
			
			while(result.hasNext()) {
				BindingSet solution = result.next();
				Value s = solution.getValue("s");
				Value p = solution.getValue("p");
				Value o = solution.getValue("o");
				Value t = solution.getValue("t");
				//System.out.println(s);
				//System.out.println(p);
				
				//System.out.println("Description:\t" + o);
				System.out.println(s);
				System.out.println(o);
				//System.out.println(t);
				System.out.println("/");
				//count++;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
//		System.out.println("Counter company in New York City  = " + count);
//		System.out.println("Time query : " + (end - begin) + "ms");
		System.out.println("end");
	}
		
}
