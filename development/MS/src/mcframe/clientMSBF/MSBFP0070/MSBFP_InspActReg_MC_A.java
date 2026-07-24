package mcframe.clientMSBF.MSBFP0070;

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
import mcframe.clientMSBF.MSBFP0070.MSBFP_InspActReg_MC.MS_MSBFL0070_Srch01Caller;
import mcframe.clientMSBF.MSBFP0070.MSBFP_InspActReg_MC.MS_MSBFL0070_Srch02Caller;
import mcframe.clientMSBF.MSBFP0070.MSBFP_InspActReg_MC.MS_MSBFL0070_Ins01Caller;
import mcframe.clientMSBF.MSBFP0070.MSBFP_InspActReg_MC.MS_MSBFL0070_Upd01Caller;
import mcframe.clientMSBF.MSBFP0070.MSBFP_InspActReg_MC.MS_MSBFL0070_Upd02Caller;
import mcframe.clientMSBF.MSBFP0070.MSBFP_InspActReg_MC.MS_MSBFL0070_Del01Caller;
import mcframe.clientMSBF.MSBFP0070.MSBFP_InspActReg_MC.MS_MSBFL0070_Del02Caller;
import mcframe.clientMSBF.MSBFP0070.MSBFP_InspActReg_MC.MS_MSBFL0070_Prnt01Caller;

/**
 * 画面"MSBFP_InspActReg"パネルクラスです。<p>
 *
 * 単票形式での検査実績の登録画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFP_InspActReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBFP0070";

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
	 * INS,Create,0;UPD,Modify,1;JUDG,Judge,2;DEL,Cancel,3;REF,View,4 INS,登録する,0;UPD,訂正する,1;JUDG,判定する,2;DEL,取り消す,3;REF,参照する,4.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_JUDG = null;
	public MCRadioButton Cnd_ope_DEL = null;
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
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Hdr_itm_p_PPanel;
	public MCTextField Hdr_itm_cd;	// [Hdr]の[itm_p.itm_cd]を[Hdr_itm_cd]としてエイリアス定義。
	public MCTextComboBox Hdr_itm_sub1;	// [Hdr]の[itm_p.itm_sub1]を[Hdr_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Hdr_itm_sub2;	// [Hdr]の[itm_p.itm_sub2]を[Hdr_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Hdr_itm_sub3;	// [Hdr]の[itm_p.itm_sub3]を[Hdr_itm_sub3]としてエイリアス定義。
	public MCTextField Hdr_itm_nm;	// [Hdr]の[itm_p.itm_nm]を[Hdr_itm_nm]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H Hdr_lot_no_p_PPanel;
	public MCTextField Hdr_lot_no;	// [Hdr]の[lot_no_p.lot_no]を[Hdr_lot_no]としてエイリアス定義。
	public MCTextComboBox Hdr_sublot_no;	// [Hdr]の[lot_no_p.sublot_no]を[Hdr_sublot_no]としてエイリアス定義。
	public MCLabel Hdr_ver_no_Label = null;
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public MCTextComboBox Hdr_ver_no = null;
	public MCLabel Hdr_insp_no_Label = null;
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_insp_no = null;
	public MCLabel Hdr_insp_act_no_Label = null;
	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_insp_act_no = null;
	public MCLabel Hdr_insp_freq_Label = null;
	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public MCNumberField Hdr_insp_freq = null;
	public MCLabel Hdr_insp_mtd_typ_Label = null;
	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public MCTextField Hdr_insp_mtd_typ = null;
	/**
	 * Inspection method type name 検査方法区分名.<p>
	 *
	 */
	public MCTextField Hdr_insp_mtd_typ_nm = null;
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
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H Hdr_inst_pack_unit_qty_p_PPanel;
	public MCNumberField Hdr_inst_pack_unit_qty;	// [Hdr]の[inst_pack_unit_qty_p.qty]を[Hdr_inst_pack_unit_qty]としてエイリアス定義。
	public MCLabel Hdr_pack_unit_cd_Label = null;
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_pack_unit_cd = null;
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public MCTextField Hdr_pack_unit_nm = null;
	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_pack_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H Hdr_inst_base_unit_qty_p_PPanel;
	public MCNumberField Hdr_inst_base_unit_qty;	// [Hdr]の[inst_base_unit_qty_p.qty]を[Hdr_inst_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H Hdr_rem_base_unit_qty_p_PPanel;
	public MCNumberField Hdr_rem_base_unit_qty;	// [Hdr]の[rem_base_unit_qty_p.qty]を[Hdr_rem_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H Hdr_good_qty_p_PPanel;
	public MCNumberField Hdr_good_qty;	// [Hdr]の[good_qty_p.qty]を[Hdr_good_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H Hdr_dfct_qty_p_PPanel;
	public MCNumberField Hdr_dfct_qty;	// [Hdr]の[dfct_qty_p.qty]を[Hdr_dfct_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H Hdr_act_ttl_qty_p_PPanel;
	public MCNumberField Hdr_act_ttl_qty;	// [Hdr]の[act_ttl_qty_p.qty]を[Hdr_act_ttl_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H Hdr_smpl_inst_qty_p_PPanel;
	public MCNumberField Hdr_smpl_inst_qty;	// [Hdr]の[smpl_inst_qty_p.qty]を[Hdr_smpl_inst_qty]としてエイリアス定義。
	public MCLabel Hdr_smpl_inst_unit_cd_Label = null;
	/**
	 * Sampling order qty. unit cd. 抜取指図数単位ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_smpl_inst_unit_cd = null;
	/**
	 * Sampling order qty. unit name 抜取指図数単位名.<p>
	 *
	 */
	public MCTextField Hdr_smpl_inst_unit_nm = null;
	/**
	 * Sampling order qty. unit number of decimal places 抜取指図数単位小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_smpl_inst_unit_dec_place = null;
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
	public MCNumberField Hdr_base_unit_dec_place = null;
	public MCLabel Hdr_base_unit_rnd_typ_Label = null;
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCTextField Hdr_base_unit_rnd_typ = null;
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
	public MCLabel Hdr_bp_lot_no_Label = null;
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_bp_lot_no = null;
	/**
	 * For specific inspection 規格検査対象.<p>
	 *
	 */
	public MCCheckBox Hdr_std_insp_flg = null;
	/**
	 * Specific inspection required 規格検査必須.<p>
	 *
	 */
	public MCCheckBox Hdr_std_req_flg = null;
	/**
	 * Specific inspection confirmation required 規格検査確認必須.<p>
	 *
	 */
	public MCCheckBox Hdr_std_cnf_req_flg = null;
	/**
	 * Specific inspection input 規格検査入力済.<p>
	 *
	 */
	public MCCheckBox Hdr_std_cmpl_flg = null;
	/**
	 * Specific inspection confirmed 規格検査確認済.<p>
	 *
	 */
	public MCCheckBox Hdr_std_cnf_cmpl_flg = null;
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
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H Hdr_st_dt_p_PPanel;
	public MCDateField Hdr_st_dt;	// [Hdr]の[st_dt_p.ymd]を[Hdr_st_dt]としてエイリアス定義。
	public MCDateField Hdr_st_hm;	// [Hdr]の[st_dt_p.hm]を[Hdr_st_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H Hdr_end_dt_p_PPanel;
	public MCDateField Hdr_end_dt;	// [Hdr]の[end_dt_p.ymd]を[Hdr_end_dt]としてエイリアス定義。
	public MCDateField Hdr_end_hm;	// [Hdr]の[end_dt_p.hm]を[Hdr_end_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H Hdr_act_usr_dpt_p_PPanel;
	public MCTextField Hdr_act_usr_cd;	// [Hdr]の[act_usr_dpt_p.usr_cd]を[Hdr_act_usr_cd]としてエイリアス定義。
	public MCTextField Hdr_act_usr_nm;	// [Hdr]の[act_usr_dpt_p.usr_nm]を[Hdr_act_usr_nm]としてエイリアス定義。
	public MCTextComboBox Hdr_act_dpt_cd;	// [Hdr]の[act_usr_dpt_p.dpt_cd]を[Hdr_act_dpt_cd]としてエイリアス定義。
	public MCTextField Hdr_act_dpt_nm;	// [Hdr]の[act_usr_dpt_p.dpt_nm]を[Hdr_act_dpt_nm]としてエイリアス定義。
	public MCLabel Hdr_quality_typ_Label = null;
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_quality_typ = null;
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public MCTextField Hdr_quality_typ_nm = null;
	public MCLabel Hdr_gd_cd_Label = null;
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCTextField Hdr_gd_nm = null;
	public MCLabel Hdr_dfct_rsn_cd_Label = null;
	/**
	 * Defective reason cd. 不良理由ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_dfct_rsn_cd = null;
	/**
	 * Defective reason name 不良理由名.<p>
	 *
	 */
	public MCTextField Hdr_dfct_rsn_nm = null;
	public mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H Hdr_std_cont_fctrt_p_PPanel;
	public MCNumberField Hdr_std_cont_fctr;	// [Hdr]の[std_cont_fctrt_p.std_cont_fctr]を[Hdr_std_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H Hdr_act_cont_fctr_p_PPanel;
	public MCNumberField Hdr_act_cont_fctr;	// [Hdr]の[act_cont_fctr_p.act_cont_fctr]を[Hdr_act_cont_fctr]としてエイリアス定義。
	/**
	 * Expiration date update 有効期限更新.<p>
	 *
	 */
	public MCCheckBox Hdr_vld_dt_upd_flg = null;
	public MCLabel Hdr_vld_pd_Label = null;
	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public MCNumberField Hdr_vld_pd = null;
	public MCLabel Hdr_lmt_pd_Label = null;
	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public MCNumberField Hdr_lmt_pd = null;
	public MCLabel Hdr_calc_pd_typ_Label = null;
	/**
	 * Period calculation type 期間計算区分.<p>
	 *
	 */
	public MCTextField Hdr_calc_pd_typ = null;
	/**
	 * Period calculation type name 期間計算区分名.<p>
	 *
	 */
	public MCTextField Hdr_calc_pd_typ_nm = null;
	public MCLabel Hdr_lmt_dt_frm_typ_Label = null;
	/**
	 * Expiration base date type 期限起算日区分.<p>
	 *
	 */
	public MCTextField Hdr_lmt_dt_frm_typ = null;
	/**
	 * Expiration base date type name 期限起算日区分名.<p>
	 *
	 */
	public MCTextField Hdr_lmt_dt_frm_typ_nm = null;
	public MCLabel Hdr_lmt_ctl_categ_Label = null;
	/**
	 * Expiration management type 期限管理種別.<p>
	 *
	 */
	public MCTextField Hdr_lmt_ctl_categ = null;
	public MCLabel Hdr_lmt_dt_frm_Label = null;
	/**
	 * Base date 起算日.<p>
	 *
	 */
	public MCDateField Hdr_lmt_dt_frm = null;
	public MCLabel Hdr_vld_dt_now_Label = null;
	/**
	 * Current expiration date 現有効期限.<p>
	 *
	 */
	public MCDateField Hdr_vld_dt_now = null;
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
	public MCLabel Hdr_intr_rmrks_Label = null;
	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public MCTextField Hdr_intr_rmrks = null;
	public MCLabel Hdr_lot_rmrks_Label = null;
	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public MCTextField Hdr_lot_rmrks = null;
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
	/**
	 * LIMS ＬＩＭＳ.<p>
	 *
	 */
	public MCCheckBox Hdr_lims_flg = null;
	public MCLabel Hdr_ext_sys_cd_Label = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_ext_sys_cd = null;
	public MCLabel Hdr_ext_sys_nm_Label = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCTextField Hdr_ext_sys_nm = null;
	public MCLabel Hdr_ext_insp_act_no_Label = null;
	/**
	 * External inspection result No. 外部検査実績ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_ext_insp_act_no = null;
	public MCLabel Hdr_insp_aprv_sts_typ_Label = null;
	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public MCTextField Hdr_insp_aprv_sts_typ = null;
	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public MCTextField Hdr_insp_aprv_sts_typ_nm = null;
	public MCLabel Hdr_insp_judg_rslt_typ_Label = null;
	/**
	 * Decision result 判定結果.<p>
	 *
	 */
	public MCTextComboBox Hdr_insp_judg_rslt_typ = null;
	/**
	 * Decision result name 判定結果名.<p>
	 *
	 */
	public MCTextField Hdr_insp_judg_rslt_typ_nm = null;
	public MCLabel Hdr_judg_dt_Label = null;
	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public MCDateField Hdr_judg_dt = null;
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H Hdr_judg_ttl_qty_p_PPanel;
	public MCNumberField Hdr_judg_ttl_qty;	// [Hdr]の[judg_ttl_qty_p.qty]を[Hdr_judg_ttl_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H Hdr_judg_usr_dpt_p_PPanel;
	public MCTextField Hdr_judg_usr_cd;	// [Hdr]の[judg_usr_dpt_p.usr_cd]を[Hdr_judg_usr_cd]としてエイリアス定義。
	public MCTextField Hdr_judg_usr_nm;	// [Hdr]の[judg_usr_dpt_p.usr_nm]を[Hdr_judg_usr_nm]としてエイリアス定義。
	public MCTextComboBox Hdr_judg_dpt_cd;	// [Hdr]の[judg_usr_dpt_p.dpt_cd]を[Hdr_judg_dpt_cd]としてエイリアス定義。
	public MCTextField Hdr_judg_dpt_nm;	// [Hdr]の[judg_usr_dpt_p.dpt_nm]を[Hdr_judg_dpt_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H Hdr_judg_rsn_p_PPanel;
	public MCTextComboBox Hdr_judg_rsn;	// [Hdr]の[judg_rsn_p.txt]を[Hdr_judg_rsn]としてエイリアス定義。
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
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCCheckBox Hdr_cont_fctr_flg = null;
	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_insp_ptn_cd = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_site_cd = null;
	// [SystemInfo]ブロック関連のField定義
	public MCPanel SystemInfoPanel = null;
	// [SystemInfo]ブロックの項目のField定義
	// [Judg]ブロック関連のField定義
	public MCPanel JudgPanel = null;
	// [Judg]ブロックの項目のField定義
	// [JudgItm]ブロック関連のField定義
	public MCPanel JudgItmPanel = null;
	// [JudgItm]ブロックの項目のField定義
	// [JudgBtn]ブロック関連のField定義
	public MCPanel JudgBtnPanel = null;
	// [JudgBtn]ブロックの項目のField定義
	// [JudgEastBtn]ブロック関連のField定義
	public MCPanel JudgEastBtnPanel = null;
	// [JudgEastBtn]ブロックの項目のField定義
	// [Dtl1]ブロック関連のField定義
	public MCPanel Dtl1Panel = null;
	// [Dtl1]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBF.MSBFP0070.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_cd = null;
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_sub1 = null;
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_sub2 = null;
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_sub3 = null;
	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_cd = null;
	/**
	 * Inventory location cd. 在庫場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_cd = null;
	/**
	 * Inventory location name 在庫場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_nm = null;
	/**
	 * For inventory rack/line 在庫棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_str_ln_tgt_flg = null;
	/**
	 * Inventory rack/line cd. 在庫棚・ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_str_ln_cd = null;
	/**
	 * Inventory rack/line name 在庫棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_str_ln_nm = null;
	/**
	 * Without Inventory rack/line 在庫棚・ライン無.<p>
	 *
	 */
	public MCColumnConfig columnDtl_str_ln_cd_none_flg = null;
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_arrv_bp_cd = null;
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_arrv_bp_nm = null;
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_quality_typ = null;
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_quality_typ_nm = null;
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gd_nm = null;
	/**
	 * Defective reason cd. 不良理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dfct_rsn_cd = null;
	/**
	 * Defective reason name 不良理由名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dfct_rsn_nm = null;
	public mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D Dtl_ac_dt_p_PPanel;
	public MCColumnConfig columnDtl_ac_dt;// [Dtl]の[ac_dt_p.ac_dt]を[columnDtl_ac_dt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D Dtl_can_ac_dt_p_PPanel;
	public MCColumnConfig columnDtl_can_ac_dt_for_input;// [Dtl]の[can_ac_dt_p.can_ac_dt_for_input]を[columnDtl_can_ac_dt_for_input]としてエイリアス定義。
	public MCColumnConfig columnDtl_can_ac_dt;// [Dtl]の[can_ac_dt_p.can_ac_dt_for_call]を[columnDtl_can_ac_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_ac_dt_after_srch;// [Dtl]の[can_ac_dt_p.ac_dt_after_srch]を[columnDtl_ac_dt_after_srch]としてエイリアス定義。
	/**
	 * Base 基準.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_flg = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_pack_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_pack_unit_qty;// [Dtl]の[pack_unit_qty_p.qty]を[columnDtl_pack_unit_qty]としてエイリアス定義。
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pack_unit_cd = null;
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pack_unit_nm = null;
	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pack_unit_dec_place = null;
	/**
	 * SKU base qty. 荷姿基準数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pack_unit_dmn_qty = null;
	/**
	 * SKU conversion qty. 荷姿換算数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pack_unit_conv_qty = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_base_unit_qty;// [Dtl]の[base_unit_qty_p.qty]を[columnDtl_base_unit_qty]としてエイリアス定義。
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_dec_place = null;
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_stk_pack_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_stk_pack_unit_qty;// [Dtl]の[stk_pack_unit_qty_p.qty]を[columnDtl_stk_pack_unit_qty]としてエイリアス定義。
	/**
	 * Inventory unit cd. (SKU) 在庫単位（荷）ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_pack_unit_cd = null;
	/**
	 * Inventory unit name (SKU) 在庫単位名（荷）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_pack_unit_nm = null;
	/**
	 * Inventory SKU number of decimal places 在庫荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_pack_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_stk_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_stk_base_unit_qty;// [Dtl]の[stk_base_unit_qty_p.qty]を[columnDtl_stk_base_unit_qty]としてエイリアス定義。
	/**
	 * Inventory unit cd. (Base unit) 在庫単位（基）ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_base_unit_cd = null;
	/**
	 * Inventory unit name (Base unit) 在庫単位名（基）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_base_unit_nm = null;
	/**
	 * Inventory base unit number of decimal places 在庫基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_base_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_pack_xfr_pack_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_pack_xfr_pack_unit_qty;// [Dtl]の[pack_xfr_pack_unit_qty_p.qty]を[columnDtl_pack_xfr_pack_unit_qty]としてエイリアス定義。
	/**
	 * SKU transfer unit (SKU) cd. 荷姿振替単位（荷）ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pack_xfr_pack_unit_cd = null;
	/**
	 * SKU transfer unit name (SKU) 荷姿振替単位名（荷）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pack_xfr_pack_unit_nm = null;
	/**
	 * SKU transfer unit number of decimal places 荷姿振替単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pack_xfr_pack_unit_dec_place = null;
	/**
	 * SKU transfer SKU base qty. 荷姿振替荷姿基準数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pack_xfr_pack_unit_dmn_qty = null;
	/**
	 * SKU transfer SKU conversion qty. 荷姿振替荷姿換算数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pack_xfr_pack_unit_conv_qty = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_pack_xfr_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_pack_xfr_base_unit_qty;// [Dtl]の[pack_xfr_base_unit_qty_p.qty]を[columnDtl_pack_xfr_base_unit_qty]としてエイリアス定義。
	/**
	 * SKU transfer unit (Base) cd. 荷姿振替単位（基）ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pack_xfr_base_unit_cd = null;
	/**
	 * SKU transfer unit name (Base) 荷姿振替単位名（基）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pack_xfr_base_unit_nm = null;
	/**
	 * SKU transfer base unit number of decimal places 荷姿振替基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pack_xfr_base_unit_dec_place = null;
	/**
	 * SKU transfer base unit rounding type 荷姿振替基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pack_xfr_base_unit_rnd_typ = null;
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_insp_typ = null;
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_insp_typ_nm = null;
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_id_typ = null;
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_id_typ_nm = null;
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_bp_cd = null;
	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_bp_nm = null;
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Dtl_sno_p_PPanel;
	public MCColumnConfig columnDtl_sno1;// [Dtl]の[sno_p.sno1]を[columnDtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2;// [Dtl]の[sno_p.sno2]を[columnDtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3;// [Dtl]の[sno_p.sno3]を[columnDtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4;// [Dtl]の[sno_p.sno4]を[columnDtl_sno4]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D Dtl_wrk_no_p_PPanel;
	public MCColumnConfig columnDtl_wrk_no;// [Dtl]の[wrk_no_p.wrk_no]を[columnDtl_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_nm;// [Dtl]の[wrk_no_p.wrk_nm]を[columnDtl_wrk_nm]としてエイリアス定義。
	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fix_no_typ = null;
	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fix_no_typ_nm = null;
	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fix_no = null;
	/**
	 * Inspection result details No. 検査実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_insp_act_d_no = null;
	/**
	 * Inspection decision details No. 検査判定明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_insp_judg_d_no = null;
	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_insp_act_no = null;
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_insp_no = null;
	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_intr_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char3 = null;
	/**
	 * LIMS ＬＩＭＳ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lims_flg = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_sys_cd = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_sys_nm = null;
	/**
	 * External inspection result details No. 外部検査実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_insp_act_d_no = null;
	// [DtlBtn]ブロック関連のField定義
	public MCPanel DtlBtnPanel = null;
	// [DtlBtn]ブロックの項目のField定義
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton DtlBtn_rcopy = null;
	// [Dtl2]ブロック関連のField定義
	public MCPanel Dtl2Panel = null;
	// [Dtl2]ブロックの項目のField定義
	// [Smpl]ブロック関連のField定義
	public MCPanel SmplPanel = null;
	public MCScrollPane SmplScrollPane = null;
	public MCTable2<mcframe.clientMSBF.MSBFP0070.SmplR> SmplTable = null;
	// [Smpl]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Smpl_so_qty_p_PPanel;
	public MCColumnConfig columnSmpl_so_qty;// [Smpl]の[so_qty_p.qty]を[columnSmpl_so_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Smpl_smpl_qty_p_PPanel;
	public MCColumnConfig columnSmpl_smpl_qty;// [Smpl]の[smpl_qty_p.qty]を[columnSmpl_smpl_qty]としてエイリアス定義。
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_base_unit_dec_place = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_base_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Smpl_pack_xfr_pack_unit_qty_p_PPanel;
	public MCColumnConfig columnSmpl_pack_xfr_pack_unit_qty;// [Smpl]の[pack_xfr_pack_unit_qty_p.qty]を[columnSmpl_pack_xfr_pack_unit_qty]としてエイリアス定義。
	/**
	 * SKU transfer packing unit cd. 荷姿振替荷姿単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_pack_xfr_pack_unit_cd = null;
	/**
	 * SKU transfer SKU name 荷姿振替荷姿単位名.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_pack_xfr_pack_unit_nm = null;
	/**
	 * SKU transfer SKU number of decimal places 荷姿振替荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_pack_xfr_pack_unit_dec_place = null;
	/**
	 * SKU transfer SKU base qty. 荷姿振替荷姿基準数量.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_pack_xfr_pack_unit_dmn_qty = null;
	/**
	 * SKU transfer SKU conversion qty. 荷姿振替荷姿換算数量.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_pack_xfr_pack_unit_conv_qty = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Smpl_pack_xfr_base_unit_qty_p_PPanel;
	public MCColumnConfig columnSmpl_pack_xfr_base_unit_qty;// [Smpl]の[pack_xfr_base_unit_qty_p.qty]を[columnSmpl_pack_xfr_base_unit_qty]としてエイリアス定義。
	/**
	 * SKU transfer base unit cd. 荷姿振替基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_pack_xfr_base_unit_cd = null;
	/**
	 * SKU transfer base unit name 荷姿振替基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_pack_xfr_base_unit_nm = null;
	/**
	 * SKU transfer base unit number of decimal places 荷姿振替基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_pack_xfr_base_unit_dec_place = null;
	/**
	 * SKU transfer base unit rounding type 荷姿振替基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_pack_xfr_base_unit_rnd_typ = null;
	/**
	 * Deduction completed 引落完了.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_so_cmpl_flg = null;
	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_wg_cd = null;
	/**
	 * Sampling location cd. 抜取元場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_loc_cd = null;
	/**
	 * Sampling location name 抜取元場所名.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_loc_nm = null;
	/**
	 * For sampling rack/line 抜取元棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_str_ln_tgt_flg = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Smpl_str_ln_p_PPanel;
	public MCColumnConfig columnSmpl_str_ln_cd;// [Smpl]の[str_ln_p.str_ln_cd]を[columnSmpl_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnSmpl_str_ln_nm;// [Smpl]の[str_ln_p.str_ln_nm]を[columnSmpl_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnSmpl_str_ln_cd_none_flg;// [Smpl]の[str_ln_p.str_ln_cd_none_flg]を[columnSmpl_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_stk_arrv_bp_cd = null;
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_stk_arrv_bp_nm = null;
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_gd_nm = null;
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_quality_typ = null;
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_quality_typ_nm = null;
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_stk_insp_typ = null;
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_stk_insp_typ_nm = null;
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_stk_id_typ = null;
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_stk_id_typ_nm = null;
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_stk_bp_cd = null;
	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_stk_bp_nm = null;
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Smpl_sno_p_PPanel;
	public MCColumnConfig columnSmpl_sno1;// [Smpl]の[sno_p.sno1]を[columnSmpl_sno1]としてエイリアス定義。
	public MCColumnConfig columnSmpl_sno2;// [Smpl]の[sno_p.sno2]を[columnSmpl_sno2]としてエイリアス定義。
	public MCColumnConfig columnSmpl_sno3;// [Smpl]の[sno_p.sno3]を[columnSmpl_sno3]としてエイリアス定義。
	public MCColumnConfig columnSmpl_sno4;// [Smpl]の[sno_p.sno4]を[columnSmpl_sno4]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D Smpl_wrk_no_p_PPanel;
	public MCColumnConfig columnSmpl_wrk_no;// [Smpl]の[wrk_no_p.wrk_no]を[columnSmpl_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnSmpl_wrk_nm;// [Smpl]の[wrk_no_p.wrk_nm]を[columnSmpl_wrk_nm]としてエイリアス定義。
	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_fix_no_typ = null;
	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_fix_no_typ_nm = null;
	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_fix_no = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Smpl_act_dt_p_PPanel;
	public MCColumnConfig columnSmpl_act_dt;// [Smpl]の[act_dt_p.ymd]を[columnSmpl_act_dt]としてエイリアス定義。
	public MCColumnConfig columnSmpl_act_hm;// [Smpl]の[act_dt_p.hm]を[columnSmpl_act_hm]としてエイリアス定義。
	/**
	 * Sampling recording date 抜取計上日.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_ac_dt = null;
	public mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D Smpl_can_ac_dt_p_PPanel;
	public MCColumnConfig columnSmpl_can_ac_dt_for_input;// [Smpl]の[can_ac_dt_p.can_ac_dt_for_input]を[columnSmpl_can_ac_dt_for_input]としてエイリアス定義。
	public MCColumnConfig columnSmpl_can_ac_dt;// [Smpl]の[can_ac_dt_p.can_ac_dt_for_call]を[columnSmpl_can_ac_dt]としてエイリアス定義。
	public MCColumnConfig columnSmpl_ac_dt_after_srch;// [Smpl]の[can_ac_dt_p.ac_dt_after_srch]を[columnSmpl_ac_dt_after_srch]としてエイリアス定義。
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_bd_dpt_cd = null;
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_bd_dpt_nm = null;
	/**
	 * Sampling inspection result No. 検査抜取実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_insp_smpl_act_no = null;
	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_insp_schd_no = null;
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_insp_no = null;
	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_insp_act_no = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_trd_rmrks = null;
	/**
	 * Sampling internal remarks 抜取内部備考.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_intr_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_sub_char3 = null;
	/**
	 * Item 品目.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_itm_cd = null;
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_itm_sub1 = null;
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_itm_sub2 = null;
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_itm_sub3 = null;
	/**
	 * LIMS ＬＩＭＳ.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_lims_flg = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_ext_sys_cd = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_ext_sys_nm = null;
	/**
	 * External inspection sampling result No. 外部検査抜取実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSmpl_ext_insp_smpl_act_no = null;
	// [SmplBtn]ブロック関連のField定義
	public MCPanel SmplBtnPanel = null;
	// [SmplBtn]ブロックの項目のField定義
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton SmplBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton SmplBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton SmplBtn_rcopy = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Specific inspection result 規格検査実績.<p>
	 *
	 */
	public MCButton Btn_open_MSBFP0050 = null;
	/**
	 * Inspection report 検査成績書.<p>
	 *
	 */
	public MCButton Btn_prnt = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_act_ins = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_act_upd = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_act_del = null;
	/**
	 * Decision 判定する.<p>
	 *
	 */
	public MCButton Btn_judg_upd = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_judg_del = null;
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
	/** [JUDG]モードを表す定数 */
	public static final String JUDG = "JUDG";
	/** [FIX_J]モードを表す定数 */
	public static final String FIX_J = "FIX_J";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [FIX_D]モードを表す定数 */
	public static final String FIX_D = "FIX_D";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, INS, FIX_I, UPD, FIX_U, JUDG, FIX_J, DEL, FIX_D, REF};
	
	/** [MS_MSBFL0070_Srch01]のCallerの作成 */
	protected MSBFP_InspActReg_MC.MS_MSBFL0070_Srch01Caller createMS_MSBFL0070_Srch01() {
		MSBFP_InspActReg_MC.MS_MSBFL0070_Srch01Caller<MSBFP_InspActReg, MS_MSBFL0070_Srch01Bridge>
		caller = ((MSBFP_InspActReg_MC)this).new MS_MSBFL0070_Srch01Caller<MSBFP_InspActReg, MS_MSBFL0070_Srch01Bridge>(
					(MSBFP_InspActReg)this, new MS_MSBFL0070_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBFL0070_Srch01]の呼び出し */
	protected void callMS_MSBFL0070_Srch01() {
		MCCaller caller = createMS_MSBFL0070_Srch01();
		caller.exec();
	}
	/** [MS_MSBFL0070_Srch02]のCallerの作成 */
	protected MSBFP_InspActReg_MC.MS_MSBFL0070_Srch02Caller createMS_MSBFL0070_Srch02() {
		MSBFP_InspActReg_MC.MS_MSBFL0070_Srch02Caller<MSBFP_InspActReg, MS_MSBFL0070_Srch02Bridge>
		caller = ((MSBFP_InspActReg_MC)this).new MS_MSBFL0070_Srch02Caller<MSBFP_InspActReg, MS_MSBFL0070_Srch02Bridge>(
					(MSBFP_InspActReg)this, new MS_MSBFL0070_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBFL0070_Srch02]の呼び出し */
	protected void callMS_MSBFL0070_Srch02() {
		MCCaller caller = createMS_MSBFL0070_Srch02();
		caller.exec();
	}
	/** [MS_MSBFL0070_Ins01]のCallerの作成 */
	protected MSBFP_InspActReg_MC.MS_MSBFL0070_Ins01Caller createMS_MSBFL0070_Ins01() {
		MSBFP_InspActReg_MC.MS_MSBFL0070_Ins01Caller<MSBFP_InspActReg, MS_MSBFL0070_Ins01Bridge>
		caller = ((MSBFP_InspActReg_MC)this).new MS_MSBFL0070_Ins01Caller<MSBFP_InspActReg, MS_MSBFL0070_Ins01Bridge>(
					(MSBFP_InspActReg)this, new MS_MSBFL0070_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBFL0070_Ins01]の呼び出し */
	protected void callMS_MSBFL0070_Ins01() {
		MCCaller caller = createMS_MSBFL0070_Ins01();
		caller.exec();
	}
	/** [MS_MSBFL0070_Upd01]のCallerの作成 */
	protected MSBFP_InspActReg_MC.MS_MSBFL0070_Upd01Caller createMS_MSBFL0070_Upd01() {
		MSBFP_InspActReg_MC.MS_MSBFL0070_Upd01Caller<MSBFP_InspActReg, MS_MSBFL0070_Upd01Bridge>
		caller = ((MSBFP_InspActReg_MC)this).new MS_MSBFL0070_Upd01Caller<MSBFP_InspActReg, MS_MSBFL0070_Upd01Bridge>(
					(MSBFP_InspActReg)this, new MS_MSBFL0070_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBFL0070_Upd01]の呼び出し */
	protected void callMS_MSBFL0070_Upd01() {
		MCCaller caller = createMS_MSBFL0070_Upd01();
		caller.exec();
	}
	/** [MS_MSBFL0070_Upd02]のCallerの作成 */
	protected MSBFP_InspActReg_MC.MS_MSBFL0070_Upd02Caller createMS_MSBFL0070_Upd02() {
		MSBFP_InspActReg_MC.MS_MSBFL0070_Upd02Caller<MSBFP_InspActReg, MS_MSBFL0070_Upd02Bridge>
		caller = ((MSBFP_InspActReg_MC)this).new MS_MSBFL0070_Upd02Caller<MSBFP_InspActReg, MS_MSBFL0070_Upd02Bridge>(
					(MSBFP_InspActReg)this, new MS_MSBFL0070_Upd02Bridge());
		return caller;
	}
	/** [MS_MSBFL0070_Upd02]の呼び出し */
	protected void callMS_MSBFL0070_Upd02() {
		MCCaller caller = createMS_MSBFL0070_Upd02();
		caller.exec();
	}
	/** [MS_MSBFL0070_Del01]のCallerの作成 */
	protected MSBFP_InspActReg_MC.MS_MSBFL0070_Del01Caller createMS_MSBFL0070_Del01() {
		MSBFP_InspActReg_MC.MS_MSBFL0070_Del01Caller<MSBFP_InspActReg, MS_MSBFL0070_Del01Bridge>
		caller = ((MSBFP_InspActReg_MC)this).new MS_MSBFL0070_Del01Caller<MSBFP_InspActReg, MS_MSBFL0070_Del01Bridge>(
					(MSBFP_InspActReg)this, new MS_MSBFL0070_Del01Bridge());
		return caller;
	}
	/** [MS_MSBFL0070_Del01]の呼び出し */
	protected void callMS_MSBFL0070_Del01() {
		MCCaller caller = createMS_MSBFL0070_Del01();
		caller.exec();
	}
	/** [MS_MSBFL0070_Del02]のCallerの作成 */
	protected MSBFP_InspActReg_MC.MS_MSBFL0070_Del02Caller createMS_MSBFL0070_Del02() {
		MSBFP_InspActReg_MC.MS_MSBFL0070_Del02Caller<MSBFP_InspActReg, MS_MSBFL0070_Del02Bridge>
		caller = ((MSBFP_InspActReg_MC)this).new MS_MSBFL0070_Del02Caller<MSBFP_InspActReg, MS_MSBFL0070_Del02Bridge>(
					(MSBFP_InspActReg)this, new MS_MSBFL0070_Del02Bridge());
		return caller;
	}
	/** [MS_MSBFL0070_Del02]の呼び出し */
	protected void callMS_MSBFL0070_Del02() {
		MCCaller caller = createMS_MSBFL0070_Del02();
		caller.exec();
	}
	/** [MS_MSBFL0070_Prnt01]のCallerの作成 */
	protected MSBFP_InspActReg_MC.MS_MSBFL0070_Prnt01Caller createMS_MSBFL0070_Prnt01() {
		MSBFP_InspActReg_MC.MS_MSBFL0070_Prnt01Caller<MSBFP_InspActReg, MS_MSBFL0070_Prnt01Bridge>
		caller = ((MSBFP_InspActReg_MC)this).new MS_MSBFL0070_Prnt01Caller<MSBFP_InspActReg, MS_MSBFL0070_Prnt01Bridge>(
					(MSBFP_InspActReg)this, new MS_MSBFL0070_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBFL0070_Prnt01]の呼び出し */
	protected void callMS_MSBFL0070_Prnt01() {
		MCCaller caller = createMS_MSBFL0070_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0070.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0070.HdrR aHdrR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBF.MSBFP0070.DtlR> aDtlL;
	/** [Smpl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBF.MSBFP0070.SmplR> aSmplL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBF.MSBFP0070.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBF.MSBFP0070.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBF.MSBFP0070.CndR createCndR() {
		return mcframe.clientMSBF.MSBFP0070.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBF.MSBFP0070.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBF.MSBFP0070.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBF.MSBFP0070.HdrR createHdrR() {
		return mcframe.clientMSBF.MSBFP0070.HdrR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBF.MSBFP0070.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0070.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBF.MSBFP0070.DtlR createDtlR() {
		return mcframe.clientMSBF.MSBFP0070.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0070.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBF.MSBFP0070.DtlR.class);
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
	 * コピーによってaSmplLを設定します。
	 *
	 * aSmplLのインスタンスは変更されません。
	 *
	 * @param dataset SmplL
	 */
	public void setSmplL(MCList<mcframe.clientMSBF.MSBFP0070.SmplR> aList) {
		if (getSmplL() != aList) {
			getSmplL().setAll(aList);
		}
	}

	/**
	 * [Smpl]ブロックのコンテナaSmplLを返します。
	 *
	 * @return SmplL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0070.SmplR> getSmplL() {
		return aSmplL;
	}

	/**
	 * aSmplRを作成します。
	 *
	 * @return SmplR
	 */
	public mcframe.clientMSBF.MSBFP0070.SmplR createSmplR() {
		return mcframe.clientMSBF.MSBFP0070.SmplR.create();
	}

	/**
	 * aSmplLを作成します。
	 *
	 * @return SmplL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0070.SmplR> createSmplL() {
		return MCList.create(mcframe.clientMSBF.MSBFP0070.SmplR.class);
	}

	/**
	 * SmplTableを初期化します。
	 */
	protected void createSmplTable(){
		if(SmplTable == null){
			SmplTable = beansFactory.createTable2("Smpl.table");
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
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getSmplL())) ret.add(getSmplL());
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
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getSmplL()) return "Smpl";
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
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("Smpl")) return getSmplL();
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
		ret.add(JudgPanel);
		ret.add(JudgItmPanel);
		ret.add(JudgBtnPanel);
		ret.add(JudgEastBtnPanel);
		ret.add(Dtl1Panel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		ret.add(Dtl2Panel);
		ret.add(SmplPanel);
		ret.add(SmplBtnPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBFP_InspActReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();
		aSmplL = createSmplL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBFP_InspActReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aSmplL = createSmplL();
		createSmplTable();
		SmplTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBFP_InspActReg_MC.jbCreateScreenOpe((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbCreateCnd((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbCreateHdrTab((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbCreateHdr((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbCreateSystemInfo((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbCreateJudg((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbCreateJudgItm((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbCreateJudgBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbCreateJudgEastBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbCreateDtl1((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbCreateDtl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbCreateDtlBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbCreateDtl2((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbCreateSmpl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbCreateSmplBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbCreateBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbCreateEastBtn((MSBFP_InspActReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBFP_InspActReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBFP_InspActReg p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBFP_InspActReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBFP_InspActReg p) {
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
		p.Hdr_inst_pack_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getHdrR().inst_pack_unit_qty_p());
		p.Hdr_inst_pack_unit_qty_p_PPanel.setName("Hdr.inst_pack_unit_qty_p");
		p.Hdr_inst_pack_unit_qty = p.Hdr_inst_pack_unit_qty_p_PPanel.Qty_qty;
		p.Hdr_inst_pack_unit_qty.addAliasName("Hdr.inst_pack_unit_qty", p);
		p.Hdr_inst_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getHdrR().inst_base_unit_qty_p());
		p.Hdr_inst_base_unit_qty_p_PPanel.setName("Hdr.inst_base_unit_qty_p");
		p.Hdr_inst_base_unit_qty = p.Hdr_inst_base_unit_qty_p_PPanel.Qty_qty;
		p.Hdr_inst_base_unit_qty.addAliasName("Hdr.inst_base_unit_qty", p);
		p.Hdr_rem_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getHdrR().rem_base_unit_qty_p());
		p.Hdr_rem_base_unit_qty_p_PPanel.setName("Hdr.rem_base_unit_qty_p");
		p.Hdr_rem_base_unit_qty = p.Hdr_rem_base_unit_qty_p_PPanel.Qty_qty;
		p.Hdr_rem_base_unit_qty.addAliasName("Hdr.rem_base_unit_qty", p);
		p.Hdr_good_qty_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getHdrR().good_qty_p());
		p.Hdr_good_qty_p_PPanel.setName("Hdr.good_qty_p");
		p.Hdr_good_qty = p.Hdr_good_qty_p_PPanel.Qty_qty;
		p.Hdr_good_qty.addAliasName("Hdr.good_qty", p);
		p.Hdr_dfct_qty_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getHdrR().dfct_qty_p());
		p.Hdr_dfct_qty_p_PPanel.setName("Hdr.dfct_qty_p");
		p.Hdr_dfct_qty = p.Hdr_dfct_qty_p_PPanel.Qty_qty;
		p.Hdr_dfct_qty.addAliasName("Hdr.dfct_qty", p);
		p.Hdr_act_ttl_qty_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getHdrR().act_ttl_qty_p());
		p.Hdr_act_ttl_qty_p_PPanel.setName("Hdr.act_ttl_qty_p");
		p.Hdr_act_ttl_qty = p.Hdr_act_ttl_qty_p_PPanel.Qty_qty;
		p.Hdr_act_ttl_qty.addAliasName("Hdr.act_ttl_qty", p);
		p.Hdr_smpl_inst_qty_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getHdrR().smpl_inst_qty_p());
		p.Hdr_smpl_inst_qty_p_PPanel.setName("Hdr.smpl_inst_qty_p");
		p.Hdr_smpl_inst_qty = p.Hdr_smpl_inst_qty_p_PPanel.Qty_qty;
		p.Hdr_smpl_inst_qty.addAliasName("Hdr.smpl_inst_qty", p);
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
		p.Hdr_act_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getHdrR().act_usr_dpt_p());
		p.Hdr_act_usr_dpt_p_PPanel.setName("Hdr.act_usr_dpt_p");
		p.Hdr_act_usr_cd = p.Hdr_act_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.Hdr_act_usr_cd.addAliasName("Hdr.act_usr_cd", p);
		p.Hdr_act_usr_nm = p.Hdr_act_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.Hdr_act_usr_nm.addAliasName("Hdr.act_usr_nm", p);
		p.Hdr_act_dpt_cd = p.Hdr_act_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.Hdr_act_dpt_cd.addAliasName("Hdr.act_dpt_cd", p);
		p.Hdr_act_dpt_nm = p.Hdr_act_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.Hdr_act_dpt_nm.addAliasName("Hdr.act_dpt_nm", p);
		p.Hdr_std_cont_fctrt_p_PPanel = mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.create(p.getHdrR().std_cont_fctrt_p());
		p.Hdr_std_cont_fctrt_p_PPanel.setName("Hdr.std_cont_fctrt_p");
		p.Hdr_std_cont_fctr = p.Hdr_std_cont_fctrt_p_PPanel.StdContFctr_std_cont_fctr;
		p.Hdr_std_cont_fctr.addAliasName("Hdr.std_cont_fctr", p);
		p.Hdr_act_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.create(p.getHdrR().act_cont_fctr_p());
		p.Hdr_act_cont_fctr_p_PPanel.setName("Hdr.act_cont_fctr_p");
		p.Hdr_act_cont_fctr = p.Hdr_act_cont_fctr_p_PPanel.ActContFctr_act_cont_fctr;
		p.Hdr_act_cont_fctr.addAliasName("Hdr.act_cont_fctr", p);
		p.Hdr_judg_ttl_qty_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getHdrR().judg_ttl_qty_p());
		p.Hdr_judg_ttl_qty_p_PPanel.setName("Hdr.judg_ttl_qty_p");
		p.Hdr_judg_ttl_qty = p.Hdr_judg_ttl_qty_p_PPanel.Qty_qty;
		p.Hdr_judg_ttl_qty.addAliasName("Hdr.judg_ttl_qty", p);
		p.Hdr_judg_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getHdrR().judg_usr_dpt_p());
		p.Hdr_judg_usr_dpt_p_PPanel.setName("Hdr.judg_usr_dpt_p");
		p.Hdr_judg_usr_cd = p.Hdr_judg_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.Hdr_judg_usr_cd.addAliasName("Hdr.judg_usr_cd", p);
		p.Hdr_judg_usr_nm = p.Hdr_judg_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.Hdr_judg_usr_nm.addAliasName("Hdr.judg_usr_nm", p);
		p.Hdr_judg_dpt_cd = p.Hdr_judg_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.Hdr_judg_dpt_cd.addAliasName("Hdr.judg_dpt_cd", p);
		p.Hdr_judg_dpt_nm = p.Hdr_judg_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.Hdr_judg_dpt_nm.addAliasName("Hdr.judg_dpt_nm", p);
		p.Hdr_judg_rsn_p_PPanel = mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.create(p.getHdrR().judg_rsn_p());
		p.Hdr_judg_rsn_p_PPanel.setName("Hdr.judg_rsn_p");
		p.Hdr_judg_rsn = p.Hdr_judg_rsn_p_PPanel.Txt_txt;
		p.Hdr_judg_rsn.addAliasName("Hdr.judg_rsn", p);
	}

	/**
	 * [SystemInfo]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSystemInfo(MSBFP_InspActReg p) {
	}

	/**
	 * [Judg]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateJudg(MSBFP_InspActReg p) {
	}

	/**
	 * [JudgItm]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateJudgItm(MSBFP_InspActReg p) {
	}

	/**
	 * [JudgBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateJudgBtn(MSBFP_InspActReg p) {
	}

	/**
	 * [JudgEastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateJudgEastBtn(MSBFP_InspActReg p) {
	}

	/**
	 * [Dtl1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl1(MSBFP_InspActReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBFP_InspActReg p) {
		p.Dtl_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.create(mcframe.clientMSBF.MSBFP0070.DtlR.$ac_dt_p);
		p.Dtl_ac_dt_p_PPanel.setName("Dtl.ac_dt_p");
		p.columnDtl_ac_dt = p.Dtl_ac_dt_p_PPanel.columnAcDt_ac_dt;
		p.columnDtl_ac_dt.addAliasName("Dtl.ac_dt", p);
		p.Dtl_can_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.create(mcframe.clientMSBF.MSBFP0070.DtlR.$can_ac_dt_p);
		p.Dtl_can_ac_dt_p_PPanel.setName("Dtl.can_ac_dt_p");
		p.columnDtl_can_ac_dt_for_input = p.Dtl_can_ac_dt_p_PPanel.columnCanAcDt_can_ac_dt_for_input;
		p.columnDtl_can_ac_dt_for_input.addAliasName("Dtl.can_ac_dt_for_input", p);
		p.columnDtl_can_ac_dt = p.Dtl_can_ac_dt_p_PPanel.columnCanAcDt_can_ac_dt_for_call;
		p.columnDtl_can_ac_dt.addAliasName("Dtl.can_ac_dt", p);
		p.columnDtl_ac_dt_after_srch = p.Dtl_can_ac_dt_p_PPanel.columnCanAcDt_ac_dt_after_srch;
		p.columnDtl_ac_dt_after_srch.addAliasName("Dtl.ac_dt_after_srch", p);
		p.Dtl_pack_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBF.MSBFP0070.DtlR.$pack_unit_qty_p);
		p.Dtl_pack_unit_qty_p_PPanel.setName("Dtl.pack_unit_qty_p");
		p.columnDtl_pack_unit_qty = p.Dtl_pack_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_pack_unit_qty.addAliasName("Dtl.pack_unit_qty", p);
		p.Dtl_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBF.MSBFP0070.DtlR.$base_unit_qty_p);
		p.Dtl_base_unit_qty_p_PPanel.setName("Dtl.base_unit_qty_p");
		p.columnDtl_base_unit_qty = p.Dtl_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_base_unit_qty.addAliasName("Dtl.base_unit_qty", p);
		p.Dtl_stk_pack_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBF.MSBFP0070.DtlR.$stk_pack_unit_qty_p);
		p.Dtl_stk_pack_unit_qty_p_PPanel.setName("Dtl.stk_pack_unit_qty_p");
		p.columnDtl_stk_pack_unit_qty = p.Dtl_stk_pack_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_stk_pack_unit_qty.addAliasName("Dtl.stk_pack_unit_qty", p);
		p.Dtl_stk_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBF.MSBFP0070.DtlR.$stk_base_unit_qty_p);
		p.Dtl_stk_base_unit_qty_p_PPanel.setName("Dtl.stk_base_unit_qty_p");
		p.columnDtl_stk_base_unit_qty = p.Dtl_stk_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_stk_base_unit_qty.addAliasName("Dtl.stk_base_unit_qty", p);
		p.Dtl_pack_xfr_pack_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBF.MSBFP0070.DtlR.$pack_xfr_pack_unit_qty_p);
		p.Dtl_pack_xfr_pack_unit_qty_p_PPanel.setName("Dtl.pack_xfr_pack_unit_qty_p");
		p.columnDtl_pack_xfr_pack_unit_qty = p.Dtl_pack_xfr_pack_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_pack_xfr_pack_unit_qty.addAliasName("Dtl.pack_xfr_pack_unit_qty", p);
		p.Dtl_pack_xfr_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBF.MSBFP0070.DtlR.$pack_xfr_base_unit_qty_p);
		p.Dtl_pack_xfr_base_unit_qty_p_PPanel.setName("Dtl.pack_xfr_base_unit_qty_p");
		p.columnDtl_pack_xfr_base_unit_qty = p.Dtl_pack_xfr_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_pack_xfr_base_unit_qty.addAliasName("Dtl.pack_xfr_base_unit_qty", p);
		p.Dtl_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMSBF.MSBFP0070.DtlR.$sno_p);
		p.Dtl_sno_p_PPanel.setName("Dtl.sno_p");
		p.columnDtl_sno1 = p.Dtl_sno_p_PPanel.columnSno_sno1;
		p.columnDtl_sno1.addAliasName("Dtl.sno1", p);
		p.columnDtl_sno2 = p.Dtl_sno_p_PPanel.columnSno_sno2;
		p.columnDtl_sno2.addAliasName("Dtl.sno2", p);
		p.columnDtl_sno3 = p.Dtl_sno_p_PPanel.columnSno_sno3;
		p.columnDtl_sno3.addAliasName("Dtl.sno3", p);
		p.columnDtl_sno4 = p.Dtl_sno_p_PPanel.columnSno_sno4;
		p.columnDtl_sno4.addAliasName("Dtl.sno4", p);
		p.Dtl_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.create(mcframe.clientMSBF.MSBFP0070.DtlR.$wrk_no_p);
		p.Dtl_wrk_no_p_PPanel.setName("Dtl.wrk_no_p");
		p.columnDtl_wrk_no = p.Dtl_wrk_no_p_PPanel.columnWrkNo_wrk_no;
		p.columnDtl_wrk_no.addAliasName("Dtl.wrk_no", p);
		p.columnDtl_wrk_nm = p.Dtl_wrk_no_p_PPanel.columnWrkNo_wrk_nm;
		p.columnDtl_wrk_nm.addAliasName("Dtl.wrk_nm", p);
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MSBFP_InspActReg p) {
	}

	/**
	 * [Dtl2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl2(MSBFP_InspActReg p) {
	}

	/**
	 * [Smpl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSmpl(MSBFP_InspActReg p) {
		p.Smpl_so_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBF.MSBFP0070.SmplR.$so_qty_p);
		p.Smpl_so_qty_p_PPanel.setName("Smpl.so_qty_p");
		p.columnSmpl_so_qty = p.Smpl_so_qty_p_PPanel.columnQty_qty;
		p.columnSmpl_so_qty.addAliasName("Smpl.so_qty", p);
		p.Smpl_smpl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBF.MSBFP0070.SmplR.$smpl_qty_p);
		p.Smpl_smpl_qty_p_PPanel.setName("Smpl.smpl_qty_p");
		p.columnSmpl_smpl_qty = p.Smpl_smpl_qty_p_PPanel.columnQty_qty;
		p.columnSmpl_smpl_qty.addAliasName("Smpl.smpl_qty", p);
		p.Smpl_pack_xfr_pack_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBF.MSBFP0070.SmplR.$pack_xfr_pack_unit_qty_p);
		p.Smpl_pack_xfr_pack_unit_qty_p_PPanel.setName("Smpl.pack_xfr_pack_unit_qty_p");
		p.columnSmpl_pack_xfr_pack_unit_qty = p.Smpl_pack_xfr_pack_unit_qty_p_PPanel.columnQty_qty;
		p.columnSmpl_pack_xfr_pack_unit_qty.addAliasName("Smpl.pack_xfr_pack_unit_qty", p);
		p.Smpl_pack_xfr_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBF.MSBFP0070.SmplR.$pack_xfr_base_unit_qty_p);
		p.Smpl_pack_xfr_base_unit_qty_p_PPanel.setName("Smpl.pack_xfr_base_unit_qty_p");
		p.columnSmpl_pack_xfr_base_unit_qty = p.Smpl_pack_xfr_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnSmpl_pack_xfr_base_unit_qty.addAliasName("Smpl.pack_xfr_base_unit_qty", p);
		p.Smpl_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBF.MSBFP0070.SmplR.$str_ln_p);
		p.Smpl_str_ln_p_PPanel.setName("Smpl.str_ln_p");
		p.columnSmpl_str_ln_cd = p.Smpl_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnSmpl_str_ln_cd.addAliasName("Smpl.str_ln_cd", p);
		p.columnSmpl_str_ln_nm = p.Smpl_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnSmpl_str_ln_nm.addAliasName("Smpl.str_ln_nm", p);
		p.columnSmpl_str_ln_cd_none_flg = p.Smpl_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnSmpl_str_ln_cd_none_flg.addAliasName("Smpl.str_ln_cd_none_flg", p);
		p.Smpl_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMSBF.MSBFP0070.SmplR.$sno_p);
		p.Smpl_sno_p_PPanel.setName("Smpl.sno_p");
		p.columnSmpl_sno1 = p.Smpl_sno_p_PPanel.columnSno_sno1;
		p.columnSmpl_sno1.addAliasName("Smpl.sno1", p);
		p.columnSmpl_sno2 = p.Smpl_sno_p_PPanel.columnSno_sno2;
		p.columnSmpl_sno2.addAliasName("Smpl.sno2", p);
		p.columnSmpl_sno3 = p.Smpl_sno_p_PPanel.columnSno_sno3;
		p.columnSmpl_sno3.addAliasName("Smpl.sno3", p);
		p.columnSmpl_sno4 = p.Smpl_sno_p_PPanel.columnSno_sno4;
		p.columnSmpl_sno4.addAliasName("Smpl.sno4", p);
		p.Smpl_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.create(mcframe.clientMSBF.MSBFP0070.SmplR.$wrk_no_p);
		p.Smpl_wrk_no_p_PPanel.setName("Smpl.wrk_no_p");
		p.columnSmpl_wrk_no = p.Smpl_wrk_no_p_PPanel.columnWrkNo_wrk_no;
		p.columnSmpl_wrk_no.addAliasName("Smpl.wrk_no", p);
		p.columnSmpl_wrk_nm = p.Smpl_wrk_no_p_PPanel.columnWrkNo_wrk_nm;
		p.columnSmpl_wrk_nm.addAliasName("Smpl.wrk_nm", p);
		p.Smpl_act_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBF.MSBFP0070.SmplR.$act_dt_p);
		p.Smpl_act_dt_p_PPanel.setName("Smpl.act_dt_p");
		p.columnSmpl_act_dt = p.Smpl_act_dt_p_PPanel.columnYmdHm_ymd;
		p.columnSmpl_act_dt.addAliasName("Smpl.act_dt", p);
		p.columnSmpl_act_hm = p.Smpl_act_dt_p_PPanel.columnYmdHm_hm;
		p.columnSmpl_act_hm.addAliasName("Smpl.act_hm", p);
		p.Smpl_can_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.create(mcframe.clientMSBF.MSBFP0070.SmplR.$can_ac_dt_p);
		p.Smpl_can_ac_dt_p_PPanel.setName("Smpl.can_ac_dt_p");
		p.columnSmpl_can_ac_dt_for_input = p.Smpl_can_ac_dt_p_PPanel.columnCanAcDt_can_ac_dt_for_input;
		p.columnSmpl_can_ac_dt_for_input.addAliasName("Smpl.can_ac_dt_for_input", p);
		p.columnSmpl_can_ac_dt = p.Smpl_can_ac_dt_p_PPanel.columnCanAcDt_can_ac_dt_for_call;
		p.columnSmpl_can_ac_dt.addAliasName("Smpl.can_ac_dt", p);
		p.columnSmpl_ac_dt_after_srch = p.Smpl_can_ac_dt_p_PPanel.columnCanAcDt_ac_dt_after_srch;
		p.columnSmpl_ac_dt_after_srch.addAliasName("Smpl.ac_dt_after_srch", p);
	}

	/**
	 * [SmplBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSmplBtn(MSBFP_InspActReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBFP_InspActReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBFP_InspActReg p) {
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

	
	/** [Hdr_ver_no_ListPutter]の定義 */
	private MCListPutter Hdr_ver_no_p = null;

	/**
	 * [Hdr_ver_no_ListPutter]の取得
	 */
	protected MCListPutter getHdr_ver_no_ListPutter() {
		if (Hdr_ver_no_p == null) {
			Hdr_ver_no_p = createHdr_ver_no_ListPutter(Hdr_ver_no, "ver_no");

		}
		return Hdr_ver_no_p;
	}
	
	
	/** [Hdr_smpl_inst_unit_cd_ListPutter]の定義 */
	private MCListPutter Hdr_smpl_inst_unit_cd_p = null;

	/**
	 * [Hdr_smpl_inst_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_smpl_inst_unit_cd_ListPutter() {
		if (Hdr_smpl_inst_unit_cd_p == null) {
			Hdr_smpl_inst_unit_cd_p = createHdr_smpl_inst_unit_cd_ListPutter(Hdr_smpl_inst_unit_cd, "smpl_inst_unit_cd", "smpl_inst_unit_nm");

		}
		return Hdr_smpl_inst_unit_cd_p;
	}
	
	
	/** [Hdr_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Hdr_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [Hdr_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (Hdr_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			Hdr_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createHdr_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(Hdr_act_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "act_dpt_cd", "act_dpt_nm");
		}
		return Hdr_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [Hdr_quality_typ_ListPutter]の定義 */
	private MCListPutter Hdr_quality_typ_p = null;

	/**
	 * [Hdr_quality_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_quality_typ_ListPutter() {
		if (Hdr_quality_typ_p == null) {
			Hdr_quality_typ_p = createHdr_quality_typ_ListPutter(Hdr_quality_typ, "quality_typ", "quality_typ_nm");

		}
		return Hdr_quality_typ_p;
	}
	
	
	/** [Hdr_gd_cd_ListPutter]の定義 */
	private MCListPutter Hdr_gd_cd_p = null;

	/**
	 * [Hdr_gd_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_gd_cd_ListPutter() {
		if (Hdr_gd_cd_p == null) {
			Hdr_gd_cd_p = createHdr_gd_cd_ListPutter(Hdr_gd_cd, "gd_cd", "gd_nm");

		}
		return Hdr_gd_cd_p;
	}
	
	
	/** [Hdr_dfct_rsn_cd_ListPutter]の定義 */
	private MCListPutter Hdr_dfct_rsn_cd_p = null;

	/**
	 * [Hdr_dfct_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_dfct_rsn_cd_ListPutter() {
		if (Hdr_dfct_rsn_cd_p == null) {
			Hdr_dfct_rsn_cd_p = createHdr_dfct_rsn_cd_ListPutter(Hdr_dfct_rsn_cd, "dfct_rsn_cd", "dfct_rsn_nm");

		}
		return Hdr_dfct_rsn_cd_p;
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
	
	
	/** [Hdr_judg_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Hdr_judg_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [Hdr_judg_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_judg_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (Hdr_judg_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			Hdr_judg_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createHdr_judg_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(Hdr_judg_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "judg_dpt_cd", "judg_dpt_nm");
		}
		return Hdr_judg_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [Dtl_quality_typ_ListPutter]の定義 */
	private MCListPutter Dtl_quality_typ_p = null;

	/**
	 * [Dtl_quality_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_quality_typ_ListPutter() {
		if (Dtl_quality_typ_p == null) {
			Dtl_quality_typ_p = createDtl_quality_typ_ListPutter(columnDtl_quality_typ, "quality_typ", "quality_typ_nm");

		}
		return Dtl_quality_typ_p;
	}
	
	
	/** [Dtl_gd_cd_ListPutter]の定義 */
	private MCListPutter Dtl_gd_cd_p = null;

	/**
	 * [Dtl_gd_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_gd_cd_ListPutter() {
		if (Dtl_gd_cd_p == null) {
			Dtl_gd_cd_p = createDtl_gd_cd_ListPutter(columnDtl_gd_cd, "gd_cd", "gd_nm");

		}
		return Dtl_gd_cd_p;
	}
	
	
	/** [Dtl_dfct_rsn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_dfct_rsn_cd_p = null;

	/**
	 * [Dtl_dfct_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_dfct_rsn_cd_ListPutter() {
		if (Dtl_dfct_rsn_cd_p == null) {
			Dtl_dfct_rsn_cd_p = createDtl_dfct_rsn_cd_ListPutter(columnDtl_dfct_rsn_cd, "dfct_rsn_cd", "dfct_rsn_nm");

		}
		return Dtl_dfct_rsn_cd_p;
	}
	
	
	/** [Dtl_pack_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_pack_unit_cd_p = null;

	/**
	 * [Dtl_pack_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_pack_unit_cd_ListPutter() {
		if (Dtl_pack_unit_cd_p == null) {
			Dtl_pack_unit_cd_p = createDtl_pack_unit_cd_ListPutter(columnDtl_pack_unit_cd, "pack_unit_cd", "pack_unit_nm","pack_unit_dec_place","pack_unit_dmn_qty","pack_unit_conv_qty");

		}
		return Dtl_pack_unit_cd_p;
	}
	
	
	/** [Smpl_loc_cd_ListPutter]の定義 */
	private MCListPutter Smpl_loc_cd_p = null;

	/**
	 * [Smpl_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getSmpl_loc_cd_ListPutter() {
		if (Smpl_loc_cd_p == null) {
			Smpl_loc_cd_p = createSmpl_loc_cd_ListPutter(columnSmpl_loc_cd, "loc_cd", "loc_nm","str_ln_tgt_flg");

		}
		return Smpl_loc_cd_p;
	}
	
	
	/** [Smpl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Smpl_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = null;

	/**
	 * [Smpl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getSmpl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter() {
		if (Smpl_str_ln_p_PPanel_columnStrLn_str_ln_cd_p == null) {
			Smpl_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = createSmpl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(Smpl_str_ln_p_PPanel.columnStrLn_str_ln_cd, "str_ln_cd", "str_ln_nm");
		}
		return Smpl_str_ln_p_PPanel_columnStrLn_str_ln_cd_p;
	}
	
	
	/** [Smpl_bd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Smpl_bd_dpt_cd_p = null;

	/**
	 * [Smpl_bd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getSmpl_bd_dpt_cd_ListPutter() {
		if (Smpl_bd_dpt_cd_p == null) {
			Smpl_bd_dpt_cd_p = createSmpl_bd_dpt_cd_ListPutter(columnSmpl_bd_dpt_cd, "bd_dpt_cd", "bd_dpt_nm");

		}
		return Smpl_bd_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBFP_InspActReg create(){
		MSBFP_InspActReg p = new MSBFP_InspActReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBFP_InspActReg create(String name){
		MSBFP_InspActReg p = new MSBFP_InspActReg(name);
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
		MSBFP_InspActReg_MC.jbfInitScreenOpe((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbfInitCnd((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbfInitHdrTab((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbfInitHdr((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbfInitSystemInfo((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbfInitJudg((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbfInitJudgItm((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbfInitJudgBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbfInitJudgEastBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbfInitDtl1((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbfInitDtl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbfInitDtlBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbfInitDtl2((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbfInitSmpl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbfInitSmplBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbfInitBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbfInitEastBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbInitScreenOpe((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbInitCnd((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbInitHdrTab((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbInitHdr((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbInitSystemInfo((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbInitJudg((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbInitJudgItm((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbInitJudgBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbInitJudgEastBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbInitDtl1((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbInitDtl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbInitDtlBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbInitDtl2((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbInitSmpl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbInitSmplBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbInitBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.jbInitEastBtn((MSBFP_InspActReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_JUDG = p.beansFactory.createRadioButton("Cnd.ope_JUDG");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_insp_no_Label = p.beansFactory.createLabel("Cnd.insp_no_Label");
		p.Cnd_insp_no = p.beansFactory.createTextField("Cnd.insp_no");
		p.Cnd_insp_no.setLabel(p.Cnd_insp_no_Label);
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_ver_no_Label = p.beansFactory.createLabel("Hdr.ver_no_Label");
		p.Hdr_ver_no = p.beansFactory.createTextComboBox("Hdr.ver_no");
		p.Hdr_ver_no.setLabel(p.Hdr_ver_no_Label);
		p.Hdr_insp_no_Label = p.beansFactory.createLabel("Hdr.insp_no_Label");
		p.Hdr_insp_no = p.beansFactory.createTextField("Hdr.insp_no");
		p.Hdr_insp_no.setLabel(p.Hdr_insp_no_Label);
		p.Hdr_insp_act_no_Label = p.beansFactory.createLabel("Hdr.insp_act_no_Label");
		p.Hdr_insp_act_no = p.beansFactory.createTextField("Hdr.insp_act_no");
		p.Hdr_insp_act_no.setLabel(p.Hdr_insp_act_no_Label);
		p.Hdr_insp_freq_Label = p.beansFactory.createLabel("Hdr.insp_freq_Label");
		p.Hdr_insp_freq = p.beansFactory.createNumberField("Hdr.insp_freq");
		p.Hdr_insp_freq.setLabel(p.Hdr_insp_freq_Label);
		p.Hdr_insp_mtd_typ_Label = p.beansFactory.createLabel("Hdr.insp_mtd_typ_Label");
		p.Hdr_insp_mtd_typ = p.beansFactory.createTextField("Hdr.insp_mtd_typ");
		p.Hdr_insp_mtd_typ.setLabel(p.Hdr_insp_mtd_typ_Label);
		p.Hdr_insp_mtd_typ_nm = p.beansFactory.createTextField("Hdr.insp_mtd_typ_nm");
		p.Hdr_insp_typ_Label = p.beansFactory.createLabel("Hdr.insp_typ_Label");
		p.Hdr_insp_typ = p.beansFactory.createTextField("Hdr.insp_typ");
		p.Hdr_insp_typ.setLabel(p.Hdr_insp_typ_Label);
		p.Hdr_insp_typ_nm = p.beansFactory.createTextField("Hdr.insp_typ_nm");
		p.Hdr_insp_sts_typ_Label = p.beansFactory.createLabel("Hdr.insp_sts_typ_Label");
		p.Hdr_insp_sts_typ = p.beansFactory.createTextField("Hdr.insp_sts_typ");
		p.Hdr_insp_sts_typ.setLabel(p.Hdr_insp_sts_typ_Label);
		p.Hdr_insp_sts_typ_nm = p.beansFactory.createTextField("Hdr.insp_sts_typ_nm");
		p.Hdr_pack_unit_cd_Label = p.beansFactory.createLabel("Hdr.pack_unit_cd_Label");
		p.Hdr_pack_unit_cd = p.beansFactory.createTextField("Hdr.pack_unit_cd");
		p.Hdr_pack_unit_cd.setLabel(p.Hdr_pack_unit_cd_Label);
		p.Hdr_pack_unit_nm = p.beansFactory.createTextField("Hdr.pack_unit_nm");
		p.Hdr_pack_unit_dec_place = p.beansFactory.createNumberField("Hdr.pack_unit_dec_place");
		p.Hdr_smpl_inst_unit_cd_Label = p.beansFactory.createLabel("Hdr.smpl_inst_unit_cd_Label");
		p.Hdr_smpl_inst_unit_cd = p.beansFactory.createTextComboBox("Hdr.smpl_inst_unit_cd");
		p.Hdr_smpl_inst_unit_cd.setLabel(p.Hdr_smpl_inst_unit_cd_Label);
		p.Hdr_smpl_inst_unit_nm = p.beansFactory.createTextField("Hdr.smpl_inst_unit_nm");
		p.Hdr_smpl_inst_unit_dec_place = p.beansFactory.createNumberField("Hdr.smpl_inst_unit_dec_place");
		p.Hdr_base_unit_cd_Label = p.beansFactory.createLabel("Hdr.base_unit_cd_Label");
		p.Hdr_base_unit_cd = p.beansFactory.createTextField("Hdr.base_unit_cd");
		p.Hdr_base_unit_cd.setLabel(p.Hdr_base_unit_cd_Label);
		p.Hdr_base_unit_nm = p.beansFactory.createTextField("Hdr.base_unit_nm");
		p.Hdr_base_unit_dec_place = p.beansFactory.createNumberField("Hdr.base_unit_dec_place");
		p.Hdr_base_unit_rnd_typ_Label = p.beansFactory.createLabel("Hdr.base_unit_rnd_typ_Label");
		p.Hdr_base_unit_rnd_typ = p.beansFactory.createTextField("Hdr.base_unit_rnd_typ");
		p.Hdr_base_unit_rnd_typ.setLabel(p.Hdr_base_unit_rnd_typ_Label);
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
		p.Hdr_bp_lot_no_Label = p.beansFactory.createLabel("Hdr.bp_lot_no_Label");
		p.Hdr_bp_lot_no = p.beansFactory.createTextField("Hdr.bp_lot_no");
		p.Hdr_bp_lot_no.setLabel(p.Hdr_bp_lot_no_Label);
		p.Hdr_std_insp_flg = p.beansFactory.createCheckBox("Hdr.std_insp_flg");
		p.Hdr_std_req_flg = p.beansFactory.createCheckBox("Hdr.std_req_flg");
		p.Hdr_std_cnf_req_flg = p.beansFactory.createCheckBox("Hdr.std_cnf_req_flg");
		p.Hdr_std_cmpl_flg = p.beansFactory.createCheckBox("Hdr.std_cmpl_flg");
		p.Hdr_std_cnf_cmpl_flg = p.beansFactory.createCheckBox("Hdr.std_cnf_cmpl_flg");
		p.Hdr_insp_rslt_prnt_flg = p.beansFactory.createCheckBox("Hdr.insp_rslt_prnt_flg");
		p.Hdr_insp_rslt_prnt_tm_Label = p.beansFactory.createLabel("Hdr.insp_rslt_prnt_tm_Label");
		p.Hdr_insp_rslt_prnt_tm = p.beansFactory.createDateField("Hdr.insp_rslt_prnt_tm");
		p.Hdr_insp_rslt_prnt_tm.setLabel(p.Hdr_insp_rslt_prnt_tm_Label);
		p.Hdr_quality_typ_Label = p.beansFactory.createLabel("Hdr.quality_typ_Label");
		p.Hdr_quality_typ = p.beansFactory.createTextComboBox("Hdr.quality_typ");
		p.Hdr_quality_typ.setLabel(p.Hdr_quality_typ_Label);
		p.Hdr_quality_typ_nm = p.beansFactory.createTextField("Hdr.quality_typ_nm");
		p.Hdr_gd_cd_Label = p.beansFactory.createLabel("Hdr.gd_cd_Label");
		p.Hdr_gd_cd = p.beansFactory.createTextComboBox("Hdr.gd_cd");
		p.Hdr_gd_cd.setLabel(p.Hdr_gd_cd_Label);
		p.Hdr_gd_nm = p.beansFactory.createTextField("Hdr.gd_nm");
		p.Hdr_dfct_rsn_cd_Label = p.beansFactory.createLabel("Hdr.dfct_rsn_cd_Label");
		p.Hdr_dfct_rsn_cd = p.beansFactory.createTextComboBox("Hdr.dfct_rsn_cd");
		p.Hdr_dfct_rsn_cd.setLabel(p.Hdr_dfct_rsn_cd_Label);
		p.Hdr_dfct_rsn_nm = p.beansFactory.createTextField("Hdr.dfct_rsn_nm");
		p.Hdr_vld_dt_upd_flg = p.beansFactory.createCheckBox("Hdr.vld_dt_upd_flg");
		p.Hdr_vld_pd_Label = p.beansFactory.createLabel("Hdr.vld_pd_Label");
		p.Hdr_vld_pd = p.beansFactory.createNumberField("Hdr.vld_pd");
		p.Hdr_vld_pd.setLabel(p.Hdr_vld_pd_Label);
		p.Hdr_lmt_pd_Label = p.beansFactory.createLabel("Hdr.lmt_pd_Label");
		p.Hdr_lmt_pd = p.beansFactory.createNumberField("Hdr.lmt_pd");
		p.Hdr_lmt_pd.setLabel(p.Hdr_lmt_pd_Label);
		p.Hdr_calc_pd_typ_Label = p.beansFactory.createLabel("Hdr.calc_pd_typ_Label");
		p.Hdr_calc_pd_typ = p.beansFactory.createTextField("Hdr.calc_pd_typ");
		p.Hdr_calc_pd_typ.setLabel(p.Hdr_calc_pd_typ_Label);
		p.Hdr_calc_pd_typ_nm = p.beansFactory.createTextField("Hdr.calc_pd_typ_nm");
		p.Hdr_lmt_dt_frm_typ_Label = p.beansFactory.createLabel("Hdr.lmt_dt_frm_typ_Label");
		p.Hdr_lmt_dt_frm_typ = p.beansFactory.createTextField("Hdr.lmt_dt_frm_typ");
		p.Hdr_lmt_dt_frm_typ.setLabel(p.Hdr_lmt_dt_frm_typ_Label);
		p.Hdr_lmt_dt_frm_typ_nm = p.beansFactory.createTextField("Hdr.lmt_dt_frm_typ_nm");
		p.Hdr_lmt_ctl_categ_Label = p.beansFactory.createLabel("Hdr.lmt_ctl_categ_Label");
		p.Hdr_lmt_ctl_categ = p.beansFactory.createTextField("Hdr.lmt_ctl_categ");
		p.Hdr_lmt_ctl_categ.setLabel(p.Hdr_lmt_ctl_categ_Label);
		p.Hdr_lmt_dt_frm_Label = p.beansFactory.createLabel("Hdr.lmt_dt_frm_Label");
		p.Hdr_lmt_dt_frm = p.beansFactory.createDateField("Hdr.lmt_dt_frm");
		p.Hdr_lmt_dt_frm.setLabel(p.Hdr_lmt_dt_frm_Label);
		p.Hdr_vld_dt_now_Label = p.beansFactory.createLabel("Hdr.vld_dt_now_Label");
		p.Hdr_vld_dt_now = p.beansFactory.createDateField("Hdr.vld_dt_now");
		p.Hdr_vld_dt_now.setLabel(p.Hdr_vld_dt_now_Label);
		p.Hdr_vld_dt_Label = p.beansFactory.createLabel("Hdr.vld_dt_Label");
		p.Hdr_vld_dt = p.beansFactory.createDateField("Hdr.vld_dt");
		p.Hdr_vld_dt.setLabel(p.Hdr_vld_dt_Label);
		p.Hdr_lmt_dt_Label = p.beansFactory.createLabel("Hdr.lmt_dt_Label");
		p.Hdr_lmt_dt = p.beansFactory.createDateField("Hdr.lmt_dt");
		p.Hdr_lmt_dt.setLabel(p.Hdr_lmt_dt_Label);
		p.Hdr_lmt_up_flg = p.beansFactory.createCheckBox("Hdr.lmt_up_flg");
		p.Hdr_in_prmt_insp_flg = p.beansFactory.createCheckBox("Hdr.in_prmt_insp_flg");
		p.Hdr_intr_rmrks_Label = p.beansFactory.createLabel("Hdr.intr_rmrks_Label");
		p.Hdr_intr_rmrks = p.beansFactory.createTextField("Hdr.intr_rmrks");
		p.Hdr_intr_rmrks.setLabel(p.Hdr_intr_rmrks_Label);
		p.Hdr_lot_rmrks_Label = p.beansFactory.createLabel("Hdr.lot_rmrks_Label");
		p.Hdr_lot_rmrks = p.beansFactory.createTextField("Hdr.lot_rmrks");
		p.Hdr_lot_rmrks.setLabel(p.Hdr_lot_rmrks_Label);
		p.Hdr_sub_char1_Label = p.beansFactory.createLabel("Hdr.sub_char1_Label");
		p.Hdr_sub_char1 = p.beansFactory.createTextField("Hdr.sub_char1");
		p.Hdr_sub_char1.setLabel(p.Hdr_sub_char1_Label);
		p.Hdr_sub_char2_Label = p.beansFactory.createLabel("Hdr.sub_char2_Label");
		p.Hdr_sub_char2 = p.beansFactory.createTextField("Hdr.sub_char2");
		p.Hdr_sub_char2.setLabel(p.Hdr_sub_char2_Label);
		p.Hdr_sub_char3_Label = p.beansFactory.createLabel("Hdr.sub_char3_Label");
		p.Hdr_sub_char3 = p.beansFactory.createTextField("Hdr.sub_char3");
		p.Hdr_sub_char3.setLabel(p.Hdr_sub_char3_Label);
		p.Hdr_lims_flg = p.beansFactory.createCheckBox("Hdr.lims_flg");
		p.Hdr_ext_sys_cd_Label = p.beansFactory.createLabel("Hdr.ext_sys_cd_Label");
		p.Hdr_ext_sys_cd = p.beansFactory.createTextField("Hdr.ext_sys_cd");
		p.Hdr_ext_sys_cd.setLabel(p.Hdr_ext_sys_cd_Label);
		p.Hdr_ext_sys_nm_Label = p.beansFactory.createLabel("Hdr.ext_sys_nm_Label");
		p.Hdr_ext_sys_nm = p.beansFactory.createTextField("Hdr.ext_sys_nm");
		p.Hdr_ext_sys_nm.setLabel(p.Hdr_ext_sys_nm_Label);
		p.Hdr_ext_insp_act_no_Label = p.beansFactory.createLabel("Hdr.ext_insp_act_no_Label");
		p.Hdr_ext_insp_act_no = p.beansFactory.createTextField("Hdr.ext_insp_act_no");
		p.Hdr_ext_insp_act_no.setLabel(p.Hdr_ext_insp_act_no_Label);
		p.Hdr_insp_aprv_sts_typ_Label = p.beansFactory.createLabel("Hdr.insp_aprv_sts_typ_Label");
		p.Hdr_insp_aprv_sts_typ = p.beansFactory.createTextField("Hdr.insp_aprv_sts_typ");
		p.Hdr_insp_aprv_sts_typ.setLabel(p.Hdr_insp_aprv_sts_typ_Label);
		p.Hdr_insp_aprv_sts_typ_nm = p.beansFactory.createTextField("Hdr.insp_aprv_sts_typ_nm");
		p.Hdr_insp_judg_rslt_typ_Label = p.beansFactory.createLabel("Hdr.insp_judg_rslt_typ_Label");
		p.Hdr_insp_judg_rslt_typ = p.beansFactory.createTextComboBox("Hdr.insp_judg_rslt_typ");
		p.Hdr_insp_judg_rslt_typ.setLabel(p.Hdr_insp_judg_rslt_typ_Label);
		p.Hdr_insp_judg_rslt_typ_nm = p.beansFactory.createTextField("Hdr.insp_judg_rslt_typ_nm");
		p.Hdr_judg_dt_Label = p.beansFactory.createLabel("Hdr.judg_dt_Label");
		p.Hdr_judg_dt = p.beansFactory.createDateField("Hdr.judg_dt");
		p.Hdr_judg_dt.setLabel(p.Hdr_judg_dt_Label);
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
		p.Hdr_cont_fctr_flg = p.beansFactory.createCheckBox("Hdr.cont_fctr_flg");
		p.Hdr_insp_ptn_cd = p.beansFactory.createTextField("Hdr.insp_ptn_cd");
		p.Hdr_site_cd = p.beansFactory.createTextField("Hdr.site_cd");
	}

	/**
	 * [SystemInfo]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSystemInfo(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.SystemInfoPanel = p.beansFactory.createPanel("SystemInfo");
		// ブロックの項目の初期化
	}

	/**
	 * [Judg]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitJudg(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.JudgPanel = p.beansFactory.createPanel("Judg");
		// ブロックの項目の初期化
	}

	/**
	 * [JudgItm]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitJudgItm(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.JudgItmPanel = p.beansFactory.createPanel("JudgItm");
		// ブロックの項目の初期化
	}

	/**
	 * [JudgBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitJudgBtn(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.JudgBtnPanel = p.beansFactory.createPanel("JudgBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [JudgEastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitJudgEastBtn(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.JudgEastBtnPanel = p.beansFactory.createPanel("JudgEastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl1(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.Dtl1Panel = p.beansFactory.createPanel("Dtl1");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_itm_cd = p.beansFactory.createTableColumn("Dtl.itm_cd", MCColumnType.TEXT);
		p.columnDtl_itm_sub1 = p.beansFactory.createTableColumn("Dtl.itm_sub1", MCColumnType.TEXT);
		p.columnDtl_itm_sub2 = p.beansFactory.createTableColumn("Dtl.itm_sub2", MCColumnType.TEXT);
		p.columnDtl_itm_sub3 = p.beansFactory.createTableColumn("Dtl.itm_sub3", MCColumnType.TEXT);
		p.columnDtl_wg_cd = p.beansFactory.createTableColumn("Dtl.wg_cd", MCColumnType.TEXT);
		p.columnDtl_loc_cd = p.beansFactory.createTableColumn("Dtl.loc_cd", MCColumnType.TEXT);
		p.columnDtl_loc_nm = p.beansFactory.createTableColumn("Dtl.loc_nm", MCColumnType.TEXT);
		p.columnDtl_str_ln_tgt_flg = p.beansFactory.createTableColumn("Dtl.str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnDtl_str_ln_cd = p.beansFactory.createTableColumn("Dtl.str_ln_cd", MCColumnType.TEXT);
		p.columnDtl_str_ln_nm = p.beansFactory.createTableColumn("Dtl.str_ln_nm", MCColumnType.TEXT);
		p.columnDtl_str_ln_cd_none_flg = p.beansFactory.createTableColumn("Dtl.str_ln_cd_none_flg", MCColumnType.CHECK);
		p.columnDtl_stk_arrv_bp_cd = p.beansFactory.createTableColumn("Dtl.stk_arrv_bp_cd", MCColumnType.TEXT);
		p.columnDtl_stk_arrv_bp_nm = p.beansFactory.createTableColumn("Dtl.stk_arrv_bp_nm", MCColumnType.TEXT);
		p.columnDtl_quality_typ = p.beansFactory.createTableColumn("Dtl.quality_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_quality_typ_nm = p.beansFactory.createTableColumn("Dtl.quality_typ_nm", MCColumnType.TEXT);
		p.columnDtl_gd_cd = p.beansFactory.createTableColumn("Dtl.gd_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_gd_nm = p.beansFactory.createTableColumn("Dtl.gd_nm", MCColumnType.TEXT);
		p.columnDtl_dfct_rsn_cd = p.beansFactory.createTableColumn("Dtl.dfct_rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_dfct_rsn_nm = p.beansFactory.createTableColumn("Dtl.dfct_rsn_nm", MCColumnType.TEXT);
		p.columnDtl_base_flg = p.beansFactory.createTableColumn("Dtl.base_flg", MCColumnType.CHECK);
		p.columnDtl_pack_unit_cd = p.beansFactory.createTableColumn("Dtl.pack_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_pack_unit_nm = p.beansFactory.createTableColumn("Dtl.pack_unit_nm", MCColumnType.TEXT);
		p.columnDtl_pack_unit_dec_place = p.beansFactory.createTableColumn("Dtl.pack_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_pack_unit_dmn_qty = p.beansFactory.createTableColumn("Dtl.pack_unit_dmn_qty", MCColumnType.NUMBER);
		p.columnDtl_pack_unit_conv_qty = p.beansFactory.createTableColumn("Dtl.pack_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtl_base_unit_cd = p.beansFactory.createTableColumn("Dtl.base_unit_cd", MCColumnType.TEXT);
		p.columnDtl_base_unit_nm = p.beansFactory.createTableColumn("Dtl.base_unit_nm", MCColumnType.TEXT);
		p.columnDtl_base_unit_dec_place = p.beansFactory.createTableColumn("Dtl.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_base_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_stk_pack_unit_cd = p.beansFactory.createTableColumn("Dtl.stk_pack_unit_cd", MCColumnType.TEXT);
		p.columnDtl_stk_pack_unit_nm = p.beansFactory.createTableColumn("Dtl.stk_pack_unit_nm", MCColumnType.TEXT);
		p.columnDtl_stk_pack_unit_dec_place = p.beansFactory.createTableColumn("Dtl.stk_pack_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_stk_base_unit_cd = p.beansFactory.createTableColumn("Dtl.stk_base_unit_cd", MCColumnType.TEXT);
		p.columnDtl_stk_base_unit_nm = p.beansFactory.createTableColumn("Dtl.stk_base_unit_nm", MCColumnType.TEXT);
		p.columnDtl_stk_base_unit_dec_place = p.beansFactory.createTableColumn("Dtl.stk_base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_pack_xfr_pack_unit_cd = p.beansFactory.createTableColumn("Dtl.pack_xfr_pack_unit_cd", MCColumnType.TEXT);
		p.columnDtl_pack_xfr_pack_unit_nm = p.beansFactory.createTableColumn("Dtl.pack_xfr_pack_unit_nm", MCColumnType.TEXT);
		p.columnDtl_pack_xfr_pack_unit_dec_place = p.beansFactory.createTableColumn("Dtl.pack_xfr_pack_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_pack_xfr_pack_unit_dmn_qty = p.beansFactory.createTableColumn("Dtl.pack_xfr_pack_unit_dmn_qty", MCColumnType.NUMBER);
		p.columnDtl_pack_xfr_pack_unit_conv_qty = p.beansFactory.createTableColumn("Dtl.pack_xfr_pack_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtl_pack_xfr_base_unit_cd = p.beansFactory.createTableColumn("Dtl.pack_xfr_base_unit_cd", MCColumnType.TEXT);
		p.columnDtl_pack_xfr_base_unit_nm = p.beansFactory.createTableColumn("Dtl.pack_xfr_base_unit_nm", MCColumnType.TEXT);
		p.columnDtl_pack_xfr_base_unit_dec_place = p.beansFactory.createTableColumn("Dtl.pack_xfr_base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_pack_xfr_base_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.pack_xfr_base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_stk_insp_typ = p.beansFactory.createTableColumn("Dtl.stk_insp_typ", MCColumnType.TEXT);
		p.columnDtl_stk_insp_typ_nm = p.beansFactory.createTableColumn("Dtl.stk_insp_typ_nm", MCColumnType.TEXT);
		p.columnDtl_stk_id_typ = p.beansFactory.createTableColumn("Dtl.stk_id_typ", MCColumnType.TEXT);
		p.columnDtl_stk_id_typ_nm = p.beansFactory.createTableColumn("Dtl.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnDtl_stk_bp_cd = p.beansFactory.createTableColumn("Dtl.stk_bp_cd", MCColumnType.TEXT);
		p.columnDtl_stk_bp_nm = p.beansFactory.createTableColumn("Dtl.stk_bp_nm", MCColumnType.TEXT);
		p.columnDtl_fix_no_typ = p.beansFactory.createTableColumn("Dtl.fix_no_typ", MCColumnType.TEXT);
		p.columnDtl_fix_no_typ_nm = p.beansFactory.createTableColumn("Dtl.fix_no_typ_nm", MCColumnType.TEXT);
		p.columnDtl_fix_no = p.beansFactory.createTableColumn("Dtl.fix_no", MCColumnType.TEXT);
		p.columnDtl_insp_act_d_no = p.beansFactory.createTableColumn("Dtl.insp_act_d_no", MCColumnType.TEXT);
		p.columnDtl_insp_judg_d_no = p.beansFactory.createTableColumn("Dtl.insp_judg_d_no", MCColumnType.TEXT);
		p.columnDtl_insp_act_no = p.beansFactory.createTableColumn("Dtl.insp_act_no", MCColumnType.TEXT);
		p.columnDtl_insp_no = p.beansFactory.createTableColumn("Dtl.insp_no", MCColumnType.TEXT);
		p.columnDtl_intr_rmrks = p.beansFactory.createTableColumn("Dtl.intr_rmrks", MCColumnType.TEXT);
		p.columnDtl_sub_char1 = p.beansFactory.createTableColumn("Dtl.sub_char1", MCColumnType.TEXT);
		p.columnDtl_sub_char2 = p.beansFactory.createTableColumn("Dtl.sub_char2", MCColumnType.TEXT);
		p.columnDtl_sub_char3 = p.beansFactory.createTableColumn("Dtl.sub_char3", MCColumnType.TEXT);
		p.columnDtl_lims_flg = p.beansFactory.createTableColumn("Dtl.lims_flg", MCColumnType.CHECK);
		p.columnDtl_ext_sys_cd = p.beansFactory.createTableColumn("Dtl.ext_sys_cd", MCColumnType.TEXT);
		p.columnDtl_ext_sys_nm = p.beansFactory.createTableColumn("Dtl.ext_sys_nm", MCColumnType.TEXT);
		p.columnDtl_ext_insp_act_d_no = p.beansFactory.createTableColumn("Dtl.ext_insp_act_d_no", MCColumnType.TEXT);
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtn(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel = p.beansFactory.createPanel("DtlBtn");
		// ブロックの項目の初期化
		p.DtlBtn_rdel = p.beansFactory.createButton("DtlBtn.rdel", "no_border");
		p.DtlBtn_rcopy = p.beansFactory.createButton("DtlBtn.rcopy", "no_border");
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl2(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.Dtl2Panel = p.beansFactory.createPanel("Dtl2");
		// ブロックの項目の初期化
	}

	/**
	 * [Smpl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSmpl(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.SmplPanel = p.beansFactory.createPanel("Smpl");
		p.SmplScrollPane = p.beansFactory.createScrollPane("Smpl.scroll");
		p.createSmplTable();
		// ブロックの項目の初期化
		p.columnSmpl_base_unit_cd = p.beansFactory.createTableColumn("Smpl.base_unit_cd", MCColumnType.TEXT);
		p.columnSmpl_base_unit_nm = p.beansFactory.createTableColumn("Smpl.base_unit_nm", MCColumnType.TEXT);
		p.columnSmpl_base_unit_dec_place = p.beansFactory.createTableColumn("Smpl.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnSmpl_base_unit_rnd_typ = p.beansFactory.createTableColumn("Smpl.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnSmpl_pack_xfr_pack_unit_cd = p.beansFactory.createTableColumn("Smpl.pack_xfr_pack_unit_cd", MCColumnType.TEXT);
		p.columnSmpl_pack_xfr_pack_unit_nm = p.beansFactory.createTableColumn("Smpl.pack_xfr_pack_unit_nm", MCColumnType.TEXT);
		p.columnSmpl_pack_xfr_pack_unit_dec_place = p.beansFactory.createTableColumn("Smpl.pack_xfr_pack_unit_dec_place", MCColumnType.NUMBER);
		p.columnSmpl_pack_xfr_pack_unit_dmn_qty = p.beansFactory.createTableColumn("Smpl.pack_xfr_pack_unit_dmn_qty", MCColumnType.NUMBER);
		p.columnSmpl_pack_xfr_pack_unit_conv_qty = p.beansFactory.createTableColumn("Smpl.pack_xfr_pack_unit_conv_qty", MCColumnType.NUMBER);
		p.columnSmpl_pack_xfr_base_unit_cd = p.beansFactory.createTableColumn("Smpl.pack_xfr_base_unit_cd", MCColumnType.TEXT);
		p.columnSmpl_pack_xfr_base_unit_nm = p.beansFactory.createTableColumn("Smpl.pack_xfr_base_unit_nm", MCColumnType.TEXT);
		p.columnSmpl_pack_xfr_base_unit_dec_place = p.beansFactory.createTableColumn("Smpl.pack_xfr_base_unit_dec_place", MCColumnType.NUMBER);
		p.columnSmpl_pack_xfr_base_unit_rnd_typ = p.beansFactory.createTableColumn("Smpl.pack_xfr_base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnSmpl_so_cmpl_flg = p.beansFactory.createTableColumn("Smpl.so_cmpl_flg", MCColumnType.CHECK);
		p.columnSmpl_wg_cd = p.beansFactory.createTableColumn("Smpl.wg_cd", MCColumnType.TEXT);
		p.columnSmpl_loc_cd = p.beansFactory.createTableColumn("Smpl.loc_cd", MCColumnType.TEXT_COMBO);
		p.columnSmpl_loc_nm = p.beansFactory.createTableColumn("Smpl.loc_nm", MCColumnType.TEXT);
		p.columnSmpl_str_ln_tgt_flg = p.beansFactory.createTableColumn("Smpl.str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnSmpl_stk_arrv_bp_cd = p.beansFactory.createTableColumn("Smpl.stk_arrv_bp_cd", MCColumnType.TEXT);
		p.columnSmpl_stk_arrv_bp_nm = p.beansFactory.createTableColumn("Smpl.stk_arrv_bp_nm", MCColumnType.TEXT);
		p.columnSmpl_gd_cd = p.beansFactory.createTableColumn("Smpl.gd_cd", MCColumnType.TEXT);
		p.columnSmpl_gd_nm = p.beansFactory.createTableColumn("Smpl.gd_nm", MCColumnType.TEXT);
		p.columnSmpl_quality_typ = p.beansFactory.createTableColumn("Smpl.quality_typ", MCColumnType.TEXT);
		p.columnSmpl_quality_typ_nm = p.beansFactory.createTableColumn("Smpl.quality_typ_nm", MCColumnType.TEXT);
		p.columnSmpl_stk_insp_typ = p.beansFactory.createTableColumn("Smpl.stk_insp_typ", MCColumnType.TEXT);
		p.columnSmpl_stk_insp_typ_nm = p.beansFactory.createTableColumn("Smpl.stk_insp_typ_nm", MCColumnType.TEXT);
		p.columnSmpl_stk_id_typ = p.beansFactory.createTableColumn("Smpl.stk_id_typ", MCColumnType.TEXT);
		p.columnSmpl_stk_id_typ_nm = p.beansFactory.createTableColumn("Smpl.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnSmpl_stk_bp_cd = p.beansFactory.createTableColumn("Smpl.stk_bp_cd", MCColumnType.TEXT);
		p.columnSmpl_stk_bp_nm = p.beansFactory.createTableColumn("Smpl.stk_bp_nm", MCColumnType.TEXT);
		p.columnSmpl_fix_no_typ = p.beansFactory.createTableColumn("Smpl.fix_no_typ", MCColumnType.TEXT);
		p.columnSmpl_fix_no_typ_nm = p.beansFactory.createTableColumn("Smpl.fix_no_typ_nm", MCColumnType.TEXT);
		p.columnSmpl_fix_no = p.beansFactory.createTableColumn("Smpl.fix_no", MCColumnType.TEXT);
		p.columnSmpl_ac_dt = p.beansFactory.createTableColumn("Smpl.ac_dt", MCColumnType.DATE);
		p.columnSmpl_bd_dpt_cd = p.beansFactory.createTableColumn("Smpl.bd_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnSmpl_bd_dpt_nm = p.beansFactory.createTableColumn("Smpl.bd_dpt_nm", MCColumnType.TEXT);
		p.columnSmpl_insp_smpl_act_no = p.beansFactory.createTableColumn("Smpl.insp_smpl_act_no", MCColumnType.TEXT);
		p.columnSmpl_insp_schd_no = p.beansFactory.createTableColumn("Smpl.insp_schd_no", MCColumnType.TEXT);
		p.columnSmpl_insp_no = p.beansFactory.createTableColumn("Smpl.insp_no", MCColumnType.TEXT);
		p.columnSmpl_insp_act_no = p.beansFactory.createTableColumn("Smpl.insp_act_no", MCColumnType.TEXT);
		p.columnSmpl_trd_rmrks = p.beansFactory.createTableColumn("Smpl.trd_rmrks", MCColumnType.TEXT);
		p.columnSmpl_intr_rmrks = p.beansFactory.createTableColumn("Smpl.intr_rmrks", MCColumnType.TEXT);
		p.columnSmpl_sub_char1 = p.beansFactory.createTableColumn("Smpl.sub_char1", MCColumnType.TEXT);
		p.columnSmpl_sub_char2 = p.beansFactory.createTableColumn("Smpl.sub_char2", MCColumnType.TEXT);
		p.columnSmpl_sub_char3 = p.beansFactory.createTableColumn("Smpl.sub_char3", MCColumnType.TEXT);
		p.columnSmpl_itm_cd = p.beansFactory.createTableColumn("Smpl.itm_cd", MCColumnType.TEXT);
		p.columnSmpl_itm_sub1 = p.beansFactory.createTableColumn("Smpl.itm_sub1", MCColumnType.TEXT);
		p.columnSmpl_itm_sub2 = p.beansFactory.createTableColumn("Smpl.itm_sub2", MCColumnType.TEXT);
		p.columnSmpl_itm_sub3 = p.beansFactory.createTableColumn("Smpl.itm_sub3", MCColumnType.TEXT);
		p.columnSmpl_lims_flg = p.beansFactory.createTableColumn("Smpl.lims_flg", MCColumnType.CHECK);
		p.columnSmpl_ext_sys_cd = p.beansFactory.createTableColumn("Smpl.ext_sys_cd", MCColumnType.TEXT);
		p.columnSmpl_ext_sys_nm = p.beansFactory.createTableColumn("Smpl.ext_sys_nm", MCColumnType.TEXT);
		p.columnSmpl_ext_insp_smpl_act_no = p.beansFactory.createTableColumn("Smpl.ext_insp_smpl_act_no", MCColumnType.TEXT);
	}

	/**
	 * [SmplBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSmplBtn(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.SmplBtnPanel = p.beansFactory.createPanel("SmplBtn");
		// ブロックの項目の初期化
		p.SmplBtn_radd = p.beansFactory.createButton("SmplBtn.radd", "no_border");
		p.SmplBtn_rdel = p.beansFactory.createButton("SmplBtn.rdel", "no_border");
		p.SmplBtn_rcopy = p.beansFactory.createButton("SmplBtn.rcopy", "no_border");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBFP0050 = p.beansFactory.createButton("Btn.open_MSBFP0050", "open");
		p.Btn_prnt = p.beansFactory.createButton("Btn.prnt", "prnt");
		p.Btn_act_ins = p.beansFactory.createButton("Btn.act_ins", "upd");
		p.Btn_act_upd = p.beansFactory.createButton("Btn.act_upd", "upd");
		p.Btn_act_del = p.beansFactory.createButton("Btn.act_del", "del");
		p.Btn_judg_upd = p.beansFactory.createButton("Btn.judg_upd", "upd");
		p.Btn_judg_del = p.beansFactory.createButton("Btn.judg_del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBFP_InspActReg p) {
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
	protected static void jbInitCnd(MSBFP_InspActReg p) {
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
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_JUDG);
		p.Cnd_ope_JUDG.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_JUDG);
		p.ScreenOpePanel.add(p.Cnd_ope_JUDG);
		p.Cnd_ope_JUDG.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("4");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0070.CndR.ope_META);
		p.CndPanel.add(p.Cnd_insp_no_Label);
		p.CndPanel.add(p.Cnd_insp_no);
		p.CndPanel.setLastBeans(p.Cnd_insp_no);
		p.Cnd_insp_no.setNextBeans(p.Cnd_srch);
		p.Cnd_insp_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0070.CndR.insp_no_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.add(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.Dtl1Panel);
		p.HdrTabPanel.add(p.HdrTabTab);
		p.HdrTabPanel.setLastBeans(p.HdrTabTab);
		p.HdrTabPanel.setLayoutPosition("CT");
		// ブロックの項目の初期化
		p.HdrTabTab.add(p.HdrPanel, "HdrTab.tab1");
		p.HdrTabTab.setLastBeans(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.JudgPanel);
		p.HdrTabTab.add(p.JudgPanel, "HdrTab.tab2");
		p.JudgPanel.setNextBeans(p.SystemInfoPanel);
		p.HdrTabTab.add(p.SystemInfoPanel, "HdrTab.tab3");
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setNextBeans(p.JudgPanel);
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_itm_p_PPanel);
		p.HdrPanel.setLastBeans(p.Hdr_itm_p_PPanel);
		p.Hdr_itm_p_PPanel.setNextBeans(p.Hdr_lot_no_p_PPanel);
		p.HdrPanel.add(p.Hdr_lot_no_p_PPanel);
		p.Hdr_lot_no_p_PPanel.setNextBeans(p.Hdr_ver_no);
		p.Hdr_ver_no.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_ver_no_Label);
		p.HdrPanel.add(p.Hdr_ver_no);
		p.Hdr_ver_no.setNextBeans(p.Hdr_insp_no);
		p.Hdr_ver_no.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.ver_no_META);
		p.HdrPanel.add(p.Hdr_insp_no_Label);
		p.HdrPanel.add(p.Hdr_insp_no);
		p.Hdr_insp_no.setNextBeans(p.Hdr_insp_act_no);
		p.Hdr_insp_no.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.insp_no_META);
		p.HdrPanel.add(p.Hdr_insp_act_no_Label);
		p.HdrPanel.add(p.Hdr_insp_act_no);
		p.Hdr_insp_act_no.setNextBeans(p.Hdr_insp_freq);
		p.Hdr_insp_act_no.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.insp_act_no_META);
		p.HdrPanel.add(p.Hdr_insp_freq_Label);
		p.HdrPanel.add(p.Hdr_insp_freq);
		p.Hdr_insp_freq.setNextBeans(p.Hdr_insp_mtd_typ);
		p.Hdr_insp_freq.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.insp_freq_META);
		p.HdrPanel.add(p.Hdr_insp_mtd_typ_Label);
		p.HdrPanel.add(p.Hdr_insp_mtd_typ);
		p.Hdr_insp_mtd_typ.setNextBeans(p.Hdr_insp_mtd_typ_nm);
		p.Hdr_insp_mtd_typ.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.insp_mtd_typ_META);
		p.HdrPanel.add(p.Hdr_insp_mtd_typ_nm);
		p.Hdr_insp_mtd_typ_nm.setNextBeans(p.Hdr_insp_typ);
		p.Hdr_insp_mtd_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.insp_mtd_typ_nm_META);
		p.HdrPanel.add(p.Hdr_insp_typ_Label);
		p.HdrPanel.add(p.Hdr_insp_typ);
		p.Hdr_insp_typ.setNextBeans(p.Hdr_insp_typ_nm);
		p.Hdr_insp_typ.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.insp_typ_META);
		p.HdrPanel.add(p.Hdr_insp_typ_nm);
		p.Hdr_insp_typ_nm.setNextBeans(p.Hdr_insp_sts_typ);
		p.Hdr_insp_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.insp_typ_nm_META);
		p.HdrPanel.add(p.Hdr_insp_sts_typ_Label);
		p.HdrPanel.add(p.Hdr_insp_sts_typ);
		p.Hdr_insp_sts_typ.setNextBeans(p.Hdr_insp_sts_typ_nm);
		p.Hdr_insp_sts_typ.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.insp_sts_typ_META);
		p.HdrPanel.add(p.Hdr_insp_sts_typ_nm);
		p.Hdr_insp_sts_typ_nm.setNextBeans(p.Hdr_inst_pack_unit_qty_p_PPanel);
		p.Hdr_insp_sts_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.insp_sts_typ_nm_META);
		p.HdrPanel.add(p.Hdr_inst_pack_unit_qty_p_PPanel);
		p.Hdr_inst_pack_unit_qty_p_PPanel.setNextBeans(p.Hdr_pack_unit_cd);
		p.HdrPanel.add(p.Hdr_pack_unit_cd_Label);
		p.HdrPanel.add(p.Hdr_pack_unit_cd);
		p.Hdr_pack_unit_cd.setNextBeans(p.Hdr_pack_unit_nm);
		p.Hdr_pack_unit_cd.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.pack_unit_cd_META);
		p.HdrPanel.add(p.Hdr_pack_unit_nm);
		p.Hdr_pack_unit_nm.setNextBeans(p.Hdr_pack_unit_dec_place);
		p.Hdr_pack_unit_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.pack_unit_nm_META);
		p.HdrPanel.add(p.Hdr_pack_unit_dec_place);
		p.Hdr_pack_unit_dec_place.setNextBeans(p.Hdr_inst_base_unit_qty_p_PPanel);
		p.Hdr_pack_unit_dec_place.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.pack_unit_dec_place_META);
		p.HdrPanel.add(p.Hdr_inst_base_unit_qty_p_PPanel);
		p.Hdr_inst_base_unit_qty_p_PPanel.setNextBeans(p.Hdr_rem_base_unit_qty_p_PPanel);
		p.HdrPanel.add(p.Hdr_rem_base_unit_qty_p_PPanel);
		p.Hdr_rem_base_unit_qty_p_PPanel.setNextBeans(p.Hdr_good_qty_p_PPanel);
		p.HdrPanel.add(p.Hdr_good_qty_p_PPanel);
		p.Hdr_good_qty_p_PPanel.setNextBeans(p.Hdr_dfct_qty_p_PPanel);
		p.HdrPanel.add(p.Hdr_dfct_qty_p_PPanel);
		p.Hdr_dfct_qty_p_PPanel.setNextBeans(p.Hdr_act_ttl_qty_p_PPanel);
		p.HdrPanel.add(p.Hdr_act_ttl_qty_p_PPanel);
		p.Hdr_act_ttl_qty_p_PPanel.setNextBeans(p.Hdr_smpl_inst_qty_p_PPanel);
		p.HdrPanel.add(p.Hdr_smpl_inst_qty_p_PPanel);
		p.Hdr_smpl_inst_qty_p_PPanel.setNextBeans(p.Hdr_smpl_inst_unit_cd);
		p.Hdr_smpl_inst_unit_cd.setListType(MCListType.STRICT);
		p.Hdr_smpl_inst_unit_cd.setLinkBeans(p.Hdr_smpl_inst_unit_nm);
		p.HdrPanel.add(p.Hdr_smpl_inst_unit_cd_Label);
		p.HdrPanel.add(p.Hdr_smpl_inst_unit_cd);
		p.Hdr_smpl_inst_unit_cd.setNextBeans(p.Hdr_smpl_inst_unit_nm);
		p.Hdr_smpl_inst_unit_cd.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.smpl_inst_unit_cd_META);
		p.HdrPanel.add(p.Hdr_smpl_inst_unit_nm);
		p.Hdr_smpl_inst_unit_nm.setNextBeans(p.Hdr_smpl_inst_unit_dec_place);
		p.Hdr_smpl_inst_unit_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.smpl_inst_unit_nm_META);
		p.HdrPanel.add(p.Hdr_smpl_inst_unit_dec_place);
		p.Hdr_smpl_inst_unit_dec_place.setNextBeans(p.Hdr_base_unit_cd);
		p.Hdr_smpl_inst_unit_dec_place.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.smpl_inst_unit_dec_place_META);
		p.HdrPanel.add(p.Hdr_base_unit_cd_Label);
		p.HdrPanel.add(p.Hdr_base_unit_cd);
		p.Hdr_base_unit_cd.setNextBeans(p.Hdr_base_unit_nm);
		p.Hdr_base_unit_cd.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.base_unit_cd_META);
		p.HdrPanel.add(p.Hdr_base_unit_nm);
		p.Hdr_base_unit_nm.setNextBeans(p.Hdr_base_unit_dec_place);
		p.Hdr_base_unit_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.base_unit_nm_META);
		p.HdrPanel.add(p.Hdr_base_unit_dec_place);
		p.Hdr_base_unit_dec_place.setNextBeans(p.Hdr_base_unit_rnd_typ);
		p.Hdr_base_unit_dec_place.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.base_unit_dec_place_META);
		p.HdrPanel.add(p.Hdr_base_unit_rnd_typ_Label);
		p.HdrPanel.add(p.Hdr_base_unit_rnd_typ);
		p.Hdr_base_unit_rnd_typ.setNextBeans(p.Hdr_mfg_loc_cd);
		p.Hdr_base_unit_rnd_typ.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.base_unit_rnd_typ_META);
		p.HdrPanel.add(p.Hdr_mfg_loc_cd_Label);
		p.HdrPanel.add(p.Hdr_mfg_loc_cd);
		p.Hdr_mfg_loc_cd.setNextBeans(p.Hdr_mfg_loc_nm);
		p.Hdr_mfg_loc_cd.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.mfg_loc_cd_META);
		p.HdrPanel.add(p.Hdr_mfg_loc_nm);
		p.Hdr_mfg_loc_nm.setNextBeans(p.Hdr_sppl_cd);
		p.Hdr_mfg_loc_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.mfg_loc_nm_META);
		p.HdrPanel.add(p.Hdr_sppl_cd_Label);
		p.HdrPanel.add(p.Hdr_sppl_cd);
		p.Hdr_sppl_cd.setNextBeans(p.Hdr_sppl_nm);
		p.Hdr_sppl_cd.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.sppl_cd_META);
		p.HdrPanel.add(p.Hdr_sppl_nm);
		p.Hdr_sppl_nm.setNextBeans(p.Hdr_maker_cd);
		p.Hdr_sppl_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.sppl_nm_META);
		p.HdrPanel.add(p.Hdr_maker_cd_Label);
		p.HdrPanel.add(p.Hdr_maker_cd);
		p.Hdr_maker_cd.setNextBeans(p.Hdr_maker_nm);
		p.Hdr_maker_cd.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.maker_cd_META);
		p.HdrPanel.add(p.Hdr_maker_nm);
		p.Hdr_maker_nm.setNextBeans(p.Hdr_bp_lot_no);
		p.Hdr_maker_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.maker_nm_META);
		p.HdrPanel.add(p.Hdr_bp_lot_no_Label);
		p.HdrPanel.add(p.Hdr_bp_lot_no);
		p.Hdr_bp_lot_no.setNextBeans(p.Hdr_std_insp_flg);
		p.Hdr_bp_lot_no.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.bp_lot_no_META);
		p.HdrPanel.add(p.Hdr_std_insp_flg);
		p.Hdr_std_insp_flg.setNextBeans(p.Hdr_std_req_flg);
		p.Hdr_std_insp_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.std_insp_flg_META);
		p.HdrPanel.add(p.Hdr_std_req_flg);
		p.Hdr_std_req_flg.setNextBeans(p.Hdr_std_cnf_req_flg);
		p.Hdr_std_req_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.std_req_flg_META);
		p.HdrPanel.add(p.Hdr_std_cnf_req_flg);
		p.Hdr_std_cnf_req_flg.setNextBeans(p.Hdr_std_cmpl_flg);
		p.Hdr_std_cnf_req_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.std_cnf_req_flg_META);
		p.HdrPanel.add(p.Hdr_std_cmpl_flg);
		p.Hdr_std_cmpl_flg.setNextBeans(p.Hdr_std_cnf_cmpl_flg);
		p.Hdr_std_cmpl_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.std_cmpl_flg_META);
		p.HdrPanel.add(p.Hdr_std_cnf_cmpl_flg);
		p.Hdr_std_cnf_cmpl_flg.setNextBeans(p.Hdr_insp_rslt_prnt_flg);
		p.Hdr_std_cnf_cmpl_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.std_cnf_cmpl_flg_META);
		p.HdrPanel.add(p.Hdr_insp_rslt_prnt_flg);
		p.Hdr_insp_rslt_prnt_flg.setNextBeans(p.Hdr_insp_rslt_prnt_tm);
		p.Hdr_insp_rslt_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.insp_rslt_prnt_flg_META);
		p.HdrPanel.add(p.Hdr_insp_rslt_prnt_tm_Label);
		p.HdrPanel.add(p.Hdr_insp_rslt_prnt_tm);
		p.Hdr_insp_rslt_prnt_tm.setNextBeans(p.Hdr_st_dt_p_PPanel);
		p.Hdr_insp_rslt_prnt_tm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.insp_rslt_prnt_tm_META);
		p.Hdr_insp_rslt_prnt_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.HdrPanel.add(p.Hdr_st_dt_p_PPanel);
		p.Hdr_st_dt_p_PPanel.setNextBeans(p.Hdr_end_dt_p_PPanel);
		p.HdrPanel.add(p.Hdr_end_dt_p_PPanel);
		p.Hdr_end_dt_p_PPanel.setNextBeans(p.Hdr_act_usr_dpt_p_PPanel);
		p.HdrPanel.add(p.Hdr_act_usr_dpt_p_PPanel);
		p.Hdr_act_usr_dpt_p_PPanel.setNextBeans(p.Hdr_quality_typ);
		p.Hdr_act_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.Hdr_act_dpt_nm);
		p.Hdr_quality_typ.setListType(MCListType.STRICT);
		p.Hdr_quality_typ.setLinkBeans(p.Hdr_quality_typ_nm);
		p.HdrPanel.add(p.Hdr_quality_typ_Label);
		p.HdrPanel.add(p.Hdr_quality_typ);
		p.Hdr_quality_typ.setNextBeans(p.Hdr_quality_typ_nm);
		p.Hdr_quality_typ.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.quality_typ_META);
		p.HdrPanel.add(p.Hdr_quality_typ_nm);
		p.Hdr_quality_typ_nm.setNextBeans(p.Hdr_gd_cd);
		p.Hdr_quality_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.quality_typ_nm_META);
		p.Hdr_gd_cd.setListType(MCListType.STRICT);
		p.Hdr_gd_cd.setLinkBeans(p.Hdr_gd_nm);
		p.HdrPanel.add(p.Hdr_gd_cd_Label);
		p.HdrPanel.add(p.Hdr_gd_cd);
		p.Hdr_gd_cd.setNextBeans(p.Hdr_gd_nm);
		p.Hdr_gd_cd.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.gd_cd_META);
		p.HdrPanel.add(p.Hdr_gd_nm);
		p.Hdr_gd_nm.setNextBeans(p.Hdr_dfct_rsn_cd);
		p.Hdr_gd_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.gd_nm_META);
		p.Hdr_dfct_rsn_cd.setListType(MCListType.STRICT);
		p.Hdr_dfct_rsn_cd.setLinkBeans(p.Hdr_dfct_rsn_nm);
		p.HdrPanel.add(p.Hdr_dfct_rsn_cd_Label);
		p.HdrPanel.add(p.Hdr_dfct_rsn_cd);
		p.Hdr_dfct_rsn_cd.setNextBeans(p.Hdr_dfct_rsn_nm);
		p.Hdr_dfct_rsn_cd.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.dfct_rsn_cd_META);
		p.HdrPanel.add(p.Hdr_dfct_rsn_nm);
		p.Hdr_dfct_rsn_nm.setNextBeans(p.Hdr_std_cont_fctrt_p_PPanel);
		p.Hdr_dfct_rsn_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.dfct_rsn_nm_META);
		p.HdrPanel.add(p.Hdr_std_cont_fctrt_p_PPanel);
		p.Hdr_std_cont_fctrt_p_PPanel.setNextBeans(p.Hdr_act_cont_fctr_p_PPanel);
		p.HdrPanel.add(p.Hdr_act_cont_fctr_p_PPanel);
		p.Hdr_act_cont_fctr_p_PPanel.setNextBeans(p.Hdr_vld_dt_upd_flg);
		p.HdrPanel.add(p.Hdr_vld_dt_upd_flg);
		p.Hdr_vld_dt_upd_flg.setNextBeans(p.Hdr_vld_pd);
		p.Hdr_vld_dt_upd_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.vld_dt_upd_flg_META);
		p.HdrPanel.add(p.Hdr_vld_pd_Label);
		p.HdrPanel.add(p.Hdr_vld_pd);
		p.Hdr_vld_pd.setNextBeans(p.Hdr_lmt_pd);
		p.Hdr_vld_pd.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.vld_pd_META);
		p.HdrPanel.add(p.Hdr_lmt_pd_Label);
		p.HdrPanel.add(p.Hdr_lmt_pd);
		p.Hdr_lmt_pd.setNextBeans(p.Hdr_calc_pd_typ);
		p.Hdr_lmt_pd.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.lmt_pd_META);
		p.HdrPanel.add(p.Hdr_calc_pd_typ_Label);
		p.HdrPanel.add(p.Hdr_calc_pd_typ);
		p.Hdr_calc_pd_typ.setNextBeans(p.Hdr_calc_pd_typ_nm);
		p.Hdr_calc_pd_typ.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.calc_pd_typ_META);
		p.HdrPanel.add(p.Hdr_calc_pd_typ_nm);
		p.Hdr_calc_pd_typ_nm.setNextBeans(p.Hdr_lmt_dt_frm_typ);
		p.Hdr_calc_pd_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.calc_pd_typ_nm_META);
		p.HdrPanel.add(p.Hdr_lmt_dt_frm_typ_Label);
		p.HdrPanel.add(p.Hdr_lmt_dt_frm_typ);
		p.Hdr_lmt_dt_frm_typ.setNextBeans(p.Hdr_lmt_dt_frm_typ_nm);
		p.Hdr_lmt_dt_frm_typ.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.lmt_dt_frm_typ_META);
		p.HdrPanel.add(p.Hdr_lmt_dt_frm_typ_nm);
		p.Hdr_lmt_dt_frm_typ_nm.setNextBeans(p.Hdr_lmt_ctl_categ);
		p.Hdr_lmt_dt_frm_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.lmt_dt_frm_typ_nm_META);
		p.HdrPanel.add(p.Hdr_lmt_ctl_categ_Label);
		p.HdrPanel.add(p.Hdr_lmt_ctl_categ);
		p.Hdr_lmt_ctl_categ.setNextBeans(p.Hdr_lmt_dt_frm);
		p.Hdr_lmt_ctl_categ.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.lmt_ctl_categ_META);
		p.HdrPanel.add(p.Hdr_lmt_dt_frm_Label);
		p.HdrPanel.add(p.Hdr_lmt_dt_frm);
		p.Hdr_lmt_dt_frm.setNextBeans(p.Hdr_vld_dt_now);
		p.Hdr_lmt_dt_frm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.lmt_dt_frm_META);
		p.Hdr_lmt_dt_frm.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_vld_dt_now_Label);
		p.HdrPanel.add(p.Hdr_vld_dt_now);
		p.Hdr_vld_dt_now.setNextBeans(p.Hdr_vld_dt);
		p.Hdr_vld_dt_now.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.vld_dt_now_META);
		p.Hdr_vld_dt_now.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_vld_dt_Label);
		p.HdrPanel.add(p.Hdr_vld_dt);
		p.Hdr_vld_dt.setNextBeans(p.Hdr_lmt_dt);
		p.Hdr_vld_dt.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.vld_dt_META);
		p.Hdr_vld_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_lmt_dt_Label);
		p.HdrPanel.add(p.Hdr_lmt_dt);
		p.Hdr_lmt_dt.setNextBeans(p.Hdr_lmt_up_flg);
		p.Hdr_lmt_dt.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.lmt_dt_META);
		p.Hdr_lmt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_lmt_up_flg);
		p.Hdr_lmt_up_flg.setNextBeans(p.Hdr_in_prmt_insp_flg);
		p.Hdr_lmt_up_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.lmt_up_flg_META);
		p.HdrPanel.add(p.Hdr_in_prmt_insp_flg);
		p.Hdr_in_prmt_insp_flg.setNextBeans(p.Hdr_intr_rmrks);
		p.Hdr_in_prmt_insp_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.in_prmt_insp_flg_META);
		p.HdrPanel.add(p.Hdr_intr_rmrks_Label);
		p.HdrPanel.add(p.Hdr_intr_rmrks);
		p.Hdr_intr_rmrks.setNextBeans(p.Hdr_lot_rmrks);
		p.Hdr_intr_rmrks.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.intr_rmrks_META);
		p.HdrPanel.add(p.Hdr_lot_rmrks_Label);
		p.HdrPanel.add(p.Hdr_lot_rmrks);
		p.Hdr_lot_rmrks.setNextBeans(p.Hdr_sub_char1);
		p.Hdr_lot_rmrks.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.lot_rmrks_META);
		p.HdrPanel.add(p.Hdr_sub_char1_Label);
		p.HdrPanel.add(p.Hdr_sub_char1);
		p.Hdr_sub_char1.setNextBeans(p.Hdr_sub_char2);
		p.Hdr_sub_char1.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.sub_char1_META);
		p.HdrPanel.add(p.Hdr_sub_char2_Label);
		p.HdrPanel.add(p.Hdr_sub_char2);
		p.Hdr_sub_char2.setNextBeans(p.Hdr_sub_char3);
		p.Hdr_sub_char2.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.sub_char2_META);
		p.HdrPanel.add(p.Hdr_sub_char3_Label);
		p.HdrPanel.add(p.Hdr_sub_char3);
		p.Hdr_sub_char3.setNextBeans(p.Hdr_lims_flg);
		p.Hdr_sub_char3.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.sub_char3_META);
		p.HdrPanel.add(p.Hdr_lims_flg);
		p.Hdr_lims_flg.setNextBeans(p.Hdr_ext_sys_cd);
		p.Hdr_lims_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.lims_flg_META);
		p.HdrPanel.add(p.Hdr_ext_sys_cd_Label);
		p.HdrPanel.add(p.Hdr_ext_sys_cd);
		p.Hdr_ext_sys_cd.setNextBeans(p.Hdr_ext_sys_nm);
		p.Hdr_ext_sys_cd.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.ext_sys_cd_META);
		p.HdrPanel.add(p.Hdr_ext_sys_nm_Label);
		p.HdrPanel.add(p.Hdr_ext_sys_nm);
		p.Hdr_ext_sys_nm.setNextBeans(p.Hdr_ext_insp_act_no);
		p.Hdr_ext_sys_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.ext_sys_nm_META);
		p.HdrPanel.add(p.Hdr_ext_insp_act_no_Label);
		p.HdrPanel.add(p.Hdr_ext_insp_act_no);
		p.Hdr_ext_insp_act_no.setNextBeans(p.Hdr_cont_fctr_flg);
		p.Hdr_ext_insp_act_no.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.ext_insp_act_no_META);
		p.JudgItmPanel.add(p.Hdr_insp_aprv_sts_typ_Label);
		p.JudgItmPanel.add(p.Hdr_insp_aprv_sts_typ);
		p.JudgItmPanel.setLastBeans(p.Hdr_insp_aprv_sts_typ);
		p.Hdr_insp_aprv_sts_typ.setNextBeans(p.Hdr_insp_aprv_sts_typ_nm);
		p.Hdr_insp_aprv_sts_typ.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.insp_aprv_sts_typ_META);
		p.JudgItmPanel.add(p.Hdr_insp_aprv_sts_typ_nm);
		p.Hdr_insp_aprv_sts_typ_nm.setNextBeans(p.Hdr_insp_judg_rslt_typ);
		p.Hdr_insp_aprv_sts_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.insp_aprv_sts_typ_nm_META);
		p.Hdr_insp_judg_rslt_typ.setListType(MCListType.STRICT);
		p.Hdr_insp_judg_rslt_typ.setLinkBeans(p.Hdr_insp_judg_rslt_typ_nm);
		p.JudgItmPanel.add(p.Hdr_insp_judg_rslt_typ_Label);
		p.JudgItmPanel.add(p.Hdr_insp_judg_rslt_typ);
		p.Hdr_insp_judg_rslt_typ.setNextBeans(p.Hdr_insp_judg_rslt_typ_nm);
		p.Hdr_insp_judg_rslt_typ.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.insp_judg_rslt_typ_META);
		p.JudgItmPanel.add(p.Hdr_insp_judg_rslt_typ_nm);
		p.Hdr_insp_judg_rslt_typ_nm.setNextBeans(p.Hdr_judg_dt);
		p.Hdr_insp_judg_rslt_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.insp_judg_rslt_typ_nm_META);
		p.JudgItmPanel.add(p.Hdr_judg_dt_Label);
		p.JudgItmPanel.add(p.Hdr_judg_dt);
		p.Hdr_judg_dt.setNextBeans(p.Hdr_judg_ttl_qty_p_PPanel);
		p.Hdr_judg_dt.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.judg_dt_META);
		p.Hdr_judg_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.JudgItmPanel.add(p.Hdr_judg_ttl_qty_p_PPanel);
		p.Hdr_judg_ttl_qty_p_PPanel.setNextBeans(p.Hdr_judg_usr_dpt_p_PPanel);
		p.JudgItmPanel.add(p.Hdr_judg_usr_dpt_p_PPanel);
		p.Hdr_judg_usr_dpt_p_PPanel.setNextBeans(p.Hdr_judg_rsn_p_PPanel);
		p.Hdr_judg_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.Hdr_judg_dpt_nm);
		p.JudgItmPanel.add(p.Hdr_judg_rsn_p_PPanel);
		p.SystemInfoPanel.add(p.Hdr_ins_usr_id_Label);
		p.SystemInfoPanel.add(p.Hdr_ins_usr_id);
		p.SystemInfoPanel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.ins_usr_id_META);
		p.SystemInfoPanel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.ins_usr_nm_META);
		p.SystemInfoPanel.add(p.Hdr_ins_func_id_Label);
		p.SystemInfoPanel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.ins_func_id_META);
		p.SystemInfoPanel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.ins_func_nm_META);
		p.SystemInfoPanel.add(p.Hdr_upd_usr_id_Label);
		p.SystemInfoPanel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.upd_usr_id_META);
		p.SystemInfoPanel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.upd_usr_nm_META);
		p.SystemInfoPanel.add(p.Hdr_upd_func_id_Label);
		p.SystemInfoPanel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.upd_func_id_META);
		p.SystemInfoPanel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.upd_func_nm_META);
		p.SystemInfoPanel.add(p.Hdr_ins_ts_Label);
		p.SystemInfoPanel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.SystemInfoPanel.add(p.Hdr_upd_ts_Label);
		p.SystemInfoPanel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.SystemInfoPanel.add(p.Hdr_upd_srv_req_no_Label);
		p.SystemInfoPanel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.upd_srv_req_no_META);
		p.HdrPanel.add(p.Hdr_cont_fctr_flg);
		p.Hdr_cont_fctr_flg.setNextBeans(p.Hdr_insp_ptn_cd);
		p.Hdr_cont_fctr_flg.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.cont_fctr_flg_META);
		p.HdrPanel.add(p.Hdr_insp_ptn_cd);
		p.Hdr_insp_ptn_cd.setNextBeans(p.Hdr_site_cd);
		p.Hdr_insp_ptn_cd.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.insp_ptn_cd_META);
		p.HdrPanel.add(p.Hdr_site_cd);
		p.Hdr_site_cd.setRow(p.getHdrR(), mcframe.clientMSBF.MSBFP0070.HdrR.site_cd_META);
	}

	/**
	 * [SystemInfo]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSystemInfo(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Judg]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitJudg(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.JudgPanel.setNextBeans(p.SystemInfoPanel);
		// ブロックの項目の初期化
		p.JudgPanel.add(p.JudgItmPanel, null);
		p.JudgPanel.setLastBeans(p.JudgItmPanel);
		p.JudgItmPanel.setNextBeans(p.JudgBtnPanel);
		p.JudgPanel.add(p.JudgBtnPanel, null);
		p.JudgBtnPanel.setNextBeans(p.JudgEastBtnPanel);
		p.JudgPanel.add(p.JudgEastBtnPanel, null);
	}

	/**
	 * [JudgItm]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitJudgItm(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.JudgItmPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [JudgBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitJudgBtn(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.JudgBtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [JudgEastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitJudgEastBtn(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.JudgEastBtnPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl1(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.add(p.Dtl1Panel);
		p.Dtl1Panel.setNextBeans(p.Dtl2Panel);
		p.Dtl1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Dtl1Panel.setLayoutPosition("CBCTC+");
		// ブロックの項目の初期化
		p.Dtl1Panel.add(p.DtlPanel, null);
		p.Dtl1Panel.setLastBeans(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.DtlBtnPanel);
		p.Dtl1Panel.add(p.DtlBtnPanel, null);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtn(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.DtlBtnPanel.add(p.DtlBtn_rdel);
		p.DtlBtnPanel.setLastBeans(p.DtlBtn_rdel);
		p.DtlBtn_rdel.setNextBeans(p.DtlBtn_rcopy);
		p.DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.DtlBtnPanel.add(p.DtlBtn_rcopy);
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl2(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.add(p.Dtl2Panel);
		p.Dtl2Panel.setNextBeans(p.BtnPanel);
		p.Dtl2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Dtl2Panel.setLayoutPosition("CBCBC+");
		// ブロックの項目の初期化
		p.Dtl2Panel.add(p.SmplPanel, null);
		p.Dtl2Panel.setLastBeans(p.SmplPanel);
		p.SmplPanel.setNextBeans(p.SmplBtnPanel);
		p.Dtl2Panel.add(p.SmplBtnPanel, null);
	}

	/**
	 * [Smpl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSmpl(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.SmplPanel.add(p.SmplScrollPane);
		p.SmplPanel.setLastBeans(p.SmplTable);
		p.SmplScrollPane.setViewportView(p.SmplTable);
		p.SmplTable.setList(p.getSmplL());
		p.SmplPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [SmplBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSmplBtn(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.SmplBtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.SmplBtn_radd.setIcon("INSERT_RECORD");
		p.SmplBtn_radd.setFunctionKey(MCFunctionKey.F7);
		p.SmplBtnPanel.add(p.SmplBtn_radd);
		p.SmplBtnPanel.setLastBeans(p.SmplBtn_radd);
		p.SmplBtn_radd.setNextBeans(p.SmplBtn_rdel);
		p.SmplBtn_rdel.setIcon("DELETE_RECORD");
		p.SmplBtn_rdel.setFunctionKey(MCFunctionKey.F8);
		p.SmplBtnPanel.add(p.SmplBtn_rdel);
		p.SmplBtn_rdel.setNextBeans(p.SmplBtn_rcopy);
		p.SmplBtn_rcopy.setIcon("COPY_RECORD");
		p.SmplBtn_rcopy.setFunctionKey(MCFunctionKey.F19);
		p.SmplBtnPanel.add(p.SmplBtn_rcopy);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBFP_InspActReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBFP0050.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBFP0050);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBFP0050);
		p.Btn_open_MSBFP0050.setNextBeans(p.Btn_prnt);
		p.Btn_prnt.setIcon("PRINT");
		p.Btn_prnt.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_prnt);
		p.Btn_prnt.setNextBeans(p.Btn_act_ins);
		p.Btn_act_ins.setIcon("REGISTER");
		p.Btn_act_ins.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_act_ins);
		p.Btn_act_ins.setNextBeans(p.Btn_act_upd);
		p.Btn_act_upd.setIcon("REGISTER");
		p.Btn_act_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_act_upd);
		p.Btn_act_del.setIcon("CANCEL");
		p.Btn_act_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_act_del);
		p.EastBtnPanel.add(p.Btn_act_del);
		p.Btn_judg_upd.setIcon("REGISTER");
		p.Btn_judg_upd.setFunctionKey(MCFunctionKey.F9);
		p.JudgBtnPanel.setLastBeans(p.Btn_judg_upd);
		p.JudgBtnPanel.add(p.Btn_judg_upd);
		p.Btn_judg_del.setIcon("CANCEL");
		p.Btn_judg_del.setFunctionKey(MCFunctionKey.F12);
		p.JudgEastBtnPanel.setLastBeans(p.Btn_judg_del);
		p.JudgEastBtnPanel.add(p.Btn_judg_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBFP_InspActReg p) {
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
		MSBFP_InspActReg_MC.mcInitScreenOpe((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.mcInitCnd((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.mcInitHdrTab((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.mcInitHdr((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.mcInitSystemInfo((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.mcInitJudg((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.mcInitJudgItm((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.mcInitJudgBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.mcInitJudgEastBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.mcInitDtl1((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.mcInitDtl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.mcInitDtlBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.mcInitDtl2((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.mcInitSmpl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.mcInitSmplBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.mcInitBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.mcInitEastBtn((MSBFP_InspActReg)this);

		// [SRCH]ステータスのモードの設定
		MSBFP_InspActReg_MC.statusInitSRCH_ScreenOpe((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitSRCH_Cnd((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitSRCH_HdrTab((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitSRCH_Hdr((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitSRCH_SystemInfo((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitSRCH_Judg((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitSRCH_JudgItm((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitSRCH_JudgBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitSRCH_JudgEastBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitSRCH_Dtl1((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitSRCH_Dtl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitSRCH_DtlBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitSRCH_Dtl2((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitSRCH_Smpl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitSRCH_SmplBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitSRCH_Btn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitSRCH_EastBtn((MSBFP_InspActReg)this);

		// [INS]ステータスのモードの設定
		MSBFP_InspActReg_MC.statusInitINS_ScreenOpe((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitINS_Cnd((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitINS_HdrTab((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitINS_Hdr((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitINS_SystemInfo((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitINS_Judg((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitINS_JudgItm((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitINS_JudgBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitINS_JudgEastBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitINS_Dtl1((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitINS_Dtl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitINS_DtlBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitINS_Dtl2((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitINS_Smpl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitINS_SmplBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitINS_Btn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitINS_EastBtn((MSBFP_InspActReg)this);

		// [FIX_I]ステータスのモードの設定
		MSBFP_InspActReg_MC.statusInitFIX__I_ScreenOpe((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__I_Cnd((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__I_HdrTab((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__I_Hdr((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__I_SystemInfo((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__I_Judg((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__I_JudgItm((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__I_JudgBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__I_JudgEastBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__I_Dtl1((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__I_Dtl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__I_DtlBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__I_Dtl2((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__I_Smpl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__I_SmplBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__I_Btn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__I_EastBtn((MSBFP_InspActReg)this);

		// [UPD]ステータスのモードの設定
		MSBFP_InspActReg_MC.statusInitUPD_ScreenOpe((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitUPD_Cnd((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitUPD_HdrTab((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitUPD_Hdr((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitUPD_SystemInfo((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitUPD_Judg((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitUPD_JudgItm((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitUPD_JudgBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitUPD_JudgEastBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitUPD_Dtl1((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitUPD_Dtl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitUPD_DtlBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitUPD_Dtl2((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitUPD_Smpl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitUPD_SmplBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitUPD_Btn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitUPD_EastBtn((MSBFP_InspActReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBFP_InspActReg_MC.statusInitFIX__U_ScreenOpe((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__U_Cnd((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__U_HdrTab((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__U_Hdr((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__U_SystemInfo((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__U_Judg((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__U_JudgItm((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__U_JudgBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__U_JudgEastBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__U_Dtl1((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__U_Dtl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__U_DtlBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__U_Dtl2((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__U_Smpl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__U_SmplBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__U_Btn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__U_EastBtn((MSBFP_InspActReg)this);

		// [JUDG]ステータスのモードの設定
		MSBFP_InspActReg_MC.statusInitJUDG_ScreenOpe((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitJUDG_Cnd((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitJUDG_HdrTab((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitJUDG_Hdr((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitJUDG_SystemInfo((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitJUDG_Judg((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitJUDG_JudgItm((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitJUDG_JudgBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitJUDG_JudgEastBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitJUDG_Dtl1((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitJUDG_Dtl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitJUDG_DtlBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitJUDG_Dtl2((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitJUDG_Smpl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitJUDG_SmplBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitJUDG_Btn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitJUDG_EastBtn((MSBFP_InspActReg)this);

		// [FIX_J]ステータスのモードの設定
		MSBFP_InspActReg_MC.statusInitFIX__J_ScreenOpe((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__J_Cnd((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__J_HdrTab((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__J_Hdr((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__J_SystemInfo((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__J_Judg((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__J_JudgItm((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__J_JudgBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__J_JudgEastBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__J_Dtl1((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__J_Dtl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__J_DtlBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__J_Dtl2((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__J_Smpl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__J_SmplBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__J_Btn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__J_EastBtn((MSBFP_InspActReg)this);

		// [DEL]ステータスのモードの設定
		MSBFP_InspActReg_MC.statusInitDEL_ScreenOpe((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitDEL_Cnd((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitDEL_HdrTab((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitDEL_Hdr((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitDEL_SystemInfo((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitDEL_Judg((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitDEL_JudgItm((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitDEL_JudgBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitDEL_JudgEastBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitDEL_Dtl1((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitDEL_Dtl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitDEL_DtlBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitDEL_Dtl2((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitDEL_Smpl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitDEL_SmplBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitDEL_Btn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitDEL_EastBtn((MSBFP_InspActReg)this);

		// [FIX_D]ステータスのモードの設定
		MSBFP_InspActReg_MC.statusInitFIX__D_ScreenOpe((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__D_Cnd((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__D_HdrTab((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__D_Hdr((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__D_SystemInfo((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__D_Judg((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__D_JudgItm((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__D_JudgBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__D_JudgEastBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__D_Dtl1((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__D_Dtl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__D_DtlBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__D_Dtl2((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__D_Smpl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__D_SmplBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__D_Btn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitFIX__D_EastBtn((MSBFP_InspActReg)this);

		// [REF]ステータスのモードの設定
		MSBFP_InspActReg_MC.statusInitREF_ScreenOpe((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitREF_Cnd((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitREF_HdrTab((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitREF_Hdr((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitREF_SystemInfo((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitREF_Judg((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitREF_JudgItm((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitREF_JudgBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitREF_JudgEastBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitREF_Dtl1((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitREF_Dtl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitREF_DtlBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitREF_Dtl2((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitREF_Smpl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitREF_SmplBtn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitREF_Btn((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.statusInitREF_EastBtn((MSBFP_InspActReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBFP_InspActReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBFP_InspActReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_JUDG.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_insp_no.setListListener(p);
		p.Cnd_insp_no.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBFP_InspActReg p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBFP_InspActReg p) {
		p.Hdr_ver_no.setListListener(p);
		p.Hdr_ver_no.addAllListener(p);
		p.Hdr_insp_no.setListListener(p);
		p.Hdr_insp_no.addAllListener(p);
		p.Hdr_insp_act_no.setListListener(p);
		p.Hdr_insp_act_no.addAllListener(p);
		p.Hdr_insp_freq.setListListener(p);
		p.Hdr_insp_freq.addAllListener(p);
		p.Hdr_insp_mtd_typ.setListListener(p);
		p.Hdr_insp_mtd_typ.addAllListener(p);
		p.Hdr_insp_mtd_typ_nm.setListListener(p);
		p.Hdr_insp_mtd_typ_nm.addAllListener(p);
		p.Hdr_insp_typ.setListListener(p);
		p.Hdr_insp_typ.addAllListener(p);
		p.Hdr_insp_typ_nm.setListListener(p);
		p.Hdr_insp_typ_nm.addAllListener(p);
		p.Hdr_insp_sts_typ.setListListener(p);
		p.Hdr_insp_sts_typ.addAllListener(p);
		p.Hdr_insp_sts_typ_nm.setListListener(p);
		p.Hdr_insp_sts_typ_nm.addAllListener(p);
		p.Hdr_pack_unit_cd.setListListener(p);
		p.Hdr_pack_unit_cd.addAllListener(p);
		p.Hdr_pack_unit_nm.setListListener(p);
		p.Hdr_pack_unit_nm.addAllListener(p);
		p.Hdr_pack_unit_dec_place.setListListener(p);
		p.Hdr_pack_unit_dec_place.addAllListener(p);
		p.Hdr_smpl_inst_unit_cd.setListListener(p);
		p.Hdr_smpl_inst_unit_cd.addAllListener(p);
		p.Hdr_smpl_inst_unit_nm.setListListener(p);
		p.Hdr_smpl_inst_unit_nm.addAllListener(p);
		p.Hdr_smpl_inst_unit_dec_place.setListListener(p);
		p.Hdr_smpl_inst_unit_dec_place.addAllListener(p);
		p.Hdr_base_unit_cd.setListListener(p);
		p.Hdr_base_unit_cd.addAllListener(p);
		p.Hdr_base_unit_nm.setListListener(p);
		p.Hdr_base_unit_nm.addAllListener(p);
		p.Hdr_base_unit_dec_place.setListListener(p);
		p.Hdr_base_unit_dec_place.addAllListener(p);
		p.Hdr_base_unit_rnd_typ.setListListener(p);
		p.Hdr_base_unit_rnd_typ.addAllListener(p);
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
		p.Hdr_bp_lot_no.setListListener(p);
		p.Hdr_bp_lot_no.addAllListener(p);
		p.Hdr_std_insp_flg.addAllListener(p);
		p.Hdr_std_req_flg.addAllListener(p);
		p.Hdr_std_cnf_req_flg.addAllListener(p);
		p.Hdr_std_cmpl_flg.addAllListener(p);
		p.Hdr_std_cnf_cmpl_flg.addAllListener(p);
		p.Hdr_insp_rslt_prnt_flg.addAllListener(p);
		p.Hdr_insp_rslt_prnt_tm.setListListener(p);
		p.Hdr_insp_rslt_prnt_tm.addAllListener(p);
		p.Hdr_act_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_quality_typ.setListListener(p);
		p.Hdr_quality_typ.addAllListener(p);
		p.Hdr_quality_typ_nm.setListListener(p);
		p.Hdr_quality_typ_nm.addAllListener(p);
		p.Hdr_gd_cd.setListListener(p);
		p.Hdr_gd_cd.addAllListener(p);
		p.Hdr_gd_nm.setListListener(p);
		p.Hdr_gd_nm.addAllListener(p);
		p.Hdr_dfct_rsn_cd.setListListener(p);
		p.Hdr_dfct_rsn_cd.addAllListener(p);
		p.Hdr_dfct_rsn_nm.setListListener(p);
		p.Hdr_dfct_rsn_nm.addAllListener(p);
		p.Hdr_vld_dt_upd_flg.addAllListener(p);
		p.Hdr_vld_pd.setListListener(p);
		p.Hdr_vld_pd.addAllListener(p);
		p.Hdr_lmt_pd.setListListener(p);
		p.Hdr_lmt_pd.addAllListener(p);
		p.Hdr_calc_pd_typ.setListListener(p);
		p.Hdr_calc_pd_typ.addAllListener(p);
		p.Hdr_calc_pd_typ_nm.setListListener(p);
		p.Hdr_calc_pd_typ_nm.addAllListener(p);
		p.Hdr_lmt_dt_frm_typ.setListListener(p);
		p.Hdr_lmt_dt_frm_typ.addAllListener(p);
		p.Hdr_lmt_dt_frm_typ_nm.setListListener(p);
		p.Hdr_lmt_dt_frm_typ_nm.addAllListener(p);
		p.Hdr_lmt_ctl_categ.setListListener(p);
		p.Hdr_lmt_ctl_categ.addAllListener(p);
		p.Hdr_lmt_dt_frm.setListListener(p);
		p.Hdr_lmt_dt_frm.addAllListener(p);
		p.Hdr_vld_dt_now.setListListener(p);
		p.Hdr_vld_dt_now.addAllListener(p);
		p.Hdr_vld_dt.setListListener(p);
		p.Hdr_vld_dt.addAllListener(p);
		p.Hdr_lmt_dt.setListListener(p);
		p.Hdr_lmt_dt.addAllListener(p);
		p.Hdr_lmt_up_flg.addAllListener(p);
		p.Hdr_in_prmt_insp_flg.addAllListener(p);
		p.Hdr_intr_rmrks.setListListener(p);
		p.Hdr_intr_rmrks.addAllListener(p);
		p.Hdr_lot_rmrks.setListListener(p);
		p.Hdr_lot_rmrks.addAllListener(p);
		p.Hdr_sub_char1.setListListener(p);
		p.Hdr_sub_char1.addAllListener(p);
		p.Hdr_sub_char2.setListListener(p);
		p.Hdr_sub_char2.addAllListener(p);
		p.Hdr_sub_char3.setListListener(p);
		p.Hdr_sub_char3.addAllListener(p);
		p.Hdr_lims_flg.addAllListener(p);
		p.Hdr_ext_sys_cd.setListListener(p);
		p.Hdr_ext_sys_cd.addAllListener(p);
		p.Hdr_ext_sys_nm.setListListener(p);
		p.Hdr_ext_sys_nm.addAllListener(p);
		p.Hdr_ext_insp_act_no.setListListener(p);
		p.Hdr_ext_insp_act_no.addAllListener(p);
		p.Hdr_insp_aprv_sts_typ.setListListener(p);
		p.Hdr_insp_aprv_sts_typ.addAllListener(p);
		p.Hdr_insp_aprv_sts_typ_nm.setListListener(p);
		p.Hdr_insp_aprv_sts_typ_nm.addAllListener(p);
		p.Hdr_insp_judg_rslt_typ.setListListener(p);
		p.Hdr_insp_judg_rslt_typ.addAllListener(p);
		p.Hdr_insp_judg_rslt_typ_nm.setListListener(p);
		p.Hdr_insp_judg_rslt_typ_nm.addAllListener(p);
		p.Hdr_judg_dt.setListListener(p);
		p.Hdr_judg_dt.addAllListener(p);
		p.Hdr_judg_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
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
		p.Hdr_cont_fctr_flg.addAllListener(p);
		p.Hdr_insp_ptn_cd.setListListener(p);
		p.Hdr_insp_ptn_cd.addAllListener(p);
		p.Hdr_site_cd.setListListener(p);
		p.Hdr_site_cd.addAllListener(p);
	}

	/**
	 *  [SystemInfo]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSystemInfo(MSBFP_InspActReg p) {
	}

	/**
	 *  [Judg]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitJudg(MSBFP_InspActReg p) {
	}

	/**
	 *  [JudgItm]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitJudgItm(MSBFP_InspActReg p) {
	}

	/**
	 *  [JudgBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitJudgBtn(MSBFP_InspActReg p) {
	}

	/**
	 *  [JudgEastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitJudgEastBtn(MSBFP_InspActReg p) {
	}

	/**
	 *  [Dtl1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl1(MSBFP_InspActReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBFP_InspActReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_itm_cd.addAllListener(p);
		p.columnDtl_itm_cd.setListListener(p);
		p.columnDtl_itm_sub1.addAllListener(p);
		p.columnDtl_itm_sub1.setListListener(p);
		p.columnDtl_itm_sub2.addAllListener(p);
		p.columnDtl_itm_sub2.setListListener(p);
		p.columnDtl_itm_sub3.addAllListener(p);
		p.columnDtl_itm_sub3.setListListener(p);
		p.columnDtl_wg_cd.addAllListener(p);
		p.columnDtl_wg_cd.setListListener(p);
		p.columnDtl_loc_cd.addAllListener(p);
		p.columnDtl_loc_cd.setListListener(p);
		p.columnDtl_loc_nm.addAllListener(p);
		p.columnDtl_loc_nm.setListListener(p);
		p.columnDtl_str_ln_tgt_flg.addAllListener(p);
		p.columnDtl_str_ln_cd.addAllListener(p);
		p.columnDtl_str_ln_cd.setListListener(p);
		p.columnDtl_str_ln_nm.addAllListener(p);
		p.columnDtl_str_ln_nm.setListListener(p);
		p.columnDtl_str_ln_cd_none_flg.addAllListener(p);
		p.columnDtl_stk_arrv_bp_cd.addAllListener(p);
		p.columnDtl_stk_arrv_bp_cd.setListListener(p);
		p.columnDtl_stk_arrv_bp_nm.addAllListener(p);
		p.columnDtl_stk_arrv_bp_nm.setListListener(p);
		p.columnDtl_quality_typ.addAllListener(p);
		p.columnDtl_quality_typ.setListListener(p);
		p.columnDtl_quality_typ_nm.addAllListener(p);
		p.columnDtl_quality_typ_nm.setListListener(p);
		p.columnDtl_gd_cd.addAllListener(p);
		p.columnDtl_gd_cd.setListListener(p);
		p.columnDtl_gd_nm.addAllListener(p);
		p.columnDtl_gd_nm.setListListener(p);
		p.columnDtl_dfct_rsn_cd.addAllListener(p);
		p.columnDtl_dfct_rsn_cd.setListListener(p);
		p.columnDtl_dfct_rsn_nm.addAllListener(p);
		p.columnDtl_dfct_rsn_nm.setListListener(p);
		p.columnDtl_base_flg.addAllListener(p);
		p.columnDtl_pack_unit_cd.addAllListener(p);
		p.columnDtl_pack_unit_cd.setListListener(p);
		p.columnDtl_pack_unit_nm.addAllListener(p);
		p.columnDtl_pack_unit_nm.setListListener(p);
		p.columnDtl_pack_unit_dec_place.addAllListener(p);
		p.columnDtl_pack_unit_dec_place.setListListener(p);
		p.columnDtl_pack_unit_dmn_qty.addAllListener(p);
		p.columnDtl_pack_unit_dmn_qty.setListListener(p);
		p.columnDtl_pack_unit_conv_qty.addAllListener(p);
		p.columnDtl_pack_unit_conv_qty.setListListener(p);
		p.columnDtl_base_unit_cd.addAllListener(p);
		p.columnDtl_base_unit_cd.setListListener(p);
		p.columnDtl_base_unit_nm.addAllListener(p);
		p.columnDtl_base_unit_nm.setListListener(p);
		p.columnDtl_base_unit_dec_place.addAllListener(p);
		p.columnDtl_base_unit_dec_place.setListListener(p);
		p.columnDtl_base_unit_rnd_typ.addAllListener(p);
		p.columnDtl_base_unit_rnd_typ.setListListener(p);
		p.columnDtl_stk_pack_unit_cd.addAllListener(p);
		p.columnDtl_stk_pack_unit_cd.setListListener(p);
		p.columnDtl_stk_pack_unit_nm.addAllListener(p);
		p.columnDtl_stk_pack_unit_nm.setListListener(p);
		p.columnDtl_stk_pack_unit_dec_place.addAllListener(p);
		p.columnDtl_stk_pack_unit_dec_place.setListListener(p);
		p.columnDtl_stk_base_unit_cd.addAllListener(p);
		p.columnDtl_stk_base_unit_cd.setListListener(p);
		p.columnDtl_stk_base_unit_nm.addAllListener(p);
		p.columnDtl_stk_base_unit_nm.setListListener(p);
		p.columnDtl_stk_base_unit_dec_place.addAllListener(p);
		p.columnDtl_stk_base_unit_dec_place.setListListener(p);
		p.columnDtl_pack_xfr_pack_unit_cd.addAllListener(p);
		p.columnDtl_pack_xfr_pack_unit_cd.setListListener(p);
		p.columnDtl_pack_xfr_pack_unit_nm.addAllListener(p);
		p.columnDtl_pack_xfr_pack_unit_nm.setListListener(p);
		p.columnDtl_pack_xfr_pack_unit_dec_place.addAllListener(p);
		p.columnDtl_pack_xfr_pack_unit_dec_place.setListListener(p);
		p.columnDtl_pack_xfr_pack_unit_dmn_qty.addAllListener(p);
		p.columnDtl_pack_xfr_pack_unit_dmn_qty.setListListener(p);
		p.columnDtl_pack_xfr_pack_unit_conv_qty.addAllListener(p);
		p.columnDtl_pack_xfr_pack_unit_conv_qty.setListListener(p);
		p.columnDtl_pack_xfr_base_unit_cd.addAllListener(p);
		p.columnDtl_pack_xfr_base_unit_cd.setListListener(p);
		p.columnDtl_pack_xfr_base_unit_nm.addAllListener(p);
		p.columnDtl_pack_xfr_base_unit_nm.setListListener(p);
		p.columnDtl_pack_xfr_base_unit_dec_place.addAllListener(p);
		p.columnDtl_pack_xfr_base_unit_dec_place.setListListener(p);
		p.columnDtl_pack_xfr_base_unit_rnd_typ.addAllListener(p);
		p.columnDtl_pack_xfr_base_unit_rnd_typ.setListListener(p);
		p.columnDtl_stk_insp_typ.addAllListener(p);
		p.columnDtl_stk_insp_typ.setListListener(p);
		p.columnDtl_stk_insp_typ_nm.addAllListener(p);
		p.columnDtl_stk_insp_typ_nm.setListListener(p);
		p.columnDtl_stk_id_typ.addAllListener(p);
		p.columnDtl_stk_id_typ.setListListener(p);
		p.columnDtl_stk_id_typ_nm.addAllListener(p);
		p.columnDtl_stk_id_typ_nm.setListListener(p);
		p.columnDtl_stk_bp_cd.addAllListener(p);
		p.columnDtl_stk_bp_cd.setListListener(p);
		p.columnDtl_stk_bp_nm.addAllListener(p);
		p.columnDtl_stk_bp_nm.setListListener(p);
		p.columnDtl_fix_no_typ.addAllListener(p);
		p.columnDtl_fix_no_typ.setListListener(p);
		p.columnDtl_fix_no_typ_nm.addAllListener(p);
		p.columnDtl_fix_no_typ_nm.setListListener(p);
		p.columnDtl_fix_no.addAllListener(p);
		p.columnDtl_fix_no.setListListener(p);
		p.columnDtl_insp_act_d_no.addAllListener(p);
		p.columnDtl_insp_act_d_no.setListListener(p);
		p.columnDtl_insp_judg_d_no.addAllListener(p);
		p.columnDtl_insp_judg_d_no.setListListener(p);
		p.columnDtl_insp_act_no.addAllListener(p);
		p.columnDtl_insp_act_no.setListListener(p);
		p.columnDtl_insp_no.addAllListener(p);
		p.columnDtl_insp_no.setListListener(p);
		p.columnDtl_intr_rmrks.addAllListener(p);
		p.columnDtl_intr_rmrks.setListListener(p);
		p.columnDtl_sub_char1.addAllListener(p);
		p.columnDtl_sub_char1.setListListener(p);
		p.columnDtl_sub_char2.addAllListener(p);
		p.columnDtl_sub_char2.setListListener(p);
		p.columnDtl_sub_char3.addAllListener(p);
		p.columnDtl_sub_char3.setListListener(p);
		p.columnDtl_lims_flg.addAllListener(p);
		p.columnDtl_ext_sys_cd.addAllListener(p);
		p.columnDtl_ext_sys_cd.setListListener(p);
		p.columnDtl_ext_sys_nm.addAllListener(p);
		p.columnDtl_ext_sys_nm.setListListener(p);
		p.columnDtl_ext_insp_act_d_no.addAllListener(p);
		p.columnDtl_ext_insp_act_d_no.setListListener(p);
	}

	/**
	 *  [DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtn(MSBFP_InspActReg p) {
		p.DtlBtn_rdel.addAllListener(p);
		p.DtlBtn_rdel.setAPMethodName("doDtlBtn_rdel");
		p.DtlBtn_rcopy.addAllListener(p);
		p.DtlBtn_rcopy.setAPMethodName("doDtlBtn_rcopy");
	}

	/**
	 *  [Dtl2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl2(MSBFP_InspActReg p) {
	}

	/**
	 *  [Smpl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSmpl(MSBFP_InspActReg p) {
		p.SmplTable.addAllListener(p);
		p.columnSmpl_base_unit_cd.addAllListener(p);
		p.columnSmpl_base_unit_cd.setListListener(p);
		p.columnSmpl_base_unit_nm.addAllListener(p);
		p.columnSmpl_base_unit_nm.setListListener(p);
		p.columnSmpl_base_unit_dec_place.addAllListener(p);
		p.columnSmpl_base_unit_dec_place.setListListener(p);
		p.columnSmpl_base_unit_rnd_typ.addAllListener(p);
		p.columnSmpl_base_unit_rnd_typ.setListListener(p);
		p.columnSmpl_pack_xfr_pack_unit_cd.addAllListener(p);
		p.columnSmpl_pack_xfr_pack_unit_cd.setListListener(p);
		p.columnSmpl_pack_xfr_pack_unit_nm.addAllListener(p);
		p.columnSmpl_pack_xfr_pack_unit_nm.setListListener(p);
		p.columnSmpl_pack_xfr_pack_unit_dec_place.addAllListener(p);
		p.columnSmpl_pack_xfr_pack_unit_dec_place.setListListener(p);
		p.columnSmpl_pack_xfr_pack_unit_dmn_qty.addAllListener(p);
		p.columnSmpl_pack_xfr_pack_unit_dmn_qty.setListListener(p);
		p.columnSmpl_pack_xfr_pack_unit_conv_qty.addAllListener(p);
		p.columnSmpl_pack_xfr_pack_unit_conv_qty.setListListener(p);
		p.columnSmpl_pack_xfr_base_unit_cd.addAllListener(p);
		p.columnSmpl_pack_xfr_base_unit_cd.setListListener(p);
		p.columnSmpl_pack_xfr_base_unit_nm.addAllListener(p);
		p.columnSmpl_pack_xfr_base_unit_nm.setListListener(p);
		p.columnSmpl_pack_xfr_base_unit_dec_place.addAllListener(p);
		p.columnSmpl_pack_xfr_base_unit_dec_place.setListListener(p);
		p.columnSmpl_pack_xfr_base_unit_rnd_typ.addAllListener(p);
		p.columnSmpl_pack_xfr_base_unit_rnd_typ.setListListener(p);
		p.columnSmpl_so_cmpl_flg.addAllListener(p);
		p.columnSmpl_wg_cd.addAllListener(p);
		p.columnSmpl_wg_cd.setListListener(p);
		p.columnSmpl_loc_cd.addAllListener(p);
		p.columnSmpl_loc_cd.setListListener(p);
		p.columnSmpl_loc_nm.addAllListener(p);
		p.columnSmpl_loc_nm.setListListener(p);
		p.columnSmpl_str_ln_tgt_flg.addAllListener(p);
		p.Smpl_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnSmpl_stk_arrv_bp_cd.addAllListener(p);
		p.columnSmpl_stk_arrv_bp_cd.setListListener(p);
		p.columnSmpl_stk_arrv_bp_nm.addAllListener(p);
		p.columnSmpl_stk_arrv_bp_nm.setListListener(p);
		p.columnSmpl_gd_cd.addAllListener(p);
		p.columnSmpl_gd_cd.setListListener(p);
		p.columnSmpl_gd_nm.addAllListener(p);
		p.columnSmpl_gd_nm.setListListener(p);
		p.columnSmpl_quality_typ.addAllListener(p);
		p.columnSmpl_quality_typ.setListListener(p);
		p.columnSmpl_quality_typ_nm.addAllListener(p);
		p.columnSmpl_quality_typ_nm.setListListener(p);
		p.columnSmpl_stk_insp_typ.addAllListener(p);
		p.columnSmpl_stk_insp_typ.setListListener(p);
		p.columnSmpl_stk_insp_typ_nm.addAllListener(p);
		p.columnSmpl_stk_insp_typ_nm.setListListener(p);
		p.columnSmpl_stk_id_typ.addAllListener(p);
		p.columnSmpl_stk_id_typ.setListListener(p);
		p.columnSmpl_stk_id_typ_nm.addAllListener(p);
		p.columnSmpl_stk_id_typ_nm.setListListener(p);
		p.columnSmpl_stk_bp_cd.addAllListener(p);
		p.columnSmpl_stk_bp_cd.setListListener(p);
		p.columnSmpl_stk_bp_nm.addAllListener(p);
		p.columnSmpl_stk_bp_nm.setListListener(p);
		p.columnSmpl_fix_no_typ.addAllListener(p);
		p.columnSmpl_fix_no_typ.setListListener(p);
		p.columnSmpl_fix_no_typ_nm.addAllListener(p);
		p.columnSmpl_fix_no_typ_nm.setListListener(p);
		p.columnSmpl_fix_no.addAllListener(p);
		p.columnSmpl_fix_no.setListListener(p);
		p.columnSmpl_ac_dt.addAllListener(p);
		p.columnSmpl_ac_dt.setListListener(p);
		p.columnSmpl_bd_dpt_cd.addAllListener(p);
		p.columnSmpl_bd_dpt_cd.setListListener(p);
		p.columnSmpl_bd_dpt_nm.addAllListener(p);
		p.columnSmpl_bd_dpt_nm.setListListener(p);
		p.columnSmpl_insp_smpl_act_no.addAllListener(p);
		p.columnSmpl_insp_smpl_act_no.setListListener(p);
		p.columnSmpl_insp_schd_no.addAllListener(p);
		p.columnSmpl_insp_schd_no.setListListener(p);
		p.columnSmpl_insp_no.addAllListener(p);
		p.columnSmpl_insp_no.setListListener(p);
		p.columnSmpl_insp_act_no.addAllListener(p);
		p.columnSmpl_insp_act_no.setListListener(p);
		p.columnSmpl_trd_rmrks.addAllListener(p);
		p.columnSmpl_trd_rmrks.setListListener(p);
		p.columnSmpl_intr_rmrks.addAllListener(p);
		p.columnSmpl_intr_rmrks.setListListener(p);
		p.columnSmpl_sub_char1.addAllListener(p);
		p.columnSmpl_sub_char1.setListListener(p);
		p.columnSmpl_sub_char2.addAllListener(p);
		p.columnSmpl_sub_char2.setListListener(p);
		p.columnSmpl_sub_char3.addAllListener(p);
		p.columnSmpl_sub_char3.setListListener(p);
		p.columnSmpl_itm_cd.addAllListener(p);
		p.columnSmpl_itm_cd.setListListener(p);
		p.columnSmpl_itm_sub1.addAllListener(p);
		p.columnSmpl_itm_sub1.setListListener(p);
		p.columnSmpl_itm_sub2.addAllListener(p);
		p.columnSmpl_itm_sub2.setListListener(p);
		p.columnSmpl_itm_sub3.addAllListener(p);
		p.columnSmpl_itm_sub3.setListListener(p);
		p.columnSmpl_lims_flg.addAllListener(p);
		p.columnSmpl_ext_sys_cd.addAllListener(p);
		p.columnSmpl_ext_sys_cd.setListListener(p);
		p.columnSmpl_ext_sys_nm.addAllListener(p);
		p.columnSmpl_ext_sys_nm.setListListener(p);
		p.columnSmpl_ext_insp_smpl_act_no.addAllListener(p);
		p.columnSmpl_ext_insp_smpl_act_no.setListListener(p);
	}

	/**
	 *  [SmplBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSmplBtn(MSBFP_InspActReg p) {
		p.SmplBtn_radd.addAllListener(p);
		p.SmplBtn_radd.setAPMethodName("doSmplBtn_radd");
		p.SmplBtn_rdel.addAllListener(p);
		p.SmplBtn_rdel.setAPMethodName("doSmplBtn_rdel");
		p.SmplBtn_rcopy.addAllListener(p);
		p.SmplBtn_rcopy.setAPMethodName("doSmplBtn_rcopy");
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBFP_InspActReg p) {
		p.Btn_open_MSBFP0050.addAllListener(p);
		p.Btn_open_MSBFP0050.setAPMethodName("doBtn_open_MSBFP0050");
		p.Btn_prnt.addAllListener(p);
		p.Btn_prnt.setAPMethodName("doBtn_prnt");
		p.Btn_act_ins.addAllListener(p);
		p.Btn_act_ins.setAPMethodName("doBtn_act_ins");
		p.Btn_act_upd.addAllListener(p);
		p.Btn_act_upd.setAPMethodName("doBtn_act_upd");
		p.Btn_act_del.addAllListener(p);
		p.Btn_act_del.setAPMethodName("doBtn_act_del");
		p.Btn_judg_upd.addAllListener(p);
		p.Btn_judg_upd.setAPMethodName("doBtn_judg_upd");
		p.Btn_judg_del.addAllListener(p);
		p.Btn_judg_del.setAPMethodName("doBtn_judg_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBFP_InspActReg p) {
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBFP_InspActReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBFP_InspActReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_insp_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBFP_InspActReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBFP_InspActReg p){
		p.Hdr_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_lot_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.READ_ONLY);
		p.Hdr_ver_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_inst_pack_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_pack_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pack_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pack_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_inst_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_rem_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_good_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_dfct_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_act_ttl_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_smpl_inst_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_smpl_inst_unit_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_smpl_inst_unit_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_smpl_inst_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_std_insp_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_std_cmpl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_std_cnf_cmpl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_tm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_st_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_end_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_act_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_quality_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_quality_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_gd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_gd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dfct_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dfct_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_std_cont_fctrt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_act_cont_fctr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.READ_ONLY);
		p.Hdr_vld_dt_upd_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_vld_pd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_lmt_pd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_calc_pd_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_calc_pd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_lmt_ctl_categ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_vld_dt_now.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_vld_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_lmt_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_lmt_up_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_in_prmt_insp_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_lot_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_lims_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ext_insp_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_judg_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_judg_ttl_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.INVISIBLE);
		p.Hdr_judg_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_judg_rsn_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
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
		p.Hdr_cont_fctr_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_insp_ptn_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_site_cd.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SystemInfo(MSBFP_InspActReg p){

	}

	/**
	 * [SRCH]ステータスの[Judg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Judg(MSBFP_InspActReg p){

	}

	/**
	 * [SRCH]ステータスの[JudgItm]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_JudgItm(MSBFP_InspActReg p){

	}

	/**
	 * [SRCH]ステータスの[JudgBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_JudgBtn(MSBFP_InspActReg p){

	}

	/**
	 * [SRCH]ステータスの[JudgEastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_JudgEastBtn(MSBFP_InspActReg p){

	}

	/**
	 * [SRCH]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl1(MSBFP_InspActReg p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBFP_InspActReg p){
		p.columnDtl_itm_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_itm_sub1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_itm_sub2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_itm_sub3.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_str_ln_tgt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dfct_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dfct_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_ac_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Dtl_can_ac_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.INVISIBLE);
		p.columnDtl_base_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_pack_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_dmn_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_stk_pack_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_stk_pack_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_pack_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_pack_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_stk_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_stk_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_pack_xfr_pack_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_pack_unit_dmn_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_pack_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_pack_xfr_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl_fix_no_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_fix_no_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_fix_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_insp_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_insp_judg_d_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_insp_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_insp_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_lims_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_insp_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlBtn(MSBFP_InspActReg p){
		p.DtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl2(MSBFP_InspActReg p){

	}

	/**
	 * [SRCH]ステータスの[Smpl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Smpl(MSBFP_InspActReg p){
		p.Smpl_so_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Smpl_smpl_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnSmpl_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Smpl_pack_xfr_pack_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_pack_unit_dmn_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_pack_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Smpl_pack_xfr_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnSmpl_so_cmpl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_wg_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnSmpl_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Smpl_str_ln_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnSmpl_stk_arrv_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_stk_arrv_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_gd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_gd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_quality_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_quality_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_stk_insp_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_stk_insp_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_stk_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_stk_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_stk_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_stk_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Smpl_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Smpl_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnSmpl_fix_no_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_fix_no_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_fix_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Smpl_act_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnSmpl_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Smpl_can_ac_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.INVISIBLE);
		p.columnSmpl_bd_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_bd_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_insp_smpl_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_insp_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_insp_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnSmpl_insp_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_trd_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_itm_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub3.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnSmpl_lims_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_ext_sys_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_ext_sys_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSmpl_ext_insp_smpl_act_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[SmplBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SmplBtn(MSBFP_InspActReg p){
		p.SmplBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.SmplBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.SmplBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBFP_InspActReg p){
		p.Btn_open_MSBFP0050.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_act_ins.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_act_upd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_act_del.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_judg_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_judg_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBFP_InspActReg p){

	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBFP_InspActReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBFP_InspActReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_insp_no.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [INS]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_HdrTab(MSBFP_InspActReg p){

	}

	/**
	 * [INS]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr(MSBFP_InspActReg p){
		p.Hdr_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_lot_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.READ_ONLY);
		p.Hdr_ver_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_inst_pack_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_pack_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_pack_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_pack_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_inst_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_rem_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_good_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_dfct_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_act_ttl_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_smpl_inst_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_smpl_inst_unit_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_smpl_inst_unit_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_smpl_inst_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_base_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_base_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_std_insp_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_std_cmpl_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_std_cnf_cmpl_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_tm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_st_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.REQUIRED);
		p.Hdr_end_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.Hdr_act_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_quality_typ.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_quality_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_gd_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_gd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dfct_rsn_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_dfct_rsn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_std_cont_fctrt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_act_cont_fctr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.ENABLE);
		p.Hdr_vld_dt_upd_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_vld_pd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_lmt_pd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_calc_pd_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_calc_pd_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_lmt_ctl_categ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_vld_dt_now.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_vld_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_lmt_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_lmt_up_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_in_prmt_insp_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_lot_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_lims_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ext_insp_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_judg_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_judg_ttl_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.INVISIBLE);
		p.Hdr_judg_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_judg_rsn_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
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
		p.Hdr_cont_fctr_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_insp_ptn_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_site_cd.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitINS_SystemInfo(MSBFP_InspActReg p){

	}

	/**
	 * [INS]ステータスの[Judg]ブロックのモードの設定
	 */
	protected static void statusInitINS_Judg(MSBFP_InspActReg p){

	}

	/**
	 * [INS]ステータスの[JudgItm]ブロックのモードの設定
	 */
	protected static void statusInitINS_JudgItm(MSBFP_InspActReg p){

	}

	/**
	 * [INS]ステータスの[JudgBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_JudgBtn(MSBFP_InspActReg p){

	}

	/**
	 * [INS]ステータスの[JudgEastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_JudgEastBtn(MSBFP_InspActReg p){

	}

	/**
	 * [INS]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl1(MSBFP_InspActReg p){

	}

	/**
	 * [INS]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl(MSBFP_InspActReg p){
		p.columnDtl_itm_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_itm_sub1.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_itm_sub2.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_itm_sub3.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_str_ln_tgt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_quality_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_gd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dfct_rsn_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_dfct_rsn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.REQUIRED);
		p.Dtl_can_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.INVISIBLE);
		p.columnDtl_base_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Dtl_pack_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.columnDtl_pack_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_dmn_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_stk_pack_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_stk_pack_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_stk_pack_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_stk_pack_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_stk_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_stk_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_stk_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_stk_base_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_pack_xfr_pack_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_pack_xfr_pack_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_pack_unit_dmn_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_pack_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_pack_xfr_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_base_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_stk_bp_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_stk_bp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl_fix_no_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_fix_no_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_fix_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_insp_act_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_insp_judg_d_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_insp_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_insp_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_lims_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ext_insp_act_d_no.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_DtlBtn(MSBFP_InspActReg p){
		p.DtlBtn_rdel.putMode(p, INS, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [INS]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl2(MSBFP_InspActReg p){

	}

	/**
	 * [INS]ステータスの[Smpl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Smpl(MSBFP_InspActReg p){
		p.Smpl_so_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.Smpl_smpl_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.columnSmpl_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_base_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnSmpl_base_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Smpl_pack_xfr_pack_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.columnSmpl_pack_xfr_pack_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_pack_unit_dmn_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_pack_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.Smpl_pack_xfr_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_base_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnSmpl_so_cmpl_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_wg_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnSmpl_loc_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnSmpl_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_str_ln_tgt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Smpl_str_ln_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.columnSmpl_stk_arrv_bp_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_stk_arrv_bp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_gd_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_gd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_quality_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_quality_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_stk_insp_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_stk_insp_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_stk_id_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_stk_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_stk_bp_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_stk_bp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Smpl_sno_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Smpl_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnSmpl_fix_no_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_fix_no_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_fix_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Smpl_act_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.ENABLE);
		p.columnSmpl_ac_dt.putMode(p, INS, MCMode.ENABLE);
		p.Smpl_can_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.INVISIBLE);
		p.columnSmpl_bd_dpt_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnSmpl_bd_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_insp_smpl_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_insp_schd_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_insp_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnSmpl_insp_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_trd_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnSmpl_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnSmpl_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnSmpl_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnSmpl_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnSmpl_itm_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub1.putMode(p, INS, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub2.putMode(p, INS, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub3.putMode(p, INS, MCMode.INVISIBLE);
		p.columnSmpl_lims_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_ext_sys_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_ext_sys_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnSmpl_ext_insp_smpl_act_no.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[SmplBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_SmplBtn(MSBFP_InspActReg p){
		p.SmplBtn_radd.putMode(p, INS, MCMode.ENABLE);
		p.SmplBtn_rdel.putMode(p, INS, MCMode.ENABLE);
		p.SmplBtn_rcopy.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBFP_InspActReg p){
		p.Btn_open_MSBFP0050.putMode(p, INS, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, INS, MCMode.DISABLE);
		p.Btn_act_ins.putMode(p, INS, MCMode.ENABLE);
		p.Btn_act_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_act_del.putMode(p, INS, MCMode.DISABLE);
		p.Btn_judg_upd.putMode(p, INS, MCMode.DISABLE);
		p.Btn_judg_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBFP_InspActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_insp_no.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, FIX_I, MCMode.ENABLE);

	}

	/**
	 * [FIX_I]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_HdrTab(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_I]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr(MSBFP_InspActReg p){
		p.Hdr_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_lot_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.READ_ONLY);
		p.Hdr_ver_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_inst_pack_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_pack_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_pack_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_pack_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_inst_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_rem_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_good_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_dfct_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_act_ttl_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_smpl_inst_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_smpl_inst_unit_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_smpl_inst_unit_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_smpl_inst_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_base_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_base_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_std_insp_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_std_cmpl_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_std_cnf_cmpl_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_tm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_st_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_end_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_act_usr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_quality_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_quality_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_gd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_gd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dfct_rsn_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dfct_rsn_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_std_cont_fctrt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_act_cont_fctr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.READ_ONLY);
		p.Hdr_vld_dt_upd_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_vld_pd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_lmt_pd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_calc_pd_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_calc_pd_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_lmt_ctl_categ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_vld_dt_now.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_vld_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_lmt_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_lmt_up_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_in_prmt_insp_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_lot_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_lims_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ext_insp_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_judg_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_judg_ttl_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.INVISIBLE);
		p.Hdr_judg_usr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_judg_rsn_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
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
		p.Hdr_cont_fctr_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_insp_ptn_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_site_cd.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_SystemInfo(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_I]ステータスの[Judg]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Judg(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_I]ステータスの[JudgItm]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_JudgItm(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_I]ステータスの[JudgBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_JudgBtn(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_I]ステータスの[JudgEastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_JudgEastBtn(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_I]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl1(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_I]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl(MSBFP_InspActReg p){
		p.columnDtl_itm_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_itm_sub1.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_itm_sub2.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_itm_sub3.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_str_ln_tgt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dfct_rsn_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dfct_rsn_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_ac_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Dtl_can_ac_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.INVISIBLE);
		p.columnDtl_base_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_pack_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_dmn_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_stk_pack_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_stk_pack_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_stk_pack_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_stk_pack_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_stk_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_stk_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_stk_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_stk_base_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_pack_xfr_pack_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_pack_unit_dmn_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_pack_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_pack_xfr_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_base_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_stk_bp_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_stk_bp_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl_fix_no_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_fix_no_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_fix_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_insp_act_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_insp_judg_d_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_insp_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_insp_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_lims_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ext_insp_act_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_DtlBtn(MSBFP_InspActReg p){
		p.DtlBtn_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl2(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_I]ステータスの[Smpl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Smpl(MSBFP_InspActReg p){
		p.Smpl_so_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Smpl_smpl_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_base_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnSmpl_base_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Smpl_pack_xfr_pack_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_pack_unit_dmn_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_pack_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Smpl_pack_xfr_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_base_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnSmpl_so_cmpl_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_wg_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnSmpl_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_str_ln_tgt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Smpl_str_ln_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnSmpl_stk_arrv_bp_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_stk_arrv_bp_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_gd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_gd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_quality_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_quality_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_stk_insp_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_stk_insp_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_stk_id_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_stk_id_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_stk_bp_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_stk_bp_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Smpl_sno_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Smpl_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnSmpl_fix_no_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_fix_no_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_fix_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Smpl_act_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnSmpl_ac_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Smpl_can_ac_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.INVISIBLE);
		p.columnSmpl_bd_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_bd_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_insp_smpl_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_insp_schd_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_insp_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnSmpl_insp_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_trd_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_itm_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub1.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub2.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub3.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnSmpl_lims_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_ext_sys_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_ext_sys_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnSmpl_ext_insp_smpl_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[SmplBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_SmplBtn(MSBFP_InspActReg p){
		p.SmplBtn_radd.putMode(p, FIX_I, MCMode.DISABLE);
		p.SmplBtn_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.SmplBtn_rcopy.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBFP_InspActReg p){
		p.Btn_open_MSBFP0050.putMode(p, FIX_I, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_act_ins.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_act_upd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_act_del.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_judg_upd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_judg_del.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MSBFP_InspActReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBFP_InspActReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBFP_InspActReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_insp_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrTab(MSBFP_InspActReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MSBFP_InspActReg p){
		p.Hdr_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_lot_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.READ_ONLY);
		p.Hdr_ver_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_inst_pack_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_pack_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_pack_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_pack_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_inst_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_rem_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_good_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_dfct_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_act_ttl_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_smpl_inst_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_smpl_inst_unit_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_smpl_inst_unit_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_smpl_inst_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_std_insp_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_std_cmpl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_std_cnf_cmpl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_tm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_st_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.REQUIRED);
		p.Hdr_end_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.Hdr_act_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_quality_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_quality_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_gd_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_gd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dfct_rsn_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_dfct_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_std_cont_fctrt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_act_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.ENABLE);
		p.Hdr_vld_dt_upd_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_vld_pd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_lmt_pd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_calc_pd_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_calc_pd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_lmt_ctl_categ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_vld_dt_now.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_vld_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_lmt_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_lmt_up_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_in_prmt_insp_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_lot_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_lims_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ext_insp_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_judg_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_judg_ttl_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.INVISIBLE);
		p.Hdr_judg_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_judg_rsn_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
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
		p.Hdr_cont_fctr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_insp_ptn_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_site_cd.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SystemInfo(MSBFP_InspActReg p){

	}

	/**
	 * [UPD]ステータスの[Judg]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Judg(MSBFP_InspActReg p){

	}

	/**
	 * [UPD]ステータスの[JudgItm]ブロックのモードの設定
	 */
	protected static void statusInitUPD_JudgItm(MSBFP_InspActReg p){

	}

	/**
	 * [UPD]ステータスの[JudgBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_JudgBtn(MSBFP_InspActReg p){

	}

	/**
	 * [UPD]ステータスの[JudgEastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_JudgEastBtn(MSBFP_InspActReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl1(MSBFP_InspActReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBFP_InspActReg p){
		p.columnDtl_itm_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_sub1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_sub2.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_sub3.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_str_ln_tgt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_quality_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_gd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dfct_rsn_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_dfct_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.REQUIRED);
		p.Dtl_can_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.REQUIRED);
		p.columnDtl_base_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_pack_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.columnDtl_pack_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_dmn_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_stk_pack_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_stk_pack_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_stk_pack_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_stk_pack_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_stk_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_stk_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_stk_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_stk_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_pack_xfr_pack_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_pack_xfr_pack_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_pack_unit_dmn_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_pack_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_pack_xfr_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_stk_bp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_stk_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl_fix_no_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_fix_no_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_fix_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_insp_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_insp_judg_d_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_insp_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_insp_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_lims_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ext_insp_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlBtn(MSBFP_InspActReg p){
		p.DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl2(MSBFP_InspActReg p){

	}

	/**
	 * [UPD]ステータスの[Smpl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Smpl(MSBFP_InspActReg p){
		p.Smpl_so_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.Smpl_smpl_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.columnSmpl_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnSmpl_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Smpl_pack_xfr_pack_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.columnSmpl_pack_xfr_pack_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_pack_unit_dmn_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_pack_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.Smpl_pack_xfr_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnSmpl_so_cmpl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_wg_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnSmpl_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnSmpl_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Smpl_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.columnSmpl_stk_arrv_bp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_stk_arrv_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_gd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_gd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_quality_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_quality_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_stk_insp_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_stk_insp_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_stk_id_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_stk_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_stk_bp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_stk_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Smpl_sno_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Smpl_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnSmpl_fix_no_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_fix_no_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_fix_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Smpl_act_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.ENABLE);
		p.columnSmpl_ac_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Smpl_can_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.REQUIRED);
		p.columnSmpl_bd_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnSmpl_bd_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_insp_smpl_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_insp_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_insp_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnSmpl_insp_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_trd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnSmpl_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnSmpl_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnSmpl_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnSmpl_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnSmpl_itm_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub2.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub3.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnSmpl_lims_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_ext_sys_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_ext_sys_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSmpl_ext_insp_smpl_act_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[SmplBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SmplBtn(MSBFP_InspActReg p){
		p.SmplBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.SmplBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.SmplBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBFP_InspActReg p){
		p.Btn_open_MSBFP0050.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_act_ins.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_act_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_act_del.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_judg_upd.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_judg_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBFP_InspActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_insp_no.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrTab(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MSBFP_InspActReg p){
		p.Hdr_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_lot_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.READ_ONLY);
		p.Hdr_ver_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_inst_pack_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_pack_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_pack_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_pack_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_inst_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_rem_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_good_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_dfct_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_act_ttl_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_smpl_inst_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_smpl_inst_unit_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_smpl_inst_unit_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_smpl_inst_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_base_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_std_insp_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_std_cmpl_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_std_cnf_cmpl_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_tm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_st_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_end_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_act_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_quality_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_quality_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_gd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_gd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dfct_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dfct_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_std_cont_fctrt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_act_cont_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.READ_ONLY);
		p.Hdr_vld_dt_upd_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_vld_pd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_lmt_pd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_calc_pd_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_calc_pd_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_lmt_ctl_categ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_vld_dt_now.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_vld_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_lmt_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_lmt_up_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_in_prmt_insp_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_lot_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_lims_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ext_insp_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_judg_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_judg_ttl_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.INVISIBLE);
		p.Hdr_judg_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_judg_rsn_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
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
		p.Hdr_cont_fctr_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_insp_ptn_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_site_cd.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_SystemInfo(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Judg]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Judg(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_U]ステータスの[JudgItm]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_JudgItm(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_U]ステータスの[JudgBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_JudgBtn(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_U]ステータスの[JudgEastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_JudgEastBtn(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl1(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MSBFP_InspActReg p){
		p.columnDtl_itm_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_itm_sub1.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_itm_sub2.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_itm_sub3.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_str_ln_tgt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dfct_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dfct_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_ac_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Dtl_can_ac_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.READ_ONLY);
		p.columnDtl_base_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_pack_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_dmn_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_stk_pack_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_stk_pack_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_stk_pack_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_stk_pack_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_stk_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_stk_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_stk_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_stk_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_pack_xfr_pack_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_pack_unit_dmn_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_pack_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_pack_xfr_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_base_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_stk_bp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_stk_bp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl_fix_no_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_fix_no_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_fix_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_insp_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_insp_judg_d_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_insp_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_insp_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_lims_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ext_insp_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DtlBtn(MSBFP_InspActReg p){
		p.DtlBtn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl2(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Smpl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Smpl(MSBFP_InspActReg p){
		p.Smpl_so_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Smpl_smpl_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnSmpl_base_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Smpl_pack_xfr_pack_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_pack_unit_dmn_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_pack_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Smpl_pack_xfr_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_base_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnSmpl_so_cmpl_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_wg_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnSmpl_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_str_ln_tgt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Smpl_str_ln_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnSmpl_stk_arrv_bp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_stk_arrv_bp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_gd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_gd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_quality_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_quality_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_stk_insp_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_stk_insp_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_stk_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_stk_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_stk_bp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_stk_bp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Smpl_sno_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Smpl_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnSmpl_fix_no_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_fix_no_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_fix_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Smpl_act_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnSmpl_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Smpl_can_ac_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.READ_ONLY);
		p.columnSmpl_bd_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_bd_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_insp_smpl_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_insp_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_insp_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnSmpl_insp_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_trd_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_itm_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub1.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub2.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub3.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnSmpl_lims_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_ext_sys_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_ext_sys_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSmpl_ext_insp_smpl_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[SmplBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_SmplBtn(MSBFP_InspActReg p){
		p.SmplBtn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.SmplBtn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.SmplBtn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBFP_InspActReg p){
		p.Btn_open_MSBFP0050.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_act_ins.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_act_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_act_del.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_judg_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_judg_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBFP_InspActReg p){

	}

	/**
	 * [JUDG]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitJUDG_ScreenOpe(MSBFP_InspActReg p){

	}

	/**
	 * [JUDG]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitJUDG_Cnd(MSBFP_InspActReg p){
		p.Cnd_ope_Group.putMode(p, JUDG, MCMode.REQUIRED);
		p.Cnd_insp_no.putMode(p, JUDG, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, JUDG, MCMode.ENABLE);

	}

	/**
	 * [JUDG]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitJUDG_HdrTab(MSBFP_InspActReg p){

	}

	/**
	 * [JUDG]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitJUDG_Hdr(MSBFP_InspActReg p){
		p.Hdr_itm_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_lot_no_p_PPanel.putStatus(JUDG, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.READ_ONLY);
		p.Hdr_ver_no.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_insp_no.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_insp_act_no.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_inst_pack_unit_qty_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_pack_unit_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_pack_unit_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_pack_unit_dec_place.putMode(p, JUDG, MCMode.INVISIBLE);
		p.Hdr_inst_base_unit_qty_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_rem_base_unit_qty_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_good_qty_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_dfct_qty_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_act_ttl_qty_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_smpl_inst_qty_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_smpl_inst_unit_cd.putMode(p, JUDG, MCMode.INVISIBLE);
		p.Hdr_smpl_inst_unit_nm.putMode(p, JUDG, MCMode.INVISIBLE);
		p.Hdr_smpl_inst_unit_dec_place.putMode(p, JUDG, MCMode.INVISIBLE);
		p.Hdr_base_unit_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_base_unit_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_base_unit_dec_place.putMode(p, JUDG, MCMode.INVISIBLE);
		p.Hdr_base_unit_rnd_typ.putMode(p, JUDG, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_std_insp_flg.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_std_cmpl_flg.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_std_cnf_cmpl_flg.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_flg.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_tm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_st_dt_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_end_dt_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_act_usr_dpt_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_quality_typ.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_quality_typ_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_gd_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_gd_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_dfct_rsn_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_dfct_rsn_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_std_cont_fctrt_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_act_cont_fctr_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.ENABLE);
		p.Hdr_vld_dt_upd_flg.putMode(p, JUDG, MCMode.REQUIRED);
		p.Hdr_vld_pd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_lmt_pd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_calc_pd_typ.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_calc_pd_typ_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm_typ.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm_typ_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_lmt_ctl_categ.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm.putMode(p, JUDG, MCMode.REQUIRED);
		p.Hdr_vld_dt_now.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_vld_dt.putMode(p, JUDG, MCMode.REQUIRED);
		p.Hdr_lmt_dt.putMode(p, JUDG, MCMode.REQUIRED);
		p.Hdr_lmt_up_flg.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_in_prmt_insp_flg.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, JUDG, MCMode.ENABLE);
		p.Hdr_lot_rmrks.putMode(p, JUDG, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, JUDG, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, JUDG, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, JUDG, MCMode.ENABLE);
		p.Hdr_lims_flg.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_ext_insp_act_no.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ.putMode(p, JUDG, MCMode.REQUIRED);
		p.Hdr_insp_judg_rslt_typ_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_judg_dt.putMode(p, JUDG, MCMode.REQUIRED);
		p.Hdr_judg_ttl_qty_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.INVISIBLE);
		p.Hdr_judg_usr_dpt_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr_judg_rsn_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.REQUIRED);
		p.Hdr_ins_usr_id.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Hdr_cont_fctr_flg.putMode(p, JUDG, MCMode.INVISIBLE);
		p.Hdr_insp_ptn_cd.putMode(p, JUDG, MCMode.INVISIBLE);
		p.Hdr_site_cd.putMode(p, JUDG, MCMode.INVISIBLE);

	}

	/**
	 * [JUDG]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitJUDG_SystemInfo(MSBFP_InspActReg p){

	}

	/**
	 * [JUDG]ステータスの[Judg]ブロックのモードの設定
	 */
	protected static void statusInitJUDG_Judg(MSBFP_InspActReg p){

	}

	/**
	 * [JUDG]ステータスの[JudgItm]ブロックのモードの設定
	 */
	protected static void statusInitJUDG_JudgItm(MSBFP_InspActReg p){

	}

	/**
	 * [JUDG]ステータスの[JudgBtn]ブロックのモードの設定
	 */
	protected static void statusInitJUDG_JudgBtn(MSBFP_InspActReg p){

	}

	/**
	 * [JUDG]ステータスの[JudgEastBtn]ブロックのモードの設定
	 */
	protected static void statusInitJUDG_JudgEastBtn(MSBFP_InspActReg p){

	}

	/**
	 * [JUDG]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitJUDG_Dtl1(MSBFP_InspActReg p){

	}

	/**
	 * [JUDG]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitJUDG_Dtl(MSBFP_InspActReg p){
		p.columnDtl_itm_cd.putMode(p, JUDG, MCMode.INVISIBLE);
		p.columnDtl_itm_sub1.putMode(p, JUDG, MCMode.INVISIBLE);
		p.columnDtl_itm_sub2.putMode(p, JUDG, MCMode.INVISIBLE);
		p.columnDtl_itm_sub3.putMode(p, JUDG, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, JUDG, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_str_ln_tgt_flg.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_dfct_rsn_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_dfct_rsn_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Dtl_ac_dt_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.REQUIRED);
		p.Dtl_can_ac_dt_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.INVISIBLE);
		p.columnDtl_base_flg.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Dtl_pack_unit_qty_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_unit_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_dec_place.putMode(p, JUDG, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_dmn_qty.putMode(p, JUDG, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_conv_qty.putMode(p, JUDG, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, JUDG, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, JUDG, MCMode.INVISIBLE);
		p.Dtl_stk_pack_unit_qty_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_stk_pack_unit_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_stk_pack_unit_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_stk_pack_unit_dec_place.putMode(p, JUDG, MCMode.INVISIBLE);
		p.Dtl_stk_base_unit_qty_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_stk_base_unit_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_stk_base_unit_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_stk_base_unit_dec_place.putMode(p, JUDG, MCMode.INVISIBLE);
		p.Dtl_pack_xfr_pack_unit_qty_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_dec_place.putMode(p, JUDG, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_pack_unit_dmn_qty.putMode(p, JUDG, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_pack_unit_conv_qty.putMode(p, JUDG, MCMode.INVISIBLE);
		p.Dtl_pack_xfr_base_unit_qty_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_dec_place.putMode(p, JUDG, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_base_unit_rnd_typ.putMode(p, JUDG, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_stk_bp_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_stk_bp_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_wrk_no_p_PPanel.putStatus(JUDG, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl_fix_no_typ.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_fix_no_typ_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_fix_no.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_insp_act_d_no.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_insp_judg_d_no.putMode(p, JUDG, MCMode.INVISIBLE);
		p.columnDtl_insp_act_no.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_insp_no.putMode(p, JUDG, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_lims_flg.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnDtl_ext_insp_act_d_no.putMode(p, JUDG, MCMode.READ_ONLY);

	}

	/**
	 * [JUDG]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitJUDG_DtlBtn(MSBFP_InspActReg p){
		p.DtlBtn_rdel.putMode(p, JUDG, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, JUDG, MCMode.DISABLE);

	}

	/**
	 * [JUDG]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitJUDG_Dtl2(MSBFP_InspActReg p){

	}

	/**
	 * [JUDG]ステータスの[Smpl]ブロックのモードの設定
	 */
	protected static void statusInitJUDG_Smpl(MSBFP_InspActReg p){
		p.Smpl_so_qty_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Smpl_smpl_qty_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_base_unit_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_base_unit_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_base_unit_dec_place.putMode(p, JUDG, MCMode.INVISIBLE);
		p.columnSmpl_base_unit_rnd_typ.putMode(p, JUDG, MCMode.INVISIBLE);
		p.Smpl_pack_xfr_pack_unit_qty_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_dec_place.putMode(p, JUDG, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_pack_unit_dmn_qty.putMode(p, JUDG, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_pack_unit_conv_qty.putMode(p, JUDG, MCMode.INVISIBLE);
		p.Smpl_pack_xfr_base_unit_qty_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_dec_place.putMode(p, JUDG, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_base_unit_rnd_typ.putMode(p, JUDG, MCMode.INVISIBLE);
		p.columnSmpl_so_cmpl_flg.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_wg_cd.putMode(p, JUDG, MCMode.INVISIBLE);
		p.columnSmpl_loc_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_loc_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_str_ln_tgt_flg.putMode(p, JUDG, MCMode.INVISIBLE);
		p.Smpl_str_ln_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnSmpl_stk_arrv_bp_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_stk_arrv_bp_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_gd_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_gd_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_quality_typ.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_quality_typ_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_stk_insp_typ.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_stk_insp_typ_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_stk_id_typ.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_stk_id_typ_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_stk_bp_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_stk_bp_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Smpl_sno_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Smpl_wrk_no_p_PPanel.putStatus(JUDG, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnSmpl_fix_no_typ.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_fix_no_typ_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_fix_no.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Smpl_act_dt_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnSmpl_ac_dt.putMode(p, JUDG, MCMode.READ_ONLY);
		p.Smpl_can_ac_dt_p_PPanel.putStatus(JUDG, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.INVISIBLE);
		p.columnSmpl_bd_dpt_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_bd_dpt_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_insp_smpl_act_no.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_insp_schd_no.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_insp_no.putMode(p, JUDG, MCMode.INVISIBLE);
		p.columnSmpl_insp_act_no.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_trd_rmrks.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_intr_rmrks.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_sub_char1.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_sub_char2.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_sub_char3.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_itm_cd.putMode(p, JUDG, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub1.putMode(p, JUDG, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub2.putMode(p, JUDG, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub3.putMode(p, JUDG, MCMode.INVISIBLE);
		p.columnSmpl_lims_flg.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_ext_sys_cd.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_ext_sys_nm.putMode(p, JUDG, MCMode.READ_ONLY);
		p.columnSmpl_ext_insp_smpl_act_no.putMode(p, JUDG, MCMode.READ_ONLY);

	}

	/**
	 * [JUDG]ステータスの[SmplBtn]ブロックのモードの設定
	 */
	protected static void statusInitJUDG_SmplBtn(MSBFP_InspActReg p){
		p.SmplBtn_radd.putMode(p, JUDG, MCMode.DISABLE);
		p.SmplBtn_rdel.putMode(p, JUDG, MCMode.DISABLE);
		p.SmplBtn_rcopy.putMode(p, JUDG, MCMode.DISABLE);

	}

	/**
	 * [JUDG]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitJUDG_Btn(MSBFP_InspActReg p){
		p.Btn_open_MSBFP0050.putMode(p, JUDG, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, JUDG, MCMode.DISABLE);
		p.Btn_act_ins.putMode(p, JUDG, MCMode.DISABLE);
		p.Btn_act_upd.putMode(p, JUDG, MCMode.INVISIBLE);
		p.Btn_act_del.putMode(p, JUDG, MCMode.DISABLE);
		p.Btn_judg_upd.putMode(p, JUDG, MCMode.ENABLE);
		p.Btn_judg_del.putMode(p, JUDG, MCMode.DISABLE);

	}

	/**
	 * [JUDG]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitJUDG_EastBtn(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_J]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__J_ScreenOpe(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_J]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__J_Cnd(MSBFP_InspActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_J, MCMode.REQUIRED);
		p.Cnd_insp_no.putMode(p, FIX_J, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, FIX_J, MCMode.ENABLE);

	}

	/**
	 * [FIX_J]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__J_HdrTab(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_J]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__J_Hdr(MSBFP_InspActReg p){
		p.Hdr_itm_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_lot_no_p_PPanel.putStatus(FIX_J, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.READ_ONLY);
		p.Hdr_ver_no.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_insp_no.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_insp_act_no.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_inst_pack_unit_qty_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_pack_unit_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_pack_unit_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_pack_unit_dec_place.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.Hdr_inst_base_unit_qty_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_rem_base_unit_qty_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_good_qty_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_dfct_qty_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_act_ttl_qty_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_smpl_inst_qty_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_smpl_inst_unit_cd.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.Hdr_smpl_inst_unit_nm.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.Hdr_smpl_inst_unit_dec_place.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.Hdr_base_unit_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_base_unit_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_base_unit_dec_place.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.Hdr_base_unit_rnd_typ.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_std_insp_flg.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_std_cmpl_flg.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_std_cnf_cmpl_flg.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_flg.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_tm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_st_dt_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_end_dt_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_act_usr_dpt_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_quality_typ.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_quality_typ_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_gd_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_gd_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_dfct_rsn_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_dfct_rsn_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_std_cont_fctrt_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_act_cont_fctr_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.READ_ONLY);
		p.Hdr_vld_dt_upd_flg.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_vld_pd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_lmt_pd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_calc_pd_typ.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_calc_pd_typ_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm_typ.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm_typ_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_lmt_ctl_categ.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_vld_dt_now.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_vld_dt.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_lmt_dt.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_lmt_up_flg.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_in_prmt_insp_flg.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_lot_rmrks.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_lims_flg.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_ext_insp_act_no.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_judg_dt.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_judg_ttl_qty_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.INVISIBLE);
		p.Hdr_judg_usr_dpt_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_judg_rsn_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Hdr_cont_fctr_flg.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.Hdr_insp_ptn_cd.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.Hdr_site_cd.putMode(p, FIX_J, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_J]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitFIX__J_SystemInfo(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_J]ステータスの[Judg]ブロックのモードの設定
	 */
	protected static void statusInitFIX__J_Judg(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_J]ステータスの[JudgItm]ブロックのモードの設定
	 */
	protected static void statusInitFIX__J_JudgItm(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_J]ステータスの[JudgBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__J_JudgBtn(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_J]ステータスの[JudgEastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__J_JudgEastBtn(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_J]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__J_Dtl1(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_J]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__J_Dtl(MSBFP_InspActReg p){
		p.columnDtl_itm_cd.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.columnDtl_itm_sub1.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.columnDtl_itm_sub2.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.columnDtl_itm_sub3.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_str_ln_tgt_flg.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_dfct_rsn_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_dfct_rsn_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Dtl_ac_dt_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Dtl_can_ac_dt_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.INVISIBLE);
		p.columnDtl_base_flg.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Dtl_pack_unit_qty_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_unit_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_dec_place.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_dmn_qty.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_conv_qty.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.Dtl_stk_pack_unit_qty_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_stk_pack_unit_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_stk_pack_unit_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_stk_pack_unit_dec_place.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.Dtl_stk_base_unit_qty_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_stk_base_unit_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_stk_base_unit_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_stk_base_unit_dec_place.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.Dtl_pack_xfr_pack_unit_qty_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_dec_place.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_pack_unit_dmn_qty.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_pack_unit_conv_qty.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.Dtl_pack_xfr_base_unit_qty_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_dec_place.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_base_unit_rnd_typ.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_stk_bp_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_stk_bp_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_wrk_no_p_PPanel.putStatus(FIX_J, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl_fix_no_typ.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_fix_no_typ_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_fix_no.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_insp_act_d_no.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_insp_judg_d_no.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.columnDtl_insp_act_no.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_insp_no.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_lims_flg.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnDtl_ext_insp_act_d_no.putMode(p, FIX_J, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_J]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__J_DtlBtn(MSBFP_InspActReg p){
		p.DtlBtn_rdel.putMode(p, FIX_J, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX_J, MCMode.DISABLE);

	}

	/**
	 * [FIX_J]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__J_Dtl2(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_J]ステータスの[Smpl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__J_Smpl(MSBFP_InspActReg p){
		p.Smpl_so_qty_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Smpl_smpl_qty_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_base_unit_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_base_unit_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_base_unit_dec_place.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.columnSmpl_base_unit_rnd_typ.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.Smpl_pack_xfr_pack_unit_qty_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_dec_place.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_pack_unit_dmn_qty.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_pack_unit_conv_qty.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.Smpl_pack_xfr_base_unit_qty_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_dec_place.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_base_unit_rnd_typ.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.columnSmpl_so_cmpl_flg.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_wg_cd.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.columnSmpl_loc_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_loc_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_str_ln_tgt_flg.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.Smpl_str_ln_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnSmpl_stk_arrv_bp_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_stk_arrv_bp_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_gd_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_gd_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_quality_typ.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_quality_typ_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_stk_insp_typ.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_stk_insp_typ_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_stk_id_typ.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_stk_id_typ_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_stk_bp_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_stk_bp_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Smpl_sno_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Smpl_wrk_no_p_PPanel.putStatus(FIX_J, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnSmpl_fix_no_typ.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_fix_no_typ_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_fix_no.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Smpl_act_dt_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnSmpl_ac_dt.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.Smpl_can_ac_dt_p_PPanel.putStatus(FIX_J, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.INVISIBLE);
		p.columnSmpl_bd_dpt_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_bd_dpt_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_insp_smpl_act_no.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_insp_schd_no.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_insp_no.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.columnSmpl_insp_act_no.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_trd_rmrks.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_intr_rmrks.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_sub_char1.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_sub_char2.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_sub_char3.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_itm_cd.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub1.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub2.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub3.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.columnSmpl_lims_flg.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_ext_sys_cd.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_ext_sys_nm.putMode(p, FIX_J, MCMode.READ_ONLY);
		p.columnSmpl_ext_insp_smpl_act_no.putMode(p, FIX_J, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_J]ステータスの[SmplBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__J_SmplBtn(MSBFP_InspActReg p){
		p.SmplBtn_radd.putMode(p, FIX_J, MCMode.DISABLE);
		p.SmplBtn_rdel.putMode(p, FIX_J, MCMode.DISABLE);
		p.SmplBtn_rcopy.putMode(p, FIX_J, MCMode.DISABLE);

	}

	/**
	 * [FIX_J]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__J_Btn(MSBFP_InspActReg p){
		p.Btn_open_MSBFP0050.putMode(p, FIX_J, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, FIX_J, MCMode.DISABLE);
		p.Btn_act_ins.putMode(p, FIX_J, MCMode.DISABLE);
		p.Btn_act_upd.putMode(p, FIX_J, MCMode.INVISIBLE);
		p.Btn_act_del.putMode(p, FIX_J, MCMode.DISABLE);
		p.Btn_judg_upd.putMode(p, FIX_J, MCMode.DISABLE);
		p.Btn_judg_del.putMode(p, FIX_J, MCMode.DISABLE);

	}

	/**
	 * [FIX_J]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__J_EastBtn(MSBFP_InspActReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBFP_InspActReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBFP_InspActReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_insp_no.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HdrTab(MSBFP_InspActReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MSBFP_InspActReg p){
		p.Hdr_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_lot_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.READ_ONLY);
		p.Hdr_ver_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_inst_pack_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_pack_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_pack_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_pack_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_inst_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_rem_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_good_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_dfct_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_act_ttl_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_smpl_inst_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_smpl_inst_unit_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_smpl_inst_unit_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_smpl_inst_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_std_insp_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_std_cmpl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_std_cnf_cmpl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_tm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_st_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_end_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_act_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_quality_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_quality_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_gd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_gd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dfct_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dfct_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_std_cont_fctrt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_act_cont_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.READ_ONLY);
		p.Hdr_vld_dt_upd_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_vld_pd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_lmt_pd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_calc_pd_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_calc_pd_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_lmt_ctl_categ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_vld_dt_now.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_vld_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_lmt_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_lmt_up_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_in_prmt_insp_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_lot_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_lims_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ext_insp_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_judg_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_judg_ttl_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.INVISIBLE);
		p.Hdr_judg_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_judg_rsn_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.REQUIRED);
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
		p.Hdr_cont_fctr_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_insp_ptn_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_site_cd.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitDEL_SystemInfo(MSBFP_InspActReg p){

	}

	/**
	 * [DEL]ステータスの[Judg]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Judg(MSBFP_InspActReg p){

	}

	/**
	 * [DEL]ステータスの[JudgItm]ブロックのモードの設定
	 */
	protected static void statusInitDEL_JudgItm(MSBFP_InspActReg p){

	}

	/**
	 * [DEL]ステータスの[JudgBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_JudgBtn(MSBFP_InspActReg p){

	}

	/**
	 * [DEL]ステータスの[JudgEastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_JudgEastBtn(MSBFP_InspActReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl1(MSBFP_InspActReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MSBFP_InspActReg p){
		p.columnDtl_itm_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_sub1.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_sub2.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_sub3.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_str_ln_tgt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dfct_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dfct_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Dtl_can_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.REQUIRED);
		p.columnDtl_base_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_pack_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_dmn_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_stk_pack_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_stk_pack_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stk_pack_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stk_pack_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_stk_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_stk_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stk_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stk_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_pack_xfr_pack_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_pack_unit_dmn_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_pack_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_pack_xfr_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stk_bp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stk_bp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl_fix_no_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_fix_no_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_fix_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_insp_act_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_insp_judg_d_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_insp_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_insp_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_lims_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ext_insp_act_d_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlBtn(MSBFP_InspActReg p){
		p.DtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl2(MSBFP_InspActReg p){

	}

	/**
	 * [DEL]ステータスの[Smpl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Smpl(MSBFP_InspActReg p){
		p.Smpl_so_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Smpl_smpl_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnSmpl_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Smpl_pack_xfr_pack_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_pack_unit_dmn_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_pack_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.Smpl_pack_xfr_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnSmpl_so_cmpl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_wg_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnSmpl_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_str_ln_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Smpl_str_ln_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnSmpl_stk_arrv_bp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_stk_arrv_bp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_gd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_gd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_quality_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_quality_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_stk_insp_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_stk_insp_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_stk_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_stk_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_stk_bp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_stk_bp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Smpl_sno_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Smpl_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnSmpl_fix_no_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_fix_no_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_fix_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Smpl_act_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnSmpl_ac_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Smpl_can_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.REQUIRED);
		p.columnSmpl_bd_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_bd_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_insp_smpl_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_insp_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_insp_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnSmpl_insp_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_trd_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_itm_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub1.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub2.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub3.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnSmpl_lims_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_ext_sys_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_ext_sys_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnSmpl_ext_insp_smpl_act_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[SmplBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_SmplBtn(MSBFP_InspActReg p){
		p.SmplBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.SmplBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.SmplBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBFP_InspActReg p){
		p.Btn_open_MSBFP0050.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_act_ins.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_act_upd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_act_del.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_judg_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_judg_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBFP_InspActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_insp_no.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_HdrTab(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MSBFP_InspActReg p){
		p.Hdr_itm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_lot_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.READ_ONLY);
		p.Hdr_ver_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_inst_pack_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_pack_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_pack_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_pack_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_inst_base_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_rem_base_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_good_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_dfct_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_act_ttl_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_smpl_inst_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_smpl_inst_unit_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_smpl_inst_unit_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_smpl_inst_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_base_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_base_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_base_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_base_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_std_insp_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_std_cmpl_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_std_cnf_cmpl_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_tm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_st_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_end_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_act_usr_dpt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_quality_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_quality_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_gd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_gd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dfct_rsn_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dfct_rsn_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_std_cont_fctrt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_act_cont_fctr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.READ_ONLY);
		p.Hdr_vld_dt_upd_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_vld_pd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_lmt_pd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_calc_pd_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_calc_pd_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_lmt_ctl_categ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_vld_dt_now.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_vld_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_lmt_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_lmt_up_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_in_prmt_insp_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_lot_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_lims_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ext_insp_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_judg_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_judg_ttl_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.INVISIBLE);
		p.Hdr_judg_usr_dpt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_judg_rsn_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
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
		p.Hdr_cont_fctr_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_insp_ptn_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_site_cd.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_SystemInfo(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_D]ステータスの[Judg]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Judg(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_D]ステータスの[JudgItm]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_JudgItm(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_D]ステータスの[JudgBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_JudgBtn(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_D]ステータスの[JudgEastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_JudgEastBtn(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_D]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl1(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl(MSBFP_InspActReg p){
		p.columnDtl_itm_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_itm_sub1.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_itm_sub2.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_itm_sub3.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_str_ln_tgt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dfct_rsn_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dfct_rsn_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_ac_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Dtl_can_ac_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.READ_ONLY);
		p.columnDtl_base_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_pack_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_dmn_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_stk_pack_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_stk_pack_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_stk_pack_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_stk_pack_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_stk_base_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_stk_base_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_stk_base_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_stk_base_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_pack_xfr_pack_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_pack_unit_dmn_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_pack_unit_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_pack_xfr_base_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_base_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_stk_bp_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_stk_bp_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_wrk_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl_fix_no_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_fix_no_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_fix_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_insp_act_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_insp_judg_d_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_insp_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_insp_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_lims_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ext_insp_act_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_DtlBtn(MSBFP_InspActReg p){
		p.DtlBtn_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl2(MSBFP_InspActReg p){

	}

	/**
	 * [FIX_D]ステータスの[Smpl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Smpl(MSBFP_InspActReg p){
		p.Smpl_so_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Smpl_smpl_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_base_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_base_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_base_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnSmpl_base_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Smpl_pack_xfr_pack_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_pack_unit_dmn_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_pack_unit_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Smpl_pack_xfr_base_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_base_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnSmpl_so_cmpl_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_wg_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnSmpl_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_str_ln_tgt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Smpl_str_ln_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnSmpl_stk_arrv_bp_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_stk_arrv_bp_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_gd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_gd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_quality_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_quality_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_stk_insp_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_stk_insp_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_stk_id_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_stk_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_stk_bp_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_stk_bp_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Smpl_sno_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Smpl_wrk_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnSmpl_fix_no_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_fix_no_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_fix_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Smpl_act_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnSmpl_ac_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Smpl_can_ac_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.READ_ONLY);
		p.columnSmpl_bd_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_bd_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_insp_smpl_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_insp_schd_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_insp_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnSmpl_insp_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_trd_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_itm_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub1.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub2.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub3.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnSmpl_lims_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_ext_sys_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_ext_sys_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnSmpl_ext_insp_smpl_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[SmplBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_SmplBtn(MSBFP_InspActReg p){
		p.SmplBtn_radd.putMode(p, FIX_D, MCMode.DISABLE);
		p.SmplBtn_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.SmplBtn_rcopy.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBFP_InspActReg p){
		p.Btn_open_MSBFP0050.putMode(p, FIX_D, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_act_ins.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_act_upd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Btn_act_del.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_judg_upd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_judg_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBFP_InspActReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBFP_InspActReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBFP_InspActReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_insp_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBFP_InspActReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBFP_InspActReg p){
		p.Hdr_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_lot_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0030.MSUBP_LotNo_H.READ_ONLY);
		p.Hdr_ver_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_freq.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_mtd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_inst_pack_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_pack_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pack_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pack_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_inst_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_rem_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_good_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_dfct_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_act_ttl_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_smpl_inst_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_smpl_inst_unit_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_smpl_inst_unit_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_smpl_inst_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bp_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_std_insp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_std_req_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_std_cnf_req_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_std_cmpl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_std_cnf_cmpl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_rslt_prnt_tm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_st_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_end_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_act_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_quality_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_quality_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_gd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_gd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dfct_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dfct_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_std_cont_fctrt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_act_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.READ_ONLY);
		p.Hdr_vld_dt_upd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_vld_pd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_lmt_pd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_calc_pd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_calc_pd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_lmt_ctl_categ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_lmt_dt_frm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_vld_dt_now.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_vld_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_lmt_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_lmt_up_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_in_prmt_insp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_lot_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_lims_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ext_insp_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_aprv_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_judg_rslt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_judg_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_judg_ttl_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.INVISIBLE);
		p.Hdr_judg_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_judg_rsn_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0220.MAUBP_SprtTxt_H.READ_ONLY);
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
		p.Hdr_cont_fctr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_insp_ptn_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_site_cd.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[SystemInfo]ブロックのモードの設定
	 */
	protected static void statusInitREF_SystemInfo(MSBFP_InspActReg p){

	}

	/**
	 * [REF]ステータスの[Judg]ブロックのモードの設定
	 */
	protected static void statusInitREF_Judg(MSBFP_InspActReg p){

	}

	/**
	 * [REF]ステータスの[JudgItm]ブロックのモードの設定
	 */
	protected static void statusInitREF_JudgItm(MSBFP_InspActReg p){

	}

	/**
	 * [REF]ステータスの[JudgBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_JudgBtn(MSBFP_InspActReg p){

	}

	/**
	 * [REF]ステータスの[JudgEastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_JudgEastBtn(MSBFP_InspActReg p){

	}

	/**
	 * [REF]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl1(MSBFP_InspActReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MSBFP_InspActReg p){
		p.columnDtl_itm_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_sub1.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_sub2.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_sub3.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_str_ln_tgt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_str_ln_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_str_ln_cd_none_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dfct_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dfct_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_ac_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Dtl_can_ac_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.INVISIBLE);
		p.columnDtl_base_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_pack_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_dmn_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pack_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_stk_pack_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_stk_pack_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_pack_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_pack_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_stk_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_stk_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_pack_xfr_pack_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_pack_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_pack_unit_dmn_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_pack_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_pack_xfr_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pack_xfr_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pack_xfr_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl_fix_no_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_fix_no_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_fix_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_insp_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_insp_judg_d_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_insp_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_insp_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lims_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ext_insp_act_d_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtn(MSBFP_InspActReg p){
		p.DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl2(MSBFP_InspActReg p){

	}

	/**
	 * [REF]ステータスの[Smpl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Smpl(MSBFP_InspActReg p){
		p.Smpl_so_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Smpl_smpl_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnSmpl_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Smpl_pack_xfr_pack_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_pack_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_pack_unit_dmn_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_pack_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.Smpl_pack_xfr_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_pack_xfr_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnSmpl_pack_xfr_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnSmpl_so_cmpl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_wg_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnSmpl_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Smpl_str_ln_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnSmpl_stk_arrv_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_stk_arrv_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_gd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_gd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_quality_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_quality_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_stk_insp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_stk_insp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_stk_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_stk_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_stk_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_stk_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Smpl_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Smpl_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnSmpl_fix_no_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_fix_no_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_fix_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Smpl_act_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnSmpl_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Smpl_can_ac_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.INVISIBLE);
		p.columnSmpl_bd_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_bd_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_insp_smpl_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_insp_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_insp_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnSmpl_insp_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_trd_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_itm_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub1.putMode(p, REF, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub2.putMode(p, REF, MCMode.INVISIBLE);
		p.columnSmpl_itm_sub3.putMode(p, REF, MCMode.INVISIBLE);
		p.columnSmpl_lims_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_ext_sys_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_ext_sys_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnSmpl_ext_insp_smpl_act_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[SmplBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_SmplBtn(MSBFP_InspActReg p){
		p.SmplBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.SmplBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.SmplBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBFP_InspActReg p){
		p.Btn_open_MSBFP0050.putMode(p, REF, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, REF, MCMode.ENABLE);
		p.Btn_act_ins.putMode(p, REF, MCMode.DISABLE);
		p.Btn_act_upd.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_act_del.putMode(p, REF, MCMode.DISABLE);
		p.Btn_judg_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_judg_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBFP_InspActReg p){

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
		MSBFP_InspActReg_MC.setTableConfigDtl((MSBFP_InspActReg)this);
		MSBFP_InspActReg_MC.setTableConfigSmpl((MSBFP_InspActReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBFP_InspActReg p) {
		p.columnDtl_itm_cd.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.itm_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_cd);
		p.columnDtl_itm_sub1.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.itm_sub1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_sub1);
		p.columnDtl_itm_sub2.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.itm_sub2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_sub2);
		p.columnDtl_itm_sub3.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.itm_sub3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_sub3);
		p.columnDtl_wg_cd.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_cd);
		p.columnDtl_loc_cd.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.loc_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_cd);
		p.columnDtl_loc_nm.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_nm);
		p.columnDtl_str_ln_tgt_flg.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.str_ln_tgt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_str_ln_tgt_flg);
		p.columnDtl_str_ln_cd.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.str_ln_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_str_ln_cd);
		p.columnDtl_str_ln_nm.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.str_ln_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_str_ln_nm);
		p.columnDtl_str_ln_cd_none_flg.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.str_ln_cd_none_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_str_ln_cd_none_flg);
		p.columnDtl_stk_arrv_bp_cd.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.stk_arrv_bp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_arrv_bp_cd);
		p.columnDtl_stk_arrv_bp_nm.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.stk_arrv_bp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_arrv_bp_nm);
		p.columnDtl_quality_typ.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.quality_typ_META);
		p.columnDtl_quality_typ.addLinkBeans(p.columnDtl_quality_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_quality_typ);
		p.columnDtl_quality_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.quality_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_quality_typ_nm);
		p.columnDtl_gd_cd.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.gd_cd_META);
		p.columnDtl_gd_cd.addLinkBeans(p.columnDtl_gd_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_gd_cd);
		p.columnDtl_gd_nm.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.gd_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gd_nm);
		p.columnDtl_dfct_rsn_cd.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.dfct_rsn_cd_META);
		p.columnDtl_dfct_rsn_cd.addLinkBeans(p.columnDtl_dfct_rsn_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_dfct_rsn_cd);
		p.columnDtl_dfct_rsn_nm.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.dfct_rsn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dfct_rsn_nm);
		p.DtlTable.addTable(p.Dtl_ac_dt_p_PPanel.AcDtTable);
		p.DtlTable.addTable(p.Dtl_can_ac_dt_p_PPanel.CanAcDtTable);
		p.columnDtl_base_flg.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.base_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_flg);
		p.DtlTable.addTable(p.Dtl_pack_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_pack_unit_cd.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.pack_unit_cd_META);
		p.columnDtl_pack_unit_cd.addLinkBeans(p.columnDtl_pack_unit_nm,p.columnDtl_pack_unit_dec_place,p.columnDtl_pack_unit_dmn_qty,p.columnDtl_pack_unit_conv_qty);
		p.DtlTable.addColumnConfig(p.columnDtl_pack_unit_cd);
		p.columnDtl_pack_unit_nm.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.pack_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pack_unit_nm);
		p.columnDtl_pack_unit_dec_place.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.pack_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pack_unit_dec_place);
		p.columnDtl_pack_unit_dmn_qty.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.pack_unit_dmn_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pack_unit_dmn_qty);
		p.columnDtl_pack_unit_conv_qty.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.pack_unit_conv_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pack_unit_conv_qty);
		p.DtlTable.addTable(p.Dtl_base_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_base_unit_cd.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_cd);
		p.columnDtl_base_unit_nm.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_nm);
		p.columnDtl_base_unit_dec_place.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.base_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_dec_place);
		p.columnDtl_base_unit_rnd_typ.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.base_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_rnd_typ);
		p.DtlTable.addTable(p.Dtl_stk_pack_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_stk_pack_unit_cd.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.stk_pack_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_pack_unit_cd);
		p.columnDtl_stk_pack_unit_nm.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.stk_pack_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_pack_unit_nm);
		p.columnDtl_stk_pack_unit_dec_place.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.stk_pack_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_pack_unit_dec_place);
		p.DtlTable.addTable(p.Dtl_stk_base_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_stk_base_unit_cd.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.stk_base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_base_unit_cd);
		p.columnDtl_stk_base_unit_nm.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.stk_base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_base_unit_nm);
		p.columnDtl_stk_base_unit_dec_place.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.stk_base_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_base_unit_dec_place);
		p.DtlTable.addTable(p.Dtl_pack_xfr_pack_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_pack_xfr_pack_unit_cd.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.pack_xfr_pack_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pack_xfr_pack_unit_cd);
		p.columnDtl_pack_xfr_pack_unit_nm.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.pack_xfr_pack_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pack_xfr_pack_unit_nm);
		p.columnDtl_pack_xfr_pack_unit_dec_place.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.pack_xfr_pack_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pack_xfr_pack_unit_dec_place);
		p.columnDtl_pack_xfr_pack_unit_dmn_qty.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.pack_xfr_pack_unit_dmn_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pack_xfr_pack_unit_dmn_qty);
		p.columnDtl_pack_xfr_pack_unit_conv_qty.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.pack_xfr_pack_unit_conv_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pack_xfr_pack_unit_conv_qty);
		p.DtlTable.addTable(p.Dtl_pack_xfr_base_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_pack_xfr_base_unit_cd.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.pack_xfr_base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pack_xfr_base_unit_cd);
		p.columnDtl_pack_xfr_base_unit_nm.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.pack_xfr_base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pack_xfr_base_unit_nm);
		p.columnDtl_pack_xfr_base_unit_dec_place.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.pack_xfr_base_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pack_xfr_base_unit_dec_place);
		p.columnDtl_pack_xfr_base_unit_rnd_typ.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.pack_xfr_base_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pack_xfr_base_unit_rnd_typ);
		p.columnDtl_stk_insp_typ.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.stk_insp_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_insp_typ);
		p.columnDtl_stk_insp_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.stk_insp_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_insp_typ_nm);
		p.columnDtl_stk_id_typ.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.stk_id_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_id_typ);
		p.columnDtl_stk_id_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.stk_id_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_id_typ_nm);
		p.columnDtl_stk_bp_cd.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.stk_bp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_bp_cd);
		p.columnDtl_stk_bp_nm.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.stk_bp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_bp_nm);
		p.DtlTable.addTable(p.Dtl_sno_p_PPanel.SnoTable);
		p.DtlTable.addTable(p.Dtl_wrk_no_p_PPanel.WrkNoTable);
		p.columnDtl_fix_no_typ.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.fix_no_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fix_no_typ);
		p.columnDtl_fix_no_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.fix_no_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fix_no_typ_nm);
		p.columnDtl_fix_no.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.fix_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fix_no);
		p.columnDtl_insp_act_d_no.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.insp_act_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_insp_act_d_no);
		p.columnDtl_insp_judg_d_no.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.insp_judg_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_insp_judg_d_no);
		p.columnDtl_insp_act_no.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.insp_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_insp_act_no);
		p.columnDtl_insp_no.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.insp_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_insp_no);
		p.columnDtl_intr_rmrks.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.intr_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_intr_rmrks);
		p.columnDtl_sub_char1.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char1);
		p.columnDtl_sub_char2.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char2);
		p.columnDtl_sub_char3.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char3);
		p.columnDtl_lims_flg.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.lims_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lims_flg);
		p.columnDtl_ext_sys_cd.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.ext_sys_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_cd);
		p.columnDtl_ext_sys_nm.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.ext_sys_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_nm);
		p.columnDtl_ext_insp_act_d_no.setMeta(mcframe.clientMSBF.MSBFP0070.DtlR.ext_insp_act_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_insp_act_d_no);
	}

	/**
	 * [Smpl]ブロックのTableの設定
	 */
	protected static void setTableConfigSmpl(MSBFP_InspActReg p) {
		p.SmplTable.addTable(p.Smpl_so_qty_p_PPanel.QtyTable);
		p.SmplTable.addTable(p.Smpl_smpl_qty_p_PPanel.QtyTable);
		p.columnSmpl_base_unit_cd.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.base_unit_cd_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_base_unit_cd);
		p.columnSmpl_base_unit_nm.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.base_unit_nm_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_base_unit_nm);
		p.columnSmpl_base_unit_dec_place.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.base_unit_dec_place_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_base_unit_dec_place);
		p.columnSmpl_base_unit_rnd_typ.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.base_unit_rnd_typ_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_base_unit_rnd_typ);
		p.SmplTable.addTable(p.Smpl_pack_xfr_pack_unit_qty_p_PPanel.QtyTable);
		p.columnSmpl_pack_xfr_pack_unit_cd.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.pack_xfr_pack_unit_cd_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_pack_xfr_pack_unit_cd);
		p.columnSmpl_pack_xfr_pack_unit_nm.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.pack_xfr_pack_unit_nm_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_pack_xfr_pack_unit_nm);
		p.columnSmpl_pack_xfr_pack_unit_dec_place.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.pack_xfr_pack_unit_dec_place_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_pack_xfr_pack_unit_dec_place);
		p.columnSmpl_pack_xfr_pack_unit_dmn_qty.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.pack_xfr_pack_unit_dmn_qty_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_pack_xfr_pack_unit_dmn_qty);
		p.columnSmpl_pack_xfr_pack_unit_conv_qty.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.pack_xfr_pack_unit_conv_qty_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_pack_xfr_pack_unit_conv_qty);
		p.SmplTable.addTable(p.Smpl_pack_xfr_base_unit_qty_p_PPanel.QtyTable);
		p.columnSmpl_pack_xfr_base_unit_cd.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.pack_xfr_base_unit_cd_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_pack_xfr_base_unit_cd);
		p.columnSmpl_pack_xfr_base_unit_nm.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.pack_xfr_base_unit_nm_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_pack_xfr_base_unit_nm);
		p.columnSmpl_pack_xfr_base_unit_dec_place.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.pack_xfr_base_unit_dec_place_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_pack_xfr_base_unit_dec_place);
		p.columnSmpl_pack_xfr_base_unit_rnd_typ.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.pack_xfr_base_unit_rnd_typ_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_pack_xfr_base_unit_rnd_typ);
		p.columnSmpl_so_cmpl_flg.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.so_cmpl_flg_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_so_cmpl_flg);
		p.columnSmpl_wg_cd.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.wg_cd_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_wg_cd);
		p.columnSmpl_loc_cd.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.loc_cd_META);
		p.columnSmpl_loc_cd.addLinkBeans(p.columnSmpl_loc_nm,p.columnSmpl_str_ln_tgt_flg);
		p.SmplTable.addColumnConfig(p.columnSmpl_loc_cd);
		p.columnSmpl_loc_nm.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.loc_nm_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_loc_nm);
		p.columnSmpl_str_ln_tgt_flg.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.str_ln_tgt_flg_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_str_ln_tgt_flg);
		p.SmplTable.addTable(p.Smpl_str_ln_p_PPanel.StrLnTable);
		p.Smpl_str_ln_p_PPanel.columnStrLn_str_ln_cd.setLinkBeans(p.columnSmpl_str_ln_nm);
		p.columnSmpl_stk_arrv_bp_cd.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.stk_arrv_bp_cd_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_stk_arrv_bp_cd);
		p.columnSmpl_stk_arrv_bp_nm.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.stk_arrv_bp_nm_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_stk_arrv_bp_nm);
		p.columnSmpl_gd_cd.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.gd_cd_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_gd_cd);
		p.columnSmpl_gd_nm.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.gd_nm_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_gd_nm);
		p.columnSmpl_quality_typ.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.quality_typ_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_quality_typ);
		p.columnSmpl_quality_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.quality_typ_nm_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_quality_typ_nm);
		p.columnSmpl_stk_insp_typ.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.stk_insp_typ_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_stk_insp_typ);
		p.columnSmpl_stk_insp_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.stk_insp_typ_nm_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_stk_insp_typ_nm);
		p.columnSmpl_stk_id_typ.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.stk_id_typ_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_stk_id_typ);
		p.columnSmpl_stk_id_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.stk_id_typ_nm_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_stk_id_typ_nm);
		p.columnSmpl_stk_bp_cd.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.stk_bp_cd_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_stk_bp_cd);
		p.columnSmpl_stk_bp_nm.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.stk_bp_nm_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_stk_bp_nm);
		p.SmplTable.addTable(p.Smpl_sno_p_PPanel.SnoTable);
		p.SmplTable.addTable(p.Smpl_wrk_no_p_PPanel.WrkNoTable);
		p.columnSmpl_fix_no_typ.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.fix_no_typ_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_fix_no_typ);
		p.columnSmpl_fix_no_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.fix_no_typ_nm_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_fix_no_typ_nm);
		p.columnSmpl_fix_no.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.fix_no_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_fix_no);
		p.SmplTable.addTable(p.Smpl_act_dt_p_PPanel.YmdHmTable);
		p.columnSmpl_ac_dt.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.ac_dt_META);
		p.columnSmpl_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.SmplTable.addColumnConfig(p.columnSmpl_ac_dt);
		p.SmplTable.addTable(p.Smpl_can_ac_dt_p_PPanel.CanAcDtTable);
		p.columnSmpl_bd_dpt_cd.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.bd_dpt_cd_META);
		p.columnSmpl_bd_dpt_cd.addLinkBeans(p.columnSmpl_bd_dpt_nm);
		p.SmplTable.addColumnConfig(p.columnSmpl_bd_dpt_cd);
		p.columnSmpl_bd_dpt_nm.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.bd_dpt_nm_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_bd_dpt_nm);
		p.columnSmpl_insp_smpl_act_no.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.insp_smpl_act_no_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_insp_smpl_act_no);
		p.columnSmpl_insp_schd_no.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.insp_schd_no_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_insp_schd_no);
		p.columnSmpl_insp_no.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.insp_no_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_insp_no);
		p.columnSmpl_insp_act_no.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.insp_act_no_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_insp_act_no);
		p.columnSmpl_trd_rmrks.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.trd_rmrks_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_trd_rmrks);
		p.columnSmpl_intr_rmrks.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.intr_rmrks_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_intr_rmrks);
		p.columnSmpl_sub_char1.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.sub_char1_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_sub_char1);
		p.columnSmpl_sub_char2.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.sub_char2_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_sub_char2);
		p.columnSmpl_sub_char3.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.sub_char3_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_sub_char3);
		p.columnSmpl_itm_cd.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.itm_cd_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_itm_cd);
		p.columnSmpl_itm_sub1.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.itm_sub1_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_itm_sub1);
		p.columnSmpl_itm_sub2.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.itm_sub2_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_itm_sub2);
		p.columnSmpl_itm_sub3.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.itm_sub3_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_itm_sub3);
		p.columnSmpl_lims_flg.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.lims_flg_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_lims_flg);
		p.columnSmpl_ext_sys_cd.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.ext_sys_cd_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_ext_sys_cd);
		p.columnSmpl_ext_sys_nm.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.ext_sys_nm_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_ext_sys_nm);
		p.columnSmpl_ext_insp_smpl_act_no.setMeta(mcframe.clientMSBF.MSBFP0070.SmplR.ext_insp_smpl_act_no_META);
		p.SmplTable.addColumnConfig(p.columnSmpl_ext_insp_smpl_act_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Hdr_ver_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_ver_no.getListConfig().setPutter(getHdr_ver_no_ListPutter());
		Hdr_smpl_inst_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_smpl_inst_unit_cd.getListConfig().setPutter(getHdr_smpl_inst_unit_cd_ListPutter());
		Hdr_act_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_act_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getHdr_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		Hdr_quality_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_quality_typ.getListConfig().setPutter(getHdr_quality_typ_ListPutter());
		Hdr_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_gd_cd.getListConfig().setPutter(getHdr_gd_cd_ListPutter());
		Hdr_dfct_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_dfct_rsn_cd.getListConfig().setPutter(getHdr_dfct_rsn_cd_ListPutter());
		Hdr_insp_judg_rslt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_insp_judg_rslt_typ.getListConfig().setPutter(getHdr_insp_judg_rslt_typ_ListPutter());
		Hdr_judg_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_judg_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getHdr_judg_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		columnDtl_quality_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_quality_typ.getListConfig().setPutter(getDtl_quality_typ_ListPutter());
		columnDtl_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_gd_cd.getListConfig().setPutter(getDtl_gd_cd_ListPutter());
		columnDtl_dfct_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_dfct_rsn_cd.getListConfig().setPutter(getDtl_dfct_rsn_cd_ListPutter());
		columnDtl_pack_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_pack_unit_cd.getListConfig().setPutter(getDtl_pack_unit_cd_ListPutter());
		columnSmpl_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnSmpl_loc_cd.getListConfig().setPutter(getSmpl_loc_cd_ListPutter());
		Smpl_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Smpl_str_ln_p_PPanel.columnStrLn_str_ln_cd.getListConfig().setPutter(getSmpl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter());
		columnSmpl_bd_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnSmpl_bd_dpt_cd.getListConfig().setPutter(getSmpl_bd_dpt_cd_ListPutter());
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
	 * この画面を[JUDG]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setJUDGStatus() {
		status = JUDG;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_J]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_JStatus() {
		status = FIX_J;
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
		else if (JUDG.equals(status)) {
			setJUDGStatus();
		}
		else if (FIX_J.equals(status)) {
			setFIX_JStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (FIX_D.equals(status)) {
			setFIX_DStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * [Hdr_ver_no_ListPutter]の作成
	 */
	protected MCListPutter createHdr_ver_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Hdr_smpl_inst_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_smpl_inst_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Unit");
		return lp;
	}
	 
	/**
	 * [Hdr_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Hdr_quality_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_quality_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.QualityTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_gd_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_gd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StkGd");
		return lp;
	}
	 
	/**
	 * [Hdr_dfct_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_dfct_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DfctBizRsn");
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
	 * [Hdr_judg_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_judg_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Dtl_quality_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_quality_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.QualityTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_gd_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_gd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StkGd");
		return lp;
	}
	 
	/**
	 * [Dtl_dfct_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dfct_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DfctBizRsn");
		return lp;
	}
	 
	/**
	 * [Dtl_pack_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_pack_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
		return lp;
	}
	 
	/**
	 * [Smpl_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createSmpl_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Smpl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createSmpl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}

	/**
	 * [Smpl_bd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createSmpl_bd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Hdr_ver_no) return getHdr_ver_no(row, info);
		if(combo == Hdr_smpl_inst_unit_cd) return getHdr_smpl_inst_unit_cd(row, info);
		if(combo == Hdr_act_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getHdr_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == Hdr_quality_typ) return getHdr_quality_typ(row, info);
		if(combo == Hdr_gd_cd) return getHdr_gd_cd(row, info);
		if(combo == Hdr_dfct_rsn_cd) return getHdr_dfct_rsn_cd(row, info);
		if(combo == Hdr_insp_judg_rslt_typ) return getHdr_insp_judg_rslt_typ(row, info);
		if(combo == Hdr_judg_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getHdr_judg_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == columnDtl_quality_typ) return getDtl_quality_typ(row, info);
		if(combo == columnDtl_gd_cd) return getDtl_gd_cd(row, info);
		if(combo == columnDtl_dfct_rsn_cd) return getDtl_dfct_rsn_cd(row, info);
		if(combo == columnDtl_pack_unit_cd) return getDtl_pack_unit_cd(row, info);
		if(combo == columnSmpl_loc_cd) return getSmpl_loc_cd(row, info);
		if(combo == Smpl_str_ln_p_PPanel.columnStrLn_str_ln_cd) return getSmpl_str_ln_p_PPanel_columnStrLn_str_ln_cd(row, info);
		if(combo == columnSmpl_bd_dpt_cd) return getSmpl_bd_dpt_cd(row, info);
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
		else if (ap == DtlBtn_rdel) doDtlBtn_rdel(info);
		else if (ap == DtlBtn_rcopy) doDtlBtn_rcopy(info);
		else if (ap == SmplBtn_radd) doSmplBtn_radd(info);
		else if (ap == SmplBtn_rdel) doSmplBtn_rdel(info);
		else if (ap == SmplBtn_rcopy) doSmplBtn_rcopy(info);
		else if (ap == Btn_open_MSBFP0050) doBtn_open_MSBFP0050(info);
		else if (ap == Btn_prnt) doBtn_prnt(info);
		else if (ap == Btn_act_ins) doBtn_act_ins(info);
		else if (ap == Btn_act_upd) doBtn_act_upd(info);
		else if (ap == Btn_act_del) doBtn_act_del(info);
		else if (ap == Btn_judg_upd) doBtn_judg_upd(info);
		else if (ap == Btn_judg_del) doBtn_judg_del(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_rdel(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_rcopy(MCEventInfo info);

	/**
	 * [SmplBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doSmplBtn_radd(MCEventInfo info);

	/**
	 * [SmplBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doSmplBtn_rdel(MCEventInfo info);

	/**
	 * [SmplBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doSmplBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBFP0050]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBFP0050(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt(MCEventInfo info);

	/**
	 * [Btn]パネルの[act_ins]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_act_ins(MCEventInfo info);

	/**
	 * [Btn]パネルの[act_upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_act_upd(MCEventInfo info);

	/**
	 * [Btn]パネルの[act_del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_act_del(MCEventInfo info);

	/**
	 * [Btn]パネルの[judg_upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_judg_upd(MCEventInfo info);

	/**
	 * [Btn]パネルの[judg_del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_judg_del(MCEventInfo info);

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
		if (vc == SmplTable) return doSmpl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_insp_no) return doCnd_insp_no_VC(info);
		if (vc == Hdr_ver_no) return doHdr_ver_no_VC(info);
		if (vc == Hdr_insp_no) return doHdr_insp_no_VC(info);
		if (vc == Hdr_insp_act_no) return doHdr_insp_act_no_VC(info);
		if (vc == Hdr_insp_freq) return doHdr_insp_freq_VC(info);
		if (vc == Hdr_insp_mtd_typ) return doHdr_insp_mtd_typ_VC(info);
		if (vc == Hdr_insp_mtd_typ_nm) return doHdr_insp_mtd_typ_nm_VC(info);
		if (vc == Hdr_insp_typ) return doHdr_insp_typ_VC(info);
		if (vc == Hdr_insp_typ_nm) return doHdr_insp_typ_nm_VC(info);
		if (vc == Hdr_insp_sts_typ) return doHdr_insp_sts_typ_VC(info);
		if (vc == Hdr_insp_sts_typ_nm) return doHdr_insp_sts_typ_nm_VC(info);
		if (vc == Hdr_pack_unit_cd) return doHdr_pack_unit_cd_VC(info);
		if (vc == Hdr_pack_unit_nm) return doHdr_pack_unit_nm_VC(info);
		if (vc == Hdr_pack_unit_dec_place) return doHdr_pack_unit_dec_place_VC(info);
		if (vc == Hdr_smpl_inst_unit_cd) return doHdr_smpl_inst_unit_cd_VC(info);
		if (vc == Hdr_smpl_inst_unit_nm) return doHdr_smpl_inst_unit_nm_VC(info);
		if (vc == Hdr_smpl_inst_unit_dec_place) return doHdr_smpl_inst_unit_dec_place_VC(info);
		if (vc == Hdr_base_unit_cd) return doHdr_base_unit_cd_VC(info);
		if (vc == Hdr_base_unit_nm) return doHdr_base_unit_nm_VC(info);
		if (vc == Hdr_base_unit_dec_place) return doHdr_base_unit_dec_place_VC(info);
		if (vc == Hdr_base_unit_rnd_typ) return doHdr_base_unit_rnd_typ_VC(info);
		if (vc == Hdr_mfg_loc_cd) return doHdr_mfg_loc_cd_VC(info);
		if (vc == Hdr_mfg_loc_nm) return doHdr_mfg_loc_nm_VC(info);
		if (vc == Hdr_sppl_cd) return doHdr_sppl_cd_VC(info);
		if (vc == Hdr_sppl_nm) return doHdr_sppl_nm_VC(info);
		if (vc == Hdr_maker_cd) return doHdr_maker_cd_VC(info);
		if (vc == Hdr_maker_nm) return doHdr_maker_nm_VC(info);
		if (vc == Hdr_bp_lot_no) return doHdr_bp_lot_no_VC(info);
		if (vc == Hdr_std_insp_flg) return doHdr_std_insp_flg_VC(info);
		if (vc == Hdr_std_req_flg) return doHdr_std_req_flg_VC(info);
		if (vc == Hdr_std_cnf_req_flg) return doHdr_std_cnf_req_flg_VC(info);
		if (vc == Hdr_std_cmpl_flg) return doHdr_std_cmpl_flg_VC(info);
		if (vc == Hdr_std_cnf_cmpl_flg) return doHdr_std_cnf_cmpl_flg_VC(info);
		if (vc == Hdr_insp_rslt_prnt_flg) return doHdr_insp_rslt_prnt_flg_VC(info);
		if (vc == Hdr_insp_rslt_prnt_tm) return doHdr_insp_rslt_prnt_tm_VC(info);
		if (vc == Hdr_quality_typ) return doHdr_quality_typ_VC(info);
		if (vc == Hdr_quality_typ_nm) return doHdr_quality_typ_nm_VC(info);
		if (vc == Hdr_gd_cd) return doHdr_gd_cd_VC(info);
		if (vc == Hdr_gd_nm) return doHdr_gd_nm_VC(info);
		if (vc == Hdr_dfct_rsn_cd) return doHdr_dfct_rsn_cd_VC(info);
		if (vc == Hdr_dfct_rsn_nm) return doHdr_dfct_rsn_nm_VC(info);
		if (vc == Hdr_vld_dt_upd_flg) return doHdr_vld_dt_upd_flg_VC(info);
		if (vc == Hdr_vld_pd) return doHdr_vld_pd_VC(info);
		if (vc == Hdr_lmt_pd) return doHdr_lmt_pd_VC(info);
		if (vc == Hdr_calc_pd_typ) return doHdr_calc_pd_typ_VC(info);
		if (vc == Hdr_calc_pd_typ_nm) return doHdr_calc_pd_typ_nm_VC(info);
		if (vc == Hdr_lmt_dt_frm_typ) return doHdr_lmt_dt_frm_typ_VC(info);
		if (vc == Hdr_lmt_dt_frm_typ_nm) return doHdr_lmt_dt_frm_typ_nm_VC(info);
		if (vc == Hdr_lmt_ctl_categ) return doHdr_lmt_ctl_categ_VC(info);
		if (vc == Hdr_lmt_dt_frm) return doHdr_lmt_dt_frm_VC(info);
		if (vc == Hdr_vld_dt_now) return doHdr_vld_dt_now_VC(info);
		if (vc == Hdr_vld_dt) return doHdr_vld_dt_VC(info);
		if (vc == Hdr_lmt_dt) return doHdr_lmt_dt_VC(info);
		if (vc == Hdr_lmt_up_flg) return doHdr_lmt_up_flg_VC(info);
		if (vc == Hdr_in_prmt_insp_flg) return doHdr_in_prmt_insp_flg_VC(info);
		if (vc == Hdr_intr_rmrks) return doHdr_intr_rmrks_VC(info);
		if (vc == Hdr_lot_rmrks) return doHdr_lot_rmrks_VC(info);
		if (vc == Hdr_sub_char1) return doHdr_sub_char1_VC(info);
		if (vc == Hdr_sub_char2) return doHdr_sub_char2_VC(info);
		if (vc == Hdr_sub_char3) return doHdr_sub_char3_VC(info);
		if (vc == Hdr_lims_flg) return doHdr_lims_flg_VC(info);
		if (vc == Hdr_ext_sys_cd) return doHdr_ext_sys_cd_VC(info);
		if (vc == Hdr_ext_sys_nm) return doHdr_ext_sys_nm_VC(info);
		if (vc == Hdr_ext_insp_act_no) return doHdr_ext_insp_act_no_VC(info);
		if (vc == Hdr_insp_aprv_sts_typ) return doHdr_insp_aprv_sts_typ_VC(info);
		if (vc == Hdr_insp_aprv_sts_typ_nm) return doHdr_insp_aprv_sts_typ_nm_VC(info);
		if (vc == Hdr_insp_judg_rslt_typ) return doHdr_insp_judg_rslt_typ_VC(info);
		if (vc == Hdr_insp_judg_rslt_typ_nm) return doHdr_insp_judg_rslt_typ_nm_VC(info);
		if (vc == Hdr_judg_dt) return doHdr_judg_dt_VC(info);
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
		if (vc == Hdr_cont_fctr_flg) return doHdr_cont_fctr_flg_VC(info);
		if (vc == Hdr_insp_ptn_cd) return doHdr_insp_ptn_cd_VC(info);
		if (vc == Hdr_site_cd) return doHdr_site_cd_VC(info);
		if (vc == columnDtl_itm_cd) return doDtl_itm_cd_VC(info);
		if (vc == columnDtl_itm_sub1) return doDtl_itm_sub1_VC(info);
		if (vc == columnDtl_itm_sub2) return doDtl_itm_sub2_VC(info);
		if (vc == columnDtl_itm_sub3) return doDtl_itm_sub3_VC(info);
		if (vc == columnDtl_wg_cd) return doDtl_wg_cd_VC(info);
		if (vc == columnDtl_loc_cd) return doDtl_loc_cd_VC(info);
		if (vc == columnDtl_loc_nm) return doDtl_loc_nm_VC(info);
		if (vc == columnDtl_str_ln_tgt_flg) return doDtl_str_ln_tgt_flg_VC(info);
		if (vc == columnDtl_str_ln_cd) return doDtl_str_ln_cd_VC(info);
		if (vc == columnDtl_str_ln_nm) return doDtl_str_ln_nm_VC(info);
		if (vc == columnDtl_str_ln_cd_none_flg) return doDtl_str_ln_cd_none_flg_VC(info);
		if (vc == columnDtl_stk_arrv_bp_cd) return doDtl_stk_arrv_bp_cd_VC(info);
		if (vc == columnDtl_stk_arrv_bp_nm) return doDtl_stk_arrv_bp_nm_VC(info);
		if (vc == columnDtl_quality_typ) return doDtl_quality_typ_VC(info);
		if (vc == columnDtl_quality_typ_nm) return doDtl_quality_typ_nm_VC(info);
		if (vc == columnDtl_gd_cd) return doDtl_gd_cd_VC(info);
		if (vc == columnDtl_gd_nm) return doDtl_gd_nm_VC(info);
		if (vc == columnDtl_dfct_rsn_cd) return doDtl_dfct_rsn_cd_VC(info);
		if (vc == columnDtl_dfct_rsn_nm) return doDtl_dfct_rsn_nm_VC(info);
		if (vc == columnDtl_base_flg) return doDtl_base_flg_VC(info);
		if (vc == columnDtl_pack_unit_cd) return doDtl_pack_unit_cd_VC(info);
		if (vc == columnDtl_pack_unit_nm) return doDtl_pack_unit_nm_VC(info);
		if (vc == columnDtl_pack_unit_dec_place) return doDtl_pack_unit_dec_place_VC(info);
		if (vc == columnDtl_pack_unit_dmn_qty) return doDtl_pack_unit_dmn_qty_VC(info);
		if (vc == columnDtl_pack_unit_conv_qty) return doDtl_pack_unit_conv_qty_VC(info);
		if (vc == columnDtl_base_unit_cd) return doDtl_base_unit_cd_VC(info);
		if (vc == columnDtl_base_unit_nm) return doDtl_base_unit_nm_VC(info);
		if (vc == columnDtl_base_unit_dec_place) return doDtl_base_unit_dec_place_VC(info);
		if (vc == columnDtl_base_unit_rnd_typ) return doDtl_base_unit_rnd_typ_VC(info);
		if (vc == columnDtl_stk_pack_unit_cd) return doDtl_stk_pack_unit_cd_VC(info);
		if (vc == columnDtl_stk_pack_unit_nm) return doDtl_stk_pack_unit_nm_VC(info);
		if (vc == columnDtl_stk_pack_unit_dec_place) return doDtl_stk_pack_unit_dec_place_VC(info);
		if (vc == columnDtl_stk_base_unit_cd) return doDtl_stk_base_unit_cd_VC(info);
		if (vc == columnDtl_stk_base_unit_nm) return doDtl_stk_base_unit_nm_VC(info);
		if (vc == columnDtl_stk_base_unit_dec_place) return doDtl_stk_base_unit_dec_place_VC(info);
		if (vc == columnDtl_pack_xfr_pack_unit_cd) return doDtl_pack_xfr_pack_unit_cd_VC(info);
		if (vc == columnDtl_pack_xfr_pack_unit_nm) return doDtl_pack_xfr_pack_unit_nm_VC(info);
		if (vc == columnDtl_pack_xfr_pack_unit_dec_place) return doDtl_pack_xfr_pack_unit_dec_place_VC(info);
		if (vc == columnDtl_pack_xfr_pack_unit_dmn_qty) return doDtl_pack_xfr_pack_unit_dmn_qty_VC(info);
		if (vc == columnDtl_pack_xfr_pack_unit_conv_qty) return doDtl_pack_xfr_pack_unit_conv_qty_VC(info);
		if (vc == columnDtl_pack_xfr_base_unit_cd) return doDtl_pack_xfr_base_unit_cd_VC(info);
		if (vc == columnDtl_pack_xfr_base_unit_nm) return doDtl_pack_xfr_base_unit_nm_VC(info);
		if (vc == columnDtl_pack_xfr_base_unit_dec_place) return doDtl_pack_xfr_base_unit_dec_place_VC(info);
		if (vc == columnDtl_pack_xfr_base_unit_rnd_typ) return doDtl_pack_xfr_base_unit_rnd_typ_VC(info);
		if (vc == columnDtl_stk_insp_typ) return doDtl_stk_insp_typ_VC(info);
		if (vc == columnDtl_stk_insp_typ_nm) return doDtl_stk_insp_typ_nm_VC(info);
		if (vc == columnDtl_stk_id_typ) return doDtl_stk_id_typ_VC(info);
		if (vc == columnDtl_stk_id_typ_nm) return doDtl_stk_id_typ_nm_VC(info);
		if (vc == columnDtl_stk_bp_cd) return doDtl_stk_bp_cd_VC(info);
		if (vc == columnDtl_stk_bp_nm) return doDtl_stk_bp_nm_VC(info);
		if (vc == columnDtl_fix_no_typ) return doDtl_fix_no_typ_VC(info);
		if (vc == columnDtl_fix_no_typ_nm) return doDtl_fix_no_typ_nm_VC(info);
		if (vc == columnDtl_fix_no) return doDtl_fix_no_VC(info);
		if (vc == columnDtl_insp_act_d_no) return doDtl_insp_act_d_no_VC(info);
		if (vc == columnDtl_insp_judg_d_no) return doDtl_insp_judg_d_no_VC(info);
		if (vc == columnDtl_insp_act_no) return doDtl_insp_act_no_VC(info);
		if (vc == columnDtl_insp_no) return doDtl_insp_no_VC(info);
		if (vc == columnDtl_intr_rmrks) return doDtl_intr_rmrks_VC(info);
		if (vc == columnDtl_sub_char1) return doDtl_sub_char1_VC(info);
		if (vc == columnDtl_sub_char2) return doDtl_sub_char2_VC(info);
		if (vc == columnDtl_sub_char3) return doDtl_sub_char3_VC(info);
		if (vc == columnDtl_lims_flg) return doDtl_lims_flg_VC(info);
		if (vc == columnDtl_ext_sys_cd) return doDtl_ext_sys_cd_VC(info);
		if (vc == columnDtl_ext_sys_nm) return doDtl_ext_sys_nm_VC(info);
		if (vc == columnDtl_ext_insp_act_d_no) return doDtl_ext_insp_act_d_no_VC(info);
		if (vc == columnSmpl_base_unit_cd) return doSmpl_base_unit_cd_VC(info);
		if (vc == columnSmpl_base_unit_nm) return doSmpl_base_unit_nm_VC(info);
		if (vc == columnSmpl_base_unit_dec_place) return doSmpl_base_unit_dec_place_VC(info);
		if (vc == columnSmpl_base_unit_rnd_typ) return doSmpl_base_unit_rnd_typ_VC(info);
		if (vc == columnSmpl_pack_xfr_pack_unit_cd) return doSmpl_pack_xfr_pack_unit_cd_VC(info);
		if (vc == columnSmpl_pack_xfr_pack_unit_nm) return doSmpl_pack_xfr_pack_unit_nm_VC(info);
		if (vc == columnSmpl_pack_xfr_pack_unit_dec_place) return doSmpl_pack_xfr_pack_unit_dec_place_VC(info);
		if (vc == columnSmpl_pack_xfr_pack_unit_dmn_qty) return doSmpl_pack_xfr_pack_unit_dmn_qty_VC(info);
		if (vc == columnSmpl_pack_xfr_pack_unit_conv_qty) return doSmpl_pack_xfr_pack_unit_conv_qty_VC(info);
		if (vc == columnSmpl_pack_xfr_base_unit_cd) return doSmpl_pack_xfr_base_unit_cd_VC(info);
		if (vc == columnSmpl_pack_xfr_base_unit_nm) return doSmpl_pack_xfr_base_unit_nm_VC(info);
		if (vc == columnSmpl_pack_xfr_base_unit_dec_place) return doSmpl_pack_xfr_base_unit_dec_place_VC(info);
		if (vc == columnSmpl_pack_xfr_base_unit_rnd_typ) return doSmpl_pack_xfr_base_unit_rnd_typ_VC(info);
		if (vc == columnSmpl_so_cmpl_flg) return doSmpl_so_cmpl_flg_VC(info);
		if (vc == columnSmpl_wg_cd) return doSmpl_wg_cd_VC(info);
		if (vc == columnSmpl_loc_cd) return doSmpl_loc_cd_VC(info);
		if (vc == columnSmpl_loc_nm) return doSmpl_loc_nm_VC(info);
		if (vc == columnSmpl_str_ln_tgt_flg) return doSmpl_str_ln_tgt_flg_VC(info);
		if (vc == columnSmpl_stk_arrv_bp_cd) return doSmpl_stk_arrv_bp_cd_VC(info);
		if (vc == columnSmpl_stk_arrv_bp_nm) return doSmpl_stk_arrv_bp_nm_VC(info);
		if (vc == columnSmpl_gd_cd) return doSmpl_gd_cd_VC(info);
		if (vc == columnSmpl_gd_nm) return doSmpl_gd_nm_VC(info);
		if (vc == columnSmpl_quality_typ) return doSmpl_quality_typ_VC(info);
		if (vc == columnSmpl_quality_typ_nm) return doSmpl_quality_typ_nm_VC(info);
		if (vc == columnSmpl_stk_insp_typ) return doSmpl_stk_insp_typ_VC(info);
		if (vc == columnSmpl_stk_insp_typ_nm) return doSmpl_stk_insp_typ_nm_VC(info);
		if (vc == columnSmpl_stk_id_typ) return doSmpl_stk_id_typ_VC(info);
		if (vc == columnSmpl_stk_id_typ_nm) return doSmpl_stk_id_typ_nm_VC(info);
		if (vc == columnSmpl_stk_bp_cd) return doSmpl_stk_bp_cd_VC(info);
		if (vc == columnSmpl_stk_bp_nm) return doSmpl_stk_bp_nm_VC(info);
		if (vc == columnSmpl_fix_no_typ) return doSmpl_fix_no_typ_VC(info);
		if (vc == columnSmpl_fix_no_typ_nm) return doSmpl_fix_no_typ_nm_VC(info);
		if (vc == columnSmpl_fix_no) return doSmpl_fix_no_VC(info);
		if (vc == columnSmpl_ac_dt) return doSmpl_ac_dt_VC(info);
		if (vc == columnSmpl_bd_dpt_cd) return doSmpl_bd_dpt_cd_VC(info);
		if (vc == columnSmpl_bd_dpt_nm) return doSmpl_bd_dpt_nm_VC(info);
		if (vc == columnSmpl_insp_smpl_act_no) return doSmpl_insp_smpl_act_no_VC(info);
		if (vc == columnSmpl_insp_schd_no) return doSmpl_insp_schd_no_VC(info);
		if (vc == columnSmpl_insp_no) return doSmpl_insp_no_VC(info);
		if (vc == columnSmpl_insp_act_no) return doSmpl_insp_act_no_VC(info);
		if (vc == columnSmpl_trd_rmrks) return doSmpl_trd_rmrks_VC(info);
		if (vc == columnSmpl_intr_rmrks) return doSmpl_intr_rmrks_VC(info);
		if (vc == columnSmpl_sub_char1) return doSmpl_sub_char1_VC(info);
		if (vc == columnSmpl_sub_char2) return doSmpl_sub_char2_VC(info);
		if (vc == columnSmpl_sub_char3) return doSmpl_sub_char3_VC(info);
		if (vc == columnSmpl_itm_cd) return doSmpl_itm_cd_VC(info);
		if (vc == columnSmpl_itm_sub1) return doSmpl_itm_sub1_VC(info);
		if (vc == columnSmpl_itm_sub2) return doSmpl_itm_sub2_VC(info);
		if (vc == columnSmpl_itm_sub3) return doSmpl_itm_sub3_VC(info);
		if (vc == columnSmpl_lims_flg) return doSmpl_lims_flg_VC(info);
		if (vc == columnSmpl_ext_sys_cd) return doSmpl_ext_sys_cd_VC(info);
		if (vc == columnSmpl_ext_sys_nm) return doSmpl_ext_sys_nm_VC(info);
		if (vc == columnSmpl_ext_insp_smpl_act_no) return doSmpl_ext_insp_smpl_act_no_VC(info);
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
	 * [Smpl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[ver_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ver_no_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[insp_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_act_no_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[pack_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pack_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pack_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pack_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pack_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pack_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[smpl_inst_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_smpl_inst_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[smpl_inst_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_smpl_inst_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[smpl_inst_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_smpl_inst_unit_dec_place_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[base_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_base_unit_rnd_typ_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[bp_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bp_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[std_insp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_std_insp_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[std_cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_std_cmpl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[std_cnf_cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_std_cnf_cmpl_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_gd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dfct_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dfct_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dfct_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dfct_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[vld_dt_upd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_vld_dt_upd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[vld_pd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_vld_pd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[lmt_pd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lmt_pd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[calc_pd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_calc_pd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[calc_pd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_calc_pd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[lmt_dt_frm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lmt_dt_frm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[lmt_dt_frm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lmt_dt_frm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[lmt_ctl_categ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lmt_ctl_categ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[lmt_dt_frm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lmt_dt_frm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[vld_dt_now]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_vld_dt_now_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[lot_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lot_rmrks_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[lims_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lims_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ext_insp_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ext_insp_act_no_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[cont_fctr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cont_fctr_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_sub1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_sub1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_sub2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_sub2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_sub3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_sub3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[str_ln_cd_none_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_str_ln_cd_none_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_arrv_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_arrv_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dfct_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dfct_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dfct_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dfct_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pack_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pack_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pack_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pack_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pack_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pack_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pack_unit_dmn_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pack_unit_dmn_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pack_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pack_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_pack_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_pack_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_pack_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_pack_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_pack_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_pack_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pack_xfr_pack_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pack_xfr_pack_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pack_xfr_pack_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pack_xfr_pack_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pack_xfr_pack_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pack_xfr_pack_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pack_xfr_pack_unit_dmn_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pack_xfr_pack_unit_dmn_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pack_xfr_pack_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pack_xfr_pack_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pack_xfr_base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pack_xfr_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pack_xfr_base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pack_xfr_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pack_xfr_base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pack_xfr_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pack_xfr_base_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pack_xfr_base_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_insp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_insp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fix_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fix_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fix_no_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fix_no_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fix_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fix_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[insp_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_insp_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[insp_judg_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_insp_judg_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[insp_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_insp_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[insp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_insp_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[lims_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lims_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ext_insp_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_insp_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[base_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_base_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[pack_xfr_pack_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_pack_xfr_pack_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[pack_xfr_pack_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_pack_xfr_pack_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[pack_xfr_pack_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_pack_xfr_pack_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[pack_xfr_pack_unit_dmn_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_pack_xfr_pack_unit_dmn_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[pack_xfr_pack_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_pack_xfr_pack_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[pack_xfr_base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_pack_xfr_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[pack_xfr_base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_pack_xfr_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[pack_xfr_base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_pack_xfr_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[pack_xfr_base_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_pack_xfr_base_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[so_cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_so_cmpl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[stk_arrv_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_stk_arrv_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[stk_arrv_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_stk_arrv_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_gd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[stk_insp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_stk_insp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[stk_insp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_stk_insp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[stk_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_stk_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[stk_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_stk_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[stk_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_stk_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[stk_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_stk_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[fix_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_fix_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[fix_no_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_fix_no_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[fix_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_fix_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[bd_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_bd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[bd_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_bd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[insp_smpl_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_insp_smpl_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[insp_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_insp_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[insp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_insp_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[insp_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_insp_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[itm_sub1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_itm_sub1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[itm_sub2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_itm_sub2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[itm_sub3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_itm_sub3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[lims_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_lims_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Smpl]パネルの[ext_insp_smpl_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSmpl_ext_insp_smpl_act_no_VC(MCEventInfo info){
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
		else if (nc == SmplTable) doSmpl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_insp_no) doCnd_insp_no_NC(info);
		else if (nc == Hdr_ver_no) doHdr_ver_no_NC(info);
		else if (nc == Hdr_insp_no) doHdr_insp_no_NC(info);
		else if (nc == Hdr_insp_act_no) doHdr_insp_act_no_NC(info);
		else if (nc == Hdr_insp_freq) doHdr_insp_freq_NC(info);
		else if (nc == Hdr_insp_mtd_typ) doHdr_insp_mtd_typ_NC(info);
		else if (nc == Hdr_insp_mtd_typ_nm) doHdr_insp_mtd_typ_nm_NC(info);
		else if (nc == Hdr_insp_typ) doHdr_insp_typ_NC(info);
		else if (nc == Hdr_insp_typ_nm) doHdr_insp_typ_nm_NC(info);
		else if (nc == Hdr_insp_sts_typ) doHdr_insp_sts_typ_NC(info);
		else if (nc == Hdr_insp_sts_typ_nm) doHdr_insp_sts_typ_nm_NC(info);
		else if (nc == Hdr_pack_unit_cd) doHdr_pack_unit_cd_NC(info);
		else if (nc == Hdr_pack_unit_nm) doHdr_pack_unit_nm_NC(info);
		else if (nc == Hdr_pack_unit_dec_place) doHdr_pack_unit_dec_place_NC(info);
		else if (nc == Hdr_smpl_inst_unit_cd) doHdr_smpl_inst_unit_cd_NC(info);
		else if (nc == Hdr_smpl_inst_unit_nm) doHdr_smpl_inst_unit_nm_NC(info);
		else if (nc == Hdr_smpl_inst_unit_dec_place) doHdr_smpl_inst_unit_dec_place_NC(info);
		else if (nc == Hdr_base_unit_cd) doHdr_base_unit_cd_NC(info);
		else if (nc == Hdr_base_unit_nm) doHdr_base_unit_nm_NC(info);
		else if (nc == Hdr_base_unit_dec_place) doHdr_base_unit_dec_place_NC(info);
		else if (nc == Hdr_base_unit_rnd_typ) doHdr_base_unit_rnd_typ_NC(info);
		else if (nc == Hdr_mfg_loc_cd) doHdr_mfg_loc_cd_NC(info);
		else if (nc == Hdr_mfg_loc_nm) doHdr_mfg_loc_nm_NC(info);
		else if (nc == Hdr_sppl_cd) doHdr_sppl_cd_NC(info);
		else if (nc == Hdr_sppl_nm) doHdr_sppl_nm_NC(info);
		else if (nc == Hdr_maker_cd) doHdr_maker_cd_NC(info);
		else if (nc == Hdr_maker_nm) doHdr_maker_nm_NC(info);
		else if (nc == Hdr_bp_lot_no) doHdr_bp_lot_no_NC(info);
		else if (nc == Hdr_std_insp_flg) doHdr_std_insp_flg_NC(info);
		else if (nc == Hdr_std_req_flg) doHdr_std_req_flg_NC(info);
		else if (nc == Hdr_std_cnf_req_flg) doHdr_std_cnf_req_flg_NC(info);
		else if (nc == Hdr_std_cmpl_flg) doHdr_std_cmpl_flg_NC(info);
		else if (nc == Hdr_std_cnf_cmpl_flg) doHdr_std_cnf_cmpl_flg_NC(info);
		else if (nc == Hdr_insp_rslt_prnt_flg) doHdr_insp_rslt_prnt_flg_NC(info);
		else if (nc == Hdr_insp_rslt_prnt_tm) doHdr_insp_rslt_prnt_tm_NC(info);
		else if (nc == Hdr_quality_typ) doHdr_quality_typ_NC(info);
		else if (nc == Hdr_quality_typ_nm) doHdr_quality_typ_nm_NC(info);
		else if (nc == Hdr_gd_cd) doHdr_gd_cd_NC(info);
		else if (nc == Hdr_gd_nm) doHdr_gd_nm_NC(info);
		else if (nc == Hdr_dfct_rsn_cd) doHdr_dfct_rsn_cd_NC(info);
		else if (nc == Hdr_dfct_rsn_nm) doHdr_dfct_rsn_nm_NC(info);
		else if (nc == Hdr_vld_dt_upd_flg) doHdr_vld_dt_upd_flg_NC(info);
		else if (nc == Hdr_vld_pd) doHdr_vld_pd_NC(info);
		else if (nc == Hdr_lmt_pd) doHdr_lmt_pd_NC(info);
		else if (nc == Hdr_calc_pd_typ) doHdr_calc_pd_typ_NC(info);
		else if (nc == Hdr_calc_pd_typ_nm) doHdr_calc_pd_typ_nm_NC(info);
		else if (nc == Hdr_lmt_dt_frm_typ) doHdr_lmt_dt_frm_typ_NC(info);
		else if (nc == Hdr_lmt_dt_frm_typ_nm) doHdr_lmt_dt_frm_typ_nm_NC(info);
		else if (nc == Hdr_lmt_ctl_categ) doHdr_lmt_ctl_categ_NC(info);
		else if (nc == Hdr_lmt_dt_frm) doHdr_lmt_dt_frm_NC(info);
		else if (nc == Hdr_vld_dt_now) doHdr_vld_dt_now_NC(info);
		else if (nc == Hdr_vld_dt) doHdr_vld_dt_NC(info);
		else if (nc == Hdr_lmt_dt) doHdr_lmt_dt_NC(info);
		else if (nc == Hdr_lmt_up_flg) doHdr_lmt_up_flg_NC(info);
		else if (nc == Hdr_in_prmt_insp_flg) doHdr_in_prmt_insp_flg_NC(info);
		else if (nc == Hdr_intr_rmrks) doHdr_intr_rmrks_NC(info);
		else if (nc == Hdr_lot_rmrks) doHdr_lot_rmrks_NC(info);
		else if (nc == Hdr_sub_char1) doHdr_sub_char1_NC(info);
		else if (nc == Hdr_sub_char2) doHdr_sub_char2_NC(info);
		else if (nc == Hdr_sub_char3) doHdr_sub_char3_NC(info);
		else if (nc == Hdr_lims_flg) doHdr_lims_flg_NC(info);
		else if (nc == Hdr_ext_sys_cd) doHdr_ext_sys_cd_NC(info);
		else if (nc == Hdr_ext_sys_nm) doHdr_ext_sys_nm_NC(info);
		else if (nc == Hdr_ext_insp_act_no) doHdr_ext_insp_act_no_NC(info);
		else if (nc == Hdr_insp_aprv_sts_typ) doHdr_insp_aprv_sts_typ_NC(info);
		else if (nc == Hdr_insp_aprv_sts_typ_nm) doHdr_insp_aprv_sts_typ_nm_NC(info);
		else if (nc == Hdr_insp_judg_rslt_typ) doHdr_insp_judg_rslt_typ_NC(info);
		else if (nc == Hdr_insp_judg_rslt_typ_nm) doHdr_insp_judg_rslt_typ_nm_NC(info);
		else if (nc == Hdr_judg_dt) doHdr_judg_dt_NC(info);
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
		else if (nc == Hdr_cont_fctr_flg) doHdr_cont_fctr_flg_NC(info);
		else if (nc == Hdr_insp_ptn_cd) doHdr_insp_ptn_cd_NC(info);
		else if (nc == Hdr_site_cd) doHdr_site_cd_NC(info);
		else if (nc == columnDtl_itm_cd) doDtl_itm_cd_NC(info);
		else if (nc == columnDtl_itm_sub1) doDtl_itm_sub1_NC(info);
		else if (nc == columnDtl_itm_sub2) doDtl_itm_sub2_NC(info);
		else if (nc == columnDtl_itm_sub3) doDtl_itm_sub3_NC(info);
		else if (nc == columnDtl_wg_cd) doDtl_wg_cd_NC(info);
		else if (nc == columnDtl_loc_cd) doDtl_loc_cd_NC(info);
		else if (nc == columnDtl_loc_nm) doDtl_loc_nm_NC(info);
		else if (nc == columnDtl_str_ln_tgt_flg) doDtl_str_ln_tgt_flg_NC(info);
		else if (nc == columnDtl_str_ln_cd) doDtl_str_ln_cd_NC(info);
		else if (nc == columnDtl_str_ln_nm) doDtl_str_ln_nm_NC(info);
		else if (nc == columnDtl_str_ln_cd_none_flg) doDtl_str_ln_cd_none_flg_NC(info);
		else if (nc == columnDtl_stk_arrv_bp_cd) doDtl_stk_arrv_bp_cd_NC(info);
		else if (nc == columnDtl_stk_arrv_bp_nm) doDtl_stk_arrv_bp_nm_NC(info);
		else if (nc == columnDtl_quality_typ) doDtl_quality_typ_NC(info);
		else if (nc == columnDtl_quality_typ_nm) doDtl_quality_typ_nm_NC(info);
		else if (nc == columnDtl_gd_cd) doDtl_gd_cd_NC(info);
		else if (nc == columnDtl_gd_nm) doDtl_gd_nm_NC(info);
		else if (nc == columnDtl_dfct_rsn_cd) doDtl_dfct_rsn_cd_NC(info);
		else if (nc == columnDtl_dfct_rsn_nm) doDtl_dfct_rsn_nm_NC(info);
		else if (nc == columnDtl_base_flg) doDtl_base_flg_NC(info);
		else if (nc == columnDtl_pack_unit_cd) doDtl_pack_unit_cd_NC(info);
		else if (nc == columnDtl_pack_unit_nm) doDtl_pack_unit_nm_NC(info);
		else if (nc == columnDtl_pack_unit_dec_place) doDtl_pack_unit_dec_place_NC(info);
		else if (nc == columnDtl_pack_unit_dmn_qty) doDtl_pack_unit_dmn_qty_NC(info);
		else if (nc == columnDtl_pack_unit_conv_qty) doDtl_pack_unit_conv_qty_NC(info);
		else if (nc == columnDtl_base_unit_cd) doDtl_base_unit_cd_NC(info);
		else if (nc == columnDtl_base_unit_nm) doDtl_base_unit_nm_NC(info);
		else if (nc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NC(info);
		else if (nc == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_stk_pack_unit_cd) doDtl_stk_pack_unit_cd_NC(info);
		else if (nc == columnDtl_stk_pack_unit_nm) doDtl_stk_pack_unit_nm_NC(info);
		else if (nc == columnDtl_stk_pack_unit_dec_place) doDtl_stk_pack_unit_dec_place_NC(info);
		else if (nc == columnDtl_stk_base_unit_cd) doDtl_stk_base_unit_cd_NC(info);
		else if (nc == columnDtl_stk_base_unit_nm) doDtl_stk_base_unit_nm_NC(info);
		else if (nc == columnDtl_stk_base_unit_dec_place) doDtl_stk_base_unit_dec_place_NC(info);
		else if (nc == columnDtl_pack_xfr_pack_unit_cd) doDtl_pack_xfr_pack_unit_cd_NC(info);
		else if (nc == columnDtl_pack_xfr_pack_unit_nm) doDtl_pack_xfr_pack_unit_nm_NC(info);
		else if (nc == columnDtl_pack_xfr_pack_unit_dec_place) doDtl_pack_xfr_pack_unit_dec_place_NC(info);
		else if (nc == columnDtl_pack_xfr_pack_unit_dmn_qty) doDtl_pack_xfr_pack_unit_dmn_qty_NC(info);
		else if (nc == columnDtl_pack_xfr_pack_unit_conv_qty) doDtl_pack_xfr_pack_unit_conv_qty_NC(info);
		else if (nc == columnDtl_pack_xfr_base_unit_cd) doDtl_pack_xfr_base_unit_cd_NC(info);
		else if (nc == columnDtl_pack_xfr_base_unit_nm) doDtl_pack_xfr_base_unit_nm_NC(info);
		else if (nc == columnDtl_pack_xfr_base_unit_dec_place) doDtl_pack_xfr_base_unit_dec_place_NC(info);
		else if (nc == columnDtl_pack_xfr_base_unit_rnd_typ) doDtl_pack_xfr_base_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_stk_insp_typ) doDtl_stk_insp_typ_NC(info);
		else if (nc == columnDtl_stk_insp_typ_nm) doDtl_stk_insp_typ_nm_NC(info);
		else if (nc == columnDtl_stk_id_typ) doDtl_stk_id_typ_NC(info);
		else if (nc == columnDtl_stk_id_typ_nm) doDtl_stk_id_typ_nm_NC(info);
		else if (nc == columnDtl_stk_bp_cd) doDtl_stk_bp_cd_NC(info);
		else if (nc == columnDtl_stk_bp_nm) doDtl_stk_bp_nm_NC(info);
		else if (nc == columnDtl_fix_no_typ) doDtl_fix_no_typ_NC(info);
		else if (nc == columnDtl_fix_no_typ_nm) doDtl_fix_no_typ_nm_NC(info);
		else if (nc == columnDtl_fix_no) doDtl_fix_no_NC(info);
		else if (nc == columnDtl_insp_act_d_no) doDtl_insp_act_d_no_NC(info);
		else if (nc == columnDtl_insp_judg_d_no) doDtl_insp_judg_d_no_NC(info);
		else if (nc == columnDtl_insp_act_no) doDtl_insp_act_no_NC(info);
		else if (nc == columnDtl_insp_no) doDtl_insp_no_NC(info);
		else if (nc == columnDtl_intr_rmrks) doDtl_intr_rmrks_NC(info);
		else if (nc == columnDtl_sub_char1) doDtl_sub_char1_NC(info);
		else if (nc == columnDtl_sub_char2) doDtl_sub_char2_NC(info);
		else if (nc == columnDtl_sub_char3) doDtl_sub_char3_NC(info);
		else if (nc == columnDtl_lims_flg) doDtl_lims_flg_NC(info);
		else if (nc == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_NC(info);
		else if (nc == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_NC(info);
		else if (nc == columnDtl_ext_insp_act_d_no) doDtl_ext_insp_act_d_no_NC(info);
		else if (nc == columnSmpl_base_unit_cd) doSmpl_base_unit_cd_NC(info);
		else if (nc == columnSmpl_base_unit_nm) doSmpl_base_unit_nm_NC(info);
		else if (nc == columnSmpl_base_unit_dec_place) doSmpl_base_unit_dec_place_NC(info);
		else if (nc == columnSmpl_base_unit_rnd_typ) doSmpl_base_unit_rnd_typ_NC(info);
		else if (nc == columnSmpl_pack_xfr_pack_unit_cd) doSmpl_pack_xfr_pack_unit_cd_NC(info);
		else if (nc == columnSmpl_pack_xfr_pack_unit_nm) doSmpl_pack_xfr_pack_unit_nm_NC(info);
		else if (nc == columnSmpl_pack_xfr_pack_unit_dec_place) doSmpl_pack_xfr_pack_unit_dec_place_NC(info);
		else if (nc == columnSmpl_pack_xfr_pack_unit_dmn_qty) doSmpl_pack_xfr_pack_unit_dmn_qty_NC(info);
		else if (nc == columnSmpl_pack_xfr_pack_unit_conv_qty) doSmpl_pack_xfr_pack_unit_conv_qty_NC(info);
		else if (nc == columnSmpl_pack_xfr_base_unit_cd) doSmpl_pack_xfr_base_unit_cd_NC(info);
		else if (nc == columnSmpl_pack_xfr_base_unit_nm) doSmpl_pack_xfr_base_unit_nm_NC(info);
		else if (nc == columnSmpl_pack_xfr_base_unit_dec_place) doSmpl_pack_xfr_base_unit_dec_place_NC(info);
		else if (nc == columnSmpl_pack_xfr_base_unit_rnd_typ) doSmpl_pack_xfr_base_unit_rnd_typ_NC(info);
		else if (nc == columnSmpl_so_cmpl_flg) doSmpl_so_cmpl_flg_NC(info);
		else if (nc == columnSmpl_wg_cd) doSmpl_wg_cd_NC(info);
		else if (nc == columnSmpl_loc_cd) doSmpl_loc_cd_NC(info);
		else if (nc == columnSmpl_loc_nm) doSmpl_loc_nm_NC(info);
		else if (nc == columnSmpl_str_ln_tgt_flg) doSmpl_str_ln_tgt_flg_NC(info);
		else if (nc == columnSmpl_stk_arrv_bp_cd) doSmpl_stk_arrv_bp_cd_NC(info);
		else if (nc == columnSmpl_stk_arrv_bp_nm) doSmpl_stk_arrv_bp_nm_NC(info);
		else if (nc == columnSmpl_gd_cd) doSmpl_gd_cd_NC(info);
		else if (nc == columnSmpl_gd_nm) doSmpl_gd_nm_NC(info);
		else if (nc == columnSmpl_quality_typ) doSmpl_quality_typ_NC(info);
		else if (nc == columnSmpl_quality_typ_nm) doSmpl_quality_typ_nm_NC(info);
		else if (nc == columnSmpl_stk_insp_typ) doSmpl_stk_insp_typ_NC(info);
		else if (nc == columnSmpl_stk_insp_typ_nm) doSmpl_stk_insp_typ_nm_NC(info);
		else if (nc == columnSmpl_stk_id_typ) doSmpl_stk_id_typ_NC(info);
		else if (nc == columnSmpl_stk_id_typ_nm) doSmpl_stk_id_typ_nm_NC(info);
		else if (nc == columnSmpl_stk_bp_cd) doSmpl_stk_bp_cd_NC(info);
		else if (nc == columnSmpl_stk_bp_nm) doSmpl_stk_bp_nm_NC(info);
		else if (nc == columnSmpl_fix_no_typ) doSmpl_fix_no_typ_NC(info);
		else if (nc == columnSmpl_fix_no_typ_nm) doSmpl_fix_no_typ_nm_NC(info);
		else if (nc == columnSmpl_fix_no) doSmpl_fix_no_NC(info);
		else if (nc == columnSmpl_ac_dt) doSmpl_ac_dt_NC(info);
		else if (nc == columnSmpl_bd_dpt_cd) doSmpl_bd_dpt_cd_NC(info);
		else if (nc == columnSmpl_bd_dpt_nm) doSmpl_bd_dpt_nm_NC(info);
		else if (nc == columnSmpl_insp_smpl_act_no) doSmpl_insp_smpl_act_no_NC(info);
		else if (nc == columnSmpl_insp_schd_no) doSmpl_insp_schd_no_NC(info);
		else if (nc == columnSmpl_insp_no) doSmpl_insp_no_NC(info);
		else if (nc == columnSmpl_insp_act_no) doSmpl_insp_act_no_NC(info);
		else if (nc == columnSmpl_trd_rmrks) doSmpl_trd_rmrks_NC(info);
		else if (nc == columnSmpl_intr_rmrks) doSmpl_intr_rmrks_NC(info);
		else if (nc == columnSmpl_sub_char1) doSmpl_sub_char1_NC(info);
		else if (nc == columnSmpl_sub_char2) doSmpl_sub_char2_NC(info);
		else if (nc == columnSmpl_sub_char3) doSmpl_sub_char3_NC(info);
		else if (nc == columnSmpl_itm_cd) doSmpl_itm_cd_NC(info);
		else if (nc == columnSmpl_itm_sub1) doSmpl_itm_sub1_NC(info);
		else if (nc == columnSmpl_itm_sub2) doSmpl_itm_sub2_NC(info);
		else if (nc == columnSmpl_itm_sub3) doSmpl_itm_sub3_NC(info);
		else if (nc == columnSmpl_lims_flg) doSmpl_lims_flg_NC(info);
		else if (nc == columnSmpl_ext_sys_cd) doSmpl_ext_sys_cd_NC(info);
		else if (nc == columnSmpl_ext_sys_nm) doSmpl_ext_sys_nm_NC(info);
		else if (nc == columnSmpl_ext_insp_smpl_act_no) doSmpl_ext_insp_smpl_act_no_NC(info);
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
	 * [Smpl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[ver_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ver_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_freq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_freq_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[pack_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pack_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pack_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pack_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pack_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pack_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[smpl_inst_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_smpl_inst_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[smpl_inst_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_smpl_inst_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[smpl_inst_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_smpl_inst_unit_dec_place_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_rnd_typ_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[bp_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bp_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[std_insp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_std_insp_flg_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[std_cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_std_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[std_cnf_cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_std_cnf_cmpl_flg_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dfct_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dfct_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dfct_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dfct_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[vld_dt_upd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_vld_dt_upd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[vld_pd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_vld_pd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_pd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_pd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_pd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_pd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_pd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_pd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_dt_frm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_dt_frm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_dt_frm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_dt_frm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_ctl_categ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_ctl_categ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_dt_frm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_dt_frm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[vld_dt_now]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_vld_dt_now_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_rmrks_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[lims_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lims_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_insp_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_insp_act_no_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_cd_none_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_none_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dfct_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dfct_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dfct_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dfct_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_dmn_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_dmn_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_pack_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_pack_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_pack_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_pack_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_pack_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_pack_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_pack_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_pack_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_pack_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_pack_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_pack_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_pack_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_pack_unit_dmn_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_pack_unit_dmn_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_pack_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_pack_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_base_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_insp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_insp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_no_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_no_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_judg_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_judg_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[lims_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lims_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_insp_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_insp_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_base_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_pack_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_pack_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_pack_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_pack_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_pack_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_pack_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_pack_unit_dmn_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_pack_unit_dmn_qty_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_pack_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_pack_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_base_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[so_cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_so_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_arrv_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_arrv_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_arrv_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_arrv_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_gd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_insp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_insp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_insp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_insp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[fix_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_fix_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[fix_no_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_fix_no_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[fix_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_fix_no_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[bd_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_bd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[bd_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_bd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[insp_smpl_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_insp_smpl_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[insp_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_insp_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[insp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_insp_no_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[insp_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_insp_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[itm_sub1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_itm_sub1_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[itm_sub2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_itm_sub2_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[itm_sub3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_itm_sub3_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[lims_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_lims_flg_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[ext_insp_smpl_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_ext_insp_smpl_act_no_NC(MCEventInfo info){
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
		else if (ne == SmplTable) doSmpl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_insp_no) doCnd_insp_no_NE(info);
		else if (ne == Hdr_ver_no) doHdr_ver_no_NE(info);
		else if (ne == Hdr_insp_no) doHdr_insp_no_NE(info);
		else if (ne == Hdr_insp_act_no) doHdr_insp_act_no_NE(info);
		else if (ne == Hdr_insp_freq) doHdr_insp_freq_NE(info);
		else if (ne == Hdr_insp_mtd_typ) doHdr_insp_mtd_typ_NE(info);
		else if (ne == Hdr_insp_mtd_typ_nm) doHdr_insp_mtd_typ_nm_NE(info);
		else if (ne == Hdr_insp_typ) doHdr_insp_typ_NE(info);
		else if (ne == Hdr_insp_typ_nm) doHdr_insp_typ_nm_NE(info);
		else if (ne == Hdr_insp_sts_typ) doHdr_insp_sts_typ_NE(info);
		else if (ne == Hdr_insp_sts_typ_nm) doHdr_insp_sts_typ_nm_NE(info);
		else if (ne == Hdr_pack_unit_cd) doHdr_pack_unit_cd_NE(info);
		else if (ne == Hdr_pack_unit_nm) doHdr_pack_unit_nm_NE(info);
		else if (ne == Hdr_pack_unit_dec_place) doHdr_pack_unit_dec_place_NE(info);
		else if (ne == Hdr_smpl_inst_unit_cd) doHdr_smpl_inst_unit_cd_NE(info);
		else if (ne == Hdr_smpl_inst_unit_nm) doHdr_smpl_inst_unit_nm_NE(info);
		else if (ne == Hdr_smpl_inst_unit_dec_place) doHdr_smpl_inst_unit_dec_place_NE(info);
		else if (ne == Hdr_base_unit_cd) doHdr_base_unit_cd_NE(info);
		else if (ne == Hdr_base_unit_nm) doHdr_base_unit_nm_NE(info);
		else if (ne == Hdr_base_unit_dec_place) doHdr_base_unit_dec_place_NE(info);
		else if (ne == Hdr_base_unit_rnd_typ) doHdr_base_unit_rnd_typ_NE(info);
		else if (ne == Hdr_mfg_loc_cd) doHdr_mfg_loc_cd_NE(info);
		else if (ne == Hdr_mfg_loc_nm) doHdr_mfg_loc_nm_NE(info);
		else if (ne == Hdr_sppl_cd) doHdr_sppl_cd_NE(info);
		else if (ne == Hdr_sppl_nm) doHdr_sppl_nm_NE(info);
		else if (ne == Hdr_maker_cd) doHdr_maker_cd_NE(info);
		else if (ne == Hdr_maker_nm) doHdr_maker_nm_NE(info);
		else if (ne == Hdr_bp_lot_no) doHdr_bp_lot_no_NE(info);
		else if (ne == Hdr_std_insp_flg) doHdr_std_insp_flg_NE(info);
		else if (ne == Hdr_std_req_flg) doHdr_std_req_flg_NE(info);
		else if (ne == Hdr_std_cnf_req_flg) doHdr_std_cnf_req_flg_NE(info);
		else if (ne == Hdr_std_cmpl_flg) doHdr_std_cmpl_flg_NE(info);
		else if (ne == Hdr_std_cnf_cmpl_flg) doHdr_std_cnf_cmpl_flg_NE(info);
		else if (ne == Hdr_insp_rslt_prnt_flg) doHdr_insp_rslt_prnt_flg_NE(info);
		else if (ne == Hdr_insp_rslt_prnt_tm) doHdr_insp_rslt_prnt_tm_NE(info);
		else if (ne == Hdr_quality_typ) doHdr_quality_typ_NE(info);
		else if (ne == Hdr_quality_typ_nm) doHdr_quality_typ_nm_NE(info);
		else if (ne == Hdr_gd_cd) doHdr_gd_cd_NE(info);
		else if (ne == Hdr_gd_nm) doHdr_gd_nm_NE(info);
		else if (ne == Hdr_dfct_rsn_cd) doHdr_dfct_rsn_cd_NE(info);
		else if (ne == Hdr_dfct_rsn_nm) doHdr_dfct_rsn_nm_NE(info);
		else if (ne == Hdr_vld_dt_upd_flg) doHdr_vld_dt_upd_flg_NE(info);
		else if (ne == Hdr_vld_pd) doHdr_vld_pd_NE(info);
		else if (ne == Hdr_lmt_pd) doHdr_lmt_pd_NE(info);
		else if (ne == Hdr_calc_pd_typ) doHdr_calc_pd_typ_NE(info);
		else if (ne == Hdr_calc_pd_typ_nm) doHdr_calc_pd_typ_nm_NE(info);
		else if (ne == Hdr_lmt_dt_frm_typ) doHdr_lmt_dt_frm_typ_NE(info);
		else if (ne == Hdr_lmt_dt_frm_typ_nm) doHdr_lmt_dt_frm_typ_nm_NE(info);
		else if (ne == Hdr_lmt_ctl_categ) doHdr_lmt_ctl_categ_NE(info);
		else if (ne == Hdr_lmt_dt_frm) doHdr_lmt_dt_frm_NE(info);
		else if (ne == Hdr_vld_dt_now) doHdr_vld_dt_now_NE(info);
		else if (ne == Hdr_vld_dt) doHdr_vld_dt_NE(info);
		else if (ne == Hdr_lmt_dt) doHdr_lmt_dt_NE(info);
		else if (ne == Hdr_lmt_up_flg) doHdr_lmt_up_flg_NE(info);
		else if (ne == Hdr_in_prmt_insp_flg) doHdr_in_prmt_insp_flg_NE(info);
		else if (ne == Hdr_intr_rmrks) doHdr_intr_rmrks_NE(info);
		else if (ne == Hdr_lot_rmrks) doHdr_lot_rmrks_NE(info);
		else if (ne == Hdr_sub_char1) doHdr_sub_char1_NE(info);
		else if (ne == Hdr_sub_char2) doHdr_sub_char2_NE(info);
		else if (ne == Hdr_sub_char3) doHdr_sub_char3_NE(info);
		else if (ne == Hdr_lims_flg) doHdr_lims_flg_NE(info);
		else if (ne == Hdr_ext_sys_cd) doHdr_ext_sys_cd_NE(info);
		else if (ne == Hdr_ext_sys_nm) doHdr_ext_sys_nm_NE(info);
		else if (ne == Hdr_ext_insp_act_no) doHdr_ext_insp_act_no_NE(info);
		else if (ne == Hdr_insp_aprv_sts_typ) doHdr_insp_aprv_sts_typ_NE(info);
		else if (ne == Hdr_insp_aprv_sts_typ_nm) doHdr_insp_aprv_sts_typ_nm_NE(info);
		else if (ne == Hdr_insp_judg_rslt_typ) doHdr_insp_judg_rslt_typ_NE(info);
		else if (ne == Hdr_insp_judg_rslt_typ_nm) doHdr_insp_judg_rslt_typ_nm_NE(info);
		else if (ne == Hdr_judg_dt) doHdr_judg_dt_NE(info);
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
		else if (ne == Hdr_cont_fctr_flg) doHdr_cont_fctr_flg_NE(info);
		else if (ne == Hdr_insp_ptn_cd) doHdr_insp_ptn_cd_NE(info);
		else if (ne == Hdr_site_cd) doHdr_site_cd_NE(info);
		else if (ne == columnDtl_itm_cd) doDtl_itm_cd_NE(info);
		else if (ne == columnDtl_itm_sub1) doDtl_itm_sub1_NE(info);
		else if (ne == columnDtl_itm_sub2) doDtl_itm_sub2_NE(info);
		else if (ne == columnDtl_itm_sub3) doDtl_itm_sub3_NE(info);
		else if (ne == columnDtl_wg_cd) doDtl_wg_cd_NE(info);
		else if (ne == columnDtl_loc_cd) doDtl_loc_cd_NE(info);
		else if (ne == columnDtl_loc_nm) doDtl_loc_nm_NE(info);
		else if (ne == columnDtl_str_ln_tgt_flg) doDtl_str_ln_tgt_flg_NE(info);
		else if (ne == columnDtl_str_ln_cd) doDtl_str_ln_cd_NE(info);
		else if (ne == columnDtl_str_ln_nm) doDtl_str_ln_nm_NE(info);
		else if (ne == columnDtl_str_ln_cd_none_flg) doDtl_str_ln_cd_none_flg_NE(info);
		else if (ne == columnDtl_stk_arrv_bp_cd) doDtl_stk_arrv_bp_cd_NE(info);
		else if (ne == columnDtl_stk_arrv_bp_nm) doDtl_stk_arrv_bp_nm_NE(info);
		else if (ne == columnDtl_quality_typ) doDtl_quality_typ_NE(info);
		else if (ne == columnDtl_quality_typ_nm) doDtl_quality_typ_nm_NE(info);
		else if (ne == columnDtl_gd_cd) doDtl_gd_cd_NE(info);
		else if (ne == columnDtl_gd_nm) doDtl_gd_nm_NE(info);
		else if (ne == columnDtl_dfct_rsn_cd) doDtl_dfct_rsn_cd_NE(info);
		else if (ne == columnDtl_dfct_rsn_nm) doDtl_dfct_rsn_nm_NE(info);
		else if (ne == columnDtl_base_flg) doDtl_base_flg_NE(info);
		else if (ne == columnDtl_pack_unit_cd) doDtl_pack_unit_cd_NE(info);
		else if (ne == columnDtl_pack_unit_nm) doDtl_pack_unit_nm_NE(info);
		else if (ne == columnDtl_pack_unit_dec_place) doDtl_pack_unit_dec_place_NE(info);
		else if (ne == columnDtl_pack_unit_dmn_qty) doDtl_pack_unit_dmn_qty_NE(info);
		else if (ne == columnDtl_pack_unit_conv_qty) doDtl_pack_unit_conv_qty_NE(info);
		else if (ne == columnDtl_base_unit_cd) doDtl_base_unit_cd_NE(info);
		else if (ne == columnDtl_base_unit_nm) doDtl_base_unit_nm_NE(info);
		else if (ne == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NE(info);
		else if (ne == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_stk_pack_unit_cd) doDtl_stk_pack_unit_cd_NE(info);
		else if (ne == columnDtl_stk_pack_unit_nm) doDtl_stk_pack_unit_nm_NE(info);
		else if (ne == columnDtl_stk_pack_unit_dec_place) doDtl_stk_pack_unit_dec_place_NE(info);
		else if (ne == columnDtl_stk_base_unit_cd) doDtl_stk_base_unit_cd_NE(info);
		else if (ne == columnDtl_stk_base_unit_nm) doDtl_stk_base_unit_nm_NE(info);
		else if (ne == columnDtl_stk_base_unit_dec_place) doDtl_stk_base_unit_dec_place_NE(info);
		else if (ne == columnDtl_pack_xfr_pack_unit_cd) doDtl_pack_xfr_pack_unit_cd_NE(info);
		else if (ne == columnDtl_pack_xfr_pack_unit_nm) doDtl_pack_xfr_pack_unit_nm_NE(info);
		else if (ne == columnDtl_pack_xfr_pack_unit_dec_place) doDtl_pack_xfr_pack_unit_dec_place_NE(info);
		else if (ne == columnDtl_pack_xfr_pack_unit_dmn_qty) doDtl_pack_xfr_pack_unit_dmn_qty_NE(info);
		else if (ne == columnDtl_pack_xfr_pack_unit_conv_qty) doDtl_pack_xfr_pack_unit_conv_qty_NE(info);
		else if (ne == columnDtl_pack_xfr_base_unit_cd) doDtl_pack_xfr_base_unit_cd_NE(info);
		else if (ne == columnDtl_pack_xfr_base_unit_nm) doDtl_pack_xfr_base_unit_nm_NE(info);
		else if (ne == columnDtl_pack_xfr_base_unit_dec_place) doDtl_pack_xfr_base_unit_dec_place_NE(info);
		else if (ne == columnDtl_pack_xfr_base_unit_rnd_typ) doDtl_pack_xfr_base_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_stk_insp_typ) doDtl_stk_insp_typ_NE(info);
		else if (ne == columnDtl_stk_insp_typ_nm) doDtl_stk_insp_typ_nm_NE(info);
		else if (ne == columnDtl_stk_id_typ) doDtl_stk_id_typ_NE(info);
		else if (ne == columnDtl_stk_id_typ_nm) doDtl_stk_id_typ_nm_NE(info);
		else if (ne == columnDtl_stk_bp_cd) doDtl_stk_bp_cd_NE(info);
		else if (ne == columnDtl_stk_bp_nm) doDtl_stk_bp_nm_NE(info);
		else if (ne == columnDtl_fix_no_typ) doDtl_fix_no_typ_NE(info);
		else if (ne == columnDtl_fix_no_typ_nm) doDtl_fix_no_typ_nm_NE(info);
		else if (ne == columnDtl_fix_no) doDtl_fix_no_NE(info);
		else if (ne == columnDtl_insp_act_d_no) doDtl_insp_act_d_no_NE(info);
		else if (ne == columnDtl_insp_judg_d_no) doDtl_insp_judg_d_no_NE(info);
		else if (ne == columnDtl_insp_act_no) doDtl_insp_act_no_NE(info);
		else if (ne == columnDtl_insp_no) doDtl_insp_no_NE(info);
		else if (ne == columnDtl_intr_rmrks) doDtl_intr_rmrks_NE(info);
		else if (ne == columnDtl_sub_char1) doDtl_sub_char1_NE(info);
		else if (ne == columnDtl_sub_char2) doDtl_sub_char2_NE(info);
		else if (ne == columnDtl_sub_char3) doDtl_sub_char3_NE(info);
		else if (ne == columnDtl_lims_flg) doDtl_lims_flg_NE(info);
		else if (ne == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_NE(info);
		else if (ne == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_NE(info);
		else if (ne == columnDtl_ext_insp_act_d_no) doDtl_ext_insp_act_d_no_NE(info);
		else if (ne == columnSmpl_base_unit_cd) doSmpl_base_unit_cd_NE(info);
		else if (ne == columnSmpl_base_unit_nm) doSmpl_base_unit_nm_NE(info);
		else if (ne == columnSmpl_base_unit_dec_place) doSmpl_base_unit_dec_place_NE(info);
		else if (ne == columnSmpl_base_unit_rnd_typ) doSmpl_base_unit_rnd_typ_NE(info);
		else if (ne == columnSmpl_pack_xfr_pack_unit_cd) doSmpl_pack_xfr_pack_unit_cd_NE(info);
		else if (ne == columnSmpl_pack_xfr_pack_unit_nm) doSmpl_pack_xfr_pack_unit_nm_NE(info);
		else if (ne == columnSmpl_pack_xfr_pack_unit_dec_place) doSmpl_pack_xfr_pack_unit_dec_place_NE(info);
		else if (ne == columnSmpl_pack_xfr_pack_unit_dmn_qty) doSmpl_pack_xfr_pack_unit_dmn_qty_NE(info);
		else if (ne == columnSmpl_pack_xfr_pack_unit_conv_qty) doSmpl_pack_xfr_pack_unit_conv_qty_NE(info);
		else if (ne == columnSmpl_pack_xfr_base_unit_cd) doSmpl_pack_xfr_base_unit_cd_NE(info);
		else if (ne == columnSmpl_pack_xfr_base_unit_nm) doSmpl_pack_xfr_base_unit_nm_NE(info);
		else if (ne == columnSmpl_pack_xfr_base_unit_dec_place) doSmpl_pack_xfr_base_unit_dec_place_NE(info);
		else if (ne == columnSmpl_pack_xfr_base_unit_rnd_typ) doSmpl_pack_xfr_base_unit_rnd_typ_NE(info);
		else if (ne == columnSmpl_so_cmpl_flg) doSmpl_so_cmpl_flg_NE(info);
		else if (ne == columnSmpl_wg_cd) doSmpl_wg_cd_NE(info);
		else if (ne == columnSmpl_loc_cd) doSmpl_loc_cd_NE(info);
		else if (ne == columnSmpl_loc_nm) doSmpl_loc_nm_NE(info);
		else if (ne == columnSmpl_str_ln_tgt_flg) doSmpl_str_ln_tgt_flg_NE(info);
		else if (ne == columnSmpl_stk_arrv_bp_cd) doSmpl_stk_arrv_bp_cd_NE(info);
		else if (ne == columnSmpl_stk_arrv_bp_nm) doSmpl_stk_arrv_bp_nm_NE(info);
		else if (ne == columnSmpl_gd_cd) doSmpl_gd_cd_NE(info);
		else if (ne == columnSmpl_gd_nm) doSmpl_gd_nm_NE(info);
		else if (ne == columnSmpl_quality_typ) doSmpl_quality_typ_NE(info);
		else if (ne == columnSmpl_quality_typ_nm) doSmpl_quality_typ_nm_NE(info);
		else if (ne == columnSmpl_stk_insp_typ) doSmpl_stk_insp_typ_NE(info);
		else if (ne == columnSmpl_stk_insp_typ_nm) doSmpl_stk_insp_typ_nm_NE(info);
		else if (ne == columnSmpl_stk_id_typ) doSmpl_stk_id_typ_NE(info);
		else if (ne == columnSmpl_stk_id_typ_nm) doSmpl_stk_id_typ_nm_NE(info);
		else if (ne == columnSmpl_stk_bp_cd) doSmpl_stk_bp_cd_NE(info);
		else if (ne == columnSmpl_stk_bp_nm) doSmpl_stk_bp_nm_NE(info);
		else if (ne == columnSmpl_fix_no_typ) doSmpl_fix_no_typ_NE(info);
		else if (ne == columnSmpl_fix_no_typ_nm) doSmpl_fix_no_typ_nm_NE(info);
		else if (ne == columnSmpl_fix_no) doSmpl_fix_no_NE(info);
		else if (ne == columnSmpl_ac_dt) doSmpl_ac_dt_NE(info);
		else if (ne == columnSmpl_bd_dpt_cd) doSmpl_bd_dpt_cd_NE(info);
		else if (ne == columnSmpl_bd_dpt_nm) doSmpl_bd_dpt_nm_NE(info);
		else if (ne == columnSmpl_insp_smpl_act_no) doSmpl_insp_smpl_act_no_NE(info);
		else if (ne == columnSmpl_insp_schd_no) doSmpl_insp_schd_no_NE(info);
		else if (ne == columnSmpl_insp_no) doSmpl_insp_no_NE(info);
		else if (ne == columnSmpl_insp_act_no) doSmpl_insp_act_no_NE(info);
		else if (ne == columnSmpl_trd_rmrks) doSmpl_trd_rmrks_NE(info);
		else if (ne == columnSmpl_intr_rmrks) doSmpl_intr_rmrks_NE(info);
		else if (ne == columnSmpl_sub_char1) doSmpl_sub_char1_NE(info);
		else if (ne == columnSmpl_sub_char2) doSmpl_sub_char2_NE(info);
		else if (ne == columnSmpl_sub_char3) doSmpl_sub_char3_NE(info);
		else if (ne == columnSmpl_itm_cd) doSmpl_itm_cd_NE(info);
		else if (ne == columnSmpl_itm_sub1) doSmpl_itm_sub1_NE(info);
		else if (ne == columnSmpl_itm_sub2) doSmpl_itm_sub2_NE(info);
		else if (ne == columnSmpl_itm_sub3) doSmpl_itm_sub3_NE(info);
		else if (ne == columnSmpl_lims_flg) doSmpl_lims_flg_NE(info);
		else if (ne == columnSmpl_ext_sys_cd) doSmpl_ext_sys_cd_NE(info);
		else if (ne == columnSmpl_ext_sys_nm) doSmpl_ext_sys_nm_NE(info);
		else if (ne == columnSmpl_ext_insp_smpl_act_no) doSmpl_ext_insp_smpl_act_no_NE(info);
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
	 * [Smpl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[ver_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ver_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_freq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_freq_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[pack_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pack_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pack_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pack_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pack_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pack_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[smpl_inst_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_smpl_inst_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[smpl_inst_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_smpl_inst_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[smpl_inst_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_smpl_inst_unit_dec_place_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_rnd_typ_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[bp_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bp_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[std_insp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_std_insp_flg_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[std_cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_std_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[std_cnf_cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_std_cnf_cmpl_flg_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dfct_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dfct_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dfct_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dfct_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[vld_dt_upd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_vld_dt_upd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[vld_pd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_vld_pd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_pd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_pd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_pd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_pd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_pd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_pd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_dt_frm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_dt_frm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_dt_frm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_dt_frm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_ctl_categ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_ctl_categ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_dt_frm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_dt_frm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[vld_dt_now]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_vld_dt_now_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_rmrks_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[lims_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lims_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_insp_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_insp_act_no_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_cd_none_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_none_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dfct_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dfct_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dfct_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dfct_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_dmn_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_dmn_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_pack_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_pack_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_pack_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_pack_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_pack_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_pack_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_pack_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_pack_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_pack_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_pack_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_pack_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_pack_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_pack_unit_dmn_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_pack_unit_dmn_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_pack_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_pack_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_base_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_insp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_insp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_no_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_no_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_judg_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_judg_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[lims_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lims_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_insp_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_insp_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_base_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_pack_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_pack_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_pack_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_pack_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_pack_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_pack_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_pack_unit_dmn_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_pack_unit_dmn_qty_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_pack_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_pack_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_base_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[so_cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_so_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_arrv_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_arrv_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_arrv_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_arrv_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_gd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_insp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_insp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_insp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_insp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[fix_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_fix_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[fix_no_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_fix_no_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[fix_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_fix_no_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[bd_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_bd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[bd_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_bd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[insp_smpl_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_insp_smpl_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[insp_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_insp_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[insp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_insp_no_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[insp_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_insp_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[itm_sub1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_itm_sub1_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[itm_sub2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_itm_sub2_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[itm_sub3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_itm_sub3_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[lims_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_lims_flg_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[ext_insp_smpl_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_ext_insp_smpl_act_no_NE(MCEventInfo info){
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
		else if (nx == SmplTable) doSmpl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_insp_no) doCnd_insp_no_NX(info);
		else if (nx == Hdr_ver_no) doHdr_ver_no_NX(info);
		else if (nx == Hdr_insp_no) doHdr_insp_no_NX(info);
		else if (nx == Hdr_insp_act_no) doHdr_insp_act_no_NX(info);
		else if (nx == Hdr_insp_freq) doHdr_insp_freq_NX(info);
		else if (nx == Hdr_insp_mtd_typ) doHdr_insp_mtd_typ_NX(info);
		else if (nx == Hdr_insp_mtd_typ_nm) doHdr_insp_mtd_typ_nm_NX(info);
		else if (nx == Hdr_insp_typ) doHdr_insp_typ_NX(info);
		else if (nx == Hdr_insp_typ_nm) doHdr_insp_typ_nm_NX(info);
		else if (nx == Hdr_insp_sts_typ) doHdr_insp_sts_typ_NX(info);
		else if (nx == Hdr_insp_sts_typ_nm) doHdr_insp_sts_typ_nm_NX(info);
		else if (nx == Hdr_pack_unit_cd) doHdr_pack_unit_cd_NX(info);
		else if (nx == Hdr_pack_unit_nm) doHdr_pack_unit_nm_NX(info);
		else if (nx == Hdr_pack_unit_dec_place) doHdr_pack_unit_dec_place_NX(info);
		else if (nx == Hdr_smpl_inst_unit_cd) doHdr_smpl_inst_unit_cd_NX(info);
		else if (nx == Hdr_smpl_inst_unit_nm) doHdr_smpl_inst_unit_nm_NX(info);
		else if (nx == Hdr_smpl_inst_unit_dec_place) doHdr_smpl_inst_unit_dec_place_NX(info);
		else if (nx == Hdr_base_unit_cd) doHdr_base_unit_cd_NX(info);
		else if (nx == Hdr_base_unit_nm) doHdr_base_unit_nm_NX(info);
		else if (nx == Hdr_base_unit_dec_place) doHdr_base_unit_dec_place_NX(info);
		else if (nx == Hdr_base_unit_rnd_typ) doHdr_base_unit_rnd_typ_NX(info);
		else if (nx == Hdr_mfg_loc_cd) doHdr_mfg_loc_cd_NX(info);
		else if (nx == Hdr_mfg_loc_nm) doHdr_mfg_loc_nm_NX(info);
		else if (nx == Hdr_sppl_cd) doHdr_sppl_cd_NX(info);
		else if (nx == Hdr_sppl_nm) doHdr_sppl_nm_NX(info);
		else if (nx == Hdr_maker_cd) doHdr_maker_cd_NX(info);
		else if (nx == Hdr_maker_nm) doHdr_maker_nm_NX(info);
		else if (nx == Hdr_bp_lot_no) doHdr_bp_lot_no_NX(info);
		else if (nx == Hdr_std_insp_flg) doHdr_std_insp_flg_NX(info);
		else if (nx == Hdr_std_req_flg) doHdr_std_req_flg_NX(info);
		else if (nx == Hdr_std_cnf_req_flg) doHdr_std_cnf_req_flg_NX(info);
		else if (nx == Hdr_std_cmpl_flg) doHdr_std_cmpl_flg_NX(info);
		else if (nx == Hdr_std_cnf_cmpl_flg) doHdr_std_cnf_cmpl_flg_NX(info);
		else if (nx == Hdr_insp_rslt_prnt_flg) doHdr_insp_rslt_prnt_flg_NX(info);
		else if (nx == Hdr_insp_rslt_prnt_tm) doHdr_insp_rslt_prnt_tm_NX(info);
		else if (nx == Hdr_quality_typ) doHdr_quality_typ_NX(info);
		else if (nx == Hdr_quality_typ_nm) doHdr_quality_typ_nm_NX(info);
		else if (nx == Hdr_gd_cd) doHdr_gd_cd_NX(info);
		else if (nx == Hdr_gd_nm) doHdr_gd_nm_NX(info);
		else if (nx == Hdr_dfct_rsn_cd) doHdr_dfct_rsn_cd_NX(info);
		else if (nx == Hdr_dfct_rsn_nm) doHdr_dfct_rsn_nm_NX(info);
		else if (nx == Hdr_vld_dt_upd_flg) doHdr_vld_dt_upd_flg_NX(info);
		else if (nx == Hdr_vld_pd) doHdr_vld_pd_NX(info);
		else if (nx == Hdr_lmt_pd) doHdr_lmt_pd_NX(info);
		else if (nx == Hdr_calc_pd_typ) doHdr_calc_pd_typ_NX(info);
		else if (nx == Hdr_calc_pd_typ_nm) doHdr_calc_pd_typ_nm_NX(info);
		else if (nx == Hdr_lmt_dt_frm_typ) doHdr_lmt_dt_frm_typ_NX(info);
		else if (nx == Hdr_lmt_dt_frm_typ_nm) doHdr_lmt_dt_frm_typ_nm_NX(info);
		else if (nx == Hdr_lmt_ctl_categ) doHdr_lmt_ctl_categ_NX(info);
		else if (nx == Hdr_lmt_dt_frm) doHdr_lmt_dt_frm_NX(info);
		else if (nx == Hdr_vld_dt_now) doHdr_vld_dt_now_NX(info);
		else if (nx == Hdr_vld_dt) doHdr_vld_dt_NX(info);
		else if (nx == Hdr_lmt_dt) doHdr_lmt_dt_NX(info);
		else if (nx == Hdr_lmt_up_flg) doHdr_lmt_up_flg_NX(info);
		else if (nx == Hdr_in_prmt_insp_flg) doHdr_in_prmt_insp_flg_NX(info);
		else if (nx == Hdr_intr_rmrks) doHdr_intr_rmrks_NX(info);
		else if (nx == Hdr_lot_rmrks) doHdr_lot_rmrks_NX(info);
		else if (nx == Hdr_sub_char1) doHdr_sub_char1_NX(info);
		else if (nx == Hdr_sub_char2) doHdr_sub_char2_NX(info);
		else if (nx == Hdr_sub_char3) doHdr_sub_char3_NX(info);
		else if (nx == Hdr_lims_flg) doHdr_lims_flg_NX(info);
		else if (nx == Hdr_ext_sys_cd) doHdr_ext_sys_cd_NX(info);
		else if (nx == Hdr_ext_sys_nm) doHdr_ext_sys_nm_NX(info);
		else if (nx == Hdr_ext_insp_act_no) doHdr_ext_insp_act_no_NX(info);
		else if (nx == Hdr_insp_aprv_sts_typ) doHdr_insp_aprv_sts_typ_NX(info);
		else if (nx == Hdr_insp_aprv_sts_typ_nm) doHdr_insp_aprv_sts_typ_nm_NX(info);
		else if (nx == Hdr_insp_judg_rslt_typ) doHdr_insp_judg_rslt_typ_NX(info);
		else if (nx == Hdr_insp_judg_rslt_typ_nm) doHdr_insp_judg_rslt_typ_nm_NX(info);
		else if (nx == Hdr_judg_dt) doHdr_judg_dt_NX(info);
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
		else if (nx == Hdr_cont_fctr_flg) doHdr_cont_fctr_flg_NX(info);
		else if (nx == Hdr_insp_ptn_cd) doHdr_insp_ptn_cd_NX(info);
		else if (nx == Hdr_site_cd) doHdr_site_cd_NX(info);
		else if (nx == columnDtl_itm_cd) doDtl_itm_cd_NX(info);
		else if (nx == columnDtl_itm_sub1) doDtl_itm_sub1_NX(info);
		else if (nx == columnDtl_itm_sub2) doDtl_itm_sub2_NX(info);
		else if (nx == columnDtl_itm_sub3) doDtl_itm_sub3_NX(info);
		else if (nx == columnDtl_wg_cd) doDtl_wg_cd_NX(info);
		else if (nx == columnDtl_loc_cd) doDtl_loc_cd_NX(info);
		else if (nx == columnDtl_loc_nm) doDtl_loc_nm_NX(info);
		else if (nx == columnDtl_str_ln_tgt_flg) doDtl_str_ln_tgt_flg_NX(info);
		else if (nx == columnDtl_str_ln_cd) doDtl_str_ln_cd_NX(info);
		else if (nx == columnDtl_str_ln_nm) doDtl_str_ln_nm_NX(info);
		else if (nx == columnDtl_str_ln_cd_none_flg) doDtl_str_ln_cd_none_flg_NX(info);
		else if (nx == columnDtl_stk_arrv_bp_cd) doDtl_stk_arrv_bp_cd_NX(info);
		else if (nx == columnDtl_stk_arrv_bp_nm) doDtl_stk_arrv_bp_nm_NX(info);
		else if (nx == columnDtl_quality_typ) doDtl_quality_typ_NX(info);
		else if (nx == columnDtl_quality_typ_nm) doDtl_quality_typ_nm_NX(info);
		else if (nx == columnDtl_gd_cd) doDtl_gd_cd_NX(info);
		else if (nx == columnDtl_gd_nm) doDtl_gd_nm_NX(info);
		else if (nx == columnDtl_dfct_rsn_cd) doDtl_dfct_rsn_cd_NX(info);
		else if (nx == columnDtl_dfct_rsn_nm) doDtl_dfct_rsn_nm_NX(info);
		else if (nx == columnDtl_base_flg) doDtl_base_flg_NX(info);
		else if (nx == columnDtl_pack_unit_cd) doDtl_pack_unit_cd_NX(info);
		else if (nx == columnDtl_pack_unit_nm) doDtl_pack_unit_nm_NX(info);
		else if (nx == columnDtl_pack_unit_dec_place) doDtl_pack_unit_dec_place_NX(info);
		else if (nx == columnDtl_pack_unit_dmn_qty) doDtl_pack_unit_dmn_qty_NX(info);
		else if (nx == columnDtl_pack_unit_conv_qty) doDtl_pack_unit_conv_qty_NX(info);
		else if (nx == columnDtl_base_unit_cd) doDtl_base_unit_cd_NX(info);
		else if (nx == columnDtl_base_unit_nm) doDtl_base_unit_nm_NX(info);
		else if (nx == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NX(info);
		else if (nx == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_stk_pack_unit_cd) doDtl_stk_pack_unit_cd_NX(info);
		else if (nx == columnDtl_stk_pack_unit_nm) doDtl_stk_pack_unit_nm_NX(info);
		else if (nx == columnDtl_stk_pack_unit_dec_place) doDtl_stk_pack_unit_dec_place_NX(info);
		else if (nx == columnDtl_stk_base_unit_cd) doDtl_stk_base_unit_cd_NX(info);
		else if (nx == columnDtl_stk_base_unit_nm) doDtl_stk_base_unit_nm_NX(info);
		else if (nx == columnDtl_stk_base_unit_dec_place) doDtl_stk_base_unit_dec_place_NX(info);
		else if (nx == columnDtl_pack_xfr_pack_unit_cd) doDtl_pack_xfr_pack_unit_cd_NX(info);
		else if (nx == columnDtl_pack_xfr_pack_unit_nm) doDtl_pack_xfr_pack_unit_nm_NX(info);
		else if (nx == columnDtl_pack_xfr_pack_unit_dec_place) doDtl_pack_xfr_pack_unit_dec_place_NX(info);
		else if (nx == columnDtl_pack_xfr_pack_unit_dmn_qty) doDtl_pack_xfr_pack_unit_dmn_qty_NX(info);
		else if (nx == columnDtl_pack_xfr_pack_unit_conv_qty) doDtl_pack_xfr_pack_unit_conv_qty_NX(info);
		else if (nx == columnDtl_pack_xfr_base_unit_cd) doDtl_pack_xfr_base_unit_cd_NX(info);
		else if (nx == columnDtl_pack_xfr_base_unit_nm) doDtl_pack_xfr_base_unit_nm_NX(info);
		else if (nx == columnDtl_pack_xfr_base_unit_dec_place) doDtl_pack_xfr_base_unit_dec_place_NX(info);
		else if (nx == columnDtl_pack_xfr_base_unit_rnd_typ) doDtl_pack_xfr_base_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_stk_insp_typ) doDtl_stk_insp_typ_NX(info);
		else if (nx == columnDtl_stk_insp_typ_nm) doDtl_stk_insp_typ_nm_NX(info);
		else if (nx == columnDtl_stk_id_typ) doDtl_stk_id_typ_NX(info);
		else if (nx == columnDtl_stk_id_typ_nm) doDtl_stk_id_typ_nm_NX(info);
		else if (nx == columnDtl_stk_bp_cd) doDtl_stk_bp_cd_NX(info);
		else if (nx == columnDtl_stk_bp_nm) doDtl_stk_bp_nm_NX(info);
		else if (nx == columnDtl_fix_no_typ) doDtl_fix_no_typ_NX(info);
		else if (nx == columnDtl_fix_no_typ_nm) doDtl_fix_no_typ_nm_NX(info);
		else if (nx == columnDtl_fix_no) doDtl_fix_no_NX(info);
		else if (nx == columnDtl_insp_act_d_no) doDtl_insp_act_d_no_NX(info);
		else if (nx == columnDtl_insp_judg_d_no) doDtl_insp_judg_d_no_NX(info);
		else if (nx == columnDtl_insp_act_no) doDtl_insp_act_no_NX(info);
		else if (nx == columnDtl_insp_no) doDtl_insp_no_NX(info);
		else if (nx == columnDtl_intr_rmrks) doDtl_intr_rmrks_NX(info);
		else if (nx == columnDtl_sub_char1) doDtl_sub_char1_NX(info);
		else if (nx == columnDtl_sub_char2) doDtl_sub_char2_NX(info);
		else if (nx == columnDtl_sub_char3) doDtl_sub_char3_NX(info);
		else if (nx == columnDtl_lims_flg) doDtl_lims_flg_NX(info);
		else if (nx == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_NX(info);
		else if (nx == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_NX(info);
		else if (nx == columnDtl_ext_insp_act_d_no) doDtl_ext_insp_act_d_no_NX(info);
		else if (nx == columnSmpl_base_unit_cd) doSmpl_base_unit_cd_NX(info);
		else if (nx == columnSmpl_base_unit_nm) doSmpl_base_unit_nm_NX(info);
		else if (nx == columnSmpl_base_unit_dec_place) doSmpl_base_unit_dec_place_NX(info);
		else if (nx == columnSmpl_base_unit_rnd_typ) doSmpl_base_unit_rnd_typ_NX(info);
		else if (nx == columnSmpl_pack_xfr_pack_unit_cd) doSmpl_pack_xfr_pack_unit_cd_NX(info);
		else if (nx == columnSmpl_pack_xfr_pack_unit_nm) doSmpl_pack_xfr_pack_unit_nm_NX(info);
		else if (nx == columnSmpl_pack_xfr_pack_unit_dec_place) doSmpl_pack_xfr_pack_unit_dec_place_NX(info);
		else if (nx == columnSmpl_pack_xfr_pack_unit_dmn_qty) doSmpl_pack_xfr_pack_unit_dmn_qty_NX(info);
		else if (nx == columnSmpl_pack_xfr_pack_unit_conv_qty) doSmpl_pack_xfr_pack_unit_conv_qty_NX(info);
		else if (nx == columnSmpl_pack_xfr_base_unit_cd) doSmpl_pack_xfr_base_unit_cd_NX(info);
		else if (nx == columnSmpl_pack_xfr_base_unit_nm) doSmpl_pack_xfr_base_unit_nm_NX(info);
		else if (nx == columnSmpl_pack_xfr_base_unit_dec_place) doSmpl_pack_xfr_base_unit_dec_place_NX(info);
		else if (nx == columnSmpl_pack_xfr_base_unit_rnd_typ) doSmpl_pack_xfr_base_unit_rnd_typ_NX(info);
		else if (nx == columnSmpl_so_cmpl_flg) doSmpl_so_cmpl_flg_NX(info);
		else if (nx == columnSmpl_wg_cd) doSmpl_wg_cd_NX(info);
		else if (nx == columnSmpl_loc_cd) doSmpl_loc_cd_NX(info);
		else if (nx == columnSmpl_loc_nm) doSmpl_loc_nm_NX(info);
		else if (nx == columnSmpl_str_ln_tgt_flg) doSmpl_str_ln_tgt_flg_NX(info);
		else if (nx == columnSmpl_stk_arrv_bp_cd) doSmpl_stk_arrv_bp_cd_NX(info);
		else if (nx == columnSmpl_stk_arrv_bp_nm) doSmpl_stk_arrv_bp_nm_NX(info);
		else if (nx == columnSmpl_gd_cd) doSmpl_gd_cd_NX(info);
		else if (nx == columnSmpl_gd_nm) doSmpl_gd_nm_NX(info);
		else if (nx == columnSmpl_quality_typ) doSmpl_quality_typ_NX(info);
		else if (nx == columnSmpl_quality_typ_nm) doSmpl_quality_typ_nm_NX(info);
		else if (nx == columnSmpl_stk_insp_typ) doSmpl_stk_insp_typ_NX(info);
		else if (nx == columnSmpl_stk_insp_typ_nm) doSmpl_stk_insp_typ_nm_NX(info);
		else if (nx == columnSmpl_stk_id_typ) doSmpl_stk_id_typ_NX(info);
		else if (nx == columnSmpl_stk_id_typ_nm) doSmpl_stk_id_typ_nm_NX(info);
		else if (nx == columnSmpl_stk_bp_cd) doSmpl_stk_bp_cd_NX(info);
		else if (nx == columnSmpl_stk_bp_nm) doSmpl_stk_bp_nm_NX(info);
		else if (nx == columnSmpl_fix_no_typ) doSmpl_fix_no_typ_NX(info);
		else if (nx == columnSmpl_fix_no_typ_nm) doSmpl_fix_no_typ_nm_NX(info);
		else if (nx == columnSmpl_fix_no) doSmpl_fix_no_NX(info);
		else if (nx == columnSmpl_ac_dt) doSmpl_ac_dt_NX(info);
		else if (nx == columnSmpl_bd_dpt_cd) doSmpl_bd_dpt_cd_NX(info);
		else if (nx == columnSmpl_bd_dpt_nm) doSmpl_bd_dpt_nm_NX(info);
		else if (nx == columnSmpl_insp_smpl_act_no) doSmpl_insp_smpl_act_no_NX(info);
		else if (nx == columnSmpl_insp_schd_no) doSmpl_insp_schd_no_NX(info);
		else if (nx == columnSmpl_insp_no) doSmpl_insp_no_NX(info);
		else if (nx == columnSmpl_insp_act_no) doSmpl_insp_act_no_NX(info);
		else if (nx == columnSmpl_trd_rmrks) doSmpl_trd_rmrks_NX(info);
		else if (nx == columnSmpl_intr_rmrks) doSmpl_intr_rmrks_NX(info);
		else if (nx == columnSmpl_sub_char1) doSmpl_sub_char1_NX(info);
		else if (nx == columnSmpl_sub_char2) doSmpl_sub_char2_NX(info);
		else if (nx == columnSmpl_sub_char3) doSmpl_sub_char3_NX(info);
		else if (nx == columnSmpl_itm_cd) doSmpl_itm_cd_NX(info);
		else if (nx == columnSmpl_itm_sub1) doSmpl_itm_sub1_NX(info);
		else if (nx == columnSmpl_itm_sub2) doSmpl_itm_sub2_NX(info);
		else if (nx == columnSmpl_itm_sub3) doSmpl_itm_sub3_NX(info);
		else if (nx == columnSmpl_lims_flg) doSmpl_lims_flg_NX(info);
		else if (nx == columnSmpl_ext_sys_cd) doSmpl_ext_sys_cd_NX(info);
		else if (nx == columnSmpl_ext_sys_nm) doSmpl_ext_sys_nm_NX(info);
		else if (nx == columnSmpl_ext_insp_smpl_act_no) doSmpl_ext_insp_smpl_act_no_NX(info);
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
	 * [Smpl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[ver_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ver_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_freq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_freq_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[pack_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pack_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pack_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pack_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pack_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pack_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[smpl_inst_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_smpl_inst_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[smpl_inst_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_smpl_inst_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[smpl_inst_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_smpl_inst_unit_dec_place_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_rnd_typ_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[bp_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bp_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[std_insp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_std_insp_flg_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[std_cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_std_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[std_cnf_cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_std_cnf_cmpl_flg_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dfct_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dfct_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dfct_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dfct_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[vld_dt_upd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_vld_dt_upd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[vld_pd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_vld_pd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_pd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_pd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_pd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_pd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_pd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_pd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_dt_frm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_dt_frm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_dt_frm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_dt_frm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_ctl_categ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_ctl_categ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_dt_frm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_dt_frm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[vld_dt_now]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_vld_dt_now_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_rmrks_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[lims_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lims_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_insp_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_insp_act_no_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_cd_none_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_none_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dfct_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dfct_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dfct_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dfct_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_dmn_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_dmn_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_pack_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_pack_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_pack_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_pack_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_pack_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_pack_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_pack_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_pack_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_pack_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_pack_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_pack_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_pack_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_pack_unit_dmn_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_pack_unit_dmn_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_pack_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_pack_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_base_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_insp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_insp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_no_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_no_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_judg_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_judg_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[lims_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lims_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_insp_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_insp_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_base_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_pack_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_pack_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_pack_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_pack_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_pack_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_pack_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_pack_unit_dmn_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_pack_unit_dmn_qty_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_pack_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_pack_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_base_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[so_cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_so_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_arrv_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_arrv_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_arrv_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_arrv_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_gd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_insp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_insp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_insp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_insp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[fix_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_fix_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[fix_no_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_fix_no_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[fix_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_fix_no_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[bd_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_bd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[bd_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_bd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[insp_smpl_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_insp_smpl_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[insp_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_insp_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[insp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_insp_no_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[insp_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_insp_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[itm_sub1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_itm_sub1_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[itm_sub2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_itm_sub2_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[itm_sub3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_itm_sub3_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[lims_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_lims_flg_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[ext_insp_smpl_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_ext_insp_smpl_act_no_NX(MCEventInfo info){
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
		else if (lc == Hdr_ver_no) doHdr_ver_no_LC(info);
		else if (lc == Hdr_insp_no) doHdr_insp_no_LC(info);
		else if (lc == Hdr_insp_act_no) doHdr_insp_act_no_LC(info);
		else if (lc == Hdr_insp_freq) doHdr_insp_freq_LC(info);
		else if (lc == Hdr_insp_mtd_typ) doHdr_insp_mtd_typ_LC(info);
		else if (lc == Hdr_insp_mtd_typ_nm) doHdr_insp_mtd_typ_nm_LC(info);
		else if (lc == Hdr_insp_typ) doHdr_insp_typ_LC(info);
		else if (lc == Hdr_insp_typ_nm) doHdr_insp_typ_nm_LC(info);
		else if (lc == Hdr_insp_sts_typ) doHdr_insp_sts_typ_LC(info);
		else if (lc == Hdr_insp_sts_typ_nm) doHdr_insp_sts_typ_nm_LC(info);
		else if (lc == Hdr_pack_unit_cd) doHdr_pack_unit_cd_LC(info);
		else if (lc == Hdr_pack_unit_nm) doHdr_pack_unit_nm_LC(info);
		else if (lc == Hdr_pack_unit_dec_place) doHdr_pack_unit_dec_place_LC(info);
		else if (lc == Hdr_smpl_inst_unit_cd) doHdr_smpl_inst_unit_cd_LC(info);
		else if (lc == Hdr_smpl_inst_unit_nm) doHdr_smpl_inst_unit_nm_LC(info);
		else if (lc == Hdr_smpl_inst_unit_dec_place) doHdr_smpl_inst_unit_dec_place_LC(info);
		else if (lc == Hdr_base_unit_cd) doHdr_base_unit_cd_LC(info);
		else if (lc == Hdr_base_unit_nm) doHdr_base_unit_nm_LC(info);
		else if (lc == Hdr_base_unit_dec_place) doHdr_base_unit_dec_place_LC(info);
		else if (lc == Hdr_base_unit_rnd_typ) doHdr_base_unit_rnd_typ_LC(info);
		else if (lc == Hdr_mfg_loc_cd) doHdr_mfg_loc_cd_LC(info);
		else if (lc == Hdr_mfg_loc_nm) doHdr_mfg_loc_nm_LC(info);
		else if (lc == Hdr_sppl_cd) doHdr_sppl_cd_LC(info);
		else if (lc == Hdr_sppl_nm) doHdr_sppl_nm_LC(info);
		else if (lc == Hdr_maker_cd) doHdr_maker_cd_LC(info);
		else if (lc == Hdr_maker_nm) doHdr_maker_nm_LC(info);
		else if (lc == Hdr_bp_lot_no) doHdr_bp_lot_no_LC(info);
		else if (lc == Hdr_insp_rslt_prnt_tm) doHdr_insp_rslt_prnt_tm_LC(info);
		else if (lc == Hdr_quality_typ) doHdr_quality_typ_LC(info);
		else if (lc == Hdr_quality_typ_nm) doHdr_quality_typ_nm_LC(info);
		else if (lc == Hdr_gd_cd) doHdr_gd_cd_LC(info);
		else if (lc == Hdr_gd_nm) doHdr_gd_nm_LC(info);
		else if (lc == Hdr_dfct_rsn_cd) doHdr_dfct_rsn_cd_LC(info);
		else if (lc == Hdr_dfct_rsn_nm) doHdr_dfct_rsn_nm_LC(info);
		else if (lc == Hdr_vld_pd) doHdr_vld_pd_LC(info);
		else if (lc == Hdr_lmt_pd) doHdr_lmt_pd_LC(info);
		else if (lc == Hdr_calc_pd_typ) doHdr_calc_pd_typ_LC(info);
		else if (lc == Hdr_calc_pd_typ_nm) doHdr_calc_pd_typ_nm_LC(info);
		else if (lc == Hdr_lmt_dt_frm_typ) doHdr_lmt_dt_frm_typ_LC(info);
		else if (lc == Hdr_lmt_dt_frm_typ_nm) doHdr_lmt_dt_frm_typ_nm_LC(info);
		else if (lc == Hdr_lmt_ctl_categ) doHdr_lmt_ctl_categ_LC(info);
		else if (lc == Hdr_lmt_dt_frm) doHdr_lmt_dt_frm_LC(info);
		else if (lc == Hdr_vld_dt_now) doHdr_vld_dt_now_LC(info);
		else if (lc == Hdr_vld_dt) doHdr_vld_dt_LC(info);
		else if (lc == Hdr_lmt_dt) doHdr_lmt_dt_LC(info);
		else if (lc == Hdr_intr_rmrks) doHdr_intr_rmrks_LC(info);
		else if (lc == Hdr_lot_rmrks) doHdr_lot_rmrks_LC(info);
		else if (lc == Hdr_sub_char1) doHdr_sub_char1_LC(info);
		else if (lc == Hdr_sub_char2) doHdr_sub_char2_LC(info);
		else if (lc == Hdr_sub_char3) doHdr_sub_char3_LC(info);
		else if (lc == Hdr_ext_sys_cd) doHdr_ext_sys_cd_LC(info);
		else if (lc == Hdr_ext_sys_nm) doHdr_ext_sys_nm_LC(info);
		else if (lc == Hdr_ext_insp_act_no) doHdr_ext_insp_act_no_LC(info);
		else if (lc == Hdr_insp_aprv_sts_typ) doHdr_insp_aprv_sts_typ_LC(info);
		else if (lc == Hdr_insp_aprv_sts_typ_nm) doHdr_insp_aprv_sts_typ_nm_LC(info);
		else if (lc == Hdr_insp_judg_rslt_typ) doHdr_insp_judg_rslt_typ_LC(info);
		else if (lc == Hdr_insp_judg_rslt_typ_nm) doHdr_insp_judg_rslt_typ_nm_LC(info);
		else if (lc == Hdr_judg_dt) doHdr_judg_dt_LC(info);
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
		else if (lc == Hdr_insp_ptn_cd) doHdr_insp_ptn_cd_LC(info);
		else if (lc == Hdr_site_cd) doHdr_site_cd_LC(info);
		else if (lc == columnDtl_itm_cd) doDtl_itm_cd_LC(info);
		else if (lc == columnDtl_itm_sub1) doDtl_itm_sub1_LC(info);
		else if (lc == columnDtl_itm_sub2) doDtl_itm_sub2_LC(info);
		else if (lc == columnDtl_itm_sub3) doDtl_itm_sub3_LC(info);
		else if (lc == columnDtl_wg_cd) doDtl_wg_cd_LC(info);
		else if (lc == columnDtl_loc_cd) doDtl_loc_cd_LC(info);
		else if (lc == columnDtl_loc_nm) doDtl_loc_nm_LC(info);
		else if (lc == columnDtl_str_ln_cd) doDtl_str_ln_cd_LC(info);
		else if (lc == columnDtl_str_ln_nm) doDtl_str_ln_nm_LC(info);
		else if (lc == columnDtl_stk_arrv_bp_cd) doDtl_stk_arrv_bp_cd_LC(info);
		else if (lc == columnDtl_stk_arrv_bp_nm) doDtl_stk_arrv_bp_nm_LC(info);
		else if (lc == columnDtl_quality_typ) doDtl_quality_typ_LC(info);
		else if (lc == columnDtl_quality_typ_nm) doDtl_quality_typ_nm_LC(info);
		else if (lc == columnDtl_gd_cd) doDtl_gd_cd_LC(info);
		else if (lc == columnDtl_gd_nm) doDtl_gd_nm_LC(info);
		else if (lc == columnDtl_dfct_rsn_cd) doDtl_dfct_rsn_cd_LC(info);
		else if (lc == columnDtl_dfct_rsn_nm) doDtl_dfct_rsn_nm_LC(info);
		else if (lc == columnDtl_pack_unit_cd) doDtl_pack_unit_cd_LC(info);
		else if (lc == columnDtl_pack_unit_nm) doDtl_pack_unit_nm_LC(info);
		else if (lc == columnDtl_pack_unit_dec_place) doDtl_pack_unit_dec_place_LC(info);
		else if (lc == columnDtl_pack_unit_dmn_qty) doDtl_pack_unit_dmn_qty_LC(info);
		else if (lc == columnDtl_pack_unit_conv_qty) doDtl_pack_unit_conv_qty_LC(info);
		else if (lc == columnDtl_base_unit_cd) doDtl_base_unit_cd_LC(info);
		else if (lc == columnDtl_base_unit_nm) doDtl_base_unit_nm_LC(info);
		else if (lc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_LC(info);
		else if (lc == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_LC(info);
		else if (lc == columnDtl_stk_pack_unit_cd) doDtl_stk_pack_unit_cd_LC(info);
		else if (lc == columnDtl_stk_pack_unit_nm) doDtl_stk_pack_unit_nm_LC(info);
		else if (lc == columnDtl_stk_pack_unit_dec_place) doDtl_stk_pack_unit_dec_place_LC(info);
		else if (lc == columnDtl_stk_base_unit_cd) doDtl_stk_base_unit_cd_LC(info);
		else if (lc == columnDtl_stk_base_unit_nm) doDtl_stk_base_unit_nm_LC(info);
		else if (lc == columnDtl_stk_base_unit_dec_place) doDtl_stk_base_unit_dec_place_LC(info);
		else if (lc == columnDtl_pack_xfr_pack_unit_cd) doDtl_pack_xfr_pack_unit_cd_LC(info);
		else if (lc == columnDtl_pack_xfr_pack_unit_nm) doDtl_pack_xfr_pack_unit_nm_LC(info);
		else if (lc == columnDtl_pack_xfr_pack_unit_dec_place) doDtl_pack_xfr_pack_unit_dec_place_LC(info);
		else if (lc == columnDtl_pack_xfr_pack_unit_dmn_qty) doDtl_pack_xfr_pack_unit_dmn_qty_LC(info);
		else if (lc == columnDtl_pack_xfr_pack_unit_conv_qty) doDtl_pack_xfr_pack_unit_conv_qty_LC(info);
		else if (lc == columnDtl_pack_xfr_base_unit_cd) doDtl_pack_xfr_base_unit_cd_LC(info);
		else if (lc == columnDtl_pack_xfr_base_unit_nm) doDtl_pack_xfr_base_unit_nm_LC(info);
		else if (lc == columnDtl_pack_xfr_base_unit_dec_place) doDtl_pack_xfr_base_unit_dec_place_LC(info);
		else if (lc == columnDtl_pack_xfr_base_unit_rnd_typ) doDtl_pack_xfr_base_unit_rnd_typ_LC(info);
		else if (lc == columnDtl_stk_insp_typ) doDtl_stk_insp_typ_LC(info);
		else if (lc == columnDtl_stk_insp_typ_nm) doDtl_stk_insp_typ_nm_LC(info);
		else if (lc == columnDtl_stk_id_typ) doDtl_stk_id_typ_LC(info);
		else if (lc == columnDtl_stk_id_typ_nm) doDtl_stk_id_typ_nm_LC(info);
		else if (lc == columnDtl_stk_bp_cd) doDtl_stk_bp_cd_LC(info);
		else if (lc == columnDtl_stk_bp_nm) doDtl_stk_bp_nm_LC(info);
		else if (lc == columnDtl_fix_no_typ) doDtl_fix_no_typ_LC(info);
		else if (lc == columnDtl_fix_no_typ_nm) doDtl_fix_no_typ_nm_LC(info);
		else if (lc == columnDtl_fix_no) doDtl_fix_no_LC(info);
		else if (lc == columnDtl_insp_act_d_no) doDtl_insp_act_d_no_LC(info);
		else if (lc == columnDtl_insp_judg_d_no) doDtl_insp_judg_d_no_LC(info);
		else if (lc == columnDtl_insp_act_no) doDtl_insp_act_no_LC(info);
		else if (lc == columnDtl_insp_no) doDtl_insp_no_LC(info);
		else if (lc == columnDtl_intr_rmrks) doDtl_intr_rmrks_LC(info);
		else if (lc == columnDtl_sub_char1) doDtl_sub_char1_LC(info);
		else if (lc == columnDtl_sub_char2) doDtl_sub_char2_LC(info);
		else if (lc == columnDtl_sub_char3) doDtl_sub_char3_LC(info);
		else if (lc == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_LC(info);
		else if (lc == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_LC(info);
		else if (lc == columnDtl_ext_insp_act_d_no) doDtl_ext_insp_act_d_no_LC(info);
		else if (lc == columnSmpl_base_unit_cd) doSmpl_base_unit_cd_LC(info);
		else if (lc == columnSmpl_base_unit_nm) doSmpl_base_unit_nm_LC(info);
		else if (lc == columnSmpl_base_unit_dec_place) doSmpl_base_unit_dec_place_LC(info);
		else if (lc == columnSmpl_base_unit_rnd_typ) doSmpl_base_unit_rnd_typ_LC(info);
		else if (lc == columnSmpl_pack_xfr_pack_unit_cd) doSmpl_pack_xfr_pack_unit_cd_LC(info);
		else if (lc == columnSmpl_pack_xfr_pack_unit_nm) doSmpl_pack_xfr_pack_unit_nm_LC(info);
		else if (lc == columnSmpl_pack_xfr_pack_unit_dec_place) doSmpl_pack_xfr_pack_unit_dec_place_LC(info);
		else if (lc == columnSmpl_pack_xfr_pack_unit_dmn_qty) doSmpl_pack_xfr_pack_unit_dmn_qty_LC(info);
		else if (lc == columnSmpl_pack_xfr_pack_unit_conv_qty) doSmpl_pack_xfr_pack_unit_conv_qty_LC(info);
		else if (lc == columnSmpl_pack_xfr_base_unit_cd) doSmpl_pack_xfr_base_unit_cd_LC(info);
		else if (lc == columnSmpl_pack_xfr_base_unit_nm) doSmpl_pack_xfr_base_unit_nm_LC(info);
		else if (lc == columnSmpl_pack_xfr_base_unit_dec_place) doSmpl_pack_xfr_base_unit_dec_place_LC(info);
		else if (lc == columnSmpl_pack_xfr_base_unit_rnd_typ) doSmpl_pack_xfr_base_unit_rnd_typ_LC(info);
		else if (lc == columnSmpl_wg_cd) doSmpl_wg_cd_LC(info);
		else if (lc == columnSmpl_loc_cd) doSmpl_loc_cd_LC(info);
		else if (lc == columnSmpl_loc_nm) doSmpl_loc_nm_LC(info);
		else if (lc == columnSmpl_stk_arrv_bp_cd) doSmpl_stk_arrv_bp_cd_LC(info);
		else if (lc == columnSmpl_stk_arrv_bp_nm) doSmpl_stk_arrv_bp_nm_LC(info);
		else if (lc == columnSmpl_gd_cd) doSmpl_gd_cd_LC(info);
		else if (lc == columnSmpl_gd_nm) doSmpl_gd_nm_LC(info);
		else if (lc == columnSmpl_quality_typ) doSmpl_quality_typ_LC(info);
		else if (lc == columnSmpl_quality_typ_nm) doSmpl_quality_typ_nm_LC(info);
		else if (lc == columnSmpl_stk_insp_typ) doSmpl_stk_insp_typ_LC(info);
		else if (lc == columnSmpl_stk_insp_typ_nm) doSmpl_stk_insp_typ_nm_LC(info);
		else if (lc == columnSmpl_stk_id_typ) doSmpl_stk_id_typ_LC(info);
		else if (lc == columnSmpl_stk_id_typ_nm) doSmpl_stk_id_typ_nm_LC(info);
		else if (lc == columnSmpl_stk_bp_cd) doSmpl_stk_bp_cd_LC(info);
		else if (lc == columnSmpl_stk_bp_nm) doSmpl_stk_bp_nm_LC(info);
		else if (lc == columnSmpl_fix_no_typ) doSmpl_fix_no_typ_LC(info);
		else if (lc == columnSmpl_fix_no_typ_nm) doSmpl_fix_no_typ_nm_LC(info);
		else if (lc == columnSmpl_fix_no) doSmpl_fix_no_LC(info);
		else if (lc == columnSmpl_ac_dt) doSmpl_ac_dt_LC(info);
		else if (lc == columnSmpl_bd_dpt_cd) doSmpl_bd_dpt_cd_LC(info);
		else if (lc == columnSmpl_bd_dpt_nm) doSmpl_bd_dpt_nm_LC(info);
		else if (lc == columnSmpl_insp_smpl_act_no) doSmpl_insp_smpl_act_no_LC(info);
		else if (lc == columnSmpl_insp_schd_no) doSmpl_insp_schd_no_LC(info);
		else if (lc == columnSmpl_insp_no) doSmpl_insp_no_LC(info);
		else if (lc == columnSmpl_insp_act_no) doSmpl_insp_act_no_LC(info);
		else if (lc == columnSmpl_trd_rmrks) doSmpl_trd_rmrks_LC(info);
		else if (lc == columnSmpl_intr_rmrks) doSmpl_intr_rmrks_LC(info);
		else if (lc == columnSmpl_sub_char1) doSmpl_sub_char1_LC(info);
		else if (lc == columnSmpl_sub_char2) doSmpl_sub_char2_LC(info);
		else if (lc == columnSmpl_sub_char3) doSmpl_sub_char3_LC(info);
		else if (lc == columnSmpl_itm_cd) doSmpl_itm_cd_LC(info);
		else if (lc == columnSmpl_itm_sub1) doSmpl_itm_sub1_LC(info);
		else if (lc == columnSmpl_itm_sub2) doSmpl_itm_sub2_LC(info);
		else if (lc == columnSmpl_itm_sub3) doSmpl_itm_sub3_LC(info);
		else if (lc == columnSmpl_ext_sys_cd) doSmpl_ext_sys_cd_LC(info);
		else if (lc == columnSmpl_ext_sys_nm) doSmpl_ext_sys_nm_LC(info);
		else if (lc == columnSmpl_ext_insp_smpl_act_no) doSmpl_ext_insp_smpl_act_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[insp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ver_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ver_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_freq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_freq_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[pack_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pack_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pack_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pack_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pack_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pack_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[smpl_inst_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_smpl_inst_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[smpl_inst_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_smpl_inst_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[smpl_inst_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_smpl_inst_unit_dec_place_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_unit_rnd_typ_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[bp_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bp_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_rslt_prnt_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_rslt_prnt_tm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dfct_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dfct_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dfct_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dfct_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[vld_pd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_vld_pd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_pd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_pd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_pd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_pd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_pd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_pd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_dt_frm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_dt_frm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_dt_frm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_dt_frm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_ctl_categ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_ctl_categ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_dt_frm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_dt_frm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[vld_dt_now]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_vld_dt_now_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_rmrks_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ext_insp_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_insp_act_no_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[insp_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dfct_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dfct_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dfct_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dfct_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_dmn_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_dmn_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_pack_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_pack_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_pack_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_pack_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_pack_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_pack_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_pack_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_pack_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_pack_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_pack_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_pack_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_pack_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_pack_unit_dmn_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_pack_unit_dmn_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_pack_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_pack_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_xfr_base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_xfr_base_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_insp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_insp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_no_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_no_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fix_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fix_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_judg_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_judg_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_rmrks_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_insp_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_insp_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_base_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_pack_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_pack_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_pack_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_pack_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_pack_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_pack_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_pack_unit_dmn_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_pack_unit_dmn_qty_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_pack_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_pack_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[pack_xfr_base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_pack_xfr_base_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_arrv_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_arrv_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_arrv_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_arrv_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_gd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_insp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_insp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_insp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_insp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[stk_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_stk_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[fix_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_fix_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[fix_no_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_fix_no_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[fix_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_fix_no_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[bd_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_bd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[bd_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_bd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[insp_smpl_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_insp_smpl_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[insp_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_insp_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[insp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_insp_no_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[insp_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_insp_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[itm_sub1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_itm_sub1_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[itm_sub2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_itm_sub2_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[itm_sub3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_itm_sub3_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Smpl]パネルの[ext_insp_smpl_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSmpl_ext_insp_smpl_act_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Hdr_ver_no]の作成メソッド
	 */
	public MCList getHdr_ver_no(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[Hdr_smpl_inst_unit_cd]の作成メソッド
	 */
	public MCList getHdr_smpl_inst_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getHdr_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_quality_typ]の作成メソッド
	 */
	public MCList getHdr_quality_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getQualityTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_gd_cd]の作成メソッド
	 */
	public MCList getHdr_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkGd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_dfct_rsn_cd]の作成メソッド
	 */
	public MCList getHdr_dfct_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDfctBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_insp_judg_rslt_typ]の作成メソッド
	 */
	public MCList getHdr_insp_judg_rslt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getInspJudgRsltTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_judg_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getHdr_judg_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_quality_typ]の作成メソッド
	 */
	public MCList getDtl_quality_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getQualityTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_gd_cd]の作成メソッド
	 */
	public MCList getDtl_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkGd(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dfct_rsn_cd]の作成メソッド
	 */
	public MCList getDtl_dfct_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDfctBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_pack_unit_cd]の作成メソッド
	 */
	public MCList getDtl_pack_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnSmpl_loc_cd]の作成メソッド
	 */
	public MCList getSmpl_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Smpl_str_ln_p_PPanel_columnStrLn_str_ln_cd]の作成メソッド
	 */
	public MCList getSmpl_str_ln_p_PPanel_columnStrLn_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnSmpl_bd_dpt_cd]の作成メソッド
	 */
	public MCList getSmpl_bd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBFL0070.Srch01")) {
			return new MS_MSBFL0070_Srch01Bridge();
		}
		if (id.equals("MS.MSBFL0070.Srch02")) {
			return new MS_MSBFL0070_Srch02Bridge();
		}
		if (id.equals("MS.MSBFL0070.Ins01")) {
			return new MS_MSBFL0070_Ins01Bridge();
		}
		if (id.equals("MS.MSBFL0070.Upd01")) {
			return new MS_MSBFL0070_Upd01Bridge();
		}
		if (id.equals("MS.MSBFL0070.Upd02")) {
			return new MS_MSBFL0070_Upd02Bridge();
		}
		if (id.equals("MS.MSBFL0070.Del01")) {
			return new MS_MSBFL0070_Del01Bridge();
		}
		if (id.equals("MS.MSBFL0070.Del02")) {
			return new MS_MSBFL0070_Del02Bridge();
		}
		if (id.equals("MS.MSBFL0070.Prnt01")) {
			return new MS_MSBFL0070_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBFL0070_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0070_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0070_Srch01;

		/** コンストラクタ */
		protected MS_MSBFL0070_Srch01Bridge() {
			p_MS_MSBFL0070_Srch01 = new MCParam(PDef.MS_MSBFL0070_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0070_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0070.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBF.MSBFP0070.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0070.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0070.SmplR.class));

			p_MS_MSBFL0070_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0070_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0070_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0070_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0070_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0070.CndR up0() {
			return (mcframe.clientMSBF.MSBFP0070.CndR)up(0);
		}

		protected mcframe.clientMSBF.MSBFP0070.HdrR down0() {
			return (mcframe.clientMSBF.MSBFP0070.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0070.DtlR> down1() {
			return (MCList<mcframe.clientMSBF.MSBFP0070.DtlR>)down(1);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0070.SmplR> down2() {
			return (MCList<mcframe.clientMSBF.MSBFP0070.SmplR>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0070_Srch01.addDownBlock(mcframe.clientMSBF.MSBFP0070.HdrR.create());
			p_MS_MSBFL0070_Srch01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0070.DtlR.class));
			p_MS_MSBFL0070_Srch01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0070.SmplR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0070_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBF.MSBFP0070.HdrR)p_MS_MSBFL0070_Srch01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBF.MSBFP0070.DtlR>)p_MS_MSBFL0070_Srch01.getContainerParam().getDownBlock(1));
			setSmplL((MCList<mcframe.clientMSBF.MSBFP0070.SmplR>)p_MS_MSBFL0070_Srch01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
			getSmplL().clear();
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
			result.add(getSmplL());
			return result;
		}
	}
	/**
	 * [MS_MSBFL0070_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0070_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0070_Srch02;

		/** コンストラクタ */
		protected MS_MSBFL0070_Srch02Bridge() {
			p_MS_MSBFL0070_Srch02 = new MCParam(PDef.MS_MSBFL0070_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0070_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0070.HdrR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBF.MSBFP0070.HdrR.create());

			p_MS_MSBFL0070_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0070_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0070_Srch02.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0070_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0070_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0070.HdrR up0() {
			return (mcframe.clientMSBF.MSBFP0070.HdrR)up(0);
		}

		protected mcframe.clientMSBF.MSBFP0070.HdrR down0() {
			return (mcframe.clientMSBF.MSBFP0070.HdrR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0070_Srch02.addDownBlock(mcframe.clientMSBF.MSBFP0070.HdrR.create());
		}
		protected MCParam param() {
			return p_MS_MSBFL0070_Srch02;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBF.MSBFP0070.HdrR)p_MS_MSBFL0070_Srch02.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0070_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0070_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0070_Ins01;

		/** コンストラクタ */
		protected MS_MSBFL0070_Ins01Bridge() {
			p_MS_MSBFL0070_Ins01 = new MCParam(PDef.MS_MSBFL0070_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0070_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0070.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0070.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0070.SmplR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBF.MSBFP0070.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0070.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0070.SmplR.class));

			p_MS_MSBFL0070_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0070_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0070_Ins01.addUpBlock(getHdrR());
			p_MS_MSBFL0070_Ins01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBFL0070_Ins01.addUpBlock(getSmplL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0070_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0070_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0070.HdrR up0() {
			return (mcframe.clientMSBF.MSBFP0070.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0070.DtlR> up1() {
			return (MCList<mcframe.clientMSBF.MSBFP0070.DtlR>)up(1);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0070.SmplR> up2() {
			return (MCList<mcframe.clientMSBF.MSBFP0070.SmplR>)up(2);
		}

		protected mcframe.clientMSBF.MSBFP0070.HdrR down0() {
			return (mcframe.clientMSBF.MSBFP0070.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0070.DtlR> down1() {
			return (MCList<mcframe.clientMSBF.MSBFP0070.DtlR>)down(1);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0070.SmplR> down2() {
			return (MCList<mcframe.clientMSBF.MSBFP0070.SmplR>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0070_Ins01.addDownBlock(mcframe.clientMSBF.MSBFP0070.HdrR.create());
			p_MS_MSBFL0070_Ins01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0070.DtlR.class));
			p_MS_MSBFL0070_Ins01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0070.SmplR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0070_Ins01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBF.MSBFP0070.HdrR)p_MS_MSBFL0070_Ins01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBF.MSBFP0070.DtlR>)p_MS_MSBFL0070_Ins01.getContainerParam().getDownBlock(1));
			setSmplL((MCList<mcframe.clientMSBF.MSBFP0070.SmplR>)p_MS_MSBFL0070_Ins01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
			getSmplL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getSmplL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getSmplL());
			return result;
		}
	}
	/**
	 * [MS_MSBFL0070_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0070_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0070_Upd01;

		/** コンストラクタ */
		protected MS_MSBFL0070_Upd01Bridge() {
			p_MS_MSBFL0070_Upd01 = new MCParam(PDef.MS_MSBFL0070_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0070_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0070.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0070.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0070.SmplR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBF.MSBFP0070.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0070.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0070.SmplR.class));

			p_MS_MSBFL0070_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0070_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0070_Upd01.addUpBlock(getHdrR());
			p_MS_MSBFL0070_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBFL0070_Upd01.addUpBlock(getSmplL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0070_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0070_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0070.HdrR up0() {
			return (mcframe.clientMSBF.MSBFP0070.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0070.DtlR> up1() {
			return (MCList<mcframe.clientMSBF.MSBFP0070.DtlR>)up(1);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0070.SmplR> up2() {
			return (MCList<mcframe.clientMSBF.MSBFP0070.SmplR>)up(2);
		}

		protected mcframe.clientMSBF.MSBFP0070.HdrR down0() {
			return (mcframe.clientMSBF.MSBFP0070.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0070.DtlR> down1() {
			return (MCList<mcframe.clientMSBF.MSBFP0070.DtlR>)down(1);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0070.SmplR> down2() {
			return (MCList<mcframe.clientMSBF.MSBFP0070.SmplR>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0070_Upd01.addDownBlock(mcframe.clientMSBF.MSBFP0070.HdrR.create());
			p_MS_MSBFL0070_Upd01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0070.DtlR.class));
			p_MS_MSBFL0070_Upd01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0070.SmplR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0070_Upd01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBF.MSBFP0070.HdrR)p_MS_MSBFL0070_Upd01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBF.MSBFP0070.DtlR>)p_MS_MSBFL0070_Upd01.getContainerParam().getDownBlock(1));
			setSmplL((MCList<mcframe.clientMSBF.MSBFP0070.SmplR>)p_MS_MSBFL0070_Upd01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
			getSmplL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getSmplL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getSmplL());
			return result;
		}
	}
	/**
	 * [MS_MSBFL0070_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0070_Upd02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0070_Upd02;

		/** コンストラクタ */
		protected MS_MSBFL0070_Upd02Bridge() {
			p_MS_MSBFL0070_Upd02 = new MCParam(PDef.MS_MSBFL0070_Upd02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0070_Upd02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0070.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0070.DtlR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBF.MSBFP0070.HdrR.create());

			p_MS_MSBFL0070_Upd02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0070_Upd02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0070_Upd02.addUpBlock(getHdrR());
			p_MS_MSBFL0070_Upd02.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0070_Upd02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0070_Upd02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0070.HdrR up0() {
			return (mcframe.clientMSBF.MSBFP0070.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0070.DtlR> up1() {
			return (MCList<mcframe.clientMSBF.MSBFP0070.DtlR>)up(1);
		}

		protected mcframe.clientMSBF.MSBFP0070.HdrR down0() {
			return (mcframe.clientMSBF.MSBFP0070.HdrR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0070_Upd02.addDownBlock(mcframe.clientMSBF.MSBFP0070.HdrR.create());
		}
		protected MCParam param() {
			return p_MS_MSBFL0070_Upd02;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBF.MSBFP0070.HdrR)p_MS_MSBFL0070_Upd02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getHdrR().clear();
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
			return result;
		}
	}
	/**
	 * [MS_MSBFL0070_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0070_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0070_Del01;

		/** コンストラクタ */
		protected MS_MSBFL0070_Del01Bridge() {
			p_MS_MSBFL0070_Del01 = new MCParam(PDef.MS_MSBFL0070_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0070_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0070.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0070.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0070.SmplR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBF.MSBFP0070.HdrR.create());

			p_MS_MSBFL0070_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0070_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0070_Del01.addUpBlock(getHdrR());
			p_MS_MSBFL0070_Del01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBFL0070_Del01.addUpBlock(getSmplL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0070_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0070_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0070.HdrR up0() {
			return (mcframe.clientMSBF.MSBFP0070.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0070.DtlR> up1() {
			return (MCList<mcframe.clientMSBF.MSBFP0070.DtlR>)up(1);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0070.SmplR> up2() {
			return (MCList<mcframe.clientMSBF.MSBFP0070.SmplR>)up(2);
		}

		protected mcframe.clientMSBF.MSBFP0070.HdrR down0() {
			return (mcframe.clientMSBF.MSBFP0070.HdrR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0070_Del01.addDownBlock(mcframe.clientMSBF.MSBFP0070.HdrR.create());
		}
		protected MCParam param() {
			return p_MS_MSBFL0070_Del01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBF.MSBFP0070.HdrR)p_MS_MSBFL0070_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getHdrR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getSmplL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
	}
	/**
	 * [MS_MSBFL0070_Del02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0070_Del02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0070_Del02;

		/** コンストラクタ */
		protected MS_MSBFL0070_Del02Bridge() {
			p_MS_MSBFL0070_Del02 = new MCParam(PDef.MS_MSBFL0070_Del02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0070_Del02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0070.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0070.DtlR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBF.MSBFP0070.HdrR.create());

			p_MS_MSBFL0070_Del02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0070_Del02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0070_Del02.addUpBlock(getHdrR());
			p_MS_MSBFL0070_Del02.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0070_Del02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0070_Del02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0070.HdrR up0() {
			return (mcframe.clientMSBF.MSBFP0070.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0070.DtlR> up1() {
			return (MCList<mcframe.clientMSBF.MSBFP0070.DtlR>)up(1);
		}

		protected mcframe.clientMSBF.MSBFP0070.HdrR down0() {
			return (mcframe.clientMSBF.MSBFP0070.HdrR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0070_Del02.addDownBlock(mcframe.clientMSBF.MSBFP0070.HdrR.create());
		}
		protected MCParam param() {
			return p_MS_MSBFL0070_Del02;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBF.MSBFP0070.HdrR)p_MS_MSBFL0070_Del02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getHdrR().clear();
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
			return result;
		}
	}
	/**
	 * [MS_MSBFL0070_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0070_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0070_Prnt01;

		/** コンストラクタ */
		protected MS_MSBFL0070_Prnt01Bridge() {
			p_MS_MSBFL0070_Prnt01 = new MCParam(PDef.MS_MSBFL0070_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0070_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0070.HdrR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBF.MSBFP0070.HdrR.create());

			p_MS_MSBFL0070_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0070_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0070_Prnt01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0070_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0070_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0070.HdrR up0() {
			return (mcframe.clientMSBF.MSBFP0070.HdrR)up(0);
		}

		protected mcframe.clientMSBF.MSBFP0070.HdrR down0() {
			return (mcframe.clientMSBF.MSBFP0070.HdrR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0070_Prnt01.addDownBlock(mcframe.clientMSBF.MSBFP0070.HdrR.create());
		}
		protected MCParam param() {
			return p_MS_MSBFL0070_Prnt01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBF.MSBFP0070.HdrR)p_MS_MSBFL0070_Prnt01.getContainerParam().getDownBlock(0));
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