package Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import modelDM.CourseDM;
import modelDM.FacultyDM;
import modelDM.StudentDM;

public class StudentService {

	ArrayList<String> studentID;
	ArrayList<String> CourseCode;
	ArrayList<String> CourseName;
	ArrayList<String> Coursetaken;
	ArrayList<String> grade;

	public static String alldata = "";

	public static ArrayList<StudentDM> AllStdeuntsDM;

	public void loadStudetIntoLists() {

		studentID = new ArrayList<String>();

		CourseCode = new ArrayList<String>();
		CourseName = new ArrayList<String>();
		Coursetaken = new ArrayList<String>();
		grade = new ArrayList<String>();

		AllStdeuntsDM = new ArrayList<StudentDM>();
		File file = new File("TestStudent.txt");

		BufferedReader br = null;

		try {

			String sCurrentLine = "";

			br = new BufferedReader(new FileReader(file));

			while ((sCurrentLine = br.readLine()) != null) {
				String data[] = sCurrentLine.split(",");
				if (data.length > 1)
					studentID.add(data[0]);
				else
					studentID.add("");
				if (data.length > 2)
					CourseCode.add(data[1]);
				else
					CourseCode.add("");
				if (data.length > 3)
					CourseName.add(data[2]);
				else
					CourseName.add("");
				if (data.length > 4)
					Coursetaken.add(data[3]);
				else
					Coursetaken.add("");
				if (data.length > 5)
					grade.add(data[4]);
				else
					grade.add("");
			}

			for (int i = 0; i < studentID.size(); i++) {
				StudentDM studentDM = new StudentDM();
				studentDM.setStudentID(studentID.get(i));
				studentDM.setCourseCode(CourseCode.get(i));
				studentDM.setCourseName(CourseName.get(i));
				studentDM.setCoursetaken(Coursetaken.get(i));
				studentDM.setGrade(grade.get(i));

				AllStdeuntsDM.add(studentDM);
				System.out.println(studentDM.dataprint());
			}

		} catch (Exception e2) {
			System.out.println(e2);
		}
	}

	public static void main(String ar[]) {
		new StudentService().loadStudetIntoLists();
		// for (StudentDM studentDM : StudentService.AllStdeuntsDM) {
		// System.out.println(studentDM.dataprint());
		// }
	}

}
