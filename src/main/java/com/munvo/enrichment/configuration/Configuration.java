package com.munvo.enrichment.configuration;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class Configuration {

    private String studentName;
    private String type;
    private String fileName;
    
    //private instance which is accessed by getInstance() method
    private static Configuration configInstance;	
    	
    //private constructor
    private Configuration() {
        Config config = ConfigFactory.load();
        this.studentName = config.getString("name");
        this.type = config.getString("type");
        this.fileName = config.getString("fileName");
    }
    
    public static Configuration getInstance() {
    		if(configInstance == null) {
    		    //lazy initialization
    			configInstance = new Configuration();
    		}
    		return configInstance;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getType() {
        return type;
    }

    public String getFileName() {
        return fileName;
    }
}