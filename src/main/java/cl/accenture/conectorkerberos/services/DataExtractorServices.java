package cl.accenture.conectorkerberos.services;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service("dataExtractorServices")
public class DataExtractorServices {

final static Logger logger = Logger.getLogger(DataExtractorServices.class);
	
    public String getData () {
		logger.info("getDataServices - init");
		
		System.out.println("getDataServices - OK");
		
        return "getDataServices  OK";
    }
}
