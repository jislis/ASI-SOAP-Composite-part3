
package ch.admin.uid.xmlns.uid_wse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ch.admin.uid.xmlns.uid_wse._5.UidEntityPublicSearchRequest;
import ch.admin.uid.xmlns.uid_wse_shared._2.SearchConfiguration;


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
 *         &lt;element name="searchParameters" type="{http://www.uid.admin.ch/xmlns/uid-wse/5}uidEntityPublicSearchRequest" minOccurs="0"/>
 *         &lt;element name="config" type="{http://www.uid.admin.ch/xmlns/uid-wse-shared/2}searchConfiguration" minOccurs="0"/>
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
    "searchParameters",
    "config"
})
@XmlRootElement(name = "Search")
public class Search {

    protected UidEntityPublicSearchRequest searchParameters;
    protected SearchConfiguration config;

    /**
     * Obtient la valeur de la propriété searchParameters.
     * 
     * @return
     *     possible object is
     *     {@link UidEntityPublicSearchRequest }
     *     
     */
    public UidEntityPublicSearchRequest getSearchParameters() {
        return searchParameters;
    }

    /**
     * Définit la valeur de la propriété searchParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link UidEntityPublicSearchRequest }
     *     
     */
    public void setSearchParameters(UidEntityPublicSearchRequest value) {
        this.searchParameters = value;
    }

    /**
     * Obtient la valeur de la propriété config.
     * 
     * @return
     *     possible object is
     *     {@link SearchConfiguration }
     *     
     */
    public SearchConfiguration getConfig() {
        return config;
    }

    /**
     * Définit la valeur de la propriété config.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchConfiguration }
     *     
     */
    public void setConfig(SearchConfiguration value) {
        this.config = value;
    }

}
