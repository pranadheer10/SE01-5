package modelDM;

public class DegreeDM {
	// DegreeCode,Grad School,DegreeName,Forecast

	private String DegreeCode;
	private String Grad_school;
	private String DegreeName;
	private String Forecast;

	/**
	 * @return the degreeCode
	 */
	public String getDegreeCode() {
		return DegreeCode;
	}

	/**
	 * @param degreeCode
	 *            the degreeCode to set
	 */
	public void setDegreeCode(String degreeCode) {
		DegreeCode = degreeCode;
	}

	/**
	 * @return the grad_school
	 */
	public String getGrad_school() {
		return Grad_school;
	}

	/**
	 * @param grad_school
	 *            the grad_school to set
	 */
	public void setGrad_school(String grad_school) {
		Grad_school = grad_school;
	}

	/**
	 * @return the degreeName
	 */
	public String getDegreeName() {
		return DegreeName;
	}

	/**
	 * @param degreeName
	 *            the degreeName to set
	 */
	public void setDegreeName(String degreeName) {
		DegreeName = degreeName;
	}

	/**
	 * @return the forecast
	 */
	public String getForecast() {
		return Forecast;
	}

	/**
	 * @param forecast
	 *            the forecast to set
	 */
	public void setForecast(String forecast) {
		Forecast = forecast;
	}

	public String printdata() {

		return "DegreeCode = " + getDegreeCode() + "\nGrad School "
				+ getGrad_school() + "\n,DegreeName " + getDegreeName()
				+ "\n,Forcasr" + getForecast()+"\n***************************************";
	}

	public String printdata2() {

		return "" + getDegreeCode() + " - " + getGrad_school() + " - "
				+ getDegreeName() + " - " + getForecast();
	}
}
