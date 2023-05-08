
package ch.admin.uid.xmlns.uid_wse._5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ch.admin.uid.xmlns.uid_wse_shared._2.ServiceFault;


/**
 * <p>Classe Java pour duplicateFault complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="duplicateFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.uid.admin.ch/xmlns/uid-wse-shared/2}serviceFault">
 *       &lt;sequence>
 *         &lt;element name="candidates" type="{http://www.uid.admin.ch/xmlns/uid-wse/5}duplicateCandidateType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="duplicateOverrideCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "duplicateFault", propOrder = {
    "candidates",
    "duplicateOverrideCode"
})
public class DuplicateFault
    extends ServiceFault
{

    protected List<DuplicateCandidateType> candidates;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String duplicateOverrideCode;

    /**
     * Gets the value of the candidates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the candidates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCandidates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DuplicateCandidateType }
     * 
     * 
     */
    public List<DuplicateCandidateType> getCandidates() {
        if (candidates == null) {
            candidates = new ArrayList<DuplicateCandidateType>();
        }
        return this.candidates;
    }

    /**
     * Obtient la valeur de la propriété duplicateOverrideCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuplicateOverrideCode() {
        return duplicateOverrideCode;
    }

    /**
     * Définit la valeur de la propriété duplicateOverrideCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuplicateOverrideCode(String value) {
        this.duplicateOverrideCode = value;
    }

}
