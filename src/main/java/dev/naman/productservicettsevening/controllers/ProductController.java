package dev.naman.productservicettsevening.controllers;

import dev.naman.productservicettsevening.dtos.ProductDto;
import dev.naman.productservicettsevening.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    public ProductController( ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public String getAllProducts() {
        return "Getting All Products";
    }

    @GetMapping("/{productId}")
    public String getSingleProduct(@PathVariable("productId") Long productId) {
        return "Returning Single Product with id: " + productId;
    }


    @PostMapping()
    public String addNewProduct(@RequestBody ProductDto productDto) {
        return "Adding new product " + productDto;
    }

    @PutMapping("/{productId}")
    public String updateProduct(@PathVariable("productId") Long productId) {
        return "Updating product";
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId) {
        return "Deleting a product with id: " + productId;
    }
}
