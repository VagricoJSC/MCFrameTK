package mcframe.clientMSBF.MSBFP0050;

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
import mcframe.clientMSBF.MSBFP0050.MSBFP_StdInspActReg_MC.MS_MSBFL0050_Srch01Caller;
import mcframe.clientMSBF.MSBFP0050.MSBFP_StdInspActReg_MC.MS_MSBFL0050_Upd01Caller;
import mcframe.clientMSBF.MSBFP0050.MSBFP_StdInspActReg_MC.MS_MSBFL0050_Upd02Caller;
import mcframe.clientMSBF.MSBFP0050.MSBFP_StdInspActReg_MC.MS_MSBFL0050_Del01Caller;
import mcframe.clientMSBF.MSBFP0050.MSBFP_StdInspActReg_MC.MS_MSBFL0050_Del02Caller;
import mcframe.clientMSBF.MSBFP0050.MSBFP_StdInspActReg_MC.MS_MSBFL0050_Prnt01Caller;

/**
 * 画面"MSBFP_StdInspActReg"パネルクラスです。<p>
 *
 * 検査項目ごとの実績の登録画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFP_StdInspActReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBFP0050";

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
	 * INS,Create/Modify,0;UPD,Firm,1;DEL,Cancel,2;DEL_CNF,Cancel firming,3;REF,View,4 INS,登録・訂正する,0;UPD,確認する,1;DEL,取り消す,2;DEL_CNF,確認を取り消す,3;REF,参照する,4.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_DEL_CNF = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_insp_no_Label = null;
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_insp_no = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [HdrTab]ブロック関連のField定義
	public MCPanel HdrTabPanel = null;
	public MCTabbedPane HdrTabTab = null;
	// [HdrTab]ブロックの項目のField定義
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	// [Hdr]ブロックの項目のField定義
	public MCLabel Hdr_insp_no_Label = null;
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_insp_no = null;
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
	public MCTextComboBox Hdr_insp_sts_typ = null;
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
	public MCTextComboBox Hdr_insp_typ = null;
	/**
	 * Inspection classification type name 検査種類区分名.<p>
	 *
	 */
	public MCTextField Hdr_insp_typ_nm = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Hdr_itm_p_PPanel;
	public MCTextField Hdr_itm_cd;	// [Hdr]の[itm_p.itm_cd]を[Hdr_itm_cd]としてエイリアス定義。
	public MCTextComboBox Hdr_itm_sub1;	// [Hdr]の[itm_p.itm_sub1]を[Hdr_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Hdr_itm_sub2;	// [Hdr]の[itm_p.itm_sub2]を[Hdr_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Hdr_itm_sub3;	// [Hdr]の[itm_p.itm_sub3]を[Hdr_itm_sub3]としてエイリアス定義。
	public MCTextField Hdr_itm_nm;	// [Hdr]の[itm_p.itm_nm]を[Hdr_itm_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H Hdr_ver_no_p_PPanel;
	public MCLabel Hdr_lot_no_Label = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCTextComboBox Hdr_sublot_no = null;
	public MCLabel Hdr_vld_dt_Label = null;
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDateField Hdr_vld_dt = null;
	public MCLabel Hdr_lmt_dt_Label = null;
	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCDateField Hdr_lmt_dt = null;
	public MCLabel Hdr_mfg_loc_cd_Label = null;
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_mfg_loc_cd = null;
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
	public MCLabel Hdr_to_site_cd_Label = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_to_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCTextField Hdr_to_site_nm = null;
	public MCLabel Hdr_bp_lot_no_Label = null;
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_bp_lot_no = null;
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
	public MCLabel Hdr_insp_judg_rslt_typ_Label = null;
	/**
	 * Inspection decision result type 検査判定結果区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_insp_judg_rslt_typ = null;
	/**
	 * Inspection decision result type name 検査判定結果区分名.<p>
	 *
	 */
	public MCTextField Hdr_insp_judg_rslt_typ_nm = null;
	public MCLabel Hdr_judg_dt_Label = null;
	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public MCDateField Hdr_judg_dt = null;
	public MCLabel Hdr_judg_usr_cd_Label = null;
	/**
	 * Decision PIC cd. 判定者ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_judg_usr_cd = null;
	/**
	 * Decision PIC name 判定者名.<p>
	 *
	 */
	public MCTextField Hdr_judg_usr_nm = null;
	public MCLabel Hdr_judg_dpt_cd_Label = null;
	/**
	 * Decision dept. cd. 判定部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_judg_dpt_cd = null;
	/**
	 * Decision dept. name 判定部門名.<p>
	 *
	 */
	public MCTextField Hdr_judg_dpt_nm = null;
	public mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H Hdr_std_cont_fctrt_p_PPanel;
	public mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H Hdr_act_cont_fctr_p_PPanel;
	/**
	 * Inspection report printed 検査成績書発行済.<p>
	 *
	 */
	public MCCheckBox Hdr_insp_rslt_prnt_flg = null;
	public MCLabel Hdr_insp_rslt_prnt_tm_Label = null;
	/**
	 * Inspection report printed date and time 検査成績書発行日時.<p>
	 *
	 */
	public MCDateField Hdr_insp_rslt_prnt_tm = null;
	public MCLabel Hdr_intr_rmrks_Label = null;
	/**
	 * Inspection order internal remarks 検査指図内部備考.<p>
	 *
	 */
	public MCTextField Hdr_intr_rmrks = null;
	public MCLabel Hdr_sub_char1_Label = null;
	/**
	 * Inspection order spare 1 検査指図予備１.<p>
	 *
	 */
	public MCTextField Hdr_sub_char1 = null;
	public MCLabel Hdr_sub_char2_Label = null;
	/**
	 * Inspection order spare 2 検査指図予備２.<p>
	 *
	 */
	public MCTextField Hdr_sub_char2 = null;
	public MCLabel Hdr_sub_char3_Label = null;
	/**
	 * Inspection order spare 3 検査指図予備３.<p>
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
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_upd_srv_req_no = null;
	// [Hdr2]ブロック関連のField定義
	public MCPanel Hdr2Panel = null;
	// [Hdr2]ブロックの項目のField定義
	// [BulkSet]ブロック関連のField定義
	public MCPanel BulkSetPanel = null;
	// [BulkSet]ブロックの項目のField定義
	public MCLabel BulkSet_cnf_dt_Label = null;
	/**
	 * Check date 確認日.<p>
	 *
	 */
	public MCDateField BulkSet_cnf_dt = null;
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H BulkSet_usr_dpt_p_PPanel;
	public MCTextField BulkSet_cnf_usr_cd;	// [BulkSet]の[usr_dpt_p.usr_cd]を[BulkSet_cnf_usr_cd]としてエイリアス定義。
	public MCTextField BulkSet_cnf_usr_nm;	// [BulkSet]の[usr_dpt_p.usr_nm]を[BulkSet_cnf_usr_nm]としてエイリアス定義。
	public MCTextComboBox BulkSet_cnf_dpt_cd;	// [BulkSet]の[usr_dpt_p.dpt_cd]を[BulkSet_cnf_dpt_cd]としてエイリアス定義。
	public MCTextField BulkSet_cnf_dpt_nm;	// [BulkSet]の[usr_dpt_p.dpt_nm]を[BulkSet_cnf_dpt_nm]としてエイリアス定義。
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBF.MSBFP0050.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Inspection sequence 検査順序.<p>
	 *
	 */
	public MCColumnConfig columnDtl_insp_seq = null;
	/**
	 * Inspection checkpoint cd. 検査項目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_insp_point_cd = null;
	/**
	 * Inspection checkpoint name 検査項目名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_insp_point_nm = null;
	/**
	 * Qualitative/quantitative type 定性定量区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_insp_qlqn_typ = null;
	/**
	 * Qualitative/quantitative type name 定性定量区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_insp_qlqn_typ_nm = null;
	/**
	 * Qualitative specific value 定性規格値.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ql_std_val = null;
	/**
	 * Qualitative inspection value 定性検査値.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ql_insp_val = null;
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_nm = null;
	public mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D Dtl_qn_out_min_p_PPanel;
	public MCColumnConfig columnDtl_qn_out_min;// [Dtl]の[qn_out_min_p.qn_insp_val]を[columnDtl_qn_out_min]としてエイリアス定義。
	/**
	 * Sign type 符号区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sign_out_min_typ = null;
	/**
	 * Sign type name 符号区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sign_out_min_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D Dtl_qn_in_min_p_PPanel;
	public MCColumnConfig columnDtl_qn_in_min;// [Dtl]の[qn_in_min_p.qn_insp_val]を[columnDtl_qn_in_min]としてエイリアス定義。
	/**
	 * Sign type 符号区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sign_in_min_typ = null;
	/**
	 * Sign type name 符号区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sign_in_min_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D Dtl_qn_insp_val_p_PPanel;
	public MCColumnConfig columnDtl_qn_insp_val;// [Dtl]の[qn_insp_val_p.qn_insp_val]を[columnDtl_qn_insp_val]としてエイリアス定義。
	/**
	 * Sign type 符号区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sign_in_max_typ = null;
	/**
	 * Sign type name 符号区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sign_in_max_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D Dtl_qn_in_max_p_PPanel;
	public MCColumnConfig columnDtl_qn_in_max;// [Dtl]の[qn_in_max_p.qn_insp_val]を[columnDtl_qn_in_max]としてエイリアス定義。
	/**
	 * Sign type 符号区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sign_out_max_typ = null;
	/**
	 * Sign type name 符号区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sign_out_max_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D Dtl_qn_out_max_p_PPanel;
	public MCColumnConfig columnDtl_qn_out_max;// [Dtl]の[qn_out_max_p.qn_insp_val]を[columnDtl_qn_out_max]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Dtl_st_tm_p_PPanel;
	public MCColumnConfig columnDtl_st_dt;// [Dtl]の[st_tm_p.ymd]を[columnDtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_st_tm;// [Dtl]の[st_tm_p.hm]を[columnDtl_st_tm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Dtl_end_tm_p_PPanel;
	public MCColumnConfig columnDtl_end_dt;// [Dtl]の[end_tm_p.ymd]を[columnDtl_end_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_end_tm;// [Dtl]の[end_tm_p.hm]を[columnDtl_end_tm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Dtl_usr_dpt_p_PPanel;
	public MCColumnConfig columnDtl_usr_cd;// [Dtl]の[usr_dpt_p.usr_cd]を[columnDtl_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_usr_nm;// [Dtl]の[usr_dpt_p.usr_nm]を[columnDtl_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_dpt_cd;// [Dtl]の[usr_dpt_p.dpt_cd]を[columnDtl_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dpt_nm;// [Dtl]の[usr_dpt_p.dpt_nm]を[columnDtl_dpt_nm]としてエイリアス定義。
	/**
	 * Inspection result type 検査結果区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_std_insp_rslt_typ = null;
	/**
	 * Inspection result type name 検査結果区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_std_insp_rslt_typ_nm = null;
	/**
	 * Specific inspection result internal remarks 規格検査実績内部備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_act_intr_rmrks = null;
	/**
	 * Result spare 1 実績予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char1 = null;
	/**
	 * Result spare 2 実績予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char2 = null;
	/**
	 * Result spare 3 実績予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char3 = null;
	/**
	 * Check flg. 確認ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cnf_flg = null;
	/**
	 * Check date 確認日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cnf_dt = null;
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Dtl_cnf_usr_dpt_p_PPanel;
	public MCColumnConfig columnDtl_cnf_usr_cd;// [Dtl]の[cnf_usr_dpt_p.usr_cd]を[columnDtl_cnf_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_cnf_usr_nm;// [Dtl]の[cnf_usr_dpt_p.usr_nm]を[columnDtl_cnf_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_cnf_dpt_cd;// [Dtl]の[cnf_usr_dpt_p.dpt_cd]を[columnDtl_cnf_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_cnf_dpt_nm;// [Dtl]の[cnf_usr_dpt_p.dpt_nm]を[columnDtl_cnf_dpt_nm]としてエイリアス定義。
	/**
	 * Specific inspection confirmation internal remarks 規格検査確認内部備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cnf_intr_rmrks = null;
	/**
	 * Specific inspection order internal remarks 規格検査指図内部備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_intr_rmrks = null;
	/**
	 * Order spare 1 指図予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inst_sub_char1 = null;
	/**
	 * Order spare 2 指図予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inst_sub_char2 = null;
	/**
	 * Order spare 3 指図予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inst_sub_char3 = null;
	/**
	 * Inspection specific order No. 検査規格指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_std_insp_inst_no = null;
	/**
	 * Inspection specific result No. 検査規格実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_std_insp_act_no = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_srv_req_no = null;
	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_qn_int_digit = null;
	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_qn_int_frac = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Inspection report 検査成績書.<p>
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
	/**
	 * Inspection report immediate issue 検査成績書即時発行.<p>
	 *
	 */
	public MCCheckBox Btn_prnt_flg = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_cnf = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del_cnf = null;
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
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [DEL_CNF]モードを表す定数 */
	public static final String DEL_CNF = "DEL_CNF";
	/** [FIX_D]モードを表す定数 */
	public static final String FIX_D = "FIX_D";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, INS, FIX_I, UPD, FIX_U, DEL, DEL_CNF, FIX_D, REF};
	
	/** [MS_MSBFL0050_Srch01]のCallerの作成 */
	protected MSBFP_StdInspActReg_MC.MS_MSBFL0050_Srch01Caller createMS_MSBFL0050_Srch01() {
		MSBFP_StdInspActReg_MC.MS_MSBFL0050_Srch01Caller<MSBFP_StdInspActReg, MS_MSBFL0050_Srch01Bridge>
		caller = ((MSBFP_StdInspActReg_MC)this).new MS_MSBFL0050_Srch01Caller<MSBFP_StdInspActReg, MS_MSBFL0050_Srch01Bridge>(
					(MSBFP_StdInspActReg)this, new MS_MSBFL0050_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBFL0050_Srch01]の呼び出し */
	protected void callMS_MSBFL0050_Srch01() {
		MCCaller caller = createMS_MSBFL0050_Srch01();
		caller.exec();
	}
	/** [MS_MSBFL0050_Upd01]のCallerの作成 */
	protected MSBFP_StdInspActReg_MC.MS_MSBFL0050_Upd01Caller createMS_MSBFL0050_Upd01() {
		MSBFP_StdInspActReg_MC.MS_MSBFL0050_Upd01Caller<MSBFP_StdInspActReg, MS_MSBFL0050_Upd01Bridge>
		caller = ((MSBFP_StdInspActReg_MC)this).new MS_MSBFL0050_Upd01Caller<MSBFP_StdInspActReg, MS_MSBFL0050_Upd01Bridge>(
					(MSBFP_StdInspActReg)this, new MS_MSBFL0050_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBFL0050_Upd01]の呼び出し */
	protected void callMS_MSBFL0050_Upd01() {
		MCCaller caller = createMS_MSBFL0050_Upd01();
		caller.exec();
	}
	/** [MS_MSBFL0050_Upd02]のCallerの作成 */
	protected MSBFP_StdInspActReg_MC.MS_MSBFL0050_Upd02Caller createMS_MSBFL0050_Upd02() {
		MSBFP_StdInspActReg_MC.MS_MSBFL0050_Upd02Caller<MSBFP_StdInspActReg, MS_MSBFL0050_Upd02Bridge>
		caller = ((MSBFP_StdInspActReg_MC)this).new MS_MSBFL0050_Upd02Caller<MSBFP_StdInspActReg, MS_MSBFL0050_Upd02Bridge>(
					(MSBFP_StdInspActReg)this, new MS_MSBFL0050_Upd02Bridge());
		return caller;
	}
	/** [MS_MSBFL0050_Upd02]の呼び出し */
	protected void callMS_MSBFL0050_Upd02() {
		MCCaller caller = createMS_MSBFL0050_Upd02();
		caller.exec();
	}
	/** [MS_MSBFL0050_Del01]のCallerの作成 */
	protected MSBFP_StdInspActReg_MC.MS_MSBFL0050_Del01Caller createMS_MSBFL0050_Del01() {
		MSBFP_StdInspActReg_MC.MS_MSBFL0050_Del01Caller<MSBFP_StdInspActReg, MS_MSBFL0050_Del01Bridge>
		caller = ((MSBFP_StdInspActReg_MC)this).new MS_MSBFL0050_Del01Caller<MSBFP_StdInspActReg, MS_MSBFL0050_Del01Bridge>(
					(MSBFP_StdInspActReg)this, new MS_MSBFL0050_Del01Bridge());
		return caller;
	}
	/** [MS_MSBFL0050_Del01]の呼び出し */
	protected void callMS_MSBFL0050_Del01() {
		MCCaller caller = createMS_MSBFL0050_Del01();
		caller.exec();
	}
	/** [MS_MSBFL0050_Del02]のCallerの作成 */
	protected MSBFP_StdInspActReg_MC.MS_MSBFL0050_Del02Caller createMS_MSBFL0050_Del02() {
		MSBFP_StdInspActReg_MC.MS_MSBFL0050_Del02Caller<MSBFP_StdInspActReg, MS_MSBFL0050_Del02Bridge>
		caller = ((MSBFP_StdInspActReg_MC)this).new MS_MSBFL0050_Del02Caller<MSBFP_StdInspActReg, MS_MSBFL0050_Del02Bridge>(
					(MSBFP_StdInspActReg)this, new MS_MSBFL0050_Del02Bridge());
		return caller;
	}
	/** [MS_MSBFL0050_Del02]の呼び出し */
	protected void callMS_MSBFL0050_Del02() {
		MCCaller caller = createMS_MSBFL0050_Del02();
		caller.exec();
	}
	/** [MS_MSBFL0050_Prnt01]のCallerの作成 */
	protected MSBFP_StdInspActReg_MC.MS_MSBFL0050_Prnt01Caller createMS_MSBFL0050_Prnt01() {
		MSBFP_StdInspActReg_MC.MS_MSBFL0050_Prnt01Caller<MSBFP_StdInspActReg, MS_MSBFL0050_Prnt01Bridge>
		caller = ((MSBFP_StdInspActReg_MC)this).new MS_MSBFL0050_Prnt01Caller<MSBFP_StdInspActReg, MS_MSBFL0050_Prnt01Bridge>(
					(MSBFP_StdInspActReg)this, new MS_MSBFL0050_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBFL0050_Prnt01]の呼び出し */
	protected void callMS_MSBFL0050_Prnt01() {
		MCCaller caller = createMS_MSBFL0050_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0050.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0050.HdrR aHdrR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0050.BulkSetR aBulkSetR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBF.MSBFP0050.DtlR> aDtlL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0050.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBF.MSBFP0050.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBF.MSBFP0050.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBF.MSBFP0050.CndR createCndR() {
		return mcframe.clientMSBF.MSBFP0050.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBF.MSBFP0050.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBF.MSBFP0050.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBF.MSBFP0050.HdrR createHdrR() {
		return mcframe.clientMSBF.MSBFP0050.HdrR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMSBF.MSBFP0050.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBF.MSBFP0050.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBF.MSBFP0050.BulkSetR createBulkSetR() {
		return mcframe.clientMSBF.MSBFP0050.BulkSetR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBF.MSBFP0050.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0050.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBF.MSBFP0050.DtlR createDtlR() {
		return mcframe.clientMSBF.MSBFP0050.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0050.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBF.MSBFP0050.DtlR.class);
	}

	/**
	 * DtlTableを初期化します。
	 */
	protected void createDtlTable(){
		if(DtlTable == null){
			DtlTable = beansFactory.createTable2("Dtl.table");
		}
	}

	/**
	 * 項目コピーによってaBtnRを設定します。
	 *
	 * aBtnRのインスタンスは変更されません。
	 *
	 * @param row BtnR
	 */
	public void setBtnR(mcframe.clientMSBF.MSBFP0050.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBF.MSBFP0050.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBF.MSBFP0050.BtnR createBtnR() {
		return mcframe.clientMSBF.MSBFP0050.BtnR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
		if(!MCCollectionUtil.contains(ret, getBulkSetR())) ret.add(getBulkSetR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
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
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getHdrR()) return "Hdr";
		if(aCnt == getBulkSetR()) return "BulkSet";
		if(aCnt == getDtlL()) return "Dtl";
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
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("Hdr")) return getHdrR();
		if(bId.equals("BulkSet")) return getBulkSetR();
		if(bId.equals("Dtl")) return getDtlL();
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
		ret.add(Hdr2Panel);
		ret.add(BulkSetPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBFP_StdInspActReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBFP_StdInspActReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aBtnR = createBtnR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBFP_StdInspActReg_MC.jbCreateScreenOpe((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.jbCreateCnd((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.jbCreateHdrTab((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.jbCreateHdr((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.jbCreateHdr2((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.jbCreateBulkSet((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.jbCreateDtl((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.jbCreateBtn((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.jbCreateEastBtn((MSBFP_StdInspActReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBFP_StdInspActReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBFP_StdInspActReg p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBFP_StdInspActReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBFP_StdInspActReg p) {
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
		p.Hdr_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.create(p.getHdrR().ver_no_p());
		p.Hdr_ver_no_p_PPanel.setName("Hdr.ver_no_p");
		p.Hdr_std_cont_fctrt_p_PPanel = mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.create(p.getHdrR().std_cont_fctrt_p());
		p.Hdr_std_cont_fctrt_p_PPanel.setName("Hdr.std_cont_fctrt_p");
		p.Hdr_act_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.create(p.getHdrR().act_cont_fctr_p());
		p.Hdr_act_cont_fctr_p_PPanel.setName("Hdr.act_cont_fctr_p");
	}

	/**
	 * [Hdr2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr2(MSBFP_StdInspActReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MSBFP_StdInspActReg p) {
		p.BulkSet_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getBulkSetR().usr_dpt_p());
		p.BulkSet_usr_dpt_p_PPanel.setName("BulkSet.usr_dpt_p");
		p.BulkSet_cnf_usr_cd = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.BulkSet_cnf_usr_cd.addAliasName("BulkSet.cnf_usr_cd", p);
		p.BulkSet_cnf_usr_nm = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.BulkSet_cnf_usr_nm.addAliasName("BulkSet.cnf_usr_nm", p);
		p.BulkSet_cnf_dpt_cd = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.BulkSet_cnf_dpt_cd.addAliasName("BulkSet.cnf_dpt_cd", p);
		p.BulkSet_cnf_dpt_nm = p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.BulkSet_cnf_dpt_nm.addAliasName("BulkSet.cnf_dpt_nm", p);
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBFP_StdInspActReg p) {
		p.Dtl_qn_out_min_p_PPanel = mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.create(mcframe.clientMSBF.MSBFP0050.DtlR.$qn_out_min_p);
		p.Dtl_qn_out_min_p_PPanel.setName("Dtl.qn_out_min_p");
		p.columnDtl_qn_out_min = p.Dtl_qn_out_min_p_PPanel.columnQnInspVal_qn_insp_val;
		p.columnDtl_qn_out_min.addAliasName("Dtl.qn_out_min", p);
		p.Dtl_qn_in_min_p_PPanel = mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.create(mcframe.clientMSBF.MSBFP0050.DtlR.$qn_in_min_p);
		p.Dtl_qn_in_min_p_PPanel.setName("Dtl.qn_in_min_p");
		p.columnDtl_qn_in_min = p.Dtl_qn_in_min_p_PPanel.columnQnInspVal_qn_insp_val;
		p.columnDtl_qn_in_min.addAliasName("Dtl.qn_in_min", p);
		p.Dtl_qn_insp_val_p_PPanel = mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.create(mcframe.clientMSBF.MSBFP0050.DtlR.$qn_insp_val_p);
		p.Dtl_qn_insp_val_p_PPanel.setName("Dtl.qn_insp_val_p");
		p.columnDtl_qn_insp_val = p.Dtl_qn_insp_val_p_PPanel.columnQnInspVal_qn_insp_val;
		p.columnDtl_qn_insp_val.addAliasName("Dtl.qn_insp_val", p);
		p.Dtl_qn_in_max_p_PPanel = mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.create(mcframe.clientMSBF.MSBFP0050.DtlR.$qn_in_max_p);
		p.Dtl_qn_in_max_p_PPanel.setName("Dtl.qn_in_max_p");
		p.columnDtl_qn_in_max = p.Dtl_qn_in_max_p_PPanel.columnQnInspVal_qn_insp_val;
		p.columnDtl_qn_in_max.addAliasName("Dtl.qn_in_max", p);
		p.Dtl_qn_out_max_p_PPanel = mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.create(mcframe.clientMSBF.MSBFP0050.DtlR.$qn_out_max_p);
		p.Dtl_qn_out_max_p_PPanel.setName("Dtl.qn_out_max_p");
		p.columnDtl_qn_out_max = p.Dtl_qn_out_max_p_PPanel.columnQnInspVal_qn_insp_val;
		p.columnDtl_qn_out_max.addAliasName("Dtl.qn_out_max", p);
		p.Dtl_st_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBF.MSBFP0050.DtlR.$st_tm_p);
		p.Dtl_st_tm_p_PPanel.setName("Dtl.st_tm_p");
		p.columnDtl_st_dt = p.Dtl_st_tm_p_PPanel.columnYmdHm_ymd;
		p.columnDtl_st_dt.addAliasName("Dtl.st_dt", p);
		p.columnDtl_st_tm = p.Dtl_st_tm_p_PPanel.columnYmdHm_hm;
		p.columnDtl_st_tm.addAliasName("Dtl.st_tm", p);
		p.Dtl_end_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBF.MSBFP0050.DtlR.$end_tm_p);
		p.Dtl_end_tm_p_PPanel.setName("Dtl.end_tm_p");
		p.columnDtl_end_dt = p.Dtl_end_tm_p_PPanel.columnYmdHm_ymd;
		p.columnDtl_end_dt.addAliasName("Dtl.end_dt", p);
		p.columnDtl_end_tm = p.Dtl_end_tm_p_PPanel.columnYmdHm_hm;
		p.columnDtl_end_tm.addAliasName("Dtl.end_tm", p);
		p.Dtl_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBF.MSBFP0050.DtlR.$usr_dpt_p);
		p.Dtl_usr_dpt_p_PPanel.setName("Dtl.usr_dpt_p");
		p.columnDtl_usr_cd = p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnDtl_usr_cd.addAliasName("Dtl.usr_cd", p);
		p.columnDtl_usr_nm = p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnDtl_usr_nm.addAliasName("Dtl.usr_nm", p);
		p.columnDtl_dpt_cd = p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnDtl_dpt_cd.addAliasName("Dtl.dpt_cd", p);
		p.columnDtl_dpt_nm = p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnDtl_dpt_nm.addAliasName("Dtl.dpt_nm", p);
		p.Dtl_cnf_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBF.MSBFP0050.DtlR.$cnf_usr_dpt_p);
		p.Dtl_cnf_usr_dpt_p_PPanel.setName("Dtl.cnf_usr_dpt_p");
		p.columnDtl_cnf_usr_cd = p.Dtl_cnf_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnDtl_cnf_usr_cd.addAliasName("Dtl.cnf_usr_cd", p);
		p.columnDtl_cnf_usr_nm = p.Dtl_cnf_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnDtl_cnf_usr_nm.addAliasName("Dtl.cnf_usr_nm", p);
		p.columnDtl_cnf_dpt_cd = p.Dtl_cnf_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnDtl_cnf_dpt_cd.addAliasName("Dtl.cnf_dpt_cd", p);
		p.columnDtl_cnf_dpt_nm = p.Dtl_cnf_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnDtl_cnf_dpt_nm.addAliasName("Dtl.cnf_dpt_nm", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBFP_StdInspActReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBFP_StdInspActReg p) {
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

	
	/** [Hdr_insp_sts_typ_ListPutter]の定義 */
	private MCListPutter Hdr_insp_sts_typ_p = null;

	/**
	 * [Hdr_insp_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_insp_sts_typ_ListPutter() {
		if (Hdr_insp_sts_typ_p == null) {
			Hdr_insp_sts_typ_p = createHdr_insp_sts_typ_ListPutter(Hdr_insp_sts_typ, "insp_sts_typ");

		}
		return Hdr_insp_sts_typ_p;
	}
	
	
	/** [Hdr_insp_typ_ListPutter]の定義 */
	private MCListPutter Hdr_insp_typ_p = null;

	/**
	 * [Hdr_insp_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_insp_typ_ListPutter() {
		if (Hdr_insp_typ_p == null) {
			Hdr_insp_typ_p = createHdr_insp_typ_ListPutter(Hdr_insp_typ, "insp_typ");

		}
		return Hdr_insp_typ_p;
	}
	
	
	/** [Hdr_sublot_no_ListPutter]の定義 */
	private MCListPutter Hdr_sublot_no_p = null;

	/**
	 * [Hdr_sublot_no_ListPutter]の取得
	 */
	protected MCListPutter getHdr_sublot_no_ListPutter() {
		if (Hdr_sublot_no_p == null) {
			Hdr_sublot_no_p = createHdr_sublot_no_ListPutter(Hdr_sublot_no, "sublot_no");

		}
		return Hdr_sublot_no_p;
	}
	
	
	/** [Hdr_mfg_loc_cd_ListPutter]の定義 */
	private MCListPutter Hdr_mfg_loc_cd_p = null;

	/**
	 * [Hdr_mfg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_mfg_loc_cd_ListPutter() {
		if (Hdr_mfg_loc_cd_p == null) {
			Hdr_mfg_loc_cd_p = createHdr_mfg_loc_cd_ListPutter(Hdr_mfg_loc_cd, "mfg_loc_cd", "mfg_loc_nm");

		}
		return Hdr_mfg_loc_cd_p;
	}
	
	
	/** [Hdr_to_site_cd_ListPutter]の定義 */
	private MCListPutter Hdr_to_site_cd_p = null;

	/**
	 * [Hdr_to_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_to_site_cd_ListPutter() {
		if (Hdr_to_site_cd_p == null) {
			Hdr_to_site_cd_p = createHdr_to_site_cd_ListPutter(Hdr_to_site_cd, "to_site_cd", "to_site_nm");

		}
		return Hdr_to_site_cd_p;
	}
	
	
	/** [Hdr_insp_judg_rslt_typ_ListPutter]の定義 */
	private MCListPutter Hdr_insp_judg_rslt_typ_p = null;

	/**
	 * [Hdr_insp_judg_rslt_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_insp_judg_rslt_typ_ListPutter() {
		if (Hdr_insp_judg_rslt_typ_p == null) {
			Hdr_insp_judg_rslt_typ_p = createHdr_insp_judg_rslt_typ_ListPutter(Hdr_insp_judg_rslt_typ, "insp_judg_rslt_typ", "insp_judg_rslt_typ_nm");

		}
		return Hdr_insp_judg_rslt_typ_p;
	}
	
	
	/** [Hdr_judg_dpt_cd_ListPutter]の定義 */
	private MCListPutter Hdr_judg_dpt_cd_p = null;

	/**
	 * [Hdr_judg_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_judg_dpt_cd_ListPutter() {
		if (Hdr_judg_dpt_cd_p == null) {
			Hdr_judg_dpt_cd_p = createHdr_judg_dpt_cd_ListPutter(Hdr_judg_dpt_cd, "judg_dpt_cd");

		}
		return Hdr_judg_dpt_cd_p;
	}
	
	
	/** [BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "cnf_dpt_cd", "cnf_dpt_nm");
		}
		return BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [Dtl_insp_point_cd_ListPutter]の定義 */
	private MCListPutter Dtl_insp_point_cd_p = null;

	/**
	 * [Dtl_insp_point_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_insp_point_cd_ListPutter() {
		if (Dtl_insp_point_cd_p == null) {
			Dtl_insp_point_cd_p = createDtl_insp_point_cd_ListPutter(columnDtl_insp_point_cd, "insp_point_cd", "insp_point_nm");

		}
		return Dtl_insp_point_cd_p;
	}
	
	
	/** [Dtl_insp_qlqn_typ_ListPutter]の定義 */
	private MCListPutter Dtl_insp_qlqn_typ_p = null;

	/**
	 * [Dtl_insp_qlqn_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_insp_qlqn_typ_ListPutter() {
		if (Dtl_insp_qlqn_typ_p == null) {
			Dtl_insp_qlqn_typ_p = createDtl_insp_qlqn_typ_ListPutter(columnDtl_insp_qlqn_typ, "insp_qlqn_typ", "insp_qlqn_typ_nm");

		}
		return Dtl_insp_qlqn_typ_p;
	}
	
	
	/** [Dtl_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_unit_cd_p = null;

	/**
	 * [Dtl_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_unit_cd_ListPutter() {
		if (Dtl_trd_unit_cd_p == null) {
			Dtl_trd_unit_cd_p = createDtl_trd_unit_cd_ListPutter(columnDtl_trd_unit_cd, "trd_unit_cd", "trd_unit_nm");

		}
		return Dtl_trd_unit_cd_p;
	}
	
	
	/** [Dtl_sign_out_min_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sign_out_min_typ_p = null;

	/**
	 * [Dtl_sign_out_min_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sign_out_min_typ_ListPutter() {
		if (Dtl_sign_out_min_typ_p == null) {
			Dtl_sign_out_min_typ_p = createDtl_sign_out_min_typ_ListPutter(columnDtl_sign_out_min_typ, "sign_out_min_typ", "sign_out_min_typ_nm");

		}
		return Dtl_sign_out_min_typ_p;
	}
	
	
	/** [Dtl_sign_in_min_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sign_in_min_typ_p = null;

	/**
	 * [Dtl_sign_in_min_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sign_in_min_typ_ListPutter() {
		if (Dtl_sign_in_min_typ_p == null) {
			Dtl_sign_in_min_typ_p = createDtl_sign_in_min_typ_ListPutter(columnDtl_sign_in_min_typ, "sign_in_min_typ", "sign_in_min_typ_nm");

		}
		return Dtl_sign_in_min_typ_p;
	}
	
	
	/** [Dtl_sign_in_max_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sign_in_max_typ_p = null;

	/**
	 * [Dtl_sign_in_max_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sign_in_max_typ_ListPutter() {
		if (Dtl_sign_in_max_typ_p == null) {
			Dtl_sign_in_max_typ_p = createDtl_sign_in_max_typ_ListPutter(columnDtl_sign_in_max_typ, "sign_in_max_typ", "sign_in_max_typ_nm");

		}
		return Dtl_sign_in_max_typ_p;
	}
	
	
	/** [Dtl_sign_out_max_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sign_out_max_typ_p = null;

	/**
	 * [Dtl_sign_out_max_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sign_out_max_typ_ListPutter() {
		if (Dtl_sign_out_max_typ_p == null) {
			Dtl_sign_out_max_typ_p = createDtl_sign_out_max_typ_ListPutter(columnDtl_sign_out_max_typ, "sign_out_max_typ", "sign_out_max_typ_nm");

		}
		return Dtl_sign_out_max_typ_p;
	}
	
	
	/** [Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = null;

	/**
	 * [Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter() {
		if (Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p == null) {
			Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = createDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd, "dpt_cd", "dpt_nm");
		}
		return Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p;
	}
	
	
	/** [Dtl_std_insp_rslt_typ_ListPutter]の定義 */
	private MCListPutter Dtl_std_insp_rslt_typ_p = null;

	/**
	 * [Dtl_std_insp_rslt_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_std_insp_rslt_typ_ListPutter() {
		if (Dtl_std_insp_rslt_typ_p == null) {
			Dtl_std_insp_rslt_typ_p = createDtl_std_insp_rslt_typ_ListPutter(columnDtl_std_insp_rslt_typ, "std_insp_rslt_typ", "std_insp_rslt_typ_nm");

		}
		return Dtl_std_insp_rslt_typ_p;
	}
	
	
	/** [Dtl_cnf_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_cnf_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = null;

	/**
	 * [Dtl_cnf_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_cnf_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter() {
		if (Dtl_cnf_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p == null) {
			Dtl_cnf_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = createDtl_cnf_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(Dtl_cnf_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd, "cnf_dpt_cd", "cnf_dpt_nm");
		}
		return Dtl_cnf_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBFP_StdInspActReg create(){
		MSBFP_StdInspActReg p = new MSBFP_StdInspActReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBFP_StdInspActReg create(String name){
		MSBFP_StdInspActReg p = new MSBFP_StdInspActReg(name);
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
		MSBFP_StdInspActReg_MC.jbfInitScreenOpe((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.jbfInitCnd((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.jbfInitHdrTab((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.jbfInitHdr((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.jbfInitHdr2((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.jbfInitBulkSet((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.jbfInitDtl((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.jbfInitBtn((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.jbfInitEastBtn((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.jbInitScreenOpe((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.jbInitCnd((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.jbInitHdrTab((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.jbInitHdr((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.jbInitHdr2((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.jbInitBulkSet((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.jbInitDtl((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.jbInitBtn((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.jbInitEastBtn((MSBFP_StdInspActReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBFP_StdInspActReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBFP_StdInspActReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_DEL_CNF = p.beansFactory.createRadioButton("Cnd.ope_DEL_CNF");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_insp_no_Label = p.beansFactory.createLabel("Cnd.insp_no_Label");
		p.Cnd_insp_no = p.beansFactory.createTextField("Cnd.insp_no");
		p.Cnd_insp_no.setLabel(p.Cnd_insp_no_Label);
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBFP_StdInspActReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBFP_StdInspActReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_insp_no_Label = p.beansFactory.createLabel("Hdr.insp_no_Label");
		p.Hdr_insp_no = p.beansFactory.createTextField("Hdr.insp_no");
		p.Hdr_insp_no.setLabel(p.Hdr_insp_no_Label);
		p.Hdr_insp_freq_Label = p.beansFactory.createLabel("Hdr.insp_freq_Label");
		p.Hdr_insp_freq = p.beansFactory.createNumberField("Hdr.insp_freq");
		p.Hdr_insp_freq.setLabel(p.Hdr_insp_freq_Label);
		p.Hdr_insp_sts_typ_Label = p.beansFactory.createLabel("Hdr.insp_sts_typ_Label");
		p.Hdr_insp_sts_typ = p.beansFactory.createTextComboBox("Hdr.insp_sts_typ");
		p.Hdr_insp_sts_typ.setLabel(p.Hdr_insp_sts_typ_Label);
		p.Hdr_insp_sts_typ_nm = p.beansFactory.createTextField("Hdr.insp_sts_typ_nm");
		p.Hdr_insp_typ_Label = p.beansFactory.createLabel("Hdr.insp_typ_Label");
		p.Hdr_insp_typ = p.beansFactory.createTextComboBox("Hdr.insp_typ");
		p.Hdr_insp_typ.setLabel(p.Hdr_insp_typ_Label);
		p.Hdr_insp_typ_nm = p.beansFactory.createTextField("Hdr.insp_typ_nm");
		p.Hdr_lot_no_Label = p.beansFactory.createLabel("Hdr.lot_no_Label");
		p.Hdr_lot_no = p.beansFactory.createTextField("Hdr.lot_no");
		p.Hdr_lot_no.setLabel(p.Hdr_lot_no_Label);
		p.Hdr_sublot_no = p.beansFactory.createTextComboBox("Hdr.sublot_no");
		p.Hdr_vld_dt_Label = p.beansFactory.createLabel("Hdr.vld_dt_Label");
		p.Hdr_vld_dt = p.beansFactory.createDateField("Hdr.vld_dt");
		p.Hdr_vld_dt.setLabel(p.Hdr_vld_dt_Label);
		p.Hdr_lmt_dt_Label = p.beansFactory.createLabel("Hdr.lmt_dt_Label");
		p.Hdr_lmt_dt = p.beansFactory.createDateField("Hdr.lmt_dt");
		p.Hdr_lmt_dt.setLabel(p.Hdr_lmt_dt_Label);
		p.Hdr_mfg_loc_cd_Label = p.beansFactory.createLabel("Hdr.mfg_loc_cd_Label");
		p.Hdr_mfg_loc_cd = p.beansFactory.createTextComboBox("Hdr.mfg_loc_cd");
		p.Hdr_mfg_loc_cd.setLabel(p.Hdr_mfg_loc_cd_Label);
		p.Hdr_mfg_loc_nm = p.beansFactory.createTextField("Hdr.mfg_loc_nm");
		p.Hdr_sppl_cd_Label = p.beansFactory.createLabel("Hdr.sppl_cd_Label");
		p.Hdr_sppl_cd = p.beansFactory.createTextField("Hdr.sppl_cd");
		p.Hdr_sppl_cd.setLabel(p.Hdr_sppl_cd_Label);
		p.Hdr_sppl_nm = p.beansFactory.createTextField("Hdr.sppl_nm");
		p.Hdr_to_site_cd_Label = p.beansFactory.createLabel("Hdr.to_site_cd_Label");
		p.Hdr_to_site_cd = p.beansFactory.createTextComboBox("Hdr.to_site_cd");
		p.Hdr_to_site_cd.setLabel(p.Hdr_to_site_cd_Label);
		p.Hdr_to_site_nm = p.beansFactory.createTextField("Hdr.to_site_nm");
		p.Hdr_bp_lot_no_Label = p.beansFactory.createLabel("Hdr.bp_lot_no_Label");
		p.Hdr_bp_lot_no = p.beansFactory.createTextField("Hdr.bp_lot_no");
		p.Hdr_bp_lot_no.setLabel(p.Hdr_bp_lot_no_Label);
		p.Hdr_insp_std_no_Label = p.beansFactory.createLabel("Hdr.insp_std_no_Label");
		p.Hdr_insp_std_no = p.beansFactory.createTextField("Hdr.insp_std_no");
		p.Hdr_insp_std_no.setLabel(p.Hdr_insp_std_no_Label);
		p.Hdr_std_req_flg = p.beansFactory.createCheckBox("Hdr.std_req_flg");
		p.Hdr_std_cnf_req_flg = p.beansFactory.createCheckBox("Hdr.std_cnf_req_flg");
		p.Hdr_insp_judg_rslt_typ_Label = p.beansFactory.createLabel("Hdr.insp_judg_rslt_typ_Label");
		p.Hdr_insp_judg_rslt_typ = p.beansFactory.createTextComboBox("Hdr.insp_judg_rslt_typ");
		p.Hdr_insp_judg_rslt_typ.setLabel(p.Hdr_insp_judg_rslt_typ_Label);
		p.Hdr_insp_judg_rslt_typ_nm = p.beansFactory.createTextField("Hdr.insp_judg_rslt_typ_nm");
		p.Hdr_judg_dt_Label = p.beansFactory.createLabel("Hdr.judg_dt_Label");
		p.Hdr_judg_dt = p.beansFactory.createDateField("Hdr.judg_dt");
		p.Hdr_judg_dt.setLabel(p.Hdr_judg_dt_Label);
		p.Hdr_judg_usr_cd_Label = p.beansFactory.createLabel("Hdr.judg_usr_cd_Label");
		p.Hdr_judg_usr_cd = p.beansFactory.createTextField("Hdr.judg_usr_cd");
		p.Hdr_judg_usr_cd.setLabel(p.Hdr_judg_usr_cd_Label);
		p.Hdr_judg_usr_nm = p.beansFactory.createTextField("Hdr.judg_usr_nm");
		p.Hdr_judg_dpt_cd_Label = p.beansFactory.createLabel("Hdr.judg_dpt_cd_Label");
		p.Hdr_judg_dpt_cd = p.beansFactory.createTextComboBox("Hdr.judg_dpt_cd");
		p.Hdr_judg_dpt_cd.setLabel(p.Hdr_judg_dpt_cd_Label);
		p.Hdr_judg_dpt_nm = p.beansFactory.createTextField("Hdr.judg_dpt_nm");
		p.Hdr_insp_rslt_prnt_flg = p.beansFactory.createCheckBox("Hdr.insp_rslt_prnt_flg");
		p.Hdr_insp_rslt_prnt_tm_Label = p.beansFactory.createLabel("Hdr.insp_rslt_prnt_tm_Label");
		p.Hdr_insp_rslt_prnt_tm = p.beansFactory.createDateField("Hdr.insp_rslt_prnt_tm");
		p.Hdr_insp_rslt_prnt_tm.setLabel(p.Hdr_insp_rslt_prnt_tm_Label);
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
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr2(MSBFP_StdInspActReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel = p.beansFactory.createPanel("Hdr2");
		// ブロックの項目の初期化
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MSBFP_StdInspActReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
		p.BulkSet_cnf_dt_Label = p.beansFactory.createLabel("BulkSet.cnf_dt_Label");
		p.BulkSet_cnf_dt = p.beansFactory.createDateField("BulkSet.cnf_dt");
		p.BulkSet_cnf_dt.setLabel(p.BulkSet_cnf_dt_Label);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBFP_StdInspActReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_insp_seq = p.beansFactory.createTableColumn("Dtl.insp_seq", MCColumnType.NUMBER);
		p.columnDtl_insp_point_cd = p.beansFactory.createTableColumn("Dtl.insp_point_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_insp_point_nm = p.beansFactory.createTableColumn("Dtl.insp_point_nm", MCColumnType.TEXT);
		p.columnDtl_insp_qlqn_typ = p.beansFactory.createTableColumn("Dtl.insp_qlqn_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_insp_qlqn_typ_nm = p.beansFactory.createTableColumn("Dtl.insp_qlqn_typ_nm", MCColumnType.TEXT);
		p.columnDtl_ql_std_val = p.beansFactory.createTableColumn("Dtl.ql_std_val", MCColumnType.TEXT);
		p.columnDtl_ql_insp_val = p.beansFactory.createTableColumn("Dtl.ql_insp_val", MCColumnType.TEXT);
		p.columnDtl_trd_unit_cd = p.beansFactory.createTableColumn("Dtl.trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_trd_unit_nm = p.beansFactory.createTableColumn("Dtl.trd_unit_nm", MCColumnType.TEXT);
		p.columnDtl_sign_out_min_typ = p.beansFactory.createTableColumn("Dtl.sign_out_min_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sign_out_min_typ_nm = p.beansFactory.createTableColumn("Dtl.sign_out_min_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sign_in_min_typ = p.beansFactory.createTableColumn("Dtl.sign_in_min_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sign_in_min_typ_nm = p.beansFactory.createTableColumn("Dtl.sign_in_min_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sign_in_max_typ = p.beansFactory.createTableColumn("Dtl.sign_in_max_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sign_in_max_typ_nm = p.beansFactory.createTableColumn("Dtl.sign_in_max_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sign_out_max_typ = p.beansFactory.createTableColumn("Dtl.sign_out_max_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sign_out_max_typ_nm = p.beansFactory.createTableColumn("Dtl.sign_out_max_typ_nm", MCColumnType.TEXT);
		p.columnDtl_std_insp_rslt_typ = p.beansFactory.createTableColumn("Dtl.std_insp_rslt_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_std_insp_rslt_typ_nm = p.beansFactory.createTableColumn("Dtl.std_insp_rslt_typ_nm", MCColumnType.TEXT);
		p.columnDtl_act_intr_rmrks = p.beansFactory.createTableColumn("Dtl.act_intr_rmrks", MCColumnType.TEXT);
		p.columnDtl_sub_char1 = p.beansFactory.createTableColumn("Dtl.sub_char1", MCColumnType.TEXT);
		p.columnDtl_sub_char2 = p.beansFactory.createTableColumn("Dtl.sub_char2", MCColumnType.TEXT);
		p.columnDtl_sub_char3 = p.beansFactory.createTableColumn("Dtl.sub_char3", MCColumnType.TEXT);
		p.columnDtl_cnf_flg = p.beansFactory.createTableColumn("Dtl.cnf_flg", MCColumnType.CHECK);
		p.columnDtl_cnf_dt = p.beansFactory.createTableColumn("Dtl.cnf_dt", MCColumnType.DATE);
		p.columnDtl_cnf_intr_rmrks = p.beansFactory.createTableColumn("Dtl.cnf_intr_rmrks", MCColumnType.TEXT);
		p.columnDtl_intr_rmrks = p.beansFactory.createTableColumn("Dtl.intr_rmrks", MCColumnType.TEXT);
		p.columnDtl_inst_sub_char1 = p.beansFactory.createTableColumn("Dtl.inst_sub_char1", MCColumnType.TEXT);
		p.columnDtl_inst_sub_char2 = p.beansFactory.createTableColumn("Dtl.inst_sub_char2", MCColumnType.TEXT);
		p.columnDtl_inst_sub_char3 = p.beansFactory.createTableColumn("Dtl.inst_sub_char3", MCColumnType.TEXT);
		p.columnDtl_std_insp_inst_no = p.beansFactory.createTableColumn("Dtl.std_insp_inst_no", MCColumnType.TEXT);
		p.columnDtl_std_insp_act_no = p.beansFactory.createTableColumn("Dtl.std_insp_act_no", MCColumnType.TEXT);
		p.columnDtl_ins_usr_id = p.beansFactory.createTableColumn("Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl_ins_usr_nm = p.beansFactory.createTableColumn("Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl_ins_func_id = p.beansFactory.createTableColumn("Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnDtl_ins_func_nm = p.beansFactory.createTableColumn("Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl_ins_ts = p.beansFactory.createTableColumn("Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_usr_id = p.beansFactory.createTableColumn("Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl_upd_usr_nm = p.beansFactory.createTableColumn("Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl_upd_func_id = p.beansFactory.createTableColumn("Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnDtl_upd_func_nm = p.beansFactory.createTableColumn("Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_ts = p.beansFactory.createTableColumn("Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtl_qn_int_digit = p.beansFactory.createTableColumn("Dtl.qn_int_digit", MCColumnType.NUMBER);
		p.columnDtl_qn_int_frac = p.beansFactory.createTableColumn("Dtl.qn_int_frac", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBFP_StdInspActReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_prnt = p.beansFactory.createButton("Btn.prnt", "prnt");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_prnt_flg = p.beansFactory.createCheckBox("Btn.prnt_flg");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_upd_cnf = p.beansFactory.createButton("Btn.upd_cnf", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
		p.Btn_del_cnf = p.beansFactory.createButton("Btn.del_cnf", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBFP_StdInspActReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBFP_StdInspActReg p) {
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
	protected static void jbInitCnd(MSBFP_StdInspActReg p) {
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
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_DEL_CNF);
		p.Cnd_ope_DEL_CNF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL_CNF);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL_CNF);
		p.Cnd_ope_DEL_CNF.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("4");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0050.CndR.ope_META);
		p.CndPanel.add(p.Cnd_insp_no_Label);
		p.CndPanel.add(p.Cnd_insp_no);
		p.CndPanel.setLastBeans(p.Cnd_insp_no);
		p.Cnd_insp_no.setNextBeans(p.Cnd_srch);
		p.Cnd_insp_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0050.CndR.insp_no_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBFP_StdInspActReg p) {
		// ブロック関連の初期化
		p.add(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.BulkSetPanel);
		p.HdrTabPanel.add(p.HdrTabTab);
		p.HdrTabPanel.setLastBeans(p.HdrTabTab);
		p.HdrTabPanel.setLayoutPosition("CT");
		// ブロックの項目の初期化
		p.HdrTabTab.add(p.HdrPanel, "HdrTab.tab1");
		p.HdrTabTab.setLastBeans(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		p.HdrTabTab.add(p.Hdr2Panel, "HdrTab.tab2");
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBFP_StdInspActReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_insp_no_Label);
		p.HdrPanel.add(p.Hdr_insp_no);
		p.HdrPanel.setLastBeans(p.Hdr_insp_no);
		p.Hdr_insp_no.setNextBeans(p.Hdr_insp_freq);
		p.Hdr_insp_no.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.insp_no_META);
		p.HdrPanel.add(p.Hdr_insp_freq_Label);
		p.HdrPanel.add(p.Hdr_insp_freq);
		p.Hdr_insp_freq.setNextBeans(p.Hdr_insp_sts_typ);
		p.Hdr_insp_freq.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.insp_freq_META);
		p.Hdr_insp_sts_typ.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_insp_sts_typ_Label);
		p.HdrPanel.add(p.Hdr_insp_sts_typ);
		p.Hdr_insp_sts_typ.setNextBeans(p.Hdr_insp_sts_typ_nm);
		p.Hdr_insp_sts_typ.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.insp_sts_typ_META);
		p.HdrPanel.add(p.Hdr_insp_sts_typ_nm);
		p.Hdr_insp_sts_typ_nm.setNextBeans(p.Hdr_insp_typ);
		p.Hdr_insp_sts_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.insp_sts_typ_nm_META);
		p.Hdr_insp_typ.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_insp_typ_Label);
		p.HdrPanel.add(p.Hdr_insp_typ);
		p.Hdr_insp_typ.setNextBeans(p.Hdr_insp_typ_nm);
		p.Hdr_insp_typ.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.insp_typ_META);
		p.HdrPanel.add(p.Hdr_insp_typ_nm);
		p.Hdr_insp_typ_nm.setNextBeans(p.Hdr_itm_p_PPanel);
		p.Hdr_insp_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.insp_typ_nm_META);
		p.HdrPanel.add(p.Hdr_itm_p_PPanel);
		p.Hdr_itm_p_PPanel.setNextBeans(p.Hdr_ver_no_p_PPanel);
		p.HdrPanel.add(p.Hdr_ver_no_p_PPanel);
		p.Hdr_ver_no_p_PPanel.setNextBeans(p.Hdr_lot_no);
		p.HdrPanel.add(p.Hdr_lot_no_Label);
		p.HdrPanel.add(p.Hdr_lot_no);
		p.Hdr_lot_no.setNextBeans(p.Hdr_sublot_no);
		p.Hdr_lot_no.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.lot_no_META);
		p.Hdr_sublot_no.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_sublot_no);
		p.Hdr_sublot_no.setNextBeans(p.Hdr_vld_dt);
		p.Hdr_sublot_no.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.sublot_no_META);
		p.HdrPanel.add(p.Hdr_vld_dt_Label);
		p.HdrPanel.add(p.Hdr_vld_dt);
		p.Hdr_vld_dt.setNextBeans(p.Hdr_lmt_dt);
		p.Hdr_vld_dt.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.vld_dt_META);
		p.Hdr_vld_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_lmt_dt_Label);
		p.HdrPanel.add(p.Hdr_lmt_dt);
		p.Hdr_lmt_dt.setNextBeans(p.Hdr_mfg_loc_cd);
		p.Hdr_lmt_dt.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.lmt_dt_META);
		p.Hdr_lmt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Hdr_mfg_loc_cd.setListType(MCListType.STRICT);
		p.Hdr_mfg_loc_cd.setLinkBeans(p.Hdr_mfg_loc_nm);
		p.HdrPanel.add(p.Hdr_mfg_loc_cd_Label);
		p.HdrPanel.add(p.Hdr_mfg_loc_cd);
		p.Hdr_mfg_loc_cd.setNextBeans(p.Hdr_mfg_loc_nm);
		p.Hdr_mfg_loc_cd.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.mfg_loc_cd_META);
		p.HdrPanel.add(p.Hdr_mfg_loc_nm);
		p.Hdr_mfg_loc_nm.setNextBeans(p.Hdr_sppl_cd);
		p.Hdr_mfg_loc_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.mfg_loc_nm_META);
		p.HdrPanel.add(p.Hdr_sppl_cd_Label);
		p.HdrPanel.add(p.Hdr_sppl_cd);
		p.Hdr_sppl_cd.setNextBeans(p.Hdr_sppl_nm);
		p.Hdr_sppl_cd.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.sppl_cd_META);
		p.HdrPanel.add(p.Hdr_sppl_nm);
		p.Hdr_sppl_nm.setNextBeans(p.Hdr_to_site_cd);
		p.Hdr_sppl_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.sppl_nm_META);
		p.Hdr_to_site_cd.setListType(MCListType.STRICT);
		p.Hdr_to_site_cd.setLinkBeans(p.Hdr_to_site_nm);
		p.HdrPanel.add(p.Hdr_to_site_cd_Label);
		p.HdrPanel.add(p.Hdr_to_site_cd);
		p.Hdr_to_site_cd.setNextBeans(p.Hdr_to_site_nm);
		p.Hdr_to_site_cd.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.to_site_cd_META);
		p.HdrPanel.add(p.Hdr_to_site_nm);
		p.Hdr_to_site_nm.setNextBeans(p.Hdr_bp_lot_no);
		p.Hdr_to_site_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.to_site_nm_META);
		p.HdrPanel.add(p.Hdr_bp_lot_no_Label);
		p.HdrPanel.add(p.Hdr_bp_lot_no);
		p.Hdr_bp_lot_no.setNextBeans(p.Hdr_insp_std_no);
		p.Hdr_bp_lot_no.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.bp_lot_no_META);
		p.HdrPanel.add(p.Hdr_insp_std_no_Label);
		p.HdrPanel.add(p.Hdr_insp_std_no);
		p.Hdr_insp_std_no.setNextBeans(p.Hdr_std_req_flg);
		p.Hdr_insp_std_no.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.insp_std_no_META);
		p.HdrPanel.add(p.Hdr_std_req_flg);
		p.Hdr_std_req_flg.setNextBeans(p.Hdr_std_cnf_req_flg);
		p.Hdr_std_req_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.std_req_flg_META);
		p.HdrPanel.add(p.Hdr_std_cnf_req_flg);
		p.Hdr_std_cnf_req_flg.setNextBeans(p.Hdr_insp_judg_rslt_typ);
		p.Hdr_std_cnf_req_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.std_cnf_req_flg_META);
		p.Hdr_insp_judg_rslt_typ.setListType(MCListType.STRICT);
		p.Hdr_insp_judg_rslt_typ.setLinkBeans(p.Hdr_insp_judg_rslt_typ_nm);
		p.HdrPanel.add(p.Hdr_insp_judg_rslt_typ_Label);
		p.HdrPanel.add(p.Hdr_insp_judg_rslt_typ);
		p.Hdr_insp_judg_rslt_typ.setNextBeans(p.Hdr_insp_judg_rslt_typ_nm);
		p.Hdr_insp_judg_rslt_typ.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.insp_judg_rslt_typ_META);
		p.HdrPanel.add(p.Hdr_insp_judg_rslt_typ_nm);
		p.Hdr_insp_judg_rslt_typ_nm.setNextBeans(p.Hdr_judg_dt);
		p.Hdr_insp_judg_rslt_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.insp_judg_rslt_typ_nm_META);
		p.HdrPanel.add(p.Hdr_judg_dt_Label);
		p.HdrPanel.add(p.Hdr_judg_dt);
		p.Hdr_judg_dt.setNextBeans(p.Hdr_judg_usr_cd);
		p.Hdr_judg_dt.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.judg_dt_META);
		p.Hdr_judg_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_judg_usr_cd_Label);
		p.HdrPanel.add(p.Hdr_judg_usr_cd);
		p.Hdr_judg_usr_cd.setNextBeans(p.Hdr_judg_usr_nm);
		p.Hdr_judg_usr_cd.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.judg_usr_cd_META);
		p.HdrPanel.add(p.Hdr_judg_usr_nm);
		p.Hdr_judg_usr_nm.setNextBeans(p.Hdr_judg_dpt_cd);
		p.Hdr_judg_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.judg_usr_nm_META);
		p.Hdr_judg_dpt_cd.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_judg_dpt_cd_Label);
		p.HdrPanel.add(p.Hdr_judg_dpt_cd);
		p.Hdr_judg_dpt_cd.setNextBeans(p.Hdr_judg_dpt_nm);
		p.Hdr_judg_dpt_cd.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.judg_dpt_cd_META);
		p.HdrPanel.add(p.Hdr_judg_dpt_nm);
		p.Hdr_judg_dpt_nm.setNextBeans(p.Hdr_std_cont_fctrt_p_PPanel);
		p.Hdr_judg_dpt_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.judg_dpt_nm_META);
		p.HdrPanel.add(p.Hdr_std_cont_fctrt_p_PPanel);
		p.Hdr_std_cont_fctrt_p_PPanel.setNextBeans(p.Hdr_act_cont_fctr_p_PPanel);
		p.HdrPanel.add(p.Hdr_act_cont_fctr_p_PPanel);
		p.Hdr_act_cont_fctr_p_PPanel.setNextBeans(p.Hdr_insp_rslt_prnt_flg);
		p.HdrPanel.add(p.Hdr_insp_rslt_prnt_flg);
		p.Hdr_insp_rslt_prnt_flg.setNextBeans(p.Hdr_insp_rslt_prnt_tm);
		p.Hdr_insp_rslt_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.insp_rslt_prnt_flg_META);
		p.HdrPanel.add(p.Hdr_insp_rslt_prnt_tm_Label);
		p.HdrPanel.add(p.Hdr_insp_rslt_prnt_tm);
		p.Hdr_insp_rslt_prnt_tm.setNextBeans(p.Hdr_intr_rmrks);
		p.Hdr_insp_rslt_prnt_tm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.insp_rslt_prnt_tm_META);
		p.Hdr_insp_rslt_prnt_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.HdrPanel.add(p.Hdr_intr_rmrks_Label);
		p.HdrPanel.add(p.Hdr_intr_rmrks);
		p.Hdr_intr_rmrks.setNextBeans(p.Hdr_sub_char1);
		p.Hdr_intr_rmrks.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.intr_rmrks_META);
		p.HdrPanel.add(p.Hdr_sub_char1_Label);
		p.HdrPanel.add(p.Hdr_sub_char1);
		p.Hdr_sub_char1.setNextBeans(p.Hdr_sub_char2);
		p.Hdr_sub_char1.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.sub_char1_META);
		p.HdrPanel.add(p.Hdr_sub_char2_Label);
		p.HdrPanel.add(p.Hdr_sub_char2);
		p.Hdr_sub_char2.setNextBeans(p.Hdr_sub_char3);
		p.Hdr_sub_char2.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.sub_char2_META);
		p.HdrPanel.add(p.Hdr_sub_char3_Label);
		p.HdrPanel.add(p.Hdr_sub_char3);
		p.Hdr_sub_char3.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.sub_char3_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id);
		p.Hdr2Panel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.ins_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.ins_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.ins_func_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.ins_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.upd_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.upd_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.upd_func_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.upd_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_ts_Label);
		p.Hdr2Panel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_ts_Label);
		p.Hdr2Panel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no_Label);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0050.HdrR.upd_srv_req_no_META);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr2(MSBFP_StdInspActReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBulkSet(MSBFP_StdInspActReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.DtlPanel);
		p.BulkSetPanel.setValueCheck(false);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_cnf_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_cnf_dt);
		p.BulkSetPanel.setLastBeans(p.BulkSet_cnf_dt);
		p.BulkSet_cnf_dt.setNextBeans(p.BulkSet_usr_dpt_p_PPanel);
		p.BulkSet_cnf_dt.setRow(p.getBulkSetR(), mcframe.clientMSBF.MSBFP0050.BulkSetR.cnf_dt_META);
		p.BulkSet_cnf_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_usr_dpt_p_PPanel);
		p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.BulkSet_cnf_dpt_nm);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBFP_StdInspActReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBFP_StdInspActReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
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
		p.Btn_deselect_all.setNextBeans(p.Btn_prnt_flg);
		p.BtnPanel.add(p.Btn_prnt_flg);
		p.Btn_prnt_flg.setNextBeans(p.Btn_upd);
		p.Btn_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBF.MSBFP0050.BtnR.prnt_flg_META);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_upd.setNextBeans(p.Btn_upd_cnf);
		p.Btn_upd_cnf.setIcon("REGISTER");
		p.Btn_upd_cnf.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_cnf);
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
		p.Btn_del.setNextBeans(p.Btn_del_cnf);
		p.Btn_del_cnf.setIcon("CANCEL");
		p.Btn_del_cnf.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_del_cnf);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBFP_StdInspActReg p) {
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
		MSBFP_StdInspActReg_MC.mcInitScreenOpe((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.mcInitCnd((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.mcInitHdrTab((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.mcInitHdr((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.mcInitHdr2((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.mcInitBulkSet((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.mcInitDtl((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.mcInitBtn((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.mcInitEastBtn((MSBFP_StdInspActReg)this);

		// [SRCH]ステータスのモードの設定
		MSBFP_StdInspActReg_MC.statusInitSRCH_ScreenOpe((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitSRCH_Cnd((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitSRCH_HdrTab((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitSRCH_Hdr((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitSRCH_Hdr2((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitSRCH_BulkSet((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitSRCH_Dtl((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitSRCH_Btn((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitSRCH_EastBtn((MSBFP_StdInspActReg)this);

		// [INS]ステータスのモードの設定
		MSBFP_StdInspActReg_MC.statusInitINS_ScreenOpe((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitINS_Cnd((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitINS_HdrTab((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitINS_Hdr((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitINS_Hdr2((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitINS_BulkSet((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitINS_Dtl((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitINS_Btn((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitINS_EastBtn((MSBFP_StdInspActReg)this);

		// [FIX_I]ステータスのモードの設定
		MSBFP_StdInspActReg_MC.statusInitFIX__I_ScreenOpe((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitFIX__I_Cnd((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitFIX__I_HdrTab((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitFIX__I_Hdr((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitFIX__I_Hdr2((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitFIX__I_BulkSet((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitFIX__I_Dtl((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitFIX__I_Btn((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitFIX__I_EastBtn((MSBFP_StdInspActReg)this);

		// [UPD]ステータスのモードの設定
		MSBFP_StdInspActReg_MC.statusInitUPD_ScreenOpe((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitUPD_Cnd((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitUPD_HdrTab((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitUPD_Hdr((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitUPD_Hdr2((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitUPD_BulkSet((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitUPD_Dtl((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitUPD_Btn((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitUPD_EastBtn((MSBFP_StdInspActReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBFP_StdInspActReg_MC.statusInitFIX__U_ScreenOpe((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitFIX__U_Cnd((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitFIX__U_HdrTab((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitFIX__U_Hdr((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitFIX__U_Hdr2((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitFIX__U_BulkSet((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitFIX__U_Dtl((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitFIX__U_Btn((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitFIX__U_EastBtn((MSBFP_StdInspActReg)this);

		// [DEL]ステータスのモードの設定
		MSBFP_StdInspActReg_MC.statusInitDEL_ScreenOpe((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitDEL_Cnd((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitDEL_HdrTab((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitDEL_Hdr((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitDEL_Hdr2((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitDEL_BulkSet((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitDEL_Dtl((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitDEL_Btn((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitDEL_EastBtn((MSBFP_StdInspActReg)this);

		// [DEL_CNF]ステータスのモードの設定
		MSBFP_StdInspActReg_MC.statusInitDEL__CNF_ScreenOpe((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitDEL__CNF_Cnd((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitDEL__CNF_HdrTab((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitDEL__CNF_Hdr((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitDEL__CNF_Hdr2((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitDEL__CNF_BulkSet((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitDEL__CNF_Dtl((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitDEL__CNF_Btn((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitDEL__CNF_EastBtn((MSBFP_StdInspActReg)this);

		// [FIX_D]ステータスのモードの設定
		MSBFP_StdInspActReg_MC.statusInitFIX__D_ScreenOpe((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitFIX__D_Cnd((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitFIX__D_HdrTab((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitFIX__D_Hdr((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitFIX__D_Hdr2((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitFIX__D_BulkSet((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitFIX__D_Dtl((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitFIX__D_Btn((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitFIX__D_EastBtn((MSBFP_StdInspActReg)this);

		// [REF]ステータスのモードの設定
		MSBFP_StdInspActReg_MC.statusInitREF_ScreenOpe((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitREF_Cnd((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitREF_HdrTab((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitREF_Hdr((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitREF_Hdr2((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitREF_BulkSet((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitREF_Dtl((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitREF_Btn((MSBFP_StdInspActReg)this);
		MSBFP_StdInspActReg_MC.statusInitREF_EastBtn((MSBFP_StdInspActReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBFP_StdInspActReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBFP_StdInspActReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_DEL_CNF.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_insp_no.setListListener(p);
		p.Cnd_insp_no.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBFP_StdInspActReg p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBFP_StdInspActReg p) {
		p.Hdr_insp_no.setListListener(p);
		p.Hdr_insp_no.addAllListener(p);
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
		p.Hdr_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_lot_no.setListListener(p);
		p.Hdr_lot_no.addAllListener(p);
		p.Hdr_sublot_no.setListListener(p);
		p.Hdr_sublot_no.addAllListener(p);
		p.Hdr_vld_dt.setListListener(p);
		p.Hdr_vld_dt.addAllListener(p);
		p.Hdr_lmt_dt.setListListener(p);
		p.Hdr_lmt_dt.addAllListener(p);
		p.Hdr_mfg_loc_cd.setListListener(p);
		p.Hdr_mfg_loc_cd.addAllListener(p);
		p.Hdr_mfg_loc_nm.setListListener(p);
		p.Hdr_mfg_loc_nm.addAllListener(p);
		p.Hdr_sppl_cd.setListListener(p);
		p.Hdr_sppl_cd.addAllListener(p);
		p.Hdr_sppl_nm.setListListener(p);
		p.Hdr_sppl_nm.addAllListener(p);
		p.Hdr_to_site_cd.setListListener(p);
		p.Hdr_to_site_cd.addAllListener(p);
		p.Hdr_to_site_nm.setListListener(p);
		p.Hdr_to_site_nm.addAllListener(p);
		p.Hdr_bp_lot_no.setListListener(p);
		p.Hdr_bp_lot_no.addAllListener(p);
		p.Hdr_insp_std_no.setListListener(p);
		p.Hdr_insp_std_no.addAllListener(p);
		p.Hdr_std_req_flg.addAllListener(p);
		p.Hdr_std_cnf_req_flg.addAllListener(p);
		p.Hdr_insp_judg_rslt_typ.setListListener(p);
		p.Hdr_insp_judg_rslt_typ.addAllListener(p);
		p.Hdr_insp_judg_rslt_typ_nm.setListListener(p);
		p.Hdr_insp_judg_rslt_typ_nm.addAllListener(p);
		p.Hdr_judg_dt.setListListener(p);
		p.Hdr_judg_dt.addAllListener(p);
		p.Hdr_judg_usr_cd.setListListener(p);
		p.Hdr_judg_usr_cd.addAllListener(p);
		p.Hdr_judg_usr_nm.setListListener(p);
		p.Hdr_judg_usr_nm.addAllListener(p);
		p.Hdr_judg_dpt_cd.setListListener(p);
		p.Hdr_judg_dpt_cd.addAllListener(p);
		p.Hdr_judg_dpt_nm.setListListener(p);
		p.Hdr_judg_dpt_nm.addAllListener(p);
		p.Hdr_insp_rslt_prnt_flg.addAllListener(p);
		p.Hdr_insp_rslt_prnt_tm.setListListener(p);
		p.Hdr_insp_rslt_prnt_tm.addAllListener(p);
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
	}

	/**
	 *  [Hdr2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr2(MSBFP_StdInspActReg p) {
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MSBFP_StdInspActReg p) {
		p.BulkSet_cnf_dt.setListListener(p);
		p.BulkSet_cnf_dt.addAllListener(p);
		p.BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBFP_StdInspActReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_insp_seq.addAllListener(p);
		p.columnDtl_insp_seq.setListListener(p);
		p.columnDtl_insp_point_cd.addAllListener(p);
		p.columnDtl_insp_point_cd.setListListener(p);
		p.columnDtl_insp_point_nm.addAllListener(p);
		p.columnDtl_insp_point_nm.setListListener(p);
		p.columnDtl_insp_qlqn_typ.addAllListener(p);
		p.columnDtl_insp_qlqn_typ.setListListener(p);
		p.columnDtl_insp_qlqn_typ_nm.addAllListener(p);
		p.columnDtl_insp_qlqn_typ_nm.setListListener(p);
		p.columnDtl_ql_std_val.addAllListener(p);
		p.columnDtl_ql_std_val.setListListener(p);
		p.columnDtl_ql_insp_val.addAllListener(p);
		p.columnDtl_ql_insp_val.setListListener(p);
		p.columnDtl_trd_unit_cd.addAllListener(p);
		p.columnDtl_trd_unit_cd.setListListener(p);
		p.columnDtl_trd_unit_nm.addAllListener(p);
		p.columnDtl_trd_unit_nm.setListListener(p);
		p.columnDtl_sign_out_min_typ.addAllListener(p);
		p.columnDtl_sign_out_min_typ.setListListener(p);
		p.columnDtl_sign_out_min_typ_nm.addAllListener(p);
		p.columnDtl_sign_out_min_typ_nm.setListListener(p);
		p.columnDtl_sign_in_min_typ.addAllListener(p);
		p.columnDtl_sign_in_min_typ.setListListener(p);
		p.columnDtl_sign_in_min_typ_nm.addAllListener(p);
		p.columnDtl_sign_in_min_typ_nm.setListListener(p);
		p.columnDtl_sign_in_max_typ.addAllListener(p);
		p.columnDtl_sign_in_max_typ.setListListener(p);
		p.columnDtl_sign_in_max_typ_nm.addAllListener(p);
		p.columnDtl_sign_in_max_typ_nm.setListListener(p);
		p.columnDtl_sign_out_max_typ.addAllListener(p);
		p.columnDtl_sign_out_max_typ.setListListener(p);
		p.columnDtl_sign_out_max_typ_nm.addAllListener(p);
		p.columnDtl_sign_out_max_typ_nm.setListListener(p);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_std_insp_rslt_typ.addAllListener(p);
		p.columnDtl_std_insp_rslt_typ.setListListener(p);
		p.columnDtl_std_insp_rslt_typ_nm.addAllListener(p);
		p.columnDtl_std_insp_rslt_typ_nm.setListListener(p);
		p.columnDtl_act_intr_rmrks.addAllListener(p);
		p.columnDtl_act_intr_rmrks.setListListener(p);
		p.columnDtl_sub_char1.addAllListener(p);
		p.columnDtl_sub_char1.setListListener(p);
		p.columnDtl_sub_char2.addAllListener(p);
		p.columnDtl_sub_char2.setListListener(p);
		p.columnDtl_sub_char3.addAllListener(p);
		p.columnDtl_sub_char3.setListListener(p);
		p.columnDtl_cnf_flg.addAllListener(p);
		p.columnDtl_cnf_dt.addAllListener(p);
		p.columnDtl_cnf_dt.setListListener(p);
		p.Dtl_cnf_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_cnf_intr_rmrks.addAllListener(p);
		p.columnDtl_cnf_intr_rmrks.setListListener(p);
		p.columnDtl_intr_rmrks.addAllListener(p);
		p.columnDtl_intr_rmrks.setListListener(p);
		p.columnDtl_inst_sub_char1.addAllListener(p);
		p.columnDtl_inst_sub_char1.setListListener(p);
		p.columnDtl_inst_sub_char2.addAllListener(p);
		p.columnDtl_inst_sub_char2.setListListener(p);
		p.columnDtl_inst_sub_char3.addAllListener(p);
		p.columnDtl_inst_sub_char3.setListListener(p);
		p.columnDtl_std_insp_inst_no.addAllListener(p);
		p.columnDtl_std_insp_inst_no.setListListener(p);
		p.columnDtl_std_insp_act_no.addAllListener(p);
		p.columnDtl_std_insp_act_no.setListListener(p);
		p.columnDtl_ins_usr_id.addAllListener(p);
		p.columnDtl_ins_usr_id.setListListener(p);
		p.columnDtl_ins_usr_nm.addAllListener(p);
		p.columnDtl_ins_usr_nm.setListListener(p);
		p.columnDtl_ins_func_id.addAllListener(p);
		p.columnDtl_ins_func_id.setListListener(p);
		p.columnDtl_ins_func_nm.addAllListener(p);
		p.columnDtl_ins_func_nm.setListListener(p);
		p.columnDtl_ins_ts.addAllListener(p);
		p.columnDtl_ins_ts.setListListener(p);
		p.columnDtl_upd_usr_id.addAllListener(p);
		p.columnDtl_upd_usr_id.setListListener(p);
		p.columnDtl_upd_usr_nm.addAllListener(p);
		p.columnDtl_upd_usr_nm.setListListener(p);
		p.columnDtl_upd_func_id.addAllListener(p);
		p.columnDtl_upd_func_id.setListListener(p);
		p.columnDtl_upd_func_nm.addAllListener(p);
		p.columnDtl_upd_func_nm.setListListener(p);
		p.columnDtl_upd_ts.addAllListener(p);
		p.columnDtl_upd_ts.setListListener(p);
		p.columnDtl_upd_srv_req_no.addAllListener(p);
		p.columnDtl_upd_srv_req_no.setListListener(p);
		p.columnDtl_qn_int_digit.addAllListener(p);
		p.columnDtl_qn_int_digit.setListListener(p);
		p.columnDtl_qn_int_frac.addAllListener(p);
		p.columnDtl_qn_int_frac.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBFP_StdInspActReg p) {
		p.Btn_prnt.addAllListener(p);
		p.Btn_prnt.setAPMethodName("doBtn_prnt");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_prnt_flg.addAllListener(p);
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_upd_cnf.addAllListener(p);
		p.Btn_upd_cnf.setAPMethodName("doBtn_upd_cnf");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
		p.Btn_del_cnf.addAllListener(p);
		p.Btn_del_cnf.setAPMethodName("doBtn_del_cnf");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBFP_StdInspActReg p) {
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBFP_StdInspActReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBFP_StdInspActReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_insp_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBFP_StdInspActReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBFP_StdInspActReg p){
		p.Hdr_insp_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Hdr_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_vld_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_lmt_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_to_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_to_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_std_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_judg_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_judg_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_judg_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_judg_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_judg_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_std_cont_fctrt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_act_cont_fctr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.READ_ONLY);
		p.Hdr_insp_rslt_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_tm.putMode(p, SRCH, MCMode.READ_ONLY);
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

	}

	/**
	 * [SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr2(MSBFP_StdInspActReg p){

	}

	/**
	 * [SRCH]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BulkSet(MSBFP_StdInspActReg p){
		p.BulkSet_cnf_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBFP_StdInspActReg p){
		p.columnDtl_insp_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_insp_point_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_insp_point_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_insp_qlqn_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_insp_qlqn_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ql_std_val.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ql_insp_val.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_qn_out_min_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_out_min_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sign_out_min_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_qn_in_min_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_in_min_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sign_in_min_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_qn_insp_val_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_in_max_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sign_in_max_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_qn_in_max_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_out_max_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sign_out_max_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_qn_out_max_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_std_insp_rslt_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_std_insp_rslt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_act_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cnf_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cnf_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_cnf_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_cnf_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_std_insp_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_std_insp_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_qn_int_digit.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_qn_int_frac.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBFP_StdInspActReg p){
		p.Btn_prnt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_cnf.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del_cnf.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBFP_StdInspActReg p){

	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBFP_StdInspActReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBFP_StdInspActReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_insp_no.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [INS]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_HdrTab(MSBFP_StdInspActReg p){

	}

	/**
	 * [INS]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr(MSBFP_StdInspActReg p){
		p.Hdr_insp_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Hdr_lot_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sublot_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_vld_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_lmt_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_to_site_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_to_site_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_std_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_judg_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_judg_usr_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_judg_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_judg_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_judg_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_std_cont_fctrt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_act_cont_fctr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.ENABLE);
		p.Hdr_insp_rslt_prnt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_tm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, INS, MCMode.READ_ONLY);
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

	}

	/**
	 * [INS]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr2(MSBFP_StdInspActReg p){

	}

	/**
	 * [INS]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitINS_BulkSet(MSBFP_StdInspActReg p){
		p.BulkSet_cnf_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl(MSBFP_StdInspActReg p){
		p.columnDtl_insp_seq.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_insp_point_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_insp_point_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_insp_qlqn_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_insp_qlqn_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ql_std_val.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ql_insp_val.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_trd_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_qn_out_min_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_out_min_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sign_out_min_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_qn_in_min_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_in_min_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sign_in_min_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_qn_insp_val_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.ENABLE);
		p.columnDtl_sign_in_max_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sign_in_max_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_qn_in_max_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_out_max_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sign_out_max_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_qn_out_max_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.ENABLE);
		p.Dtl_end_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.ENABLE);
		p.Dtl_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.ENABLE);
		p.columnDtl_std_insp_rslt_typ.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_std_insp_rslt_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_act_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_cnf_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_cnf_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_cnf_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_cnf_intr_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char1.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char2.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char3.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_std_insp_inst_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_std_insp_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_qn_int_digit.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_qn_int_frac.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBFP_StdInspActReg p){
		p.Btn_prnt.putMode(p, INS, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, INS, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, INS, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd_cnf.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);
		p.Btn_del_cnf.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBFP_StdInspActReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBFP_StdInspActReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBFP_StdInspActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_insp_no.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, FIX_I, MCMode.ENABLE);

	}

	/**
	 * [FIX_I]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_HdrTab(MSBFP_StdInspActReg p){

	}

	/**
	 * [FIX_I]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr(MSBFP_StdInspActReg p){
		p.Hdr_insp_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Hdr_lot_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sublot_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_vld_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_lmt_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_to_site_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_to_site_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_std_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_judg_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_judg_usr_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_judg_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_judg_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_judg_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_std_cont_fctrt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_act_cont_fctr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.READ_ONLY);
		p.Hdr_insp_rslt_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_tm.putMode(p, FIX_I, MCMode.READ_ONLY);
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

	}

	/**
	 * [FIX_I]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr2(MSBFP_StdInspActReg p){

	}

	/**
	 * [FIX_I]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_BulkSet(MSBFP_StdInspActReg p){
		p.BulkSet_cnf_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl(MSBFP_StdInspActReg p){
		p.columnDtl_insp_seq.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_insp_point_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_insp_point_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_insp_qlqn_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_insp_qlqn_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ql_std_val.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ql_insp_val.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_qn_out_min_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_out_min_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sign_out_min_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_qn_in_min_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_in_min_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sign_in_min_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_qn_insp_val_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_in_max_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sign_in_max_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_qn_in_max_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_out_max_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sign_out_max_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_qn_out_max_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_std_insp_rslt_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_std_insp_rslt_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_act_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cnf_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cnf_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_cnf_usr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_cnf_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_std_insp_inst_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_std_insp_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_qn_int_digit.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_qn_int_frac.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBFP_StdInspActReg p){
		p.Btn_prnt.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Btn_upd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd_cnf.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_del_cnf.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MSBFP_StdInspActReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBFP_StdInspActReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBFP_StdInspActReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_insp_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrTab(MSBFP_StdInspActReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MSBFP_StdInspActReg p){
		p.Hdr_insp_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Hdr_lot_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sublot_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_vld_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_lmt_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_to_site_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_to_site_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_std_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_judg_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_judg_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_judg_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_judg_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_judg_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_std_cont_fctrt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_act_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.READ_ONLY);
		p.Hdr_insp_rslt_prnt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_tm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, UPD, MCMode.READ_ONLY);
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

	}

	/**
	 * [UPD]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr2(MSBFP_StdInspActReg p){

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MSBFP_StdInspActReg p){
		p.BulkSet_cnf_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBFP_StdInspActReg p){
		p.columnDtl_insp_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_insp_point_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_insp_point_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_insp_qlqn_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_insp_qlqn_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ql_std_val.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ql_insp_val.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_qn_out_min_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_out_min_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sign_out_min_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_qn_in_min_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_in_min_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sign_in_min_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_qn_insp_val_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_in_max_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sign_in_max_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_qn_in_max_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_out_max_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sign_out_max_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_qn_out_max_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_std_insp_rslt_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_std_insp_rslt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_act_intr_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cnf_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_cnf_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_cnf_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.REQUIRED);
		p.columnDtl_cnf_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_intr_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_std_insp_inst_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_std_insp_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_qn_int_digit.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_qn_int_frac.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBFP_StdInspActReg p){
		p.Btn_prnt.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_prnt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Btn_upd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd_cnf.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_del_cnf.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBFP_StdInspActReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBFP_StdInspActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBFP_StdInspActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_insp_no.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrTab(MSBFP_StdInspActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MSBFP_StdInspActReg p){
		p.Hdr_insp_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Hdr_lot_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sublot_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_vld_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_lmt_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_to_site_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_to_site_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_std_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_judg_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_judg_usr_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_judg_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_judg_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_judg_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_std_cont_fctrt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_act_cont_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.READ_ONLY);
		p.Hdr_insp_rslt_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_tm.putMode(p, FIX_U, MCMode.READ_ONLY);
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

	}

	/**
	 * [FIX_U]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr2(MSBFP_StdInspActReg p){

	}

	/**
	 * [FIX_U]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_BulkSet(MSBFP_StdInspActReg p){
		p.BulkSet_cnf_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MSBFP_StdInspActReg p){
		p.columnDtl_insp_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_insp_point_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_insp_point_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_insp_qlqn_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_insp_qlqn_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ql_std_val.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ql_insp_val.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_qn_out_min_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_out_min_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sign_out_min_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_qn_in_min_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_in_min_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sign_in_min_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_qn_insp_val_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_in_max_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sign_in_max_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_qn_in_max_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_out_max_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sign_out_max_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_qn_out_max_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_std_insp_rslt_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_std_insp_rslt_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_act_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cnf_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cnf_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_cnf_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_cnf_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_std_insp_inst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_std_insp_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_qn_int_digit.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_qn_int_frac.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBFP_StdInspActReg p){
		p.Btn_prnt.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Btn_upd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_upd_cnf.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_del_cnf.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBFP_StdInspActReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBFP_StdInspActReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBFP_StdInspActReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_insp_no.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HdrTab(MSBFP_StdInspActReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MSBFP_StdInspActReg p){
		p.Hdr_insp_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Hdr_lot_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sublot_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_vld_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_lmt_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_to_site_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_to_site_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_std_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_judg_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_judg_usr_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_judg_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_judg_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_judg_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_std_cont_fctrt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_act_cont_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.READ_ONLY);
		p.Hdr_insp_rslt_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_tm.putMode(p, DEL, MCMode.READ_ONLY);
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

	}

	/**
	 * [DEL]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr2(MSBFP_StdInspActReg p){

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MSBFP_StdInspActReg p){
		p.BulkSet_cnf_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MSBFP_StdInspActReg p){
		p.columnDtl_insp_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_insp_point_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_insp_point_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_insp_qlqn_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_insp_qlqn_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ql_std_val.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ql_insp_val.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_qn_out_min_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_out_min_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sign_out_min_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_qn_in_min_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_in_min_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sign_in_min_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_qn_insp_val_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_in_max_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sign_in_max_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_qn_in_max_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_out_max_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sign_out_max_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_qn_out_max_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_std_insp_rslt_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_std_insp_rslt_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_act_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cnf_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cnf_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_cnf_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_cnf_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_std_insp_inst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_std_insp_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_qn_int_digit.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_qn_int_frac.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBFP_StdInspActReg p){
		p.Btn_prnt.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd_cnf.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_del_cnf.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBFP_StdInspActReg p){

	}

	/**
	 * [DEL_CNF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__CNF_ScreenOpe(MSBFP_StdInspActReg p){

	}

	/**
	 * [DEL_CNF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__CNF_Cnd(MSBFP_StdInspActReg p){
		p.Cnd_ope_Group.putMode(p, DEL_CNF, MCMode.REQUIRED);
		p.Cnd_insp_no.putMode(p, DEL_CNF, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, DEL_CNF, MCMode.ENABLE);

	}

	/**
	 * [DEL_CNF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL__CNF_HdrTab(MSBFP_StdInspActReg p){

	}

	/**
	 * [DEL_CNF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL__CNF_Hdr(MSBFP_StdInspActReg p){
		p.Hdr_insp_no.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(DEL_CNF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no_p_PPanel.putStatus(DEL_CNF, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Hdr_lot_no.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_sublot_no.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_vld_dt.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_lmt_dt.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_cd.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_to_site_cd.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_to_site_nm.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_insp_std_no.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ_nm.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_judg_dt.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_judg_usr_cd.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_judg_usr_nm.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_judg_dpt_cd.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_judg_dpt_nm.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_std_cont_fctrt_p_PPanel.putStatus(DEL_CNF, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_act_cont_fctr_p_PPanel.putStatus(DEL_CNF, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.READ_ONLY);
		p.Hdr_insp_rslt_prnt_flg.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_tm.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, DEL_CNF, MCMode.READ_ONLY);

	}

	/**
	 * [DEL_CNF]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__CNF_Hdr2(MSBFP_StdInspActReg p){

	}

	/**
	 * [DEL_CNF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL__CNF_BulkSet(MSBFP_StdInspActReg p){
		p.BulkSet_cnf_dt.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(DEL_CNF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [DEL_CNF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__CNF_Dtl(MSBFP_StdInspActReg p){
		p.columnDtl_insp_seq.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_insp_point_cd.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_insp_point_nm.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_insp_qlqn_typ.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_insp_qlqn_typ_nm.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_ql_std_val.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_ql_insp_val.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Dtl_qn_out_min_p_PPanel.putStatus(DEL_CNF, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_out_min_typ.putMode(p, DEL_CNF, MCMode.INVISIBLE);
		p.columnDtl_sign_out_min_typ_nm.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Dtl_qn_in_min_p_PPanel.putStatus(DEL_CNF, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_in_min_typ.putMode(p, DEL_CNF, MCMode.INVISIBLE);
		p.columnDtl_sign_in_min_typ_nm.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Dtl_qn_insp_val_p_PPanel.putStatus(DEL_CNF, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_in_max_typ.putMode(p, DEL_CNF, MCMode.INVISIBLE);
		p.columnDtl_sign_in_max_typ_nm.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Dtl_qn_in_max_p_PPanel.putStatus(DEL_CNF, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_out_max_typ.putMode(p, DEL_CNF, MCMode.INVISIBLE);
		p.columnDtl_sign_out_max_typ_nm.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Dtl_qn_out_max_p_PPanel.putStatus(DEL_CNF, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(DEL_CNF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(DEL_CNF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(DEL_CNF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_std_insp_rslt_typ.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_std_insp_rslt_typ_nm.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_act_intr_rmrks.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_cnf_flg.putMode(p, DEL_CNF, MCMode.REQUIRED);
		p.columnDtl_cnf_dt.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Dtl_cnf_usr_dpt_p_PPanel.putStatus(DEL_CNF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_cnf_intr_rmrks.putMode(p, DEL_CNF, MCMode.ENABLE);
		p.columnDtl_intr_rmrks.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char1.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char2.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char3.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_std_insp_inst_no.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_std_insp_act_no.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.columnDtl_qn_int_digit.putMode(p, DEL_CNF, MCMode.INVISIBLE);
		p.columnDtl_qn_int_frac.putMode(p, DEL_CNF, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_CNF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__CNF_Btn(MSBFP_StdInspActReg p){
		p.Btn_prnt.putMode(p, DEL_CNF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL_CNF, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL_CNF, MCMode.ENABLE);
		p.Btn_prnt_flg.putMode(p, DEL_CNF, MCMode.READ_ONLY);
		p.Btn_upd.putMode(p, DEL_CNF, MCMode.INVISIBLE);
		p.Btn_upd_cnf.putMode(p, DEL_CNF, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL_CNF, MCMode.INVISIBLE);
		p.Btn_del_cnf.putMode(p, DEL_CNF, MCMode.ENABLE);

	}

	/**
	 * [DEL_CNF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__CNF_EastBtn(MSBFP_StdInspActReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MSBFP_StdInspActReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBFP_StdInspActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_insp_no.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_HdrTab(MSBFP_StdInspActReg p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MSBFP_StdInspActReg p){
		p.Hdr_insp_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Hdr_lot_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sublot_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_vld_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_lmt_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_to_site_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_to_site_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_std_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_judg_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_judg_usr_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_judg_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_judg_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_judg_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_std_cont_fctrt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_act_cont_fctr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.READ_ONLY);
		p.Hdr_insp_rslt_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_tm.putMode(p, FIX_D, MCMode.READ_ONLY);
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

	}

	/**
	 * [FIX_D]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr2(MSBFP_StdInspActReg p){

	}

	/**
	 * [FIX_D]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_BulkSet(MSBFP_StdInspActReg p){
		p.BulkSet_cnf_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl(MSBFP_StdInspActReg p){
		p.columnDtl_insp_seq.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_insp_point_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_insp_point_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_insp_qlqn_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_insp_qlqn_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ql_std_val.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ql_insp_val.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_qn_out_min_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_out_min_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sign_out_min_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_qn_in_min_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_in_min_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sign_in_min_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_qn_insp_val_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_in_max_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sign_in_max_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_qn_in_max_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_out_max_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sign_out_max_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_qn_out_max_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_std_insp_rslt_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_std_insp_rslt_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_act_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cnf_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cnf_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_cnf_usr_dpt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_cnf_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_std_insp_inst_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_std_insp_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_qn_int_digit.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_qn_int_frac.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBFP_StdInspActReg p){
		p.Btn_prnt.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Btn_upd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_upd_cnf.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del_cnf.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBFP_StdInspActReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBFP_StdInspActReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBFP_StdInspActReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_insp_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBFP_StdInspActReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBFP_StdInspActReg p){
		p.Hdr_insp_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Hdr_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_vld_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_lmt_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_to_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_to_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_std_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_judg_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_judg_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_judg_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_judg_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_judg_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_std_cont_fctrt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_act_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.READ_ONLY);
		p.Hdr_insp_rslt_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_tm.putMode(p, REF, MCMode.READ_ONLY);
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

	}

	/**
	 * [REF]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr2(MSBFP_StdInspActReg p){

	}

	/**
	 * [REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_BulkSet(MSBFP_StdInspActReg p){
		p.BulkSet_cnf_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MSBFP_StdInspActReg p){
		p.columnDtl_insp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_insp_point_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_insp_point_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_insp_qlqn_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_insp_qlqn_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ql_std_val.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ql_insp_val.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_qn_out_min_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_out_min_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sign_out_min_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_qn_in_min_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_in_min_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sign_in_min_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_qn_insp_val_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_in_max_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sign_in_max_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_qn_in_max_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnDtl_sign_out_max_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sign_out_max_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_qn_out_max_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_std_insp_rslt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_std_insp_rslt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_act_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cnf_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cnf_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_cnf_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl_cnf_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_inst_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_std_insp_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_std_insp_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_qn_int_digit.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_qn_int_frac.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBFP_StdInspActReg p){
		p.Btn_prnt.putMode(p, REF, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_cnf.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del_cnf.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBFP_StdInspActReg p){

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
		MSBFP_StdInspActReg_MC.setTableConfigDtl((MSBFP_StdInspActReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBFP_StdInspActReg p) {
		p.columnDtl_insp_seq.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.insp_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_insp_seq);
		p.columnDtl_insp_point_cd.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.insp_point_cd_META);
		p.columnDtl_insp_point_cd.addLinkBeans(p.columnDtl_insp_point_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_insp_point_cd);
		p.columnDtl_insp_point_nm.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.insp_point_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_insp_point_nm);
		p.columnDtl_insp_qlqn_typ.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.insp_qlqn_typ_META);
		p.columnDtl_insp_qlqn_typ.addLinkBeans(p.columnDtl_insp_qlqn_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_insp_qlqn_typ);
		p.columnDtl_insp_qlqn_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.insp_qlqn_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_insp_qlqn_typ_nm);
		p.columnDtl_ql_std_val.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.ql_std_val_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ql_std_val);
		p.columnDtl_ql_insp_val.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.ql_insp_val_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ql_insp_val);
		p.columnDtl_trd_unit_cd.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.trd_unit_cd_META);
		p.columnDtl_trd_unit_cd.addLinkBeans(p.columnDtl_trd_unit_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_cd);
		p.columnDtl_trd_unit_nm.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.trd_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_nm);
		p.DtlTable.addTable(p.Dtl_qn_out_min_p_PPanel.QnInspValTable);
		p.columnDtl_sign_out_min_typ.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.sign_out_min_typ_META);
		p.columnDtl_sign_out_min_typ.addLinkBeans(p.columnDtl_sign_out_min_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sign_out_min_typ);
		p.columnDtl_sign_out_min_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.sign_out_min_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sign_out_min_typ_nm);
		p.DtlTable.addTable(p.Dtl_qn_in_min_p_PPanel.QnInspValTable);
		p.columnDtl_sign_in_min_typ.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.sign_in_min_typ_META);
		p.columnDtl_sign_in_min_typ.addLinkBeans(p.columnDtl_sign_in_min_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sign_in_min_typ);
		p.columnDtl_sign_in_min_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.sign_in_min_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sign_in_min_typ_nm);
		p.DtlTable.addTable(p.Dtl_qn_insp_val_p_PPanel.QnInspValTable);
		p.Dtl_qn_insp_val_p_PPanel.columnQnInspVal_qn_insp_val.setMinusEnable(true);
		p.columnDtl_sign_in_max_typ.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.sign_in_max_typ_META);
		p.columnDtl_sign_in_max_typ.addLinkBeans(p.columnDtl_sign_in_max_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sign_in_max_typ);
		p.columnDtl_sign_in_max_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.sign_in_max_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sign_in_max_typ_nm);
		p.DtlTable.addTable(p.Dtl_qn_in_max_p_PPanel.QnInspValTable);
		p.columnDtl_sign_out_max_typ.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.sign_out_max_typ_META);
		p.columnDtl_sign_out_max_typ.addLinkBeans(p.columnDtl_sign_out_max_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sign_out_max_typ);
		p.columnDtl_sign_out_max_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.sign_out_max_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sign_out_max_typ_nm);
		p.DtlTable.addTable(p.Dtl_qn_out_max_p_PPanel.QnInspValTable);
		p.DtlTable.addTable(p.Dtl_st_tm_p_PPanel.YmdHmTable);
		p.DtlTable.addTable(p.Dtl_end_tm_p_PPanel.YmdHmTable);
		p.DtlTable.addTable(p.Dtl_usr_dpt_p_PPanel.UsrDptTable);
		p.Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setLinkBeans(p.columnDtl_dpt_nm);
		p.columnDtl_std_insp_rslt_typ.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.std_insp_rslt_typ_META);
		p.columnDtl_std_insp_rslt_typ.addLinkBeans(p.columnDtl_std_insp_rslt_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_std_insp_rslt_typ);
		p.columnDtl_std_insp_rslt_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.std_insp_rslt_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_std_insp_rslt_typ_nm);
		p.columnDtl_act_intr_rmrks.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.act_intr_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_act_intr_rmrks);
		p.columnDtl_sub_char1.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char1);
		p.columnDtl_sub_char2.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char2);
		p.columnDtl_sub_char3.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char3);
		p.columnDtl_cnf_flg.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.cnf_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cnf_flg);
		p.columnDtl_cnf_dt.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.cnf_dt_META);
		p.columnDtl_cnf_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_cnf_dt);
		p.DtlTable.addTable(p.Dtl_cnf_usr_dpt_p_PPanel.UsrDptTable);
		p.Dtl_cnf_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setLinkBeans(p.columnDtl_cnf_dpt_nm);
		p.columnDtl_cnf_intr_rmrks.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.cnf_intr_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cnf_intr_rmrks);
		p.columnDtl_intr_rmrks.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.intr_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_intr_rmrks);
		p.columnDtl_inst_sub_char1.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.inst_sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inst_sub_char1);
		p.columnDtl_inst_sub_char2.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.inst_sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inst_sub_char2);
		p.columnDtl_inst_sub_char3.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.inst_sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inst_sub_char3);
		p.columnDtl_std_insp_inst_no.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.std_insp_inst_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_std_insp_inst_no);
		p.columnDtl_std_insp_act_no.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.std_insp_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_std_insp_act_no);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_qn_int_digit.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.qn_int_digit_META);
		p.DtlTable.addColumnConfig(p.columnDtl_qn_int_digit);
		p.columnDtl_qn_int_frac.setMeta(mcframe.clientMSBF.MSBFP0050.DtlR.qn_int_frac_META);
		p.DtlTable.addColumnConfig(p.columnDtl_qn_int_frac);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Hdr_insp_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_insp_sts_typ.getListConfig().setPutter(getHdr_insp_sts_typ_ListPutter());
		Hdr_insp_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_insp_typ.getListConfig().setPutter(getHdr_insp_typ_ListPutter());
		Hdr_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_sublot_no.getListConfig().setPutter(getHdr_sublot_no_ListPutter());
		Hdr_mfg_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_mfg_loc_cd.getListConfig().setPutter(getHdr_mfg_loc_cd_ListPutter());
		Hdr_to_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_to_site_cd.getListConfig().setPutter(getHdr_to_site_cd_ListPutter());
		Hdr_insp_judg_rslt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_insp_judg_rslt_typ.getListConfig().setPutter(getHdr_insp_judg_rslt_typ_ListPutter());
		Hdr_judg_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_judg_dpt_cd.getListConfig().setPutter(getHdr_judg_dpt_cd_ListPutter());
		BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		columnDtl_insp_point_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_insp_point_cd.getListConfig().setPutter(getDtl_insp_point_cd_ListPutter());
		columnDtl_insp_qlqn_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_insp_qlqn_typ.getListConfig().setPutter(getDtl_insp_qlqn_typ_ListPutter());
		columnDtl_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_trd_unit_cd.getListConfig().setPutter(getDtl_trd_unit_cd_ListPutter());
		columnDtl_sign_out_min_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sign_out_min_typ.getListConfig().setPutter(getDtl_sign_out_min_typ_ListPutter());
		columnDtl_sign_in_min_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sign_in_min_typ.getListConfig().setPutter(getDtl_sign_in_min_typ_ListPutter());
		columnDtl_sign_in_max_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sign_in_max_typ.getListConfig().setPutter(getDtl_sign_in_max_typ_ListPutter());
		columnDtl_sign_out_max_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sign_out_max_typ.getListConfig().setPutter(getDtl_sign_out_max_typ_ListPutter());
		Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.getListConfig().setPutter(getDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter());
		columnDtl_std_insp_rslt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_std_insp_rslt_typ.getListConfig().setPutter(getDtl_std_insp_rslt_typ_ListPutter());
		Dtl_cnf_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_cnf_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.getListConfig().setPutter(getDtl_cnf_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter());
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
	 * この画面を[DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDELStatus() {
		status = DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL_CNF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_CNFStatus() {
		status = DEL_CNF;
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
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (DEL_CNF.equals(status)) {
			setDEL_CNFStatus();
		}
		else if (FIX_D.equals(status)) {
			setFIX_DStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * [Hdr_insp_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_insp_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Hdr_insp_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_insp_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Hdr_sublot_no_ListPutter]の作成
	 */
	protected MCListPutter createHdr_sublot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Hdr_mfg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_mfg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Hdr_to_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_to_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 
	/**
	 * [Hdr_insp_judg_rslt_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_insp_judg_rslt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.InspJudgRsltTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_judg_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_judg_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Dtl_insp_point_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_insp_point_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.InspPoint");
		return lp;
	}
	 
	/**
	 * [Dtl_insp_qlqn_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_insp_qlqn_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.InspQlqnTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_trd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Unit");
		return lp;
	}
	 
	/**
	 * [Dtl_sign_out_min_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sign_out_min_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SignTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sign_in_min_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sign_in_min_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SignTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sign_in_max_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sign_in_max_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SignTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sign_out_max_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sign_out_max_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SignTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Dtl_std_insp_rslt_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_std_insp_rslt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.StdInspRsltTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_cnf_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_cnf_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}


	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Hdr_insp_sts_typ) return getHdr_insp_sts_typ(row, info);
		if(combo == Hdr_insp_typ) return getHdr_insp_typ(row, info);
		if(combo == Hdr_itm_p_PPanel.Itm_itm_cd) return getHdr_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Hdr_itm_p_PPanel.Itm_itm_sub1) return getHdr_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Hdr_itm_p_PPanel.Itm_itm_sub2) return getHdr_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Hdr_itm_p_PPanel.Itm_itm_sub3) return getHdr_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Hdr_sublot_no) return getHdr_sublot_no(row, info);
		if(combo == Hdr_mfg_loc_cd) return getHdr_mfg_loc_cd(row, info);
		if(combo == Hdr_to_site_cd) return getHdr_to_site_cd(row, info);
		if(combo == Hdr_insp_judg_rslt_typ) return getHdr_insp_judg_rslt_typ(row, info);
		if(combo == Hdr_judg_dpt_cd) return getHdr_judg_dpt_cd(row, info);
		if(combo == BulkSet_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == columnDtl_insp_point_cd) return getDtl_insp_point_cd(row, info);
		if(combo == columnDtl_insp_qlqn_typ) return getDtl_insp_qlqn_typ(row, info);
		if(combo == columnDtl_trd_unit_cd) return getDtl_trd_unit_cd(row, info);
		if(combo == columnDtl_sign_out_min_typ) return getDtl_sign_out_min_typ(row, info);
		if(combo == columnDtl_sign_in_min_typ) return getDtl_sign_in_min_typ(row, info);
		if(combo == columnDtl_sign_in_max_typ) return getDtl_sign_in_max_typ(row, info);
		if(combo == columnDtl_sign_out_max_typ) return getDtl_sign_out_max_typ(row, info);
		if(combo == Dtl_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd) return getDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(row, info);
		if(combo == columnDtl_std_insp_rslt_typ) return getDtl_std_insp_rslt_typ(row, info);
		if(combo == Dtl_cnf_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd) return getDtl_cnf_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch) doCnd_srch(info);
		else if (ap == Btn_prnt) doBtn_prnt(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_upd_cnf) doBtn_upd_cnf(info);
		else if (ap == Btn_del) doBtn_del(info);
		else if (ap == Btn_del_cnf) doBtn_del_cnf(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

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
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_cnf]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_cnf(MCEventInfo info);

	/**
	 * [Btn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_cnf]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_cnf(MCEventInfo info);

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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_insp_no) return doCnd_insp_no_VC(info);
		if (vc == Hdr_insp_no) return doHdr_insp_no_VC(info);
		if (vc == Hdr_insp_freq) return doHdr_insp_freq_VC(info);
		if (vc == Hdr_insp_sts_typ) return doHdr_insp_sts_typ_VC(info);
		if (vc == Hdr_insp_sts_typ_nm) return doHdr_insp_sts_typ_nm_VC(info);
		if (vc == Hdr_insp_typ) return doHdr_insp_typ_VC(info);
		if (vc == Hdr_insp_typ_nm) return doHdr_insp_typ_nm_VC(info);
		if (vc == Hdr_lot_no) return doHdr_lot_no_VC(info);
		if (vc == Hdr_sublot_no) return doHdr_sublot_no_VC(info);
		if (vc == Hdr_vld_dt) return doHdr_vld_dt_VC(info);
		if (vc == Hdr_lmt_dt) return doHdr_lmt_dt_VC(info);
		if (vc == Hdr_mfg_loc_cd) return doHdr_mfg_loc_cd_VC(info);
		if (vc == Hdr_mfg_loc_nm) return doHdr_mfg_loc_nm_VC(info);
		if (vc == Hdr_sppl_cd) return doHdr_sppl_cd_VC(info);
		if (vc == Hdr_sppl_nm) return doHdr_sppl_nm_VC(info);
		if (vc == Hdr_to_site_cd) return doHdr_to_site_cd_VC(info);
		if (vc == Hdr_to_site_nm) return doHdr_to_site_nm_VC(info);
		if (vc == Hdr_bp_lot_no) return doHdr_bp_lot_no_VC(info);
		if (vc == Hdr_insp_std_no) return doHdr_insp_std_no_VC(info);
		if (vc == Hdr_std_req_flg) return doHdr_std_req_flg_VC(info);
		if (vc == Hdr_std_cnf_req_flg) return doHdr_std_cnf_req_flg_VC(info);
		if (vc == Hdr_insp_judg_rslt_typ) return doHdr_insp_judg_rslt_typ_VC(info);
		if (vc == Hdr_insp_judg_rslt_typ_nm) return doHdr_insp_judg_rslt_typ_nm_VC(info);
		if (vc == Hdr_judg_dt) return doHdr_judg_dt_VC(info);
		if (vc == Hdr_judg_usr_cd) return doHdr_judg_usr_cd_VC(info);
		if (vc == Hdr_judg_usr_nm) return doHdr_judg_usr_nm_VC(info);
		if (vc == Hdr_judg_dpt_cd) return doHdr_judg_dpt_cd_VC(info);
		if (vc == Hdr_judg_dpt_nm) return doHdr_judg_dpt_nm_VC(info);
		if (vc == Hdr_insp_rslt_prnt_flg) return doHdr_insp_rslt_prnt_flg_VC(info);
		if (vc == Hdr_insp_rslt_prnt_tm) return doHdr_insp_rslt_prnt_tm_VC(info);
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
		if (vc == BulkSet_cnf_dt) return doBulkSet_cnf_dt_VC(info);
		if (vc == columnDtl_insp_seq) return doDtl_insp_seq_VC(info);
		if (vc == columnDtl_insp_point_cd) return doDtl_insp_point_cd_VC(info);
		if (vc == columnDtl_insp_point_nm) return doDtl_insp_point_nm_VC(info);
		if (vc == columnDtl_insp_qlqn_typ) return doDtl_insp_qlqn_typ_VC(info);
		if (vc == columnDtl_insp_qlqn_typ_nm) return doDtl_insp_qlqn_typ_nm_VC(info);
		if (vc == columnDtl_ql_std_val) return doDtl_ql_std_val_VC(info);
		if (vc == columnDtl_ql_insp_val) return doDtl_ql_insp_val_VC(info);
		if (vc == columnDtl_trd_unit_cd) return doDtl_trd_unit_cd_VC(info);
		if (vc == columnDtl_trd_unit_nm) return doDtl_trd_unit_nm_VC(info);
		if (vc == columnDtl_sign_out_min_typ) return doDtl_sign_out_min_typ_VC(info);
		if (vc == columnDtl_sign_out_min_typ_nm) return doDtl_sign_out_min_typ_nm_VC(info);
		if (vc == columnDtl_sign_in_min_typ) return doDtl_sign_in_min_typ_VC(info);
		if (vc == columnDtl_sign_in_min_typ_nm) return doDtl_sign_in_min_typ_nm_VC(info);
		if (vc == columnDtl_sign_in_max_typ) return doDtl_sign_in_max_typ_VC(info);
		if (vc == columnDtl_sign_in_max_typ_nm) return doDtl_sign_in_max_typ_nm_VC(info);
		if (vc == columnDtl_sign_out_max_typ) return doDtl_sign_out_max_typ_VC(info);
		if (vc == columnDtl_sign_out_max_typ_nm) return doDtl_sign_out_max_typ_nm_VC(info);
		if (vc == columnDtl_std_insp_rslt_typ) return doDtl_std_insp_rslt_typ_VC(info);
		if (vc == columnDtl_std_insp_rslt_typ_nm) return doDtl_std_insp_rslt_typ_nm_VC(info);
		if (vc == columnDtl_act_intr_rmrks) return doDtl_act_intr_rmrks_VC(info);
		if (vc == columnDtl_sub_char1) return doDtl_sub_char1_VC(info);
		if (vc == columnDtl_sub_char2) return doDtl_sub_char2_VC(info);
		if (vc == columnDtl_sub_char3) return doDtl_sub_char3_VC(info);
		if (vc == columnDtl_cnf_flg) return doDtl_cnf_flg_VC(info);
		if (vc == columnDtl_cnf_dt) return doDtl_cnf_dt_VC(info);
		if (vc == columnDtl_cnf_intr_rmrks) return doDtl_cnf_intr_rmrks_VC(info);
		if (vc == columnDtl_intr_rmrks) return doDtl_intr_rmrks_VC(info);
		if (vc == columnDtl_inst_sub_char1) return doDtl_inst_sub_char1_VC(info);
		if (vc == columnDtl_inst_sub_char2) return doDtl_inst_sub_char2_VC(info);
		if (vc == columnDtl_inst_sub_char3) return doDtl_inst_sub_char3_VC(info);
		if (vc == columnDtl_std_insp_inst_no) return doDtl_std_insp_inst_no_VC(info);
		if (vc == columnDtl_std_insp_act_no) return doDtl_std_insp_act_no_VC(info);
		if (vc == columnDtl_ins_usr_id) return doDtl_ins_usr_id_VC(info);
		if (vc == columnDtl_ins_usr_nm) return doDtl_ins_usr_nm_VC(info);
		if (vc == columnDtl_ins_func_id) return doDtl_ins_func_id_VC(info);
		if (vc == columnDtl_ins_func_nm) return doDtl_ins_func_nm_VC(info);
		if (vc == columnDtl_ins_ts) return doDtl_ins_ts_VC(info);
		if (vc == columnDtl_upd_usr_id) return doDtl_upd_usr_id_VC(info);
		if (vc == columnDtl_upd_usr_nm) return doDtl_upd_usr_nm_VC(info);
		if (vc == columnDtl_upd_func_id) return doDtl_upd_func_id_VC(info);
		if (vc == columnDtl_upd_func_nm) return doDtl_upd_func_nm_VC(info);
		if (vc == columnDtl_upd_ts) return doDtl_upd_ts_VC(info);
		if (vc == columnDtl_upd_srv_req_no) return doDtl_upd_srv_req_no_VC(info);
		if (vc == columnDtl_qn_int_digit) return doDtl_qn_int_digit_VC(info);
		if (vc == columnDtl_qn_int_frac) return doDtl_qn_int_frac_VC(info);
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
	 * [Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[insp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_no_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[vld_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_vld_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[lmt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lmt_dt_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[to_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_to_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[to_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_to_site_nm_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[insp_judg_rslt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_judg_rslt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_judg_rslt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_judg_rslt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[judg_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_judg_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[judg_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_judg_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[judg_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_judg_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[judg_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_judg_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[judg_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_judg_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_rslt_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_rslt_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_rslt_prnt_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_rslt_prnt_tm_VC(MCEventInfo info){
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
	 * [BulkSet]パネルの[cnf_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_cnf_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[insp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_insp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[insp_point_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_insp_point_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[insp_point_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_insp_point_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[insp_qlqn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_insp_qlqn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[insp_qlqn_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_insp_qlqn_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ql_std_val]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ql_std_val_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ql_insp_val]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ql_insp_val_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sign_out_min_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sign_out_min_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sign_out_min_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sign_out_min_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sign_in_min_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sign_in_min_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sign_in_min_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sign_in_min_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sign_in_max_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sign_in_max_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sign_in_max_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sign_in_max_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sign_out_max_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sign_out_max_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sign_out_max_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sign_out_max_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[std_insp_rslt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_std_insp_rslt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[std_insp_rslt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_std_insp_rslt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[act_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_act_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cnf_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cnf_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cnf_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cnf_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cnf_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cnf_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inst_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inst_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inst_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inst_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inst_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inst_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[std_insp_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_std_insp_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[std_insp_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_std_insp_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[qn_int_digit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_qn_int_digit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[qn_int_frac]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_qn_int_frac_VC(MCEventInfo info){
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
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_insp_no) doCnd_insp_no_NC(info);
		else if (nc == Hdr_insp_no) doHdr_insp_no_NC(info);
		else if (nc == Hdr_insp_freq) doHdr_insp_freq_NC(info);
		else if (nc == Hdr_insp_sts_typ) doHdr_insp_sts_typ_NC(info);
		else if (nc == Hdr_insp_sts_typ_nm) doHdr_insp_sts_typ_nm_NC(info);
		else if (nc == Hdr_insp_typ) doHdr_insp_typ_NC(info);
		else if (nc == Hdr_insp_typ_nm) doHdr_insp_typ_nm_NC(info);
		else if (nc == Hdr_lot_no) doHdr_lot_no_NC(info);
		else if (nc == Hdr_sublot_no) doHdr_sublot_no_NC(info);
		else if (nc == Hdr_vld_dt) doHdr_vld_dt_NC(info);
		else if (nc == Hdr_lmt_dt) doHdr_lmt_dt_NC(info);
		else if (nc == Hdr_mfg_loc_cd) doHdr_mfg_loc_cd_NC(info);
		else if (nc == Hdr_mfg_loc_nm) doHdr_mfg_loc_nm_NC(info);
		else if (nc == Hdr_sppl_cd) doHdr_sppl_cd_NC(info);
		else if (nc == Hdr_sppl_nm) doHdr_sppl_nm_NC(info);
		else if (nc == Hdr_to_site_cd) doHdr_to_site_cd_NC(info);
		else if (nc == Hdr_to_site_nm) doHdr_to_site_nm_NC(info);
		else if (nc == Hdr_bp_lot_no) doHdr_bp_lot_no_NC(info);
		else if (nc == Hdr_insp_std_no) doHdr_insp_std_no_NC(info);
		else if (nc == Hdr_std_req_flg) doHdr_std_req_flg_NC(info);
		else if (nc == Hdr_std_cnf_req_flg) doHdr_std_cnf_req_flg_NC(info);
		else if (nc == Hdr_insp_judg_rslt_typ) doHdr_insp_judg_rslt_typ_NC(info);
		else if (nc == Hdr_insp_judg_rslt_typ_nm) doHdr_insp_judg_rslt_typ_nm_NC(info);
		else if (nc == Hdr_judg_dt) doHdr_judg_dt_NC(info);
		else if (nc == Hdr_judg_usr_cd) doHdr_judg_usr_cd_NC(info);
		else if (nc == Hdr_judg_usr_nm) doHdr_judg_usr_nm_NC(info);
		else if (nc == Hdr_judg_dpt_cd) doHdr_judg_dpt_cd_NC(info);
		else if (nc == Hdr_judg_dpt_nm) doHdr_judg_dpt_nm_NC(info);
		else if (nc == Hdr_insp_rslt_prnt_flg) doHdr_insp_rslt_prnt_flg_NC(info);
		else if (nc == Hdr_insp_rslt_prnt_tm) doHdr_insp_rslt_prnt_tm_NC(info);
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
		else if (nc == BulkSet_cnf_dt) doBulkSet_cnf_dt_NC(info);
		else if (nc == columnDtl_insp_seq) doDtl_insp_seq_NC(info);
		else if (nc == columnDtl_insp_point_cd) doDtl_insp_point_cd_NC(info);
		else if (nc == columnDtl_insp_point_nm) doDtl_insp_point_nm_NC(info);
		else if (nc == columnDtl_insp_qlqn_typ) doDtl_insp_qlqn_typ_NC(info);
		else if (nc == columnDtl_insp_qlqn_typ_nm) doDtl_insp_qlqn_typ_nm_NC(info);
		else if (nc == columnDtl_ql_std_val) doDtl_ql_std_val_NC(info);
		else if (nc == columnDtl_ql_insp_val) doDtl_ql_insp_val_NC(info);
		else if (nc == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NC(info);
		else if (nc == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NC(info);
		else if (nc == columnDtl_sign_out_min_typ) doDtl_sign_out_min_typ_NC(info);
		else if (nc == columnDtl_sign_out_min_typ_nm) doDtl_sign_out_min_typ_nm_NC(info);
		else if (nc == columnDtl_sign_in_min_typ) doDtl_sign_in_min_typ_NC(info);
		else if (nc == columnDtl_sign_in_min_typ_nm) doDtl_sign_in_min_typ_nm_NC(info);
		else if (nc == columnDtl_sign_in_max_typ) doDtl_sign_in_max_typ_NC(info);
		else if (nc == columnDtl_sign_in_max_typ_nm) doDtl_sign_in_max_typ_nm_NC(info);
		else if (nc == columnDtl_sign_out_max_typ) doDtl_sign_out_max_typ_NC(info);
		else if (nc == columnDtl_sign_out_max_typ_nm) doDtl_sign_out_max_typ_nm_NC(info);
		else if (nc == columnDtl_std_insp_rslt_typ) doDtl_std_insp_rslt_typ_NC(info);
		else if (nc == columnDtl_std_insp_rslt_typ_nm) doDtl_std_insp_rslt_typ_nm_NC(info);
		else if (nc == columnDtl_act_intr_rmrks) doDtl_act_intr_rmrks_NC(info);
		else if (nc == columnDtl_sub_char1) doDtl_sub_char1_NC(info);
		else if (nc == columnDtl_sub_char2) doDtl_sub_char2_NC(info);
		else if (nc == columnDtl_sub_char3) doDtl_sub_char3_NC(info);
		else if (nc == columnDtl_cnf_flg) doDtl_cnf_flg_NC(info);
		else if (nc == columnDtl_cnf_dt) doDtl_cnf_dt_NC(info);
		else if (nc == columnDtl_cnf_intr_rmrks) doDtl_cnf_intr_rmrks_NC(info);
		else if (nc == columnDtl_intr_rmrks) doDtl_intr_rmrks_NC(info);
		else if (nc == columnDtl_inst_sub_char1) doDtl_inst_sub_char1_NC(info);
		else if (nc == columnDtl_inst_sub_char2) doDtl_inst_sub_char2_NC(info);
		else if (nc == columnDtl_inst_sub_char3) doDtl_inst_sub_char3_NC(info);
		else if (nc == columnDtl_std_insp_inst_no) doDtl_std_insp_inst_no_NC(info);
		else if (nc == columnDtl_std_insp_act_no) doDtl_std_insp_act_no_NC(info);
		else if (nc == columnDtl_ins_usr_id) doDtl_ins_usr_id_NC(info);
		else if (nc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NC(info);
		else if (nc == columnDtl_ins_func_id) doDtl_ins_func_id_NC(info);
		else if (nc == columnDtl_ins_func_nm) doDtl_ins_func_nm_NC(info);
		else if (nc == columnDtl_ins_ts) doDtl_ins_ts_NC(info);
		else if (nc == columnDtl_upd_usr_id) doDtl_upd_usr_id_NC(info);
		else if (nc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NC(info);
		else if (nc == columnDtl_upd_func_id) doDtl_upd_func_id_NC(info);
		else if (nc == columnDtl_upd_func_nm) doDtl_upd_func_nm_NC(info);
		else if (nc == columnDtl_upd_ts) doDtl_upd_ts_NC(info);
		else if (nc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NC(info);
		else if (nc == columnDtl_qn_int_digit) doDtl_qn_int_digit_NC(info);
		else if (nc == columnDtl_qn_int_frac) doDtl_qn_int_frac_NC(info);
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
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_no_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[vld_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_vld_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_dt_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[to_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_to_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[to_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_to_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bp_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bp_lot_no_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[insp_judg_rslt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_judg_rslt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_judg_rslt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_judg_rslt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[judg_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_judg_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[judg_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_judg_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[judg_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_judg_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[judg_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_judg_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[judg_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_judg_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_rslt_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_rslt_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_rslt_prnt_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_rslt_prnt_tm_NC(MCEventInfo info){
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
	 * [BulkSet]パネルの[cnf_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cnf_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_point_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_point_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_point_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_point_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_qlqn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_qlqn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_qlqn_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_qlqn_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ql_std_val]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ql_std_val_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ql_insp_val]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ql_insp_val_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_out_min_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_out_min_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_out_min_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_out_min_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_in_min_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_in_min_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_in_min_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_in_min_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_in_max_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_in_max_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_in_max_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_in_max_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_out_max_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_out_max_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_out_max_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_out_max_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_insp_rslt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_insp_rslt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_insp_rslt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_insp_rslt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cnf_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cnf_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cnf_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cnf_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cnf_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cnf_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_insp_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_insp_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_insp_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_insp_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qn_int_digit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qn_int_digit_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qn_int_frac]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qn_int_frac_NC(MCEventInfo info){
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
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_insp_no) doCnd_insp_no_NE(info);
		else if (ne == Hdr_insp_no) doHdr_insp_no_NE(info);
		else if (ne == Hdr_insp_freq) doHdr_insp_freq_NE(info);
		else if (ne == Hdr_insp_sts_typ) doHdr_insp_sts_typ_NE(info);
		else if (ne == Hdr_insp_sts_typ_nm) doHdr_insp_sts_typ_nm_NE(info);
		else if (ne == Hdr_insp_typ) doHdr_insp_typ_NE(info);
		else if (ne == Hdr_insp_typ_nm) doHdr_insp_typ_nm_NE(info);
		else if (ne == Hdr_lot_no) doHdr_lot_no_NE(info);
		else if (ne == Hdr_sublot_no) doHdr_sublot_no_NE(info);
		else if (ne == Hdr_vld_dt) doHdr_vld_dt_NE(info);
		else if (ne == Hdr_lmt_dt) doHdr_lmt_dt_NE(info);
		else if (ne == Hdr_mfg_loc_cd) doHdr_mfg_loc_cd_NE(info);
		else if (ne == Hdr_mfg_loc_nm) doHdr_mfg_loc_nm_NE(info);
		else if (ne == Hdr_sppl_cd) doHdr_sppl_cd_NE(info);
		else if (ne == Hdr_sppl_nm) doHdr_sppl_nm_NE(info);
		else if (ne == Hdr_to_site_cd) doHdr_to_site_cd_NE(info);
		else if (ne == Hdr_to_site_nm) doHdr_to_site_nm_NE(info);
		else if (ne == Hdr_bp_lot_no) doHdr_bp_lot_no_NE(info);
		else if (ne == Hdr_insp_std_no) doHdr_insp_std_no_NE(info);
		else if (ne == Hdr_std_req_flg) doHdr_std_req_flg_NE(info);
		else if (ne == Hdr_std_cnf_req_flg) doHdr_std_cnf_req_flg_NE(info);
		else if (ne == Hdr_insp_judg_rslt_typ) doHdr_insp_judg_rslt_typ_NE(info);
		else if (ne == Hdr_insp_judg_rslt_typ_nm) doHdr_insp_judg_rslt_typ_nm_NE(info);
		else if (ne == Hdr_judg_dt) doHdr_judg_dt_NE(info);
		else if (ne == Hdr_judg_usr_cd) doHdr_judg_usr_cd_NE(info);
		else if (ne == Hdr_judg_usr_nm) doHdr_judg_usr_nm_NE(info);
		else if (ne == Hdr_judg_dpt_cd) doHdr_judg_dpt_cd_NE(info);
		else if (ne == Hdr_judg_dpt_nm) doHdr_judg_dpt_nm_NE(info);
		else if (ne == Hdr_insp_rslt_prnt_flg) doHdr_insp_rslt_prnt_flg_NE(info);
		else if (ne == Hdr_insp_rslt_prnt_tm) doHdr_insp_rslt_prnt_tm_NE(info);
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
		else if (ne == BulkSet_cnf_dt) doBulkSet_cnf_dt_NE(info);
		else if (ne == columnDtl_insp_seq) doDtl_insp_seq_NE(info);
		else if (ne == columnDtl_insp_point_cd) doDtl_insp_point_cd_NE(info);
		else if (ne == columnDtl_insp_point_nm) doDtl_insp_point_nm_NE(info);
		else if (ne == columnDtl_insp_qlqn_typ) doDtl_insp_qlqn_typ_NE(info);
		else if (ne == columnDtl_insp_qlqn_typ_nm) doDtl_insp_qlqn_typ_nm_NE(info);
		else if (ne == columnDtl_ql_std_val) doDtl_ql_std_val_NE(info);
		else if (ne == columnDtl_ql_insp_val) doDtl_ql_insp_val_NE(info);
		else if (ne == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NE(info);
		else if (ne == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NE(info);
		else if (ne == columnDtl_sign_out_min_typ) doDtl_sign_out_min_typ_NE(info);
		else if (ne == columnDtl_sign_out_min_typ_nm) doDtl_sign_out_min_typ_nm_NE(info);
		else if (ne == columnDtl_sign_in_min_typ) doDtl_sign_in_min_typ_NE(info);
		else if (ne == columnDtl_sign_in_min_typ_nm) doDtl_sign_in_min_typ_nm_NE(info);
		else if (ne == columnDtl_sign_in_max_typ) doDtl_sign_in_max_typ_NE(info);
		else if (ne == columnDtl_sign_in_max_typ_nm) doDtl_sign_in_max_typ_nm_NE(info);
		else if (ne == columnDtl_sign_out_max_typ) doDtl_sign_out_max_typ_NE(info);
		else if (ne == columnDtl_sign_out_max_typ_nm) doDtl_sign_out_max_typ_nm_NE(info);
		else if (ne == columnDtl_std_insp_rslt_typ) doDtl_std_insp_rslt_typ_NE(info);
		else if (ne == columnDtl_std_insp_rslt_typ_nm) doDtl_std_insp_rslt_typ_nm_NE(info);
		else if (ne == columnDtl_act_intr_rmrks) doDtl_act_intr_rmrks_NE(info);
		else if (ne == columnDtl_sub_char1) doDtl_sub_char1_NE(info);
		else if (ne == columnDtl_sub_char2) doDtl_sub_char2_NE(info);
		else if (ne == columnDtl_sub_char3) doDtl_sub_char3_NE(info);
		else if (ne == columnDtl_cnf_flg) doDtl_cnf_flg_NE(info);
		else if (ne == columnDtl_cnf_dt) doDtl_cnf_dt_NE(info);
		else if (ne == columnDtl_cnf_intr_rmrks) doDtl_cnf_intr_rmrks_NE(info);
		else if (ne == columnDtl_intr_rmrks) doDtl_intr_rmrks_NE(info);
		else if (ne == columnDtl_inst_sub_char1) doDtl_inst_sub_char1_NE(info);
		else if (ne == columnDtl_inst_sub_char2) doDtl_inst_sub_char2_NE(info);
		else if (ne == columnDtl_inst_sub_char3) doDtl_inst_sub_char3_NE(info);
		else if (ne == columnDtl_std_insp_inst_no) doDtl_std_insp_inst_no_NE(info);
		else if (ne == columnDtl_std_insp_act_no) doDtl_std_insp_act_no_NE(info);
		else if (ne == columnDtl_ins_usr_id) doDtl_ins_usr_id_NE(info);
		else if (ne == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NE(info);
		else if (ne == columnDtl_ins_func_id) doDtl_ins_func_id_NE(info);
		else if (ne == columnDtl_ins_func_nm) doDtl_ins_func_nm_NE(info);
		else if (ne == columnDtl_ins_ts) doDtl_ins_ts_NE(info);
		else if (ne == columnDtl_upd_usr_id) doDtl_upd_usr_id_NE(info);
		else if (ne == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NE(info);
		else if (ne == columnDtl_upd_func_id) doDtl_upd_func_id_NE(info);
		else if (ne == columnDtl_upd_func_nm) doDtl_upd_func_nm_NE(info);
		else if (ne == columnDtl_upd_ts) doDtl_upd_ts_NE(info);
		else if (ne == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NE(info);
		else if (ne == columnDtl_qn_int_digit) doDtl_qn_int_digit_NE(info);
		else if (ne == columnDtl_qn_int_frac) doDtl_qn_int_frac_NE(info);
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
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_no_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[vld_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_vld_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_dt_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[to_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_to_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[to_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_to_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bp_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bp_lot_no_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[insp_judg_rslt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_judg_rslt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_judg_rslt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_judg_rslt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[judg_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_judg_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[judg_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_judg_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[judg_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_judg_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[judg_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_judg_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[judg_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_judg_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_rslt_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_rslt_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_rslt_prnt_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_rslt_prnt_tm_NE(MCEventInfo info){
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
	 * [BulkSet]パネルの[cnf_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cnf_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_point_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_point_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_point_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_point_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_qlqn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_qlqn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_qlqn_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_qlqn_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ql_std_val]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ql_std_val_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ql_insp_val]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ql_insp_val_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_out_min_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_out_min_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_out_min_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_out_min_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_in_min_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_in_min_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_in_min_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_in_min_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_in_max_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_in_max_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_in_max_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_in_max_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_out_max_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_out_max_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_out_max_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_out_max_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_insp_rslt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_insp_rslt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_insp_rslt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_insp_rslt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cnf_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cnf_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cnf_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cnf_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cnf_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cnf_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_insp_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_insp_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_insp_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_insp_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qn_int_digit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qn_int_digit_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qn_int_frac]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qn_int_frac_NE(MCEventInfo info){
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
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_insp_no) doCnd_insp_no_NX(info);
		else if (nx == Hdr_insp_no) doHdr_insp_no_NX(info);
		else if (nx == Hdr_insp_freq) doHdr_insp_freq_NX(info);
		else if (nx == Hdr_insp_sts_typ) doHdr_insp_sts_typ_NX(info);
		else if (nx == Hdr_insp_sts_typ_nm) doHdr_insp_sts_typ_nm_NX(info);
		else if (nx == Hdr_insp_typ) doHdr_insp_typ_NX(info);
		else if (nx == Hdr_insp_typ_nm) doHdr_insp_typ_nm_NX(info);
		else if (nx == Hdr_lot_no) doHdr_lot_no_NX(info);
		else if (nx == Hdr_sublot_no) doHdr_sublot_no_NX(info);
		else if (nx == Hdr_vld_dt) doHdr_vld_dt_NX(info);
		else if (nx == Hdr_lmt_dt) doHdr_lmt_dt_NX(info);
		else if (nx == Hdr_mfg_loc_cd) doHdr_mfg_loc_cd_NX(info);
		else if (nx == Hdr_mfg_loc_nm) doHdr_mfg_loc_nm_NX(info);
		else if (nx == Hdr_sppl_cd) doHdr_sppl_cd_NX(info);
		else if (nx == Hdr_sppl_nm) doHdr_sppl_nm_NX(info);
		else if (nx == Hdr_to_site_cd) doHdr_to_site_cd_NX(info);
		else if (nx == Hdr_to_site_nm) doHdr_to_site_nm_NX(info);
		else if (nx == Hdr_bp_lot_no) doHdr_bp_lot_no_NX(info);
		else if (nx == Hdr_insp_std_no) doHdr_insp_std_no_NX(info);
		else if (nx == Hdr_std_req_flg) doHdr_std_req_flg_NX(info);
		else if (nx == Hdr_std_cnf_req_flg) doHdr_std_cnf_req_flg_NX(info);
		else if (nx == Hdr_insp_judg_rslt_typ) doHdr_insp_judg_rslt_typ_NX(info);
		else if (nx == Hdr_insp_judg_rslt_typ_nm) doHdr_insp_judg_rslt_typ_nm_NX(info);
		else if (nx == Hdr_judg_dt) doHdr_judg_dt_NX(info);
		else if (nx == Hdr_judg_usr_cd) doHdr_judg_usr_cd_NX(info);
		else if (nx == Hdr_judg_usr_nm) doHdr_judg_usr_nm_NX(info);
		else if (nx == Hdr_judg_dpt_cd) doHdr_judg_dpt_cd_NX(info);
		else if (nx == Hdr_judg_dpt_nm) doHdr_judg_dpt_nm_NX(info);
		else if (nx == Hdr_insp_rslt_prnt_flg) doHdr_insp_rslt_prnt_flg_NX(info);
		else if (nx == Hdr_insp_rslt_prnt_tm) doHdr_insp_rslt_prnt_tm_NX(info);
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
		else if (nx == BulkSet_cnf_dt) doBulkSet_cnf_dt_NX(info);
		else if (nx == columnDtl_insp_seq) doDtl_insp_seq_NX(info);
		else if (nx == columnDtl_insp_point_cd) doDtl_insp_point_cd_NX(info);
		else if (nx == columnDtl_insp_point_nm) doDtl_insp_point_nm_NX(info);
		else if (nx == columnDtl_insp_qlqn_typ) doDtl_insp_qlqn_typ_NX(info);
		else if (nx == columnDtl_insp_qlqn_typ_nm) doDtl_insp_qlqn_typ_nm_NX(info);
		else if (nx == columnDtl_ql_std_val) doDtl_ql_std_val_NX(info);
		else if (nx == columnDtl_ql_insp_val) doDtl_ql_insp_val_NX(info);
		else if (nx == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NX(info);
		else if (nx == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NX(info);
		else if (nx == columnDtl_sign_out_min_typ) doDtl_sign_out_min_typ_NX(info);
		else if (nx == columnDtl_sign_out_min_typ_nm) doDtl_sign_out_min_typ_nm_NX(info);
		else if (nx == columnDtl_sign_in_min_typ) doDtl_sign_in_min_typ_NX(info);
		else if (nx == columnDtl_sign_in_min_typ_nm) doDtl_sign_in_min_typ_nm_NX(info);
		else if (nx == columnDtl_sign_in_max_typ) doDtl_sign_in_max_typ_NX(info);
		else if (nx == columnDtl_sign_in_max_typ_nm) doDtl_sign_in_max_typ_nm_NX(info);
		else if (nx == columnDtl_sign_out_max_typ) doDtl_sign_out_max_typ_NX(info);
		else if (nx == columnDtl_sign_out_max_typ_nm) doDtl_sign_out_max_typ_nm_NX(info);
		else if (nx == columnDtl_std_insp_rslt_typ) doDtl_std_insp_rslt_typ_NX(info);
		else if (nx == columnDtl_std_insp_rslt_typ_nm) doDtl_std_insp_rslt_typ_nm_NX(info);
		else if (nx == columnDtl_act_intr_rmrks) doDtl_act_intr_rmrks_NX(info);
		else if (nx == columnDtl_sub_char1) doDtl_sub_char1_NX(info);
		else if (nx == columnDtl_sub_char2) doDtl_sub_char2_NX(info);
		else if (nx == columnDtl_sub_char3) doDtl_sub_char3_NX(info);
		else if (nx == columnDtl_cnf_flg) doDtl_cnf_flg_NX(info);
		else if (nx == columnDtl_cnf_dt) doDtl_cnf_dt_NX(info);
		else if (nx == columnDtl_cnf_intr_rmrks) doDtl_cnf_intr_rmrks_NX(info);
		else if (nx == columnDtl_intr_rmrks) doDtl_intr_rmrks_NX(info);
		else if (nx == columnDtl_inst_sub_char1) doDtl_inst_sub_char1_NX(info);
		else if (nx == columnDtl_inst_sub_char2) doDtl_inst_sub_char2_NX(info);
		else if (nx == columnDtl_inst_sub_char3) doDtl_inst_sub_char3_NX(info);
		else if (nx == columnDtl_std_insp_inst_no) doDtl_std_insp_inst_no_NX(info);
		else if (nx == columnDtl_std_insp_act_no) doDtl_std_insp_act_no_NX(info);
		else if (nx == columnDtl_ins_usr_id) doDtl_ins_usr_id_NX(info);
		else if (nx == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NX(info);
		else if (nx == columnDtl_ins_func_id) doDtl_ins_func_id_NX(info);
		else if (nx == columnDtl_ins_func_nm) doDtl_ins_func_nm_NX(info);
		else if (nx == columnDtl_ins_ts) doDtl_ins_ts_NX(info);
		else if (nx == columnDtl_upd_usr_id) doDtl_upd_usr_id_NX(info);
		else if (nx == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NX(info);
		else if (nx == columnDtl_upd_func_id) doDtl_upd_func_id_NX(info);
		else if (nx == columnDtl_upd_func_nm) doDtl_upd_func_nm_NX(info);
		else if (nx == columnDtl_upd_ts) doDtl_upd_ts_NX(info);
		else if (nx == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NX(info);
		else if (nx == columnDtl_qn_int_digit) doDtl_qn_int_digit_NX(info);
		else if (nx == columnDtl_qn_int_frac) doDtl_qn_int_frac_NX(info);
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
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_no_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[vld_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_vld_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_dt_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[to_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_to_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[to_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_to_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bp_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bp_lot_no_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[insp_judg_rslt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_judg_rslt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_judg_rslt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_judg_rslt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[judg_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_judg_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[judg_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_judg_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[judg_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_judg_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[judg_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_judg_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[judg_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_judg_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_rslt_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_rslt_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_rslt_prnt_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_rslt_prnt_tm_NX(MCEventInfo info){
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
	 * [BulkSet]パネルの[cnf_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cnf_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_point_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_point_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_point_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_point_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_qlqn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_qlqn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_qlqn_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_qlqn_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ql_std_val]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ql_std_val_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ql_insp_val]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ql_insp_val_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_out_min_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_out_min_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_out_min_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_out_min_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_in_min_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_in_min_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_in_min_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_in_min_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_in_max_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_in_max_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_in_max_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_in_max_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_out_max_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_out_max_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_out_max_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_out_max_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_insp_rslt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_insp_rslt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_insp_rslt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_insp_rslt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cnf_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cnf_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cnf_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cnf_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cnf_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cnf_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_insp_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_insp_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_insp_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_insp_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qn_int_digit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qn_int_digit_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qn_int_frac]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qn_int_frac_NX(MCEventInfo info){
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
		if (lc == Cnd_insp_no) doCnd_insp_no_LC(info);
		else if (lc == Hdr_insp_no) doHdr_insp_no_LC(info);
		else if (lc == Hdr_insp_freq) doHdr_insp_freq_LC(info);
		else if (lc == Hdr_insp_sts_typ) doHdr_insp_sts_typ_LC(info);
		else if (lc == Hdr_insp_sts_typ_nm) doHdr_insp_sts_typ_nm_LC(info);
		else if (lc == Hdr_insp_typ) doHdr_insp_typ_LC(info);
		else if (lc == Hdr_insp_typ_nm) doHdr_insp_typ_nm_LC(info);
		else if (lc == Hdr_lot_no) doHdr_lot_no_LC(info);
		else if (lc == Hdr_sublot_no) doHdr_sublot_no_LC(info);
		else if (lc == Hdr_vld_dt) doHdr_vld_dt_LC(info);
		else if (lc == Hdr_lmt_dt) doHdr_lmt_dt_LC(info);
		else if (lc == Hdr_mfg_loc_cd) doHdr_mfg_loc_cd_LC(info);
		else if (lc == Hdr_mfg_loc_nm) doHdr_mfg_loc_nm_LC(info);
		else if (lc == Hdr_sppl_cd) doHdr_sppl_cd_LC(info);
		else if (lc == Hdr_sppl_nm) doHdr_sppl_nm_LC(info);
		else if (lc == Hdr_to_site_cd) doHdr_to_site_cd_LC(info);
		else if (lc == Hdr_to_site_nm) doHdr_to_site_nm_LC(info);
		else if (lc == Hdr_bp_lot_no) doHdr_bp_lot_no_LC(info);
		else if (lc == Hdr_insp_std_no) doHdr_insp_std_no_LC(info);
		else if (lc == Hdr_insp_judg_rslt_typ) doHdr_insp_judg_rslt_typ_LC(info);
		else if (lc == Hdr_insp_judg_rslt_typ_nm) doHdr_insp_judg_rslt_typ_nm_LC(info);
		else if (lc == Hdr_judg_dt) doHdr_judg_dt_LC(info);
		else if (lc == Hdr_judg_usr_cd) doHdr_judg_usr_cd_LC(info);
		else if (lc == Hdr_judg_usr_nm) doHdr_judg_usr_nm_LC(info);
		else if (lc == Hdr_judg_dpt_cd) doHdr_judg_dpt_cd_LC(info);
		else if (lc == Hdr_judg_dpt_nm) doHdr_judg_dpt_nm_LC(info);
		else if (lc == Hdr_insp_rslt_prnt_tm) doHdr_insp_rslt_prnt_tm_LC(info);
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
		else if (lc == BulkSet_cnf_dt) doBulkSet_cnf_dt_LC(info);
		else if (lc == columnDtl_insp_seq) doDtl_insp_seq_LC(info);
		else if (lc == columnDtl_insp_point_cd) doDtl_insp_point_cd_LC(info);
		else if (lc == columnDtl_insp_point_nm) doDtl_insp_point_nm_LC(info);
		else if (lc == columnDtl_insp_qlqn_typ) doDtl_insp_qlqn_typ_LC(info);
		else if (lc == columnDtl_insp_qlqn_typ_nm) doDtl_insp_qlqn_typ_nm_LC(info);
		else if (lc == columnDtl_ql_std_val) doDtl_ql_std_val_LC(info);
		else if (lc == columnDtl_ql_insp_val) doDtl_ql_insp_val_LC(info);
		else if (lc == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_LC(info);
		else if (lc == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_LC(info);
		else if (lc == columnDtl_sign_out_min_typ) doDtl_sign_out_min_typ_LC(info);
		else if (lc == columnDtl_sign_out_min_typ_nm) doDtl_sign_out_min_typ_nm_LC(info);
		else if (lc == columnDtl_sign_in_min_typ) doDtl_sign_in_min_typ_LC(info);
		else if (lc == columnDtl_sign_in_min_typ_nm) doDtl_sign_in_min_typ_nm_LC(info);
		else if (lc == columnDtl_sign_in_max_typ) doDtl_sign_in_max_typ_LC(info);
		else if (lc == columnDtl_sign_in_max_typ_nm) doDtl_sign_in_max_typ_nm_LC(info);
		else if (lc == columnDtl_sign_out_max_typ) doDtl_sign_out_max_typ_LC(info);
		else if (lc == columnDtl_sign_out_max_typ_nm) doDtl_sign_out_max_typ_nm_LC(info);
		else if (lc == columnDtl_std_insp_rslt_typ) doDtl_std_insp_rslt_typ_LC(info);
		else if (lc == columnDtl_std_insp_rslt_typ_nm) doDtl_std_insp_rslt_typ_nm_LC(info);
		else if (lc == columnDtl_act_intr_rmrks) doDtl_act_intr_rmrks_LC(info);
		else if (lc == columnDtl_sub_char1) doDtl_sub_char1_LC(info);
		else if (lc == columnDtl_sub_char2) doDtl_sub_char2_LC(info);
		else if (lc == columnDtl_sub_char3) doDtl_sub_char3_LC(info);
		else if (lc == columnDtl_cnf_dt) doDtl_cnf_dt_LC(info);
		else if (lc == columnDtl_cnf_intr_rmrks) doDtl_cnf_intr_rmrks_LC(info);
		else if (lc == columnDtl_intr_rmrks) doDtl_intr_rmrks_LC(info);
		else if (lc == columnDtl_inst_sub_char1) doDtl_inst_sub_char1_LC(info);
		else if (lc == columnDtl_inst_sub_char2) doDtl_inst_sub_char2_LC(info);
		else if (lc == columnDtl_inst_sub_char3) doDtl_inst_sub_char3_LC(info);
		else if (lc == columnDtl_std_insp_inst_no) doDtl_std_insp_inst_no_LC(info);
		else if (lc == columnDtl_std_insp_act_no) doDtl_std_insp_act_no_LC(info);
		else if (lc == columnDtl_ins_usr_id) doDtl_ins_usr_id_LC(info);
		else if (lc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_LC(info);
		else if (lc == columnDtl_ins_func_id) doDtl_ins_func_id_LC(info);
		else if (lc == columnDtl_ins_func_nm) doDtl_ins_func_nm_LC(info);
		else if (lc == columnDtl_ins_ts) doDtl_ins_ts_LC(info);
		else if (lc == columnDtl_upd_usr_id) doDtl_upd_usr_id_LC(info);
		else if (lc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_LC(info);
		else if (lc == columnDtl_upd_func_id) doDtl_upd_func_id_LC(info);
		else if (lc == columnDtl_upd_func_nm) doDtl_upd_func_nm_LC(info);
		else if (lc == columnDtl_upd_ts) doDtl_upd_ts_LC(info);
		else if (lc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_LC(info);
		else if (lc == columnDtl_qn_int_digit) doDtl_qn_int_digit_LC(info);
		else if (lc == columnDtl_qn_int_frac) doDtl_qn_int_frac_LC(info);
	}

	/**
	 * [Cnd]パネルの[insp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_no_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[vld_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_vld_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_dt_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[to_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_to_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[to_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_to_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bp_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bp_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_std_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_std_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_judg_rslt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_judg_rslt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_judg_rslt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_judg_rslt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[judg_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_judg_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[judg_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_judg_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[judg_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_judg_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[judg_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_judg_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[judg_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_judg_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_rslt_prnt_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_rslt_prnt_tm_LC(MCEventInfo info){
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
	 * [BulkSet]パネルの[cnf_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_cnf_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_point_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_point_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_point_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_point_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_qlqn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_qlqn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_qlqn_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_qlqn_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ql_std_val]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ql_std_val_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ql_insp_val]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ql_insp_val_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_out_min_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_out_min_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_out_min_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_out_min_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_in_min_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_in_min_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_in_min_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_in_min_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_in_max_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_in_max_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_in_max_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_in_max_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_out_max_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_out_max_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sign_out_max_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sign_out_max_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_insp_rslt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_insp_rslt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_insp_rslt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_insp_rslt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cnf_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cnf_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cnf_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cnf_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_insp_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_insp_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_insp_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_insp_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qn_int_digit]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qn_int_digit_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qn_int_frac]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qn_int_frac_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Hdr_insp_sts_typ]の作成メソッド
	 */
	public MCList getHdr_insp_sts_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[Hdr_insp_typ]の作成メソッド
	 */
	public MCList getHdr_insp_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[Hdr_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getHdr_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getHdr_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getHdr_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getHdr_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_sublot_no]の作成メソッド
	 */
	public MCList getHdr_sublot_no(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[Hdr_mfg_loc_cd]の作成メソッド
	 */
	public MCList getHdr_mfg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_to_site_cd]の作成メソッド
	 */
	public MCList getHdr_to_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_insp_judg_rslt_typ]の作成メソッド
	 */
	public MCList getHdr_insp_judg_rslt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getInspJudgRsltTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_judg_dpt_cd]の作成メソッド
	 */
	public MCList getHdr_judg_dpt_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[BulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getBulkSet_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_insp_point_cd]の作成メソッド
	 */
	public MCList getDtl_insp_point_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInspPoint(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_insp_qlqn_typ]の作成メソッド
	 */
	public MCList getDtl_insp_qlqn_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInspQlqnTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_trd_unit_cd]の作成メソッド
	 */
	public MCList getDtl_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sign_out_min_typ]の作成メソッド
	 */
	public MCList getDtl_sign_out_min_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSignTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sign_in_min_typ]の作成メソッド
	 */
	public MCList getDtl_sign_in_min_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSignTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sign_in_max_typ]の作成メソッド
	 */
	public MCList getDtl_sign_in_max_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSignTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sign_out_max_typ]の作成メソッド
	 */
	public MCList getDtl_sign_out_max_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSignTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_std_insp_rslt_typ]の作成メソッド
	 */
	public MCList getDtl_std_insp_rslt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getStdInspRsltTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_cnf_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_cnf_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBFL0050.Srch01")) {
			return new MS_MSBFL0050_Srch01Bridge();
		}
		if (id.equals("MS.MSBFL0050.Upd01")) {
			return new MS_MSBFL0050_Upd01Bridge();
		}
		if (id.equals("MS.MSBFL0050.Upd02")) {
			return new MS_MSBFL0050_Upd02Bridge();
		}
		if (id.equals("MS.MSBFL0050.Del01")) {
			return new MS_MSBFL0050_Del01Bridge();
		}
		if (id.equals("MS.MSBFL0050.Del02")) {
			return new MS_MSBFL0050_Del02Bridge();
		}
		if (id.equals("MS.MSBFL0050.Prnt01")) {
			return new MS_MSBFL0050_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBFL0050_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0050_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0050_Srch01;

		/** コンストラクタ */
		protected MS_MSBFL0050_Srch01Bridge() {
			p_MS_MSBFL0050_Srch01 = new MCParam(PDef.MS_MSBFL0050_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0050_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0050.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBF.MSBFP0050.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0050.DtlR.class));

			p_MS_MSBFL0050_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0050_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0050_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0050_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0050_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0050.CndR up0() {
			return (mcframe.clientMSBF.MSBFP0050.CndR)up(0);
		}

		protected mcframe.clientMSBF.MSBFP0050.HdrR down0() {
			return (mcframe.clientMSBF.MSBFP0050.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0050.DtlR> down1() {
			return (MCList<mcframe.clientMSBF.MSBFP0050.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0050_Srch01.addDownBlock(mcframe.clientMSBF.MSBFP0050.HdrR.create());
			p_MS_MSBFL0050_Srch01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0050.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0050_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBF.MSBFP0050.HdrR)p_MS_MSBFL0050_Srch01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBF.MSBFP0050.DtlR>)p_MS_MSBFL0050_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBFL0050_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0050_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0050_Upd01;

		/** コンストラクタ */
		protected MS_MSBFL0050_Upd01Bridge() {
			p_MS_MSBFL0050_Upd01 = new MCParam(PDef.MS_MSBFL0050_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0050_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0050.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0050.DtlR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBF.MSBFP0050.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0050.DtlR.class));

			p_MS_MSBFL0050_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0050_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0050_Upd01.addUpBlock(getHdrR());
			p_MS_MSBFL0050_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0050_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0050_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0050.HdrR up0() {
			return (mcframe.clientMSBF.MSBFP0050.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0050.DtlR> up1() {
			return (MCList<mcframe.clientMSBF.MSBFP0050.DtlR>)up(1);
		}

		protected mcframe.clientMSBF.MSBFP0050.HdrR down0() {
			return (mcframe.clientMSBF.MSBFP0050.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0050.DtlR> down1() {
			return (MCList<mcframe.clientMSBF.MSBFP0050.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0050_Upd01.addDownBlock(mcframe.clientMSBF.MSBFP0050.HdrR.create());
			p_MS_MSBFL0050_Upd01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0050.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0050_Upd01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBF.MSBFP0050.HdrR)p_MS_MSBFL0050_Upd01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBF.MSBFP0050.DtlR>)p_MS_MSBFL0050_Upd01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBFL0050_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0050_Upd02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0050_Upd02;

		/** コンストラクタ */
		protected MS_MSBFL0050_Upd02Bridge() {
			p_MS_MSBFL0050_Upd02 = new MCParam(PDef.MS_MSBFL0050_Upd02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0050_Upd02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0050.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0050.DtlR.class));
			// Down

			p_MS_MSBFL0050_Upd02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0050_Upd02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0050_Upd02.addUpBlock(getHdrR());
			p_MS_MSBFL0050_Upd02.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0050_Upd02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0050_Upd02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0050.HdrR up0() {
			return (mcframe.clientMSBF.MSBFP0050.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0050.DtlR> up1() {
			return (MCList<mcframe.clientMSBF.MSBFP0050.DtlR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBFL0050_Upd02;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MS_MSBFL0050_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0050_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0050_Del01;

		/** コンストラクタ */
		protected MS_MSBFL0050_Del01Bridge() {
			p_MS_MSBFL0050_Del01 = new MCParam(PDef.MS_MSBFL0050_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0050_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0050.HdrR.create());
			// Down

			p_MS_MSBFL0050_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0050_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0050_Del01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0050_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0050_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0050.HdrR up0() {
			return (mcframe.clientMSBF.MSBFP0050.HdrR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBFL0050_Del01;
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
	/**
	 * [MS_MSBFL0050_Del02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0050_Del02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0050_Del02;

		/** コンストラクタ */
		protected MS_MSBFL0050_Del02Bridge() {
			p_MS_MSBFL0050_Del02 = new MCParam(PDef.MS_MSBFL0050_Del02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0050_Del02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0050.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0050.DtlR.class));
			// Down

			p_MS_MSBFL0050_Del02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0050_Del02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0050_Del02.addUpBlock(getHdrR());
			p_MS_MSBFL0050_Del02.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0050_Del02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0050_Del02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0050.HdrR up0() {
			return (mcframe.clientMSBF.MSBFP0050.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0050.DtlR> up1() {
			return (MCList<mcframe.clientMSBF.MSBFP0050.DtlR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBFL0050_Del02;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MS_MSBFL0050_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0050_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0050_Prnt01;

		/** コンストラクタ */
		protected MS_MSBFL0050_Prnt01Bridge() {
			p_MS_MSBFL0050_Prnt01 = new MCParam(PDef.MS_MSBFL0050_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0050_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0050.HdrR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBF.MSBFP0050.HdrR.create());

			p_MS_MSBFL0050_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0050_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0050_Prnt01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0050_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0050_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0050.HdrR up0() {
			return (mcframe.clientMSBF.MSBFP0050.HdrR)up(0);
		}

		protected mcframe.clientMSBF.MSBFP0050.HdrR down0() {
			return (mcframe.clientMSBF.MSBFP0050.HdrR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0050_Prnt01.addDownBlock(mcframe.clientMSBF.MSBFP0050.HdrR.create());
		}
		protected MCParam param() {
			return p_MS_MSBFL0050_Prnt01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBF.MSBFP0050.HdrR)p_MS_MSBFL0050_Prnt01.getContainerParam().getDownBlock(0));
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
}