
package ch.admin.uid.xmlns.uid_wse._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour commercialRegisterInformationSearchType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="commercialRegisterInformationSearchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commercialRegisterStatus" type="{http://www.ech.ch/xmlns/eCH-0108/5}commercialRegisterStatusType" minOccurs="0"/>
 *         &lt;element name="commercialRegisterEntryStatus" type="{http://www.ech.ch/xmlns/eCH-0108/5}commercialRegisterEntryStatusType" minOccurs="0"/>
 *         &lt;element name="commercialRegisterEntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="commercialRegisterLiquidationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="commercialRegisterEnterpriseType" type="{http://www.ech.ch/xmlns/eCH-0108/5}commercialRegisterEnterpriseTypeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commercialRegisterInformationSearchType", propOrder = {
    "commercialRegisterStatus",
    "commercialRegisterEntryStatus",
    "commercialRegisterEntryDate",
    "commercialRegisterLiquidationDate",
    "commercialRegisterEnterpriseType"
})
public class CommercialRegisterInformationSearchType {

    protected String commercialRegisterStatus;
    protected String commercialRegisterEntryStatus;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar commercialRegisterEntryDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar commercialRegisterLiquidationDate;
    protected String commercialRegisterEnterpriseType;

    /**
     * Obtient la valeur de la propriété commercialRegisterStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialRegisterStatus() {
        return commercialRegisterStatus;
    }

    /**
     * Définit la valeur de la propriété commercialRegisterStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialRegisterStatus(String value) {
        this.commercialRegisterStatus = value;
    }

    /**
     * Obtient la valeur de la propriété commercialRegisterEntryStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialRegisterEntryStatus() {
        return commercialRegisterEntryStatus;
    }

    /**
     * Définit la valeur de la propriété commercialRegisterEntryStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialRegisterEntryStatus(String value) {
        this.commercialRegisterEntryStatus = value;
    }

    /**
     * Obtient la valeur de la propriété commercialRegisterEntryDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommercialRegisterEntryDate() {
        return commercialRegisterEntryDate;
    }

    /**
     * Définit la valeur de la propriété commercialRegisterEntryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommercialRegisterEntryDate(XMLGregorianCalendar value) {
        this.commercialRegisterEntryDate = value;
    }

    /**
     * Obtient la valeur de la propriété commercialRegisterLiquidationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommercialRegisterLiquidationDate() {
        return commercialRegisterLiquidationDate;
    }

    /**
     * Définit la valeur de la propriété commercialRegisterLiquidationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommercialRegisterLiquidationDate(XMLGregorianCalendar value) {
        this.commercialRegisterLiquidationDate = value;
    }

    /**
     * Obtient la valeur de la propriété commercialRegisterEnterpriseType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialRegisterEnterpriseType() {
        return commercialRegisterEnterpriseType;
    }

    /**
     * Définit la valeur de la propriété commercialRegisterEnterpriseType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialRegisterEnterpriseType(String value) {
        this.commercialRegisterEnterpriseType = value;
    }

}
