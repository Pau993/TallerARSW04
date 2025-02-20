package edu.eci.arsw.blueprints.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;
import edu.eci.arsw.blueprints.persistence.BlueprintNotFoundException;
import edu.eci.arsw.blueprints.persistence.BlueprintPersistenceException;
import edu.eci.arsw.blueprints.services.BlueprintsServices;

public class MainApp {
    public static void main(String[] args) {
        // Inicializar el contexto de Spring
        @SuppressWarnings("resource")
        ApplicationContext context = new AnnotationConfigApplicationContext(edu.eci.arsw.blueprints.config.AppConfig.class);
        
        // Obtener el bean de BlueprintsServices
        BlueprintsServices blueprintServices = context.getBean(BlueprintsServices.class);
        
        try {
            // Crear y registrar un nuevo plano
            Point[] points = new Point[]{new Point(10, 10), new Point(20, 20)};
            Blueprint blueprint = new Blueprint("author1", "blueprint1", points);
            blueprintServices.addNewBlueprint(blueprint);
            System.out.println("Blueprint registered: " + blueprint);

            // Consultar un plano específico
            Blueprint retrievedBlueprint = blueprintServices.getBlueprint("author1", "blueprint1");
            System.out.println("Retrieved Blueprint: " + retrievedBlueprint);

            // Registrar otro plano
            Point[] points2 = new Point[]{new Point(30, 30), new Point(40, 40)};
            Blueprint blueprint2 = new Blueprint("author1", "blueprint2", points2);
            blueprintServices.addNewBlueprint(blueprint2);
            System.out.println("Blueprint registered: " + blueprint2);

            // Consultar todos los planos de un autor
            System.out.println("Blueprints by author1:");
            blueprintServices.getBlueprintsByAuthor("author1").forEach(System.out::println);

        } catch (BlueprintPersistenceException e) {
            System.err.println("Error registering blueprint: " + e.getMessage());
        } catch (BlueprintNotFoundException e) {
            System.err.println("Blueprint not found: " + e.getMessage());
        }
    }
}