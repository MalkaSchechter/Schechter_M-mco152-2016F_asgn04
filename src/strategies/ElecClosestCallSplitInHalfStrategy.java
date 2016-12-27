package strategies;
import java.util.ArrayList;

import Observable.USState;

public class ElecClosestCallSplitInHalfStrategy implements IElectoralVote {

	@Override
	public Integer demoElecVotes(ArrayList<USState> states) {

		USState smallestLead = smallestLead(states);

		Integer demoElecVotes = 0;
		for (USState state : states) {
			if (!state.equals(smallestLead)) {
				if (state.getDemoVotes() > state.getRepubVotes()) {
					demoElecVotes += state.getElectoralVotes();
				}
			} else
				demoElecVotes += (smallestLead.getElectoralVotes() / 2);
		}
		return demoElecVotes;
	}

	@Override
	public Integer repubElecVotes(ArrayList<USState> states) {
		USState smallestLead = smallestLead(states);

		Integer repubElecVotes = 0;
		for (USState state : states) {
			if (!state.equals(smallestLead)) {
				if (state.getDemoVotes() < state.getRepubVotes()) {
					repubElecVotes += state.getElectoralVotes();
				}
			} else if (smallestLead.getElectoralVotes() % 2 == 0) {
				repubElecVotes += smallestLead.getElectoralVotes() / 2;
			} else
				repubElecVotes += smallestLead.getElectoralVotes() / 2 + 1;

		}
		return repubElecVotes;
	}

	public static USState smallestLead(ArrayList<USState> states) {
		USState state = states.get(0);

		for (USState s : states) {
			if (s.getDemoVotes() - s.getRepubVotes() < state.getDemoVotes() - state.getRepubVotes()) {
				state = s;
			}
		}

		return state;
	}
}
