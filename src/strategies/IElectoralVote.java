package strategies;
import java.util.ArrayList;

import Observable.USState;

public interface IElectoralVote {

	public Integer demoElecVotes(ArrayList<USState> states);
	public Integer repubElecVotes(ArrayList<USState> states);
}
