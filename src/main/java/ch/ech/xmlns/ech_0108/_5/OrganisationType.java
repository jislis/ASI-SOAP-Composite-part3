
package ch.ech.xmlns.ech_0108._5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="organisation" type="{http://www.ech.ch/xmlns/eCH-0098/5}organisationType" minOccurs="0"/>
 *         &lt;element name="uidregInformation" type="{http://www.ech.ch/xmlns/eCH-0108/5}uidregInformationType" minOccurs="0"/>
 *         &lt;element name="commercialRegisterInformation" type="{http://www.ech.ch/xmlns/eCH-0108/5}commercialRegisterInformationType" minOccurs="0"/>
 *         &lt;element name="vatRegisterInformation" type="{http://www.ech.ch/xmlns/eCH-0108/5}vatRegisterInformationType" minOccurs="0"/>
 *         &lt;element name="leiRegisterInformation" type="{http://www.ech.ch/xmlns/eCH-0108/5}leiRegisterInformationType" minOccurs="0"/>
 *         &lt;element name="groupRelationship" type="{http://www.ech.ch/xmlns/eCH-0108/5}groupRelationshipType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="involvedPerson" type="{http://www.ech.ch/xmlns/eCH-0108/5}involvedPersonType" maxOccurs="unbounded" minOccurs="0"/>
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
    "organisation",
    "uidregInformation",
    "commercialRegisterInformation",
    "vatRegisterInformation",
    "leiRegisterInformation",
    "groupRelationship",
    "involvedPerson"
})
public class OrganisationType {

    protected ch.ech.xmlns.ech_0098._5.OrganisationType organisation;
    protected UidregInformationType uidregInformation;
    protected CommercialRegisterInformationType commercialRegisterInformation;
    protected VatRegisterInformationType vatRegisterInformation;
    protected LeiRegisterInformationType leiRegisterInformation;
    protected List<GroupRelationshipType> groupRelationship;
    protected List<InvolvedPersonType> involvedPerson;

    /**
     * Obtient la valeur de la propriété organisation.
     * 
     * @return
     *     possible object is
     *     {@link ch.ech.xmlns.ech_0098._5.OrganisationType }
     *     
     */
    public ch.ech.xmlns.ech_0098._5.OrganisationType getOrganisation() {
        return organisation;
    }

    /**
     * Définit la valeur de la propriété organisation.
     * 
     * @param value
     *     allowed object is
     *     {@link ch.ech.xmlns.ech_0098._5.OrganisationType }
     *     
     */
    public void setOrganisation(ch.ech.xmlns.ech_0098._5.OrganisationType value) {
        this.organisation = value;
    }

    /**
     * Obtient la valeur de la propriété uidregInformation.
     * 
     * @return
     *     possible object is
     *     {@link UidregInformationType }
     *     
     */
    public UidregInformationType getUidregInformation() {
        return uidregInformation;
    }

    /**
     * Définit la valeur de la propriété uidregInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link UidregInformationType }
     *     
     */
    public void setUidregInformation(UidregInformationType value) {
        this.uidregInformation = value;
    }

    /**
     * Obtient la valeur de la propriété commercialRegisterInformation.
     * 
     * @return
     *     possible object is
     *     {@link CommercialRegisterInformationType }
     *     
     */
    public CommercialRegisterInformationType getCommercialRegisterInformation() {
        return commercialRegisterInformation;
    }

    /**
     * Définit la valeur de la propriété commercialRegisterInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialRegisterInformationType }
     *     
     */
    public void setCommercialRegisterInformation(CommercialRegisterInformationType value) {
        this.commercialRegisterInformation = value;
    }

    /**
     * Obtient la valeur de la propriété vatRegisterInformation.
     * 
     * @return
     *     possible object is
     *     {@link VatRegisterInformationType }
     *     
     */
    public VatRegisterInformationType getVatRegisterInformation() {
        return vatRegisterInformation;
    }

    /**
     * Définit la valeur de la propriété vatRegisterInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link VatRegisterInformationType }
     *     
     */
    public void setVatRegisterInformation(VatRegisterInformationType value) {
        this.vatRegisterInformation = value;
    }

    /**
     * Obtient la valeur de la propriété leiRegisterInformation.
     * 
     * @return
     *     possible object is
     *     {@link LeiRegisterInformationType }
     *     
     */
    public LeiRegisterInformationType getLeiRegisterInformation() {
        return leiRegisterInformation;
    }

    /**
     * Définit la valeur de la propriété leiRegisterInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link LeiRegisterInformationType }
     *     
     */
    public void setLeiRegisterInformation(LeiRegisterInformationType value) {
        this.leiRegisterInformation = value;
    }

    /**
     * Gets the value of the groupRelationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupRelationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupRelationshipType }
     * 
     * 
     */
    public List<GroupRelationshipType> getGroupRelationship() {
        if (groupRelationship == null) {
            groupRelationship = new ArrayList<GroupRelationshipType>();
        }
        return this.groupRelationship;
    }

    /**
     * Gets the value of the involvedPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the involvedPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvolvedPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvolvedPersonType }
     * 
     * 
     */
    public List<InvolvedPersonType> getInvolvedPerson() {
        if (involvedPerson == null) {
            involvedPerson = new ArrayList<InvolvedPersonType>();
        }
        return this.involvedPerson;
    }

}
