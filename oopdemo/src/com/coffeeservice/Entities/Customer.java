package com.coffeeservice.Entities;

import com.coffeeservice.Abstracts.ICustomer;

import java.time.LocalDate;
import java.util.Date;

public class Customer implements ICustomer {
   private int id;
   private String firstName;
   private String lastName;
   private int birthYear;
   private String TC;

    public Customer(int id, String firstName, String lastName, int dateOfBirth, String TC) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = dateOfBirth;
        this.TC = TC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDateOfBirth() {
        return birthYear;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.birthYear = dateOfBirth;
    }

    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }
}
