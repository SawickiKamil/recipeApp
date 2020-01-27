package recipeProject.command;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import recipeProject.model.Category;
import recipeProject.model.Difficulty;
import recipeProject.model.Ingredient;
import recipeProject.model.Notes;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class RecipeCommand {
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private String servings;
    private String source;
    private String url;
    private String directions;
    private Set<IngredientsCommand> ingredients = new HashSet<>();
    private Difficulty difficulty;
    private NotesCommand notes;
    private Set<CategoryCommand> categories = new HashSet<>();
}
