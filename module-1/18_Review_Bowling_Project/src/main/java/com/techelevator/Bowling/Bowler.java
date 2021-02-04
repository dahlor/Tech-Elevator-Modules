package com.techelevator.Bowling;

import java.util.ArrayList;

public class Bowler {
	
	// Instantiate my variables.
	private int teamNumber;
	private int bowlerNumber;
	private String bowlerName;
	private ArrayList<Integer> scores;

	// My constructor.
	public Bowler(int teamNumber, int bowlerNumber, String bowlerName, ArrayList<Integer> scores) {
		this.teamNumber = teamNumber;
		this.bowlerNumber = bowlerNumber;
		this.bowlerName = bowlerName;
		this.scores = scores;	
	}
	
	// Getters & Setters
	public int getTeamNumber() {
		return teamNumber;
	}
	public void setTeamNumber(int teamNumber) {
		this.teamNumber = teamNumber;
	}
	public int getBowlerNumber() {
		return bowlerNumber;
	}
	public void setBowlerNumber(int bowlerNumber) {
		this.bowlerNumber = bowlerNumber;
	}
	public String getBowlerName() {
		return bowlerName;
	}
	public void setBowlerName(String bowlerName) {
		this.bowlerName = bowlerName;
	}
	public ArrayList<Integer> getScores() {
		return scores;
	}
	public void setScores(ArrayList<Integer> scores) {
		this.scores = scores;
	}

	// Define methods to get derived from this class for sum and average
	
	// Method to return the sum of the scores as an int
	
	public int getSum() { // All the data we need is in the class, so no parameters for method are needed
		int sum = 0;	// Define a variable for the return value.
		
		// Loop through the ArrayList of scores adding each score to sum
		for(int i = 0; i < scores.size(); i++) {
			sum += scores.get(i);	// add the current element to the sum
		}
		return sum;		// Return the variable with the result
	}
	
	public double getAverage() { // All the data we need is in the class, so no parameters for method are needed
		double avg = 0;
		
		// to determine the average, we need to divide the sum of the scores by the number of scores
		avg = this.getSum() / scores.size();
		return avg;		// Return the result
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bowlerName == null) ? 0 : bowlerName.hashCode());
		result = prime * result + bowlerNumber;
		result = prime * result + ((scores == null) ? 0 : scores.hashCode());
		result = prime * result + teamNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bowler other = (Bowler) obj;
		if (bowlerName == null) {
			if (other.bowlerName != null)
				return false;
		} else if (!bowlerName.equals(other.bowlerName))
			return false;
		if (bowlerNumber != other.bowlerNumber)
			return false;
		if (scores == null) {
			if (other.scores != null)
				return false;
		} else if (!scores.equals(other.scores))
			return false;
		if (teamNumber != other.teamNumber)
			return false;
		return true;
	}

	// Generated toString
	@Override
	public String toString() {
		return "Bowler [teamNumber=" + teamNumber + ", bowlerNumber=" + bowlerNumber + ", bowlerName=" + bowlerName
				+ ", scores=" + scores + "]";
	}
}