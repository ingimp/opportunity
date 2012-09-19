/**
 * 
 */
package org.certifiedCV.persistence.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
	protected String email;
	protected List<Address> addresses;
	protected Date dateCreated;
	protected Date dateUpdated;

}
