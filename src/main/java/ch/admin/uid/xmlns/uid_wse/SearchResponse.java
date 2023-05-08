
package ch.admin.uid.xmlns.uid_wse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ch.admin.uid.xmlns.uid_wse._5.UidEntitySearchResponse;


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
 *         &lt;element name="SearchResult" type="{http://www.uid.admin.ch/xmlns/uid-wse/5}uidEntitySearchResponse" minOccurs="0"/>
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
    "searchResult"
})
@XmlRootElement(name = "SearchResponse")
public class SearchResponse {

    @XmlElement(name = "SearchResult")
    protected UidEntitySearchResponse searchResult;

    /**
     * Obtient la valeur de la propriété searchResult.
     * 
     * @return
     *     possible object is
     *     {@link UidEntitySearchResponse }
     *     
     */
    public UidEntitySearchResponse getSearchResult() {
        return searchResult;
    }

    /**
     * Définit la valeur de la propriété searchResult.
     * 
     * @param value
     *     allowed object is
     *     {@link UidEntitySearchResponse }
     *     
     */
    public void setSearchResult(UidEntitySearchResponse value) {
        this.searchResult = value;
    }

}
