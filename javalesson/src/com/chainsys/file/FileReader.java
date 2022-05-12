package com.chainsys.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int charfromfile;
     FileInputStream fin=null;
     String fname="D:\\temp\\kowsi.txt";
     try
     {
    	 fin=new FileInputStream(fname);
     }
     catch(FileNotFoundException e)
     {
    	 System.out.println("File Not Found");
    	 return;
     }
     //checking if data isAvailable
     //reading data from the file
     try
     {
    do
    {
    	charfromfile=fin.read();
    	if(charfromfile!=-1)
    		System.out.println((char)charfromfile);
   }
    while(charfromfile!=-1);
     }
     catch(IOException e)
     {
    	 System.out.println();
     }
	}

}
