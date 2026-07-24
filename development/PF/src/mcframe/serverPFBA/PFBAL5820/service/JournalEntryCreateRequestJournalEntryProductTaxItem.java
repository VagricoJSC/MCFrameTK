
package mcframe.serverPFBA.PFBAL5820.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>JournalEntryCreateRequestJournalEntryProductTaxItem complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="JournalEntryCreateRequestJournalEntryProductTaxItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceDocumentItem" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessTransactionDocumentItemID" minOccurs="0"/>
 *         &lt;element name="TaxCode" type="{http://sap.com/xi/SAPSCORE/SFIN}ProductTaxationCharacteristicsCode"/>
 *         &lt;element name="TaxItemClassification" type="{http://sap.com/xi/SAPSCORE/SFIN}TaxItemClassification" minOccurs="0"/>
 *         &lt;element name="ConditionType" type="{http://sap.com/xi/SAPSCORE/SFIN}ConditionType_GFN" minOccurs="0"/>
 *         &lt;element name="TaxJurisdiction" type="{http://sap.com/xi/SAPSCORE/SFIN}TaxJurisdictionCode" minOccurs="0"/>
 *         &lt;element name="TaxJurisdictionLevel" type="{http://sap.com/xi/SAPSCORE/SFIN}TaxJurisdictionLevel" minOccurs="0"/>
 *         &lt;element name="LowestLevelTaxJurisdiction" type="{http://sap.com/xi/SAPSCORE/SFIN}TaxJurisdictionCode" minOccurs="0"/>
 *         &lt;element name="TaxItemGroup" type="{http://sap.com/xi/SAPSCORE/SFIN}TaxItemGroupID" minOccurs="0"/>
 *         &lt;element name="TaxRate" type="{http://sap.com/xi/SAPSCORE/SFIN}Percent" minOccurs="0"/>
 *         &lt;element name="TaxDeterminationDate" type="{http://sap.com/xi/SAPSCORE/SFIN}Date" minOccurs="0"/>
 *         &lt;element name="IsDirectTaxPosting" type="{http://sap.com/xi/SAPSCORE/SFIN}Indicator" minOccurs="0"/>
 *         &lt;element name="TaxCountry" type="{http://sap.com/xi/SAPSCORE/SFIN}CurrencyCode" minOccurs="0"/>
 *         &lt;element name="AmountInTransactionCurrency" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount"/>
 *         &lt;element name="AmountInCompanyCodeCurrency" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="AmountInGroupCurrency" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="AmountInFreeDefinedCurrency1" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="DebitCreditCode" type="{http://sap.com/xi/SAPSCORE/SFIN}DebitCreditCode" minOccurs="0"/>
 *         &lt;element name="ProductiveTaxText" type="{http://sap.com/xi/SAPSCORE/SFIN}DocumentItemText" minOccurs="0"/>
 *         &lt;element name="TaxBaseAmountInTransCrcy" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount"/>
 *         &lt;element name="TaxBaseAmountInCoCodeCrcy" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="TaxBaseAmountInGroupCrcy" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="TaxBaseAmountInFreeDefinedCrcy1" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryCreateRequestJournalEntryProductTaxItem", propOrder = {
    "referenceDocumentItem",
    "taxCode",
    "taxItemClassification",
    "conditionType",
    "taxJurisdiction",
    "taxJurisdictionLevel",
    "lowestLevelTaxJurisdiction",
    "taxItemGroup",
    "taxRate",
    "taxDeterminationDate",
    "isDirectTaxPosting",
    "taxCountry",
    "amountInTransactionCurrency",
    "amountInCompanyCodeCurrency",
    "amountInGroupCurrency",
    "amountInFreeDefinedCurrency1",
    "debitCreditCode",
    "productiveTaxText",
    "taxBaseAmountInTransCrcy",
    "taxBaseAmountInCoCodeCrcy",
    "taxBaseAmountInGroupCrcy",
    "taxBaseAmountInFreeDefinedCrcy1"
})
public class JournalEntryCreateRequestJournalEntryProductTaxItem {

    @XmlElement(name = "ReferenceDocumentItem")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceDocumentItem;
    @XmlElement(name = "TaxCode", required = true)
    protected ProductTaxationCharacteristicsCode taxCode;
    @XmlElement(name = "TaxItemClassification")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxItemClassification;
    @XmlElement(name = "ConditionType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String conditionType;
    @XmlElement(name = "TaxJurisdiction")
    protected TaxJurisdictionCode taxJurisdiction;
    @XmlElement(name = "TaxJurisdictionLevel")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxJurisdictionLevel;
    @XmlElement(name = "LowestLevelTaxJurisdiction")
    protected TaxJurisdictionCode lowestLevelTaxJurisdiction;
    @XmlElement(name = "TaxItemGroup")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxItemGroup;
    @XmlElement(name = "TaxRate")
    protected BigDecimal taxRate;
    @XmlElement(name = "TaxDeterminationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar taxDeterminationDate;
    @XmlElement(name = "IsDirectTaxPosting")
    protected Boolean isDirectTaxPosting;
    @XmlElement(name = "TaxCountry")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxCountry;
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
    @XmlElement(name = "ProductiveTaxText")
    protected String productiveTaxText;
    @XmlElement(name = "TaxBaseAmountInTransCrcy", required = true)
    protected Amount taxBaseAmountInTransCrcy;
    @XmlElement(name = "TaxBaseAmountInCoCodeCrcy")
    protected Amount taxBaseAmountInCoCodeCrcy;
    @XmlElement(name = "TaxBaseAmountInGroupCrcy")
    protected Amount taxBaseAmountInGroupCrcy;
    @XmlElement(name = "TaxBaseAmountInFreeDefinedCrcy1")
    protected Amount taxBaseAmountInFreeDefinedCrcy1;

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
     * taxCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ProductTaxationCharacteristicsCode }
     *     
     */
    public ProductTaxationCharacteristicsCode getTaxCode() {
        return taxCode;
    }

    /**
     * taxCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTaxationCharacteristicsCode }
     *     
     */
    public void setTaxCode(ProductTaxationCharacteristicsCode value) {
        this.taxCode = value;
    }

    /**
     * taxItemClassificationプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxItemClassification() {
        return taxItemClassification;
    }

    /**
     * taxItemClassificationプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxItemClassification(String value) {
        this.taxItemClassification = value;
    }

    /**
     * conditionTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionType() {
        return conditionType;
    }

    /**
     * conditionTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionType(String value) {
        this.conditionType = value;
    }

    /**
     * taxJurisdictionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TaxJurisdictionCode }
     *     
     */
    public TaxJurisdictionCode getTaxJurisdiction() {
        return taxJurisdiction;
    }

    /**
     * taxJurisdictionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxJurisdictionCode }
     *     
     */
    public void setTaxJurisdiction(TaxJurisdictionCode value) {
        this.taxJurisdiction = value;
    }

    /**
     * taxJurisdictionLevelプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxJurisdictionLevel() {
        return taxJurisdictionLevel;
    }

    /**
     * taxJurisdictionLevelプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxJurisdictionLevel(String value) {
        this.taxJurisdictionLevel = value;
    }

    /**
     * lowestLevelTaxJurisdictionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TaxJurisdictionCode }
     *     
     */
    public TaxJurisdictionCode getLowestLevelTaxJurisdiction() {
        return lowestLevelTaxJurisdiction;
    }

    /**
     * lowestLevelTaxJurisdictionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxJurisdictionCode }
     *     
     */
    public void setLowestLevelTaxJurisdiction(TaxJurisdictionCode value) {
        this.lowestLevelTaxJurisdiction = value;
    }

    /**
     * taxItemGroupプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxItemGroup() {
        return taxItemGroup;
    }

    /**
     * taxItemGroupプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxItemGroup(String value) {
        this.taxItemGroup = value;
    }

    /**
     * taxRateプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * taxRateプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxRate(BigDecimal value) {
        this.taxRate = value;
    }

    /**
     * taxDeterminationDateプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTaxDeterminationDate() {
        return taxDeterminationDate;
    }

    /**
     * taxDeterminationDateプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTaxDeterminationDate(XMLGregorianCalendar value) {
        this.taxDeterminationDate = value;
    }

    /**
     * isDirectTaxPostingプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDirectTaxPosting() {
        return isDirectTaxPosting;
    }

    /**
     * isDirectTaxPostingプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDirectTaxPosting(Boolean value) {
        this.isDirectTaxPosting = value;
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
     * productiveTaxTextプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductiveTaxText() {
        return productiveTaxText;
    }

    /**
     * productiveTaxTextプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductiveTaxText(String value) {
        this.productiveTaxText = value;
    }

    /**
     * taxBaseAmountInTransCrcyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getTaxBaseAmountInTransCrcy() {
        return taxBaseAmountInTransCrcy;
    }

    /**
     * taxBaseAmountInTransCrcyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setTaxBaseAmountInTransCrcy(Amount value) {
        this.taxBaseAmountInTransCrcy = value;
    }

    /**
     * taxBaseAmountInCoCodeCrcyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getTaxBaseAmountInCoCodeCrcy() {
        return taxBaseAmountInCoCodeCrcy;
    }

    /**
     * taxBaseAmountInCoCodeCrcyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setTaxBaseAmountInCoCodeCrcy(Amount value) {
        this.taxBaseAmountInCoCodeCrcy = value;
    }

    /**
     * taxBaseAmountInGroupCrcyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getTaxBaseAmountInGroupCrcy() {
        return taxBaseAmountInGroupCrcy;
    }

    /**
     * taxBaseAmountInGroupCrcyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setTaxBaseAmountInGroupCrcy(Amount value) {
        this.taxBaseAmountInGroupCrcy = value;
    }

    /**
     * taxBaseAmountInFreeDefinedCrcy1プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getTaxBaseAmountInFreeDefinedCrcy1() {
        return taxBaseAmountInFreeDefinedCrcy1;
    }

    /**
     * taxBaseAmountInFreeDefinedCrcy1プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setTaxBaseAmountInFreeDefinedCrcy1(Amount value) {
        this.taxBaseAmountInFreeDefinedCrcy1 = value;
    }

}
