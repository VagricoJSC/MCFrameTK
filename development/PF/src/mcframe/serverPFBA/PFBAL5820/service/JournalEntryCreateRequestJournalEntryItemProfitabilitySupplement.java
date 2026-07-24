
package mcframe.serverPFBA.PFBAL5820.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>JournalEntryCreateRequestJournalEntryItemProfitabilitySupplement complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="JournalEntryCreateRequestJournalEntryItemProfitabilitySupplement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Customer" type="{http://sap.com/xi/SAPSCORE/SFIN}Customer" minOccurs="0"/>
 *         &lt;element name="CustomerGroup" type="{http://sap.com/xi/SAPSCORE/SFIN}CustomerGroupCode" minOccurs="0"/>
 *         &lt;element name="CustomerIndustry" type="{http://sap.com/xi/SAPSCORE/SFIN}IndustrialSectorCode" minOccurs="0"/>
 *         &lt;element name="CustomerCountry" type="{http://sap.com/xi/SAPSCORE/SFIN}CountryCode" minOccurs="0"/>
 *         &lt;element name="SalesDistrict" type="{http://sap.com/xi/SAPSCORE/SFIN}SalesDistrict" minOccurs="0"/>
 *         &lt;element name="SoldMaterial" type="{http://sap.com/xi/SAPSCORE/SFIN}Material" minOccurs="0"/>
 *         &lt;element name="SoldMaterialGroup" type="{http://sap.com/xi/SAPSCORE/SFIN}MaterialGroup" minOccurs="0"/>
 *         &lt;element name="SalesOrganization" type="{http://sap.com/xi/SAPSCORE/SFIN}SalesOrganization" minOccurs="0"/>
 *         &lt;element name="DistributionChannel" type="{http://sap.com/xi/SAPSCORE/SFIN}DistributionChannelCode" minOccurs="0"/>
 *         &lt;element name="Division" type="{http://sap.com/xi/SAPSCORE/SFIN}DivisionCode" minOccurs="0"/>
 *         &lt;element name="BillToParty" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessPartnerInternalID" minOccurs="0"/>
 *         &lt;element name="ShipToParty" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessPartnerInternalID" minOccurs="0"/>
 *         &lt;element name="PersonnelNumber" type="{http://sap.com/xi/SAPSCORE/SFIN}PersonnelNumber_GFN" minOccurs="0"/>
 *         &lt;element name="WBSElement" type="{http://sap.com/xi/SAPSCORE/SFIN}WBSElement" minOccurs="0"/>
 *         &lt;element name="FunctionalArea" type="{http://sap.com/xi/SAPSCORE/SFIN}FunctionalArea_GFN" minOccurs="0"/>
 *         &lt;element name="ServiceDocType" type="{http://sap.com/xi/SAPSCORE/SFIN}ServiceDocType_GFN" minOccurs="0"/>
 *         &lt;element name="ServiceDocID" type="{http://sap.com/xi/SAPSCORE/SFIN}ServiceDocID_GFN" minOccurs="0"/>
 *         &lt;element name="ServiceDocItemID" type="{http://sap.com/xi/SAPSCORE/SFIN}ServiceDocItemID_GFN" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryCreateRequestJournalEntryItemProfitabilitySupplement", propOrder = {
    "customer",
    "customerGroup",
    "customerIndustry",
    "customerCountry",
    "salesDistrict",
    "soldMaterial",
    "soldMaterialGroup",
    "salesOrganization",
    "distributionChannel",
    "division",
    "billToParty",
    "shipToParty",
    "personnelNumber",
    "wbsElement",
    "functionalArea",
    "serviceDocType",
    "serviceDocID",
    "serviceDocItemID"
})
public class JournalEntryCreateRequestJournalEntryItemProfitabilitySupplement {

    @XmlElement(name = "Customer")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customer;
    @XmlElement(name = "CustomerGroup")
    protected CustomerGroupCode customerGroup;
    @XmlElement(name = "CustomerIndustry")
    protected IndustrialSectorCode customerIndustry;
    @XmlElement(name = "CustomerCountry")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customerCountry;
    @XmlElement(name = "SalesDistrict")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String salesDistrict;
    @XmlElement(name = "SoldMaterial")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String soldMaterial;
    @XmlElement(name = "SoldMaterialGroup")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String soldMaterialGroup;
    @XmlElement(name = "SalesOrganization")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String salesOrganization;
    @XmlElement(name = "DistributionChannel")
    protected DistributionChannelCode distributionChannel;
    @XmlElement(name = "Division")
    protected DivisionCode division;
    @XmlElement(name = "BillToParty")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String billToParty;
    @XmlElement(name = "ShipToParty")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shipToParty;
    @XmlElement(name = "PersonnelNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String personnelNumber;
    @XmlElement(name = "WBSElement")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String wbsElement;
    @XmlElement(name = "FunctionalArea")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String functionalArea;
    @XmlElement(name = "ServiceDocType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceDocType;
    @XmlElement(name = "ServiceDocID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceDocID;
    @XmlElement(name = "ServiceDocItemID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceDocItemID;

    /**
     * customerプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * customerプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer(String value) {
        this.customer = value;
    }

    /**
     * customerGroupプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link CustomerGroupCode }
     *     
     */
    public CustomerGroupCode getCustomerGroup() {
        return customerGroup;
    }

    /**
     * customerGroupプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerGroupCode }
     *     
     */
    public void setCustomerGroup(CustomerGroupCode value) {
        this.customerGroup = value;
    }

    /**
     * customerIndustryプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link IndustrialSectorCode }
     *     
     */
    public IndustrialSectorCode getCustomerIndustry() {
        return customerIndustry;
    }

    /**
     * customerIndustryプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link IndustrialSectorCode }
     *     
     */
    public void setCustomerIndustry(IndustrialSectorCode value) {
        this.customerIndustry = value;
    }

    /**
     * customerCountryプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCountry() {
        return customerCountry;
    }

    /**
     * customerCountryプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCountry(String value) {
        this.customerCountry = value;
    }

    /**
     * salesDistrictプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesDistrict() {
        return salesDistrict;
    }

    /**
     * salesDistrictプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesDistrict(String value) {
        this.salesDistrict = value;
    }

    /**
     * soldMaterialプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoldMaterial() {
        return soldMaterial;
    }

    /**
     * soldMaterialプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoldMaterial(String value) {
        this.soldMaterial = value;
    }

    /**
     * soldMaterialGroupプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoldMaterialGroup() {
        return soldMaterialGroup;
    }

    /**
     * soldMaterialGroupプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoldMaterialGroup(String value) {
        this.soldMaterialGroup = value;
    }

    /**
     * salesOrganizationプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrganization() {
        return salesOrganization;
    }

    /**
     * salesOrganizationプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrganization(String value) {
        this.salesOrganization = value;
    }

    /**
     * distributionChannelプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link DistributionChannelCode }
     *     
     */
    public DistributionChannelCode getDistributionChannel() {
        return distributionChannel;
    }

    /**
     * distributionChannelプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionChannelCode }
     *     
     */
    public void setDistributionChannel(DistributionChannelCode value) {
        this.distributionChannel = value;
    }

    /**
     * divisionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link DivisionCode }
     *     
     */
    public DivisionCode getDivision() {
        return division;
    }

    /**
     * divisionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link DivisionCode }
     *     
     */
    public void setDivision(DivisionCode value) {
        this.division = value;
    }

    /**
     * billToPartyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToParty() {
        return billToParty;
    }

    /**
     * billToPartyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToParty(String value) {
        this.billToParty = value;
    }

    /**
     * shipToPartyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToParty() {
        return shipToParty;
    }

    /**
     * shipToPartyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToParty(String value) {
        this.shipToParty = value;
    }

    /**
     * personnelNumberプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonnelNumber() {
        return personnelNumber;
    }

    /**
     * personnelNumberプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonnelNumber(String value) {
        this.personnelNumber = value;
    }

    /**
     * wbsElementプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWBSElement() {
        return wbsElement;
    }

    /**
     * wbsElementプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWBSElement(String value) {
        this.wbsElement = value;
    }

    /**
     * functionalAreaプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionalArea() {
        return functionalArea;
    }

    /**
     * functionalAreaプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionalArea(String value) {
        this.functionalArea = value;
    }

    /**
     * serviceDocTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDocType() {
        return serviceDocType;
    }

    /**
     * serviceDocTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDocType(String value) {
        this.serviceDocType = value;
    }

    /**
     * serviceDocIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDocID() {
        return serviceDocID;
    }

    /**
     * serviceDocIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDocID(String value) {
        this.serviceDocID = value;
    }

    /**
     * serviceDocItemIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDocItemID() {
        return serviceDocItemID;
    }

    /**
     * serviceDocItemIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDocItemID(String value) {
        this.serviceDocItemID = value;
    }

}
