package com.coffeeservice.Abstracts;

import com.coffeeservice.Entities.Customer;

public interface ICustomerService {
    void saveToDb(Customer customer);
}
