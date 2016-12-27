package strategies;
import java.util.ArrayList;

import Observable.USState;

public class Pop95DemoStrategy implements IPopularVote {
	@Override
	public Integer repubVotes(ArrayList<USState> states) {
		Integer repubVotes = 0;
		for(USState state: states){
			repubVotes += state.getRepubVotes(); 
		}
		return repubVotes;
	}

	@Override
	public Integer demoVotes(ArrayList<USState> states) {
		Integer demoVotes = 0;
		for(USState state: states){
			demoVotes += state.getDemoVotes(); 
		}
		
		Integer fivePercentLessVotes = (int) (.95 * demoVotes);
		
		
		return fivePercentLessVotes;
	}
}
