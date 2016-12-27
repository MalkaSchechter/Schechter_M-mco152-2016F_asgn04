package Observable;

public class USState {
private String stateName;
private Integer repubVotes;
private Integer demoVotes;
private Integer electoralVotes;

public USState(String stateName, Integer repubVotes, Integer demoVotes, Integer electoralVotes){
	this.stateName = stateName;
	this.repubVotes = repubVotes;
	this.demoVotes = demoVotes;
	this.electoralVotes = electoralVotes;
}

public String getStateName() {
	return stateName;
}

public Integer getRepubVotes() {
	return repubVotes;
}
public Integer getDemoVotes() {
	return demoVotes;
}
public Integer getElectoralVotes() {
	return electoralVotes;
}

public void setRepubVotes(Integer repubVotes) {
	this.repubVotes = repubVotes;
}
public void setDemoVotes(Integer demoVotes) {
	this.demoVotes = demoVotes;
}
public void setElectoralVotes(Integer electoralVotes) {
	this.electoralVotes = electoralVotes;
}


}
