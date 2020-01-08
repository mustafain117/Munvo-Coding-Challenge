package com.munvo.enrichment.parser;

import com.munvo.enrichment.configuration.Configuration;

/**
 * This class is applies factory pattern to instantiate a FileReaderParser
 * @author mustafainali
 * 
 */
public class Parser {
	
	/**
	 * instantiates a FileReaderParser based on value of type in configuration
	 * @param config
	 * @return JSONParser if type is JSON, CsvParser if type is CSV
	 */
	public FileReaderParser getParser(Configuration config) {
		
		if(config.getType().equals("JSON")) {
			return new JSONParser();
		}
		else if(config.getType().equals("CSV")){
			return new CsvParser();
		}
		else {
			return null;
		}
	}
}
