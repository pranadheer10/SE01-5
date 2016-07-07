package modelDM;


public class FacultyDMNew {
	private String lastName; 
	private String FirstName ; 
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
				+ getDaysToTeach()
				+ " - "
				+ getMaxLoadFall()
				+ " - "
				+ getMaxLoadSpring()
				+ "";
	}
	
	
}
