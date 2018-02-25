package fborges8262;

//import javax.persistence.Entity;
//import javax.persistence.Table;

//@Entity
//@Table(name="Age")
public class Age {
	
	//constructor - makes Age class live
	public Age()
	{}
	
	//attributes - features of the class
	
    int ageID;
	AgeGroup ageGroup;
	CensusYear censusYear;
	GeographicArea geographicArea;
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
	public AgeGroup getAgeGroup() {
		return ageGroup;
	}
	public void setAgeGroup(AgeGroup ageGroup) {
		this.ageGroup = ageGroup;
	}
	public CensusYear getCensusYear() {
		return censusYear;
	}
	public void setCensusYear(CensusYear censusYear) {
		this.censusYear = censusYear;
	}
	public GeographicArea getGeographicArea() {
		return geographicArea;
	}
	public void setGeographicArea(GeographicArea geographicArea) {
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
