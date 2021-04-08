package org.tekcamp.springtek.beans.beanstalk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Jack {
	//The tms and students arrays should be injected by the Spring Container instead of being instantiated directly here.
	String[] tms = new String[]{};
	String[] students = new String[]{};

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
		return new HashMap();
	}

}