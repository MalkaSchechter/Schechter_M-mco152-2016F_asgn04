package strategies;
import java.util.ArrayList;

import Observable.USState;

public interface IPopularVote {
	
	public Integer repubVotes(ArrayList<USState> states);
	public Integer demoVotes(ArrayList<USState> states);
}
