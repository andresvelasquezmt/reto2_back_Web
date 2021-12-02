package Reto2Web;

import Reto2Web.interfaces.InterfaceGadget;
import Reto2Web.interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class Reto2WebApplication implements CommandLineRunner {
    
    @Autowired
    private InterfaceGadget interfaceGadget;
    @Autowired
    private InterfaceUser interfaceUser;

	public static void main(String[] args) {
		SpringApplication.run(Reto2WebApplication.class, args);
	}
        
                @Override
    public void run(String... args) throws Exception {
        interfaceGadget.deleteAll();
        interfaceUser.deleteAll();
    }

}
