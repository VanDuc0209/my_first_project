package virtuoso.entity;

public class Organization extends Entities{
	private String headquarter;
	public Organization(String identifier, String label, String description, String time, String link, String headquater)
	{
		super(identifier, label, description, time, link);
		this.setHeadquarter(headquater);
	}
	public String getHeadquarter() {
		return headquarter;
	}
	public void setHeadquarter(String headquarter) {
		this.headquarter = headquarter;
	}

}
