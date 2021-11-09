package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class AnalyticsCounter {
	/**
	 * @author j.de-la-osa
	 * debug java application readf of symptoms
	 * 
	 * 
	 */
	public static void main(String args[]) throws Exception {
		
		/* get give file of symptoms*/
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("src/ressources/symptoms.txt");
		List<String> symptomsRead = readSymptomDataFromFile.getSymptoms();
		
		/* Get method of calcul number to symtoms*/
		CalculToElementOfListOfSymtoms calculToElementOfListOfSymtoms = new CalculToElementOfListOfSymtoms();
		
		/* Get of list of symptoms*/
		calculToElementOfListOfSymtoms.calculToFrequenceElement(symptomsRead);
		
	}
}
