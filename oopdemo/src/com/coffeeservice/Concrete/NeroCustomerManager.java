package com.coffeeservice.Concrete;

import com.coffeeservice.Entities.Customer;

public  class NeroCustomerManager extends BaseCustomerService{
    CustomerCheckService checkService;

    public NeroCustomerManager(CustomerCheckService checkService) {
        this.checkService = checkService;
    }


    @Override
    public void saveToDb(Customer customer) {
        if(checkService.checkIfARealPerson(customer)){
            super.saveToDb(customer);
        }else{
            try {
                throw new Exception("not a valid person");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
