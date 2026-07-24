<#import "/macro/XmlResource.ftl" as RES>
<#macro PKG_LAB_XML tabs>
<#assign HEAD_PD="MCLabel."/>
<#-- オペレーション実装仕様書に定義されるすべて項目のLabelをリソース出力する。 -->
<#-- $super$や$share$やInnerRowの先でしか定義されてい無い項目については -->
<#-- 項目Labelはリソースに出力されない ＆ アプリプログラムからLabelを取得することはできない。-->
${tabs}<${S("MODULE_ID")}>
${tabs}	<${S("ID")}>
<#if ANALYZED()>
  <#assign opes=GET_NS_SUBKEYS_FROM_XML(HEAD_PD + S("MODULE_ID") + "." + S("ID") + ".", S("METHOD_ID"))/>
<#else>
  <#assign opes=[S("METHOD_ID")]/>
</#if>
<#list opes as mthId>
${tabs}		<${mthId}>
<#if mthId==S("METHOD_ID")>
<#list A("BLOCK_IDS") as aBlockId>
<#if A(aBlockId + "_ITEM_IDS")?size!=0>
${tabs}			<${aBlockId}>
<#list A(aBlockId + "_ITEM_IDS") as anItemId>
<#if S(aBlockId + "_" + anItemId + "_MESSAGE")!="">
${tabs}				<${anItemId}>
${tabs}					<label><@RES.CDATA value=S(aBlockId + "_" + anItemId + "_MESSAGE")/></label>
${tabs}				</${anItemId}>
</#if>
</#list>
${tabs}			</${aBlockId}>
</#if>
</#list>
<#else>
<#list GET_NS_SUBKEYS_FROM_XML(HEAD_PD + S("MODULE_ID") + "." + S("ID") + "." + mthId + ".") as aBlockId>
${tabs}			<${aBlockId}>
<#list GET_NS_MIDDLEPATHS_FROM_XML(HEAD_PD + S("MODULE_ID") + "." + S("ID") + "." + mthId + "." + aBlockId + ".", "label") as anItemId>
${tabs}				<${anItemId}>
${tabs}					<label><@RES.CDATA value=GET_FROM_XML(HEAD_PD + S("MODULE_ID") + "." + S("ID") + "." + mthId + "." + aBlockId + "." + anItemId + ".label")/></label>
${tabs}				</${anItemId}>
</#list>
${tabs}			</${aBlockId}>
</#list>
</#if>
${tabs}		</${mthId}>
</#list>
${tabs}	</${S("ID")}>
${tabs}</${S("MODULE_ID")}>
</#macro>