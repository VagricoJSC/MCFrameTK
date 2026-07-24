package mcframe.clientMGBF.MGBFP0320;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
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
import mcframe.clientMGBF.MGBFP0320.MGBFP_CostReportPrnt_MC.MG_MGBFL0320_Srch01Caller;
import mcframe.clientMGBF.MGBFP0320.MGBFP_CostReportPrnt_MC.MG_MGBFL0320_Prnt01Caller;

/**
 * 画面"MGBFP_CostReportPrnt"パネルクラスです。<p>
 *
 * 原価帳票を印刷します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBFP_CostReportPrnt_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MG";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MGBF";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBFP0320";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_calc_grp_cd_Label = null;
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_calc_grp_cd = null;
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public MCTextField Cnd_calc_grp_nm = null;
	public mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H Cnd_calc_no_p_PPanel;
	public MCTextComboBox Cnd_calc_no;	// [Cnd]の[calc_no_p.calc_no]を[Cnd_calc_no]としてエイリアス定義。
	public MCTextField Cnd_rmrks;	// [Cnd]の[calc_no_p.rmrks]を[Cnd_rmrks]としてエイリアス定義。
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Center]ブロック関連のField定義
	public MCPanel CenterPanel = null;
	// [Center]ブロックの項目のField定義
	// [Tab]ブロック関連のField定義
	public MCPanel TabPanel = null;
	public MCTabbedPane TabTab = null;
	// [Tab]ブロックの項目のField定義
	// [Tgt]ブロック関連のField定義
	public MCPanel TgtPanel = null;
	// [Tgt]ブロックの項目のField定義
	public MCLabel Tgt_calc_grp_cd_Label = null;
	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public MCTextField Tgt_calc_grp_cd = null;
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public MCTextField Tgt_calc_grp_nm = null;
	public MCLabel Tgt_calc_no_Label = null;
	/**
	 * Calculation No. 原価計算ＮＯ.<p>
	 *
	 */
	public MCTextField Tgt_calc_no = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCTextField Tgt_rmrks = null;
	/**
	 * Term 期.<p>
	 *
	 */
	public MCDateField Tgt_term = null;
	/**
	 * First month of the term 対象期間先頭年月.<p>
	 *
	 */
	public MCDateField Tgt_st_ym = null;
	/**
	 * Last month of the term 対象期間末尾年月.<p>
	 *
	 */
	public MCDateField Tgt_end_ym = null;
	public MCLabel Tgt_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Tgt_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Tgt_wg_nm = null;
	public MCLabel Tgt_ym_fr_Label = null;
	/**
	 * Month FROM 年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateComboBox Tgt_ym_fr = null;
	public MCLabel Tgt_ym_to_Label = null;
	/**
	 * Month TO 年月ＴＯ.<p>
	 *
	 */
	public MCDateComboBox Tgt_ym_to = null;
	public MCLabel Tgt_mng_dpt_cd_Label = null;
	/**
	 * Management dept. cd. 管理部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Tgt_mng_dpt_cd = null;
	/**
	 * Management dept. name 管理部門名.<p>
	 *
	 */
	public MCTextField Tgt_mng_dpt_nm = null;
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Tgt_itm_typ_p_PPanel;
	public MCTextComboBox Tgt_itm_typ;	// [Tgt]の[itm_typ_p.itm_typ]を[Tgt_itm_typ]としてエイリアス定義。
	public MCTextComboBox Tgt_itm_typ_d_cd;	// [Tgt]の[itm_typ_p.itm_typ_d_cd]を[Tgt_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Tgt_itm_typ_d_nm;	// [Tgt]の[itm_typ_p.itm_typ_d_nm]を[Tgt_itm_typ_d_nm]としてエイリアス定義。
	public MCLabel Tgt_itm_jnl_cd_Label = null;
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Tgt_itm_jnl_cd = null;
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public MCTextField Tgt_itm_jnl_nm = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Tgt_itm_p_PPanel;
	public MCTextField Tgt_itm_cd;	// [Tgt]の[itm_p.itm_cd]を[Tgt_itm_cd]としてエイリアス定義。
	public MCTextComboBox Tgt_itm_sub1;	// [Tgt]の[itm_p.itm_sub1]を[Tgt_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Tgt_itm_sub2;	// [Tgt]の[itm_p.itm_sub2]を[Tgt_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Tgt_itm_sub3;	// [Tgt]の[itm_p.itm_sub3]を[Tgt_itm_sub3]としてエイリアス定義。
	public MCTextField Tgt_itm_nm;	// [Tgt]の[itm_p.itm_nm]を[Tgt_itm_nm]としてエイリアス定義。
	public MCLabel Tgt_lot_no_Label = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCTextField Tgt_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCTextField Tgt_sublot_no = null;
	public MCLabel Tgt_sno1_Label = null;
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public MCTextField Tgt_sno1 = null;
	public MCLabel Tgt_sno2_Label = null;
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public MCTextField Tgt_sno2 = null;
	public MCLabel Tgt_sno3_Label = null;
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public MCTextField Tgt_sno3 = null;
	public MCLabel Tgt_sno4_Label = null;
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public MCTextField Tgt_sno4 = null;
	public MCLabel Tgt_bp_cd_Label = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCTextField Tgt_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCTextField Tgt_bp_nm = null;
	/**
	 * Without BP 取引先無.<p>
	 *
	 */
	public MCCheckBox Tgt_no_bp_flg = null;
	public MCLabel Tgt_cntry_cd_Label = null;
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Tgt_cntry_cd = null;
	/**
	 * Country name 国名.<p>
	 *
	 */
	public MCTextField Tgt_cntry_nm = null;
	public MCLabel Tgt_area_cd_Label = null;
	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Tgt_area_cd = null;
	/**
	 * Region name 地域名.<p>
	 *
	 */
	public MCTextField Tgt_area_nm = null;
	public MCLabel Tgt_asst_typ_Label = null;
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public MCTextComboBox Tgt_asst_typ = null;
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public MCTextField Tgt_asst_typ_nm = null;
	public MCLabel Tgt_itm_grp_cd1_Label = null;
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Tgt_itm_grp_cd1 = null;
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public MCTextField Tgt_itm_grp_nm1 = null;
	public MCLabel Tgt_itm_grp_cd2_Label = null;
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Tgt_itm_grp_cd2 = null;
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public MCTextField Tgt_itm_grp_nm2 = null;
	public MCLabel Tgt_itm_grp_cd3_Label = null;
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Tgt_itm_grp_cd3 = null;
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public MCTextField Tgt_itm_grp_nm3 = null;
	public MCLabel Tgt_itm_grp_cd4_Label = null;
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Tgt_itm_grp_cd4 = null;
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public MCTextField Tgt_itm_grp_nm4 = null;
	public MCLabel Tgt_itm_grp_cd5_Label = null;
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Tgt_itm_grp_cd5 = null;
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public MCTextField Tgt_itm_grp_nm5 = null;
	public MCLabel Tgt_itm_grp_cd6_Label = null;
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Tgt_itm_grp_cd6 = null;
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public MCTextField Tgt_itm_grp_nm6 = null;
	public MCLabel Tgt_itm_grp_cd7_Label = null;
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Tgt_itm_grp_cd7 = null;
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public MCTextField Tgt_itm_grp_nm7 = null;
	public MCLabel Tgt_itm_grp_cd8_Label = null;
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Tgt_itm_grp_cd8 = null;
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public MCTextField Tgt_itm_grp_nm8 = null;
	public MCLabel Tgt_itm_grp_cd9_Label = null;
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Tgt_itm_grp_cd9 = null;
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public MCTextField Tgt_itm_grp_nm9 = null;
	public MCLabel Tgt_itm_grp_cd10_Label = null;
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Tgt_itm_grp_cd10 = null;
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public MCTextField Tgt_itm_grp_nm10 = null;
	public MCLabel Tgt_bp_grp_cd1_Label = null;
	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Tgt_bp_grp_cd1 = null;
	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public MCTextField Tgt_bp_grp_nm1 = null;
	public MCLabel Tgt_bp_grp_cd2_Label = null;
	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Tgt_bp_grp_cd2 = null;
	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public MCTextField Tgt_bp_grp_nm2 = null;
	public MCLabel Tgt_bp_grp_cd3_Label = null;
	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Tgt_bp_grp_cd3 = null;
	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public MCTextField Tgt_bp_grp_nm3 = null;
	public MCLabel Tgt_bp_grp_cd4_Label = null;
	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Tgt_bp_grp_cd4 = null;
	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public MCTextField Tgt_bp_grp_nm4 = null;
	public MCLabel Tgt_bp_grp_cd5_Label = null;
	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Tgt_bp_grp_cd5 = null;
	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public MCTextField Tgt_bp_grp_nm5 = null;
	public MCLabel Tgt_bp_grp_cd6_Label = null;
	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Tgt_bp_grp_cd6 = null;
	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public MCTextField Tgt_bp_grp_nm6 = null;
	public MCLabel Tgt_bp_grp_cd7_Label = null;
	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Tgt_bp_grp_cd7 = null;
	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public MCTextField Tgt_bp_grp_nm7 = null;
	public MCLabel Tgt_bp_grp_cd8_Label = null;
	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Tgt_bp_grp_cd8 = null;
	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public MCTextField Tgt_bp_grp_nm8 = null;
	public MCLabel Tgt_bp_grp_cd9_Label = null;
	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Tgt_bp_grp_cd9 = null;
	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public MCTextField Tgt_bp_grp_nm9 = null;
	public MCLabel Tgt_bp_grp_cd10_Label = null;
	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Tgt_bp_grp_cd10 = null;
	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public MCTextField Tgt_bp_grp_nm10 = null;
	// [Itm]ブロック関連のField定義
	public MCPanel ItmPanel = null;
	// [Itm]ブロックの項目のField定義
	// [Bp]ブロック関連のField定義
	public MCPanel BpPanel = null;
	// [Bp]ブロックの項目のField定義
	// [Report]ブロック関連のField定義
	public MCPanel ReportPanel = null;
	public MCScrollPane ReportScrollPane = null;
	public MCTable2<mcframe.clientMGBF.MGBFP0320.ReportR> ReportTable = null;
	// [Report]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnReport_check = null;
	/**
	 * Report ID 帳票ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnReport_report_id = null;
	/**
	 * Report name 帳票名.<p>
	 *
	 */
	public MCColumnConfig columnReport_report_nm = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnReport_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnReport_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnReport_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnReport_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnReport_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnReport_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnReport_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnReport_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnReport_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnReport_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnReport_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnReport_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnReport_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnReport_upd_srv_req_no = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Cost printing report 原価帳票.<p>
	 *
	 */
	public MCButton Btn_prnt = null;
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Btn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Btn_deselect_all = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [PRNT]モードを表す定数 */
	public static final String PRNT = "PRNT";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, PRNT};
	
	/** [MG_MGBFL0320_Srch01]のCallerの作成 */
	protected MGBFP_CostReportPrnt_MC.MG_MGBFL0320_Srch01Caller createMG_MGBFL0320_Srch01() {
		MGBFP_CostReportPrnt_MC.MG_MGBFL0320_Srch01Caller<MGBFP_CostReportPrnt, MG_MGBFL0320_Srch01Bridge>
		caller = ((MGBFP_CostReportPrnt_MC)this).new MG_MGBFL0320_Srch01Caller<MGBFP_CostReportPrnt, MG_MGBFL0320_Srch01Bridge>(
					(MGBFP_CostReportPrnt)this, new MG_MGBFL0320_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBFL0320_Srch01]の呼び出し */
	protected void callMG_MGBFL0320_Srch01() {
		MCCaller caller = createMG_MGBFL0320_Srch01();
		caller.exec();
	}
	/** [MG_MGBFL0320_Prnt01]のCallerの作成 */
	protected MGBFP_CostReportPrnt_MC.MG_MGBFL0320_Prnt01Caller createMG_MGBFL0320_Prnt01() {
		MGBFP_CostReportPrnt_MC.MG_MGBFL0320_Prnt01Caller<MGBFP_CostReportPrnt, MG_MGBFL0320_Prnt01Bridge>
		caller = ((MGBFP_CostReportPrnt_MC)this).new MG_MGBFL0320_Prnt01Caller<MGBFP_CostReportPrnt, MG_MGBFL0320_Prnt01Bridge>(
					(MGBFP_CostReportPrnt)this, new MG_MGBFL0320_Prnt01Bridge());
		return caller;
	}
	/** [MG_MGBFL0320_Prnt01]の呼び出し */
	protected void callMG_MGBFL0320_Prnt01() {
		MCCaller caller = createMG_MGBFL0320_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBF.MGBFP0320.CndR aCndR;
	/** [Tgt]ブロックのコンテナField定義 */
	private final mcframe.clientMGBF.MGBFP0320.TgtR aTgtR;
	/** [Report]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBF.MGBFP0320.ReportR> aReportL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBF.MGBFP0320.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBF.MGBFP0320.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBF.MGBFP0320.CndR createCndR() {
		return mcframe.clientMGBF.MGBFP0320.CndR.create();
	}

	/**
	 * 項目コピーによってaTgtRを設定します。
	 *
	 * aTgtRのインスタンスは変更されません。
	 *
	 * @param row TgtR
	 */
	public void setTgtR(mcframe.clientMGBF.MGBFP0320.TgtR row) {
		if (row != null) {
			MCRow.copyall(getTgtR(), row);
		}
	}

	/**
	 * [Tgt]ブロックのコンテナaTgtRを返します。
	 *
	 * @return TgtR
	 */
	public mcframe.clientMGBF.MGBFP0320.TgtR getTgtR() {
		return aTgtR;
	}

	/**
	 * aTgtRを作成します。
	 *
	 * @return TgtR
	 */
	public mcframe.clientMGBF.MGBFP0320.TgtR createTgtR() {
		return mcframe.clientMGBF.MGBFP0320.TgtR.create();
	}

	/**
	 * コピーによってaReportLを設定します。
	 *
	 * aReportLのインスタンスは変更されません。
	 *
	 * @param dataset ReportL
	 */
	public void setReportL(MCList<mcframe.clientMGBF.MGBFP0320.ReportR> aList) {
		if (getReportL() != aList) {
			getReportL().setAll(aList);
		}
	}

	/**
	 * [Report]ブロックのコンテナaReportLを返します。
	 *
	 * @return ReportL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0320.ReportR> getReportL() {
		return aReportL;
	}

	/**
	 * aReportRを作成します。
	 *
	 * @return ReportR
	 */
	public mcframe.clientMGBF.MGBFP0320.ReportR createReportR() {
		return mcframe.clientMGBF.MGBFP0320.ReportR.create();
	}

	/**
	 * aReportLを作成します。
	 *
	 * @return ReportL
	 */
	public MCList<mcframe.clientMGBF.MGBFP0320.ReportR> createReportL() {
		return MCList.create(mcframe.clientMGBF.MGBFP0320.ReportR.class);
	}

	/**
	 * ReportTableを初期化します。
	 */
	protected void createReportTable(){
		if(ReportTable == null){
			ReportTable = beansFactory.createTable2("Report.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getTgtR())) ret.add(getTgtR());
		if(!MCCollectionUtil.contains(ret, getReportL())) ret.add(getReportL());
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
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getTgtR()) return "Tgt";
		if(aCnt == getReportL()) return "Report";
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
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("Tgt")) return getTgtR();
		if(bId.equals("Report")) return getReportL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(TopPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(CenterPanel);
		ret.add(TabPanel);
		ret.add(TgtPanel);
		ret.add(ItmPanel);
		ret.add(BpPanel);
		ret.add(ReportPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBFP_CostReportPrnt_MC_A() {
		aCndR = createCndR();
		aTgtR = createTgtR();
		aReportL = createReportL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBFP_CostReportPrnt_MC_A(String name) {
		aCndR = createCndR();
		aTgtR = createTgtR();
		aReportL = createReportL();
		createReportTable();
		ReportTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBFP_CostReportPrnt_MC.jbCreateTop((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbCreateCnd((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbCreateCtrl((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbCreateCenter((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbCreateTab((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbCreateTgt((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbCreateItm((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbCreateBp((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbCreateReport((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbCreateBtn((MGBFP_CostReportPrnt)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBFP_CostReportPrnt p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBFP_CostReportPrnt p) {
		p.Cnd_calc_no_p_PPanel = mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.create(p.getCndR().calc_no_p());
		p.Cnd_calc_no_p_PPanel.setName("Cnd.calc_no_p");
		p.Cnd_calc_no = p.Cnd_calc_no_p_PPanel.CalcNo_calc_no;
		p.Cnd_calc_no.addAliasName("Cnd.calc_no", p);
		p.Cnd_rmrks = p.Cnd_calc_no_p_PPanel.CalcNo_rmrks;
		p.Cnd_rmrks.addAliasName("Cnd.rmrks", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBFP_CostReportPrnt p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Center]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCenter(MGBFP_CostReportPrnt p) {
	}

	/**
	 * [Tab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab(MGBFP_CostReportPrnt p) {
	}

	/**
	 * [Tgt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTgt(MGBFP_CostReportPrnt p) {
		p.Tgt_itm_typ_p_PPanel = mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.create(p.getTgtR().itm_typ_p());
		p.Tgt_itm_typ_p_PPanel.setName("Tgt.itm_typ_p");
		p.Tgt_itm_typ = p.Tgt_itm_typ_p_PPanel.ItmTyp_itm_typ;
		p.Tgt_itm_typ.addAliasName("Tgt.itm_typ", p);
		p.Tgt_itm_typ_d_cd = p.Tgt_itm_typ_p_PPanel.ItmTyp_itm_typ_d_cd;
		p.Tgt_itm_typ_d_cd.addAliasName("Tgt.itm_typ_d_cd", p);
		p.Tgt_itm_typ_d_nm = p.Tgt_itm_typ_p_PPanel.ItmTyp_itm_typ_d_nm;
		p.Tgt_itm_typ_d_nm.addAliasName("Tgt.itm_typ_d_nm", p);
		p.Tgt_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getTgtR().itm_p());
		p.Tgt_itm_p_PPanel.setName("Tgt.itm_p");
		p.Tgt_itm_cd = p.Tgt_itm_p_PPanel.Itm_itm_cd;
		p.Tgt_itm_cd.addAliasName("Tgt.itm_cd", p);
		p.Tgt_itm_sub1 = p.Tgt_itm_p_PPanel.Itm_itm_sub1;
		p.Tgt_itm_sub1.addAliasName("Tgt.itm_sub1", p);
		p.Tgt_itm_sub2 = p.Tgt_itm_p_PPanel.Itm_itm_sub2;
		p.Tgt_itm_sub2.addAliasName("Tgt.itm_sub2", p);
		p.Tgt_itm_sub3 = p.Tgt_itm_p_PPanel.Itm_itm_sub3;
		p.Tgt_itm_sub3.addAliasName("Tgt.itm_sub3", p);
		p.Tgt_itm_nm = p.Tgt_itm_p_PPanel.Itm_itm_nm;
		p.Tgt_itm_nm.addAliasName("Tgt.itm_nm", p);
	}

	/**
	 * [Itm]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateItm(MGBFP_CostReportPrnt p) {
	}

	/**
	 * [Bp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBp(MGBFP_CostReportPrnt p) {
	}

	/**
	 * [Report]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateReport(MGBFP_CostReportPrnt p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBFP_CostReportPrnt p) {
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

	
	/** [Cnd_calc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_calc_grp_cd_p = null;

	/**
	 * [Cnd_calc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_grp_cd_ListPutter() {
		if (Cnd_calc_grp_cd_p == null) {
			Cnd_calc_grp_cd_p = createCnd_calc_grp_cd_ListPutter(Cnd_calc_grp_cd, "calc_grp_cd", "calc_grp_nm");

		}
		return Cnd_calc_grp_cd_p;
	}
	
	
	/** [Cnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter]の定義 */
	private MCListPutter Cnd_calc_no_p_PPanel_CalcNo_calc_no_p = null;

	/**
	 * [Cnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter() {
		if (Cnd_calc_no_p_PPanel_CalcNo_calc_no_p == null) {
			Cnd_calc_no_p_PPanel_CalcNo_calc_no_p = createCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter(Cnd_calc_no_p_PPanel.CalcNo_calc_no, "calc_no", "rmrks");
		}
		return Cnd_calc_no_p_PPanel_CalcNo_calc_no_p;
	}
	
	
	/** [Tgt_wg_cd_ListPutter]の定義 */
	private MCListPutter Tgt_wg_cd_p = null;

	/**
	 * [Tgt_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getTgt_wg_cd_ListPutter() {
		if (Tgt_wg_cd_p == null) {
			Tgt_wg_cd_p = createTgt_wg_cd_ListPutter(Tgt_wg_cd, "wg_cd", "wg_nm");

		}
		return Tgt_wg_cd_p;
	}
	
	
	/** [Tgt_ym_fr_ListPutter]の定義 */
	private MCListPutter Tgt_ym_fr_p = null;

	/**
	 * [Tgt_ym_fr_ListPutter]の取得
	 */
	protected MCListPutter getTgt_ym_fr_ListPutter() {
		if (Tgt_ym_fr_p == null) {
			Tgt_ym_fr_p = createTgt_ym_fr_ListPutter(Tgt_ym_fr, "ym_fr");

		}
		return Tgt_ym_fr_p;
	}
	
	
	/** [Tgt_ym_to_ListPutter]の定義 */
	private MCListPutter Tgt_ym_to_p = null;

	/**
	 * [Tgt_ym_to_ListPutter]の取得
	 */
	protected MCListPutter getTgt_ym_to_ListPutter() {
		if (Tgt_ym_to_p == null) {
			Tgt_ym_to_p = createTgt_ym_to_ListPutter(Tgt_ym_to, "ym_to");

		}
		return Tgt_ym_to_p;
	}
	
	
	/** [Tgt_mng_dpt_cd_ListPutter]の定義 */
	private MCListPutter Tgt_mng_dpt_cd_p = null;

	/**
	 * [Tgt_mng_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getTgt_mng_dpt_cd_ListPutter() {
		if (Tgt_mng_dpt_cd_p == null) {
			Tgt_mng_dpt_cd_p = createTgt_mng_dpt_cd_ListPutter(Tgt_mng_dpt_cd, "mng_dpt_cd", "mng_dpt_nm");

		}
		return Tgt_mng_dpt_cd_p;
	}
	
	
	/** [Tgt_itm_jnl_cd_ListPutter]の定義 */
	private MCListPutter Tgt_itm_jnl_cd_p = null;

	/**
	 * [Tgt_itm_jnl_cd_ListPutter]の取得
	 */
	protected MCListPutter getTgt_itm_jnl_cd_ListPutter() {
		if (Tgt_itm_jnl_cd_p == null) {
			Tgt_itm_jnl_cd_p = createTgt_itm_jnl_cd_ListPutter(Tgt_itm_jnl_cd, "itm_jnl_cd", "itm_jnl_nm");

		}
		return Tgt_itm_jnl_cd_p;
	}
	
	
	/** [Tgt_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Tgt_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Tgt_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getTgt_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Tgt_itm_p_PPanel_Itm_itm_cd_p == null) {
			Tgt_itm_p_PPanel_Itm_itm_cd_p = createTgt_itm_p_PPanel_Itm_itm_cd_ListPutter(Tgt_itm_p_PPanel.Itm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3");
		}
		return Tgt_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Tgt_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Tgt_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Tgt_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getTgt_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Tgt_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Tgt_itm_p_PPanel_Itm_itm_sub1_p = createTgt_itm_p_PPanel_Itm_itm_sub1_ListPutter(Tgt_itm_p_PPanel.Itm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3");
		}
		return Tgt_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Tgt_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Tgt_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Tgt_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getTgt_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Tgt_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Tgt_itm_p_PPanel_Itm_itm_sub2_p = createTgt_itm_p_PPanel_Itm_itm_sub2_ListPutter(Tgt_itm_p_PPanel.Itm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3");
		}
		return Tgt_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Tgt_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Tgt_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Tgt_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getTgt_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Tgt_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Tgt_itm_p_PPanel_Itm_itm_sub3_p = createTgt_itm_p_PPanel_Itm_itm_sub3_ListPutter(Tgt_itm_p_PPanel.Itm_itm_sub3, "itm_sub3", "itm_nm");
		}
		return Tgt_itm_p_PPanel_Itm_itm_sub3_p;
	}
	
	
	/** [Tgt_bp_cd_ListPutter]の定義 */
	private MCListPutter Tgt_bp_cd_p = null;

	/**
	 * [Tgt_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getTgt_bp_cd_ListPutter() {
		if (Tgt_bp_cd_p == null) {
			Tgt_bp_cd_p = createTgt_bp_cd_ListPutter(Tgt_bp_cd, "bp_cd", "bp_nm");

		}
		return Tgt_bp_cd_p;
	}
	
	
	/** [Tgt_cntry_cd_ListPutter]の定義 */
	private MCListPutter Tgt_cntry_cd_p = null;

	/**
	 * [Tgt_cntry_cd_ListPutter]の取得
	 */
	protected MCListPutter getTgt_cntry_cd_ListPutter() {
		if (Tgt_cntry_cd_p == null) {
			Tgt_cntry_cd_p = createTgt_cntry_cd_ListPutter(Tgt_cntry_cd, "cntry_cd", "cntry_nm");

		}
		return Tgt_cntry_cd_p;
	}
	
	
	/** [Tgt_area_cd_ListPutter]の定義 */
	private MCListPutter Tgt_area_cd_p = null;

	/**
	 * [Tgt_area_cd_ListPutter]の取得
	 */
	protected MCListPutter getTgt_area_cd_ListPutter() {
		if (Tgt_area_cd_p == null) {
			Tgt_area_cd_p = createTgt_area_cd_ListPutter(Tgt_area_cd, "area_cd", "area_nm");

		}
		return Tgt_area_cd_p;
	}
	
	
	/** [Tgt_asst_typ_ListPutter]の定義 */
	private MCListPutter Tgt_asst_typ_p = null;

	/**
	 * [Tgt_asst_typ_ListPutter]の取得
	 */
	protected MCListPutter getTgt_asst_typ_ListPutter() {
		if (Tgt_asst_typ_p == null) {
			Tgt_asst_typ_p = createTgt_asst_typ_ListPutter(Tgt_asst_typ, "asst_typ", "asst_typ_nm");

		}
		return Tgt_asst_typ_p;
	}
	
	
	/** [Tgt_itm_grp_cd1_ListPutter]の定義 */
	private MCListPutter Tgt_itm_grp_cd1_p = null;

	/**
	 * [Tgt_itm_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getTgt_itm_grp_cd1_ListPutter() {
		if (Tgt_itm_grp_cd1_p == null) {
			Tgt_itm_grp_cd1_p = createTgt_itm_grp_cd1_ListPutter(Tgt_itm_grp_cd1, "itm_grp_cd1", "itm_grp_nm1");

		}
		return Tgt_itm_grp_cd1_p;
	}
	
	
	/** [Tgt_itm_grp_cd2_ListPutter]の定義 */
	private MCListPutter Tgt_itm_grp_cd2_p = null;

	/**
	 * [Tgt_itm_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getTgt_itm_grp_cd2_ListPutter() {
		if (Tgt_itm_grp_cd2_p == null) {
			Tgt_itm_grp_cd2_p = createTgt_itm_grp_cd2_ListPutter(Tgt_itm_grp_cd2, "itm_grp_cd2", "itm_grp_nm2");

		}
		return Tgt_itm_grp_cd2_p;
	}
	
	
	/** [Tgt_itm_grp_cd3_ListPutter]の定義 */
	private MCListPutter Tgt_itm_grp_cd3_p = null;

	/**
	 * [Tgt_itm_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getTgt_itm_grp_cd3_ListPutter() {
		if (Tgt_itm_grp_cd3_p == null) {
			Tgt_itm_grp_cd3_p = createTgt_itm_grp_cd3_ListPutter(Tgt_itm_grp_cd3, "itm_grp_cd3", "itm_grp_nm3");

		}
		return Tgt_itm_grp_cd3_p;
	}
	
	
	/** [Tgt_itm_grp_cd4_ListPutter]の定義 */
	private MCListPutter Tgt_itm_grp_cd4_p = null;

	/**
	 * [Tgt_itm_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getTgt_itm_grp_cd4_ListPutter() {
		if (Tgt_itm_grp_cd4_p == null) {
			Tgt_itm_grp_cd4_p = createTgt_itm_grp_cd4_ListPutter(Tgt_itm_grp_cd4, "itm_grp_cd4", "itm_grp_nm4");

		}
		return Tgt_itm_grp_cd4_p;
	}
	
	
	/** [Tgt_itm_grp_cd5_ListPutter]の定義 */
	private MCListPutter Tgt_itm_grp_cd5_p = null;

	/**
	 * [Tgt_itm_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getTgt_itm_grp_cd5_ListPutter() {
		if (Tgt_itm_grp_cd5_p == null) {
			Tgt_itm_grp_cd5_p = createTgt_itm_grp_cd5_ListPutter(Tgt_itm_grp_cd5, "itm_grp_cd5", "itm_grp_nm5");

		}
		return Tgt_itm_grp_cd5_p;
	}
	
	
	/** [Tgt_itm_grp_cd6_ListPutter]の定義 */
	private MCListPutter Tgt_itm_grp_cd6_p = null;

	/**
	 * [Tgt_itm_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getTgt_itm_grp_cd6_ListPutter() {
		if (Tgt_itm_grp_cd6_p == null) {
			Tgt_itm_grp_cd6_p = createTgt_itm_grp_cd6_ListPutter(Tgt_itm_grp_cd6, "itm_grp_cd6", "itm_grp_nm6");

		}
		return Tgt_itm_grp_cd6_p;
	}
	
	
	/** [Tgt_itm_grp_cd7_ListPutter]の定義 */
	private MCListPutter Tgt_itm_grp_cd7_p = null;

	/**
	 * [Tgt_itm_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getTgt_itm_grp_cd7_ListPutter() {
		if (Tgt_itm_grp_cd7_p == null) {
			Tgt_itm_grp_cd7_p = createTgt_itm_grp_cd7_ListPutter(Tgt_itm_grp_cd7, "itm_grp_cd7", "itm_grp_nm7");

		}
		return Tgt_itm_grp_cd7_p;
	}
	
	
	/** [Tgt_itm_grp_cd8_ListPutter]の定義 */
	private MCListPutter Tgt_itm_grp_cd8_p = null;

	/**
	 * [Tgt_itm_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getTgt_itm_grp_cd8_ListPutter() {
		if (Tgt_itm_grp_cd8_p == null) {
			Tgt_itm_grp_cd8_p = createTgt_itm_grp_cd8_ListPutter(Tgt_itm_grp_cd8, "itm_grp_cd8", "itm_grp_nm8");

		}
		return Tgt_itm_grp_cd8_p;
	}
	
	
	/** [Tgt_itm_grp_cd9_ListPutter]の定義 */
	private MCListPutter Tgt_itm_grp_cd9_p = null;

	/**
	 * [Tgt_itm_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getTgt_itm_grp_cd9_ListPutter() {
		if (Tgt_itm_grp_cd9_p == null) {
			Tgt_itm_grp_cd9_p = createTgt_itm_grp_cd9_ListPutter(Tgt_itm_grp_cd9, "itm_grp_cd9", "itm_grp_nm9");

		}
		return Tgt_itm_grp_cd9_p;
	}
	
	
	/** [Tgt_itm_grp_cd10_ListPutter]の定義 */
	private MCListPutter Tgt_itm_grp_cd10_p = null;

	/**
	 * [Tgt_itm_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getTgt_itm_grp_cd10_ListPutter() {
		if (Tgt_itm_grp_cd10_p == null) {
			Tgt_itm_grp_cd10_p = createTgt_itm_grp_cd10_ListPutter(Tgt_itm_grp_cd10, "itm_grp_cd10", "itm_grp_nm10");

		}
		return Tgt_itm_grp_cd10_p;
	}
	
	
	/** [Tgt_bp_grp_cd1_ListPutter]の定義 */
	private MCListPutter Tgt_bp_grp_cd1_p = null;

	/**
	 * [Tgt_bp_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getTgt_bp_grp_cd1_ListPutter() {
		if (Tgt_bp_grp_cd1_p == null) {
			Tgt_bp_grp_cd1_p = createTgt_bp_grp_cd1_ListPutter(Tgt_bp_grp_cd1, "bp_grp_cd1", "bp_grp_nm1");

		}
		return Tgt_bp_grp_cd1_p;
	}
	
	
	/** [Tgt_bp_grp_cd2_ListPutter]の定義 */
	private MCListPutter Tgt_bp_grp_cd2_p = null;

	/**
	 * [Tgt_bp_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getTgt_bp_grp_cd2_ListPutter() {
		if (Tgt_bp_grp_cd2_p == null) {
			Tgt_bp_grp_cd2_p = createTgt_bp_grp_cd2_ListPutter(Tgt_bp_grp_cd2, "bp_grp_cd2", "bp_grp_nm2");

		}
		return Tgt_bp_grp_cd2_p;
	}
	
	
	/** [Tgt_bp_grp_cd3_ListPutter]の定義 */
	private MCListPutter Tgt_bp_grp_cd3_p = null;

	/**
	 * [Tgt_bp_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getTgt_bp_grp_cd3_ListPutter() {
		if (Tgt_bp_grp_cd3_p == null) {
			Tgt_bp_grp_cd3_p = createTgt_bp_grp_cd3_ListPutter(Tgt_bp_grp_cd3, "bp_grp_cd3", "bp_grp_nm3");

		}
		return Tgt_bp_grp_cd3_p;
	}
	
	
	/** [Tgt_bp_grp_cd4_ListPutter]の定義 */
	private MCListPutter Tgt_bp_grp_cd4_p = null;

	/**
	 * [Tgt_bp_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getTgt_bp_grp_cd4_ListPutter() {
		if (Tgt_bp_grp_cd4_p == null) {
			Tgt_bp_grp_cd4_p = createTgt_bp_grp_cd4_ListPutter(Tgt_bp_grp_cd4, "bp_grp_cd4", "bp_grp_nm4");

		}
		return Tgt_bp_grp_cd4_p;
	}
	
	
	/** [Tgt_bp_grp_cd5_ListPutter]の定義 */
	private MCListPutter Tgt_bp_grp_cd5_p = null;

	/**
	 * [Tgt_bp_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getTgt_bp_grp_cd5_ListPutter() {
		if (Tgt_bp_grp_cd5_p == null) {
			Tgt_bp_grp_cd5_p = createTgt_bp_grp_cd5_ListPutter(Tgt_bp_grp_cd5, "bp_grp_cd5", "bp_grp_nm5");

		}
		return Tgt_bp_grp_cd5_p;
	}
	
	
	/** [Tgt_bp_grp_cd6_ListPutter]の定義 */
	private MCListPutter Tgt_bp_grp_cd6_p = null;

	/**
	 * [Tgt_bp_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getTgt_bp_grp_cd6_ListPutter() {
		if (Tgt_bp_grp_cd6_p == null) {
			Tgt_bp_grp_cd6_p = createTgt_bp_grp_cd6_ListPutter(Tgt_bp_grp_cd6, "bp_grp_cd6", "bp_grp_nm6");

		}
		return Tgt_bp_grp_cd6_p;
	}
	
	
	/** [Tgt_bp_grp_cd7_ListPutter]の定義 */
	private MCListPutter Tgt_bp_grp_cd7_p = null;

	/**
	 * [Tgt_bp_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getTgt_bp_grp_cd7_ListPutter() {
		if (Tgt_bp_grp_cd7_p == null) {
			Tgt_bp_grp_cd7_p = createTgt_bp_grp_cd7_ListPutter(Tgt_bp_grp_cd7, "bp_grp_cd7", "bp_grp_nm7");

		}
		return Tgt_bp_grp_cd7_p;
	}
	
	
	/** [Tgt_bp_grp_cd8_ListPutter]の定義 */
	private MCListPutter Tgt_bp_grp_cd8_p = null;

	/**
	 * [Tgt_bp_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getTgt_bp_grp_cd8_ListPutter() {
		if (Tgt_bp_grp_cd8_p == null) {
			Tgt_bp_grp_cd8_p = createTgt_bp_grp_cd8_ListPutter(Tgt_bp_grp_cd8, "bp_grp_cd8", "bp_grp_nm8");

		}
		return Tgt_bp_grp_cd8_p;
	}
	
	
	/** [Tgt_bp_grp_cd9_ListPutter]の定義 */
	private MCListPutter Tgt_bp_grp_cd9_p = null;

	/**
	 * [Tgt_bp_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getTgt_bp_grp_cd9_ListPutter() {
		if (Tgt_bp_grp_cd9_p == null) {
			Tgt_bp_grp_cd9_p = createTgt_bp_grp_cd9_ListPutter(Tgt_bp_grp_cd9, "bp_grp_cd9", "bp_grp_nm9");

		}
		return Tgt_bp_grp_cd9_p;
	}
	
	
	/** [Tgt_bp_grp_cd10_ListPutter]の定義 */
	private MCListPutter Tgt_bp_grp_cd10_p = null;

	/**
	 * [Tgt_bp_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getTgt_bp_grp_cd10_ListPutter() {
		if (Tgt_bp_grp_cd10_p == null) {
			Tgt_bp_grp_cd10_p = createTgt_bp_grp_cd10_ListPutter(Tgt_bp_grp_cd10, "bp_grp_cd10", "bp_grp_nm10");

		}
		return Tgt_bp_grp_cd10_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBFP_CostReportPrnt create(){
		MGBFP_CostReportPrnt p = new MGBFP_CostReportPrnt();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBFP_CostReportPrnt create(String name){
		MGBFP_CostReportPrnt p = new MGBFP_CostReportPrnt(name);
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
		MGBFP_CostReportPrnt_MC.jbfInitTop((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbfInitCnd((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbfInitCtrl((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbfInitCenter((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbfInitTab((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbfInitTgt((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbfInitItm((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbfInitBp((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbfInitReport((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbfInitBtn((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbInitTop((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbInitCnd((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbInitCtrl((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbInitCenter((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbInitTab((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbInitTgt((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbInitItm((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbInitBp((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbInitReport((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.jbInitBtn((MGBFP_CostReportPrnt)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBFP_CostReportPrnt p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBFP_CostReportPrnt p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_calc_grp_cd_Label = p.beansFactory.createLabel("Cnd.calc_grp_cd_Label");
		p.Cnd_calc_grp_cd = p.beansFactory.createTextComboBox("Cnd.calc_grp_cd");
		p.Cnd_calc_grp_cd.setLabel(p.Cnd_calc_grp_cd_Label);
		p.Cnd_calc_grp_nm = p.beansFactory.createTextField("Cnd.calc_grp_nm");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBFP_CostReportPrnt p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Center]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCenter(MGBFP_CostReportPrnt p) {
		// ブロック関連の初期化
		p.CenterPanel = p.beansFactory.createPanel("Center");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab(MGBFP_CostReportPrnt p) {
		// ブロック関連の初期化
		p.TabPanel = p.beansFactory.createPanel("Tab");
		p.TabTab = p.beansFactory.createTabbedPane("Tab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Tgt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTgt(MGBFP_CostReportPrnt p) {
		// ブロック関連の初期化
		p.TgtPanel = p.beansFactory.createPanel("Tgt");
		// ブロックの項目の初期化
		p.Tgt_calc_grp_cd_Label = p.beansFactory.createLabel("Tgt.calc_grp_cd_Label");
		p.Tgt_calc_grp_cd = p.beansFactory.createTextField("Tgt.calc_grp_cd");
		p.Tgt_calc_grp_cd.setLabel(p.Tgt_calc_grp_cd_Label);
		p.Tgt_calc_grp_nm = p.beansFactory.createTextField("Tgt.calc_grp_nm");
		p.Tgt_calc_no_Label = p.beansFactory.createLabel("Tgt.calc_no_Label");
		p.Tgt_calc_no = p.beansFactory.createTextField("Tgt.calc_no");
		p.Tgt_calc_no.setLabel(p.Tgt_calc_no_Label);
		p.Tgt_rmrks = p.beansFactory.createTextField("Tgt.rmrks");
		p.Tgt_term = p.beansFactory.createDateField("Tgt.term");
		p.Tgt_st_ym = p.beansFactory.createDateField("Tgt.st_ym");
		p.Tgt_end_ym = p.beansFactory.createDateField("Tgt.end_ym");
		p.Tgt_wg_cd_Label = p.beansFactory.createLabel("Tgt.wg_cd_Label");
		p.Tgt_wg_cd = p.beansFactory.createTextComboBox("Tgt.wg_cd");
		p.Tgt_wg_cd.setLabel(p.Tgt_wg_cd_Label);
		p.Tgt_wg_nm = p.beansFactory.createTextField("Tgt.wg_nm");
		p.Tgt_ym_fr_Label = p.beansFactory.createLabel("Tgt.ym_fr_Label");
		p.Tgt_ym_fr = p.beansFactory.createDateComboBox("Tgt.ym_fr");
		p.Tgt_ym_fr.setLabel(p.Tgt_ym_fr_Label);
		p.Tgt_ym_to_Label = p.beansFactory.createLabel("Tgt.ym_to_Label");
		p.Tgt_ym_to = p.beansFactory.createDateComboBox("Tgt.ym_to");
		p.Tgt_ym_to.setLabel(p.Tgt_ym_to_Label);
		p.Tgt_mng_dpt_cd_Label = p.beansFactory.createLabel("Tgt.mng_dpt_cd_Label");
		p.Tgt_mng_dpt_cd = p.beansFactory.createTextComboBox("Tgt.mng_dpt_cd");
		p.Tgt_mng_dpt_cd.setLabel(p.Tgt_mng_dpt_cd_Label);
		p.Tgt_mng_dpt_nm = p.beansFactory.createTextField("Tgt.mng_dpt_nm");
		p.Tgt_itm_jnl_cd_Label = p.beansFactory.createLabel("Tgt.itm_jnl_cd_Label");
		p.Tgt_itm_jnl_cd = p.beansFactory.createTextComboBox("Tgt.itm_jnl_cd");
		p.Tgt_itm_jnl_cd.setLabel(p.Tgt_itm_jnl_cd_Label);
		p.Tgt_itm_jnl_nm = p.beansFactory.createTextField("Tgt.itm_jnl_nm");
		p.Tgt_lot_no_Label = p.beansFactory.createLabel("Tgt.lot_no_Label");
		p.Tgt_lot_no = p.beansFactory.createTextField("Tgt.lot_no");
		p.Tgt_lot_no.setLabel(p.Tgt_lot_no_Label);
		p.Tgt_sublot_no = p.beansFactory.createTextField("Tgt.sublot_no");
		p.Tgt_sno1_Label = p.beansFactory.createLabel("Tgt.sno1_Label");
		p.Tgt_sno1 = p.beansFactory.createTextField("Tgt.sno1");
		p.Tgt_sno1.setLabel(p.Tgt_sno1_Label);
		p.Tgt_sno2_Label = p.beansFactory.createLabel("Tgt.sno2_Label");
		p.Tgt_sno2 = p.beansFactory.createTextField("Tgt.sno2");
		p.Tgt_sno2.setLabel(p.Tgt_sno2_Label);
		p.Tgt_sno3_Label = p.beansFactory.createLabel("Tgt.sno3_Label");
		p.Tgt_sno3 = p.beansFactory.createTextField("Tgt.sno3");
		p.Tgt_sno3.setLabel(p.Tgt_sno3_Label);
		p.Tgt_sno4_Label = p.beansFactory.createLabel("Tgt.sno4_Label");
		p.Tgt_sno4 = p.beansFactory.createTextField("Tgt.sno4");
		p.Tgt_sno4.setLabel(p.Tgt_sno4_Label);
		p.Tgt_bp_cd_Label = p.beansFactory.createLabel("Tgt.bp_cd_Label");
		p.Tgt_bp_cd = p.beansFactory.createTextField("Tgt.bp_cd");
		p.Tgt_bp_cd.setLabel(p.Tgt_bp_cd_Label);
		p.Tgt_bp_nm = p.beansFactory.createTextField("Tgt.bp_nm");
		p.Tgt_no_bp_flg = p.beansFactory.createCheckBox("Tgt.no_bp_flg");
		p.Tgt_cntry_cd_Label = p.beansFactory.createLabel("Tgt.cntry_cd_Label");
		p.Tgt_cntry_cd = p.beansFactory.createTextComboBox("Tgt.cntry_cd");
		p.Tgt_cntry_cd.setLabel(p.Tgt_cntry_cd_Label);
		p.Tgt_cntry_nm = p.beansFactory.createTextField("Tgt.cntry_nm");
		p.Tgt_area_cd_Label = p.beansFactory.createLabel("Tgt.area_cd_Label");
		p.Tgt_area_cd = p.beansFactory.createTextComboBox("Tgt.area_cd");
		p.Tgt_area_cd.setLabel(p.Tgt_area_cd_Label);
		p.Tgt_area_nm = p.beansFactory.createTextField("Tgt.area_nm");
		p.Tgt_asst_typ_Label = p.beansFactory.createLabel("Tgt.asst_typ_Label");
		p.Tgt_asst_typ = p.beansFactory.createTextComboBox("Tgt.asst_typ");
		p.Tgt_asst_typ.setLabel(p.Tgt_asst_typ_Label);
		p.Tgt_asst_typ_nm = p.beansFactory.createTextField("Tgt.asst_typ_nm");
		p.Tgt_itm_grp_cd1_Label = p.beansFactory.createLabel("Tgt.itm_grp_cd1_Label");
		p.Tgt_itm_grp_cd1 = p.beansFactory.createTextComboBox("Tgt.itm_grp_cd1");
		p.Tgt_itm_grp_cd1.setLabel(p.Tgt_itm_grp_cd1_Label);
		p.Tgt_itm_grp_nm1 = p.beansFactory.createTextField("Tgt.itm_grp_nm1");
		p.Tgt_itm_grp_cd2_Label = p.beansFactory.createLabel("Tgt.itm_grp_cd2_Label");
		p.Tgt_itm_grp_cd2 = p.beansFactory.createTextComboBox("Tgt.itm_grp_cd2");
		p.Tgt_itm_grp_cd2.setLabel(p.Tgt_itm_grp_cd2_Label);
		p.Tgt_itm_grp_nm2 = p.beansFactory.createTextField("Tgt.itm_grp_nm2");
		p.Tgt_itm_grp_cd3_Label = p.beansFactory.createLabel("Tgt.itm_grp_cd3_Label");
		p.Tgt_itm_grp_cd3 = p.beansFactory.createTextComboBox("Tgt.itm_grp_cd3");
		p.Tgt_itm_grp_cd3.setLabel(p.Tgt_itm_grp_cd3_Label);
		p.Tgt_itm_grp_nm3 = p.beansFactory.createTextField("Tgt.itm_grp_nm3");
		p.Tgt_itm_grp_cd4_Label = p.beansFactory.createLabel("Tgt.itm_grp_cd4_Label");
		p.Tgt_itm_grp_cd4 = p.beansFactory.createTextComboBox("Tgt.itm_grp_cd4");
		p.Tgt_itm_grp_cd4.setLabel(p.Tgt_itm_grp_cd4_Label);
		p.Tgt_itm_grp_nm4 = p.beansFactory.createTextField("Tgt.itm_grp_nm4");
		p.Tgt_itm_grp_cd5_Label = p.beansFactory.createLabel("Tgt.itm_grp_cd5_Label");
		p.Tgt_itm_grp_cd5 = p.beansFactory.createTextComboBox("Tgt.itm_grp_cd5");
		p.Tgt_itm_grp_cd5.setLabel(p.Tgt_itm_grp_cd5_Label);
		p.Tgt_itm_grp_nm5 = p.beansFactory.createTextField("Tgt.itm_grp_nm5");
		p.Tgt_itm_grp_cd6_Label = p.beansFactory.createLabel("Tgt.itm_grp_cd6_Label");
		p.Tgt_itm_grp_cd6 = p.beansFactory.createTextComboBox("Tgt.itm_grp_cd6");
		p.Tgt_itm_grp_cd6.setLabel(p.Tgt_itm_grp_cd6_Label);
		p.Tgt_itm_grp_nm6 = p.beansFactory.createTextField("Tgt.itm_grp_nm6");
		p.Tgt_itm_grp_cd7_Label = p.beansFactory.createLabel("Tgt.itm_grp_cd7_Label");
		p.Tgt_itm_grp_cd7 = p.beansFactory.createTextComboBox("Tgt.itm_grp_cd7");
		p.Tgt_itm_grp_cd7.setLabel(p.Tgt_itm_grp_cd7_Label);
		p.Tgt_itm_grp_nm7 = p.beansFactory.createTextField("Tgt.itm_grp_nm7");
		p.Tgt_itm_grp_cd8_Label = p.beansFactory.createLabel("Tgt.itm_grp_cd8_Label");
		p.Tgt_itm_grp_cd8 = p.beansFactory.createTextComboBox("Tgt.itm_grp_cd8");
		p.Tgt_itm_grp_cd8.setLabel(p.Tgt_itm_grp_cd8_Label);
		p.Tgt_itm_grp_nm8 = p.beansFactory.createTextField("Tgt.itm_grp_nm8");
		p.Tgt_itm_grp_cd9_Label = p.beansFactory.createLabel("Tgt.itm_grp_cd9_Label");
		p.Tgt_itm_grp_cd9 = p.beansFactory.createTextComboBox("Tgt.itm_grp_cd9");
		p.Tgt_itm_grp_cd9.setLabel(p.Tgt_itm_grp_cd9_Label);
		p.Tgt_itm_grp_nm9 = p.beansFactory.createTextField("Tgt.itm_grp_nm9");
		p.Tgt_itm_grp_cd10_Label = p.beansFactory.createLabel("Tgt.itm_grp_cd10_Label");
		p.Tgt_itm_grp_cd10 = p.beansFactory.createTextComboBox("Tgt.itm_grp_cd10");
		p.Tgt_itm_grp_cd10.setLabel(p.Tgt_itm_grp_cd10_Label);
		p.Tgt_itm_grp_nm10 = p.beansFactory.createTextField("Tgt.itm_grp_nm10");
		p.Tgt_bp_grp_cd1_Label = p.beansFactory.createLabel("Tgt.bp_grp_cd1_Label");
		p.Tgt_bp_grp_cd1 = p.beansFactory.createTextComboBox("Tgt.bp_grp_cd1");
		p.Tgt_bp_grp_cd1.setLabel(p.Tgt_bp_grp_cd1_Label);
		p.Tgt_bp_grp_nm1 = p.beansFactory.createTextField("Tgt.bp_grp_nm1");
		p.Tgt_bp_grp_cd2_Label = p.beansFactory.createLabel("Tgt.bp_grp_cd2_Label");
		p.Tgt_bp_grp_cd2 = p.beansFactory.createTextComboBox("Tgt.bp_grp_cd2");
		p.Tgt_bp_grp_cd2.setLabel(p.Tgt_bp_grp_cd2_Label);
		p.Tgt_bp_grp_nm2 = p.beansFactory.createTextField("Tgt.bp_grp_nm2");
		p.Tgt_bp_grp_cd3_Label = p.beansFactory.createLabel("Tgt.bp_grp_cd3_Label");
		p.Tgt_bp_grp_cd3 = p.beansFactory.createTextComboBox("Tgt.bp_grp_cd3");
		p.Tgt_bp_grp_cd3.setLabel(p.Tgt_bp_grp_cd3_Label);
		p.Tgt_bp_grp_nm3 = p.beansFactory.createTextField("Tgt.bp_grp_nm3");
		p.Tgt_bp_grp_cd4_Label = p.beansFactory.createLabel("Tgt.bp_grp_cd4_Label");
		p.Tgt_bp_grp_cd4 = p.beansFactory.createTextComboBox("Tgt.bp_grp_cd4");
		p.Tgt_bp_grp_cd4.setLabel(p.Tgt_bp_grp_cd4_Label);
		p.Tgt_bp_grp_nm4 = p.beansFactory.createTextField("Tgt.bp_grp_nm4");
		p.Tgt_bp_grp_cd5_Label = p.beansFactory.createLabel("Tgt.bp_grp_cd5_Label");
		p.Tgt_bp_grp_cd5 = p.beansFactory.createTextComboBox("Tgt.bp_grp_cd5");
		p.Tgt_bp_grp_cd5.setLabel(p.Tgt_bp_grp_cd5_Label);
		p.Tgt_bp_grp_nm5 = p.beansFactory.createTextField("Tgt.bp_grp_nm5");
		p.Tgt_bp_grp_cd6_Label = p.beansFactory.createLabel("Tgt.bp_grp_cd6_Label");
		p.Tgt_bp_grp_cd6 = p.beansFactory.createTextComboBox("Tgt.bp_grp_cd6");
		p.Tgt_bp_grp_cd6.setLabel(p.Tgt_bp_grp_cd6_Label);
		p.Tgt_bp_grp_nm6 = p.beansFactory.createTextField("Tgt.bp_grp_nm6");
		p.Tgt_bp_grp_cd7_Label = p.beansFactory.createLabel("Tgt.bp_grp_cd7_Label");
		p.Tgt_bp_grp_cd7 = p.beansFactory.createTextComboBox("Tgt.bp_grp_cd7");
		p.Tgt_bp_grp_cd7.setLabel(p.Tgt_bp_grp_cd7_Label);
		p.Tgt_bp_grp_nm7 = p.beansFactory.createTextField("Tgt.bp_grp_nm7");
		p.Tgt_bp_grp_cd8_Label = p.beansFactory.createLabel("Tgt.bp_grp_cd8_Label");
		p.Tgt_bp_grp_cd8 = p.beansFactory.createTextComboBox("Tgt.bp_grp_cd8");
		p.Tgt_bp_grp_cd8.setLabel(p.Tgt_bp_grp_cd8_Label);
		p.Tgt_bp_grp_nm8 = p.beansFactory.createTextField("Tgt.bp_grp_nm8");
		p.Tgt_bp_grp_cd9_Label = p.beansFactory.createLabel("Tgt.bp_grp_cd9_Label");
		p.Tgt_bp_grp_cd9 = p.beansFactory.createTextComboBox("Tgt.bp_grp_cd9");
		p.Tgt_bp_grp_cd9.setLabel(p.Tgt_bp_grp_cd9_Label);
		p.Tgt_bp_grp_nm9 = p.beansFactory.createTextField("Tgt.bp_grp_nm9");
		p.Tgt_bp_grp_cd10_Label = p.beansFactory.createLabel("Tgt.bp_grp_cd10_Label");
		p.Tgt_bp_grp_cd10 = p.beansFactory.createTextComboBox("Tgt.bp_grp_cd10");
		p.Tgt_bp_grp_cd10.setLabel(p.Tgt_bp_grp_cd10_Label);
		p.Tgt_bp_grp_nm10 = p.beansFactory.createTextField("Tgt.bp_grp_nm10");
	}

	/**
	 * [Itm]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitItm(MGBFP_CostReportPrnt p) {
		// ブロック関連の初期化
		p.ItmPanel = p.beansFactory.createPanel("Itm");
		// ブロックの項目の初期化
	}

	/**
	 * [Bp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBp(MGBFP_CostReportPrnt p) {
		// ブロック関連の初期化
		p.BpPanel = p.beansFactory.createPanel("Bp");
		// ブロックの項目の初期化
	}

	/**
	 * [Report]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitReport(MGBFP_CostReportPrnt p) {
		// ブロック関連の初期化
		p.ReportPanel = p.beansFactory.createPanel("Report");
		p.ReportScrollPane = p.beansFactory.createScrollPane("Report.scroll");
		p.createReportTable();
		// ブロックの項目の初期化
		p.columnReport_check = p.beansFactory.createTableColumn("Report.check", MCColumnType.CHECK);
		p.columnReport_report_id = p.beansFactory.createTableColumn("Report.report_id", MCColumnType.TEXT);
		p.columnReport_report_nm = p.beansFactory.createTableColumn("Report.report_nm", MCColumnType.TEXT);
		p.columnReport_memo1 = p.beansFactory.createTableColumn("Report.memo1", MCColumnType.TEXT);
		p.columnReport_memo2 = p.beansFactory.createTableColumn("Report.memo2", MCColumnType.TEXT);
		p.columnReport_memo3 = p.beansFactory.createTableColumn("Report.memo3", MCColumnType.TEXT);
		p.columnReport_ins_usr_id = p.beansFactory.createTableColumn("Report.ins_usr_id", MCColumnType.TEXT);
		p.columnReport_ins_usr_nm = p.beansFactory.createTableColumn("Report.ins_usr_nm", MCColumnType.TEXT);
		p.columnReport_ins_func_id = p.beansFactory.createTableColumn("Report.ins_func_id", MCColumnType.TEXT);
		p.columnReport_ins_func_nm = p.beansFactory.createTableColumn("Report.ins_func_nm", MCColumnType.TEXT);
		p.columnReport_ins_ts = p.beansFactory.createTableColumn("Report.ins_ts", MCColumnType.TIMESTAMP);
		p.columnReport_upd_usr_id = p.beansFactory.createTableColumn("Report.upd_usr_id", MCColumnType.TEXT);
		p.columnReport_upd_usr_nm = p.beansFactory.createTableColumn("Report.upd_usr_nm", MCColumnType.TEXT);
		p.columnReport_upd_func_id = p.beansFactory.createTableColumn("Report.upd_func_id", MCColumnType.TEXT);
		p.columnReport_upd_func_nm = p.beansFactory.createTableColumn("Report.upd_func_nm", MCColumnType.TEXT);
		p.columnReport_upd_ts = p.beansFactory.createTableColumn("Report.upd_ts", MCColumnType.TIMESTAMP);
		p.columnReport_upd_srv_req_no = p.beansFactory.createTableColumn("Report.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBFP_CostReportPrnt p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_prnt = p.beansFactory.createButton("Btn.prnt", "prnt");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MGBFP_CostReportPrnt p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.CenterPanel);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.CndPanel, null);
		p.TopPanel.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBFP_CostReportPrnt p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Cnd_calc_grp_cd.setListType(MCListType.FREE);
		p.Cnd_calc_grp_cd.setLinkBeans(p.Cnd_calc_grp_nm);
		p.CndPanel.add(p.Cnd_calc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_calc_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_grp_cd);
		p.Cnd_calc_grp_cd.setNextBeans(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_cd.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0320.CndR.calc_grp_cd_META);
		p.CndPanel.add(p.Cnd_calc_grp_nm);
		p.Cnd_calc_grp_nm.setNextBeans(p.Cnd_calc_no_p_PPanel);
		p.Cnd_calc_grp_nm.setRow(p.getCndR(), mcframe.clientMGBF.MGBFP0320.CndR.calc_grp_nm_META);
		p.CndPanel.add(p.Cnd_calc_no_p_PPanel);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setLinkBeans(p.Cnd_rmrks);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBFP_CostReportPrnt p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Center]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCenter(MGBFP_CostReportPrnt p) {
		// ブロック関連の初期化
		p.add(p.CenterPanel);
		p.CenterPanel.setNextBeans(p.BtnPanel);
		p.CenterPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.CenterPanel.add(p.TabPanel, null);
		p.CenterPanel.setLastBeans(p.TabPanel);
		p.TabPanel.setNextBeans(p.ReportPanel);
		p.CenterPanel.add(p.ReportPanel, null);
	}

	/**
	 * [Tab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab(MGBFP_CostReportPrnt p) {
		// ブロック関連の初期化
		p.TabPanel.add(p.TabTab);
		p.TabPanel.setLastBeans(p.TabTab);
		p.TabPanel.setValueCheck(false);
		p.TabPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TabPanel.setLayoutPosition("N+");
		// ブロックの項目の初期化
		p.TabTab.add(p.TgtPanel, "Tab.tab1");
		p.TabTab.setLastBeans(p.TgtPanel);
		p.TgtPanel.setNextBeans(p.ItmPanel);
		p.TabTab.add(p.ItmPanel, "Tab.tab2");
		p.ItmPanel.setNextBeans(p.BpPanel);
		p.TabTab.add(p.BpPanel, "Tab.tab3");
	}

	/**
	 * [Tgt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTgt(MGBFP_CostReportPrnt p) {
		// ブロック関連の初期化
		p.TgtPanel.setNextBeans(p.ItmPanel);
		p.TgtPanel.setValueCheck(false);
		p.TgtPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TgtPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.TgtPanel.add(p.Tgt_calc_grp_cd_Label);
		p.TgtPanel.add(p.Tgt_calc_grp_cd);
		p.TgtPanel.setLastBeans(p.Tgt_calc_grp_cd);
		p.Tgt_calc_grp_cd.setNextBeans(p.Tgt_calc_grp_nm);
		p.Tgt_calc_grp_cd.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.calc_grp_cd_META);
		p.TgtPanel.add(p.Tgt_calc_grp_nm);
		p.Tgt_calc_grp_nm.setNextBeans(p.Tgt_calc_no);
		p.Tgt_calc_grp_nm.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.calc_grp_nm_META);
		p.TgtPanel.add(p.Tgt_calc_no_Label);
		p.TgtPanel.add(p.Tgt_calc_no);
		p.Tgt_calc_no.setNextBeans(p.Tgt_rmrks);
		p.Tgt_calc_no.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.calc_no_META);
		p.TgtPanel.add(p.Tgt_rmrks);
		p.Tgt_rmrks.setNextBeans(p.Tgt_term);
		p.Tgt_rmrks.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.rmrks_META);
		p.TgtPanel.add(p.Tgt_term);
		p.Tgt_term.setNextBeans(p.Tgt_st_ym);
		p.Tgt_term.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.term_META);
		p.Tgt_term.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.TgtPanel.add(p.Tgt_st_ym);
		p.Tgt_st_ym.setNextBeans(p.Tgt_end_ym);
		p.Tgt_st_ym.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.st_ym_META);
		p.Tgt_st_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.TgtPanel.add(p.Tgt_end_ym);
		p.Tgt_end_ym.setNextBeans(p.Tgt_wg_cd);
		p.Tgt_end_ym.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.end_ym_META);
		p.Tgt_end_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Tgt_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_wg_cd, true);
		p.Tgt_wg_cd.setLinkBeans(p.Tgt_wg_nm);
		p.TgtPanel.add(p.Tgt_wg_cd_Label);
		p.TgtPanel.add(p.Tgt_wg_cd);
		p.Tgt_wg_cd.setNextBeans(p.Tgt_wg_nm);
		p.Tgt_wg_cd.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.wg_cd_META);
		p.TgtPanel.add(p.Tgt_wg_nm);
		p.Tgt_wg_nm.setNextBeans(p.Tgt_ym_fr);
		p.Tgt_wg_nm.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.wg_nm_META);
		p.setPluralValueEnable(p.Tgt_wg_nm, true);
		p.Tgt_ym_fr.setListType(MCListType.STRICT);
		p.TgtPanel.add(p.Tgt_ym_fr_Label);
		p.TgtPanel.add(p.Tgt_ym_fr);
		p.Tgt_ym_fr.setNextBeans(p.Tgt_ym_to);
		p.Tgt_ym_fr.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.ym_fr_META);
		p.Tgt_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Tgt_ym_to.setListType(MCListType.STRICT);
		p.TgtPanel.add(p.Tgt_ym_to_Label);
		p.TgtPanel.add(p.Tgt_ym_to);
		p.Tgt_ym_to.setNextBeans(p.Tgt_mng_dpt_cd);
		p.Tgt_ym_to.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.ym_to_META);
		p.Tgt_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Tgt_mng_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_mng_dpt_cd, true);
		p.Tgt_mng_dpt_cd.setLinkBeans(p.Tgt_mng_dpt_nm);
		p.TgtPanel.add(p.Tgt_mng_dpt_cd_Label);
		p.TgtPanel.add(p.Tgt_mng_dpt_cd);
		p.Tgt_mng_dpt_cd.setNextBeans(p.Tgt_mng_dpt_nm);
		p.Tgt_mng_dpt_cd.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.mng_dpt_cd_META);
		p.TgtPanel.add(p.Tgt_mng_dpt_nm);
		p.Tgt_mng_dpt_nm.setNextBeans(p.Tgt_itm_typ_p_PPanel);
		p.Tgt_mng_dpt_nm.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.mng_dpt_nm_META);
		p.setPluralValueEnable(p.Tgt_mng_dpt_nm, true);
		p.TgtPanel.add(p.Tgt_itm_typ_p_PPanel);
		p.Tgt_itm_typ_p_PPanel.setNextBeans(p.Tgt_itm_jnl_cd);
		p.Tgt_itm_jnl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_itm_jnl_cd, true);
		p.Tgt_itm_jnl_cd.setLinkBeans(p.Tgt_itm_jnl_nm);
		p.TgtPanel.add(p.Tgt_itm_jnl_cd_Label);
		p.TgtPanel.add(p.Tgt_itm_jnl_cd);
		p.Tgt_itm_jnl_cd.setNextBeans(p.Tgt_itm_jnl_nm);
		p.Tgt_itm_jnl_cd.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.itm_jnl_cd_META);
		p.TgtPanel.add(p.Tgt_itm_jnl_nm);
		p.Tgt_itm_jnl_nm.setNextBeans(p.Tgt_itm_p_PPanel);
		p.Tgt_itm_jnl_nm.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.itm_jnl_nm_META);
		p.setPluralValueEnable(p.Tgt_itm_jnl_nm, true);
		p.TgtPanel.add(p.Tgt_itm_p_PPanel);
		p.Tgt_itm_p_PPanel.setNextBeans(p.Tgt_lot_no);
		p.Tgt_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_itm_p_PPanel.Itm_itm_cd, true);
		p.Tgt_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Tgt_itm_nm,p.Tgt_itm_sub1,p.Tgt_itm_sub2,p.Tgt_itm_sub3);
		p.Tgt_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_itm_p_PPanel.Itm_itm_sub1, true);
		p.Tgt_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Tgt_itm_nm,p.Tgt_itm_sub2,p.Tgt_itm_sub3);
		p.Tgt_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_itm_p_PPanel.Itm_itm_sub2, true);
		p.Tgt_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Tgt_itm_nm,p.Tgt_itm_sub3);
		p.Tgt_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_itm_p_PPanel.Itm_itm_sub3, true);
		p.Tgt_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Tgt_itm_nm);
		p.setPluralValueEnable(p.Tgt_itm_p_PPanel.Itm_itm_nm, true);
		p.TgtPanel.add(p.Tgt_lot_no_Label);
		p.TgtPanel.add(p.Tgt_lot_no);
		p.Tgt_lot_no.setNextBeans(p.Tgt_sublot_no);
		p.Tgt_lot_no.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.lot_no_META);
		p.setPluralValueEnable(p.Tgt_lot_no, true);
		p.TgtPanel.add(p.Tgt_sublot_no);
		p.Tgt_sublot_no.setNextBeans(p.Tgt_sno1);
		p.Tgt_sublot_no.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.sublot_no_META);
		p.setPluralValueEnable(p.Tgt_sublot_no, true);
		p.TgtPanel.add(p.Tgt_sno1_Label);
		p.TgtPanel.add(p.Tgt_sno1);
		p.Tgt_sno1.setNextBeans(p.Tgt_sno2);
		p.Tgt_sno1.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.sno1_META);
		p.setPluralValueEnable(p.Tgt_sno1, true);
		p.TgtPanel.add(p.Tgt_sno2_Label);
		p.TgtPanel.add(p.Tgt_sno2);
		p.Tgt_sno2.setNextBeans(p.Tgt_sno3);
		p.Tgt_sno2.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.sno2_META);
		p.setPluralValueEnable(p.Tgt_sno2, true);
		p.TgtPanel.add(p.Tgt_sno3_Label);
		p.TgtPanel.add(p.Tgt_sno3);
		p.Tgt_sno3.setNextBeans(p.Tgt_sno4);
		p.Tgt_sno3.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.sno3_META);
		p.setPluralValueEnable(p.Tgt_sno3, true);
		p.TgtPanel.add(p.Tgt_sno4_Label);
		p.TgtPanel.add(p.Tgt_sno4);
		p.Tgt_sno4.setNextBeans(p.Tgt_bp_cd);
		p.Tgt_sno4.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.sno4_META);
		p.setPluralValueEnable(p.Tgt_sno4, true);
		p.TgtPanel.add(p.Tgt_bp_cd_Label);
		p.TgtPanel.add(p.Tgt_bp_cd);
		p.Tgt_bp_cd.setNextBeans(p.Tgt_bp_nm);
		p.Tgt_bp_cd.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.bp_cd_META);
		p.Tgt_bp_cd.addLinkBeans(p.Tgt_bp_nm);
		p.Tgt_bp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_bp_cd, true);
		p.TgtPanel.add(p.Tgt_bp_nm);
		p.Tgt_bp_nm.setNextBeans(p.Tgt_no_bp_flg);
		p.Tgt_bp_nm.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.bp_nm_META);
		p.setPluralValueEnable(p.Tgt_bp_nm, true);
		p.TgtPanel.add(p.Tgt_no_bp_flg);
		p.Tgt_no_bp_flg.setNextBeans(p.Tgt_cntry_cd);
		p.Tgt_no_bp_flg.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.no_bp_flg_META);
		p.Tgt_cntry_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_cntry_cd, true);
		p.Tgt_cntry_cd.setLinkBeans(p.Tgt_cntry_nm);
		p.TgtPanel.add(p.Tgt_cntry_cd_Label);
		p.TgtPanel.add(p.Tgt_cntry_cd);
		p.Tgt_cntry_cd.setNextBeans(p.Tgt_cntry_nm);
		p.Tgt_cntry_cd.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.cntry_cd_META);
		p.TgtPanel.add(p.Tgt_cntry_nm);
		p.Tgt_cntry_nm.setNextBeans(p.Tgt_area_cd);
		p.Tgt_cntry_nm.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.cntry_nm_META);
		p.setPluralValueEnable(p.Tgt_cntry_nm, true);
		p.Tgt_area_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_area_cd, true);
		p.Tgt_area_cd.setLinkBeans(p.Tgt_area_nm);
		p.TgtPanel.add(p.Tgt_area_cd_Label);
		p.TgtPanel.add(p.Tgt_area_cd);
		p.Tgt_area_cd.setNextBeans(p.Tgt_area_nm);
		p.Tgt_area_cd.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.area_cd_META);
		p.TgtPanel.add(p.Tgt_area_nm);
		p.Tgt_area_nm.setNextBeans(p.Tgt_asst_typ);
		p.Tgt_area_nm.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.area_nm_META);
		p.setPluralValueEnable(p.Tgt_area_nm, true);
		p.Tgt_asst_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_asst_typ, true);
		p.Tgt_asst_typ.setLinkBeans(p.Tgt_asst_typ_nm);
		p.TgtPanel.add(p.Tgt_asst_typ_Label);
		p.TgtPanel.add(p.Tgt_asst_typ);
		p.Tgt_asst_typ.setNextBeans(p.Tgt_asst_typ_nm);
		p.Tgt_asst_typ.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.asst_typ_META);
		p.TgtPanel.add(p.Tgt_asst_typ_nm);
		p.Tgt_asst_typ_nm.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.asst_typ_nm_META);
		p.Tgt_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_itm_grp_cd1, true);
		p.Tgt_itm_grp_cd1.setLinkBeans(p.Tgt_itm_grp_nm1);
		p.ItmPanel.add(p.Tgt_itm_grp_cd1_Label);
		p.ItmPanel.add(p.Tgt_itm_grp_cd1);
		p.ItmPanel.setLastBeans(p.Tgt_itm_grp_cd1);
		p.Tgt_itm_grp_cd1.setNextBeans(p.Tgt_itm_grp_nm1);
		p.Tgt_itm_grp_cd1.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.itm_grp_cd1_META);
		p.ItmPanel.add(p.Tgt_itm_grp_nm1);
		p.Tgt_itm_grp_nm1.setNextBeans(p.Tgt_itm_grp_cd2);
		p.Tgt_itm_grp_nm1.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.itm_grp_nm1_META);
		p.setPluralValueEnable(p.Tgt_itm_grp_nm1, true);
		p.Tgt_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_itm_grp_cd2, true);
		p.Tgt_itm_grp_cd2.setLinkBeans(p.Tgt_itm_grp_nm2);
		p.ItmPanel.add(p.Tgt_itm_grp_cd2_Label);
		p.ItmPanel.add(p.Tgt_itm_grp_cd2);
		p.Tgt_itm_grp_cd2.setNextBeans(p.Tgt_itm_grp_nm2);
		p.Tgt_itm_grp_cd2.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.itm_grp_cd2_META);
		p.ItmPanel.add(p.Tgt_itm_grp_nm2);
		p.Tgt_itm_grp_nm2.setNextBeans(p.Tgt_itm_grp_cd3);
		p.Tgt_itm_grp_nm2.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.itm_grp_nm2_META);
		p.setPluralValueEnable(p.Tgt_itm_grp_nm2, true);
		p.Tgt_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_itm_grp_cd3, true);
		p.Tgt_itm_grp_cd3.setLinkBeans(p.Tgt_itm_grp_nm3);
		p.ItmPanel.add(p.Tgt_itm_grp_cd3_Label);
		p.ItmPanel.add(p.Tgt_itm_grp_cd3);
		p.Tgt_itm_grp_cd3.setNextBeans(p.Tgt_itm_grp_nm3);
		p.Tgt_itm_grp_cd3.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.itm_grp_cd3_META);
		p.ItmPanel.add(p.Tgt_itm_grp_nm3);
		p.Tgt_itm_grp_nm3.setNextBeans(p.Tgt_itm_grp_cd4);
		p.Tgt_itm_grp_nm3.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.itm_grp_nm3_META);
		p.setPluralValueEnable(p.Tgt_itm_grp_nm3, true);
		p.Tgt_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_itm_grp_cd4, true);
		p.Tgt_itm_grp_cd4.setLinkBeans(p.Tgt_itm_grp_nm4);
		p.ItmPanel.add(p.Tgt_itm_grp_cd4_Label);
		p.ItmPanel.add(p.Tgt_itm_grp_cd4);
		p.Tgt_itm_grp_cd4.setNextBeans(p.Tgt_itm_grp_nm4);
		p.Tgt_itm_grp_cd4.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.itm_grp_cd4_META);
		p.ItmPanel.add(p.Tgt_itm_grp_nm4);
		p.Tgt_itm_grp_nm4.setNextBeans(p.Tgt_itm_grp_cd5);
		p.Tgt_itm_grp_nm4.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.itm_grp_nm4_META);
		p.setPluralValueEnable(p.Tgt_itm_grp_nm4, true);
		p.Tgt_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_itm_grp_cd5, true);
		p.Tgt_itm_grp_cd5.setLinkBeans(p.Tgt_itm_grp_nm5);
		p.ItmPanel.add(p.Tgt_itm_grp_cd5_Label);
		p.ItmPanel.add(p.Tgt_itm_grp_cd5);
		p.Tgt_itm_grp_cd5.setNextBeans(p.Tgt_itm_grp_nm5);
		p.Tgt_itm_grp_cd5.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.itm_grp_cd5_META);
		p.ItmPanel.add(p.Tgt_itm_grp_nm5);
		p.Tgt_itm_grp_nm5.setNextBeans(p.Tgt_itm_grp_cd6);
		p.Tgt_itm_grp_nm5.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.itm_grp_nm5_META);
		p.setPluralValueEnable(p.Tgt_itm_grp_nm5, true);
		p.Tgt_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_itm_grp_cd6, true);
		p.Tgt_itm_grp_cd6.setLinkBeans(p.Tgt_itm_grp_nm6);
		p.ItmPanel.add(p.Tgt_itm_grp_cd6_Label);
		p.ItmPanel.add(p.Tgt_itm_grp_cd6);
		p.Tgt_itm_grp_cd6.setNextBeans(p.Tgt_itm_grp_nm6);
		p.Tgt_itm_grp_cd6.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.itm_grp_cd6_META);
		p.ItmPanel.add(p.Tgt_itm_grp_nm6);
		p.Tgt_itm_grp_nm6.setNextBeans(p.Tgt_itm_grp_cd7);
		p.Tgt_itm_grp_nm6.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.itm_grp_nm6_META);
		p.setPluralValueEnable(p.Tgt_itm_grp_nm6, true);
		p.Tgt_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_itm_grp_cd7, true);
		p.Tgt_itm_grp_cd7.setLinkBeans(p.Tgt_itm_grp_nm7);
		p.ItmPanel.add(p.Tgt_itm_grp_cd7_Label);
		p.ItmPanel.add(p.Tgt_itm_grp_cd7);
		p.Tgt_itm_grp_cd7.setNextBeans(p.Tgt_itm_grp_nm7);
		p.Tgt_itm_grp_cd7.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.itm_grp_cd7_META);
		p.ItmPanel.add(p.Tgt_itm_grp_nm7);
		p.Tgt_itm_grp_nm7.setNextBeans(p.Tgt_itm_grp_cd8);
		p.Tgt_itm_grp_nm7.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.itm_grp_nm7_META);
		p.setPluralValueEnable(p.Tgt_itm_grp_nm7, true);
		p.Tgt_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_itm_grp_cd8, true);
		p.Tgt_itm_grp_cd8.setLinkBeans(p.Tgt_itm_grp_nm8);
		p.ItmPanel.add(p.Tgt_itm_grp_cd8_Label);
		p.ItmPanel.add(p.Tgt_itm_grp_cd8);
		p.Tgt_itm_grp_cd8.setNextBeans(p.Tgt_itm_grp_nm8);
		p.Tgt_itm_grp_cd8.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.itm_grp_cd8_META);
		p.ItmPanel.add(p.Tgt_itm_grp_nm8);
		p.Tgt_itm_grp_nm8.setNextBeans(p.Tgt_itm_grp_cd9);
		p.Tgt_itm_grp_nm8.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.itm_grp_nm8_META);
		p.setPluralValueEnable(p.Tgt_itm_grp_nm8, true);
		p.Tgt_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_itm_grp_cd9, true);
		p.Tgt_itm_grp_cd9.setLinkBeans(p.Tgt_itm_grp_nm9);
		p.ItmPanel.add(p.Tgt_itm_grp_cd9_Label);
		p.ItmPanel.add(p.Tgt_itm_grp_cd9);
		p.Tgt_itm_grp_cd9.setNextBeans(p.Tgt_itm_grp_nm9);
		p.Tgt_itm_grp_cd9.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.itm_grp_cd9_META);
		p.ItmPanel.add(p.Tgt_itm_grp_nm9);
		p.Tgt_itm_grp_nm9.setNextBeans(p.Tgt_itm_grp_cd10);
		p.Tgt_itm_grp_nm9.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.itm_grp_nm9_META);
		p.setPluralValueEnable(p.Tgt_itm_grp_nm9, true);
		p.Tgt_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_itm_grp_cd10, true);
		p.Tgt_itm_grp_cd10.setLinkBeans(p.Tgt_itm_grp_nm10);
		p.ItmPanel.add(p.Tgt_itm_grp_cd10_Label);
		p.ItmPanel.add(p.Tgt_itm_grp_cd10);
		p.Tgt_itm_grp_cd10.setNextBeans(p.Tgt_itm_grp_nm10);
		p.Tgt_itm_grp_cd10.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.itm_grp_cd10_META);
		p.ItmPanel.add(p.Tgt_itm_grp_nm10);
		p.Tgt_itm_grp_nm10.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.itm_grp_nm10_META);
		p.setPluralValueEnable(p.Tgt_itm_grp_nm10, true);
		p.Tgt_bp_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_bp_grp_cd1, true);
		p.Tgt_bp_grp_cd1.setLinkBeans(p.Tgt_bp_grp_nm1);
		p.BpPanel.add(p.Tgt_bp_grp_cd1_Label);
		p.BpPanel.add(p.Tgt_bp_grp_cd1);
		p.BpPanel.setLastBeans(p.Tgt_bp_grp_cd1);
		p.Tgt_bp_grp_cd1.setNextBeans(p.Tgt_bp_grp_nm1);
		p.Tgt_bp_grp_cd1.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.bp_grp_cd1_META);
		p.BpPanel.add(p.Tgt_bp_grp_nm1);
		p.Tgt_bp_grp_nm1.setNextBeans(p.Tgt_bp_grp_cd2);
		p.Tgt_bp_grp_nm1.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.bp_grp_nm1_META);
		p.setPluralValueEnable(p.Tgt_bp_grp_nm1, true);
		p.Tgt_bp_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_bp_grp_cd2, true);
		p.Tgt_bp_grp_cd2.setLinkBeans(p.Tgt_bp_grp_nm2);
		p.BpPanel.add(p.Tgt_bp_grp_cd2_Label);
		p.BpPanel.add(p.Tgt_bp_grp_cd2);
		p.Tgt_bp_grp_cd2.setNextBeans(p.Tgt_bp_grp_nm2);
		p.Tgt_bp_grp_cd2.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.bp_grp_cd2_META);
		p.BpPanel.add(p.Tgt_bp_grp_nm2);
		p.Tgt_bp_grp_nm2.setNextBeans(p.Tgt_bp_grp_cd3);
		p.Tgt_bp_grp_nm2.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.bp_grp_nm2_META);
		p.setPluralValueEnable(p.Tgt_bp_grp_nm2, true);
		p.Tgt_bp_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_bp_grp_cd3, true);
		p.Tgt_bp_grp_cd3.setLinkBeans(p.Tgt_bp_grp_nm3);
		p.BpPanel.add(p.Tgt_bp_grp_cd3_Label);
		p.BpPanel.add(p.Tgt_bp_grp_cd3);
		p.Tgt_bp_grp_cd3.setNextBeans(p.Tgt_bp_grp_nm3);
		p.Tgt_bp_grp_cd3.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.bp_grp_cd3_META);
		p.BpPanel.add(p.Tgt_bp_grp_nm3);
		p.Tgt_bp_grp_nm3.setNextBeans(p.Tgt_bp_grp_cd4);
		p.Tgt_bp_grp_nm3.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.bp_grp_nm3_META);
		p.setPluralValueEnable(p.Tgt_bp_grp_nm3, true);
		p.Tgt_bp_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_bp_grp_cd4, true);
		p.Tgt_bp_grp_cd4.setLinkBeans(p.Tgt_bp_grp_nm4);
		p.BpPanel.add(p.Tgt_bp_grp_cd4_Label);
		p.BpPanel.add(p.Tgt_bp_grp_cd4);
		p.Tgt_bp_grp_cd4.setNextBeans(p.Tgt_bp_grp_nm4);
		p.Tgt_bp_grp_cd4.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.bp_grp_cd4_META);
		p.BpPanel.add(p.Tgt_bp_grp_nm4);
		p.Tgt_bp_grp_nm4.setNextBeans(p.Tgt_bp_grp_cd5);
		p.Tgt_bp_grp_nm4.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.bp_grp_nm4_META);
		p.setPluralValueEnable(p.Tgt_bp_grp_nm4, true);
		p.Tgt_bp_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_bp_grp_cd5, true);
		p.Tgt_bp_grp_cd5.setLinkBeans(p.Tgt_bp_grp_nm5);
		p.BpPanel.add(p.Tgt_bp_grp_cd5_Label);
		p.BpPanel.add(p.Tgt_bp_grp_cd5);
		p.Tgt_bp_grp_cd5.setNextBeans(p.Tgt_bp_grp_nm5);
		p.Tgt_bp_grp_cd5.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.bp_grp_cd5_META);
		p.BpPanel.add(p.Tgt_bp_grp_nm5);
		p.Tgt_bp_grp_nm5.setNextBeans(p.Tgt_bp_grp_cd6);
		p.Tgt_bp_grp_nm5.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.bp_grp_nm5_META);
		p.setPluralValueEnable(p.Tgt_bp_grp_nm5, true);
		p.Tgt_bp_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_bp_grp_cd6, true);
		p.Tgt_bp_grp_cd6.setLinkBeans(p.Tgt_bp_grp_nm6);
		p.BpPanel.add(p.Tgt_bp_grp_cd6_Label);
		p.BpPanel.add(p.Tgt_bp_grp_cd6);
		p.Tgt_bp_grp_cd6.setNextBeans(p.Tgt_bp_grp_nm6);
		p.Tgt_bp_grp_cd6.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.bp_grp_cd6_META);
		p.BpPanel.add(p.Tgt_bp_grp_nm6);
		p.Tgt_bp_grp_nm6.setNextBeans(p.Tgt_bp_grp_cd7);
		p.Tgt_bp_grp_nm6.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.bp_grp_nm6_META);
		p.setPluralValueEnable(p.Tgt_bp_grp_nm6, true);
		p.Tgt_bp_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_bp_grp_cd7, true);
		p.Tgt_bp_grp_cd7.setLinkBeans(p.Tgt_bp_grp_nm7);
		p.BpPanel.add(p.Tgt_bp_grp_cd7_Label);
		p.BpPanel.add(p.Tgt_bp_grp_cd7);
		p.Tgt_bp_grp_cd7.setNextBeans(p.Tgt_bp_grp_nm7);
		p.Tgt_bp_grp_cd7.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.bp_grp_cd7_META);
		p.BpPanel.add(p.Tgt_bp_grp_nm7);
		p.Tgt_bp_grp_nm7.setNextBeans(p.Tgt_bp_grp_cd8);
		p.Tgt_bp_grp_nm7.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.bp_grp_nm7_META);
		p.setPluralValueEnable(p.Tgt_bp_grp_nm7, true);
		p.Tgt_bp_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_bp_grp_cd8, true);
		p.Tgt_bp_grp_cd8.setLinkBeans(p.Tgt_bp_grp_nm8);
		p.BpPanel.add(p.Tgt_bp_grp_cd8_Label);
		p.BpPanel.add(p.Tgt_bp_grp_cd8);
		p.Tgt_bp_grp_cd8.setNextBeans(p.Tgt_bp_grp_nm8);
		p.Tgt_bp_grp_cd8.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.bp_grp_cd8_META);
		p.BpPanel.add(p.Tgt_bp_grp_nm8);
		p.Tgt_bp_grp_nm8.setNextBeans(p.Tgt_bp_grp_cd9);
		p.Tgt_bp_grp_nm8.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.bp_grp_nm8_META);
		p.setPluralValueEnable(p.Tgt_bp_grp_nm8, true);
		p.Tgt_bp_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_bp_grp_cd9, true);
		p.Tgt_bp_grp_cd9.setLinkBeans(p.Tgt_bp_grp_nm9);
		p.BpPanel.add(p.Tgt_bp_grp_cd9_Label);
		p.BpPanel.add(p.Tgt_bp_grp_cd9);
		p.Tgt_bp_grp_cd9.setNextBeans(p.Tgt_bp_grp_nm9);
		p.Tgt_bp_grp_cd9.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.bp_grp_cd9_META);
		p.BpPanel.add(p.Tgt_bp_grp_nm9);
		p.Tgt_bp_grp_nm9.setNextBeans(p.Tgt_bp_grp_cd10);
		p.Tgt_bp_grp_nm9.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.bp_grp_nm9_META);
		p.setPluralValueEnable(p.Tgt_bp_grp_nm9, true);
		p.Tgt_bp_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Tgt_bp_grp_cd10, true);
		p.Tgt_bp_grp_cd10.setLinkBeans(p.Tgt_bp_grp_nm10);
		p.BpPanel.add(p.Tgt_bp_grp_cd10_Label);
		p.BpPanel.add(p.Tgt_bp_grp_cd10);
		p.Tgt_bp_grp_cd10.setNextBeans(p.Tgt_bp_grp_nm10);
		p.Tgt_bp_grp_cd10.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.bp_grp_cd10_META);
		p.BpPanel.add(p.Tgt_bp_grp_nm10);
		p.Tgt_bp_grp_nm10.setRow(p.getTgtR(), mcframe.clientMGBF.MGBFP0320.TgtR.bp_grp_nm10_META);
		p.setPluralValueEnable(p.Tgt_bp_grp_nm10, true);
	}

	/**
	 * [Itm]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitItm(MGBFP_CostReportPrnt p) {
		// ブロック関連の初期化
		p.ItmPanel.setNextBeans(p.BpPanel);
		p.ItmPanel.setValueCheck(false);
		p.ItmPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ItmPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Bp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBp(MGBFP_CostReportPrnt p) {
		// ブロック関連の初期化
		p.BpPanel.setValueCheck(false);
		p.BpPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BpPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Report]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitReport(MGBFP_CostReportPrnt p) {
		// ブロック関連の初期化
		p.ReportPanel.add(p.ReportScrollPane);
		p.ReportPanel.setLastBeans(p.ReportTable);
		p.ReportScrollPane.setViewportView(p.ReportTable);
		p.ReportTable.setList(p.getReportL());
		p.ReportTable.setStatusColumnVisible(false);
		p.ReportPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MGBFP_CostReportPrnt p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_prnt.setIcon("PRINT");
		p.Btn_prnt.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_prnt);
		p.BtnPanel.setLastBeans(p.Btn_prnt);
		p.Btn_prnt.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "G";
	}

	@Override
	public void layoutAfterOpen() {
		super.layoutAfterOpen();
		Ctrl_ctrl_PPanel.expandInit();
		Ctrl_ctrl_PPanel.setDefaultDividerLocation();
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MGBFP_CostReportPrnt_MC.mcInitTop((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.mcInitCnd((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.mcInitCtrl((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.mcInitCenter((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.mcInitTab((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.mcInitTgt((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.mcInitItm((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.mcInitBp((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.mcInitReport((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.mcInitBtn((MGBFP_CostReportPrnt)this);

		// [SRCH]ステータスのモードの設定
		MGBFP_CostReportPrnt_MC.statusInitSRCH_Top((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.statusInitSRCH_Cnd((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.statusInitSRCH_Ctrl((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.statusInitSRCH_Center((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.statusInitSRCH_Tab((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.statusInitSRCH_Tgt((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.statusInitSRCH_Itm((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.statusInitSRCH_Bp((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.statusInitSRCH_Report((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.statusInitSRCH_Btn((MGBFP_CostReportPrnt)this);

		// [PRNT]ステータスのモードの設定
		MGBFP_CostReportPrnt_MC.statusInitPRNT_Top((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.statusInitPRNT_Cnd((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.statusInitPRNT_Ctrl((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.statusInitPRNT_Center((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.statusInitPRNT_Tab((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.statusInitPRNT_Tgt((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.statusInitPRNT_Itm((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.statusInitPRNT_Bp((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.statusInitPRNT_Report((MGBFP_CostReportPrnt)this);
		MGBFP_CostReportPrnt_MC.statusInitPRNT_Btn((MGBFP_CostReportPrnt)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBFP_CostReportPrnt p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBFP_CostReportPrnt p) {
		p.Cnd_calc_grp_cd.setListListener(p);
		p.Cnd_calc_grp_cd.addAllListener(p);
		p.Cnd_calc_grp_nm.setListListener(p);
		p.Cnd_calc_grp_nm.addAllListener(p);
		p.Cnd_calc_no_p_PPanel.CalcNo_calc_no.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBFP_CostReportPrnt p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Center]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCenter(MGBFP_CostReportPrnt p) {
	}

	/**
	 *  [Tab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab(MGBFP_CostReportPrnt p) {
		p.TabTab.addAllListener(p);
	}

	/**
	 *  [Tgt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTgt(MGBFP_CostReportPrnt p) {
		p.Tgt_calc_grp_cd.setListListener(p);
		p.Tgt_calc_grp_cd.addAllListener(p);
		p.Tgt_calc_grp_nm.setListListener(p);
		p.Tgt_calc_grp_nm.addAllListener(p);
		p.Tgt_calc_no.setListListener(p);
		p.Tgt_calc_no.addAllListener(p);
		p.Tgt_rmrks.setListListener(p);
		p.Tgt_rmrks.addAllListener(p);
		p.Tgt_term.setListListener(p);
		p.Tgt_term.addAllListener(p);
		p.Tgt_st_ym.setListListener(p);
		p.Tgt_st_ym.addAllListener(p);
		p.Tgt_end_ym.setListListener(p);
		p.Tgt_end_ym.addAllListener(p);
		p.Tgt_wg_cd.setListListener(p);
		p.Tgt_wg_cd.addAllListener(p);
		p.Tgt_wg_nm.setListListener(p);
		p.Tgt_wg_nm.addAllListener(p);
		p.Tgt_ym_fr.setListListener(p);
		p.Tgt_ym_fr.addAllListener(p);
		p.Tgt_ym_to.setListListener(p);
		p.Tgt_ym_to.addAllListener(p);
		p.Tgt_mng_dpt_cd.setListListener(p);
		p.Tgt_mng_dpt_cd.addAllListener(p);
		p.Tgt_mng_dpt_nm.setListListener(p);
		p.Tgt_mng_dpt_nm.addAllListener(p);
		p.Tgt_itm_jnl_cd.setListListener(p);
		p.Tgt_itm_jnl_cd.addAllListener(p);
		p.Tgt_itm_jnl_nm.setListListener(p);
		p.Tgt_itm_jnl_nm.addAllListener(p);
		p.Tgt_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Tgt_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Tgt_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Tgt_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Tgt_lot_no.setListListener(p);
		p.Tgt_lot_no.addAllListener(p);
		p.Tgt_sublot_no.setListListener(p);
		p.Tgt_sublot_no.addAllListener(p);
		p.Tgt_sno1.setListListener(p);
		p.Tgt_sno1.addAllListener(p);
		p.Tgt_sno2.setListListener(p);
		p.Tgt_sno2.addAllListener(p);
		p.Tgt_sno3.setListListener(p);
		p.Tgt_sno3.addAllListener(p);
		p.Tgt_sno4.setListListener(p);
		p.Tgt_sno4.addAllListener(p);
		p.Tgt_bp_cd.setListListener(p);
		p.Tgt_bp_cd.addAllListener(p);
		p.Tgt_bp_nm.setListListener(p);
		p.Tgt_bp_nm.addAllListener(p);
		p.Tgt_no_bp_flg.addAllListener(p);
		p.Tgt_cntry_cd.setListListener(p);
		p.Tgt_cntry_cd.addAllListener(p);
		p.Tgt_cntry_nm.setListListener(p);
		p.Tgt_cntry_nm.addAllListener(p);
		p.Tgt_area_cd.setListListener(p);
		p.Tgt_area_cd.addAllListener(p);
		p.Tgt_area_nm.setListListener(p);
		p.Tgt_area_nm.addAllListener(p);
		p.Tgt_asst_typ.setListListener(p);
		p.Tgt_asst_typ.addAllListener(p);
		p.Tgt_asst_typ_nm.setListListener(p);
		p.Tgt_asst_typ_nm.addAllListener(p);
		p.Tgt_itm_grp_cd1.setListListener(p);
		p.Tgt_itm_grp_cd1.addAllListener(p);
		p.Tgt_itm_grp_nm1.setListListener(p);
		p.Tgt_itm_grp_nm1.addAllListener(p);
		p.Tgt_itm_grp_cd2.setListListener(p);
		p.Tgt_itm_grp_cd2.addAllListener(p);
		p.Tgt_itm_grp_nm2.setListListener(p);
		p.Tgt_itm_grp_nm2.addAllListener(p);
		p.Tgt_itm_grp_cd3.setListListener(p);
		p.Tgt_itm_grp_cd3.addAllListener(p);
		p.Tgt_itm_grp_nm3.setListListener(p);
		p.Tgt_itm_grp_nm3.addAllListener(p);
		p.Tgt_itm_grp_cd4.setListListener(p);
		p.Tgt_itm_grp_cd4.addAllListener(p);
		p.Tgt_itm_grp_nm4.setListListener(p);
		p.Tgt_itm_grp_nm4.addAllListener(p);
		p.Tgt_itm_grp_cd5.setListListener(p);
		p.Tgt_itm_grp_cd5.addAllListener(p);
		p.Tgt_itm_grp_nm5.setListListener(p);
		p.Tgt_itm_grp_nm5.addAllListener(p);
		p.Tgt_itm_grp_cd6.setListListener(p);
		p.Tgt_itm_grp_cd6.addAllListener(p);
		p.Tgt_itm_grp_nm6.setListListener(p);
		p.Tgt_itm_grp_nm6.addAllListener(p);
		p.Tgt_itm_grp_cd7.setListListener(p);
		p.Tgt_itm_grp_cd7.addAllListener(p);
		p.Tgt_itm_grp_nm7.setListListener(p);
		p.Tgt_itm_grp_nm7.addAllListener(p);
		p.Tgt_itm_grp_cd8.setListListener(p);
		p.Tgt_itm_grp_cd8.addAllListener(p);
		p.Tgt_itm_grp_nm8.setListListener(p);
		p.Tgt_itm_grp_nm8.addAllListener(p);
		p.Tgt_itm_grp_cd9.setListListener(p);
		p.Tgt_itm_grp_cd9.addAllListener(p);
		p.Tgt_itm_grp_nm9.setListListener(p);
		p.Tgt_itm_grp_nm9.addAllListener(p);
		p.Tgt_itm_grp_cd10.setListListener(p);
		p.Tgt_itm_grp_cd10.addAllListener(p);
		p.Tgt_itm_grp_nm10.setListListener(p);
		p.Tgt_itm_grp_nm10.addAllListener(p);
		p.Tgt_bp_grp_cd1.setListListener(p);
		p.Tgt_bp_grp_cd1.addAllListener(p);
		p.Tgt_bp_grp_nm1.setListListener(p);
		p.Tgt_bp_grp_nm1.addAllListener(p);
		p.Tgt_bp_grp_cd2.setListListener(p);
		p.Tgt_bp_grp_cd2.addAllListener(p);
		p.Tgt_bp_grp_nm2.setListListener(p);
		p.Tgt_bp_grp_nm2.addAllListener(p);
		p.Tgt_bp_grp_cd3.setListListener(p);
		p.Tgt_bp_grp_cd3.addAllListener(p);
		p.Tgt_bp_grp_nm3.setListListener(p);
		p.Tgt_bp_grp_nm3.addAllListener(p);
		p.Tgt_bp_grp_cd4.setListListener(p);
		p.Tgt_bp_grp_cd4.addAllListener(p);
		p.Tgt_bp_grp_nm4.setListListener(p);
		p.Tgt_bp_grp_nm4.addAllListener(p);
		p.Tgt_bp_grp_cd5.setListListener(p);
		p.Tgt_bp_grp_cd5.addAllListener(p);
		p.Tgt_bp_grp_nm5.setListListener(p);
		p.Tgt_bp_grp_nm5.addAllListener(p);
		p.Tgt_bp_grp_cd6.setListListener(p);
		p.Tgt_bp_grp_cd6.addAllListener(p);
		p.Tgt_bp_grp_nm6.setListListener(p);
		p.Tgt_bp_grp_nm6.addAllListener(p);
		p.Tgt_bp_grp_cd7.setListListener(p);
		p.Tgt_bp_grp_cd7.addAllListener(p);
		p.Tgt_bp_grp_nm7.setListListener(p);
		p.Tgt_bp_grp_nm7.addAllListener(p);
		p.Tgt_bp_grp_cd8.setListListener(p);
		p.Tgt_bp_grp_cd8.addAllListener(p);
		p.Tgt_bp_grp_nm8.setListListener(p);
		p.Tgt_bp_grp_nm8.addAllListener(p);
		p.Tgt_bp_grp_cd9.setListListener(p);
		p.Tgt_bp_grp_cd9.addAllListener(p);
		p.Tgt_bp_grp_nm9.setListListener(p);
		p.Tgt_bp_grp_nm9.addAllListener(p);
		p.Tgt_bp_grp_cd10.setListListener(p);
		p.Tgt_bp_grp_cd10.addAllListener(p);
		p.Tgt_bp_grp_nm10.setListListener(p);
		p.Tgt_bp_grp_nm10.addAllListener(p);
	}

	/**
	 *  [Itm]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitItm(MGBFP_CostReportPrnt p) {
	}

	/**
	 *  [Bp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBp(MGBFP_CostReportPrnt p) {
	}

	/**
	 *  [Report]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitReport(MGBFP_CostReportPrnt p) {
		p.ReportTable.addAllListener(p);
		p.columnReport_check.addAllListener(p);
		p.columnReport_report_id.addAllListener(p);
		p.columnReport_report_id.setListListener(p);
		p.columnReport_report_nm.addAllListener(p);
		p.columnReport_report_nm.setListListener(p);
		p.columnReport_memo1.addAllListener(p);
		p.columnReport_memo1.setListListener(p);
		p.columnReport_memo2.addAllListener(p);
		p.columnReport_memo2.setListListener(p);
		p.columnReport_memo3.addAllListener(p);
		p.columnReport_memo3.setListListener(p);
		p.columnReport_ins_usr_id.addAllListener(p);
		p.columnReport_ins_usr_id.setListListener(p);
		p.columnReport_ins_usr_nm.addAllListener(p);
		p.columnReport_ins_usr_nm.setListListener(p);
		p.columnReport_ins_func_id.addAllListener(p);
		p.columnReport_ins_func_id.setListListener(p);
		p.columnReport_ins_func_nm.addAllListener(p);
		p.columnReport_ins_func_nm.setListListener(p);
		p.columnReport_ins_ts.addAllListener(p);
		p.columnReport_ins_ts.setListListener(p);
		p.columnReport_upd_usr_id.addAllListener(p);
		p.columnReport_upd_usr_id.setListListener(p);
		p.columnReport_upd_usr_nm.addAllListener(p);
		p.columnReport_upd_usr_nm.setListListener(p);
		p.columnReport_upd_func_id.addAllListener(p);
		p.columnReport_upd_func_id.setListListener(p);
		p.columnReport_upd_func_nm.addAllListener(p);
		p.columnReport_upd_func_nm.setListListener(p);
		p.columnReport_upd_ts.addAllListener(p);
		p.columnReport_upd_ts.setListListener(p);
		p.columnReport_upd_srv_req_no.addAllListener(p);
		p.columnReport_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBFP_CostReportPrnt p) {
		p.Btn_prnt.addAllListener(p);
		p.Btn_prnt.setAPMethodName("doBtn_prnt");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MGBFP_CostReportPrnt p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBFP_CostReportPrnt p){
		p.Cnd_calc_grp_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(SRCH, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MGBFP_CostReportPrnt p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Center]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Center(MGBFP_CostReportPrnt p){

	}

	/**
	 * [SRCH]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab(MGBFP_CostReportPrnt p){

	}

	/**
	 * [SRCH]ステータスの[Tgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tgt(MGBFP_CostReportPrnt p){
		p.Tgt_calc_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_calc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_calc_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_term.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Tgt_st_ym.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Tgt_end_ym.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Tgt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_ym_fr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_ym_to.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_mng_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_mng_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Tgt_itm_jnl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_itm_jnl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Tgt_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_sno1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_sno2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_sno3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_sno4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_no_bp_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_cntry_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_cntry_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_area_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_area_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_asst_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_asst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_itm_grp_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_itm_grp_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_itm_grp_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_itm_grp_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_itm_grp_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_itm_grp_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_itm_grp_cd4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_itm_grp_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_itm_grp_cd5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_itm_grp_nm5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_itm_grp_cd6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_itm_grp_nm6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_itm_grp_cd7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_itm_grp_nm7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_itm_grp_cd8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_itm_grp_nm8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_itm_grp_cd9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_itm_grp_nm9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_itm_grp_cd10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_itm_grp_nm10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_bp_grp_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_bp_grp_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_bp_grp_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_bp_grp_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_bp_grp_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_bp_grp_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_bp_grp_cd4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_bp_grp_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_bp_grp_cd5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_bp_grp_nm5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_bp_grp_cd6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_bp_grp_nm6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_bp_grp_cd7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_bp_grp_nm7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_bp_grp_cd8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_bp_grp_nm8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_bp_grp_cd9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_bp_grp_nm9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_bp_grp_cd10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Tgt_bp_grp_nm10.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Itm]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Itm(MGBFP_CostReportPrnt p){

	}

	/**
	 * [SRCH]ステータスの[Bp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Bp(MGBFP_CostReportPrnt p){

	}

	/**
	 * [SRCH]ステータスの[Report]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Report(MGBFP_CostReportPrnt p){
		p.columnReport_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReport_report_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReport_report_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReport_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReport_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReport_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReport_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReport_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReport_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReport_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReport_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReport_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReport_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReport_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReport_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReport_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReport_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MGBFP_CostReportPrnt p){
		p.Btn_prnt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Top(MGBFP_CostReportPrnt p){

	}

	/**
	 * [PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd(MGBFP_CostReportPrnt p){
		p.Cnd_calc_grp_cd.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_calc_grp_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_calc_no_p_PPanel.putStatus(PRNT, mcframe.clientMGUB.MGUBP0010.MGUBP_CalcNo_H.REQUIRED);

	}

	/**
	 * [PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Ctrl(MGBFP_CostReportPrnt p){
		p.Ctrl_ctrl_PPanel.putStatus(PRNT, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[Center]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Center(MGBFP_CostReportPrnt p){

	}

	/**
	 * [PRNT]ステータスの[Tab]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab(MGBFP_CostReportPrnt p){

	}

	/**
	 * [PRNT]ステータスの[Tgt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tgt(MGBFP_CostReportPrnt p){
		p.Tgt_calc_grp_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Tgt_calc_grp_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Tgt_calc_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Tgt_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Tgt_term.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Tgt_st_ym.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Tgt_end_ym.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Tgt_wg_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_wg_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_ym_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_ym_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_mng_dpt_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_mng_dpt_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_itm_typ_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Tgt_itm_jnl_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_itm_jnl_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_itm_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Tgt_lot_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_sublot_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_sno1.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_sno2.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_sno3.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_sno4.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_bp_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_bp_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_no_bp_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Tgt_cntry_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_cntry_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_area_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_area_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_asst_typ.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_asst_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Tgt_itm_grp_cd1.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_itm_grp_nm1.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_itm_grp_cd2.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_itm_grp_nm2.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_itm_grp_cd3.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_itm_grp_nm3.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_itm_grp_cd4.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_itm_grp_nm4.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_itm_grp_cd5.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_itm_grp_nm5.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_itm_grp_cd6.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_itm_grp_nm6.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_itm_grp_cd7.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_itm_grp_nm7.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_itm_grp_cd8.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_itm_grp_nm8.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_itm_grp_cd9.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_itm_grp_nm9.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_itm_grp_cd10.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_itm_grp_nm10.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_bp_grp_cd1.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_bp_grp_nm1.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_bp_grp_cd2.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_bp_grp_nm2.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_bp_grp_cd3.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_bp_grp_nm3.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_bp_grp_cd4.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_bp_grp_nm4.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_bp_grp_cd5.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_bp_grp_nm5.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_bp_grp_cd6.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_bp_grp_nm6.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_bp_grp_cd7.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_bp_grp_nm7.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_bp_grp_cd8.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_bp_grp_nm8.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_bp_grp_cd9.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_bp_grp_nm9.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_bp_grp_cd10.putMode(p, PRNT, MCMode.ENABLE);
		p.Tgt_bp_grp_nm10.putMode(p, PRNT, MCMode.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[Itm]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Itm(MGBFP_CostReportPrnt p){

	}

	/**
	 * [PRNT]ステータスの[Bp]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Bp(MGBFP_CostReportPrnt p){

	}

	/**
	 * [PRNT]ステータスの[Report]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Report(MGBFP_CostReportPrnt p){
		p.columnReport_check.putMode(p, PRNT, MCMode.REQUIRED);
		p.columnReport_report_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnReport_report_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnReport_memo1.putMode(p, PRNT, MCMode.ENABLE);
		p.columnReport_memo2.putMode(p, PRNT, MCMode.ENABLE);
		p.columnReport_memo3.putMode(p, PRNT, MCMode.ENABLE);
		p.columnReport_ins_usr_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnReport_ins_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnReport_ins_func_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnReport_ins_func_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnReport_ins_ts.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnReport_upd_usr_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnReport_upd_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnReport_upd_func_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnReport_upd_func_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnReport_upd_ts.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnReport_upd_srv_req_no.putMode(p, PRNT, MCMode.READ_ONLY);

	}

	/**
	 * [PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Btn(MGBFP_CostReportPrnt p){
		p.Btn_prnt.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT, MCMode.ENABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MGBFP_CostReportPrnt_MC.setTableConfigReport((MGBFP_CostReportPrnt)this);
	}

	/**
	 * [Report]ブロックのTableの設定
	 */
	protected static void setTableConfigReport(MGBFP_CostReportPrnt p) {
		p.columnReport_check.setMeta(mcframe.clientMGBF.MGBFP0320.ReportR.check_META);
		p.ReportTable.addColumnConfig(p.columnReport_check);
		p.columnReport_report_id.setMeta(mcframe.clientMGBF.MGBFP0320.ReportR.report_id_META);
		p.ReportTable.addColumnConfig(p.columnReport_report_id);
		p.columnReport_report_nm.setMeta(mcframe.clientMGBF.MGBFP0320.ReportR.report_nm_META);
		p.ReportTable.addColumnConfig(p.columnReport_report_nm);
		p.columnReport_memo1.setMeta(mcframe.clientMGBF.MGBFP0320.ReportR.memo1_META);
		p.ReportTable.addColumnConfig(p.columnReport_memo1);
		p.columnReport_memo2.setMeta(mcframe.clientMGBF.MGBFP0320.ReportR.memo2_META);
		p.ReportTable.addColumnConfig(p.columnReport_memo2);
		p.columnReport_memo3.setMeta(mcframe.clientMGBF.MGBFP0320.ReportR.memo3_META);
		p.ReportTable.addColumnConfig(p.columnReport_memo3);
		p.columnReport_ins_usr_id.setMeta(mcframe.clientMGBF.MGBFP0320.ReportR.ins_usr_id_META);
		p.ReportTable.addColumnConfig(p.columnReport_ins_usr_id);
		p.columnReport_ins_usr_nm.setMeta(mcframe.clientMGBF.MGBFP0320.ReportR.ins_usr_nm_META);
		p.ReportTable.addColumnConfig(p.columnReport_ins_usr_nm);
		p.columnReport_ins_func_id.setMeta(mcframe.clientMGBF.MGBFP0320.ReportR.ins_func_id_META);
		p.ReportTable.addColumnConfig(p.columnReport_ins_func_id);
		p.columnReport_ins_func_nm.setMeta(mcframe.clientMGBF.MGBFP0320.ReportR.ins_func_nm_META);
		p.ReportTable.addColumnConfig(p.columnReport_ins_func_nm);
		p.columnReport_ins_ts.setMeta(mcframe.clientMGBF.MGBFP0320.ReportR.ins_ts_META);
		p.columnReport_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ReportTable.addColumnConfig(p.columnReport_ins_ts);
		p.columnReport_upd_usr_id.setMeta(mcframe.clientMGBF.MGBFP0320.ReportR.upd_usr_id_META);
		p.ReportTable.addColumnConfig(p.columnReport_upd_usr_id);
		p.columnReport_upd_usr_nm.setMeta(mcframe.clientMGBF.MGBFP0320.ReportR.upd_usr_nm_META);
		p.ReportTable.addColumnConfig(p.columnReport_upd_usr_nm);
		p.columnReport_upd_func_id.setMeta(mcframe.clientMGBF.MGBFP0320.ReportR.upd_func_id_META);
		p.ReportTable.addColumnConfig(p.columnReport_upd_func_id);
		p.columnReport_upd_func_nm.setMeta(mcframe.clientMGBF.MGBFP0320.ReportR.upd_func_nm_META);
		p.ReportTable.addColumnConfig(p.columnReport_upd_func_nm);
		p.columnReport_upd_ts.setMeta(mcframe.clientMGBF.MGBFP0320.ReportR.upd_ts_META);
		p.columnReport_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ReportTable.addColumnConfig(p.columnReport_upd_ts);
		p.columnReport_upd_srv_req_no.setMeta(mcframe.clientMGBF.MGBFP0320.ReportR.upd_srv_req_no_META);
		p.ReportTable.addColumnConfig(p.columnReport_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.ReportTable.setUnscrollColumn(p.columnReport_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_calc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_grp_cd.getListConfig().setPutter(getCnd_calc_grp_cd_ListPutter());
		Cnd_calc_no_p_PPanel.CalcNo_calc_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_no_p_PPanel.CalcNo_calc_no.getListConfig().setPutter(getCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter());
		Tgt_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_wg_cd.getListConfig().setPutter(getTgt_wg_cd_ListPutter());
		Tgt_ym_fr.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_ym_fr.getListConfig().setPutter(getTgt_ym_fr_ListPutter());
		Tgt_ym_to.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_ym_to.getListConfig().setPutter(getTgt_ym_to_ListPutter());
		Tgt_mng_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_mng_dpt_cd.getListConfig().setPutter(getTgt_mng_dpt_cd_ListPutter());
		Tgt_itm_jnl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_itm_jnl_cd.getListConfig().setPutter(getTgt_itm_jnl_cd_ListPutter());
		Tgt_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getTgt_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Tgt_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getTgt_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Tgt_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getTgt_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Tgt_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getTgt_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Tgt_bp_cd.getListConfig().setPutter(getTgt_bp_cd_ListPutter());
		Tgt_cntry_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_cntry_cd.getListConfig().setPutter(getTgt_cntry_cd_ListPutter());
		Tgt_area_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_area_cd.getListConfig().setPutter(getTgt_area_cd_ListPutter());
		Tgt_asst_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_asst_typ.getListConfig().setPutter(getTgt_asst_typ_ListPutter());
		Tgt_itm_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_itm_grp_cd1.getListConfig().setPutter(getTgt_itm_grp_cd1_ListPutter());
		Tgt_itm_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_itm_grp_cd2.getListConfig().setPutter(getTgt_itm_grp_cd2_ListPutter());
		Tgt_itm_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_itm_grp_cd3.getListConfig().setPutter(getTgt_itm_grp_cd3_ListPutter());
		Tgt_itm_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_itm_grp_cd4.getListConfig().setPutter(getTgt_itm_grp_cd4_ListPutter());
		Tgt_itm_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_itm_grp_cd5.getListConfig().setPutter(getTgt_itm_grp_cd5_ListPutter());
		Tgt_itm_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_itm_grp_cd6.getListConfig().setPutter(getTgt_itm_grp_cd6_ListPutter());
		Tgt_itm_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_itm_grp_cd7.getListConfig().setPutter(getTgt_itm_grp_cd7_ListPutter());
		Tgt_itm_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_itm_grp_cd8.getListConfig().setPutter(getTgt_itm_grp_cd8_ListPutter());
		Tgt_itm_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_itm_grp_cd9.getListConfig().setPutter(getTgt_itm_grp_cd9_ListPutter());
		Tgt_itm_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_itm_grp_cd10.getListConfig().setPutter(getTgt_itm_grp_cd10_ListPutter());
		Tgt_bp_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_bp_grp_cd1.getListConfig().setPutter(getTgt_bp_grp_cd1_ListPutter());
		Tgt_bp_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_bp_grp_cd2.getListConfig().setPutter(getTgt_bp_grp_cd2_ListPutter());
		Tgt_bp_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_bp_grp_cd3.getListConfig().setPutter(getTgt_bp_grp_cd3_ListPutter());
		Tgt_bp_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_bp_grp_cd4.getListConfig().setPutter(getTgt_bp_grp_cd4_ListPutter());
		Tgt_bp_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_bp_grp_cd5.getListConfig().setPutter(getTgt_bp_grp_cd5_ListPutter());
		Tgt_bp_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_bp_grp_cd6.getListConfig().setPutter(getTgt_bp_grp_cd6_ListPutter());
		Tgt_bp_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_bp_grp_cd7.getListConfig().setPutter(getTgt_bp_grp_cd7_ListPutter());
		Tgt_bp_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_bp_grp_cd8.getListConfig().setPutter(getTgt_bp_grp_cd8_ListPutter());
		Tgt_bp_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_bp_grp_cd9.getListConfig().setPutter(getTgt_bp_grp_cd9_ListPutter());
		Tgt_bp_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Tgt_bp_grp_cd10.getListConfig().setPutter(getTgt_bp_grp_cd10_ListPutter());
	}

	/**
	 * この画面を[SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCHStatus() {
		status = SRCH;
		setAllStatus(status);
	}

	/**
	 * この画面を[PRNT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setPRNTStatus() {
		status = PRNT;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (PRNT.equals(status)) {
			setPRNTStatus();
		}
	}

	/**
	 * [Cnd_calc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_no_p_PPanel_CalcNo_calc_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.CalcNo");
		return lp;
	}

	/**
	 * [Tgt_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createTgt_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
		return lp;
	}
	 
	/**
	 * [Tgt_ym_fr_ListPutter]の作成
	 */
	protected MCListPutter createTgt_ym_fr_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.Ym");
		return lp;
	}
	 
	/**
	 * [Tgt_ym_to_ListPutter]の作成
	 */
	protected MCListPutter createTgt_ym_to_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.Ym");
		return lp;
	}
	 
	/**
	 * [Tgt_mng_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createTgt_mng_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostDpt");
		return lp;
	}
	 
	/**
	 * [Tgt_itm_jnl_cd_ListPutter]の作成
	 */
	protected MCListPutter createTgt_itm_jnl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmJnl");
		return lp;
	}
	 
	/**
	 * [Tgt_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createTgt_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Tgt_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createTgt_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Tgt_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createTgt_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Tgt_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createTgt_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Tgt_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createTgt_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Tgt_cntry_cd_ListPutter]の作成
	 */
	protected MCListPutter createTgt_cntry_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cntry");
		return lp;
	}
	 
	/**
	 * [Tgt_area_cd_ListPutter]の作成
	 */
	protected MCListPutter createTgt_area_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Area");
		return lp;
	}
	 
	/**
	 * [Tgt_asst_typ_ListPutter]の作成
	 */
	protected MCListPutter createTgt_asst_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AsstTyp");
		return lp;
	}
	 
	/**
	 * [Tgt_itm_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createTgt_itm_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp1");
		return lp;
	}
	 
	/**
	 * [Tgt_itm_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createTgt_itm_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp2");
		return lp;
	}
	 
	/**
	 * [Tgt_itm_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createTgt_itm_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp3");
		return lp;
	}
	 
	/**
	 * [Tgt_itm_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createTgt_itm_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp4");
		return lp;
	}
	 
	/**
	 * [Tgt_itm_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createTgt_itm_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp5");
		return lp;
	}
	 
	/**
	 * [Tgt_itm_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createTgt_itm_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp6");
		return lp;
	}
	 
	/**
	 * [Tgt_itm_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createTgt_itm_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp7");
		return lp;
	}
	 
	/**
	 * [Tgt_itm_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createTgt_itm_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp8");
		return lp;
	}
	 
	/**
	 * [Tgt_itm_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createTgt_itm_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp9");
		return lp;
	}
	 
	/**
	 * [Tgt_itm_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createTgt_itm_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp10");
		return lp;
	}
	 
	/**
	 * [Tgt_bp_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createTgt_bp_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp1");
		return lp;
	}
	 
	/**
	 * [Tgt_bp_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createTgt_bp_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp2");
		return lp;
	}
	 
	/**
	 * [Tgt_bp_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createTgt_bp_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp3");
		return lp;
	}
	 
	/**
	 * [Tgt_bp_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createTgt_bp_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp4");
		return lp;
	}
	 
	/**
	 * [Tgt_bp_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createTgt_bp_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp5");
		return lp;
	}
	 
	/**
	 * [Tgt_bp_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createTgt_bp_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp6");
		return lp;
	}
	 
	/**
	 * [Tgt_bp_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createTgt_bp_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp7");
		return lp;
	}
	 
	/**
	 * [Tgt_bp_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createTgt_bp_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp8");
		return lp;
	}
	 
	/**
	 * [Tgt_bp_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createTgt_bp_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp9");
		return lp;
	}
	 
	/**
	 * [Tgt_bp_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createTgt_bp_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp10");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_calc_grp_cd) return getCnd_calc_grp_cd(row, info);
		if(combo == Cnd_calc_no_p_PPanel.CalcNo_calc_no) return getCnd_calc_no_p_PPanel_CalcNo_calc_no(row, info);
		if(combo == Tgt_wg_cd) return getTgt_wg_cd(row, info);
		if(combo == Tgt_ym_fr) return getTgt_ym_fr(row, info);
		if(combo == Tgt_ym_to) return getTgt_ym_to(row, info);
		if(combo == Tgt_mng_dpt_cd) return getTgt_mng_dpt_cd(row, info);
		if(combo == Tgt_itm_jnl_cd) return getTgt_itm_jnl_cd(row, info);
		if(combo == Tgt_itm_p_PPanel.Itm_itm_cd) return getTgt_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Tgt_itm_p_PPanel.Itm_itm_sub1) return getTgt_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Tgt_itm_p_PPanel.Itm_itm_sub2) return getTgt_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Tgt_itm_p_PPanel.Itm_itm_sub3) return getTgt_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Tgt_bp_cd) return getTgt_bp_cd(row, info);
		if(combo == Tgt_cntry_cd) return getTgt_cntry_cd(row, info);
		if(combo == Tgt_area_cd) return getTgt_area_cd(row, info);
		if(combo == Tgt_asst_typ) return getTgt_asst_typ(row, info);
		if(combo == Tgt_itm_grp_cd1) return getTgt_itm_grp_cd1(row, info);
		if(combo == Tgt_itm_grp_cd2) return getTgt_itm_grp_cd2(row, info);
		if(combo == Tgt_itm_grp_cd3) return getTgt_itm_grp_cd3(row, info);
		if(combo == Tgt_itm_grp_cd4) return getTgt_itm_grp_cd4(row, info);
		if(combo == Tgt_itm_grp_cd5) return getTgt_itm_grp_cd5(row, info);
		if(combo == Tgt_itm_grp_cd6) return getTgt_itm_grp_cd6(row, info);
		if(combo == Tgt_itm_grp_cd7) return getTgt_itm_grp_cd7(row, info);
		if(combo == Tgt_itm_grp_cd8) return getTgt_itm_grp_cd8(row, info);
		if(combo == Tgt_itm_grp_cd9) return getTgt_itm_grp_cd9(row, info);
		if(combo == Tgt_itm_grp_cd10) return getTgt_itm_grp_cd10(row, info);
		if(combo == Tgt_bp_grp_cd1) return getTgt_bp_grp_cd1(row, info);
		if(combo == Tgt_bp_grp_cd2) return getTgt_bp_grp_cd2(row, info);
		if(combo == Tgt_bp_grp_cd3) return getTgt_bp_grp_cd3(row, info);
		if(combo == Tgt_bp_grp_cd4) return getTgt_bp_grp_cd4(row, info);
		if(combo == Tgt_bp_grp_cd5) return getTgt_bp_grp_cd5(row, info);
		if(combo == Tgt_bp_grp_cd6) return getTgt_bp_grp_cd6(row, info);
		if(combo == Tgt_bp_grp_cd7) return getTgt_bp_grp_cd7(row, info);
		if(combo == Tgt_bp_grp_cd8) return getTgt_bp_grp_cd8(row, info);
		if(combo == Tgt_bp_grp_cd9) return getTgt_bp_grp_cd9(row, info);
		if(combo == Tgt_bp_grp_cd10) return getTgt_bp_grp_cd10(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
		else if (ap == Btn_prnt) doBtn_prnt(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

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
		if (vc == TabTab) return doTab_VC(info);
		if (vc == ReportTable) return doReport_VC(info);
		if (vc == Cnd_calc_grp_cd) return doCnd_calc_grp_cd_VC(info);
		if (vc == Cnd_calc_grp_nm) return doCnd_calc_grp_nm_VC(info);
		if (vc == Tgt_calc_grp_cd) return doTgt_calc_grp_cd_VC(info);
		if (vc == Tgt_calc_grp_nm) return doTgt_calc_grp_nm_VC(info);
		if (vc == Tgt_calc_no) return doTgt_calc_no_VC(info);
		if (vc == Tgt_rmrks) return doTgt_rmrks_VC(info);
		if (vc == Tgt_term) return doTgt_term_VC(info);
		if (vc == Tgt_st_ym) return doTgt_st_ym_VC(info);
		if (vc == Tgt_end_ym) return doTgt_end_ym_VC(info);
		if (vc == Tgt_wg_cd) return doTgt_wg_cd_VC(info);
		if (vc == Tgt_wg_nm) return doTgt_wg_nm_VC(info);
		if (vc == Tgt_ym_fr) return doTgt_ym_fr_VC(info);
		if (vc == Tgt_ym_to) return doTgt_ym_to_VC(info);
		if (vc == Tgt_mng_dpt_cd) return doTgt_mng_dpt_cd_VC(info);
		if (vc == Tgt_mng_dpt_nm) return doTgt_mng_dpt_nm_VC(info);
		if (vc == Tgt_itm_jnl_cd) return doTgt_itm_jnl_cd_VC(info);
		if (vc == Tgt_itm_jnl_nm) return doTgt_itm_jnl_nm_VC(info);
		if (vc == Tgt_lot_no) return doTgt_lot_no_VC(info);
		if (vc == Tgt_sublot_no) return doTgt_sublot_no_VC(info);
		if (vc == Tgt_sno1) return doTgt_sno1_VC(info);
		if (vc == Tgt_sno2) return doTgt_sno2_VC(info);
		if (vc == Tgt_sno3) return doTgt_sno3_VC(info);
		if (vc == Tgt_sno4) return doTgt_sno4_VC(info);
		if (vc == Tgt_bp_cd) return doTgt_bp_cd_VC(info);
		if (vc == Tgt_bp_nm) return doTgt_bp_nm_VC(info);
		if (vc == Tgt_no_bp_flg) return doTgt_no_bp_flg_VC(info);
		if (vc == Tgt_cntry_cd) return doTgt_cntry_cd_VC(info);
		if (vc == Tgt_cntry_nm) return doTgt_cntry_nm_VC(info);
		if (vc == Tgt_area_cd) return doTgt_area_cd_VC(info);
		if (vc == Tgt_area_nm) return doTgt_area_nm_VC(info);
		if (vc == Tgt_asst_typ) return doTgt_asst_typ_VC(info);
		if (vc == Tgt_asst_typ_nm) return doTgt_asst_typ_nm_VC(info);
		if (vc == Tgt_itm_grp_cd1) return doTgt_itm_grp_cd1_VC(info);
		if (vc == Tgt_itm_grp_nm1) return doTgt_itm_grp_nm1_VC(info);
		if (vc == Tgt_itm_grp_cd2) return doTgt_itm_grp_cd2_VC(info);
		if (vc == Tgt_itm_grp_nm2) return doTgt_itm_grp_nm2_VC(info);
		if (vc == Tgt_itm_grp_cd3) return doTgt_itm_grp_cd3_VC(info);
		if (vc == Tgt_itm_grp_nm3) return doTgt_itm_grp_nm3_VC(info);
		if (vc == Tgt_itm_grp_cd4) return doTgt_itm_grp_cd4_VC(info);
		if (vc == Tgt_itm_grp_nm4) return doTgt_itm_grp_nm4_VC(info);
		if (vc == Tgt_itm_grp_cd5) return doTgt_itm_grp_cd5_VC(info);
		if (vc == Tgt_itm_grp_nm5) return doTgt_itm_grp_nm5_VC(info);
		if (vc == Tgt_itm_grp_cd6) return doTgt_itm_grp_cd6_VC(info);
		if (vc == Tgt_itm_grp_nm6) return doTgt_itm_grp_nm6_VC(info);
		if (vc == Tgt_itm_grp_cd7) return doTgt_itm_grp_cd7_VC(info);
		if (vc == Tgt_itm_grp_nm7) return doTgt_itm_grp_nm7_VC(info);
		if (vc == Tgt_itm_grp_cd8) return doTgt_itm_grp_cd8_VC(info);
		if (vc == Tgt_itm_grp_nm8) return doTgt_itm_grp_nm8_VC(info);
		if (vc == Tgt_itm_grp_cd9) return doTgt_itm_grp_cd9_VC(info);
		if (vc == Tgt_itm_grp_nm9) return doTgt_itm_grp_nm9_VC(info);
		if (vc == Tgt_itm_grp_cd10) return doTgt_itm_grp_cd10_VC(info);
		if (vc == Tgt_itm_grp_nm10) return doTgt_itm_grp_nm10_VC(info);
		if (vc == Tgt_bp_grp_cd1) return doTgt_bp_grp_cd1_VC(info);
		if (vc == Tgt_bp_grp_nm1) return doTgt_bp_grp_nm1_VC(info);
		if (vc == Tgt_bp_grp_cd2) return doTgt_bp_grp_cd2_VC(info);
		if (vc == Tgt_bp_grp_nm2) return doTgt_bp_grp_nm2_VC(info);
		if (vc == Tgt_bp_grp_cd3) return doTgt_bp_grp_cd3_VC(info);
		if (vc == Tgt_bp_grp_nm3) return doTgt_bp_grp_nm3_VC(info);
		if (vc == Tgt_bp_grp_cd4) return doTgt_bp_grp_cd4_VC(info);
		if (vc == Tgt_bp_grp_nm4) return doTgt_bp_grp_nm4_VC(info);
		if (vc == Tgt_bp_grp_cd5) return doTgt_bp_grp_cd5_VC(info);
		if (vc == Tgt_bp_grp_nm5) return doTgt_bp_grp_nm5_VC(info);
		if (vc == Tgt_bp_grp_cd6) return doTgt_bp_grp_cd6_VC(info);
		if (vc == Tgt_bp_grp_nm6) return doTgt_bp_grp_nm6_VC(info);
		if (vc == Tgt_bp_grp_cd7) return doTgt_bp_grp_cd7_VC(info);
		if (vc == Tgt_bp_grp_nm7) return doTgt_bp_grp_nm7_VC(info);
		if (vc == Tgt_bp_grp_cd8) return doTgt_bp_grp_cd8_VC(info);
		if (vc == Tgt_bp_grp_nm8) return doTgt_bp_grp_nm8_VC(info);
		if (vc == Tgt_bp_grp_cd9) return doTgt_bp_grp_cd9_VC(info);
		if (vc == Tgt_bp_grp_nm9) return doTgt_bp_grp_nm9_VC(info);
		if (vc == Tgt_bp_grp_cd10) return doTgt_bp_grp_cd10_VC(info);
		if (vc == Tgt_bp_grp_nm10) return doTgt_bp_grp_nm10_VC(info);
		if (vc == columnReport_check) return doReport_check_VC(info);
		if (vc == columnReport_report_id) return doReport_report_id_VC(info);
		if (vc == columnReport_report_nm) return doReport_report_nm_VC(info);
		if (vc == columnReport_memo1) return doReport_memo1_VC(info);
		if (vc == columnReport_memo2) return doReport_memo2_VC(info);
		if (vc == columnReport_memo3) return doReport_memo3_VC(info);
		if (vc == columnReport_ins_usr_id) return doReport_ins_usr_id_VC(info);
		if (vc == columnReport_ins_usr_nm) return doReport_ins_usr_nm_VC(info);
		if (vc == columnReport_ins_func_id) return doReport_ins_func_id_VC(info);
		if (vc == columnReport_ins_func_nm) return doReport_ins_func_nm_VC(info);
		if (vc == columnReport_ins_ts) return doReport_ins_ts_VC(info);
		if (vc == columnReport_upd_usr_id) return doReport_upd_usr_id_VC(info);
		if (vc == columnReport_upd_usr_nm) return doReport_upd_usr_nm_VC(info);
		if (vc == columnReport_upd_func_id) return doReport_upd_func_id_VC(info);
		if (vc == columnReport_upd_func_nm) return doReport_upd_func_nm_VC(info);
		if (vc == columnReport_upd_ts) return doReport_upd_ts_VC(info);
		if (vc == columnReport_upd_srv_req_no) return doReport_upd_srv_req_no_VC(info);
		return true;
	}

	/**
	 * [Tab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Report]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReport_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[calc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_calc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[calc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_calc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[calc_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_calc_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[term]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_term_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[st_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_st_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[end_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_end_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_ym_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[mng_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_mng_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[mng_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_mng_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_itm_jnl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[sno1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_sno1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[sno2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_sno2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[sno3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_sno3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[sno4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_sno4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[no_bp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_no_bp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[area_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_area_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[area_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_area_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[asst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_asst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[asst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_asst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_itm_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_itm_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_itm_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_itm_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_itm_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_itm_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_itm_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_itm_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_itm_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_itm_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_itm_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_itm_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_itm_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_itm_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_itm_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_itm_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_itm_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_itm_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_itm_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_itm_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_bp_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_bp_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_bp_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_bp_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_bp_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_bp_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_bp_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_bp_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_bp_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_bp_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_bp_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_bp_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_bp_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_bp_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_bp_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_bp_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_bp_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_bp_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_bp_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_bp_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Report]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReport_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Report]パネルの[report_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReport_report_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Report]パネルの[report_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReport_report_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Report]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReport_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Report]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReport_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Report]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReport_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Report]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReport_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Report]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReport_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Report]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReport_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Report]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReport_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Report]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReport_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Report]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReport_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Report]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReport_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Report]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReport_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Report]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReport_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Report]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReport_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Report]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReport_upd_srv_req_no_VC(MCEventInfo info){
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
		if (nc == TabTab) doTab_NC(info);
		else if (nc == ReportTable) doReport_NC(info);
		else if (nc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NC(info);
		else if (nc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NC(info);
		else if (nc == Tgt_calc_grp_cd) doTgt_calc_grp_cd_NC(info);
		else if (nc == Tgt_calc_grp_nm) doTgt_calc_grp_nm_NC(info);
		else if (nc == Tgt_calc_no) doTgt_calc_no_NC(info);
		else if (nc == Tgt_rmrks) doTgt_rmrks_NC(info);
		else if (nc == Tgt_term) doTgt_term_NC(info);
		else if (nc == Tgt_st_ym) doTgt_st_ym_NC(info);
		else if (nc == Tgt_end_ym) doTgt_end_ym_NC(info);
		else if (nc == Tgt_wg_cd) doTgt_wg_cd_NC(info);
		else if (nc == Tgt_wg_nm) doTgt_wg_nm_NC(info);
		else if (nc == Tgt_ym_fr) doTgt_ym_fr_NC(info);
		else if (nc == Tgt_ym_to) doTgt_ym_to_NC(info);
		else if (nc == Tgt_mng_dpt_cd) doTgt_mng_dpt_cd_NC(info);
		else if (nc == Tgt_mng_dpt_nm) doTgt_mng_dpt_nm_NC(info);
		else if (nc == Tgt_itm_jnl_cd) doTgt_itm_jnl_cd_NC(info);
		else if (nc == Tgt_itm_jnl_nm) doTgt_itm_jnl_nm_NC(info);
		else if (nc == Tgt_lot_no) doTgt_lot_no_NC(info);
		else if (nc == Tgt_sublot_no) doTgt_sublot_no_NC(info);
		else if (nc == Tgt_sno1) doTgt_sno1_NC(info);
		else if (nc == Tgt_sno2) doTgt_sno2_NC(info);
		else if (nc == Tgt_sno3) doTgt_sno3_NC(info);
		else if (nc == Tgt_sno4) doTgt_sno4_NC(info);
		else if (nc == Tgt_bp_cd) doTgt_bp_cd_NC(info);
		else if (nc == Tgt_bp_nm) doTgt_bp_nm_NC(info);
		else if (nc == Tgt_no_bp_flg) doTgt_no_bp_flg_NC(info);
		else if (nc == Tgt_cntry_cd) doTgt_cntry_cd_NC(info);
		else if (nc == Tgt_cntry_nm) doTgt_cntry_nm_NC(info);
		else if (nc == Tgt_area_cd) doTgt_area_cd_NC(info);
		else if (nc == Tgt_area_nm) doTgt_area_nm_NC(info);
		else if (nc == Tgt_asst_typ) doTgt_asst_typ_NC(info);
		else if (nc == Tgt_asst_typ_nm) doTgt_asst_typ_nm_NC(info);
		else if (nc == Tgt_itm_grp_cd1) doTgt_itm_grp_cd1_NC(info);
		else if (nc == Tgt_itm_grp_nm1) doTgt_itm_grp_nm1_NC(info);
		else if (nc == Tgt_itm_grp_cd2) doTgt_itm_grp_cd2_NC(info);
		else if (nc == Tgt_itm_grp_nm2) doTgt_itm_grp_nm2_NC(info);
		else if (nc == Tgt_itm_grp_cd3) doTgt_itm_grp_cd3_NC(info);
		else if (nc == Tgt_itm_grp_nm3) doTgt_itm_grp_nm3_NC(info);
		else if (nc == Tgt_itm_grp_cd4) doTgt_itm_grp_cd4_NC(info);
		else if (nc == Tgt_itm_grp_nm4) doTgt_itm_grp_nm4_NC(info);
		else if (nc == Tgt_itm_grp_cd5) doTgt_itm_grp_cd5_NC(info);
		else if (nc == Tgt_itm_grp_nm5) doTgt_itm_grp_nm5_NC(info);
		else if (nc == Tgt_itm_grp_cd6) doTgt_itm_grp_cd6_NC(info);
		else if (nc == Tgt_itm_grp_nm6) doTgt_itm_grp_nm6_NC(info);
		else if (nc == Tgt_itm_grp_cd7) doTgt_itm_grp_cd7_NC(info);
		else if (nc == Tgt_itm_grp_nm7) doTgt_itm_grp_nm7_NC(info);
		else if (nc == Tgt_itm_grp_cd8) doTgt_itm_grp_cd8_NC(info);
		else if (nc == Tgt_itm_grp_nm8) doTgt_itm_grp_nm8_NC(info);
		else if (nc == Tgt_itm_grp_cd9) doTgt_itm_grp_cd9_NC(info);
		else if (nc == Tgt_itm_grp_nm9) doTgt_itm_grp_nm9_NC(info);
		else if (nc == Tgt_itm_grp_cd10) doTgt_itm_grp_cd10_NC(info);
		else if (nc == Tgt_itm_grp_nm10) doTgt_itm_grp_nm10_NC(info);
		else if (nc == Tgt_bp_grp_cd1) doTgt_bp_grp_cd1_NC(info);
		else if (nc == Tgt_bp_grp_nm1) doTgt_bp_grp_nm1_NC(info);
		else if (nc == Tgt_bp_grp_cd2) doTgt_bp_grp_cd2_NC(info);
		else if (nc == Tgt_bp_grp_nm2) doTgt_bp_grp_nm2_NC(info);
		else if (nc == Tgt_bp_grp_cd3) doTgt_bp_grp_cd3_NC(info);
		else if (nc == Tgt_bp_grp_nm3) doTgt_bp_grp_nm3_NC(info);
		else if (nc == Tgt_bp_grp_cd4) doTgt_bp_grp_cd4_NC(info);
		else if (nc == Tgt_bp_grp_nm4) doTgt_bp_grp_nm4_NC(info);
		else if (nc == Tgt_bp_grp_cd5) doTgt_bp_grp_cd5_NC(info);
		else if (nc == Tgt_bp_grp_nm5) doTgt_bp_grp_nm5_NC(info);
		else if (nc == Tgt_bp_grp_cd6) doTgt_bp_grp_cd6_NC(info);
		else if (nc == Tgt_bp_grp_nm6) doTgt_bp_grp_nm6_NC(info);
		else if (nc == Tgt_bp_grp_cd7) doTgt_bp_grp_cd7_NC(info);
		else if (nc == Tgt_bp_grp_nm7) doTgt_bp_grp_nm7_NC(info);
		else if (nc == Tgt_bp_grp_cd8) doTgt_bp_grp_cd8_NC(info);
		else if (nc == Tgt_bp_grp_nm8) doTgt_bp_grp_nm8_NC(info);
		else if (nc == Tgt_bp_grp_cd9) doTgt_bp_grp_cd9_NC(info);
		else if (nc == Tgt_bp_grp_nm9) doTgt_bp_grp_nm9_NC(info);
		else if (nc == Tgt_bp_grp_cd10) doTgt_bp_grp_cd10_NC(info);
		else if (nc == Tgt_bp_grp_nm10) doTgt_bp_grp_nm10_NC(info);
		else if (nc == columnReport_check) doReport_check_NC(info);
		else if (nc == columnReport_report_id) doReport_report_id_NC(info);
		else if (nc == columnReport_report_nm) doReport_report_nm_NC(info);
		else if (nc == columnReport_memo1) doReport_memo1_NC(info);
		else if (nc == columnReport_memo2) doReport_memo2_NC(info);
		else if (nc == columnReport_memo3) doReport_memo3_NC(info);
		else if (nc == columnReport_ins_usr_id) doReport_ins_usr_id_NC(info);
		else if (nc == columnReport_ins_usr_nm) doReport_ins_usr_nm_NC(info);
		else if (nc == columnReport_ins_func_id) doReport_ins_func_id_NC(info);
		else if (nc == columnReport_ins_func_nm) doReport_ins_func_nm_NC(info);
		else if (nc == columnReport_ins_ts) doReport_ins_ts_NC(info);
		else if (nc == columnReport_upd_usr_id) doReport_upd_usr_id_NC(info);
		else if (nc == columnReport_upd_usr_nm) doReport_upd_usr_nm_NC(info);
		else if (nc == columnReport_upd_func_id) doReport_upd_func_id_NC(info);
		else if (nc == columnReport_upd_func_nm) doReport_upd_func_nm_NC(info);
		else if (nc == columnReport_upd_ts) doReport_upd_ts_NC(info);
		else if (nc == columnReport_upd_srv_req_no) doReport_upd_srv_req_no_NC(info);
	}

	/**
	 * [Tab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTab_NC(MCEventInfo info){
	}

	/**
	 * [Report]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[calc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_calc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[calc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_calc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[calc_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_calc_no_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[term]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_term_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[st_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_st_ym_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[end_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_end_ym_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_ym_to_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[mng_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_mng_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[mng_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_mng_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[sno1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_sno1_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[sno2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_sno2_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[sno3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_sno3_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[sno4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_sno4_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[no_bp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_no_bp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[area_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_area_cd_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[area_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_area_nm_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[asst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_asst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[asst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_asst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_check_NC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[report_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_report_id_NC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[report_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_report_nm_NC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == TabTab) doTab_NE(info);
		else if (ne == ReportTable) doReport_NE(info);
		else if (ne == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NE(info);
		else if (ne == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NE(info);
		else if (ne == Tgt_calc_grp_cd) doTgt_calc_grp_cd_NE(info);
		else if (ne == Tgt_calc_grp_nm) doTgt_calc_grp_nm_NE(info);
		else if (ne == Tgt_calc_no) doTgt_calc_no_NE(info);
		else if (ne == Tgt_rmrks) doTgt_rmrks_NE(info);
		else if (ne == Tgt_term) doTgt_term_NE(info);
		else if (ne == Tgt_st_ym) doTgt_st_ym_NE(info);
		else if (ne == Tgt_end_ym) doTgt_end_ym_NE(info);
		else if (ne == Tgt_wg_cd) doTgt_wg_cd_NE(info);
		else if (ne == Tgt_wg_nm) doTgt_wg_nm_NE(info);
		else if (ne == Tgt_ym_fr) doTgt_ym_fr_NE(info);
		else if (ne == Tgt_ym_to) doTgt_ym_to_NE(info);
		else if (ne == Tgt_mng_dpt_cd) doTgt_mng_dpt_cd_NE(info);
		else if (ne == Tgt_mng_dpt_nm) doTgt_mng_dpt_nm_NE(info);
		else if (ne == Tgt_itm_jnl_cd) doTgt_itm_jnl_cd_NE(info);
		else if (ne == Tgt_itm_jnl_nm) doTgt_itm_jnl_nm_NE(info);
		else if (ne == Tgt_lot_no) doTgt_lot_no_NE(info);
		else if (ne == Tgt_sublot_no) doTgt_sublot_no_NE(info);
		else if (ne == Tgt_sno1) doTgt_sno1_NE(info);
		else if (ne == Tgt_sno2) doTgt_sno2_NE(info);
		else if (ne == Tgt_sno3) doTgt_sno3_NE(info);
		else if (ne == Tgt_sno4) doTgt_sno4_NE(info);
		else if (ne == Tgt_bp_cd) doTgt_bp_cd_NE(info);
		else if (ne == Tgt_bp_nm) doTgt_bp_nm_NE(info);
		else if (ne == Tgt_no_bp_flg) doTgt_no_bp_flg_NE(info);
		else if (ne == Tgt_cntry_cd) doTgt_cntry_cd_NE(info);
		else if (ne == Tgt_cntry_nm) doTgt_cntry_nm_NE(info);
		else if (ne == Tgt_area_cd) doTgt_area_cd_NE(info);
		else if (ne == Tgt_area_nm) doTgt_area_nm_NE(info);
		else if (ne == Tgt_asst_typ) doTgt_asst_typ_NE(info);
		else if (ne == Tgt_asst_typ_nm) doTgt_asst_typ_nm_NE(info);
		else if (ne == Tgt_itm_grp_cd1) doTgt_itm_grp_cd1_NE(info);
		else if (ne == Tgt_itm_grp_nm1) doTgt_itm_grp_nm1_NE(info);
		else if (ne == Tgt_itm_grp_cd2) doTgt_itm_grp_cd2_NE(info);
		else if (ne == Tgt_itm_grp_nm2) doTgt_itm_grp_nm2_NE(info);
		else if (ne == Tgt_itm_grp_cd3) doTgt_itm_grp_cd3_NE(info);
		else if (ne == Tgt_itm_grp_nm3) doTgt_itm_grp_nm3_NE(info);
		else if (ne == Tgt_itm_grp_cd4) doTgt_itm_grp_cd4_NE(info);
		else if (ne == Tgt_itm_grp_nm4) doTgt_itm_grp_nm4_NE(info);
		else if (ne == Tgt_itm_grp_cd5) doTgt_itm_grp_cd5_NE(info);
		else if (ne == Tgt_itm_grp_nm5) doTgt_itm_grp_nm5_NE(info);
		else if (ne == Tgt_itm_grp_cd6) doTgt_itm_grp_cd6_NE(info);
		else if (ne == Tgt_itm_grp_nm6) doTgt_itm_grp_nm6_NE(info);
		else if (ne == Tgt_itm_grp_cd7) doTgt_itm_grp_cd7_NE(info);
		else if (ne == Tgt_itm_grp_nm7) doTgt_itm_grp_nm7_NE(info);
		else if (ne == Tgt_itm_grp_cd8) doTgt_itm_grp_cd8_NE(info);
		else if (ne == Tgt_itm_grp_nm8) doTgt_itm_grp_nm8_NE(info);
		else if (ne == Tgt_itm_grp_cd9) doTgt_itm_grp_cd9_NE(info);
		else if (ne == Tgt_itm_grp_nm9) doTgt_itm_grp_nm9_NE(info);
		else if (ne == Tgt_itm_grp_cd10) doTgt_itm_grp_cd10_NE(info);
		else if (ne == Tgt_itm_grp_nm10) doTgt_itm_grp_nm10_NE(info);
		else if (ne == Tgt_bp_grp_cd1) doTgt_bp_grp_cd1_NE(info);
		else if (ne == Tgt_bp_grp_nm1) doTgt_bp_grp_nm1_NE(info);
		else if (ne == Tgt_bp_grp_cd2) doTgt_bp_grp_cd2_NE(info);
		else if (ne == Tgt_bp_grp_nm2) doTgt_bp_grp_nm2_NE(info);
		else if (ne == Tgt_bp_grp_cd3) doTgt_bp_grp_cd3_NE(info);
		else if (ne == Tgt_bp_grp_nm3) doTgt_bp_grp_nm3_NE(info);
		else if (ne == Tgt_bp_grp_cd4) doTgt_bp_grp_cd4_NE(info);
		else if (ne == Tgt_bp_grp_nm4) doTgt_bp_grp_nm4_NE(info);
		else if (ne == Tgt_bp_grp_cd5) doTgt_bp_grp_cd5_NE(info);
		else if (ne == Tgt_bp_grp_nm5) doTgt_bp_grp_nm5_NE(info);
		else if (ne == Tgt_bp_grp_cd6) doTgt_bp_grp_cd6_NE(info);
		else if (ne == Tgt_bp_grp_nm6) doTgt_bp_grp_nm6_NE(info);
		else if (ne == Tgt_bp_grp_cd7) doTgt_bp_grp_cd7_NE(info);
		else if (ne == Tgt_bp_grp_nm7) doTgt_bp_grp_nm7_NE(info);
		else if (ne == Tgt_bp_grp_cd8) doTgt_bp_grp_cd8_NE(info);
		else if (ne == Tgt_bp_grp_nm8) doTgt_bp_grp_nm8_NE(info);
		else if (ne == Tgt_bp_grp_cd9) doTgt_bp_grp_cd9_NE(info);
		else if (ne == Tgt_bp_grp_nm9) doTgt_bp_grp_nm9_NE(info);
		else if (ne == Tgt_bp_grp_cd10) doTgt_bp_grp_cd10_NE(info);
		else if (ne == Tgt_bp_grp_nm10) doTgt_bp_grp_nm10_NE(info);
		else if (ne == columnReport_check) doReport_check_NE(info);
		else if (ne == columnReport_report_id) doReport_report_id_NE(info);
		else if (ne == columnReport_report_nm) doReport_report_nm_NE(info);
		else if (ne == columnReport_memo1) doReport_memo1_NE(info);
		else if (ne == columnReport_memo2) doReport_memo2_NE(info);
		else if (ne == columnReport_memo3) doReport_memo3_NE(info);
		else if (ne == columnReport_ins_usr_id) doReport_ins_usr_id_NE(info);
		else if (ne == columnReport_ins_usr_nm) doReport_ins_usr_nm_NE(info);
		else if (ne == columnReport_ins_func_id) doReport_ins_func_id_NE(info);
		else if (ne == columnReport_ins_func_nm) doReport_ins_func_nm_NE(info);
		else if (ne == columnReport_ins_ts) doReport_ins_ts_NE(info);
		else if (ne == columnReport_upd_usr_id) doReport_upd_usr_id_NE(info);
		else if (ne == columnReport_upd_usr_nm) doReport_upd_usr_nm_NE(info);
		else if (ne == columnReport_upd_func_id) doReport_upd_func_id_NE(info);
		else if (ne == columnReport_upd_func_nm) doReport_upd_func_nm_NE(info);
		else if (ne == columnReport_upd_ts) doReport_upd_ts_NE(info);
		else if (ne == columnReport_upd_srv_req_no) doReport_upd_srv_req_no_NE(info);
	}

	/**
	 * [Tab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTab_NE(MCEventInfo info){
	}

	/**
	 * [Report]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[calc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_calc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[calc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_calc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[calc_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_calc_no_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[term]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_term_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[st_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_st_ym_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[end_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_end_ym_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_ym_to_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[mng_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_mng_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[mng_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_mng_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[sno1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_sno1_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[sno2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_sno2_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[sno3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_sno3_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[sno4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_sno4_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[no_bp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_no_bp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[area_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_area_cd_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[area_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_area_nm_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[asst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_asst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[asst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_asst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_check_NE(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[report_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_report_id_NE(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[report_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_report_nm_NE(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == TabTab) doTab_NX(info);
		else if (nx == ReportTable) doReport_NX(info);
		else if (nx == Cnd_calc_grp_cd) doCnd_calc_grp_cd_NX(info);
		else if (nx == Cnd_calc_grp_nm) doCnd_calc_grp_nm_NX(info);
		else if (nx == Tgt_calc_grp_cd) doTgt_calc_grp_cd_NX(info);
		else if (nx == Tgt_calc_grp_nm) doTgt_calc_grp_nm_NX(info);
		else if (nx == Tgt_calc_no) doTgt_calc_no_NX(info);
		else if (nx == Tgt_rmrks) doTgt_rmrks_NX(info);
		else if (nx == Tgt_term) doTgt_term_NX(info);
		else if (nx == Tgt_st_ym) doTgt_st_ym_NX(info);
		else if (nx == Tgt_end_ym) doTgt_end_ym_NX(info);
		else if (nx == Tgt_wg_cd) doTgt_wg_cd_NX(info);
		else if (nx == Tgt_wg_nm) doTgt_wg_nm_NX(info);
		else if (nx == Tgt_ym_fr) doTgt_ym_fr_NX(info);
		else if (nx == Tgt_ym_to) doTgt_ym_to_NX(info);
		else if (nx == Tgt_mng_dpt_cd) doTgt_mng_dpt_cd_NX(info);
		else if (nx == Tgt_mng_dpt_nm) doTgt_mng_dpt_nm_NX(info);
		else if (nx == Tgt_itm_jnl_cd) doTgt_itm_jnl_cd_NX(info);
		else if (nx == Tgt_itm_jnl_nm) doTgt_itm_jnl_nm_NX(info);
		else if (nx == Tgt_lot_no) doTgt_lot_no_NX(info);
		else if (nx == Tgt_sublot_no) doTgt_sublot_no_NX(info);
		else if (nx == Tgt_sno1) doTgt_sno1_NX(info);
		else if (nx == Tgt_sno2) doTgt_sno2_NX(info);
		else if (nx == Tgt_sno3) doTgt_sno3_NX(info);
		else if (nx == Tgt_sno4) doTgt_sno4_NX(info);
		else if (nx == Tgt_bp_cd) doTgt_bp_cd_NX(info);
		else if (nx == Tgt_bp_nm) doTgt_bp_nm_NX(info);
		else if (nx == Tgt_no_bp_flg) doTgt_no_bp_flg_NX(info);
		else if (nx == Tgt_cntry_cd) doTgt_cntry_cd_NX(info);
		else if (nx == Tgt_cntry_nm) doTgt_cntry_nm_NX(info);
		else if (nx == Tgt_area_cd) doTgt_area_cd_NX(info);
		else if (nx == Tgt_area_nm) doTgt_area_nm_NX(info);
		else if (nx == Tgt_asst_typ) doTgt_asst_typ_NX(info);
		else if (nx == Tgt_asst_typ_nm) doTgt_asst_typ_nm_NX(info);
		else if (nx == Tgt_itm_grp_cd1) doTgt_itm_grp_cd1_NX(info);
		else if (nx == Tgt_itm_grp_nm1) doTgt_itm_grp_nm1_NX(info);
		else if (nx == Tgt_itm_grp_cd2) doTgt_itm_grp_cd2_NX(info);
		else if (nx == Tgt_itm_grp_nm2) doTgt_itm_grp_nm2_NX(info);
		else if (nx == Tgt_itm_grp_cd3) doTgt_itm_grp_cd3_NX(info);
		else if (nx == Tgt_itm_grp_nm3) doTgt_itm_grp_nm3_NX(info);
		else if (nx == Tgt_itm_grp_cd4) doTgt_itm_grp_cd4_NX(info);
		else if (nx == Tgt_itm_grp_nm4) doTgt_itm_grp_nm4_NX(info);
		else if (nx == Tgt_itm_grp_cd5) doTgt_itm_grp_cd5_NX(info);
		else if (nx == Tgt_itm_grp_nm5) doTgt_itm_grp_nm5_NX(info);
		else if (nx == Tgt_itm_grp_cd6) doTgt_itm_grp_cd6_NX(info);
		else if (nx == Tgt_itm_grp_nm6) doTgt_itm_grp_nm6_NX(info);
		else if (nx == Tgt_itm_grp_cd7) doTgt_itm_grp_cd7_NX(info);
		else if (nx == Tgt_itm_grp_nm7) doTgt_itm_grp_nm7_NX(info);
		else if (nx == Tgt_itm_grp_cd8) doTgt_itm_grp_cd8_NX(info);
		else if (nx == Tgt_itm_grp_nm8) doTgt_itm_grp_nm8_NX(info);
		else if (nx == Tgt_itm_grp_cd9) doTgt_itm_grp_cd9_NX(info);
		else if (nx == Tgt_itm_grp_nm9) doTgt_itm_grp_nm9_NX(info);
		else if (nx == Tgt_itm_grp_cd10) doTgt_itm_grp_cd10_NX(info);
		else if (nx == Tgt_itm_grp_nm10) doTgt_itm_grp_nm10_NX(info);
		else if (nx == Tgt_bp_grp_cd1) doTgt_bp_grp_cd1_NX(info);
		else if (nx == Tgt_bp_grp_nm1) doTgt_bp_grp_nm1_NX(info);
		else if (nx == Tgt_bp_grp_cd2) doTgt_bp_grp_cd2_NX(info);
		else if (nx == Tgt_bp_grp_nm2) doTgt_bp_grp_nm2_NX(info);
		else if (nx == Tgt_bp_grp_cd3) doTgt_bp_grp_cd3_NX(info);
		else if (nx == Tgt_bp_grp_nm3) doTgt_bp_grp_nm3_NX(info);
		else if (nx == Tgt_bp_grp_cd4) doTgt_bp_grp_cd4_NX(info);
		else if (nx == Tgt_bp_grp_nm4) doTgt_bp_grp_nm4_NX(info);
		else if (nx == Tgt_bp_grp_cd5) doTgt_bp_grp_cd5_NX(info);
		else if (nx == Tgt_bp_grp_nm5) doTgt_bp_grp_nm5_NX(info);
		else if (nx == Tgt_bp_grp_cd6) doTgt_bp_grp_cd6_NX(info);
		else if (nx == Tgt_bp_grp_nm6) doTgt_bp_grp_nm6_NX(info);
		else if (nx == Tgt_bp_grp_cd7) doTgt_bp_grp_cd7_NX(info);
		else if (nx == Tgt_bp_grp_nm7) doTgt_bp_grp_nm7_NX(info);
		else if (nx == Tgt_bp_grp_cd8) doTgt_bp_grp_cd8_NX(info);
		else if (nx == Tgt_bp_grp_nm8) doTgt_bp_grp_nm8_NX(info);
		else if (nx == Tgt_bp_grp_cd9) doTgt_bp_grp_cd9_NX(info);
		else if (nx == Tgt_bp_grp_nm9) doTgt_bp_grp_nm9_NX(info);
		else if (nx == Tgt_bp_grp_cd10) doTgt_bp_grp_cd10_NX(info);
		else if (nx == Tgt_bp_grp_nm10) doTgt_bp_grp_nm10_NX(info);
		else if (nx == columnReport_check) doReport_check_NX(info);
		else if (nx == columnReport_report_id) doReport_report_id_NX(info);
		else if (nx == columnReport_report_nm) doReport_report_nm_NX(info);
		else if (nx == columnReport_memo1) doReport_memo1_NX(info);
		else if (nx == columnReport_memo2) doReport_memo2_NX(info);
		else if (nx == columnReport_memo3) doReport_memo3_NX(info);
		else if (nx == columnReport_ins_usr_id) doReport_ins_usr_id_NX(info);
		else if (nx == columnReport_ins_usr_nm) doReport_ins_usr_nm_NX(info);
		else if (nx == columnReport_ins_func_id) doReport_ins_func_id_NX(info);
		else if (nx == columnReport_ins_func_nm) doReport_ins_func_nm_NX(info);
		else if (nx == columnReport_ins_ts) doReport_ins_ts_NX(info);
		else if (nx == columnReport_upd_usr_id) doReport_upd_usr_id_NX(info);
		else if (nx == columnReport_upd_usr_nm) doReport_upd_usr_nm_NX(info);
		else if (nx == columnReport_upd_func_id) doReport_upd_func_id_NX(info);
		else if (nx == columnReport_upd_func_nm) doReport_upd_func_nm_NX(info);
		else if (nx == columnReport_upd_ts) doReport_upd_ts_NX(info);
		else if (nx == columnReport_upd_srv_req_no) doReport_upd_srv_req_no_NX(info);
	}

	/**
	 * [Tab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTab_NX(MCEventInfo info){
	}

	/**
	 * [Report]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[calc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_calc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[calc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_calc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[calc_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_calc_no_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[term]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_term_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[st_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_st_ym_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[end_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_end_ym_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_ym_to_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[mng_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_mng_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[mng_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_mng_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[sno1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_sno1_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[sno2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_sno2_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[sno3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_sno3_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[sno4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_sno4_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[no_bp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_no_bp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[area_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_area_cd_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[area_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_area_nm_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[asst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_asst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[asst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_asst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_check_NX(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[report_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_report_id_NX(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[report_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_report_nm_NX(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_calc_grp_cd) doCnd_calc_grp_cd_LC(info);
		else if (lc == Cnd_calc_grp_nm) doCnd_calc_grp_nm_LC(info);
		else if (lc == Tgt_calc_grp_cd) doTgt_calc_grp_cd_LC(info);
		else if (lc == Tgt_calc_grp_nm) doTgt_calc_grp_nm_LC(info);
		else if (lc == Tgt_calc_no) doTgt_calc_no_LC(info);
		else if (lc == Tgt_rmrks) doTgt_rmrks_LC(info);
		else if (lc == Tgt_term) doTgt_term_LC(info);
		else if (lc == Tgt_st_ym) doTgt_st_ym_LC(info);
		else if (lc == Tgt_end_ym) doTgt_end_ym_LC(info);
		else if (lc == Tgt_wg_cd) doTgt_wg_cd_LC(info);
		else if (lc == Tgt_wg_nm) doTgt_wg_nm_LC(info);
		else if (lc == Tgt_ym_fr) doTgt_ym_fr_LC(info);
		else if (lc == Tgt_ym_to) doTgt_ym_to_LC(info);
		else if (lc == Tgt_mng_dpt_cd) doTgt_mng_dpt_cd_LC(info);
		else if (lc == Tgt_mng_dpt_nm) doTgt_mng_dpt_nm_LC(info);
		else if (lc == Tgt_itm_jnl_cd) doTgt_itm_jnl_cd_LC(info);
		else if (lc == Tgt_itm_jnl_nm) doTgt_itm_jnl_nm_LC(info);
		else if (lc == Tgt_lot_no) doTgt_lot_no_LC(info);
		else if (lc == Tgt_sublot_no) doTgt_sublot_no_LC(info);
		else if (lc == Tgt_sno1) doTgt_sno1_LC(info);
		else if (lc == Tgt_sno2) doTgt_sno2_LC(info);
		else if (lc == Tgt_sno3) doTgt_sno3_LC(info);
		else if (lc == Tgt_sno4) doTgt_sno4_LC(info);
		else if (lc == Tgt_bp_cd) doTgt_bp_cd_LC(info);
		else if (lc == Tgt_bp_nm) doTgt_bp_nm_LC(info);
		else if (lc == Tgt_cntry_cd) doTgt_cntry_cd_LC(info);
		else if (lc == Tgt_cntry_nm) doTgt_cntry_nm_LC(info);
		else if (lc == Tgt_area_cd) doTgt_area_cd_LC(info);
		else if (lc == Tgt_area_nm) doTgt_area_nm_LC(info);
		else if (lc == Tgt_asst_typ) doTgt_asst_typ_LC(info);
		else if (lc == Tgt_asst_typ_nm) doTgt_asst_typ_nm_LC(info);
		else if (lc == Tgt_itm_grp_cd1) doTgt_itm_grp_cd1_LC(info);
		else if (lc == Tgt_itm_grp_nm1) doTgt_itm_grp_nm1_LC(info);
		else if (lc == Tgt_itm_grp_cd2) doTgt_itm_grp_cd2_LC(info);
		else if (lc == Tgt_itm_grp_nm2) doTgt_itm_grp_nm2_LC(info);
		else if (lc == Tgt_itm_grp_cd3) doTgt_itm_grp_cd3_LC(info);
		else if (lc == Tgt_itm_grp_nm3) doTgt_itm_grp_nm3_LC(info);
		else if (lc == Tgt_itm_grp_cd4) doTgt_itm_grp_cd4_LC(info);
		else if (lc == Tgt_itm_grp_nm4) doTgt_itm_grp_nm4_LC(info);
		else if (lc == Tgt_itm_grp_cd5) doTgt_itm_grp_cd5_LC(info);
		else if (lc == Tgt_itm_grp_nm5) doTgt_itm_grp_nm5_LC(info);
		else if (lc == Tgt_itm_grp_cd6) doTgt_itm_grp_cd6_LC(info);
		else if (lc == Tgt_itm_grp_nm6) doTgt_itm_grp_nm6_LC(info);
		else if (lc == Tgt_itm_grp_cd7) doTgt_itm_grp_cd7_LC(info);
		else if (lc == Tgt_itm_grp_nm7) doTgt_itm_grp_nm7_LC(info);
		else if (lc == Tgt_itm_grp_cd8) doTgt_itm_grp_cd8_LC(info);
		else if (lc == Tgt_itm_grp_nm8) doTgt_itm_grp_nm8_LC(info);
		else if (lc == Tgt_itm_grp_cd9) doTgt_itm_grp_cd9_LC(info);
		else if (lc == Tgt_itm_grp_nm9) doTgt_itm_grp_nm9_LC(info);
		else if (lc == Tgt_itm_grp_cd10) doTgt_itm_grp_cd10_LC(info);
		else if (lc == Tgt_itm_grp_nm10) doTgt_itm_grp_nm10_LC(info);
		else if (lc == Tgt_bp_grp_cd1) doTgt_bp_grp_cd1_LC(info);
		else if (lc == Tgt_bp_grp_nm1) doTgt_bp_grp_nm1_LC(info);
		else if (lc == Tgt_bp_grp_cd2) doTgt_bp_grp_cd2_LC(info);
		else if (lc == Tgt_bp_grp_nm2) doTgt_bp_grp_nm2_LC(info);
		else if (lc == Tgt_bp_grp_cd3) doTgt_bp_grp_cd3_LC(info);
		else if (lc == Tgt_bp_grp_nm3) doTgt_bp_grp_nm3_LC(info);
		else if (lc == Tgt_bp_grp_cd4) doTgt_bp_grp_cd4_LC(info);
		else if (lc == Tgt_bp_grp_nm4) doTgt_bp_grp_nm4_LC(info);
		else if (lc == Tgt_bp_grp_cd5) doTgt_bp_grp_cd5_LC(info);
		else if (lc == Tgt_bp_grp_nm5) doTgt_bp_grp_nm5_LC(info);
		else if (lc == Tgt_bp_grp_cd6) doTgt_bp_grp_cd6_LC(info);
		else if (lc == Tgt_bp_grp_nm6) doTgt_bp_grp_nm6_LC(info);
		else if (lc == Tgt_bp_grp_cd7) doTgt_bp_grp_cd7_LC(info);
		else if (lc == Tgt_bp_grp_nm7) doTgt_bp_grp_nm7_LC(info);
		else if (lc == Tgt_bp_grp_cd8) doTgt_bp_grp_cd8_LC(info);
		else if (lc == Tgt_bp_grp_nm8) doTgt_bp_grp_nm8_LC(info);
		else if (lc == Tgt_bp_grp_cd9) doTgt_bp_grp_cd9_LC(info);
		else if (lc == Tgt_bp_grp_nm9) doTgt_bp_grp_nm9_LC(info);
		else if (lc == Tgt_bp_grp_cd10) doTgt_bp_grp_cd10_LC(info);
		else if (lc == Tgt_bp_grp_nm10) doTgt_bp_grp_nm10_LC(info);
		else if (lc == columnReport_report_id) doReport_report_id_LC(info);
		else if (lc == columnReport_report_nm) doReport_report_nm_LC(info);
		else if (lc == columnReport_memo1) doReport_memo1_LC(info);
		else if (lc == columnReport_memo2) doReport_memo2_LC(info);
		else if (lc == columnReport_memo3) doReport_memo3_LC(info);
		else if (lc == columnReport_ins_usr_id) doReport_ins_usr_id_LC(info);
		else if (lc == columnReport_ins_usr_nm) doReport_ins_usr_nm_LC(info);
		else if (lc == columnReport_ins_func_id) doReport_ins_func_id_LC(info);
		else if (lc == columnReport_ins_func_nm) doReport_ins_func_nm_LC(info);
		else if (lc == columnReport_ins_ts) doReport_ins_ts_LC(info);
		else if (lc == columnReport_upd_usr_id) doReport_upd_usr_id_LC(info);
		else if (lc == columnReport_upd_usr_nm) doReport_upd_usr_nm_LC(info);
		else if (lc == columnReport_upd_func_id) doReport_upd_func_id_LC(info);
		else if (lc == columnReport_upd_func_nm) doReport_upd_func_nm_LC(info);
		else if (lc == columnReport_upd_ts) doReport_upd_ts_LC(info);
		else if (lc == columnReport_upd_srv_req_no) doReport_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[calc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_calc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[calc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_calc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[calc_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_calc_no_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[term]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_term_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[st_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_st_ym_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[end_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_end_ym_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_ym_to_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[mng_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_mng_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[mng_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_mng_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[sno1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_sno1_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[sno2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_sno2_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[sno3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_sno3_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[sno4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_sno4_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[area_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_area_cd_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[area_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_area_nm_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[asst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_asst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[asst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_asst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[itm_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_itm_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Tgt]パネルの[bp_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_bp_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[report_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_report_id_LC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[report_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_report_nm_LC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Report]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReport_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_calc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_no_p_PPanel_CalcNo_calc_no]の作成メソッド
	 */
	public MCList getCnd_calc_no_p_PPanel_CalcNo_calc_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getCalcNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_wg_cd]の作成メソッド
	 */
	public MCList getTgt_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_ym_fr]の作成メソッド
	 */
	public MCList getTgt_ym_fr(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getYm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_ym_to]の作成メソッド
	 */
	public MCList getTgt_ym_to(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getYm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_mng_dpt_cd]の作成メソッド
	 */
	public MCList getTgt_mng_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_itm_jnl_cd]の作成メソッド
	 */
	public MCList getTgt_itm_jnl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmJnl(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getTgt_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getTgt_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getTgt_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getTgt_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_bp_cd]の作成メソッド
	 */
	public MCList getTgt_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_cntry_cd]の作成メソッド
	 */
	public MCList getTgt_cntry_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCntry(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_area_cd]の作成メソッド
	 */
	public MCList getTgt_area_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArea(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_asst_typ]の作成メソッド
	 */
	public MCList getTgt_asst_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAsstTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_itm_grp_cd1]の作成メソッド
	 */
	public MCList getTgt_itm_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_itm_grp_cd2]の作成メソッド
	 */
	public MCList getTgt_itm_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_itm_grp_cd3]の作成メソッド
	 */
	public MCList getTgt_itm_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_itm_grp_cd4]の作成メソッド
	 */
	public MCList getTgt_itm_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_itm_grp_cd5]の作成メソッド
	 */
	public MCList getTgt_itm_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_itm_grp_cd6]の作成メソッド
	 */
	public MCList getTgt_itm_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_itm_grp_cd7]の作成メソッド
	 */
	public MCList getTgt_itm_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_itm_grp_cd8]の作成メソッド
	 */
	public MCList getTgt_itm_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_itm_grp_cd9]の作成メソッド
	 */
	public MCList getTgt_itm_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_itm_grp_cd10]の作成メソッド
	 */
	public MCList getTgt_itm_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp10(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_bp_grp_cd1]の作成メソッド
	 */
	public MCList getTgt_bp_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_bp_grp_cd2]の作成メソッド
	 */
	public MCList getTgt_bp_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_bp_grp_cd3]の作成メソッド
	 */
	public MCList getTgt_bp_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_bp_grp_cd4]の作成メソッド
	 */
	public MCList getTgt_bp_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_bp_grp_cd5]の作成メソッド
	 */
	public MCList getTgt_bp_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_bp_grp_cd6]の作成メソッド
	 */
	public MCList getTgt_bp_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_bp_grp_cd7]の作成メソッド
	 */
	public MCList getTgt_bp_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_bp_grp_cd8]の作成メソッド
	 */
	public MCList getTgt_bp_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_bp_grp_cd9]の作成メソッド
	 */
	public MCList getTgt_bp_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Tgt_bp_grp_cd10]の作成メソッド
	 */
	public MCList getTgt_bp_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp10(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBFL0320.Srch01")) {
			return new MG_MGBFL0320_Srch01Bridge();
		}
		if (id.equals("MG.MGBFL0320.Prnt01")) {
			return new MG_MGBFL0320_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBFL0320_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0320_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBFL0320_Srch01;

		/** コンストラクタ */
		protected MG_MGBFL0320_Srch01Bridge() {
			p_MG_MGBFL0320_Srch01 = new MCParam(PDef.MG_MGBFL0320_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBFL0320_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBF.MGBFP0320.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMGBF.MGBFP0320.TgtR.create());
			param.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0320.ReportR.class));

			p_MG_MGBFL0320_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBFL0320_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBFL0320_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBFL0320_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBFL0320_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBF.MGBFP0320.CndR up0() {
			return (mcframe.clientMGBF.MGBFP0320.CndR)up(0);
		}

		protected mcframe.clientMGBF.MGBFP0320.TgtR down0() {
			return (mcframe.clientMGBF.MGBFP0320.TgtR)down(0);
		}
		protected MCList<mcframe.clientMGBF.MGBFP0320.ReportR> down1() {
			return (MCList<mcframe.clientMGBF.MGBFP0320.ReportR>)down(1);
		}

		protected void setupDownParam() {
			p_MG_MGBFL0320_Srch01.addDownBlock(mcframe.clientMGBF.MGBFP0320.TgtR.create());
			p_MG_MGBFL0320_Srch01.addDownBlock(MCList.create(mcframe.clientMGBF.MGBFP0320.ReportR.class));
		}
		protected MCParam param() {
			return p_MG_MGBFL0320_Srch01;
		}

		protected void show() {
			setTgtR((mcframe.clientMGBF.MGBFP0320.TgtR)p_MG_MGBFL0320_Srch01.getContainerParam().getDownBlock(0));
			setReportL((MCList<mcframe.clientMGBF.MGBFP0320.ReportR>)p_MG_MGBFL0320_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getTgtR().clear();
			getReportL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getTgtR());
			result.add(getReportL());
			return result;
		}
	}
	/**
	 * [MG_MGBFL0320_Prnt01]の定型処理のInnerClass
	 */
	protected class MG_MGBFL0320_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBFL0320_Prnt01;

		/** コンストラクタ */
		protected MG_MGBFL0320_Prnt01Bridge() {
			p_MG_MGBFL0320_Prnt01 = new MCParam(PDef.MG_MGBFL0320_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBFL0320_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBF.MGBFP0320.TgtR.create());
			param.addUpBlock(MCList.create(mcframe.clientMGBF.MGBFP0320.ReportR.class));
			// Down

			p_MG_MGBFL0320_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBFL0320_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBFL0320_Prnt01.addUpBlock(getTgtR());
			p_MG_MGBFL0320_Prnt01.addUpBlock(getReportL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBFL0320_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBFL0320_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBF.MGBFP0320.TgtR up0() {
			return (mcframe.clientMGBF.MGBFP0320.TgtR)up(0);
		}
		protected MCList<mcframe.clientMGBF.MGBFP0320.ReportR> up1() {
			return (MCList<mcframe.clientMGBF.MGBFP0320.ReportR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBFL0320_Prnt01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getTgtR());
			result.add(getReportL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}