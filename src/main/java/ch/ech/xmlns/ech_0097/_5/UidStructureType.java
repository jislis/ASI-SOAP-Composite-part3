
package ch.ech.xmlns.ech_0097._5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ch.ech.xmlns.ech_0116._4.ReportingRegister;


/**
 * <p>Classe Java pour uidStructureType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="uidStructureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uidOrganisationIdCategorie" type="{http://www.ech.ch/xmlns/eCH-0097/5}uidOrganisationIdCategorieType"/>
 *         &lt;element name="uidOrganisationId" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uidStructureType", propOrder = {
    "uidOrganisationIdCategorie",
    "uidOrganisationId"
})
@XmlSeeAlso({
    ReportingRegister.class
})
public class UidStructureType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected UidOrganisationIdCategorieType uidOrganisationIdCategorie;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger uidOrganisationId;

    /**
     * Obtient la valeur de la propriété uidOrganisationIdCategorie.
     * 
     * @return
     *     possible object is
     *     {@link UidOrganisationIdCategorieType }
     *     
     */
    public UidOrganisationIdCategorieType getUidOrganisationIdCategorie() {
        return uidOrganisationIdCategorie;
    }

    /**
     * Définit la valeur de la propriété uidOrganisationIdCategorie.
     * 
     * @param value
     *     allowed object is
     *     {@link UidOrganisationIdCategorieType }
     *     
     */
    public void setUidOrganisationIdCategorie(UidOrganisationIdCategorieType value) {
        this.uidOrganisationIdCategorie = value;
    }

    /**
     * Obtient la valeur de la propriété uidOrganisationId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUidOrganisationId() {
        return uidOrganisationId;
    }

    /**
     * Définit la valeur de la propriété uidOrganisationId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUidOrganisationId(BigInteger value) {
        this.uidOrganisationId = value;
    }

}
