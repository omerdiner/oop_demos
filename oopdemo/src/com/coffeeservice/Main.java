package com.coffeeservice;

import com.coffeeservice.Adapters.MernisServiceAdapter;
import com.coffeeservice.Concrete.BaseCustomerService;
import com.coffeeservice.Concrete.CustomerCheckService;
import com.coffeeservice.Concrete.NeroCustomerManager;
import com.coffeeservice.Concrete.StarbucksCustomerManager;
import com.coffeeservice.Entities.Customer;

public class Main {

    public static void main(String[] args) {

	    Customer customer=new Customer(1,"atiba","hutchinson",1983,"51656759820");

        //works with mernis system
        BaseCustomerService starbucksManager=new StarbucksCustomerManager(new MernisServiceAdapter());
        starbucksManager.saveToDb(customer);


        //works independent from mernis system
        BaseCustomerService neroManager=new NeroCustomerManager(new CustomerCheckService());
        neroManager.saveToDb(customer);





    }
}
