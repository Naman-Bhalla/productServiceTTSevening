package dev.naman.productservicettsevening.controllers;

import dev.naman.productservicettsevening.controllers.ProductController;
import dev.naman.productservicettsevening.models.Product;
import dev.naman.productservicettsevening.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@WebMvcTest(ProductController.class)
public class FunctionalTests {
    @Autowired
    private MockMvc mockMvc;

//    @Autowired
//    @Qualifier("fakeStoreProductService")
//    private ProductService productService;

//    public FunctionalTests(MockMvc mockMvc, ProductService productService) {
//        this.mockMvc = mockMvc;
//        this.productService = productService;
//    }

    @MockBean
    private ProductService productService;

//    @Test
//    void testGetAllProducts() throws Exception {
//        // Create a list of sample products or use a test database
//        List<Product> sampleProducts = Arrays.asList(
//                new Product(),
//                new Product()
//        );
//
//        // Mock the service that the controller uses to retrieve products
//        when(productService.getAllProducts()).thenReturn(sampleProducts);
//
//        mockMvc.perform(get("/products"))
//                .andExpect(status().is(200))
//                .andExpect(header().exists("authorization"))
//                .andExpect(content().string("{}"));
//    }

}
