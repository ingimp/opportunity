/**
 * 
 */
package org.certifiedCV.persistence.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author luca
 * 
 */
@Entity
@DiscriminatorValue("user")
public class User extends Customer implements Serializable {

    private static final long serialVersionUID = -5296425601147493494L;
    protected String firstName;
    protected String lastName;
    protected Set<CertifiedCV> certifiedCVs;

    @Column(name = "firstname")
    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    @Column(name = "lastname")
    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    public Set<CertifiedCV> getCertifiedCVs() {
	return certifiedCVs;
    }

    public void setCertifiedCVs(Set<CertifiedCV> certifiedCVs) {
	this.certifiedCVs = certifiedCVs;
    }

}
