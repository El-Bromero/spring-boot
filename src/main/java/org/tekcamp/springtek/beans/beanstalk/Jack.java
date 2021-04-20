package org.tekcamp.springtek.beans.beanstalk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class Jack {
	//The tms and students arrays should be injected by the Spring Container instead of being instantiated directly here.

	@Qualifier("getTms")
	@Autowired
	String[] tms;


	@Qualifier("getStudents")
	@Autowired
	String[] students;

	public void showPeople() {
		System.out.println("students : " + Arrays.toString(students));
		System.out.println("TM's : " + Arrays.toString(tms));
	}

	public Map<String, String[] > pairTmWithStudents() {
		/* map each TM with an Array of students belonging to each TM.
			ex (output may not look exactly like in this order, but key / val pairs should match as below) :
				{"Alex" = {"Anna","Brandon","Jude","Rinn"},
				"Craig" = {"Alex","Cason","Jorge"},
				"Desaree" = {"Brittany","Cameron","Jacob","Kyle","Paul"},
				"Matt" = {"Chad","Chris Jones","Ed","Jaleel","James","Marina","Taylor"},
				"Marcelo" = {"Chris Santiago","Irina","Monica","Ryan","Shannon","Sikeisha"}}
		 */
		HashMap<String, String[]> tmWithStudents = new HashMap<>();
		List<String> studentList = new ArrayList<>();
		for (String tm : tms) {
			studentList.clear();
			for (String student : students) {
				switch(tm) {
					case "Alex":
						if(student.equals("Anna") || student.equals("Brandon") || student.equals("Jude") || student.equals("Rinn"))
						{
							studentList.add(student);
						}
						break;
					case "Craig":
						if(student.equals("Alex") || student.equals("Cason") || student.equals("Jorge"))
						{
							studentList.add(student);
						}
						break;
					case "Desaree":
						if(student.equals("Brittany") || student.equals("Cameron") || student.equals("Jacob") || student.equals("Kyle") || student.equals("Paul"))
						{
							studentList.add(student);
						}
						break;
					case "Matt":
						if(student.equals("Chad") || student.equals("Chris Jones") || student.equals("Ed") || student.equals("Jaleel") || student.equals("James")|| student.equals("Marina")|| student.equals("Taylor"))
						{
							studentList.add(student);
						}
						break;
					case "Marcelo":
						if(student.equals("Chris Santiago") || student.equals("Irina") || student.equals("Monica") || student.equals("Ryan")|| student.equals("Shannon")|| student.equals("Sikeisha"))
						{
							studentList.add(student);
						}
						break;
					default:
						throw new IllegalStateException("Unexpected value: " + tm);
				}
			}
			String[] studentArray =  studentList.toArray(new String[studentList.size()]);
			tmWithStudents.put(tm, studentArray);
		}
		return tmWithStudents;
	}

}