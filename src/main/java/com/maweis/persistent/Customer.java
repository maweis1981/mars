package com.maweis.persistent;

import com.maweis.dto.CustomerDTO;

import javax.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;


    public long getId() {
        return id;
    }

    protected Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }


    public CustomerDTO dtoInstance(){
//        CustomerDTO tempO = new CustomerDTO();

        return new CustomerDTO(id,firstName,lastName);
    }

}