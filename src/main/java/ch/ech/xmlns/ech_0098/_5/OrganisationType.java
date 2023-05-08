
package ch.ech.xmlns.ech_0098._5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ch.ech.xmlns.ech_0046._5.ContactType;
import ch.ech.xmlns.ech_0097._5.OrganisationIdentificationType;


/**
 * <p>Classe Java pour organisationType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="organisationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="organisationIdentification" type="{http://www.ech.ch/xmlns/eCH-0097/5}organisationIdentificationType" minOccurs="0"/>
 *         &lt;element name="uidBrancheText" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="NOGACode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="foundation" type="{http://www.ech.ch/xmlns/eCH-0098/5}foundationType" minOccurs="0"/>
 *         &lt;element name="liquidation" type="{http://www.ech.ch/xmlns/eCH-0098/5}liquidationType" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.ech.ch/xmlns/eCH-0098/5}organisationAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://www.ech.ch/xmlns/eCH-0046/5}contactType" minOccurs="0"/>
 *         &lt;element name="languageOfCorrespondance" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organisationType", propOrder = {
    "organisationIdentification",
    "uidBrancheText",
    "nogaCode",
    "foundation",
    "liquidation",
    "address",
    "contact",
    "languageOfCorrespondance"
})
public class OrganisationType {

    protected OrganisationIdentificationType organisationIdentification;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String uidBrancheText;
    @XmlElement(name = "NOGACode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String nogaCode;
    protected FoundationType foundation;
    protected LiquidationType liquidation;
    protected List<OrganisationAddressType> address;
    protected ContactType contact;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String languageOfCorrespondance;

    /**
     * Obtient la valeur de la propriété organisationIdentification.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentificationType }
     *     
     */
    public OrganisationIdentificationType getOrganisationIdentification() {
        return organisationIdentification;
    }

    /**
     * Définit la valeur de la propriété organisationIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentificationType }
     *     
     */
    public void setOrganisationIdentification(OrganisationIdentificationType value) {
        this.organisationIdentification = value;
    }

    /**
     * Obtient la valeur de la propriété uidBrancheText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidBrancheText() {
        return uidBrancheText;
    }

    /**
     * Définit la valeur de la propriété uidBrancheText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidBrancheText(String value) {
        this.uidBrancheText = value;
    }

    /**
     * Obtient la valeur de la propriété nogaCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOGACode() {
        return nogaCode;
    }

    /**
     * Définit la valeur de la propriété nogaCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOGACode(String value) {
        this.nogaCode = value;
    }

    /**
     * Obtient la valeur de la propriété foundation.
     * 
     * @return
     *     possible object is
     *     {@link FoundationType }
     *     
     */
    public FoundationType getFoundation() {
        return foundation;
    }

    /**
     * Définit la valeur de la propriété foundation.
     * 
     * @param value
     *     allowed object is
     *     {@link FoundationType }
     *     
     */
    public void setFoundation(FoundationType value) {
        this.foundation = value;
    }

    /**
     * Obtient la valeur de la propriété liquidation.
     * 
     * @return
     *     possible object is
     *     {@link LiquidationType }
     *     
     */
    public LiquidationType getLiquidation() {
        return liquidation;
    }

    /**
     * Définit la valeur de la propriété liquidation.
     * 
     * @param value
     *     allowed object is
     *     {@link LiquidationType }
     *     
     */
    public void setLiquidation(LiquidationType value) {
        this.liquidation = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationAddressType }
     * 
     * 
     */
    public List<OrganisationAddressType> getAddress() {
        if (address == null) {
            address = new ArrayList<OrganisationAddressType>();
        }
        return this.address;
    }

    /**
     * Obtient la valeur de la propriété contact.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getContact() {
        return contact;
    }

    /**
     * Définit la valeur de la propriété contact.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setContact(ContactType value) {
        this.contact = value;
    }

    /**
     * Obtient la valeur de la propriété languageOfCorrespondance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageOfCorrespondance() {
        return languageOfCorrespondance;
    }

    /**
     * Définit la valeur de la propriété languageOfCorrespondance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageOfCorrespondance(String value) {
        this.languageOfCorrespondance = value;
    }

}
