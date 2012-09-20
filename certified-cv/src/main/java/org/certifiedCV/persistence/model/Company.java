/**
 * 
 */
package org.certifiedCV.persistence.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author luca
 * 
 */
@Entity
@Table(name = "customer")
@DiscriminatorValue("company")
public class Company extends Customer implements Serializable {

    private static final long serialVersionUID = 1156869397202397770L;

    protected String companyName;
    protected String pIVA;
    protected Set<CompanyCard> cards = new HashSet<CompanyCard>();
    
    @Column(name="company_name")
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    @Column(name="p_iva")
    public String getpIVA() {
        return pIVA;
    }
    public void setpIVA(String pIVA) {
        this.pIVA = pIVA;
    }
    @OneToMany(fetch=FetchType.LAZY, mappedBy="company")
    public Set<CompanyCard> getCards() {
        return cards;
    }
    public void setCards(Set<CompanyCard> cards) {
        this.cards = cards;
    }
    
    


}
