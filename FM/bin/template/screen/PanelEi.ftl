<#import "/macro/ClassDef.ftl" as CDEF>
<#import "/macro/RevAnnotation.ftl" as REV>
// FMSE PANEL_EI
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")};

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.commonCore.annotation.EI;
<#if B("HAS_PAGING_PARAM")>
import mcframe.clientXP.XPP0010.XPP_PanelBase;
</#if>
<#-- EIクラスカスタマイズを考慮し実装クラスの自動生成importはEIクラスにも書き出される。 -->
<@REV.REV_IMPORT/>
<#if A("IMPORT_PACKAGES")?size!=0>
<#list A("IMPORT_PACKAGES") as p>
import ${p}.*;
</#list>

</#if>
<#if EXISTS(S("FTL.SCREEN.CUSTOM_SCREEN_IMPORT"))><#include S("FTL.SCREEN.CUSTOM_SCREEN_IMPORT")/>
</#if>
<#if FMCONF_B("EI_CLASS_DEV_MODE")||CB("IMPORT")!="">
//FMCB IMPORT START
${CB("IMPORT")}
//FMCB IMPORT END
</#if>

/**
 * 画面"${S("CLASS")}"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
<@REV.REV_ANNOTATION/>
@EI
<#if S("MODIFIER")="abstract">abstract </#if>public class ${S("CLASS")} extends ${S("CLASS")}_${S("CLASS_SUFFIX")} <#if B("HAS_IMPLEMENTS_DESCRIPTION")>implements ${S("IMPLEMENTS_DESCRIPTION")} </#if>{

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public ${S("CLASS")}() {
		super();
	}

<#if S("GENE_TYPE")!="LPC"&&S("GENE_TYPE")!="LPCD">
<#if B("IS_ONE_ROW_SCS")>
<#assign one_row_block=S("ONE_ROW_SCS")>
	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected ${S("CLASS")}(<@CDEF.CONT_DEF body=one_row_block/> row){
		super(row);
	}
</#if>
<#if B("HAS_LIST_SCS")>
	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public ${S("CLASS")}(String name) {
		super(name);
	}
</#if>

<#list A("TELEGRAM_IDS") as aTelId>
	public class ${aTelId?replace(".","_")}Bridge extends ${S("CLASS")}_${S("CLASS_SUFFIX")}.${aTelId?replace(".","_")}Bridge {
	}
</#list>

</#if>
<#if FMCONF_B("EI_CLASS_DEV_MODE")||CB("CUSTOM")!="">
//FMCB CUSTOM START
<#if FMCONF_B("EI_CLASS_DEV_MODE")>
<#if S("GENE_TYPE")!="LPC"&&S("GENE_TYPE")!="LPCD">
<#list A("TELEGRAM_IDS") as aTelId>
<#assign TELEGRAM=aTelId?replace(".","_")>
<#if !INC_LINE_IN_CB("protected class ${TELEGRAM}Caller<P", "CUSTOM")>
	/**
	 * [${aTelId?replace(".","_")}]の定型処理のInnerClass
	 */
	<#if INC_LINE_IN_CB("protected class ${TELEGRAM}Caller<P", "CUSTOM_METHOD", CPANEL_ANAMAP_KEY())>
	protected class ${TELEGRAM}Caller<P extends ${S("CLASS")}, B extends ${TELEGRAM}Bridge> extends ${S("CLASS")}_${S("CLASS_SUFFIX")}.${TELEGRAM}Caller<P, B> {
	<#else>
	protected class ${TELEGRAM}Caller<P extends ${S("CLASS")}, B extends ${TELEGRAM}Bridge> extends <#if S(aTelId + "_SUPER_CLASS")=="">MCCaller<#else>${S(aTelId + "_SUPER_CLASS")}</#if><P, B> {
	</#if>

		protected ${TELEGRAM}Caller(P p, B b) {
			super(p, b);
		}
	}

</#if>
</#list>
<#list A("BLOCK_IDS") as aBlockId>
<#list A("${aBlockId}_ITEM_IDS") as anItemId>
<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
	<#if B("${aBlockId}_${anItemId}_IS_BUTTON_TYPE")||B("${aBlockId}_${anItemId}_IS_BC_TYPE")||B("${aBlockId}_${anItemId}_IS_PB_TYPE")>
		<#if !INC_LINE_IN_CB("public void do${aBlockId}_${anItemId}(MCEventInfo info)", "CUSTOM_METHOD", CPANEL_ANAMAP_KEY())&&!INC_LINE_IN_CB("public void do${aBlockId}_${anItemId}(MCEventInfo info)", "CUSTOM")>
	/**
	 * Panel[${aBlockId}]の<#if B("${aBlockId}_${anItemId}_IS_PB_TYPE")>ポップアップ</#if>ボタン[${anItemId}]の押下時の処理
	 */
	@Override
	public void do${aBlockId}_${anItemId}(MCEventInfo info) {
<#list A("${aBlockId}_${anItemId}_EVENT_INDEXS") as eIndex>
	<#switch S("${aBlockId}_${anItemId}_EVENT_${eIndex}_TYPE")>
		<#case "PARAM"><#include "/screen/customButton/PARAM.ftl"/><#break>
		<#case "MODE"><#include "/screen/customButton/MODE.ftl"/><#break>
		<#default><#include "/screen/customButton/"+S("${aBlockId}_${anItemId}_EVENT_${eIndex}_TYPE")+".ftl"/>
	</#switch>
</#list>
	}

		</#if>
	<#elseif B("EXPAND_AND_CONTRACT_${aBlockId}_CPANEL")>
		<#if !INC_LINE_IN_CB("public void do${aBlockId}_${anItemId}_Ope_srch(MCEventInfo info)", "CUSTOM_METHOD", CPANEL_ANAMAP_KEY())&&!INC_LINE_IN_CB("public void do${aBlockId}_${anItemId}_Ope_srch(MCEventInfo info)", "CUSTOM")>
	/**
	 * Panel[${aBlockId}]のボタン[${anItemId}_Ope_srch]の押下時の処理
	 */
	@Override
	public void do${aBlockId}_${anItemId}_Ope_srch(MCEventInfo info) {
<#if S("${aBlockId}_${anItemId}_EXPAND_AND_CONTRACT_EVENT")!="">
		call${S("${aBlockId}_${anItemId}_EXPAND_AND_CONTRACT_EVENT")?replace(".","_")}();
</#if>
	}
		</#if>
	</#if>
</#if>
</#list>
</#list>
<#if B("HAS_PAGING_PARAM")>
<#if !INC_LINE_IN_CB("public void callPagingSearcher(XPP_PanelBase", "CUSTOM")>
	public void callPagingSearcher(XPP_PanelBase eventPanel){
		super.callPagingSearcher(eventPanel);

	}
</#if></#if>
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