package mvc_ss11.services;

import mvc_ss11.models.Product;

import java.util.List;

public interface IProductService {
    void save(Product product);

    List<Product> findAll();

    Product findByID(String inputId);

    void remove(String id);
}
