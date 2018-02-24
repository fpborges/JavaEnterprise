package fborges8262;

import java.util.HashSet;
import java.util.Set;

public class CensusYear {
	
	CensusYear()
	{}
	
	int censusYearID;
	private int censusYear;
	
	public int getCensusYearID() {
		return censusYearID;
	}
	public void setCensusYearID(int censusYearID) {
		this.censusYearID = censusYearID;
	}
	public int getCensusYear() {
		return censusYear;
	}
	public void setCensusYear(int censusYear) {
		this.censusYear = censusYear;
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

        tempAge.setCensusYear(this);
        ages.add(tempAge);

    }

    public void removeAge(Age tempAge)
    {

        tempAge.setCensusYear(new CensusYear());
        ages.remove(tempAge);
    }
	
}
