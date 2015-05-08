	
package alexei.betfairapi.entities;


	/**
	  * Competition Result. This class was auto-generated from interface definition xml.
	  */
public class CompetitionResult {
	
	/**
	  * Competition
	  */
	private Competition competition;

	/**
	  * Count of markets associated with this competition
	  */
	private int marketCount;

	/**
	  * Region in which this competition is happening
	  */
	private String competitionRegion;

	/**
	  * Competition
	  */
	public Competition getCompetition() {
		return competition;
	}

	/**
	  * Competition
	  */
	public void setCompetition(Competition competition) {
		this.competition = competition;
	}

	/**
	  * Count of markets associated with this competition
	  */
	public int getMarketCount() {
		return marketCount;
	}

	/**
	  * Count of markets associated with this competition
	  */
	public void setMarketCount(int marketCount) {
		this.marketCount = marketCount;
	}

	/**
	  * Region in which this competition is happening
	  */
	public String getCompetitionRegion() {
		return competitionRegion;
	}

	/**
	  * Region in which this competition is happening
	  */
	public void setCompetitionRegion(String competitionRegion) {
		this.competitionRegion = competitionRegion;
	}

}
