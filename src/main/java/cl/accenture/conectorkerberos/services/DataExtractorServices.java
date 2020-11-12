package cl.accenture.conectorkerberos.services;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cl.accenture.conectorkerberos.kerberos.ConectKerberos;
import cl.accenture.conectorkerberos.model.TermsConditions;
import cl.accenture.conectorkerberos.repository.TermConditionsRepository;

@Service("dataExtractorServices")
public class DataExtractorServices {

	final static Logger logger = Logger.getLogger(DataExtractorServices.class);
	
	@Autowired
	@Qualifier("conectKerberos")
	private ConectKerberos conectKerberos;
	
	
	@Autowired
	private TermConditionsRepository termConditionsRepository;
	
    public String getData () {
		logger.info("getDataServices - init");
		
		System.out.println("getDataServices - OK");
		
		String resultKerberos = conectKerberos.conectKerkeros();
		
		List<TermsConditions> listTerms=  termConditionsRepository.findAll();
		
		for (TermsConditions termsConditions : listTerms) {
			System.out.println("for termsConditions :"+termsConditions.getTitulo());
		};
		
        return "getDataServices  OK";
    }
}
