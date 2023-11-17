package mvc_ss11.repositories;

import mvc_ss11.models.Product;

import java.util.List;

public interface IProductRepository {
    void save(Product product);

    List<Product> findAll();

    Product findById(String inputId);

    void remove(String id);
}
