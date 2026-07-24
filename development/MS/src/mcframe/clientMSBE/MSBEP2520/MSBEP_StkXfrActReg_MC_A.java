package mcframe.clientMSBE.MSBEP2520;

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
import mcframe.clientMSBE.MSBEP2520.MSBEP_StkXfrActReg_MC.MS_MSBEL2520_Srch01Caller;
import mcframe.clientMSBE.MSBEP2520.MSBEP_StkXfrActReg_MC.MS_MSBEL2520_Ins01Caller;
import mcframe.clientMSBE.MSBEP2520.MSBEP_StkXfrActReg_MC.MS_MSBEL2520_Upd01Caller;
import mcframe.clientMSBE.MSBEP2520.MSBEP_StkXfrActReg_MC.MS_MSBEL2520_Del01Caller;
import mcframe.clientMSBE.MSBEP2520.MSBEP_StkXfrActReg_MC.MS_MSBEL2520_Prnt01Caller;

/**
 * 画面"MSBEP_StkXfrActReg"パネルクラスです。<p>
 *
 * 在庫振替実績を登録する画面<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_StkXfrActReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBEP2520";

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
	public MCLabel Cnd_stk_xfr_act_no_Label = null;
	/**
	 * Inventory transfer result No. 在庫振替実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_stk_xfr_act_no = null;
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
	public MCLabel Hdr_trd_cd_Label = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCTextField Hdr_trd_nm = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCTextField Hdr_trd_ptn_typ = null;
	public MCLabel Hdr_stk_xfr_act_no_Label = null;
	/**
	 * Inventory transfer result No. 在庫振替実績ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_stk_xfr_act_no = null;
	/**
	 * Immediate issue 即時発行.<p>
	 *
	 */
	public MCCheckBox Hdr_prnt_flg = null;
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
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_sppl_cd = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_site_cd = null;
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
	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public MCCheckBox Hdr_str_ln_tgt_flg = null;
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H Hdr_ymd_hm_p_PPanel;
	public MCDateField Hdr_stk_xfr_act_dt;	// [Hdr]の[ymd_hm_p.ymd]を[Hdr_stk_xfr_act_dt]としてエイリアス定義。
	public MCDateField Hdr_stk_xfr_act_tm;	// [Hdr]の[ymd_hm_p.hm]を[Hdr_stk_xfr_act_tm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H Hdr_ac_dt_p_PPanel;
	public MCDateField Hdr_ac_dt;	// [Hdr]の[ac_dt_p.ac_dt]を[Hdr_ac_dt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H Hdr_can_ac_dt_p_PPanel;
	public MCDateField Hdr_can_ac_dt_for_input;	// [Hdr]の[can_ac_dt_p.can_ac_dt_for_input]を[Hdr_can_ac_dt_for_input]としてエイリアス定義。
	public MCDateField Hdr_can_ac_dt;	// [Hdr]の[can_ac_dt_p.can_ac_dt_for_call]を[Hdr_can_ac_dt]としてエイリアス定義。
	public MCDateField Hdr_ac_dt_after_srch;	// [Hdr]の[can_ac_dt_p.ac_dt_after_srch]を[Hdr_ac_dt_after_srch]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H Hdr_usr_dpt_p_PPanel;
	public MCTextField Hdr_act_usr_cd;	// [Hdr]の[usr_dpt_p.usr_cd]を[Hdr_act_usr_cd]としてエイリアス定義。
	public MCTextField Hdr_act_usr_nm;	// [Hdr]の[usr_dpt_p.usr_nm]を[Hdr_act_usr_nm]としてエイリアス定義。
	public MCTextComboBox Hdr_act_dpt_cd;	// [Hdr]の[usr_dpt_p.dpt_cd]を[Hdr_act_dpt_cd]としてエイリアス定義。
	public MCTextField Hdr_act_dpt_nm;	// [Hdr]の[usr_dpt_p.dpt_nm]を[Hdr_act_dpt_nm]としてエイリアス定義。
	public MCLabel Hdr_stk_xfr_rsn_cd_Label = null;
	/**
	 * Inventory transfer reason cd. 在庫振替理由ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_stk_xfr_rsn_cd = null;
	/**
	 * Inventory transfer reason name 在庫振替理由名.<p>
	 *
	 */
	public MCTextField Hdr_stk_xfr_rsn_nm = null;
	public MCLabel Hdr_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Hdr_intr_rmrks = null;
	public MCLabel Hdr_trd_rmrks_Label = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCTextField Hdr_trd_rmrks = null;
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
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumberField Hdr_upd_cntr = null;
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
	// [GiPnl]ブロック関連のField定義
	public MCPanel GiPnlPanel = null;
	// [GiPnl]ブロックの項目のField定義
	// [DtlGi]ブロック関連のField定義
	public MCPanel DtlGiPanel = null;
	public MCTitledBorder DtlGiTitledBorder = null;
	public MCScrollPane DtlGiScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP2520.DtlGiR> DtlGiTable = null;
	// [DtlGi]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D DtlGi_itm_p_PPanel;
	public MCColumnConfig columnDtlGi_itm_cd;// [DtlGi]の[itm_p.itm_cd]を[columnDtlGi_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtlGi_itm_sub1;// [DtlGi]の[itm_p.itm_sub1]を[columnDtlGi_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtlGi_itm_sub2;// [DtlGi]の[itm_p.itm_sub2]を[columnDtlGi_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtlGi_itm_sub3;// [DtlGi]の[itm_p.itm_sub3]を[columnDtlGi_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtlGi_itm_nm;// [DtlGi]の[itm_p.itm_nm]を[columnDtlGi_itm_nm]としてエイリアス定義。
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_sundry_itm_flg = null;
	/**
	 * Disallow new lot input 新規ロット入力不可.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_not_new_lot_flg = null;
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_lot_mng_typ = null;
	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_lot_no_typ = null;
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_sublot_mng_typ = null;
	/**
	 * Sublot No. type サブロットＮＯ区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_sublot_no_typ = null;
	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_lot_no_ptn_cd = null;
	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_sublot_no_ptn_cd = null;
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_ver_flg = null;
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_sno4_mng_typ = null;
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_cont_fctr_flg = null;
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_stk_mng_typ = null;
	public mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D DtlGi_lot_no_p_PPanel;
	public MCColumnConfig columnDtlGi_crt_lot_flg;// [DtlGi]の[lot_no_p.crt_lot_flg]を[columnDtlGi_crt_lot_flg]としてエイリアス定義。
	public MCColumnConfig columnDtlGi_lot_no;// [DtlGi]の[lot_no_p.lot_no]を[columnDtlGi_lot_no]としてエイリアス定義。
	public MCColumnConfig columnDtlGi_sublot_no;// [DtlGi]の[lot_no_p.sublot_no]を[columnDtlGi_sublot_no]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D DtlGi_ver_p_PPanel;
	public MCColumnConfig columnDtlGi_ver_no;// [DtlGi]の[ver_p.ver_no]を[columnDtlGi_ver_no]としてエイリアス定義。
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_trd_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_trd_unit_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlGi_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnDtlGi_trd_unit_qty;// [DtlGi]の[trd_unit_qty_p.qty]を[columnDtlGi_trd_unit_qty]としてエイリアス定義。
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_trd_unit_dec_place = null;
	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_trd_unit_rnd_typ = null;
	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_trd_unit_conv_base_qty = null;
	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_trd_unit_conv_qty = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_base_unit_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlGi_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDtlGi_base_unit_qty;// [DtlGi]の[base_unit_qty_p.qty]を[columnDtlGi_base_unit_qty]としてエイリアス定義。
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_base_unit_dec_place = null;
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_base_unit_conv_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D DtlGi_std_cont_qty_p_PPanel;
	public MCColumnConfig columnDtlGi_std_cont_fctr_qty;// [DtlGi]の[std_cont_qty_p.cont_qty]を[columnDtlGi_std_cont_fctr_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D DtlGi_act_cont_qty_p_PPanel;
	public MCColumnConfig columnDtlGi_act_cont_fctr_qty;// [DtlGi]の[act_cont_qty_p.cont_qty]を[columnDtlGi_act_cont_fctr_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D DtlGi_std_cont_fctr_p_PPanel;
	public MCColumnConfig columnDtlGi_std_cont_fctr;// [DtlGi]の[std_cont_fctr_p.std_cont_fctr]を[columnDtlGi_std_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D DtlGi_act_cont_fctr_p_PPanel;
	public MCColumnConfig columnDtlGi_act_cont_fctr;// [DtlGi]の[act_cont_fctr_p.act_cont_fctr]を[columnDtlGi_act_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D DtlGi_cont_fctr_unit_p_PPanel;
	public MCColumnConfig columnDtlGi_cont_fctr_unit_cd;// [DtlGi]の[cont_fctr_unit_p.cont_fctr_unit_cd]を[columnDtlGi_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnDtlGi_cont_fctr_unit_nm;// [DtlGi]の[cont_fctr_unit_p.cont_fctr_unit_nm]を[columnDtlGi_cont_fctr_unit_nm]としてエイリアス定義。
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_cont_fctr_rnd_typ = null;
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_cont_fctr_dec_place = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D DtlGi_str_ln_p_PPanel;
	public MCColumnConfig columnDtlGi_str_ln_cd;// [DtlGi]の[str_ln_p.str_ln_cd]を[columnDtlGi_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnDtlGi_str_ln_nm;// [DtlGi]の[str_ln_p.str_ln_nm]を[columnDtlGi_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnDtlGi_str_ln_cd_none_flg;// [DtlGi]の[str_ln_p.str_ln_cd_none_flg]を[columnDtlGi_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_quality_typ = null;
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_quality_typ_nm = null;
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_gd_nm = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D DtlGi_sno_p_PPanel;
	public MCColumnConfig columnDtlGi_sno1;// [DtlGi]の[sno_p.sno1]を[columnDtlGi_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtlGi_sno2;// [DtlGi]の[sno_p.sno2]を[columnDtlGi_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtlGi_sno3;// [DtlGi]の[sno_p.sno3]を[columnDtlGi_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtlGi_sno4;// [DtlGi]の[sno_p.sno4]を[columnDtlGi_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtlGi_wrk_no;// [DtlGi]の[sno_p.wrk_no]を[columnDtlGi_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtlGi_wrk_nm;// [DtlGi]の[sno_p.wrk_nm]を[columnDtlGi_wrk_nm]としてエイリアス定義。
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_stk_id_typ = null;
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_stk_id_typ_nm = null;
	public mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D DtlGi_stk_bp_p_PPanel;
	public MCColumnConfig columnDtlGi_stk_bp_cd;// [DtlGi]の[stk_bp_p.stk_bp_cd]を[columnDtlGi_stk_bp_cd]としてエイリアス定義。
	public MCColumnConfig columnDtlGi_stk_bp_nm;// [DtlGi]の[stk_bp_p.stk_bp_nm]を[columnDtlGi_stk_bp_nm]としてエイリアス定義。
	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_fix_no_typ = null;
	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_fix_no_typ_nm = null;
	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_fix_no = null;
	public mcframe.clientMSUB.MSUBP5060.MSUBP_StkArrvBp_D DtlGi_stk_arrv_bp_p_PPanel;
	public MCColumnConfig columnDtlGi_stk_arrv_bp_cd;// [DtlGi]の[stk_arrv_bp_p.stk_arrv_bp_cd]を[columnDtlGi_stk_arrv_bp_cd]としてエイリアス定義。
	public MCColumnConfig columnDtlGi_stk_arrv_bp_nm;// [DtlGi]の[stk_arrv_bp_p.stk_arrv_bp_nm]を[columnDtlGi_stk_arrv_bp_nm]としてエイリアス定義。
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_intr_d_rmrks = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_trd_d_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_sub_char3 = null;
	/**
	 * Inventory transfer result details No. 在庫振替実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_stk_xfr_act_d_no = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDtlGi_disp_seq = null;
	// [BtnGi]ブロック関連のField定義
	public MCPanel BtnGiPanel = null;
	// [BtnGi]ブロックの項目のField定義
	// [GrPnl]ブロック関連のField定義
	public MCPanel GrPnlPanel = null;
	// [GrPnl]ブロックの項目のField定義
	// [DtlGr]ブロック関連のField定義
	public MCPanel DtlGrPanel = null;
	public MCTitledBorder DtlGrTitledBorder = null;
	public MCScrollPane DtlGrScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP2520.DtlGiR> DtlGrTable = null;
	// [DtlGr]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D DtlGr_itm_p_PPanel;
	public MCColumnConfig columnDtlGr_itm_cd;// [DtlGr]の[itm_p.itm_cd]を[columnDtlGr_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtlGr_itm_sub1;// [DtlGr]の[itm_p.itm_sub1]を[columnDtlGr_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtlGr_itm_sub2;// [DtlGr]の[itm_p.itm_sub2]を[columnDtlGr_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtlGr_itm_sub3;// [DtlGr]の[itm_p.itm_sub3]を[columnDtlGr_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtlGr_itm_nm;// [DtlGr]の[itm_p.itm_nm]を[columnDtlGr_itm_nm]としてエイリアス定義。
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_sundry_itm_flg = null;
	/**
	 * Disallow new lot input 新規ロット入力不可.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_not_new_lot_flg = null;
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_lot_mng_typ = null;
	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_lot_no_typ = null;
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_sublot_mng_typ = null;
	/**
	 * Sublot No. type サブロットＮＯ区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_sublot_no_typ = null;
	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_lot_no_ptn_cd = null;
	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_sublot_no_ptn_cd = null;
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_ver_flg = null;
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_sno4_mng_typ = null;
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_cont_fctr_flg = null;
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_stk_mng_typ = null;
	public mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D DtlGr_lot_no_p_PPanel;
	public MCColumnConfig columnDtlGr_crt_lot_flg;// [DtlGr]の[lot_no_p.crt_lot_flg]を[columnDtlGr_crt_lot_flg]としてエイリアス定義。
	public MCColumnConfig columnDtlGr_lot_no;// [DtlGr]の[lot_no_p.lot_no]を[columnDtlGr_lot_no]としてエイリアス定義。
	public MCColumnConfig columnDtlGr_sublot_no;// [DtlGr]の[lot_no_p.sublot_no]を[columnDtlGr_sublot_no]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D DtlGr_ver_p_PPanel;
	public MCColumnConfig columnDtlGr_ver_no;// [DtlGr]の[ver_p.ver_no]を[columnDtlGr_ver_no]としてエイリアス定義。
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_trd_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_trd_unit_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlGr_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnDtlGr_trd_unit_qty;// [DtlGr]の[trd_unit_qty_p.qty]を[columnDtlGr_trd_unit_qty]としてエイリアス定義。
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_trd_unit_dec_place = null;
	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_trd_unit_rnd_typ = null;
	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_trd_unit_conv_base_qty = null;
	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_trd_unit_conv_qty = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_base_unit_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlGr_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDtlGr_base_unit_qty;// [DtlGr]の[base_unit_qty_p.qty]を[columnDtlGr_base_unit_qty]としてエイリアス定義。
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_base_unit_dec_place = null;
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_base_unit_conv_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D DtlGr_std_cont_qty_p_PPanel;
	public MCColumnConfig columnDtlGr_std_cont_fctr_qty;// [DtlGr]の[std_cont_qty_p.cont_qty]を[columnDtlGr_std_cont_fctr_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D DtlGr_act_cont_qty_p_PPanel;
	public MCColumnConfig columnDtlGr_act_cont_fctr_qty;// [DtlGr]の[act_cont_qty_p.cont_qty]を[columnDtlGr_act_cont_fctr_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D DtlGr_std_cont_fctr_p_PPanel;
	public MCColumnConfig columnDtlGr_std_cont_fctr;// [DtlGr]の[std_cont_fctr_p.std_cont_fctr]を[columnDtlGr_std_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D DtlGr_act_cont_fctr_p_PPanel;
	public MCColumnConfig columnDtlGr_act_cont_fctr;// [DtlGr]の[act_cont_fctr_p.act_cont_fctr]を[columnDtlGr_act_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D DtlGr_cont_fctr_unit_p_PPanel;
	public MCColumnConfig columnDtlGr_cont_fctr_unit_cd;// [DtlGr]の[cont_fctr_unit_p.cont_fctr_unit_cd]を[columnDtlGr_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnDtlGr_cont_fctr_unit_nm;// [DtlGr]の[cont_fctr_unit_p.cont_fctr_unit_nm]を[columnDtlGr_cont_fctr_unit_nm]としてエイリアス定義。
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_cont_fctr_rnd_typ = null;
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_cont_fctr_dec_place = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D DtlGr_str_ln_p_PPanel;
	public MCColumnConfig columnDtlGr_str_ln_cd;// [DtlGr]の[str_ln_p.str_ln_cd]を[columnDtlGr_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnDtlGr_str_ln_nm;// [DtlGr]の[str_ln_p.str_ln_nm]を[columnDtlGr_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnDtlGr_str_ln_cd_none_flg;// [DtlGr]の[str_ln_p.str_ln_cd_none_flg]を[columnDtlGr_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_quality_typ = null;
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_quality_typ_nm = null;
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_gd_nm = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D DtlGr_sno_p_PPanel;
	public MCColumnConfig columnDtlGr_sno1;// [DtlGr]の[sno_p.sno1]を[columnDtlGr_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtlGr_sno2;// [DtlGr]の[sno_p.sno2]を[columnDtlGr_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtlGr_sno3;// [DtlGr]の[sno_p.sno3]を[columnDtlGr_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtlGr_sno4;// [DtlGr]の[sno_p.sno4]を[columnDtlGr_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtlGr_wrk_no;// [DtlGr]の[sno_p.wrk_no]を[columnDtlGr_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtlGr_wrk_nm;// [DtlGr]の[sno_p.wrk_nm]を[columnDtlGr_wrk_nm]としてエイリアス定義。
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_stk_id_typ = null;
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_stk_id_typ_nm = null;
	public mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D DtlGr_stk_bp_p_PPanel;
	public MCColumnConfig columnDtlGr_stk_bp_cd;// [DtlGr]の[stk_bp_p.stk_bp_cd]を[columnDtlGr_stk_bp_cd]としてエイリアス定義。
	public MCColumnConfig columnDtlGr_stk_bp_nm;// [DtlGr]の[stk_bp_p.stk_bp_nm]を[columnDtlGr_stk_bp_nm]としてエイリアス定義。
	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_fix_no_typ = null;
	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_fix_no_typ_nm = null;
	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_fix_no = null;
	public mcframe.clientMSUB.MSUBP5060.MSUBP_StkArrvBp_D DtlGr_stk_arrv_bp_p_PPanel;
	public MCColumnConfig columnDtlGr_stk_arrv_bp_cd;// [DtlGr]の[stk_arrv_bp_p.stk_arrv_bp_cd]を[columnDtlGr_stk_arrv_bp_cd]としてエイリアス定義。
	public MCColumnConfig columnDtlGr_stk_arrv_bp_nm;// [DtlGr]の[stk_arrv_bp_p.stk_arrv_bp_nm]を[columnDtlGr_stk_arrv_bp_nm]としてエイリアス定義。
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_intr_d_rmrks = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_trd_d_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_sub_char3 = null;
	/**
	 * Inventory transfer result details No. 在庫振替実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_stk_xfr_act_d_no = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDtlGr_disp_seq = null;
	// [BtnGr]ブロック関連のField定義
	public MCPanel BtnGrPanel = null;
	// [BtnGr]ブロックの項目のField定義
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	public mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H Btn_open_MSBEP0500_p_PPanel;
	/**
	 * GR item explosion 入庫品展開.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP2540_gr = null;
	/**
	 * GI item explosion 出庫品展開.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP2540_gi = null;
	/**
	 * Transfer slip 振替伝票.<p>
	 *
	 */
	public MCButton Btn_prnt = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Btn_radd_gi = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Btn_rdel_gi = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Btn_rcopy_gi = null;
	/**
	 * Move to top row 最上行に移動.<p>
	 *
	 */
	public MCButton Btn_top_gi = null;
	/**
	 * Move one row up 一つ上の行に移動.<p>
	 *
	 */
	public MCButton Btn_up_gi = null;
	/**
	 * Move one row down 一つ下の行に移動.<p>
	 *
	 */
	public MCButton Btn_down_gi = null;
	/**
	 * Move to bottom row 最下行に移動.<p>
	 *
	 */
	public MCButton Btn_bottom_gi = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Btn_radd_gr = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Btn_rdel_gr = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Btn_rcopy_gr = null;
	/**
	 * Move to top row 最上行に移動.<p>
	 *
	 */
	public MCButton Btn_top_gr = null;
	/**
	 * Move one row up 一つ上の行に移動.<p>
	 *
	 */
	public MCButton Btn_up_gr = null;
	/**
	 * Move one row down 一つ下の行に移動.<p>
	 *
	 */
	public MCButton Btn_down_gr = null;
	/**
	 * Move to bottom row 最下行に移動.<p>
	 *
	 */
	public MCButton Btn_bottom_gr = null;
	public mcframe.clientFSBA.FSBAP0020.FSBAP0020 Btn_sync_p_PPanel;
	/**
	 * Update (Item transfer) 更新する(品目振替).<p>
	 *
	 */
	public MCButton Btn_ins_itm = null;
	/**
	 * Update (Lot/SEIBAN No. transfer) 更新する(ロット・手配ＮＯ振替).<p>
	 *
	 */
	public MCButton Btn_ins_lot_sno = null;
	/**
	 * Update (Grading/conforming type transfer) 更新する(格付・良品区分振替).<p>
	 *
	 */
	public MCButton Btn_ins_grd = null;
	/**
	 * Update (SKU transfer) 更新する(荷姿振替).<p>
	 *
	 */
	public MCButton Btn_ins_pack = null;
	/**
	 * Update (Item transfer) 更新する(品目振替).<p>
	 *
	 */
	public MCButton Btn_upd_itm = null;
	/**
	 * Update (Lot/SEIBAN No. transfer) 更新する(ロット・手配ＮＯ振替).<p>
	 *
	 */
	public MCButton Btn_upd_lot_sno = null;
	/**
	 * Update (Grading/conforming type transfer) 更新する(格付・良品区分振替).<p>
	 *
	 */
	public MCButton Btn_upd_grd = null;
	/**
	 * Update (SKU transfer) 更新する(荷姿振替).<p>
	 *
	 */
	public MCButton Btn_upd_pack = null;
	/**
	 * Cancel (Item transfer) 取り消す(品目振替).<p>
	 *
	 */
	public MCButton Btn_del_itm = null;
	/**
	 * Cancel (Lot/transfer SEIBAN No. ) 取り消す(ロット・手配ＮＯ振替).<p>
	 *
	 */
	public MCButton Btn_del_lot_sno = null;
	/**
	 * Cancel (Grading/conforming type transfer) 取り消す(格付・良品区分振替).<p>
	 *
	 */
	public MCButton Btn_del_grd = null;
	/**
	 * Cancel (SKU transfer) 取り消す(荷姿振替).<p>
	 *
	 */
	public MCButton Btn_del_pack = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
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
	public static final String[] statusArray = new String[]{INS, FIX_I, UPD, FIX_U, DEL, FIX_D, SRCH, REF};
	
	/** [MS_MSBEL2520_Srch01]のCallerの作成 */
	protected MSBEP_StkXfrActReg_MC.MS_MSBEL2520_Srch01Caller createMS_MSBEL2520_Srch01() {
		MSBEP_StkXfrActReg_MC.MS_MSBEL2520_Srch01Caller<MSBEP_StkXfrActReg, MS_MSBEL2520_Srch01Bridge>
		caller = ((MSBEP_StkXfrActReg_MC)this).new MS_MSBEL2520_Srch01Caller<MSBEP_StkXfrActReg, MS_MSBEL2520_Srch01Bridge>(
					(MSBEP_StkXfrActReg)this, new MS_MSBEL2520_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL2520_Srch01]の呼び出し */
	protected void callMS_MSBEL2520_Srch01() {
		MCCaller caller = createMS_MSBEL2520_Srch01();
		caller.exec();
	}
	/** [MS_MSBEL2520_Ins01]のCallerの作成 */
	protected MSBEP_StkXfrActReg_MC.MS_MSBEL2520_Ins01Caller createMS_MSBEL2520_Ins01() {
		MSBEP_StkXfrActReg_MC.MS_MSBEL2520_Ins01Caller<MSBEP_StkXfrActReg, MS_MSBEL2520_Ins01Bridge>
		caller = ((MSBEP_StkXfrActReg_MC)this).new MS_MSBEL2520_Ins01Caller<MSBEP_StkXfrActReg, MS_MSBEL2520_Ins01Bridge>(
					(MSBEP_StkXfrActReg)this, new MS_MSBEL2520_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBEL2520_Ins01]の呼び出し */
	protected void callMS_MSBEL2520_Ins01() {
		MCCaller caller = createMS_MSBEL2520_Ins01();
		caller.exec();
	}
	/** [MS_MSBEL2520_Upd01]のCallerの作成 */
	protected MSBEP_StkXfrActReg_MC.MS_MSBEL2520_Upd01Caller createMS_MSBEL2520_Upd01() {
		MSBEP_StkXfrActReg_MC.MS_MSBEL2520_Upd01Caller<MSBEP_StkXfrActReg, MS_MSBEL2520_Upd01Bridge>
		caller = ((MSBEP_StkXfrActReg_MC)this).new MS_MSBEL2520_Upd01Caller<MSBEP_StkXfrActReg, MS_MSBEL2520_Upd01Bridge>(
					(MSBEP_StkXfrActReg)this, new MS_MSBEL2520_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBEL2520_Upd01]の呼び出し */
	protected void callMS_MSBEL2520_Upd01() {
		MCCaller caller = createMS_MSBEL2520_Upd01();
		caller.exec();
	}
	/** [MS_MSBEL2520_Del01]のCallerの作成 */
	protected MSBEP_StkXfrActReg_MC.MS_MSBEL2520_Del01Caller createMS_MSBEL2520_Del01() {
		MSBEP_StkXfrActReg_MC.MS_MSBEL2520_Del01Caller<MSBEP_StkXfrActReg, MS_MSBEL2520_Del01Bridge>
		caller = ((MSBEP_StkXfrActReg_MC)this).new MS_MSBEL2520_Del01Caller<MSBEP_StkXfrActReg, MS_MSBEL2520_Del01Bridge>(
					(MSBEP_StkXfrActReg)this, new MS_MSBEL2520_Del01Bridge());
		return caller;
	}
	/** [MS_MSBEL2520_Del01]の呼び出し */
	protected void callMS_MSBEL2520_Del01() {
		MCCaller caller = createMS_MSBEL2520_Del01();
		caller.exec();
	}
	/** [MS_MSBEL2520_Prnt01]のCallerの作成 */
	protected MSBEP_StkXfrActReg_MC.MS_MSBEL2520_Prnt01Caller createMS_MSBEL2520_Prnt01() {
		MSBEP_StkXfrActReg_MC.MS_MSBEL2520_Prnt01Caller<MSBEP_StkXfrActReg, MS_MSBEL2520_Prnt01Bridge>
		caller = ((MSBEP_StkXfrActReg_MC)this).new MS_MSBEL2520_Prnt01Caller<MSBEP_StkXfrActReg, MS_MSBEL2520_Prnt01Bridge>(
					(MSBEP_StkXfrActReg)this, new MS_MSBEL2520_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBEL2520_Prnt01]の呼び出し */
	protected void callMS_MSBEL2520_Prnt01() {
		MCCaller caller = createMS_MSBEL2520_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP2520.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP2520.HdrR aHdrR;
	/** [DtlGi]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR> aDtlGiL;
	/** [DtlGr]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR> aDtlGrL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP2520.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP2520.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP2520.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP2520.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBE.MSBEP2520.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBE.MSBEP2520.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBE.MSBEP2520.HdrR createHdrR() {
		return mcframe.clientMSBE.MSBEP2520.HdrR.create();
	}

	/**
	 * コピーによってaDtlGiLを設定します。
	 *
	 * aDtlGiLのインスタンスは変更されません。
	 *
	 * @param dataset DtlGiL
	 */
	public void setDtlGiL(MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR> aList) {
		if (getDtlGiL() != aList) {
			getDtlGiL().setAll(aList);
		}
	}

	/**
	 * [DtlGi]ブロックのコンテナaDtlGiLを返します。
	 *
	 * @return DtlGiL
	 */
	public MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR> getDtlGiL() {
		return aDtlGiL;
	}

	/**
	 * aDtlGiRを作成します。
	 *
	 * @return DtlGiR
	 */
	public mcframe.clientMSBE.MSBEP2520.DtlGiR createDtlGiR() {
		return mcframe.clientMSBE.MSBEP2520.DtlGiR.create();
	}

	/**
	 * aDtlGiLを作成します。
	 *
	 * @return DtlGiL
	 */
	public MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR> createDtlGiL() {
		return MCList.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.class);
	}

	/**
	 * DtlGiTableを初期化します。
	 */
	protected void createDtlGiTable(){
		if(DtlGiTable == null){
			DtlGiTable = beansFactory.createTable2("DtlGi.table");
		}
	}

	/**
	 * コピーによってaDtlGrLを設定します。
	 *
	 * aDtlGrLのインスタンスは変更されません。
	 *
	 * @param dataset DtlGrL
	 */
	public void setDtlGrL(MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR> aList) {
		if (getDtlGrL() != aList) {
			getDtlGrL().setAll(aList);
		}
	}

	/**
	 * [DtlGr]ブロックのコンテナaDtlGrLを返します。
	 *
	 * @return DtlGrL
	 */
	public MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR> getDtlGrL() {
		return aDtlGrL;
	}

	/**
	 * aDtlGrRを作成します。
	 *
	 * @return DtlGrR
	 */
	public mcframe.clientMSBE.MSBEP2520.DtlGiR createDtlGrR() {
		return mcframe.clientMSBE.MSBEP2520.DtlGiR.create();
	}

	/**
	 * aDtlGrLを作成します。
	 *
	 * @return DtlGrL
	 */
	public MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR> createDtlGrL() {
		return MCList.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.class);
	}

	/**
	 * DtlGrTableを初期化します。
	 */
	protected void createDtlGrTable(){
		if(DtlGrTable == null){
			DtlGrTable = beansFactory.createTable2("DtlGr.table");
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
		if(!MCCollectionUtil.contains(ret, getDtlGiL())) ret.add(getDtlGiL());
		if(!MCCollectionUtil.contains(ret, getDtlGrL())) ret.add(getDtlGrL());
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
		if(aCnt == getDtlGiL()) return "DtlGi";
		if(aCnt == getDtlGrL()) return "DtlGr";
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
		if(bId.equals("DtlGi")) return getDtlGiL();
		if(bId.equals("DtlGr")) return getDtlGrL();
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
		ret.add(GiPnlPanel);
		ret.add(DtlGiPanel);
		ret.add(BtnGiPanel);
		ret.add(GrPnlPanel);
		ret.add(DtlGrPanel);
		ret.add(BtnGrPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_StkXfrActReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlGiL = createDtlGiL();
		aDtlGrL = createDtlGrL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_StkXfrActReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlGiL = createDtlGiL();
		createDtlGiTable();
		DtlGiTable.setRowName(name);
		aDtlGrL = createDtlGrL();
		createDtlGrTable();
		DtlGrTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBEP_StkXfrActReg_MC.jbCreateScreenOpe((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbCreateCnd((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbCreateHdrTab((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbCreateHdr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbCreateHdr2((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbCreateGiPnl((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbCreateDtlGi((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbCreateBtnGi((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbCreateGrPnl((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbCreateDtlGr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbCreateBtnGr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbCreateBtn((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbCreateEastBtn((MSBEP_StkXfrActReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBEP_StkXfrActReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_StkXfrActReg p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBEP_StkXfrActReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBEP_StkXfrActReg p) {
		p.Hdr_ymd_hm_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getHdrR().ymd_hm_p());
		p.Hdr_ymd_hm_p_PPanel.setName("Hdr.ymd_hm_p");
		p.Hdr_stk_xfr_act_dt = p.Hdr_ymd_hm_p_PPanel.YmdHm_ymd;
		p.Hdr_stk_xfr_act_dt.addAliasName("Hdr.stk_xfr_act_dt", p);
		p.Hdr_stk_xfr_act_tm = p.Hdr_ymd_hm_p_PPanel.YmdHm_hm;
		p.Hdr_stk_xfr_act_tm.addAliasName("Hdr.stk_xfr_act_tm", p);
		p.Hdr_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.create(p.getHdrR().ac_dt_p());
		p.Hdr_ac_dt_p_PPanel.setName("Hdr.ac_dt_p");
		p.Hdr_ac_dt = p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt;
		p.Hdr_ac_dt.addAliasName("Hdr.ac_dt", p);
		p.Hdr_can_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.create(p.getHdrR().can_ac_dt_p());
		p.Hdr_can_ac_dt_p_PPanel.setName("Hdr.can_ac_dt_p");
		p.Hdr_can_ac_dt_for_input = p.Hdr_can_ac_dt_p_PPanel.CanAcDt_can_ac_dt_for_input;
		p.Hdr_can_ac_dt_for_input.addAliasName("Hdr.can_ac_dt_for_input", p);
		p.Hdr_can_ac_dt = p.Hdr_can_ac_dt_p_PPanel.CanAcDt_can_ac_dt_for_call;
		p.Hdr_can_ac_dt.addAliasName("Hdr.can_ac_dt", p);
		p.Hdr_ac_dt_after_srch = p.Hdr_can_ac_dt_p_PPanel.CanAcDt_ac_dt_after_srch;
		p.Hdr_ac_dt_after_srch.addAliasName("Hdr.ac_dt_after_srch", p);
		p.Hdr_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getHdrR().usr_dpt_p());
		p.Hdr_usr_dpt_p_PPanel.setName("Hdr.usr_dpt_p");
		p.Hdr_act_usr_cd = p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.Hdr_act_usr_cd.addAliasName("Hdr.act_usr_cd", p);
		p.Hdr_act_usr_nm = p.Hdr_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.Hdr_act_usr_nm.addAliasName("Hdr.act_usr_nm", p);
		p.Hdr_act_dpt_cd = p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.Hdr_act_dpt_cd.addAliasName("Hdr.act_dpt_cd", p);
		p.Hdr_act_dpt_nm = p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.Hdr_act_dpt_nm.addAliasName("Hdr.act_dpt_nm", p);
	}

	/**
	 * [Hdr2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr2(MSBEP_StkXfrActReg p) {
	}

	/**
	 * [GiPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateGiPnl(MSBEP_StkXfrActReg p) {
	}

	/**
	 * [DtlGi]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlGi(MSBEP_StkXfrActReg p) {
		p.DtlGi_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$itm_p);
		p.DtlGi_itm_p_PPanel.setName("DtlGi.itm_p");
		p.columnDtlGi_itm_cd = p.DtlGi_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtlGi_itm_cd.addAliasName("DtlGi.itm_cd", p);
		p.columnDtlGi_itm_sub1 = p.DtlGi_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtlGi_itm_sub1.addAliasName("DtlGi.itm_sub1", p);
		p.columnDtlGi_itm_sub2 = p.DtlGi_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtlGi_itm_sub2.addAliasName("DtlGi.itm_sub2", p);
		p.columnDtlGi_itm_sub3 = p.DtlGi_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtlGi_itm_sub3.addAliasName("DtlGi.itm_sub3", p);
		p.columnDtlGi_itm_nm = p.DtlGi_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtlGi_itm_nm.addAliasName("DtlGi.itm_nm", p);
		p.DtlGi_lot_no_p_PPanel = mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$lot_no_p);
		p.DtlGi_lot_no_p_PPanel.setName("DtlGi.lot_no_p");
		p.columnDtlGi_crt_lot_flg = p.DtlGi_lot_no_p_PPanel.columnLotNo_crt_lot_flg;
		p.columnDtlGi_crt_lot_flg.addAliasName("DtlGi.crt_lot_flg", p);
		p.columnDtlGi_lot_no = p.DtlGi_lot_no_p_PPanel.columnLotNo_lot_no;
		p.columnDtlGi_lot_no.addAliasName("DtlGi.lot_no", p);
		p.columnDtlGi_sublot_no = p.DtlGi_lot_no_p_PPanel.columnLotNo_sublot_no;
		p.columnDtlGi_sublot_no.addAliasName("DtlGi.sublot_no", p);
		p.DtlGi_ver_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$ver_p);
		p.DtlGi_ver_p_PPanel.setName("DtlGi.ver_p");
		p.columnDtlGi_ver_no = p.DtlGi_ver_p_PPanel.columnVerNo_ver_no;
		p.columnDtlGi_ver_no.addAliasName("DtlGi.ver_no", p);
		p.DtlGi_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$trd_unit_qty_p);
		p.DtlGi_trd_unit_qty_p_PPanel.setName("DtlGi.trd_unit_qty_p");
		p.columnDtlGi_trd_unit_qty = p.DtlGi_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtlGi_trd_unit_qty.addAliasName("DtlGi.trd_unit_qty", p);
		p.DtlGi_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$base_unit_qty_p);
		p.DtlGi_base_unit_qty_p_PPanel.setName("DtlGi.base_unit_qty_p");
		p.columnDtlGi_base_unit_qty = p.DtlGi_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtlGi_base_unit_qty.addAliasName("DtlGi.base_unit_qty", p);
		p.DtlGi_std_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$std_cont_qty_p);
		p.DtlGi_std_cont_qty_p_PPanel.setName("DtlGi.std_cont_qty_p");
		p.columnDtlGi_std_cont_fctr_qty = p.DtlGi_std_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnDtlGi_std_cont_fctr_qty.addAliasName("DtlGi.std_cont_fctr_qty", p);
		p.DtlGi_act_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$act_cont_qty_p);
		p.DtlGi_act_cont_qty_p_PPanel.setName("DtlGi.act_cont_qty_p");
		p.columnDtlGi_act_cont_fctr_qty = p.DtlGi_act_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnDtlGi_act_cont_fctr_qty.addAliasName("DtlGi.act_cont_fctr_qty", p);
		p.DtlGi_std_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$std_cont_fctr_p);
		p.DtlGi_std_cont_fctr_p_PPanel.setName("DtlGi.std_cont_fctr_p");
		p.columnDtlGi_std_cont_fctr = p.DtlGi_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnDtlGi_std_cont_fctr.addAliasName("DtlGi.std_cont_fctr", p);
		p.DtlGi_act_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$act_cont_fctr_p);
		p.DtlGi_act_cont_fctr_p_PPanel.setName("DtlGi.act_cont_fctr_p");
		p.columnDtlGi_act_cont_fctr = p.DtlGi_act_cont_fctr_p_PPanel.columnActContFctr_act_cont_fctr;
		p.columnDtlGi_act_cont_fctr.addAliasName("DtlGi.act_cont_fctr", p);
		p.DtlGi_cont_fctr_unit_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$cont_fctr_unit_p);
		p.DtlGi_cont_fctr_unit_p_PPanel.setName("DtlGi.cont_fctr_unit_p");
		p.columnDtlGi_cont_fctr_unit_cd = p.DtlGi_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnDtlGi_cont_fctr_unit_cd.addAliasName("DtlGi.cont_fctr_unit_cd", p);
		p.columnDtlGi_cont_fctr_unit_nm = p.DtlGi_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnDtlGi_cont_fctr_unit_nm.addAliasName("DtlGi.cont_fctr_unit_nm", p);
		p.DtlGi_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$str_ln_p);
		p.DtlGi_str_ln_p_PPanel.setName("DtlGi.str_ln_p");
		p.columnDtlGi_str_ln_cd = p.DtlGi_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnDtlGi_str_ln_cd.addAliasName("DtlGi.str_ln_cd", p);
		p.columnDtlGi_str_ln_nm = p.DtlGi_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnDtlGi_str_ln_nm.addAliasName("DtlGi.str_ln_nm", p);
		p.columnDtlGi_str_ln_cd_none_flg = p.DtlGi_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnDtlGi_str_ln_cd_none_flg.addAliasName("DtlGi.str_ln_cd_none_flg", p);
		p.DtlGi_sno_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$sno_p);
		p.DtlGi_sno_p_PPanel.setName("DtlGi.sno_p");
		p.columnDtlGi_sno1 = p.DtlGi_sno_p_PPanel.columnSnoWrkNo_sno1;
		p.columnDtlGi_sno1.addAliasName("DtlGi.sno1", p);
		p.columnDtlGi_sno2 = p.DtlGi_sno_p_PPanel.columnSnoWrkNo_sno2;
		p.columnDtlGi_sno2.addAliasName("DtlGi.sno2", p);
		p.columnDtlGi_sno3 = p.DtlGi_sno_p_PPanel.columnSnoWrkNo_sno3;
		p.columnDtlGi_sno3.addAliasName("DtlGi.sno3", p);
		p.columnDtlGi_sno4 = p.DtlGi_sno_p_PPanel.columnSnoWrkNo_sno4;
		p.columnDtlGi_sno4.addAliasName("DtlGi.sno4", p);
		p.columnDtlGi_wrk_no = p.DtlGi_sno_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnDtlGi_wrk_no.addAliasName("DtlGi.wrk_no", p);
		p.columnDtlGi_wrk_nm = p.DtlGi_sno_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnDtlGi_wrk_nm.addAliasName("DtlGi.wrk_nm", p);
		p.DtlGi_stk_bp_p_PPanel = mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$stk_bp_p);
		p.DtlGi_stk_bp_p_PPanel.setName("DtlGi.stk_bp_p");
		p.columnDtlGi_stk_bp_cd = p.DtlGi_stk_bp_p_PPanel.columnStkBp_stk_bp_cd;
		p.columnDtlGi_stk_bp_cd.addAliasName("DtlGi.stk_bp_cd", p);
		p.columnDtlGi_stk_bp_nm = p.DtlGi_stk_bp_p_PPanel.columnStkBp_stk_bp_nm;
		p.columnDtlGi_stk_bp_nm.addAliasName("DtlGi.stk_bp_nm", p);
		p.DtlGi_stk_arrv_bp_p_PPanel = mcframe.clientMSUB.MSUBP5060.MSUBP_StkArrvBp_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$stk_arrv_bp_p);
		p.DtlGi_stk_arrv_bp_p_PPanel.setName("DtlGi.stk_arrv_bp_p");
		p.columnDtlGi_stk_arrv_bp_cd = p.DtlGi_stk_arrv_bp_p_PPanel.columnStkArrvBp_stk_arrv_bp_cd;
		p.columnDtlGi_stk_arrv_bp_cd.addAliasName("DtlGi.stk_arrv_bp_cd", p);
		p.columnDtlGi_stk_arrv_bp_nm = p.DtlGi_stk_arrv_bp_p_PPanel.columnStkArrvBp_stk_arrv_bp_nm;
		p.columnDtlGi_stk_arrv_bp_nm.addAliasName("DtlGi.stk_arrv_bp_nm", p);
	}

	/**
	 * [BtnGi]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtnGi(MSBEP_StkXfrActReg p) {
	}

	/**
	 * [GrPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateGrPnl(MSBEP_StkXfrActReg p) {
	}

	/**
	 * [DtlGr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlGr(MSBEP_StkXfrActReg p) {
		p.DtlGr_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$itm_p);
		p.DtlGr_itm_p_PPanel.setName("DtlGr.itm_p");
		p.columnDtlGr_itm_cd = p.DtlGr_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtlGr_itm_cd.addAliasName("DtlGr.itm_cd", p);
		p.columnDtlGr_itm_sub1 = p.DtlGr_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtlGr_itm_sub1.addAliasName("DtlGr.itm_sub1", p);
		p.columnDtlGr_itm_sub2 = p.DtlGr_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtlGr_itm_sub2.addAliasName("DtlGr.itm_sub2", p);
		p.columnDtlGr_itm_sub3 = p.DtlGr_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtlGr_itm_sub3.addAliasName("DtlGr.itm_sub3", p);
		p.columnDtlGr_itm_nm = p.DtlGr_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtlGr_itm_nm.addAliasName("DtlGr.itm_nm", p);
		p.DtlGr_lot_no_p_PPanel = mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$lot_no_p);
		p.DtlGr_lot_no_p_PPanel.setName("DtlGr.lot_no_p");
		p.columnDtlGr_crt_lot_flg = p.DtlGr_lot_no_p_PPanel.columnLotNo_crt_lot_flg;
		p.columnDtlGr_crt_lot_flg.addAliasName("DtlGr.crt_lot_flg", p);
		p.columnDtlGr_lot_no = p.DtlGr_lot_no_p_PPanel.columnLotNo_lot_no;
		p.columnDtlGr_lot_no.addAliasName("DtlGr.lot_no", p);
		p.columnDtlGr_sublot_no = p.DtlGr_lot_no_p_PPanel.columnLotNo_sublot_no;
		p.columnDtlGr_sublot_no.addAliasName("DtlGr.sublot_no", p);
		p.DtlGr_ver_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$ver_p);
		p.DtlGr_ver_p_PPanel.setName("DtlGr.ver_p");
		p.columnDtlGr_ver_no = p.DtlGr_ver_p_PPanel.columnVerNo_ver_no;
		p.columnDtlGr_ver_no.addAliasName("DtlGr.ver_no", p);
		p.DtlGr_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$trd_unit_qty_p);
		p.DtlGr_trd_unit_qty_p_PPanel.setName("DtlGr.trd_unit_qty_p");
		p.columnDtlGr_trd_unit_qty = p.DtlGr_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtlGr_trd_unit_qty.addAliasName("DtlGr.trd_unit_qty", p);
		p.DtlGr_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$base_unit_qty_p);
		p.DtlGr_base_unit_qty_p_PPanel.setName("DtlGr.base_unit_qty_p");
		p.columnDtlGr_base_unit_qty = p.DtlGr_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtlGr_base_unit_qty.addAliasName("DtlGr.base_unit_qty", p);
		p.DtlGr_std_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$std_cont_qty_p);
		p.DtlGr_std_cont_qty_p_PPanel.setName("DtlGr.std_cont_qty_p");
		p.columnDtlGr_std_cont_fctr_qty = p.DtlGr_std_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnDtlGr_std_cont_fctr_qty.addAliasName("DtlGr.std_cont_fctr_qty", p);
		p.DtlGr_act_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$act_cont_qty_p);
		p.DtlGr_act_cont_qty_p_PPanel.setName("DtlGr.act_cont_qty_p");
		p.columnDtlGr_act_cont_fctr_qty = p.DtlGr_act_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnDtlGr_act_cont_fctr_qty.addAliasName("DtlGr.act_cont_fctr_qty", p);
		p.DtlGr_std_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$std_cont_fctr_p);
		p.DtlGr_std_cont_fctr_p_PPanel.setName("DtlGr.std_cont_fctr_p");
		p.columnDtlGr_std_cont_fctr = p.DtlGr_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnDtlGr_std_cont_fctr.addAliasName("DtlGr.std_cont_fctr", p);
		p.DtlGr_act_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$act_cont_fctr_p);
		p.DtlGr_act_cont_fctr_p_PPanel.setName("DtlGr.act_cont_fctr_p");
		p.columnDtlGr_act_cont_fctr = p.DtlGr_act_cont_fctr_p_PPanel.columnActContFctr_act_cont_fctr;
		p.columnDtlGr_act_cont_fctr.addAliasName("DtlGr.act_cont_fctr", p);
		p.DtlGr_cont_fctr_unit_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$cont_fctr_unit_p);
		p.DtlGr_cont_fctr_unit_p_PPanel.setName("DtlGr.cont_fctr_unit_p");
		p.columnDtlGr_cont_fctr_unit_cd = p.DtlGr_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnDtlGr_cont_fctr_unit_cd.addAliasName("DtlGr.cont_fctr_unit_cd", p);
		p.columnDtlGr_cont_fctr_unit_nm = p.DtlGr_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnDtlGr_cont_fctr_unit_nm.addAliasName("DtlGr.cont_fctr_unit_nm", p);
		p.DtlGr_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$str_ln_p);
		p.DtlGr_str_ln_p_PPanel.setName("DtlGr.str_ln_p");
		p.columnDtlGr_str_ln_cd = p.DtlGr_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnDtlGr_str_ln_cd.addAliasName("DtlGr.str_ln_cd", p);
		p.columnDtlGr_str_ln_nm = p.DtlGr_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnDtlGr_str_ln_nm.addAliasName("DtlGr.str_ln_nm", p);
		p.columnDtlGr_str_ln_cd_none_flg = p.DtlGr_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnDtlGr_str_ln_cd_none_flg.addAliasName("DtlGr.str_ln_cd_none_flg", p);
		p.DtlGr_sno_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$sno_p);
		p.DtlGr_sno_p_PPanel.setName("DtlGr.sno_p");
		p.columnDtlGr_sno1 = p.DtlGr_sno_p_PPanel.columnSnoWrkNo_sno1;
		p.columnDtlGr_sno1.addAliasName("DtlGr.sno1", p);
		p.columnDtlGr_sno2 = p.DtlGr_sno_p_PPanel.columnSnoWrkNo_sno2;
		p.columnDtlGr_sno2.addAliasName("DtlGr.sno2", p);
		p.columnDtlGr_sno3 = p.DtlGr_sno_p_PPanel.columnSnoWrkNo_sno3;
		p.columnDtlGr_sno3.addAliasName("DtlGr.sno3", p);
		p.columnDtlGr_sno4 = p.DtlGr_sno_p_PPanel.columnSnoWrkNo_sno4;
		p.columnDtlGr_sno4.addAliasName("DtlGr.sno4", p);
		p.columnDtlGr_wrk_no = p.DtlGr_sno_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnDtlGr_wrk_no.addAliasName("DtlGr.wrk_no", p);
		p.columnDtlGr_wrk_nm = p.DtlGr_sno_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnDtlGr_wrk_nm.addAliasName("DtlGr.wrk_nm", p);
		p.DtlGr_stk_bp_p_PPanel = mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$stk_bp_p);
		p.DtlGr_stk_bp_p_PPanel.setName("DtlGr.stk_bp_p");
		p.columnDtlGr_stk_bp_cd = p.DtlGr_stk_bp_p_PPanel.columnStkBp_stk_bp_cd;
		p.columnDtlGr_stk_bp_cd.addAliasName("DtlGr.stk_bp_cd", p);
		p.columnDtlGr_stk_bp_nm = p.DtlGr_stk_bp_p_PPanel.columnStkBp_stk_bp_nm;
		p.columnDtlGr_stk_bp_nm.addAliasName("DtlGr.stk_bp_nm", p);
		p.DtlGr_stk_arrv_bp_p_PPanel = mcframe.clientMSUB.MSUBP5060.MSUBP_StkArrvBp_D.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.$stk_arrv_bp_p);
		p.DtlGr_stk_arrv_bp_p_PPanel.setName("DtlGr.stk_arrv_bp_p");
		p.columnDtlGr_stk_arrv_bp_cd = p.DtlGr_stk_arrv_bp_p_PPanel.columnStkArrvBp_stk_arrv_bp_cd;
		p.columnDtlGr_stk_arrv_bp_cd.addAliasName("DtlGr.stk_arrv_bp_cd", p);
		p.columnDtlGr_stk_arrv_bp_nm = p.DtlGr_stk_arrv_bp_p_PPanel.columnStkArrvBp_stk_arrv_bp_nm;
		p.columnDtlGr_stk_arrv_bp_nm.addAliasName("DtlGr.stk_arrv_bp_nm", p);
	}

	/**
	 * [BtnGr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtnGr(MSBEP_StkXfrActReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBEP_StkXfrActReg p) {
		p.Btn_open_MSBEP0500_p_PPanel = mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.create();
		p.Btn_open_MSBEP0500_p_PPanel.setName("Btn.open_MSBEP0500_p");
		p.Btn_sync_p_PPanel = mcframe.clientFSBA.FSBAP0020.FSBAP0020.create();
		p.Btn_sync_p_PPanel.setName("Btn.sync_p");
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBEP_StkXfrActReg p) {
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

	
	/** [Hdr_trd_cd_ListPutter]の定義 */
	private MCListPutter Hdr_trd_cd_p = null;

	/**
	 * [Hdr_trd_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_trd_cd_ListPutter() {
		if (Hdr_trd_cd_p == null) {
			Hdr_trd_cd_p = createHdr_trd_cd_ListPutter(Hdr_trd_cd, "trd_cd", "trd_nm","trd_ptn_typ");

		}
		return Hdr_trd_cd_p;
	}
	
	
	/** [Hdr_loc_cd_ListPutter]の定義 */
	private MCListPutter Hdr_loc_cd_p = null;

	/**
	 * [Hdr_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_loc_cd_ListPutter() {
		if (Hdr_loc_cd_p == null) {
			Hdr_loc_cd_p = createHdr_loc_cd_ListPutter(Hdr_loc_cd, "loc_cd", "loc_nm","sppl_cd","wg_cd","wg_nm","str_ln_tgt_flg","site_cd");

		}
		return Hdr_loc_cd_p;
	}
	
	
	/** [Hdr_stk_xfr_rsn_cd_ListPutter]の定義 */
	private MCListPutter Hdr_stk_xfr_rsn_cd_p = null;

	/**
	 * [Hdr_stk_xfr_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_stk_xfr_rsn_cd_ListPutter() {
		if (Hdr_stk_xfr_rsn_cd_p == null) {
			Hdr_stk_xfr_rsn_cd_p = createHdr_stk_xfr_rsn_cd_ListPutter(Hdr_stk_xfr_rsn_cd, "stk_xfr_rsn_cd", "stk_xfr_rsn_nm");

		}
		return Hdr_stk_xfr_rsn_cd_p;
	}
	
	
	/** [DtlGi_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter DtlGi_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [DtlGi_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtlGi_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (DtlGi_itm_p_PPanel_columnItm_itm_cd_p == null) {
			DtlGi_itm_p_PPanel_columnItm_itm_cd_p = createDtlGi_itm_p_PPanel_columnItm_itm_cd_ListPutter(DtlGi_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3","lot_mng_typ","lot_no_typ","sublot_mng_typ","sublot_no_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","cont_fctr_flg","stk_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_conv_rnd_typ","not_new_lot_flg","ver_flg","lot_no_ptn_cd","sublot_no_ptn_cd","sundry_itm_flg");
		}
		return DtlGi_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [DtlGi_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter DtlGi_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [DtlGi_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getDtlGi_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (DtlGi_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			DtlGi_itm_p_PPanel_columnItm_itm_sub1_p = createDtlGi_itm_p_PPanel_columnItm_itm_sub1_ListPutter(DtlGi_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3","lot_mng_typ","lot_no_typ","sublot_mng_typ","sublot_no_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","cont_fctr_flg","stk_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_conv_rnd_typ","not_new_lot_flg","ver_flg","lot_no_ptn_cd","sublot_no_ptn_cd","sundry_itm_flg");
		}
		return DtlGi_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [DtlGi_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter DtlGi_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [DtlGi_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getDtlGi_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (DtlGi_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			DtlGi_itm_p_PPanel_columnItm_itm_sub2_p = createDtlGi_itm_p_PPanel_columnItm_itm_sub2_ListPutter(DtlGi_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3","lot_mng_typ","lot_no_typ","sublot_mng_typ","sublot_no_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","cont_fctr_flg","stk_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_conv_rnd_typ","not_new_lot_flg","ver_flg","lot_no_ptn_cd","sublot_no_ptn_cd","sundry_itm_flg");
		}
		return DtlGi_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [DtlGi_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter DtlGi_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [DtlGi_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getDtlGi_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (DtlGi_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			DtlGi_itm_p_PPanel_columnItm_itm_sub3_p = createDtlGi_itm_p_PPanel_columnItm_itm_sub3_ListPutter(DtlGi_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","lot_mng_typ","lot_no_typ","sublot_mng_typ","sublot_no_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","cont_fctr_flg","stk_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_conv_rnd_typ","not_new_lot_flg","ver_flg","lot_no_ptn_cd","sublot_no_ptn_cd","sundry_itm_flg");
		}
		return DtlGi_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [DtlGi_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の定義 */
	private MCListPutter DtlGi_lot_no_p_PPanel_columnLotNo_lot_no_p = null;

	/**
	 * [DtlGi_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の取得
	 */
	protected MCListPutter getDtlGi_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter() {
		if (DtlGi_lot_no_p_PPanel_columnLotNo_lot_no_p == null) {
			DtlGi_lot_no_p_PPanel_columnLotNo_lot_no_p = createDtlGi_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter(DtlGi_lot_no_p_PPanel.columnLotNo_lot_no, "lot_no", "sublot_no","ver_no");
		}
		return DtlGi_lot_no_p_PPanel_columnLotNo_lot_no_p;
	}
	
	
	/** [DtlGi_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の定義 */
	private MCListPutter DtlGi_lot_no_p_PPanel_columnLotNo_sublot_no_p = null;

	/**
	 * [DtlGi_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の取得
	 */
	protected MCListPutter getDtlGi_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter() {
		if (DtlGi_lot_no_p_PPanel_columnLotNo_sublot_no_p == null) {
			DtlGi_lot_no_p_PPanel_columnLotNo_sublot_no_p = createDtlGi_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter(DtlGi_lot_no_p_PPanel.columnLotNo_sublot_no, "sublot_no", "ver_no");
		}
		return DtlGi_lot_no_p_PPanel_columnLotNo_sublot_no_p;
	}
	
	
	/** [DtlGi_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter DtlGi_trd_unit_cd_p = null;

	/**
	 * [DtlGi_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtlGi_trd_unit_cd_ListPutter() {
		if (DtlGi_trd_unit_cd_p == null) {
			DtlGi_trd_unit_cd_p = createDtlGi_trd_unit_cd_ListPutter(columnDtlGi_trd_unit_cd, "trd_unit_cd", "trd_unit_nm","trd_unit_conv_base_qty","trd_unit_conv_qty","trd_unit_dec_place","trd_unit_rnd_typ");

		}
		return DtlGi_trd_unit_cd_p;
	}
	
	
	/** [DtlGi_quality_typ_ListPutter]の定義 */
	private MCListPutter DtlGi_quality_typ_p = null;

	/**
	 * [DtlGi_quality_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtlGi_quality_typ_ListPutter() {
		if (DtlGi_quality_typ_p == null) {
			DtlGi_quality_typ_p = createDtlGi_quality_typ_ListPutter(columnDtlGi_quality_typ, "quality_typ", "quality_typ_nm");

		}
		return DtlGi_quality_typ_p;
	}
	
	
	/** [DtlGi_gd_cd_ListPutter]の定義 */
	private MCListPutter DtlGi_gd_cd_p = null;

	/**
	 * [DtlGi_gd_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtlGi_gd_cd_ListPutter() {
		if (DtlGi_gd_cd_p == null) {
			DtlGi_gd_cd_p = createDtlGi_gd_cd_ListPutter(columnDtlGi_gd_cd, "gd_cd", "gd_nm");

		}
		return DtlGi_gd_cd_p;
	}
	
	
	/** [DtlGi_stk_id_typ_ListPutter]の定義 */
	private MCListPutter DtlGi_stk_id_typ_p = null;

	/**
	 * [DtlGi_stk_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtlGi_stk_id_typ_ListPutter() {
		if (DtlGi_stk_id_typ_p == null) {
			DtlGi_stk_id_typ_p = createDtlGi_stk_id_typ_ListPutter(columnDtlGi_stk_id_typ, "stk_id_typ", "stk_id_typ_nm");

		}
		return DtlGi_stk_id_typ_p;
	}
	
	
	/** [DtlGi_fix_no_typ_ListPutter]の定義 */
	private MCListPutter DtlGi_fix_no_typ_p = null;

	/**
	 * [DtlGi_fix_no_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtlGi_fix_no_typ_ListPutter() {
		if (DtlGi_fix_no_typ_p == null) {
			DtlGi_fix_no_typ_p = createDtlGi_fix_no_typ_ListPutter(columnDtlGi_fix_no_typ, "fix_no_typ", "fix_no_typ_nm");

		}
		return DtlGi_fix_no_typ_p;
	}
	
	
	/** [DtlGr_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter DtlGr_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [DtlGr_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtlGr_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (DtlGr_itm_p_PPanel_columnItm_itm_cd_p == null) {
			DtlGr_itm_p_PPanel_columnItm_itm_cd_p = createDtlGr_itm_p_PPanel_columnItm_itm_cd_ListPutter(DtlGr_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3","lot_mng_typ","lot_no_typ","sublot_mng_typ","sublot_no_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","cont_fctr_flg","stk_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_conv_rnd_typ","not_new_lot_flg","ver_flg","lot_no_ptn_cd","sublot_no_ptn_cd","sundry_itm_flg");
		}
		return DtlGr_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [DtlGr_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter DtlGr_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [DtlGr_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getDtlGr_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (DtlGr_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			DtlGr_itm_p_PPanel_columnItm_itm_sub1_p = createDtlGr_itm_p_PPanel_columnItm_itm_sub1_ListPutter(DtlGr_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3","lot_mng_typ","lot_no_typ","sublot_mng_typ","sublot_no_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","cont_fctr_flg","stk_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_conv_rnd_typ","not_new_lot_flg","ver_flg","lot_no_ptn_cd","sublot_no_ptn_cd","sundry_itm_flg");
		}
		return DtlGr_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [DtlGr_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter DtlGr_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [DtlGr_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getDtlGr_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (DtlGr_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			DtlGr_itm_p_PPanel_columnItm_itm_sub2_p = createDtlGr_itm_p_PPanel_columnItm_itm_sub2_ListPutter(DtlGr_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3","lot_mng_typ","lot_no_typ","sublot_mng_typ","sublot_no_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","cont_fctr_flg","stk_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_conv_rnd_typ","not_new_lot_flg","ver_flg","lot_no_ptn_cd","sublot_no_ptn_cd","sundry_itm_flg");
		}
		return DtlGr_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [DtlGr_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter DtlGr_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [DtlGr_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getDtlGr_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (DtlGr_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			DtlGr_itm_p_PPanel_columnItm_itm_sub3_p = createDtlGr_itm_p_PPanel_columnItm_itm_sub3_ListPutter(DtlGr_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","lot_mng_typ","lot_no_typ","sublot_mng_typ","sublot_no_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","cont_fctr_flg","stk_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_conv_rnd_typ","not_new_lot_flg","ver_flg","lot_no_ptn_cd","sublot_no_ptn_cd","sundry_itm_flg");
		}
		return DtlGr_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [DtlGr_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の定義 */
	private MCListPutter DtlGr_lot_no_p_PPanel_columnLotNo_lot_no_p = null;

	/**
	 * [DtlGr_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の取得
	 */
	protected MCListPutter getDtlGr_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter() {
		if (DtlGr_lot_no_p_PPanel_columnLotNo_lot_no_p == null) {
			DtlGr_lot_no_p_PPanel_columnLotNo_lot_no_p = createDtlGr_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter(DtlGr_lot_no_p_PPanel.columnLotNo_lot_no, "lot_no", "sublot_no","ver_no");
		}
		return DtlGr_lot_no_p_PPanel_columnLotNo_lot_no_p;
	}
	
	
	/** [DtlGr_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の定義 */
	private MCListPutter DtlGr_lot_no_p_PPanel_columnLotNo_sublot_no_p = null;

	/**
	 * [DtlGr_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の取得
	 */
	protected MCListPutter getDtlGr_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter() {
		if (DtlGr_lot_no_p_PPanel_columnLotNo_sublot_no_p == null) {
			DtlGr_lot_no_p_PPanel_columnLotNo_sublot_no_p = createDtlGr_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter(DtlGr_lot_no_p_PPanel.columnLotNo_sublot_no, "sublot_no", "ver_no");
		}
		return DtlGr_lot_no_p_PPanel_columnLotNo_sublot_no_p;
	}
	
	
	/** [DtlGr_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter DtlGr_trd_unit_cd_p = null;

	/**
	 * [DtlGr_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtlGr_trd_unit_cd_ListPutter() {
		if (DtlGr_trd_unit_cd_p == null) {
			DtlGr_trd_unit_cd_p = createDtlGr_trd_unit_cd_ListPutter(columnDtlGr_trd_unit_cd, "trd_unit_cd", "trd_unit_nm","trd_unit_conv_base_qty","trd_unit_conv_qty","trd_unit_dec_place","trd_unit_rnd_typ");

		}
		return DtlGr_trd_unit_cd_p;
	}
	
	
	/** [DtlGr_quality_typ_ListPutter]の定義 */
	private MCListPutter DtlGr_quality_typ_p = null;

	/**
	 * [DtlGr_quality_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtlGr_quality_typ_ListPutter() {
		if (DtlGr_quality_typ_p == null) {
			DtlGr_quality_typ_p = createDtlGr_quality_typ_ListPutter(columnDtlGr_quality_typ, "quality_typ", "quality_typ_nm");

		}
		return DtlGr_quality_typ_p;
	}
	
	
	/** [DtlGr_gd_cd_ListPutter]の定義 */
	private MCListPutter DtlGr_gd_cd_p = null;

	/**
	 * [DtlGr_gd_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtlGr_gd_cd_ListPutter() {
		if (DtlGr_gd_cd_p == null) {
			DtlGr_gd_cd_p = createDtlGr_gd_cd_ListPutter(columnDtlGr_gd_cd, "gd_cd", "gd_nm");

		}
		return DtlGr_gd_cd_p;
	}
	
	
	/** [DtlGr_stk_id_typ_ListPutter]の定義 */
	private MCListPutter DtlGr_stk_id_typ_p = null;

	/**
	 * [DtlGr_stk_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtlGr_stk_id_typ_ListPutter() {
		if (DtlGr_stk_id_typ_p == null) {
			DtlGr_stk_id_typ_p = createDtlGr_stk_id_typ_ListPutter(columnDtlGr_stk_id_typ, "stk_id_typ", "stk_id_typ_nm");

		}
		return DtlGr_stk_id_typ_p;
	}
	
	
	/** [DtlGr_fix_no_typ_ListPutter]の定義 */
	private MCListPutter DtlGr_fix_no_typ_p = null;

	/**
	 * [DtlGr_fix_no_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtlGr_fix_no_typ_ListPutter() {
		if (DtlGr_fix_no_typ_p == null) {
			DtlGr_fix_no_typ_p = createDtlGr_fix_no_typ_ListPutter(columnDtlGr_fix_no_typ, "fix_no_typ", "fix_no_typ_nm");

		}
		return DtlGr_fix_no_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_StkXfrActReg create(){
		MSBEP_StkXfrActReg p = new MSBEP_StkXfrActReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_StkXfrActReg create(String name){
		MSBEP_StkXfrActReg p = new MSBEP_StkXfrActReg(name);
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
		MSBEP_StkXfrActReg_MC.jbfInitScreenOpe((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbfInitCnd((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbfInitHdrTab((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbfInitHdr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbfInitHdr2((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbfInitGiPnl((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbfInitDtlGi((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbfInitBtnGi((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbfInitGrPnl((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbfInitDtlGr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbfInitBtnGr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbfInitBtn((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbfInitEastBtn((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbInitScreenOpe((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbInitCnd((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbInitHdrTab((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbInitHdr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbInitHdr2((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbInitGiPnl((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbInitDtlGi((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbInitBtnGi((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbInitGrPnl((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbInitDtlGr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbInitBtnGr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbInitBtn((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.jbInitEastBtn((MSBEP_StkXfrActReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBEP_StkXfrActReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_StkXfrActReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_SRCH = p.beansFactory.createRadioButton("Cnd.ope_SRCH");
		p.Cnd_stk_xfr_act_no_Label = p.beansFactory.createLabel("Cnd.stk_xfr_act_no_Label");
		p.Cnd_stk_xfr_act_no = p.beansFactory.createTextField("Cnd.stk_xfr_act_no");
		p.Cnd_stk_xfr_act_no.setLabel(p.Cnd_stk_xfr_act_no_Label);
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBEP_StkXfrActReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBEP_StkXfrActReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_trd_cd_Label = p.beansFactory.createLabel("Hdr.trd_cd_Label");
		p.Hdr_trd_cd = p.beansFactory.createTextComboBox("Hdr.trd_cd");
		p.Hdr_trd_cd.setLabel(p.Hdr_trd_cd_Label);
		p.Hdr_trd_nm = p.beansFactory.createTextField("Hdr.trd_nm");
		p.Hdr_trd_ptn_typ = p.beansFactory.createTextField("Hdr.trd_ptn_typ");
		p.Hdr_stk_xfr_act_no_Label = p.beansFactory.createLabel("Hdr.stk_xfr_act_no_Label");
		p.Hdr_stk_xfr_act_no = p.beansFactory.createTextField("Hdr.stk_xfr_act_no");
		p.Hdr_stk_xfr_act_no.setLabel(p.Hdr_stk_xfr_act_no_Label);
		p.Hdr_prnt_flg = p.beansFactory.createCheckBox("Hdr.prnt_flg");
		p.Hdr_loc_cd_Label = p.beansFactory.createLabel("Hdr.loc_cd_Label");
		p.Hdr_loc_cd = p.beansFactory.createTextField("Hdr.loc_cd");
		p.Hdr_loc_cd.setLabel(p.Hdr_loc_cd_Label);
		p.Hdr_loc_nm = p.beansFactory.createTextField("Hdr.loc_nm");
		p.Hdr_sppl_cd = p.beansFactory.createTextField("Hdr.sppl_cd");
		p.Hdr_site_cd = p.beansFactory.createTextField("Hdr.site_cd");
		p.Hdr_wg_cd_Label = p.beansFactory.createLabel("Hdr.wg_cd_Label");
		p.Hdr_wg_cd = p.beansFactory.createTextField("Hdr.wg_cd");
		p.Hdr_wg_cd.setLabel(p.Hdr_wg_cd_Label);
		p.Hdr_wg_nm = p.beansFactory.createTextField("Hdr.wg_nm");
		p.Hdr_str_ln_tgt_flg = p.beansFactory.createCheckBox("Hdr.str_ln_tgt_flg");
		p.Hdr_stk_xfr_rsn_cd_Label = p.beansFactory.createLabel("Hdr.stk_xfr_rsn_cd_Label");
		p.Hdr_stk_xfr_rsn_cd = p.beansFactory.createTextComboBox("Hdr.stk_xfr_rsn_cd");
		p.Hdr_stk_xfr_rsn_cd.setLabel(p.Hdr_stk_xfr_rsn_cd_Label);
		p.Hdr_stk_xfr_rsn_nm = p.beansFactory.createTextField("Hdr.stk_xfr_rsn_nm");
		p.Hdr_intr_rmrks_Label = p.beansFactory.createLabel("Hdr.intr_rmrks_Label");
		p.Hdr_intr_rmrks = p.beansFactory.createTextField("Hdr.intr_rmrks");
		p.Hdr_intr_rmrks.setLabel(p.Hdr_intr_rmrks_Label);
		p.Hdr_trd_rmrks_Label = p.beansFactory.createLabel("Hdr.trd_rmrks_Label");
		p.Hdr_trd_rmrks = p.beansFactory.createTextField("Hdr.trd_rmrks");
		p.Hdr_trd_rmrks.setLabel(p.Hdr_trd_rmrks_Label);
		p.Hdr_sub_char1_Label = p.beansFactory.createLabel("Hdr.sub_char1_Label");
		p.Hdr_sub_char1 = p.beansFactory.createTextField("Hdr.sub_char1");
		p.Hdr_sub_char1.setLabel(p.Hdr_sub_char1_Label);
		p.Hdr_sub_char2_Label = p.beansFactory.createLabel("Hdr.sub_char2_Label");
		p.Hdr_sub_char2 = p.beansFactory.createTextField("Hdr.sub_char2");
		p.Hdr_sub_char2.setLabel(p.Hdr_sub_char2_Label);
		p.Hdr_sub_char3_Label = p.beansFactory.createLabel("Hdr.sub_char3_Label");
		p.Hdr_sub_char3 = p.beansFactory.createTextField("Hdr.sub_char3");
		p.Hdr_sub_char3.setLabel(p.Hdr_sub_char3_Label);
		p.Hdr_upd_cntr = p.beansFactory.createNumberField("Hdr.upd_cntr");
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
	protected static void jbfInitHdr2(MSBEP_StkXfrActReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel = p.beansFactory.createPanel("Hdr2");
		// ブロックの項目の初期化
	}

	/**
	 * [GiPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitGiPnl(MSBEP_StkXfrActReg p) {
		// ブロック関連の初期化
		p.GiPnlPanel = p.beansFactory.createPanel("GiPnl");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlGi]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlGi(MSBEP_StkXfrActReg p) {
		// ブロック関連の初期化
		p.DtlGiPanel = p.beansFactory.createPanel("DtlGi");
		p.DtlGiTitledBorder = p.beansFactory.createTitledBorder();
		p.DtlGiScrollPane = p.beansFactory.createScrollPane("DtlGi.scroll");
		p.createDtlGiTable();
		// ブロックの項目の初期化
		p.columnDtlGi_sundry_itm_flg = p.beansFactory.createTableColumn("DtlGi.sundry_itm_flg", MCColumnType.CHECK);
		p.columnDtlGi_not_new_lot_flg = p.beansFactory.createTableColumn("DtlGi.not_new_lot_flg", MCColumnType.CHECK);
		p.columnDtlGi_lot_mng_typ = p.beansFactory.createTableColumn("DtlGi.lot_mng_typ", MCColumnType.TEXT);
		p.columnDtlGi_lot_no_typ = p.beansFactory.createTableColumn("DtlGi.lot_no_typ", MCColumnType.TEXT);
		p.columnDtlGi_sublot_mng_typ = p.beansFactory.createTableColumn("DtlGi.sublot_mng_typ", MCColumnType.TEXT);
		p.columnDtlGi_sublot_no_typ = p.beansFactory.createTableColumn("DtlGi.sublot_no_typ", MCColumnType.TEXT);
		p.columnDtlGi_lot_no_ptn_cd = p.beansFactory.createTableColumn("DtlGi.lot_no_ptn_cd", MCColumnType.TEXT);
		p.columnDtlGi_sublot_no_ptn_cd = p.beansFactory.createTableColumn("DtlGi.sublot_no_ptn_cd", MCColumnType.TEXT);
		p.columnDtlGi_ver_flg = p.beansFactory.createTableColumn("DtlGi.ver_flg", MCColumnType.CHECK);
		p.columnDtlGi_sno1_mng_typ = p.beansFactory.createTableColumn("DtlGi.sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtlGi_sno2_mng_typ = p.beansFactory.createTableColumn("DtlGi.sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtlGi_sno3_mng_typ = p.beansFactory.createTableColumn("DtlGi.sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtlGi_sno4_mng_typ = p.beansFactory.createTableColumn("DtlGi.sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtlGi_cont_fctr_flg = p.beansFactory.createTableColumn("DtlGi.cont_fctr_flg", MCColumnType.CHECK);
		p.columnDtlGi_stk_mng_typ = p.beansFactory.createTableColumn("DtlGi.stk_mng_typ", MCColumnType.TEXT);
		p.columnDtlGi_trd_unit_cd = p.beansFactory.createTableColumn("DtlGi.trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtlGi_trd_unit_nm = p.beansFactory.createTableColumn("DtlGi.trd_unit_nm", MCColumnType.TEXT);
		p.columnDtlGi_trd_unit_dec_place = p.beansFactory.createTableColumn("DtlGi.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtlGi_trd_unit_rnd_typ = p.beansFactory.createTableColumn("DtlGi.trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtlGi_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("DtlGi.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnDtlGi_trd_unit_conv_qty = p.beansFactory.createTableColumn("DtlGi.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtlGi_base_unit_cd = p.beansFactory.createTableColumn("DtlGi.base_unit_cd", MCColumnType.TEXT);
		p.columnDtlGi_base_unit_nm = p.beansFactory.createTableColumn("DtlGi.base_unit_nm", MCColumnType.TEXT);
		p.columnDtlGi_base_unit_dec_place = p.beansFactory.createTableColumn("DtlGi.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtlGi_base_unit_conv_rnd_typ = p.beansFactory.createTableColumn("DtlGi.base_unit_conv_rnd_typ", MCColumnType.TEXT);
		p.columnDtlGi_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("DtlGi.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnDtlGi_cont_fctr_dec_place = p.beansFactory.createTableColumn("DtlGi.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnDtlGi_quality_typ = p.beansFactory.createTableColumn("DtlGi.quality_typ", MCColumnType.TEXT_COMBO);
		p.columnDtlGi_quality_typ_nm = p.beansFactory.createTableColumn("DtlGi.quality_typ_nm", MCColumnType.TEXT);
		p.columnDtlGi_gd_cd = p.beansFactory.createTableColumn("DtlGi.gd_cd", MCColumnType.TEXT_COMBO);
		p.columnDtlGi_gd_nm = p.beansFactory.createTableColumn("DtlGi.gd_nm", MCColumnType.TEXT);
		p.columnDtlGi_stk_id_typ = p.beansFactory.createTableColumn("DtlGi.stk_id_typ", MCColumnType.TEXT_COMBO);
		p.columnDtlGi_stk_id_typ_nm = p.beansFactory.createTableColumn("DtlGi.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnDtlGi_fix_no_typ = p.beansFactory.createTableColumn("DtlGi.fix_no_typ", MCColumnType.TEXT_COMBO);
		p.columnDtlGi_fix_no_typ_nm = p.beansFactory.createTableColumn("DtlGi.fix_no_typ_nm", MCColumnType.TEXT);
		p.columnDtlGi_fix_no = p.beansFactory.createTableColumn("DtlGi.fix_no", MCColumnType.TEXT);
		p.columnDtlGi_intr_d_rmrks = p.beansFactory.createTableColumn("DtlGi.intr_d_rmrks", MCColumnType.TEXT);
		p.columnDtlGi_trd_d_rmrks = p.beansFactory.createTableColumn("DtlGi.trd_d_rmrks", MCColumnType.TEXT);
		p.columnDtlGi_sub_char1 = p.beansFactory.createTableColumn("DtlGi.sub_char1", MCColumnType.TEXT);
		p.columnDtlGi_sub_char2 = p.beansFactory.createTableColumn("DtlGi.sub_char2", MCColumnType.TEXT);
		p.columnDtlGi_sub_char3 = p.beansFactory.createTableColumn("DtlGi.sub_char3", MCColumnType.TEXT);
		p.columnDtlGi_stk_xfr_act_d_no = p.beansFactory.createTableColumn("DtlGi.stk_xfr_act_d_no", MCColumnType.TEXT);
		p.columnDtlGi_disp_seq = p.beansFactory.createTableColumn("DtlGi.disp_seq", MCColumnType.NUMBER);
	}

	/**
	 * [BtnGi]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtnGi(MSBEP_StkXfrActReg p) {
		// ブロック関連の初期化
		p.BtnGiPanel = p.beansFactory.createPanel("BtnGi");
		// ブロックの項目の初期化
	}

	/**
	 * [GrPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitGrPnl(MSBEP_StkXfrActReg p) {
		// ブロック関連の初期化
		p.GrPnlPanel = p.beansFactory.createPanel("GrPnl");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlGr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlGr(MSBEP_StkXfrActReg p) {
		// ブロック関連の初期化
		p.DtlGrPanel = p.beansFactory.createPanel("DtlGr");
		p.DtlGrTitledBorder = p.beansFactory.createTitledBorder();
		p.DtlGrScrollPane = p.beansFactory.createScrollPane("DtlGr.scroll");
		p.createDtlGrTable();
		// ブロックの項目の初期化
		p.columnDtlGr_sundry_itm_flg = p.beansFactory.createTableColumn("DtlGr.sundry_itm_flg", MCColumnType.CHECK);
		p.columnDtlGr_not_new_lot_flg = p.beansFactory.createTableColumn("DtlGr.not_new_lot_flg", MCColumnType.CHECK);
		p.columnDtlGr_lot_mng_typ = p.beansFactory.createTableColumn("DtlGr.lot_mng_typ", MCColumnType.TEXT);
		p.columnDtlGr_lot_no_typ = p.beansFactory.createTableColumn("DtlGr.lot_no_typ", MCColumnType.TEXT);
		p.columnDtlGr_sublot_mng_typ = p.beansFactory.createTableColumn("DtlGr.sublot_mng_typ", MCColumnType.TEXT);
		p.columnDtlGr_sublot_no_typ = p.beansFactory.createTableColumn("DtlGr.sublot_no_typ", MCColumnType.TEXT);
		p.columnDtlGr_lot_no_ptn_cd = p.beansFactory.createTableColumn("DtlGr.lot_no_ptn_cd", MCColumnType.TEXT);
		p.columnDtlGr_sublot_no_ptn_cd = p.beansFactory.createTableColumn("DtlGr.sublot_no_ptn_cd", MCColumnType.TEXT);
		p.columnDtlGr_ver_flg = p.beansFactory.createTableColumn("DtlGr.ver_flg", MCColumnType.CHECK);
		p.columnDtlGr_sno1_mng_typ = p.beansFactory.createTableColumn("DtlGr.sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtlGr_sno2_mng_typ = p.beansFactory.createTableColumn("DtlGr.sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtlGr_sno3_mng_typ = p.beansFactory.createTableColumn("DtlGr.sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtlGr_sno4_mng_typ = p.beansFactory.createTableColumn("DtlGr.sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtlGr_cont_fctr_flg = p.beansFactory.createTableColumn("DtlGr.cont_fctr_flg", MCColumnType.CHECK);
		p.columnDtlGr_stk_mng_typ = p.beansFactory.createTableColumn("DtlGr.stk_mng_typ", MCColumnType.TEXT);
		p.columnDtlGr_trd_unit_cd = p.beansFactory.createTableColumn("DtlGr.trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtlGr_trd_unit_nm = p.beansFactory.createTableColumn("DtlGr.trd_unit_nm", MCColumnType.TEXT);
		p.columnDtlGr_trd_unit_dec_place = p.beansFactory.createTableColumn("DtlGr.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtlGr_trd_unit_rnd_typ = p.beansFactory.createTableColumn("DtlGr.trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtlGr_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("DtlGr.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnDtlGr_trd_unit_conv_qty = p.beansFactory.createTableColumn("DtlGr.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtlGr_base_unit_cd = p.beansFactory.createTableColumn("DtlGr.base_unit_cd", MCColumnType.TEXT);
		p.columnDtlGr_base_unit_nm = p.beansFactory.createTableColumn("DtlGr.base_unit_nm", MCColumnType.TEXT);
		p.columnDtlGr_base_unit_dec_place = p.beansFactory.createTableColumn("DtlGr.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtlGr_base_unit_conv_rnd_typ = p.beansFactory.createTableColumn("DtlGr.base_unit_conv_rnd_typ", MCColumnType.TEXT);
		p.columnDtlGr_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("DtlGr.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnDtlGr_cont_fctr_dec_place = p.beansFactory.createTableColumn("DtlGr.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnDtlGr_quality_typ = p.beansFactory.createTableColumn("DtlGr.quality_typ", MCColumnType.TEXT_COMBO);
		p.columnDtlGr_quality_typ_nm = p.beansFactory.createTableColumn("DtlGr.quality_typ_nm", MCColumnType.TEXT);
		p.columnDtlGr_gd_cd = p.beansFactory.createTableColumn("DtlGr.gd_cd", MCColumnType.TEXT_COMBO);
		p.columnDtlGr_gd_nm = p.beansFactory.createTableColumn("DtlGr.gd_nm", MCColumnType.TEXT);
		p.columnDtlGr_stk_id_typ = p.beansFactory.createTableColumn("DtlGr.stk_id_typ", MCColumnType.TEXT_COMBO);
		p.columnDtlGr_stk_id_typ_nm = p.beansFactory.createTableColumn("DtlGr.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnDtlGr_fix_no_typ = p.beansFactory.createTableColumn("DtlGr.fix_no_typ", MCColumnType.TEXT_COMBO);
		p.columnDtlGr_fix_no_typ_nm = p.beansFactory.createTableColumn("DtlGr.fix_no_typ_nm", MCColumnType.TEXT);
		p.columnDtlGr_fix_no = p.beansFactory.createTableColumn("DtlGr.fix_no", MCColumnType.TEXT);
		p.columnDtlGr_intr_d_rmrks = p.beansFactory.createTableColumn("DtlGr.intr_d_rmrks", MCColumnType.TEXT);
		p.columnDtlGr_trd_d_rmrks = p.beansFactory.createTableColumn("DtlGr.trd_d_rmrks", MCColumnType.TEXT);
		p.columnDtlGr_sub_char1 = p.beansFactory.createTableColumn("DtlGr.sub_char1", MCColumnType.TEXT);
		p.columnDtlGr_sub_char2 = p.beansFactory.createTableColumn("DtlGr.sub_char2", MCColumnType.TEXT);
		p.columnDtlGr_sub_char3 = p.beansFactory.createTableColumn("DtlGr.sub_char3", MCColumnType.TEXT);
		p.columnDtlGr_stk_xfr_act_d_no = p.beansFactory.createTableColumn("DtlGr.stk_xfr_act_d_no", MCColumnType.TEXT);
		p.columnDtlGr_disp_seq = p.beansFactory.createTableColumn("DtlGr.disp_seq", MCColumnType.NUMBER);
	}

	/**
	 * [BtnGr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtnGr(MSBEP_StkXfrActReg p) {
		// ブロック関連の初期化
		p.BtnGrPanel = p.beansFactory.createPanel("BtnGr");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_StkXfrActReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP2540_gr = p.beansFactory.createButton("Btn.open_MSBEP2540_gr");
		p.Btn_open_MSBEP2540_gi = p.beansFactory.createButton("Btn.open_MSBEP2540_gi");
		p.Btn_prnt = p.beansFactory.createButton("Btn.prnt", "prnt");
		p.Btn_radd_gi = p.beansFactory.createButton("Btn.radd_gi", "no_border");
		p.Btn_rdel_gi = p.beansFactory.createButton("Btn.rdel_gi", "no_border");
		p.Btn_rcopy_gi = p.beansFactory.createButton("Btn.rcopy_gi", "no_border");
		p.Btn_top_gi = p.beansFactory.createButton("Btn.top_gi", "no_border");
		p.Btn_up_gi = p.beansFactory.createButton("Btn.up_gi", "no_border");
		p.Btn_down_gi = p.beansFactory.createButton("Btn.down_gi", "no_border");
		p.Btn_bottom_gi = p.beansFactory.createButton("Btn.bottom_gi", "no_border");
		p.Btn_radd_gr = p.beansFactory.createButton("Btn.radd_gr", "no_border");
		p.Btn_rdel_gr = p.beansFactory.createButton("Btn.rdel_gr", "no_border");
		p.Btn_rcopy_gr = p.beansFactory.createButton("Btn.rcopy_gr", "no_border");
		p.Btn_top_gr = p.beansFactory.createButton("Btn.top_gr", "no_border");
		p.Btn_up_gr = p.beansFactory.createButton("Btn.up_gr", "no_border");
		p.Btn_down_gr = p.beansFactory.createButton("Btn.down_gr", "no_border");
		p.Btn_bottom_gr = p.beansFactory.createButton("Btn.bottom_gr", "no_border");
		p.Btn_ins_itm = p.beansFactory.createButton("Btn.ins_itm", "upd");
		p.Btn_ins_lot_sno = p.beansFactory.createButton("Btn.ins_lot_sno", "upd");
		p.Btn_ins_grd = p.beansFactory.createButton("Btn.ins_grd", "upd");
		p.Btn_ins_pack = p.beansFactory.createButton("Btn.ins_pack", "upd");
		p.Btn_upd_itm = p.beansFactory.createButton("Btn.upd_itm", "upd");
		p.Btn_upd_lot_sno = p.beansFactory.createButton("Btn.upd_lot_sno", "upd");
		p.Btn_upd_grd = p.beansFactory.createButton("Btn.upd_grd", "upd");
		p.Btn_upd_pack = p.beansFactory.createButton("Btn.upd_pack", "upd");
		p.Btn_del_itm = p.beansFactory.createButton("Btn.del_itm", "del");
		p.Btn_del_lot_sno = p.beansFactory.createButton("Btn.del_lot_sno", "del");
		p.Btn_del_grd = p.beansFactory.createButton("Btn.del_grd", "del");
		p.Btn_del_pack = p.beansFactory.createButton("Btn.del_pack", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBEP_StkXfrActReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBEP_StkXfrActReg p) {
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
	protected static void jbInitCnd(MSBEP_StkXfrActReg p) {
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
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_SRCH);
		p.Cnd_ope_SRCH.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_SRCH);
		p.ScreenOpePanel.add(p.Cnd_ope_SRCH);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2520.CndR.ope_META);
		p.CndPanel.add(p.Cnd_stk_xfr_act_no_Label);
		p.CndPanel.add(p.Cnd_stk_xfr_act_no);
		p.CndPanel.setLastBeans(p.Cnd_stk_xfr_act_no);
		p.Cnd_stk_xfr_act_no.setNextBeans(p.Cnd_srch);
		p.Cnd_stk_xfr_act_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2520.CndR.stk_xfr_act_no_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBEP_StkXfrActReg p) {
		// ブロック関連の初期化
		p.add(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.GiPnlPanel);
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
	protected static void jbInitHdr(MSBEP_StkXfrActReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		p.HdrPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.Hdr_trd_cd.setListType(MCListType.STRICT);
		p.Hdr_trd_cd.setLinkBeans(p.Hdr_trd_nm,p.Hdr_trd_ptn_typ);
		p.HdrPanel.add(p.Hdr_trd_cd_Label);
		p.HdrPanel.add(p.Hdr_trd_cd);
		p.HdrPanel.setLastBeans(p.Hdr_trd_cd);
		p.Hdr_trd_cd.setNextBeans(p.Hdr_trd_nm);
		p.Hdr_trd_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.trd_cd_META);
		p.HdrPanel.add(p.Hdr_trd_nm);
		p.Hdr_trd_nm.setNextBeans(p.Hdr_trd_ptn_typ);
		p.Hdr_trd_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.trd_nm_META);
		p.HdrPanel.add(p.Hdr_trd_ptn_typ);
		p.Hdr_trd_ptn_typ.setNextBeans(p.Hdr_stk_xfr_act_no);
		p.Hdr_trd_ptn_typ.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.trd_ptn_typ_META);
		p.HdrPanel.add(p.Hdr_stk_xfr_act_no_Label);
		p.HdrPanel.add(p.Hdr_stk_xfr_act_no);
		p.Hdr_stk_xfr_act_no.setNextBeans(p.Hdr_prnt_flg);
		p.Hdr_stk_xfr_act_no.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.stk_xfr_act_no_META);
		p.HdrPanel.add(p.Hdr_prnt_flg);
		p.Hdr_prnt_flg.setNextBeans(p.Hdr_loc_cd);
		p.Hdr_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.prnt_flg_META);
		p.HdrPanel.add(p.Hdr_loc_cd_Label);
		p.HdrPanel.add(p.Hdr_loc_cd);
		p.Hdr_loc_cd.setNextBeans(p.Hdr_loc_nm);
		p.Hdr_loc_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.loc_cd_META);
		p.Hdr_loc_cd.addLinkBeans(p.Hdr_loc_nm,p.Hdr_sppl_cd,p.Hdr_wg_cd,p.Hdr_wg_nm,p.Hdr_str_ln_tgt_flg,p.Hdr_site_cd);
		p.Hdr_loc_cd.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_loc_nm);
		p.Hdr_loc_nm.setNextBeans(p.Hdr_sppl_cd);
		p.Hdr_loc_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.loc_nm_META);
		p.HdrPanel.add(p.Hdr_sppl_cd);
		p.Hdr_sppl_cd.setNextBeans(p.Hdr_site_cd);
		p.Hdr_sppl_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.sppl_cd_META);
		p.HdrPanel.add(p.Hdr_site_cd);
		p.Hdr_site_cd.setNextBeans(p.Hdr_wg_cd);
		p.Hdr_site_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.site_cd_META);
		p.HdrPanel.add(p.Hdr_wg_cd_Label);
		p.HdrPanel.add(p.Hdr_wg_cd);
		p.Hdr_wg_cd.setNextBeans(p.Hdr_wg_nm);
		p.Hdr_wg_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.wg_cd_META);
		p.Hdr_wg_cd.addLinkBeans(p.Hdr_wg_nm);
		p.HdrPanel.add(p.Hdr_wg_nm);
		p.Hdr_wg_nm.setNextBeans(p.Hdr_str_ln_tgt_flg);
		p.Hdr_wg_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.wg_nm_META);
		p.HdrPanel.add(p.Hdr_str_ln_tgt_flg);
		p.Hdr_str_ln_tgt_flg.setNextBeans(p.Hdr_ymd_hm_p_PPanel);
		p.Hdr_str_ln_tgt_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.str_ln_tgt_flg_META);
		p.HdrPanel.add(p.Hdr_ymd_hm_p_PPanel);
		p.Hdr_ymd_hm_p_PPanel.setNextBeans(p.Hdr_ac_dt_p_PPanel);
		p.HdrPanel.add(p.Hdr_ac_dt_p_PPanel);
		p.Hdr_ac_dt_p_PPanel.setNextBeans(p.Hdr_can_ac_dt_p_PPanel);
		p.HdrPanel.add(p.Hdr_can_ac_dt_p_PPanel);
		p.Hdr_can_ac_dt_p_PPanel.setNextBeans(p.Hdr_usr_dpt_p_PPanel);
		p.HdrPanel.add(p.Hdr_usr_dpt_p_PPanel);
		p.Hdr_usr_dpt_p_PPanel.setNextBeans(p.Hdr_stk_xfr_rsn_cd);
		p.Hdr_stk_xfr_rsn_cd.setListType(MCListType.STRICT);
		p.Hdr_stk_xfr_rsn_cd.setLinkBeans(p.Hdr_stk_xfr_rsn_nm);
		p.HdrPanel.add(p.Hdr_stk_xfr_rsn_cd_Label);
		p.HdrPanel.add(p.Hdr_stk_xfr_rsn_cd);
		p.Hdr_stk_xfr_rsn_cd.setNextBeans(p.Hdr_stk_xfr_rsn_nm);
		p.Hdr_stk_xfr_rsn_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.stk_xfr_rsn_cd_META);
		p.HdrPanel.add(p.Hdr_stk_xfr_rsn_nm);
		p.Hdr_stk_xfr_rsn_nm.setNextBeans(p.Hdr_intr_rmrks);
		p.Hdr_stk_xfr_rsn_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.stk_xfr_rsn_nm_META);
		p.HdrPanel.add(p.Hdr_intr_rmrks_Label);
		p.HdrPanel.add(p.Hdr_intr_rmrks);
		p.Hdr_intr_rmrks.setNextBeans(p.Hdr_trd_rmrks);
		p.Hdr_intr_rmrks.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.intr_rmrks_META);
		p.HdrPanel.add(p.Hdr_trd_rmrks_Label);
		p.HdrPanel.add(p.Hdr_trd_rmrks);
		p.Hdr_trd_rmrks.setNextBeans(p.Hdr_sub_char1);
		p.Hdr_trd_rmrks.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.trd_rmrks_META);
		p.HdrPanel.add(p.Hdr_sub_char1_Label);
		p.HdrPanel.add(p.Hdr_sub_char1);
		p.Hdr_sub_char1.setNextBeans(p.Hdr_sub_char2);
		p.Hdr_sub_char1.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.sub_char1_META);
		p.HdrPanel.add(p.Hdr_sub_char2_Label);
		p.HdrPanel.add(p.Hdr_sub_char2);
		p.Hdr_sub_char2.setNextBeans(p.Hdr_sub_char3);
		p.Hdr_sub_char2.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.sub_char2_META);
		p.HdrPanel.add(p.Hdr_sub_char3_Label);
		p.HdrPanel.add(p.Hdr_sub_char3);
		p.Hdr_sub_char3.setNextBeans(p.Hdr_upd_cntr);
		p.Hdr_sub_char3.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.sub_char3_META);
		p.HdrPanel.add(p.Hdr_upd_cntr);
		p.Hdr_upd_cntr.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.upd_cntr_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id);
		p.Hdr2Panel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.ins_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.ins_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.ins_func_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.ins_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.upd_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.upd_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.upd_func_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.upd_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_ts_Label);
		p.Hdr2Panel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_ts_Label);
		p.Hdr2Panel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no_Label);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP2520.HdrR.upd_srv_req_no_META);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr2(MSBEP_StkXfrActReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [GiPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitGiPnl(MSBEP_StkXfrActReg p) {
		// ブロック関連の初期化
		p.add(p.GiPnlPanel);
		p.GiPnlPanel.setNextBeans(p.GrPnlPanel);
		p.GiPnlPanel.setLayoutPosition("CBCTC+");
		// ブロックの項目の初期化
		p.GiPnlPanel.add(p.DtlGiPanel, null);
		p.GiPnlPanel.setLastBeans(p.DtlGiPanel);
		p.DtlGiPanel.setNextBeans(p.BtnGiPanel);
		p.GiPnlPanel.add(p.BtnGiPanel, null);
	}

	/**
	 * [DtlGi]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlGi(MSBEP_StkXfrActReg p) {
		// ブロック関連の初期化
		p.DtlGiPanel.setBorder(p.DtlGiTitledBorder);
		p.DtlGiPanel.add(p.DtlGiScrollPane);
		p.DtlGiPanel.setLastBeans(p.DtlGiTable);
		p.DtlGiScrollPane.setViewportView(p.DtlGiTable);
		p.DtlGiTable.setList(p.getDtlGiL());
		p.DtlGiPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [BtnGi]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtnGi(MSBEP_StkXfrActReg p) {
		// ブロック関連の初期化
		p.BtnGiPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
	}

	/**
	 * [GrPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitGrPnl(MSBEP_StkXfrActReg p) {
		// ブロック関連の初期化
		p.add(p.GrPnlPanel);
		p.GrPnlPanel.setNextBeans(p.BtnPanel);
		p.GrPnlPanel.setLayoutPosition("CBCBC+");
		// ブロックの項目の初期化
		p.GrPnlPanel.add(p.DtlGrPanel, null);
		p.GrPnlPanel.setLastBeans(p.DtlGrPanel);
		p.DtlGrPanel.setNextBeans(p.BtnGrPanel);
		p.GrPnlPanel.add(p.BtnGrPanel, null);
	}

	/**
	 * [DtlGr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlGr(MSBEP_StkXfrActReg p) {
		// ブロック関連の初期化
		p.DtlGrPanel.setBorder(p.DtlGrTitledBorder);
		p.DtlGrPanel.add(p.DtlGrScrollPane);
		p.DtlGrPanel.setLastBeans(p.DtlGrTable);
		p.DtlGrScrollPane.setViewportView(p.DtlGrTable);
		p.DtlGrTable.setList(p.getDtlGrL());
		p.DtlGrPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [BtnGr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtnGr(MSBEP_StkXfrActReg p) {
		// ブロック関連の初期化
		p.BtnGrPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBEP_StkXfrActReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.BtnGiPanel.add(p.Btn_open_MSBEP0500_p_PPanel);
		p.BtnGiPanel.setLastBeans(p.Btn_open_MSBEP0500_p_PPanel);
		p.Btn_open_MSBEP0500_p_PPanel.setNextBeans(p.Btn_open_MSBEP2540_gr);
		p.Btn_open_MSBEP2540_gr.setFunctionKey(MCFunctionKey.F4);
		p.BtnGiPanel.add(p.Btn_open_MSBEP2540_gr);
		p.Btn_open_MSBEP2540_gr.setNextBeans(p.Btn_radd_gi);
		p.Btn_open_MSBEP2540_gi.setFunctionKey(MCFunctionKey.F16);
		p.BtnGrPanel.setLastBeans(p.Btn_open_MSBEP2540_gi);
		p.BtnGrPanel.add(p.Btn_open_MSBEP2540_gi);
		p.Btn_open_MSBEP2540_gi.setNextBeans(p.Btn_radd_gr);
		p.Btn_prnt.setIcon("PRINT");
		p.Btn_prnt.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_prnt);
		p.BtnPanel.setLastBeans(p.Btn_prnt);
		p.Btn_prnt.setNextBeans(p.Btn_sync_p_PPanel);
		p.Btn_radd_gi.setIcon("INSERT_RECORD");
		p.Btn_radd_gi.setFunctionKey(MCFunctionKey.F5);
		p.BtnGiPanel.add(p.Btn_radd_gi);
		p.Btn_radd_gi.setNextBeans(p.Btn_rdel_gi);
		p.Btn_rdel_gi.setIcon("DELETE_RECORD");
		p.Btn_rdel_gi.setFunctionKey(MCFunctionKey.F6);
		p.BtnGiPanel.add(p.Btn_rdel_gi);
		p.Btn_rdel_gi.setNextBeans(p.Btn_rcopy_gi);
		p.Btn_rcopy_gi.setIcon("COPY_RECORD");
		p.Btn_rcopy_gi.setFunctionKey(MCFunctionKey.F7);
		p.BtnGiPanel.add(p.Btn_rcopy_gi);
		p.Btn_rcopy_gi.setNextBeans(p.Btn_top_gi);
		p.Btn_top_gi.setIcon("MOVE_TOP");
		p.BtnGiPanel.add(p.Btn_top_gi);
		p.Btn_top_gi.setNextBeans(p.Btn_up_gi);
		p.Btn_up_gi.setIcon("MOVE_UP");
		p.BtnGiPanel.add(p.Btn_up_gi);
		p.Btn_up_gi.setNextBeans(p.Btn_down_gi);
		p.Btn_down_gi.setIcon("MOVE_DOWN");
		p.BtnGiPanel.add(p.Btn_down_gi);
		p.Btn_down_gi.setNextBeans(p.Btn_bottom_gi);
		p.Btn_bottom_gi.setIcon("MOVE_BOTTOM");
		p.BtnGiPanel.add(p.Btn_bottom_gi);
		p.Btn_radd_gr.setIcon("INSERT_RECORD");
		p.Btn_radd_gr.setFunctionKey(MCFunctionKey.F17);
		p.BtnGrPanel.add(p.Btn_radd_gr);
		p.Btn_radd_gr.setNextBeans(p.Btn_rdel_gr);
		p.Btn_rdel_gr.setIcon("DELETE_RECORD");
		p.Btn_rdel_gr.setFunctionKey(MCFunctionKey.F18);
		p.BtnGrPanel.add(p.Btn_rdel_gr);
		p.Btn_rdel_gr.setNextBeans(p.Btn_rcopy_gr);
		p.Btn_rcopy_gr.setIcon("COPY_RECORD");
		p.Btn_rcopy_gr.setFunctionKey(MCFunctionKey.F19);
		p.BtnGrPanel.add(p.Btn_rcopy_gr);
		p.Btn_rcopy_gr.setNextBeans(p.Btn_top_gr);
		p.Btn_top_gr.setIcon("MOVE_TOP");
		p.BtnGrPanel.add(p.Btn_top_gr);
		p.Btn_top_gr.setNextBeans(p.Btn_up_gr);
		p.Btn_up_gr.setIcon("MOVE_UP");
		p.BtnGrPanel.add(p.Btn_up_gr);
		p.Btn_up_gr.setNextBeans(p.Btn_down_gr);
		p.Btn_down_gr.setIcon("MOVE_DOWN");
		p.BtnGrPanel.add(p.Btn_down_gr);
		p.Btn_down_gr.setNextBeans(p.Btn_bottom_gr);
		p.Btn_bottom_gr.setIcon("MOVE_BOTTOM");
		p.BtnGrPanel.add(p.Btn_bottom_gr);
		p.BtnPanel.add(p.Btn_sync_p_PPanel);
		p.Btn_sync_p_PPanel.setNextBeans(p.Btn_ins_itm);
		p.Btn_ins_itm.setIcon("REGISTER");
		p.Btn_ins_itm.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins_itm);
		p.Btn_ins_itm.setNextBeans(p.Btn_ins_lot_sno);
		p.Btn_ins_lot_sno.setIcon("REGISTER");
		p.Btn_ins_lot_sno.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins_lot_sno);
		p.Btn_ins_lot_sno.setNextBeans(p.Btn_ins_grd);
		p.Btn_ins_grd.setIcon("REGISTER");
		p.Btn_ins_grd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins_grd);
		p.Btn_ins_grd.setNextBeans(p.Btn_ins_pack);
		p.Btn_ins_pack.setIcon("REGISTER");
		p.Btn_ins_pack.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins_pack);
		p.Btn_ins_pack.setNextBeans(p.Btn_upd_itm);
		p.Btn_upd_itm.setIcon("REGISTER");
		p.Btn_upd_itm.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_itm);
		p.Btn_upd_itm.setNextBeans(p.Btn_upd_lot_sno);
		p.Btn_upd_lot_sno.setIcon("REGISTER");
		p.Btn_upd_lot_sno.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_lot_sno);
		p.Btn_upd_lot_sno.setNextBeans(p.Btn_upd_grd);
		p.Btn_upd_grd.setIcon("REGISTER");
		p.Btn_upd_grd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_grd);
		p.Btn_upd_grd.setNextBeans(p.Btn_upd_pack);
		p.Btn_upd_pack.setIcon("REGISTER");
		p.Btn_upd_pack.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_pack);
		p.Btn_del_itm.setIcon("CANCEL");
		p.Btn_del_itm.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del_itm);
		p.EastBtnPanel.add(p.Btn_del_itm);
		p.Btn_del_itm.setNextBeans(p.Btn_del_lot_sno);
		p.Btn_del_lot_sno.setIcon("CANCEL");
		p.Btn_del_lot_sno.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_del_lot_sno);
		p.Btn_del_lot_sno.setNextBeans(p.Btn_del_grd);
		p.Btn_del_grd.setIcon("CANCEL");
		p.Btn_del_grd.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_del_grd);
		p.Btn_del_grd.setNextBeans(p.Btn_del_pack);
		p.Btn_del_pack.setIcon("CANCEL");
		p.Btn_del_pack.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_del_pack);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBEP_StkXfrActReg p) {
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
		MSBEP_StkXfrActReg_MC.mcInitScreenOpe((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.mcInitCnd((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.mcInitHdrTab((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.mcInitHdr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.mcInitHdr2((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.mcInitGiPnl((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.mcInitDtlGi((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.mcInitBtnGi((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.mcInitGrPnl((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.mcInitDtlGr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.mcInitBtnGr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.mcInitBtn((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.mcInitEastBtn((MSBEP_StkXfrActReg)this);

		// [INS]ステータスのモードの設定
		MSBEP_StkXfrActReg_MC.statusInitINS_ScreenOpe((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitINS_Cnd((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitINS_HdrTab((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitINS_Hdr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitINS_Hdr2((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitINS_GiPnl((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitINS_DtlGi((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitINS_BtnGi((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitINS_GrPnl((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitINS_DtlGr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitINS_BtnGr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitINS_Btn((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitINS_EastBtn((MSBEP_StkXfrActReg)this);

		// [FIX_I]ステータスのモードの設定
		MSBEP_StkXfrActReg_MC.statusInitFIX__I_ScreenOpe((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__I_Cnd((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__I_HdrTab((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__I_Hdr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__I_Hdr2((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__I_GiPnl((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__I_DtlGi((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__I_BtnGi((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__I_GrPnl((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__I_DtlGr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__I_BtnGr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__I_Btn((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__I_EastBtn((MSBEP_StkXfrActReg)this);

		// [UPD]ステータスのモードの設定
		MSBEP_StkXfrActReg_MC.statusInitUPD_ScreenOpe((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitUPD_Cnd((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitUPD_HdrTab((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitUPD_Hdr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitUPD_Hdr2((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitUPD_GiPnl((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitUPD_DtlGi((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitUPD_BtnGi((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitUPD_GrPnl((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitUPD_DtlGr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitUPD_BtnGr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitUPD_Btn((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitUPD_EastBtn((MSBEP_StkXfrActReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBEP_StkXfrActReg_MC.statusInitFIX__U_ScreenOpe((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__U_Cnd((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__U_HdrTab((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__U_Hdr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__U_Hdr2((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__U_GiPnl((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__U_DtlGi((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__U_BtnGi((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__U_GrPnl((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__U_DtlGr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__U_BtnGr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__U_Btn((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__U_EastBtn((MSBEP_StkXfrActReg)this);

		// [DEL]ステータスのモードの設定
		MSBEP_StkXfrActReg_MC.statusInitDEL_ScreenOpe((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitDEL_Cnd((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitDEL_HdrTab((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitDEL_Hdr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitDEL_Hdr2((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitDEL_GiPnl((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitDEL_DtlGi((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitDEL_BtnGi((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitDEL_GrPnl((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitDEL_DtlGr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitDEL_BtnGr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitDEL_Btn((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitDEL_EastBtn((MSBEP_StkXfrActReg)this);

		// [FIX_D]ステータスのモードの設定
		MSBEP_StkXfrActReg_MC.statusInitFIX__D_ScreenOpe((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__D_Cnd((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__D_HdrTab((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__D_Hdr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__D_Hdr2((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__D_GiPnl((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__D_DtlGi((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__D_BtnGi((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__D_GrPnl((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__D_DtlGr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__D_BtnGr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__D_Btn((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitFIX__D_EastBtn((MSBEP_StkXfrActReg)this);

		// [SRCH]ステータスのモードの設定
		MSBEP_StkXfrActReg_MC.statusInitSRCH_ScreenOpe((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitSRCH_Cnd((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitSRCH_HdrTab((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitSRCH_Hdr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitSRCH_Hdr2((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitSRCH_GiPnl((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitSRCH_DtlGi((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitSRCH_BtnGi((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitSRCH_GrPnl((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitSRCH_DtlGr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitSRCH_BtnGr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitSRCH_Btn((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitSRCH_EastBtn((MSBEP_StkXfrActReg)this);

		// [REF]ステータスのモードの設定
		MSBEP_StkXfrActReg_MC.statusInitREF_ScreenOpe((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitREF_Cnd((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitREF_HdrTab((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitREF_Hdr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitREF_Hdr2((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitREF_GiPnl((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitREF_DtlGi((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitREF_BtnGi((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitREF_GrPnl((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitREF_DtlGr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitREF_BtnGr((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitREF_Btn((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.statusInitREF_EastBtn((MSBEP_StkXfrActReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBEP_StkXfrActReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_StkXfrActReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_SRCH.addAllListener(p);
		p.Cnd_stk_xfr_act_no.setListListener(p);
		p.Cnd_stk_xfr_act_no.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBEP_StkXfrActReg p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBEP_StkXfrActReg p) {
		p.Hdr_trd_cd.setListListener(p);
		p.Hdr_trd_cd.addAllListener(p);
		p.Hdr_trd_nm.setListListener(p);
		p.Hdr_trd_nm.addAllListener(p);
		p.Hdr_trd_ptn_typ.setListListener(p);
		p.Hdr_trd_ptn_typ.addAllListener(p);
		p.Hdr_stk_xfr_act_no.setListListener(p);
		p.Hdr_stk_xfr_act_no.addAllListener(p);
		p.Hdr_prnt_flg.addAllListener(p);
		p.Hdr_loc_cd.setListListener(p);
		p.Hdr_loc_cd.addAllListener(p);
		p.Hdr_loc_nm.setListListener(p);
		p.Hdr_loc_nm.addAllListener(p);
		p.Hdr_sppl_cd.setListListener(p);
		p.Hdr_sppl_cd.addAllListener(p);
		p.Hdr_site_cd.setListListener(p);
		p.Hdr_site_cd.addAllListener(p);
		p.Hdr_wg_cd.setListListener(p);
		p.Hdr_wg_cd.addAllListener(p);
		p.Hdr_wg_nm.setListListener(p);
		p.Hdr_wg_nm.addAllListener(p);
		p.Hdr_str_ln_tgt_flg.addAllListener(p);
		p.Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_stk_xfr_rsn_cd.setListListener(p);
		p.Hdr_stk_xfr_rsn_cd.addAllListener(p);
		p.Hdr_stk_xfr_rsn_nm.setListListener(p);
		p.Hdr_stk_xfr_rsn_nm.addAllListener(p);
		p.Hdr_intr_rmrks.setListListener(p);
		p.Hdr_intr_rmrks.addAllListener(p);
		p.Hdr_trd_rmrks.setListListener(p);
		p.Hdr_trd_rmrks.addAllListener(p);
		p.Hdr_sub_char1.setListListener(p);
		p.Hdr_sub_char1.addAllListener(p);
		p.Hdr_sub_char2.setListListener(p);
		p.Hdr_sub_char2.addAllListener(p);
		p.Hdr_sub_char3.setListListener(p);
		p.Hdr_sub_char3.addAllListener(p);
		p.Hdr_upd_cntr.setListListener(p);
		p.Hdr_upd_cntr.addAllListener(p);
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
	protected static void mcInitHdr2(MSBEP_StkXfrActReg p) {
	}

	/**
	 *  [GiPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitGiPnl(MSBEP_StkXfrActReg p) {
	}

	/**
	 *  [DtlGi]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlGi(MSBEP_StkXfrActReg p) {
		p.DtlGiTable.addAllListener(p);
		p.DtlGi_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.DtlGi_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.DtlGi_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.DtlGi_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtlGi_sundry_itm_flg.addAllListener(p);
		p.columnDtlGi_not_new_lot_flg.addAllListener(p);
		p.columnDtlGi_lot_mng_typ.addAllListener(p);
		p.columnDtlGi_lot_mng_typ.setListListener(p);
		p.columnDtlGi_lot_no_typ.addAllListener(p);
		p.columnDtlGi_lot_no_typ.setListListener(p);
		p.columnDtlGi_sublot_mng_typ.addAllListener(p);
		p.columnDtlGi_sublot_mng_typ.setListListener(p);
		p.columnDtlGi_sublot_no_typ.addAllListener(p);
		p.columnDtlGi_sublot_no_typ.setListListener(p);
		p.columnDtlGi_lot_no_ptn_cd.addAllListener(p);
		p.columnDtlGi_lot_no_ptn_cd.setListListener(p);
		p.columnDtlGi_sublot_no_ptn_cd.addAllListener(p);
		p.columnDtlGi_sublot_no_ptn_cd.setListListener(p);
		p.columnDtlGi_ver_flg.addAllListener(p);
		p.columnDtlGi_sno1_mng_typ.addAllListener(p);
		p.columnDtlGi_sno1_mng_typ.setListListener(p);
		p.columnDtlGi_sno2_mng_typ.addAllListener(p);
		p.columnDtlGi_sno2_mng_typ.setListListener(p);
		p.columnDtlGi_sno3_mng_typ.addAllListener(p);
		p.columnDtlGi_sno3_mng_typ.setListListener(p);
		p.columnDtlGi_sno4_mng_typ.addAllListener(p);
		p.columnDtlGi_sno4_mng_typ.setListListener(p);
		p.columnDtlGi_cont_fctr_flg.addAllListener(p);
		p.columnDtlGi_stk_mng_typ.addAllListener(p);
		p.columnDtlGi_stk_mng_typ.setListListener(p);
		p.DtlGi_lot_no_p_PPanel.columnLotNo_lot_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.DtlGi_lot_no_p_PPanel.columnLotNo_sublot_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtlGi_trd_unit_cd.addAllListener(p);
		p.columnDtlGi_trd_unit_cd.setListListener(p);
		p.columnDtlGi_trd_unit_nm.addAllListener(p);
		p.columnDtlGi_trd_unit_nm.setListListener(p);
		p.columnDtlGi_trd_unit_dec_place.addAllListener(p);
		p.columnDtlGi_trd_unit_dec_place.setListListener(p);
		p.columnDtlGi_trd_unit_rnd_typ.addAllListener(p);
		p.columnDtlGi_trd_unit_rnd_typ.setListListener(p);
		p.columnDtlGi_trd_unit_conv_base_qty.addAllListener(p);
		p.columnDtlGi_trd_unit_conv_base_qty.setListListener(p);
		p.columnDtlGi_trd_unit_conv_qty.addAllListener(p);
		p.columnDtlGi_trd_unit_conv_qty.setListListener(p);
		p.columnDtlGi_base_unit_cd.addAllListener(p);
		p.columnDtlGi_base_unit_cd.setListListener(p);
		p.columnDtlGi_base_unit_nm.addAllListener(p);
		p.columnDtlGi_base_unit_nm.setListListener(p);
		p.columnDtlGi_base_unit_dec_place.addAllListener(p);
		p.columnDtlGi_base_unit_dec_place.setListListener(p);
		p.columnDtlGi_base_unit_conv_rnd_typ.addAllListener(p);
		p.columnDtlGi_base_unit_conv_rnd_typ.setListListener(p);
		p.columnDtlGi_cont_fctr_rnd_typ.addAllListener(p);
		p.columnDtlGi_cont_fctr_rnd_typ.setListListener(p);
		p.columnDtlGi_cont_fctr_dec_place.addAllListener(p);
		p.columnDtlGi_cont_fctr_dec_place.setListListener(p);
		p.columnDtlGi_quality_typ.addAllListener(p);
		p.columnDtlGi_quality_typ.setListListener(p);
		p.columnDtlGi_quality_typ_nm.addAllListener(p);
		p.columnDtlGi_quality_typ_nm.setListListener(p);
		p.columnDtlGi_gd_cd.addAllListener(p);
		p.columnDtlGi_gd_cd.setListListener(p);
		p.columnDtlGi_gd_nm.addAllListener(p);
		p.columnDtlGi_gd_nm.setListListener(p);
		p.columnDtlGi_stk_id_typ.addAllListener(p);
		p.columnDtlGi_stk_id_typ.setListListener(p);
		p.columnDtlGi_stk_id_typ_nm.addAllListener(p);
		p.columnDtlGi_stk_id_typ_nm.setListListener(p);
		p.columnDtlGi_fix_no_typ.addAllListener(p);
		p.columnDtlGi_fix_no_typ.setListListener(p);
		p.columnDtlGi_fix_no_typ_nm.addAllListener(p);
		p.columnDtlGi_fix_no_typ_nm.setListListener(p);
		p.columnDtlGi_fix_no.addAllListener(p);
		p.columnDtlGi_fix_no.setListListener(p);
		p.columnDtlGi_intr_d_rmrks.addAllListener(p);
		p.columnDtlGi_intr_d_rmrks.setListListener(p);
		p.columnDtlGi_trd_d_rmrks.addAllListener(p);
		p.columnDtlGi_trd_d_rmrks.setListListener(p);
		p.columnDtlGi_sub_char1.addAllListener(p);
		p.columnDtlGi_sub_char1.setListListener(p);
		p.columnDtlGi_sub_char2.addAllListener(p);
		p.columnDtlGi_sub_char2.setListListener(p);
		p.columnDtlGi_sub_char3.addAllListener(p);
		p.columnDtlGi_sub_char3.setListListener(p);
		p.columnDtlGi_stk_xfr_act_d_no.addAllListener(p);
		p.columnDtlGi_stk_xfr_act_d_no.setListListener(p);
		p.columnDtlGi_disp_seq.addAllListener(p);
		p.columnDtlGi_disp_seq.setListListener(p);
	}

	/**
	 *  [BtnGi]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtnGi(MSBEP_StkXfrActReg p) {
	}

	/**
	 *  [GrPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitGrPnl(MSBEP_StkXfrActReg p) {
	}

	/**
	 *  [DtlGr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlGr(MSBEP_StkXfrActReg p) {
		p.DtlGrTable.addAllListener(p);
		p.DtlGr_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.DtlGr_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.DtlGr_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.DtlGr_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtlGr_sundry_itm_flg.addAllListener(p);
		p.columnDtlGr_not_new_lot_flg.addAllListener(p);
		p.columnDtlGr_lot_mng_typ.addAllListener(p);
		p.columnDtlGr_lot_mng_typ.setListListener(p);
		p.columnDtlGr_lot_no_typ.addAllListener(p);
		p.columnDtlGr_lot_no_typ.setListListener(p);
		p.columnDtlGr_sublot_mng_typ.addAllListener(p);
		p.columnDtlGr_sublot_mng_typ.setListListener(p);
		p.columnDtlGr_sublot_no_typ.addAllListener(p);
		p.columnDtlGr_sublot_no_typ.setListListener(p);
		p.columnDtlGr_lot_no_ptn_cd.addAllListener(p);
		p.columnDtlGr_lot_no_ptn_cd.setListListener(p);
		p.columnDtlGr_sublot_no_ptn_cd.addAllListener(p);
		p.columnDtlGr_sublot_no_ptn_cd.setListListener(p);
		p.columnDtlGr_ver_flg.addAllListener(p);
		p.columnDtlGr_sno1_mng_typ.addAllListener(p);
		p.columnDtlGr_sno1_mng_typ.setListListener(p);
		p.columnDtlGr_sno2_mng_typ.addAllListener(p);
		p.columnDtlGr_sno2_mng_typ.setListListener(p);
		p.columnDtlGr_sno3_mng_typ.addAllListener(p);
		p.columnDtlGr_sno3_mng_typ.setListListener(p);
		p.columnDtlGr_sno4_mng_typ.addAllListener(p);
		p.columnDtlGr_sno4_mng_typ.setListListener(p);
		p.columnDtlGr_cont_fctr_flg.addAllListener(p);
		p.columnDtlGr_stk_mng_typ.addAllListener(p);
		p.columnDtlGr_stk_mng_typ.setListListener(p);
		p.DtlGr_lot_no_p_PPanel.columnLotNo_lot_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.DtlGr_lot_no_p_PPanel.columnLotNo_sublot_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtlGr_trd_unit_cd.addAllListener(p);
		p.columnDtlGr_trd_unit_cd.setListListener(p);
		p.columnDtlGr_trd_unit_nm.addAllListener(p);
		p.columnDtlGr_trd_unit_nm.setListListener(p);
		p.columnDtlGr_trd_unit_dec_place.addAllListener(p);
		p.columnDtlGr_trd_unit_dec_place.setListListener(p);
		p.columnDtlGr_trd_unit_rnd_typ.addAllListener(p);
		p.columnDtlGr_trd_unit_rnd_typ.setListListener(p);
		p.columnDtlGr_trd_unit_conv_base_qty.addAllListener(p);
		p.columnDtlGr_trd_unit_conv_base_qty.setListListener(p);
		p.columnDtlGr_trd_unit_conv_qty.addAllListener(p);
		p.columnDtlGr_trd_unit_conv_qty.setListListener(p);
		p.columnDtlGr_base_unit_cd.addAllListener(p);
		p.columnDtlGr_base_unit_cd.setListListener(p);
		p.columnDtlGr_base_unit_nm.addAllListener(p);
		p.columnDtlGr_base_unit_nm.setListListener(p);
		p.columnDtlGr_base_unit_dec_place.addAllListener(p);
		p.columnDtlGr_base_unit_dec_place.setListListener(p);
		p.columnDtlGr_base_unit_conv_rnd_typ.addAllListener(p);
		p.columnDtlGr_base_unit_conv_rnd_typ.setListListener(p);
		p.columnDtlGr_cont_fctr_rnd_typ.addAllListener(p);
		p.columnDtlGr_cont_fctr_rnd_typ.setListListener(p);
		p.columnDtlGr_cont_fctr_dec_place.addAllListener(p);
		p.columnDtlGr_cont_fctr_dec_place.setListListener(p);
		p.columnDtlGr_quality_typ.addAllListener(p);
		p.columnDtlGr_quality_typ.setListListener(p);
		p.columnDtlGr_quality_typ_nm.addAllListener(p);
		p.columnDtlGr_quality_typ_nm.setListListener(p);
		p.columnDtlGr_gd_cd.addAllListener(p);
		p.columnDtlGr_gd_cd.setListListener(p);
		p.columnDtlGr_gd_nm.addAllListener(p);
		p.columnDtlGr_gd_nm.setListListener(p);
		p.columnDtlGr_stk_id_typ.addAllListener(p);
		p.columnDtlGr_stk_id_typ.setListListener(p);
		p.columnDtlGr_stk_id_typ_nm.addAllListener(p);
		p.columnDtlGr_stk_id_typ_nm.setListListener(p);
		p.columnDtlGr_fix_no_typ.addAllListener(p);
		p.columnDtlGr_fix_no_typ.setListListener(p);
		p.columnDtlGr_fix_no_typ_nm.addAllListener(p);
		p.columnDtlGr_fix_no_typ_nm.setListListener(p);
		p.columnDtlGr_fix_no.addAllListener(p);
		p.columnDtlGr_fix_no.setListListener(p);
		p.columnDtlGr_intr_d_rmrks.addAllListener(p);
		p.columnDtlGr_intr_d_rmrks.setListListener(p);
		p.columnDtlGr_trd_d_rmrks.addAllListener(p);
		p.columnDtlGr_trd_d_rmrks.setListListener(p);
		p.columnDtlGr_sub_char1.addAllListener(p);
		p.columnDtlGr_sub_char1.setListListener(p);
		p.columnDtlGr_sub_char2.addAllListener(p);
		p.columnDtlGr_sub_char2.setListListener(p);
		p.columnDtlGr_sub_char3.addAllListener(p);
		p.columnDtlGr_sub_char3.setListListener(p);
		p.columnDtlGr_stk_xfr_act_d_no.addAllListener(p);
		p.columnDtlGr_stk_xfr_act_d_no.setListListener(p);
		p.columnDtlGr_disp_seq.addAllListener(p);
		p.columnDtlGr_disp_seq.setListListener(p);
	}

	/**
	 *  [BtnGr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtnGr(MSBEP_StkXfrActReg p) {
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_StkXfrActReg p) {
		p.Btn_open_MSBEP2540_gr.addAllListener(p);
		p.Btn_open_MSBEP2540_gr.setAPMethodName("doBtn_open_MSBEP2540_gr");
		p.Btn_open_MSBEP2540_gi.addAllListener(p);
		p.Btn_open_MSBEP2540_gi.setAPMethodName("doBtn_open_MSBEP2540_gi");
		p.Btn_prnt.addAllListener(p);
		p.Btn_prnt.setAPMethodName("doBtn_prnt");
		p.Btn_radd_gi.addAllListener(p);
		p.Btn_radd_gi.setAPMethodName("doBtn_radd_gi");
		p.Btn_rdel_gi.addAllListener(p);
		p.Btn_rdel_gi.setAPMethodName("doBtn_rdel_gi");
		p.Btn_rcopy_gi.addAllListener(p);
		p.Btn_rcopy_gi.setAPMethodName("doBtn_rcopy_gi");
		p.Btn_top_gi.addAllListener(p);
		p.Btn_top_gi.setAPMethodName("doBtn_top_gi");
		p.Btn_up_gi.addAllListener(p);
		p.Btn_up_gi.setAPMethodName("doBtn_up_gi");
		p.Btn_down_gi.addAllListener(p);
		p.Btn_down_gi.setAPMethodName("doBtn_down_gi");
		p.Btn_bottom_gi.addAllListener(p);
		p.Btn_bottom_gi.setAPMethodName("doBtn_bottom_gi");
		p.Btn_radd_gr.addAllListener(p);
		p.Btn_radd_gr.setAPMethodName("doBtn_radd_gr");
		p.Btn_rdel_gr.addAllListener(p);
		p.Btn_rdel_gr.setAPMethodName("doBtn_rdel_gr");
		p.Btn_rcopy_gr.addAllListener(p);
		p.Btn_rcopy_gr.setAPMethodName("doBtn_rcopy_gr");
		p.Btn_top_gr.addAllListener(p);
		p.Btn_top_gr.setAPMethodName("doBtn_top_gr");
		p.Btn_up_gr.addAllListener(p);
		p.Btn_up_gr.setAPMethodName("doBtn_up_gr");
		p.Btn_down_gr.addAllListener(p);
		p.Btn_down_gr.setAPMethodName("doBtn_down_gr");
		p.Btn_bottom_gr.addAllListener(p);
		p.Btn_bottom_gr.setAPMethodName("doBtn_bottom_gr");
		p.Btn_ins_itm.addAllListener(p);
		p.Btn_ins_itm.setAPMethodName("doBtn_ins_itm");
		p.Btn_ins_lot_sno.addAllListener(p);
		p.Btn_ins_lot_sno.setAPMethodName("doBtn_ins_lot_sno");
		p.Btn_ins_grd.addAllListener(p);
		p.Btn_ins_grd.setAPMethodName("doBtn_ins_grd");
		p.Btn_ins_pack.addAllListener(p);
		p.Btn_ins_pack.setAPMethodName("doBtn_ins_pack");
		p.Btn_upd_itm.addAllListener(p);
		p.Btn_upd_itm.setAPMethodName("doBtn_upd_itm");
		p.Btn_upd_lot_sno.addAllListener(p);
		p.Btn_upd_lot_sno.setAPMethodName("doBtn_upd_lot_sno");
		p.Btn_upd_grd.addAllListener(p);
		p.Btn_upd_grd.setAPMethodName("doBtn_upd_grd");
		p.Btn_upd_pack.addAllListener(p);
		p.Btn_upd_pack.setAPMethodName("doBtn_upd_pack");
		p.Btn_del_itm.addAllListener(p);
		p.Btn_del_itm.setAPMethodName("doBtn_del_itm");
		p.Btn_del_lot_sno.addAllListener(p);
		p.Btn_del_lot_sno.setAPMethodName("doBtn_del_lot_sno");
		p.Btn_del_grd.addAllListener(p);
		p.Btn_del_grd.setAPMethodName("doBtn_del_grd");
		p.Btn_del_pack.addAllListener(p);
		p.Btn_del_pack.setAPMethodName("doBtn_del_pack");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBEP_StkXfrActReg p) {
	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBEP_StkXfrActReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBEP_StkXfrActReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_stk_xfr_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_HdrTab(MSBEP_StkXfrActReg p){

	}

	/**
	 * [INS]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr(MSBEP_StkXfrActReg p){
		p.Hdr_trd_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_trd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_stk_xfr_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_prnt_flg.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_loc_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_site_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_str_ln_tgt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ymd_hm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.REQUIRED);
		p.Hdr_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_stk_xfr_rsn_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_stk_xfr_rsn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_trd_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);
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
	protected static void statusInitINS_Hdr2(MSBEP_StkXfrActReg p){

	}

	/**
	 * [INS]ステータスの[GiPnl]ブロックのモードの設定
	 */
	protected static void statusInitINS_GiPnl(MSBEP_StkXfrActReg p){

	}

	/**
	 * [INS]ステータスの[DtlGi]ブロックのモードの設定
	 */
	protected static void statusInitINS_DtlGi(MSBEP_StkXfrActReg p){
		p.DtlGi_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtlGi_sundry_itm_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGi_not_new_lot_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGi_lot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGi_lot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGi_sublot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGi_sublot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGi_lot_no_ptn_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGi_sublot_no_ptn_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGi_ver_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGi_sno1_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGi_sno2_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGi_sno3_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGi_sno4_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGi_cont_fctr_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGi_stk_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.DtlGi_lot_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.REQUIRED);
		p.DtlGi_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.DtlGi_ver_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtlGi_trd_unit_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtlGi_trd_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.DtlGi_trd_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtlGi_trd_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGi_trd_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGi_trd_unit_conv_base_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGi_trd_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGi_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlGi_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.DtlGi_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlGi_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlGi_base_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGi_base_unit_conv_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.DtlGi_std_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGi_act_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGi_std_cont_fctr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.DtlGi_act_cont_fctr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.DtlGi_cont_fctr_unit_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtlGi_cont_fctr_rnd_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlGi_cont_fctr_dec_place.putMode(p, INS, MCMode.READ_ONLY);
		p.DtlGi_str_ln_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.DtlGi_str_ln_p_PPanel.columnStrLn_str_ln_cd.putMode(p, INS, MCMode.REQUIRED);
		p.DtlGi_str_ln_p_PPanel.columnStrLn_str_ln_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.DtlGi_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, INS, MCMode.ENABLE);
		p.columnDtlGi_quality_typ.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtlGi_quality_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlGi_gd_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtlGi_gd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.DtlGi_sno_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.columnDtlGi_stk_id_typ.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtlGi_stk_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.DtlGi_stk_bp_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.REQUIRED);
		p.columnDtlGi_fix_no_typ.putMode(p, INS, MCMode.ENABLE);
		p.columnDtlGi_fix_no_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlGi_fix_no.putMode(p, INS, MCMode.ENABLE);
		p.DtlGi_stk_arrv_bp_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5060.MSUBP_StkArrvBp_D.ENABLE);
		p.columnDtlGi_intr_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtlGi_trd_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtlGi_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtlGi_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtlGi_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtlGi_stk_xfr_act_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlGi_disp_seq.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[BtnGi]ブロックのモードの設定
	 */
	protected static void statusInitINS_BtnGi(MSBEP_StkXfrActReg p){

	}

	/**
	 * [INS]ステータスの[GrPnl]ブロックのモードの設定
	 */
	protected static void statusInitINS_GrPnl(MSBEP_StkXfrActReg p){

	}

	/**
	 * [INS]ステータスの[DtlGr]ブロックのモードの設定
	 */
	protected static void statusInitINS_DtlGr(MSBEP_StkXfrActReg p){
		p.DtlGr_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtlGr_sundry_itm_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGr_not_new_lot_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGr_lot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGr_lot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGr_sublot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGr_sublot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGr_lot_no_ptn_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGr_sublot_no_ptn_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGr_ver_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGr_sno1_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGr_sno2_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGr_sno3_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGr_sno4_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGr_cont_fctr_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGr_stk_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.DtlGr_lot_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.REQUIRED);
		p.DtlGr_ver_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtlGr_trd_unit_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtlGr_trd_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.DtlGr_trd_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtlGr_trd_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGr_trd_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGr_trd_unit_conv_base_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGr_trd_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGr_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlGr_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.DtlGr_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlGr_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlGr_base_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGr_base_unit_conv_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.DtlGr_std_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGr_act_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGr_std_cont_fctr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.DtlGr_act_cont_fctr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.DtlGr_cont_fctr_unit_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtlGr_cont_fctr_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtlGr_cont_fctr_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.DtlGr_str_ln_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtlGr_quality_typ.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtlGr_quality_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlGr_gd_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtlGr_gd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.DtlGr_sno_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.columnDtlGr_stk_id_typ.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtlGr_stk_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.DtlGr_stk_bp_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.REQUIRED);
		p.columnDtlGr_fix_no_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlGr_fix_no_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlGr_fix_no.putMode(p, INS, MCMode.READ_ONLY);
		p.DtlGr_stk_arrv_bp_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5060.MSUBP_StkArrvBp_D.ENABLE);
		p.columnDtlGr_intr_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtlGr_trd_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtlGr_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtlGr_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtlGr_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtlGr_stk_xfr_act_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtlGr_disp_seq.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[BtnGr]ブロックのモードの設定
	 */
	protected static void statusInitINS_BtnGr(MSBEP_StkXfrActReg p){

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBEP_StkXfrActReg p){
		p.Btn_open_MSBEP0500_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.ENABLE);
		p.Btn_open_MSBEP2540_gr.putMode(p, INS, MCMode.ENABLE);
		p.Btn_open_MSBEP2540_gi.putMode(p, INS, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, INS, MCMode.DISABLE);
		p.Btn_radd_gi.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rdel_gi.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rcopy_gi.putMode(p, INS, MCMode.ENABLE);
		p.Btn_top_gi.putMode(p, INS, MCMode.ENABLE);
		p.Btn_up_gi.putMode(p, INS, MCMode.ENABLE);
		p.Btn_down_gi.putMode(p, INS, MCMode.ENABLE);
		p.Btn_bottom_gi.putMode(p, INS, MCMode.ENABLE);
		p.Btn_radd_gr.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rdel_gr.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rcopy_gr.putMode(p, INS, MCMode.ENABLE);
		p.Btn_top_gr.putMode(p, INS, MCMode.ENABLE);
		p.Btn_up_gr.putMode(p, INS, MCMode.ENABLE);
		p.Btn_down_gr.putMode(p, INS, MCMode.ENABLE);
		p.Btn_bottom_gr.putMode(p, INS, MCMode.ENABLE);
		p.Btn_sync_p_PPanel.putStatus(INS, mcframe.clientFSBA.FSBAP0020.FSBAP0020.INIT);
		p.Btn_ins_itm.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_ins_lot_sno.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_ins_grd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_ins_pack.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_upd_itm.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_upd_lot_sno.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_upd_grd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_upd_pack.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_del_itm.putMode(p, INS, MCMode.DISABLE);
		p.Btn_del_lot_sno.putMode(p, INS, MCMode.DISABLE);
		p.Btn_del_grd.putMode(p, INS, MCMode.DISABLE);
		p.Btn_del_pack.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBEP_StkXfrActReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBEP_StkXfrActReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBEP_StkXfrActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_stk_xfr_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_HdrTab(MSBEP_StkXfrActReg p){

	}

	/**
	 * [FIX_I]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr(MSBEP_StkXfrActReg p){
		p.Hdr_trd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_stk_xfr_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_site_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_str_ln_tgt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ymd_hm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_stk_xfr_rsn_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_stk_xfr_rsn_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, FIX_I, MCMode.INVISIBLE);
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
	protected static void statusInitFIX__I_Hdr2(MSBEP_StkXfrActReg p){

	}

	/**
	 * [FIX_I]ステータスの[GiPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_GiPnl(MSBEP_StkXfrActReg p){

	}

	/**
	 * [FIX_I]ステータスの[DtlGi]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_DtlGi(MSBEP_StkXfrActReg p){
		p.DtlGi_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtlGi_sundry_itm_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGi_not_new_lot_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGi_lot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGi_lot_no_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGi_sublot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGi_sublot_no_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGi_lot_no_ptn_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGi_sublot_no_ptn_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGi_ver_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGi_sno1_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGi_sno2_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGi_sno3_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGi_sno4_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGi_cont_fctr_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGi_stk_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.DtlGi_lot_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.DtlGi_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.DtlGi_ver_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtlGi_trd_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGi_trd_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.DtlGi_trd_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlGi_trd_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGi_trd_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGi_trd_unit_conv_base_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGi_trd_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGi_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGi_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.DtlGi_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlGi_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGi_base_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGi_base_unit_conv_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.DtlGi_std_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGi_act_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGi_std_cont_fctr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.DtlGi_act_cont_fctr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.DtlGi_cont_fctr_unit_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtlGi_cont_fctr_rnd_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGi_cont_fctr_dec_place.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.DtlGi_str_ln_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtlGi_quality_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGi_quality_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGi_gd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGi_gd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.DtlGi_sno_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtlGi_stk_id_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGi_stk_id_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.DtlGi_stk_bp_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtlGi_fix_no_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGi_fix_no_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGi_fix_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.DtlGi_stk_arrv_bp_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5060.MSUBP_StkArrvBp_D.READ_ONLY);
		p.columnDtlGi_intr_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGi_trd_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGi_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGi_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGi_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGi_stk_xfr_act_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGi_disp_seq.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[BtnGi]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_BtnGi(MSBEP_StkXfrActReg p){

	}

	/**
	 * [FIX_I]ステータスの[GrPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_GrPnl(MSBEP_StkXfrActReg p){

	}

	/**
	 * [FIX_I]ステータスの[DtlGr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_DtlGr(MSBEP_StkXfrActReg p){
		p.DtlGr_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtlGr_sundry_itm_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGr_not_new_lot_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGr_lot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGr_lot_no_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGr_sublot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGr_sublot_no_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGr_lot_no_ptn_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGr_sublot_no_ptn_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGr_ver_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGr_sno1_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGr_sno2_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGr_sno3_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGr_sno4_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGr_cont_fctr_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGr_stk_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.DtlGr_lot_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.DtlGr_ver_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtlGr_trd_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGr_trd_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.DtlGr_trd_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlGr_trd_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGr_trd_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGr_trd_unit_conv_base_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGr_trd_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGr_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGr_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.DtlGr_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlGr_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGr_base_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGr_base_unit_conv_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.DtlGr_std_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGr_act_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGr_std_cont_fctr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.DtlGr_act_cont_fctr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.DtlGr_cont_fctr_unit_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtlGr_cont_fctr_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtlGr_cont_fctr_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.DtlGr_str_ln_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtlGr_quality_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGr_quality_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGr_gd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGr_gd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.DtlGr_sno_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtlGr_stk_id_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGr_stk_id_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.DtlGr_stk_bp_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtlGr_fix_no_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGr_fix_no_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGr_fix_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.DtlGr_stk_arrv_bp_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5060.MSUBP_StkArrvBp_D.READ_ONLY);
		p.columnDtlGr_intr_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGr_trd_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGr_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGr_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGr_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGr_stk_xfr_act_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtlGr_disp_seq.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[BtnGr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_BtnGr(MSBEP_StkXfrActReg p){

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBEP_StkXfrActReg p){
		p.Btn_open_MSBEP0500_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_open_MSBEP2540_gr.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_open_MSBEP2540_gi.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_radd_gi.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rdel_gi.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rcopy_gi.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_top_gi.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_up_gi.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_down_gi.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_bottom_gi.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_radd_gr.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rdel_gr.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rcopy_gr.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_top_gr.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_up_gr.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_down_gr.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_bottom_gr.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_sync_p_PPanel.putStatus(FIX_I, mcframe.clientFSBA.FSBAP0020.FSBAP0020.INIT);
		p.Btn_ins_itm.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_ins_lot_sno.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_ins_grd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_ins_pack.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd_itm.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd_lot_sno.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd_grd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd_pack.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_del_itm.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_del_lot_sno.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_del_grd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_del_pack.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MSBEP_StkXfrActReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBEP_StkXfrActReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBEP_StkXfrActReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_stk_xfr_act_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrTab(MSBEP_StkXfrActReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MSBEP_StkXfrActReg p){
		p.Hdr_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_stk_xfr_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_prnt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_site_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ymd_hm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.REQUIRED);
		p.Hdr_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_stk_xfr_rsn_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_stk_xfr_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_trd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
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
	protected static void statusInitUPD_Hdr2(MSBEP_StkXfrActReg p){

	}

	/**
	 * [UPD]ステータスの[GiPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_GiPnl(MSBEP_StkXfrActReg p){

	}

	/**
	 * [UPD]ステータスの[DtlGi]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlGi(MSBEP_StkXfrActReg p){
		p.DtlGi_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtlGi_sundry_itm_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGi_not_new_lot_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGi_lot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGi_lot_no_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGi_sublot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGi_sublot_no_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGi_lot_no_ptn_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGi_sublot_no_ptn_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGi_ver_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGi_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGi_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGi_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGi_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGi_cont_fctr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGi_stk_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.DtlGi_lot_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.REQUIRED);
		p.DtlGi_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.DtlGi_ver_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtlGi_trd_unit_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlGi_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.DtlGi_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtlGi_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGi_trd_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGi_trd_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGi_trd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGi_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlGi_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.DtlGi_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlGi_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlGi_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGi_base_unit_conv_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.DtlGi_std_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGi_act_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGi_std_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.DtlGi_act_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.DtlGi_cont_fctr_unit_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtlGi_cont_fctr_rnd_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlGi_cont_fctr_dec_place.putMode(p, UPD, MCMode.READ_ONLY);
		p.DtlGi_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.DtlGi_str_ln_p_PPanel.columnStrLn_str_ln_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.DtlGi_str_ln_p_PPanel.columnStrLn_str_ln_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.DtlGi_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlGi_quality_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlGi_quality_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlGi_gd_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlGi_gd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.DtlGi_sno_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.columnDtlGi_stk_id_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlGi_stk_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.DtlGi_stk_bp_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.REQUIRED);
		p.columnDtlGi_fix_no_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlGi_fix_no_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlGi_fix_no.putMode(p, UPD, MCMode.ENABLE);
		p.DtlGi_stk_arrv_bp_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5060.MSUBP_StkArrvBp_D.ENABLE);
		p.columnDtlGi_intr_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlGi_trd_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlGi_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlGi_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlGi_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlGi_stk_xfr_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlGi_disp_seq.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[BtnGi]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BtnGi(MSBEP_StkXfrActReg p){

	}

	/**
	 * [UPD]ステータスの[GrPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_GrPnl(MSBEP_StkXfrActReg p){

	}

	/**
	 * [UPD]ステータスの[DtlGr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlGr(MSBEP_StkXfrActReg p){
		p.DtlGr_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtlGr_sundry_itm_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGr_not_new_lot_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGr_lot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGr_lot_no_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGr_sublot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGr_sublot_no_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGr_lot_no_ptn_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGr_sublot_no_ptn_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGr_ver_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGr_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGr_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGr_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGr_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGr_cont_fctr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGr_stk_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.DtlGr_lot_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.REQUIRED);
		p.DtlGr_ver_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtlGr_trd_unit_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlGr_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.DtlGr_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtlGr_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGr_trd_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGr_trd_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGr_trd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGr_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlGr_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.DtlGr_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlGr_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlGr_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGr_base_unit_conv_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.DtlGr_std_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGr_act_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGr_std_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.DtlGr_act_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.DtlGr_cont_fctr_unit_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtlGr_cont_fctr_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlGr_cont_fctr_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.DtlGr_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtlGr_quality_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlGr_quality_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlGr_gd_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlGr_gd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.DtlGr_sno_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.columnDtlGr_stk_id_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlGr_stk_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.DtlGr_stk_bp_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.REQUIRED);
		p.columnDtlGr_fix_no_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlGr_fix_no_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlGr_fix_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.DtlGr_stk_arrv_bp_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5060.MSUBP_StkArrvBp_D.ENABLE);
		p.columnDtlGr_intr_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlGr_trd_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlGr_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlGr_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlGr_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlGr_stk_xfr_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlGr_disp_seq.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[BtnGr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BtnGr(MSBEP_StkXfrActReg p){

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBEP_StkXfrActReg p){
		p.Btn_open_MSBEP0500_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.ENABLE);
		p.Btn_open_MSBEP2540_gr.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MSBEP2540_gi.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_radd_gi.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel_gi.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy_gi.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_top_gi.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_up_gi.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_down_gi.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_bottom_gi.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd_gr.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel_gr.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy_gr.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_top_gr.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_up_gr.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_down_gr.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_bottom_gr.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_sync_p_PPanel.putStatus(UPD, mcframe.clientFSBA.FSBAP0020.FSBAP0020.INIT);
		p.Btn_ins_itm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_ins_lot_sno.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_ins_grd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_ins_pack.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd_itm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd_lot_sno.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd_grd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd_pack.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_del_itm.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_del_lot_sno.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_del_grd.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_del_pack.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBEP_StkXfrActReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBEP_StkXfrActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBEP_StkXfrActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_stk_xfr_act_no.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrTab(MSBEP_StkXfrActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MSBEP_StkXfrActReg p){
		p.Hdr_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_stk_xfr_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_site_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_str_ln_tgt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ymd_hm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_stk_xfr_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_stk_xfr_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
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
	protected static void statusInitFIX__U_Hdr2(MSBEP_StkXfrActReg p){

	}

	/**
	 * [FIX_U]ステータスの[GiPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_GiPnl(MSBEP_StkXfrActReg p){

	}

	/**
	 * [FIX_U]ステータスの[DtlGi]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DtlGi(MSBEP_StkXfrActReg p){
		p.DtlGi_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtlGi_sundry_itm_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGi_not_new_lot_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGi_lot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGi_lot_no_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGi_sublot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGi_sublot_no_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGi_lot_no_ptn_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGi_sublot_no_ptn_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGi_ver_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGi_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGi_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGi_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGi_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGi_cont_fctr_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGi_stk_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.DtlGi_lot_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.DtlGi_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DtlGi_ver_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtlGi_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGi_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DtlGi_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlGi_trd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGi_trd_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGi_trd_unit_conv_base_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGi_trd_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGi_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGi_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DtlGi_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlGi_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGi_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGi_base_unit_conv_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.DtlGi_std_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGi_act_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGi_std_cont_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.DtlGi_act_cont_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.DtlGi_cont_fctr_unit_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtlGi_cont_fctr_rnd_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGi_cont_fctr_dec_place.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DtlGi_str_ln_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtlGi_quality_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGi_quality_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGi_gd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGi_gd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DtlGi_sno_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtlGi_stk_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGi_stk_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DtlGi_stk_bp_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtlGi_fix_no_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGi_fix_no_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGi_fix_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DtlGi_stk_arrv_bp_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5060.MSUBP_StkArrvBp_D.READ_ONLY);
		p.columnDtlGi_intr_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGi_trd_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGi_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGi_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGi_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGi_stk_xfr_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGi_disp_seq.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[BtnGi]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_BtnGi(MSBEP_StkXfrActReg p){

	}

	/**
	 * [FIX_U]ステータスの[GrPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_GrPnl(MSBEP_StkXfrActReg p){

	}

	/**
	 * [FIX_U]ステータスの[DtlGr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DtlGr(MSBEP_StkXfrActReg p){
		p.DtlGr_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtlGr_sundry_itm_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGr_not_new_lot_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGr_lot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGr_lot_no_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGr_sublot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGr_sublot_no_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGr_lot_no_ptn_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGr_sublot_no_ptn_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGr_ver_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGr_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGr_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGr_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGr_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGr_cont_fctr_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGr_stk_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.DtlGr_lot_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.DtlGr_ver_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtlGr_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGr_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DtlGr_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlGr_trd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGr_trd_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGr_trd_unit_conv_base_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGr_trd_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGr_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGr_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DtlGr_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlGr_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGr_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGr_base_unit_conv_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.DtlGr_std_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGr_act_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGr_std_cont_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.DtlGr_act_cont_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.DtlGr_cont_fctr_unit_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtlGr_cont_fctr_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtlGr_cont_fctr_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.DtlGr_str_ln_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtlGr_quality_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGr_quality_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGr_gd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGr_gd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DtlGr_sno_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtlGr_stk_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGr_stk_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DtlGr_stk_bp_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtlGr_fix_no_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGr_fix_no_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGr_fix_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.DtlGr_stk_arrv_bp_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5060.MSUBP_StkArrvBp_D.READ_ONLY);
		p.columnDtlGr_intr_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGr_trd_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGr_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGr_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGr_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGr_stk_xfr_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtlGr_disp_seq.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[BtnGr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_BtnGr(MSBEP_StkXfrActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBEP_StkXfrActReg p){
		p.Btn_open_MSBEP0500_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_open_MSBEP2540_gr.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_open_MSBEP2540_gi.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_radd_gi.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel_gi.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy_gi.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_top_gi.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_up_gi.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_down_gi.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_bottom_gi.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_radd_gr.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel_gr.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy_gr.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_top_gr.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_up_gr.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_down_gr.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_bottom_gr.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_sync_p_PPanel.putStatus(FIX_U, mcframe.clientFSBA.FSBAP0020.FSBAP0020.INIT);
		p.Btn_ins_itm.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_ins_lot_sno.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_ins_grd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_ins_pack.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd_itm.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd_lot_sno.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd_grd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd_pack.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del_itm.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del_lot_sno.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del_grd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del_pack.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBEP_StkXfrActReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBEP_StkXfrActReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBEP_StkXfrActReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_stk_xfr_act_no.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HdrTab(MSBEP_StkXfrActReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MSBEP_StkXfrActReg p){
		p.Hdr_trd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_stk_xfr_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_prnt_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Hdr_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_site_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_str_ln_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ymd_hm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_stk_xfr_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_stk_xfr_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
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
	protected static void statusInitDEL_Hdr2(MSBEP_StkXfrActReg p){

	}

	/**
	 * [DEL]ステータスの[GiPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_GiPnl(MSBEP_StkXfrActReg p){

	}

	/**
	 * [DEL]ステータスの[DtlGi]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlGi(MSBEP_StkXfrActReg p){
		p.DtlGi_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtlGi_sundry_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGi_not_new_lot_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGi_lot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGi_lot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGi_sublot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGi_sublot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGi_lot_no_ptn_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGi_sublot_no_ptn_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGi_ver_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGi_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGi_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGi_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGi_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGi_cont_fctr_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGi_stk_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.DtlGi_lot_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.DtlGi_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlGi_ver_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtlGi_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGi_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlGi_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlGi_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGi_trd_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGi_trd_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGi_trd_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGi_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGi_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlGi_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlGi_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGi_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGi_base_unit_conv_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.DtlGi_std_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGi_act_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGi_std_cont_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.DtlGi_act_cont_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.DtlGi_cont_fctr_unit_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtlGi_cont_fctr_rnd_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGi_cont_fctr_dec_place.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlGi_str_ln_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtlGi_quality_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGi_quality_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGi_gd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGi_gd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlGi_sno_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtlGi_stk_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGi_stk_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlGi_stk_bp_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtlGi_fix_no_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGi_fix_no_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGi_fix_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlGi_stk_arrv_bp_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5060.MSUBP_StkArrvBp_D.READ_ONLY);
		p.columnDtlGi_intr_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGi_trd_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGi_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGi_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGi_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGi_stk_xfr_act_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGi_disp_seq.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[BtnGi]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BtnGi(MSBEP_StkXfrActReg p){

	}

	/**
	 * [DEL]ステータスの[GrPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_GrPnl(MSBEP_StkXfrActReg p){

	}

	/**
	 * [DEL]ステータスの[DtlGr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlGr(MSBEP_StkXfrActReg p){
		p.DtlGr_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtlGr_sundry_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGr_not_new_lot_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGr_lot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGr_lot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGr_sublot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGr_sublot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGr_lot_no_ptn_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGr_sublot_no_ptn_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGr_ver_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGr_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGr_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGr_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGr_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGr_cont_fctr_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGr_stk_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.DtlGr_lot_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.DtlGr_ver_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtlGr_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGr_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlGr_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlGr_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGr_trd_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGr_trd_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGr_trd_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGr_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGr_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlGr_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlGr_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGr_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGr_base_unit_conv_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.DtlGr_std_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGr_act_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGr_std_cont_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.DtlGr_act_cont_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.DtlGr_cont_fctr_unit_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtlGr_cont_fctr_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlGr_cont_fctr_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.DtlGr_str_ln_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtlGr_quality_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGr_quality_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGr_gd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGr_gd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlGr_sno_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtlGr_stk_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGr_stk_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlGr_stk_bp_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtlGr_fix_no_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGr_fix_no_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGr_fix_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlGr_stk_arrv_bp_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5060.MSUBP_StkArrvBp_D.READ_ONLY);
		p.columnDtlGr_intr_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGr_trd_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGr_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGr_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGr_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGr_stk_xfr_act_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlGr_disp_seq.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[BtnGr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BtnGr(MSBEP_StkXfrActReg p){

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBEP_StkXfrActReg p){
		p.Btn_open_MSBEP0500_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_open_MSBEP2540_gr.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_open_MSBEP2540_gi.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_radd_gi.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel_gi.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy_gi.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_top_gi.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_up_gi.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_down_gi.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_bottom_gi.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_radd_gr.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel_gr.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy_gr.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_top_gr.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_up_gr.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_down_gr.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_bottom_gr.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_sync_p_PPanel.putStatus(DEL, mcframe.clientFSBA.FSBAP0020.FSBAP0020.INIT);
		p.Btn_ins_itm.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_ins_lot_sno.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_ins_grd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_ins_pack.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd_itm.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd_lot_sno.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd_grd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd_pack.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del_itm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_del_lot_sno.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_del_grd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_del_pack.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBEP_StkXfrActReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MSBEP_StkXfrActReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBEP_StkXfrActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_stk_xfr_act_no.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_HdrTab(MSBEP_StkXfrActReg p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MSBEP_StkXfrActReg p){
		p.Hdr_trd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_stk_xfr_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_site_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_str_ln_tgt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ymd_hm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_stk_xfr_rsn_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_stk_xfr_rsn_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);
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
	protected static void statusInitFIX__D_Hdr2(MSBEP_StkXfrActReg p){

	}

	/**
	 * [FIX_D]ステータスの[GiPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_GiPnl(MSBEP_StkXfrActReg p){

	}

	/**
	 * [FIX_D]ステータスの[DtlGi]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_DtlGi(MSBEP_StkXfrActReg p){
		p.DtlGi_itm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtlGi_sundry_itm_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGi_not_new_lot_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGi_lot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGi_lot_no_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGi_sublot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGi_sublot_no_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGi_lot_no_ptn_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGi_sublot_no_ptn_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGi_ver_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGi_sno1_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGi_sno2_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGi_sno3_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGi_sno4_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGi_cont_fctr_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGi_stk_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.DtlGi_lot_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.DtlGi_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.DtlGi_ver_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtlGi_trd_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGi_trd_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.DtlGi_trd_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlGi_trd_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGi_trd_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGi_trd_unit_conv_base_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGi_trd_unit_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGi_base_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGi_base_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.DtlGi_base_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlGi_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGi_base_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGi_base_unit_conv_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.DtlGi_std_cont_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGi_act_cont_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGi_std_cont_fctr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.DtlGi_act_cont_fctr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.DtlGi_cont_fctr_unit_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtlGi_cont_fctr_rnd_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGi_cont_fctr_dec_place.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.DtlGi_str_ln_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtlGi_quality_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGi_quality_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGi_gd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGi_gd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.DtlGi_sno_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtlGi_stk_id_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGi_stk_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.DtlGi_stk_bp_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtlGi_fix_no_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGi_fix_no_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGi_fix_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.DtlGi_stk_arrv_bp_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5060.MSUBP_StkArrvBp_D.READ_ONLY);
		p.columnDtlGi_intr_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGi_trd_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGi_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGi_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGi_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGi_stk_xfr_act_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGi_disp_seq.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[BtnGi]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_BtnGi(MSBEP_StkXfrActReg p){

	}

	/**
	 * [FIX_D]ステータスの[GrPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_GrPnl(MSBEP_StkXfrActReg p){

	}

	/**
	 * [FIX_D]ステータスの[DtlGr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_DtlGr(MSBEP_StkXfrActReg p){
		p.DtlGr_itm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtlGr_sundry_itm_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGr_not_new_lot_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGr_lot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGr_lot_no_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGr_sublot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGr_sublot_no_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGr_lot_no_ptn_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGr_sublot_no_ptn_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGr_ver_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGr_sno1_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGr_sno2_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGr_sno3_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGr_sno4_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGr_cont_fctr_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGr_stk_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.DtlGr_lot_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.DtlGr_ver_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtlGr_trd_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGr_trd_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.DtlGr_trd_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlGr_trd_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGr_trd_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGr_trd_unit_conv_base_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGr_trd_unit_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGr_base_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGr_base_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.DtlGr_base_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlGr_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGr_base_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGr_base_unit_conv_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.DtlGr_std_cont_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGr_act_cont_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGr_std_cont_fctr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.DtlGr_act_cont_fctr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.DtlGr_cont_fctr_unit_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtlGr_cont_fctr_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtlGr_cont_fctr_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.DtlGr_str_ln_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtlGr_quality_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGr_quality_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGr_gd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGr_gd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.DtlGr_sno_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtlGr_stk_id_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGr_stk_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.DtlGr_stk_bp_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtlGr_fix_no_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGr_fix_no_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGr_fix_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.DtlGr_stk_arrv_bp_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5060.MSUBP_StkArrvBp_D.READ_ONLY);
		p.columnDtlGr_intr_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGr_trd_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGr_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGr_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGr_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGr_stk_xfr_act_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtlGr_disp_seq.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[BtnGr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_BtnGr(MSBEP_StkXfrActReg p){

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBEP_StkXfrActReg p){
		p.Btn_open_MSBEP0500_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_open_MSBEP2540_gr.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_open_MSBEP2540_gi.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_radd_gi.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rdel_gi.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rcopy_gi.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_top_gi.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_up_gi.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_down_gi.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_bottom_gi.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_radd_gr.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rdel_gr.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rcopy_gr.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_top_gr.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_up_gr.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_down_gr.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_bottom_gr.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_sync_p_PPanel.putStatus(FIX_D, mcframe.clientFSBA.FSBAP0020.FSBAP0020.INIT);
		p.Btn_ins_itm.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_ins_lot_sno.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_ins_grd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_ins_pack.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_upd_itm.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_upd_lot_sno.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_upd_grd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_upd_pack.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del_itm.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del_lot_sno.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del_grd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del_pack.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBEP_StkXfrActReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBEP_StkXfrActReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBEP_StkXfrActReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_stk_xfr_act_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBEP_StkXfrActReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBEP_StkXfrActReg p){
		p.Hdr_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_stk_xfr_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_site_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ymd_hm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_stk_xfr_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_stk_xfr_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
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
	protected static void statusInitSRCH_Hdr2(MSBEP_StkXfrActReg p){

	}

	/**
	 * [SRCH]ステータスの[GiPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_GiPnl(MSBEP_StkXfrActReg p){

	}

	/**
	 * [SRCH]ステータスの[DtlGi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlGi(MSBEP_StkXfrActReg p){
		p.DtlGi_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtlGi_sundry_itm_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGi_not_new_lot_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGi_lot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGi_lot_no_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGi_sublot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGi_sublot_no_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGi_lot_no_ptn_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGi_sublot_no_ptn_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGi_ver_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGi_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGi_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGi_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGi_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGi_cont_fctr_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGi_stk_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.DtlGi_lot_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.DtlGi_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlGi_ver_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtlGi_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGi_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlGi_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlGi_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGi_trd_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGi_trd_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGi_trd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGi_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGi_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlGi_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlGi_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGi_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGi_base_unit_conv_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.DtlGi_std_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGi_act_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGi_std_cont_fctr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.DtlGi_act_cont_fctr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.DtlGi_cont_fctr_unit_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtlGi_cont_fctr_rnd_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGi_cont_fctr_dec_place.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlGi_str_ln_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtlGi_quality_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGi_quality_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGi_gd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGi_gd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlGi_sno_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtlGi_stk_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGi_stk_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlGi_stk_bp_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtlGi_fix_no_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGi_fix_no_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGi_fix_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlGi_stk_arrv_bp_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5060.MSUBP_StkArrvBp_D.READ_ONLY);
		p.columnDtlGi_intr_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGi_trd_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGi_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGi_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGi_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGi_stk_xfr_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGi_disp_seq.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[BtnGi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BtnGi(MSBEP_StkXfrActReg p){

	}

	/**
	 * [SRCH]ステータスの[GrPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_GrPnl(MSBEP_StkXfrActReg p){

	}

	/**
	 * [SRCH]ステータスの[DtlGr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlGr(MSBEP_StkXfrActReg p){
		p.DtlGr_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtlGr_sundry_itm_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGr_not_new_lot_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGr_lot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGr_lot_no_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGr_sublot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGr_sublot_no_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGr_lot_no_ptn_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGr_sublot_no_ptn_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGr_ver_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGr_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGr_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGr_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGr_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGr_cont_fctr_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGr_stk_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.DtlGr_lot_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.DtlGr_ver_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtlGr_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGr_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlGr_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlGr_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGr_trd_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGr_trd_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGr_trd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGr_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGr_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlGr_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlGr_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGr_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGr_base_unit_conv_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.DtlGr_std_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGr_act_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGr_std_cont_fctr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.DtlGr_act_cont_fctr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.DtlGr_cont_fctr_unit_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtlGr_cont_fctr_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtlGr_cont_fctr_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.DtlGr_str_ln_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtlGr_quality_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGr_quality_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGr_gd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGr_gd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlGr_sno_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtlGr_stk_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGr_stk_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlGr_stk_bp_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtlGr_fix_no_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGr_fix_no_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGr_fix_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.DtlGr_stk_arrv_bp_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5060.MSUBP_StkArrvBp_D.READ_ONLY);
		p.columnDtlGr_intr_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGr_trd_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGr_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGr_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGr_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGr_stk_xfr_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtlGr_disp_seq.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[BtnGr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BtnGr(MSBEP_StkXfrActReg p){

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBEP_StkXfrActReg p){
		p.Btn_open_MSBEP0500_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_open_MSBEP2540_gr.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBEP2540_gi.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_radd_gi.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel_gi.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rcopy_gi.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_top_gi.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_up_gi.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_down_gi.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_bottom_gi.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_radd_gr.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel_gr.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rcopy_gr.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_top_gr.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_up_gr.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_down_gr.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_bottom_gr.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_sync_p_PPanel.putStatus(SRCH, mcframe.clientFSBA.FSBAP0020.FSBAP0020.INIT);
		p.Btn_ins_itm.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_ins_lot_sno.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_ins_grd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_ins_pack.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_itm.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_lot_sno.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_grd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_pack.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del_itm.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del_lot_sno.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del_grd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del_pack.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBEP_StkXfrActReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBEP_StkXfrActReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBEP_StkXfrActReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_stk_xfr_act_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBEP_StkXfrActReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBEP_StkXfrActReg p){
		p.Hdr_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_stk_xfr_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_site_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ymd_hm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_stk_xfr_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_stk_xfr_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
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
	protected static void statusInitREF_Hdr2(MSBEP_StkXfrActReg p){

	}

	/**
	 * [REF]ステータスの[GiPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_GiPnl(MSBEP_StkXfrActReg p){

	}

	/**
	 * [REF]ステータスの[DtlGi]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlGi(MSBEP_StkXfrActReg p){
		p.DtlGi_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtlGi_sundry_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGi_not_new_lot_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGi_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGi_lot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGi_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGi_sublot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGi_lot_no_ptn_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGi_sublot_no_ptn_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGi_ver_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGi_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGi_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGi_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGi_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGi_cont_fctr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGi_stk_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.DtlGi_lot_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.DtlGi_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlGi_ver_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtlGi_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGi_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlGi_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlGi_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGi_trd_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGi_trd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGi_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGi_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlGi_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlGi_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGi_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGi_base_unit_conv_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.DtlGi_std_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGi_act_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGi_std_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.DtlGi_act_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.DtlGi_cont_fctr_unit_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtlGi_cont_fctr_rnd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGi_cont_fctr_dec_place.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlGi_str_ln_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtlGi_quality_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGi_quality_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGi_gd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGi_gd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlGi_sno_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtlGi_stk_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGi_stk_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlGi_stk_bp_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtlGi_fix_no_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGi_fix_no_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGi_fix_no.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlGi_stk_arrv_bp_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5060.MSUBP_StkArrvBp_D.READ_ONLY);
		p.columnDtlGi_intr_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGi_trd_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGi_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGi_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGi_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGi_stk_xfr_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGi_disp_seq.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[BtnGi]ブロックのモードの設定
	 */
	protected static void statusInitREF_BtnGi(MSBEP_StkXfrActReg p){

	}

	/**
	 * [REF]ステータスの[GrPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_GrPnl(MSBEP_StkXfrActReg p){

	}

	/**
	 * [REF]ステータスの[DtlGr]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlGr(MSBEP_StkXfrActReg p){
		p.DtlGr_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtlGr_sundry_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGr_not_new_lot_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGr_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGr_lot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGr_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGr_sublot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGr_lot_no_ptn_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGr_sublot_no_ptn_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGr_ver_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGr_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGr_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGr_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGr_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGr_cont_fctr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGr_stk_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.DtlGr_lot_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.DtlGr_ver_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtlGr_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGr_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlGr_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlGr_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGr_trd_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGr_trd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGr_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGr_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlGr_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.DtlGr_base_unit_qty_p_PPanel.columnQty_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGr_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGr_base_unit_conv_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.DtlGr_std_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGr_act_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.DtlGr_std_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.DtlGr_act_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.DtlGr_cont_fctr_unit_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtlGr_cont_fctr_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlGr_cont_fctr_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.DtlGr_str_ln_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtlGr_quality_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGr_quality_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGr_gd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGr_gd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlGr_sno_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtlGr_stk_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGr_stk_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlGr_stk_bp_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtlGr_fix_no_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGr_fix_no_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGr_fix_no.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlGr_stk_arrv_bp_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5060.MSUBP_StkArrvBp_D.READ_ONLY);
		p.columnDtlGr_intr_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGr_trd_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGr_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGr_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGr_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGr_stk_xfr_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlGr_disp_seq.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[BtnGr]ブロックのモードの設定
	 */
	protected static void statusInitREF_BtnGr(MSBEP_StkXfrActReg p){

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBEP_StkXfrActReg p){
		p.Btn_open_MSBEP0500_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_open_MSBEP2540_gr.putMode(p, REF, MCMode.DISABLE);
		p.Btn_open_MSBEP2540_gi.putMode(p, REF, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, REF, MCMode.ENABLE);
		p.Btn_radd_gi.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel_gi.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy_gi.putMode(p, REF, MCMode.DISABLE);
		p.Btn_top_gi.putMode(p, REF, MCMode.DISABLE);
		p.Btn_up_gi.putMode(p, REF, MCMode.DISABLE);
		p.Btn_down_gi.putMode(p, REF, MCMode.DISABLE);
		p.Btn_bottom_gi.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd_gr.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel_gr.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy_gr.putMode(p, REF, MCMode.DISABLE);
		p.Btn_top_gr.putMode(p, REF, MCMode.DISABLE);
		p.Btn_up_gr.putMode(p, REF, MCMode.DISABLE);
		p.Btn_down_gr.putMode(p, REF, MCMode.DISABLE);
		p.Btn_bottom_gr.putMode(p, REF, MCMode.DISABLE);
		p.Btn_sync_p_PPanel.putStatus(REF, mcframe.clientFSBA.FSBAP0020.FSBAP0020.INIT);
		p.Btn_ins_itm.putMode(p, REF, MCMode.DISABLE);
		p.Btn_ins_lot_sno.putMode(p, REF, MCMode.DISABLE);
		p.Btn_ins_grd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_ins_pack.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_itm.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_lot_sno.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_grd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_pack.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del_itm.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del_lot_sno.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del_grd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del_pack.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBEP_StkXfrActReg p){

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
		MSBEP_StkXfrActReg_MC.setTableConfigDtlGi((MSBEP_StkXfrActReg)this);
		MSBEP_StkXfrActReg_MC.setTableConfigDtlGr((MSBEP_StkXfrActReg)this);
	}

	/**
	 * [DtlGi]ブロックのTableの設定
	 */
	protected static void setTableConfigDtlGi(MSBEP_StkXfrActReg p) {
		p.DtlGiTable.addTable(p.DtlGi_itm_p_PPanel.ItmTable);
		p.DtlGi_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtlGi_itm_nm, p.columnDtlGi_itm_sub1, p.columnDtlGi_itm_sub2, p.columnDtlGi_itm_sub3, p.columnDtlGi_lot_mng_typ, p.columnDtlGi_lot_no_typ, p.columnDtlGi_sublot_mng_typ, p.columnDtlGi_sublot_no_typ, p.columnDtlGi_sno1_mng_typ, p.columnDtlGi_sno2_mng_typ, p.columnDtlGi_sno3_mng_typ, p.columnDtlGi_sno4_mng_typ, p.columnDtlGi_cont_fctr_flg, p.columnDtlGi_stk_mng_typ, p.columnDtlGi_base_unit_cd, p.columnDtlGi_base_unit_nm, p.columnDtlGi_base_unit_dec_place, p.columnDtlGi_base_unit_conv_rnd_typ, p.columnDtlGi_not_new_lot_flg, p.columnDtlGi_ver_flg, p.columnDtlGi_lot_no_ptn_cd, p.columnDtlGi_sublot_no_ptn_cd, p.columnDtlGi_sundry_itm_flg);
		p.DtlGi_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtlGi_itm_nm, p.columnDtlGi_itm_sub2, p.columnDtlGi_itm_sub3, p.columnDtlGi_lot_mng_typ, p.columnDtlGi_lot_no_typ, p.columnDtlGi_sublot_mng_typ, p.columnDtlGi_sublot_no_typ, p.columnDtlGi_sno1_mng_typ, p.columnDtlGi_sno2_mng_typ, p.columnDtlGi_sno3_mng_typ, p.columnDtlGi_sno4_mng_typ, p.columnDtlGi_cont_fctr_flg, p.columnDtlGi_stk_mng_typ, p.columnDtlGi_base_unit_cd, p.columnDtlGi_base_unit_nm, p.columnDtlGi_base_unit_dec_place, p.columnDtlGi_base_unit_conv_rnd_typ, p.columnDtlGi_not_new_lot_flg, p.columnDtlGi_ver_flg, p.columnDtlGi_lot_no_ptn_cd, p.columnDtlGi_sublot_no_ptn_cd, p.columnDtlGi_sundry_itm_flg);
		p.DtlGi_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtlGi_itm_nm, p.columnDtlGi_itm_sub3, p.columnDtlGi_lot_mng_typ, p.columnDtlGi_lot_no_typ, p.columnDtlGi_sublot_mng_typ, p.columnDtlGi_sublot_no_typ, p.columnDtlGi_sno1_mng_typ, p.columnDtlGi_sno2_mng_typ, p.columnDtlGi_sno3_mng_typ, p.columnDtlGi_sno4_mng_typ, p.columnDtlGi_cont_fctr_flg, p.columnDtlGi_stk_mng_typ, p.columnDtlGi_base_unit_cd, p.columnDtlGi_base_unit_nm, p.columnDtlGi_base_unit_dec_place, p.columnDtlGi_base_unit_conv_rnd_typ, p.columnDtlGi_not_new_lot_flg, p.columnDtlGi_ver_flg, p.columnDtlGi_lot_no_ptn_cd, p.columnDtlGi_sublot_no_ptn_cd, p.columnDtlGi_sundry_itm_flg);
		p.DtlGi_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtlGi_itm_nm, p.columnDtlGi_lot_mng_typ, p.columnDtlGi_lot_no_typ, p.columnDtlGi_sublot_mng_typ, p.columnDtlGi_sublot_no_typ, p.columnDtlGi_sno1_mng_typ, p.columnDtlGi_sno2_mng_typ, p.columnDtlGi_sno3_mng_typ, p.columnDtlGi_sno4_mng_typ, p.columnDtlGi_cont_fctr_flg, p.columnDtlGi_stk_mng_typ, p.columnDtlGi_base_unit_cd, p.columnDtlGi_base_unit_nm, p.columnDtlGi_base_unit_dec_place, p.columnDtlGi_base_unit_conv_rnd_typ, p.columnDtlGi_not_new_lot_flg, p.columnDtlGi_ver_flg, p.columnDtlGi_lot_no_ptn_cd, p.columnDtlGi_sublot_no_ptn_cd, p.columnDtlGi_sundry_itm_flg);
		p.columnDtlGi_sundry_itm_flg.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.sundry_itm_flg_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_sundry_itm_flg);
		p.columnDtlGi_not_new_lot_flg.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.not_new_lot_flg_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_not_new_lot_flg);
		p.columnDtlGi_lot_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.lot_mng_typ_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_lot_mng_typ);
		p.columnDtlGi_lot_no_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.lot_no_typ_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_lot_no_typ);
		p.columnDtlGi_sublot_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.sublot_mng_typ_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_sublot_mng_typ);
		p.columnDtlGi_sublot_no_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.sublot_no_typ_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_sublot_no_typ);
		p.columnDtlGi_lot_no_ptn_cd.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.lot_no_ptn_cd_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_lot_no_ptn_cd);
		p.columnDtlGi_sublot_no_ptn_cd.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.sublot_no_ptn_cd_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_sublot_no_ptn_cd);
		p.columnDtlGi_ver_flg.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.ver_flg_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_ver_flg);
		p.columnDtlGi_sno1_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.sno1_mng_typ_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_sno1_mng_typ);
		p.columnDtlGi_sno2_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.sno2_mng_typ_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_sno2_mng_typ);
		p.columnDtlGi_sno3_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.sno3_mng_typ_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_sno3_mng_typ);
		p.columnDtlGi_sno4_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.sno4_mng_typ_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_sno4_mng_typ);
		p.columnDtlGi_cont_fctr_flg.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.cont_fctr_flg_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_cont_fctr_flg);
		p.columnDtlGi_stk_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.stk_mng_typ_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_stk_mng_typ);
		p.DtlGiTable.addTable(p.DtlGi_lot_no_p_PPanel.LotNoTable);
		p.DtlGi_lot_no_p_PPanel.columnLotNo_lot_no.setLinkBeans(p.columnDtlGi_sublot_no, p.columnDtlGi_ver_no);
		p.DtlGi_lot_no_p_PPanel.columnLotNo_sublot_no.setLinkBeans(p.columnDtlGi_ver_no);
		p.DtlGiTable.addTable(p.DtlGi_ver_p_PPanel.VerNoTable);
		p.columnDtlGi_trd_unit_cd.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.trd_unit_cd_META);
		p.columnDtlGi_trd_unit_cd.addLinkBeans(p.columnDtlGi_trd_unit_nm,p.columnDtlGi_trd_unit_conv_base_qty,p.columnDtlGi_trd_unit_conv_qty,p.columnDtlGi_trd_unit_dec_place,p.columnDtlGi_trd_unit_rnd_typ);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_trd_unit_cd);
		p.columnDtlGi_trd_unit_nm.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.trd_unit_nm_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_trd_unit_nm);
		p.DtlGiTable.addTable(p.DtlGi_trd_unit_qty_p_PPanel.QtyTable);
		p.columnDtlGi_trd_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.trd_unit_dec_place_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_trd_unit_dec_place);
		p.columnDtlGi_trd_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.trd_unit_rnd_typ_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_trd_unit_rnd_typ);
		p.columnDtlGi_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.trd_unit_conv_base_qty_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_trd_unit_conv_base_qty);
		p.columnDtlGi_trd_unit_conv_qty.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.trd_unit_conv_qty_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_trd_unit_conv_qty);
		p.columnDtlGi_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.base_unit_cd_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_base_unit_cd);
		p.columnDtlGi_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.base_unit_nm_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_base_unit_nm);
		p.DtlGiTable.addTable(p.DtlGi_base_unit_qty_p_PPanel.QtyTable);
		p.columnDtlGi_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.base_unit_dec_place_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_base_unit_dec_place);
		p.columnDtlGi_base_unit_conv_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.base_unit_conv_rnd_typ_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_base_unit_conv_rnd_typ);
		p.DtlGiTable.addTable(p.DtlGi_std_cont_qty_p_PPanel.ContQtyTable);
		p.DtlGiTable.addTable(p.DtlGi_act_cont_qty_p_PPanel.ContQtyTable);
		p.DtlGiTable.addTable(p.DtlGi_std_cont_fctr_p_PPanel.StdContFctrTable);
		p.DtlGiTable.addTable(p.DtlGi_act_cont_fctr_p_PPanel.ActContFctrTable);
		p.DtlGiTable.addTable(p.DtlGi_cont_fctr_unit_p_PPanel.ContFctrUnitTable);
		p.columnDtlGi_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.cont_fctr_rnd_typ_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_cont_fctr_rnd_typ);
		p.columnDtlGi_cont_fctr_dec_place.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.cont_fctr_dec_place_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_cont_fctr_dec_place);
		p.DtlGiTable.addTable(p.DtlGi_str_ln_p_PPanel.StrLnTable);
		p.columnDtlGi_quality_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.quality_typ_META);
		p.columnDtlGi_quality_typ.addLinkBeans(p.columnDtlGi_quality_typ_nm);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_quality_typ);
		p.columnDtlGi_quality_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.quality_typ_nm_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_quality_typ_nm);
		p.columnDtlGi_gd_cd.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.gd_cd_META);
		p.columnDtlGi_gd_cd.addLinkBeans(p.columnDtlGi_gd_nm);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_gd_cd);
		p.columnDtlGi_gd_nm.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.gd_nm_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_gd_nm);
		p.DtlGiTable.addTable(p.DtlGi_sno_p_PPanel.SnoWrkNoTable);
		p.columnDtlGi_stk_id_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.stk_id_typ_META);
		p.columnDtlGi_stk_id_typ.addLinkBeans(p.columnDtlGi_stk_id_typ_nm);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_stk_id_typ);
		p.columnDtlGi_stk_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.stk_id_typ_nm_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_stk_id_typ_nm);
		p.DtlGiTable.addTable(p.DtlGi_stk_bp_p_PPanel.StkBpTable);
		p.columnDtlGi_fix_no_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.fix_no_typ_META);
		p.columnDtlGi_fix_no_typ.addLinkBeans(p.columnDtlGi_fix_no_typ_nm);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_fix_no_typ);
		p.columnDtlGi_fix_no_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.fix_no_typ_nm_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_fix_no_typ_nm);
		p.columnDtlGi_fix_no.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.fix_no_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_fix_no);
		p.DtlGiTable.addTable(p.DtlGi_stk_arrv_bp_p_PPanel.StkArrvBpTable);
		p.columnDtlGi_intr_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.intr_d_rmrks_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_intr_d_rmrks);
		p.columnDtlGi_trd_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.trd_d_rmrks_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_trd_d_rmrks);
		p.columnDtlGi_sub_char1.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.sub_char1_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_sub_char1);
		p.columnDtlGi_sub_char2.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.sub_char2_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_sub_char2);
		p.columnDtlGi_sub_char3.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.sub_char3_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_sub_char3);
		p.columnDtlGi_stk_xfr_act_d_no.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.stk_xfr_act_d_no_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_stk_xfr_act_d_no);
		p.columnDtlGi_disp_seq.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.disp_seq_META);
		p.DtlGiTable.addColumnConfig(p.columnDtlGi_disp_seq);
	}

	/**
	 * [DtlGr]ブロックのTableの設定
	 */
	protected static void setTableConfigDtlGr(MSBEP_StkXfrActReg p) {
		p.DtlGrTable.addTable(p.DtlGr_itm_p_PPanel.ItmTable);
		p.DtlGr_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtlGr_itm_nm, p.columnDtlGr_itm_sub1, p.columnDtlGr_itm_sub2, p.columnDtlGr_itm_sub3, p.columnDtlGr_lot_mng_typ, p.columnDtlGr_lot_no_typ, p.columnDtlGr_sublot_mng_typ, p.columnDtlGr_sublot_no_typ, p.columnDtlGr_sno1_mng_typ, p.columnDtlGr_sno2_mng_typ, p.columnDtlGr_sno3_mng_typ, p.columnDtlGr_sno4_mng_typ, p.columnDtlGr_cont_fctr_flg, p.columnDtlGr_stk_mng_typ, p.columnDtlGr_base_unit_cd, p.columnDtlGr_base_unit_nm, p.columnDtlGr_base_unit_dec_place, p.columnDtlGr_base_unit_conv_rnd_typ, p.columnDtlGr_not_new_lot_flg, p.columnDtlGr_ver_flg, p.columnDtlGr_lot_no_ptn_cd, p.columnDtlGr_sublot_no_ptn_cd, p.columnDtlGr_sundry_itm_flg);
		p.DtlGr_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtlGr_itm_nm, p.columnDtlGr_itm_sub2, p.columnDtlGr_itm_sub3, p.columnDtlGr_lot_mng_typ, p.columnDtlGr_lot_no_typ, p.columnDtlGr_sublot_mng_typ, p.columnDtlGr_sublot_no_typ, p.columnDtlGr_sno1_mng_typ, p.columnDtlGr_sno2_mng_typ, p.columnDtlGr_sno3_mng_typ, p.columnDtlGr_sno4_mng_typ, p.columnDtlGr_cont_fctr_flg, p.columnDtlGr_stk_mng_typ, p.columnDtlGr_base_unit_cd, p.columnDtlGr_base_unit_nm, p.columnDtlGr_base_unit_dec_place, p.columnDtlGr_base_unit_conv_rnd_typ, p.columnDtlGr_not_new_lot_flg, p.columnDtlGr_ver_flg, p.columnDtlGr_lot_no_ptn_cd, p.columnDtlGr_sublot_no_ptn_cd, p.columnDtlGr_sundry_itm_flg);
		p.DtlGr_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtlGr_itm_nm, p.columnDtlGr_itm_sub3, p.columnDtlGr_lot_mng_typ, p.columnDtlGr_lot_no_typ, p.columnDtlGr_sublot_mng_typ, p.columnDtlGr_sublot_no_typ, p.columnDtlGr_sno1_mng_typ, p.columnDtlGr_sno2_mng_typ, p.columnDtlGr_sno3_mng_typ, p.columnDtlGr_sno4_mng_typ, p.columnDtlGr_cont_fctr_flg, p.columnDtlGr_stk_mng_typ, p.columnDtlGr_base_unit_cd, p.columnDtlGr_base_unit_nm, p.columnDtlGr_base_unit_dec_place, p.columnDtlGr_base_unit_conv_rnd_typ, p.columnDtlGr_not_new_lot_flg, p.columnDtlGr_ver_flg, p.columnDtlGr_lot_no_ptn_cd, p.columnDtlGr_sublot_no_ptn_cd, p.columnDtlGr_sundry_itm_flg);
		p.DtlGr_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtlGr_itm_nm, p.columnDtlGr_lot_mng_typ, p.columnDtlGr_lot_no_typ, p.columnDtlGr_sublot_mng_typ, p.columnDtlGr_sublot_no_typ, p.columnDtlGr_sno1_mng_typ, p.columnDtlGr_sno2_mng_typ, p.columnDtlGr_sno3_mng_typ, p.columnDtlGr_sno4_mng_typ, p.columnDtlGr_cont_fctr_flg, p.columnDtlGr_stk_mng_typ, p.columnDtlGr_base_unit_cd, p.columnDtlGr_base_unit_nm, p.columnDtlGr_base_unit_dec_place, p.columnDtlGr_base_unit_conv_rnd_typ, p.columnDtlGr_not_new_lot_flg, p.columnDtlGr_ver_flg, p.columnDtlGr_lot_no_ptn_cd, p.columnDtlGr_sublot_no_ptn_cd, p.columnDtlGr_sundry_itm_flg);
		p.columnDtlGr_sundry_itm_flg.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.sundry_itm_flg_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_sundry_itm_flg);
		p.columnDtlGr_not_new_lot_flg.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.not_new_lot_flg_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_not_new_lot_flg);
		p.columnDtlGr_lot_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.lot_mng_typ_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_lot_mng_typ);
		p.columnDtlGr_lot_no_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.lot_no_typ_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_lot_no_typ);
		p.columnDtlGr_sublot_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.sublot_mng_typ_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_sublot_mng_typ);
		p.columnDtlGr_sublot_no_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.sublot_no_typ_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_sublot_no_typ);
		p.columnDtlGr_lot_no_ptn_cd.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.lot_no_ptn_cd_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_lot_no_ptn_cd);
		p.columnDtlGr_sublot_no_ptn_cd.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.sublot_no_ptn_cd_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_sublot_no_ptn_cd);
		p.columnDtlGr_ver_flg.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.ver_flg_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_ver_flg);
		p.columnDtlGr_sno1_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.sno1_mng_typ_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_sno1_mng_typ);
		p.columnDtlGr_sno2_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.sno2_mng_typ_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_sno2_mng_typ);
		p.columnDtlGr_sno3_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.sno3_mng_typ_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_sno3_mng_typ);
		p.columnDtlGr_sno4_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.sno4_mng_typ_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_sno4_mng_typ);
		p.columnDtlGr_cont_fctr_flg.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.cont_fctr_flg_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_cont_fctr_flg);
		p.columnDtlGr_stk_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.stk_mng_typ_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_stk_mng_typ);
		p.DtlGrTable.addTable(p.DtlGr_lot_no_p_PPanel.LotNoTable);
		p.DtlGr_lot_no_p_PPanel.columnLotNo_lot_no.setLinkBeans(p.columnDtlGr_sublot_no, p.columnDtlGr_ver_no);
		p.DtlGr_lot_no_p_PPanel.columnLotNo_sublot_no.setLinkBeans(p.columnDtlGr_ver_no);
		p.DtlGrTable.addTable(p.DtlGr_ver_p_PPanel.VerNoTable);
		p.columnDtlGr_trd_unit_cd.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.trd_unit_cd_META);
		p.columnDtlGr_trd_unit_cd.addLinkBeans(p.columnDtlGr_trd_unit_nm,p.columnDtlGr_trd_unit_conv_base_qty,p.columnDtlGr_trd_unit_conv_qty,p.columnDtlGr_trd_unit_dec_place,p.columnDtlGr_trd_unit_rnd_typ);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_trd_unit_cd);
		p.columnDtlGr_trd_unit_nm.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.trd_unit_nm_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_trd_unit_nm);
		p.DtlGrTable.addTable(p.DtlGr_trd_unit_qty_p_PPanel.QtyTable);
		p.columnDtlGr_trd_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.trd_unit_dec_place_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_trd_unit_dec_place);
		p.columnDtlGr_trd_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.trd_unit_rnd_typ_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_trd_unit_rnd_typ);
		p.columnDtlGr_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.trd_unit_conv_base_qty_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_trd_unit_conv_base_qty);
		p.columnDtlGr_trd_unit_conv_qty.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.trd_unit_conv_qty_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_trd_unit_conv_qty);
		p.columnDtlGr_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.base_unit_cd_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_base_unit_cd);
		p.columnDtlGr_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.base_unit_nm_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_base_unit_nm);
		p.DtlGrTable.addTable(p.DtlGr_base_unit_qty_p_PPanel.QtyTable);
		p.columnDtlGr_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.base_unit_dec_place_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_base_unit_dec_place);
		p.columnDtlGr_base_unit_conv_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.base_unit_conv_rnd_typ_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_base_unit_conv_rnd_typ);
		p.DtlGrTable.addTable(p.DtlGr_std_cont_qty_p_PPanel.ContQtyTable);
		p.DtlGrTable.addTable(p.DtlGr_act_cont_qty_p_PPanel.ContQtyTable);
		p.DtlGrTable.addTable(p.DtlGr_std_cont_fctr_p_PPanel.StdContFctrTable);
		p.DtlGrTable.addTable(p.DtlGr_act_cont_fctr_p_PPanel.ActContFctrTable);
		p.DtlGrTable.addTable(p.DtlGr_cont_fctr_unit_p_PPanel.ContFctrUnitTable);
		p.columnDtlGr_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.cont_fctr_rnd_typ_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_cont_fctr_rnd_typ);
		p.columnDtlGr_cont_fctr_dec_place.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.cont_fctr_dec_place_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_cont_fctr_dec_place);
		p.DtlGrTable.addTable(p.DtlGr_str_ln_p_PPanel.StrLnTable);
		p.columnDtlGr_quality_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.quality_typ_META);
		p.columnDtlGr_quality_typ.addLinkBeans(p.columnDtlGr_quality_typ_nm);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_quality_typ);
		p.columnDtlGr_quality_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.quality_typ_nm_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_quality_typ_nm);
		p.columnDtlGr_gd_cd.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.gd_cd_META);
		p.columnDtlGr_gd_cd.addLinkBeans(p.columnDtlGr_gd_nm);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_gd_cd);
		p.columnDtlGr_gd_nm.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.gd_nm_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_gd_nm);
		p.DtlGrTable.addTable(p.DtlGr_sno_p_PPanel.SnoWrkNoTable);
		p.columnDtlGr_stk_id_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.stk_id_typ_META);
		p.columnDtlGr_stk_id_typ.addLinkBeans(p.columnDtlGr_stk_id_typ_nm);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_stk_id_typ);
		p.columnDtlGr_stk_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.stk_id_typ_nm_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_stk_id_typ_nm);
		p.DtlGrTable.addTable(p.DtlGr_stk_bp_p_PPanel.StkBpTable);
		p.columnDtlGr_fix_no_typ.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.fix_no_typ_META);
		p.columnDtlGr_fix_no_typ.addLinkBeans(p.columnDtlGr_fix_no_typ_nm);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_fix_no_typ);
		p.columnDtlGr_fix_no_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.fix_no_typ_nm_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_fix_no_typ_nm);
		p.columnDtlGr_fix_no.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.fix_no_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_fix_no);
		p.DtlGrTable.addTable(p.DtlGr_stk_arrv_bp_p_PPanel.StkArrvBpTable);
		p.columnDtlGr_intr_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.intr_d_rmrks_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_intr_d_rmrks);
		p.columnDtlGr_trd_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.trd_d_rmrks_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_trd_d_rmrks);
		p.columnDtlGr_sub_char1.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.sub_char1_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_sub_char1);
		p.columnDtlGr_sub_char2.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.sub_char2_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_sub_char2);
		p.columnDtlGr_sub_char3.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.sub_char3_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_sub_char3);
		p.columnDtlGr_stk_xfr_act_d_no.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.stk_xfr_act_d_no_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_stk_xfr_act_d_no);
		p.columnDtlGr_disp_seq.setMeta(mcframe.clientMSBE.MSBEP2520.DtlGiR.disp_seq_META);
		p.DtlGrTable.addColumnConfig(p.columnDtlGr_disp_seq);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Hdr_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_trd_cd.getListConfig().setPutter(getHdr_trd_cd_ListPutter());
		Hdr_loc_cd.getListConfig().setPutter(getHdr_loc_cd_ListPutter());
		Hdr_stk_xfr_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_stk_xfr_rsn_cd.getListConfig().setPutter(getHdr_stk_xfr_rsn_cd_ListPutter());
		DtlGi_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtlGi_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		DtlGi_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		DtlGi_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtlGi_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		DtlGi_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		DtlGi_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtlGi_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		DtlGi_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		DtlGi_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtlGi_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		DtlGi_lot_no_p_PPanel.columnLotNo_lot_no.getListConfig().setPutter(getDtlGi_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter());
		DtlGi_lot_no_p_PPanel.columnLotNo_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		DtlGi_lot_no_p_PPanel.columnLotNo_sublot_no.getListConfig().setPutter(getDtlGi_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter());
		columnDtlGi_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlGi_trd_unit_cd.getListConfig().setPutter(getDtlGi_trd_unit_cd_ListPutter());
		columnDtlGi_quality_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlGi_quality_typ.getListConfig().setPutter(getDtlGi_quality_typ_ListPutter());
		columnDtlGi_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlGi_gd_cd.getListConfig().setPutter(getDtlGi_gd_cd_ListPutter());
		columnDtlGi_stk_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlGi_stk_id_typ.getListConfig().setPutter(getDtlGi_stk_id_typ_ListPutter());
		columnDtlGi_fix_no_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlGi_fix_no_typ.getListConfig().setPutter(getDtlGi_fix_no_typ_ListPutter());
		DtlGr_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtlGr_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		DtlGr_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		DtlGr_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtlGr_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		DtlGr_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		DtlGr_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtlGr_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		DtlGr_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		DtlGr_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtlGr_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		DtlGr_lot_no_p_PPanel.columnLotNo_lot_no.getListConfig().setPutter(getDtlGr_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter());
		DtlGr_lot_no_p_PPanel.columnLotNo_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		DtlGr_lot_no_p_PPanel.columnLotNo_sublot_no.getListConfig().setPutter(getDtlGr_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter());
		columnDtlGr_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlGr_trd_unit_cd.getListConfig().setPutter(getDtlGr_trd_unit_cd_ListPutter());
		columnDtlGr_quality_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlGr_quality_typ.getListConfig().setPutter(getDtlGr_quality_typ_ListPutter());
		columnDtlGr_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlGr_gd_cd.getListConfig().setPutter(getDtlGr_gd_cd_ListPutter());
		columnDtlGr_stk_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlGr_stk_id_typ.getListConfig().setPutter(getDtlGr_stk_id_typ_ListPutter());
		columnDtlGr_fix_no_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlGr_fix_no_typ.getListConfig().setPutter(getDtlGr_fix_no_typ_ListPutter());
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
	 * [Hdr_trd_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_trd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Trd");
		return lp;
	}
	 
	/**
	 * [Hdr_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Hdr_stk_xfr_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_stk_xfr_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StkXfrBizRsn");
		return lp;
	}
	 
	/**
	 * [DtlGi_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtlGi_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [DtlGi_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createDtlGi_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [DtlGi_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createDtlGi_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [DtlGi_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createDtlGi_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [DtlGi_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の作成
	 */
	protected MCListPutter createDtlGi_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.LotNo");
		return lp;
	}

	/**
	 * [DtlGi_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の作成
	 */
	protected MCListPutter createDtlGi_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.SublotNo");
		return lp;
	}

	/**
	 * [DtlGi_trd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtlGi_trd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
		return lp;
	}
	 
	/**
	 * [DtlGi_quality_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtlGi_quality_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.QualityTyp");
		return lp;
	}
	 
	/**
	 * [DtlGi_gd_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtlGi_gd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StkGd");
		return lp;
	}
	 
	/**
	 * [DtlGi_stk_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtlGi_stk_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.StkIdTyp");
		return lp;
	}
	 
	/**
	 * [DtlGi_fix_no_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtlGi_fix_no_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.FixNoTyp");
		return lp;
	}
	 
	/**
	 * [DtlGr_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtlGr_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [DtlGr_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createDtlGr_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [DtlGr_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createDtlGr_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [DtlGr_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createDtlGr_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [DtlGr_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の作成
	 */
	protected MCListPutter createDtlGr_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.LotNo");
		return lp;
	}

	/**
	 * [DtlGr_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の作成
	 */
	protected MCListPutter createDtlGr_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.SublotNo");
		return lp;
	}

	/**
	 * [DtlGr_trd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtlGr_trd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
		return lp;
	}
	 
	/**
	 * [DtlGr_quality_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtlGr_quality_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.QualityTyp");
		return lp;
	}
	 
	/**
	 * [DtlGr_gd_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtlGr_gd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StkGd");
		return lp;
	}
	 
	/**
	 * [DtlGr_stk_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtlGr_stk_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.StkIdTyp");
		return lp;
	}
	 
	/**
	 * [DtlGr_fix_no_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtlGr_fix_no_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.FixNoTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Hdr_trd_cd) return getHdr_trd_cd(row, info);
		if(combo == Hdr_loc_cd) return getHdr_loc_cd(row, info);
		if(combo == Hdr_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == Hdr_stk_xfr_rsn_cd) return getHdr_stk_xfr_rsn_cd(row, info);
		if(combo == DtlGi_itm_p_PPanel.columnItm_itm_cd) return getDtlGi_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == DtlGi_itm_p_PPanel.columnItm_itm_sub1) return getDtlGi_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == DtlGi_itm_p_PPanel.columnItm_itm_sub2) return getDtlGi_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == DtlGi_itm_p_PPanel.columnItm_itm_sub3) return getDtlGi_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == DtlGi_lot_no_p_PPanel.columnLotNo_lot_no) return getDtlGi_lot_no_p_PPanel_columnLotNo_lot_no(row, info);
		if(combo == DtlGi_lot_no_p_PPanel.columnLotNo_sublot_no) return getDtlGi_lot_no_p_PPanel_columnLotNo_sublot_no(row, info);
		if(combo == columnDtlGi_trd_unit_cd) return getDtlGi_trd_unit_cd(row, info);
		if(combo == columnDtlGi_quality_typ) return getDtlGi_quality_typ(row, info);
		if(combo == columnDtlGi_gd_cd) return getDtlGi_gd_cd(row, info);
		if(combo == columnDtlGi_stk_id_typ) return getDtlGi_stk_id_typ(row, info);
		if(combo == columnDtlGi_fix_no_typ) return getDtlGi_fix_no_typ(row, info);
		if(combo == DtlGr_itm_p_PPanel.columnItm_itm_cd) return getDtlGr_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == DtlGr_itm_p_PPanel.columnItm_itm_sub1) return getDtlGr_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == DtlGr_itm_p_PPanel.columnItm_itm_sub2) return getDtlGr_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == DtlGr_itm_p_PPanel.columnItm_itm_sub3) return getDtlGr_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == DtlGr_lot_no_p_PPanel.columnLotNo_lot_no) return getDtlGr_lot_no_p_PPanel_columnLotNo_lot_no(row, info);
		if(combo == DtlGr_lot_no_p_PPanel.columnLotNo_sublot_no) return getDtlGr_lot_no_p_PPanel_columnLotNo_sublot_no(row, info);
		if(combo == columnDtlGr_trd_unit_cd) return getDtlGr_trd_unit_cd(row, info);
		if(combo == columnDtlGr_quality_typ) return getDtlGr_quality_typ(row, info);
		if(combo == columnDtlGr_gd_cd) return getDtlGr_gd_cd(row, info);
		if(combo == columnDtlGr_stk_id_typ) return getDtlGr_stk_id_typ(row, info);
		if(combo == columnDtlGr_fix_no_typ) return getDtlGr_fix_no_typ(row, info);
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
		else if (ap == Btn_open_MSBEP2540_gr) doBtn_open_MSBEP2540_gr(info);
		else if (ap == Btn_open_MSBEP2540_gi) doBtn_open_MSBEP2540_gi(info);
		else if (ap == Btn_prnt) doBtn_prnt(info);
		else if (ap == Btn_radd_gi) doBtn_radd_gi(info);
		else if (ap == Btn_rdel_gi) doBtn_rdel_gi(info);
		else if (ap == Btn_rcopy_gi) doBtn_rcopy_gi(info);
		else if (ap == Btn_top_gi) doBtn_top_gi(info);
		else if (ap == Btn_up_gi) doBtn_up_gi(info);
		else if (ap == Btn_down_gi) doBtn_down_gi(info);
		else if (ap == Btn_bottom_gi) doBtn_bottom_gi(info);
		else if (ap == Btn_radd_gr) doBtn_radd_gr(info);
		else if (ap == Btn_rdel_gr) doBtn_rdel_gr(info);
		else if (ap == Btn_rcopy_gr) doBtn_rcopy_gr(info);
		else if (ap == Btn_top_gr) doBtn_top_gr(info);
		else if (ap == Btn_up_gr) doBtn_up_gr(info);
		else if (ap == Btn_down_gr) doBtn_down_gr(info);
		else if (ap == Btn_bottom_gr) doBtn_bottom_gr(info);
		else if (ap == Btn_ins_itm) doBtn_ins_itm(info);
		else if (ap == Btn_ins_lot_sno) doBtn_ins_lot_sno(info);
		else if (ap == Btn_ins_grd) doBtn_ins_grd(info);
		else if (ap == Btn_ins_pack) doBtn_ins_pack(info);
		else if (ap == Btn_upd_itm) doBtn_upd_itm(info);
		else if (ap == Btn_upd_lot_sno) doBtn_upd_lot_sno(info);
		else if (ap == Btn_upd_grd) doBtn_upd_grd(info);
		else if (ap == Btn_upd_pack) doBtn_upd_pack(info);
		else if (ap == Btn_del_itm) doBtn_del_itm(info);
		else if (ap == Btn_del_lot_sno) doBtn_del_lot_sno(info);
		else if (ap == Btn_del_grd) doBtn_del_grd(info);
		else if (ap == Btn_del_pack) doBtn_del_pack(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP2540_gr]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP2540_gr(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP2540_gi]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP2540_gi(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt(MCEventInfo info);

	/**
	 * [Btn]パネルの[radd_gi]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_radd_gi(MCEventInfo info);

	/**
	 * [Btn]パネルの[rdel_gi]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rdel_gi(MCEventInfo info);

	/**
	 * [Btn]パネルの[rcopy_gi]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rcopy_gi(MCEventInfo info);

	/**
	 * [Btn]パネルの[top_gi]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_top_gi(MCEventInfo info);

	/**
	 * [Btn]パネルの[up_gi]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_up_gi(MCEventInfo info);

	/**
	 * [Btn]パネルの[down_gi]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_down_gi(MCEventInfo info);

	/**
	 * [Btn]パネルの[bottom_gi]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_bottom_gi(MCEventInfo info);

	/**
	 * [Btn]パネルの[radd_gr]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_radd_gr(MCEventInfo info);

	/**
	 * [Btn]パネルの[rdel_gr]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rdel_gr(MCEventInfo info);

	/**
	 * [Btn]パネルの[rcopy_gr]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rcopy_gr(MCEventInfo info);

	/**
	 * [Btn]パネルの[top_gr]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_top_gr(MCEventInfo info);

	/**
	 * [Btn]パネルの[up_gr]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_up_gr(MCEventInfo info);

	/**
	 * [Btn]パネルの[down_gr]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_down_gr(MCEventInfo info);

	/**
	 * [Btn]パネルの[bottom_gr]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_bottom_gr(MCEventInfo info);

	/**
	 * [Btn]パネルの[ins_itm]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins_itm(MCEventInfo info);

	/**
	 * [Btn]パネルの[ins_lot_sno]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins_lot_sno(MCEventInfo info);

	/**
	 * [Btn]パネルの[ins_grd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins_grd(MCEventInfo info);

	/**
	 * [Btn]パネルの[ins_pack]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins_pack(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_itm]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_itm(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_lot_sno]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_lot_sno(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_grd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_grd(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_pack]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_pack(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_itm]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_itm(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_lot_sno]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_lot_sno(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_grd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_grd(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_pack]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_pack(MCEventInfo info);

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
		if (vc == DtlGiTable) return doDtlGi_VC(info);
		if (vc == DtlGrTable) return doDtlGr_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_stk_xfr_act_no) return doCnd_stk_xfr_act_no_VC(info);
		if (vc == Hdr_trd_cd) return doHdr_trd_cd_VC(info);
		if (vc == Hdr_trd_nm) return doHdr_trd_nm_VC(info);
		if (vc == Hdr_trd_ptn_typ) return doHdr_trd_ptn_typ_VC(info);
		if (vc == Hdr_stk_xfr_act_no) return doHdr_stk_xfr_act_no_VC(info);
		if (vc == Hdr_prnt_flg) return doHdr_prnt_flg_VC(info);
		if (vc == Hdr_loc_cd) return doHdr_loc_cd_VC(info);
		if (vc == Hdr_loc_nm) return doHdr_loc_nm_VC(info);
		if (vc == Hdr_sppl_cd) return doHdr_sppl_cd_VC(info);
		if (vc == Hdr_site_cd) return doHdr_site_cd_VC(info);
		if (vc == Hdr_wg_cd) return doHdr_wg_cd_VC(info);
		if (vc == Hdr_wg_nm) return doHdr_wg_nm_VC(info);
		if (vc == Hdr_str_ln_tgt_flg) return doHdr_str_ln_tgt_flg_VC(info);
		if (vc == Hdr_stk_xfr_rsn_cd) return doHdr_stk_xfr_rsn_cd_VC(info);
		if (vc == Hdr_stk_xfr_rsn_nm) return doHdr_stk_xfr_rsn_nm_VC(info);
		if (vc == Hdr_intr_rmrks) return doHdr_intr_rmrks_VC(info);
		if (vc == Hdr_trd_rmrks) return doHdr_trd_rmrks_VC(info);
		if (vc == Hdr_sub_char1) return doHdr_sub_char1_VC(info);
		if (vc == Hdr_sub_char2) return doHdr_sub_char2_VC(info);
		if (vc == Hdr_sub_char3) return doHdr_sub_char3_VC(info);
		if (vc == Hdr_upd_cntr) return doHdr_upd_cntr_VC(info);
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
		if (vc == columnDtlGi_sundry_itm_flg) return doDtlGi_sundry_itm_flg_VC(info);
		if (vc == columnDtlGi_not_new_lot_flg) return doDtlGi_not_new_lot_flg_VC(info);
		if (vc == columnDtlGi_lot_mng_typ) return doDtlGi_lot_mng_typ_VC(info);
		if (vc == columnDtlGi_lot_no_typ) return doDtlGi_lot_no_typ_VC(info);
		if (vc == columnDtlGi_sublot_mng_typ) return doDtlGi_sublot_mng_typ_VC(info);
		if (vc == columnDtlGi_sublot_no_typ) return doDtlGi_sublot_no_typ_VC(info);
		if (vc == columnDtlGi_lot_no_ptn_cd) return doDtlGi_lot_no_ptn_cd_VC(info);
		if (vc == columnDtlGi_sublot_no_ptn_cd) return doDtlGi_sublot_no_ptn_cd_VC(info);
		if (vc == columnDtlGi_ver_flg) return doDtlGi_ver_flg_VC(info);
		if (vc == columnDtlGi_sno1_mng_typ) return doDtlGi_sno1_mng_typ_VC(info);
		if (vc == columnDtlGi_sno2_mng_typ) return doDtlGi_sno2_mng_typ_VC(info);
		if (vc == columnDtlGi_sno3_mng_typ) return doDtlGi_sno3_mng_typ_VC(info);
		if (vc == columnDtlGi_sno4_mng_typ) return doDtlGi_sno4_mng_typ_VC(info);
		if (vc == columnDtlGi_cont_fctr_flg) return doDtlGi_cont_fctr_flg_VC(info);
		if (vc == columnDtlGi_stk_mng_typ) return doDtlGi_stk_mng_typ_VC(info);
		if (vc == columnDtlGi_trd_unit_cd) return doDtlGi_trd_unit_cd_VC(info);
		if (vc == columnDtlGi_trd_unit_nm) return doDtlGi_trd_unit_nm_VC(info);
		if (vc == columnDtlGi_trd_unit_dec_place) return doDtlGi_trd_unit_dec_place_VC(info);
		if (vc == columnDtlGi_trd_unit_rnd_typ) return doDtlGi_trd_unit_rnd_typ_VC(info);
		if (vc == columnDtlGi_trd_unit_conv_base_qty) return doDtlGi_trd_unit_conv_base_qty_VC(info);
		if (vc == columnDtlGi_trd_unit_conv_qty) return doDtlGi_trd_unit_conv_qty_VC(info);
		if (vc == columnDtlGi_base_unit_cd) return doDtlGi_base_unit_cd_VC(info);
		if (vc == columnDtlGi_base_unit_nm) return doDtlGi_base_unit_nm_VC(info);
		if (vc == columnDtlGi_base_unit_dec_place) return doDtlGi_base_unit_dec_place_VC(info);
		if (vc == columnDtlGi_base_unit_conv_rnd_typ) return doDtlGi_base_unit_conv_rnd_typ_VC(info);
		if (vc == columnDtlGi_cont_fctr_rnd_typ) return doDtlGi_cont_fctr_rnd_typ_VC(info);
		if (vc == columnDtlGi_cont_fctr_dec_place) return doDtlGi_cont_fctr_dec_place_VC(info);
		if (vc == columnDtlGi_quality_typ) return doDtlGi_quality_typ_VC(info);
		if (vc == columnDtlGi_quality_typ_nm) return doDtlGi_quality_typ_nm_VC(info);
		if (vc == columnDtlGi_gd_cd) return doDtlGi_gd_cd_VC(info);
		if (vc == columnDtlGi_gd_nm) return doDtlGi_gd_nm_VC(info);
		if (vc == columnDtlGi_stk_id_typ) return doDtlGi_stk_id_typ_VC(info);
		if (vc == columnDtlGi_stk_id_typ_nm) return doDtlGi_stk_id_typ_nm_VC(info);
		if (vc == columnDtlGi_fix_no_typ) return doDtlGi_fix_no_typ_VC(info);
		if (vc == columnDtlGi_fix_no_typ_nm) return doDtlGi_fix_no_typ_nm_VC(info);
		if (vc == columnDtlGi_fix_no) return doDtlGi_fix_no_VC(info);
		if (vc == columnDtlGi_intr_d_rmrks) return doDtlGi_intr_d_rmrks_VC(info);
		if (vc == columnDtlGi_trd_d_rmrks) return doDtlGi_trd_d_rmrks_VC(info);
		if (vc == columnDtlGi_sub_char1) return doDtlGi_sub_char1_VC(info);
		if (vc == columnDtlGi_sub_char2) return doDtlGi_sub_char2_VC(info);
		if (vc == columnDtlGi_sub_char3) return doDtlGi_sub_char3_VC(info);
		if (vc == columnDtlGi_stk_xfr_act_d_no) return doDtlGi_stk_xfr_act_d_no_VC(info);
		if (vc == columnDtlGi_disp_seq) return doDtlGi_disp_seq_VC(info);
		if (vc == columnDtlGr_sundry_itm_flg) return doDtlGr_sundry_itm_flg_VC(info);
		if (vc == columnDtlGr_not_new_lot_flg) return doDtlGr_not_new_lot_flg_VC(info);
		if (vc == columnDtlGr_lot_mng_typ) return doDtlGr_lot_mng_typ_VC(info);
		if (vc == columnDtlGr_lot_no_typ) return doDtlGr_lot_no_typ_VC(info);
		if (vc == columnDtlGr_sublot_mng_typ) return doDtlGr_sublot_mng_typ_VC(info);
		if (vc == columnDtlGr_sublot_no_typ) return doDtlGr_sublot_no_typ_VC(info);
		if (vc == columnDtlGr_lot_no_ptn_cd) return doDtlGr_lot_no_ptn_cd_VC(info);
		if (vc == columnDtlGr_sublot_no_ptn_cd) return doDtlGr_sublot_no_ptn_cd_VC(info);
		if (vc == columnDtlGr_ver_flg) return doDtlGr_ver_flg_VC(info);
		if (vc == columnDtlGr_sno1_mng_typ) return doDtlGr_sno1_mng_typ_VC(info);
		if (vc == columnDtlGr_sno2_mng_typ) return doDtlGr_sno2_mng_typ_VC(info);
		if (vc == columnDtlGr_sno3_mng_typ) return doDtlGr_sno3_mng_typ_VC(info);
		if (vc == columnDtlGr_sno4_mng_typ) return doDtlGr_sno4_mng_typ_VC(info);
		if (vc == columnDtlGr_cont_fctr_flg) return doDtlGr_cont_fctr_flg_VC(info);
		if (vc == columnDtlGr_stk_mng_typ) return doDtlGr_stk_mng_typ_VC(info);
		if (vc == columnDtlGr_trd_unit_cd) return doDtlGr_trd_unit_cd_VC(info);
		if (vc == columnDtlGr_trd_unit_nm) return doDtlGr_trd_unit_nm_VC(info);
		if (vc == columnDtlGr_trd_unit_dec_place) return doDtlGr_trd_unit_dec_place_VC(info);
		if (vc == columnDtlGr_trd_unit_rnd_typ) return doDtlGr_trd_unit_rnd_typ_VC(info);
		if (vc == columnDtlGr_trd_unit_conv_base_qty) return doDtlGr_trd_unit_conv_base_qty_VC(info);
		if (vc == columnDtlGr_trd_unit_conv_qty) return doDtlGr_trd_unit_conv_qty_VC(info);
		if (vc == columnDtlGr_base_unit_cd) return doDtlGr_base_unit_cd_VC(info);
		if (vc == columnDtlGr_base_unit_nm) return doDtlGr_base_unit_nm_VC(info);
		if (vc == columnDtlGr_base_unit_dec_place) return doDtlGr_base_unit_dec_place_VC(info);
		if (vc == columnDtlGr_base_unit_conv_rnd_typ) return doDtlGr_base_unit_conv_rnd_typ_VC(info);
		if (vc == columnDtlGr_cont_fctr_rnd_typ) return doDtlGr_cont_fctr_rnd_typ_VC(info);
		if (vc == columnDtlGr_cont_fctr_dec_place) return doDtlGr_cont_fctr_dec_place_VC(info);
		if (vc == columnDtlGr_quality_typ) return doDtlGr_quality_typ_VC(info);
		if (vc == columnDtlGr_quality_typ_nm) return doDtlGr_quality_typ_nm_VC(info);
		if (vc == columnDtlGr_gd_cd) return doDtlGr_gd_cd_VC(info);
		if (vc == columnDtlGr_gd_nm) return doDtlGr_gd_nm_VC(info);
		if (vc == columnDtlGr_stk_id_typ) return doDtlGr_stk_id_typ_VC(info);
		if (vc == columnDtlGr_stk_id_typ_nm) return doDtlGr_stk_id_typ_nm_VC(info);
		if (vc == columnDtlGr_fix_no_typ) return doDtlGr_fix_no_typ_VC(info);
		if (vc == columnDtlGr_fix_no_typ_nm) return doDtlGr_fix_no_typ_nm_VC(info);
		if (vc == columnDtlGr_fix_no) return doDtlGr_fix_no_VC(info);
		if (vc == columnDtlGr_intr_d_rmrks) return doDtlGr_intr_d_rmrks_VC(info);
		if (vc == columnDtlGr_trd_d_rmrks) return doDtlGr_trd_d_rmrks_VC(info);
		if (vc == columnDtlGr_sub_char1) return doDtlGr_sub_char1_VC(info);
		if (vc == columnDtlGr_sub_char2) return doDtlGr_sub_char2_VC(info);
		if (vc == columnDtlGr_sub_char3) return doDtlGr_sub_char3_VC(info);
		if (vc == columnDtlGr_stk_xfr_act_d_no) return doDtlGr_stk_xfr_act_d_no_VC(info);
		if (vc == columnDtlGr_disp_seq) return doDtlGr_disp_seq_VC(info);
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
	 * [DtlGi]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_xfr_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_xfr_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[stk_xfr_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_stk_xfr_act_no_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sppl_cd_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[stk_xfr_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_stk_xfr_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[stk_xfr_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_stk_xfr_rsn_nm_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_rmrks_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_cntr_VC(MCEventInfo info){
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
	 * [DtlGi]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_sundry_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[not_new_lot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_not_new_lot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[lot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_lot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_sublot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[sublot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_sublot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[lot_no_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_lot_no_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[sublot_no_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_sublot_no_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_ver_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[cont_fctr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_cont_fctr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[trd_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_trd_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[trd_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_trd_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[trd_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_trd_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[base_unit_conv_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_base_unit_conv_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_cont_fctr_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[cont_fctr_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_cont_fctr_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_gd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[stk_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_stk_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[stk_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_stk_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[fix_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_fix_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[fix_no_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_fix_no_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[fix_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_fix_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_intr_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[stk_xfr_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_stk_xfr_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGi]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGi_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_sundry_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[not_new_lot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_not_new_lot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[lot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_lot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_sublot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[sublot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_sublot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[lot_no_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_lot_no_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[sublot_no_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_sublot_no_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_ver_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[cont_fctr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_cont_fctr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[trd_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_trd_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[trd_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_trd_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[trd_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_trd_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[base_unit_conv_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_base_unit_conv_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_cont_fctr_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[cont_fctr_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_cont_fctr_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_gd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[stk_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_stk_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[stk_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_stk_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[fix_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_fix_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[fix_no_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_fix_no_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[fix_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_fix_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_intr_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[stk_xfr_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_stk_xfr_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlGr]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlGr_disp_seq_VC(MCEventInfo info){
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
		else if (nc == DtlGiTable) doDtlGi_NC(info);
		else if (nc == DtlGrTable) doDtlGr_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_stk_xfr_act_no) doCnd_stk_xfr_act_no_NC(info);
		else if (nc == Hdr_trd_cd) doHdr_trd_cd_NC(info);
		else if (nc == Hdr_trd_nm) doHdr_trd_nm_NC(info);
		else if (nc == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NC(info);
		else if (nc == Hdr_stk_xfr_act_no) doHdr_stk_xfr_act_no_NC(info);
		else if (nc == Hdr_prnt_flg) doHdr_prnt_flg_NC(info);
		else if (nc == Hdr_loc_cd) doHdr_loc_cd_NC(info);
		else if (nc == Hdr_loc_nm) doHdr_loc_nm_NC(info);
		else if (nc == Hdr_sppl_cd) doHdr_sppl_cd_NC(info);
		else if (nc == Hdr_site_cd) doHdr_site_cd_NC(info);
		else if (nc == Hdr_wg_cd) doHdr_wg_cd_NC(info);
		else if (nc == Hdr_wg_nm) doHdr_wg_nm_NC(info);
		else if (nc == Hdr_str_ln_tgt_flg) doHdr_str_ln_tgt_flg_NC(info);
		else if (nc == Hdr_stk_xfr_rsn_cd) doHdr_stk_xfr_rsn_cd_NC(info);
		else if (nc == Hdr_stk_xfr_rsn_nm) doHdr_stk_xfr_rsn_nm_NC(info);
		else if (nc == Hdr_intr_rmrks) doHdr_intr_rmrks_NC(info);
		else if (nc == Hdr_trd_rmrks) doHdr_trd_rmrks_NC(info);
		else if (nc == Hdr_sub_char1) doHdr_sub_char1_NC(info);
		else if (nc == Hdr_sub_char2) doHdr_sub_char2_NC(info);
		else if (nc == Hdr_sub_char3) doHdr_sub_char3_NC(info);
		else if (nc == Hdr_upd_cntr) doHdr_upd_cntr_NC(info);
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
		else if (nc == columnDtlGi_sundry_itm_flg) doDtlGi_sundry_itm_flg_NC(info);
		else if (nc == columnDtlGi_not_new_lot_flg) doDtlGi_not_new_lot_flg_NC(info);
		else if (nc == columnDtlGi_lot_mng_typ) doDtlGi_lot_mng_typ_NC(info);
		else if (nc == columnDtlGi_lot_no_typ) doDtlGi_lot_no_typ_NC(info);
		else if (nc == columnDtlGi_sublot_mng_typ) doDtlGi_sublot_mng_typ_NC(info);
		else if (nc == columnDtlGi_sublot_no_typ) doDtlGi_sublot_no_typ_NC(info);
		else if (nc == columnDtlGi_lot_no_ptn_cd) doDtlGi_lot_no_ptn_cd_NC(info);
		else if (nc == columnDtlGi_sublot_no_ptn_cd) doDtlGi_sublot_no_ptn_cd_NC(info);
		else if (nc == columnDtlGi_ver_flg) doDtlGi_ver_flg_NC(info);
		else if (nc == columnDtlGi_sno1_mng_typ) doDtlGi_sno1_mng_typ_NC(info);
		else if (nc == columnDtlGi_sno2_mng_typ) doDtlGi_sno2_mng_typ_NC(info);
		else if (nc == columnDtlGi_sno3_mng_typ) doDtlGi_sno3_mng_typ_NC(info);
		else if (nc == columnDtlGi_sno4_mng_typ) doDtlGi_sno4_mng_typ_NC(info);
		else if (nc == columnDtlGi_cont_fctr_flg) doDtlGi_cont_fctr_flg_NC(info);
		else if (nc == columnDtlGi_stk_mng_typ) doDtlGi_stk_mng_typ_NC(info);
		else if (nc == columnDtlGi_trd_unit_cd) doDtlGi_trd_unit_cd_NC(info);
		else if (nc == columnDtlGi_trd_unit_nm) doDtlGi_trd_unit_nm_NC(info);
		else if (nc == columnDtlGi_trd_unit_dec_place) doDtlGi_trd_unit_dec_place_NC(info);
		else if (nc == columnDtlGi_trd_unit_rnd_typ) doDtlGi_trd_unit_rnd_typ_NC(info);
		else if (nc == columnDtlGi_trd_unit_conv_base_qty) doDtlGi_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnDtlGi_trd_unit_conv_qty) doDtlGi_trd_unit_conv_qty_NC(info);
		else if (nc == columnDtlGi_base_unit_cd) doDtlGi_base_unit_cd_NC(info);
		else if (nc == columnDtlGi_base_unit_nm) doDtlGi_base_unit_nm_NC(info);
		else if (nc == columnDtlGi_base_unit_dec_place) doDtlGi_base_unit_dec_place_NC(info);
		else if (nc == columnDtlGi_base_unit_conv_rnd_typ) doDtlGi_base_unit_conv_rnd_typ_NC(info);
		else if (nc == columnDtlGi_cont_fctr_rnd_typ) doDtlGi_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnDtlGi_cont_fctr_dec_place) doDtlGi_cont_fctr_dec_place_NC(info);
		else if (nc == columnDtlGi_quality_typ) doDtlGi_quality_typ_NC(info);
		else if (nc == columnDtlGi_quality_typ_nm) doDtlGi_quality_typ_nm_NC(info);
		else if (nc == columnDtlGi_gd_cd) doDtlGi_gd_cd_NC(info);
		else if (nc == columnDtlGi_gd_nm) doDtlGi_gd_nm_NC(info);
		else if (nc == columnDtlGi_stk_id_typ) doDtlGi_stk_id_typ_NC(info);
		else if (nc == columnDtlGi_stk_id_typ_nm) doDtlGi_stk_id_typ_nm_NC(info);
		else if (nc == columnDtlGi_fix_no_typ) doDtlGi_fix_no_typ_NC(info);
		else if (nc == columnDtlGi_fix_no_typ_nm) doDtlGi_fix_no_typ_nm_NC(info);
		else if (nc == columnDtlGi_fix_no) doDtlGi_fix_no_NC(info);
		else if (nc == columnDtlGi_intr_d_rmrks) doDtlGi_intr_d_rmrks_NC(info);
		else if (nc == columnDtlGi_trd_d_rmrks) doDtlGi_trd_d_rmrks_NC(info);
		else if (nc == columnDtlGi_sub_char1) doDtlGi_sub_char1_NC(info);
		else if (nc == columnDtlGi_sub_char2) doDtlGi_sub_char2_NC(info);
		else if (nc == columnDtlGi_sub_char3) doDtlGi_sub_char3_NC(info);
		else if (nc == columnDtlGi_stk_xfr_act_d_no) doDtlGi_stk_xfr_act_d_no_NC(info);
		else if (nc == columnDtlGi_disp_seq) doDtlGi_disp_seq_NC(info);
		else if (nc == columnDtlGr_sundry_itm_flg) doDtlGr_sundry_itm_flg_NC(info);
		else if (nc == columnDtlGr_not_new_lot_flg) doDtlGr_not_new_lot_flg_NC(info);
		else if (nc == columnDtlGr_lot_mng_typ) doDtlGr_lot_mng_typ_NC(info);
		else if (nc == columnDtlGr_lot_no_typ) doDtlGr_lot_no_typ_NC(info);
		else if (nc == columnDtlGr_sublot_mng_typ) doDtlGr_sublot_mng_typ_NC(info);
		else if (nc == columnDtlGr_sublot_no_typ) doDtlGr_sublot_no_typ_NC(info);
		else if (nc == columnDtlGr_lot_no_ptn_cd) doDtlGr_lot_no_ptn_cd_NC(info);
		else if (nc == columnDtlGr_sublot_no_ptn_cd) doDtlGr_sublot_no_ptn_cd_NC(info);
		else if (nc == columnDtlGr_ver_flg) doDtlGr_ver_flg_NC(info);
		else if (nc == columnDtlGr_sno1_mng_typ) doDtlGr_sno1_mng_typ_NC(info);
		else if (nc == columnDtlGr_sno2_mng_typ) doDtlGr_sno2_mng_typ_NC(info);
		else if (nc == columnDtlGr_sno3_mng_typ) doDtlGr_sno3_mng_typ_NC(info);
		else if (nc == columnDtlGr_sno4_mng_typ) doDtlGr_sno4_mng_typ_NC(info);
		else if (nc == columnDtlGr_cont_fctr_flg) doDtlGr_cont_fctr_flg_NC(info);
		else if (nc == columnDtlGr_stk_mng_typ) doDtlGr_stk_mng_typ_NC(info);
		else if (nc == columnDtlGr_trd_unit_cd) doDtlGr_trd_unit_cd_NC(info);
		else if (nc == columnDtlGr_trd_unit_nm) doDtlGr_trd_unit_nm_NC(info);
		else if (nc == columnDtlGr_trd_unit_dec_place) doDtlGr_trd_unit_dec_place_NC(info);
		else if (nc == columnDtlGr_trd_unit_rnd_typ) doDtlGr_trd_unit_rnd_typ_NC(info);
		else if (nc == columnDtlGr_trd_unit_conv_base_qty) doDtlGr_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnDtlGr_trd_unit_conv_qty) doDtlGr_trd_unit_conv_qty_NC(info);
		else if (nc == columnDtlGr_base_unit_cd) doDtlGr_base_unit_cd_NC(info);
		else if (nc == columnDtlGr_base_unit_nm) doDtlGr_base_unit_nm_NC(info);
		else if (nc == columnDtlGr_base_unit_dec_place) doDtlGr_base_unit_dec_place_NC(info);
		else if (nc == columnDtlGr_base_unit_conv_rnd_typ) doDtlGr_base_unit_conv_rnd_typ_NC(info);
		else if (nc == columnDtlGr_cont_fctr_rnd_typ) doDtlGr_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnDtlGr_cont_fctr_dec_place) doDtlGr_cont_fctr_dec_place_NC(info);
		else if (nc == columnDtlGr_quality_typ) doDtlGr_quality_typ_NC(info);
		else if (nc == columnDtlGr_quality_typ_nm) doDtlGr_quality_typ_nm_NC(info);
		else if (nc == columnDtlGr_gd_cd) doDtlGr_gd_cd_NC(info);
		else if (nc == columnDtlGr_gd_nm) doDtlGr_gd_nm_NC(info);
		else if (nc == columnDtlGr_stk_id_typ) doDtlGr_stk_id_typ_NC(info);
		else if (nc == columnDtlGr_stk_id_typ_nm) doDtlGr_stk_id_typ_nm_NC(info);
		else if (nc == columnDtlGr_fix_no_typ) doDtlGr_fix_no_typ_NC(info);
		else if (nc == columnDtlGr_fix_no_typ_nm) doDtlGr_fix_no_typ_nm_NC(info);
		else if (nc == columnDtlGr_fix_no) doDtlGr_fix_no_NC(info);
		else if (nc == columnDtlGr_intr_d_rmrks) doDtlGr_intr_d_rmrks_NC(info);
		else if (nc == columnDtlGr_trd_d_rmrks) doDtlGr_trd_d_rmrks_NC(info);
		else if (nc == columnDtlGr_sub_char1) doDtlGr_sub_char1_NC(info);
		else if (nc == columnDtlGr_sub_char2) doDtlGr_sub_char2_NC(info);
		else if (nc == columnDtlGr_sub_char3) doDtlGr_sub_char3_NC(info);
		else if (nc == columnDtlGr_stk_xfr_act_d_no) doDtlGr_stk_xfr_act_d_no_NC(info);
		else if (nc == columnDtlGr_disp_seq) doDtlGr_disp_seq_NC(info);
	}

	/**
	 * [HdrTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_xfr_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_xfr_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[stk_xfr_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_stk_xfr_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_flg_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_site_cd_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[stk_xfr_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_stk_xfr_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[stk_xfr_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_stk_xfr_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_rmrks_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NC(MCEventInfo info){
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
	 * [DtlGi]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[not_new_lot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_not_new_lot_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[lot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_lot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sublot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sublot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[lot_no_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_lot_no_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sublot_no_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sublot_no_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[base_unit_conv_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_base_unit_conv_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_gd_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[stk_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_stk_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[stk_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_stk_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[fix_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_fix_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[fix_no_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_fix_no_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[fix_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_fix_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[stk_xfr_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_stk_xfr_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[not_new_lot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_not_new_lot_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[lot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_lot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sublot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sublot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[lot_no_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_lot_no_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sublot_no_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sublot_no_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[base_unit_conv_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_base_unit_conv_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_gd_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[stk_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_stk_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[stk_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_stk_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[fix_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_fix_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[fix_no_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_fix_no_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[fix_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_fix_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[stk_xfr_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_stk_xfr_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_disp_seq_NC(MCEventInfo info){
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
		else if (ne == DtlGiTable) doDtlGi_NE(info);
		else if (ne == DtlGrTable) doDtlGr_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_stk_xfr_act_no) doCnd_stk_xfr_act_no_NE(info);
		else if (ne == Hdr_trd_cd) doHdr_trd_cd_NE(info);
		else if (ne == Hdr_trd_nm) doHdr_trd_nm_NE(info);
		else if (ne == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NE(info);
		else if (ne == Hdr_stk_xfr_act_no) doHdr_stk_xfr_act_no_NE(info);
		else if (ne == Hdr_prnt_flg) doHdr_prnt_flg_NE(info);
		else if (ne == Hdr_loc_cd) doHdr_loc_cd_NE(info);
		else if (ne == Hdr_loc_nm) doHdr_loc_nm_NE(info);
		else if (ne == Hdr_sppl_cd) doHdr_sppl_cd_NE(info);
		else if (ne == Hdr_site_cd) doHdr_site_cd_NE(info);
		else if (ne == Hdr_wg_cd) doHdr_wg_cd_NE(info);
		else if (ne == Hdr_wg_nm) doHdr_wg_nm_NE(info);
		else if (ne == Hdr_str_ln_tgt_flg) doHdr_str_ln_tgt_flg_NE(info);
		else if (ne == Hdr_stk_xfr_rsn_cd) doHdr_stk_xfr_rsn_cd_NE(info);
		else if (ne == Hdr_stk_xfr_rsn_nm) doHdr_stk_xfr_rsn_nm_NE(info);
		else if (ne == Hdr_intr_rmrks) doHdr_intr_rmrks_NE(info);
		else if (ne == Hdr_trd_rmrks) doHdr_trd_rmrks_NE(info);
		else if (ne == Hdr_sub_char1) doHdr_sub_char1_NE(info);
		else if (ne == Hdr_sub_char2) doHdr_sub_char2_NE(info);
		else if (ne == Hdr_sub_char3) doHdr_sub_char3_NE(info);
		else if (ne == Hdr_upd_cntr) doHdr_upd_cntr_NE(info);
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
		else if (ne == columnDtlGi_sundry_itm_flg) doDtlGi_sundry_itm_flg_NE(info);
		else if (ne == columnDtlGi_not_new_lot_flg) doDtlGi_not_new_lot_flg_NE(info);
		else if (ne == columnDtlGi_lot_mng_typ) doDtlGi_lot_mng_typ_NE(info);
		else if (ne == columnDtlGi_lot_no_typ) doDtlGi_lot_no_typ_NE(info);
		else if (ne == columnDtlGi_sublot_mng_typ) doDtlGi_sublot_mng_typ_NE(info);
		else if (ne == columnDtlGi_sublot_no_typ) doDtlGi_sublot_no_typ_NE(info);
		else if (ne == columnDtlGi_lot_no_ptn_cd) doDtlGi_lot_no_ptn_cd_NE(info);
		else if (ne == columnDtlGi_sublot_no_ptn_cd) doDtlGi_sublot_no_ptn_cd_NE(info);
		else if (ne == columnDtlGi_ver_flg) doDtlGi_ver_flg_NE(info);
		else if (ne == columnDtlGi_sno1_mng_typ) doDtlGi_sno1_mng_typ_NE(info);
		else if (ne == columnDtlGi_sno2_mng_typ) doDtlGi_sno2_mng_typ_NE(info);
		else if (ne == columnDtlGi_sno3_mng_typ) doDtlGi_sno3_mng_typ_NE(info);
		else if (ne == columnDtlGi_sno4_mng_typ) doDtlGi_sno4_mng_typ_NE(info);
		else if (ne == columnDtlGi_cont_fctr_flg) doDtlGi_cont_fctr_flg_NE(info);
		else if (ne == columnDtlGi_stk_mng_typ) doDtlGi_stk_mng_typ_NE(info);
		else if (ne == columnDtlGi_trd_unit_cd) doDtlGi_trd_unit_cd_NE(info);
		else if (ne == columnDtlGi_trd_unit_nm) doDtlGi_trd_unit_nm_NE(info);
		else if (ne == columnDtlGi_trd_unit_dec_place) doDtlGi_trd_unit_dec_place_NE(info);
		else if (ne == columnDtlGi_trd_unit_rnd_typ) doDtlGi_trd_unit_rnd_typ_NE(info);
		else if (ne == columnDtlGi_trd_unit_conv_base_qty) doDtlGi_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnDtlGi_trd_unit_conv_qty) doDtlGi_trd_unit_conv_qty_NE(info);
		else if (ne == columnDtlGi_base_unit_cd) doDtlGi_base_unit_cd_NE(info);
		else if (ne == columnDtlGi_base_unit_nm) doDtlGi_base_unit_nm_NE(info);
		else if (ne == columnDtlGi_base_unit_dec_place) doDtlGi_base_unit_dec_place_NE(info);
		else if (ne == columnDtlGi_base_unit_conv_rnd_typ) doDtlGi_base_unit_conv_rnd_typ_NE(info);
		else if (ne == columnDtlGi_cont_fctr_rnd_typ) doDtlGi_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnDtlGi_cont_fctr_dec_place) doDtlGi_cont_fctr_dec_place_NE(info);
		else if (ne == columnDtlGi_quality_typ) doDtlGi_quality_typ_NE(info);
		else if (ne == columnDtlGi_quality_typ_nm) doDtlGi_quality_typ_nm_NE(info);
		else if (ne == columnDtlGi_gd_cd) doDtlGi_gd_cd_NE(info);
		else if (ne == columnDtlGi_gd_nm) doDtlGi_gd_nm_NE(info);
		else if (ne == columnDtlGi_stk_id_typ) doDtlGi_stk_id_typ_NE(info);
		else if (ne == columnDtlGi_stk_id_typ_nm) doDtlGi_stk_id_typ_nm_NE(info);
		else if (ne == columnDtlGi_fix_no_typ) doDtlGi_fix_no_typ_NE(info);
		else if (ne == columnDtlGi_fix_no_typ_nm) doDtlGi_fix_no_typ_nm_NE(info);
		else if (ne == columnDtlGi_fix_no) doDtlGi_fix_no_NE(info);
		else if (ne == columnDtlGi_intr_d_rmrks) doDtlGi_intr_d_rmrks_NE(info);
		else if (ne == columnDtlGi_trd_d_rmrks) doDtlGi_trd_d_rmrks_NE(info);
		else if (ne == columnDtlGi_sub_char1) doDtlGi_sub_char1_NE(info);
		else if (ne == columnDtlGi_sub_char2) doDtlGi_sub_char2_NE(info);
		else if (ne == columnDtlGi_sub_char3) doDtlGi_sub_char3_NE(info);
		else if (ne == columnDtlGi_stk_xfr_act_d_no) doDtlGi_stk_xfr_act_d_no_NE(info);
		else if (ne == columnDtlGi_disp_seq) doDtlGi_disp_seq_NE(info);
		else if (ne == columnDtlGr_sundry_itm_flg) doDtlGr_sundry_itm_flg_NE(info);
		else if (ne == columnDtlGr_not_new_lot_flg) doDtlGr_not_new_lot_flg_NE(info);
		else if (ne == columnDtlGr_lot_mng_typ) doDtlGr_lot_mng_typ_NE(info);
		else if (ne == columnDtlGr_lot_no_typ) doDtlGr_lot_no_typ_NE(info);
		else if (ne == columnDtlGr_sublot_mng_typ) doDtlGr_sublot_mng_typ_NE(info);
		else if (ne == columnDtlGr_sublot_no_typ) doDtlGr_sublot_no_typ_NE(info);
		else if (ne == columnDtlGr_lot_no_ptn_cd) doDtlGr_lot_no_ptn_cd_NE(info);
		else if (ne == columnDtlGr_sublot_no_ptn_cd) doDtlGr_sublot_no_ptn_cd_NE(info);
		else if (ne == columnDtlGr_ver_flg) doDtlGr_ver_flg_NE(info);
		else if (ne == columnDtlGr_sno1_mng_typ) doDtlGr_sno1_mng_typ_NE(info);
		else if (ne == columnDtlGr_sno2_mng_typ) doDtlGr_sno2_mng_typ_NE(info);
		else if (ne == columnDtlGr_sno3_mng_typ) doDtlGr_sno3_mng_typ_NE(info);
		else if (ne == columnDtlGr_sno4_mng_typ) doDtlGr_sno4_mng_typ_NE(info);
		else if (ne == columnDtlGr_cont_fctr_flg) doDtlGr_cont_fctr_flg_NE(info);
		else if (ne == columnDtlGr_stk_mng_typ) doDtlGr_stk_mng_typ_NE(info);
		else if (ne == columnDtlGr_trd_unit_cd) doDtlGr_trd_unit_cd_NE(info);
		else if (ne == columnDtlGr_trd_unit_nm) doDtlGr_trd_unit_nm_NE(info);
		else if (ne == columnDtlGr_trd_unit_dec_place) doDtlGr_trd_unit_dec_place_NE(info);
		else if (ne == columnDtlGr_trd_unit_rnd_typ) doDtlGr_trd_unit_rnd_typ_NE(info);
		else if (ne == columnDtlGr_trd_unit_conv_base_qty) doDtlGr_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnDtlGr_trd_unit_conv_qty) doDtlGr_trd_unit_conv_qty_NE(info);
		else if (ne == columnDtlGr_base_unit_cd) doDtlGr_base_unit_cd_NE(info);
		else if (ne == columnDtlGr_base_unit_nm) doDtlGr_base_unit_nm_NE(info);
		else if (ne == columnDtlGr_base_unit_dec_place) doDtlGr_base_unit_dec_place_NE(info);
		else if (ne == columnDtlGr_base_unit_conv_rnd_typ) doDtlGr_base_unit_conv_rnd_typ_NE(info);
		else if (ne == columnDtlGr_cont_fctr_rnd_typ) doDtlGr_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnDtlGr_cont_fctr_dec_place) doDtlGr_cont_fctr_dec_place_NE(info);
		else if (ne == columnDtlGr_quality_typ) doDtlGr_quality_typ_NE(info);
		else if (ne == columnDtlGr_quality_typ_nm) doDtlGr_quality_typ_nm_NE(info);
		else if (ne == columnDtlGr_gd_cd) doDtlGr_gd_cd_NE(info);
		else if (ne == columnDtlGr_gd_nm) doDtlGr_gd_nm_NE(info);
		else if (ne == columnDtlGr_stk_id_typ) doDtlGr_stk_id_typ_NE(info);
		else if (ne == columnDtlGr_stk_id_typ_nm) doDtlGr_stk_id_typ_nm_NE(info);
		else if (ne == columnDtlGr_fix_no_typ) doDtlGr_fix_no_typ_NE(info);
		else if (ne == columnDtlGr_fix_no_typ_nm) doDtlGr_fix_no_typ_nm_NE(info);
		else if (ne == columnDtlGr_fix_no) doDtlGr_fix_no_NE(info);
		else if (ne == columnDtlGr_intr_d_rmrks) doDtlGr_intr_d_rmrks_NE(info);
		else if (ne == columnDtlGr_trd_d_rmrks) doDtlGr_trd_d_rmrks_NE(info);
		else if (ne == columnDtlGr_sub_char1) doDtlGr_sub_char1_NE(info);
		else if (ne == columnDtlGr_sub_char2) doDtlGr_sub_char2_NE(info);
		else if (ne == columnDtlGr_sub_char3) doDtlGr_sub_char3_NE(info);
		else if (ne == columnDtlGr_stk_xfr_act_d_no) doDtlGr_stk_xfr_act_d_no_NE(info);
		else if (ne == columnDtlGr_disp_seq) doDtlGr_disp_seq_NE(info);
	}

	/**
	 * [HdrTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_xfr_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_xfr_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[stk_xfr_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_stk_xfr_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_flg_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_site_cd_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[stk_xfr_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_stk_xfr_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[stk_xfr_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_stk_xfr_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_rmrks_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NE(MCEventInfo info){
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
	 * [DtlGi]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[not_new_lot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_not_new_lot_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[lot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_lot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sublot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sublot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[lot_no_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_lot_no_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sublot_no_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sublot_no_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[base_unit_conv_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_base_unit_conv_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_gd_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[stk_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_stk_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[stk_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_stk_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[fix_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_fix_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[fix_no_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_fix_no_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[fix_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_fix_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[stk_xfr_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_stk_xfr_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[not_new_lot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_not_new_lot_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[lot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_lot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sublot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sublot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[lot_no_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_lot_no_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sublot_no_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sublot_no_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[base_unit_conv_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_base_unit_conv_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_gd_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[stk_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_stk_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[stk_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_stk_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[fix_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_fix_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[fix_no_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_fix_no_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[fix_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_fix_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[stk_xfr_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_stk_xfr_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_disp_seq_NE(MCEventInfo info){
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
		else if (nx == DtlGiTable) doDtlGi_NX(info);
		else if (nx == DtlGrTable) doDtlGr_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_stk_xfr_act_no) doCnd_stk_xfr_act_no_NX(info);
		else if (nx == Hdr_trd_cd) doHdr_trd_cd_NX(info);
		else if (nx == Hdr_trd_nm) doHdr_trd_nm_NX(info);
		else if (nx == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NX(info);
		else if (nx == Hdr_stk_xfr_act_no) doHdr_stk_xfr_act_no_NX(info);
		else if (nx == Hdr_prnt_flg) doHdr_prnt_flg_NX(info);
		else if (nx == Hdr_loc_cd) doHdr_loc_cd_NX(info);
		else if (nx == Hdr_loc_nm) doHdr_loc_nm_NX(info);
		else if (nx == Hdr_sppl_cd) doHdr_sppl_cd_NX(info);
		else if (nx == Hdr_site_cd) doHdr_site_cd_NX(info);
		else if (nx == Hdr_wg_cd) doHdr_wg_cd_NX(info);
		else if (nx == Hdr_wg_nm) doHdr_wg_nm_NX(info);
		else if (nx == Hdr_str_ln_tgt_flg) doHdr_str_ln_tgt_flg_NX(info);
		else if (nx == Hdr_stk_xfr_rsn_cd) doHdr_stk_xfr_rsn_cd_NX(info);
		else if (nx == Hdr_stk_xfr_rsn_nm) doHdr_stk_xfr_rsn_nm_NX(info);
		else if (nx == Hdr_intr_rmrks) doHdr_intr_rmrks_NX(info);
		else if (nx == Hdr_trd_rmrks) doHdr_trd_rmrks_NX(info);
		else if (nx == Hdr_sub_char1) doHdr_sub_char1_NX(info);
		else if (nx == Hdr_sub_char2) doHdr_sub_char2_NX(info);
		else if (nx == Hdr_sub_char3) doHdr_sub_char3_NX(info);
		else if (nx == Hdr_upd_cntr) doHdr_upd_cntr_NX(info);
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
		else if (nx == columnDtlGi_sundry_itm_flg) doDtlGi_sundry_itm_flg_NX(info);
		else if (nx == columnDtlGi_not_new_lot_flg) doDtlGi_not_new_lot_flg_NX(info);
		else if (nx == columnDtlGi_lot_mng_typ) doDtlGi_lot_mng_typ_NX(info);
		else if (nx == columnDtlGi_lot_no_typ) doDtlGi_lot_no_typ_NX(info);
		else if (nx == columnDtlGi_sublot_mng_typ) doDtlGi_sublot_mng_typ_NX(info);
		else if (nx == columnDtlGi_sublot_no_typ) doDtlGi_sublot_no_typ_NX(info);
		else if (nx == columnDtlGi_lot_no_ptn_cd) doDtlGi_lot_no_ptn_cd_NX(info);
		else if (nx == columnDtlGi_sublot_no_ptn_cd) doDtlGi_sublot_no_ptn_cd_NX(info);
		else if (nx == columnDtlGi_ver_flg) doDtlGi_ver_flg_NX(info);
		else if (nx == columnDtlGi_sno1_mng_typ) doDtlGi_sno1_mng_typ_NX(info);
		else if (nx == columnDtlGi_sno2_mng_typ) doDtlGi_sno2_mng_typ_NX(info);
		else if (nx == columnDtlGi_sno3_mng_typ) doDtlGi_sno3_mng_typ_NX(info);
		else if (nx == columnDtlGi_sno4_mng_typ) doDtlGi_sno4_mng_typ_NX(info);
		else if (nx == columnDtlGi_cont_fctr_flg) doDtlGi_cont_fctr_flg_NX(info);
		else if (nx == columnDtlGi_stk_mng_typ) doDtlGi_stk_mng_typ_NX(info);
		else if (nx == columnDtlGi_trd_unit_cd) doDtlGi_trd_unit_cd_NX(info);
		else if (nx == columnDtlGi_trd_unit_nm) doDtlGi_trd_unit_nm_NX(info);
		else if (nx == columnDtlGi_trd_unit_dec_place) doDtlGi_trd_unit_dec_place_NX(info);
		else if (nx == columnDtlGi_trd_unit_rnd_typ) doDtlGi_trd_unit_rnd_typ_NX(info);
		else if (nx == columnDtlGi_trd_unit_conv_base_qty) doDtlGi_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnDtlGi_trd_unit_conv_qty) doDtlGi_trd_unit_conv_qty_NX(info);
		else if (nx == columnDtlGi_base_unit_cd) doDtlGi_base_unit_cd_NX(info);
		else if (nx == columnDtlGi_base_unit_nm) doDtlGi_base_unit_nm_NX(info);
		else if (nx == columnDtlGi_base_unit_dec_place) doDtlGi_base_unit_dec_place_NX(info);
		else if (nx == columnDtlGi_base_unit_conv_rnd_typ) doDtlGi_base_unit_conv_rnd_typ_NX(info);
		else if (nx == columnDtlGi_cont_fctr_rnd_typ) doDtlGi_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnDtlGi_cont_fctr_dec_place) doDtlGi_cont_fctr_dec_place_NX(info);
		else if (nx == columnDtlGi_quality_typ) doDtlGi_quality_typ_NX(info);
		else if (nx == columnDtlGi_quality_typ_nm) doDtlGi_quality_typ_nm_NX(info);
		else if (nx == columnDtlGi_gd_cd) doDtlGi_gd_cd_NX(info);
		else if (nx == columnDtlGi_gd_nm) doDtlGi_gd_nm_NX(info);
		else if (nx == columnDtlGi_stk_id_typ) doDtlGi_stk_id_typ_NX(info);
		else if (nx == columnDtlGi_stk_id_typ_nm) doDtlGi_stk_id_typ_nm_NX(info);
		else if (nx == columnDtlGi_fix_no_typ) doDtlGi_fix_no_typ_NX(info);
		else if (nx == columnDtlGi_fix_no_typ_nm) doDtlGi_fix_no_typ_nm_NX(info);
		else if (nx == columnDtlGi_fix_no) doDtlGi_fix_no_NX(info);
		else if (nx == columnDtlGi_intr_d_rmrks) doDtlGi_intr_d_rmrks_NX(info);
		else if (nx == columnDtlGi_trd_d_rmrks) doDtlGi_trd_d_rmrks_NX(info);
		else if (nx == columnDtlGi_sub_char1) doDtlGi_sub_char1_NX(info);
		else if (nx == columnDtlGi_sub_char2) doDtlGi_sub_char2_NX(info);
		else if (nx == columnDtlGi_sub_char3) doDtlGi_sub_char3_NX(info);
		else if (nx == columnDtlGi_stk_xfr_act_d_no) doDtlGi_stk_xfr_act_d_no_NX(info);
		else if (nx == columnDtlGi_disp_seq) doDtlGi_disp_seq_NX(info);
		else if (nx == columnDtlGr_sundry_itm_flg) doDtlGr_sundry_itm_flg_NX(info);
		else if (nx == columnDtlGr_not_new_lot_flg) doDtlGr_not_new_lot_flg_NX(info);
		else if (nx == columnDtlGr_lot_mng_typ) doDtlGr_lot_mng_typ_NX(info);
		else if (nx == columnDtlGr_lot_no_typ) doDtlGr_lot_no_typ_NX(info);
		else if (nx == columnDtlGr_sublot_mng_typ) doDtlGr_sublot_mng_typ_NX(info);
		else if (nx == columnDtlGr_sublot_no_typ) doDtlGr_sublot_no_typ_NX(info);
		else if (nx == columnDtlGr_lot_no_ptn_cd) doDtlGr_lot_no_ptn_cd_NX(info);
		else if (nx == columnDtlGr_sublot_no_ptn_cd) doDtlGr_sublot_no_ptn_cd_NX(info);
		else if (nx == columnDtlGr_ver_flg) doDtlGr_ver_flg_NX(info);
		else if (nx == columnDtlGr_sno1_mng_typ) doDtlGr_sno1_mng_typ_NX(info);
		else if (nx == columnDtlGr_sno2_mng_typ) doDtlGr_sno2_mng_typ_NX(info);
		else if (nx == columnDtlGr_sno3_mng_typ) doDtlGr_sno3_mng_typ_NX(info);
		else if (nx == columnDtlGr_sno4_mng_typ) doDtlGr_sno4_mng_typ_NX(info);
		else if (nx == columnDtlGr_cont_fctr_flg) doDtlGr_cont_fctr_flg_NX(info);
		else if (nx == columnDtlGr_stk_mng_typ) doDtlGr_stk_mng_typ_NX(info);
		else if (nx == columnDtlGr_trd_unit_cd) doDtlGr_trd_unit_cd_NX(info);
		else if (nx == columnDtlGr_trd_unit_nm) doDtlGr_trd_unit_nm_NX(info);
		else if (nx == columnDtlGr_trd_unit_dec_place) doDtlGr_trd_unit_dec_place_NX(info);
		else if (nx == columnDtlGr_trd_unit_rnd_typ) doDtlGr_trd_unit_rnd_typ_NX(info);
		else if (nx == columnDtlGr_trd_unit_conv_base_qty) doDtlGr_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnDtlGr_trd_unit_conv_qty) doDtlGr_trd_unit_conv_qty_NX(info);
		else if (nx == columnDtlGr_base_unit_cd) doDtlGr_base_unit_cd_NX(info);
		else if (nx == columnDtlGr_base_unit_nm) doDtlGr_base_unit_nm_NX(info);
		else if (nx == columnDtlGr_base_unit_dec_place) doDtlGr_base_unit_dec_place_NX(info);
		else if (nx == columnDtlGr_base_unit_conv_rnd_typ) doDtlGr_base_unit_conv_rnd_typ_NX(info);
		else if (nx == columnDtlGr_cont_fctr_rnd_typ) doDtlGr_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnDtlGr_cont_fctr_dec_place) doDtlGr_cont_fctr_dec_place_NX(info);
		else if (nx == columnDtlGr_quality_typ) doDtlGr_quality_typ_NX(info);
		else if (nx == columnDtlGr_quality_typ_nm) doDtlGr_quality_typ_nm_NX(info);
		else if (nx == columnDtlGr_gd_cd) doDtlGr_gd_cd_NX(info);
		else if (nx == columnDtlGr_gd_nm) doDtlGr_gd_nm_NX(info);
		else if (nx == columnDtlGr_stk_id_typ) doDtlGr_stk_id_typ_NX(info);
		else if (nx == columnDtlGr_stk_id_typ_nm) doDtlGr_stk_id_typ_nm_NX(info);
		else if (nx == columnDtlGr_fix_no_typ) doDtlGr_fix_no_typ_NX(info);
		else if (nx == columnDtlGr_fix_no_typ_nm) doDtlGr_fix_no_typ_nm_NX(info);
		else if (nx == columnDtlGr_fix_no) doDtlGr_fix_no_NX(info);
		else if (nx == columnDtlGr_intr_d_rmrks) doDtlGr_intr_d_rmrks_NX(info);
		else if (nx == columnDtlGr_trd_d_rmrks) doDtlGr_trd_d_rmrks_NX(info);
		else if (nx == columnDtlGr_sub_char1) doDtlGr_sub_char1_NX(info);
		else if (nx == columnDtlGr_sub_char2) doDtlGr_sub_char2_NX(info);
		else if (nx == columnDtlGr_sub_char3) doDtlGr_sub_char3_NX(info);
		else if (nx == columnDtlGr_stk_xfr_act_d_no) doDtlGr_stk_xfr_act_d_no_NX(info);
		else if (nx == columnDtlGr_disp_seq) doDtlGr_disp_seq_NX(info);
	}

	/**
	 * [HdrTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_xfr_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_xfr_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[stk_xfr_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_stk_xfr_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_flg_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_site_cd_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[stk_xfr_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_stk_xfr_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[stk_xfr_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_stk_xfr_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_rmrks_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NX(MCEventInfo info){
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
	 * [DtlGi]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[not_new_lot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_not_new_lot_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[lot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_lot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sublot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sublot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[lot_no_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_lot_no_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sublot_no_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sublot_no_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[base_unit_conv_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_base_unit_conv_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_gd_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[stk_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_stk_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[stk_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_stk_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[fix_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_fix_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[fix_no_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_fix_no_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[fix_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_fix_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[stk_xfr_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_stk_xfr_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[not_new_lot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_not_new_lot_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[lot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_lot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sublot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sublot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[lot_no_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_lot_no_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sublot_no_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sublot_no_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[base_unit_conv_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_base_unit_conv_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_gd_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[stk_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_stk_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[stk_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_stk_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[fix_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_fix_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[fix_no_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_fix_no_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[fix_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_fix_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[stk_xfr_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_stk_xfr_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_stk_xfr_act_no) doCnd_stk_xfr_act_no_LC(info);
		else if (lc == Hdr_trd_cd) doHdr_trd_cd_LC(info);
		else if (lc == Hdr_trd_nm) doHdr_trd_nm_LC(info);
		else if (lc == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_LC(info);
		else if (lc == Hdr_stk_xfr_act_no) doHdr_stk_xfr_act_no_LC(info);
		else if (lc == Hdr_loc_cd) doHdr_loc_cd_LC(info);
		else if (lc == Hdr_loc_nm) doHdr_loc_nm_LC(info);
		else if (lc == Hdr_sppl_cd) doHdr_sppl_cd_LC(info);
		else if (lc == Hdr_site_cd) doHdr_site_cd_LC(info);
		else if (lc == Hdr_wg_cd) doHdr_wg_cd_LC(info);
		else if (lc == Hdr_wg_nm) doHdr_wg_nm_LC(info);
		else if (lc == Hdr_stk_xfr_rsn_cd) doHdr_stk_xfr_rsn_cd_LC(info);
		else if (lc == Hdr_stk_xfr_rsn_nm) doHdr_stk_xfr_rsn_nm_LC(info);
		else if (lc == Hdr_intr_rmrks) doHdr_intr_rmrks_LC(info);
		else if (lc == Hdr_trd_rmrks) doHdr_trd_rmrks_LC(info);
		else if (lc == Hdr_sub_char1) doHdr_sub_char1_LC(info);
		else if (lc == Hdr_sub_char2) doHdr_sub_char2_LC(info);
		else if (lc == Hdr_sub_char3) doHdr_sub_char3_LC(info);
		else if (lc == Hdr_upd_cntr) doHdr_upd_cntr_LC(info);
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
		else if (lc == columnDtlGi_lot_mng_typ) doDtlGi_lot_mng_typ_LC(info);
		else if (lc == columnDtlGi_lot_no_typ) doDtlGi_lot_no_typ_LC(info);
		else if (lc == columnDtlGi_sublot_mng_typ) doDtlGi_sublot_mng_typ_LC(info);
		else if (lc == columnDtlGi_sublot_no_typ) doDtlGi_sublot_no_typ_LC(info);
		else if (lc == columnDtlGi_lot_no_ptn_cd) doDtlGi_lot_no_ptn_cd_LC(info);
		else if (lc == columnDtlGi_sublot_no_ptn_cd) doDtlGi_sublot_no_ptn_cd_LC(info);
		else if (lc == columnDtlGi_sno1_mng_typ) doDtlGi_sno1_mng_typ_LC(info);
		else if (lc == columnDtlGi_sno2_mng_typ) doDtlGi_sno2_mng_typ_LC(info);
		else if (lc == columnDtlGi_sno3_mng_typ) doDtlGi_sno3_mng_typ_LC(info);
		else if (lc == columnDtlGi_sno4_mng_typ) doDtlGi_sno4_mng_typ_LC(info);
		else if (lc == columnDtlGi_stk_mng_typ) doDtlGi_stk_mng_typ_LC(info);
		else if (lc == columnDtlGi_trd_unit_cd) doDtlGi_trd_unit_cd_LC(info);
		else if (lc == columnDtlGi_trd_unit_nm) doDtlGi_trd_unit_nm_LC(info);
		else if (lc == columnDtlGi_trd_unit_dec_place) doDtlGi_trd_unit_dec_place_LC(info);
		else if (lc == columnDtlGi_trd_unit_rnd_typ) doDtlGi_trd_unit_rnd_typ_LC(info);
		else if (lc == columnDtlGi_trd_unit_conv_base_qty) doDtlGi_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnDtlGi_trd_unit_conv_qty) doDtlGi_trd_unit_conv_qty_LC(info);
		else if (lc == columnDtlGi_base_unit_cd) doDtlGi_base_unit_cd_LC(info);
		else if (lc == columnDtlGi_base_unit_nm) doDtlGi_base_unit_nm_LC(info);
		else if (lc == columnDtlGi_base_unit_dec_place) doDtlGi_base_unit_dec_place_LC(info);
		else if (lc == columnDtlGi_base_unit_conv_rnd_typ) doDtlGi_base_unit_conv_rnd_typ_LC(info);
		else if (lc == columnDtlGi_cont_fctr_rnd_typ) doDtlGi_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnDtlGi_cont_fctr_dec_place) doDtlGi_cont_fctr_dec_place_LC(info);
		else if (lc == columnDtlGi_quality_typ) doDtlGi_quality_typ_LC(info);
		else if (lc == columnDtlGi_quality_typ_nm) doDtlGi_quality_typ_nm_LC(info);
		else if (lc == columnDtlGi_gd_cd) doDtlGi_gd_cd_LC(info);
		else if (lc == columnDtlGi_gd_nm) doDtlGi_gd_nm_LC(info);
		else if (lc == columnDtlGi_stk_id_typ) doDtlGi_stk_id_typ_LC(info);
		else if (lc == columnDtlGi_stk_id_typ_nm) doDtlGi_stk_id_typ_nm_LC(info);
		else if (lc == columnDtlGi_fix_no_typ) doDtlGi_fix_no_typ_LC(info);
		else if (lc == columnDtlGi_fix_no_typ_nm) doDtlGi_fix_no_typ_nm_LC(info);
		else if (lc == columnDtlGi_fix_no) doDtlGi_fix_no_LC(info);
		else if (lc == columnDtlGi_intr_d_rmrks) doDtlGi_intr_d_rmrks_LC(info);
		else if (lc == columnDtlGi_trd_d_rmrks) doDtlGi_trd_d_rmrks_LC(info);
		else if (lc == columnDtlGi_sub_char1) doDtlGi_sub_char1_LC(info);
		else if (lc == columnDtlGi_sub_char2) doDtlGi_sub_char2_LC(info);
		else if (lc == columnDtlGi_sub_char3) doDtlGi_sub_char3_LC(info);
		else if (lc == columnDtlGi_stk_xfr_act_d_no) doDtlGi_stk_xfr_act_d_no_LC(info);
		else if (lc == columnDtlGi_disp_seq) doDtlGi_disp_seq_LC(info);
		else if (lc == columnDtlGr_lot_mng_typ) doDtlGr_lot_mng_typ_LC(info);
		else if (lc == columnDtlGr_lot_no_typ) doDtlGr_lot_no_typ_LC(info);
		else if (lc == columnDtlGr_sublot_mng_typ) doDtlGr_sublot_mng_typ_LC(info);
		else if (lc == columnDtlGr_sublot_no_typ) doDtlGr_sublot_no_typ_LC(info);
		else if (lc == columnDtlGr_lot_no_ptn_cd) doDtlGr_lot_no_ptn_cd_LC(info);
		else if (lc == columnDtlGr_sublot_no_ptn_cd) doDtlGr_sublot_no_ptn_cd_LC(info);
		else if (lc == columnDtlGr_sno1_mng_typ) doDtlGr_sno1_mng_typ_LC(info);
		else if (lc == columnDtlGr_sno2_mng_typ) doDtlGr_sno2_mng_typ_LC(info);
		else if (lc == columnDtlGr_sno3_mng_typ) doDtlGr_sno3_mng_typ_LC(info);
		else if (lc == columnDtlGr_sno4_mng_typ) doDtlGr_sno4_mng_typ_LC(info);
		else if (lc == columnDtlGr_stk_mng_typ) doDtlGr_stk_mng_typ_LC(info);
		else if (lc == columnDtlGr_trd_unit_cd) doDtlGr_trd_unit_cd_LC(info);
		else if (lc == columnDtlGr_trd_unit_nm) doDtlGr_trd_unit_nm_LC(info);
		else if (lc == columnDtlGr_trd_unit_dec_place) doDtlGr_trd_unit_dec_place_LC(info);
		else if (lc == columnDtlGr_trd_unit_rnd_typ) doDtlGr_trd_unit_rnd_typ_LC(info);
		else if (lc == columnDtlGr_trd_unit_conv_base_qty) doDtlGr_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnDtlGr_trd_unit_conv_qty) doDtlGr_trd_unit_conv_qty_LC(info);
		else if (lc == columnDtlGr_base_unit_cd) doDtlGr_base_unit_cd_LC(info);
		else if (lc == columnDtlGr_base_unit_nm) doDtlGr_base_unit_nm_LC(info);
		else if (lc == columnDtlGr_base_unit_dec_place) doDtlGr_base_unit_dec_place_LC(info);
		else if (lc == columnDtlGr_base_unit_conv_rnd_typ) doDtlGr_base_unit_conv_rnd_typ_LC(info);
		else if (lc == columnDtlGr_cont_fctr_rnd_typ) doDtlGr_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnDtlGr_cont_fctr_dec_place) doDtlGr_cont_fctr_dec_place_LC(info);
		else if (lc == columnDtlGr_quality_typ) doDtlGr_quality_typ_LC(info);
		else if (lc == columnDtlGr_quality_typ_nm) doDtlGr_quality_typ_nm_LC(info);
		else if (lc == columnDtlGr_gd_cd) doDtlGr_gd_cd_LC(info);
		else if (lc == columnDtlGr_gd_nm) doDtlGr_gd_nm_LC(info);
		else if (lc == columnDtlGr_stk_id_typ) doDtlGr_stk_id_typ_LC(info);
		else if (lc == columnDtlGr_stk_id_typ_nm) doDtlGr_stk_id_typ_nm_LC(info);
		else if (lc == columnDtlGr_fix_no_typ) doDtlGr_fix_no_typ_LC(info);
		else if (lc == columnDtlGr_fix_no_typ_nm) doDtlGr_fix_no_typ_nm_LC(info);
		else if (lc == columnDtlGr_fix_no) doDtlGr_fix_no_LC(info);
		else if (lc == columnDtlGr_intr_d_rmrks) doDtlGr_intr_d_rmrks_LC(info);
		else if (lc == columnDtlGr_trd_d_rmrks) doDtlGr_trd_d_rmrks_LC(info);
		else if (lc == columnDtlGr_sub_char1) doDtlGr_sub_char1_LC(info);
		else if (lc == columnDtlGr_sub_char2) doDtlGr_sub_char2_LC(info);
		else if (lc == columnDtlGr_sub_char3) doDtlGr_sub_char3_LC(info);
		else if (lc == columnDtlGr_stk_xfr_act_d_no) doDtlGr_stk_xfr_act_d_no_LC(info);
		else if (lc == columnDtlGr_disp_seq) doDtlGr_disp_seq_LC(info);
	}

	/**
	 * [Cnd]パネルの[stk_xfr_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_xfr_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[stk_xfr_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_stk_xfr_act_no_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_site_cd_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[stk_xfr_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_stk_xfr_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[stk_xfr_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_stk_xfr_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_rmrks_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_LC(MCEventInfo info){
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
	 * [DtlGi]パネルの[lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[lot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_lot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sublot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sublot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[lot_no_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_lot_no_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sublot_no_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sublot_no_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[base_unit_conv_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_base_unit_conv_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_gd_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[stk_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_stk_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[stk_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_stk_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[fix_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_fix_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[fix_no_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_fix_no_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[fix_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_fix_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[stk_xfr_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_stk_xfr_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlGi]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGi_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[lot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_lot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sublot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sublot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[lot_no_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_lot_no_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sublot_no_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sublot_no_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[base_unit_conv_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_base_unit_conv_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_gd_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[stk_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_stk_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[stk_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_stk_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[fix_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_fix_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[fix_no_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_fix_no_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[fix_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_fix_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[stk_xfr_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_stk_xfr_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlGr]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlGr_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Hdr_trd_cd]の作成メソッド
	 */
	public MCList getHdr_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_loc_cd]の作成メソッド
	 */
	public MCList getHdr_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getHdr_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_stk_xfr_rsn_cd]の作成メソッド
	 */
	public MCList getHdr_stk_xfr_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkXfrBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[DtlGi_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getDtlGi_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[DtlGi_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getDtlGi_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[DtlGi_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getDtlGi_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[DtlGi_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getDtlGi_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[DtlGi_lot_no_p_PPanel_columnLotNo_lot_no]の作成メソッド
	 */
	public MCList getDtlGi_lot_no_p_PPanel_columnLotNo_lot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getLotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[DtlGi_lot_no_p_PPanel_columnLotNo_sublot_no]の作成メソッド
	 */
	public MCList getDtlGi_lot_no_p_PPanel_columnLotNo_sublot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getSublotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlGi_trd_unit_cd]の作成メソッド
	 */
	public MCList getDtlGi_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlGi_quality_typ]の作成メソッド
	 */
	public MCList getDtlGi_quality_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getQualityTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlGi_gd_cd]の作成メソッド
	 */
	public MCList getDtlGi_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkGd(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlGi_stk_id_typ]の作成メソッド
	 */
	public MCList getDtlGi_stk_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getStkIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlGi_fix_no_typ]の作成メソッド
	 */
	public MCList getDtlGi_fix_no_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getFixNoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[DtlGr_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getDtlGr_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[DtlGr_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getDtlGr_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[DtlGr_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getDtlGr_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[DtlGr_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getDtlGr_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[DtlGr_lot_no_p_PPanel_columnLotNo_lot_no]の作成メソッド
	 */
	public MCList getDtlGr_lot_no_p_PPanel_columnLotNo_lot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getLotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[DtlGr_lot_no_p_PPanel_columnLotNo_sublot_no]の作成メソッド
	 */
	public MCList getDtlGr_lot_no_p_PPanel_columnLotNo_sublot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getSublotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlGr_trd_unit_cd]の作成メソッド
	 */
	public MCList getDtlGr_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlGr_quality_typ]の作成メソッド
	 */
	public MCList getDtlGr_quality_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getQualityTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlGr_gd_cd]の作成メソッド
	 */
	public MCList getDtlGr_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkGd(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlGr_stk_id_typ]の作成メソッド
	 */
	public MCList getDtlGr_stk_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getStkIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlGr_fix_no_typ]の作成メソッド
	 */
	public MCList getDtlGr_fix_no_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getFixNoTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL2520.Srch01")) {
			return new MS_MSBEL2520_Srch01Bridge();
		}
		if (id.equals("MS.MSBEL2520.Ins01")) {
			return new MS_MSBEL2520_Ins01Bridge();
		}
		if (id.equals("MS.MSBEL2520.Upd01")) {
			return new MS_MSBEL2520_Upd01Bridge();
		}
		if (id.equals("MS.MSBEL2520.Del01")) {
			return new MS_MSBEL2520_Del01Bridge();
		}
		if (id.equals("MS.MSBEL2520.Prnt01")) {
			return new MS_MSBEL2520_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL2520_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2520_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2520_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL2520_Srch01Bridge() {
			p_MS_MSBEL2520_Srch01 = new MCParam(PDef.MS_MSBEL2520_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2520_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2520.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP2520.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.class));

			p_MS_MSBEL2520_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2520_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2520_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2520_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2520_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2520.CndR up0() {
			return (mcframe.clientMSBE.MSBEP2520.CndR)up(0);
		}

		protected mcframe.clientMSBE.MSBEP2520.HdrR down0() {
			return (mcframe.clientMSBE.MSBEP2520.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR>)down(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR> down2() {
			return (MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2520_Srch01.addDownBlock(mcframe.clientMSBE.MSBEP2520.HdrR.create());
			p_MS_MSBEL2520_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.class));
			p_MS_MSBEL2520_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2520_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBE.MSBEP2520.HdrR)p_MS_MSBEL2520_Srch01.getContainerParam().getDownBlock(0));
			setDtlGiL((MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR>)p_MS_MSBEL2520_Srch01.getContainerParam().getDownBlock(1));
			setDtlGrL((MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR>)p_MS_MSBEL2520_Srch01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlGiL().clear();
			getDtlGrL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlGiL());
			result.add(getDtlGrL());
			return result;
		}
	}
	/**
	 * [MS_MSBEL2520_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2520_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2520_Ins01;

		/** コンストラクタ */
		protected MS_MSBEL2520_Ins01Bridge() {
			p_MS_MSBEL2520_Ins01 = new MCParam(PDef.MS_MSBEL2520_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2520_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2520.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP2520.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.class));

			p_MS_MSBEL2520_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2520_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2520_Ins01.addUpBlock(getHdrR());
			p_MS_MSBEL2520_Ins01.addUpBlock(getDtlGiL().shallowClone());
			p_MS_MSBEL2520_Ins01.addUpBlock(getDtlGrL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2520_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2520_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2520.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP2520.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR>)up(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR> up2() {
			return (MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR>)up(2);
		}

		protected mcframe.clientMSBE.MSBEP2520.HdrR down0() {
			return (mcframe.clientMSBE.MSBEP2520.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR>)down(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR> down2() {
			return (MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2520_Ins01.addDownBlock(mcframe.clientMSBE.MSBEP2520.HdrR.create());
			p_MS_MSBEL2520_Ins01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.class));
			p_MS_MSBEL2520_Ins01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2520_Ins01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBE.MSBEP2520.HdrR)p_MS_MSBEL2520_Ins01.getContainerParam().getDownBlock(0));
			setDtlGiL((MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR>)p_MS_MSBEL2520_Ins01.getContainerParam().getDownBlock(1));
			setDtlGrL((MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR>)p_MS_MSBEL2520_Ins01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlGiL().clear();
			getDtlGrL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlGiL());
			result.add(getDtlGrL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlGiL());
			result.add(getDtlGrL());
			return result;
		}
	}
	/**
	 * [MS_MSBEL2520_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2520_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2520_Upd01;

		/** コンストラクタ */
		protected MS_MSBEL2520_Upd01Bridge() {
			p_MS_MSBEL2520_Upd01 = new MCParam(PDef.MS_MSBEL2520_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2520_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2520.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP2520.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.class));

			p_MS_MSBEL2520_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2520_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2520_Upd01.addUpBlock(getHdrR());
			p_MS_MSBEL2520_Upd01.addUpBlock(getDtlGiL().shallowClone());
			p_MS_MSBEL2520_Upd01.addUpBlock(getDtlGrL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2520_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2520_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2520.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP2520.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR>)up(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR> up2() {
			return (MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR>)up(2);
		}

		protected mcframe.clientMSBE.MSBEP2520.HdrR down0() {
			return (mcframe.clientMSBE.MSBEP2520.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR>)down(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR> down2() {
			return (MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2520_Upd01.addDownBlock(mcframe.clientMSBE.MSBEP2520.HdrR.create());
			p_MS_MSBEL2520_Upd01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.class));
			p_MS_MSBEL2520_Upd01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2520.DtlGiR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2520_Upd01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBE.MSBEP2520.HdrR)p_MS_MSBEL2520_Upd01.getContainerParam().getDownBlock(0));
			setDtlGiL((MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR>)p_MS_MSBEL2520_Upd01.getContainerParam().getDownBlock(1));
			setDtlGrL((MCList<mcframe.clientMSBE.MSBEP2520.DtlGiR>)p_MS_MSBEL2520_Upd01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlGiL().clear();
			getDtlGrL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlGiL());
			result.add(getDtlGrL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlGiL());
			result.add(getDtlGrL());
			return result;
		}
	}
	/**
	 * [MS_MSBEL2520_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2520_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2520_Del01;

		/** コンストラクタ */
		protected MS_MSBEL2520_Del01Bridge() {
			p_MS_MSBEL2520_Del01 = new MCParam(PDef.MS_MSBEL2520_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2520_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2520.HdrR.create());
			// Down

			p_MS_MSBEL2520_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2520_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2520_Del01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2520_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2520_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2520.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP2520.HdrR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBEL2520_Del01;
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
	 * [MS_MSBEL2520_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2520_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2520_Prnt01;

		/** コンストラクタ */
		protected MS_MSBEL2520_Prnt01Bridge() {
			p_MS_MSBEL2520_Prnt01 = new MCParam(PDef.MS_MSBEL2520_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2520_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2520.HdrR.create());
			// Down

			p_MS_MSBEL2520_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2520_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2520_Prnt01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2520_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2520_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2520.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP2520.HdrR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBEL2520_Prnt01;
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