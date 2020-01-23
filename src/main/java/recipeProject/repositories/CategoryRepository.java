package recipeProject.repositories;

import org.springframework.data.repository.CrudRepository;
import recipeProject.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
