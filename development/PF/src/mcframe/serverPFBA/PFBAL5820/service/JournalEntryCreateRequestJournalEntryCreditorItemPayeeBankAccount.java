
package mcframe.serverPFBA.PFBAL5820.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>JournalEntryCreateRequestJournalEntryCreditorItemPayeeBankAccount complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="JournalEntryCreateRequestJournalEntryCreditorItemPayeeBankAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Country" type="{http://sap.com/xi/SAPSCORE/SFIN}CountryCode"/>
 *         &lt;element name="BankNumber" type="{http://sap.com/xi/SAPSCORE/SFIN}BankNumber" minOccurs="0"/>
 *         &lt;element name="SWIFTCode" type="{http://sap.com/xi/SAPSCORE/SFIN}BankStandardID" minOccurs="0"/>
 *         &lt;element name="BankAccount" type="{http://sap.com/xi/SAPSCORE/SFIN}BankAccount" minOccurs="0"/>
 *         &lt;element name="IBAN" type="{http://sap.com/xi/SAPSCORE/SFIN}BankAccountStandardID" minOccurs="0"/>
 *         &lt;element name="BankAccountHolderName" type="{http://sap.com/xi/SAPSCORE/SFIN}BankAccountHolderName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryCreateRequestJournalEntryCreditorItemPayeeBankAccount", propOrder = {
    "country",
    "bankNumber",
    "swiftCode",
    "bankAccount",
    "iban",
    "bankAccountHolderName"
})
public class JournalEntryCreateRequestJournalEntryCreditorItemPayeeBankAccount {

    @XmlElement(name = "Country", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String country;
    @XmlElement(name = "BankNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankNumber;
    @XmlElement(name = "SWIFTCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String swiftCode;
    @XmlElement(name = "BankAccount")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankAccount;
    @XmlElement(name = "IBAN")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String iban;
    @XmlElement(name = "BankAccountHolderName")
    protected String bankAccountHolderName;

    /**
     * countryプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * countryプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * bankNumberプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankNumber() {
        return bankNumber;
    }

    /**
     * bankNumberプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankNumber(String value) {
        this.bankNumber = value;
    }

    /**
     * swiftCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWIFTCode() {
        return swiftCode;
    }

    /**
     * swiftCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWIFTCode(String value) {
        this.swiftCode = value;
    }

    /**
     * bankAccountプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * bankAccountプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccount(String value) {
        this.bankAccount = value;
    }

    /**
     * ibanプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * ibanプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * bankAccountHolderNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountHolderName() {
        return bankAccountHolderName;
    }

    /**
     * bankAccountHolderNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountHolderName(String value) {
        this.bankAccountHolderName = value;
    }

}
