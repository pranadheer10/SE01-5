package SchedulePD;


import java.util.*;

import ScheduleDM.UniversityDM;
import SchedulePD.GradSchools;
import SchedulePD.University;

import SchedulePD.Semester;





public class University
{

		/**
	 * A collection of the Teams that complete in the League
	 */
	private ArrayList<University> university;
	/**
	 * A collection of Schedule of Games that the League manages
	 */
	private ArrayList<GradSchools> gradSchools;
	/**
	 * The collection of Locations where Games are played.
	 */
	private ArrayList<Semester> semester;
	/**
	 * The name of the League.
	 */
	private ArrayList<Course> course;

	private String name;
	/**
	 * The name of the commissioner who manages the league.
	 */
	private String abbreviation;









public University()
{
	university = new ArrayList<University>();
	gradSchools = new ArrayList<GradSchools>();
	semester = new ArrayList<Semester>();
	course = new ArrayList<Course>();

}
public boolean isOkToRemove()
{
	return true;
}


public ArrayList<GradSchools> getGradSchools()
{
	return this.gradSchools;
}



public void addGradSchools(GradSchools gradSchool)
{
	if(gradSchool!=null)
{
	getGradSchools().add(gradSchool);
}
}


public void removeGradSchools(GradSchools gradSchool)
{
	if(gradSchool!=null)

{
	getGradSchools().remove(gradSchool);
}
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
public void removeSemester(Semester semester)
{if(semester!=null)
{
	getSemester().remove(semester);
}
}

public ArrayList<Course> getCourse()
{
	return this.course;
}

public void addCourse(Course course)
{
	getCourse().add(course);
}

public void removeCourse(Course course)
{
	getCourse().remove(course);
}



public String getName()
{
	return this.name;
}

public void setName(String name)
{
	this.name = name;
}

public String getAbbreviation() {
	return abbreviation;
}

public void setAbbreviation(String abbreviation) {
	this.abbreviation = abbreviation;
}

public void init()
{
	UniversityDM.loadUniversity(this);
}

public String toString()
{
	return getName()+":"+getAbbreviation();
}
public GradSchools findGradSchools(String semesterName) {
	// TODO Auto-generated method stub
	for (GradSchools gradSchools : getGradSchools())
	{
		return gradSchools;
	}
	return null;
	
}



}
