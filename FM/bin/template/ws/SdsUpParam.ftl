<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")}.sdservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "${S("METHOD_ID")}", namespace = "urn:Services.MCFrame")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "${S("METHOD_ID")}", namespace = "urn:Services.MCFrame")
public class ${S("METHOD")} {

    @XmlElement(name = "up", namespace = "")
    private mcframe.serverCore.sdws.MCWSUpParam up;

    public mcframe.serverCore.sdws.MCWSUpParam getUp() {
        return this.up;
    }

    public void setUp(mcframe.serverCore.sdws.MCWSUpParam up) {
        this.up = up;
    }

<#assign TEL_UP_BS=A("TELEGRAM_UP_L_BLOCK_IDS")>
<#list TEL_UP_BS as aBlockId>
    @XmlElement(name = "up${aBlockId_index}", namespace = "")
    private ${S("PACKAGE")}.sdservice.${S("METHOD")}Up${aBlockId_index}<#if B(aBlockId + "_IS_LIST")>[]</#if> up${aBlockId_index};

    public ${S("PACKAGE")}.sdservice.${S("METHOD")}Up${aBlockId_index}<#if B(aBlockId + "_IS_LIST")>[]</#if> getUp${aBlockId_index}() {
        return this.up${aBlockId_index};
    }

    public void setUp${aBlockId_index}(${S("PACKAGE")}.sdservice.${S("METHOD")}Up${aBlockId_index}<#if B(aBlockId + "_IS_LIST")>[]</#if> up${aBlockId_index}) {
        this.up${aBlockId_index} = up${aBlockId_index};
    }

</#list>
}

