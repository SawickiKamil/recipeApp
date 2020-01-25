package recipeProject.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    Category category;

    @BeforeEach
    void setUp() {
        category = new Category();
    }

    @Test
    void getId() {
        category.setId(23L);
        assertEquals(23L, category.getId());
    }

    @Test
    void getDescription() {
        category.setDescription("Test description");
        assertEquals("Test description", category.getDescription());
    }

    @Test
    void getRecipes() {
    }
}