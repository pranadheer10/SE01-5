package ScheduleUI;
 
import SchedulePD.University;
import SchedulePD.Semester;
import SchedulePD.GradSchools;

public class StartUI {

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {
		
		University university  = new University();
		university.init();
		printUniversity(university);
		UniversityFrame.startGUI(university);
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void printUniversity(University university)
	{
		System.out.println("University Report");
		System.out.println("University :"+university.toString());
		System.out.println("GradSchools");
		for (GradSchools gradSchool : university.getGradSchools())
		{
			System.out.println(gradSchool.toString());
			System.out.println("--------------------------");
			for (Semester semester : gradSchool.getSemester())
			{ 
				System.out.println(semester.toString());
			}
			System.out.println("");
		}
	}

}
