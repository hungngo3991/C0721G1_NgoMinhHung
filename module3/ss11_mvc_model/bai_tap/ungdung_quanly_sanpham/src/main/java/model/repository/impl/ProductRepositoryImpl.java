package model.repository.impl;

import model.bean.Product;
import model.repository.IProductRepository;

import java.util.*;

public class ProductRepositoryImpl implements IProductRepository {

    private static final Map<Integer, Product> product;

    static {
        product = new HashMap<>();
        product.put(1, new Product(1, "Samsung Galaxy S20 FE 5G", 20000000, "New generation", "Samsung"));
        product.put(2, new Product(2, "Samsung Galaxy S21 Ultra", 18000000, "New generation", "Samsung"));
        product.put(3, new Product(3, "Samsung Galaxy S20 FE", 15000000, "Old generation", "Samsung"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(product.values());
    }

    @Override
    public void save(Product product) {
        ProductRepositoryImpl.product.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return product.get(id);
    }

    @Override
    public void update(int id, Product product) {
        ProductRepositoryImpl.product.put(id, product);
    }

    @Override
    public void remove(int id) {
        product.remove(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        Set<Product> productSet = new HashSet(product.values());
        List<Product> productList = new ArrayList<>();
        for (Product product : productSet) {
            if (product.getName().contains(name)) {
                productList.add(ProductRepositoryImpl.product.get(product.getId()));
            }
        }
        return productList;
    }


}
