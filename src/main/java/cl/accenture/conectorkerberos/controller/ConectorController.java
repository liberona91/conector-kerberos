package cl.accenture.conectorkerberos.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class ConectorController {
	
	final static Logger logger = Logger.getLogger(ConectorController.class);
	
	@PostMapping("/prueba")
    public String prueba () {
		logger.info("prueba - init");
        return "Hola";
    }
	
	public String connectToEdge() {
		
		return "Hola que tal";
	}
	
}
