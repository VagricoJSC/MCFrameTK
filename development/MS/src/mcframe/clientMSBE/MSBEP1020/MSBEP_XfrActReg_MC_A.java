package mcframe.clientMSBE.MSBEP1020;

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
import mcframe.clientMSBE.MSBEP1020.MSBEP_XfrActReg_MC.MS_MSBEL1020_Srch01Caller;
import mcframe.clientMSBE.MSBEP1020.MSBEP_XfrActReg_MC.MS_MSBEL1020_Srch02Caller;
import mcframe.clientMSBE.MSBEP1020.MSBEP_XfrActReg_MC.MS_MSBEL1020_Ins01Caller;
import mcframe.clientMSBE.MSBEP1020.MSBEP_XfrActReg_MC.MS_MSBEL1020_Upd01Caller;
import mcframe.clientMSBE.MSBEP1020.MSBEP_XfrActReg_MC.MS_MSBEL1020_Del01Caller;
import mcframe.clientMSBE.MSBEP1020.MSBEP_XfrActReg_MC.MS_MSBEL1020_Prnt01Caller;
import mcframe.clientMSBE.MSBEP1020.MSBEP_XfrActReg_MC.MS_MSBEL1020_Sprt01Caller;

/**
 * 画面"MSBEP_XfrActReg"パネルクラスです。<p>
 *
 * 移動指図をもとに移動実績を登録、あるいは計画外の移動実績を登録します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_XfrActReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBEP1020";

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
	 * INS,Create,0;UPD,Modify,1;DEL,Cancel,2;REF,View,3 INS,登録する,0;UPD,訂正する,1;DEL,取り消す,2;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_srch_tgt_typ_nm_Label = null;
	/**
	 * Search target type name 検索対象区分名.<p>
	 *
	 */
	public MCTextComboBox Cnd_srch_tgt_typ_nm = null;
	/**
	 * Search target type 検索対象区分.<p>
	 *
	 */
	public MCTextField Cnd_srch_tgt_typ = null;
	/**
	 * Search target No. 検索対象ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_srch_tgt_no = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch_inst = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch_act = null;
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
	public MCLabel Hdr_xfr_act_no_Label = null;
	/**
	 * Movement result No. 移動実績ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_xfr_act_no = null;
	public MCLabel Hdr_xfr_inst_no_Label = null;
	/**
	 * Movement order No. 移動指図ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_xfr_inst_no = null;
	public MCLabel Hdr_gr_loc_cd_Label = null;
	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_gr_loc_cd = null;
	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public MCTextField Hdr_gr_loc_nm = null;
	/**
	 * For GR rack/line 入庫棚・ライン対象.<p>
	 *
	 */
	public MCCheckBox Hdr_gr_str_ln_tgt_flg = null;
	/**
	 * GR factory/distribution warehouse cd. 入庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_gr_site_cd = null;
	public MCLabel Hdr_wg_cd_Label = null;
	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_wg_cd = null;
	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public MCTextField Hdr_wg_nm = null;
	public MCLabel Hdr_lg_grp_cd_Label = null;
	/**
	 * Distribution G cd. 物流ＧＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_lg_grp_cd = null;
	/**
	 * Distribution G name 物流Ｇ名.<p>
	 *
	 */
	public MCTextField Hdr_lg_grp_nm = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_sppl_cd = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_cur_cd = null;
	/**
	 * Chargeable supplier 有償支給先.<p>
	 *
	 */
	public MCCheckBox Hdr_onr_prsppl_flg = null;
	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public MCTextField Hdr_prov_basis_typ = null;
	public mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H Hdr_xfr_dt_p_PPanel;
	public MCDateField Hdr_xfr_dt;	// [Hdr]の[xfr_dt_p.ac_dt]を[Hdr_xfr_dt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H Hdr_ac_dt_p_PPanel;
	public MCDateField Hdr_ac_dt;	// [Hdr]の[ac_dt_p.ac_dt]を[Hdr_ac_dt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H Hdr_can_ac_dt_p_PPanel;
	public MCDateField Hdr_can_ac_dt_for_input;	// [Hdr]の[can_ac_dt_p.can_ac_dt_for_input]を[Hdr_can_ac_dt_for_input]としてエイリアス定義。
	public MCDateField Hdr_can_ac_dt;	// [Hdr]の[can_ac_dt_p.can_ac_dt_for_call]を[Hdr_can_ac_dt]としてエイリアス定義。
	public MCDateField Hdr_ac_dt_after_srch;	// [Hdr]の[can_ac_dt_p.ac_dt_after_srch]を[Hdr_ac_dt_after_srch]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H Hdr_act_usr_dpt_p_PPanel;
	public MCTextField Hdr_act_usr_cd;	// [Hdr]の[act_usr_dpt_p.usr_cd]を[Hdr_act_usr_cd]としてエイリアス定義。
	public MCTextField Hdr_act_usr_nm;	// [Hdr]の[act_usr_dpt_p.usr_nm]を[Hdr_act_usr_nm]としてエイリアス定義。
	public MCTextComboBox Hdr_act_dpt_cd;	// [Hdr]の[act_usr_dpt_p.dpt_cd]を[Hdr_act_dpt_cd]としてエイリアス定義。
	public MCTextField Hdr_act_dpt_nm;	// [Hdr]の[act_usr_dpt_p.dpt_nm]を[Hdr_act_dpt_nm]としてエイリアス定義。
	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public MCCheckBox Hdr_immd_dlv_prnt_flg = null;
	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public MCCheckBox Hdr_dlv_prnt_flg = null;
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
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP1020.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pr_sts_typ = null;
	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pr_sts_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asset_mng_typ = null;
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_mng_typ = null;
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_mng_typ = null;
	public mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D Dtl_lot_no_p_PPanel;
	public MCColumnConfig columnDtl_crt_lot_flg;// [Dtl]の[lot_no_p.crt_lot_flg]を[columnDtl_crt_lot_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_lot_no;// [Dtl]の[lot_no_p.lot_no]を[columnDtl_lot_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_sublot_no;// [Dtl]の[lot_no_p.sublot_no]を[columnDtl_sublot_no]としてエイリアス定義。
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ver_flg = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Dtl_ver_no_p_PPanel;
	public MCColumnConfig columnDtl_ver_no;// [Dtl]の[ver_no_p.ver_no]を[columnDtl_ver_no]としてエイリアス定義。
	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_not_lot_mix_flg = null;
	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_not_sublot_mix_flg = null;
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_cd = null;
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_nm = null;
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_dec_place = null;
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_conv_qty = null;
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_rnd_typ = null;
	/**
	 * Base unit conversion base qty. 基準単位換算基準数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_conv_base_qty = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_trd_unit_qty;// [Dtl]の[trd_unit_qty_p.qty]を[columnDtl_trd_unit_qty]としてエイリアス定義。
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public MCColumnConfig columnDtl_abort_flg = null;
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
	 * Base unit denominator qty. 基準単位分母数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_dmn_qty = null;
	/**
	 * Base unit conversion qty. 基準単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_conv_qty = null;
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_base_unit_qty;// [Dtl]の[base_unit_qty_p.qty]を[columnDtl_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_base_unit_act_qty_p_PPanel;
	public MCColumnConfig columnDtl_base_unit_act_qty;// [Dtl]の[base_unit_act_qty_p.qty]を[columnDtl_base_unit_act_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_base_unit_schd_qty_p_PPanel;
	public MCColumnConfig columnDtl_base_unit_schd_qty;// [Dtl]の[base_unit_schd_qty_p.qty]を[columnDtl_base_unit_schd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_base_unit_inst_qty_p_PPanel;
	public MCColumnConfig columnDtl_base_unit_inst_qty;// [Dtl]の[base_unit_inst_qty_p.qty]を[columnDtl_base_unit_inst_qty]としてエイリアス定義。
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_fctr_flg = null;
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D Dtl_cont_fctr_unit_p_PPanel;
	public MCColumnConfig columnDtl_cont_fctr_unit_cd;// [Dtl]の[cont_fctr_unit_p.cont_fctr_unit_cd]を[columnDtl_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_cont_fctr_unit_nm;// [Dtl]の[cont_fctr_unit_p.cont_fctr_unit_nm]を[columnDtl_cont_fctr_unit_nm]としてエイリアス定義。
	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_fctr_dec_place = null;
	/**
	 * Active ingredient unit rounding type 有効成分単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_fctr_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D Dtl_act_cont_fctr_p_PPanel;
	public MCColumnConfig columnDtl_act_cont_fctr;// [Dtl]の[act_cont_fctr_p.act_cont_fctr]を[columnDtl_act_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Dtl_act_cont_qty_p_PPanel;
	public MCColumnConfig columnDtl_act_cont_qty;// [Dtl]の[act_cont_qty_p.cont_qty]を[columnDtl_act_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D Dtl_std_cont_fctr_p_PPanel;
	public MCColumnConfig columnDtl_std_cont_fctr;// [Dtl]の[std_cont_fctr_p.std_cont_fctr]を[columnDtl_std_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Dtl_std_cont_qty_p_PPanel;
	public MCColumnConfig columnDtl_std_cont_qty;// [Dtl]の[std_cont_qty_p.cont_qty]を[columnDtl_std_cont_qty]としてエイリアス定義。
	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gi_loc_cd = null;
	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gi_loc_nm = null;
	/**
	 * For GI rack/line 出庫棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gi_str_ln_tgt_flg = null;
	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gi_site_cd = null;
	/**
	 * GI supplier cd. 出庫発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gi_sppl_cd = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Dtl_gi_str_ln_p_PPanel;
	public MCColumnConfig columnDtl_gi_str_ln_cd;// [Dtl]の[gi_str_ln_p.str_ln_cd]を[columnDtl_gi_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_gi_str_ln_nm;// [Dtl]の[gi_str_ln_p.str_ln_nm]を[columnDtl_gi_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_gi_str_ln_cd_none_flg;// [Dtl]の[gi_str_ln_p.str_ln_cd_none_flg]を[columnDtl_gi_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * For GR rack/line 入庫棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gr_str_ln_tgt_flg = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Dtl_gr_str_ln_p_PPanel;
	public MCColumnConfig columnDtl_gr_str_ln_cd;// [Dtl]の[gr_str_ln_p.str_ln_cd]を[columnDtl_gr_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_gr_str_ln_nm;// [Dtl]の[gr_str_ln_p.str_ln_nm]を[columnDtl_gr_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_gr_str_ln_cd_none_flg;// [Dtl]の[gr_str_ln_p.str_ln_cd_none_flg]を[columnDtl_gr_str_ln_cd_none_flg]としてエイリアス定義。
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
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_mng_typ = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Dtl_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnDtl_sno1;// [Dtl]の[sno_wrk_no_p.sno1]を[columnDtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2;// [Dtl]の[sno_wrk_no_p.sno2]を[columnDtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3;// [Dtl]の[sno_wrk_no_p.sno3]を[columnDtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4;// [Dtl]の[sno_wrk_no_p.sno4]を[columnDtl_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_no;// [Dtl]の[sno_wrk_no_p.wrk_no]を[columnDtl_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_nm;// [Dtl]の[sno_wrk_no_p.wrk_nm]を[columnDtl_wrk_nm]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Dtl_schd_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnDtl_schd_sno1;// [Dtl]の[schd_sno_wrk_no_p.sno1]を[columnDtl_schd_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno1_null_flg;// [Dtl]の[schd_sno_wrk_no_p.sno1_null_flg]を[columnDtl_sno1_null_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_schd_sno2;// [Dtl]の[schd_sno_wrk_no_p.sno2]を[columnDtl_schd_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2_null_flg;// [Dtl]の[schd_sno_wrk_no_p.sno2_null_flg]を[columnDtl_sno2_null_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_schd_sno3;// [Dtl]の[schd_sno_wrk_no_p.sno3]を[columnDtl_schd_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3_null_flg;// [Dtl]の[schd_sno_wrk_no_p.sno3_null_flg]を[columnDtl_sno3_null_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_schd_sno4;// [Dtl]の[schd_sno_wrk_no_p.sno4]を[columnDtl_schd_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4_null_flg;// [Dtl]の[schd_sno_wrk_no_p.sno4_null_flg]を[columnDtl_sno4_null_flg]としてエイリアス定義。
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
	public mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D Dtl_stk_bp_p_PPanel;
	public MCColumnConfig columnDtl_stk_bp_cd;// [Dtl]の[stk_bp_p.stk_bp_cd]を[columnDtl_stk_bp_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_stk_bp_nm;// [Dtl]の[stk_bp_p.stk_bp_nm]を[columnDtl_stk_bp_nm]としてエイリアス定義。
	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gi_stk_arrv_bp_cd = null;
	/**
	 * GI inventory arriving point name 出庫在庫着荷先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gi_stk_arrv_bp_nm = null;
	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rsn_cd = null;
	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rsn_nm = null;
	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public MCColumnConfig columnDtl_acxfr_gi_flg = null;
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_dpt_cd = null;
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_dpt_nm = null;
	/**
	 * Configuration check not required at shipping 出荷時構成チェック不要.<p>
	 *
	 */
	public MCColumnConfig columnDtl_skip_chk_ship_flg = null;
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_typ = null;
	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_typ_nm = null;
	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_basis_typ = null;
	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_basis_typ_nm = null;
	/**
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ret_prov_typ = null;
	/**
	 * Supply type name (Return) 支給区分名（返品）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ret_prov_typ_nm = null;
	/**
	 * Supply recording type (Return) 支給計上区分（返品）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ret_prov_basis_typ = null;
	/**
	 * Supply recording type name (Return) 支給計上区分名（返品）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ret_prov_basis_typ_nm = null;
	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_dlv_slip_no = null;
	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_prov_act_no = null;
	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_ac_dt = null;
	/**
	 * WMS WMS.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wms_flg = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_intr_d_rmrks = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_d_rmrks = null;
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
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xfr_src_typ = null;
	/**
	 * Movement/transport source type name 移動・移送元区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xfr_src_typ_nm = null;
	/**
	 * Source movement/transport No. 移動・移送元ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xfr_src_no = null;
	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xfr_schd_no = null;
	/**
	 * Movement allocation status No. 移動引当状況ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xfr_alloc_sts_no = null;
	/**
	 * Movement order details No. 移動指図明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xfr_inst_d_no = null;
	/**
	 * Movement result details No. 移動実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xfr_act_d_no = null;
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
	 * External movement result No. 外部移動実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_xfr_act_no = null;
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_slip_no = null;
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_slip_d_no = null;
	/**
	 * Schedule supply No. 1 支給予定ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_schd_no = null;
	/**
	 * Schedule supply No. 2 支給予定ＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ret_prov_schd_no = null;
	/**
	 * Supply result No. 1 支給実績ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_act_no = null;
	/**
	 * Supply result No. 2 支給実績ＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ret_prov_act_no = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_disp_seq = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_ptn_typ = null;
	/**
	 * Movement result No. 移動実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xfr_act_no = null;
	/**
	 * Update counter (Result details) 更新カウンタ(実績明細).<p>
	 *
	 */
	public MCColumnConfig columnDtl_act_d_upd_cntr = null;
	/**
	 * Update counter (Movement allocation status) 更新カウンタ(移動引当状況).<p>
	 *
	 */
	public MCColumnConfig columnDtl_alloc_sts_upd_cntr = null;
	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_qty_bef = null;
	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_act_qty_sum = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	public mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H Btn_Btn_open_MSBEP0500_PPanel;
	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public MCButton Btn_prnt_dlv = null;
	/**
	 * Acquire supply date 支給日取得.<p>
	 *
	 */
	public MCButton Btn_sprt_ac_dt = null;
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
	public mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H Btn_menu_move_p_PPanel;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_ins = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_ins_noSchd = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public MCCheckBox Btn_indiv_prnt_flg = null;
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
	/** [INS_INST]モードを表す定数 */
	public static final String INS_INST = "INS_INST";
	/** [FIX_I]モードを表す定数 */
	public static final String FIX_I = "FIX_I";
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
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
	public static final String[] statusArray = new String[]{INS, INS_INST, FIX_I, SRCH, UPD, FIX_U, DEL, FIX_D, REF};
	
	/** [MS_MSBEL1020_Srch01]のCallerの作成 */
	protected MSBEP_XfrActReg_MC.MS_MSBEL1020_Srch01Caller createMS_MSBEL1020_Srch01() {
		MSBEP_XfrActReg_MC.MS_MSBEL1020_Srch01Caller<MSBEP_XfrActReg, MS_MSBEL1020_Srch01Bridge>
		caller = ((MSBEP_XfrActReg_MC)this).new MS_MSBEL1020_Srch01Caller<MSBEP_XfrActReg, MS_MSBEL1020_Srch01Bridge>(
					(MSBEP_XfrActReg)this, new MS_MSBEL1020_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL1020_Srch01]の呼び出し */
	protected void callMS_MSBEL1020_Srch01() {
		MCCaller caller = createMS_MSBEL1020_Srch01();
		caller.exec();
	}
	/** [MS_MSBEL1020_Srch02]のCallerの作成 */
	protected MSBEP_XfrActReg_MC.MS_MSBEL1020_Srch02Caller createMS_MSBEL1020_Srch02() {
		MSBEP_XfrActReg_MC.MS_MSBEL1020_Srch02Caller<MSBEP_XfrActReg, MS_MSBEL1020_Srch02Bridge>
		caller = ((MSBEP_XfrActReg_MC)this).new MS_MSBEL1020_Srch02Caller<MSBEP_XfrActReg, MS_MSBEL1020_Srch02Bridge>(
					(MSBEP_XfrActReg)this, new MS_MSBEL1020_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBEL1020_Srch02]の呼び出し */
	protected void callMS_MSBEL1020_Srch02() {
		MCCaller caller = createMS_MSBEL1020_Srch02();
		caller.exec();
	}
	/** [MS_MSBEL1020_Ins01]のCallerの作成 */
	protected MSBEP_XfrActReg_MC.MS_MSBEL1020_Ins01Caller createMS_MSBEL1020_Ins01() {
		MSBEP_XfrActReg_MC.MS_MSBEL1020_Ins01Caller<MSBEP_XfrActReg, MS_MSBEL1020_Ins01Bridge>
		caller = ((MSBEP_XfrActReg_MC)this).new MS_MSBEL1020_Ins01Caller<MSBEP_XfrActReg, MS_MSBEL1020_Ins01Bridge>(
					(MSBEP_XfrActReg)this, new MS_MSBEL1020_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBEL1020_Ins01]の呼び出し */
	protected void callMS_MSBEL1020_Ins01() {
		MCCaller caller = createMS_MSBEL1020_Ins01();
		caller.exec();
	}
	/** [MS_MSBEL1020_Upd01]のCallerの作成 */
	protected MSBEP_XfrActReg_MC.MS_MSBEL1020_Upd01Caller createMS_MSBEL1020_Upd01() {
		MSBEP_XfrActReg_MC.MS_MSBEL1020_Upd01Caller<MSBEP_XfrActReg, MS_MSBEL1020_Upd01Bridge>
		caller = ((MSBEP_XfrActReg_MC)this).new MS_MSBEL1020_Upd01Caller<MSBEP_XfrActReg, MS_MSBEL1020_Upd01Bridge>(
					(MSBEP_XfrActReg)this, new MS_MSBEL1020_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBEL1020_Upd01]の呼び出し */
	protected void callMS_MSBEL1020_Upd01() {
		MCCaller caller = createMS_MSBEL1020_Upd01();
		caller.exec();
	}
	/** [MS_MSBEL1020_Del01]のCallerの作成 */
	protected MSBEP_XfrActReg_MC.MS_MSBEL1020_Del01Caller createMS_MSBEL1020_Del01() {
		MSBEP_XfrActReg_MC.MS_MSBEL1020_Del01Caller<MSBEP_XfrActReg, MS_MSBEL1020_Del01Bridge>
		caller = ((MSBEP_XfrActReg_MC)this).new MS_MSBEL1020_Del01Caller<MSBEP_XfrActReg, MS_MSBEL1020_Del01Bridge>(
					(MSBEP_XfrActReg)this, new MS_MSBEL1020_Del01Bridge());
		return caller;
	}
	/** [MS_MSBEL1020_Del01]の呼び出し */
	protected void callMS_MSBEL1020_Del01() {
		MCCaller caller = createMS_MSBEL1020_Del01();
		caller.exec();
	}
	/** [MS_MSBEL1020_Prnt01]のCallerの作成 */
	protected MSBEP_XfrActReg_MC.MS_MSBEL1020_Prnt01Caller createMS_MSBEL1020_Prnt01() {
		MSBEP_XfrActReg_MC.MS_MSBEL1020_Prnt01Caller<MSBEP_XfrActReg, MS_MSBEL1020_Prnt01Bridge>
		caller = ((MSBEP_XfrActReg_MC)this).new MS_MSBEL1020_Prnt01Caller<MSBEP_XfrActReg, MS_MSBEL1020_Prnt01Bridge>(
					(MSBEP_XfrActReg)this, new MS_MSBEL1020_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBEL1020_Prnt01]の呼び出し */
	protected void callMS_MSBEL1020_Prnt01() {
		MCCaller caller = createMS_MSBEL1020_Prnt01();
		caller.exec();
	}
	/** [MS_MSBEL1020_Sprt01]のCallerの作成 */
	protected MSBEP_XfrActReg_MC.MS_MSBEL1020_Sprt01Caller createMS_MSBEL1020_Sprt01() {
		MSBEP_XfrActReg_MC.MS_MSBEL1020_Sprt01Caller<MSBEP_XfrActReg, MS_MSBEL1020_Sprt01Bridge>
		caller = ((MSBEP_XfrActReg_MC)this).new MS_MSBEL1020_Sprt01Caller<MSBEP_XfrActReg, MS_MSBEL1020_Sprt01Bridge>(
					(MSBEP_XfrActReg)this, new MS_MSBEL1020_Sprt01Bridge());
		return caller;
	}
	/** [MS_MSBEL1020_Sprt01]の呼び出し */
	protected void callMS_MSBEL1020_Sprt01() {
		MCCaller caller = createMS_MSBEL1020_Sprt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1020.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1020.HdrR aHdrR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1020.DtlR> aDtlL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1020.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP1020.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1020.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1020.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP1020.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBE.MSBEP1020.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBE.MSBEP1020.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBE.MSBEP1020.HdrR createHdrR() {
		return mcframe.clientMSBE.MSBEP1020.HdrR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBE.MSBEP1020.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1020.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBE.MSBEP1020.DtlR createDtlR() {
		return mcframe.clientMSBE.MSBEP1020.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1020.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1020.DtlR.class);
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
	public void setBtnR(mcframe.clientMSBE.MSBEP1020.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBE.MSBEP1020.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBE.MSBEP1020.BtnR createBtnR() {
		return mcframe.clientMSBE.MSBEP1020.BtnR.create();
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
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_XfrActReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_XfrActReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
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
		MSBEP_XfrActReg_MC.jbCreateScreenOpe((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.jbCreateCnd((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.jbCreateHdrTab((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.jbCreateHdr((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.jbCreateHdr2((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.jbCreateDtl((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.jbCreateBtn((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.jbCreateEastBtn((MSBEP_XfrActReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBEP_XfrActReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_XfrActReg p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBEP_XfrActReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBEP_XfrActReg p) {
		p.Hdr_xfr_dt_p_PPanel = mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.create(p.getHdrR().xfr_dt_p());
		p.Hdr_xfr_dt_p_PPanel.setName("Hdr.xfr_dt_p");
		p.Hdr_xfr_dt = p.Hdr_xfr_dt_p_PPanel.AcDt_ac_dt;
		p.Hdr_xfr_dt.addAliasName("Hdr.xfr_dt", p);
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
	}

	/**
	 * [Hdr2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr2(MSBEP_XfrActReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBEP_XfrActReg p) {
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP1020.DtlR.$itm_p);
		p.Dtl_itm_p_PPanel.setName("Dtl.itm_p");
		p.columnDtl_itm_cd = p.Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl_itm_cd.addAliasName("Dtl.itm_cd", p);
		p.columnDtl_itm_sub1 = p.Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl_itm_sub1.addAliasName("Dtl.itm_sub1", p);
		p.columnDtl_itm_sub2 = p.Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl_itm_sub2.addAliasName("Dtl.itm_sub2", p);
		p.columnDtl_itm_sub3 = p.Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl_itm_sub3.addAliasName("Dtl.itm_sub3", p);
		p.columnDtl_itm_nm = p.Dtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl_itm_nm.addAliasName("Dtl.itm_nm", p);
		p.Dtl_lot_no_p_PPanel = mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.create(mcframe.clientMSBE.MSBEP1020.DtlR.$lot_no_p);
		p.Dtl_lot_no_p_PPanel.setName("Dtl.lot_no_p");
		p.columnDtl_crt_lot_flg = p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg;
		p.columnDtl_crt_lot_flg.addAliasName("Dtl.crt_lot_flg", p);
		p.columnDtl_lot_no = p.Dtl_lot_no_p_PPanel.columnLotNo_lot_no;
		p.columnDtl_lot_no.addAliasName("Dtl.lot_no", p);
		p.columnDtl_sublot_no = p.Dtl_lot_no_p_PPanel.columnLotNo_sublot_no;
		p.columnDtl_sublot_no.addAliasName("Dtl.sublot_no", p);
		p.Dtl_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBE.MSBEP1020.DtlR.$ver_no_p);
		p.Dtl_ver_no_p_PPanel.setName("Dtl.ver_no_p");
		p.columnDtl_ver_no = p.Dtl_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnDtl_ver_no.addAliasName("Dtl.ver_no", p);
		p.Dtl_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1020.DtlR.$trd_unit_qty_p);
		p.Dtl_trd_unit_qty_p_PPanel.setName("Dtl.trd_unit_qty_p");
		p.columnDtl_trd_unit_qty = p.Dtl_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_trd_unit_qty.addAliasName("Dtl.trd_unit_qty", p);
		p.Dtl_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1020.DtlR.$base_unit_qty_p);
		p.Dtl_base_unit_qty_p_PPanel.setName("Dtl.base_unit_qty_p");
		p.columnDtl_base_unit_qty = p.Dtl_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_base_unit_qty.addAliasName("Dtl.base_unit_qty", p);
		p.Dtl_base_unit_act_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1020.DtlR.$base_unit_act_qty_p);
		p.Dtl_base_unit_act_qty_p_PPanel.setName("Dtl.base_unit_act_qty_p");
		p.columnDtl_base_unit_act_qty = p.Dtl_base_unit_act_qty_p_PPanel.columnQty_qty;
		p.columnDtl_base_unit_act_qty.addAliasName("Dtl.base_unit_act_qty", p);
		p.Dtl_base_unit_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1020.DtlR.$base_unit_schd_qty_p);
		p.Dtl_base_unit_schd_qty_p_PPanel.setName("Dtl.base_unit_schd_qty_p");
		p.columnDtl_base_unit_schd_qty = p.Dtl_base_unit_schd_qty_p_PPanel.columnQty_qty;
		p.columnDtl_base_unit_schd_qty.addAliasName("Dtl.base_unit_schd_qty", p);
		p.Dtl_base_unit_inst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1020.DtlR.$base_unit_inst_qty_p);
		p.Dtl_base_unit_inst_qty_p_PPanel.setName("Dtl.base_unit_inst_qty_p");
		p.columnDtl_base_unit_inst_qty = p.Dtl_base_unit_inst_qty_p_PPanel.columnQty_qty;
		p.columnDtl_base_unit_inst_qty.addAliasName("Dtl.base_unit_inst_qty", p);
		p.Dtl_cont_fctr_unit_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBE.MSBEP1020.DtlR.$cont_fctr_unit_p);
		p.Dtl_cont_fctr_unit_p_PPanel.setName("Dtl.cont_fctr_unit_p");
		p.columnDtl_cont_fctr_unit_cd = p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnDtl_cont_fctr_unit_cd.addAliasName("Dtl.cont_fctr_unit_cd", p);
		p.columnDtl_cont_fctr_unit_nm = p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnDtl_cont_fctr_unit_nm.addAliasName("Dtl.cont_fctr_unit_nm", p);
		p.Dtl_act_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.create(mcframe.clientMSBE.MSBEP1020.DtlR.$act_cont_fctr_p);
		p.Dtl_act_cont_fctr_p_PPanel.setName("Dtl.act_cont_fctr_p");
		p.columnDtl_act_cont_fctr = p.Dtl_act_cont_fctr_p_PPanel.columnActContFctr_act_cont_fctr;
		p.columnDtl_act_cont_fctr.addAliasName("Dtl.act_cont_fctr", p);
		p.Dtl_act_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP1020.DtlR.$act_cont_qty_p);
		p.Dtl_act_cont_qty_p_PPanel.setName("Dtl.act_cont_qty_p");
		p.columnDtl_act_cont_qty = p.Dtl_act_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnDtl_act_cont_qty.addAliasName("Dtl.act_cont_qty", p);
		p.Dtl_std_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBE.MSBEP1020.DtlR.$std_cont_fctr_p);
		p.Dtl_std_cont_fctr_p_PPanel.setName("Dtl.std_cont_fctr_p");
		p.columnDtl_std_cont_fctr = p.Dtl_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnDtl_std_cont_fctr.addAliasName("Dtl.std_cont_fctr", p);
		p.Dtl_std_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP1020.DtlR.$std_cont_qty_p);
		p.Dtl_std_cont_qty_p_PPanel.setName("Dtl.std_cont_qty_p");
		p.columnDtl_std_cont_qty = p.Dtl_std_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnDtl_std_cont_qty.addAliasName("Dtl.std_cont_qty", p);
		p.Dtl_gi_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBE.MSBEP1020.DtlR.$gi_str_ln_p);
		p.Dtl_gi_str_ln_p_PPanel.setName("Dtl.gi_str_ln_p");
		p.columnDtl_gi_str_ln_cd = p.Dtl_gi_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnDtl_gi_str_ln_cd.addAliasName("Dtl.gi_str_ln_cd", p);
		p.columnDtl_gi_str_ln_nm = p.Dtl_gi_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnDtl_gi_str_ln_nm.addAliasName("Dtl.gi_str_ln_nm", p);
		p.columnDtl_gi_str_ln_cd_none_flg = p.Dtl_gi_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnDtl_gi_str_ln_cd_none_flg.addAliasName("Dtl.gi_str_ln_cd_none_flg", p);
		p.Dtl_gr_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBE.MSBEP1020.DtlR.$gr_str_ln_p);
		p.Dtl_gr_str_ln_p_PPanel.setName("Dtl.gr_str_ln_p");
		p.columnDtl_gr_str_ln_cd = p.Dtl_gr_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnDtl_gr_str_ln_cd.addAliasName("Dtl.gr_str_ln_cd", p);
		p.columnDtl_gr_str_ln_nm = p.Dtl_gr_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnDtl_gr_str_ln_nm.addAliasName("Dtl.gr_str_ln_nm", p);
		p.columnDtl_gr_str_ln_cd_none_flg = p.Dtl_gr_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnDtl_gr_str_ln_cd_none_flg.addAliasName("Dtl.gr_str_ln_cd_none_flg", p);
		p.Dtl_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP1020.DtlR.$sno_wrk_no_p);
		p.Dtl_sno_wrk_no_p_PPanel.setName("Dtl.sno_wrk_no_p");
		p.columnDtl_sno1 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnDtl_sno1.addAliasName("Dtl.sno1", p);
		p.columnDtl_sno2 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnDtl_sno2.addAliasName("Dtl.sno2", p);
		p.columnDtl_sno3 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnDtl_sno3.addAliasName("Dtl.sno3", p);
		p.columnDtl_sno4 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnDtl_sno4.addAliasName("Dtl.sno4", p);
		p.columnDtl_wrk_no = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnDtl_wrk_no.addAliasName("Dtl.wrk_no", p);
		p.columnDtl_wrk_nm = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnDtl_wrk_nm.addAliasName("Dtl.wrk_nm", p);
		p.Dtl_schd_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP1020.DtlR.$schd_sno_wrk_no_p);
		p.Dtl_schd_sno_wrk_no_p_PPanel.setName("Dtl.schd_sno_wrk_no_p");
		p.columnDtl_schd_sno1 = p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnDtl_schd_sno1.addAliasName("Dtl.schd_sno1", p);
		p.columnDtl_sno1_null_flg = p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg;
		p.columnDtl_sno1_null_flg.addAliasName("Dtl.sno1_null_flg", p);
		p.columnDtl_schd_sno2 = p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnDtl_schd_sno2.addAliasName("Dtl.schd_sno2", p);
		p.columnDtl_sno2_null_flg = p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg;
		p.columnDtl_sno2_null_flg.addAliasName("Dtl.sno2_null_flg", p);
		p.columnDtl_schd_sno3 = p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnDtl_schd_sno3.addAliasName("Dtl.schd_sno3", p);
		p.columnDtl_sno3_null_flg = p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg;
		p.columnDtl_sno3_null_flg.addAliasName("Dtl.sno3_null_flg", p);
		p.columnDtl_schd_sno4 = p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnDtl_schd_sno4.addAliasName("Dtl.schd_sno4", p);
		p.columnDtl_sno4_null_flg = p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg;
		p.columnDtl_sno4_null_flg.addAliasName("Dtl.sno4_null_flg", p);
		p.Dtl_stk_bp_p_PPanel = mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.create(mcframe.clientMSBE.MSBEP1020.DtlR.$stk_bp_p);
		p.Dtl_stk_bp_p_PPanel.setName("Dtl.stk_bp_p");
		p.columnDtl_stk_bp_cd = p.Dtl_stk_bp_p_PPanel.columnStkBp_stk_bp_cd;
		p.columnDtl_stk_bp_cd.addAliasName("Dtl.stk_bp_cd", p);
		p.columnDtl_stk_bp_nm = p.Dtl_stk_bp_p_PPanel.columnStkBp_stk_bp_nm;
		p.columnDtl_stk_bp_nm.addAliasName("Dtl.stk_bp_nm", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBEP_XfrActReg p) {
		p.Btn_Btn_open_MSBEP0500_PPanel = mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.create();
		p.Btn_Btn_open_MSBEP0500_PPanel.setName("Btn.Btn_open_MSBEP0500");
		p.Btn_menu_move_p_PPanel = mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.create();
		p.Btn_menu_move_p_PPanel.setName("Btn.menu_move_p");
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBEP_XfrActReg p) {
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
			Cnd_srch_tgt_typ_nm_p = createCnd_srch_tgt_typ_nm_ListPutter(Cnd_srch_tgt_typ_nm, "srch_tgt_typ_nm", "srch_tgt_typ");

		}
		return Cnd_srch_tgt_typ_nm_p;
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
	
	
	/** [Hdr_gr_loc_cd_ListPutter]の定義 */
	private MCListPutter Hdr_gr_loc_cd_p = null;

	/**
	 * [Hdr_gr_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_gr_loc_cd_ListPutter() {
		if (Hdr_gr_loc_cd_p == null) {
			Hdr_gr_loc_cd_p = createHdr_gr_loc_cd_ListPutter(Hdr_gr_loc_cd, "gr_loc_cd", "gr_loc_nm","wg_cd","wg_nm","gr_str_ln_tgt_flg","lg_grp_cd","lg_grp_nm","sppl_cd","gr_site_cd");

		}
		return Hdr_gr_loc_cd_p;
	}
	
	
	/** [Hdr_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Hdr_lg_grp_cd_p = null;

	/**
	 * [Hdr_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_lg_grp_cd_ListPutter() {
		if (Hdr_lg_grp_cd_p == null) {
			Hdr_lg_grp_cd_p = createHdr_lg_grp_cd_ListPutter(Hdr_lg_grp_cd, "lg_grp_cd", "immd_dlv_prnt_flg");

		}
		return Hdr_lg_grp_cd_p;
	}
	
	
	/** [Hdr_sppl_cd_ListPutter]の定義 */
	private MCListPutter Hdr_sppl_cd_p = null;

	/**
	 * [Hdr_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_sppl_cd_ListPutter() {
		if (Hdr_sppl_cd_p == null) {
			Hdr_sppl_cd_p = createHdr_sppl_cd_ListPutter(Hdr_sppl_cd, "sppl_cd", "onr_prsppl_flg","prov_basis_typ","cur_cd");

		}
		return Hdr_sppl_cd_p;
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
	
	
	/** [Dtl_pr_sts_typ_ListPutter]の定義 */
	private MCListPutter Dtl_pr_sts_typ_p = null;

	/**
	 * [Dtl_pr_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_pr_sts_typ_ListPutter() {
		if (Dtl_pr_sts_typ_p == null) {
			Dtl_pr_sts_typ_p = createDtl_pr_sts_typ_ListPutter(columnDtl_pr_sts_typ, "pr_sts_typ");

		}
		return Dtl_pr_sts_typ_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_cd_p = createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_sub1","itm_sub2","itm_sub3","itm_nm","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","lot_mng_typ","sublot_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","asset_mng_typ","ver_flg","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_unit_nm","cont_fctr_rnd_typ","cont_fctr_dec_place","skip_chk_ship_flg");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_sub1_p = createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_sub2","itm_sub3","itm_nm","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","lot_mng_typ","sublot_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","asset_mng_typ","ver_flg","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_unit_nm","cont_fctr_rnd_typ","cont_fctr_dec_place","skip_chk_ship_flg");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_sub2_p = createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_sub3","itm_nm","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","lot_mng_typ","sublot_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","asset_mng_typ","ver_flg","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_unit_nm","cont_fctr_rnd_typ","cont_fctr_dec_place","skip_chk_ship_flg");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_sub3_p = createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","lot_mng_typ","sublot_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","asset_mng_typ","ver_flg","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_rnd_typ","cont_fctr_dec_place","skip_chk_ship_flg");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Dtl_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の定義 */
	private MCListPutter Dtl_lot_no_p_PPanel_columnLotNo_lot_no_p = null;

	/**
	 * [Dtl_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の取得
	 */
	protected MCListPutter getDtl_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter() {
		if (Dtl_lot_no_p_PPanel_columnLotNo_lot_no_p == null) {
			Dtl_lot_no_p_PPanel_columnLotNo_lot_no_p = createDtl_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter(Dtl_lot_no_p_PPanel.columnLotNo_lot_no, "lot_no", "sublot_no","ver_no","act_cont_fctr");
		}
		return Dtl_lot_no_p_PPanel_columnLotNo_lot_no_p;
	}
	
	
	/** [Dtl_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の定義 */
	private MCListPutter Dtl_lot_no_p_PPanel_columnLotNo_sublot_no_p = null;

	/**
	 * [Dtl_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の取得
	 */
	protected MCListPutter getDtl_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter() {
		if (Dtl_lot_no_p_PPanel_columnLotNo_sublot_no_p == null) {
			Dtl_lot_no_p_PPanel_columnLotNo_sublot_no_p = createDtl_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter(Dtl_lot_no_p_PPanel.columnLotNo_sublot_no, "sublot_no", "ver_no","act_cont_fctr");
		}
		return Dtl_lot_no_p_PPanel_columnLotNo_sublot_no_p;
	}
	
	
	/** [Dtl_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_unit_cd_p = null;

	/**
	 * [Dtl_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_unit_cd_ListPutter() {
		if (Dtl_trd_unit_cd_p == null) {
			Dtl_trd_unit_cd_p = createDtl_trd_unit_cd_ListPutter(columnDtl_trd_unit_cd, "trd_unit_cd", "trd_unit_nm","trd_unit_conv_base_qty","trd_unit_dec_place","trd_unit_conv_qty","trd_unit_rnd_typ");

		}
		return Dtl_trd_unit_cd_p;
	}
	
	
	/** [Dtl_gi_loc_cd_ListPutter]の定義 */
	private MCListPutter Dtl_gi_loc_cd_p = null;

	/**
	 * [Dtl_gi_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_gi_loc_cd_ListPutter() {
		if (Dtl_gi_loc_cd_p == null) {
			Dtl_gi_loc_cd_p = createDtl_gi_loc_cd_ListPutter(columnDtl_gi_loc_cd, "gi_loc_cd", "gi_loc_nm","gi_str_ln_tgt_flg","gi_sppl_cd","gi_site_cd");

		}
		return Dtl_gi_loc_cd_p;
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
	
	
	/** [Dtl_stk_insp_typ_ListPutter]の定義 */
	private MCListPutter Dtl_stk_insp_typ_p = null;

	/**
	 * [Dtl_stk_insp_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_stk_insp_typ_ListPutter() {
		if (Dtl_stk_insp_typ_p == null) {
			Dtl_stk_insp_typ_p = createDtl_stk_insp_typ_ListPutter(columnDtl_stk_insp_typ, "stk_insp_typ", "stk_insp_typ_nm");

		}
		return Dtl_stk_insp_typ_p;
	}
	
	
	/** [Dtl_stk_id_typ_ListPutter]の定義 */
	private MCListPutter Dtl_stk_id_typ_p = null;

	/**
	 * [Dtl_stk_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_stk_id_typ_ListPutter() {
		if (Dtl_stk_id_typ_p == null) {
			Dtl_stk_id_typ_p = createDtl_stk_id_typ_ListPutter(columnDtl_stk_id_typ, "stk_id_typ", "stk_id_typ_nm");

		}
		return Dtl_stk_id_typ_p;
	}
	
	
	/** [Dtl_gi_stk_arrv_bp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_gi_stk_arrv_bp_cd_p = null;

	/**
	 * [Dtl_gi_stk_arrv_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_gi_stk_arrv_bp_cd_ListPutter() {
		if (Dtl_gi_stk_arrv_bp_cd_p == null) {
			Dtl_gi_stk_arrv_bp_cd_p = createDtl_gi_stk_arrv_bp_cd_ListPutter(columnDtl_gi_stk_arrv_bp_cd, "gi_stk_arrv_bp_cd", "gi_stk_arrv_bp_nm");

		}
		return Dtl_gi_stk_arrv_bp_cd_p;
	}
	
	
	/** [Dtl_rsn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_rsn_cd_p = null;

	/**
	 * [Dtl_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_rsn_cd_ListPutter() {
		if (Dtl_rsn_cd_p == null) {
			Dtl_rsn_cd_p = createDtl_rsn_cd_ListPutter(columnDtl_rsn_cd, "rsn_cd", "rsn_nm","acxfr_gi_flg");

		}
		return Dtl_rsn_cd_p;
	}
	
	
	/** [Dtl_bd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_bd_dpt_cd_p = null;

	/**
	 * [Dtl_bd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bd_dpt_cd_ListPutter() {
		if (Dtl_bd_dpt_cd_p == null) {
			Dtl_bd_dpt_cd_p = createDtl_bd_dpt_cd_ListPutter(columnDtl_bd_dpt_cd, "bd_dpt_cd", "bd_dpt_nm");

		}
		return Dtl_bd_dpt_cd_p;
	}
	
	
	/** [Dtl_prov_typ_ListPutter]の定義 */
	private MCListPutter Dtl_prov_typ_p = null;

	/**
	 * [Dtl_prov_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_prov_typ_ListPutter() {
		if (Dtl_prov_typ_p == null) {
			Dtl_prov_typ_p = createDtl_prov_typ_ListPutter(columnDtl_prov_typ, "prov_typ", "prov_typ_nm");

		}
		return Dtl_prov_typ_p;
	}
	
	
	/** [Dtl_prov_basis_typ_ListPutter]の定義 */
	private MCListPutter Dtl_prov_basis_typ_p = null;

	/**
	 * [Dtl_prov_basis_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_prov_basis_typ_ListPutter() {
		if (Dtl_prov_basis_typ_p == null) {
			Dtl_prov_basis_typ_p = createDtl_prov_basis_typ_ListPutter(columnDtl_prov_basis_typ, "prov_basis_typ", "prov_basis_typ_nm");

		}
		return Dtl_prov_basis_typ_p;
	}
	
	
	/** [Dtl_ret_prov_typ_ListPutter]の定義 */
	private MCListPutter Dtl_ret_prov_typ_p = null;

	/**
	 * [Dtl_ret_prov_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ret_prov_typ_ListPutter() {
		if (Dtl_ret_prov_typ_p == null) {
			Dtl_ret_prov_typ_p = createDtl_ret_prov_typ_ListPutter(columnDtl_ret_prov_typ, "ret_prov_typ", "ret_prov_typ_nm");

		}
		return Dtl_ret_prov_typ_p;
	}
	
	
	/** [Dtl_ret_prov_basis_typ_ListPutter]の定義 */
	private MCListPutter Dtl_ret_prov_basis_typ_p = null;

	/**
	 * [Dtl_ret_prov_basis_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ret_prov_basis_typ_ListPutter() {
		if (Dtl_ret_prov_basis_typ_p == null) {
			Dtl_ret_prov_basis_typ_p = createDtl_ret_prov_basis_typ_ListPutter(columnDtl_ret_prov_basis_typ, "ret_prov_basis_typ", "ret_prov_basis_typ_nm");

		}
		return Dtl_ret_prov_basis_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_XfrActReg create(){
		MSBEP_XfrActReg p = new MSBEP_XfrActReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_XfrActReg create(String name){
		MSBEP_XfrActReg p = new MSBEP_XfrActReg(name);
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
		MSBEP_XfrActReg_MC.jbfInitScreenOpe((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.jbfInitCnd((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.jbfInitHdrTab((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.jbfInitHdr((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.jbfInitHdr2((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.jbfInitDtl((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.jbfInitBtn((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.jbfInitEastBtn((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.jbInitScreenOpe((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.jbInitCnd((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.jbInitHdrTab((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.jbInitHdr((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.jbInitHdr2((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.jbInitDtl((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.jbInitBtn((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.jbInitEastBtn((MSBEP_XfrActReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBEP_XfrActReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_XfrActReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_srch_tgt_typ_nm_Label = p.beansFactory.createLabel("Cnd.srch_tgt_typ_nm_Label");
		p.Cnd_srch_tgt_typ_nm = p.beansFactory.createTextComboBox("Cnd.srch_tgt_typ_nm");
		p.Cnd_srch_tgt_typ_nm.setLabel(p.Cnd_srch_tgt_typ_nm_Label);
		p.Cnd_srch_tgt_typ = p.beansFactory.createTextField("Cnd.srch_tgt_typ");
		p.Cnd_srch_tgt_no = p.beansFactory.createTextField("Cnd.srch_tgt_no");
		p.Cnd_srch_inst = p.beansFactory.createButton("Cnd.srch_inst", "srch");
		p.Cnd_srch_act = p.beansFactory.createButton("Cnd.srch_act", "srch");
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBEP_XfrActReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBEP_XfrActReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_trd_cd_Label = p.beansFactory.createLabel("Hdr.trd_cd_Label");
		p.Hdr_trd_cd = p.beansFactory.createTextComboBox("Hdr.trd_cd");
		p.Hdr_trd_cd.setLabel(p.Hdr_trd_cd_Label);
		p.Hdr_trd_nm = p.beansFactory.createTextField("Hdr.trd_nm");
		p.Hdr_trd_ptn_typ = p.beansFactory.createTextField("Hdr.trd_ptn_typ");
		p.Hdr_xfr_act_no_Label = p.beansFactory.createLabel("Hdr.xfr_act_no_Label");
		p.Hdr_xfr_act_no = p.beansFactory.createTextField("Hdr.xfr_act_no");
		p.Hdr_xfr_act_no.setLabel(p.Hdr_xfr_act_no_Label);
		p.Hdr_xfr_inst_no_Label = p.beansFactory.createLabel("Hdr.xfr_inst_no_Label");
		p.Hdr_xfr_inst_no = p.beansFactory.createTextField("Hdr.xfr_inst_no");
		p.Hdr_xfr_inst_no.setLabel(p.Hdr_xfr_inst_no_Label);
		p.Hdr_gr_loc_cd_Label = p.beansFactory.createLabel("Hdr.gr_loc_cd_Label");
		p.Hdr_gr_loc_cd = p.beansFactory.createTextComboBox("Hdr.gr_loc_cd");
		p.Hdr_gr_loc_cd.setLabel(p.Hdr_gr_loc_cd_Label);
		p.Hdr_gr_loc_nm = p.beansFactory.createTextField("Hdr.gr_loc_nm");
		p.Hdr_gr_str_ln_tgt_flg = p.beansFactory.createCheckBox("Hdr.gr_str_ln_tgt_flg");
		p.Hdr_gr_site_cd = p.beansFactory.createTextField("Hdr.gr_site_cd");
		p.Hdr_wg_cd_Label = p.beansFactory.createLabel("Hdr.wg_cd_Label");
		p.Hdr_wg_cd = p.beansFactory.createTextField("Hdr.wg_cd");
		p.Hdr_wg_cd.setLabel(p.Hdr_wg_cd_Label);
		p.Hdr_wg_nm = p.beansFactory.createTextField("Hdr.wg_nm");
		p.Hdr_lg_grp_cd_Label = p.beansFactory.createLabel("Hdr.lg_grp_cd_Label");
		p.Hdr_lg_grp_cd = p.beansFactory.createTextComboBox("Hdr.lg_grp_cd");
		p.Hdr_lg_grp_cd.setLabel(p.Hdr_lg_grp_cd_Label);
		p.Hdr_lg_grp_nm = p.beansFactory.createTextField("Hdr.lg_grp_nm");
		p.Hdr_sppl_cd = p.beansFactory.createTextComboBox("Hdr.sppl_cd");
		p.Hdr_cur_cd = p.beansFactory.createTextField("Hdr.cur_cd");
		p.Hdr_onr_prsppl_flg = p.beansFactory.createCheckBox("Hdr.onr_prsppl_flg");
		p.Hdr_prov_basis_typ = p.beansFactory.createTextField("Hdr.prov_basis_typ");
		p.Hdr_immd_dlv_prnt_flg = p.beansFactory.createCheckBox("Hdr.immd_dlv_prnt_flg");
		p.Hdr_dlv_prnt_flg = p.beansFactory.createCheckBox("Hdr.dlv_prnt_flg");
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
	protected static void jbfInitHdr2(MSBEP_XfrActReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel = p.beansFactory.createPanel("Hdr2");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBEP_XfrActReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_pr_sts_typ = p.beansFactory.createTableColumn("Dtl.pr_sts_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_pr_sts_typ_nm = p.beansFactory.createTableColumn("Dtl.pr_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtl_asset_mng_typ = p.beansFactory.createTableColumn("Dtl.asset_mng_typ", MCColumnType.TEXT);
		p.columnDtl_lot_mng_typ = p.beansFactory.createTableColumn("Dtl.lot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sublot_mng_typ = p.beansFactory.createTableColumn("Dtl.sublot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_ver_flg = p.beansFactory.createTableColumn("Dtl.ver_flg", MCColumnType.CHECK);
		p.columnDtl_not_lot_mix_flg = p.beansFactory.createTableColumn("Dtl.not_lot_mix_flg", MCColumnType.CHECK);
		p.columnDtl_not_sublot_mix_flg = p.beansFactory.createTableColumn("Dtl.not_sublot_mix_flg", MCColumnType.CHECK);
		p.columnDtl_trd_unit_cd = p.beansFactory.createTableColumn("Dtl.trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_trd_unit_nm = p.beansFactory.createTableColumn("Dtl.trd_unit_nm", MCColumnType.TEXT);
		p.columnDtl_trd_unit_dec_place = p.beansFactory.createTableColumn("Dtl.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_conv_qty = p.beansFactory.createTableColumn("Dtl.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Dtl.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnDtl_abort_flg = p.beansFactory.createTableColumn("Dtl.abort_flg", MCColumnType.CHECK);
		p.columnDtl_base_unit_cd = p.beansFactory.createTableColumn("Dtl.base_unit_cd", MCColumnType.TEXT);
		p.columnDtl_base_unit_nm = p.beansFactory.createTableColumn("Dtl.base_unit_nm", MCColumnType.TEXT);
		p.columnDtl_base_unit_dec_place = p.beansFactory.createTableColumn("Dtl.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_base_unit_dmn_qty = p.beansFactory.createTableColumn("Dtl.base_unit_dmn_qty", MCColumnType.NUMBER);
		p.columnDtl_base_unit_conv_qty = p.beansFactory.createTableColumn("Dtl.base_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtl_base_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_cont_fctr_flg = p.beansFactory.createTableColumn("Dtl.cont_fctr_flg", MCColumnType.CHECK);
		p.columnDtl_cont_fctr_dec_place = p.beansFactory.createTableColumn("Dtl.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnDtl_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("Dtl.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_gi_loc_cd = p.beansFactory.createTableColumn("Dtl.gi_loc_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_gi_loc_nm = p.beansFactory.createTableColumn("Dtl.gi_loc_nm", MCColumnType.TEXT);
		p.columnDtl_gi_str_ln_tgt_flg = p.beansFactory.createTableColumn("Dtl.gi_str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnDtl_gi_site_cd = p.beansFactory.createTableColumn("Dtl.gi_site_cd", MCColumnType.TEXT);
		p.columnDtl_gi_sppl_cd = p.beansFactory.createTableColumn("Dtl.gi_sppl_cd", MCColumnType.TEXT);
		p.columnDtl_gr_str_ln_tgt_flg = p.beansFactory.createTableColumn("Dtl.gr_str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnDtl_quality_typ = p.beansFactory.createTableColumn("Dtl.quality_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_quality_typ_nm = p.beansFactory.createTableColumn("Dtl.quality_typ_nm", MCColumnType.TEXT);
		p.columnDtl_gd_cd = p.beansFactory.createTableColumn("Dtl.gd_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_gd_nm = p.beansFactory.createTableColumn("Dtl.gd_nm", MCColumnType.TEXT);
		p.columnDtl_stk_insp_typ = p.beansFactory.createTableColumn("Dtl.stk_insp_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_stk_insp_typ_nm = p.beansFactory.createTableColumn("Dtl.stk_insp_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl.sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl.sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl.sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl.sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl_stk_id_typ = p.beansFactory.createTableColumn("Dtl.stk_id_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_stk_id_typ_nm = p.beansFactory.createTableColumn("Dtl.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnDtl_gi_stk_arrv_bp_cd = p.beansFactory.createTableColumn("Dtl.gi_stk_arrv_bp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_gi_stk_arrv_bp_nm = p.beansFactory.createTableColumn("Dtl.gi_stk_arrv_bp_nm", MCColumnType.TEXT);
		p.columnDtl_rsn_cd = p.beansFactory.createTableColumn("Dtl.rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_rsn_nm = p.beansFactory.createTableColumn("Dtl.rsn_nm", MCColumnType.TEXT);
		p.columnDtl_acxfr_gi_flg = p.beansFactory.createTableColumn("Dtl.acxfr_gi_flg", MCColumnType.CHECK);
		p.columnDtl_bd_dpt_cd = p.beansFactory.createTableColumn("Dtl.bd_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_bd_dpt_nm = p.beansFactory.createTableColumn("Dtl.bd_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_skip_chk_ship_flg = p.beansFactory.createTableColumn("Dtl.skip_chk_ship_flg", MCColumnType.CHECK);
		p.columnDtl_prov_typ = p.beansFactory.createTableColumn("Dtl.prov_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_prov_typ_nm = p.beansFactory.createTableColumn("Dtl.prov_typ_nm", MCColumnType.TEXT);
		p.columnDtl_prov_basis_typ = p.beansFactory.createTableColumn("Dtl.prov_basis_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_prov_basis_typ_nm = p.beansFactory.createTableColumn("Dtl.prov_basis_typ_nm", MCColumnType.TEXT);
		p.columnDtl_ret_prov_typ = p.beansFactory.createTableColumn("Dtl.ret_prov_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_ret_prov_typ_nm = p.beansFactory.createTableColumn("Dtl.ret_prov_typ_nm", MCColumnType.TEXT);
		p.columnDtl_ret_prov_basis_typ = p.beansFactory.createTableColumn("Dtl.ret_prov_basis_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_ret_prov_basis_typ_nm = p.beansFactory.createTableColumn("Dtl.ret_prov_basis_typ_nm", MCColumnType.TEXT);
		p.columnDtl_base_dlv_slip_no = p.beansFactory.createTableColumn("Dtl.base_dlv_slip_no", MCColumnType.TEXT);
		p.columnDtl_base_prov_act_no = p.beansFactory.createTableColumn("Dtl.base_prov_act_no", MCColumnType.TEXT);
		p.columnDtl_base_ac_dt = p.beansFactory.createTableColumn("Dtl.base_ac_dt", MCColumnType.DATE);
		p.columnDtl_wms_flg = p.beansFactory.createTableColumn("Dtl.wms_flg", MCColumnType.CHECK);
		p.columnDtl_intr_d_rmrks = p.beansFactory.createTableColumn("Dtl.intr_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_trd_d_rmrks = p.beansFactory.createTableColumn("Dtl.trd_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_sub_char1 = p.beansFactory.createTableColumn("Dtl.sub_char1", MCColumnType.TEXT);
		p.columnDtl_sub_char2 = p.beansFactory.createTableColumn("Dtl.sub_char2", MCColumnType.TEXT);
		p.columnDtl_sub_char3 = p.beansFactory.createTableColumn("Dtl.sub_char3", MCColumnType.TEXT);
		p.columnDtl_xfr_src_typ = p.beansFactory.createTableColumn("Dtl.xfr_src_typ", MCColumnType.TEXT);
		p.columnDtl_xfr_src_typ_nm = p.beansFactory.createTableColumn("Dtl.xfr_src_typ_nm", MCColumnType.TEXT);
		p.columnDtl_xfr_src_no = p.beansFactory.createTableColumn("Dtl.xfr_src_no", MCColumnType.TEXT);
		p.columnDtl_xfr_schd_no = p.beansFactory.createTableColumn("Dtl.xfr_schd_no", MCColumnType.TEXT);
		p.columnDtl_xfr_alloc_sts_no = p.beansFactory.createTableColumn("Dtl.xfr_alloc_sts_no", MCColumnType.TEXT);
		p.columnDtl_xfr_inst_d_no = p.beansFactory.createTableColumn("Dtl.xfr_inst_d_no", MCColumnType.TEXT);
		p.columnDtl_xfr_act_d_no = p.beansFactory.createTableColumn("Dtl.xfr_act_d_no", MCColumnType.TEXT);
		p.columnDtl_ext_sys_cd = p.beansFactory.createTableColumn("Dtl.ext_sys_cd", MCColumnType.TEXT);
		p.columnDtl_ext_sys_nm = p.beansFactory.createTableColumn("Dtl.ext_sys_nm", MCColumnType.TEXT);
		p.columnDtl_ext_xfr_act_no = p.beansFactory.createTableColumn("Dtl.ext_xfr_act_no", MCColumnType.TEXT);
		p.columnDtl_dlv_slip_no = p.beansFactory.createTableColumn("Dtl.dlv_slip_no", MCColumnType.TEXT);
		p.columnDtl_dlv_slip_d_no = p.beansFactory.createTableColumn("Dtl.dlv_slip_d_no", MCColumnType.TEXT);
		p.columnDtl_prov_schd_no = p.beansFactory.createTableColumn("Dtl.prov_schd_no", MCColumnType.TEXT);
		p.columnDtl_ret_prov_schd_no = p.beansFactory.createTableColumn("Dtl.ret_prov_schd_no", MCColumnType.TEXT);
		p.columnDtl_prov_act_no = p.beansFactory.createTableColumn("Dtl.prov_act_no", MCColumnType.TEXT);
		p.columnDtl_ret_prov_act_no = p.beansFactory.createTableColumn("Dtl.ret_prov_act_no", MCColumnType.TEXT);
		p.columnDtl_disp_seq = p.beansFactory.createTableColumn("Dtl.disp_seq", MCColumnType.NUMBER);
		p.columnDtl_trd_ptn_typ = p.beansFactory.createTableColumn("Dtl.trd_ptn_typ", MCColumnType.TEXT);
		p.columnDtl_xfr_act_no = p.beansFactory.createTableColumn("Dtl.xfr_act_no", MCColumnType.TEXT);
		p.columnDtl_act_d_upd_cntr = p.beansFactory.createTableColumn("Dtl.act_d_upd_cntr", MCColumnType.NUMBER);
		p.columnDtl_alloc_sts_upd_cntr = p.beansFactory.createTableColumn("Dtl.alloc_sts_upd_cntr", MCColumnType.NUMBER);
		p.columnDtl_base_unit_qty_bef = p.beansFactory.createTableColumn("Dtl.base_unit_qty_bef", MCColumnType.NUMBER);
		p.columnDtl_base_unit_act_qty_sum = p.beansFactory.createTableColumn("Dtl.base_unit_act_qty_sum", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_XfrActReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_prnt_dlv = p.beansFactory.createButton("Btn.prnt_dlv", "prnt");
		p.Btn_sprt_ac_dt = p.beansFactory.createButton("Btn.sprt_ac_dt");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_ins_noSchd = p.beansFactory.createButton("Btn.ins_noSchd", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_indiv_prnt_flg = p.beansFactory.createCheckBox("Btn.indiv_prnt_flg");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBEP_XfrActReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBEP_XfrActReg p) {
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
	protected static void jbInitCnd(MSBEP_XfrActReg p) {
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
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1020.CndR.ope_META);
		p.Cnd_srch_tgt_typ_nm.setListType(MCListType.STRICT);
		p.Cnd_srch_tgt_typ_nm.setLinkBeans(p.Cnd_srch_tgt_typ);
		p.CndPanel.add(p.Cnd_srch_tgt_typ_nm_Label);
		p.CndPanel.add(p.Cnd_srch_tgt_typ_nm);
		p.CndPanel.setLastBeans(p.Cnd_srch_tgt_typ_nm);
		p.Cnd_srch_tgt_typ_nm.setNextBeans(p.Cnd_srch_tgt_typ);
		p.Cnd_srch_tgt_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1020.CndR.srch_tgt_typ_nm_META);
		p.CndPanel.add(p.Cnd_srch_tgt_typ);
		p.Cnd_srch_tgt_typ.setNextBeans(p.Cnd_srch_tgt_no);
		p.Cnd_srch_tgt_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1020.CndR.srch_tgt_typ_META);
		p.CndPanel.add(p.Cnd_srch_tgt_no);
		p.Cnd_srch_tgt_no.setNextBeans(p.Cnd_srch_inst);
		p.Cnd_srch_tgt_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1020.CndR.srch_tgt_no_META);
		p.Cnd_srch_inst.setIcon("SEARCH");
		p.Cnd_srch_inst.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch_inst);
		p.Cnd_srch_inst.setNextBeans(p.Cnd_srch_act);
		p.Cnd_srch_act.setIcon("SEARCH");
		p.Cnd_srch_act.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch_act);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBEP_XfrActReg p) {
		// ブロック関連の初期化
		p.add(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.DtlPanel);
		p.HdrTabPanel.add(p.HdrTabTab);
		p.HdrTabPanel.setLastBeans(p.HdrTabTab);
		p.HdrTabPanel.setLayoutPosition("CTC");
		// ブロックの項目の初期化
		p.HdrTabTab.add(p.HdrPanel, "HdrTab.tab1");
		p.HdrTabTab.setLastBeans(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		p.HdrTabTab.add(p.Hdr2Panel, "HdrTab.tab2");
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBEP_XfrActReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		// ブロックの項目の初期化
		p.Hdr_trd_cd.setListType(MCListType.STRICT);
		p.Hdr_trd_cd.setLinkBeans(p.Hdr_trd_nm,p.Hdr_trd_ptn_typ);
		p.HdrPanel.add(p.Hdr_trd_cd_Label);
		p.HdrPanel.add(p.Hdr_trd_cd);
		p.HdrPanel.setLastBeans(p.Hdr_trd_cd);
		p.Hdr_trd_cd.setNextBeans(p.Hdr_trd_nm);
		p.Hdr_trd_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.trd_cd_META);
		p.HdrPanel.add(p.Hdr_trd_nm);
		p.Hdr_trd_nm.setNextBeans(p.Hdr_trd_ptn_typ);
		p.Hdr_trd_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.trd_nm_META);
		p.HdrPanel.add(p.Hdr_trd_ptn_typ);
		p.Hdr_trd_ptn_typ.setNextBeans(p.Hdr_xfr_act_no);
		p.Hdr_trd_ptn_typ.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.trd_ptn_typ_META);
		p.HdrPanel.add(p.Hdr_xfr_act_no_Label);
		p.HdrPanel.add(p.Hdr_xfr_act_no);
		p.Hdr_xfr_act_no.setNextBeans(p.Hdr_xfr_inst_no);
		p.Hdr_xfr_act_no.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.xfr_act_no_META);
		p.HdrPanel.add(p.Hdr_xfr_inst_no_Label);
		p.HdrPanel.add(p.Hdr_xfr_inst_no);
		p.Hdr_xfr_inst_no.setNextBeans(p.Hdr_gr_loc_cd);
		p.Hdr_xfr_inst_no.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.xfr_inst_no_META);
		p.Hdr_gr_loc_cd.setListType(MCListType.STRICT);
		p.Hdr_gr_loc_cd.setLinkBeans(p.Hdr_gr_loc_nm,p.Hdr_wg_cd,p.Hdr_wg_nm,p.Hdr_gr_str_ln_tgt_flg,p.Hdr_lg_grp_cd,p.Hdr_lg_grp_nm,p.Hdr_sppl_cd,p.Hdr_gr_site_cd);
		p.HdrPanel.add(p.Hdr_gr_loc_cd_Label);
		p.HdrPanel.add(p.Hdr_gr_loc_cd);
		p.Hdr_gr_loc_cd.setNextBeans(p.Hdr_gr_loc_nm);
		p.Hdr_gr_loc_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.gr_loc_cd_META);
		p.HdrPanel.add(p.Hdr_gr_loc_nm);
		p.Hdr_gr_loc_nm.setNextBeans(p.Hdr_gr_str_ln_tgt_flg);
		p.Hdr_gr_loc_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.gr_loc_nm_META);
		p.HdrPanel.add(p.Hdr_gr_str_ln_tgt_flg);
		p.Hdr_gr_str_ln_tgt_flg.setNextBeans(p.Hdr_gr_site_cd);
		p.Hdr_gr_str_ln_tgt_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.gr_str_ln_tgt_flg_META);
		p.HdrPanel.add(p.Hdr_gr_site_cd);
		p.Hdr_gr_site_cd.setNextBeans(p.Hdr_wg_cd);
		p.Hdr_gr_site_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.gr_site_cd_META);
		p.HdrPanel.add(p.Hdr_wg_cd_Label);
		p.HdrPanel.add(p.Hdr_wg_cd);
		p.Hdr_wg_cd.setNextBeans(p.Hdr_wg_nm);
		p.Hdr_wg_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.wg_cd_META);
		p.HdrPanel.add(p.Hdr_wg_nm);
		p.Hdr_wg_nm.setNextBeans(p.Hdr_lg_grp_cd);
		p.Hdr_wg_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.wg_nm_META);
		p.Hdr_lg_grp_cd.setListType(MCListType.STRICT);
		p.Hdr_lg_grp_cd.setLinkBeans(p.Hdr_immd_dlv_prnt_flg);
		p.HdrPanel.add(p.Hdr_lg_grp_cd_Label);
		p.HdrPanel.add(p.Hdr_lg_grp_cd);
		p.Hdr_lg_grp_cd.setNextBeans(p.Hdr_lg_grp_nm);
		p.Hdr_lg_grp_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.lg_grp_cd_META);
		p.HdrPanel.add(p.Hdr_lg_grp_nm);
		p.Hdr_lg_grp_nm.setNextBeans(p.Hdr_sppl_cd);
		p.Hdr_lg_grp_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.lg_grp_nm_META);
		p.Hdr_sppl_cd.setListType(MCListType.STRICT);
		p.Hdr_sppl_cd.setLinkBeans(p.Hdr_onr_prsppl_flg,p.Hdr_prov_basis_typ,p.Hdr_cur_cd);
		p.HdrPanel.add(p.Hdr_sppl_cd);
		p.Hdr_sppl_cd.setNextBeans(p.Hdr_cur_cd);
		p.Hdr_sppl_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.sppl_cd_META);
		p.HdrPanel.add(p.Hdr_cur_cd);
		p.Hdr_cur_cd.setNextBeans(p.Hdr_onr_prsppl_flg);
		p.Hdr_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.cur_cd_META);
		p.HdrPanel.add(p.Hdr_onr_prsppl_flg);
		p.Hdr_onr_prsppl_flg.setNextBeans(p.Hdr_prov_basis_typ);
		p.Hdr_onr_prsppl_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.onr_prsppl_flg_META);
		p.HdrPanel.add(p.Hdr_prov_basis_typ);
		p.Hdr_prov_basis_typ.setNextBeans(p.Hdr_xfr_dt_p_PPanel);
		p.Hdr_prov_basis_typ.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.prov_basis_typ_META);
		p.HdrPanel.add(p.Hdr_xfr_dt_p_PPanel);
		p.Hdr_xfr_dt_p_PPanel.setNextBeans(p.Hdr_ac_dt_p_PPanel);
		p.HdrPanel.add(p.Hdr_ac_dt_p_PPanel);
		p.Hdr_ac_dt_p_PPanel.setNextBeans(p.Hdr_can_ac_dt_p_PPanel);
		p.HdrPanel.add(p.Hdr_can_ac_dt_p_PPanel);
		p.Hdr_can_ac_dt_p_PPanel.setNextBeans(p.Hdr_act_usr_dpt_p_PPanel);
		p.HdrPanel.add(p.Hdr_act_usr_dpt_p_PPanel);
		p.Hdr_act_usr_dpt_p_PPanel.setNextBeans(p.Hdr_immd_dlv_prnt_flg);
		p.Hdr_act_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.Hdr_act_dpt_nm);
		p.HdrPanel.add(p.Hdr_immd_dlv_prnt_flg);
		p.Hdr_immd_dlv_prnt_flg.setNextBeans(p.Hdr_dlv_prnt_flg);
		p.Hdr_immd_dlv_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.immd_dlv_prnt_flg_META);
		p.HdrPanel.add(p.Hdr_dlv_prnt_flg);
		p.Hdr_dlv_prnt_flg.setNextBeans(p.Hdr_intr_rmrks);
		p.Hdr_dlv_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.dlv_prnt_flg_META);
		p.HdrPanel.add(p.Hdr_intr_rmrks_Label);
		p.HdrPanel.add(p.Hdr_intr_rmrks);
		p.Hdr_intr_rmrks.setNextBeans(p.Hdr_trd_rmrks);
		p.Hdr_intr_rmrks.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.intr_rmrks_META);
		p.HdrPanel.add(p.Hdr_trd_rmrks_Label);
		p.HdrPanel.add(p.Hdr_trd_rmrks);
		p.Hdr_trd_rmrks.setNextBeans(p.Hdr_sub_char1);
		p.Hdr_trd_rmrks.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.trd_rmrks_META);
		p.HdrPanel.add(p.Hdr_sub_char1_Label);
		p.HdrPanel.add(p.Hdr_sub_char1);
		p.Hdr_sub_char1.setNextBeans(p.Hdr_sub_char2);
		p.Hdr_sub_char1.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.sub_char1_META);
		p.HdrPanel.add(p.Hdr_sub_char2_Label);
		p.HdrPanel.add(p.Hdr_sub_char2);
		p.Hdr_sub_char2.setNextBeans(p.Hdr_sub_char3);
		p.Hdr_sub_char2.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.sub_char2_META);
		p.HdrPanel.add(p.Hdr_sub_char3_Label);
		p.HdrPanel.add(p.Hdr_sub_char3);
		p.Hdr_sub_char3.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.sub_char3_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id);
		p.Hdr2Panel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.ins_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.ins_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.ins_func_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.ins_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.upd_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.upd_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.upd_func_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.upd_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_ts_Label);
		p.Hdr2Panel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_ts_Label);
		p.Hdr2Panel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no_Label);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1020.HdrR.upd_srv_req_no_META);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr2(MSBEP_XfrActReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBEP_XfrActReg p) {
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
	protected static void jbInitBtn(MSBEP_XfrActReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.BtnPanel.add(p.Btn_Btn_open_MSBEP0500_PPanel);
		p.BtnPanel.setLastBeans(p.Btn_Btn_open_MSBEP0500_PPanel);
		p.Btn_Btn_open_MSBEP0500_PPanel.setNextBeans(p.Btn_prnt_dlv);
		p.Btn_prnt_dlv.setIcon("PRINT");
		p.Btn_prnt_dlv.setFunctionKey(MCFunctionKey.F8);
		p.BtnPanel.add(p.Btn_prnt_dlv);
		p.Btn_prnt_dlv.setNextBeans(p.Btn_sprt_ac_dt);
		p.Btn_sprt_ac_dt.setFunctionKey(MCFunctionKey.F16);
		p.BtnPanel.add(p.Btn_sprt_ac_dt);
		p.Btn_sprt_ac_dt.setNextBeans(p.Btn_radd);
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
		p.Btn_rcopy.setNextBeans(p.Btn_menu_move_p_PPanel);
		p.BtnPanel.add(p.Btn_menu_move_p_PPanel);
		p.Btn_menu_move_p_PPanel.setNextBeans(p.Btn_ins);
		p.Btn_ins.setIcon("REGISTER");
		p.Btn_ins.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins);
		p.Btn_ins.setNextBeans(p.Btn_ins_noSchd);
		p.Btn_ins_noSchd.setIcon("REGISTER");
		p.Btn_ins_noSchd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins_noSchd);
		p.Btn_ins_noSchd.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_upd.setNextBeans(p.Btn_indiv_prnt_flg);
		p.BtnPanel.add(p.Btn_indiv_prnt_flg);
		p.Btn_indiv_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBE.MSBEP1020.BtnR.indiv_prnt_flg_META);
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBEP_XfrActReg p) {
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
		MSBEP_XfrActReg_MC.mcInitScreenOpe((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.mcInitCnd((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.mcInitHdrTab((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.mcInitHdr((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.mcInitHdr2((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.mcInitDtl((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.mcInitBtn((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.mcInitEastBtn((MSBEP_XfrActReg)this);

		// [INS]ステータスのモードの設定
		MSBEP_XfrActReg_MC.statusInitINS_ScreenOpe((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitINS_Cnd((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitINS_HdrTab((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitINS_Hdr((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitINS_Hdr2((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitINS_Dtl((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitINS_Btn((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitINS_EastBtn((MSBEP_XfrActReg)this);

		// [INS_INST]ステータスのモードの設定
		MSBEP_XfrActReg_MC.statusInitINS__INST_ScreenOpe((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitINS__INST_Cnd((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitINS__INST_HdrTab((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitINS__INST_Hdr((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitINS__INST_Hdr2((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitINS__INST_Dtl((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitINS__INST_Btn((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitINS__INST_EastBtn((MSBEP_XfrActReg)this);

		// [FIX_I]ステータスのモードの設定
		MSBEP_XfrActReg_MC.statusInitFIX__I_ScreenOpe((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitFIX__I_Cnd((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitFIX__I_HdrTab((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitFIX__I_Hdr((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitFIX__I_Hdr2((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitFIX__I_Dtl((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitFIX__I_Btn((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitFIX__I_EastBtn((MSBEP_XfrActReg)this);

		// [SRCH]ステータスのモードの設定
		MSBEP_XfrActReg_MC.statusInitSRCH_ScreenOpe((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitSRCH_Cnd((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitSRCH_HdrTab((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitSRCH_Hdr((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitSRCH_Hdr2((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitSRCH_Dtl((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitSRCH_Btn((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitSRCH_EastBtn((MSBEP_XfrActReg)this);

		// [UPD]ステータスのモードの設定
		MSBEP_XfrActReg_MC.statusInitUPD_ScreenOpe((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitUPD_Cnd((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitUPD_HdrTab((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitUPD_Hdr((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitUPD_Hdr2((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitUPD_Dtl((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitUPD_Btn((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitUPD_EastBtn((MSBEP_XfrActReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBEP_XfrActReg_MC.statusInitFIX__U_ScreenOpe((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitFIX__U_Cnd((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitFIX__U_HdrTab((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitFIX__U_Hdr((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitFIX__U_Hdr2((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitFIX__U_Dtl((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitFIX__U_Btn((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitFIX__U_EastBtn((MSBEP_XfrActReg)this);

		// [DEL]ステータスのモードの設定
		MSBEP_XfrActReg_MC.statusInitDEL_ScreenOpe((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitDEL_Cnd((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitDEL_HdrTab((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitDEL_Hdr((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitDEL_Hdr2((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitDEL_Dtl((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitDEL_Btn((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitDEL_EastBtn((MSBEP_XfrActReg)this);

		// [FIX_D]ステータスのモードの設定
		MSBEP_XfrActReg_MC.statusInitFIX__D_ScreenOpe((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitFIX__D_Cnd((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitFIX__D_HdrTab((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitFIX__D_Hdr((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitFIX__D_Hdr2((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitFIX__D_Dtl((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitFIX__D_Btn((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitFIX__D_EastBtn((MSBEP_XfrActReg)this);

		// [REF]ステータスのモードの設定
		MSBEP_XfrActReg_MC.statusInitREF_ScreenOpe((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitREF_Cnd((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitREF_HdrTab((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitREF_Hdr((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitREF_Hdr2((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitREF_Dtl((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitREF_Btn((MSBEP_XfrActReg)this);
		MSBEP_XfrActReg_MC.statusInitREF_EastBtn((MSBEP_XfrActReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBEP_XfrActReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_XfrActReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_srch_tgt_typ_nm.setListListener(p);
		p.Cnd_srch_tgt_typ_nm.addAllListener(p);
		p.Cnd_srch_tgt_typ.setListListener(p);
		p.Cnd_srch_tgt_typ.addAllListener(p);
		p.Cnd_srch_tgt_no.setListListener(p);
		p.Cnd_srch_tgt_no.addAllListener(p);
		p.Cnd_srch_inst.addAllListener(p);
		p.Cnd_srch_inst.setAPMethodName("doCnd_srch_inst");
		p.Cnd_srch_act.addAllListener(p);
		p.Cnd_srch_act.setAPMethodName("doCnd_srch_act");
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBEP_XfrActReg p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBEP_XfrActReg p) {
		p.Hdr_trd_cd.setListListener(p);
		p.Hdr_trd_cd.addAllListener(p);
		p.Hdr_trd_nm.setListListener(p);
		p.Hdr_trd_nm.addAllListener(p);
		p.Hdr_trd_ptn_typ.setListListener(p);
		p.Hdr_trd_ptn_typ.addAllListener(p);
		p.Hdr_xfr_act_no.setListListener(p);
		p.Hdr_xfr_act_no.addAllListener(p);
		p.Hdr_xfr_inst_no.setListListener(p);
		p.Hdr_xfr_inst_no.addAllListener(p);
		p.Hdr_gr_loc_cd.setListListener(p);
		p.Hdr_gr_loc_cd.addAllListener(p);
		p.Hdr_gr_loc_nm.setListListener(p);
		p.Hdr_gr_loc_nm.addAllListener(p);
		p.Hdr_gr_str_ln_tgt_flg.addAllListener(p);
		p.Hdr_gr_site_cd.setListListener(p);
		p.Hdr_gr_site_cd.addAllListener(p);
		p.Hdr_wg_cd.setListListener(p);
		p.Hdr_wg_cd.addAllListener(p);
		p.Hdr_wg_nm.setListListener(p);
		p.Hdr_wg_nm.addAllListener(p);
		p.Hdr_lg_grp_cd.setListListener(p);
		p.Hdr_lg_grp_cd.addAllListener(p);
		p.Hdr_lg_grp_nm.setListListener(p);
		p.Hdr_lg_grp_nm.addAllListener(p);
		p.Hdr_sppl_cd.setListListener(p);
		p.Hdr_sppl_cd.addAllListener(p);
		p.Hdr_cur_cd.setListListener(p);
		p.Hdr_cur_cd.addAllListener(p);
		p.Hdr_onr_prsppl_flg.addAllListener(p);
		p.Hdr_prov_basis_typ.setListListener(p);
		p.Hdr_prov_basis_typ.addAllListener(p);
		p.Hdr_act_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_immd_dlv_prnt_flg.addAllListener(p);
		p.Hdr_dlv_prnt_flg.addAllListener(p);
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
	protected static void mcInitHdr2(MSBEP_XfrActReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBEP_XfrActReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_pr_sts_typ.addAllListener(p);
		p.columnDtl_pr_sts_typ.setListListener(p);
		p.columnDtl_pr_sts_typ_nm.addAllListener(p);
		p.columnDtl_pr_sts_typ_nm.setListListener(p);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_asset_mng_typ.addAllListener(p);
		p.columnDtl_asset_mng_typ.setListListener(p);
		p.columnDtl_lot_mng_typ.addAllListener(p);
		p.columnDtl_lot_mng_typ.setListListener(p);
		p.columnDtl_sublot_mng_typ.addAllListener(p);
		p.columnDtl_sublot_mng_typ.setListListener(p);
		p.Dtl_lot_no_p_PPanel.columnLotNo_lot_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_lot_no_p_PPanel.columnLotNo_sublot_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_ver_flg.addAllListener(p);
		p.columnDtl_not_lot_mix_flg.addAllListener(p);
		p.columnDtl_not_sublot_mix_flg.addAllListener(p);
		p.columnDtl_trd_unit_cd.addAllListener(p);
		p.columnDtl_trd_unit_cd.setListListener(p);
		p.columnDtl_trd_unit_nm.addAllListener(p);
		p.columnDtl_trd_unit_nm.setListListener(p);
		p.columnDtl_trd_unit_dec_place.addAllListener(p);
		p.columnDtl_trd_unit_dec_place.setListListener(p);
		p.columnDtl_trd_unit_conv_qty.addAllListener(p);
		p.columnDtl_trd_unit_conv_qty.setListListener(p);
		p.columnDtl_trd_unit_rnd_typ.addAllListener(p);
		p.columnDtl_trd_unit_rnd_typ.setListListener(p);
		p.columnDtl_trd_unit_conv_base_qty.addAllListener(p);
		p.columnDtl_trd_unit_conv_base_qty.setListListener(p);
		p.columnDtl_abort_flg.addAllListener(p);
		p.columnDtl_base_unit_cd.addAllListener(p);
		p.columnDtl_base_unit_cd.setListListener(p);
		p.columnDtl_base_unit_nm.addAllListener(p);
		p.columnDtl_base_unit_nm.setListListener(p);
		p.columnDtl_base_unit_dec_place.addAllListener(p);
		p.columnDtl_base_unit_dec_place.setListListener(p);
		p.columnDtl_base_unit_dmn_qty.addAllListener(p);
		p.columnDtl_base_unit_dmn_qty.setListListener(p);
		p.columnDtl_base_unit_conv_qty.addAllListener(p);
		p.columnDtl_base_unit_conv_qty.setListListener(p);
		p.columnDtl_base_unit_rnd_typ.addAllListener(p);
		p.columnDtl_base_unit_rnd_typ.setListListener(p);
		p.columnDtl_cont_fctr_flg.addAllListener(p);
		p.columnDtl_cont_fctr_dec_place.addAllListener(p);
		p.columnDtl_cont_fctr_dec_place.setListListener(p);
		p.columnDtl_cont_fctr_rnd_typ.addAllListener(p);
		p.columnDtl_cont_fctr_rnd_typ.setListListener(p);
		p.columnDtl_gi_loc_cd.addAllListener(p);
		p.columnDtl_gi_loc_cd.setListListener(p);
		p.columnDtl_gi_loc_nm.addAllListener(p);
		p.columnDtl_gi_loc_nm.setListListener(p);
		p.columnDtl_gi_str_ln_tgt_flg.addAllListener(p);
		p.columnDtl_gi_site_cd.addAllListener(p);
		p.columnDtl_gi_site_cd.setListListener(p);
		p.columnDtl_gi_sppl_cd.addAllListener(p);
		p.columnDtl_gi_sppl_cd.setListListener(p);
		p.columnDtl_gr_str_ln_tgt_flg.addAllListener(p);
		p.columnDtl_quality_typ.addAllListener(p);
		p.columnDtl_quality_typ.setListListener(p);
		p.columnDtl_quality_typ_nm.addAllListener(p);
		p.columnDtl_quality_typ_nm.setListListener(p);
		p.columnDtl_gd_cd.addAllListener(p);
		p.columnDtl_gd_cd.setListListener(p);
		p.columnDtl_gd_nm.addAllListener(p);
		p.columnDtl_gd_nm.setListListener(p);
		p.columnDtl_stk_insp_typ.addAllListener(p);
		p.columnDtl_stk_insp_typ.setListListener(p);
		p.columnDtl_stk_insp_typ_nm.addAllListener(p);
		p.columnDtl_stk_insp_typ_nm.setListListener(p);
		p.columnDtl_sno1_mng_typ.addAllListener(p);
		p.columnDtl_sno1_mng_typ.setListListener(p);
		p.columnDtl_sno2_mng_typ.addAllListener(p);
		p.columnDtl_sno2_mng_typ.setListListener(p);
		p.columnDtl_sno3_mng_typ.addAllListener(p);
		p.columnDtl_sno3_mng_typ.setListListener(p);
		p.columnDtl_sno4_mng_typ.addAllListener(p);
		p.columnDtl_sno4_mng_typ.setListListener(p);
		p.columnDtl_stk_id_typ.addAllListener(p);
		p.columnDtl_stk_id_typ.setListListener(p);
		p.columnDtl_stk_id_typ_nm.addAllListener(p);
		p.columnDtl_stk_id_typ_nm.setListListener(p);
		p.columnDtl_gi_stk_arrv_bp_cd.addAllListener(p);
		p.columnDtl_gi_stk_arrv_bp_cd.setListListener(p);
		p.columnDtl_gi_stk_arrv_bp_nm.addAllListener(p);
		p.columnDtl_gi_stk_arrv_bp_nm.setListListener(p);
		p.columnDtl_rsn_cd.addAllListener(p);
		p.columnDtl_rsn_cd.setListListener(p);
		p.columnDtl_rsn_nm.addAllListener(p);
		p.columnDtl_rsn_nm.setListListener(p);
		p.columnDtl_acxfr_gi_flg.addAllListener(p);
		p.columnDtl_bd_dpt_cd.addAllListener(p);
		p.columnDtl_bd_dpt_cd.setListListener(p);
		p.columnDtl_bd_dpt_nm.addAllListener(p);
		p.columnDtl_bd_dpt_nm.setListListener(p);
		p.columnDtl_skip_chk_ship_flg.addAllListener(p);
		p.columnDtl_prov_typ.addAllListener(p);
		p.columnDtl_prov_typ.setListListener(p);
		p.columnDtl_prov_typ_nm.addAllListener(p);
		p.columnDtl_prov_typ_nm.setListListener(p);
		p.columnDtl_prov_basis_typ.addAllListener(p);
		p.columnDtl_prov_basis_typ.setListListener(p);
		p.columnDtl_prov_basis_typ_nm.addAllListener(p);
		p.columnDtl_prov_basis_typ_nm.setListListener(p);
		p.columnDtl_ret_prov_typ.addAllListener(p);
		p.columnDtl_ret_prov_typ.setListListener(p);
		p.columnDtl_ret_prov_typ_nm.addAllListener(p);
		p.columnDtl_ret_prov_typ_nm.setListListener(p);
		p.columnDtl_ret_prov_basis_typ.addAllListener(p);
		p.columnDtl_ret_prov_basis_typ.setListListener(p);
		p.columnDtl_ret_prov_basis_typ_nm.addAllListener(p);
		p.columnDtl_ret_prov_basis_typ_nm.setListListener(p);
		p.columnDtl_base_dlv_slip_no.addAllListener(p);
		p.columnDtl_base_dlv_slip_no.setListListener(p);
		p.columnDtl_base_prov_act_no.addAllListener(p);
		p.columnDtl_base_prov_act_no.setListListener(p);
		p.columnDtl_base_ac_dt.addAllListener(p);
		p.columnDtl_base_ac_dt.setListListener(p);
		p.columnDtl_wms_flg.addAllListener(p);
		p.columnDtl_intr_d_rmrks.addAllListener(p);
		p.columnDtl_intr_d_rmrks.setListListener(p);
		p.columnDtl_trd_d_rmrks.addAllListener(p);
		p.columnDtl_trd_d_rmrks.setListListener(p);
		p.columnDtl_sub_char1.addAllListener(p);
		p.columnDtl_sub_char1.setListListener(p);
		p.columnDtl_sub_char2.addAllListener(p);
		p.columnDtl_sub_char2.setListListener(p);
		p.columnDtl_sub_char3.addAllListener(p);
		p.columnDtl_sub_char3.setListListener(p);
		p.columnDtl_xfr_src_typ.addAllListener(p);
		p.columnDtl_xfr_src_typ.setListListener(p);
		p.columnDtl_xfr_src_typ_nm.addAllListener(p);
		p.columnDtl_xfr_src_typ_nm.setListListener(p);
		p.columnDtl_xfr_src_no.addAllListener(p);
		p.columnDtl_xfr_src_no.setListListener(p);
		p.columnDtl_xfr_schd_no.addAllListener(p);
		p.columnDtl_xfr_schd_no.setListListener(p);
		p.columnDtl_xfr_alloc_sts_no.addAllListener(p);
		p.columnDtl_xfr_alloc_sts_no.setListListener(p);
		p.columnDtl_xfr_inst_d_no.addAllListener(p);
		p.columnDtl_xfr_inst_d_no.setListListener(p);
		p.columnDtl_xfr_act_d_no.addAllListener(p);
		p.columnDtl_xfr_act_d_no.setListListener(p);
		p.columnDtl_ext_sys_cd.addAllListener(p);
		p.columnDtl_ext_sys_cd.setListListener(p);
		p.columnDtl_ext_sys_nm.addAllListener(p);
		p.columnDtl_ext_sys_nm.setListListener(p);
		p.columnDtl_ext_xfr_act_no.addAllListener(p);
		p.columnDtl_ext_xfr_act_no.setListListener(p);
		p.columnDtl_dlv_slip_no.addAllListener(p);
		p.columnDtl_dlv_slip_no.setListListener(p);
		p.columnDtl_dlv_slip_d_no.addAllListener(p);
		p.columnDtl_dlv_slip_d_no.setListListener(p);
		p.columnDtl_prov_schd_no.addAllListener(p);
		p.columnDtl_prov_schd_no.setListListener(p);
		p.columnDtl_ret_prov_schd_no.addAllListener(p);
		p.columnDtl_ret_prov_schd_no.setListListener(p);
		p.columnDtl_prov_act_no.addAllListener(p);
		p.columnDtl_prov_act_no.setListListener(p);
		p.columnDtl_ret_prov_act_no.addAllListener(p);
		p.columnDtl_ret_prov_act_no.setListListener(p);
		p.columnDtl_disp_seq.addAllListener(p);
		p.columnDtl_disp_seq.setListListener(p);
		p.columnDtl_trd_ptn_typ.addAllListener(p);
		p.columnDtl_trd_ptn_typ.setListListener(p);
		p.columnDtl_xfr_act_no.addAllListener(p);
		p.columnDtl_xfr_act_no.setListListener(p);
		p.columnDtl_act_d_upd_cntr.addAllListener(p);
		p.columnDtl_act_d_upd_cntr.setListListener(p);
		p.columnDtl_alloc_sts_upd_cntr.addAllListener(p);
		p.columnDtl_alloc_sts_upd_cntr.setListListener(p);
		p.columnDtl_base_unit_qty_bef.addAllListener(p);
		p.columnDtl_base_unit_qty_bef.setListListener(p);
		p.columnDtl_base_unit_act_qty_sum.addAllListener(p);
		p.columnDtl_base_unit_act_qty_sum.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_XfrActReg p) {
		p.Btn_prnt_dlv.addAllListener(p);
		p.Btn_prnt_dlv.setAPMethodName("doBtn_prnt_dlv");
		p.Btn_sprt_ac_dt.addAllListener(p);
		p.Btn_sprt_ac_dt.setAPMethodName("doBtn_sprt_ac_dt");
		p.Btn_radd.addAllListener(p);
		p.Btn_radd.setAPMethodName("doBtn_radd");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_ins.addAllListener(p);
		p.Btn_ins.setAPMethodName("doBtn_ins");
		p.Btn_ins_noSchd.addAllListener(p);
		p.Btn_ins_noSchd.setAPMethodName("doBtn_ins_noSchd");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_indiv_prnt_flg.addAllListener(p);
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBEP_XfrActReg p) {
	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBEP_XfrActReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBEP_XfrActReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ_nm.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_no.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_srch_inst.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_srch_act.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_HdrTab(MSBEP_XfrActReg p){

	}

	/**
	 * [INS]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr(MSBEP_XfrActReg p){
		p.Hdr_trd_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_trd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_xfr_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_xfr_inst_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_gr_loc_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_gr_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_gr_str_ln_tgt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_gr_site_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_lg_grp_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_lg_grp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_cur_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_onr_prsppl_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_prov_basis_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_xfr_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_act_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_immd_dlv_prnt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_dlv_prnt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_trd_rmrks.putMode(p, INS, MCMode.ENABLE);
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

	}

	/**
	 * [INS]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr2(MSBEP_XfrActReg p){

	}

	/**
	 * [INS]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl(MSBEP_XfrActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_asset_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.REQUIRED);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_not_sublot_mix_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_abort_flg.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dmn_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_act_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_schd_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_inst_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_gi_loc_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_gi_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_gi_str_ln_tgt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_gi_site_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_gi_sppl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_gi_str_ln_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.ENABLE);
		p.columnDtl_gr_str_ln_tgt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_gr_str_ln_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.ENABLE);
		p.columnDtl_quality_typ.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_quality_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_gd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_stk_insp_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_sno1_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_stk_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.REQUIRED);
		p.columnDtl_gi_stk_arrv_bp_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_gi_stk_arrv_bp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_rsn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_acxfr_gi_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_bd_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_prov_typ.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_prov_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_base_dlv_slip_no.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_base_prov_act_no.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_base_ac_dt.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_wms_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_trd_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_xfr_src_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_xfr_src_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_xfr_src_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_xfr_alloc_sts_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_xfr_inst_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_xfr_act_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ext_xfr_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_prov_schd_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_schd_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_prov_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_xfr_act_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_act_d_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_alloc_sts_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_unit_act_qty_sum.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBEP_XfrActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.ENABLE);
		p.Btn_prnt_dlv.putMode(p, INS, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, INS, MCMode.ENABLE);
		p.Btn_radd.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, INS, MCMode.ENABLE);
		p.Btn_menu_move_p_PPanel.putStatus(INS, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_ins.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_ins_noSchd.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_indiv_prnt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBEP_XfrActReg p){

	}

	/**
	 * [INS_INST]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__INST_ScreenOpe(MSBEP_XfrActReg p){

	}

	/**
	 * [INS_INST]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__INST_Cnd(MSBEP_XfrActReg p){
		p.Cnd_ope_Group.putMode(p, INS_INST, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ_nm.putMode(p, INS_INST, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_no.putMode(p, INS_INST, MCMode.REQUIRED);
		p.Cnd_srch_inst.putMode(p, INS_INST, MCMode.ENABLE);
		p.Cnd_srch_act.putMode(p, INS_INST, MCMode.INVISIBLE);

	}

	/**
	 * [INS_INST]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__INST_HdrTab(MSBEP_XfrActReg p){

	}

	/**
	 * [INS_INST]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS__INST_Hdr(MSBEP_XfrActReg p){
		p.Hdr_trd_cd.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.Hdr_xfr_act_no.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.Hdr_xfr_inst_no.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.Hdr_gr_loc_cd.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.Hdr_gr_loc_nm.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.Hdr_gr_str_ln_tgt_flg.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.Hdr_gr_site_cd.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.Hdr_lg_grp_cd.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.Hdr_lg_grp_nm.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.Hdr_cur_cd.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.Hdr_onr_prsppl_flg.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.Hdr_prov_basis_typ.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.Hdr_xfr_dt_p_PPanel.putStatus(INS_INST, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_ac_dt_p_PPanel.putStatus(INS_INST, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(INS_INST, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_act_usr_dpt_p_PPanel.putStatus(INS_INST, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_immd_dlv_prnt_flg.putMode(p, INS_INST, MCMode.REQUIRED);
		p.Hdr_dlv_prnt_flg.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, INS_INST, MCMode.ENABLE);
		p.Hdr_trd_rmrks.putMode(p, INS_INST, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, INS_INST, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, INS_INST, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, INS_INST, MCMode.ENABLE);
		p.Hdr_ins_usr_id.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS_INST, MCMode.READ_ONLY);

	}

	/**
	 * [INS_INST]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitINS__INST_Hdr2(MSBEP_XfrActReg p){

	}

	/**
	 * [INS_INST]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS__INST_Dtl(MSBEP_XfrActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(INS_INST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_asset_mng_typ.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(INS_INST, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.REQUIRED);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(INS_INST, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.columnDtl_not_sublot_mix_flg.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, INS_INST, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(INS_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_abort_flg.putMode(p, INS_INST, MCMode.REQUIRED);
		p.columnDtl_base_unit_cd.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dmn_qty.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_qty.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(INS_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_act_qty_p_PPanel.putStatus(INS_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_schd_qty_p_PPanel.putStatus(INS_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_inst_qty_p_PPanel.putStatus(INS_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(INS_INST, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(INS_INST, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(INS_INST, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(INS_INST, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(INS_INST, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_gi_loc_cd.putMode(p, INS_INST, MCMode.REQUIRED);
		p.columnDtl_gi_loc_nm.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_gi_str_ln_tgt_flg.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.columnDtl_gi_site_cd.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.columnDtl_gi_sppl_cd.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.Dtl_gi_str_ln_p_PPanel.putStatus(INS_INST, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.ENABLE);
		p.columnDtl_gr_str_ln_tgt_flg.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.Dtl_gr_str_ln_p_PPanel.putStatus(INS_INST, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.ENABLE);
		p.columnDtl_quality_typ.putMode(p, INS_INST, MCMode.REQUIRED);
		p.columnDtl_quality_typ_nm.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, INS_INST, MCMode.REQUIRED);
		p.columnDtl_gd_nm.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ.putMode(p, INS_INST, MCMode.REQUIRED);
		p.columnDtl_stk_insp_typ_nm.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_sno1_mng_typ.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(INS_INST, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(INS_INST, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, INS_INST, MCMode.REQUIRED);
		p.columnDtl_stk_id_typ_nm.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(INS_INST, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.REQUIRED);
		p.columnDtl_gi_stk_arrv_bp_cd.putMode(p, INS_INST, MCMode.ENABLE);
		p.columnDtl_gi_stk_arrv_bp_nm.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, INS_INST, MCMode.ENABLE);
		p.columnDtl_rsn_nm.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_acxfr_gi_flg.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, INS_INST, MCMode.ENABLE);
		p.columnDtl_bd_dpt_nm.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, INS_INST, MCMode.REQUIRED);
		p.columnDtl_prov_typ.putMode(p, INS_INST, MCMode.ENABLE);
		p.columnDtl_prov_typ_nm.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ_nm.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ_nm.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_base_dlv_slip_no.putMode(p, INS_INST, MCMode.ENABLE);
		p.columnDtl_base_prov_act_no.putMode(p, INS_INST, MCMode.ENABLE);
		p.columnDtl_base_ac_dt.putMode(p, INS_INST, MCMode.ENABLE);
		p.columnDtl_wms_flg.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, INS_INST, MCMode.ENABLE);
		p.columnDtl_trd_d_rmrks.putMode(p, INS_INST, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, INS_INST, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, INS_INST, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, INS_INST, MCMode.ENABLE);
		p.columnDtl_xfr_src_typ.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_xfr_src_typ_nm.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_xfr_src_no.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_xfr_alloc_sts_no.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_xfr_inst_d_no.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_xfr_act_d_no.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_ext_xfr_act_no.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_prov_schd_no.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_schd_no.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_prov_act_no.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_act_no.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, INS_INST, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.columnDtl_xfr_act_no.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.columnDtl_act_d_upd_cntr.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.columnDtl_alloc_sts_upd_cntr.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.columnDtl_base_unit_act_qty_sum.putMode(p, INS_INST, MCMode.INVISIBLE);

	}

	/**
	 * [INS_INST]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__INST_Btn(MSBEP_XfrActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(INS_INST, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.ENABLE);
		p.Btn_prnt_dlv.putMode(p, INS_INST, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, INS_INST, MCMode.ENABLE);
		p.Btn_radd.putMode(p, INS_INST, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, INS_INST, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, INS_INST, MCMode.ENABLE);
		p.Btn_menu_move_p_PPanel.putStatus(INS_INST, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_ins.putMode(p, INS_INST, MCMode.ENABLE);
		p.Btn_ins_noSchd.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, INS_INST, MCMode.INVISIBLE);
		p.Btn_indiv_prnt_flg.putMode(p, INS_INST, MCMode.REQUIRED);
		p.Btn_del.putMode(p, INS_INST, MCMode.DISABLE);

	}

	/**
	 * [INS_INST]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__INST_EastBtn(MSBEP_XfrActReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBEP_XfrActReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBEP_XfrActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_no.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_srch_inst.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_srch_act.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_HdrTab(MSBEP_XfrActReg p){

	}

	/**
	 * [FIX_I]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr(MSBEP_XfrActReg p){
		p.Hdr_trd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_xfr_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_xfr_inst_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_gr_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_gr_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_gr_str_ln_tgt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_gr_site_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_lg_grp_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_lg_grp_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_cur_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_onr_prsppl_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_prov_basis_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_xfr_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_act_usr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_immd_dlv_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
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
	protected static void statusInitFIX__I_Hdr2(MSBEP_XfrActReg p){

	}

	/**
	 * [FIX_I]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl(MSBEP_XfrActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_not_sublot_mix_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dmn_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_act_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_schd_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_inst_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_gi_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_gi_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_gi_str_ln_tgt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_gi_site_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_gi_sppl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_gi_str_ln_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_gr_str_ln_tgt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_gr_str_ln_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_gi_stk_arrv_bp_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_gi_stk_arrv_bp_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_acxfr_gi_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_prov_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_prov_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_dlv_slip_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_xfr_src_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_xfr_src_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_xfr_src_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_xfr_alloc_sts_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_xfr_inst_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_xfr_act_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ext_xfr_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_prov_schd_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_schd_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_prov_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_xfr_act_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_act_d_upd_cntr.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_alloc_sts_upd_cntr.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_unit_act_qty_sum.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBEP_XfrActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_prnt_dlv.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_I, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_ins_noSchd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_indiv_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MSBEP_XfrActReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBEP_XfrActReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBEP_XfrActReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch_inst.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_act.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBEP_XfrActReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBEP_XfrActReg p){
		p.Hdr_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_xfr_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_xfr_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_gr_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_gr_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_gr_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_gr_site_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_lg_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_lg_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_cur_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_onr_prsppl_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_prov_basis_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_xfr_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_act_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_immd_dlv_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
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
	protected static void statusInitSRCH_Hdr2(MSBEP_XfrActReg p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBEP_XfrActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_not_sublot_mix_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dmn_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_act_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_schd_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_inst_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_gi_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_gi_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_gi_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_gi_site_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_gi_sppl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_gi_str_ln_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_gr_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_gr_str_ln_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_gi_stk_arrv_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_gi_stk_arrv_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_acxfr_gi_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prov_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prov_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_xfr_src_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_xfr_src_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_xfr_src_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_xfr_alloc_sts_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_xfr_inst_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_xfr_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_xfr_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prov_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prov_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_xfr_act_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_act_d_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_alloc_sts_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_act_qty_sum.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBEP_XfrActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_prnt_dlv.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(SRCH, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_ins_noSchd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBEP_XfrActReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBEP_XfrActReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBEP_XfrActReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch_inst.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_srch_act.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrTab(MSBEP_XfrActReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MSBEP_XfrActReg p){
		p.Hdr_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_xfr_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_xfr_inst_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_gr_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_gr_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_gr_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_gr_site_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_lg_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_cur_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_onr_prsppl_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_prov_basis_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_xfr_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_act_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_immd_dlv_prnt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_dlv_prnt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_trd_rmrks.putMode(p, UPD, MCMode.ENABLE);
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

	}

	/**
	 * [UPD]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr2(MSBEP_XfrActReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBEP_XfrActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_asset_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.REQUIRED);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_not_sublot_mix_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_abort_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dmn_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_act_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_schd_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_inst_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_gi_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_gi_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_gi_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_gi_site_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_gi_sppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_gi_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.ENABLE);
		p.columnDtl_gr_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_gr_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.ENABLE);
		p.columnDtl_quality_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_quality_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_gd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_stk_insp_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_stk_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.REQUIRED);
		p.columnDtl_gi_stk_arrv_bp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_gi_stk_arrv_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_acxfr_gi_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bd_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_prov_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_prov_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_dlv_slip_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_base_prov_act_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_base_ac_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_wms_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_trd_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_xfr_src_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_xfr_src_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_xfr_src_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_xfr_alloc_sts_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_xfr_inst_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_xfr_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ext_xfr_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prov_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prov_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_xfr_act_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_act_d_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_alloc_sts_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_act_qty_sum.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBEP_XfrActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.ENABLE);
		p.Btn_prnt_dlv.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_menu_move_p_PPanel.putStatus(UPD, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_ins.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_ins_noSchd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_indiv_prnt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBEP_XfrActReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBEP_XfrActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBEP_XfrActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_no.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_srch_inst.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Cnd_srch_act.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrTab(MSBEP_XfrActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MSBEP_XfrActReg p){
		p.Hdr_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_xfr_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_xfr_inst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_gr_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_gr_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_gr_str_ln_tgt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_gr_site_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_lg_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_lg_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_cur_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_onr_prsppl_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_prov_basis_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_xfr_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_act_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_immd_dlv_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
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
	protected static void statusInitFIX__U_Hdr2(MSBEP_XfrActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MSBEP_XfrActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_not_sublot_mix_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dmn_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_act_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_schd_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_inst_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_gi_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_gi_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_gi_str_ln_tgt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_gi_site_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_gi_sppl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_gi_str_ln_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_gr_str_ln_tgt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_gr_str_ln_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_gi_stk_arrv_bp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_gi_stk_arrv_bp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_acxfr_gi_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_prov_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_prov_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_dlv_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_xfr_src_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_xfr_src_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_xfr_src_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_xfr_alloc_sts_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_xfr_inst_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_xfr_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ext_xfr_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_prov_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_prov_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_xfr_act_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_act_d_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_alloc_sts_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_unit_act_qty_sum.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBEP_XfrActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_prnt_dlv.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_U, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_ins_noSchd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBEP_XfrActReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBEP_XfrActReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBEP_XfrActReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_no.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch_inst.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_srch_act.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HdrTab(MSBEP_XfrActReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MSBEP_XfrActReg p){
		p.Hdr_trd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_xfr_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_xfr_inst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_gr_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_gr_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_gr_str_ln_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_gr_site_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_lg_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_lg_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_cur_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_onr_prsppl_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_prov_basis_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_xfr_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_act_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_immd_dlv_prnt_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Hdr_dlv_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
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
	protected static void statusInitDEL_Hdr2(MSBEP_XfrActReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MSBEP_XfrActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_not_sublot_mix_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dmn_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_act_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_schd_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_inst_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_gi_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_gi_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_gi_str_ln_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_gi_site_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_gi_sppl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_gi_str_ln_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_gr_str_ln_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_gr_str_ln_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_gi_stk_arrv_bp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_gi_stk_arrv_bp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_acxfr_gi_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_prov_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_prov_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_dlv_slip_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_xfr_src_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_xfr_src_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_xfr_src_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_xfr_alloc_sts_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_xfr_inst_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_xfr_act_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ext_xfr_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_prov_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_prov_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_xfr_act_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_act_d_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_alloc_sts_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_act_qty_sum.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBEP_XfrActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_prnt_dlv.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(DEL, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_ins_noSchd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBEP_XfrActReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MSBEP_XfrActReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBEP_XfrActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_no.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch_inst.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Cnd_srch_act.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_HdrTab(MSBEP_XfrActReg p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MSBEP_XfrActReg p){
		p.Hdr_trd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_xfr_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_xfr_inst_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_gr_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_gr_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_gr_str_ln_tgt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_gr_site_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_lg_grp_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_lg_grp_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_cur_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_onr_prsppl_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_prov_basis_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_xfr_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_act_usr_dpt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_immd_dlv_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
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
	protected static void statusInitFIX__D_Hdr2(MSBEP_XfrActReg p){

	}

	/**
	 * [FIX_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl(MSBEP_XfrActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_not_sublot_mix_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dmn_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_act_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_schd_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_inst_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_gi_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_gi_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_gi_str_ln_tgt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_gi_site_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_gi_sppl_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_gi_str_ln_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_gr_str_ln_tgt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_gr_str_ln_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_gi_stk_arrv_bp_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_gi_stk_arrv_bp_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_acxfr_gi_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_prov_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_prov_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_dlv_slip_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_xfr_src_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_xfr_src_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_xfr_src_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_xfr_alloc_sts_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_xfr_inst_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_xfr_act_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ext_xfr_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_prov_schd_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_schd_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_prov_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_xfr_act_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_act_d_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_alloc_sts_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_base_unit_act_qty_sum.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBEP_XfrActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_prnt_dlv.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_D, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Btn_ins_noSchd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBEP_XfrActReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBEP_XfrActReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBEP_XfrActReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch_inst.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_srch_act.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBEP_XfrActReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBEP_XfrActReg p){
		p.Hdr_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_xfr_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_xfr_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_gr_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_gr_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_gr_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_gr_site_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_lg_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_cur_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_onr_prsppl_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_prov_basis_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_xfr_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_act_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_immd_dlv_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_rmrks.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_Hdr2(MSBEP_XfrActReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MSBEP_XfrActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_not_sublot_mix_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_dmn_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_act_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_schd_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_inst_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl_gi_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_gi_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_gi_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_gi_site_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_gi_sppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_gi_str_ln_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_gr_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_gr_str_ln_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_insp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_gi_stk_arrv_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_gi_stk_arrv_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_acxfr_gi_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prov_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prov_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_dlv_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_xfr_src_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_xfr_src_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_xfr_src_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_xfr_alloc_sts_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_xfr_inst_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_xfr_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ext_xfr_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prov_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prov_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_xfr_act_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_act_d_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_alloc_sts_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_act_qty_sum.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBEP_XfrActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_prnt_dlv.putMode(p, REF, MCMode.ENABLE);
		p.Btn_sprt_ac_dt.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(REF, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_ins_noSchd.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBEP_XfrActReg p){

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
		MSBEP_XfrActReg_MC.setTableConfigDtl((MSBEP_XfrActReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBEP_XfrActReg p) {
		p.columnDtl_pr_sts_typ.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.pr_sts_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pr_sts_typ);
		p.columnDtl_pr_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.pr_sts_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pr_sts_typ_nm);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtl_itm_sub1, p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_lot_mng_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_asset_mng_typ, p.columnDtl_ver_flg, p.columnDtl_cont_fctr_flg, p.columnDtl_std_cont_fctr, p.columnDtl_cont_fctr_unit_cd, p.columnDtl_cont_fctr_unit_nm, p.columnDtl_cont_fctr_rnd_typ, p.columnDtl_cont_fctr_dec_place, p.columnDtl_skip_chk_ship_flg);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_lot_mng_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_asset_mng_typ, p.columnDtl_ver_flg, p.columnDtl_cont_fctr_flg, p.columnDtl_std_cont_fctr, p.columnDtl_cont_fctr_unit_cd, p.columnDtl_cont_fctr_unit_nm, p.columnDtl_cont_fctr_rnd_typ, p.columnDtl_cont_fctr_dec_place, p.columnDtl_skip_chk_ship_flg);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_lot_mng_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_asset_mng_typ, p.columnDtl_ver_flg, p.columnDtl_cont_fctr_flg, p.columnDtl_std_cont_fctr, p.columnDtl_cont_fctr_unit_cd, p.columnDtl_cont_fctr_unit_nm, p.columnDtl_cont_fctr_rnd_typ, p.columnDtl_cont_fctr_dec_place, p.columnDtl_skip_chk_ship_flg);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtl_itm_nm, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_lot_mng_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_asset_mng_typ, p.columnDtl_ver_flg, p.columnDtl_cont_fctr_flg, p.columnDtl_std_cont_fctr, p.columnDtl_cont_fctr_unit_cd, p.columnDtl_cont_fctr_rnd_typ, p.columnDtl_cont_fctr_dec_place, p.columnDtl_skip_chk_ship_flg);
		p.columnDtl_asset_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.asset_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asset_mng_typ);
		p.columnDtl_lot_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.lot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_mng_typ);
		p.columnDtl_sublot_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.sublot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_mng_typ);
		p.DtlTable.addTable(p.Dtl_lot_no_p_PPanel.LotNoTable);
		p.Dtl_lot_no_p_PPanel.columnLotNo_lot_no.setLinkBeans(p.columnDtl_sublot_no, p.columnDtl_ver_no, p.columnDtl_act_cont_fctr);
		p.Dtl_lot_no_p_PPanel.columnLotNo_sublot_no.setLinkBeans(p.columnDtl_ver_no, p.columnDtl_act_cont_fctr);
		p.columnDtl_ver_flg.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.ver_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ver_flg);
		p.DtlTable.addTable(p.Dtl_ver_no_p_PPanel.VerNoTable);
		p.columnDtl_not_lot_mix_flg.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.not_lot_mix_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_not_lot_mix_flg);
		p.columnDtl_not_sublot_mix_flg.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.not_sublot_mix_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_not_sublot_mix_flg);
		p.columnDtl_trd_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.trd_unit_cd_META);
		p.columnDtl_trd_unit_cd.addLinkBeans(p.columnDtl_trd_unit_nm,p.columnDtl_trd_unit_conv_base_qty,p.columnDtl_trd_unit_dec_place,p.columnDtl_trd_unit_conv_qty,p.columnDtl_trd_unit_rnd_typ);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_cd);
		p.columnDtl_trd_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.trd_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_nm);
		p.columnDtl_trd_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.trd_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_dec_place);
		p.columnDtl_trd_unit_conv_qty.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.trd_unit_conv_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_conv_qty);
		p.columnDtl_trd_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.trd_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_rnd_typ);
		p.columnDtl_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.trd_unit_conv_base_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_conv_base_qty);
		p.DtlTable.addTable(p.Dtl_trd_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_abort_flg.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.abort_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_abort_flg);
		p.columnDtl_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_cd);
		p.columnDtl_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_nm);
		p.columnDtl_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.base_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_dec_place);
		p.columnDtl_base_unit_dmn_qty.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.base_unit_dmn_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_dmn_qty);
		p.columnDtl_base_unit_conv_qty.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.base_unit_conv_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_conv_qty);
		p.columnDtl_base_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.base_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_rnd_typ);
		p.DtlTable.addTable(p.Dtl_base_unit_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_base_unit_act_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_base_unit_schd_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_base_unit_inst_qty_p_PPanel.QtyTable);
		p.columnDtl_cont_fctr_flg.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.cont_fctr_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_flg);
		p.DtlTable.addTable(p.Dtl_cont_fctr_unit_p_PPanel.ContFctrUnitTable);
		p.columnDtl_cont_fctr_dec_place.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.cont_fctr_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_dec_place);
		p.columnDtl_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.cont_fctr_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_rnd_typ);
		p.DtlTable.addTable(p.Dtl_act_cont_fctr_p_PPanel.ActContFctrTable);
		p.DtlTable.addTable(p.Dtl_act_cont_qty_p_PPanel.ContQtyTable);
		p.DtlTable.addTable(p.Dtl_std_cont_fctr_p_PPanel.StdContFctrTable);
		p.DtlTable.addTable(p.Dtl_std_cont_qty_p_PPanel.ContQtyTable);
		p.columnDtl_gi_loc_cd.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.gi_loc_cd_META);
		p.columnDtl_gi_loc_cd.addLinkBeans(p.columnDtl_gi_loc_nm,p.columnDtl_gi_str_ln_tgt_flg,p.columnDtl_gi_sppl_cd,p.columnDtl_gi_site_cd);
		p.DtlTable.addColumnConfig(p.columnDtl_gi_loc_cd);
		p.columnDtl_gi_loc_nm.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.gi_loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gi_loc_nm);
		p.columnDtl_gi_str_ln_tgt_flg.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.gi_str_ln_tgt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gi_str_ln_tgt_flg);
		p.columnDtl_gi_site_cd.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.gi_site_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gi_site_cd);
		p.columnDtl_gi_sppl_cd.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.gi_sppl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gi_sppl_cd);
		p.DtlTable.addTable(p.Dtl_gi_str_ln_p_PPanel.StrLnTable);
		p.columnDtl_gr_str_ln_tgt_flg.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.gr_str_ln_tgt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gr_str_ln_tgt_flg);
		p.DtlTable.addTable(p.Dtl_gr_str_ln_p_PPanel.StrLnTable);
		p.columnDtl_quality_typ.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.quality_typ_META);
		p.columnDtl_quality_typ.addLinkBeans(p.columnDtl_quality_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_quality_typ);
		p.columnDtl_quality_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.quality_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_quality_typ_nm);
		p.columnDtl_gd_cd.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.gd_cd_META);
		p.columnDtl_gd_cd.addLinkBeans(p.columnDtl_gd_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_gd_cd);
		p.columnDtl_gd_nm.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.gd_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gd_nm);
		p.columnDtl_stk_insp_typ.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.stk_insp_typ_META);
		p.columnDtl_stk_insp_typ.addLinkBeans(p.columnDtl_stk_insp_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_insp_typ);
		p.columnDtl_stk_insp_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.stk_insp_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_insp_typ_nm);
		p.columnDtl_sno1_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.sno1_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_mng_typ);
		p.columnDtl_sno2_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.sno2_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_mng_typ);
		p.columnDtl_sno3_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.sno3_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_mng_typ);
		p.columnDtl_sno4_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.sno4_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_mng_typ);
		p.DtlTable.addTable(p.Dtl_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.DtlTable.addTable(p.Dtl_schd_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnDtl_stk_id_typ.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.stk_id_typ_META);
		p.columnDtl_stk_id_typ.addLinkBeans(p.columnDtl_stk_id_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_id_typ);
		p.columnDtl_stk_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.stk_id_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_id_typ_nm);
		p.DtlTable.addTable(p.Dtl_stk_bp_p_PPanel.StkBpTable);
		p.columnDtl_gi_stk_arrv_bp_cd.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.gi_stk_arrv_bp_cd_META);
		p.columnDtl_gi_stk_arrv_bp_cd.addLinkBeans(p.columnDtl_gi_stk_arrv_bp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_gi_stk_arrv_bp_cd);
		p.columnDtl_gi_stk_arrv_bp_nm.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.gi_stk_arrv_bp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gi_stk_arrv_bp_nm);
		p.columnDtl_rsn_cd.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.rsn_cd_META);
		p.columnDtl_rsn_cd.addLinkBeans(p.columnDtl_rsn_nm,p.columnDtl_acxfr_gi_flg);
		p.DtlTable.addColumnConfig(p.columnDtl_rsn_cd);
		p.columnDtl_rsn_nm.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.rsn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rsn_nm);
		p.columnDtl_acxfr_gi_flg.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.acxfr_gi_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_acxfr_gi_flg);
		p.columnDtl_bd_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.bd_dpt_cd_META);
		p.columnDtl_bd_dpt_cd.addLinkBeans(p.columnDtl_bd_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_dpt_cd);
		p.columnDtl_bd_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.bd_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_dpt_nm);
		p.columnDtl_skip_chk_ship_flg.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.skip_chk_ship_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_skip_chk_ship_flg);
		p.columnDtl_prov_typ.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.prov_typ_META);
		p.columnDtl_prov_typ.addLinkBeans(p.columnDtl_prov_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_typ);
		p.columnDtl_prov_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.prov_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_typ_nm);
		p.columnDtl_prov_basis_typ.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.prov_basis_typ_META);
		p.columnDtl_prov_basis_typ.addLinkBeans(p.columnDtl_prov_basis_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_basis_typ);
		p.columnDtl_prov_basis_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.prov_basis_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_basis_typ_nm);
		p.columnDtl_ret_prov_typ.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.ret_prov_typ_META);
		p.columnDtl_ret_prov_typ.addLinkBeans(p.columnDtl_ret_prov_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ret_prov_typ);
		p.columnDtl_ret_prov_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.ret_prov_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ret_prov_typ_nm);
		p.columnDtl_ret_prov_basis_typ.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.ret_prov_basis_typ_META);
		p.columnDtl_ret_prov_basis_typ.addLinkBeans(p.columnDtl_ret_prov_basis_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ret_prov_basis_typ);
		p.columnDtl_ret_prov_basis_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.ret_prov_basis_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ret_prov_basis_typ_nm);
		p.columnDtl_base_dlv_slip_no.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.base_dlv_slip_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_dlv_slip_no);
		p.columnDtl_base_prov_act_no.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.base_prov_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_prov_act_no);
		p.columnDtl_base_ac_dt.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.base_ac_dt_META);
		p.columnDtl_base_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_base_ac_dt);
		p.columnDtl_wms_flg.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.wms_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wms_flg);
		p.columnDtl_intr_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.intr_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_intr_d_rmrks);
		p.columnDtl_trd_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.trd_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_d_rmrks);
		p.columnDtl_sub_char1.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char1);
		p.columnDtl_sub_char2.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char2);
		p.columnDtl_sub_char3.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char3);
		p.columnDtl_xfr_src_typ.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.xfr_src_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xfr_src_typ);
		p.columnDtl_xfr_src_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.xfr_src_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xfr_src_typ_nm);
		p.columnDtl_xfr_src_no.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.xfr_src_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xfr_src_no);
		p.columnDtl_xfr_schd_no.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.xfr_schd_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xfr_schd_no);
		p.columnDtl_xfr_alloc_sts_no.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.xfr_alloc_sts_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xfr_alloc_sts_no);
		p.columnDtl_xfr_inst_d_no.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.xfr_inst_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xfr_inst_d_no);
		p.columnDtl_xfr_act_d_no.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.xfr_act_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xfr_act_d_no);
		p.columnDtl_ext_sys_cd.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.ext_sys_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_cd);
		p.columnDtl_ext_sys_nm.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.ext_sys_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_nm);
		p.columnDtl_ext_xfr_act_no.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.ext_xfr_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_xfr_act_no);
		p.columnDtl_dlv_slip_no.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.dlv_slip_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_no);
		p.columnDtl_dlv_slip_d_no.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.dlv_slip_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_d_no);
		p.columnDtl_prov_schd_no.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.prov_schd_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_schd_no);
		p.columnDtl_ret_prov_schd_no.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.ret_prov_schd_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ret_prov_schd_no);
		p.columnDtl_prov_act_no.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.prov_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_act_no);
		p.columnDtl_ret_prov_act_no.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.ret_prov_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ret_prov_act_no);
		p.columnDtl_disp_seq.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.disp_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_disp_seq);
		p.columnDtl_trd_ptn_typ.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.trd_ptn_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_ptn_typ);
		p.columnDtl_xfr_act_no.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.xfr_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xfr_act_no);
		p.columnDtl_act_d_upd_cntr.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.act_d_upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_act_d_upd_cntr);
		p.columnDtl_alloc_sts_upd_cntr.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.alloc_sts_upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alloc_sts_upd_cntr);
		p.columnDtl_base_unit_qty_bef.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.base_unit_qty_bef_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_qty_bef);
		p.columnDtl_base_unit_act_qty_sum.setMeta(mcframe.clientMSBE.MSBEP1020.DtlR.base_unit_act_qty_sum_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_act_qty_sum);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_srch_tgt_typ_nm.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_srch_tgt_typ_nm.getListConfig().setPutter(getCnd_srch_tgt_typ_nm_ListPutter());
		Hdr_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_trd_cd.getListConfig().setPutter(getHdr_trd_cd_ListPutter());
		Hdr_gr_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_gr_loc_cd.getListConfig().setPutter(getHdr_gr_loc_cd_ListPutter());
		Hdr_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_lg_grp_cd.getListConfig().setPutter(getHdr_lg_grp_cd_ListPutter());
		Hdr_sppl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_sppl_cd.getListConfig().setPutter(getHdr_sppl_cd_ListPutter());
		Hdr_act_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_act_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getHdr_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		columnDtl_pr_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_pr_sts_typ.getListConfig().setPutter(getDtl_pr_sts_typ_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		Dtl_lot_no_p_PPanel.columnLotNo_lot_no.getListConfig().setPutter(getDtl_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter());
		Dtl_lot_no_p_PPanel.columnLotNo_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_lot_no_p_PPanel.columnLotNo_sublot_no.getListConfig().setPutter(getDtl_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter());
		columnDtl_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_trd_unit_cd.getListConfig().setPutter(getDtl_trd_unit_cd_ListPutter());
		columnDtl_gi_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_gi_loc_cd.getListConfig().setPutter(getDtl_gi_loc_cd_ListPutter());
		columnDtl_quality_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_quality_typ.getListConfig().setPutter(getDtl_quality_typ_ListPutter());
		columnDtl_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_gd_cd.getListConfig().setPutter(getDtl_gd_cd_ListPutter());
		columnDtl_stk_insp_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_stk_insp_typ.getListConfig().setPutter(getDtl_stk_insp_typ_ListPutter());
		columnDtl_stk_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_stk_id_typ.getListConfig().setPutter(getDtl_stk_id_typ_ListPutter());
		columnDtl_gi_stk_arrv_bp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_gi_stk_arrv_bp_cd.getListConfig().setPutter(getDtl_gi_stk_arrv_bp_cd_ListPutter());
		columnDtl_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_rsn_cd.getListConfig().setPutter(getDtl_rsn_cd_ListPutter());
		columnDtl_bd_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_bd_dpt_cd.getListConfig().setPutter(getDtl_bd_dpt_cd_ListPutter());
		columnDtl_prov_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_prov_typ.getListConfig().setPutter(getDtl_prov_typ_ListPutter());
		columnDtl_prov_basis_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_prov_basis_typ.getListConfig().setPutter(getDtl_prov_basis_typ_ListPutter());
		columnDtl_ret_prov_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ret_prov_typ.getListConfig().setPutter(getDtl_ret_prov_typ_ListPutter());
		columnDtl_ret_prov_basis_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ret_prov_basis_typ.getListConfig().setPutter(getDtl_ret_prov_basis_typ_ListPutter());
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
	 * この画面を[INS_INST]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_INSTStatus() {
		status = INS_INST;
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
	 * この画面を[SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCHStatus() {
		status = SRCH;
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
		else if (INS_INST.equals(status)) {
			setINS_INSTStatus();
		}
		else if (FIX_I.equals(status)) {
			setFIX_IStatus();
		}
		else if (SRCH.equals(status)) {
			setSRCHStatus();
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
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * [Cnd_srch_tgt_typ_nm_ListPutter]の作成
	 */
	protected MCListPutter createCnd_srch_tgt_typ_nm_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.StkSrchTgtTyp");
		return lp;
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
	 * [Hdr_gr_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_gr_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Hdr_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrp");
		return lp;
	}
	 
	/**
	 * [Hdr_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
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
	 * [Dtl_pr_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_pr_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Dtl_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の作成
	 */
	protected MCListPutter createDtl_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.LotNo");
		return lp;
	}

	/**
	 * [Dtl_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の作成
	 */
	protected MCListPutter createDtl_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.SublotNo");
		return lp;
	}

	/**
	 * [Dtl_trd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
		return lp;
	}
	 
	/**
	 * [Dtl_gi_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_gi_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
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
	 * [Dtl_stk_insp_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_stk_insp_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.StkInspTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_stk_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_stk_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0060.StkIdTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_gi_stk_arrv_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_gi_stk_arrv_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.SpplByLoc");
		return lp;
	}
	 
	/**
	 * [Dtl_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.XfrBizRsn");
		return lp;
	}
	 
	/**
	 * [Dtl_bd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Dtl_prov_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_prov_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0060.ProvTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_prov_basis_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_prov_basis_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ProvBasisTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_ret_prov_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ret_prov_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ProvTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_ret_prov_basis_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ret_prov_basis_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ProvBasisTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_srch_tgt_typ_nm) return getCnd_srch_tgt_typ_nm(row, info);
		if(combo == Hdr_trd_cd) return getHdr_trd_cd(row, info);
		if(combo == Hdr_gr_loc_cd) return getHdr_gr_loc_cd(row, info);
		if(combo == Hdr_lg_grp_cd) return getHdr_lg_grp_cd(row, info);
		if(combo == Hdr_sppl_cd) return getHdr_sppl_cd(row, info);
		if(combo == Hdr_act_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getHdr_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == columnDtl_pr_sts_typ) return getDtl_pr_sts_typ(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_cd) return getDtl_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub1) return getDtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub2) return getDtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub3) return getDtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == Dtl_lot_no_p_PPanel.columnLotNo_lot_no) return getDtl_lot_no_p_PPanel_columnLotNo_lot_no(row, info);
		if(combo == Dtl_lot_no_p_PPanel.columnLotNo_sublot_no) return getDtl_lot_no_p_PPanel_columnLotNo_sublot_no(row, info);
		if(combo == columnDtl_trd_unit_cd) return getDtl_trd_unit_cd(row, info);
		if(combo == columnDtl_gi_loc_cd) return getDtl_gi_loc_cd(row, info);
		if(combo == columnDtl_quality_typ) return getDtl_quality_typ(row, info);
		if(combo == columnDtl_gd_cd) return getDtl_gd_cd(row, info);
		if(combo == columnDtl_stk_insp_typ) return getDtl_stk_insp_typ(row, info);
		if(combo == columnDtl_stk_id_typ) return getDtl_stk_id_typ(row, info);
		if(combo == columnDtl_gi_stk_arrv_bp_cd) return getDtl_gi_stk_arrv_bp_cd(row, info);
		if(combo == columnDtl_rsn_cd) return getDtl_rsn_cd(row, info);
		if(combo == columnDtl_bd_dpt_cd) return getDtl_bd_dpt_cd(row, info);
		if(combo == columnDtl_prov_typ) return getDtl_prov_typ(row, info);
		if(combo == columnDtl_prov_basis_typ) return getDtl_prov_basis_typ(row, info);
		if(combo == columnDtl_ret_prov_typ) return getDtl_ret_prov_typ(row, info);
		if(combo == columnDtl_ret_prov_basis_typ) return getDtl_ret_prov_basis_typ(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch_inst) doCnd_srch_inst(info);
		else if (ap == Cnd_srch_act) doCnd_srch_act(info);
		else if (ap == Btn_prnt_dlv) doBtn_prnt_dlv(info);
		else if (ap == Btn_sprt_ac_dt) doBtn_sprt_ac_dt(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_ins) doBtn_ins(info);
		else if (ap == Btn_ins_noSchd) doBtn_ins_noSchd(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Cnd]パネルの[srch_inst]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_inst(MCEventInfo info);

	/**
	 * [Cnd]パネルの[srch_act]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_act(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_dlv]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_dlv(MCEventInfo info);

	/**
	 * [Btn]パネルの[sprt_ac_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_sprt_ac_dt(MCEventInfo info);

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
	 * [Btn]パネルの[ins_noSchd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins_noSchd(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

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
		if (vc == Cnd_srch_tgt_typ_nm) return doCnd_srch_tgt_typ_nm_VC(info);
		if (vc == Cnd_srch_tgt_typ) return doCnd_srch_tgt_typ_VC(info);
		if (vc == Cnd_srch_tgt_no) return doCnd_srch_tgt_no_VC(info);
		if (vc == Hdr_trd_cd) return doHdr_trd_cd_VC(info);
		if (vc == Hdr_trd_nm) return doHdr_trd_nm_VC(info);
		if (vc == Hdr_trd_ptn_typ) return doHdr_trd_ptn_typ_VC(info);
		if (vc == Hdr_xfr_act_no) return doHdr_xfr_act_no_VC(info);
		if (vc == Hdr_xfr_inst_no) return doHdr_xfr_inst_no_VC(info);
		if (vc == Hdr_gr_loc_cd) return doHdr_gr_loc_cd_VC(info);
		if (vc == Hdr_gr_loc_nm) return doHdr_gr_loc_nm_VC(info);
		if (vc == Hdr_gr_str_ln_tgt_flg) return doHdr_gr_str_ln_tgt_flg_VC(info);
		if (vc == Hdr_gr_site_cd) return doHdr_gr_site_cd_VC(info);
		if (vc == Hdr_wg_cd) return doHdr_wg_cd_VC(info);
		if (vc == Hdr_wg_nm) return doHdr_wg_nm_VC(info);
		if (vc == Hdr_lg_grp_cd) return doHdr_lg_grp_cd_VC(info);
		if (vc == Hdr_lg_grp_nm) return doHdr_lg_grp_nm_VC(info);
		if (vc == Hdr_sppl_cd) return doHdr_sppl_cd_VC(info);
		if (vc == Hdr_cur_cd) return doHdr_cur_cd_VC(info);
		if (vc == Hdr_onr_prsppl_flg) return doHdr_onr_prsppl_flg_VC(info);
		if (vc == Hdr_prov_basis_typ) return doHdr_prov_basis_typ_VC(info);
		if (vc == Hdr_immd_dlv_prnt_flg) return doHdr_immd_dlv_prnt_flg_VC(info);
		if (vc == Hdr_dlv_prnt_flg) return doHdr_dlv_prnt_flg_VC(info);
		if (vc == Hdr_intr_rmrks) return doHdr_intr_rmrks_VC(info);
		if (vc == Hdr_trd_rmrks) return doHdr_trd_rmrks_VC(info);
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
		if (vc == columnDtl_pr_sts_typ) return doDtl_pr_sts_typ_VC(info);
		if (vc == columnDtl_pr_sts_typ_nm) return doDtl_pr_sts_typ_nm_VC(info);
		if (vc == columnDtl_asset_mng_typ) return doDtl_asset_mng_typ_VC(info);
		if (vc == columnDtl_lot_mng_typ) return doDtl_lot_mng_typ_VC(info);
		if (vc == columnDtl_sublot_mng_typ) return doDtl_sublot_mng_typ_VC(info);
		if (vc == columnDtl_ver_flg) return doDtl_ver_flg_VC(info);
		if (vc == columnDtl_not_lot_mix_flg) return doDtl_not_lot_mix_flg_VC(info);
		if (vc == columnDtl_not_sublot_mix_flg) return doDtl_not_sublot_mix_flg_VC(info);
		if (vc == columnDtl_trd_unit_cd) return doDtl_trd_unit_cd_VC(info);
		if (vc == columnDtl_trd_unit_nm) return doDtl_trd_unit_nm_VC(info);
		if (vc == columnDtl_trd_unit_dec_place) return doDtl_trd_unit_dec_place_VC(info);
		if (vc == columnDtl_trd_unit_conv_qty) return doDtl_trd_unit_conv_qty_VC(info);
		if (vc == columnDtl_trd_unit_rnd_typ) return doDtl_trd_unit_rnd_typ_VC(info);
		if (vc == columnDtl_trd_unit_conv_base_qty) return doDtl_trd_unit_conv_base_qty_VC(info);
		if (vc == columnDtl_abort_flg) return doDtl_abort_flg_VC(info);
		if (vc == columnDtl_base_unit_cd) return doDtl_base_unit_cd_VC(info);
		if (vc == columnDtl_base_unit_nm) return doDtl_base_unit_nm_VC(info);
		if (vc == columnDtl_base_unit_dec_place) return doDtl_base_unit_dec_place_VC(info);
		if (vc == columnDtl_base_unit_dmn_qty) return doDtl_base_unit_dmn_qty_VC(info);
		if (vc == columnDtl_base_unit_conv_qty) return doDtl_base_unit_conv_qty_VC(info);
		if (vc == columnDtl_base_unit_rnd_typ) return doDtl_base_unit_rnd_typ_VC(info);
		if (vc == columnDtl_cont_fctr_flg) return doDtl_cont_fctr_flg_VC(info);
		if (vc == columnDtl_cont_fctr_dec_place) return doDtl_cont_fctr_dec_place_VC(info);
		if (vc == columnDtl_cont_fctr_rnd_typ) return doDtl_cont_fctr_rnd_typ_VC(info);
		if (vc == columnDtl_gi_loc_cd) return doDtl_gi_loc_cd_VC(info);
		if (vc == columnDtl_gi_loc_nm) return doDtl_gi_loc_nm_VC(info);
		if (vc == columnDtl_gi_str_ln_tgt_flg) return doDtl_gi_str_ln_tgt_flg_VC(info);
		if (vc == columnDtl_gi_site_cd) return doDtl_gi_site_cd_VC(info);
		if (vc == columnDtl_gi_sppl_cd) return doDtl_gi_sppl_cd_VC(info);
		if (vc == columnDtl_gr_str_ln_tgt_flg) return doDtl_gr_str_ln_tgt_flg_VC(info);
		if (vc == columnDtl_quality_typ) return doDtl_quality_typ_VC(info);
		if (vc == columnDtl_quality_typ_nm) return doDtl_quality_typ_nm_VC(info);
		if (vc == columnDtl_gd_cd) return doDtl_gd_cd_VC(info);
		if (vc == columnDtl_gd_nm) return doDtl_gd_nm_VC(info);
		if (vc == columnDtl_stk_insp_typ) return doDtl_stk_insp_typ_VC(info);
		if (vc == columnDtl_stk_insp_typ_nm) return doDtl_stk_insp_typ_nm_VC(info);
		if (vc == columnDtl_sno1_mng_typ) return doDtl_sno1_mng_typ_VC(info);
		if (vc == columnDtl_sno2_mng_typ) return doDtl_sno2_mng_typ_VC(info);
		if (vc == columnDtl_sno3_mng_typ) return doDtl_sno3_mng_typ_VC(info);
		if (vc == columnDtl_sno4_mng_typ) return doDtl_sno4_mng_typ_VC(info);
		if (vc == columnDtl_stk_id_typ) return doDtl_stk_id_typ_VC(info);
		if (vc == columnDtl_stk_id_typ_nm) return doDtl_stk_id_typ_nm_VC(info);
		if (vc == columnDtl_gi_stk_arrv_bp_cd) return doDtl_gi_stk_arrv_bp_cd_VC(info);
		if (vc == columnDtl_gi_stk_arrv_bp_nm) return doDtl_gi_stk_arrv_bp_nm_VC(info);
		if (vc == columnDtl_rsn_cd) return doDtl_rsn_cd_VC(info);
		if (vc == columnDtl_rsn_nm) return doDtl_rsn_nm_VC(info);
		if (vc == columnDtl_acxfr_gi_flg) return doDtl_acxfr_gi_flg_VC(info);
		if (vc == columnDtl_bd_dpt_cd) return doDtl_bd_dpt_cd_VC(info);
		if (vc == columnDtl_bd_dpt_nm) return doDtl_bd_dpt_nm_VC(info);
		if (vc == columnDtl_skip_chk_ship_flg) return doDtl_skip_chk_ship_flg_VC(info);
		if (vc == columnDtl_prov_typ) return doDtl_prov_typ_VC(info);
		if (vc == columnDtl_prov_typ_nm) return doDtl_prov_typ_nm_VC(info);
		if (vc == columnDtl_prov_basis_typ) return doDtl_prov_basis_typ_VC(info);
		if (vc == columnDtl_prov_basis_typ_nm) return doDtl_prov_basis_typ_nm_VC(info);
		if (vc == columnDtl_ret_prov_typ) return doDtl_ret_prov_typ_VC(info);
		if (vc == columnDtl_ret_prov_typ_nm) return doDtl_ret_prov_typ_nm_VC(info);
		if (vc == columnDtl_ret_prov_basis_typ) return doDtl_ret_prov_basis_typ_VC(info);
		if (vc == columnDtl_ret_prov_basis_typ_nm) return doDtl_ret_prov_basis_typ_nm_VC(info);
		if (vc == columnDtl_base_dlv_slip_no) return doDtl_base_dlv_slip_no_VC(info);
		if (vc == columnDtl_base_prov_act_no) return doDtl_base_prov_act_no_VC(info);
		if (vc == columnDtl_base_ac_dt) return doDtl_base_ac_dt_VC(info);
		if (vc == columnDtl_wms_flg) return doDtl_wms_flg_VC(info);
		if (vc == columnDtl_intr_d_rmrks) return doDtl_intr_d_rmrks_VC(info);
		if (vc == columnDtl_trd_d_rmrks) return doDtl_trd_d_rmrks_VC(info);
		if (vc == columnDtl_sub_char1) return doDtl_sub_char1_VC(info);
		if (vc == columnDtl_sub_char2) return doDtl_sub_char2_VC(info);
		if (vc == columnDtl_sub_char3) return doDtl_sub_char3_VC(info);
		if (vc == columnDtl_xfr_src_typ) return doDtl_xfr_src_typ_VC(info);
		if (vc == columnDtl_xfr_src_typ_nm) return doDtl_xfr_src_typ_nm_VC(info);
		if (vc == columnDtl_xfr_src_no) return doDtl_xfr_src_no_VC(info);
		if (vc == columnDtl_xfr_schd_no) return doDtl_xfr_schd_no_VC(info);
		if (vc == columnDtl_xfr_alloc_sts_no) return doDtl_xfr_alloc_sts_no_VC(info);
		if (vc == columnDtl_xfr_inst_d_no) return doDtl_xfr_inst_d_no_VC(info);
		if (vc == columnDtl_xfr_act_d_no) return doDtl_xfr_act_d_no_VC(info);
		if (vc == columnDtl_ext_sys_cd) return doDtl_ext_sys_cd_VC(info);
		if (vc == columnDtl_ext_sys_nm) return doDtl_ext_sys_nm_VC(info);
		if (vc == columnDtl_ext_xfr_act_no) return doDtl_ext_xfr_act_no_VC(info);
		if (vc == columnDtl_dlv_slip_no) return doDtl_dlv_slip_no_VC(info);
		if (vc == columnDtl_dlv_slip_d_no) return doDtl_dlv_slip_d_no_VC(info);
		if (vc == columnDtl_prov_schd_no) return doDtl_prov_schd_no_VC(info);
		if (vc == columnDtl_ret_prov_schd_no) return doDtl_ret_prov_schd_no_VC(info);
		if (vc == columnDtl_prov_act_no) return doDtl_prov_act_no_VC(info);
		if (vc == columnDtl_ret_prov_act_no) return doDtl_ret_prov_act_no_VC(info);
		if (vc == columnDtl_disp_seq) return doDtl_disp_seq_VC(info);
		if (vc == columnDtl_trd_ptn_typ) return doDtl_trd_ptn_typ_VC(info);
		if (vc == columnDtl_xfr_act_no) return doDtl_xfr_act_no_VC(info);
		if (vc == columnDtl_act_d_upd_cntr) return doDtl_act_d_upd_cntr_VC(info);
		if (vc == columnDtl_alloc_sts_upd_cntr) return doDtl_alloc_sts_upd_cntr_VC(info);
		if (vc == columnDtl_base_unit_qty_bef) return doDtl_base_unit_qty_bef_VC(info);
		if (vc == columnDtl_base_unit_act_qty_sum) return doDtl_base_unit_act_qty_sum_VC(info);
		if (vc == Btn_indiv_prnt_flg) return doBtn_indiv_prnt_flg_VC(info);
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
	 * [Cnd]パネルの[srch_tgt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_srch_tgt_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[srch_tgt_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_srch_tgt_no_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[xfr_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_xfr_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[xfr_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_xfr_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[gr_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_gr_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[gr_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_gr_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[gr_str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_gr_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[gr_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_gr_site_cd_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lg_grp_nm_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[onr_prsppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_onr_prsppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[prov_basis_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_prov_basis_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[immd_dlv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_immd_dlv_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_prnt_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[pr_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pr_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pr_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pr_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asset_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ver_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[not_lot_mix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_not_lot_mix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[not_sublot_mix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_not_sublot_mix_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[abort_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_abort_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[base_unit_dmn_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_dmn_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_conv_qty_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[cont_fctr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cont_fctr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cont_fctr_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cont_fctr_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[gi_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gi_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[gi_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gi_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[gi_str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gi_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[gi_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gi_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[gi_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gi_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[gr_str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gr_str_ln_tgt_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_mng_typ_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[gi_stk_arrv_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gi_stk_arrv_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[gi_stk_arrv_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gi_stk_arrv_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[acxfr_gi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_acxfr_gi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[skip_chk_ship_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_skip_chk_ship_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_basis_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_basis_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ret_prov_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ret_prov_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ret_prov_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ret_prov_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ret_prov_basis_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ret_prov_basis_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ret_prov_basis_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ret_prov_basis_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_prov_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_prov_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wms_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wms_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_intr_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_d_rmrks_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[xfr_src_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xfr_src_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xfr_src_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xfr_src_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xfr_src_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xfr_src_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xfr_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xfr_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xfr_alloc_sts_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xfr_alloc_sts_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xfr_inst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xfr_inst_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xfr_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xfr_act_d_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ext_xfr_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_xfr_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_slip_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ret_prov_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ret_prov_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ret_prov_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ret_prov_act_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xfr_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xfr_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[act_d_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_act_d_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alloc_sts_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alloc_sts_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_qty_bef]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_qty_bef_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_act_qty_sum]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_act_qty_sum_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn]パネルの[indiv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_indiv_prnt_flg_VC(MCEventInfo info){
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
		else if (nc == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_NC(info);
		else if (nc == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_NC(info);
		else if (nc == Cnd_srch_tgt_no) doCnd_srch_tgt_no_NC(info);
		else if (nc == Hdr_trd_cd) doHdr_trd_cd_NC(info);
		else if (nc == Hdr_trd_nm) doHdr_trd_nm_NC(info);
		else if (nc == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NC(info);
		else if (nc == Hdr_xfr_act_no) doHdr_xfr_act_no_NC(info);
		else if (nc == Hdr_xfr_inst_no) doHdr_xfr_inst_no_NC(info);
		else if (nc == Hdr_gr_loc_cd) doHdr_gr_loc_cd_NC(info);
		else if (nc == Hdr_gr_loc_nm) doHdr_gr_loc_nm_NC(info);
		else if (nc == Hdr_gr_str_ln_tgt_flg) doHdr_gr_str_ln_tgt_flg_NC(info);
		else if (nc == Hdr_gr_site_cd) doHdr_gr_site_cd_NC(info);
		else if (nc == Hdr_wg_cd) doHdr_wg_cd_NC(info);
		else if (nc == Hdr_wg_nm) doHdr_wg_nm_NC(info);
		else if (nc == Hdr_lg_grp_cd) doHdr_lg_grp_cd_NC(info);
		else if (nc == Hdr_lg_grp_nm) doHdr_lg_grp_nm_NC(info);
		else if (nc == Hdr_sppl_cd) doHdr_sppl_cd_NC(info);
		else if (nc == Hdr_cur_cd) doHdr_cur_cd_NC(info);
		else if (nc == Hdr_onr_prsppl_flg) doHdr_onr_prsppl_flg_NC(info);
		else if (nc == Hdr_prov_basis_typ) doHdr_prov_basis_typ_NC(info);
		else if (nc == Hdr_immd_dlv_prnt_flg) doHdr_immd_dlv_prnt_flg_NC(info);
		else if (nc == Hdr_dlv_prnt_flg) doHdr_dlv_prnt_flg_NC(info);
		else if (nc == Hdr_intr_rmrks) doHdr_intr_rmrks_NC(info);
		else if (nc == Hdr_trd_rmrks) doHdr_trd_rmrks_NC(info);
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
		else if (nc == columnDtl_pr_sts_typ) doDtl_pr_sts_typ_NC(info);
		else if (nc == columnDtl_pr_sts_typ_nm) doDtl_pr_sts_typ_nm_NC(info);
		else if (nc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NC(info);
		else if (nc == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NC(info);
		else if (nc == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NC(info);
		else if (nc == columnDtl_ver_flg) doDtl_ver_flg_NC(info);
		else if (nc == columnDtl_not_lot_mix_flg) doDtl_not_lot_mix_flg_NC(info);
		else if (nc == columnDtl_not_sublot_mix_flg) doDtl_not_sublot_mix_flg_NC(info);
		else if (nc == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NC(info);
		else if (nc == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NC(info);
		else if (nc == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NC(info);
		else if (nc == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NC(info);
		else if (nc == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnDtl_abort_flg) doDtl_abort_flg_NC(info);
		else if (nc == columnDtl_base_unit_cd) doDtl_base_unit_cd_NC(info);
		else if (nc == columnDtl_base_unit_nm) doDtl_base_unit_nm_NC(info);
		else if (nc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NC(info);
		else if (nc == columnDtl_base_unit_dmn_qty) doDtl_base_unit_dmn_qty_NC(info);
		else if (nc == columnDtl_base_unit_conv_qty) doDtl_base_unit_conv_qty_NC(info);
		else if (nc == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NC(info);
		else if (nc == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_NC(info);
		else if (nc == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnDtl_gi_loc_cd) doDtl_gi_loc_cd_NC(info);
		else if (nc == columnDtl_gi_loc_nm) doDtl_gi_loc_nm_NC(info);
		else if (nc == columnDtl_gi_str_ln_tgt_flg) doDtl_gi_str_ln_tgt_flg_NC(info);
		else if (nc == columnDtl_gi_site_cd) doDtl_gi_site_cd_NC(info);
		else if (nc == columnDtl_gi_sppl_cd) doDtl_gi_sppl_cd_NC(info);
		else if (nc == columnDtl_gr_str_ln_tgt_flg) doDtl_gr_str_ln_tgt_flg_NC(info);
		else if (nc == columnDtl_quality_typ) doDtl_quality_typ_NC(info);
		else if (nc == columnDtl_quality_typ_nm) doDtl_quality_typ_nm_NC(info);
		else if (nc == columnDtl_gd_cd) doDtl_gd_cd_NC(info);
		else if (nc == columnDtl_gd_nm) doDtl_gd_nm_NC(info);
		else if (nc == columnDtl_stk_insp_typ) doDtl_stk_insp_typ_NC(info);
		else if (nc == columnDtl_stk_insp_typ_nm) doDtl_stk_insp_typ_nm_NC(info);
		else if (nc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NC(info);
		else if (nc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NC(info);
		else if (nc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NC(info);
		else if (nc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NC(info);
		else if (nc == columnDtl_stk_id_typ) doDtl_stk_id_typ_NC(info);
		else if (nc == columnDtl_stk_id_typ_nm) doDtl_stk_id_typ_nm_NC(info);
		else if (nc == columnDtl_gi_stk_arrv_bp_cd) doDtl_gi_stk_arrv_bp_cd_NC(info);
		else if (nc == columnDtl_gi_stk_arrv_bp_nm) doDtl_gi_stk_arrv_bp_nm_NC(info);
		else if (nc == columnDtl_rsn_cd) doDtl_rsn_cd_NC(info);
		else if (nc == columnDtl_rsn_nm) doDtl_rsn_nm_NC(info);
		else if (nc == columnDtl_acxfr_gi_flg) doDtl_acxfr_gi_flg_NC(info);
		else if (nc == columnDtl_bd_dpt_cd) doDtl_bd_dpt_cd_NC(info);
		else if (nc == columnDtl_bd_dpt_nm) doDtl_bd_dpt_nm_NC(info);
		else if (nc == columnDtl_skip_chk_ship_flg) doDtl_skip_chk_ship_flg_NC(info);
		else if (nc == columnDtl_prov_typ) doDtl_prov_typ_NC(info);
		else if (nc == columnDtl_prov_typ_nm) doDtl_prov_typ_nm_NC(info);
		else if (nc == columnDtl_prov_basis_typ) doDtl_prov_basis_typ_NC(info);
		else if (nc == columnDtl_prov_basis_typ_nm) doDtl_prov_basis_typ_nm_NC(info);
		else if (nc == columnDtl_ret_prov_typ) doDtl_ret_prov_typ_NC(info);
		else if (nc == columnDtl_ret_prov_typ_nm) doDtl_ret_prov_typ_nm_NC(info);
		else if (nc == columnDtl_ret_prov_basis_typ) doDtl_ret_prov_basis_typ_NC(info);
		else if (nc == columnDtl_ret_prov_basis_typ_nm) doDtl_ret_prov_basis_typ_nm_NC(info);
		else if (nc == columnDtl_base_dlv_slip_no) doDtl_base_dlv_slip_no_NC(info);
		else if (nc == columnDtl_base_prov_act_no) doDtl_base_prov_act_no_NC(info);
		else if (nc == columnDtl_base_ac_dt) doDtl_base_ac_dt_NC(info);
		else if (nc == columnDtl_wms_flg) doDtl_wms_flg_NC(info);
		else if (nc == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_NC(info);
		else if (nc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NC(info);
		else if (nc == columnDtl_sub_char1) doDtl_sub_char1_NC(info);
		else if (nc == columnDtl_sub_char2) doDtl_sub_char2_NC(info);
		else if (nc == columnDtl_sub_char3) doDtl_sub_char3_NC(info);
		else if (nc == columnDtl_xfr_src_typ) doDtl_xfr_src_typ_NC(info);
		else if (nc == columnDtl_xfr_src_typ_nm) doDtl_xfr_src_typ_nm_NC(info);
		else if (nc == columnDtl_xfr_src_no) doDtl_xfr_src_no_NC(info);
		else if (nc == columnDtl_xfr_schd_no) doDtl_xfr_schd_no_NC(info);
		else if (nc == columnDtl_xfr_alloc_sts_no) doDtl_xfr_alloc_sts_no_NC(info);
		else if (nc == columnDtl_xfr_inst_d_no) doDtl_xfr_inst_d_no_NC(info);
		else if (nc == columnDtl_xfr_act_d_no) doDtl_xfr_act_d_no_NC(info);
		else if (nc == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_NC(info);
		else if (nc == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_NC(info);
		else if (nc == columnDtl_ext_xfr_act_no) doDtl_ext_xfr_act_no_NC(info);
		else if (nc == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NC(info);
		else if (nc == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_NC(info);
		else if (nc == columnDtl_prov_schd_no) doDtl_prov_schd_no_NC(info);
		else if (nc == columnDtl_ret_prov_schd_no) doDtl_ret_prov_schd_no_NC(info);
		else if (nc == columnDtl_prov_act_no) doDtl_prov_act_no_NC(info);
		else if (nc == columnDtl_ret_prov_act_no) doDtl_ret_prov_act_no_NC(info);
		else if (nc == columnDtl_disp_seq) doDtl_disp_seq_NC(info);
		else if (nc == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_NC(info);
		else if (nc == columnDtl_xfr_act_no) doDtl_xfr_act_no_NC(info);
		else if (nc == columnDtl_act_d_upd_cntr) doDtl_act_d_upd_cntr_NC(info);
		else if (nc == columnDtl_alloc_sts_upd_cntr) doDtl_alloc_sts_upd_cntr_NC(info);
		else if (nc == columnDtl_base_unit_qty_bef) doDtl_base_unit_qty_bef_NC(info);
		else if (nc == columnDtl_base_unit_act_qty_sum) doDtl_base_unit_act_qty_sum_NC(info);
		else if (nc == Btn_indiv_prnt_flg) doBtn_indiv_prnt_flg_NC(info);
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
	 * [Cnd]パネルの[srch_tgt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_no_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[xfr_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xfr_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xfr_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xfr_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gr_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gr_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gr_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gr_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gr_str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gr_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gr_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gr_site_cd_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[onr_prsppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_onr_prsppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prov_basis_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prov_basis_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[immd_dlv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_immd_dlv_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_prnt_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[pr_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pr_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pr_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pr_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_lot_mix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_lot_mix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_sublot_mix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_sublot_mix_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abort_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[base_unit_dmn_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dmn_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gr_str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gr_str_ln_tgt_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[gi_stk_arrv_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_stk_arrv_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_stk_arrv_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_stk_arrv_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acxfr_gi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acxfr_gi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[skip_chk_ship_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_skip_chk_ship_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_basis_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_basis_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_basis_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_basis_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_basis_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_basis_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_prov_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_prov_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wms_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wms_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[xfr_src_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_src_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_src_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_src_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_src_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_src_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_alloc_sts_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_alloc_sts_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_inst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_inst_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_act_d_no_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[ext_xfr_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_xfr_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_d_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_d_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_sts_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_sts_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_qty_bef]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_qty_bef_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_act_qty_sum]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_act_qty_sum_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[indiv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_indiv_prnt_flg_NC(MCEventInfo info){
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
		else if (ne == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_NE(info);
		else if (ne == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_NE(info);
		else if (ne == Cnd_srch_tgt_no) doCnd_srch_tgt_no_NE(info);
		else if (ne == Hdr_trd_cd) doHdr_trd_cd_NE(info);
		else if (ne == Hdr_trd_nm) doHdr_trd_nm_NE(info);
		else if (ne == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NE(info);
		else if (ne == Hdr_xfr_act_no) doHdr_xfr_act_no_NE(info);
		else if (ne == Hdr_xfr_inst_no) doHdr_xfr_inst_no_NE(info);
		else if (ne == Hdr_gr_loc_cd) doHdr_gr_loc_cd_NE(info);
		else if (ne == Hdr_gr_loc_nm) doHdr_gr_loc_nm_NE(info);
		else if (ne == Hdr_gr_str_ln_tgt_flg) doHdr_gr_str_ln_tgt_flg_NE(info);
		else if (ne == Hdr_gr_site_cd) doHdr_gr_site_cd_NE(info);
		else if (ne == Hdr_wg_cd) doHdr_wg_cd_NE(info);
		else if (ne == Hdr_wg_nm) doHdr_wg_nm_NE(info);
		else if (ne == Hdr_lg_grp_cd) doHdr_lg_grp_cd_NE(info);
		else if (ne == Hdr_lg_grp_nm) doHdr_lg_grp_nm_NE(info);
		else if (ne == Hdr_sppl_cd) doHdr_sppl_cd_NE(info);
		else if (ne == Hdr_cur_cd) doHdr_cur_cd_NE(info);
		else if (ne == Hdr_onr_prsppl_flg) doHdr_onr_prsppl_flg_NE(info);
		else if (ne == Hdr_prov_basis_typ) doHdr_prov_basis_typ_NE(info);
		else if (ne == Hdr_immd_dlv_prnt_flg) doHdr_immd_dlv_prnt_flg_NE(info);
		else if (ne == Hdr_dlv_prnt_flg) doHdr_dlv_prnt_flg_NE(info);
		else if (ne == Hdr_intr_rmrks) doHdr_intr_rmrks_NE(info);
		else if (ne == Hdr_trd_rmrks) doHdr_trd_rmrks_NE(info);
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
		else if (ne == columnDtl_pr_sts_typ) doDtl_pr_sts_typ_NE(info);
		else if (ne == columnDtl_pr_sts_typ_nm) doDtl_pr_sts_typ_nm_NE(info);
		else if (ne == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NE(info);
		else if (ne == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NE(info);
		else if (ne == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NE(info);
		else if (ne == columnDtl_ver_flg) doDtl_ver_flg_NE(info);
		else if (ne == columnDtl_not_lot_mix_flg) doDtl_not_lot_mix_flg_NE(info);
		else if (ne == columnDtl_not_sublot_mix_flg) doDtl_not_sublot_mix_flg_NE(info);
		else if (ne == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NE(info);
		else if (ne == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NE(info);
		else if (ne == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NE(info);
		else if (ne == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NE(info);
		else if (ne == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnDtl_abort_flg) doDtl_abort_flg_NE(info);
		else if (ne == columnDtl_base_unit_cd) doDtl_base_unit_cd_NE(info);
		else if (ne == columnDtl_base_unit_nm) doDtl_base_unit_nm_NE(info);
		else if (ne == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NE(info);
		else if (ne == columnDtl_base_unit_dmn_qty) doDtl_base_unit_dmn_qty_NE(info);
		else if (ne == columnDtl_base_unit_conv_qty) doDtl_base_unit_conv_qty_NE(info);
		else if (ne == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NE(info);
		else if (ne == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_NE(info);
		else if (ne == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnDtl_gi_loc_cd) doDtl_gi_loc_cd_NE(info);
		else if (ne == columnDtl_gi_loc_nm) doDtl_gi_loc_nm_NE(info);
		else if (ne == columnDtl_gi_str_ln_tgt_flg) doDtl_gi_str_ln_tgt_flg_NE(info);
		else if (ne == columnDtl_gi_site_cd) doDtl_gi_site_cd_NE(info);
		else if (ne == columnDtl_gi_sppl_cd) doDtl_gi_sppl_cd_NE(info);
		else if (ne == columnDtl_gr_str_ln_tgt_flg) doDtl_gr_str_ln_tgt_flg_NE(info);
		else if (ne == columnDtl_quality_typ) doDtl_quality_typ_NE(info);
		else if (ne == columnDtl_quality_typ_nm) doDtl_quality_typ_nm_NE(info);
		else if (ne == columnDtl_gd_cd) doDtl_gd_cd_NE(info);
		else if (ne == columnDtl_gd_nm) doDtl_gd_nm_NE(info);
		else if (ne == columnDtl_stk_insp_typ) doDtl_stk_insp_typ_NE(info);
		else if (ne == columnDtl_stk_insp_typ_nm) doDtl_stk_insp_typ_nm_NE(info);
		else if (ne == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NE(info);
		else if (ne == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NE(info);
		else if (ne == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NE(info);
		else if (ne == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NE(info);
		else if (ne == columnDtl_stk_id_typ) doDtl_stk_id_typ_NE(info);
		else if (ne == columnDtl_stk_id_typ_nm) doDtl_stk_id_typ_nm_NE(info);
		else if (ne == columnDtl_gi_stk_arrv_bp_cd) doDtl_gi_stk_arrv_bp_cd_NE(info);
		else if (ne == columnDtl_gi_stk_arrv_bp_nm) doDtl_gi_stk_arrv_bp_nm_NE(info);
		else if (ne == columnDtl_rsn_cd) doDtl_rsn_cd_NE(info);
		else if (ne == columnDtl_rsn_nm) doDtl_rsn_nm_NE(info);
		else if (ne == columnDtl_acxfr_gi_flg) doDtl_acxfr_gi_flg_NE(info);
		else if (ne == columnDtl_bd_dpt_cd) doDtl_bd_dpt_cd_NE(info);
		else if (ne == columnDtl_bd_dpt_nm) doDtl_bd_dpt_nm_NE(info);
		else if (ne == columnDtl_skip_chk_ship_flg) doDtl_skip_chk_ship_flg_NE(info);
		else if (ne == columnDtl_prov_typ) doDtl_prov_typ_NE(info);
		else if (ne == columnDtl_prov_typ_nm) doDtl_prov_typ_nm_NE(info);
		else if (ne == columnDtl_prov_basis_typ) doDtl_prov_basis_typ_NE(info);
		else if (ne == columnDtl_prov_basis_typ_nm) doDtl_prov_basis_typ_nm_NE(info);
		else if (ne == columnDtl_ret_prov_typ) doDtl_ret_prov_typ_NE(info);
		else if (ne == columnDtl_ret_prov_typ_nm) doDtl_ret_prov_typ_nm_NE(info);
		else if (ne == columnDtl_ret_prov_basis_typ) doDtl_ret_prov_basis_typ_NE(info);
		else if (ne == columnDtl_ret_prov_basis_typ_nm) doDtl_ret_prov_basis_typ_nm_NE(info);
		else if (ne == columnDtl_base_dlv_slip_no) doDtl_base_dlv_slip_no_NE(info);
		else if (ne == columnDtl_base_prov_act_no) doDtl_base_prov_act_no_NE(info);
		else if (ne == columnDtl_base_ac_dt) doDtl_base_ac_dt_NE(info);
		else if (ne == columnDtl_wms_flg) doDtl_wms_flg_NE(info);
		else if (ne == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_NE(info);
		else if (ne == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NE(info);
		else if (ne == columnDtl_sub_char1) doDtl_sub_char1_NE(info);
		else if (ne == columnDtl_sub_char2) doDtl_sub_char2_NE(info);
		else if (ne == columnDtl_sub_char3) doDtl_sub_char3_NE(info);
		else if (ne == columnDtl_xfr_src_typ) doDtl_xfr_src_typ_NE(info);
		else if (ne == columnDtl_xfr_src_typ_nm) doDtl_xfr_src_typ_nm_NE(info);
		else if (ne == columnDtl_xfr_src_no) doDtl_xfr_src_no_NE(info);
		else if (ne == columnDtl_xfr_schd_no) doDtl_xfr_schd_no_NE(info);
		else if (ne == columnDtl_xfr_alloc_sts_no) doDtl_xfr_alloc_sts_no_NE(info);
		else if (ne == columnDtl_xfr_inst_d_no) doDtl_xfr_inst_d_no_NE(info);
		else if (ne == columnDtl_xfr_act_d_no) doDtl_xfr_act_d_no_NE(info);
		else if (ne == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_NE(info);
		else if (ne == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_NE(info);
		else if (ne == columnDtl_ext_xfr_act_no) doDtl_ext_xfr_act_no_NE(info);
		else if (ne == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NE(info);
		else if (ne == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_NE(info);
		else if (ne == columnDtl_prov_schd_no) doDtl_prov_schd_no_NE(info);
		else if (ne == columnDtl_ret_prov_schd_no) doDtl_ret_prov_schd_no_NE(info);
		else if (ne == columnDtl_prov_act_no) doDtl_prov_act_no_NE(info);
		else if (ne == columnDtl_ret_prov_act_no) doDtl_ret_prov_act_no_NE(info);
		else if (ne == columnDtl_disp_seq) doDtl_disp_seq_NE(info);
		else if (ne == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_NE(info);
		else if (ne == columnDtl_xfr_act_no) doDtl_xfr_act_no_NE(info);
		else if (ne == columnDtl_act_d_upd_cntr) doDtl_act_d_upd_cntr_NE(info);
		else if (ne == columnDtl_alloc_sts_upd_cntr) doDtl_alloc_sts_upd_cntr_NE(info);
		else if (ne == columnDtl_base_unit_qty_bef) doDtl_base_unit_qty_bef_NE(info);
		else if (ne == columnDtl_base_unit_act_qty_sum) doDtl_base_unit_act_qty_sum_NE(info);
		else if (ne == Btn_indiv_prnt_flg) doBtn_indiv_prnt_flg_NE(info);
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
	 * [Cnd]パネルの[srch_tgt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_no_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[xfr_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xfr_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xfr_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xfr_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gr_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gr_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gr_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gr_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gr_str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gr_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gr_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gr_site_cd_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[onr_prsppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_onr_prsppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prov_basis_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prov_basis_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[immd_dlv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_immd_dlv_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_prnt_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[pr_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pr_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pr_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pr_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_lot_mix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_lot_mix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_sublot_mix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_sublot_mix_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abort_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[base_unit_dmn_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dmn_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gr_str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gr_str_ln_tgt_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[gi_stk_arrv_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_stk_arrv_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_stk_arrv_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_stk_arrv_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acxfr_gi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acxfr_gi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[skip_chk_ship_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_skip_chk_ship_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_basis_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_basis_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_basis_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_basis_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_basis_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_basis_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_prov_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_prov_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wms_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wms_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[xfr_src_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_src_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_src_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_src_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_src_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_src_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_alloc_sts_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_alloc_sts_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_inst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_inst_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_act_d_no_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[ext_xfr_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_xfr_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_d_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_d_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_sts_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_sts_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_qty_bef]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_qty_bef_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_act_qty_sum]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_act_qty_sum_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[indiv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_indiv_prnt_flg_NE(MCEventInfo info){
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
		else if (nx == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_NX(info);
		else if (nx == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_NX(info);
		else if (nx == Cnd_srch_tgt_no) doCnd_srch_tgt_no_NX(info);
		else if (nx == Hdr_trd_cd) doHdr_trd_cd_NX(info);
		else if (nx == Hdr_trd_nm) doHdr_trd_nm_NX(info);
		else if (nx == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NX(info);
		else if (nx == Hdr_xfr_act_no) doHdr_xfr_act_no_NX(info);
		else if (nx == Hdr_xfr_inst_no) doHdr_xfr_inst_no_NX(info);
		else if (nx == Hdr_gr_loc_cd) doHdr_gr_loc_cd_NX(info);
		else if (nx == Hdr_gr_loc_nm) doHdr_gr_loc_nm_NX(info);
		else if (nx == Hdr_gr_str_ln_tgt_flg) doHdr_gr_str_ln_tgt_flg_NX(info);
		else if (nx == Hdr_gr_site_cd) doHdr_gr_site_cd_NX(info);
		else if (nx == Hdr_wg_cd) doHdr_wg_cd_NX(info);
		else if (nx == Hdr_wg_nm) doHdr_wg_nm_NX(info);
		else if (nx == Hdr_lg_grp_cd) doHdr_lg_grp_cd_NX(info);
		else if (nx == Hdr_lg_grp_nm) doHdr_lg_grp_nm_NX(info);
		else if (nx == Hdr_sppl_cd) doHdr_sppl_cd_NX(info);
		else if (nx == Hdr_cur_cd) doHdr_cur_cd_NX(info);
		else if (nx == Hdr_onr_prsppl_flg) doHdr_onr_prsppl_flg_NX(info);
		else if (nx == Hdr_prov_basis_typ) doHdr_prov_basis_typ_NX(info);
		else if (nx == Hdr_immd_dlv_prnt_flg) doHdr_immd_dlv_prnt_flg_NX(info);
		else if (nx == Hdr_dlv_prnt_flg) doHdr_dlv_prnt_flg_NX(info);
		else if (nx == Hdr_intr_rmrks) doHdr_intr_rmrks_NX(info);
		else if (nx == Hdr_trd_rmrks) doHdr_trd_rmrks_NX(info);
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
		else if (nx == columnDtl_pr_sts_typ) doDtl_pr_sts_typ_NX(info);
		else if (nx == columnDtl_pr_sts_typ_nm) doDtl_pr_sts_typ_nm_NX(info);
		else if (nx == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NX(info);
		else if (nx == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NX(info);
		else if (nx == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NX(info);
		else if (nx == columnDtl_ver_flg) doDtl_ver_flg_NX(info);
		else if (nx == columnDtl_not_lot_mix_flg) doDtl_not_lot_mix_flg_NX(info);
		else if (nx == columnDtl_not_sublot_mix_flg) doDtl_not_sublot_mix_flg_NX(info);
		else if (nx == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NX(info);
		else if (nx == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NX(info);
		else if (nx == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NX(info);
		else if (nx == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NX(info);
		else if (nx == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnDtl_abort_flg) doDtl_abort_flg_NX(info);
		else if (nx == columnDtl_base_unit_cd) doDtl_base_unit_cd_NX(info);
		else if (nx == columnDtl_base_unit_nm) doDtl_base_unit_nm_NX(info);
		else if (nx == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NX(info);
		else if (nx == columnDtl_base_unit_dmn_qty) doDtl_base_unit_dmn_qty_NX(info);
		else if (nx == columnDtl_base_unit_conv_qty) doDtl_base_unit_conv_qty_NX(info);
		else if (nx == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NX(info);
		else if (nx == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_NX(info);
		else if (nx == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnDtl_gi_loc_cd) doDtl_gi_loc_cd_NX(info);
		else if (nx == columnDtl_gi_loc_nm) doDtl_gi_loc_nm_NX(info);
		else if (nx == columnDtl_gi_str_ln_tgt_flg) doDtl_gi_str_ln_tgt_flg_NX(info);
		else if (nx == columnDtl_gi_site_cd) doDtl_gi_site_cd_NX(info);
		else if (nx == columnDtl_gi_sppl_cd) doDtl_gi_sppl_cd_NX(info);
		else if (nx == columnDtl_gr_str_ln_tgt_flg) doDtl_gr_str_ln_tgt_flg_NX(info);
		else if (nx == columnDtl_quality_typ) doDtl_quality_typ_NX(info);
		else if (nx == columnDtl_quality_typ_nm) doDtl_quality_typ_nm_NX(info);
		else if (nx == columnDtl_gd_cd) doDtl_gd_cd_NX(info);
		else if (nx == columnDtl_gd_nm) doDtl_gd_nm_NX(info);
		else if (nx == columnDtl_stk_insp_typ) doDtl_stk_insp_typ_NX(info);
		else if (nx == columnDtl_stk_insp_typ_nm) doDtl_stk_insp_typ_nm_NX(info);
		else if (nx == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NX(info);
		else if (nx == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NX(info);
		else if (nx == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NX(info);
		else if (nx == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NX(info);
		else if (nx == columnDtl_stk_id_typ) doDtl_stk_id_typ_NX(info);
		else if (nx == columnDtl_stk_id_typ_nm) doDtl_stk_id_typ_nm_NX(info);
		else if (nx == columnDtl_gi_stk_arrv_bp_cd) doDtl_gi_stk_arrv_bp_cd_NX(info);
		else if (nx == columnDtl_gi_stk_arrv_bp_nm) doDtl_gi_stk_arrv_bp_nm_NX(info);
		else if (nx == columnDtl_rsn_cd) doDtl_rsn_cd_NX(info);
		else if (nx == columnDtl_rsn_nm) doDtl_rsn_nm_NX(info);
		else if (nx == columnDtl_acxfr_gi_flg) doDtl_acxfr_gi_flg_NX(info);
		else if (nx == columnDtl_bd_dpt_cd) doDtl_bd_dpt_cd_NX(info);
		else if (nx == columnDtl_bd_dpt_nm) doDtl_bd_dpt_nm_NX(info);
		else if (nx == columnDtl_skip_chk_ship_flg) doDtl_skip_chk_ship_flg_NX(info);
		else if (nx == columnDtl_prov_typ) doDtl_prov_typ_NX(info);
		else if (nx == columnDtl_prov_typ_nm) doDtl_prov_typ_nm_NX(info);
		else if (nx == columnDtl_prov_basis_typ) doDtl_prov_basis_typ_NX(info);
		else if (nx == columnDtl_prov_basis_typ_nm) doDtl_prov_basis_typ_nm_NX(info);
		else if (nx == columnDtl_ret_prov_typ) doDtl_ret_prov_typ_NX(info);
		else if (nx == columnDtl_ret_prov_typ_nm) doDtl_ret_prov_typ_nm_NX(info);
		else if (nx == columnDtl_ret_prov_basis_typ) doDtl_ret_prov_basis_typ_NX(info);
		else if (nx == columnDtl_ret_prov_basis_typ_nm) doDtl_ret_prov_basis_typ_nm_NX(info);
		else if (nx == columnDtl_base_dlv_slip_no) doDtl_base_dlv_slip_no_NX(info);
		else if (nx == columnDtl_base_prov_act_no) doDtl_base_prov_act_no_NX(info);
		else if (nx == columnDtl_base_ac_dt) doDtl_base_ac_dt_NX(info);
		else if (nx == columnDtl_wms_flg) doDtl_wms_flg_NX(info);
		else if (nx == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_NX(info);
		else if (nx == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NX(info);
		else if (nx == columnDtl_sub_char1) doDtl_sub_char1_NX(info);
		else if (nx == columnDtl_sub_char2) doDtl_sub_char2_NX(info);
		else if (nx == columnDtl_sub_char3) doDtl_sub_char3_NX(info);
		else if (nx == columnDtl_xfr_src_typ) doDtl_xfr_src_typ_NX(info);
		else if (nx == columnDtl_xfr_src_typ_nm) doDtl_xfr_src_typ_nm_NX(info);
		else if (nx == columnDtl_xfr_src_no) doDtl_xfr_src_no_NX(info);
		else if (nx == columnDtl_xfr_schd_no) doDtl_xfr_schd_no_NX(info);
		else if (nx == columnDtl_xfr_alloc_sts_no) doDtl_xfr_alloc_sts_no_NX(info);
		else if (nx == columnDtl_xfr_inst_d_no) doDtl_xfr_inst_d_no_NX(info);
		else if (nx == columnDtl_xfr_act_d_no) doDtl_xfr_act_d_no_NX(info);
		else if (nx == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_NX(info);
		else if (nx == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_NX(info);
		else if (nx == columnDtl_ext_xfr_act_no) doDtl_ext_xfr_act_no_NX(info);
		else if (nx == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NX(info);
		else if (nx == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_NX(info);
		else if (nx == columnDtl_prov_schd_no) doDtl_prov_schd_no_NX(info);
		else if (nx == columnDtl_ret_prov_schd_no) doDtl_ret_prov_schd_no_NX(info);
		else if (nx == columnDtl_prov_act_no) doDtl_prov_act_no_NX(info);
		else if (nx == columnDtl_ret_prov_act_no) doDtl_ret_prov_act_no_NX(info);
		else if (nx == columnDtl_disp_seq) doDtl_disp_seq_NX(info);
		else if (nx == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_NX(info);
		else if (nx == columnDtl_xfr_act_no) doDtl_xfr_act_no_NX(info);
		else if (nx == columnDtl_act_d_upd_cntr) doDtl_act_d_upd_cntr_NX(info);
		else if (nx == columnDtl_alloc_sts_upd_cntr) doDtl_alloc_sts_upd_cntr_NX(info);
		else if (nx == columnDtl_base_unit_qty_bef) doDtl_base_unit_qty_bef_NX(info);
		else if (nx == columnDtl_base_unit_act_qty_sum) doDtl_base_unit_act_qty_sum_NX(info);
		else if (nx == Btn_indiv_prnt_flg) doBtn_indiv_prnt_flg_NX(info);
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
	 * [Cnd]パネルの[srch_tgt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_no_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[xfr_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xfr_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xfr_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xfr_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gr_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gr_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gr_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gr_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gr_str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gr_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gr_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gr_site_cd_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[onr_prsppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_onr_prsppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prov_basis_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prov_basis_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[immd_dlv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_immd_dlv_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_prnt_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[pr_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pr_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pr_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pr_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_lot_mix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_lot_mix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_sublot_mix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_sublot_mix_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abort_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[base_unit_dmn_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dmn_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gr_str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gr_str_ln_tgt_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[gi_stk_arrv_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_stk_arrv_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_stk_arrv_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_stk_arrv_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acxfr_gi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acxfr_gi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[skip_chk_ship_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_skip_chk_ship_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_basis_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_basis_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_basis_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_basis_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_basis_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_basis_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_prov_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_prov_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wms_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wms_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[xfr_src_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_src_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_src_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_src_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_src_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_src_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_alloc_sts_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_alloc_sts_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_inst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_inst_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_act_d_no_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[ext_xfr_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_xfr_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_d_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_d_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_sts_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_sts_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_qty_bef]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_qty_bef_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_act_qty_sum]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_act_qty_sum_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[indiv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_indiv_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_LC(info);
		else if (lc == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_LC(info);
		else if (lc == Cnd_srch_tgt_no) doCnd_srch_tgt_no_LC(info);
		else if (lc == Hdr_trd_cd) doHdr_trd_cd_LC(info);
		else if (lc == Hdr_trd_nm) doHdr_trd_nm_LC(info);
		else if (lc == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_LC(info);
		else if (lc == Hdr_xfr_act_no) doHdr_xfr_act_no_LC(info);
		else if (lc == Hdr_xfr_inst_no) doHdr_xfr_inst_no_LC(info);
		else if (lc == Hdr_gr_loc_cd) doHdr_gr_loc_cd_LC(info);
		else if (lc == Hdr_gr_loc_nm) doHdr_gr_loc_nm_LC(info);
		else if (lc == Hdr_gr_site_cd) doHdr_gr_site_cd_LC(info);
		else if (lc == Hdr_wg_cd) doHdr_wg_cd_LC(info);
		else if (lc == Hdr_wg_nm) doHdr_wg_nm_LC(info);
		else if (lc == Hdr_lg_grp_cd) doHdr_lg_grp_cd_LC(info);
		else if (lc == Hdr_lg_grp_nm) doHdr_lg_grp_nm_LC(info);
		else if (lc == Hdr_sppl_cd) doHdr_sppl_cd_LC(info);
		else if (lc == Hdr_cur_cd) doHdr_cur_cd_LC(info);
		else if (lc == Hdr_prov_basis_typ) doHdr_prov_basis_typ_LC(info);
		else if (lc == Hdr_intr_rmrks) doHdr_intr_rmrks_LC(info);
		else if (lc == Hdr_trd_rmrks) doHdr_trd_rmrks_LC(info);
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
		else if (lc == columnDtl_pr_sts_typ) doDtl_pr_sts_typ_LC(info);
		else if (lc == columnDtl_pr_sts_typ_nm) doDtl_pr_sts_typ_nm_LC(info);
		else if (lc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_LC(info);
		else if (lc == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_LC(info);
		else if (lc == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_LC(info);
		else if (lc == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_LC(info);
		else if (lc == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_LC(info);
		else if (lc == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_LC(info);
		else if (lc == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_LC(info);
		else if (lc == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_LC(info);
		else if (lc == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnDtl_base_unit_cd) doDtl_base_unit_cd_LC(info);
		else if (lc == columnDtl_base_unit_nm) doDtl_base_unit_nm_LC(info);
		else if (lc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_LC(info);
		else if (lc == columnDtl_base_unit_dmn_qty) doDtl_base_unit_dmn_qty_LC(info);
		else if (lc == columnDtl_base_unit_conv_qty) doDtl_base_unit_conv_qty_LC(info);
		else if (lc == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_LC(info);
		else if (lc == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_LC(info);
		else if (lc == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnDtl_gi_loc_cd) doDtl_gi_loc_cd_LC(info);
		else if (lc == columnDtl_gi_loc_nm) doDtl_gi_loc_nm_LC(info);
		else if (lc == columnDtl_gi_site_cd) doDtl_gi_site_cd_LC(info);
		else if (lc == columnDtl_gi_sppl_cd) doDtl_gi_sppl_cd_LC(info);
		else if (lc == columnDtl_quality_typ) doDtl_quality_typ_LC(info);
		else if (lc == columnDtl_quality_typ_nm) doDtl_quality_typ_nm_LC(info);
		else if (lc == columnDtl_gd_cd) doDtl_gd_cd_LC(info);
		else if (lc == columnDtl_gd_nm) doDtl_gd_nm_LC(info);
		else if (lc == columnDtl_stk_insp_typ) doDtl_stk_insp_typ_LC(info);
		else if (lc == columnDtl_stk_insp_typ_nm) doDtl_stk_insp_typ_nm_LC(info);
		else if (lc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_LC(info);
		else if (lc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_LC(info);
		else if (lc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_LC(info);
		else if (lc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_LC(info);
		else if (lc == columnDtl_stk_id_typ) doDtl_stk_id_typ_LC(info);
		else if (lc == columnDtl_stk_id_typ_nm) doDtl_stk_id_typ_nm_LC(info);
		else if (lc == columnDtl_gi_stk_arrv_bp_cd) doDtl_gi_stk_arrv_bp_cd_LC(info);
		else if (lc == columnDtl_gi_stk_arrv_bp_nm) doDtl_gi_stk_arrv_bp_nm_LC(info);
		else if (lc == columnDtl_rsn_cd) doDtl_rsn_cd_LC(info);
		else if (lc == columnDtl_rsn_nm) doDtl_rsn_nm_LC(info);
		else if (lc == columnDtl_bd_dpt_cd) doDtl_bd_dpt_cd_LC(info);
		else if (lc == columnDtl_bd_dpt_nm) doDtl_bd_dpt_nm_LC(info);
		else if (lc == columnDtl_prov_typ) doDtl_prov_typ_LC(info);
		else if (lc == columnDtl_prov_typ_nm) doDtl_prov_typ_nm_LC(info);
		else if (lc == columnDtl_prov_basis_typ) doDtl_prov_basis_typ_LC(info);
		else if (lc == columnDtl_prov_basis_typ_nm) doDtl_prov_basis_typ_nm_LC(info);
		else if (lc == columnDtl_ret_prov_typ) doDtl_ret_prov_typ_LC(info);
		else if (lc == columnDtl_ret_prov_typ_nm) doDtl_ret_prov_typ_nm_LC(info);
		else if (lc == columnDtl_ret_prov_basis_typ) doDtl_ret_prov_basis_typ_LC(info);
		else if (lc == columnDtl_ret_prov_basis_typ_nm) doDtl_ret_prov_basis_typ_nm_LC(info);
		else if (lc == columnDtl_base_dlv_slip_no) doDtl_base_dlv_slip_no_LC(info);
		else if (lc == columnDtl_base_prov_act_no) doDtl_base_prov_act_no_LC(info);
		else if (lc == columnDtl_base_ac_dt) doDtl_base_ac_dt_LC(info);
		else if (lc == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_LC(info);
		else if (lc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_LC(info);
		else if (lc == columnDtl_sub_char1) doDtl_sub_char1_LC(info);
		else if (lc == columnDtl_sub_char2) doDtl_sub_char2_LC(info);
		else if (lc == columnDtl_sub_char3) doDtl_sub_char3_LC(info);
		else if (lc == columnDtl_xfr_src_typ) doDtl_xfr_src_typ_LC(info);
		else if (lc == columnDtl_xfr_src_typ_nm) doDtl_xfr_src_typ_nm_LC(info);
		else if (lc == columnDtl_xfr_src_no) doDtl_xfr_src_no_LC(info);
		else if (lc == columnDtl_xfr_schd_no) doDtl_xfr_schd_no_LC(info);
		else if (lc == columnDtl_xfr_alloc_sts_no) doDtl_xfr_alloc_sts_no_LC(info);
		else if (lc == columnDtl_xfr_inst_d_no) doDtl_xfr_inst_d_no_LC(info);
		else if (lc == columnDtl_xfr_act_d_no) doDtl_xfr_act_d_no_LC(info);
		else if (lc == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_LC(info);
		else if (lc == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_LC(info);
		else if (lc == columnDtl_ext_xfr_act_no) doDtl_ext_xfr_act_no_LC(info);
		else if (lc == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_LC(info);
		else if (lc == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_LC(info);
		else if (lc == columnDtl_prov_schd_no) doDtl_prov_schd_no_LC(info);
		else if (lc == columnDtl_ret_prov_schd_no) doDtl_ret_prov_schd_no_LC(info);
		else if (lc == columnDtl_prov_act_no) doDtl_prov_act_no_LC(info);
		else if (lc == columnDtl_ret_prov_act_no) doDtl_ret_prov_act_no_LC(info);
		else if (lc == columnDtl_disp_seq) doDtl_disp_seq_LC(info);
		else if (lc == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_LC(info);
		else if (lc == columnDtl_xfr_act_no) doDtl_xfr_act_no_LC(info);
		else if (lc == columnDtl_act_d_upd_cntr) doDtl_act_d_upd_cntr_LC(info);
		else if (lc == columnDtl_alloc_sts_upd_cntr) doDtl_alloc_sts_upd_cntr_LC(info);
		else if (lc == columnDtl_base_unit_qty_bef) doDtl_base_unit_qty_bef_LC(info);
		else if (lc == columnDtl_base_unit_act_qty_sum) doDtl_base_unit_act_qty_sum_LC(info);
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_no_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[xfr_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xfr_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xfr_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xfr_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gr_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gr_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gr_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gr_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[gr_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_gr_site_cd_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prov_basis_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prov_basis_typ_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[pr_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pr_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pr_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pr_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_base_qty_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[base_unit_dmn_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dmn_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_sppl_cd_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[gi_stk_arrv_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_stk_arrv_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_stk_arrv_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_stk_arrv_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_basis_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_basis_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_basis_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_basis_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_basis_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_basis_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_prov_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_prov_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[xfr_src_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_src_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_src_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_src_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_src_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_src_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_alloc_sts_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_alloc_sts_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_inst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_inst_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_act_d_no_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[ext_xfr_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_xfr_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_d_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_d_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_sts_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_sts_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_qty_bef]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_qty_bef_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_act_qty_sum]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_act_qty_sum_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_srch_tgt_typ_nm]の作成メソッド
	 */
	public MCList getCnd_srch_tgt_typ_nm(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getStkSrchTgtTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_trd_cd]の作成メソッド
	 */
	public MCList getHdr_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_gr_loc_cd]の作成メソッド
	 */
	public MCList getHdr_gr_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_lg_grp_cd]の作成メソッド
	 */
	public MCList getHdr_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_sppl_cd]の作成メソッド
	 */
	public MCList getHdr_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getHdr_act_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_pr_sts_typ]の作成メソッド
	 */
	public MCList getDtl_pr_sts_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_lot_no_p_PPanel_columnLotNo_lot_no]の作成メソッド
	 */
	public MCList getDtl_lot_no_p_PPanel_columnLotNo_lot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getLotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_lot_no_p_PPanel_columnLotNo_sublot_no]の作成メソッド
	 */
	public MCList getDtl_lot_no_p_PPanel_columnLotNo_sublot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getSublotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_trd_unit_cd]の作成メソッド
	 */
	public MCList getDtl_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_gi_loc_cd]の作成メソッド
	 */
	public MCList getDtl_gi_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
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
	 * コンボ／リストのリスト[columnDtl_stk_insp_typ]の作成メソッド
	 */
	public MCList getDtl_stk_insp_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getStkInspTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_stk_id_typ]の作成メソッド
	 */
	public MCList getDtl_stk_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0060.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0060.MSUAP_List", this)).getStkIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_gi_stk_arrv_bp_cd]の作成メソッド
	 */
	public MCList getDtl_gi_stk_arrv_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getSpplByLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_rsn_cd]の作成メソッド
	 */
	public MCList getDtl_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getXfrBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bd_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_bd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_prov_typ]の作成メソッド
	 */
	public MCList getDtl_prov_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0060.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0060.MSUAP_List", this)).getProvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_prov_basis_typ]の作成メソッド
	 */
	public MCList getDtl_prov_basis_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getProvBasisTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ret_prov_typ]の作成メソッド
	 */
	public MCList getDtl_ret_prov_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getProvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ret_prov_basis_typ]の作成メソッド
	 */
	public MCList getDtl_ret_prov_basis_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getProvBasisTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL1020.Srch01")) {
			return new MS_MSBEL1020_Srch01Bridge();
		}
		if (id.equals("MS.MSBEL1020.Srch02")) {
			return new MS_MSBEL1020_Srch02Bridge();
		}
		if (id.equals("MS.MSBEL1020.Ins01")) {
			return new MS_MSBEL1020_Ins01Bridge();
		}
		if (id.equals("MS.MSBEL1020.Upd01")) {
			return new MS_MSBEL1020_Upd01Bridge();
		}
		if (id.equals("MS.MSBEL1020.Del01")) {
			return new MS_MSBEL1020_Del01Bridge();
		}
		if (id.equals("MS.MSBEL1020.Prnt01")) {
			return new MS_MSBEL1020_Prnt01Bridge();
		}
		if (id.equals("MS.MSBEL1020.Sprt01")) {
			return new MS_MSBEL1020_Sprt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL1020_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1020_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1020_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL1020_Srch01Bridge() {
			p_MS_MSBEL1020_Srch01 = new MCParam(PDef.MS_MSBEL1020_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1020_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1020.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP1020.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1020.DtlR.class));

			p_MS_MSBEL1020_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1020_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1020_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1020_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1020_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1020.CndR up0() {
			return (mcframe.clientMSBE.MSBEP1020.CndR)up(0);
		}

		protected mcframe.clientMSBE.MSBEP1020.HdrR down0() {
			return (mcframe.clientMSBE.MSBEP1020.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1020.DtlR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP1020.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1020_Srch01.addDownBlock(mcframe.clientMSBE.MSBEP1020.HdrR.create());
			p_MS_MSBEL1020_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1020.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1020_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBE.MSBEP1020.HdrR)p_MS_MSBEL1020_Srch01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1020.DtlR>)p_MS_MSBEL1020_Srch01.getContainerParam().getDownBlock(1));
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
	 * [MS_MSBEL1020_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1020_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1020_Srch02;

		/** コンストラクタ */
		protected MS_MSBEL1020_Srch02Bridge() {
			p_MS_MSBEL1020_Srch02 = new MCParam(PDef.MS_MSBEL1020_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1020_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1020.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP1020.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1020.DtlR.class));

			p_MS_MSBEL1020_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1020_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1020_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1020_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1020_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1020.CndR up0() {
			return (mcframe.clientMSBE.MSBEP1020.CndR)up(0);
		}

		protected mcframe.clientMSBE.MSBEP1020.HdrR down0() {
			return (mcframe.clientMSBE.MSBEP1020.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1020.DtlR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP1020.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1020_Srch02.addDownBlock(mcframe.clientMSBE.MSBEP1020.HdrR.create());
			p_MS_MSBEL1020_Srch02.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1020.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1020_Srch02;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBE.MSBEP1020.HdrR)p_MS_MSBEL1020_Srch02.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1020.DtlR>)p_MS_MSBEL1020_Srch02.getContainerParam().getDownBlock(1));
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
	 * [MS_MSBEL1020_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1020_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1020_Ins01;

		/** コンストラクタ */
		protected MS_MSBEL1020_Ins01Bridge() {
			p_MS_MSBEL1020_Ins01 = new MCParam(PDef.MS_MSBEL1020_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1020_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1020.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1020.DtlR.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP1020.BtnR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP1020.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1020.DtlR.class));

			p_MS_MSBEL1020_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1020_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1020_Ins01.addUpBlock(getHdrR());
			p_MS_MSBEL1020_Ins01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBEL1020_Ins01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1020_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1020_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1020.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP1020.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1020.DtlR> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP1020.DtlR>)up(1);
		}
		protected mcframe.clientMSBE.MSBEP1020.BtnR up2() {
			return (mcframe.clientMSBE.MSBEP1020.BtnR)up(2);
		}

		protected mcframe.clientMSBE.MSBEP1020.HdrR down0() {
			return (mcframe.clientMSBE.MSBEP1020.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1020.DtlR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP1020.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1020_Ins01.addDownBlock(mcframe.clientMSBE.MSBEP1020.HdrR.create());
			p_MS_MSBEL1020_Ins01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1020.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1020_Ins01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBE.MSBEP1020.HdrR)p_MS_MSBEL1020_Ins01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1020.DtlR>)p_MS_MSBEL1020_Ins01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getBtnR());
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
	 * [MS_MSBEL1020_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1020_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1020_Upd01;

		/** コンストラクタ */
		protected MS_MSBEL1020_Upd01Bridge() {
			p_MS_MSBEL1020_Upd01 = new MCParam(PDef.MS_MSBEL1020_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1020_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1020.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1020.DtlR.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP1020.BtnR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP1020.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1020.DtlR.class));

			p_MS_MSBEL1020_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1020_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1020_Upd01.addUpBlock(getHdrR());
			p_MS_MSBEL1020_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBEL1020_Upd01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1020_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1020_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1020.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP1020.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1020.DtlR> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP1020.DtlR>)up(1);
		}
		protected mcframe.clientMSBE.MSBEP1020.BtnR up2() {
			return (mcframe.clientMSBE.MSBEP1020.BtnR)up(2);
		}

		protected mcframe.clientMSBE.MSBEP1020.HdrR down0() {
			return (mcframe.clientMSBE.MSBEP1020.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1020.DtlR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP1020.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1020_Upd01.addDownBlock(mcframe.clientMSBE.MSBEP1020.HdrR.create());
			p_MS_MSBEL1020_Upd01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1020.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1020_Upd01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBE.MSBEP1020.HdrR)p_MS_MSBEL1020_Upd01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1020.DtlR>)p_MS_MSBEL1020_Upd01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getBtnR());
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
	 * [MS_MSBEL1020_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1020_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1020_Del01;

		/** コンストラクタ */
		protected MS_MSBEL1020_Del01Bridge() {
			p_MS_MSBEL1020_Del01 = new MCParam(PDef.MS_MSBEL1020_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1020_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1020.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1020.DtlR.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP1020.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1020.DtlR.class));

			p_MS_MSBEL1020_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1020_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1020_Del01.addUpBlock(getHdrR());
			p_MS_MSBEL1020_Del01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBEL1020_Del01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1020_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1020_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1020.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP1020.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1020.DtlR> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP1020.DtlR>)up(1);
		}
		protected mcframe.clientMSBE.MSBEP1020.BtnR up2() {
			return (mcframe.clientMSBE.MSBEP1020.BtnR)up(2);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1020.DtlR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1020.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1020_Del01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1020.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1020_Del01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1020.DtlR>)p_MS_MSBEL1020_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getBtnR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBEL1020_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1020_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1020_Prnt01;

		/** コンストラクタ */
		protected MS_MSBEL1020_Prnt01Bridge() {
			p_MS_MSBEL1020_Prnt01 = new MCParam(PDef.MS_MSBEL1020_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1020_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1020.HdrR.create());
			param.addUpBlock(mcframe.clientMSBE.MSBEP1020.BtnR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1020.DtlR.class));
			// Down

			p_MS_MSBEL1020_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1020_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1020_Prnt01.addUpBlock(getHdrR());
			p_MS_MSBEL1020_Prnt01.addUpBlock(getBtnR());
			p_MS_MSBEL1020_Prnt01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1020_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1020_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1020.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP1020.HdrR)up(0);
		}
		protected mcframe.clientMSBE.MSBEP1020.BtnR up1() {
			return (mcframe.clientMSBE.MSBEP1020.BtnR)up(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1020.DtlR> up2() {
			return (MCList<mcframe.clientMSBE.MSBEP1020.DtlR>)up(2);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBEL1020_Prnt01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getBtnR());
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MS_MSBEL1020_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1020_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1020_Sprt01;

		/** コンストラクタ */
		protected MS_MSBEL1020_Sprt01Bridge() {
			p_MS_MSBEL1020_Sprt01 = new MCParam(PDef.MS_MSBEL1020_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1020_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1020.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1020.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1020.DtlR.class));

			p_MS_MSBEL1020_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1020_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1020_Sprt01.addUpBlock(getHdrR());
			p_MS_MSBEL1020_Sprt01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1020_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1020_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1020.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP1020.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1020.DtlR> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP1020.DtlR>)up(1);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1020.DtlR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1020.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1020_Sprt01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1020.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1020_Sprt01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1020.DtlR>)p_MS_MSBEL1020_Sprt01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
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
			result.add(getDtlL());
			return result;
		}
	}
}