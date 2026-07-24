<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")};

import mcframe.commonCore.param.MCOperationInfo;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCDef;
<#if S("SORD")=="SCR">
<@REV.REV_IMPORT/>
</#if>
<#if S("SORD")=="OPE">
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cn;
</#if>

/**
 * [${S("CLASS")}]の入出力情報となる電文（上り・下り電文）と
 * 画面コンテナの間のデータ変換の定義を行うクラスです。
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズはできません。
 */
<#if FMCONST_B("FTL.SUPPRESSWARNINGS")>
@SuppressWarnings({"all"})
</#if>
<#if S("SORD")=="SCR">
<@REV.REV_ANNOTATION/>
</#if>
<#if S("SORD")=="OPE">
<@REV.REV_ANNOTATION_WITH_CNAME cName=S("TELEGRAM")?replace(".","_")/>
</#if>
abstract public class PDef_${S("CLASS_SUFFIX")}_A extends <@SUPER/><#if IMP_CLASSES()?size!=0> implemants <#list IMP_CLASSES() as imp>${imp}<#if imp_has_next>, </#if></#list></#if> {
<@TRIMLINE>
	public MCContainerDef getCustomDef(String id){
		if (id == null) {
			return null;
		} 
//FMCB GET_DEF START
${CB("GET_DEF")}
<#list A("TELEGRAM_UP_BLOCK_IDS") as aBlockId>
<#if !INC_LINE_IN_CB("else if (id.equals(\"" + S("TELEGRAM") + ".UP.BLOCK" + aBlockId + "\")){", "GET_DEF")>
		else if (id.equals("${S("TELEGRAM")}.UP.BLOCK${aBlockId}")){
			return ${S("TELEGRAM")?replace(".","_")}_UP_BLOCK${aBlockId}();
		}
</#if>
</#list>
<#list A("TELEGRAM_DOWN_BLOCK_IDS") as aBlockId>
<#if !INC_LINE_IN_CB("else if (id.equals(\"" + S("TELEGRAM") + ".DOWN.BLOCK" + aBlockId + "\")){", "GET_DEF")>
		else if (id.equals("${S("TELEGRAM")}.DOWN.BLOCK${aBlockId}")){
			return ${S("TELEGRAM")?replace(".","_")}_DOWN_BLOCK${aBlockId}();
		}
</#if>
</#list>
//FMCB GET_DEF END
		else {
<#if S("SORD")=="OPE"&&S("SUPER_CLASS_SUFFIX")!=""><#-- OperationのDefの場合でEI定義の場合 -->
			return super.getCustomDef(id);
<#else>
			return null;
</#if>
		}
	}
</@TRIMLINE>
	//FMCB DEF_CLASSES START
	${CB("DEF_CLASSES")}
	
<#if !INC_LINE_IN_CB("public static class " + S("TELEGRAM")?replace(".","_") + "{", "DEF_CLASSES")>
	static final MCOperationInfo ${S("TELEGRAM")?replace(".","_")}_INFO = new MCOperationInfo(<#if S("TELEGRAM")!=S("_TARGET")>"${S("TELEGRAM")}", </#if>"${S("_TARGET_MODULE_ID")}", "${S("_TARGET_CLASS_ID")}", "${S("_TARGET_METHOD_ID")}", "${S("VERSION")}", new PDef());

<#list A("TELEGRAM_UP_BLOCK_IDS") as aBlockId>
	public static MCContainerDef ${S("TELEGRAM")?replace(".","_")}_UP_BLOCK${aBlockId}() {
<#if S("SORD")=="SCR">		/** Ope.のBlock [${S("TELEGRAM_UP_${aBlockId}_R_BLOCK_ID")}] に対する電文項目定義 */</#if>
		return new MCGeneralContainerDef("${S("_TARGET_MODULE_ID")}", "${S("_TARGET_CLASS_ID")}", "${S("_TARGET_METHOD_ID")}",
<#if S("TELEGRAM_UP_${aBlockId}_SUPER_PACKAGE")!="">
			<@SUPER_ITEM_DEF_LIST S_PKG=S("TELEGRAM_UP_${aBlockId}_SUPER_PACKAGE") S_TEL=S("TELEGRAM_UP_${aBlockId}_SUPER_TELEGRAM") UD="UP" BLK=aBlockId/>,
</#if>
			new MCItemDef[]{
<#list A("TELEGRAM_UP_${aBlockId}_ITEM_IDS") as anItemId>
<#if anItemId=="">
				MCItemDef.IGNORE_ITEM("${S("TELEGRAM_UP_" + aBlockId + "_" + anItemId_index + "_R_ITEM_ID")}")<#rt>
<#else>
	<#if S("TELEGRAM_UP_${aBlockId}_${anItemId}_DEF_CLASS")!="">
				MCItemDef.create(<@DEF_ITEM UD="UP" BLK=aBlockId ITM=anItemId/>, ${S("TELEGRAM_UP_${aBlockId}_${anItemId}_DEF_CLASS")?replace(".UP.","_UP_")}(), <@R_ITEM UD="UP" BLK=aBlockId ITM=anItemId ITM_INDEX=anItemId_index/>)<#rt>
	<#else>
				MCItemDef.create(<@DEF_ITEM UD="UP" BLK=aBlockId ITM=anItemId/><#if S("SORD")=="OPE"><#if B("TELEGRAM_UP_${aBlockId}_${anItemId}_IS_REQUIRED")>, true</#if></#if>, <@R_ITEM UD="UP" BLK=aBlockId ITM=anItemId ITM_INDEX=anItemId_index/>)<#rt>
	</#if>
</#if>
<#if anItemId_has_next>,</#if>
</#list>
			}
			,
			MCBlockDef.create("${S("TELEGRAM_UP_${aBlockId}_L_BLOCK_ID")}")
		);
	}

</#list>

<#list A("TELEGRAM_DOWN_BLOCK_IDS") as aBlockId>
	public static MCContainerDef ${S("TELEGRAM")?replace(".","_")}_DOWN_BLOCK${aBlockId}() {
<#if S("SORD")=="SCR">	/** Ope.のBlock [${S("TELEGRAM_DOWN_${aBlockId}_R_BLOCK_ID")}] に対する電文項目定義 */</#if>
		return new MCGeneralContainerDef("${S("_TARGET_MODULE_ID")}", "${S("_TARGET_CLASS_ID")}", "${S("_TARGET_METHOD_ID")}",
<#if S("TELEGRAM_DOWN_${aBlockId}_SUPER_PACKAGE")!="">
			<@SUPER_ITEM_DEF_LIST S_PKG=S("TELEGRAM_DOWN_${aBlockId}_SUPER_PACKAGE") S_TEL=S("TELEGRAM_DOWN_${aBlockId}_SUPER_TELEGRAM") UD="DOWN" BLK=aBlockId/>,
</#if>
			new MCItemDef[]{
<#list A("TELEGRAM_DOWN_${aBlockId}_ITEM_IDS") as anItemId>
<#if anItemId=="">
				MCItemDef.IGNORE_ITEM("${S("TELEGRAM_DOWN_" + aBlockId + "_" + anItemId_index + "_R_ITEM_ID")}")<#rt>
<#else>
	<#if S("TELEGRAM_DOWN_${aBlockId}_${anItemId}_DEF_CLASS")!="">
				MCItemDef.create(<@DEF_ITEM UD="DOWN" BLK=aBlockId ITM=anItemId/>, ${S("TELEGRAM_DOWN_${aBlockId}_${anItemId}_DEF_CLASS")?replace(".DOWN.","_DOWN_")}(), <@R_ITEM UD="DOWN" BLK=aBlockId ITM=anItemId ITM_INDEX=anItemId_index/>)<#rt>
	<#else>
				MCItemDef.create(<@DEF_ITEM UD="DOWN" BLK=aBlockId ITM=anItemId/><#if S("SORD")=="OPE"><#if B("TELEGRAM_DOWN_${aBlockId}_${anItemId}_IS_REQUIRED")>, true</#if></#if>, <@R_ITEM UD="DOWN" BLK=aBlockId ITM=anItemId ITM_INDEX=anItemId_index/>)<#rt>
	</#if>
</#if>
<#if anItemId_has_next>,</#if>
</#list>
			}
			,
			MCBlockDef.create("${S("TELEGRAM_DOWN_${aBlockId}_L_BLOCK_ID")}")
		);
	}
</#list>
</#if>
	//FMCB DEF_CLASSES END
}

<#macro DEF_ITEM UD BLK ITM>
<#if S(S("TELEGRAM_${UD}_${BLK}_L_BLOCK_ID") + "_${ITM}_TYPE")=="RI">
"${S(S("TELEGRAM_${UD}_${BLK}_L_BLOCK_ID") + "_${ITM}_DEPEND_ITEM_ID")}" + ".${S(S("TELEGRAM_${UD}_${BLK}_L_BLOCK_ID") + "_${ITM}_DEPEND_TER_PATH")}"<#rt>
<#else>
"${ITM}"<#rt>
</#if>
</#macro>

<#-- 電文ブロックのSuperブロックの記述を出力する。 -->
<#-- Superブロックがない（継承定義していない）場合には、"MCContainerDef"を出力する。-->
<#macro SUPER_ITEM_DEF_LIST S_PKG S_TEL UD BLK>
${S_PKG}.PDef<#if S("PACKAGE")==S_PKG&&S("SUPER_CLASS_SUFFIX")!="">_${S("SUPER_CLASS_SUFFIX")}_A</#if>.${S_TEL?replace(".","_")}_${UD}_BLOCK${BLK}()<#rt>
</#macro>

<#-- 電文の対象項目のIDを出力する。 -->
<#-- 電文送り側（画面等）の場合には相手の項目IDを出力する。-->
<#-- 電文受け側（Ope.）の場合には自分(Ope.項目）の項目IDを出力する。-->
<#macro R_ITEM UD BLK ITM ITM_INDEX>
<#if S("SORD")=="OPE">
<@R_ITEM_OPE UD=UD BLK=BLK ITM=ITM/>
<#else>
"${S("TELEGRAM_${UD}_${BLK}_${ITM_INDEX}_R_ITEM_ID")}"<#rt>
</#if>
</#macro>

<#-- 電文受け側（Ope.）のの対象項目のIDを出力する。 -->
<#-- InnerRow項目（RI）の場合、 -->
<#--   1.エイリアス（エイリアス定義があれば） -->
<#--   2.項目ID（カラムパス表記） -->
<#-- InnerRow項目ではない項目の場合は、項目ID -->
<#-- （mc7マイニング情報登録のため、エイリアス出力仕様を追加。） -->
<#macro R_ITEM_OPE UD BLK ITM>
<#if S(S("TELEGRAM_${UD}_${BLK}_L_BLOCK_ID") + "_${ITM}_TYPE")=="RI">
<#if S(S("TELEGRAM_${UD}_${BLK}_L_BLOCK_ID") + "_${ITM}_CP_ALIAS")!="">
"${S(S("TELEGRAM_${UD}_${BLK}_L_BLOCK_ID") + "_${ITM}_CP_ALIAS")}"<#rt>
<#else>
"${S(S("TELEGRAM_${UD}_${BLK}_L_BLOCK_ID") + "_${ITM}_DEPEND_ITEM_ID")}" + ".${S(S("TELEGRAM_${UD}_${BLK}_L_BLOCK_ID") + "_${ITM}_DEPEND_TER_PATH")}"<#rt>
</#if>
<#else>
"${ITM}"<#rt>
</#if>
</#macro>

<#macro SUPER>
<#if S("SORD")=="OPE"&&S("SUPER_CLASS_SUFFIX")!=""><#-- OperationのDefの場合でEI定義の場合 -->
PDef_${S("SUPER_CLASS_SUFFIX")}_A<#rt>
<#else>
MCDef<#rt>
</#if>
</#macro>