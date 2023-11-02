package dev.naman.productservicettsevening.controllers;

import dev.naman.productservicettsevening.models.Product;
import dev.naman.productservicettsevening.repositories.ProductRepository;
import dev.naman.productservicettsevening.services.ProductService;
import dev.naman.productservicettsevening.services.SelfProductService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static  org.mockito.Mockito.*;

@SpringBootTest
class ProductControllerTest {
    @Autowired
    private ProductController productController;

//    @MockBean
    @MockBean
    private SelfProductService productService;

    @Test
    void testAbsShouldReturnCorrectValue() {
//        int i = Math.abs(-2);
//
//        assert(i == 2);

            assertFalse(true);
            // asserFalse(condition)
        //  assert condition == false
    }

    @Test
    public void testArrayIsSortedCorrectly() {
        int[] l = {1, 2, 3, 6, 5};

        Arrays.sort(l);
        assertArrayEquals(new int[]{1, 2, 3, 5, 6}, l);
//        assert l[4] == 6;
//        assert l[3] == 5;

        int[] l1 = {1, 2, 3, 5, 6};

//        assertArrayEquals(x, l);
    }
// don't repeat the business logic in the test case
    // use values that you know and compare against those
    // DOn't compute the expected value


    @Test
    void getAllProductsShouldReturnEmpltyListWhenNoProduct() {
//        ProductService productService = new SelfProductService();
//        ProductRepository productRepository = new Po
//        ProductController productController = new ProductController(productService)
        List<Product> p = new ArrayList<>();
        Product p1 = new Product();
        p1.setPrice(109.95);
        p.add(p1);

        when(productService.getAllProducts()).thenReturn(p);

        List<Product> products = productController.getAllProducts();

//        assert products.get(0).getPrice() == 109.95;

        assertEquals(109.95, products.get(0).getPrice());
        assertTrue(products.get(0).getPrice() == 109.95);
        assert products.get(0).getPrice() == 109.95;

    }
    // Why can it fail:
    // 1. Bug in product service
    // 2. Bug be in the controller

}

// 1. Test is nothing but a method
// 2. By default a test always succeeds
// 3. Unless you put a condition that becopmes untrue
//    you check for something that is not as per your expectations
// 4. A test case fails if a condition given in Assert is untrue
// Name of a test case method can be:
//    test{What}should{doWhat}

//     testGives0ForAllEqualHeights() {}