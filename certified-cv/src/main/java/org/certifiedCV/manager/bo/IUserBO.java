/**
 * 
 */
package org.certifiedCV.manager.bo;

import java.util.ArrayList;

import org.certifiedCV.persistence.model.User;

/**
 * @author luca
 * 
 */
public interface IUserBO {

	public User getUser(String susername);

	public void addUser(User user);

	public ArrayList<User> getAllUsers();

}
