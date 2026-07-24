
package mcframe.serverPFBA.PFBAL5820.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>JournalEntryCreateRequestJournalEntryDownPaymentCreditor complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="JournalEntryCreateRequestJournalEntryDownPaymentCreditor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecialGLCode" type="{http://sap.com/xi/SAPSCORE/SFIN}SpecialGLCode" minOccurs="0"/>
 *         &lt;element name="TaxItemGroup" type="{http://sap.com/xi/SAPSCORE/SFIN}TaxItemGroupID" minOccurs="0"/>
 *         &lt;element name="ProfitCenter" type="{http://sap.com/xi/SAPSCORE/SFIN}ProfitCentreID" minOccurs="0"/>
 *         &lt;element name="Wbselement" type="{http://sap.com/xi/SAPSCORE/SFIN}WBSElement" minOccurs="0"/>
 *         &lt;element name="TaxCode" type="{http://sap.com/xi/SAPSCORE/SFIN}ProductTaxationCharacteristicsCode" minOccurs="0"/>
 *         &lt;element name="TaxJurisdiction" type="{http://sap.com/xi/SAPSCORE/SFIN}TaxJurisdictionCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryCreateRequestJournalEntryDownPaymentCreditor", propOrder = {
    "specialGLCode",
    "taxItemGroup",
    "profitCenter",
    "wbselement",
    "taxCode",
    "taxJurisdiction"
})
public class JournalEntryCreateRequestJournalEntryDownPaymentCreditor {

    @XmlElement(name = "SpecialGLCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String specialGLCode;
    @XmlElement(name = "TaxItemGroup")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxItemGroup;
    @XmlElement(name = "ProfitCenter")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String profitCenter;
    @XmlElement(name = "Wbselement")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String wbselement;
    @XmlElement(name = "TaxCode")
    protected ProductTaxationCharacteristicsCode taxCode;
    @XmlElement(name = "TaxJurisdiction")
    protected TaxJurisdictionCode taxJurisdiction;

    /**
     * specialGLCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialGLCode() {
        return specialGLCode;
    }

    /**
     * specialGLCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialGLCode(String value) {
        this.specialGLCode = value;
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
     * profitCenterプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitCenter() {
        return profitCenter;
    }

    /**
     * profitCenterプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitCenter(String value) {
        this.profitCenter = value;
    }

    /**
     * wbselementプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWbselement() {
        return wbselement;
    }

    /**
     * wbselementプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWbselement(String value) {
        this.wbselement = value;
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

}
