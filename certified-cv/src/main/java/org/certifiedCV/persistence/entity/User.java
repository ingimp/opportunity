/**
 * 
 */
package org.certifiedCV.persistence.entity;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * @author luca
 * 
 */
@Entity
public class User extends Customer implements Serializable {

	private static final long serialVersionUID = -5296425601147493494L;
	protected String firstName;
	protected String lastName;
	protected String email;

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}
