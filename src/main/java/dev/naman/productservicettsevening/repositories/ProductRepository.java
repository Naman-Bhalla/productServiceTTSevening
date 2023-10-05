package dev.naman.productservicettsevening.repositories;

import dev.naman.productservicettsevening.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product save(Product product);
}
