<#import "/macro/ClassDef.ftl" as CDEF>
<#import "/macro/RevAnnotation.ftl" as REV>
<#import "/macro/Panel.ftl" as PANEL>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")};

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
<#if B("USE_EXPAND_AND_CONTRACT_PANEL")>
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
</#if>
import mcframe.clientCore.beans.*;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.text.*;
import mcframe.clientCore.beans.list.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.param.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.commonCore.meta.MCMeta;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.beans.popup.MCTextPopupMenuItem;
import mcframe.clientCore.beans.text.MCInputMethodType;
<@REV.REV_IMPORT/>
<#if S("GENE_TYPE")!="LPC"&&S("GENE_TYPE")!="LPCD"><#list A("TELEGRAM_IDS") as aTelId>
<#assign TELEGRAM=aTelId?replace(".","_")>
<#assign CALLER_CLASS=S("CLASS") + "_" + S("CLASS_SUFFIX")>
<#if FMCONF_B("EI_CLASS_DEV_MODE")>
<#assign CALLER_CLASS=S("CLASS")>
</#if>
import ${S("PACKAGE")}.${CALLER_CLASS}.${TELEGRAM}Caller;
</#list></#if>

/**
 * 画面"${S("CLASS")}"パネルクラスです。<p>
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
<#if FMCONST_B("FTL.SUPPRESSWARNINGS")>
@SuppressWarnings({"all"})
</#if>
<@REV.REV_ANNOTATION/>
abstract public class ${S("CLASS")}_${S("CLASS_SUFFIX")}_A extends ${S("EXTENDS_CLASS")}{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "${S("MODULE_ID")}";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "${S("SUBMODULE_ID")}";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "${S("ID")}";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
<@TRIMLINE>
<#if S("GENE_TYPE")!="LPC"&&S("GENE_TYPE")!="LPCD">
<#list A("BLOCK_IDS") as aBlockId><#if B("${aBlockId}_HAS_PANEL")>
	// [${aBlockId}]ブロック関連のField定義
<#include F("FTL.SCREEN.AUTO_PANEL_FIELD")/>
	// [${aBlockId}]ブロックの項目のField定義
<#include F("FTL.SCREEN.AUTO_BEAN_FIELD")/>
</#if></#list>
</#if>
</@TRIMLINE>
<#if S("GENE_TYPE")!="LPC"&&S("GENE_TYPE")!="LPCD">
<#list A("MODE_IDS") as aModeId>
	/** [${aModeId}]モードを表す定数 */
	public static final String ${aModeId} = "${aModeId}";
</#list>

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{<#list A("MODE_IDS") as aModeId>${aModeId}<#if aModeId_has_next>, </#if></#list>};
<#if !B("STATUS_IS_DEFINED")>

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
</#if>
	
</#if>
<#if S("GENE_TYPE")!="LPC"&&S("GENE_TYPE")!="LPCD">
<#if B("HAS_PAGING_PARAM")>
	/**
	 * ページングエージェントを保持することのフラグ<p>
	 */
	@Override
	public boolean isPagingAgentHolder() {
		return true;
	}

</#if>
<#list A("TELEGRAM_IDS") as aTelId>
<#assign TELEGRAM=aTelId?replace(".","_")>
<#assign CALLER_CLASS=S("CLASS") + "_" + S("CLASS_SUFFIX")>
<#assign BRIDGE_CLASS_P="">
<#if FMCONF_B("EI_CLASS_DEV_MODE")>
<#assign CALLER_CLASS=S("CLASS")>
<#assign BRIDGE_CLASS_P=S("CLASS") + ".">
</#if>
<#--<#if !(FMCONF_B("EI_CLASS_DEV_MODE")&&!INC_LINE_IN_CB("protected class ${TELEGRAM}Caller<P", "CUSTOM_METHOD", CPANEL_ANAMAP_KEY()))>-->
	/** [${TELEGRAM}]のCallerの作成 */
	protected ${CALLER_CLASS}.${TELEGRAM}Caller create${TELEGRAM}() {
		${CALLER_CLASS}.${TELEGRAM}Caller<${S("CLASS")}, ${BRIDGE_CLASS_P}${TELEGRAM}Bridge>
		caller = ((${CALLER_CLASS})this).new ${TELEGRAM}Caller<${S("CLASS")}, ${BRIDGE_CLASS_P}${TELEGRAM}Bridge>(
					(${S("CLASS")})this, <#if FMCONF_B("EI_CLASS_DEV_MODE")>((${CALLER_CLASS})this).</#if>new ${TELEGRAM}Bridge());
		return caller;
	}
	/** [${TELEGRAM}]の呼び出し */
	protected void call${TELEGRAM}() {
		MCCaller caller = create${TELEGRAM}();
		caller.exec();
	}
<#--</#if>-->
</#list>
</#if>
<#if S("GENE_TYPE")!="LPC"&&S("GENE_TYPE")!="LPCD">
<#include F("FTL.SCREEN.AUTO_CONTAINER_GETSET")/>

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
<#list A("BLOCK_IDS") as aBlockId><#if B("${aBlockId}_HAS_PANEL")>
	<#if !B("${aBlockId}_IS_GUI_OVERRIDE")>
		ret.add(${aBlockId}Panel);
	</#if>
</#if></#list>
		return ret;
	}
</#if>

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public ${S("CLASS")}_${S("CLASS_SUFFIX")}_A() {
<#if S("GENE_TYPE")!="LPC"&&S("GENE_TYPE")!="LPCD">
<#list A("CONTAINER_BLOCK_IDS") as aBlockId>
<#if !B("${aBlockId}_IS_EI")>
		a${aBlockId}${S("${aBlockId}_CODE_S")} = create${aBlockId}${S("${aBlockId}_CODE_S")}();<#--<@CDEF.CONT_CLASS_NAME body0=aBlockId/>.create(<@CDEF.GENE_LIST_ROW_CLASS body=aBlockId/>);-->
</#if>
</#list>

</#if>
	}

<#if S("GENE_TYPE")!="LPC"&&S("GENE_TYPE")!="LPCD">
<#if B("HAS_LIST_SCS")>
	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public ${S("CLASS")}_${S("CLASS_SUFFIX")}_A(String name) {
<#if !B("HAS_LIST")><#-- 親画面にListがあるがこの画面にはListがない場合*1 -->
		super(name);
</#if>
<#list A("CONTAINER_BLOCK_IDS") as aBlockId>
<#if B("HAS_LIST")&&B("${aBlockId}_IS_EI")><#-- 上の*1ではない時の処理（super(name);を重複させないため） -->
	<#if aBlockId_index=0>
		super(name);
	</#if>
<#else>
	<#if !B("${aBlockId}_IS_EI")>
		a${aBlockId}${S("${aBlockId}_CODE_S")} = create${aBlockId}${S("${aBlockId}_CODE_S")}();<#--<@CDEF.CONT_CLASS_NAME body0=aBlockId/>.create(<@CDEF.GENE_LIST_ROW_CLASS body=aBlockId/>);-->
	</#if>
	<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))>
		create${aBlockId}Table();
		${aBlockId}Table.setRowName(name);
	</#if>
</#if>
</#list>
	}

</#if>
<#if B("IS_ONE_ROW_SCS")>
<#assign one_row_block=S("ONE_ROW_SCS")>
	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected ${S("CLASS")}_${S("CLASS_SUFFIX")}_A(<@CDEF.CONT_DEF body=one_row_block/> row){
<#if !B("IS_ONE_ROW")><#-- 親画面がONE_ROWで、この画面にはRowがない場合*1 -->
		super(row);
<#else>
	<#list A("CONTAINER_BLOCK_IDS") as aBlockId><#if aBlockId_index=0>
		<#if B("${aBlockId}_IS_EI")>
		super(row);
		<#else>
		a${aBlockId}${S("${aBlockId}_CODE_S")} = row;
		</#if>
	</#if></#list>
</#if>
	}
</#if>
</#if>
<#if S("GENE_TYPE")!="LPC"&&S("GENE_TYPE")!="LPCD">
<#include F("FTL.SCREEN.AUTO2")/>
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