package model.service.impl;

import model.bean.Product;
import model.repository.impl.ProductRepositoryImpl;
import model.service.IProductService;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    ProductRepositoryImpl productR = new ProductRepositoryImpl();

    @Override
    public List<Product> findAll() {
        return productR.findAll();
    }

    @Override
    public void save(Product product) {
        productR.save(product);
    }

    @Override
    public Product findById(int id) {
        return productR.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        productR.update(id, product);
    }

    @Override
    public void remove(int id) {
        productR.remove(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        return productR.searchByName(name);
    }


}
