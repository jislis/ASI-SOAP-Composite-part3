
package ch.ech.xmlns.ech_0097._5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour organisationIdentificationType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="organisationIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uid" type="{http://www.ech.ch/xmlns/eCH-0097/5}uidStructureType" minOccurs="0"/>
 *         &lt;element name="localOrganisationId" type="{http://www.ech.ch/xmlns/eCH-0097/5}namedOrganisationIdType" minOccurs="0"/>
 *         &lt;element name="OtherOrganisationId" type="{http://www.ech.ch/xmlns/eCH-0097/5}namedOrganisationIdType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="organisationName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="organisationLegalName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="organisationAdditionalName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="legalForm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organisationIdentificationType", propOrder = {
    "uid",
    "localOrganisationId",
    "otherOrganisationId",
    "organisationName",
    "organisationLegalName",
    "organisationAdditionalName",
    "legalForm"
})
public class OrganisationIdentificationType {

    protected UidStructureType uid;
    protected NamedOrganisationIdType localOrganisationId;
    @XmlElement(name = "OtherOrganisationId")
    protected List<NamedOrganisationIdType> otherOrganisationId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String organisationName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String organisationLegalName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String organisationAdditionalName;
    protected String legalForm;

    /**
     * Obtient la valeur de la propriété uid.
     * 
     * @return
     *     possible object is
     *     {@link UidStructureType }
     *     
     */
    public UidStructureType getUid() {
        return uid;
    }

    /**
     * Définit la valeur de la propriété uid.
     * 
     * @param value
     *     allowed object is
     *     {@link UidStructureType }
     *     
     */
    public void setUid(UidStructureType value) {
        this.uid = value;
    }

    /**
     * Obtient la valeur de la propriété localOrganisationId.
     * 
     * @return
     *     possible object is
     *     {@link NamedOrganisationIdType }
     *     
     */
    public NamedOrganisationIdType getLocalOrganisationId() {
        return localOrganisationId;
    }

    /**
     * Définit la valeur de la propriété localOrganisationId.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedOrganisationIdType }
     *     
     */
    public void setLocalOrganisationId(NamedOrganisationIdType value) {
        this.localOrganisationId = value;
    }

    /**
     * Gets the value of the otherOrganisationId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherOrganisationId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherOrganisationId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedOrganisationIdType }
     * 
     * 
     */
    public List<NamedOrganisationIdType> getOtherOrganisationId() {
        if (otherOrganisationId == null) {
            otherOrganisationId = new ArrayList<NamedOrganisationIdType>();
        }
        return this.otherOrganisationId;
    }

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
     * Obtient la valeur de la propriété organisationLegalName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationLegalName() {
        return organisationLegalName;
    }

    /**
     * Définit la valeur de la propriété organisationLegalName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationLegalName(String value) {
        this.organisationLegalName = value;
    }

    /**
     * Obtient la valeur de la propriété organisationAdditionalName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationAdditionalName() {
        return organisationAdditionalName;
    }

    /**
     * Définit la valeur de la propriété organisationAdditionalName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationAdditionalName(String value) {
        this.organisationAdditionalName = value;
    }

    /**
     * Obtient la valeur de la propriété legalForm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalForm() {
        return legalForm;
    }

    /**
     * Définit la valeur de la propriété legalForm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalForm(String value) {
        this.legalForm = value;
    }

}
