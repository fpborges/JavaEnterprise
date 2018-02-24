package fborges8262;

import java.util.HashSet;
import java.util.Set;


public class AgeGroup {

	AgeGroup()
	{}
	
	int ageGroupID;
	private String description;
	
	public int getAgeGroupID() {
		return ageGroupID;
	}
	public void setAgeGroupID(int ageGroupID) {
		this.ageGroupID = ageGroupID;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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

        tempAge.setAgeGroup(this);
        ages.add(tempAge);

    }

    public void removeAge(Age tempAge)
    {

        tempAge.setAgeGroup(new AgeGroup());
        ages.remove(tempAge);
    }
	
}
