<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")};

import mcframe.commonCore.meta.MCMeta;
<@REV.REV_IMPORT/>

/**
 * 共有項目メタの定義クラスです。
 *
<#if S("MEMO") != "">
<#list S("MEMO")?split("\n") as lToken>
	<#if !lToken?starts_with("@Rev")>
 * ${lToken}<br>
	</#if>
</#list>
</#if>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
<@REV.REV_ANNOTATION/>
abstract public class ${S("CLASS")}_${S("CLASS_SUFFIX")}_A <#if S("EXTENDS_CLASS")!="">extends ${S("EXTENDS_CLASS")}</#if>{
<#list A("BLOCK_IDS") as aBlockId>
<#list A("${aBlockId}_ITEM_IDS") as anItemId>
	/**
	 * ${S("${aBlockId}_${anItemId}_MESSAGE")}.<p>
	 *
	 * <table border=1 cellspacing=0 cellpadding=2 >
	 * <tr>
	 * 	<td bgcolor="#cccccc">型</td><td><@TYPE_IN_DOC value=S("${aBlockId}_${anItemId}_TYPE")/></td>
	 * </tr>
	 * <tr>
	 * 	<td bgcolor="#cccccc">桁</td><td>${S("${aBlockId}_${anItemId}__LENGTH")}<#if S("${aBlockId}_${anItemId}_TYPE")=="N"&&S("${aBlockId}_${anItemId}__DECIMAL")!="">,${S("${aBlockId}_${anItemId}__DECIMAL")}</#if><#if S("${aBlockId}_${anItemId}_DIGIT")==SPEC_CONST("FREE")>${SPEC_CONST("FREE")}</#if></td>
	 * </tr>
<#if S("${aBlockId}_${anItemId}_FORMAT")!="">
	* <tr>
	* 	<td bgcolor="#cccccc">形式</td><td>${S("${aBlockId}_${anItemId}_FORMAT")}</td>
	* </tr>
</#if>
<#if S("${aBlockId}_${anItemId}_VIEW_DIGIT")!="">
	* <tr>
	* 	<td bgcolor="#cccccc">表示幅</td><td>${S("${aBlockId}_${anItemId}_VIEW_DIGIT")}</td>
	* </tr>
</#if>
	 * </table>
<#if S("${aBlockId}_${anItemId}_MEMO")!="">
	 * <br>
<#list S("${aBlockId}_${anItemId}_MEMO")?split("\n") as lToken>
	 * ${lToken}<br>
</#list></#if>
	 */
	public static final MCMeta ${S("${aBlockId}_${anItemId}_ID")} = MCMeta.<@CREATOR type=S("${aBlockId}_${anItemId}_TYPE") bId=aBlockId iId=anItemId/>
<#if S("${aBlockId}_${anItemId}_FORMAT")!="">
	public static final String ${S("${aBlockId}_${anItemId}_ID")}_FORMAT = "${S("${aBlockId}_${anItemId}_FORMAT")}";
</#if>

</#list>
</#list>
}

<#macro CREATOR type bId iId>
create<@TYPE value=type/>Meta("${S("${bId}_${iId}_ID")}", ""<@PARAM value=type lBlock=bId lItem=iId/>);<#rt>
</#macro>

<#macro TYPE value>
<#if value=="C"||value=="CLB">String</#if><#t>
<#if value=="CC">CryptString</#if><#t>
<#if value=="N">Number</#if><#t>
<#if value=="D">Date</#if><#t>
<#if value=="TS">Timestamp</#if><#t>
<#if value=="F">Boolean</#if><#t>
<#if value=="B">Binary</#if><#t>
<#if value=="R">Row</#if><#t>
</#macro>

<#macro TYPE_IN_DOC value>
<#if value=="CLB">String(CLOB)<#t>
<#else><@TYPE value=value/></#if>
</#macro>

<#macro PARAM value lBlock lItem>
<#if value=="C"||value=="CC"||value=="CLB"><#if S("${lBlock}_${lItem}__LENGTH")!="">, ${S("${lBlock}_${lItem}__LENGTH")}</#if></#if><#t>
<#if value=="N"&&S("${lBlock}_${lItem}__LENGTH")!="">, ${S("${lBlock}_${lItem}__LENGTH")}, ${S("${lBlock}_${lItem}__DECIMAL")}<#if B("${lBlock}_${lItem}__MINUS")>, true</#if></#if><#t>
</#macro>