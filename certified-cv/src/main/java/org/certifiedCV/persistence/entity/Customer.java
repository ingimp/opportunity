/**
 * 
 */
package org.certifiedCV.persistence.entity;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

/**
 * @author luca
 * 
 */
@MappedSuperclass
public abstract class Customer implements Serializable {

	private static final long serialVersionUID = 7532693621934209772L;

	protected int ID;
	protected String userName;
	protected String password;

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @param iD
	 *            the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
