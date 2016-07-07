package Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import modelDM.CourseDM;
import modelDM.FacultyDM;
import modelDM.StudentDM;

public class FacultyService {

	ArrayList<String> lastName;
	ArrayList<String> FirstName;
	ArrayList<String> Grad;
	ArrayList<String> School;
	ArrayList<String> Degree;
	ArrayList<String> Title;
	ArrayList<String> DaysToTeach;
	ArrayList<String> MaxLoadFall;
	ArrayList<String> MaxLoadSpring;
	ArrayList<String> MaxLoadSummer;

	public static String alldata = "";

	public static ArrayList<FacultyDM> AllFacultyDM;

	public void loadFacultyIntoLists() {
		lastName = new ArrayList<String>();
		FirstName = new ArrayList<String>();
		Grad = new ArrayList<String>();
		School = new ArrayList<String>();
		Degree = new ArrayList<String>();
		Title = new ArrayList<String>();
		DaysToTeach = new ArrayList<String>();
		MaxLoadFall = new ArrayList<String>();
		MaxLoadSpring = new ArrayList<String>();
		MaxLoadSummer = new ArrayList<String>();
		AllFacultyDM = new ArrayList<FacultyDM>();

		File file = new File("TestFaculty.txt");
		BufferedReader br = null;

		try {

			String sCurrentLine = "";

			br = new BufferedReader(new FileReader(file));
			int x = 0;
			while ((sCurrentLine = br.readLine()) != null) {
				String data[] = sCurrentLine.split(",");

				if (data.length > 1)
					lastName.add(data[0]);
				else
					lastName.add("");
				if (data.length > 2)
					FirstName.add(data[1]);
				else
					FirstName.add("");
				if (data.length > 3)
					Grad.add(data[2]);
				else
					Grad.add("");
				if (data.length > 4)
					School.add(data[3]);
				else
					School.add("");
				if (data.length > 5)
					Degree.add(data[5]);
				else
					Degree.add("");
				if (data.length > 6)
					Title.add(data[6]);
				else
					Title.add("");
				if (data.length > 7)
					DaysToTeach.add(data[7]);
				else
					DaysToTeach.add("");
				if (data.length > 8)
					MaxLoadFall.add(data[8]);
				else
					MaxLoadFall.add("");
				if (data.length > 9)
					MaxLoadSpring.add(data[9]);
				else
					MaxLoadSpring.add("");
				if (data.length > 10)
					MaxLoadSummer.add(data[10]);
				else
					MaxLoadSummer.add("");

				// System.out.println("2");
			}

			for (int i = 0; i < Grad.size(); i++) {
				
				FacultyDM facultyDM = new FacultyDM();
				facultyDM.setLastName(lastName.get(i));
				facultyDM.setFirstName(FirstName.get(i));
				facultyDM.setGrad(Grad.get(i));
				facultyDM.setSchool(School.get(i));
				facultyDM.setDegree(Degree.get(i));
				facultyDM.setTitle(Title.get(i));
				facultyDM.setDaysToTeach(DaysToTeach.get(i));
				facultyDM.setMaxLoadFall(MaxLoadFall.get(i));
				facultyDM.setMaxLoadSpring(MaxLoadSpring.get(i));
				facultyDM.setMaxLoadSummer(MaxLoadSummer.get(i));
				AllFacultyDM.add(facultyDM);
			}
			//
			// for (FacultyDM facultyDM : AllFacultyDM) {
			// System.out.println(facultyDM);
			// alldata = alldata + facultyDM;
			// }
		}

		catch (Exception e2) {
			System.out.println(e2);
		}
	}

	public static void main(String ar[]) {
		new FacultyService().loadFacultyIntoLists();
		for (FacultyDM facultyDM : FacultyService.AllFacultyDM) {
			System.out.println(facultyDM.dataprint());
		}
	}

}
