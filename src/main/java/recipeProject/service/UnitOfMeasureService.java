package recipeProject.service;

import org.springframework.stereotype.Component;
import recipeProject.command.UnitOfMeasureCommand;

import java.util.Set;

@Component
public interface UnitOfMeasureService {

        Set<UnitOfMeasureCommand> listAllUoms();

}
