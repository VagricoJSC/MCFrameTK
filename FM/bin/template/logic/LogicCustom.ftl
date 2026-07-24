<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")};

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
<#if EXISTS(S("FTL.LOGIC.CUSTOM_LOGIC_IMPORT"))><#include S("FTL.LOGIC.CUSTOM_LOGIC_IMPORT")/></#if>

//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
<#list A("IMPORT_PACKAGES") as p>
<#if !INC_LINE_IN_CB("import ${p}.*;", "CUSTOM_IMPORT")>
import ${p}.*;	// このimportはFrameManagerの自動生成で追加されました。
</#if>
</#list>
${CB("CUSTOM_IMPORT")?trim}
//FMCB CUSTOM_IMPORT END

/**
 * "${S("CLASS")}"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
<@REV.REV_ANNOTATION_WITH_CLASS cName=S("CLASS") + "." + S("METHOD")/>
abstract public class ${S("CLASS")}_${S("CLASS_SUFFIX")} extends ${S("CLASS")}_${S("CLASS_SUFFIX")}_A{
	//FMCB CUSTOM START
${CB("CUSTOM")}
<#if !FMCONF_B("EI_CLASS_DEV_MODE")&&S("GENE_TYPE")!="LPC"&&S("GENE_TYPE")!="LPCD">
<#if !INC_LINE_IN_CB("public class " + S("METHOD"), "CUSTOM")>
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
	public class ${S("METHOD")} extends ${S("CLASS")}_${S("CLASS_SUFFIX")}_A.${S("METHOD")} {
		@Override
		protected void call() {
<#if S("EXTENDS_CLASS")="MCOperation">
			// オペレーションの実装
<#else>
			super.call();
</#if>
		}
	}</#if>
</#if>
	//FMCB CUSTOM END
}