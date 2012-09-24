package org.certifiedCV.manager.bo;

import java.util.List;

import org.certifiedCV.persistence.dao.ICustomerDao;
import org.certifiedCV.persistence.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerBo implements ICustomerBo {
    
    @Autowired
    ICustomerDao customerDao;

    @Override
    public List<Customer> getAllCustomers() {
	return customerDao.getAllCustomers();
    }

    public void setDao(ICustomerDao dao) {
	this.customerDao = dao;
    }

}
