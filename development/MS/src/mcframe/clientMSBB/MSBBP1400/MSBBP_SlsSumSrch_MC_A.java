package mcframe.clientMSBB.MSBBP1400;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
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
import mcframe.clientMSBB.MSBBP1400.MSBBP_SlsSumSrch_MC.MS_MSBBL1400_Srch01Caller;
import mcframe.clientMSBB.MSBBP1400.MSBBP_SlsSumSrch_MC.MS_MSBBL1400_Srch02Caller;

/**
 * 画面"MSBBP_SlsSumSrch"パネルクラスです。<p>
 *
 * 受注残・売上を得意先別、部門別、担当者別、品目体系別など様々な切り口で集計して照会します。売上予算・販売計画との比較も可能です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBP_SlsSumSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBBP1400";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [MainTab]ブロック関連のField定義
	public MCPanel MainTabPanel = null;
	public MCTabbedPane MainTabTab = null;
	// [MainTab]ブロックの項目のField定義
	// [Dpt]ブロック関連のField定義
	public MCPanel DptPanel = null;
	// [Dpt]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_inpt_ym_d_Label = null;
	/**
	 * Specified month 指定年月.<p>
	 *
	 */
	public MCDateField Cnd_inpt_ym_d = null;
	/**
	 * Display sales forecasting 売上推移表示.<p>
	 *
	 */
	public MCCheckBox Cnd_sls_trnst_disp_d = null;
	public MCLabel Cnd_sls_disp_term_d_Label = null;
	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public MCNumberField Cnd_sls_disp_term_d = null;
	public MCLabel Cnd_sum_term_d_Label = null;
	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public MCNumberField Cnd_sum_term_d = null;
	public MCLabel Cnd_sls_bdg_grp_d_Label = null;
	/**
	 * Budget classification 予算分類.<p>
	 *
	 */
	public MCTextComboBox Cnd_sls_bdg_grp_d = null;
	public MCLabel Cnd_xrate_cd_d_Label = null;
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_xrate_cd_d = null;
	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public MCTextField Cnd_xrate_nm_d = null;
	/**
	 * Convert result by rate at sales 実績を売上時レートで換算.<p>
	 *
	 */
	public MCCheckBox Cnd_use_act_xrate_flg_d = null;
	public MCLabel Cnd_dpt_lvl_cd_d_Label = null;
	/**
	 * Dept. hierarchy 部門階層.<p>
	 *
	 */
	public MCTextComboBox Cnd_dpt_lvl_cd_d = null;
	/**
	 * Dept. hierarchy name 部門階層名.<p>
	 *
	 */
	public MCTextField Cnd_dpt_lvl_nm_d = null;
	public MCLabel Cnd_dpt_cd_d_Label = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_dpt_cd_d = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCTextField Cnd_dpt_nm_d = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch_d = null;
	public MCLabel Cnd_inpt_ym_ig_Label = null;
	/**
	 * Specified month 指定年月.<p>
	 *
	 */
	public MCDateField Cnd_inpt_ym_ig = null;
	/**
	 * Display sales forecasting 売上推移表示.<p>
	 *
	 */
	public MCCheckBox Cnd_sls_trnst_disp_ig = null;
	public MCLabel Cnd_sls_disp_term_ig_Label = null;
	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public MCNumberField Cnd_sls_disp_term_ig = null;
	public MCLabel Cnd_sum_term_ig_Label = null;
	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public MCNumberField Cnd_sum_term_ig = null;
	public MCLabel Cnd_sls_bdg_grp_ig_Label = null;
	/**
	 * Budget classification 予算分類.<p>
	 *
	 */
	public MCTextComboBox Cnd_sls_bdg_grp_ig = null;
	public MCLabel Cnd_xrate_cd_ig_Label = null;
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_xrate_cd_ig = null;
	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public MCTextField Cnd_xrate_nm_ig = null;
	/**
	 * Convert result by rate at sales 実績を売上時レートで換算.<p>
	 *
	 */
	public MCCheckBox Cnd_use_act_xrate_flg_ig = null;
	public MCLabel Cnd_sls_itm_grp_lvl_Label = null;
	/**
	 * Item system hierarchy 品目体系階層.<p>
	 *
	 */
	public MCNumberComboBox Cnd_sls_itm_grp_lvl = null;
	public MCLabel Cnd_sls_itm_grp_cd_ig_Label = null;
	/**
	 * Item system cd. 品目体系ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_sls_itm_grp_cd_ig = null;
	/**
	 * Item system name 品目体系名.<p>
	 *
	 */
	public MCTextField Cnd_sls_itm_grp_nm_ig = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch_ig = null;
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	public MCTitledBorder HdrTitledBorder = null;
	// [Hdr]ブロックの項目のField定義
	public MCLabel Hdr_base_cur_cd_Label = null;
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_base_cur_cd = null;
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public MCTextField Hdr_base_cur_nm = null;
	public MCLabel Hdr_unit_Label = null;
	/**
	 * Unit 単位.<p>
	 *
	 */
	public MCTextField Hdr_unit = null;
	/**
	 * Sales result 売上.<p>
	 *
	 */
	public MCCheckBox Hdr_sls_flg = null;
	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public MCCheckBox Hdr_slo_bl_flg = null;
	/**
	 * Sales order 受注.<p>
	 *
	 */
	public MCCheckBox Hdr_slo_flg = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCCheckBox Hdr_spln_flg = null;
	/**
	 * Plan progress rate 計画進捗率.<p>
	 *
	 */
	public MCCheckBox Hdr_spln_per_cmpl_sls_flg = null;
	/**
	 * Budget 予算.<p>
	 *
	 */
	public MCCheckBox Hdr_bdg_flg = null;
	/**
	 * Budget progress rate 予算進捗率.<p>
	 *
	 */
	public MCCheckBox Hdr_bdg_per_cmpl_sls_flg = null;
	/**
	 * Gross profit amount 粗利額.<p>
	 *
	 */
	public MCCheckBox Hdr_prof_amt_flg = null;
	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public MCCheckBox Hdr_prof_rate_flg = null;
	public MCLabel Hdr_big_num_rnd_typ_Label = null;
	/**
	 * Amount unit cd. 金額単位ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_big_num_rnd_typ = null;
	/**
	 * Amount unit name 金額単位名.<p>
	 *
	 */
	public MCTextField Hdr_big_num_rnd_typ_nm = null;
	// [DptDtl1]ブロック関連のField定義
	public MCPanel DptDtl1Panel = null;
	public MCScrollPane DptDtl1ScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1400.Dtl1R> DptDtl1Table = null;
	// [DptDtl1]ブロックの項目のField定義
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDptDtl1_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnDptDtl1_dpt_nm = null;
	/**
	 * Item system cd. 品目体系ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDptDtl1_itm_grp_cd = null;
	/**
	 * Item system name 品目体系名.<p>
	 *
	 */
	public MCColumnConfig columnDptDtl1_itm_grp_nm = null;
	/**
	 * Display name sort order 表示名称ソート順.<p>
	 *
	 */
	public MCColumnConfig columnDptDtl1_row_sort_col = null;
	/**
	 * Display name 表示名称.<p>
	 *
	 */
	public MCColumnConfig columnDptDtl1_row_title_nm = null;
	/**
	 * Sales order 受注.<p>
	 *
	 */
	public MCColumnConfig columnDptDtl1_slo = null;
	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public MCColumnConfig columnDptDtl1_slo_bl = null;
	/**
	 * Sales result 売上.<p>
	 *
	 */
	public MCColumnConfig columnDptDtl1_sls = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnDptDtl1_sum = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnDptDtl1_spln = null;
	/**
	 * Plan progress rate (Sales order) 計画進捗率（受注）.<p>
	 *
	 */
	public MCColumnConfig columnDptDtl1_spln_per_cmpl_slo = null;
	/**
	 * Plan progress rate 計画進捗率.<p>
	 *
	 */
	public MCColumnConfig columnDptDtl1_spln_per_cmpl_sls = null;
	/**
	 * Budget 予算.<p>
	 *
	 */
	public MCColumnConfig columnDptDtl1_bdg_sls = null;
	/**
	 * Budget progress rate (Sales order) 予算進捗率（受注）.<p>
	 *
	 */
	public MCColumnConfig columnDptDtl1_bdg_per_cmpl_slo = null;
	/**
	 * Budget progress rate 予算進捗率.<p>
	 *
	 */
	public MCColumnConfig columnDptDtl1_bdg_per_cmpl_sls = null;
	public MCColumnConfig columnDptDtl1_col_00 = null;
	public MCColumnConfig columnDptDtl1_col_01 = null;
	public MCColumnConfig columnDptDtl1_col_02 = null;
	public MCColumnConfig columnDptDtl1_col_03 = null;
	public MCColumnConfig columnDptDtl1_col_04 = null;
	public MCColumnConfig columnDptDtl1_col_05 = null;
	public MCColumnConfig columnDptDtl1_col_06 = null;
	public MCColumnConfig columnDptDtl1_col_07 = null;
	public MCColumnConfig columnDptDtl1_col_08 = null;
	public MCColumnConfig columnDptDtl1_col_09 = null;
	public MCColumnConfig columnDptDtl1_col_10 = null;
	public MCColumnConfig columnDptDtl1_col_11 = null;
	public MCColumnConfig columnDptDtl1_col_12 = null;
	public MCColumnConfig columnDptDtl1_col_13 = null;
	public MCColumnConfig columnDptDtl1_col_14 = null;
	public MCColumnConfig columnDptDtl1_col_15 = null;
	public MCColumnConfig columnDptDtl1_col_16 = null;
	public MCColumnConfig columnDptDtl1_col_17 = null;
	public MCColumnConfig columnDptDtl1_dpt1_key = null;
	public MCColumnConfig columnDptDtl1_dpt_nm1_key = null;
	// [DptDtlTab]ブロック関連のField定義
	public MCPanel DptDtlTabPanel = null;
	public MCTabbedPane DptDtlTabTab = null;
	// [DptDtlTab]ブロックの項目のField定義
	// [DptDwDpt]ブロック関連のField定義
	public MCPanel DptDwDptPanel = null;
	public MCScrollPane DptDwDptScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1400.DptDtlR> DptDwDptTable = null;
	// [DptDwDpt]ブロックの項目のField定義
	/**
	 * Lower dept. cd. 下位部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDptDwDpt_dw_dpt_cd = null;
	/**
	 * Lower dept. name 下位部門名.<p>
	 *
	 */
	public MCColumnConfig columnDptDwDpt_dw_dpt_nm = null;
	/**
	 * Display name sort order 表示名称ソート順.<p>
	 *
	 */
	public MCColumnConfig columnDptDwDpt_row_sort_col = null;
	/**
	 * Display name 表示名称.<p>
	 *
	 */
	public MCColumnConfig columnDptDwDpt_row_title_nm = null;
	/**
	 * Sales order 受注.<p>
	 *
	 */
	public MCColumnConfig columnDptDwDpt_slo = null;
	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public MCColumnConfig columnDptDwDpt_slo_bl = null;
	/**
	 * Sales result 売上.<p>
	 *
	 */
	public MCColumnConfig columnDptDwDpt_sls = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnDptDwDpt_sum = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnDptDwDpt_spln = null;
	/**
	 * Plan progress rate (Sales order) 計画進捗率（受注）.<p>
	 *
	 */
	public MCColumnConfig columnDptDwDpt_spln_per_cmpl_slo = null;
	/**
	 * Plan progress rate 計画進捗率.<p>
	 *
	 */
	public MCColumnConfig columnDptDwDpt_spln_per_cmpl_sls = null;
	/**
	 * Budget 予算.<p>
	 *
	 */
	public MCColumnConfig columnDptDwDpt_bdg_sls = null;
	/**
	 * Budget progress rate (Sales order) 予算進捗率（受注）.<p>
	 *
	 */
	public MCColumnConfig columnDptDwDpt_bdg_per_cmpl_slo = null;
	/**
	 * Budget progress rate 予算進捗率.<p>
	 *
	 */
	public MCColumnConfig columnDptDwDpt_bdg_per_cmpl_sls = null;
	public MCColumnConfig columnDptDwDpt_col_00 = null;
	public MCColumnConfig columnDptDwDpt_col_01 = null;
	public MCColumnConfig columnDptDwDpt_col_02 = null;
	public MCColumnConfig columnDptDwDpt_col_03 = null;
	public MCColumnConfig columnDptDwDpt_col_04 = null;
	public MCColumnConfig columnDptDwDpt_col_05 = null;
	public MCColumnConfig columnDptDwDpt_col_06 = null;
	public MCColumnConfig columnDptDwDpt_col_07 = null;
	public MCColumnConfig columnDptDwDpt_col_08 = null;
	public MCColumnConfig columnDptDwDpt_col_09 = null;
	public MCColumnConfig columnDptDwDpt_col_10 = null;
	public MCColumnConfig columnDptDwDpt_col_11 = null;
	public MCColumnConfig columnDptDwDpt_col_12 = null;
	public MCColumnConfig columnDptDwDpt_col_13 = null;
	public MCColumnConfig columnDptDwDpt_col_14 = null;
	public MCColumnConfig columnDptDwDpt_col_15 = null;
	public MCColumnConfig columnDptDwDpt_col_16 = null;
	public MCColumnConfig columnDptDwDpt_col_17 = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDptDwDpt_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnDptDwDpt_dpt_nm = null;
	public MCColumnConfig columnDptDwDpt_dpt2_key = null;
	public MCColumnConfig columnDptDwDpt_dpt_nm2_key = null;
	// [DptSlsUsr]ブロック関連のField定義
	public MCPanel DptSlsUsrPanel = null;
	public MCScrollPane DptSlsUsrScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1400.DptDtlR> DptSlsUsrTable = null;
	// [DptSlsUsr]ブロックの項目のField定義
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDptSlsUsr_sls_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCColumnConfig columnDptSlsUsr_sls_usr_nm = null;
	/**
	 * Display name sort order 表示名称ソート順.<p>
	 *
	 */
	public MCColumnConfig columnDptSlsUsr_row_sort_col = null;
	/**
	 * Display name 表示名称.<p>
	 *
	 */
	public MCColumnConfig columnDptSlsUsr_row_title_nm = null;
	/**
	 * Sales order 受注.<p>
	 *
	 */
	public MCColumnConfig columnDptSlsUsr_slo = null;
	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public MCColumnConfig columnDptSlsUsr_slo_bl = null;
	/**
	 * Sales result 売上.<p>
	 *
	 */
	public MCColumnConfig columnDptSlsUsr_sls = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnDptSlsUsr_sum = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnDptSlsUsr_spln = null;
	/**
	 * Plan progress rate (Sales order) 計画進捗率（受注）.<p>
	 *
	 */
	public MCColumnConfig columnDptSlsUsr_spln_per_cmpl_slo = null;
	/**
	 * Plan progress rate 計画進捗率.<p>
	 *
	 */
	public MCColumnConfig columnDptSlsUsr_spln_per_cmpl_sls = null;
	/**
	 * Budget 予算.<p>
	 *
	 */
	public MCColumnConfig columnDptSlsUsr_bdg_sls = null;
	/**
	 * Budget progress rate (Sales order) 予算進捗率（受注）.<p>
	 *
	 */
	public MCColumnConfig columnDptSlsUsr_bdg_per_cmpl_slo = null;
	/**
	 * Budget progress rate 予算進捗率.<p>
	 *
	 */
	public MCColumnConfig columnDptSlsUsr_bdg_per_cmpl_sls = null;
	public MCColumnConfig columnDptSlsUsr_col_00 = null;
	public MCColumnConfig columnDptSlsUsr_col_01 = null;
	public MCColumnConfig columnDptSlsUsr_col_02 = null;
	public MCColumnConfig columnDptSlsUsr_col_03 = null;
	public MCColumnConfig columnDptSlsUsr_col_04 = null;
	public MCColumnConfig columnDptSlsUsr_col_05 = null;
	public MCColumnConfig columnDptSlsUsr_col_06 = null;
	public MCColumnConfig columnDptSlsUsr_col_07 = null;
	public MCColumnConfig columnDptSlsUsr_col_08 = null;
	public MCColumnConfig columnDptSlsUsr_col_09 = null;
	public MCColumnConfig columnDptSlsUsr_col_10 = null;
	public MCColumnConfig columnDptSlsUsr_col_11 = null;
	public MCColumnConfig columnDptSlsUsr_col_12 = null;
	public MCColumnConfig columnDptSlsUsr_col_13 = null;
	public MCColumnConfig columnDptSlsUsr_col_14 = null;
	public MCColumnConfig columnDptSlsUsr_col_15 = null;
	public MCColumnConfig columnDptSlsUsr_col_16 = null;
	public MCColumnConfig columnDptSlsUsr_col_17 = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDptSlsUsr_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnDptSlsUsr_dpt_nm = null;
	public MCColumnConfig columnDptSlsUsr_sls_usr_cd_key = null;
	// [DptCst]ブロック関連のField定義
	public MCPanel DptCstPanel = null;
	public MCScrollPane DptCstScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1400.DptDtlR> DptCstTable = null;
	// [DptCst]ブロックの項目のField定義
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDptCst_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnDptCst_cst_nm = null;
	/**
	 * Display name sort order 表示名称ソート順.<p>
	 *
	 */
	public MCColumnConfig columnDptCst_row_sort_col = null;
	/**
	 * Display name 表示名称.<p>
	 *
	 */
	public MCColumnConfig columnDptCst_row_title_nm = null;
	/**
	 * Sales order 受注.<p>
	 *
	 */
	public MCColumnConfig columnDptCst_slo = null;
	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public MCColumnConfig columnDptCst_slo_bl = null;
	/**
	 * Sales result 売上.<p>
	 *
	 */
	public MCColumnConfig columnDptCst_sls = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnDptCst_sum = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnDptCst_spln = null;
	/**
	 * Plan progress rate (Sales order) 計画進捗率（受注）.<p>
	 *
	 */
	public MCColumnConfig columnDptCst_spln_per_cmpl_slo = null;
	/**
	 * Plan progress rate 計画進捗率.<p>
	 *
	 */
	public MCColumnConfig columnDptCst_spln_per_cmpl_sls = null;
	/**
	 * Budget 予算.<p>
	 *
	 */
	public MCColumnConfig columnDptCst_bdg_sls = null;
	/**
	 * Budget progress rate (Sales order) 予算進捗率（受注）.<p>
	 *
	 */
	public MCColumnConfig columnDptCst_bdg_per_cmpl_slo = null;
	/**
	 * Budget progress rate 予算進捗率.<p>
	 *
	 */
	public MCColumnConfig columnDptCst_bdg_per_cmpl_sls = null;
	public MCColumnConfig columnDptCst_col_00 = null;
	public MCColumnConfig columnDptCst_col_01 = null;
	public MCColumnConfig columnDptCst_col_02 = null;
	public MCColumnConfig columnDptCst_col_03 = null;
	public MCColumnConfig columnDptCst_col_04 = null;
	public MCColumnConfig columnDptCst_col_05 = null;
	public MCColumnConfig columnDptCst_col_06 = null;
	public MCColumnConfig columnDptCst_col_07 = null;
	public MCColumnConfig columnDptCst_col_08 = null;
	public MCColumnConfig columnDptCst_col_09 = null;
	public MCColumnConfig columnDptCst_col_10 = null;
	public MCColumnConfig columnDptCst_col_11 = null;
	public MCColumnConfig columnDptCst_col_12 = null;
	public MCColumnConfig columnDptCst_col_13 = null;
	public MCColumnConfig columnDptCst_col_14 = null;
	public MCColumnConfig columnDptCst_col_15 = null;
	public MCColumnConfig columnDptCst_col_16 = null;
	public MCColumnConfig columnDptCst_col_17 = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDptCst_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnDptCst_dpt_nm = null;
	public MCColumnConfig columnDptCst_cst_cd_key = null;
	// [ItmGrp]ブロック関連のField定義
	public MCPanel ItmGrpPanel = null;
	// [ItmGrp]ブロックの項目のField定義
	// [ItmGrpCnd]ブロック関連のField定義
	public MCPanel ItmGrpCndPanel = null;
	public MCTitledBorder ItmGrpCndTitledBorder = null;
	// [ItmGrpCnd]ブロックの項目のField定義
	// [ItmGrpHdr]ブロック関連のField定義
	public MCPanel ItmGrpHdrPanel = null;
	public MCTitledBorder ItmGrpHdrTitledBorder = null;
	// [ItmGrpHdr]ブロックの項目のField定義
	public MCLabel ItmGrpHdr_base_cur_cd_Label = null;
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCTextField ItmGrpHdr_base_cur_cd = null;
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public MCTextField ItmGrpHdr_base_cur_nm = null;
	public MCLabel ItmGrpHdr_unit_Label = null;
	/**
	 * Unit 単位.<p>
	 *
	 */
	public MCTextField ItmGrpHdr_unit = null;
	/**
	 * Sales result 売上.<p>
	 *
	 */
	public MCCheckBox ItmGrpHdr_sls_flg = null;
	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public MCCheckBox ItmGrpHdr_slo_bl_flg = null;
	/**
	 * Sales order 受注.<p>
	 *
	 */
	public MCCheckBox ItmGrpHdr_slo_flg = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCCheckBox ItmGrpHdr_spln_flg = null;
	/**
	 * Plan progress rate 計画進捗率.<p>
	 *
	 */
	public MCCheckBox ItmGrpHdr_spln_per_cmpl_sls_flg = null;
	/**
	 * Budget 予算.<p>
	 *
	 */
	public MCCheckBox ItmGrpHdr_bdg_flg = null;
	/**
	 * Budget progress rate 予算進捗率.<p>
	 *
	 */
	public MCCheckBox ItmGrpHdr_bdg_per_cmpl_sls_flg = null;
	/**
	 * Gross profit amount 粗利額.<p>
	 *
	 */
	public MCCheckBox ItmGrpHdr_prof_amt_flg = null;
	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public MCCheckBox ItmGrpHdr_prof_rate_flg = null;
	public MCLabel ItmGrpHdr_big_num_rnd_typ_Label = null;
	/**
	 * Amount unit cd. 金額単位ＣＤ.<p>
	 *
	 */
	public MCTextComboBox ItmGrpHdr_big_num_rnd_typ = null;
	/**
	 * Amount unit name 金額単位名.<p>
	 *
	 */
	public MCTextField ItmGrpHdr_big_num_rnd_typ_nm = null;
	// [ItmGrpDtl1]ブロック関連のField定義
	public MCPanel ItmGrpDtl1Panel = null;
	public MCScrollPane ItmGrpDtl1ScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1400.Dtl1R> ItmGrpDtl1Table = null;
	// [ItmGrpDtl1]ブロックの項目のField定義
	/**
	 * Item system cd. 品目体系ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDtl1_itm_grp_cd = null;
	/**
	 * Item system name 品目体系名.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDtl1_itm_grp_nm = null;
	/**
	 * Display name sort order 表示名称ソート順.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDtl1_row_sort_col = null;
	/**
	 * Display name 表示名称.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDtl1_row_title_nm = null;
	/**
	 * Sales order 受注.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDtl1_slo = null;
	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDtl1_slo_bl = null;
	/**
	 * Sales result 売上.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDtl1_sls = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDtl1_sum = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDtl1_spln = null;
	/**
	 * Plan progress rate (Sales order) 計画進捗率（受注）.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDtl1_spln_per_cmpl_slo = null;
	/**
	 * Plan progress rate 計画進捗率.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDtl1_spln_per_cmpl_sls = null;
	/**
	 * Budget 予算.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDtl1_bdg_sls = null;
	/**
	 * Budget progress rate (Sales order) 予算進捗率（受注）.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDtl1_bdg_per_cmpl_slo = null;
	/**
	 * Budget progress rate 予算進捗率.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDtl1_bdg_per_cmpl_sls = null;
	public MCColumnConfig columnItmGrpDtl1_col_00 = null;
	public MCColumnConfig columnItmGrpDtl1_col_01 = null;
	public MCColumnConfig columnItmGrpDtl1_col_02 = null;
	public MCColumnConfig columnItmGrpDtl1_col_03 = null;
	public MCColumnConfig columnItmGrpDtl1_col_04 = null;
	public MCColumnConfig columnItmGrpDtl1_col_05 = null;
	public MCColumnConfig columnItmGrpDtl1_col_06 = null;
	public MCColumnConfig columnItmGrpDtl1_col_07 = null;
	public MCColumnConfig columnItmGrpDtl1_col_08 = null;
	public MCColumnConfig columnItmGrpDtl1_col_09 = null;
	public MCColumnConfig columnItmGrpDtl1_col_10 = null;
	public MCColumnConfig columnItmGrpDtl1_col_11 = null;
	public MCColumnConfig columnItmGrpDtl1_col_12 = null;
	public MCColumnConfig columnItmGrpDtl1_col_13 = null;
	public MCColumnConfig columnItmGrpDtl1_col_14 = null;
	public MCColumnConfig columnItmGrpDtl1_col_15 = null;
	public MCColumnConfig columnItmGrpDtl1_col_16 = null;
	public MCColumnConfig columnItmGrpDtl1_col_17 = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDtl1_amt_dec_place = null;
	/**
	 * Rate number of decimal places 率小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDtl1_rate_dec_place = null;
	/**
	 * Item system 品目体系.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDtl1_itm_grp1_key = null;
	/**
	 * Item system name 品目体系名.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDtl1_itm_grp_nm1_key = null;
	// [ItmGrpDtlTab]ブロック関連のField定義
	public MCPanel ItmGrpDtlTabPanel = null;
	public MCTabbedPane ItmGrpDtlTabTab = null;
	// [ItmGrpDtlTab]ブロックの項目のField定義
	// [ItmGrpDwItmGrp]ブロック関連のField定義
	public MCPanel ItmGrpDwItmGrpPanel = null;
	public MCScrollPane ItmGrpDwItmGrpScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> ItmGrpDwItmGrpTable = null;
	// [ItmGrpDwItmGrp]ブロックの項目のField定義
	/**
	 * Lower item system cd. 下位品目体系ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDwItmGrp_dw_itm_grp_cd = null;
	/**
	 * Lower item system name 下位品目体系名.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDwItmGrp_dw_itm_grp_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D ItmGrpDwItmGrp_itm_p_PPanel;
	public MCColumnConfig columnItmGrpDwItmGrp_itm_cd;// [ItmGrpDwItmGrp]の[itm_p.itm_cd]を[columnItmGrpDwItmGrp_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnItmGrpDwItmGrp_itm_sub1;// [ItmGrpDwItmGrp]の[itm_p.itm_sub1]を[columnItmGrpDwItmGrp_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnItmGrpDwItmGrp_itm_sub2;// [ItmGrpDwItmGrp]の[itm_p.itm_sub2]を[columnItmGrpDwItmGrp_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnItmGrpDwItmGrp_itm_sub3;// [ItmGrpDwItmGrp]の[itm_p.itm_sub3]を[columnItmGrpDwItmGrp_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnItmGrpDwItmGrp_itm_nm;// [ItmGrpDwItmGrp]の[itm_p.itm_nm]を[columnItmGrpDwItmGrp_itm_nm]としてエイリアス定義。
	/**
	 * Display name sort order 表示名称ソート順.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDwItmGrp_row_sort_col = null;
	/**
	 * Display name 表示名称.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDwItmGrp_row_title_nm = null;
	/**
	 * Sales order 受注.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDwItmGrp_slo = null;
	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDwItmGrp_slo_bl = null;
	/**
	 * Sales result 売上.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDwItmGrp_sls = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDwItmGrp_sum = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDwItmGrp_spln = null;
	/**
	 * Plan progress rate (Sales order) 計画進捗率（受注）.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDwItmGrp_spln_per_cmpl_slo = null;
	/**
	 * Plan progress rate 計画進捗率.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDwItmGrp_spln_per_cmpl_sls = null;
	/**
	 * Budget 予算.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDwItmGrp_bdg_sls = null;
	/**
	 * Budget progress rate (Sales order) 予算進捗率（受注）.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDwItmGrp_bdg_per_cmpl_slo = null;
	/**
	 * Budget progress rate 予算進捗率.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDwItmGrp_bdg_per_cmpl_sls = null;
	public MCColumnConfig columnItmGrpDwItmGrp_col_00 = null;
	public MCColumnConfig columnItmGrpDwItmGrp_col_01 = null;
	public MCColumnConfig columnItmGrpDwItmGrp_col_02 = null;
	public MCColumnConfig columnItmGrpDwItmGrp_col_03 = null;
	public MCColumnConfig columnItmGrpDwItmGrp_col_04 = null;
	public MCColumnConfig columnItmGrpDwItmGrp_col_05 = null;
	public MCColumnConfig columnItmGrpDwItmGrp_col_06 = null;
	public MCColumnConfig columnItmGrpDwItmGrp_col_07 = null;
	public MCColumnConfig columnItmGrpDwItmGrp_col_08 = null;
	public MCColumnConfig columnItmGrpDwItmGrp_col_09 = null;
	public MCColumnConfig columnItmGrpDwItmGrp_col_10 = null;
	public MCColumnConfig columnItmGrpDwItmGrp_col_11 = null;
	public MCColumnConfig columnItmGrpDwItmGrp_col_12 = null;
	public MCColumnConfig columnItmGrpDwItmGrp_col_13 = null;
	public MCColumnConfig columnItmGrpDwItmGrp_col_14 = null;
	public MCColumnConfig columnItmGrpDwItmGrp_col_15 = null;
	public MCColumnConfig columnItmGrpDwItmGrp_col_16 = null;
	public MCColumnConfig columnItmGrpDwItmGrp_col_17 = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDwItmGrp_base_unit_dec_place = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDwItmGrp_amt_dec_place = null;
	/**
	 * Rate number of decimal places 率小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDwItmGrp_rate_dec_place = null;
	/**
	 * Item system cd. 品目体系ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpDwItmGrp_itm_grp_cd = null;
	public MCColumnConfig columnItmGrpDwItmGrp_itm_grp2_key = null;
	// [ItmGrpItm]ブロック関連のField定義
	public MCPanel ItmGrpItmPanel = null;
	public MCScrollPane ItmGrpItmScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> ItmGrpItmTable = null;
	// [ItmGrpItm]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D ItmGrpItm_itm_p_PPanel;
	public MCColumnConfig columnItmGrpItm_itm_cd;// [ItmGrpItm]の[itm_p.itm_cd]を[columnItmGrpItm_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnItmGrpItm_itm_sub1;// [ItmGrpItm]の[itm_p.itm_sub1]を[columnItmGrpItm_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnItmGrpItm_itm_sub2;// [ItmGrpItm]の[itm_p.itm_sub2]を[columnItmGrpItm_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnItmGrpItm_itm_sub3;// [ItmGrpItm]の[itm_p.itm_sub3]を[columnItmGrpItm_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnItmGrpItm_itm_nm;// [ItmGrpItm]の[itm_p.itm_nm]を[columnItmGrpItm_itm_nm]としてエイリアス定義。
	/**
	 * Display name sort order 表示名称ソート順.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpItm_row_sort_col = null;
	/**
	 * Display name 表示名称.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpItm_row_title_nm = null;
	/**
	 * Sales order 受注.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpItm_slo = null;
	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpItm_slo_bl = null;
	/**
	 * Sales result 売上.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpItm_sls = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpItm_sum = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpItm_spln = null;
	/**
	 * Plan progress rate (Sales order) 計画進捗率（受注）.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpItm_spln_per_cmpl_slo = null;
	/**
	 * Plan progress rate 計画進捗率.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpItm_spln_per_cmpl_sls = null;
	/**
	 * Budget 予算.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpItm_bdg_sls = null;
	/**
	 * Budget progress rate (Sales order) 予算進捗率（受注）.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpItm_bdg_per_cmpl_slo = null;
	/**
	 * Budget progress rate 予算進捗率.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpItm_bdg_per_cmpl_sls = null;
	public MCColumnConfig columnItmGrpItm_col_00 = null;
	public MCColumnConfig columnItmGrpItm_col_01 = null;
	public MCColumnConfig columnItmGrpItm_col_02 = null;
	public MCColumnConfig columnItmGrpItm_col_03 = null;
	public MCColumnConfig columnItmGrpItm_col_04 = null;
	public MCColumnConfig columnItmGrpItm_col_05 = null;
	public MCColumnConfig columnItmGrpItm_col_06 = null;
	public MCColumnConfig columnItmGrpItm_col_07 = null;
	public MCColumnConfig columnItmGrpItm_col_08 = null;
	public MCColumnConfig columnItmGrpItm_col_09 = null;
	public MCColumnConfig columnItmGrpItm_col_10 = null;
	public MCColumnConfig columnItmGrpItm_col_11 = null;
	public MCColumnConfig columnItmGrpItm_col_12 = null;
	public MCColumnConfig columnItmGrpItm_col_13 = null;
	public MCColumnConfig columnItmGrpItm_col_14 = null;
	public MCColumnConfig columnItmGrpItm_col_15 = null;
	public MCColumnConfig columnItmGrpItm_col_16 = null;
	public MCColumnConfig columnItmGrpItm_col_17 = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpItm_base_unit_dec_place = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpItm_amt_dec_place = null;
	/**
	 * Rate number of decimal places 率小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpItm_rate_dec_place = null;
	/**
	 * Item system cd. 品目体系ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpItm_itm_grp_cd = null;
	public MCColumnConfig columnItmGrpItm_itm_cd_key = null;
	public MCColumnConfig columnItmGrpItm_itm_sub1_key = null;
	public MCColumnConfig columnItmGrpItm_itm_sub2_key = null;
	public MCColumnConfig columnItmGrpItm_itm_sub3_key = null;
	// [ItmGrpCst]ブロック関連のField定義
	public MCPanel ItmGrpCstPanel = null;
	public MCScrollPane ItmGrpCstScrollPane = null;
	public MCTable2<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> ItmGrpCstTable = null;
	// [ItmGrpCst]ブロックの項目のField定義
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpCst_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpCst_cst_nm = null;
	/**
	 * Display name sort order 表示名称ソート順.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpCst_row_sort_col = null;
	/**
	 * Display name 表示名称.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpCst_row_title_nm = null;
	/**
	 * Sales order 受注.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpCst_slo = null;
	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpCst_slo_bl = null;
	/**
	 * Sales result 売上.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpCst_sls = null;
	/**
	 * Total 合計.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpCst_sum = null;
	/**
	 * Plan 計画.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpCst_spln = null;
	/**
	 * Plan progress rate (Sales order) 計画進捗率（受注）.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpCst_spln_per_cmpl_slo = null;
	/**
	 * Plan progress rate 計画進捗率.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpCst_spln_per_cmpl_sls = null;
	/**
	 * Budget 予算.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpCst_bdg_sls = null;
	/**
	 * Budget progress rate (Sales order) 予算進捗率（受注）.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpCst_bdg_per_cmpl_slo = null;
	/**
	 * Budget progress rate 予算進捗率.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpCst_bdg_per_cmpl_sls = null;
	public MCColumnConfig columnItmGrpCst_col_00 = null;
	public MCColumnConfig columnItmGrpCst_col_01 = null;
	public MCColumnConfig columnItmGrpCst_col_02 = null;
	public MCColumnConfig columnItmGrpCst_col_03 = null;
	public MCColumnConfig columnItmGrpCst_col_04 = null;
	public MCColumnConfig columnItmGrpCst_col_05 = null;
	public MCColumnConfig columnItmGrpCst_col_06 = null;
	public MCColumnConfig columnItmGrpCst_col_07 = null;
	public MCColumnConfig columnItmGrpCst_col_08 = null;
	public MCColumnConfig columnItmGrpCst_col_09 = null;
	public MCColumnConfig columnItmGrpCst_col_10 = null;
	public MCColumnConfig columnItmGrpCst_col_11 = null;
	public MCColumnConfig columnItmGrpCst_col_12 = null;
	public MCColumnConfig columnItmGrpCst_col_13 = null;
	public MCColumnConfig columnItmGrpCst_col_14 = null;
	public MCColumnConfig columnItmGrpCst_col_15 = null;
	public MCColumnConfig columnItmGrpCst_col_16 = null;
	public MCColumnConfig columnItmGrpCst_col_17 = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpCst_base_unit_dec_place = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpCst_amt_dec_place = null;
	/**
	 * Rate number of decimal places 率小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpCst_rate_dec_place = null;
	/**
	 * Item system cd. 品目体系ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnItmGrpCst_itm_grp_cd = null;
	public MCColumnConfig columnItmGrpCst_cst_cd_key = null;
	/** [DPT_SRCH]モードを表す定数 */
	public static final String DPT_SRCH = "DPT_SRCH";
	/** [DPT_REF]モードを表す定数 */
	public static final String DPT_REF = "DPT_REF";
	/** [ITM_GRP_SRCH]モードを表す定数 */
	public static final String ITM_GRP_SRCH = "ITM_GRP_SRCH";
	/** [ITM_GRP_REF]モードを表す定数 */
	public static final String ITM_GRP_REF = "ITM_GRP_REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{DPT_SRCH, DPT_REF, ITM_GRP_SRCH, ITM_GRP_REF};
	
	/** [MS_MSBBL1400_Srch01]のCallerの作成 */
	protected MSBBP_SlsSumSrch_MC.MS_MSBBL1400_Srch01Caller createMS_MSBBL1400_Srch01() {
		MSBBP_SlsSumSrch_MC.MS_MSBBL1400_Srch01Caller<MSBBP_SlsSumSrch, MS_MSBBL1400_Srch01Bridge>
		caller = ((MSBBP_SlsSumSrch_MC)this).new MS_MSBBL1400_Srch01Caller<MSBBP_SlsSumSrch, MS_MSBBL1400_Srch01Bridge>(
					(MSBBP_SlsSumSrch)this, new MS_MSBBL1400_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBBL1400_Srch01]の呼び出し */
	protected void callMS_MSBBL1400_Srch01() {
		MCCaller caller = createMS_MSBBL1400_Srch01();
		caller.exec();
	}
	/** [MS_MSBBL1400_Srch02]のCallerの作成 */
	protected MSBBP_SlsSumSrch_MC.MS_MSBBL1400_Srch02Caller createMS_MSBBL1400_Srch02() {
		MSBBP_SlsSumSrch_MC.MS_MSBBL1400_Srch02Caller<MSBBP_SlsSumSrch, MS_MSBBL1400_Srch02Bridge>
		caller = ((MSBBP_SlsSumSrch_MC)this).new MS_MSBBL1400_Srch02Caller<MSBBP_SlsSumSrch, MS_MSBBL1400_Srch02Bridge>(
					(MSBBP_SlsSumSrch)this, new MS_MSBBL1400_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBBL1400_Srch02]の呼び出し */
	protected void callMS_MSBBL1400_Srch02() {
		MCCaller caller = createMS_MSBBL1400_Srch02();
		caller.exec();
	}
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1400.RsltR> aRsltL;
	/** [DptRslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1400.RsltR> aDptRsltL;
	/** [ItmGrpRslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1400.RsltR> aItmGrpRsltL;
	/** [DptDwDptAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> aDptDwDptAllL;
	/** [DptSlsUsrAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> aDptSlsUsrAllL;
	/** [DptCstAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> aDptCstAllL;
	/** [ItmGrpDwItmGrpAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> aItmGrpDwItmGrpAllL;
	/** [ItmGrpItmAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> aItmGrpItmAllL;
	/** [ItmGrpCstAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> aItmGrpCstAllL;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1400.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1400.HdrR aHdrR;
	/** [Dtl1]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1400.Dtl1R> aDtl1L;
	/** [DptDtl1]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1400.Dtl1R> aDptDtl1L;
	/** [DptDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> aDptDtlL;
	/** [DptDwDpt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> aDptDwDptL;
	/** [DptSlsUsr]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> aDptSlsUsrL;
	/** [DptCst]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> aDptCstL;
	/** [ItmGrpHdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBP1400.HdrR aItmGrpHdrR;
	/** [ItmGrpDtl1]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1400.Dtl1R> aItmGrpDtl1L;
	/** [ItmGrpDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> aItmGrpDtlL;
	/** [ItmGrpDwItmGrp]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> aItmGrpDwItmGrpL;
	/** [ItmGrpItm]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> aItmGrpItmL;
	/** [ItmGrpCst]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> aItmGrpCstL;

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBB.MSBBP1400.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBB.MSBBP1400.RsltR createRsltR() {
		return mcframe.clientMSBB.MSBBP1400.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1400.RsltR.class);
	}

	/**
	 * コピーによってaDptRsltLを設定します。
	 *
	 * aDptRsltLのインスタンスは変更されません。
	 *
	 * @param dataset DptRsltL
	 */
	public void setDptRsltL(MCList<mcframe.clientMSBB.MSBBP1400.RsltR> aList) {
		if (getDptRsltL() != aList) {
			getDptRsltL().setAll(aList);
		}
	}

	/**
	 * [DptRslt]ブロックのコンテナaDptRsltLを返します。
	 *
	 * @return DptRsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.RsltR> getDptRsltL() {
		return aDptRsltL;
	}

	/**
	 * aDptRsltRを作成します。
	 *
	 * @return DptRsltR
	 */
	public mcframe.clientMSBB.MSBBP1400.RsltR createDptRsltR() {
		return mcframe.clientMSBB.MSBBP1400.RsltR.create();
	}

	/**
	 * aDptRsltLを作成します。
	 *
	 * @return DptRsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.RsltR> createDptRsltL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1400.RsltR.class);
	}

	/**
	 * コピーによってaItmGrpRsltLを設定します。
	 *
	 * aItmGrpRsltLのインスタンスは変更されません。
	 *
	 * @param dataset ItmGrpRsltL
	 */
	public void setItmGrpRsltL(MCList<mcframe.clientMSBB.MSBBP1400.RsltR> aList) {
		if (getItmGrpRsltL() != aList) {
			getItmGrpRsltL().setAll(aList);
		}
	}

	/**
	 * [ItmGrpRslt]ブロックのコンテナaItmGrpRsltLを返します。
	 *
	 * @return ItmGrpRsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.RsltR> getItmGrpRsltL() {
		return aItmGrpRsltL;
	}

	/**
	 * aItmGrpRsltRを作成します。
	 *
	 * @return ItmGrpRsltR
	 */
	public mcframe.clientMSBB.MSBBP1400.RsltR createItmGrpRsltR() {
		return mcframe.clientMSBB.MSBBP1400.RsltR.create();
	}

	/**
	 * aItmGrpRsltLを作成します。
	 *
	 * @return ItmGrpRsltL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.RsltR> createItmGrpRsltL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1400.RsltR.class);
	}

	/**
	 * コピーによってaDptDwDptAllLを設定します。
	 *
	 * aDptDwDptAllLのインスタンスは変更されません。
	 *
	 * @param dataset DptDwDptAllL
	 */
	public void setDptDwDptAllL(MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> aList) {
		if (getDptDwDptAllL() != aList) {
			getDptDwDptAllL().setAll(aList);
		}
	}

	/**
	 * [DptDwDptAll]ブロックのコンテナaDptDwDptAllLを返します。
	 *
	 * @return DptDwDptAllL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> getDptDwDptAllL() {
		return aDptDwDptAllL;
	}

	/**
	 * aDptDwDptAllRを作成します。
	 *
	 * @return DptDwDptAllR
	 */
	public mcframe.clientMSBB.MSBBP1400.DptDtlR createDptDwDptAllR() {
		return mcframe.clientMSBB.MSBBP1400.DptDtlR.create();
	}

	/**
	 * aDptDwDptAllLを作成します。
	 *
	 * @return DptDwDptAllL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> createDptDwDptAllL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1400.DptDtlR.class);
	}

	/**
	 * コピーによってaDptSlsUsrAllLを設定します。
	 *
	 * aDptSlsUsrAllLのインスタンスは変更されません。
	 *
	 * @param dataset DptSlsUsrAllL
	 */
	public void setDptSlsUsrAllL(MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> aList) {
		if (getDptSlsUsrAllL() != aList) {
			getDptSlsUsrAllL().setAll(aList);
		}
	}

	/**
	 * [DptSlsUsrAll]ブロックのコンテナaDptSlsUsrAllLを返します。
	 *
	 * @return DptSlsUsrAllL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> getDptSlsUsrAllL() {
		return aDptSlsUsrAllL;
	}

	/**
	 * aDptSlsUsrAllRを作成します。
	 *
	 * @return DptSlsUsrAllR
	 */
	public mcframe.clientMSBB.MSBBP1400.DptDtlR createDptSlsUsrAllR() {
		return mcframe.clientMSBB.MSBBP1400.DptDtlR.create();
	}

	/**
	 * aDptSlsUsrAllLを作成します。
	 *
	 * @return DptSlsUsrAllL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> createDptSlsUsrAllL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1400.DptDtlR.class);
	}

	/**
	 * コピーによってaDptCstAllLを設定します。
	 *
	 * aDptCstAllLのインスタンスは変更されません。
	 *
	 * @param dataset DptCstAllL
	 */
	public void setDptCstAllL(MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> aList) {
		if (getDptCstAllL() != aList) {
			getDptCstAllL().setAll(aList);
		}
	}

	/**
	 * [DptCstAll]ブロックのコンテナaDptCstAllLを返します。
	 *
	 * @return DptCstAllL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> getDptCstAllL() {
		return aDptCstAllL;
	}

	/**
	 * aDptCstAllRを作成します。
	 *
	 * @return DptCstAllR
	 */
	public mcframe.clientMSBB.MSBBP1400.DptDtlR createDptCstAllR() {
		return mcframe.clientMSBB.MSBBP1400.DptDtlR.create();
	}

	/**
	 * aDptCstAllLを作成します。
	 *
	 * @return DptCstAllL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> createDptCstAllL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1400.DptDtlR.class);
	}

	/**
	 * コピーによってaItmGrpDwItmGrpAllLを設定します。
	 *
	 * aItmGrpDwItmGrpAllLのインスタンスは変更されません。
	 *
	 * @param dataset ItmGrpDwItmGrpAllL
	 */
	public void setItmGrpDwItmGrpAllL(MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> aList) {
		if (getItmGrpDwItmGrpAllL() != aList) {
			getItmGrpDwItmGrpAllL().setAll(aList);
		}
	}

	/**
	 * [ItmGrpDwItmGrpAll]ブロックのコンテナaItmGrpDwItmGrpAllLを返します。
	 *
	 * @return ItmGrpDwItmGrpAllL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> getItmGrpDwItmGrpAllL() {
		return aItmGrpDwItmGrpAllL;
	}

	/**
	 * aItmGrpDwItmGrpAllRを作成します。
	 *
	 * @return ItmGrpDwItmGrpAllR
	 */
	public mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR createItmGrpDwItmGrpAllR() {
		return mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.create();
	}

	/**
	 * aItmGrpDwItmGrpAllLを作成します。
	 *
	 * @return ItmGrpDwItmGrpAllL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> createItmGrpDwItmGrpAllL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.class);
	}

	/**
	 * コピーによってaItmGrpItmAllLを設定します。
	 *
	 * aItmGrpItmAllLのインスタンスは変更されません。
	 *
	 * @param dataset ItmGrpItmAllL
	 */
	public void setItmGrpItmAllL(MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> aList) {
		if (getItmGrpItmAllL() != aList) {
			getItmGrpItmAllL().setAll(aList);
		}
	}

	/**
	 * [ItmGrpItmAll]ブロックのコンテナaItmGrpItmAllLを返します。
	 *
	 * @return ItmGrpItmAllL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> getItmGrpItmAllL() {
		return aItmGrpItmAllL;
	}

	/**
	 * aItmGrpItmAllRを作成します。
	 *
	 * @return ItmGrpItmAllR
	 */
	public mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR createItmGrpItmAllR() {
		return mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.create();
	}

	/**
	 * aItmGrpItmAllLを作成します。
	 *
	 * @return ItmGrpItmAllL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> createItmGrpItmAllL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.class);
	}

	/**
	 * コピーによってaItmGrpCstAllLを設定します。
	 *
	 * aItmGrpCstAllLのインスタンスは変更されません。
	 *
	 * @param dataset ItmGrpCstAllL
	 */
	public void setItmGrpCstAllL(MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> aList) {
		if (getItmGrpCstAllL() != aList) {
			getItmGrpCstAllL().setAll(aList);
		}
	}

	/**
	 * [ItmGrpCstAll]ブロックのコンテナaItmGrpCstAllLを返します。
	 *
	 * @return ItmGrpCstAllL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> getItmGrpCstAllL() {
		return aItmGrpCstAllL;
	}

	/**
	 * aItmGrpCstAllRを作成します。
	 *
	 * @return ItmGrpCstAllR
	 */
	public mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR createItmGrpCstAllR() {
		return mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.create();
	}

	/**
	 * aItmGrpCstAllLを作成します。
	 *
	 * @return ItmGrpCstAllL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> createItmGrpCstAllL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.class);
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBB.MSBBP1400.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1400.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBB.MSBBP1400.CndR createCndR() {
		return mcframe.clientMSBB.MSBBP1400.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBB.MSBBP1400.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBB.MSBBP1400.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBB.MSBBP1400.HdrR createHdrR() {
		return mcframe.clientMSBB.MSBBP1400.HdrR.create();
	}

	/**
	 * コピーによってaDtl1Lを設定します。
	 *
	 * aDtl1Lのインスタンスは変更されません。
	 *
	 * @param dataset Dtl1L
	 */
	public void setDtl1L(MCList<mcframe.clientMSBB.MSBBP1400.Dtl1R> aList) {
		if (getDtl1L() != aList) {
			getDtl1L().setAll(aList);
		}
	}

	/**
	 * [Dtl1]ブロックのコンテナaDtl1Lを返します。
	 *
	 * @return Dtl1L
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.Dtl1R> getDtl1L() {
		return aDtl1L;
	}

	/**
	 * aDtl1Rを作成します。
	 *
	 * @return Dtl1R
	 */
	public mcframe.clientMSBB.MSBBP1400.Dtl1R createDtl1R() {
		return mcframe.clientMSBB.MSBBP1400.Dtl1R.create();
	}

	/**
	 * aDtl1Lを作成します。
	 *
	 * @return Dtl1L
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.Dtl1R> createDtl1L() {
		return MCList.create(mcframe.clientMSBB.MSBBP1400.Dtl1R.class);
	}

	/**
	 * コピーによってaDptDtl1Lを設定します。
	 *
	 * aDptDtl1Lのインスタンスは変更されません。
	 *
	 * @param dataset DptDtl1L
	 */
	public void setDptDtl1L(MCList<mcframe.clientMSBB.MSBBP1400.Dtl1R> aList) {
		if (getDptDtl1L() != aList) {
			getDptDtl1L().setAll(aList);
		}
	}

	/**
	 * [DptDtl1]ブロックのコンテナaDptDtl1Lを返します。
	 *
	 * @return DptDtl1L
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.Dtl1R> getDptDtl1L() {
		return aDptDtl1L;
	}

	/**
	 * aDptDtl1Rを作成します。
	 *
	 * @return DptDtl1R
	 */
	public mcframe.clientMSBB.MSBBP1400.Dtl1R createDptDtl1R() {
		return mcframe.clientMSBB.MSBBP1400.Dtl1R.create();
	}

	/**
	 * aDptDtl1Lを作成します。
	 *
	 * @return DptDtl1L
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.Dtl1R> createDptDtl1L() {
		return MCList.create(mcframe.clientMSBB.MSBBP1400.Dtl1R.class);
	}

	/**
	 * DptDtl1Tableを初期化します。
	 */
	protected void createDptDtl1Table(){
		if(DptDtl1Table == null){
			DptDtl1Table = beansFactory.createTable2("DptDtl1.table");
		}
	}

	/**
	 * コピーによってaDptDtlLを設定します。
	 *
	 * aDptDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DptDtlL
	 */
	public void setDptDtlL(MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> aList) {
		if (getDptDtlL() != aList) {
			getDptDtlL().setAll(aList);
		}
	}

	/**
	 * [DptDtl]ブロックのコンテナaDptDtlLを返します。
	 *
	 * @return DptDtlL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> getDptDtlL() {
		return aDptDtlL;
	}

	/**
	 * aDptDtlRを作成します。
	 *
	 * @return DptDtlR
	 */
	public mcframe.clientMSBB.MSBBP1400.DptDtlR createDptDtlR() {
		return mcframe.clientMSBB.MSBBP1400.DptDtlR.create();
	}

	/**
	 * aDptDtlLを作成します。
	 *
	 * @return DptDtlL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> createDptDtlL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1400.DptDtlR.class);
	}

	/**
	 * コピーによってaDptDwDptLを設定します。
	 *
	 * aDptDwDptLのインスタンスは変更されません。
	 *
	 * @param dataset DptDwDptL
	 */
	public void setDptDwDptL(MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> aList) {
		if (getDptDwDptL() != aList) {
			getDptDwDptL().setAll(aList);
		}
	}

	/**
	 * [DptDwDpt]ブロックのコンテナaDptDwDptLを返します。
	 *
	 * @return DptDwDptL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> getDptDwDptL() {
		return aDptDwDptL;
	}

	/**
	 * aDptDwDptRを作成します。
	 *
	 * @return DptDwDptR
	 */
	public mcframe.clientMSBB.MSBBP1400.DptDtlR createDptDwDptR() {
		return mcframe.clientMSBB.MSBBP1400.DptDtlR.create();
	}

	/**
	 * aDptDwDptLを作成します。
	 *
	 * @return DptDwDptL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> createDptDwDptL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1400.DptDtlR.class);
	}

	/**
	 * DptDwDptTableを初期化します。
	 */
	protected void createDptDwDptTable(){
		if(DptDwDptTable == null){
			DptDwDptTable = beansFactory.createTable2("DptDwDpt.table");
		}
	}

	/**
	 * コピーによってaDptSlsUsrLを設定します。
	 *
	 * aDptSlsUsrLのインスタンスは変更されません。
	 *
	 * @param dataset DptSlsUsrL
	 */
	public void setDptSlsUsrL(MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> aList) {
		if (getDptSlsUsrL() != aList) {
			getDptSlsUsrL().setAll(aList);
		}
	}

	/**
	 * [DptSlsUsr]ブロックのコンテナaDptSlsUsrLを返します。
	 *
	 * @return DptSlsUsrL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> getDptSlsUsrL() {
		return aDptSlsUsrL;
	}

	/**
	 * aDptSlsUsrRを作成します。
	 *
	 * @return DptSlsUsrR
	 */
	public mcframe.clientMSBB.MSBBP1400.DptDtlR createDptSlsUsrR() {
		return mcframe.clientMSBB.MSBBP1400.DptDtlR.create();
	}

	/**
	 * aDptSlsUsrLを作成します。
	 *
	 * @return DptSlsUsrL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> createDptSlsUsrL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1400.DptDtlR.class);
	}

	/**
	 * DptSlsUsrTableを初期化します。
	 */
	protected void createDptSlsUsrTable(){
		if(DptSlsUsrTable == null){
			DptSlsUsrTable = beansFactory.createTable2("DptSlsUsr.table");
		}
	}

	/**
	 * コピーによってaDptCstLを設定します。
	 *
	 * aDptCstLのインスタンスは変更されません。
	 *
	 * @param dataset DptCstL
	 */
	public void setDptCstL(MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> aList) {
		if (getDptCstL() != aList) {
			getDptCstL().setAll(aList);
		}
	}

	/**
	 * [DptCst]ブロックのコンテナaDptCstLを返します。
	 *
	 * @return DptCstL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> getDptCstL() {
		return aDptCstL;
	}

	/**
	 * aDptCstRを作成します。
	 *
	 * @return DptCstR
	 */
	public mcframe.clientMSBB.MSBBP1400.DptDtlR createDptCstR() {
		return mcframe.clientMSBB.MSBBP1400.DptDtlR.create();
	}

	/**
	 * aDptCstLを作成します。
	 *
	 * @return DptCstL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.DptDtlR> createDptCstL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1400.DptDtlR.class);
	}

	/**
	 * DptCstTableを初期化します。
	 */
	protected void createDptCstTable(){
		if(DptCstTable == null){
			DptCstTable = beansFactory.createTable2("DptCst.table");
		}
	}

	/**
	 * 項目コピーによってaItmGrpHdrRを設定します。
	 *
	 * aItmGrpHdrRのインスタンスは変更されません。
	 *
	 * @param row ItmGrpHdrR
	 */
	public void setItmGrpHdrR(mcframe.clientMSBB.MSBBP1400.HdrR row) {
		if (row != null) {
			MCRow.copyall(getItmGrpHdrR(), row);
		}
	}

	/**
	 * [ItmGrpHdr]ブロックのコンテナaItmGrpHdrRを返します。
	 *
	 * @return ItmGrpHdrR
	 */
	public mcframe.clientMSBB.MSBBP1400.HdrR getItmGrpHdrR() {
		return aItmGrpHdrR;
	}

	/**
	 * aItmGrpHdrRを作成します。
	 *
	 * @return ItmGrpHdrR
	 */
	public mcframe.clientMSBB.MSBBP1400.HdrR createItmGrpHdrR() {
		return mcframe.clientMSBB.MSBBP1400.HdrR.create();
	}

	/**
	 * コピーによってaItmGrpDtl1Lを設定します。
	 *
	 * aItmGrpDtl1Lのインスタンスは変更されません。
	 *
	 * @param dataset ItmGrpDtl1L
	 */
	public void setItmGrpDtl1L(MCList<mcframe.clientMSBB.MSBBP1400.Dtl1R> aList) {
		if (getItmGrpDtl1L() != aList) {
			getItmGrpDtl1L().setAll(aList);
		}
	}

	/**
	 * [ItmGrpDtl1]ブロックのコンテナaItmGrpDtl1Lを返します。
	 *
	 * @return ItmGrpDtl1L
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.Dtl1R> getItmGrpDtl1L() {
		return aItmGrpDtl1L;
	}

	/**
	 * aItmGrpDtl1Rを作成します。
	 *
	 * @return ItmGrpDtl1R
	 */
	public mcframe.clientMSBB.MSBBP1400.Dtl1R createItmGrpDtl1R() {
		return mcframe.clientMSBB.MSBBP1400.Dtl1R.create();
	}

	/**
	 * aItmGrpDtl1Lを作成します。
	 *
	 * @return ItmGrpDtl1L
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.Dtl1R> createItmGrpDtl1L() {
		return MCList.create(mcframe.clientMSBB.MSBBP1400.Dtl1R.class);
	}

	/**
	 * ItmGrpDtl1Tableを初期化します。
	 */
	protected void createItmGrpDtl1Table(){
		if(ItmGrpDtl1Table == null){
			ItmGrpDtl1Table = beansFactory.createTable2("ItmGrpDtl1.table");
		}
	}

	/**
	 * コピーによってaItmGrpDtlLを設定します。
	 *
	 * aItmGrpDtlLのインスタンスは変更されません。
	 *
	 * @param dataset ItmGrpDtlL
	 */
	public void setItmGrpDtlL(MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> aList) {
		if (getItmGrpDtlL() != aList) {
			getItmGrpDtlL().setAll(aList);
		}
	}

	/**
	 * [ItmGrpDtl]ブロックのコンテナaItmGrpDtlLを返します。
	 *
	 * @return ItmGrpDtlL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> getItmGrpDtlL() {
		return aItmGrpDtlL;
	}

	/**
	 * aItmGrpDtlRを作成します。
	 *
	 * @return ItmGrpDtlR
	 */
	public mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR createItmGrpDtlR() {
		return mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.create();
	}

	/**
	 * aItmGrpDtlLを作成します。
	 *
	 * @return ItmGrpDtlL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> createItmGrpDtlL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.class);
	}

	/**
	 * コピーによってaItmGrpDwItmGrpLを設定します。
	 *
	 * aItmGrpDwItmGrpLのインスタンスは変更されません。
	 *
	 * @param dataset ItmGrpDwItmGrpL
	 */
	public void setItmGrpDwItmGrpL(MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> aList) {
		if (getItmGrpDwItmGrpL() != aList) {
			getItmGrpDwItmGrpL().setAll(aList);
		}
	}

	/**
	 * [ItmGrpDwItmGrp]ブロックのコンテナaItmGrpDwItmGrpLを返します。
	 *
	 * @return ItmGrpDwItmGrpL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> getItmGrpDwItmGrpL() {
		return aItmGrpDwItmGrpL;
	}

	/**
	 * aItmGrpDwItmGrpRを作成します。
	 *
	 * @return ItmGrpDwItmGrpR
	 */
	public mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR createItmGrpDwItmGrpR() {
		return mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.create();
	}

	/**
	 * aItmGrpDwItmGrpLを作成します。
	 *
	 * @return ItmGrpDwItmGrpL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> createItmGrpDwItmGrpL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.class);
	}

	/**
	 * ItmGrpDwItmGrpTableを初期化します。
	 */
	protected void createItmGrpDwItmGrpTable(){
		if(ItmGrpDwItmGrpTable == null){
			ItmGrpDwItmGrpTable = beansFactory.createTable2("ItmGrpDwItmGrp.table");
		}
	}

	/**
	 * コピーによってaItmGrpItmLを設定します。
	 *
	 * aItmGrpItmLのインスタンスは変更されません。
	 *
	 * @param dataset ItmGrpItmL
	 */
	public void setItmGrpItmL(MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> aList) {
		if (getItmGrpItmL() != aList) {
			getItmGrpItmL().setAll(aList);
		}
	}

	/**
	 * [ItmGrpItm]ブロックのコンテナaItmGrpItmLを返します。
	 *
	 * @return ItmGrpItmL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> getItmGrpItmL() {
		return aItmGrpItmL;
	}

	/**
	 * aItmGrpItmRを作成します。
	 *
	 * @return ItmGrpItmR
	 */
	public mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR createItmGrpItmR() {
		return mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.create();
	}

	/**
	 * aItmGrpItmLを作成します。
	 *
	 * @return ItmGrpItmL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> createItmGrpItmL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.class);
	}

	/**
	 * ItmGrpItmTableを初期化します。
	 */
	protected void createItmGrpItmTable(){
		if(ItmGrpItmTable == null){
			ItmGrpItmTable = beansFactory.createTable2("ItmGrpItm.table");
		}
	}

	/**
	 * コピーによってaItmGrpCstLを設定します。
	 *
	 * aItmGrpCstLのインスタンスは変更されません。
	 *
	 * @param dataset ItmGrpCstL
	 */
	public void setItmGrpCstL(MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> aList) {
		if (getItmGrpCstL() != aList) {
			getItmGrpCstL().setAll(aList);
		}
	}

	/**
	 * [ItmGrpCst]ブロックのコンテナaItmGrpCstLを返します。
	 *
	 * @return ItmGrpCstL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> getItmGrpCstL() {
		return aItmGrpCstL;
	}

	/**
	 * aItmGrpCstRを作成します。
	 *
	 * @return ItmGrpCstR
	 */
	public mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR createItmGrpCstR() {
		return mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.create();
	}

	/**
	 * aItmGrpCstLを作成します。
	 *
	 * @return ItmGrpCstL
	 */
	public MCList<mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR> createItmGrpCstL() {
		return MCList.create(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.class);
	}

	/**
	 * ItmGrpCstTableを初期化します。
	 */
	protected void createItmGrpCstTable(){
		if(ItmGrpCstTable == null){
			ItmGrpCstTable = beansFactory.createTable2("ItmGrpCst.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
		if(!MCCollectionUtil.contains(ret, getDptRsltL())) ret.add(getDptRsltL());
		if(!MCCollectionUtil.contains(ret, getItmGrpRsltL())) ret.add(getItmGrpRsltL());
		if(!MCCollectionUtil.contains(ret, getDptDwDptAllL())) ret.add(getDptDwDptAllL());
		if(!MCCollectionUtil.contains(ret, getDptSlsUsrAllL())) ret.add(getDptSlsUsrAllL());
		if(!MCCollectionUtil.contains(ret, getDptCstAllL())) ret.add(getDptCstAllL());
		if(!MCCollectionUtil.contains(ret, getItmGrpDwItmGrpAllL())) ret.add(getItmGrpDwItmGrpAllL());
		if(!MCCollectionUtil.contains(ret, getItmGrpItmAllL())) ret.add(getItmGrpItmAllL());
		if(!MCCollectionUtil.contains(ret, getItmGrpCstAllL())) ret.add(getItmGrpCstAllL());
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
		if(!MCCollectionUtil.contains(ret, getDtl1L())) ret.add(getDtl1L());
		if(!MCCollectionUtil.contains(ret, getDptDtl1L())) ret.add(getDptDtl1L());
		if(!MCCollectionUtil.contains(ret, getDptDtlL())) ret.add(getDptDtlL());
		if(!MCCollectionUtil.contains(ret, getDptDwDptL())) ret.add(getDptDwDptL());
		if(!MCCollectionUtil.contains(ret, getDptSlsUsrL())) ret.add(getDptSlsUsrL());
		if(!MCCollectionUtil.contains(ret, getDptCstL())) ret.add(getDptCstL());
		if(!MCCollectionUtil.contains(ret, getItmGrpHdrR())) ret.add(getItmGrpHdrR());
		if(!MCCollectionUtil.contains(ret, getItmGrpDtl1L())) ret.add(getItmGrpDtl1L());
		if(!MCCollectionUtil.contains(ret, getItmGrpDtlL())) ret.add(getItmGrpDtlL());
		if(!MCCollectionUtil.contains(ret, getItmGrpDwItmGrpL())) ret.add(getItmGrpDwItmGrpL());
		if(!MCCollectionUtil.contains(ret, getItmGrpItmL())) ret.add(getItmGrpItmL());
		if(!MCCollectionUtil.contains(ret, getItmGrpCstL())) ret.add(getItmGrpCstL());
		return ret;
	}

	/**
	 * コンテナに対応したブロックのIDを返します。
	 *
	 * 引数のコンテナに対応するブロックがない場合にはnullを返します。<br>
	 * 引数がnullの場合にはnullを返します。<br>
	 *
	 * @return ブロックID
	 */
	public String getBlockId(MCContainer aCnt){
		if(aCnt == null) return null;
		if(aCnt == getRsltL()) return "Rslt";
		if(aCnt == getDptRsltL()) return "DptRslt";
		if(aCnt == getItmGrpRsltL()) return "ItmGrpRslt";
		if(aCnt == getDptDwDptAllL()) return "DptDwDptAll";
		if(aCnt == getDptSlsUsrAllL()) return "DptSlsUsrAll";
		if(aCnt == getDptCstAllL()) return "DptCstAll";
		if(aCnt == getItmGrpDwItmGrpAllL()) return "ItmGrpDwItmGrpAll";
		if(aCnt == getItmGrpItmAllL()) return "ItmGrpItmAll";
		if(aCnt == getItmGrpCstAllL()) return "ItmGrpCstAll";
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getHdrR()) return "Hdr";
		if(aCnt == getDtl1L()) return "Dtl1";
		if(aCnt == getDptDtl1L()) return "DptDtl1";
		if(aCnt == getDptDtlL()) return "DptDtl";
		if(aCnt == getDptDwDptL()) return "DptDwDpt";
		if(aCnt == getDptSlsUsrL()) return "DptSlsUsr";
		if(aCnt == getDptCstL()) return "DptCst";
		if(aCnt == getItmGrpHdrR()) return "ItmGrpHdr";
		if(aCnt == getItmGrpDtl1L()) return "ItmGrpDtl1";
		if(aCnt == getItmGrpDtlL()) return "ItmGrpDtl";
		if(aCnt == getItmGrpDwItmGrpL()) return "ItmGrpDwItmGrp";
		if(aCnt == getItmGrpItmL()) return "ItmGrpItm";
		if(aCnt == getItmGrpCstL()) return "ItmGrpCst";
		return super.getBlockId(aCnt);
	}

	/**
	 * ブロックIDに対応したコンテナを返します。
	 *
	 * 引数のブロックIDに対応するブロックがない場合にはnullを返します。<br>
	 * 引数がnullの場合にはnullを返します。<br>
	 *
	 * @return コンテナ
	 */
	public MCContainer getContainer(String bId){
		if(bId == null) return null;
		if(bId.equals("Rslt")) return getRsltL();
		if(bId.equals("DptRslt")) return getDptRsltL();
		if(bId.equals("ItmGrpRslt")) return getItmGrpRsltL();
		if(bId.equals("DptDwDptAll")) return getDptDwDptAllL();
		if(bId.equals("DptSlsUsrAll")) return getDptSlsUsrAllL();
		if(bId.equals("DptCstAll")) return getDptCstAllL();
		if(bId.equals("ItmGrpDwItmGrpAll")) return getItmGrpDwItmGrpAllL();
		if(bId.equals("ItmGrpItmAll")) return getItmGrpItmAllL();
		if(bId.equals("ItmGrpCstAll")) return getItmGrpCstAllL();
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("Hdr")) return getHdrR();
		if(bId.equals("Dtl1")) return getDtl1L();
		if(bId.equals("DptDtl1")) return getDptDtl1L();
		if(bId.equals("DptDtl")) return getDptDtlL();
		if(bId.equals("DptDwDpt")) return getDptDwDptL();
		if(bId.equals("DptSlsUsr")) return getDptSlsUsrL();
		if(bId.equals("DptCst")) return getDptCstL();
		if(bId.equals("ItmGrpHdr")) return getItmGrpHdrR();
		if(bId.equals("ItmGrpDtl1")) return getItmGrpDtl1L();
		if(bId.equals("ItmGrpDtl")) return getItmGrpDtlL();
		if(bId.equals("ItmGrpDwItmGrp")) return getItmGrpDwItmGrpL();
		if(bId.equals("ItmGrpItm")) return getItmGrpItmL();
		if(bId.equals("ItmGrpCst")) return getItmGrpCstL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(MainTabPanel);
		ret.add(DptPanel);
		ret.add(CndPanel);
		ret.add(HdrPanel);
		ret.add(DptDtl1Panel);
		ret.add(DptDtlTabPanel);
		ret.add(DptDwDptPanel);
		ret.add(DptSlsUsrPanel);
		ret.add(DptCstPanel);
		ret.add(ItmGrpPanel);
		ret.add(ItmGrpCndPanel);
		ret.add(ItmGrpHdrPanel);
		ret.add(ItmGrpDtl1Panel);
		ret.add(ItmGrpDtlTabPanel);
		ret.add(ItmGrpDwItmGrpPanel);
		ret.add(ItmGrpItmPanel);
		ret.add(ItmGrpCstPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_SlsSumSrch_MC_A() {
		aRsltL = createRsltL();
		aDptRsltL = createDptRsltL();
		aItmGrpRsltL = createItmGrpRsltL();
		aDptDwDptAllL = createDptDwDptAllL();
		aDptSlsUsrAllL = createDptSlsUsrAllL();
		aDptCstAllL = createDptCstAllL();
		aItmGrpDwItmGrpAllL = createItmGrpDwItmGrpAllL();
		aItmGrpItmAllL = createItmGrpItmAllL();
		aItmGrpCstAllL = createItmGrpCstAllL();
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtl1L = createDtl1L();
		aDptDtl1L = createDptDtl1L();
		aDptDtlL = createDptDtlL();
		aDptDwDptL = createDptDwDptL();
		aDptSlsUsrL = createDptSlsUsrL();
		aDptCstL = createDptCstL();
		aItmGrpHdrR = createItmGrpHdrR();
		aItmGrpDtl1L = createItmGrpDtl1L();
		aItmGrpDtlL = createItmGrpDtlL();
		aItmGrpDwItmGrpL = createItmGrpDwItmGrpL();
		aItmGrpItmL = createItmGrpItmL();
		aItmGrpCstL = createItmGrpCstL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBBP_SlsSumSrch_MC_A(String name) {
		aRsltL = createRsltL();
		aDptRsltL = createDptRsltL();
		aItmGrpRsltL = createItmGrpRsltL();
		aDptDwDptAllL = createDptDwDptAllL();
		aDptSlsUsrAllL = createDptSlsUsrAllL();
		aDptCstAllL = createDptCstAllL();
		aItmGrpDwItmGrpAllL = createItmGrpDwItmGrpAllL();
		aItmGrpItmAllL = createItmGrpItmAllL();
		aItmGrpCstAllL = createItmGrpCstAllL();
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtl1L = createDtl1L();
		aDptDtl1L = createDptDtl1L();
		createDptDtl1Table();
		DptDtl1Table.setRowName(name);
		aDptDtlL = createDptDtlL();
		aDptDwDptL = createDptDwDptL();
		createDptDwDptTable();
		DptDwDptTable.setRowName(name);
		aDptSlsUsrL = createDptSlsUsrL();
		createDptSlsUsrTable();
		DptSlsUsrTable.setRowName(name);
		aDptCstL = createDptCstL();
		createDptCstTable();
		DptCstTable.setRowName(name);
		aItmGrpHdrR = createItmGrpHdrR();
		aItmGrpDtl1L = createItmGrpDtl1L();
		createItmGrpDtl1Table();
		ItmGrpDtl1Table.setRowName(name);
		aItmGrpDtlL = createItmGrpDtlL();
		aItmGrpDwItmGrpL = createItmGrpDwItmGrpL();
		createItmGrpDwItmGrpTable();
		ItmGrpDwItmGrpTable.setRowName(name);
		aItmGrpItmL = createItmGrpItmL();
		createItmGrpItmTable();
		ItmGrpItmTable.setRowName(name);
		aItmGrpCstL = createItmGrpCstL();
		createItmGrpCstTable();
		ItmGrpCstTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBBP_SlsSumSrch_MC.jbCreateMainTab((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbCreateDpt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbCreateCnd((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbCreateHdr((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbCreateDptDtl1((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbCreateDptDtlTab((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbCreateDptDwDpt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbCreateDptSlsUsr((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbCreateDptCst((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbCreateItmGrp((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbCreateItmGrpCnd((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbCreateItmGrpHdr((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbCreateItmGrpDtl1((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbCreateItmGrpDtlTab((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbCreateItmGrpDwItmGrp((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbCreateItmGrpItm((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbCreateItmGrpCst((MSBBP_SlsSumSrch)this);
	}

	/**
	 * [MainTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMainTab(MSBBP_SlsSumSrch p) {
	}

	/**
	 * [Dpt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDpt(MSBBP_SlsSumSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBBP_SlsSumSrch p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBBP_SlsSumSrch p) {
	}

	/**
	 * [DptDtl1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDptDtl1(MSBBP_SlsSumSrch p) {
	}

	/**
	 * [DptDtlTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDptDtlTab(MSBBP_SlsSumSrch p) {
	}

	/**
	 * [DptDwDpt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDptDwDpt(MSBBP_SlsSumSrch p) {
	}

	/**
	 * [DptSlsUsr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDptSlsUsr(MSBBP_SlsSumSrch p) {
	}

	/**
	 * [DptCst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDptCst(MSBBP_SlsSumSrch p) {
	}

	/**
	 * [ItmGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmGrp(MSBBP_SlsSumSrch p) {
	}

	/**
	 * [ItmGrpCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmGrpCnd(MSBBP_SlsSumSrch p) {
	}

	/**
	 * [ItmGrpHdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmGrpHdr(MSBBP_SlsSumSrch p) {
	}

	/**
	 * [ItmGrpDtl1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmGrpDtl1(MSBBP_SlsSumSrch p) {
	}

	/**
	 * [ItmGrpDtlTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmGrpDtlTab(MSBBP_SlsSumSrch p) {
	}

	/**
	 * [ItmGrpDwItmGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmGrpDwItmGrp(MSBBP_SlsSumSrch p) {
		p.ItmGrpDwItmGrp_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.$itm_p);
		p.ItmGrpDwItmGrp_itm_p_PPanel.setName("ItmGrpDwItmGrp.itm_p");
		p.columnItmGrpDwItmGrp_itm_cd = p.ItmGrpDwItmGrp_itm_p_PPanel.columnItm_itm_cd;
		p.columnItmGrpDwItmGrp_itm_cd.addAliasName("ItmGrpDwItmGrp.itm_cd", p);
		p.columnItmGrpDwItmGrp_itm_sub1 = p.ItmGrpDwItmGrp_itm_p_PPanel.columnItm_itm_sub1;
		p.columnItmGrpDwItmGrp_itm_sub1.addAliasName("ItmGrpDwItmGrp.itm_sub1", p);
		p.columnItmGrpDwItmGrp_itm_sub2 = p.ItmGrpDwItmGrp_itm_p_PPanel.columnItm_itm_sub2;
		p.columnItmGrpDwItmGrp_itm_sub2.addAliasName("ItmGrpDwItmGrp.itm_sub2", p);
		p.columnItmGrpDwItmGrp_itm_sub3 = p.ItmGrpDwItmGrp_itm_p_PPanel.columnItm_itm_sub3;
		p.columnItmGrpDwItmGrp_itm_sub3.addAliasName("ItmGrpDwItmGrp.itm_sub3", p);
		p.columnItmGrpDwItmGrp_itm_nm = p.ItmGrpDwItmGrp_itm_p_PPanel.columnItm_itm_nm;
		p.columnItmGrpDwItmGrp_itm_nm.addAliasName("ItmGrpDwItmGrp.itm_nm", p);
	}

	/**
	 * [ItmGrpItm]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmGrpItm(MSBBP_SlsSumSrch p) {
		p.ItmGrpItm_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.$itm_p);
		p.ItmGrpItm_itm_p_PPanel.setName("ItmGrpItm.itm_p");
		p.columnItmGrpItm_itm_cd = p.ItmGrpItm_itm_p_PPanel.columnItm_itm_cd;
		p.columnItmGrpItm_itm_cd.addAliasName("ItmGrpItm.itm_cd", p);
		p.columnItmGrpItm_itm_sub1 = p.ItmGrpItm_itm_p_PPanel.columnItm_itm_sub1;
		p.columnItmGrpItm_itm_sub1.addAliasName("ItmGrpItm.itm_sub1", p);
		p.columnItmGrpItm_itm_sub2 = p.ItmGrpItm_itm_p_PPanel.columnItm_itm_sub2;
		p.columnItmGrpItm_itm_sub2.addAliasName("ItmGrpItm.itm_sub2", p);
		p.columnItmGrpItm_itm_sub3 = p.ItmGrpItm_itm_p_PPanel.columnItm_itm_sub3;
		p.columnItmGrpItm_itm_sub3.addAliasName("ItmGrpItm.itm_sub3", p);
		p.columnItmGrpItm_itm_nm = p.ItmGrpItm_itm_p_PPanel.columnItm_itm_nm;
		p.columnItmGrpItm_itm_nm.addAliasName("ItmGrpItm.itm_nm", p);
	}

	/**
	 * [ItmGrpCst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItmGrpCst(MSBBP_SlsSumSrch p) {
	}

	/**
	 * この画面のステータスのSet集合を返します。
	 * 
	 * @return ステータスのSet
	 */
	@Override
	public Set<String> getStatusSet(){
		Set<String> sSet = super.getStatusSet();
		for(String aStr : statusArray) sSet.add(aStr);
		return sSet;
	}

	
	/** [Cnd_sls_bdg_grp_d_ListPutter]の定義 */
	private MCListPutter Cnd_sls_bdg_grp_d_p = null;

	/**
	 * [Cnd_sls_bdg_grp_d_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sls_bdg_grp_d_ListPutter() {
		if (Cnd_sls_bdg_grp_d_p == null) {
			Cnd_sls_bdg_grp_d_p = createCnd_sls_bdg_grp_d_ListPutter(Cnd_sls_bdg_grp_d, "sls_bdg_grp_d");

		}
		return Cnd_sls_bdg_grp_d_p;
	}
	
	
	/** [Cnd_xrate_cd_d_ListPutter]の定義 */
	private MCListPutter Cnd_xrate_cd_d_p = null;

	/**
	 * [Cnd_xrate_cd_d_ListPutter]の取得
	 */
	protected MCListPutter getCnd_xrate_cd_d_ListPutter() {
		if (Cnd_xrate_cd_d_p == null) {
			Cnd_xrate_cd_d_p = createCnd_xrate_cd_d_ListPutter(Cnd_xrate_cd_d, "xrate_cd_d", "xrate_nm_d");

		}
		return Cnd_xrate_cd_d_p;
	}
	
	
	/** [Cnd_dpt_lvl_cd_d_ListPutter]の定義 */
	private MCListPutter Cnd_dpt_lvl_cd_d_p = null;

	/**
	 * [Cnd_dpt_lvl_cd_d_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dpt_lvl_cd_d_ListPutter() {
		if (Cnd_dpt_lvl_cd_d_p == null) {
			Cnd_dpt_lvl_cd_d_p = createCnd_dpt_lvl_cd_d_ListPutter(Cnd_dpt_lvl_cd_d, "dpt_lvl_cd_d", "dpt_lvl_nm_d");

		}
		return Cnd_dpt_lvl_cd_d_p;
	}
	
	
	/** [Cnd_dpt_cd_d_ListPutter]の定義 */
	private MCListPutter Cnd_dpt_cd_d_p = null;

	/**
	 * [Cnd_dpt_cd_d_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dpt_cd_d_ListPutter() {
		if (Cnd_dpt_cd_d_p == null) {
			Cnd_dpt_cd_d_p = createCnd_dpt_cd_d_ListPutter(Cnd_dpt_cd_d, "dpt_cd_d", "dpt_nm_d");

		}
		return Cnd_dpt_cd_d_p;
	}
	
	
	/** [Cnd_sls_bdg_grp_ig_ListPutter]の定義 */
	private MCListPutter Cnd_sls_bdg_grp_ig_p = null;

	/**
	 * [Cnd_sls_bdg_grp_ig_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sls_bdg_grp_ig_ListPutter() {
		if (Cnd_sls_bdg_grp_ig_p == null) {
			Cnd_sls_bdg_grp_ig_p = createCnd_sls_bdg_grp_ig_ListPutter(Cnd_sls_bdg_grp_ig, "sls_bdg_grp_ig");

		}
		return Cnd_sls_bdg_grp_ig_p;
	}
	
	
	/** [Cnd_xrate_cd_ig_ListPutter]の定義 */
	private MCListPutter Cnd_xrate_cd_ig_p = null;

	/**
	 * [Cnd_xrate_cd_ig_ListPutter]の取得
	 */
	protected MCListPutter getCnd_xrate_cd_ig_ListPutter() {
		if (Cnd_xrate_cd_ig_p == null) {
			Cnd_xrate_cd_ig_p = createCnd_xrate_cd_ig_ListPutter(Cnd_xrate_cd_ig, "xrate_cd_ig", "xrate_nm_ig");

		}
		return Cnd_xrate_cd_ig_p;
	}
	
	
	/** [Cnd_sls_itm_grp_lvl_ListPutter]の定義 */
	private MCListPutter Cnd_sls_itm_grp_lvl_p = null;

	/**
	 * [Cnd_sls_itm_grp_lvl_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sls_itm_grp_lvl_ListPutter() {
		if (Cnd_sls_itm_grp_lvl_p == null) {
			Cnd_sls_itm_grp_lvl_p = createCnd_sls_itm_grp_lvl_ListPutter(Cnd_sls_itm_grp_lvl, "sls_itm_grp_lvl");

		}
		return Cnd_sls_itm_grp_lvl_p;
	}
	
	
	/** [Cnd_sls_itm_grp_cd_ig_ListPutter]の定義 */
	private MCListPutter Cnd_sls_itm_grp_cd_ig_p = null;

	/**
	 * [Cnd_sls_itm_grp_cd_ig_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sls_itm_grp_cd_ig_ListPutter() {
		if (Cnd_sls_itm_grp_cd_ig_p == null) {
			Cnd_sls_itm_grp_cd_ig_p = createCnd_sls_itm_grp_cd_ig_ListPutter(Cnd_sls_itm_grp_cd_ig, "sls_itm_grp_cd_ig", "sls_itm_grp_nm_ig");

		}
		return Cnd_sls_itm_grp_cd_ig_p;
	}
	
	
	/** [Hdr_big_num_rnd_typ_ListPutter]の定義 */
	private MCListPutter Hdr_big_num_rnd_typ_p = null;

	/**
	 * [Hdr_big_num_rnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_big_num_rnd_typ_ListPutter() {
		if (Hdr_big_num_rnd_typ_p == null) {
			Hdr_big_num_rnd_typ_p = createHdr_big_num_rnd_typ_ListPutter(Hdr_big_num_rnd_typ, "big_num_rnd_typ", "big_num_rnd_typ_nm");

		}
		return Hdr_big_num_rnd_typ_p;
	}
	
	
	/** [ItmGrpHdr_big_num_rnd_typ_ListPutter]の定義 */
	private MCListPutter ItmGrpHdr_big_num_rnd_typ_p = null;

	/**
	 * [ItmGrpHdr_big_num_rnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getItmGrpHdr_big_num_rnd_typ_ListPutter() {
		if (ItmGrpHdr_big_num_rnd_typ_p == null) {
			ItmGrpHdr_big_num_rnd_typ_p = createItmGrpHdr_big_num_rnd_typ_ListPutter(ItmGrpHdr_big_num_rnd_typ, "big_num_rnd_typ", "big_num_rnd_typ_nm");

		}
		return ItmGrpHdr_big_num_rnd_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_SlsSumSrch create(){
		MSBBP_SlsSumSrch p = new MSBBP_SlsSumSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBP_SlsSumSrch create(String name){
		MSBBP_SlsSumSrch p = new MSBBP_SlsSumSrch(name);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * 画面部品初期設定
	 */
	protected void jbInit() {
		super.jbInit();
		MSBBP_SlsSumSrch_MC.jbfInitMainTab((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbfInitDpt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbfInitCnd((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbfInitHdr((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbfInitDptDtl1((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbfInitDptDtlTab((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbfInitDptDwDpt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbfInitDptSlsUsr((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbfInitDptCst((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbfInitItmGrp((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbfInitItmGrpCnd((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbfInitItmGrpHdr((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbfInitItmGrpDtl1((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbfInitItmGrpDtlTab((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbfInitItmGrpDwItmGrp((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbfInitItmGrpItm((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbfInitItmGrpCst((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbInitMainTab((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbInitDpt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbInitCnd((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbInitHdr((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbInitDptDtl1((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbInitDptDtlTab((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbInitDptDwDpt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbInitDptSlsUsr((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbInitDptCst((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbInitItmGrp((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbInitItmGrpCnd((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbInitItmGrpHdr((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbInitItmGrpDtl1((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbInitItmGrpDtlTab((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbInitItmGrpDwItmGrp((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbInitItmGrpItm((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.jbInitItmGrpCst((MSBBP_SlsSumSrch)this);
	}

	/**
	 * [MainTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMainTab(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.MainTabPanel = p.beansFactory.createPanel("MainTab");
		p.MainTabTab = p.beansFactory.createTabbedPane("MainTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Dpt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDpt(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.DptPanel = p.beansFactory.createPanel("Dpt");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_inpt_ym_d_Label = p.beansFactory.createLabel("Cnd.inpt_ym_d_Label");
		p.Cnd_inpt_ym_d = p.beansFactory.createDateField("Cnd.inpt_ym_d");
		p.Cnd_inpt_ym_d.setLabel(p.Cnd_inpt_ym_d_Label);
		p.Cnd_sls_trnst_disp_d = p.beansFactory.createCheckBox("Cnd.sls_trnst_disp_d");
		p.Cnd_sls_disp_term_d_Label = p.beansFactory.createLabel("Cnd.sls_disp_term_d_Label");
		p.Cnd_sls_disp_term_d = p.beansFactory.createNumberField("Cnd.sls_disp_term_d");
		p.Cnd_sls_disp_term_d.setLabel(p.Cnd_sls_disp_term_d_Label);
		p.Cnd_sum_term_d_Label = p.beansFactory.createLabel("Cnd.sum_term_d_Label");
		p.Cnd_sum_term_d = p.beansFactory.createNumberField("Cnd.sum_term_d");
		p.Cnd_sum_term_d.setLabel(p.Cnd_sum_term_d_Label);
		p.Cnd_sls_bdg_grp_d_Label = p.beansFactory.createLabel("Cnd.sls_bdg_grp_d_Label");
		p.Cnd_sls_bdg_grp_d = p.beansFactory.createTextComboBox("Cnd.sls_bdg_grp_d");
		p.Cnd_sls_bdg_grp_d.setLabel(p.Cnd_sls_bdg_grp_d_Label);
		p.Cnd_xrate_cd_d_Label = p.beansFactory.createLabel("Cnd.xrate_cd_d_Label");
		p.Cnd_xrate_cd_d = p.beansFactory.createTextComboBox("Cnd.xrate_cd_d");
		p.Cnd_xrate_cd_d.setLabel(p.Cnd_xrate_cd_d_Label);
		p.Cnd_xrate_nm_d = p.beansFactory.createTextField("Cnd.xrate_nm_d");
		p.Cnd_use_act_xrate_flg_d = p.beansFactory.createCheckBox("Cnd.use_act_xrate_flg_d");
		p.Cnd_dpt_lvl_cd_d_Label = p.beansFactory.createLabel("Cnd.dpt_lvl_cd_d_Label");
		p.Cnd_dpt_lvl_cd_d = p.beansFactory.createTextComboBox("Cnd.dpt_lvl_cd_d");
		p.Cnd_dpt_lvl_cd_d.setLabel(p.Cnd_dpt_lvl_cd_d_Label);
		p.Cnd_dpt_lvl_nm_d = p.beansFactory.createTextField("Cnd.dpt_lvl_nm_d");
		p.Cnd_dpt_cd_d_Label = p.beansFactory.createLabel("Cnd.dpt_cd_d_Label");
		p.Cnd_dpt_cd_d = p.beansFactory.createTextComboBox("Cnd.dpt_cd_d");
		p.Cnd_dpt_cd_d.setLabel(p.Cnd_dpt_cd_d_Label);
		p.Cnd_dpt_nm_d = p.beansFactory.createTextField("Cnd.dpt_nm_d");
		p.Cnd_srch_d = p.beansFactory.createButton("Cnd.srch_d", "srch");
		p.Cnd_inpt_ym_ig_Label = p.beansFactory.createLabel("Cnd.inpt_ym_ig_Label");
		p.Cnd_inpt_ym_ig = p.beansFactory.createDateField("Cnd.inpt_ym_ig");
		p.Cnd_inpt_ym_ig.setLabel(p.Cnd_inpt_ym_ig_Label);
		p.Cnd_sls_trnst_disp_ig = p.beansFactory.createCheckBox("Cnd.sls_trnst_disp_ig");
		p.Cnd_sls_disp_term_ig_Label = p.beansFactory.createLabel("Cnd.sls_disp_term_ig_Label");
		p.Cnd_sls_disp_term_ig = p.beansFactory.createNumberField("Cnd.sls_disp_term_ig");
		p.Cnd_sls_disp_term_ig.setLabel(p.Cnd_sls_disp_term_ig_Label);
		p.Cnd_sum_term_ig_Label = p.beansFactory.createLabel("Cnd.sum_term_ig_Label");
		p.Cnd_sum_term_ig = p.beansFactory.createNumberField("Cnd.sum_term_ig");
		p.Cnd_sum_term_ig.setLabel(p.Cnd_sum_term_ig_Label);
		p.Cnd_sls_bdg_grp_ig_Label = p.beansFactory.createLabel("Cnd.sls_bdg_grp_ig_Label");
		p.Cnd_sls_bdg_grp_ig = p.beansFactory.createTextComboBox("Cnd.sls_bdg_grp_ig");
		p.Cnd_sls_bdg_grp_ig.setLabel(p.Cnd_sls_bdg_grp_ig_Label);
		p.Cnd_xrate_cd_ig_Label = p.beansFactory.createLabel("Cnd.xrate_cd_ig_Label");
		p.Cnd_xrate_cd_ig = p.beansFactory.createTextComboBox("Cnd.xrate_cd_ig");
		p.Cnd_xrate_cd_ig.setLabel(p.Cnd_xrate_cd_ig_Label);
		p.Cnd_xrate_nm_ig = p.beansFactory.createTextField("Cnd.xrate_nm_ig");
		p.Cnd_use_act_xrate_flg_ig = p.beansFactory.createCheckBox("Cnd.use_act_xrate_flg_ig");
		p.Cnd_sls_itm_grp_lvl_Label = p.beansFactory.createLabel("Cnd.sls_itm_grp_lvl_Label");
		p.Cnd_sls_itm_grp_lvl = p.beansFactory.createNumberComboBox("Cnd.sls_itm_grp_lvl");
		p.Cnd_sls_itm_grp_lvl.setLabel(p.Cnd_sls_itm_grp_lvl_Label);
		p.Cnd_sls_itm_grp_cd_ig_Label = p.beansFactory.createLabel("Cnd.sls_itm_grp_cd_ig_Label");
		p.Cnd_sls_itm_grp_cd_ig = p.beansFactory.createTextComboBox("Cnd.sls_itm_grp_cd_ig");
		p.Cnd_sls_itm_grp_cd_ig.setLabel(p.Cnd_sls_itm_grp_cd_ig_Label);
		p.Cnd_sls_itm_grp_nm_ig = p.beansFactory.createTextField("Cnd.sls_itm_grp_nm_ig");
		p.Cnd_srch_ig = p.beansFactory.createButton("Cnd.srch_ig", "srch");
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		p.HdrTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Hdr_base_cur_cd_Label = p.beansFactory.createLabel("Hdr.base_cur_cd_Label");
		p.Hdr_base_cur_cd = p.beansFactory.createTextField("Hdr.base_cur_cd");
		p.Hdr_base_cur_cd.setLabel(p.Hdr_base_cur_cd_Label);
		p.Hdr_base_cur_nm = p.beansFactory.createTextField("Hdr.base_cur_nm");
		p.Hdr_unit_Label = p.beansFactory.createLabel("Hdr.unit_Label");
		p.Hdr_unit = p.beansFactory.createTextField("Hdr.unit");
		p.Hdr_unit.setLabel(p.Hdr_unit_Label);
		p.Hdr_sls_flg = p.beansFactory.createCheckBox("Hdr.sls_flg");
		p.Hdr_slo_bl_flg = p.beansFactory.createCheckBox("Hdr.slo_bl_flg");
		p.Hdr_slo_flg = p.beansFactory.createCheckBox("Hdr.slo_flg");
		p.Hdr_spln_flg = p.beansFactory.createCheckBox("Hdr.spln_flg");
		p.Hdr_spln_per_cmpl_sls_flg = p.beansFactory.createCheckBox("Hdr.spln_per_cmpl_sls_flg");
		p.Hdr_bdg_flg = p.beansFactory.createCheckBox("Hdr.bdg_flg");
		p.Hdr_bdg_per_cmpl_sls_flg = p.beansFactory.createCheckBox("Hdr.bdg_per_cmpl_sls_flg");
		p.Hdr_prof_amt_flg = p.beansFactory.createCheckBox("Hdr.prof_amt_flg");
		p.Hdr_prof_rate_flg = p.beansFactory.createCheckBox("Hdr.prof_rate_flg");
		p.Hdr_big_num_rnd_typ_Label = p.beansFactory.createLabel("Hdr.big_num_rnd_typ_Label");
		p.Hdr_big_num_rnd_typ = p.beansFactory.createTextComboBox("Hdr.big_num_rnd_typ");
		p.Hdr_big_num_rnd_typ.setLabel(p.Hdr_big_num_rnd_typ_Label);
		p.Hdr_big_num_rnd_typ_nm = p.beansFactory.createTextField("Hdr.big_num_rnd_typ_nm");
	}

	/**
	 * [DptDtl1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDptDtl1(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.DptDtl1Panel = p.beansFactory.createPanel("DptDtl1");
		p.DptDtl1ScrollPane = p.beansFactory.createScrollPane("DptDtl1.scroll");
		p.createDptDtl1Table();
		// ブロックの項目の初期化
		p.columnDptDtl1_dpt_cd = p.beansFactory.createTableColumn("DptDtl1.dpt_cd", MCColumnType.TEXT);
		p.columnDptDtl1_dpt_nm = p.beansFactory.createTableColumn("DptDtl1.dpt_nm", MCColumnType.TEXT);
		p.columnDptDtl1_itm_grp_cd = p.beansFactory.createTableColumn("DptDtl1.itm_grp_cd", MCColumnType.TEXT);
		p.columnDptDtl1_itm_grp_nm = p.beansFactory.createTableColumn("DptDtl1.itm_grp_nm", MCColumnType.TEXT);
		p.columnDptDtl1_row_sort_col = p.beansFactory.createTableColumn("DptDtl1.row_sort_col", MCColumnType.NUMBER);
		p.columnDptDtl1_row_title_nm = p.beansFactory.createTableColumn("DptDtl1.row_title_nm", MCColumnType.TEXT);
		p.columnDptDtl1_slo = p.beansFactory.createTableColumn("DptDtl1.slo", MCColumnType.NUMBER);
		p.columnDptDtl1_slo_bl = p.beansFactory.createTableColumn("DptDtl1.slo_bl", MCColumnType.NUMBER);
		p.columnDptDtl1_sls = p.beansFactory.createTableColumn("DptDtl1.sls", MCColumnType.NUMBER);
		p.columnDptDtl1_sum = p.beansFactory.createTableColumn("DptDtl1.sum", MCColumnType.NUMBER);
		p.columnDptDtl1_spln = p.beansFactory.createTableColumn("DptDtl1.spln", MCColumnType.NUMBER);
		p.columnDptDtl1_spln_per_cmpl_slo = p.beansFactory.createTableColumn("DptDtl1.spln_per_cmpl_slo", MCColumnType.NUMBER);
		p.columnDptDtl1_spln_per_cmpl_sls = p.beansFactory.createTableColumn("DptDtl1.spln_per_cmpl_sls", MCColumnType.NUMBER);
		p.columnDptDtl1_bdg_sls = p.beansFactory.createTableColumn("DptDtl1.bdg_sls", MCColumnType.NUMBER);
		p.columnDptDtl1_bdg_per_cmpl_slo = p.beansFactory.createTableColumn("DptDtl1.bdg_per_cmpl_slo", MCColumnType.NUMBER);
		p.columnDptDtl1_bdg_per_cmpl_sls = p.beansFactory.createTableColumn("DptDtl1.bdg_per_cmpl_sls", MCColumnType.NUMBER);
		p.columnDptDtl1_col_00 = p.beansFactory.createTableColumn("DptDtl1.col_00", MCColumnType.NUMBER);
		p.columnDptDtl1_col_01 = p.beansFactory.createTableColumn("DptDtl1.col_01", MCColumnType.NUMBER);
		p.columnDptDtl1_col_02 = p.beansFactory.createTableColumn("DptDtl1.col_02", MCColumnType.NUMBER);
		p.columnDptDtl1_col_03 = p.beansFactory.createTableColumn("DptDtl1.col_03", MCColumnType.NUMBER);
		p.columnDptDtl1_col_04 = p.beansFactory.createTableColumn("DptDtl1.col_04", MCColumnType.NUMBER);
		p.columnDptDtl1_col_05 = p.beansFactory.createTableColumn("DptDtl1.col_05", MCColumnType.NUMBER);
		p.columnDptDtl1_col_06 = p.beansFactory.createTableColumn("DptDtl1.col_06", MCColumnType.NUMBER);
		p.columnDptDtl1_col_07 = p.beansFactory.createTableColumn("DptDtl1.col_07", MCColumnType.NUMBER);
		p.columnDptDtl1_col_08 = p.beansFactory.createTableColumn("DptDtl1.col_08", MCColumnType.NUMBER);
		p.columnDptDtl1_col_09 = p.beansFactory.createTableColumn("DptDtl1.col_09", MCColumnType.NUMBER);
		p.columnDptDtl1_col_10 = p.beansFactory.createTableColumn("DptDtl1.col_10", MCColumnType.NUMBER);
		p.columnDptDtl1_col_11 = p.beansFactory.createTableColumn("DptDtl1.col_11", MCColumnType.NUMBER);
		p.columnDptDtl1_col_12 = p.beansFactory.createTableColumn("DptDtl1.col_12", MCColumnType.NUMBER);
		p.columnDptDtl1_col_13 = p.beansFactory.createTableColumn("DptDtl1.col_13", MCColumnType.NUMBER);
		p.columnDptDtl1_col_14 = p.beansFactory.createTableColumn("DptDtl1.col_14", MCColumnType.NUMBER);
		p.columnDptDtl1_col_15 = p.beansFactory.createTableColumn("DptDtl1.col_15", MCColumnType.NUMBER);
		p.columnDptDtl1_col_16 = p.beansFactory.createTableColumn("DptDtl1.col_16", MCColumnType.NUMBER);
		p.columnDptDtl1_col_17 = p.beansFactory.createTableColumn("DptDtl1.col_17", MCColumnType.NUMBER);
		p.columnDptDtl1_dpt1_key = p.beansFactory.createTableColumn("DptDtl1.dpt1_key", MCColumnType.TEXT);
		p.columnDptDtl1_dpt_nm1_key = p.beansFactory.createTableColumn("DptDtl1.dpt_nm1_key", MCColumnType.TEXT);
	}

	/**
	 * [DptDtlTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDptDtlTab(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.DptDtlTabPanel = p.beansFactory.createPanel("DptDtlTab");
		p.DptDtlTabTab = p.beansFactory.createTabbedPane("DptDtlTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [DptDwDpt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDptDwDpt(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.DptDwDptPanel = p.beansFactory.createPanel("DptDwDpt");
		p.DptDwDptScrollPane = p.beansFactory.createScrollPane("DptDwDpt.scroll");
		p.createDptDwDptTable();
		// ブロックの項目の初期化
		p.columnDptDwDpt_dw_dpt_cd = p.beansFactory.createTableColumn("DptDwDpt.dw_dpt_cd", MCColumnType.TEXT);
		p.columnDptDwDpt_dw_dpt_nm = p.beansFactory.createTableColumn("DptDwDpt.dw_dpt_nm", MCColumnType.TEXT);
		p.columnDptDwDpt_row_sort_col = p.beansFactory.createTableColumn("DptDwDpt.row_sort_col", MCColumnType.NUMBER);
		p.columnDptDwDpt_row_title_nm = p.beansFactory.createTableColumn("DptDwDpt.row_title_nm", MCColumnType.TEXT);
		p.columnDptDwDpt_slo = p.beansFactory.createTableColumn("DptDwDpt.slo", MCColumnType.NUMBER);
		p.columnDptDwDpt_slo_bl = p.beansFactory.createTableColumn("DptDwDpt.slo_bl", MCColumnType.NUMBER);
		p.columnDptDwDpt_sls = p.beansFactory.createTableColumn("DptDwDpt.sls", MCColumnType.NUMBER);
		p.columnDptDwDpt_sum = p.beansFactory.createTableColumn("DptDwDpt.sum", MCColumnType.NUMBER);
		p.columnDptDwDpt_spln = p.beansFactory.createTableColumn("DptDwDpt.spln", MCColumnType.NUMBER);
		p.columnDptDwDpt_spln_per_cmpl_slo = p.beansFactory.createTableColumn("DptDwDpt.spln_per_cmpl_slo", MCColumnType.NUMBER);
		p.columnDptDwDpt_spln_per_cmpl_sls = p.beansFactory.createTableColumn("DptDwDpt.spln_per_cmpl_sls", MCColumnType.NUMBER);
		p.columnDptDwDpt_bdg_sls = p.beansFactory.createTableColumn("DptDwDpt.bdg_sls", MCColumnType.NUMBER);
		p.columnDptDwDpt_bdg_per_cmpl_slo = p.beansFactory.createTableColumn("DptDwDpt.bdg_per_cmpl_slo", MCColumnType.NUMBER);
		p.columnDptDwDpt_bdg_per_cmpl_sls = p.beansFactory.createTableColumn("DptDwDpt.bdg_per_cmpl_sls", MCColumnType.NUMBER);
		p.columnDptDwDpt_col_00 = p.beansFactory.createTableColumn("DptDwDpt.col_00", MCColumnType.NUMBER);
		p.columnDptDwDpt_col_01 = p.beansFactory.createTableColumn("DptDwDpt.col_01", MCColumnType.NUMBER);
		p.columnDptDwDpt_col_02 = p.beansFactory.createTableColumn("DptDwDpt.col_02", MCColumnType.NUMBER);
		p.columnDptDwDpt_col_03 = p.beansFactory.createTableColumn("DptDwDpt.col_03", MCColumnType.NUMBER);
		p.columnDptDwDpt_col_04 = p.beansFactory.createTableColumn("DptDwDpt.col_04", MCColumnType.NUMBER);
		p.columnDptDwDpt_col_05 = p.beansFactory.createTableColumn("DptDwDpt.col_05", MCColumnType.NUMBER);
		p.columnDptDwDpt_col_06 = p.beansFactory.createTableColumn("DptDwDpt.col_06", MCColumnType.NUMBER);
		p.columnDptDwDpt_col_07 = p.beansFactory.createTableColumn("DptDwDpt.col_07", MCColumnType.NUMBER);
		p.columnDptDwDpt_col_08 = p.beansFactory.createTableColumn("DptDwDpt.col_08", MCColumnType.NUMBER);
		p.columnDptDwDpt_col_09 = p.beansFactory.createTableColumn("DptDwDpt.col_09", MCColumnType.NUMBER);
		p.columnDptDwDpt_col_10 = p.beansFactory.createTableColumn("DptDwDpt.col_10", MCColumnType.NUMBER);
		p.columnDptDwDpt_col_11 = p.beansFactory.createTableColumn("DptDwDpt.col_11", MCColumnType.NUMBER);
		p.columnDptDwDpt_col_12 = p.beansFactory.createTableColumn("DptDwDpt.col_12", MCColumnType.NUMBER);
		p.columnDptDwDpt_col_13 = p.beansFactory.createTableColumn("DptDwDpt.col_13", MCColumnType.NUMBER);
		p.columnDptDwDpt_col_14 = p.beansFactory.createTableColumn("DptDwDpt.col_14", MCColumnType.NUMBER);
		p.columnDptDwDpt_col_15 = p.beansFactory.createTableColumn("DptDwDpt.col_15", MCColumnType.NUMBER);
		p.columnDptDwDpt_col_16 = p.beansFactory.createTableColumn("DptDwDpt.col_16", MCColumnType.NUMBER);
		p.columnDptDwDpt_col_17 = p.beansFactory.createTableColumn("DptDwDpt.col_17", MCColumnType.NUMBER);
		p.columnDptDwDpt_dpt_cd = p.beansFactory.createTableColumn("DptDwDpt.dpt_cd", MCColumnType.TEXT);
		p.columnDptDwDpt_dpt_nm = p.beansFactory.createTableColumn("DptDwDpt.dpt_nm", MCColumnType.TEXT);
		p.columnDptDwDpt_dpt2_key = p.beansFactory.createTableColumn("DptDwDpt.dpt2_key", MCColumnType.TEXT);
		p.columnDptDwDpt_dpt_nm2_key = p.beansFactory.createTableColumn("DptDwDpt.dpt_nm2_key", MCColumnType.TEXT);
	}

	/**
	 * [DptSlsUsr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDptSlsUsr(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.DptSlsUsrPanel = p.beansFactory.createPanel("DptSlsUsr");
		p.DptSlsUsrScrollPane = p.beansFactory.createScrollPane("DptSlsUsr.scroll");
		p.createDptSlsUsrTable();
		// ブロックの項目の初期化
		p.columnDptSlsUsr_sls_usr_cd = p.beansFactory.createTableColumn("DptSlsUsr.sls_usr_cd", MCColumnType.TEXT);
		p.columnDptSlsUsr_sls_usr_nm = p.beansFactory.createTableColumn("DptSlsUsr.sls_usr_nm", MCColumnType.TEXT);
		p.columnDptSlsUsr_row_sort_col = p.beansFactory.createTableColumn("DptSlsUsr.row_sort_col", MCColumnType.NUMBER);
		p.columnDptSlsUsr_row_title_nm = p.beansFactory.createTableColumn("DptSlsUsr.row_title_nm", MCColumnType.TEXT);
		p.columnDptSlsUsr_slo = p.beansFactory.createTableColumn("DptSlsUsr.slo", MCColumnType.NUMBER);
		p.columnDptSlsUsr_slo_bl = p.beansFactory.createTableColumn("DptSlsUsr.slo_bl", MCColumnType.NUMBER);
		p.columnDptSlsUsr_sls = p.beansFactory.createTableColumn("DptSlsUsr.sls", MCColumnType.NUMBER);
		p.columnDptSlsUsr_sum = p.beansFactory.createTableColumn("DptSlsUsr.sum", MCColumnType.NUMBER);
		p.columnDptSlsUsr_spln = p.beansFactory.createTableColumn("DptSlsUsr.spln", MCColumnType.NUMBER);
		p.columnDptSlsUsr_spln_per_cmpl_slo = p.beansFactory.createTableColumn("DptSlsUsr.spln_per_cmpl_slo", MCColumnType.NUMBER);
		p.columnDptSlsUsr_spln_per_cmpl_sls = p.beansFactory.createTableColumn("DptSlsUsr.spln_per_cmpl_sls", MCColumnType.NUMBER);
		p.columnDptSlsUsr_bdg_sls = p.beansFactory.createTableColumn("DptSlsUsr.bdg_sls", MCColumnType.NUMBER);
		p.columnDptSlsUsr_bdg_per_cmpl_slo = p.beansFactory.createTableColumn("DptSlsUsr.bdg_per_cmpl_slo", MCColumnType.NUMBER);
		p.columnDptSlsUsr_bdg_per_cmpl_sls = p.beansFactory.createTableColumn("DptSlsUsr.bdg_per_cmpl_sls", MCColumnType.NUMBER);
		p.columnDptSlsUsr_col_00 = p.beansFactory.createTableColumn("DptSlsUsr.col_00", MCColumnType.NUMBER);
		p.columnDptSlsUsr_col_01 = p.beansFactory.createTableColumn("DptSlsUsr.col_01", MCColumnType.NUMBER);
		p.columnDptSlsUsr_col_02 = p.beansFactory.createTableColumn("DptSlsUsr.col_02", MCColumnType.NUMBER);
		p.columnDptSlsUsr_col_03 = p.beansFactory.createTableColumn("DptSlsUsr.col_03", MCColumnType.NUMBER);
		p.columnDptSlsUsr_col_04 = p.beansFactory.createTableColumn("DptSlsUsr.col_04", MCColumnType.NUMBER);
		p.columnDptSlsUsr_col_05 = p.beansFactory.createTableColumn("DptSlsUsr.col_05", MCColumnType.NUMBER);
		p.columnDptSlsUsr_col_06 = p.beansFactory.createTableColumn("DptSlsUsr.col_06", MCColumnType.NUMBER);
		p.columnDptSlsUsr_col_07 = p.beansFactory.createTableColumn("DptSlsUsr.col_07", MCColumnType.NUMBER);
		p.columnDptSlsUsr_col_08 = p.beansFactory.createTableColumn("DptSlsUsr.col_08", MCColumnType.NUMBER);
		p.columnDptSlsUsr_col_09 = p.beansFactory.createTableColumn("DptSlsUsr.col_09", MCColumnType.NUMBER);
		p.columnDptSlsUsr_col_10 = p.beansFactory.createTableColumn("DptSlsUsr.col_10", MCColumnType.NUMBER);
		p.columnDptSlsUsr_col_11 = p.beansFactory.createTableColumn("DptSlsUsr.col_11", MCColumnType.NUMBER);
		p.columnDptSlsUsr_col_12 = p.beansFactory.createTableColumn("DptSlsUsr.col_12", MCColumnType.NUMBER);
		p.columnDptSlsUsr_col_13 = p.beansFactory.createTableColumn("DptSlsUsr.col_13", MCColumnType.NUMBER);
		p.columnDptSlsUsr_col_14 = p.beansFactory.createTableColumn("DptSlsUsr.col_14", MCColumnType.NUMBER);
		p.columnDptSlsUsr_col_15 = p.beansFactory.createTableColumn("DptSlsUsr.col_15", MCColumnType.NUMBER);
		p.columnDptSlsUsr_col_16 = p.beansFactory.createTableColumn("DptSlsUsr.col_16", MCColumnType.NUMBER);
		p.columnDptSlsUsr_col_17 = p.beansFactory.createTableColumn("DptSlsUsr.col_17", MCColumnType.NUMBER);
		p.columnDptSlsUsr_dpt_cd = p.beansFactory.createTableColumn("DptSlsUsr.dpt_cd", MCColumnType.TEXT);
		p.columnDptSlsUsr_dpt_nm = p.beansFactory.createTableColumn("DptSlsUsr.dpt_nm", MCColumnType.TEXT);
		p.columnDptSlsUsr_sls_usr_cd_key = p.beansFactory.createTableColumn("DptSlsUsr.sls_usr_cd_key", MCColumnType.TEXT);
	}

	/**
	 * [DptCst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDptCst(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.DptCstPanel = p.beansFactory.createPanel("DptCst");
		p.DptCstScrollPane = p.beansFactory.createScrollPane("DptCst.scroll");
		p.createDptCstTable();
		// ブロックの項目の初期化
		p.columnDptCst_cst_cd = p.beansFactory.createTableColumn("DptCst.cst_cd", MCColumnType.TEXT);
		p.columnDptCst_cst_nm = p.beansFactory.createTableColumn("DptCst.cst_nm", MCColumnType.TEXT);
		p.columnDptCst_row_sort_col = p.beansFactory.createTableColumn("DptCst.row_sort_col", MCColumnType.NUMBER);
		p.columnDptCst_row_title_nm = p.beansFactory.createTableColumn("DptCst.row_title_nm", MCColumnType.TEXT);
		p.columnDptCst_slo = p.beansFactory.createTableColumn("DptCst.slo", MCColumnType.NUMBER);
		p.columnDptCst_slo_bl = p.beansFactory.createTableColumn("DptCst.slo_bl", MCColumnType.NUMBER);
		p.columnDptCst_sls = p.beansFactory.createTableColumn("DptCst.sls", MCColumnType.NUMBER);
		p.columnDptCst_sum = p.beansFactory.createTableColumn("DptCst.sum", MCColumnType.NUMBER);
		p.columnDptCst_spln = p.beansFactory.createTableColumn("DptCst.spln", MCColumnType.NUMBER);
		p.columnDptCst_spln_per_cmpl_slo = p.beansFactory.createTableColumn("DptCst.spln_per_cmpl_slo", MCColumnType.NUMBER);
		p.columnDptCst_spln_per_cmpl_sls = p.beansFactory.createTableColumn("DptCst.spln_per_cmpl_sls", MCColumnType.NUMBER);
		p.columnDptCst_bdg_sls = p.beansFactory.createTableColumn("DptCst.bdg_sls", MCColumnType.NUMBER);
		p.columnDptCst_bdg_per_cmpl_slo = p.beansFactory.createTableColumn("DptCst.bdg_per_cmpl_slo", MCColumnType.NUMBER);
		p.columnDptCst_bdg_per_cmpl_sls = p.beansFactory.createTableColumn("DptCst.bdg_per_cmpl_sls", MCColumnType.NUMBER);
		p.columnDptCst_col_00 = p.beansFactory.createTableColumn("DptCst.col_00", MCColumnType.NUMBER);
		p.columnDptCst_col_01 = p.beansFactory.createTableColumn("DptCst.col_01", MCColumnType.NUMBER);
		p.columnDptCst_col_02 = p.beansFactory.createTableColumn("DptCst.col_02", MCColumnType.NUMBER);
		p.columnDptCst_col_03 = p.beansFactory.createTableColumn("DptCst.col_03", MCColumnType.NUMBER);
		p.columnDptCst_col_04 = p.beansFactory.createTableColumn("DptCst.col_04", MCColumnType.NUMBER);
		p.columnDptCst_col_05 = p.beansFactory.createTableColumn("DptCst.col_05", MCColumnType.NUMBER);
		p.columnDptCst_col_06 = p.beansFactory.createTableColumn("DptCst.col_06", MCColumnType.NUMBER);
		p.columnDptCst_col_07 = p.beansFactory.createTableColumn("DptCst.col_07", MCColumnType.NUMBER);
		p.columnDptCst_col_08 = p.beansFactory.createTableColumn("DptCst.col_08", MCColumnType.NUMBER);
		p.columnDptCst_col_09 = p.beansFactory.createTableColumn("DptCst.col_09", MCColumnType.NUMBER);
		p.columnDptCst_col_10 = p.beansFactory.createTableColumn("DptCst.col_10", MCColumnType.NUMBER);
		p.columnDptCst_col_11 = p.beansFactory.createTableColumn("DptCst.col_11", MCColumnType.NUMBER);
		p.columnDptCst_col_12 = p.beansFactory.createTableColumn("DptCst.col_12", MCColumnType.NUMBER);
		p.columnDptCst_col_13 = p.beansFactory.createTableColumn("DptCst.col_13", MCColumnType.NUMBER);
		p.columnDptCst_col_14 = p.beansFactory.createTableColumn("DptCst.col_14", MCColumnType.NUMBER);
		p.columnDptCst_col_15 = p.beansFactory.createTableColumn("DptCst.col_15", MCColumnType.NUMBER);
		p.columnDptCst_col_16 = p.beansFactory.createTableColumn("DptCst.col_16", MCColumnType.NUMBER);
		p.columnDptCst_col_17 = p.beansFactory.createTableColumn("DptCst.col_17", MCColumnType.NUMBER);
		p.columnDptCst_dpt_cd = p.beansFactory.createTableColumn("DptCst.dpt_cd", MCColumnType.TEXT);
		p.columnDptCst_dpt_nm = p.beansFactory.createTableColumn("DptCst.dpt_nm", MCColumnType.TEXT);
		p.columnDptCst_cst_cd_key = p.beansFactory.createTableColumn("DptCst.cst_cd_key", MCColumnType.TEXT);
	}

	/**
	 * [ItmGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmGrp(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.ItmGrpPanel = p.beansFactory.createPanel("ItmGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmGrpCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmGrpCnd(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.ItmGrpCndPanel = p.beansFactory.createPanel("ItmGrpCnd");
		p.ItmGrpCndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [ItmGrpHdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmGrpHdr(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.ItmGrpHdrPanel = p.beansFactory.createPanel("ItmGrpHdr");
		p.ItmGrpHdrTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.ItmGrpHdr_base_cur_cd_Label = p.beansFactory.createLabel("ItmGrpHdr.base_cur_cd_Label");
		p.ItmGrpHdr_base_cur_cd = p.beansFactory.createTextField("ItmGrpHdr.base_cur_cd");
		p.ItmGrpHdr_base_cur_cd.setLabel(p.ItmGrpHdr_base_cur_cd_Label);
		p.ItmGrpHdr_base_cur_nm = p.beansFactory.createTextField("ItmGrpHdr.base_cur_nm");
		p.ItmGrpHdr_unit_Label = p.beansFactory.createLabel("ItmGrpHdr.unit_Label");
		p.ItmGrpHdr_unit = p.beansFactory.createTextField("ItmGrpHdr.unit");
		p.ItmGrpHdr_unit.setLabel(p.ItmGrpHdr_unit_Label);
		p.ItmGrpHdr_sls_flg = p.beansFactory.createCheckBox("ItmGrpHdr.sls_flg");
		p.ItmGrpHdr_slo_bl_flg = p.beansFactory.createCheckBox("ItmGrpHdr.slo_bl_flg");
		p.ItmGrpHdr_slo_flg = p.beansFactory.createCheckBox("ItmGrpHdr.slo_flg");
		p.ItmGrpHdr_spln_flg = p.beansFactory.createCheckBox("ItmGrpHdr.spln_flg");
		p.ItmGrpHdr_spln_per_cmpl_sls_flg = p.beansFactory.createCheckBox("ItmGrpHdr.spln_per_cmpl_sls_flg");
		p.ItmGrpHdr_bdg_flg = p.beansFactory.createCheckBox("ItmGrpHdr.bdg_flg");
		p.ItmGrpHdr_bdg_per_cmpl_sls_flg = p.beansFactory.createCheckBox("ItmGrpHdr.bdg_per_cmpl_sls_flg");
		p.ItmGrpHdr_prof_amt_flg = p.beansFactory.createCheckBox("ItmGrpHdr.prof_amt_flg");
		p.ItmGrpHdr_prof_rate_flg = p.beansFactory.createCheckBox("ItmGrpHdr.prof_rate_flg");
		p.ItmGrpHdr_big_num_rnd_typ_Label = p.beansFactory.createLabel("ItmGrpHdr.big_num_rnd_typ_Label");
		p.ItmGrpHdr_big_num_rnd_typ = p.beansFactory.createTextComboBox("ItmGrpHdr.big_num_rnd_typ");
		p.ItmGrpHdr_big_num_rnd_typ.setLabel(p.ItmGrpHdr_big_num_rnd_typ_Label);
		p.ItmGrpHdr_big_num_rnd_typ_nm = p.beansFactory.createTextField("ItmGrpHdr.big_num_rnd_typ_nm");
	}

	/**
	 * [ItmGrpDtl1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmGrpDtl1(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.ItmGrpDtl1Panel = p.beansFactory.createPanel("ItmGrpDtl1");
		p.ItmGrpDtl1ScrollPane = p.beansFactory.createScrollPane("ItmGrpDtl1.scroll");
		p.createItmGrpDtl1Table();
		// ブロックの項目の初期化
		p.columnItmGrpDtl1_itm_grp_cd = p.beansFactory.createTableColumn("ItmGrpDtl1.itm_grp_cd", MCColumnType.TEXT);
		p.columnItmGrpDtl1_itm_grp_nm = p.beansFactory.createTableColumn("ItmGrpDtl1.itm_grp_nm", MCColumnType.TEXT);
		p.columnItmGrpDtl1_row_sort_col = p.beansFactory.createTableColumn("ItmGrpDtl1.row_sort_col", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_row_title_nm = p.beansFactory.createTableColumn("ItmGrpDtl1.row_title_nm", MCColumnType.TEXT);
		p.columnItmGrpDtl1_slo = p.beansFactory.createTableColumn("ItmGrpDtl1.slo", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_slo_bl = p.beansFactory.createTableColumn("ItmGrpDtl1.slo_bl", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_sls = p.beansFactory.createTableColumn("ItmGrpDtl1.sls", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_sum = p.beansFactory.createTableColumn("ItmGrpDtl1.sum", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_spln = p.beansFactory.createTableColumn("ItmGrpDtl1.spln", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_spln_per_cmpl_slo = p.beansFactory.createTableColumn("ItmGrpDtl1.spln_per_cmpl_slo", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_spln_per_cmpl_sls = p.beansFactory.createTableColumn("ItmGrpDtl1.spln_per_cmpl_sls", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_bdg_sls = p.beansFactory.createTableColumn("ItmGrpDtl1.bdg_sls", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_bdg_per_cmpl_slo = p.beansFactory.createTableColumn("ItmGrpDtl1.bdg_per_cmpl_slo", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_bdg_per_cmpl_sls = p.beansFactory.createTableColumn("ItmGrpDtl1.bdg_per_cmpl_sls", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_col_00 = p.beansFactory.createTableColumn("ItmGrpDtl1.col_00", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_col_01 = p.beansFactory.createTableColumn("ItmGrpDtl1.col_01", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_col_02 = p.beansFactory.createTableColumn("ItmGrpDtl1.col_02", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_col_03 = p.beansFactory.createTableColumn("ItmGrpDtl1.col_03", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_col_04 = p.beansFactory.createTableColumn("ItmGrpDtl1.col_04", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_col_05 = p.beansFactory.createTableColumn("ItmGrpDtl1.col_05", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_col_06 = p.beansFactory.createTableColumn("ItmGrpDtl1.col_06", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_col_07 = p.beansFactory.createTableColumn("ItmGrpDtl1.col_07", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_col_08 = p.beansFactory.createTableColumn("ItmGrpDtl1.col_08", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_col_09 = p.beansFactory.createTableColumn("ItmGrpDtl1.col_09", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_col_10 = p.beansFactory.createTableColumn("ItmGrpDtl1.col_10", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_col_11 = p.beansFactory.createTableColumn("ItmGrpDtl1.col_11", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_col_12 = p.beansFactory.createTableColumn("ItmGrpDtl1.col_12", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_col_13 = p.beansFactory.createTableColumn("ItmGrpDtl1.col_13", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_col_14 = p.beansFactory.createTableColumn("ItmGrpDtl1.col_14", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_col_15 = p.beansFactory.createTableColumn("ItmGrpDtl1.col_15", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_col_16 = p.beansFactory.createTableColumn("ItmGrpDtl1.col_16", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_col_17 = p.beansFactory.createTableColumn("ItmGrpDtl1.col_17", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_amt_dec_place = p.beansFactory.createTableColumn("ItmGrpDtl1.amt_dec_place", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_rate_dec_place = p.beansFactory.createTableColumn("ItmGrpDtl1.rate_dec_place", MCColumnType.NUMBER);
		p.columnItmGrpDtl1_itm_grp1_key = p.beansFactory.createTableColumn("ItmGrpDtl1.itm_grp1_key", MCColumnType.TEXT);
		p.columnItmGrpDtl1_itm_grp_nm1_key = p.beansFactory.createTableColumn("ItmGrpDtl1.itm_grp_nm1_key", MCColumnType.TEXT);
	}

	/**
	 * [ItmGrpDtlTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmGrpDtlTab(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.ItmGrpDtlTabPanel = p.beansFactory.createPanel("ItmGrpDtlTab");
		p.ItmGrpDtlTabTab = p.beansFactory.createTabbedPane("ItmGrpDtlTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmGrpDwItmGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmGrpDwItmGrp(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.ItmGrpDwItmGrpPanel = p.beansFactory.createPanel("ItmGrpDwItmGrp");
		p.ItmGrpDwItmGrpScrollPane = p.beansFactory.createScrollPane("ItmGrpDwItmGrp.scroll");
		p.createItmGrpDwItmGrpTable();
		// ブロックの項目の初期化
		p.columnItmGrpDwItmGrp_dw_itm_grp_cd = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.dw_itm_grp_cd", MCColumnType.TEXT);
		p.columnItmGrpDwItmGrp_dw_itm_grp_nm = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.dw_itm_grp_nm", MCColumnType.TEXT);
		p.columnItmGrpDwItmGrp_row_sort_col = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.row_sort_col", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_row_title_nm = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.row_title_nm", MCColumnType.TEXT);
		p.columnItmGrpDwItmGrp_slo = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.slo", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_slo_bl = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.slo_bl", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_sls = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.sls", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_sum = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.sum", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_spln = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.spln", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_spln_per_cmpl_slo = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.spln_per_cmpl_slo", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_spln_per_cmpl_sls = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.spln_per_cmpl_sls", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_bdg_sls = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.bdg_sls", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_bdg_per_cmpl_slo = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.bdg_per_cmpl_slo", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_bdg_per_cmpl_sls = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.bdg_per_cmpl_sls", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_col_00 = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.col_00", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_col_01 = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.col_01", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_col_02 = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.col_02", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_col_03 = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.col_03", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_col_04 = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.col_04", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_col_05 = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.col_05", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_col_06 = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.col_06", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_col_07 = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.col_07", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_col_08 = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.col_08", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_col_09 = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.col_09", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_col_10 = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.col_10", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_col_11 = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.col_11", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_col_12 = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.col_12", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_col_13 = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.col_13", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_col_14 = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.col_14", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_col_15 = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.col_15", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_col_16 = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.col_16", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_col_17 = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.col_17", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_base_unit_dec_place = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_amt_dec_place = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.amt_dec_place", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_rate_dec_place = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.rate_dec_place", MCColumnType.NUMBER);
		p.columnItmGrpDwItmGrp_itm_grp_cd = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.itm_grp_cd", MCColumnType.TEXT);
		p.columnItmGrpDwItmGrp_itm_grp2_key = p.beansFactory.createTableColumn("ItmGrpDwItmGrp.itm_grp2_key", MCColumnType.TEXT);
	}

	/**
	 * [ItmGrpItm]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmGrpItm(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.ItmGrpItmPanel = p.beansFactory.createPanel("ItmGrpItm");
		p.ItmGrpItmScrollPane = p.beansFactory.createScrollPane("ItmGrpItm.scroll");
		p.createItmGrpItmTable();
		// ブロックの項目の初期化
		p.columnItmGrpItm_row_sort_col = p.beansFactory.createTableColumn("ItmGrpItm.row_sort_col", MCColumnType.NUMBER);
		p.columnItmGrpItm_row_title_nm = p.beansFactory.createTableColumn("ItmGrpItm.row_title_nm", MCColumnType.TEXT);
		p.columnItmGrpItm_slo = p.beansFactory.createTableColumn("ItmGrpItm.slo", MCColumnType.NUMBER);
		p.columnItmGrpItm_slo_bl = p.beansFactory.createTableColumn("ItmGrpItm.slo_bl", MCColumnType.NUMBER);
		p.columnItmGrpItm_sls = p.beansFactory.createTableColumn("ItmGrpItm.sls", MCColumnType.NUMBER);
		p.columnItmGrpItm_sum = p.beansFactory.createTableColumn("ItmGrpItm.sum", MCColumnType.NUMBER);
		p.columnItmGrpItm_spln = p.beansFactory.createTableColumn("ItmGrpItm.spln", MCColumnType.NUMBER);
		p.columnItmGrpItm_spln_per_cmpl_slo = p.beansFactory.createTableColumn("ItmGrpItm.spln_per_cmpl_slo", MCColumnType.NUMBER);
		p.columnItmGrpItm_spln_per_cmpl_sls = p.beansFactory.createTableColumn("ItmGrpItm.spln_per_cmpl_sls", MCColumnType.NUMBER);
		p.columnItmGrpItm_bdg_sls = p.beansFactory.createTableColumn("ItmGrpItm.bdg_sls", MCColumnType.NUMBER);
		p.columnItmGrpItm_bdg_per_cmpl_slo = p.beansFactory.createTableColumn("ItmGrpItm.bdg_per_cmpl_slo", MCColumnType.NUMBER);
		p.columnItmGrpItm_bdg_per_cmpl_sls = p.beansFactory.createTableColumn("ItmGrpItm.bdg_per_cmpl_sls", MCColumnType.NUMBER);
		p.columnItmGrpItm_col_00 = p.beansFactory.createTableColumn("ItmGrpItm.col_00", MCColumnType.NUMBER);
		p.columnItmGrpItm_col_01 = p.beansFactory.createTableColumn("ItmGrpItm.col_01", MCColumnType.NUMBER);
		p.columnItmGrpItm_col_02 = p.beansFactory.createTableColumn("ItmGrpItm.col_02", MCColumnType.NUMBER);
		p.columnItmGrpItm_col_03 = p.beansFactory.createTableColumn("ItmGrpItm.col_03", MCColumnType.NUMBER);
		p.columnItmGrpItm_col_04 = p.beansFactory.createTableColumn("ItmGrpItm.col_04", MCColumnType.NUMBER);
		p.columnItmGrpItm_col_05 = p.beansFactory.createTableColumn("ItmGrpItm.col_05", MCColumnType.NUMBER);
		p.columnItmGrpItm_col_06 = p.beansFactory.createTableColumn("ItmGrpItm.col_06", MCColumnType.NUMBER);
		p.columnItmGrpItm_col_07 = p.beansFactory.createTableColumn("ItmGrpItm.col_07", MCColumnType.NUMBER);
		p.columnItmGrpItm_col_08 = p.beansFactory.createTableColumn("ItmGrpItm.col_08", MCColumnType.NUMBER);
		p.columnItmGrpItm_col_09 = p.beansFactory.createTableColumn("ItmGrpItm.col_09", MCColumnType.NUMBER);
		p.columnItmGrpItm_col_10 = p.beansFactory.createTableColumn("ItmGrpItm.col_10", MCColumnType.NUMBER);
		p.columnItmGrpItm_col_11 = p.beansFactory.createTableColumn("ItmGrpItm.col_11", MCColumnType.NUMBER);
		p.columnItmGrpItm_col_12 = p.beansFactory.createTableColumn("ItmGrpItm.col_12", MCColumnType.NUMBER);
		p.columnItmGrpItm_col_13 = p.beansFactory.createTableColumn("ItmGrpItm.col_13", MCColumnType.NUMBER);
		p.columnItmGrpItm_col_14 = p.beansFactory.createTableColumn("ItmGrpItm.col_14", MCColumnType.NUMBER);
		p.columnItmGrpItm_col_15 = p.beansFactory.createTableColumn("ItmGrpItm.col_15", MCColumnType.NUMBER);
		p.columnItmGrpItm_col_16 = p.beansFactory.createTableColumn("ItmGrpItm.col_16", MCColumnType.NUMBER);
		p.columnItmGrpItm_col_17 = p.beansFactory.createTableColumn("ItmGrpItm.col_17", MCColumnType.NUMBER);
		p.columnItmGrpItm_base_unit_dec_place = p.beansFactory.createTableColumn("ItmGrpItm.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnItmGrpItm_amt_dec_place = p.beansFactory.createTableColumn("ItmGrpItm.amt_dec_place", MCColumnType.NUMBER);
		p.columnItmGrpItm_rate_dec_place = p.beansFactory.createTableColumn("ItmGrpItm.rate_dec_place", MCColumnType.NUMBER);
		p.columnItmGrpItm_itm_grp_cd = p.beansFactory.createTableColumn("ItmGrpItm.itm_grp_cd", MCColumnType.TEXT);
		p.columnItmGrpItm_itm_cd_key = p.beansFactory.createTableColumn("ItmGrpItm.itm_cd_key", MCColumnType.TEXT);
		p.columnItmGrpItm_itm_sub1_key = p.beansFactory.createTableColumn("ItmGrpItm.itm_sub1_key", MCColumnType.TEXT);
		p.columnItmGrpItm_itm_sub2_key = p.beansFactory.createTableColumn("ItmGrpItm.itm_sub2_key", MCColumnType.TEXT);
		p.columnItmGrpItm_itm_sub3_key = p.beansFactory.createTableColumn("ItmGrpItm.itm_sub3_key", MCColumnType.TEXT);
	}

	/**
	 * [ItmGrpCst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItmGrpCst(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.ItmGrpCstPanel = p.beansFactory.createPanel("ItmGrpCst");
		p.ItmGrpCstScrollPane = p.beansFactory.createScrollPane("ItmGrpCst.scroll");
		p.createItmGrpCstTable();
		// ブロックの項目の初期化
		p.columnItmGrpCst_cst_cd = p.beansFactory.createTableColumn("ItmGrpCst.cst_cd", MCColumnType.TEXT);
		p.columnItmGrpCst_cst_nm = p.beansFactory.createTableColumn("ItmGrpCst.cst_nm", MCColumnType.TEXT);
		p.columnItmGrpCst_row_sort_col = p.beansFactory.createTableColumn("ItmGrpCst.row_sort_col", MCColumnType.NUMBER);
		p.columnItmGrpCst_row_title_nm = p.beansFactory.createTableColumn("ItmGrpCst.row_title_nm", MCColumnType.TEXT);
		p.columnItmGrpCst_slo = p.beansFactory.createTableColumn("ItmGrpCst.slo", MCColumnType.NUMBER);
		p.columnItmGrpCst_slo_bl = p.beansFactory.createTableColumn("ItmGrpCst.slo_bl", MCColumnType.NUMBER);
		p.columnItmGrpCst_sls = p.beansFactory.createTableColumn("ItmGrpCst.sls", MCColumnType.NUMBER);
		p.columnItmGrpCst_sum = p.beansFactory.createTableColumn("ItmGrpCst.sum", MCColumnType.NUMBER);
		p.columnItmGrpCst_spln = p.beansFactory.createTableColumn("ItmGrpCst.spln", MCColumnType.NUMBER);
		p.columnItmGrpCst_spln_per_cmpl_slo = p.beansFactory.createTableColumn("ItmGrpCst.spln_per_cmpl_slo", MCColumnType.NUMBER);
		p.columnItmGrpCst_spln_per_cmpl_sls = p.beansFactory.createTableColumn("ItmGrpCst.spln_per_cmpl_sls", MCColumnType.NUMBER);
		p.columnItmGrpCst_bdg_sls = p.beansFactory.createTableColumn("ItmGrpCst.bdg_sls", MCColumnType.NUMBER);
		p.columnItmGrpCst_bdg_per_cmpl_slo = p.beansFactory.createTableColumn("ItmGrpCst.bdg_per_cmpl_slo", MCColumnType.NUMBER);
		p.columnItmGrpCst_bdg_per_cmpl_sls = p.beansFactory.createTableColumn("ItmGrpCst.bdg_per_cmpl_sls", MCColumnType.NUMBER);
		p.columnItmGrpCst_col_00 = p.beansFactory.createTableColumn("ItmGrpCst.col_00", MCColumnType.NUMBER);
		p.columnItmGrpCst_col_01 = p.beansFactory.createTableColumn("ItmGrpCst.col_01", MCColumnType.NUMBER);
		p.columnItmGrpCst_col_02 = p.beansFactory.createTableColumn("ItmGrpCst.col_02", MCColumnType.NUMBER);
		p.columnItmGrpCst_col_03 = p.beansFactory.createTableColumn("ItmGrpCst.col_03", MCColumnType.NUMBER);
		p.columnItmGrpCst_col_04 = p.beansFactory.createTableColumn("ItmGrpCst.col_04", MCColumnType.NUMBER);
		p.columnItmGrpCst_col_05 = p.beansFactory.createTableColumn("ItmGrpCst.col_05", MCColumnType.NUMBER);
		p.columnItmGrpCst_col_06 = p.beansFactory.createTableColumn("ItmGrpCst.col_06", MCColumnType.NUMBER);
		p.columnItmGrpCst_col_07 = p.beansFactory.createTableColumn("ItmGrpCst.col_07", MCColumnType.NUMBER);
		p.columnItmGrpCst_col_08 = p.beansFactory.createTableColumn("ItmGrpCst.col_08", MCColumnType.NUMBER);
		p.columnItmGrpCst_col_09 = p.beansFactory.createTableColumn("ItmGrpCst.col_09", MCColumnType.NUMBER);
		p.columnItmGrpCst_col_10 = p.beansFactory.createTableColumn("ItmGrpCst.col_10", MCColumnType.NUMBER);
		p.columnItmGrpCst_col_11 = p.beansFactory.createTableColumn("ItmGrpCst.col_11", MCColumnType.NUMBER);
		p.columnItmGrpCst_col_12 = p.beansFactory.createTableColumn("ItmGrpCst.col_12", MCColumnType.NUMBER);
		p.columnItmGrpCst_col_13 = p.beansFactory.createTableColumn("ItmGrpCst.col_13", MCColumnType.NUMBER);
		p.columnItmGrpCst_col_14 = p.beansFactory.createTableColumn("ItmGrpCst.col_14", MCColumnType.NUMBER);
		p.columnItmGrpCst_col_15 = p.beansFactory.createTableColumn("ItmGrpCst.col_15", MCColumnType.NUMBER);
		p.columnItmGrpCst_col_16 = p.beansFactory.createTableColumn("ItmGrpCst.col_16", MCColumnType.NUMBER);
		p.columnItmGrpCst_col_17 = p.beansFactory.createTableColumn("ItmGrpCst.col_17", MCColumnType.NUMBER);
		p.columnItmGrpCst_base_unit_dec_place = p.beansFactory.createTableColumn("ItmGrpCst.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnItmGrpCst_amt_dec_place = p.beansFactory.createTableColumn("ItmGrpCst.amt_dec_place", MCColumnType.NUMBER);
		p.columnItmGrpCst_rate_dec_place = p.beansFactory.createTableColumn("ItmGrpCst.rate_dec_place", MCColumnType.NUMBER);
		p.columnItmGrpCst_itm_grp_cd = p.beansFactory.createTableColumn("ItmGrpCst.itm_grp_cd", MCColumnType.TEXT);
		p.columnItmGrpCst_cst_cd_key = p.beansFactory.createTableColumn("ItmGrpCst.cst_cd_key", MCColumnType.TEXT);
	}

	/**
	 * [MainTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMainTab(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.add(p.MainTabPanel);
		p.setLastBeans(p.MainTabPanel);
		p.MainTabPanel.add(p.MainTabTab);
		p.MainTabPanel.setLastBeans(p.MainTabTab);
		p.MainTabPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.MainTabTab.add(p.DptPanel, "MainTab.dpt");
		p.MainTabTab.setLastBeans(p.DptPanel);
		p.DptPanel.setNextBeans(p.ItmGrpPanel);
		p.MainTabTab.add(p.ItmGrpPanel, "MainTab.itmGrp");
	}

	/**
	 * [Dpt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDpt(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.DptPanel.setNextBeans(p.ItmGrpPanel);
		p.DptPanel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.DptPanel.add(p.CndPanel, null);
		p.DptPanel.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.HdrPanel);
		p.DptPanel.add(p.HdrPanel, null);
		p.HdrPanel.setNextBeans(p.DptDtl1Panel);
		p.DptPanel.add(p.DptDtl1Panel, null);
		p.DptDtl1Panel.setNextBeans(p.DptDtlTabPanel);
		p.DptPanel.add(p.DptDtlTabPanel, null);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_inpt_ym_d_Label);
		p.CndPanel.add(p.Cnd_inpt_ym_d);
		p.CndPanel.setLastBeans(p.Cnd_inpt_ym_d);
		p.Cnd_inpt_ym_d.setNextBeans(p.Cnd_sls_trnst_disp_d);
		p.Cnd_inpt_ym_d.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1400.CndR.inpt_ym_d_META);
		p.Cnd_inpt_ym_d.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_sls_trnst_disp_d);
		p.Cnd_sls_trnst_disp_d.setNextBeans(p.Cnd_sls_disp_term_d);
		p.Cnd_sls_trnst_disp_d.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1400.CndR.sls_trnst_disp_d_META);
		p.CndPanel.add(p.Cnd_sls_disp_term_d_Label);
		p.CndPanel.add(p.Cnd_sls_disp_term_d);
		p.Cnd_sls_disp_term_d.setNextBeans(p.Cnd_sum_term_d);
		p.Cnd_sls_disp_term_d.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1400.CndR.sls_disp_term_d_META);
		p.CndPanel.add(p.Cnd_sum_term_d_Label);
		p.CndPanel.add(p.Cnd_sum_term_d);
		p.Cnd_sum_term_d.setNextBeans(p.Cnd_sls_bdg_grp_d);
		p.Cnd_sum_term_d.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1400.CndR.sum_term_d_META);
		p.Cnd_sls_bdg_grp_d.setListType(MCListType.STRICT);
		p.CndPanel.add(p.Cnd_sls_bdg_grp_d_Label);
		p.CndPanel.add(p.Cnd_sls_bdg_grp_d);
		p.Cnd_sls_bdg_grp_d.setNextBeans(p.Cnd_xrate_cd_d);
		p.Cnd_sls_bdg_grp_d.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1400.CndR.sls_bdg_grp_d_META);
		p.Cnd_xrate_cd_d.setListType(MCListType.STRICT);
		p.Cnd_xrate_cd_d.setLinkBeans(p.Cnd_xrate_nm_d);
		p.CndPanel.add(p.Cnd_xrate_cd_d_Label);
		p.CndPanel.add(p.Cnd_xrate_cd_d);
		p.Cnd_xrate_cd_d.setNextBeans(p.Cnd_xrate_nm_d);
		p.Cnd_xrate_cd_d.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1400.CndR.xrate_cd_d_META);
		p.CndPanel.add(p.Cnd_xrate_nm_d);
		p.Cnd_xrate_nm_d.setNextBeans(p.Cnd_use_act_xrate_flg_d);
		p.Cnd_xrate_nm_d.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1400.CndR.xrate_nm_d_META);
		p.CndPanel.add(p.Cnd_use_act_xrate_flg_d);
		p.Cnd_use_act_xrate_flg_d.setNextBeans(p.Cnd_dpt_lvl_cd_d);
		p.Cnd_use_act_xrate_flg_d.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1400.CndR.use_act_xrate_flg_d_META);
		p.Cnd_dpt_lvl_cd_d.setListType(MCListType.STRICT);
		p.Cnd_dpt_lvl_cd_d.setLinkBeans(p.Cnd_dpt_lvl_nm_d);
		p.CndPanel.add(p.Cnd_dpt_lvl_cd_d_Label);
		p.CndPanel.add(p.Cnd_dpt_lvl_cd_d);
		p.Cnd_dpt_lvl_cd_d.setNextBeans(p.Cnd_dpt_lvl_nm_d);
		p.Cnd_dpt_lvl_cd_d.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1400.CndR.dpt_lvl_cd_d_META);
		p.CndPanel.add(p.Cnd_dpt_lvl_nm_d);
		p.Cnd_dpt_lvl_nm_d.setNextBeans(p.Cnd_dpt_cd_d);
		p.Cnd_dpt_lvl_nm_d.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1400.CndR.dpt_lvl_nm_d_META);
		p.Cnd_dpt_cd_d.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dpt_cd_d, true);
		p.Cnd_dpt_cd_d.setLinkBeans(p.Cnd_dpt_nm_d);
		p.CndPanel.add(p.Cnd_dpt_cd_d_Label);
		p.CndPanel.add(p.Cnd_dpt_cd_d);
		p.Cnd_dpt_cd_d.setNextBeans(p.Cnd_dpt_nm_d);
		p.Cnd_dpt_cd_d.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1400.CndR.dpt_cd_d_META);
		p.CndPanel.add(p.Cnd_dpt_nm_d);
		p.Cnd_dpt_nm_d.setNextBeans(p.Cnd_srch_d);
		p.Cnd_dpt_nm_d.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1400.CndR.dpt_nm_d_META);
		p.setPluralValueEnable(p.Cnd_dpt_nm_d, true);
		p.Cnd_srch_d.setIcon("SEARCH");
		p.Cnd_srch_d.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch_d);
		p.ItmGrpCndPanel.add(p.Cnd_inpt_ym_ig_Label);
		p.ItmGrpCndPanel.add(p.Cnd_inpt_ym_ig);
		p.ItmGrpCndPanel.setLastBeans(p.Cnd_inpt_ym_ig);
		p.Cnd_inpt_ym_ig.setNextBeans(p.Cnd_sls_trnst_disp_ig);
		p.Cnd_inpt_ym_ig.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1400.CndR.inpt_ym_ig_META);
		p.Cnd_inpt_ym_ig.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.ItmGrpCndPanel.add(p.Cnd_sls_trnst_disp_ig);
		p.Cnd_sls_trnst_disp_ig.setNextBeans(p.Cnd_sls_disp_term_ig);
		p.Cnd_sls_trnst_disp_ig.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1400.CndR.sls_trnst_disp_ig_META);
		p.ItmGrpCndPanel.add(p.Cnd_sls_disp_term_ig_Label);
		p.ItmGrpCndPanel.add(p.Cnd_sls_disp_term_ig);
		p.Cnd_sls_disp_term_ig.setNextBeans(p.Cnd_sum_term_ig);
		p.Cnd_sls_disp_term_ig.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1400.CndR.sls_disp_term_ig_META);
		p.ItmGrpCndPanel.add(p.Cnd_sum_term_ig_Label);
		p.ItmGrpCndPanel.add(p.Cnd_sum_term_ig);
		p.Cnd_sum_term_ig.setNextBeans(p.Cnd_sls_bdg_grp_ig);
		p.Cnd_sum_term_ig.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1400.CndR.sum_term_ig_META);
		p.Cnd_sls_bdg_grp_ig.setListType(MCListType.STRICT);
		p.ItmGrpCndPanel.add(p.Cnd_sls_bdg_grp_ig_Label);
		p.ItmGrpCndPanel.add(p.Cnd_sls_bdg_grp_ig);
		p.Cnd_sls_bdg_grp_ig.setNextBeans(p.Cnd_xrate_cd_ig);
		p.Cnd_sls_bdg_grp_ig.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1400.CndR.sls_bdg_grp_ig_META);
		p.Cnd_xrate_cd_ig.setListType(MCListType.STRICT);
		p.Cnd_xrate_cd_ig.setLinkBeans(p.Cnd_xrate_nm_ig);
		p.ItmGrpCndPanel.add(p.Cnd_xrate_cd_ig_Label);
		p.ItmGrpCndPanel.add(p.Cnd_xrate_cd_ig);
		p.Cnd_xrate_cd_ig.setNextBeans(p.Cnd_xrate_nm_ig);
		p.Cnd_xrate_cd_ig.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1400.CndR.xrate_cd_ig_META);
		p.ItmGrpCndPanel.add(p.Cnd_xrate_nm_ig);
		p.Cnd_xrate_nm_ig.setNextBeans(p.Cnd_use_act_xrate_flg_ig);
		p.Cnd_xrate_nm_ig.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1400.CndR.xrate_nm_ig_META);
		p.ItmGrpCndPanel.add(p.Cnd_use_act_xrate_flg_ig);
		p.Cnd_use_act_xrate_flg_ig.setNextBeans(p.Cnd_sls_itm_grp_lvl);
		p.Cnd_use_act_xrate_flg_ig.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1400.CndR.use_act_xrate_flg_ig_META);
		p.Cnd_sls_itm_grp_lvl.setListType(MCListType.STRICT);
		p.ItmGrpCndPanel.add(p.Cnd_sls_itm_grp_lvl_Label);
		p.ItmGrpCndPanel.add(p.Cnd_sls_itm_grp_lvl);
		p.Cnd_sls_itm_grp_lvl.setNextBeans(p.Cnd_sls_itm_grp_cd_ig);
		p.Cnd_sls_itm_grp_lvl.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1400.CndR.sls_itm_grp_lvl_META);
		p.Cnd_sls_itm_grp_cd_ig.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_itm_grp_cd_ig, true);
		p.Cnd_sls_itm_grp_cd_ig.setLinkBeans(p.Cnd_sls_itm_grp_nm_ig);
		p.ItmGrpCndPanel.add(p.Cnd_sls_itm_grp_cd_ig_Label);
		p.ItmGrpCndPanel.add(p.Cnd_sls_itm_grp_cd_ig);
		p.Cnd_sls_itm_grp_cd_ig.setNextBeans(p.Cnd_sls_itm_grp_nm_ig);
		p.Cnd_sls_itm_grp_cd_ig.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1400.CndR.sls_itm_grp_cd_ig_META);
		p.ItmGrpCndPanel.add(p.Cnd_sls_itm_grp_nm_ig);
		p.Cnd_sls_itm_grp_nm_ig.setNextBeans(p.Cnd_srch_ig);
		p.Cnd_sls_itm_grp_nm_ig.setRow(p.getCndR(), mcframe.clientMSBB.MSBBP1400.CndR.sls_itm_grp_nm_ig_META);
		p.setPluralValueEnable(p.Cnd_sls_itm_grp_nm_ig, true);
		p.Cnd_srch_ig.setIcon("SEARCH");
		p.Cnd_srch_ig.setFunctionKey(MCFunctionKey.F1);
		p.ItmGrpCndPanel.add(p.Cnd_srch_ig);
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.HdrPanel.setBorder(p.HdrTitledBorder);
		p.HdrPanel.setValueCheck(false);
		p.HdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_base_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_base_cur_cd);
		p.HdrPanel.setLastBeans(p.Hdr_base_cur_cd);
		p.Hdr_base_cur_cd.setNextBeans(p.Hdr_base_cur_nm);
		p.Hdr_base_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.base_cur_cd_META);
		p.HdrPanel.add(p.Hdr_base_cur_nm);
		p.Hdr_base_cur_nm.setNextBeans(p.Hdr_unit);
		p.Hdr_base_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.base_cur_nm_META);
		p.HdrPanel.add(p.Hdr_unit_Label);
		p.HdrPanel.add(p.Hdr_unit);
		p.Hdr_unit.setNextBeans(p.Hdr_sls_flg);
		p.Hdr_unit.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.unit_META);
		p.HdrPanel.add(p.Hdr_sls_flg);
		p.Hdr_sls_flg.setNextBeans(p.Hdr_slo_bl_flg);
		p.Hdr_sls_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.sls_flg_META);
		p.HdrPanel.add(p.Hdr_slo_bl_flg);
		p.Hdr_slo_bl_flg.setNextBeans(p.Hdr_slo_flg);
		p.Hdr_slo_bl_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.slo_bl_flg_META);
		p.HdrPanel.add(p.Hdr_slo_flg);
		p.Hdr_slo_flg.setNextBeans(p.Hdr_spln_flg);
		p.Hdr_slo_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.slo_flg_META);
		p.HdrPanel.add(p.Hdr_spln_flg);
		p.Hdr_spln_flg.setNextBeans(p.Hdr_spln_per_cmpl_sls_flg);
		p.Hdr_spln_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.spln_flg_META);
		p.HdrPanel.add(p.Hdr_spln_per_cmpl_sls_flg);
		p.Hdr_spln_per_cmpl_sls_flg.setNextBeans(p.Hdr_bdg_flg);
		p.Hdr_spln_per_cmpl_sls_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.spln_per_cmpl_sls_flg_META);
		p.HdrPanel.add(p.Hdr_bdg_flg);
		p.Hdr_bdg_flg.setNextBeans(p.Hdr_bdg_per_cmpl_sls_flg);
		p.Hdr_bdg_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.bdg_flg_META);
		p.HdrPanel.add(p.Hdr_bdg_per_cmpl_sls_flg);
		p.Hdr_bdg_per_cmpl_sls_flg.setNextBeans(p.Hdr_prof_amt_flg);
		p.Hdr_bdg_per_cmpl_sls_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.bdg_per_cmpl_sls_flg_META);
		p.HdrPanel.add(p.Hdr_prof_amt_flg);
		p.Hdr_prof_amt_flg.setNextBeans(p.Hdr_prof_rate_flg);
		p.Hdr_prof_amt_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.prof_amt_flg_META);
		p.HdrPanel.add(p.Hdr_prof_rate_flg);
		p.Hdr_prof_rate_flg.setNextBeans(p.Hdr_big_num_rnd_typ);
		p.Hdr_prof_rate_flg.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.prof_rate_flg_META);
		p.Hdr_big_num_rnd_typ.setListType(MCListType.STRICT);
		p.Hdr_big_num_rnd_typ.setLinkBeans(p.Hdr_big_num_rnd_typ_nm);
		p.HdrPanel.add(p.Hdr_big_num_rnd_typ_Label);
		p.HdrPanel.add(p.Hdr_big_num_rnd_typ);
		p.Hdr_big_num_rnd_typ.setNextBeans(p.Hdr_big_num_rnd_typ_nm);
		p.Hdr_big_num_rnd_typ.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.big_num_rnd_typ_META);
		p.HdrPanel.add(p.Hdr_big_num_rnd_typ_nm);
		p.Hdr_big_num_rnd_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.big_num_rnd_typ_nm_META);
	}

	/**
	 * [DptDtl1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDptDtl1(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.DptDtl1Panel.add(p.DptDtl1ScrollPane);
		p.DptDtl1Panel.setLastBeans(p.DptDtl1Table);
		p.DptDtl1ScrollPane.setViewportView(p.DptDtl1Table);
		p.DptDtl1Table.setList(p.getDptDtl1L());
		p.DptDtl1Table.setStatusColumnVisible(false);
		p.DptDtl1Panel.setLayoutPosition("CTC");
		// ブロックの項目の初期化
	}

	/**
	 * [DptDtlTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDptDtlTab(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.DptDtlTabPanel.add(p.DptDtlTabTab);
		p.DptDtlTabPanel.setLastBeans(p.DptDtlTabTab);
		p.DptDtlTabPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
		p.DptDtlTabTab.add(p.DptDwDptPanel, "DptDtlTab.dwDpt");
		p.DptDtlTabTab.setLastBeans(p.DptDwDptPanel);
		p.DptDwDptPanel.setNextBeans(p.DptSlsUsrPanel);
		p.DptDtlTabTab.add(p.DptSlsUsrPanel, "DptDtlTab.slsUsr");
		p.DptSlsUsrPanel.setNextBeans(p.DptCstPanel);
		p.DptDtlTabTab.add(p.DptCstPanel, "DptDtlTab.cst");
	}

	/**
	 * [DptDwDpt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDptDwDpt(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.DptDwDptPanel.setNextBeans(p.DptSlsUsrPanel);
		p.DptDwDptPanel.add(p.DptDwDptScrollPane);
		p.DptDwDptPanel.setLastBeans(p.DptDwDptTable);
		p.DptDwDptScrollPane.setViewportView(p.DptDwDptTable);
		p.DptDwDptTable.setList(p.getDptDwDptL());
		p.DptDwDptTable.setStatusColumnVisible(false);
		p.DptDwDptPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DptSlsUsr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDptSlsUsr(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.DptSlsUsrPanel.setNextBeans(p.DptCstPanel);
		p.DptSlsUsrPanel.add(p.DptSlsUsrScrollPane);
		p.DptSlsUsrPanel.setLastBeans(p.DptSlsUsrTable);
		p.DptSlsUsrScrollPane.setViewportView(p.DptSlsUsrTable);
		p.DptSlsUsrTable.setList(p.getDptSlsUsrL());
		p.DptSlsUsrTable.setStatusColumnVisible(false);
		p.DptSlsUsrPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DptCst]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDptCst(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.DptCstPanel.add(p.DptCstScrollPane);
		p.DptCstPanel.setLastBeans(p.DptCstTable);
		p.DptCstScrollPane.setViewportView(p.DptCstTable);
		p.DptCstTable.setList(p.getDptCstL());
		p.DptCstTable.setStatusColumnVisible(false);
		p.DptCstPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmGrp(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.ItmGrpPanel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.ItmGrpPanel.add(p.ItmGrpCndPanel, null);
		p.ItmGrpPanel.setLastBeans(p.ItmGrpCndPanel);
		p.ItmGrpCndPanel.setNextBeans(p.ItmGrpHdrPanel);
		p.ItmGrpPanel.add(p.ItmGrpHdrPanel, null);
		p.ItmGrpHdrPanel.setNextBeans(p.ItmGrpDtl1Panel);
		p.ItmGrpPanel.add(p.ItmGrpDtl1Panel, null);
		p.ItmGrpDtl1Panel.setNextBeans(p.ItmGrpDtlTabPanel);
		p.ItmGrpPanel.add(p.ItmGrpDtlTabPanel, null);
	}

	/**
	 * [ItmGrpCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmGrpCnd(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.ItmGrpCndPanel.setBorder(p.ItmGrpCndTitledBorder);
		p.ItmGrpCndPanel.setValueCheck(false);
		p.ItmGrpCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ItmGrpCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmGrpHdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmGrpHdr(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.ItmGrpHdrPanel.setBorder(p.ItmGrpHdrTitledBorder);
		p.ItmGrpHdrPanel.setValueCheck(false);
		p.ItmGrpHdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.ItmGrpHdrPanel.add(p.ItmGrpHdr_base_cur_cd_Label);
		p.ItmGrpHdrPanel.add(p.ItmGrpHdr_base_cur_cd);
		p.ItmGrpHdrPanel.setLastBeans(p.ItmGrpHdr_base_cur_cd);
		p.ItmGrpHdr_base_cur_cd.setNextBeans(p.ItmGrpHdr_base_cur_nm);
		p.ItmGrpHdr_base_cur_cd.setRow(p.getItmGrpHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.base_cur_cd_META);
		p.ItmGrpHdrPanel.add(p.ItmGrpHdr_base_cur_nm);
		p.ItmGrpHdr_base_cur_nm.setNextBeans(p.ItmGrpHdr_unit);
		p.ItmGrpHdr_base_cur_nm.setRow(p.getItmGrpHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.base_cur_nm_META);
		p.ItmGrpHdrPanel.add(p.ItmGrpHdr_unit_Label);
		p.ItmGrpHdrPanel.add(p.ItmGrpHdr_unit);
		p.ItmGrpHdr_unit.setNextBeans(p.ItmGrpHdr_sls_flg);
		p.ItmGrpHdr_unit.setRow(p.getItmGrpHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.unit_META);
		p.ItmGrpHdrPanel.add(p.ItmGrpHdr_sls_flg);
		p.ItmGrpHdr_sls_flg.setNextBeans(p.ItmGrpHdr_slo_bl_flg);
		p.ItmGrpHdr_sls_flg.setRow(p.getItmGrpHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.sls_flg_META);
		p.ItmGrpHdrPanel.add(p.ItmGrpHdr_slo_bl_flg);
		p.ItmGrpHdr_slo_bl_flg.setNextBeans(p.ItmGrpHdr_slo_flg);
		p.ItmGrpHdr_slo_bl_flg.setRow(p.getItmGrpHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.slo_bl_flg_META);
		p.ItmGrpHdrPanel.add(p.ItmGrpHdr_slo_flg);
		p.ItmGrpHdr_slo_flg.setNextBeans(p.ItmGrpHdr_spln_flg);
		p.ItmGrpHdr_slo_flg.setRow(p.getItmGrpHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.slo_flg_META);
		p.ItmGrpHdrPanel.add(p.ItmGrpHdr_spln_flg);
		p.ItmGrpHdr_spln_flg.setNextBeans(p.ItmGrpHdr_spln_per_cmpl_sls_flg);
		p.ItmGrpHdr_spln_flg.setRow(p.getItmGrpHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.spln_flg_META);
		p.ItmGrpHdrPanel.add(p.ItmGrpHdr_spln_per_cmpl_sls_flg);
		p.ItmGrpHdr_spln_per_cmpl_sls_flg.setNextBeans(p.ItmGrpHdr_bdg_flg);
		p.ItmGrpHdr_spln_per_cmpl_sls_flg.setRow(p.getItmGrpHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.spln_per_cmpl_sls_flg_META);
		p.ItmGrpHdrPanel.add(p.ItmGrpHdr_bdg_flg);
		p.ItmGrpHdr_bdg_flg.setNextBeans(p.ItmGrpHdr_bdg_per_cmpl_sls_flg);
		p.ItmGrpHdr_bdg_flg.setRow(p.getItmGrpHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.bdg_flg_META);
		p.ItmGrpHdrPanel.add(p.ItmGrpHdr_bdg_per_cmpl_sls_flg);
		p.ItmGrpHdr_bdg_per_cmpl_sls_flg.setNextBeans(p.ItmGrpHdr_prof_amt_flg);
		p.ItmGrpHdr_bdg_per_cmpl_sls_flg.setRow(p.getItmGrpHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.bdg_per_cmpl_sls_flg_META);
		p.ItmGrpHdrPanel.add(p.ItmGrpHdr_prof_amt_flg);
		p.ItmGrpHdr_prof_amt_flg.setNextBeans(p.ItmGrpHdr_prof_rate_flg);
		p.ItmGrpHdr_prof_amt_flg.setRow(p.getItmGrpHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.prof_amt_flg_META);
		p.ItmGrpHdrPanel.add(p.ItmGrpHdr_prof_rate_flg);
		p.ItmGrpHdr_prof_rate_flg.setNextBeans(p.ItmGrpHdr_big_num_rnd_typ);
		p.ItmGrpHdr_prof_rate_flg.setRow(p.getItmGrpHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.prof_rate_flg_META);
		p.ItmGrpHdr_big_num_rnd_typ.setListType(MCListType.STRICT);
		p.ItmGrpHdr_big_num_rnd_typ.setLinkBeans(p.ItmGrpHdr_big_num_rnd_typ_nm);
		p.ItmGrpHdrPanel.add(p.ItmGrpHdr_big_num_rnd_typ_Label);
		p.ItmGrpHdrPanel.add(p.ItmGrpHdr_big_num_rnd_typ);
		p.ItmGrpHdr_big_num_rnd_typ.setNextBeans(p.ItmGrpHdr_big_num_rnd_typ_nm);
		p.ItmGrpHdr_big_num_rnd_typ.setRow(p.getItmGrpHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.big_num_rnd_typ_META);
		p.ItmGrpHdrPanel.add(p.ItmGrpHdr_big_num_rnd_typ_nm);
		p.ItmGrpHdr_big_num_rnd_typ_nm.setRow(p.getItmGrpHdrR(), mcframe.clientMSBB.MSBBP1400.HdrR.big_num_rnd_typ_nm_META);
	}

	/**
	 * [ItmGrpDtl1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmGrpDtl1(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.ItmGrpDtl1Panel.add(p.ItmGrpDtl1ScrollPane);
		p.ItmGrpDtl1Panel.setLastBeans(p.ItmGrpDtl1Table);
		p.ItmGrpDtl1ScrollPane.setViewportView(p.ItmGrpDtl1Table);
		p.ItmGrpDtl1Table.setList(p.getItmGrpDtl1L());
		p.ItmGrpDtl1Table.setStatusColumnVisible(false);
		p.ItmGrpDtl1Panel.setLayoutPosition("CTC");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmGrpDtlTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmGrpDtlTab(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.ItmGrpDtlTabPanel.add(p.ItmGrpDtlTabTab);
		p.ItmGrpDtlTabPanel.setLastBeans(p.ItmGrpDtlTabTab);
		p.ItmGrpDtlTabPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
		p.ItmGrpDtlTabTab.add(p.ItmGrpDwItmGrpPanel, "ItmGrpDtlTab.dwItmGrp");
		p.ItmGrpDtlTabTab.setLastBeans(p.ItmGrpDwItmGrpPanel);
		p.ItmGrpDwItmGrpPanel.setNextBeans(p.ItmGrpItmPanel);
		p.ItmGrpDtlTabTab.add(p.ItmGrpItmPanel, "ItmGrpDtlTab.itm");
		p.ItmGrpItmPanel.setNextBeans(p.ItmGrpCstPanel);
		p.ItmGrpDtlTabTab.add(p.ItmGrpCstPanel, "ItmGrpDtlTab.cst");
	}

	/**
	 * [ItmGrpDwItmGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmGrpDwItmGrp(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.ItmGrpDwItmGrpPanel.setNextBeans(p.ItmGrpItmPanel);
		p.ItmGrpDwItmGrpPanel.add(p.ItmGrpDwItmGrpScrollPane);
		p.ItmGrpDwItmGrpPanel.setLastBeans(p.ItmGrpDwItmGrpTable);
		p.ItmGrpDwItmGrpScrollPane.setViewportView(p.ItmGrpDwItmGrpTable);
		p.ItmGrpDwItmGrpTable.setList(p.getItmGrpDwItmGrpL());
		p.ItmGrpDwItmGrpTable.setStatusColumnVisible(false);
		p.ItmGrpDwItmGrpPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmGrpItm]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmGrpItm(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.ItmGrpItmPanel.setNextBeans(p.ItmGrpCstPanel);
		p.ItmGrpItmPanel.add(p.ItmGrpItmScrollPane);
		p.ItmGrpItmPanel.setLastBeans(p.ItmGrpItmTable);
		p.ItmGrpItmScrollPane.setViewportView(p.ItmGrpItmTable);
		p.ItmGrpItmTable.setList(p.getItmGrpItmL());
		p.ItmGrpItmTable.setStatusColumnVisible(false);
		p.ItmGrpItmPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [ItmGrpCst]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItmGrpCst(MSBBP_SlsSumSrch p) {
		// ブロック関連の初期化
		p.ItmGrpCstPanel.add(p.ItmGrpCstScrollPane);
		p.ItmGrpCstPanel.setLastBeans(p.ItmGrpCstTable);
		p.ItmGrpCstScrollPane.setViewportView(p.ItmGrpCstTable);
		p.ItmGrpCstTable.setList(p.getItmGrpCstL());
		p.ItmGrpCstTable.setStatusColumnVisible(false);
		p.ItmGrpCstPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "G";
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSBBP_SlsSumSrch_MC.mcInitMainTab((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.mcInitDpt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.mcInitCnd((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.mcInitHdr((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.mcInitDptDtl1((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.mcInitDptDtlTab((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.mcInitDptDwDpt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.mcInitDptSlsUsr((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.mcInitDptCst((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.mcInitItmGrp((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.mcInitItmGrpCnd((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.mcInitItmGrpHdr((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.mcInitItmGrpDtl1((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.mcInitItmGrpDtlTab((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.mcInitItmGrpDwItmGrp((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.mcInitItmGrpItm((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.mcInitItmGrpCst((MSBBP_SlsSumSrch)this);

		// [DPT_SRCH]ステータスのモードの設定
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_MainTab((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_Rslt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_DptRslt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_ItmGrpRslt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_DptDwDptAll((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_DptSlsUsrAll((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_DptCstAll((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_ItmGrpDwItmGrpAll((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_ItmGrpItmAll((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_ItmGrpCstAll((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_Dpt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_Cnd((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_Hdr((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_Dtl1((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_DptDtl1((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_DptDtlTab((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_DptDtl((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_DptDwDpt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_DptSlsUsr((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_DptCst((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_ItmGrp((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_ItmGrpCnd((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_ItmGrpHdr((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_ItmGrpDtl1((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_ItmGrpDtlTab((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_ItmGrpDtl((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_ItmGrpDwItmGrp((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_ItmGrpItm((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__SRCH_ItmGrpCst((MSBBP_SlsSumSrch)this);

		// [DPT_REF]ステータスのモードの設定
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_MainTab((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_Rslt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_DptRslt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_ItmGrpRslt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_DptDwDptAll((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_DptSlsUsrAll((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_DptCstAll((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_ItmGrpDwItmGrpAll((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_ItmGrpItmAll((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_ItmGrpCstAll((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_Dpt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_Cnd((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_Hdr((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_Dtl1((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_DptDtl1((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_DptDtlTab((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_DptDtl((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_DptDwDpt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_DptSlsUsr((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_DptCst((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_ItmGrp((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_ItmGrpCnd((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_ItmGrpHdr((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_ItmGrpDtl1((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_ItmGrpDtlTab((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_ItmGrpDtl((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_ItmGrpDwItmGrp((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_ItmGrpItm((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitDPT__REF_ItmGrpCst((MSBBP_SlsSumSrch)this);

		// [ITM_GRP_SRCH]ステータスのモードの設定
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_MainTab((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_Rslt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_DptRslt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_ItmGrpRslt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_DptDwDptAll((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_DptSlsUsrAll((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_DptCstAll((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_ItmGrpDwItmGrpAll((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_ItmGrpItmAll((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_ItmGrpCstAll((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_Dpt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_Cnd((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_Hdr((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_Dtl1((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_DptDtl1((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_DptDtlTab((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_DptDtl((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_DptDwDpt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_DptSlsUsr((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_DptCst((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_ItmGrp((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_ItmGrpCnd((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_ItmGrpHdr((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_ItmGrpDtl1((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_ItmGrpDtlTab((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_ItmGrpDtl((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_ItmGrpDwItmGrp((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_ItmGrpItm((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__SRCH_ItmGrpCst((MSBBP_SlsSumSrch)this);

		// [ITM_GRP_REF]ステータスのモードの設定
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_MainTab((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_Rslt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_DptRslt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_ItmGrpRslt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_DptDwDptAll((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_DptSlsUsrAll((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_DptCstAll((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_ItmGrpDwItmGrpAll((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_ItmGrpItmAll((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_ItmGrpCstAll((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_Dpt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_Cnd((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_Hdr((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_Dtl1((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_DptDtl1((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_DptDtlTab((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_DptDtl((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_DptDwDpt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_DptSlsUsr((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_DptCst((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_ItmGrp((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_ItmGrpCnd((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_ItmGrpHdr((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_ItmGrpDtl1((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_ItmGrpDtlTab((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_ItmGrpDtl((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_ItmGrpDwItmGrp((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_ItmGrpItm((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.statusInitITM__GRP__REF_ItmGrpCst((MSBBP_SlsSumSrch)this);

	}

	/**
	 *  [MainTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMainTab(MSBBP_SlsSumSrch p) {
		p.MainTabTab.addAllListener(p);
	}

	/**
	 *  [Dpt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDpt(MSBBP_SlsSumSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBBP_SlsSumSrch p) {
		p.Cnd_inpt_ym_d.setListListener(p);
		p.Cnd_inpt_ym_d.addAllListener(p);
		p.Cnd_sls_trnst_disp_d.addAllListener(p);
		p.Cnd_sls_disp_term_d.setListListener(p);
		p.Cnd_sls_disp_term_d.addAllListener(p);
		p.Cnd_sum_term_d.setListListener(p);
		p.Cnd_sum_term_d.addAllListener(p);
		p.Cnd_sls_bdg_grp_d.setListListener(p);
		p.Cnd_sls_bdg_grp_d.addAllListener(p);
		p.Cnd_xrate_cd_d.setListListener(p);
		p.Cnd_xrate_cd_d.addAllListener(p);
		p.Cnd_xrate_nm_d.setListListener(p);
		p.Cnd_xrate_nm_d.addAllListener(p);
		p.Cnd_use_act_xrate_flg_d.addAllListener(p);
		p.Cnd_dpt_lvl_cd_d.setListListener(p);
		p.Cnd_dpt_lvl_cd_d.addAllListener(p);
		p.Cnd_dpt_lvl_nm_d.setListListener(p);
		p.Cnd_dpt_lvl_nm_d.addAllListener(p);
		p.Cnd_dpt_cd_d.setListListener(p);
		p.Cnd_dpt_cd_d.addAllListener(p);
		p.Cnd_dpt_nm_d.setListListener(p);
		p.Cnd_dpt_nm_d.addAllListener(p);
		p.Cnd_srch_d.addAllListener(p);
		p.Cnd_srch_d.setAPMethodName("doCnd_srch_d");
		p.Cnd_inpt_ym_ig.setListListener(p);
		p.Cnd_inpt_ym_ig.addAllListener(p);
		p.Cnd_sls_trnst_disp_ig.addAllListener(p);
		p.Cnd_sls_disp_term_ig.setListListener(p);
		p.Cnd_sls_disp_term_ig.addAllListener(p);
		p.Cnd_sum_term_ig.setListListener(p);
		p.Cnd_sum_term_ig.addAllListener(p);
		p.Cnd_sls_bdg_grp_ig.setListListener(p);
		p.Cnd_sls_bdg_grp_ig.addAllListener(p);
		p.Cnd_xrate_cd_ig.setListListener(p);
		p.Cnd_xrate_cd_ig.addAllListener(p);
		p.Cnd_xrate_nm_ig.setListListener(p);
		p.Cnd_xrate_nm_ig.addAllListener(p);
		p.Cnd_use_act_xrate_flg_ig.addAllListener(p);
		p.Cnd_sls_itm_grp_lvl.setListListener(p);
		p.Cnd_sls_itm_grp_lvl.addAllListener(p);
		p.Cnd_sls_itm_grp_cd_ig.setListListener(p);
		p.Cnd_sls_itm_grp_cd_ig.addAllListener(p);
		p.Cnd_sls_itm_grp_nm_ig.setListListener(p);
		p.Cnd_sls_itm_grp_nm_ig.addAllListener(p);
		p.Cnd_srch_ig.addAllListener(p);
		p.Cnd_srch_ig.setAPMethodName("doCnd_srch_ig");
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBBP_SlsSumSrch p) {
		p.Hdr_base_cur_cd.setListListener(p);
		p.Hdr_base_cur_cd.addAllListener(p);
		p.Hdr_base_cur_nm.setListListener(p);
		p.Hdr_base_cur_nm.addAllListener(p);
		p.Hdr_unit.setListListener(p);
		p.Hdr_unit.addAllListener(p);
		p.Hdr_sls_flg.addAllListener(p);
		p.Hdr_slo_bl_flg.addAllListener(p);
		p.Hdr_slo_flg.addAllListener(p);
		p.Hdr_spln_flg.addAllListener(p);
		p.Hdr_spln_per_cmpl_sls_flg.addAllListener(p);
		p.Hdr_bdg_flg.addAllListener(p);
		p.Hdr_bdg_per_cmpl_sls_flg.addAllListener(p);
		p.Hdr_prof_amt_flg.addAllListener(p);
		p.Hdr_prof_rate_flg.addAllListener(p);
		p.Hdr_big_num_rnd_typ.setListListener(p);
		p.Hdr_big_num_rnd_typ.addAllListener(p);
		p.Hdr_big_num_rnd_typ_nm.setListListener(p);
		p.Hdr_big_num_rnd_typ_nm.addAllListener(p);
	}

	/**
	 *  [DptDtl1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDptDtl1(MSBBP_SlsSumSrch p) {
		p.DptDtl1Table.addAllListener(p);
		p.columnDptDtl1_dpt_cd.addAllListener(p);
		p.columnDptDtl1_dpt_cd.setListListener(p);
		p.columnDptDtl1_dpt_nm.addAllListener(p);
		p.columnDptDtl1_dpt_nm.setListListener(p);
		p.columnDptDtl1_itm_grp_cd.addAllListener(p);
		p.columnDptDtl1_itm_grp_cd.setListListener(p);
		p.columnDptDtl1_itm_grp_nm.addAllListener(p);
		p.columnDptDtl1_itm_grp_nm.setListListener(p);
		p.columnDptDtl1_row_sort_col.addAllListener(p);
		p.columnDptDtl1_row_sort_col.setListListener(p);
		p.columnDptDtl1_row_title_nm.addAllListener(p);
		p.columnDptDtl1_row_title_nm.setListListener(p);
		p.columnDptDtl1_slo.addAllListener(p);
		p.columnDptDtl1_slo.setListListener(p);
		p.columnDptDtl1_slo_bl.addAllListener(p);
		p.columnDptDtl1_slo_bl.setListListener(p);
		p.columnDptDtl1_sls.addAllListener(p);
		p.columnDptDtl1_sls.setListListener(p);
		p.columnDptDtl1_sum.addAllListener(p);
		p.columnDptDtl1_sum.setListListener(p);
		p.columnDptDtl1_spln.addAllListener(p);
		p.columnDptDtl1_spln.setListListener(p);
		p.columnDptDtl1_spln_per_cmpl_slo.addAllListener(p);
		p.columnDptDtl1_spln_per_cmpl_slo.setListListener(p);
		p.columnDptDtl1_spln_per_cmpl_sls.addAllListener(p);
		p.columnDptDtl1_spln_per_cmpl_sls.setListListener(p);
		p.columnDptDtl1_bdg_sls.addAllListener(p);
		p.columnDptDtl1_bdg_sls.setListListener(p);
		p.columnDptDtl1_bdg_per_cmpl_slo.addAllListener(p);
		p.columnDptDtl1_bdg_per_cmpl_slo.setListListener(p);
		p.columnDptDtl1_bdg_per_cmpl_sls.addAllListener(p);
		p.columnDptDtl1_bdg_per_cmpl_sls.setListListener(p);
		p.columnDptDtl1_col_00.addAllListener(p);
		p.columnDptDtl1_col_00.setListListener(p);
		p.columnDptDtl1_col_01.addAllListener(p);
		p.columnDptDtl1_col_01.setListListener(p);
		p.columnDptDtl1_col_02.addAllListener(p);
		p.columnDptDtl1_col_02.setListListener(p);
		p.columnDptDtl1_col_03.addAllListener(p);
		p.columnDptDtl1_col_03.setListListener(p);
		p.columnDptDtl1_col_04.addAllListener(p);
		p.columnDptDtl1_col_04.setListListener(p);
		p.columnDptDtl1_col_05.addAllListener(p);
		p.columnDptDtl1_col_05.setListListener(p);
		p.columnDptDtl1_col_06.addAllListener(p);
		p.columnDptDtl1_col_06.setListListener(p);
		p.columnDptDtl1_col_07.addAllListener(p);
		p.columnDptDtl1_col_07.setListListener(p);
		p.columnDptDtl1_col_08.addAllListener(p);
		p.columnDptDtl1_col_08.setListListener(p);
		p.columnDptDtl1_col_09.addAllListener(p);
		p.columnDptDtl1_col_09.setListListener(p);
		p.columnDptDtl1_col_10.addAllListener(p);
		p.columnDptDtl1_col_10.setListListener(p);
		p.columnDptDtl1_col_11.addAllListener(p);
		p.columnDptDtl1_col_11.setListListener(p);
		p.columnDptDtl1_col_12.addAllListener(p);
		p.columnDptDtl1_col_12.setListListener(p);
		p.columnDptDtl1_col_13.addAllListener(p);
		p.columnDptDtl1_col_13.setListListener(p);
		p.columnDptDtl1_col_14.addAllListener(p);
		p.columnDptDtl1_col_14.setListListener(p);
		p.columnDptDtl1_col_15.addAllListener(p);
		p.columnDptDtl1_col_15.setListListener(p);
		p.columnDptDtl1_col_16.addAllListener(p);
		p.columnDptDtl1_col_16.setListListener(p);
		p.columnDptDtl1_col_17.addAllListener(p);
		p.columnDptDtl1_col_17.setListListener(p);
		p.columnDptDtl1_dpt1_key.addAllListener(p);
		p.columnDptDtl1_dpt1_key.setListListener(p);
		p.columnDptDtl1_dpt_nm1_key.addAllListener(p);
		p.columnDptDtl1_dpt_nm1_key.setListListener(p);
	}

	/**
	 *  [DptDtlTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDptDtlTab(MSBBP_SlsSumSrch p) {
		p.DptDtlTabTab.addAllListener(p);
	}

	/**
	 *  [DptDwDpt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDptDwDpt(MSBBP_SlsSumSrch p) {
		p.DptDwDptTable.addAllListener(p);
		p.columnDptDwDpt_dw_dpt_cd.addAllListener(p);
		p.columnDptDwDpt_dw_dpt_cd.setListListener(p);
		p.columnDptDwDpt_dw_dpt_nm.addAllListener(p);
		p.columnDptDwDpt_dw_dpt_nm.setListListener(p);
		p.columnDptDwDpt_row_sort_col.addAllListener(p);
		p.columnDptDwDpt_row_sort_col.setListListener(p);
		p.columnDptDwDpt_row_title_nm.addAllListener(p);
		p.columnDptDwDpt_row_title_nm.setListListener(p);
		p.columnDptDwDpt_slo.addAllListener(p);
		p.columnDptDwDpt_slo.setListListener(p);
		p.columnDptDwDpt_slo_bl.addAllListener(p);
		p.columnDptDwDpt_slo_bl.setListListener(p);
		p.columnDptDwDpt_sls.addAllListener(p);
		p.columnDptDwDpt_sls.setListListener(p);
		p.columnDptDwDpt_sum.addAllListener(p);
		p.columnDptDwDpt_sum.setListListener(p);
		p.columnDptDwDpt_spln.addAllListener(p);
		p.columnDptDwDpt_spln.setListListener(p);
		p.columnDptDwDpt_spln_per_cmpl_slo.addAllListener(p);
		p.columnDptDwDpt_spln_per_cmpl_slo.setListListener(p);
		p.columnDptDwDpt_spln_per_cmpl_sls.addAllListener(p);
		p.columnDptDwDpt_spln_per_cmpl_sls.setListListener(p);
		p.columnDptDwDpt_bdg_sls.addAllListener(p);
		p.columnDptDwDpt_bdg_sls.setListListener(p);
		p.columnDptDwDpt_bdg_per_cmpl_slo.addAllListener(p);
		p.columnDptDwDpt_bdg_per_cmpl_slo.setListListener(p);
		p.columnDptDwDpt_bdg_per_cmpl_sls.addAllListener(p);
		p.columnDptDwDpt_bdg_per_cmpl_sls.setListListener(p);
		p.columnDptDwDpt_col_00.addAllListener(p);
		p.columnDptDwDpt_col_00.setListListener(p);
		p.columnDptDwDpt_col_01.addAllListener(p);
		p.columnDptDwDpt_col_01.setListListener(p);
		p.columnDptDwDpt_col_02.addAllListener(p);
		p.columnDptDwDpt_col_02.setListListener(p);
		p.columnDptDwDpt_col_03.addAllListener(p);
		p.columnDptDwDpt_col_03.setListListener(p);
		p.columnDptDwDpt_col_04.addAllListener(p);
		p.columnDptDwDpt_col_04.setListListener(p);
		p.columnDptDwDpt_col_05.addAllListener(p);
		p.columnDptDwDpt_col_05.setListListener(p);
		p.columnDptDwDpt_col_06.addAllListener(p);
		p.columnDptDwDpt_col_06.setListListener(p);
		p.columnDptDwDpt_col_07.addAllListener(p);
		p.columnDptDwDpt_col_07.setListListener(p);
		p.columnDptDwDpt_col_08.addAllListener(p);
		p.columnDptDwDpt_col_08.setListListener(p);
		p.columnDptDwDpt_col_09.addAllListener(p);
		p.columnDptDwDpt_col_09.setListListener(p);
		p.columnDptDwDpt_col_10.addAllListener(p);
		p.columnDptDwDpt_col_10.setListListener(p);
		p.columnDptDwDpt_col_11.addAllListener(p);
		p.columnDptDwDpt_col_11.setListListener(p);
		p.columnDptDwDpt_col_12.addAllListener(p);
		p.columnDptDwDpt_col_12.setListListener(p);
		p.columnDptDwDpt_col_13.addAllListener(p);
		p.columnDptDwDpt_col_13.setListListener(p);
		p.columnDptDwDpt_col_14.addAllListener(p);
		p.columnDptDwDpt_col_14.setListListener(p);
		p.columnDptDwDpt_col_15.addAllListener(p);
		p.columnDptDwDpt_col_15.setListListener(p);
		p.columnDptDwDpt_col_16.addAllListener(p);
		p.columnDptDwDpt_col_16.setListListener(p);
		p.columnDptDwDpt_col_17.addAllListener(p);
		p.columnDptDwDpt_col_17.setListListener(p);
		p.columnDptDwDpt_dpt_cd.addAllListener(p);
		p.columnDptDwDpt_dpt_cd.setListListener(p);
		p.columnDptDwDpt_dpt_nm.addAllListener(p);
		p.columnDptDwDpt_dpt_nm.setListListener(p);
		p.columnDptDwDpt_dpt2_key.addAllListener(p);
		p.columnDptDwDpt_dpt2_key.setListListener(p);
		p.columnDptDwDpt_dpt_nm2_key.addAllListener(p);
		p.columnDptDwDpt_dpt_nm2_key.setListListener(p);
	}

	/**
	 *  [DptSlsUsr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDptSlsUsr(MSBBP_SlsSumSrch p) {
		p.DptSlsUsrTable.addAllListener(p);
		p.columnDptSlsUsr_sls_usr_cd.addAllListener(p);
		p.columnDptSlsUsr_sls_usr_cd.setListListener(p);
		p.columnDptSlsUsr_sls_usr_nm.addAllListener(p);
		p.columnDptSlsUsr_sls_usr_nm.setListListener(p);
		p.columnDptSlsUsr_row_sort_col.addAllListener(p);
		p.columnDptSlsUsr_row_sort_col.setListListener(p);
		p.columnDptSlsUsr_row_title_nm.addAllListener(p);
		p.columnDptSlsUsr_row_title_nm.setListListener(p);
		p.columnDptSlsUsr_slo.addAllListener(p);
		p.columnDptSlsUsr_slo.setListListener(p);
		p.columnDptSlsUsr_slo_bl.addAllListener(p);
		p.columnDptSlsUsr_slo_bl.setListListener(p);
		p.columnDptSlsUsr_sls.addAllListener(p);
		p.columnDptSlsUsr_sls.setListListener(p);
		p.columnDptSlsUsr_sum.addAllListener(p);
		p.columnDptSlsUsr_sum.setListListener(p);
		p.columnDptSlsUsr_spln.addAllListener(p);
		p.columnDptSlsUsr_spln.setListListener(p);
		p.columnDptSlsUsr_spln_per_cmpl_slo.addAllListener(p);
		p.columnDptSlsUsr_spln_per_cmpl_slo.setListListener(p);
		p.columnDptSlsUsr_spln_per_cmpl_sls.addAllListener(p);
		p.columnDptSlsUsr_spln_per_cmpl_sls.setListListener(p);
		p.columnDptSlsUsr_bdg_sls.addAllListener(p);
		p.columnDptSlsUsr_bdg_sls.setListListener(p);
		p.columnDptSlsUsr_bdg_per_cmpl_slo.addAllListener(p);
		p.columnDptSlsUsr_bdg_per_cmpl_slo.setListListener(p);
		p.columnDptSlsUsr_bdg_per_cmpl_sls.addAllListener(p);
		p.columnDptSlsUsr_bdg_per_cmpl_sls.setListListener(p);
		p.columnDptSlsUsr_col_00.addAllListener(p);
		p.columnDptSlsUsr_col_00.setListListener(p);
		p.columnDptSlsUsr_col_01.addAllListener(p);
		p.columnDptSlsUsr_col_01.setListListener(p);
		p.columnDptSlsUsr_col_02.addAllListener(p);
		p.columnDptSlsUsr_col_02.setListListener(p);
		p.columnDptSlsUsr_col_03.addAllListener(p);
		p.columnDptSlsUsr_col_03.setListListener(p);
		p.columnDptSlsUsr_col_04.addAllListener(p);
		p.columnDptSlsUsr_col_04.setListListener(p);
		p.columnDptSlsUsr_col_05.addAllListener(p);
		p.columnDptSlsUsr_col_05.setListListener(p);
		p.columnDptSlsUsr_col_06.addAllListener(p);
		p.columnDptSlsUsr_col_06.setListListener(p);
		p.columnDptSlsUsr_col_07.addAllListener(p);
		p.columnDptSlsUsr_col_07.setListListener(p);
		p.columnDptSlsUsr_col_08.addAllListener(p);
		p.columnDptSlsUsr_col_08.setListListener(p);
		p.columnDptSlsUsr_col_09.addAllListener(p);
		p.columnDptSlsUsr_col_09.setListListener(p);
		p.columnDptSlsUsr_col_10.addAllListener(p);
		p.columnDptSlsUsr_col_10.setListListener(p);
		p.columnDptSlsUsr_col_11.addAllListener(p);
		p.columnDptSlsUsr_col_11.setListListener(p);
		p.columnDptSlsUsr_col_12.addAllListener(p);
		p.columnDptSlsUsr_col_12.setListListener(p);
		p.columnDptSlsUsr_col_13.addAllListener(p);
		p.columnDptSlsUsr_col_13.setListListener(p);
		p.columnDptSlsUsr_col_14.addAllListener(p);
		p.columnDptSlsUsr_col_14.setListListener(p);
		p.columnDptSlsUsr_col_15.addAllListener(p);
		p.columnDptSlsUsr_col_15.setListListener(p);
		p.columnDptSlsUsr_col_16.addAllListener(p);
		p.columnDptSlsUsr_col_16.setListListener(p);
		p.columnDptSlsUsr_col_17.addAllListener(p);
		p.columnDptSlsUsr_col_17.setListListener(p);
		p.columnDptSlsUsr_dpt_cd.addAllListener(p);
		p.columnDptSlsUsr_dpt_cd.setListListener(p);
		p.columnDptSlsUsr_dpt_nm.addAllListener(p);
		p.columnDptSlsUsr_dpt_nm.setListListener(p);
		p.columnDptSlsUsr_sls_usr_cd_key.addAllListener(p);
		p.columnDptSlsUsr_sls_usr_cd_key.setListListener(p);
	}

	/**
	 *  [DptCst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDptCst(MSBBP_SlsSumSrch p) {
		p.DptCstTable.addAllListener(p);
		p.columnDptCst_cst_cd.addAllListener(p);
		p.columnDptCst_cst_cd.setListListener(p);
		p.columnDptCst_cst_nm.addAllListener(p);
		p.columnDptCst_cst_nm.setListListener(p);
		p.columnDptCst_row_sort_col.addAllListener(p);
		p.columnDptCst_row_sort_col.setListListener(p);
		p.columnDptCst_row_title_nm.addAllListener(p);
		p.columnDptCst_row_title_nm.setListListener(p);
		p.columnDptCst_slo.addAllListener(p);
		p.columnDptCst_slo.setListListener(p);
		p.columnDptCst_slo_bl.addAllListener(p);
		p.columnDptCst_slo_bl.setListListener(p);
		p.columnDptCst_sls.addAllListener(p);
		p.columnDptCst_sls.setListListener(p);
		p.columnDptCst_sum.addAllListener(p);
		p.columnDptCst_sum.setListListener(p);
		p.columnDptCst_spln.addAllListener(p);
		p.columnDptCst_spln.setListListener(p);
		p.columnDptCst_spln_per_cmpl_slo.addAllListener(p);
		p.columnDptCst_spln_per_cmpl_slo.setListListener(p);
		p.columnDptCst_spln_per_cmpl_sls.addAllListener(p);
		p.columnDptCst_spln_per_cmpl_sls.setListListener(p);
		p.columnDptCst_bdg_sls.addAllListener(p);
		p.columnDptCst_bdg_sls.setListListener(p);
		p.columnDptCst_bdg_per_cmpl_slo.addAllListener(p);
		p.columnDptCst_bdg_per_cmpl_slo.setListListener(p);
		p.columnDptCst_bdg_per_cmpl_sls.addAllListener(p);
		p.columnDptCst_bdg_per_cmpl_sls.setListListener(p);
		p.columnDptCst_col_00.addAllListener(p);
		p.columnDptCst_col_00.setListListener(p);
		p.columnDptCst_col_01.addAllListener(p);
		p.columnDptCst_col_01.setListListener(p);
		p.columnDptCst_col_02.addAllListener(p);
		p.columnDptCst_col_02.setListListener(p);
		p.columnDptCst_col_03.addAllListener(p);
		p.columnDptCst_col_03.setListListener(p);
		p.columnDptCst_col_04.addAllListener(p);
		p.columnDptCst_col_04.setListListener(p);
		p.columnDptCst_col_05.addAllListener(p);
		p.columnDptCst_col_05.setListListener(p);
		p.columnDptCst_col_06.addAllListener(p);
		p.columnDptCst_col_06.setListListener(p);
		p.columnDptCst_col_07.addAllListener(p);
		p.columnDptCst_col_07.setListListener(p);
		p.columnDptCst_col_08.addAllListener(p);
		p.columnDptCst_col_08.setListListener(p);
		p.columnDptCst_col_09.addAllListener(p);
		p.columnDptCst_col_09.setListListener(p);
		p.columnDptCst_col_10.addAllListener(p);
		p.columnDptCst_col_10.setListListener(p);
		p.columnDptCst_col_11.addAllListener(p);
		p.columnDptCst_col_11.setListListener(p);
		p.columnDptCst_col_12.addAllListener(p);
		p.columnDptCst_col_12.setListListener(p);
		p.columnDptCst_col_13.addAllListener(p);
		p.columnDptCst_col_13.setListListener(p);
		p.columnDptCst_col_14.addAllListener(p);
		p.columnDptCst_col_14.setListListener(p);
		p.columnDptCst_col_15.addAllListener(p);
		p.columnDptCst_col_15.setListListener(p);
		p.columnDptCst_col_16.addAllListener(p);
		p.columnDptCst_col_16.setListListener(p);
		p.columnDptCst_col_17.addAllListener(p);
		p.columnDptCst_col_17.setListListener(p);
		p.columnDptCst_dpt_cd.addAllListener(p);
		p.columnDptCst_dpt_cd.setListListener(p);
		p.columnDptCst_dpt_nm.addAllListener(p);
		p.columnDptCst_dpt_nm.setListListener(p);
		p.columnDptCst_cst_cd_key.addAllListener(p);
		p.columnDptCst_cst_cd_key.setListListener(p);
	}

	/**
	 *  [ItmGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmGrp(MSBBP_SlsSumSrch p) {
	}

	/**
	 *  [ItmGrpCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmGrpCnd(MSBBP_SlsSumSrch p) {
	}

	/**
	 *  [ItmGrpHdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmGrpHdr(MSBBP_SlsSumSrch p) {
		p.ItmGrpHdr_base_cur_cd.setListListener(p);
		p.ItmGrpHdr_base_cur_cd.addAllListener(p);
		p.ItmGrpHdr_base_cur_nm.setListListener(p);
		p.ItmGrpHdr_base_cur_nm.addAllListener(p);
		p.ItmGrpHdr_unit.setListListener(p);
		p.ItmGrpHdr_unit.addAllListener(p);
		p.ItmGrpHdr_sls_flg.addAllListener(p);
		p.ItmGrpHdr_slo_bl_flg.addAllListener(p);
		p.ItmGrpHdr_slo_flg.addAllListener(p);
		p.ItmGrpHdr_spln_flg.addAllListener(p);
		p.ItmGrpHdr_spln_per_cmpl_sls_flg.addAllListener(p);
		p.ItmGrpHdr_bdg_flg.addAllListener(p);
		p.ItmGrpHdr_bdg_per_cmpl_sls_flg.addAllListener(p);
		p.ItmGrpHdr_prof_amt_flg.addAllListener(p);
		p.ItmGrpHdr_prof_rate_flg.addAllListener(p);
		p.ItmGrpHdr_big_num_rnd_typ.setListListener(p);
		p.ItmGrpHdr_big_num_rnd_typ.addAllListener(p);
		p.ItmGrpHdr_big_num_rnd_typ_nm.setListListener(p);
		p.ItmGrpHdr_big_num_rnd_typ_nm.addAllListener(p);
	}

	/**
	 *  [ItmGrpDtl1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmGrpDtl1(MSBBP_SlsSumSrch p) {
		p.ItmGrpDtl1Table.addAllListener(p);
		p.columnItmGrpDtl1_itm_grp_cd.addAllListener(p);
		p.columnItmGrpDtl1_itm_grp_cd.setListListener(p);
		p.columnItmGrpDtl1_itm_grp_nm.addAllListener(p);
		p.columnItmGrpDtl1_itm_grp_nm.setListListener(p);
		p.columnItmGrpDtl1_row_sort_col.addAllListener(p);
		p.columnItmGrpDtl1_row_sort_col.setListListener(p);
		p.columnItmGrpDtl1_row_title_nm.addAllListener(p);
		p.columnItmGrpDtl1_row_title_nm.setListListener(p);
		p.columnItmGrpDtl1_slo.addAllListener(p);
		p.columnItmGrpDtl1_slo.setListListener(p);
		p.columnItmGrpDtl1_slo_bl.addAllListener(p);
		p.columnItmGrpDtl1_slo_bl.setListListener(p);
		p.columnItmGrpDtl1_sls.addAllListener(p);
		p.columnItmGrpDtl1_sls.setListListener(p);
		p.columnItmGrpDtl1_sum.addAllListener(p);
		p.columnItmGrpDtl1_sum.setListListener(p);
		p.columnItmGrpDtl1_spln.addAllListener(p);
		p.columnItmGrpDtl1_spln.setListListener(p);
		p.columnItmGrpDtl1_spln_per_cmpl_slo.addAllListener(p);
		p.columnItmGrpDtl1_spln_per_cmpl_slo.setListListener(p);
		p.columnItmGrpDtl1_spln_per_cmpl_sls.addAllListener(p);
		p.columnItmGrpDtl1_spln_per_cmpl_sls.setListListener(p);
		p.columnItmGrpDtl1_bdg_sls.addAllListener(p);
		p.columnItmGrpDtl1_bdg_sls.setListListener(p);
		p.columnItmGrpDtl1_bdg_per_cmpl_slo.addAllListener(p);
		p.columnItmGrpDtl1_bdg_per_cmpl_slo.setListListener(p);
		p.columnItmGrpDtl1_bdg_per_cmpl_sls.addAllListener(p);
		p.columnItmGrpDtl1_bdg_per_cmpl_sls.setListListener(p);
		p.columnItmGrpDtl1_col_00.addAllListener(p);
		p.columnItmGrpDtl1_col_00.setListListener(p);
		p.columnItmGrpDtl1_col_01.addAllListener(p);
		p.columnItmGrpDtl1_col_01.setListListener(p);
		p.columnItmGrpDtl1_col_02.addAllListener(p);
		p.columnItmGrpDtl1_col_02.setListListener(p);
		p.columnItmGrpDtl1_col_03.addAllListener(p);
		p.columnItmGrpDtl1_col_03.setListListener(p);
		p.columnItmGrpDtl1_col_04.addAllListener(p);
		p.columnItmGrpDtl1_col_04.setListListener(p);
		p.columnItmGrpDtl1_col_05.addAllListener(p);
		p.columnItmGrpDtl1_col_05.setListListener(p);
		p.columnItmGrpDtl1_col_06.addAllListener(p);
		p.columnItmGrpDtl1_col_06.setListListener(p);
		p.columnItmGrpDtl1_col_07.addAllListener(p);
		p.columnItmGrpDtl1_col_07.setListListener(p);
		p.columnItmGrpDtl1_col_08.addAllListener(p);
		p.columnItmGrpDtl1_col_08.setListListener(p);
		p.columnItmGrpDtl1_col_09.addAllListener(p);
		p.columnItmGrpDtl1_col_09.setListListener(p);
		p.columnItmGrpDtl1_col_10.addAllListener(p);
		p.columnItmGrpDtl1_col_10.setListListener(p);
		p.columnItmGrpDtl1_col_11.addAllListener(p);
		p.columnItmGrpDtl1_col_11.setListListener(p);
		p.columnItmGrpDtl1_col_12.addAllListener(p);
		p.columnItmGrpDtl1_col_12.setListListener(p);
		p.columnItmGrpDtl1_col_13.addAllListener(p);
		p.columnItmGrpDtl1_col_13.setListListener(p);
		p.columnItmGrpDtl1_col_14.addAllListener(p);
		p.columnItmGrpDtl1_col_14.setListListener(p);
		p.columnItmGrpDtl1_col_15.addAllListener(p);
		p.columnItmGrpDtl1_col_15.setListListener(p);
		p.columnItmGrpDtl1_col_16.addAllListener(p);
		p.columnItmGrpDtl1_col_16.setListListener(p);
		p.columnItmGrpDtl1_col_17.addAllListener(p);
		p.columnItmGrpDtl1_col_17.setListListener(p);
		p.columnItmGrpDtl1_amt_dec_place.addAllListener(p);
		p.columnItmGrpDtl1_amt_dec_place.setListListener(p);
		p.columnItmGrpDtl1_rate_dec_place.addAllListener(p);
		p.columnItmGrpDtl1_rate_dec_place.setListListener(p);
		p.columnItmGrpDtl1_itm_grp1_key.addAllListener(p);
		p.columnItmGrpDtl1_itm_grp1_key.setListListener(p);
		p.columnItmGrpDtl1_itm_grp_nm1_key.addAllListener(p);
		p.columnItmGrpDtl1_itm_grp_nm1_key.setListListener(p);
	}

	/**
	 *  [ItmGrpDtlTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmGrpDtlTab(MSBBP_SlsSumSrch p) {
		p.ItmGrpDtlTabTab.addAllListener(p);
	}

	/**
	 *  [ItmGrpDwItmGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmGrpDwItmGrp(MSBBP_SlsSumSrch p) {
		p.ItmGrpDwItmGrpTable.addAllListener(p);
		p.columnItmGrpDwItmGrp_dw_itm_grp_cd.addAllListener(p);
		p.columnItmGrpDwItmGrp_dw_itm_grp_cd.setListListener(p);
		p.columnItmGrpDwItmGrp_dw_itm_grp_nm.addAllListener(p);
		p.columnItmGrpDwItmGrp_dw_itm_grp_nm.setListListener(p);
		p.columnItmGrpDwItmGrp_row_sort_col.addAllListener(p);
		p.columnItmGrpDwItmGrp_row_sort_col.setListListener(p);
		p.columnItmGrpDwItmGrp_row_title_nm.addAllListener(p);
		p.columnItmGrpDwItmGrp_row_title_nm.setListListener(p);
		p.columnItmGrpDwItmGrp_slo.addAllListener(p);
		p.columnItmGrpDwItmGrp_slo.setListListener(p);
		p.columnItmGrpDwItmGrp_slo_bl.addAllListener(p);
		p.columnItmGrpDwItmGrp_slo_bl.setListListener(p);
		p.columnItmGrpDwItmGrp_sls.addAllListener(p);
		p.columnItmGrpDwItmGrp_sls.setListListener(p);
		p.columnItmGrpDwItmGrp_sum.addAllListener(p);
		p.columnItmGrpDwItmGrp_sum.setListListener(p);
		p.columnItmGrpDwItmGrp_spln.addAllListener(p);
		p.columnItmGrpDwItmGrp_spln.setListListener(p);
		p.columnItmGrpDwItmGrp_spln_per_cmpl_slo.addAllListener(p);
		p.columnItmGrpDwItmGrp_spln_per_cmpl_slo.setListListener(p);
		p.columnItmGrpDwItmGrp_spln_per_cmpl_sls.addAllListener(p);
		p.columnItmGrpDwItmGrp_spln_per_cmpl_sls.setListListener(p);
		p.columnItmGrpDwItmGrp_bdg_sls.addAllListener(p);
		p.columnItmGrpDwItmGrp_bdg_sls.setListListener(p);
		p.columnItmGrpDwItmGrp_bdg_per_cmpl_slo.addAllListener(p);
		p.columnItmGrpDwItmGrp_bdg_per_cmpl_slo.setListListener(p);
		p.columnItmGrpDwItmGrp_bdg_per_cmpl_sls.addAllListener(p);
		p.columnItmGrpDwItmGrp_bdg_per_cmpl_sls.setListListener(p);
		p.columnItmGrpDwItmGrp_col_00.addAllListener(p);
		p.columnItmGrpDwItmGrp_col_00.setListListener(p);
		p.columnItmGrpDwItmGrp_col_01.addAllListener(p);
		p.columnItmGrpDwItmGrp_col_01.setListListener(p);
		p.columnItmGrpDwItmGrp_col_02.addAllListener(p);
		p.columnItmGrpDwItmGrp_col_02.setListListener(p);
		p.columnItmGrpDwItmGrp_col_03.addAllListener(p);
		p.columnItmGrpDwItmGrp_col_03.setListListener(p);
		p.columnItmGrpDwItmGrp_col_04.addAllListener(p);
		p.columnItmGrpDwItmGrp_col_04.setListListener(p);
		p.columnItmGrpDwItmGrp_col_05.addAllListener(p);
		p.columnItmGrpDwItmGrp_col_05.setListListener(p);
		p.columnItmGrpDwItmGrp_col_06.addAllListener(p);
		p.columnItmGrpDwItmGrp_col_06.setListListener(p);
		p.columnItmGrpDwItmGrp_col_07.addAllListener(p);
		p.columnItmGrpDwItmGrp_col_07.setListListener(p);
		p.columnItmGrpDwItmGrp_col_08.addAllListener(p);
		p.columnItmGrpDwItmGrp_col_08.setListListener(p);
		p.columnItmGrpDwItmGrp_col_09.addAllListener(p);
		p.columnItmGrpDwItmGrp_col_09.setListListener(p);
		p.columnItmGrpDwItmGrp_col_10.addAllListener(p);
		p.columnItmGrpDwItmGrp_col_10.setListListener(p);
		p.columnItmGrpDwItmGrp_col_11.addAllListener(p);
		p.columnItmGrpDwItmGrp_col_11.setListListener(p);
		p.columnItmGrpDwItmGrp_col_12.addAllListener(p);
		p.columnItmGrpDwItmGrp_col_12.setListListener(p);
		p.columnItmGrpDwItmGrp_col_13.addAllListener(p);
		p.columnItmGrpDwItmGrp_col_13.setListListener(p);
		p.columnItmGrpDwItmGrp_col_14.addAllListener(p);
		p.columnItmGrpDwItmGrp_col_14.setListListener(p);
		p.columnItmGrpDwItmGrp_col_15.addAllListener(p);
		p.columnItmGrpDwItmGrp_col_15.setListListener(p);
		p.columnItmGrpDwItmGrp_col_16.addAllListener(p);
		p.columnItmGrpDwItmGrp_col_16.setListListener(p);
		p.columnItmGrpDwItmGrp_col_17.addAllListener(p);
		p.columnItmGrpDwItmGrp_col_17.setListListener(p);
		p.columnItmGrpDwItmGrp_base_unit_dec_place.addAllListener(p);
		p.columnItmGrpDwItmGrp_base_unit_dec_place.setListListener(p);
		p.columnItmGrpDwItmGrp_amt_dec_place.addAllListener(p);
		p.columnItmGrpDwItmGrp_amt_dec_place.setListListener(p);
		p.columnItmGrpDwItmGrp_rate_dec_place.addAllListener(p);
		p.columnItmGrpDwItmGrp_rate_dec_place.setListListener(p);
		p.columnItmGrpDwItmGrp_itm_grp_cd.addAllListener(p);
		p.columnItmGrpDwItmGrp_itm_grp_cd.setListListener(p);
		p.columnItmGrpDwItmGrp_itm_grp2_key.addAllListener(p);
		p.columnItmGrpDwItmGrp_itm_grp2_key.setListListener(p);
	}

	/**
	 *  [ItmGrpItm]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmGrpItm(MSBBP_SlsSumSrch p) {
		p.ItmGrpItmTable.addAllListener(p);
		p.columnItmGrpItm_row_sort_col.addAllListener(p);
		p.columnItmGrpItm_row_sort_col.setListListener(p);
		p.columnItmGrpItm_row_title_nm.addAllListener(p);
		p.columnItmGrpItm_row_title_nm.setListListener(p);
		p.columnItmGrpItm_slo.addAllListener(p);
		p.columnItmGrpItm_slo.setListListener(p);
		p.columnItmGrpItm_slo_bl.addAllListener(p);
		p.columnItmGrpItm_slo_bl.setListListener(p);
		p.columnItmGrpItm_sls.addAllListener(p);
		p.columnItmGrpItm_sls.setListListener(p);
		p.columnItmGrpItm_sum.addAllListener(p);
		p.columnItmGrpItm_sum.setListListener(p);
		p.columnItmGrpItm_spln.addAllListener(p);
		p.columnItmGrpItm_spln.setListListener(p);
		p.columnItmGrpItm_spln_per_cmpl_slo.addAllListener(p);
		p.columnItmGrpItm_spln_per_cmpl_slo.setListListener(p);
		p.columnItmGrpItm_spln_per_cmpl_sls.addAllListener(p);
		p.columnItmGrpItm_spln_per_cmpl_sls.setListListener(p);
		p.columnItmGrpItm_bdg_sls.addAllListener(p);
		p.columnItmGrpItm_bdg_sls.setListListener(p);
		p.columnItmGrpItm_bdg_per_cmpl_slo.addAllListener(p);
		p.columnItmGrpItm_bdg_per_cmpl_slo.setListListener(p);
		p.columnItmGrpItm_bdg_per_cmpl_sls.addAllListener(p);
		p.columnItmGrpItm_bdg_per_cmpl_sls.setListListener(p);
		p.columnItmGrpItm_col_00.addAllListener(p);
		p.columnItmGrpItm_col_00.setListListener(p);
		p.columnItmGrpItm_col_01.addAllListener(p);
		p.columnItmGrpItm_col_01.setListListener(p);
		p.columnItmGrpItm_col_02.addAllListener(p);
		p.columnItmGrpItm_col_02.setListListener(p);
		p.columnItmGrpItm_col_03.addAllListener(p);
		p.columnItmGrpItm_col_03.setListListener(p);
		p.columnItmGrpItm_col_04.addAllListener(p);
		p.columnItmGrpItm_col_04.setListListener(p);
		p.columnItmGrpItm_col_05.addAllListener(p);
		p.columnItmGrpItm_col_05.setListListener(p);
		p.columnItmGrpItm_col_06.addAllListener(p);
		p.columnItmGrpItm_col_06.setListListener(p);
		p.columnItmGrpItm_col_07.addAllListener(p);
		p.columnItmGrpItm_col_07.setListListener(p);
		p.columnItmGrpItm_col_08.addAllListener(p);
		p.columnItmGrpItm_col_08.setListListener(p);
		p.columnItmGrpItm_col_09.addAllListener(p);
		p.columnItmGrpItm_col_09.setListListener(p);
		p.columnItmGrpItm_col_10.addAllListener(p);
		p.columnItmGrpItm_col_10.setListListener(p);
		p.columnItmGrpItm_col_11.addAllListener(p);
		p.columnItmGrpItm_col_11.setListListener(p);
		p.columnItmGrpItm_col_12.addAllListener(p);
		p.columnItmGrpItm_col_12.setListListener(p);
		p.columnItmGrpItm_col_13.addAllListener(p);
		p.columnItmGrpItm_col_13.setListListener(p);
		p.columnItmGrpItm_col_14.addAllListener(p);
		p.columnItmGrpItm_col_14.setListListener(p);
		p.columnItmGrpItm_col_15.addAllListener(p);
		p.columnItmGrpItm_col_15.setListListener(p);
		p.columnItmGrpItm_col_16.addAllListener(p);
		p.columnItmGrpItm_col_16.setListListener(p);
		p.columnItmGrpItm_col_17.addAllListener(p);
		p.columnItmGrpItm_col_17.setListListener(p);
		p.columnItmGrpItm_base_unit_dec_place.addAllListener(p);
		p.columnItmGrpItm_base_unit_dec_place.setListListener(p);
		p.columnItmGrpItm_amt_dec_place.addAllListener(p);
		p.columnItmGrpItm_amt_dec_place.setListListener(p);
		p.columnItmGrpItm_rate_dec_place.addAllListener(p);
		p.columnItmGrpItm_rate_dec_place.setListListener(p);
		p.columnItmGrpItm_itm_grp_cd.addAllListener(p);
		p.columnItmGrpItm_itm_grp_cd.setListListener(p);
		p.columnItmGrpItm_itm_cd_key.addAllListener(p);
		p.columnItmGrpItm_itm_cd_key.setListListener(p);
		p.columnItmGrpItm_itm_sub1_key.addAllListener(p);
		p.columnItmGrpItm_itm_sub1_key.setListListener(p);
		p.columnItmGrpItm_itm_sub2_key.addAllListener(p);
		p.columnItmGrpItm_itm_sub2_key.setListListener(p);
		p.columnItmGrpItm_itm_sub3_key.addAllListener(p);
		p.columnItmGrpItm_itm_sub3_key.setListListener(p);
	}

	/**
	 *  [ItmGrpCst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItmGrpCst(MSBBP_SlsSumSrch p) {
		p.ItmGrpCstTable.addAllListener(p);
		p.columnItmGrpCst_cst_cd.addAllListener(p);
		p.columnItmGrpCst_cst_cd.setListListener(p);
		p.columnItmGrpCst_cst_nm.addAllListener(p);
		p.columnItmGrpCst_cst_nm.setListListener(p);
		p.columnItmGrpCst_row_sort_col.addAllListener(p);
		p.columnItmGrpCst_row_sort_col.setListListener(p);
		p.columnItmGrpCst_row_title_nm.addAllListener(p);
		p.columnItmGrpCst_row_title_nm.setListListener(p);
		p.columnItmGrpCst_slo.addAllListener(p);
		p.columnItmGrpCst_slo.setListListener(p);
		p.columnItmGrpCst_slo_bl.addAllListener(p);
		p.columnItmGrpCst_slo_bl.setListListener(p);
		p.columnItmGrpCst_sls.addAllListener(p);
		p.columnItmGrpCst_sls.setListListener(p);
		p.columnItmGrpCst_sum.addAllListener(p);
		p.columnItmGrpCst_sum.setListListener(p);
		p.columnItmGrpCst_spln.addAllListener(p);
		p.columnItmGrpCst_spln.setListListener(p);
		p.columnItmGrpCst_spln_per_cmpl_slo.addAllListener(p);
		p.columnItmGrpCst_spln_per_cmpl_slo.setListListener(p);
		p.columnItmGrpCst_spln_per_cmpl_sls.addAllListener(p);
		p.columnItmGrpCst_spln_per_cmpl_sls.setListListener(p);
		p.columnItmGrpCst_bdg_sls.addAllListener(p);
		p.columnItmGrpCst_bdg_sls.setListListener(p);
		p.columnItmGrpCst_bdg_per_cmpl_slo.addAllListener(p);
		p.columnItmGrpCst_bdg_per_cmpl_slo.setListListener(p);
		p.columnItmGrpCst_bdg_per_cmpl_sls.addAllListener(p);
		p.columnItmGrpCst_bdg_per_cmpl_sls.setListListener(p);
		p.columnItmGrpCst_col_00.addAllListener(p);
		p.columnItmGrpCst_col_00.setListListener(p);
		p.columnItmGrpCst_col_01.addAllListener(p);
		p.columnItmGrpCst_col_01.setListListener(p);
		p.columnItmGrpCst_col_02.addAllListener(p);
		p.columnItmGrpCst_col_02.setListListener(p);
		p.columnItmGrpCst_col_03.addAllListener(p);
		p.columnItmGrpCst_col_03.setListListener(p);
		p.columnItmGrpCst_col_04.addAllListener(p);
		p.columnItmGrpCst_col_04.setListListener(p);
		p.columnItmGrpCst_col_05.addAllListener(p);
		p.columnItmGrpCst_col_05.setListListener(p);
		p.columnItmGrpCst_col_06.addAllListener(p);
		p.columnItmGrpCst_col_06.setListListener(p);
		p.columnItmGrpCst_col_07.addAllListener(p);
		p.columnItmGrpCst_col_07.setListListener(p);
		p.columnItmGrpCst_col_08.addAllListener(p);
		p.columnItmGrpCst_col_08.setListListener(p);
		p.columnItmGrpCst_col_09.addAllListener(p);
		p.columnItmGrpCst_col_09.setListListener(p);
		p.columnItmGrpCst_col_10.addAllListener(p);
		p.columnItmGrpCst_col_10.setListListener(p);
		p.columnItmGrpCst_col_11.addAllListener(p);
		p.columnItmGrpCst_col_11.setListListener(p);
		p.columnItmGrpCst_col_12.addAllListener(p);
		p.columnItmGrpCst_col_12.setListListener(p);
		p.columnItmGrpCst_col_13.addAllListener(p);
		p.columnItmGrpCst_col_13.setListListener(p);
		p.columnItmGrpCst_col_14.addAllListener(p);
		p.columnItmGrpCst_col_14.setListListener(p);
		p.columnItmGrpCst_col_15.addAllListener(p);
		p.columnItmGrpCst_col_15.setListListener(p);
		p.columnItmGrpCst_col_16.addAllListener(p);
		p.columnItmGrpCst_col_16.setListListener(p);
		p.columnItmGrpCst_col_17.addAllListener(p);
		p.columnItmGrpCst_col_17.setListListener(p);
		p.columnItmGrpCst_base_unit_dec_place.addAllListener(p);
		p.columnItmGrpCst_base_unit_dec_place.setListListener(p);
		p.columnItmGrpCst_amt_dec_place.addAllListener(p);
		p.columnItmGrpCst_amt_dec_place.setListListener(p);
		p.columnItmGrpCst_rate_dec_place.addAllListener(p);
		p.columnItmGrpCst_rate_dec_place.setListListener(p);
		p.columnItmGrpCst_itm_grp_cd.addAllListener(p);
		p.columnItmGrpCst_itm_grp_cd.setListListener(p);
		p.columnItmGrpCst_cst_cd_key.addAllListener(p);
		p.columnItmGrpCst_cst_cd_key.setListListener(p);
	}

	/**
	 * [DPT_SRCH]ステータスの[MainTab]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_MainTab(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_Rslt(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_SRCH]ステータスの[DptRslt]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_DptRslt(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_SRCH]ステータスの[ItmGrpRslt]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_ItmGrpRslt(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_SRCH]ステータスの[DptDwDptAll]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_DptDwDptAll(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_SRCH]ステータスの[DptSlsUsrAll]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_DptSlsUsrAll(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_SRCH]ステータスの[DptCstAll]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_DptCstAll(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_SRCH]ステータスの[ItmGrpDwItmGrpAll]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_ItmGrpDwItmGrpAll(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_SRCH]ステータスの[ItmGrpItmAll]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_ItmGrpItmAll(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_SRCH]ステータスの[ItmGrpCstAll]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_ItmGrpCstAll(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_SRCH]ステータスの[Dpt]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_Dpt(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_Cnd(MSBBP_SlsSumSrch p){
		p.Cnd_inpt_ym_d.putMode(p, DPT_SRCH, MCMode.REQUIRED);
		p.Cnd_sls_trnst_disp_d.putMode(p, DPT_SRCH, MCMode.ENABLE);
		p.Cnd_sls_disp_term_d.putMode(p, DPT_SRCH, MCMode.ENABLE);
		p.Cnd_sum_term_d.putMode(p, DPT_SRCH, MCMode.ENABLE);
		p.Cnd_sls_bdg_grp_d.putMode(p, DPT_SRCH, MCMode.ENABLE);
		p.Cnd_xrate_cd_d.putMode(p, DPT_SRCH, MCMode.REQUIRED);
		p.Cnd_xrate_nm_d.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Cnd_use_act_xrate_flg_d.putMode(p, DPT_SRCH, MCMode.ENABLE);
		p.Cnd_dpt_lvl_cd_d.putMode(p, DPT_SRCH, MCMode.REQUIRED);
		p.Cnd_dpt_lvl_nm_d.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Cnd_dpt_cd_d.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Cnd_dpt_nm_d.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Cnd_inpt_ym_ig.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Cnd_sls_trnst_disp_ig.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Cnd_sls_disp_term_ig.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Cnd_sum_term_ig.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Cnd_sls_bdg_grp_ig.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Cnd_xrate_cd_ig.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Cnd_xrate_nm_ig.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Cnd_use_act_xrate_flg_ig.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Cnd_sls_itm_grp_lvl.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Cnd_sls_itm_grp_cd_ig.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Cnd_sls_itm_grp_nm_ig.putMode(p, DPT_SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [DPT_SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_Hdr(MSBBP_SlsSumSrch p){
		p.Hdr_base_cur_cd.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Hdr_unit.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.Hdr_sls_flg.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Hdr_slo_bl_flg.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Hdr_slo_flg.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Hdr_spln_flg.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Hdr_spln_per_cmpl_sls_flg.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Hdr_bdg_flg.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Hdr_bdg_per_cmpl_sls_flg.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Hdr_prof_amt_flg.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Hdr_prof_rate_flg.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Hdr_big_num_rnd_typ.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.Hdr_big_num_rnd_typ_nm.putMode(p, DPT_SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [DPT_SRCH]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_Dtl1(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_SRCH]ステータスの[DptDtl1]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_DptDtl1(MSBBP_SlsSumSrch p){
		p.columnDptDtl1_dpt_cd.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnDptDtl1_dpt_nm.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnDptDtl1_itm_grp_cd.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnDptDtl1_itm_grp_nm.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnDptDtl1_row_sort_col.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnDptDtl1_row_title_nm.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnDptDtl1_dpt1_key.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnDptDtl1_dpt_nm1_key.putMode(p, DPT_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [DPT_SRCH]ステータスの[DptDtlTab]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_DptDtlTab(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_SRCH]ステータスの[DptDtl]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_DptDtl(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_SRCH]ステータスの[DptDwDpt]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_DptDwDpt(MSBBP_SlsSumSrch p){
		p.columnDptDwDpt_dw_dpt_cd.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnDptDwDpt_dw_dpt_nm.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnDptDwDpt_row_sort_col.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnDptDwDpt_row_title_nm.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnDptDwDpt_dpt_cd.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnDptDwDpt_dpt_nm.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnDptDwDpt_dpt2_key.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnDptDwDpt_dpt_nm2_key.putMode(p, DPT_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [DPT_SRCH]ステータスの[DptSlsUsr]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_DptSlsUsr(MSBBP_SlsSumSrch p){
		p.columnDptSlsUsr_sls_usr_cd.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnDptSlsUsr_sls_usr_nm.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnDptSlsUsr_row_sort_col.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnDptSlsUsr_row_title_nm.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnDptSlsUsr_dpt_cd.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnDptSlsUsr_dpt_nm.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnDptSlsUsr_sls_usr_cd_key.putMode(p, DPT_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [DPT_SRCH]ステータスの[DptCst]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_DptCst(MSBBP_SlsSumSrch p){
		p.columnDptCst_cst_cd.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnDptCst_cst_nm.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnDptCst_row_sort_col.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnDptCst_row_title_nm.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnDptCst_dpt_cd.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnDptCst_dpt_nm.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnDptCst_cst_cd_key.putMode(p, DPT_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [DPT_SRCH]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_ItmGrp(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_SRCH]ステータスの[ItmGrpCnd]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_ItmGrpCnd(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_SRCH]ステータスの[ItmGrpHdr]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_ItmGrpHdr(MSBBP_SlsSumSrch p){
		p.ItmGrpHdr_base_cur_cd.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_base_cur_nm.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_unit.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_sls_flg.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_slo_bl_flg.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_slo_flg.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_spln_flg.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_spln_per_cmpl_sls_flg.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_bdg_flg.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_bdg_per_cmpl_sls_flg.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_prof_amt_flg.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_prof_rate_flg.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_big_num_rnd_typ.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_big_num_rnd_typ_nm.putMode(p, DPT_SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [DPT_SRCH]ステータスの[ItmGrpDtl1]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_ItmGrpDtl1(MSBBP_SlsSumSrch p){
		p.columnItmGrpDtl1_itm_grp_cd.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnItmGrpDtl1_itm_grp_nm.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnItmGrpDtl1_row_sort_col.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpDtl1_row_title_nm.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnItmGrpDtl1_amt_dec_place.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpDtl1_rate_dec_place.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpDtl1_itm_grp1_key.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpDtl1_itm_grp_nm1_key.putMode(p, DPT_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [DPT_SRCH]ステータスの[ItmGrpDtlTab]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_ItmGrpDtlTab(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_SRCH]ステータスの[ItmGrpDtl]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_ItmGrpDtl(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_SRCH]ステータスの[ItmGrpDwItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_ItmGrpDwItmGrp(MSBBP_SlsSumSrch p){
		p.columnItmGrpDwItmGrp_dw_itm_grp_cd.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnItmGrpDwItmGrp_dw_itm_grp_nm.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.ItmGrpDwItmGrp_itm_p_PPanel.putStatus(DPT_SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnItmGrpDwItmGrp_row_sort_col.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpDwItmGrp_row_title_nm.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnItmGrpDwItmGrp_base_unit_dec_place.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpDwItmGrp_amt_dec_place.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpDwItmGrp_rate_dec_place.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpDwItmGrp_itm_grp_cd.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnItmGrpDwItmGrp_itm_grp2_key.putMode(p, DPT_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [DPT_SRCH]ステータスの[ItmGrpItm]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_ItmGrpItm(MSBBP_SlsSumSrch p){
		p.ItmGrpItm_itm_p_PPanel.putStatus(DPT_SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnItmGrpItm_row_sort_col.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpItm_row_title_nm.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnItmGrpItm_base_unit_dec_place.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpItm_amt_dec_place.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpItm_rate_dec_place.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpItm_itm_grp_cd.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnItmGrpItm_itm_cd_key.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpItm_itm_sub1_key.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpItm_itm_sub2_key.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpItm_itm_sub3_key.putMode(p, DPT_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [DPT_SRCH]ステータスの[ItmGrpCst]ブロックのモードの設定
	 */
	protected static void statusInitDPT__SRCH_ItmGrpCst(MSBBP_SlsSumSrch p){
		p.columnItmGrpCst_cst_cd.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnItmGrpCst_cst_nm.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnItmGrpCst_row_sort_col.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpCst_row_title_nm.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnItmGrpCst_base_unit_dec_place.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpCst_amt_dec_place.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpCst_rate_dec_place.putMode(p, DPT_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpCst_itm_grp_cd.putMode(p, DPT_SRCH, MCMode.READ_ONLY);
		p.columnItmGrpCst_cst_cd_key.putMode(p, DPT_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [DPT_REF]ステータスの[MainTab]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_MainTab(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_Rslt(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_REF]ステータスの[DptRslt]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_DptRslt(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_REF]ステータスの[ItmGrpRslt]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_ItmGrpRslt(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_REF]ステータスの[DptDwDptAll]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_DptDwDptAll(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_REF]ステータスの[DptSlsUsrAll]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_DptSlsUsrAll(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_REF]ステータスの[DptCstAll]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_DptCstAll(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_REF]ステータスの[ItmGrpDwItmGrpAll]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_ItmGrpDwItmGrpAll(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_REF]ステータスの[ItmGrpItmAll]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_ItmGrpItmAll(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_REF]ステータスの[ItmGrpCstAll]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_ItmGrpCstAll(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_REF]ステータスの[Dpt]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_Dpt(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_Cnd(MSBBP_SlsSumSrch p){
		p.Cnd_inpt_ym_d.putMode(p, DPT_REF, MCMode.REQUIRED);
		p.Cnd_sls_trnst_disp_d.putMode(p, DPT_REF, MCMode.ENABLE);
		p.Cnd_sls_disp_term_d.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.Cnd_sum_term_d.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.Cnd_sls_bdg_grp_d.putMode(p, DPT_REF, MCMode.ENABLE);
		p.Cnd_xrate_cd_d.putMode(p, DPT_REF, MCMode.REQUIRED);
		p.Cnd_xrate_nm_d.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.Cnd_use_act_xrate_flg_d.putMode(p, DPT_REF, MCMode.ENABLE);
		p.Cnd_dpt_lvl_cd_d.putMode(p, DPT_REF, MCMode.REQUIRED);
		p.Cnd_dpt_lvl_nm_d.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.Cnd_dpt_cd_d.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.Cnd_dpt_nm_d.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.Cnd_inpt_ym_ig.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.Cnd_sls_trnst_disp_ig.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.Cnd_sls_disp_term_ig.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.Cnd_sum_term_ig.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.Cnd_sls_bdg_grp_ig.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.Cnd_xrate_cd_ig.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.Cnd_xrate_nm_ig.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.Cnd_use_act_xrate_flg_ig.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.Cnd_sls_itm_grp_lvl.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.Cnd_sls_itm_grp_cd_ig.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.Cnd_sls_itm_grp_nm_ig.putMode(p, DPT_REF, MCMode.READ_ONLY);

	}

	/**
	 * [DPT_REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_Hdr(MSBBP_SlsSumSrch p){
		p.Hdr_base_cur_cd.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.Hdr_unit.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.Hdr_sls_flg.putMode(p, DPT_REF, MCMode.REQUIRED);
		p.Hdr_slo_bl_flg.putMode(p, DPT_REF, MCMode.REQUIRED);
		p.Hdr_slo_flg.putMode(p, DPT_REF, MCMode.REQUIRED);
		p.Hdr_spln_flg.putMode(p, DPT_REF, MCMode.REQUIRED);
		p.Hdr_spln_per_cmpl_sls_flg.putMode(p, DPT_REF, MCMode.REQUIRED);
		p.Hdr_bdg_flg.putMode(p, DPT_REF, MCMode.REQUIRED);
		p.Hdr_bdg_per_cmpl_sls_flg.putMode(p, DPT_REF, MCMode.REQUIRED);
		p.Hdr_prof_amt_flg.putMode(p, DPT_REF, MCMode.REQUIRED);
		p.Hdr_prof_rate_flg.putMode(p, DPT_REF, MCMode.REQUIRED);
		p.Hdr_big_num_rnd_typ.putMode(p, DPT_REF, MCMode.ENABLE);
		p.Hdr_big_num_rnd_typ_nm.putMode(p, DPT_REF, MCMode.READ_ONLY);

	}

	/**
	 * [DPT_REF]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_Dtl1(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_REF]ステータスの[DptDtl1]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_DptDtl1(MSBBP_SlsSumSrch p){
		p.columnDptDtl1_dpt_cd.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnDptDtl1_dpt_nm.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnDptDtl1_itm_grp_cd.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnDptDtl1_itm_grp_nm.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnDptDtl1_row_sort_col.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnDptDtl1_row_title_nm.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnDptDtl1_dpt1_key.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnDptDtl1_dpt_nm1_key.putMode(p, DPT_REF, MCMode.INVISIBLE);

	}

	/**
	 * [DPT_REF]ステータスの[DptDtlTab]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_DptDtlTab(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_REF]ステータスの[DptDtl]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_DptDtl(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_REF]ステータスの[DptDwDpt]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_DptDwDpt(MSBBP_SlsSumSrch p){
		p.columnDptDwDpt_dw_dpt_cd.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnDptDwDpt_dw_dpt_nm.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnDptDwDpt_row_sort_col.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnDptDwDpt_row_title_nm.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnDptDwDpt_dpt_cd.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnDptDwDpt_dpt_nm.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnDptDwDpt_dpt2_key.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnDptDwDpt_dpt_nm2_key.putMode(p, DPT_REF, MCMode.INVISIBLE);

	}

	/**
	 * [DPT_REF]ステータスの[DptSlsUsr]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_DptSlsUsr(MSBBP_SlsSumSrch p){
		p.columnDptSlsUsr_sls_usr_cd.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnDptSlsUsr_sls_usr_nm.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnDptSlsUsr_row_sort_col.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnDptSlsUsr_row_title_nm.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnDptSlsUsr_dpt_cd.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnDptSlsUsr_dpt_nm.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnDptSlsUsr_sls_usr_cd_key.putMode(p, DPT_REF, MCMode.INVISIBLE);

	}

	/**
	 * [DPT_REF]ステータスの[DptCst]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_DptCst(MSBBP_SlsSumSrch p){
		p.columnDptCst_cst_cd.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnDptCst_cst_nm.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnDptCst_row_sort_col.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnDptCst_row_title_nm.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnDptCst_dpt_cd.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnDptCst_dpt_nm.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnDptCst_cst_cd_key.putMode(p, DPT_REF, MCMode.INVISIBLE);

	}

	/**
	 * [DPT_REF]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_ItmGrp(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_REF]ステータスの[ItmGrpCnd]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_ItmGrpCnd(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_REF]ステータスの[ItmGrpHdr]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_ItmGrpHdr(MSBBP_SlsSumSrch p){
		p.ItmGrpHdr_base_cur_cd.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.ItmGrpHdr_base_cur_nm.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.ItmGrpHdr_unit.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.ItmGrpHdr_sls_flg.putMode(p, DPT_REF, MCMode.REQUIRED);
		p.ItmGrpHdr_slo_bl_flg.putMode(p, DPT_REF, MCMode.REQUIRED);
		p.ItmGrpHdr_slo_flg.putMode(p, DPT_REF, MCMode.REQUIRED);
		p.ItmGrpHdr_spln_flg.putMode(p, DPT_REF, MCMode.REQUIRED);
		p.ItmGrpHdr_spln_per_cmpl_sls_flg.putMode(p, DPT_REF, MCMode.REQUIRED);
		p.ItmGrpHdr_bdg_flg.putMode(p, DPT_REF, MCMode.REQUIRED);
		p.ItmGrpHdr_bdg_per_cmpl_sls_flg.putMode(p, DPT_REF, MCMode.REQUIRED);
		p.ItmGrpHdr_prof_amt_flg.putMode(p, DPT_REF, MCMode.REQUIRED);
		p.ItmGrpHdr_prof_rate_flg.putMode(p, DPT_REF, MCMode.REQUIRED);
		p.ItmGrpHdr_big_num_rnd_typ.putMode(p, DPT_REF, MCMode.ENABLE);
		p.ItmGrpHdr_big_num_rnd_typ_nm.putMode(p, DPT_REF, MCMode.READ_ONLY);

	}

	/**
	 * [DPT_REF]ステータスの[ItmGrpDtl1]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_ItmGrpDtl1(MSBBP_SlsSumSrch p){
		p.columnItmGrpDtl1_itm_grp_cd.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnItmGrpDtl1_itm_grp_nm.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnItmGrpDtl1_row_sort_col.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnItmGrpDtl1_row_title_nm.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnItmGrpDtl1_amt_dec_place.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnItmGrpDtl1_rate_dec_place.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnItmGrpDtl1_itm_grp1_key.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnItmGrpDtl1_itm_grp_nm1_key.putMode(p, DPT_REF, MCMode.INVISIBLE);

	}

	/**
	 * [DPT_REF]ステータスの[ItmGrpDtlTab]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_ItmGrpDtlTab(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_REF]ステータスの[ItmGrpDtl]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_ItmGrpDtl(MSBBP_SlsSumSrch p){

	}

	/**
	 * [DPT_REF]ステータスの[ItmGrpDwItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_ItmGrpDwItmGrp(MSBBP_SlsSumSrch p){
		p.columnItmGrpDwItmGrp_dw_itm_grp_cd.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnItmGrpDwItmGrp_dw_itm_grp_nm.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.ItmGrpDwItmGrp_itm_p_PPanel.putStatus(DPT_REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnItmGrpDwItmGrp_row_sort_col.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnItmGrpDwItmGrp_row_title_nm.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnItmGrpDwItmGrp_base_unit_dec_place.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnItmGrpDwItmGrp_amt_dec_place.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnItmGrpDwItmGrp_rate_dec_place.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnItmGrpDwItmGrp_itm_grp_cd.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnItmGrpDwItmGrp_itm_grp2_key.putMode(p, DPT_REF, MCMode.INVISIBLE);

	}

	/**
	 * [DPT_REF]ステータスの[ItmGrpItm]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_ItmGrpItm(MSBBP_SlsSumSrch p){
		p.ItmGrpItm_itm_p_PPanel.putStatus(DPT_REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnItmGrpItm_row_sort_col.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnItmGrpItm_row_title_nm.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnItmGrpItm_base_unit_dec_place.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnItmGrpItm_amt_dec_place.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnItmGrpItm_rate_dec_place.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnItmGrpItm_itm_grp_cd.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnItmGrpItm_itm_cd_key.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnItmGrpItm_itm_sub1_key.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnItmGrpItm_itm_sub2_key.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnItmGrpItm_itm_sub3_key.putMode(p, DPT_REF, MCMode.INVISIBLE);

	}

	/**
	 * [DPT_REF]ステータスの[ItmGrpCst]ブロックのモードの設定
	 */
	protected static void statusInitDPT__REF_ItmGrpCst(MSBBP_SlsSumSrch p){
		p.columnItmGrpCst_cst_cd.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnItmGrpCst_cst_nm.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnItmGrpCst_row_sort_col.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnItmGrpCst_row_title_nm.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnItmGrpCst_base_unit_dec_place.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnItmGrpCst_amt_dec_place.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnItmGrpCst_rate_dec_place.putMode(p, DPT_REF, MCMode.INVISIBLE);
		p.columnItmGrpCst_itm_grp_cd.putMode(p, DPT_REF, MCMode.READ_ONLY);
		p.columnItmGrpCst_cst_cd_key.putMode(p, DPT_REF, MCMode.INVISIBLE);

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[MainTab]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_MainTab(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_Rslt(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[DptRslt]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_DptRslt(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[ItmGrpRslt]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_ItmGrpRslt(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[DptDwDptAll]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_DptDwDptAll(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[DptSlsUsrAll]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_DptSlsUsrAll(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[DptCstAll]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_DptCstAll(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[ItmGrpDwItmGrpAll]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_ItmGrpDwItmGrpAll(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[ItmGrpItmAll]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_ItmGrpItmAll(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[ItmGrpCstAll]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_ItmGrpCstAll(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[Dpt]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_Dpt(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_Cnd(MSBBP_SlsSumSrch p){
		p.Cnd_inpt_ym_d.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Cnd_sls_trnst_disp_d.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Cnd_sls_disp_term_d.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Cnd_sum_term_d.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Cnd_sls_bdg_grp_d.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Cnd_xrate_cd_d.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Cnd_xrate_nm_d.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Cnd_use_act_xrate_flg_d.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Cnd_dpt_lvl_cd_d.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Cnd_dpt_lvl_nm_d.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Cnd_dpt_cd_d.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Cnd_dpt_nm_d.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Cnd_inpt_ym_ig.putMode(p, ITM_GRP_SRCH, MCMode.REQUIRED);
		p.Cnd_sls_trnst_disp_ig.putMode(p, ITM_GRP_SRCH, MCMode.ENABLE);
		p.Cnd_sls_disp_term_ig.putMode(p, ITM_GRP_SRCH, MCMode.ENABLE);
		p.Cnd_sum_term_ig.putMode(p, ITM_GRP_SRCH, MCMode.ENABLE);
		p.Cnd_sls_bdg_grp_ig.putMode(p, ITM_GRP_SRCH, MCMode.ENABLE);
		p.Cnd_xrate_cd_ig.putMode(p, ITM_GRP_SRCH, MCMode.REQUIRED);
		p.Cnd_xrate_nm_ig.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Cnd_use_act_xrate_flg_ig.putMode(p, ITM_GRP_SRCH, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_lvl.putMode(p, ITM_GRP_SRCH, MCMode.REQUIRED);
		p.Cnd_sls_itm_grp_cd_ig.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Cnd_sls_itm_grp_nm_ig.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_Hdr(MSBBP_SlsSumSrch p){
		p.Hdr_base_cur_cd.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Hdr_unit.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.Hdr_sls_flg.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Hdr_slo_bl_flg.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Hdr_slo_flg.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Hdr_spln_flg.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Hdr_spln_per_cmpl_sls_flg.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Hdr_bdg_flg.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Hdr_bdg_per_cmpl_sls_flg.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Hdr_prof_amt_flg.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Hdr_prof_rate_flg.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Hdr_big_num_rnd_typ.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.Hdr_big_num_rnd_typ_nm.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_Dtl1(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[DptDtl1]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_DptDtl1(MSBBP_SlsSumSrch p){
		p.columnDptDtl1_dpt_cd.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnDptDtl1_dpt_nm.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnDptDtl1_itm_grp_cd.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnDptDtl1_itm_grp_nm.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnDptDtl1_row_sort_col.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnDptDtl1_row_title_nm.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnDptDtl1_dpt1_key.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnDptDtl1_dpt_nm1_key.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[DptDtlTab]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_DptDtlTab(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[DptDtl]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_DptDtl(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[DptDwDpt]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_DptDwDpt(MSBBP_SlsSumSrch p){
		p.columnDptDwDpt_dw_dpt_cd.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnDptDwDpt_dw_dpt_nm.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnDptDwDpt_row_sort_col.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnDptDwDpt_row_title_nm.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnDptDwDpt_dpt_cd.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnDptDwDpt_dpt_nm.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnDptDwDpt_dpt2_key.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnDptDwDpt_dpt_nm2_key.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[DptSlsUsr]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_DptSlsUsr(MSBBP_SlsSumSrch p){
		p.columnDptSlsUsr_sls_usr_cd.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnDptSlsUsr_sls_usr_nm.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnDptSlsUsr_row_sort_col.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnDptSlsUsr_row_title_nm.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnDptSlsUsr_dpt_cd.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnDptSlsUsr_dpt_nm.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnDptSlsUsr_sls_usr_cd_key.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[DptCst]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_DptCst(MSBBP_SlsSumSrch p){
		p.columnDptCst_cst_cd.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnDptCst_cst_nm.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnDptCst_row_sort_col.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnDptCst_row_title_nm.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnDptCst_dpt_cd.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnDptCst_dpt_nm.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnDptCst_cst_cd_key.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_ItmGrp(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[ItmGrpCnd]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_ItmGrpCnd(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[ItmGrpHdr]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_ItmGrpHdr(MSBBP_SlsSumSrch p){
		p.ItmGrpHdr_base_cur_cd.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_base_cur_nm.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_unit.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_sls_flg.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_slo_bl_flg.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_slo_flg.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_spln_flg.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_spln_per_cmpl_sls_flg.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_bdg_flg.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_bdg_per_cmpl_sls_flg.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_prof_amt_flg.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_prof_rate_flg.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_big_num_rnd_typ.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.ItmGrpHdr_big_num_rnd_typ_nm.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[ItmGrpDtl1]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_ItmGrpDtl1(MSBBP_SlsSumSrch p){
		p.columnItmGrpDtl1_itm_grp_cd.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnItmGrpDtl1_itm_grp_nm.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnItmGrpDtl1_row_sort_col.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpDtl1_row_title_nm.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnItmGrpDtl1_amt_dec_place.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpDtl1_rate_dec_place.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpDtl1_itm_grp1_key.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpDtl1_itm_grp_nm1_key.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[ItmGrpDtlTab]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_ItmGrpDtlTab(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[ItmGrpDtl]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_ItmGrpDtl(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[ItmGrpDwItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_ItmGrpDwItmGrp(MSBBP_SlsSumSrch p){
		p.columnItmGrpDwItmGrp_dw_itm_grp_cd.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnItmGrpDwItmGrp_dw_itm_grp_nm.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.ItmGrpDwItmGrp_itm_p_PPanel.putStatus(ITM_GRP_SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnItmGrpDwItmGrp_row_sort_col.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpDwItmGrp_row_title_nm.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnItmGrpDwItmGrp_base_unit_dec_place.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpDwItmGrp_amt_dec_place.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpDwItmGrp_rate_dec_place.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpDwItmGrp_itm_grp_cd.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnItmGrpDwItmGrp_itm_grp2_key.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[ItmGrpItm]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_ItmGrpItm(MSBBP_SlsSumSrch p){
		p.ItmGrpItm_itm_p_PPanel.putStatus(ITM_GRP_SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnItmGrpItm_row_sort_col.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpItm_row_title_nm.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnItmGrpItm_base_unit_dec_place.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpItm_amt_dec_place.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpItm_rate_dec_place.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpItm_itm_grp_cd.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnItmGrpItm_itm_cd_key.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpItm_itm_sub1_key.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpItm_itm_sub2_key.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpItm_itm_sub3_key.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [ITM_GRP_SRCH]ステータスの[ItmGrpCst]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__SRCH_ItmGrpCst(MSBBP_SlsSumSrch p){
		p.columnItmGrpCst_cst_cd.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnItmGrpCst_cst_nm.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnItmGrpCst_row_sort_col.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpCst_row_title_nm.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnItmGrpCst_base_unit_dec_place.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpCst_amt_dec_place.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpCst_rate_dec_place.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);
		p.columnItmGrpCst_itm_grp_cd.putMode(p, ITM_GRP_SRCH, MCMode.READ_ONLY);
		p.columnItmGrpCst_cst_cd_key.putMode(p, ITM_GRP_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [ITM_GRP_REF]ステータスの[MainTab]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_MainTab(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_Rslt(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_REF]ステータスの[DptRslt]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_DptRslt(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_REF]ステータスの[ItmGrpRslt]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_ItmGrpRslt(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_REF]ステータスの[DptDwDptAll]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_DptDwDptAll(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_REF]ステータスの[DptSlsUsrAll]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_DptSlsUsrAll(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_REF]ステータスの[DptCstAll]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_DptCstAll(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_REF]ステータスの[ItmGrpDwItmGrpAll]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_ItmGrpDwItmGrpAll(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_REF]ステータスの[ItmGrpItmAll]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_ItmGrpItmAll(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_REF]ステータスの[ItmGrpCstAll]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_ItmGrpCstAll(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_REF]ステータスの[Dpt]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_Dpt(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_Cnd(MSBBP_SlsSumSrch p){
		p.Cnd_inpt_ym_d.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.Cnd_sls_trnst_disp_d.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.Cnd_sls_disp_term_d.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.Cnd_sum_term_d.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.Cnd_sls_bdg_grp_d.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.Cnd_xrate_cd_d.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.Cnd_xrate_nm_d.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.Cnd_use_act_xrate_flg_d.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.Cnd_dpt_lvl_cd_d.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.Cnd_dpt_lvl_nm_d.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.Cnd_dpt_cd_d.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.Cnd_dpt_nm_d.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.Cnd_inpt_ym_ig.putMode(p, ITM_GRP_REF, MCMode.REQUIRED);
		p.Cnd_sls_trnst_disp_ig.putMode(p, ITM_GRP_REF, MCMode.ENABLE);
		p.Cnd_sls_disp_term_ig.putMode(p, ITM_GRP_REF, MCMode.ENABLE);
		p.Cnd_sum_term_ig.putMode(p, ITM_GRP_REF, MCMode.ENABLE);
		p.Cnd_sls_bdg_grp_ig.putMode(p, ITM_GRP_REF, MCMode.ENABLE);
		p.Cnd_xrate_cd_ig.putMode(p, ITM_GRP_REF, MCMode.REQUIRED);
		p.Cnd_xrate_nm_ig.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.Cnd_use_act_xrate_flg_ig.putMode(p, ITM_GRP_REF, MCMode.ENABLE);
		p.Cnd_sls_itm_grp_lvl.putMode(p, ITM_GRP_REF, MCMode.REQUIRED);
		p.Cnd_sls_itm_grp_cd_ig.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.Cnd_sls_itm_grp_nm_ig.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);

	}

	/**
	 * [ITM_GRP_REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_Hdr(MSBBP_SlsSumSrch p){
		p.Hdr_base_cur_cd.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.Hdr_unit.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.Hdr_sls_flg.putMode(p, ITM_GRP_REF, MCMode.REQUIRED);
		p.Hdr_slo_bl_flg.putMode(p, ITM_GRP_REF, MCMode.REQUIRED);
		p.Hdr_slo_flg.putMode(p, ITM_GRP_REF, MCMode.REQUIRED);
		p.Hdr_spln_flg.putMode(p, ITM_GRP_REF, MCMode.REQUIRED);
		p.Hdr_spln_per_cmpl_sls_flg.putMode(p, ITM_GRP_REF, MCMode.REQUIRED);
		p.Hdr_bdg_flg.putMode(p, ITM_GRP_REF, MCMode.REQUIRED);
		p.Hdr_bdg_per_cmpl_sls_flg.putMode(p, ITM_GRP_REF, MCMode.REQUIRED);
		p.Hdr_prof_amt_flg.putMode(p, ITM_GRP_REF, MCMode.REQUIRED);
		p.Hdr_prof_rate_flg.putMode(p, ITM_GRP_REF, MCMode.REQUIRED);
		p.Hdr_big_num_rnd_typ.putMode(p, ITM_GRP_REF, MCMode.ENABLE);
		p.Hdr_big_num_rnd_typ_nm.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);

	}

	/**
	 * [ITM_GRP_REF]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_Dtl1(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_REF]ステータスの[DptDtl1]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_DptDtl1(MSBBP_SlsSumSrch p){
		p.columnDptDtl1_dpt_cd.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnDptDtl1_dpt_nm.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnDptDtl1_itm_grp_cd.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnDptDtl1_itm_grp_nm.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnDptDtl1_row_sort_col.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnDptDtl1_row_title_nm.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnDptDtl1_dpt1_key.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnDptDtl1_dpt_nm1_key.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);

	}

	/**
	 * [ITM_GRP_REF]ステータスの[DptDtlTab]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_DptDtlTab(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_REF]ステータスの[DptDtl]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_DptDtl(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_REF]ステータスの[DptDwDpt]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_DptDwDpt(MSBBP_SlsSumSrch p){
		p.columnDptDwDpt_dw_dpt_cd.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnDptDwDpt_dw_dpt_nm.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnDptDwDpt_row_sort_col.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnDptDwDpt_row_title_nm.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnDptDwDpt_dpt_cd.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnDptDwDpt_dpt_nm.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnDptDwDpt_dpt2_key.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnDptDwDpt_dpt_nm2_key.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);

	}

	/**
	 * [ITM_GRP_REF]ステータスの[DptSlsUsr]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_DptSlsUsr(MSBBP_SlsSumSrch p){
		p.columnDptSlsUsr_sls_usr_cd.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnDptSlsUsr_sls_usr_nm.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnDptSlsUsr_row_sort_col.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnDptSlsUsr_row_title_nm.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnDptSlsUsr_dpt_cd.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnDptSlsUsr_dpt_nm.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnDptSlsUsr_sls_usr_cd_key.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);

	}

	/**
	 * [ITM_GRP_REF]ステータスの[DptCst]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_DptCst(MSBBP_SlsSumSrch p){
		p.columnDptCst_cst_cd.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnDptCst_cst_nm.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnDptCst_row_sort_col.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnDptCst_row_title_nm.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnDptCst_dpt_cd.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnDptCst_dpt_nm.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnDptCst_cst_cd_key.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);

	}

	/**
	 * [ITM_GRP_REF]ステータスの[ItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_ItmGrp(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_REF]ステータスの[ItmGrpCnd]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_ItmGrpCnd(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_REF]ステータスの[ItmGrpHdr]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_ItmGrpHdr(MSBBP_SlsSumSrch p){
		p.ItmGrpHdr_base_cur_cd.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.ItmGrpHdr_base_cur_nm.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.ItmGrpHdr_unit.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.ItmGrpHdr_sls_flg.putMode(p, ITM_GRP_REF, MCMode.REQUIRED);
		p.ItmGrpHdr_slo_bl_flg.putMode(p, ITM_GRP_REF, MCMode.REQUIRED);
		p.ItmGrpHdr_slo_flg.putMode(p, ITM_GRP_REF, MCMode.REQUIRED);
		p.ItmGrpHdr_spln_flg.putMode(p, ITM_GRP_REF, MCMode.REQUIRED);
		p.ItmGrpHdr_spln_per_cmpl_sls_flg.putMode(p, ITM_GRP_REF, MCMode.REQUIRED);
		p.ItmGrpHdr_bdg_flg.putMode(p, ITM_GRP_REF, MCMode.REQUIRED);
		p.ItmGrpHdr_bdg_per_cmpl_sls_flg.putMode(p, ITM_GRP_REF, MCMode.REQUIRED);
		p.ItmGrpHdr_prof_amt_flg.putMode(p, ITM_GRP_REF, MCMode.REQUIRED);
		p.ItmGrpHdr_prof_rate_flg.putMode(p, ITM_GRP_REF, MCMode.REQUIRED);
		p.ItmGrpHdr_big_num_rnd_typ.putMode(p, ITM_GRP_REF, MCMode.ENABLE);
		p.ItmGrpHdr_big_num_rnd_typ_nm.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);

	}

	/**
	 * [ITM_GRP_REF]ステータスの[ItmGrpDtl1]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_ItmGrpDtl1(MSBBP_SlsSumSrch p){
		p.columnItmGrpDtl1_itm_grp_cd.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnItmGrpDtl1_itm_grp_nm.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnItmGrpDtl1_row_sort_col.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnItmGrpDtl1_row_title_nm.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnItmGrpDtl1_amt_dec_place.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnItmGrpDtl1_rate_dec_place.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnItmGrpDtl1_itm_grp1_key.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnItmGrpDtl1_itm_grp_nm1_key.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);

	}

	/**
	 * [ITM_GRP_REF]ステータスの[ItmGrpDtlTab]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_ItmGrpDtlTab(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_REF]ステータスの[ItmGrpDtl]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_ItmGrpDtl(MSBBP_SlsSumSrch p){

	}

	/**
	 * [ITM_GRP_REF]ステータスの[ItmGrpDwItmGrp]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_ItmGrpDwItmGrp(MSBBP_SlsSumSrch p){
		p.columnItmGrpDwItmGrp_dw_itm_grp_cd.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnItmGrpDwItmGrp_dw_itm_grp_nm.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.ItmGrpDwItmGrp_itm_p_PPanel.putStatus(ITM_GRP_REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnItmGrpDwItmGrp_row_sort_col.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnItmGrpDwItmGrp_row_title_nm.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnItmGrpDwItmGrp_base_unit_dec_place.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnItmGrpDwItmGrp_amt_dec_place.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnItmGrpDwItmGrp_rate_dec_place.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnItmGrpDwItmGrp_itm_grp_cd.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnItmGrpDwItmGrp_itm_grp2_key.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);

	}

	/**
	 * [ITM_GRP_REF]ステータスの[ItmGrpItm]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_ItmGrpItm(MSBBP_SlsSumSrch p){
		p.ItmGrpItm_itm_p_PPanel.putStatus(ITM_GRP_REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnItmGrpItm_row_sort_col.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnItmGrpItm_row_title_nm.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnItmGrpItm_base_unit_dec_place.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnItmGrpItm_amt_dec_place.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnItmGrpItm_rate_dec_place.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnItmGrpItm_itm_grp_cd.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnItmGrpItm_itm_cd_key.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnItmGrpItm_itm_sub1_key.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnItmGrpItm_itm_sub2_key.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnItmGrpItm_itm_sub3_key.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);

	}

	/**
	 * [ITM_GRP_REF]ステータスの[ItmGrpCst]ブロックのモードの設定
	 */
	protected static void statusInitITM__GRP__REF_ItmGrpCst(MSBBP_SlsSumSrch p){
		p.columnItmGrpCst_cst_cd.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnItmGrpCst_cst_nm.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnItmGrpCst_row_sort_col.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnItmGrpCst_row_title_nm.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnItmGrpCst_base_unit_dec_place.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnItmGrpCst_amt_dec_place.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnItmGrpCst_rate_dec_place.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);
		p.columnItmGrpCst_itm_grp_cd.putMode(p, ITM_GRP_REF, MCMode.READ_ONLY);
		p.columnItmGrpCst_cst_cd_key.putMode(p, ITM_GRP_REF, MCMode.INVISIBLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return DPT_SRCH;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBBP_SlsSumSrch_MC.setTableConfigDptDtl1((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.setTableConfigDptDwDpt((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.setTableConfigDptSlsUsr((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.setTableConfigDptCst((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.setTableConfigItmGrpDtl1((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.setTableConfigItmGrpDwItmGrp((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.setTableConfigItmGrpItm((MSBBP_SlsSumSrch)this);
		MSBBP_SlsSumSrch_MC.setTableConfigItmGrpCst((MSBBP_SlsSumSrch)this);
	}

	/**
	 * [DptDtl1]ブロックのTableの設定
	 */
	protected static void setTableConfigDptDtl1(MSBBP_SlsSumSrch p) {
		p.columnDptDtl1_dpt_cd.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.dpt_cd_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_dpt_cd);
		p.columnDptDtl1_dpt_nm.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.dpt_nm_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_dpt_nm);
		p.columnDptDtl1_itm_grp_cd.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.itm_grp_cd_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_itm_grp_cd);
		p.columnDptDtl1_itm_grp_nm.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.itm_grp_nm_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_itm_grp_nm);
		p.columnDptDtl1_row_sort_col.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.row_sort_col_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_row_sort_col);
		p.columnDptDtl1_row_title_nm.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.row_title_nm_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_row_title_nm);
		p.columnDptDtl1_slo.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.slo_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_slo);
		p.columnDptDtl1_slo_bl.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.slo_bl_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_slo_bl);
		p.columnDptDtl1_sls.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.sls_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_sls);
		p.columnDptDtl1_sum.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.sum_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_sum);
		p.columnDptDtl1_spln.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.spln_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_spln);
		p.columnDptDtl1_spln_per_cmpl_slo.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.spln_per_cmpl_slo_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_spln_per_cmpl_slo);
		p.columnDptDtl1_spln_per_cmpl_sls.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.spln_per_cmpl_sls_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_spln_per_cmpl_sls);
		p.columnDptDtl1_bdg_sls.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.bdg_sls_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_bdg_sls);
		p.columnDptDtl1_bdg_per_cmpl_slo.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.bdg_per_cmpl_slo_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_bdg_per_cmpl_slo);
		p.columnDptDtl1_bdg_per_cmpl_sls.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.bdg_per_cmpl_sls_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_bdg_per_cmpl_sls);
		p.columnDptDtl1_col_00.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_00_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_col_00);
		p.columnDptDtl1_col_01.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_01_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_col_01);
		p.columnDptDtl1_col_02.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_02_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_col_02);
		p.columnDptDtl1_col_03.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_03_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_col_03);
		p.columnDptDtl1_col_04.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_04_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_col_04);
		p.columnDptDtl1_col_05.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_05_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_col_05);
		p.columnDptDtl1_col_06.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_06_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_col_06);
		p.columnDptDtl1_col_07.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_07_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_col_07);
		p.columnDptDtl1_col_08.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_08_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_col_08);
		p.columnDptDtl1_col_09.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_09_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_col_09);
		p.columnDptDtl1_col_10.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_10_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_col_10);
		p.columnDptDtl1_col_11.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_11_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_col_11);
		p.columnDptDtl1_col_12.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_12_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_col_12);
		p.columnDptDtl1_col_13.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_13_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_col_13);
		p.columnDptDtl1_col_14.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_14_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_col_14);
		p.columnDptDtl1_col_15.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_15_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_col_15);
		p.columnDptDtl1_col_16.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_16_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_col_16);
		p.columnDptDtl1_col_17.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_17_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_col_17);
		p.columnDptDtl1_dpt1_key.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.dpt1_key_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_dpt1_key);
		p.columnDptDtl1_dpt_nm1_key.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.dpt_nm1_key_META);
		p.DptDtl1Table.addColumnConfig(p.columnDptDtl1_dpt_nm1_key);
		// スクロール固定カラムの指定
		p.DptDtl1Table.setUnscrollColumn(p.columnDptDtl1_row_title_nm);
	}

	/**
	 * [DptDwDpt]ブロックのTableの設定
	 */
	protected static void setTableConfigDptDwDpt(MSBBP_SlsSumSrch p) {
		p.columnDptDwDpt_dw_dpt_cd.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.dw_dpt_cd_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_dw_dpt_cd);
		p.columnDptDwDpt_dw_dpt_nm.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.dw_dpt_nm_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_dw_dpt_nm);
		p.columnDptDwDpt_row_sort_col.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.row_sort_col_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_row_sort_col);
		p.columnDptDwDpt_row_title_nm.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.row_title_nm_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_row_title_nm);
		p.columnDptDwDpt_slo.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.slo_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_slo);
		p.columnDptDwDpt_slo_bl.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.slo_bl_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_slo_bl);
		p.columnDptDwDpt_sls.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.sls_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_sls);
		p.columnDptDwDpt_sum.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.sum_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_sum);
		p.columnDptDwDpt_spln.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.spln_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_spln);
		p.columnDptDwDpt_spln_per_cmpl_slo.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.spln_per_cmpl_slo_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_spln_per_cmpl_slo);
		p.columnDptDwDpt_spln_per_cmpl_sls.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.spln_per_cmpl_sls_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_spln_per_cmpl_sls);
		p.columnDptDwDpt_bdg_sls.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.bdg_sls_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_bdg_sls);
		p.columnDptDwDpt_bdg_per_cmpl_slo.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.bdg_per_cmpl_slo_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_bdg_per_cmpl_slo);
		p.columnDptDwDpt_bdg_per_cmpl_sls.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.bdg_per_cmpl_sls_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_bdg_per_cmpl_sls);
		p.columnDptDwDpt_col_00.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_00_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_col_00);
		p.columnDptDwDpt_col_01.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_01_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_col_01);
		p.columnDptDwDpt_col_02.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_02_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_col_02);
		p.columnDptDwDpt_col_03.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_03_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_col_03);
		p.columnDptDwDpt_col_04.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_04_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_col_04);
		p.columnDptDwDpt_col_05.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_05_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_col_05);
		p.columnDptDwDpt_col_06.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_06_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_col_06);
		p.columnDptDwDpt_col_07.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_07_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_col_07);
		p.columnDptDwDpt_col_08.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_08_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_col_08);
		p.columnDptDwDpt_col_09.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_09_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_col_09);
		p.columnDptDwDpt_col_10.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_10_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_col_10);
		p.columnDptDwDpt_col_11.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_11_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_col_11);
		p.columnDptDwDpt_col_12.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_12_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_col_12);
		p.columnDptDwDpt_col_13.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_13_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_col_13);
		p.columnDptDwDpt_col_14.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_14_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_col_14);
		p.columnDptDwDpt_col_15.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_15_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_col_15);
		p.columnDptDwDpt_col_16.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_16_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_col_16);
		p.columnDptDwDpt_col_17.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_17_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_col_17);
		p.columnDptDwDpt_dpt_cd.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.dpt_cd_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_dpt_cd);
		p.columnDptDwDpt_dpt_nm.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.dpt_nm_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_dpt_nm);
		p.columnDptDwDpt_dpt2_key.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.dpt2_key_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_dpt2_key);
		p.columnDptDwDpt_dpt_nm2_key.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.dpt_nm2_key_META);
		p.DptDwDptTable.addColumnConfig(p.columnDptDwDpt_dpt_nm2_key);
		// スクロール固定カラムの指定
		p.DptDwDptTable.setUnscrollColumn(p.columnDptDwDpt_row_title_nm);
	}

	/**
	 * [DptSlsUsr]ブロックのTableの設定
	 */
	protected static void setTableConfigDptSlsUsr(MSBBP_SlsSumSrch p) {
		p.columnDptSlsUsr_sls_usr_cd.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.sls_usr_cd_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_sls_usr_cd);
		p.columnDptSlsUsr_sls_usr_nm.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.sls_usr_nm_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_sls_usr_nm);
		p.columnDptSlsUsr_row_sort_col.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.row_sort_col_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_row_sort_col);
		p.columnDptSlsUsr_row_title_nm.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.row_title_nm_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_row_title_nm);
		p.columnDptSlsUsr_slo.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.slo_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_slo);
		p.columnDptSlsUsr_slo_bl.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.slo_bl_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_slo_bl);
		p.columnDptSlsUsr_sls.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.sls_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_sls);
		p.columnDptSlsUsr_sum.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.sum_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_sum);
		p.columnDptSlsUsr_spln.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.spln_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_spln);
		p.columnDptSlsUsr_spln_per_cmpl_slo.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.spln_per_cmpl_slo_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_spln_per_cmpl_slo);
		p.columnDptSlsUsr_spln_per_cmpl_sls.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.spln_per_cmpl_sls_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_spln_per_cmpl_sls);
		p.columnDptSlsUsr_bdg_sls.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.bdg_sls_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_bdg_sls);
		p.columnDptSlsUsr_bdg_per_cmpl_slo.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.bdg_per_cmpl_slo_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_bdg_per_cmpl_slo);
		p.columnDptSlsUsr_bdg_per_cmpl_sls.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.bdg_per_cmpl_sls_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_bdg_per_cmpl_sls);
		p.columnDptSlsUsr_col_00.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_00_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_col_00);
		p.columnDptSlsUsr_col_01.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_01_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_col_01);
		p.columnDptSlsUsr_col_02.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_02_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_col_02);
		p.columnDptSlsUsr_col_03.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_03_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_col_03);
		p.columnDptSlsUsr_col_04.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_04_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_col_04);
		p.columnDptSlsUsr_col_05.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_05_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_col_05);
		p.columnDptSlsUsr_col_06.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_06_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_col_06);
		p.columnDptSlsUsr_col_07.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_07_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_col_07);
		p.columnDptSlsUsr_col_08.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_08_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_col_08);
		p.columnDptSlsUsr_col_09.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_09_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_col_09);
		p.columnDptSlsUsr_col_10.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_10_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_col_10);
		p.columnDptSlsUsr_col_11.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_11_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_col_11);
		p.columnDptSlsUsr_col_12.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_12_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_col_12);
		p.columnDptSlsUsr_col_13.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_13_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_col_13);
		p.columnDptSlsUsr_col_14.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_14_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_col_14);
		p.columnDptSlsUsr_col_15.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_15_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_col_15);
		p.columnDptSlsUsr_col_16.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_16_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_col_16);
		p.columnDptSlsUsr_col_17.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_17_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_col_17);
		p.columnDptSlsUsr_dpt_cd.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.dpt_cd_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_dpt_cd);
		p.columnDptSlsUsr_dpt_nm.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.dpt_nm_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_dpt_nm);
		p.columnDptSlsUsr_sls_usr_cd_key.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.sls_usr_cd_key_META);
		p.DptSlsUsrTable.addColumnConfig(p.columnDptSlsUsr_sls_usr_cd_key);
		// スクロール固定カラムの指定
		p.DptSlsUsrTable.setUnscrollColumn(p.columnDptSlsUsr_row_title_nm);
	}

	/**
	 * [DptCst]ブロックのTableの設定
	 */
	protected static void setTableConfigDptCst(MSBBP_SlsSumSrch p) {
		p.columnDptCst_cst_cd.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.cst_cd_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_cst_cd);
		p.columnDptCst_cst_nm.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.cst_nm_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_cst_nm);
		p.columnDptCst_row_sort_col.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.row_sort_col_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_row_sort_col);
		p.columnDptCst_row_title_nm.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.row_title_nm_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_row_title_nm);
		p.columnDptCst_slo.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.slo_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_slo);
		p.columnDptCst_slo_bl.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.slo_bl_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_slo_bl);
		p.columnDptCst_sls.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.sls_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_sls);
		p.columnDptCst_sum.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.sum_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_sum);
		p.columnDptCst_spln.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.spln_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_spln);
		p.columnDptCst_spln_per_cmpl_slo.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.spln_per_cmpl_slo_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_spln_per_cmpl_slo);
		p.columnDptCst_spln_per_cmpl_sls.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.spln_per_cmpl_sls_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_spln_per_cmpl_sls);
		p.columnDptCst_bdg_sls.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.bdg_sls_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_bdg_sls);
		p.columnDptCst_bdg_per_cmpl_slo.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.bdg_per_cmpl_slo_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_bdg_per_cmpl_slo);
		p.columnDptCst_bdg_per_cmpl_sls.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.bdg_per_cmpl_sls_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_bdg_per_cmpl_sls);
		p.columnDptCst_col_00.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_00_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_col_00);
		p.columnDptCst_col_01.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_01_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_col_01);
		p.columnDptCst_col_02.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_02_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_col_02);
		p.columnDptCst_col_03.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_03_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_col_03);
		p.columnDptCst_col_04.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_04_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_col_04);
		p.columnDptCst_col_05.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_05_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_col_05);
		p.columnDptCst_col_06.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_06_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_col_06);
		p.columnDptCst_col_07.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_07_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_col_07);
		p.columnDptCst_col_08.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_08_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_col_08);
		p.columnDptCst_col_09.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_09_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_col_09);
		p.columnDptCst_col_10.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_10_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_col_10);
		p.columnDptCst_col_11.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_11_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_col_11);
		p.columnDptCst_col_12.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_12_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_col_12);
		p.columnDptCst_col_13.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_13_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_col_13);
		p.columnDptCst_col_14.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_14_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_col_14);
		p.columnDptCst_col_15.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_15_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_col_15);
		p.columnDptCst_col_16.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_16_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_col_16);
		p.columnDptCst_col_17.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.col_17_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_col_17);
		p.columnDptCst_dpt_cd.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.dpt_cd_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_dpt_cd);
		p.columnDptCst_dpt_nm.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.dpt_nm_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_dpt_nm);
		p.columnDptCst_cst_cd_key.setMeta(mcframe.clientMSBB.MSBBP1400.DptDtlR.cst_cd_key_META);
		p.DptCstTable.addColumnConfig(p.columnDptCst_cst_cd_key);
		// スクロール固定カラムの指定
		p.DptCstTable.setUnscrollColumn(p.columnDptCst_row_title_nm);
	}

	/**
	 * [ItmGrpDtl1]ブロックのTableの設定
	 */
	protected static void setTableConfigItmGrpDtl1(MSBBP_SlsSumSrch p) {
		p.columnItmGrpDtl1_itm_grp_cd.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.itm_grp_cd_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_itm_grp_cd);
		p.columnItmGrpDtl1_itm_grp_nm.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.itm_grp_nm_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_itm_grp_nm);
		p.columnItmGrpDtl1_row_sort_col.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.row_sort_col_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_row_sort_col);
		p.columnItmGrpDtl1_row_title_nm.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.row_title_nm_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_row_title_nm);
		p.columnItmGrpDtl1_slo.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.slo_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_slo);
		p.columnItmGrpDtl1_slo_bl.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.slo_bl_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_slo_bl);
		p.columnItmGrpDtl1_sls.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.sls_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_sls);
		p.columnItmGrpDtl1_sum.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.sum_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_sum);
		p.columnItmGrpDtl1_spln.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.spln_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_spln);
		p.columnItmGrpDtl1_spln_per_cmpl_slo.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.spln_per_cmpl_slo_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_spln_per_cmpl_slo);
		p.columnItmGrpDtl1_spln_per_cmpl_sls.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.spln_per_cmpl_sls_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_spln_per_cmpl_sls);
		p.columnItmGrpDtl1_bdg_sls.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.bdg_sls_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_bdg_sls);
		p.columnItmGrpDtl1_bdg_per_cmpl_slo.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.bdg_per_cmpl_slo_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_bdg_per_cmpl_slo);
		p.columnItmGrpDtl1_bdg_per_cmpl_sls.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.bdg_per_cmpl_sls_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_bdg_per_cmpl_sls);
		p.columnItmGrpDtl1_col_00.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_00_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_col_00);
		p.columnItmGrpDtl1_col_01.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_01_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_col_01);
		p.columnItmGrpDtl1_col_02.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_02_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_col_02);
		p.columnItmGrpDtl1_col_03.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_03_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_col_03);
		p.columnItmGrpDtl1_col_04.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_04_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_col_04);
		p.columnItmGrpDtl1_col_05.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_05_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_col_05);
		p.columnItmGrpDtl1_col_06.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_06_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_col_06);
		p.columnItmGrpDtl1_col_07.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_07_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_col_07);
		p.columnItmGrpDtl1_col_08.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_08_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_col_08);
		p.columnItmGrpDtl1_col_09.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_09_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_col_09);
		p.columnItmGrpDtl1_col_10.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_10_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_col_10);
		p.columnItmGrpDtl1_col_11.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_11_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_col_11);
		p.columnItmGrpDtl1_col_12.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_12_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_col_12);
		p.columnItmGrpDtl1_col_13.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_13_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_col_13);
		p.columnItmGrpDtl1_col_14.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_14_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_col_14);
		p.columnItmGrpDtl1_col_15.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_15_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_col_15);
		p.columnItmGrpDtl1_col_16.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_16_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_col_16);
		p.columnItmGrpDtl1_col_17.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.col_17_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_col_17);
		p.columnItmGrpDtl1_amt_dec_place.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.amt_dec_place_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_amt_dec_place);
		p.columnItmGrpDtl1_rate_dec_place.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.rate_dec_place_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_rate_dec_place);
		p.columnItmGrpDtl1_itm_grp1_key.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.itm_grp1_key_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_itm_grp1_key);
		p.columnItmGrpDtl1_itm_grp_nm1_key.setMeta(mcframe.clientMSBB.MSBBP1400.Dtl1R.itm_grp_nm1_key_META);
		p.ItmGrpDtl1Table.addColumnConfig(p.columnItmGrpDtl1_itm_grp_nm1_key);
		// スクロール固定カラムの指定
		p.ItmGrpDtl1Table.setUnscrollColumn(p.columnItmGrpDtl1_row_title_nm);
	}

	/**
	 * [ItmGrpDwItmGrp]ブロックのTableの設定
	 */
	protected static void setTableConfigItmGrpDwItmGrp(MSBBP_SlsSumSrch p) {
		p.columnItmGrpDwItmGrp_dw_itm_grp_cd.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.dw_itm_grp_cd_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_dw_itm_grp_cd);
		p.columnItmGrpDwItmGrp_dw_itm_grp_nm.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.dw_itm_grp_nm_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_dw_itm_grp_nm);
		p.ItmGrpDwItmGrpTable.addTable(p.ItmGrpDwItmGrp_itm_p_PPanel.ItmTable);
		p.columnItmGrpDwItmGrp_row_sort_col.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.row_sort_col_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_row_sort_col);
		p.columnItmGrpDwItmGrp_row_title_nm.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.row_title_nm_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_row_title_nm);
		p.columnItmGrpDwItmGrp_slo.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.slo_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_slo);
		p.columnItmGrpDwItmGrp_slo_bl.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.slo_bl_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_slo_bl);
		p.columnItmGrpDwItmGrp_sls.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.sls_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_sls);
		p.columnItmGrpDwItmGrp_sum.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.sum_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_sum);
		p.columnItmGrpDwItmGrp_spln.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.spln_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_spln);
		p.columnItmGrpDwItmGrp_spln_per_cmpl_slo.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.spln_per_cmpl_slo_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_spln_per_cmpl_slo);
		p.columnItmGrpDwItmGrp_spln_per_cmpl_sls.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.spln_per_cmpl_sls_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_spln_per_cmpl_sls);
		p.columnItmGrpDwItmGrp_bdg_sls.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.bdg_sls_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_bdg_sls);
		p.columnItmGrpDwItmGrp_bdg_per_cmpl_slo.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.bdg_per_cmpl_slo_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_bdg_per_cmpl_slo);
		p.columnItmGrpDwItmGrp_bdg_per_cmpl_sls.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.bdg_per_cmpl_sls_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_bdg_per_cmpl_sls);
		p.columnItmGrpDwItmGrp_col_00.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_00_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_col_00);
		p.columnItmGrpDwItmGrp_col_01.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_01_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_col_01);
		p.columnItmGrpDwItmGrp_col_02.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_02_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_col_02);
		p.columnItmGrpDwItmGrp_col_03.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_03_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_col_03);
		p.columnItmGrpDwItmGrp_col_04.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_04_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_col_04);
		p.columnItmGrpDwItmGrp_col_05.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_05_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_col_05);
		p.columnItmGrpDwItmGrp_col_06.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_06_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_col_06);
		p.columnItmGrpDwItmGrp_col_07.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_07_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_col_07);
		p.columnItmGrpDwItmGrp_col_08.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_08_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_col_08);
		p.columnItmGrpDwItmGrp_col_09.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_09_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_col_09);
		p.columnItmGrpDwItmGrp_col_10.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_10_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_col_10);
		p.columnItmGrpDwItmGrp_col_11.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_11_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_col_11);
		p.columnItmGrpDwItmGrp_col_12.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_12_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_col_12);
		p.columnItmGrpDwItmGrp_col_13.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_13_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_col_13);
		p.columnItmGrpDwItmGrp_col_14.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_14_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_col_14);
		p.columnItmGrpDwItmGrp_col_15.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_15_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_col_15);
		p.columnItmGrpDwItmGrp_col_16.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_16_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_col_16);
		p.columnItmGrpDwItmGrp_col_17.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_17_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_col_17);
		p.columnItmGrpDwItmGrp_base_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.base_unit_dec_place_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_base_unit_dec_place);
		p.columnItmGrpDwItmGrp_amt_dec_place.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.amt_dec_place_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_amt_dec_place);
		p.columnItmGrpDwItmGrp_rate_dec_place.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.rate_dec_place_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_rate_dec_place);
		p.columnItmGrpDwItmGrp_itm_grp_cd.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.itm_grp_cd_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_itm_grp_cd);
		p.columnItmGrpDwItmGrp_itm_grp2_key.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.itm_grp2_key_META);
		p.ItmGrpDwItmGrpTable.addColumnConfig(p.columnItmGrpDwItmGrp_itm_grp2_key);
		// スクロール固定カラムの指定
		p.ItmGrpDwItmGrpTable.setUnscrollColumn(p.columnItmGrpDwItmGrp_row_title_nm);
	}

	/**
	 * [ItmGrpItm]ブロックのTableの設定
	 */
	protected static void setTableConfigItmGrpItm(MSBBP_SlsSumSrch p) {
		p.ItmGrpItmTable.addTable(p.ItmGrpItm_itm_p_PPanel.ItmTable);
		p.columnItmGrpItm_row_sort_col.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.row_sort_col_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_row_sort_col);
		p.columnItmGrpItm_row_title_nm.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.row_title_nm_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_row_title_nm);
		p.columnItmGrpItm_slo.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.slo_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_slo);
		p.columnItmGrpItm_slo_bl.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.slo_bl_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_slo_bl);
		p.columnItmGrpItm_sls.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.sls_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_sls);
		p.columnItmGrpItm_sum.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.sum_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_sum);
		p.columnItmGrpItm_spln.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.spln_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_spln);
		p.columnItmGrpItm_spln_per_cmpl_slo.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.spln_per_cmpl_slo_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_spln_per_cmpl_slo);
		p.columnItmGrpItm_spln_per_cmpl_sls.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.spln_per_cmpl_sls_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_spln_per_cmpl_sls);
		p.columnItmGrpItm_bdg_sls.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.bdg_sls_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_bdg_sls);
		p.columnItmGrpItm_bdg_per_cmpl_slo.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.bdg_per_cmpl_slo_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_bdg_per_cmpl_slo);
		p.columnItmGrpItm_bdg_per_cmpl_sls.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.bdg_per_cmpl_sls_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_bdg_per_cmpl_sls);
		p.columnItmGrpItm_col_00.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_00_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_col_00);
		p.columnItmGrpItm_col_01.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_01_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_col_01);
		p.columnItmGrpItm_col_02.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_02_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_col_02);
		p.columnItmGrpItm_col_03.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_03_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_col_03);
		p.columnItmGrpItm_col_04.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_04_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_col_04);
		p.columnItmGrpItm_col_05.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_05_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_col_05);
		p.columnItmGrpItm_col_06.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_06_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_col_06);
		p.columnItmGrpItm_col_07.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_07_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_col_07);
		p.columnItmGrpItm_col_08.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_08_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_col_08);
		p.columnItmGrpItm_col_09.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_09_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_col_09);
		p.columnItmGrpItm_col_10.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_10_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_col_10);
		p.columnItmGrpItm_col_11.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_11_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_col_11);
		p.columnItmGrpItm_col_12.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_12_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_col_12);
		p.columnItmGrpItm_col_13.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_13_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_col_13);
		p.columnItmGrpItm_col_14.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_14_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_col_14);
		p.columnItmGrpItm_col_15.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_15_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_col_15);
		p.columnItmGrpItm_col_16.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_16_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_col_16);
		p.columnItmGrpItm_col_17.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_17_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_col_17);
		p.columnItmGrpItm_base_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.base_unit_dec_place_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_base_unit_dec_place);
		p.columnItmGrpItm_amt_dec_place.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.amt_dec_place_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_amt_dec_place);
		p.columnItmGrpItm_rate_dec_place.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.rate_dec_place_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_rate_dec_place);
		p.columnItmGrpItm_itm_grp_cd.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.itm_grp_cd_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_itm_grp_cd);
		p.columnItmGrpItm_itm_cd_key.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.itm_cd_key_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_itm_cd_key);
		p.columnItmGrpItm_itm_sub1_key.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.itm_sub1_key_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_itm_sub1_key);
		p.columnItmGrpItm_itm_sub2_key.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.itm_sub2_key_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_itm_sub2_key);
		p.columnItmGrpItm_itm_sub3_key.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.itm_sub3_key_META);
		p.ItmGrpItmTable.addColumnConfig(p.columnItmGrpItm_itm_sub3_key);
		// スクロール固定カラムの指定
		p.ItmGrpItmTable.setUnscrollColumn(p.columnItmGrpItm_row_title_nm);
	}

	/**
	 * [ItmGrpCst]ブロックのTableの設定
	 */
	protected static void setTableConfigItmGrpCst(MSBBP_SlsSumSrch p) {
		p.columnItmGrpCst_cst_cd.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.cst_cd_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_cst_cd);
		p.columnItmGrpCst_cst_nm.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.cst_nm_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_cst_nm);
		p.columnItmGrpCst_row_sort_col.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.row_sort_col_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_row_sort_col);
		p.columnItmGrpCst_row_title_nm.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.row_title_nm_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_row_title_nm);
		p.columnItmGrpCst_slo.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.slo_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_slo);
		p.columnItmGrpCst_slo_bl.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.slo_bl_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_slo_bl);
		p.columnItmGrpCst_sls.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.sls_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_sls);
		p.columnItmGrpCst_sum.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.sum_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_sum);
		p.columnItmGrpCst_spln.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.spln_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_spln);
		p.columnItmGrpCst_spln_per_cmpl_slo.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.spln_per_cmpl_slo_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_spln_per_cmpl_slo);
		p.columnItmGrpCst_spln_per_cmpl_sls.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.spln_per_cmpl_sls_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_spln_per_cmpl_sls);
		p.columnItmGrpCst_bdg_sls.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.bdg_sls_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_bdg_sls);
		p.columnItmGrpCst_bdg_per_cmpl_slo.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.bdg_per_cmpl_slo_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_bdg_per_cmpl_slo);
		p.columnItmGrpCst_bdg_per_cmpl_sls.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.bdg_per_cmpl_sls_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_bdg_per_cmpl_sls);
		p.columnItmGrpCst_col_00.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_00_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_col_00);
		p.columnItmGrpCst_col_01.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_01_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_col_01);
		p.columnItmGrpCst_col_02.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_02_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_col_02);
		p.columnItmGrpCst_col_03.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_03_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_col_03);
		p.columnItmGrpCst_col_04.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_04_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_col_04);
		p.columnItmGrpCst_col_05.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_05_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_col_05);
		p.columnItmGrpCst_col_06.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_06_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_col_06);
		p.columnItmGrpCst_col_07.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_07_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_col_07);
		p.columnItmGrpCst_col_08.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_08_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_col_08);
		p.columnItmGrpCst_col_09.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_09_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_col_09);
		p.columnItmGrpCst_col_10.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_10_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_col_10);
		p.columnItmGrpCst_col_11.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_11_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_col_11);
		p.columnItmGrpCst_col_12.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_12_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_col_12);
		p.columnItmGrpCst_col_13.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_13_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_col_13);
		p.columnItmGrpCst_col_14.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_14_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_col_14);
		p.columnItmGrpCst_col_15.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_15_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_col_15);
		p.columnItmGrpCst_col_16.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_16_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_col_16);
		p.columnItmGrpCst_col_17.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.col_17_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_col_17);
		p.columnItmGrpCst_base_unit_dec_place.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.base_unit_dec_place_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_base_unit_dec_place);
		p.columnItmGrpCst_amt_dec_place.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.amt_dec_place_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_amt_dec_place);
		p.columnItmGrpCst_rate_dec_place.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.rate_dec_place_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_rate_dec_place);
		p.columnItmGrpCst_itm_grp_cd.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.itm_grp_cd_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_itm_grp_cd);
		p.columnItmGrpCst_cst_cd_key.setMeta(mcframe.clientMSBB.MSBBP1400.ItmGrpDtlR.cst_cd_key_META);
		p.ItmGrpCstTable.addColumnConfig(p.columnItmGrpCst_cst_cd_key);
		// スクロール固定カラムの指定
		p.ItmGrpCstTable.setUnscrollColumn(p.columnItmGrpCst_row_title_nm);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_sls_bdg_grp_d.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sls_bdg_grp_d.getListConfig().setPutter(getCnd_sls_bdg_grp_d_ListPutter());
		Cnd_xrate_cd_d.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_xrate_cd_d.getListConfig().setPutter(getCnd_xrate_cd_d_ListPutter());
		Cnd_dpt_lvl_cd_d.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dpt_lvl_cd_d.getListConfig().setPutter(getCnd_dpt_lvl_cd_d_ListPutter());
		Cnd_dpt_cd_d.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dpt_cd_d.getListConfig().setPutter(getCnd_dpt_cd_d_ListPutter());
		Cnd_sls_bdg_grp_ig.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sls_bdg_grp_ig.getListConfig().setPutter(getCnd_sls_bdg_grp_ig_ListPutter());
		Cnd_xrate_cd_ig.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_xrate_cd_ig.getListConfig().setPutter(getCnd_xrate_cd_ig_ListPutter());
		Cnd_sls_itm_grp_lvl.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sls_itm_grp_lvl.getListConfig().setPutter(getCnd_sls_itm_grp_lvl_ListPutter());
		Cnd_sls_itm_grp_cd_ig.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sls_itm_grp_cd_ig.getListConfig().setPutter(getCnd_sls_itm_grp_cd_ig_ListPutter());
		Hdr_big_num_rnd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_big_num_rnd_typ.getListConfig().setPutter(getHdr_big_num_rnd_typ_ListPutter());
		ItmGrpHdr_big_num_rnd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		ItmGrpHdr_big_num_rnd_typ.getListConfig().setPutter(getItmGrpHdr_big_num_rnd_typ_ListPutter());
	}

	/**
	 * この画面を[DPT_SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDPT_SRCHStatus() {
		status = DPT_SRCH;
		setAllStatus(status);
	}

	/**
	 * この画面を[DPT_REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDPT_REFStatus() {
		status = DPT_REF;
		setAllStatus(status);
	}

	/**
	 * この画面を[ITM_GRP_SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setITM_GRP_SRCHStatus() {
		status = ITM_GRP_SRCH;
		setAllStatus(status);
	}

	/**
	 * この画面を[ITM_GRP_REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setITM_GRP_REFStatus() {
		status = ITM_GRP_REF;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (DPT_SRCH.equals(status)) {
			setDPT_SRCHStatus();
		}
		else if (DPT_REF.equals(status)) {
			setDPT_REFStatus();
		}
		else if (ITM_GRP_SRCH.equals(status)) {
			setITM_GRP_SRCHStatus();
		}
		else if (ITM_GRP_REF.equals(status)) {
			setITM_GRP_REFStatus();
		}
	}

	/**
	 * [Cnd_sls_bdg_grp_d_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sls_bdg_grp_d_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.SlsBdgGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_xrate_cd_d_ListPutter]の作成
	 */
	protected MCListPutter createCnd_xrate_cd_d_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Xrate");
		return lp;
	}
	 
	/**
	 * [Cnd_dpt_lvl_cd_d_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dpt_lvl_cd_d_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DptLvl");
		return lp;
	}
	 
	/**
	 * [Cnd_dpt_cd_d_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dpt_cd_d_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_sls_bdg_grp_ig_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sls_bdg_grp_ig_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.SlsBdgGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_xrate_cd_ig_ListPutter]の作成
	 */
	protected MCListPutter createCnd_xrate_cd_ig_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Xrate");
		return lp;
	}
	 
	/**
	 * [Cnd_sls_itm_grp_lvl_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sls_itm_grp_lvl_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsItmGrpLvl");
		return lp;
	}
	 
	/**
	 * [Cnd_sls_itm_grp_cd_ig_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sls_itm_grp_cd_ig_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsItmGrpBtm");
		return lp;
	}
	 
	/**
	 * [Hdr_big_num_rnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_big_num_rnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BigNumRndTyp");
		return lp;
	}
	 
	/**
	 * [ItmGrpHdr_big_num_rnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createItmGrpHdr_big_num_rnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BigNumRndTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_sls_bdg_grp_d) return getCnd_sls_bdg_grp_d(row, info);
		if(combo == Cnd_xrate_cd_d) return getCnd_xrate_cd_d(row, info);
		if(combo == Cnd_dpt_lvl_cd_d) return getCnd_dpt_lvl_cd_d(row, info);
		if(combo == Cnd_dpt_cd_d) return getCnd_dpt_cd_d(row, info);
		if(combo == Cnd_sls_bdg_grp_ig) return getCnd_sls_bdg_grp_ig(row, info);
		if(combo == Cnd_xrate_cd_ig) return getCnd_xrate_cd_ig(row, info);
		if(combo == Cnd_sls_itm_grp_lvl) return getCnd_sls_itm_grp_lvl(row, info);
		if(combo == Cnd_sls_itm_grp_cd_ig) return getCnd_sls_itm_grp_cd_ig(row, info);
		if(combo == Hdr_big_num_rnd_typ) return getHdr_big_num_rnd_typ(row, info);
		if(combo == ItmGrpHdr_big_num_rnd_typ) return getItmGrpHdr_big_num_rnd_typ(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch_d) doCnd_srch_d(info);
		else if (ap == Cnd_srch_ig) doCnd_srch_ig(info);
	}

	/**
	 * [Cnd]パネルの[srch_d]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_d(MCEventInfo info);

	/**
	 * [Cnd]パネルの[srch_ig]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_ig(MCEventInfo info);

	/**
	 * ValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param vc イベント対象のGUI部品
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		if (!super.doVCEvent(vc, info)) {
			return false;
		}
		if (vc == MainTabTab) return doMainTab_VC(info);
		if (vc == DptDtl1Table) return doDptDtl1_VC(info);
		if (vc == DptDtlTabTab) return doDptDtlTab_VC(info);
		if (vc == DptDwDptTable) return doDptDwDpt_VC(info);
		if (vc == DptSlsUsrTable) return doDptSlsUsr_VC(info);
		if (vc == DptCstTable) return doDptCst_VC(info);
		if (vc == ItmGrpDtl1Table) return doItmGrpDtl1_VC(info);
		if (vc == ItmGrpDtlTabTab) return doItmGrpDtlTab_VC(info);
		if (vc == ItmGrpDwItmGrpTable) return doItmGrpDwItmGrp_VC(info);
		if (vc == ItmGrpItmTable) return doItmGrpItm_VC(info);
		if (vc == ItmGrpCstTable) return doItmGrpCst_VC(info);
		if (vc == Cnd_inpt_ym_d) return doCnd_inpt_ym_d_VC(info);
		if (vc == Cnd_sls_trnst_disp_d) return doCnd_sls_trnst_disp_d_VC(info);
		if (vc == Cnd_sls_disp_term_d) return doCnd_sls_disp_term_d_VC(info);
		if (vc == Cnd_sum_term_d) return doCnd_sum_term_d_VC(info);
		if (vc == Cnd_sls_bdg_grp_d) return doCnd_sls_bdg_grp_d_VC(info);
		if (vc == Cnd_xrate_cd_d) return doCnd_xrate_cd_d_VC(info);
		if (vc == Cnd_xrate_nm_d) return doCnd_xrate_nm_d_VC(info);
		if (vc == Cnd_use_act_xrate_flg_d) return doCnd_use_act_xrate_flg_d_VC(info);
		if (vc == Cnd_dpt_lvl_cd_d) return doCnd_dpt_lvl_cd_d_VC(info);
		if (vc == Cnd_dpt_lvl_nm_d) return doCnd_dpt_lvl_nm_d_VC(info);
		if (vc == Cnd_dpt_cd_d) return doCnd_dpt_cd_d_VC(info);
		if (vc == Cnd_dpt_nm_d) return doCnd_dpt_nm_d_VC(info);
		if (vc == Cnd_inpt_ym_ig) return doCnd_inpt_ym_ig_VC(info);
		if (vc == Cnd_sls_trnst_disp_ig) return doCnd_sls_trnst_disp_ig_VC(info);
		if (vc == Cnd_sls_disp_term_ig) return doCnd_sls_disp_term_ig_VC(info);
		if (vc == Cnd_sum_term_ig) return doCnd_sum_term_ig_VC(info);
		if (vc == Cnd_sls_bdg_grp_ig) return doCnd_sls_bdg_grp_ig_VC(info);
		if (vc == Cnd_xrate_cd_ig) return doCnd_xrate_cd_ig_VC(info);
		if (vc == Cnd_xrate_nm_ig) return doCnd_xrate_nm_ig_VC(info);
		if (vc == Cnd_use_act_xrate_flg_ig) return doCnd_use_act_xrate_flg_ig_VC(info);
		if (vc == Cnd_sls_itm_grp_lvl) return doCnd_sls_itm_grp_lvl_VC(info);
		if (vc == Cnd_sls_itm_grp_cd_ig) return doCnd_sls_itm_grp_cd_ig_VC(info);
		if (vc == Cnd_sls_itm_grp_nm_ig) return doCnd_sls_itm_grp_nm_ig_VC(info);
		if (vc == Hdr_base_cur_cd) return doHdr_base_cur_cd_VC(info);
		if (vc == Hdr_base_cur_nm) return doHdr_base_cur_nm_VC(info);
		if (vc == Hdr_unit) return doHdr_unit_VC(info);
		if (vc == Hdr_sls_flg) return doHdr_sls_flg_VC(info);
		if (vc == Hdr_slo_bl_flg) return doHdr_slo_bl_flg_VC(info);
		if (vc == Hdr_slo_flg) return doHdr_slo_flg_VC(info);
		if (vc == Hdr_spln_flg) return doHdr_spln_flg_VC(info);
		if (vc == Hdr_spln_per_cmpl_sls_flg) return doHdr_spln_per_cmpl_sls_flg_VC(info);
		if (vc == Hdr_bdg_flg) return doHdr_bdg_flg_VC(info);
		if (vc == Hdr_bdg_per_cmpl_sls_flg) return doHdr_bdg_per_cmpl_sls_flg_VC(info);
		if (vc == Hdr_prof_amt_flg) return doHdr_prof_amt_flg_VC(info);
		if (vc == Hdr_prof_rate_flg) return doHdr_prof_rate_flg_VC(info);
		if (vc == Hdr_big_num_rnd_typ) return doHdr_big_num_rnd_typ_VC(info);
		if (vc == Hdr_big_num_rnd_typ_nm) return doHdr_big_num_rnd_typ_nm_VC(info);
		if (vc == columnDptDtl1_dpt_cd) return doDptDtl1_dpt_cd_VC(info);
		if (vc == columnDptDtl1_dpt_nm) return doDptDtl1_dpt_nm_VC(info);
		if (vc == columnDptDtl1_itm_grp_cd) return doDptDtl1_itm_grp_cd_VC(info);
		if (vc == columnDptDtl1_itm_grp_nm) return doDptDtl1_itm_grp_nm_VC(info);
		if (vc == columnDptDtl1_row_sort_col) return doDptDtl1_row_sort_col_VC(info);
		if (vc == columnDptDtl1_row_title_nm) return doDptDtl1_row_title_nm_VC(info);
		if (vc == columnDptDtl1_slo) return doDptDtl1_slo_VC(info);
		if (vc == columnDptDtl1_slo_bl) return doDptDtl1_slo_bl_VC(info);
		if (vc == columnDptDtl1_sls) return doDptDtl1_sls_VC(info);
		if (vc == columnDptDtl1_sum) return doDptDtl1_sum_VC(info);
		if (vc == columnDptDtl1_spln) return doDptDtl1_spln_VC(info);
		if (vc == columnDptDtl1_spln_per_cmpl_slo) return doDptDtl1_spln_per_cmpl_slo_VC(info);
		if (vc == columnDptDtl1_spln_per_cmpl_sls) return doDptDtl1_spln_per_cmpl_sls_VC(info);
		if (vc == columnDptDtl1_bdg_sls) return doDptDtl1_bdg_sls_VC(info);
		if (vc == columnDptDtl1_bdg_per_cmpl_slo) return doDptDtl1_bdg_per_cmpl_slo_VC(info);
		if (vc == columnDptDtl1_bdg_per_cmpl_sls) return doDptDtl1_bdg_per_cmpl_sls_VC(info);
		if (vc == columnDptDtl1_col_00) return doDptDtl1_col_00_VC(info);
		if (vc == columnDptDtl1_col_01) return doDptDtl1_col_01_VC(info);
		if (vc == columnDptDtl1_col_02) return doDptDtl1_col_02_VC(info);
		if (vc == columnDptDtl1_col_03) return doDptDtl1_col_03_VC(info);
		if (vc == columnDptDtl1_col_04) return doDptDtl1_col_04_VC(info);
		if (vc == columnDptDtl1_col_05) return doDptDtl1_col_05_VC(info);
		if (vc == columnDptDtl1_col_06) return doDptDtl1_col_06_VC(info);
		if (vc == columnDptDtl1_col_07) return doDptDtl1_col_07_VC(info);
		if (vc == columnDptDtl1_col_08) return doDptDtl1_col_08_VC(info);
		if (vc == columnDptDtl1_col_09) return doDptDtl1_col_09_VC(info);
		if (vc == columnDptDtl1_col_10) return doDptDtl1_col_10_VC(info);
		if (vc == columnDptDtl1_col_11) return doDptDtl1_col_11_VC(info);
		if (vc == columnDptDtl1_col_12) return doDptDtl1_col_12_VC(info);
		if (vc == columnDptDtl1_col_13) return doDptDtl1_col_13_VC(info);
		if (vc == columnDptDtl1_col_14) return doDptDtl1_col_14_VC(info);
		if (vc == columnDptDtl1_col_15) return doDptDtl1_col_15_VC(info);
		if (vc == columnDptDtl1_col_16) return doDptDtl1_col_16_VC(info);
		if (vc == columnDptDtl1_col_17) return doDptDtl1_col_17_VC(info);
		if (vc == columnDptDtl1_dpt1_key) return doDptDtl1_dpt1_key_VC(info);
		if (vc == columnDptDtl1_dpt_nm1_key) return doDptDtl1_dpt_nm1_key_VC(info);
		if (vc == columnDptDwDpt_dw_dpt_cd) return doDptDwDpt_dw_dpt_cd_VC(info);
		if (vc == columnDptDwDpt_dw_dpt_nm) return doDptDwDpt_dw_dpt_nm_VC(info);
		if (vc == columnDptDwDpt_row_sort_col) return doDptDwDpt_row_sort_col_VC(info);
		if (vc == columnDptDwDpt_row_title_nm) return doDptDwDpt_row_title_nm_VC(info);
		if (vc == columnDptDwDpt_slo) return doDptDwDpt_slo_VC(info);
		if (vc == columnDptDwDpt_slo_bl) return doDptDwDpt_slo_bl_VC(info);
		if (vc == columnDptDwDpt_sls) return doDptDwDpt_sls_VC(info);
		if (vc == columnDptDwDpt_sum) return doDptDwDpt_sum_VC(info);
		if (vc == columnDptDwDpt_spln) return doDptDwDpt_spln_VC(info);
		if (vc == columnDptDwDpt_spln_per_cmpl_slo) return doDptDwDpt_spln_per_cmpl_slo_VC(info);
		if (vc == columnDptDwDpt_spln_per_cmpl_sls) return doDptDwDpt_spln_per_cmpl_sls_VC(info);
		if (vc == columnDptDwDpt_bdg_sls) return doDptDwDpt_bdg_sls_VC(info);
		if (vc == columnDptDwDpt_bdg_per_cmpl_slo) return doDptDwDpt_bdg_per_cmpl_slo_VC(info);
		if (vc == columnDptDwDpt_bdg_per_cmpl_sls) return doDptDwDpt_bdg_per_cmpl_sls_VC(info);
		if (vc == columnDptDwDpt_col_00) return doDptDwDpt_col_00_VC(info);
		if (vc == columnDptDwDpt_col_01) return doDptDwDpt_col_01_VC(info);
		if (vc == columnDptDwDpt_col_02) return doDptDwDpt_col_02_VC(info);
		if (vc == columnDptDwDpt_col_03) return doDptDwDpt_col_03_VC(info);
		if (vc == columnDptDwDpt_col_04) return doDptDwDpt_col_04_VC(info);
		if (vc == columnDptDwDpt_col_05) return doDptDwDpt_col_05_VC(info);
		if (vc == columnDptDwDpt_col_06) return doDptDwDpt_col_06_VC(info);
		if (vc == columnDptDwDpt_col_07) return doDptDwDpt_col_07_VC(info);
		if (vc == columnDptDwDpt_col_08) return doDptDwDpt_col_08_VC(info);
		if (vc == columnDptDwDpt_col_09) return doDptDwDpt_col_09_VC(info);
		if (vc == columnDptDwDpt_col_10) return doDptDwDpt_col_10_VC(info);
		if (vc == columnDptDwDpt_col_11) return doDptDwDpt_col_11_VC(info);
		if (vc == columnDptDwDpt_col_12) return doDptDwDpt_col_12_VC(info);
		if (vc == columnDptDwDpt_col_13) return doDptDwDpt_col_13_VC(info);
		if (vc == columnDptDwDpt_col_14) return doDptDwDpt_col_14_VC(info);
		if (vc == columnDptDwDpt_col_15) return doDptDwDpt_col_15_VC(info);
		if (vc == columnDptDwDpt_col_16) return doDptDwDpt_col_16_VC(info);
		if (vc == columnDptDwDpt_col_17) return doDptDwDpt_col_17_VC(info);
		if (vc == columnDptDwDpt_dpt_cd) return doDptDwDpt_dpt_cd_VC(info);
		if (vc == columnDptDwDpt_dpt_nm) return doDptDwDpt_dpt_nm_VC(info);
		if (vc == columnDptDwDpt_dpt2_key) return doDptDwDpt_dpt2_key_VC(info);
		if (vc == columnDptDwDpt_dpt_nm2_key) return doDptDwDpt_dpt_nm2_key_VC(info);
		if (vc == columnDptSlsUsr_sls_usr_cd) return doDptSlsUsr_sls_usr_cd_VC(info);
		if (vc == columnDptSlsUsr_sls_usr_nm) return doDptSlsUsr_sls_usr_nm_VC(info);
		if (vc == columnDptSlsUsr_row_sort_col) return doDptSlsUsr_row_sort_col_VC(info);
		if (vc == columnDptSlsUsr_row_title_nm) return doDptSlsUsr_row_title_nm_VC(info);
		if (vc == columnDptSlsUsr_slo) return doDptSlsUsr_slo_VC(info);
		if (vc == columnDptSlsUsr_slo_bl) return doDptSlsUsr_slo_bl_VC(info);
		if (vc == columnDptSlsUsr_sls) return doDptSlsUsr_sls_VC(info);
		if (vc == columnDptSlsUsr_sum) return doDptSlsUsr_sum_VC(info);
		if (vc == columnDptSlsUsr_spln) return doDptSlsUsr_spln_VC(info);
		if (vc == columnDptSlsUsr_spln_per_cmpl_slo) return doDptSlsUsr_spln_per_cmpl_slo_VC(info);
		if (vc == columnDptSlsUsr_spln_per_cmpl_sls) return doDptSlsUsr_spln_per_cmpl_sls_VC(info);
		if (vc == columnDptSlsUsr_bdg_sls) return doDptSlsUsr_bdg_sls_VC(info);
		if (vc == columnDptSlsUsr_bdg_per_cmpl_slo) return doDptSlsUsr_bdg_per_cmpl_slo_VC(info);
		if (vc == columnDptSlsUsr_bdg_per_cmpl_sls) return doDptSlsUsr_bdg_per_cmpl_sls_VC(info);
		if (vc == columnDptSlsUsr_col_00) return doDptSlsUsr_col_00_VC(info);
		if (vc == columnDptSlsUsr_col_01) return doDptSlsUsr_col_01_VC(info);
		if (vc == columnDptSlsUsr_col_02) return doDptSlsUsr_col_02_VC(info);
		if (vc == columnDptSlsUsr_col_03) return doDptSlsUsr_col_03_VC(info);
		if (vc == columnDptSlsUsr_col_04) return doDptSlsUsr_col_04_VC(info);
		if (vc == columnDptSlsUsr_col_05) return doDptSlsUsr_col_05_VC(info);
		if (vc == columnDptSlsUsr_col_06) return doDptSlsUsr_col_06_VC(info);
		if (vc == columnDptSlsUsr_col_07) return doDptSlsUsr_col_07_VC(info);
		if (vc == columnDptSlsUsr_col_08) return doDptSlsUsr_col_08_VC(info);
		if (vc == columnDptSlsUsr_col_09) return doDptSlsUsr_col_09_VC(info);
		if (vc == columnDptSlsUsr_col_10) return doDptSlsUsr_col_10_VC(info);
		if (vc == columnDptSlsUsr_col_11) return doDptSlsUsr_col_11_VC(info);
		if (vc == columnDptSlsUsr_col_12) return doDptSlsUsr_col_12_VC(info);
		if (vc == columnDptSlsUsr_col_13) return doDptSlsUsr_col_13_VC(info);
		if (vc == columnDptSlsUsr_col_14) return doDptSlsUsr_col_14_VC(info);
		if (vc == columnDptSlsUsr_col_15) return doDptSlsUsr_col_15_VC(info);
		if (vc == columnDptSlsUsr_col_16) return doDptSlsUsr_col_16_VC(info);
		if (vc == columnDptSlsUsr_col_17) return doDptSlsUsr_col_17_VC(info);
		if (vc == columnDptSlsUsr_dpt_cd) return doDptSlsUsr_dpt_cd_VC(info);
		if (vc == columnDptSlsUsr_dpt_nm) return doDptSlsUsr_dpt_nm_VC(info);
		if (vc == columnDptSlsUsr_sls_usr_cd_key) return doDptSlsUsr_sls_usr_cd_key_VC(info);
		if (vc == columnDptCst_cst_cd) return doDptCst_cst_cd_VC(info);
		if (vc == columnDptCst_cst_nm) return doDptCst_cst_nm_VC(info);
		if (vc == columnDptCst_row_sort_col) return doDptCst_row_sort_col_VC(info);
		if (vc == columnDptCst_row_title_nm) return doDptCst_row_title_nm_VC(info);
		if (vc == columnDptCst_slo) return doDptCst_slo_VC(info);
		if (vc == columnDptCst_slo_bl) return doDptCst_slo_bl_VC(info);
		if (vc == columnDptCst_sls) return doDptCst_sls_VC(info);
		if (vc == columnDptCst_sum) return doDptCst_sum_VC(info);
		if (vc == columnDptCst_spln) return doDptCst_spln_VC(info);
		if (vc == columnDptCst_spln_per_cmpl_slo) return doDptCst_spln_per_cmpl_slo_VC(info);
		if (vc == columnDptCst_spln_per_cmpl_sls) return doDptCst_spln_per_cmpl_sls_VC(info);
		if (vc == columnDptCst_bdg_sls) return doDptCst_bdg_sls_VC(info);
		if (vc == columnDptCst_bdg_per_cmpl_slo) return doDptCst_bdg_per_cmpl_slo_VC(info);
		if (vc == columnDptCst_bdg_per_cmpl_sls) return doDptCst_bdg_per_cmpl_sls_VC(info);
		if (vc == columnDptCst_col_00) return doDptCst_col_00_VC(info);
		if (vc == columnDptCst_col_01) return doDptCst_col_01_VC(info);
		if (vc == columnDptCst_col_02) return doDptCst_col_02_VC(info);
		if (vc == columnDptCst_col_03) return doDptCst_col_03_VC(info);
		if (vc == columnDptCst_col_04) return doDptCst_col_04_VC(info);
		if (vc == columnDptCst_col_05) return doDptCst_col_05_VC(info);
		if (vc == columnDptCst_col_06) return doDptCst_col_06_VC(info);
		if (vc == columnDptCst_col_07) return doDptCst_col_07_VC(info);
		if (vc == columnDptCst_col_08) return doDptCst_col_08_VC(info);
		if (vc == columnDptCst_col_09) return doDptCst_col_09_VC(info);
		if (vc == columnDptCst_col_10) return doDptCst_col_10_VC(info);
		if (vc == columnDptCst_col_11) return doDptCst_col_11_VC(info);
		if (vc == columnDptCst_col_12) return doDptCst_col_12_VC(info);
		if (vc == columnDptCst_col_13) return doDptCst_col_13_VC(info);
		if (vc == columnDptCst_col_14) return doDptCst_col_14_VC(info);
		if (vc == columnDptCst_col_15) return doDptCst_col_15_VC(info);
		if (vc == columnDptCst_col_16) return doDptCst_col_16_VC(info);
		if (vc == columnDptCst_col_17) return doDptCst_col_17_VC(info);
		if (vc == columnDptCst_dpt_cd) return doDptCst_dpt_cd_VC(info);
		if (vc == columnDptCst_dpt_nm) return doDptCst_dpt_nm_VC(info);
		if (vc == columnDptCst_cst_cd_key) return doDptCst_cst_cd_key_VC(info);
		if (vc == ItmGrpHdr_base_cur_cd) return doItmGrpHdr_base_cur_cd_VC(info);
		if (vc == ItmGrpHdr_base_cur_nm) return doItmGrpHdr_base_cur_nm_VC(info);
		if (vc == ItmGrpHdr_unit) return doItmGrpHdr_unit_VC(info);
		if (vc == ItmGrpHdr_sls_flg) return doItmGrpHdr_sls_flg_VC(info);
		if (vc == ItmGrpHdr_slo_bl_flg) return doItmGrpHdr_slo_bl_flg_VC(info);
		if (vc == ItmGrpHdr_slo_flg) return doItmGrpHdr_slo_flg_VC(info);
		if (vc == ItmGrpHdr_spln_flg) return doItmGrpHdr_spln_flg_VC(info);
		if (vc == ItmGrpHdr_spln_per_cmpl_sls_flg) return doItmGrpHdr_spln_per_cmpl_sls_flg_VC(info);
		if (vc == ItmGrpHdr_bdg_flg) return doItmGrpHdr_bdg_flg_VC(info);
		if (vc == ItmGrpHdr_bdg_per_cmpl_sls_flg) return doItmGrpHdr_bdg_per_cmpl_sls_flg_VC(info);
		if (vc == ItmGrpHdr_prof_amt_flg) return doItmGrpHdr_prof_amt_flg_VC(info);
		if (vc == ItmGrpHdr_prof_rate_flg) return doItmGrpHdr_prof_rate_flg_VC(info);
		if (vc == ItmGrpHdr_big_num_rnd_typ) return doItmGrpHdr_big_num_rnd_typ_VC(info);
		if (vc == ItmGrpHdr_big_num_rnd_typ_nm) return doItmGrpHdr_big_num_rnd_typ_nm_VC(info);
		if (vc == columnItmGrpDtl1_itm_grp_cd) return doItmGrpDtl1_itm_grp_cd_VC(info);
		if (vc == columnItmGrpDtl1_itm_grp_nm) return doItmGrpDtl1_itm_grp_nm_VC(info);
		if (vc == columnItmGrpDtl1_row_sort_col) return doItmGrpDtl1_row_sort_col_VC(info);
		if (vc == columnItmGrpDtl1_row_title_nm) return doItmGrpDtl1_row_title_nm_VC(info);
		if (vc == columnItmGrpDtl1_slo) return doItmGrpDtl1_slo_VC(info);
		if (vc == columnItmGrpDtl1_slo_bl) return doItmGrpDtl1_slo_bl_VC(info);
		if (vc == columnItmGrpDtl1_sls) return doItmGrpDtl1_sls_VC(info);
		if (vc == columnItmGrpDtl1_sum) return doItmGrpDtl1_sum_VC(info);
		if (vc == columnItmGrpDtl1_spln) return doItmGrpDtl1_spln_VC(info);
		if (vc == columnItmGrpDtl1_spln_per_cmpl_slo) return doItmGrpDtl1_spln_per_cmpl_slo_VC(info);
		if (vc == columnItmGrpDtl1_spln_per_cmpl_sls) return doItmGrpDtl1_spln_per_cmpl_sls_VC(info);
		if (vc == columnItmGrpDtl1_bdg_sls) return doItmGrpDtl1_bdg_sls_VC(info);
		if (vc == columnItmGrpDtl1_bdg_per_cmpl_slo) return doItmGrpDtl1_bdg_per_cmpl_slo_VC(info);
		if (vc == columnItmGrpDtl1_bdg_per_cmpl_sls) return doItmGrpDtl1_bdg_per_cmpl_sls_VC(info);
		if (vc == columnItmGrpDtl1_col_00) return doItmGrpDtl1_col_00_VC(info);
		if (vc == columnItmGrpDtl1_col_01) return doItmGrpDtl1_col_01_VC(info);
		if (vc == columnItmGrpDtl1_col_02) return doItmGrpDtl1_col_02_VC(info);
		if (vc == columnItmGrpDtl1_col_03) return doItmGrpDtl1_col_03_VC(info);
		if (vc == columnItmGrpDtl1_col_04) return doItmGrpDtl1_col_04_VC(info);
		if (vc == columnItmGrpDtl1_col_05) return doItmGrpDtl1_col_05_VC(info);
		if (vc == columnItmGrpDtl1_col_06) return doItmGrpDtl1_col_06_VC(info);
		if (vc == columnItmGrpDtl1_col_07) return doItmGrpDtl1_col_07_VC(info);
		if (vc == columnItmGrpDtl1_col_08) return doItmGrpDtl1_col_08_VC(info);
		if (vc == columnItmGrpDtl1_col_09) return doItmGrpDtl1_col_09_VC(info);
		if (vc == columnItmGrpDtl1_col_10) return doItmGrpDtl1_col_10_VC(info);
		if (vc == columnItmGrpDtl1_col_11) return doItmGrpDtl1_col_11_VC(info);
		if (vc == columnItmGrpDtl1_col_12) return doItmGrpDtl1_col_12_VC(info);
		if (vc == columnItmGrpDtl1_col_13) return doItmGrpDtl1_col_13_VC(info);
		if (vc == columnItmGrpDtl1_col_14) return doItmGrpDtl1_col_14_VC(info);
		if (vc == columnItmGrpDtl1_col_15) return doItmGrpDtl1_col_15_VC(info);
		if (vc == columnItmGrpDtl1_col_16) return doItmGrpDtl1_col_16_VC(info);
		if (vc == columnItmGrpDtl1_col_17) return doItmGrpDtl1_col_17_VC(info);
		if (vc == columnItmGrpDtl1_amt_dec_place) return doItmGrpDtl1_amt_dec_place_VC(info);
		if (vc == columnItmGrpDtl1_rate_dec_place) return doItmGrpDtl1_rate_dec_place_VC(info);
		if (vc == columnItmGrpDtl1_itm_grp1_key) return doItmGrpDtl1_itm_grp1_key_VC(info);
		if (vc == columnItmGrpDtl1_itm_grp_nm1_key) return doItmGrpDtl1_itm_grp_nm1_key_VC(info);
		if (vc == columnItmGrpDwItmGrp_dw_itm_grp_cd) return doItmGrpDwItmGrp_dw_itm_grp_cd_VC(info);
		if (vc == columnItmGrpDwItmGrp_dw_itm_grp_nm) return doItmGrpDwItmGrp_dw_itm_grp_nm_VC(info);
		if (vc == columnItmGrpDwItmGrp_row_sort_col) return doItmGrpDwItmGrp_row_sort_col_VC(info);
		if (vc == columnItmGrpDwItmGrp_row_title_nm) return doItmGrpDwItmGrp_row_title_nm_VC(info);
		if (vc == columnItmGrpDwItmGrp_slo) return doItmGrpDwItmGrp_slo_VC(info);
		if (vc == columnItmGrpDwItmGrp_slo_bl) return doItmGrpDwItmGrp_slo_bl_VC(info);
		if (vc == columnItmGrpDwItmGrp_sls) return doItmGrpDwItmGrp_sls_VC(info);
		if (vc == columnItmGrpDwItmGrp_sum) return doItmGrpDwItmGrp_sum_VC(info);
		if (vc == columnItmGrpDwItmGrp_spln) return doItmGrpDwItmGrp_spln_VC(info);
		if (vc == columnItmGrpDwItmGrp_spln_per_cmpl_slo) return doItmGrpDwItmGrp_spln_per_cmpl_slo_VC(info);
		if (vc == columnItmGrpDwItmGrp_spln_per_cmpl_sls) return doItmGrpDwItmGrp_spln_per_cmpl_sls_VC(info);
		if (vc == columnItmGrpDwItmGrp_bdg_sls) return doItmGrpDwItmGrp_bdg_sls_VC(info);
		if (vc == columnItmGrpDwItmGrp_bdg_per_cmpl_slo) return doItmGrpDwItmGrp_bdg_per_cmpl_slo_VC(info);
		if (vc == columnItmGrpDwItmGrp_bdg_per_cmpl_sls) return doItmGrpDwItmGrp_bdg_per_cmpl_sls_VC(info);
		if (vc == columnItmGrpDwItmGrp_col_00) return doItmGrpDwItmGrp_col_00_VC(info);
		if (vc == columnItmGrpDwItmGrp_col_01) return doItmGrpDwItmGrp_col_01_VC(info);
		if (vc == columnItmGrpDwItmGrp_col_02) return doItmGrpDwItmGrp_col_02_VC(info);
		if (vc == columnItmGrpDwItmGrp_col_03) return doItmGrpDwItmGrp_col_03_VC(info);
		if (vc == columnItmGrpDwItmGrp_col_04) return doItmGrpDwItmGrp_col_04_VC(info);
		if (vc == columnItmGrpDwItmGrp_col_05) return doItmGrpDwItmGrp_col_05_VC(info);
		if (vc == columnItmGrpDwItmGrp_col_06) return doItmGrpDwItmGrp_col_06_VC(info);
		if (vc == columnItmGrpDwItmGrp_col_07) return doItmGrpDwItmGrp_col_07_VC(info);
		if (vc == columnItmGrpDwItmGrp_col_08) return doItmGrpDwItmGrp_col_08_VC(info);
		if (vc == columnItmGrpDwItmGrp_col_09) return doItmGrpDwItmGrp_col_09_VC(info);
		if (vc == columnItmGrpDwItmGrp_col_10) return doItmGrpDwItmGrp_col_10_VC(info);
		if (vc == columnItmGrpDwItmGrp_col_11) return doItmGrpDwItmGrp_col_11_VC(info);
		if (vc == columnItmGrpDwItmGrp_col_12) return doItmGrpDwItmGrp_col_12_VC(info);
		if (vc == columnItmGrpDwItmGrp_col_13) return doItmGrpDwItmGrp_col_13_VC(info);
		if (vc == columnItmGrpDwItmGrp_col_14) return doItmGrpDwItmGrp_col_14_VC(info);
		if (vc == columnItmGrpDwItmGrp_col_15) return doItmGrpDwItmGrp_col_15_VC(info);
		if (vc == columnItmGrpDwItmGrp_col_16) return doItmGrpDwItmGrp_col_16_VC(info);
		if (vc == columnItmGrpDwItmGrp_col_17) return doItmGrpDwItmGrp_col_17_VC(info);
		if (vc == columnItmGrpDwItmGrp_base_unit_dec_place) return doItmGrpDwItmGrp_base_unit_dec_place_VC(info);
		if (vc == columnItmGrpDwItmGrp_amt_dec_place) return doItmGrpDwItmGrp_amt_dec_place_VC(info);
		if (vc == columnItmGrpDwItmGrp_rate_dec_place) return doItmGrpDwItmGrp_rate_dec_place_VC(info);
		if (vc == columnItmGrpDwItmGrp_itm_grp_cd) return doItmGrpDwItmGrp_itm_grp_cd_VC(info);
		if (vc == columnItmGrpDwItmGrp_itm_grp2_key) return doItmGrpDwItmGrp_itm_grp2_key_VC(info);
		if (vc == columnItmGrpItm_row_sort_col) return doItmGrpItm_row_sort_col_VC(info);
		if (vc == columnItmGrpItm_row_title_nm) return doItmGrpItm_row_title_nm_VC(info);
		if (vc == columnItmGrpItm_slo) return doItmGrpItm_slo_VC(info);
		if (vc == columnItmGrpItm_slo_bl) return doItmGrpItm_slo_bl_VC(info);
		if (vc == columnItmGrpItm_sls) return doItmGrpItm_sls_VC(info);
		if (vc == columnItmGrpItm_sum) return doItmGrpItm_sum_VC(info);
		if (vc == columnItmGrpItm_spln) return doItmGrpItm_spln_VC(info);
		if (vc == columnItmGrpItm_spln_per_cmpl_slo) return doItmGrpItm_spln_per_cmpl_slo_VC(info);
		if (vc == columnItmGrpItm_spln_per_cmpl_sls) return doItmGrpItm_spln_per_cmpl_sls_VC(info);
		if (vc == columnItmGrpItm_bdg_sls) return doItmGrpItm_bdg_sls_VC(info);
		if (vc == columnItmGrpItm_bdg_per_cmpl_slo) return doItmGrpItm_bdg_per_cmpl_slo_VC(info);
		if (vc == columnItmGrpItm_bdg_per_cmpl_sls) return doItmGrpItm_bdg_per_cmpl_sls_VC(info);
		if (vc == columnItmGrpItm_col_00) return doItmGrpItm_col_00_VC(info);
		if (vc == columnItmGrpItm_col_01) return doItmGrpItm_col_01_VC(info);
		if (vc == columnItmGrpItm_col_02) return doItmGrpItm_col_02_VC(info);
		if (vc == columnItmGrpItm_col_03) return doItmGrpItm_col_03_VC(info);
		if (vc == columnItmGrpItm_col_04) return doItmGrpItm_col_04_VC(info);
		if (vc == columnItmGrpItm_col_05) return doItmGrpItm_col_05_VC(info);
		if (vc == columnItmGrpItm_col_06) return doItmGrpItm_col_06_VC(info);
		if (vc == columnItmGrpItm_col_07) return doItmGrpItm_col_07_VC(info);
		if (vc == columnItmGrpItm_col_08) return doItmGrpItm_col_08_VC(info);
		if (vc == columnItmGrpItm_col_09) return doItmGrpItm_col_09_VC(info);
		if (vc == columnItmGrpItm_col_10) return doItmGrpItm_col_10_VC(info);
		if (vc == columnItmGrpItm_col_11) return doItmGrpItm_col_11_VC(info);
		if (vc == columnItmGrpItm_col_12) return doItmGrpItm_col_12_VC(info);
		if (vc == columnItmGrpItm_col_13) return doItmGrpItm_col_13_VC(info);
		if (vc == columnItmGrpItm_col_14) return doItmGrpItm_col_14_VC(info);
		if (vc == columnItmGrpItm_col_15) return doItmGrpItm_col_15_VC(info);
		if (vc == columnItmGrpItm_col_16) return doItmGrpItm_col_16_VC(info);
		if (vc == columnItmGrpItm_col_17) return doItmGrpItm_col_17_VC(info);
		if (vc == columnItmGrpItm_base_unit_dec_place) return doItmGrpItm_base_unit_dec_place_VC(info);
		if (vc == columnItmGrpItm_amt_dec_place) return doItmGrpItm_amt_dec_place_VC(info);
		if (vc == columnItmGrpItm_rate_dec_place) return doItmGrpItm_rate_dec_place_VC(info);
		if (vc == columnItmGrpItm_itm_grp_cd) return doItmGrpItm_itm_grp_cd_VC(info);
		if (vc == columnItmGrpItm_itm_cd_key) return doItmGrpItm_itm_cd_key_VC(info);
		if (vc == columnItmGrpItm_itm_sub1_key) return doItmGrpItm_itm_sub1_key_VC(info);
		if (vc == columnItmGrpItm_itm_sub2_key) return doItmGrpItm_itm_sub2_key_VC(info);
		if (vc == columnItmGrpItm_itm_sub3_key) return doItmGrpItm_itm_sub3_key_VC(info);
		if (vc == columnItmGrpCst_cst_cd) return doItmGrpCst_cst_cd_VC(info);
		if (vc == columnItmGrpCst_cst_nm) return doItmGrpCst_cst_nm_VC(info);
		if (vc == columnItmGrpCst_row_sort_col) return doItmGrpCst_row_sort_col_VC(info);
		if (vc == columnItmGrpCst_row_title_nm) return doItmGrpCst_row_title_nm_VC(info);
		if (vc == columnItmGrpCst_slo) return doItmGrpCst_slo_VC(info);
		if (vc == columnItmGrpCst_slo_bl) return doItmGrpCst_slo_bl_VC(info);
		if (vc == columnItmGrpCst_sls) return doItmGrpCst_sls_VC(info);
		if (vc == columnItmGrpCst_sum) return doItmGrpCst_sum_VC(info);
		if (vc == columnItmGrpCst_spln) return doItmGrpCst_spln_VC(info);
		if (vc == columnItmGrpCst_spln_per_cmpl_slo) return doItmGrpCst_spln_per_cmpl_slo_VC(info);
		if (vc == columnItmGrpCst_spln_per_cmpl_sls) return doItmGrpCst_spln_per_cmpl_sls_VC(info);
		if (vc == columnItmGrpCst_bdg_sls) return doItmGrpCst_bdg_sls_VC(info);
		if (vc == columnItmGrpCst_bdg_per_cmpl_slo) return doItmGrpCst_bdg_per_cmpl_slo_VC(info);
		if (vc == columnItmGrpCst_bdg_per_cmpl_sls) return doItmGrpCst_bdg_per_cmpl_sls_VC(info);
		if (vc == columnItmGrpCst_col_00) return doItmGrpCst_col_00_VC(info);
		if (vc == columnItmGrpCst_col_01) return doItmGrpCst_col_01_VC(info);
		if (vc == columnItmGrpCst_col_02) return doItmGrpCst_col_02_VC(info);
		if (vc == columnItmGrpCst_col_03) return doItmGrpCst_col_03_VC(info);
		if (vc == columnItmGrpCst_col_04) return doItmGrpCst_col_04_VC(info);
		if (vc == columnItmGrpCst_col_05) return doItmGrpCst_col_05_VC(info);
		if (vc == columnItmGrpCst_col_06) return doItmGrpCst_col_06_VC(info);
		if (vc == columnItmGrpCst_col_07) return doItmGrpCst_col_07_VC(info);
		if (vc == columnItmGrpCst_col_08) return doItmGrpCst_col_08_VC(info);
		if (vc == columnItmGrpCst_col_09) return doItmGrpCst_col_09_VC(info);
		if (vc == columnItmGrpCst_col_10) return doItmGrpCst_col_10_VC(info);
		if (vc == columnItmGrpCst_col_11) return doItmGrpCst_col_11_VC(info);
		if (vc == columnItmGrpCst_col_12) return doItmGrpCst_col_12_VC(info);
		if (vc == columnItmGrpCst_col_13) return doItmGrpCst_col_13_VC(info);
		if (vc == columnItmGrpCst_col_14) return doItmGrpCst_col_14_VC(info);
		if (vc == columnItmGrpCst_col_15) return doItmGrpCst_col_15_VC(info);
		if (vc == columnItmGrpCst_col_16) return doItmGrpCst_col_16_VC(info);
		if (vc == columnItmGrpCst_col_17) return doItmGrpCst_col_17_VC(info);
		if (vc == columnItmGrpCst_base_unit_dec_place) return doItmGrpCst_base_unit_dec_place_VC(info);
		if (vc == columnItmGrpCst_amt_dec_place) return doItmGrpCst_amt_dec_place_VC(info);
		if (vc == columnItmGrpCst_rate_dec_place) return doItmGrpCst_rate_dec_place_VC(info);
		if (vc == columnItmGrpCst_itm_grp_cd) return doItmGrpCst_itm_grp_cd_VC(info);
		if (vc == columnItmGrpCst_cst_cd_key) return doItmGrpCst_cst_cd_key_VC(info);
		return true;
	}

	/**
	 * [MainTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMainTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtlTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtlTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtlTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtlTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_ym_d]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_ym_d_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_trnst_disp_d]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_trnst_disp_d_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_disp_term_d]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_disp_term_d_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sum_term_d]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sum_term_d_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_bdg_grp_d]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_bdg_grp_d_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[xrate_cd_d]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_xrate_cd_d_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[xrate_nm_d]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_xrate_nm_d_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[use_act_xrate_flg_d]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_use_act_xrate_flg_d_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_lvl_cd_d]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_lvl_cd_d_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_lvl_nm_d]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_lvl_nm_d_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_cd_d]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_cd_d_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_nm_d]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_nm_d_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inpt_ym_ig]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inpt_ym_ig_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_trnst_disp_ig]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_trnst_disp_ig_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_disp_term_ig]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_disp_term_ig_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sum_term_ig]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sum_term_ig_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_bdg_grp_ig]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_bdg_grp_ig_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[xrate_cd_ig]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_xrate_cd_ig_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[xrate_nm_ig]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_xrate_nm_ig_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[use_act_xrate_flg_ig]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_use_act_xrate_flg_ig_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_lvl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_itm_grp_lvl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_cd_ig]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_itm_grp_cd_ig_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_nm_ig]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_itm_grp_nm_ig_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[base_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_base_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[base_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_base_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[unit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_unit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sls_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[slo_bl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_slo_bl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[slo_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_slo_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[spln_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_spln_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[spln_per_cmpl_sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_spln_per_cmpl_sls_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bdg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bdg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bdg_per_cmpl_sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bdg_per_cmpl_sls_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[prof_amt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_prof_amt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[prof_rate_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_prof_rate_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[big_num_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_big_num_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[big_num_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_big_num_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[itm_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_itm_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[itm_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_itm_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[row_sort_col]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_row_sort_col_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[row_title_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_row_title_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[slo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_slo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[slo_bl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_slo_bl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[sum]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_sum_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[spln]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_spln_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[spln_per_cmpl_slo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_spln_per_cmpl_slo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[spln_per_cmpl_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_spln_per_cmpl_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[bdg_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_bdg_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[bdg_per_cmpl_slo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_bdg_per_cmpl_slo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[bdg_per_cmpl_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_bdg_per_cmpl_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[col_00]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_col_00_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[col_01]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_col_01_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[col_02]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_col_02_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[col_03]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_col_03_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[col_04]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_col_04_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[col_05]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_col_05_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[col_06]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_col_06_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[col_07]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_col_07_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[col_08]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_col_08_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[col_09]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_col_09_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[col_10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_col_10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[col_11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_col_11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[col_12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_col_12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[col_13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_col_13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[col_14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_col_14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[col_15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_col_15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[col_16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_col_16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[col_17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_col_17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[dpt1_key]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_dpt1_key_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDtl1]パネルの[dpt_nm1_key]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDtl1_dpt_nm1_key_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[dw_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_dw_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[dw_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_dw_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[row_sort_col]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_row_sort_col_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[row_title_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_row_title_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[slo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_slo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[slo_bl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_slo_bl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[sum]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_sum_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[spln]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_spln_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[spln_per_cmpl_slo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_spln_per_cmpl_slo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[spln_per_cmpl_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_spln_per_cmpl_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[bdg_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_bdg_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[bdg_per_cmpl_slo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_bdg_per_cmpl_slo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[bdg_per_cmpl_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_bdg_per_cmpl_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[col_00]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_col_00_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[col_01]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_col_01_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[col_02]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_col_02_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[col_03]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_col_03_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[col_04]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_col_04_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[col_05]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_col_05_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[col_06]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_col_06_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[col_07]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_col_07_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[col_08]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_col_08_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[col_09]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_col_09_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[col_10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_col_10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[col_11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_col_11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[col_12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_col_12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[col_13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_col_13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[col_14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_col_14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[col_15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_col_15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[col_16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_col_16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[col_17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_col_17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[dpt2_key]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_dpt2_key_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptDwDpt]パネルの[dpt_nm2_key]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptDwDpt_dpt_nm2_key_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[sls_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_sls_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[sls_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_sls_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[row_sort_col]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_row_sort_col_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[row_title_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_row_title_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[slo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_slo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[slo_bl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_slo_bl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[sum]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_sum_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[spln]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_spln_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[spln_per_cmpl_slo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_spln_per_cmpl_slo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[spln_per_cmpl_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_spln_per_cmpl_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[bdg_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_bdg_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[bdg_per_cmpl_slo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_bdg_per_cmpl_slo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[bdg_per_cmpl_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_bdg_per_cmpl_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[col_00]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_col_00_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[col_01]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_col_01_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[col_02]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_col_02_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[col_03]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_col_03_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[col_04]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_col_04_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[col_05]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_col_05_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[col_06]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_col_06_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[col_07]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_col_07_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[col_08]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_col_08_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[col_09]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_col_09_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[col_10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_col_10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[col_11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_col_11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[col_12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_col_12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[col_13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_col_13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[col_14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_col_14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[col_15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_col_15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[col_16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_col_16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[col_17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_col_17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptSlsUsr]パネルの[sls_usr_cd_key]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptSlsUsr_sls_usr_cd_key_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[row_sort_col]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_row_sort_col_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[row_title_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_row_title_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[slo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_slo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[slo_bl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_slo_bl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[sum]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_sum_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[spln]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_spln_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[spln_per_cmpl_slo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_spln_per_cmpl_slo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[spln_per_cmpl_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_spln_per_cmpl_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[bdg_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_bdg_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[bdg_per_cmpl_slo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_bdg_per_cmpl_slo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[bdg_per_cmpl_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_bdg_per_cmpl_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[col_00]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_col_00_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[col_01]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_col_01_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[col_02]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_col_02_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[col_03]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_col_03_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[col_04]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_col_04_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[col_05]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_col_05_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[col_06]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_col_06_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[col_07]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_col_07_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[col_08]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_col_08_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[col_09]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_col_09_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[col_10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_col_10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[col_11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_col_11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[col_12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_col_12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[col_13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_col_13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[col_14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_col_14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[col_15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_col_15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[col_16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_col_16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[col_17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_col_17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DptCst]パネルの[cst_cd_key]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDptCst_cst_cd_key_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpHdr]パネルの[base_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpHdr_base_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpHdr]パネルの[base_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpHdr_base_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpHdr]パネルの[unit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpHdr_unit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpHdr]パネルの[sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpHdr_sls_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpHdr]パネルの[slo_bl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpHdr_slo_bl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpHdr]パネルの[slo_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpHdr_slo_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpHdr]パネルの[spln_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpHdr_spln_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpHdr]パネルの[spln_per_cmpl_sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpHdr_spln_per_cmpl_sls_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpHdr]パネルの[bdg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpHdr_bdg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpHdr]パネルの[bdg_per_cmpl_sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpHdr_bdg_per_cmpl_sls_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpHdr]パネルの[prof_amt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpHdr_prof_amt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpHdr]パネルの[prof_rate_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpHdr_prof_rate_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpHdr]パネルの[big_num_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpHdr_big_num_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpHdr]パネルの[big_num_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpHdr_big_num_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[itm_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_itm_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[itm_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_itm_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[row_sort_col]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_row_sort_col_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[row_title_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_row_title_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[slo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_slo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[slo_bl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_slo_bl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[sum]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_sum_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[spln]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_spln_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[spln_per_cmpl_slo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_spln_per_cmpl_slo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[spln_per_cmpl_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_spln_per_cmpl_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[bdg_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_bdg_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[bdg_per_cmpl_slo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_bdg_per_cmpl_slo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[bdg_per_cmpl_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_bdg_per_cmpl_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_00]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_col_00_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_01]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_col_01_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_02]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_col_02_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_03]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_col_03_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_04]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_col_04_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_05]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_col_05_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_06]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_col_06_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_07]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_col_07_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_08]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_col_08_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_09]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_col_09_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_col_10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_col_11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_col_12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_col_13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_col_14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_col_15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_col_16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_col_17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[rate_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_rate_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[itm_grp1_key]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_itm_grp1_key_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDtl1]パネルの[itm_grp_nm1_key]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDtl1_itm_grp_nm1_key_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[dw_itm_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_dw_itm_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[dw_itm_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_dw_itm_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[row_sort_col]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_row_sort_col_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[row_title_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_row_title_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[slo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_slo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[slo_bl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_slo_bl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[sum]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_sum_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[spln]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_spln_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[spln_per_cmpl_slo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_spln_per_cmpl_slo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[spln_per_cmpl_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_spln_per_cmpl_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[bdg_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_bdg_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[bdg_per_cmpl_slo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_bdg_per_cmpl_slo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[bdg_per_cmpl_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_bdg_per_cmpl_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_00]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_col_00_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_01]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_col_01_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_02]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_col_02_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_03]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_col_03_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_04]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_col_04_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_05]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_col_05_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_06]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_col_06_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_07]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_col_07_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_08]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_col_08_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_09]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_col_09_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_col_10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_col_11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_col_12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_col_13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_col_14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_col_15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_col_16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_col_17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[rate_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_rate_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[itm_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_itm_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[itm_grp2_key]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpDwItmGrp_itm_grp2_key_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[row_sort_col]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_row_sort_col_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[row_title_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_row_title_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[slo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_slo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[slo_bl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_slo_bl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[sum]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_sum_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[spln]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_spln_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[spln_per_cmpl_slo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_spln_per_cmpl_slo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[spln_per_cmpl_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_spln_per_cmpl_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[bdg_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_bdg_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[bdg_per_cmpl_slo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_bdg_per_cmpl_slo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[bdg_per_cmpl_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_bdg_per_cmpl_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[col_00]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_col_00_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[col_01]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_col_01_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[col_02]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_col_02_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[col_03]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_col_03_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[col_04]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_col_04_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[col_05]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_col_05_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[col_06]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_col_06_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[col_07]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_col_07_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[col_08]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_col_08_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[col_09]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_col_09_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[col_10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_col_10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[col_11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_col_11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[col_12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_col_12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[col_13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_col_13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[col_14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_col_14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[col_15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_col_15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[col_16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_col_16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[col_17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_col_17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[rate_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_rate_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[itm_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_itm_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[itm_cd_key]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_itm_cd_key_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[itm_sub1_key]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_itm_sub1_key_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[itm_sub2_key]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_itm_sub2_key_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpItm]パネルの[itm_sub3_key]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpItm_itm_sub3_key_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[row_sort_col]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_row_sort_col_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[row_title_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_row_title_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[slo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_slo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[slo_bl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_slo_bl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[sum]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_sum_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[spln]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_spln_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[spln_per_cmpl_slo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_spln_per_cmpl_slo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[spln_per_cmpl_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_spln_per_cmpl_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[bdg_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_bdg_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[bdg_per_cmpl_slo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_bdg_per_cmpl_slo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[bdg_per_cmpl_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_bdg_per_cmpl_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[col_00]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_col_00_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[col_01]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_col_01_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[col_02]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_col_02_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[col_03]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_col_03_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[col_04]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_col_04_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[col_05]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_col_05_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[col_06]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_col_06_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[col_07]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_col_07_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[col_08]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_col_08_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[col_09]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_col_09_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[col_10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_col_10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[col_11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_col_11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[col_12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_col_12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[col_13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_col_13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[col_14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_col_14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[col_15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_col_15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[col_16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_col_16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[col_17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_col_17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[rate_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_rate_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[itm_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_itm_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ItmGrpCst]パネルの[cst_cd_key]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doItmGrpCst_cst_cd_key_VC(MCEventInfo info){
		return true;
	}

	/**
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == MainTabTab) doMainTab_NC(info);
		else if (nc == DptDtl1Table) doDptDtl1_NC(info);
		else if (nc == DptDtlTabTab) doDptDtlTab_NC(info);
		else if (nc == DptDwDptTable) doDptDwDpt_NC(info);
		else if (nc == DptSlsUsrTable) doDptSlsUsr_NC(info);
		else if (nc == DptCstTable) doDptCst_NC(info);
		else if (nc == ItmGrpDtl1Table) doItmGrpDtl1_NC(info);
		else if (nc == ItmGrpDtlTabTab) doItmGrpDtlTab_NC(info);
		else if (nc == ItmGrpDwItmGrpTable) doItmGrpDwItmGrp_NC(info);
		else if (nc == ItmGrpItmTable) doItmGrpItm_NC(info);
		else if (nc == ItmGrpCstTable) doItmGrpCst_NC(info);
		else if (nc == Cnd_inpt_ym_d) doCnd_inpt_ym_d_NC(info);
		else if (nc == Cnd_sls_trnst_disp_d) doCnd_sls_trnst_disp_d_NC(info);
		else if (nc == Cnd_sls_disp_term_d) doCnd_sls_disp_term_d_NC(info);
		else if (nc == Cnd_sum_term_d) doCnd_sum_term_d_NC(info);
		else if (nc == Cnd_sls_bdg_grp_d) doCnd_sls_bdg_grp_d_NC(info);
		else if (nc == Cnd_xrate_cd_d) doCnd_xrate_cd_d_NC(info);
		else if (nc == Cnd_xrate_nm_d) doCnd_xrate_nm_d_NC(info);
		else if (nc == Cnd_use_act_xrate_flg_d) doCnd_use_act_xrate_flg_d_NC(info);
		else if (nc == Cnd_dpt_lvl_cd_d) doCnd_dpt_lvl_cd_d_NC(info);
		else if (nc == Cnd_dpt_lvl_nm_d) doCnd_dpt_lvl_nm_d_NC(info);
		else if (nc == Cnd_dpt_cd_d) doCnd_dpt_cd_d_NC(info);
		else if (nc == Cnd_dpt_nm_d) doCnd_dpt_nm_d_NC(info);
		else if (nc == Cnd_inpt_ym_ig) doCnd_inpt_ym_ig_NC(info);
		else if (nc == Cnd_sls_trnst_disp_ig) doCnd_sls_trnst_disp_ig_NC(info);
		else if (nc == Cnd_sls_disp_term_ig) doCnd_sls_disp_term_ig_NC(info);
		else if (nc == Cnd_sum_term_ig) doCnd_sum_term_ig_NC(info);
		else if (nc == Cnd_sls_bdg_grp_ig) doCnd_sls_bdg_grp_ig_NC(info);
		else if (nc == Cnd_xrate_cd_ig) doCnd_xrate_cd_ig_NC(info);
		else if (nc == Cnd_xrate_nm_ig) doCnd_xrate_nm_ig_NC(info);
		else if (nc == Cnd_use_act_xrate_flg_ig) doCnd_use_act_xrate_flg_ig_NC(info);
		else if (nc == Cnd_sls_itm_grp_lvl) doCnd_sls_itm_grp_lvl_NC(info);
		else if (nc == Cnd_sls_itm_grp_cd_ig) doCnd_sls_itm_grp_cd_ig_NC(info);
		else if (nc == Cnd_sls_itm_grp_nm_ig) doCnd_sls_itm_grp_nm_ig_NC(info);
		else if (nc == Hdr_base_cur_cd) doHdr_base_cur_cd_NC(info);
		else if (nc == Hdr_base_cur_nm) doHdr_base_cur_nm_NC(info);
		else if (nc == Hdr_unit) doHdr_unit_NC(info);
		else if (nc == Hdr_sls_flg) doHdr_sls_flg_NC(info);
		else if (nc == Hdr_slo_bl_flg) doHdr_slo_bl_flg_NC(info);
		else if (nc == Hdr_slo_flg) doHdr_slo_flg_NC(info);
		else if (nc == Hdr_spln_flg) doHdr_spln_flg_NC(info);
		else if (nc == Hdr_spln_per_cmpl_sls_flg) doHdr_spln_per_cmpl_sls_flg_NC(info);
		else if (nc == Hdr_bdg_flg) doHdr_bdg_flg_NC(info);
		else if (nc == Hdr_bdg_per_cmpl_sls_flg) doHdr_bdg_per_cmpl_sls_flg_NC(info);
		else if (nc == Hdr_prof_amt_flg) doHdr_prof_amt_flg_NC(info);
		else if (nc == Hdr_prof_rate_flg) doHdr_prof_rate_flg_NC(info);
		else if (nc == Hdr_big_num_rnd_typ) doHdr_big_num_rnd_typ_NC(info);
		else if (nc == Hdr_big_num_rnd_typ_nm) doHdr_big_num_rnd_typ_nm_NC(info);
		else if (nc == columnDptDtl1_dpt_cd) doDptDtl1_dpt_cd_NC(info);
		else if (nc == columnDptDtl1_dpt_nm) doDptDtl1_dpt_nm_NC(info);
		else if (nc == columnDptDtl1_itm_grp_cd) doDptDtl1_itm_grp_cd_NC(info);
		else if (nc == columnDptDtl1_itm_grp_nm) doDptDtl1_itm_grp_nm_NC(info);
		else if (nc == columnDptDtl1_row_sort_col) doDptDtl1_row_sort_col_NC(info);
		else if (nc == columnDptDtl1_row_title_nm) doDptDtl1_row_title_nm_NC(info);
		else if (nc == columnDptDtl1_slo) doDptDtl1_slo_NC(info);
		else if (nc == columnDptDtl1_slo_bl) doDptDtl1_slo_bl_NC(info);
		else if (nc == columnDptDtl1_sls) doDptDtl1_sls_NC(info);
		else if (nc == columnDptDtl1_sum) doDptDtl1_sum_NC(info);
		else if (nc == columnDptDtl1_spln) doDptDtl1_spln_NC(info);
		else if (nc == columnDptDtl1_spln_per_cmpl_slo) doDptDtl1_spln_per_cmpl_slo_NC(info);
		else if (nc == columnDptDtl1_spln_per_cmpl_sls) doDptDtl1_spln_per_cmpl_sls_NC(info);
		else if (nc == columnDptDtl1_bdg_sls) doDptDtl1_bdg_sls_NC(info);
		else if (nc == columnDptDtl1_bdg_per_cmpl_slo) doDptDtl1_bdg_per_cmpl_slo_NC(info);
		else if (nc == columnDptDtl1_bdg_per_cmpl_sls) doDptDtl1_bdg_per_cmpl_sls_NC(info);
		else if (nc == columnDptDtl1_col_00) doDptDtl1_col_00_NC(info);
		else if (nc == columnDptDtl1_col_01) doDptDtl1_col_01_NC(info);
		else if (nc == columnDptDtl1_col_02) doDptDtl1_col_02_NC(info);
		else if (nc == columnDptDtl1_col_03) doDptDtl1_col_03_NC(info);
		else if (nc == columnDptDtl1_col_04) doDptDtl1_col_04_NC(info);
		else if (nc == columnDptDtl1_col_05) doDptDtl1_col_05_NC(info);
		else if (nc == columnDptDtl1_col_06) doDptDtl1_col_06_NC(info);
		else if (nc == columnDptDtl1_col_07) doDptDtl1_col_07_NC(info);
		else if (nc == columnDptDtl1_col_08) doDptDtl1_col_08_NC(info);
		else if (nc == columnDptDtl1_col_09) doDptDtl1_col_09_NC(info);
		else if (nc == columnDptDtl1_col_10) doDptDtl1_col_10_NC(info);
		else if (nc == columnDptDtl1_col_11) doDptDtl1_col_11_NC(info);
		else if (nc == columnDptDtl1_col_12) doDptDtl1_col_12_NC(info);
		else if (nc == columnDptDtl1_col_13) doDptDtl1_col_13_NC(info);
		else if (nc == columnDptDtl1_col_14) doDptDtl1_col_14_NC(info);
		else if (nc == columnDptDtl1_col_15) doDptDtl1_col_15_NC(info);
		else if (nc == columnDptDtl1_col_16) doDptDtl1_col_16_NC(info);
		else if (nc == columnDptDtl1_col_17) doDptDtl1_col_17_NC(info);
		else if (nc == columnDptDtl1_dpt1_key) doDptDtl1_dpt1_key_NC(info);
		else if (nc == columnDptDtl1_dpt_nm1_key) doDptDtl1_dpt_nm1_key_NC(info);
		else if (nc == columnDptDwDpt_dw_dpt_cd) doDptDwDpt_dw_dpt_cd_NC(info);
		else if (nc == columnDptDwDpt_dw_dpt_nm) doDptDwDpt_dw_dpt_nm_NC(info);
		else if (nc == columnDptDwDpt_row_sort_col) doDptDwDpt_row_sort_col_NC(info);
		else if (nc == columnDptDwDpt_row_title_nm) doDptDwDpt_row_title_nm_NC(info);
		else if (nc == columnDptDwDpt_slo) doDptDwDpt_slo_NC(info);
		else if (nc == columnDptDwDpt_slo_bl) doDptDwDpt_slo_bl_NC(info);
		else if (nc == columnDptDwDpt_sls) doDptDwDpt_sls_NC(info);
		else if (nc == columnDptDwDpt_sum) doDptDwDpt_sum_NC(info);
		else if (nc == columnDptDwDpt_spln) doDptDwDpt_spln_NC(info);
		else if (nc == columnDptDwDpt_spln_per_cmpl_slo) doDptDwDpt_spln_per_cmpl_slo_NC(info);
		else if (nc == columnDptDwDpt_spln_per_cmpl_sls) doDptDwDpt_spln_per_cmpl_sls_NC(info);
		else if (nc == columnDptDwDpt_bdg_sls) doDptDwDpt_bdg_sls_NC(info);
		else if (nc == columnDptDwDpt_bdg_per_cmpl_slo) doDptDwDpt_bdg_per_cmpl_slo_NC(info);
		else if (nc == columnDptDwDpt_bdg_per_cmpl_sls) doDptDwDpt_bdg_per_cmpl_sls_NC(info);
		else if (nc == columnDptDwDpt_col_00) doDptDwDpt_col_00_NC(info);
		else if (nc == columnDptDwDpt_col_01) doDptDwDpt_col_01_NC(info);
		else if (nc == columnDptDwDpt_col_02) doDptDwDpt_col_02_NC(info);
		else if (nc == columnDptDwDpt_col_03) doDptDwDpt_col_03_NC(info);
		else if (nc == columnDptDwDpt_col_04) doDptDwDpt_col_04_NC(info);
		else if (nc == columnDptDwDpt_col_05) doDptDwDpt_col_05_NC(info);
		else if (nc == columnDptDwDpt_col_06) doDptDwDpt_col_06_NC(info);
		else if (nc == columnDptDwDpt_col_07) doDptDwDpt_col_07_NC(info);
		else if (nc == columnDptDwDpt_col_08) doDptDwDpt_col_08_NC(info);
		else if (nc == columnDptDwDpt_col_09) doDptDwDpt_col_09_NC(info);
		else if (nc == columnDptDwDpt_col_10) doDptDwDpt_col_10_NC(info);
		else if (nc == columnDptDwDpt_col_11) doDptDwDpt_col_11_NC(info);
		else if (nc == columnDptDwDpt_col_12) doDptDwDpt_col_12_NC(info);
		else if (nc == columnDptDwDpt_col_13) doDptDwDpt_col_13_NC(info);
		else if (nc == columnDptDwDpt_col_14) doDptDwDpt_col_14_NC(info);
		else if (nc == columnDptDwDpt_col_15) doDptDwDpt_col_15_NC(info);
		else if (nc == columnDptDwDpt_col_16) doDptDwDpt_col_16_NC(info);
		else if (nc == columnDptDwDpt_col_17) doDptDwDpt_col_17_NC(info);
		else if (nc == columnDptDwDpt_dpt_cd) doDptDwDpt_dpt_cd_NC(info);
		else if (nc == columnDptDwDpt_dpt_nm) doDptDwDpt_dpt_nm_NC(info);
		else if (nc == columnDptDwDpt_dpt2_key) doDptDwDpt_dpt2_key_NC(info);
		else if (nc == columnDptDwDpt_dpt_nm2_key) doDptDwDpt_dpt_nm2_key_NC(info);
		else if (nc == columnDptSlsUsr_sls_usr_cd) doDptSlsUsr_sls_usr_cd_NC(info);
		else if (nc == columnDptSlsUsr_sls_usr_nm) doDptSlsUsr_sls_usr_nm_NC(info);
		else if (nc == columnDptSlsUsr_row_sort_col) doDptSlsUsr_row_sort_col_NC(info);
		else if (nc == columnDptSlsUsr_row_title_nm) doDptSlsUsr_row_title_nm_NC(info);
		else if (nc == columnDptSlsUsr_slo) doDptSlsUsr_slo_NC(info);
		else if (nc == columnDptSlsUsr_slo_bl) doDptSlsUsr_slo_bl_NC(info);
		else if (nc == columnDptSlsUsr_sls) doDptSlsUsr_sls_NC(info);
		else if (nc == columnDptSlsUsr_sum) doDptSlsUsr_sum_NC(info);
		else if (nc == columnDptSlsUsr_spln) doDptSlsUsr_spln_NC(info);
		else if (nc == columnDptSlsUsr_spln_per_cmpl_slo) doDptSlsUsr_spln_per_cmpl_slo_NC(info);
		else if (nc == columnDptSlsUsr_spln_per_cmpl_sls) doDptSlsUsr_spln_per_cmpl_sls_NC(info);
		else if (nc == columnDptSlsUsr_bdg_sls) doDptSlsUsr_bdg_sls_NC(info);
		else if (nc == columnDptSlsUsr_bdg_per_cmpl_slo) doDptSlsUsr_bdg_per_cmpl_slo_NC(info);
		else if (nc == columnDptSlsUsr_bdg_per_cmpl_sls) doDptSlsUsr_bdg_per_cmpl_sls_NC(info);
		else if (nc == columnDptSlsUsr_col_00) doDptSlsUsr_col_00_NC(info);
		else if (nc == columnDptSlsUsr_col_01) doDptSlsUsr_col_01_NC(info);
		else if (nc == columnDptSlsUsr_col_02) doDptSlsUsr_col_02_NC(info);
		else if (nc == columnDptSlsUsr_col_03) doDptSlsUsr_col_03_NC(info);
		else if (nc == columnDptSlsUsr_col_04) doDptSlsUsr_col_04_NC(info);
		else if (nc == columnDptSlsUsr_col_05) doDptSlsUsr_col_05_NC(info);
		else if (nc == columnDptSlsUsr_col_06) doDptSlsUsr_col_06_NC(info);
		else if (nc == columnDptSlsUsr_col_07) doDptSlsUsr_col_07_NC(info);
		else if (nc == columnDptSlsUsr_col_08) doDptSlsUsr_col_08_NC(info);
		else if (nc == columnDptSlsUsr_col_09) doDptSlsUsr_col_09_NC(info);
		else if (nc == columnDptSlsUsr_col_10) doDptSlsUsr_col_10_NC(info);
		else if (nc == columnDptSlsUsr_col_11) doDptSlsUsr_col_11_NC(info);
		else if (nc == columnDptSlsUsr_col_12) doDptSlsUsr_col_12_NC(info);
		else if (nc == columnDptSlsUsr_col_13) doDptSlsUsr_col_13_NC(info);
		else if (nc == columnDptSlsUsr_col_14) doDptSlsUsr_col_14_NC(info);
		else if (nc == columnDptSlsUsr_col_15) doDptSlsUsr_col_15_NC(info);
		else if (nc == columnDptSlsUsr_col_16) doDptSlsUsr_col_16_NC(info);
		else if (nc == columnDptSlsUsr_col_17) doDptSlsUsr_col_17_NC(info);
		else if (nc == columnDptSlsUsr_dpt_cd) doDptSlsUsr_dpt_cd_NC(info);
		else if (nc == columnDptSlsUsr_dpt_nm) doDptSlsUsr_dpt_nm_NC(info);
		else if (nc == columnDptSlsUsr_sls_usr_cd_key) doDptSlsUsr_sls_usr_cd_key_NC(info);
		else if (nc == columnDptCst_cst_cd) doDptCst_cst_cd_NC(info);
		else if (nc == columnDptCst_cst_nm) doDptCst_cst_nm_NC(info);
		else if (nc == columnDptCst_row_sort_col) doDptCst_row_sort_col_NC(info);
		else if (nc == columnDptCst_row_title_nm) doDptCst_row_title_nm_NC(info);
		else if (nc == columnDptCst_slo) doDptCst_slo_NC(info);
		else if (nc == columnDptCst_slo_bl) doDptCst_slo_bl_NC(info);
		else if (nc == columnDptCst_sls) doDptCst_sls_NC(info);
		else if (nc == columnDptCst_sum) doDptCst_sum_NC(info);
		else if (nc == columnDptCst_spln) doDptCst_spln_NC(info);
		else if (nc == columnDptCst_spln_per_cmpl_slo) doDptCst_spln_per_cmpl_slo_NC(info);
		else if (nc == columnDptCst_spln_per_cmpl_sls) doDptCst_spln_per_cmpl_sls_NC(info);
		else if (nc == columnDptCst_bdg_sls) doDptCst_bdg_sls_NC(info);
		else if (nc == columnDptCst_bdg_per_cmpl_slo) doDptCst_bdg_per_cmpl_slo_NC(info);
		else if (nc == columnDptCst_bdg_per_cmpl_sls) doDptCst_bdg_per_cmpl_sls_NC(info);
		else if (nc == columnDptCst_col_00) doDptCst_col_00_NC(info);
		else if (nc == columnDptCst_col_01) doDptCst_col_01_NC(info);
		else if (nc == columnDptCst_col_02) doDptCst_col_02_NC(info);
		else if (nc == columnDptCst_col_03) doDptCst_col_03_NC(info);
		else if (nc == columnDptCst_col_04) doDptCst_col_04_NC(info);
		else if (nc == columnDptCst_col_05) doDptCst_col_05_NC(info);
		else if (nc == columnDptCst_col_06) doDptCst_col_06_NC(info);
		else if (nc == columnDptCst_col_07) doDptCst_col_07_NC(info);
		else if (nc == columnDptCst_col_08) doDptCst_col_08_NC(info);
		else if (nc == columnDptCst_col_09) doDptCst_col_09_NC(info);
		else if (nc == columnDptCst_col_10) doDptCst_col_10_NC(info);
		else if (nc == columnDptCst_col_11) doDptCst_col_11_NC(info);
		else if (nc == columnDptCst_col_12) doDptCst_col_12_NC(info);
		else if (nc == columnDptCst_col_13) doDptCst_col_13_NC(info);
		else if (nc == columnDptCst_col_14) doDptCst_col_14_NC(info);
		else if (nc == columnDptCst_col_15) doDptCst_col_15_NC(info);
		else if (nc == columnDptCst_col_16) doDptCst_col_16_NC(info);
		else if (nc == columnDptCst_col_17) doDptCst_col_17_NC(info);
		else if (nc == columnDptCst_dpt_cd) doDptCst_dpt_cd_NC(info);
		else if (nc == columnDptCst_dpt_nm) doDptCst_dpt_nm_NC(info);
		else if (nc == columnDptCst_cst_cd_key) doDptCst_cst_cd_key_NC(info);
		else if (nc == ItmGrpHdr_base_cur_cd) doItmGrpHdr_base_cur_cd_NC(info);
		else if (nc == ItmGrpHdr_base_cur_nm) doItmGrpHdr_base_cur_nm_NC(info);
		else if (nc == ItmGrpHdr_unit) doItmGrpHdr_unit_NC(info);
		else if (nc == ItmGrpHdr_sls_flg) doItmGrpHdr_sls_flg_NC(info);
		else if (nc == ItmGrpHdr_slo_bl_flg) doItmGrpHdr_slo_bl_flg_NC(info);
		else if (nc == ItmGrpHdr_slo_flg) doItmGrpHdr_slo_flg_NC(info);
		else if (nc == ItmGrpHdr_spln_flg) doItmGrpHdr_spln_flg_NC(info);
		else if (nc == ItmGrpHdr_spln_per_cmpl_sls_flg) doItmGrpHdr_spln_per_cmpl_sls_flg_NC(info);
		else if (nc == ItmGrpHdr_bdg_flg) doItmGrpHdr_bdg_flg_NC(info);
		else if (nc == ItmGrpHdr_bdg_per_cmpl_sls_flg) doItmGrpHdr_bdg_per_cmpl_sls_flg_NC(info);
		else if (nc == ItmGrpHdr_prof_amt_flg) doItmGrpHdr_prof_amt_flg_NC(info);
		else if (nc == ItmGrpHdr_prof_rate_flg) doItmGrpHdr_prof_rate_flg_NC(info);
		else if (nc == ItmGrpHdr_big_num_rnd_typ) doItmGrpHdr_big_num_rnd_typ_NC(info);
		else if (nc == ItmGrpHdr_big_num_rnd_typ_nm) doItmGrpHdr_big_num_rnd_typ_nm_NC(info);
		else if (nc == columnItmGrpDtl1_itm_grp_cd) doItmGrpDtl1_itm_grp_cd_NC(info);
		else if (nc == columnItmGrpDtl1_itm_grp_nm) doItmGrpDtl1_itm_grp_nm_NC(info);
		else if (nc == columnItmGrpDtl1_row_sort_col) doItmGrpDtl1_row_sort_col_NC(info);
		else if (nc == columnItmGrpDtl1_row_title_nm) doItmGrpDtl1_row_title_nm_NC(info);
		else if (nc == columnItmGrpDtl1_slo) doItmGrpDtl1_slo_NC(info);
		else if (nc == columnItmGrpDtl1_slo_bl) doItmGrpDtl1_slo_bl_NC(info);
		else if (nc == columnItmGrpDtl1_sls) doItmGrpDtl1_sls_NC(info);
		else if (nc == columnItmGrpDtl1_sum) doItmGrpDtl1_sum_NC(info);
		else if (nc == columnItmGrpDtl1_spln) doItmGrpDtl1_spln_NC(info);
		else if (nc == columnItmGrpDtl1_spln_per_cmpl_slo) doItmGrpDtl1_spln_per_cmpl_slo_NC(info);
		else if (nc == columnItmGrpDtl1_spln_per_cmpl_sls) doItmGrpDtl1_spln_per_cmpl_sls_NC(info);
		else if (nc == columnItmGrpDtl1_bdg_sls) doItmGrpDtl1_bdg_sls_NC(info);
		else if (nc == columnItmGrpDtl1_bdg_per_cmpl_slo) doItmGrpDtl1_bdg_per_cmpl_slo_NC(info);
		else if (nc == columnItmGrpDtl1_bdg_per_cmpl_sls) doItmGrpDtl1_bdg_per_cmpl_sls_NC(info);
		else if (nc == columnItmGrpDtl1_col_00) doItmGrpDtl1_col_00_NC(info);
		else if (nc == columnItmGrpDtl1_col_01) doItmGrpDtl1_col_01_NC(info);
		else if (nc == columnItmGrpDtl1_col_02) doItmGrpDtl1_col_02_NC(info);
		else if (nc == columnItmGrpDtl1_col_03) doItmGrpDtl1_col_03_NC(info);
		else if (nc == columnItmGrpDtl1_col_04) doItmGrpDtl1_col_04_NC(info);
		else if (nc == columnItmGrpDtl1_col_05) doItmGrpDtl1_col_05_NC(info);
		else if (nc == columnItmGrpDtl1_col_06) doItmGrpDtl1_col_06_NC(info);
		else if (nc == columnItmGrpDtl1_col_07) doItmGrpDtl1_col_07_NC(info);
		else if (nc == columnItmGrpDtl1_col_08) doItmGrpDtl1_col_08_NC(info);
		else if (nc == columnItmGrpDtl1_col_09) doItmGrpDtl1_col_09_NC(info);
		else if (nc == columnItmGrpDtl1_col_10) doItmGrpDtl1_col_10_NC(info);
		else if (nc == columnItmGrpDtl1_col_11) doItmGrpDtl1_col_11_NC(info);
		else if (nc == columnItmGrpDtl1_col_12) doItmGrpDtl1_col_12_NC(info);
		else if (nc == columnItmGrpDtl1_col_13) doItmGrpDtl1_col_13_NC(info);
		else if (nc == columnItmGrpDtl1_col_14) doItmGrpDtl1_col_14_NC(info);
		else if (nc == columnItmGrpDtl1_col_15) doItmGrpDtl1_col_15_NC(info);
		else if (nc == columnItmGrpDtl1_col_16) doItmGrpDtl1_col_16_NC(info);
		else if (nc == columnItmGrpDtl1_col_17) doItmGrpDtl1_col_17_NC(info);
		else if (nc == columnItmGrpDtl1_amt_dec_place) doItmGrpDtl1_amt_dec_place_NC(info);
		else if (nc == columnItmGrpDtl1_rate_dec_place) doItmGrpDtl1_rate_dec_place_NC(info);
		else if (nc == columnItmGrpDtl1_itm_grp1_key) doItmGrpDtl1_itm_grp1_key_NC(info);
		else if (nc == columnItmGrpDtl1_itm_grp_nm1_key) doItmGrpDtl1_itm_grp_nm1_key_NC(info);
		else if (nc == columnItmGrpDwItmGrp_dw_itm_grp_cd) doItmGrpDwItmGrp_dw_itm_grp_cd_NC(info);
		else if (nc == columnItmGrpDwItmGrp_dw_itm_grp_nm) doItmGrpDwItmGrp_dw_itm_grp_nm_NC(info);
		else if (nc == columnItmGrpDwItmGrp_row_sort_col) doItmGrpDwItmGrp_row_sort_col_NC(info);
		else if (nc == columnItmGrpDwItmGrp_row_title_nm) doItmGrpDwItmGrp_row_title_nm_NC(info);
		else if (nc == columnItmGrpDwItmGrp_slo) doItmGrpDwItmGrp_slo_NC(info);
		else if (nc == columnItmGrpDwItmGrp_slo_bl) doItmGrpDwItmGrp_slo_bl_NC(info);
		else if (nc == columnItmGrpDwItmGrp_sls) doItmGrpDwItmGrp_sls_NC(info);
		else if (nc == columnItmGrpDwItmGrp_sum) doItmGrpDwItmGrp_sum_NC(info);
		else if (nc == columnItmGrpDwItmGrp_spln) doItmGrpDwItmGrp_spln_NC(info);
		else if (nc == columnItmGrpDwItmGrp_spln_per_cmpl_slo) doItmGrpDwItmGrp_spln_per_cmpl_slo_NC(info);
		else if (nc == columnItmGrpDwItmGrp_spln_per_cmpl_sls) doItmGrpDwItmGrp_spln_per_cmpl_sls_NC(info);
		else if (nc == columnItmGrpDwItmGrp_bdg_sls) doItmGrpDwItmGrp_bdg_sls_NC(info);
		else if (nc == columnItmGrpDwItmGrp_bdg_per_cmpl_slo) doItmGrpDwItmGrp_bdg_per_cmpl_slo_NC(info);
		else if (nc == columnItmGrpDwItmGrp_bdg_per_cmpl_sls) doItmGrpDwItmGrp_bdg_per_cmpl_sls_NC(info);
		else if (nc == columnItmGrpDwItmGrp_col_00) doItmGrpDwItmGrp_col_00_NC(info);
		else if (nc == columnItmGrpDwItmGrp_col_01) doItmGrpDwItmGrp_col_01_NC(info);
		else if (nc == columnItmGrpDwItmGrp_col_02) doItmGrpDwItmGrp_col_02_NC(info);
		else if (nc == columnItmGrpDwItmGrp_col_03) doItmGrpDwItmGrp_col_03_NC(info);
		else if (nc == columnItmGrpDwItmGrp_col_04) doItmGrpDwItmGrp_col_04_NC(info);
		else if (nc == columnItmGrpDwItmGrp_col_05) doItmGrpDwItmGrp_col_05_NC(info);
		else if (nc == columnItmGrpDwItmGrp_col_06) doItmGrpDwItmGrp_col_06_NC(info);
		else if (nc == columnItmGrpDwItmGrp_col_07) doItmGrpDwItmGrp_col_07_NC(info);
		else if (nc == columnItmGrpDwItmGrp_col_08) doItmGrpDwItmGrp_col_08_NC(info);
		else if (nc == columnItmGrpDwItmGrp_col_09) doItmGrpDwItmGrp_col_09_NC(info);
		else if (nc == columnItmGrpDwItmGrp_col_10) doItmGrpDwItmGrp_col_10_NC(info);
		else if (nc == columnItmGrpDwItmGrp_col_11) doItmGrpDwItmGrp_col_11_NC(info);
		else if (nc == columnItmGrpDwItmGrp_col_12) doItmGrpDwItmGrp_col_12_NC(info);
		else if (nc == columnItmGrpDwItmGrp_col_13) doItmGrpDwItmGrp_col_13_NC(info);
		else if (nc == columnItmGrpDwItmGrp_col_14) doItmGrpDwItmGrp_col_14_NC(info);
		else if (nc == columnItmGrpDwItmGrp_col_15) doItmGrpDwItmGrp_col_15_NC(info);
		else if (nc == columnItmGrpDwItmGrp_col_16) doItmGrpDwItmGrp_col_16_NC(info);
		else if (nc == columnItmGrpDwItmGrp_col_17) doItmGrpDwItmGrp_col_17_NC(info);
		else if (nc == columnItmGrpDwItmGrp_base_unit_dec_place) doItmGrpDwItmGrp_base_unit_dec_place_NC(info);
		else if (nc == columnItmGrpDwItmGrp_amt_dec_place) doItmGrpDwItmGrp_amt_dec_place_NC(info);
		else if (nc == columnItmGrpDwItmGrp_rate_dec_place) doItmGrpDwItmGrp_rate_dec_place_NC(info);
		else if (nc == columnItmGrpDwItmGrp_itm_grp_cd) doItmGrpDwItmGrp_itm_grp_cd_NC(info);
		else if (nc == columnItmGrpDwItmGrp_itm_grp2_key) doItmGrpDwItmGrp_itm_grp2_key_NC(info);
		else if (nc == columnItmGrpItm_row_sort_col) doItmGrpItm_row_sort_col_NC(info);
		else if (nc == columnItmGrpItm_row_title_nm) doItmGrpItm_row_title_nm_NC(info);
		else if (nc == columnItmGrpItm_slo) doItmGrpItm_slo_NC(info);
		else if (nc == columnItmGrpItm_slo_bl) doItmGrpItm_slo_bl_NC(info);
		else if (nc == columnItmGrpItm_sls) doItmGrpItm_sls_NC(info);
		else if (nc == columnItmGrpItm_sum) doItmGrpItm_sum_NC(info);
		else if (nc == columnItmGrpItm_spln) doItmGrpItm_spln_NC(info);
		else if (nc == columnItmGrpItm_spln_per_cmpl_slo) doItmGrpItm_spln_per_cmpl_slo_NC(info);
		else if (nc == columnItmGrpItm_spln_per_cmpl_sls) doItmGrpItm_spln_per_cmpl_sls_NC(info);
		else if (nc == columnItmGrpItm_bdg_sls) doItmGrpItm_bdg_sls_NC(info);
		else if (nc == columnItmGrpItm_bdg_per_cmpl_slo) doItmGrpItm_bdg_per_cmpl_slo_NC(info);
		else if (nc == columnItmGrpItm_bdg_per_cmpl_sls) doItmGrpItm_bdg_per_cmpl_sls_NC(info);
		else if (nc == columnItmGrpItm_col_00) doItmGrpItm_col_00_NC(info);
		else if (nc == columnItmGrpItm_col_01) doItmGrpItm_col_01_NC(info);
		else if (nc == columnItmGrpItm_col_02) doItmGrpItm_col_02_NC(info);
		else if (nc == columnItmGrpItm_col_03) doItmGrpItm_col_03_NC(info);
		else if (nc == columnItmGrpItm_col_04) doItmGrpItm_col_04_NC(info);
		else if (nc == columnItmGrpItm_col_05) doItmGrpItm_col_05_NC(info);
		else if (nc == columnItmGrpItm_col_06) doItmGrpItm_col_06_NC(info);
		else if (nc == columnItmGrpItm_col_07) doItmGrpItm_col_07_NC(info);
		else if (nc == columnItmGrpItm_col_08) doItmGrpItm_col_08_NC(info);
		else if (nc == columnItmGrpItm_col_09) doItmGrpItm_col_09_NC(info);
		else if (nc == columnItmGrpItm_col_10) doItmGrpItm_col_10_NC(info);
		else if (nc == columnItmGrpItm_col_11) doItmGrpItm_col_11_NC(info);
		else if (nc == columnItmGrpItm_col_12) doItmGrpItm_col_12_NC(info);
		else if (nc == columnItmGrpItm_col_13) doItmGrpItm_col_13_NC(info);
		else if (nc == columnItmGrpItm_col_14) doItmGrpItm_col_14_NC(info);
		else if (nc == columnItmGrpItm_col_15) doItmGrpItm_col_15_NC(info);
		else if (nc == columnItmGrpItm_col_16) doItmGrpItm_col_16_NC(info);
		else if (nc == columnItmGrpItm_col_17) doItmGrpItm_col_17_NC(info);
		else if (nc == columnItmGrpItm_base_unit_dec_place) doItmGrpItm_base_unit_dec_place_NC(info);
		else if (nc == columnItmGrpItm_amt_dec_place) doItmGrpItm_amt_dec_place_NC(info);
		else if (nc == columnItmGrpItm_rate_dec_place) doItmGrpItm_rate_dec_place_NC(info);
		else if (nc == columnItmGrpItm_itm_grp_cd) doItmGrpItm_itm_grp_cd_NC(info);
		else if (nc == columnItmGrpItm_itm_cd_key) doItmGrpItm_itm_cd_key_NC(info);
		else if (nc == columnItmGrpItm_itm_sub1_key) doItmGrpItm_itm_sub1_key_NC(info);
		else if (nc == columnItmGrpItm_itm_sub2_key) doItmGrpItm_itm_sub2_key_NC(info);
		else if (nc == columnItmGrpItm_itm_sub3_key) doItmGrpItm_itm_sub3_key_NC(info);
		else if (nc == columnItmGrpCst_cst_cd) doItmGrpCst_cst_cd_NC(info);
		else if (nc == columnItmGrpCst_cst_nm) doItmGrpCst_cst_nm_NC(info);
		else if (nc == columnItmGrpCst_row_sort_col) doItmGrpCst_row_sort_col_NC(info);
		else if (nc == columnItmGrpCst_row_title_nm) doItmGrpCst_row_title_nm_NC(info);
		else if (nc == columnItmGrpCst_slo) doItmGrpCst_slo_NC(info);
		else if (nc == columnItmGrpCst_slo_bl) doItmGrpCst_slo_bl_NC(info);
		else if (nc == columnItmGrpCst_sls) doItmGrpCst_sls_NC(info);
		else if (nc == columnItmGrpCst_sum) doItmGrpCst_sum_NC(info);
		else if (nc == columnItmGrpCst_spln) doItmGrpCst_spln_NC(info);
		else if (nc == columnItmGrpCst_spln_per_cmpl_slo) doItmGrpCst_spln_per_cmpl_slo_NC(info);
		else if (nc == columnItmGrpCst_spln_per_cmpl_sls) doItmGrpCst_spln_per_cmpl_sls_NC(info);
		else if (nc == columnItmGrpCst_bdg_sls) doItmGrpCst_bdg_sls_NC(info);
		else if (nc == columnItmGrpCst_bdg_per_cmpl_slo) doItmGrpCst_bdg_per_cmpl_slo_NC(info);
		else if (nc == columnItmGrpCst_bdg_per_cmpl_sls) doItmGrpCst_bdg_per_cmpl_sls_NC(info);
		else if (nc == columnItmGrpCst_col_00) doItmGrpCst_col_00_NC(info);
		else if (nc == columnItmGrpCst_col_01) doItmGrpCst_col_01_NC(info);
		else if (nc == columnItmGrpCst_col_02) doItmGrpCst_col_02_NC(info);
		else if (nc == columnItmGrpCst_col_03) doItmGrpCst_col_03_NC(info);
		else if (nc == columnItmGrpCst_col_04) doItmGrpCst_col_04_NC(info);
		else if (nc == columnItmGrpCst_col_05) doItmGrpCst_col_05_NC(info);
		else if (nc == columnItmGrpCst_col_06) doItmGrpCst_col_06_NC(info);
		else if (nc == columnItmGrpCst_col_07) doItmGrpCst_col_07_NC(info);
		else if (nc == columnItmGrpCst_col_08) doItmGrpCst_col_08_NC(info);
		else if (nc == columnItmGrpCst_col_09) doItmGrpCst_col_09_NC(info);
		else if (nc == columnItmGrpCst_col_10) doItmGrpCst_col_10_NC(info);
		else if (nc == columnItmGrpCst_col_11) doItmGrpCst_col_11_NC(info);
		else if (nc == columnItmGrpCst_col_12) doItmGrpCst_col_12_NC(info);
		else if (nc == columnItmGrpCst_col_13) doItmGrpCst_col_13_NC(info);
		else if (nc == columnItmGrpCst_col_14) doItmGrpCst_col_14_NC(info);
		else if (nc == columnItmGrpCst_col_15) doItmGrpCst_col_15_NC(info);
		else if (nc == columnItmGrpCst_col_16) doItmGrpCst_col_16_NC(info);
		else if (nc == columnItmGrpCst_col_17) doItmGrpCst_col_17_NC(info);
		else if (nc == columnItmGrpCst_base_unit_dec_place) doItmGrpCst_base_unit_dec_place_NC(info);
		else if (nc == columnItmGrpCst_amt_dec_place) doItmGrpCst_amt_dec_place_NC(info);
		else if (nc == columnItmGrpCst_rate_dec_place) doItmGrpCst_rate_dec_place_NC(info);
		else if (nc == columnItmGrpCst_itm_grp_cd) doItmGrpCst_itm_grp_cd_NC(info);
		else if (nc == columnItmGrpCst_cst_cd_key) doItmGrpCst_cst_cd_key_NC(info);
	}

	/**
	 * [MainTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMainTab_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_NC(MCEventInfo info){
	}

	/**
	 * [DptDtlTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtlTab_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtlTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtlTab_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_ym_d]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ym_d_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_trnst_disp_d]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_trnst_disp_d_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_disp_term_d]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_disp_term_d_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_term_d]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_term_d_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_bdg_grp_d]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_bdg_grp_d_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_cd_d]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_cd_d_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_nm_d]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_nm_d_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[use_act_xrate_flg_d]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_use_act_xrate_flg_d_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_lvl_cd_d]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_lvl_cd_d_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_lvl_nm_d]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_lvl_nm_d_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd_d]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_d_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm_d]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_d_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_ym_ig]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ym_ig_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_trnst_disp_ig]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_trnst_disp_ig_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_disp_term_ig]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_disp_term_ig_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_term_ig]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_term_ig_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_bdg_grp_ig]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_bdg_grp_ig_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_cd_ig]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_cd_ig_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_nm_ig]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_nm_ig_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[use_act_xrate_flg_ig]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_use_act_xrate_flg_ig_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_lvl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_lvl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_cd_ig]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_cd_ig_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_nm_ig]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_nm_ig_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[unit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slo_bl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_bl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slo_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[spln_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_spln_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[spln_per_cmpl_sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_spln_per_cmpl_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bdg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bdg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bdg_per_cmpl_sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bdg_per_cmpl_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prof_amt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prof_amt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prof_rate_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prof_rate_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[big_num_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_big_num_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[big_num_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_big_num_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[itm_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_itm_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[itm_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_itm_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[row_sort_col]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_row_sort_col_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[row_title_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_row_title_nm_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[slo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_slo_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[slo_bl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_slo_bl_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_sls_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[sum]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_sum_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[spln]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_spln_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[spln_per_cmpl_slo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_spln_per_cmpl_slo_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[spln_per_cmpl_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_spln_per_cmpl_sls_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[bdg_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_bdg_sls_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[bdg_per_cmpl_slo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_bdg_per_cmpl_slo_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[bdg_per_cmpl_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_bdg_per_cmpl_sls_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_00]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_00_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_01]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_01_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_02]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_02_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_03]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_03_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_04]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_04_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_05]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_05_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_06]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_06_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_07]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_07_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_08]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_08_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_09]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_09_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_10_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_11_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_12_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_13_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_14_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_15_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_16_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_17_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[dpt1_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_dpt1_key_NC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[dpt_nm1_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_dpt_nm1_key_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[dw_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_dw_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[dw_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_dw_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[row_sort_col]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_row_sort_col_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[row_title_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_row_title_nm_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[slo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_slo_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[slo_bl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_slo_bl_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_sls_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[sum]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_sum_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[spln]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_spln_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[spln_per_cmpl_slo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_spln_per_cmpl_slo_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[spln_per_cmpl_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_spln_per_cmpl_sls_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[bdg_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_bdg_sls_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[bdg_per_cmpl_slo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_bdg_per_cmpl_slo_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[bdg_per_cmpl_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_bdg_per_cmpl_sls_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_00]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_00_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_01]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_01_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_02]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_02_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_03]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_03_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_04]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_04_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_05]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_05_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_06]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_06_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_07]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_07_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_08]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_08_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_09]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_09_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_10_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_11_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_12_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_13_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_14_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_15_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_16_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_17_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[dpt2_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_dpt2_key_NC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[dpt_nm2_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_dpt_nm2_key_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[sls_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_sls_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[sls_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_sls_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[row_sort_col]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_row_sort_col_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[row_title_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_row_title_nm_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[slo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_slo_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[slo_bl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_slo_bl_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_sls_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[sum]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_sum_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[spln]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_spln_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[spln_per_cmpl_slo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_spln_per_cmpl_slo_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[spln_per_cmpl_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_spln_per_cmpl_sls_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[bdg_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_bdg_sls_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[bdg_per_cmpl_slo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_bdg_per_cmpl_slo_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[bdg_per_cmpl_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_bdg_per_cmpl_sls_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_00]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_00_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_01]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_01_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_02]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_02_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_03]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_03_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_04]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_04_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_05]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_05_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_06]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_06_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_07]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_07_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_08]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_08_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_09]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_09_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_10_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_11_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_12_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_13_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_14_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_15_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_16_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_17_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[sls_usr_cd_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_sls_usr_cd_key_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[row_sort_col]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_row_sort_col_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[row_title_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_row_title_nm_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[slo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_slo_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[slo_bl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_slo_bl_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_sls_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[sum]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_sum_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[spln]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_spln_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[spln_per_cmpl_slo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_spln_per_cmpl_slo_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[spln_per_cmpl_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_spln_per_cmpl_sls_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[bdg_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_bdg_sls_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[bdg_per_cmpl_slo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_bdg_per_cmpl_slo_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[bdg_per_cmpl_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_bdg_per_cmpl_sls_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_00]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_00_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_01]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_01_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_02]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_02_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_03]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_03_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_04]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_04_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_05]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_05_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_06]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_06_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_07]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_07_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_08]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_08_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_09]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_09_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_10_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_11_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_12_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_13_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_14_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_15_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_16_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_17_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[cst_cd_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_cst_cd_key_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[base_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_base_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[unit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_unit_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[slo_bl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_slo_bl_flg_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[slo_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_slo_flg_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[spln_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_spln_flg_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[spln_per_cmpl_sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_spln_per_cmpl_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[bdg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_bdg_flg_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[bdg_per_cmpl_sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_bdg_per_cmpl_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[prof_amt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_prof_amt_flg_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[prof_rate_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_prof_rate_flg_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[big_num_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_big_num_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[big_num_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_big_num_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[itm_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_itm_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[itm_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_itm_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[row_sort_col]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_row_sort_col_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[row_title_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_row_title_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[slo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_slo_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[slo_bl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_slo_bl_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_sls_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[sum]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_sum_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[spln]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_spln_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[spln_per_cmpl_slo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_spln_per_cmpl_slo_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[spln_per_cmpl_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_spln_per_cmpl_sls_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[bdg_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_bdg_sls_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[bdg_per_cmpl_slo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_bdg_per_cmpl_slo_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[bdg_per_cmpl_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_bdg_per_cmpl_sls_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_00]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_00_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_01]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_01_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_02]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_02_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_03]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_03_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_04]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_04_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_05]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_05_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_06]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_06_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_07]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_07_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_08]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_08_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_09]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_09_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_10_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_11_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_12_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_13_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_14_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_15_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_16_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_17_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[rate_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_rate_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[itm_grp1_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_itm_grp1_key_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[itm_grp_nm1_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_itm_grp_nm1_key_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[dw_itm_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_dw_itm_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[dw_itm_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_dw_itm_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[row_sort_col]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_row_sort_col_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[row_title_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_row_title_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[slo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_slo_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[slo_bl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_slo_bl_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_sls_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[sum]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_sum_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[spln]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_spln_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[spln_per_cmpl_slo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_spln_per_cmpl_slo_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[spln_per_cmpl_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_spln_per_cmpl_sls_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[bdg_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_bdg_sls_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[bdg_per_cmpl_slo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_bdg_per_cmpl_slo_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[bdg_per_cmpl_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_bdg_per_cmpl_sls_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_00]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_00_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_01]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_01_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_02]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_02_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_03]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_03_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_04]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_04_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_05]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_05_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_06]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_06_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_07]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_07_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_08]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_08_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_09]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_09_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_10_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_11_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_12_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_13_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_14_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_15_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_16_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_17_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[rate_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_rate_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[itm_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_itm_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[itm_grp2_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_itm_grp2_key_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[row_sort_col]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_row_sort_col_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[row_title_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_row_title_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[slo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_slo_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[slo_bl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_slo_bl_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_sls_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[sum]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_sum_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[spln]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_spln_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[spln_per_cmpl_slo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_spln_per_cmpl_slo_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[spln_per_cmpl_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_spln_per_cmpl_sls_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[bdg_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_bdg_sls_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[bdg_per_cmpl_slo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_bdg_per_cmpl_slo_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[bdg_per_cmpl_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_bdg_per_cmpl_sls_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_00]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_00_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_01]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_01_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_02]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_02_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_03]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_03_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_04]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_04_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_05]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_05_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_06]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_06_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_07]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_07_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_08]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_08_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_09]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_09_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_10_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_11_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_12_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_13_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_14_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_15_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_16_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_17_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[rate_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_rate_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[itm_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_itm_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[itm_cd_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_itm_cd_key_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[itm_sub1_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_itm_sub1_key_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[itm_sub2_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_itm_sub2_key_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[itm_sub3_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_itm_sub3_key_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[row_sort_col]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_row_sort_col_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[row_title_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_row_title_nm_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[slo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_slo_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[slo_bl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_slo_bl_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_sls_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[sum]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_sum_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[spln]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_spln_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[spln_per_cmpl_slo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_spln_per_cmpl_slo_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[spln_per_cmpl_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_spln_per_cmpl_sls_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[bdg_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_bdg_sls_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[bdg_per_cmpl_slo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_bdg_per_cmpl_slo_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[bdg_per_cmpl_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_bdg_per_cmpl_sls_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_00]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_00_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_01]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_01_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_02]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_02_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_03]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_03_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_04]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_04_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_05]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_05_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_06]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_06_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_07]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_07_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_08]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_08_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_09]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_09_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_10_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_11_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_12_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_13_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_14_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_15_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_16_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_17_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[rate_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_rate_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[itm_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_itm_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[cst_cd_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_cst_cd_key_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == MainTabTab) doMainTab_NE(info);
		else if (ne == DptDtl1Table) doDptDtl1_NE(info);
		else if (ne == DptDtlTabTab) doDptDtlTab_NE(info);
		else if (ne == DptDwDptTable) doDptDwDpt_NE(info);
		else if (ne == DptSlsUsrTable) doDptSlsUsr_NE(info);
		else if (ne == DptCstTable) doDptCst_NE(info);
		else if (ne == ItmGrpDtl1Table) doItmGrpDtl1_NE(info);
		else if (ne == ItmGrpDtlTabTab) doItmGrpDtlTab_NE(info);
		else if (ne == ItmGrpDwItmGrpTable) doItmGrpDwItmGrp_NE(info);
		else if (ne == ItmGrpItmTable) doItmGrpItm_NE(info);
		else if (ne == ItmGrpCstTable) doItmGrpCst_NE(info);
		else if (ne == Cnd_inpt_ym_d) doCnd_inpt_ym_d_NE(info);
		else if (ne == Cnd_sls_trnst_disp_d) doCnd_sls_trnst_disp_d_NE(info);
		else if (ne == Cnd_sls_disp_term_d) doCnd_sls_disp_term_d_NE(info);
		else if (ne == Cnd_sum_term_d) doCnd_sum_term_d_NE(info);
		else if (ne == Cnd_sls_bdg_grp_d) doCnd_sls_bdg_grp_d_NE(info);
		else if (ne == Cnd_xrate_cd_d) doCnd_xrate_cd_d_NE(info);
		else if (ne == Cnd_xrate_nm_d) doCnd_xrate_nm_d_NE(info);
		else if (ne == Cnd_use_act_xrate_flg_d) doCnd_use_act_xrate_flg_d_NE(info);
		else if (ne == Cnd_dpt_lvl_cd_d) doCnd_dpt_lvl_cd_d_NE(info);
		else if (ne == Cnd_dpt_lvl_nm_d) doCnd_dpt_lvl_nm_d_NE(info);
		else if (ne == Cnd_dpt_cd_d) doCnd_dpt_cd_d_NE(info);
		else if (ne == Cnd_dpt_nm_d) doCnd_dpt_nm_d_NE(info);
		else if (ne == Cnd_inpt_ym_ig) doCnd_inpt_ym_ig_NE(info);
		else if (ne == Cnd_sls_trnst_disp_ig) doCnd_sls_trnst_disp_ig_NE(info);
		else if (ne == Cnd_sls_disp_term_ig) doCnd_sls_disp_term_ig_NE(info);
		else if (ne == Cnd_sum_term_ig) doCnd_sum_term_ig_NE(info);
		else if (ne == Cnd_sls_bdg_grp_ig) doCnd_sls_bdg_grp_ig_NE(info);
		else if (ne == Cnd_xrate_cd_ig) doCnd_xrate_cd_ig_NE(info);
		else if (ne == Cnd_xrate_nm_ig) doCnd_xrate_nm_ig_NE(info);
		else if (ne == Cnd_use_act_xrate_flg_ig) doCnd_use_act_xrate_flg_ig_NE(info);
		else if (ne == Cnd_sls_itm_grp_lvl) doCnd_sls_itm_grp_lvl_NE(info);
		else if (ne == Cnd_sls_itm_grp_cd_ig) doCnd_sls_itm_grp_cd_ig_NE(info);
		else if (ne == Cnd_sls_itm_grp_nm_ig) doCnd_sls_itm_grp_nm_ig_NE(info);
		else if (ne == Hdr_base_cur_cd) doHdr_base_cur_cd_NE(info);
		else if (ne == Hdr_base_cur_nm) doHdr_base_cur_nm_NE(info);
		else if (ne == Hdr_unit) doHdr_unit_NE(info);
		else if (ne == Hdr_sls_flg) doHdr_sls_flg_NE(info);
		else if (ne == Hdr_slo_bl_flg) doHdr_slo_bl_flg_NE(info);
		else if (ne == Hdr_slo_flg) doHdr_slo_flg_NE(info);
		else if (ne == Hdr_spln_flg) doHdr_spln_flg_NE(info);
		else if (ne == Hdr_spln_per_cmpl_sls_flg) doHdr_spln_per_cmpl_sls_flg_NE(info);
		else if (ne == Hdr_bdg_flg) doHdr_bdg_flg_NE(info);
		else if (ne == Hdr_bdg_per_cmpl_sls_flg) doHdr_bdg_per_cmpl_sls_flg_NE(info);
		else if (ne == Hdr_prof_amt_flg) doHdr_prof_amt_flg_NE(info);
		else if (ne == Hdr_prof_rate_flg) doHdr_prof_rate_flg_NE(info);
		else if (ne == Hdr_big_num_rnd_typ) doHdr_big_num_rnd_typ_NE(info);
		else if (ne == Hdr_big_num_rnd_typ_nm) doHdr_big_num_rnd_typ_nm_NE(info);
		else if (ne == columnDptDtl1_dpt_cd) doDptDtl1_dpt_cd_NE(info);
		else if (ne == columnDptDtl1_dpt_nm) doDptDtl1_dpt_nm_NE(info);
		else if (ne == columnDptDtl1_itm_grp_cd) doDptDtl1_itm_grp_cd_NE(info);
		else if (ne == columnDptDtl1_itm_grp_nm) doDptDtl1_itm_grp_nm_NE(info);
		else if (ne == columnDptDtl1_row_sort_col) doDptDtl1_row_sort_col_NE(info);
		else if (ne == columnDptDtl1_row_title_nm) doDptDtl1_row_title_nm_NE(info);
		else if (ne == columnDptDtl1_slo) doDptDtl1_slo_NE(info);
		else if (ne == columnDptDtl1_slo_bl) doDptDtl1_slo_bl_NE(info);
		else if (ne == columnDptDtl1_sls) doDptDtl1_sls_NE(info);
		else if (ne == columnDptDtl1_sum) doDptDtl1_sum_NE(info);
		else if (ne == columnDptDtl1_spln) doDptDtl1_spln_NE(info);
		else if (ne == columnDptDtl1_spln_per_cmpl_slo) doDptDtl1_spln_per_cmpl_slo_NE(info);
		else if (ne == columnDptDtl1_spln_per_cmpl_sls) doDptDtl1_spln_per_cmpl_sls_NE(info);
		else if (ne == columnDptDtl1_bdg_sls) doDptDtl1_bdg_sls_NE(info);
		else if (ne == columnDptDtl1_bdg_per_cmpl_slo) doDptDtl1_bdg_per_cmpl_slo_NE(info);
		else if (ne == columnDptDtl1_bdg_per_cmpl_sls) doDptDtl1_bdg_per_cmpl_sls_NE(info);
		else if (ne == columnDptDtl1_col_00) doDptDtl1_col_00_NE(info);
		else if (ne == columnDptDtl1_col_01) doDptDtl1_col_01_NE(info);
		else if (ne == columnDptDtl1_col_02) doDptDtl1_col_02_NE(info);
		else if (ne == columnDptDtl1_col_03) doDptDtl1_col_03_NE(info);
		else if (ne == columnDptDtl1_col_04) doDptDtl1_col_04_NE(info);
		else if (ne == columnDptDtl1_col_05) doDptDtl1_col_05_NE(info);
		else if (ne == columnDptDtl1_col_06) doDptDtl1_col_06_NE(info);
		else if (ne == columnDptDtl1_col_07) doDptDtl1_col_07_NE(info);
		else if (ne == columnDptDtl1_col_08) doDptDtl1_col_08_NE(info);
		else if (ne == columnDptDtl1_col_09) doDptDtl1_col_09_NE(info);
		else if (ne == columnDptDtl1_col_10) doDptDtl1_col_10_NE(info);
		else if (ne == columnDptDtl1_col_11) doDptDtl1_col_11_NE(info);
		else if (ne == columnDptDtl1_col_12) doDptDtl1_col_12_NE(info);
		else if (ne == columnDptDtl1_col_13) doDptDtl1_col_13_NE(info);
		else if (ne == columnDptDtl1_col_14) doDptDtl1_col_14_NE(info);
		else if (ne == columnDptDtl1_col_15) doDptDtl1_col_15_NE(info);
		else if (ne == columnDptDtl1_col_16) doDptDtl1_col_16_NE(info);
		else if (ne == columnDptDtl1_col_17) doDptDtl1_col_17_NE(info);
		else if (ne == columnDptDtl1_dpt1_key) doDptDtl1_dpt1_key_NE(info);
		else if (ne == columnDptDtl1_dpt_nm1_key) doDptDtl1_dpt_nm1_key_NE(info);
		else if (ne == columnDptDwDpt_dw_dpt_cd) doDptDwDpt_dw_dpt_cd_NE(info);
		else if (ne == columnDptDwDpt_dw_dpt_nm) doDptDwDpt_dw_dpt_nm_NE(info);
		else if (ne == columnDptDwDpt_row_sort_col) doDptDwDpt_row_sort_col_NE(info);
		else if (ne == columnDptDwDpt_row_title_nm) doDptDwDpt_row_title_nm_NE(info);
		else if (ne == columnDptDwDpt_slo) doDptDwDpt_slo_NE(info);
		else if (ne == columnDptDwDpt_slo_bl) doDptDwDpt_slo_bl_NE(info);
		else if (ne == columnDptDwDpt_sls) doDptDwDpt_sls_NE(info);
		else if (ne == columnDptDwDpt_sum) doDptDwDpt_sum_NE(info);
		else if (ne == columnDptDwDpt_spln) doDptDwDpt_spln_NE(info);
		else if (ne == columnDptDwDpt_spln_per_cmpl_slo) doDptDwDpt_spln_per_cmpl_slo_NE(info);
		else if (ne == columnDptDwDpt_spln_per_cmpl_sls) doDptDwDpt_spln_per_cmpl_sls_NE(info);
		else if (ne == columnDptDwDpt_bdg_sls) doDptDwDpt_bdg_sls_NE(info);
		else if (ne == columnDptDwDpt_bdg_per_cmpl_slo) doDptDwDpt_bdg_per_cmpl_slo_NE(info);
		else if (ne == columnDptDwDpt_bdg_per_cmpl_sls) doDptDwDpt_bdg_per_cmpl_sls_NE(info);
		else if (ne == columnDptDwDpt_col_00) doDptDwDpt_col_00_NE(info);
		else if (ne == columnDptDwDpt_col_01) doDptDwDpt_col_01_NE(info);
		else if (ne == columnDptDwDpt_col_02) doDptDwDpt_col_02_NE(info);
		else if (ne == columnDptDwDpt_col_03) doDptDwDpt_col_03_NE(info);
		else if (ne == columnDptDwDpt_col_04) doDptDwDpt_col_04_NE(info);
		else if (ne == columnDptDwDpt_col_05) doDptDwDpt_col_05_NE(info);
		else if (ne == columnDptDwDpt_col_06) doDptDwDpt_col_06_NE(info);
		else if (ne == columnDptDwDpt_col_07) doDptDwDpt_col_07_NE(info);
		else if (ne == columnDptDwDpt_col_08) doDptDwDpt_col_08_NE(info);
		else if (ne == columnDptDwDpt_col_09) doDptDwDpt_col_09_NE(info);
		else if (ne == columnDptDwDpt_col_10) doDptDwDpt_col_10_NE(info);
		else if (ne == columnDptDwDpt_col_11) doDptDwDpt_col_11_NE(info);
		else if (ne == columnDptDwDpt_col_12) doDptDwDpt_col_12_NE(info);
		else if (ne == columnDptDwDpt_col_13) doDptDwDpt_col_13_NE(info);
		else if (ne == columnDptDwDpt_col_14) doDptDwDpt_col_14_NE(info);
		else if (ne == columnDptDwDpt_col_15) doDptDwDpt_col_15_NE(info);
		else if (ne == columnDptDwDpt_col_16) doDptDwDpt_col_16_NE(info);
		else if (ne == columnDptDwDpt_col_17) doDptDwDpt_col_17_NE(info);
		else if (ne == columnDptDwDpt_dpt_cd) doDptDwDpt_dpt_cd_NE(info);
		else if (ne == columnDptDwDpt_dpt_nm) doDptDwDpt_dpt_nm_NE(info);
		else if (ne == columnDptDwDpt_dpt2_key) doDptDwDpt_dpt2_key_NE(info);
		else if (ne == columnDptDwDpt_dpt_nm2_key) doDptDwDpt_dpt_nm2_key_NE(info);
		else if (ne == columnDptSlsUsr_sls_usr_cd) doDptSlsUsr_sls_usr_cd_NE(info);
		else if (ne == columnDptSlsUsr_sls_usr_nm) doDptSlsUsr_sls_usr_nm_NE(info);
		else if (ne == columnDptSlsUsr_row_sort_col) doDptSlsUsr_row_sort_col_NE(info);
		else if (ne == columnDptSlsUsr_row_title_nm) doDptSlsUsr_row_title_nm_NE(info);
		else if (ne == columnDptSlsUsr_slo) doDptSlsUsr_slo_NE(info);
		else if (ne == columnDptSlsUsr_slo_bl) doDptSlsUsr_slo_bl_NE(info);
		else if (ne == columnDptSlsUsr_sls) doDptSlsUsr_sls_NE(info);
		else if (ne == columnDptSlsUsr_sum) doDptSlsUsr_sum_NE(info);
		else if (ne == columnDptSlsUsr_spln) doDptSlsUsr_spln_NE(info);
		else if (ne == columnDptSlsUsr_spln_per_cmpl_slo) doDptSlsUsr_spln_per_cmpl_slo_NE(info);
		else if (ne == columnDptSlsUsr_spln_per_cmpl_sls) doDptSlsUsr_spln_per_cmpl_sls_NE(info);
		else if (ne == columnDptSlsUsr_bdg_sls) doDptSlsUsr_bdg_sls_NE(info);
		else if (ne == columnDptSlsUsr_bdg_per_cmpl_slo) doDptSlsUsr_bdg_per_cmpl_slo_NE(info);
		else if (ne == columnDptSlsUsr_bdg_per_cmpl_sls) doDptSlsUsr_bdg_per_cmpl_sls_NE(info);
		else if (ne == columnDptSlsUsr_col_00) doDptSlsUsr_col_00_NE(info);
		else if (ne == columnDptSlsUsr_col_01) doDptSlsUsr_col_01_NE(info);
		else if (ne == columnDptSlsUsr_col_02) doDptSlsUsr_col_02_NE(info);
		else if (ne == columnDptSlsUsr_col_03) doDptSlsUsr_col_03_NE(info);
		else if (ne == columnDptSlsUsr_col_04) doDptSlsUsr_col_04_NE(info);
		else if (ne == columnDptSlsUsr_col_05) doDptSlsUsr_col_05_NE(info);
		else if (ne == columnDptSlsUsr_col_06) doDptSlsUsr_col_06_NE(info);
		else if (ne == columnDptSlsUsr_col_07) doDptSlsUsr_col_07_NE(info);
		else if (ne == columnDptSlsUsr_col_08) doDptSlsUsr_col_08_NE(info);
		else if (ne == columnDptSlsUsr_col_09) doDptSlsUsr_col_09_NE(info);
		else if (ne == columnDptSlsUsr_col_10) doDptSlsUsr_col_10_NE(info);
		else if (ne == columnDptSlsUsr_col_11) doDptSlsUsr_col_11_NE(info);
		else if (ne == columnDptSlsUsr_col_12) doDptSlsUsr_col_12_NE(info);
		else if (ne == columnDptSlsUsr_col_13) doDptSlsUsr_col_13_NE(info);
		else if (ne == columnDptSlsUsr_col_14) doDptSlsUsr_col_14_NE(info);
		else if (ne == columnDptSlsUsr_col_15) doDptSlsUsr_col_15_NE(info);
		else if (ne == columnDptSlsUsr_col_16) doDptSlsUsr_col_16_NE(info);
		else if (ne == columnDptSlsUsr_col_17) doDptSlsUsr_col_17_NE(info);
		else if (ne == columnDptSlsUsr_dpt_cd) doDptSlsUsr_dpt_cd_NE(info);
		else if (ne == columnDptSlsUsr_dpt_nm) doDptSlsUsr_dpt_nm_NE(info);
		else if (ne == columnDptSlsUsr_sls_usr_cd_key) doDptSlsUsr_sls_usr_cd_key_NE(info);
		else if (ne == columnDptCst_cst_cd) doDptCst_cst_cd_NE(info);
		else if (ne == columnDptCst_cst_nm) doDptCst_cst_nm_NE(info);
		else if (ne == columnDptCst_row_sort_col) doDptCst_row_sort_col_NE(info);
		else if (ne == columnDptCst_row_title_nm) doDptCst_row_title_nm_NE(info);
		else if (ne == columnDptCst_slo) doDptCst_slo_NE(info);
		else if (ne == columnDptCst_slo_bl) doDptCst_slo_bl_NE(info);
		else if (ne == columnDptCst_sls) doDptCst_sls_NE(info);
		else if (ne == columnDptCst_sum) doDptCst_sum_NE(info);
		else if (ne == columnDptCst_spln) doDptCst_spln_NE(info);
		else if (ne == columnDptCst_spln_per_cmpl_slo) doDptCst_spln_per_cmpl_slo_NE(info);
		else if (ne == columnDptCst_spln_per_cmpl_sls) doDptCst_spln_per_cmpl_sls_NE(info);
		else if (ne == columnDptCst_bdg_sls) doDptCst_bdg_sls_NE(info);
		else if (ne == columnDptCst_bdg_per_cmpl_slo) doDptCst_bdg_per_cmpl_slo_NE(info);
		else if (ne == columnDptCst_bdg_per_cmpl_sls) doDptCst_bdg_per_cmpl_sls_NE(info);
		else if (ne == columnDptCst_col_00) doDptCst_col_00_NE(info);
		else if (ne == columnDptCst_col_01) doDptCst_col_01_NE(info);
		else if (ne == columnDptCst_col_02) doDptCst_col_02_NE(info);
		else if (ne == columnDptCst_col_03) doDptCst_col_03_NE(info);
		else if (ne == columnDptCst_col_04) doDptCst_col_04_NE(info);
		else if (ne == columnDptCst_col_05) doDptCst_col_05_NE(info);
		else if (ne == columnDptCst_col_06) doDptCst_col_06_NE(info);
		else if (ne == columnDptCst_col_07) doDptCst_col_07_NE(info);
		else if (ne == columnDptCst_col_08) doDptCst_col_08_NE(info);
		else if (ne == columnDptCst_col_09) doDptCst_col_09_NE(info);
		else if (ne == columnDptCst_col_10) doDptCst_col_10_NE(info);
		else if (ne == columnDptCst_col_11) doDptCst_col_11_NE(info);
		else if (ne == columnDptCst_col_12) doDptCst_col_12_NE(info);
		else if (ne == columnDptCst_col_13) doDptCst_col_13_NE(info);
		else if (ne == columnDptCst_col_14) doDptCst_col_14_NE(info);
		else if (ne == columnDptCst_col_15) doDptCst_col_15_NE(info);
		else if (ne == columnDptCst_col_16) doDptCst_col_16_NE(info);
		else if (ne == columnDptCst_col_17) doDptCst_col_17_NE(info);
		else if (ne == columnDptCst_dpt_cd) doDptCst_dpt_cd_NE(info);
		else if (ne == columnDptCst_dpt_nm) doDptCst_dpt_nm_NE(info);
		else if (ne == columnDptCst_cst_cd_key) doDptCst_cst_cd_key_NE(info);
		else if (ne == ItmGrpHdr_base_cur_cd) doItmGrpHdr_base_cur_cd_NE(info);
		else if (ne == ItmGrpHdr_base_cur_nm) doItmGrpHdr_base_cur_nm_NE(info);
		else if (ne == ItmGrpHdr_unit) doItmGrpHdr_unit_NE(info);
		else if (ne == ItmGrpHdr_sls_flg) doItmGrpHdr_sls_flg_NE(info);
		else if (ne == ItmGrpHdr_slo_bl_flg) doItmGrpHdr_slo_bl_flg_NE(info);
		else if (ne == ItmGrpHdr_slo_flg) doItmGrpHdr_slo_flg_NE(info);
		else if (ne == ItmGrpHdr_spln_flg) doItmGrpHdr_spln_flg_NE(info);
		else if (ne == ItmGrpHdr_spln_per_cmpl_sls_flg) doItmGrpHdr_spln_per_cmpl_sls_flg_NE(info);
		else if (ne == ItmGrpHdr_bdg_flg) doItmGrpHdr_bdg_flg_NE(info);
		else if (ne == ItmGrpHdr_bdg_per_cmpl_sls_flg) doItmGrpHdr_bdg_per_cmpl_sls_flg_NE(info);
		else if (ne == ItmGrpHdr_prof_amt_flg) doItmGrpHdr_prof_amt_flg_NE(info);
		else if (ne == ItmGrpHdr_prof_rate_flg) doItmGrpHdr_prof_rate_flg_NE(info);
		else if (ne == ItmGrpHdr_big_num_rnd_typ) doItmGrpHdr_big_num_rnd_typ_NE(info);
		else if (ne == ItmGrpHdr_big_num_rnd_typ_nm) doItmGrpHdr_big_num_rnd_typ_nm_NE(info);
		else if (ne == columnItmGrpDtl1_itm_grp_cd) doItmGrpDtl1_itm_grp_cd_NE(info);
		else if (ne == columnItmGrpDtl1_itm_grp_nm) doItmGrpDtl1_itm_grp_nm_NE(info);
		else if (ne == columnItmGrpDtl1_row_sort_col) doItmGrpDtl1_row_sort_col_NE(info);
		else if (ne == columnItmGrpDtl1_row_title_nm) doItmGrpDtl1_row_title_nm_NE(info);
		else if (ne == columnItmGrpDtl1_slo) doItmGrpDtl1_slo_NE(info);
		else if (ne == columnItmGrpDtl1_slo_bl) doItmGrpDtl1_slo_bl_NE(info);
		else if (ne == columnItmGrpDtl1_sls) doItmGrpDtl1_sls_NE(info);
		else if (ne == columnItmGrpDtl1_sum) doItmGrpDtl1_sum_NE(info);
		else if (ne == columnItmGrpDtl1_spln) doItmGrpDtl1_spln_NE(info);
		else if (ne == columnItmGrpDtl1_spln_per_cmpl_slo) doItmGrpDtl1_spln_per_cmpl_slo_NE(info);
		else if (ne == columnItmGrpDtl1_spln_per_cmpl_sls) doItmGrpDtl1_spln_per_cmpl_sls_NE(info);
		else if (ne == columnItmGrpDtl1_bdg_sls) doItmGrpDtl1_bdg_sls_NE(info);
		else if (ne == columnItmGrpDtl1_bdg_per_cmpl_slo) doItmGrpDtl1_bdg_per_cmpl_slo_NE(info);
		else if (ne == columnItmGrpDtl1_bdg_per_cmpl_sls) doItmGrpDtl1_bdg_per_cmpl_sls_NE(info);
		else if (ne == columnItmGrpDtl1_col_00) doItmGrpDtl1_col_00_NE(info);
		else if (ne == columnItmGrpDtl1_col_01) doItmGrpDtl1_col_01_NE(info);
		else if (ne == columnItmGrpDtl1_col_02) doItmGrpDtl1_col_02_NE(info);
		else if (ne == columnItmGrpDtl1_col_03) doItmGrpDtl1_col_03_NE(info);
		else if (ne == columnItmGrpDtl1_col_04) doItmGrpDtl1_col_04_NE(info);
		else if (ne == columnItmGrpDtl1_col_05) doItmGrpDtl1_col_05_NE(info);
		else if (ne == columnItmGrpDtl1_col_06) doItmGrpDtl1_col_06_NE(info);
		else if (ne == columnItmGrpDtl1_col_07) doItmGrpDtl1_col_07_NE(info);
		else if (ne == columnItmGrpDtl1_col_08) doItmGrpDtl1_col_08_NE(info);
		else if (ne == columnItmGrpDtl1_col_09) doItmGrpDtl1_col_09_NE(info);
		else if (ne == columnItmGrpDtl1_col_10) doItmGrpDtl1_col_10_NE(info);
		else if (ne == columnItmGrpDtl1_col_11) doItmGrpDtl1_col_11_NE(info);
		else if (ne == columnItmGrpDtl1_col_12) doItmGrpDtl1_col_12_NE(info);
		else if (ne == columnItmGrpDtl1_col_13) doItmGrpDtl1_col_13_NE(info);
		else if (ne == columnItmGrpDtl1_col_14) doItmGrpDtl1_col_14_NE(info);
		else if (ne == columnItmGrpDtl1_col_15) doItmGrpDtl1_col_15_NE(info);
		else if (ne == columnItmGrpDtl1_col_16) doItmGrpDtl1_col_16_NE(info);
		else if (ne == columnItmGrpDtl1_col_17) doItmGrpDtl1_col_17_NE(info);
		else if (ne == columnItmGrpDtl1_amt_dec_place) doItmGrpDtl1_amt_dec_place_NE(info);
		else if (ne == columnItmGrpDtl1_rate_dec_place) doItmGrpDtl1_rate_dec_place_NE(info);
		else if (ne == columnItmGrpDtl1_itm_grp1_key) doItmGrpDtl1_itm_grp1_key_NE(info);
		else if (ne == columnItmGrpDtl1_itm_grp_nm1_key) doItmGrpDtl1_itm_grp_nm1_key_NE(info);
		else if (ne == columnItmGrpDwItmGrp_dw_itm_grp_cd) doItmGrpDwItmGrp_dw_itm_grp_cd_NE(info);
		else if (ne == columnItmGrpDwItmGrp_dw_itm_grp_nm) doItmGrpDwItmGrp_dw_itm_grp_nm_NE(info);
		else if (ne == columnItmGrpDwItmGrp_row_sort_col) doItmGrpDwItmGrp_row_sort_col_NE(info);
		else if (ne == columnItmGrpDwItmGrp_row_title_nm) doItmGrpDwItmGrp_row_title_nm_NE(info);
		else if (ne == columnItmGrpDwItmGrp_slo) doItmGrpDwItmGrp_slo_NE(info);
		else if (ne == columnItmGrpDwItmGrp_slo_bl) doItmGrpDwItmGrp_slo_bl_NE(info);
		else if (ne == columnItmGrpDwItmGrp_sls) doItmGrpDwItmGrp_sls_NE(info);
		else if (ne == columnItmGrpDwItmGrp_sum) doItmGrpDwItmGrp_sum_NE(info);
		else if (ne == columnItmGrpDwItmGrp_spln) doItmGrpDwItmGrp_spln_NE(info);
		else if (ne == columnItmGrpDwItmGrp_spln_per_cmpl_slo) doItmGrpDwItmGrp_spln_per_cmpl_slo_NE(info);
		else if (ne == columnItmGrpDwItmGrp_spln_per_cmpl_sls) doItmGrpDwItmGrp_spln_per_cmpl_sls_NE(info);
		else if (ne == columnItmGrpDwItmGrp_bdg_sls) doItmGrpDwItmGrp_bdg_sls_NE(info);
		else if (ne == columnItmGrpDwItmGrp_bdg_per_cmpl_slo) doItmGrpDwItmGrp_bdg_per_cmpl_slo_NE(info);
		else if (ne == columnItmGrpDwItmGrp_bdg_per_cmpl_sls) doItmGrpDwItmGrp_bdg_per_cmpl_sls_NE(info);
		else if (ne == columnItmGrpDwItmGrp_col_00) doItmGrpDwItmGrp_col_00_NE(info);
		else if (ne == columnItmGrpDwItmGrp_col_01) doItmGrpDwItmGrp_col_01_NE(info);
		else if (ne == columnItmGrpDwItmGrp_col_02) doItmGrpDwItmGrp_col_02_NE(info);
		else if (ne == columnItmGrpDwItmGrp_col_03) doItmGrpDwItmGrp_col_03_NE(info);
		else if (ne == columnItmGrpDwItmGrp_col_04) doItmGrpDwItmGrp_col_04_NE(info);
		else if (ne == columnItmGrpDwItmGrp_col_05) doItmGrpDwItmGrp_col_05_NE(info);
		else if (ne == columnItmGrpDwItmGrp_col_06) doItmGrpDwItmGrp_col_06_NE(info);
		else if (ne == columnItmGrpDwItmGrp_col_07) doItmGrpDwItmGrp_col_07_NE(info);
		else if (ne == columnItmGrpDwItmGrp_col_08) doItmGrpDwItmGrp_col_08_NE(info);
		else if (ne == columnItmGrpDwItmGrp_col_09) doItmGrpDwItmGrp_col_09_NE(info);
		else if (ne == columnItmGrpDwItmGrp_col_10) doItmGrpDwItmGrp_col_10_NE(info);
		else if (ne == columnItmGrpDwItmGrp_col_11) doItmGrpDwItmGrp_col_11_NE(info);
		else if (ne == columnItmGrpDwItmGrp_col_12) doItmGrpDwItmGrp_col_12_NE(info);
		else if (ne == columnItmGrpDwItmGrp_col_13) doItmGrpDwItmGrp_col_13_NE(info);
		else if (ne == columnItmGrpDwItmGrp_col_14) doItmGrpDwItmGrp_col_14_NE(info);
		else if (ne == columnItmGrpDwItmGrp_col_15) doItmGrpDwItmGrp_col_15_NE(info);
		else if (ne == columnItmGrpDwItmGrp_col_16) doItmGrpDwItmGrp_col_16_NE(info);
		else if (ne == columnItmGrpDwItmGrp_col_17) doItmGrpDwItmGrp_col_17_NE(info);
		else if (ne == columnItmGrpDwItmGrp_base_unit_dec_place) doItmGrpDwItmGrp_base_unit_dec_place_NE(info);
		else if (ne == columnItmGrpDwItmGrp_amt_dec_place) doItmGrpDwItmGrp_amt_dec_place_NE(info);
		else if (ne == columnItmGrpDwItmGrp_rate_dec_place) doItmGrpDwItmGrp_rate_dec_place_NE(info);
		else if (ne == columnItmGrpDwItmGrp_itm_grp_cd) doItmGrpDwItmGrp_itm_grp_cd_NE(info);
		else if (ne == columnItmGrpDwItmGrp_itm_grp2_key) doItmGrpDwItmGrp_itm_grp2_key_NE(info);
		else if (ne == columnItmGrpItm_row_sort_col) doItmGrpItm_row_sort_col_NE(info);
		else if (ne == columnItmGrpItm_row_title_nm) doItmGrpItm_row_title_nm_NE(info);
		else if (ne == columnItmGrpItm_slo) doItmGrpItm_slo_NE(info);
		else if (ne == columnItmGrpItm_slo_bl) doItmGrpItm_slo_bl_NE(info);
		else if (ne == columnItmGrpItm_sls) doItmGrpItm_sls_NE(info);
		else if (ne == columnItmGrpItm_sum) doItmGrpItm_sum_NE(info);
		else if (ne == columnItmGrpItm_spln) doItmGrpItm_spln_NE(info);
		else if (ne == columnItmGrpItm_spln_per_cmpl_slo) doItmGrpItm_spln_per_cmpl_slo_NE(info);
		else if (ne == columnItmGrpItm_spln_per_cmpl_sls) doItmGrpItm_spln_per_cmpl_sls_NE(info);
		else if (ne == columnItmGrpItm_bdg_sls) doItmGrpItm_bdg_sls_NE(info);
		else if (ne == columnItmGrpItm_bdg_per_cmpl_slo) doItmGrpItm_bdg_per_cmpl_slo_NE(info);
		else if (ne == columnItmGrpItm_bdg_per_cmpl_sls) doItmGrpItm_bdg_per_cmpl_sls_NE(info);
		else if (ne == columnItmGrpItm_col_00) doItmGrpItm_col_00_NE(info);
		else if (ne == columnItmGrpItm_col_01) doItmGrpItm_col_01_NE(info);
		else if (ne == columnItmGrpItm_col_02) doItmGrpItm_col_02_NE(info);
		else if (ne == columnItmGrpItm_col_03) doItmGrpItm_col_03_NE(info);
		else if (ne == columnItmGrpItm_col_04) doItmGrpItm_col_04_NE(info);
		else if (ne == columnItmGrpItm_col_05) doItmGrpItm_col_05_NE(info);
		else if (ne == columnItmGrpItm_col_06) doItmGrpItm_col_06_NE(info);
		else if (ne == columnItmGrpItm_col_07) doItmGrpItm_col_07_NE(info);
		else if (ne == columnItmGrpItm_col_08) doItmGrpItm_col_08_NE(info);
		else if (ne == columnItmGrpItm_col_09) doItmGrpItm_col_09_NE(info);
		else if (ne == columnItmGrpItm_col_10) doItmGrpItm_col_10_NE(info);
		else if (ne == columnItmGrpItm_col_11) doItmGrpItm_col_11_NE(info);
		else if (ne == columnItmGrpItm_col_12) doItmGrpItm_col_12_NE(info);
		else if (ne == columnItmGrpItm_col_13) doItmGrpItm_col_13_NE(info);
		else if (ne == columnItmGrpItm_col_14) doItmGrpItm_col_14_NE(info);
		else if (ne == columnItmGrpItm_col_15) doItmGrpItm_col_15_NE(info);
		else if (ne == columnItmGrpItm_col_16) doItmGrpItm_col_16_NE(info);
		else if (ne == columnItmGrpItm_col_17) doItmGrpItm_col_17_NE(info);
		else if (ne == columnItmGrpItm_base_unit_dec_place) doItmGrpItm_base_unit_dec_place_NE(info);
		else if (ne == columnItmGrpItm_amt_dec_place) doItmGrpItm_amt_dec_place_NE(info);
		else if (ne == columnItmGrpItm_rate_dec_place) doItmGrpItm_rate_dec_place_NE(info);
		else if (ne == columnItmGrpItm_itm_grp_cd) doItmGrpItm_itm_grp_cd_NE(info);
		else if (ne == columnItmGrpItm_itm_cd_key) doItmGrpItm_itm_cd_key_NE(info);
		else if (ne == columnItmGrpItm_itm_sub1_key) doItmGrpItm_itm_sub1_key_NE(info);
		else if (ne == columnItmGrpItm_itm_sub2_key) doItmGrpItm_itm_sub2_key_NE(info);
		else if (ne == columnItmGrpItm_itm_sub3_key) doItmGrpItm_itm_sub3_key_NE(info);
		else if (ne == columnItmGrpCst_cst_cd) doItmGrpCst_cst_cd_NE(info);
		else if (ne == columnItmGrpCst_cst_nm) doItmGrpCst_cst_nm_NE(info);
		else if (ne == columnItmGrpCst_row_sort_col) doItmGrpCst_row_sort_col_NE(info);
		else if (ne == columnItmGrpCst_row_title_nm) doItmGrpCst_row_title_nm_NE(info);
		else if (ne == columnItmGrpCst_slo) doItmGrpCst_slo_NE(info);
		else if (ne == columnItmGrpCst_slo_bl) doItmGrpCst_slo_bl_NE(info);
		else if (ne == columnItmGrpCst_sls) doItmGrpCst_sls_NE(info);
		else if (ne == columnItmGrpCst_sum) doItmGrpCst_sum_NE(info);
		else if (ne == columnItmGrpCst_spln) doItmGrpCst_spln_NE(info);
		else if (ne == columnItmGrpCst_spln_per_cmpl_slo) doItmGrpCst_spln_per_cmpl_slo_NE(info);
		else if (ne == columnItmGrpCst_spln_per_cmpl_sls) doItmGrpCst_spln_per_cmpl_sls_NE(info);
		else if (ne == columnItmGrpCst_bdg_sls) doItmGrpCst_bdg_sls_NE(info);
		else if (ne == columnItmGrpCst_bdg_per_cmpl_slo) doItmGrpCst_bdg_per_cmpl_slo_NE(info);
		else if (ne == columnItmGrpCst_bdg_per_cmpl_sls) doItmGrpCst_bdg_per_cmpl_sls_NE(info);
		else if (ne == columnItmGrpCst_col_00) doItmGrpCst_col_00_NE(info);
		else if (ne == columnItmGrpCst_col_01) doItmGrpCst_col_01_NE(info);
		else if (ne == columnItmGrpCst_col_02) doItmGrpCst_col_02_NE(info);
		else if (ne == columnItmGrpCst_col_03) doItmGrpCst_col_03_NE(info);
		else if (ne == columnItmGrpCst_col_04) doItmGrpCst_col_04_NE(info);
		else if (ne == columnItmGrpCst_col_05) doItmGrpCst_col_05_NE(info);
		else if (ne == columnItmGrpCst_col_06) doItmGrpCst_col_06_NE(info);
		else if (ne == columnItmGrpCst_col_07) doItmGrpCst_col_07_NE(info);
		else if (ne == columnItmGrpCst_col_08) doItmGrpCst_col_08_NE(info);
		else if (ne == columnItmGrpCst_col_09) doItmGrpCst_col_09_NE(info);
		else if (ne == columnItmGrpCst_col_10) doItmGrpCst_col_10_NE(info);
		else if (ne == columnItmGrpCst_col_11) doItmGrpCst_col_11_NE(info);
		else if (ne == columnItmGrpCst_col_12) doItmGrpCst_col_12_NE(info);
		else if (ne == columnItmGrpCst_col_13) doItmGrpCst_col_13_NE(info);
		else if (ne == columnItmGrpCst_col_14) doItmGrpCst_col_14_NE(info);
		else if (ne == columnItmGrpCst_col_15) doItmGrpCst_col_15_NE(info);
		else if (ne == columnItmGrpCst_col_16) doItmGrpCst_col_16_NE(info);
		else if (ne == columnItmGrpCst_col_17) doItmGrpCst_col_17_NE(info);
		else if (ne == columnItmGrpCst_base_unit_dec_place) doItmGrpCst_base_unit_dec_place_NE(info);
		else if (ne == columnItmGrpCst_amt_dec_place) doItmGrpCst_amt_dec_place_NE(info);
		else if (ne == columnItmGrpCst_rate_dec_place) doItmGrpCst_rate_dec_place_NE(info);
		else if (ne == columnItmGrpCst_itm_grp_cd) doItmGrpCst_itm_grp_cd_NE(info);
		else if (ne == columnItmGrpCst_cst_cd_key) doItmGrpCst_cst_cd_key_NE(info);
	}

	/**
	 * [MainTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMainTab_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_NE(MCEventInfo info){
	}

	/**
	 * [DptDtlTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtlTab_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtlTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtlTab_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_ym_d]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ym_d_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_trnst_disp_d]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_trnst_disp_d_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_disp_term_d]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_disp_term_d_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_term_d]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_term_d_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_bdg_grp_d]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_bdg_grp_d_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_cd_d]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_cd_d_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_nm_d]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_nm_d_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[use_act_xrate_flg_d]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_use_act_xrate_flg_d_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_lvl_cd_d]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_lvl_cd_d_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_lvl_nm_d]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_lvl_nm_d_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd_d]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_d_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm_d]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_d_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_ym_ig]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ym_ig_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_trnst_disp_ig]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_trnst_disp_ig_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_disp_term_ig]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_disp_term_ig_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_term_ig]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_term_ig_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_bdg_grp_ig]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_bdg_grp_ig_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_cd_ig]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_cd_ig_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_nm_ig]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_nm_ig_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[use_act_xrate_flg_ig]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_use_act_xrate_flg_ig_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_lvl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_lvl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_cd_ig]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_cd_ig_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_nm_ig]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_nm_ig_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[unit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slo_bl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_bl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slo_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[spln_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_spln_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[spln_per_cmpl_sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_spln_per_cmpl_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bdg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bdg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bdg_per_cmpl_sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bdg_per_cmpl_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prof_amt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prof_amt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prof_rate_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prof_rate_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[big_num_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_big_num_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[big_num_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_big_num_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[itm_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_itm_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[itm_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_itm_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[row_sort_col]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_row_sort_col_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[row_title_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_row_title_nm_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[slo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_slo_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[slo_bl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_slo_bl_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_sls_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[sum]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_sum_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[spln]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_spln_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[spln_per_cmpl_slo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_spln_per_cmpl_slo_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[spln_per_cmpl_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_spln_per_cmpl_sls_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[bdg_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_bdg_sls_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[bdg_per_cmpl_slo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_bdg_per_cmpl_slo_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[bdg_per_cmpl_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_bdg_per_cmpl_sls_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_00]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_00_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_01]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_01_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_02]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_02_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_03]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_03_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_04]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_04_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_05]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_05_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_06]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_06_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_07]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_07_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_08]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_08_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_09]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_09_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_10_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_11_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_12_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_13_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_14_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_15_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_16_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_17_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[dpt1_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_dpt1_key_NE(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[dpt_nm1_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_dpt_nm1_key_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[dw_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_dw_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[dw_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_dw_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[row_sort_col]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_row_sort_col_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[row_title_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_row_title_nm_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[slo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_slo_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[slo_bl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_slo_bl_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_sls_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[sum]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_sum_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[spln]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_spln_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[spln_per_cmpl_slo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_spln_per_cmpl_slo_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[spln_per_cmpl_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_spln_per_cmpl_sls_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[bdg_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_bdg_sls_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[bdg_per_cmpl_slo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_bdg_per_cmpl_slo_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[bdg_per_cmpl_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_bdg_per_cmpl_sls_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_00]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_00_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_01]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_01_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_02]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_02_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_03]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_03_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_04]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_04_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_05]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_05_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_06]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_06_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_07]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_07_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_08]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_08_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_09]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_09_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_10_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_11_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_12_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_13_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_14_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_15_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_16_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_17_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[dpt2_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_dpt2_key_NE(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[dpt_nm2_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_dpt_nm2_key_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[sls_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_sls_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[sls_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_sls_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[row_sort_col]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_row_sort_col_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[row_title_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_row_title_nm_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[slo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_slo_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[slo_bl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_slo_bl_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_sls_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[sum]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_sum_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[spln]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_spln_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[spln_per_cmpl_slo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_spln_per_cmpl_slo_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[spln_per_cmpl_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_spln_per_cmpl_sls_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[bdg_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_bdg_sls_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[bdg_per_cmpl_slo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_bdg_per_cmpl_slo_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[bdg_per_cmpl_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_bdg_per_cmpl_sls_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_00]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_00_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_01]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_01_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_02]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_02_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_03]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_03_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_04]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_04_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_05]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_05_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_06]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_06_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_07]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_07_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_08]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_08_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_09]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_09_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_10_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_11_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_12_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_13_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_14_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_15_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_16_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_17_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[sls_usr_cd_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_sls_usr_cd_key_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[row_sort_col]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_row_sort_col_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[row_title_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_row_title_nm_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[slo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_slo_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[slo_bl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_slo_bl_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_sls_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[sum]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_sum_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[spln]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_spln_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[spln_per_cmpl_slo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_spln_per_cmpl_slo_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[spln_per_cmpl_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_spln_per_cmpl_sls_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[bdg_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_bdg_sls_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[bdg_per_cmpl_slo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_bdg_per_cmpl_slo_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[bdg_per_cmpl_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_bdg_per_cmpl_sls_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_00]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_00_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_01]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_01_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_02]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_02_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_03]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_03_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_04]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_04_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_05]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_05_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_06]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_06_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_07]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_07_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_08]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_08_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_09]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_09_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_10_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_11_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_12_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_13_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_14_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_15_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_16_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_17_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[cst_cd_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_cst_cd_key_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[base_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_base_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[unit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_unit_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[slo_bl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_slo_bl_flg_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[slo_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_slo_flg_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[spln_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_spln_flg_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[spln_per_cmpl_sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_spln_per_cmpl_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[bdg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_bdg_flg_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[bdg_per_cmpl_sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_bdg_per_cmpl_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[prof_amt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_prof_amt_flg_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[prof_rate_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_prof_rate_flg_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[big_num_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_big_num_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[big_num_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_big_num_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[itm_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_itm_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[itm_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_itm_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[row_sort_col]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_row_sort_col_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[row_title_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_row_title_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[slo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_slo_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[slo_bl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_slo_bl_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_sls_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[sum]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_sum_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[spln]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_spln_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[spln_per_cmpl_slo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_spln_per_cmpl_slo_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[spln_per_cmpl_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_spln_per_cmpl_sls_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[bdg_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_bdg_sls_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[bdg_per_cmpl_slo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_bdg_per_cmpl_slo_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[bdg_per_cmpl_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_bdg_per_cmpl_sls_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_00]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_00_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_01]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_01_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_02]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_02_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_03]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_03_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_04]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_04_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_05]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_05_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_06]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_06_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_07]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_07_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_08]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_08_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_09]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_09_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_10_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_11_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_12_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_13_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_14_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_15_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_16_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_17_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[rate_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_rate_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[itm_grp1_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_itm_grp1_key_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[itm_grp_nm1_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_itm_grp_nm1_key_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[dw_itm_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_dw_itm_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[dw_itm_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_dw_itm_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[row_sort_col]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_row_sort_col_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[row_title_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_row_title_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[slo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_slo_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[slo_bl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_slo_bl_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_sls_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[sum]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_sum_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[spln]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_spln_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[spln_per_cmpl_slo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_spln_per_cmpl_slo_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[spln_per_cmpl_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_spln_per_cmpl_sls_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[bdg_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_bdg_sls_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[bdg_per_cmpl_slo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_bdg_per_cmpl_slo_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[bdg_per_cmpl_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_bdg_per_cmpl_sls_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_00]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_00_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_01]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_01_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_02]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_02_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_03]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_03_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_04]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_04_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_05]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_05_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_06]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_06_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_07]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_07_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_08]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_08_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_09]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_09_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_10_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_11_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_12_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_13_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_14_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_15_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_16_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_17_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[rate_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_rate_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[itm_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_itm_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[itm_grp2_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_itm_grp2_key_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[row_sort_col]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_row_sort_col_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[row_title_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_row_title_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[slo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_slo_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[slo_bl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_slo_bl_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_sls_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[sum]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_sum_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[spln]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_spln_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[spln_per_cmpl_slo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_spln_per_cmpl_slo_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[spln_per_cmpl_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_spln_per_cmpl_sls_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[bdg_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_bdg_sls_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[bdg_per_cmpl_slo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_bdg_per_cmpl_slo_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[bdg_per_cmpl_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_bdg_per_cmpl_sls_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_00]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_00_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_01]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_01_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_02]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_02_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_03]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_03_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_04]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_04_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_05]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_05_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_06]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_06_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_07]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_07_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_08]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_08_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_09]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_09_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_10_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_11_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_12_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_13_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_14_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_15_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_16_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_17_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[rate_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_rate_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[itm_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_itm_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[itm_cd_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_itm_cd_key_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[itm_sub1_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_itm_sub1_key_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[itm_sub2_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_itm_sub2_key_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[itm_sub3_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_itm_sub3_key_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[row_sort_col]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_row_sort_col_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[row_title_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_row_title_nm_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[slo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_slo_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[slo_bl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_slo_bl_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_sls_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[sum]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_sum_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[spln]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_spln_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[spln_per_cmpl_slo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_spln_per_cmpl_slo_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[spln_per_cmpl_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_spln_per_cmpl_sls_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[bdg_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_bdg_sls_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[bdg_per_cmpl_slo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_bdg_per_cmpl_slo_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[bdg_per_cmpl_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_bdg_per_cmpl_sls_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_00]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_00_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_01]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_01_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_02]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_02_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_03]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_03_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_04]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_04_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_05]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_05_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_06]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_06_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_07]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_07_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_08]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_08_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_09]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_09_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_10_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_11_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_12_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_13_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_14_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_15_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_16_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_17_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[rate_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_rate_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[itm_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_itm_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[cst_cd_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_cst_cd_key_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == MainTabTab) doMainTab_NX(info);
		else if (nx == DptDtl1Table) doDptDtl1_NX(info);
		else if (nx == DptDtlTabTab) doDptDtlTab_NX(info);
		else if (nx == DptDwDptTable) doDptDwDpt_NX(info);
		else if (nx == DptSlsUsrTable) doDptSlsUsr_NX(info);
		else if (nx == DptCstTable) doDptCst_NX(info);
		else if (nx == ItmGrpDtl1Table) doItmGrpDtl1_NX(info);
		else if (nx == ItmGrpDtlTabTab) doItmGrpDtlTab_NX(info);
		else if (nx == ItmGrpDwItmGrpTable) doItmGrpDwItmGrp_NX(info);
		else if (nx == ItmGrpItmTable) doItmGrpItm_NX(info);
		else if (nx == ItmGrpCstTable) doItmGrpCst_NX(info);
		else if (nx == Cnd_inpt_ym_d) doCnd_inpt_ym_d_NX(info);
		else if (nx == Cnd_sls_trnst_disp_d) doCnd_sls_trnst_disp_d_NX(info);
		else if (nx == Cnd_sls_disp_term_d) doCnd_sls_disp_term_d_NX(info);
		else if (nx == Cnd_sum_term_d) doCnd_sum_term_d_NX(info);
		else if (nx == Cnd_sls_bdg_grp_d) doCnd_sls_bdg_grp_d_NX(info);
		else if (nx == Cnd_xrate_cd_d) doCnd_xrate_cd_d_NX(info);
		else if (nx == Cnd_xrate_nm_d) doCnd_xrate_nm_d_NX(info);
		else if (nx == Cnd_use_act_xrate_flg_d) doCnd_use_act_xrate_flg_d_NX(info);
		else if (nx == Cnd_dpt_lvl_cd_d) doCnd_dpt_lvl_cd_d_NX(info);
		else if (nx == Cnd_dpt_lvl_nm_d) doCnd_dpt_lvl_nm_d_NX(info);
		else if (nx == Cnd_dpt_cd_d) doCnd_dpt_cd_d_NX(info);
		else if (nx == Cnd_dpt_nm_d) doCnd_dpt_nm_d_NX(info);
		else if (nx == Cnd_inpt_ym_ig) doCnd_inpt_ym_ig_NX(info);
		else if (nx == Cnd_sls_trnst_disp_ig) doCnd_sls_trnst_disp_ig_NX(info);
		else if (nx == Cnd_sls_disp_term_ig) doCnd_sls_disp_term_ig_NX(info);
		else if (nx == Cnd_sum_term_ig) doCnd_sum_term_ig_NX(info);
		else if (nx == Cnd_sls_bdg_grp_ig) doCnd_sls_bdg_grp_ig_NX(info);
		else if (nx == Cnd_xrate_cd_ig) doCnd_xrate_cd_ig_NX(info);
		else if (nx == Cnd_xrate_nm_ig) doCnd_xrate_nm_ig_NX(info);
		else if (nx == Cnd_use_act_xrate_flg_ig) doCnd_use_act_xrate_flg_ig_NX(info);
		else if (nx == Cnd_sls_itm_grp_lvl) doCnd_sls_itm_grp_lvl_NX(info);
		else if (nx == Cnd_sls_itm_grp_cd_ig) doCnd_sls_itm_grp_cd_ig_NX(info);
		else if (nx == Cnd_sls_itm_grp_nm_ig) doCnd_sls_itm_grp_nm_ig_NX(info);
		else if (nx == Hdr_base_cur_cd) doHdr_base_cur_cd_NX(info);
		else if (nx == Hdr_base_cur_nm) doHdr_base_cur_nm_NX(info);
		else if (nx == Hdr_unit) doHdr_unit_NX(info);
		else if (nx == Hdr_sls_flg) doHdr_sls_flg_NX(info);
		else if (nx == Hdr_slo_bl_flg) doHdr_slo_bl_flg_NX(info);
		else if (nx == Hdr_slo_flg) doHdr_slo_flg_NX(info);
		else if (nx == Hdr_spln_flg) doHdr_spln_flg_NX(info);
		else if (nx == Hdr_spln_per_cmpl_sls_flg) doHdr_spln_per_cmpl_sls_flg_NX(info);
		else if (nx == Hdr_bdg_flg) doHdr_bdg_flg_NX(info);
		else if (nx == Hdr_bdg_per_cmpl_sls_flg) doHdr_bdg_per_cmpl_sls_flg_NX(info);
		else if (nx == Hdr_prof_amt_flg) doHdr_prof_amt_flg_NX(info);
		else if (nx == Hdr_prof_rate_flg) doHdr_prof_rate_flg_NX(info);
		else if (nx == Hdr_big_num_rnd_typ) doHdr_big_num_rnd_typ_NX(info);
		else if (nx == Hdr_big_num_rnd_typ_nm) doHdr_big_num_rnd_typ_nm_NX(info);
		else if (nx == columnDptDtl1_dpt_cd) doDptDtl1_dpt_cd_NX(info);
		else if (nx == columnDptDtl1_dpt_nm) doDptDtl1_dpt_nm_NX(info);
		else if (nx == columnDptDtl1_itm_grp_cd) doDptDtl1_itm_grp_cd_NX(info);
		else if (nx == columnDptDtl1_itm_grp_nm) doDptDtl1_itm_grp_nm_NX(info);
		else if (nx == columnDptDtl1_row_sort_col) doDptDtl1_row_sort_col_NX(info);
		else if (nx == columnDptDtl1_row_title_nm) doDptDtl1_row_title_nm_NX(info);
		else if (nx == columnDptDtl1_slo) doDptDtl1_slo_NX(info);
		else if (nx == columnDptDtl1_slo_bl) doDptDtl1_slo_bl_NX(info);
		else if (nx == columnDptDtl1_sls) doDptDtl1_sls_NX(info);
		else if (nx == columnDptDtl1_sum) doDptDtl1_sum_NX(info);
		else if (nx == columnDptDtl1_spln) doDptDtl1_spln_NX(info);
		else if (nx == columnDptDtl1_spln_per_cmpl_slo) doDptDtl1_spln_per_cmpl_slo_NX(info);
		else if (nx == columnDptDtl1_spln_per_cmpl_sls) doDptDtl1_spln_per_cmpl_sls_NX(info);
		else if (nx == columnDptDtl1_bdg_sls) doDptDtl1_bdg_sls_NX(info);
		else if (nx == columnDptDtl1_bdg_per_cmpl_slo) doDptDtl1_bdg_per_cmpl_slo_NX(info);
		else if (nx == columnDptDtl1_bdg_per_cmpl_sls) doDptDtl1_bdg_per_cmpl_sls_NX(info);
		else if (nx == columnDptDtl1_col_00) doDptDtl1_col_00_NX(info);
		else if (nx == columnDptDtl1_col_01) doDptDtl1_col_01_NX(info);
		else if (nx == columnDptDtl1_col_02) doDptDtl1_col_02_NX(info);
		else if (nx == columnDptDtl1_col_03) doDptDtl1_col_03_NX(info);
		else if (nx == columnDptDtl1_col_04) doDptDtl1_col_04_NX(info);
		else if (nx == columnDptDtl1_col_05) doDptDtl1_col_05_NX(info);
		else if (nx == columnDptDtl1_col_06) doDptDtl1_col_06_NX(info);
		else if (nx == columnDptDtl1_col_07) doDptDtl1_col_07_NX(info);
		else if (nx == columnDptDtl1_col_08) doDptDtl1_col_08_NX(info);
		else if (nx == columnDptDtl1_col_09) doDptDtl1_col_09_NX(info);
		else if (nx == columnDptDtl1_col_10) doDptDtl1_col_10_NX(info);
		else if (nx == columnDptDtl1_col_11) doDptDtl1_col_11_NX(info);
		else if (nx == columnDptDtl1_col_12) doDptDtl1_col_12_NX(info);
		else if (nx == columnDptDtl1_col_13) doDptDtl1_col_13_NX(info);
		else if (nx == columnDptDtl1_col_14) doDptDtl1_col_14_NX(info);
		else if (nx == columnDptDtl1_col_15) doDptDtl1_col_15_NX(info);
		else if (nx == columnDptDtl1_col_16) doDptDtl1_col_16_NX(info);
		else if (nx == columnDptDtl1_col_17) doDptDtl1_col_17_NX(info);
		else if (nx == columnDptDtl1_dpt1_key) doDptDtl1_dpt1_key_NX(info);
		else if (nx == columnDptDtl1_dpt_nm1_key) doDptDtl1_dpt_nm1_key_NX(info);
		else if (nx == columnDptDwDpt_dw_dpt_cd) doDptDwDpt_dw_dpt_cd_NX(info);
		else if (nx == columnDptDwDpt_dw_dpt_nm) doDptDwDpt_dw_dpt_nm_NX(info);
		else if (nx == columnDptDwDpt_row_sort_col) doDptDwDpt_row_sort_col_NX(info);
		else if (nx == columnDptDwDpt_row_title_nm) doDptDwDpt_row_title_nm_NX(info);
		else if (nx == columnDptDwDpt_slo) doDptDwDpt_slo_NX(info);
		else if (nx == columnDptDwDpt_slo_bl) doDptDwDpt_slo_bl_NX(info);
		else if (nx == columnDptDwDpt_sls) doDptDwDpt_sls_NX(info);
		else if (nx == columnDptDwDpt_sum) doDptDwDpt_sum_NX(info);
		else if (nx == columnDptDwDpt_spln) doDptDwDpt_spln_NX(info);
		else if (nx == columnDptDwDpt_spln_per_cmpl_slo) doDptDwDpt_spln_per_cmpl_slo_NX(info);
		else if (nx == columnDptDwDpt_spln_per_cmpl_sls) doDptDwDpt_spln_per_cmpl_sls_NX(info);
		else if (nx == columnDptDwDpt_bdg_sls) doDptDwDpt_bdg_sls_NX(info);
		else if (nx == columnDptDwDpt_bdg_per_cmpl_slo) doDptDwDpt_bdg_per_cmpl_slo_NX(info);
		else if (nx == columnDptDwDpt_bdg_per_cmpl_sls) doDptDwDpt_bdg_per_cmpl_sls_NX(info);
		else if (nx == columnDptDwDpt_col_00) doDptDwDpt_col_00_NX(info);
		else if (nx == columnDptDwDpt_col_01) doDptDwDpt_col_01_NX(info);
		else if (nx == columnDptDwDpt_col_02) doDptDwDpt_col_02_NX(info);
		else if (nx == columnDptDwDpt_col_03) doDptDwDpt_col_03_NX(info);
		else if (nx == columnDptDwDpt_col_04) doDptDwDpt_col_04_NX(info);
		else if (nx == columnDptDwDpt_col_05) doDptDwDpt_col_05_NX(info);
		else if (nx == columnDptDwDpt_col_06) doDptDwDpt_col_06_NX(info);
		else if (nx == columnDptDwDpt_col_07) doDptDwDpt_col_07_NX(info);
		else if (nx == columnDptDwDpt_col_08) doDptDwDpt_col_08_NX(info);
		else if (nx == columnDptDwDpt_col_09) doDptDwDpt_col_09_NX(info);
		else if (nx == columnDptDwDpt_col_10) doDptDwDpt_col_10_NX(info);
		else if (nx == columnDptDwDpt_col_11) doDptDwDpt_col_11_NX(info);
		else if (nx == columnDptDwDpt_col_12) doDptDwDpt_col_12_NX(info);
		else if (nx == columnDptDwDpt_col_13) doDptDwDpt_col_13_NX(info);
		else if (nx == columnDptDwDpt_col_14) doDptDwDpt_col_14_NX(info);
		else if (nx == columnDptDwDpt_col_15) doDptDwDpt_col_15_NX(info);
		else if (nx == columnDptDwDpt_col_16) doDptDwDpt_col_16_NX(info);
		else if (nx == columnDptDwDpt_col_17) doDptDwDpt_col_17_NX(info);
		else if (nx == columnDptDwDpt_dpt_cd) doDptDwDpt_dpt_cd_NX(info);
		else if (nx == columnDptDwDpt_dpt_nm) doDptDwDpt_dpt_nm_NX(info);
		else if (nx == columnDptDwDpt_dpt2_key) doDptDwDpt_dpt2_key_NX(info);
		else if (nx == columnDptDwDpt_dpt_nm2_key) doDptDwDpt_dpt_nm2_key_NX(info);
		else if (nx == columnDptSlsUsr_sls_usr_cd) doDptSlsUsr_sls_usr_cd_NX(info);
		else if (nx == columnDptSlsUsr_sls_usr_nm) doDptSlsUsr_sls_usr_nm_NX(info);
		else if (nx == columnDptSlsUsr_row_sort_col) doDptSlsUsr_row_sort_col_NX(info);
		else if (nx == columnDptSlsUsr_row_title_nm) doDptSlsUsr_row_title_nm_NX(info);
		else if (nx == columnDptSlsUsr_slo) doDptSlsUsr_slo_NX(info);
		else if (nx == columnDptSlsUsr_slo_bl) doDptSlsUsr_slo_bl_NX(info);
		else if (nx == columnDptSlsUsr_sls) doDptSlsUsr_sls_NX(info);
		else if (nx == columnDptSlsUsr_sum) doDptSlsUsr_sum_NX(info);
		else if (nx == columnDptSlsUsr_spln) doDptSlsUsr_spln_NX(info);
		else if (nx == columnDptSlsUsr_spln_per_cmpl_slo) doDptSlsUsr_spln_per_cmpl_slo_NX(info);
		else if (nx == columnDptSlsUsr_spln_per_cmpl_sls) doDptSlsUsr_spln_per_cmpl_sls_NX(info);
		else if (nx == columnDptSlsUsr_bdg_sls) doDptSlsUsr_bdg_sls_NX(info);
		else if (nx == columnDptSlsUsr_bdg_per_cmpl_slo) doDptSlsUsr_bdg_per_cmpl_slo_NX(info);
		else if (nx == columnDptSlsUsr_bdg_per_cmpl_sls) doDptSlsUsr_bdg_per_cmpl_sls_NX(info);
		else if (nx == columnDptSlsUsr_col_00) doDptSlsUsr_col_00_NX(info);
		else if (nx == columnDptSlsUsr_col_01) doDptSlsUsr_col_01_NX(info);
		else if (nx == columnDptSlsUsr_col_02) doDptSlsUsr_col_02_NX(info);
		else if (nx == columnDptSlsUsr_col_03) doDptSlsUsr_col_03_NX(info);
		else if (nx == columnDptSlsUsr_col_04) doDptSlsUsr_col_04_NX(info);
		else if (nx == columnDptSlsUsr_col_05) doDptSlsUsr_col_05_NX(info);
		else if (nx == columnDptSlsUsr_col_06) doDptSlsUsr_col_06_NX(info);
		else if (nx == columnDptSlsUsr_col_07) doDptSlsUsr_col_07_NX(info);
		else if (nx == columnDptSlsUsr_col_08) doDptSlsUsr_col_08_NX(info);
		else if (nx == columnDptSlsUsr_col_09) doDptSlsUsr_col_09_NX(info);
		else if (nx == columnDptSlsUsr_col_10) doDptSlsUsr_col_10_NX(info);
		else if (nx == columnDptSlsUsr_col_11) doDptSlsUsr_col_11_NX(info);
		else if (nx == columnDptSlsUsr_col_12) doDptSlsUsr_col_12_NX(info);
		else if (nx == columnDptSlsUsr_col_13) doDptSlsUsr_col_13_NX(info);
		else if (nx == columnDptSlsUsr_col_14) doDptSlsUsr_col_14_NX(info);
		else if (nx == columnDptSlsUsr_col_15) doDptSlsUsr_col_15_NX(info);
		else if (nx == columnDptSlsUsr_col_16) doDptSlsUsr_col_16_NX(info);
		else if (nx == columnDptSlsUsr_col_17) doDptSlsUsr_col_17_NX(info);
		else if (nx == columnDptSlsUsr_dpt_cd) doDptSlsUsr_dpt_cd_NX(info);
		else if (nx == columnDptSlsUsr_dpt_nm) doDptSlsUsr_dpt_nm_NX(info);
		else if (nx == columnDptSlsUsr_sls_usr_cd_key) doDptSlsUsr_sls_usr_cd_key_NX(info);
		else if (nx == columnDptCst_cst_cd) doDptCst_cst_cd_NX(info);
		else if (nx == columnDptCst_cst_nm) doDptCst_cst_nm_NX(info);
		else if (nx == columnDptCst_row_sort_col) doDptCst_row_sort_col_NX(info);
		else if (nx == columnDptCst_row_title_nm) doDptCst_row_title_nm_NX(info);
		else if (nx == columnDptCst_slo) doDptCst_slo_NX(info);
		else if (nx == columnDptCst_slo_bl) doDptCst_slo_bl_NX(info);
		else if (nx == columnDptCst_sls) doDptCst_sls_NX(info);
		else if (nx == columnDptCst_sum) doDptCst_sum_NX(info);
		else if (nx == columnDptCst_spln) doDptCst_spln_NX(info);
		else if (nx == columnDptCst_spln_per_cmpl_slo) doDptCst_spln_per_cmpl_slo_NX(info);
		else if (nx == columnDptCst_spln_per_cmpl_sls) doDptCst_spln_per_cmpl_sls_NX(info);
		else if (nx == columnDptCst_bdg_sls) doDptCst_bdg_sls_NX(info);
		else if (nx == columnDptCst_bdg_per_cmpl_slo) doDptCst_bdg_per_cmpl_slo_NX(info);
		else if (nx == columnDptCst_bdg_per_cmpl_sls) doDptCst_bdg_per_cmpl_sls_NX(info);
		else if (nx == columnDptCst_col_00) doDptCst_col_00_NX(info);
		else if (nx == columnDptCst_col_01) doDptCst_col_01_NX(info);
		else if (nx == columnDptCst_col_02) doDptCst_col_02_NX(info);
		else if (nx == columnDptCst_col_03) doDptCst_col_03_NX(info);
		else if (nx == columnDptCst_col_04) doDptCst_col_04_NX(info);
		else if (nx == columnDptCst_col_05) doDptCst_col_05_NX(info);
		else if (nx == columnDptCst_col_06) doDptCst_col_06_NX(info);
		else if (nx == columnDptCst_col_07) doDptCst_col_07_NX(info);
		else if (nx == columnDptCst_col_08) doDptCst_col_08_NX(info);
		else if (nx == columnDptCst_col_09) doDptCst_col_09_NX(info);
		else if (nx == columnDptCst_col_10) doDptCst_col_10_NX(info);
		else if (nx == columnDptCst_col_11) doDptCst_col_11_NX(info);
		else if (nx == columnDptCst_col_12) doDptCst_col_12_NX(info);
		else if (nx == columnDptCst_col_13) doDptCst_col_13_NX(info);
		else if (nx == columnDptCst_col_14) doDptCst_col_14_NX(info);
		else if (nx == columnDptCst_col_15) doDptCst_col_15_NX(info);
		else if (nx == columnDptCst_col_16) doDptCst_col_16_NX(info);
		else if (nx == columnDptCst_col_17) doDptCst_col_17_NX(info);
		else if (nx == columnDptCst_dpt_cd) doDptCst_dpt_cd_NX(info);
		else if (nx == columnDptCst_dpt_nm) doDptCst_dpt_nm_NX(info);
		else if (nx == columnDptCst_cst_cd_key) doDptCst_cst_cd_key_NX(info);
		else if (nx == ItmGrpHdr_base_cur_cd) doItmGrpHdr_base_cur_cd_NX(info);
		else if (nx == ItmGrpHdr_base_cur_nm) doItmGrpHdr_base_cur_nm_NX(info);
		else if (nx == ItmGrpHdr_unit) doItmGrpHdr_unit_NX(info);
		else if (nx == ItmGrpHdr_sls_flg) doItmGrpHdr_sls_flg_NX(info);
		else if (nx == ItmGrpHdr_slo_bl_flg) doItmGrpHdr_slo_bl_flg_NX(info);
		else if (nx == ItmGrpHdr_slo_flg) doItmGrpHdr_slo_flg_NX(info);
		else if (nx == ItmGrpHdr_spln_flg) doItmGrpHdr_spln_flg_NX(info);
		else if (nx == ItmGrpHdr_spln_per_cmpl_sls_flg) doItmGrpHdr_spln_per_cmpl_sls_flg_NX(info);
		else if (nx == ItmGrpHdr_bdg_flg) doItmGrpHdr_bdg_flg_NX(info);
		else if (nx == ItmGrpHdr_bdg_per_cmpl_sls_flg) doItmGrpHdr_bdg_per_cmpl_sls_flg_NX(info);
		else if (nx == ItmGrpHdr_prof_amt_flg) doItmGrpHdr_prof_amt_flg_NX(info);
		else if (nx == ItmGrpHdr_prof_rate_flg) doItmGrpHdr_prof_rate_flg_NX(info);
		else if (nx == ItmGrpHdr_big_num_rnd_typ) doItmGrpHdr_big_num_rnd_typ_NX(info);
		else if (nx == ItmGrpHdr_big_num_rnd_typ_nm) doItmGrpHdr_big_num_rnd_typ_nm_NX(info);
		else if (nx == columnItmGrpDtl1_itm_grp_cd) doItmGrpDtl1_itm_grp_cd_NX(info);
		else if (nx == columnItmGrpDtl1_itm_grp_nm) doItmGrpDtl1_itm_grp_nm_NX(info);
		else if (nx == columnItmGrpDtl1_row_sort_col) doItmGrpDtl1_row_sort_col_NX(info);
		else if (nx == columnItmGrpDtl1_row_title_nm) doItmGrpDtl1_row_title_nm_NX(info);
		else if (nx == columnItmGrpDtl1_slo) doItmGrpDtl1_slo_NX(info);
		else if (nx == columnItmGrpDtl1_slo_bl) doItmGrpDtl1_slo_bl_NX(info);
		else if (nx == columnItmGrpDtl1_sls) doItmGrpDtl1_sls_NX(info);
		else if (nx == columnItmGrpDtl1_sum) doItmGrpDtl1_sum_NX(info);
		else if (nx == columnItmGrpDtl1_spln) doItmGrpDtl1_spln_NX(info);
		else if (nx == columnItmGrpDtl1_spln_per_cmpl_slo) doItmGrpDtl1_spln_per_cmpl_slo_NX(info);
		else if (nx == columnItmGrpDtl1_spln_per_cmpl_sls) doItmGrpDtl1_spln_per_cmpl_sls_NX(info);
		else if (nx == columnItmGrpDtl1_bdg_sls) doItmGrpDtl1_bdg_sls_NX(info);
		else if (nx == columnItmGrpDtl1_bdg_per_cmpl_slo) doItmGrpDtl1_bdg_per_cmpl_slo_NX(info);
		else if (nx == columnItmGrpDtl1_bdg_per_cmpl_sls) doItmGrpDtl1_bdg_per_cmpl_sls_NX(info);
		else if (nx == columnItmGrpDtl1_col_00) doItmGrpDtl1_col_00_NX(info);
		else if (nx == columnItmGrpDtl1_col_01) doItmGrpDtl1_col_01_NX(info);
		else if (nx == columnItmGrpDtl1_col_02) doItmGrpDtl1_col_02_NX(info);
		else if (nx == columnItmGrpDtl1_col_03) doItmGrpDtl1_col_03_NX(info);
		else if (nx == columnItmGrpDtl1_col_04) doItmGrpDtl1_col_04_NX(info);
		else if (nx == columnItmGrpDtl1_col_05) doItmGrpDtl1_col_05_NX(info);
		else if (nx == columnItmGrpDtl1_col_06) doItmGrpDtl1_col_06_NX(info);
		else if (nx == columnItmGrpDtl1_col_07) doItmGrpDtl1_col_07_NX(info);
		else if (nx == columnItmGrpDtl1_col_08) doItmGrpDtl1_col_08_NX(info);
		else if (nx == columnItmGrpDtl1_col_09) doItmGrpDtl1_col_09_NX(info);
		else if (nx == columnItmGrpDtl1_col_10) doItmGrpDtl1_col_10_NX(info);
		else if (nx == columnItmGrpDtl1_col_11) doItmGrpDtl1_col_11_NX(info);
		else if (nx == columnItmGrpDtl1_col_12) doItmGrpDtl1_col_12_NX(info);
		else if (nx == columnItmGrpDtl1_col_13) doItmGrpDtl1_col_13_NX(info);
		else if (nx == columnItmGrpDtl1_col_14) doItmGrpDtl1_col_14_NX(info);
		else if (nx == columnItmGrpDtl1_col_15) doItmGrpDtl1_col_15_NX(info);
		else if (nx == columnItmGrpDtl1_col_16) doItmGrpDtl1_col_16_NX(info);
		else if (nx == columnItmGrpDtl1_col_17) doItmGrpDtl1_col_17_NX(info);
		else if (nx == columnItmGrpDtl1_amt_dec_place) doItmGrpDtl1_amt_dec_place_NX(info);
		else if (nx == columnItmGrpDtl1_rate_dec_place) doItmGrpDtl1_rate_dec_place_NX(info);
		else if (nx == columnItmGrpDtl1_itm_grp1_key) doItmGrpDtl1_itm_grp1_key_NX(info);
		else if (nx == columnItmGrpDtl1_itm_grp_nm1_key) doItmGrpDtl1_itm_grp_nm1_key_NX(info);
		else if (nx == columnItmGrpDwItmGrp_dw_itm_grp_cd) doItmGrpDwItmGrp_dw_itm_grp_cd_NX(info);
		else if (nx == columnItmGrpDwItmGrp_dw_itm_grp_nm) doItmGrpDwItmGrp_dw_itm_grp_nm_NX(info);
		else if (nx == columnItmGrpDwItmGrp_row_sort_col) doItmGrpDwItmGrp_row_sort_col_NX(info);
		else if (nx == columnItmGrpDwItmGrp_row_title_nm) doItmGrpDwItmGrp_row_title_nm_NX(info);
		else if (nx == columnItmGrpDwItmGrp_slo) doItmGrpDwItmGrp_slo_NX(info);
		else if (nx == columnItmGrpDwItmGrp_slo_bl) doItmGrpDwItmGrp_slo_bl_NX(info);
		else if (nx == columnItmGrpDwItmGrp_sls) doItmGrpDwItmGrp_sls_NX(info);
		else if (nx == columnItmGrpDwItmGrp_sum) doItmGrpDwItmGrp_sum_NX(info);
		else if (nx == columnItmGrpDwItmGrp_spln) doItmGrpDwItmGrp_spln_NX(info);
		else if (nx == columnItmGrpDwItmGrp_spln_per_cmpl_slo) doItmGrpDwItmGrp_spln_per_cmpl_slo_NX(info);
		else if (nx == columnItmGrpDwItmGrp_spln_per_cmpl_sls) doItmGrpDwItmGrp_spln_per_cmpl_sls_NX(info);
		else if (nx == columnItmGrpDwItmGrp_bdg_sls) doItmGrpDwItmGrp_bdg_sls_NX(info);
		else if (nx == columnItmGrpDwItmGrp_bdg_per_cmpl_slo) doItmGrpDwItmGrp_bdg_per_cmpl_slo_NX(info);
		else if (nx == columnItmGrpDwItmGrp_bdg_per_cmpl_sls) doItmGrpDwItmGrp_bdg_per_cmpl_sls_NX(info);
		else if (nx == columnItmGrpDwItmGrp_col_00) doItmGrpDwItmGrp_col_00_NX(info);
		else if (nx == columnItmGrpDwItmGrp_col_01) doItmGrpDwItmGrp_col_01_NX(info);
		else if (nx == columnItmGrpDwItmGrp_col_02) doItmGrpDwItmGrp_col_02_NX(info);
		else if (nx == columnItmGrpDwItmGrp_col_03) doItmGrpDwItmGrp_col_03_NX(info);
		else if (nx == columnItmGrpDwItmGrp_col_04) doItmGrpDwItmGrp_col_04_NX(info);
		else if (nx == columnItmGrpDwItmGrp_col_05) doItmGrpDwItmGrp_col_05_NX(info);
		else if (nx == columnItmGrpDwItmGrp_col_06) doItmGrpDwItmGrp_col_06_NX(info);
		else if (nx == columnItmGrpDwItmGrp_col_07) doItmGrpDwItmGrp_col_07_NX(info);
		else if (nx == columnItmGrpDwItmGrp_col_08) doItmGrpDwItmGrp_col_08_NX(info);
		else if (nx == columnItmGrpDwItmGrp_col_09) doItmGrpDwItmGrp_col_09_NX(info);
		else if (nx == columnItmGrpDwItmGrp_col_10) doItmGrpDwItmGrp_col_10_NX(info);
		else if (nx == columnItmGrpDwItmGrp_col_11) doItmGrpDwItmGrp_col_11_NX(info);
		else if (nx == columnItmGrpDwItmGrp_col_12) doItmGrpDwItmGrp_col_12_NX(info);
		else if (nx == columnItmGrpDwItmGrp_col_13) doItmGrpDwItmGrp_col_13_NX(info);
		else if (nx == columnItmGrpDwItmGrp_col_14) doItmGrpDwItmGrp_col_14_NX(info);
		else if (nx == columnItmGrpDwItmGrp_col_15) doItmGrpDwItmGrp_col_15_NX(info);
		else if (nx == columnItmGrpDwItmGrp_col_16) doItmGrpDwItmGrp_col_16_NX(info);
		else if (nx == columnItmGrpDwItmGrp_col_17) doItmGrpDwItmGrp_col_17_NX(info);
		else if (nx == columnItmGrpDwItmGrp_base_unit_dec_place) doItmGrpDwItmGrp_base_unit_dec_place_NX(info);
		else if (nx == columnItmGrpDwItmGrp_amt_dec_place) doItmGrpDwItmGrp_amt_dec_place_NX(info);
		else if (nx == columnItmGrpDwItmGrp_rate_dec_place) doItmGrpDwItmGrp_rate_dec_place_NX(info);
		else if (nx == columnItmGrpDwItmGrp_itm_grp_cd) doItmGrpDwItmGrp_itm_grp_cd_NX(info);
		else if (nx == columnItmGrpDwItmGrp_itm_grp2_key) doItmGrpDwItmGrp_itm_grp2_key_NX(info);
		else if (nx == columnItmGrpItm_row_sort_col) doItmGrpItm_row_sort_col_NX(info);
		else if (nx == columnItmGrpItm_row_title_nm) doItmGrpItm_row_title_nm_NX(info);
		else if (nx == columnItmGrpItm_slo) doItmGrpItm_slo_NX(info);
		else if (nx == columnItmGrpItm_slo_bl) doItmGrpItm_slo_bl_NX(info);
		else if (nx == columnItmGrpItm_sls) doItmGrpItm_sls_NX(info);
		else if (nx == columnItmGrpItm_sum) doItmGrpItm_sum_NX(info);
		else if (nx == columnItmGrpItm_spln) doItmGrpItm_spln_NX(info);
		else if (nx == columnItmGrpItm_spln_per_cmpl_slo) doItmGrpItm_spln_per_cmpl_slo_NX(info);
		else if (nx == columnItmGrpItm_spln_per_cmpl_sls) doItmGrpItm_spln_per_cmpl_sls_NX(info);
		else if (nx == columnItmGrpItm_bdg_sls) doItmGrpItm_bdg_sls_NX(info);
		else if (nx == columnItmGrpItm_bdg_per_cmpl_slo) doItmGrpItm_bdg_per_cmpl_slo_NX(info);
		else if (nx == columnItmGrpItm_bdg_per_cmpl_sls) doItmGrpItm_bdg_per_cmpl_sls_NX(info);
		else if (nx == columnItmGrpItm_col_00) doItmGrpItm_col_00_NX(info);
		else if (nx == columnItmGrpItm_col_01) doItmGrpItm_col_01_NX(info);
		else if (nx == columnItmGrpItm_col_02) doItmGrpItm_col_02_NX(info);
		else if (nx == columnItmGrpItm_col_03) doItmGrpItm_col_03_NX(info);
		else if (nx == columnItmGrpItm_col_04) doItmGrpItm_col_04_NX(info);
		else if (nx == columnItmGrpItm_col_05) doItmGrpItm_col_05_NX(info);
		else if (nx == columnItmGrpItm_col_06) doItmGrpItm_col_06_NX(info);
		else if (nx == columnItmGrpItm_col_07) doItmGrpItm_col_07_NX(info);
		else if (nx == columnItmGrpItm_col_08) doItmGrpItm_col_08_NX(info);
		else if (nx == columnItmGrpItm_col_09) doItmGrpItm_col_09_NX(info);
		else if (nx == columnItmGrpItm_col_10) doItmGrpItm_col_10_NX(info);
		else if (nx == columnItmGrpItm_col_11) doItmGrpItm_col_11_NX(info);
		else if (nx == columnItmGrpItm_col_12) doItmGrpItm_col_12_NX(info);
		else if (nx == columnItmGrpItm_col_13) doItmGrpItm_col_13_NX(info);
		else if (nx == columnItmGrpItm_col_14) doItmGrpItm_col_14_NX(info);
		else if (nx == columnItmGrpItm_col_15) doItmGrpItm_col_15_NX(info);
		else if (nx == columnItmGrpItm_col_16) doItmGrpItm_col_16_NX(info);
		else if (nx == columnItmGrpItm_col_17) doItmGrpItm_col_17_NX(info);
		else if (nx == columnItmGrpItm_base_unit_dec_place) doItmGrpItm_base_unit_dec_place_NX(info);
		else if (nx == columnItmGrpItm_amt_dec_place) doItmGrpItm_amt_dec_place_NX(info);
		else if (nx == columnItmGrpItm_rate_dec_place) doItmGrpItm_rate_dec_place_NX(info);
		else if (nx == columnItmGrpItm_itm_grp_cd) doItmGrpItm_itm_grp_cd_NX(info);
		else if (nx == columnItmGrpItm_itm_cd_key) doItmGrpItm_itm_cd_key_NX(info);
		else if (nx == columnItmGrpItm_itm_sub1_key) doItmGrpItm_itm_sub1_key_NX(info);
		else if (nx == columnItmGrpItm_itm_sub2_key) doItmGrpItm_itm_sub2_key_NX(info);
		else if (nx == columnItmGrpItm_itm_sub3_key) doItmGrpItm_itm_sub3_key_NX(info);
		else if (nx == columnItmGrpCst_cst_cd) doItmGrpCst_cst_cd_NX(info);
		else if (nx == columnItmGrpCst_cst_nm) doItmGrpCst_cst_nm_NX(info);
		else if (nx == columnItmGrpCst_row_sort_col) doItmGrpCst_row_sort_col_NX(info);
		else if (nx == columnItmGrpCst_row_title_nm) doItmGrpCst_row_title_nm_NX(info);
		else if (nx == columnItmGrpCst_slo) doItmGrpCst_slo_NX(info);
		else if (nx == columnItmGrpCst_slo_bl) doItmGrpCst_slo_bl_NX(info);
		else if (nx == columnItmGrpCst_sls) doItmGrpCst_sls_NX(info);
		else if (nx == columnItmGrpCst_sum) doItmGrpCst_sum_NX(info);
		else if (nx == columnItmGrpCst_spln) doItmGrpCst_spln_NX(info);
		else if (nx == columnItmGrpCst_spln_per_cmpl_slo) doItmGrpCst_spln_per_cmpl_slo_NX(info);
		else if (nx == columnItmGrpCst_spln_per_cmpl_sls) doItmGrpCst_spln_per_cmpl_sls_NX(info);
		else if (nx == columnItmGrpCst_bdg_sls) doItmGrpCst_bdg_sls_NX(info);
		else if (nx == columnItmGrpCst_bdg_per_cmpl_slo) doItmGrpCst_bdg_per_cmpl_slo_NX(info);
		else if (nx == columnItmGrpCst_bdg_per_cmpl_sls) doItmGrpCst_bdg_per_cmpl_sls_NX(info);
		else if (nx == columnItmGrpCst_col_00) doItmGrpCst_col_00_NX(info);
		else if (nx == columnItmGrpCst_col_01) doItmGrpCst_col_01_NX(info);
		else if (nx == columnItmGrpCst_col_02) doItmGrpCst_col_02_NX(info);
		else if (nx == columnItmGrpCst_col_03) doItmGrpCst_col_03_NX(info);
		else if (nx == columnItmGrpCst_col_04) doItmGrpCst_col_04_NX(info);
		else if (nx == columnItmGrpCst_col_05) doItmGrpCst_col_05_NX(info);
		else if (nx == columnItmGrpCst_col_06) doItmGrpCst_col_06_NX(info);
		else if (nx == columnItmGrpCst_col_07) doItmGrpCst_col_07_NX(info);
		else if (nx == columnItmGrpCst_col_08) doItmGrpCst_col_08_NX(info);
		else if (nx == columnItmGrpCst_col_09) doItmGrpCst_col_09_NX(info);
		else if (nx == columnItmGrpCst_col_10) doItmGrpCst_col_10_NX(info);
		else if (nx == columnItmGrpCst_col_11) doItmGrpCst_col_11_NX(info);
		else if (nx == columnItmGrpCst_col_12) doItmGrpCst_col_12_NX(info);
		else if (nx == columnItmGrpCst_col_13) doItmGrpCst_col_13_NX(info);
		else if (nx == columnItmGrpCst_col_14) doItmGrpCst_col_14_NX(info);
		else if (nx == columnItmGrpCst_col_15) doItmGrpCst_col_15_NX(info);
		else if (nx == columnItmGrpCst_col_16) doItmGrpCst_col_16_NX(info);
		else if (nx == columnItmGrpCst_col_17) doItmGrpCst_col_17_NX(info);
		else if (nx == columnItmGrpCst_base_unit_dec_place) doItmGrpCst_base_unit_dec_place_NX(info);
		else if (nx == columnItmGrpCst_amt_dec_place) doItmGrpCst_amt_dec_place_NX(info);
		else if (nx == columnItmGrpCst_rate_dec_place) doItmGrpCst_rate_dec_place_NX(info);
		else if (nx == columnItmGrpCst_itm_grp_cd) doItmGrpCst_itm_grp_cd_NX(info);
		else if (nx == columnItmGrpCst_cst_cd_key) doItmGrpCst_cst_cd_key_NX(info);
	}

	/**
	 * [MainTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMainTab_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_NX(MCEventInfo info){
	}

	/**
	 * [DptDtlTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtlTab_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtlTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtlTab_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_ym_d]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ym_d_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_trnst_disp_d]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_trnst_disp_d_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_disp_term_d]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_disp_term_d_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_term_d]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_term_d_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_bdg_grp_d]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_bdg_grp_d_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_cd_d]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_cd_d_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_nm_d]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_nm_d_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[use_act_xrate_flg_d]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_use_act_xrate_flg_d_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_lvl_cd_d]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_lvl_cd_d_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_lvl_nm_d]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_lvl_nm_d_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd_d]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_d_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm_d]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_d_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_ym_ig]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ym_ig_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_trnst_disp_ig]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_trnst_disp_ig_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_disp_term_ig]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_disp_term_ig_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_term_ig]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_term_ig_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_bdg_grp_ig]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_bdg_grp_ig_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_cd_ig]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_cd_ig_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_nm_ig]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_nm_ig_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[use_act_xrate_flg_ig]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_use_act_xrate_flg_ig_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_lvl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_lvl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_cd_ig]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_cd_ig_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_nm_ig]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_nm_ig_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[unit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slo_bl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_bl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slo_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[spln_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_spln_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[spln_per_cmpl_sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_spln_per_cmpl_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bdg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bdg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bdg_per_cmpl_sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bdg_per_cmpl_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prof_amt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prof_amt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prof_rate_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prof_rate_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[big_num_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_big_num_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[big_num_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_big_num_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[itm_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_itm_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[itm_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_itm_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[row_sort_col]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_row_sort_col_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[row_title_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_row_title_nm_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[slo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_slo_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[slo_bl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_slo_bl_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_sls_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[sum]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_sum_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[spln]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_spln_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[spln_per_cmpl_slo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_spln_per_cmpl_slo_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[spln_per_cmpl_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_spln_per_cmpl_sls_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[bdg_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_bdg_sls_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[bdg_per_cmpl_slo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_bdg_per_cmpl_slo_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[bdg_per_cmpl_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_bdg_per_cmpl_sls_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_00]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_00_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_01]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_01_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_02]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_02_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_03]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_03_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_04]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_04_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_05]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_05_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_06]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_06_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_07]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_07_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_08]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_08_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_09]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_09_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_10_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_11_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_12_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_13_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_14_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_15_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_16_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_17_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[dpt1_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_dpt1_key_NX(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[dpt_nm1_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_dpt_nm1_key_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[dw_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_dw_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[dw_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_dw_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[row_sort_col]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_row_sort_col_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[row_title_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_row_title_nm_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[slo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_slo_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[slo_bl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_slo_bl_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_sls_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[sum]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_sum_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[spln]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_spln_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[spln_per_cmpl_slo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_spln_per_cmpl_slo_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[spln_per_cmpl_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_spln_per_cmpl_sls_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[bdg_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_bdg_sls_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[bdg_per_cmpl_slo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_bdg_per_cmpl_slo_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[bdg_per_cmpl_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_bdg_per_cmpl_sls_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_00]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_00_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_01]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_01_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_02]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_02_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_03]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_03_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_04]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_04_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_05]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_05_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_06]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_06_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_07]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_07_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_08]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_08_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_09]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_09_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_10_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_11_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_12_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_13_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_14_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_15_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_16_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_17_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[dpt2_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_dpt2_key_NX(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[dpt_nm2_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_dpt_nm2_key_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[sls_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_sls_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[sls_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_sls_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[row_sort_col]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_row_sort_col_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[row_title_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_row_title_nm_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[slo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_slo_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[slo_bl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_slo_bl_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_sls_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[sum]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_sum_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[spln]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_spln_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[spln_per_cmpl_slo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_spln_per_cmpl_slo_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[spln_per_cmpl_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_spln_per_cmpl_sls_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[bdg_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_bdg_sls_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[bdg_per_cmpl_slo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_bdg_per_cmpl_slo_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[bdg_per_cmpl_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_bdg_per_cmpl_sls_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_00]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_00_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_01]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_01_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_02]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_02_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_03]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_03_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_04]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_04_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_05]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_05_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_06]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_06_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_07]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_07_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_08]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_08_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_09]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_09_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_10_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_11_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_12_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_13_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_14_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_15_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_16_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_17_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[sls_usr_cd_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_sls_usr_cd_key_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[row_sort_col]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_row_sort_col_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[row_title_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_row_title_nm_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[slo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_slo_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[slo_bl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_slo_bl_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_sls_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[sum]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_sum_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[spln]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_spln_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[spln_per_cmpl_slo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_spln_per_cmpl_slo_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[spln_per_cmpl_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_spln_per_cmpl_sls_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[bdg_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_bdg_sls_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[bdg_per_cmpl_slo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_bdg_per_cmpl_slo_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[bdg_per_cmpl_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_bdg_per_cmpl_sls_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_00]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_00_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_01]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_01_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_02]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_02_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_03]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_03_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_04]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_04_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_05]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_05_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_06]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_06_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_07]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_07_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_08]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_08_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_09]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_09_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_10_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_11_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_12_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_13_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_14_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_15_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_16_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_17_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[cst_cd_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_cst_cd_key_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[base_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_base_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[unit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_unit_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[slo_bl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_slo_bl_flg_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[slo_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_slo_flg_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[spln_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_spln_flg_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[spln_per_cmpl_sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_spln_per_cmpl_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[bdg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_bdg_flg_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[bdg_per_cmpl_sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_bdg_per_cmpl_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[prof_amt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_prof_amt_flg_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[prof_rate_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_prof_rate_flg_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[big_num_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_big_num_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[big_num_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_big_num_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[itm_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_itm_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[itm_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_itm_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[row_sort_col]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_row_sort_col_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[row_title_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_row_title_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[slo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_slo_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[slo_bl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_slo_bl_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_sls_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[sum]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_sum_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[spln]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_spln_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[spln_per_cmpl_slo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_spln_per_cmpl_slo_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[spln_per_cmpl_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_spln_per_cmpl_sls_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[bdg_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_bdg_sls_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[bdg_per_cmpl_slo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_bdg_per_cmpl_slo_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[bdg_per_cmpl_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_bdg_per_cmpl_sls_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_00]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_00_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_01]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_01_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_02]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_02_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_03]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_03_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_04]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_04_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_05]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_05_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_06]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_06_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_07]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_07_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_08]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_08_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_09]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_09_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_10_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_11_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_12_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_13_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_14_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_15_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_16_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_17_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[rate_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_rate_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[itm_grp1_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_itm_grp1_key_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[itm_grp_nm1_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_itm_grp_nm1_key_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[dw_itm_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_dw_itm_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[dw_itm_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_dw_itm_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[row_sort_col]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_row_sort_col_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[row_title_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_row_title_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[slo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_slo_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[slo_bl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_slo_bl_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_sls_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[sum]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_sum_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[spln]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_spln_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[spln_per_cmpl_slo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_spln_per_cmpl_slo_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[spln_per_cmpl_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_spln_per_cmpl_sls_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[bdg_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_bdg_sls_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[bdg_per_cmpl_slo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_bdg_per_cmpl_slo_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[bdg_per_cmpl_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_bdg_per_cmpl_sls_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_00]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_00_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_01]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_01_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_02]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_02_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_03]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_03_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_04]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_04_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_05]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_05_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_06]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_06_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_07]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_07_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_08]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_08_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_09]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_09_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_10_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_11_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_12_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_13_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_14_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_15_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_16_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_17_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[rate_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_rate_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[itm_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_itm_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[itm_grp2_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_itm_grp2_key_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[row_sort_col]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_row_sort_col_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[row_title_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_row_title_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[slo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_slo_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[slo_bl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_slo_bl_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_sls_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[sum]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_sum_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[spln]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_spln_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[spln_per_cmpl_slo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_spln_per_cmpl_slo_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[spln_per_cmpl_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_spln_per_cmpl_sls_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[bdg_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_bdg_sls_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[bdg_per_cmpl_slo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_bdg_per_cmpl_slo_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[bdg_per_cmpl_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_bdg_per_cmpl_sls_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_00]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_00_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_01]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_01_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_02]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_02_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_03]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_03_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_04]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_04_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_05]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_05_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_06]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_06_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_07]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_07_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_08]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_08_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_09]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_09_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_10_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_11_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_12_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_13_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_14_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_15_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_16_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_17_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[rate_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_rate_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[itm_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_itm_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[itm_cd_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_itm_cd_key_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[itm_sub1_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_itm_sub1_key_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[itm_sub2_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_itm_sub2_key_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[itm_sub3_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_itm_sub3_key_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[row_sort_col]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_row_sort_col_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[row_title_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_row_title_nm_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[slo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_slo_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[slo_bl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_slo_bl_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_sls_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[sum]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_sum_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[spln]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_spln_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[spln_per_cmpl_slo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_spln_per_cmpl_slo_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[spln_per_cmpl_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_spln_per_cmpl_sls_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[bdg_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_bdg_sls_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[bdg_per_cmpl_slo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_bdg_per_cmpl_slo_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[bdg_per_cmpl_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_bdg_per_cmpl_sls_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_00]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_00_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_01]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_01_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_02]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_02_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_03]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_03_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_04]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_04_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_05]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_05_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_06]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_06_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_07]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_07_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_08]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_08_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_09]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_09_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_10_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_11_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_12_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_13_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_14_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_15_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_16_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_17_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[rate_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_rate_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[itm_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_itm_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[cst_cd_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_cst_cd_key_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_inpt_ym_d) doCnd_inpt_ym_d_LC(info);
		else if (lc == Cnd_sls_disp_term_d) doCnd_sls_disp_term_d_LC(info);
		else if (lc == Cnd_sum_term_d) doCnd_sum_term_d_LC(info);
		else if (lc == Cnd_sls_bdg_grp_d) doCnd_sls_bdg_grp_d_LC(info);
		else if (lc == Cnd_xrate_cd_d) doCnd_xrate_cd_d_LC(info);
		else if (lc == Cnd_xrate_nm_d) doCnd_xrate_nm_d_LC(info);
		else if (lc == Cnd_dpt_lvl_cd_d) doCnd_dpt_lvl_cd_d_LC(info);
		else if (lc == Cnd_dpt_lvl_nm_d) doCnd_dpt_lvl_nm_d_LC(info);
		else if (lc == Cnd_dpt_cd_d) doCnd_dpt_cd_d_LC(info);
		else if (lc == Cnd_dpt_nm_d) doCnd_dpt_nm_d_LC(info);
		else if (lc == Cnd_inpt_ym_ig) doCnd_inpt_ym_ig_LC(info);
		else if (lc == Cnd_sls_disp_term_ig) doCnd_sls_disp_term_ig_LC(info);
		else if (lc == Cnd_sum_term_ig) doCnd_sum_term_ig_LC(info);
		else if (lc == Cnd_sls_bdg_grp_ig) doCnd_sls_bdg_grp_ig_LC(info);
		else if (lc == Cnd_xrate_cd_ig) doCnd_xrate_cd_ig_LC(info);
		else if (lc == Cnd_xrate_nm_ig) doCnd_xrate_nm_ig_LC(info);
		else if (lc == Cnd_sls_itm_grp_lvl) doCnd_sls_itm_grp_lvl_LC(info);
		else if (lc == Cnd_sls_itm_grp_cd_ig) doCnd_sls_itm_grp_cd_ig_LC(info);
		else if (lc == Cnd_sls_itm_grp_nm_ig) doCnd_sls_itm_grp_nm_ig_LC(info);
		else if (lc == Hdr_base_cur_cd) doHdr_base_cur_cd_LC(info);
		else if (lc == Hdr_base_cur_nm) doHdr_base_cur_nm_LC(info);
		else if (lc == Hdr_unit) doHdr_unit_LC(info);
		else if (lc == Hdr_big_num_rnd_typ) doHdr_big_num_rnd_typ_LC(info);
		else if (lc == Hdr_big_num_rnd_typ_nm) doHdr_big_num_rnd_typ_nm_LC(info);
		else if (lc == columnDptDtl1_dpt_cd) doDptDtl1_dpt_cd_LC(info);
		else if (lc == columnDptDtl1_dpt_nm) doDptDtl1_dpt_nm_LC(info);
		else if (lc == columnDptDtl1_itm_grp_cd) doDptDtl1_itm_grp_cd_LC(info);
		else if (lc == columnDptDtl1_itm_grp_nm) doDptDtl1_itm_grp_nm_LC(info);
		else if (lc == columnDptDtl1_row_sort_col) doDptDtl1_row_sort_col_LC(info);
		else if (lc == columnDptDtl1_row_title_nm) doDptDtl1_row_title_nm_LC(info);
		else if (lc == columnDptDtl1_slo) doDptDtl1_slo_LC(info);
		else if (lc == columnDptDtl1_slo_bl) doDptDtl1_slo_bl_LC(info);
		else if (lc == columnDptDtl1_sls) doDptDtl1_sls_LC(info);
		else if (lc == columnDptDtl1_sum) doDptDtl1_sum_LC(info);
		else if (lc == columnDptDtl1_spln) doDptDtl1_spln_LC(info);
		else if (lc == columnDptDtl1_spln_per_cmpl_slo) doDptDtl1_spln_per_cmpl_slo_LC(info);
		else if (lc == columnDptDtl1_spln_per_cmpl_sls) doDptDtl1_spln_per_cmpl_sls_LC(info);
		else if (lc == columnDptDtl1_bdg_sls) doDptDtl1_bdg_sls_LC(info);
		else if (lc == columnDptDtl1_bdg_per_cmpl_slo) doDptDtl1_bdg_per_cmpl_slo_LC(info);
		else if (lc == columnDptDtl1_bdg_per_cmpl_sls) doDptDtl1_bdg_per_cmpl_sls_LC(info);
		else if (lc == columnDptDtl1_col_00) doDptDtl1_col_00_LC(info);
		else if (lc == columnDptDtl1_col_01) doDptDtl1_col_01_LC(info);
		else if (lc == columnDptDtl1_col_02) doDptDtl1_col_02_LC(info);
		else if (lc == columnDptDtl1_col_03) doDptDtl1_col_03_LC(info);
		else if (lc == columnDptDtl1_col_04) doDptDtl1_col_04_LC(info);
		else if (lc == columnDptDtl1_col_05) doDptDtl1_col_05_LC(info);
		else if (lc == columnDptDtl1_col_06) doDptDtl1_col_06_LC(info);
		else if (lc == columnDptDtl1_col_07) doDptDtl1_col_07_LC(info);
		else if (lc == columnDptDtl1_col_08) doDptDtl1_col_08_LC(info);
		else if (lc == columnDptDtl1_col_09) doDptDtl1_col_09_LC(info);
		else if (lc == columnDptDtl1_col_10) doDptDtl1_col_10_LC(info);
		else if (lc == columnDptDtl1_col_11) doDptDtl1_col_11_LC(info);
		else if (lc == columnDptDtl1_col_12) doDptDtl1_col_12_LC(info);
		else if (lc == columnDptDtl1_col_13) doDptDtl1_col_13_LC(info);
		else if (lc == columnDptDtl1_col_14) doDptDtl1_col_14_LC(info);
		else if (lc == columnDptDtl1_col_15) doDptDtl1_col_15_LC(info);
		else if (lc == columnDptDtl1_col_16) doDptDtl1_col_16_LC(info);
		else if (lc == columnDptDtl1_col_17) doDptDtl1_col_17_LC(info);
		else if (lc == columnDptDtl1_dpt1_key) doDptDtl1_dpt1_key_LC(info);
		else if (lc == columnDptDtl1_dpt_nm1_key) doDptDtl1_dpt_nm1_key_LC(info);
		else if (lc == columnDptDwDpt_dw_dpt_cd) doDptDwDpt_dw_dpt_cd_LC(info);
		else if (lc == columnDptDwDpt_dw_dpt_nm) doDptDwDpt_dw_dpt_nm_LC(info);
		else if (lc == columnDptDwDpt_row_sort_col) doDptDwDpt_row_sort_col_LC(info);
		else if (lc == columnDptDwDpt_row_title_nm) doDptDwDpt_row_title_nm_LC(info);
		else if (lc == columnDptDwDpt_slo) doDptDwDpt_slo_LC(info);
		else if (lc == columnDptDwDpt_slo_bl) doDptDwDpt_slo_bl_LC(info);
		else if (lc == columnDptDwDpt_sls) doDptDwDpt_sls_LC(info);
		else if (lc == columnDptDwDpt_sum) doDptDwDpt_sum_LC(info);
		else if (lc == columnDptDwDpt_spln) doDptDwDpt_spln_LC(info);
		else if (lc == columnDptDwDpt_spln_per_cmpl_slo) doDptDwDpt_spln_per_cmpl_slo_LC(info);
		else if (lc == columnDptDwDpt_spln_per_cmpl_sls) doDptDwDpt_spln_per_cmpl_sls_LC(info);
		else if (lc == columnDptDwDpt_bdg_sls) doDptDwDpt_bdg_sls_LC(info);
		else if (lc == columnDptDwDpt_bdg_per_cmpl_slo) doDptDwDpt_bdg_per_cmpl_slo_LC(info);
		else if (lc == columnDptDwDpt_bdg_per_cmpl_sls) doDptDwDpt_bdg_per_cmpl_sls_LC(info);
		else if (lc == columnDptDwDpt_col_00) doDptDwDpt_col_00_LC(info);
		else if (lc == columnDptDwDpt_col_01) doDptDwDpt_col_01_LC(info);
		else if (lc == columnDptDwDpt_col_02) doDptDwDpt_col_02_LC(info);
		else if (lc == columnDptDwDpt_col_03) doDptDwDpt_col_03_LC(info);
		else if (lc == columnDptDwDpt_col_04) doDptDwDpt_col_04_LC(info);
		else if (lc == columnDptDwDpt_col_05) doDptDwDpt_col_05_LC(info);
		else if (lc == columnDptDwDpt_col_06) doDptDwDpt_col_06_LC(info);
		else if (lc == columnDptDwDpt_col_07) doDptDwDpt_col_07_LC(info);
		else if (lc == columnDptDwDpt_col_08) doDptDwDpt_col_08_LC(info);
		else if (lc == columnDptDwDpt_col_09) doDptDwDpt_col_09_LC(info);
		else if (lc == columnDptDwDpt_col_10) doDptDwDpt_col_10_LC(info);
		else if (lc == columnDptDwDpt_col_11) doDptDwDpt_col_11_LC(info);
		else if (lc == columnDptDwDpt_col_12) doDptDwDpt_col_12_LC(info);
		else if (lc == columnDptDwDpt_col_13) doDptDwDpt_col_13_LC(info);
		else if (lc == columnDptDwDpt_col_14) doDptDwDpt_col_14_LC(info);
		else if (lc == columnDptDwDpt_col_15) doDptDwDpt_col_15_LC(info);
		else if (lc == columnDptDwDpt_col_16) doDptDwDpt_col_16_LC(info);
		else if (lc == columnDptDwDpt_col_17) doDptDwDpt_col_17_LC(info);
		else if (lc == columnDptDwDpt_dpt_cd) doDptDwDpt_dpt_cd_LC(info);
		else if (lc == columnDptDwDpt_dpt_nm) doDptDwDpt_dpt_nm_LC(info);
		else if (lc == columnDptDwDpt_dpt2_key) doDptDwDpt_dpt2_key_LC(info);
		else if (lc == columnDptDwDpt_dpt_nm2_key) doDptDwDpt_dpt_nm2_key_LC(info);
		else if (lc == columnDptSlsUsr_sls_usr_cd) doDptSlsUsr_sls_usr_cd_LC(info);
		else if (lc == columnDptSlsUsr_sls_usr_nm) doDptSlsUsr_sls_usr_nm_LC(info);
		else if (lc == columnDptSlsUsr_row_sort_col) doDptSlsUsr_row_sort_col_LC(info);
		else if (lc == columnDptSlsUsr_row_title_nm) doDptSlsUsr_row_title_nm_LC(info);
		else if (lc == columnDptSlsUsr_slo) doDptSlsUsr_slo_LC(info);
		else if (lc == columnDptSlsUsr_slo_bl) doDptSlsUsr_slo_bl_LC(info);
		else if (lc == columnDptSlsUsr_sls) doDptSlsUsr_sls_LC(info);
		else if (lc == columnDptSlsUsr_sum) doDptSlsUsr_sum_LC(info);
		else if (lc == columnDptSlsUsr_spln) doDptSlsUsr_spln_LC(info);
		else if (lc == columnDptSlsUsr_spln_per_cmpl_slo) doDptSlsUsr_spln_per_cmpl_slo_LC(info);
		else if (lc == columnDptSlsUsr_spln_per_cmpl_sls) doDptSlsUsr_spln_per_cmpl_sls_LC(info);
		else if (lc == columnDptSlsUsr_bdg_sls) doDptSlsUsr_bdg_sls_LC(info);
		else if (lc == columnDptSlsUsr_bdg_per_cmpl_slo) doDptSlsUsr_bdg_per_cmpl_slo_LC(info);
		else if (lc == columnDptSlsUsr_bdg_per_cmpl_sls) doDptSlsUsr_bdg_per_cmpl_sls_LC(info);
		else if (lc == columnDptSlsUsr_col_00) doDptSlsUsr_col_00_LC(info);
		else if (lc == columnDptSlsUsr_col_01) doDptSlsUsr_col_01_LC(info);
		else if (lc == columnDptSlsUsr_col_02) doDptSlsUsr_col_02_LC(info);
		else if (lc == columnDptSlsUsr_col_03) doDptSlsUsr_col_03_LC(info);
		else if (lc == columnDptSlsUsr_col_04) doDptSlsUsr_col_04_LC(info);
		else if (lc == columnDptSlsUsr_col_05) doDptSlsUsr_col_05_LC(info);
		else if (lc == columnDptSlsUsr_col_06) doDptSlsUsr_col_06_LC(info);
		else if (lc == columnDptSlsUsr_col_07) doDptSlsUsr_col_07_LC(info);
		else if (lc == columnDptSlsUsr_col_08) doDptSlsUsr_col_08_LC(info);
		else if (lc == columnDptSlsUsr_col_09) doDptSlsUsr_col_09_LC(info);
		else if (lc == columnDptSlsUsr_col_10) doDptSlsUsr_col_10_LC(info);
		else if (lc == columnDptSlsUsr_col_11) doDptSlsUsr_col_11_LC(info);
		else if (lc == columnDptSlsUsr_col_12) doDptSlsUsr_col_12_LC(info);
		else if (lc == columnDptSlsUsr_col_13) doDptSlsUsr_col_13_LC(info);
		else if (lc == columnDptSlsUsr_col_14) doDptSlsUsr_col_14_LC(info);
		else if (lc == columnDptSlsUsr_col_15) doDptSlsUsr_col_15_LC(info);
		else if (lc == columnDptSlsUsr_col_16) doDptSlsUsr_col_16_LC(info);
		else if (lc == columnDptSlsUsr_col_17) doDptSlsUsr_col_17_LC(info);
		else if (lc == columnDptSlsUsr_dpt_cd) doDptSlsUsr_dpt_cd_LC(info);
		else if (lc == columnDptSlsUsr_dpt_nm) doDptSlsUsr_dpt_nm_LC(info);
		else if (lc == columnDptSlsUsr_sls_usr_cd_key) doDptSlsUsr_sls_usr_cd_key_LC(info);
		else if (lc == columnDptCst_cst_cd) doDptCst_cst_cd_LC(info);
		else if (lc == columnDptCst_cst_nm) doDptCst_cst_nm_LC(info);
		else if (lc == columnDptCst_row_sort_col) doDptCst_row_sort_col_LC(info);
		else if (lc == columnDptCst_row_title_nm) doDptCst_row_title_nm_LC(info);
		else if (lc == columnDptCst_slo) doDptCst_slo_LC(info);
		else if (lc == columnDptCst_slo_bl) doDptCst_slo_bl_LC(info);
		else if (lc == columnDptCst_sls) doDptCst_sls_LC(info);
		else if (lc == columnDptCst_sum) doDptCst_sum_LC(info);
		else if (lc == columnDptCst_spln) doDptCst_spln_LC(info);
		else if (lc == columnDptCst_spln_per_cmpl_slo) doDptCst_spln_per_cmpl_slo_LC(info);
		else if (lc == columnDptCst_spln_per_cmpl_sls) doDptCst_spln_per_cmpl_sls_LC(info);
		else if (lc == columnDptCst_bdg_sls) doDptCst_bdg_sls_LC(info);
		else if (lc == columnDptCst_bdg_per_cmpl_slo) doDptCst_bdg_per_cmpl_slo_LC(info);
		else if (lc == columnDptCst_bdg_per_cmpl_sls) doDptCst_bdg_per_cmpl_sls_LC(info);
		else if (lc == columnDptCst_col_00) doDptCst_col_00_LC(info);
		else if (lc == columnDptCst_col_01) doDptCst_col_01_LC(info);
		else if (lc == columnDptCst_col_02) doDptCst_col_02_LC(info);
		else if (lc == columnDptCst_col_03) doDptCst_col_03_LC(info);
		else if (lc == columnDptCst_col_04) doDptCst_col_04_LC(info);
		else if (lc == columnDptCst_col_05) doDptCst_col_05_LC(info);
		else if (lc == columnDptCst_col_06) doDptCst_col_06_LC(info);
		else if (lc == columnDptCst_col_07) doDptCst_col_07_LC(info);
		else if (lc == columnDptCst_col_08) doDptCst_col_08_LC(info);
		else if (lc == columnDptCst_col_09) doDptCst_col_09_LC(info);
		else if (lc == columnDptCst_col_10) doDptCst_col_10_LC(info);
		else if (lc == columnDptCst_col_11) doDptCst_col_11_LC(info);
		else if (lc == columnDptCst_col_12) doDptCst_col_12_LC(info);
		else if (lc == columnDptCst_col_13) doDptCst_col_13_LC(info);
		else if (lc == columnDptCst_col_14) doDptCst_col_14_LC(info);
		else if (lc == columnDptCst_col_15) doDptCst_col_15_LC(info);
		else if (lc == columnDptCst_col_16) doDptCst_col_16_LC(info);
		else if (lc == columnDptCst_col_17) doDptCst_col_17_LC(info);
		else if (lc == columnDptCst_dpt_cd) doDptCst_dpt_cd_LC(info);
		else if (lc == columnDptCst_dpt_nm) doDptCst_dpt_nm_LC(info);
		else if (lc == columnDptCst_cst_cd_key) doDptCst_cst_cd_key_LC(info);
		else if (lc == ItmGrpHdr_base_cur_cd) doItmGrpHdr_base_cur_cd_LC(info);
		else if (lc == ItmGrpHdr_base_cur_nm) doItmGrpHdr_base_cur_nm_LC(info);
		else if (lc == ItmGrpHdr_unit) doItmGrpHdr_unit_LC(info);
		else if (lc == ItmGrpHdr_big_num_rnd_typ) doItmGrpHdr_big_num_rnd_typ_LC(info);
		else if (lc == ItmGrpHdr_big_num_rnd_typ_nm) doItmGrpHdr_big_num_rnd_typ_nm_LC(info);
		else if (lc == columnItmGrpDtl1_itm_grp_cd) doItmGrpDtl1_itm_grp_cd_LC(info);
		else if (lc == columnItmGrpDtl1_itm_grp_nm) doItmGrpDtl1_itm_grp_nm_LC(info);
		else if (lc == columnItmGrpDtl1_row_sort_col) doItmGrpDtl1_row_sort_col_LC(info);
		else if (lc == columnItmGrpDtl1_row_title_nm) doItmGrpDtl1_row_title_nm_LC(info);
		else if (lc == columnItmGrpDtl1_slo) doItmGrpDtl1_slo_LC(info);
		else if (lc == columnItmGrpDtl1_slo_bl) doItmGrpDtl1_slo_bl_LC(info);
		else if (lc == columnItmGrpDtl1_sls) doItmGrpDtl1_sls_LC(info);
		else if (lc == columnItmGrpDtl1_sum) doItmGrpDtl1_sum_LC(info);
		else if (lc == columnItmGrpDtl1_spln) doItmGrpDtl1_spln_LC(info);
		else if (lc == columnItmGrpDtl1_spln_per_cmpl_slo) doItmGrpDtl1_spln_per_cmpl_slo_LC(info);
		else if (lc == columnItmGrpDtl1_spln_per_cmpl_sls) doItmGrpDtl1_spln_per_cmpl_sls_LC(info);
		else if (lc == columnItmGrpDtl1_bdg_sls) doItmGrpDtl1_bdg_sls_LC(info);
		else if (lc == columnItmGrpDtl1_bdg_per_cmpl_slo) doItmGrpDtl1_bdg_per_cmpl_slo_LC(info);
		else if (lc == columnItmGrpDtl1_bdg_per_cmpl_sls) doItmGrpDtl1_bdg_per_cmpl_sls_LC(info);
		else if (lc == columnItmGrpDtl1_col_00) doItmGrpDtl1_col_00_LC(info);
		else if (lc == columnItmGrpDtl1_col_01) doItmGrpDtl1_col_01_LC(info);
		else if (lc == columnItmGrpDtl1_col_02) doItmGrpDtl1_col_02_LC(info);
		else if (lc == columnItmGrpDtl1_col_03) doItmGrpDtl1_col_03_LC(info);
		else if (lc == columnItmGrpDtl1_col_04) doItmGrpDtl1_col_04_LC(info);
		else if (lc == columnItmGrpDtl1_col_05) doItmGrpDtl1_col_05_LC(info);
		else if (lc == columnItmGrpDtl1_col_06) doItmGrpDtl1_col_06_LC(info);
		else if (lc == columnItmGrpDtl1_col_07) doItmGrpDtl1_col_07_LC(info);
		else if (lc == columnItmGrpDtl1_col_08) doItmGrpDtl1_col_08_LC(info);
		else if (lc == columnItmGrpDtl1_col_09) doItmGrpDtl1_col_09_LC(info);
		else if (lc == columnItmGrpDtl1_col_10) doItmGrpDtl1_col_10_LC(info);
		else if (lc == columnItmGrpDtl1_col_11) doItmGrpDtl1_col_11_LC(info);
		else if (lc == columnItmGrpDtl1_col_12) doItmGrpDtl1_col_12_LC(info);
		else if (lc == columnItmGrpDtl1_col_13) doItmGrpDtl1_col_13_LC(info);
		else if (lc == columnItmGrpDtl1_col_14) doItmGrpDtl1_col_14_LC(info);
		else if (lc == columnItmGrpDtl1_col_15) doItmGrpDtl1_col_15_LC(info);
		else if (lc == columnItmGrpDtl1_col_16) doItmGrpDtl1_col_16_LC(info);
		else if (lc == columnItmGrpDtl1_col_17) doItmGrpDtl1_col_17_LC(info);
		else if (lc == columnItmGrpDtl1_amt_dec_place) doItmGrpDtl1_amt_dec_place_LC(info);
		else if (lc == columnItmGrpDtl1_rate_dec_place) doItmGrpDtl1_rate_dec_place_LC(info);
		else if (lc == columnItmGrpDtl1_itm_grp1_key) doItmGrpDtl1_itm_grp1_key_LC(info);
		else if (lc == columnItmGrpDtl1_itm_grp_nm1_key) doItmGrpDtl1_itm_grp_nm1_key_LC(info);
		else if (lc == columnItmGrpDwItmGrp_dw_itm_grp_cd) doItmGrpDwItmGrp_dw_itm_grp_cd_LC(info);
		else if (lc == columnItmGrpDwItmGrp_dw_itm_grp_nm) doItmGrpDwItmGrp_dw_itm_grp_nm_LC(info);
		else if (lc == columnItmGrpDwItmGrp_row_sort_col) doItmGrpDwItmGrp_row_sort_col_LC(info);
		else if (lc == columnItmGrpDwItmGrp_row_title_nm) doItmGrpDwItmGrp_row_title_nm_LC(info);
		else if (lc == columnItmGrpDwItmGrp_slo) doItmGrpDwItmGrp_slo_LC(info);
		else if (lc == columnItmGrpDwItmGrp_slo_bl) doItmGrpDwItmGrp_slo_bl_LC(info);
		else if (lc == columnItmGrpDwItmGrp_sls) doItmGrpDwItmGrp_sls_LC(info);
		else if (lc == columnItmGrpDwItmGrp_sum) doItmGrpDwItmGrp_sum_LC(info);
		else if (lc == columnItmGrpDwItmGrp_spln) doItmGrpDwItmGrp_spln_LC(info);
		else if (lc == columnItmGrpDwItmGrp_spln_per_cmpl_slo) doItmGrpDwItmGrp_spln_per_cmpl_slo_LC(info);
		else if (lc == columnItmGrpDwItmGrp_spln_per_cmpl_sls) doItmGrpDwItmGrp_spln_per_cmpl_sls_LC(info);
		else if (lc == columnItmGrpDwItmGrp_bdg_sls) doItmGrpDwItmGrp_bdg_sls_LC(info);
		else if (lc == columnItmGrpDwItmGrp_bdg_per_cmpl_slo) doItmGrpDwItmGrp_bdg_per_cmpl_slo_LC(info);
		else if (lc == columnItmGrpDwItmGrp_bdg_per_cmpl_sls) doItmGrpDwItmGrp_bdg_per_cmpl_sls_LC(info);
		else if (lc == columnItmGrpDwItmGrp_col_00) doItmGrpDwItmGrp_col_00_LC(info);
		else if (lc == columnItmGrpDwItmGrp_col_01) doItmGrpDwItmGrp_col_01_LC(info);
		else if (lc == columnItmGrpDwItmGrp_col_02) doItmGrpDwItmGrp_col_02_LC(info);
		else if (lc == columnItmGrpDwItmGrp_col_03) doItmGrpDwItmGrp_col_03_LC(info);
		else if (lc == columnItmGrpDwItmGrp_col_04) doItmGrpDwItmGrp_col_04_LC(info);
		else if (lc == columnItmGrpDwItmGrp_col_05) doItmGrpDwItmGrp_col_05_LC(info);
		else if (lc == columnItmGrpDwItmGrp_col_06) doItmGrpDwItmGrp_col_06_LC(info);
		else if (lc == columnItmGrpDwItmGrp_col_07) doItmGrpDwItmGrp_col_07_LC(info);
		else if (lc == columnItmGrpDwItmGrp_col_08) doItmGrpDwItmGrp_col_08_LC(info);
		else if (lc == columnItmGrpDwItmGrp_col_09) doItmGrpDwItmGrp_col_09_LC(info);
		else if (lc == columnItmGrpDwItmGrp_col_10) doItmGrpDwItmGrp_col_10_LC(info);
		else if (lc == columnItmGrpDwItmGrp_col_11) doItmGrpDwItmGrp_col_11_LC(info);
		else if (lc == columnItmGrpDwItmGrp_col_12) doItmGrpDwItmGrp_col_12_LC(info);
		else if (lc == columnItmGrpDwItmGrp_col_13) doItmGrpDwItmGrp_col_13_LC(info);
		else if (lc == columnItmGrpDwItmGrp_col_14) doItmGrpDwItmGrp_col_14_LC(info);
		else if (lc == columnItmGrpDwItmGrp_col_15) doItmGrpDwItmGrp_col_15_LC(info);
		else if (lc == columnItmGrpDwItmGrp_col_16) doItmGrpDwItmGrp_col_16_LC(info);
		else if (lc == columnItmGrpDwItmGrp_col_17) doItmGrpDwItmGrp_col_17_LC(info);
		else if (lc == columnItmGrpDwItmGrp_base_unit_dec_place) doItmGrpDwItmGrp_base_unit_dec_place_LC(info);
		else if (lc == columnItmGrpDwItmGrp_amt_dec_place) doItmGrpDwItmGrp_amt_dec_place_LC(info);
		else if (lc == columnItmGrpDwItmGrp_rate_dec_place) doItmGrpDwItmGrp_rate_dec_place_LC(info);
		else if (lc == columnItmGrpDwItmGrp_itm_grp_cd) doItmGrpDwItmGrp_itm_grp_cd_LC(info);
		else if (lc == columnItmGrpDwItmGrp_itm_grp2_key) doItmGrpDwItmGrp_itm_grp2_key_LC(info);
		else if (lc == columnItmGrpItm_row_sort_col) doItmGrpItm_row_sort_col_LC(info);
		else if (lc == columnItmGrpItm_row_title_nm) doItmGrpItm_row_title_nm_LC(info);
		else if (lc == columnItmGrpItm_slo) doItmGrpItm_slo_LC(info);
		else if (lc == columnItmGrpItm_slo_bl) doItmGrpItm_slo_bl_LC(info);
		else if (lc == columnItmGrpItm_sls) doItmGrpItm_sls_LC(info);
		else if (lc == columnItmGrpItm_sum) doItmGrpItm_sum_LC(info);
		else if (lc == columnItmGrpItm_spln) doItmGrpItm_spln_LC(info);
		else if (lc == columnItmGrpItm_spln_per_cmpl_slo) doItmGrpItm_spln_per_cmpl_slo_LC(info);
		else if (lc == columnItmGrpItm_spln_per_cmpl_sls) doItmGrpItm_spln_per_cmpl_sls_LC(info);
		else if (lc == columnItmGrpItm_bdg_sls) doItmGrpItm_bdg_sls_LC(info);
		else if (lc == columnItmGrpItm_bdg_per_cmpl_slo) doItmGrpItm_bdg_per_cmpl_slo_LC(info);
		else if (lc == columnItmGrpItm_bdg_per_cmpl_sls) doItmGrpItm_bdg_per_cmpl_sls_LC(info);
		else if (lc == columnItmGrpItm_col_00) doItmGrpItm_col_00_LC(info);
		else if (lc == columnItmGrpItm_col_01) doItmGrpItm_col_01_LC(info);
		else if (lc == columnItmGrpItm_col_02) doItmGrpItm_col_02_LC(info);
		else if (lc == columnItmGrpItm_col_03) doItmGrpItm_col_03_LC(info);
		else if (lc == columnItmGrpItm_col_04) doItmGrpItm_col_04_LC(info);
		else if (lc == columnItmGrpItm_col_05) doItmGrpItm_col_05_LC(info);
		else if (lc == columnItmGrpItm_col_06) doItmGrpItm_col_06_LC(info);
		else if (lc == columnItmGrpItm_col_07) doItmGrpItm_col_07_LC(info);
		else if (lc == columnItmGrpItm_col_08) doItmGrpItm_col_08_LC(info);
		else if (lc == columnItmGrpItm_col_09) doItmGrpItm_col_09_LC(info);
		else if (lc == columnItmGrpItm_col_10) doItmGrpItm_col_10_LC(info);
		else if (lc == columnItmGrpItm_col_11) doItmGrpItm_col_11_LC(info);
		else if (lc == columnItmGrpItm_col_12) doItmGrpItm_col_12_LC(info);
		else if (lc == columnItmGrpItm_col_13) doItmGrpItm_col_13_LC(info);
		else if (lc == columnItmGrpItm_col_14) doItmGrpItm_col_14_LC(info);
		else if (lc == columnItmGrpItm_col_15) doItmGrpItm_col_15_LC(info);
		else if (lc == columnItmGrpItm_col_16) doItmGrpItm_col_16_LC(info);
		else if (lc == columnItmGrpItm_col_17) doItmGrpItm_col_17_LC(info);
		else if (lc == columnItmGrpItm_base_unit_dec_place) doItmGrpItm_base_unit_dec_place_LC(info);
		else if (lc == columnItmGrpItm_amt_dec_place) doItmGrpItm_amt_dec_place_LC(info);
		else if (lc == columnItmGrpItm_rate_dec_place) doItmGrpItm_rate_dec_place_LC(info);
		else if (lc == columnItmGrpItm_itm_grp_cd) doItmGrpItm_itm_grp_cd_LC(info);
		else if (lc == columnItmGrpItm_itm_cd_key) doItmGrpItm_itm_cd_key_LC(info);
		else if (lc == columnItmGrpItm_itm_sub1_key) doItmGrpItm_itm_sub1_key_LC(info);
		else if (lc == columnItmGrpItm_itm_sub2_key) doItmGrpItm_itm_sub2_key_LC(info);
		else if (lc == columnItmGrpItm_itm_sub3_key) doItmGrpItm_itm_sub3_key_LC(info);
		else if (lc == columnItmGrpCst_cst_cd) doItmGrpCst_cst_cd_LC(info);
		else if (lc == columnItmGrpCst_cst_nm) doItmGrpCst_cst_nm_LC(info);
		else if (lc == columnItmGrpCst_row_sort_col) doItmGrpCst_row_sort_col_LC(info);
		else if (lc == columnItmGrpCst_row_title_nm) doItmGrpCst_row_title_nm_LC(info);
		else if (lc == columnItmGrpCst_slo) doItmGrpCst_slo_LC(info);
		else if (lc == columnItmGrpCst_slo_bl) doItmGrpCst_slo_bl_LC(info);
		else if (lc == columnItmGrpCst_sls) doItmGrpCst_sls_LC(info);
		else if (lc == columnItmGrpCst_sum) doItmGrpCst_sum_LC(info);
		else if (lc == columnItmGrpCst_spln) doItmGrpCst_spln_LC(info);
		else if (lc == columnItmGrpCst_spln_per_cmpl_slo) doItmGrpCst_spln_per_cmpl_slo_LC(info);
		else if (lc == columnItmGrpCst_spln_per_cmpl_sls) doItmGrpCst_spln_per_cmpl_sls_LC(info);
		else if (lc == columnItmGrpCst_bdg_sls) doItmGrpCst_bdg_sls_LC(info);
		else if (lc == columnItmGrpCst_bdg_per_cmpl_slo) doItmGrpCst_bdg_per_cmpl_slo_LC(info);
		else if (lc == columnItmGrpCst_bdg_per_cmpl_sls) doItmGrpCst_bdg_per_cmpl_sls_LC(info);
		else if (lc == columnItmGrpCst_col_00) doItmGrpCst_col_00_LC(info);
		else if (lc == columnItmGrpCst_col_01) doItmGrpCst_col_01_LC(info);
		else if (lc == columnItmGrpCst_col_02) doItmGrpCst_col_02_LC(info);
		else if (lc == columnItmGrpCst_col_03) doItmGrpCst_col_03_LC(info);
		else if (lc == columnItmGrpCst_col_04) doItmGrpCst_col_04_LC(info);
		else if (lc == columnItmGrpCst_col_05) doItmGrpCst_col_05_LC(info);
		else if (lc == columnItmGrpCst_col_06) doItmGrpCst_col_06_LC(info);
		else if (lc == columnItmGrpCst_col_07) doItmGrpCst_col_07_LC(info);
		else if (lc == columnItmGrpCst_col_08) doItmGrpCst_col_08_LC(info);
		else if (lc == columnItmGrpCst_col_09) doItmGrpCst_col_09_LC(info);
		else if (lc == columnItmGrpCst_col_10) doItmGrpCst_col_10_LC(info);
		else if (lc == columnItmGrpCst_col_11) doItmGrpCst_col_11_LC(info);
		else if (lc == columnItmGrpCst_col_12) doItmGrpCst_col_12_LC(info);
		else if (lc == columnItmGrpCst_col_13) doItmGrpCst_col_13_LC(info);
		else if (lc == columnItmGrpCst_col_14) doItmGrpCst_col_14_LC(info);
		else if (lc == columnItmGrpCst_col_15) doItmGrpCst_col_15_LC(info);
		else if (lc == columnItmGrpCst_col_16) doItmGrpCst_col_16_LC(info);
		else if (lc == columnItmGrpCst_col_17) doItmGrpCst_col_17_LC(info);
		else if (lc == columnItmGrpCst_base_unit_dec_place) doItmGrpCst_base_unit_dec_place_LC(info);
		else if (lc == columnItmGrpCst_amt_dec_place) doItmGrpCst_amt_dec_place_LC(info);
		else if (lc == columnItmGrpCst_rate_dec_place) doItmGrpCst_rate_dec_place_LC(info);
		else if (lc == columnItmGrpCst_itm_grp_cd) doItmGrpCst_itm_grp_cd_LC(info);
		else if (lc == columnItmGrpCst_cst_cd_key) doItmGrpCst_cst_cd_key_LC(info);
	}

	/**
	 * [Cnd]パネルの[inpt_ym_d]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ym_d_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_disp_term_d]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_disp_term_d_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_term_d]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_term_d_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_bdg_grp_d]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_bdg_grp_d_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_cd_d]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_cd_d_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_nm_d]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_nm_d_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_lvl_cd_d]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_lvl_cd_d_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_lvl_nm_d]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_lvl_nm_d_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd_d]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_d_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm_d]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_d_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inpt_ym_ig]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inpt_ym_ig_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_disp_term_ig]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_disp_term_ig_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sum_term_ig]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sum_term_ig_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_bdg_grp_ig]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_bdg_grp_ig_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_cd_ig]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_cd_ig_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xrate_nm_ig]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xrate_nm_ig_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_lvl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_lvl_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_cd_ig]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_cd_ig_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_itm_grp_nm_ig]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_itm_grp_nm_ig_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[unit]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[big_num_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_big_num_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[big_num_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_big_num_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[itm_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_itm_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[itm_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_itm_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[row_sort_col]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_row_sort_col_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[row_title_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_row_title_nm_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[slo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_slo_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[slo_bl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_slo_bl_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_sls_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[sum]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_sum_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[spln]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_spln_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[spln_per_cmpl_slo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_spln_per_cmpl_slo_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[spln_per_cmpl_sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_spln_per_cmpl_sls_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[bdg_sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_bdg_sls_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[bdg_per_cmpl_slo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_bdg_per_cmpl_slo_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[bdg_per_cmpl_sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_bdg_per_cmpl_sls_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_00]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_00_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_01]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_01_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_02]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_02_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_03]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_03_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_04]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_04_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_05]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_05_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_06]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_06_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_07]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_07_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_08]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_08_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_09]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_09_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_10_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_11_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_12_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_13_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_14_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_15_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_16_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[col_17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_col_17_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[dpt1_key]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_dpt1_key_LC(MCEventInfo info){
	}

	/**
	 * [DptDtl1]パネルの[dpt_nm1_key]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDtl1_dpt_nm1_key_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[dw_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_dw_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[dw_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_dw_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[row_sort_col]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_row_sort_col_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[row_title_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_row_title_nm_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[slo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_slo_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[slo_bl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_slo_bl_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_sls_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[sum]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_sum_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[spln]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_spln_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[spln_per_cmpl_slo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_spln_per_cmpl_slo_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[spln_per_cmpl_sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_spln_per_cmpl_sls_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[bdg_sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_bdg_sls_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[bdg_per_cmpl_slo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_bdg_per_cmpl_slo_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[bdg_per_cmpl_sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_bdg_per_cmpl_sls_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_00]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_00_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_01]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_01_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_02]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_02_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_03]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_03_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_04]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_04_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_05]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_05_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_06]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_06_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_07]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_07_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_08]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_08_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_09]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_09_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_10_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_11_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_12_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_13_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_14_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_15_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_16_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[col_17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_col_17_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[dpt2_key]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_dpt2_key_LC(MCEventInfo info){
	}

	/**
	 * [DptDwDpt]パネルの[dpt_nm2_key]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptDwDpt_dpt_nm2_key_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[sls_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_sls_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[sls_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_sls_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[row_sort_col]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_row_sort_col_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[row_title_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_row_title_nm_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[slo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_slo_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[slo_bl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_slo_bl_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_sls_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[sum]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_sum_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[spln]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_spln_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[spln_per_cmpl_slo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_spln_per_cmpl_slo_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[spln_per_cmpl_sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_spln_per_cmpl_sls_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[bdg_sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_bdg_sls_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[bdg_per_cmpl_slo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_bdg_per_cmpl_slo_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[bdg_per_cmpl_sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_bdg_per_cmpl_sls_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_00]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_00_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_01]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_01_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_02]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_02_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_03]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_03_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_04]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_04_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_05]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_05_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_06]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_06_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_07]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_07_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_08]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_08_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_09]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_09_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_10_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_11_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_12_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_13_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_14_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_15_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_16_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[col_17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_col_17_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [DptSlsUsr]パネルの[sls_usr_cd_key]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptSlsUsr_sls_usr_cd_key_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[row_sort_col]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_row_sort_col_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[row_title_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_row_title_nm_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[slo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_slo_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[slo_bl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_slo_bl_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_sls_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[sum]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_sum_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[spln]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_spln_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[spln_per_cmpl_slo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_spln_per_cmpl_slo_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[spln_per_cmpl_sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_spln_per_cmpl_sls_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[bdg_sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_bdg_sls_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[bdg_per_cmpl_slo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_bdg_per_cmpl_slo_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[bdg_per_cmpl_sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_bdg_per_cmpl_sls_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_00]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_00_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_01]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_01_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_02]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_02_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_03]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_03_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_04]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_04_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_05]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_05_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_06]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_06_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_07]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_07_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_08]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_08_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_09]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_09_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_10_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_11_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_12_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_13_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_14_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_15_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_16_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[col_17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_col_17_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [DptCst]パネルの[cst_cd_key]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDptCst_cst_cd_key_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[base_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_base_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[unit]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_unit_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[big_num_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_big_num_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpHdr]パネルの[big_num_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpHdr_big_num_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[itm_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_itm_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[itm_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_itm_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[row_sort_col]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_row_sort_col_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[row_title_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_row_title_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[slo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_slo_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[slo_bl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_slo_bl_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_sls_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[sum]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_sum_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[spln]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_spln_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[spln_per_cmpl_slo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_spln_per_cmpl_slo_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[spln_per_cmpl_sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_spln_per_cmpl_sls_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[bdg_sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_bdg_sls_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[bdg_per_cmpl_slo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_bdg_per_cmpl_slo_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[bdg_per_cmpl_sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_bdg_per_cmpl_sls_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_00]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_00_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_01]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_01_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_02]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_02_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_03]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_03_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_04]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_04_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_05]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_05_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_06]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_06_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_07]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_07_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_08]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_08_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_09]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_09_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_10_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_11_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_12_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_13_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_14_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_15_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_16_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[col_17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_col_17_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[rate_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_rate_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[itm_grp1_key]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_itm_grp1_key_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDtl1]パネルの[itm_grp_nm1_key]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDtl1_itm_grp_nm1_key_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[dw_itm_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_dw_itm_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[dw_itm_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_dw_itm_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[row_sort_col]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_row_sort_col_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[row_title_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_row_title_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[slo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_slo_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[slo_bl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_slo_bl_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_sls_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[sum]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_sum_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[spln]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_spln_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[spln_per_cmpl_slo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_spln_per_cmpl_slo_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[spln_per_cmpl_sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_spln_per_cmpl_sls_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[bdg_sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_bdg_sls_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[bdg_per_cmpl_slo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_bdg_per_cmpl_slo_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[bdg_per_cmpl_sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_bdg_per_cmpl_sls_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_00]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_00_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_01]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_01_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_02]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_02_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_03]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_03_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_04]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_04_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_05]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_05_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_06]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_06_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_07]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_07_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_08]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_08_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_09]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_09_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_10_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_11_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_12_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_13_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_14_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_15_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_16_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[col_17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_col_17_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[rate_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_rate_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[itm_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_itm_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpDwItmGrp]パネルの[itm_grp2_key]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpDwItmGrp_itm_grp2_key_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[row_sort_col]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_row_sort_col_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[row_title_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_row_title_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[slo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_slo_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[slo_bl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_slo_bl_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_sls_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[sum]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_sum_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[spln]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_spln_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[spln_per_cmpl_slo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_spln_per_cmpl_slo_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[spln_per_cmpl_sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_spln_per_cmpl_sls_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[bdg_sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_bdg_sls_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[bdg_per_cmpl_slo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_bdg_per_cmpl_slo_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[bdg_per_cmpl_sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_bdg_per_cmpl_sls_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_00]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_00_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_01]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_01_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_02]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_02_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_03]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_03_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_04]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_04_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_05]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_05_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_06]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_06_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_07]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_07_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_08]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_08_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_09]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_09_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_10_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_11_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_12_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_13_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_14_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_15_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_16_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[col_17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_col_17_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[rate_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_rate_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[itm_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_itm_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[itm_cd_key]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_itm_cd_key_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[itm_sub1_key]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_itm_sub1_key_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[itm_sub2_key]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_itm_sub2_key_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpItm]パネルの[itm_sub3_key]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpItm_itm_sub3_key_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[row_sort_col]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_row_sort_col_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[row_title_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_row_title_nm_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[slo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_slo_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[slo_bl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_slo_bl_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_sls_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[sum]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_sum_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[spln]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_spln_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[spln_per_cmpl_slo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_spln_per_cmpl_slo_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[spln_per_cmpl_sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_spln_per_cmpl_sls_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[bdg_sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_bdg_sls_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[bdg_per_cmpl_slo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_bdg_per_cmpl_slo_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[bdg_per_cmpl_sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_bdg_per_cmpl_sls_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_00]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_00_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_01]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_01_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_02]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_02_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_03]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_03_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_04]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_04_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_05]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_05_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_06]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_06_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_07]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_07_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_08]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_08_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_09]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_09_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_10_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_11_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_12_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_13_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_14_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_15_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_16_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[col_17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_col_17_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[rate_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_rate_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[itm_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_itm_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [ItmGrpCst]パネルの[cst_cd_key]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doItmGrpCst_cst_cd_key_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_sls_bdg_grp_d]の作成メソッド
	 */
	public MCList getCnd_sls_bdg_grp_d(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getSlsBdgGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_xrate_cd_d]の作成メソッド
	 */
	public MCList getCnd_xrate_cd_d(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getXrate(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dpt_lvl_cd_d]の作成メソッド
	 */
	public MCList getCnd_dpt_lvl_cd_d(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDptLvl(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dpt_cd_d]の作成メソッド
	 */
	public MCList getCnd_dpt_cd_d(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sls_bdg_grp_ig]の作成メソッド
	 */
	public MCList getCnd_sls_bdg_grp_ig(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getSlsBdgGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_xrate_cd_ig]の作成メソッド
	 */
	public MCList getCnd_xrate_cd_ig(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getXrate(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sls_itm_grp_lvl]の作成メソッド
	 */
	public MCList getCnd_sls_itm_grp_lvl(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsItmGrpLvl(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sls_itm_grp_cd_ig]の作成メソッド
	 */
	public MCList getCnd_sls_itm_grp_cd_ig(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsItmGrpBtm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_big_num_rnd_typ]の作成メソッド
	 */
	public MCList getHdr_big_num_rnd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBigNumRndTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[ItmGrpHdr_big_num_rnd_typ]の作成メソッド
	 */
	public MCList getItmGrpHdr_big_num_rnd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBigNumRndTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBBL1400.Srch01")) {
			return new MS_MSBBL1400_Srch01Bridge();
		}
		if (id.equals("MS.MSBBL1400.Srch02")) {
			return new MS_MSBBL1400_Srch02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBBL1400_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1400_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1400_Srch01;

		/** コンストラクタ */
		protected MS_MSBBL1400_Srch01Bridge() {
			p_MS_MSBBL1400_Srch01 = new MCParam(PDef.MS_MSBBL1400_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1400_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1400.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1400.RsltR.class));

			p_MS_MSBBL1400_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1400_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1400_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1400_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1400_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1400.CndR up0() {
			return (mcframe.clientMSBB.MSBBP1400.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1400.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1400.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1400_Srch01.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1400.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1400_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP1400.RsltR>)p_MS_MSBBL1400_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBBL1400_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBBL1400_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBBL1400_Srch02;

		/** コンストラクタ */
		protected MS_MSBBL1400_Srch02Bridge() {
			p_MS_MSBBL1400_Srch02 = new MCParam(PDef.MS_MSBBL1400_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBBL1400_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBB.MSBBP1400.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1400.RsltR.class));

			p_MS_MSBBL1400_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBBL1400_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBBL1400_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBBL1400_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBBL1400_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBB.MSBBP1400.CndR up0() {
			return (mcframe.clientMSBB.MSBBP1400.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBB.MSBBP1400.RsltR> down0() {
			return (MCList<mcframe.clientMSBB.MSBBP1400.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBBL1400_Srch02.addDownBlock(MCList.create(mcframe.clientMSBB.MSBBP1400.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBBL1400_Srch02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBB.MSBBP1400.RsltR>)p_MS_MSBBL1400_Srch02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
}