package com.chainsys.introduction;

public class Diamond {


	public static void main(String[] args) {
		int countA = 0;
		for (countA = 1; countA <= 5; countA++) {
			for (int countC = 5; countC > countA; countC--) {
				System.out.print(".");
			}

			for (int countB = countA; countB >=1; countB--) {
				System.out.print(countB);
			}
			for (int countC = 2; countC <=countA; countC++) {
				System.out.print(countC);
			}
			System.out.println();
		}

		for (countA = 4; countA >= 1; countA--) {
			for (int countC = 4; countC >= countA; countC--) {
				System.out.print(".");
			}
			
			for (int countB = countA; countB >=1; countB--) {
				System.out.print(countB);
			}
			for (int countC = 2; countC<=countA; countC++) {
				System.out.print(countC);
			}
			System.out.println();
		}
	}
}

	

