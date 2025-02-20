package edu.eci.arsw.blueprints.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import edu.eci.arsw.blueprints.filters.BlueprintFilter;
import edu.eci.arsw.blueprints.persistence.BlueprintsPersistence;
import edu.eci.arsw.blueprints.persistence.impl.InMemoryBlueprintPersistence;

@Configuration
@ComponentScan(basePackages = "edu.eci.arsw.blueprints")
public class AppConfig {

    @Bean
    public BlueprintsPersistence blueprintsPersistence() {
        return new InMemoryBlueprintPersistence();
    }

    @Bean
    public BlueprintFilter blueprintFilter() {
        return new edu.eci.arsw.blueprints.persistence.impl.RedundancyFilter();
    }
}