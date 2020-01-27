package recipeProject.command.converts;

import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import recipeProject.command.IngredientsCommand;
import recipeProject.model.Ingredient;

@Component
public class IngredientToIngredientCommand implements Converter<Ingredient, IngredientsCommand> {

    private final UnitOfMeasureToUnitOfMeasureCommand uomConverter;

    public IngredientToIngredientCommand(UnitOfMeasureToUnitOfMeasureCommand uomConverter) {
        this.uomConverter = uomConverter;
    }

    @Synchronized
    @Nullable
    @Override
    public IngredientsCommand convert(Ingredient ingredient) {
        if (ingredient == null) {
            return null;
        }

        IngredientsCommand ingredientCommand = new IngredientsCommand();
        ingredientCommand.setId(ingredient.getId());
        ingredientCommand.setAmount(ingredient.getAmount());
        ingredientCommand.setDescription(ingredient.getDescription());
        ingredientCommand.setUom(uomConverter.convert(ingredient.getUom()));
        return ingredientCommand;
    }
}
