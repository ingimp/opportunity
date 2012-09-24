/**
 * 
 */
package org.certifiedCV.persistence.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author luca
 * 
 */
@Entity
@Table(name="certified_cv")
public class CertifiedCV implements Serializable {

    private static final long serialVersionUID = -8019696512931494625L;

    protected long id;
    protected String cod;
    protected User user;
    protected Date dateCreated;
    protected Date dateUpdated;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

    @Column(name = "cod")
    public String getCod() {
	return cod;
    }

    public void setCod(String cod) {
	this.cod = cod;
    }

    @ManyToOne
    @JoinColumn(name = "customer_id")
    public User getUser() {
	return user;
    }

    public void setUser(User user) {
	this.user = user;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getDateCreated() {
	return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
	this.dateCreated = dateCreated;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getDateUpdated() {
	return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
	this.dateUpdated = dateUpdated;
    }

}
