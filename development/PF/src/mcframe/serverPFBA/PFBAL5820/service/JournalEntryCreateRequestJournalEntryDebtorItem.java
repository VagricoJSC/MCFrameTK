
package mcframe.serverPFBA.PFBAL5820.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>JournalEntryCreateRequestJournalEntryDebtorItem complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="JournalEntryCreateRequestJournalEntryDebtorItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceDocumentItem" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessTransactionDocumentItemID"/>
 *         &lt;element name="Debtor" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessPartnerInternalID"/>
 *         &lt;element name="AmountInTransactionCurrency" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount"/>
 *         &lt;element name="AmountInCompanyCodeCurrency" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="AmountInGroupCurrency" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="AmountInFreeDefinedCurrency1" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="DebitCreditCode" type="{http://sap.com/xi/SAPSCORE/SFIN}DebitCreditCode" minOccurs="0"/>
 *         &lt;element name="AltvRecnclnAccts" type="{http://sap.com/xi/SAPSCORE/SFIN}ChartOfAccountsItemCode" minOccurs="0"/>
 *         &lt;element name="DocumentItemText" type="{http://sap.com/xi/SAPSCORE/SFIN}DocumentItemText" minOccurs="0"/>
 *         &lt;element name="AssignmentReference" type="{http://sap.com/xi/SAPSCORE/SFIN}AssignmentReference" minOccurs="0"/>
 *         &lt;element name="Reference1IDByBusinessPartner" type="{http://sap.com/xi/SAPSCORE/SFIN}ReferenceKey" minOccurs="0"/>
 *         &lt;element name="Reference2IDByBusinessPartner" type="{http://sap.com/xi/SAPSCORE/SFIN}ReferenceKey" minOccurs="0"/>
 *         &lt;element name="Reference3IDByBusinessPartner" type="{http://sap.com/xi/SAPSCORE/SFIN}ReferenceKey_3" minOccurs="0"/>
 *         &lt;element name="CashDiscountTerms" type="{http://sap.com/xi/SAPSCORE/SFIN}JournalEntryCreateRequestJournalEntryCashDiscountTerms" minOccurs="0"/>
 *         &lt;element name="PaymentDetails" type="{http://sap.com/xi/SAPSCORE/SFIN}JournalEntryCreateRequestJournalEntryDebtorItemPaymentDetails" minOccurs="0"/>
 *         &lt;element name="StateCentralBankPaymentReason" type="{http://sap.com/xi/SAPSCORE/SFIN}StateCentralBankPaymentReason" minOccurs="0"/>
 *         &lt;element name="ReportingCountry" type="{http://sap.com/xi/SAPSCORE/SFIN}CountryCode" minOccurs="0"/>
 *         &lt;element name="VATRegistration" type="{http://sap.com/xi/SAPSCORE/SFIN}VATRegistration" minOccurs="0"/>
 *         &lt;element name="IsEUTriangularDeal" type="{http://sap.com/xi/SAPSCORE/SFIN}IsEUTriangularDeal" minOccurs="0"/>
 *         &lt;element name="OplAcctgDocItmCntrySpcfcRef1" type="{http://sap.com/xi/SAPSCORE/SFIN}OplAcctgDocItmCntrySpcfcRef1" minOccurs="0"/>
 *         &lt;element name="BranchAccount" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessPartnerInternalID" minOccurs="0"/>
 *         &lt;element name="JointVentureBillingType" type="{http://sap.com/xi/SAPSCORE/SFIN}JointVentureBillingType" minOccurs="0"/>
 *         &lt;element name="JointVenture" type="{http://sap.com/xi/SAPSCORE/SFIN}JointVenture" minOccurs="0"/>
 *         &lt;element name="JointVentureRecoveryCode" type="{http://sap.com/xi/SAPSCORE/SFIN}JointVentureRecoveryCode_GFN" minOccurs="0"/>
 *         &lt;element name="JointVentureEquityGroup" type="{http://sap.com/xi/SAPSCORE/SFIN}JointVentureEquityGroup" minOccurs="0"/>
 *         &lt;element name="BusinessPlace" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessPlace_GFN" minOccurs="0"/>
 *         &lt;element name="HouseBank" type="{http://sap.com/xi/SAPSCORE/SFIN}HouseBank_GFN" minOccurs="0"/>
 *         &lt;element name="HouseBankAccount" type="{http://sap.com/xi/SAPSCORE/SFIN}HouseBankAccountID" minOccurs="0"/>
 *         &lt;element name="TaxCountry" type="{http://sap.com/xi/SAPSCORE/SFIN}CountryCode" minOccurs="0"/>
 *         &lt;element name="CreditControlArea" type="{http://sap.com/xi/SAPSCORE/SFIN}CreditControlArea" minOccurs="0"/>
 *         &lt;element name="DownPaymentTerms" type="{http://sap.com/xi/SAPSCORE/SFIN}JournalEntryCreateRequestJournalEntryDownPayment" minOccurs="0"/>
 *         &lt;element name="OneTimeCustomerDetails" type="{http://sap.com/xi/SAPSCORE/SFIN}JournalEntryCreateRequestJournalEntryOneTimeCustomer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryCreateRequestJournalEntryDebtorItem", propOrder = {
    "referenceDocumentItem",
    "debtor",
    "amountInTransactionCurrency",
    "amountInCompanyCodeCurrency",
    "amountInGroupCurrency",
    "amountInFreeDefinedCurrency1",
    "debitCreditCode",
    "altvRecnclnAccts",
    "documentItemText",
    "assignmentReference",
    "reference1IDByBusinessPartner",
    "reference2IDByBusinessPartner",
    "reference3IDByBusinessPartner",
    "cashDiscountTerms",
    "paymentDetails",
    "stateCentralBankPaymentReason",
    "reportingCountry",
    "vatRegistration",
    "isEUTriangularDeal",
    "oplAcctgDocItmCntrySpcfcRef1",
    "branchAccount",
    "jointVentureBillingType",
    "jointVenture",
    "jointVentureRecoveryCode",
    "jointVentureEquityGroup",
    "businessPlace",
    "houseBank",
    "houseBankAccount",
    "taxCountry",
    "creditControlArea",
    "downPaymentTerms",
    "oneTimeCustomerDetails"
})
public class JournalEntryCreateRequestJournalEntryDebtorItem {

    @XmlElement(name = "ReferenceDocumentItem", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceDocumentItem;
    @XmlElement(name = "Debtor", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String debtor;
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
    @XmlElement(name = "AltvRecnclnAccts")
    protected ChartOfAccountsItemCode altvRecnclnAccts;
    @XmlElement(name = "DocumentItemText")
    protected String documentItemText;
    @XmlElement(name = "AssignmentReference")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String assignmentReference;
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
    @XmlElement(name = "CashDiscountTerms")
    protected JournalEntryCreateRequestJournalEntryCashDiscountTerms cashDiscountTerms;
    @XmlElement(name = "PaymentDetails")
    protected JournalEntryCreateRequestJournalEntryDebtorItemPaymentDetails paymentDetails;
    @XmlElement(name = "StateCentralBankPaymentReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String stateCentralBankPaymentReason;
    @XmlElement(name = "ReportingCountry")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reportingCountry;
    @XmlElement(name = "VATRegistration")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String vatRegistration;
    @XmlElement(name = "IsEUTriangularDeal")
    protected Boolean isEUTriangularDeal;
    @XmlElement(name = "OplAcctgDocItmCntrySpcfcRef1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String oplAcctgDocItmCntrySpcfcRef1;
    @XmlElement(name = "BranchAccount")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String branchAccount;
    @XmlElement(name = "JointVentureBillingType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String jointVentureBillingType;
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
    @XmlElement(name = "TaxCountry")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxCountry;
    @XmlElement(name = "CreditControlArea")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String creditControlArea;
    @XmlElement(name = "DownPaymentTerms")
    protected JournalEntryCreateRequestJournalEntryDownPayment downPaymentTerms;
    @XmlElement(name = "OneTimeCustomerDetails")
    protected JournalEntryCreateRequestJournalEntryOneTimeCustomer oneTimeCustomerDetails;

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
     * debtorプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtor() {
        return debtor;
    }

    /**
     * debtorプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtor(String value) {
        this.debtor = value;
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
     * altvRecnclnAcctsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ChartOfAccountsItemCode }
     *     
     */
    public ChartOfAccountsItemCode getAltvRecnclnAccts() {
        return altvRecnclnAccts;
    }

    /**
     * altvRecnclnAcctsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ChartOfAccountsItemCode }
     *     
     */
    public void setAltvRecnclnAccts(ChartOfAccountsItemCode value) {
        this.altvRecnclnAccts = value;
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
     * cashDiscountTermsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link JournalEntryCreateRequestJournalEntryCashDiscountTerms }
     *     
     */
    public JournalEntryCreateRequestJournalEntryCashDiscountTerms getCashDiscountTerms() {
        return cashDiscountTerms;
    }

    /**
     * cashDiscountTermsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link JournalEntryCreateRequestJournalEntryCashDiscountTerms }
     *     
     */
    public void setCashDiscountTerms(JournalEntryCreateRequestJournalEntryCashDiscountTerms value) {
        this.cashDiscountTerms = value;
    }

    /**
     * paymentDetailsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link JournalEntryCreateRequestJournalEntryDebtorItemPaymentDetails }
     *     
     */
    public JournalEntryCreateRequestJournalEntryDebtorItemPaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * paymentDetailsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link JournalEntryCreateRequestJournalEntryDebtorItemPaymentDetails }
     *     
     */
    public void setPaymentDetails(JournalEntryCreateRequestJournalEntryDebtorItemPaymentDetails value) {
        this.paymentDetails = value;
    }

    /**
     * stateCentralBankPaymentReasonプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCentralBankPaymentReason() {
        return stateCentralBankPaymentReason;
    }

    /**
     * stateCentralBankPaymentReasonプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCentralBankPaymentReason(String value) {
        this.stateCentralBankPaymentReason = value;
    }

    /**
     * reportingCountryプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingCountry() {
        return reportingCountry;
    }

    /**
     * reportingCountryプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingCountry(String value) {
        this.reportingCountry = value;
    }

    /**
     * vatRegistrationプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATRegistration() {
        return vatRegistration;
    }

    /**
     * vatRegistrationプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATRegistration(String value) {
        this.vatRegistration = value;
    }

    /**
     * isEUTriangularDealプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEUTriangularDeal() {
        return isEUTriangularDeal;
    }

    /**
     * isEUTriangularDealプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEUTriangularDeal(Boolean value) {
        this.isEUTriangularDeal = value;
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
     * branchAccountプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchAccount() {
        return branchAccount;
    }

    /**
     * branchAccountプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchAccount(String value) {
        this.branchAccount = value;
    }

    /**
     * jointVentureBillingTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJointVentureBillingType() {
        return jointVentureBillingType;
    }

    /**
     * jointVentureBillingTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJointVentureBillingType(String value) {
        this.jointVentureBillingType = value;
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
     * taxCountryプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCountry() {
        return taxCountry;
    }

    /**
     * taxCountryプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCountry(String value) {
        this.taxCountry = value;
    }

    /**
     * creditControlAreaプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditControlArea() {
        return creditControlArea;
    }

    /**
     * creditControlAreaプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditControlArea(String value) {
        this.creditControlArea = value;
    }

    /**
     * downPaymentTermsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link JournalEntryCreateRequestJournalEntryDownPayment }
     *     
     */
    public JournalEntryCreateRequestJournalEntryDownPayment getDownPaymentTerms() {
        return downPaymentTerms;
    }

    /**
     * downPaymentTermsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link JournalEntryCreateRequestJournalEntryDownPayment }
     *     
     */
    public void setDownPaymentTerms(JournalEntryCreateRequestJournalEntryDownPayment value) {
        this.downPaymentTerms = value;
    }

    /**
     * oneTimeCustomerDetailsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link JournalEntryCreateRequestJournalEntryOneTimeCustomer }
     *     
     */
    public JournalEntryCreateRequestJournalEntryOneTimeCustomer getOneTimeCustomerDetails() {
        return oneTimeCustomerDetails;
    }

    /**
     * oneTimeCustomerDetailsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link JournalEntryCreateRequestJournalEntryOneTimeCustomer }
     *     
     */
    public void setOneTimeCustomerDetails(JournalEntryCreateRequestJournalEntryOneTimeCustomer value) {
        this.oneTimeCustomerDetails = value;
    }

}
