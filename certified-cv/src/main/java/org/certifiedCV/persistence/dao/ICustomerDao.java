package org.certifiedCV.persistence.dao;

import java.util.List;

import org.certifiedCV.persistence.model.Customer;
import org.certifiedCV.persistence.model.User;

public interface ICustomerDao {
    
    public List<Customer> getAllCustomers();


}
