package org.certifiedCV.persistence.dao;

import java.io.Serializable;
import java.util.List;

import org.certifiedCV.exception.DataAccessLayerException;
import org.certifiedCV.persistence.model.User;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

public class UserDao extends CertifiedCVDao implements IUserDao {

    @Override
    public User getUser(String userName) throws DataAccessLayerException {
	try {
	    startOperation();
	    Criteria crit = session.createCriteria(User.class);
	    crit.add(Restrictions.eq("userName", userName));
	    User user = (User) crit.uniqueResult();
	    return user;
	    
	} catch (HibernateException e) {
	    handleException(e);
	    
	} finally {
	    stopOperation();
	    
	}
	return null;
    }

    @Override
    public Serializable addUser(User user) {
	startOperation();
	Serializable id = session.save(user);
	stopOperation();
	return id;

    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> getAllUsers() throws DataAccessLayerException {
	try {
	    startOperation();
	    Criteria crit = session.createCriteria(User.class);
	    return crit.list();
	    
	} catch (HibernateException e) {
	    handleException(e);
	    
	} finally {
	    stopOperation();
	    
	}
	return null;
    }

    @Override
    public void delete(User user) {
	startOperation();
	session.delete(user);
	stopOperation();
	
    }

}
