package com.cokKatmanliYapi.business.abstracts;

import com.cokKatmanliYapi.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);

    List<Product> getAll();
}
