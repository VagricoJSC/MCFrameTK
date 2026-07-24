<#import "/macro/XmlResource.ftl" as RES>
<#macro PKG_LAB_XML tabs>
${tabs}<${S("MODULE_ID")}>
${tabs}	<${S("ID")}>
<#list A("BLOCK_IDS") as aBlockId>
${tabs}		<${aBlockId}>
<#list A("${aBlockId}_ITEM_IDS") as anItemId>
${tabs}			<${anItemId}><#if S("${aBlockId}_${anItemId}_MESSAGE_CTL")=="">
${tabs}				<label><@RES.CDATA value=S("${aBlockId}_${anItemId}_MESSAGE")/></label>
${tabs}				<message><@RES.CDATA value=S("${aBlockId}_${anItemId}_MESSAGE")/></message></#if>
<#-- 帳票実装仕様書には"MESSAGE"項目（"日本語名"）はあるが"LABEL"項目はない。 -->
<#-- XAFM631SP1では帳票実装仕様書の項目変更・追加は行わないため、既存の"MESSAGE"項目をlabelとmessageとして書き出す。-->
${tabs}			</${anItemId}>
</#list>
${tabs}		</${aBlockId}>
</#list>
${tabs}	</${S("ID")}>
${tabs}</${S("MODULE_ID")}>
</#macro>