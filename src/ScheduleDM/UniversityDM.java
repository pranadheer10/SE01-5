package ScheduleDM;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import SchedulePD.University;
public class UniversityDM {

	
	public static boolean loadUniversity(University university)
	{
		boolean success = true;
		try {
			System.out.println("loading university...");
			loadUniversity(university, "TestDataUniversityName.csv");
			GradSchoolsDM.loadGradSchools(university);
			SemesterDM.loadSemester(university,"TestDataSemesters.csv");
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			success = false;
		}
		return success;
		
	}
	
	public static void loadUniversity(University university, String pathName) throws IOException
	{	
		String line = null;
		String[] token;
		
		String name;	// UNIVERSITY name
		String abbreviation;	// full name
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
	        // read one data line (we only support one league)
	        line = bufferedReader.readLine();
	        
    		//split data by comma
        	token = line.split(",");
        	if ( token.length < 2)
        		throw new IOException("Bad " + pathName + " file format; expected 2 fields");
        	else
        	{
	        	name = token[0];
	        	abbreviation = token[1];
	        	university.setName(name);
	        	university.setAbbreviation(abbreviation);
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

