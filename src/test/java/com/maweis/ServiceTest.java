package com.maweis;

import com.maweis.service.CustomerService;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by peter on 12/19/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations =  "classpath:applicationContext.xml")
public class ServiceTest {

    @Autowired
    CustomerService customerService;


    @Test
    public void testCustomerService(){
        Assert.assertEquals("Hello Peter", customerService.sayHello("Peter"));
    }


}
