package com.maweis.service;

import com.googlecode.jsonrpc4j.JsonRpcService;
import com.maweis.dto.CustomerDTO;
import com.maweis.persistent.Customer;

import java.io.Serializable;
import java.util.List;

/**
 * Created by peter on 12/19/13.
 */
@JsonRpcService("/CustomerService")
public interface CustomerService extends Serializable{

    public String sayHello(String name);

    public CustomerDTO findCustomerById(long id);

    public List<CustomerDTO> findCustomerByName(String name);
}
