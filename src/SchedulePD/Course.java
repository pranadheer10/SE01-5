package SchedulePD;


public class Course
{

	/**
	 * The Team the Player plays on.
	 */
	private University university;
	/**
	 * The name of the Player
	 */
	private String courseCode;
	/**
	 * The position the Player plays on the Team.
	 */
	private String courseName;
	/**
	 * The number on the Player's jersey.
	 */
	private String courseHours,courseCap,teachers;
	private String courseNumber;
	

	public Course()
	{
		
	}
	
	public Course(University university, String courseCode, String courseName, String courseNumber, String courseHours)
	{
		this();
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.courseHours = courseHours;
		this.courseNumber= courseNumber;
		this.university = university;
		university.addCourse(this);
		
	}
	public University getUniversity()
	{
		return this.university;
	}

	public void setUniversity(University university)
	{
		this.university = university;
	}

	public String getCourseCode()
	{
		return this.courseCode;
	}

	public void setCourseCode(String courseCode)
	{
		this.courseCode = courseCode;
	}

	public String getCourseName()
	{
		return this.courseName;
	}

	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}

	public String getCourseNumber()
	{
		return this.courseNumber;
	}

	public void setCourseNumber(String courseNumber)
	{
		this.courseNumber = courseNumber;
	}

	
	public String getCourseHours()
	{
		return this.courseHours;
	}

	public void setCourseHours(String courseHours)
	{
		this.courseHours = courseHours;
	}

	
	
	
	
	
	
	
	
	
	
	public String toString()
	{
		return getCourseName();
	}
}