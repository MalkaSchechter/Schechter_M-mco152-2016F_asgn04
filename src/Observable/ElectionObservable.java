package Observable;
import java.util.ArrayList;
import java.util.Observable;

import exceptions.MissingDataException;
import exceptions.StateNotFoundException;

public class ElectionObservable extends Observable {
	public ArrayList<USState> states;
	
	public ElectionObservable(ArrayList<USState> states){
		this.states = states;
	}

	public void updateStateRepubVotes(String stateName, Integer votes)
			throws MissingDataException, StateNotFoundException {
		if (stateName == null) {
			throw new MissingDataException();
		}

		for (USState state : states) {
			if (state.getStateName().equals(stateName)) {
				state.setRepubVotes(votes);
				setChanged();
				notifyObservers();
				
				return;
			}
		}

		throw new StateNotFoundException();
		
		
	}

	public void updateStateDemoVotes(String stateName, Integer votes)
			throws MissingDataException, StateNotFoundException {
		if (stateName == null) {
			throw new MissingDataException();
		}

		for (USState state : states) {
			if (state.getStateName().equals(stateName)) {
				state.setDemoVotes(votes);
				setChanged();
				notifyObservers();
				return;
			}
		}

		throw new StateNotFoundException();
	}

	public void updateStateElectoralVotes(String stateName, Integer votes)
			throws MissingDataException, StateNotFoundException {
		if (stateName == null) {
			throw new MissingDataException();
		}

		for (USState state : states) {
			if (state.getStateName().equals(stateName)) {
				state.setElectoralVotes(votes);
				setChanged();
				notifyObservers();
				return;
			}
		}

		throw new StateNotFoundException();
	}
}
