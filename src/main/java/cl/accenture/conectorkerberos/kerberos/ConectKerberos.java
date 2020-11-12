package cl.accenture.conectorkerberos.kerberos;

import org.springframework.stereotype.Service;

@Service("conectKerberos")
public class ConectKerberos {

	
	public String conectKerkeros () {

		
		System.out.println("conectKerkeros - OK");
		
        return "conectKerkeros  OK";
    }
}
