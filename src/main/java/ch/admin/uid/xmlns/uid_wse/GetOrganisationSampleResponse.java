
package ch.admin.uid.xmlns.uid_wse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ch.ech.xmlns.ech_0108._5.OrganisationType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetOrganisationSampleResult" type="{http://www.ech.ch/xmlns/eCH-0108/5}organisationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getOrganisationSampleResult"
})
@XmlRootElement(name = "GetOrganisationSampleResponse")
public class GetOrganisationSampleResponse {

    @XmlElement(name = "GetOrganisationSampleResult")
    protected OrganisationType getOrganisationSampleResult;

    /**
     * Obtient la valeur de la propriété getOrganisationSampleResult.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationType }
     *     
     */
    public OrganisationType getGetOrganisationSampleResult() {
        return getOrganisationSampleResult;
    }

    /**
     * Définit la valeur de la propriété getOrganisationSampleResult.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationType }
     *     
     */
    public void setGetOrganisationSampleResult(OrganisationType value) {
        this.getOrganisationSampleResult = value;
    }

}
