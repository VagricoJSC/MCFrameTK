<#import "/macro/ClassDef.ftl" as CDEF>
<#import "/macro/RevAnnotation.ftl" as REV>
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
<#if B("HAS_PAGING_PARAM")>
import mcframe.clientXP.XPP0010.XPP_PanelBase;
</#if>
<#-- EIクラスカスタマイズを考慮し実装クラスの自動生成importはEIクラスにも書き出される。 -->
<@REV.REV_IMPORT/>

<#list A("IMPORT_PACKAGES") as p>
import ${p}.*;
</#list>

<#if EXISTS(S("FTL.SCREEN.CUSTOM_SCREEN_IMPORT"))><#include S("FTL.SCREEN.CUSTOM_SCREEN_IMPORT")/></#if>

//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
${CB("CUSTOM_IMPORT")}
//FMCB CUSTOM_IMPORT END

/**
 * 画面"${S("CLASS")}"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
<@REV.REV_ANNOTATION/>
@SuppressWarnings("serial")
abstract public class ${S("CLASS")}_${S("CLASS_SUFFIX")} extends ${S("CLASS")}_${S("CLASS_SUFFIX")}_A <#if B("HAS_IMPLEMENTS_DESCRIPTION")>implements ${S("IMPLEMENTS_DESCRIPTION")} </#if>{

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
${CB("CUSTOM_FIELD")}
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public ${S("CLASS")}_${S("CLASS_SUFFIX")}() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START
${CB("CUSTOM_CONSTRUCTOR")}
		//FMCB CUSTOM_CONSTRUCTOR END
	}

<#if S("GENE_TYPE")!="LPC"&&S("GENE_TYPE")!="LPCD">
<#if B("HAS_LIST_SCS")>
	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public ${S("CLASS")}_${S("CLASS_SUFFIX")}(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START
${CB("CUSTOM_CONSTRUCTOR_LIST")}
		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

</#if>
<#if B("IS_ONE_ROW_SCS")>
<#assign one_row_block=S("ONE_ROW_SCS")>
	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected ${S("CLASS")}_${S("CLASS_SUFFIX")}(<@CDEF.CONT_DEF body=one_row_block/> row) {
		super(row);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_ROW_${one_row_block} START
${CB("CUSTOM_CONSTRUCTOR_ROW_${one_row_block}")}
		//FMCB CUSTOM_CONSTRUCTOR_ROW_${one_row_block} END
	}

</#if>
</#if>
	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START
<#if S("GENE_TYPE")!="LPC"&&S("GENE_TYPE")!="LPCD">
<#if !FMCONF_B("EI_CLASS_DEV_MODE")>
<#list A("TELEGRAM_IDS") as aTelId>
<#assign TELEGRAM=aTelId?replace(".","_")>
<#if !INC_LINE_IN_CB("protected class ${TELEGRAM}Caller<P", "CUSTOM_METHOD")>
	/**
	 * [${aTelId?replace(".","_")}]の定型処理のInnerClass
	 */
	protected class ${aTelId?replace(".","_")}Caller<P extends ${S("CLASS")}, B extends ${aTelId?replace(".","_")}Bridge> extends <#if S(aTelId + "_SUPER_CLASS")=="">MCCaller<#else>${S(aTelId + "_SUPER_CLASS")}</#if><P, B> {

		protected ${aTelId?replace(".","_")}Caller(P p, B b) {
			super(p, b);
		}
	}

</#if>
</#list></#if>

<#if !FMCONF_B("EI_CLASS_DEV_MODE")>
<#list A("BLOCK_IDS") as aBlockId>
<#list A("${aBlockId}_ITEM_IDS") as anItemId>
<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
	<#if B("${aBlockId}_${anItemId}_IS_BUTTON_TYPE")||B("${aBlockId}_${anItemId}_IS_BC_TYPE")||B("${aBlockId}_${anItemId}_IS_PB_TYPE")>
		<#if !INC_LINE_IN_CB("public void do${aBlockId}_${anItemId}(MCEventInfo info)", "CUSTOM_METHOD")>
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
		<#if !INC_LINE_IN_CB("public void do${aBlockId}_${anItemId}_Ope_srch(MCEventInfo info)", "CUSTOM_METHOD")>
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
<#if !INC_LINE_IN_CB("public void callPagingSearcher(XPP_PanelBase", "CUSTOM_METHOD")>

	public void callPagingSearcher(XPP_PanelBase eventPanel){
		super.callPagingSearcher(eventPanel);

	}
</#if></#if></#if>
</#if>
${CB("CUSTOM_METHOD")}
}