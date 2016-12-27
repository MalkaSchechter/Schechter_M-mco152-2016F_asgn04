package strategies;
import java.util.ArrayList;

import Observable.USState;

public class ElecHonestStrategy implements IElectoralVote{

	@Override
	public Integer demoElecVotes(ArrayList<USState> states) {
		Integer demoElecVotes = 0; 
		for(USState state: states){
		if(state.getDemoVotes() > state.getRepubVotes()){
			demoElecVotes += state.getElectoralVotes();
		}		
		}
		return demoElecVotes;
	}

	@Override
	public Integer repubElecVotes(ArrayList<USState> states) {
		Integer repubElecVotes = 0; 
		for(USState state: states){
		if(state.getDemoVotes() < state.getRepubVotes()){
			repubElecVotes += state.getElectoralVotes();
		}		
		}
		return repubElecVotes;
	}

	
	
}
