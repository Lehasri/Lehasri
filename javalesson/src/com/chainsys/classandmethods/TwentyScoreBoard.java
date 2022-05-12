package com.chainsys.classandmethods;

public class TwentyScoreBoard {
private int current_score;
private int run_rate;
private final int target=120;
private final static int max_overs=20;
private int completed_over;
public int getCurrent_score() {
	return current_score;
}
public void setCurrent_score(int current_score) {
	this.current_score = current_score;
}
public int getRun_rate() {
	return run_rate;
}
public void setRun_rate(int run_rate) {
	this.run_rate = run_rate;
}
public int getCompleted_over() {
	return completed_over;
}
public void setCompleted_over(int completed_over) {
	this.completed_over = completed_over;
}
public int getTarget() {
	return target;
}
public static int getMaxOvers() {
	return max_overs;
}
public int getRequiredRunRate()
{
	int current_over=max_overs-completed_over;
	int runToScore=target-current_score;
	return runToScore/current_over;
	
}
}
