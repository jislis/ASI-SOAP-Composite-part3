
package ch.ech.xmlns.ech_0098._5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.ech.xmlns.ech_0007._6.CantonAbbreviationType;


/**
 * <p>Classe Java pour organisationAddressType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="organisationAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressCategory" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="addressLine1" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="addressLine2" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="houseNumber" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="dwellingNumber" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="postOfficeBoxNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="town" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="swissZipCode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *           &lt;element name="swissZipCodeAddOn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="municipalityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="cantonAbbreviation" type="{http://www.ech.ch/xmlns/eCH-0007/6}cantonAbbreviationType"/>
 *           &lt;element name="EGID" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *           &lt;element name="foreignZipCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="countryIdISO2" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="deliverableYesNo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="dateOfLastCheck" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organisationAddressType", propOrder = {
    "addressCategory",
    "addressLine1",
    "addressLine2",
    "street",
    "houseNumber",
    "dwellingNumber",
    "postOfficeBoxNumber",
    "town",
    "swissZipCodeOrSwissZipCodeAddOnOrMunicipalityId",
    "countryIdISO2",
    "deliverableYesNo",
    "dateOfLastCheck"
})
public class OrganisationAddressType {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String addressCategory;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String addressLine1;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String addressLine2;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String street;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String houseNumber;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dwellingNumber;
    @XmlSchemaType(name = "unsignedInt")
    protected Long postOfficeBoxNumber;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String town;
    @XmlElementRefs({
        @XmlElementRef(name = "swissZipCodeAddOn", namespace = "http://www.ech.ch/xmlns/eCH-0098/5", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "swissZipCode", namespace = "http://www.ech.ch/xmlns/eCH-0098/5", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "municipalityId", namespace = "http://www.ech.ch/xmlns/eCH-0098/5", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cantonAbbreviation", namespace = "http://www.ech.ch/xmlns/eCH-0098/5", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EGID", namespace = "http://www.ech.ch/xmlns/eCH-0098/5", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "foreignZipCode", namespace = "http://www.ech.ch/xmlns/eCH-0098/5", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> swissZipCodeOrSwissZipCodeAddOnOrMunicipalityId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryIdISO2;
    protected Boolean deliverableYesNo;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfLastCheck;

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
     * Obtient la valeur de la propriété addressLine1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Définit la valeur de la propriété addressLine1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Obtient la valeur de la propriété addressLine2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Définit la valeur de la propriété addressLine2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Obtient la valeur de la propriété street.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Définit la valeur de la propriété street.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Obtient la valeur de la propriété houseNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Définit la valeur de la propriété houseNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumber(String value) {
        this.houseNumber = value;
    }

    /**
     * Obtient la valeur de la propriété dwellingNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDwellingNumber() {
        return dwellingNumber;
    }

    /**
     * Définit la valeur de la propriété dwellingNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDwellingNumber(String value) {
        this.dwellingNumber = value;
    }

    /**
     * Obtient la valeur de la propriété postOfficeBoxNumber.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPostOfficeBoxNumber() {
        return postOfficeBoxNumber;
    }

    /**
     * Définit la valeur de la propriété postOfficeBoxNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPostOfficeBoxNumber(Long value) {
        this.postOfficeBoxNumber = value;
    }

    /**
     * Obtient la valeur de la propriété town.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTown() {
        return town;
    }

    /**
     * Définit la valeur de la propriété town.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTown(String value) {
        this.town = value;
    }

    /**
     * Gets the value of the swissZipCodeOrSwissZipCodeAddOnOrMunicipalityId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the swissZipCodeOrSwissZipCodeAddOnOrMunicipalityId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwissZipCodeOrSwissZipCodeAddOnOrMunicipalityId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link CantonAbbreviationType }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getSwissZipCodeOrSwissZipCodeAddOnOrMunicipalityId() {
        if (swissZipCodeOrSwissZipCodeAddOnOrMunicipalityId == null) {
            swissZipCodeOrSwissZipCodeAddOnOrMunicipalityId = new ArrayList<JAXBElement<?>>();
        }
        return this.swissZipCodeOrSwissZipCodeAddOnOrMunicipalityId;
    }

    /**
     * Obtient la valeur de la propriété countryIdISO2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryIdISO2() {
        return countryIdISO2;
    }

    /**
     * Définit la valeur de la propriété countryIdISO2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryIdISO2(String value) {
        this.countryIdISO2 = value;
    }

    /**
     * Obtient la valeur de la propriété deliverableYesNo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliverableYesNo() {
        return deliverableYesNo;
    }

    /**
     * Définit la valeur de la propriété deliverableYesNo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliverableYesNo(Boolean value) {
        this.deliverableYesNo = value;
    }

    /**
     * Obtient la valeur de la propriété dateOfLastCheck.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfLastCheck() {
        return dateOfLastCheck;
    }

    /**
     * Définit la valeur de la propriété dateOfLastCheck.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfLastCheck(XMLGregorianCalendar value) {
        this.dateOfLastCheck = value;
    }

}
