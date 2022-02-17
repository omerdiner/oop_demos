package com.coffeeservice.Abstracts;

import com.coffeeservice.Entities.Customer;

public interface ICustomerCheckService {
    boolean checkIfARealPerson(Customer customer);
}
