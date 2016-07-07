package ScheduleDM;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import SchedulePD.University;
import SchedulePD.Semester;
import SchedulePD.GradSchools;

public class SemesterDM {
	
	public static void loadSemester(University university) throws IOException
	{
		System.out.println("loading semesters...");
		SemesterDM.loadSemester(university, "TestDataSemesters.csv");
		
	}
	

	public static void loadSemester(University university, String pathName) throws IOException
	{	
		String line = null;
		String[] token;
		
		String semesterName;
		String startDate;
		String endDate;
		
		
		BufferedReader bufferedReader = null;
		
		
	    try 
	    {
	        // FileReader reads text files in the default encoding.
	        FileReader fileReader = 
	            new FileReader(pathName);

	        // Always wrap FileReader in BufferedReader.
	        bufferedReader = new BufferedReader(fileReader);
	       
	        // read and discard headings in csv
	        line = bufferedReader.readLine();
	        
	        while((line = bufferedReader.readLine()) != null) 
		    {
		        		//split data by comma
			        	token = line.split(",");
			        	if ( token.length < 2)
			        		throw new IOException("Bad file format: " + pathName);
			        	else
			        	{
			        		semesterName = token[0];
			        		startDate = token[1];	
			        		endDate = token[2];	
				        	
			        	}

			        	GradSchools gradSchools = university.findGradSchools(semesterName);	

				        Semester semester = new Semester(gradSchools, semesterName, startDate, endDate);			     	
				        	        
		    }
	        
	        
	    }
	    catch(FileNotFoundException ex) 
	    {
	        System.out.println(
	            "Unable to open file '" + 
	            pathName + "'" + " at cur dir: " + System.getProperty("user.dir"));    
	        throw ex;
	    }
	    catch(IOException ex) {
	        System.out.println(
	            "Error reading file '" 
	            + pathName + "'");  
	        throw ex;
		
		}
	    finally
	    {
	    	 // Always close files.
	    	if ( bufferedReader != null )
	    		bufferedReader.close();     
	    }
		
	}
}


