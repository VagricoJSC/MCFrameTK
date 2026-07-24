
package mcframe.serverPFBA.PFBAL5820.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>JournalEntryCreateRequestMessage complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="JournalEntryCreateRequestMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageHeader" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessDocumentMessageHeader"/>
 *         &lt;element name="JournalEntry" type="{http://sap.com/xi/SAPSCORE/SFIN}JournalEntryCreateRequestJournalEntry"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryCreateRequestMessage", propOrder = {
    "messageHeader",
    "journalEntry"
})
public class JournalEntryCreateRequestMessage {

    @XmlElement(name = "MessageHeader", required = true)
    protected BusinessDocumentMessageHeader messageHeader;
    @XmlElement(name = "JournalEntry", required = true)
    protected JournalEntryCreateRequestJournalEntry journalEntry;

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
     * journalEntryプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link JournalEntryCreateRequestJournalEntry }
     *     
     */
    public JournalEntryCreateRequestJournalEntry getJournalEntry() {
        return journalEntry;
    }

    /**
     * journalEntryプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link JournalEntryCreateRequestJournalEntry }
     *     
     */
    public void setJournalEntry(JournalEntryCreateRequestJournalEntry value) {
        this.journalEntry = value;
    }

}
