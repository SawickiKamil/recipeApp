package recipeProject.service;

import org.springframework.stereotype.Component;
import recipeProject.command.IngredientsCommand;
import recipeProject.model.Ingredient;

@Component
public interface IngredientService {

    IngredientsCommand findByRecipeIdAndId(Long recipeId, Long ingredientId);

    IngredientsCommand saveIngredientCommand(IngredientsCommand command);
}
