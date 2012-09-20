/**
 * 
 */
package org.certifiedCV.persistence.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author luca
 * 
 */
@Entity
@Table(name = "customer", uniqueConstraints = {
	@UniqueConstraint(columnNames = "username"),
	@UniqueConstraint(columnNames = "password") })
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_customer", discriminatorType = DiscriminatorType.STRING)
public abstract class Customer implements Serializable {

    private static final long serialVersionUID = 7532693621934209772L;

    protected int id;
    protected String userName;
    protected String password;
    protected String email;
    protected List<Address> addresses;
    protected Date dateCreated;
    protected Date dateUpdated;

    @Column(name = "id")
    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    @Column(name = "username")
    public String getUserName() {
	return userName;
    }

    public void setUserName(String userName) {
	this.userName = userName;
    }

    @Column(name = "password")
    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    @Column(name = "email")
    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    @Column(name = "address")
    public List<Address> getAddresses() {
	return addresses;
    }

    public void setAddresses(List<Address> addresses) {
	this.addresses = addresses;
    }

    @Column(name = "ts_created")
    public Date getDateCreated() {
	return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
	this.dateCreated = dateCreated;
    }

    @Column(name = "ts_updated")
    public Date getDateUpdated() {
	return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
	this.dateUpdated = dateUpdated;
    }

}
