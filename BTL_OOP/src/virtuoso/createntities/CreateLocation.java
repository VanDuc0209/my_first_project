package virtuoso.createntities;

import java.util.ArrayList;
import java.util.List;

public class CreateLocation extends CreateEntities{
	private static int identifier = 0;
	private static List<String> locationLabel = new ArrayList<String>();
	private static List<String> locationDescription = new ArrayList<String>();
	
	public String getCountryLabel() {
		return locationLabel.get((int)(Math.random() * locationLabel.size()));
	}
	public void setCountryLabel(String fileName) {
		this.setList(fileName, locationLabel);
	}
	public String getCountryDescription() {
		return locationDescription.get((int)(Math.random() * locationDescription.size()));
	}
	public void setCountryDescription(String fileName) {
		this.setList(fileName, locationDescription);
	}
	public String getIdentifier() {
		return "Location" + identifier++;
	}
	public CreateLocation() {}
	/*javadoc
	 * Truyền vào các đường dẫn tới file dữ liệu của các thuộc tính.
	 * Khởi tạo đối tượng đồng thời khởi tạo List các thuộc tính
	 */
	public CreateLocation(String locationLabel, String locationDescription) {
		this.setCountryLabel(locationLabel);
		this.setCountryDescription(locationDescription);
	}
}
