/**
 * 
 */
package org.certifiedCV.manager.bo;

import java.io.Serializable;
import java.util.List;

import org.certifiedCV.exception.DataAccessLayerException;
import org.certifiedCV.persistence.model.User;

/**
 * @author luca
 * 
 */
public interface IUserBO {

	public User getUser(String userName) throws DataAccessLayerException;

	public Serializable addUser(User user);

	public List<User> getAllUsers() throws DataAccessLayerException;
	
	public void delete(User user);

}
