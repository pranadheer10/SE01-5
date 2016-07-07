package modelDM;

public class GradSchoolDM {

	private String Abbreviation;
	private String GradSchool;

	
	public String getAbbreviation() {
		return Abbreviation;
	}

	
	public void setAbbreviation(String abbreviation) {
		Abbreviation = abbreviation;
	}

	
	public String getGradSchool() {
		return GradSchool;
	}

	public void setGradSchool(String gradSchool) {
		GradSchool = gradSchool;
	}

	public String printdata() {

		return "Abbreviation = " + getAbbreviation() + "\nGradSchool "
				+ getGradSchool();
	}

	public String printdata2() {
		return "" + getAbbreviation() + " - "
				+ getGradSchool();
	}

}
