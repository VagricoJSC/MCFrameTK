package mcframe.clientMSBF.MSBFP0040;

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
import mcframe.clientMSBF.MSBFP0040.MSBFP_InspInstReg_MC.MS_MSBFL0040_Srch01Caller;
import mcframe.clientMSBF.MSBFP0040.MSBFP_InspInstReg_MC.MS_MSBFL0040_Srch02Caller;
import mcframe.clientMSBF.MSBFP0040.MSBFP_InspInstReg_MC.MS_MSBFL0040_Srch03Caller;
import mcframe.clientMSBF.MSBFP0040.MSBFP_InspInstReg_MC.MS_MSBFL0040_Srch04Caller;
import mcframe.clientMSBF.MSBFP0040.MSBFP_InspInstReg_MC.MS_MSBFL0040_Ins01Caller;
import mcframe.clientMSBF.MSBFP0040.MSBFP_InspInstReg_MC.MS_MSBFL0040_Upd01Caller;
import mcframe.clientMSBF.MSBFP0040.MSBFP_InspInstReg_MC.MS_MSBFL0040_Upd02Caller;
import mcframe.clientMSBF.MSBFP0040.MSBFP_InspInstReg_MC.MS_MSBFL0040_Del01Caller;
import mcframe.clientMSBF.MSBFP0040.MSBFP_InspInstReg_MC.MS_MSBFL0040_Del02Caller;
import mcframe.clientMSBF.MSBFP0040.MSBFP_InspInstReg_MC.MS_MSBFL0040_Prnt01Caller;

/**
 * 画面"MSBFP_InspInstReg"パネルクラスです。<p>
 *
 * 単票形式での検査指図の登録画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFP_InspInstReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBF";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBFP0040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [ScreenOpe]ブロック関連のField定義
	public MCPanel ScreenOpePanel = null;
	public MCTitledBorder ScreenOpeTitledBorder = null;
	// [ScreenOpe]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * INS,Create,0;UPD,Modify,1;APRV,Approve,2;DEL,Cancel,3;REF,View,4 INS,登録する,0;UPD,訂正する,1;APRV,承認する,2;DEL,取り消す,3;REF,参照する,4.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_APRV = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * Search target type 検索対象区分.<p>
	 *
	 */
	public MCTextField Cnd_srch_tgt_typ = null;
	public MCLabel Cnd_srch_tgt_typ_nm_Label = null;
	/**
	 * Search target type name 検索対象区分名.<p>
	 *
	 */
	public MCTextComboBox Cnd_srch_tgt_typ_nm = null;
	/**
	 * Search target No. 検索対象ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_srch_tgt_no = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch_schd = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch_inst = null;
	// [HdrTab]ブロック関連のField定義
	public MCPanel HdrTabPanel = null;
	public MCTabbedPane HdrTabTab = null;
	// [HdrTab]ブロックの項目のField定義
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	// [Hdr]ブロックの項目のField定義
	/**
	 * Master acquisition マスタ取得.<p>
	 *
	 */
	public MCButton Hdr_srch_mst = null;
	/**
	 * Acquire specific inspection 規格検査取得.<p>
	 *
	 */
	public MCButton Hdr_srch_std = null;
	public MCLabel Hdr_insp_no_Label = null;
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_insp_no = null;
	public MCLabel Hdr_insp_schd_no_Label = null;
	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_insp_schd_no = null;
	public MCLabel Hdr_insp_freq_Label = null;
	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public MCNumberField Hdr_insp_freq = null;
	public MCLabel Hdr_insp_sts_typ_Label = null;
	/**
	 * Inspection status type 検査状況区分.<p>
	 *
	 */
	public MCTextField Hdr_insp_sts_typ = null;
	/**
	 * Inspection status type name 検査状況区分名.<p>
	 *
	 */
	public MCTextField Hdr_insp_sts_typ_nm = null;
	public MCLabel Hdr_insp_typ_Label = null;
	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public MCTextField Hdr_insp_typ = null;
	/**
	 * Inspection classification type name 検査種類区分名.<p>
	 *
	 */
	public MCTextField Hdr_insp_typ_nm = null;
	/**
	 * Re-inspection for expiration 期限再検査.<p>
	 *
	 */
	public MCCheckBox Hdr_lmt_up_flg = null;
	/**
	 * Allow inspecting usage 検査中使用許可.<p>
	 *
	 */
	public MCCheckBox Hdr_in_prmt_insp_flg = null;
	/**
	 * Current LIMS 今回ＬＩＭＳ.<p>
	 *
	 */
	public MCCheckBox Hdr_lims_flg = null;
	/**
	 * Last LIMS 前回ＬＩＭＳ.<p>
	 *
	 */
	public MCCheckBox Hdr_last_lims_flg = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Hdr_itm_p_PPanel;
	public MCTextField Hdr_itm_cd;	// [Hdr]の[itm_p.itm_cd]を[Hdr_itm_cd]としてエイリアス定義。
	public MCTextComboBox Hdr_itm_sub1;	// [Hdr]の[itm_p.itm_sub1]を[Hdr_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Hdr_itm_sub2;	// [Hdr]の[itm_p.itm_sub2]を[Hdr_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Hdr_itm_sub3;	// [Hdr]の[itm_p.itm_sub3]を[Hdr_itm_sub3]としてエイリアス定義。
	public MCTextField Hdr_itm_nm;	// [Hdr]の[itm_p.itm_nm]を[Hdr_itm_nm]としてエイリアス定義。
	public MCLabel Hdr_ver_no_Label = null;
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_ver_no = null;
	public mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H Hdr_lot_no_p_PPanel;
	public MCTextField Hdr_lot_no;	// [Hdr]の[lot_no_p.lot_no]を[Hdr_lot_no]としてエイリアス定義。
	public MCTextComboBox Hdr_sublot_no;	// [Hdr]の[lot_no_p.sublot_no]を[Hdr_sublot_no]としてエイリアス定義。
	public MCLabel Hdr_bp_lot_no_Label = null;
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_bp_lot_no = null;
	public MCLabel Hdr_loc_cd_Label = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCTextField Hdr_loc_nm = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_to_site_cd = null;
	public MCLabel Hdr_mfg_loc_cd_Label = null;
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCTextField Hdr_mfg_loc_nm = null;
	public MCLabel Hdr_sppl_cd_Label = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCTextField Hdr_sppl_nm = null;
	public MCLabel Hdr_maker_cd_Label = null;
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCTextField Hdr_maker_nm = null;
	public MCLabel Hdr_inst_dt_Label = null;
	/**
	 * Inspection order date 検査指図日.<p>
	 *
	 */
	public MCDateField Hdr_inst_dt = null;
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H Hdr_inst_usr_cd_p_PPanel;
	public MCTextField Hdr_inst_usr_cd;	// [Hdr]の[inst_usr_cd_p.usr_cd]を[Hdr_inst_usr_cd]としてエイリアス定義。
	public MCTextField Hdr_inst_usr_nm;	// [Hdr]の[inst_usr_cd_p.usr_nm]を[Hdr_inst_usr_nm]としてエイリアス定義。
	public MCTextComboBox Hdr_inst_dpt_cd;	// [Hdr]の[inst_usr_cd_p.dpt_cd]を[Hdr_inst_dpt_cd]としてエイリアス定義。
	public MCTextField Hdr_inst_dpt_nm;	// [Hdr]の[inst_usr_cd_p.dpt_nm]を[Hdr_inst_dpt_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H Hdr_st_dt_p_PPanel;
	public MCDateField Hdr_st_dt;	// [Hdr]の[st_dt_p.ymd]を[Hdr_st_dt]としてエイリアス定義。
	public MCDateField Hdr_st_hm;	// [Hdr]の[st_dt_p.hm]を[Hdr_st_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H Hdr_end_dt_p_PPanel;
	public MCDateField Hdr_end_dt;	// [Hdr]の[end_dt_p.ymd]を[Hdr_end_dt]としてエイリアス定義。
	public MCDateField Hdr_end_hm;	// [Hdr]の[end_dt_p.hm]を[Hdr_end_hm]としてエイリアス定義。
	public MCLabel Hdr_master_dt_Label = null;
	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDateField Hdr_master_dt = null;
	public MCLabel Hdr_insp_ptn_cd_Label = null;
	/**
	 * Inspection pattern 検査パタン.<p>
	 *
	 */
	public MCTextComboBox Hdr_insp_ptn_cd = null;
	/**
	 * Inspection pattern name 検査パタン名.<p>
	 *
	 */
	public MCTextField Hdr_insp_ptn_nm = null;
	public MCLabel Hdr_insp_mtd_typ_Label = null;
	/**
	 * Inspection method 検査方法.<p>
	 *
	 */
	public MCTextComboBox Hdr_insp_mtd_typ = null;
	/**
	 * Inspection method name 検査方法名.<p>
	 *
	 */
	public MCTextField Hdr_insp_mtd_typ_nm = null;
	public MCLabel Hdr_insp_std_no_Label = null;
	/**
	 * Specific inspection No. 規格書ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_insp_std_no = null;
	/**
	 * Specific inspection required 規格検査必須.<p>
	 *
	 */
	public MCCheckBox Hdr_std_req_flg = null;
	/**
	 * Check required 確認必須.<p>
	 *
	 */
	public MCCheckBox Hdr_std_cnf_req_flg = null;
	/**
	 * For factory release approval 工場出荷承認対象.<p>
	 *
	 */
	public MCCheckBox Hdr_plnt_aprv_flg = null;
	/**
	 * Sampling qty./times 抜取数／回.<p>
	 *
	 */
	public MCNumberField Hdr_spl_qty = null;
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H Hdr_base_unit_qty_p_PPanel;
	public MCNumberField Hdr_base_unit_qty;	// [Hdr]の[base_unit_qty_p.qty]を[Hdr_base_unit_qty]としてエイリアス定義。
	public MCLabel Hdr_base_unit_cd_Label = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCTextField Hdr_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_base_dec_place = null;
	public MCLabel Hdr_intr_rmrks_Label = null;
	/**
	 * Order internal remarks 指図内部備考.<p>
	 *
	 */
	public MCTextField Hdr_intr_rmrks = null;
	public MCLabel Hdr_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Hdr_sub_char1 = null;
	public MCLabel Hdr_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Hdr_sub_char2 = null;
	public MCLabel Hdr_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Hdr_sub_char3 = null;
	public MCLabel Hdr_ins_usr_id_Label = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCTextField Hdr_ins_usr_nm = null;
	public MCLabel Hdr_ins_func_id_Label = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCTextField Hdr_ins_func_nm = null;
	public MCLabel Hdr_upd_usr_id_Label = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCTextField Hdr_upd_usr_nm = null;
	public MCLabel Hdr_upd_func_id_Label = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCTextField Hdr_upd_func_nm = null;
	public MCLabel Hdr_ins_ts_Label = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestampField Hdr_ins_ts = null;
	public MCLabel Hdr_upd_ts_Label = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestampField Hdr_upd_ts = null;
	public MCLabel Hdr_upd_srv_req_no_Label = null;
	/**
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_upd_srv_req_no = null;
	public MCLabel Hdr_insp_aprv_sts_typ_Label = null;
	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_insp_aprv_sts_typ = null;
	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public MCTextField Hdr_insp_aprv_sts_typ_nm = null;
	/**
	 * For inspection approval 検査承認対象.<p>
	 *
	 */
	public MCCheckBox Hdr_insp_aprv_flg = null;
	public MCLabel Hdr_aprv_dt_Label = null;
	/**
	 * Approval date 承認日.<p>
	 *
	 */
	public MCDateField Hdr_aprv_dt = null;
	/**
	 * Approval date and time 承認日時.<p>
	 *
	 */
	public MCDateField Hdr_aprv_tm = null;
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H Hdr_aprv_usr_cd_p_PPanel;
	public MCTextField Hdr_aprv_usr_cd;	// [Hdr]の[aprv_usr_cd_p.usr_cd]を[Hdr_aprv_usr_cd]としてエイリアス定義。
	public MCTextField Hdr_aprv_usr_nm;	// [Hdr]の[aprv_usr_cd_p.usr_nm]を[Hdr_aprv_usr_nm]としてエイリアス定義。
	public MCTextComboBox Hdr_aprv_dpt_cd;	// [Hdr]の[aprv_usr_cd_p.dpt_cd]を[Hdr_aprv_dpt_cd]としてエイリアス定義。
	public MCTextField Hdr_aprv_dpt_nm;	// [Hdr]の[aprv_usr_cd_p.dpt_nm]を[Hdr_aprv_dpt_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H Hdr_aprv_rsn_p_PPanel;
	public MCTextComboBox Hdr_aprv_rsn;	// [Hdr]の[aprv_rsn_p.txt]を[Hdr_aprv_rsn]としてエイリアス定義。
	/**
	 * Current LIMS 今回ＬＩＭＳ.<p>
	 *
	 */
	public MCCheckBox Hdr_aprv_lims_flg = null;
	/**
	 * Last LIMS 前回ＬＩＭＳ.<p>
	 *
	 */
	public MCCheckBox Hdr_last_aprv_lims_flg = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumberField Hdr_upd_cntr = null;
	/**
	 * Inspection implementation unit type 検査実施単位区分.<p>
	 *
	 */
	public MCTextField Hdr_insp_bind_typ = null;
	/**
	 * Inspection pattern invalid flg. 検査パタン無効ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Hdr_is_invalid_insp_ptn_flg = null;
	/**
	 * Inspection report immediate issue 検査成績書即時発行.<p>
	 *
	 */
	public MCCheckBox Hdr_prnt_flg = null;
	// [SystemInfo]ブロック関連のField定義
	public MCPanel SystemInfoPanel = null;
	// [SystemInfo]ブロックの項目のField定義
	// [Aprv]ブロック関連のField定義
	public MCPanel AprvPanel = null;
	// [Aprv]ブロックの項目のField定義
	// [DtlTab]ブロック関連のField定義
	public MCPanel DtlTabPanel = null;
	public MCTabbedPane DtlTabTab = null;
	// [DtlTab]ブロックの項目のField定義
	// [DtlStd]ブロック関連のField定義
	public MCPanel DtlStdPanel = null;
	public MCScrollPane DtlStdScrollPane = null;
	public MCTable2<mcframe.clientMSBF.MSBFP0040.DtlStdR> DtlStdTable = null;
	// [DtlStd]ブロックの項目のField定義
	/**
	 * Inspection sequence 検査順序.<p>
	 *
	 */
	public MCColumnConfig columnDtlStd_insp_seq = null;
	/**
	 * Inspection checkpoint cd. 検査項目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlStd_insp_point_cd = null;
	/**
	 * Inspection checkpoint name 検査項目名.<p>
	 *
	 */
	public MCColumnConfig columnDtlStd_insp_point_nm = null;
	/**
	 * Qualitative/quantitative type 定性定量区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlStd_insp_qlqn_typ = null;
	/**
	 * Qualitative/quantitative type name 定性定量区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtlStd_insp_qlqn_typ_nm = null;
	/**
	 * Qualitative specific value 定性規格値.<p>
	 *
	 */
	public MCColumnConfig columnDtlStd_ql_std_val = null;
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlStd_trd_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtlStd_trd_unit_nm = null;
	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtlStd_qn_int_digit = null;
	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtlStd_qn_int_frac = null;
	public mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D DtlStd_qn_out_min_p_PPanel;
	public MCColumnConfig columnDtlStd_qn_out_min;// [DtlStd]の[qn_out_min_p.qn_insp_val]を[columnDtlStd_qn_out_min]としてエイリアス定義。
	/**
	 * Sign type (Lower limit of external specification) 外規格下限符号区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlStd_sign_out_min_typ = null;
	/**
	 * Sign type name (Lower limit of external specification) 外規格下限符号区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtlStd_sign_out_min_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D DtlStd_qn_in_min_p_PPanel;
	public MCColumnConfig columnDtlStd_qn_in_min;// [DtlStd]の[qn_in_min_p.qn_insp_val]を[columnDtlStd_qn_in_min]としてエイリアス定義。
	/**
	 * Sign type (Lower limit of internal specification) 内規格下限符号区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlStd_sign_in_min_typ = null;
	/**
	 * Sign type name (Lower limit of internal specification) 内規格下限符号区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtlStd_sign_in_min_typ_nm = null;
	/**
	 * Sign type (Upper limit of internal specification) 内規格上限符号区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlStd_sign_in_max_typ = null;
	/**
	 * Sign type name (Upper limit of internal specification) 内規格上限符号区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtlStd_sign_in_max_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D DtlStd_qn_in_max_p_PPanel;
	public MCColumnConfig columnDtlStd_qn_in_max;// [DtlStd]の[qn_in_max_p.qn_insp_val]を[columnDtlStd_qn_in_max]としてエイリアス定義。
	/**
	 * Sign type (Upper limit of external specification) 外規格上限符号区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlStd_sign_out_max_typ = null;
	/**
	 * Sign type name (Upper limit of external specification) 外規格上限符号区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtlStd_sign_out_max_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D DtlStd_qn_out_max_p_PPanel;
	public MCColumnConfig columnDtlStd_qn_out_max;// [DtlStd]の[qn_out_max_p.qn_insp_val]を[columnDtlStd_qn_out_max]としてエイリアス定義。
	/**
	 * Order internal remarks 指図内部備考.<p>
	 *
	 */
	public MCColumnConfig columnDtlStd_intr_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtlStd_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtlStd_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtlStd_sub_char3 = null;
	/**
	 * Specific inspection order No. 規格検査指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlStd_std_insp_inst_no = null;
	/**
	 * Additional column 追加項目.<p>
	 *
	 */
	public MCColumnConfig columnDtlStd_add_point_flg = null;
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlStd_data_crud_typ = null;
	// [DtlSchd]ブロック関連のField定義
	public MCPanel DtlSchdPanel = null;
	public MCScrollPane DtlSchdScrollPane = null;
	public MCTable2<mcframe.clientMSBF.MSBFP0040.DtlSchdR> DtlSchdTable = null;
	// [DtlSchd]ブロックの項目のField定義
	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_insp_schd_no = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlSchd_pack_unit_qty_p_PPanel;
	public MCColumnConfig columnDtlSchd_pack_unit_qty;// [DtlSchd]の[pack_unit_qty_p.qty]を[columnDtlSchd_pack_unit_qty]としてエイリアス定義。
	/**
	 * SKU cd. 荷姿ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_pack_unit_cd = null;
	/**
	 * SKU name 荷姿名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_pack_unit_nm = null;
	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_pack_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlSchd_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDtlSchd_base_unit_qty;// [DtlSchd]の[base_unit_qty_p.qty]を[columnDtlSchd_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlSchd_smpl_schd_qty_p_PPanel;
	public MCColumnConfig columnDtlSchd_smpl_schd_qty;// [DtlSchd]の[smpl_schd_qty_p.qty]を[columnDtlSchd_smpl_schd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlSchd_smpl_inst_qty_p_PPanel;
	public MCColumnConfig columnDtlSchd_smpl_inst_qty;// [DtlSchd]の[smpl_inst_qty_p.qty]を[columnDtlSchd_smpl_inst_qty]としてエイリアス定義。
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_base_dec_place = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_loc_nm = null;
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_str_ln_cd = null;
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_str_ln_nm = null;
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_gd_nm = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D DtlSchd_st_dt_p_PPanel;
	public MCColumnConfig columnDtlSchd_st_dt;// [DtlSchd]の[st_dt_p.ymd]を[columnDtlSchd_st_dt]としてエイリアス定義。
	public MCColumnConfig columnDtlSchd_st_hm;// [DtlSchd]の[st_dt_p.hm]を[columnDtlSchd_st_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D DtlSchd_end_dt_p_PPanel;
	public MCColumnConfig columnDtlSchd_end_dt;// [DtlSchd]の[end_dt_p.ymd]を[columnDtlSchd_end_dt]としてエイリアス定義。
	public MCColumnConfig columnDtlSchd_end_hm;// [DtlSchd]の[end_dt_p.hm]を[columnDtlSchd_end_hm]としてエイリアス定義。
	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_master_dt = null;
	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_insp_cnt_rmrks = null;
	/**
	 * Source No. 1 作成元ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_src_no1 = null;
	/**
	 * Source No. 2 作成元ＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_src_no2 = null;
	/**
	 * Source No. 3 作成元ＮＯ３.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_src_no3 = null;
	/**
	 * Source No. 4 作成元ＮＯ４.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_src_no4 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_upd_ts = null;
	/**
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_upd_srv_req_no = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSchd_upd_cntr = null;
	public MCColumnConfig columnDtlSchd_insp_inst_issue_typ = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Inspection report 検査成績書.<p>
	 *
	 */
	public MCButton Btn_prnt = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Btn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Btn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Btn_rcopy = null;
	/**
	 * Inspection report immediate issue 検査成績書即時発行.<p>
	 *
	 */
	public MCCheckBox Btn_prnt_flg = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_ins = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del = null;
	/**
	 * Approve 承認する.<p>
	 *
	 */
	public MCButton Btn_upd_aprv = null;
	/**
	 * Cancel approval 承認を取り消す.<p>
	 *
	 */
	public MCButton Btn_del_aprv = null;
	// [AprvItm]ブロック関連のField定義
	public MCPanel AprvItmPanel = null;
	// [AprvItm]ブロックの項目のField定義
	// [AprvBtn]ブロック関連のField定義
	public MCPanel AprvBtnPanel = null;
	// [AprvBtn]ブロックの項目のField定義
	// [AprvEastBtn]ブロック関連のField定義
	public MCPanel AprvEastBtnPanel = null;
	// [AprvEastBtn]ブロックの項目のField定義
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [FIX_I]モードを表す定数 */
	public static final String FIX_I = "FIX_I";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [UPD_APRV]モードを表す定数 */
	public static final String UPD_APRV = "UPD_APRV";
	/** [FIX_U_A]モードを表す定数 */
	public static final String FIX_U_A = "FIX_U_A";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [FIX_D]モードを表す定数 */
	public static final String FIX_D = "FIX_D";
	/** [DEL_APRV]モードを表す定数 */
	public static final String DEL_APRV = "DEL_APRV";
	/** [FIX_D_A]モードを表す定数 */
	public static final String FIX_D_A = "FIX_D_A";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, INS, FIX_I, UPD, FIX_U, UPD_APRV, FIX_U_A, DEL, FIX_D, DEL_APRV, FIX_D_A, REF};
	
	/** [MS_MSBFL0040_Srch01]のCallerの作成 */
	protected MSBFP_InspInstReg_MC.MS_MSBFL0040_Srch01Caller createMS_MSBFL0040_Srch01() {
		MSBFP_InspInstReg_MC.MS_MSBFL0040_Srch01Caller<MSBFP_InspInstReg, MS_MSBFL0040_Srch01Bridge>
		caller = ((MSBFP_InspInstReg_MC)this).new MS_MSBFL0040_Srch01Caller<MSBFP_InspInstReg, MS_MSBFL0040_Srch01Bridge>(
					(MSBFP_InspInstReg)this, new MS_MSBFL0040_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBFL0040_Srch01]の呼び出し */
	protected void callMS_MSBFL0040_Srch01() {
		MCCaller caller = createMS_MSBFL0040_Srch01();
		caller.exec();
	}
	/** [MS_MSBFL0040_Srch02]のCallerの作成 */
	protected MSBFP_InspInstReg_MC.MS_MSBFL0040_Srch02Caller createMS_MSBFL0040_Srch02() {
		MSBFP_InspInstReg_MC.MS_MSBFL0040_Srch02Caller<MSBFP_InspInstReg, MS_MSBFL0040_Srch02Bridge>
		caller = ((MSBFP_InspInstReg_MC)this).new MS_MSBFL0040_Srch02Caller<MSBFP_InspInstReg, MS_MSBFL0040_Srch02Bridge>(
					(MSBFP_InspInstReg)this, new MS_MSBFL0040_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBFL0040_Srch02]の呼び出し */
	protected void callMS_MSBFL0040_Srch02() {
		MCCaller caller = createMS_MSBFL0040_Srch02();
		caller.exec();
	}
	/** [MS_MSBFL0040_Srch03]のCallerの作成 */
	protected MSBFP_InspInstReg_MC.MS_MSBFL0040_Srch03Caller createMS_MSBFL0040_Srch03() {
		MSBFP_InspInstReg_MC.MS_MSBFL0040_Srch03Caller<MSBFP_InspInstReg, MS_MSBFL0040_Srch03Bridge>
		caller = ((MSBFP_InspInstReg_MC)this).new MS_MSBFL0040_Srch03Caller<MSBFP_InspInstReg, MS_MSBFL0040_Srch03Bridge>(
					(MSBFP_InspInstReg)this, new MS_MSBFL0040_Srch03Bridge());
		return caller;
	}
	/** [MS_MSBFL0040_Srch03]の呼び出し */
	protected void callMS_MSBFL0040_Srch03() {
		MCCaller caller = createMS_MSBFL0040_Srch03();
		caller.exec();
	}
	/** [MS_MSBFL0040_Srch04]のCallerの作成 */
	protected MSBFP_InspInstReg_MC.MS_MSBFL0040_Srch04Caller createMS_MSBFL0040_Srch04() {
		MSBFP_InspInstReg_MC.MS_MSBFL0040_Srch04Caller<MSBFP_InspInstReg, MS_MSBFL0040_Srch04Bridge>
		caller = ((MSBFP_InspInstReg_MC)this).new MS_MSBFL0040_Srch04Caller<MSBFP_InspInstReg, MS_MSBFL0040_Srch04Bridge>(
					(MSBFP_InspInstReg)this, new MS_MSBFL0040_Srch04Bridge());
		return caller;
	}
	/** [MS_MSBFL0040_Srch04]の呼び出し */
	protected void callMS_MSBFL0040_Srch04() {
		MCCaller caller = createMS_MSBFL0040_Srch04();
		caller.exec();
	}
	/** [MS_MSBFL0040_Ins01]のCallerの作成 */
	protected MSBFP_InspInstReg_MC.MS_MSBFL0040_Ins01Caller createMS_MSBFL0040_Ins01() {
		MSBFP_InspInstReg_MC.MS_MSBFL0040_Ins01Caller<MSBFP_InspInstReg, MS_MSBFL0040_Ins01Bridge>
		caller = ((MSBFP_InspInstReg_MC)this).new MS_MSBFL0040_Ins01Caller<MSBFP_InspInstReg, MS_MSBFL0040_Ins01Bridge>(
					(MSBFP_InspInstReg)this, new MS_MSBFL0040_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBFL0040_Ins01]の呼び出し */
	protected void callMS_MSBFL0040_Ins01() {
		MCCaller caller = createMS_MSBFL0040_Ins01();
		caller.exec();
	}
	/** [MS_MSBFL0040_Upd01]のCallerの作成 */
	protected MSBFP_InspInstReg_MC.MS_MSBFL0040_Upd01Caller createMS_MSBFL0040_Upd01() {
		MSBFP_InspInstReg_MC.MS_MSBFL0040_Upd01Caller<MSBFP_InspInstReg, MS_MSBFL0040_Upd01Bridge>
		caller = ((MSBFP_InspInstReg_MC)this).new MS_MSBFL0040_Upd01Caller<MSBFP_InspInstReg, MS_MSBFL0040_Upd01Bridge>(
					(MSBFP_InspInstReg)this, new MS_MSBFL0040_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBFL0040_Upd01]の呼び出し */
	protected void callMS_MSBFL0040_Upd01() {
		MCCaller caller = createMS_MSBFL0040_Upd01();
		caller.exec();
	}
	/** [MS_MSBFL0040_Upd02]のCallerの作成 */
	protected MSBFP_InspInstReg_MC.MS_MSBFL0040_Upd02Caller createMS_MSBFL0040_Upd02() {
		MSBFP_InspInstReg_MC.MS_MSBFL0040_Upd02Caller<MSBFP_InspInstReg, MS_MSBFL0040_Upd02Bridge>
		caller = ((MSBFP_InspInstReg_MC)this).new MS_MSBFL0040_Upd02Caller<MSBFP_InspInstReg, MS_MSBFL0040_Upd02Bridge>(
					(MSBFP_InspInstReg)this, new MS_MSBFL0040_Upd02Bridge());
		return caller;
	}
	/** [MS_MSBFL0040_Upd02]の呼び出し */
	protected void callMS_MSBFL0040_Upd02() {
		MCCaller caller = createMS_MSBFL0040_Upd02();
		caller.exec();
	}
	/** [MS_MSBFL0040_Del01]のCallerの作成 */
	protected MSBFP_InspInstReg_MC.MS_MSBFL0040_Del01Caller createMS_MSBFL0040_Del01() {
		MSBFP_InspInstReg_MC.MS_MSBFL0040_Del01Caller<MSBFP_InspInstReg, MS_MSBFL0040_Del01Bridge>
		caller = ((MSBFP_InspInstReg_MC)this).new MS_MSBFL0040_Del01Caller<MSBFP_InspInstReg, MS_MSBFL0040_Del01Bridge>(
					(MSBFP_InspInstReg)this, new MS_MSBFL0040_Del01Bridge());
		return caller;
	}
	/** [MS_MSBFL0040_Del01]の呼び出し */
	protected void callMS_MSBFL0040_Del01() {
		MCCaller caller = createMS_MSBFL0040_Del01();
		caller.exec();
	}
	/** [MS_MSBFL0040_Del02]のCallerの作成 */
	protected MSBFP_InspInstReg_MC.MS_MSBFL0040_Del02Caller createMS_MSBFL0040_Del02() {
		MSBFP_InspInstReg_MC.MS_MSBFL0040_Del02Caller<MSBFP_InspInstReg, MS_MSBFL0040_Del02Bridge>
		caller = ((MSBFP_InspInstReg_MC)this).new MS_MSBFL0040_Del02Caller<MSBFP_InspInstReg, MS_MSBFL0040_Del02Bridge>(
					(MSBFP_InspInstReg)this, new MS_MSBFL0040_Del02Bridge());
		return caller;
	}
	/** [MS_MSBFL0040_Del02]の呼び出し */
	protected void callMS_MSBFL0040_Del02() {
		MCCaller caller = createMS_MSBFL0040_Del02();
		caller.exec();
	}
	/** [MS_MSBFL0040_Prnt01]のCallerの作成 */
	protected MSBFP_InspInstReg_MC.MS_MSBFL0040_Prnt01Caller createMS_MSBFL0040_Prnt01() {
		MSBFP_InspInstReg_MC.MS_MSBFL0040_Prnt01Caller<MSBFP_InspInstReg, MS_MSBFL0040_Prnt01Bridge>
		caller = ((MSBFP_InspInstReg_MC)this).new MS_MSBFL0040_Prnt01Caller<MSBFP_InspInstReg, MS_MSBFL0040_Prnt01Bridge>(
					(MSBFP_InspInstReg)this, new MS_MSBFL0040_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBFL0040_Prnt01]の呼び出し */
	protected void callMS_MSBFL0040_Prnt01() {
		MCCaller caller = createMS_MSBFL0040_Prnt01();
		caller.exec();
	}
	/** [CndSchd]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBF.MSBFP0040.CndSchdR> aCndSchdL;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0040.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0040.HdrR aHdrR;
	/** [DtlStd]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR> aDtlStdL;
	/** [DtlSchd]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBF.MSBFP0040.DtlSchdR> aDtlSchdL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0040.BtnR aBtnR;

	/**
	 * コピーによってaCndSchdLを設定します。
	 *
	 * aCndSchdLのインスタンスは変更されません。
	 *
	 * @param dataset CndSchdL
	 */
	public void setCndSchdL(MCList<mcframe.clientMSBF.MSBFP0040.CndSchdR> aList) {
		if (getCndSchdL() != aList) {
			getCndSchdL().setAll(aList);
		}
	}

	/**
	 * [CndSchd]ブロックのコンテナaCndSchdLを返します。
	 *
	 * @return CndSchdL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0040.CndSchdR> getCndSchdL() {
		return aCndSchdL;
	}

	/**
	 * aCndSchdRを作成します。
	 *
	 * @return CndSchdR
	 */
	public mcframe.clientMSBF.MSBFP0040.CndSchdR createCndSchdR() {
		return mcframe.clientMSBF.MSBFP0040.CndSchdR.create();
	}

	/**
	 * aCndSchdLを作成します。
	 *
	 * @return CndSchdL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0040.CndSchdR> createCndSchdL() {
		return MCList.create(mcframe.clientMSBF.MSBFP0040.CndSchdR.class);
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBF.MSBFP0040.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBF.MSBFP0040.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBF.MSBFP0040.CndR createCndR() {
		return mcframe.clientMSBF.MSBFP0040.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBF.MSBFP0040.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBF.MSBFP0040.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBF.MSBFP0040.HdrR createHdrR() {
		return mcframe.clientMSBF.MSBFP0040.HdrR.create();
	}

	/**
	 * コピーによってaDtlStdLを設定します。
	 *
	 * aDtlStdLのインスタンスは変更されません。
	 *
	 * @param dataset DtlStdL
	 */
	public void setDtlStdL(MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR> aList) {
		if (getDtlStdL() != aList) {
			getDtlStdL().setAll(aList);
		}
	}

	/**
	 * [DtlStd]ブロックのコンテナaDtlStdLを返します。
	 *
	 * @return DtlStdL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR> getDtlStdL() {
		return aDtlStdL;
	}

	/**
	 * aDtlStdRを作成します。
	 *
	 * @return DtlStdR
	 */
	public mcframe.clientMSBF.MSBFP0040.DtlStdR createDtlStdR() {
		return mcframe.clientMSBF.MSBFP0040.DtlStdR.create();
	}

	/**
	 * aDtlStdLを作成します。
	 *
	 * @return DtlStdL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR> createDtlStdL() {
		return MCList.create(mcframe.clientMSBF.MSBFP0040.DtlStdR.class);
	}

	/**
	 * DtlStdTableを初期化します。
	 */
	protected void createDtlStdTable(){
		if(DtlStdTable == null){
			DtlStdTable = beansFactory.createTable2("DtlStd.table");
		}
	}

	/**
	 * コピーによってaDtlSchdLを設定します。
	 *
	 * aDtlSchdLのインスタンスは変更されません。
	 *
	 * @param dataset DtlSchdL
	 */
	public void setDtlSchdL(MCList<mcframe.clientMSBF.MSBFP0040.DtlSchdR> aList) {
		if (getDtlSchdL() != aList) {
			getDtlSchdL().setAll(aList);
		}
	}

	/**
	 * [DtlSchd]ブロックのコンテナaDtlSchdLを返します。
	 *
	 * @return DtlSchdL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0040.DtlSchdR> getDtlSchdL() {
		return aDtlSchdL;
	}

	/**
	 * aDtlSchdRを作成します。
	 *
	 * @return DtlSchdR
	 */
	public mcframe.clientMSBF.MSBFP0040.DtlSchdR createDtlSchdR() {
		return mcframe.clientMSBF.MSBFP0040.DtlSchdR.create();
	}

	/**
	 * aDtlSchdLを作成します。
	 *
	 * @return DtlSchdL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0040.DtlSchdR> createDtlSchdL() {
		return MCList.create(mcframe.clientMSBF.MSBFP0040.DtlSchdR.class);
	}

	/**
	 * DtlSchdTableを初期化します。
	 */
	protected void createDtlSchdTable(){
		if(DtlSchdTable == null){
			DtlSchdTable = beansFactory.createTable2("DtlSchd.table");
		}
	}

	/**
	 * 項目コピーによってaBtnRを設定します。
	 *
	 * aBtnRのインスタンスは変更されません。
	 *
	 * @param row BtnR
	 */
	public void setBtnR(mcframe.clientMSBF.MSBFP0040.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBF.MSBFP0040.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBF.MSBFP0040.BtnR createBtnR() {
		return mcframe.clientMSBF.MSBFP0040.BtnR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndSchdL())) ret.add(getCndSchdL());
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
		if(!MCCollectionUtil.contains(ret, getDtlStdL())) ret.add(getDtlStdL());
		if(!MCCollectionUtil.contains(ret, getDtlSchdL())) ret.add(getDtlSchdL());
		if(!MCCollectionUtil.contains(ret, getBtnR())) ret.add(getBtnR());
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
		if(aCnt == getCndSchdL()) return "CndSchd";
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getHdrR()) return "Hdr";
		if(aCnt == getDtlStdL()) return "DtlStd";
		if(aCnt == getDtlSchdL()) return "DtlSchd";
		if(aCnt == getBtnR()) return "Btn";
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
		if(bId.equals("CndSchd")) return getCndSchdL();
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("Hdr")) return getHdrR();
		if(bId.equals("DtlStd")) return getDtlStdL();
		if(bId.equals("DtlSchd")) return getDtlSchdL();
		if(bId.equals("Btn")) return getBtnR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(ScreenOpePanel);
		ret.add(CndPanel);
		ret.add(HdrTabPanel);
		ret.add(HdrPanel);
		ret.add(SystemInfoPanel);
		ret.add(AprvPanel);
		ret.add(DtlTabPanel);
		ret.add(DtlStdPanel);
		ret.add(DtlSchdPanel);
		ret.add(BtnPanel);
		ret.add(AprvItmPanel);
		ret.add(AprvBtnPanel);
		ret.add(AprvEastBtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBFP_InspInstReg_MC_A() {
		aCndSchdL = createCndSchdL();
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlStdL = createDtlStdL();
		aDtlSchdL = createDtlSchdL();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBFP_InspInstReg_MC_A(String name) {
		aCndSchdL = createCndSchdL();
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlStdL = createDtlStdL();
		createDtlStdTable();
		DtlStdTable.setRowName(name);
		aDtlSchdL = createDtlSchdL();
		createDtlSchdTable();
		DtlSchdTable.setRowName(name);
		aBtnR = createBtnR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBFP_InspInstReg_MC.jbCreateScreenOpe((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbCreateCnd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbCreateHdrTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbCreateHdr((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbCreateSystemInfo((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbCreateAprv((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbCreateDtlTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbCreateDtlStd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbCreateDtlSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbCreateBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbCreateAprvItm((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbCreateAprvBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbCreateAprvEastBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbCreateEastBtn((MSBFP_InspInstReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBFP_InspInstReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBFP_InspInstReg p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBFP_InspInstReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBFP_InspInstReg p) {
		p.Hdr_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getHdrR().itm_p());
		p.Hdr_itm_p_PPanel.setName("Hdr.itm_p");
		p.Hdr_itm_cd = p.Hdr_itm_p_PPanel.Itm_itm_cd;
		p.Hdr_itm_cd.addAliasName("Hdr.itm_cd", p);
		p.Hdr_itm_sub1 = p.Hdr_itm_p_PPanel.Itm_itm_sub1;
		p.Hdr_itm_sub1.addAliasName("Hdr.itm_sub1", p);
		p.Hdr_itm_sub2 = p.Hdr_itm_p_PPanel.Itm_itm_sub2;
		p.Hdr_itm_sub2.addAliasName("Hdr.itm_sub2", p);
		p.Hdr_itm_sub3 = p.Hdr_itm_p_PPanel.Itm_itm_sub3;
		p.Hdr_itm_sub3.addAliasName("Hdr.itm_sub3", p);
		p.Hdr_itm_nm = p.Hdr_itm_p_PPanel.Itm_itm_nm;
		p.Hdr_itm_nm.addAliasName("Hdr.itm_nm", p);
		p.Hdr_lot_no_p_PPanel = mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.create(p.getHdrR().lot_no_p());
		p.Hdr_lot_no_p_PPanel.setName("Hdr.lot_no_p");
		p.Hdr_lot_no = p.Hdr_lot_no_p_PPanel.LotNo_lot_no;
		p.Hdr_lot_no.addAliasName("Hdr.lot_no", p);
		p.Hdr_sublot_no = p.Hdr_lot_no_p_PPanel.LotNo_sublot_no;
		p.Hdr_sublot_no.addAliasName("Hdr.sublot_no", p);
		p.Hdr_inst_usr_cd_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getHdrR().inst_usr_cd_p());
		p.Hdr_inst_usr_cd_p_PPanel.setName("Hdr.inst_usr_cd_p");
		p.Hdr_inst_usr_cd = p.Hdr_inst_usr_cd_p_PPanel.UsrDpt_usr_cd;
		p.Hdr_inst_usr_cd.addAliasName("Hdr.inst_usr_cd", p);
		p.Hdr_inst_usr_nm = p.Hdr_inst_usr_cd_p_PPanel.UsrDpt_usr_nm;
		p.Hdr_inst_usr_nm.addAliasName("Hdr.inst_usr_nm", p);
		p.Hdr_inst_dpt_cd = p.Hdr_inst_usr_cd_p_PPanel.UsrDpt_dpt_cd;
		p.Hdr_inst_dpt_cd.addAliasName("Hdr.inst_dpt_cd", p);
		p.Hdr_inst_dpt_nm = p.Hdr_inst_usr_cd_p_PPanel.UsrDpt_dpt_nm;
		p.Hdr_inst_dpt_nm.addAliasName("Hdr.inst_dpt_nm", p);
		p.Hdr_st_dt_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getHdrR().st_dt_p());
		p.Hdr_st_dt_p_PPanel.setName("Hdr.st_dt_p");
		p.Hdr_st_dt = p.Hdr_st_dt_p_PPanel.YmdHm_ymd;
		p.Hdr_st_dt.addAliasName("Hdr.st_dt", p);
		p.Hdr_st_hm = p.Hdr_st_dt_p_PPanel.YmdHm_hm;
		p.Hdr_st_hm.addAliasName("Hdr.st_hm", p);
		p.Hdr_end_dt_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getHdrR().end_dt_p());
		p.Hdr_end_dt_p_PPanel.setName("Hdr.end_dt_p");
		p.Hdr_end_dt = p.Hdr_end_dt_p_PPanel.YmdHm_ymd;
		p.Hdr_end_dt.addAliasName("Hdr.end_dt", p);
		p.Hdr_end_hm = p.Hdr_end_dt_p_PPanel.YmdHm_hm;
		p.Hdr_end_hm.addAliasName("Hdr.end_hm", p);
		p.Hdr_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getHdrR().base_unit_qty_p());
		p.Hdr_base_unit_qty_p_PPanel.setName("Hdr.base_unit_qty_p");
		p.Hdr_base_unit_qty = p.Hdr_base_unit_qty_p_PPanel.Qty_qty;
		p.Hdr_base_unit_qty.addAliasName("Hdr.base_unit_qty", p);
		p.Hdr_aprv_usr_cd_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getHdrR().aprv_usr_cd_p());
		p.Hdr_aprv_usr_cd_p_PPanel.setName("Hdr.aprv_usr_cd_p");
		p.Hdr_aprv_usr_cd = p.Hdr_aprv_usr_cd_p_PPanel.UsrDpt_usr_cd;
		p.Hdr_aprv_usr_cd.addAliasName("Hdr.aprv_usr_cd", p);
		p.Hdr_aprv_usr_nm = p.Hdr_aprv_usr_cd_p_PPanel.UsrDpt_usr_nm;
		p.Hdr_aprv_usr_nm.addAliasName("Hdr.aprv_usr_nm", p);
		p.Hdr_aprv_dpt_cd = p.Hdr_aprv_usr_cd_p_PPanel.UsrDpt_dpt_cd;
		p.Hdr_aprv_dpt_cd.addAliasName("Hdr.aprv_dpt_cd", p);
		p.Hdr_aprv_dpt_nm = p.Hdr_aprv_usr_cd_p_PPanel.UsrDpt_dpt_nm;
		p.Hdr_aprv_dpt_nm.addAliasName("Hdr.aprv_dpt_nm", p);
		p.Hdr_aprv_rsn_p_PPanel = mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.create(p.getHdrR().aprv_rsn_p());
		p.Hdr_aprv_rsn_p_PPanel.setName("Hdr.aprv_rsn_p");
		p.Hdr_aprv_rsn = p.Hdr_aprv_rsn_p_PPanel.Txt_txt;
		p.Hdr_aprv_rsn.addAliasName("Hdr.aprv_rsn", p);
	}

	/**
	 * [SystemInfo]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSystemInfo(MSBFP_InspInstReg p) {
	}

	/**
	 * [Aprv]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAprv(MSBFP_InspInstReg p) {
	}

	/**
	 * [DtlTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlTab(MSBFP_InspInstReg p) {
	}

	/**
	 * [DtlStd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlStd(MSBFP_InspInstReg p) {
		p.DtlStd_qn_out_min_p_PPanel = mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.create(mcframe.clientMSBF.MSBFP0040.DtlStdR.$qn_out_min_p);
		p.DtlStd_qn_out_min_p_PPanel.setName("DtlStd.qn_out_min_p");
		p.columnDtlStd_qn_out_min = p.DtlStd_qn_out_min_p_PPanel.columnQnInspVal_qn_insp_val;
		p.columnDtlStd_qn_out_min.addAliasName("DtlStd.qn_out_min", p);
		p.DtlStd_qn_in_min_p_PPanel = mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.create(mcframe.clientMSBF.MSBFP0040.DtlStdR.$qn_in_min_p);
		p.DtlStd_qn_in_min_p_PPanel.setName("DtlStd.qn_in_min_p");
		p.columnDtlStd_qn_in_min = p.DtlStd_qn_in_min_p_PPanel.columnQnInspVal_qn_insp_val;
		p.columnDtlStd_qn_in_min.addAliasName("DtlStd.qn_in_min", p);
		p.DtlStd_qn_in_max_p_PPanel = mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.create(mcframe.clientMSBF.MSBFP0040.DtlStdR.$qn_in_max_p);
		p.DtlStd_qn_in_max_p_PPanel.setName("DtlStd.qn_in_max_p");
		p.columnDtlStd_qn_in_max = p.DtlStd_qn_in_max_p_PPanel.columnQnInspVal_qn_insp_val;
		p.columnDtlStd_qn_in_max.addAliasName("DtlStd.qn_in_max", p);
		p.DtlStd_qn_out_max_p_PPanel = mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.create(mcframe.clientMSBF.MSBFP0040.DtlStdR.$qn_out_max_p);
		p.DtlStd_qn_out_max_p_PPanel.setName("DtlStd.qn_out_max_p");
		p.columnDtlStd_qn_out_max = p.DtlStd_qn_out_max_p_PPanel.columnQnInspVal_qn_insp_val;
		p.columnDtlStd_qn_out_max.addAliasName("DtlStd.qn_out_max", p);
	}

	/**
	 * [DtlSchd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlSchd(MSBFP_InspInstReg p) {
		p.DtlSchd_pack_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBF.MSBFP0040.DtlSchdR.$pack_unit_qty_p);
		p.DtlSchd_pack_unit_qty_p_PPanel.setName("DtlSchd.pack_unit_qty_p");
		p.columnDtlSchd_pack_unit_qty = p.DtlSchd_pack_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtlSchd_pack_unit_qty.addAliasName("DtlSchd.pack_unit_qty", p);
		p.DtlSchd_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBF.MSBFP0040.DtlSchdR.$base_unit_qty_p);
		p.DtlSchd_base_unit_qty_p_PPanel.setName("DtlSchd.base_unit_qty_p");
		p.columnDtlSchd_base_unit_qty = p.DtlSchd_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtlSchd_base_unit_qty.addAliasName("DtlSchd.base_unit_qty", p);
		p.DtlSchd_smpl_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBF.MSBFP0040.DtlSchdR.$smpl_schd_qty_p);
		p.DtlSchd_smpl_schd_qty_p_PPanel.setName("DtlSchd.smpl_schd_qty_p");
		p.columnDtlSchd_smpl_schd_qty = p.DtlSchd_smpl_schd_qty_p_PPanel.columnQty_qty;
		p.columnDtlSchd_smpl_schd_qty.addAliasName("DtlSchd.smpl_schd_qty", p);
		p.DtlSchd_smpl_inst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBF.MSBFP0040.DtlSchdR.$smpl_inst_qty_p);
		p.DtlSchd_smpl_inst_qty_p_PPanel.setName("DtlSchd.smpl_inst_qty_p");
		p.columnDtlSchd_smpl_inst_qty = p.DtlSchd_smpl_inst_qty_p_PPanel.columnQty_qty;
		p.columnDtlSchd_smpl_inst_qty.addAliasName("DtlSchd.smpl_inst_qty", p);
		p.DtlSchd_st_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBF.MSBFP0040.DtlSchdR.$st_dt_p);
		p.DtlSchd_st_dt_p_PPanel.setName("DtlSchd.st_dt_p");
		p.columnDtlSchd_st_dt = p.DtlSchd_st_dt_p_PPanel.columnYmdHm_ymd;
		p.columnDtlSchd_st_dt.addAliasName("DtlSchd.st_dt", p);
		p.columnDtlSchd_st_hm = p.DtlSchd_st_dt_p_PPanel.columnYmdHm_hm;
		p.columnDtlSchd_st_hm.addAliasName("DtlSchd.st_hm", p);
		p.DtlSchd_end_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBF.MSBFP0040.DtlSchdR.$end_dt_p);
		p.DtlSchd_end_dt_p_PPanel.setName("DtlSchd.end_dt_p");
		p.columnDtlSchd_end_dt = p.DtlSchd_end_dt_p_PPanel.columnYmdHm_ymd;
		p.columnDtlSchd_end_dt.addAliasName("DtlSchd.end_dt", p);
		p.columnDtlSchd_end_hm = p.DtlSchd_end_dt_p_PPanel.columnYmdHm_hm;
		p.columnDtlSchd_end_hm.addAliasName("DtlSchd.end_hm", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBFP_InspInstReg p) {
	}

	/**
	 * [AprvItm]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAprvItm(MSBFP_InspInstReg p) {
	}

	/**
	 * [AprvBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAprvBtn(MSBFP_InspInstReg p) {
	}

	/**
	 * [AprvEastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAprvEastBtn(MSBFP_InspInstReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBFP_InspInstReg p) {
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

	
	/** [Cnd_srch_tgt_typ_nm_ListPutter]の定義 */
	private MCListPutter Cnd_srch_tgt_typ_nm_p = null;

	/**
	 * [Cnd_srch_tgt_typ_nm_ListPutter]の取得
	 */
	protected MCListPutter getCnd_srch_tgt_typ_nm_ListPutter() {
		if (Cnd_srch_tgt_typ_nm_p == null) {
			Cnd_srch_tgt_typ_nm_p = createCnd_srch_tgt_typ_nm_ListPutter(Cnd_srch_tgt_typ_nm, "srch_tgt_typ_nm");

		}
		return Cnd_srch_tgt_typ_nm_p;
	}
	
	
	/** [Hdr_inst_usr_cd_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Hdr_inst_usr_cd_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [Hdr_inst_usr_cd_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_inst_usr_cd_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (Hdr_inst_usr_cd_p_PPanel_UsrDpt_dpt_cd_p == null) {
			Hdr_inst_usr_cd_p_PPanel_UsrDpt_dpt_cd_p = createHdr_inst_usr_cd_p_PPanel_UsrDpt_dpt_cd_ListPutter(Hdr_inst_usr_cd_p_PPanel.UsrDpt_dpt_cd, "inst_dpt_cd", "inst_dpt_nm");
		}
		return Hdr_inst_usr_cd_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [Hdr_insp_ptn_cd_ListPutter]の定義 */
	private MCListPutter Hdr_insp_ptn_cd_p = null;

	/**
	 * [Hdr_insp_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_insp_ptn_cd_ListPutter() {
		if (Hdr_insp_ptn_cd_p == null) {
			Hdr_insp_ptn_cd_p = createHdr_insp_ptn_cd_ListPutter(Hdr_insp_ptn_cd, "insp_ptn_cd", "insp_ptn_nm");

		}
		return Hdr_insp_ptn_cd_p;
	}
	
	
	/** [Hdr_insp_mtd_typ_ListPutter]の定義 */
	private MCListPutter Hdr_insp_mtd_typ_p = null;

	/**
	 * [Hdr_insp_mtd_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_insp_mtd_typ_ListPutter() {
		if (Hdr_insp_mtd_typ_p == null) {
			Hdr_insp_mtd_typ_p = createHdr_insp_mtd_typ_ListPutter(Hdr_insp_mtd_typ, "insp_mtd_typ", "insp_mtd_typ_nm");

		}
		return Hdr_insp_mtd_typ_p;
	}
	
	
	/** [Hdr_insp_aprv_sts_typ_ListPutter]の定義 */
	private MCListPutter Hdr_insp_aprv_sts_typ_p = null;

	/**
	 * [Hdr_insp_aprv_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_insp_aprv_sts_typ_ListPutter() {
		if (Hdr_insp_aprv_sts_typ_p == null) {
			Hdr_insp_aprv_sts_typ_p = createHdr_insp_aprv_sts_typ_ListPutter(Hdr_insp_aprv_sts_typ, "insp_aprv_sts_typ");

		}
		return Hdr_insp_aprv_sts_typ_p;
	}
	
	
	/** [Hdr_aprv_usr_cd_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Hdr_aprv_usr_cd_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [Hdr_aprv_usr_cd_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_aprv_usr_cd_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (Hdr_aprv_usr_cd_p_PPanel_UsrDpt_dpt_cd_p == null) {
			Hdr_aprv_usr_cd_p_PPanel_UsrDpt_dpt_cd_p = createHdr_aprv_usr_cd_p_PPanel_UsrDpt_dpt_cd_ListPutter(Hdr_aprv_usr_cd_p_PPanel.UsrDpt_dpt_cd, "aprv_dpt_cd", "aprv_dpt_nm");
		}
		return Hdr_aprv_usr_cd_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [DtlStd_insp_point_cd_ListPutter]の定義 */
	private MCListPutter DtlStd_insp_point_cd_p = null;

	/**
	 * [DtlStd_insp_point_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtlStd_insp_point_cd_ListPutter() {
		if (DtlStd_insp_point_cd_p == null) {
			DtlStd_insp_point_cd_p = createDtlStd_insp_point_cd_ListPutter(columnDtlStd_insp_point_cd, "insp_point_cd", "insp_point_nm","insp_qlqn_typ","trd_unit_cd");

		}
		return DtlStd_insp_point_cd_p;
	}
	
	
	/** [DtlStd_insp_qlqn_typ_ListPutter]の定義 */
	private MCListPutter DtlStd_insp_qlqn_typ_p = null;

	/**
	 * [DtlStd_insp_qlqn_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtlStd_insp_qlqn_typ_ListPutter() {
		if (DtlStd_insp_qlqn_typ_p == null) {
			DtlStd_insp_qlqn_typ_p = createDtlStd_insp_qlqn_typ_ListPutter(columnDtlStd_insp_qlqn_typ, "insp_qlqn_typ", "insp_qlqn_typ_nm");

		}
		return DtlStd_insp_qlqn_typ_p;
	}
	
	
	/** [DtlStd_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter DtlStd_trd_unit_cd_p = null;

	/**
	 * [DtlStd_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtlStd_trd_unit_cd_ListPutter() {
		if (DtlStd_trd_unit_cd_p == null) {
			DtlStd_trd_unit_cd_p = createDtlStd_trd_unit_cd_ListPutter(columnDtlStd_trd_unit_cd, "trd_unit_cd", "trd_unit_nm");

		}
		return DtlStd_trd_unit_cd_p;
	}
	
	
	/** [DtlStd_sign_out_min_typ_ListPutter]の定義 */
	private MCListPutter DtlStd_sign_out_min_typ_p = null;

	/**
	 * [DtlStd_sign_out_min_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtlStd_sign_out_min_typ_ListPutter() {
		if (DtlStd_sign_out_min_typ_p == null) {
			DtlStd_sign_out_min_typ_p = createDtlStd_sign_out_min_typ_ListPutter(columnDtlStd_sign_out_min_typ, "sign_out_min_typ", "sign_out_min_typ_nm");

		}
		return DtlStd_sign_out_min_typ_p;
	}
	
	
	/** [DtlStd_sign_in_min_typ_ListPutter]の定義 */
	private MCListPutter DtlStd_sign_in_min_typ_p = null;

	/**
	 * [DtlStd_sign_in_min_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtlStd_sign_in_min_typ_ListPutter() {
		if (DtlStd_sign_in_min_typ_p == null) {
			DtlStd_sign_in_min_typ_p = createDtlStd_sign_in_min_typ_ListPutter(columnDtlStd_sign_in_min_typ, "sign_in_min_typ", "sign_in_min_typ_nm");

		}
		return DtlStd_sign_in_min_typ_p;
	}
	
	
	/** [DtlStd_sign_in_max_typ_ListPutter]の定義 */
	private MCListPutter DtlStd_sign_in_max_typ_p = null;

	/**
	 * [DtlStd_sign_in_max_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtlStd_sign_in_max_typ_ListPutter() {
		if (DtlStd_sign_in_max_typ_p == null) {
			DtlStd_sign_in_max_typ_p = createDtlStd_sign_in_max_typ_ListPutter(columnDtlStd_sign_in_max_typ, "sign_in_max_typ", "sign_in_max_typ_nm");

		}
		return DtlStd_sign_in_max_typ_p;
	}
	
	
	/** [DtlStd_sign_out_max_typ_ListPutter]の定義 */
	private MCListPutter DtlStd_sign_out_max_typ_p = null;

	/**
	 * [DtlStd_sign_out_max_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtlStd_sign_out_max_typ_ListPutter() {
		if (DtlStd_sign_out_max_typ_p == null) {
			DtlStd_sign_out_max_typ_p = createDtlStd_sign_out_max_typ_ListPutter(columnDtlStd_sign_out_max_typ, "sign_out_max_typ", "sign_out_max_typ_nm");

		}
		return DtlStd_sign_out_max_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBFP_InspInstReg create(){
		MSBFP_InspInstReg p = new MSBFP_InspInstReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBFP_InspInstReg create(String name){
		MSBFP_InspInstReg p = new MSBFP_InspInstReg(name);
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
		MSBFP_InspInstReg_MC.jbfInitScreenOpe((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbfInitCnd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbfInitHdrTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbfInitHdr((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbfInitSystemInfo((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbfInitAprv((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbfInitDtlTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbfInitDtlStd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbfInitDtlSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbfInitBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbfInitAprvItm((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbfInitAprvBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbfInitAprvEastBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbfInitEastBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbInitScreenOpe((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbInitCnd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbInitHdrTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbInitHdr((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbInitSystemInfo((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbInitAprv((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbInitDtlTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbInitDtlStd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbInitDtlSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbInitBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbInitAprvItm((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbInitAprvBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbInitAprvEastBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.jbInitEastBtn((MSBFP_InspInstReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_APRV = p.beansFactory.createRadioButton("Cnd.ope_APRV");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_srch_tgt_typ = p.beansFactory.createTextField("Cnd.srch_tgt_typ");
		p.Cnd_srch_tgt_typ_nm_Label = p.beansFactory.createLabel("Cnd.srch_tgt_typ_nm_Label");
		p.Cnd_srch_tgt_typ_nm = p.beansFactory.createTextComboBox("Cnd.srch_tgt_typ_nm");
		p.Cnd_srch_tgt_typ_nm.setLabel(p.Cnd_srch_tgt_typ_nm_Label);
		p.Cnd_srch_tgt_no = p.beansFactory.createTextField("Cnd.srch_tgt_no");
		p.Cnd_srch_schd = p.beansFactory.createButton("Cnd.srch_schd", "srch");
		p.Cnd_srch_inst = p.beansFactory.createButton("Cnd.srch_inst", "srch");
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_srch_mst = p.beansFactory.createButton("Hdr.srch_mst");
		p.Hdr_srch_std = p.beansFactory.createButton("Hdr.srch_std");
		p.Hdr_insp_no_Label = p.beansFactory.createLabel("Hdr.insp_no_Label");
		p.Hdr_insp_no = p.beansFactory.createTextField("Hdr.insp_no");
		p.Hdr_insp_no.setLabel(p.Hdr_insp_no_Label);
		p.Hdr_insp_schd_no_Label = p.beansFactory.createLabel("Hdr.insp_schd_no_Label");
		p.Hdr_insp_schd_no = p.beansFactory.createTextField("Hdr.insp_schd_no");
		p.Hdr_insp_schd_no.setLabel(p.Hdr_insp_schd_no_Label);
		p.Hdr_insp_freq_Label = p.beansFactory.createLabel("Hdr.insp_freq_Label");
		p.Hdr_insp_freq = p.beansFactory.createNumberField("Hdr.insp_freq");
		p.Hdr_insp_freq.setLabel(p.Hdr_insp_freq_Label);
		p.Hdr_insp_sts_typ_Label = p.beansFactory.createLabel("Hdr.insp_sts_typ_Label");
		p.Hdr_insp_sts_typ = p.beansFactory.createTextField("Hdr.insp_sts_typ");
		p.Hdr_insp_sts_typ.setLabel(p.Hdr_insp_sts_typ_Label);
		p.Hdr_insp_sts_typ_nm = p.beansFactory.createTextField("Hdr.insp_sts_typ_nm");
		p.Hdr_insp_typ_Label = p.beansFactory.createLabel("Hdr.insp_typ_Label");
		p.Hdr_insp_typ = p.beansFactory.createTextField("Hdr.insp_typ");
		p.Hdr_insp_typ.setLabel(p.Hdr_insp_typ_Label);
		p.Hdr_insp_typ_nm = p.beansFactory.createTextField("Hdr.insp_typ_nm");
		p.Hdr_lmt_up_flg = p.beansFactory.createCheckBox("Hdr.lmt_up_flg");
		p.Hdr_in_prmt_insp_flg = p.beansFactory.createCheckBox("Hdr.in_prmt_insp_flg");
		p.Hdr_lims_flg = p.beansFactory.createCheckBox("Hdr.lims_flg");
		p.Hdr_last_lims_flg = p.beansFactory.createCheckBox("Hdr.last_lims_flg");
		p.Hdr_ver_no_Label = p.beansFactory.createLabel("Hdr.ver_no_Label");
		p.Hdr_ver_no = p.beansFactory.createTextField("Hdr.ver_no");
		p.Hdr_ver_no.setLabel(p.Hdr_ver_no_Label);
		p.Hdr_bp_lot_no_Label = p.beansFactory.createLabel("Hdr.bp_lot_no_Label");
		p.Hdr_bp_lot_no = p.beansFactory.createTextField("Hdr.bp_lot_no");
		p.Hdr_bp_lot_no.setLabel(p.Hdr_bp_lot_no_Label);
		p.Hdr_loc_cd_Label = p.beansFactory.createLabel("Hdr.loc_cd_Label");
		p.Hdr_loc_cd = p.beansFactory.createTextField("Hdr.loc_cd");
		p.Hdr_loc_cd.setLabel(p.Hdr_loc_cd_Label);
		p.Hdr_loc_nm = p.beansFactory.createTextField("Hdr.loc_nm");
		p.Hdr_to_site_cd = p.beansFactory.createTextField("Hdr.to_site_cd");
		p.Hdr_mfg_loc_cd_Label = p.beansFactory.createLabel("Hdr.mfg_loc_cd_Label");
		p.Hdr_mfg_loc_cd = p.beansFactory.createTextField("Hdr.mfg_loc_cd");
		p.Hdr_mfg_loc_cd.setLabel(p.Hdr_mfg_loc_cd_Label);
		p.Hdr_mfg_loc_nm = p.beansFactory.createTextField("Hdr.mfg_loc_nm");
		p.Hdr_sppl_cd_Label = p.beansFactory.createLabel("Hdr.sppl_cd_Label");
		p.Hdr_sppl_cd = p.beansFactory.createTextField("Hdr.sppl_cd");
		p.Hdr_sppl_cd.setLabel(p.Hdr_sppl_cd_Label);
		p.Hdr_sppl_nm = p.beansFactory.createTextField("Hdr.sppl_nm");
		p.Hdr_maker_cd_Label = p.beansFactory.createLabel("Hdr.maker_cd_Label");
		p.Hdr_maker_cd = p.beansFactory.createTextField("Hdr.maker_cd");
		p.Hdr_maker_cd.setLabel(p.Hdr_maker_cd_Label);
		p.Hdr_maker_nm = p.beansFactory.createTextField("Hdr.maker_nm");
		p.Hdr_inst_dt_Label = p.beansFactory.createLabel("Hdr.inst_dt_Label");
		p.Hdr_inst_dt = p.beansFactory.createDateField("Hdr.inst_dt");
		p.Hdr_inst_dt.setLabel(p.Hdr_inst_dt_Label);
		p.Hdr_master_dt_Label = p.beansFactory.createLabel("Hdr.master_dt_Label");
		p.Hdr_master_dt = p.beansFactory.createDateField("Hdr.master_dt");
		p.Hdr_master_dt.setLabel(p.Hdr_master_dt_Label);
		p.Hdr_insp_ptn_cd_Label = p.beansFactory.createLabel("Hdr.insp_ptn_cd_Label");
		p.Hdr_insp_ptn_cd = p.beansFactory.createTextComboBox("Hdr.insp_ptn_cd");
		p.Hdr_insp_ptn_cd.setLabel(p.Hdr_insp_ptn_cd_Label);
		p.Hdr_insp_ptn_nm = p.beansFactory.createTextField("Hdr.insp_ptn_nm");
		p.Hdr_insp_mtd_typ_Label = p.beansFactory.createLabel("Hdr.insp_mtd_typ_Label");
		p.Hdr_insp_mtd_typ = p.beansFactory.createTextComboBox("Hdr.insp_mtd_typ");
		p.Hdr_insp_mtd_typ.setLabel(p.Hdr_insp_mtd_typ_Label);
		p.Hdr_insp_mtd_typ_nm = p.beansFactory.createTextField("Hdr.insp_mtd_typ_nm");
		p.Hdr_insp_std_no_Label = p.beansFactory.createLabel("Hdr.insp_std_no_Label");
		p.Hdr_insp_std_no = p.beansFactory.createTextField("Hdr.insp_std_no");
		p.Hdr_insp_std_no.setLabel(p.Hdr_insp_std_no_Label);
		p.Hdr_std_req_flg = p.beansFactory.createCheckBox("Hdr.std_req_flg");
		p.Hdr_std_cnf_req_flg = p.beansFactory.createCheckBox("Hdr.std_cnf_req_flg");
		p.Hdr_plnt_aprv_flg = p.beansFactory.createCheckBox("Hdr.plnt_aprv_flg");
		p.Hdr_spl_qty = p.beansFactory.createNumberField("Hdr.spl_qty");
		p.Hdr_base_unit_cd_Label = p.beansFactory.createLabel("Hdr.base_unit_cd_Label");
		p.Hdr_base_unit_cd = p.beansFactory.createTextField("Hdr.base_unit_cd");
		p.Hdr_base_unit_cd.setLabel(p.Hdr_base_unit_cd_Label);
		p.Hdr_base_unit_nm = p.beansFactory.createTextField("Hdr.base_unit_nm");
		p.Hdr_base_dec_place = p.beansFactory.createNumberField("Hdr.base_dec_place");
		p.Hdr_intr_rmrks_Label = p.beansFactory.createLabel("Hdr.intr_rmrks_Label");
		p.Hdr_intr_rmrks = p.beansFactory.createTextField("Hdr.intr_rmrks");
		p.Hdr_intr_rmrks.setLabel(p.Hdr_intr_rmrks_Label);
		p.Hdr_sub_char1_Label = p.beansFactory.createLabel("Hdr.sub_char1_Label");
		p.Hdr_sub_char1 = p.beansFactory.createTextField("Hdr.sub_char1");
		p.Hdr_sub_char1.setLabel(p.Hdr_sub_char1_Label);
		p.Hdr_sub_char2_Label = p.beansFactory.createLabel("Hdr.sub_char2_Label");
		p.Hdr_sub_char2 = p.beansFactory.createTextField("Hdr.sub_char2");
		p.Hdr_sub_char2.setLabel(p.Hdr_sub_char2_Label);
		p.Hdr_sub_char3_Label = p.beansFactory.createLabel("Hdr.sub_char3_Label");
		p.Hdr_sub_char3 = p.beansFactory.createTextField("Hdr.sub_char3");
		p.Hdr_sub_char3.setLabel(p.Hdr_sub_char3_Label);
		p.Hdr_ins_usr_id_Label = p.beansFactory.createLabel("Hdr.ins_usr_id_Label");
		p.Hdr_ins_usr_id = p.beansFactory.createTextField("Hdr.ins_usr_id");
		p.Hdr_ins_usr_id.setLabel(p.Hdr_ins_usr_id_Label);
		p.Hdr_ins_usr_nm = p.beansFactory.createTextField("Hdr.ins_usr_nm");
		p.Hdr_ins_func_id_Label = p.beansFactory.createLabel("Hdr.ins_func_id_Label");
		p.Hdr_ins_func_id = p.beansFactory.createTextField("Hdr.ins_func_id");
		p.Hdr_ins_func_id.setLabel(p.Hdr_ins_func_id_Label);
		p.Hdr_ins_func_nm = p.beansFactory.createTextField("Hdr.ins_func_nm");
		p.Hdr_upd_usr_id_Label = p.beansFactory.createLabel("Hdr.upd_usr_id_Label");
		p.Hdr_upd_usr_id = p.beansFactory.createTextField("Hdr.upd_usr_id");
		p.Hdr_upd_usr_id.setLabel(p.Hdr_upd_usr_id_Label);
		p.Hdr_upd_usr_nm = p.beansFactory.createTextField("Hdr.upd_usr_nm");
		p.Hdr_upd_func_id_Label = p.beansFactory.createLabel("Hdr.upd_func_id_Label");
		p.Hdr_upd_func_id = p.beansFactory.createTextField("Hdr.upd_func_id");
		p.Hdr_upd_func_id.setLabel(p.Hdr_upd_func_id_Label);
		p.Hdr_upd_func_nm = p.beansFactory.createTextField("Hdr.upd_func_nm");
		p.Hdr_ins_ts_Label = p.beansFactory.createLabel("Hdr.ins_ts_Label");
		p.Hdr_ins_ts = p.beansFactory.createTimestampField("Hdr.ins_ts");
		p.Hdr_ins_ts.setLabel(p.Hdr_ins_ts_Label);
		p.Hdr_upd_ts_Label = p.beansFactory.createLabel("Hdr.upd_ts_Label");
		p.Hdr_upd_ts = p.beansFactory.createTimestampField("Hdr.upd_ts");
		p.Hdr_upd_ts.setLabel(p.Hdr_upd_ts_Label);
		p.Hdr_upd_srv_req_no_Label = p.beansFactory.createLabel("Hdr.upd_srv_req_no_Label");
		p.Hdr_upd_srv_req_no = p.beansFactory.createTextField("Hdr.upd_srv_req_no");
		p.Hdr_upd_srv_req_no.setLabel(p.Hdr_upd_srv_req_no_Label);
		p.Hdr_insp_aprv_sts_typ_Label = p.beansFactory.createLabel("Hdr.insp_aprv_sts_typ_Label");
		p.Hdr_insp_aprv_sts_typ = p.beansFactory.createTextComboBox("Hdr.insp_aprv_sts_typ");
		p.Hdr_insp_aprv_sts_typ.setLabel(p.Hdr_insp_aprv_sts_typ_Label);
		p.Hdr_insp_aprv_sts_typ_nm = p.beansFactory.createTextField("Hdr.insp_aprv_sts_typ_nm");
		p.Hdr_insp_aprv_flg = p.beansFactory.createCheckBox("Hdr.insp_aprv_flg");
		p.Hdr_aprv_dt_Label = p.beansFactory.createLabel("Hdr.aprv_dt_Label");
		p.Hdr_aprv_dt = p.beansFactory.createDateField("Hdr.aprv_dt");
		p.Hdr_aprv_dt.setLabel(p.Hdr_aprv_dt_Label);
		p.Hdr_aprv_tm = p.beansFactory.createDateField("Hdr.aprv_tm");
		p.Hdr_aprv_lims_flg = p.beansFactory.createCheckBox("Hdr.aprv_lims_flg");
		p.Hdr_last_aprv_lims_flg = p.beansFactory.createCheckBox("Hdr.last_aprv_lims_flg");
		p.Hdr_upd_cntr = p.beansFactory.createNumberField("Hdr.upd_cntr");
		p.Hdr_insp_bind_typ = p.beansFactory.createTextField("Hdr.insp_bind_typ");
		p.Hdr_is_invalid_insp_ptn_flg = p.beansFactory.createCheckBox("Hdr.is_invalid_insp_ptn_flg");
		p.Hdr_prnt_flg = p.beansFactory.createCheckBox("Hdr.prnt_flg");
	}

	/**
	 * [SystemInfo]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSystemInfo(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.SystemInfoPanel = p.beansFactory.createPanel("SystemInfo");
		// ブロックの項目の初期化
	}

	/**
	 * [Aprv]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAprv(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.AprvPanel = p.beansFactory.createPanel("Aprv");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlTab(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.DtlTabPanel = p.beansFactory.createPanel("DtlTab");
		p.DtlTabTab = p.beansFactory.createTabbedPane("DtlTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlStd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlStd(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.DtlStdPanel = p.beansFactory.createPanel("DtlStd");
		p.DtlStdScrollPane = p.beansFactory.createScrollPane("DtlStd.scroll");
		p.createDtlStdTable();
		// ブロックの項目の初期化
		p.columnDtlStd_insp_seq = p.beansFactory.createTableColumn("DtlStd.insp_seq", MCColumnType.NUMBER);
		p.columnDtlStd_insp_point_cd = p.beansFactory.createTableColumn("DtlStd.insp_point_cd", MCColumnType.TEXT_COMBO);
		p.columnDtlStd_insp_point_nm = p.beansFactory.createTableColumn("DtlStd.insp_point_nm", MCColumnType.TEXT);
		p.columnDtlStd_insp_qlqn_typ = p.beansFactory.createTableColumn("DtlStd.insp_qlqn_typ", MCColumnType.TEXT_COMBO);
		p.columnDtlStd_insp_qlqn_typ_nm = p.beansFactory.createTableColumn("DtlStd.insp_qlqn_typ_nm", MCColumnType.TEXT);
		p.columnDtlStd_ql_std_val = p.beansFactory.createTableColumn("DtlStd.ql_std_val", MCColumnType.TEXT);
		p.columnDtlStd_trd_unit_cd = p.beansFactory.createTableColumn("DtlStd.trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtlStd_trd_unit_nm = p.beansFactory.createTableColumn("DtlStd.trd_unit_nm", MCColumnType.TEXT);
		p.columnDtlStd_qn_int_digit = p.beansFactory.createTableColumn("DtlStd.qn_int_digit", MCColumnType.NUMBER);
		p.columnDtlStd_qn_int_frac = p.beansFactory.createTableColumn("DtlStd.qn_int_frac", MCColumnType.NUMBER);
		p.columnDtlStd_sign_out_min_typ = p.beansFactory.createTableColumn("DtlStd.sign_out_min_typ", MCColumnType.TEXT_COMBO);
		p.columnDtlStd_sign_out_min_typ_nm = p.beansFactory.createTableColumn("DtlStd.sign_out_min_typ_nm", MCColumnType.TEXT);
		p.columnDtlStd_sign_in_min_typ = p.beansFactory.createTableColumn("DtlStd.sign_in_min_typ", MCColumnType.TEXT_COMBO);
		p.columnDtlStd_sign_in_min_typ_nm = p.beansFactory.createTableColumn("DtlStd.sign_in_min_typ_nm", MCColumnType.TEXT);
		p.columnDtlStd_sign_in_max_typ = p.beansFactory.createTableColumn("DtlStd.sign_in_max_typ", MCColumnType.TEXT_COMBO);
		p.columnDtlStd_sign_in_max_typ_nm = p.beansFactory.createTableColumn("DtlStd.sign_in_max_typ_nm", MCColumnType.TEXT);
		p.columnDtlStd_sign_out_max_typ = p.beansFactory.createTableColumn("DtlStd.sign_out_max_typ", MCColumnType.TEXT_COMBO);
		p.columnDtlStd_sign_out_max_typ_nm = p.beansFactory.createTableColumn("DtlStd.sign_out_max_typ_nm", MCColumnType.TEXT);
		p.columnDtlStd_intr_rmrks = p.beansFactory.createTableColumn("DtlStd.intr_rmrks", MCColumnType.TEXT);
		p.columnDtlStd_sub_char1 = p.beansFactory.createTableColumn("DtlStd.sub_char1", MCColumnType.TEXT);
		p.columnDtlStd_sub_char2 = p.beansFactory.createTableColumn("DtlStd.sub_char2", MCColumnType.TEXT);
		p.columnDtlStd_sub_char3 = p.beansFactory.createTableColumn("DtlStd.sub_char3", MCColumnType.TEXT);
		p.columnDtlStd_std_insp_inst_no = p.beansFactory.createTableColumn("DtlStd.std_insp_inst_no", MCColumnType.TEXT);
		p.columnDtlStd_add_point_flg = p.beansFactory.createTableColumn("DtlStd.add_point_flg", MCColumnType.CHECK);
		p.columnDtlStd_data_crud_typ = p.beansFactory.createTableColumn("DtlStd.data_crud_typ", MCColumnType.TEXT);
	}

	/**
	 * [DtlSchd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlSchd(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.DtlSchdPanel = p.beansFactory.createPanel("DtlSchd");
		p.DtlSchdScrollPane = p.beansFactory.createScrollPane("DtlSchd.scroll");
		p.createDtlSchdTable();
		// ブロックの項目の初期化
		p.columnDtlSchd_insp_schd_no = p.beansFactory.createTableColumn("DtlSchd.insp_schd_no", MCColumnType.TEXT);
		p.columnDtlSchd_pack_unit_cd = p.beansFactory.createTableColumn("DtlSchd.pack_unit_cd", MCColumnType.TEXT);
		p.columnDtlSchd_pack_unit_nm = p.beansFactory.createTableColumn("DtlSchd.pack_unit_nm", MCColumnType.TEXT);
		p.columnDtlSchd_pack_dec_place = p.beansFactory.createTableColumn("DtlSchd.pack_dec_place", MCColumnType.NUMBER);
		p.columnDtlSchd_base_unit_cd = p.beansFactory.createTableColumn("DtlSchd.base_unit_cd", MCColumnType.TEXT);
		p.columnDtlSchd_base_unit_nm = p.beansFactory.createTableColumn("DtlSchd.base_unit_nm", MCColumnType.TEXT);
		p.columnDtlSchd_base_dec_place = p.beansFactory.createTableColumn("DtlSchd.base_dec_place", MCColumnType.NUMBER);
		p.columnDtlSchd_loc_cd = p.beansFactory.createTableColumn("DtlSchd.loc_cd", MCColumnType.TEXT);
		p.columnDtlSchd_loc_nm = p.beansFactory.createTableColumn("DtlSchd.loc_nm", MCColumnType.TEXT);
		p.columnDtlSchd_str_ln_cd = p.beansFactory.createTableColumn("DtlSchd.str_ln_cd", MCColumnType.TEXT);
		p.columnDtlSchd_str_ln_nm = p.beansFactory.createTableColumn("DtlSchd.str_ln_nm", MCColumnType.TEXT);
		p.columnDtlSchd_gd_cd = p.beansFactory.createTableColumn("DtlSchd.gd_cd", MCColumnType.TEXT);
		p.columnDtlSchd_gd_nm = p.beansFactory.createTableColumn("DtlSchd.gd_nm", MCColumnType.TEXT);
		p.columnDtlSchd_master_dt = p.beansFactory.createTableColumn("DtlSchd.master_dt", MCColumnType.DATE);
		p.columnDtlSchd_insp_cnt_rmrks = p.beansFactory.createTableColumn("DtlSchd.insp_cnt_rmrks", MCColumnType.TEXT);
		p.columnDtlSchd_src_no1 = p.beansFactory.createTableColumn("DtlSchd.src_no1", MCColumnType.TEXT);
		p.columnDtlSchd_src_no2 = p.beansFactory.createTableColumn("DtlSchd.src_no2", MCColumnType.TEXT);
		p.columnDtlSchd_src_no3 = p.beansFactory.createTableColumn("DtlSchd.src_no3", MCColumnType.TEXT);
		p.columnDtlSchd_src_no4 = p.beansFactory.createTableColumn("DtlSchd.src_no4", MCColumnType.TEXT);
		p.columnDtlSchd_ins_usr_id = p.beansFactory.createTableColumn("DtlSchd.ins_usr_id", MCColumnType.TEXT);
		p.columnDtlSchd_ins_usr_nm = p.beansFactory.createTableColumn("DtlSchd.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtlSchd_ins_func_id = p.beansFactory.createTableColumn("DtlSchd.ins_func_id", MCColumnType.TEXT);
		p.columnDtlSchd_ins_func_nm = p.beansFactory.createTableColumn("DtlSchd.ins_func_nm", MCColumnType.TEXT);
		p.columnDtlSchd_ins_ts = p.beansFactory.createTableColumn("DtlSchd.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtlSchd_upd_usr_id = p.beansFactory.createTableColumn("DtlSchd.upd_usr_id", MCColumnType.TEXT);
		p.columnDtlSchd_upd_usr_nm = p.beansFactory.createTableColumn("DtlSchd.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtlSchd_upd_func_id = p.beansFactory.createTableColumn("DtlSchd.upd_func_id", MCColumnType.TEXT);
		p.columnDtlSchd_upd_func_nm = p.beansFactory.createTableColumn("DtlSchd.upd_func_nm", MCColumnType.TEXT);
		p.columnDtlSchd_upd_ts = p.beansFactory.createTableColumn("DtlSchd.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtlSchd_upd_srv_req_no = p.beansFactory.createTableColumn("DtlSchd.upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtlSchd_upd_cntr = p.beansFactory.createTableColumn("DtlSchd.upd_cntr", MCColumnType.NUMBER);
		p.columnDtlSchd_insp_inst_issue_typ = p.beansFactory.createTableColumn("DtlSchd.insp_inst_issue_typ", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_prnt = p.beansFactory.createButton("Btn.prnt", "prnt");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_prnt_flg = p.beansFactory.createCheckBox("Btn.prnt_flg");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
		p.Btn_upd_aprv = p.beansFactory.createButton("Btn.upd_aprv", "upd");
		p.Btn_del_aprv = p.beansFactory.createButton("Btn.del_aprv", "del");
	}

	/**
	 * [AprvItm]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAprvItm(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.AprvItmPanel = p.beansFactory.createPanel("AprvItm");
		// ブロックの項目の初期化
	}

	/**
	 * [AprvBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAprvBtn(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.AprvBtnPanel = p.beansFactory.createPanel("AprvBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [AprvEastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAprvEastBtn(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.AprvEastBtnPanel = p.beansFactory.createPanel("AprvEastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.CndPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.HdrTabPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_INS);
		p.ScreenOpePanel.add(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setNextBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_APRV);
		p.Cnd_ope_APRV.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_APRV);
		p.ScreenOpePanel.add(p.Cnd_ope_APRV);
		p.Cnd_ope_APRV.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("4");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0040.CndR.ope_META);
		p.CndPanel.add(p.Cnd_srch_tgt_typ);
		p.CndPanel.setLastBeans(p.Cnd_srch_tgt_typ);
		p.Cnd_srch_tgt_typ.setNextBeans(p.Cnd_srch_tgt_typ_nm);
		p.Cnd_srch_tgt_typ.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0040.CndR.srch_tgt_typ_META);
		p.Cnd_srch_tgt_typ_nm.setListType(MCListType.STRICT);
		p.CndPanel.add(p.Cnd_srch_tgt_typ_nm_Label);
		p.CndPanel.add(p.Cnd_srch_tgt_typ_nm);
		p.Cnd_srch_tgt_typ_nm.setNextBeans(p.Cnd_srch_tgt_no);
		p.Cnd_srch_tgt_typ_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0040.CndR.srch_tgt_typ_nm_META);
		p.CndPanel.add(p.Cnd_srch_tgt_no);
		p.Cnd_srch_tgt_no.setNextBeans(p.Cnd_srch_schd);
		p.Cnd_srch_tgt_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0040.CndR.srch_tgt_no_META);
		p.Cnd_srch_schd.setIcon("SEARCH");
		p.Cnd_srch_schd.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch_schd);
		p.Cnd_srch_schd.setNextBeans(p.Cnd_srch_inst);
		p.Cnd_srch_inst.setIcon("SEARCH");
		p.Cnd_srch_inst.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch_inst);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.add(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.DtlTabPanel);
		p.HdrTabPanel.add(p.HdrTabTab);
		p.HdrTabPanel.setLastBeans(p.HdrTabTab);
		p.HdrTabPanel.setLayoutPosition("CT");
		// ブロックの項目の初期化
		p.HdrTabTab.add(p.HdrPanel, "HdrTab.tab1");
		p.HdrTabTab.setLastBeans(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.AprvPanel);
		p.HdrTabTab.add(p.AprvPanel, "HdrTab.tab2");
		p.AprvPanel.setNextBeans(p.SystemInfoPanel);
		p.HdrTabTab.add(p.SystemInfoPanel, "HdrTab.tab3");
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setNextBeans(p.AprvPanel);
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_srch_mst);
		p.HdrPanel.setLastBeans(p.Hdr_srch_mst);
		p.Hdr_srch_mst.setNextBeans(p.Hdr_srch_std);
		p.HdrPanel.add(p.Hdr_srch_std);
		p.Hdr_srch_std.setNextBeans(p.Hdr_insp_no);
		p.HdrPanel.add(p.Hdr_insp_no_Label);
		p.HdrPanel.add(p.Hdr_insp_no);
		p.Hdr_insp_no.setNextBeans(p.Hdr_insp_schd_no);
		p.Hdr_insp_no.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.insp_no_META);
		p.HdrPanel.add(p.Hdr_insp_schd_no_Label);
		p.HdrPanel.add(p.Hdr_insp_schd_no);
		p.Hdr_insp_schd_no.setNextBeans(p.Hdr_insp_freq);
		p.Hdr_insp_schd_no.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.insp_schd_no_META);
		p.HdrPanel.add(p.Hdr_insp_freq_Label);
		p.HdrPanel.add(p.Hdr_insp_freq);
		p.Hdr_insp_freq.setNextBeans(p.Hdr_insp_sts_typ);
		p.Hdr_insp_freq.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.insp_freq_META);
		p.HdrPanel.add(p.Hdr_insp_sts_typ_Label);
		p.HdrPanel.add(p.Hdr_insp_sts_typ);
		p.Hdr_insp_sts_typ.setNextBeans(p.Hdr_insp_sts_typ_nm);
		p.Hdr_insp_sts_typ.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.insp_sts_typ_META);
		p.HdrPanel.add(p.Hdr_insp_sts_typ_nm);
		p.Hdr_insp_sts_typ_nm.setNextBeans(p.Hdr_insp_typ);
		p.Hdr_insp_sts_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.insp_sts_typ_nm_META);
		p.HdrPanel.add(p.Hdr_insp_typ_Label);
		p.HdrPanel.add(p.Hdr_insp_typ);
		p.Hdr_insp_typ.setNextBeans(p.Hdr_insp_typ_nm);
		p.Hdr_insp_typ.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.insp_typ_META);
		p.HdrPanel.add(p.Hdr_insp_typ_nm);
		p.Hdr_insp_typ_nm.setNextBeans(p.Hdr_lmt_up_flg);
		p.Hdr_insp_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.insp_typ_nm_META);
		p.HdrPanel.add(p.Hdr_lmt_up_flg);
		p.Hdr_lmt_up_flg.setNextBeans(p.Hdr_in_prmt_insp_flg);
		p.Hdr_lmt_up_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.lmt_up_flg_META);
		p.HdrPanel.add(p.Hdr_in_prmt_insp_flg);
		p.Hdr_in_prmt_insp_flg.setNextBeans(p.Hdr_lims_flg);
		p.Hdr_in_prmt_insp_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.in_prmt_insp_flg_META);
		p.HdrPanel.add(p.Hdr_lims_flg);
		p.Hdr_lims_flg.setNextBeans(p.Hdr_last_lims_flg);
		p.Hdr_lims_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.lims_flg_META);
		p.HdrPanel.add(p.Hdr_last_lims_flg);
		p.Hdr_last_lims_flg.setNextBeans(p.Hdr_itm_p_PPanel);
		p.Hdr_last_lims_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.last_lims_flg_META);
		p.HdrPanel.add(p.Hdr_itm_p_PPanel);
		p.Hdr_itm_p_PPanel.setNextBeans(p.Hdr_ver_no);
		p.HdrPanel.add(p.Hdr_ver_no_Label);
		p.HdrPanel.add(p.Hdr_ver_no);
		p.Hdr_ver_no.setNextBeans(p.Hdr_lot_no_p_PPanel);
		p.Hdr_ver_no.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.ver_no_META);
		p.HdrPanel.add(p.Hdr_lot_no_p_PPanel);
		p.Hdr_lot_no_p_PPanel.setNextBeans(p.Hdr_bp_lot_no);
		p.HdrPanel.add(p.Hdr_bp_lot_no_Label);
		p.HdrPanel.add(p.Hdr_bp_lot_no);
		p.Hdr_bp_lot_no.setNextBeans(p.Hdr_loc_cd);
		p.Hdr_bp_lot_no.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.bp_lot_no_META);
		p.HdrPanel.add(p.Hdr_loc_cd_Label);
		p.HdrPanel.add(p.Hdr_loc_cd);
		p.Hdr_loc_cd.setNextBeans(p.Hdr_loc_nm);
		p.Hdr_loc_cd.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.loc_cd_META);
		p.HdrPanel.add(p.Hdr_loc_nm);
		p.Hdr_loc_nm.setNextBeans(p.Hdr_to_site_cd);
		p.Hdr_loc_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.loc_nm_META);
		p.HdrPanel.add(p.Hdr_to_site_cd);
		p.Hdr_to_site_cd.setNextBeans(p.Hdr_mfg_loc_cd);
		p.Hdr_to_site_cd.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.to_site_cd_META);
		p.HdrPanel.add(p.Hdr_mfg_loc_cd_Label);
		p.HdrPanel.add(p.Hdr_mfg_loc_cd);
		p.Hdr_mfg_loc_cd.setNextBeans(p.Hdr_mfg_loc_nm);
		p.Hdr_mfg_loc_cd.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.mfg_loc_cd_META);
		p.HdrPanel.add(p.Hdr_mfg_loc_nm);
		p.Hdr_mfg_loc_nm.setNextBeans(p.Hdr_sppl_cd);
		p.Hdr_mfg_loc_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.mfg_loc_nm_META);
		p.HdrPanel.add(p.Hdr_sppl_cd_Label);
		p.HdrPanel.add(p.Hdr_sppl_cd);
		p.Hdr_sppl_cd.setNextBeans(p.Hdr_sppl_nm);
		p.Hdr_sppl_cd.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.sppl_cd_META);
		p.HdrPanel.add(p.Hdr_sppl_nm);
		p.Hdr_sppl_nm.setNextBeans(p.Hdr_maker_cd);
		p.Hdr_sppl_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.sppl_nm_META);
		p.HdrPanel.add(p.Hdr_maker_cd_Label);
		p.HdrPanel.add(p.Hdr_maker_cd);
		p.Hdr_maker_cd.setNextBeans(p.Hdr_maker_nm);
		p.Hdr_maker_cd.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.maker_cd_META);
		p.HdrPanel.add(p.Hdr_maker_nm);
		p.Hdr_maker_nm.setNextBeans(p.Hdr_inst_dt);
		p.Hdr_maker_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.maker_nm_META);
		p.HdrPanel.add(p.Hdr_inst_dt_Label);
		p.HdrPanel.add(p.Hdr_inst_dt);
		p.Hdr_inst_dt.setNextBeans(p.Hdr_inst_usr_cd_p_PPanel);
		p.Hdr_inst_dt.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.inst_dt_META);
		p.Hdr_inst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_inst_usr_cd_p_PPanel);
		p.Hdr_inst_usr_cd_p_PPanel.setNextBeans(p.Hdr_st_dt_p_PPanel);
		p.Hdr_inst_usr_cd_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.Hdr_inst_dpt_nm);
		p.HdrPanel.add(p.Hdr_st_dt_p_PPanel);
		p.Hdr_st_dt_p_PPanel.setNextBeans(p.Hdr_end_dt_p_PPanel);
		p.HdrPanel.add(p.Hdr_end_dt_p_PPanel);
		p.Hdr_end_dt_p_PPanel.setNextBeans(p.Hdr_master_dt);
		p.HdrPanel.add(p.Hdr_master_dt_Label);
		p.HdrPanel.add(p.Hdr_master_dt);
		p.Hdr_master_dt.setNextBeans(p.Hdr_insp_ptn_cd);
		p.Hdr_master_dt.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.master_dt_META);
		p.Hdr_master_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Hdr_insp_ptn_cd.setListType(MCListType.STRICT);
		p.Hdr_insp_ptn_cd.setLinkBeans(p.Hdr_insp_ptn_nm);
		p.HdrPanel.add(p.Hdr_insp_ptn_cd_Label);
		p.HdrPanel.add(p.Hdr_insp_ptn_cd);
		p.Hdr_insp_ptn_cd.setNextBeans(p.Hdr_insp_ptn_nm);
		p.Hdr_insp_ptn_cd.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.insp_ptn_cd_META);
		p.HdrPanel.add(p.Hdr_insp_ptn_nm);
		p.Hdr_insp_ptn_nm.setNextBeans(p.Hdr_insp_mtd_typ);
		p.Hdr_insp_ptn_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.insp_ptn_nm_META);
		p.Hdr_insp_mtd_typ.setListType(MCListType.STRICT);
		p.Hdr_insp_mtd_typ.setLinkBeans(p.Hdr_insp_mtd_typ_nm);
		p.HdrPanel.add(p.Hdr_insp_mtd_typ_Label);
		p.HdrPanel.add(p.Hdr_insp_mtd_typ);
		p.Hdr_insp_mtd_typ.setNextBeans(p.Hdr_insp_mtd_typ_nm);
		p.Hdr_insp_mtd_typ.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.insp_mtd_typ_META);
		p.HdrPanel.add(p.Hdr_insp_mtd_typ_nm);
		p.Hdr_insp_mtd_typ_nm.setNextBeans(p.Hdr_insp_std_no);
		p.Hdr_insp_mtd_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.insp_mtd_typ_nm_META);
		p.HdrPanel.add(p.Hdr_insp_std_no_Label);
		p.HdrPanel.add(p.Hdr_insp_std_no);
		p.Hdr_insp_std_no.setNextBeans(p.Hdr_std_req_flg);
		p.Hdr_insp_std_no.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.insp_std_no_META);
		p.HdrPanel.add(p.Hdr_std_req_flg);
		p.Hdr_std_req_flg.setNextBeans(p.Hdr_std_cnf_req_flg);
		p.Hdr_std_req_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.std_req_flg_META);
		p.HdrPanel.add(p.Hdr_std_cnf_req_flg);
		p.Hdr_std_cnf_req_flg.setNextBeans(p.Hdr_plnt_aprv_flg);
		p.Hdr_std_cnf_req_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.std_cnf_req_flg_META);
		p.HdrPanel.add(p.Hdr_plnt_aprv_flg);
		p.Hdr_plnt_aprv_flg.setNextBeans(p.Hdr_spl_qty);
		p.Hdr_plnt_aprv_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.plnt_aprv_flg_META);
		p.HdrPanel.add(p.Hdr_spl_qty);
		p.Hdr_spl_qty.setNextBeans(p.Hdr_base_unit_qty_p_PPanel);
		p.Hdr_spl_qty.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.spl_qty_META);
		p.HdrPanel.add(p.Hdr_base_unit_qty_p_PPanel);
		p.Hdr_base_unit_qty_p_PPanel.setNextBeans(p.Hdr_base_unit_cd);
		p.HdrPanel.add(p.Hdr_base_unit_cd_Label);
		p.HdrPanel.add(p.Hdr_base_unit_cd);
		p.Hdr_base_unit_cd.setNextBeans(p.Hdr_base_unit_nm);
		p.Hdr_base_unit_cd.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.base_unit_cd_META);
		p.HdrPanel.add(p.Hdr_base_unit_nm);
		p.Hdr_base_unit_nm.setNextBeans(p.Hdr_base_dec_place);
		p.Hdr_base_unit_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.base_unit_nm_META);
		p.HdrPanel.add(p.Hdr_base_dec_place);
		p.Hdr_base_dec_place.setNextBeans(p.Hdr_intr_rmrks);
		p.Hdr_base_dec_place.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.base_dec_place_META);
		p.HdrPanel.add(p.Hdr_intr_rmrks_Label);
		p.HdrPanel.add(p.Hdr_intr_rmrks);
		p.Hdr_intr_rmrks.setNextBeans(p.Hdr_sub_char1);
		p.Hdr_intr_rmrks.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.intr_rmrks_META);
		p.HdrPanel.add(p.Hdr_sub_char1_Label);
		p.HdrPanel.add(p.Hdr_sub_char1);
		p.Hdr_sub_char1.setNextBeans(p.Hdr_sub_char2);
		p.Hdr_sub_char1.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.sub_char1_META);
		p.HdrPanel.add(p.Hdr_sub_char2_Label);
		p.HdrPanel.add(p.Hdr_sub_char2);
		p.Hdr_sub_char2.setNextBeans(p.Hdr_sub_char3);
		p.Hdr_sub_char2.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.sub_char2_META);
		p.HdrPanel.add(p.Hdr_sub_char3_Label);
		p.HdrPanel.add(p.Hdr_sub_char3);
		p.Hdr_sub_char3.setNextBeans(p.Hdr_upd_cntr);
		p.Hdr_sub_char3.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.sub_char3_META);
		p.SystemInfoPanel.add(p.Hdr_ins_usr_id_Label);
		p.SystemInfoPanel.add(p.Hdr_ins_usr_id);
		p.SystemInfoPanel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.ins_usr_id_META);
		p.SystemInfoPanel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.ins_usr_nm_META);
		p.SystemInfoPanel.add(p.Hdr_ins_func_id_Label);
		p.SystemInfoPanel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.ins_func_id_META);
		p.SystemInfoPanel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.ins_func_nm_META);
		p.SystemInfoPanel.add(p.Hdr_upd_usr_id_Label);
		p.SystemInfoPanel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.upd_usr_id_META);
		p.SystemInfoPanel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.upd_usr_nm_META);
		p.SystemInfoPanel.add(p.Hdr_upd_func_id_Label);
		p.SystemInfoPanel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.upd_func_id_META);
		p.SystemInfoPanel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.upd_func_nm_META);
		p.SystemInfoPanel.add(p.Hdr_ins_ts_Label);
		p.SystemInfoPanel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.SystemInfoPanel.add(p.Hdr_upd_ts_Label);
		p.SystemInfoPanel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.SystemInfoPanel.add(p.Hdr_upd_srv_req_no_Label);
		p.SystemInfoPanel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.upd_srv_req_no_META);
		p.Hdr_insp_aprv_sts_typ.setListType(MCListType.STRICT);
		p.AprvItmPanel.add(p.Hdr_insp_aprv_sts_typ_Label);
		p.AprvItmPanel.add(p.Hdr_insp_aprv_sts_typ);
		p.AprvItmPanel.setLastBeans(p.Hdr_insp_aprv_sts_typ);
		p.Hdr_insp_aprv_sts_typ.setNextBeans(p.Hdr_insp_aprv_sts_typ_nm);
		p.Hdr_insp_aprv_sts_typ.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.insp_aprv_sts_typ_META);
		p.AprvItmPanel.add(p.Hdr_insp_aprv_sts_typ_nm);
		p.Hdr_insp_aprv_sts_typ_nm.setNextBeans(p.Hdr_insp_aprv_flg);
		p.Hdr_insp_aprv_sts_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.insp_aprv_sts_typ_nm_META);
		p.AprvItmPanel.add(p.Hdr_insp_aprv_flg);
		p.Hdr_insp_aprv_flg.setNextBeans(p.Hdr_aprv_dt);
		p.Hdr_insp_aprv_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.insp_aprv_flg_META);
		p.AprvItmPanel.add(p.Hdr_aprv_dt_Label);
		p.AprvItmPanel.add(p.Hdr_aprv_dt);
		p.Hdr_aprv_dt.setNextBeans(p.Hdr_aprv_tm);
		p.Hdr_aprv_dt.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.aprv_dt_META);
		p.Hdr_aprv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.AprvItmPanel.add(p.Hdr_aprv_tm);
		p.Hdr_aprv_tm.setNextBeans(p.Hdr_aprv_usr_cd_p_PPanel);
		p.Hdr_aprv_tm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.aprv_tm_META);
		p.Hdr_aprv_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.AprvItmPanel.add(p.Hdr_aprv_usr_cd_p_PPanel);
		p.Hdr_aprv_usr_cd_p_PPanel.setNextBeans(p.Hdr_aprv_rsn_p_PPanel);
		p.Hdr_aprv_usr_cd_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.Hdr_aprv_dpt_nm);
		p.AprvItmPanel.add(p.Hdr_aprv_rsn_p_PPanel);
		p.Hdr_aprv_rsn_p_PPanel.setNextBeans(p.Hdr_aprv_lims_flg);
		p.AprvItmPanel.add(p.Hdr_aprv_lims_flg);
		p.Hdr_aprv_lims_flg.setNextBeans(p.Hdr_last_aprv_lims_flg);
		p.Hdr_aprv_lims_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.aprv_lims_flg_META);
		p.AprvItmPanel.add(p.Hdr_last_aprv_lims_flg);
		p.Hdr_last_aprv_lims_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.last_aprv_lims_flg_META);
		p.HdrPanel.add(p.Hdr_upd_cntr);
		p.Hdr_upd_cntr.setNextBeans(p.Hdr_insp_bind_typ);
		p.Hdr_upd_cntr.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.upd_cntr_META);
		p.HdrPanel.add(p.Hdr_insp_bind_typ);
		p.Hdr_insp_bind_typ.setNextBeans(p.Hdr_is_invalid_insp_ptn_flg);
		p.Hdr_insp_bind_typ.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.insp_bind_typ_META);
		p.HdrPanel.add(p.Hdr_is_invalid_insp_ptn_flg);
		p.Hdr_is_invalid_insp_ptn_flg.setNextBeans(p.Hdr_prnt_flg);
		p.Hdr_is_invalid_insp_ptn_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.is_invalid_insp_ptn_flg_META);
		p.HdrPanel.add(p.Hdr_prnt_flg);
		p.Hdr_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0040.HdrR.prnt_flg_META);
	}

	/**
	 * [SystemInfo]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSystemInfo(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Aprv]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAprv(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.AprvPanel.setNextBeans(p.SystemInfoPanel);
		// ブロックの項目の初期化
		p.AprvPanel.add(p.AprvItmPanel, null);
		p.AprvPanel.setLastBeans(p.AprvItmPanel);
		p.AprvItmPanel.setNextBeans(p.AprvBtnPanel);
		p.AprvPanel.add(p.AprvBtnPanel, null);
		p.AprvBtnPanel.setNextBeans(p.AprvEastBtnPanel);
		p.AprvPanel.add(p.AprvEastBtnPanel, null);
	}

	/**
	 * [DtlTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlTab(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.add(p.DtlTabPanel);
		p.DtlTabPanel.setNextBeans(p.BtnPanel);
		p.DtlTabPanel.add(p.DtlTabTab);
		p.DtlTabPanel.setLastBeans(p.DtlTabTab);
		p.DtlTabPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
		p.DtlTabTab.add(p.DtlStdPanel, "DtlTab.DtlStd");
		p.DtlTabTab.setLastBeans(p.DtlStdPanel);
		p.DtlStdPanel.setNextBeans(p.DtlSchdPanel);
		p.DtlTabTab.add(p.DtlSchdPanel, "DtlTab.DtlSchd");
	}

	/**
	 * [DtlStd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlStd(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.DtlStdPanel.setNextBeans(p.DtlSchdPanel);
		p.DtlStdPanel.add(p.DtlStdScrollPane);
		p.DtlStdPanel.setLastBeans(p.DtlStdTable);
		p.DtlStdScrollPane.setViewportView(p.DtlStdTable);
		p.DtlStdTable.setList(p.getDtlStdL());
		p.DtlStdPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlSchd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlSchd(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.DtlSchdPanel.add(p.DtlSchdScrollPane);
		p.DtlSchdPanel.setLastBeans(p.DtlSchdTable);
		p.DtlSchdScrollPane.setViewportView(p.DtlSchdTable);
		p.DtlSchdTable.setList(p.getDtlSchdL());
		p.DtlSchdPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_prnt.setIcon("PRINT");
		p.Btn_prnt.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_prnt);
		p.BtnPanel.setLastBeans(p.Btn_prnt);
		p.Btn_prnt.setNextBeans(p.Btn_radd);
		p.Btn_radd.setIcon("INSERT_RECORD");
		p.Btn_radd.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_radd);
		p.Btn_radd.setNextBeans(p.Btn_rdel);
		p.Btn_rdel.setIcon("DELETE_RECORD");
		p.Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_rdel);
		p.Btn_rdel.setNextBeans(p.Btn_rcopy);
		p.Btn_rcopy.setIcon("COPY_RECORD");
		p.Btn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.BtnPanel.add(p.Btn_rcopy);
		p.Btn_rcopy.setNextBeans(p.Btn_prnt_flg);
		p.BtnPanel.add(p.Btn_prnt_flg);
		p.Btn_prnt_flg.setNextBeans(p.Btn_ins);
		p.Btn_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBF.MSBFP0040.BtnR.prnt_flg_META);
		p.Btn_ins.setIcon("REGISTER");
		p.Btn_ins.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins);
		p.Btn_ins.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
		p.Btn_upd_aprv.setIcon("REGISTER");
		p.Btn_upd_aprv.setFunctionKey(MCFunctionKey.F9);
		p.AprvBtnPanel.setLastBeans(p.Btn_upd_aprv);
		p.AprvBtnPanel.add(p.Btn_upd_aprv);
		p.Btn_del_aprv.setIcon("CANCEL");
		p.Btn_del_aprv.setFunctionKey(MCFunctionKey.F12);
		p.AprvEastBtnPanel.setLastBeans(p.Btn_del_aprv);
		p.AprvEastBtnPanel.add(p.Btn_del_aprv);
	}

	/**
	 * [AprvItm]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAprvItm(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.AprvItmPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [AprvBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAprvBtn(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.AprvBtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [AprvEastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAprvEastBtn(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.AprvEastBtnPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBFP_InspInstReg p) {
		// ブロック関連の初期化
		p.add(p.EastBtnPanel);
		p.EastBtnPanel.setLayoutPosition("SE");
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
		MSBFP_InspInstReg_MC.mcInitScreenOpe((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.mcInitCnd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.mcInitHdrTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.mcInitHdr((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.mcInitSystemInfo((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.mcInitAprv((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.mcInitDtlTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.mcInitDtlStd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.mcInitDtlSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.mcInitBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.mcInitAprvItm((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.mcInitAprvBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.mcInitAprvEastBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.mcInitEastBtn((MSBFP_InspInstReg)this);

		// [SRCH]ステータスのモードの設定
		MSBFP_InspInstReg_MC.statusInitSRCH_ScreenOpe((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitSRCH_CndSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitSRCH_Cnd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitSRCH_HdrTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitSRCH_Hdr((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitSRCH_SystemInfo((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitSRCH_Aprv((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitSRCH_DtlTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitSRCH_DtlStd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitSRCH_DtlSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitSRCH_Btn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitSRCH_AprvItm((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitSRCH_AprvBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitSRCH_AprvEastBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitSRCH_EastBtn((MSBFP_InspInstReg)this);

		// [INS]ステータスのモードの設定
		MSBFP_InspInstReg_MC.statusInitINS_ScreenOpe((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitINS_CndSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitINS_Cnd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitINS_HdrTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitINS_Hdr((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitINS_SystemInfo((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitINS_Aprv((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitINS_DtlTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitINS_DtlStd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitINS_DtlSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitINS_Btn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitINS_AprvItm((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitINS_AprvBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitINS_AprvEastBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitINS_EastBtn((MSBFP_InspInstReg)this);

		// [FIX_I]ステータスのモードの設定
		MSBFP_InspInstReg_MC.statusInitFIX__I_ScreenOpe((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__I_CndSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__I_Cnd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__I_HdrTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__I_Hdr((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__I_SystemInfo((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__I_Aprv((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__I_DtlTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__I_DtlStd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__I_DtlSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__I_Btn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__I_AprvItm((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__I_AprvBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__I_AprvEastBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__I_EastBtn((MSBFP_InspInstReg)this);

		// [UPD]ステータスのモードの設定
		MSBFP_InspInstReg_MC.statusInitUPD_ScreenOpe((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD_CndSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD_Cnd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD_HdrTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD_Hdr((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD_SystemInfo((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD_Aprv((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD_DtlTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD_DtlStd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD_DtlSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD_Btn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD_AprvItm((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD_AprvBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD_AprvEastBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD_EastBtn((MSBFP_InspInstReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBFP_InspInstReg_MC.statusInitFIX__U_ScreenOpe((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U_CndSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U_Cnd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U_HdrTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U_Hdr((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U_SystemInfo((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U_Aprv((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U_DtlTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U_DtlStd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U_DtlSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U_Btn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U_AprvItm((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U_AprvBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U_AprvEastBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U_EastBtn((MSBFP_InspInstReg)this);

		// [UPD_APRV]ステータスのモードの設定
		MSBFP_InspInstReg_MC.statusInitUPD__APRV_ScreenOpe((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD__APRV_CndSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD__APRV_Cnd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD__APRV_HdrTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD__APRV_Hdr((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD__APRV_SystemInfo((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD__APRV_Aprv((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD__APRV_DtlTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD__APRV_DtlStd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD__APRV_DtlSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD__APRV_Btn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD__APRV_AprvItm((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD__APRV_AprvBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD__APRV_AprvEastBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitUPD__APRV_EastBtn((MSBFP_InspInstReg)this);

		// [FIX_U_A]ステータスのモードの設定
		MSBFP_InspInstReg_MC.statusInitFIX__U__A_ScreenOpe((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U__A_CndSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U__A_Cnd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U__A_HdrTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U__A_Hdr((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U__A_SystemInfo((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U__A_Aprv((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U__A_DtlTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U__A_DtlStd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U__A_DtlSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U__A_Btn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U__A_AprvItm((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U__A_AprvBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U__A_AprvEastBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__U__A_EastBtn((MSBFP_InspInstReg)this);

		// [DEL]ステータスのモードの設定
		MSBFP_InspInstReg_MC.statusInitDEL_ScreenOpe((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL_CndSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL_Cnd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL_HdrTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL_Hdr((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL_SystemInfo((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL_Aprv((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL_DtlTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL_DtlStd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL_DtlSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL_Btn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL_AprvItm((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL_AprvBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL_AprvEastBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL_EastBtn((MSBFP_InspInstReg)this);

		// [FIX_D]ステータスのモードの設定
		MSBFP_InspInstReg_MC.statusInitFIX__D_ScreenOpe((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D_CndSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D_Cnd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D_HdrTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D_Hdr((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D_SystemInfo((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D_Aprv((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D_DtlTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D_DtlStd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D_DtlSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D_Btn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D_AprvItm((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D_AprvBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D_AprvEastBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D_EastBtn((MSBFP_InspInstReg)this);

		// [DEL_APRV]ステータスのモードの設定
		MSBFP_InspInstReg_MC.statusInitDEL__APRV_ScreenOpe((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL__APRV_CndSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL__APRV_Cnd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL__APRV_HdrTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL__APRV_Hdr((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL__APRV_SystemInfo((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL__APRV_Aprv((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL__APRV_DtlTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL__APRV_DtlStd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL__APRV_DtlSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL__APRV_Btn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL__APRV_AprvItm((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL__APRV_AprvBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL__APRV_AprvEastBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitDEL__APRV_EastBtn((MSBFP_InspInstReg)this);

		// [FIX_D_A]ステータスのモードの設定
		MSBFP_InspInstReg_MC.statusInitFIX__D__A_ScreenOpe((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D__A_CndSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D__A_Cnd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D__A_HdrTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D__A_Hdr((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D__A_SystemInfo((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D__A_Aprv((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D__A_DtlTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D__A_DtlStd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D__A_DtlSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D__A_Btn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D__A_AprvItm((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D__A_AprvBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D__A_AprvEastBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitFIX__D__A_EastBtn((MSBFP_InspInstReg)this);

		// [REF]ステータスのモードの設定
		MSBFP_InspInstReg_MC.statusInitREF_ScreenOpe((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitREF_CndSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitREF_Cnd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitREF_HdrTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitREF_Hdr((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitREF_SystemInfo((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitREF_Aprv((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitREF_DtlTab((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitREF_DtlStd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitREF_DtlSchd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitREF_Btn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitREF_AprvItm((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitREF_AprvBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitREF_AprvEastBtn((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.statusInitREF_EastBtn((MSBFP_InspInstReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBFP_InspInstReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBFP_InspInstReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_APRV.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_srch_tgt_typ.setListListener(p);
		p.Cnd_srch_tgt_typ.addAllListener(p);
		p.Cnd_srch_tgt_typ_nm.setListListener(p);
		p.Cnd_srch_tgt_typ_nm.addAllListener(p);
		p.Cnd_srch_tgt_no.setListListener(p);
		p.Cnd_srch_tgt_no.addAllListener(p);
		p.Cnd_srch_schd.addAllListener(p);
		p.Cnd_srch_schd.setAPMethodName("doCnd_srch_schd");
		p.Cnd_srch_inst.addAllListener(p);
		p.Cnd_srch_inst.setAPMethodName("doCnd_srch_inst");
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBFP_InspInstReg p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBFP_InspInstReg p) {
		p.Hdr_srch_mst.addAllListener(p);
		p.Hdr_srch_mst.setAPMethodName("doHdr_srch_mst");
		p.Hdr_srch_std.addAllListener(p);
		p.Hdr_srch_std.setAPMethodName("doHdr_srch_std");
		p.Hdr_insp_no.setListListener(p);
		p.Hdr_insp_no.addAllListener(p);
		p.Hdr_insp_schd_no.setListListener(p);
		p.Hdr_insp_schd_no.addAllListener(p);
		p.Hdr_insp_freq.setListListener(p);
		p.Hdr_insp_freq.addAllListener(p);
		p.Hdr_insp_sts_typ.setListListener(p);
		p.Hdr_insp_sts_typ.addAllListener(p);
		p.Hdr_insp_sts_typ_nm.setListListener(p);
		p.Hdr_insp_sts_typ_nm.addAllListener(p);
		p.Hdr_insp_typ.setListListener(p);
		p.Hdr_insp_typ.addAllListener(p);
		p.Hdr_insp_typ_nm.setListListener(p);
		p.Hdr_insp_typ_nm.addAllListener(p);
		p.Hdr_lmt_up_flg.addAllListener(p);
		p.Hdr_in_prmt_insp_flg.addAllListener(p);
		p.Hdr_lims_flg.addAllListener(p);
		p.Hdr_last_lims_flg.addAllListener(p);
		p.Hdr_ver_no.setListListener(p);
		p.Hdr_ver_no.addAllListener(p);
		p.Hdr_bp_lot_no.setListListener(p);
		p.Hdr_bp_lot_no.addAllListener(p);
		p.Hdr_loc_cd.setListListener(p);
		p.Hdr_loc_cd.addAllListener(p);
		p.Hdr_loc_nm.setListListener(p);
		p.Hdr_loc_nm.addAllListener(p);
		p.Hdr_to_site_cd.setListListener(p);
		p.Hdr_to_site_cd.addAllListener(p);
		p.Hdr_mfg_loc_cd.setListListener(p);
		p.Hdr_mfg_loc_cd.addAllListener(p);
		p.Hdr_mfg_loc_nm.setListListener(p);
		p.Hdr_mfg_loc_nm.addAllListener(p);
		p.Hdr_sppl_cd.setListListener(p);
		p.Hdr_sppl_cd.addAllListener(p);
		p.Hdr_sppl_nm.setListListener(p);
		p.Hdr_sppl_nm.addAllListener(p);
		p.Hdr_maker_cd.setListListener(p);
		p.Hdr_maker_cd.addAllListener(p);
		p.Hdr_maker_nm.setListListener(p);
		p.Hdr_maker_nm.addAllListener(p);
		p.Hdr_inst_dt.setListListener(p);
		p.Hdr_inst_dt.addAllListener(p);
		p.Hdr_inst_usr_cd_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_master_dt.setListListener(p);
		p.Hdr_master_dt.addAllListener(p);
		p.Hdr_insp_ptn_cd.setListListener(p);
		p.Hdr_insp_ptn_cd.addAllListener(p);
		p.Hdr_insp_ptn_nm.setListListener(p);
		p.Hdr_insp_ptn_nm.addAllListener(p);
		p.Hdr_insp_mtd_typ.setListListener(p);
		p.Hdr_insp_mtd_typ.addAllListener(p);
		p.Hdr_insp_mtd_typ_nm.setListListener(p);
		p.Hdr_insp_mtd_typ_nm.addAllListener(p);
		p.Hdr_insp_std_no.setListListener(p);
		p.Hdr_insp_std_no.addAllListener(p);
		p.Hdr_std_req_flg.addAllListener(p);
		p.Hdr_std_cnf_req_flg.addAllListener(p);
		p.Hdr_plnt_aprv_flg.addAllListener(p);
		p.Hdr_spl_qty.setListListener(p);
		p.Hdr_spl_qty.addAllListener(p);
		p.Hdr_base_unit_cd.setListListener(p);
		p.Hdr_base_unit_cd.addAllListener(p);
		p.Hdr_base_unit_nm.setListListener(p);
		p.Hdr_base_unit_nm.addAllListener(p);
		p.Hdr_base_dec_place.setListListener(p);
		p.Hdr_base_dec_place.addAllListener(p);
		p.Hdr_intr_rmrks.setListListener(p);
		p.Hdr_intr_rmrks.addAllListener(p);
		p.Hdr_sub_char1.setListListener(p);
		p.Hdr_sub_char1.addAllListener(p);
		p.Hdr_sub_char2.setListListener(p);
		p.Hdr_sub_char2.addAllListener(p);
		p.Hdr_sub_char3.setListListener(p);
		p.Hdr_sub_char3.addAllListener(p);
		p.Hdr_ins_usr_id.setListListener(p);
		p.Hdr_ins_usr_id.addAllListener(p);
		p.Hdr_ins_usr_nm.setListListener(p);
		p.Hdr_ins_usr_nm.addAllListener(p);
		p.Hdr_ins_func_id.setListListener(p);
		p.Hdr_ins_func_id.addAllListener(p);
		p.Hdr_ins_func_nm.setListListener(p);
		p.Hdr_ins_func_nm.addAllListener(p);
		p.Hdr_upd_usr_id.setListListener(p);
		p.Hdr_upd_usr_id.addAllListener(p);
		p.Hdr_upd_usr_nm.setListListener(p);
		p.Hdr_upd_usr_nm.addAllListener(p);
		p.Hdr_upd_func_id.setListListener(p);
		p.Hdr_upd_func_id.addAllListener(p);
		p.Hdr_upd_func_nm.setListListener(p);
		p.Hdr_upd_func_nm.addAllListener(p);
		p.Hdr_ins_ts.setListListener(p);
		p.Hdr_ins_ts.addAllListener(p);
		p.Hdr_upd_ts.setListListener(p);
		p.Hdr_upd_ts.addAllListener(p);
		p.Hdr_upd_srv_req_no.setListListener(p);
		p.Hdr_upd_srv_req_no.addAllListener(p);
		p.Hdr_insp_aprv_sts_typ.setListListener(p);
		p.Hdr_insp_aprv_sts_typ.addAllListener(p);
		p.Hdr_insp_aprv_sts_typ_nm.setListListener(p);
		p.Hdr_insp_aprv_sts_typ_nm.addAllListener(p);
		p.Hdr_insp_aprv_flg.addAllListener(p);
		p.Hdr_aprv_dt.setListListener(p);
		p.Hdr_aprv_dt.addAllListener(p);
		p.Hdr_aprv_tm.setListListener(p);
		p.Hdr_aprv_tm.addAllListener(p);
		p.Hdr_aprv_usr_cd_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_aprv_lims_flg.addAllListener(p);
		p.Hdr_last_aprv_lims_flg.addAllListener(p);
		p.Hdr_upd_cntr.setListListener(p);
		p.Hdr_upd_cntr.addAllListener(p);
		p.Hdr_insp_bind_typ.setListListener(p);
		p.Hdr_insp_bind_typ.addAllListener(p);
		p.Hdr_is_invalid_insp_ptn_flg.addAllListener(p);
		p.Hdr_prnt_flg.addAllListener(p);
	}

	/**
	 *  [SystemInfo]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSystemInfo(MSBFP_InspInstReg p) {
	}

	/**
	 *  [Aprv]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAprv(MSBFP_InspInstReg p) {
	}

	/**
	 *  [DtlTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlTab(MSBFP_InspInstReg p) {
		p.DtlTabTab.addAllListener(p);
	}

	/**
	 *  [DtlStd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlStd(MSBFP_InspInstReg p) {
		p.DtlStdTable.addAllListener(p);
		p.columnDtlStd_insp_seq.addAllListener(p);
		p.columnDtlStd_insp_seq.setListListener(p);
		p.columnDtlStd_insp_point_cd.addAllListener(p);
		p.columnDtlStd_insp_point_cd.setListListener(p);
		p.columnDtlStd_insp_point_nm.addAllListener(p);
		p.columnDtlStd_insp_point_nm.setListListener(p);
		p.columnDtlStd_insp_qlqn_typ.addAllListener(p);
		p.columnDtlStd_insp_qlqn_typ.setListListener(p);
		p.columnDtlStd_insp_qlqn_typ_nm.addAllListener(p);
		p.columnDtlStd_insp_qlqn_typ_nm.setListListener(p);
		p.columnDtlStd_ql_std_val.addAllListener(p);
		p.columnDtlStd_ql_std_val.setListListener(p);
		p.columnDtlStd_trd_unit_cd.addAllListener(p);
		p.columnDtlStd_trd_unit_cd.setListListener(p);
		p.columnDtlStd_trd_unit_nm.addAllListener(p);
		p.columnDtlStd_trd_unit_nm.setListListener(p);
		p.columnDtlStd_qn_int_digit.addAllListener(p);
		p.columnDtlStd_qn_int_digit.setListListener(p);
		p.columnDtlStd_qn_int_frac.addAllListener(p);
		p.columnDtlStd_qn_int_frac.setListListener(p);
		p.columnDtlStd_sign_out_min_typ.addAllListener(p);
		p.columnDtlStd_sign_out_min_typ.setListListener(p);
		p.columnDtlStd_sign_out_min_typ_nm.addAllListener(p);
		p.columnDtlStd_sign_out_min_typ_nm.setListListener(p);
		p.columnDtlStd_sign_in_min_typ.addAllListener(p);
		p.columnDtlStd_sign_in_min_typ.setListListener(p);
		p.columnDtlStd_sign_in_min_typ_nm.addAllListener(p);
		p.columnDtlStd_sign_in_min_typ_nm.setListListener(p);
		p.columnDtlStd_sign_in_max_typ.addAllListener(p);
		p.columnDtlStd_sign_in_max_typ.setListListener(p);
		p.columnDtlStd_sign_in_max_typ_nm.addAllListener(p);
		p.columnDtlStd_sign_in_max_typ_nm.setListListener(p);
		p.columnDtlStd_sign_out_max_typ.addAllListener(p);
		p.columnDtlStd_sign_out_max_typ.setListListener(p);
		p.columnDtlStd_sign_out_max_typ_nm.addAllListener(p);
		p.columnDtlStd_sign_out_max_typ_nm.setListListener(p);
		p.columnDtlStd_intr_rmrks.addAllListener(p);
		p.columnDtlStd_intr_rmrks.setListListener(p);
		p.columnDtlStd_sub_char1.addAllListener(p);
		p.columnDtlStd_sub_char1.setListListener(p);
		p.columnDtlStd_sub_char2.addAllListener(p);
		p.columnDtlStd_sub_char2.setListListener(p);
		p.columnDtlStd_sub_char3.addAllListener(p);
		p.columnDtlStd_sub_char3.setListListener(p);
		p.columnDtlStd_std_insp_inst_no.addAllListener(p);
		p.columnDtlStd_std_insp_inst_no.setListListener(p);
		p.columnDtlStd_add_point_flg.addAllListener(p);
		p.columnDtlStd_data_crud_typ.addAllListener(p);
		p.columnDtlStd_data_crud_typ.setListListener(p);
	}

	/**
	 *  [DtlSchd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlSchd(MSBFP_InspInstReg p) {
		p.DtlSchdTable.addAllListener(p);
		p.columnDtlSchd_insp_schd_no.addAllListener(p);
		p.columnDtlSchd_insp_schd_no.setListListener(p);
		p.columnDtlSchd_pack_unit_cd.addAllListener(p);
		p.columnDtlSchd_pack_unit_cd.setListListener(p);
		p.columnDtlSchd_pack_unit_nm.addAllListener(p);
		p.columnDtlSchd_pack_unit_nm.setListListener(p);
		p.columnDtlSchd_pack_dec_place.addAllListener(p);
		p.columnDtlSchd_pack_dec_place.setListListener(p);
		p.columnDtlSchd_base_unit_cd.addAllListener(p);
		p.columnDtlSchd_base_unit_cd.setListListener(p);
		p.columnDtlSchd_base_unit_nm.addAllListener(p);
		p.columnDtlSchd_base_unit_nm.setListListener(p);
		p.columnDtlSchd_base_dec_place.addAllListener(p);
		p.columnDtlSchd_base_dec_place.setListListener(p);
		p.columnDtlSchd_loc_cd.addAllListener(p);
		p.columnDtlSchd_loc_cd.setListListener(p);
		p.columnDtlSchd_loc_nm.addAllListener(p);
		p.columnDtlSchd_loc_nm.setListListener(p);
		p.columnDtlSchd_str_ln_cd.addAllListener(p);
		p.columnDtlSchd_str_ln_cd.setListListener(p);
		p.columnDtlSchd_str_ln_nm.addAllListener(p);
		p.columnDtlSchd_str_ln_nm.setListListener(p);
		p.columnDtlSchd_gd_cd.addAllListener(p);
		p.columnDtlSchd_gd_cd.setListListener(p);
		p.columnDtlSchd_gd_nm.addAllListener(p);
		p.columnDtlSchd_gd_nm.setListListener(p);
		p.columnDtlSchd_master_dt.addAllListener(p);
		p.columnDtlSchd_master_dt.setListListener(p);
		p.columnDtlSchd_insp_cnt_rmrks.addAllListener(p);
		p.columnDtlSchd_insp_cnt_rmrks.setListListener(p);
		p.columnDtlSchd_src_no1.addAllListener(p);
		p.columnDtlSchd_src_no1.setListListener(p);
		p.columnDtlSchd_src_no2.addAllListener(p);
		p.columnDtlSchd_src_no2.setListListener(p);
		p.columnDtlSchd_src_no3.addAllListener(p);
		p.columnDtlSchd_src_no3.setListListener(p);
		p.columnDtlSchd_src_no4.addAllListener(p);
		p.columnDtlSchd_src_no4.setListListener(p);
		p.columnDtlSchd_ins_usr_id.addAllListener(p);
		p.columnDtlSchd_ins_usr_id.setListListener(p);
		p.columnDtlSchd_ins_usr_nm.addAllListener(p);
		p.columnDtlSchd_ins_usr_nm.setListListener(p);
		p.columnDtlSchd_ins_func_id.addAllListener(p);
		p.columnDtlSchd_ins_func_id.setListListener(p);
		p.columnDtlSchd_ins_func_nm.addAllListener(p);
		p.columnDtlSchd_ins_func_nm.setListListener(p);
		p.columnDtlSchd_ins_ts.addAllListener(p);
		p.columnDtlSchd_ins_ts.setListListener(p);
		p.columnDtlSchd_upd_usr_id.addAllListener(p);
		p.columnDtlSchd_upd_usr_id.setListListener(p);
		p.columnDtlSchd_upd_usr_nm.addAllListener(p);
		p.columnDtlSchd_upd_usr_nm.setListListener(p);
		p.columnDtlSchd_upd_func_id.addAllListener(p);
		p.columnDtlSchd_upd_func_id.setListListener(p);
		p.columnDtlSchd_upd_func_nm.addAllListener(p);
		p.columnDtlSchd_upd_func_nm.setListListener(p);
		p.columnDtlSchd_upd_ts.addAllListener(p);
		p.columnDtlSchd_upd_ts.setListListener(p);
		p.columnDtlSchd_upd_srv_req_no.addAllListener(p);
		p.columnDtlSchd_upd_srv_req_no.setListListener(p);
		p.columnDtlSchd_upd_cntr.addAllListener(p);
		p.columnDtlSchd_upd_cntr.setListListener(p);
		p.columnDtlSchd_insp_inst_issue_typ.addAllListener(p);
		p.columnDtlSchd_insp_inst_issue_typ.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBFP_InspInstReg p) {
		p.Btn_prnt.addAllListener(p);
		p.Btn_prnt.setAPMethodName("doBtn_prnt");
		p.Btn_radd.addAllListener(p);
		p.Btn_radd.setAPMethodName("doBtn_radd");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_prnt_flg.addAllListener(p);
		p.Btn_ins.addAllListener(p);
		p.Btn_ins.setAPMethodName("doBtn_ins");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
		p.Btn_upd_aprv.addAllListener(p);
		p.Btn_upd_aprv.setAPMethodName("doBtn_upd_aprv");
		p.Btn_del_aprv.addAllListener(p);
		p.Btn_del_aprv.setAPMethodName("doBtn_del_aprv");
	}

	/**
	 *  [AprvItm]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAprvItm(MSBFP_InspInstReg p) {
	}

	/**
	 *  [AprvBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAprvBtn(MSBFP_InspInstReg p) {
	}

	/**
	 *  [AprvEastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAprvEastBtn(MSBFP_InspInstReg p) {
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBFP_InspInstReg p) {
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBFP_InspInstReg p){

	}

	/**
	 * [SRCH]ステータスの[CndSchd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_CndSchd(MSBFP_InspInstReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBFP_InspInstReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch_schd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_inst.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBFP_InspInstReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBFP_InspInstReg p){
		p.Hdr_srch_mst.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_srch_std.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_insp_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_lmt_up_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_in_prmt_insp_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_lims_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_last_lims_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_lot_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_loc_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_loc_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_to_site_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_inst_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_inst_usr_cd_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_st_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_end_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_master_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_ptn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_ptn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_std_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_plnt_aprv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_spl_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_base_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_aprv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_aprv_tm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_aprv_usr_cd_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_aprv_rsn_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
		p.Hdr_aprv_lims_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_last_aprv_lims_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_insp_bind_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_is_invalid_insp_ptn_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_prnt_flg.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SystemInfo(MSBFP_InspInstReg p){

	}

	/**
	 * [SRCH]ステータスの[Aprv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Aprv(MSBFP_InspInstReg p){

	}

	/**
	 * [SRCH]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlTab(MSBFP_InspInstReg p){

	}

	/**
	 * [SRCH]ステータスの[DtlStd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlStd(MSBFP_InspInstReg p){
		p.columnDtlStd_insp_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlStd_insp_point_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlStd_insp_point_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlStd_insp_qlqn_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlStd_insp_qlqn_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlStd_ql_std_val.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlStd_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlStd_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlStd_qn_int_digit.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlStd_qn_int_frac.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlStd_qn_out_min_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_out_min_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlStd_sign_out_min_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlStd_qn_in_min_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_in_min_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_min_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_max_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_max_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlStd_qn_in_max_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_out_max_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlStd_sign_out_max_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlStd_qn_out_max_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlStd_std_insp_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlStd_add_point_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlStd_data_crud_typ.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[DtlSchd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlSchd(MSBFP_InspInstReg p){
		p.columnDtlSchd_insp_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlSchd_pack_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSchd_pack_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_pack_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_pack_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.DtlSchd_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlSchd_smpl_schd_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlSchd_smpl_inst_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSchd_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_base_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlSchd_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_str_ln_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_str_ln_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_gd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_gd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlSchd_st_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.DtlSchd_end_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtlSchd_master_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_insp_cnt_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlSchd_insp_inst_issue_typ.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBFP_InspInstReg p){
		p.Btn_prnt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Btn_ins.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_aprv.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del_aprv.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[AprvItm]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_AprvItm(MSBFP_InspInstReg p){

	}

	/**
	 * [SRCH]ステータスの[AprvBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_AprvBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [SRCH]ステータスの[AprvEastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_AprvEastBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBFP_InspInstReg p){

	}

	/**
	 * [INS]ステータスの[CndSchd]ブロックのモードの設定
	 */
	protected static void statusInitINS_CndSchd(MSBFP_InspInstReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBFP_InspInstReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_srch_schd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_srch_inst.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_HdrTab(MSBFP_InspInstReg p){

	}

	/**
	 * [INS]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr(MSBFP_InspInstReg p){
		p.Hdr_srch_mst.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_srch_std.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_insp_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_schd_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_lmt_up_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_in_prmt_insp_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_lims_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_last_lims_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_lot_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_loc_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_loc_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_to_site_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_inst_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_inst_usr_cd_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_st_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.REQUIRED);
		p.Hdr_end_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.REQUIRED);
		p.Hdr_master_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_insp_ptn_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_insp_ptn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_insp_mtd_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_std_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_plnt_aprv_flg.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_spl_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_base_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_ins_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_aprv_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_aprv_tm.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_aprv_usr_cd_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_aprv_rsn_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
		p.Hdr_aprv_lims_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_last_aprv_lims_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_insp_bind_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_is_invalid_insp_ptn_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_prnt_flg.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitINS_SystemInfo(MSBFP_InspInstReg p){

	}

	/**
	 * [INS]ステータスの[Aprv]ブロックのモードの設定
	 */
	protected static void statusInitINS_Aprv(MSBFP_InspInstReg p){

	}

	/**
	 * [INS]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_DtlTab(MSBFP_InspInstReg p){

	}

	/**
	 * [INS]ステータスの[DtlStd]ブロックのモードの設定
	 */
	protected static void statusInitINS_DtlStd(MSBFP_InspInstReg p){
		p.columnDtlStd_insp_seq.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtlStd_insp_point_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtlStd_insp_point_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlStd_insp_qlqn_typ.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtlStd_insp_qlqn_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlStd_ql_std_val.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtlStd_trd_unit_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtlStd_trd_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlStd_qn_int_digit.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtlStd_qn_int_frac.putMode(p, INS, MCMode.REQUIRED);
		p.DtlStd_qn_out_min_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.ENABLE);
		p.columnDtlStd_sign_out_min_typ.putMode(p, INS, MCMode.ENABLE);
		p.columnDtlStd_sign_out_min_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.DtlStd_qn_in_min_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.ENABLE);
		p.columnDtlStd_sign_in_min_typ.putMode(p, INS, MCMode.ENABLE);
		p.columnDtlStd_sign_in_min_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_max_typ.putMode(p, INS, MCMode.ENABLE);
		p.columnDtlStd_sign_in_max_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.DtlStd_qn_in_max_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.ENABLE);
		p.columnDtlStd_sign_out_max_typ.putMode(p, INS, MCMode.ENABLE);
		p.columnDtlStd_sign_out_max_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.DtlStd_qn_out_max_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.ENABLE);
		p.columnDtlStd_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtlStd_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtlStd_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtlStd_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtlStd_std_insp_inst_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlStd_add_point_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlStd_data_crud_typ.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[DtlSchd]ブロックのモードの設定
	 */
	protected static void statusInitINS_DtlSchd(MSBFP_InspInstReg p){
		p.columnDtlSchd_insp_schd_no.putMode(p, INS, MCMode.READ_ONLY);
		p.DtlSchd_pack_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSchd_pack_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_pack_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_pack_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.DtlSchd_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlSchd_smpl_schd_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlSchd_smpl_inst_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.columnDtlSchd_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_base_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlSchd_loc_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_str_ln_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_str_ln_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_gd_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_gd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.DtlSchd_st_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.DtlSchd_end_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtlSchd_master_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_insp_cnt_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no1.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no2.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no3.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no4.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_srv_req_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlSchd_insp_inst_issue_typ.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBFP_InspInstReg p){
		p.Btn_prnt.putMode(p, INS, MCMode.DISABLE);
		p.Btn_radd.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, INS, MCMode.ENABLE);
		p.Btn_prnt_flg.putMode(p, INS, MCMode.ENABLE);
		p.Btn_ins.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);
		p.Btn_upd_aprv.putMode(p, INS, MCMode.DISABLE);
		p.Btn_del_aprv.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[AprvItm]ブロックのモードの設定
	 */
	protected static void statusInitINS_AprvItm(MSBFP_InspInstReg p){

	}

	/**
	 * [INS]ステータスの[AprvBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_AprvBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [INS]ステータスの[AprvEastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_AprvEastBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_I]ステータスの[CndSchd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_CndSchd(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBFP_InspInstReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_srch_schd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_srch_inst.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_HdrTab(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_I]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr(MSBFP_InspInstReg p){
		p.Hdr_srch_mst.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_srch_std.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_insp_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_schd_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_lmt_up_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_in_prmt_insp_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_lims_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_last_lims_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_lot_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_loc_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_loc_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_to_site_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_inst_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_inst_usr_cd_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_st_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_end_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_master_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_ptn_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_ptn_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_std_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_plnt_aprv_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_spl_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_base_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_aprv_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_aprv_tm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_aprv_usr_cd_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_aprv_rsn_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
		p.Hdr_aprv_lims_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_last_aprv_lims_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_upd_cntr.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_insp_bind_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_is_invalid_insp_ptn_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_prnt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_SystemInfo(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_I]ステータスの[Aprv]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Aprv(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_I]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_DtlTab(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_I]ステータスの[DtlStd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_DtlStd(MSBFP_InspInstReg p){
		p.columnDtlStd_insp_seq.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlStd_insp_point_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlStd_insp_point_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlStd_insp_qlqn_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlStd_insp_qlqn_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlStd_ql_std_val.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlStd_trd_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlStd_trd_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlStd_qn_int_digit.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlStd_qn_int_frac.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.DtlStd_qn_out_min_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_out_min_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlStd_sign_out_min_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.DtlStd_qn_in_min_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_in_min_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_min_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_max_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_max_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.DtlStd_qn_in_max_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_out_max_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlStd_sign_out_max_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.DtlStd_qn_out_max_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlStd_std_insp_inst_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlStd_add_point_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlStd_data_crud_typ.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[DtlSchd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_DtlSchd(MSBFP_InspInstReg p){
		p.columnDtlSchd_insp_schd_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.DtlSchd_pack_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSchd_pack_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_pack_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_pack_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.DtlSchd_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlSchd_smpl_schd_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlSchd_smpl_inst_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSchd_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_base_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlSchd_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_str_ln_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_str_ln_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_gd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_gd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.DtlSchd_st_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.DtlSchd_end_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtlSchd_master_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_insp_cnt_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no4.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_srv_req_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_cntr.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlSchd_insp_inst_issue_typ.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBFP_InspInstReg p){
		p.Btn_prnt.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Btn_ins.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd_aprv.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_del_aprv.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[AprvItm]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_AprvItm(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_I]ステータスの[AprvBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_AprvBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_I]ステータスの[AprvEastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_AprvEastBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBFP_InspInstReg p){

	}

	/**
	 * [UPD]ステータスの[CndSchd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_CndSchd(MSBFP_InspInstReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBFP_InspInstReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch_schd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_srch_inst.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrTab(MSBFP_InspInstReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MSBFP_InspInstReg p){
		p.Hdr_srch_mst.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_srch_std.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_insp_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_lmt_up_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_in_prmt_insp_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_lims_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_last_lims_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_lot_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_loc_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_loc_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_to_site_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_inst_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_inst_usr_cd_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_st_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.REQUIRED);
		p.Hdr_end_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.REQUIRED);
		p.Hdr_master_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_insp_ptn_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_insp_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_insp_mtd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_std_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_plnt_aprv_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_spl_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_base_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_aprv_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_aprv_tm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_aprv_usr_cd_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_aprv_rsn_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
		p.Hdr_aprv_lims_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_last_aprv_lims_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_insp_bind_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_is_invalid_insp_ptn_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_prnt_flg.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SystemInfo(MSBFP_InspInstReg p){

	}

	/**
	 * [UPD]ステータスの[Aprv]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Aprv(MSBFP_InspInstReg p){

	}

	/**
	 * [UPD]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlTab(MSBFP_InspInstReg p){

	}

	/**
	 * [UPD]ステータスの[DtlStd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlStd(MSBFP_InspInstReg p){
		p.columnDtlStd_insp_seq.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlStd_insp_point_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlStd_insp_point_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlStd_insp_qlqn_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlStd_insp_qlqn_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlStd_ql_std_val.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlStd_trd_unit_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlStd_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlStd_qn_int_digit.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlStd_qn_int_frac.putMode(p, UPD, MCMode.REQUIRED);
		p.DtlStd_qn_out_min_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.ENABLE);
		p.columnDtlStd_sign_out_min_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlStd_sign_out_min_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.DtlStd_qn_in_min_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.ENABLE);
		p.columnDtlStd_sign_in_min_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlStd_sign_in_min_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_max_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlStd_sign_in_max_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.DtlStd_qn_in_max_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.ENABLE);
		p.columnDtlStd_sign_out_max_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlStd_sign_out_max_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.DtlStd_qn_out_max_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.ENABLE);
		p.columnDtlStd_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlStd_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlStd_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlStd_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlStd_std_insp_inst_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlStd_add_point_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlStd_data_crud_typ.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[DtlSchd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlSchd(MSBFP_InspInstReg p){
		p.columnDtlSchd_insp_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.DtlSchd_pack_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSchd_pack_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_pack_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_pack_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.DtlSchd_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlSchd_smpl_schd_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlSchd_smpl_inst_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.columnDtlSchd_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_base_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlSchd_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_str_ln_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_str_ln_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_gd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_gd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.DtlSchd_st_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.DtlSchd_end_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtlSchd_master_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_insp_cnt_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no4.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlSchd_insp_inst_issue_typ.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBFP_InspInstReg p){
		p.Btn_prnt.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_prnt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_ins.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_upd_aprv.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_del_aprv.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[AprvItm]ブロックのモードの設定
	 */
	protected static void statusInitUPD_AprvItm(MSBFP_InspInstReg p){

	}

	/**
	 * [UPD]ステータスの[AprvBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_AprvBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [UPD]ステータスの[AprvEastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_AprvEastBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_U]ステータスの[CndSchd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_CndSchd(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBFP_InspInstReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_srch_schd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Cnd_srch_inst.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrTab(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MSBFP_InspInstReg p){
		p.Hdr_srch_mst.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_srch_std.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_insp_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_lmt_up_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_in_prmt_insp_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_lims_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_last_lims_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_lot_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_loc_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_loc_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_to_site_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_inst_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_inst_usr_cd_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_st_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_end_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_master_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_ptn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_ptn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_std_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_plnt_aprv_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_spl_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_base_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_aprv_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_aprv_tm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_aprv_usr_cd_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_aprv_rsn_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
		p.Hdr_aprv_lims_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_last_aprv_lims_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_insp_bind_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_is_invalid_insp_ptn_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_prnt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_SystemInfo(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Aprv]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Aprv(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_U]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DtlTab(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_U]ステータスの[DtlStd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DtlStd(MSBFP_InspInstReg p){
		p.columnDtlStd_insp_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlStd_insp_point_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlStd_insp_point_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlStd_insp_qlqn_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlStd_insp_qlqn_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlStd_ql_std_val.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlStd_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlStd_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlStd_qn_int_digit.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlStd_qn_int_frac.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DtlStd_qn_out_min_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_out_min_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlStd_sign_out_min_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DtlStd_qn_in_min_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_in_min_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_min_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_max_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_max_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DtlStd_qn_in_max_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_out_max_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlStd_sign_out_max_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DtlStd_qn_out_max_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlStd_std_insp_inst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlStd_add_point_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlStd_data_crud_typ.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[DtlSchd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DtlSchd(MSBFP_InspInstReg p){
		p.columnDtlSchd_insp_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DtlSchd_pack_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSchd_pack_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_pack_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_pack_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.DtlSchd_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlSchd_smpl_schd_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlSchd_smpl_inst_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSchd_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_base_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlSchd_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_str_ln_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_str_ln_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_gd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_gd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DtlSchd_st_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.DtlSchd_end_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtlSchd_master_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_insp_cnt_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no4.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlSchd_insp_inst_issue_typ.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBFP_InspInstReg p){
		p.Btn_prnt.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Btn_ins.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd_aprv.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del_aprv.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[AprvItm]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_AprvItm(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_U]ステータスの[AprvBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_AprvBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_U]ステータスの[AprvEastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_AprvEastBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_ScreenOpe(MSBFP_InspInstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[CndSchd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_CndSchd(MSBFP_InspInstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Cnd(MSBFP_InspInstReg p){
		p.Cnd_ope_Group.putMode(p, UPD_APRV, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, UPD_APRV, MCMode.REQUIRED);
		p.Cnd_srch_schd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Cnd_srch_inst.putMode(p, UPD_APRV, MCMode.ENABLE);

	}

	/**
	 * [UPD_APRV]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_HdrTab(MSBFP_InspInstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Hdr(MSBFP_InspInstReg p){
		p.Hdr_srch_mst.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_srch_std.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_insp_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_schd_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_lmt_up_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_in_prmt_insp_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_lims_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_last_lims_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_itm_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_lot_no_p_PPanel.putStatus(UPD_APRV, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_loc_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_loc_nm.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_to_site_cd.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_inst_dt.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_inst_usr_cd_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_st_dt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_end_dt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_master_dt.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_ptn_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_ptn_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_std_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_plnt_aprv_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_spl_qty.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_base_unit_qty_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_base_unit_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_base_unit_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_base_dec_place.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_aprv_dt.putMode(p, UPD_APRV, MCMode.REQUIRED);
		p.Hdr_aprv_tm.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_aprv_usr_cd_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr_aprv_rsn_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.REQUIRED);
		p.Hdr_aprv_lims_flg.putMode(p, UPD_APRV, MCMode.REQUIRED);
		p.Hdr_last_aprv_lims_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_insp_bind_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_is_invalid_insp_ptn_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Hdr_prnt_flg.putMode(p, UPD_APRV, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_APRV]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_SystemInfo(MSBFP_InspInstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[Aprv]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Aprv(MSBFP_InspInstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_DtlTab(MSBFP_InspInstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[DtlStd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_DtlStd(MSBFP_InspInstReg p){
		p.columnDtlStd_insp_seq.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_insp_point_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_insp_point_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_insp_qlqn_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_insp_qlqn_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_ql_std_val.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_trd_unit_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_trd_unit_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_qn_int_digit.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_qn_int_frac.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.DtlStd_qn_out_min_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_out_min_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_sign_out_min_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.DtlStd_qn_in_min_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_in_min_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_min_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_max_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_max_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.DtlStd_qn_in_max_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_out_max_typ.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_sign_out_max_typ_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.DtlStd_qn_out_max_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_intr_rmrks.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char1.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char2.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char3.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_std_insp_inst_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_add_point_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_data_crud_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_APRV]ステータスの[DtlSchd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_DtlSchd(MSBFP_InspInstReg p){
		p.columnDtlSchd_insp_schd_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.DtlSchd_pack_unit_qty_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSchd_pack_unit_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_pack_unit_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_pack_dec_place.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.DtlSchd_base_unit_qty_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlSchd_smpl_schd_qty_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlSchd_smpl_inst_qty_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSchd_base_unit_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_base_unit_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_base_dec_place.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtlSchd_loc_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_loc_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_str_ln_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_str_ln_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_gd_cd.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_gd_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.DtlSchd_st_dt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.DtlSchd_end_dt_p_PPanel.putStatus(UPD_APRV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtlSchd_master_dt.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_insp_cnt_rmrks.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no1.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no2.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no3.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no4.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_usr_id.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_usr_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_func_id.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_func_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_ts.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_usr_id.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_usr_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_func_id.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_func_nm.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_ts.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_srv_req_no.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_cntr.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.columnDtlSchd_insp_inst_issue_typ.putMode(p, UPD_APRV, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_APRV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_Btn(MSBFP_InspInstReg p){
		p.Btn_prnt.putMode(p, UPD_APRV, MCMode.DISABLE);
		p.Btn_radd.putMode(p, UPD_APRV, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, UPD_APRV, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, UPD_APRV, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, UPD_APRV, MCMode.READ_ONLY);
		p.Btn_ins.putMode(p, UPD_APRV, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD_APRV, MCMode.DISABLE);
		p.Btn_del.putMode(p, UPD_APRV, MCMode.DISABLE);
		p.Btn_upd_aprv.putMode(p, UPD_APRV, MCMode.ENABLE);
		p.Btn_del_aprv.putMode(p, UPD_APRV, MCMode.DISABLE);

	}

	/**
	 * [UPD_APRV]ステータスの[AprvItm]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_AprvItm(MSBFP_InspInstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[AprvBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_AprvBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[AprvEastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_AprvEastBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [UPD_APRV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APRV_EastBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_U_A]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__A_ScreenOpe(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_U_A]ステータスの[CndSchd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__A_CndSchd(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_U_A]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__A_Cnd(MSBFP_InspInstReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U_A, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_U_A, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, FIX_U_A, MCMode.REQUIRED);
		p.Cnd_srch_schd.putMode(p, FIX_U_A, MCMode.INVISIBLE);
		p.Cnd_srch_inst.putMode(p, FIX_U_A, MCMode.ENABLE);

	}

	/**
	 * [FIX_U_A]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__A_HdrTab(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_U_A]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__A_Hdr(MSBFP_InspInstReg p){
		p.Hdr_srch_mst.putMode(p, FIX_U_A, MCMode.INVISIBLE);
		p.Hdr_srch_std.putMode(p, FIX_U_A, MCMode.INVISIBLE);
		p.Hdr_insp_no.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_insp_schd_no.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_lmt_up_flg.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_in_prmt_insp_flg.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_lims_flg.putMode(p, FIX_U_A, MCMode.INVISIBLE);
		p.Hdr_last_lims_flg.putMode(p, FIX_U_A, MCMode.INVISIBLE);
		p.Hdr_itm_p_PPanel.putStatus(FIX_U_A, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_lot_no_p_PPanel.putStatus(FIX_U_A, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_loc_cd.putMode(p, FIX_U_A, MCMode.INVISIBLE);
		p.Hdr_loc_nm.putMode(p, FIX_U_A, MCMode.INVISIBLE);
		p.Hdr_to_site_cd.putMode(p, FIX_U_A, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_inst_dt.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_inst_usr_cd_p_PPanel.putStatus(FIX_U_A, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_st_dt_p_PPanel.putStatus(FIX_U_A, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_end_dt_p_PPanel.putStatus(FIX_U_A, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_master_dt.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_insp_ptn_cd.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_insp_ptn_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_insp_std_no.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_plnt_aprv_flg.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_spl_qty.putMode(p, FIX_U_A, MCMode.INVISIBLE);
		p.Hdr_base_unit_qty_p_PPanel.putStatus(FIX_U_A, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_base_unit_cd.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_base_unit_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_base_dec_place.putMode(p, FIX_U_A, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_flg.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_aprv_dt.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_aprv_tm.putMode(p, FIX_U_A, MCMode.INVISIBLE);
		p.Hdr_aprv_usr_cd_p_PPanel.putStatus(FIX_U_A, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_aprv_rsn_p_PPanel.putStatus(FIX_U_A, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
		p.Hdr_aprv_lims_flg.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_last_aprv_lims_flg.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, FIX_U_A, MCMode.INVISIBLE);
		p.Hdr_insp_bind_typ.putMode(p, FIX_U_A, MCMode.INVISIBLE);
		p.Hdr_is_invalid_insp_ptn_flg.putMode(p, FIX_U_A, MCMode.INVISIBLE);
		p.Hdr_prnt_flg.putMode(p, FIX_U_A, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U_A]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__A_SystemInfo(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_U_A]ステータスの[Aprv]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__A_Aprv(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_U_A]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__A_DtlTab(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_U_A]ステータスの[DtlStd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__A_DtlStd(MSBFP_InspInstReg p){
		p.columnDtlStd_insp_seq.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlStd_insp_point_cd.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlStd_insp_point_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlStd_insp_qlqn_typ.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlStd_insp_qlqn_typ_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlStd_ql_std_val.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlStd_trd_unit_cd.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlStd_trd_unit_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlStd_qn_int_digit.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlStd_qn_int_frac.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.DtlStd_qn_out_min_p_PPanel.putStatus(FIX_U_A, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_out_min_typ.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlStd_sign_out_min_typ_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.DtlStd_qn_in_min_p_PPanel.putStatus(FIX_U_A, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_in_min_typ.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_min_typ_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_max_typ.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_max_typ_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.DtlStd_qn_in_max_p_PPanel.putStatus(FIX_U_A, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_out_max_typ.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlStd_sign_out_max_typ_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.DtlStd_qn_out_max_p_PPanel.putStatus(FIX_U_A, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_intr_rmrks.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char1.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char2.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char3.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlStd_std_insp_inst_no.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlStd_add_point_flg.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlStd_data_crud_typ.putMode(p, FIX_U_A, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U_A]ステータスの[DtlSchd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__A_DtlSchd(MSBFP_InspInstReg p){
		p.columnDtlSchd_insp_schd_no.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.DtlSchd_pack_unit_qty_p_PPanel.putStatus(FIX_U_A, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSchd_pack_unit_cd.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_pack_unit_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_pack_dec_place.putMode(p, FIX_U_A, MCMode.INVISIBLE);
		p.DtlSchd_base_unit_qty_p_PPanel.putStatus(FIX_U_A, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlSchd_smpl_schd_qty_p_PPanel.putStatus(FIX_U_A, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlSchd_smpl_inst_qty_p_PPanel.putStatus(FIX_U_A, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSchd_base_unit_cd.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_base_unit_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_base_dec_place.putMode(p, FIX_U_A, MCMode.INVISIBLE);
		p.columnDtlSchd_loc_cd.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_loc_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_str_ln_cd.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_str_ln_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_gd_cd.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_gd_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.DtlSchd_st_dt_p_PPanel.putStatus(FIX_U_A, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.DtlSchd_end_dt_p_PPanel.putStatus(FIX_U_A, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtlSchd_master_dt.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_insp_cnt_rmrks.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no1.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no2.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no3.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no4.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_usr_id.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_usr_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_func_id.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_func_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_ts.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_usr_id.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_usr_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_func_id.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_func_nm.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_ts.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_srv_req_no.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_cntr.putMode(p, FIX_U_A, MCMode.INVISIBLE);
		p.columnDtlSchd_insp_inst_issue_typ.putMode(p, FIX_U_A, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U_A]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__A_Btn(MSBFP_InspInstReg p){
		p.Btn_prnt.putMode(p, FIX_U_A, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_U_A, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U_A, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U_A, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, FIX_U_A, MCMode.READ_ONLY);
		p.Btn_ins.putMode(p, FIX_U_A, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_U_A, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U_A, MCMode.DISABLE);
		p.Btn_upd_aprv.putMode(p, FIX_U_A, MCMode.DISABLE);
		p.Btn_del_aprv.putMode(p, FIX_U_A, MCMode.DISABLE);

	}

	/**
	 * [FIX_U_A]ステータスの[AprvItm]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__A_AprvItm(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_U_A]ステータスの[AprvBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__A_AprvBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_U_A]ステータスの[AprvEastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__A_AprvEastBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_U_A]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__A_EastBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBFP_InspInstReg p){

	}

	/**
	 * [DEL]ステータスの[CndSchd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_CndSchd(MSBFP_InspInstReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBFP_InspInstReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch_schd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_srch_inst.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HdrTab(MSBFP_InspInstReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MSBFP_InspInstReg p){
		p.Hdr_srch_mst.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_srch_std.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_insp_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_lmt_up_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_in_prmt_insp_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_lims_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Hdr_last_lims_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_lot_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_loc_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_loc_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_to_site_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_inst_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_inst_usr_cd_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_st_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_end_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_master_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_ptn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_std_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_plnt_aprv_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_spl_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_base_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_aprv_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_aprv_tm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_aprv_usr_cd_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_aprv_rsn_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
		p.Hdr_aprv_lims_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_last_aprv_lims_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_insp_bind_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_is_invalid_insp_ptn_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_prnt_flg.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitDEL_SystemInfo(MSBFP_InspInstReg p){

	}

	/**
	 * [DEL]ステータスの[Aprv]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Aprv(MSBFP_InspInstReg p){

	}

	/**
	 * [DEL]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlTab(MSBFP_InspInstReg p){

	}

	/**
	 * [DEL]ステータスの[DtlStd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlStd(MSBFP_InspInstReg p){
		p.columnDtlStd_insp_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStd_insp_point_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStd_insp_point_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStd_insp_qlqn_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStd_insp_qlqn_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStd_ql_std_val.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStd_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStd_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStd_qn_int_digit.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStd_qn_int_frac.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlStd_qn_out_min_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_out_min_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStd_sign_out_min_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlStd_qn_in_min_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_in_min_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_min_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_max_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_max_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlStd_qn_in_max_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_out_max_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStd_sign_out_max_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlStd_qn_out_max_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStd_std_insp_inst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStd_add_point_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlStd_data_crud_typ.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[DtlSchd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlSchd(MSBFP_InspInstReg p){
		p.columnDtlSchd_insp_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlSchd_pack_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSchd_pack_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_pack_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_pack_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.DtlSchd_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlSchd_smpl_schd_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlSchd_smpl_inst_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSchd_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_base_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlSchd_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_str_ln_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_str_ln_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_gd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_gd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlSchd_st_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.DtlSchd_end_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtlSchd_master_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_insp_cnt_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlSchd_insp_inst_issue_typ.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBFP_InspInstReg p){
		p.Btn_prnt.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Btn_ins.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_upd_aprv.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del_aprv.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[AprvItm]ブロックのモードの設定
	 */
	protected static void statusInitDEL_AprvItm(MSBFP_InspInstReg p){

	}

	/**
	 * [DEL]ステータスの[AprvBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_AprvBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [DEL]ステータスの[AprvEastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_AprvEastBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_D]ステータスの[CndSchd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_CndSchd(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBFP_InspInstReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch_schd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Cnd_srch_inst.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_HdrTab(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MSBFP_InspInstReg p){
		p.Hdr_srch_mst.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_srch_std.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_insp_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_schd_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_lmt_up_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_in_prmt_insp_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_lims_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_last_lims_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_lot_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_loc_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_loc_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_to_site_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_inst_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_inst_usr_cd_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_st_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_end_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_master_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_ptn_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_ptn_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_std_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_plnt_aprv_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_spl_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_base_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_base_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_base_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_base_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_aprv_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_aprv_tm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_aprv_usr_cd_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_aprv_rsn_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
		p.Hdr_aprv_lims_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_last_aprv_lims_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_insp_bind_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_is_invalid_insp_ptn_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_prnt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_SystemInfo(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_D]ステータスの[Aprv]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Aprv(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_D]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_DtlTab(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_D]ステータスの[DtlStd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_DtlStd(MSBFP_InspInstReg p){
		p.columnDtlStd_insp_seq.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlStd_insp_point_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlStd_insp_point_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlStd_insp_qlqn_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlStd_insp_qlqn_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlStd_ql_std_val.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlStd_trd_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlStd_trd_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlStd_qn_int_digit.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlStd_qn_int_frac.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.DtlStd_qn_out_min_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_out_min_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlStd_sign_out_min_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.DtlStd_qn_in_min_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_in_min_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_min_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_max_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_max_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.DtlStd_qn_in_max_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_out_max_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlStd_sign_out_max_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.DtlStd_qn_out_max_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlStd_std_insp_inst_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlStd_add_point_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlStd_data_crud_typ.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[DtlSchd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_DtlSchd(MSBFP_InspInstReg p){
		p.columnDtlSchd_insp_schd_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.DtlSchd_pack_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSchd_pack_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_pack_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_pack_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.DtlSchd_base_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlSchd_smpl_schd_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlSchd_smpl_inst_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSchd_base_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_base_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_base_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlSchd_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_str_ln_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_str_ln_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_gd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_gd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.DtlSchd_st_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.DtlSchd_end_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtlSchd_master_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_insp_cnt_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no4.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlSchd_insp_inst_issue_typ.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBFP_InspInstReg p){
		p.Btn_prnt.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Btn_ins.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_upd_aprv.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del_aprv.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[AprvItm]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_AprvItm(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_D]ステータスの[AprvBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_AprvBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_D]ステータスの[AprvEastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_AprvEastBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_ScreenOpe(MSBFP_InspInstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[CndSchd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_CndSchd(MSBFP_InspInstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Cnd(MSBFP_InspInstReg p){
		p.Cnd_ope_Group.putMode(p, DEL_APRV, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, DEL_APRV, MCMode.REQUIRED);
		p.Cnd_srch_schd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Cnd_srch_inst.putMode(p, DEL_APRV, MCMode.ENABLE);

	}

	/**
	 * [DEL_APRV]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_HdrTab(MSBFP_InspInstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Hdr(MSBFP_InspInstReg p){
		p.Hdr_srch_mst.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_srch_std.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_insp_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_schd_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_lmt_up_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_in_prmt_insp_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_lims_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_last_lims_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_itm_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_lot_no_p_PPanel.putStatus(DEL_APRV, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_loc_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_loc_nm.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_to_site_cd.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_inst_dt.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_inst_usr_cd_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_st_dt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_end_dt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_master_dt.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_ptn_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_ptn_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_std_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_plnt_aprv_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_spl_qty.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_base_unit_qty_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_base_unit_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_base_unit_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_base_dec_place.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_aprv_dt.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_aprv_tm.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_aprv_usr_cd_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_aprv_rsn_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.REQUIRED);
		p.Hdr_aprv_lims_flg.putMode(p, DEL_APRV, MCMode.REQUIRED);
		p.Hdr_last_aprv_lims_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_insp_bind_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_is_invalid_insp_ptn_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Hdr_prnt_flg.putMode(p, DEL_APRV, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_APRV]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_SystemInfo(MSBFP_InspInstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[Aprv]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Aprv(MSBFP_InspInstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_DtlTab(MSBFP_InspInstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[DtlStd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_DtlStd(MSBFP_InspInstReg p){
		p.columnDtlStd_insp_seq.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_insp_point_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_insp_point_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_insp_qlqn_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_insp_qlqn_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_ql_std_val.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_trd_unit_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_trd_unit_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_qn_int_digit.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_qn_int_frac.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.DtlStd_qn_out_min_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_out_min_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_sign_out_min_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.DtlStd_qn_in_min_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_in_min_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_min_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_max_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_max_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.DtlStd_qn_in_max_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_out_max_typ.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_sign_out_max_typ_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.DtlStd_qn_out_max_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_intr_rmrks.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char1.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char2.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char3.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_std_insp_inst_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_add_point_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlStd_data_crud_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_APRV]ステータスの[DtlSchd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_DtlSchd(MSBFP_InspInstReg p){
		p.columnDtlSchd_insp_schd_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.DtlSchd_pack_unit_qty_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSchd_pack_unit_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_pack_unit_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_pack_dec_place.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.DtlSchd_base_unit_qty_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlSchd_smpl_schd_qty_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlSchd_smpl_inst_qty_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSchd_base_unit_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_base_unit_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_base_dec_place.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtlSchd_loc_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_loc_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_str_ln_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_str_ln_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_gd_cd.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_gd_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.DtlSchd_st_dt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.DtlSchd_end_dt_p_PPanel.putStatus(DEL_APRV, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtlSchd_master_dt.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_insp_cnt_rmrks.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no1.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no2.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no3.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no4.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_usr_id.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_usr_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_func_id.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_func_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_ts.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_usr_id.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_usr_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_func_id.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_func_nm.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_ts.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_srv_req_no.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_cntr.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.columnDtlSchd_insp_inst_issue_typ.putMode(p, DEL_APRV, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_APRV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_Btn(MSBFP_InspInstReg p){
		p.Btn_prnt.putMode(p, DEL_APRV, MCMode.DISABLE);
		p.Btn_radd.putMode(p, DEL_APRV, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL_APRV, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL_APRV, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, DEL_APRV, MCMode.READ_ONLY);
		p.Btn_ins.putMode(p, DEL_APRV, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, DEL_APRV, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL_APRV, MCMode.DISABLE);
		p.Btn_upd_aprv.putMode(p, DEL_APRV, MCMode.DISABLE);
		p.Btn_del_aprv.putMode(p, DEL_APRV, MCMode.ENABLE);

	}

	/**
	 * [DEL_APRV]ステータスの[AprvItm]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_AprvItm(MSBFP_InspInstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[AprvBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_AprvBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[AprvEastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_AprvEastBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [DEL_APRV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APRV_EastBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_D_A]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__A_ScreenOpe(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_D_A]ステータスの[CndSchd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__A_CndSchd(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_D_A]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__A_Cnd(MSBFP_InspInstReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D_A, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_D_A, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, FIX_D_A, MCMode.REQUIRED);
		p.Cnd_srch_schd.putMode(p, FIX_D_A, MCMode.INVISIBLE);
		p.Cnd_srch_inst.putMode(p, FIX_D_A, MCMode.ENABLE);

	}

	/**
	 * [FIX_D_A]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__A_HdrTab(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_D_A]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__A_Hdr(MSBFP_InspInstReg p){
		p.Hdr_srch_mst.putMode(p, FIX_D_A, MCMode.INVISIBLE);
		p.Hdr_srch_std.putMode(p, FIX_D_A, MCMode.INVISIBLE);
		p.Hdr_insp_no.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_insp_schd_no.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_lmt_up_flg.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_in_prmt_insp_flg.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_lims_flg.putMode(p, FIX_D_A, MCMode.INVISIBLE);
		p.Hdr_last_lims_flg.putMode(p, FIX_D_A, MCMode.INVISIBLE);
		p.Hdr_itm_p_PPanel.putStatus(FIX_D_A, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_lot_no_p_PPanel.putStatus(FIX_D_A, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_loc_cd.putMode(p, FIX_D_A, MCMode.INVISIBLE);
		p.Hdr_loc_nm.putMode(p, FIX_D_A, MCMode.INVISIBLE);
		p.Hdr_to_site_cd.putMode(p, FIX_D_A, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_inst_dt.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_inst_usr_cd_p_PPanel.putStatus(FIX_D_A, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_st_dt_p_PPanel.putStatus(FIX_D_A, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_end_dt_p_PPanel.putStatus(FIX_D_A, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_master_dt.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_insp_ptn_cd.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_insp_ptn_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_insp_std_no.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_plnt_aprv_flg.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_spl_qty.putMode(p, FIX_D_A, MCMode.INVISIBLE);
		p.Hdr_base_unit_qty_p_PPanel.putStatus(FIX_D_A, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_base_unit_cd.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_base_unit_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_base_dec_place.putMode(p, FIX_D_A, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_flg.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_aprv_dt.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_aprv_tm.putMode(p, FIX_D_A, MCMode.INVISIBLE);
		p.Hdr_aprv_usr_cd_p_PPanel.putStatus(FIX_D_A, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_aprv_rsn_p_PPanel.putStatus(FIX_D_A, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.REQUIRED);
		p.Hdr_aprv_lims_flg.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_last_aprv_lims_flg.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, FIX_D_A, MCMode.INVISIBLE);
		p.Hdr_insp_bind_typ.putMode(p, FIX_D_A, MCMode.INVISIBLE);
		p.Hdr_is_invalid_insp_ptn_flg.putMode(p, FIX_D_A, MCMode.INVISIBLE);
		p.Hdr_prnt_flg.putMode(p, FIX_D_A, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D_A]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__A_SystemInfo(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_D_A]ステータスの[Aprv]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__A_Aprv(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_D_A]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__A_DtlTab(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_D_A]ステータスの[DtlStd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__A_DtlStd(MSBFP_InspInstReg p){
		p.columnDtlStd_insp_seq.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlStd_insp_point_cd.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlStd_insp_point_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlStd_insp_qlqn_typ.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlStd_insp_qlqn_typ_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlStd_ql_std_val.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlStd_trd_unit_cd.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlStd_trd_unit_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlStd_qn_int_digit.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlStd_qn_int_frac.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.DtlStd_qn_out_min_p_PPanel.putStatus(FIX_D_A, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_out_min_typ.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlStd_sign_out_min_typ_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.DtlStd_qn_in_min_p_PPanel.putStatus(FIX_D_A, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_in_min_typ.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_min_typ_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_max_typ.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_max_typ_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.DtlStd_qn_in_max_p_PPanel.putStatus(FIX_D_A, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_out_max_typ.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlStd_sign_out_max_typ_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.DtlStd_qn_out_max_p_PPanel.putStatus(FIX_D_A, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_intr_rmrks.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char1.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char2.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char3.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlStd_std_insp_inst_no.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlStd_add_point_flg.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlStd_data_crud_typ.putMode(p, FIX_D_A, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D_A]ステータスの[DtlSchd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__A_DtlSchd(MSBFP_InspInstReg p){
		p.columnDtlSchd_insp_schd_no.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.DtlSchd_pack_unit_qty_p_PPanel.putStatus(FIX_D_A, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSchd_pack_unit_cd.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_pack_unit_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_pack_dec_place.putMode(p, FIX_D_A, MCMode.INVISIBLE);
		p.DtlSchd_base_unit_qty_p_PPanel.putStatus(FIX_D_A, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlSchd_smpl_schd_qty_p_PPanel.putStatus(FIX_D_A, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlSchd_smpl_inst_qty_p_PPanel.putStatus(FIX_D_A, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSchd_base_unit_cd.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_base_unit_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_base_dec_place.putMode(p, FIX_D_A, MCMode.INVISIBLE);
		p.columnDtlSchd_loc_cd.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_loc_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_str_ln_cd.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_str_ln_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_gd_cd.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_gd_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.DtlSchd_st_dt_p_PPanel.putStatus(FIX_D_A, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.DtlSchd_end_dt_p_PPanel.putStatus(FIX_D_A, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtlSchd_master_dt.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_insp_cnt_rmrks.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no1.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no2.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no3.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no4.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_usr_id.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_usr_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_func_id.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_func_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_ts.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_usr_id.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_usr_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_func_id.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_func_nm.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_ts.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_srv_req_no.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_cntr.putMode(p, FIX_D_A, MCMode.INVISIBLE);
		p.columnDtlSchd_insp_inst_issue_typ.putMode(p, FIX_D_A, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D_A]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__A_Btn(MSBFP_InspInstReg p){
		p.Btn_prnt.putMode(p, FIX_D_A, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_D_A, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_D_A, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_D_A, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, FIX_D_A, MCMode.READ_ONLY);
		p.Btn_ins.putMode(p, FIX_D_A, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_D_A, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_D_A, MCMode.DISABLE);
		p.Btn_upd_aprv.putMode(p, FIX_D_A, MCMode.DISABLE);
		p.Btn_del_aprv.putMode(p, FIX_D_A, MCMode.DISABLE);

	}

	/**
	 * [FIX_D_A]ステータスの[AprvItm]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__A_AprvItm(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_D_A]ステータスの[AprvBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__A_AprvBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_D_A]ステータスの[AprvEastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__A_AprvEastBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [FIX_D_A]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__A_EastBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBFP_InspInstReg p){

	}

	/**
	 * [REF]ステータスの[CndSchd]ブロックのモードの設定
	 */
	protected static void statusInitREF_CndSchd(MSBFP_InspInstReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBFP_InspInstReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch_schd.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_srch_inst.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBFP_InspInstReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBFP_InspInstReg p){
		p.Hdr_srch_mst.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_srch_std.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_insp_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_lmt_up_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_in_prmt_insp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_lims_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_last_lims_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_lot_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_loc_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_loc_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_to_site_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_inst_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_inst_usr_cd_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_st_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_end_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_master_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_std_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_plnt_aprv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_spl_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_base_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_aprv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_aprv_tm.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_aprv_usr_cd_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_aprv_rsn_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
		p.Hdr_aprv_lims_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_last_aprv_lims_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_insp_bind_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_is_invalid_insp_ptn_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_prnt_flg.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitREF_SystemInfo(MSBFP_InspInstReg p){

	}

	/**
	 * [REF]ステータスの[Aprv]ブロックのモードの設定
	 */
	protected static void statusInitREF_Aprv(MSBFP_InspInstReg p){

	}

	/**
	 * [REF]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlTab(MSBFP_InspInstReg p){

	}

	/**
	 * [REF]ステータスの[DtlStd]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlStd(MSBFP_InspInstReg p){
		p.columnDtlStd_insp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStd_insp_point_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStd_insp_point_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStd_insp_qlqn_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStd_insp_qlqn_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStd_ql_std_val.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStd_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStd_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStd_qn_int_digit.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStd_qn_int_frac.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlStd_qn_out_min_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_out_min_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStd_sign_out_min_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlStd_qn_in_min_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_in_min_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_min_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_max_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStd_sign_in_max_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlStd_qn_in_max_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_sign_out_max_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStd_sign_out_max_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlStd_qn_out_max_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtlStd_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStd_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStd_std_insp_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStd_add_point_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlStd_data_crud_typ.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[DtlSchd]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlSchd(MSBFP_InspInstReg p){
		p.columnDtlSchd_insp_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlSchd_pack_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSchd_pack_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_pack_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_pack_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.DtlSchd_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlSchd_smpl_schd_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlSchd_smpl_inst_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSchd_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_base_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlSchd_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_str_ln_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_str_ln_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_gd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_gd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlSchd_st_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.DtlSchd_end_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtlSchd_master_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_insp_cnt_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_src_no4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSchd_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlSchd_insp_inst_issue_typ.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBFP_InspInstReg p){
		p.Btn_prnt.putMode(p, REF, MCMode.ENABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Btn_ins.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_aprv.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del_aprv.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[AprvItm]ブロックのモードの設定
	 */
	protected static void statusInitREF_AprvItm(MSBFP_InspInstReg p){

	}

	/**
	 * [REF]ステータスの[AprvBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_AprvBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [REF]ステータスの[AprvEastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_AprvEastBtn(MSBFP_InspInstReg p){

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBFP_InspInstReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return FIX_I;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBFP_InspInstReg_MC.setTableConfigDtlStd((MSBFP_InspInstReg)this);
		MSBFP_InspInstReg_MC.setTableConfigDtlSchd((MSBFP_InspInstReg)this);
	}

	/**
	 * [DtlStd]ブロックのTableの設定
	 */
	protected static void setTableConfigDtlStd(MSBFP_InspInstReg p) {
		p.columnDtlStd_insp_seq.setMeta(mcframe.clientMSBF.MSBFP0040.DtlStdR.insp_seq_META);
		p.DtlStdTable.addColumnConfig(p.columnDtlStd_insp_seq);
		p.columnDtlStd_insp_point_cd.setMeta(mcframe.clientMSBF.MSBFP0040.DtlStdR.insp_point_cd_META);
		p.columnDtlStd_insp_point_cd.addLinkBeans(p.columnDtlStd_insp_point_nm,p.columnDtlStd_insp_qlqn_typ,p.columnDtlStd_trd_unit_cd);
		p.DtlStdTable.addColumnConfig(p.columnDtlStd_insp_point_cd);
		p.columnDtlStd_insp_point_nm.setMeta(mcframe.clientMSBF.MSBFP0040.DtlStdR.insp_point_nm_META);
		p.DtlStdTable.addColumnConfig(p.columnDtlStd_insp_point_nm);
		p.columnDtlStd_insp_qlqn_typ.setMeta(mcframe.clientMSBF.MSBFP0040.DtlStdR.insp_qlqn_typ_META);
		p.columnDtlStd_insp_qlqn_typ.addLinkBeans(p.columnDtlStd_insp_qlqn_typ_nm);
		p.DtlStdTable.addColumnConfig(p.columnDtlStd_insp_qlqn_typ);
		p.columnDtlStd_insp_qlqn_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0040.DtlStdR.insp_qlqn_typ_nm_META);
		p.DtlStdTable.addColumnConfig(p.columnDtlStd_insp_qlqn_typ_nm);
		p.columnDtlStd_ql_std_val.setMeta(mcframe.clientMSBF.MSBFP0040.DtlStdR.ql_std_val_META);
		p.DtlStdTable.addColumnConfig(p.columnDtlStd_ql_std_val);
		p.columnDtlStd_trd_unit_cd.setMeta(mcframe.clientMSBF.MSBFP0040.DtlStdR.trd_unit_cd_META);
		p.columnDtlStd_trd_unit_cd.addLinkBeans(p.columnDtlStd_trd_unit_nm);
		p.DtlStdTable.addColumnConfig(p.columnDtlStd_trd_unit_cd);
		p.columnDtlStd_trd_unit_nm.setMeta(mcframe.clientMSBF.MSBFP0040.DtlStdR.trd_unit_nm_META);
		p.DtlStdTable.addColumnConfig(p.columnDtlStd_trd_unit_nm);
		p.columnDtlStd_qn_int_digit.setMeta(mcframe.clientMSBF.MSBFP0040.DtlStdR.qn_int_digit_META);
		p.DtlStdTable.addColumnConfig(p.columnDtlStd_qn_int_digit);
		p.columnDtlStd_qn_int_frac.setMeta(mcframe.clientMSBF.MSBFP0040.DtlStdR.qn_int_frac_META);
		p.DtlStdTable.addColumnConfig(p.columnDtlStd_qn_int_frac);
		p.DtlStdTable.addTable(p.DtlStd_qn_out_min_p_PPanel.QnInspValTable);
		p.DtlStd_qn_out_min_p_PPanel.columnQnInspVal_qn_insp_val.setMinusEnable(true);
		p.columnDtlStd_sign_out_min_typ.setMeta(mcframe.clientMSBF.MSBFP0040.DtlStdR.sign_out_min_typ_META);
		p.columnDtlStd_sign_out_min_typ.addLinkBeans(p.columnDtlStd_sign_out_min_typ_nm);
		p.DtlStdTable.addColumnConfig(p.columnDtlStd_sign_out_min_typ);
		p.columnDtlStd_sign_out_min_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0040.DtlStdR.sign_out_min_typ_nm_META);
		p.DtlStdTable.addColumnConfig(p.columnDtlStd_sign_out_min_typ_nm);
		p.DtlStdTable.addTable(p.DtlStd_qn_in_min_p_PPanel.QnInspValTable);
		p.DtlStd_qn_in_min_p_PPanel.columnQnInspVal_qn_insp_val.setMinusEnable(true);
		p.columnDtlStd_sign_in_min_typ.setMeta(mcframe.clientMSBF.MSBFP0040.DtlStdR.sign_in_min_typ_META);
		p.columnDtlStd_sign_in_min_typ.addLinkBeans(p.columnDtlStd_sign_in_min_typ_nm);
		p.DtlStdTable.addColumnConfig(p.columnDtlStd_sign_in_min_typ);
		p.columnDtlStd_sign_in_min_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0040.DtlStdR.sign_in_min_typ_nm_META);
		p.DtlStdTable.addColumnConfig(p.columnDtlStd_sign_in_min_typ_nm);
		p.columnDtlStd_sign_in_max_typ.setMeta(mcframe.clientMSBF.MSBFP0040.DtlStdR.sign_in_max_typ_META);
		p.columnDtlStd_sign_in_max_typ.addLinkBeans(p.columnDtlStd_sign_in_max_typ_nm);
		p.DtlStdTable.addColumnConfig(p.columnDtlStd_sign_in_max_typ);
		p.columnDtlStd_sign_in_max_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0040.DtlStdR.sign_in_max_typ_nm_META);
		p.DtlStdTable.addColumnConfig(p.columnDtlStd_sign_in_max_typ_nm);
		p.DtlStdTable.addTable(p.DtlStd_qn_in_max_p_PPanel.QnInspValTable);
		p.DtlStd_qn_in_max_p_PPanel.columnQnInspVal_qn_insp_val.setMinusEnable(true);
		p.columnDtlStd_sign_out_max_typ.setMeta(mcframe.clientMSBF.MSBFP0040.DtlStdR.sign_out_max_typ_META);
		p.columnDtlStd_sign_out_max_typ.addLinkBeans(p.columnDtlStd_sign_out_max_typ_nm);
		p.DtlStdTable.addColumnConfig(p.columnDtlStd_sign_out_max_typ);
		p.columnDtlStd_sign_out_max_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0040.DtlStdR.sign_out_max_typ_nm_META);
		p.DtlStdTable.addColumnConfig(p.columnDtlStd_sign_out_max_typ_nm);
		p.DtlStdTable.addTable(p.DtlStd_qn_out_max_p_PPanel.QnInspValTable);
		p.DtlStd_qn_out_max_p_PPanel.columnQnInspVal_qn_insp_val.setMinusEnable(true);
		p.columnDtlStd_intr_rmrks.setMeta(mcframe.clientMSBF.MSBFP0040.DtlStdR.intr_rmrks_META);
		p.DtlStdTable.addColumnConfig(p.columnDtlStd_intr_rmrks);
		p.columnDtlStd_sub_char1.setMeta(mcframe.clientMSBF.MSBFP0040.DtlStdR.sub_char1_META);
		p.DtlStdTable.addColumnConfig(p.columnDtlStd_sub_char1);
		p.columnDtlStd_sub_char2.setMeta(mcframe.clientMSBF.MSBFP0040.DtlStdR.sub_char2_META);
		p.DtlStdTable.addColumnConfig(p.columnDtlStd_sub_char2);
		p.columnDtlStd_sub_char3.setMeta(mcframe.clientMSBF.MSBFP0040.DtlStdR.sub_char3_META);
		p.DtlStdTable.addColumnConfig(p.columnDtlStd_sub_char3);
		p.columnDtlStd_std_insp_inst_no.setMeta(mcframe.clientMSBF.MSBFP0040.DtlStdR.std_insp_inst_no_META);
		p.DtlStdTable.addColumnConfig(p.columnDtlStd_std_insp_inst_no);
		p.columnDtlStd_add_point_flg.setMeta(mcframe.clientMSBF.MSBFP0040.DtlStdR.add_point_flg_META);
		p.DtlStdTable.addColumnConfig(p.columnDtlStd_add_point_flg);
		p.columnDtlStd_data_crud_typ.setMeta(mcframe.clientMSBF.MSBFP0040.DtlStdR.data_crud_typ_META);
		p.DtlStdTable.addColumnConfig(p.columnDtlStd_data_crud_typ);
	}

	/**
	 * [DtlSchd]ブロックのTableの設定
	 */
	protected static void setTableConfigDtlSchd(MSBFP_InspInstReg p) {
		p.columnDtlSchd_insp_schd_no.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.insp_schd_no_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_insp_schd_no);
		p.DtlSchdTable.addTable(p.DtlSchd_pack_unit_qty_p_PPanel.QtyTable);
		p.columnDtlSchd_pack_unit_cd.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.pack_unit_cd_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_pack_unit_cd);
		p.columnDtlSchd_pack_unit_nm.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.pack_unit_nm_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_pack_unit_nm);
		p.columnDtlSchd_pack_dec_place.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.pack_dec_place_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_pack_dec_place);
		p.DtlSchdTable.addTable(p.DtlSchd_base_unit_qty_p_PPanel.QtyTable);
		p.DtlSchdTable.addTable(p.DtlSchd_smpl_schd_qty_p_PPanel.QtyTable);
		p.DtlSchdTable.addTable(p.DtlSchd_smpl_inst_qty_p_PPanel.QtyTable);
		p.columnDtlSchd_base_unit_cd.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.base_unit_cd_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_base_unit_cd);
		p.columnDtlSchd_base_unit_nm.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.base_unit_nm_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_base_unit_nm);
		p.columnDtlSchd_base_dec_place.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.base_dec_place_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_base_dec_place);
		p.columnDtlSchd_loc_cd.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.loc_cd_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_loc_cd);
		p.columnDtlSchd_loc_nm.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.loc_nm_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_loc_nm);
		p.columnDtlSchd_str_ln_cd.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.str_ln_cd_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_str_ln_cd);
		p.columnDtlSchd_str_ln_nm.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.str_ln_nm_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_str_ln_nm);
		p.columnDtlSchd_gd_cd.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.gd_cd_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_gd_cd);
		p.columnDtlSchd_gd_nm.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.gd_nm_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_gd_nm);
		p.DtlSchdTable.addTable(p.DtlSchd_st_dt_p_PPanel.YmdHmTable);
		p.DtlSchdTable.addTable(p.DtlSchd_end_dt_p_PPanel.YmdHmTable);
		p.columnDtlSchd_master_dt.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.master_dt_META);
		p.columnDtlSchd_master_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_master_dt);
		p.columnDtlSchd_insp_cnt_rmrks.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.insp_cnt_rmrks_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_insp_cnt_rmrks);
		p.columnDtlSchd_src_no1.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.src_no1_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_src_no1);
		p.columnDtlSchd_src_no2.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.src_no2_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_src_no2);
		p.columnDtlSchd_src_no3.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.src_no3_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_src_no3);
		p.columnDtlSchd_src_no4.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.src_no4_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_src_no4);
		p.columnDtlSchd_ins_usr_id.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.ins_usr_id_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_ins_usr_id);
		p.columnDtlSchd_ins_usr_nm.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.ins_usr_nm_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_ins_usr_nm);
		p.columnDtlSchd_ins_func_id.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.ins_func_id_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_ins_func_id);
		p.columnDtlSchd_ins_func_nm.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.ins_func_nm_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_ins_func_nm);
		p.columnDtlSchd_ins_ts.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.ins_ts_META);
		p.columnDtlSchd_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_ins_ts);
		p.columnDtlSchd_upd_usr_id.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.upd_usr_id_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_upd_usr_id);
		p.columnDtlSchd_upd_usr_nm.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.upd_usr_nm_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_upd_usr_nm);
		p.columnDtlSchd_upd_func_id.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.upd_func_id_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_upd_func_id);
		p.columnDtlSchd_upd_func_nm.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.upd_func_nm_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_upd_func_nm);
		p.columnDtlSchd_upd_ts.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.upd_ts_META);
		p.columnDtlSchd_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_upd_ts);
		p.columnDtlSchd_upd_srv_req_no.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.upd_srv_req_no_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_upd_srv_req_no);
		p.columnDtlSchd_upd_cntr.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.upd_cntr_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_upd_cntr);
		p.columnDtlSchd_insp_inst_issue_typ.setMeta(mcframe.clientMSBF.MSBFP0040.DtlSchdR.insp_inst_issue_typ_META);
		p.DtlSchdTable.addColumnConfig(p.columnDtlSchd_insp_inst_issue_typ);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_srch_tgt_typ_nm.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_srch_tgt_typ_nm.getListConfig().setPutter(getCnd_srch_tgt_typ_nm_ListPutter());
		Hdr_inst_usr_cd_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_inst_usr_cd_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getHdr_inst_usr_cd_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		Hdr_insp_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_insp_ptn_cd.getListConfig().setPutter(getHdr_insp_ptn_cd_ListPutter());
		Hdr_insp_mtd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_insp_mtd_typ.getListConfig().setPutter(getHdr_insp_mtd_typ_ListPutter());
		Hdr_insp_aprv_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_insp_aprv_sts_typ.getListConfig().setPutter(getHdr_insp_aprv_sts_typ_ListPutter());
		Hdr_aprv_usr_cd_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_aprv_usr_cd_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getHdr_aprv_usr_cd_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		columnDtlStd_insp_point_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlStd_insp_point_cd.getListConfig().setPutter(getDtlStd_insp_point_cd_ListPutter());
		columnDtlStd_insp_qlqn_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlStd_insp_qlqn_typ.getListConfig().setPutter(getDtlStd_insp_qlqn_typ_ListPutter());
		columnDtlStd_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlStd_trd_unit_cd.getListConfig().setPutter(getDtlStd_trd_unit_cd_ListPutter());
		columnDtlStd_sign_out_min_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlStd_sign_out_min_typ.getListConfig().setPutter(getDtlStd_sign_out_min_typ_ListPutter());
		columnDtlStd_sign_in_min_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlStd_sign_in_min_typ.getListConfig().setPutter(getDtlStd_sign_in_min_typ_ListPutter());
		columnDtlStd_sign_in_max_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlStd_sign_in_max_typ.getListConfig().setPutter(getDtlStd_sign_in_max_typ_ListPutter());
		columnDtlStd_sign_out_max_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlStd_sign_out_max_typ.getListConfig().setPutter(getDtlStd_sign_out_max_typ_ListPutter());
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
	 * この画面を[INS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINSStatus() {
		status = INS;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_I]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_IStatus() {
		status = FIX_I;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPDStatus() {
		status = UPD;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_U]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_UStatus() {
		status = FIX_U;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_APRV]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_APRVStatus() {
		status = UPD_APRV;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_U_A]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_U_AStatus() {
		status = FIX_U_A;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDELStatus() {
		status = DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_D]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_DStatus() {
		status = FIX_D;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL_APRV]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_APRVStatus() {
		status = DEL_APRV;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_D_A]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_D_AStatus() {
		status = FIX_D_A;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREFStatus() {
		status = REF;
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
		else if (INS.equals(status)) {
			setINSStatus();
		}
		else if (FIX_I.equals(status)) {
			setFIX_IStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (UPD_APRV.equals(status)) {
			setUPD_APRVStatus();
		}
		else if (FIX_U_A.equals(status)) {
			setFIX_U_AStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (FIX_D.equals(status)) {
			setFIX_DStatus();
		}
		else if (DEL_APRV.equals(status)) {
			setDEL_APRVStatus();
		}
		else if (FIX_D_A.equals(status)) {
			setFIX_D_AStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * [Cnd_srch_tgt_typ_nm_ListPutter]の作成
	 */
	protected MCListPutter createCnd_srch_tgt_typ_nm_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Hdr_inst_usr_cd_p_PPanel_UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_inst_usr_cd_p_PPanel_UsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Hdr_insp_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_insp_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmInspPtn");
		return lp;
	}
	 
	/**
	 * [Hdr_insp_mtd_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_insp_mtd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.InspMtdTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_insp_aprv_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_insp_aprv_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Hdr_aprv_usr_cd_p_PPanel_UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_aprv_usr_cd_p_PPanel_UsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [DtlStd_insp_point_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtlStd_insp_point_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.InspPoint");
		return lp;
	}
	 
	/**
	 * [DtlStd_insp_qlqn_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtlStd_insp_qlqn_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.InspQlqnTyp");
		return lp;
	}
	 
	/**
	 * [DtlStd_trd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtlStd_trd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Unit");
		return lp;
	}
	 
	/**
	 * [DtlStd_sign_out_min_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtlStd_sign_out_min_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SignTyp");
		return lp;
	}
	 
	/**
	 * [DtlStd_sign_in_min_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtlStd_sign_in_min_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SignTyp");
		return lp;
	}
	 
	/**
	 * [DtlStd_sign_in_max_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtlStd_sign_in_max_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SignTyp");
		return lp;
	}
	 
	/**
	 * [DtlStd_sign_out_max_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtlStd_sign_out_max_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SignTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_srch_tgt_typ_nm) return getCnd_srch_tgt_typ_nm(row, info);
		if(combo == Hdr_inst_usr_cd_p_PPanel.UsrDpt_dpt_cd) return getHdr_inst_usr_cd_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == Hdr_insp_ptn_cd) return getHdr_insp_ptn_cd(row, info);
		if(combo == Hdr_insp_mtd_typ) return getHdr_insp_mtd_typ(row, info);
		if(combo == Hdr_insp_aprv_sts_typ) return getHdr_insp_aprv_sts_typ(row, info);
		if(combo == Hdr_aprv_usr_cd_p_PPanel.UsrDpt_dpt_cd) return getHdr_aprv_usr_cd_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == columnDtlStd_insp_point_cd) return getDtlStd_insp_point_cd(row, info);
		if(combo == columnDtlStd_insp_qlqn_typ) return getDtlStd_insp_qlqn_typ(row, info);
		if(combo == columnDtlStd_trd_unit_cd) return getDtlStd_trd_unit_cd(row, info);
		if(combo == columnDtlStd_sign_out_min_typ) return getDtlStd_sign_out_min_typ(row, info);
		if(combo == columnDtlStd_sign_in_min_typ) return getDtlStd_sign_in_min_typ(row, info);
		if(combo == columnDtlStd_sign_in_max_typ) return getDtlStd_sign_in_max_typ(row, info);
		if(combo == columnDtlStd_sign_out_max_typ) return getDtlStd_sign_out_max_typ(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch_schd) doCnd_srch_schd(info);
		else if (ap == Cnd_srch_inst) doCnd_srch_inst(info);
		else if (ap == Hdr_srch_mst) doHdr_srch_mst(info);
		else if (ap == Hdr_srch_std) doHdr_srch_std(info);
		else if (ap == Btn_prnt) doBtn_prnt(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_ins) doBtn_ins(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
		else if (ap == Btn_upd_aprv) doBtn_upd_aprv(info);
		else if (ap == Btn_del_aprv) doBtn_del_aprv(info);
	}

	/**
	 * [Cnd]パネルの[srch_schd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_schd(MCEventInfo info);

	/**
	 * [Cnd]パネルの[srch_inst]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_inst(MCEventInfo info);

	/**
	 * [Hdr]パネルの[srch_mst]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doHdr_srch_mst(MCEventInfo info);

	/**
	 * [Hdr]パネルの[srch_std]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doHdr_srch_std(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt(MCEventInfo info);

	/**
	 * [Btn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_radd(MCEventInfo info);

	/**
	 * [Btn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rdel(MCEventInfo info);

	/**
	 * [Btn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[ins]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

	/**
	 * [Btn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_aprv]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_aprv(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_aprv]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_aprv(MCEventInfo info);

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
		if (vc == HdrTabTab) return doHdrTab_VC(info);
		if (vc == DtlTabTab) return doDtlTab_VC(info);
		if (vc == DtlStdTable) return doDtlStd_VC(info);
		if (vc == DtlSchdTable) return doDtlSchd_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_srch_tgt_typ) return doCnd_srch_tgt_typ_VC(info);
		if (vc == Cnd_srch_tgt_typ_nm) return doCnd_srch_tgt_typ_nm_VC(info);
		if (vc == Cnd_srch_tgt_no) return doCnd_srch_tgt_no_VC(info);
		if (vc == Hdr_insp_no) return doHdr_insp_no_VC(info);
		if (vc == Hdr_insp_schd_no) return doHdr_insp_schd_no_VC(info);
		if (vc == Hdr_insp_freq) return doHdr_insp_freq_VC(info);
		if (vc == Hdr_insp_sts_typ) return doHdr_insp_sts_typ_VC(info);
		if (vc == Hdr_insp_sts_typ_nm) return doHdr_insp_sts_typ_nm_VC(info);
		if (vc == Hdr_insp_typ) return doHdr_insp_typ_VC(info);
		if (vc == Hdr_insp_typ_nm) return doHdr_insp_typ_nm_VC(info);
		if (vc == Hdr_lmt_up_flg) return doHdr_lmt_up_flg_VC(info);
		if (vc == Hdr_in_prmt_insp_flg) return doHdr_in_prmt_insp_flg_VC(info);
		if (vc == Hdr_lims_flg) return doHdr_lims_flg_VC(info);
		if (vc == Hdr_last_lims_flg) return doHdr_last_lims_flg_VC(info);
		if (vc == Hdr_ver_no) return doHdr_ver_no_VC(info);
		if (vc == Hdr_bp_lot_no) return doHdr_bp_lot_no_VC(info);
		if (vc == Hdr_loc_cd) return doHdr_loc_cd_VC(info);
		if (vc == Hdr_loc_nm) return doHdr_loc_nm_VC(info);
		if (vc == Hdr_to_site_cd) return doHdr_to_site_cd_VC(info);
		if (vc == Hdr_mfg_loc_cd) return doHdr_mfg_loc_cd_VC(info);
		if (vc == Hdr_mfg_loc_nm) return doHdr_mfg_loc_nm_VC(info);
		if (vc == Hdr_sppl_cd) return doHdr_sppl_cd_VC(info);
		if (vc == Hdr_sppl_nm) return doHdr_sppl_nm_VC(info);
		if (vc == Hdr_maker_cd) return doHdr_maker_cd_VC(info);
		if (vc == Hdr_maker_nm) return doHdr_maker_nm_VC(info);
		if (vc == Hdr_inst_dt) return doHdr_inst_dt_VC(info);
		if (vc == Hdr_master_dt) return doHdr_master_dt_VC(info);
		if (vc == Hdr_insp_ptn_cd) return doHdr_insp_ptn_cd_VC(info);
		if (vc == Hdr_insp_ptn_nm) return doHdr_insp_ptn_nm_VC(info);
		if (vc == Hdr_insp_mtd_typ) return doHdr_insp_mtd_typ_VC(info);
		if (vc == Hdr_insp_mtd_typ_nm) return doHdr_insp_mtd_typ_nm_VC(info);
		if (vc == Hdr_insp_std_no) return doHdr_insp_std_no_VC(info);
		if (vc == Hdr_std_req_flg) return doHdr_std_req_flg_VC(info);
		if (vc == Hdr_std_cnf_req_flg) return doHdr_std_cnf_req_flg_VC(info);
		if (vc == Hdr_plnt_aprv_flg) return doHdr_plnt_aprv_flg_VC(info);
		if (vc == Hdr_spl_qty) return doHdr_spl_qty_VC(info);
		if (vc == Hdr_base_unit_cd) return doHdr_base_unit_cd_VC(info);
		if (vc == Hdr_base_unit_nm) return doHdr_base_unit_nm_VC(info);
		if (vc == Hdr_base_dec_place) return doHdr_base_dec_place_VC(info);
		if (vc == Hdr_intr_rmrks) return doHdr_intr_rmrks_VC(info);
		if (vc == Hdr_sub_char1) return doHdr_sub_char1_VC(info);
		if (vc == Hdr_sub_char2) return doHdr_sub_char2_VC(info);
		if (vc == Hdr_sub_char3) return doHdr_sub_char3_VC(info);
		if (vc == Hdr_ins_usr_id) return doHdr_ins_usr_id_VC(info);
		if (vc == Hdr_ins_usr_nm) return doHdr_ins_usr_nm_VC(info);
		if (vc == Hdr_ins_func_id) return doHdr_ins_func_id_VC(info);
		if (vc == Hdr_ins_func_nm) return doHdr_ins_func_nm_VC(info);
		if (vc == Hdr_upd_usr_id) return doHdr_upd_usr_id_VC(info);
		if (vc == Hdr_upd_usr_nm) return doHdr_upd_usr_nm_VC(info);
		if (vc == Hdr_upd_func_id) return doHdr_upd_func_id_VC(info);
		if (vc == Hdr_upd_func_nm) return doHdr_upd_func_nm_VC(info);
		if (vc == Hdr_ins_ts) return doHdr_ins_ts_VC(info);
		if (vc == Hdr_upd_ts) return doHdr_upd_ts_VC(info);
		if (vc == Hdr_upd_srv_req_no) return doHdr_upd_srv_req_no_VC(info);
		if (vc == Hdr_insp_aprv_sts_typ) return doHdr_insp_aprv_sts_typ_VC(info);
		if (vc == Hdr_insp_aprv_sts_typ_nm) return doHdr_insp_aprv_sts_typ_nm_VC(info);
		if (vc == Hdr_insp_aprv_flg) return doHdr_insp_aprv_flg_VC(info);
		if (vc == Hdr_aprv_dt) return doHdr_aprv_dt_VC(info);
		if (vc == Hdr_aprv_tm) return doHdr_aprv_tm_VC(info);
		if (vc == Hdr_aprv_lims_flg) return doHdr_aprv_lims_flg_VC(info);
		if (vc == Hdr_last_aprv_lims_flg) return doHdr_last_aprv_lims_flg_VC(info);
		if (vc == Hdr_upd_cntr) return doHdr_upd_cntr_VC(info);
		if (vc == Hdr_insp_bind_typ) return doHdr_insp_bind_typ_VC(info);
		if (vc == Hdr_is_invalid_insp_ptn_flg) return doHdr_is_invalid_insp_ptn_flg_VC(info);
		if (vc == Hdr_prnt_flg) return doHdr_prnt_flg_VC(info);
		if (vc == columnDtlStd_insp_seq) return doDtlStd_insp_seq_VC(info);
		if (vc == columnDtlStd_insp_point_cd) return doDtlStd_insp_point_cd_VC(info);
		if (vc == columnDtlStd_insp_point_nm) return doDtlStd_insp_point_nm_VC(info);
		if (vc == columnDtlStd_insp_qlqn_typ) return doDtlStd_insp_qlqn_typ_VC(info);
		if (vc == columnDtlStd_insp_qlqn_typ_nm) return doDtlStd_insp_qlqn_typ_nm_VC(info);
		if (vc == columnDtlStd_ql_std_val) return doDtlStd_ql_std_val_VC(info);
		if (vc == columnDtlStd_trd_unit_cd) return doDtlStd_trd_unit_cd_VC(info);
		if (vc == columnDtlStd_trd_unit_nm) return doDtlStd_trd_unit_nm_VC(info);
		if (vc == columnDtlStd_qn_int_digit) return doDtlStd_qn_int_digit_VC(info);
		if (vc == columnDtlStd_qn_int_frac) return doDtlStd_qn_int_frac_VC(info);
		if (vc == columnDtlStd_sign_out_min_typ) return doDtlStd_sign_out_min_typ_VC(info);
		if (vc == columnDtlStd_sign_out_min_typ_nm) return doDtlStd_sign_out_min_typ_nm_VC(info);
		if (vc == columnDtlStd_sign_in_min_typ) return doDtlStd_sign_in_min_typ_VC(info);
		if (vc == columnDtlStd_sign_in_min_typ_nm) return doDtlStd_sign_in_min_typ_nm_VC(info);
		if (vc == columnDtlStd_sign_in_max_typ) return doDtlStd_sign_in_max_typ_VC(info);
		if (vc == columnDtlStd_sign_in_max_typ_nm) return doDtlStd_sign_in_max_typ_nm_VC(info);
		if (vc == columnDtlStd_sign_out_max_typ) return doDtlStd_sign_out_max_typ_VC(info);
		if (vc == columnDtlStd_sign_out_max_typ_nm) return doDtlStd_sign_out_max_typ_nm_VC(info);
		if (vc == columnDtlStd_intr_rmrks) return doDtlStd_intr_rmrks_VC(info);
		if (vc == columnDtlStd_sub_char1) return doDtlStd_sub_char1_VC(info);
		if (vc == columnDtlStd_sub_char2) return doDtlStd_sub_char2_VC(info);
		if (vc == columnDtlStd_sub_char3) return doDtlStd_sub_char3_VC(info);
		if (vc == columnDtlStd_std_insp_inst_no) return doDtlStd_std_insp_inst_no_VC(info);
		if (vc == columnDtlStd_add_point_flg) return doDtlStd_add_point_flg_VC(info);
		if (vc == columnDtlStd_data_crud_typ) return doDtlStd_data_crud_typ_VC(info);
		if (vc == columnDtlSchd_insp_schd_no) return doDtlSchd_insp_schd_no_VC(info);
		if (vc == columnDtlSchd_pack_unit_cd) return doDtlSchd_pack_unit_cd_VC(info);
		if (vc == columnDtlSchd_pack_unit_nm) return doDtlSchd_pack_unit_nm_VC(info);
		if (vc == columnDtlSchd_pack_dec_place) return doDtlSchd_pack_dec_place_VC(info);
		if (vc == columnDtlSchd_base_unit_cd) return doDtlSchd_base_unit_cd_VC(info);
		if (vc == columnDtlSchd_base_unit_nm) return doDtlSchd_base_unit_nm_VC(info);
		if (vc == columnDtlSchd_base_dec_place) return doDtlSchd_base_dec_place_VC(info);
		if (vc == columnDtlSchd_loc_cd) return doDtlSchd_loc_cd_VC(info);
		if (vc == columnDtlSchd_loc_nm) return doDtlSchd_loc_nm_VC(info);
		if (vc == columnDtlSchd_str_ln_cd) return doDtlSchd_str_ln_cd_VC(info);
		if (vc == columnDtlSchd_str_ln_nm) return doDtlSchd_str_ln_nm_VC(info);
		if (vc == columnDtlSchd_gd_cd) return doDtlSchd_gd_cd_VC(info);
		if (vc == columnDtlSchd_gd_nm) return doDtlSchd_gd_nm_VC(info);
		if (vc == columnDtlSchd_master_dt) return doDtlSchd_master_dt_VC(info);
		if (vc == columnDtlSchd_insp_cnt_rmrks) return doDtlSchd_insp_cnt_rmrks_VC(info);
		if (vc == columnDtlSchd_src_no1) return doDtlSchd_src_no1_VC(info);
		if (vc == columnDtlSchd_src_no2) return doDtlSchd_src_no2_VC(info);
		if (vc == columnDtlSchd_src_no3) return doDtlSchd_src_no3_VC(info);
		if (vc == columnDtlSchd_src_no4) return doDtlSchd_src_no4_VC(info);
		if (vc == columnDtlSchd_ins_usr_id) return doDtlSchd_ins_usr_id_VC(info);
		if (vc == columnDtlSchd_ins_usr_nm) return doDtlSchd_ins_usr_nm_VC(info);
		if (vc == columnDtlSchd_ins_func_id) return doDtlSchd_ins_func_id_VC(info);
		if (vc == columnDtlSchd_ins_func_nm) return doDtlSchd_ins_func_nm_VC(info);
		if (vc == columnDtlSchd_ins_ts) return doDtlSchd_ins_ts_VC(info);
		if (vc == columnDtlSchd_upd_usr_id) return doDtlSchd_upd_usr_id_VC(info);
		if (vc == columnDtlSchd_upd_usr_nm) return doDtlSchd_upd_usr_nm_VC(info);
		if (vc == columnDtlSchd_upd_func_id) return doDtlSchd_upd_func_id_VC(info);
		if (vc == columnDtlSchd_upd_func_nm) return doDtlSchd_upd_func_nm_VC(info);
		if (vc == columnDtlSchd_upd_ts) return doDtlSchd_upd_ts_VC(info);
		if (vc == columnDtlSchd_upd_srv_req_no) return doDtlSchd_upd_srv_req_no_VC(info);
		if (vc == columnDtlSchd_upd_cntr) return doDtlSchd_upd_cntr_VC(info);
		if (vc == columnDtlSchd_insp_inst_issue_typ) return doDtlSchd_insp_inst_issue_typ_VC(info);
		if (vc == Btn_prnt_flg) return doBtn_prnt_flg_VC(info);
		return true;
	}

	/**
	 * [HdrTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_srch_tgt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_srch_tgt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[srch_tgt_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_srch_tgt_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_freq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_freq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[lmt_up_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lmt_up_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[in_prmt_insp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_in_prmt_insp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[lims_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lims_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[last_lims_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_last_lims_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ver_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ver_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bp_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bp_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[to_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_to_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_maker_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[inst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_inst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[master_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_master_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_mtd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_mtd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_mtd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_mtd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_std_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_std_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[std_req_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_std_req_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[std_cnf_req_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_std_cnf_req_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[plnt_aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_plnt_aprv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[spl_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_spl_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[base_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_base_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_aprv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[aprv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_aprv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[aprv_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_aprv_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[aprv_lims_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_aprv_lims_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[last_aprv_lims_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_last_aprv_lims_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_bind_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_bind_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[is_invalid_insp_ptn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_is_invalid_insp_ptn_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]パネルの[insp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_insp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]パネルの[insp_point_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_insp_point_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]パネルの[insp_point_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_insp_point_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]パネルの[insp_qlqn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_insp_qlqn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]パネルの[insp_qlqn_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_insp_qlqn_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]パネルの[ql_std_val]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_ql_std_val_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]パネルの[qn_int_digit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_qn_int_digit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]パネルの[qn_int_frac]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_qn_int_frac_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]パネルの[sign_out_min_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_sign_out_min_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]パネルの[sign_out_min_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_sign_out_min_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]パネルの[sign_in_min_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_sign_in_min_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]パネルの[sign_in_min_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_sign_in_min_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]パネルの[sign_in_max_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_sign_in_max_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]パネルの[sign_in_max_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_sign_in_max_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]パネルの[sign_out_max_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_sign_out_max_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]パネルの[sign_out_max_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_sign_out_max_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]パネルの[std_insp_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_std_insp_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]パネルの[add_point_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_add_point_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlStd]パネルの[data_crud_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlStd_data_crud_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[insp_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_insp_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[pack_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_pack_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[pack_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_pack_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[pack_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_pack_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[base_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_base_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_gd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[master_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_master_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[insp_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_insp_cnt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[src_no1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_src_no1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[src_no2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_src_no2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[src_no3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_src_no3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[src_no4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_src_no4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSchd]パネルの[insp_inst_issue_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSchd_insp_inst_issue_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn]パネルの[prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_prnt_flg_VC(MCEventInfo info){
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
		if (nc == HdrTabTab) doHdrTab_NC(info);
		else if (nc == DtlTabTab) doDtlTab_NC(info);
		else if (nc == DtlStdTable) doDtlStd_NC(info);
		else if (nc == DtlSchdTable) doDtlSchd_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_NC(info);
		else if (nc == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_NC(info);
		else if (nc == Cnd_srch_tgt_no) doCnd_srch_tgt_no_NC(info);
		else if (nc == Hdr_insp_no) doHdr_insp_no_NC(info);
		else if (nc == Hdr_insp_schd_no) doHdr_insp_schd_no_NC(info);
		else if (nc == Hdr_insp_freq) doHdr_insp_freq_NC(info);
		else if (nc == Hdr_insp_sts_typ) doHdr_insp_sts_typ_NC(info);
		else if (nc == Hdr_insp_sts_typ_nm) doHdr_insp_sts_typ_nm_NC(info);
		else if (nc == Hdr_insp_typ) doHdr_insp_typ_NC(info);
		else if (nc == Hdr_insp_typ_nm) doHdr_insp_typ_nm_NC(info);
		else if (nc == Hdr_lmt_up_flg) doHdr_lmt_up_flg_NC(info);
		else if (nc == Hdr_in_prmt_insp_flg) doHdr_in_prmt_insp_flg_NC(info);
		else if (nc == Hdr_lims_flg) doHdr_lims_flg_NC(info);
		else if (nc == Hdr_last_lims_flg) doHdr_last_lims_flg_NC(info);
		else if (nc == Hdr_ver_no) doHdr_ver_no_NC(info);
		else if (nc == Hdr_bp_lot_no) doHdr_bp_lot_no_NC(info);
		else if (nc == Hdr_loc_cd) doHdr_loc_cd_NC(info);
		else if (nc == Hdr_loc_nm) doHdr_loc_nm_NC(info);
		else if (nc == Hdr_to_site_cd) doHdr_to_site_cd_NC(info);
		else if (nc == Hdr_mfg_loc_cd) doHdr_mfg_loc_cd_NC(info);
		else if (nc == Hdr_mfg_loc_nm) doHdr_mfg_loc_nm_NC(info);
		else if (nc == Hdr_sppl_cd) doHdr_sppl_cd_NC(info);
		else if (nc == Hdr_sppl_nm) doHdr_sppl_nm_NC(info);
		else if (nc == Hdr_maker_cd) doHdr_maker_cd_NC(info);
		else if (nc == Hdr_maker_nm) doHdr_maker_nm_NC(info);
		else if (nc == Hdr_inst_dt) doHdr_inst_dt_NC(info);
		else if (nc == Hdr_master_dt) doHdr_master_dt_NC(info);
		else if (nc == Hdr_insp_ptn_cd) doHdr_insp_ptn_cd_NC(info);
		else if (nc == Hdr_insp_ptn_nm) doHdr_insp_ptn_nm_NC(info);
		else if (nc == Hdr_insp_mtd_typ) doHdr_insp_mtd_typ_NC(info);
		else if (nc == Hdr_insp_mtd_typ_nm) doHdr_insp_mtd_typ_nm_NC(info);
		else if (nc == Hdr_insp_std_no) doHdr_insp_std_no_NC(info);
		else if (nc == Hdr_std_req_flg) doHdr_std_req_flg_NC(info);
		else if (nc == Hdr_std_cnf_req_flg) doHdr_std_cnf_req_flg_NC(info);
		else if (nc == Hdr_plnt_aprv_flg) doHdr_plnt_aprv_flg_NC(info);
		else if (nc == Hdr_spl_qty) doHdr_spl_qty_NC(info);
		else if (nc == Hdr_base_unit_cd) doHdr_base_unit_cd_NC(info);
		else if (nc == Hdr_base_unit_nm) doHdr_base_unit_nm_NC(info);
		else if (nc == Hdr_base_dec_place) doHdr_base_dec_place_NC(info);
		else if (nc == Hdr_intr_rmrks) doHdr_intr_rmrks_NC(info);
		else if (nc == Hdr_sub_char1) doHdr_sub_char1_NC(info);
		else if (nc == Hdr_sub_char2) doHdr_sub_char2_NC(info);
		else if (nc == Hdr_sub_char3) doHdr_sub_char3_NC(info);
		else if (nc == Hdr_ins_usr_id) doHdr_ins_usr_id_NC(info);
		else if (nc == Hdr_ins_usr_nm) doHdr_ins_usr_nm_NC(info);
		else if (nc == Hdr_ins_func_id) doHdr_ins_func_id_NC(info);
		else if (nc == Hdr_ins_func_nm) doHdr_ins_func_nm_NC(info);
		else if (nc == Hdr_upd_usr_id) doHdr_upd_usr_id_NC(info);
		else if (nc == Hdr_upd_usr_nm) doHdr_upd_usr_nm_NC(info);
		else if (nc == Hdr_upd_func_id) doHdr_upd_func_id_NC(info);
		else if (nc == Hdr_upd_func_nm) doHdr_upd_func_nm_NC(info);
		else if (nc == Hdr_ins_ts) doHdr_ins_ts_NC(info);
		else if (nc == Hdr_upd_ts) doHdr_upd_ts_NC(info);
		else if (nc == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_NC(info);
		else if (nc == Hdr_insp_aprv_sts_typ) doHdr_insp_aprv_sts_typ_NC(info);
		else if (nc == Hdr_insp_aprv_sts_typ_nm) doHdr_insp_aprv_sts_typ_nm_NC(info);
		else if (nc == Hdr_insp_aprv_flg) doHdr_insp_aprv_flg_NC(info);
		else if (nc == Hdr_aprv_dt) doHdr_aprv_dt_NC(info);
		else if (nc == Hdr_aprv_tm) doHdr_aprv_tm_NC(info);
		else if (nc == Hdr_aprv_lims_flg) doHdr_aprv_lims_flg_NC(info);
		else if (nc == Hdr_last_aprv_lims_flg) doHdr_last_aprv_lims_flg_NC(info);
		else if (nc == Hdr_upd_cntr) doHdr_upd_cntr_NC(info);
		else if (nc == Hdr_insp_bind_typ) doHdr_insp_bind_typ_NC(info);
		else if (nc == Hdr_is_invalid_insp_ptn_flg) doHdr_is_invalid_insp_ptn_flg_NC(info);
		else if (nc == Hdr_prnt_flg) doHdr_prnt_flg_NC(info);
		else if (nc == columnDtlStd_insp_seq) doDtlStd_insp_seq_NC(info);
		else if (nc == columnDtlStd_insp_point_cd) doDtlStd_insp_point_cd_NC(info);
		else if (nc == columnDtlStd_insp_point_nm) doDtlStd_insp_point_nm_NC(info);
		else if (nc == columnDtlStd_insp_qlqn_typ) doDtlStd_insp_qlqn_typ_NC(info);
		else if (nc == columnDtlStd_insp_qlqn_typ_nm) doDtlStd_insp_qlqn_typ_nm_NC(info);
		else if (nc == columnDtlStd_ql_std_val) doDtlStd_ql_std_val_NC(info);
		else if (nc == columnDtlStd_trd_unit_cd) doDtlStd_trd_unit_cd_NC(info);
		else if (nc == columnDtlStd_trd_unit_nm) doDtlStd_trd_unit_nm_NC(info);
		else if (nc == columnDtlStd_qn_int_digit) doDtlStd_qn_int_digit_NC(info);
		else if (nc == columnDtlStd_qn_int_frac) doDtlStd_qn_int_frac_NC(info);
		else if (nc == columnDtlStd_sign_out_min_typ) doDtlStd_sign_out_min_typ_NC(info);
		else if (nc == columnDtlStd_sign_out_min_typ_nm) doDtlStd_sign_out_min_typ_nm_NC(info);
		else if (nc == columnDtlStd_sign_in_min_typ) doDtlStd_sign_in_min_typ_NC(info);
		else if (nc == columnDtlStd_sign_in_min_typ_nm) doDtlStd_sign_in_min_typ_nm_NC(info);
		else if (nc == columnDtlStd_sign_in_max_typ) doDtlStd_sign_in_max_typ_NC(info);
		else if (nc == columnDtlStd_sign_in_max_typ_nm) doDtlStd_sign_in_max_typ_nm_NC(info);
		else if (nc == columnDtlStd_sign_out_max_typ) doDtlStd_sign_out_max_typ_NC(info);
		else if (nc == columnDtlStd_sign_out_max_typ_nm) doDtlStd_sign_out_max_typ_nm_NC(info);
		else if (nc == columnDtlStd_intr_rmrks) doDtlStd_intr_rmrks_NC(info);
		else if (nc == columnDtlStd_sub_char1) doDtlStd_sub_char1_NC(info);
		else if (nc == columnDtlStd_sub_char2) doDtlStd_sub_char2_NC(info);
		else if (nc == columnDtlStd_sub_char3) doDtlStd_sub_char3_NC(info);
		else if (nc == columnDtlStd_std_insp_inst_no) doDtlStd_std_insp_inst_no_NC(info);
		else if (nc == columnDtlStd_add_point_flg) doDtlStd_add_point_flg_NC(info);
		else if (nc == columnDtlStd_data_crud_typ) doDtlStd_data_crud_typ_NC(info);
		else if (nc == columnDtlSchd_insp_schd_no) doDtlSchd_insp_schd_no_NC(info);
		else if (nc == columnDtlSchd_pack_unit_cd) doDtlSchd_pack_unit_cd_NC(info);
		else if (nc == columnDtlSchd_pack_unit_nm) doDtlSchd_pack_unit_nm_NC(info);
		else if (nc == columnDtlSchd_pack_dec_place) doDtlSchd_pack_dec_place_NC(info);
		else if (nc == columnDtlSchd_base_unit_cd) doDtlSchd_base_unit_cd_NC(info);
		else if (nc == columnDtlSchd_base_unit_nm) doDtlSchd_base_unit_nm_NC(info);
		else if (nc == columnDtlSchd_base_dec_place) doDtlSchd_base_dec_place_NC(info);
		else if (nc == columnDtlSchd_loc_cd) doDtlSchd_loc_cd_NC(info);
		else if (nc == columnDtlSchd_loc_nm) doDtlSchd_loc_nm_NC(info);
		else if (nc == columnDtlSchd_str_ln_cd) doDtlSchd_str_ln_cd_NC(info);
		else if (nc == columnDtlSchd_str_ln_nm) doDtlSchd_str_ln_nm_NC(info);
		else if (nc == columnDtlSchd_gd_cd) doDtlSchd_gd_cd_NC(info);
		else if (nc == columnDtlSchd_gd_nm) doDtlSchd_gd_nm_NC(info);
		else if (nc == columnDtlSchd_master_dt) doDtlSchd_master_dt_NC(info);
		else if (nc == columnDtlSchd_insp_cnt_rmrks) doDtlSchd_insp_cnt_rmrks_NC(info);
		else if (nc == columnDtlSchd_src_no1) doDtlSchd_src_no1_NC(info);
		else if (nc == columnDtlSchd_src_no2) doDtlSchd_src_no2_NC(info);
		else if (nc == columnDtlSchd_src_no3) doDtlSchd_src_no3_NC(info);
		else if (nc == columnDtlSchd_src_no4) doDtlSchd_src_no4_NC(info);
		else if (nc == columnDtlSchd_ins_usr_id) doDtlSchd_ins_usr_id_NC(info);
		else if (nc == columnDtlSchd_ins_usr_nm) doDtlSchd_ins_usr_nm_NC(info);
		else if (nc == columnDtlSchd_ins_func_id) doDtlSchd_ins_func_id_NC(info);
		else if (nc == columnDtlSchd_ins_func_nm) doDtlSchd_ins_func_nm_NC(info);
		else if (nc == columnDtlSchd_ins_ts) doDtlSchd_ins_ts_NC(info);
		else if (nc == columnDtlSchd_upd_usr_id) doDtlSchd_upd_usr_id_NC(info);
		else if (nc == columnDtlSchd_upd_usr_nm) doDtlSchd_upd_usr_nm_NC(info);
		else if (nc == columnDtlSchd_upd_func_id) doDtlSchd_upd_func_id_NC(info);
		else if (nc == columnDtlSchd_upd_func_nm) doDtlSchd_upd_func_nm_NC(info);
		else if (nc == columnDtlSchd_upd_ts) doDtlSchd_upd_ts_NC(info);
		else if (nc == columnDtlSchd_upd_srv_req_no) doDtlSchd_upd_srv_req_no_NC(info);
		else if (nc == columnDtlSchd_upd_cntr) doDtlSchd_upd_cntr_NC(info);
		else if (nc == columnDtlSchd_insp_inst_issue_typ) doDtlSchd_insp_inst_issue_typ_NC(info);
		else if (nc == Btn_prnt_flg) doBtn_prnt_flg_NC(info);
	}

	/**
	 * [HdrTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NC(MCEventInfo info){
	}

	/**
	 * [DtlTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_freq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_freq_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_up_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_up_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[in_prmt_insp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_in_prmt_insp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lims_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lims_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[last_lims_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_last_lims_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ver_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ver_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bp_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bp_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[to_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_to_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_maker_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[inst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_inst_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[master_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_master_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_mtd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_mtd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_mtd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_mtd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_std_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_std_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[std_req_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_std_req_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[std_cnf_req_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_std_cnf_req_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[plnt_aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_plnt_aprv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[spl_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_spl_qty_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_aprv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_tm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_lims_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_lims_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[last_aprv_lims_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_last_aprv_lims_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_bind_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_bind_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[is_invalid_insp_ptn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_is_invalid_insp_ptn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[insp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_insp_seq_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[insp_point_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_insp_point_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[insp_point_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_insp_point_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[insp_qlqn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_insp_qlqn_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[insp_qlqn_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_insp_qlqn_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[ql_std_val]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_ql_std_val_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[qn_int_digit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_qn_int_digit_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[qn_int_frac]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_qn_int_frac_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_out_min_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_out_min_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_out_min_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_out_min_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_in_min_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_in_min_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_in_min_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_in_min_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_in_max_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_in_max_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_in_max_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_in_max_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_out_max_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_out_max_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_out_max_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_out_max_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[std_insp_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_std_insp_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[add_point_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_add_point_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[data_crud_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_data_crud_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[insp_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_insp_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[pack_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_pack_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[pack_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_pack_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[pack_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_pack_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[base_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_base_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_gd_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[master_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_master_dt_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[insp_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_insp_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[src_no1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_src_no1_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[src_no2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_src_no2_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[src_no3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_src_no3_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[src_no4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_src_no4_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[insp_inst_issue_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_insp_inst_issue_typ_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == HdrTabTab) doHdrTab_NE(info);
		else if (ne == DtlTabTab) doDtlTab_NE(info);
		else if (ne == DtlStdTable) doDtlStd_NE(info);
		else if (ne == DtlSchdTable) doDtlSchd_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_NE(info);
		else if (ne == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_NE(info);
		else if (ne == Cnd_srch_tgt_no) doCnd_srch_tgt_no_NE(info);
		else if (ne == Hdr_insp_no) doHdr_insp_no_NE(info);
		else if (ne == Hdr_insp_schd_no) doHdr_insp_schd_no_NE(info);
		else if (ne == Hdr_insp_freq) doHdr_insp_freq_NE(info);
		else if (ne == Hdr_insp_sts_typ) doHdr_insp_sts_typ_NE(info);
		else if (ne == Hdr_insp_sts_typ_nm) doHdr_insp_sts_typ_nm_NE(info);
		else if (ne == Hdr_insp_typ) doHdr_insp_typ_NE(info);
		else if (ne == Hdr_insp_typ_nm) doHdr_insp_typ_nm_NE(info);
		else if (ne == Hdr_lmt_up_flg) doHdr_lmt_up_flg_NE(info);
		else if (ne == Hdr_in_prmt_insp_flg) doHdr_in_prmt_insp_flg_NE(info);
		else if (ne == Hdr_lims_flg) doHdr_lims_flg_NE(info);
		else if (ne == Hdr_last_lims_flg) doHdr_last_lims_flg_NE(info);
		else if (ne == Hdr_ver_no) doHdr_ver_no_NE(info);
		else if (ne == Hdr_bp_lot_no) doHdr_bp_lot_no_NE(info);
		else if (ne == Hdr_loc_cd) doHdr_loc_cd_NE(info);
		else if (ne == Hdr_loc_nm) doHdr_loc_nm_NE(info);
		else if (ne == Hdr_to_site_cd) doHdr_to_site_cd_NE(info);
		else if (ne == Hdr_mfg_loc_cd) doHdr_mfg_loc_cd_NE(info);
		else if (ne == Hdr_mfg_loc_nm) doHdr_mfg_loc_nm_NE(info);
		else if (ne == Hdr_sppl_cd) doHdr_sppl_cd_NE(info);
		else if (ne == Hdr_sppl_nm) doHdr_sppl_nm_NE(info);
		else if (ne == Hdr_maker_cd) doHdr_maker_cd_NE(info);
		else if (ne == Hdr_maker_nm) doHdr_maker_nm_NE(info);
		else if (ne == Hdr_inst_dt) doHdr_inst_dt_NE(info);
		else if (ne == Hdr_master_dt) doHdr_master_dt_NE(info);
		else if (ne == Hdr_insp_ptn_cd) doHdr_insp_ptn_cd_NE(info);
		else if (ne == Hdr_insp_ptn_nm) doHdr_insp_ptn_nm_NE(info);
		else if (ne == Hdr_insp_mtd_typ) doHdr_insp_mtd_typ_NE(info);
		else if (ne == Hdr_insp_mtd_typ_nm) doHdr_insp_mtd_typ_nm_NE(info);
		else if (ne == Hdr_insp_std_no) doHdr_insp_std_no_NE(info);
		else if (ne == Hdr_std_req_flg) doHdr_std_req_flg_NE(info);
		else if (ne == Hdr_std_cnf_req_flg) doHdr_std_cnf_req_flg_NE(info);
		else if (ne == Hdr_plnt_aprv_flg) doHdr_plnt_aprv_flg_NE(info);
		else if (ne == Hdr_spl_qty) doHdr_spl_qty_NE(info);
		else if (ne == Hdr_base_unit_cd) doHdr_base_unit_cd_NE(info);
		else if (ne == Hdr_base_unit_nm) doHdr_base_unit_nm_NE(info);
		else if (ne == Hdr_base_dec_place) doHdr_base_dec_place_NE(info);
		else if (ne == Hdr_intr_rmrks) doHdr_intr_rmrks_NE(info);
		else if (ne == Hdr_sub_char1) doHdr_sub_char1_NE(info);
		else if (ne == Hdr_sub_char2) doHdr_sub_char2_NE(info);
		else if (ne == Hdr_sub_char3) doHdr_sub_char3_NE(info);
		else if (ne == Hdr_ins_usr_id) doHdr_ins_usr_id_NE(info);
		else if (ne == Hdr_ins_usr_nm) doHdr_ins_usr_nm_NE(info);
		else if (ne == Hdr_ins_func_id) doHdr_ins_func_id_NE(info);
		else if (ne == Hdr_ins_func_nm) doHdr_ins_func_nm_NE(info);
		else if (ne == Hdr_upd_usr_id) doHdr_upd_usr_id_NE(info);
		else if (ne == Hdr_upd_usr_nm) doHdr_upd_usr_nm_NE(info);
		else if (ne == Hdr_upd_func_id) doHdr_upd_func_id_NE(info);
		else if (ne == Hdr_upd_func_nm) doHdr_upd_func_nm_NE(info);
		else if (ne == Hdr_ins_ts) doHdr_ins_ts_NE(info);
		else if (ne == Hdr_upd_ts) doHdr_upd_ts_NE(info);
		else if (ne == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_NE(info);
		else if (ne == Hdr_insp_aprv_sts_typ) doHdr_insp_aprv_sts_typ_NE(info);
		else if (ne == Hdr_insp_aprv_sts_typ_nm) doHdr_insp_aprv_sts_typ_nm_NE(info);
		else if (ne == Hdr_insp_aprv_flg) doHdr_insp_aprv_flg_NE(info);
		else if (ne == Hdr_aprv_dt) doHdr_aprv_dt_NE(info);
		else if (ne == Hdr_aprv_tm) doHdr_aprv_tm_NE(info);
		else if (ne == Hdr_aprv_lims_flg) doHdr_aprv_lims_flg_NE(info);
		else if (ne == Hdr_last_aprv_lims_flg) doHdr_last_aprv_lims_flg_NE(info);
		else if (ne == Hdr_upd_cntr) doHdr_upd_cntr_NE(info);
		else if (ne == Hdr_insp_bind_typ) doHdr_insp_bind_typ_NE(info);
		else if (ne == Hdr_is_invalid_insp_ptn_flg) doHdr_is_invalid_insp_ptn_flg_NE(info);
		else if (ne == Hdr_prnt_flg) doHdr_prnt_flg_NE(info);
		else if (ne == columnDtlStd_insp_seq) doDtlStd_insp_seq_NE(info);
		else if (ne == columnDtlStd_insp_point_cd) doDtlStd_insp_point_cd_NE(info);
		else if (ne == columnDtlStd_insp_point_nm) doDtlStd_insp_point_nm_NE(info);
		else if (ne == columnDtlStd_insp_qlqn_typ) doDtlStd_insp_qlqn_typ_NE(info);
		else if (ne == columnDtlStd_insp_qlqn_typ_nm) doDtlStd_insp_qlqn_typ_nm_NE(info);
		else if (ne == columnDtlStd_ql_std_val) doDtlStd_ql_std_val_NE(info);
		else if (ne == columnDtlStd_trd_unit_cd) doDtlStd_trd_unit_cd_NE(info);
		else if (ne == columnDtlStd_trd_unit_nm) doDtlStd_trd_unit_nm_NE(info);
		else if (ne == columnDtlStd_qn_int_digit) doDtlStd_qn_int_digit_NE(info);
		else if (ne == columnDtlStd_qn_int_frac) doDtlStd_qn_int_frac_NE(info);
		else if (ne == columnDtlStd_sign_out_min_typ) doDtlStd_sign_out_min_typ_NE(info);
		else if (ne == columnDtlStd_sign_out_min_typ_nm) doDtlStd_sign_out_min_typ_nm_NE(info);
		else if (ne == columnDtlStd_sign_in_min_typ) doDtlStd_sign_in_min_typ_NE(info);
		else if (ne == columnDtlStd_sign_in_min_typ_nm) doDtlStd_sign_in_min_typ_nm_NE(info);
		else if (ne == columnDtlStd_sign_in_max_typ) doDtlStd_sign_in_max_typ_NE(info);
		else if (ne == columnDtlStd_sign_in_max_typ_nm) doDtlStd_sign_in_max_typ_nm_NE(info);
		else if (ne == columnDtlStd_sign_out_max_typ) doDtlStd_sign_out_max_typ_NE(info);
		else if (ne == columnDtlStd_sign_out_max_typ_nm) doDtlStd_sign_out_max_typ_nm_NE(info);
		else if (ne == columnDtlStd_intr_rmrks) doDtlStd_intr_rmrks_NE(info);
		else if (ne == columnDtlStd_sub_char1) doDtlStd_sub_char1_NE(info);
		else if (ne == columnDtlStd_sub_char2) doDtlStd_sub_char2_NE(info);
		else if (ne == columnDtlStd_sub_char3) doDtlStd_sub_char3_NE(info);
		else if (ne == columnDtlStd_std_insp_inst_no) doDtlStd_std_insp_inst_no_NE(info);
		else if (ne == columnDtlStd_add_point_flg) doDtlStd_add_point_flg_NE(info);
		else if (ne == columnDtlStd_data_crud_typ) doDtlStd_data_crud_typ_NE(info);
		else if (ne == columnDtlSchd_insp_schd_no) doDtlSchd_insp_schd_no_NE(info);
		else if (ne == columnDtlSchd_pack_unit_cd) doDtlSchd_pack_unit_cd_NE(info);
		else if (ne == columnDtlSchd_pack_unit_nm) doDtlSchd_pack_unit_nm_NE(info);
		else if (ne == columnDtlSchd_pack_dec_place) doDtlSchd_pack_dec_place_NE(info);
		else if (ne == columnDtlSchd_base_unit_cd) doDtlSchd_base_unit_cd_NE(info);
		else if (ne == columnDtlSchd_base_unit_nm) doDtlSchd_base_unit_nm_NE(info);
		else if (ne == columnDtlSchd_base_dec_place) doDtlSchd_base_dec_place_NE(info);
		else if (ne == columnDtlSchd_loc_cd) doDtlSchd_loc_cd_NE(info);
		else if (ne == columnDtlSchd_loc_nm) doDtlSchd_loc_nm_NE(info);
		else if (ne == columnDtlSchd_str_ln_cd) doDtlSchd_str_ln_cd_NE(info);
		else if (ne == columnDtlSchd_str_ln_nm) doDtlSchd_str_ln_nm_NE(info);
		else if (ne == columnDtlSchd_gd_cd) doDtlSchd_gd_cd_NE(info);
		else if (ne == columnDtlSchd_gd_nm) doDtlSchd_gd_nm_NE(info);
		else if (ne == columnDtlSchd_master_dt) doDtlSchd_master_dt_NE(info);
		else if (ne == columnDtlSchd_insp_cnt_rmrks) doDtlSchd_insp_cnt_rmrks_NE(info);
		else if (ne == columnDtlSchd_src_no1) doDtlSchd_src_no1_NE(info);
		else if (ne == columnDtlSchd_src_no2) doDtlSchd_src_no2_NE(info);
		else if (ne == columnDtlSchd_src_no3) doDtlSchd_src_no3_NE(info);
		else if (ne == columnDtlSchd_src_no4) doDtlSchd_src_no4_NE(info);
		else if (ne == columnDtlSchd_ins_usr_id) doDtlSchd_ins_usr_id_NE(info);
		else if (ne == columnDtlSchd_ins_usr_nm) doDtlSchd_ins_usr_nm_NE(info);
		else if (ne == columnDtlSchd_ins_func_id) doDtlSchd_ins_func_id_NE(info);
		else if (ne == columnDtlSchd_ins_func_nm) doDtlSchd_ins_func_nm_NE(info);
		else if (ne == columnDtlSchd_ins_ts) doDtlSchd_ins_ts_NE(info);
		else if (ne == columnDtlSchd_upd_usr_id) doDtlSchd_upd_usr_id_NE(info);
		else if (ne == columnDtlSchd_upd_usr_nm) doDtlSchd_upd_usr_nm_NE(info);
		else if (ne == columnDtlSchd_upd_func_id) doDtlSchd_upd_func_id_NE(info);
		else if (ne == columnDtlSchd_upd_func_nm) doDtlSchd_upd_func_nm_NE(info);
		else if (ne == columnDtlSchd_upd_ts) doDtlSchd_upd_ts_NE(info);
		else if (ne == columnDtlSchd_upd_srv_req_no) doDtlSchd_upd_srv_req_no_NE(info);
		else if (ne == columnDtlSchd_upd_cntr) doDtlSchd_upd_cntr_NE(info);
		else if (ne == columnDtlSchd_insp_inst_issue_typ) doDtlSchd_insp_inst_issue_typ_NE(info);
		else if (ne == Btn_prnt_flg) doBtn_prnt_flg_NE(info);
	}

	/**
	 * [HdrTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NE(MCEventInfo info){
	}

	/**
	 * [DtlTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_freq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_freq_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_up_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_up_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[in_prmt_insp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_in_prmt_insp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lims_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lims_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[last_lims_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_last_lims_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ver_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ver_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bp_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bp_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[to_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_to_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_maker_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[inst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_inst_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[master_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_master_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_mtd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_mtd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_mtd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_mtd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_std_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_std_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[std_req_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_std_req_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[std_cnf_req_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_std_cnf_req_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[plnt_aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_plnt_aprv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[spl_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_spl_qty_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_aprv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_tm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_lims_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_lims_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[last_aprv_lims_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_last_aprv_lims_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_bind_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_bind_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[is_invalid_insp_ptn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_is_invalid_insp_ptn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[insp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_insp_seq_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[insp_point_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_insp_point_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[insp_point_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_insp_point_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[insp_qlqn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_insp_qlqn_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[insp_qlqn_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_insp_qlqn_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[ql_std_val]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_ql_std_val_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[qn_int_digit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_qn_int_digit_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[qn_int_frac]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_qn_int_frac_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_out_min_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_out_min_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_out_min_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_out_min_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_in_min_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_in_min_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_in_min_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_in_min_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_in_max_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_in_max_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_in_max_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_in_max_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_out_max_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_out_max_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_out_max_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_out_max_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[std_insp_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_std_insp_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[add_point_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_add_point_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[data_crud_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_data_crud_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[insp_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_insp_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[pack_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_pack_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[pack_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_pack_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[pack_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_pack_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[base_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_base_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_gd_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[master_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_master_dt_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[insp_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_insp_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[src_no1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_src_no1_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[src_no2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_src_no2_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[src_no3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_src_no3_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[src_no4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_src_no4_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[insp_inst_issue_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_insp_inst_issue_typ_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == HdrTabTab) doHdrTab_NX(info);
		else if (nx == DtlTabTab) doDtlTab_NX(info);
		else if (nx == DtlStdTable) doDtlStd_NX(info);
		else if (nx == DtlSchdTable) doDtlSchd_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_NX(info);
		else if (nx == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_NX(info);
		else if (nx == Cnd_srch_tgt_no) doCnd_srch_tgt_no_NX(info);
		else if (nx == Hdr_insp_no) doHdr_insp_no_NX(info);
		else if (nx == Hdr_insp_schd_no) doHdr_insp_schd_no_NX(info);
		else if (nx == Hdr_insp_freq) doHdr_insp_freq_NX(info);
		else if (nx == Hdr_insp_sts_typ) doHdr_insp_sts_typ_NX(info);
		else if (nx == Hdr_insp_sts_typ_nm) doHdr_insp_sts_typ_nm_NX(info);
		else if (nx == Hdr_insp_typ) doHdr_insp_typ_NX(info);
		else if (nx == Hdr_insp_typ_nm) doHdr_insp_typ_nm_NX(info);
		else if (nx == Hdr_lmt_up_flg) doHdr_lmt_up_flg_NX(info);
		else if (nx == Hdr_in_prmt_insp_flg) doHdr_in_prmt_insp_flg_NX(info);
		else if (nx == Hdr_lims_flg) doHdr_lims_flg_NX(info);
		else if (nx == Hdr_last_lims_flg) doHdr_last_lims_flg_NX(info);
		else if (nx == Hdr_ver_no) doHdr_ver_no_NX(info);
		else if (nx == Hdr_bp_lot_no) doHdr_bp_lot_no_NX(info);
		else if (nx == Hdr_loc_cd) doHdr_loc_cd_NX(info);
		else if (nx == Hdr_loc_nm) doHdr_loc_nm_NX(info);
		else if (nx == Hdr_to_site_cd) doHdr_to_site_cd_NX(info);
		else if (nx == Hdr_mfg_loc_cd) doHdr_mfg_loc_cd_NX(info);
		else if (nx == Hdr_mfg_loc_nm) doHdr_mfg_loc_nm_NX(info);
		else if (nx == Hdr_sppl_cd) doHdr_sppl_cd_NX(info);
		else if (nx == Hdr_sppl_nm) doHdr_sppl_nm_NX(info);
		else if (nx == Hdr_maker_cd) doHdr_maker_cd_NX(info);
		else if (nx == Hdr_maker_nm) doHdr_maker_nm_NX(info);
		else if (nx == Hdr_inst_dt) doHdr_inst_dt_NX(info);
		else if (nx == Hdr_master_dt) doHdr_master_dt_NX(info);
		else if (nx == Hdr_insp_ptn_cd) doHdr_insp_ptn_cd_NX(info);
		else if (nx == Hdr_insp_ptn_nm) doHdr_insp_ptn_nm_NX(info);
		else if (nx == Hdr_insp_mtd_typ) doHdr_insp_mtd_typ_NX(info);
		else if (nx == Hdr_insp_mtd_typ_nm) doHdr_insp_mtd_typ_nm_NX(info);
		else if (nx == Hdr_insp_std_no) doHdr_insp_std_no_NX(info);
		else if (nx == Hdr_std_req_flg) doHdr_std_req_flg_NX(info);
		else if (nx == Hdr_std_cnf_req_flg) doHdr_std_cnf_req_flg_NX(info);
		else if (nx == Hdr_plnt_aprv_flg) doHdr_plnt_aprv_flg_NX(info);
		else if (nx == Hdr_spl_qty) doHdr_spl_qty_NX(info);
		else if (nx == Hdr_base_unit_cd) doHdr_base_unit_cd_NX(info);
		else if (nx == Hdr_base_unit_nm) doHdr_base_unit_nm_NX(info);
		else if (nx == Hdr_base_dec_place) doHdr_base_dec_place_NX(info);
		else if (nx == Hdr_intr_rmrks) doHdr_intr_rmrks_NX(info);
		else if (nx == Hdr_sub_char1) doHdr_sub_char1_NX(info);
		else if (nx == Hdr_sub_char2) doHdr_sub_char2_NX(info);
		else if (nx == Hdr_sub_char3) doHdr_sub_char3_NX(info);
		else if (nx == Hdr_ins_usr_id) doHdr_ins_usr_id_NX(info);
		else if (nx == Hdr_ins_usr_nm) doHdr_ins_usr_nm_NX(info);
		else if (nx == Hdr_ins_func_id) doHdr_ins_func_id_NX(info);
		else if (nx == Hdr_ins_func_nm) doHdr_ins_func_nm_NX(info);
		else if (nx == Hdr_upd_usr_id) doHdr_upd_usr_id_NX(info);
		else if (nx == Hdr_upd_usr_nm) doHdr_upd_usr_nm_NX(info);
		else if (nx == Hdr_upd_func_id) doHdr_upd_func_id_NX(info);
		else if (nx == Hdr_upd_func_nm) doHdr_upd_func_nm_NX(info);
		else if (nx == Hdr_ins_ts) doHdr_ins_ts_NX(info);
		else if (nx == Hdr_upd_ts) doHdr_upd_ts_NX(info);
		else if (nx == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_NX(info);
		else if (nx == Hdr_insp_aprv_sts_typ) doHdr_insp_aprv_sts_typ_NX(info);
		else if (nx == Hdr_insp_aprv_sts_typ_nm) doHdr_insp_aprv_sts_typ_nm_NX(info);
		else if (nx == Hdr_insp_aprv_flg) doHdr_insp_aprv_flg_NX(info);
		else if (nx == Hdr_aprv_dt) doHdr_aprv_dt_NX(info);
		else if (nx == Hdr_aprv_tm) doHdr_aprv_tm_NX(info);
		else if (nx == Hdr_aprv_lims_flg) doHdr_aprv_lims_flg_NX(info);
		else if (nx == Hdr_last_aprv_lims_flg) doHdr_last_aprv_lims_flg_NX(info);
		else if (nx == Hdr_upd_cntr) doHdr_upd_cntr_NX(info);
		else if (nx == Hdr_insp_bind_typ) doHdr_insp_bind_typ_NX(info);
		else if (nx == Hdr_is_invalid_insp_ptn_flg) doHdr_is_invalid_insp_ptn_flg_NX(info);
		else if (nx == Hdr_prnt_flg) doHdr_prnt_flg_NX(info);
		else if (nx == columnDtlStd_insp_seq) doDtlStd_insp_seq_NX(info);
		else if (nx == columnDtlStd_insp_point_cd) doDtlStd_insp_point_cd_NX(info);
		else if (nx == columnDtlStd_insp_point_nm) doDtlStd_insp_point_nm_NX(info);
		else if (nx == columnDtlStd_insp_qlqn_typ) doDtlStd_insp_qlqn_typ_NX(info);
		else if (nx == columnDtlStd_insp_qlqn_typ_nm) doDtlStd_insp_qlqn_typ_nm_NX(info);
		else if (nx == columnDtlStd_ql_std_val) doDtlStd_ql_std_val_NX(info);
		else if (nx == columnDtlStd_trd_unit_cd) doDtlStd_trd_unit_cd_NX(info);
		else if (nx == columnDtlStd_trd_unit_nm) doDtlStd_trd_unit_nm_NX(info);
		else if (nx == columnDtlStd_qn_int_digit) doDtlStd_qn_int_digit_NX(info);
		else if (nx == columnDtlStd_qn_int_frac) doDtlStd_qn_int_frac_NX(info);
		else if (nx == columnDtlStd_sign_out_min_typ) doDtlStd_sign_out_min_typ_NX(info);
		else if (nx == columnDtlStd_sign_out_min_typ_nm) doDtlStd_sign_out_min_typ_nm_NX(info);
		else if (nx == columnDtlStd_sign_in_min_typ) doDtlStd_sign_in_min_typ_NX(info);
		else if (nx == columnDtlStd_sign_in_min_typ_nm) doDtlStd_sign_in_min_typ_nm_NX(info);
		else if (nx == columnDtlStd_sign_in_max_typ) doDtlStd_sign_in_max_typ_NX(info);
		else if (nx == columnDtlStd_sign_in_max_typ_nm) doDtlStd_sign_in_max_typ_nm_NX(info);
		else if (nx == columnDtlStd_sign_out_max_typ) doDtlStd_sign_out_max_typ_NX(info);
		else if (nx == columnDtlStd_sign_out_max_typ_nm) doDtlStd_sign_out_max_typ_nm_NX(info);
		else if (nx == columnDtlStd_intr_rmrks) doDtlStd_intr_rmrks_NX(info);
		else if (nx == columnDtlStd_sub_char1) doDtlStd_sub_char1_NX(info);
		else if (nx == columnDtlStd_sub_char2) doDtlStd_sub_char2_NX(info);
		else if (nx == columnDtlStd_sub_char3) doDtlStd_sub_char3_NX(info);
		else if (nx == columnDtlStd_std_insp_inst_no) doDtlStd_std_insp_inst_no_NX(info);
		else if (nx == columnDtlStd_add_point_flg) doDtlStd_add_point_flg_NX(info);
		else if (nx == columnDtlStd_data_crud_typ) doDtlStd_data_crud_typ_NX(info);
		else if (nx == columnDtlSchd_insp_schd_no) doDtlSchd_insp_schd_no_NX(info);
		else if (nx == columnDtlSchd_pack_unit_cd) doDtlSchd_pack_unit_cd_NX(info);
		else if (nx == columnDtlSchd_pack_unit_nm) doDtlSchd_pack_unit_nm_NX(info);
		else if (nx == columnDtlSchd_pack_dec_place) doDtlSchd_pack_dec_place_NX(info);
		else if (nx == columnDtlSchd_base_unit_cd) doDtlSchd_base_unit_cd_NX(info);
		else if (nx == columnDtlSchd_base_unit_nm) doDtlSchd_base_unit_nm_NX(info);
		else if (nx == columnDtlSchd_base_dec_place) doDtlSchd_base_dec_place_NX(info);
		else if (nx == columnDtlSchd_loc_cd) doDtlSchd_loc_cd_NX(info);
		else if (nx == columnDtlSchd_loc_nm) doDtlSchd_loc_nm_NX(info);
		else if (nx == columnDtlSchd_str_ln_cd) doDtlSchd_str_ln_cd_NX(info);
		else if (nx == columnDtlSchd_str_ln_nm) doDtlSchd_str_ln_nm_NX(info);
		else if (nx == columnDtlSchd_gd_cd) doDtlSchd_gd_cd_NX(info);
		else if (nx == columnDtlSchd_gd_nm) doDtlSchd_gd_nm_NX(info);
		else if (nx == columnDtlSchd_master_dt) doDtlSchd_master_dt_NX(info);
		else if (nx == columnDtlSchd_insp_cnt_rmrks) doDtlSchd_insp_cnt_rmrks_NX(info);
		else if (nx == columnDtlSchd_src_no1) doDtlSchd_src_no1_NX(info);
		else if (nx == columnDtlSchd_src_no2) doDtlSchd_src_no2_NX(info);
		else if (nx == columnDtlSchd_src_no3) doDtlSchd_src_no3_NX(info);
		else if (nx == columnDtlSchd_src_no4) doDtlSchd_src_no4_NX(info);
		else if (nx == columnDtlSchd_ins_usr_id) doDtlSchd_ins_usr_id_NX(info);
		else if (nx == columnDtlSchd_ins_usr_nm) doDtlSchd_ins_usr_nm_NX(info);
		else if (nx == columnDtlSchd_ins_func_id) doDtlSchd_ins_func_id_NX(info);
		else if (nx == columnDtlSchd_ins_func_nm) doDtlSchd_ins_func_nm_NX(info);
		else if (nx == columnDtlSchd_ins_ts) doDtlSchd_ins_ts_NX(info);
		else if (nx == columnDtlSchd_upd_usr_id) doDtlSchd_upd_usr_id_NX(info);
		else if (nx == columnDtlSchd_upd_usr_nm) doDtlSchd_upd_usr_nm_NX(info);
		else if (nx == columnDtlSchd_upd_func_id) doDtlSchd_upd_func_id_NX(info);
		else if (nx == columnDtlSchd_upd_func_nm) doDtlSchd_upd_func_nm_NX(info);
		else if (nx == columnDtlSchd_upd_ts) doDtlSchd_upd_ts_NX(info);
		else if (nx == columnDtlSchd_upd_srv_req_no) doDtlSchd_upd_srv_req_no_NX(info);
		else if (nx == columnDtlSchd_upd_cntr) doDtlSchd_upd_cntr_NX(info);
		else if (nx == columnDtlSchd_insp_inst_issue_typ) doDtlSchd_insp_inst_issue_typ_NX(info);
		else if (nx == Btn_prnt_flg) doBtn_prnt_flg_NX(info);
	}

	/**
	 * [HdrTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NX(MCEventInfo info){
	}

	/**
	 * [DtlTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_freq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_freq_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_up_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_up_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[in_prmt_insp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_in_prmt_insp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lims_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lims_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[last_lims_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_last_lims_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ver_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ver_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bp_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bp_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[to_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_to_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_maker_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[inst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_inst_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[master_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_master_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_mtd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_mtd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_mtd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_mtd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_std_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_std_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[std_req_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_std_req_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[std_cnf_req_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_std_cnf_req_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[plnt_aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_plnt_aprv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[spl_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_spl_qty_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_aprv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_tm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_lims_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_lims_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[last_aprv_lims_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_last_aprv_lims_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_bind_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_bind_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[is_invalid_insp_ptn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_is_invalid_insp_ptn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[insp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_insp_seq_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[insp_point_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_insp_point_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[insp_point_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_insp_point_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[insp_qlqn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_insp_qlqn_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[insp_qlqn_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_insp_qlqn_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[ql_std_val]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_ql_std_val_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[qn_int_digit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_qn_int_digit_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[qn_int_frac]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_qn_int_frac_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_out_min_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_out_min_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_out_min_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_out_min_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_in_min_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_in_min_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_in_min_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_in_min_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_in_max_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_in_max_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_in_max_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_in_max_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_out_max_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_out_max_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_out_max_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_out_max_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[std_insp_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_std_insp_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[add_point_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_add_point_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[data_crud_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_data_crud_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[insp_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_insp_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[pack_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_pack_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[pack_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_pack_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[pack_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_pack_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[base_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_base_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_gd_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[master_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_master_dt_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[insp_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_insp_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[src_no1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_src_no1_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[src_no2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_src_no2_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[src_no3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_src_no3_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[src_no4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_src_no4_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[insp_inst_issue_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_insp_inst_issue_typ_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_LC(info);
		else if (lc == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_LC(info);
		else if (lc == Cnd_srch_tgt_no) doCnd_srch_tgt_no_LC(info);
		else if (lc == Hdr_insp_no) doHdr_insp_no_LC(info);
		else if (lc == Hdr_insp_schd_no) doHdr_insp_schd_no_LC(info);
		else if (lc == Hdr_insp_freq) doHdr_insp_freq_LC(info);
		else if (lc == Hdr_insp_sts_typ) doHdr_insp_sts_typ_LC(info);
		else if (lc == Hdr_insp_sts_typ_nm) doHdr_insp_sts_typ_nm_LC(info);
		else if (lc == Hdr_insp_typ) doHdr_insp_typ_LC(info);
		else if (lc == Hdr_insp_typ_nm) doHdr_insp_typ_nm_LC(info);
		else if (lc == Hdr_ver_no) doHdr_ver_no_LC(info);
		else if (lc == Hdr_bp_lot_no) doHdr_bp_lot_no_LC(info);
		else if (lc == Hdr_loc_cd) doHdr_loc_cd_LC(info);
		else if (lc == Hdr_loc_nm) doHdr_loc_nm_LC(info);
		else if (lc == Hdr_to_site_cd) doHdr_to_site_cd_LC(info);
		else if (lc == Hdr_mfg_loc_cd) doHdr_mfg_loc_cd_LC(info);
		else if (lc == Hdr_mfg_loc_nm) doHdr_mfg_loc_nm_LC(info);
		else if (lc == Hdr_sppl_cd) doHdr_sppl_cd_LC(info);
		else if (lc == Hdr_sppl_nm) doHdr_sppl_nm_LC(info);
		else if (lc == Hdr_maker_cd) doHdr_maker_cd_LC(info);
		else if (lc == Hdr_maker_nm) doHdr_maker_nm_LC(info);
		else if (lc == Hdr_inst_dt) doHdr_inst_dt_LC(info);
		else if (lc == Hdr_master_dt) doHdr_master_dt_LC(info);
		else if (lc == Hdr_insp_ptn_cd) doHdr_insp_ptn_cd_LC(info);
		else if (lc == Hdr_insp_ptn_nm) doHdr_insp_ptn_nm_LC(info);
		else if (lc == Hdr_insp_mtd_typ) doHdr_insp_mtd_typ_LC(info);
		else if (lc == Hdr_insp_mtd_typ_nm) doHdr_insp_mtd_typ_nm_LC(info);
		else if (lc == Hdr_insp_std_no) doHdr_insp_std_no_LC(info);
		else if (lc == Hdr_spl_qty) doHdr_spl_qty_LC(info);
		else if (lc == Hdr_base_unit_cd) doHdr_base_unit_cd_LC(info);
		else if (lc == Hdr_base_unit_nm) doHdr_base_unit_nm_LC(info);
		else if (lc == Hdr_base_dec_place) doHdr_base_dec_place_LC(info);
		else if (lc == Hdr_intr_rmrks) doHdr_intr_rmrks_LC(info);
		else if (lc == Hdr_sub_char1) doHdr_sub_char1_LC(info);
		else if (lc == Hdr_sub_char2) doHdr_sub_char2_LC(info);
		else if (lc == Hdr_sub_char3) doHdr_sub_char3_LC(info);
		else if (lc == Hdr_ins_usr_id) doHdr_ins_usr_id_LC(info);
		else if (lc == Hdr_ins_usr_nm) doHdr_ins_usr_nm_LC(info);
		else if (lc == Hdr_ins_func_id) doHdr_ins_func_id_LC(info);
		else if (lc == Hdr_ins_func_nm) doHdr_ins_func_nm_LC(info);
		else if (lc == Hdr_upd_usr_id) doHdr_upd_usr_id_LC(info);
		else if (lc == Hdr_upd_usr_nm) doHdr_upd_usr_nm_LC(info);
		else if (lc == Hdr_upd_func_id) doHdr_upd_func_id_LC(info);
		else if (lc == Hdr_upd_func_nm) doHdr_upd_func_nm_LC(info);
		else if (lc == Hdr_ins_ts) doHdr_ins_ts_LC(info);
		else if (lc == Hdr_upd_ts) doHdr_upd_ts_LC(info);
		else if (lc == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_LC(info);
		else if (lc == Hdr_insp_aprv_sts_typ) doHdr_insp_aprv_sts_typ_LC(info);
		else if (lc == Hdr_insp_aprv_sts_typ_nm) doHdr_insp_aprv_sts_typ_nm_LC(info);
		else if (lc == Hdr_aprv_dt) doHdr_aprv_dt_LC(info);
		else if (lc == Hdr_aprv_tm) doHdr_aprv_tm_LC(info);
		else if (lc == Hdr_upd_cntr) doHdr_upd_cntr_LC(info);
		else if (lc == Hdr_insp_bind_typ) doHdr_insp_bind_typ_LC(info);
		else if (lc == columnDtlStd_insp_seq) doDtlStd_insp_seq_LC(info);
		else if (lc == columnDtlStd_insp_point_cd) doDtlStd_insp_point_cd_LC(info);
		else if (lc == columnDtlStd_insp_point_nm) doDtlStd_insp_point_nm_LC(info);
		else if (lc == columnDtlStd_insp_qlqn_typ) doDtlStd_insp_qlqn_typ_LC(info);
		else if (lc == columnDtlStd_insp_qlqn_typ_nm) doDtlStd_insp_qlqn_typ_nm_LC(info);
		else if (lc == columnDtlStd_ql_std_val) doDtlStd_ql_std_val_LC(info);
		else if (lc == columnDtlStd_trd_unit_cd) doDtlStd_trd_unit_cd_LC(info);
		else if (lc == columnDtlStd_trd_unit_nm) doDtlStd_trd_unit_nm_LC(info);
		else if (lc == columnDtlStd_qn_int_digit) doDtlStd_qn_int_digit_LC(info);
		else if (lc == columnDtlStd_qn_int_frac) doDtlStd_qn_int_frac_LC(info);
		else if (lc == columnDtlStd_sign_out_min_typ) doDtlStd_sign_out_min_typ_LC(info);
		else if (lc == columnDtlStd_sign_out_min_typ_nm) doDtlStd_sign_out_min_typ_nm_LC(info);
		else if (lc == columnDtlStd_sign_in_min_typ) doDtlStd_sign_in_min_typ_LC(info);
		else if (lc == columnDtlStd_sign_in_min_typ_nm) doDtlStd_sign_in_min_typ_nm_LC(info);
		else if (lc == columnDtlStd_sign_in_max_typ) doDtlStd_sign_in_max_typ_LC(info);
		else if (lc == columnDtlStd_sign_in_max_typ_nm) doDtlStd_sign_in_max_typ_nm_LC(info);
		else if (lc == columnDtlStd_sign_out_max_typ) doDtlStd_sign_out_max_typ_LC(info);
		else if (lc == columnDtlStd_sign_out_max_typ_nm) doDtlStd_sign_out_max_typ_nm_LC(info);
		else if (lc == columnDtlStd_intr_rmrks) doDtlStd_intr_rmrks_LC(info);
		else if (lc == columnDtlStd_sub_char1) doDtlStd_sub_char1_LC(info);
		else if (lc == columnDtlStd_sub_char2) doDtlStd_sub_char2_LC(info);
		else if (lc == columnDtlStd_sub_char3) doDtlStd_sub_char3_LC(info);
		else if (lc == columnDtlStd_std_insp_inst_no) doDtlStd_std_insp_inst_no_LC(info);
		else if (lc == columnDtlStd_data_crud_typ) doDtlStd_data_crud_typ_LC(info);
		else if (lc == columnDtlSchd_insp_schd_no) doDtlSchd_insp_schd_no_LC(info);
		else if (lc == columnDtlSchd_pack_unit_cd) doDtlSchd_pack_unit_cd_LC(info);
		else if (lc == columnDtlSchd_pack_unit_nm) doDtlSchd_pack_unit_nm_LC(info);
		else if (lc == columnDtlSchd_pack_dec_place) doDtlSchd_pack_dec_place_LC(info);
		else if (lc == columnDtlSchd_base_unit_cd) doDtlSchd_base_unit_cd_LC(info);
		else if (lc == columnDtlSchd_base_unit_nm) doDtlSchd_base_unit_nm_LC(info);
		else if (lc == columnDtlSchd_base_dec_place) doDtlSchd_base_dec_place_LC(info);
		else if (lc == columnDtlSchd_loc_cd) doDtlSchd_loc_cd_LC(info);
		else if (lc == columnDtlSchd_loc_nm) doDtlSchd_loc_nm_LC(info);
		else if (lc == columnDtlSchd_str_ln_cd) doDtlSchd_str_ln_cd_LC(info);
		else if (lc == columnDtlSchd_str_ln_nm) doDtlSchd_str_ln_nm_LC(info);
		else if (lc == columnDtlSchd_gd_cd) doDtlSchd_gd_cd_LC(info);
		else if (lc == columnDtlSchd_gd_nm) doDtlSchd_gd_nm_LC(info);
		else if (lc == columnDtlSchd_master_dt) doDtlSchd_master_dt_LC(info);
		else if (lc == columnDtlSchd_insp_cnt_rmrks) doDtlSchd_insp_cnt_rmrks_LC(info);
		else if (lc == columnDtlSchd_src_no1) doDtlSchd_src_no1_LC(info);
		else if (lc == columnDtlSchd_src_no2) doDtlSchd_src_no2_LC(info);
		else if (lc == columnDtlSchd_src_no3) doDtlSchd_src_no3_LC(info);
		else if (lc == columnDtlSchd_src_no4) doDtlSchd_src_no4_LC(info);
		else if (lc == columnDtlSchd_ins_usr_id) doDtlSchd_ins_usr_id_LC(info);
		else if (lc == columnDtlSchd_ins_usr_nm) doDtlSchd_ins_usr_nm_LC(info);
		else if (lc == columnDtlSchd_ins_func_id) doDtlSchd_ins_func_id_LC(info);
		else if (lc == columnDtlSchd_ins_func_nm) doDtlSchd_ins_func_nm_LC(info);
		else if (lc == columnDtlSchd_ins_ts) doDtlSchd_ins_ts_LC(info);
		else if (lc == columnDtlSchd_upd_usr_id) doDtlSchd_upd_usr_id_LC(info);
		else if (lc == columnDtlSchd_upd_usr_nm) doDtlSchd_upd_usr_nm_LC(info);
		else if (lc == columnDtlSchd_upd_func_id) doDtlSchd_upd_func_id_LC(info);
		else if (lc == columnDtlSchd_upd_func_nm) doDtlSchd_upd_func_nm_LC(info);
		else if (lc == columnDtlSchd_upd_ts) doDtlSchd_upd_ts_LC(info);
		else if (lc == columnDtlSchd_upd_srv_req_no) doDtlSchd_upd_srv_req_no_LC(info);
		else if (lc == columnDtlSchd_upd_cntr) doDtlSchd_upd_cntr_LC(info);
		else if (lc == columnDtlSchd_insp_inst_issue_typ) doDtlSchd_insp_inst_issue_typ_LC(info);
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_freq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_freq_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ver_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ver_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bp_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bp_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[to_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_to_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_maker_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[inst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_inst_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[master_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_master_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_mtd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_mtd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_mtd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_mtd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_std_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_std_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[spl_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_spl_qty_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[aprv_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_aprv_tm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_bind_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_bind_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[insp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_insp_seq_LC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[insp_point_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_insp_point_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[insp_point_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_insp_point_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[insp_qlqn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_insp_qlqn_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[insp_qlqn_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_insp_qlqn_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[ql_std_val]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_ql_std_val_LC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[qn_int_digit]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_qn_int_digit_LC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[qn_int_frac]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_qn_int_frac_LC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_out_min_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_out_min_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_out_min_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_out_min_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_in_min_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_in_min_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_in_min_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_in_min_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_in_max_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_in_max_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_in_max_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_in_max_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_out_max_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_out_max_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sign_out_max_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sign_out_max_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[std_insp_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_std_insp_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlStd]パネルの[data_crud_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlStd_data_crud_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[insp_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_insp_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[pack_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_pack_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[pack_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_pack_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[pack_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_pack_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[base_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_base_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_gd_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[master_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_master_dt_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[insp_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_insp_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[src_no1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_src_no1_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[src_no2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_src_no2_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[src_no3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_src_no3_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[src_no4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_src_no4_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [DtlSchd]パネルの[insp_inst_issue_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSchd_insp_inst_issue_typ_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_srch_tgt_typ_nm]の作成メソッド
	 */
	public MCList getCnd_srch_tgt_typ_nm(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[Hdr_inst_usr_cd_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getHdr_inst_usr_cd_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_insp_ptn_cd]の作成メソッド
	 */
	public MCList getHdr_insp_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmInspPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_insp_mtd_typ]の作成メソッド
	 */
	public MCList getHdr_insp_mtd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInspMtdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_insp_aprv_sts_typ]の作成メソッド
	 */
	public MCList getHdr_insp_aprv_sts_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[Hdr_aprv_usr_cd_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getHdr_aprv_usr_cd_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlStd_insp_point_cd]の作成メソッド
	 */
	public MCList getDtlStd_insp_point_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInspPoint(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlStd_insp_qlqn_typ]の作成メソッド
	 */
	public MCList getDtlStd_insp_qlqn_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInspQlqnTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlStd_trd_unit_cd]の作成メソッド
	 */
	public MCList getDtlStd_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlStd_sign_out_min_typ]の作成メソッド
	 */
	public MCList getDtlStd_sign_out_min_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSignTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlStd_sign_in_min_typ]の作成メソッド
	 */
	public MCList getDtlStd_sign_in_min_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSignTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlStd_sign_in_max_typ]の作成メソッド
	 */
	public MCList getDtlStd_sign_in_max_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSignTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlStd_sign_out_max_typ]の作成メソッド
	 */
	public MCList getDtlStd_sign_out_max_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSignTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBFL0040.Srch01")) {
			return new MS_MSBFL0040_Srch01Bridge();
		}
		if (id.equals("MS.MSBFL0040.Srch02")) {
			return new MS_MSBFL0040_Srch02Bridge();
		}
		if (id.equals("MS.MSBFL0040.Srch03")) {
			return new MS_MSBFL0040_Srch03Bridge();
		}
		if (id.equals("MS.MSBFL0040.Srch04")) {
			return new MS_MSBFL0040_Srch04Bridge();
		}
		if (id.equals("MS.MSBFL0040.Ins01")) {
			return new MS_MSBFL0040_Ins01Bridge();
		}
		if (id.equals("MS.MSBFL0040.Upd01")) {
			return new MS_MSBFL0040_Upd01Bridge();
		}
		if (id.equals("MS.MSBFL0040.Upd02")) {
			return new MS_MSBFL0040_Upd02Bridge();
		}
		if (id.equals("MS.MSBFL0040.Del01")) {
			return new MS_MSBFL0040_Del01Bridge();
		}
		if (id.equals("MS.MSBFL0040.Del02")) {
			return new MS_MSBFL0040_Del02Bridge();
		}
		if (id.equals("MS.MSBFL0040.Prnt01")) {
			return new MS_MSBFL0040_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBFL0040_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0040_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0040_Srch01;

		/** コンストラクタ */
		protected MS_MSBFL0040_Srch01Bridge() {
			p_MS_MSBFL0040_Srch01 = new MCParam(PDef.MS_MSBFL0040_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0040_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0040.CndSchdR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBF.MSBFP0040.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0040.DtlSchdR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0040.DtlStdR.class));

			p_MS_MSBFL0040_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0040_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0040_Srch01.addUpBlock(getCndSchdL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0040_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0040_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBF.MSBFP0040.CndSchdR> up0() {
			return (MCList<mcframe.clientMSBF.MSBFP0040.CndSchdR>)up(0);
		}

		protected mcframe.clientMSBF.MSBFP0040.HdrR down0() {
			return (mcframe.clientMSBF.MSBFP0040.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0040.DtlSchdR> down1() {
			return (MCList<mcframe.clientMSBF.MSBFP0040.DtlSchdR>)down(1);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR> down2() {
			return (MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0040_Srch01.addDownBlock(mcframe.clientMSBF.MSBFP0040.HdrR.create());
			p_MS_MSBFL0040_Srch01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0040.DtlSchdR.class));
			p_MS_MSBFL0040_Srch01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0040.DtlStdR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0040_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBF.MSBFP0040.HdrR)p_MS_MSBFL0040_Srch01.getContainerParam().getDownBlock(0));
			setDtlSchdL((MCList<mcframe.clientMSBF.MSBFP0040.DtlSchdR>)p_MS_MSBFL0040_Srch01.getContainerParam().getDownBlock(1));
			setDtlStdL((MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR>)p_MS_MSBFL0040_Srch01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlSchdL().clear();
			getDtlStdL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndSchdL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlSchdL());
			result.add(getDtlStdL());
			return result;
		}
	}
	/**
	 * [MS_MSBFL0040_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0040_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0040_Srch02;

		/** コンストラクタ */
		protected MS_MSBFL0040_Srch02Bridge() {
			p_MS_MSBFL0040_Srch02 = new MCParam(PDef.MS_MSBFL0040_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0040_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0040.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBF.MSBFP0040.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0040.DtlSchdR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0040.DtlStdR.class));

			p_MS_MSBFL0040_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0040_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0040_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0040_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0040_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0040.CndR up0() {
			return (mcframe.clientMSBF.MSBFP0040.CndR)up(0);
		}

		protected mcframe.clientMSBF.MSBFP0040.HdrR down0() {
			return (mcframe.clientMSBF.MSBFP0040.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0040.DtlSchdR> down1() {
			return (MCList<mcframe.clientMSBF.MSBFP0040.DtlSchdR>)down(1);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR> down2() {
			return (MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0040_Srch02.addDownBlock(mcframe.clientMSBF.MSBFP0040.HdrR.create());
			p_MS_MSBFL0040_Srch02.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0040.DtlSchdR.class));
			p_MS_MSBFL0040_Srch02.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0040.DtlStdR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0040_Srch02;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBF.MSBFP0040.HdrR)p_MS_MSBFL0040_Srch02.getContainerParam().getDownBlock(0));
			setDtlSchdL((MCList<mcframe.clientMSBF.MSBFP0040.DtlSchdR>)p_MS_MSBFL0040_Srch02.getContainerParam().getDownBlock(1));
			setDtlStdL((MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR>)p_MS_MSBFL0040_Srch02.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlSchdL().clear();
			getDtlStdL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlSchdL());
			result.add(getDtlStdL());
			return result;
		}
	}
	/**
	 * [MS_MSBFL0040_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0040_Srch03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0040_Srch03;

		/** コンストラクタ */
		protected MS_MSBFL0040_Srch03Bridge() {
			p_MS_MSBFL0040_Srch03 = new MCParam(PDef.MS_MSBFL0040_Srch03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0040_Srch03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0040.HdrR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBF.MSBFP0040.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0040.DtlStdR.class));

			p_MS_MSBFL0040_Srch03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0040_Srch03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0040_Srch03.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0040_Srch03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0040_Srch03.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0040.HdrR up0() {
			return (mcframe.clientMSBF.MSBFP0040.HdrR)up(0);
		}

		protected mcframe.clientMSBF.MSBFP0040.HdrR down0() {
			return (mcframe.clientMSBF.MSBFP0040.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR> down1() {
			return (MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0040_Srch03.addDownBlock(mcframe.clientMSBF.MSBFP0040.HdrR.create());
			p_MS_MSBFL0040_Srch03.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0040.DtlStdR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0040_Srch03;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBF.MSBFP0040.HdrR)p_MS_MSBFL0040_Srch03.getContainerParam().getDownBlock(0));
			setDtlStdL((MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR>)p_MS_MSBFL0040_Srch03.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlStdL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlStdL());
			return result;
		}
	}
	/**
	 * [MS_MSBFL0040_Srch04]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0040_Srch04Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0040_Srch04;

		/** コンストラクタ */
		protected MS_MSBFL0040_Srch04Bridge() {
			p_MS_MSBFL0040_Srch04 = new MCParam(PDef.MS_MSBFL0040_Srch04_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0040_Srch04_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0040.HdrR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBF.MSBFP0040.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0040.DtlStdR.class));

			p_MS_MSBFL0040_Srch04 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0040_Srch04.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0040_Srch04.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0040_Srch04.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0040_Srch04.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0040.HdrR up0() {
			return (mcframe.clientMSBF.MSBFP0040.HdrR)up(0);
		}

		protected mcframe.clientMSBF.MSBFP0040.HdrR down0() {
			return (mcframe.clientMSBF.MSBFP0040.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR> down1() {
			return (MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0040_Srch04.addDownBlock(mcframe.clientMSBF.MSBFP0040.HdrR.create());
			p_MS_MSBFL0040_Srch04.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0040.DtlStdR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0040_Srch04;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBF.MSBFP0040.HdrR)p_MS_MSBFL0040_Srch04.getContainerParam().getDownBlock(0));
			setDtlStdL((MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR>)p_MS_MSBFL0040_Srch04.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlStdL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlStdL());
			return result;
		}
	}
	/**
	 * [MS_MSBFL0040_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0040_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0040_Ins01;

		/** コンストラクタ */
		protected MS_MSBFL0040_Ins01Bridge() {
			p_MS_MSBFL0040_Ins01 = new MCParam(PDef.MS_MSBFL0040_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0040_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0040.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0040.DtlStdR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0040.DtlSchdR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBF.MSBFP0040.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0040.DtlStdR.class));

			p_MS_MSBFL0040_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0040_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0040_Ins01.addUpBlock(getHdrR());
			p_MS_MSBFL0040_Ins01.addUpBlock(getDtlStdL().shallowClone());
			p_MS_MSBFL0040_Ins01.addUpBlock(getDtlSchdL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0040_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0040_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0040.HdrR up0() {
			return (mcframe.clientMSBF.MSBFP0040.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR> up1() {
			return (MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR>)up(1);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0040.DtlSchdR> up2() {
			return (MCList<mcframe.clientMSBF.MSBFP0040.DtlSchdR>)up(2);
		}

		protected mcframe.clientMSBF.MSBFP0040.HdrR down0() {
			return (mcframe.clientMSBF.MSBFP0040.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR> down1() {
			return (MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0040_Ins01.addDownBlock(mcframe.clientMSBF.MSBFP0040.HdrR.create());
			p_MS_MSBFL0040_Ins01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0040.DtlStdR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0040_Ins01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBF.MSBFP0040.HdrR)p_MS_MSBFL0040_Ins01.getContainerParam().getDownBlock(0));
			setDtlStdL((MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR>)p_MS_MSBFL0040_Ins01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlStdL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlStdL());
			result.add(getDtlSchdL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlStdL());
			return result;
		}
	}
	/**
	 * [MS_MSBFL0040_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0040_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0040_Upd01;

		/** コンストラクタ */
		protected MS_MSBFL0040_Upd01Bridge() {
			p_MS_MSBFL0040_Upd01 = new MCParam(PDef.MS_MSBFL0040_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0040_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0040.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0040.DtlStdR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0040.DtlSchdR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0040.DtlStdR.class));

			p_MS_MSBFL0040_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0040_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0040_Upd01.addUpBlock(getHdrR());
			p_MS_MSBFL0040_Upd01.addUpBlock(getDtlStdL().shallowClone());
			p_MS_MSBFL0040_Upd01.addUpBlock(getDtlSchdL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0040_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0040_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0040.HdrR up0() {
			return (mcframe.clientMSBF.MSBFP0040.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR> up1() {
			return (MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR>)up(1);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0040.DtlSchdR> up2() {
			return (MCList<mcframe.clientMSBF.MSBFP0040.DtlSchdR>)up(2);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0040_Upd01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0040.DtlStdR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0040_Upd01;
		}

		protected void show() {
			setDtlStdL((MCList<mcframe.clientMSBF.MSBFP0040.DtlStdR>)p_MS_MSBFL0040_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlStdL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlStdL());
			result.add(getDtlSchdL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlStdL());
			return result;
		}
	}
	/**
	 * [MS_MSBFL0040_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0040_Upd02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0040_Upd02;

		/** コンストラクタ */
		protected MS_MSBFL0040_Upd02Bridge() {
			p_MS_MSBFL0040_Upd02 = new MCParam(PDef.MS_MSBFL0040_Upd02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0040_Upd02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0040.HdrR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBF.MSBFP0040.HdrR.create());

			p_MS_MSBFL0040_Upd02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0040_Upd02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0040_Upd02.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0040_Upd02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0040_Upd02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0040.HdrR up0() {
			return (mcframe.clientMSBF.MSBFP0040.HdrR)up(0);
		}

		protected mcframe.clientMSBF.MSBFP0040.HdrR down0() {
			return (mcframe.clientMSBF.MSBFP0040.HdrR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0040_Upd02.addDownBlock(mcframe.clientMSBF.MSBFP0040.HdrR.create());
		}
		protected MCParam param() {
			return p_MS_MSBFL0040_Upd02;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBF.MSBFP0040.HdrR)p_MS_MSBFL0040_Upd02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getHdrR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
	}
	/**
	 * [MS_MSBFL0040_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0040_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0040_Del01;

		/** コンストラクタ */
		protected MS_MSBFL0040_Del01Bridge() {
			p_MS_MSBFL0040_Del01 = new MCParam(PDef.MS_MSBFL0040_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0040_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0040.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0040.DtlSchdR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBF.MSBFP0040.HdrR.create());

			p_MS_MSBFL0040_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0040_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0040_Del01.addUpBlock(getHdrR());
			p_MS_MSBFL0040_Del01.addUpBlock(getDtlSchdL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0040_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0040_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0040.HdrR up0() {
			return (mcframe.clientMSBF.MSBFP0040.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0040.DtlSchdR> up1() {
			return (MCList<mcframe.clientMSBF.MSBFP0040.DtlSchdR>)up(1);
		}

		protected mcframe.clientMSBF.MSBFP0040.HdrR down0() {
			return (mcframe.clientMSBF.MSBFP0040.HdrR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0040_Del01.addDownBlock(mcframe.clientMSBF.MSBFP0040.HdrR.create());
		}
		protected MCParam param() {
			return p_MS_MSBFL0040_Del01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBF.MSBFP0040.HdrR)p_MS_MSBFL0040_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getHdrR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlSchdL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
	}
	/**
	 * [MS_MSBFL0040_Del02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0040_Del02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0040_Del02;

		/** コンストラクタ */
		protected MS_MSBFL0040_Del02Bridge() {
			p_MS_MSBFL0040_Del02 = new MCParam(PDef.MS_MSBFL0040_Del02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0040_Del02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0040.HdrR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBF.MSBFP0040.HdrR.create());

			p_MS_MSBFL0040_Del02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0040_Del02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0040_Del02.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0040_Del02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0040_Del02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0040.HdrR up0() {
			return (mcframe.clientMSBF.MSBFP0040.HdrR)up(0);
		}

		protected mcframe.clientMSBF.MSBFP0040.HdrR down0() {
			return (mcframe.clientMSBF.MSBFP0040.HdrR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0040_Del02.addDownBlock(mcframe.clientMSBF.MSBFP0040.HdrR.create());
		}
		protected MCParam param() {
			return p_MS_MSBFL0040_Del02;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBF.MSBFP0040.HdrR)p_MS_MSBFL0040_Del02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getHdrR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
	}
	/**
	 * [MS_MSBFL0040_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0040_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0040_Prnt01;

		/** コンストラクタ */
		protected MS_MSBFL0040_Prnt01Bridge() {
			p_MS_MSBFL0040_Prnt01 = new MCParam(PDef.MS_MSBFL0040_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0040_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0040.HdrR.create());
			// Down

			p_MS_MSBFL0040_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0040_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0040_Prnt01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0040_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0040_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0040.HdrR up0() {
			return (mcframe.clientMSBF.MSBFP0040.HdrR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBFL0040_Prnt01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}