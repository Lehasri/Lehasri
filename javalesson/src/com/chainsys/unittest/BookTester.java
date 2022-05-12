package com.chainsys.unittest;

import com.chainsys.classandmethods.Book;

public class BookTester {
	public static void testBook() {
	
	Book storyBook=new Book("shakespearesStoryBooks");
	   
		storyBook.setYearOfPublished(1980);
		storyBook.setAuthor("Shakespeare");
		storyBook.setRate(500);
		storyBook.setYearWhenCreated(1975);
		
		System.out.println(storyBook.getBookTitle());
		System.out.println(storyBook.getYearOfPublished());
		System.out.println(storyBook.getAuthor());
		System.out.println(storyBook.getRate());
		System.out.println(storyBook.getYearWhenCreated());
		
		
		
	}

}
