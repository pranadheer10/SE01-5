package VPProjects;

import java.util.*;

/**
 * THis has all the schedules of the student and faculty
 */
public class Schedule {

	ArrayList<Student> students;
	DegreePlan DegreePlans;
	ArrayList<FacultyLoad> FacultyLoad;
	ArrayList<ClassRoom> Classroom;
	ArrayList<Sections> sections;
	ArrayList<Users> USERS;
	/**
	 * This has the number of classes
	 */
	private long NumberofClasses;
	/**
	 * This is the course starting date
	 */
	private int CourseStartDate;
	/**
	 * This describes the course ending data
	 */
	private int CourseEndDate;
	/**
	 * Number of semesters in that schedule
	 */
	private int NumberOfSemesters;
	/**
	 * This describes the class timing like when the class starts and when the class ends, etc.
	 */
	private int ClassTiming;
	/**
	 * This has the information of the class like classroom number, which course is teaching in that class, classroom location.
	 */
	private int ClassRoom;
	/**
	 * This describes the professor details like which professor is teaching which course and more.
	 */
	private int ProfessorDetails;

	public long getNumberofClasses() {
		return this.NumberofClasses;
	}

	public void setNumberofClasses(long NumberofClasses) {
		this.NumberofClasses = NumberofClasses;
	}

	public int getCourseStartDate() {
		return this.CourseStartDate;
	}

	public void setCourseStartDate(int CourseStartDate) {
		this.CourseStartDate = CourseStartDate;
	}

	public int getCourseEndDate() {
		return this.CourseEndDate;
	}

	public void setCourseEndDate(int CourseEndDate) {
		this.CourseEndDate = CourseEndDate;
	}

	public int getNumberOfSemesters() {
		return this.NumberOfSemesters;
	}

	public int getClassTiming() {
		return this.ClassTiming;
	}

	public void setClassTiming(int ClassTiming) {
		this.ClassTiming = ClassTiming;
	}

	public int getClassRoom() {
		return this.ClassRoom;
	}

	public void setClassRoom(int ClassRoom) {
		this.ClassRoom = ClassRoom;
	}

	public int getProfessorDetails() {
		return this.ProfessorDetails;
	}

	public void setProfessorDetails(int ProfessorDetails) {
		this.ProfessorDetails = ProfessorDetails;
	}

}