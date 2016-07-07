package Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import modelDM.DegreePlanReqDM;
import modelDM.StudentDM;

public class DegreePlanReqService {

	// DegreeCode,Description,Hours,Type,Courses
	ArrayList<String> DegreeCode;
	ArrayList<String> Description;
	ArrayList<String> Hours;
	ArrayList<String> Type;
	ArrayList<String> Courses;

	public static String alldata = "";

	public static ArrayList<DegreePlanReqDM> AllDegreePlanReq;

	public void loadDegreePlanReqIntoLists() {

		DegreeCode = new ArrayList<String>();

		Description = new ArrayList<String>();
		Hours = new ArrayList<String>();
		Type = new ArrayList<String>();
		Courses = new ArrayList<String>();

		AllDegreePlanReq = new ArrayList<DegreePlanReqDM>();
		File file = new File("TestDataDegreePlanReq.txt");

		BufferedReader br = null;

		try {

			String sCurrentLine = "";

			br = new BufferedReader(new FileReader(file));

			while ((sCurrentLine = br.readLine()) != null) {
				String data[] = sCurrentLine.split(",");
				if (data.length > 1)
					DegreeCode.add(data[0]);
				else
					DegreeCode.add("");
				if (data.length > 2)
					Description.add(data[1]);
				else
					Description.add("");
				if (data.length > 3)
					Hours.add(data[2]);
				else
					Hours.add("");
				if (data.length > 4)
					Type.add(data[3]);
				else
					Type.add("");
				if (data.length > 5)
					Courses.add(data[4]);
				else
					Courses.add("");
			}

			for (int i = 0; i < DegreeCode.size(); i++) {
				DegreePlanReqDM degreePlanReqDM = new DegreePlanReqDM();
				degreePlanReqDM.setDegreeCode(DegreeCode.get(i));
				degreePlanReqDM.setDescription(Description.get(i));
				degreePlanReqDM.setHours(Hours.get(i));
				degreePlanReqDM.setType(Type.get(i));
				degreePlanReqDM.setCourses(Courses.get(i));

				AllDegreePlanReq.add(degreePlanReqDM);
				System.out.println(degreePlanReqDM.dataprint());
			}

		} catch (Exception e2) {
			System.out.println(e2);
		}
	}

	public static void main(String ar[]) {
		new DegreePlanReqService().loadDegreePlanReqIntoLists();
		// for (StudentDM studentDM : StudentService.AllStdeuntsDM) {
		// System.out.println(studentDM.dataprint());
		// }
	}

}
