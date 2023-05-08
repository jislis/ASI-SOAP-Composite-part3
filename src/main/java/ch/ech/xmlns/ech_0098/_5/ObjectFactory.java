
package ch.ech.xmlns.ech_0098._5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import ch.ech.xmlns.ech_0007._6.CantonAbbreviationType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.ech.xmlns.ech_0098._5 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OrganisationAddressTypeMunicipalityId_QNAME = new QName("http://www.ech.ch/xmlns/eCH-0098/5", "municipalityId");
    private final static QName _OrganisationAddressTypeSwissZipCode_QNAME = new QName("http://www.ech.ch/xmlns/eCH-0098/5", "swissZipCode");
    private final static QName _OrganisationAddressTypeCantonAbbreviation_QNAME = new QName("http://www.ech.ch/xmlns/eCH-0098/5", "cantonAbbreviation");
    private final static QName _OrganisationAddressTypeSwissZipCodeAddOn_QNAME = new QName("http://www.ech.ch/xmlns/eCH-0098/5", "swissZipCodeAddOn");
    private final static QName _OrganisationAddressTypeForeignZipCode_QNAME = new QName("http://www.ech.ch/xmlns/eCH-0098/5", "foreignZipCode");
    private final static QName _OrganisationAddressTypeEGID_QNAME = new QName("http://www.ech.ch/xmlns/eCH-0098/5", "EGID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.ech.xmlns.ech_0098._5
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DatePartiallyKnownType }
     * 
     */
    public DatePartiallyKnownType createDatePartiallyKnownType() {
        return new DatePartiallyKnownType();
    }

    /**
     * Create an instance of {@link LiquidationType }
     * 
     */
    public LiquidationType createLiquidationType() {
        return new LiquidationType();
    }

    /**
     * Create an instance of {@link OrganisationAddressType }
     * 
     */
    public OrganisationAddressType createOrganisationAddressType() {
        return new OrganisationAddressType();
    }

    /**
     * Create an instance of {@link FoundationType }
     * 
     */
    public FoundationType createFoundationType() {
        return new FoundationType();
    }

    /**
     * Create an instance of {@link OrganisationType }
     * 
     */
    public OrganisationType createOrganisationType() {
        return new OrganisationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ech.ch/xmlns/eCH-0098/5", name = "municipalityId", scope = OrganisationAddressType.class)
    public JAXBElement<Integer> createOrganisationAddressTypeMunicipalityId(Integer value) {
        return new JAXBElement<Integer>(_OrganisationAddressTypeMunicipalityId_QNAME, Integer.class, OrganisationAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ech.ch/xmlns/eCH-0098/5", name = "swissZipCode", scope = OrganisationAddressType.class)
    public JAXBElement<Long> createOrganisationAddressTypeSwissZipCode(Long value) {
        return new JAXBElement<Long>(_OrganisationAddressTypeSwissZipCode_QNAME, Long.class, OrganisationAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CantonAbbreviationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ech.ch/xmlns/eCH-0098/5", name = "cantonAbbreviation", scope = OrganisationAddressType.class)
    public JAXBElement<CantonAbbreviationType> createOrganisationAddressTypeCantonAbbreviation(CantonAbbreviationType value) {
        return new JAXBElement<CantonAbbreviationType>(_OrganisationAddressTypeCantonAbbreviation_QNAME, CantonAbbreviationType.class, OrganisationAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ech.ch/xmlns/eCH-0098/5", name = "swissZipCodeAddOn", scope = OrganisationAddressType.class)
    public JAXBElement<String> createOrganisationAddressTypeSwissZipCodeAddOn(String value) {
        return new JAXBElement<String>(_OrganisationAddressTypeSwissZipCodeAddOn_QNAME, String.class, OrganisationAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ech.ch/xmlns/eCH-0098/5", name = "foreignZipCode", scope = OrganisationAddressType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOrganisationAddressTypeForeignZipCode(String value) {
        return new JAXBElement<String>(_OrganisationAddressTypeForeignZipCode_QNAME, String.class, OrganisationAddressType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ech.ch/xmlns/eCH-0098/5", name = "EGID", scope = OrganisationAddressType.class)
    public JAXBElement<Long> createOrganisationAddressTypeEGID(Long value) {
        return new JAXBElement<Long>(_OrganisationAddressTypeEGID_QNAME, Long.class, OrganisationAddressType.class, value);
    }

}
