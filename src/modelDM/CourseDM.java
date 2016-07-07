package modelDM;

public class CourseDM {

	private String CourseCode;
	private String CourseName;
	private String CourseDescription;
	private String CourseHours;
	private String CourseCap;
	private String OfferedFall;
	private String OfferedSpring;
	private String OfferedSummer;
	private String CoursePrereqs;
	private String Teachers;

	/**
	 * @return the courseCode
	 */
	public String getCourseCode() {
		return CourseCode;
	}

	/**
	 * @param courseCode
	 *            the courseCode to set
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
	 * @param courseName
	 *            the courseName to set
	 */
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	/**
	 * @return the courseDescription
	 */
	public String getCourseDescription() {
		return CourseDescription;
	}

	/**
	 * @param courseDescription
	 *            the courseDescription to set
	 */
	public void setCourseDescription(String courseDescription) {
		CourseDescription = courseDescription;
	}

	/**
	 * @return the courseHours
	 */
	public String getCourseHours() {
		return CourseHours;
	}

	/**
	 * @param courseHours
	 *            the courseHours to set
	 */
	public void setCourseHours(String courseHours) {
		CourseHours = courseHours;
	}

	/**
	 * @return the courseCap
	 */
	public String getCourseCap() {
		return CourseCap;
	}

	/**
	 * @param courseCap
	 *            the courseCap to set
	 */
	public void setCourseCap(String courseCap) {
		CourseCap = courseCap;
	}

	/**
	 * @return the offeredFall
	 */
	public String getOfferedFall() {
		return OfferedFall;
	}

	/**
	 * @param offeredFall
	 *            the offeredFall to set
	 */
	public void setOfferedFall(String offeredFall) {
		OfferedFall = offeredFall;
	}

	/**
	 * @return the offeredSpring
	 */
	public String getOfferedSpring() {
		return OfferedSpring;
	}

	/**
	 * @param offeredSpring
	 *            the offeredSpring to set
	 */
	public void setOfferedSpring(String offeredSpring) {
		OfferedSpring = offeredSpring;
	}

	/**
	 * @return the offeredSummer
	 */
	public String getOfferedSummer() {
		return OfferedSummer;
	}

	/**
	 * @param offeredSummer
	 *            the offeredSummer to set
	 */
	public void setOfferedSummer(String offeredSummer) {
		OfferedSummer = offeredSummer;
	}

	/**
	 * @return the coursePrereqs
	 */
	public String getCoursePrereqs() {
		return CoursePrereqs;
	}

	/**
	 * @param coursePrereqs
	 *            the coursePrereqs to set
	 */
	public void setCoursePrereqs(String coursePrereqs) {
		CoursePrereqs = coursePrereqs;
	}

	/**
	 * @return the teachers
	 */
	public String getTeachers() {
		return Teachers;
	}

	/**
	 * @param teachers
	 *            the teachers to set
	 */
	public void setTeachers(String teachers) {
		Teachers = teachers;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	public String dataprint() {
		return ""
				+ "CourseCode "
				+ getCourseCode()
				+ "\nCourseName "
				+ getCourseName()
				+ "\nCourseDescription"
				+ getCourseDescription()
				+ "\nCourseHours "
				+ getCourseHours()
				+ "\nCourseCap "
				+ getCourseCap()
				+ "\nOfferedFall"
				+ getOfferedFall()
				+ "\nOfferedSpring"
				+ getOfferedSpring()
				+ "\nOfferedSummer"
				+ getOfferedSummer()
				+ "\nCoursePrereqs"
				+ getCoursePrereqs()
				+ "\nTeachers "
				+ getTeachers()
				+ "\n****************************************************************";
	}
	
	public String dataprint2() {
		return ""
				+ ""
				+ getCourseCode()
				+ " - "
				+ getCourseName()
				+ " - "
				+ getCourseDescription()
				+ " - "
				+ getCourseHours()
				+ " - "
				+ getCourseCap()
				+ " - "
				+ getOfferedFall()
				+ " - "
				+ getOfferedSpring()
				+ " - "
				+ getOfferedSummer()
				+ " - "
				+ getCoursePrereqs()
				+ " - "
				+ getTeachers()
				+ "";
	}
	

}
