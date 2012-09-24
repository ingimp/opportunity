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

/**
 * @author luca
 * 
 */
@Entity
@Table(name="company_card")
public class CompanyCard implements Serializable {

    private static final long serialVersionUID = 4496773853740987823L;

    protected long id;
    protected String cod;
    protected Company company;
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
    
    @Column(name="cod")
    public String getCod() {
	return cod;
    }

    public void setCod(String cod) {
	this.cod = cod;
    }
    
    @ManyToOne()
    @JoinColumn(name="customer_id")
    public Company getCompany() {
	return company;
    }

    public void setCompany(Company company) {
	this.company = company;
    }

    public Date getDateCreated() {
	return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
	this.dateCreated = dateCreated;
    }

    public Date getDateUpdated() {
	return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
	this.dateUpdated = dateUpdated;
    }

}
