package cl.accenture.conectorkerberos.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api")
public class conector {
	@PostMapping("/prueba")
    public String prueba () {
        return "Hola";
    }
	
	public String connectToEdge() {
		
		return "Hola que tal";
	}
	
}
