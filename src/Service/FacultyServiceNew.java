package Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import modelDM.CourseDM;
import modelDM.FacultyDMNew;
import modelDM.StudentDM;

public class FacultyServiceNew {

	ArrayList<String> lastName;
	ArrayList<String> FirstName;
	ArrayList<String> DaysToTeach;
	ArrayList<String> MaxLoadFall;
	ArrayList<String> MaxLoadSpring;
	ArrayList<String> MaxLoadSummer;

	public static String alldata = "";

	public static ArrayList<FacultyDMNew> AllFacultyDMNew;

	public void loadFacultyIntoLists() {
		lastName = new ArrayList<String>();
		FirstName = new ArrayList<String>();
		DaysToTeach = new ArrayList<String>();
		MaxLoadFall = new ArrayList<String>();
		MaxLoadSpring = new ArrayList<String>();
		MaxLoadSummer = new ArrayList<String>();
		AllFacultyDMNew = new ArrayList<FacultyDMNew>();

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
					DaysToTeach.add(data[7]);
				else
					DaysToTeach.add("");
				if (data.length > 4)
					MaxLoadFall.add(data[8]);
				else
					MaxLoadFall.add("");
				if (data.length > 5)
					MaxLoadSpring.add(data[9]);
				else
					MaxLoadSpring.add("");
				if (data.length > 6)
					MaxLoadSummer.add(data[10]);
				else
					MaxLoadSummer.add("");

				// System.out.println("2");
			}

			for (int i = 0; i <lastName.size() ; i++) {
				
				FacultyDMNew facultyDM = new FacultyDMNew();
				facultyDM.setLastName(lastName.get(i));
				facultyDM.setFirstName(FirstName.get(i));
				facultyDM.setDaysToTeach(DaysToTeach.get(i));
				facultyDM.setMaxLoadFall(MaxLoadFall.get(i));
				facultyDM.setMaxLoadSpring(MaxLoadSpring.get(i));
				facultyDM.setMaxLoadSummer(MaxLoadSummer.get(i));
				AllFacultyDMNew.add(facultyDM);
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
		for (FacultyDMNew facultyDM : FacultyServiceNew.AllFacultyDMNew) {
			System.out.println(facultyDM.dataprint());
		}
	}

}
