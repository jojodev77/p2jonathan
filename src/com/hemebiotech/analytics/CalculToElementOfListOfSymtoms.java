package com.hemebiotech.analytics;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CalculToElementOfListOfSymtoms {
	
	/**
	 * 
	 * @param list
	 * @throws IOException
	 * Mise en forme de la liste
	 * calcul du nombre de repetition de chaque symptomes
	 * renvoi le resultat dans un nouveaux ficher: result.out
	 */
	public void calculToFrequenceElement(List<String> list) throws IOException {
		Set<String> set = new LinkedHashSet<>();
		set.addAll(list);
		List<String> listSymptoms = new ArrayList();

		for (String s : set) {
			s = s + " : " + Collections.frequency(list, s);
			if (s == null) {
				throw new IllegalArgumentException("Aucun symptomes présent dans la liste");
			}
			listSymptoms.add(s);
			FileWriter writer = new FileWriter ("src/ressources/result.out");
			int size = listSymptoms.size();
	        for (int i=0;i<size;i++) {
	            String str = listSymptoms.stream().sorted().collect(Collectors.toList()).get(i).toString();
	            writer.write(str);
	            if(i < size-1)
	                writer.write("\n");
	        }
	        writer.close();
		
		}
	
		
	
	}
	
}
