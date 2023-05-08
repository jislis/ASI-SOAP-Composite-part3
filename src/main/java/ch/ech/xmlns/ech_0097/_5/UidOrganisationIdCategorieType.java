
package ch.ech.xmlns.ech_0097._5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour uidOrganisationIdCategorieType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="uidOrganisationIdCategorieType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CHE"/>
 *     &lt;enumeration value="ADM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "uidOrganisationIdCategorieType")
@XmlEnum
public enum UidOrganisationIdCategorieType {

    CHE,
    ADM;

    public String value() {
        return name();
    }

    public static UidOrganisationIdCategorieType fromValue(String v) {
        return valueOf(v);
    }

}
