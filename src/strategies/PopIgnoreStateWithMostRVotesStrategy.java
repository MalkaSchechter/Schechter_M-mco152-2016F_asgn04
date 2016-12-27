package strategies;

import java.util.ArrayList;

import Observable.USState;

public class PopIgnoreStateWithMostRVotesStrategy implements IPopularVote {

	@Override
	public Integer repubVotes(ArrayList<USState> states) {
		Integer repubVotes = 0;

		USState mostRepubVotes = stateWithMostRVotes(states);
		for (USState state : states) {
			if (!state.equals(mostRepubVotes)) {
				repubVotes += state.getRepubVotes();
			}
		}
		return repubVotes;
	}

	@Override
	public Integer demoVotes(ArrayList<USState> states) {
		Integer demoVotes = 0;

		USState mostRepubVotes = stateWithMostRVotes(states);
		for (USState state : states) {
			if (!state.equals(mostRepubVotes)) {
				demoVotes += state.getDemoVotes();
			}
		}
		return demoVotes;
	}

	public USState stateWithMostRVotes(ArrayList<USState> states) {
		USState greatestNumVotes = states.get(0);

		for (USState s : states) {
			if (s.getRepubVotes() > greatestNumVotes.getRepubVotes()) {
				greatestNumVotes = s;
			}
		}

		return greatestNumVotes;
	}
}
