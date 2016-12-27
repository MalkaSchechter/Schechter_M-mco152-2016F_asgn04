package Observers;
import strategies.ElecHonestStrategy;
import strategies.PopHonestStrategy;

public class HonestElectionObserver extends AbstractElectionObserver {

	public HonestElectionObserver() {
		super(new PopHonestStrategy(),new ElecHonestStrategy());
	}

}
