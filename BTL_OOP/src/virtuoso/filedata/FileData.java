package virtuoso.filedata;

public class FileData {
	public String PERSON_LABEL = "src/virtuoso/filedata/personLabel.txt";
	private String PERSON_DESCRIPTION = "src/virtuoso/filedata/personDes.txt";
	private String PERSON_NATIONALITY = "src/virtuoso/filedata/countryLabel.txt";
	
	private String COUNTRY_LABEL = "src/virtuoso/filedata/countryLabel.txt";
	private String COUNTRY_DESCRIPTION = "src/virtuoso/filedata/countryDes.txt";
	
	private String LOCATION_LABEL = "src/virtuoso/filedata/locationLabel.txt";
	private String LOCATION_DESCRIPTION = "src/virtuoso/filedata/locationDes.txt";
	
	private String EVENT_ADDRESS = "src/virtuoso/filedata/locationLabel.txt";
	private String EVENT_LABEL = "src/virtuoso/filedata/eventLabel.txt";
	private String EVENT_DESCRIPTION = "src/virtuoso/filedata/locationDes.txt";
	
	private String ORGANZATION_LABEL = "src/virtuoso/filedata/organizationLabel.txt";
	private String ORGANZATION_HEADQUARTER = "src/virtuoso/filedata/locationLabel.txt";
	private String ORGANZATION_DESCRIPTION = "src/virtuoso/filedata/organizationDes.txt";
	
	private String TIME = "src/virtuoso/filedata/time.txt";
	
	private String RELATIONSHIP = "src/virtuoso/filedata/relationship.txt";
	
	public String getPERSON_LABEL() {
		return PERSON_LABEL;
	}

	public String getPERSON_DESCRIPTION() {
		return PERSON_DESCRIPTION;
	}

	public String getPERSON_NATIONALITY() {
		return PERSON_NATIONALITY;
	}

	public String getCOUNTRY_LABEL() {
		return COUNTRY_LABEL;
	}

	public String getCOUNTRY_DESCRIPTION() {
		return COUNTRY_DESCRIPTION;
	}

	public String getLOCATION_LABEL() {
		return LOCATION_LABEL;
	}

	public String getLOCATION_DESCRIPTION() {
		return LOCATION_DESCRIPTION;
	}

	public String getEVENT_ADDRESS() {
		return EVENT_ADDRESS;
	}

	public String getEVENT_LABEL() {
		return EVENT_LABEL;
	}

	public String getEVENT_DESCRIPTION() {
		return EVENT_DESCRIPTION;
	}

	public String getORGANZATION_LABEL() {
		return ORGANZATION_LABEL;
	}

	public String getORGANZATION_HEADQUARTER() {
		return ORGANZATION_HEADQUARTER;
	}

	public String getTIME() {
		return TIME;
	}

	public String getRELATIONSHIP() {
		return RELATIONSHIP;
	}

	public String getORGANZATION_DESCRIPTION() {
		return ORGANZATION_DESCRIPTION;
	}

	public void setORGANZATION_DESCRIPTION(String oRGANZATION_DESCRIPTION) {
		ORGANZATION_DESCRIPTION = oRGANZATION_DESCRIPTION;
	}

	
}
