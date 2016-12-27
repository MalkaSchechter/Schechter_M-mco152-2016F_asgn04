package Observable;

import java.util.ArrayList;

import Observers.AbstractElectionObserver;
import Observers.DemoElectionObserver;
import Observers.DemoPopHonestElecElectionObserver;
import Observers.DemoPopRepubElecElectionObserver;
import Observers.HonestElectionObserver;
import Observers.RepubElectionObserver;
import exceptions.MissingDataException;
import exceptions.StateNotFoundException;
import strategies.ElecHonestStrategy;
import strategies.IElectoralVote;
import strategies.IPopularVote;
import strategies.PopHonestStrategy;

public class Main {
	// Uses pull by calling the update method with only the observable object
	public static void main(String[] args) {
		// dummy data
		ArrayList<USState> states = new ArrayList<USState>();

		
		states.add(new USState("New York", 5, 10, 10));
		states.add(new USState("New Hampshire", 15, 20, 10));
		states.add(new USState("New Mexico", 25, 30, 10));
		states.add(new USState("North Dakota", 35, 40, 10));
		states.add(new USState("North Carolina", 45, 50, 10));
		
		ElectionObservable eo = new ElectionObservable(states);

		AbstractElectionObserver honest = new HonestElectionObserver();
		AbstractElectionObserver demo_honest = new DemoPopHonestElecElectionObserver();
		AbstractElectionObserver repub = new RepubElectionObserver();
		AbstractElectionObserver demo = new  DemoElectionObserver();
		AbstractElectionObserver demo_repub = new  DemoPopRepubElecElectionObserver();
		
		
		eo.addObserver(honest);
		eo.addObserver(demo_honest);
		eo.addObserver(repub);
		eo.addObserver(demo);
		eo.addObserver(demo_repub);
		
		try {
			eo.updateStateElectoralVotes("New York", 15);
			
			eo.updateStateRepubVotes("North Carolina", 25);
		} catch (MissingDataException | StateNotFoundException e) {
			e.printStackTrace();
		}

		
	}
}
