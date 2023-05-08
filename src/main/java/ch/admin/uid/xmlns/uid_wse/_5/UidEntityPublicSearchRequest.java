
package ch.admin.uid.xmlns.uid_wse._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ch.ech.xmlns.ech_0097._5.NamedOrganisationIdType;
import ch.ech.xmlns.ech_0097._5.UidStructureType;


/**
 * <p>Classe Java pour uidEntityPublicSearchRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="uidEntityPublicSearchRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="uid" type="{http://www.ech.ch/xmlns/eCH-0097/5}uidStructureType" minOccurs="0"/>
 *           &lt;element name="otherOrganisationId" type="{http://www.ech.ch/xmlns/eCH-0097/5}namedOrganisationIdType" minOccurs="0"/>
 *           &lt;element name="uidEntitySearchParameters" type="{http://www.uid.admin.ch/xmlns/uid-wse/5}uidEntityPublicSearchParameters" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uidEntityPublicSearchRequest", propOrder = {
    "uid",
    "otherOrganisationId",
    "uidEntitySearchParameters"
})
public class UidEntityPublicSearchRequest {

    protected UidStructureType uid;
    protected NamedOrganisationIdType otherOrganisationId;
    protected UidEntityPublicSearchParameters uidEntitySearchParameters;

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
     * Obtient la valeur de la propriété otherOrganisationId.
     * 
     * @return
     *     possible object is
     *     {@link NamedOrganisationIdType }
     *     
     */
    public NamedOrganisationIdType getOtherOrganisationId() {
        return otherOrganisationId;
    }

    /**
     * Définit la valeur de la propriété otherOrganisationId.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedOrganisationIdType }
     *     
     */
    public void setOtherOrganisationId(NamedOrganisationIdType value) {
        this.otherOrganisationId = value;
    }

    /**
     * Obtient la valeur de la propriété uidEntitySearchParameters.
     * 
     * @return
     *     possible object is
     *     {@link UidEntityPublicSearchParameters }
     *     
     */
    public UidEntityPublicSearchParameters getUidEntitySearchParameters() {
        return uidEntitySearchParameters;
    }

    /**
     * Définit la valeur de la propriété uidEntitySearchParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link UidEntityPublicSearchParameters }
     *     
     */
    public void setUidEntitySearchParameters(UidEntityPublicSearchParameters value) {
        this.uidEntitySearchParameters = value;
    }

}
