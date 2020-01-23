package recipeProject.repositories;

import org.springframework.data.repository.CrudRepository;
import recipeProject.model.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
