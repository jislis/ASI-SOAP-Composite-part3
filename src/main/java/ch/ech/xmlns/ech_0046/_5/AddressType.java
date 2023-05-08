
package ch.ech.xmlns.ech_0046._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ch.ech.xmlns.ech_0010._7.MailAddressType;


/**
 * <p>Classe Java pour addressType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="addressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="addressCategory" type="{http://www.ech.ch/xmlns/eCH-0046/5}addressCategoryType"/>
 *           &lt;element name="otherAddressCategory" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="postalAddress" type="{http://www.ech.ch/xmlns/eCH-0010/7}mailAddressType" minOccurs="0"/>
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
@XmlType(name = "addressType", propOrder = {
    "addressCategory",
    "otherAddressCategory",
    "postalAddress",
    "validity"
})
public class AddressType {

    protected String addressCategory;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String otherAddressCategory;
    protected MailAddressType postalAddress;
    protected DateRangeType validity;

    /**
     * Obtient la valeur de la propriété addressCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCategory() {
        return addressCategory;
    }

    /**
     * Définit la valeur de la propriété addressCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCategory(String value) {
        this.addressCategory = value;
    }

    /**
     * Obtient la valeur de la propriété otherAddressCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherAddressCategory() {
        return otherAddressCategory;
    }

    /**
     * Définit la valeur de la propriété otherAddressCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherAddressCategory(String value) {
        this.otherAddressCategory = value;
    }

    /**
     * Obtient la valeur de la propriété postalAddress.
     * 
     * @return
     *     possible object is
     *     {@link MailAddressType }
     *     
     */
    public MailAddressType getPostalAddress() {
        return postalAddress;
    }

    /**
     * Définit la valeur de la propriété postalAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link MailAddressType }
     *     
     */
    public void setPostalAddress(MailAddressType value) {
        this.postalAddress = value;
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
