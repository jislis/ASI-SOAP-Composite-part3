
package ch.ech.xmlns.ech_0046._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour emailType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="emailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="emailCategory" type="{http://www.ech.ch/xmlns/eCH-0046/5}emailCategoryType"/>
 *           &lt;element name="otherEmailCategory" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validity" type="{http://www.ech.ch/xmlns/eCH-0046/5}dateRangeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emailType", propOrder = {
    "emailCategory",
    "otherEmailCategory",
    "emailAddress",
    "validity"
})
public class EmailType {

    protected String emailCategory;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String otherEmailCategory;
    protected String emailAddress;
    protected DateRangeType validity;

    /**
     * Obtient la valeur de la propriété emailCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailCategory() {
        return emailCategory;
    }

    /**
     * Définit la valeur de la propriété emailCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailCategory(String value) {
        this.emailCategory = value;
    }

    /**
     * Obtient la valeur de la propriété otherEmailCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherEmailCategory() {
        return otherEmailCategory;
    }

    /**
     * Définit la valeur de la propriété otherEmailCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherEmailCategory(String value) {
        this.otherEmailCategory = value;
    }

    /**
     * Obtient la valeur de la propriété emailAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Définit la valeur de la propriété emailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Obtient la valeur de la propriété validity.
     * 
     * @return
     *     possible object is
     *     {@link DateRangeType }
     *     
     */
    public DateRangeType getValidity() {
        return validity;
    }

    /**
     * Définit la valeur de la propriété validity.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRangeType }
     *     
     */
    public void setValidity(DateRangeType value) {
        this.validity = value;
    }

}
