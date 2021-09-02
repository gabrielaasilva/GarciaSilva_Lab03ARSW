
import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.persistence.BlueprintNotFoundException;
import edu.eci.arsw.blueprints.services.BlueprintsServices;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgarc
 */
@SpringBootApplication
public class Main {
    @Autowired
    static BlueprintsServices blueprintsServices; 
     
    public static void main(String[] args) throws BlueprintNotFoundException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("blueprintsContext.xml");
        blueprintsServices = applicationContext.getBean(BlueprintsServices.class);
        Set<Blueprint> allBlueprints = blueprintsServices.getAllBlueprints();
        blueprintsServices.getBlueprint("sebana2021", "blueprin1");
        System.out.println("BREAK");
    }
}
    

