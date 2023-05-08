
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
 *         &lt;element name="ValidateUIDResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "validateUIDResult"
})
@XmlRootElement(name = "ValidateUIDResponse")
public class ValidateUIDResponse {

    @XmlElement(name = "ValidateUIDResult")
    protected boolean validateUIDResult;

    /**
     * Obtient la valeur de la propriété validateUIDResult.
     * 
     */
    public boolean isValidateUIDResult() {
        return validateUIDResult;
    }

    /**
     * Définit la valeur de la propriété validateUIDResult.
     * 
     */
    public void setValidateUIDResult(boolean value) {
        this.validateUIDResult = value;
    }

}
