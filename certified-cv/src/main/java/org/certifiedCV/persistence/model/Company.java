/**
 * 
 */
package org.certifiedCV.persistence.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author luca
 * 
 */
public class Company extends Customer implements Serializable {

	private static final long serialVersionUID = 1156869397202397770L;

	protected String companyName;
	protected String pIVA;
	protected Set<CompanyCard> cards = new HashSet<CompanyCard>();
}
