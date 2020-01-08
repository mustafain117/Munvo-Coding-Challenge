package com.munvo.enrichment.parser;

import com.munvo.enrichment.model.Subscriber;

public class CsvParser implements FileReaderParser {

	@Override
	public Subscriber parseSubscriber(String subLine) {
		
		//split string using comma delimiter
		String[] lineSplit = subLine.split(",");
		
		if(lineSplit.length != 3) {
			//should ideally throw an exception but would not be compatible with FileReaderParser interface
			System.out.println("invalid format!");
		}
		return new Subscriber(Integer.parseInt(lineSplit[0]), lineSplit[1], lineSplit[2]);
	}
	
}
