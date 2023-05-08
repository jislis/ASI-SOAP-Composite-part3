
package ch.admin.uid.xmlns.uid_wse._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ch.ech.xmlns.ech_0108._5.OrganisationType;


/**
 * <p>Classe Java pour uidEntitySearchResultItem complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="uidEntitySearchResultItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="organisation" type="{http://www.ech.ch/xmlns/eCH-0108/5}organisationType" minOccurs="0"/>
 *         &lt;element name="rating" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isHistoryMatch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uidEntitySearchResultItem", propOrder = {
    "organisation",
    "rating",
    "isHistoryMatch",
    "extension"
})
public class UidEntitySearchResultItem {

    protected OrganisationType organisation;
    protected int rating;
    protected boolean isHistoryMatch;
    protected Object extension;

    /**
     * Obtient la valeur de la propriété organisation.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationType }
     *     
     */
    public OrganisationType getOrganisation() {
        return organisation;
    }

    /**
     * Définit la valeur de la propriété organisation.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationType }
     *     
     */
    public void setOrganisation(OrganisationType value) {
        this.organisation = value;
    }

    /**
     * Obtient la valeur de la propriété rating.
     * 
     */
    public int getRating() {
        return rating;
    }

    /**
     * Définit la valeur de la propriété rating.
     * 
     */
    public void setRating(int value) {
        this.rating = value;
    }

    /**
     * Obtient la valeur de la propriété isHistoryMatch.
     * 
     */
    public boolean isIsHistoryMatch() {
        return isHistoryMatch;
    }

    /**
     * Définit la valeur de la propriété isHistoryMatch.
     * 
     */
    public void setIsHistoryMatch(boolean value) {
        this.isHistoryMatch = value;
    }

    /**
     * Obtient la valeur de la propriété extension.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Définit la valeur de la propriété extension.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtension(Object value) {
        this.extension = value;
    }

}
