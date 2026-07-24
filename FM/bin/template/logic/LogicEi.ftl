<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.JAVA_COMMENT/>
package <#if B("EI")>${S("EI_PACKAGE")}<#else>${S("PACKAGE")}</#if>;

<#if FMCONF_B("EI_CLASS_DEV_MODE")>
import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
</#if>
import mcframe.commonCore.annotation.EI;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
<#if EXISTS(S("FTL.LOGIC.CUSTOM_LOGIC_IMPORT"))><#include S("FTL.LOGIC.CUSTOM_LOGIC_IMPORT")/></#if>
<#if FMCONF_B("EI_CLASS_DEV_MODE")||CB("IMPORT")!="">
//FMCB IMPORT START
<#list A("IMPORT_PACKAGES") as p>
<#if !INC_LINE_IN_CB("import ${p}.*;", "IMPORT")>
import ${p}.*;	// このimportはFrameManagerの自動生成で追加されました。
</#if>
</#list>
${CB("IMPORT")?trim}
//FMCB IMPORT END
</#if>

/**
 * "<#if B("EI")>${S("EI_CLASS")}<#else>${S("CLASS")}</#if>"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
<@REV.REV_ANNOTATION_WITH_CLASS cName=S("CLASS") + "." + S("METHOD")/>
@EI
<#if S(B("EI")?string("EI_MODIFIER","MODIFIER"))="abstract">abstract </#if>public class <#if B("EI")>${S("EI_CLASS")}<#else>${S("CLASS")}</#if> extends ${S("CLASS")}_${S("CLASS_SUFFIX")} <#if B("HAS_IMPLEMENTS_DESCRIPTION")>implements ${S("IMPLEMENTS_DESCRIPTION")} </#if>{

<#if FMCONF_B("EI_CLASS_DEV_MODE")||CB("CUSTOM")!="">
//FMCB CUSTOM START
<#if FMCONF_B("EI_CLASS_DEV_MODE")>
<#if S("GENE_TYPE")!="LPC"&&S("GENE_TYPE")!="LPCD">
	<#if !INC_LINE_IN_CB("public class " + S("METHOD"), "CUSTOM")>
<#assign OPE_CLASS=S("CLASS") + "_" + S("CLASS_SUFFIX") + "_A">
		<#if INC_LINE_IN_CB("public class " + S("METHOD"), "CUSTOM", CPANEL_ANAMAP_KEY())>
<#assign OPE_CLASS=S("CLASS") + "_" + S("CLASS_SUFFIX")>
		</#if>
	/**
	 * ${S("METHOD")}オペレーション.<p>
	 *
<#if S("MEMO") != "">
<#list S("MEMO")?split("\n") as lToken>
	<#if !lToken?starts_with("@Rev")>
	 * ${lToken}<br>
	</#if>
</#list>
</#if>
	 */
	public class ${S("METHOD")} extends ${OPE_CLASS}.${S("METHOD")} {
	<#if INC_LINE_IN_CB("public class " + S("METHOD"), "CUSTOM", CPANEL_ANAMAP_KEY())>

	<#else>
		@Override
		protected void call() {
		<#if S("EXTENDS_CLASS")="MCOperation">
			// オペレーションの実装
		<#else>
			super.call();
		</#if>
		}
	</#if>
	}
	</#if>
</#if>
</#if>
${CB("CUSTOM")}
//FMCB CUSTOM END
</#if>
}<#rt>
<#function CPANEL_ANAMAP_KEY>
<#list ANA_MAP_KEYS() as aKey>
	<#if aKey?ends_with("\\" + S("CLASS") + "_" + S("CLASS_SUFFIX") + ".java")>
		<#return aKey>
	</#if>
</#list>
<#return "">
</#function>