package Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import modelDM.DegreeDM;
import modelDM.UniversityDM;

public class DegreeService {
	// DegreeCode,Grad School,DegreeName,Forecast
	ArrayList<String> DegreeCode;

	ArrayList<String> Grad_School;
	ArrayList<String> DegreeName;
	ArrayList<String> Forecast;
	public static String alldata = "";

	public static ArrayList<DegreeDM> AllDegressDM;

	public void loadDegreestoLists() {

		DegreeCode = new ArrayList<String>();

		Grad_School = new ArrayList<String>();
		DegreeName = new ArrayList<String>();
		Forecast = new ArrayList<String>();

		AllDegressDM = new ArrayList<DegreeDM>();
		File file = new File("TestDegree.txt");

		BufferedReader br = null;

		try {

			String sCurrentLine = "";

			br = new BufferedReader(new FileReader(file));

			while ((sCurrentLine = br.readLine()) != null) {
				String data[] = sCurrentLine.split(",");

				if (data.length >= 1)
					DegreeCode.add(data[0]);
				else
					DegreeCode.add("");
				if (data.length >= 2)
					Grad_School.add(data[1]);
				else
					Grad_School.add("");
				if (data.length >= 3)
					DegreeName.add(data[2]);
				else
					DegreeName.add("");
				if (data.length >= 4)
					Forecast.add(data[3]);
				else
					Forecast.add("");

				// }

			}
			// JOptionPane.showMessageDialog(null, Name.size());
			for (int i = 0; i < DegreeCode.size(); i++) {
				DegreeDM degreeDM = new DegreeDM();
				degreeDM.setDegreeCode(DegreeCode.get(i));
				degreeDM.setGrad_school(Grad_School.get(i));
				degreeDM.setDegreeName(DegreeName.get(i));
				degreeDM.setForecast(Forecast.get(i));

				AllDegressDM.add(degreeDM);
				System.out.println(degreeDM.printdata());
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
		new DegreeService().loadDegreestoLists();;
	}

}
