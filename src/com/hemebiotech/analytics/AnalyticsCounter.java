package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class AnalyticsCounter {
	/**
	 * @author j.de-la-osa
	 * debug application java
	 * @param 
	 * 
	 */
	public static void main(String args[]) throws Exception {
		
		/**
		 * @author j.de-la-osa
		 * @return Récupération du fichier des symptomes et active la lecture du fichier
		 */
		ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("./symptoms.txt");
		
	
	
		/**
		 * @author j.de-la-osa
		 * @return active la mise en forme du fichier
		 */
		CalculToElementOfListOfSymtoms calculToElementOfListOfSymtoms = new CalculToElementOfListOfSymtoms();
		calculToElementOfListOfSymtoms.calculToFrequenceElement(readSymptomDataFromFile.getSymptoms());
		
	}
}
