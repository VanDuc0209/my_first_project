package virtuoso.connectdb;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.repository.Repository;
import org.eclipse.rdf4j.repository.RepositoryConnection;

import virtuoso.rdf4j.driver.VirtuosoRepository;

public class ConnectionDB {
	private static final String URL = "jdbc:virtuoso://localhost:1111";
	private static final String USERNAME = "dba";
	private static final String PASSWORD = "dba";
	private static final String NAMESPACE = "http://database.com/virtuoso/";
	
	public static Repository myRepository = new VirtuosoRepository(URL, USERNAME, PASSWORD);
	public static RepositoryConnection conn = myRepository.getConnection();
	public static ValueFactory myvf = conn.getValueFactory();
	
	
	
	//IRI of entity
	protected IRI PERSON;
	protected IRI COUNTRY;
	protected IRI LOCATION;
	protected IRI EVENT;
	protected IRI ORGANIZATION;
	protected IRI RELATIONSHIP;
	//IRI 
	protected IRI identifier;
	protected IRI label;
	protected IRI description;
	protected IRI link;
	protected IRI time;
	protected IRI nationality;
	protected IRI continent;
	protected IRI headquarter;
	protected IRI address;
	


	public ConnectionDB() {
		PERSON = myvf.createIRI(NAMESPACE, "Person");
		COUNTRY = myvf.createIRI(NAMESPACE, "Country");
		LOCATION = myvf.createIRI(NAMESPACE, "Location");
		ORGANIZATION = myvf.createIRI(NAMESPACE, "Organization");
		EVENT = myvf.createIRI(NAMESPACE, "Event");
		RELATIONSHIP = myvf.createIRI(NAMESPACE, "Relationship");
		
//		identifier = myvf.createIRI(NAMESPACE, "identifier");
//		label = myvf.createIRI(NAMESPACE, "label");
//		description = myvf.createIRI(NAMESPACE, "description");
//		link = myvf.createIRI(NAMESPACE, "link");
//		time = myvf.createIRI(NAMESPACE, "time");
//		nationality = myvf.createIRI(NAMESPACE, "nationality");
//		continent = myvf.createIRI(NAMESPACE, "continent");
//		headquarter = myvf.createIRI(NAMESPACE, "headquarter");
//		address = myvf.createIRI(NAMESPACE, "address");
		
	}
	public void genIRI(String namespace) {
		label = myvf.createIRI(namespace, "label");
		identifier = myvf.createIRI(namespace, "identifier");
		description = myvf.createIRI(namespace, "description");
		link = myvf.createIRI(namespace, "link");
		time = myvf.createIRI(namespace, "time");
		nationality = myvf.createIRI(namespace, "nationality");
		headquarter = myvf.createIRI(namespace, "headquarter");
	}
	
	public RepositoryConnection getConn() {
		return conn;
	}
	public ValueFactory getMyvf() {
		return myvf;
	}
	public IRI getPERSON() {
		return PERSON;
	}


	public IRI getCOUNTRY() {
		return COUNTRY;
	}

	public IRI getLOCATION() {
		return LOCATION;
	}

	public IRI getEVENT() {
		return EVENT;
	}



	public IRI getORGANIZATION() {
		return ORGANIZATION;
	}





	public IRI getRELATIONSHIP() {
		return RELATIONSHIP;
	}
	public IRI getIdentifier() {
		return identifier;
	}
	public IRI getLabel() {
		return label;
	}
	public IRI getDescription() {
		return description;
	}
	public IRI getLink() {
		return link;
	}
	public IRI getTime() {
		return time;
	}
	public IRI getNationality() {
		return nationality;
	}
	public IRI getContinent() {
		return continent;
	}
	public IRI getHeadquarter() {
		return headquarter;
	}
	public IRI getAddress() {
		return address;
	}
	public void setContinent(String namespace) {
		continent = myvf.createIRI(namespace, "continent");
	}
	public void setHeadquarter(String namespace) {
		headquarter = myvf.createIRI(namespace, "headquarter");
	}
	public void setNationality(String namespace) {
		nationality = myvf.createIRI(namespace, "nationality");
	}
	
	public void setAddress(String namespace) {
		address = myvf.createIRI(namespace, "address");
	}
	
	public static void main(String[] args) {
		System.out.println("begin");
		Repository MyRepository = new VirtuosoRepository(URL, USERNAME, PASSWORD);
		RepositoryConnection con = MyRepository.getConnection();
		ValueFactory myvf = con.getValueFactory();
		IRI demo = myvf.createIRI(NAMESPACE, "demo");
		System.out.println(demo);
		System.out.println("end");
	}
}
