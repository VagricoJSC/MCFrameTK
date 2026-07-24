<#import "/container/Container.ftl" as CCON>
<#import "/macro/RevAnnotation.ftl" as REV>
<#if !CLASS_NAME?has_content>
<#-- このファイルのmacroのみ利用する場合のためのダミー定義 -->
<#assign CLASS_MODIFIER="", CLASS_NAME="", SUPER_CLASS_NAME=""/>
</#if>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")};

<@DML_IMPORT/>
<@REV.REV_IMPORT/>

/**
 * DBコンテナ(DML)クラスです。<p>
<#if S(S("BLOCK_ID") + "_GENE_MODE_LAYER")=="1">
 *
 * <br>
<#include F("FTL.ROW.DBC_COMMENT")/>
</#if>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
<#if FMCONST_B("FTL.SUPPRESSWARNINGS")>
@SuppressWarnings({"all"})
</#if>
<@REV.REV_ANNOTATION/>
${CLASS_MODIFIER}class ${CLASS_NAME} extends ${SUPER_CLASS_NAME} {

<#if FMCONST_B("DB.DBC_GENE_630")>
<@DML_FIELD/>

</#if>
	/**
	 * コンストラクタ
	 */
	public ${CLASS_NAME}(String name, String[][] rowAlias) {
		super(name, rowAlias);
	}

<#if FMCONST_B("DB.DBC_GENE_630")>
	/**
	 * 初期化処理
	 *
	 */
<@DML_INIT M_SIG="init" ARG_CLASS="" ARG_NAME=""/>
</#if>
}
<#macro DML_FIELD>
	public static final String TABLE_NAME = "${S(S("BLOCK_ID") + "_TABLE")}"; 

	public static final String TABLE_ALIAS = "${S(S("BLOCK_ID") + "_TABLE_ALIAS")}";
	
	public static final String TABLE_TEXT = TABLE_NAME + " " + TABLE_ALIAS;

	public static final boolean EX_CTRL = ${(S(S("BLOCK_ID") + "_EXCLUSIVE")?upper_case=="TRUE")?string("true", "false")};

<#list A(S("BLOCK_ID") + "_FOREIGN_IDS") as aFId>
	public static final String $${S(S("BLOCK_ID") + "_" + aFId + "_F_MESSAGE")} = "${S(S("BLOCK_ID") + "_" + aFId + "_F_MESSAGE")}";
	public static final MCForeignInfo FK_${S(S("BLOCK_ID") + "_" + aFId + "_F_MESSAGE")} = 
			new MCForeignInfo("${S(S("BLOCK_ID") + "_" + aFId + "_F_NAME")}",
						"${S(S("BLOCK_ID") + "_" + aFId + "_F_MESSAGE")}",
						TABLE_ALIAS,
						new String[][]{
<#assign F_KEYS = S(S("BLOCK_ID") + "_" + aFId + "_F_F_KEY")?split(",")>
<#assign i=0>
	<#list F_KEYS as f_key>
							{"${f_key}", "${S(S("BLOCK_ID") + "_" + aFId + "_F_LABEL_" + i)}"}<#if f_key_has_next>,<#else>}<#if A(S("BLOCK_ID") + "_" + aFId + "_F_TA_IDS")?size==0>);<#else>,</#if></#if>
	<#assign i=i+1>
	</#list>
	<#list A(S("BLOCK_ID") + "_" + aFId + "_F_TA_IDS") as taId>
						${S("BLOCK_ID")}_R.$<#if S(S("BLOCK_ID") + "_" + taId + "_TYPE")=="RI"&&S(S("BLOCK_ID") + "_" + taId + "_CP_ALIAS") != "">${S(S("BLOCK_ID") + "_" + taId + "_CP_ALIAS")}<#else>${taId}</#if>, "${S(S("BLOCK_ID") + "_" + taId + "_ALIAS")}"<#if taId_has_next>,<#else>);</#if>
	</#list>
</#list>

	public static final Map<String, String> COLUMN_MAP = new HashMap<String, String>();
	static {
<#if FMCONST_B("DB.DBC_GENE_630")>
	<#if S(S("BLOCK_ID") + "_SUPER_DML_CLASS")!="MCDMLAgent">
		COLUMN_MAP.putAll(${S(S("BLOCK_ID") + "_SUPER_DML_CLASS")}.COLUMN_MAP);
	</#if>
<#else>
	<#if S(S("BLOCK_ID") + "_SUPER_ROW_CLASS")!="MCDBRow">
		COLUMN_MAP.putAll(${S(S("BLOCK_ID") + "_SUPER_ROW_CLASS")}.COLUMN_MAP);
	</#if>
</#if>
<#list A(S("BLOCK_ID") + "_ITEM_IDS") as anItemId>
<#assign tarLev = ["K","C"]>
<#if tarLev?seq_contains(S(S("BLOCK_ID") + "_" + anItemId + "_LEVEL"))>
<#if S(S("BLOCK_ID") + "_" + anItemId + "_TYPE")=="RI">
		COLUMN_MAP.put(${S("BLOCK_ID")}_R.$${S(S("BLOCK_ID") + "_" + anItemId + "_ALIAS")}, "${S(S("BLOCK_ID") + "_" + anItemId + "_ALIAS")}");
<#else>
		COLUMN_MAP.put(${S("BLOCK_ID")}_R.$${anItemId}, "${S(S("BLOCK_ID") + "_" + anItemId + "_ALIAS")}");
</#if>
</#if>
</#list>
	}

	public static final List<String> DEF_SELECT_COLUMN = new ArrayList<String>();
	static {
<#if FMCONST_B("DB.DBC_GENE_630")>
	<#if S(S("BLOCK_ID") + "_SUPER_DML_CLASS")!="MCDMLAgent">
		DEF_SELECT_COLUMN.addAll(${S(S("BLOCK_ID") + "_SUPER_DML_CLASS")}.DEF_SELECT_COLUMN);
	</#if>
<#else>
	<#if S(S("BLOCK_ID") + "_SUPER_ROW_CLASS")!="MCDBRow">
		DEF_SELECT_COLUMN.addAll(${S(S("BLOCK_ID") + "_SUPER_ROW_CLASS")}.DEF_SELECT_COLUMN);
	</#if>
</#if>
<#list A(S("BLOCK_ID") + "_ITEM_IDS") as anItemId>
<#assign tarLev = ["K","C","J"]>
<#if tarLev?seq_contains(S(S("BLOCK_ID") + "_" + anItemId + "_LEVEL"))>
<#if S(S("BLOCK_ID") + "_" + anItemId + "_TYPE")=="RI"&&S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS") != "">
		DEF_SELECT_COLUMN.add(${S("BLOCK_ID")}_R.$${S(S("BLOCK_ID") + "_" + anItemId + "_CP_ALIAS")});
<#else>
		DEF_SELECT_COLUMN.add(${S("BLOCK_ID")}_R.$${anItemId});
</#if>
</#if>
</#list>
	}
</#macro>
<#macro DML_IMPORT>
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mcframe.serverCore.database.MCForeignInfo;
import mcframe.serverCore.database.container.MCDMLAgent;
import mcframe.serverCore.database.container.MCDMLAgent.MCTableTypeDetail;
</#macro>
<#function getTableType tableType>
	<#if tableType == "*">
		<#local result = "MCTableTypeDetail.TABLE">
	<#elseif tableType == "*v">
		<#local result = "MCTableTypeDetail.VIEW">
	<#elseif tableType == "*gtd">
		<#local result = "MCTableTypeDetail.TEMP_TABLE_ON_COMMIT_DELETE_ROWS">
	<#elseif tableType == "*gtp">
		<#local result = "MCTableTypeDetail.TEMP_TABLE_ON_COMMIT_PRESERVE_ROWS">
	<#else>
		<#local result = "MCTableTypeDetail.TABLE">
	</#if>
	<#return result>
</#function>
<#function getCommonView commonview>
	<#if commonview == "TRUE">
		<#local result = "true">
	<#else>
		<#local result = "false">
	</#if>
	<#return result>
</#function>
<#macro DML_INIT M_SIG ARG_CLASS ARG_NAME>
<#if ARG_CLASS!="">
<#assign C_TAR=ARG_CLASS + ".", TAR=ARG_NAME + "."/>
<#else>
<#assign C_TAR="", TAR=""/>
</#if>
	public void ${M_SIG}(${ARG_CLASS}<#if ARG_CLASS!=""> </#if>${ARG_NAME}) {
		super.${M_SIG}(${ARG_NAME});

		//テーブル種別
		${TAR}tableType(${C_TAR}MCTableType.TABLE);
		${TAR}tableTypeDetail(${C_TAR}${getTableType(S(S("BLOCK_ID") + "_TABLE_TYPE"))});
		${TAR}commonView(${getCommonView(S(S("BLOCK_ID") + "_AUTO_GEN"))});
		//テーブル名
		${TAR}tableName(TABLE_NAME);
		${TAR}tableAlias(TABLE_ALIAS);
		${TAR}tableText(TABLE_TEXT);
		${TAR}exctrl(EX_CTRL);
<#if A(S("BLOCK_ID") + "_KEY_ITEM_IDS")?size!=0>
		//キーの設定
		${TAR}keyList(
<#list A(S("BLOCK_ID") + "_KEY_ITEM_IDS") as anItemId>
<#if S(S("BLOCK_ID") + "_" + anItemId + "_TYPE")=="RI">
			${S("BLOCK_ID")}_R.$${S(S("BLOCK_ID") + "_" + anItemId + "_ALIAS")}<#if anItemId_has_next>,</#if>
<#else>
			${S("BLOCK_ID")}_R.$${anItemId}<#if anItemId_has_next>,</#if>
</#if>
</#list>
		);
</#if>

		//NOT NULL制約
		${TAR}addNotNull(
<#list A(S("BLOCK_ID") + "_NOT_NULL_IDS") as anItemId>
<#if S(S("BLOCK_ID") + "_" + anItemId + "_TYPE")=="RI">
			${S("BLOCK_ID")}_R.$${S(S("BLOCK_ID") + "_" + anItemId + "_ALIAS")}<#if anItemId_has_next>,</#if>
<#else>
			${S("BLOCK_ID")}_R.$${anItemId}<#if anItemId_has_next>,</#if>
</#if>
</#list>
		);

		//コンテナとのマッピング
		${TAR}columnMap(COLUMN_MAP);
		//デフォルトのSELECT句のリスト
		${TAR}defultSelect(DEF_SELECT_COLUMN);

<#list A(S("BLOCK_ID") + "_CONTAINER_ITEM_IDS") as anItemId>
<#if B(S("BLOCK_ID") + "_" + anItemId + "_IS_SKIP")>
		${TAR}addSkipColomn("${anItemId}");
</#if>
</#list>

		//フォーリンキーの設定
		${TAR}addForeignInfo(<#list A(S("BLOCK_ID") + "_FOREIGN_IDS") as aFId>FK_${S(S("BLOCK_ID") + "_" + aFId + "_F_MESSAGE")}<#if aFId_has_next>, </#if></#list>);
		
		//PKワークテーブルの設定
		${TAR}makeTableTypeDetail();
	}
</#macro>