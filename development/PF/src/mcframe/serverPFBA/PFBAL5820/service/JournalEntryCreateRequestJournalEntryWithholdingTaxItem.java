
package mcframe.serverPFBA.PFBAL5820.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>JournalEntryCreateRequestJournalEntryWithholdingTaxItem complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="JournalEntryCreateRequestJournalEntryWithholdingTaxItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceDocumentItem" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessTransactionDocumentItemID" minOccurs="0"/>
 *         &lt;element name="WithholdingTaxType" type="{http://sap.com/xi/SAPSCORE/SFIN}WithholdingTaxType"/>
 *         &lt;element name="WithholdingTaxCode" type="{http://sap.com/xi/SAPSCORE/SFIN}WithholdingTaxCode"/>
 *         &lt;element name="AmountInTransactionCurrency" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="AmountInCompanyCodeCurrency" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="AmountInGroupCurrency" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="AmountInFreeDefinedCurrency1" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="TaxBaseAmountInTransCrcy" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="TaxBaseAmountInCoCodeCrcy" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="TaxBaseAmountInGroupCrcy" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="TaxBaseAmountInFreeDefinedCrcy1" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="TaxIsToBeCalculated" type="{http://sap.com/xi/SAPSCORE/SFIN}Indicator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryCreateRequestJournalEntryWithholdingTaxItem", propOrder = {
    "referenceDocumentItem",
    "withholdingTaxType",
    "withholdingTaxCode",
    "amountInTransactionCurrency",
    "amountInCompanyCodeCurrency",
    "amountInGroupCurrency",
    "amountInFreeDefinedCurrency1",
    "taxBaseAmountInTransCrcy",
    "taxBaseAmountInCoCodeCrcy",
    "taxBaseAmountInGroupCrcy",
    "taxBaseAmountInFreeDefinedCrcy1",
    "taxIsToBeCalculated"
})
public class JournalEntryCreateRequestJournalEntryWithholdingTaxItem {

    @XmlElement(name = "ReferenceDocumentItem")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceDocumentItem;
    @XmlElement(name = "WithholdingTaxType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String withholdingTaxType;
    @XmlElement(name = "WithholdingTaxCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String withholdingTaxCode;
    @XmlElement(name = "AmountInTransactionCurrency")
    protected Amount amountInTransactionCurrency;
    @XmlElement(name = "AmountInCompanyCodeCurrency")
    protected Amount amountInCompanyCodeCurrency;
    @XmlElement(name = "AmountInGroupCurrency")
    protected Amount amountInGroupCurrency;
    @XmlElement(name = "AmountInFreeDefinedCurrency1")
    protected Amount amountInFreeDefinedCurrency1;
    @XmlElement(name = "TaxBaseAmountInTransCrcy")
    protected Amount taxBaseAmountInTransCrcy;
    @XmlElement(name = "TaxBaseAmountInCoCodeCrcy")
    protected Amount taxBaseAmountInCoCodeCrcy;
    @XmlElement(name = "TaxBaseAmountInGroupCrcy")
    protected Amount taxBaseAmountInGroupCrcy;
    @XmlElement(name = "TaxBaseAmountInFreeDefinedCrcy1")
    protected Amount taxBaseAmountInFreeDefinedCrcy1;
    @XmlElement(name = "TaxIsToBeCalculated")
    protected Boolean taxIsToBeCalculated;

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
     * withholdingTaxTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithholdingTaxType() {
        return withholdingTaxType;
    }

    /**
     * withholdingTaxTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithholdingTaxType(String value) {
        this.withholdingTaxType = value;
    }

    /**
     * withholdingTaxCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithholdingTaxCode() {
        return withholdingTaxCode;
    }

    /**
     * withholdingTaxCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithholdingTaxCode(String value) {
        this.withholdingTaxCode = value;
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

    /**
     * taxIsToBeCalculatedプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxIsToBeCalculated() {
        return taxIsToBeCalculated;
    }

    /**
     * taxIsToBeCalculatedプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxIsToBeCalculated(Boolean value) {
        this.taxIsToBeCalculated = value;
    }

}
