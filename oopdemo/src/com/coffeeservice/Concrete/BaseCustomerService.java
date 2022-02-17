package com.coffeeservice.Concrete;

import com.coffeeservice.Abstracts.ICustomerService;
import com.coffeeservice.Entities.Customer;

public abstract class BaseCustomerService implements ICustomerService {
    @Override
    public void saveToDb(Customer customer) {
        System.out.println("Customer "+customer.getFirstName()+" saved to the databese");
    }
}
