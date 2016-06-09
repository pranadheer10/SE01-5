package VPProjects;

import java.util.*;

/**
 * This describes The special degree requirements for a course which is associated to degreePlan
 */
public class DegreeRequirements {

	DegreePlan DegreePlan;
	ArrayList<Course> courses;
	/**
	 * This has information of Degree Requirement Name
	 *  
	 */
	private String name;
	/**
	 * This number of hours required to meet the degree requirements
	 *  
	 */
	private int hours;
	/**
	 * THis describes the type of degree Requirements
	 */
	private String type;

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

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

	public String getType() {
		return this.type;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

}