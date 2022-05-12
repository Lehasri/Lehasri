package com.chainsys.file;
	import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.ParseException;
import java.util.Scanner;  
	public class FileOperations   
	{  
	public static void main(String[] args) throws IOException   
	{ 
	    //creatingFile();
		//renameFile();
		//appendStrToFile();
		//modifyString();	
		//readingData();
		//deleteAFile();
		//copyAFile();
		moveAFile();
		
	}
		
	public static void creatingFile()
	{
	File file = new File("D:\\temp\\lekhasri.txt");   
	boolean result;  
	try   
	{  
	result = file.createNewFile(); 
	if(result)      
	{  
	System.out.println("file created "+file.getName());   
	}  
	else  
	{  
	System.out.println("File already exist at location: "+file.getName());  
	}  
	}   
	catch (IOException e)   
	{  
	e.printStackTrace();   
	}       
	} 
	public static void renameFile()
	{
	File file = new File("D:\\temp\\lekhasri.txt");  	
	File rename = new File("D:\\temp\\lekha.txt");
    boolean flag = file.renameTo(rename);
    if (flag == true) {
        System.out.println("File Successfully Renamed");
    }
    else {
        System.out.println("Operation Failed");
    }
    }
public static void appendStrToFile() throws IOException
{
	String textToAppend = "Happy to see you !!";
	String filePath = "d:/temp/lekha.txt";

	try(FileWriter fw = new FileWriter(filePath, true);
	BufferedWriter writer = new BufferedWriter(fw);) 
	{
		writer.write(textToAppend);
		System.out.println("Text is appended");    
	}
 }
public static void modifyString() throws IOException
{
	
	String filePath = "D:\\temp\\lekha.txt";
	Scanner sc = new Scanner(new File(filePath));
    StringBuffer buffer = new StringBuffer();
    while (sc.hasNextLine())
    {
       buffer.append(sc.nextLine()+System.lineSeparator());
    }
    String fileContents = buffer.toString();
    System.out.println("Contents of the file: "+fileContents);
    sc.close();
    String oldLine = "Happy to see youu !!";
    String newLine = "How are you";
    fileContents = fileContents.replaceAll(oldLine, newLine);
    FileWriter writer = new FileWriter(filePath);
    System.out.println("");
    System.out.println("new data: "+fileContents);
    writer.append(fileContents);
    writer.flush();
 }

public static void readingData()
{
int charfromfile;
FileInputStream fin=null;
String fname="D:\\temp\\lekha.txt";
try
{
	 fin=new FileInputStream(fname);
}
catch(FileNotFoundException e)
{
	 System.out.println("File Not Found");
	 return;
}
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

public static void deleteAFile()
{
	File deleteFile = new File("D:\\temp\\lekha"); 
    if (deleteFile.delete()) { 
      System.out.println("Deleted the file: " + deleteFile.getName());
    } else {
      System.out.println("Failed to delete the file.");
    } 
 }
public static void copyAFile() throws IOException
{
	{
	        FileInputStream fis = null;
	        FileOutputStream fos = null;
	        try {
	            fis = new FileInputStream("D:\\temp\\lekha.txt");
	            fos = new FileOutputStream("D:\\temp\\lekha.txt_copy");
	            int c;
	            while ((c = fis.read()) != -1) {
	            fos.write(c);
	            }
	            System.out.println(
	                "copied the file successfully");
	        }
	        finally {
	           if (fis != null) {
	                fis.close();
	            }
	            if (fos != null) {
	                fos.close();
	            }
	        }
	   }
   }
public static void moveAFile() throws IOException
{
	Path temp = Files.move
	        (Paths.get("D:\\temp\\lekha.txt"),
	        Paths.get("D:\\temp\\New folder\\lekha.txt"));
	 
	        if(temp != null)
	        {
	            System.out.println("File renamed and moved successfully");
	        }
	        else
	        {
	            System.out.println("Failed to move the file");
	        }
	    }
}


			
