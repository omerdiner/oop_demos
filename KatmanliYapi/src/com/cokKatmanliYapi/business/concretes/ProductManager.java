package com.cokKatmanliYapi.business.concretes;

import com.cokKatmanliYapi.business.abstracts.ProductService;
import com.cokKatmanliYapi.core.LoggerService;
import com.cokKatmanliYapi.dataAccess.abstracts.ProductDao;
import com.cokKatmanliYapi.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {
    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao, LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {
        if (product.getCategoryId() == 1) {
            System.out.println("Bu türden ürün kabul edilmez.");
            return;
        }

        productDao.add(product);
        loggerService.logToSystem("ürün eklendi:" + product.getName());
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
