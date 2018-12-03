package edu.ucsb.cs56.gaucho_gardens.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import edu.ucsb.cs56.gaucho_gardens.database.Database;
import org.springframework.beans.factory.annotation.Autowired;


@SpringBootApplication
public class Application{

    public static void main(String[] args) {
	SpringApplication.run(Application.class, args);
    }

    
}
