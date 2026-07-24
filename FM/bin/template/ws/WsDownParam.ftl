<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")}.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "${S("METHOD")}Response", namespace = "http://service.${S("ID")}.server${S("SUBMODULE_ID")}.mcframe/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "${S("METHOD")}Response", namespace = "http://service.${S("ID")}.server${S("SUBMODULE_ID")}.mcframe/")
public class ${S("METHOD")}Response {

    @XmlElement(name = "return", namespace = "")
    private ${S("PACKAGE")}.service.${S("METHOD")}_DownParam _return;

    public ${S("PACKAGE")}.service.${S("METHOD")}_DownParam getReturn() {
        return this._return;
    }

    public void setReturn(${S("PACKAGE")}.service.${S("METHOD")}_DownParam _return) {
        this._return = _return;
    }

}

