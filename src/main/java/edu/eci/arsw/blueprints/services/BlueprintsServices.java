package edu.eci.arsw.blueprints.services;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.arsw.blueprints.filters.BlueprintFilter;
import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.persistence.BlueprintNotFoundException;
import edu.eci.arsw.blueprints.persistence.BlueprintPersistenceException;
import edu.eci.arsw.blueprints.persistence.BlueprintsPersistence;

/**
 * Service class for managing blueprints.
 * Provides methods to add, retrieve, and list blueprints.
 * Utilizes dependency injection to interact with the persistence layer.
 * Applies a filter to blueprints before returning them.
 * 
 * @author hcadavid
 */
@Service
public class BlueprintsServices {
   
    @Autowired
    private BlueprintsPersistence bpp;

    @Autowired
    private BlueprintFilter filter;
    
    /**
     * Adds a new blueprint to the persistence layer.
     * 
     * @param bp the blueprint to add
     * @throws BlueprintPersistenceException if a blueprint with the same name already exists
     */
    public void addNewBlueprint(Blueprint bp) throws BlueprintPersistenceException {
        bpp.saveBlueprint(bp);
    }
    
    /**
     * Retrieves all blueprints from the persistence layer, applying a filter.
     * 
     * @return a set of all filtered blueprints
     */
    public Set<Blueprint> getAllBlueprints() {
        return bpp.getAllBlueprints().stream()
                .map(filter::filter)
                .collect(Collectors.toSet());
    }
    
    /**
     * Retrieves a specific blueprint by author and name, applying a filter.
     * 
     * @param author blueprint's author
     * @param name blueprint's name
     * @return the filtered blueprint of the given name created by the given author
     * @throws BlueprintNotFoundException if there is no such blueprint
     */
    public Blueprint getBlueprint(String author, String name) throws BlueprintNotFoundException {
        return filter.filter(bpp.getBlueprint(author, name));
    }
    
    /**
     * Retrieves all blueprints by a specific author, applying a filter.
     * 
     * @param author blueprint's author
     * @return all the filtered blueprints of the given author
     * @throws BlueprintNotFoundException if the given author doesn't exist
     */
    public Set<Blueprint> getBlueprintsByAuthor(String author) throws BlueprintNotFoundException {
        return bpp.getBlueprintsByAuthor(author).stream()
                .map(filter::filter)
                .collect(Collectors.toSet());
    }
}