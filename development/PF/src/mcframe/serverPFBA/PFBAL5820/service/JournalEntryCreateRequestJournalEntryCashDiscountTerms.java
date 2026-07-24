
package mcframe.serverPFBA.PFBAL5820.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>JournalEntryCreateRequestJournalEntryCashDiscountTerms complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="JournalEntryCreateRequestJournalEntryCashDiscountTerms">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CashDiscountBaseAmount" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="DueCalculationBaseDate" type="{http://sap.com/xi/SAPSCORE/SFIN}Date"/>
 *         &lt;element name="CashDiscount1Days" type="{http://sap.com/xi/SAPSCORE/SFIN}DAY_Duration" minOccurs="0"/>
 *         &lt;element name="CashDiscount1Percent" type="{http://sap.com/xi/SAPSCORE/SFIN}Percent" minOccurs="0"/>
 *         &lt;element name="CashDiscount2Days" type="{http://sap.com/xi/SAPSCORE/SFIN}DAY_Duration" minOccurs="0"/>
 *         &lt;element name="CashDiscount2Percent" type="{http://sap.com/xi/SAPSCORE/SFIN}Percent" minOccurs="0"/>
 *         &lt;element name="NetPaymentDays" type="{http://sap.com/xi/SAPSCORE/SFIN}DAY_Duration"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryCreateRequestJournalEntryCashDiscountTerms", propOrder = {
    "cashDiscountBaseAmount",
    "dueCalculationBaseDate",
    "cashDiscount1Days",
    "cashDiscount1Percent",
    "cashDiscount2Days",
    "cashDiscount2Percent",
    "netPaymentDays"
})
public class JournalEntryCreateRequestJournalEntryCashDiscountTerms {

    @XmlElement(name = "CashDiscountBaseAmount")
    protected Amount cashDiscountBaseAmount;
    @XmlElement(name = "DueCalculationBaseDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueCalculationBaseDate;
    @XmlElement(name = "CashDiscount1Days")
    protected Duration cashDiscount1Days;
    @XmlElement(name = "CashDiscount1Percent")
    protected BigDecimal cashDiscount1Percent;
    @XmlElement(name = "CashDiscount2Days")
    protected Duration cashDiscount2Days;
    @XmlElement(name = "CashDiscount2Percent")
    protected BigDecimal cashDiscount2Percent;
    @XmlElement(name = "NetPaymentDays", required = true)
    protected Duration netPaymentDays;

    /**
     * cashDiscountBaseAmountプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getCashDiscountBaseAmount() {
        return cashDiscountBaseAmount;
    }

    /**
     * cashDiscountBaseAmountプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setCashDiscountBaseAmount(Amount value) {
        this.cashDiscountBaseAmount = value;
    }

    /**
     * dueCalculationBaseDateプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueCalculationBaseDate() {
        return dueCalculationBaseDate;
    }

    /**
     * dueCalculationBaseDateプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueCalculationBaseDate(XMLGregorianCalendar value) {
        this.dueCalculationBaseDate = value;
    }

    /**
     * cashDiscount1Daysプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getCashDiscount1Days() {
        return cashDiscount1Days;
    }

    /**
     * cashDiscount1Daysプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setCashDiscount1Days(Duration value) {
        this.cashDiscount1Days = value;
    }

    /**
     * cashDiscount1Percentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCashDiscount1Percent() {
        return cashDiscount1Percent;
    }

    /**
     * cashDiscount1Percentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCashDiscount1Percent(BigDecimal value) {
        this.cashDiscount1Percent = value;
    }

    /**
     * cashDiscount2Daysプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getCashDiscount2Days() {
        return cashDiscount2Days;
    }

    /**
     * cashDiscount2Daysプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setCashDiscount2Days(Duration value) {
        this.cashDiscount2Days = value;
    }

    /**
     * cashDiscount2Percentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCashDiscount2Percent() {
        return cashDiscount2Percent;
    }

    /**
     * cashDiscount2Percentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCashDiscount2Percent(BigDecimal value) {
        this.cashDiscount2Percent = value;
    }

    /**
     * netPaymentDaysプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getNetPaymentDays() {
        return netPaymentDays;
    }

    /**
     * netPaymentDaysプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setNetPaymentDays(Duration value) {
        this.netPaymentDays = value;
    }

}
