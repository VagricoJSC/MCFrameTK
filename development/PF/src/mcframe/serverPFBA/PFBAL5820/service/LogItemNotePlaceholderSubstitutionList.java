
package mcframe.serverPFBA.PFBAL5820.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>LogItemNotePlaceholderSubstitutionList complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="LogItemNotePlaceholderSubstitutionList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FirstPlaceholderID" type="{http://sap.com/xi/SAPSCORE/SFIN}LogItemTemplatePlaceholderID"/>
 *         &lt;element name="SecondPlaceholderID" type="{http://sap.com/xi/SAPSCORE/SFIN}LogItemTemplatePlaceholderID" minOccurs="0"/>
 *         &lt;element name="ThirdPlaceholderID" type="{http://sap.com/xi/SAPSCORE/SFIN}LogItemTemplatePlaceholderID" minOccurs="0"/>
 *         &lt;element name="FourthPlaceholderID" type="{http://sap.com/xi/SAPSCORE/SFIN}LogItemTemplatePlaceholderID" minOccurs="0"/>
 *         &lt;element name="FirstPlaceholderSubstitutionText" type="{http://sap.com/xi/SAPSCORE/SFIN}LogItemPlaceholderSubstitutionText"/>
 *         &lt;element name="SecondPlaceholderSubstitutionText" type="{http://sap.com/xi/SAPSCORE/SFIN}LogItemPlaceholderSubstitutionText" minOccurs="0"/>
 *         &lt;element name="ThirdPlaceholderSubstitutionText" type="{http://sap.com/xi/SAPSCORE/SFIN}LogItemPlaceholderSubstitutionText" minOccurs="0"/>
 *         &lt;element name="FourthPlaceholderSubstitutionText" type="{http://sap.com/xi/SAPSCORE/SFIN}LogItemPlaceholderSubstitutionText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogItemNotePlaceholderSubstitutionList", propOrder = {
    "firstPlaceholderID",
    "secondPlaceholderID",
    "thirdPlaceholderID",
    "fourthPlaceholderID",
    "firstPlaceholderSubstitutionText",
    "secondPlaceholderSubstitutionText",
    "thirdPlaceholderSubstitutionText",
    "fourthPlaceholderSubstitutionText"
})
public class LogItemNotePlaceholderSubstitutionList {

    @XmlElement(name = "FirstPlaceholderID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String firstPlaceholderID;
    @XmlElement(name = "SecondPlaceholderID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String secondPlaceholderID;
    @XmlElement(name = "ThirdPlaceholderID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String thirdPlaceholderID;
    @XmlElement(name = "FourthPlaceholderID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fourthPlaceholderID;
    @XmlElement(name = "FirstPlaceholderSubstitutionText", required = true)
    protected String firstPlaceholderSubstitutionText;
    @XmlElement(name = "SecondPlaceholderSubstitutionText")
    protected String secondPlaceholderSubstitutionText;
    @XmlElement(name = "ThirdPlaceholderSubstitutionText")
    protected String thirdPlaceholderSubstitutionText;
    @XmlElement(name = "FourthPlaceholderSubstitutionText")
    protected String fourthPlaceholderSubstitutionText;

    /**
     * firstPlaceholderIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstPlaceholderID() {
        return firstPlaceholderID;
    }

    /**
     * firstPlaceholderIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstPlaceholderID(String value) {
        this.firstPlaceholderID = value;
    }

    /**
     * secondPlaceholderIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondPlaceholderID() {
        return secondPlaceholderID;
    }

    /**
     * secondPlaceholderIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondPlaceholderID(String value) {
        this.secondPlaceholderID = value;
    }

    /**
     * thirdPlaceholderIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPlaceholderID() {
        return thirdPlaceholderID;
    }

    /**
     * thirdPlaceholderIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPlaceholderID(String value) {
        this.thirdPlaceholderID = value;
    }

    /**
     * fourthPlaceholderIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFourthPlaceholderID() {
        return fourthPlaceholderID;
    }

    /**
     * fourthPlaceholderIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFourthPlaceholderID(String value) {
        this.fourthPlaceholderID = value;
    }

    /**
     * firstPlaceholderSubstitutionTextプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstPlaceholderSubstitutionText() {
        return firstPlaceholderSubstitutionText;
    }

    /**
     * firstPlaceholderSubstitutionTextプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstPlaceholderSubstitutionText(String value) {
        this.firstPlaceholderSubstitutionText = value;
    }

    /**
     * secondPlaceholderSubstitutionTextプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondPlaceholderSubstitutionText() {
        return secondPlaceholderSubstitutionText;
    }

    /**
     * secondPlaceholderSubstitutionTextプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondPlaceholderSubstitutionText(String value) {
        this.secondPlaceholderSubstitutionText = value;
    }

    /**
     * thirdPlaceholderSubstitutionTextプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPlaceholderSubstitutionText() {
        return thirdPlaceholderSubstitutionText;
    }

    /**
     * thirdPlaceholderSubstitutionTextプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPlaceholderSubstitutionText(String value) {
        this.thirdPlaceholderSubstitutionText = value;
    }

    /**
     * fourthPlaceholderSubstitutionTextプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFourthPlaceholderSubstitutionText() {
        return fourthPlaceholderSubstitutionText;
    }

    /**
     * fourthPlaceholderSubstitutionTextプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFourthPlaceholderSubstitutionText(String value) {
        this.fourthPlaceholderSubstitutionText = value;
    }

}
