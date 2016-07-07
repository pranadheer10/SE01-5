package ScheduleDM;

import SchedulePD.University;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import SchedulePD.GradSchools;
import SchedulePD.Semester;
import SchedulePD.Course;

public class GradSchoolsDM {

	public static void loadGradSchools(University university) throws IOException {
		// TODO Auto-generated method stub
	
			
		 
				System.out.println("loading GradSchool...");
				
	
				GradSchoolsDM.loadGradSchools(university, "TestDataGradSchools.csv");
				SemesterDM.loadSemester(university);
	}
			
			public static void loadGradSchools(University university, String pathName) throws IOException
			{	
				String line = null;
				String[] token;
				
				String name;
				String gradSchoolAbbrev;
				
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
					        	
					        		name = token[0];
					        		gradSchoolAbbrev = token[1];
						        	
					        	}
					        	
					        	
					        	GradSchools gradSchool= new GradSchools(university, name, gradSchoolAbbrev);
					        	gradSchool.setGradSchool(name);
					        	
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
