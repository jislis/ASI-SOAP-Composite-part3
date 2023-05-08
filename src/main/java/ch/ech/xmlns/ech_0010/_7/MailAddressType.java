
package ch.ech.xmlns.ech_0010._7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour mailAddressType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="mailAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="organisation" type="{http://www.ech.ch/xmlns/eCH-0010/7}organisationMailAddressInfoType" minOccurs="0"/>
 *           &lt;element name="person" type="{http://www.ech.ch/xmlns/eCH-0010/7}personMailAddressInfoType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="addressInformation" type="{http://www.ech.ch/xmlns/eCH-0010/7}addressInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mailAddressType", propOrder = {
    "organisation",
    "person",
    "addressInformation"
})
public class MailAddressType {

    protected OrganisationMailAddressInfoType organisation;
    protected PersonMailAddressInfoType person;
    protected AddressInformationType addressInformation;

    /**
     * Obtient la valeur de la propriété organisation.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationMailAddressInfoType }
     *     
     */
    public OrganisationMailAddressInfoType getOrganisation() {
        return organisation;
    }

    /**
     * Définit la valeur de la propriété organisation.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationMailAddressInfoType }
     *     
     */
    public void setOrganisation(OrganisationMailAddressInfoType value) {
        this.organisation = value;
    }

    /**
     * Obtient la valeur de la propriété person.
     * 
     * @return
     *     possible object is
     *     {@link PersonMailAddressInfoType }
     *     
     */
    public PersonMailAddressInfoType getPerson() {
        return person;
    }

    /**
     * Définit la valeur de la propriété person.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonMailAddressInfoType }
     *     
     */
    public void setPerson(PersonMailAddressInfoType value) {
        this.person = value;
    }

    /**
     * Obtient la valeur de la propriété addressInformation.
     * 
     * @return
     *     possible object is
     *     {@link AddressInformationType }
     *     
     */
    public AddressInformationType getAddressInformation() {
        return addressInformation;
    }

    /**
     * Définit la valeur de la propriété addressInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInformationType }
     *     
     */
    public void setAddressInformation(AddressInformationType value) {
        this.addressInformation = value;
    }

}
