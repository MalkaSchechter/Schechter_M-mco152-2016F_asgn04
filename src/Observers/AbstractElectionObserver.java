package Observers;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Observable;
import java.util.Observer;

import Observable.ElectionObservable;
import Observable.USState;
import strategies.IElectoralVote;
import strategies.IPopularVote;

public abstract class AbstractElectionObserver implements Observer {
	ElectionObservable data;
	IPopularVote p;
	IElectoralVote e;

	public AbstractElectionObserver(IPopularVote p, IElectoralVote e) {
		this.p = p;
		this.e = e;
	}

	@Override
	public void update(Observable obs, Object arg1) {
		data = (ElectionObservable) obs;

		displayResults();
		displayLegalMessage();
	}

	public void displayLegalMessage() {
		System.out.println(
				"\nLegal Disclaimer - these figures are purely observational and not legally binding.  Current Time: "
						+ Calendar.getInstance().getTime());
	}

	public void displayResults() {

		StringBuilder info = new StringBuilder();

		info.append("\nPolling Data from the following states: ");
		for (USState state : data.states) {
			info.append(state.getStateName());
			info.append(", ");
		}
		info.append("\nRepublican Votes: ");
		info.append(p.repubVotes(data.states));
		info.append("\nDemocratic Votes: ");
		info.append(p.demoVotes(data.states));
		info.append("\nPredicted Electoral Votes: \n");
		info.append("\tRepublican: ");
		info.append(e.repubElecVotes(data.states));
		info.append("\n\tDemocratic: ");
		info.append(e.demoElecVotes(data.states));
		info.append("\n");

		System.out.println(info.toString());

	}
}
