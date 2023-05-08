
package ch.admin.uid.xmlns.uid_wse_shared._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchConfiguration complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchMode" type="{http://www.uid.admin.ch/xmlns/uid-wse-shared/2}searchMode"/>
 *         &lt;element name="maxNumberOfRecords" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="searchNameAndAddressHistory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchConfiguration", propOrder = {
    "searchMode",
    "maxNumberOfRecords",
    "searchNameAndAddressHistory"
})
public class SearchConfiguration {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SearchMode searchMode;
    protected int maxNumberOfRecords;
    protected boolean searchNameAndAddressHistory;

    /**
     * Obtient la valeur de la propriété searchMode.
     * 
     * @return
     *     possible object is
     *     {@link SearchMode }
     *     
     */
    public SearchMode getSearchMode() {
        return searchMode;
    }

    /**
     * Définit la valeur de la propriété searchMode.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMode }
     *     
     */
    public void setSearchMode(SearchMode value) {
        this.searchMode = value;
    }

    /**
     * Obtient la valeur de la propriété maxNumberOfRecords.
     * 
     */
    public int getMaxNumberOfRecords() {
        return maxNumberOfRecords;
    }

    /**
     * Définit la valeur de la propriété maxNumberOfRecords.
     * 
     */
    public void setMaxNumberOfRecords(int value) {
        this.maxNumberOfRecords = value;
    }

    /**
     * Obtient la valeur de la propriété searchNameAndAddressHistory.
     * 
     */
    public boolean isSearchNameAndAddressHistory() {
        return searchNameAndAddressHistory;
    }

    /**
     * Définit la valeur de la propriété searchNameAndAddressHistory.
     * 
     */
    public void setSearchNameAndAddressHistory(boolean value) {
        this.searchNameAndAddressHistory = value;
    }

}
