package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	/**
	 * 
	 * @param filepath
	 * @throws FileNotFoundException
	 * Vérification de la présence du fichier
	 */
	public ReadSymptomDataFromFile (String filepath) throws FileNotFoundException {
		if (filepath == null) {
			throw new FileNotFoundException();
		}
		this.filepath = filepath;
	}
	
	/**
	 * @author j.de-la-osa
	 * @throws IOException
	 * active la lecture du fichier et renvoi le resultat
	 * 
	 */
	@Override
	public List<String> getSymptoms() {
		ArrayList<String> result = new ArrayList<String>();
		
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
					
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
