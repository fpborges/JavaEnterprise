package fborges8262;

public class Age {
	
	//constructor - makes Age class live
	Age()
	{}
	
	//attributes - features of the class
    int ageID;
	private int ageGroup;
	private int censusYear;
	private int geographicArea;
	private int combined;
	private int male;
	private int female;
	
	//generate getters and setters to manipulate data to the class
	
	public int getAgeID() {
		return ageID;
	}
	public void setAgeID(int ageID) {
		this.ageID = ageID;
	}
	public int getAgeGroup() {
		return ageGroup;
	}
	public void setAgeGroup(int ageGroup) {
		this.ageGroup = ageGroup;
	}
	public int getCensusYear() {
		return censusYear;
	}
	public void setCensusYear(int censusYear) {
		this.censusYear = censusYear;
	}
	public int getGeographicArea() {
		return geographicArea;
	}
	public void setGeographicArea(int geographicArea) {
		this.geographicArea = geographicArea;
	}
	public int getCombined() {
		return combined;
	}
	public void setCombined(int combined) {
		this.combined = combined;
	}
	public int getMale() {
		return male;
	}
	public void setMale(int male) {
		this.male = male;
	}
	public int getFemale() {
		return female;
	}
	public void setFemale(int female) {
		this.female = female;
	}

	
	
	
	

}
