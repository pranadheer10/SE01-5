package SchedulePD;

import java.util.ArrayList;

import SchedulePD.GradSchools;
import SchedulePD.University;
import SchedulePD.Course;
import SchedulePD.Semester;
public class GradSchools {

	/**
	 * The Team that is the home Team for the Game,
	 */
	private University university;
	private ArrayList<Semester> semester;
	private ArrayList<GradSchools> gradSchools;
	/**
	 * The Team that is the visiting team for the Game.
	 */
	
	private String name;
	/**
	 * The physical address of the Location.
	 */
	
	private String gradSchoolAbbrev;
	
	
	
	
	
	public GradSchools()
	{
	semester = new ArrayList<Semester>();
	}
	
	public GradSchools(University university,String name, String gradSchoolAbbrev)
	{
		this();
		this.name = name;
		this.gradSchoolAbbrev = gradSchoolAbbrev;
		university.addGradSchools(this);

	}


	public String getName()
	{
		return this.name;
	}

	public void setGradSchool(String name)
	{
		this.name = name;
	}

	public String getGradSchoolAbbrev()
	{
		return this.gradSchoolAbbrev;
	}

	public void setGradSchoolAbbrev(String gradSchoolAbbrev)
	{
		this.gradSchoolAbbrev = gradSchoolAbbrev;
	}


	

		

	public ArrayList<Semester> getSemester()
	{
		return this.semester;
	}
	
	public void addSemester(Semester semester)
	{

   if(semester!=null)
   {
	getSemester().add(semester);
	
  }

	}
	
	
	public void removeSemester (Semester semester)
	{
		getSemester().remove(semester);
	}
	
	

	public University getUniversity()
	{
		return this.university;
	}

	public void setUniversity(University university)
	{
		this.university = university;
	}
	
	public String toString()
	{
		return getGradSchoolAbbrev()+" "+ getName();
	}

	
	
}

