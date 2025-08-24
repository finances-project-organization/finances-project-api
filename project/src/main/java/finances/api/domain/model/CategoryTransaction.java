package finances.api.domain.model;

import lombok.Getter;

import java.util.UUID;

@Getter
public class CategoryTransaction {
    private final UUID id;
    private String category;

    public CategoryTransaction(UUID id, String category) {
        if(category == null || category.isBlank()) throw new IllegalArgumentException("Category cannot be null or blank");
        this.id = id == null ? UUID.randomUUID() : id;
        this.category = category;
    }

    public void changeCategory(String newCategory) {
        this.category = newCategory;
    }
}
