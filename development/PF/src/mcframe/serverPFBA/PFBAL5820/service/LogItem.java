
package mcframe.serverPFBA.PFBAL5820.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>LogItem complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="LogItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TypeID" type="{http://sap.com/xi/SAPSCORE/SFIN}LogItemTypeID" minOccurs="0"/>
 *         &lt;element name="CategoryCode" type="{http://sap.com/xi/SAPSCORE/SFIN}LogItemCategoryCode" minOccurs="0"/>
 *         &lt;element name="SeverityCode" type="{http://sap.com/xi/SAPSCORE/SFIN}LogItemSeverityCode" minOccurs="0"/>
 *         &lt;element name="ReferenceObjectNodeSenderTechnicalID" type="{http://sap.com/xi/SAPSCORE/SFIN}ObjectNodePartyTechnicalID" minOccurs="0"/>
 *         &lt;element name="ReferenceMessageElementName" type="{http://sap.com/xi/SAPSCORE/SFIN}LANGUAGEINDEPENDENT_Name" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://sap.com/xi/SAPSCORE/SFIN}LogItemNote"/>
 *         &lt;element name="NoteTemplateText" type="{http://sap.com/xi/SAPSCORE/SFIN}LogItemNoteTemplateText" minOccurs="0"/>
 *         &lt;element name="LogItemNotePlaceholderSubstitutionList" type="{http://sap.com/xi/SAPSCORE/SFIN}LogItemNotePlaceholderSubstitutionList" minOccurs="0"/>
 *         &lt;element name="WebURI" type="{http://sap.com/xi/SAPSCORE/SFIN}WebURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogItem", propOrder = {
    "typeID",
    "categoryCode",
    "severityCode",
    "referenceObjectNodeSenderTechnicalID",
    "referenceMessageElementName",
    "note",
    "noteTemplateText",
    "logItemNotePlaceholderSubstitutionList",
    "webURI"
})
public class LogItem {

    @XmlElement(name = "TypeID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeID;
    @XmlElement(name = "CategoryCode")
    protected LogItemCategoryCode categoryCode;
    @XmlElement(name = "SeverityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String severityCode;
    @XmlElement(name = "ReferenceObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceObjectNodeSenderTechnicalID;
    @XmlElement(name = "ReferenceMessageElementName")
    protected String referenceMessageElementName;
    @XmlElement(name = "Note", required = true)
    protected String note;
    @XmlElement(name = "NoteTemplateText")
    protected String noteTemplateText;
    @XmlElement(name = "LogItemNotePlaceholderSubstitutionList")
    protected LogItemNotePlaceholderSubstitutionList logItemNotePlaceholderSubstitutionList;
    @XmlElement(name = "WebURI")
    @XmlSchemaType(name = "anyURI")
    protected String webURI;

    /**
     * typeIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeID() {
        return typeID;
    }

    /**
     * typeIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeID(String value) {
        this.typeID = value;
    }

    /**
     * categoryCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link LogItemCategoryCode }
     *     
     */
    public LogItemCategoryCode getCategoryCode() {
        return categoryCode;
    }

    /**
     * categoryCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link LogItemCategoryCode }
     *     
     */
    public void setCategoryCode(LogItemCategoryCode value) {
        this.categoryCode = value;
    }

    /**
     * severityCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverityCode() {
        return severityCode;
    }

    /**
     * severityCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverityCode(String value) {
        this.severityCode = value;
    }

    /**
     * referenceObjectNodeSenderTechnicalIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceObjectNodeSenderTechnicalID() {
        return referenceObjectNodeSenderTechnicalID;
    }

    /**
     * referenceObjectNodeSenderTechnicalIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceObjectNodeSenderTechnicalID(String value) {
        this.referenceObjectNodeSenderTechnicalID = value;
    }

    /**
     * referenceMessageElementNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceMessageElementName() {
        return referenceMessageElementName;
    }

    /**
     * referenceMessageElementNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceMessageElementName(String value) {
        this.referenceMessageElementName = value;
    }

    /**
     * noteプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * noteプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * noteTemplateTextプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteTemplateText() {
        return noteTemplateText;
    }

    /**
     * noteTemplateTextプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteTemplateText(String value) {
        this.noteTemplateText = value;
    }

    /**
     * logItemNotePlaceholderSubstitutionListプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link LogItemNotePlaceholderSubstitutionList }
     *     
     */
    public LogItemNotePlaceholderSubstitutionList getLogItemNotePlaceholderSubstitutionList() {
        return logItemNotePlaceholderSubstitutionList;
    }

    /**
     * logItemNotePlaceholderSubstitutionListプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link LogItemNotePlaceholderSubstitutionList }
     *     
     */
    public void setLogItemNotePlaceholderSubstitutionList(LogItemNotePlaceholderSubstitutionList value) {
        this.logItemNotePlaceholderSubstitutionList = value;
    }

    /**
     * webURIプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebURI() {
        return webURI;
    }

    /**
     * webURIプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebURI(String value) {
        this.webURI = value;
    }

}
