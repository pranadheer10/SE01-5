package VPProjects;

import java.util.*;

/**
 * the teaching staff of a university or college, or of one of its departments or divisions, viewed as a body.
 */
public class Faculty {

	ArrayList<GradSchool> gradschool;
	Schedule Schedule;
	ArrayList<Course> Courses;
	FacultyLoad FacultyLoad;
	/**
	 * It contains faculty Name
	 */
	private String facultyName;
	/**
	 * It has Facult id which is interger type
	 */
	private int facultyId;
	/**
	 * This describes the title of faculty like his personal degree info etc.
	 */
	private String title;

	public String getFacultyName() {
		return this.facultyName;
	}

	/**
	 * 
	 * @param facultyName
	 */
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public int getFacultyId() {
		return this.facultyId;
	}

	/**
	 * 
	 * @param facultyId
	 */
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	public String getTitle() {
		return this.title;
	}

	/**
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

}