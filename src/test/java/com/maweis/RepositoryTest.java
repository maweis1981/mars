package com.maweis;

import com.maweis.app.AppConfig;
import com.maweis.persistent.Customer;
import com.maweis.persistent.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import static org.junit.Assert.*;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@EnableTransactionManagement
public class RepositoryTest {

    @Autowired
    CustomerRepository repository;


    @Test
    public void sampleTest(){
        Customer maven= new Customer("Peter","Ma");
        maven = repository.save(maven);

        Customer john = new Customer("John", "Daver");
        john = repository.save(john);

        List<Customer> results = repository.findByRegex("e");


        for (Customer customer : results) {
            System.out.println("------------------------------");
            System.out.println(customer);
            System.out.println("------------------------------");
        }

        assertEquals(2, results.size());

    }




}