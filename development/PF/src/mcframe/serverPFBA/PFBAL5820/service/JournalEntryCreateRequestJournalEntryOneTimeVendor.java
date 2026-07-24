
package mcframe.serverPFBA.PFBAL5820.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>JournalEntryCreateRequestJournalEntryOneTimeVendor complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="JournalEntryCreateRequestJournalEntryOneTimeVendor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TitleVendor" type="{http://sap.com/xi/SAPSCORE/SFIN}Title" minOccurs="0"/>
 *         &lt;element name="LanguageISOCode" type="{http://sap.com/xi/SAPSCORE/SFIN}LanguageISOCode" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://sap.com/xi/SAPSCORE/SFIN}Name" minOccurs="0"/>
 *         &lt;element name="Name2" type="{http://sap.com/xi/SAPSCORE/SFIN}Name" minOccurs="0"/>
 *         &lt;element name="Name3" type="{http://sap.com/xi/SAPSCORE/SFIN}Name" minOccurs="0"/>
 *         &lt;element name="Name4" type="{http://sap.com/xi/SAPSCORE/SFIN}Name" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://sap.com/xi/SAPSCORE/SFIN}Email" minOccurs="0"/>
 *         &lt;element name="ShortStreetName" type="{http://sap.com/xi/SAPSCORE/SFIN}StreetName" minOccurs="0"/>
 *         &lt;element name="VendorPostOfficeBox" type="{http://sap.com/xi/SAPSCORE/SFIN}PostOfficeBox" minOccurs="0"/>
 *         &lt;element name="PostOfficeBoxPostlCode" type="{http://sap.com/xi/SAPSCORE/SFIN}PostOfficeBoxPostalCode" minOccurs="0"/>
 *         &lt;element name="PostlCodeforVendor" type="{http://sap.com/xi/SAPSCORE/SFIN}PostlCode" minOccurs="0"/>
 *         &lt;element name="BankDetailsReference" type="{http://sap.com/xi/SAPSCORE/SFIN}BankDetailReference" minOccurs="0"/>
 *         &lt;element name="DataMediumExchangeKey" type="{http://sap.com/xi/SAPSCORE/SFIN}DataMediumExchangeKey" minOccurs="0"/>
 *         &lt;element name="DataMediumExchangeIndicator" type="{http://sap.com/xi/SAPSCORE/SFIN}DataMediumExchangeIndicator" minOccurs="0"/>
 *         &lt;element name="IsNaturalPerson" type="{http://sap.com/xi/SAPSCORE/SFIN}IsNaturalPerson" minOccurs="0"/>
 *         &lt;element name="OneTmeAcctIsEqualizationTxSubj" type="{http://sap.com/xi/SAPSCORE/SFIN}OneTmeAcctIsEqualizationTxSubj" minOccurs="0"/>
 *         &lt;element name="BankAccount" type="{http://sap.com/xi/SAPSCORE/SFIN}BankAccount" minOccurs="0"/>
 *         &lt;element name="BankNumber" type="{http://sap.com/xi/SAPSCORE/SFIN}BankNumber" minOccurs="0"/>
 *         &lt;element name="BankControlKey" type="{http://sap.com/xi/SAPSCORE/SFIN}BankControlKey" minOccurs="0"/>
 *         &lt;element name="BankCountry" type="{http://sap.com/xi/SAPSCORE/SFIN}BankCountry" minOccurs="0"/>
 *         &lt;element name="CityName" type="{http://sap.com/xi/SAPSCORE/SFIN}CityName" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://sap.com/xi/SAPSCORE/SFIN}CountryCode" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://sap.com/xi/SAPSCORE/SFIN}Region" minOccurs="0"/>
 *         &lt;element name="TaxNumber1" type="{http://sap.com/xi/SAPSCORE/SFIN}TaxNumber1" minOccurs="0"/>
 *         &lt;element name="TaxNumber2" type="{http://sap.com/xi/SAPSCORE/SFIN}TaxNumber2" minOccurs="0"/>
 *         &lt;element name="TaxNumber3" type="{http://sap.com/xi/SAPSCORE/SFIN}TaxNumber3" minOccurs="0"/>
 *         &lt;element name="TaxNumber4" type="{http://sap.com/xi/SAPSCORE/SFIN}TaxNumber4" minOccurs="0"/>
 *         &lt;element name="TaxNumber5" type="{http://sap.com/xi/SAPSCORE/SFIN}TaxNumber5" minOccurs="0"/>
 *         &lt;element name="TaxNumberType" type="{http://sap.com/xi/SAPSCORE/SFIN}TaxNumberType" minOccurs="0"/>
 *         &lt;element name="TaxType" type="{http://sap.com/xi/SAPSCORE/SFIN}TaxType" minOccurs="0"/>
 *         &lt;element name="VATLiability" type="{http://sap.com/xi/SAPSCORE/SFIN}VATLiability" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryCreateRequestJournalEntryOneTimeVendor", propOrder = {
    "titleVendor",
    "languageISOCode",
    "name",
    "name2",
    "name3",
    "name4",
    "email",
    "shortStreetName",
    "vendorPostOfficeBox",
    "postOfficeBoxPostlCode",
    "postlCodeforVendor",
    "bankDetailsReference",
    "dataMediumExchangeKey",
    "dataMediumExchangeIndicator",
    "isNaturalPerson",
    "oneTmeAcctIsEqualizationTxSubj",
    "bankAccount",
    "bankNumber",
    "bankControlKey",
    "bankCountry",
    "cityName",
    "country",
    "region",
    "taxNumber1",
    "taxNumber2",
    "taxNumber3",
    "taxNumber4",
    "taxNumber5",
    "taxNumberType",
    "taxType",
    "vatLiability"
})
public class JournalEntryCreateRequestJournalEntryOneTimeVendor {

    @XmlElement(name = "TitleVendor")
    protected String titleVendor;
    @XmlElement(name = "LanguageISOCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String languageISOCode;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Name2")
    protected String name2;
    @XmlElement(name = "Name3")
    protected String name3;
    @XmlElement(name = "Name4")
    protected String name4;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "ShortStreetName")
    protected String shortStreetName;
    @XmlElement(name = "VendorPostOfficeBox")
    protected String vendorPostOfficeBox;
    @XmlElement(name = "PostOfficeBoxPostlCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String postOfficeBoxPostlCode;
    @XmlElement(name = "PostlCodeforVendor")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String postlCodeforVendor;
    @XmlElement(name = "BankDetailsReference")
    protected String bankDetailsReference;
    @XmlElement(name = "DataMediumExchangeKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dataMediumExchangeKey;
    @XmlElement(name = "DataMediumExchangeIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dataMediumExchangeIndicator;
    @XmlElement(name = "IsNaturalPerson")
    protected String isNaturalPerson;
    @XmlElement(name = "OneTmeAcctIsEqualizationTxSubj")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String oneTmeAcctIsEqualizationTxSubj;
    @XmlElement(name = "BankAccount")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankAccount;
    @XmlElement(name = "BankNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankNumber;
    @XmlElement(name = "BankControlKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankControlKey;
    @XmlElement(name = "BankCountry")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankCountry;
    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "Country")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String country;
    @XmlElement(name = "Region")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String region;
    @XmlElement(name = "TaxNumber1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxNumber1;
    @XmlElement(name = "TaxNumber2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxNumber2;
    @XmlElement(name = "TaxNumber3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxNumber3;
    @XmlElement(name = "TaxNumber4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxNumber4;
    @XmlElement(name = "TaxNumber5")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxNumber5;
    @XmlElement(name = "TaxNumberType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxNumberType;
    @XmlElement(name = "TaxType")
    protected String taxType;
    @XmlElement(name = "VATLiability")
    protected String vatLiability;

    /**
     * titleVendorプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleVendor() {
        return titleVendor;
    }

    /**
     * titleVendorプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleVendor(String value) {
        this.titleVendor = value;
    }

    /**
     * languageISOCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageISOCode() {
        return languageISOCode;
    }

    /**
     * languageISOCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageISOCode(String value) {
        this.languageISOCode = value;
    }

    /**
     * nameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * nameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * name2プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName2() {
        return name2;
    }

    /**
     * name2プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName2(String value) {
        this.name2 = value;
    }

    /**
     * name3プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName3() {
        return name3;
    }

    /**
     * name3プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName3(String value) {
        this.name3 = value;
    }

    /**
     * name4プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName4() {
        return name4;
    }

    /**
     * name4プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName4(String value) {
        this.name4 = value;
    }

    /**
     * emailプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * emailプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * shortStreetNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortStreetName() {
        return shortStreetName;
    }

    /**
     * shortStreetNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortStreetName(String value) {
        this.shortStreetName = value;
    }

    /**
     * vendorPostOfficeBoxプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorPostOfficeBox() {
        return vendorPostOfficeBox;
    }

    /**
     * vendorPostOfficeBoxプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorPostOfficeBox(String value) {
        this.vendorPostOfficeBox = value;
    }

    /**
     * postOfficeBoxPostlCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostOfficeBoxPostlCode() {
        return postOfficeBoxPostlCode;
    }

    /**
     * postOfficeBoxPostlCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostOfficeBoxPostlCode(String value) {
        this.postOfficeBoxPostlCode = value;
    }

    /**
     * postlCodeforVendorプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostlCodeforVendor() {
        return postlCodeforVendor;
    }

    /**
     * postlCodeforVendorプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostlCodeforVendor(String value) {
        this.postlCodeforVendor = value;
    }

    /**
     * bankDetailsReferenceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankDetailsReference() {
        return bankDetailsReference;
    }

    /**
     * bankDetailsReferenceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankDetailsReference(String value) {
        this.bankDetailsReference = value;
    }

    /**
     * dataMediumExchangeKeyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataMediumExchangeKey() {
        return dataMediumExchangeKey;
    }

    /**
     * dataMediumExchangeKeyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataMediumExchangeKey(String value) {
        this.dataMediumExchangeKey = value;
    }

    /**
     * dataMediumExchangeIndicatorプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataMediumExchangeIndicator() {
        return dataMediumExchangeIndicator;
    }

    /**
     * dataMediumExchangeIndicatorプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataMediumExchangeIndicator(String value) {
        this.dataMediumExchangeIndicator = value;
    }

    /**
     * isNaturalPersonプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsNaturalPerson() {
        return isNaturalPerson;
    }

    /**
     * isNaturalPersonプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsNaturalPerson(String value) {
        this.isNaturalPerson = value;
    }

    /**
     * oneTmeAcctIsEqualizationTxSubjプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneTmeAcctIsEqualizationTxSubj() {
        return oneTmeAcctIsEqualizationTxSubj;
    }

    /**
     * oneTmeAcctIsEqualizationTxSubjプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneTmeAcctIsEqualizationTxSubj(String value) {
        this.oneTmeAcctIsEqualizationTxSubj = value;
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
     * bankControlKeyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankControlKey() {
        return bankControlKey;
    }

    /**
     * bankControlKeyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankControlKey(String value) {
        this.bankControlKey = value;
    }

    /**
     * bankCountryプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCountry() {
        return bankCountry;
    }

    /**
     * bankCountryプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCountry(String value) {
        this.bankCountry = value;
    }

    /**
     * cityNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * cityNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

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
     * regionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * regionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * taxNumber1プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNumber1() {
        return taxNumber1;
    }

    /**
     * taxNumber1プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNumber1(String value) {
        this.taxNumber1 = value;
    }

    /**
     * taxNumber2プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNumber2() {
        return taxNumber2;
    }

    /**
     * taxNumber2プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNumber2(String value) {
        this.taxNumber2 = value;
    }

    /**
     * taxNumber3プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNumber3() {
        return taxNumber3;
    }

    /**
     * taxNumber3プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNumber3(String value) {
        this.taxNumber3 = value;
    }

    /**
     * taxNumber4プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNumber4() {
        return taxNumber4;
    }

    /**
     * taxNumber4プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNumber4(String value) {
        this.taxNumber4 = value;
    }

    /**
     * taxNumber5プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNumber5() {
        return taxNumber5;
    }

    /**
     * taxNumber5プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNumber5(String value) {
        this.taxNumber5 = value;
    }

    /**
     * taxNumberTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNumberType() {
        return taxNumberType;
    }

    /**
     * taxNumberTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNumberType(String value) {
        this.taxNumberType = value;
    }

    /**
     * taxTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxType() {
        return taxType;
    }

    /**
     * taxTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxType(String value) {
        this.taxType = value;
    }

    /**
     * vatLiabilityプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATLiability() {
        return vatLiability;
    }

    /**
     * vatLiabilityプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATLiability(String value) {
        this.vatLiability = value;
    }

}
