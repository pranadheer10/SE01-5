package Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import modelDM.SemesterDM;
import modelDM.UniversityDM;

public class SemesterService {

	ArrayList<String> SemesterName;
	ArrayList<String> StratDate;

	ArrayList<String> EndDate;
	public static String alldata = "";

	public static ArrayList<SemesterDM> AllSemestersDM;

	public void loadSemestersLists() {

		SemesterName = new ArrayList<String>();

		StratDate = new ArrayList<String>();
		EndDate = new ArrayList<String>();

		AllSemestersDM = new ArrayList<SemesterDM>();
		File file = new File("TestSemesters.txt");

		BufferedReader br = null;

		try {

			String sCurrentLine = "";

			br = new BufferedReader(new FileReader(file));

			while ((sCurrentLine = br.readLine()) != null) {
				String data[] = sCurrentLine.split(",");
				// for (int i = 0; i < data.length; i++) {
				if (data.length >= 1)
					SemesterName.add(data[0]);
				else
					SemesterName.add("");
				if (data.length >= 2)
					StratDate.add(data[1]);
				else
					StratDate.add("");

				if (data.length >= 3)
					EndDate.add(data[2]);
				else
					EndDate.add("");

				// }

			}
			// JOptionPane.showMessageDialog(null, Name.size());
			for (int i = 0; i < SemesterName.size(); i++) {
				SemesterDM semesterDM = new SemesterDM();
				semesterDM.setSemesterName(SemesterName.get(i));
				semesterDM.setStart_Date(StratDate.get(i));
				semesterDM.setEnd_Date(EndDate.get(i));

				AllSemestersDM.add(semesterDM);
				System.out.println(semesterDM.printdata());
			}

			// System.out.println(AllUniveristyDM.size());
			// for (UniversityDM universityDM : AllUniveristyDM) {
			// System.out.println(universityDM);
			// alldata = universityDM +alldata ;
			// }

		} catch (Exception e2) {
			System.out.println(e2);
		}
	}

	public static void main(String ar[]) {
		new SemesterService().loadSemestersLists();
		;
	}

}
