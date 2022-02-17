package com.cokKatmanliYapi;

import com.cokKatmanliYapi.business.abstracts.ProductService;
import com.cokKatmanliYapi.business.concretes.ProductManager;
import com.cokKatmanliYapi.core.JLoggerManagerAdapter;
import com.cokKatmanliYapi.dataAccess.concretes.AbcProductDao;
import com.cokKatmanliYapi.entities.concretes.Product;

public class Main {

    public static void main(String[] args) {

        ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());

        Product product = new Product(1, 2, 5, "test", 54.2);

        productService.add(product);
    }
}
