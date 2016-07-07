package modelDM;

public class SemesterDM {

	private String SemesterName;
	private String Start_Date;
	private String End_Date;

	/**
	 * @return the semesterName
	 */
	public String getSemesterName() {
		return SemesterName;
	}

	/**
	 * @param semesterName
	 *            the semesterName to set
	 */
	public void setSemesterName(String semesterName) {
		SemesterName = semesterName;
	}

	/**
	 * @return the start_Date
	 */
	public String getStart_Date() {
		return Start_Date;
	}

	/**
	 * @param start_Date
	 *            the start_Date to set
	 */
	public void setStart_Date(String start_Date) {
		Start_Date = start_Date;
	}

	/**
	 * @return the end_Date
	 */
	public String getEnd_Date() {
		return End_Date;
	}

	/**
	 * @param end_Date
	 *            the end_Date to set
	 */
	public void setEnd_Date(String end_Date) {
		End_Date = end_Date;
	}

	public String printdata() {

		return "Semester Name = " + getSemesterName() + "\nStarteDate "
				+ getStart_Date() + "\nEndDate" + getEnd_Date();
	}

	public String printdata2() {
		return "" + getSemesterName() + " - "
				+ getStart_Date() + " - " + getEnd_Date();
	}

}
