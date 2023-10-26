package dev.naman.productservicettsevening;

import dev.naman.productservicettsevening.models.Category;
import dev.naman.productservicettsevening.models.Product;
import dev.naman.productservicettsevening.repositories.CategoryRepository;
import dev.naman.productservicettsevening.repositories.ProductDBDTo;
import dev.naman.productservicettsevening.repositories.ProductRepository;
import dev.naman.productservicettsevening.services.SelfProductService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class ProductTest {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    private SelfProductService selfProductService;

    @Test
    void savingProductsAndCategory() {
//        Category category = new Category();
//        category.setName("phones");
//        Category savedCategory = categoryRepository.save(category);
//
//        Product product = new Product();
//        product.setPrice(100);
//        product.setImageUrl("hello");
//        product.setCategory(category);
//        productRepository.save(product);

        Category category = new Category();
        category.setName("electronics");
//        Category savedCategory = categoryRepository.save(category);

        Product product = new Product();
        product.setPrice(101);
        product.setImageUrl("hiii");
        product.setCategory(category);
        productRepository.save(product);
    }

    @Test
    @Transactional
    void fetchTypesTest() {
        Product product = productRepository.findProductById(1L);

        System.out.println("Fetched product");

        Category category = product.getCategory();
        String name = category.getName();
    }

    @Test
    void deleteProduct() {
        productRepository.deleteById(1L);
    }

    @Test
    @Transactional
//    @Rollback(value = false)
    @Commit()
    void saveProductsForCategory() {
        Category category = categoryRepository.findById(2L).get();


        Product product = new Product();
        product.setPrice(1012);
        product.setImageUrl("hiii");
        product.setCategory(category);
        Product savedProduct = productRepository.save(product);

        product = new Product();
        product.setPrice(103);
        product.setImageUrl("hiii");
        product.setCategory(category);
        productRepository.save(product);

        Category category1 = new Category();
        category.setName("hello");
        categoryRepository.save(category1);

    }

    @Test
    @Transactional
    void getProductsForCategory() throws InterruptedException {
//        Category category = categoryRepository.findById(2L).get();

        List<Category> categories = categoryRepository.findAllByIdIn(List.of(2L, 52L)); // select * from categories where cateory in 1, 2

        // select * from categories where id in (2, 52);
        Thread.sleep(100L);
        System.out.println("Doing something");
        Thread.sleep(100L);
        // select * from products where category_id = 2;
        // select * from products where category_id = 52;

        for (Category category: categories) {
            for (Product product : category.getProducts()) {
                System.out.println(product.getPrice());
            }
        }
    }

    @Test
    @Transactional
    void getProductsFor1Category() throws InterruptedException {
//        Category category = categoryRepository.findById(2L).get();

        Category category = categoryRepository.findById(2L).get(); // select * from categories where cateory in 1, 2

        // select * from categories where id in (2, 52);
        Thread.sleep(100L);
        System.out.println("Doing something");
        Thread.sleep(100L);
        // select * from products where category_id = 2;
        // select * from products where category_id = 52;

        for (Product product : category.getProducts()) {
            System.out.println(product.getPrice());
        }
    }

    @Test
    void checkWorkingFine() {

        List<Product> products = selfProductService.getAllProducts();
    }

    @Test
    public void demonstrateCustomQueries() {
//        List<ProductDBDTo> productDBDTos = productRepository.laaoProductsWithId(303L);
        List<Product> products = productRepository.getByIdAndTitle(1L, "hi");

    }
}
