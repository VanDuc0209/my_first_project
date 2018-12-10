package virtuoso.createntities;

import java.util.ArrayList;
import java.util.List;

public class CreateOrganization extends CreateEntities{
	private static int identifier = 0;
	private static List<String> organizationLabel = new ArrayList<String>();
	private static List<String> organizationDescription = new ArrayList<String>();
	private static List<String> organizationHeadquarter = new ArrayList<String>();
	
	public String getOrganizationLabel() {
		return organizationLabel.get((int)(Math.random() * organizationLabel.size()));
	}
	public void setOrganizationLabel(String fileName) {
		this.setList(fileName, organizationLabel);
	}
	public String getOrganizationDescription() {
		return organizationDescription.get((int)(Math.random() * organizationDescription.size()));
	}
	public void setOrganizationDescription(String fileName) {
		this.setList(fileName, organizationDescription);
	}
	public String getIdentifier() {
		return "Organization" + identifier++;
	}
	public String getOrganizationheadquarter() {
		return organizationHeadquarter.get((int)(Math.random() * organizationHeadquarter.size()));
	}
	public void setOrganizationheadquarter(String fileName) {
		this.setList(fileName, organizationHeadquarter);
	}
	public CreateOrganization() {}
	/*javadoc
	 * Truyền vào các đường dẫn tới file dữ liệu của các thuộc tính.
	 * Khởi tạo đối tượng đồng thời khởi tạo List các thuộc tính
	 */
	public CreateOrganization(String organizationLabel, String organizationDescription, String organizationHeadquater)
	{
		this.setOrganizationLabel(organizationLabel);
		this.setOrganizationDescription(organizationDescription);
		this.setOrganizationheadquarter(organizationHeadquater);
	}
}
