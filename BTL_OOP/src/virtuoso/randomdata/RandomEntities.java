package virtuoso.randomdata;

import org.eclipse.rdf4j.model.IRI;

import virtuoso.connectdb.*;
import virtuoso.createntities.*;
import virtuoso.entity.Person;


public class RandomEntities {
	public IRI Person()
	{
		CreatePerson cp = new CreatePerson();
		Person person = new Person(cp.getPersonIdentfier(), cp.getPersonLabel(), cp.getPersonDescription(), cp.getTime(), cp.getLink(), cp.getPersonNationality());
		ConnectionDB con = new ConnectionDB();
		IRI iriPerson = con.getCOUNTRY();
		return iriPerson;
	}
}
