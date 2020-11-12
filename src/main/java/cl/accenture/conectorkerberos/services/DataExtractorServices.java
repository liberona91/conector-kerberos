package cl.accenture.conectorkerberos.services;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cl.accenture.conectorkerberos.kerberos.ConectKerberos;

@Service("dataExtractorServices")
public class DataExtractorServices {

	final static Logger logger = Logger.getLogger(DataExtractorServices.class);
	
	@Autowired
	@Qualifier("conectKerberos")
	private ConectKerberos conectKerberos;
	
    public String getData () {
		logger.info("getDataServices - init");
		
		System.out.println("getDataServices - OK");
		
		String result = conectKerberos.conectKerkeros();
		
        return "getDataServices  OK";
    }
}
