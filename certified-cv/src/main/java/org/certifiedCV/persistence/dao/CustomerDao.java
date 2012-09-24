package org.certifiedCV.persistence.dao;

import java.util.List;

import org.certifiedCV.persistence.model.Customer;
import org.hibernate.Criteria;

public class CustomerDao extends CertifiedCVDao implements ICustomerDao {

    @SuppressWarnings("unchecked")
    @Override
    public List<Customer> getAllCustomers() {
	startOperation();
	Criteria crit = session.createCriteria(Customer.class);
	List<Customer> list = crit.list();
	stopOperation();
	return list;
    }

    

}
