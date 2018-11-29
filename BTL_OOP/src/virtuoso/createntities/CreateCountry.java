package virtuoso.createntities;

import java.util.List;
import java.util.ArrayList;

public class CreateCountry extends CreateEntities{
	private static int identifier = 0;
	private static List<String> countryLabel = new ArrayList<String>();
	private static List<String> countryDescription = new ArrayList<String>();
	
	public String getCountryLabel() {
		return countryLabel.get((int)(Math.random() * countryLabel.size()));
	}
	public void setCountryLabel(String fileName) {
		this.setList(fileName, countryLabel);
	}
	public String getCountryDescription() {
		return countryDescription.get((int)(Math.random() * countryDescription.size()));
	}
	public void setCountryDescription(String fileName) {
		this.setList(fileName, countryDescription);
	}
	public String getIdentifier() {
		return "Country" + identifier++;
	}
}
