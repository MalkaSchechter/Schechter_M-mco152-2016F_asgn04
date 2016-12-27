package Observers;
import strategies.ElecHonestStrategy;
import strategies.PopIgnoreStateWithMostRVotesStrategy;

public class DemoPopHonestElecElectionObserver extends AbstractElectionObserver {

	public DemoPopHonestElecElectionObserver() {
		super(new PopIgnoreStateWithMostRVotesStrategy(), new ElecHonestStrategy());
	}

}
