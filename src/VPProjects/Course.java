package VPProjects;

import java.util.*;

/**
 * This class describes the complete details about a particular course
 * which has course id,
 * Course name
 * Pre-reqs
 * And credit hours
 */
public class Course {

	ArrayList<Faculty> Faculty;
	StudentCourse studentcourses;
	ArrayList<GradSchool> Gradschool;
	ArrayList<StudentCourses> StudentCourse;
	ArrayList<Sections> sections;
	/**
	 * This is the Name of a particular course LIKE MSE,MSCE etc
	 */
	private String CourseName;
	/**
	 * Each and every course have an unique id
	 */
	private int CourseID;
	/**
	 * this describes the special courses needed to be taken before persuing it
	 */
	private String Prerequisites;
	/**
	 * number of hours required to that course
	 */
	private int CreditHours;

	public String getPrerequisites() {
		// TODO - implement Course.getPrerequisites
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Prerequisites
	 */
	public void setPrerequisites(String Prerequisites) {
		// TODO - implement Course.setPrerequisites
		throw new UnsupportedOperationException();
	}

	public int getCreditHours() {
		// TODO - implement Course.getCreditHours
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param CreditHours
	 */
	public void setCreditHours(int CreditHours) {
		// TODO - implement Course.setCreditHours
		throw new UnsupportedOperationException();
	}

	public int getCourseID() {
		// TODO - implement Course.getCourseID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param CourseID
	 */
	public void setCourseID(int CourseID) {
		// TODO - implement Course.setCourseID
		throw new UnsupportedOperationException();
	}

	public String getCourseName() {
		// TODO - implement Course.getCourseName
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param CourseName
	 */
	public void setCourseName(String CourseName) {
		// TODO - implement Course.setCourseName
		throw new UnsupportedOperationException();
	}

}