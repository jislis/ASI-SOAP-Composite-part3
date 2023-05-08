
package ch.admin.uid.xmlns.uid_wse._5;

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
 * generated in the ch.admin.uid.xmlns.uid_wse._5 package. 
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

    private final static QName _AddressSearchTypeSwissZipCode_QNAME = new QName("http://www.uid.admin.ch/xmlns/uid-wse/5", "swissZipCode");
    private final static QName _AddressSearchTypeMunicipalityId_QNAME = new QName("http://www.uid.admin.ch/xmlns/uid-wse/5", "municipalityId");
    private final static QName _AddressSearchTypeSwissZipCodeAddOn_QNAME = new QName("http://www.uid.admin.ch/xmlns/uid-wse/5", "swissZipCodeAddOn");
    private final static QName _AddressSearchTypeCantonAbbreviation_QNAME = new QName("http://www.uid.admin.ch/xmlns/uid-wse/5", "cantonAbbreviation");
    private final static QName _AddressSearchTypeEGID_QNAME = new QName("http://www.uid.admin.ch/xmlns/uid-wse/5", "EGID");
    private final static QName _AddressSearchTypeForeignZipCode_QNAME = new QName("http://www.uid.admin.ch/xmlns/uid-wse/5", "foreignZipCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.admin.uid.xmlns.uid_wse._5
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UidEntitySearchResponse }
     * 
     */
    public UidEntitySearchResponse createUidEntitySearchResponse() {
        return new UidEntitySearchResponse();
    }

    /**
     * Create an instance of {@link UidEntityPublicSearchRequest }
     * 
     */
    public UidEntityPublicSearchRequest createUidEntityPublicSearchRequest() {
        return new UidEntityPublicSearchRequest();
    }

    /**
     * Create an instance of {@link UidregInformationPublicSearchType }
     * 
     */
    public UidregInformationPublicSearchType createUidregInformationPublicSearchType() {
        return new UidregInformationPublicSearchType();
    }

    /**
     * Create an instance of {@link DuplicateFault }
     * 
     */
    public DuplicateFault createDuplicateFault() {
        return new DuplicateFault();
    }

    /**
     * Create an instance of {@link AddressSearchType }
     * 
     */
    public AddressSearchType createAddressSearchType() {
        return new AddressSearchType();
    }

    /**
     * Create an instance of {@link UidEntitySearchResultItem }
     * 
     */
    public UidEntitySearchResultItem createUidEntitySearchResultItem() {
        return new UidEntitySearchResultItem();
    }

    /**
     * Create an instance of {@link VatRegisterInformationSearchType }
     * 
     */
    public VatRegisterInformationSearchType createVatRegisterInformationSearchType() {
        return new VatRegisterInformationSearchType();
    }

    /**
     * Create an instance of {@link UidEntityPublicSearchParameters }
     * 
     */
    public UidEntityPublicSearchParameters createUidEntityPublicSearchParameters() {
        return new UidEntityPublicSearchParameters();
    }

    /**
     * Create an instance of {@link CommercialRegisterInformationSearchType }
     * 
     */
    public CommercialRegisterInformationSearchType createCommercialRegisterInformationSearchType() {
        return new CommercialRegisterInformationSearchType();
    }

    /**
     * Create an instance of {@link DuplicateCandidateType }
     * 
     */
    public DuplicateCandidateType createDuplicateCandidateType() {
        return new DuplicateCandidateType();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.uid.admin.ch/xmlns/uid-wse/5", name = "swissZipCode", scope = AddressSearchType.class)
    public JAXBElement<Long> createAddressSearchTypeSwissZipCode(Long value) {
        return new JAXBElement<Long>(_AddressSearchTypeSwissZipCode_QNAME, Long.class, AddressSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.uid.admin.ch/xmlns/uid-wse/5", name = "municipalityId", scope = AddressSearchType.class)
    public JAXBElement<Integer> createAddressSearchTypeMunicipalityId(Integer value) {
        return new JAXBElement<Integer>(_AddressSearchTypeMunicipalityId_QNAME, Integer.class, AddressSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.uid.admin.ch/xmlns/uid-wse/5", name = "swissZipCodeAddOn", scope = AddressSearchType.class)
    public JAXBElement<String> createAddressSearchTypeSwissZipCodeAddOn(String value) {
        return new JAXBElement<String>(_AddressSearchTypeSwissZipCodeAddOn_QNAME, String.class, AddressSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CantonAbbreviationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.uid.admin.ch/xmlns/uid-wse/5", name = "cantonAbbreviation", scope = AddressSearchType.class)
    public JAXBElement<CantonAbbreviationType> createAddressSearchTypeCantonAbbreviation(CantonAbbreviationType value) {
        return new JAXBElement<CantonAbbreviationType>(_AddressSearchTypeCantonAbbreviation_QNAME, CantonAbbreviationType.class, AddressSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.uid.admin.ch/xmlns/uid-wse/5", name = "EGID", scope = AddressSearchType.class)
    public JAXBElement<Long> createAddressSearchTypeEGID(Long value) {
        return new JAXBElement<Long>(_AddressSearchTypeEGID_QNAME, Long.class, AddressSearchType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.uid.admin.ch/xmlns/uid-wse/5", name = "foreignZipCode", scope = AddressSearchType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAddressSearchTypeForeignZipCode(String value) {
        return new JAXBElement<String>(_AddressSearchTypeForeignZipCode_QNAME, String.class, AddressSearchType.class, value);
    }

}
