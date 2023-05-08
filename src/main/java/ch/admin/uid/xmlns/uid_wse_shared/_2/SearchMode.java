
package ch.admin.uid.xmlns.uid_wse_shared._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchMode.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="searchMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Auto"/>
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Fuzzy"/>
 *     &lt;enumeration value="FuzzyPerson"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "searchMode")
@XmlEnum
public enum SearchMode {

    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Fuzzy")
    FUZZY("Fuzzy"),
    @XmlEnumValue("FuzzyPerson")
    FUZZY_PERSON("FuzzyPerson");
    private final String value;

    SearchMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchMode fromValue(String v) {
        for (SearchMode c: SearchMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
