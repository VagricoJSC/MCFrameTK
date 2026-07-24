
package mcframe.serverPFBA.PFBAL5820.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>JournalEntryCreateConfirmationBulkMessage complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="JournalEntryCreateConfirmationBulkMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageHeader" type="{http://sap.com/xi/SAPSCORE/SFIN}BusinessDocumentMessageHeader"/>
 *         &lt;element name="ConfirmationInterfaceOrignName" type="{http://sap.com/xi/SAPSCORE/SFIN}InterfaceName"/>
 *         &lt;element name="JournalEntryCreateConfirmation" type="{http://sap.com/xi/SAPSCORE/SFIN}JournalEntryCreateConfirmationMessage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Log" type="{http://sap.com/xi/SAPSCORE/SFIN}Log"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalEntryCreateConfirmationBulkMessage", propOrder = {
    "messageHeader",
    "confirmationInterfaceOrignName",
    "journalEntryCreateConfirmation",
    "log"
})
public class JournalEntryCreateConfirmationBulkMessage {

    @XmlElement(name = "MessageHeader", required = true)
    protected BusinessDocumentMessageHeader messageHeader;
    @XmlElement(name = "ConfirmationInterfaceOrignName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String confirmationInterfaceOrignName;
    @XmlElement(name = "JournalEntryCreateConfirmation")
    protected List<JournalEntryCreateConfirmationMessage> journalEntryCreateConfirmation;
    @XmlElement(name = "Log", required = true)
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
     * confirmationInterfaceOrignNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationInterfaceOrignName() {
        return confirmationInterfaceOrignName;
    }

    /**
     * confirmationInterfaceOrignNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationInterfaceOrignName(String value) {
        this.confirmationInterfaceOrignName = value;
    }

    /**
     * Gets the value of the journalEntryCreateConfirmation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journalEntryCreateConfirmation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJournalEntryCreateConfirmation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JournalEntryCreateConfirmationMessage }
     * 
     * 
     */
    public List<JournalEntryCreateConfirmationMessage> getJournalEntryCreateConfirmation() {
        if (journalEntryCreateConfirmation == null) {
            journalEntryCreateConfirmation = new ArrayList<JournalEntryCreateConfirmationMessage>();
        }
        return this.journalEntryCreateConfirmation;
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
