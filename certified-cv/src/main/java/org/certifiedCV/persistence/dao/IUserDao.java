/**
 * 
 */
package org.certifiedCV.persistence.dao;

import java.util.ArrayList;

import org.certifiedCV.persistence.model.User;

/**
 * @author luca
 * 
 */
public interface IUserDao {

	public User getUser(String susername);

	public void addUser(User user);

	public ArrayList<User> getAllUsers();

}
