
package mcframe.serverPFBA.PFBAL5820.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BusinessScope complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="BusinessScope">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TypeCode" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessScopeTypeCode"/>
 *         &lt;element name="InstanceID" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessScopeInstanceID" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessScopeID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessScope", propOrder = {
    "typeCode",
    "instanceID",
    "id"
})
public class BusinessScope {

    @XmlElement(name = "TypeCode", required = true)
    protected BusinessScopeTypeCode typeCode;
    @XmlElement(name = "InstanceID")
    protected BusinessScopeInstanceID instanceID;
    @XmlElement(name = "ID")
    protected BusinessScopeID id;

    /**
     * typeCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BusinessScopeTypeCode }
     *     
     */
    public BusinessScopeTypeCode getTypeCode() {
        return typeCode;
    }

    /**
     * typeCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessScopeTypeCode }
     *     
     */
    public void setTypeCode(BusinessScopeTypeCode value) {
        this.typeCode = value;
    }

    /**
     * instanceIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BusinessScopeInstanceID }
     *     
     */
    public BusinessScopeInstanceID getInstanceID() {
        return instanceID;
    }

    /**
     * instanceIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessScopeInstanceID }
     *     
     */
    public void setInstanceID(BusinessScopeInstanceID value) {
        this.instanceID = value;
    }

    /**
     * idプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BusinessScopeID }
     *     
     */
    public BusinessScopeID getID() {
        return id;
    }

    /**
     * idプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessScopeID }
     *     
     */
    public void setID(BusinessScopeID value) {
        this.id = value;
    }

}
