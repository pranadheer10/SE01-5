package VPProjects;

import java.util.*;

/**
 * THis class describes the capacity of the professor
 * 1. maximum number of courses he can teach per day
 * 2. maximum number of courses he can teach in a semester tec.
 */
public class FacultyLoad {

	ArrayList<Faculty> Faculty;
	ArrayList<Semester> Semester;
	ArrayList<Schedule> Schedule;
	/**
	 * This describes the number of hours he can teach
	 */
	private int hours;
	/**
	 * This describes the numbers of days that a faculty can teach
	 */
	private String Days;
	/**
	 * THis describes the maximum number of subjects that a professor can teach
	 */
	private String MaxNumberOfSubjects;
	/**
	 * This describes the minimum number of subjects a faculty can teach
	 */
	private int MinNumberOfSubjectts;

	public int getHours() {
		return this.hours;
	}

	/**
	 * 
	 * @param hours
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getDays() {
		// TODO - implement FacultyLoad.getDays
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Days
	 */
	public void setDays(String Days) {
		// TODO - implement FacultyLoad.setDays
		throw new UnsupportedOperationException();
	}

	public String getMaxNumberOfSubjects() {
		// TODO - implement FacultyLoad.getMaxNumberOfSubjects
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param MaxNumberOfSubjects
	 */
	public void setMaxNumberOfSubjects(String MaxNumberOfSubjects) {
		// TODO - implement FacultyLoad.setMaxNumberOfSubjects
		throw new UnsupportedOperationException();
	}

	public int getMinNumberOfSubjectts() {
		// TODO - implement FacultyLoad.getMinNumberOfSubjectts
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param MinNumberOfSubjectts
	 */
	public void setMinNumberOfSubjectts(int MinNumberOfSubjectts) {
		// TODO - implement FacultyLoad.setMinNumberOfSubjectts
		throw new UnsupportedOperationException();
	}

}