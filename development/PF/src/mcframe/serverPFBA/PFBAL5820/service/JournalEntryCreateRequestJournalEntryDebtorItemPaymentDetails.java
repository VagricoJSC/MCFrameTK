
package mcframe.serverPFBA.PFBAL5820.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>JournalEntryCreateRequestJournalEntryDebtorItemPaymentDetails complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="JournalEntryCreateRequestJournalEntryDebtorItemPaymentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AmountInPaymentCurrency" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="PaymentMethod" type="{http://sap.com/xi/SAPSCORE/SFIN}PaymentMethod" minOccurs="0"/>
 *         &lt;element name="PaymentMethodSupplement" type="{http://sap.com/xi/SAPSCORE/SFIN}PaymentMethodSupplement" minOccurs="0"/>
 *         &lt;element name="SEPAMandate" type="{http://sap.com/xi/SAPSCORE/SFIN}SEPAMandate" minOccurs="0"/>
 *         &lt;element name="PaymentReference" type="{http://sap.com/xi/SAPSCORE/SFIN}PaymentReferenceID" minOccurs="0"/>
 *         &lt;element name="PaymentReason" type="{http://sap.com/xi/SAPSCORE/SFIN}PaymentReason" minOccurs="0"/>
 *         &lt;element name="PaymentBlockingReason" type="{http://sap.com/xi/SAPSCORE/SFIN}PaymentBlockingReasonCode" minOccurs="0"/>
 *         &lt;element name="PaymentServiceProvider" type="{http://sap.com/xi/SAPSCORE/SFIN}PaymentServiceProvider" minOccurs="0"/>
 *         &lt;element name="PaymentByPaymentServicePrvdr" type="{http://sap.com/xi/SAPSCORE/SFIN}PaymentByPaymentServicePrvdr" minOccurs="0"/>
 *         &lt;element name="DigitalPaymentType" type="{http://sap.com/xi/SAPSCORE/SFIN}DigitalPaymentType" minOccurs="0"/>
 *         &lt;element name="PaymentByDigitalPaymentService" type="{http://sap.com/xi/SAPSCORE/SFIN}PaymentByDigitalPaymentService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryCreateRequestJournalEntryDebtorItemPaymentDetails", propOrder = {
    "amountInPaymentCurrency",
    "paymentMethod",
    "paymentMethodSupplement",
    "sepaMandate",
    "paymentReference",
    "paymentReason",
    "paymentBlockingReason",
    "paymentServiceProvider",
    "paymentByPaymentServicePrvdr",
    "digitalPaymentType",
    "paymentByDigitalPaymentService"
})
public class JournalEntryCreateRequestJournalEntryDebtorItemPaymentDetails {

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
    @XmlElement(name = "SEPAMandate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sepaMandate;
    @XmlElement(name = "PaymentReference")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentReference;
    @XmlElement(name = "PaymentReason")
    protected String paymentReason;
    @XmlElement(name = "PaymentBlockingReason")
    protected PaymentBlockingReasonCode paymentBlockingReason;
    @XmlElement(name = "PaymentServiceProvider")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentServiceProvider;
    @XmlElement(name = "PaymentByPaymentServicePrvdr")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentByPaymentServicePrvdr;
    @XmlElement(name = "DigitalPaymentType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String digitalPaymentType;
    @XmlElement(name = "PaymentByDigitalPaymentService")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentByDigitalPaymentService;

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
     * sepaMandateプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEPAMandate() {
        return sepaMandate;
    }

    /**
     * sepaMandateプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEPAMandate(String value) {
        this.sepaMandate = value;
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
     * paymentServiceProviderプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentServiceProvider() {
        return paymentServiceProvider;
    }

    /**
     * paymentServiceProviderプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentServiceProvider(String value) {
        this.paymentServiceProvider = value;
    }

    /**
     * paymentByPaymentServicePrvdrプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentByPaymentServicePrvdr() {
        return paymentByPaymentServicePrvdr;
    }

    /**
     * paymentByPaymentServicePrvdrプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentByPaymentServicePrvdr(String value) {
        this.paymentByPaymentServicePrvdr = value;
    }

    /**
     * digitalPaymentTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalPaymentType() {
        return digitalPaymentType;
    }

    /**
     * digitalPaymentTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalPaymentType(String value) {
        this.digitalPaymentType = value;
    }

    /**
     * paymentByDigitalPaymentServiceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentByDigitalPaymentService() {
        return paymentByDigitalPaymentService;
    }

    /**
     * paymentByDigitalPaymentServiceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentByDigitalPaymentService(String value) {
        this.paymentByDigitalPaymentService = value;
    }

}
