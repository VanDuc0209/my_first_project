package virtuoso.createntities;

import java.util.ArrayList;
import java.util.List;

public class CreateOrganization extends CreateEntities{
	private static int identifier = 0;
	private static List<String> organizationLabel = new ArrayList<String>();
	private static List<String> organizationDescription = new ArrayList<String>();
	private static List<String> organizationHeadquater = new ArrayList<String>();
	
	public String getCountryLabel() {
		return organizationLabel.get((int)(Math.random() * organizationLabel.size()));
	}
	public void setCountryLabel(String fileName) {
		this.setList(fileName, organizationLabel);
	}
	public String getCountryDescription() {
		return organizationDescription.get((int)(Math.random() * organizationDescription.size()));
	}
	public void setCountryDescription(String fileName) {
		this.setList(fileName, organizationDescription);
	}
	public String getIdentifier() {
		return "Country" + identifier++;
	}
	public String getOrganizationheadquater() {
		return organizationHeadquater.get((int)(Math.random() * organizationHeadquater.size()));
	}
	public void setOrganizationheadquater(String fileName) {
		this.setList(fileName, organizationHeadquater);
	}
	public CreateOrganization() {}
	/*javadoc
	 * Truyền vào các đường dẫn tới file dữ liệu của các thuộc tính.
	 * Khởi tạo đối tượng đồng thời khởi tạo List các thuộc tính
	 */
	public CreateOrganization(String organizationLabel, String organizationDescription, String organizationHeadquater)
	{
		this.setCountryLabel(organizationLabel);
		this.setCountryDescription(organizationDescription);
		this.setOrganizationheadquater(organizationHeadquater);
	}
}
