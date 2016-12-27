package Observers;
import strategies.Elec2PercRVotesAsDemoStrategy;
import strategies.PopIgnoreStateWithMostRVotesStrategy;

public class DemoElectionObserver extends AbstractElectionObserver {

	public DemoElectionObserver() {
		super(new PopIgnoreStateWithMostRVotesStrategy(), new Elec2PercRVotesAsDemoStrategy());		
	}

}
