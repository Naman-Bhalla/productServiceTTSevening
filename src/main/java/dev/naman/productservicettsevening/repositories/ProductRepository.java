package dev.naman.productservicettsevening.repositories;

import dev.naman.productservicettsevening.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

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

//    List<Product> findAllByPublicIs(boolean value);
//    List<Product> findAllByPublicIsTrue();

    // productRepository.findAllByPublicIs(true);
    // productRepository.findAllByPublicIsTrue()

//    List<Product> findProductByCategory_Dummy_Id_AndCategory_Id(String categoryName, Long categoryId);
    // select * from products where category.dummy.id = {} and category.name = {}

    @Query(value = Queries.LAAO_PRODUCTS_WITH_ID_QUERY, nativeQuery = true)
//    @Modifying
    List<ProductDBDTo> laaoProductsWithId(Long id);
    // title
    // c
    // title
    // iPhone 15 Pro Max
    // Google Pixel 8

    // for each attribute in ProductDBDto:
    //       if row has that attr:
    //           productdbdto.setAttr(rowValue)
    //       else:
    //           productdbdto.setAttr(null)

//    @Query("select * from users join product join category on product.c_id = category.id")


    // List<Product> products;
    // for (Prodct p: products) {
    //    if (p.id = {} and p.title = {}) {
    //        and.add(p.title, p.id)
    //    }
    // }
    @Query("select p.title from Product p where p.id = :id and p.category.name = :categoryName")
    public List<Product> getByIdAndTitle(Long id, String categoryName);

    // callUserQuery(String columnName, String tableName) {
    //      DB.executeQuery("select " + columnName + " from " + tableName);
    // }
}
