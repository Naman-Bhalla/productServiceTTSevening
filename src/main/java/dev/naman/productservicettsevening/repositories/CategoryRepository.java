package dev.naman.productservicettsevening.repositories;

import dev.naman.productservicettsevening.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category save(Category category);
}
