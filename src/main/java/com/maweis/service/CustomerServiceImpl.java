package com.maweis.service;

import com.maweis.dto.CustomerDTO;
import com.maweis.persistent.Customer;
import com.maweis.persistent.CustomerRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peter on 12/19/13.
 */
@Service("CustomerService")
public class CustomerServiceImpl implements CustomerService {

    static Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

    @Override
    public CustomerDTO findCustomerById(long id) {
        logger.info("Param is " + id + " Long Value is " + id);
        Customer customer = customerRepository.findById(id);
        logger.info(customer.toString());
        return customer.dtoInstance();
    }

    public List<CustomerDTO> findCustomerByName(String name){
        logger.info("Param is " + name);
        List<CustomerDTO> customerDTOs = new ArrayList<CustomerDTO>();

        List<Customer> customers = customerRepository.findByRegex(name);
        for (Customer customer : customers) {
            logger.info("----------");
            logger.info(customer.toString());
            customerDTOs.add(customer.dtoInstance());
        }
        return customerDTOs;
    }
}
