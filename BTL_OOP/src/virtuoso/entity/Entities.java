package virtuoso.entity;


public class Entities {
	protected String identifier;
	protected String label;
	protected String description;
	protected String time;
	protected String link;
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Entities(String identifier, String label, String description, String time, String link) {
		super();
		this.identifier = identifier;
		this.label = label;
		this.description = description;
		this.time = time;
		this.link = link;
	}
}
