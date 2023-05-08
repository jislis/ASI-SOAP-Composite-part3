
package ch.ech.xmlns.ech_0108._5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ch.ech.xmlns.ech_0097._5.UidStructureType;


/**
 * <p>Classe Java pour uidregInformationType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="uidregInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uidregStatusEnterpriseDetail" type="{http://www.ech.ch/xmlns/eCH-0108/5}uidregStatusEnterpriseDetailType" minOccurs="0"/>
 *         &lt;element name="uidregPublicStatus" type="{http://www.ech.ch/xmlns/eCH-0108/5}uidregPublicStatusType" minOccurs="0"/>
 *         &lt;element name="uidregOrganisationType" type="{http://www.ech.ch/xmlns/eCH-0108/5}uidregOrganisationTypeType" minOccurs="0"/>
 *         &lt;element name="uidregLiquidationReason" type="{http://www.ech.ch/xmlns/eCH-0108/5}uidregLiquidationReasonType" minOccurs="0"/>
 *         &lt;element name="uidregSource" type="{http://www.ech.ch/xmlns/eCH-0108/5}uidRegSourceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="uidReplacement" type="{http://www.ech.ch/xmlns/eCH-0097/5}uidStructureType" minOccurs="0"/>
 *         &lt;element name="uidregUidService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="uidregTranslation" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uidregInformationType", propOrder = {
    "uidregStatusEnterpriseDetail",
    "uidregPublicStatus",
    "uidregOrganisationType",
    "uidregLiquidationReason",
    "uidregSource",
    "uidReplacement",
    "uidregUidService",
    "uidregTranslation"
})
public class UidregInformationType {

    protected String uidregStatusEnterpriseDetail;
    protected String uidregPublicStatus;
    protected String uidregOrganisationType;
    protected String uidregLiquidationReason;
    protected List<UidRegSourceType> uidregSource;
    protected UidStructureType uidReplacement;
    protected Boolean uidregUidService;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String uidregTranslation;

    /**
     * Obtient la valeur de la propriété uidregStatusEnterpriseDetail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidregStatusEnterpriseDetail() {
        return uidregStatusEnterpriseDetail;
    }

    /**
     * Définit la valeur de la propriété uidregStatusEnterpriseDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidregStatusEnterpriseDetail(String value) {
        this.uidregStatusEnterpriseDetail = value;
    }

    /**
     * Obtient la valeur de la propriété uidregPublicStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidregPublicStatus() {
        return uidregPublicStatus;
    }

    /**
     * Définit la valeur de la propriété uidregPublicStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidregPublicStatus(String value) {
        this.uidregPublicStatus = value;
    }

    /**
     * Obtient la valeur de la propriété uidregOrganisationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidregOrganisationType() {
        return uidregOrganisationType;
    }

    /**
     * Définit la valeur de la propriété uidregOrganisationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidregOrganisationType(String value) {
        this.uidregOrganisationType = value;
    }

    /**
     * Obtient la valeur de la propriété uidregLiquidationReason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidregLiquidationReason() {
        return uidregLiquidationReason;
    }

    /**
     * Définit la valeur de la propriété uidregLiquidationReason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidregLiquidationReason(String value) {
        this.uidregLiquidationReason = value;
    }

    /**
     * Gets the value of the uidregSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uidregSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUidregSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UidRegSourceType }
     * 
     * 
     */
    public List<UidRegSourceType> getUidregSource() {
        if (uidregSource == null) {
            uidregSource = new ArrayList<UidRegSourceType>();
        }
        return this.uidregSource;
    }

    /**
     * Obtient la valeur de la propriété uidReplacement.
     * 
     * @return
     *     possible object is
     *     {@link UidStructureType }
     *     
     */
    public UidStructureType getUidReplacement() {
        return uidReplacement;
    }

    /**
     * Définit la valeur de la propriété uidReplacement.
     * 
     * @param value
     *     allowed object is
     *     {@link UidStructureType }
     *     
     */
    public void setUidReplacement(UidStructureType value) {
        this.uidReplacement = value;
    }

    /**
     * Obtient la valeur de la propriété uidregUidService.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUidregUidService() {
        return uidregUidService;
    }

    /**
     * Définit la valeur de la propriété uidregUidService.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUidregUidService(Boolean value) {
        this.uidregUidService = value;
    }

    /**
     * Obtient la valeur de la propriété uidregTranslation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidregTranslation() {
        return uidregTranslation;
    }

    /**
     * Définit la valeur de la propriété uidregTranslation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidregTranslation(String value) {
        this.uidregTranslation = value;
    }

}
