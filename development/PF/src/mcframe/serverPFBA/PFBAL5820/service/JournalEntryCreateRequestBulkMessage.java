
package mcframe.serverPFBA.PFBAL5820.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>JournalEntryCreateRequestBulkMessage complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="JournalEntryCreateRequestBulkMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageHeader" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessDocumentMessageHeader"/>
 *         &lt;element name="JournalEntryCreateRequest" type="{http://sap.com/xi/SAPSCORE/SFIN}JournalEntryCreateRequestMessage" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryCreateRequestBulkMessage", propOrder = {
    "messageHeader",
    "journalEntryCreateRequest"
})
public class JournalEntryCreateRequestBulkMessage {

    @XmlElement(name = "MessageHeader", required = true)
    protected BusinessDocumentMessageHeader messageHeader;
    @XmlElement(name = "JournalEntryCreateRequest", required = true)
    protected List<JournalEntryCreateRequestMessage> journalEntryCreateRequest;

    /**
     * messageHeaderプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentMessageHeader }
     *     
     */
    public BusinessDocumentMessageHeader getMessageHeader() {
        return messageHeader;
    }

    /**
     * messageHeaderプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentMessageHeader }
     *     
     */
    public void setMessageHeader(BusinessDocumentMessageHeader value) {
        this.messageHeader = value;
    }

    /**
     * Gets the value of the journalEntryCreateRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journalEntryCreateRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJournalEntryCreateRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JournalEntryCreateRequestMessage }
     * 
     * 
     */
    public List<JournalEntryCreateRequestMessage> getJournalEntryCreateRequest() {
        if (journalEntryCreateRequest == null) {
            journalEntryCreateRequest = new ArrayList<JournalEntryCreateRequestMessage>();
        }
        return this.journalEntryCreateRequest;
    }

}
