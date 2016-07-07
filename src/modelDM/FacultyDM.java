package modelDM;


public class FacultyDM {
	private String lastName; 
	private String FirstName ; 
	private String Grad ; 
	private String School ; 
	private String Degree ; 
	private String Title ; 
	private String DaysToTeach ; 
	private String MaxLoadFall ; 
	private String MaxLoadSpring ; 
	private String MaxLoadSummer ;
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	/**
	 * @return the grad
	 */
	public String getGrad() {
		return Grad;
	}
	/**
	 * @param grad the grad to set
	 */
	public void setGrad(String grad) {
		Grad = grad;
	}
	/**
	 * @return the school
	 */
	public String getSchool() {
		return School;
	}
	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		School = school;
	}
	/**
	 * @return the degree
	 */
	public String getDegree() {
		return Degree;
	}
	/**
	 * @param degree the degree to set
	 */
	public void setDegree(String degree) {
		Degree = degree;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return Title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		Title = title;
	}
	/**
	 * @return the daysToTeach
	 */
	public String getDaysToTeach() {
		return DaysToTeach;
	}
	/**
	 * @param daysToTeach the daysToTeach to set
	 */
	public void setDaysToTeach(String daysToTeach) {
		DaysToTeach = daysToTeach;
	}
	/**
	 * @return the maxLoadFall
	 */
	public String getMaxLoadFall() {
		return MaxLoadFall;
	}
	/**
	 * @param maxLoadFall the maxLoadFall to set
	 */
	public void setMaxLoadFall(String maxLoadFall) {
		MaxLoadFall = maxLoadFall;
	}
	/**
	 * @return the maxLoadSpring
	 */
	public String getMaxLoadSpring() {
		return MaxLoadSpring;
	}
	/**
	 * @param maxLoadSpring the maxLoadSpring to set
	 */
	public void setMaxLoadSpring(String maxLoadSpring) {
		MaxLoadSpring = maxLoadSpring;
	}
	/**
	 * @return the maxLoadSummer
	 */
	public String getMaxLoadSummer() {
		return MaxLoadSummer;
	}
	/**
	 * @param maxLoadSummer the maxLoadSummer to set
	 */
	public void setMaxLoadSummer(String maxLoadSummer) {
		MaxLoadSummer = maxLoadSummer;
	}


	public String dataprint() {
		return ""
				+ "lastName "
				+ getLastName()
				+ "\nFirstName "
				+ getFirstName()
				+ "\nGrad"
				+ getGrad()
				+ "\nSchool "
				+ getSchool()
				+ "\nDegree "
				+ getDegree()
				+ "\nTitle"
				+ getTitle()
				+ "\nDaysToTeach"
				+ getDaysToTeach()
				+ "\nMaxLoadFall"
				+ getMaxLoadFall()
				+ "\nMaxLoadSpring"
				+ getMaxLoadSpring()
				+ "\n****************************************************************";
	}
	
	public String dataprint2() {
		return ""
				+ ""
				+ getLastName()
				+ " - "
				+ getFirstName()
				+ " - "
				+ getGrad()
				+ " - "
				+ getSchool()
				+ " - "
				+ getDegree()
				+ " - "
				+ getTitle()
				+ " - "
				+ getDaysToTeach()
				+ " - "
				+ getMaxLoadFall()
				+ " - "
				+ getMaxLoadSpring()
				+ "";
	}
	
	
}
