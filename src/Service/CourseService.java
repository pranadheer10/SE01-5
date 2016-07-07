package Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

import modelDM.CourseDM;
import modelDM.FacultyDM;

public class CourseService {

	ArrayList<String> CourseCode;
	ArrayList<String> CourseName;
	ArrayList<String> CourseDescription;
	ArrayList<String> CourseHours;
	ArrayList<String> CourseCap;
	ArrayList<String> OfferedFall;
	ArrayList<String> OfferedSpring;
	ArrayList<String> OfferedSummer;
	ArrayList<String> CoursePrereqs;
	ArrayList<String> Teachers;

	public static String alldata = "";

	public static ArrayList<CourseDM> AllCoursesDM;

	public void loadCoursesIntoLists() {
		CourseCode = new ArrayList<String>();
		CourseName = new ArrayList<String>();
		CourseDescription = new ArrayList<String>();
		CourseHours = new ArrayList<String>();
		CourseCap = new ArrayList<String>();
		OfferedFall = new ArrayList<String>();
		OfferedSpring = new ArrayList<String>();
		OfferedSummer = new ArrayList<String>();
		CoursePrereqs = new ArrayList<String>();
		Teachers = new ArrayList<String>();
		AllCoursesDM = new ArrayList<CourseDM>();

		File file = new File("TestCourse.txt");

		BufferedReader br = null;

		try {

			String sCurrentLine = "";

			br = new BufferedReader(new FileReader(file));

			while ((sCurrentLine = br.readLine()) != null) {
				if (br.readLine() == null) {
					break;
				}
				String data[] = sCurrentLine.split(",");

				if (data.length > 1)
					CourseCode.add(data[0]);
				else
					CourseCode.add("");
				if (data.length > 2)
					CourseName.add(data[1]);
				else
					CourseName.add("");
				if (data.length > 3)
					CourseDescription.add(data[2]);
				else
					CourseDescription.add("");
				if (data.length > 4)
					CourseHours.add(data[3]);
				else
					CourseHours.add("");
				if (data.length > 5)
					CourseCap.add(data[5]);
				else
					CourseCap.add("");
				if (data.length > 6)
					OfferedFall.add(data[6]);
				else
					OfferedFall.add("");
				if (data.length > 7)
					OfferedSpring.add(data[7]);
				else
					OfferedSpring.add("");
				if (data.length > 8)
					OfferedSummer.add(data[8]);
				else
					OfferedSummer.add("");
				if (data.length > 9)
					CoursePrereqs.add(data[9]);
				else
					CoursePrereqs.add("");
				if (data.length > 10)
					Teachers.add(data[10]);
				else
					Teachers.add("");
			}
			for (int i = 0; i < CourseCode.size(); i++) {
				CourseDM courseDM = new CourseDM();
				courseDM.setCourseCode(CourseCode.get(i));
				courseDM.setCourseName(CourseName.get(i));
				courseDM.setCourseDescription(CourseDescription.get(i));
				courseDM.setCourseHours(CourseHours.get(i));
				courseDM.setCourseCap(CourseCap.get(i));
				courseDM.setOfferedFall(OfferedFall.get(i));
				courseDM.setOfferedSpring(OfferedSpring.get(i));
				courseDM.setOfferedSummer(OfferedSummer.get(i));
				courseDM.setCoursePrereqs(CoursePrereqs.get(i));
				courseDM.setTeachers(Teachers.get(i));
				AllCoursesDM.add(courseDM);
			}

		} catch (Exception e2) {
			System.out.println(e2);
		}

	}

	public static void main(String ar[]) {
		new CourseService().loadCoursesIntoLists();
		for (CourseDM courseDM : CourseService.AllCoursesDM) {
			System.out.println(courseDM.dataprint());

		}

	}
}
