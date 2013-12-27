package com.maweis;

import com.maweis.persistent.Customer;
import com.maweis.persistent.CustomerRepository;
import com.maweis.service.CustomerService;
import junit.framework.Assert;
import org.apache.log4j.spi.LoggerFactory;
import org.junit.Test;
import org.slf4j.Logger;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBeanByName;

/**
 * Created by peter on 12/19/13.
 */
@SpringApplicationContext("classpath:applicationContext.xml")
@EnableTransactionManagement
public class BaseTest extends UnitilsJUnit4 {

    Logger logger = org.slf4j.LoggerFactory.getLogger(BaseTest.class);

    @SpringBeanByName
    private CustomerService customerService;

    @SpringBeanByName
    private CustomerRepository customerRepository;

    @Test
    public void test(){
        logger.info("Running Test.");

        Customer maven= new Customer("Peter","Ma");
        maven = customerRepository.save(maven);

        Customer john = new Customer("John", "Daver");
        john = customerRepository.save(john);

        Assert.assertEquals("Hello Peter", customerService.sayHello("Peter"));

        Assert.assertEquals("Peter", customerService.findCustomerById(2L));
    }
}