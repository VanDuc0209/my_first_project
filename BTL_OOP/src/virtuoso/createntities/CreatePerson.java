package virtuoso.createntities;

import java.util.List;
import java.util.ArrayList;

public class CreatePerson extends CreateEntities{
	private static int identifier = 0;
	private static List<String> personLabel = new ArrayList<String>();
	private static List<String> personDescription = new ArrayList<String>();
	private static List<String> personNationality = new ArrayList<String>();
	
	public String getPersonNationality() {
		return personNationality.get((int)(Math.random() * personNationality.size()));
	}
	public void setPersonNationality(String fileName) {
		this.setList(fileName, personNationality);
	}
	public void setPersonLabel(String fileName) {
		this.setList(fileName, personLabel);
	}
	public String getPersonLabel() {
		return personLabel.get((int)(Math.random() * personLabel.size()));
	}
	public String getPersonIdentfier()
	{
		return "Person" + identifier++;
	}
	public String getPersonDescription() {
		return personDescription.get((int)(Math.random() * personDescription.size()));
	}
	public void setPersonDescription(String fileName) {
		this.setList(fileName, personDescription);
	}
	public CreatePerson() {}
	/*javadoc
	 * Truyền vào các đường dẫn tới file dữ liệu của các thuộc tính.
	 * Khởi tạo đối tượng đồng thời khởi tạo List các thuộc tính
	 */
	public CreatePerson(String personLabel, String personDescription, String personNationality) {
		this.setPersonLabel(personLabel);
		this.setPersonDescription(personDescription);
		this.setPersonNationality(personNationality);
	}
}
