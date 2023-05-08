
package ch.ech.xmlns.ech_0046._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour internetType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="internetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="internetCategory" type="{http://www.ech.ch/xmlns/eCH-0046/5}internetCategoryType"/>
 *           &lt;element name="otherInternetCategory" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="internetAddress" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
@XmlType(name = "internetType", propOrder = {
    "internetCategory",
    "otherInternetCategory",
    "internetAddress",
    "validity"
})
public class InternetType {

    protected String internetCategory;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String otherInternetCategory;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String internetAddress;
    protected DateRangeType validity;

    /**
     * Obtient la valeur de la propriété internetCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternetCategory() {
        return internetCategory;
    }

    /**
     * Définit la valeur de la propriété internetCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetCategory(String value) {
        this.internetCategory = value;
    }

    /**
     * Obtient la valeur de la propriété otherInternetCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherInternetCategory() {
        return otherInternetCategory;
    }

    /**
     * Définit la valeur de la propriété otherInternetCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherInternetCategory(String value) {
        this.otherInternetCategory = value;
    }

    /**
     * Obtient la valeur de la propriété internetAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternetAddress() {
        return internetAddress;
    }

    /**
     * Définit la valeur de la propriété internetAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternetAddress(String value) {
        this.internetAddress = value;
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
