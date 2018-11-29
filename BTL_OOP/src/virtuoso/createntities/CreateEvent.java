package virtuoso.createntities;

import java.util.List;
import java.util.ArrayList;

public class CreateEvent extends CreateEntities{
	private static int identifier = 0;
	private static List<String> eventDescripion  = new ArrayList<String>();
	private static List<String> eventLabel = new ArrayList<String>();
	private static List<String> eventAddress = new ArrayList<String>();
	
	public static List<String> getEventDescripion() {
		return eventDescripion;
	}
	public void setEventDescripion(String fileName) {
		this.setList(fileName, eventLabel);
	}
	public String getEventLabel() {
		return eventLabel.get((int)(Math.random() * eventLabel.size()));
	}
	public void setEventLabel(String fileName) {
		this.setList(fileName, eventLabel);
	}
	public String getEventAddress() {
		return eventAddress.get((int)(Math.random() * eventAddress.size()));
	}
	public void setEventAddress(String fileName) {
		this.setList(fileName, eventAddress);
	}
	public String getIdentifier() {
		return "Event" + identifier++;
	}
	public CreateEvent() {}
	/*javadoc
	 * Truyền vào các đường dẫn tới file dữ liệu của các thuộc tính.
	 * Khởi tạo đối tượng đồng thời khởi tạo List các thuộc tính
	 */
	public CreateEvent(String eventDescripion, String eventLabel, String eventAddress) {
		this.setEventDescripion(eventDescripion);
		this.setEventLabel(eventLabel);
		this.setEventAddress(eventAddress);
	}
}
