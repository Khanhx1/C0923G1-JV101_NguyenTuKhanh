package mvc_ss11.repositories.impl;

import mvc_ss11.models.Product;
import mvc_ss11.repositories.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> products = new ArrayList<>();

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(String inputId) {
        for (Product product: products ) {
            if(product.getId().equals(inputId)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void remove(String id) {
        for (Product product: products){
            if(product.getId().equals(id)) {
                products.remove(product);
            }
        }
    }
}
