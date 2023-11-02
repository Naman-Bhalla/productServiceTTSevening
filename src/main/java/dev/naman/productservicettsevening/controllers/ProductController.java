package dev.naman.productservicettsevening.controllers;

import dev.naman.productservicettsevening.dtos.ErrorResponseDto;
import dev.naman.productservicettsevening.dtos.ProductDto;
import dev.naman.productservicettsevening.exceptions.NotFoundException;
import dev.naman.productservicettsevening.models.Category;
import dev.naman.productservicettsevening.models.Product;
import dev.naman.productservicettsevening.repositories.ProductRepository;
import dev.naman.productservicettsevening.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;
    private ProductRepository productRepository;

    public ProductController(@Qualifier("fakeStoreProductService") ProductService productService, ProductRepository productRepository) {
        this.productRepository = productRepository;
        this.productService = productService;
    }

    @GetMapping()
    public List<Product> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        products.get(0).setPrice(100); /// Bug induced in my code
        return products;
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Product> getSingleProduct(@PathVariable("productId") Long productId) throws NotFoundException {
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();

        headers.add(
                "auth-token", "noaccess4uheyhey"
        );

//        try {
        Optional<Product> productOptional = productService.getSingleProduct(productId);
//        } catch (Exception e) {
//            throw e;
//        }
//
//        if (product == null) {
//
//        }

//        Product product = productOptional.get();

        if (productOptional.isEmpty()) {
            throw new NotFoundException("No Product with product id: " + productId);
        }

        ResponseEntity<Product> response = new ResponseEntity(
                productService.getSingleProduct(productId),
                headers,
                HttpStatus.NOT_FOUND
        );

        return response;
//        GetSingleProductResponseDto responseDto = new GetSingleProductResponseDto();
//        responseDto.setProduct(
//              return  ;
//        );

//        return responseDto;
    }


    @PostMapping()
    public ResponseEntity<Product> addNewProduct(@RequestBody ProductDto product) {

//        Product newProduct = productService.addNewProduct(
//                product
//        );

        Product newProduct = new Product();
        newProduct.setDescription(product.getDescription());
        newProduct.setImageUrl(product.getImage());
        newProduct.setTitle(product.getTitle());
        newProduct.setPrice(product.getPrice());

        newProduct = productRepository.save(newProduct);

        ResponseEntity<Product> response = new ResponseEntity<>(newProduct, HttpStatus.OK);

        return response;
    }

    @PatchMapping("/{productId}")
    public Product updateProduct(@PathVariable("productId") Long productId,
                                 @RequestBody ProductDto productDto) {
        Product product = new Product();
        product.setId(productDto.getId());
        product.setCategory(new Category());
        product.getCategory().setName(productDto.getCategory());
        product.setTitle(productDto.getTitle());
        product.setPrice(productDto.getPrice());
        product.setDescription(productDto.getDescription());

        return productService.updateProduct(productId, product);
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId) {
        return "Deleting a product with id: " + productId;
    }

//    @ExceptionHandler(NotFoundException.class)
//    public ResponseEntity<ErrorResponseDto> naman(Exception exception) {
//        ErrorResponseDto errorResponseDto = new ErrorResponseDto();
//        errorResponseDto.setErrorMessage(exception.getMessage());
//
//        return new ResponseEntity<>(errorResponseDto, HttpStatus.NOT_FOUND);
//    }
}
