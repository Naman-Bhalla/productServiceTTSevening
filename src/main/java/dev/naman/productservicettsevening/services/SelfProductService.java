package dev.naman.productservicettsevening.services;

import dev.naman.productservicettsevening.dtos.ProductDto;
import dev.naman.productservicettsevening.exceptions.NotFoundException;
import dev.naman.productservicettsevening.models.Product;
import dev.naman.productservicettsevening.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

public class SelfProductService implements ProductService {
    private ProductRepository productRepository;

    public SelfProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getSingleProduct(Long productId) throws NotFoundException {
        return Optional.empty();
    }

    @Override
    public Product addNewProduct(ProductDto product) {
        return null;
    }

    @Override
    public Product updateProduct(Long productId, Product product) {
        return null;
    }

    @Override
    public Product replaceProduct(Long productId, Product product) {
        return null;
    }

    @Override
    public boolean deleteProduct(Long productId) {
        return false;
    }
}
