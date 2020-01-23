package recipeProject.service;

import org.springframework.stereotype.Component;
import recipeProject.model.Recipe;

import java.util.Set;

@Component
public interface RecipeService {

    Set<Recipe> getRecipes();
}
