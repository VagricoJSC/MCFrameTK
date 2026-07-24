<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")}.service;

import mcframe.serverCore.ws.MCWS${S("DIRECTION")?lower_case?capitalize}Param;

public class ${S("METHOD")}_${S("DIRECTION")?lower_case?capitalize}Param extends MCWS${S("DIRECTION")?lower_case?capitalize}Param {

<#list A("TELEGRAM_" + S("DIRECTION") + "_L_BLOCK_IDS") as aBlockId>
	private ${S("METHOD")}_${S("DIRECTION")?lower_case?capitalize}_${aBlockId}<#if B(aBlockId + "_IS_LIST")>[]</#if> ${S("DIRECTION")?lower_case}${aBlockId_index};
</#list>
<#list A("TELEGRAM_" + S("DIRECTION") + "_L_BLOCK_IDS") as aBlockId>

	public ${S("METHOD")}_${S("DIRECTION")?lower_case?capitalize}_${aBlockId}<#if B(aBlockId + "_IS_LIST")>[]</#if> get${S("DIRECTION")?lower_case?capitalize}${aBlockId_index}() {
		return ${S("DIRECTION")?lower_case}${aBlockId_index};
	}

	public void set${S("DIRECTION")?lower_case?capitalize}${aBlockId_index}(${S("METHOD")}_${S("DIRECTION")?lower_case?capitalize}_${aBlockId}<#if B(aBlockId + "_IS_LIST")>[]</#if> a${S("DIRECTION")?lower_case?capitalize}${aBlockId_index}) {
		this.${S("DIRECTION")?lower_case}${aBlockId_index} = a${S("DIRECTION")?lower_case?capitalize}${aBlockId_index};
	}
</#list>
}