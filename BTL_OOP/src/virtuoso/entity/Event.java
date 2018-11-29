package virtuoso.entity;


public class Event extends Entities{
	private String address; 
	public Event(String identifier, String label, String description, String time, String link, String address)
	{
		super(identifier, label, description, time, link);
		this.setAddress(address);
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
