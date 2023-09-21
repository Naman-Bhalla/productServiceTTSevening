package dev.naman.productservicettsevening.services;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class FakeStoreCategoryServiceImpl implements CategoryService {

    @Override
    public String getAllCategories() {
        return null;
    }

    @Override
    public String getProductsInCategory(Long categoryId) {
        return null;
    }
}
