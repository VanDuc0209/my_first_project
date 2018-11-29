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
	private static final String NAMESPACE = "http://database.com/virtuoso#";
	
	protected static Repository myRepository = new VirtuosoRepository(URL, USERNAME, PASSWORD);
	protected static RepositoryConnection conn = myRepository.getConnection();
	protected static ValueFactory myvf = conn.getValueFactory();
	
	
	
	//IRI of entity
	protected jgit en tr IRI PERSON;
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
	
	public ConnectionDB() {
		PERSON = myvf.createIRI(NAMESPACE, "Person");
		COUNTRY = myvf.createIRI(NAMESPACE, "Country");
		LOCATION = myvf.createIRI(NAMESPACE, "Location");
		ORGANIZATION = myvf.createIRI(NAMESPACE, "Organizayion");
		EVENT = myvf.createIRI(NAMESPACE, "Event");
		RELATIONSHIP = myvf.createIRI(NAMESPACE, "Relationship");
		
		identifier = myvf.createIRI(NAMESPACE, "identifier");
		label = myvf.createIRI(NAMESPACE, "label");
		description = myvf.createIRI(NAMESPACE, "description");
		link = myvf.createIRI(NAMESPACE, "link");
		time = myvf.createIRI(NAMESPACE, "time");
		nationality = myvf.createIRI(NAMESPACE, "nationality");
		continent = myvf.createIRI(NAMESPACE, "continent");
		headquarter = myvf.createIRI(NAMESPACE, "headquarter");
		
	}
	
	
	public RepositoryConnection getConn() {
		return conn;
	}

	public IRI getPERSON() {
		return PERSON;
	}


	public void setPERSON(IRI pERSON) {
		PERSON = pERSON;
	}


	public IRI getCOUNTRY() {
		return COUNTRY;
	}


	public void setCOUNTRY(IRI cOUNTRY) {
		COUNTRY = cOUNTRY;
	}


	public IRI getLOCATION() {
		return LOCATION;
	}


	public void setLOCATION(IRI lOCATION) {
		LOCATION = lOCATION;
	}


	public IRI getEVENT() {
		return EVENT;
	}


	public void setEVENT(IRI eVENT) {
		EVENT = eVENT;
	}


	public IRI getORGANIZATION() {
		return ORGANIZATION;
	}


	public void setORGANIZATION(IRI oRGANIZATION) {
		ORGANIZATION = oRGANIZATION;
	}


	public IRI getRELATIONSHIP() {
		return RELATIONSHIP;
	}


	public void setRELATIONSHIP(IRI rELATIONSHIP) {
		RELATIONSHIP = rELATIONSHIP;
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
