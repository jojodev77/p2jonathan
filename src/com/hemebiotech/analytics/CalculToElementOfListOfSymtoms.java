package com.hemebiotech.analytics;

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
	 * @throws Exception 
	 * @Return file creation and writing, calculation iceteration
	 */
	public void calculToFrequenceElement(List<String> list) throws Exception {
		if (list == null) {
			throw new Exception("list of symptoms is null");
		}
		Set<String> set = new LinkedHashSet<>();
		Collections.sort(list);
		set.addAll(list);
		FileWriter writer = new FileWriter("src/ressources/result.out");
		for (String s : set) {
			s = s + " = " + Collections.frequency(list, s);
			writer.write(s);
			writer.write("\n");
		}
		writer.close();
		System.out.println("file writter finish");
	}

}
