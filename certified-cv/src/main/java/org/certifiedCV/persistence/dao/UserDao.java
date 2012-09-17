/**
 * 
 */
package org.certifiedCV.persistence.dao;

import java.util.ArrayList;

import org.certifiedCV.persistence.entity.User;

/**
 * @author luca
 * 
 */
public interface UserDao {

	public User getUser(String susername);

	public void addUser(User user);

	public ArrayList<User> getAllUsers();

}
