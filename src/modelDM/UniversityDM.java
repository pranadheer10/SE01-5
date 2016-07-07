package modelDM;

public class UniversityDM {
	private String Name;
	private String abbreviation;


	public String getName() {
		return Name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the abbreviation
	 */
	public String getAbbreviation() {
		return abbreviation;
	}

	/**
	 * @param abbreviation
	 *            the abbreviation to set
	 */
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	public String printdata() {
		 
		return "Name= "+getName()+"\nAbbreviation= "+getAbbreviation() ;
	}
	
	public String printdata2() {
		 
		return ""+getName()+" - "+getAbbreviation() ;
	}

	
}
