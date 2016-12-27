package strategies;
import java.util.ArrayList;

import Observable.USState;

public class ElecMostElecVotesDemoStrategy implements IElectoralVote {

	@Override
	public Integer demoElecVotes(ArrayList<USState> states) {
		Integer demoElecVotes = 0;
		
		USState state = states.get(0);
		for (USState state2 : states) {
			if(state2.getElectoralVotes() > state.getElectoralVotes()){
				state = state2;
			}
		}
		
		for (USState state3 : states) {
			if (!state3.equals(state)) {
				if (state3.getDemoVotes() > state3.getRepubVotes()) {
					demoElecVotes += state.getElectoralVotes();
				}
			}else demoElecVotes += state.getElectoralVotes();
		}
		return demoElecVotes;
	}

	@Override
	public Integer repubElecVotes(ArrayList<USState> states) {
		Integer repubElecVotes = 0;
		
		
		USState state = states.get(0);
		for (USState state2 : states) {
			if(state2.getElectoralVotes() > state.getElectoralVotes()){
				state = state2;
			}
		}
		
		
		for (USState state3 : states) {
			if (!state3.equals(state)) {
				if (state.getDemoVotes() < state.getRepubVotes()) {
					repubElecVotes += state.getElectoralVotes();
				}
			}
		}
		return repubElecVotes;
	}
}
