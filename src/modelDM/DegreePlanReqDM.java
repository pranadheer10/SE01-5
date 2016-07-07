package modelDM;

public class DegreePlanReqDM {
	// DegreeCode,Description,Hours,Type,Courses
	private String DegreeCode;
	private String Description;
	private String Hours;
	private String Type;
	private String Courses;
	/**
	 * @return the degreeCode
	 */
	public String getDegreeCode() {
		return DegreeCode;
	}
	/**
	 * @param degreeCode the degreeCode to set
	 */
	public void setDegreeCode(String degreeCode) {
		DegreeCode = degreeCode;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return Description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		Description = description;
	}
	/**
	 * @return the hours
	 */
	public String getHours() {
		return Hours;
	}
	/**
	 * @param hours the hours to set
	 */
	public void setHours(String hours) {
		Hours = hours;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return Type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		Type = type;
	}
	/**
	 * @return the courses
	 */
	public String getCourses() {
		return Courses;
	}
	/**
	 * @param courses the courses to set
	 */
	public void setCourses(String courses) {
		Courses = courses;
	}
	
	public String dataprint() {
	
		// DegreeCode,Description,Hours,Type,Courses
		
		return ""
				+ "DegreeCode "
				+ getDegreeCode()
				+ "\nDescription "
				+ getDescription()
				+ "\nHours "
				+ getHours()
				+ "\nType "
				+ getType()
				+ "\nCourses "
				+ getCourses()
				+ "\n****************************************************************";
	}
	
	public String dataprint2() {
	
		
		return "" 
				+ ""
				+ getDegreeCode()
				+ " - "
				+ getDescription()
				+ " - "
				+ getHours()
				+ " - "
				+ getType()
				+ " - "
				+ getCourses();

	}
	
	

}
