package mcframe.clientMSBC.MSBCP0040;

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
import mcframe.clientMSBC.MSBCP0040.MSBCP_OrdReg_MC.MS_MSBCL0040_Srch01Caller;
import mcframe.clientMSBC.MSBCP0040.MSBCP_OrdReg_MC.MS_MSBCL0040_Sprt01Caller;
import mcframe.clientMSBC.MSBCP0040.MSBCP_OrdReg_MC.MS_MSBCL0040_Sprt02Caller;
import mcframe.clientMSBC.MSBCP0040.MSBCP_OrdReg_MC.MS_MSBCL0040_Sprt03Caller;
import mcframe.clientMSBC.MSBCP0040.MSBCP_OrdReg_MC.MS_MSBCL0040_Ins01Caller;
import mcframe.clientMSBC.MSBCP0040.MSBCP_OrdReg_MC.MS_MSBCL0040_Upd01Caller;
import mcframe.clientMSBC.MSBCP0040.MSBCP_OrdReg_MC.MS_MSBCL0040_Upd02Caller;
import mcframe.clientMSBC.MSBCP0040.MSBCP_OrdReg_MC.MS_MSBCL0040_Del01Caller;

/**
 * 画面"MSBCP_OrdReg"パネルクラスです。<p>
 *
 * 品目オーダを登録・訂正する画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCP_OrdReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBC";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBCP0040";

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
	 * INS,Create,0;UPD,Modify,1;DEL,Cancel,2;SRCH,View,3 INS,登録する,0;UPD,訂正する,1;DEL,取り消す,2;SRCH,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_SRCH = null;
	public MCLabel Cnd_itm_ord_no_Label = null;
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_itm_ord_no = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [HdrTab]ブロック関連のField定義
	public MCPanel HdrTabPanel = null;
	public MCTabbedPane HdrTabTab = null;
	// [HdrTab]ブロックの項目のField定義
	// [Tab1]ブロック関連のField定義
	public MCPanel Tab1Panel = null;
	// [Tab1]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	// [Hdr]ブロックの項目のField定義
	public MCLabel Hdr_itm_ord_sts_typ_Label = null;
	/**
	 * Item order status type 品目オーダ状況区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_itm_ord_sts_typ = null;
	/**
	 * Item order status type name 品目オーダ状況区分名.<p>
	 *
	 */
	public MCTextField Hdr_itm_ord_sts_typ_nm = null;
	public MCLabel Hdr_master_dt_Label = null;
	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDateField Hdr_master_dt = null;
	public MCLabel Hdr_itm_ord_no_Label = null;
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_itm_ord_no = null;
	public MCLabel Hdr_rqmt_no_Label = null;
	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_rqmt_no = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Hdr_itm_p_PPanel;
	public MCTextField Hdr_itm_cd;	// [Hdr]の[itm_p.itm_cd]を[Hdr_itm_cd]としてエイリアス定義。
	public MCTextComboBox Hdr_itm_sub1;	// [Hdr]の[itm_p.itm_sub1]を[Hdr_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Hdr_itm_sub2;	// [Hdr]の[itm_p.itm_sub2]を[Hdr_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Hdr_itm_sub3;	// [Hdr]の[itm_p.itm_sub3]を[Hdr_itm_sub3]としてエイリアス定義。
	public MCTextField Hdr_itm_nm;	// [Hdr]の[itm_p.itm_nm]を[Hdr_itm_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H Hdr_ver_no_p_PPanel;
	public MCTextComboBox Hdr_ver_no;	// [Hdr]の[ver_no_p.ver_no]を[Hdr_ver_no]としてエイリアス定義。
	public MCLabel Hdr_strg_loc_cd_Label = null;
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_strg_loc_cd = null;
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public MCTextField Hdr_strg_loc_nm = null;
	public MCLabel Hdr_strg_site_cd_Label = null;
	/**
	 * Storage factory/distribution warehouse cd. 格納先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_strg_site_cd = null;
	/**
	 * Storage factory/distribution warehouse name 格納先工場・物流倉庫名.<p>
	 *
	 */
	public MCTextField Hdr_strg_site_nm = null;
	/**
	 * Storage location supplier cd. 格納場所発注先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_strg_sppl_cd = null;
	public MCLabel Hdr_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Hdr_wg_nm = null;
	public MCLabel Hdr_itm_ord_typ_Label = null;
	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_itm_ord_typ = null;
	/**
	 * Order type name オーダ区分名.<p>
	 *
	 */
	public MCTextField Hdr_itm_ord_typ_nm = null;
	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public MCCheckBox Hdr_not_fix_flg = null;
	/**
	 * Mfg. 製造.<p>
	 *
	 */
	public MCCheckBox Hdr_mfg_flg = null;
	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public MCCheckBox Hdr_outsrc_flg = null;
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
	/**
	 * Mfg. location supplier cd. 製造場所発注先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_mfg_sppl_cd = null;
	/**
	 * Mfg. location maker cd. 製造場所メーカＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_mfg_maker_cd = null;
	public MCLabel Hdr_bom_ptn_Label = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCTextComboBox Hdr_bom_ptn = null;
	public MCLabel Hdr_sppl_cd_Label = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_sppl_cd = null;
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
	public MCTextComboBox Hdr_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCTextField Hdr_maker_nm = null;
	public MCLabel Hdr_rqst_loc_cd_Label = null;
	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_rqst_loc_cd = null;
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public MCTextField Hdr_rqst_loc_nm = null;
	public MCLabel Hdr_rqst_wg_cd_Label = null;
	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_rqst_wg_cd = null;
	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Hdr_rqst_wg_nm = null;
	public MCLabel Hdr_nmr_qty_Label = null;
	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public MCNumberField Hdr_nmr_qty = null;
	public MCLabel Hdr_dnm_qty_Label = null;
	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public MCNumberField Hdr_dnm_qty = null;
	public MCLabel Hdr_fxd_yield_qty_Label = null;
	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public MCNumberField Hdr_fxd_yield_qty = null;
	/**
	 * Unrequired quantity linkage 数量連動不要.<p>
	 *
	 */
	public MCCheckBox Hdr_not_qty_rlt_flg = null;
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H Hdr_inst_qty_p_PPanel;
	public MCNumberField Hdr_inst_qty;	// [Hdr]の[inst_qty_p.qty]を[Hdr_inst_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H Hdr_yield_schd_qty_p_PPanel;
	public MCNumberField Hdr_yield_schd_qty;	// [Hdr]の[yield_schd_qty_p.qty]を[Hdr_yield_schd_qty]としてエイリアス定義。
	public MCLabel Hdr_unit_cd_Label = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCTextField Hdr_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_dec_place = null;
	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public MCTextField Hdr_rnd_typ = null;
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCCheckBox Hdr_cont_fctr_flg = null;
	public MCLabel Hdr_lmt_dt_Label = null;
	/**
	 * Expired date 期限切れ日.<p>
	 *
	 */
	public MCDateField Hdr_lmt_dt = null;
	public mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H Hdr_sno_wrk_no_p_PPanel;
	public MCTextField Hdr_sno1;	// [Hdr]の[sno_wrk_no_p.sno1]を[Hdr_sno1]としてエイリアス定義。
	public MCTextField Hdr_sno2;	// [Hdr]の[sno_wrk_no_p.sno2]を[Hdr_sno2]としてエイリアス定義。
	public MCTextField Hdr_sno3;	// [Hdr]の[sno_wrk_no_p.sno3]を[Hdr_sno3]としてエイリアス定義。
	public MCTextField Hdr_sno4;	// [Hdr]の[sno_wrk_no_p.sno4]を[Hdr_sno4]としてエイリアス定義。
	public MCTextField Hdr_wrk_no;	// [Hdr]の[sno_wrk_no_p.wrk_no]を[Hdr_wrk_no]としてエイリアス定義。
	public MCTextField Hdr_wrk_nm;	// [Hdr]の[sno_wrk_no_p.wrk_nm]を[Hdr_wrk_nm]としてエイリアス定義。
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCTextField Hdr_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCTextField Hdr_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCTextField Hdr_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCTextField Hdr_sno4_mng_typ = null;
	/**
	 * For inspection 検査対象.<p>
	 *
	 */
	public MCCheckBox Hdr_insp_flg = null;
	public MCLabel Hdr_po_schd_dt_Label = null;
	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public MCDateField Hdr_po_schd_dt = null;
	public MCLabel Hdr_mfg_st_schd_dt_Label = null;
	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public MCDateField Hdr_mfg_st_schd_dt = null;
	public MCLabel Hdr_mfg_end_schd_dt_Label = null;
	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public MCDateField Hdr_mfg_end_schd_dt = null;
	public MCLabel Hdr_gi_schd_dt_Label = null;
	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public MCDateField Hdr_gi_schd_dt = null;
	public MCLabel Hdr_strg_schd_dt_Label = null;
	/**
	 * Scheduled storage completion date 格納完了予定日.<p>
	 *
	 */
	public MCDateField Hdr_strg_schd_dt = null;
	public MCLabel Hdr_accpt_schd_dt_Label = null;
	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public MCDateField Hdr_accpt_schd_dt = null;
	public MCLabel Hdr_insp_st_schd_dt_Label = null;
	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public MCDateField Hdr_insp_st_schd_dt = null;
	public MCLabel Hdr_insp_end_schd_dt_Label = null;
	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public MCDateField Hdr_insp_end_schd_dt = null;
	public MCLabel Hdr_avl_schd_dt_Label = null;
	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public MCDateField Hdr_avl_schd_dt = null;
	/**
	 * Date calculation 日付計算.<p>
	 *
	 */
	public MCButton Hdr_sprt_lt = null;
	public MCLabel Hdr_oper_ptn_Label = null;
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public MCTextComboBox Hdr_oper_ptn = null;
	public MCLabel Hdr_purc_lt_Label = null;
	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public MCNumberField Hdr_purc_lt = null;
	public MCLabel Hdr_mfg_lt_Label = null;
	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public MCNumberField Hdr_mfg_lt = null;
	public MCLabel Hdr_xfr_lt_Label = null;
	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public MCNumberField Hdr_xfr_lt = null;
	public MCLabel Hdr_accpt_insp_lt_Label = null;
	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public MCNumberField Hdr_accpt_insp_lt = null;
	public MCLabel Hdr_insp_lt_Label = null;
	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public MCNumberField Hdr_insp_lt = null;
	public MCLabel Hdr_insp_offst_Label = null;
	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public MCNumberField Hdr_insp_offst = null;
	public MCLabel Hdr_ord_fix_pd_Label = null;
	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public MCNumberField Hdr_ord_fix_pd = null;
	public mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H Hdr_inst_cont_qty_p_PPanel;
	public MCNumberField Hdr_cont_fctr_inst_qty;	// [Hdr]の[inst_cont_qty_p.cont_qty]を[Hdr_cont_fctr_inst_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H Hdr_yield_cont_qty_p_PPanel;
	public MCNumberField Hdr_cont_fctr_schd_yield;	// [Hdr]の[yield_cont_qty_p.cont_qty]を[Hdr_cont_fctr_schd_yield]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H Hdr_cont_unit_p_PPanel;
	public MCTextField Hdr_cont_fctr_unit_cd;	// [Hdr]の[cont_unit_p.cont_fctr_unit_cd]を[Hdr_cont_fctr_unit_cd]としてエイリアス定義。
	public MCTextField Hdr_cont_fctr_unit_nm;	// [Hdr]の[cont_unit_p.cont_fctr_unit_nm]を[Hdr_cont_fctr_unit_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H Hdr_std_cont_p_PPanel;
	public MCNumberField Hdr_std_cont_fctr;	// [Hdr]の[std_cont_p.std_cont_fctr]を[Hdr_std_cont_fctr]としてエイリアス定義。
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_cont_fctr_dec_place = null;
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public MCTextField Hdr_cont_fctr_rnd_typ = null;
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCCheckBox Hdr_ver_flg = null;
	public MCLabel Hdr_inst_po_cnt_rmrks_Label = null;
	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public MCTextField Hdr_inst_po_cnt_rmrks = null;
	public MCLabel Hdr_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
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
	/**
	 * Order import オーダ受信.<p>
	 *
	 */
	public MCCheckBox Hdr_ord_rcv_flg = null;
	/**
	 * Export Order オーダ送信.<p>
	 *
	 */
	public MCCheckBox Hdr_ord_snd_flg = null;
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
	public MCLabel Hdr_ext_itm_ord_no_Label = null;
	/**
	 * External item order No. 外部品目オーダＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_ext_itm_ord_no = null;
	/**
	 * Scheduler frozen target スケジューラ凍結対象.<p>
	 *
	 */
	public MCCheckBox Hdr_for_scheduler_frozen_flg = null;
	/**
	 * Scheduler frozen スケジューラ凍結.<p>
	 *
	 */
	public MCCheckBox Hdr_scheduler_frozen_flg = null;
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
	// [SysInfo]ブロック関連のField定義
	public MCPanel SysInfoPanel = null;
	// [SysInfo]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBC.MSBCP0040.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Operation order No. 工程オーダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_ord_no = null;
	/**
	 * Operation order status type 工程オーダ状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_ord_sts_typ = null;
	/**
	 * Operation order status type name 工程オーダ状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_ord_sts_typ_nm = null;
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_cd = null;
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_nm = null;
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_seq = null;
	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_cd = null;
	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_nm = null;
	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_disp_seq = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_oper_schd_qty_p_PPanel;
	public MCColumnConfig columnDtl_oper_schd_qty;// [Dtl]の[oper_schd_qty_p.qty]を[columnDtl_oper_schd_qty]としてエイリアス定義。
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
	public MCColumnConfig columnDtl_base_dec_place = null;
	/**
	 * Operation base unit qty. 工程基準単位数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_std_qty = null;
	/**
	 * Operation conversion unit qty. 工程換算単位数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_conv_qty = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dec_place = null;
	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_unit_conv_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_oper_conv_schd_qty_p_PPanel;
	public MCColumnConfig columnDtl_oper_conv_schd_qty;// [Dtl]の[oper_conv_schd_qty_p.qty]を[columnDtl_oper_conv_schd_qty]としてエイリアス定義。
	/**
	 * Operation management unit cd. 工程管理単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_unit_cd = null;
	/**
	 * Operation management unit name 工程管理単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_unit_nm = null;
	/**
	 * Output recording operation 出来高計上工程.<p>
	 *
	 */
	public MCColumnConfig columnDtl_yield_oper_flg = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Dtl_st_tm_p_PPanel;
	public MCColumnConfig columnDtl_st_schd_dt;// [Dtl]の[st_tm_p.ymd]を[columnDtl_st_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_st_schd_hm;// [Dtl]の[st_tm_p.hm]を[columnDtl_st_schd_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Dtl_end_tm_p_PPanel;
	public MCColumnConfig columnDtl_end_schd_dt;// [Dtl]の[end_tm_p.ymd]を[columnDtl_end_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_end_schd_hm;// [Dtl]の[end_tm_p.hm]を[columnDtl_end_schd_hm]としてエイリアス定義。
	/**
	 * Operation LT 工程ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_lt = null;
	/**
	 * Operation offset type 工程オフセット区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_offst_typ = null;
	/**
	 * Operation offset type name 工程オフセット区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_offst_typ_nm = null;
	/**
	 * Operation offset 工程オフセット.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_offst = null;
	/**
	 * Operation resources 工程資源.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_rsrc = null;
	/**
	 * Internal remarks 内部備考.<p>
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
	 * External operation order No. 外部工程オーダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_oper_ord_no = null;
	/**
	 * Scheduler frozen スケジューラ凍結.<p>
	 *
	 */
	public MCColumnConfig columnDtl_scheduler_frozen_flg = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Operation order explosion 工程オーダ展開.<p>
	 *
	 */
	public MCButton Btn_sprt_expand_oper = null;
	/**
	 * Bulk status setting (Save) 一括状況設定(保存).<p>
	 *
	 */
	public MCButton Btn_upd_sav_all_oper = null;
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
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd2 = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [INS_NONE]モードを表す定数 */
	public static final String INS_NONE = "INS_NONE";
	/** [INS_MFG]モードを表す定数 */
	public static final String INS_MFG = "INS_MFG";
	/** [INS_PURC]モードを表す定数 */
	public static final String INS_PURC = "INS_PURC";
	/** [INS_OUTSRC]モードを表す定数 */
	public static final String INS_OUTSRC = "INS_OUTSRC";
	/** [INS_XFR]モードを表す定数 */
	public static final String INS_XFR = "INS_XFR";
	/** [INS_WG_XFR]モードを表す定数 */
	public static final String INS_WG_XFR = "INS_WG_XFR";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [UPD_NONE]モードを表す定数 */
	public static final String UPD_NONE = "UPD_NONE";
	/** [UPD_MFG]モードを表す定数 */
	public static final String UPD_MFG = "UPD_MFG";
	/** [UPD_PURC]モードを表す定数 */
	public static final String UPD_PURC = "UPD_PURC";
	/** [UPD_OUTSRC]モードを表す定数 */
	public static final String UPD_OUTSRC = "UPD_OUTSRC";
	/** [UPD_XFR]モードを表す定数 */
	public static final String UPD_XFR = "UPD_XFR";
	/** [UPD_WG_XFR]モードを表す定数 */
	public static final String UPD_WG_XFR = "UPD_WG_XFR";
	/** [UPD_CANFIX]モードを表す定数 */
	public static final String UPD_CANFIX = "UPD_CANFIX";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [FIX_I]モードを表す定数 */
	public static final String FIX_I = "FIX_I";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [FIX_D]モードを表す定数 */
	public static final String FIX_D = "FIX_D";
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{INS, INS_NONE, INS_MFG, INS_PURC, INS_OUTSRC, INS_XFR, INS_WG_XFR, UPD, UPD_NONE, UPD_MFG, UPD_PURC, UPD_OUTSRC, UPD_XFR, UPD_WG_XFR, UPD_CANFIX, DEL, FIX_I, FIX_U, FIX_D, SRCH, REF};
	
	/** [MS_MSBCL0040_Srch01]のCallerの作成 */
	protected MSBCP_OrdReg_MC.MS_MSBCL0040_Srch01Caller createMS_MSBCL0040_Srch01() {
		MSBCP_OrdReg_MC.MS_MSBCL0040_Srch01Caller<MSBCP_OrdReg, MS_MSBCL0040_Srch01Bridge>
		caller = ((MSBCP_OrdReg_MC)this).new MS_MSBCL0040_Srch01Caller<MSBCP_OrdReg, MS_MSBCL0040_Srch01Bridge>(
					(MSBCP_OrdReg)this, new MS_MSBCL0040_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBCL0040_Srch01]の呼び出し */
	protected void callMS_MSBCL0040_Srch01() {
		MCCaller caller = createMS_MSBCL0040_Srch01();
		caller.exec();
	}
	/** [MS_MSBCL0040_Sprt01]のCallerの作成 */
	protected MSBCP_OrdReg_MC.MS_MSBCL0040_Sprt01Caller createMS_MSBCL0040_Sprt01() {
		MSBCP_OrdReg_MC.MS_MSBCL0040_Sprt01Caller<MSBCP_OrdReg, MS_MSBCL0040_Sprt01Bridge>
		caller = ((MSBCP_OrdReg_MC)this).new MS_MSBCL0040_Sprt01Caller<MSBCP_OrdReg, MS_MSBCL0040_Sprt01Bridge>(
					(MSBCP_OrdReg)this, new MS_MSBCL0040_Sprt01Bridge());
		return caller;
	}
	/** [MS_MSBCL0040_Sprt01]の呼び出し */
	protected void callMS_MSBCL0040_Sprt01() {
		MCCaller caller = createMS_MSBCL0040_Sprt01();
		caller.exec();
	}
	/** [MS_MSBCL0040_Sprt02]のCallerの作成 */
	protected MSBCP_OrdReg_MC.MS_MSBCL0040_Sprt02Caller createMS_MSBCL0040_Sprt02() {
		MSBCP_OrdReg_MC.MS_MSBCL0040_Sprt02Caller<MSBCP_OrdReg, MS_MSBCL0040_Sprt02Bridge>
		caller = ((MSBCP_OrdReg_MC)this).new MS_MSBCL0040_Sprt02Caller<MSBCP_OrdReg, MS_MSBCL0040_Sprt02Bridge>(
					(MSBCP_OrdReg)this, new MS_MSBCL0040_Sprt02Bridge());
		return caller;
	}
	/** [MS_MSBCL0040_Sprt02]の呼び出し */
	protected void callMS_MSBCL0040_Sprt02() {
		MCCaller caller = createMS_MSBCL0040_Sprt02();
		caller.exec();
	}
	/** [MS_MSBCL0040_Sprt03]のCallerの作成 */
	protected MSBCP_OrdReg_MC.MS_MSBCL0040_Sprt03Caller createMS_MSBCL0040_Sprt03() {
		MSBCP_OrdReg_MC.MS_MSBCL0040_Sprt03Caller<MSBCP_OrdReg, MS_MSBCL0040_Sprt03Bridge>
		caller = ((MSBCP_OrdReg_MC)this).new MS_MSBCL0040_Sprt03Caller<MSBCP_OrdReg, MS_MSBCL0040_Sprt03Bridge>(
					(MSBCP_OrdReg)this, new MS_MSBCL0040_Sprt03Bridge());
		return caller;
	}
	/** [MS_MSBCL0040_Sprt03]の呼び出し */
	protected void callMS_MSBCL0040_Sprt03() {
		MCCaller caller = createMS_MSBCL0040_Sprt03();
		caller.exec();
	}
	/** [MS_MSBCL0040_Ins01]のCallerの作成 */
	protected MSBCP_OrdReg_MC.MS_MSBCL0040_Ins01Caller createMS_MSBCL0040_Ins01() {
		MSBCP_OrdReg_MC.MS_MSBCL0040_Ins01Caller<MSBCP_OrdReg, MS_MSBCL0040_Ins01Bridge>
		caller = ((MSBCP_OrdReg_MC)this).new MS_MSBCL0040_Ins01Caller<MSBCP_OrdReg, MS_MSBCL0040_Ins01Bridge>(
					(MSBCP_OrdReg)this, new MS_MSBCL0040_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBCL0040_Ins01]の呼び出し */
	protected void callMS_MSBCL0040_Ins01() {
		MCCaller caller = createMS_MSBCL0040_Ins01();
		caller.exec();
	}
	/** [MS_MSBCL0040_Upd01]のCallerの作成 */
	protected MSBCP_OrdReg_MC.MS_MSBCL0040_Upd01Caller createMS_MSBCL0040_Upd01() {
		MSBCP_OrdReg_MC.MS_MSBCL0040_Upd01Caller<MSBCP_OrdReg, MS_MSBCL0040_Upd01Bridge>
		caller = ((MSBCP_OrdReg_MC)this).new MS_MSBCL0040_Upd01Caller<MSBCP_OrdReg, MS_MSBCL0040_Upd01Bridge>(
					(MSBCP_OrdReg)this, new MS_MSBCL0040_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBCL0040_Upd01]の呼び出し */
	protected void callMS_MSBCL0040_Upd01() {
		MCCaller caller = createMS_MSBCL0040_Upd01();
		caller.exec();
	}
	/** [MS_MSBCL0040_Upd02]のCallerの作成 */
	protected MSBCP_OrdReg_MC.MS_MSBCL0040_Upd02Caller createMS_MSBCL0040_Upd02() {
		MSBCP_OrdReg_MC.MS_MSBCL0040_Upd02Caller<MSBCP_OrdReg, MS_MSBCL0040_Upd02Bridge>
		caller = ((MSBCP_OrdReg_MC)this).new MS_MSBCL0040_Upd02Caller<MSBCP_OrdReg, MS_MSBCL0040_Upd02Bridge>(
					(MSBCP_OrdReg)this, new MS_MSBCL0040_Upd02Bridge());
		return caller;
	}
	/** [MS_MSBCL0040_Upd02]の呼び出し */
	protected void callMS_MSBCL0040_Upd02() {
		MCCaller caller = createMS_MSBCL0040_Upd02();
		caller.exec();
	}
	/** [MS_MSBCL0040_Del01]のCallerの作成 */
	protected MSBCP_OrdReg_MC.MS_MSBCL0040_Del01Caller createMS_MSBCL0040_Del01() {
		MSBCP_OrdReg_MC.MS_MSBCL0040_Del01Caller<MSBCP_OrdReg, MS_MSBCL0040_Del01Bridge>
		caller = ((MSBCP_OrdReg_MC)this).new MS_MSBCL0040_Del01Caller<MSBCP_OrdReg, MS_MSBCL0040_Del01Bridge>(
					(MSBCP_OrdReg)this, new MS_MSBCL0040_Del01Bridge());
		return caller;
	}
	/** [MS_MSBCL0040_Del01]の呼び出し */
	protected void callMS_MSBCL0040_Del01() {
		MCCaller caller = createMS_MSBCL0040_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBC.MSBCP0040.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBC.MSBCP0040.HdrR aHdrR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP0040.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBC.MSBCP0040.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0040.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0040.CndR createCndR() {
		return mcframe.clientMSBC.MSBCP0040.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBC.MSBCP0040.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBC.MSBCP0040.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBC.MSBCP0040.HdrR createHdrR() {
		return mcframe.clientMSBC.MSBCP0040.HdrR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBC.MSBCP0040.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0040.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBC.MSBCP0040.DtlR createDtlR() {
		return mcframe.clientMSBC.MSBCP0040.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0040.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBC.MSBCP0040.DtlR.class);
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
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
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
		ret.add(TopPanel);
		ret.add(HdrTabPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(HdrPanel);
		ret.add(SysInfoPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_OrdReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBCP_OrdReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBCP_OrdReg_MC.jbCreateScreenOpe((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbCreateCnd((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbCreateTop((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbCreateHdrTab((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbCreateTab1((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbCreateTab2((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbCreateHdr((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbCreateSysInfo((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbCreateDtl((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbCreateBtn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbCreateEastBtn((MSBCP_OrdReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBCP_OrdReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBCP_OrdReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBCP_OrdReg p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBCP_OrdReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBCP_OrdReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBCP_OrdReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBCP_OrdReg p) {
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
		p.Hdr_ver_no = p.Hdr_ver_no_p_PPanel.VerNo_ver_no;
		p.Hdr_ver_no.addAliasName("Hdr.ver_no", p);
		p.Hdr_inst_qty_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getHdrR().inst_qty_p());
		p.Hdr_inst_qty_p_PPanel.setName("Hdr.inst_qty_p");
		p.Hdr_inst_qty = p.Hdr_inst_qty_p_PPanel.Qty_qty;
		p.Hdr_inst_qty.addAliasName("Hdr.inst_qty", p);
		p.Hdr_yield_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getHdrR().yield_schd_qty_p());
		p.Hdr_yield_schd_qty_p_PPanel.setName("Hdr.yield_schd_qty_p");
		p.Hdr_yield_schd_qty = p.Hdr_yield_schd_qty_p_PPanel.Qty_qty;
		p.Hdr_yield_schd_qty.addAliasName("Hdr.yield_schd_qty", p);
		p.Hdr_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.create(p.getHdrR().sno_wrk_no_p());
		p.Hdr_sno_wrk_no_p_PPanel.setName("Hdr.sno_wrk_no_p");
		p.Hdr_sno1 = p.Hdr_sno_wrk_no_p_PPanel.SnoWrkNo_sno1;
		p.Hdr_sno1.addAliasName("Hdr.sno1", p);
		p.Hdr_sno2 = p.Hdr_sno_wrk_no_p_PPanel.SnoWrkNo_sno2;
		p.Hdr_sno2.addAliasName("Hdr.sno2", p);
		p.Hdr_sno3 = p.Hdr_sno_wrk_no_p_PPanel.SnoWrkNo_sno3;
		p.Hdr_sno3.addAliasName("Hdr.sno3", p);
		p.Hdr_sno4 = p.Hdr_sno_wrk_no_p_PPanel.SnoWrkNo_sno4;
		p.Hdr_sno4.addAliasName("Hdr.sno4", p);
		p.Hdr_wrk_no = p.Hdr_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no;
		p.Hdr_wrk_no.addAliasName("Hdr.wrk_no", p);
		p.Hdr_wrk_nm = p.Hdr_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm;
		p.Hdr_wrk_nm.addAliasName("Hdr.wrk_nm", p);
		p.Hdr_inst_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.create(p.getHdrR().inst_cont_qty_p());
		p.Hdr_inst_cont_qty_p_PPanel.setName("Hdr.inst_cont_qty_p");
		p.Hdr_cont_fctr_inst_qty = p.Hdr_inst_cont_qty_p_PPanel.ContQty_cont_qty;
		p.Hdr_cont_fctr_inst_qty.addAliasName("Hdr.cont_fctr_inst_qty", p);
		p.Hdr_yield_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.create(p.getHdrR().yield_cont_qty_p());
		p.Hdr_yield_cont_qty_p_PPanel.setName("Hdr.yield_cont_qty_p");
		p.Hdr_cont_fctr_schd_yield = p.Hdr_yield_cont_qty_p_PPanel.ContQty_cont_qty;
		p.Hdr_cont_fctr_schd_yield.addAliasName("Hdr.cont_fctr_schd_yield", p);
		p.Hdr_cont_unit_p_PPanel = mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.create(p.getHdrR().cont_unit_p());
		p.Hdr_cont_unit_p_PPanel.setName("Hdr.cont_unit_p");
		p.Hdr_cont_fctr_unit_cd = p.Hdr_cont_unit_p_PPanel.ContFctrUnit_cont_fctr_unit_cd;
		p.Hdr_cont_fctr_unit_cd.addAliasName("Hdr.cont_fctr_unit_cd", p);
		p.Hdr_cont_fctr_unit_nm = p.Hdr_cont_unit_p_PPanel.ContFctrUnit_cont_fctr_unit_nm;
		p.Hdr_cont_fctr_unit_nm.addAliasName("Hdr.cont_fctr_unit_nm", p);
		p.Hdr_std_cont_p_PPanel = mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.create(p.getHdrR().std_cont_p());
		p.Hdr_std_cont_p_PPanel.setName("Hdr.std_cont_p");
		p.Hdr_std_cont_fctr = p.Hdr_std_cont_p_PPanel.StdContFctr_std_cont_fctr;
		p.Hdr_std_cont_fctr.addAliasName("Hdr.std_cont_fctr", p);
	}

	/**
	 * [SysInfo]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSysInfo(MSBCP_OrdReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBCP_OrdReg p) {
		p.Dtl_oper_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0040.DtlR.$oper_schd_qty_p);
		p.Dtl_oper_schd_qty_p_PPanel.setName("Dtl.oper_schd_qty_p");
		p.columnDtl_oper_schd_qty = p.Dtl_oper_schd_qty_p_PPanel.columnQty_qty;
		p.columnDtl_oper_schd_qty.addAliasName("Dtl.oper_schd_qty", p);
		p.Dtl_oper_conv_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0040.DtlR.$oper_conv_schd_qty_p);
		p.Dtl_oper_conv_schd_qty_p_PPanel.setName("Dtl.oper_conv_schd_qty_p");
		p.columnDtl_oper_conv_schd_qty = p.Dtl_oper_conv_schd_qty_p_PPanel.columnQty_qty;
		p.columnDtl_oper_conv_schd_qty.addAliasName("Dtl.oper_conv_schd_qty", p);
		p.Dtl_st_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBC.MSBCP0040.DtlR.$st_tm_p);
		p.Dtl_st_tm_p_PPanel.setName("Dtl.st_tm_p");
		p.columnDtl_st_schd_dt = p.Dtl_st_tm_p_PPanel.columnYmdHm_ymd;
		p.columnDtl_st_schd_dt.addAliasName("Dtl.st_schd_dt", p);
		p.columnDtl_st_schd_hm = p.Dtl_st_tm_p_PPanel.columnYmdHm_hm;
		p.columnDtl_st_schd_hm.addAliasName("Dtl.st_schd_hm", p);
		p.Dtl_end_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBC.MSBCP0040.DtlR.$end_tm_p);
		p.Dtl_end_tm_p_PPanel.setName("Dtl.end_tm_p");
		p.columnDtl_end_schd_dt = p.Dtl_end_tm_p_PPanel.columnYmdHm_ymd;
		p.columnDtl_end_schd_dt.addAliasName("Dtl.end_schd_dt", p);
		p.columnDtl_end_schd_hm = p.Dtl_end_tm_p_PPanel.columnYmdHm_hm;
		p.columnDtl_end_schd_hm.addAliasName("Dtl.end_schd_hm", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBCP_OrdReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBCP_OrdReg p) {
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

	
	/** [Hdr_itm_ord_sts_typ_ListPutter]の定義 */
	private MCListPutter Hdr_itm_ord_sts_typ_p = null;

	/**
	 * [Hdr_itm_ord_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_itm_ord_sts_typ_ListPutter() {
		if (Hdr_itm_ord_sts_typ_p == null) {
			Hdr_itm_ord_sts_typ_p = createHdr_itm_ord_sts_typ_ListPutter(Hdr_itm_ord_sts_typ, "itm_ord_sts_typ", "itm_ord_sts_typ_nm");

		}
		return Hdr_itm_ord_sts_typ_p;
	}
	
	
	/** [Hdr_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Hdr_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Hdr_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Hdr_itm_p_PPanel_Itm_itm_cd_p == null) {
			Hdr_itm_p_PPanel_Itm_itm_cd_p = createHdr_itm_p_PPanel_Itm_itm_cd_ListPutter(Hdr_itm_p_PPanel.Itm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3","unit_cd","unit_nm","dec_place","rnd_typ","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_rnd_typ","cont_fctr_dec_place","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","ver_flg");
		}
		return Hdr_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Hdr_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Hdr_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Hdr_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getHdr_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Hdr_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Hdr_itm_p_PPanel_Itm_itm_sub1_p = createHdr_itm_p_PPanel_Itm_itm_sub1_ListPutter(Hdr_itm_p_PPanel.Itm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3","unit_cd","unit_nm","dec_place","rnd_typ","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_rnd_typ","cont_fctr_dec_place","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","ver_flg");
		}
		return Hdr_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Hdr_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Hdr_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Hdr_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getHdr_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Hdr_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Hdr_itm_p_PPanel_Itm_itm_sub2_p = createHdr_itm_p_PPanel_Itm_itm_sub2_ListPutter(Hdr_itm_p_PPanel.Itm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3","unit_cd","unit_nm","dec_place","rnd_typ","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_rnd_typ","cont_fctr_dec_place","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","ver_flg");
		}
		return Hdr_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Hdr_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Hdr_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Hdr_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getHdr_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Hdr_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Hdr_itm_p_PPanel_Itm_itm_sub3_p = createHdr_itm_p_PPanel_Itm_itm_sub3_ListPutter(Hdr_itm_p_PPanel.Itm_itm_sub3, "itm_sub3", "itm_nm","unit_cd","unit_nm","dec_place","rnd_typ","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_rnd_typ","cont_fctr_dec_place","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","ver_flg");
		}
		return Hdr_itm_p_PPanel_Itm_itm_sub3_p;
	}
	
	
	/** [Hdr_strg_loc_cd_ListPutter]の定義 */
	private MCListPutter Hdr_strg_loc_cd_p = null;

	/**
	 * [Hdr_strg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_strg_loc_cd_ListPutter() {
		if (Hdr_strg_loc_cd_p == null) {
			Hdr_strg_loc_cd_p = createHdr_strg_loc_cd_ListPutter(Hdr_strg_loc_cd, "strg_loc_cd", "strg_loc_nm","strg_site_cd","strg_site_nm","wg_cd","wg_nm","strg_sppl_cd");

		}
		return Hdr_strg_loc_cd_p;
	}
	
	
	/** [Hdr_itm_ord_typ_ListPutter]の定義 */
	private MCListPutter Hdr_itm_ord_typ_p = null;

	/**
	 * [Hdr_itm_ord_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_itm_ord_typ_ListPutter() {
		if (Hdr_itm_ord_typ_p == null) {
			Hdr_itm_ord_typ_p = createHdr_itm_ord_typ_ListPutter(Hdr_itm_ord_typ, "itm_ord_typ", "itm_ord_typ_nm");

		}
		return Hdr_itm_ord_typ_p;
	}
	
	
	/** [Hdr_mfg_loc_cd_ListPutter]の定義 */
	private MCListPutter Hdr_mfg_loc_cd_p = null;

	/**
	 * [Hdr_mfg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_mfg_loc_cd_ListPutter() {
		if (Hdr_mfg_loc_cd_p == null) {
			Hdr_mfg_loc_cd_p = createHdr_mfg_loc_cd_ListPutter(Hdr_mfg_loc_cd, "mfg_loc_cd", "mfg_loc_nm","mfg_sppl_cd","mfg_maker_cd");

		}
		return Hdr_mfg_loc_cd_p;
	}
	
	
	/** [Hdr_bom_ptn_ListPutter]の定義 */
	private MCListPutter Hdr_bom_ptn_p = null;

	/**
	 * [Hdr_bom_ptn_ListPutter]の取得
	 */
	protected MCListPutter getHdr_bom_ptn_ListPutter() {
		if (Hdr_bom_ptn_p == null) {
			Hdr_bom_ptn_p = createHdr_bom_ptn_ListPutter(Hdr_bom_ptn, "bom_ptn", "rqst_wg_cd","rqst_wg_nm","oper_ptn","nmr_qty","dnm_qty","fxd_yield_qty");

		}
		return Hdr_bom_ptn_p;
	}
	
	
	/** [Hdr_sppl_cd_ListPutter]の定義 */
	private MCListPutter Hdr_sppl_cd_p = null;

	/**
	 * [Hdr_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_sppl_cd_ListPutter() {
		if (Hdr_sppl_cd_p == null) {
			Hdr_sppl_cd_p = createHdr_sppl_cd_ListPutter(Hdr_sppl_cd, "sppl_cd", "sppl_nm");

		}
		return Hdr_sppl_cd_p;
	}
	
	
	/** [Hdr_maker_cd_ListPutter]の定義 */
	private MCListPutter Hdr_maker_cd_p = null;

	/**
	 * [Hdr_maker_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_maker_cd_ListPutter() {
		if (Hdr_maker_cd_p == null) {
			Hdr_maker_cd_p = createHdr_maker_cd_ListPutter(Hdr_maker_cd, "maker_cd", "maker_nm","rqst_wg_cd","rqst_wg_nm");

		}
		return Hdr_maker_cd_p;
	}
	
	
	/** [Hdr_rqst_loc_cd_ListPutter]の定義 */
	private MCListPutter Hdr_rqst_loc_cd_p = null;

	/**
	 * [Hdr_rqst_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_rqst_loc_cd_ListPutter() {
		if (Hdr_rqst_loc_cd_p == null) {
			Hdr_rqst_loc_cd_p = createHdr_rqst_loc_cd_ListPutter(Hdr_rqst_loc_cd, "rqst_loc_cd", "rqst_loc_nm","rqst_wg_cd","rqst_wg_nm");

		}
		return Hdr_rqst_loc_cd_p;
	}
	
	
	/** [Hdr_oper_ptn_ListPutter]の定義 */
	private MCListPutter Hdr_oper_ptn_p = null;

	/**
	 * [Hdr_oper_ptn_ListPutter]の取得
	 */
	protected MCListPutter getHdr_oper_ptn_ListPutter() {
		if (Hdr_oper_ptn_p == null) {
			Hdr_oper_ptn_p = createHdr_oper_ptn_ListPutter(Hdr_oper_ptn, "oper_ptn");

		}
		return Hdr_oper_ptn_p;
	}
	
	
	/** [Dtl_oper_ord_sts_typ_ListPutter]の定義 */
	private MCListPutter Dtl_oper_ord_sts_typ_p = null;

	/**
	 * [Dtl_oper_ord_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_oper_ord_sts_typ_ListPutter() {
		if (Dtl_oper_ord_sts_typ_p == null) {
			Dtl_oper_ord_sts_typ_p = createDtl_oper_ord_sts_typ_ListPutter(columnDtl_oper_ord_sts_typ, "oper_ord_sts_typ", "oper_ord_sts_typ_nm");

		}
		return Dtl_oper_ord_sts_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_OrdReg create(){
		MSBCP_OrdReg p = new MSBCP_OrdReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_OrdReg create(String name){
		MSBCP_OrdReg p = new MSBCP_OrdReg(name);
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
		MSBCP_OrdReg_MC.jbfInitScreenOpe((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbfInitCnd((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbfInitTop((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbfInitHdrTab((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbfInitTab1((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbfInitTab2((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbfInitHdr((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbfInitSysInfo((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbfInitDtl((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbfInitBtn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbfInitEastBtn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbInitScreenOpe((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbInitCnd((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbInitTop((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbInitHdrTab((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbInitTab1((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbInitTab2((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbInitHdr((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbInitSysInfo((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbInitDtl((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbInitBtn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.jbInitEastBtn((MSBCP_OrdReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBCP_OrdReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBCP_OrdReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_SRCH = p.beansFactory.createRadioButton("Cnd.ope_SRCH");
		p.Cnd_itm_ord_no_Label = p.beansFactory.createLabel("Cnd.itm_ord_no_Label");
		p.Cnd_itm_ord_no = p.beansFactory.createTextField("Cnd.itm_ord_no");
		p.Cnd_itm_ord_no.setLabel(p.Cnd_itm_ord_no_Label);
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBCP_OrdReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBCP_OrdReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MSBCP_OrdReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBCP_OrdReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBCP_OrdReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_itm_ord_sts_typ_Label = p.beansFactory.createLabel("Hdr.itm_ord_sts_typ_Label");
		p.Hdr_itm_ord_sts_typ = p.beansFactory.createTextComboBox("Hdr.itm_ord_sts_typ");
		p.Hdr_itm_ord_sts_typ.setLabel(p.Hdr_itm_ord_sts_typ_Label);
		p.Hdr_itm_ord_sts_typ_nm = p.beansFactory.createTextField("Hdr.itm_ord_sts_typ_nm");
		p.Hdr_master_dt_Label = p.beansFactory.createLabel("Hdr.master_dt_Label");
		p.Hdr_master_dt = p.beansFactory.createDateField("Hdr.master_dt");
		p.Hdr_master_dt.setLabel(p.Hdr_master_dt_Label);
		p.Hdr_itm_ord_no_Label = p.beansFactory.createLabel("Hdr.itm_ord_no_Label");
		p.Hdr_itm_ord_no = p.beansFactory.createTextField("Hdr.itm_ord_no");
		p.Hdr_itm_ord_no.setLabel(p.Hdr_itm_ord_no_Label);
		p.Hdr_rqmt_no_Label = p.beansFactory.createLabel("Hdr.rqmt_no_Label");
		p.Hdr_rqmt_no = p.beansFactory.createTextField("Hdr.rqmt_no");
		p.Hdr_rqmt_no.setLabel(p.Hdr_rqmt_no_Label);
		p.Hdr_strg_loc_cd_Label = p.beansFactory.createLabel("Hdr.strg_loc_cd_Label");
		p.Hdr_strg_loc_cd = p.beansFactory.createTextField("Hdr.strg_loc_cd");
		p.Hdr_strg_loc_cd.setLabel(p.Hdr_strg_loc_cd_Label);
		p.Hdr_strg_loc_nm = p.beansFactory.createTextField("Hdr.strg_loc_nm");
		p.Hdr_strg_site_cd_Label = p.beansFactory.createLabel("Hdr.strg_site_cd_Label");
		p.Hdr_strg_site_cd = p.beansFactory.createTextField("Hdr.strg_site_cd");
		p.Hdr_strg_site_cd.setLabel(p.Hdr_strg_site_cd_Label);
		p.Hdr_strg_site_nm = p.beansFactory.createTextField("Hdr.strg_site_nm");
		p.Hdr_strg_sppl_cd = p.beansFactory.createTextField("Hdr.strg_sppl_cd");
		p.Hdr_wg_cd_Label = p.beansFactory.createLabel("Hdr.wg_cd_Label");
		p.Hdr_wg_cd = p.beansFactory.createTextField("Hdr.wg_cd");
		p.Hdr_wg_cd.setLabel(p.Hdr_wg_cd_Label);
		p.Hdr_wg_nm = p.beansFactory.createTextField("Hdr.wg_nm");
		p.Hdr_itm_ord_typ_Label = p.beansFactory.createLabel("Hdr.itm_ord_typ_Label");
		p.Hdr_itm_ord_typ = p.beansFactory.createTextComboBox("Hdr.itm_ord_typ");
		p.Hdr_itm_ord_typ.setLabel(p.Hdr_itm_ord_typ_Label);
		p.Hdr_itm_ord_typ_nm = p.beansFactory.createTextField("Hdr.itm_ord_typ_nm");
		p.Hdr_not_fix_flg = p.beansFactory.createCheckBox("Hdr.not_fix_flg");
		p.Hdr_mfg_flg = p.beansFactory.createCheckBox("Hdr.mfg_flg");
		p.Hdr_outsrc_flg = p.beansFactory.createCheckBox("Hdr.outsrc_flg");
		p.Hdr_mfg_loc_cd_Label = p.beansFactory.createLabel("Hdr.mfg_loc_cd_Label");
		p.Hdr_mfg_loc_cd = p.beansFactory.createTextComboBox("Hdr.mfg_loc_cd");
		p.Hdr_mfg_loc_cd.setLabel(p.Hdr_mfg_loc_cd_Label);
		p.Hdr_mfg_loc_nm = p.beansFactory.createTextField("Hdr.mfg_loc_nm");
		p.Hdr_mfg_sppl_cd = p.beansFactory.createTextField("Hdr.mfg_sppl_cd");
		p.Hdr_mfg_maker_cd = p.beansFactory.createTextField("Hdr.mfg_maker_cd");
		p.Hdr_bom_ptn_Label = p.beansFactory.createLabel("Hdr.bom_ptn_Label");
		p.Hdr_bom_ptn = p.beansFactory.createTextComboBox("Hdr.bom_ptn");
		p.Hdr_bom_ptn.setLabel(p.Hdr_bom_ptn_Label);
		p.Hdr_sppl_cd_Label = p.beansFactory.createLabel("Hdr.sppl_cd_Label");
		p.Hdr_sppl_cd = p.beansFactory.createTextComboBox("Hdr.sppl_cd");
		p.Hdr_sppl_cd.setLabel(p.Hdr_sppl_cd_Label);
		p.Hdr_sppl_nm = p.beansFactory.createTextField("Hdr.sppl_nm");
		p.Hdr_maker_cd_Label = p.beansFactory.createLabel("Hdr.maker_cd_Label");
		p.Hdr_maker_cd = p.beansFactory.createTextComboBox("Hdr.maker_cd");
		p.Hdr_maker_cd.setLabel(p.Hdr_maker_cd_Label);
		p.Hdr_maker_nm = p.beansFactory.createTextField("Hdr.maker_nm");
		p.Hdr_rqst_loc_cd_Label = p.beansFactory.createLabel("Hdr.rqst_loc_cd_Label");
		p.Hdr_rqst_loc_cd = p.beansFactory.createTextComboBox("Hdr.rqst_loc_cd");
		p.Hdr_rqst_loc_cd.setLabel(p.Hdr_rqst_loc_cd_Label);
		p.Hdr_rqst_loc_nm = p.beansFactory.createTextField("Hdr.rqst_loc_nm");
		p.Hdr_rqst_wg_cd_Label = p.beansFactory.createLabel("Hdr.rqst_wg_cd_Label");
		p.Hdr_rqst_wg_cd = p.beansFactory.createTextField("Hdr.rqst_wg_cd");
		p.Hdr_rqst_wg_cd.setLabel(p.Hdr_rqst_wg_cd_Label);
		p.Hdr_rqst_wg_nm = p.beansFactory.createTextField("Hdr.rqst_wg_nm");
		p.Hdr_nmr_qty_Label = p.beansFactory.createLabel("Hdr.nmr_qty_Label");
		p.Hdr_nmr_qty = p.beansFactory.createNumberField("Hdr.nmr_qty");
		p.Hdr_nmr_qty.setLabel(p.Hdr_nmr_qty_Label);
		p.Hdr_dnm_qty_Label = p.beansFactory.createLabel("Hdr.dnm_qty_Label");
		p.Hdr_dnm_qty = p.beansFactory.createNumberField("Hdr.dnm_qty");
		p.Hdr_dnm_qty.setLabel(p.Hdr_dnm_qty_Label);
		p.Hdr_fxd_yield_qty_Label = p.beansFactory.createLabel("Hdr.fxd_yield_qty_Label");
		p.Hdr_fxd_yield_qty = p.beansFactory.createNumberField("Hdr.fxd_yield_qty");
		p.Hdr_fxd_yield_qty.setLabel(p.Hdr_fxd_yield_qty_Label);
		p.Hdr_not_qty_rlt_flg = p.beansFactory.createCheckBox("Hdr.not_qty_rlt_flg");
		p.Hdr_unit_cd_Label = p.beansFactory.createLabel("Hdr.unit_cd_Label");
		p.Hdr_unit_cd = p.beansFactory.createTextField("Hdr.unit_cd");
		p.Hdr_unit_cd.setLabel(p.Hdr_unit_cd_Label);
		p.Hdr_unit_nm = p.beansFactory.createTextField("Hdr.unit_nm");
		p.Hdr_dec_place = p.beansFactory.createNumberField("Hdr.dec_place");
		p.Hdr_rnd_typ = p.beansFactory.createTextField("Hdr.rnd_typ");
		p.Hdr_cont_fctr_flg = p.beansFactory.createCheckBox("Hdr.cont_fctr_flg");
		p.Hdr_lmt_dt_Label = p.beansFactory.createLabel("Hdr.lmt_dt_Label");
		p.Hdr_lmt_dt = p.beansFactory.createDateField("Hdr.lmt_dt");
		p.Hdr_lmt_dt.setLabel(p.Hdr_lmt_dt_Label);
		p.Hdr_sno1_mng_typ = p.beansFactory.createTextField("Hdr.sno1_mng_typ");
		p.Hdr_sno2_mng_typ = p.beansFactory.createTextField("Hdr.sno2_mng_typ");
		p.Hdr_sno3_mng_typ = p.beansFactory.createTextField("Hdr.sno3_mng_typ");
		p.Hdr_sno4_mng_typ = p.beansFactory.createTextField("Hdr.sno4_mng_typ");
		p.Hdr_insp_flg = p.beansFactory.createCheckBox("Hdr.insp_flg");
		p.Hdr_po_schd_dt_Label = p.beansFactory.createLabel("Hdr.po_schd_dt_Label");
		p.Hdr_po_schd_dt = p.beansFactory.createDateField("Hdr.po_schd_dt");
		p.Hdr_po_schd_dt.setLabel(p.Hdr_po_schd_dt_Label);
		p.Hdr_mfg_st_schd_dt_Label = p.beansFactory.createLabel("Hdr.mfg_st_schd_dt_Label");
		p.Hdr_mfg_st_schd_dt = p.beansFactory.createDateField("Hdr.mfg_st_schd_dt");
		p.Hdr_mfg_st_schd_dt.setLabel(p.Hdr_mfg_st_schd_dt_Label);
		p.Hdr_mfg_end_schd_dt_Label = p.beansFactory.createLabel("Hdr.mfg_end_schd_dt_Label");
		p.Hdr_mfg_end_schd_dt = p.beansFactory.createDateField("Hdr.mfg_end_schd_dt");
		p.Hdr_mfg_end_schd_dt.setLabel(p.Hdr_mfg_end_schd_dt_Label);
		p.Hdr_gi_schd_dt_Label = p.beansFactory.createLabel("Hdr.gi_schd_dt_Label");
		p.Hdr_gi_schd_dt = p.beansFactory.createDateField("Hdr.gi_schd_dt");
		p.Hdr_gi_schd_dt.setLabel(p.Hdr_gi_schd_dt_Label);
		p.Hdr_strg_schd_dt_Label = p.beansFactory.createLabel("Hdr.strg_schd_dt_Label");
		p.Hdr_strg_schd_dt = p.beansFactory.createDateField("Hdr.strg_schd_dt");
		p.Hdr_strg_schd_dt.setLabel(p.Hdr_strg_schd_dt_Label);
		p.Hdr_accpt_schd_dt_Label = p.beansFactory.createLabel("Hdr.accpt_schd_dt_Label");
		p.Hdr_accpt_schd_dt = p.beansFactory.createDateField("Hdr.accpt_schd_dt");
		p.Hdr_accpt_schd_dt.setLabel(p.Hdr_accpt_schd_dt_Label);
		p.Hdr_insp_st_schd_dt_Label = p.beansFactory.createLabel("Hdr.insp_st_schd_dt_Label");
		p.Hdr_insp_st_schd_dt = p.beansFactory.createDateField("Hdr.insp_st_schd_dt");
		p.Hdr_insp_st_schd_dt.setLabel(p.Hdr_insp_st_schd_dt_Label);
		p.Hdr_insp_end_schd_dt_Label = p.beansFactory.createLabel("Hdr.insp_end_schd_dt_Label");
		p.Hdr_insp_end_schd_dt = p.beansFactory.createDateField("Hdr.insp_end_schd_dt");
		p.Hdr_insp_end_schd_dt.setLabel(p.Hdr_insp_end_schd_dt_Label);
		p.Hdr_avl_schd_dt_Label = p.beansFactory.createLabel("Hdr.avl_schd_dt_Label");
		p.Hdr_avl_schd_dt = p.beansFactory.createDateField("Hdr.avl_schd_dt");
		p.Hdr_avl_schd_dt.setLabel(p.Hdr_avl_schd_dt_Label);
		p.Hdr_sprt_lt = p.beansFactory.createButton("Hdr.sprt_lt");
		p.Hdr_oper_ptn_Label = p.beansFactory.createLabel("Hdr.oper_ptn_Label");
		p.Hdr_oper_ptn = p.beansFactory.createTextComboBox("Hdr.oper_ptn");
		p.Hdr_oper_ptn.setLabel(p.Hdr_oper_ptn_Label);
		p.Hdr_purc_lt_Label = p.beansFactory.createLabel("Hdr.purc_lt_Label");
		p.Hdr_purc_lt = p.beansFactory.createNumberField("Hdr.purc_lt");
		p.Hdr_purc_lt.setLabel(p.Hdr_purc_lt_Label);
		p.Hdr_mfg_lt_Label = p.beansFactory.createLabel("Hdr.mfg_lt_Label");
		p.Hdr_mfg_lt = p.beansFactory.createNumberField("Hdr.mfg_lt");
		p.Hdr_mfg_lt.setLabel(p.Hdr_mfg_lt_Label);
		p.Hdr_xfr_lt_Label = p.beansFactory.createLabel("Hdr.xfr_lt_Label");
		p.Hdr_xfr_lt = p.beansFactory.createNumberField("Hdr.xfr_lt");
		p.Hdr_xfr_lt.setLabel(p.Hdr_xfr_lt_Label);
		p.Hdr_accpt_insp_lt_Label = p.beansFactory.createLabel("Hdr.accpt_insp_lt_Label");
		p.Hdr_accpt_insp_lt = p.beansFactory.createNumberField("Hdr.accpt_insp_lt");
		p.Hdr_accpt_insp_lt.setLabel(p.Hdr_accpt_insp_lt_Label);
		p.Hdr_insp_lt_Label = p.beansFactory.createLabel("Hdr.insp_lt_Label");
		p.Hdr_insp_lt = p.beansFactory.createNumberField("Hdr.insp_lt");
		p.Hdr_insp_lt.setLabel(p.Hdr_insp_lt_Label);
		p.Hdr_insp_offst_Label = p.beansFactory.createLabel("Hdr.insp_offst_Label");
		p.Hdr_insp_offst = p.beansFactory.createNumberField("Hdr.insp_offst");
		p.Hdr_insp_offst.setLabel(p.Hdr_insp_offst_Label);
		p.Hdr_ord_fix_pd_Label = p.beansFactory.createLabel("Hdr.ord_fix_pd_Label");
		p.Hdr_ord_fix_pd = p.beansFactory.createNumberField("Hdr.ord_fix_pd");
		p.Hdr_ord_fix_pd.setLabel(p.Hdr_ord_fix_pd_Label);
		p.Hdr_cont_fctr_dec_place = p.beansFactory.createNumberField("Hdr.cont_fctr_dec_place");
		p.Hdr_cont_fctr_rnd_typ = p.beansFactory.createTextField("Hdr.cont_fctr_rnd_typ");
		p.Hdr_ver_flg = p.beansFactory.createCheckBox("Hdr.ver_flg");
		p.Hdr_inst_po_cnt_rmrks_Label = p.beansFactory.createLabel("Hdr.inst_po_cnt_rmrks_Label");
		p.Hdr_inst_po_cnt_rmrks = p.beansFactory.createTextField("Hdr.inst_po_cnt_rmrks");
		p.Hdr_inst_po_cnt_rmrks.setLabel(p.Hdr_inst_po_cnt_rmrks_Label);
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
		p.Hdr_ord_rcv_flg = p.beansFactory.createCheckBox("Hdr.ord_rcv_flg");
		p.Hdr_ord_snd_flg = p.beansFactory.createCheckBox("Hdr.ord_snd_flg");
		p.Hdr_ext_sys_cd_Label = p.beansFactory.createLabel("Hdr.ext_sys_cd_Label");
		p.Hdr_ext_sys_cd = p.beansFactory.createTextField("Hdr.ext_sys_cd");
		p.Hdr_ext_sys_cd.setLabel(p.Hdr_ext_sys_cd_Label);
		p.Hdr_ext_sys_nm_Label = p.beansFactory.createLabel("Hdr.ext_sys_nm_Label");
		p.Hdr_ext_sys_nm = p.beansFactory.createTextField("Hdr.ext_sys_nm");
		p.Hdr_ext_sys_nm.setLabel(p.Hdr_ext_sys_nm_Label);
		p.Hdr_ext_itm_ord_no_Label = p.beansFactory.createLabel("Hdr.ext_itm_ord_no_Label");
		p.Hdr_ext_itm_ord_no = p.beansFactory.createTextField("Hdr.ext_itm_ord_no");
		p.Hdr_ext_itm_ord_no.setLabel(p.Hdr_ext_itm_ord_no_Label);
		p.Hdr_for_scheduler_frozen_flg = p.beansFactory.createCheckBox("Hdr.for_scheduler_frozen_flg");
		p.Hdr_scheduler_frozen_flg = p.beansFactory.createCheckBox("Hdr.scheduler_frozen_flg");
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
	 * [SysInfo]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSysInfo(MSBCP_OrdReg p) {
		// ブロック関連の初期化
		p.SysInfoPanel = p.beansFactory.createPanel("SysInfo");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBCP_OrdReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_oper_ord_no = p.beansFactory.createTableColumn("Dtl.oper_ord_no", MCColumnType.TEXT);
		p.columnDtl_oper_ord_sts_typ = p.beansFactory.createTableColumn("Dtl.oper_ord_sts_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_oper_ord_sts_typ_nm = p.beansFactory.createTableColumn("Dtl.oper_ord_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtl_oper_cd = p.beansFactory.createTableColumn("Dtl.oper_cd", MCColumnType.TEXT);
		p.columnDtl_oper_nm = p.beansFactory.createTableColumn("Dtl.oper_nm", MCColumnType.TEXT);
		p.columnDtl_oper_seq = p.beansFactory.createTableColumn("Dtl.oper_seq", MCColumnType.NUMBER);
		p.columnDtl_loc_cd = p.beansFactory.createTableColumn("Dtl.loc_cd", MCColumnType.TEXT);
		p.columnDtl_loc_nm = p.beansFactory.createTableColumn("Dtl.loc_nm", MCColumnType.TEXT);
		p.columnDtl_disp_seq = p.beansFactory.createTableColumn("Dtl.disp_seq", MCColumnType.NUMBER);
		p.columnDtl_base_unit_cd = p.beansFactory.createTableColumn("Dtl.base_unit_cd", MCColumnType.TEXT);
		p.columnDtl_base_unit_nm = p.beansFactory.createTableColumn("Dtl.base_unit_nm", MCColumnType.TEXT);
		p.columnDtl_base_dec_place = p.beansFactory.createTableColumn("Dtl.base_dec_place", MCColumnType.NUMBER);
		p.columnDtl_oper_std_qty = p.beansFactory.createTableColumn("Dtl.oper_std_qty", MCColumnType.NUMBER);
		p.columnDtl_oper_conv_qty = p.beansFactory.createTableColumn("Dtl.oper_conv_qty", MCColumnType.NUMBER);
		p.columnDtl_dec_place = p.beansFactory.createTableColumn("Dtl.dec_place", MCColumnType.NUMBER);
		p.columnDtl_unit_conv_rnd_typ = p.beansFactory.createTableColumn("Dtl.unit_conv_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_oper_unit_cd = p.beansFactory.createTableColumn("Dtl.oper_unit_cd", MCColumnType.TEXT);
		p.columnDtl_oper_unit_nm = p.beansFactory.createTableColumn("Dtl.oper_unit_nm", MCColumnType.TEXT);
		p.columnDtl_yield_oper_flg = p.beansFactory.createTableColumn("Dtl.yield_oper_flg", MCColumnType.CHECK);
		p.columnDtl_oper_lt = p.beansFactory.createTableColumn("Dtl.oper_lt", MCColumnType.NUMBER);
		p.columnDtl_oper_offst_typ = p.beansFactory.createTableColumn("Dtl.oper_offst_typ", MCColumnType.TEXT);
		p.columnDtl_oper_offst_typ_nm = p.beansFactory.createTableColumn("Dtl.oper_offst_typ_nm", MCColumnType.TEXT);
		p.columnDtl_oper_offst = p.beansFactory.createTableColumn("Dtl.oper_offst", MCColumnType.NUMBER);
		p.columnDtl_oper_rsrc = p.beansFactory.createTableColumn("Dtl.oper_rsrc", MCColumnType.TEXT);
		p.columnDtl_intr_rmrks = p.beansFactory.createTableColumn("Dtl.intr_rmrks", MCColumnType.TEXT);
		p.columnDtl_sub_char1 = p.beansFactory.createTableColumn("Dtl.sub_char1", MCColumnType.TEXT);
		p.columnDtl_sub_char2 = p.beansFactory.createTableColumn("Dtl.sub_char2", MCColumnType.TEXT);
		p.columnDtl_sub_char3 = p.beansFactory.createTableColumn("Dtl.sub_char3", MCColumnType.TEXT);
		p.columnDtl_ext_oper_ord_no = p.beansFactory.createTableColumn("Dtl.ext_oper_ord_no", MCColumnType.TEXT);
		p.columnDtl_scheduler_frozen_flg = p.beansFactory.createTableColumn("Dtl.scheduler_frozen_flg", MCColumnType.CHECK);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBCP_OrdReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_sprt_expand_oper = p.beansFactory.createButton("Btn.sprt_expand_oper");
		p.Btn_upd_sav_all_oper = p.beansFactory.createButton("Btn.upd_sav_all_oper");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_upd2 = p.beansFactory.createButton("Btn.upd2", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBCP_OrdReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBCP_OrdReg p) {
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
	protected static void jbInitCnd(MSBCP_OrdReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.TopPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NWXC");
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
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_SRCH);
		p.Cnd_ope_SRCH.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_SRCH);
		p.ScreenOpePanel.add(p.Cnd_ope_SRCH);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0040.CndR.ope_META);
		p.CndPanel.add(p.Cnd_itm_ord_no_Label);
		p.CndPanel.add(p.Cnd_itm_ord_no);
		p.CndPanel.setLastBeans(p.Cnd_itm_ord_no);
		p.Cnd_itm_ord_no.setNextBeans(p.Cnd_srch);
		p.Cnd_itm_ord_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0040.CndR.itm_ord_no_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBCP_OrdReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.DtlPanel);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.HdrTabPanel, null);
		p.TopPanel.setLastBeans(p.HdrTabPanel);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBCP_OrdReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel.add(p.HdrTabTab);
		p.HdrTabPanel.setLastBeans(p.HdrTabTab);
		p.HdrTabPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.HdrTabTab.add(p.Tab1Panel, "HdrTab.tab1");
		p.HdrTabTab.setLastBeans(p.Tab1Panel);
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.HdrTabTab.add(p.Tab2Panel, "HdrTab.tab2");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MSBCP_OrdReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.HdrPanel, null);
		p.Tab1Panel.setLastBeans(p.HdrPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBCP_OrdReg p) {
		// ブロック関連の初期化
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.SysInfoPanel, null);
		p.Tab2Panel.setLastBeans(p.SysInfoPanel);
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBCP_OrdReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Hdr_itm_ord_sts_typ.setListType(MCListType.STRICT);
		p.Hdr_itm_ord_sts_typ.setLinkBeans(p.Hdr_itm_ord_sts_typ_nm);
		p.HdrPanel.add(p.Hdr_itm_ord_sts_typ_Label);
		p.HdrPanel.add(p.Hdr_itm_ord_sts_typ);
		p.HdrPanel.setLastBeans(p.Hdr_itm_ord_sts_typ);
		p.Hdr_itm_ord_sts_typ.setNextBeans(p.Hdr_itm_ord_sts_typ_nm);
		p.Hdr_itm_ord_sts_typ.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.itm_ord_sts_typ_META);
		p.HdrPanel.add(p.Hdr_itm_ord_sts_typ_nm);
		p.Hdr_itm_ord_sts_typ_nm.setNextBeans(p.Hdr_master_dt);
		p.Hdr_itm_ord_sts_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.itm_ord_sts_typ_nm_META);
		p.HdrPanel.add(p.Hdr_master_dt_Label);
		p.HdrPanel.add(p.Hdr_master_dt);
		p.Hdr_master_dt.setNextBeans(p.Hdr_itm_ord_no);
		p.Hdr_master_dt.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.master_dt_META);
		p.Hdr_master_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_itm_ord_no_Label);
		p.HdrPanel.add(p.Hdr_itm_ord_no);
		p.Hdr_itm_ord_no.setNextBeans(p.Hdr_rqmt_no);
		p.Hdr_itm_ord_no.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.itm_ord_no_META);
		p.HdrPanel.add(p.Hdr_rqmt_no_Label);
		p.HdrPanel.add(p.Hdr_rqmt_no);
		p.Hdr_rqmt_no.setNextBeans(p.Hdr_itm_p_PPanel);
		p.Hdr_rqmt_no.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.rqmt_no_META);
		p.HdrPanel.add(p.Hdr_itm_p_PPanel);
		p.Hdr_itm_p_PPanel.setNextBeans(p.Hdr_ver_no_p_PPanel);
		p.Hdr_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Hdr_itm_nm,p.Hdr_itm_sub1,p.Hdr_itm_sub2,p.Hdr_itm_sub3,p.Hdr_unit_cd,p.Hdr_unit_nm,p.Hdr_dec_place,p.Hdr_rnd_typ,p.Hdr_cont_fctr_flg,p.Hdr_std_cont_fctr,p.Hdr_cont_fctr_unit_cd,p.Hdr_cont_fctr_rnd_typ,p.Hdr_cont_fctr_dec_place,p.Hdr_sno1_mng_typ,p.Hdr_sno2_mng_typ,p.Hdr_sno3_mng_typ,p.Hdr_sno4_mng_typ,p.Hdr_ver_flg);
		p.Hdr_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Hdr_itm_nm,p.Hdr_itm_sub2,p.Hdr_itm_sub3,p.Hdr_unit_cd,p.Hdr_unit_nm,p.Hdr_dec_place,p.Hdr_rnd_typ,p.Hdr_cont_fctr_flg,p.Hdr_std_cont_fctr,p.Hdr_cont_fctr_unit_cd,p.Hdr_cont_fctr_rnd_typ,p.Hdr_cont_fctr_dec_place,p.Hdr_sno1_mng_typ,p.Hdr_sno2_mng_typ,p.Hdr_sno3_mng_typ,p.Hdr_sno4_mng_typ,p.Hdr_ver_flg);
		p.Hdr_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Hdr_itm_nm,p.Hdr_itm_sub3,p.Hdr_unit_cd,p.Hdr_unit_nm,p.Hdr_dec_place,p.Hdr_rnd_typ,p.Hdr_cont_fctr_flg,p.Hdr_std_cont_fctr,p.Hdr_cont_fctr_unit_cd,p.Hdr_cont_fctr_rnd_typ,p.Hdr_cont_fctr_dec_place,p.Hdr_sno1_mng_typ,p.Hdr_sno2_mng_typ,p.Hdr_sno3_mng_typ,p.Hdr_sno4_mng_typ,p.Hdr_ver_flg);
		p.Hdr_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Hdr_itm_nm,p.Hdr_unit_cd,p.Hdr_unit_nm,p.Hdr_dec_place,p.Hdr_rnd_typ,p.Hdr_cont_fctr_flg,p.Hdr_std_cont_fctr,p.Hdr_cont_fctr_unit_cd,p.Hdr_cont_fctr_rnd_typ,p.Hdr_cont_fctr_dec_place,p.Hdr_sno1_mng_typ,p.Hdr_sno2_mng_typ,p.Hdr_sno3_mng_typ,p.Hdr_sno4_mng_typ,p.Hdr_ver_flg);
		p.HdrPanel.add(p.Hdr_ver_no_p_PPanel);
		p.Hdr_ver_no_p_PPanel.setNextBeans(p.Hdr_strg_loc_cd);
		p.HdrPanel.add(p.Hdr_strg_loc_cd_Label);
		p.HdrPanel.add(p.Hdr_strg_loc_cd);
		p.Hdr_strg_loc_cd.setNextBeans(p.Hdr_strg_loc_nm);
		p.Hdr_strg_loc_cd.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.strg_loc_cd_META);
		p.Hdr_strg_loc_cd.addLinkBeans(p.Hdr_strg_loc_nm,p.Hdr_strg_site_cd,p.Hdr_strg_site_nm,p.Hdr_wg_cd,p.Hdr_wg_nm,p.Hdr_strg_sppl_cd);
		p.Hdr_strg_loc_cd.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_strg_loc_nm);
		p.Hdr_strg_loc_nm.setNextBeans(p.Hdr_strg_site_cd);
		p.Hdr_strg_loc_nm.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.strg_loc_nm_META);
		p.HdrPanel.add(p.Hdr_strg_site_cd_Label);
		p.HdrPanel.add(p.Hdr_strg_site_cd);
		p.Hdr_strg_site_cd.setNextBeans(p.Hdr_strg_site_nm);
		p.Hdr_strg_site_cd.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.strg_site_cd_META);
		p.HdrPanel.add(p.Hdr_strg_site_nm);
		p.Hdr_strg_site_nm.setNextBeans(p.Hdr_strg_sppl_cd);
		p.Hdr_strg_site_nm.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.strg_site_nm_META);
		p.HdrPanel.add(p.Hdr_strg_sppl_cd);
		p.Hdr_strg_sppl_cd.setNextBeans(p.Hdr_wg_cd);
		p.Hdr_strg_sppl_cd.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.strg_sppl_cd_META);
		p.HdrPanel.add(p.Hdr_wg_cd_Label);
		p.HdrPanel.add(p.Hdr_wg_cd);
		p.Hdr_wg_cd.setNextBeans(p.Hdr_wg_nm);
		p.Hdr_wg_cd.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.wg_cd_META);
		p.HdrPanel.add(p.Hdr_wg_nm);
		p.Hdr_wg_nm.setNextBeans(p.Hdr_itm_ord_typ);
		p.Hdr_wg_nm.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.wg_nm_META);
		p.Hdr_itm_ord_typ.setListType(MCListType.STRICT);
		p.Hdr_itm_ord_typ.setLinkBeans(p.Hdr_itm_ord_typ_nm);
		p.HdrPanel.add(p.Hdr_itm_ord_typ_Label);
		p.HdrPanel.add(p.Hdr_itm_ord_typ);
		p.Hdr_itm_ord_typ.setNextBeans(p.Hdr_itm_ord_typ_nm);
		p.Hdr_itm_ord_typ.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.itm_ord_typ_META);
		p.HdrPanel.add(p.Hdr_itm_ord_typ_nm);
		p.Hdr_itm_ord_typ_nm.setNextBeans(p.Hdr_not_fix_flg);
		p.Hdr_itm_ord_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.itm_ord_typ_nm_META);
		p.HdrPanel.add(p.Hdr_not_fix_flg);
		p.Hdr_not_fix_flg.setNextBeans(p.Hdr_mfg_flg);
		p.Hdr_not_fix_flg.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.not_fix_flg_META);
		p.HdrPanel.add(p.Hdr_mfg_flg);
		p.Hdr_mfg_flg.setNextBeans(p.Hdr_outsrc_flg);
		p.Hdr_mfg_flg.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.mfg_flg_META);
		p.HdrPanel.add(p.Hdr_outsrc_flg);
		p.Hdr_outsrc_flg.setNextBeans(p.Hdr_mfg_loc_cd);
		p.Hdr_outsrc_flg.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.outsrc_flg_META);
		p.Hdr_mfg_loc_cd.setListType(MCListType.STRICT);
		p.Hdr_mfg_loc_cd.setLinkBeans(p.Hdr_mfg_loc_nm,p.Hdr_mfg_sppl_cd,p.Hdr_mfg_maker_cd);
		p.HdrPanel.add(p.Hdr_mfg_loc_cd_Label);
		p.HdrPanel.add(p.Hdr_mfg_loc_cd);
		p.Hdr_mfg_loc_cd.setNextBeans(p.Hdr_mfg_loc_nm);
		p.Hdr_mfg_loc_cd.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.mfg_loc_cd_META);
		p.HdrPanel.add(p.Hdr_mfg_loc_nm);
		p.Hdr_mfg_loc_nm.setNextBeans(p.Hdr_mfg_sppl_cd);
		p.Hdr_mfg_loc_nm.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.mfg_loc_nm_META);
		p.HdrPanel.add(p.Hdr_mfg_sppl_cd);
		p.Hdr_mfg_sppl_cd.setNextBeans(p.Hdr_mfg_maker_cd);
		p.Hdr_mfg_sppl_cd.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.mfg_sppl_cd_META);
		p.HdrPanel.add(p.Hdr_mfg_maker_cd);
		p.Hdr_mfg_maker_cd.setNextBeans(p.Hdr_bom_ptn);
		p.Hdr_mfg_maker_cd.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.mfg_maker_cd_META);
		p.Hdr_bom_ptn.setListType(MCListType.STRICT);
		p.Hdr_bom_ptn.setLinkBeans(p.Hdr_rqst_wg_cd,p.Hdr_rqst_wg_nm,p.Hdr_oper_ptn,p.Hdr_nmr_qty,p.Hdr_dnm_qty,p.Hdr_fxd_yield_qty);
		p.HdrPanel.add(p.Hdr_bom_ptn_Label);
		p.HdrPanel.add(p.Hdr_bom_ptn);
		p.Hdr_bom_ptn.setNextBeans(p.Hdr_sppl_cd);
		p.Hdr_bom_ptn.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.bom_ptn_META);
		p.Hdr_sppl_cd.setListType(MCListType.STRICT);
		p.Hdr_sppl_cd.setLinkBeans(p.Hdr_sppl_nm);
		p.HdrPanel.add(p.Hdr_sppl_cd_Label);
		p.HdrPanel.add(p.Hdr_sppl_cd);
		p.Hdr_sppl_cd.setNextBeans(p.Hdr_sppl_nm);
		p.Hdr_sppl_cd.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.sppl_cd_META);
		p.HdrPanel.add(p.Hdr_sppl_nm);
		p.Hdr_sppl_nm.setNextBeans(p.Hdr_maker_cd);
		p.Hdr_sppl_nm.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.sppl_nm_META);
		p.Hdr_maker_cd.setListType(MCListType.STRICT);
		p.Hdr_maker_cd.setLinkBeans(p.Hdr_maker_nm,p.Hdr_rqst_wg_cd,p.Hdr_rqst_wg_nm);
		p.HdrPanel.add(p.Hdr_maker_cd_Label);
		p.HdrPanel.add(p.Hdr_maker_cd);
		p.Hdr_maker_cd.setNextBeans(p.Hdr_maker_nm);
		p.Hdr_maker_cd.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.maker_cd_META);
		p.HdrPanel.add(p.Hdr_maker_nm);
		p.Hdr_maker_nm.setNextBeans(p.Hdr_rqst_loc_cd);
		p.Hdr_maker_nm.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.maker_nm_META);
		p.Hdr_rqst_loc_cd.setListType(MCListType.STRICT);
		p.Hdr_rqst_loc_cd.setLinkBeans(p.Hdr_rqst_loc_nm,p.Hdr_rqst_wg_cd,p.Hdr_rqst_wg_nm);
		p.HdrPanel.add(p.Hdr_rqst_loc_cd_Label);
		p.HdrPanel.add(p.Hdr_rqst_loc_cd);
		p.Hdr_rqst_loc_cd.setNextBeans(p.Hdr_rqst_loc_nm);
		p.Hdr_rqst_loc_cd.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.rqst_loc_cd_META);
		p.HdrPanel.add(p.Hdr_rqst_loc_nm);
		p.Hdr_rqst_loc_nm.setNextBeans(p.Hdr_rqst_wg_cd);
		p.Hdr_rqst_loc_nm.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.rqst_loc_nm_META);
		p.HdrPanel.add(p.Hdr_rqst_wg_cd_Label);
		p.HdrPanel.add(p.Hdr_rqst_wg_cd);
		p.Hdr_rqst_wg_cd.setNextBeans(p.Hdr_rqst_wg_nm);
		p.Hdr_rqst_wg_cd.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.rqst_wg_cd_META);
		p.HdrPanel.add(p.Hdr_rqst_wg_nm);
		p.Hdr_rqst_wg_nm.setNextBeans(p.Hdr_nmr_qty);
		p.Hdr_rqst_wg_nm.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.rqst_wg_nm_META);
		p.HdrPanel.add(p.Hdr_nmr_qty_Label);
		p.HdrPanel.add(p.Hdr_nmr_qty);
		p.Hdr_nmr_qty.setNextBeans(p.Hdr_dnm_qty);
		p.Hdr_nmr_qty.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.nmr_qty_META);
		p.HdrPanel.add(p.Hdr_dnm_qty_Label);
		p.HdrPanel.add(p.Hdr_dnm_qty);
		p.Hdr_dnm_qty.setNextBeans(p.Hdr_fxd_yield_qty);
		p.Hdr_dnm_qty.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.dnm_qty_META);
		p.HdrPanel.add(p.Hdr_fxd_yield_qty_Label);
		p.HdrPanel.add(p.Hdr_fxd_yield_qty);
		p.Hdr_fxd_yield_qty.setNextBeans(p.Hdr_not_qty_rlt_flg);
		p.Hdr_fxd_yield_qty.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.fxd_yield_qty_META);
		p.HdrPanel.add(p.Hdr_not_qty_rlt_flg);
		p.Hdr_not_qty_rlt_flg.setNextBeans(p.Hdr_inst_qty_p_PPanel);
		p.Hdr_not_qty_rlt_flg.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.not_qty_rlt_flg_META);
		p.HdrPanel.add(p.Hdr_inst_qty_p_PPanel);
		p.Hdr_inst_qty_p_PPanel.setNextBeans(p.Hdr_yield_schd_qty_p_PPanel);
		p.HdrPanel.add(p.Hdr_yield_schd_qty_p_PPanel);
		p.Hdr_yield_schd_qty_p_PPanel.setNextBeans(p.Hdr_unit_cd);
		p.HdrPanel.add(p.Hdr_unit_cd_Label);
		p.HdrPanel.add(p.Hdr_unit_cd);
		p.Hdr_unit_cd.setNextBeans(p.Hdr_unit_nm);
		p.Hdr_unit_cd.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.unit_cd_META);
		p.HdrPanel.add(p.Hdr_unit_nm);
		p.Hdr_unit_nm.setNextBeans(p.Hdr_dec_place);
		p.Hdr_unit_nm.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.unit_nm_META);
		p.HdrPanel.add(p.Hdr_dec_place);
		p.Hdr_dec_place.setNextBeans(p.Hdr_rnd_typ);
		p.Hdr_dec_place.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.dec_place_META);
		p.HdrPanel.add(p.Hdr_rnd_typ);
		p.Hdr_rnd_typ.setNextBeans(p.Hdr_cont_fctr_flg);
		p.Hdr_rnd_typ.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.rnd_typ_META);
		p.HdrPanel.add(p.Hdr_cont_fctr_flg);
		p.Hdr_cont_fctr_flg.setNextBeans(p.Hdr_lmt_dt);
		p.Hdr_cont_fctr_flg.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.cont_fctr_flg_META);
		p.HdrPanel.add(p.Hdr_lmt_dt_Label);
		p.HdrPanel.add(p.Hdr_lmt_dt);
		p.Hdr_lmt_dt.setNextBeans(p.Hdr_sno_wrk_no_p_PPanel);
		p.Hdr_lmt_dt.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.lmt_dt_META);
		p.Hdr_lmt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_sno_wrk_no_p_PPanel);
		p.Hdr_sno_wrk_no_p_PPanel.setNextBeans(p.Hdr_sno1_mng_typ);
		p.HdrPanel.add(p.Hdr_sno1_mng_typ);
		p.Hdr_sno1_mng_typ.setNextBeans(p.Hdr_sno2_mng_typ);
		p.Hdr_sno1_mng_typ.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.sno1_mng_typ_META);
		p.HdrPanel.add(p.Hdr_sno2_mng_typ);
		p.Hdr_sno2_mng_typ.setNextBeans(p.Hdr_sno3_mng_typ);
		p.Hdr_sno2_mng_typ.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.sno2_mng_typ_META);
		p.HdrPanel.add(p.Hdr_sno3_mng_typ);
		p.Hdr_sno3_mng_typ.setNextBeans(p.Hdr_sno4_mng_typ);
		p.Hdr_sno3_mng_typ.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.sno3_mng_typ_META);
		p.HdrPanel.add(p.Hdr_sno4_mng_typ);
		p.Hdr_sno4_mng_typ.setNextBeans(p.Hdr_insp_flg);
		p.Hdr_sno4_mng_typ.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.sno4_mng_typ_META);
		p.HdrPanel.add(p.Hdr_insp_flg);
		p.Hdr_insp_flg.setNextBeans(p.Hdr_po_schd_dt);
		p.Hdr_insp_flg.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.insp_flg_META);
		p.HdrPanel.add(p.Hdr_po_schd_dt_Label);
		p.HdrPanel.add(p.Hdr_po_schd_dt);
		p.Hdr_po_schd_dt.setNextBeans(p.Hdr_mfg_st_schd_dt);
		p.Hdr_po_schd_dt.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.po_schd_dt_META);
		p.Hdr_po_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_mfg_st_schd_dt_Label);
		p.HdrPanel.add(p.Hdr_mfg_st_schd_dt);
		p.Hdr_mfg_st_schd_dt.setNextBeans(p.Hdr_mfg_end_schd_dt);
		p.Hdr_mfg_st_schd_dt.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.mfg_st_schd_dt_META);
		p.Hdr_mfg_st_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_mfg_end_schd_dt_Label);
		p.HdrPanel.add(p.Hdr_mfg_end_schd_dt);
		p.Hdr_mfg_end_schd_dt.setNextBeans(p.Hdr_gi_schd_dt);
		p.Hdr_mfg_end_schd_dt.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.mfg_end_schd_dt_META);
		p.Hdr_mfg_end_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_gi_schd_dt_Label);
		p.HdrPanel.add(p.Hdr_gi_schd_dt);
		p.Hdr_gi_schd_dt.setNextBeans(p.Hdr_strg_schd_dt);
		p.Hdr_gi_schd_dt.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.gi_schd_dt_META);
		p.Hdr_gi_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_strg_schd_dt_Label);
		p.HdrPanel.add(p.Hdr_strg_schd_dt);
		p.Hdr_strg_schd_dt.setNextBeans(p.Hdr_accpt_schd_dt);
		p.Hdr_strg_schd_dt.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.strg_schd_dt_META);
		p.Hdr_strg_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_accpt_schd_dt_Label);
		p.HdrPanel.add(p.Hdr_accpt_schd_dt);
		p.Hdr_accpt_schd_dt.setNextBeans(p.Hdr_insp_st_schd_dt);
		p.Hdr_accpt_schd_dt.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.accpt_schd_dt_META);
		p.Hdr_accpt_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_insp_st_schd_dt_Label);
		p.HdrPanel.add(p.Hdr_insp_st_schd_dt);
		p.Hdr_insp_st_schd_dt.setNextBeans(p.Hdr_insp_end_schd_dt);
		p.Hdr_insp_st_schd_dt.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.insp_st_schd_dt_META);
		p.Hdr_insp_st_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_insp_end_schd_dt_Label);
		p.HdrPanel.add(p.Hdr_insp_end_schd_dt);
		p.Hdr_insp_end_schd_dt.setNextBeans(p.Hdr_avl_schd_dt);
		p.Hdr_insp_end_schd_dt.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.insp_end_schd_dt_META);
		p.Hdr_insp_end_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.HdrPanel.add(p.Hdr_avl_schd_dt_Label);
		p.HdrPanel.add(p.Hdr_avl_schd_dt);
		p.Hdr_avl_schd_dt.setNextBeans(p.Hdr_sprt_lt);
		p.Hdr_avl_schd_dt.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.avl_schd_dt_META);
		p.Hdr_avl_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Hdr_sprt_lt.setFunctionKey(MCFunctionKey.F7);
		p.HdrPanel.add(p.Hdr_sprt_lt);
		p.Hdr_sprt_lt.setNextBeans(p.Hdr_oper_ptn);
		p.Hdr_oper_ptn.setListType(MCListType.FREE);
		p.HdrPanel.add(p.Hdr_oper_ptn_Label);
		p.HdrPanel.add(p.Hdr_oper_ptn);
		p.Hdr_oper_ptn.setNextBeans(p.Hdr_purc_lt);
		p.Hdr_oper_ptn.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.oper_ptn_META);
		p.HdrPanel.add(p.Hdr_purc_lt_Label);
		p.HdrPanel.add(p.Hdr_purc_lt);
		p.Hdr_purc_lt.setNextBeans(p.Hdr_mfg_lt);
		p.Hdr_purc_lt.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.purc_lt_META);
		p.HdrPanel.add(p.Hdr_mfg_lt_Label);
		p.HdrPanel.add(p.Hdr_mfg_lt);
		p.Hdr_mfg_lt.setNextBeans(p.Hdr_xfr_lt);
		p.Hdr_mfg_lt.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.mfg_lt_META);
		p.HdrPanel.add(p.Hdr_xfr_lt_Label);
		p.HdrPanel.add(p.Hdr_xfr_lt);
		p.Hdr_xfr_lt.setNextBeans(p.Hdr_accpt_insp_lt);
		p.Hdr_xfr_lt.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.xfr_lt_META);
		p.HdrPanel.add(p.Hdr_accpt_insp_lt_Label);
		p.HdrPanel.add(p.Hdr_accpt_insp_lt);
		p.Hdr_accpt_insp_lt.setNextBeans(p.Hdr_insp_lt);
		p.Hdr_accpt_insp_lt.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.accpt_insp_lt_META);
		p.HdrPanel.add(p.Hdr_insp_lt_Label);
		p.HdrPanel.add(p.Hdr_insp_lt);
		p.Hdr_insp_lt.setNextBeans(p.Hdr_insp_offst);
		p.Hdr_insp_lt.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.insp_lt_META);
		p.HdrPanel.add(p.Hdr_insp_offst_Label);
		p.HdrPanel.add(p.Hdr_insp_offst);
		p.Hdr_insp_offst.setNextBeans(p.Hdr_ord_fix_pd);
		p.Hdr_insp_offst.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.insp_offst_META);
		p.HdrPanel.add(p.Hdr_ord_fix_pd_Label);
		p.HdrPanel.add(p.Hdr_ord_fix_pd);
		p.Hdr_ord_fix_pd.setNextBeans(p.Hdr_inst_cont_qty_p_PPanel);
		p.Hdr_ord_fix_pd.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.ord_fix_pd_META);
		p.HdrPanel.add(p.Hdr_inst_cont_qty_p_PPanel);
		p.Hdr_inst_cont_qty_p_PPanel.setNextBeans(p.Hdr_yield_cont_qty_p_PPanel);
		p.HdrPanel.add(p.Hdr_yield_cont_qty_p_PPanel);
		p.Hdr_yield_cont_qty_p_PPanel.setNextBeans(p.Hdr_cont_unit_p_PPanel);
		p.HdrPanel.add(p.Hdr_cont_unit_p_PPanel);
		p.Hdr_cont_unit_p_PPanel.setNextBeans(p.Hdr_std_cont_p_PPanel);
		p.HdrPanel.add(p.Hdr_std_cont_p_PPanel);
		p.Hdr_std_cont_p_PPanel.setNextBeans(p.Hdr_cont_fctr_dec_place);
		p.HdrPanel.add(p.Hdr_cont_fctr_dec_place);
		p.Hdr_cont_fctr_dec_place.setNextBeans(p.Hdr_cont_fctr_rnd_typ);
		p.Hdr_cont_fctr_dec_place.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.cont_fctr_dec_place_META);
		p.HdrPanel.add(p.Hdr_cont_fctr_rnd_typ);
		p.Hdr_cont_fctr_rnd_typ.setNextBeans(p.Hdr_ver_flg);
		p.Hdr_cont_fctr_rnd_typ.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.cont_fctr_rnd_typ_META);
		p.HdrPanel.add(p.Hdr_ver_flg);
		p.Hdr_ver_flg.setNextBeans(p.Hdr_inst_po_cnt_rmrks);
		p.Hdr_ver_flg.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.ver_flg_META);
		p.HdrPanel.add(p.Hdr_inst_po_cnt_rmrks_Label);
		p.HdrPanel.add(p.Hdr_inst_po_cnt_rmrks);
		p.Hdr_inst_po_cnt_rmrks.setNextBeans(p.Hdr_intr_rmrks);
		p.Hdr_inst_po_cnt_rmrks.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.inst_po_cnt_rmrks_META);
		p.HdrPanel.add(p.Hdr_intr_rmrks_Label);
		p.HdrPanel.add(p.Hdr_intr_rmrks);
		p.Hdr_intr_rmrks.setNextBeans(p.Hdr_sub_char1);
		p.Hdr_intr_rmrks.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.intr_rmrks_META);
		p.HdrPanel.add(p.Hdr_sub_char1_Label);
		p.HdrPanel.add(p.Hdr_sub_char1);
		p.Hdr_sub_char1.setNextBeans(p.Hdr_sub_char2);
		p.Hdr_sub_char1.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.sub_char1_META);
		p.HdrPanel.add(p.Hdr_sub_char2_Label);
		p.HdrPanel.add(p.Hdr_sub_char2);
		p.Hdr_sub_char2.setNextBeans(p.Hdr_sub_char3);
		p.Hdr_sub_char2.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.sub_char2_META);
		p.HdrPanel.add(p.Hdr_sub_char3_Label);
		p.HdrPanel.add(p.Hdr_sub_char3);
		p.Hdr_sub_char3.setNextBeans(p.Hdr_ord_rcv_flg);
		p.Hdr_sub_char3.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.sub_char3_META);
		p.HdrPanel.add(p.Hdr_ord_rcv_flg);
		p.Hdr_ord_rcv_flg.setNextBeans(p.Hdr_ord_snd_flg);
		p.Hdr_ord_rcv_flg.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.ord_rcv_flg_META);
		p.HdrPanel.add(p.Hdr_ord_snd_flg);
		p.Hdr_ord_snd_flg.setNextBeans(p.Hdr_ext_sys_cd);
		p.Hdr_ord_snd_flg.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.ord_snd_flg_META);
		p.HdrPanel.add(p.Hdr_ext_sys_cd_Label);
		p.HdrPanel.add(p.Hdr_ext_sys_cd);
		p.Hdr_ext_sys_cd.setNextBeans(p.Hdr_ext_sys_nm);
		p.Hdr_ext_sys_cd.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.ext_sys_cd_META);
		p.HdrPanel.add(p.Hdr_ext_sys_nm_Label);
		p.HdrPanel.add(p.Hdr_ext_sys_nm);
		p.Hdr_ext_sys_nm.setNextBeans(p.Hdr_ext_itm_ord_no);
		p.Hdr_ext_sys_nm.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.ext_sys_nm_META);
		p.HdrPanel.add(p.Hdr_ext_itm_ord_no_Label);
		p.HdrPanel.add(p.Hdr_ext_itm_ord_no);
		p.Hdr_ext_itm_ord_no.setNextBeans(p.Hdr_for_scheduler_frozen_flg);
		p.Hdr_ext_itm_ord_no.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.ext_itm_ord_no_META);
		p.HdrPanel.add(p.Hdr_for_scheduler_frozen_flg);
		p.Hdr_for_scheduler_frozen_flg.setNextBeans(p.Hdr_scheduler_frozen_flg);
		p.Hdr_for_scheduler_frozen_flg.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.for_scheduler_frozen_flg_META);
		p.HdrPanel.add(p.Hdr_scheduler_frozen_flg);
		p.Hdr_scheduler_frozen_flg.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.scheduler_frozen_flg_META);
		p.SysInfoPanel.add(p.Hdr_ins_usr_id_Label);
		p.SysInfoPanel.add(p.Hdr_ins_usr_id);
		p.SysInfoPanel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.ins_usr_id_META);
		p.SysInfoPanel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.ins_usr_nm_META);
		p.SysInfoPanel.add(p.Hdr_ins_func_id_Label);
		p.SysInfoPanel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.ins_func_id_META);
		p.SysInfoPanel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.ins_func_nm_META);
		p.SysInfoPanel.add(p.Hdr_upd_usr_id_Label);
		p.SysInfoPanel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.upd_usr_id_META);
		p.SysInfoPanel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.upd_usr_nm_META);
		p.SysInfoPanel.add(p.Hdr_upd_func_id_Label);
		p.SysInfoPanel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.upd_func_id_META);
		p.SysInfoPanel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.upd_func_nm_META);
		p.SysInfoPanel.add(p.Hdr_ins_ts_Label);
		p.SysInfoPanel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.SysInfoPanel.add(p.Hdr_upd_ts_Label);
		p.SysInfoPanel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.SysInfoPanel.add(p.Hdr_upd_srv_req_no_Label);
		p.SysInfoPanel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBC.MSBCP0040.HdrR.upd_srv_req_no_META);
	}

	/**
	 * [SysInfo]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSysInfo(MSBCP_OrdReg p) {
		// ブロック関連の初期化
		p.SysInfoPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBCP_OrdReg p) {
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
	protected static void jbInitBtn(MSBCP_OrdReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_sprt_expand_oper.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_sprt_expand_oper);
		p.BtnPanel.setLastBeans(p.Btn_sprt_expand_oper);
		p.Btn_sprt_expand_oper.setNextBeans(p.Btn_upd_sav_all_oper);
		p.Btn_upd_sav_all_oper.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_upd_sav_all_oper);
		p.Btn_upd_sav_all_oper.setNextBeans(p.Btn_rdel);
		p.Btn_rdel.setIcon("DELETE_RECORD");
		p.Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_rdel);
		p.Btn_rdel.setNextBeans(p.Btn_rcopy);
		p.Btn_rcopy.setIcon("COPY_RECORD");
		p.Btn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.BtnPanel.add(p.Btn_rcopy);
		p.Btn_rcopy.setNextBeans(p.Btn_ins);
		p.Btn_ins.setIcon("REGISTER");
		p.Btn_ins.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins);
		p.Btn_ins.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_upd.setNextBeans(p.Btn_upd2);
		p.Btn_upd2.setIcon("REGISTER");
		p.Btn_upd2.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd2);
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBCP_OrdReg p) {
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
		MSBCP_OrdReg_MC.mcInitScreenOpe((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.mcInitCnd((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.mcInitTop((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.mcInitHdrTab((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.mcInitTab1((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.mcInitTab2((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.mcInitHdr((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.mcInitSysInfo((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.mcInitDtl((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.mcInitBtn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.mcInitEastBtn((MSBCP_OrdReg)this);

		// [INS]ステータスのモードの設定
		MSBCP_OrdReg_MC.statusInitINS_ScreenOpe((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS_Cnd((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS_Top((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS_HdrTab((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS_Tab1((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS_Tab2((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS_Hdr((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS_SysInfo((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS_Dtl((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS_Btn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS_EastBtn((MSBCP_OrdReg)this);

		// [INS_NONE]ステータスのモードの設定
		MSBCP_OrdReg_MC.statusInitINS__NONE_ScreenOpe((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__NONE_Cnd((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__NONE_Top((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__NONE_HdrTab((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__NONE_Tab1((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__NONE_Tab2((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__NONE_Hdr((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__NONE_SysInfo((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__NONE_Dtl((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__NONE_Btn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__NONE_EastBtn((MSBCP_OrdReg)this);

		// [INS_MFG]ステータスのモードの設定
		MSBCP_OrdReg_MC.statusInitINS__MFG_ScreenOpe((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__MFG_Cnd((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__MFG_Top((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__MFG_HdrTab((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__MFG_Tab1((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__MFG_Tab2((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__MFG_Hdr((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__MFG_SysInfo((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__MFG_Dtl((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__MFG_Btn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__MFG_EastBtn((MSBCP_OrdReg)this);

		// [INS_PURC]ステータスのモードの設定
		MSBCP_OrdReg_MC.statusInitINS__PURC_ScreenOpe((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__PURC_Cnd((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__PURC_Top((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__PURC_HdrTab((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__PURC_Tab1((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__PURC_Tab2((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__PURC_Hdr((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__PURC_SysInfo((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__PURC_Dtl((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__PURC_Btn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__PURC_EastBtn((MSBCP_OrdReg)this);

		// [INS_OUTSRC]ステータスのモードの設定
		MSBCP_OrdReg_MC.statusInitINS__OUTSRC_ScreenOpe((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__OUTSRC_Cnd((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__OUTSRC_Top((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__OUTSRC_HdrTab((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__OUTSRC_Tab1((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__OUTSRC_Tab2((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__OUTSRC_Hdr((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__OUTSRC_SysInfo((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__OUTSRC_Dtl((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__OUTSRC_Btn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__OUTSRC_EastBtn((MSBCP_OrdReg)this);

		// [INS_XFR]ステータスのモードの設定
		MSBCP_OrdReg_MC.statusInitINS__XFR_ScreenOpe((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__XFR_Cnd((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__XFR_Top((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__XFR_HdrTab((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__XFR_Tab1((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__XFR_Tab2((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__XFR_Hdr((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__XFR_SysInfo((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__XFR_Dtl((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__XFR_Btn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__XFR_EastBtn((MSBCP_OrdReg)this);

		// [INS_WG_XFR]ステータスのモードの設定
		MSBCP_OrdReg_MC.statusInitINS__WG__XFR_ScreenOpe((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__WG__XFR_Cnd((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__WG__XFR_Top((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__WG__XFR_HdrTab((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__WG__XFR_Tab1((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__WG__XFR_Tab2((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__WG__XFR_Hdr((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__WG__XFR_SysInfo((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__WG__XFR_Dtl((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__WG__XFR_Btn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitINS__WG__XFR_EastBtn((MSBCP_OrdReg)this);

		// [UPD]ステータスのモードの設定
		MSBCP_OrdReg_MC.statusInitUPD_ScreenOpe((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD_Cnd((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD_Top((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD_HdrTab((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD_Tab1((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD_Tab2((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD_Hdr((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD_SysInfo((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD_Dtl((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD_Btn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD_EastBtn((MSBCP_OrdReg)this);

		// [UPD_NONE]ステータスのモードの設定
		MSBCP_OrdReg_MC.statusInitUPD__NONE_ScreenOpe((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__NONE_Cnd((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__NONE_Top((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__NONE_HdrTab((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__NONE_Tab1((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__NONE_Tab2((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__NONE_Hdr((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__NONE_SysInfo((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__NONE_Dtl((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__NONE_Btn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__NONE_EastBtn((MSBCP_OrdReg)this);

		// [UPD_MFG]ステータスのモードの設定
		MSBCP_OrdReg_MC.statusInitUPD__MFG_ScreenOpe((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__MFG_Cnd((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__MFG_Top((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__MFG_HdrTab((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__MFG_Tab1((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__MFG_Tab2((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__MFG_Hdr((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__MFG_SysInfo((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__MFG_Dtl((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__MFG_Btn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__MFG_EastBtn((MSBCP_OrdReg)this);

		// [UPD_PURC]ステータスのモードの設定
		MSBCP_OrdReg_MC.statusInitUPD__PURC_ScreenOpe((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__PURC_Cnd((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__PURC_Top((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__PURC_HdrTab((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__PURC_Tab1((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__PURC_Tab2((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__PURC_Hdr((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__PURC_SysInfo((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__PURC_Dtl((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__PURC_Btn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__PURC_EastBtn((MSBCP_OrdReg)this);

		// [UPD_OUTSRC]ステータスのモードの設定
		MSBCP_OrdReg_MC.statusInitUPD__OUTSRC_ScreenOpe((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__OUTSRC_Cnd((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__OUTSRC_Top((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__OUTSRC_HdrTab((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__OUTSRC_Tab1((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__OUTSRC_Tab2((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__OUTSRC_Hdr((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__OUTSRC_SysInfo((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__OUTSRC_Dtl((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__OUTSRC_Btn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__OUTSRC_EastBtn((MSBCP_OrdReg)this);

		// [UPD_XFR]ステータスのモードの設定
		MSBCP_OrdReg_MC.statusInitUPD__XFR_ScreenOpe((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__XFR_Cnd((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__XFR_Top((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__XFR_HdrTab((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__XFR_Tab1((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__XFR_Tab2((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__XFR_Hdr((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__XFR_SysInfo((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__XFR_Dtl((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__XFR_Btn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__XFR_EastBtn((MSBCP_OrdReg)this);

		// [UPD_WG_XFR]ステータスのモードの設定
		MSBCP_OrdReg_MC.statusInitUPD__WG__XFR_ScreenOpe((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__WG__XFR_Cnd((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__WG__XFR_Top((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__WG__XFR_HdrTab((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__WG__XFR_Tab1((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__WG__XFR_Tab2((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__WG__XFR_Hdr((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__WG__XFR_SysInfo((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__WG__XFR_Dtl((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__WG__XFR_Btn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__WG__XFR_EastBtn((MSBCP_OrdReg)this);

		// [UPD_CANFIX]ステータスのモードの設定
		MSBCP_OrdReg_MC.statusInitUPD__CANFIX_ScreenOpe((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__CANFIX_Cnd((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__CANFIX_Top((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__CANFIX_HdrTab((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__CANFIX_Tab1((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__CANFIX_Tab2((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__CANFIX_Hdr((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__CANFIX_SysInfo((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__CANFIX_Dtl((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__CANFIX_Btn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitUPD__CANFIX_EastBtn((MSBCP_OrdReg)this);

		// [DEL]ステータスのモードの設定
		MSBCP_OrdReg_MC.statusInitDEL_ScreenOpe((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitDEL_Cnd((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitDEL_Top((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitDEL_HdrTab((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitDEL_Tab1((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitDEL_Tab2((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitDEL_Hdr((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitDEL_SysInfo((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitDEL_Dtl((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitDEL_Btn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitDEL_EastBtn((MSBCP_OrdReg)this);

		// [FIX_I]ステータスのモードの設定
		MSBCP_OrdReg_MC.statusInitFIX__I_ScreenOpe((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__I_Cnd((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__I_Top((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__I_HdrTab((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__I_Tab1((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__I_Tab2((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__I_Hdr((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__I_SysInfo((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__I_Dtl((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__I_Btn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__I_EastBtn((MSBCP_OrdReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBCP_OrdReg_MC.statusInitFIX__U_ScreenOpe((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__U_Cnd((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__U_Top((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__U_HdrTab((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__U_Tab1((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__U_Tab2((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__U_Hdr((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__U_SysInfo((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__U_Dtl((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__U_Btn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__U_EastBtn((MSBCP_OrdReg)this);

		// [FIX_D]ステータスのモードの設定
		MSBCP_OrdReg_MC.statusInitFIX__D_ScreenOpe((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__D_Cnd((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__D_Top((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__D_HdrTab((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__D_Tab1((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__D_Tab2((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__D_Hdr((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__D_SysInfo((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__D_Dtl((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__D_Btn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitFIX__D_EastBtn((MSBCP_OrdReg)this);

		// [SRCH]ステータスのモードの設定
		MSBCP_OrdReg_MC.statusInitSRCH_ScreenOpe((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitSRCH_Cnd((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitSRCH_Top((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitSRCH_HdrTab((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitSRCH_Tab1((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitSRCH_Tab2((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitSRCH_Hdr((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitSRCH_SysInfo((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitSRCH_Dtl((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitSRCH_Btn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitSRCH_EastBtn((MSBCP_OrdReg)this);

		// [REF]ステータスのモードの設定
		MSBCP_OrdReg_MC.statusInitREF_ScreenOpe((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitREF_Cnd((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitREF_Top((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitREF_HdrTab((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitREF_Tab1((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitREF_Tab2((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitREF_Hdr((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitREF_SysInfo((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitREF_Dtl((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitREF_Btn((MSBCP_OrdReg)this);
		MSBCP_OrdReg_MC.statusInitREF_EastBtn((MSBCP_OrdReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBCP_OrdReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBCP_OrdReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_SRCH.addAllListener(p);
		p.Cnd_itm_ord_no.setListListener(p);
		p.Cnd_itm_ord_no.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBCP_OrdReg p) {
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBCP_OrdReg p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBCP_OrdReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBCP_OrdReg p) {
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBCP_OrdReg p) {
		p.Hdr_itm_ord_sts_typ.setListListener(p);
		p.Hdr_itm_ord_sts_typ.addAllListener(p);
		p.Hdr_itm_ord_sts_typ_nm.setListListener(p);
		p.Hdr_itm_ord_sts_typ_nm.addAllListener(p);
		p.Hdr_master_dt.setListListener(p);
		p.Hdr_master_dt.addAllListener(p);
		p.Hdr_itm_ord_no.setListListener(p);
		p.Hdr_itm_ord_no.addAllListener(p);
		p.Hdr_rqmt_no.setListListener(p);
		p.Hdr_rqmt_no.addAllListener(p);
		p.Hdr_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_strg_loc_cd.setListListener(p);
		p.Hdr_strg_loc_cd.addAllListener(p);
		p.Hdr_strg_loc_nm.setListListener(p);
		p.Hdr_strg_loc_nm.addAllListener(p);
		p.Hdr_strg_site_cd.setListListener(p);
		p.Hdr_strg_site_cd.addAllListener(p);
		p.Hdr_strg_site_nm.setListListener(p);
		p.Hdr_strg_site_nm.addAllListener(p);
		p.Hdr_strg_sppl_cd.setListListener(p);
		p.Hdr_strg_sppl_cd.addAllListener(p);
		p.Hdr_wg_cd.setListListener(p);
		p.Hdr_wg_cd.addAllListener(p);
		p.Hdr_wg_nm.setListListener(p);
		p.Hdr_wg_nm.addAllListener(p);
		p.Hdr_itm_ord_typ.setListListener(p);
		p.Hdr_itm_ord_typ.addAllListener(p);
		p.Hdr_itm_ord_typ_nm.setListListener(p);
		p.Hdr_itm_ord_typ_nm.addAllListener(p);
		p.Hdr_not_fix_flg.addAllListener(p);
		p.Hdr_mfg_flg.addAllListener(p);
		p.Hdr_outsrc_flg.addAllListener(p);
		p.Hdr_mfg_loc_cd.setListListener(p);
		p.Hdr_mfg_loc_cd.addAllListener(p);
		p.Hdr_mfg_loc_nm.setListListener(p);
		p.Hdr_mfg_loc_nm.addAllListener(p);
		p.Hdr_mfg_sppl_cd.setListListener(p);
		p.Hdr_mfg_sppl_cd.addAllListener(p);
		p.Hdr_mfg_maker_cd.setListListener(p);
		p.Hdr_mfg_maker_cd.addAllListener(p);
		p.Hdr_bom_ptn.setListListener(p);
		p.Hdr_bom_ptn.addAllListener(p);
		p.Hdr_sppl_cd.setListListener(p);
		p.Hdr_sppl_cd.addAllListener(p);
		p.Hdr_sppl_nm.setListListener(p);
		p.Hdr_sppl_nm.addAllListener(p);
		p.Hdr_maker_cd.setListListener(p);
		p.Hdr_maker_cd.addAllListener(p);
		p.Hdr_maker_nm.setListListener(p);
		p.Hdr_maker_nm.addAllListener(p);
		p.Hdr_rqst_loc_cd.setListListener(p);
		p.Hdr_rqst_loc_cd.addAllListener(p);
		p.Hdr_rqst_loc_nm.setListListener(p);
		p.Hdr_rqst_loc_nm.addAllListener(p);
		p.Hdr_rqst_wg_cd.setListListener(p);
		p.Hdr_rqst_wg_cd.addAllListener(p);
		p.Hdr_rqst_wg_nm.setListListener(p);
		p.Hdr_rqst_wg_nm.addAllListener(p);
		p.Hdr_nmr_qty.setListListener(p);
		p.Hdr_nmr_qty.addAllListener(p);
		p.Hdr_dnm_qty.setListListener(p);
		p.Hdr_dnm_qty.addAllListener(p);
		p.Hdr_fxd_yield_qty.setListListener(p);
		p.Hdr_fxd_yield_qty.addAllListener(p);
		p.Hdr_not_qty_rlt_flg.addAllListener(p);
		p.Hdr_unit_cd.setListListener(p);
		p.Hdr_unit_cd.addAllListener(p);
		p.Hdr_unit_nm.setListListener(p);
		p.Hdr_unit_nm.addAllListener(p);
		p.Hdr_dec_place.setListListener(p);
		p.Hdr_dec_place.addAllListener(p);
		p.Hdr_rnd_typ.setListListener(p);
		p.Hdr_rnd_typ.addAllListener(p);
		p.Hdr_cont_fctr_flg.addAllListener(p);
		p.Hdr_lmt_dt.setListListener(p);
		p.Hdr_lmt_dt.addAllListener(p);
		p.Hdr_sno1_mng_typ.setListListener(p);
		p.Hdr_sno1_mng_typ.addAllListener(p);
		p.Hdr_sno2_mng_typ.setListListener(p);
		p.Hdr_sno2_mng_typ.addAllListener(p);
		p.Hdr_sno3_mng_typ.setListListener(p);
		p.Hdr_sno3_mng_typ.addAllListener(p);
		p.Hdr_sno4_mng_typ.setListListener(p);
		p.Hdr_sno4_mng_typ.addAllListener(p);
		p.Hdr_insp_flg.addAllListener(p);
		p.Hdr_po_schd_dt.setListListener(p);
		p.Hdr_po_schd_dt.addAllListener(p);
		p.Hdr_mfg_st_schd_dt.setListListener(p);
		p.Hdr_mfg_st_schd_dt.addAllListener(p);
		p.Hdr_mfg_end_schd_dt.setListListener(p);
		p.Hdr_mfg_end_schd_dt.addAllListener(p);
		p.Hdr_gi_schd_dt.setListListener(p);
		p.Hdr_gi_schd_dt.addAllListener(p);
		p.Hdr_strg_schd_dt.setListListener(p);
		p.Hdr_strg_schd_dt.addAllListener(p);
		p.Hdr_accpt_schd_dt.setListListener(p);
		p.Hdr_accpt_schd_dt.addAllListener(p);
		p.Hdr_insp_st_schd_dt.setListListener(p);
		p.Hdr_insp_st_schd_dt.addAllListener(p);
		p.Hdr_insp_end_schd_dt.setListListener(p);
		p.Hdr_insp_end_schd_dt.addAllListener(p);
		p.Hdr_avl_schd_dt.setListListener(p);
		p.Hdr_avl_schd_dt.addAllListener(p);
		p.Hdr_sprt_lt.addAllListener(p);
		p.Hdr_sprt_lt.setAPMethodName("doHdr_sprt_lt");
		p.Hdr_oper_ptn.setListListener(p);
		p.Hdr_oper_ptn.addAllListener(p);
		p.Hdr_purc_lt.setListListener(p);
		p.Hdr_purc_lt.addAllListener(p);
		p.Hdr_mfg_lt.setListListener(p);
		p.Hdr_mfg_lt.addAllListener(p);
		p.Hdr_xfr_lt.setListListener(p);
		p.Hdr_xfr_lt.addAllListener(p);
		p.Hdr_accpt_insp_lt.setListListener(p);
		p.Hdr_accpt_insp_lt.addAllListener(p);
		p.Hdr_insp_lt.setListListener(p);
		p.Hdr_insp_lt.addAllListener(p);
		p.Hdr_insp_offst.setListListener(p);
		p.Hdr_insp_offst.addAllListener(p);
		p.Hdr_ord_fix_pd.setListListener(p);
		p.Hdr_ord_fix_pd.addAllListener(p);
		p.Hdr_cont_fctr_dec_place.setListListener(p);
		p.Hdr_cont_fctr_dec_place.addAllListener(p);
		p.Hdr_cont_fctr_rnd_typ.setListListener(p);
		p.Hdr_cont_fctr_rnd_typ.addAllListener(p);
		p.Hdr_ver_flg.addAllListener(p);
		p.Hdr_inst_po_cnt_rmrks.setListListener(p);
		p.Hdr_inst_po_cnt_rmrks.addAllListener(p);
		p.Hdr_intr_rmrks.setListListener(p);
		p.Hdr_intr_rmrks.addAllListener(p);
		p.Hdr_sub_char1.setListListener(p);
		p.Hdr_sub_char1.addAllListener(p);
		p.Hdr_sub_char2.setListListener(p);
		p.Hdr_sub_char2.addAllListener(p);
		p.Hdr_sub_char3.setListListener(p);
		p.Hdr_sub_char3.addAllListener(p);
		p.Hdr_ord_rcv_flg.addAllListener(p);
		p.Hdr_ord_snd_flg.addAllListener(p);
		p.Hdr_ext_sys_cd.setListListener(p);
		p.Hdr_ext_sys_cd.addAllListener(p);
		p.Hdr_ext_sys_nm.setListListener(p);
		p.Hdr_ext_sys_nm.addAllListener(p);
		p.Hdr_ext_itm_ord_no.setListListener(p);
		p.Hdr_ext_itm_ord_no.addAllListener(p);
		p.Hdr_for_scheduler_frozen_flg.addAllListener(p);
		p.Hdr_scheduler_frozen_flg.addAllListener(p);
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
	 *  [SysInfo]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSysInfo(MSBCP_OrdReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBCP_OrdReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_oper_ord_no.addAllListener(p);
		p.columnDtl_oper_ord_no.setListListener(p);
		p.columnDtl_oper_ord_sts_typ.addAllListener(p);
		p.columnDtl_oper_ord_sts_typ.setListListener(p);
		p.columnDtl_oper_ord_sts_typ_nm.addAllListener(p);
		p.columnDtl_oper_ord_sts_typ_nm.setListListener(p);
		p.columnDtl_oper_cd.addAllListener(p);
		p.columnDtl_oper_cd.setListListener(p);
		p.columnDtl_oper_nm.addAllListener(p);
		p.columnDtl_oper_nm.setListListener(p);
		p.columnDtl_oper_seq.addAllListener(p);
		p.columnDtl_oper_seq.setListListener(p);
		p.columnDtl_loc_cd.addAllListener(p);
		p.columnDtl_loc_cd.setListListener(p);
		p.columnDtl_loc_nm.addAllListener(p);
		p.columnDtl_loc_nm.setListListener(p);
		p.columnDtl_disp_seq.addAllListener(p);
		p.columnDtl_disp_seq.setListListener(p);
		p.columnDtl_base_unit_cd.addAllListener(p);
		p.columnDtl_base_unit_cd.setListListener(p);
		p.columnDtl_base_unit_nm.addAllListener(p);
		p.columnDtl_base_unit_nm.setListListener(p);
		p.columnDtl_base_dec_place.addAllListener(p);
		p.columnDtl_base_dec_place.setListListener(p);
		p.columnDtl_oper_std_qty.addAllListener(p);
		p.columnDtl_oper_std_qty.setListListener(p);
		p.columnDtl_oper_conv_qty.addAllListener(p);
		p.columnDtl_oper_conv_qty.setListListener(p);
		p.columnDtl_dec_place.addAllListener(p);
		p.columnDtl_dec_place.setListListener(p);
		p.columnDtl_unit_conv_rnd_typ.addAllListener(p);
		p.columnDtl_unit_conv_rnd_typ.setListListener(p);
		p.columnDtl_oper_unit_cd.addAllListener(p);
		p.columnDtl_oper_unit_cd.setListListener(p);
		p.columnDtl_oper_unit_nm.addAllListener(p);
		p.columnDtl_oper_unit_nm.setListListener(p);
		p.columnDtl_yield_oper_flg.addAllListener(p);
		p.columnDtl_oper_lt.addAllListener(p);
		p.columnDtl_oper_lt.setListListener(p);
		p.columnDtl_oper_offst_typ.addAllListener(p);
		p.columnDtl_oper_offst_typ.setListListener(p);
		p.columnDtl_oper_offst_typ_nm.addAllListener(p);
		p.columnDtl_oper_offst_typ_nm.setListListener(p);
		p.columnDtl_oper_offst.addAllListener(p);
		p.columnDtl_oper_offst.setListListener(p);
		p.columnDtl_oper_rsrc.addAllListener(p);
		p.columnDtl_oper_rsrc.setListListener(p);
		p.columnDtl_intr_rmrks.addAllListener(p);
		p.columnDtl_intr_rmrks.setListListener(p);
		p.columnDtl_sub_char1.addAllListener(p);
		p.columnDtl_sub_char1.setListListener(p);
		p.columnDtl_sub_char2.addAllListener(p);
		p.columnDtl_sub_char2.setListListener(p);
		p.columnDtl_sub_char3.addAllListener(p);
		p.columnDtl_sub_char3.setListListener(p);
		p.columnDtl_ext_oper_ord_no.addAllListener(p);
		p.columnDtl_ext_oper_ord_no.setListListener(p);
		p.columnDtl_scheduler_frozen_flg.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBCP_OrdReg p) {
		p.Btn_sprt_expand_oper.addAllListener(p);
		p.Btn_sprt_expand_oper.setAPMethodName("doBtn_sprt_expand_oper");
		p.Btn_upd_sav_all_oper.addAllListener(p);
		p.Btn_upd_sav_all_oper.setAPMethodName("doBtn_upd_sav_all_oper");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_ins.addAllListener(p);
		p.Btn_ins.setAPMethodName("doBtn_ins");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_upd2.addAllListener(p);
		p.Btn_upd2.setAPMethodName("doBtn_upd2");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBCP_OrdReg p) {
	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBCP_OrdReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBCP_OrdReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_itm_ord_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINS_Top(MSBCP_OrdReg p){

	}

	/**
	 * [INS]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_HdrTab(MSBCP_OrdReg p){

	}

	/**
	 * [INS]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab1(MSBCP_OrdReg p){

	}

	/**
	 * [INS]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab2(MSBCP_OrdReg p){

	}

	/**
	 * [INS]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr(MSBCP_OrdReg p){
		p.Hdr_itm_ord_sts_typ.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_itm_ord_sts_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_master_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_itm_ord_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_rqmt_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Hdr_ver_no_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Hdr_strg_loc_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_strg_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_strg_site_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_strg_site_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_strg_sppl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_itm_ord_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_not_fix_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_mfg_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_outsrc_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_mfg_sppl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_mfg_maker_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_nmr_qty.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dnm_qty.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_fxd_yield_qty.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_not_qty_rlt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_inst_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_yield_schd_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_lmt_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sno_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.READ_ONLY);
		p.Hdr_sno1_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_sno2_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_sno3_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_sno4_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_insp_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_po_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_mfg_st_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_mfg_end_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_gi_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_strg_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_accpt_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_st_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_end_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_avl_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sprt_lt.putMode(p, INS, MCMode.DISABLE);
		p.Hdr_oper_ptn.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_purc_lt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_mfg_lt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_xfr_lt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_accpt_insp_lt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_lt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_insp_offst.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ord_fix_pd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_inst_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_yield_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_cont_unit_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);
		p.Hdr_std_cont_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_cont_fctr_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ver_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_inst_po_cnt_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ord_rcv_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ord_snd_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ext_itm_ord_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_for_scheduler_frozen_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_scheduler_frozen_flg.putMode(p, INS, MCMode.READ_ONLY);
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
	 * [INS]ステータスの[SysInfo]ブロックのモードの設定
	 */
	protected static void statusInitINS_SysInfo(MSBCP_OrdReg p){

	}

	/**
	 * [INS]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl(MSBCP_OrdReg p){
		p.columnDtl_oper_ord_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_oper_schd_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_base_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_oper_std_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_oper_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_unit_conv_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_oper_conv_schd_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_oper_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_oper_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_yield_oper_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_oper_lt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_oper_offst.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_oper_rsrc.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ext_oper_ord_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_scheduler_frozen_flg.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBCP_OrdReg p){
		p.Btn_sprt_expand_oper.putMode(p, INS, MCMode.DISABLE);
		p.Btn_upd_sav_all_oper.putMode(p, INS, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, INS, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, INS, MCMode.DISABLE);
		p.Btn_ins.putMode(p, INS, MCMode.DISABLE);
		p.Btn_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBCP_OrdReg p){

	}

	/**
	 * [INS_NONE]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__NONE_ScreenOpe(MSBCP_OrdReg p){

	}

	/**
	 * [INS_NONE]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__NONE_Cnd(MSBCP_OrdReg p){
		p.Cnd_ope_Group.putMode(p, INS_NONE, MCMode.REQUIRED);
		p.Cnd_itm_ord_no.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS_NONE, MCMode.DISABLE);

	}

	/**
	 * [INS_NONE]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINS__NONE_Top(MSBCP_OrdReg p){

	}

	/**
	 * [INS_NONE]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__NONE_HdrTab(MSBCP_OrdReg p){

	}

	/**
	 * [INS_NONE]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINS__NONE_Tab1(MSBCP_OrdReg p){

	}

	/**
	 * [INS_NONE]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINS__NONE_Tab2(MSBCP_OrdReg p){

	}

	/**
	 * [INS_NONE]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS__NONE_Hdr(MSBCP_OrdReg p){
		p.Hdr_itm_ord_sts_typ.putMode(p, INS_NONE, MCMode.REQUIRED);
		p.Hdr_itm_ord_sts_typ_nm.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_master_dt.putMode(p, INS_NONE, MCMode.REQUIRED);
		p.Hdr_itm_ord_no.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_rqmt_no.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(INS_NONE, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Hdr_ver_no_p_PPanel.putStatus(INS_NONE, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Hdr_strg_loc_cd.putMode(p, INS_NONE, MCMode.REQUIRED);
		p.Hdr_strg_loc_nm.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_strg_site_cd.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_strg_site_nm.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_strg_sppl_cd.putMode(p, INS_NONE, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ.putMode(p, INS_NONE, MCMode.REQUIRED);
		p.Hdr_itm_ord_typ_nm.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_not_fix_flg.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_mfg_flg.putMode(p, INS_NONE, MCMode.INVISIBLE);
		p.Hdr_outsrc_flg.putMode(p, INS_NONE, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_mfg_sppl_cd.putMode(p, INS_NONE, MCMode.INVISIBLE);
		p.Hdr_mfg_maker_cd.putMode(p, INS_NONE, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_cd.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_nm.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_cd.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_nm.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_nmr_qty.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_dnm_qty.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_fxd_yield_qty.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_not_qty_rlt_flg.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_inst_qty_p_PPanel.putStatus(INS_NONE, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_yield_schd_qty_p_PPanel.putStatus(INS_NONE, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_unit_cd.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, INS_NONE, MCMode.INVISIBLE);
		p.Hdr_rnd_typ.putMode(p, INS_NONE, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_flg.putMode(p, INS_NONE, MCMode.INVISIBLE);
		p.Hdr_lmt_dt.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_sno_wrk_no_p_PPanel.putStatus(INS_NONE, mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.READ_ONLY);
		p.Hdr_sno1_mng_typ.putMode(p, INS_NONE, MCMode.INVISIBLE);
		p.Hdr_sno2_mng_typ.putMode(p, INS_NONE, MCMode.INVISIBLE);
		p.Hdr_sno3_mng_typ.putMode(p, INS_NONE, MCMode.INVISIBLE);
		p.Hdr_sno4_mng_typ.putMode(p, INS_NONE, MCMode.INVISIBLE);
		p.Hdr_insp_flg.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_po_schd_dt.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_mfg_st_schd_dt.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_mfg_end_schd_dt.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_gi_schd_dt.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_strg_schd_dt.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_accpt_schd_dt.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_insp_st_schd_dt.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_insp_end_schd_dt.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_avl_schd_dt.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_sprt_lt.putMode(p, INS_NONE, MCMode.DISABLE);
		p.Hdr_oper_ptn.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_purc_lt.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_mfg_lt.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_xfr_lt.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_accpt_insp_lt.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_insp_lt.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_insp_offst.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_ord_fix_pd.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_inst_cont_qty_p_PPanel.putStatus(INS_NONE, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_yield_cont_qty_p_PPanel.putStatus(INS_NONE, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_cont_unit_p_PPanel.putStatus(INS_NONE, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);
		p.Hdr_std_cont_p_PPanel.putStatus(INS_NONE, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_cont_fctr_dec_place.putMode(p, INS_NONE, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_rnd_typ.putMode(p, INS_NONE, MCMode.INVISIBLE);
		p.Hdr_ver_flg.putMode(p, INS_NONE, MCMode.INVISIBLE);
		p.Hdr_inst_po_cnt_rmrks.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_ord_rcv_flg.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_ord_snd_flg.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_ext_itm_ord_no.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_for_scheduler_frozen_flg.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_scheduler_frozen_flg.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS_NONE, MCMode.READ_ONLY);

	}

	/**
	 * [INS_NONE]ステータスの[SysInfo]ブロックのモードの設定
	 */
	protected static void statusInitINS__NONE_SysInfo(MSBCP_OrdReg p){

	}

	/**
	 * [INS_NONE]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS__NONE_Dtl(MSBCP_OrdReg p){
		p.columnDtl_oper_ord_no.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ_nm.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Dtl_oper_schd_qty_p_PPanel.putStatus(INS_NONE, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.columnDtl_base_dec_place.putMode(p, INS_NONE, MCMode.INVISIBLE);
		p.columnDtl_oper_std_qty.putMode(p, INS_NONE, MCMode.INVISIBLE);
		p.columnDtl_oper_conv_qty.putMode(p, INS_NONE, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, INS_NONE, MCMode.INVISIBLE);
		p.columnDtl_unit_conv_rnd_typ.putMode(p, INS_NONE, MCMode.INVISIBLE);
		p.Dtl_oper_conv_schd_qty_p_PPanel.putStatus(INS_NONE, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_oper_unit_cd.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.columnDtl_oper_unit_nm.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.columnDtl_yield_oper_flg.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(INS_NONE, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(INS_NONE, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_oper_lt.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ_nm.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.columnDtl_oper_offst.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.columnDtl_oper_rsrc.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.columnDtl_ext_oper_ord_no.putMode(p, INS_NONE, MCMode.READ_ONLY);
		p.columnDtl_scheduler_frozen_flg.putMode(p, INS_NONE, MCMode.READ_ONLY);

	}

	/**
	 * [INS_NONE]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__NONE_Btn(MSBCP_OrdReg p){
		p.Btn_sprt_expand_oper.putMode(p, INS_NONE, MCMode.DISABLE);
		p.Btn_upd_sav_all_oper.putMode(p, INS_NONE, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, INS_NONE, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, INS_NONE, MCMode.DISABLE);
		p.Btn_ins.putMode(p, INS_NONE, MCMode.DISABLE);
		p.Btn_upd.putMode(p, INS_NONE, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, INS_NONE, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS_NONE, MCMode.DISABLE);

	}

	/**
	 * [INS_NONE]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__NONE_EastBtn(MSBCP_OrdReg p){

	}

	/**
	 * [INS_MFG]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__MFG_ScreenOpe(MSBCP_OrdReg p){

	}

	/**
	 * [INS_MFG]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__MFG_Cnd(MSBCP_OrdReg p){
		p.Cnd_ope_Group.putMode(p, INS_MFG, MCMode.REQUIRED);
		p.Cnd_itm_ord_no.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS_MFG, MCMode.DISABLE);

	}

	/**
	 * [INS_MFG]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINS__MFG_Top(MSBCP_OrdReg p){

	}

	/**
	 * [INS_MFG]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__MFG_HdrTab(MSBCP_OrdReg p){

	}

	/**
	 * [INS_MFG]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINS__MFG_Tab1(MSBCP_OrdReg p){

	}

	/**
	 * [INS_MFG]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINS__MFG_Tab2(MSBCP_OrdReg p){

	}

	/**
	 * [INS_MFG]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS__MFG_Hdr(MSBCP_OrdReg p){
		p.Hdr_itm_ord_sts_typ.putMode(p, INS_MFG, MCMode.REQUIRED);
		p.Hdr_itm_ord_sts_typ_nm.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_master_dt.putMode(p, INS_MFG, MCMode.REQUIRED);
		p.Hdr_itm_ord_no.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_rqmt_no.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(INS_MFG, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Hdr_ver_no_p_PPanel.putStatus(INS_MFG, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Hdr_strg_loc_cd.putMode(p, INS_MFG, MCMode.REQUIRED);
		p.Hdr_strg_loc_nm.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_strg_site_cd.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_strg_site_nm.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_strg_sppl_cd.putMode(p, INS_MFG, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ.putMode(p, INS_MFG, MCMode.REQUIRED);
		p.Hdr_itm_ord_typ_nm.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_not_fix_flg.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_mfg_flg.putMode(p, INS_MFG, MCMode.INVISIBLE);
		p.Hdr_outsrc_flg.putMode(p, INS_MFG, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, INS_MFG, MCMode.REQUIRED);
		p.Hdr_mfg_loc_nm.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_mfg_sppl_cd.putMode(p, INS_MFG, MCMode.INVISIBLE);
		p.Hdr_mfg_maker_cd.putMode(p, INS_MFG, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, INS_MFG, MCMode.REQUIRED);
		p.Hdr_sppl_cd.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_cd.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_nm.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_cd.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_nm.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_nmr_qty.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_dnm_qty.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_fxd_yield_qty.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_not_qty_rlt_flg.putMode(p, INS_MFG, MCMode.REQUIRED);
		p.Hdr_inst_qty_p_PPanel.putStatus(INS_MFG, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.REQUIRED);
		p.Hdr_yield_schd_qty_p_PPanel.putStatus(INS_MFG, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.REQUIRED);
		p.Hdr_unit_cd.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, INS_MFG, MCMode.INVISIBLE);
		p.Hdr_rnd_typ.putMode(p, INS_MFG, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_flg.putMode(p, INS_MFG, MCMode.INVISIBLE);
		p.Hdr_lmt_dt.putMode(p, INS_MFG, MCMode.ENABLE);
		p.Hdr_sno_wrk_no_p_PPanel.putStatus(INS_MFG, mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.ENABLE);
		p.Hdr_sno1_mng_typ.putMode(p, INS_MFG, MCMode.INVISIBLE);
		p.Hdr_sno2_mng_typ.putMode(p, INS_MFG, MCMode.INVISIBLE);
		p.Hdr_sno3_mng_typ.putMode(p, INS_MFG, MCMode.INVISIBLE);
		p.Hdr_sno4_mng_typ.putMode(p, INS_MFG, MCMode.INVISIBLE);
		p.Hdr_insp_flg.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_po_schd_dt.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_mfg_st_schd_dt.putMode(p, INS_MFG, MCMode.REQUIRED);
		p.Hdr_mfg_end_schd_dt.putMode(p, INS_MFG, MCMode.REQUIRED);
		p.Hdr_gi_schd_dt.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_strg_schd_dt.putMode(p, INS_MFG, MCMode.REQUIRED);
		p.Hdr_accpt_schd_dt.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_insp_st_schd_dt.putMode(p, INS_MFG, MCMode.REQUIRED);
		p.Hdr_insp_end_schd_dt.putMode(p, INS_MFG, MCMode.REQUIRED);
		p.Hdr_avl_schd_dt.putMode(p, INS_MFG, MCMode.REQUIRED);
		p.Hdr_sprt_lt.putMode(p, INS_MFG, MCMode.ENABLE);
		p.Hdr_oper_ptn.putMode(p, INS_MFG, MCMode.REQUIRED);
		p.Hdr_purc_lt.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_mfg_lt.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_xfr_lt.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_accpt_insp_lt.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_insp_lt.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_insp_offst.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_ord_fix_pd.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_inst_cont_qty_p_PPanel.putStatus(INS_MFG, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.REQUIRED);
		p.Hdr_yield_cont_qty_p_PPanel.putStatus(INS_MFG, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.REQUIRED);
		p.Hdr_cont_unit_p_PPanel.putStatus(INS_MFG, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);
		p.Hdr_std_cont_p_PPanel.putStatus(INS_MFG, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_cont_fctr_dec_place.putMode(p, INS_MFG, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_rnd_typ.putMode(p, INS_MFG, MCMode.INVISIBLE);
		p.Hdr_ver_flg.putMode(p, INS_MFG, MCMode.INVISIBLE);
		p.Hdr_inst_po_cnt_rmrks.putMode(p, INS_MFG, MCMode.ENABLE);
		p.Hdr_intr_rmrks.putMode(p, INS_MFG, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, INS_MFG, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, INS_MFG, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, INS_MFG, MCMode.ENABLE);
		p.Hdr_ord_rcv_flg.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_ord_snd_flg.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_ext_itm_ord_no.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_for_scheduler_frozen_flg.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_scheduler_frozen_flg.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS_MFG, MCMode.READ_ONLY);

	}

	/**
	 * [INS_MFG]ステータスの[SysInfo]ブロックのモードの設定
	 */
	protected static void statusInitINS__MFG_SysInfo(MSBCP_OrdReg p){

	}

	/**
	 * [INS_MFG]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS__MFG_Dtl(MSBCP_OrdReg p){
		p.columnDtl_oper_ord_no.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ.putMode(p, INS_MFG, MCMode.REQUIRED);
		p.columnDtl_oper_ord_sts_typ_nm.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Dtl_oper_schd_qty_p_PPanel.putStatus(INS_MFG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_base_unit_cd.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.columnDtl_base_dec_place.putMode(p, INS_MFG, MCMode.INVISIBLE);
		p.columnDtl_oper_std_qty.putMode(p, INS_MFG, MCMode.INVISIBLE);
		p.columnDtl_oper_conv_qty.putMode(p, INS_MFG, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, INS_MFG, MCMode.INVISIBLE);
		p.columnDtl_unit_conv_rnd_typ.putMode(p, INS_MFG, MCMode.INVISIBLE);
		p.Dtl_oper_conv_schd_qty_p_PPanel.putStatus(INS_MFG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_oper_unit_cd.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.columnDtl_oper_unit_nm.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.columnDtl_yield_oper_flg.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(INS_MFG, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.Dtl_end_tm_p_PPanel.putStatus(INS_MFG, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.columnDtl_oper_lt.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ_nm.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.columnDtl_oper_offst.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.columnDtl_oper_rsrc.putMode(p, INS_MFG, MCMode.ENABLE);
		p.columnDtl_intr_rmrks.putMode(p, INS_MFG, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, INS_MFG, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, INS_MFG, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, INS_MFG, MCMode.ENABLE);
		p.columnDtl_ext_oper_ord_no.putMode(p, INS_MFG, MCMode.READ_ONLY);
		p.columnDtl_scheduler_frozen_flg.putMode(p, INS_MFG, MCMode.READ_ONLY);

	}

	/**
	 * [INS_MFG]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__MFG_Btn(MSBCP_OrdReg p){
		p.Btn_sprt_expand_oper.putMode(p, INS_MFG, MCMode.ENABLE);
		p.Btn_upd_sav_all_oper.putMode(p, INS_MFG, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, INS_MFG, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, INS_MFG, MCMode.ENABLE);
		p.Btn_ins.putMode(p, INS_MFG, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS_MFG, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, INS_MFG, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS_MFG, MCMode.DISABLE);

	}

	/**
	 * [INS_MFG]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__MFG_EastBtn(MSBCP_OrdReg p){

	}

	/**
	 * [INS_PURC]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__PURC_ScreenOpe(MSBCP_OrdReg p){

	}

	/**
	 * [INS_PURC]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__PURC_Cnd(MSBCP_OrdReg p){
		p.Cnd_ope_Group.putMode(p, INS_PURC, MCMode.REQUIRED);
		p.Cnd_itm_ord_no.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS_PURC, MCMode.DISABLE);

	}

	/**
	 * [INS_PURC]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINS__PURC_Top(MSBCP_OrdReg p){

	}

	/**
	 * [INS_PURC]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__PURC_HdrTab(MSBCP_OrdReg p){

	}

	/**
	 * [INS_PURC]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINS__PURC_Tab1(MSBCP_OrdReg p){

	}

	/**
	 * [INS_PURC]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINS__PURC_Tab2(MSBCP_OrdReg p){

	}

	/**
	 * [INS_PURC]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS__PURC_Hdr(MSBCP_OrdReg p){
		p.Hdr_itm_ord_sts_typ.putMode(p, INS_PURC, MCMode.REQUIRED);
		p.Hdr_itm_ord_sts_typ_nm.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_master_dt.putMode(p, INS_PURC, MCMode.REQUIRED);
		p.Hdr_itm_ord_no.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_rqmt_no.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(INS_PURC, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Hdr_ver_no_p_PPanel.putStatus(INS_PURC, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE);
		p.Hdr_strg_loc_cd.putMode(p, INS_PURC, MCMode.REQUIRED);
		p.Hdr_strg_loc_nm.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_strg_site_cd.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_strg_site_nm.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_strg_sppl_cd.putMode(p, INS_PURC, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ.putMode(p, INS_PURC, MCMode.REQUIRED);
		p.Hdr_itm_ord_typ_nm.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_not_fix_flg.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_mfg_flg.putMode(p, INS_PURC, MCMode.INVISIBLE);
		p.Hdr_outsrc_flg.putMode(p, INS_PURC, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_mfg_sppl_cd.putMode(p, INS_PURC, MCMode.INVISIBLE);
		p.Hdr_mfg_maker_cd.putMode(p, INS_PURC, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, INS_PURC, MCMode.REQUIRED);
		p.Hdr_sppl_nm.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, INS_PURC, MCMode.ENABLE);
		p.Hdr_maker_nm.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_cd.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_nm.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_cd.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_nm.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_nmr_qty.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_dnm_qty.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_fxd_yield_qty.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_not_qty_rlt_flg.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_inst_qty_p_PPanel.putStatus(INS_PURC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.REQUIRED);
		p.Hdr_yield_schd_qty_p_PPanel.putStatus(INS_PURC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.REQUIRED);
		p.Hdr_unit_cd.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, INS_PURC, MCMode.INVISIBLE);
		p.Hdr_rnd_typ.putMode(p, INS_PURC, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_flg.putMode(p, INS_PURC, MCMode.INVISIBLE);
		p.Hdr_lmt_dt.putMode(p, INS_PURC, MCMode.ENABLE);
		p.Hdr_sno_wrk_no_p_PPanel.putStatus(INS_PURC, mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.ENABLE);
		p.Hdr_sno1_mng_typ.putMode(p, INS_PURC, MCMode.INVISIBLE);
		p.Hdr_sno2_mng_typ.putMode(p, INS_PURC, MCMode.INVISIBLE);
		p.Hdr_sno3_mng_typ.putMode(p, INS_PURC, MCMode.INVISIBLE);
		p.Hdr_sno4_mng_typ.putMode(p, INS_PURC, MCMode.INVISIBLE);
		p.Hdr_insp_flg.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_po_schd_dt.putMode(p, INS_PURC, MCMode.REQUIRED);
		p.Hdr_mfg_st_schd_dt.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_mfg_end_schd_dt.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_gi_schd_dt.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_strg_schd_dt.putMode(p, INS_PURC, MCMode.REQUIRED);
		p.Hdr_accpt_schd_dt.putMode(p, INS_PURC, MCMode.REQUIRED);
		p.Hdr_insp_st_schd_dt.putMode(p, INS_PURC, MCMode.REQUIRED);
		p.Hdr_insp_end_schd_dt.putMode(p, INS_PURC, MCMode.REQUIRED);
		p.Hdr_avl_schd_dt.putMode(p, INS_PURC, MCMode.REQUIRED);
		p.Hdr_sprt_lt.putMode(p, INS_PURC, MCMode.ENABLE);
		p.Hdr_oper_ptn.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_purc_lt.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_mfg_lt.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_xfr_lt.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_accpt_insp_lt.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_insp_lt.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_insp_offst.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_ord_fix_pd.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_inst_cont_qty_p_PPanel.putStatus(INS_PURC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.REQUIRED);
		p.Hdr_yield_cont_qty_p_PPanel.putStatus(INS_PURC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_cont_unit_p_PPanel.putStatus(INS_PURC, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);
		p.Hdr_std_cont_p_PPanel.putStatus(INS_PURC, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_cont_fctr_dec_place.putMode(p, INS_PURC, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_rnd_typ.putMode(p, INS_PURC, MCMode.INVISIBLE);
		p.Hdr_ver_flg.putMode(p, INS_PURC, MCMode.INVISIBLE);
		p.Hdr_inst_po_cnt_rmrks.putMode(p, INS_PURC, MCMode.ENABLE);
		p.Hdr_intr_rmrks.putMode(p, INS_PURC, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, INS_PURC, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, INS_PURC, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, INS_PURC, MCMode.ENABLE);
		p.Hdr_ord_rcv_flg.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_ord_snd_flg.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_ext_itm_ord_no.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_for_scheduler_frozen_flg.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_scheduler_frozen_flg.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS_PURC, MCMode.READ_ONLY);

	}

	/**
	 * [INS_PURC]ステータスの[SysInfo]ブロックのモードの設定
	 */
	protected static void statusInitINS__PURC_SysInfo(MSBCP_OrdReg p){

	}

	/**
	 * [INS_PURC]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS__PURC_Dtl(MSBCP_OrdReg p){
		p.columnDtl_oper_ord_no.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ_nm.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Dtl_oper_schd_qty_p_PPanel.putStatus(INS_PURC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.columnDtl_base_dec_place.putMode(p, INS_PURC, MCMode.INVISIBLE);
		p.columnDtl_oper_std_qty.putMode(p, INS_PURC, MCMode.INVISIBLE);
		p.columnDtl_oper_conv_qty.putMode(p, INS_PURC, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, INS_PURC, MCMode.INVISIBLE);
		p.columnDtl_unit_conv_rnd_typ.putMode(p, INS_PURC, MCMode.INVISIBLE);
		p.Dtl_oper_conv_schd_qty_p_PPanel.putStatus(INS_PURC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_oper_unit_cd.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.columnDtl_oper_unit_nm.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.columnDtl_yield_oper_flg.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(INS_PURC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(INS_PURC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_oper_lt.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ_nm.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.columnDtl_oper_offst.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.columnDtl_oper_rsrc.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.columnDtl_ext_oper_ord_no.putMode(p, INS_PURC, MCMode.READ_ONLY);
		p.columnDtl_scheduler_frozen_flg.putMode(p, INS_PURC, MCMode.READ_ONLY);

	}

	/**
	 * [INS_PURC]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__PURC_Btn(MSBCP_OrdReg p){
		p.Btn_sprt_expand_oper.putMode(p, INS_PURC, MCMode.DISABLE);
		p.Btn_upd_sav_all_oper.putMode(p, INS_PURC, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, INS_PURC, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, INS_PURC, MCMode.DISABLE);
		p.Btn_ins.putMode(p, INS_PURC, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS_PURC, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, INS_PURC, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS_PURC, MCMode.DISABLE);

	}

	/**
	 * [INS_PURC]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__PURC_EastBtn(MSBCP_OrdReg p){

	}

	/**
	 * [INS_OUTSRC]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__OUTSRC_ScreenOpe(MSBCP_OrdReg p){

	}

	/**
	 * [INS_OUTSRC]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__OUTSRC_Cnd(MSBCP_OrdReg p){
		p.Cnd_ope_Group.putMode(p, INS_OUTSRC, MCMode.REQUIRED);
		p.Cnd_itm_ord_no.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS_OUTSRC, MCMode.DISABLE);

	}

	/**
	 * [INS_OUTSRC]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINS__OUTSRC_Top(MSBCP_OrdReg p){

	}

	/**
	 * [INS_OUTSRC]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__OUTSRC_HdrTab(MSBCP_OrdReg p){

	}

	/**
	 * [INS_OUTSRC]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINS__OUTSRC_Tab1(MSBCP_OrdReg p){

	}

	/**
	 * [INS_OUTSRC]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINS__OUTSRC_Tab2(MSBCP_OrdReg p){

	}

	/**
	 * [INS_OUTSRC]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS__OUTSRC_Hdr(MSBCP_OrdReg p){
		p.Hdr_itm_ord_sts_typ.putMode(p, INS_OUTSRC, MCMode.REQUIRED);
		p.Hdr_itm_ord_sts_typ_nm.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_master_dt.putMode(p, INS_OUTSRC, MCMode.REQUIRED);
		p.Hdr_itm_ord_no.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_rqmt_no.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(INS_OUTSRC, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Hdr_ver_no_p_PPanel.putStatus(INS_OUTSRC, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE);
		p.Hdr_strg_loc_cd.putMode(p, INS_OUTSRC, MCMode.REQUIRED);
		p.Hdr_strg_loc_nm.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_strg_site_cd.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_strg_site_nm.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_strg_sppl_cd.putMode(p, INS_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ.putMode(p, INS_OUTSRC, MCMode.REQUIRED);
		p.Hdr_itm_ord_typ_nm.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_not_fix_flg.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_mfg_flg.putMode(p, INS_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_outsrc_flg.putMode(p, INS_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, INS_OUTSRC, MCMode.REQUIRED);
		p.Hdr_mfg_loc_nm.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_mfg_sppl_cd.putMode(p, INS_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_mfg_maker_cd.putMode(p, INS_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, INS_OUTSRC, MCMode.REQUIRED);
		p.Hdr_sppl_cd.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, INS_OUTSRC, MCMode.ENABLE);
		p.Hdr_maker_nm.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_cd.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_nm.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_cd.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_nm.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_nmr_qty.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_dnm_qty.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_fxd_yield_qty.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_not_qty_rlt_flg.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_inst_qty_p_PPanel.putStatus(INS_OUTSRC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.REQUIRED);
		p.Hdr_yield_schd_qty_p_PPanel.putStatus(INS_OUTSRC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.REQUIRED);
		p.Hdr_unit_cd.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, INS_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_rnd_typ.putMode(p, INS_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_flg.putMode(p, INS_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_lmt_dt.putMode(p, INS_OUTSRC, MCMode.ENABLE);
		p.Hdr_sno_wrk_no_p_PPanel.putStatus(INS_OUTSRC, mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.ENABLE);
		p.Hdr_sno1_mng_typ.putMode(p, INS_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_sno2_mng_typ.putMode(p, INS_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_sno3_mng_typ.putMode(p, INS_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_sno4_mng_typ.putMode(p, INS_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_insp_flg.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_po_schd_dt.putMode(p, INS_OUTSRC, MCMode.REQUIRED);
		p.Hdr_mfg_st_schd_dt.putMode(p, INS_OUTSRC, MCMode.REQUIRED);
		p.Hdr_mfg_end_schd_dt.putMode(p, INS_OUTSRC, MCMode.REQUIRED);
		p.Hdr_gi_schd_dt.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_strg_schd_dt.putMode(p, INS_OUTSRC, MCMode.REQUIRED);
		p.Hdr_accpt_schd_dt.putMode(p, INS_OUTSRC, MCMode.REQUIRED);
		p.Hdr_insp_st_schd_dt.putMode(p, INS_OUTSRC, MCMode.REQUIRED);
		p.Hdr_insp_end_schd_dt.putMode(p, INS_OUTSRC, MCMode.REQUIRED);
		p.Hdr_avl_schd_dt.putMode(p, INS_OUTSRC, MCMode.REQUIRED);
		p.Hdr_sprt_lt.putMode(p, INS_OUTSRC, MCMode.ENABLE);
		p.Hdr_oper_ptn.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_purc_lt.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_mfg_lt.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_xfr_lt.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_accpt_insp_lt.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_insp_lt.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_insp_offst.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_ord_fix_pd.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_inst_cont_qty_p_PPanel.putStatus(INS_OUTSRC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.REQUIRED);
		p.Hdr_yield_cont_qty_p_PPanel.putStatus(INS_OUTSRC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_cont_unit_p_PPanel.putStatus(INS_OUTSRC, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);
		p.Hdr_std_cont_p_PPanel.putStatus(INS_OUTSRC, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_cont_fctr_dec_place.putMode(p, INS_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_rnd_typ.putMode(p, INS_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_ver_flg.putMode(p, INS_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_inst_po_cnt_rmrks.putMode(p, INS_OUTSRC, MCMode.ENABLE);
		p.Hdr_intr_rmrks.putMode(p, INS_OUTSRC, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, INS_OUTSRC, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, INS_OUTSRC, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, INS_OUTSRC, MCMode.ENABLE);
		p.Hdr_ord_rcv_flg.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_ord_snd_flg.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_ext_itm_ord_no.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_for_scheduler_frozen_flg.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_scheduler_frozen_flg.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);

	}

	/**
	 * [INS_OUTSRC]ステータスの[SysInfo]ブロックのモードの設定
	 */
	protected static void statusInitINS__OUTSRC_SysInfo(MSBCP_OrdReg p){

	}

	/**
	 * [INS_OUTSRC]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS__OUTSRC_Dtl(MSBCP_OrdReg p){
		p.columnDtl_oper_ord_no.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ_nm.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Dtl_oper_schd_qty_p_PPanel.putStatus(INS_OUTSRC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_base_dec_place.putMode(p, INS_OUTSRC, MCMode.INVISIBLE);
		p.columnDtl_oper_std_qty.putMode(p, INS_OUTSRC, MCMode.INVISIBLE);
		p.columnDtl_oper_conv_qty.putMode(p, INS_OUTSRC, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, INS_OUTSRC, MCMode.INVISIBLE);
		p.columnDtl_unit_conv_rnd_typ.putMode(p, INS_OUTSRC, MCMode.INVISIBLE);
		p.Dtl_oper_conv_schd_qty_p_PPanel.putStatus(INS_OUTSRC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_oper_unit_cd.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_oper_unit_nm.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_yield_oper_flg.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(INS_OUTSRC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(INS_OUTSRC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_oper_lt.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ_nm.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_oper_offst.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_oper_rsrc.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_ext_oper_ord_no.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_scheduler_frozen_flg.putMode(p, INS_OUTSRC, MCMode.READ_ONLY);

	}

	/**
	 * [INS_OUTSRC]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__OUTSRC_Btn(MSBCP_OrdReg p){
		p.Btn_sprt_expand_oper.putMode(p, INS_OUTSRC, MCMode.DISABLE);
		p.Btn_upd_sav_all_oper.putMode(p, INS_OUTSRC, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, INS_OUTSRC, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, INS_OUTSRC, MCMode.DISABLE);
		p.Btn_ins.putMode(p, INS_OUTSRC, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS_OUTSRC, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, INS_OUTSRC, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS_OUTSRC, MCMode.DISABLE);

	}

	/**
	 * [INS_OUTSRC]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__OUTSRC_EastBtn(MSBCP_OrdReg p){

	}

	/**
	 * [INS_XFR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__XFR_ScreenOpe(MSBCP_OrdReg p){

	}

	/**
	 * [INS_XFR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__XFR_Cnd(MSBCP_OrdReg p){
		p.Cnd_ope_Group.putMode(p, INS_XFR, MCMode.REQUIRED);
		p.Cnd_itm_ord_no.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS_XFR, MCMode.DISABLE);

	}

	/**
	 * [INS_XFR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINS__XFR_Top(MSBCP_OrdReg p){

	}

	/**
	 * [INS_XFR]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__XFR_HdrTab(MSBCP_OrdReg p){

	}

	/**
	 * [INS_XFR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINS__XFR_Tab1(MSBCP_OrdReg p){

	}

	/**
	 * [INS_XFR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINS__XFR_Tab2(MSBCP_OrdReg p){

	}

	/**
	 * [INS_XFR]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS__XFR_Hdr(MSBCP_OrdReg p){
		p.Hdr_itm_ord_sts_typ.putMode(p, INS_XFR, MCMode.REQUIRED);
		p.Hdr_itm_ord_sts_typ_nm.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_master_dt.putMode(p, INS_XFR, MCMode.REQUIRED);
		p.Hdr_itm_ord_no.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_rqmt_no.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(INS_XFR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Hdr_ver_no_p_PPanel.putStatus(INS_XFR, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE);
		p.Hdr_strg_loc_cd.putMode(p, INS_XFR, MCMode.REQUIRED);
		p.Hdr_strg_loc_nm.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_strg_site_cd.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_strg_site_nm.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_strg_sppl_cd.putMode(p, INS_XFR, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ.putMode(p, INS_XFR, MCMode.REQUIRED);
		p.Hdr_itm_ord_typ_nm.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_not_fix_flg.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_mfg_flg.putMode(p, INS_XFR, MCMode.INVISIBLE);
		p.Hdr_outsrc_flg.putMode(p, INS_XFR, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_mfg_sppl_cd.putMode(p, INS_XFR, MCMode.INVISIBLE);
		p.Hdr_mfg_maker_cd.putMode(p, INS_XFR, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_cd.putMode(p, INS_XFR, MCMode.REQUIRED);
		p.Hdr_rqst_loc_nm.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_cd.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_nm.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_nmr_qty.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_dnm_qty.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_fxd_yield_qty.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_not_qty_rlt_flg.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_inst_qty_p_PPanel.putStatus(INS_XFR, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.REQUIRED);
		p.Hdr_yield_schd_qty_p_PPanel.putStatus(INS_XFR, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.REQUIRED);
		p.Hdr_unit_cd.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, INS_XFR, MCMode.INVISIBLE);
		p.Hdr_rnd_typ.putMode(p, INS_XFR, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_flg.putMode(p, INS_XFR, MCMode.INVISIBLE);
		p.Hdr_lmt_dt.putMode(p, INS_XFR, MCMode.ENABLE);
		p.Hdr_sno_wrk_no_p_PPanel.putStatus(INS_XFR, mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.ENABLE);
		p.Hdr_sno1_mng_typ.putMode(p, INS_XFR, MCMode.INVISIBLE);
		p.Hdr_sno2_mng_typ.putMode(p, INS_XFR, MCMode.INVISIBLE);
		p.Hdr_sno3_mng_typ.putMode(p, INS_XFR, MCMode.INVISIBLE);
		p.Hdr_sno4_mng_typ.putMode(p, INS_XFR, MCMode.INVISIBLE);
		p.Hdr_insp_flg.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_po_schd_dt.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_mfg_st_schd_dt.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_mfg_end_schd_dt.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_gi_schd_dt.putMode(p, INS_XFR, MCMode.REQUIRED);
		p.Hdr_strg_schd_dt.putMode(p, INS_XFR, MCMode.REQUIRED);
		p.Hdr_accpt_schd_dt.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_insp_st_schd_dt.putMode(p, INS_XFR, MCMode.REQUIRED);
		p.Hdr_insp_end_schd_dt.putMode(p, INS_XFR, MCMode.REQUIRED);
		p.Hdr_avl_schd_dt.putMode(p, INS_XFR, MCMode.REQUIRED);
		p.Hdr_sprt_lt.putMode(p, INS_XFR, MCMode.ENABLE);
		p.Hdr_oper_ptn.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_purc_lt.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_mfg_lt.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_xfr_lt.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_accpt_insp_lt.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_insp_lt.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_insp_offst.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_ord_fix_pd.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_inst_cont_qty_p_PPanel.putStatus(INS_XFR, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.REQUIRED);
		p.Hdr_yield_cont_qty_p_PPanel.putStatus(INS_XFR, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_cont_unit_p_PPanel.putStatus(INS_XFR, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);
		p.Hdr_std_cont_p_PPanel.putStatus(INS_XFR, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_cont_fctr_dec_place.putMode(p, INS_XFR, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_rnd_typ.putMode(p, INS_XFR, MCMode.INVISIBLE);
		p.Hdr_ver_flg.putMode(p, INS_XFR, MCMode.INVISIBLE);
		p.Hdr_inst_po_cnt_rmrks.putMode(p, INS_XFR, MCMode.ENABLE);
		p.Hdr_intr_rmrks.putMode(p, INS_XFR, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, INS_XFR, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, INS_XFR, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, INS_XFR, MCMode.ENABLE);
		p.Hdr_ord_rcv_flg.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_ord_snd_flg.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_ext_itm_ord_no.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_for_scheduler_frozen_flg.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_scheduler_frozen_flg.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS_XFR, MCMode.READ_ONLY);

	}

	/**
	 * [INS_XFR]ステータスの[SysInfo]ブロックのモードの設定
	 */
	protected static void statusInitINS__XFR_SysInfo(MSBCP_OrdReg p){

	}

	/**
	 * [INS_XFR]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS__XFR_Dtl(MSBCP_OrdReg p){
		p.columnDtl_oper_ord_no.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ_nm.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Dtl_oper_schd_qty_p_PPanel.putStatus(INS_XFR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.columnDtl_base_dec_place.putMode(p, INS_XFR, MCMode.INVISIBLE);
		p.columnDtl_oper_std_qty.putMode(p, INS_XFR, MCMode.INVISIBLE);
		p.columnDtl_oper_conv_qty.putMode(p, INS_XFR, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, INS_XFR, MCMode.INVISIBLE);
		p.columnDtl_unit_conv_rnd_typ.putMode(p, INS_XFR, MCMode.INVISIBLE);
		p.Dtl_oper_conv_schd_qty_p_PPanel.putStatus(INS_XFR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_oper_unit_cd.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_unit_nm.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.columnDtl_yield_oper_flg.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(INS_XFR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(INS_XFR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_oper_lt.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ_nm.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_offst.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_rsrc.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.columnDtl_ext_oper_ord_no.putMode(p, INS_XFR, MCMode.READ_ONLY);
		p.columnDtl_scheduler_frozen_flg.putMode(p, INS_XFR, MCMode.READ_ONLY);

	}

	/**
	 * [INS_XFR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__XFR_Btn(MSBCP_OrdReg p){
		p.Btn_sprt_expand_oper.putMode(p, INS_XFR, MCMode.DISABLE);
		p.Btn_upd_sav_all_oper.putMode(p, INS_XFR, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, INS_XFR, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, INS_XFR, MCMode.DISABLE);
		p.Btn_ins.putMode(p, INS_XFR, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS_XFR, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, INS_XFR, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS_XFR, MCMode.DISABLE);

	}

	/**
	 * [INS_XFR]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__XFR_EastBtn(MSBCP_OrdReg p){

	}

	/**
	 * [INS_WG_XFR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__WG__XFR_ScreenOpe(MSBCP_OrdReg p){

	}

	/**
	 * [INS_WG_XFR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__WG__XFR_Cnd(MSBCP_OrdReg p){
		p.Cnd_ope_Group.putMode(p, INS_WG_XFR, MCMode.REQUIRED);
		p.Cnd_itm_ord_no.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS_WG_XFR, MCMode.DISABLE);

	}

	/**
	 * [INS_WG_XFR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINS__WG__XFR_Top(MSBCP_OrdReg p){

	}

	/**
	 * [INS_WG_XFR]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__WG__XFR_HdrTab(MSBCP_OrdReg p){

	}

	/**
	 * [INS_WG_XFR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINS__WG__XFR_Tab1(MSBCP_OrdReg p){

	}

	/**
	 * [INS_WG_XFR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINS__WG__XFR_Tab2(MSBCP_OrdReg p){

	}

	/**
	 * [INS_WG_XFR]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS__WG__XFR_Hdr(MSBCP_OrdReg p){
		p.Hdr_itm_ord_sts_typ.putMode(p, INS_WG_XFR, MCMode.REQUIRED);
		p.Hdr_itm_ord_sts_typ_nm.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_master_dt.putMode(p, INS_WG_XFR, MCMode.REQUIRED);
		p.Hdr_itm_ord_no.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_rqmt_no.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(INS_WG_XFR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Hdr_ver_no_p_PPanel.putStatus(INS_WG_XFR, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE);
		p.Hdr_strg_loc_cd.putMode(p, INS_WG_XFR, MCMode.REQUIRED);
		p.Hdr_strg_loc_nm.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_strg_site_cd.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_strg_site_nm.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_strg_sppl_cd.putMode(p, INS_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ.putMode(p, INS_WG_XFR, MCMode.REQUIRED);
		p.Hdr_itm_ord_typ_nm.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_not_fix_flg.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_mfg_flg.putMode(p, INS_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_outsrc_flg.putMode(p, INS_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_mfg_sppl_cd.putMode(p, INS_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_mfg_maker_cd.putMode(p, INS_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_cd.putMode(p, INS_WG_XFR, MCMode.REQUIRED);
		p.Hdr_rqst_loc_nm.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_cd.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_nm.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_nmr_qty.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_dnm_qty.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_fxd_yield_qty.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_not_qty_rlt_flg.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_inst_qty_p_PPanel.putStatus(INS_WG_XFR, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.REQUIRED);
		p.Hdr_yield_schd_qty_p_PPanel.putStatus(INS_WG_XFR, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.REQUIRED);
		p.Hdr_unit_cd.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, INS_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_rnd_typ.putMode(p, INS_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_flg.putMode(p, INS_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_lmt_dt.putMode(p, INS_WG_XFR, MCMode.ENABLE);
		p.Hdr_sno_wrk_no_p_PPanel.putStatus(INS_WG_XFR, mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.ENABLE);
		p.Hdr_sno1_mng_typ.putMode(p, INS_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_sno2_mng_typ.putMode(p, INS_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_sno3_mng_typ.putMode(p, INS_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_sno4_mng_typ.putMode(p, INS_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_insp_flg.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_po_schd_dt.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_mfg_st_schd_dt.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_mfg_end_schd_dt.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_gi_schd_dt.putMode(p, INS_WG_XFR, MCMode.REQUIRED);
		p.Hdr_strg_schd_dt.putMode(p, INS_WG_XFR, MCMode.REQUIRED);
		p.Hdr_accpt_schd_dt.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_insp_st_schd_dt.putMode(p, INS_WG_XFR, MCMode.REQUIRED);
		p.Hdr_insp_end_schd_dt.putMode(p, INS_WG_XFR, MCMode.REQUIRED);
		p.Hdr_avl_schd_dt.putMode(p, INS_WG_XFR, MCMode.REQUIRED);
		p.Hdr_sprt_lt.putMode(p, INS_WG_XFR, MCMode.ENABLE);
		p.Hdr_oper_ptn.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_purc_lt.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_mfg_lt.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_xfr_lt.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_accpt_insp_lt.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_insp_lt.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_insp_offst.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_ord_fix_pd.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_inst_cont_qty_p_PPanel.putStatus(INS_WG_XFR, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.REQUIRED);
		p.Hdr_yield_cont_qty_p_PPanel.putStatus(INS_WG_XFR, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_cont_unit_p_PPanel.putStatus(INS_WG_XFR, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);
		p.Hdr_std_cont_p_PPanel.putStatus(INS_WG_XFR, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_cont_fctr_dec_place.putMode(p, INS_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_rnd_typ.putMode(p, INS_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_ver_flg.putMode(p, INS_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_inst_po_cnt_rmrks.putMode(p, INS_WG_XFR, MCMode.ENABLE);
		p.Hdr_intr_rmrks.putMode(p, INS_WG_XFR, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, INS_WG_XFR, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, INS_WG_XFR, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, INS_WG_XFR, MCMode.ENABLE);
		p.Hdr_ord_rcv_flg.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_ord_snd_flg.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_ext_itm_ord_no.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_for_scheduler_frozen_flg.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_scheduler_frozen_flg.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);

	}

	/**
	 * [INS_WG_XFR]ステータスの[SysInfo]ブロックのモードの設定
	 */
	protected static void statusInitINS__WG__XFR_SysInfo(MSBCP_OrdReg p){

	}

	/**
	 * [INS_WG_XFR]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS__WG__XFR_Dtl(MSBCP_OrdReg p){
		p.columnDtl_oper_ord_no.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ_nm.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Dtl_oper_schd_qty_p_PPanel.putStatus(INS_WG_XFR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_base_dec_place.putMode(p, INS_WG_XFR, MCMode.INVISIBLE);
		p.columnDtl_oper_std_qty.putMode(p, INS_WG_XFR, MCMode.INVISIBLE);
		p.columnDtl_oper_conv_qty.putMode(p, INS_WG_XFR, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, INS_WG_XFR, MCMode.INVISIBLE);
		p.columnDtl_unit_conv_rnd_typ.putMode(p, INS_WG_XFR, MCMode.INVISIBLE);
		p.Dtl_oper_conv_schd_qty_p_PPanel.putStatus(INS_WG_XFR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_oper_unit_cd.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_unit_nm.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_yield_oper_flg.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(INS_WG_XFR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(INS_WG_XFR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_oper_lt.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ_nm.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_offst.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_rsrc.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_ext_oper_ord_no.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_scheduler_frozen_flg.putMode(p, INS_WG_XFR, MCMode.READ_ONLY);

	}

	/**
	 * [INS_WG_XFR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__WG__XFR_Btn(MSBCP_OrdReg p){
		p.Btn_sprt_expand_oper.putMode(p, INS_WG_XFR, MCMode.DISABLE);
		p.Btn_upd_sav_all_oper.putMode(p, INS_WG_XFR, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, INS_WG_XFR, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, INS_WG_XFR, MCMode.DISABLE);
		p.Btn_ins.putMode(p, INS_WG_XFR, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS_WG_XFR, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, INS_WG_XFR, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS_WG_XFR, MCMode.DISABLE);

	}

	/**
	 * [INS_WG_XFR]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__WG__XFR_EastBtn(MSBCP_OrdReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBCP_OrdReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBCP_OrdReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_itm_ord_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBCP_OrdReg p){

	}

	/**
	 * [UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrTab(MSBCP_OrdReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBCP_OrdReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBCP_OrdReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MSBCP_OrdReg p){
		p.Hdr_itm_ord_sts_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_itm_ord_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_master_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_itm_ord_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_rqmt_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Hdr_strg_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_strg_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_strg_site_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_strg_site_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_strg_sppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_itm_ord_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_not_fix_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_mfg_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_outsrc_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_mfg_sppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_mfg_maker_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_nmr_qty.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dnm_qty.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_fxd_yield_qty.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_not_qty_rlt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_inst_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_yield_schd_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_lmt_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.READ_ONLY);
		p.Hdr_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_insp_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_po_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_mfg_st_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_mfg_end_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_gi_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_strg_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_accpt_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_st_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_end_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_avl_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sprt_lt.putMode(p, UPD, MCMode.DISABLE);
		p.Hdr_oper_ptn.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_purc_lt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_mfg_lt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_xfr_lt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_accpt_insp_lt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_lt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_offst.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ord_fix_pd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_inst_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_yield_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_cont_unit_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);
		p.Hdr_std_cont_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_cont_fctr_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ver_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_inst_po_cnt_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ord_rcv_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ord_snd_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ext_itm_ord_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_for_scheduler_frozen_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_scheduler_frozen_flg.putMode(p, UPD, MCMode.READ_ONLY);
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
	 * [UPD]ステータスの[SysInfo]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SysInfo(MSBCP_OrdReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBCP_OrdReg p){
		p.columnDtl_oper_ord_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_oper_schd_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_oper_std_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_oper_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_unit_conv_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_oper_conv_schd_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_oper_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_oper_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_yield_oper_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_oper_lt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_oper_offst.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_oper_rsrc.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ext_oper_ord_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_scheduler_frozen_flg.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBCP_OrdReg p){
		p.Btn_sprt_expand_oper.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_upd_sav_all_oper.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_ins.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_upd2.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_NONE]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NONE_ScreenOpe(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_NONE]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NONE_Cnd(MSBCP_OrdReg p){
		p.Cnd_ope_Group.putMode(p, UPD_NONE, MCMode.REQUIRED);
		p.Cnd_itm_ord_no.putMode(p, UPD_NONE, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD_NONE, MCMode.ENABLE);

	}

	/**
	 * [UPD_NONE]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NONE_Top(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_NONE]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NONE_HdrTab(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_NONE]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NONE_Tab1(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_NONE]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NONE_Tab2(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_NONE]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NONE_Hdr(MSBCP_OrdReg p){
		p.Hdr_itm_ord_sts_typ.putMode(p, UPD_NONE, MCMode.REQUIRED);
		p.Hdr_itm_ord_sts_typ_nm.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_master_dt.putMode(p, UPD_NONE, MCMode.REQUIRED);
		p.Hdr_itm_ord_no.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_rqmt_no.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(UPD_NONE, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no_p_PPanel.putStatus(UPD_NONE, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Hdr_strg_loc_cd.putMode(p, UPD_NONE, MCMode.REQUIRED);
		p.Hdr_strg_loc_nm.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_strg_site_cd.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_strg_site_nm.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_strg_sppl_cd.putMode(p, UPD_NONE, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ.putMode(p, UPD_NONE, MCMode.REQUIRED);
		p.Hdr_itm_ord_typ_nm.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_not_fix_flg.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_mfg_flg.putMode(p, UPD_NONE, MCMode.INVISIBLE);
		p.Hdr_outsrc_flg.putMode(p, UPD_NONE, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_mfg_sppl_cd.putMode(p, UPD_NONE, MCMode.INVISIBLE);
		p.Hdr_mfg_maker_cd.putMode(p, UPD_NONE, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_cd.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_nm.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_cd.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_nm.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_nmr_qty.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_dnm_qty.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_fxd_yield_qty.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_not_qty_rlt_flg.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_inst_qty_p_PPanel.putStatus(UPD_NONE, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_yield_schd_qty_p_PPanel.putStatus(UPD_NONE, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_unit_cd.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, UPD_NONE, MCMode.INVISIBLE);
		p.Hdr_rnd_typ.putMode(p, UPD_NONE, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_flg.putMode(p, UPD_NONE, MCMode.INVISIBLE);
		p.Hdr_lmt_dt.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_sno_wrk_no_p_PPanel.putStatus(UPD_NONE, mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.READ_ONLY);
		p.Hdr_sno1_mng_typ.putMode(p, UPD_NONE, MCMode.INVISIBLE);
		p.Hdr_sno2_mng_typ.putMode(p, UPD_NONE, MCMode.INVISIBLE);
		p.Hdr_sno3_mng_typ.putMode(p, UPD_NONE, MCMode.INVISIBLE);
		p.Hdr_sno4_mng_typ.putMode(p, UPD_NONE, MCMode.INVISIBLE);
		p.Hdr_insp_flg.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_po_schd_dt.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_mfg_st_schd_dt.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_mfg_end_schd_dt.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_gi_schd_dt.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_strg_schd_dt.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_accpt_schd_dt.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_insp_st_schd_dt.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_insp_end_schd_dt.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_avl_schd_dt.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_sprt_lt.putMode(p, UPD_NONE, MCMode.DISABLE);
		p.Hdr_oper_ptn.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_purc_lt.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_mfg_lt.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_xfr_lt.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_accpt_insp_lt.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_insp_lt.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_insp_offst.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_ord_fix_pd.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_inst_cont_qty_p_PPanel.putStatus(UPD_NONE, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_yield_cont_qty_p_PPanel.putStatus(UPD_NONE, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_cont_unit_p_PPanel.putStatus(UPD_NONE, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);
		p.Hdr_std_cont_p_PPanel.putStatus(UPD_NONE, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_cont_fctr_dec_place.putMode(p, UPD_NONE, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_rnd_typ.putMode(p, UPD_NONE, MCMode.INVISIBLE);
		p.Hdr_ver_flg.putMode(p, UPD_NONE, MCMode.INVISIBLE);
		p.Hdr_inst_po_cnt_rmrks.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_ord_rcv_flg.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_ord_snd_flg.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_ext_itm_ord_no.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_for_scheduler_frozen_flg.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_scheduler_frozen_flg.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD_NONE, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_NONE]ステータスの[SysInfo]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NONE_SysInfo(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_NONE]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NONE_Dtl(MSBCP_OrdReg p){
		p.columnDtl_oper_ord_no.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ_nm.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Dtl_oper_schd_qty_p_PPanel.putStatus(UPD_NONE, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.columnDtl_base_dec_place.putMode(p, UPD_NONE, MCMode.INVISIBLE);
		p.columnDtl_oper_std_qty.putMode(p, UPD_NONE, MCMode.INVISIBLE);
		p.columnDtl_oper_conv_qty.putMode(p, UPD_NONE, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, UPD_NONE, MCMode.INVISIBLE);
		p.columnDtl_unit_conv_rnd_typ.putMode(p, UPD_NONE, MCMode.INVISIBLE);
		p.Dtl_oper_conv_schd_qty_p_PPanel.putStatus(UPD_NONE, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_oper_unit_cd.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.columnDtl_oper_unit_nm.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.columnDtl_yield_oper_flg.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(UPD_NONE, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(UPD_NONE, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_oper_lt.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ_nm.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.columnDtl_oper_offst.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.columnDtl_oper_rsrc.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.columnDtl_ext_oper_ord_no.putMode(p, UPD_NONE, MCMode.READ_ONLY);
		p.columnDtl_scheduler_frozen_flg.putMode(p, UPD_NONE, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_NONE]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NONE_Btn(MSBCP_OrdReg p){
		p.Btn_sprt_expand_oper.putMode(p, UPD_NONE, MCMode.DISABLE);
		p.Btn_upd_sav_all_oper.putMode(p, UPD_NONE, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, UPD_NONE, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, UPD_NONE, MCMode.DISABLE);
		p.Btn_ins.putMode(p, UPD_NONE, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD_NONE, MCMode.DISABLE);
		p.Btn_upd2.putMode(p, UPD_NONE, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, UPD_NONE, MCMode.DISABLE);

	}

	/**
	 * [UPD_NONE]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NONE_EastBtn(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_MFG]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MFG_ScreenOpe(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_MFG]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MFG_Cnd(MSBCP_OrdReg p){
		p.Cnd_ope_Group.putMode(p, UPD_MFG, MCMode.REQUIRED);
		p.Cnd_itm_ord_no.putMode(p, UPD_MFG, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD_MFG, MCMode.ENABLE);

	}

	/**
	 * [UPD_MFG]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MFG_Top(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_MFG]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MFG_HdrTab(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_MFG]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MFG_Tab1(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_MFG]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MFG_Tab2(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_MFG]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MFG_Hdr(MSBCP_OrdReg p){
		p.Hdr_itm_ord_sts_typ.putMode(p, UPD_MFG, MCMode.REQUIRED);
		p.Hdr_itm_ord_sts_typ_nm.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_master_dt.putMode(p, UPD_MFG, MCMode.REQUIRED);
		p.Hdr_itm_ord_no.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_rqmt_no.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(UPD_MFG, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no_p_PPanel.putStatus(UPD_MFG, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Hdr_strg_loc_cd.putMode(p, UPD_MFG, MCMode.REQUIRED);
		p.Hdr_strg_loc_nm.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_strg_site_cd.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_strg_site_nm.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_strg_sppl_cd.putMode(p, UPD_MFG, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ.putMode(p, UPD_MFG, MCMode.REQUIRED);
		p.Hdr_itm_ord_typ_nm.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_not_fix_flg.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_mfg_flg.putMode(p, UPD_MFG, MCMode.INVISIBLE);
		p.Hdr_outsrc_flg.putMode(p, UPD_MFG, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, UPD_MFG, MCMode.REQUIRED);
		p.Hdr_mfg_loc_nm.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_mfg_sppl_cd.putMode(p, UPD_MFG, MCMode.INVISIBLE);
		p.Hdr_mfg_maker_cd.putMode(p, UPD_MFG, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, UPD_MFG, MCMode.REQUIRED);
		p.Hdr_sppl_cd.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_cd.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_nm.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_cd.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_nm.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_nmr_qty.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_dnm_qty.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_fxd_yield_qty.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_not_qty_rlt_flg.putMode(p, UPD_MFG, MCMode.REQUIRED);
		p.Hdr_inst_qty_p_PPanel.putStatus(UPD_MFG, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.REQUIRED);
		p.Hdr_yield_schd_qty_p_PPanel.putStatus(UPD_MFG, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.REQUIRED);
		p.Hdr_unit_cd.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, UPD_MFG, MCMode.INVISIBLE);
		p.Hdr_rnd_typ.putMode(p, UPD_MFG, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_flg.putMode(p, UPD_MFG, MCMode.INVISIBLE);
		p.Hdr_lmt_dt.putMode(p, UPD_MFG, MCMode.ENABLE);
		p.Hdr_sno_wrk_no_p_PPanel.putStatus(UPD_MFG, mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.ENABLE);
		p.Hdr_sno1_mng_typ.putMode(p, UPD_MFG, MCMode.INVISIBLE);
		p.Hdr_sno2_mng_typ.putMode(p, UPD_MFG, MCMode.INVISIBLE);
		p.Hdr_sno3_mng_typ.putMode(p, UPD_MFG, MCMode.INVISIBLE);
		p.Hdr_sno4_mng_typ.putMode(p, UPD_MFG, MCMode.INVISIBLE);
		p.Hdr_insp_flg.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_po_schd_dt.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_mfg_st_schd_dt.putMode(p, UPD_MFG, MCMode.REQUIRED);
		p.Hdr_mfg_end_schd_dt.putMode(p, UPD_MFG, MCMode.REQUIRED);
		p.Hdr_gi_schd_dt.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_strg_schd_dt.putMode(p, UPD_MFG, MCMode.REQUIRED);
		p.Hdr_accpt_schd_dt.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_insp_st_schd_dt.putMode(p, UPD_MFG, MCMode.REQUIRED);
		p.Hdr_insp_end_schd_dt.putMode(p, UPD_MFG, MCMode.REQUIRED);
		p.Hdr_avl_schd_dt.putMode(p, UPD_MFG, MCMode.REQUIRED);
		p.Hdr_sprt_lt.putMode(p, UPD_MFG, MCMode.ENABLE);
		p.Hdr_oper_ptn.putMode(p, UPD_MFG, MCMode.REQUIRED);
		p.Hdr_purc_lt.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_mfg_lt.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_xfr_lt.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_accpt_insp_lt.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_insp_lt.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_insp_offst.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_ord_fix_pd.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_inst_cont_qty_p_PPanel.putStatus(UPD_MFG, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.REQUIRED);
		p.Hdr_yield_cont_qty_p_PPanel.putStatus(UPD_MFG, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.REQUIRED);
		p.Hdr_cont_unit_p_PPanel.putStatus(UPD_MFG, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);
		p.Hdr_std_cont_p_PPanel.putStatus(UPD_MFG, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_cont_fctr_dec_place.putMode(p, UPD_MFG, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_rnd_typ.putMode(p, UPD_MFG, MCMode.INVISIBLE);
		p.Hdr_ver_flg.putMode(p, UPD_MFG, MCMode.INVISIBLE);
		p.Hdr_inst_po_cnt_rmrks.putMode(p, UPD_MFG, MCMode.ENABLE);
		p.Hdr_intr_rmrks.putMode(p, UPD_MFG, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, UPD_MFG, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, UPD_MFG, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, UPD_MFG, MCMode.ENABLE);
		p.Hdr_ord_rcv_flg.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_ord_snd_flg.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_ext_itm_ord_no.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_for_scheduler_frozen_flg.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_scheduler_frozen_flg.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD_MFG, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_MFG]ステータスの[SysInfo]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MFG_SysInfo(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_MFG]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MFG_Dtl(MSBCP_OrdReg p){
		p.columnDtl_oper_ord_no.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ.putMode(p, UPD_MFG, MCMode.REQUIRED);
		p.columnDtl_oper_ord_sts_typ_nm.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Dtl_oper_schd_qty_p_PPanel.putStatus(UPD_MFG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_base_unit_cd.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.columnDtl_base_dec_place.putMode(p, UPD_MFG, MCMode.INVISIBLE);
		p.columnDtl_oper_std_qty.putMode(p, UPD_MFG, MCMode.INVISIBLE);
		p.columnDtl_oper_conv_qty.putMode(p, UPD_MFG, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, UPD_MFG, MCMode.INVISIBLE);
		p.columnDtl_unit_conv_rnd_typ.putMode(p, UPD_MFG, MCMode.INVISIBLE);
		p.Dtl_oper_conv_schd_qty_p_PPanel.putStatus(UPD_MFG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_oper_unit_cd.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.columnDtl_oper_unit_nm.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.columnDtl_yield_oper_flg.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(UPD_MFG, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.Dtl_end_tm_p_PPanel.putStatus(UPD_MFG, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.columnDtl_oper_lt.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ_nm.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.columnDtl_oper_offst.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.columnDtl_oper_rsrc.putMode(p, UPD_MFG, MCMode.ENABLE);
		p.columnDtl_intr_rmrks.putMode(p, UPD_MFG, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, UPD_MFG, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, UPD_MFG, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, UPD_MFG, MCMode.ENABLE);
		p.columnDtl_ext_oper_ord_no.putMode(p, UPD_MFG, MCMode.READ_ONLY);
		p.columnDtl_scheduler_frozen_flg.putMode(p, UPD_MFG, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_MFG]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MFG_Btn(MSBCP_OrdReg p){
		p.Btn_sprt_expand_oper.putMode(p, UPD_MFG, MCMode.ENABLE);
		p.Btn_upd_sav_all_oper.putMode(p, UPD_MFG, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD_MFG, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD_MFG, MCMode.ENABLE);
		p.Btn_ins.putMode(p, UPD_MFG, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD_MFG, MCMode.ENABLE);
		p.Btn_upd2.putMode(p, UPD_MFG, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, UPD_MFG, MCMode.DISABLE);

	}

	/**
	 * [UPD_MFG]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MFG_EastBtn(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_PURC]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PURC_ScreenOpe(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_PURC]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PURC_Cnd(MSBCP_OrdReg p){
		p.Cnd_ope_Group.putMode(p, UPD_PURC, MCMode.REQUIRED);
		p.Cnd_itm_ord_no.putMode(p, UPD_PURC, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD_PURC, MCMode.ENABLE);

	}

	/**
	 * [UPD_PURC]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PURC_Top(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_PURC]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PURC_HdrTab(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_PURC]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PURC_Tab1(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_PURC]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PURC_Tab2(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_PURC]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PURC_Hdr(MSBCP_OrdReg p){
		p.Hdr_itm_ord_sts_typ.putMode(p, UPD_PURC, MCMode.REQUIRED);
		p.Hdr_itm_ord_sts_typ_nm.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_master_dt.putMode(p, UPD_PURC, MCMode.REQUIRED);
		p.Hdr_itm_ord_no.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_rqmt_no.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(UPD_PURC, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no_p_PPanel.putStatus(UPD_PURC, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE);
		p.Hdr_strg_loc_cd.putMode(p, UPD_PURC, MCMode.REQUIRED);
		p.Hdr_strg_loc_nm.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_strg_site_cd.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_strg_site_nm.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_strg_sppl_cd.putMode(p, UPD_PURC, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ.putMode(p, UPD_PURC, MCMode.REQUIRED);
		p.Hdr_itm_ord_typ_nm.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_not_fix_flg.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_mfg_flg.putMode(p, UPD_PURC, MCMode.INVISIBLE);
		p.Hdr_outsrc_flg.putMode(p, UPD_PURC, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_mfg_sppl_cd.putMode(p, UPD_PURC, MCMode.INVISIBLE);
		p.Hdr_mfg_maker_cd.putMode(p, UPD_PURC, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, UPD_PURC, MCMode.REQUIRED);
		p.Hdr_sppl_nm.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, UPD_PURC, MCMode.ENABLE);
		p.Hdr_maker_nm.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_cd.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_nm.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_cd.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_nm.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_nmr_qty.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_dnm_qty.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_fxd_yield_qty.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_not_qty_rlt_flg.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_inst_qty_p_PPanel.putStatus(UPD_PURC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.REQUIRED);
		p.Hdr_yield_schd_qty_p_PPanel.putStatus(UPD_PURC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.REQUIRED);
		p.Hdr_unit_cd.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, UPD_PURC, MCMode.INVISIBLE);
		p.Hdr_rnd_typ.putMode(p, UPD_PURC, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_flg.putMode(p, UPD_PURC, MCMode.INVISIBLE);
		p.Hdr_lmt_dt.putMode(p, UPD_PURC, MCMode.ENABLE);
		p.Hdr_sno_wrk_no_p_PPanel.putStatus(UPD_PURC, mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.ENABLE);
		p.Hdr_sno1_mng_typ.putMode(p, UPD_PURC, MCMode.INVISIBLE);
		p.Hdr_sno2_mng_typ.putMode(p, UPD_PURC, MCMode.INVISIBLE);
		p.Hdr_sno3_mng_typ.putMode(p, UPD_PURC, MCMode.INVISIBLE);
		p.Hdr_sno4_mng_typ.putMode(p, UPD_PURC, MCMode.INVISIBLE);
		p.Hdr_insp_flg.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_po_schd_dt.putMode(p, UPD_PURC, MCMode.REQUIRED);
		p.Hdr_mfg_st_schd_dt.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_mfg_end_schd_dt.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_gi_schd_dt.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_strg_schd_dt.putMode(p, UPD_PURC, MCMode.REQUIRED);
		p.Hdr_accpt_schd_dt.putMode(p, UPD_PURC, MCMode.REQUIRED);
		p.Hdr_insp_st_schd_dt.putMode(p, UPD_PURC, MCMode.REQUIRED);
		p.Hdr_insp_end_schd_dt.putMode(p, UPD_PURC, MCMode.REQUIRED);
		p.Hdr_avl_schd_dt.putMode(p, UPD_PURC, MCMode.REQUIRED);
		p.Hdr_sprt_lt.putMode(p, UPD_PURC, MCMode.ENABLE);
		p.Hdr_oper_ptn.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_purc_lt.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_mfg_lt.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_xfr_lt.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_accpt_insp_lt.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_insp_lt.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_insp_offst.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_ord_fix_pd.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_inst_cont_qty_p_PPanel.putStatus(UPD_PURC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.REQUIRED);
		p.Hdr_yield_cont_qty_p_PPanel.putStatus(UPD_PURC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_cont_unit_p_PPanel.putStatus(UPD_PURC, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);
		p.Hdr_std_cont_p_PPanel.putStatus(UPD_PURC, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_cont_fctr_dec_place.putMode(p, UPD_PURC, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_rnd_typ.putMode(p, UPD_PURC, MCMode.INVISIBLE);
		p.Hdr_ver_flg.putMode(p, UPD_PURC, MCMode.INVISIBLE);
		p.Hdr_inst_po_cnt_rmrks.putMode(p, UPD_PURC, MCMode.ENABLE);
		p.Hdr_intr_rmrks.putMode(p, UPD_PURC, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, UPD_PURC, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, UPD_PURC, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, UPD_PURC, MCMode.ENABLE);
		p.Hdr_ord_rcv_flg.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_ord_snd_flg.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_ext_itm_ord_no.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_for_scheduler_frozen_flg.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_scheduler_frozen_flg.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD_PURC, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_PURC]ステータスの[SysInfo]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PURC_SysInfo(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_PURC]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PURC_Dtl(MSBCP_OrdReg p){
		p.columnDtl_oper_ord_no.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ_nm.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Dtl_oper_schd_qty_p_PPanel.putStatus(UPD_PURC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.columnDtl_base_dec_place.putMode(p, UPD_PURC, MCMode.INVISIBLE);
		p.columnDtl_oper_std_qty.putMode(p, UPD_PURC, MCMode.INVISIBLE);
		p.columnDtl_oper_conv_qty.putMode(p, UPD_PURC, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, UPD_PURC, MCMode.INVISIBLE);
		p.columnDtl_unit_conv_rnd_typ.putMode(p, UPD_PURC, MCMode.INVISIBLE);
		p.Dtl_oper_conv_schd_qty_p_PPanel.putStatus(UPD_PURC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_oper_unit_cd.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.columnDtl_oper_unit_nm.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.columnDtl_yield_oper_flg.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(UPD_PURC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(UPD_PURC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_oper_lt.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ_nm.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.columnDtl_oper_offst.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.columnDtl_oper_rsrc.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.columnDtl_ext_oper_ord_no.putMode(p, UPD_PURC, MCMode.READ_ONLY);
		p.columnDtl_scheduler_frozen_flg.putMode(p, UPD_PURC, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_PURC]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PURC_Btn(MSBCP_OrdReg p){
		p.Btn_sprt_expand_oper.putMode(p, UPD_PURC, MCMode.DISABLE);
		p.Btn_upd_sav_all_oper.putMode(p, UPD_PURC, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, UPD_PURC, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, UPD_PURC, MCMode.DISABLE);
		p.Btn_ins.putMode(p, UPD_PURC, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD_PURC, MCMode.ENABLE);
		p.Btn_upd2.putMode(p, UPD_PURC, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, UPD_PURC, MCMode.DISABLE);

	}

	/**
	 * [UPD_PURC]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PURC_EastBtn(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_OUTSRC]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__OUTSRC_ScreenOpe(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_OUTSRC]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__OUTSRC_Cnd(MSBCP_OrdReg p){
		p.Cnd_ope_Group.putMode(p, UPD_OUTSRC, MCMode.REQUIRED);
		p.Cnd_itm_ord_no.putMode(p, UPD_OUTSRC, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD_OUTSRC, MCMode.ENABLE);

	}

	/**
	 * [UPD_OUTSRC]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__OUTSRC_Top(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_OUTSRC]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__OUTSRC_HdrTab(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_OUTSRC]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__OUTSRC_Tab1(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_OUTSRC]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__OUTSRC_Tab2(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_OUTSRC]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__OUTSRC_Hdr(MSBCP_OrdReg p){
		p.Hdr_itm_ord_sts_typ.putMode(p, UPD_OUTSRC, MCMode.REQUIRED);
		p.Hdr_itm_ord_sts_typ_nm.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_master_dt.putMode(p, UPD_OUTSRC, MCMode.REQUIRED);
		p.Hdr_itm_ord_no.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_rqmt_no.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(UPD_OUTSRC, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no_p_PPanel.putStatus(UPD_OUTSRC, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE);
		p.Hdr_strg_loc_cd.putMode(p, UPD_OUTSRC, MCMode.REQUIRED);
		p.Hdr_strg_loc_nm.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_strg_site_cd.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_strg_site_nm.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_strg_sppl_cd.putMode(p, UPD_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ.putMode(p, UPD_OUTSRC, MCMode.REQUIRED);
		p.Hdr_itm_ord_typ_nm.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_not_fix_flg.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_mfg_flg.putMode(p, UPD_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_outsrc_flg.putMode(p, UPD_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, UPD_OUTSRC, MCMode.REQUIRED);
		p.Hdr_mfg_loc_nm.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_mfg_sppl_cd.putMode(p, UPD_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_mfg_maker_cd.putMode(p, UPD_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, UPD_OUTSRC, MCMode.REQUIRED);
		p.Hdr_sppl_cd.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, UPD_OUTSRC, MCMode.ENABLE);
		p.Hdr_maker_nm.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_cd.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_nm.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_cd.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_nm.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_nmr_qty.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_dnm_qty.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_fxd_yield_qty.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_not_qty_rlt_flg.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_inst_qty_p_PPanel.putStatus(UPD_OUTSRC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.REQUIRED);
		p.Hdr_yield_schd_qty_p_PPanel.putStatus(UPD_OUTSRC, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.REQUIRED);
		p.Hdr_unit_cd.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, UPD_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_rnd_typ.putMode(p, UPD_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_flg.putMode(p, UPD_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_lmt_dt.putMode(p, UPD_OUTSRC, MCMode.ENABLE);
		p.Hdr_sno_wrk_no_p_PPanel.putStatus(UPD_OUTSRC, mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.ENABLE);
		p.Hdr_sno1_mng_typ.putMode(p, UPD_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_sno2_mng_typ.putMode(p, UPD_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_sno3_mng_typ.putMode(p, UPD_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_sno4_mng_typ.putMode(p, UPD_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_insp_flg.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_po_schd_dt.putMode(p, UPD_OUTSRC, MCMode.REQUIRED);
		p.Hdr_mfg_st_schd_dt.putMode(p, UPD_OUTSRC, MCMode.REQUIRED);
		p.Hdr_mfg_end_schd_dt.putMode(p, UPD_OUTSRC, MCMode.REQUIRED);
		p.Hdr_gi_schd_dt.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_strg_schd_dt.putMode(p, UPD_OUTSRC, MCMode.REQUIRED);
		p.Hdr_accpt_schd_dt.putMode(p, UPD_OUTSRC, MCMode.REQUIRED);
		p.Hdr_insp_st_schd_dt.putMode(p, UPD_OUTSRC, MCMode.REQUIRED);
		p.Hdr_insp_end_schd_dt.putMode(p, UPD_OUTSRC, MCMode.REQUIRED);
		p.Hdr_avl_schd_dt.putMode(p, UPD_OUTSRC, MCMode.REQUIRED);
		p.Hdr_sprt_lt.putMode(p, UPD_OUTSRC, MCMode.ENABLE);
		p.Hdr_oper_ptn.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_purc_lt.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_mfg_lt.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_xfr_lt.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_accpt_insp_lt.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_insp_lt.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_insp_offst.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_ord_fix_pd.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_inst_cont_qty_p_PPanel.putStatus(UPD_OUTSRC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.REQUIRED);
		p.Hdr_yield_cont_qty_p_PPanel.putStatus(UPD_OUTSRC, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_cont_unit_p_PPanel.putStatus(UPD_OUTSRC, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);
		p.Hdr_std_cont_p_PPanel.putStatus(UPD_OUTSRC, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_cont_fctr_dec_place.putMode(p, UPD_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_rnd_typ.putMode(p, UPD_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_ver_flg.putMode(p, UPD_OUTSRC, MCMode.INVISIBLE);
		p.Hdr_inst_po_cnt_rmrks.putMode(p, UPD_OUTSRC, MCMode.ENABLE);
		p.Hdr_intr_rmrks.putMode(p, UPD_OUTSRC, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, UPD_OUTSRC, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, UPD_OUTSRC, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, UPD_OUTSRC, MCMode.ENABLE);
		p.Hdr_ord_rcv_flg.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_ord_snd_flg.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_ext_itm_ord_no.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_for_scheduler_frozen_flg.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_scheduler_frozen_flg.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_OUTSRC]ステータスの[SysInfo]ブロックのモードの設定
	 */
	protected static void statusInitUPD__OUTSRC_SysInfo(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_OUTSRC]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__OUTSRC_Dtl(MSBCP_OrdReg p){
		p.columnDtl_oper_ord_no.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ_nm.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Dtl_oper_schd_qty_p_PPanel.putStatus(UPD_OUTSRC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_base_dec_place.putMode(p, UPD_OUTSRC, MCMode.INVISIBLE);
		p.columnDtl_oper_std_qty.putMode(p, UPD_OUTSRC, MCMode.INVISIBLE);
		p.columnDtl_oper_conv_qty.putMode(p, UPD_OUTSRC, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, UPD_OUTSRC, MCMode.INVISIBLE);
		p.columnDtl_unit_conv_rnd_typ.putMode(p, UPD_OUTSRC, MCMode.INVISIBLE);
		p.Dtl_oper_conv_schd_qty_p_PPanel.putStatus(UPD_OUTSRC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_oper_unit_cd.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_oper_unit_nm.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_yield_oper_flg.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(UPD_OUTSRC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(UPD_OUTSRC, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_oper_lt.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ_nm.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_oper_offst.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_oper_rsrc.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_ext_oper_ord_no.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);
		p.columnDtl_scheduler_frozen_flg.putMode(p, UPD_OUTSRC, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_OUTSRC]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__OUTSRC_Btn(MSBCP_OrdReg p){
		p.Btn_sprt_expand_oper.putMode(p, UPD_OUTSRC, MCMode.DISABLE);
		p.Btn_upd_sav_all_oper.putMode(p, UPD_OUTSRC, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, UPD_OUTSRC, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, UPD_OUTSRC, MCMode.DISABLE);
		p.Btn_ins.putMode(p, UPD_OUTSRC, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD_OUTSRC, MCMode.ENABLE);
		p.Btn_upd2.putMode(p, UPD_OUTSRC, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, UPD_OUTSRC, MCMode.DISABLE);

	}

	/**
	 * [UPD_OUTSRC]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__OUTSRC_EastBtn(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_XFR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__XFR_ScreenOpe(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_XFR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__XFR_Cnd(MSBCP_OrdReg p){
		p.Cnd_ope_Group.putMode(p, UPD_XFR, MCMode.REQUIRED);
		p.Cnd_itm_ord_no.putMode(p, UPD_XFR, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD_XFR, MCMode.ENABLE);

	}

	/**
	 * [UPD_XFR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__XFR_Top(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_XFR]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__XFR_HdrTab(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_XFR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__XFR_Tab1(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_XFR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__XFR_Tab2(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_XFR]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__XFR_Hdr(MSBCP_OrdReg p){
		p.Hdr_itm_ord_sts_typ.putMode(p, UPD_XFR, MCMode.REQUIRED);
		p.Hdr_itm_ord_sts_typ_nm.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_master_dt.putMode(p, UPD_XFR, MCMode.REQUIRED);
		p.Hdr_itm_ord_no.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_rqmt_no.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(UPD_XFR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no_p_PPanel.putStatus(UPD_XFR, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE);
		p.Hdr_strg_loc_cd.putMode(p, UPD_XFR, MCMode.REQUIRED);
		p.Hdr_strg_loc_nm.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_strg_site_cd.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_strg_site_nm.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_strg_sppl_cd.putMode(p, UPD_XFR, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ.putMode(p, UPD_XFR, MCMode.REQUIRED);
		p.Hdr_itm_ord_typ_nm.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_not_fix_flg.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_mfg_flg.putMode(p, UPD_XFR, MCMode.INVISIBLE);
		p.Hdr_outsrc_flg.putMode(p, UPD_XFR, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_mfg_sppl_cd.putMode(p, UPD_XFR, MCMode.INVISIBLE);
		p.Hdr_mfg_maker_cd.putMode(p, UPD_XFR, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_cd.putMode(p, UPD_XFR, MCMode.REQUIRED);
		p.Hdr_rqst_loc_nm.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_cd.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_nm.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_nmr_qty.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_dnm_qty.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_fxd_yield_qty.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_not_qty_rlt_flg.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_inst_qty_p_PPanel.putStatus(UPD_XFR, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.REQUIRED);
		p.Hdr_yield_schd_qty_p_PPanel.putStatus(UPD_XFR, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.REQUIRED);
		p.Hdr_unit_cd.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, UPD_XFR, MCMode.INVISIBLE);
		p.Hdr_rnd_typ.putMode(p, UPD_XFR, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_flg.putMode(p, UPD_XFR, MCMode.INVISIBLE);
		p.Hdr_lmt_dt.putMode(p, UPD_XFR, MCMode.ENABLE);
		p.Hdr_sno_wrk_no_p_PPanel.putStatus(UPD_XFR, mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.ENABLE);
		p.Hdr_sno1_mng_typ.putMode(p, UPD_XFR, MCMode.INVISIBLE);
		p.Hdr_sno2_mng_typ.putMode(p, UPD_XFR, MCMode.INVISIBLE);
		p.Hdr_sno3_mng_typ.putMode(p, UPD_XFR, MCMode.INVISIBLE);
		p.Hdr_sno4_mng_typ.putMode(p, UPD_XFR, MCMode.INVISIBLE);
		p.Hdr_insp_flg.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_po_schd_dt.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_mfg_st_schd_dt.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_mfg_end_schd_dt.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_gi_schd_dt.putMode(p, UPD_XFR, MCMode.REQUIRED);
		p.Hdr_strg_schd_dt.putMode(p, UPD_XFR, MCMode.REQUIRED);
		p.Hdr_accpt_schd_dt.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_insp_st_schd_dt.putMode(p, UPD_XFR, MCMode.REQUIRED);
		p.Hdr_insp_end_schd_dt.putMode(p, UPD_XFR, MCMode.REQUIRED);
		p.Hdr_avl_schd_dt.putMode(p, UPD_XFR, MCMode.REQUIRED);
		p.Hdr_sprt_lt.putMode(p, UPD_XFR, MCMode.ENABLE);
		p.Hdr_oper_ptn.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_purc_lt.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_mfg_lt.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_xfr_lt.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_accpt_insp_lt.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_insp_lt.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_insp_offst.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_ord_fix_pd.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_inst_cont_qty_p_PPanel.putStatus(UPD_XFR, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.REQUIRED);
		p.Hdr_yield_cont_qty_p_PPanel.putStatus(UPD_XFR, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_cont_unit_p_PPanel.putStatus(UPD_XFR, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);
		p.Hdr_std_cont_p_PPanel.putStatus(UPD_XFR, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_cont_fctr_dec_place.putMode(p, UPD_XFR, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_rnd_typ.putMode(p, UPD_XFR, MCMode.INVISIBLE);
		p.Hdr_ver_flg.putMode(p, UPD_XFR, MCMode.INVISIBLE);
		p.Hdr_inst_po_cnt_rmrks.putMode(p, UPD_XFR, MCMode.ENABLE);
		p.Hdr_intr_rmrks.putMode(p, UPD_XFR, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, UPD_XFR, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, UPD_XFR, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, UPD_XFR, MCMode.ENABLE);
		p.Hdr_ord_rcv_flg.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_ord_snd_flg.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_ext_itm_ord_no.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_for_scheduler_frozen_flg.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_scheduler_frozen_flg.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD_XFR, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_XFR]ステータスの[SysInfo]ブロックのモードの設定
	 */
	protected static void statusInitUPD__XFR_SysInfo(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_XFR]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__XFR_Dtl(MSBCP_OrdReg p){
		p.columnDtl_oper_ord_no.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ_nm.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Dtl_oper_schd_qty_p_PPanel.putStatus(UPD_XFR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.columnDtl_base_dec_place.putMode(p, UPD_XFR, MCMode.INVISIBLE);
		p.columnDtl_oper_std_qty.putMode(p, UPD_XFR, MCMode.INVISIBLE);
		p.columnDtl_oper_conv_qty.putMode(p, UPD_XFR, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, UPD_XFR, MCMode.INVISIBLE);
		p.columnDtl_unit_conv_rnd_typ.putMode(p, UPD_XFR, MCMode.INVISIBLE);
		p.Dtl_oper_conv_schd_qty_p_PPanel.putStatus(UPD_XFR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_oper_unit_cd.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_unit_nm.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.columnDtl_yield_oper_flg.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(UPD_XFR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(UPD_XFR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_oper_lt.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ_nm.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_offst.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_rsrc.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.columnDtl_ext_oper_ord_no.putMode(p, UPD_XFR, MCMode.READ_ONLY);
		p.columnDtl_scheduler_frozen_flg.putMode(p, UPD_XFR, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_XFR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__XFR_Btn(MSBCP_OrdReg p){
		p.Btn_sprt_expand_oper.putMode(p, UPD_XFR, MCMode.DISABLE);
		p.Btn_upd_sav_all_oper.putMode(p, UPD_XFR, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, UPD_XFR, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, UPD_XFR, MCMode.DISABLE);
		p.Btn_ins.putMode(p, UPD_XFR, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD_XFR, MCMode.ENABLE);
		p.Btn_upd2.putMode(p, UPD_XFR, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, UPD_XFR, MCMode.DISABLE);

	}

	/**
	 * [UPD_XFR]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__XFR_EastBtn(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_WG_XFR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__WG__XFR_ScreenOpe(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_WG_XFR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__WG__XFR_Cnd(MSBCP_OrdReg p){
		p.Cnd_ope_Group.putMode(p, UPD_WG_XFR, MCMode.REQUIRED);
		p.Cnd_itm_ord_no.putMode(p, UPD_WG_XFR, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD_WG_XFR, MCMode.ENABLE);

	}

	/**
	 * [UPD_WG_XFR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__WG__XFR_Top(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_WG_XFR]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__WG__XFR_HdrTab(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_WG_XFR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__WG__XFR_Tab1(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_WG_XFR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__WG__XFR_Tab2(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_WG_XFR]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__WG__XFR_Hdr(MSBCP_OrdReg p){
		p.Hdr_itm_ord_sts_typ.putMode(p, UPD_WG_XFR, MCMode.REQUIRED);
		p.Hdr_itm_ord_sts_typ_nm.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_master_dt.putMode(p, UPD_WG_XFR, MCMode.REQUIRED);
		p.Hdr_itm_ord_no.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_rqmt_no.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(UPD_WG_XFR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no_p_PPanel.putStatus(UPD_WG_XFR, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE);
		p.Hdr_strg_loc_cd.putMode(p, UPD_WG_XFR, MCMode.REQUIRED);
		p.Hdr_strg_loc_nm.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_strg_site_cd.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_strg_site_nm.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_strg_sppl_cd.putMode(p, UPD_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ.putMode(p, UPD_WG_XFR, MCMode.REQUIRED);
		p.Hdr_itm_ord_typ_nm.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_not_fix_flg.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_mfg_flg.putMode(p, UPD_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_outsrc_flg.putMode(p, UPD_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_mfg_sppl_cd.putMode(p, UPD_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_mfg_maker_cd.putMode(p, UPD_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_cd.putMode(p, UPD_WG_XFR, MCMode.REQUIRED);
		p.Hdr_rqst_loc_nm.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_cd.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_nm.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_nmr_qty.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_dnm_qty.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_fxd_yield_qty.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_not_qty_rlt_flg.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_inst_qty_p_PPanel.putStatus(UPD_WG_XFR, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.REQUIRED);
		p.Hdr_yield_schd_qty_p_PPanel.putStatus(UPD_WG_XFR, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.REQUIRED);
		p.Hdr_unit_cd.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, UPD_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_rnd_typ.putMode(p, UPD_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_flg.putMode(p, UPD_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_lmt_dt.putMode(p, UPD_WG_XFR, MCMode.ENABLE);
		p.Hdr_sno_wrk_no_p_PPanel.putStatus(UPD_WG_XFR, mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.ENABLE);
		p.Hdr_sno1_mng_typ.putMode(p, UPD_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_sno2_mng_typ.putMode(p, UPD_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_sno3_mng_typ.putMode(p, UPD_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_sno4_mng_typ.putMode(p, UPD_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_insp_flg.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_po_schd_dt.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_mfg_st_schd_dt.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_mfg_end_schd_dt.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_gi_schd_dt.putMode(p, UPD_WG_XFR, MCMode.REQUIRED);
		p.Hdr_strg_schd_dt.putMode(p, UPD_WG_XFR, MCMode.REQUIRED);
		p.Hdr_accpt_schd_dt.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_insp_st_schd_dt.putMode(p, UPD_WG_XFR, MCMode.REQUIRED);
		p.Hdr_insp_end_schd_dt.putMode(p, UPD_WG_XFR, MCMode.REQUIRED);
		p.Hdr_avl_schd_dt.putMode(p, UPD_WG_XFR, MCMode.REQUIRED);
		p.Hdr_sprt_lt.putMode(p, UPD_WG_XFR, MCMode.ENABLE);
		p.Hdr_oper_ptn.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_purc_lt.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_mfg_lt.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_xfr_lt.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_accpt_insp_lt.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_insp_lt.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_insp_offst.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_ord_fix_pd.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_inst_cont_qty_p_PPanel.putStatus(UPD_WG_XFR, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.REQUIRED);
		p.Hdr_yield_cont_qty_p_PPanel.putStatus(UPD_WG_XFR, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_cont_unit_p_PPanel.putStatus(UPD_WG_XFR, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);
		p.Hdr_std_cont_p_PPanel.putStatus(UPD_WG_XFR, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_cont_fctr_dec_place.putMode(p, UPD_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_rnd_typ.putMode(p, UPD_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_ver_flg.putMode(p, UPD_WG_XFR, MCMode.INVISIBLE);
		p.Hdr_inst_po_cnt_rmrks.putMode(p, UPD_WG_XFR, MCMode.ENABLE);
		p.Hdr_intr_rmrks.putMode(p, UPD_WG_XFR, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, UPD_WG_XFR, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, UPD_WG_XFR, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, UPD_WG_XFR, MCMode.ENABLE);
		p.Hdr_ord_rcv_flg.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_ord_snd_flg.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_ext_itm_ord_no.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_for_scheduler_frozen_flg.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_scheduler_frozen_flg.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_WG_XFR]ステータスの[SysInfo]ブロックのモードの設定
	 */
	protected static void statusInitUPD__WG__XFR_SysInfo(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_WG_XFR]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__WG__XFR_Dtl(MSBCP_OrdReg p){
		p.columnDtl_oper_ord_no.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ_nm.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Dtl_oper_schd_qty_p_PPanel.putStatus(UPD_WG_XFR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_base_dec_place.putMode(p, UPD_WG_XFR, MCMode.INVISIBLE);
		p.columnDtl_oper_std_qty.putMode(p, UPD_WG_XFR, MCMode.INVISIBLE);
		p.columnDtl_oper_conv_qty.putMode(p, UPD_WG_XFR, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, UPD_WG_XFR, MCMode.INVISIBLE);
		p.columnDtl_unit_conv_rnd_typ.putMode(p, UPD_WG_XFR, MCMode.INVISIBLE);
		p.Dtl_oper_conv_schd_qty_p_PPanel.putStatus(UPD_WG_XFR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_oper_unit_cd.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_unit_nm.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_yield_oper_flg.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(UPD_WG_XFR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(UPD_WG_XFR, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_oper_lt.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ_nm.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_offst.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_oper_rsrc.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_ext_oper_ord_no.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);
		p.columnDtl_scheduler_frozen_flg.putMode(p, UPD_WG_XFR, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_WG_XFR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__WG__XFR_Btn(MSBCP_OrdReg p){
		p.Btn_sprt_expand_oper.putMode(p, UPD_WG_XFR, MCMode.DISABLE);
		p.Btn_upd_sav_all_oper.putMode(p, UPD_WG_XFR, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, UPD_WG_XFR, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, UPD_WG_XFR, MCMode.DISABLE);
		p.Btn_ins.putMode(p, UPD_WG_XFR, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD_WG_XFR, MCMode.ENABLE);
		p.Btn_upd2.putMode(p, UPD_WG_XFR, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, UPD_WG_XFR, MCMode.DISABLE);

	}

	/**
	 * [UPD_WG_XFR]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__WG__XFR_EastBtn(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_CANFIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_ScreenOpe(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_CANFIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_Cnd(MSBCP_OrdReg p){
		p.Cnd_ope_Group.putMode(p, UPD_CANFIX, MCMode.REQUIRED);
		p.Cnd_itm_ord_no.putMode(p, UPD_CANFIX, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD_CANFIX, MCMode.ENABLE);

	}

	/**
	 * [UPD_CANFIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_Top(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_CANFIX]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_HdrTab(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_CANFIX]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_Tab1(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_CANFIX]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_Tab2(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_CANFIX]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_Hdr(MSBCP_OrdReg p){
		p.Hdr_itm_ord_sts_typ.putMode(p, UPD_CANFIX, MCMode.REQUIRED);
		p.Hdr_itm_ord_sts_typ_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_master_dt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_itm_ord_no.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_rqmt_no.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Hdr_strg_loc_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_strg_loc_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_strg_site_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_strg_site_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_strg_sppl_cd.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_not_fix_flg.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_mfg_flg.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.Hdr_outsrc_flg.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_mfg_sppl_cd.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.Hdr_mfg_maker_cd.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_nmr_qty.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_dnm_qty.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_fxd_yield_qty.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_not_qty_rlt_flg.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_inst_qty_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_yield_schd_qty_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_unit_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.Hdr_rnd_typ.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_flg.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.Hdr_lmt_dt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_sno_wrk_no_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.READ_ONLY);
		p.Hdr_sno1_mng_typ.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.Hdr_sno2_mng_typ.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.Hdr_sno3_mng_typ.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.Hdr_sno4_mng_typ.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.Hdr_insp_flg.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_po_schd_dt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_mfg_st_schd_dt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_mfg_end_schd_dt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_gi_schd_dt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_strg_schd_dt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_accpt_schd_dt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_insp_st_schd_dt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_insp_end_schd_dt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_avl_schd_dt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_sprt_lt.putMode(p, UPD_CANFIX, MCMode.DISABLE);
		p.Hdr_oper_ptn.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_purc_lt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_mfg_lt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_xfr_lt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_accpt_insp_lt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_insp_lt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_insp_offst.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_ord_fix_pd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_inst_cont_qty_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_yield_cont_qty_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_cont_unit_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);
		p.Hdr_std_cont_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_cont_fctr_dec_place.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_rnd_typ.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.Hdr_ver_flg.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.Hdr_inst_po_cnt_rmrks.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_ord_rcv_flg.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_ord_snd_flg.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_ext_itm_ord_no.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_for_scheduler_frozen_flg.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_scheduler_frozen_flg.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_CANFIX]ステータスの[SysInfo]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_SysInfo(MSBCP_OrdReg p){

	}

	/**
	 * [UPD_CANFIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_Dtl(MSBCP_OrdReg p){
		p.columnDtl_oper_ord_no.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Dtl_oper_schd_qty_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnDtl_base_dec_place.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.columnDtl_oper_std_qty.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.columnDtl_oper_conv_qty.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.columnDtl_unit_conv_rnd_typ.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.Dtl_oper_conv_schd_qty_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_oper_unit_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnDtl_oper_unit_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnDtl_yield_oper_flg.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_oper_lt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnDtl_oper_offst.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnDtl_oper_rsrc.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnDtl_ext_oper_ord_no.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnDtl_scheduler_frozen_flg.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_CANFIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_Btn(MSBCP_OrdReg p){
		p.Btn_sprt_expand_oper.putMode(p, UPD_CANFIX, MCMode.DISABLE);
		p.Btn_upd_sav_all_oper.putMode(p, UPD_CANFIX, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, UPD_CANFIX, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, UPD_CANFIX, MCMode.DISABLE);
		p.Btn_ins.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD_CANFIX, MCMode.DISABLE);

	}

	/**
	 * [UPD_CANFIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_EastBtn(MSBCP_OrdReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBCP_OrdReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBCP_OrdReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_itm_ord_no.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MSBCP_OrdReg p){

	}

	/**
	 * [DEL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HdrTab(MSBCP_OrdReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MSBCP_OrdReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MSBCP_OrdReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MSBCP_OrdReg p){
		p.Hdr_itm_ord_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_itm_ord_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_master_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_itm_ord_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rqmt_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Hdr_strg_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_strg_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_strg_site_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_strg_site_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_strg_sppl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_not_fix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_mfg_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_outsrc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_mfg_sppl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_mfg_maker_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_nmr_qty.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dnm_qty.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_fxd_yield_qty.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_not_qty_rlt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_inst_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_yield_schd_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_lmt_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.READ_ONLY);
		p.Hdr_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_insp_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_po_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_mfg_st_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_mfg_end_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_gi_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_strg_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_accpt_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_st_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_end_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_avl_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sprt_lt.putMode(p, DEL, MCMode.DISABLE);
		p.Hdr_oper_ptn.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_purc_lt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_mfg_lt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_xfr_lt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_accpt_insp_lt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_lt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_insp_offst.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ord_fix_pd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_inst_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_yield_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_cont_unit_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);
		p.Hdr_std_cont_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_cont_fctr_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ver_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_inst_po_cnt_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ord_rcv_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ord_snd_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ext_itm_ord_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_for_scheduler_frozen_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_scheduler_frozen_flg.putMode(p, DEL, MCMode.READ_ONLY);
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
	 * [DEL]ステータスの[SysInfo]ブロックのモードの設定
	 */
	protected static void statusInitDEL_SysInfo(MSBCP_OrdReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MSBCP_OrdReg p){
		p.columnDtl_oper_ord_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_oper_schd_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_oper_std_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_oper_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_unit_conv_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_oper_conv_schd_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_oper_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_oper_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_yield_oper_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_oper_lt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_oper_offst.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_oper_rsrc.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ext_oper_ord_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_scheduler_frozen_flg.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBCP_OrdReg p){
		p.Btn_sprt_expand_oper.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd_sav_all_oper.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_ins.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBCP_OrdReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBCP_OrdReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBCP_OrdReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_itm_ord_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Top(MSBCP_OrdReg p){

	}

	/**
	 * [FIX_I]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_HdrTab(MSBCP_OrdReg p){

	}

	/**
	 * [FIX_I]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Tab1(MSBCP_OrdReg p){

	}

	/**
	 * [FIX_I]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Tab2(MSBCP_OrdReg p){

	}

	/**
	 * [FIX_I]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr(MSBCP_OrdReg p){
		p.Hdr_itm_ord_sts_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_itm_ord_sts_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_master_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_itm_ord_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rqmt_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Hdr_strg_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_strg_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_strg_site_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_strg_site_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_strg_sppl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_not_fix_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_mfg_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_outsrc_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_mfg_sppl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_mfg_maker_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_nmr_qty.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dnm_qty.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_fxd_yield_qty.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_not_qty_rlt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_inst_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_yield_schd_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_lmt_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sno_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.READ_ONLY);
		p.Hdr_sno1_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_sno2_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_sno3_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_sno4_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_insp_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_po_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_mfg_st_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_mfg_end_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_gi_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_strg_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_accpt_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_st_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_end_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_avl_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sprt_lt.putMode(p, FIX_I, MCMode.DISABLE);
		p.Hdr_oper_ptn.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_purc_lt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_mfg_lt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_xfr_lt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_accpt_insp_lt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_lt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_insp_offst.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ord_fix_pd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_inst_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_yield_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_cont_unit_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);
		p.Hdr_std_cont_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_cont_fctr_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ver_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_inst_po_cnt_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ord_rcv_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ord_snd_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ext_itm_ord_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_for_scheduler_frozen_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_scheduler_frozen_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
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
	 * [FIX_I]ステータスの[SysInfo]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_SysInfo(MSBCP_OrdReg p){

	}

	/**
	 * [FIX_I]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl(MSBCP_OrdReg p){
		p.columnDtl_oper_ord_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_oper_schd_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_oper_std_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_oper_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_unit_conv_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_oper_conv_schd_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_oper_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_oper_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_yield_oper_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_oper_lt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_oper_offst.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_oper_rsrc.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ext_oper_ord_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_scheduler_frozen_flg.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBCP_OrdReg p){
		p.Btn_sprt_expand_oper.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd_sav_all_oper.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MSBCP_OrdReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBCP_OrdReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBCP_OrdReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_itm_ord_no.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MSBCP_OrdReg p){

	}

	/**
	 * [FIX_U]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrTab(MSBCP_OrdReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab1(MSBCP_OrdReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab2(MSBCP_OrdReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MSBCP_OrdReg p){
		p.Hdr_itm_ord_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_itm_ord_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_master_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_itm_ord_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rqmt_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Hdr_strg_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_strg_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_strg_site_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_strg_site_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_strg_sppl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_not_fix_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_mfg_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_outsrc_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_mfg_sppl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_mfg_maker_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_nmr_qty.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dnm_qty.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_fxd_yield_qty.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_not_qty_rlt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_inst_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_yield_schd_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_lmt_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.READ_ONLY);
		p.Hdr_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_insp_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_po_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_mfg_st_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_mfg_end_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_gi_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_strg_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_accpt_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_st_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_end_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_avl_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sprt_lt.putMode(p, FIX_U, MCMode.DISABLE);
		p.Hdr_oper_ptn.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_purc_lt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_mfg_lt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_xfr_lt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_accpt_insp_lt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_lt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_insp_offst.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ord_fix_pd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_inst_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_yield_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_cont_unit_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);
		p.Hdr_std_cont_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_cont_fctr_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ver_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_inst_po_cnt_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ord_rcv_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ord_snd_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ext_itm_ord_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_for_scheduler_frozen_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_scheduler_frozen_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
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
	 * [FIX_U]ステータスの[SysInfo]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_SysInfo(MSBCP_OrdReg p){

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MSBCP_OrdReg p){
		p.columnDtl_oper_ord_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_oper_schd_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_oper_std_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_oper_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_unit_conv_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_oper_conv_schd_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_oper_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_oper_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_yield_oper_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_oper_lt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_oper_offst.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_oper_rsrc.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ext_oper_ord_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_scheduler_frozen_flg.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBCP_OrdReg p){
		p.Btn_sprt_expand_oper.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd_sav_all_oper.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd2.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBCP_OrdReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MSBCP_OrdReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBCP_OrdReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_itm_ord_no.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Top(MSBCP_OrdReg p){

	}

	/**
	 * [FIX_D]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_HdrTab(MSBCP_OrdReg p){

	}

	/**
	 * [FIX_D]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Tab1(MSBCP_OrdReg p){

	}

	/**
	 * [FIX_D]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Tab2(MSBCP_OrdReg p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MSBCP_OrdReg p){
		p.Hdr_itm_ord_sts_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_itm_ord_sts_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_master_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_itm_ord_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rqmt_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Hdr_strg_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_strg_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_strg_site_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_strg_site_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_strg_sppl_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_not_fix_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_mfg_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_outsrc_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_mfg_sppl_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_mfg_maker_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_nmr_qty.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dnm_qty.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_fxd_yield_qty.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_not_qty_rlt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_inst_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_yield_schd_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_lmt_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sno_wrk_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.READ_ONLY);
		p.Hdr_sno1_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_sno2_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_sno3_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_sno4_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_insp_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_po_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_mfg_st_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_mfg_end_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_gi_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_strg_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_accpt_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_st_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_end_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_avl_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sprt_lt.putMode(p, FIX_D, MCMode.DISABLE);
		p.Hdr_oper_ptn.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_purc_lt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_mfg_lt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_xfr_lt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_accpt_insp_lt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_lt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_insp_offst.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ord_fix_pd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_inst_cont_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_yield_cont_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_cont_unit_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);
		p.Hdr_std_cont_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_cont_fctr_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ver_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_inst_po_cnt_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ord_rcv_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ord_snd_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ext_itm_ord_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_for_scheduler_frozen_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_scheduler_frozen_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
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
	 * [FIX_D]ステータスの[SysInfo]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_SysInfo(MSBCP_OrdReg p){

	}

	/**
	 * [FIX_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl(MSBCP_OrdReg p){
		p.columnDtl_oper_ord_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_oper_schd_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_oper_std_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_oper_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_unit_conv_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_oper_conv_schd_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_oper_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_oper_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_yield_oper_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_oper_lt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_oper_offst.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_oper_rsrc.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ext_oper_ord_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_scheduler_frozen_flg.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBCP_OrdReg p){
		p.Btn_sprt_expand_oper.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_upd_sav_all_oper.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBCP_OrdReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBCP_OrdReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBCP_OrdReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_ord_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBCP_OrdReg p){

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBCP_OrdReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBCP_OrdReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBCP_OrdReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBCP_OrdReg p){
		p.Hdr_itm_ord_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_itm_ord_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_master_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_itm_ord_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rqmt_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Hdr_strg_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_strg_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_strg_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_strg_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_strg_sppl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_not_fix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_mfg_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_outsrc_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_mfg_sppl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_mfg_maker_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_nmr_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dnm_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_fxd_yield_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_not_qty_rlt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_inst_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_yield_schd_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_lmt_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.READ_ONLY);
		p.Hdr_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_insp_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_po_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_mfg_st_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_mfg_end_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_gi_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_strg_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_accpt_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_st_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_end_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_avl_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sprt_lt.putMode(p, SRCH, MCMode.DISABLE);
		p.Hdr_oper_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_purc_lt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_mfg_lt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_xfr_lt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_accpt_insp_lt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_lt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_offst.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ord_fix_pd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_inst_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_yield_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_cont_unit_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);
		p.Hdr_std_cont_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_cont_fctr_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ver_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_inst_po_cnt_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ord_rcv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ord_snd_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ext_itm_ord_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_for_scheduler_frozen_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_scheduler_frozen_flg.putMode(p, SRCH, MCMode.READ_ONLY);
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
	 * [SRCH]ステータスの[SysInfo]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SysInfo(MSBCP_OrdReg p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBCP_OrdReg p){
		p.columnDtl_oper_ord_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_oper_schd_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_oper_std_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_oper_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_unit_conv_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_oper_conv_schd_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_oper_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_oper_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_yield_oper_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_oper_lt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_oper_offst.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_oper_rsrc.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_oper_ord_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_scheduler_frozen_flg.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBCP_OrdReg p){
		p.Btn_sprt_expand_oper.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_sav_all_oper.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBCP_OrdReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBCP_OrdReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBCP_OrdReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_ord_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBCP_OrdReg p){

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBCP_OrdReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBCP_OrdReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBCP_OrdReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBCP_OrdReg p){
		p.Hdr_itm_ord_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_itm_ord_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_master_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_itm_ord_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rqmt_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Hdr_strg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_strg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_strg_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_strg_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_strg_sppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_itm_ord_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_not_fix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_mfg_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_outsrc_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_mfg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_mfg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_mfg_sppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_mfg_maker_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_maker_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_maker_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rqst_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rqst_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_nmr_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dnm_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_fxd_yield_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_not_qty_rlt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_inst_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_yield_schd_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.Hdr_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_lmt_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0040.MSUBP_SnoWrkNo_H.READ_ONLY);
		p.Hdr_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_insp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_po_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_mfg_st_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_mfg_end_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_gi_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_strg_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_accpt_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_st_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_end_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_avl_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sprt_lt.putMode(p, REF, MCMode.DISABLE);
		p.Hdr_oper_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_purc_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_mfg_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_xfr_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_accpt_insp_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_offst.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ord_fix_pd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_inst_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_yield_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.Hdr_cont_unit_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0360.MAUBP_ContFctrUnit_H.READ_ONLY);
		p.Hdr_std_cont_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.READ_ONLY);
		p.Hdr_cont_fctr_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_cont_fctr_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ver_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_inst_po_cnt_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ord_rcv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ord_snd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ext_sys_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ext_sys_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ext_itm_ord_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_for_scheduler_frozen_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_scheduler_frozen_flg.putMode(p, REF, MCMode.READ_ONLY);
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
	 * [REF]ステータスの[SysInfo]ブロックのモードの設定
	 */
	protected static void statusInitREF_SysInfo(MSBCP_OrdReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MSBCP_OrdReg p){
		p.columnDtl_oper_ord_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_ord_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_oper_schd_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_oper_std_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_oper_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_unit_conv_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_oper_conv_schd_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_oper_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_yield_oper_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_st_tm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl_end_tm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl_oper_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_offst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_offst.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_rsrc.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ext_oper_ord_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_scheduler_frozen_flg.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBCP_OrdReg p){
		p.Btn_sprt_expand_oper.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_sav_all_oper.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_ins.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBCP_OrdReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return INS;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBCP_OrdReg_MC.setTableConfigDtl((MSBCP_OrdReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBCP_OrdReg p) {
		p.columnDtl_oper_ord_no.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.oper_ord_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_ord_no);
		p.columnDtl_oper_ord_sts_typ.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.oper_ord_sts_typ_META);
		p.columnDtl_oper_ord_sts_typ.addLinkBeans(p.columnDtl_oper_ord_sts_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_ord_sts_typ);
		p.columnDtl_oper_ord_sts_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.oper_ord_sts_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_ord_sts_typ_nm);
		p.columnDtl_oper_cd.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.oper_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_cd);
		p.columnDtl_oper_nm.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.oper_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_nm);
		p.columnDtl_oper_seq.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.oper_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_seq);
		p.columnDtl_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.loc_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_cd);
		p.columnDtl_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_nm);
		p.columnDtl_disp_seq.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.disp_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_disp_seq);
		p.DtlTable.addTable(p.Dtl_oper_schd_qty_p_PPanel.QtyTable);
		p.columnDtl_base_unit_cd.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_cd);
		p.columnDtl_base_unit_nm.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_nm);
		p.columnDtl_base_dec_place.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.base_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_dec_place);
		p.columnDtl_oper_std_qty.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.oper_std_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_std_qty);
		p.columnDtl_oper_conv_qty.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.oper_conv_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_conv_qty);
		p.columnDtl_dec_place.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dec_place);
		p.columnDtl_unit_conv_rnd_typ.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.unit_conv_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_unit_conv_rnd_typ);
		p.DtlTable.addTable(p.Dtl_oper_conv_schd_qty_p_PPanel.QtyTable);
		p.columnDtl_oper_unit_cd.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.oper_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_unit_cd);
		p.columnDtl_oper_unit_nm.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.oper_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_unit_nm);
		p.columnDtl_yield_oper_flg.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.yield_oper_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_yield_oper_flg);
		p.DtlTable.addTable(p.Dtl_st_tm_p_PPanel.YmdHmTable);
		p.DtlTable.addTable(p.Dtl_end_tm_p_PPanel.YmdHmTable);
		p.columnDtl_oper_lt.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.oper_lt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_lt);
		p.columnDtl_oper_offst_typ.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.oper_offst_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_offst_typ);
		p.columnDtl_oper_offst_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.oper_offst_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_offst_typ_nm);
		p.columnDtl_oper_offst.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.oper_offst_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_offst);
		p.columnDtl_oper_rsrc.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.oper_rsrc_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_rsrc);
		p.columnDtl_intr_rmrks.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.intr_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_intr_rmrks);
		p.columnDtl_sub_char1.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char1);
		p.columnDtl_sub_char2.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char2);
		p.columnDtl_sub_char3.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char3);
		p.columnDtl_ext_oper_ord_no.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.ext_oper_ord_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_oper_ord_no);
		p.columnDtl_scheduler_frozen_flg.setMeta(mcframe.clientMSBC.MSBCP0040.DtlR.scheduler_frozen_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_scheduler_frozen_flg);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Hdr_itm_ord_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_itm_ord_sts_typ.getListConfig().setPutter(getHdr_itm_ord_sts_typ_ListPutter());
		Hdr_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getHdr_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Hdr_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getHdr_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Hdr_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getHdr_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Hdr_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getHdr_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Hdr_strg_loc_cd.getListConfig().setPutter(getHdr_strg_loc_cd_ListPutter());
		Hdr_itm_ord_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_itm_ord_typ.getListConfig().setPutter(getHdr_itm_ord_typ_ListPutter());
		Hdr_mfg_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_mfg_loc_cd.getListConfig().setPutter(getHdr_mfg_loc_cd_ListPutter());
		Hdr_bom_ptn.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_bom_ptn.getListConfig().setPutter(getHdr_bom_ptn_ListPutter());
		Hdr_sppl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_sppl_cd.getListConfig().setPutter(getHdr_sppl_cd_ListPutter());
		Hdr_maker_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_maker_cd.getListConfig().setPutter(getHdr_maker_cd_ListPutter());
		Hdr_rqst_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_rqst_loc_cd.getListConfig().setPutter(getHdr_rqst_loc_cd_ListPutter());
		Hdr_oper_ptn.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_oper_ptn.getListConfig().setPutter(getHdr_oper_ptn_ListPutter());
		columnDtl_oper_ord_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_oper_ord_sts_typ.getListConfig().setPutter(getDtl_oper_ord_sts_typ_ListPutter());
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
	 * この画面を[INS_NONE]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_NONEStatus() {
		status = INS_NONE;
		setAllStatus(status);
	}

	/**
	 * この画面を[INS_MFG]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_MFGStatus() {
		status = INS_MFG;
		setAllStatus(status);
	}

	/**
	 * この画面を[INS_PURC]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_PURCStatus() {
		status = INS_PURC;
		setAllStatus(status);
	}

	/**
	 * この画面を[INS_OUTSRC]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_OUTSRCStatus() {
		status = INS_OUTSRC;
		setAllStatus(status);
	}

	/**
	 * この画面を[INS_XFR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_XFRStatus() {
		status = INS_XFR;
		setAllStatus(status);
	}

	/**
	 * この画面を[INS_WG_XFR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_WG_XFRStatus() {
		status = INS_WG_XFR;
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
	 * この画面を[UPD_NONE]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_NONEStatus() {
		status = UPD_NONE;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_MFG]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_MFGStatus() {
		status = UPD_MFG;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_PURC]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_PURCStatus() {
		status = UPD_PURC;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_OUTSRC]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_OUTSRCStatus() {
		status = UPD_OUTSRC;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_XFR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_XFRStatus() {
		status = UPD_XFR;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_WG_XFR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_WG_XFRStatus() {
		status = UPD_WG_XFR;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_CANFIX]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_CANFIXStatus() {
		status = UPD_CANFIX;
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
	 * この画面を[FIX_I]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_IStatus() {
		status = FIX_I;
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
	 * この画面を[FIX_D]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_DStatus() {
		status = FIX_D;
		setAllStatus(status);
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
		if (INS.equals(status)) {
			setINSStatus();
		}
		else if (INS_NONE.equals(status)) {
			setINS_NONEStatus();
		}
		else if (INS_MFG.equals(status)) {
			setINS_MFGStatus();
		}
		else if (INS_PURC.equals(status)) {
			setINS_PURCStatus();
		}
		else if (INS_OUTSRC.equals(status)) {
			setINS_OUTSRCStatus();
		}
		else if (INS_XFR.equals(status)) {
			setINS_XFRStatus();
		}
		else if (INS_WG_XFR.equals(status)) {
			setINS_WG_XFRStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (UPD_NONE.equals(status)) {
			setUPD_NONEStatus();
		}
		else if (UPD_MFG.equals(status)) {
			setUPD_MFGStatus();
		}
		else if (UPD_PURC.equals(status)) {
			setUPD_PURCStatus();
		}
		else if (UPD_OUTSRC.equals(status)) {
			setUPD_OUTSRCStatus();
		}
		else if (UPD_XFR.equals(status)) {
			setUPD_XFRStatus();
		}
		else if (UPD_WG_XFR.equals(status)) {
			setUPD_WG_XFRStatus();
		}
		else if (UPD_CANFIX.equals(status)) {
			setUPD_CANFIXStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (FIX_I.equals(status)) {
			setFIX_IStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (FIX_D.equals(status)) {
			setFIX_DStatus();
		}
		else if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * [Hdr_itm_ord_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_itm_ord_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.ItmOrdStsTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Hdr_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createHdr_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Hdr_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createHdr_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Hdr_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createHdr_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Hdr_strg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_strg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Hdr_itm_ord_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_itm_ord_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.ItmOrdTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_mfg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_mfg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlMfgLoc");
		return lp;
	}
	 
	/**
	 * [Hdr_bom_ptn_ListPutter]の作成
	 */
	protected MCListPutter createHdr_bom_ptn_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlBomPtn");
		return lp;
	}
	 
	/**
	 * [Hdr_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlSppl");
		return lp;
	}
	 
	/**
	 * [Hdr_maker_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_maker_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlMaker");
		return lp;
	}
	 
	/**
	 * [Hdr_rqst_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_rqst_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlRqstLoc");
		return lp;
	}
	 
	/**
	 * [Hdr_oper_ptn_ListPutter]の作成
	 */
	protected MCListPutter createHdr_oper_ptn_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmOper");
		return lp;
	}
	 
	/**
	 * [Dtl_oper_ord_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_oper_ord_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.OperOrdStsTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Hdr_itm_ord_sts_typ) return getHdr_itm_ord_sts_typ(row, info);
		if(combo == Hdr_itm_p_PPanel.Itm_itm_cd) return getHdr_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Hdr_itm_p_PPanel.Itm_itm_sub1) return getHdr_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Hdr_itm_p_PPanel.Itm_itm_sub2) return getHdr_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Hdr_itm_p_PPanel.Itm_itm_sub3) return getHdr_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Hdr_strg_loc_cd) return getHdr_strg_loc_cd(row, info);
		if(combo == Hdr_itm_ord_typ) return getHdr_itm_ord_typ(row, info);
		if(combo == Hdr_mfg_loc_cd) return getHdr_mfg_loc_cd(row, info);
		if(combo == Hdr_bom_ptn) return getHdr_bom_ptn(row, info);
		if(combo == Hdr_sppl_cd) return getHdr_sppl_cd(row, info);
		if(combo == Hdr_maker_cd) return getHdr_maker_cd(row, info);
		if(combo == Hdr_rqst_loc_cd) return getHdr_rqst_loc_cd(row, info);
		if(combo == Hdr_oper_ptn) return getHdr_oper_ptn(row, info);
		if(combo == columnDtl_oper_ord_sts_typ) return getDtl_oper_ord_sts_typ(row, info);
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
		else if (ap == Hdr_sprt_lt) doHdr_sprt_lt(info);
		else if (ap == Btn_sprt_expand_oper) doBtn_sprt_expand_oper(info);
		else if (ap == Btn_upd_sav_all_oper) doBtn_upd_sav_all_oper(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_ins) doBtn_ins(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_upd2) doBtn_upd2(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Hdr]パネルの[sprt_lt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doHdr_sprt_lt(MCEventInfo info);

	/**
	 * [Btn]パネルの[sprt_expand_oper]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_sprt_expand_oper(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_sav_all_oper]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_sav_all_oper(MCEventInfo info);

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
	 * [Btn]パネルの[upd2]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd2(MCEventInfo info);

	/**
	 * [Btn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del(MCEventInfo info);

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
		if (vc == Cnd_itm_ord_no) return doCnd_itm_ord_no_VC(info);
		if (vc == Hdr_itm_ord_sts_typ) return doHdr_itm_ord_sts_typ_VC(info);
		if (vc == Hdr_itm_ord_sts_typ_nm) return doHdr_itm_ord_sts_typ_nm_VC(info);
		if (vc == Hdr_master_dt) return doHdr_master_dt_VC(info);
		if (vc == Hdr_itm_ord_no) return doHdr_itm_ord_no_VC(info);
		if (vc == Hdr_rqmt_no) return doHdr_rqmt_no_VC(info);
		if (vc == Hdr_strg_loc_cd) return doHdr_strg_loc_cd_VC(info);
		if (vc == Hdr_strg_loc_nm) return doHdr_strg_loc_nm_VC(info);
		if (vc == Hdr_strg_site_cd) return doHdr_strg_site_cd_VC(info);
		if (vc == Hdr_strg_site_nm) return doHdr_strg_site_nm_VC(info);
		if (vc == Hdr_strg_sppl_cd) return doHdr_strg_sppl_cd_VC(info);
		if (vc == Hdr_wg_cd) return doHdr_wg_cd_VC(info);
		if (vc == Hdr_wg_nm) return doHdr_wg_nm_VC(info);
		if (vc == Hdr_itm_ord_typ) return doHdr_itm_ord_typ_VC(info);
		if (vc == Hdr_itm_ord_typ_nm) return doHdr_itm_ord_typ_nm_VC(info);
		if (vc == Hdr_not_fix_flg) return doHdr_not_fix_flg_VC(info);
		if (vc == Hdr_mfg_flg) return doHdr_mfg_flg_VC(info);
		if (vc == Hdr_outsrc_flg) return doHdr_outsrc_flg_VC(info);
		if (vc == Hdr_mfg_loc_cd) return doHdr_mfg_loc_cd_VC(info);
		if (vc == Hdr_mfg_loc_nm) return doHdr_mfg_loc_nm_VC(info);
		if (vc == Hdr_mfg_sppl_cd) return doHdr_mfg_sppl_cd_VC(info);
		if (vc == Hdr_mfg_maker_cd) return doHdr_mfg_maker_cd_VC(info);
		if (vc == Hdr_bom_ptn) return doHdr_bom_ptn_VC(info);
		if (vc == Hdr_sppl_cd) return doHdr_sppl_cd_VC(info);
		if (vc == Hdr_sppl_nm) return doHdr_sppl_nm_VC(info);
		if (vc == Hdr_maker_cd) return doHdr_maker_cd_VC(info);
		if (vc == Hdr_maker_nm) return doHdr_maker_nm_VC(info);
		if (vc == Hdr_rqst_loc_cd) return doHdr_rqst_loc_cd_VC(info);
		if (vc == Hdr_rqst_loc_nm) return doHdr_rqst_loc_nm_VC(info);
		if (vc == Hdr_rqst_wg_cd) return doHdr_rqst_wg_cd_VC(info);
		if (vc == Hdr_rqst_wg_nm) return doHdr_rqst_wg_nm_VC(info);
		if (vc == Hdr_nmr_qty) return doHdr_nmr_qty_VC(info);
		if (vc == Hdr_dnm_qty) return doHdr_dnm_qty_VC(info);
		if (vc == Hdr_fxd_yield_qty) return doHdr_fxd_yield_qty_VC(info);
		if (vc == Hdr_not_qty_rlt_flg) return doHdr_not_qty_rlt_flg_VC(info);
		if (vc == Hdr_unit_cd) return doHdr_unit_cd_VC(info);
		if (vc == Hdr_unit_nm) return doHdr_unit_nm_VC(info);
		if (vc == Hdr_dec_place) return doHdr_dec_place_VC(info);
		if (vc == Hdr_rnd_typ) return doHdr_rnd_typ_VC(info);
		if (vc == Hdr_cont_fctr_flg) return doHdr_cont_fctr_flg_VC(info);
		if (vc == Hdr_lmt_dt) return doHdr_lmt_dt_VC(info);
		if (vc == Hdr_sno1_mng_typ) return doHdr_sno1_mng_typ_VC(info);
		if (vc == Hdr_sno2_mng_typ) return doHdr_sno2_mng_typ_VC(info);
		if (vc == Hdr_sno3_mng_typ) return doHdr_sno3_mng_typ_VC(info);
		if (vc == Hdr_sno4_mng_typ) return doHdr_sno4_mng_typ_VC(info);
		if (vc == Hdr_insp_flg) return doHdr_insp_flg_VC(info);
		if (vc == Hdr_po_schd_dt) return doHdr_po_schd_dt_VC(info);
		if (vc == Hdr_mfg_st_schd_dt) return doHdr_mfg_st_schd_dt_VC(info);
		if (vc == Hdr_mfg_end_schd_dt) return doHdr_mfg_end_schd_dt_VC(info);
		if (vc == Hdr_gi_schd_dt) return doHdr_gi_schd_dt_VC(info);
		if (vc == Hdr_strg_schd_dt) return doHdr_strg_schd_dt_VC(info);
		if (vc == Hdr_accpt_schd_dt) return doHdr_accpt_schd_dt_VC(info);
		if (vc == Hdr_insp_st_schd_dt) return doHdr_insp_st_schd_dt_VC(info);
		if (vc == Hdr_insp_end_schd_dt) return doHdr_insp_end_schd_dt_VC(info);
		if (vc == Hdr_avl_schd_dt) return doHdr_avl_schd_dt_VC(info);
		if (vc == Hdr_oper_ptn) return doHdr_oper_ptn_VC(info);
		if (vc == Hdr_purc_lt) return doHdr_purc_lt_VC(info);
		if (vc == Hdr_mfg_lt) return doHdr_mfg_lt_VC(info);
		if (vc == Hdr_xfr_lt) return doHdr_xfr_lt_VC(info);
		if (vc == Hdr_accpt_insp_lt) return doHdr_accpt_insp_lt_VC(info);
		if (vc == Hdr_insp_lt) return doHdr_insp_lt_VC(info);
		if (vc == Hdr_insp_offst) return doHdr_insp_offst_VC(info);
		if (vc == Hdr_ord_fix_pd) return doHdr_ord_fix_pd_VC(info);
		if (vc == Hdr_cont_fctr_dec_place) return doHdr_cont_fctr_dec_place_VC(info);
		if (vc == Hdr_cont_fctr_rnd_typ) return doHdr_cont_fctr_rnd_typ_VC(info);
		if (vc == Hdr_ver_flg) return doHdr_ver_flg_VC(info);
		if (vc == Hdr_inst_po_cnt_rmrks) return doHdr_inst_po_cnt_rmrks_VC(info);
		if (vc == Hdr_intr_rmrks) return doHdr_intr_rmrks_VC(info);
		if (vc == Hdr_sub_char1) return doHdr_sub_char1_VC(info);
		if (vc == Hdr_sub_char2) return doHdr_sub_char2_VC(info);
		if (vc == Hdr_sub_char3) return doHdr_sub_char3_VC(info);
		if (vc == Hdr_ord_rcv_flg) return doHdr_ord_rcv_flg_VC(info);
		if (vc == Hdr_ord_snd_flg) return doHdr_ord_snd_flg_VC(info);
		if (vc == Hdr_ext_sys_cd) return doHdr_ext_sys_cd_VC(info);
		if (vc == Hdr_ext_sys_nm) return doHdr_ext_sys_nm_VC(info);
		if (vc == Hdr_ext_itm_ord_no) return doHdr_ext_itm_ord_no_VC(info);
		if (vc == Hdr_for_scheduler_frozen_flg) return doHdr_for_scheduler_frozen_flg_VC(info);
		if (vc == Hdr_scheduler_frozen_flg) return doHdr_scheduler_frozen_flg_VC(info);
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
		if (vc == columnDtl_oper_ord_no) return doDtl_oper_ord_no_VC(info);
		if (vc == columnDtl_oper_ord_sts_typ) return doDtl_oper_ord_sts_typ_VC(info);
		if (vc == columnDtl_oper_ord_sts_typ_nm) return doDtl_oper_ord_sts_typ_nm_VC(info);
		if (vc == columnDtl_oper_cd) return doDtl_oper_cd_VC(info);
		if (vc == columnDtl_oper_nm) return doDtl_oper_nm_VC(info);
		if (vc == columnDtl_oper_seq) return doDtl_oper_seq_VC(info);
		if (vc == columnDtl_loc_cd) return doDtl_loc_cd_VC(info);
		if (vc == columnDtl_loc_nm) return doDtl_loc_nm_VC(info);
		if (vc == columnDtl_disp_seq) return doDtl_disp_seq_VC(info);
		if (vc == columnDtl_base_unit_cd) return doDtl_base_unit_cd_VC(info);
		if (vc == columnDtl_base_unit_nm) return doDtl_base_unit_nm_VC(info);
		if (vc == columnDtl_base_dec_place) return doDtl_base_dec_place_VC(info);
		if (vc == columnDtl_oper_std_qty) return doDtl_oper_std_qty_VC(info);
		if (vc == columnDtl_oper_conv_qty) return doDtl_oper_conv_qty_VC(info);
		if (vc == columnDtl_dec_place) return doDtl_dec_place_VC(info);
		if (vc == columnDtl_unit_conv_rnd_typ) return doDtl_unit_conv_rnd_typ_VC(info);
		if (vc == columnDtl_oper_unit_cd) return doDtl_oper_unit_cd_VC(info);
		if (vc == columnDtl_oper_unit_nm) return doDtl_oper_unit_nm_VC(info);
		if (vc == columnDtl_yield_oper_flg) return doDtl_yield_oper_flg_VC(info);
		if (vc == columnDtl_oper_lt) return doDtl_oper_lt_VC(info);
		if (vc == columnDtl_oper_offst_typ) return doDtl_oper_offst_typ_VC(info);
		if (vc == columnDtl_oper_offst_typ_nm) return doDtl_oper_offst_typ_nm_VC(info);
		if (vc == columnDtl_oper_offst) return doDtl_oper_offst_VC(info);
		if (vc == columnDtl_oper_rsrc) return doDtl_oper_rsrc_VC(info);
		if (vc == columnDtl_intr_rmrks) return doDtl_intr_rmrks_VC(info);
		if (vc == columnDtl_sub_char1) return doDtl_sub_char1_VC(info);
		if (vc == columnDtl_sub_char2) return doDtl_sub_char2_VC(info);
		if (vc == columnDtl_sub_char3) return doDtl_sub_char3_VC(info);
		if (vc == columnDtl_ext_oper_ord_no) return doDtl_ext_oper_ord_no_VC(info);
		if (vc == columnDtl_scheduler_frozen_flg) return doDtl_scheduler_frozen_flg_VC(info);
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
	 * [Cnd]パネルの[itm_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[itm_ord_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_itm_ord_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[itm_ord_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_itm_ord_sts_typ_nm_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[itm_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_itm_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rqmt_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rqmt_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[strg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_strg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[strg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_strg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[strg_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_strg_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[strg_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_strg_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[strg_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_strg_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[itm_ord_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_itm_ord_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[itm_ord_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_itm_ord_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[not_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_not_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[mfg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_mfg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[outsrc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_outsrc_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[mfg_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_mfg_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[mfg_maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_mfg_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bom_ptn_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[rqst_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rqst_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rqst_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rqst_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rqst_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rqst_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rqst_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rqst_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[nmr_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_nmr_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dnm_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dnm_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[fxd_yield_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_fxd_yield_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[not_qty_rlt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_not_qty_rlt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rnd_typ_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[lmt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lmt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[po_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_po_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[mfg_st_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_mfg_st_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[mfg_end_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_mfg_end_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[gi_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_gi_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[strg_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_strg_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[accpt_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_accpt_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_st_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_st_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_end_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_end_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[avl_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_avl_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[oper_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_oper_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[purc_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_purc_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[mfg_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_mfg_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[xfr_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_xfr_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[accpt_insp_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_accpt_insp_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_offst]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_offst_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ord_fix_pd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ord_fix_pd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cont_fctr_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cont_fctr_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cont_fctr_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ver_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[inst_po_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_inst_po_cnt_rmrks_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[ord_rcv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ord_rcv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ord_snd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ord_snd_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[ext_itm_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ext_itm_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[for_scheduler_frozen_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_for_scheduler_frozen_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[scheduler_frozen_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_scheduler_frozen_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[oper_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_ord_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_ord_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_ord_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_ord_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_seq_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_disp_seq_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[base_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_std_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_std_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[unit_conv_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_unit_conv_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[yield_oper_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_yield_oper_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_offst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_offst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_offst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_offst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_offst]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_offst_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_rsrc]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_rsrc_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ext_oper_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_oper_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[scheduler_frozen_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_scheduler_frozen_flg_VC(MCEventInfo info){
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
		else if (nc == Cnd_itm_ord_no) doCnd_itm_ord_no_NC(info);
		else if (nc == Hdr_itm_ord_sts_typ) doHdr_itm_ord_sts_typ_NC(info);
		else if (nc == Hdr_itm_ord_sts_typ_nm) doHdr_itm_ord_sts_typ_nm_NC(info);
		else if (nc == Hdr_master_dt) doHdr_master_dt_NC(info);
		else if (nc == Hdr_itm_ord_no) doHdr_itm_ord_no_NC(info);
		else if (nc == Hdr_rqmt_no) doHdr_rqmt_no_NC(info);
		else if (nc == Hdr_strg_loc_cd) doHdr_strg_loc_cd_NC(info);
		else if (nc == Hdr_strg_loc_nm) doHdr_strg_loc_nm_NC(info);
		else if (nc == Hdr_strg_site_cd) doHdr_strg_site_cd_NC(info);
		else if (nc == Hdr_strg_site_nm) doHdr_strg_site_nm_NC(info);
		else if (nc == Hdr_strg_sppl_cd) doHdr_strg_sppl_cd_NC(info);
		else if (nc == Hdr_wg_cd) doHdr_wg_cd_NC(info);
		else if (nc == Hdr_wg_nm) doHdr_wg_nm_NC(info);
		else if (nc == Hdr_itm_ord_typ) doHdr_itm_ord_typ_NC(info);
		else if (nc == Hdr_itm_ord_typ_nm) doHdr_itm_ord_typ_nm_NC(info);
		else if (nc == Hdr_not_fix_flg) doHdr_not_fix_flg_NC(info);
		else if (nc == Hdr_mfg_flg) doHdr_mfg_flg_NC(info);
		else if (nc == Hdr_outsrc_flg) doHdr_outsrc_flg_NC(info);
		else if (nc == Hdr_mfg_loc_cd) doHdr_mfg_loc_cd_NC(info);
		else if (nc == Hdr_mfg_loc_nm) doHdr_mfg_loc_nm_NC(info);
		else if (nc == Hdr_mfg_sppl_cd) doHdr_mfg_sppl_cd_NC(info);
		else if (nc == Hdr_mfg_maker_cd) doHdr_mfg_maker_cd_NC(info);
		else if (nc == Hdr_bom_ptn) doHdr_bom_ptn_NC(info);
		else if (nc == Hdr_sppl_cd) doHdr_sppl_cd_NC(info);
		else if (nc == Hdr_sppl_nm) doHdr_sppl_nm_NC(info);
		else if (nc == Hdr_maker_cd) doHdr_maker_cd_NC(info);
		else if (nc == Hdr_maker_nm) doHdr_maker_nm_NC(info);
		else if (nc == Hdr_rqst_loc_cd) doHdr_rqst_loc_cd_NC(info);
		else if (nc == Hdr_rqst_loc_nm) doHdr_rqst_loc_nm_NC(info);
		else if (nc == Hdr_rqst_wg_cd) doHdr_rqst_wg_cd_NC(info);
		else if (nc == Hdr_rqst_wg_nm) doHdr_rqst_wg_nm_NC(info);
		else if (nc == Hdr_nmr_qty) doHdr_nmr_qty_NC(info);
		else if (nc == Hdr_dnm_qty) doHdr_dnm_qty_NC(info);
		else if (nc == Hdr_fxd_yield_qty) doHdr_fxd_yield_qty_NC(info);
		else if (nc == Hdr_not_qty_rlt_flg) doHdr_not_qty_rlt_flg_NC(info);
		else if (nc == Hdr_unit_cd) doHdr_unit_cd_NC(info);
		else if (nc == Hdr_unit_nm) doHdr_unit_nm_NC(info);
		else if (nc == Hdr_dec_place) doHdr_dec_place_NC(info);
		else if (nc == Hdr_rnd_typ) doHdr_rnd_typ_NC(info);
		else if (nc == Hdr_cont_fctr_flg) doHdr_cont_fctr_flg_NC(info);
		else if (nc == Hdr_lmt_dt) doHdr_lmt_dt_NC(info);
		else if (nc == Hdr_sno1_mng_typ) doHdr_sno1_mng_typ_NC(info);
		else if (nc == Hdr_sno2_mng_typ) doHdr_sno2_mng_typ_NC(info);
		else if (nc == Hdr_sno3_mng_typ) doHdr_sno3_mng_typ_NC(info);
		else if (nc == Hdr_sno4_mng_typ) doHdr_sno4_mng_typ_NC(info);
		else if (nc == Hdr_insp_flg) doHdr_insp_flg_NC(info);
		else if (nc == Hdr_po_schd_dt) doHdr_po_schd_dt_NC(info);
		else if (nc == Hdr_mfg_st_schd_dt) doHdr_mfg_st_schd_dt_NC(info);
		else if (nc == Hdr_mfg_end_schd_dt) doHdr_mfg_end_schd_dt_NC(info);
		else if (nc == Hdr_gi_schd_dt) doHdr_gi_schd_dt_NC(info);
		else if (nc == Hdr_strg_schd_dt) doHdr_strg_schd_dt_NC(info);
		else if (nc == Hdr_accpt_schd_dt) doHdr_accpt_schd_dt_NC(info);
		else if (nc == Hdr_insp_st_schd_dt) doHdr_insp_st_schd_dt_NC(info);
		else if (nc == Hdr_insp_end_schd_dt) doHdr_insp_end_schd_dt_NC(info);
		else if (nc == Hdr_avl_schd_dt) doHdr_avl_schd_dt_NC(info);
		else if (nc == Hdr_oper_ptn) doHdr_oper_ptn_NC(info);
		else if (nc == Hdr_purc_lt) doHdr_purc_lt_NC(info);
		else if (nc == Hdr_mfg_lt) doHdr_mfg_lt_NC(info);
		else if (nc == Hdr_xfr_lt) doHdr_xfr_lt_NC(info);
		else if (nc == Hdr_accpt_insp_lt) doHdr_accpt_insp_lt_NC(info);
		else if (nc == Hdr_insp_lt) doHdr_insp_lt_NC(info);
		else if (nc == Hdr_insp_offst) doHdr_insp_offst_NC(info);
		else if (nc == Hdr_ord_fix_pd) doHdr_ord_fix_pd_NC(info);
		else if (nc == Hdr_cont_fctr_dec_place) doHdr_cont_fctr_dec_place_NC(info);
		else if (nc == Hdr_cont_fctr_rnd_typ) doHdr_cont_fctr_rnd_typ_NC(info);
		else if (nc == Hdr_ver_flg) doHdr_ver_flg_NC(info);
		else if (nc == Hdr_inst_po_cnt_rmrks) doHdr_inst_po_cnt_rmrks_NC(info);
		else if (nc == Hdr_intr_rmrks) doHdr_intr_rmrks_NC(info);
		else if (nc == Hdr_sub_char1) doHdr_sub_char1_NC(info);
		else if (nc == Hdr_sub_char2) doHdr_sub_char2_NC(info);
		else if (nc == Hdr_sub_char3) doHdr_sub_char3_NC(info);
		else if (nc == Hdr_ord_rcv_flg) doHdr_ord_rcv_flg_NC(info);
		else if (nc == Hdr_ord_snd_flg) doHdr_ord_snd_flg_NC(info);
		else if (nc == Hdr_ext_sys_cd) doHdr_ext_sys_cd_NC(info);
		else if (nc == Hdr_ext_sys_nm) doHdr_ext_sys_nm_NC(info);
		else if (nc == Hdr_ext_itm_ord_no) doHdr_ext_itm_ord_no_NC(info);
		else if (nc == Hdr_for_scheduler_frozen_flg) doHdr_for_scheduler_frozen_flg_NC(info);
		else if (nc == Hdr_scheduler_frozen_flg) doHdr_scheduler_frozen_flg_NC(info);
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
		else if (nc == columnDtl_oper_ord_no) doDtl_oper_ord_no_NC(info);
		else if (nc == columnDtl_oper_ord_sts_typ) doDtl_oper_ord_sts_typ_NC(info);
		else if (nc == columnDtl_oper_ord_sts_typ_nm) doDtl_oper_ord_sts_typ_nm_NC(info);
		else if (nc == columnDtl_oper_cd) doDtl_oper_cd_NC(info);
		else if (nc == columnDtl_oper_nm) doDtl_oper_nm_NC(info);
		else if (nc == columnDtl_oper_seq) doDtl_oper_seq_NC(info);
		else if (nc == columnDtl_loc_cd) doDtl_loc_cd_NC(info);
		else if (nc == columnDtl_loc_nm) doDtl_loc_nm_NC(info);
		else if (nc == columnDtl_disp_seq) doDtl_disp_seq_NC(info);
		else if (nc == columnDtl_base_unit_cd) doDtl_base_unit_cd_NC(info);
		else if (nc == columnDtl_base_unit_nm) doDtl_base_unit_nm_NC(info);
		else if (nc == columnDtl_base_dec_place) doDtl_base_dec_place_NC(info);
		else if (nc == columnDtl_oper_std_qty) doDtl_oper_std_qty_NC(info);
		else if (nc == columnDtl_oper_conv_qty) doDtl_oper_conv_qty_NC(info);
		else if (nc == columnDtl_dec_place) doDtl_dec_place_NC(info);
		else if (nc == columnDtl_unit_conv_rnd_typ) doDtl_unit_conv_rnd_typ_NC(info);
		else if (nc == columnDtl_oper_unit_cd) doDtl_oper_unit_cd_NC(info);
		else if (nc == columnDtl_oper_unit_nm) doDtl_oper_unit_nm_NC(info);
		else if (nc == columnDtl_yield_oper_flg) doDtl_yield_oper_flg_NC(info);
		else if (nc == columnDtl_oper_lt) doDtl_oper_lt_NC(info);
		else if (nc == columnDtl_oper_offst_typ) doDtl_oper_offst_typ_NC(info);
		else if (nc == columnDtl_oper_offst_typ_nm) doDtl_oper_offst_typ_nm_NC(info);
		else if (nc == columnDtl_oper_offst) doDtl_oper_offst_NC(info);
		else if (nc == columnDtl_oper_rsrc) doDtl_oper_rsrc_NC(info);
		else if (nc == columnDtl_intr_rmrks) doDtl_intr_rmrks_NC(info);
		else if (nc == columnDtl_sub_char1) doDtl_sub_char1_NC(info);
		else if (nc == columnDtl_sub_char2) doDtl_sub_char2_NC(info);
		else if (nc == columnDtl_sub_char3) doDtl_sub_char3_NC(info);
		else if (nc == columnDtl_ext_oper_ord_no) doDtl_ext_oper_ord_no_NC(info);
		else if (nc == columnDtl_scheduler_frozen_flg) doDtl_scheduler_frozen_flg_NC(info);
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
	 * [Cnd]パネルの[itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_ord_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_ord_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_ord_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_ord_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[master_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_master_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rqmt_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rqmt_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[strg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_strg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[strg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_strg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[strg_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_strg_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[strg_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_strg_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[strg_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_strg_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_ord_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_ord_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_ord_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_ord_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[not_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_not_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[outsrc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_outsrc_flg_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[mfg_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bom_ptn_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[rqst_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rqst_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rqst_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rqst_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rqst_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rqst_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rqst_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rqst_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[nmr_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_nmr_qty_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dnm_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dnm_qty_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[fxd_yield_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_fxd_yield_qty_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[not_qty_rlt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_not_qty_rlt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_st_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_st_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_end_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_end_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gi_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gi_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[strg_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_strg_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[accpt_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_accpt_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_st_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_st_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_end_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_end_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[avl_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_avl_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[oper_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_oper_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_lt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_lt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xfr_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xfr_lt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[accpt_insp_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_accpt_insp_lt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_lt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_offst]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_offst_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ord_fix_pd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ord_fix_pd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[inst_po_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_inst_po_cnt_rmrks_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[ord_rcv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ord_rcv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ord_snd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ord_snd_flg_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[ext_itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[for_scheduler_frozen_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_for_scheduler_frozen_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[scheduler_frozen_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_scheduler_frozen_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[oper_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_ord_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_ord_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_ord_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_ord_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_seq_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[base_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_std_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_std_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_conv_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_conv_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_oper_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_oper_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_lt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_offst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_offst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_offst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_offst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_offst]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_offst_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_rsrc]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_rsrc_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[ext_oper_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_oper_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[scheduler_frozen_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_scheduler_frozen_flg_NC(MCEventInfo info){
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
		else if (ne == Cnd_itm_ord_no) doCnd_itm_ord_no_NE(info);
		else if (ne == Hdr_itm_ord_sts_typ) doHdr_itm_ord_sts_typ_NE(info);
		else if (ne == Hdr_itm_ord_sts_typ_nm) doHdr_itm_ord_sts_typ_nm_NE(info);
		else if (ne == Hdr_master_dt) doHdr_master_dt_NE(info);
		else if (ne == Hdr_itm_ord_no) doHdr_itm_ord_no_NE(info);
		else if (ne == Hdr_rqmt_no) doHdr_rqmt_no_NE(info);
		else if (ne == Hdr_strg_loc_cd) doHdr_strg_loc_cd_NE(info);
		else if (ne == Hdr_strg_loc_nm) doHdr_strg_loc_nm_NE(info);
		else if (ne == Hdr_strg_site_cd) doHdr_strg_site_cd_NE(info);
		else if (ne == Hdr_strg_site_nm) doHdr_strg_site_nm_NE(info);
		else if (ne == Hdr_strg_sppl_cd) doHdr_strg_sppl_cd_NE(info);
		else if (ne == Hdr_wg_cd) doHdr_wg_cd_NE(info);
		else if (ne == Hdr_wg_nm) doHdr_wg_nm_NE(info);
		else if (ne == Hdr_itm_ord_typ) doHdr_itm_ord_typ_NE(info);
		else if (ne == Hdr_itm_ord_typ_nm) doHdr_itm_ord_typ_nm_NE(info);
		else if (ne == Hdr_not_fix_flg) doHdr_not_fix_flg_NE(info);
		else if (ne == Hdr_mfg_flg) doHdr_mfg_flg_NE(info);
		else if (ne == Hdr_outsrc_flg) doHdr_outsrc_flg_NE(info);
		else if (ne == Hdr_mfg_loc_cd) doHdr_mfg_loc_cd_NE(info);
		else if (ne == Hdr_mfg_loc_nm) doHdr_mfg_loc_nm_NE(info);
		else if (ne == Hdr_mfg_sppl_cd) doHdr_mfg_sppl_cd_NE(info);
		else if (ne == Hdr_mfg_maker_cd) doHdr_mfg_maker_cd_NE(info);
		else if (ne == Hdr_bom_ptn) doHdr_bom_ptn_NE(info);
		else if (ne == Hdr_sppl_cd) doHdr_sppl_cd_NE(info);
		else if (ne == Hdr_sppl_nm) doHdr_sppl_nm_NE(info);
		else if (ne == Hdr_maker_cd) doHdr_maker_cd_NE(info);
		else if (ne == Hdr_maker_nm) doHdr_maker_nm_NE(info);
		else if (ne == Hdr_rqst_loc_cd) doHdr_rqst_loc_cd_NE(info);
		else if (ne == Hdr_rqst_loc_nm) doHdr_rqst_loc_nm_NE(info);
		else if (ne == Hdr_rqst_wg_cd) doHdr_rqst_wg_cd_NE(info);
		else if (ne == Hdr_rqst_wg_nm) doHdr_rqst_wg_nm_NE(info);
		else if (ne == Hdr_nmr_qty) doHdr_nmr_qty_NE(info);
		else if (ne == Hdr_dnm_qty) doHdr_dnm_qty_NE(info);
		else if (ne == Hdr_fxd_yield_qty) doHdr_fxd_yield_qty_NE(info);
		else if (ne == Hdr_not_qty_rlt_flg) doHdr_not_qty_rlt_flg_NE(info);
		else if (ne == Hdr_unit_cd) doHdr_unit_cd_NE(info);
		else if (ne == Hdr_unit_nm) doHdr_unit_nm_NE(info);
		else if (ne == Hdr_dec_place) doHdr_dec_place_NE(info);
		else if (ne == Hdr_rnd_typ) doHdr_rnd_typ_NE(info);
		else if (ne == Hdr_cont_fctr_flg) doHdr_cont_fctr_flg_NE(info);
		else if (ne == Hdr_lmt_dt) doHdr_lmt_dt_NE(info);
		else if (ne == Hdr_sno1_mng_typ) doHdr_sno1_mng_typ_NE(info);
		else if (ne == Hdr_sno2_mng_typ) doHdr_sno2_mng_typ_NE(info);
		else if (ne == Hdr_sno3_mng_typ) doHdr_sno3_mng_typ_NE(info);
		else if (ne == Hdr_sno4_mng_typ) doHdr_sno4_mng_typ_NE(info);
		else if (ne == Hdr_insp_flg) doHdr_insp_flg_NE(info);
		else if (ne == Hdr_po_schd_dt) doHdr_po_schd_dt_NE(info);
		else if (ne == Hdr_mfg_st_schd_dt) doHdr_mfg_st_schd_dt_NE(info);
		else if (ne == Hdr_mfg_end_schd_dt) doHdr_mfg_end_schd_dt_NE(info);
		else if (ne == Hdr_gi_schd_dt) doHdr_gi_schd_dt_NE(info);
		else if (ne == Hdr_strg_schd_dt) doHdr_strg_schd_dt_NE(info);
		else if (ne == Hdr_accpt_schd_dt) doHdr_accpt_schd_dt_NE(info);
		else if (ne == Hdr_insp_st_schd_dt) doHdr_insp_st_schd_dt_NE(info);
		else if (ne == Hdr_insp_end_schd_dt) doHdr_insp_end_schd_dt_NE(info);
		else if (ne == Hdr_avl_schd_dt) doHdr_avl_schd_dt_NE(info);
		else if (ne == Hdr_oper_ptn) doHdr_oper_ptn_NE(info);
		else if (ne == Hdr_purc_lt) doHdr_purc_lt_NE(info);
		else if (ne == Hdr_mfg_lt) doHdr_mfg_lt_NE(info);
		else if (ne == Hdr_xfr_lt) doHdr_xfr_lt_NE(info);
		else if (ne == Hdr_accpt_insp_lt) doHdr_accpt_insp_lt_NE(info);
		else if (ne == Hdr_insp_lt) doHdr_insp_lt_NE(info);
		else if (ne == Hdr_insp_offst) doHdr_insp_offst_NE(info);
		else if (ne == Hdr_ord_fix_pd) doHdr_ord_fix_pd_NE(info);
		else if (ne == Hdr_cont_fctr_dec_place) doHdr_cont_fctr_dec_place_NE(info);
		else if (ne == Hdr_cont_fctr_rnd_typ) doHdr_cont_fctr_rnd_typ_NE(info);
		else if (ne == Hdr_ver_flg) doHdr_ver_flg_NE(info);
		else if (ne == Hdr_inst_po_cnt_rmrks) doHdr_inst_po_cnt_rmrks_NE(info);
		else if (ne == Hdr_intr_rmrks) doHdr_intr_rmrks_NE(info);
		else if (ne == Hdr_sub_char1) doHdr_sub_char1_NE(info);
		else if (ne == Hdr_sub_char2) doHdr_sub_char2_NE(info);
		else if (ne == Hdr_sub_char3) doHdr_sub_char3_NE(info);
		else if (ne == Hdr_ord_rcv_flg) doHdr_ord_rcv_flg_NE(info);
		else if (ne == Hdr_ord_snd_flg) doHdr_ord_snd_flg_NE(info);
		else if (ne == Hdr_ext_sys_cd) doHdr_ext_sys_cd_NE(info);
		else if (ne == Hdr_ext_sys_nm) doHdr_ext_sys_nm_NE(info);
		else if (ne == Hdr_ext_itm_ord_no) doHdr_ext_itm_ord_no_NE(info);
		else if (ne == Hdr_for_scheduler_frozen_flg) doHdr_for_scheduler_frozen_flg_NE(info);
		else if (ne == Hdr_scheduler_frozen_flg) doHdr_scheduler_frozen_flg_NE(info);
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
		else if (ne == columnDtl_oper_ord_no) doDtl_oper_ord_no_NE(info);
		else if (ne == columnDtl_oper_ord_sts_typ) doDtl_oper_ord_sts_typ_NE(info);
		else if (ne == columnDtl_oper_ord_sts_typ_nm) doDtl_oper_ord_sts_typ_nm_NE(info);
		else if (ne == columnDtl_oper_cd) doDtl_oper_cd_NE(info);
		else if (ne == columnDtl_oper_nm) doDtl_oper_nm_NE(info);
		else if (ne == columnDtl_oper_seq) doDtl_oper_seq_NE(info);
		else if (ne == columnDtl_loc_cd) doDtl_loc_cd_NE(info);
		else if (ne == columnDtl_loc_nm) doDtl_loc_nm_NE(info);
		else if (ne == columnDtl_disp_seq) doDtl_disp_seq_NE(info);
		else if (ne == columnDtl_base_unit_cd) doDtl_base_unit_cd_NE(info);
		else if (ne == columnDtl_base_unit_nm) doDtl_base_unit_nm_NE(info);
		else if (ne == columnDtl_base_dec_place) doDtl_base_dec_place_NE(info);
		else if (ne == columnDtl_oper_std_qty) doDtl_oper_std_qty_NE(info);
		else if (ne == columnDtl_oper_conv_qty) doDtl_oper_conv_qty_NE(info);
		else if (ne == columnDtl_dec_place) doDtl_dec_place_NE(info);
		else if (ne == columnDtl_unit_conv_rnd_typ) doDtl_unit_conv_rnd_typ_NE(info);
		else if (ne == columnDtl_oper_unit_cd) doDtl_oper_unit_cd_NE(info);
		else if (ne == columnDtl_oper_unit_nm) doDtl_oper_unit_nm_NE(info);
		else if (ne == columnDtl_yield_oper_flg) doDtl_yield_oper_flg_NE(info);
		else if (ne == columnDtl_oper_lt) doDtl_oper_lt_NE(info);
		else if (ne == columnDtl_oper_offst_typ) doDtl_oper_offst_typ_NE(info);
		else if (ne == columnDtl_oper_offst_typ_nm) doDtl_oper_offst_typ_nm_NE(info);
		else if (ne == columnDtl_oper_offst) doDtl_oper_offst_NE(info);
		else if (ne == columnDtl_oper_rsrc) doDtl_oper_rsrc_NE(info);
		else if (ne == columnDtl_intr_rmrks) doDtl_intr_rmrks_NE(info);
		else if (ne == columnDtl_sub_char1) doDtl_sub_char1_NE(info);
		else if (ne == columnDtl_sub_char2) doDtl_sub_char2_NE(info);
		else if (ne == columnDtl_sub_char3) doDtl_sub_char3_NE(info);
		else if (ne == columnDtl_ext_oper_ord_no) doDtl_ext_oper_ord_no_NE(info);
		else if (ne == columnDtl_scheduler_frozen_flg) doDtl_scheduler_frozen_flg_NE(info);
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
	 * [Cnd]パネルの[itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_ord_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_ord_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_ord_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_ord_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[master_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_master_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rqmt_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rqmt_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[strg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_strg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[strg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_strg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[strg_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_strg_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[strg_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_strg_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[strg_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_strg_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_ord_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_ord_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_ord_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_ord_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[not_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_not_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[outsrc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_outsrc_flg_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[mfg_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bom_ptn_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[rqst_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rqst_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rqst_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rqst_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rqst_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rqst_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rqst_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rqst_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[nmr_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_nmr_qty_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dnm_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dnm_qty_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[fxd_yield_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_fxd_yield_qty_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[not_qty_rlt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_not_qty_rlt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_st_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_st_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_end_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_end_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gi_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gi_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[strg_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_strg_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[accpt_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_accpt_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_st_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_st_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_end_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_end_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[avl_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_avl_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[oper_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_oper_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_lt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_lt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xfr_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xfr_lt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[accpt_insp_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_accpt_insp_lt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_lt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_offst]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_offst_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ord_fix_pd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ord_fix_pd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[inst_po_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_inst_po_cnt_rmrks_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[ord_rcv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ord_rcv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ord_snd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ord_snd_flg_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[ext_itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[for_scheduler_frozen_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_for_scheduler_frozen_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[scheduler_frozen_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_scheduler_frozen_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[oper_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_ord_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_ord_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_ord_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_ord_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_seq_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[base_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_std_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_std_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_conv_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_conv_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_oper_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_oper_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_lt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_offst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_offst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_offst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_offst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_offst]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_offst_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_rsrc]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_rsrc_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[ext_oper_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_oper_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[scheduler_frozen_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_scheduler_frozen_flg_NE(MCEventInfo info){
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
		else if (nx == Cnd_itm_ord_no) doCnd_itm_ord_no_NX(info);
		else if (nx == Hdr_itm_ord_sts_typ) doHdr_itm_ord_sts_typ_NX(info);
		else if (nx == Hdr_itm_ord_sts_typ_nm) doHdr_itm_ord_sts_typ_nm_NX(info);
		else if (nx == Hdr_master_dt) doHdr_master_dt_NX(info);
		else if (nx == Hdr_itm_ord_no) doHdr_itm_ord_no_NX(info);
		else if (nx == Hdr_rqmt_no) doHdr_rqmt_no_NX(info);
		else if (nx == Hdr_strg_loc_cd) doHdr_strg_loc_cd_NX(info);
		else if (nx == Hdr_strg_loc_nm) doHdr_strg_loc_nm_NX(info);
		else if (nx == Hdr_strg_site_cd) doHdr_strg_site_cd_NX(info);
		else if (nx == Hdr_strg_site_nm) doHdr_strg_site_nm_NX(info);
		else if (nx == Hdr_strg_sppl_cd) doHdr_strg_sppl_cd_NX(info);
		else if (nx == Hdr_wg_cd) doHdr_wg_cd_NX(info);
		else if (nx == Hdr_wg_nm) doHdr_wg_nm_NX(info);
		else if (nx == Hdr_itm_ord_typ) doHdr_itm_ord_typ_NX(info);
		else if (nx == Hdr_itm_ord_typ_nm) doHdr_itm_ord_typ_nm_NX(info);
		else if (nx == Hdr_not_fix_flg) doHdr_not_fix_flg_NX(info);
		else if (nx == Hdr_mfg_flg) doHdr_mfg_flg_NX(info);
		else if (nx == Hdr_outsrc_flg) doHdr_outsrc_flg_NX(info);
		else if (nx == Hdr_mfg_loc_cd) doHdr_mfg_loc_cd_NX(info);
		else if (nx == Hdr_mfg_loc_nm) doHdr_mfg_loc_nm_NX(info);
		else if (nx == Hdr_mfg_sppl_cd) doHdr_mfg_sppl_cd_NX(info);
		else if (nx == Hdr_mfg_maker_cd) doHdr_mfg_maker_cd_NX(info);
		else if (nx == Hdr_bom_ptn) doHdr_bom_ptn_NX(info);
		else if (nx == Hdr_sppl_cd) doHdr_sppl_cd_NX(info);
		else if (nx == Hdr_sppl_nm) doHdr_sppl_nm_NX(info);
		else if (nx == Hdr_maker_cd) doHdr_maker_cd_NX(info);
		else if (nx == Hdr_maker_nm) doHdr_maker_nm_NX(info);
		else if (nx == Hdr_rqst_loc_cd) doHdr_rqst_loc_cd_NX(info);
		else if (nx == Hdr_rqst_loc_nm) doHdr_rqst_loc_nm_NX(info);
		else if (nx == Hdr_rqst_wg_cd) doHdr_rqst_wg_cd_NX(info);
		else if (nx == Hdr_rqst_wg_nm) doHdr_rqst_wg_nm_NX(info);
		else if (nx == Hdr_nmr_qty) doHdr_nmr_qty_NX(info);
		else if (nx == Hdr_dnm_qty) doHdr_dnm_qty_NX(info);
		else if (nx == Hdr_fxd_yield_qty) doHdr_fxd_yield_qty_NX(info);
		else if (nx == Hdr_not_qty_rlt_flg) doHdr_not_qty_rlt_flg_NX(info);
		else if (nx == Hdr_unit_cd) doHdr_unit_cd_NX(info);
		else if (nx == Hdr_unit_nm) doHdr_unit_nm_NX(info);
		else if (nx == Hdr_dec_place) doHdr_dec_place_NX(info);
		else if (nx == Hdr_rnd_typ) doHdr_rnd_typ_NX(info);
		else if (nx == Hdr_cont_fctr_flg) doHdr_cont_fctr_flg_NX(info);
		else if (nx == Hdr_lmt_dt) doHdr_lmt_dt_NX(info);
		else if (nx == Hdr_sno1_mng_typ) doHdr_sno1_mng_typ_NX(info);
		else if (nx == Hdr_sno2_mng_typ) doHdr_sno2_mng_typ_NX(info);
		else if (nx == Hdr_sno3_mng_typ) doHdr_sno3_mng_typ_NX(info);
		else if (nx == Hdr_sno4_mng_typ) doHdr_sno4_mng_typ_NX(info);
		else if (nx == Hdr_insp_flg) doHdr_insp_flg_NX(info);
		else if (nx == Hdr_po_schd_dt) doHdr_po_schd_dt_NX(info);
		else if (nx == Hdr_mfg_st_schd_dt) doHdr_mfg_st_schd_dt_NX(info);
		else if (nx == Hdr_mfg_end_schd_dt) doHdr_mfg_end_schd_dt_NX(info);
		else if (nx == Hdr_gi_schd_dt) doHdr_gi_schd_dt_NX(info);
		else if (nx == Hdr_strg_schd_dt) doHdr_strg_schd_dt_NX(info);
		else if (nx == Hdr_accpt_schd_dt) doHdr_accpt_schd_dt_NX(info);
		else if (nx == Hdr_insp_st_schd_dt) doHdr_insp_st_schd_dt_NX(info);
		else if (nx == Hdr_insp_end_schd_dt) doHdr_insp_end_schd_dt_NX(info);
		else if (nx == Hdr_avl_schd_dt) doHdr_avl_schd_dt_NX(info);
		else if (nx == Hdr_oper_ptn) doHdr_oper_ptn_NX(info);
		else if (nx == Hdr_purc_lt) doHdr_purc_lt_NX(info);
		else if (nx == Hdr_mfg_lt) doHdr_mfg_lt_NX(info);
		else if (nx == Hdr_xfr_lt) doHdr_xfr_lt_NX(info);
		else if (nx == Hdr_accpt_insp_lt) doHdr_accpt_insp_lt_NX(info);
		else if (nx == Hdr_insp_lt) doHdr_insp_lt_NX(info);
		else if (nx == Hdr_insp_offst) doHdr_insp_offst_NX(info);
		else if (nx == Hdr_ord_fix_pd) doHdr_ord_fix_pd_NX(info);
		else if (nx == Hdr_cont_fctr_dec_place) doHdr_cont_fctr_dec_place_NX(info);
		else if (nx == Hdr_cont_fctr_rnd_typ) doHdr_cont_fctr_rnd_typ_NX(info);
		else if (nx == Hdr_ver_flg) doHdr_ver_flg_NX(info);
		else if (nx == Hdr_inst_po_cnt_rmrks) doHdr_inst_po_cnt_rmrks_NX(info);
		else if (nx == Hdr_intr_rmrks) doHdr_intr_rmrks_NX(info);
		else if (nx == Hdr_sub_char1) doHdr_sub_char1_NX(info);
		else if (nx == Hdr_sub_char2) doHdr_sub_char2_NX(info);
		else if (nx == Hdr_sub_char3) doHdr_sub_char3_NX(info);
		else if (nx == Hdr_ord_rcv_flg) doHdr_ord_rcv_flg_NX(info);
		else if (nx == Hdr_ord_snd_flg) doHdr_ord_snd_flg_NX(info);
		else if (nx == Hdr_ext_sys_cd) doHdr_ext_sys_cd_NX(info);
		else if (nx == Hdr_ext_sys_nm) doHdr_ext_sys_nm_NX(info);
		else if (nx == Hdr_ext_itm_ord_no) doHdr_ext_itm_ord_no_NX(info);
		else if (nx == Hdr_for_scheduler_frozen_flg) doHdr_for_scheduler_frozen_flg_NX(info);
		else if (nx == Hdr_scheduler_frozen_flg) doHdr_scheduler_frozen_flg_NX(info);
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
		else if (nx == columnDtl_oper_ord_no) doDtl_oper_ord_no_NX(info);
		else if (nx == columnDtl_oper_ord_sts_typ) doDtl_oper_ord_sts_typ_NX(info);
		else if (nx == columnDtl_oper_ord_sts_typ_nm) doDtl_oper_ord_sts_typ_nm_NX(info);
		else if (nx == columnDtl_oper_cd) doDtl_oper_cd_NX(info);
		else if (nx == columnDtl_oper_nm) doDtl_oper_nm_NX(info);
		else if (nx == columnDtl_oper_seq) doDtl_oper_seq_NX(info);
		else if (nx == columnDtl_loc_cd) doDtl_loc_cd_NX(info);
		else if (nx == columnDtl_loc_nm) doDtl_loc_nm_NX(info);
		else if (nx == columnDtl_disp_seq) doDtl_disp_seq_NX(info);
		else if (nx == columnDtl_base_unit_cd) doDtl_base_unit_cd_NX(info);
		else if (nx == columnDtl_base_unit_nm) doDtl_base_unit_nm_NX(info);
		else if (nx == columnDtl_base_dec_place) doDtl_base_dec_place_NX(info);
		else if (nx == columnDtl_oper_std_qty) doDtl_oper_std_qty_NX(info);
		else if (nx == columnDtl_oper_conv_qty) doDtl_oper_conv_qty_NX(info);
		else if (nx == columnDtl_dec_place) doDtl_dec_place_NX(info);
		else if (nx == columnDtl_unit_conv_rnd_typ) doDtl_unit_conv_rnd_typ_NX(info);
		else if (nx == columnDtl_oper_unit_cd) doDtl_oper_unit_cd_NX(info);
		else if (nx == columnDtl_oper_unit_nm) doDtl_oper_unit_nm_NX(info);
		else if (nx == columnDtl_yield_oper_flg) doDtl_yield_oper_flg_NX(info);
		else if (nx == columnDtl_oper_lt) doDtl_oper_lt_NX(info);
		else if (nx == columnDtl_oper_offst_typ) doDtl_oper_offst_typ_NX(info);
		else if (nx == columnDtl_oper_offst_typ_nm) doDtl_oper_offst_typ_nm_NX(info);
		else if (nx == columnDtl_oper_offst) doDtl_oper_offst_NX(info);
		else if (nx == columnDtl_oper_rsrc) doDtl_oper_rsrc_NX(info);
		else if (nx == columnDtl_intr_rmrks) doDtl_intr_rmrks_NX(info);
		else if (nx == columnDtl_sub_char1) doDtl_sub_char1_NX(info);
		else if (nx == columnDtl_sub_char2) doDtl_sub_char2_NX(info);
		else if (nx == columnDtl_sub_char3) doDtl_sub_char3_NX(info);
		else if (nx == columnDtl_ext_oper_ord_no) doDtl_ext_oper_ord_no_NX(info);
		else if (nx == columnDtl_scheduler_frozen_flg) doDtl_scheduler_frozen_flg_NX(info);
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
	 * [Cnd]パネルの[itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_ord_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_ord_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_ord_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_ord_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[master_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_master_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rqmt_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rqmt_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[strg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_strg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[strg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_strg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[strg_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_strg_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[strg_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_strg_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[strg_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_strg_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_ord_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_ord_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_ord_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_ord_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[not_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_not_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[outsrc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_outsrc_flg_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[mfg_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bom_ptn_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[rqst_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rqst_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rqst_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rqst_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rqst_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rqst_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rqst_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rqst_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[nmr_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_nmr_qty_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dnm_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dnm_qty_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[fxd_yield_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_fxd_yield_qty_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[not_qty_rlt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_not_qty_rlt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_st_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_st_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_end_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_end_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gi_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gi_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[strg_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_strg_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[accpt_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_accpt_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_st_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_st_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_end_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_end_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[avl_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_avl_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[oper_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_oper_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_lt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_lt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xfr_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xfr_lt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[accpt_insp_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_accpt_insp_lt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_lt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_offst]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_offst_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ord_fix_pd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ord_fix_pd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[inst_po_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_inst_po_cnt_rmrks_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[ord_rcv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ord_rcv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ord_snd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ord_snd_flg_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[ext_itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[for_scheduler_frozen_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_for_scheduler_frozen_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[scheduler_frozen_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_scheduler_frozen_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[oper_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_ord_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_ord_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_ord_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_ord_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_seq_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[base_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_std_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_std_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_conv_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_conv_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_oper_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_oper_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_lt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_offst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_offst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_offst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_offst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_offst]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_offst_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_rsrc]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_rsrc_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[ext_oper_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_oper_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[scheduler_frozen_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_scheduler_frozen_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_itm_ord_no) doCnd_itm_ord_no_LC(info);
		else if (lc == Hdr_itm_ord_sts_typ) doHdr_itm_ord_sts_typ_LC(info);
		else if (lc == Hdr_itm_ord_sts_typ_nm) doHdr_itm_ord_sts_typ_nm_LC(info);
		else if (lc == Hdr_master_dt) doHdr_master_dt_LC(info);
		else if (lc == Hdr_itm_ord_no) doHdr_itm_ord_no_LC(info);
		else if (lc == Hdr_rqmt_no) doHdr_rqmt_no_LC(info);
		else if (lc == Hdr_strg_loc_cd) doHdr_strg_loc_cd_LC(info);
		else if (lc == Hdr_strg_loc_nm) doHdr_strg_loc_nm_LC(info);
		else if (lc == Hdr_strg_site_cd) doHdr_strg_site_cd_LC(info);
		else if (lc == Hdr_strg_site_nm) doHdr_strg_site_nm_LC(info);
		else if (lc == Hdr_strg_sppl_cd) doHdr_strg_sppl_cd_LC(info);
		else if (lc == Hdr_wg_cd) doHdr_wg_cd_LC(info);
		else if (lc == Hdr_wg_nm) doHdr_wg_nm_LC(info);
		else if (lc == Hdr_itm_ord_typ) doHdr_itm_ord_typ_LC(info);
		else if (lc == Hdr_itm_ord_typ_nm) doHdr_itm_ord_typ_nm_LC(info);
		else if (lc == Hdr_mfg_loc_cd) doHdr_mfg_loc_cd_LC(info);
		else if (lc == Hdr_mfg_loc_nm) doHdr_mfg_loc_nm_LC(info);
		else if (lc == Hdr_mfg_sppl_cd) doHdr_mfg_sppl_cd_LC(info);
		else if (lc == Hdr_mfg_maker_cd) doHdr_mfg_maker_cd_LC(info);
		else if (lc == Hdr_bom_ptn) doHdr_bom_ptn_LC(info);
		else if (lc == Hdr_sppl_cd) doHdr_sppl_cd_LC(info);
		else if (lc == Hdr_sppl_nm) doHdr_sppl_nm_LC(info);
		else if (lc == Hdr_maker_cd) doHdr_maker_cd_LC(info);
		else if (lc == Hdr_maker_nm) doHdr_maker_nm_LC(info);
		else if (lc == Hdr_rqst_loc_cd) doHdr_rqst_loc_cd_LC(info);
		else if (lc == Hdr_rqst_loc_nm) doHdr_rqst_loc_nm_LC(info);
		else if (lc == Hdr_rqst_wg_cd) doHdr_rqst_wg_cd_LC(info);
		else if (lc == Hdr_rqst_wg_nm) doHdr_rqst_wg_nm_LC(info);
		else if (lc == Hdr_nmr_qty) doHdr_nmr_qty_LC(info);
		else if (lc == Hdr_dnm_qty) doHdr_dnm_qty_LC(info);
		else if (lc == Hdr_fxd_yield_qty) doHdr_fxd_yield_qty_LC(info);
		else if (lc == Hdr_unit_cd) doHdr_unit_cd_LC(info);
		else if (lc == Hdr_unit_nm) doHdr_unit_nm_LC(info);
		else if (lc == Hdr_dec_place) doHdr_dec_place_LC(info);
		else if (lc == Hdr_rnd_typ) doHdr_rnd_typ_LC(info);
		else if (lc == Hdr_lmt_dt) doHdr_lmt_dt_LC(info);
		else if (lc == Hdr_sno1_mng_typ) doHdr_sno1_mng_typ_LC(info);
		else if (lc == Hdr_sno2_mng_typ) doHdr_sno2_mng_typ_LC(info);
		else if (lc == Hdr_sno3_mng_typ) doHdr_sno3_mng_typ_LC(info);
		else if (lc == Hdr_sno4_mng_typ) doHdr_sno4_mng_typ_LC(info);
		else if (lc == Hdr_po_schd_dt) doHdr_po_schd_dt_LC(info);
		else if (lc == Hdr_mfg_st_schd_dt) doHdr_mfg_st_schd_dt_LC(info);
		else if (lc == Hdr_mfg_end_schd_dt) doHdr_mfg_end_schd_dt_LC(info);
		else if (lc == Hdr_gi_schd_dt) doHdr_gi_schd_dt_LC(info);
		else if (lc == Hdr_strg_schd_dt) doHdr_strg_schd_dt_LC(info);
		else if (lc == Hdr_accpt_schd_dt) doHdr_accpt_schd_dt_LC(info);
		else if (lc == Hdr_insp_st_schd_dt) doHdr_insp_st_schd_dt_LC(info);
		else if (lc == Hdr_insp_end_schd_dt) doHdr_insp_end_schd_dt_LC(info);
		else if (lc == Hdr_avl_schd_dt) doHdr_avl_schd_dt_LC(info);
		else if (lc == Hdr_oper_ptn) doHdr_oper_ptn_LC(info);
		else if (lc == Hdr_purc_lt) doHdr_purc_lt_LC(info);
		else if (lc == Hdr_mfg_lt) doHdr_mfg_lt_LC(info);
		else if (lc == Hdr_xfr_lt) doHdr_xfr_lt_LC(info);
		else if (lc == Hdr_accpt_insp_lt) doHdr_accpt_insp_lt_LC(info);
		else if (lc == Hdr_insp_lt) doHdr_insp_lt_LC(info);
		else if (lc == Hdr_insp_offst) doHdr_insp_offst_LC(info);
		else if (lc == Hdr_ord_fix_pd) doHdr_ord_fix_pd_LC(info);
		else if (lc == Hdr_cont_fctr_dec_place) doHdr_cont_fctr_dec_place_LC(info);
		else if (lc == Hdr_cont_fctr_rnd_typ) doHdr_cont_fctr_rnd_typ_LC(info);
		else if (lc == Hdr_inst_po_cnt_rmrks) doHdr_inst_po_cnt_rmrks_LC(info);
		else if (lc == Hdr_intr_rmrks) doHdr_intr_rmrks_LC(info);
		else if (lc == Hdr_sub_char1) doHdr_sub_char1_LC(info);
		else if (lc == Hdr_sub_char2) doHdr_sub_char2_LC(info);
		else if (lc == Hdr_sub_char3) doHdr_sub_char3_LC(info);
		else if (lc == Hdr_ext_sys_cd) doHdr_ext_sys_cd_LC(info);
		else if (lc == Hdr_ext_sys_nm) doHdr_ext_sys_nm_LC(info);
		else if (lc == Hdr_ext_itm_ord_no) doHdr_ext_itm_ord_no_LC(info);
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
		else if (lc == columnDtl_oper_ord_no) doDtl_oper_ord_no_LC(info);
		else if (lc == columnDtl_oper_ord_sts_typ) doDtl_oper_ord_sts_typ_LC(info);
		else if (lc == columnDtl_oper_ord_sts_typ_nm) doDtl_oper_ord_sts_typ_nm_LC(info);
		else if (lc == columnDtl_oper_cd) doDtl_oper_cd_LC(info);
		else if (lc == columnDtl_oper_nm) doDtl_oper_nm_LC(info);
		else if (lc == columnDtl_oper_seq) doDtl_oper_seq_LC(info);
		else if (lc == columnDtl_loc_cd) doDtl_loc_cd_LC(info);
		else if (lc == columnDtl_loc_nm) doDtl_loc_nm_LC(info);
		else if (lc == columnDtl_disp_seq) doDtl_disp_seq_LC(info);
		else if (lc == columnDtl_base_unit_cd) doDtl_base_unit_cd_LC(info);
		else if (lc == columnDtl_base_unit_nm) doDtl_base_unit_nm_LC(info);
		else if (lc == columnDtl_base_dec_place) doDtl_base_dec_place_LC(info);
		else if (lc == columnDtl_oper_std_qty) doDtl_oper_std_qty_LC(info);
		else if (lc == columnDtl_oper_conv_qty) doDtl_oper_conv_qty_LC(info);
		else if (lc == columnDtl_dec_place) doDtl_dec_place_LC(info);
		else if (lc == columnDtl_unit_conv_rnd_typ) doDtl_unit_conv_rnd_typ_LC(info);
		else if (lc == columnDtl_oper_unit_cd) doDtl_oper_unit_cd_LC(info);
		else if (lc == columnDtl_oper_unit_nm) doDtl_oper_unit_nm_LC(info);
		else if (lc == columnDtl_oper_lt) doDtl_oper_lt_LC(info);
		else if (lc == columnDtl_oper_offst_typ) doDtl_oper_offst_typ_LC(info);
		else if (lc == columnDtl_oper_offst_typ_nm) doDtl_oper_offst_typ_nm_LC(info);
		else if (lc == columnDtl_oper_offst) doDtl_oper_offst_LC(info);
		else if (lc == columnDtl_oper_rsrc) doDtl_oper_rsrc_LC(info);
		else if (lc == columnDtl_intr_rmrks) doDtl_intr_rmrks_LC(info);
		else if (lc == columnDtl_sub_char1) doDtl_sub_char1_LC(info);
		else if (lc == columnDtl_sub_char2) doDtl_sub_char2_LC(info);
		else if (lc == columnDtl_sub_char3) doDtl_sub_char3_LC(info);
		else if (lc == columnDtl_ext_oper_ord_no) doDtl_ext_oper_ord_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_ord_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_ord_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_ord_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_ord_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[master_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_master_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rqmt_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rqmt_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[strg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_strg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[strg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_strg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[strg_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_strg_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[strg_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_strg_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[strg_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_strg_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_ord_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_ord_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_ord_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_ord_typ_nm_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[mfg_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bom_ptn_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[rqst_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rqst_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rqst_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rqst_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rqst_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rqst_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rqst_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rqst_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[nmr_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_nmr_qty_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dnm_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dnm_qty_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[fxd_yield_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_fxd_yield_qty_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_st_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_st_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_end_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_end_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gi_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gi_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[strg_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_strg_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[accpt_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_accpt_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_st_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_st_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_end_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_end_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[avl_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_avl_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[oper_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_oper_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_lt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[mfg_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_mfg_lt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xfr_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xfr_lt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[accpt_insp_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_accpt_insp_lt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_lt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_offst]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_offst_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ord_fix_pd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ord_fix_pd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[inst_po_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_inst_po_cnt_rmrks_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[ext_itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ext_itm_ord_no_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[oper_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_ord_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_ord_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_ord_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_ord_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_seq_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[base_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_std_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_std_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_conv_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_conv_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_lt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_offst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_offst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_offst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_offst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_offst]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_offst_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_rsrc]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_rsrc_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[ext_oper_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_oper_ord_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Hdr_itm_ord_sts_typ]の作成メソッド
	 */
	public MCList getHdr_itm_ord_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getItmOrdStsTyp(row, info);
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
	 * コンボ／リストのリスト[Hdr_strg_loc_cd]の作成メソッド
	 */
	public MCList getHdr_strg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_itm_ord_typ]の作成メソッド
	 */
	public MCList getHdr_itm_ord_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getItmOrdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_mfg_loc_cd]の作成メソッド
	 */
	public MCList getHdr_mfg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlMfgLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_bom_ptn]の作成メソッド
	 */
	public MCList getHdr_bom_ptn(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlBomPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_sppl_cd]の作成メソッド
	 */
	public MCList getHdr_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlSppl(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_maker_cd]の作成メソッド
	 */
	public MCList getHdr_maker_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlMaker(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_rqst_loc_cd]の作成メソッド
	 */
	public MCList getHdr_rqst_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlRqstLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_oper_ptn]の作成メソッド
	 */
	public MCList getHdr_oper_ptn(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmOper(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_oper_ord_sts_typ]の作成メソッド
	 */
	public MCList getDtl_oper_ord_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getOperOrdStsTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBCL0040.Srch01")) {
			return new MS_MSBCL0040_Srch01Bridge();
		}
		if (id.equals("MS.MSBCL0040.Sprt01")) {
			return new MS_MSBCL0040_Sprt01Bridge();
		}
		if (id.equals("MS.MSBCL0040.Sprt02")) {
			return new MS_MSBCL0040_Sprt02Bridge();
		}
		if (id.equals("MS.MSBCL0040.Sprt03")) {
			return new MS_MSBCL0040_Sprt03Bridge();
		}
		if (id.equals("MS.MSBCL0040.Ins01")) {
			return new MS_MSBCL0040_Ins01Bridge();
		}
		if (id.equals("MS.MSBCL0040.Upd01")) {
			return new MS_MSBCL0040_Upd01Bridge();
		}
		if (id.equals("MS.MSBCL0040.Upd02")) {
			return new MS_MSBCL0040_Upd02Bridge();
		}
		if (id.equals("MS.MSBCL0040.Del01")) {
			return new MS_MSBCL0040_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBCL0040_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0040_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0040_Srch01;

		/** コンストラクタ */
		protected MS_MSBCL0040_Srch01Bridge() {
			p_MS_MSBCL0040_Srch01 = new MCParam(PDef.MS_MSBCL0040_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0040_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP0040.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBC.MSBCP0040.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0040.DtlR.class));

			p_MS_MSBCL0040_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0040_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0040_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0040_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0040_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP0040.CndR up0() {
			return (mcframe.clientMSBC.MSBCP0040.CndR)up(0);
		}

		protected mcframe.clientMSBC.MSBCP0040.HdrR down0() {
			return (mcframe.clientMSBC.MSBCP0040.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBC.MSBCP0040.DtlR> down1() {
			return (MCList<mcframe.clientMSBC.MSBCP0040.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0040_Srch01.addDownBlock(mcframe.clientMSBC.MSBCP0040.HdrR.create());
			p_MS_MSBCL0040_Srch01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0040.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0040_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBC.MSBCP0040.HdrR)p_MS_MSBCL0040_Srch01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBC.MSBCP0040.DtlR>)p_MS_MSBCL0040_Srch01.getContainerParam().getDownBlock(1));
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
	 * [MS_MSBCL0040_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0040_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0040_Sprt01;

		/** コンストラクタ */
		protected MS_MSBCL0040_Sprt01Bridge() {
			p_MS_MSBCL0040_Sprt01 = new MCParam(PDef.MS_MSBCL0040_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0040_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP0040.HdrR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBC.MSBCP0040.HdrR.create());

			p_MS_MSBCL0040_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0040_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0040_Sprt01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0040_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0040_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP0040.HdrR up0() {
			return (mcframe.clientMSBC.MSBCP0040.HdrR)up(0);
		}

		protected mcframe.clientMSBC.MSBCP0040.HdrR down0() {
			return (mcframe.clientMSBC.MSBCP0040.HdrR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0040_Sprt01.addDownBlock(mcframe.clientMSBC.MSBCP0040.HdrR.create());
		}
		protected MCParam param() {
			return p_MS_MSBCL0040_Sprt01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBC.MSBCP0040.HdrR)p_MS_MSBCL0040_Sprt01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBCL0040_Sprt02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0040_Sprt02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0040_Sprt02;

		/** コンストラクタ */
		protected MS_MSBCL0040_Sprt02Bridge() {
			p_MS_MSBCL0040_Sprt02 = new MCParam(PDef.MS_MSBCL0040_Sprt02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0040_Sprt02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP0040.HdrR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0040.DtlR.class));

			p_MS_MSBCL0040_Sprt02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0040_Sprt02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0040_Sprt02.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0040_Sprt02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0040_Sprt02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP0040.HdrR up0() {
			return (mcframe.clientMSBC.MSBCP0040.HdrR)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0040.DtlR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0040.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0040_Sprt02.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0040.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0040_Sprt02;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBC.MSBCP0040.DtlR>)p_MS_MSBCL0040_Sprt02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBCL0040_Sprt03]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0040_Sprt03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0040_Sprt03;

		/** コンストラクタ */
		protected MS_MSBCL0040_Sprt03Bridge() {
			p_MS_MSBCL0040_Sprt03 = new MCParam(PDef.MS_MSBCL0040_Sprt03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0040_Sprt03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP0040.HdrR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBC.MSBCP0040.HdrR.create());

			p_MS_MSBCL0040_Sprt03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0040_Sprt03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0040_Sprt03.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0040_Sprt03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0040_Sprt03.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP0040.HdrR up0() {
			return (mcframe.clientMSBC.MSBCP0040.HdrR)up(0);
		}

		protected mcframe.clientMSBC.MSBCP0040.HdrR down0() {
			return (mcframe.clientMSBC.MSBCP0040.HdrR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0040_Sprt03.addDownBlock(mcframe.clientMSBC.MSBCP0040.HdrR.create());
		}
		protected MCParam param() {
			return p_MS_MSBCL0040_Sprt03;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBC.MSBCP0040.HdrR)p_MS_MSBCL0040_Sprt03.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBCL0040_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0040_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0040_Ins01;

		/** コンストラクタ */
		protected MS_MSBCL0040_Ins01Bridge() {
			p_MS_MSBCL0040_Ins01 = new MCParam(PDef.MS_MSBCL0040_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0040_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP0040.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0040.DtlR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBC.MSBCP0040.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0040.DtlR.class));

			p_MS_MSBCL0040_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0040_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0040_Ins01.addUpBlock(getHdrR());
			p_MS_MSBCL0040_Ins01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0040_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0040_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP0040.HdrR up0() {
			return (mcframe.clientMSBC.MSBCP0040.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBC.MSBCP0040.DtlR> up1() {
			return (MCList<mcframe.clientMSBC.MSBCP0040.DtlR>)up(1);
		}

		protected mcframe.clientMSBC.MSBCP0040.HdrR down0() {
			return (mcframe.clientMSBC.MSBCP0040.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBC.MSBCP0040.DtlR> down1() {
			return (MCList<mcframe.clientMSBC.MSBCP0040.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0040_Ins01.addDownBlock(mcframe.clientMSBC.MSBCP0040.HdrR.create());
			p_MS_MSBCL0040_Ins01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0040.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0040_Ins01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBC.MSBCP0040.HdrR)p_MS_MSBCL0040_Ins01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBC.MSBCP0040.DtlR>)p_MS_MSBCL0040_Ins01.getContainerParam().getDownBlock(1));
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
	 * [MS_MSBCL0040_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0040_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0040_Upd01;

		/** コンストラクタ */
		protected MS_MSBCL0040_Upd01Bridge() {
			p_MS_MSBCL0040_Upd01 = new MCParam(PDef.MS_MSBCL0040_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0040_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP0040.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0040.DtlR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBC.MSBCP0040.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0040.DtlR.class));

			p_MS_MSBCL0040_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0040_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0040_Upd01.addUpBlock(getHdrR());
			p_MS_MSBCL0040_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0040_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0040_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP0040.HdrR up0() {
			return (mcframe.clientMSBC.MSBCP0040.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBC.MSBCP0040.DtlR> up1() {
			return (MCList<mcframe.clientMSBC.MSBCP0040.DtlR>)up(1);
		}

		protected mcframe.clientMSBC.MSBCP0040.HdrR down0() {
			return (mcframe.clientMSBC.MSBCP0040.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBC.MSBCP0040.DtlR> down1() {
			return (MCList<mcframe.clientMSBC.MSBCP0040.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0040_Upd01.addDownBlock(mcframe.clientMSBC.MSBCP0040.HdrR.create());
			p_MS_MSBCL0040_Upd01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0040.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0040_Upd01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBC.MSBCP0040.HdrR)p_MS_MSBCL0040_Upd01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBC.MSBCP0040.DtlR>)p_MS_MSBCL0040_Upd01.getContainerParam().getDownBlock(1));
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
	 * [MS_MSBCL0040_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0040_Upd02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0040_Upd02;

		/** コンストラクタ */
		protected MS_MSBCL0040_Upd02Bridge() {
			p_MS_MSBCL0040_Upd02 = new MCParam(PDef.MS_MSBCL0040_Upd02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0040_Upd02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP0040.HdrR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBC.MSBCP0040.HdrR.create());

			p_MS_MSBCL0040_Upd02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0040_Upd02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0040_Upd02.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0040_Upd02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0040_Upd02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP0040.HdrR up0() {
			return (mcframe.clientMSBC.MSBCP0040.HdrR)up(0);
		}

		protected mcframe.clientMSBC.MSBCP0040.HdrR down0() {
			return (mcframe.clientMSBC.MSBCP0040.HdrR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0040_Upd02.addDownBlock(mcframe.clientMSBC.MSBCP0040.HdrR.create());
		}
		protected MCParam param() {
			return p_MS_MSBCL0040_Upd02;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBC.MSBCP0040.HdrR)p_MS_MSBCL0040_Upd02.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBCL0040_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0040_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0040_Del01;

		/** コンストラクタ */
		protected MS_MSBCL0040_Del01Bridge() {
			p_MS_MSBCL0040_Del01 = new MCParam(PDef.MS_MSBCL0040_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0040_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP0040.HdrR.create());
			// Down

			p_MS_MSBCL0040_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0040_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0040_Del01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0040_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0040_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP0040.HdrR up0() {
			return (mcframe.clientMSBC.MSBCP0040.HdrR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBCL0040_Del01;
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