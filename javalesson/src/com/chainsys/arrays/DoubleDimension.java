package com.chainsys.arrays;

public class DoubleDimension {
	public static void rowColumn() {
		int Data[][] = new int[4][5];
		int data = 0;
		int rowIndex, colIndex = 0;
		for (rowIndex = 0; rowIndex < 4; rowIndex++) {
			for (colIndex = 0; colIndex < 5; colIndex++) {
				Data[rowIndex][colIndex] = data;
				data++;
			}
		}
		for (rowIndex = 0; rowIndex < 4; rowIndex++) {
			for (colIndex = 0; colIndex < 5; colIndex++) {
				System.out.print(Data[rowIndex][colIndex] + " ");
			}
			System.out.println();
		}
	}

	public static void marks() {
		int sum = 0;
		int average = 0;
		int marks[][] = new int[][] { { 82, 38, 45, 77, 55, 0, 0 }, { 95, 99, 92, 90, 85, 0, 0 },
				{ 85, 10, 91, 92, 93, 0, 0 }, { 75, 55, 92, 74, 66, 0, 0 }, { 85, 75, 58, 62, 72, 0, 0 } };
		int rowIndex, colIndex = 0;
		for (rowIndex = 0; rowIndex < 5; rowIndex++) {
			for (colIndex = 0; colIndex < 7; colIndex++) {
				sum += marks[rowIndex][colIndex];
			}
			marks[rowIndex][5] = sum;
			marks[rowIndex][6] = sum / 5;
			sum = 0;
		}
		int subject = 1;
		for (subject = 1; subject <= 5; subject++) {
			System.out.print("sub:" + (subject) + "\t");
		}
		System.out.print("Total\t");
		System.out.println("Average\t");
		System.out.println("------------------------------------------------------");
		String output = "";
		for (rowIndex = 0; rowIndex < 5; rowIndex++) {
			for (colIndex = 0; colIndex < 7; colIndex++) {
				int mark = marks[rowIndex][colIndex];

				output = String.format("%d\t", mark);

				System.out.print(output);

			}
			System.out.println();
		}

	}

	public static void rowLength()
	{
		int uneventwod[][]=new int[4][];
		uneventwod[0]=new int[1];
		uneventwod[1]=new int[4];
		uneventwod[2]=new int[3];
		uneventwod[3]=new int[2];
		int rowIndex,colIndex,rowLength=0;
		for(rowIndex=0;rowIndex<4;rowIndex++)
		{
			rowLength=uneventwod[rowIndex].length;
			for(colIndex=0;colIndex<rowLength;colIndex++)
			{   int data=0;
				uneventwod[rowIndex][colIndex]=data;
				data++;
				for(rowIndex=0;rowIndex<4;rowIndex++)
				{
					for(colIndex=0;colIndex<rowLength;colIndex++)
					{
				System.out.print(uneventwod[rowIndex][colIndex]+"");
					}
					
					System.out.println();
			     }
			}
		
		}
	}

}
