package com.coffeeservice.Concrete;

import com.coffeeservice.Abstracts.ICustomerCheckService;
import com.coffeeservice.Entities.Customer;

public class CustomerCheckService implements ICustomerCheckService {
    //for test and other purposes not a real check
    @Override
    public boolean checkIfARealPerson(Customer customer) {
        return true;
    }
}
