
package mcframe.serverPFBA.PFBAL5820.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>JournalEntryCreateRequestJournalEntryDownPayment complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="JournalEntryCreateRequestJournalEntryDownPayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecialGLCode" type="{http://sap.com/xi/SAPSCORE/SFIN}SpecialGLCode" minOccurs="0"/>
 *         &lt;element name="SalesOrder" type="{http://sap.com/xi/SAPSCORE/SFIN}SalesOrder" minOccurs="0"/>
 *         &lt;element name="SalesOrderItem" type="{http://sap.com/xi/SAPSCORE/SFIN}SalesOrderItem" minOccurs="0"/>
 *         &lt;element name="TaxItemGroup" type="{http://sap.com/xi/SAPSCORE/SFIN}TaxItemGroupID" minOccurs="0"/>
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
@XmlType(name = "JournalEntryCreateRequestJournalEntryDownPayment", propOrder = {
    "specialGLCode",
    "salesOrder",
    "salesOrderItem",
    "taxItemGroup",
    "taxCode",
    "taxJurisdiction"
})
public class JournalEntryCreateRequestJournalEntryDownPayment {

    @XmlElement(name = "SpecialGLCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String specialGLCode;
    @XmlElement(name = "SalesOrder")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String salesOrder;
    @XmlElement(name = "SalesOrderItem")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String salesOrderItem;
    @XmlElement(name = "TaxItemGroup")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxItemGroup;
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
     * salesOrderプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrder() {
        return salesOrder;
    }

    /**
     * salesOrderプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrder(String value) {
        this.salesOrder = value;
    }

    /**
     * salesOrderItemプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrderItem() {
        return salesOrderItem;
    }

    /**
     * salesOrderItemプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrderItem(String value) {
        this.salesOrderItem = value;
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
