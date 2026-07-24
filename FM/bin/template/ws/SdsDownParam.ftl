<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")}.sdservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "${S("METHOD_ID")}Response", namespace = "urn:Services.MCFrame")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "${S("METHOD_ID")}Response", namespace = "urn:Services.MCFrame")
public class ${S("METHOD")}Response {

    @XmlElement(name = "down", namespace = "")
    private mcframe.serverCore.sdws.MCWSDownParam down;

    public mcframe.serverCore.sdws.MCWSDownParam getDown() {
        return this.down;
    }

    public void setDown(mcframe.serverCore.sdws.MCWSDownParam down) {
        this.down = down;
    }

<#assign TEL_DOWN_BS=A("TELEGRAM_DOWN_L_BLOCK_IDS")>
<#list TEL_DOWN_BS as aBlockId>
    @XmlElement(name = "down${aBlockId_index}", namespace = "")
    private ${S("PACKAGE")}.sdservice.${S("METHOD")}Down${aBlockId_index}<#if B(aBlockId + "_IS_LIST")>[]</#if> down${aBlockId_index};

    public ${S("PACKAGE")}.sdservice.${S("METHOD")}Down${aBlockId_index}<#if B(aBlockId + "_IS_LIST")>[]</#if> getDown${aBlockId_index}() {
        return this.down${aBlockId_index};
    }

    public void setDown${aBlockId_index}(${S("PACKAGE")}.sdservice.${S("METHOD")}Down${aBlockId_index}<#if B(aBlockId + "_IS_LIST")>[]</#if> down${aBlockId_index}) {
        this.down${aBlockId_index} = down${aBlockId_index};
    }

</#list>
}

