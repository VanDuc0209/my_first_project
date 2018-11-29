package virtuoso.entity;

public class Person extends Entities{
	private String nationality;
	public Person(String identifier, String label, String description, String time, String link, String nationality) {
		super(identifier,label, description,  time, link);
		this.nationality = nationality;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	@Override
	public String toString() {
		return "Identifier: " + this.identifier +"\nLable: " + this.label +"\nDescription: "+ this.description +"\nTime: " + this.time + "\nLink: " + this.link + "\nNationality: "+ this.nationality;
	}
}
