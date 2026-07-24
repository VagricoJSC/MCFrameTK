
package mcframe.serverPFBA.PFBAL5820.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>JournalEntryCreateRequestJournalEntryTaxDetails complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="JournalEntryCreateRequestJournalEntryTaxDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxCode" type="{http://sap.com/xi/SAPSCORE/SFIN}ProductTaxationCharacteristicsCode"/>
 *         &lt;element name="TaxJurisdiction" type="{http://sap.com/xi/SAPSCORE/SFIN}TaxJurisdictionCode" minOccurs="0"/>
 *         &lt;element name="TaxItemGroup" type="{http://sap.com/xi/SAPSCORE/SFIN}TaxItemGroupID" minOccurs="0"/>
 *         &lt;element name="TaxCountry" type="{http://sap.com/xi/SAPSCORE/SFIN}CountryCode" minOccurs="0"/>
 *         &lt;element name="TaxExpenseAmountInTransacCrcy" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="TaxExpenseAmountInCoCodeCrcy" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="TaxExpenseAmountInGroupCrcy" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *         &lt;element name="TaxExpenseAmountInFreeDefinedCrcy1" type="{http://sap.com/xi/SAPSCORE/SFIN}Amount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryCreateRequestJournalEntryTaxDetails", propOrder = {
    "taxCode",
    "taxJurisdiction",
    "taxItemGroup",
    "taxCountry",
    "taxExpenseAmountInTransacCrcy",
    "taxExpenseAmountInCoCodeCrcy",
    "taxExpenseAmountInGroupCrcy",
    "taxExpenseAmountInFreeDefinedCrcy1"
})
public class JournalEntryCreateRequestJournalEntryTaxDetails {

    @XmlElement(name = "TaxCode", required = true)
    protected ProductTaxationCharacteristicsCode taxCode;
    @XmlElement(name = "TaxJurisdiction")
    protected TaxJurisdictionCode taxJurisdiction;
    @XmlElement(name = "TaxItemGroup")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxItemGroup;
    @XmlElement(name = "TaxCountry")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxCountry;
    @XmlElement(name = "TaxExpenseAmountInTransacCrcy")
    protected Amount taxExpenseAmountInTransacCrcy;
    @XmlElement(name = "TaxExpenseAmountInCoCodeCrcy")
    protected Amount taxExpenseAmountInCoCodeCrcy;
    @XmlElement(name = "TaxExpenseAmountInGroupCrcy")
    protected Amount taxExpenseAmountInGroupCrcy;
    @XmlElement(name = "TaxExpenseAmountInFreeDefinedCrcy1")
    protected Amount taxExpenseAmountInFreeDefinedCrcy1;

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
     * taxExpenseAmountInTransacCrcyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getTaxExpenseAmountInTransacCrcy() {
        return taxExpenseAmountInTransacCrcy;
    }

    /**
     * taxExpenseAmountInTransacCrcyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setTaxExpenseAmountInTransacCrcy(Amount value) {
        this.taxExpenseAmountInTransacCrcy = value;
    }

    /**
     * taxExpenseAmountInCoCodeCrcyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getTaxExpenseAmountInCoCodeCrcy() {
        return taxExpenseAmountInCoCodeCrcy;
    }

    /**
     * taxExpenseAmountInCoCodeCrcyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setTaxExpenseAmountInCoCodeCrcy(Amount value) {
        this.taxExpenseAmountInCoCodeCrcy = value;
    }

    /**
     * taxExpenseAmountInGroupCrcyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getTaxExpenseAmountInGroupCrcy() {
        return taxExpenseAmountInGroupCrcy;
    }

    /**
     * taxExpenseAmountInGroupCrcyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setTaxExpenseAmountInGroupCrcy(Amount value) {
        this.taxExpenseAmountInGroupCrcy = value;
    }

    /**
     * taxExpenseAmountInFreeDefinedCrcy1プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getTaxExpenseAmountInFreeDefinedCrcy1() {
        return taxExpenseAmountInFreeDefinedCrcy1;
    }

    /**
     * taxExpenseAmountInFreeDefinedCrcy1プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setTaxExpenseAmountInFreeDefinedCrcy1(Amount value) {
        this.taxExpenseAmountInFreeDefinedCrcy1 = value;
    }

}
