package recipeProject.service;

import org.springframework.stereotype.Component;
import recipeProject.command.RecipeCommand;
import recipeProject.model.Recipe;

import java.util.Set;

@Component
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(Long id);
}
