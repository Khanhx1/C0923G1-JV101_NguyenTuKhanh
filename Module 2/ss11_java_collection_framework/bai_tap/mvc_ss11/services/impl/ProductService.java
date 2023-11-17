package mvc_ss11.services.impl;

import mvc_ss11.models.Product;
import mvc_ss11.repositories.IProductRepository;
import mvc_ss11.repositories.impl.ProductRepository;
import mvc_ss11.services.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    IProductRepository repository = new ProductRepository();

    @Override
    public void save(Product product) {
        repository.save(product);
    }

    @Override
    public List<Product> findAll() {
       return repository.findAll();
    }

    @Override
    public Product findByID(String inputId) {
        return repository.findById(inputId);
    }

    @Override
    public void remove(String id) {
        repository.remove(id);
    }
}
