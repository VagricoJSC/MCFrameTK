
package mcframe.serverPFBA.PFBAL5820.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>JournalEntryCreateRequestJournalEntryItemAccountAssignment complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="JournalEntryCreateRequestJournalEntryItemAccountAssignment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountAssignmentType" type="{http://sap.com/xi/SAPSCORE/SFIN}AccountAssignmentType" minOccurs="0"/>
 *         &lt;element name="OrderID" type="{http://sap.com/xi/SAPSCORE/SFIN}OrderID_GFN" minOccurs="0"/>
 *         &lt;element name="ProfitCenter" type="{http://sap.com/xi/SAPSCORE/SFIN}ProfitCentreID" minOccurs="0"/>
 *         &lt;element name="PartnerProfitCenter" type="{http://sap.com/xi/SAPSCORE/SFIN}ProfitCentreID" minOccurs="0"/>
 *         &lt;element name="Segment" type="{http://sap.com/xi/SAPSCORE/SFIN}SegmentID" minOccurs="0"/>
 *         &lt;element name="PartnerSegment" type="{http://sap.com/xi/SAPSCORE/SFIN}SegmentID" minOccurs="0"/>
 *         &lt;element name="CostCenter" type="{http://sap.com/xi/SAPSCORE/SFIN}CostCentreID" minOccurs="0"/>
 *         &lt;element name="CostCtrActivityType" type="{http://sap.com/xi/SAPSCORE/SFIN}ResourceClassID" minOccurs="0"/>
 *         &lt;element name="WBSElement" type="{http://sap.com/xi/SAPSCORE/SFIN}WBSElement" minOccurs="0"/>
 *         &lt;element name="MasterFixedAsset" type="{http://sap.com/xi/SAPSCORE/SFIN}MasterFixedAssetID" minOccurs="0"/>
 *         &lt;element name="WorkItem" type="{http://sap.com/xi/SAPSCORE/SFIN}WorkItem_GFN" minOccurs="0"/>
 *         &lt;element name="FixedAsset" type="{http://sap.com/xi/SAPSCORE/SFIN}FixedAssetID" minOccurs="0"/>
 *         &lt;element name="SalesOrder" type="{http://sap.com/xi/SAPSCORE/SFIN}SalesOrder" minOccurs="0"/>
 *         &lt;element name="SalesOrderItem" type="{http://sap.com/xi/SAPSCORE/SFIN}SalesOrderItem" minOccurs="0"/>
 *         &lt;element name="FunctionalArea" type="{http://sap.com/xi/SAPSCORE/SFIN}FunctionalArea_GFN" minOccurs="0"/>
 *         &lt;element name="ServiceDocType" type="{http://sap.com/xi/SAPSCORE/SFIN}ServiceDocType_GFN" minOccurs="0"/>
 *         &lt;element name="ServiceDocID" type="{http://sap.com/xi/SAPSCORE/SFIN}ServiceDocID_GFN" minOccurs="0"/>
 *         &lt;element name="ServiceDocItemID" type="{http://sap.com/xi/SAPSCORE/SFIN}ServiceDocItemID_GFN" minOccurs="0"/>
 *         &lt;element name="JointVenture" type="{http://sap.com/xi/SAPSCORE/SFIN}JointVenture" minOccurs="0"/>
 *         &lt;element name="JointVentureRecoveryCode" type="{http://sap.com/xi/SAPSCORE/SFIN}JointVentureRecoveryCode_GFN" minOccurs="0"/>
 *         &lt;element name="JointVentureEquityGroup" type="{http://sap.com/xi/SAPSCORE/SFIN}JointVentureEquityGroup" minOccurs="0"/>
 *         &lt;element name="Fund" type="{http://sap.com/xi/SAPSCORE/SFIN}Fund_GFN" minOccurs="0"/>
 *         &lt;element name="Grant" type="{http://sap.com/xi/SAPSCORE/SFIN}Grant_GFN" minOccurs="0"/>
 *         &lt;element name="CustomerGroup" type="{http://sap.com/xi/SAPSCORE/SFIN}CustomerGroupCode" minOccurs="0"/>
 *         &lt;element name="CustomerCountry" type="{http://sap.com/xi/SAPSCORE/SFIN}CountryCode" minOccurs="0"/>
 *         &lt;element name="CustomerIndustry" type="{http://sap.com/xi/SAPSCORE/SFIN}IndustrialSectorCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryCreateRequestJournalEntryItemAccountAssignment", propOrder = {
    "accountAssignmentType",
    "orderID",
    "profitCenter",
    "partnerProfitCenter",
    "segment",
    "partnerSegment",
    "costCenter",
    "costCtrActivityType",
    "wbsElement",
    "masterFixedAsset",
    "workItem",
    "fixedAsset",
    "salesOrder",
    "salesOrderItem",
    "functionalArea",
    "serviceDocType",
    "serviceDocID",
    "serviceDocItemID",
    "jointVenture",
    "jointVentureRecoveryCode",
    "jointVentureEquityGroup",
    "fund",
    "grant",
    "customerGroup",
    "customerCountry",
    "customerIndustry"
})
public class JournalEntryCreateRequestJournalEntryItemAccountAssignment {

    @XmlElement(name = "AccountAssignmentType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String accountAssignmentType;
    @XmlElement(name = "OrderID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderID;
    @XmlElement(name = "ProfitCenter")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String profitCenter;
    @XmlElement(name = "PartnerProfitCenter")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String partnerProfitCenter;
    @XmlElement(name = "Segment")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String segment;
    @XmlElement(name = "PartnerSegment")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String partnerSegment;
    @XmlElement(name = "CostCenter")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String costCenter;
    @XmlElement(name = "CostCtrActivityType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String costCtrActivityType;
    @XmlElement(name = "WBSElement")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String wbsElement;
    @XmlElement(name = "MasterFixedAsset")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String masterFixedAsset;
    @XmlElement(name = "WorkItem")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String workItem;
    @XmlElement(name = "FixedAsset")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fixedAsset;
    @XmlElement(name = "SalesOrder")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String salesOrder;
    @XmlElement(name = "SalesOrderItem")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String salesOrderItem;
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
    @XmlElement(name = "JointVenture")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String jointVenture;
    @XmlElement(name = "JointVentureRecoveryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String jointVentureRecoveryCode;
    @XmlElement(name = "JointVentureEquityGroup")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String jointVentureEquityGroup;
    @XmlElement(name = "Fund")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fund;
    @XmlElement(name = "Grant")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String grant;
    @XmlElement(name = "CustomerGroup")
    protected CustomerGroupCode customerGroup;
    @XmlElement(name = "CustomerCountry")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customerCountry;
    @XmlElement(name = "CustomerIndustry")
    protected IndustrialSectorCode customerIndustry;

    /**
     * accountAssignmentTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountAssignmentType() {
        return accountAssignmentType;
    }

    /**
     * accountAssignmentTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountAssignmentType(String value) {
        this.accountAssignmentType = value;
    }

    /**
     * orderIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * orderIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * profitCenterプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitCenter() {
        return profitCenter;
    }

    /**
     * profitCenterプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitCenter(String value) {
        this.profitCenter = value;
    }

    /**
     * partnerProfitCenterプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerProfitCenter() {
        return partnerProfitCenter;
    }

    /**
     * partnerProfitCenterプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerProfitCenter(String value) {
        this.partnerProfitCenter = value;
    }

    /**
     * segmentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment() {
        return segment;
    }

    /**
     * segmentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment(String value) {
        this.segment = value;
    }

    /**
     * partnerSegmentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerSegment() {
        return partnerSegment;
    }

    /**
     * partnerSegmentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerSegment(String value) {
        this.partnerSegment = value;
    }

    /**
     * costCenterプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * costCenterプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenter(String value) {
        this.costCenter = value;
    }

    /**
     * costCtrActivityTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCtrActivityType() {
        return costCtrActivityType;
    }

    /**
     * costCtrActivityTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCtrActivityType(String value) {
        this.costCtrActivityType = value;
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
     * masterFixedAssetプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterFixedAsset() {
        return masterFixedAsset;
    }

    /**
     * masterFixedAssetプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterFixedAsset(String value) {
        this.masterFixedAsset = value;
    }

    /**
     * workItemプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkItem() {
        return workItem;
    }

    /**
     * workItemプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkItem(String value) {
        this.workItem = value;
    }

    /**
     * fixedAssetプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedAsset() {
        return fixedAsset;
    }

    /**
     * fixedAssetプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedAsset(String value) {
        this.fixedAsset = value;
    }

    /**
     * salesOrderプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrder() {
        return salesOrder;
    }

    /**
     * salesOrderプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrder(String value) {
        this.salesOrder = value;
    }

    /**
     * salesOrderItemプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrderItem() {
        return salesOrderItem;
    }

    /**
     * salesOrderItemプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrderItem(String value) {
        this.salesOrderItem = value;
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

    /**
     * jointVentureプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJointVenture() {
        return jointVenture;
    }

    /**
     * jointVentureプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJointVenture(String value) {
        this.jointVenture = value;
    }

    /**
     * jointVentureRecoveryCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJointVentureRecoveryCode() {
        return jointVentureRecoveryCode;
    }

    /**
     * jointVentureRecoveryCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJointVentureRecoveryCode(String value) {
        this.jointVentureRecoveryCode = value;
    }

    /**
     * jointVentureEquityGroupプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJointVentureEquityGroup() {
        return jointVentureEquityGroup;
    }

    /**
     * jointVentureEquityGroupプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJointVentureEquityGroup(String value) {
        this.jointVentureEquityGroup = value;
    }

    /**
     * fundプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFund() {
        return fund;
    }

    /**
     * fundプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFund(String value) {
        this.fund = value;
    }

    /**
     * grantプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrant() {
        return grant;
    }

    /**
     * grantプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrant(String value) {
        this.grant = value;
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

}
