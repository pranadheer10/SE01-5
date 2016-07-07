package SchedulePD;
import java.util.ArrayList;

import SchedulePD.University;
import SchedulePD.GradSchools;
import SchedulePD.Semester;
import SchedulePD.Course;
public class Semester {


	private University university;
	/**
	 * The name of the Player
	 */
	private String semesterName;
	/**
	 * The position the Player plays on the Team.
	 */
	private String startDate;
	/**
	 * The number on the Player's jersey.
	 */
	private String endDate;
	
	public Semester()
	{
		
	}

	public Semester(GradSchools gradSchools, String semesterName, String startDate, String endDate) 
	{
		// TODO Auto-generated constructor stub
		this();
		this.semesterName =semesterName ;
		this.startDate = startDate;
		this.endDate = endDate;
		gradSchools.addSemester(this);
	}

	
	
	public University getUniversity()
	{
		return this.university;
	}

	public void setUniversity(University university)
	{
		this.university = university;
	}

	
	public String getSemesterName()
	{
		return this.semesterName;
	}

	public void setSemesterName(String semesterName)
	{
		this.semesterName = semesterName;
	}

	public String getStartDate()
	{
		return this.startDate;
	}

	public void setStartDate(String startDate)
	{
		this.startDate = startDate;
	}

	public String getEndDate()
	{
		return this.endDate;
	}

	public void setEndDate(String endDate)
	{
		this.endDate = endDate;
	}

	public String toString()
	{
		return getSemesterName()+getStartDate()+getEndDate();
	}

		
		
	
	
}
