package com.chainsys.unittest;
import com.chainsys.classandmethods.TwentyScoreBoard;
public class ScoreBoardTester {
		public static void testScoreBoard() 
		{
			TwentyScoreBoard scoreBoard=new TwentyScoreBoard();
			scoreBoard.setCurrent_score(100);
		    scoreBoard.setRun_rate(56);
		    scoreBoard.setCompleted_over(15);
		    System.out.println(scoreBoard.getCurrent_score());
		    System.out.println(scoreBoard.getRun_rate());
		    System.out.println(scoreBoard.getTarget());
		    System.out.println(scoreBoard.getMaxOvers());
		    System.out.println(scoreBoard.getCompleted_over());
		    System.out.println(scoreBoard.getRequiredRunRate());
		}
	}
