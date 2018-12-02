package main.java.edu.ucsb.cs56.gaucho_gardens.database;

import edu.ucsb.cs56.gaucho_gardens.webapp.Vegetable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Database extends MongoRepository<Vegetable, String>{
    public Vegetable findByName(String name);
}