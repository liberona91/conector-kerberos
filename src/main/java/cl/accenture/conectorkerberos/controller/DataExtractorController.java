package cl.accenture.conectorkerberos.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.accenture.conectorkerberos.services.DataExtractorServices;

@RestController
@RequestMapping("/extractor")
public class DataExtractorController {

	
	final static Logger logger = Logger.getLogger(DataExtractorController.class);
	
	@Autowired
	@Qualifier("dataExtractorServices")
	private DataExtractorServices dataExtractorServices;
	
	@GetMapping("/getData")
    public String getData () {
		System.out.println("getData - init");
		logger.info("getData - init");
		
		
		String result = dataExtractorServices.getData();
		System.out.println("getData - result: "+result);
		
        return "getData OK";
    }
}
