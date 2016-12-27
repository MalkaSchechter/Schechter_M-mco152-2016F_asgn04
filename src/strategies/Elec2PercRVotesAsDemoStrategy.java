package strategies;
import java.util.ArrayList;

import Observable.USState;

public class Elec2PercRVotesAsDemoStrategy implements IElectoralVote{

	@Override
	public Integer demoElecVotes(ArrayList<USState> states) {
		Integer demoElecVotes = 0; 
		for(USState state: states){
		if(state.getDemoVotes()+(state.getRepubVotes()*.02) > state.getRepubVotes()*.98){
			demoElecVotes += state.getElectoralVotes();
		}	
		}
		return demoElecVotes;
	}

	@Override
	public Integer repubElecVotes(ArrayList<USState> states) {
		Integer repubElecVotes = 0; 
		for(USState state: states){
			if(state.getDemoVotes()+(state.getRepubVotes()*.02) < state.getRepubVotes()*.98){
			repubElecVotes += state.getElectoralVotes();
		}		
		}
		return repubElecVotes;
	}
	
	

}
