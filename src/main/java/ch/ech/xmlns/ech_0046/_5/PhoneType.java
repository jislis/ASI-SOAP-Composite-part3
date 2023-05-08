
package ch.ech.xmlns.ech_0046._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour phoneType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="phoneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="otherPhoneCategory" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *           &lt;element name="phoneCategory" type="{http://www.ech.ch/xmlns/eCH-0046/5}phoneCategoryType"/>
 *         &lt;/choice>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "phoneType", propOrder = {
    "otherPhoneCategory",
    "phoneCategory",
    "phoneNumber",
    "validity"
})
public class PhoneType {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String otherPhoneCategory;
    protected String phoneCategory;
    protected String phoneNumber;
    protected DateRangeType validity;

    /**
     * Obtient la valeur de la propriété otherPhoneCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPhoneCategory() {
        return otherPhoneCategory;
    }

    /**
     * Définit la valeur de la propriété otherPhoneCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPhoneCategory(String value) {
        this.otherPhoneCategory = value;
    }

    /**
     * Obtient la valeur de la propriété phoneCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneCategory() {
        return phoneCategory;
    }

    /**
     * Définit la valeur de la propriété phoneCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneCategory(String value) {
        this.phoneCategory = value;
    }

    /**
     * Obtient la valeur de la propriété phoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Définit la valeur de la propriété phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
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
