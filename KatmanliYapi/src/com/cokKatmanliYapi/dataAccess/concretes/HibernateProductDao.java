package com.cokKatmanliYapi.dataAccess.concretes;

import com.cokKatmanliYapi.dataAccess.abstracts.ProductDao;
import com.cokKatmanliYapi.entities.concretes.Product;

import java.util.List;

public class HibernateProductDao implements ProductDao {
    @Override
    public void add(Product product) {
        System.out.println("Hibernate ile eklendi:" + product.getName());
    }

    @Override
    public void delete(Product product) {
        System.out.println("Ürün silindi:" + product.getName());
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
