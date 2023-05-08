
package ch.ech.xmlns.ech_0108._5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ch.ech.xmlns.ech_0097._5.UidStructureType;


/**
 * <p>Classe Java pour groupRelationshipType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="groupRelationshipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="organisationMembershipRole" type="{http://www.ech.ch/xmlns/eCH-0108/5}organisationMembershipRoleType"/>
 *         &lt;element name="groupParticipant" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="participant" type="{http://www.ech.ch/xmlns/eCH-0097/5}uidStructureType" minOccurs="0"/>
 *                   &lt;element name="participantRole" type="{http://www.ech.ch/xmlns/eCH-0108/5}organisationMembershipRoleType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "groupRelationshipType", propOrder = {
    "groupName",
    "organisationMembershipRole",
    "groupParticipant"
})
public class GroupRelationshipType {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String groupName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OrganisationMembershipRoleType organisationMembershipRole;
    protected List<GroupParticipant> groupParticipant;

    /**
     * Obtient la valeur de la propri�t� groupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * D�finit la valeur de la propri�t� groupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Obtient la valeur de la propri�t� organisationMembershipRole.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationMembershipRoleType }
     *     
     */
    public OrganisationMembershipRoleType getOrganisationMembershipRole() {
        return organisationMembershipRole;
    }

    /**
     * D�finit la valeur de la propri�t� organisationMembershipRole.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationMembershipRoleType }
     *     
     */
    public void setOrganisationMembershipRole(OrganisationMembershipRoleType value) {
        this.organisationMembershipRole = value;
    }

    /**
     * Gets the value of the groupParticipant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupParticipant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupParticipant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupParticipant }
     * 
     * 
     */
    public List<GroupParticipant> getGroupParticipant() {
        if (groupParticipant == null) {
            groupParticipant = new ArrayList<GroupParticipant>();
        }
        return this.groupParticipant;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="participant" type="{http://www.ech.ch/xmlns/eCH-0097/5}uidStructureType" minOccurs="0"/>
     *         &lt;element name="participantRole" type="{http://www.ech.ch/xmlns/eCH-0108/5}organisationMembershipRoleType" minOccurs="0"/>
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
        "participant",
        "participantRole"
    })
    public static class GroupParticipant {

        protected UidStructureType participant;
        @XmlSchemaType(name = "string")
        protected OrganisationMembershipRoleType participantRole;

        /**
         * Obtient la valeur de la propri�t� participant.
         * 
         * @return
         *     possible object is
         *     {@link UidStructureType }
         *     
         */
        public UidStructureType getParticipant() {
            return participant;
        }

        /**
         * D�finit la valeur de la propri�t� participant.
         * 
         * @param value
         *     allowed object is
         *     {@link UidStructureType }
         *     
         */
        public void setParticipant(UidStructureType value) {
            this.participant = value;
        }

        /**
         * Obtient la valeur de la propri�t� participantRole.
         * 
         * @return
         *     possible object is
         *     {@link OrganisationMembershipRoleType }
         *     
         */
        public OrganisationMembershipRoleType getParticipantRole() {
            return participantRole;
        }

        /**
         * D�finit la valeur de la propri�t� participantRole.
         * 
         * @param value
         *     allowed object is
         *     {@link OrganisationMembershipRoleType }
         *     
         */
        public void setParticipantRole(OrganisationMembershipRoleType value) {
            this.participantRole = value;
        }

    }

}
