package org.certifiedCV.manager.bo;

import java.io.Serializable;
import java.util.List;

import org.certifiedCV.exception.DataAccessLayerException;
import org.certifiedCV.persistence.dao.IUserDao;
import org.certifiedCV.persistence.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserBo implements IUserBO {
    
    @Autowired
    IUserDao userDao;

    @Override
    public User getUser(String userName) throws DataAccessLayerException {	
	return userDao.getUser(userName);
    }

    @Override
    public Serializable addUser(User user) {	
	return userDao.addUser(user);
    }

    @Override
    public List<User> getAllUsers() throws DataAccessLayerException {
	return userDao.getAllUsers();
    }

    @Override
    public void delete(User user) {
	userDao.delete(user);
	
    }

}
