
package ch.ech.xmlns.ech_0108._5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour organisationMembershipRoleType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="organisationMembershipRoleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GroupHead"/>
 *     &lt;enumeration value="GroupMember"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "organisationMembershipRoleType")
@XmlEnum
public enum OrganisationMembershipRoleType {

    @XmlEnumValue("GroupHead")
    GROUP_HEAD("GroupHead"),
    @XmlEnumValue("GroupMember")
    GROUP_MEMBER("GroupMember");
    private final String value;

    OrganisationMembershipRoleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrganisationMembershipRoleType fromValue(String v) {
        for (OrganisationMembershipRoleType c: OrganisationMembershipRoleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
