
package mcframe.serverPFBA.PFBAL5820.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>JournalEntryCreateRequestJournalEntry complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="JournalEntryCreateRequestJournalEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginalReferenceDocumentType" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessTransactionDocumentTypeCode"/>
 *         &lt;element name="OriginalReferenceDocument" type="{http://sap.com/xi/SAPSCORE/SFIN}ReferenceDocumentID" minOccurs="0"/>
 *         &lt;element name="OriginalReferenceDocumentLogicalSystem" type="{http://sap.com/xi/SAPSCORE/SFIN}OriginalReferenceDocumentLogicalSystem" minOccurs="0"/>
 *         &lt;element name="BusinessTransactionType" type="{http://sap.com/xi/SAPSCORE/SFIN}AccountingBusinessTransactionTypeCode"/>
 *         &lt;element name="AccountingDocumentType" type="{http://sap.com/xi/SAPSCORE/SFIN}AccountingDocumentTypeCode"/>
 *         &lt;element name="AccountingDocument" type="{http://sap.com/xi/SAPSCORE/SFIN}AccountingDocument" minOccurs="0"/>
 *         &lt;element name="DocumentReferenceID" type="{http://sap.com/xi/SAPSCORE/SFIN}DocumentReferenceID" minOccurs="0"/>
 *         &lt;element name="OriginalPredecessorRefDocument" type="{http://sap.com/xi/SAPSCORE/SFIN}ReferenceDocumentID" minOccurs="0"/>
 *         &lt;element name="InvoiceReferenceDocument" type="{http://sap.com/xi/SAPSCORE/SFIN}ReferenceDocumentID" minOccurs="0"/>
 *         &lt;element name="DocumentHeaderText" type="{http://sap.com/xi/SAPSCORE/SFIN}DocumentHeaderText" minOccurs="0"/>
 *         &lt;element name="ReversalReason" type="{http://sap.com/xi/SAPSCORE/SFIN}ReversalReason" minOccurs="0"/>
 *         &lt;element name="ReversalReferenceDocument" type="{http://sap.com/xi/SAPSCORE/SFIN}ReversalReferenceDocument" minOccurs="0"/>
 *         &lt;element name="ReversalDate" type="{http://sap.com/xi/SAPSCORE/SFIN}Date" minOccurs="0"/>
 *         &lt;element name="DoTaxAmountCheck" type="{http://sap.com/xi/SAPSCORE/SFIN}Indicator" minOccurs="0"/>
 *         &lt;element name="TaxFulfillmentDate" type="{http://sap.com/xi/SAPSCORE/SFIN}TaxFulfillmentDate" minOccurs="0"/>
 *         &lt;element name="CreatedByUser" type="{http://sap.com/xi/SAPSCORE/SFIN}CreatedByUser"/>
 *         &lt;element name="CompanyCode" type="{http://sap.com/xi/SAPSCORE/SFIN}CompanyCodeID"/>
 *         &lt;element name="DocumentDate" type="{http://sap.com/xi/SAPSCORE/SFIN}Date"/>
 *         &lt;element name="PostingDate" type="{http://sap.com/xi/SAPSCORE/SFIN}Date"/>
 *         &lt;element name="PostingFiscalPeriod" type="{http://sap.com/xi/SAPSCORE/SFIN}PostingFiscalPeriod" minOccurs="0"/>
 *         &lt;element name="TaxReportingDate" type="{http://sap.com/xi/SAPSCORE/SFIN}Date" minOccurs="0"/>
 *         &lt;element name="TaxDeterminationDate" type="{http://sap.com/xi/SAPSCORE/SFIN}TaxDeterminationDate_GFN" minOccurs="0"/>
 *         &lt;element name="InvoiceReceiptDate" type="{http://sap.com/xi/SAPSCORE/SFIN}Date" minOccurs="0"/>
 *         &lt;element name="ExchangeRateDate" type="{http://sap.com/xi/SAPSCORE/SFIN}Date" minOccurs="0"/>
 *         &lt;element name="ECSEnvironment" type="{http://sap.com/xi/SAPSCORE/SFIN}EcsEnvironment_GFN" minOccurs="0"/>
 *         &lt;element name="ExchangeRate" type="{http://sap.com/xi/SAPSCORE/SFIN}ExchangeRateRate" minOccurs="0"/>
 *         &lt;element name="IndirectQuotedExchangeRate" type="{http://sap.com/xi/SAPSCORE/SFIN}ExchangeRateRate" minOccurs="0"/>
 *         &lt;element name="SourceSystemCompanyCode" type="{http://sap.com/xi/SAPSCORE/SFIN}OrganisationalCentreID" minOccurs="0"/>
 *         &lt;element name="SourceSystemAccountingDocument" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessTransactionDocumentID" minOccurs="0"/>
 *         &lt;element name="Reference1InDocumentHeader" type="{http://sap.com/xi/SAPSCORE/SFIN}AccountingDocumentHeaderReferenceID_GFN" minOccurs="0"/>
 *         &lt;element name="Reference2InDocumentHeader" type="{http://sap.com/xi/SAPSCORE/SFIN}AccountingDocumentHeaderReferenceID_GFN" minOccurs="0"/>
 *         &lt;element name="JrnlEntryCntrySpecificRef1" type="{http://sap.com/xi/SAPSCORE/SFIN}JrnlEntryCntrySpecificRef1" minOccurs="0"/>
 *         &lt;element name="JrnlEntryCntrySpecificDate1" type="{http://sap.com/xi/SAPSCORE/SFIN}JrnlEntryCntrySpecificDate" minOccurs="0"/>
 *         &lt;element name="JrnlEntryCntrySpecificRef2" type="{http://sap.com/xi/SAPSCORE/SFIN}JrnlEntryCntrySpecificRef2" minOccurs="0"/>
 *         &lt;element name="JrnlEntryCntrySpecificDate2" type="{http://sap.com/xi/SAPSCORE/SFIN}JrnlEntryCntrySpecificDate" minOccurs="0"/>
 *         &lt;element name="JrnlEntryCntrySpecificRef3" type="{http://sap.com/xi/SAPSCORE/SFIN}JrnlEntryCntrySpecificRef2" minOccurs="0"/>
 *         &lt;element name="JrnlEntryCntrySpecificDate3" type="{http://sap.com/xi/SAPSCORE/SFIN}JrnlEntryCntrySpecificDate" minOccurs="0"/>
 *         &lt;element name="JrnlEntryCntrySpecificRef4" type="{http://sap.com/xi/SAPSCORE/SFIN}JrnlEntryCntrySpecificRef4" minOccurs="0"/>
 *         &lt;element name="JrnlEntryCntrySpecificDate4" type="{http://sap.com/xi/SAPSCORE/SFIN}JrnlEntryCntrySpecificDate" minOccurs="0"/>
 *         &lt;element name="JrnlEntryCntrySpecificRef5" type="{http://sap.com/xi/SAPSCORE/SFIN}JrnlEntryCntrySpecificRef4" minOccurs="0"/>
 *         &lt;element name="JrnlEntryCntrySpecificDate5" type="{http://sap.com/xi/SAPSCORE/SFIN}JrnlEntryCntrySpecificDate" minOccurs="0"/>
 *         &lt;element name="JrnlEntryCntrySpecificBp1" type="{http://sap.com/xi/SAPSCORE/SFIN}JrnlEntryCntrySpecificBp1" minOccurs="0"/>
 *         &lt;element name="JrnlEntryCntrySpecificBp2" type="{http://sap.com/xi/SAPSCORE/SFIN}JrnlEntryCntrySpecificBp1" minOccurs="0"/>
 *         &lt;element name="Item" type="{http://sap.com/xi/SAPSCORE/SFIN}JournalEntryCreateRequestJournalEntryItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DebtorItem" type="{http://sap.com/xi/SAPSCORE/SFIN}JournalEntryCreateRequestJournalEntryDebtorItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreditorItem" type="{http://sap.com/xi/SAPSCORE/SFIN}JournalEntryCreateRequestJournalEntryCreditorItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductTaxItem" type="{http://sap.com/xi/SAPSCORE/SFIN}JournalEntryCreateRequestJournalEntryProductTaxItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WithholdingTaxItem" type="{http://sap.com/xi/SAPSCORE/SFIN}JournalEntryCreateRequestJournalEntryWithholdingTaxItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryCreateRequestJournalEntry", propOrder = {
    "originalReferenceDocumentType",
    "originalReferenceDocument",
    "originalReferenceDocumentLogicalSystem",
    "businessTransactionType",
    "accountingDocumentType",
    "accountingDocument",
    "documentReferenceID",
    "originalPredecessorRefDocument",
    "invoiceReferenceDocument",
    "documentHeaderText",
    "reversalReason",
    "reversalReferenceDocument",
    "reversalDate",
    "doTaxAmountCheck",
    "taxFulfillmentDate",
    "createdByUser",
    "companyCode",
    "documentDate",
    "postingDate",
    "postingFiscalPeriod",
    "taxReportingDate",
    "taxDeterminationDate",
    "invoiceReceiptDate",
    "exchangeRateDate",
    "ecsEnvironment",
    "exchangeRate",
    "indirectQuotedExchangeRate",
    "sourceSystemCompanyCode",
    "sourceSystemAccountingDocument",
    "reference1InDocumentHeader",
    "reference2InDocumentHeader",
    "jrnlEntryCntrySpecificRef1",
    "jrnlEntryCntrySpecificDate1",
    "jrnlEntryCntrySpecificRef2",
    "jrnlEntryCntrySpecificDate2",
    "jrnlEntryCntrySpecificRef3",
    "jrnlEntryCntrySpecificDate3",
    "jrnlEntryCntrySpecificRef4",
    "jrnlEntryCntrySpecificDate4",
    "jrnlEntryCntrySpecificRef5",
    "jrnlEntryCntrySpecificDate5",
    "jrnlEntryCntrySpecificBp1",
    "jrnlEntryCntrySpecificBp2",
    "item",
    "debtorItem",
    "creditorItem",
    "productTaxItem",
    "withholdingTaxItem"
})
public class JournalEntryCreateRequestJournalEntry {

    @XmlElement(name = "OriginalReferenceDocumentType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String originalReferenceDocumentType;
    @XmlElement(name = "OriginalReferenceDocument")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String originalReferenceDocument;
    @XmlElement(name = "OriginalReferenceDocumentLogicalSystem")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String originalReferenceDocumentLogicalSystem;
    @XmlElement(name = "BusinessTransactionType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessTransactionType;
    @XmlElement(name = "AccountingDocumentType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String accountingDocumentType;
    @XmlElement(name = "AccountingDocument")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String accountingDocument;
    @XmlElement(name = "DocumentReferenceID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String documentReferenceID;
    @XmlElement(name = "OriginalPredecessorRefDocument")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String originalPredecessorRefDocument;
    @XmlElement(name = "InvoiceReferenceDocument")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String invoiceReferenceDocument;
    @XmlElement(name = "DocumentHeaderText")
    protected String documentHeaderText;
    @XmlElement(name = "ReversalReason")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reversalReason;
    @XmlElement(name = "ReversalReferenceDocument")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reversalReferenceDocument;
    @XmlElement(name = "ReversalDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reversalDate;
    @XmlElement(name = "DoTaxAmountCheck")
    protected Boolean doTaxAmountCheck;
    @XmlElement(name = "TaxFulfillmentDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar taxFulfillmentDate;
    @XmlElement(name = "CreatedByUser", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String createdByUser;
    @XmlElement(name = "CompanyCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyCode;
    @XmlElement(name = "DocumentDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar documentDate;
    @XmlElement(name = "PostingDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar postingDate;
    @XmlElement(name = "PostingFiscalPeriod")
    protected String postingFiscalPeriod;
    @XmlElement(name = "TaxReportingDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar taxReportingDate;
    @XmlElement(name = "TaxDeterminationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar taxDeterminationDate;
    @XmlElement(name = "InvoiceReceiptDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar invoiceReceiptDate;
    @XmlElement(name = "ExchangeRateDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exchangeRateDate;
    @XmlElement(name = "ECSEnvironment")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ecsEnvironment;
    @XmlElement(name = "ExchangeRate")
    protected BigDecimal exchangeRate;
    @XmlElement(name = "IndirectQuotedExchangeRate")
    protected BigDecimal indirectQuotedExchangeRate;
    @XmlElement(name = "SourceSystemCompanyCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sourceSystemCompanyCode;
    @XmlElement(name = "SourceSystemAccountingDocument")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sourceSystemAccountingDocument;
    @XmlElement(name = "Reference1InDocumentHeader")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reference1InDocumentHeader;
    @XmlElement(name = "Reference2InDocumentHeader")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reference2InDocumentHeader;
    @XmlElement(name = "JrnlEntryCntrySpecificRef1")
    protected String jrnlEntryCntrySpecificRef1;
    @XmlElement(name = "JrnlEntryCntrySpecificDate1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar jrnlEntryCntrySpecificDate1;
    @XmlElement(name = "JrnlEntryCntrySpecificRef2")
    protected String jrnlEntryCntrySpecificRef2;
    @XmlElement(name = "JrnlEntryCntrySpecificDate2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar jrnlEntryCntrySpecificDate2;
    @XmlElement(name = "JrnlEntryCntrySpecificRef3")
    protected String jrnlEntryCntrySpecificRef3;
    @XmlElement(name = "JrnlEntryCntrySpecificDate3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar jrnlEntryCntrySpecificDate3;
    @XmlElement(name = "JrnlEntryCntrySpecificRef4")
    protected String jrnlEntryCntrySpecificRef4;
    @XmlElement(name = "JrnlEntryCntrySpecificDate4")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar jrnlEntryCntrySpecificDate4;
    @XmlElement(name = "JrnlEntryCntrySpecificRef5")
    protected String jrnlEntryCntrySpecificRef5;
    @XmlElement(name = "JrnlEntryCntrySpecificDate5")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar jrnlEntryCntrySpecificDate5;
    @XmlElement(name = "JrnlEntryCntrySpecificBp1")
    protected String jrnlEntryCntrySpecificBp1;
    @XmlElement(name = "JrnlEntryCntrySpecificBp2")
    protected String jrnlEntryCntrySpecificBp2;
    @XmlElement(name = "Item")
    protected List<JournalEntryCreateRequestJournalEntryItem> item;
    @XmlElement(name = "DebtorItem")
    protected List<JournalEntryCreateRequestJournalEntryDebtorItem> debtorItem;
    @XmlElement(name = "CreditorItem")
    protected List<JournalEntryCreateRequestJournalEntryCreditorItem> creditorItem;
    @XmlElement(name = "ProductTaxItem")
    protected List<JournalEntryCreateRequestJournalEntryProductTaxItem> productTaxItem;
    @XmlElement(name = "WithholdingTaxItem")
    protected List<JournalEntryCreateRequestJournalEntryWithholdingTaxItem> withholdingTaxItem;

    /**
     * originalReferenceDocumentTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalReferenceDocumentType() {
        return originalReferenceDocumentType;
    }

    /**
     * originalReferenceDocumentTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalReferenceDocumentType(String value) {
        this.originalReferenceDocumentType = value;
    }

    /**
     * originalReferenceDocumentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalReferenceDocument() {
        return originalReferenceDocument;
    }

    /**
     * originalReferenceDocumentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalReferenceDocument(String value) {
        this.originalReferenceDocument = value;
    }

    /**
     * originalReferenceDocumentLogicalSystemプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalReferenceDocumentLogicalSystem() {
        return originalReferenceDocumentLogicalSystem;
    }

    /**
     * originalReferenceDocumentLogicalSystemプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalReferenceDocumentLogicalSystem(String value) {
        this.originalReferenceDocumentLogicalSystem = value;
    }

    /**
     * businessTransactionTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessTransactionType() {
        return businessTransactionType;
    }

    /**
     * businessTransactionTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessTransactionType(String value) {
        this.businessTransactionType = value;
    }

    /**
     * accountingDocumentTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingDocumentType() {
        return accountingDocumentType;
    }

    /**
     * accountingDocumentTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingDocumentType(String value) {
        this.accountingDocumentType = value;
    }

    /**
     * accountingDocumentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingDocument() {
        return accountingDocument;
    }

    /**
     * accountingDocumentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingDocument(String value) {
        this.accountingDocument = value;
    }

    /**
     * documentReferenceIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentReferenceID() {
        return documentReferenceID;
    }

    /**
     * documentReferenceIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentReferenceID(String value) {
        this.documentReferenceID = value;
    }

    /**
     * originalPredecessorRefDocumentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalPredecessorRefDocument() {
        return originalPredecessorRefDocument;
    }

    /**
     * originalPredecessorRefDocumentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalPredecessorRefDocument(String value) {
        this.originalPredecessorRefDocument = value;
    }

    /**
     * invoiceReferenceDocumentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceReferenceDocument() {
        return invoiceReferenceDocument;
    }

    /**
     * invoiceReferenceDocumentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceReferenceDocument(String value) {
        this.invoiceReferenceDocument = value;
    }

    /**
     * documentHeaderTextプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentHeaderText() {
        return documentHeaderText;
    }

    /**
     * documentHeaderTextプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentHeaderText(String value) {
        this.documentHeaderText = value;
    }

    /**
     * reversalReasonプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReversalReason() {
        return reversalReason;
    }

    /**
     * reversalReasonプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReversalReason(String value) {
        this.reversalReason = value;
    }

    /**
     * reversalReferenceDocumentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReversalReferenceDocument() {
        return reversalReferenceDocument;
    }

    /**
     * reversalReferenceDocumentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReversalReferenceDocument(String value) {
        this.reversalReferenceDocument = value;
    }

    /**
     * reversalDateプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReversalDate() {
        return reversalDate;
    }

    /**
     * reversalDateプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReversalDate(XMLGregorianCalendar value) {
        this.reversalDate = value;
    }

    /**
     * doTaxAmountCheckプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoTaxAmountCheck() {
        return doTaxAmountCheck;
    }

    /**
     * doTaxAmountCheckプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoTaxAmountCheck(Boolean value) {
        this.doTaxAmountCheck = value;
    }

    /**
     * taxFulfillmentDateプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTaxFulfillmentDate() {
        return taxFulfillmentDate;
    }

    /**
     * taxFulfillmentDateプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTaxFulfillmentDate(XMLGregorianCalendar value) {
        this.taxFulfillmentDate = value;
    }

    /**
     * createdByUserプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedByUser() {
        return createdByUser;
    }

    /**
     * createdByUserプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedByUser(String value) {
        this.createdByUser = value;
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
     * documentDateプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDate() {
        return documentDate;
    }

    /**
     * documentDateプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDate(XMLGregorianCalendar value) {
        this.documentDate = value;
    }

    /**
     * postingDateプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostingDate() {
        return postingDate;
    }

    /**
     * postingDateプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostingDate(XMLGregorianCalendar value) {
        this.postingDate = value;
    }

    /**
     * postingFiscalPeriodプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingFiscalPeriod() {
        return postingFiscalPeriod;
    }

    /**
     * postingFiscalPeriodプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingFiscalPeriod(String value) {
        this.postingFiscalPeriod = value;
    }

    /**
     * taxReportingDateプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTaxReportingDate() {
        return taxReportingDate;
    }

    /**
     * taxReportingDateプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTaxReportingDate(XMLGregorianCalendar value) {
        this.taxReportingDate = value;
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
     * invoiceReceiptDateプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceReceiptDate() {
        return invoiceReceiptDate;
    }

    /**
     * invoiceReceiptDateプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceReceiptDate(XMLGregorianCalendar value) {
        this.invoiceReceiptDate = value;
    }

    /**
     * exchangeRateDateプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExchangeRateDate() {
        return exchangeRateDate;
    }

    /**
     * exchangeRateDateプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExchangeRateDate(XMLGregorianCalendar value) {
        this.exchangeRateDate = value;
    }

    /**
     * ecsEnvironmentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECSEnvironment() {
        return ecsEnvironment;
    }

    /**
     * ecsEnvironmentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECSEnvironment(String value) {
        this.ecsEnvironment = value;
    }

    /**
     * exchangeRateプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * exchangeRateプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }

    /**
     * indirectQuotedExchangeRateプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndirectQuotedExchangeRate() {
        return indirectQuotedExchangeRate;
    }

    /**
     * indirectQuotedExchangeRateプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndirectQuotedExchangeRate(BigDecimal value) {
        this.indirectQuotedExchangeRate = value;
    }

    /**
     * sourceSystemCompanyCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystemCompanyCode() {
        return sourceSystemCompanyCode;
    }

    /**
     * sourceSystemCompanyCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystemCompanyCode(String value) {
        this.sourceSystemCompanyCode = value;
    }

    /**
     * sourceSystemAccountingDocumentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystemAccountingDocument() {
        return sourceSystemAccountingDocument;
    }

    /**
     * sourceSystemAccountingDocumentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystemAccountingDocument(String value) {
        this.sourceSystemAccountingDocument = value;
    }

    /**
     * reference1InDocumentHeaderプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference1InDocumentHeader() {
        return reference1InDocumentHeader;
    }

    /**
     * reference1InDocumentHeaderプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference1InDocumentHeader(String value) {
        this.reference1InDocumentHeader = value;
    }

    /**
     * reference2InDocumentHeaderプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference2InDocumentHeader() {
        return reference2InDocumentHeader;
    }

    /**
     * reference2InDocumentHeaderプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference2InDocumentHeader(String value) {
        this.reference2InDocumentHeader = value;
    }

    /**
     * jrnlEntryCntrySpecificRef1プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJrnlEntryCntrySpecificRef1() {
        return jrnlEntryCntrySpecificRef1;
    }

    /**
     * jrnlEntryCntrySpecificRef1プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJrnlEntryCntrySpecificRef1(String value) {
        this.jrnlEntryCntrySpecificRef1 = value;
    }

    /**
     * jrnlEntryCntrySpecificDate1プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getJrnlEntryCntrySpecificDate1() {
        return jrnlEntryCntrySpecificDate1;
    }

    /**
     * jrnlEntryCntrySpecificDate1プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setJrnlEntryCntrySpecificDate1(XMLGregorianCalendar value) {
        this.jrnlEntryCntrySpecificDate1 = value;
    }

    /**
     * jrnlEntryCntrySpecificRef2プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJrnlEntryCntrySpecificRef2() {
        return jrnlEntryCntrySpecificRef2;
    }

    /**
     * jrnlEntryCntrySpecificRef2プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJrnlEntryCntrySpecificRef2(String value) {
        this.jrnlEntryCntrySpecificRef2 = value;
    }

    /**
     * jrnlEntryCntrySpecificDate2プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getJrnlEntryCntrySpecificDate2() {
        return jrnlEntryCntrySpecificDate2;
    }

    /**
     * jrnlEntryCntrySpecificDate2プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setJrnlEntryCntrySpecificDate2(XMLGregorianCalendar value) {
        this.jrnlEntryCntrySpecificDate2 = value;
    }

    /**
     * jrnlEntryCntrySpecificRef3プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJrnlEntryCntrySpecificRef3() {
        return jrnlEntryCntrySpecificRef3;
    }

    /**
     * jrnlEntryCntrySpecificRef3プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJrnlEntryCntrySpecificRef3(String value) {
        this.jrnlEntryCntrySpecificRef3 = value;
    }

    /**
     * jrnlEntryCntrySpecificDate3プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getJrnlEntryCntrySpecificDate3() {
        return jrnlEntryCntrySpecificDate3;
    }

    /**
     * jrnlEntryCntrySpecificDate3プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setJrnlEntryCntrySpecificDate3(XMLGregorianCalendar value) {
        this.jrnlEntryCntrySpecificDate3 = value;
    }

    /**
     * jrnlEntryCntrySpecificRef4プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJrnlEntryCntrySpecificRef4() {
        return jrnlEntryCntrySpecificRef4;
    }

    /**
     * jrnlEntryCntrySpecificRef4プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJrnlEntryCntrySpecificRef4(String value) {
        this.jrnlEntryCntrySpecificRef4 = value;
    }

    /**
     * jrnlEntryCntrySpecificDate4プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getJrnlEntryCntrySpecificDate4() {
        return jrnlEntryCntrySpecificDate4;
    }

    /**
     * jrnlEntryCntrySpecificDate4プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setJrnlEntryCntrySpecificDate4(XMLGregorianCalendar value) {
        this.jrnlEntryCntrySpecificDate4 = value;
    }

    /**
     * jrnlEntryCntrySpecificRef5プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJrnlEntryCntrySpecificRef5() {
        return jrnlEntryCntrySpecificRef5;
    }

    /**
     * jrnlEntryCntrySpecificRef5プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJrnlEntryCntrySpecificRef5(String value) {
        this.jrnlEntryCntrySpecificRef5 = value;
    }

    /**
     * jrnlEntryCntrySpecificDate5プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getJrnlEntryCntrySpecificDate5() {
        return jrnlEntryCntrySpecificDate5;
    }

    /**
     * jrnlEntryCntrySpecificDate5プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setJrnlEntryCntrySpecificDate5(XMLGregorianCalendar value) {
        this.jrnlEntryCntrySpecificDate5 = value;
    }

    /**
     * jrnlEntryCntrySpecificBp1プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJrnlEntryCntrySpecificBp1() {
        return jrnlEntryCntrySpecificBp1;
    }

    /**
     * jrnlEntryCntrySpecificBp1プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJrnlEntryCntrySpecificBp1(String value) {
        this.jrnlEntryCntrySpecificBp1 = value;
    }

    /**
     * jrnlEntryCntrySpecificBp2プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJrnlEntryCntrySpecificBp2() {
        return jrnlEntryCntrySpecificBp2;
    }

    /**
     * jrnlEntryCntrySpecificBp2プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJrnlEntryCntrySpecificBp2(String value) {
        this.jrnlEntryCntrySpecificBp2 = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JournalEntryCreateRequestJournalEntryItem }
     * 
     * 
     */
    public List<JournalEntryCreateRequestJournalEntryItem> getItem() {
        if (item == null) {
            item = new ArrayList<JournalEntryCreateRequestJournalEntryItem>();
        }
        return this.item;
    }

    /**
     * Gets the value of the debtorItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the debtorItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDebtorItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JournalEntryCreateRequestJournalEntryDebtorItem }
     * 
     * 
     */
    public List<JournalEntryCreateRequestJournalEntryDebtorItem> getDebtorItem() {
        if (debtorItem == null) {
            debtorItem = new ArrayList<JournalEntryCreateRequestJournalEntryDebtorItem>();
        }
        return this.debtorItem;
    }

    /**
     * Gets the value of the creditorItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditorItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditorItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JournalEntryCreateRequestJournalEntryCreditorItem }
     * 
     * 
     */
    public List<JournalEntryCreateRequestJournalEntryCreditorItem> getCreditorItem() {
        if (creditorItem == null) {
            creditorItem = new ArrayList<JournalEntryCreateRequestJournalEntryCreditorItem>();
        }
        return this.creditorItem;
    }

    /**
     * Gets the value of the productTaxItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productTaxItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductTaxItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JournalEntryCreateRequestJournalEntryProductTaxItem }
     * 
     * 
     */
    public List<JournalEntryCreateRequestJournalEntryProductTaxItem> getProductTaxItem() {
        if (productTaxItem == null) {
            productTaxItem = new ArrayList<JournalEntryCreateRequestJournalEntryProductTaxItem>();
        }
        return this.productTaxItem;
    }

    /**
     * Gets the value of the withholdingTaxItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the withholdingTaxItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWithholdingTaxItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JournalEntryCreateRequestJournalEntryWithholdingTaxItem }
     * 
     * 
     */
    public List<JournalEntryCreateRequestJournalEntryWithholdingTaxItem> getWithholdingTaxItem() {
        if (withholdingTaxItem == null) {
            withholdingTaxItem = new ArrayList<JournalEntryCreateRequestJournalEntryWithholdingTaxItem>();
        }
        return this.withholdingTaxItem;
    }

}
