
package ch.admin.uid.xmlns.uid_wse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ValidateVatNumberResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "validateVatNumberResult"
})
@XmlRootElement(name = "ValidateVatNumberResponse")
public class ValidateVatNumberResponse {

    @XmlElement(name = "ValidateVatNumberResult")
    protected boolean validateVatNumberResult;

    /**
     * Obtient la valeur de la propriété validateVatNumberResult.
     * 
     */
    public boolean isValidateVatNumberResult() {
        return validateVatNumberResult;
    }

    /**
     * Définit la valeur de la propriété validateVatNumberResult.
     * 
     */
    public void setValidateVatNumberResult(boolean value) {
        this.validateVatNumberResult = value;
    }

}
