package com.codegym.JPASP.repository;

import com.codegym.JPASP.model.Customer;

public interface ICustomerRepository {
    boolean insertWithStoredProcedure(Customer customer);
}
