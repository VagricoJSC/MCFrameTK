<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")};

import java.util.*;
<@TRIMLINE>
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
<#if S("GENE_TYPE")!="LPC"&&S("GENE_TYPE")!="LPCD">
//FMCB IMPORT START
${CB("IMPORT")}
<#list A("SUBOPERATION_DBC_MODULES") as dbcModule>
<#if !INC_LINE_IN_CB("import mcframe.server${dbcModule}.dbc.*;", "IMPORT")>
import mcframe.server${dbcModule}.dbc.*;</#if>
</#list>
//FMCB IMPORT END
</#if>
</@TRIMLINE>
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "${S("CLASS")}"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
<#if FMCONST_B("FTL.SUPPRESSWARNINGS")>
@SuppressWarnings({"all"})
</#if>
<@REV.REV_ANNOTATION_WITH_CLASS cName=S("CLASS") + "." + S("METHOD")/>
abstract public class ${S("CLASS")}_${S("CLASS_SUFFIX")}_A extends <#if B("HAS_EXTENDS_DESCRIPTION")>${S("EXTENDS_DESCRIPTION")}<#else>${S("EXTENDS_LOGIC_CLASS")}</#if> <#if B("HAS_IMPLEMENTS_DESCRIPTION")>implements ${S("IMPLEMENTS_DESCRIPTION")} </#if>{
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "${S("MODULE_ID")}";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "${S("SUBMODULE_ID")}";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "${S("ID")}";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

<#if S("GENE_TYPE")=="LPC"||S("GENE_TYPE")=="LPCD">
<#include F("FTL.LOGIC.AUTO2_WOOP")/>
<#else>
<#include F("FTL.LOGIC.AUTO2")/>
</#if>
}