package Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import javax.print.attribute.standard.MediaSize.NA;
import javax.swing.JOptionPane;

import modelDM.StudentDM;
import modelDM.UniversityDM;

public class UniversityService {

	ArrayList<String> Name;

	ArrayList<String> abbreviation;
	public static String alldata = "";

	public static ArrayList<UniversityDM> AllUniveristyDM;

	public void loadUniversitytoLists() {

		Name = new ArrayList<String>();

		abbreviation = new ArrayList<String>();

		AllUniveristyDM = new ArrayList<UniversityDM>();
		File file = new File("TestUniversity.txt");

		BufferedReader br = null;

		try {

			String sCurrentLine = "";

			br = new BufferedReader(new FileReader(file));

			while ((sCurrentLine = br.readLine()) != null) {
				String data[] = sCurrentLine.split(",");
				// for (int i = 0; i < data.length; i++) {
				if (data.length >= 1)
					Name.add(data[0]);
				else
					Name.add("");
				if (data.length >= 2)
					abbreviation.add(data[1]);
				else
					abbreviation.add("");

				// }

			}
//			JOptionPane.showMessageDialog(null, Name.size());
			for (int i = 0; i < Name.size(); i++) {
				UniversityDM universityDM = new UniversityDM();
				universityDM.setName(Name.get(i));
				universityDM.setAbbreviation(abbreviation.get(i));

				AllUniveristyDM.add(universityDM);
				System.out.println(universityDM.printdata());
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
		new UniversityService().loadUniversitytoLists();
	}

}
