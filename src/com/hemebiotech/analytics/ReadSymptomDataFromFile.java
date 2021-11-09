package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author j.de-la-osa
 * @
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	/**
	 * Constructor
	 * @param filepath
	 * @throws FileNotFoundException
	 *  constructor and Checking the presence of the file
	 */
	public ReadSymptomDataFromFile (String filepath) throws FileNotFoundException {
		if (filepath == null) {
			throw new FileNotFoundException();
		}
		this.filepath = filepath;
	}
	
	/**
	 * @author j.de-la-osa
	 * @return Reading the file and returning the result
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
