package VPProjects;

import java.util.*;

/**
 * The degree plan is the estimation of a particular course
 * it has name,code,hours
 */
public class DegreePlan {

	ArrayList<GradSchool> Gradschools;
	ArrayList<Student> students;
	ArrayList<Students> Students;
	ArrayList<DegreeRequirements> DegreeRequirements;
	Schedule Schedule;
	/**
	 * Degree plan has a name like Spring2016 tec
	 */
	private String name;
	/**
	 * This is the unique code given for a particular degree Plan
	 */
	private String code;
	/**
	 * It describes the number of hours for a degree Plan
	 */
	private int hours;
	/**
	 * Particular degree plan is associated with a particular department
	 */
	private String Department;

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public String setName(String name) {
		// TODO - implement DegreePlan.setName
		throw new UnsupportedOperationException();
	}

	public String getCode() {
		return this.code;
	}

	/**
	 * 
	 * @param code
	 */
	public String setCode(String code) {
		// TODO - implement DegreePlan.setCode
		throw new UnsupportedOperationException();
	}

	public int getHours() {
		return this.hours;
	}

	/**
	 * 
	 * @param hours
	 */
	public int setHours(int hours) {
		// TODO - implement DegreePlan.setHours
		throw new UnsupportedOperationException();
	}

	public String getDepartment() {
		// TODO - implement DegreePlan.getDepartment
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Department
	 */
	public void setDepartment(String Department) {
		// TODO - implement DegreePlan.setDepartment
		throw new UnsupportedOperationException();
	}

}