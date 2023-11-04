package dev.naman.productservicettsevening;

import dev.naman.productservicettsevening.controllers.ProductController;
import dev.naman.productservicettsevening.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

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

    @Qualifier
    private ProductService productService;

    @Test
    void testGetAllProducts() throws Exception {
        mockMvc.perform(get("/products"))
                .andExpect(status().is(200))
                .andExpect(header().exists("authorization"))
                .andExpect(content().string("{}"));
    }

}
