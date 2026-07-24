
package mcframe.serverPFBA.PFBAL5820.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>JournalEntryCreateRequestJournalEntryItem complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="JournalEntryCreateRequestJournalEntryItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceDocumentItem" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessTransactionDocumentItemID" minOccurs="0"/>
 *         &lt;element name="ItemGroup" type="{http://sap.com/xi/SAPSCORE/SFIN}ItemGroup" minOccurs="0"/>
 *         &lt;element name="CompanyCode" type="{http://sap.com/xi/SAPSCORE/SFIN}CompanyCodeID" minOccurs="0"/>
 *         &lt;element name="GLAccount" type="{http://sap.com/xi/SAPSCORE/SFIN}ChartOfAccountsItemCode"/>
 *         &lt;element name="AmountInTransactionCurrency" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount"/>
 *         &lt;element name="AmountInCompanyCodeCurrency" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="AmountInGroupCurrency" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="AmountInFreeDefinedCurrency1" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="DebitCreditCode" type="{http://sap.com/xi/SAPSCORE/SFIN}DebitCreditCode" minOccurs="0"/>
 *         &lt;element name="DocumentItemText" type="{http://sap.com/xi/SAPSCORE/SFIN}DocumentItemText" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://sap.com/xi/SAPSCORE/SFIN}ReasonCode" minOccurs="0"/>
 *         &lt;element name="OplAcctgDocItmCntrySpcfcRef1" type="{http://sap.com/xi/SAPSCORE/SFIN}OplAcctgDocItmCntrySpcfcRef1" minOccurs="0"/>
 *         &lt;element name="AssignmentReference" type="{http://sap.com/xi/SAPSCORE/SFIN}AssignmentReference" minOccurs="0"/>
 *         &lt;element name="FinancialTransactionType" type="{http://sap.com/xi/SAPSCORE/SFIN}FinancialTransactionTypeCode" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://sap.com/xi/SAPSCORE/SFIN}JournalEntryCreateRequestJournalEntryTaxDetails" minOccurs="0"/>
 *         &lt;element name="Plant" type="{http://sap.com/xi/SAPSCORE/SFIN}PlantID" minOccurs="0"/>
 *         &lt;element name="Material" type="{http://sap.com/xi/SAPSCORE/SFIN}ProductID" minOccurs="0"/>
 *         &lt;element name="QuantityInEntryUnit" type="{http://sap.com/xi/SAPSCORE/SFIN}Quantity" minOccurs="0"/>
 *         &lt;element name="IsNotCashDiscountLiable" type="{http://sap.com/xi/SAPSCORE/SFIN}Indicator" minOccurs="0"/>
 *         &lt;element name="TradingPartner" type="{http://sap.com/xi/SAPSCORE/SFIN}TradingPartnerID" minOccurs="0"/>
 *         &lt;element name="ValueDate" type="{http://sap.com/xi/SAPSCORE/SFIN}Date" minOccurs="0"/>
 *         &lt;element name="BusinessPlace" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessArea_GFN" minOccurs="0"/>
 *         &lt;element name="HouseBank" type="{http://sap.com/xi/SAPSCORE/SFIN}HouseBank_GFN" minOccurs="0"/>
 *         &lt;element name="HouseBankAccount" type="{http://sap.com/xi/SAPSCORE/SFIN}HouseBankAccountID" minOccurs="0"/>
 *         &lt;element name="FinancialServicesProductGroup" type="{http://sap.com/xi/SAPSCORE/SFIN}FinancialServicesProductGroup" minOccurs="0"/>
 *         &lt;element name="FinancialServicesBranch" type="{http://sap.com/xi/SAPSCORE/SFIN}FinancialServicesBranchID" minOccurs="0"/>
 *         &lt;element name="FinancialDataSource" type="{http://sap.com/xi/SAPSCORE/SFIN}FinancialServicesDataSource" minOccurs="0"/>
 *         &lt;element name="Reference1IDByBusinessPartner" type="{http://sap.com/xi/SAPSCORE/SFIN}ReferenceKey" minOccurs="0"/>
 *         &lt;element name="Reference2IDByBusinessPartner" type="{http://sap.com/xi/SAPSCORE/SFIN}ReferenceKey" minOccurs="0"/>
 *         &lt;element name="Reference3IDByBusinessPartner" type="{http://sap.com/xi/SAPSCORE/SFIN}ReferenceKey_3" minOccurs="0"/>
 *         &lt;element name="AccountAssignment" type="{http://sap.com/xi/SAPSCORE/SFIN}JournalEntryCreateRequestJournalEntryItemAccountAssignment" minOccurs="0"/>
 *         &lt;element name="ProfitabilitySupplement" type="{http://sap.com/xi/SAPSCORE/SFIN}JournalEntryCreateRequestJournalEntryItemProfitabilitySupplement" minOccurs="0"/>
 *         &lt;element name="AdditionalAttributes" type="{http://sap.com/xi/SAPSCORE/SFIN}JournalEntryCreateRequestJournalEntryItemAdditionalAttributes" minOccurs="0"/>
 *         &lt;element name="BillableControl" type="{http://sap.com/xi/SAPSCORE/SFIN}BillableControl_GFN" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryCreateRequestJournalEntryItem", propOrder = {
    "referenceDocumentItem",
    "itemGroup",
    "companyCode",
    "glAccount",
    "amountInTransactionCurrency",
    "amountInCompanyCodeCurrency",
    "amountInGroupCurrency",
    "amountInFreeDefinedCurrency1",
    "debitCreditCode",
    "documentItemText",
    "reasonCode",
    "oplAcctgDocItmCntrySpcfcRef1",
    "assignmentReference",
    "financialTransactionType",
    "tax",
    "plant",
    "material",
    "quantityInEntryUnit",
    "isNotCashDiscountLiable",
    "tradingPartner",
    "valueDate",
    "businessPlace",
    "houseBank",
    "houseBankAccount",
    "financialServicesProductGroup",
    "financialServicesBranch",
    "financialDataSource",
    "reference1IDByBusinessPartner",
    "reference2IDByBusinessPartner",
    "reference3IDByBusinessPartner",
    "accountAssignment",
    "profitabilitySupplement",
    "additionalAttributes",
    "billableControl"
})
public class JournalEntryCreateRequestJournalEntryItem {

    @XmlElement(name = "ReferenceDocumentItem")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceDocumentItem;
    @XmlElement(name = "ItemGroup")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String itemGroup;
    @XmlElement(name = "CompanyCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyCode;
    @XmlElement(name = "GLAccount", required = true)
    protected ChartOfAccountsItemCode glAccount;
    @XmlElement(name = "AmountInTransactionCurrency", required = true)
    protected Amount amountInTransactionCurrency;
    @XmlElement(name = "AmountInCompanyCodeCurrency")
    protected Amount amountInCompanyCodeCurrency;
    @XmlElement(name = "AmountInGroupCurrency")
    protected Amount amountInGroupCurrency;
    @XmlElement(name = "AmountInFreeDefinedCurrency1")
    protected Amount amountInFreeDefinedCurrency1;
    @XmlElement(name = "DebitCreditCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String debitCreditCode;
    @XmlElement(name = "DocumentItemText")
    protected String documentItemText;
    @XmlElement(name = "ReasonCode")
    protected String reasonCode;
    @XmlElement(name = "OplAcctgDocItmCntrySpcfcRef1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String oplAcctgDocItmCntrySpcfcRef1;
    @XmlElement(name = "AssignmentReference")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String assignmentReference;
    @XmlElement(name = "FinancialTransactionType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String financialTransactionType;
    @XmlElement(name = "Tax")
    protected JournalEntryCreateRequestJournalEntryTaxDetails tax;
    @XmlElement(name = "Plant")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String plant;
    @XmlElement(name = "Material")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String material;
    @XmlElement(name = "QuantityInEntryUnit")
    protected Quantity quantityInEntryUnit;
    @XmlElement(name = "IsNotCashDiscountLiable")
    protected Boolean isNotCashDiscountLiable;
    @XmlElement(name = "TradingPartner")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tradingPartner;
    @XmlElement(name = "ValueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valueDate;
    @XmlElement(name = "BusinessPlace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessPlace;
    @XmlElement(name = "HouseBank")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String houseBank;
    @XmlElement(name = "HouseBankAccount")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String houseBankAccount;
    @XmlElement(name = "FinancialServicesProductGroup")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String financialServicesProductGroup;
    @XmlElement(name = "FinancialServicesBranch")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String financialServicesBranch;
    @XmlElement(name = "FinancialDataSource")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String financialDataSource;
    @XmlElement(name = "Reference1IDByBusinessPartner")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reference1IDByBusinessPartner;
    @XmlElement(name = "Reference2IDByBusinessPartner")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reference2IDByBusinessPartner;
    @XmlElement(name = "Reference3IDByBusinessPartner")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reference3IDByBusinessPartner;
    @XmlElement(name = "AccountAssignment")
    protected JournalEntryCreateRequestJournalEntryItemAccountAssignment accountAssignment;
    @XmlElement(name = "ProfitabilitySupplement")
    protected JournalEntryCreateRequestJournalEntryItemProfitabilitySupplement profitabilitySupplement;
    @XmlElement(name = "AdditionalAttributes")
    protected JournalEntryCreateRequestJournalEntryItemAdditionalAttributes additionalAttributes;
    @XmlElement(name = "BillableControl")
    protected String billableControl;

    /**
     * referenceDocumentItemプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDocumentItem() {
        return referenceDocumentItem;
    }

    /**
     * referenceDocumentItemプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDocumentItem(String value) {
        this.referenceDocumentItem = value;
    }

    /**
     * itemGroupプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemGroup() {
        return itemGroup;
    }

    /**
     * itemGroupプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemGroup(String value) {
        this.itemGroup = value;
    }

    /**
     * companyCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * companyCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * glAccountプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ChartOfAccountsItemCode }
     *     
     */
    public ChartOfAccountsItemCode getGLAccount() {
        return glAccount;
    }

    /**
     * glAccountプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ChartOfAccountsItemCode }
     *     
     */
    public void setGLAccount(ChartOfAccountsItemCode value) {
        this.glAccount = value;
    }

    /**
     * amountInTransactionCurrencyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAmountInTransactionCurrency() {
        return amountInTransactionCurrency;
    }

    /**
     * amountInTransactionCurrencyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAmountInTransactionCurrency(Amount value) {
        this.amountInTransactionCurrency = value;
    }

    /**
     * amountInCompanyCodeCurrencyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAmountInCompanyCodeCurrency() {
        return amountInCompanyCodeCurrency;
    }

    /**
     * amountInCompanyCodeCurrencyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAmountInCompanyCodeCurrency(Amount value) {
        this.amountInCompanyCodeCurrency = value;
    }

    /**
     * amountInGroupCurrencyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAmountInGroupCurrency() {
        return amountInGroupCurrency;
    }

    /**
     * amountInGroupCurrencyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAmountInGroupCurrency(Amount value) {
        this.amountInGroupCurrency = value;
    }

    /**
     * amountInFreeDefinedCurrency1プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAmountInFreeDefinedCurrency1() {
        return amountInFreeDefinedCurrency1;
    }

    /**
     * amountInFreeDefinedCurrency1プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAmountInFreeDefinedCurrency1(Amount value) {
        this.amountInFreeDefinedCurrency1 = value;
    }

    /**
     * debitCreditCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitCreditCode() {
        return debitCreditCode;
    }

    /**
     * debitCreditCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitCreditCode(String value) {
        this.debitCreditCode = value;
    }

    /**
     * documentItemTextプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentItemText() {
        return documentItemText;
    }

    /**
     * documentItemTextプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentItemText(String value) {
        this.documentItemText = value;
    }

    /**
     * reasonCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * reasonCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * oplAcctgDocItmCntrySpcfcRef1プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOplAcctgDocItmCntrySpcfcRef1() {
        return oplAcctgDocItmCntrySpcfcRef1;
    }

    /**
     * oplAcctgDocItmCntrySpcfcRef1プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOplAcctgDocItmCntrySpcfcRef1(String value) {
        this.oplAcctgDocItmCntrySpcfcRef1 = value;
    }

    /**
     * assignmentReferenceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignmentReference() {
        return assignmentReference;
    }

    /**
     * assignmentReferenceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignmentReference(String value) {
        this.assignmentReference = value;
    }

    /**
     * financialTransactionTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialTransactionType() {
        return financialTransactionType;
    }

    /**
     * financialTransactionTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialTransactionType(String value) {
        this.financialTransactionType = value;
    }

    /**
     * taxプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link JournalEntryCreateRequestJournalEntryTaxDetails }
     *     
     */
    public JournalEntryCreateRequestJournalEntryTaxDetails getTax() {
        return tax;
    }

    /**
     * taxプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link JournalEntryCreateRequestJournalEntryTaxDetails }
     *     
     */
    public void setTax(JournalEntryCreateRequestJournalEntryTaxDetails value) {
        this.tax = value;
    }

    /**
     * plantプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlant() {
        return plant;
    }

    /**
     * plantプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlant(String value) {
        this.plant = value;
    }

    /**
     * materialプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial() {
        return material;
    }

    /**
     * materialプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial(String value) {
        this.material = value;
    }

    /**
     * quantityInEntryUnitプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getQuantityInEntryUnit() {
        return quantityInEntryUnit;
    }

    /**
     * quantityInEntryUnitプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantityInEntryUnit(Quantity value) {
        this.quantityInEntryUnit = value;
    }

    /**
     * isNotCashDiscountLiableプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNotCashDiscountLiable() {
        return isNotCashDiscountLiable;
    }

    /**
     * isNotCashDiscountLiableプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNotCashDiscountLiable(Boolean value) {
        this.isNotCashDiscountLiable = value;
    }

    /**
     * tradingPartnerプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradingPartner() {
        return tradingPartner;
    }

    /**
     * tradingPartnerプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradingPartner(String value) {
        this.tradingPartner = value;
    }

    /**
     * valueDateプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueDate() {
        return valueDate;
    }

    /**
     * valueDateプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValueDate(XMLGregorianCalendar value) {
        this.valueDate = value;
    }

    /**
     * businessPlaceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPlace() {
        return businessPlace;
    }

    /**
     * businessPlaceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPlace(String value) {
        this.businessPlace = value;
    }

    /**
     * houseBankプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseBank() {
        return houseBank;
    }

    /**
     * houseBankプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseBank(String value) {
        this.houseBank = value;
    }

    /**
     * houseBankAccountプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseBankAccount() {
        return houseBankAccount;
    }

    /**
     * houseBankAccountプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseBankAccount(String value) {
        this.houseBankAccount = value;
    }

    /**
     * financialServicesProductGroupプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialServicesProductGroup() {
        return financialServicesProductGroup;
    }

    /**
     * financialServicesProductGroupプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialServicesProductGroup(String value) {
        this.financialServicesProductGroup = value;
    }

    /**
     * financialServicesBranchプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialServicesBranch() {
        return financialServicesBranch;
    }

    /**
     * financialServicesBranchプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialServicesBranch(String value) {
        this.financialServicesBranch = value;
    }

    /**
     * financialDataSourceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialDataSource() {
        return financialDataSource;
    }

    /**
     * financialDataSourceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialDataSource(String value) {
        this.financialDataSource = value;
    }

    /**
     * reference1IDByBusinessPartnerプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference1IDByBusinessPartner() {
        return reference1IDByBusinessPartner;
    }

    /**
     * reference1IDByBusinessPartnerプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference1IDByBusinessPartner(String value) {
        this.reference1IDByBusinessPartner = value;
    }

    /**
     * reference2IDByBusinessPartnerプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference2IDByBusinessPartner() {
        return reference2IDByBusinessPartner;
    }

    /**
     * reference2IDByBusinessPartnerプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference2IDByBusinessPartner(String value) {
        this.reference2IDByBusinessPartner = value;
    }

    /**
     * reference3IDByBusinessPartnerプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference3IDByBusinessPartner() {
        return reference3IDByBusinessPartner;
    }

    /**
     * reference3IDByBusinessPartnerプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference3IDByBusinessPartner(String value) {
        this.reference3IDByBusinessPartner = value;
    }

    /**
     * accountAssignmentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link JournalEntryCreateRequestJournalEntryItemAccountAssignment }
     *     
     */
    public JournalEntryCreateRequestJournalEntryItemAccountAssignment getAccountAssignment() {
        return accountAssignment;
    }

    /**
     * accountAssignmentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link JournalEntryCreateRequestJournalEntryItemAccountAssignment }
     *     
     */
    public void setAccountAssignment(JournalEntryCreateRequestJournalEntryItemAccountAssignment value) {
        this.accountAssignment = value;
    }

    /**
     * profitabilitySupplementプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link JournalEntryCreateRequestJournalEntryItemProfitabilitySupplement }
     *     
     */
    public JournalEntryCreateRequestJournalEntryItemProfitabilitySupplement getProfitabilitySupplement() {
        return profitabilitySupplement;
    }

    /**
     * profitabilitySupplementプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link JournalEntryCreateRequestJournalEntryItemProfitabilitySupplement }
     *     
     */
    public void setProfitabilitySupplement(JournalEntryCreateRequestJournalEntryItemProfitabilitySupplement value) {
        this.profitabilitySupplement = value;
    }

    /**
     * additionalAttributesプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link JournalEntryCreateRequestJournalEntryItemAdditionalAttributes }
     *     
     */
    public JournalEntryCreateRequestJournalEntryItemAdditionalAttributes getAdditionalAttributes() {
        return additionalAttributes;
    }

    /**
     * additionalAttributesプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link JournalEntryCreateRequestJournalEntryItemAdditionalAttributes }
     *     
     */
    public void setAdditionalAttributes(JournalEntryCreateRequestJournalEntryItemAdditionalAttributes value) {
        this.additionalAttributes = value;
    }

    /**
     * billableControlプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillableControl() {
        return billableControl;
    }

    /**
     * billableControlプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillableControl(String value) {
        this.billableControl = value;
    }

}
