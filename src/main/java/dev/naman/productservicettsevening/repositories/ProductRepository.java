package dev.naman.productservicettsevening.repositories;

import dev.naman.productservicettsevening.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product save(Product product);
    Product findProductById(Long id);

    Product findProductByIdIs(Long id);

    Product findProductByIdEquals(Long id);

    Product findByPriceBetweenAndTitleLessThanEqual(double greaterThanEqualPrice, double lessThanEqualPrice, String titleLessThan);
    // select * from products wherr


    Product findByPriceLessThanEqual(double price);
    // select * from products where prices <= 100

    // productRepository.findByPriceLessThanEqual(100);

    List<Product> findByImageUrlIsNullOrderByIdDesc();

    List<Product> findByTitleIgnoreCaseStartingWith(String title);
    // findByTitleLike("%" + title)
    // findByTitleStartingWith("naman")
    // findByTitleLike("%naman")

    //Naman => naman => NaMAn => namanN
    List<Product> findByTitleLikeIgnoreCase(String titleLike);
    //


    // productRepository.findByImageUrlIsNull()
    // select * from products where image_url is null;

    List<Product> findAllByPublicIs(boolean value);
    List<Product> findAllByPublicIsTrue();

    // productRepository.findAllByPublicIs(true);
    // productRepository.findAllByPublicIsTrue()

}
