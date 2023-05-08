
package ch.admin.uid.xmlns.uid_wse._5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour uidEntityPublicSearchParameters complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="uidEntityPublicSearchParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="organisationName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="personName" type="{http://www.uid.admin.ch/xmlns/uid-wse/5}personNameType" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.uid.admin.ch/xmlns/uid-wse/5}addressSearchType" minOccurs="0"/>
 *         &lt;element name="legalForm" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="uidregInformation" type="{http://www.uid.admin.ch/xmlns/uid-wse/5}uidregInformationPublicSearchType" minOccurs="0"/>
 *         &lt;element name="commercialRegisterInformation" type="{http://www.uid.admin.ch/xmlns/uid-wse/5}commercialRegisterInformationSearchType" minOccurs="0"/>
 *         &lt;element name="vatRegisterInformation" type="{http://www.uid.admin.ch/xmlns/uid-wse/5}vatRegisterInformationSearchType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uidEntityPublicSearchParameters", propOrder = {
    "organisationName",
    "personName",
    "address",
    "legalForm",
    "uidregInformation",
    "commercialRegisterInformation",
    "vatRegisterInformation"
})
public class UidEntityPublicSearchParameters {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String organisationName;
    protected PersonNameType personName;
    protected AddressSearchType address;
    protected List<String> legalForm;
    protected UidregInformationPublicSearchType uidregInformation;
    protected CommercialRegisterInformationSearchType commercialRegisterInformation;
    protected VatRegisterInformationSearchType vatRegisterInformation;

    /**
     * Obtient la valeur de la propriété organisationName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationName() {
        return organisationName;
    }

    /**
     * Définit la valeur de la propriété organisationName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationName(String value) {
        this.organisationName = value;
    }

    /**
     * Obtient la valeur de la propriété personName.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * Définit la valeur de la propriété personName.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
    }

    /**
     * Obtient la valeur de la propriété address.
     * 
     * @return
     *     possible object is
     *     {@link AddressSearchType }
     *     
     */
    public AddressSearchType getAddress() {
        return address;
    }

    /**
     * Définit la valeur de la propriété address.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressSearchType }
     *     
     */
    public void setAddress(AddressSearchType value) {
        this.address = value;
    }

    /**
     * Gets the value of the legalForm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legalForm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegalForm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLegalForm() {
        if (legalForm == null) {
            legalForm = new ArrayList<String>();
        }
        return this.legalForm;
    }

    /**
     * Obtient la valeur de la propriété uidregInformation.
     * 
     * @return
     *     possible object is
     *     {@link UidregInformationPublicSearchType }
     *     
     */
    public UidregInformationPublicSearchType getUidregInformation() {
        return uidregInformation;
    }

    /**
     * Définit la valeur de la propriété uidregInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link UidregInformationPublicSearchType }
     *     
     */
    public void setUidregInformation(UidregInformationPublicSearchType value) {
        this.uidregInformation = value;
    }

    /**
     * Obtient la valeur de la propriété commercialRegisterInformation.
     * 
     * @return
     *     possible object is
     *     {@link CommercialRegisterInformationSearchType }
     *     
     */
    public CommercialRegisterInformationSearchType getCommercialRegisterInformation() {
        return commercialRegisterInformation;
    }

    /**
     * Définit la valeur de la propriété commercialRegisterInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialRegisterInformationSearchType }
     *     
     */
    public void setCommercialRegisterInformation(CommercialRegisterInformationSearchType value) {
        this.commercialRegisterInformation = value;
    }

    /**
     * Obtient la valeur de la propriété vatRegisterInformation.
     * 
     * @return
     *     possible object is
     *     {@link VatRegisterInformationSearchType }
     *     
     */
    public VatRegisterInformationSearchType getVatRegisterInformation() {
        return vatRegisterInformation;
    }

    /**
     * Définit la valeur de la propriété vatRegisterInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link VatRegisterInformationSearchType }
     *     
     */
    public void setVatRegisterInformation(VatRegisterInformationSearchType value) {
        this.vatRegisterInformation = value;
    }

}
