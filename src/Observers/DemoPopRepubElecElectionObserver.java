package Observers;
import strategies.ElecNYgoesRepubStrategy;
import strategies.PopIgnoreStateWithMostRVotesStrategy;

public class DemoPopRepubElecElectionObserver extends AbstractElectionObserver {

	public DemoPopRepubElecElectionObserver() {
		super(new PopIgnoreStateWithMostRVotesStrategy(), new ElecNYgoesRepubStrategy());
	}

}
