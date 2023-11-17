package mvc_ss11.controllers;

import mvc_ss11.models.Product;
import mvc_ss11.services.IProductService;
import mvc_ss11.services.impl.ProductService;

import java.util.List;

public class ProductController {
    private IProductService productService = new ProductService();

    public List<Product> getAll() {
        return productService.findAll();
    }

    public void addProduct(Product product) {
        productService.save(product);
    }

    public Product findById(String inputId) {
        return productService.findByID(inputId);
    }

    public void removeProduct(String id) {
        productService.remove(id);
    }
}
