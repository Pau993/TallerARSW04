package edu.eci.arsw.blueprints.persistence.impl;

import java.util.Set;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.persistence.BlueprintNotFoundException;
import edu.eci.arsw.blueprints.persistence.BlueprintPersistenceException;
import edu.eci.arsw.blueprints.persistence.BlueprintsPersistence;

public class AnotherBlueprintsPersistence implements BlueprintsPersistence{

    @Override
    public void saveBlueprint(Blueprint bp) throws BlueprintPersistenceException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Blueprint getBlueprint(String author, String bprintname) throws BlueprintNotFoundException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set<Blueprint> getAllBlueprints() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set<Blueprint> getBlueprintsByAuthor(String author) throws BlueprintNotFoundException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    

}
