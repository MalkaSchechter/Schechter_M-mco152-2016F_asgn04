package Observers;
import strategies.ElecClosestCallSplitInHalfStrategy;
import strategies.ElecNYgoesRepubStrategy;
import strategies.Pop95DemoStrategy;

public class RepubElectionObserver extends AbstractElectionObserver{

	public RepubElectionObserver() {
		super(new Pop95DemoStrategy(), new ElecClosestCallSplitInHalfStrategy());		
	}

}
