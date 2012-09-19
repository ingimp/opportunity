/**
 * 
 */
package org.certifiedCV.persistence.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author luca
 * 
 */
@Entity
@Table(name = "")
public class User extends Customer implements Serializable {

	private static final long serialVersionUID = -5296425601147493494L;
	protected String firstName;
	protected String lastName;
	protected Set<CertifiedCV> certifiedCVs = new HashSet<CertifiedCV>();

}
