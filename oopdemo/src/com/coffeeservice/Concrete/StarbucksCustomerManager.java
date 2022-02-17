package com.coffeeservice.Concrete;

import com.coffeeservice.Abstracts.ICustomerCheckService;
import com.coffeeservice.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerService{
    CustomerCheckService checkService;

    public StarbucksCustomerManager(CustomerCheckService checkService) {
        this.checkService = checkService;
    }

    @Override
    public void saveToDb(Customer customer) {
        if(checkService.checkIfARealPerson(customer)){
            super.saveToDb(customer);
        }else{
            try {
                throw new Exception("Not a valid person");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
