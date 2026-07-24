<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")}.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "MCWSFault", namespace = "http://service.${S("ID")}.server${S("SUBMODULE_ID")}.mcframe/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MCWSFault", namespace = "http://service.${S("ID")}.server${S("SUBMODULE_ID")}.mcframe/", propOrder = {
    "causeWsMessageArray",
    "message",
    "wsMessage"
})
public class MCWSFaultBean {

    private mcframe.serverCore.ws.MCWSMessage[] causeWsMessageArray;
    private String message;
    private mcframe.serverCore.ws.MCWSMessage wsMessage;

    public mcframe.serverCore.ws.MCWSMessage[] getCauseWsMessageArray() {
        return this.causeWsMessageArray;
    }

    public void setCauseWsMessageArray(mcframe.serverCore.ws.MCWSMessage[] causeWsMessageArray) {
        this.causeWsMessageArray = causeWsMessageArray;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public mcframe.serverCore.ws.MCWSMessage getWsMessage() {
        return this.wsMessage;
    }

    public void setWsMessage(mcframe.serverCore.ws.MCWSMessage wsMessage) {
        this.wsMessage = wsMessage;
    }
}
