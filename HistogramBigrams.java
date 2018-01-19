/**
 * HistogramBigrams class implements biagram parsing which print biagram with their counts
 * 
 * @author  Varun Kumar [varunkumar6807@gmail.com]
 * @version 1.0
 * @since   2018-01-18 
 */

import java.io.*;
import java.util.*;
public class HistogramBigrams {


	//Main method 
	public static void main(String[] args) {
		
		//file Path
		String pathOfTextFile = "./" + args[0];
		String stringDelimiter = "\\s+";
		BufferedReader breader = null;
		String input="";
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		
		try 
		{
			//reading text from text file
			breader = new BufferedReader(new FileReader(pathOfTextFile));
			//String input = "The quick brown fox and the quick blue hare";
			
			//mapping bigrams into  LinkedHashMap
			while((input = breader.readLine()) != null)
			{
				
				String[] inputarr = input.toLowerCase().split(stringDelimiter) ;
				
				for(int i=0;i<inputarr.length-1;i++)
				{
					String key = inputarr[i]+" "+inputarr[i+1];
					if(map.containsKey(key))
					{
						map.put(key, map.get(key)+1);
					}
					else
						map.put(key, 1);
				}
			
		}//while
			//Printing bigrams with their counts:
			for(String s:map.keySet())
			{
				System.out.println(s+" "+map.get(s));
			}

		}//try end
		catch (FileNotFoundException ex) 
		{
			// ex.printStackTrace();
			System.out.println("Sorry!! Please enter correct file name and try again");
		} 
		
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}
		
		finally 
		{
			if (breader != null) 
			{
				try 
				{
					breader.close();
				} 
				catch (Exception ex) 
				{
					ex.printStackTrace();
				}
			}// if
		}// finally
	}//main

}//class end
