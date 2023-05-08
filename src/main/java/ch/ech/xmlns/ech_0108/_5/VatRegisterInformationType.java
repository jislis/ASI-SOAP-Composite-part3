
package ch.ech.xmlns.ech_0108._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ch.ech.xmlns.ech_0097._5.UidStructureType;


/**
 * <p>Classe Java pour vatRegisterInformationType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="vatRegisterInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vatStatus" type="{http://www.ech.ch/xmlns/eCH-0108/5}vatStatusType"/>
 *         &lt;element name="vatEntryStatus" type="{http://www.ech.ch/xmlns/eCH-0108/5}vatEntryStatusType" minOccurs="0"/>
 *         &lt;element name="vatEntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="vatLiquidationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="uidVat" type="{http://www.ech.ch/xmlns/eCH-0097/5}uidStructureType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vatRegisterInformationType", propOrder = {
    "vatStatus",
    "vatEntryStatus",
    "vatEntryDate",
    "vatLiquidationDate",
    "uidVat"
})
public class VatRegisterInformationType {

    @XmlElement(required = true)
    protected String vatStatus;
    protected String vatEntryStatus;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vatEntryDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vatLiquidationDate;
    protected UidStructureType uidVat;

    /**
     * Obtient la valeur de la propriété vatStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatStatus() {
        return vatStatus;
    }

    /**
     * Définit la valeur de la propriété vatStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatStatus(String value) {
        this.vatStatus = value;
    }

    /**
     * Obtient la valeur de la propriété vatEntryStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatEntryStatus() {
        return vatEntryStatus;
    }

    /**
     * Définit la valeur de la propriété vatEntryStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatEntryStatus(String value) {
        this.vatEntryStatus = value;
    }

    /**
     * Obtient la valeur de la propriété vatEntryDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVatEntryDate() {
        return vatEntryDate;
    }

    /**
     * Définit la valeur de la propriété vatEntryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVatEntryDate(XMLGregorianCalendar value) {
        this.vatEntryDate = value;
    }

    /**
     * Obtient la valeur de la propriété vatLiquidationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVatLiquidationDate() {
        return vatLiquidationDate;
    }

    /**
     * Définit la valeur de la propriété vatLiquidationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVatLiquidationDate(XMLGregorianCalendar value) {
        this.vatLiquidationDate = value;
    }

    /**
     * Obtient la valeur de la propriété uidVat.
     * 
     * @return
     *     possible object is
     *     {@link UidStructureType }
     *     
     */
    public UidStructureType getUidVat() {
        return uidVat;
    }

    /**
     * Définit la valeur de la propriété uidVat.
     * 
     * @param value
     *     allowed object is
     *     {@link UidStructureType }
     *     
     */
    public void setUidVat(UidStructureType value) {
        this.uidVat = value;
    }

}
