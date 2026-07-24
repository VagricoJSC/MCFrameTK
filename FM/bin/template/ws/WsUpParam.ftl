<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")}.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "${S("METHOD")}", namespace = "http://service.${S("ID")}.server${S("SUBMODULE_ID")}.mcframe/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "${S("METHOD")}", namespace = "http://service.${S("ID")}.server${S("SUBMODULE_ID")}.mcframe/")
public class ${S("METHOD")} {

    @XmlElement(name = "arg0", namespace = "")
    private ${S("PACKAGE")}.service.${S("METHOD")}_UpParam arg0;

    public ${S("PACKAGE")}.service.${S("METHOD")}_UpParam getArg0() {
        return this.arg0;
    }

    public void setArg0(${S("PACKAGE")}.service.${S("METHOD")}_UpParam arg0) {
        this.arg0 = arg0;
    }

}

