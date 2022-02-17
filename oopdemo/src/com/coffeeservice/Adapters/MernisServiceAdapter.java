package com.coffeeservice.Adapters;

import MernisWebService.DJJKPSPublicSoap;
import com.coffeeservice.Abstracts.ICustomerCheckService;
import com.coffeeservice.Concrete.CustomerCheckService;
import com.coffeeservice.Entities.Customer;


import java.util.Locale;

public class MernisServiceAdapter extends CustomerCheckService {
        DJJKPSPublicSoap client=new DJJKPSPublicSoap();
    @Override
    public boolean checkIfARealPerson(Customer customer) {

        Boolean check=false;
        try {
            check = client.TCKimlikNoDogrula(Long.parseLong(customer.getTC()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }
}
