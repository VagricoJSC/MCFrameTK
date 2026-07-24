
package mcframe.serverPFBA.PFBAL5820.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>JournalEntryCreateRequestJournalEntryCreditorItemPaymentDetails complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="JournalEntryCreateRequestJournalEntryCreditorItemPaymentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AmountInPaymentCurrency" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{http://sap.com/xi/SAPSCORE/SFIN}PaymentMethod" minOccurs="0"/>
 *         &lt;element name="PaymentMethodSupplement" type="{http://sap.com/xi/SAPSCORE/SFIN}PaymentMethodSupplement" minOccurs="0"/>
 *         &lt;element name="PaymentReference" type="{http://sap.com/xi/SAPSCORE/SFIN}PaymentReferenceID" minOccurs="0"/>
 *         &lt;element name="PaymentReason" type="{http://sap.com/xi/SAPSCORE/SFIN}PaymentReason" minOccurs="0"/>
 *         &lt;element name="PaymentBlockingReason" type="{http://sap.com/xi/SAPSCORE/SFIN}PaymentBlockingReasonCode" minOccurs="0"/>
 *         &lt;element name="AlternativePayee" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessPartnerInternalID" minOccurs="0"/>
 *         &lt;element name="PayeeBankAccount" type="{http://sap.com/xi/SAPSCORE/SFIN}JournalEntryCreateRequestJournalEntryCreditorItemPayeeBankAccount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryCreateRequestJournalEntryCreditorItemPaymentDetails", propOrder = {
    "amountInPaymentCurrency",
    "paymentMethod",
    "paymentMethodSupplement",
    "paymentReference",
    "paymentReason",
    "paymentBlockingReason",
    "alternativePayee",
    "payeeBankAccount"
})
public class JournalEntryCreateRequestJournalEntryCreditorItemPaymentDetails {

    @XmlElement(name = "AmountInPaymentCurrency")
    protected Amount amountInPaymentCurrency;
    @XmlElement(name = "PaymentMethod")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentMethod;
    @XmlElement(name = "PaymentMethodSupplement")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentMethodSupplement;
    @XmlElement(name = "PaymentReference")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentReference;
    @XmlElement(name = "PaymentReason")
    protected String paymentReason;
    @XmlElement(name = "PaymentBlockingReason")
    protected PaymentBlockingReasonCode paymentBlockingReason;
    @XmlElement(name = "AlternativePayee")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String alternativePayee;
    @XmlElement(name = "PayeeBankAccount")
    protected JournalEntryCreateRequestJournalEntryCreditorItemPayeeBankAccount payeeBankAccount;

    /**
     * amountInPaymentCurrencyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAmountInPaymentCurrency() {
        return amountInPaymentCurrency;
    }

    /**
     * amountInPaymentCurrencyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAmountInPaymentCurrency(Amount value) {
        this.amountInPaymentCurrency = value;
    }

    /**
     * paymentMethodプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * paymentMethodプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * paymentMethodSupplementプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodSupplement() {
        return paymentMethodSupplement;
    }

    /**
     * paymentMethodSupplementプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodSupplement(String value) {
        this.paymentMethodSupplement = value;
    }

    /**
     * paymentReferenceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentReference() {
        return paymentReference;
    }

    /**
     * paymentReferenceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentReference(String value) {
        this.paymentReference = value;
    }

    /**
     * paymentReasonプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentReason() {
        return paymentReason;
    }

    /**
     * paymentReasonプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentReason(String value) {
        this.paymentReason = value;
    }

    /**
     * paymentBlockingReasonプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link PaymentBlockingReasonCode }
     *     
     */
    public PaymentBlockingReasonCode getPaymentBlockingReason() {
        return paymentBlockingReason;
    }

    /**
     * paymentBlockingReasonプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentBlockingReasonCode }
     *     
     */
    public void setPaymentBlockingReason(PaymentBlockingReasonCode value) {
        this.paymentBlockingReason = value;
    }

    /**
     * alternativePayeeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativePayee() {
        return alternativePayee;
    }

    /**
     * alternativePayeeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativePayee(String value) {
        this.alternativePayee = value;
    }

    /**
     * payeeBankAccountプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link JournalEntryCreateRequestJournalEntryCreditorItemPayeeBankAccount }
     *     
     */
    public JournalEntryCreateRequestJournalEntryCreditorItemPayeeBankAccount getPayeeBankAccount() {
        return payeeBankAccount;
    }

    /**
     * payeeBankAccountプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link JournalEntryCreateRequestJournalEntryCreditorItemPayeeBankAccount }
     *     
     */
    public void setPayeeBankAccount(JournalEntryCreateRequestJournalEntryCreditorItemPayeeBankAccount value) {
        this.payeeBankAccount = value;
    }

}
