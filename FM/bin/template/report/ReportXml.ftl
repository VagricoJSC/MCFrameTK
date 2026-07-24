<#import "/macro/RevAnnotation.ftl" as REV>
<?xml version="1.0" encoding="UTF-8"?>
<@REV.XML_COMMENT/>
<mcframe>
<#-- 今回の自動生成で追加されるリソースも既存分とあわせてソートするために -->
<#-- 解析データがある場合には、解析データにソート参考情報を追加する。-->
<#if ANALYZED()>
${SET_STRING_TO_XML(S("MODULE_ID") + "." + S("ID"), "DUMMY")}<#rt>
</#if>
<#list GET_SUBKEYS_FROM_XML("", S("MODULE_ID")) as modId>
<${modId}>
		<#if modId=S("MODULE_ID")>
<#assign scrs=GET_SUBKEYS_FROM_XML("${modId}.", S("ID"))/>
		<#else>
<#assign scrs=GET_SUBKEYS_FROM_XML("${modId}.")/>
		</#if>
<#list scrs as anId>
		<#if modId=S("MODULE_ID")&&anId=S("ID")>
	<${anId}>
		<class>${S("PACKAGE")}.${S("CLASS")}</class>
		<classid>${anId}</classid>
			<#if S("SUPER_SPEC_ID")!="">
		<parent>${S("SUPER_SPEC_ID")}</parent>
			</#if>
	</${anId}>
		<#else>
			<#if GET_FROM_XML("${modId}.${anId}.class")!="">
			<#-- 定義されたclass情報でclassタグを書き出す。（通常）-->
	<${anId}>
		<class>${GET_FROM_XML("${modId}.${anId}.class")}</class>
		<classid>${GET_FROM_XML("${modId}.${anId}.classid")}</classid>
				<#if GET_FROM_XML("${modId}.${anId}.parent")!="">
		<parent>${GET_FROM_XML("${modId}.${anId}.parent")}</parent>
				</#if>
	</${anId}>
			<#else>
			<#-- class情報定義がない場合にはid情報でclassタグを書き出す。-->
	<${anId}>
		<class>${GET_FROM_XML("${modId}.${anId}")}</class>
		<classid>${anId}</classid>
	</${anId}>
			</#if>
		</#if>
</#list>
</${modId}>
</#list>
</mcframe>