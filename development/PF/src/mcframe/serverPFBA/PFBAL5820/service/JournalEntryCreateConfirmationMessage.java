
package mcframe.serverPFBA.PFBAL5820.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>JournalEntryCreateConfirmationMessage complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="JournalEntryCreateConfirmationMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageHeader" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessDocumentMessageHeader"/>
 *         &lt;element name="JournalEntryCreateConfirmation" type="{http://sap.com/xi/SAPSCORE/SFIN}JournalEntryCreateConfirmationJournalEntry" minOccurs="0"/>
 *         &lt;element name="Log" type="{http://sap.com/xi/SAPSCORE/SFIN}Log" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryCreateConfirmationMessage", propOrder = {
    "messageHeader",
    "journalEntryCreateConfirmation",
    "log"
})
public class JournalEntryCreateConfirmationMessage {

    @XmlElement(name = "MessageHeader", required = true)
    protected BusinessDocumentMessageHeader messageHeader;
    @XmlElement(name = "JournalEntryCreateConfirmation")
    protected JournalEntryCreateConfirmationJournalEntry journalEntryCreateConfirmation;
    @XmlElement(name = "Log")
    protected Log log;

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
     * journalEntryCreateConfirmationプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link JournalEntryCreateConfirmationJournalEntry }
     *     
     */
    public JournalEntryCreateConfirmationJournalEntry getJournalEntryCreateConfirmation() {
        return journalEntryCreateConfirmation;
    }

    /**
     * journalEntryCreateConfirmationプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link JournalEntryCreateConfirmationJournalEntry }
     *     
     */
    public void setJournalEntryCreateConfirmation(JournalEntryCreateConfirmationJournalEntry value) {
        this.journalEntryCreateConfirmation = value;
    }

    /**
     * logプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Log }
     *     
     */
    public Log getLog() {
        return log;
    }

    /**
     * logプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Log }
     *     
     */
    public void setLog(Log value) {
        this.log = value;
    }

}
