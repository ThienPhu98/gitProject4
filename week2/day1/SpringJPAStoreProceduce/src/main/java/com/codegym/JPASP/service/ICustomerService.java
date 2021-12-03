package com.codegym.JPASP.service;

import com.codegym.JPASP.model.Customer;

public interface ICustomerService {
    boolean insertWithStoredProcedure(Customer customer);
}
