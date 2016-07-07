package Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import modelDM.GradSchoolDM;

public class GradSchoolService {

	ArrayList<String> Abbreviation;
	ArrayList<String> GradSchool;

	public static String alldata = "";

	public static ArrayList<GradSchoolDM> AllGradDM;

	public void loadGradSchoolLists() {

		Abbreviation = new ArrayList<String>();

		GradSchool = new ArrayList<String>();

		AllGradDM = new ArrayList<GradSchoolDM>();
		File file = new File("TestGradSchools.txt");

		BufferedReader br = null;

		try {

			String sCurrentLine = "";

			br = new BufferedReader(new FileReader(file));

			while ((sCurrentLine = br.readLine()) != null) {
				String data[] = sCurrentLine.split(",");
				// for (int i = 0; i < data.length; i++) {
				if (data.length >= 1)
					Abbreviation.add(data[0]);
				else
					Abbreviation.add("");
				if (data.length >= 2)
					GradSchool.add(data[1]);
				else
					GradSchool.add("");

				

				// }

			}
			// JOptionPane.showMessageDialog(null, Name.size());
			for (int i = 0; i < Abbreviation.size(); i++) {
				GradSchoolDM gradschoolDM = new GradSchoolDM();
				gradschoolDM.setAbbreviation(Abbreviation.get(i));
				gradschoolDM.setGradSchool(GradSchool.get(i));

				AllGradDM.add(gradschoolDM);
				System.out.println(gradschoolDM.printdata());
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
		new GradSchoolService().loadGradSchoolLists();
		;
	}

}
