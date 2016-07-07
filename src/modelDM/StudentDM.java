package modelDM;

public class StudentDM {
	private String studentID; 
	private String CourseCode; 
	private String CourseName; 
	private String Coursetaken ; 
	private String grade;
	/**
	 * @return the studentID
	 */
	public String getStudentID() {
		return studentID;
	}
	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	/**
	 * @return the courseCode
	 */
	public String getCourseCode() {
		return CourseCode;
	}
	/**
	 * @param courseCode the courseCode to set
	 */
	public void setCourseCode(String courseCode) {
		CourseCode = courseCode;
	}
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return CourseName;
	}
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	/**
	 * @return the coursetaken
	 */
	public String getCoursetaken() {
		return Coursetaken;
	}
	/**
	 * @param coursetaken the coursetaken to set
	 */
	public void setCoursetaken(String coursetaken) {
		Coursetaken = coursetaken;
	}
	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	} 
	


	public String dataprint() {
	
		
		return ""
				+ "studentID "
				+ getStudentID()
				+ "\nCourseCode "
				+ getCourseCode()
				+ "\nCourseName "
				+ getCourseName()
				+ "\nCoursetaken "
				+ getCoursetaken()
				+ "\ngrade "
				+ getGrade()
				+ "\n****************************************************************";
	}
	
	public String dataprint2() {
	
		
		return "" 
				+ ""
				+ getStudentID()
				+ " - "
				+ getCourseCode()
				+ " - "
				+ getCourseName()
				+ " - "
				+ getCoursetaken()
				+ " - "
				+ getGrade();

	}
	

}
