package com.munvo.enrichment.parser;

import com.munvo.enrichment.model.Subscriber;

import org.json.JSONException;
import org.json.JSONObject;


public class JSONParser implements FileReaderParser {

	@Override
	public Subscriber parseSubscriber(String subLine) {
		
		try {
			//creating JSON object from string
			JSONObject json = new JSONObject(subLine);
			
			int id = json.getInt("id");
			Subscriber subscriber = new Subscriber(id, json.getString("name"), json.getString("phone"));
			
			return subscriber;
			
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return null;
	}

}
