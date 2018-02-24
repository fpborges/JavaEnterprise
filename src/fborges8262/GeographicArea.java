package fborges8262;

import java.util.HashSet;
import java.util.Set;

public class GeographicArea {
	
	GeographicArea()
	{}
	
	int geographicAreaID;
	private int code;
	private int level;
	private String name;
	private int alternativeCode;
	
	
	public int getGeographicAreaID() {
		return geographicAreaID;
	}
	public void setGeographicAreaID(int geographicAreaID) {
		this.geographicAreaID = geographicAreaID;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAlternativeCode() {
		return alternativeCode;
	}
	public void setAlternativeCode(int alternativeCode) {
		this.alternativeCode = alternativeCode;
	}
	
	private Set<Age> ages = new HashSet<Age>();

    public Set<Age> getAges()
    {

        return ages;

    }

    public void setAges(Set<Age> ages)
    {

        this.ages = ages;

    }

    public void addAge(Age tempAge)
    {

        tempAge.setGeographicArea(this);
        ages.add(tempAge);

    }

    public void removeAge(Age tempAge)
    {

        tempAge.setGeographicArea(new GeographicArea());
        ages.remove(tempAge);
    }
	

}
