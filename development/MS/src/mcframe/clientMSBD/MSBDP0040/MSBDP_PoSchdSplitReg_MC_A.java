package mcframe.clientMSBD.MSBDP0040;

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
import mcframe.clientMSBD.MSBDP0040.MSBDP_PoSchdSplitReg_MC.MS_MSBDL0040_Srch01Caller;
import mcframe.clientMSBD.MSBDP0040.MSBDP_PoSchdSplitReg_MC.MS_MSBDL0040_Srch02Caller;
import mcframe.clientMSBD.MSBDP0040.MSBDP_PoSchdSplitReg_MC.MS_MSBDL0040_Sprt01Caller;
import mcframe.clientMSBD.MSBDP0040.MSBDP_PoSchdSplitReg_MC.MS_MSBDL0040_Sprt02Caller;
import mcframe.clientMSBD.MSBDP0040.MSBDP_PoSchdSplitReg_MC.MS_MSBDL0040_Ins01Caller;
import mcframe.clientMSBD.MSBDP0040.MSBDP_PoSchdSplitReg_MC.MS_MSBDL0040_Del01Caller;

/**
 * 画面"MSBDP_PoSchdSplitReg"パネルクラスです。<p>
 *
 * 発注予定を分割して登録します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDP_PoSchdSplitReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBD";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBDP0040";

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
	 * INS,Create,0;DEL,Cancel,2;REF,Refer,3 INS,登録する,0;DEL,取り消す,2;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
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
	public MCLabel Cnd_srch_tgt_no_Label = null;
	/**
	 * Search target No. 検索対象ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_srch_tgt_no = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch01 = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch02 = null;
	// [Dtl1]ブロック関連のField定義
	public MCPanel Dtl1Panel = null;
	public MCTitledBorder Dtl1TitledBorder = null;
	public MCScrollPane Dtl1ScrollPane = null;
	public MCTable2<mcframe.clientMSBD.MSBDP0040.Dtl1R> Dtl1Table = null;
	// [Dtl1]ブロックの項目のField定義
	/**
	 * Acquire scheduled date / master 予定日・マスタ取得.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_check = null;
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_abort_flg = null;
	/**
	 * Do not allow request source update 依頼元更新不可.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_rqst_upd_stop_flg = null;
	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_reg_dt = null;
	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_in_to_loc_cd = null;
	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_in_to_loc_nm = null;
	/**
	 * Delivery location WG cd. 納入場所ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_in_to_loc_wg_cd = null;
	/**
	 * Delivery location WG name 納入場所ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_in_to_loc_wg_nm = null;
	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_drct_dlv_typ = null;
	/**
	 * Direct-delivery type name 直納区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_drct_dlv_typ_nm = null;
	public MCColumnConfig columnDtl1_outsrc_sppl_cd = null;
	public MCColumnConfig columnDtl1_str_ln_tgt_flg = null;
	public MCColumnConfig columnDtl1_in_to_loc_cal_cd = null;
	public MCColumnConfig columnDtl1_site_cd = null;
	public MCColumnConfig columnDtl1_lg_grp_cd = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Dtl1_dlv_rqst_tm_p_PPanel;
	public MCColumnConfig columnDtl1_dlv_rqst_dt;// [Dtl1]の[dlv_rqst_tm_p.ymd]を[columnDtl1_dlv_rqst_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl1_dlv_rqst_hm;// [Dtl1]の[dlv_rqst_tm_p.hm]を[columnDtl1_dlv_rqst_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl1_itm_p_PPanel;
	public MCColumnConfig columnDtl1_itm_cd;// [Dtl1]の[itm_p.itm_cd]を[columnDtl1_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_itm_sub1;// [Dtl1]の[itm_p.itm_sub1]を[columnDtl1_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl1_itm_sub2;// [Dtl1]の[itm_p.itm_sub2]を[columnDtl1_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl1_itm_sub3;// [Dtl1]の[itm_p.itm_sub3]を[columnDtl1_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl1_itm_nm;// [Dtl1]の[itm_p.itm_nm]を[columnDtl1_itm_nm]としてエイリアス定義。
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sundry_itm_flg = null;
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_str_ln_cd = null;
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_str_ln_nm = null;
	/**
	 * Null 無.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_str_ln_cd_none_flg = null;
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ver_flg = null;
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_asset_mng_typ = null;
	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_dscnt_itm_flg = null;
	/**
	 * Allow item purchasing unit price change 品目購買単価変更許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_itm_purc_upri_cng_flg = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Dtl1_ver_no_p_PPanel;
	public MCColumnConfig columnDtl1_ver_no;// [Dtl1]の[ver_no_p.ver_no]を[columnDtl1_ver_no]としてエイリアス定義。
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_unit_nm = null;
	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_unit_dec_place = null;
	/**
	 * Rounding type (Transaction unit) 端数処理区分（取引単位）.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_unit_rnd_typ = null;
	/**
	 * Conversion base qty. (Transaction unit) 換算基準数量（取引単位）.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_unit_conv_base_qty = null;
	/**
	 * Conversion qty. (Transaction unit) 換算数量（取引単位）.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_unit_conv_qty = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl1_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl1_trd_unit_qty;// [Dtl1]の[trd_unit_qty_p.qty]を[columnDtl1_trd_unit_qty]としてエイリアス定義。
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_base_unit_nm = null;
	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_base_unit_dec_place = null;
	public MCColumnConfig columnDtl1_base_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl1_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl1_base_unit_qty;// [Dtl1]の[base_unit_qty_p.qty]を[columnDtl1_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Dtl1_inst_cont_qty_p_PPanel;
	public MCColumnConfig columnDtl1_cont_qty;// [Dtl1]の[inst_cont_qty_p.cont_qty]を[columnDtl1_cont_qty]としてエイリアス定義。
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_cont_fctr_flg = null;
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_cont_fctr_dec_place = null;
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_cont_fctr_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D Dtl1_cont_unit_p_PPanel;
	public MCColumnConfig columnDtl1_cont_fctr_unit_cd;// [Dtl1]の[cont_unit_p.cont_fctr_unit_cd]を[columnDtl1_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_cont_fctr_unit_nm;// [Dtl1]の[cont_unit_p.cont_fctr_unit_nm]を[columnDtl1_cont_fctr_unit_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D Dtl1_std_cont_p_PPanel;
	public MCColumnConfig columnDtl1_std_cont_fctr;// [Dtl1]の[std_cont_p.std_cont_fctr]を[columnDtl1_std_cont_fctr]としてエイリアス定義。
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sppl_nm = null;
	/**
	 * Supplier country cd. 発注先国ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sppl_cntry_cd = null;
	/**
	 * Supplier country name 発注先国名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sppl_cntry_nm = null;
	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_amt_rnd_typ = null;
	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_tax_rnd_typ = null;
	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sppl_purc_upri_cng_flg = null;
	/**
	 * Supplier calendar cd. 発注先カレンダＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sppl_cal_cd = null;
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_maker_nm = null;
	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sppl_itm_cd = null;
	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sppl_itm_nm = null;
	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_iv_itm_nm = null;
	/**
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_rqst_avl_rqst_dt = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Dtl1_rqst_dlv_rqst_tm_p_PPanel;
	public MCColumnConfig columnDtl1_rqst_dlv_rqst_dt;// [Dtl1]の[rqst_dlv_rqst_tm_p.ymd]を[columnDtl1_rqst_dlv_rqst_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl1_rqst_dlv_rqst_hm;// [Dtl1]の[rqst_dlv_rqst_tm_p.hm]を[columnDtl1_rqst_dlv_rqst_hm]としてエイリアス定義。
	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_schd_dt = null;
	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_po_schd_dt = null;
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Dtl1_usr_dpt_p_PPanel;
	public MCColumnConfig columnDtl1_purc_usr_cd;// [Dtl1]の[usr_dpt_p.usr_cd]を[columnDtl1_purc_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_purc_usr_nm;// [Dtl1]の[usr_dpt_p.usr_nm]を[columnDtl1_purc_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl1_purc_dpt_cd;// [Dtl1]の[usr_dpt_p.dpt_cd]を[columnDtl1_purc_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_purc_dpt_nm;// [Dtl1]の[usr_dpt_p.dpt_nm]を[columnDtl1_purc_dpt_nm]としてエイリアス定義。
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_dpt_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_dpt_wg_nm = null;
	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_upri_req_typ = null;
	/**
	 * Purchase unit price acquisition type name 購買単価取得区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_upri_req_typ_nm = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_cur_nm = null;
	/**
	 * Amount number of decimal places (Transaction currency) 金額小数部有効桁数（取引通貨）.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_cur_amt_dec_place = null;
	/**
	 * Unit price number of decimal places (Transaction currency) 単価小数部有効桁数（取引通貨）.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_cur_upri_dec_place = null;
	public mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D Dtl1_trd_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl1_upri_not_tgt_flg;// [Dtl1]の[trd_cur_upri_p.upri_not_tgt_flg]を[columnDtl1_upri_not_tgt_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl1_trd_cur_upri;// [Dtl1]の[trd_cur_upri_p.trd_cur_upri]を[columnDtl1_trd_cur_upri]としてエイリアス定義。
	public MCColumnConfig columnDtl1_interim_flg;// [Dtl1]の[trd_cur_upri_p.interim_flg]を[columnDtl1_interim_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl1_trd_cur_amt;// [Dtl1]の[trd_cur_upri_p.trd_cur_amt]を[columnDtl1_trd_cur_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl1_trd_cur_inc_tax_amt;// [Dtl1]の[trd_cur_upri_p.trd_cur_inc_tax_amt]を[columnDtl1_trd_cur_inc_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl1_tax_fix_flg;// [Dtl1]の[trd_cur_upri_p.tax_fix_flg]を[columnDtl1_tax_fix_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl1_tax_cd;// [Dtl1]の[trd_cur_upri_p.tax_cd]を[columnDtl1_tax_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_tax_nm;// [Dtl1]の[trd_cur_upri_p.tax_nm]を[columnDtl1_tax_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl1_tax_rate;// [Dtl1]の[trd_cur_upri_p.tax_rate]を[columnDtl1_tax_rate]としてエイリアス定義。
	public MCColumnConfig columnDtl1_tax_typ;// [Dtl1]の[trd_cur_upri_p.tax_typ]を[columnDtl1_tax_typ]としてエイリアス定義。
	public MCColumnConfig columnDtl1_inc_tax_flg;// [Dtl1]の[trd_cur_upri_p.inc_tax_flg]を[columnDtl1_inc_tax_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl1_trd_cur_tax_amt;// [Dtl1]の[trd_cur_upri_p.trd_cur_tax_amt]を[columnDtl1_trd_cur_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl1_trd_cur_dscnt_amt;// [Dtl1]の[trd_cur_upri_p.trd_cur_dscnt_amt]を[columnDtl1_trd_cur_dscnt_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl1_dscnt_rsn_cd;// [Dtl1]の[trd_cur_upri_p.dscnt_rsn_cd]を[columnDtl1_dscnt_rsn_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_dscnt_rsn_nm;// [Dtl1]の[trd_cur_upri_p.dscnt_rsn_nm]を[columnDtl1_dscnt_rsn_nm]としてエイリアス定義。
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_repurc_obli_flg = null;
	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_outsrc_upri_typ = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl1_trd_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnDtl1_trd_cur_proc_upri;// [Dtl1]の[trd_cur_proc_upri_p.upri]を[columnDtl1_trd_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_trd_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnDtl1_trd_cur_proc_amt;// [Dtl1]の[trd_cur_proc_amt_p.amt]を[columnDtl1_trd_cur_proc_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl1_trd_cur_proc_tax_amt;// [Dtl1]の[trd_cur_proc_amt_p.tax_amt]を[columnDtl1_trd_cur_proc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl1_trd_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnDtl1_trd_cur_onr_prov_upri;// [Dtl1]の[trd_cur_onr_prov_upri_p.upri]を[columnDtl1_trd_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_trd_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnDtl1_trd_cur_onr_prov_amt;// [Dtl1]の[trd_cur_onr_prov_amt_p.amt]を[columnDtl1_trd_cur_onr_prov_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl1_trd_cur_onr_prov_tax_amt;// [Dtl1]の[trd_cur_onr_prov_amt_p.tax_amt]を[columnDtl1_trd_cur_onr_prov_tax_amt]としてエイリアス定義。
	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_old_trd_cur_upri = null;
	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_old_trd_cur_proc_upri = null;
	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_old_trd_cur_onr_prov_upri = null;
	/**
	 * Temporary unit price before change 変更前仮単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_old_interim_flg = null;
	/**
	 * Purchase exchange rate cd. 仕入為替レートＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_xrate_cd = null;
	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D Dtl1_xrate_p_PPanel;
	public MCColumnConfig columnDtl1_xrate;// [Dtl1]の[xrate_p.xrate]を[columnDtl1_xrate]としてエイリアス定義。
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_base_cur_cd = null;
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_base_cur_nm = null;
	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_base_cur_amt_dec_place = null;
	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_base_cur_upri_dec_place = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl1_base_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_upri;// [Dtl1]の[base_cur_upri_p.upri]を[columnDtl1_base_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_base_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_amt;// [Dtl1]の[base_cur_amt_p.amt]を[columnDtl1_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_tax_amt;// [Dtl1]の[base_cur_tax_amt_p.amt]を[columnDtl1_base_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_base_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_inc_tax_amt;// [Dtl1]の[base_cur_inc_tax_amt_p.amt]を[columnDtl1_base_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl1_base_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_proc_upri;// [Dtl1]の[base_cur_proc_upri_p.upri]を[columnDtl1_base_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_base_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_proc_amt;// [Dtl1]の[base_cur_proc_amt_p.amt]を[columnDtl1_base_cur_proc_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl1_base_cur_proc_tax_amt;// [Dtl1]の[base_cur_proc_amt_p.tax_amt]を[columnDtl1_base_cur_proc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl1_base_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_onr_prov_upri;// [Dtl1]の[base_cur_onr_prov_upri_p.upri]を[columnDtl1_base_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_base_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_onr_prov_amt;// [Dtl1]の[base_cur_onr_prov_amt_p.amt]を[columnDtl1_base_cur_onr_prov_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl1_base_cur_onr_prov_tax_amt;// [Dtl1]の[base_cur_onr_prov_amt_p.tax_amt]を[columnDtl1_base_cur_onr_prov_tax_amt]としてエイリアス定義。
	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ptax_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D Dtl1_ptax_xrate_p_PPanel;
	public MCColumnConfig columnDtl1_ptax_xrate;// [Dtl1]の[ptax_xrate_p.xrate]を[columnDtl1_ptax_xrate]としてエイリアス定義。
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ptax_cur_cd = null;
	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ptax_cur_nm = null;
	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ptax_cur_amt_dec_place = null;
	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ptax_cur_upri_dec_place = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl1_ptax_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl1_ptax_cur_upri;// [Dtl1]の[ptax_cur_upri_p.upri]を[columnDtl1_ptax_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_ptax_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl1_ptax_cur_amt;// [Dtl1]の[ptax_cur_amt_p.amt]を[columnDtl1_ptax_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_ptax_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl1_ptax_cur_tax_amt;// [Dtl1]の[ptax_cur_tax_amt_p.amt]を[columnDtl1_ptax_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_ptax_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl1_ptax_cur_inc_tax_amt;// [Dtl1]の[ptax_cur_inc_tax_amt_p.amt]を[columnDtl1_ptax_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl1_ptax_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnDtl1_ptax_cur_proc_upri;// [Dtl1]の[ptax_cur_proc_upri_p.upri]を[columnDtl1_ptax_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_ptax_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnDtl1_ptax_cur_proc_amt;// [Dtl1]の[ptax_cur_proc_amt_p.amt]を[columnDtl1_ptax_cur_proc_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl1_ptax_cur_proc_tax_amt;// [Dtl1]の[ptax_cur_proc_amt_p.tax_amt]を[columnDtl1_ptax_cur_proc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl1_ptax_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnDtl1_ptax_cur_onr_prov_upri;// [Dtl1]の[ptax_cur_onr_prov_upri_p.upri]を[columnDtl1_ptax_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_ptax_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnDtl1_ptax_cur_onr_prov_amt;// [Dtl1]の[ptax_cur_onr_prov_amt_p.amt]を[columnDtl1_ptax_cur_onr_prov_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl1_ptax_cur_onr_prov_tax_amt;// [Dtl1]の[ptax_cur_onr_prov_amt_p.tax_amt]を[columnDtl1_ptax_cur_onr_prov_tax_amt]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Dtl1_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnDtl1_sno1;// [Dtl1]の[sno_wrk_no_p.sno1]を[columnDtl1_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl1_sno2;// [Dtl1]の[sno_wrk_no_p.sno2]を[columnDtl1_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl1_sno3;// [Dtl1]の[sno_wrk_no_p.sno3]を[columnDtl1_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl1_sno4;// [Dtl1]の[sno_wrk_no_p.sno4]を[columnDtl1_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl1_wrk_no;// [Dtl1]の[sno_wrk_no_p.wrk_no]を[columnDtl1_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl1_wrk_nm;// [Dtl1]の[sno_wrk_no_p.wrk_nm]を[columnDtl1_wrk_nm]としてエイリアス定義。
	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_rsn_cd = null;
	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_rsn_nm = null;
	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_xpns_purc_flg = null;
	/**
	 * Expense purchase only 経費購買のみ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_not_xpns_purc_flg = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_intr_rmrks = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_d_rmrks = null;
	/**
	 * PO contact remarks 発注連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_po_cnt_rmrks = null;
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_mfg_loc_nm = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_bom_ptn = null;
	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_outsrc_flg = null;
	/**
	 * Subcontracting item order No. 外注品目オーダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_outsrc_itm_ord_no = null;
	public mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D Dtl1_bditm_p_PPanel;
	public MCColumnConfig columnDtl1_bd_dpt_cd;// [Dtl1]の[bditm_p.bd_dpt_cd]を[columnDtl1_bd_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_dpt_nm;// [Dtl1]の[bditm_p.bd_dpt_nm]を[columnDtl1_bd_dpt_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_itm_cd;// [Dtl1]の[bditm_p.bd_itm_cd]を[columnDtl1_bd_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_itm_sub1;// [Dtl1]の[bditm_p.bd_itm_sub1]を[columnDtl1_bd_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_itm_sub2;// [Dtl1]の[bditm_p.bd_itm_sub2]を[columnDtl1_bd_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_itm_sub3;// [Dtl1]の[bditm_p.bd_itm_sub3]を[columnDtl1_bd_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_itm_nm;// [Dtl1]の[bditm_p.bd_itm_nm]を[columnDtl1_bd_itm_nm]としてエイリアス定義。
	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_bd_lot_mng_typ = null;
	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_bd_sublot_mng_typ = null;
	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_bd_lot_no_typ = null;
	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_bd_sublot_no_typ = null;
	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_bd_sno1_mng_typ = null;
	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_bd_sno2_mng_typ = null;
	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_bd_sno3_mng_typ = null;
	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_bd_sno4_mng_typ = null;
	public MCColumnConfig columnDtl1_bd_lot_no;// [Dtl1]の[bditm_p.bd_lot_no]を[columnDtl1_bd_lot_no]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_sublot_no;// [Dtl1]の[bditm_p.bd_sublot_no]を[columnDtl1_bd_sublot_no]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_sno1;// [Dtl1]の[bditm_p.bd_sno1]を[columnDtl1_bd_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_sno2;// [Dtl1]の[bditm_p.bd_sno2]を[columnDtl1_bd_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_sno3;// [Dtl1]の[bditm_p.bd_sno3]を[columnDtl1_bd_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_sno4;// [Dtl1]の[bditm_p.bd_sno4]を[columnDtl1_bd_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_bp_cd;// [Dtl1]の[bditm_p.bd_bp_cd]を[columnDtl1_bd_bp_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_bp_nm;// [Dtl1]の[bditm_p.bd_bp_nm]を[columnDtl1_bd_bp_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_loc_cd;// [Dtl1]の[bditm_p.bd_loc_cd]を[columnDtl1_bd_loc_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_loc_nm;// [Dtl1]の[bditm_p.bd_loc_nm]を[columnDtl1_bd_loc_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_ctg_cd;// [Dtl1]の[bditm_p.bd_ctg_cd]を[columnDtl1_bd_ctg_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_ctg_nm;// [Dtl1]の[bditm_p.bd_ctg_nm]を[columnDtl1_bd_ctg_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_oper_cd;// [Dtl1]の[bditm_p.bd_oper_cd]を[columnDtl1_bd_oper_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_oper_nm;// [Dtl1]の[bditm_p.bd_oper_nm]を[columnDtl1_bd_oper_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_iv_no;// [Dtl1]の[bditm_p.bd_iv_no]を[columnDtl1_bd_iv_no]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_slo_no;// [Dtl1]の[bditm_p.bd_slo_no]を[columnDtl1_bd_slo_no]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_po_no;// [Dtl1]の[bditm_p.bd_po_no]を[columnDtl1_bd_po_no]としてエイリアス定義。
	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_rqst_fr_usr_cd = null;
	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_rqst_fr_usr_nm = null;
	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_rqst_fr_dpt_cd = null;
	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_rqst_fr_dpt_nm = null;
	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_po_schd_no = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_ptn_typ = null;
	/**
	 * PO schedule creating source type name 発注予定作成元区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_po_schd_src_typ = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_upd_srv_req_no = null;
	/**
	 * PO schedule update counter 発注予定更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_po_schd_upd_cntr = null;
	/**
	 * Unit price acquisition base date 単価取得基準日.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_base_dt = null;
	// [Dtl2]ブロック関連のField定義
	public MCPanel Dtl2Panel = null;
	public MCTitledBorder Dtl2TitledBorder = null;
	public MCScrollPane Dtl2ScrollPane = null;
	public MCTable2<mcframe.clientMSBD.MSBDP0040.Dtl1R> Dtl2Table = null;
	// [Dtl2]ブロックの項目のField定義
	/**
	 * Acquire scheduled date / master 予定日・マスタ取得.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_check = null;
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_abort_flg = null;
	/**
	 * Do not allow request source update 依頼元更新不可.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_rqst_upd_stop_flg = null;
	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_reg_dt = null;
	/**
	 * Delivery location 納入場所.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_in_to_loc_cd = null;
	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_in_to_loc_nm = null;
	/**
	 * Delivery location WG cd. 納入場所ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_in_to_loc_wg_cd = null;
	/**
	 * Delivery location WG name 納入場所ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_in_to_loc_wg_nm = null;
	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_drct_dlv_typ = null;
	/**
	 * Direct-delivery type name 直納区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_drct_dlv_typ_nm = null;
	/**
	 * Subcontractor cd. 外注発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_outsrc_sppl_cd = null;
	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_str_ln_tgt_flg = null;
	/**
	 * Delivery location calendar cd. 納入場所カレンダＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_in_to_loc_cal_cd = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_site_cd = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_lg_grp_cd = null;
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_str_ln_cd = null;
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_str_ln_nm = null;
	/**
	 * Null 無.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_str_ln_cd_none_flg = null;
	/**
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_rqst_avl_rqst_dt = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl2_itm_p_PPanel;
	public MCColumnConfig columnDtl2_itm_cd;// [Dtl2]の[itm_p.itm_cd]を[columnDtl2_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl2_itm_sub1;// [Dtl2]の[itm_p.itm_sub1]を[columnDtl2_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl2_itm_sub2;// [Dtl2]の[itm_p.itm_sub2]を[columnDtl2_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl2_itm_sub3;// [Dtl2]の[itm_p.itm_sub3]を[columnDtl2_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl2_itm_nm;// [Dtl2]の[itm_p.itm_nm]を[columnDtl2_itm_nm]としてエイリアス定義。
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sundry_itm_flg = null;
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ver_flg = null;
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_asset_mng_typ = null;
	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_dscnt_itm_flg = null;
	/**
	 * Allow item purchasing unit price change 品目購買単価変更許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_itm_purc_upri_cng_flg = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Dtl2_ver_no_p_PPanel;
	public MCColumnConfig columnDtl2_ver_no;// [Dtl2]の[ver_no_p.ver_no]を[columnDtl2_ver_no]としてエイリアス定義。
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_trd_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_trd_unit_nm = null;
	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_trd_unit_dec_place = null;
	/**
	 * Rounding type (Transaction unit) 端数処理区分（取引単位）.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_trd_unit_rnd_typ = null;
	/**
	 * Conversion base qty. (Transaction unit) 換算基準数量（取引単位）.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_trd_unit_conv_base_qty = null;
	/**
	 * Conversion qty. (Transaction unit) 換算数量（取引単位）.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_trd_unit_conv_qty = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl2_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl2_trd_unit_qty;// [Dtl2]の[trd_unit_qty_p.qty]を[columnDtl2_trd_unit_qty]としてエイリアス定義。
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_base_unit_nm = null;
	public MCColumnConfig columnDtl2_base_unit_dec_place = null;
	public MCColumnConfig columnDtl2_base_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl2_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl2_base_unit_qty;// [Dtl2]の[base_unit_qty_p.qty]を[columnDtl2_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Dtl2_inst_cont_qty_p_PPanel;
	public MCColumnConfig columnDtl2_cont_qty;// [Dtl2]の[inst_cont_qty_p.cont_qty]を[columnDtl2_cont_qty]としてエイリアス定義。
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_cont_fctr_flg = null;
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_cont_fctr_dec_place = null;
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_cont_fctr_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D Dtl2_cont_unit_p_PPanel;
	public MCColumnConfig columnDtl2_cont_fctr_unit_cd;// [Dtl2]の[cont_unit_p.cont_fctr_unit_cd]を[columnDtl2_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl2_cont_fctr_unit_nm;// [Dtl2]の[cont_unit_p.cont_fctr_unit_nm]を[columnDtl2_cont_fctr_unit_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D Dtl2_std_cont_p_PPanel;
	public MCColumnConfig columnDtl2_std_cont_fctr;// [Dtl2]の[std_cont_p.std_cont_fctr]を[columnDtl2_std_cont_fctr]としてエイリアス定義。
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sppl_nm = null;
	/**
	 * Supplier country cd. 発注先国ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sppl_cntry_cd = null;
	/**
	 * Supplier country name 発注先国名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sppl_cntry_nm = null;
	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_purc_amt_rnd_typ = null;
	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_purc_tax_rnd_typ = null;
	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sppl_purc_upri_cng_flg = null;
	/**
	 * Supplier calendar cd. 発注先カレンダＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sppl_cal_cd = null;
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_maker_nm = null;
	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sppl_itm_cd = null;
	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sppl_itm_nm = null;
	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_iv_itm_nm = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Dtl2_dlv_rqst_tm_p_PPanel;
	public MCColumnConfig columnDtl2_dlv_rqst_dt;// [Dtl2]の[dlv_rqst_tm_p.ymd]を[columnDtl2_dlv_rqst_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl2_dlv_rqst_hm;// [Dtl2]の[dlv_rqst_tm_p.hm]を[columnDtl2_dlv_rqst_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Dtl2_rqst_dlv_rqst_tm_p_PPanel;
	public MCColumnConfig columnDtl2_rqst_dlv_rqst_dt;// [Dtl2]の[rqst_dlv_rqst_tm_p.ymd]を[columnDtl2_rqst_dlv_rqst_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl2_rqst_dlv_rqst_hm;// [Dtl2]の[rqst_dlv_rqst_tm_p.hm]を[columnDtl2_rqst_dlv_rqst_hm]としてエイリアス定義。
	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_purc_schd_dt = null;
	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_po_schd_dt = null;
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Dtl2_usr_dpt_p_PPanel;
	public MCColumnConfig columnDtl2_purc_usr_cd;// [Dtl2]の[usr_dpt_p.usr_cd]を[columnDtl2_purc_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl2_purc_usr_nm;// [Dtl2]の[usr_dpt_p.usr_nm]を[columnDtl2_purc_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl2_purc_dpt_cd;// [Dtl2]の[usr_dpt_p.dpt_cd]を[columnDtl2_purc_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl2_purc_dpt_nm;// [Dtl2]の[usr_dpt_p.dpt_nm]を[columnDtl2_purc_dpt_nm]としてエイリアス定義。
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_purc_dpt_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_purc_dpt_wg_nm = null;
	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_purc_upri_req_typ = null;
	/**
	 * Purchase unit price acquisition type name 購買単価取得区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_purc_upri_req_typ_nm = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_trd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_trd_cur_nm = null;
	/**
	 * Amount number of decimal places (Transaction currency) 金額小数部有効桁数（取引通貨）.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_trd_cur_amt_dec_place = null;
	/**
	 * Unit price number of decimal places (Transaction currency) 単価小数部有効桁数（取引通貨）.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_trd_cur_upri_dec_place = null;
	public mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D Dtl2_trd_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl2_upri_not_tgt_flg;// [Dtl2]の[trd_cur_upri_p.upri_not_tgt_flg]を[columnDtl2_upri_not_tgt_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl2_trd_cur_upri;// [Dtl2]の[trd_cur_upri_p.trd_cur_upri]を[columnDtl2_trd_cur_upri]としてエイリアス定義。
	public MCColumnConfig columnDtl2_interim_flg;// [Dtl2]の[trd_cur_upri_p.interim_flg]を[columnDtl2_interim_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl2_trd_cur_amt;// [Dtl2]の[trd_cur_upri_p.trd_cur_amt]を[columnDtl2_trd_cur_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl2_trd_cur_inc_tax_amt;// [Dtl2]の[trd_cur_upri_p.trd_cur_inc_tax_amt]を[columnDtl2_trd_cur_inc_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl2_tax_fix_flg;// [Dtl2]の[trd_cur_upri_p.tax_fix_flg]を[columnDtl2_tax_fix_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl2_tax_cd;// [Dtl2]の[trd_cur_upri_p.tax_cd]を[columnDtl2_tax_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl2_tax_nm;// [Dtl2]の[trd_cur_upri_p.tax_nm]を[columnDtl2_tax_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl2_tax_rate;// [Dtl2]の[trd_cur_upri_p.tax_rate]を[columnDtl2_tax_rate]としてエイリアス定義。
	public MCColumnConfig columnDtl2_tax_typ;// [Dtl2]の[trd_cur_upri_p.tax_typ]を[columnDtl2_tax_typ]としてエイリアス定義。
	public MCColumnConfig columnDtl2_inc_tax_flg;// [Dtl2]の[trd_cur_upri_p.inc_tax_flg]を[columnDtl2_inc_tax_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl2_trd_cur_tax_amt;// [Dtl2]の[trd_cur_upri_p.trd_cur_tax_amt]を[columnDtl2_trd_cur_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl2_trd_cur_dscnt_amt;// [Dtl2]の[trd_cur_upri_p.trd_cur_dscnt_amt]を[columnDtl2_trd_cur_dscnt_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl2_dscnt_rsn_cd;// [Dtl2]の[trd_cur_upri_p.dscnt_rsn_cd]を[columnDtl2_dscnt_rsn_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl2_dscnt_rsn_nm;// [Dtl2]の[trd_cur_upri_p.dscnt_rsn_nm]を[columnDtl2_dscnt_rsn_nm]としてエイリアス定義。
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_repurc_obli_flg = null;
	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_outsrc_upri_typ = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl2_trd_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnDtl2_trd_cur_proc_upri;// [Dtl2]の[trd_cur_proc_upri_p.upri]を[columnDtl2_trd_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl2_trd_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnDtl2_trd_cur_proc_amt;// [Dtl2]の[trd_cur_proc_amt_p.amt]を[columnDtl2_trd_cur_proc_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl2_trd_cur_proc_tax_amt;// [Dtl2]の[trd_cur_proc_amt_p.tax_amt]を[columnDtl2_trd_cur_proc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl2_trd_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnDtl2_trd_cur_onr_prov_upri;// [Dtl2]の[trd_cur_onr_prov_upri_p.upri]を[columnDtl2_trd_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl2_trd_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnDtl2_trd_cur_onr_prov_amt;// [Dtl2]の[trd_cur_onr_prov_amt_p.amt]を[columnDtl2_trd_cur_onr_prov_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl2_trd_cur_onr_prov_tax_amt;// [Dtl2]の[trd_cur_onr_prov_amt_p.tax_amt]を[columnDtl2_trd_cur_onr_prov_tax_amt]としてエイリアス定義。
	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_old_trd_cur_upri = null;
	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_old_trd_cur_proc_upri = null;
	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_old_trd_cur_onr_prov_upri = null;
	/**
	 * Temporary unit price before change 変更前仮単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_old_interim_flg = null;
	/**
	 * Purchase exchange rate cd. 仕入為替レートＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_xrate_cd = null;
	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D Dtl2_xrate_p_PPanel;
	public MCColumnConfig columnDtl2_xrate;// [Dtl2]の[xrate_p.xrate]を[columnDtl2_xrate]としてエイリアス定義。
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_base_cur_cd = null;
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_base_cur_nm = null;
	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_base_cur_amt_dec_place = null;
	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_base_cur_upri_dec_place = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl2_base_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl2_base_cur_upri;// [Dtl2]の[base_cur_upri_p.upri]を[columnDtl2_base_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl2_base_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl2_base_cur_amt;// [Dtl2]の[base_cur_amt_p.amt]を[columnDtl2_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl2_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl2_base_cur_tax_amt;// [Dtl2]の[base_cur_tax_amt_p.amt]を[columnDtl2_base_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl2_base_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl2_base_cur_inc_tax_amt;// [Dtl2]の[base_cur_inc_tax_amt_p.amt]を[columnDtl2_base_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl2_base_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnDtl2_base_cur_proc_upri;// [Dtl2]の[base_cur_proc_upri_p.upri]を[columnDtl2_base_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl2_base_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnDtl2_base_cur_proc_amt;// [Dtl2]の[base_cur_proc_amt_p.amt]を[columnDtl2_base_cur_proc_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl2_base_cur_proc_tax_amt;// [Dtl2]の[base_cur_proc_amt_p.tax_amt]を[columnDtl2_base_cur_proc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl2_base_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnDtl2_base_cur_onr_prov_upri;// [Dtl2]の[base_cur_onr_prov_upri_p.upri]を[columnDtl2_base_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl2_base_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnDtl2_base_cur_onr_prov_amt;// [Dtl2]の[base_cur_onr_prov_amt_p.amt]を[columnDtl2_base_cur_onr_prov_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl2_base_cur_onr_prov_tax_amt;// [Dtl2]の[base_cur_onr_prov_amt_p.tax_amt]を[columnDtl2_base_cur_onr_prov_tax_amt]としてエイリアス定義。
	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ptax_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D Dtl2_ptax_xrate_p_PPanel;
	public MCColumnConfig columnDtl2_ptax_xrate;// [Dtl2]の[ptax_xrate_p.xrate]を[columnDtl2_ptax_xrate]としてエイリアス定義。
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ptax_cur_cd = null;
	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ptax_cur_nm = null;
	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ptax_cur_amt_dec_place = null;
	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ptax_cur_upri_dec_place = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl2_ptax_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl2_ptax_cur_upri;// [Dtl2]の[ptax_cur_upri_p.upri]を[columnDtl2_ptax_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl2_ptax_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl2_ptax_cur_amt;// [Dtl2]の[ptax_cur_amt_p.amt]を[columnDtl2_ptax_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl2_ptax_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl2_ptax_cur_tax_amt;// [Dtl2]の[ptax_cur_tax_amt_p.amt]を[columnDtl2_ptax_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl2_ptax_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl2_ptax_cur_inc_tax_amt;// [Dtl2]の[ptax_cur_inc_tax_amt_p.amt]を[columnDtl2_ptax_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl2_ptax_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnDtl2_ptax_cur_proc_upri;// [Dtl2]の[ptax_cur_proc_upri_p.upri]を[columnDtl2_ptax_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl2_ptax_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnDtl2_ptax_cur_proc_amt;// [Dtl2]の[ptax_cur_proc_amt_p.amt]を[columnDtl2_ptax_cur_proc_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl2_ptax_cur_proc_tax_amt;// [Dtl2]の[ptax_cur_proc_amt_p.tax_amt]を[columnDtl2_ptax_cur_proc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl2_ptax_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnDtl2_ptax_cur_onr_prov_upri;// [Dtl2]の[ptax_cur_onr_prov_upri_p.upri]を[columnDtl2_ptax_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl2_ptax_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnDtl2_ptax_cur_onr_prov_amt;// [Dtl2]の[ptax_cur_onr_prov_amt_p.amt]を[columnDtl2_ptax_cur_onr_prov_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl2_ptax_cur_onr_prov_tax_amt;// [Dtl2]の[ptax_cur_onr_prov_amt_p.tax_amt]を[columnDtl2_ptax_cur_onr_prov_tax_amt]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Dtl2_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnDtl2_sno1;// [Dtl2]の[sno_wrk_no_p.sno1]を[columnDtl2_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl2_sno2;// [Dtl2]の[sno_wrk_no_p.sno2]を[columnDtl2_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl2_sno3;// [Dtl2]の[sno_wrk_no_p.sno3]を[columnDtl2_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl2_sno4;// [Dtl2]の[sno_wrk_no_p.sno4]を[columnDtl2_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl2_wrk_no;// [Dtl2]の[sno_wrk_no_p.wrk_no]を[columnDtl2_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl2_wrk_nm;// [Dtl2]の[sno_wrk_no_p.wrk_nm]を[columnDtl2_wrk_nm]としてエイリアス定義。
	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_purc_rsn_cd = null;
	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_purc_rsn_nm = null;
	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_xpns_purc_flg = null;
	/**
	 * Expense purchase only 経費購買のみ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_not_xpns_purc_flg = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_intr_rmrks = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_trd_d_rmrks = null;
	/**
	 * PO contact remarks 発注連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_po_cnt_rmrks = null;
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_mfg_loc_nm = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_bom_ptn = null;
	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_outsrc_flg = null;
	/**
	 * Subcontracting item order No. 外注品目オーダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_outsrc_itm_ord_no = null;
	public mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D Dtl2_bditm_p_PPanel;
	public MCColumnConfig columnDtl2_bd_dpt_cd;// [Dtl2]の[bditm_p.bd_dpt_cd]を[columnDtl2_bd_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl2_bd_dpt_nm;// [Dtl2]の[bditm_p.bd_dpt_nm]を[columnDtl2_bd_dpt_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl2_bd_itm_cd;// [Dtl2]の[bditm_p.bd_itm_cd]を[columnDtl2_bd_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl2_bd_itm_sub1;// [Dtl2]の[bditm_p.bd_itm_sub1]を[columnDtl2_bd_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl2_bd_itm_sub2;// [Dtl2]の[bditm_p.bd_itm_sub2]を[columnDtl2_bd_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl2_bd_itm_sub3;// [Dtl2]の[bditm_p.bd_itm_sub3]を[columnDtl2_bd_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl2_bd_itm_nm;// [Dtl2]の[bditm_p.bd_itm_nm]を[columnDtl2_bd_itm_nm]としてエイリアス定義。
	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_bd_lot_mng_typ = null;
	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_bd_sublot_mng_typ = null;
	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_bd_lot_no_typ = null;
	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_bd_sublot_no_typ = null;
	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_bd_sno1_mng_typ = null;
	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_bd_sno2_mng_typ = null;
	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_bd_sno3_mng_typ = null;
	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_bd_sno4_mng_typ = null;
	public MCColumnConfig columnDtl2_bd_lot_no;// [Dtl2]の[bditm_p.bd_lot_no]を[columnDtl2_bd_lot_no]としてエイリアス定義。
	public MCColumnConfig columnDtl2_bd_sublot_no;// [Dtl2]の[bditm_p.bd_sublot_no]を[columnDtl2_bd_sublot_no]としてエイリアス定義。
	public MCColumnConfig columnDtl2_bd_sno1;// [Dtl2]の[bditm_p.bd_sno1]を[columnDtl2_bd_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl2_bd_sno2;// [Dtl2]の[bditm_p.bd_sno2]を[columnDtl2_bd_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl2_bd_sno3;// [Dtl2]の[bditm_p.bd_sno3]を[columnDtl2_bd_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl2_bd_sno4;// [Dtl2]の[bditm_p.bd_sno4]を[columnDtl2_bd_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl2_bd_bp_cd;// [Dtl2]の[bditm_p.bd_bp_cd]を[columnDtl2_bd_bp_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl2_bd_bp_nm;// [Dtl2]の[bditm_p.bd_bp_nm]を[columnDtl2_bd_bp_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl2_bd_loc_cd;// [Dtl2]の[bditm_p.bd_loc_cd]を[columnDtl2_bd_loc_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl2_bd_loc_nm;// [Dtl2]の[bditm_p.bd_loc_nm]を[columnDtl2_bd_loc_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl2_bd_ctg_cd;// [Dtl2]の[bditm_p.bd_ctg_cd]を[columnDtl2_bd_ctg_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl2_bd_ctg_nm;// [Dtl2]の[bditm_p.bd_ctg_nm]を[columnDtl2_bd_ctg_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl2_bd_oper_cd;// [Dtl2]の[bditm_p.bd_oper_cd]を[columnDtl2_bd_oper_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl2_bd_oper_nm;// [Dtl2]の[bditm_p.bd_oper_nm]を[columnDtl2_bd_oper_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl2_bd_iv_no;// [Dtl2]の[bditm_p.bd_iv_no]を[columnDtl2_bd_iv_no]としてエイリアス定義。
	public MCColumnConfig columnDtl2_bd_slo_no;// [Dtl2]の[bditm_p.bd_slo_no]を[columnDtl2_bd_slo_no]としてエイリアス定義。
	public MCColumnConfig columnDtl2_bd_po_no;// [Dtl2]の[bditm_p.bd_po_no]を[columnDtl2_bd_po_no]としてエイリアス定義。
	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_rqst_fr_usr_cd = null;
	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_rqst_fr_usr_nm = null;
	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_rqst_fr_dpt_cd = null;
	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_rqst_fr_dpt_nm = null;
	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_po_schd_no = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_trd_ptn_typ = null;
	/**
	 * PO schedule creating source type name 発注予定作成元区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_po_schd_src_typ = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_upd_srv_req_no = null;
	/**
	 * PO schedule update counter 発注予定更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_po_schd_upd_cntr = null;
	/**
	 * Unit price acquisition base date 単価取得基準日.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_base_dt = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Acquire scheduled date / master 予定日・マスタ取得.<p>
	 *
	 */
	public MCButton Btn_mstr_replace = null;
	/**
	 * Reacquire unit price 単価再取得.<p>
	 *
	 */
	public MCButton Btn_upri_replace = null;
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
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_ins = null;
	public mcframe.clientFSBA.FSBAP0020.FSBAP0020 Btn_sync_p_PPanel;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [SRCH_SPLIT]モードを表す定数 */
	public static final String SRCH_SPLIT = "SRCH_SPLIT";
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [SRCH_DEL]モードを表す定数 */
	public static final String SRCH_DEL = "SRCH_DEL";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [SRCH_REF]モードを表す定数 */
	public static final String SRCH_REF = "SRCH_REF";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [FIX_I]モードを表す定数 */
	public static final String FIX_I = "FIX_I";
	/** [FIX_D]モードを表す定数 */
	public static final String FIX_D = "FIX_D";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_SPLIT, INS, SRCH_DEL, DEL, SRCH_REF, REF, FIX_I, FIX_D};
	
	/** [MS_MSBDL0040_Srch01]のCallerの作成 */
	protected MSBDP_PoSchdSplitReg_MC.MS_MSBDL0040_Srch01Caller createMS_MSBDL0040_Srch01() {
		MSBDP_PoSchdSplitReg_MC.MS_MSBDL0040_Srch01Caller<MSBDP_PoSchdSplitReg, MS_MSBDL0040_Srch01Bridge>
		caller = ((MSBDP_PoSchdSplitReg_MC)this).new MS_MSBDL0040_Srch01Caller<MSBDP_PoSchdSplitReg, MS_MSBDL0040_Srch01Bridge>(
					(MSBDP_PoSchdSplitReg)this, new MS_MSBDL0040_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBDL0040_Srch01]の呼び出し */
	protected void callMS_MSBDL0040_Srch01() {
		MCCaller caller = createMS_MSBDL0040_Srch01();
		caller.exec();
	}
	/** [MS_MSBDL0040_Srch02]のCallerの作成 */
	protected MSBDP_PoSchdSplitReg_MC.MS_MSBDL0040_Srch02Caller createMS_MSBDL0040_Srch02() {
		MSBDP_PoSchdSplitReg_MC.MS_MSBDL0040_Srch02Caller<MSBDP_PoSchdSplitReg, MS_MSBDL0040_Srch02Bridge>
		caller = ((MSBDP_PoSchdSplitReg_MC)this).new MS_MSBDL0040_Srch02Caller<MSBDP_PoSchdSplitReg, MS_MSBDL0040_Srch02Bridge>(
					(MSBDP_PoSchdSplitReg)this, new MS_MSBDL0040_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBDL0040_Srch02]の呼び出し */
	protected void callMS_MSBDL0040_Srch02() {
		MCCaller caller = createMS_MSBDL0040_Srch02();
		caller.exec();
	}
	/** [MS_MSBDL0040_Sprt01]のCallerの作成 */
	protected MSBDP_PoSchdSplitReg_MC.MS_MSBDL0040_Sprt01Caller createMS_MSBDL0040_Sprt01() {
		MSBDP_PoSchdSplitReg_MC.MS_MSBDL0040_Sprt01Caller<MSBDP_PoSchdSplitReg, MS_MSBDL0040_Sprt01Bridge>
		caller = ((MSBDP_PoSchdSplitReg_MC)this).new MS_MSBDL0040_Sprt01Caller<MSBDP_PoSchdSplitReg, MS_MSBDL0040_Sprt01Bridge>(
					(MSBDP_PoSchdSplitReg)this, new MS_MSBDL0040_Sprt01Bridge());
		return caller;
	}
	/** [MS_MSBDL0040_Sprt01]の呼び出し */
	protected void callMS_MSBDL0040_Sprt01() {
		MCCaller caller = createMS_MSBDL0040_Sprt01();
		caller.exec();
	}
	/** [MS_MSBDL0040_Sprt02]のCallerの作成 */
	protected MSBDP_PoSchdSplitReg_MC.MS_MSBDL0040_Sprt02Caller createMS_MSBDL0040_Sprt02() {
		MSBDP_PoSchdSplitReg_MC.MS_MSBDL0040_Sprt02Caller<MSBDP_PoSchdSplitReg, MS_MSBDL0040_Sprt02Bridge>
		caller = ((MSBDP_PoSchdSplitReg_MC)this).new MS_MSBDL0040_Sprt02Caller<MSBDP_PoSchdSplitReg, MS_MSBDL0040_Sprt02Bridge>(
					(MSBDP_PoSchdSplitReg)this, new MS_MSBDL0040_Sprt02Bridge());
		return caller;
	}
	/** [MS_MSBDL0040_Sprt02]の呼び出し */
	protected void callMS_MSBDL0040_Sprt02() {
		MCCaller caller = createMS_MSBDL0040_Sprt02();
		caller.exec();
	}
	/** [MS_MSBDL0040_Ins01]のCallerの作成 */
	protected MSBDP_PoSchdSplitReg_MC.MS_MSBDL0040_Ins01Caller createMS_MSBDL0040_Ins01() {
		MSBDP_PoSchdSplitReg_MC.MS_MSBDL0040_Ins01Caller<MSBDP_PoSchdSplitReg, MS_MSBDL0040_Ins01Bridge>
		caller = ((MSBDP_PoSchdSplitReg_MC)this).new MS_MSBDL0040_Ins01Caller<MSBDP_PoSchdSplitReg, MS_MSBDL0040_Ins01Bridge>(
					(MSBDP_PoSchdSplitReg)this, new MS_MSBDL0040_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBDL0040_Ins01]の呼び出し */
	protected void callMS_MSBDL0040_Ins01() {
		MCCaller caller = createMS_MSBDL0040_Ins01();
		caller.exec();
	}
	/** [MS_MSBDL0040_Del01]のCallerの作成 */
	protected MSBDP_PoSchdSplitReg_MC.MS_MSBDL0040_Del01Caller createMS_MSBDL0040_Del01() {
		MSBDP_PoSchdSplitReg_MC.MS_MSBDL0040_Del01Caller<MSBDP_PoSchdSplitReg, MS_MSBDL0040_Del01Bridge>
		caller = ((MSBDP_PoSchdSplitReg_MC)this).new MS_MSBDL0040_Del01Caller<MSBDP_PoSchdSplitReg, MS_MSBDL0040_Del01Bridge>(
					(MSBDP_PoSchdSplitReg)this, new MS_MSBDL0040_Del01Bridge());
		return caller;
	}
	/** [MS_MSBDL0040_Del01]の呼び出し */
	protected void callMS_MSBDL0040_Del01() {
		MCCaller caller = createMS_MSBDL0040_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0040.CndR aCndR;
	/** [Dtl1]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R> aDtl1L;
	/** [Dtl2]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R> aDtl2L;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBD.MSBDP0040.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBD.MSBDP0040.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBD.MSBDP0040.CndR createCndR() {
		return mcframe.clientMSBD.MSBDP0040.CndR.create();
	}

	/**
	 * コピーによってaDtl1Lを設定します。
	 *
	 * aDtl1Lのインスタンスは変更されません。
	 *
	 * @param dataset Dtl1L
	 */
	public void setDtl1L(MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R> aList) {
		if (getDtl1L() != aList) {
			getDtl1L().setAll(aList);
		}
	}

	/**
	 * [Dtl1]ブロックのコンテナaDtl1Lを返します。
	 *
	 * @return Dtl1L
	 */
	public MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R> getDtl1L() {
		return aDtl1L;
	}

	/**
	 * aDtl1Rを作成します。
	 *
	 * @return Dtl1R
	 */
	public mcframe.clientMSBD.MSBDP0040.Dtl1R createDtl1R() {
		return mcframe.clientMSBD.MSBDP0040.Dtl1R.create();
	}

	/**
	 * aDtl1Lを作成します。
	 *
	 * @return Dtl1L
	 */
	public MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R> createDtl1L() {
		return MCList.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.class);
	}

	/**
	 * Dtl1Tableを初期化します。
	 */
	protected void createDtl1Table(){
		if(Dtl1Table == null){
			Dtl1Table = beansFactory.createTable2("Dtl1.table");
		}
	}

	/**
	 * コピーによってaDtl2Lを設定します。
	 *
	 * aDtl2Lのインスタンスは変更されません。
	 *
	 * @param dataset Dtl2L
	 */
	public void setDtl2L(MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R> aList) {
		if (getDtl2L() != aList) {
			getDtl2L().setAll(aList);
		}
	}

	/**
	 * [Dtl2]ブロックのコンテナaDtl2Lを返します。
	 *
	 * @return Dtl2L
	 */
	public MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R> getDtl2L() {
		return aDtl2L;
	}

	/**
	 * aDtl2Rを作成します。
	 *
	 * @return Dtl2R
	 */
	public mcframe.clientMSBD.MSBDP0040.Dtl1R createDtl2R() {
		return mcframe.clientMSBD.MSBDP0040.Dtl1R.create();
	}

	/**
	 * aDtl2Lを作成します。
	 *
	 * @return Dtl2L
	 */
	public MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R> createDtl2L() {
		return MCList.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.class);
	}

	/**
	 * Dtl2Tableを初期化します。
	 */
	protected void createDtl2Table(){
		if(Dtl2Table == null){
			Dtl2Table = beansFactory.createTable2("Dtl2.table");
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
		if(!MCCollectionUtil.contains(ret, getDtl1L())) ret.add(getDtl1L());
		if(!MCCollectionUtil.contains(ret, getDtl2L())) ret.add(getDtl2L());
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
		if(aCnt == getDtl1L()) return "Dtl1";
		if(aCnt == getDtl2L()) return "Dtl2";
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
		if(bId.equals("Dtl1")) return getDtl1L();
		if(bId.equals("Dtl2")) return getDtl2L();
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
		ret.add(Dtl1Panel);
		ret.add(Dtl2Panel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_PoSchdSplitReg_MC_A() {
		aCndR = createCndR();
		aDtl1L = createDtl1L();
		aDtl2L = createDtl2L();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBDP_PoSchdSplitReg_MC_A(String name) {
		aCndR = createCndR();
		aDtl1L = createDtl1L();
		createDtl1Table();
		Dtl1Table.setRowName(name);
		aDtl2L = createDtl2L();
		createDtl2Table();
		Dtl2Table.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBDP_PoSchdSplitReg_MC.jbCreateScreenOpe((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.jbCreateCnd((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.jbCreateDtl1((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.jbCreateDtl2((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.jbCreateBtn((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.jbCreateEastBtn((MSBDP_PoSchdSplitReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBDP_PoSchdSplitReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBDP_PoSchdSplitReg p) {
	}

	/**
	 * [Dtl1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl1(MSBDP_PoSchdSplitReg p) {
		p.Dtl1_dlv_rqst_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$dlv_rqst_tm_p);
		p.Dtl1_dlv_rqst_tm_p_PPanel.setName("Dtl1.dlv_rqst_tm_p");
		p.columnDtl1_dlv_rqst_dt = p.Dtl1_dlv_rqst_tm_p_PPanel.columnYmdHm_ymd;
		p.columnDtl1_dlv_rqst_dt.addAliasName("Dtl1.dlv_rqst_dt", p);
		p.columnDtl1_dlv_rqst_hm = p.Dtl1_dlv_rqst_tm_p_PPanel.columnYmdHm_hm;
		p.columnDtl1_dlv_rqst_hm.addAliasName("Dtl1.dlv_rqst_hm", p);
		p.Dtl1_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$itm_p);
		p.Dtl1_itm_p_PPanel.setName("Dtl1.itm_p");
		p.columnDtl1_itm_cd = p.Dtl1_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl1_itm_cd.addAliasName("Dtl1.itm_cd", p);
		p.columnDtl1_itm_sub1 = p.Dtl1_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl1_itm_sub1.addAliasName("Dtl1.itm_sub1", p);
		p.columnDtl1_itm_sub2 = p.Dtl1_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl1_itm_sub2.addAliasName("Dtl1.itm_sub2", p);
		p.columnDtl1_itm_sub3 = p.Dtl1_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl1_itm_sub3.addAliasName("Dtl1.itm_sub3", p);
		p.columnDtl1_itm_nm = p.Dtl1_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl1_itm_nm.addAliasName("Dtl1.itm_nm", p);
		p.Dtl1_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$ver_no_p);
		p.Dtl1_ver_no_p_PPanel.setName("Dtl1.ver_no_p");
		p.columnDtl1_ver_no = p.Dtl1_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnDtl1_ver_no.addAliasName("Dtl1.ver_no", p);
		p.Dtl1_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$trd_unit_qty_p);
		p.Dtl1_trd_unit_qty_p_PPanel.setName("Dtl1.trd_unit_qty_p");
		p.columnDtl1_trd_unit_qty = p.Dtl1_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl1_trd_unit_qty.addAliasName("Dtl1.trd_unit_qty", p);
		p.Dtl1_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$base_unit_qty_p);
		p.Dtl1_base_unit_qty_p_PPanel.setName("Dtl1.base_unit_qty_p");
		p.columnDtl1_base_unit_qty = p.Dtl1_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl1_base_unit_qty.addAliasName("Dtl1.base_unit_qty", p);
		p.Dtl1_inst_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$inst_cont_qty_p);
		p.Dtl1_inst_cont_qty_p_PPanel.setName("Dtl1.inst_cont_qty_p");
		p.columnDtl1_cont_qty = p.Dtl1_inst_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnDtl1_cont_qty.addAliasName("Dtl1.cont_qty", p);
		p.Dtl1_cont_unit_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$cont_unit_p);
		p.Dtl1_cont_unit_p_PPanel.setName("Dtl1.cont_unit_p");
		p.columnDtl1_cont_fctr_unit_cd = p.Dtl1_cont_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnDtl1_cont_fctr_unit_cd.addAliasName("Dtl1.cont_fctr_unit_cd", p);
		p.columnDtl1_cont_fctr_unit_nm = p.Dtl1_cont_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnDtl1_cont_fctr_unit_nm.addAliasName("Dtl1.cont_fctr_unit_nm", p);
		p.Dtl1_std_cont_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$std_cont_p);
		p.Dtl1_std_cont_p_PPanel.setName("Dtl1.std_cont_p");
		p.columnDtl1_std_cont_fctr = p.Dtl1_std_cont_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnDtl1_std_cont_fctr.addAliasName("Dtl1.std_cont_fctr", p);
		p.Dtl1_rqst_dlv_rqst_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$rqst_dlv_rqst_tm_p);
		p.Dtl1_rqst_dlv_rqst_tm_p_PPanel.setName("Dtl1.rqst_dlv_rqst_tm_p");
		p.columnDtl1_rqst_dlv_rqst_dt = p.Dtl1_rqst_dlv_rqst_tm_p_PPanel.columnYmdHm_ymd;
		p.columnDtl1_rqst_dlv_rqst_dt.addAliasName("Dtl1.rqst_dlv_rqst_dt", p);
		p.columnDtl1_rqst_dlv_rqst_hm = p.Dtl1_rqst_dlv_rqst_tm_p_PPanel.columnYmdHm_hm;
		p.columnDtl1_rqst_dlv_rqst_hm.addAliasName("Dtl1.rqst_dlv_rqst_hm", p);
		p.Dtl1_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$usr_dpt_p);
		p.Dtl1_usr_dpt_p_PPanel.setName("Dtl1.usr_dpt_p");
		p.columnDtl1_purc_usr_cd = p.Dtl1_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnDtl1_purc_usr_cd.addAliasName("Dtl1.purc_usr_cd", p);
		p.columnDtl1_purc_usr_nm = p.Dtl1_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnDtl1_purc_usr_nm.addAliasName("Dtl1.purc_usr_nm", p);
		p.columnDtl1_purc_dpt_cd = p.Dtl1_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnDtl1_purc_dpt_cd.addAliasName("Dtl1.purc_dpt_cd", p);
		p.columnDtl1_purc_dpt_nm = p.Dtl1_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnDtl1_purc_dpt_nm.addAliasName("Dtl1.purc_dpt_nm", p);
		p.Dtl1_trd_cur_upri_p_PPanel = mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$trd_cur_upri_p);
		p.Dtl1_trd_cur_upri_p_PPanel.setName("Dtl1.trd_cur_upri_p");
		p.columnDtl1_upri_not_tgt_flg = p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg;
		p.columnDtl1_upri_not_tgt_flg.addAliasName("Dtl1.upri_not_tgt_flg", p);
		p.columnDtl1_trd_cur_upri = p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_upri;
		p.columnDtl1_trd_cur_upri.addAliasName("Dtl1.trd_cur_upri", p);
		p.columnDtl1_interim_flg = p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_interim_flg;
		p.columnDtl1_interim_flg.addAliasName("Dtl1.interim_flg", p);
		p.columnDtl1_trd_cur_amt = p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_amt;
		p.columnDtl1_trd_cur_amt.addAliasName("Dtl1.trd_cur_amt", p);
		p.columnDtl1_trd_cur_inc_tax_amt = p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_inc_tax_amt;
		p.columnDtl1_trd_cur_inc_tax_amt.addAliasName("Dtl1.trd_cur_inc_tax_amt", p);
		p.columnDtl1_tax_fix_flg = p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg;
		p.columnDtl1_tax_fix_flg.addAliasName("Dtl1.tax_fix_flg", p);
		p.columnDtl1_tax_cd = p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd;
		p.columnDtl1_tax_cd.addAliasName("Dtl1.tax_cd", p);
		p.columnDtl1_tax_nm = p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_nm;
		p.columnDtl1_tax_nm.addAliasName("Dtl1.tax_nm", p);
		p.columnDtl1_tax_rate = p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_rate;
		p.columnDtl1_tax_rate.addAliasName("Dtl1.tax_rate", p);
		p.columnDtl1_tax_typ = p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_typ;
		p.columnDtl1_tax_typ.addAliasName("Dtl1.tax_typ", p);
		p.columnDtl1_inc_tax_flg = p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_inc_tax_flg;
		p.columnDtl1_inc_tax_flg.addAliasName("Dtl1.inc_tax_flg", p);
		p.columnDtl1_trd_cur_tax_amt = p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_tax_amt;
		p.columnDtl1_trd_cur_tax_amt.addAliasName("Dtl1.trd_cur_tax_amt", p);
		p.columnDtl1_trd_cur_dscnt_amt = p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt;
		p.columnDtl1_trd_cur_dscnt_amt.addAliasName("Dtl1.trd_cur_dscnt_amt", p);
		p.columnDtl1_dscnt_rsn_cd = p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd;
		p.columnDtl1_dscnt_rsn_cd.addAliasName("Dtl1.dscnt_rsn_cd", p);
		p.columnDtl1_dscnt_rsn_nm = p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm;
		p.columnDtl1_dscnt_rsn_nm.addAliasName("Dtl1.dscnt_rsn_nm", p);
		p.Dtl1_trd_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$trd_cur_proc_upri_p);
		p.Dtl1_trd_cur_proc_upri_p_PPanel.setName("Dtl1.trd_cur_proc_upri_p");
		p.columnDtl1_trd_cur_proc_upri = p.Dtl1_trd_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnDtl1_trd_cur_proc_upri.addAliasName("Dtl1.trd_cur_proc_upri", p);
		p.Dtl1_trd_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$trd_cur_proc_amt_p);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.setName("Dtl1.trd_cur_proc_amt_p");
		p.columnDtl1_trd_cur_proc_amt = p.Dtl1_trd_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_trd_cur_proc_amt.addAliasName("Dtl1.trd_cur_proc_amt", p);
		p.columnDtl1_trd_cur_proc_tax_amt = p.Dtl1_trd_cur_proc_amt_p_PPanel.columnAmt_tax_amt;
		p.columnDtl1_trd_cur_proc_tax_amt.addAliasName("Dtl1.trd_cur_proc_tax_amt", p);
		p.Dtl1_trd_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$trd_cur_onr_prov_upri_p);
		p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.setName("Dtl1.trd_cur_onr_prov_upri_p");
		p.columnDtl1_trd_cur_onr_prov_upri = p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnDtl1_trd_cur_onr_prov_upri.addAliasName("Dtl1.trd_cur_onr_prov_upri", p);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$trd_cur_onr_prov_amt_p);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.setName("Dtl1.trd_cur_onr_prov_amt_p");
		p.columnDtl1_trd_cur_onr_prov_amt = p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_trd_cur_onr_prov_amt.addAliasName("Dtl1.trd_cur_onr_prov_amt", p);
		p.columnDtl1_trd_cur_onr_prov_tax_amt = p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt;
		p.columnDtl1_trd_cur_onr_prov_tax_amt.addAliasName("Dtl1.trd_cur_onr_prov_tax_amt", p);
		p.Dtl1_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$xrate_p);
		p.Dtl1_xrate_p_PPanel.setName("Dtl1.xrate_p");
		p.columnDtl1_xrate = p.Dtl1_xrate_p_PPanel.columnXrate_xrate;
		p.columnDtl1_xrate.addAliasName("Dtl1.xrate", p);
		p.Dtl1_base_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$base_cur_upri_p);
		p.Dtl1_base_cur_upri_p_PPanel.setName("Dtl1.base_cur_upri_p");
		p.columnDtl1_base_cur_upri = p.Dtl1_base_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl1_base_cur_upri.addAliasName("Dtl1.base_cur_upri", p);
		p.Dtl1_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$base_cur_amt_p);
		p.Dtl1_base_cur_amt_p_PPanel.setName("Dtl1.base_cur_amt_p");
		p.columnDtl1_base_cur_amt = p.Dtl1_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_base_cur_amt.addAliasName("Dtl1.base_cur_amt", p);
		p.Dtl1_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$base_cur_tax_amt_p);
		p.Dtl1_base_cur_tax_amt_p_PPanel.setName("Dtl1.base_cur_tax_amt_p");
		p.columnDtl1_base_cur_tax_amt = p.Dtl1_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_base_cur_tax_amt.addAliasName("Dtl1.base_cur_tax_amt", p);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$base_cur_inc_tax_amt_p);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.setName("Dtl1.base_cur_inc_tax_amt_p");
		p.columnDtl1_base_cur_inc_tax_amt = p.Dtl1_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_base_cur_inc_tax_amt.addAliasName("Dtl1.base_cur_inc_tax_amt", p);
		p.Dtl1_base_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$base_cur_proc_upri_p);
		p.Dtl1_base_cur_proc_upri_p_PPanel.setName("Dtl1.base_cur_proc_upri_p");
		p.columnDtl1_base_cur_proc_upri = p.Dtl1_base_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnDtl1_base_cur_proc_upri.addAliasName("Dtl1.base_cur_proc_upri", p);
		p.Dtl1_base_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$base_cur_proc_amt_p);
		p.Dtl1_base_cur_proc_amt_p_PPanel.setName("Dtl1.base_cur_proc_amt_p");
		p.columnDtl1_base_cur_proc_amt = p.Dtl1_base_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_base_cur_proc_amt.addAliasName("Dtl1.base_cur_proc_amt", p);
		p.columnDtl1_base_cur_proc_tax_amt = p.Dtl1_base_cur_proc_amt_p_PPanel.columnAmt_tax_amt;
		p.columnDtl1_base_cur_proc_tax_amt.addAliasName("Dtl1.base_cur_proc_tax_amt", p);
		p.Dtl1_base_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$base_cur_onr_prov_upri_p);
		p.Dtl1_base_cur_onr_prov_upri_p_PPanel.setName("Dtl1.base_cur_onr_prov_upri_p");
		p.columnDtl1_base_cur_onr_prov_upri = p.Dtl1_base_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnDtl1_base_cur_onr_prov_upri.addAliasName("Dtl1.base_cur_onr_prov_upri", p);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$base_cur_onr_prov_amt_p);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.setName("Dtl1.base_cur_onr_prov_amt_p");
		p.columnDtl1_base_cur_onr_prov_amt = p.Dtl1_base_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_base_cur_onr_prov_amt.addAliasName("Dtl1.base_cur_onr_prov_amt", p);
		p.columnDtl1_base_cur_onr_prov_tax_amt = p.Dtl1_base_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt;
		p.columnDtl1_base_cur_onr_prov_tax_amt.addAliasName("Dtl1.base_cur_onr_prov_tax_amt", p);
		p.Dtl1_ptax_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$ptax_xrate_p);
		p.Dtl1_ptax_xrate_p_PPanel.setName("Dtl1.ptax_xrate_p");
		p.columnDtl1_ptax_xrate = p.Dtl1_ptax_xrate_p_PPanel.columnXrate_xrate;
		p.columnDtl1_ptax_xrate.addAliasName("Dtl1.ptax_xrate", p);
		p.Dtl1_ptax_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$ptax_cur_upri_p);
		p.Dtl1_ptax_cur_upri_p_PPanel.setName("Dtl1.ptax_cur_upri_p");
		p.columnDtl1_ptax_cur_upri = p.Dtl1_ptax_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl1_ptax_cur_upri.addAliasName("Dtl1.ptax_cur_upri", p);
		p.Dtl1_ptax_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$ptax_cur_amt_p);
		p.Dtl1_ptax_cur_amt_p_PPanel.setName("Dtl1.ptax_cur_amt_p");
		p.columnDtl1_ptax_cur_amt = p.Dtl1_ptax_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_ptax_cur_amt.addAliasName("Dtl1.ptax_cur_amt", p);
		p.Dtl1_ptax_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$ptax_cur_tax_amt_p);
		p.Dtl1_ptax_cur_tax_amt_p_PPanel.setName("Dtl1.ptax_cur_tax_amt_p");
		p.columnDtl1_ptax_cur_tax_amt = p.Dtl1_ptax_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_ptax_cur_tax_amt.addAliasName("Dtl1.ptax_cur_tax_amt", p);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$ptax_cur_inc_tax_amt_p);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.setName("Dtl1.ptax_cur_inc_tax_amt_p");
		p.columnDtl1_ptax_cur_inc_tax_amt = p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_ptax_cur_inc_tax_amt.addAliasName("Dtl1.ptax_cur_inc_tax_amt", p);
		p.Dtl1_ptax_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$ptax_cur_proc_upri_p);
		p.Dtl1_ptax_cur_proc_upri_p_PPanel.setName("Dtl1.ptax_cur_proc_upri_p");
		p.columnDtl1_ptax_cur_proc_upri = p.Dtl1_ptax_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnDtl1_ptax_cur_proc_upri.addAliasName("Dtl1.ptax_cur_proc_upri", p);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$ptax_cur_proc_amt_p);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.setName("Dtl1.ptax_cur_proc_amt_p");
		p.columnDtl1_ptax_cur_proc_amt = p.Dtl1_ptax_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_ptax_cur_proc_amt.addAliasName("Dtl1.ptax_cur_proc_amt", p);
		p.columnDtl1_ptax_cur_proc_tax_amt = p.Dtl1_ptax_cur_proc_amt_p_PPanel.columnAmt_tax_amt;
		p.columnDtl1_ptax_cur_proc_tax_amt.addAliasName("Dtl1.ptax_cur_proc_tax_amt", p);
		p.Dtl1_ptax_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$ptax_cur_onr_prov_upri_p);
		p.Dtl1_ptax_cur_onr_prov_upri_p_PPanel.setName("Dtl1.ptax_cur_onr_prov_upri_p");
		p.columnDtl1_ptax_cur_onr_prov_upri = p.Dtl1_ptax_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnDtl1_ptax_cur_onr_prov_upri.addAliasName("Dtl1.ptax_cur_onr_prov_upri", p);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$ptax_cur_onr_prov_amt_p);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.setName("Dtl1.ptax_cur_onr_prov_amt_p");
		p.columnDtl1_ptax_cur_onr_prov_amt = p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_ptax_cur_onr_prov_amt.addAliasName("Dtl1.ptax_cur_onr_prov_amt", p);
		p.columnDtl1_ptax_cur_onr_prov_tax_amt = p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt;
		p.columnDtl1_ptax_cur_onr_prov_tax_amt.addAliasName("Dtl1.ptax_cur_onr_prov_tax_amt", p);
		p.Dtl1_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$sno_wrk_no_p);
		p.Dtl1_sno_wrk_no_p_PPanel.setName("Dtl1.sno_wrk_no_p");
		p.columnDtl1_sno1 = p.Dtl1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnDtl1_sno1.addAliasName("Dtl1.sno1", p);
		p.columnDtl1_sno2 = p.Dtl1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnDtl1_sno2.addAliasName("Dtl1.sno2", p);
		p.columnDtl1_sno3 = p.Dtl1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnDtl1_sno3.addAliasName("Dtl1.sno3", p);
		p.columnDtl1_sno4 = p.Dtl1_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnDtl1_sno4.addAliasName("Dtl1.sno4", p);
		p.columnDtl1_wrk_no = p.Dtl1_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnDtl1_wrk_no.addAliasName("Dtl1.wrk_no", p);
		p.columnDtl1_wrk_nm = p.Dtl1_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnDtl1_wrk_nm.addAliasName("Dtl1.wrk_nm", p);
		p.Dtl1_bditm_p_PPanel = mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$bditm_p);
		p.Dtl1_bditm_p_PPanel.setName("Dtl1.bditm_p");
		p.columnDtl1_bd_dpt_cd = p.Dtl1_bditm_p_PPanel.columnBdItem_bd_dpt_cd;
		p.columnDtl1_bd_dpt_cd.addAliasName("Dtl1.bd_dpt_cd", p);
		p.columnDtl1_bd_dpt_nm = p.Dtl1_bditm_p_PPanel.columnBdItem_bd_dpt_nm;
		p.columnDtl1_bd_dpt_nm.addAliasName("Dtl1.bd_dpt_nm", p);
		p.columnDtl1_bd_itm_cd = p.Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_cd;
		p.columnDtl1_bd_itm_cd.addAliasName("Dtl1.bd_itm_cd", p);
		p.columnDtl1_bd_itm_sub1 = p.Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_sub1;
		p.columnDtl1_bd_itm_sub1.addAliasName("Dtl1.bd_itm_sub1", p);
		p.columnDtl1_bd_itm_sub2 = p.Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_sub2;
		p.columnDtl1_bd_itm_sub2.addAliasName("Dtl1.bd_itm_sub2", p);
		p.columnDtl1_bd_itm_sub3 = p.Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_sub3;
		p.columnDtl1_bd_itm_sub3.addAliasName("Dtl1.bd_itm_sub3", p);
		p.columnDtl1_bd_itm_nm = p.Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_nm;
		p.columnDtl1_bd_itm_nm.addAliasName("Dtl1.bd_itm_nm", p);
		p.columnDtl1_bd_lot_no = p.Dtl1_bditm_p_PPanel.columnBdItem_bd_lot_no;
		p.columnDtl1_bd_lot_no.addAliasName("Dtl1.bd_lot_no", p);
		p.columnDtl1_bd_sublot_no = p.Dtl1_bditm_p_PPanel.columnBdItem_bd_sublot_no;
		p.columnDtl1_bd_sublot_no.addAliasName("Dtl1.bd_sublot_no", p);
		p.columnDtl1_bd_sno1 = p.Dtl1_bditm_p_PPanel.columnBdItem_bd_sno1;
		p.columnDtl1_bd_sno1.addAliasName("Dtl1.bd_sno1", p);
		p.columnDtl1_bd_sno2 = p.Dtl1_bditm_p_PPanel.columnBdItem_bd_sno2;
		p.columnDtl1_bd_sno2.addAliasName("Dtl1.bd_sno2", p);
		p.columnDtl1_bd_sno3 = p.Dtl1_bditm_p_PPanel.columnBdItem_bd_sno3;
		p.columnDtl1_bd_sno3.addAliasName("Dtl1.bd_sno3", p);
		p.columnDtl1_bd_sno4 = p.Dtl1_bditm_p_PPanel.columnBdItem_bd_sno4;
		p.columnDtl1_bd_sno4.addAliasName("Dtl1.bd_sno4", p);
		p.columnDtl1_bd_bp_cd = p.Dtl1_bditm_p_PPanel.columnBdItem_bd_bp_cd;
		p.columnDtl1_bd_bp_cd.addAliasName("Dtl1.bd_bp_cd", p);
		p.columnDtl1_bd_bp_nm = p.Dtl1_bditm_p_PPanel.columnBdItem_bd_bp_nm;
		p.columnDtl1_bd_bp_nm.addAliasName("Dtl1.bd_bp_nm", p);
		p.columnDtl1_bd_loc_cd = p.Dtl1_bditm_p_PPanel.columnBdItem_bd_loc_cd;
		p.columnDtl1_bd_loc_cd.addAliasName("Dtl1.bd_loc_cd", p);
		p.columnDtl1_bd_loc_nm = p.Dtl1_bditm_p_PPanel.columnBdItem_bd_loc_nm;
		p.columnDtl1_bd_loc_nm.addAliasName("Dtl1.bd_loc_nm", p);
		p.columnDtl1_bd_ctg_cd = p.Dtl1_bditm_p_PPanel.columnBdItem_bd_ctg_cd;
		p.columnDtl1_bd_ctg_cd.addAliasName("Dtl1.bd_ctg_cd", p);
		p.columnDtl1_bd_ctg_nm = p.Dtl1_bditm_p_PPanel.columnBdItem_bd_ctg_nm;
		p.columnDtl1_bd_ctg_nm.addAliasName("Dtl1.bd_ctg_nm", p);
		p.columnDtl1_bd_oper_cd = p.Dtl1_bditm_p_PPanel.columnBdItem_bd_oper_cd;
		p.columnDtl1_bd_oper_cd.addAliasName("Dtl1.bd_oper_cd", p);
		p.columnDtl1_bd_oper_nm = p.Dtl1_bditm_p_PPanel.columnBdItem_bd_oper_nm;
		p.columnDtl1_bd_oper_nm.addAliasName("Dtl1.bd_oper_nm", p);
		p.columnDtl1_bd_iv_no = p.Dtl1_bditm_p_PPanel.columnBdItem_bd_iv_no;
		p.columnDtl1_bd_iv_no.addAliasName("Dtl1.bd_iv_no", p);
		p.columnDtl1_bd_slo_no = p.Dtl1_bditm_p_PPanel.columnBdItem_bd_slo_no;
		p.columnDtl1_bd_slo_no.addAliasName("Dtl1.bd_slo_no", p);
		p.columnDtl1_bd_po_no = p.Dtl1_bditm_p_PPanel.columnBdItem_bd_po_no;
		p.columnDtl1_bd_po_no.addAliasName("Dtl1.bd_po_no", p);
	}

	/**
	 * [Dtl2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl2(MSBDP_PoSchdSplitReg p) {
		p.Dtl2_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$itm_p);
		p.Dtl2_itm_p_PPanel.setName("Dtl2.itm_p");
		p.columnDtl2_itm_cd = p.Dtl2_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl2_itm_cd.addAliasName("Dtl2.itm_cd", p);
		p.columnDtl2_itm_sub1 = p.Dtl2_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl2_itm_sub1.addAliasName("Dtl2.itm_sub1", p);
		p.columnDtl2_itm_sub2 = p.Dtl2_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl2_itm_sub2.addAliasName("Dtl2.itm_sub2", p);
		p.columnDtl2_itm_sub3 = p.Dtl2_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl2_itm_sub3.addAliasName("Dtl2.itm_sub3", p);
		p.columnDtl2_itm_nm = p.Dtl2_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl2_itm_nm.addAliasName("Dtl2.itm_nm", p);
		p.Dtl2_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$ver_no_p);
		p.Dtl2_ver_no_p_PPanel.setName("Dtl2.ver_no_p");
		p.columnDtl2_ver_no = p.Dtl2_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnDtl2_ver_no.addAliasName("Dtl2.ver_no", p);
		p.Dtl2_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$trd_unit_qty_p);
		p.Dtl2_trd_unit_qty_p_PPanel.setName("Dtl2.trd_unit_qty_p");
		p.columnDtl2_trd_unit_qty = p.Dtl2_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl2_trd_unit_qty.addAliasName("Dtl2.trd_unit_qty", p);
		p.Dtl2_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$base_unit_qty_p);
		p.Dtl2_base_unit_qty_p_PPanel.setName("Dtl2.base_unit_qty_p");
		p.columnDtl2_base_unit_qty = p.Dtl2_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl2_base_unit_qty.addAliasName("Dtl2.base_unit_qty", p);
		p.Dtl2_inst_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$inst_cont_qty_p);
		p.Dtl2_inst_cont_qty_p_PPanel.setName("Dtl2.inst_cont_qty_p");
		p.columnDtl2_cont_qty = p.Dtl2_inst_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnDtl2_cont_qty.addAliasName("Dtl2.cont_qty", p);
		p.Dtl2_cont_unit_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$cont_unit_p);
		p.Dtl2_cont_unit_p_PPanel.setName("Dtl2.cont_unit_p");
		p.columnDtl2_cont_fctr_unit_cd = p.Dtl2_cont_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnDtl2_cont_fctr_unit_cd.addAliasName("Dtl2.cont_fctr_unit_cd", p);
		p.columnDtl2_cont_fctr_unit_nm = p.Dtl2_cont_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnDtl2_cont_fctr_unit_nm.addAliasName("Dtl2.cont_fctr_unit_nm", p);
		p.Dtl2_std_cont_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$std_cont_p);
		p.Dtl2_std_cont_p_PPanel.setName("Dtl2.std_cont_p");
		p.columnDtl2_std_cont_fctr = p.Dtl2_std_cont_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnDtl2_std_cont_fctr.addAliasName("Dtl2.std_cont_fctr", p);
		p.Dtl2_dlv_rqst_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$dlv_rqst_tm_p);
		p.Dtl2_dlv_rqst_tm_p_PPanel.setName("Dtl2.dlv_rqst_tm_p");
		p.columnDtl2_dlv_rqst_dt = p.Dtl2_dlv_rqst_tm_p_PPanel.columnYmdHm_ymd;
		p.columnDtl2_dlv_rqst_dt.addAliasName("Dtl2.dlv_rqst_dt", p);
		p.columnDtl2_dlv_rqst_hm = p.Dtl2_dlv_rqst_tm_p_PPanel.columnYmdHm_hm;
		p.columnDtl2_dlv_rqst_hm.addAliasName("Dtl2.dlv_rqst_hm", p);
		p.Dtl2_rqst_dlv_rqst_tm_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$rqst_dlv_rqst_tm_p);
		p.Dtl2_rqst_dlv_rqst_tm_p_PPanel.setName("Dtl2.rqst_dlv_rqst_tm_p");
		p.columnDtl2_rqst_dlv_rqst_dt = p.Dtl2_rqst_dlv_rqst_tm_p_PPanel.columnYmdHm_ymd;
		p.columnDtl2_rqst_dlv_rqst_dt.addAliasName("Dtl2.rqst_dlv_rqst_dt", p);
		p.columnDtl2_rqst_dlv_rqst_hm = p.Dtl2_rqst_dlv_rqst_tm_p_PPanel.columnYmdHm_hm;
		p.columnDtl2_rqst_dlv_rqst_hm.addAliasName("Dtl2.rqst_dlv_rqst_hm", p);
		p.Dtl2_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$usr_dpt_p);
		p.Dtl2_usr_dpt_p_PPanel.setName("Dtl2.usr_dpt_p");
		p.columnDtl2_purc_usr_cd = p.Dtl2_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnDtl2_purc_usr_cd.addAliasName("Dtl2.purc_usr_cd", p);
		p.columnDtl2_purc_usr_nm = p.Dtl2_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnDtl2_purc_usr_nm.addAliasName("Dtl2.purc_usr_nm", p);
		p.columnDtl2_purc_dpt_cd = p.Dtl2_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnDtl2_purc_dpt_cd.addAliasName("Dtl2.purc_dpt_cd", p);
		p.columnDtl2_purc_dpt_nm = p.Dtl2_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnDtl2_purc_dpt_nm.addAliasName("Dtl2.purc_dpt_nm", p);
		p.Dtl2_trd_cur_upri_p_PPanel = mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$trd_cur_upri_p);
		p.Dtl2_trd_cur_upri_p_PPanel.setName("Dtl2.trd_cur_upri_p");
		p.columnDtl2_upri_not_tgt_flg = p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg;
		p.columnDtl2_upri_not_tgt_flg.addAliasName("Dtl2.upri_not_tgt_flg", p);
		p.columnDtl2_trd_cur_upri = p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_upri;
		p.columnDtl2_trd_cur_upri.addAliasName("Dtl2.trd_cur_upri", p);
		p.columnDtl2_interim_flg = p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_interim_flg;
		p.columnDtl2_interim_flg.addAliasName("Dtl2.interim_flg", p);
		p.columnDtl2_trd_cur_amt = p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_amt;
		p.columnDtl2_trd_cur_amt.addAliasName("Dtl2.trd_cur_amt", p);
		p.columnDtl2_trd_cur_inc_tax_amt = p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_inc_tax_amt;
		p.columnDtl2_trd_cur_inc_tax_amt.addAliasName("Dtl2.trd_cur_inc_tax_amt", p);
		p.columnDtl2_tax_fix_flg = p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg;
		p.columnDtl2_tax_fix_flg.addAliasName("Dtl2.tax_fix_flg", p);
		p.columnDtl2_tax_cd = p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd;
		p.columnDtl2_tax_cd.addAliasName("Dtl2.tax_cd", p);
		p.columnDtl2_tax_nm = p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_nm;
		p.columnDtl2_tax_nm.addAliasName("Dtl2.tax_nm", p);
		p.columnDtl2_tax_rate = p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_rate;
		p.columnDtl2_tax_rate.addAliasName("Dtl2.tax_rate", p);
		p.columnDtl2_tax_typ = p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_typ;
		p.columnDtl2_tax_typ.addAliasName("Dtl2.tax_typ", p);
		p.columnDtl2_inc_tax_flg = p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_inc_tax_flg;
		p.columnDtl2_inc_tax_flg.addAliasName("Dtl2.inc_tax_flg", p);
		p.columnDtl2_trd_cur_tax_amt = p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_tax_amt;
		p.columnDtl2_trd_cur_tax_amt.addAliasName("Dtl2.trd_cur_tax_amt", p);
		p.columnDtl2_trd_cur_dscnt_amt = p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt;
		p.columnDtl2_trd_cur_dscnt_amt.addAliasName("Dtl2.trd_cur_dscnt_amt", p);
		p.columnDtl2_dscnt_rsn_cd = p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd;
		p.columnDtl2_dscnt_rsn_cd.addAliasName("Dtl2.dscnt_rsn_cd", p);
		p.columnDtl2_dscnt_rsn_nm = p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm;
		p.columnDtl2_dscnt_rsn_nm.addAliasName("Dtl2.dscnt_rsn_nm", p);
		p.Dtl2_trd_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$trd_cur_proc_upri_p);
		p.Dtl2_trd_cur_proc_upri_p_PPanel.setName("Dtl2.trd_cur_proc_upri_p");
		p.columnDtl2_trd_cur_proc_upri = p.Dtl2_trd_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnDtl2_trd_cur_proc_upri.addAliasName("Dtl2.trd_cur_proc_upri", p);
		p.Dtl2_trd_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$trd_cur_proc_amt_p);
		p.Dtl2_trd_cur_proc_amt_p_PPanel.setName("Dtl2.trd_cur_proc_amt_p");
		p.columnDtl2_trd_cur_proc_amt = p.Dtl2_trd_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnDtl2_trd_cur_proc_amt.addAliasName("Dtl2.trd_cur_proc_amt", p);
		p.columnDtl2_trd_cur_proc_tax_amt = p.Dtl2_trd_cur_proc_amt_p_PPanel.columnAmt_tax_amt;
		p.columnDtl2_trd_cur_proc_tax_amt.addAliasName("Dtl2.trd_cur_proc_tax_amt", p);
		p.Dtl2_trd_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$trd_cur_onr_prov_upri_p);
		p.Dtl2_trd_cur_onr_prov_upri_p_PPanel.setName("Dtl2.trd_cur_onr_prov_upri_p");
		p.columnDtl2_trd_cur_onr_prov_upri = p.Dtl2_trd_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnDtl2_trd_cur_onr_prov_upri.addAliasName("Dtl2.trd_cur_onr_prov_upri", p);
		p.Dtl2_trd_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$trd_cur_onr_prov_amt_p);
		p.Dtl2_trd_cur_onr_prov_amt_p_PPanel.setName("Dtl2.trd_cur_onr_prov_amt_p");
		p.columnDtl2_trd_cur_onr_prov_amt = p.Dtl2_trd_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnDtl2_trd_cur_onr_prov_amt.addAliasName("Dtl2.trd_cur_onr_prov_amt", p);
		p.columnDtl2_trd_cur_onr_prov_tax_amt = p.Dtl2_trd_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt;
		p.columnDtl2_trd_cur_onr_prov_tax_amt.addAliasName("Dtl2.trd_cur_onr_prov_tax_amt", p);
		p.Dtl2_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$xrate_p);
		p.Dtl2_xrate_p_PPanel.setName("Dtl2.xrate_p");
		p.columnDtl2_xrate = p.Dtl2_xrate_p_PPanel.columnXrate_xrate;
		p.columnDtl2_xrate.addAliasName("Dtl2.xrate", p);
		p.Dtl2_base_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$base_cur_upri_p);
		p.Dtl2_base_cur_upri_p_PPanel.setName("Dtl2.base_cur_upri_p");
		p.columnDtl2_base_cur_upri = p.Dtl2_base_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl2_base_cur_upri.addAliasName("Dtl2.base_cur_upri", p);
		p.Dtl2_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$base_cur_amt_p);
		p.Dtl2_base_cur_amt_p_PPanel.setName("Dtl2.base_cur_amt_p");
		p.columnDtl2_base_cur_amt = p.Dtl2_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl2_base_cur_amt.addAliasName("Dtl2.base_cur_amt", p);
		p.Dtl2_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$base_cur_tax_amt_p);
		p.Dtl2_base_cur_tax_amt_p_PPanel.setName("Dtl2.base_cur_tax_amt_p");
		p.columnDtl2_base_cur_tax_amt = p.Dtl2_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl2_base_cur_tax_amt.addAliasName("Dtl2.base_cur_tax_amt", p);
		p.Dtl2_base_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$base_cur_inc_tax_amt_p);
		p.Dtl2_base_cur_inc_tax_amt_p_PPanel.setName("Dtl2.base_cur_inc_tax_amt_p");
		p.columnDtl2_base_cur_inc_tax_amt = p.Dtl2_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl2_base_cur_inc_tax_amt.addAliasName("Dtl2.base_cur_inc_tax_amt", p);
		p.Dtl2_base_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$base_cur_proc_upri_p);
		p.Dtl2_base_cur_proc_upri_p_PPanel.setName("Dtl2.base_cur_proc_upri_p");
		p.columnDtl2_base_cur_proc_upri = p.Dtl2_base_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnDtl2_base_cur_proc_upri.addAliasName("Dtl2.base_cur_proc_upri", p);
		p.Dtl2_base_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$base_cur_proc_amt_p);
		p.Dtl2_base_cur_proc_amt_p_PPanel.setName("Dtl2.base_cur_proc_amt_p");
		p.columnDtl2_base_cur_proc_amt = p.Dtl2_base_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnDtl2_base_cur_proc_amt.addAliasName("Dtl2.base_cur_proc_amt", p);
		p.columnDtl2_base_cur_proc_tax_amt = p.Dtl2_base_cur_proc_amt_p_PPanel.columnAmt_tax_amt;
		p.columnDtl2_base_cur_proc_tax_amt.addAliasName("Dtl2.base_cur_proc_tax_amt", p);
		p.Dtl2_base_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$base_cur_onr_prov_upri_p);
		p.Dtl2_base_cur_onr_prov_upri_p_PPanel.setName("Dtl2.base_cur_onr_prov_upri_p");
		p.columnDtl2_base_cur_onr_prov_upri = p.Dtl2_base_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnDtl2_base_cur_onr_prov_upri.addAliasName("Dtl2.base_cur_onr_prov_upri", p);
		p.Dtl2_base_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$base_cur_onr_prov_amt_p);
		p.Dtl2_base_cur_onr_prov_amt_p_PPanel.setName("Dtl2.base_cur_onr_prov_amt_p");
		p.columnDtl2_base_cur_onr_prov_amt = p.Dtl2_base_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnDtl2_base_cur_onr_prov_amt.addAliasName("Dtl2.base_cur_onr_prov_amt", p);
		p.columnDtl2_base_cur_onr_prov_tax_amt = p.Dtl2_base_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt;
		p.columnDtl2_base_cur_onr_prov_tax_amt.addAliasName("Dtl2.base_cur_onr_prov_tax_amt", p);
		p.Dtl2_ptax_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$ptax_xrate_p);
		p.Dtl2_ptax_xrate_p_PPanel.setName("Dtl2.ptax_xrate_p");
		p.columnDtl2_ptax_xrate = p.Dtl2_ptax_xrate_p_PPanel.columnXrate_xrate;
		p.columnDtl2_ptax_xrate.addAliasName("Dtl2.ptax_xrate", p);
		p.Dtl2_ptax_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$ptax_cur_upri_p);
		p.Dtl2_ptax_cur_upri_p_PPanel.setName("Dtl2.ptax_cur_upri_p");
		p.columnDtl2_ptax_cur_upri = p.Dtl2_ptax_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl2_ptax_cur_upri.addAliasName("Dtl2.ptax_cur_upri", p);
		p.Dtl2_ptax_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$ptax_cur_amt_p);
		p.Dtl2_ptax_cur_amt_p_PPanel.setName("Dtl2.ptax_cur_amt_p");
		p.columnDtl2_ptax_cur_amt = p.Dtl2_ptax_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl2_ptax_cur_amt.addAliasName("Dtl2.ptax_cur_amt", p);
		p.Dtl2_ptax_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$ptax_cur_tax_amt_p);
		p.Dtl2_ptax_cur_tax_amt_p_PPanel.setName("Dtl2.ptax_cur_tax_amt_p");
		p.columnDtl2_ptax_cur_tax_amt = p.Dtl2_ptax_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl2_ptax_cur_tax_amt.addAliasName("Dtl2.ptax_cur_tax_amt", p);
		p.Dtl2_ptax_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$ptax_cur_inc_tax_amt_p);
		p.Dtl2_ptax_cur_inc_tax_amt_p_PPanel.setName("Dtl2.ptax_cur_inc_tax_amt_p");
		p.columnDtl2_ptax_cur_inc_tax_amt = p.Dtl2_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl2_ptax_cur_inc_tax_amt.addAliasName("Dtl2.ptax_cur_inc_tax_amt", p);
		p.Dtl2_ptax_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$ptax_cur_proc_upri_p);
		p.Dtl2_ptax_cur_proc_upri_p_PPanel.setName("Dtl2.ptax_cur_proc_upri_p");
		p.columnDtl2_ptax_cur_proc_upri = p.Dtl2_ptax_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnDtl2_ptax_cur_proc_upri.addAliasName("Dtl2.ptax_cur_proc_upri", p);
		p.Dtl2_ptax_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$ptax_cur_proc_amt_p);
		p.Dtl2_ptax_cur_proc_amt_p_PPanel.setName("Dtl2.ptax_cur_proc_amt_p");
		p.columnDtl2_ptax_cur_proc_amt = p.Dtl2_ptax_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnDtl2_ptax_cur_proc_amt.addAliasName("Dtl2.ptax_cur_proc_amt", p);
		p.columnDtl2_ptax_cur_proc_tax_amt = p.Dtl2_ptax_cur_proc_amt_p_PPanel.columnAmt_tax_amt;
		p.columnDtl2_ptax_cur_proc_tax_amt.addAliasName("Dtl2.ptax_cur_proc_tax_amt", p);
		p.Dtl2_ptax_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$ptax_cur_onr_prov_upri_p);
		p.Dtl2_ptax_cur_onr_prov_upri_p_PPanel.setName("Dtl2.ptax_cur_onr_prov_upri_p");
		p.columnDtl2_ptax_cur_onr_prov_upri = p.Dtl2_ptax_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnDtl2_ptax_cur_onr_prov_upri.addAliasName("Dtl2.ptax_cur_onr_prov_upri", p);
		p.Dtl2_ptax_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$ptax_cur_onr_prov_amt_p);
		p.Dtl2_ptax_cur_onr_prov_amt_p_PPanel.setName("Dtl2.ptax_cur_onr_prov_amt_p");
		p.columnDtl2_ptax_cur_onr_prov_amt = p.Dtl2_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnDtl2_ptax_cur_onr_prov_amt.addAliasName("Dtl2.ptax_cur_onr_prov_amt", p);
		p.columnDtl2_ptax_cur_onr_prov_tax_amt = p.Dtl2_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt;
		p.columnDtl2_ptax_cur_onr_prov_tax_amt.addAliasName("Dtl2.ptax_cur_onr_prov_tax_amt", p);
		p.Dtl2_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$sno_wrk_no_p);
		p.Dtl2_sno_wrk_no_p_PPanel.setName("Dtl2.sno_wrk_no_p");
		p.columnDtl2_sno1 = p.Dtl2_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnDtl2_sno1.addAliasName("Dtl2.sno1", p);
		p.columnDtl2_sno2 = p.Dtl2_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnDtl2_sno2.addAliasName("Dtl2.sno2", p);
		p.columnDtl2_sno3 = p.Dtl2_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnDtl2_sno3.addAliasName("Dtl2.sno3", p);
		p.columnDtl2_sno4 = p.Dtl2_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnDtl2_sno4.addAliasName("Dtl2.sno4", p);
		p.columnDtl2_wrk_no = p.Dtl2_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnDtl2_wrk_no.addAliasName("Dtl2.wrk_no", p);
		p.columnDtl2_wrk_nm = p.Dtl2_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnDtl2_wrk_nm.addAliasName("Dtl2.wrk_nm", p);
		p.Dtl2_bditm_p_PPanel = mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.$bditm_p);
		p.Dtl2_bditm_p_PPanel.setName("Dtl2.bditm_p");
		p.columnDtl2_bd_dpt_cd = p.Dtl2_bditm_p_PPanel.columnBdItem_bd_dpt_cd;
		p.columnDtl2_bd_dpt_cd.addAliasName("Dtl2.bd_dpt_cd", p);
		p.columnDtl2_bd_dpt_nm = p.Dtl2_bditm_p_PPanel.columnBdItem_bd_dpt_nm;
		p.columnDtl2_bd_dpt_nm.addAliasName("Dtl2.bd_dpt_nm", p);
		p.columnDtl2_bd_itm_cd = p.Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_cd;
		p.columnDtl2_bd_itm_cd.addAliasName("Dtl2.bd_itm_cd", p);
		p.columnDtl2_bd_itm_sub1 = p.Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_sub1;
		p.columnDtl2_bd_itm_sub1.addAliasName("Dtl2.bd_itm_sub1", p);
		p.columnDtl2_bd_itm_sub2 = p.Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_sub2;
		p.columnDtl2_bd_itm_sub2.addAliasName("Dtl2.bd_itm_sub2", p);
		p.columnDtl2_bd_itm_sub3 = p.Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_sub3;
		p.columnDtl2_bd_itm_sub3.addAliasName("Dtl2.bd_itm_sub3", p);
		p.columnDtl2_bd_itm_nm = p.Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_nm;
		p.columnDtl2_bd_itm_nm.addAliasName("Dtl2.bd_itm_nm", p);
		p.columnDtl2_bd_lot_no = p.Dtl2_bditm_p_PPanel.columnBdItem_bd_lot_no;
		p.columnDtl2_bd_lot_no.addAliasName("Dtl2.bd_lot_no", p);
		p.columnDtl2_bd_sublot_no = p.Dtl2_bditm_p_PPanel.columnBdItem_bd_sublot_no;
		p.columnDtl2_bd_sublot_no.addAliasName("Dtl2.bd_sublot_no", p);
		p.columnDtl2_bd_sno1 = p.Dtl2_bditm_p_PPanel.columnBdItem_bd_sno1;
		p.columnDtl2_bd_sno1.addAliasName("Dtl2.bd_sno1", p);
		p.columnDtl2_bd_sno2 = p.Dtl2_bditm_p_PPanel.columnBdItem_bd_sno2;
		p.columnDtl2_bd_sno2.addAliasName("Dtl2.bd_sno2", p);
		p.columnDtl2_bd_sno3 = p.Dtl2_bditm_p_PPanel.columnBdItem_bd_sno3;
		p.columnDtl2_bd_sno3.addAliasName("Dtl2.bd_sno3", p);
		p.columnDtl2_bd_sno4 = p.Dtl2_bditm_p_PPanel.columnBdItem_bd_sno4;
		p.columnDtl2_bd_sno4.addAliasName("Dtl2.bd_sno4", p);
		p.columnDtl2_bd_bp_cd = p.Dtl2_bditm_p_PPanel.columnBdItem_bd_bp_cd;
		p.columnDtl2_bd_bp_cd.addAliasName("Dtl2.bd_bp_cd", p);
		p.columnDtl2_bd_bp_nm = p.Dtl2_bditm_p_PPanel.columnBdItem_bd_bp_nm;
		p.columnDtl2_bd_bp_nm.addAliasName("Dtl2.bd_bp_nm", p);
		p.columnDtl2_bd_loc_cd = p.Dtl2_bditm_p_PPanel.columnBdItem_bd_loc_cd;
		p.columnDtl2_bd_loc_cd.addAliasName("Dtl2.bd_loc_cd", p);
		p.columnDtl2_bd_loc_nm = p.Dtl2_bditm_p_PPanel.columnBdItem_bd_loc_nm;
		p.columnDtl2_bd_loc_nm.addAliasName("Dtl2.bd_loc_nm", p);
		p.columnDtl2_bd_ctg_cd = p.Dtl2_bditm_p_PPanel.columnBdItem_bd_ctg_cd;
		p.columnDtl2_bd_ctg_cd.addAliasName("Dtl2.bd_ctg_cd", p);
		p.columnDtl2_bd_ctg_nm = p.Dtl2_bditm_p_PPanel.columnBdItem_bd_ctg_nm;
		p.columnDtl2_bd_ctg_nm.addAliasName("Dtl2.bd_ctg_nm", p);
		p.columnDtl2_bd_oper_cd = p.Dtl2_bditm_p_PPanel.columnBdItem_bd_oper_cd;
		p.columnDtl2_bd_oper_cd.addAliasName("Dtl2.bd_oper_cd", p);
		p.columnDtl2_bd_oper_nm = p.Dtl2_bditm_p_PPanel.columnBdItem_bd_oper_nm;
		p.columnDtl2_bd_oper_nm.addAliasName("Dtl2.bd_oper_nm", p);
		p.columnDtl2_bd_iv_no = p.Dtl2_bditm_p_PPanel.columnBdItem_bd_iv_no;
		p.columnDtl2_bd_iv_no.addAliasName("Dtl2.bd_iv_no", p);
		p.columnDtl2_bd_slo_no = p.Dtl2_bditm_p_PPanel.columnBdItem_bd_slo_no;
		p.columnDtl2_bd_slo_no.addAliasName("Dtl2.bd_slo_no", p);
		p.columnDtl2_bd_po_no = p.Dtl2_bditm_p_PPanel.columnBdItem_bd_po_no;
		p.columnDtl2_bd_po_no.addAliasName("Dtl2.bd_po_no", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBDP_PoSchdSplitReg p) {
		p.Btn_sync_p_PPanel = mcframe.clientFSBA.FSBAP0020.FSBAP0020.create();
		p.Btn_sync_p_PPanel.setName("Btn.sync_p");
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBDP_PoSchdSplitReg p) {
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
	
	
	/** [Dtl1_in_to_loc_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_in_to_loc_cd_p = null;

	/**
	 * [Dtl1_in_to_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_in_to_loc_cd_ListPutter() {
		if (Dtl1_in_to_loc_cd_p == null) {
			Dtl1_in_to_loc_cd_p = createDtl1_in_to_loc_cd_ListPutter(columnDtl1_in_to_loc_cd, "in_to_loc_cd");

		}
		return Dtl1_in_to_loc_cd_p;
	}
	
	
	/** [Dtl1_drct_dlv_typ_ListPutter]の定義 */
	private MCListPutter Dtl1_drct_dlv_typ_p = null;

	/**
	 * [Dtl1_drct_dlv_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_drct_dlv_typ_ListPutter() {
		if (Dtl1_drct_dlv_typ_p == null) {
			Dtl1_drct_dlv_typ_p = createDtl1_drct_dlv_typ_ListPutter(columnDtl1_drct_dlv_typ, "drct_dlv_typ");

		}
		return Dtl1_drct_dlv_typ_p;
	}
	
	
	/** [Dtl1_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_trd_unit_cd_p = null;

	/**
	 * [Dtl1_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_trd_unit_cd_ListPutter() {
		if (Dtl1_trd_unit_cd_p == null) {
			Dtl1_trd_unit_cd_p = createDtl1_trd_unit_cd_ListPutter(columnDtl1_trd_unit_cd, "trd_unit_cd", "trd_unit_nm","trd_unit_dec_place","trd_unit_conv_base_qty","trd_unit_conv_qty","trd_unit_rnd_typ");

		}
		return Dtl1_trd_unit_cd_p;
	}
	
	
	/** [Dtl1_base_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_base_unit_cd_p = null;

	/**
	 * [Dtl1_base_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_base_unit_cd_ListPutter() {
		if (Dtl1_base_unit_cd_p == null) {
			Dtl1_base_unit_cd_p = createDtl1_base_unit_cd_ListPutter(columnDtl1_base_unit_cd, "base_unit_cd");

		}
		return Dtl1_base_unit_cd_p;
	}
	
	
	/** [Dtl1_sppl_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_sppl_cd_p = null;

	/**
	 * [Dtl1_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_sppl_cd_ListPutter() {
		if (Dtl1_sppl_cd_p == null) {
			Dtl1_sppl_cd_p = createDtl1_sppl_cd_ListPutter(columnDtl1_sppl_cd, "sppl_cd", "sppl_nm","trd_cur_cd","purc_usr_cd","purc_dpt_cd","sppl_purc_upri_cng_flg","purc_upri_req_typ","sppl_cal_cd","purc_amt_rnd_typ","purc_tax_rnd_typ","sppl_cntry_cd","sppl_cntry_nm");

		}
		return Dtl1_sppl_cd_p;
	}
	
	
	/** [Dtl1_maker_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_maker_cd_p = null;

	/**
	 * [Dtl1_maker_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_maker_cd_ListPutter() {
		if (Dtl1_maker_cd_p == null) {
			Dtl1_maker_cd_p = createDtl1_maker_cd_ListPutter(columnDtl1_maker_cd, "maker_cd", "maker_nm");

		}
		return Dtl1_maker_cd_p;
	}
	
	
	/** [Dtl1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = null;

	/**
	 * [Dtl1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter() {
		if (Dtl1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p == null) {
			Dtl1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = createDtl1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(Dtl1_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd, "purc_dpt_cd", "purc_dpt_nm","purc_dpt_wg_cd","purc_dpt_wg_nm");
		}
		return Dtl1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p;
	}
	
	
	/** [Dtl1_purc_upri_req_typ_ListPutter]の定義 */
	private MCListPutter Dtl1_purc_upri_req_typ_p = null;

	/**
	 * [Dtl1_purc_upri_req_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_purc_upri_req_typ_ListPutter() {
		if (Dtl1_purc_upri_req_typ_p == null) {
			Dtl1_purc_upri_req_typ_p = createDtl1_purc_upri_req_typ_ListPutter(columnDtl1_purc_upri_req_typ, "purc_upri_req_typ", "purc_upri_req_typ_nm");

		}
		return Dtl1_purc_upri_req_typ_p;
	}
	
	
	/** [Dtl1_trd_cur_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_trd_cur_cd_p = null;

	/**
	 * [Dtl1_trd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_trd_cur_cd_ListPutter() {
		if (Dtl1_trd_cur_cd_p == null) {
			Dtl1_trd_cur_cd_p = createDtl1_trd_cur_cd_ListPutter(columnDtl1_trd_cur_cd, "trd_cur_cd", "trd_cur_nm","trd_cur_amt_dec_place","trd_cur_upri_dec_place");

		}
		return Dtl1_trd_cur_cd_p;
	}
	
	
	/** [Dtl1_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_p = null;

	/**
	 * [Dtl1_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter() {
		if (Dtl1_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_p == null) {
			Dtl1_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_p = createDtl1_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd, "tax_cd", "tax_nm","tax_typ","tax_rate","inc_tax_flg");
		}
		return Dtl1_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_p;
	}
	
	
	/** [Dtl1_base_cur_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_base_cur_cd_p = null;

	/**
	 * [Dtl1_base_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_base_cur_cd_ListPutter() {
		if (Dtl1_base_cur_cd_p == null) {
			Dtl1_base_cur_cd_p = createDtl1_base_cur_cd_ListPutter(columnDtl1_base_cur_cd, "base_cur_cd");

		}
		return Dtl1_base_cur_cd_p;
	}
	
	
	/** [Dtl1_ptax_cur_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_ptax_cur_cd_p = null;

	/**
	 * [Dtl1_ptax_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_ptax_cur_cd_ListPutter() {
		if (Dtl1_ptax_cur_cd_p == null) {
			Dtl1_ptax_cur_cd_p = createDtl1_ptax_cur_cd_ListPutter(columnDtl1_ptax_cur_cd, "ptax_cur_cd");

		}
		return Dtl1_ptax_cur_cd_p;
	}
	
	
	/** [Dtl1_purc_rsn_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_purc_rsn_cd_p = null;

	/**
	 * [Dtl1_purc_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_purc_rsn_cd_ListPutter() {
		if (Dtl1_purc_rsn_cd_p == null) {
			Dtl1_purc_rsn_cd_p = createDtl1_purc_rsn_cd_ListPutter(columnDtl1_purc_rsn_cd, "purc_rsn_cd", "purc_rsn_nm","xpns_purc_flg");

		}
		return Dtl1_purc_rsn_cd_p;
	}
	
	
	/** [Dtl1_mfg_loc_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_mfg_loc_cd_p = null;

	/**
	 * [Dtl1_mfg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_mfg_loc_cd_ListPutter() {
		if (Dtl1_mfg_loc_cd_p == null) {
			Dtl1_mfg_loc_cd_p = createDtl1_mfg_loc_cd_ListPutter(columnDtl1_mfg_loc_cd, "mfg_loc_cd", "mfg_loc_nm","sppl_cd","maker_cd");

		}
		return Dtl1_mfg_loc_cd_p;
	}
	
	
	/** [Dtl1_bom_ptn_ListPutter]の定義 */
	private MCListPutter Dtl1_bom_ptn_p = null;

	/**
	 * [Dtl1_bom_ptn_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_bom_ptn_ListPutter() {
		if (Dtl1_bom_ptn_p == null) {
			Dtl1_bom_ptn_p = createDtl1_bom_ptn_ListPutter(columnDtl1_bom_ptn, "bom_ptn");

		}
		return Dtl1_bom_ptn_p;
	}
	
	
	/** [Dtl1_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_bditm_p_PPanel_columnBdItem_bd_dpt_cd_p = null;

	/**
	 * [Dtl1_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter() {
		if (Dtl1_bditm_p_PPanel_columnBdItem_bd_dpt_cd_p == null) {
			Dtl1_bditm_p_PPanel_columnBdItem_bd_dpt_cd_p = createDtl1_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter(Dtl1_bditm_p_PPanel.columnBdItem_bd_dpt_cd, "bd_dpt_cd", "bd_dpt_nm");
		}
		return Dtl1_bditm_p_PPanel_columnBdItem_bd_dpt_cd_p;
	}
	
	
	/** [Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_cd_p = null;

	/**
	 * [Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter() {
		if (Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_cd_p == null) {
			Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_cd_p = createDtl1_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter(Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_cd, "bd_itm_cd", "bd_itm_sub1","bd_itm_sub2","bd_itm_sub3","bd_itm_nm","bd_lot_mng_typ","bd_lot_no_typ","bd_sublot_mng_typ","bd_sublot_no_typ","bd_sno1_mng_typ","bd_sno2_mng_typ","bd_sno3_mng_typ","bd_sno4_mng_typ");
		}
		return Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_cd_p;
	}
	
	
	/** [Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter]の定義 */
	private MCListPutter Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub1_p = null;

	/**
	 * [Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter() {
		if (Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub1_p == null) {
			Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub1_p = createDtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter(Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_sub1, "bd_itm_sub1", "bd_itm_sub2","bd_itm_sub3","bd_itm_nm","bd_lot_mng_typ","bd_lot_no_typ","bd_sublot_mng_typ","bd_sublot_no_typ","bd_sno1_mng_typ","bd_sno2_mng_typ","bd_sno3_mng_typ","bd_sno4_mng_typ");
		}
		return Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub1_p;
	}
	
	
	/** [Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter]の定義 */
	private MCListPutter Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub2_p = null;

	/**
	 * [Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter() {
		if (Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub2_p == null) {
			Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub2_p = createDtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter(Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_sub2, "bd_itm_sub2", "bd_itm_sub3","bd_itm_nm","bd_lot_mng_typ","bd_lot_no_typ","bd_sublot_mng_typ","bd_sublot_no_typ","bd_sno1_mng_typ","bd_sno2_mng_typ","bd_sno3_mng_typ","bd_sno4_mng_typ");
		}
		return Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub2_p;
	}
	
	
	/** [Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter]の定義 */
	private MCListPutter Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub3_p = null;

	/**
	 * [Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter() {
		if (Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub3_p == null) {
			Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub3_p = createDtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter(Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_sub3, "bd_itm_sub3", "bd_itm_nm","bd_lot_mng_typ","bd_lot_no_typ","bd_sublot_mng_typ","bd_sublot_no_typ","bd_sno1_mng_typ","bd_sno2_mng_typ","bd_sno3_mng_typ","bd_sno4_mng_typ");
		}
		return Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub3_p;
	}
	
	
	/** [Dtl2_in_to_loc_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_in_to_loc_cd_p = null;

	/**
	 * [Dtl2_in_to_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_in_to_loc_cd_ListPutter() {
		if (Dtl2_in_to_loc_cd_p == null) {
			Dtl2_in_to_loc_cd_p = createDtl2_in_to_loc_cd_ListPutter(columnDtl2_in_to_loc_cd, "in_to_loc_cd");

		}
		return Dtl2_in_to_loc_cd_p;
	}
	
	
	/** [Dtl2_drct_dlv_typ_ListPutter]の定義 */
	private MCListPutter Dtl2_drct_dlv_typ_p = null;

	/**
	 * [Dtl2_drct_dlv_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_drct_dlv_typ_ListPutter() {
		if (Dtl2_drct_dlv_typ_p == null) {
			Dtl2_drct_dlv_typ_p = createDtl2_drct_dlv_typ_ListPutter(columnDtl2_drct_dlv_typ, "drct_dlv_typ");

		}
		return Dtl2_drct_dlv_typ_p;
	}
	
	
	/** [Dtl2_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_trd_unit_cd_p = null;

	/**
	 * [Dtl2_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_trd_unit_cd_ListPutter() {
		if (Dtl2_trd_unit_cd_p == null) {
			Dtl2_trd_unit_cd_p = createDtl2_trd_unit_cd_ListPutter(columnDtl2_trd_unit_cd, "trd_unit_cd", "trd_unit_nm","trd_unit_dec_place","trd_unit_conv_base_qty","trd_unit_conv_qty","trd_unit_rnd_typ");

		}
		return Dtl2_trd_unit_cd_p;
	}
	
	
	/** [Dtl2_base_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_base_unit_cd_p = null;

	/**
	 * [Dtl2_base_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_base_unit_cd_ListPutter() {
		if (Dtl2_base_unit_cd_p == null) {
			Dtl2_base_unit_cd_p = createDtl2_base_unit_cd_ListPutter(columnDtl2_base_unit_cd, "base_unit_cd");

		}
		return Dtl2_base_unit_cd_p;
	}
	
	
	/** [Dtl2_sppl_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_sppl_cd_p = null;

	/**
	 * [Dtl2_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_sppl_cd_ListPutter() {
		if (Dtl2_sppl_cd_p == null) {
			Dtl2_sppl_cd_p = createDtl2_sppl_cd_ListPutter(columnDtl2_sppl_cd, "sppl_cd", "sppl_nm","trd_cur_cd","purc_usr_cd","purc_dpt_cd","sppl_purc_upri_cng_flg","purc_upri_req_typ","sppl_cal_cd","purc_amt_rnd_typ","purc_tax_rnd_typ","sppl_cntry_cd","sppl_cntry_nm");

		}
		return Dtl2_sppl_cd_p;
	}
	
	
	/** [Dtl2_maker_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_maker_cd_p = null;

	/**
	 * [Dtl2_maker_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_maker_cd_ListPutter() {
		if (Dtl2_maker_cd_p == null) {
			Dtl2_maker_cd_p = createDtl2_maker_cd_ListPutter(columnDtl2_maker_cd, "maker_cd", "maker_nm");

		}
		return Dtl2_maker_cd_p;
	}
	
	
	/** [Dtl2_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = null;

	/**
	 * [Dtl2_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter() {
		if (Dtl2_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p == null) {
			Dtl2_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = createDtl2_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(Dtl2_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd, "purc_dpt_cd", "purc_dpt_nm","purc_dpt_wg_cd","purc_dpt_wg_nm");
		}
		return Dtl2_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p;
	}
	
	
	/** [Dtl2_purc_upri_req_typ_ListPutter]の定義 */
	private MCListPutter Dtl2_purc_upri_req_typ_p = null;

	/**
	 * [Dtl2_purc_upri_req_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_purc_upri_req_typ_ListPutter() {
		if (Dtl2_purc_upri_req_typ_p == null) {
			Dtl2_purc_upri_req_typ_p = createDtl2_purc_upri_req_typ_ListPutter(columnDtl2_purc_upri_req_typ, "purc_upri_req_typ", "purc_upri_req_typ_nm");

		}
		return Dtl2_purc_upri_req_typ_p;
	}
	
	
	/** [Dtl2_trd_cur_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_trd_cur_cd_p = null;

	/**
	 * [Dtl2_trd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_trd_cur_cd_ListPutter() {
		if (Dtl2_trd_cur_cd_p == null) {
			Dtl2_trd_cur_cd_p = createDtl2_trd_cur_cd_ListPutter(columnDtl2_trd_cur_cd, "trd_cur_cd", "trd_cur_nm","trd_cur_amt_dec_place","trd_cur_upri_dec_place");

		}
		return Dtl2_trd_cur_cd_p;
	}
	
	
	/** [Dtl2_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_p = null;

	/**
	 * [Dtl2_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter() {
		if (Dtl2_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_p == null) {
			Dtl2_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_p = createDtl2_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd, "tax_cd", "tax_nm","tax_typ","tax_rate","inc_tax_flg");
		}
		return Dtl2_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_p;
	}
	
	
	/** [Dtl2_base_cur_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_base_cur_cd_p = null;

	/**
	 * [Dtl2_base_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_base_cur_cd_ListPutter() {
		if (Dtl2_base_cur_cd_p == null) {
			Dtl2_base_cur_cd_p = createDtl2_base_cur_cd_ListPutter(columnDtl2_base_cur_cd, "base_cur_cd");

		}
		return Dtl2_base_cur_cd_p;
	}
	
	
	/** [Dtl2_ptax_cur_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_ptax_cur_cd_p = null;

	/**
	 * [Dtl2_ptax_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_ptax_cur_cd_ListPutter() {
		if (Dtl2_ptax_cur_cd_p == null) {
			Dtl2_ptax_cur_cd_p = createDtl2_ptax_cur_cd_ListPutter(columnDtl2_ptax_cur_cd, "ptax_cur_cd");

		}
		return Dtl2_ptax_cur_cd_p;
	}
	
	
	/** [Dtl2_purc_rsn_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_purc_rsn_cd_p = null;

	/**
	 * [Dtl2_purc_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_purc_rsn_cd_ListPutter() {
		if (Dtl2_purc_rsn_cd_p == null) {
			Dtl2_purc_rsn_cd_p = createDtl2_purc_rsn_cd_ListPutter(columnDtl2_purc_rsn_cd, "purc_rsn_cd", "purc_rsn_nm","xpns_purc_flg");

		}
		return Dtl2_purc_rsn_cd_p;
	}
	
	
	/** [Dtl2_mfg_loc_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_mfg_loc_cd_p = null;

	/**
	 * [Dtl2_mfg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_mfg_loc_cd_ListPutter() {
		if (Dtl2_mfg_loc_cd_p == null) {
			Dtl2_mfg_loc_cd_p = createDtl2_mfg_loc_cd_ListPutter(columnDtl2_mfg_loc_cd, "mfg_loc_cd", "mfg_loc_nm","sppl_cd","maker_cd");

		}
		return Dtl2_mfg_loc_cd_p;
	}
	
	
	/** [Dtl2_bom_ptn_ListPutter]の定義 */
	private MCListPutter Dtl2_bom_ptn_p = null;

	/**
	 * [Dtl2_bom_ptn_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_bom_ptn_ListPutter() {
		if (Dtl2_bom_ptn_p == null) {
			Dtl2_bom_ptn_p = createDtl2_bom_ptn_ListPutter(columnDtl2_bom_ptn, "bom_ptn");

		}
		return Dtl2_bom_ptn_p;
	}
	
	
	/** [Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_cd_p = null;

	/**
	 * [Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter() {
		if (Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_cd_p == null) {
			Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_cd_p = createDtl2_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter(Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_cd, "bd_itm_cd", "bd_itm_sub1","bd_itm_sub2","bd_itm_sub3","bd_itm_nm","bd_lot_mng_typ","bd_lot_no_typ","bd_sublot_mng_typ","bd_sublot_no_typ","bd_sno1_mng_typ","bd_sno2_mng_typ","bd_sno3_mng_typ","bd_sno4_mng_typ");
		}
		return Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_cd_p;
	}
	
	
	/** [Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter]の定義 */
	private MCListPutter Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub1_p = null;

	/**
	 * [Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter() {
		if (Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub1_p == null) {
			Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub1_p = createDtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter(Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_sub1, "bd_itm_sub1", "bd_itm_sub2","bd_itm_sub3","bd_itm_nm","bd_lot_mng_typ","bd_lot_no_typ","bd_sublot_mng_typ","bd_sublot_no_typ","bd_sno1_mng_typ","bd_sno2_mng_typ","bd_sno3_mng_typ","bd_sno4_mng_typ");
		}
		return Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub1_p;
	}
	
	
	/** [Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter]の定義 */
	private MCListPutter Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub2_p = null;

	/**
	 * [Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter() {
		if (Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub2_p == null) {
			Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub2_p = createDtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter(Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_sub2, "bd_itm_sub2", "bd_itm_sub3","bd_itm_nm","bd_lot_mng_typ","bd_lot_no_typ","bd_sublot_mng_typ","bd_sublot_no_typ","bd_sno1_mng_typ","bd_sno2_mng_typ","bd_sno3_mng_typ","bd_sno4_mng_typ");
		}
		return Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub2_p;
	}
	
	
	/** [Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter]の定義 */
	private MCListPutter Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub3_p = null;

	/**
	 * [Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter() {
		if (Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub3_p == null) {
			Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub3_p = createDtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter(Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_sub3, "bd_itm_sub3", "bd_itm_nm","bd_lot_mng_typ","bd_lot_no_typ","bd_sublot_mng_typ","bd_sublot_no_typ","bd_sno1_mng_typ","bd_sno2_mng_typ","bd_sno3_mng_typ","bd_sno4_mng_typ");
		}
		return Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub3_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBDP_PoSchdSplitReg create(){
		MSBDP_PoSchdSplitReg p = new MSBDP_PoSchdSplitReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBDP_PoSchdSplitReg create(String name){
		MSBDP_PoSchdSplitReg p = new MSBDP_PoSchdSplitReg(name);
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
		MSBDP_PoSchdSplitReg_MC.jbfInitScreenOpe((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.jbfInitCnd((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.jbfInitDtl1((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.jbfInitDtl2((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.jbfInitBtn((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.jbfInitEastBtn((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.jbInitScreenOpe((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.jbInitCnd((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.jbInitDtl1((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.jbInitDtl2((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.jbInitBtn((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.jbInitEastBtn((MSBDP_PoSchdSplitReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBDP_PoSchdSplitReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBDP_PoSchdSplitReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_srch_tgt_typ = p.beansFactory.createTextField("Cnd.srch_tgt_typ");
		p.Cnd_srch_tgt_typ_nm_Label = p.beansFactory.createLabel("Cnd.srch_tgt_typ_nm_Label");
		p.Cnd_srch_tgt_typ_nm = p.beansFactory.createTextComboBox("Cnd.srch_tgt_typ_nm");
		p.Cnd_srch_tgt_typ_nm.setLabel(p.Cnd_srch_tgt_typ_nm_Label);
		p.Cnd_srch_tgt_no_Label = p.beansFactory.createLabel("Cnd.srch_tgt_no_Label");
		p.Cnd_srch_tgt_no = p.beansFactory.createTextField("Cnd.srch_tgt_no");
		p.Cnd_srch_tgt_no.setLabel(p.Cnd_srch_tgt_no_Label);
		p.Cnd_srch01 = p.beansFactory.createButton("Cnd.srch01", "srch");
		p.Cnd_srch02 = p.beansFactory.createButton("Cnd.srch02", "srch");
	}

	/**
	 * [Dtl1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl1(MSBDP_PoSchdSplitReg p) {
		// ブロック関連の初期化
		p.Dtl1Panel = p.beansFactory.createPanel("Dtl1");
		p.Dtl1TitledBorder = p.beansFactory.createTitledBorder();
		p.Dtl1ScrollPane = p.beansFactory.createScrollPane("Dtl1.scroll");
		p.createDtl1Table();
		// ブロックの項目の初期化
		p.columnDtl1_check = p.beansFactory.createTableColumn("Dtl1.check", MCColumnType.CHECK);
		p.columnDtl1_abort_flg = p.beansFactory.createTableColumn("Dtl1.abort_flg", MCColumnType.CHECK);
		p.columnDtl1_rqst_upd_stop_flg = p.beansFactory.createTableColumn("Dtl1.rqst_upd_stop_flg", MCColumnType.CHECK);
		p.columnDtl1_reg_dt = p.beansFactory.createTableColumn("Dtl1.reg_dt", MCColumnType.DATE);
		p.columnDtl1_in_to_loc_cd = p.beansFactory.createTableColumn("Dtl1.in_to_loc_cd", MCColumnType.TEXT);
		p.columnDtl1_in_to_loc_nm = p.beansFactory.createTableColumn("Dtl1.in_to_loc_nm", MCColumnType.TEXT);
		p.columnDtl1_in_to_loc_wg_cd = p.beansFactory.createTableColumn("Dtl1.in_to_loc_wg_cd", MCColumnType.TEXT);
		p.columnDtl1_in_to_loc_wg_nm = p.beansFactory.createTableColumn("Dtl1.in_to_loc_wg_nm", MCColumnType.TEXT);
		p.columnDtl1_drct_dlv_typ = p.beansFactory.createTableColumn("Dtl1.drct_dlv_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl1_drct_dlv_typ_nm = p.beansFactory.createTableColumn("Dtl1.drct_dlv_typ_nm", MCColumnType.TEXT);
		p.columnDtl1_outsrc_sppl_cd = p.beansFactory.createTableColumn("Dtl1.outsrc_sppl_cd", MCColumnType.TEXT);
		p.columnDtl1_str_ln_tgt_flg = p.beansFactory.createTableColumn("Dtl1.str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnDtl1_in_to_loc_cal_cd = p.beansFactory.createTableColumn("Dtl1.in_to_loc_cal_cd", MCColumnType.TEXT);
		p.columnDtl1_site_cd = p.beansFactory.createTableColumn("Dtl1.site_cd", MCColumnType.TEXT);
		p.columnDtl1_lg_grp_cd = p.beansFactory.createTableColumn("Dtl1.lg_grp_cd", MCColumnType.TEXT);
		p.columnDtl1_sundry_itm_flg = p.beansFactory.createTableColumn("Dtl1.sundry_itm_flg", MCColumnType.CHECK);
		p.columnDtl1_str_ln_cd = p.beansFactory.createTableColumn("Dtl1.str_ln_cd", MCColumnType.TEXT);
		p.columnDtl1_str_ln_nm = p.beansFactory.createTableColumn("Dtl1.str_ln_nm", MCColumnType.TEXT);
		p.columnDtl1_str_ln_cd_none_flg = p.beansFactory.createTableColumn("Dtl1.str_ln_cd_none_flg", MCColumnType.CHECK);
		p.columnDtl1_ver_flg = p.beansFactory.createTableColumn("Dtl1.ver_flg", MCColumnType.CHECK);
		p.columnDtl1_asset_mng_typ = p.beansFactory.createTableColumn("Dtl1.asset_mng_typ", MCColumnType.TEXT);
		p.columnDtl1_dscnt_itm_flg = p.beansFactory.createTableColumn("Dtl1.dscnt_itm_flg", MCColumnType.CHECK);
		p.columnDtl1_itm_purc_upri_cng_flg = p.beansFactory.createTableColumn("Dtl1.itm_purc_upri_cng_flg", MCColumnType.CHECK);
		p.columnDtl1_trd_unit_cd = p.beansFactory.createTableColumn("Dtl1.trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl1_trd_unit_nm = p.beansFactory.createTableColumn("Dtl1.trd_unit_nm", MCColumnType.TEXT);
		p.columnDtl1_trd_unit_dec_place = p.beansFactory.createTableColumn("Dtl1.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl1_trd_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl1.trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl1_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Dtl1.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnDtl1_trd_unit_conv_qty = p.beansFactory.createTableColumn("Dtl1.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtl1_base_unit_cd = p.beansFactory.createTableColumn("Dtl1.base_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl1_base_unit_nm = p.beansFactory.createTableColumn("Dtl1.base_unit_nm", MCColumnType.TEXT);
		p.columnDtl1_base_unit_dec_place = p.beansFactory.createTableColumn("Dtl1.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl1_base_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl1.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl1_cont_fctr_flg = p.beansFactory.createTableColumn("Dtl1.cont_fctr_flg", MCColumnType.CHECK);
		p.columnDtl1_cont_fctr_dec_place = p.beansFactory.createTableColumn("Dtl1.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnDtl1_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("Dtl1.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnDtl1_sppl_cd = p.beansFactory.createTableColumn("Dtl1.sppl_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl1_sppl_nm = p.beansFactory.createTableColumn("Dtl1.sppl_nm", MCColumnType.TEXT);
		p.columnDtl1_sppl_cntry_cd = p.beansFactory.createTableColumn("Dtl1.sppl_cntry_cd", MCColumnType.TEXT);
		p.columnDtl1_sppl_cntry_nm = p.beansFactory.createTableColumn("Dtl1.sppl_cntry_nm", MCColumnType.TEXT);
		p.columnDtl1_purc_amt_rnd_typ = p.beansFactory.createTableColumn("Dtl1.purc_amt_rnd_typ", MCColumnType.TEXT);
		p.columnDtl1_purc_tax_rnd_typ = p.beansFactory.createTableColumn("Dtl1.purc_tax_rnd_typ", MCColumnType.TEXT);
		p.columnDtl1_sppl_purc_upri_cng_flg = p.beansFactory.createTableColumn("Dtl1.sppl_purc_upri_cng_flg", MCColumnType.CHECK);
		p.columnDtl1_sppl_cal_cd = p.beansFactory.createTableColumn("Dtl1.sppl_cal_cd", MCColumnType.TEXT);
		p.columnDtl1_maker_cd = p.beansFactory.createTableColumn("Dtl1.maker_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl1_maker_nm = p.beansFactory.createTableColumn("Dtl1.maker_nm", MCColumnType.TEXT);
		p.columnDtl1_sppl_itm_cd = p.beansFactory.createTableColumn("Dtl1.sppl_itm_cd", MCColumnType.TEXT);
		p.columnDtl1_sppl_itm_nm = p.beansFactory.createTableColumn("Dtl1.sppl_itm_nm", MCColumnType.TEXT);
		p.columnDtl1_iv_itm_nm = p.beansFactory.createTableColumn("Dtl1.iv_itm_nm", MCColumnType.TEXT);
		p.columnDtl1_rqst_avl_rqst_dt = p.beansFactory.createTableColumn("Dtl1.rqst_avl_rqst_dt", MCColumnType.DATE);
		p.columnDtl1_purc_schd_dt = p.beansFactory.createTableColumn("Dtl1.purc_schd_dt", MCColumnType.DATE);
		p.columnDtl1_po_schd_dt = p.beansFactory.createTableColumn("Dtl1.po_schd_dt", MCColumnType.DATE);
		p.columnDtl1_purc_dpt_wg_cd = p.beansFactory.createTableColumn("Dtl1.purc_dpt_wg_cd", MCColumnType.TEXT);
		p.columnDtl1_purc_dpt_wg_nm = p.beansFactory.createTableColumn("Dtl1.purc_dpt_wg_nm", MCColumnType.TEXT);
		p.columnDtl1_purc_upri_req_typ = p.beansFactory.createTableColumn("Dtl1.purc_upri_req_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl1_purc_upri_req_typ_nm = p.beansFactory.createTableColumn("Dtl1.purc_upri_req_typ_nm", MCColumnType.TEXT);
		p.columnDtl1_trd_cur_cd = p.beansFactory.createTableColumn("Dtl1.trd_cur_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl1_trd_cur_nm = p.beansFactory.createTableColumn("Dtl1.trd_cur_nm", MCColumnType.TEXT);
		p.columnDtl1_trd_cur_amt_dec_place = p.beansFactory.createTableColumn("Dtl1.trd_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnDtl1_trd_cur_upri_dec_place = p.beansFactory.createTableColumn("Dtl1.trd_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnDtl1_repurc_obli_flg = p.beansFactory.createTableColumn("Dtl1.repurc_obli_flg", MCColumnType.CHECK);
		p.columnDtl1_outsrc_upri_typ = p.beansFactory.createTableColumn("Dtl1.outsrc_upri_typ", MCColumnType.TEXT);
		p.columnDtl1_old_trd_cur_upri = p.beansFactory.createTableColumn("Dtl1.old_trd_cur_upri", MCColumnType.NUMBER);
		p.columnDtl1_old_trd_cur_proc_upri = p.beansFactory.createTableColumn("Dtl1.old_trd_cur_proc_upri", MCColumnType.NUMBER);
		p.columnDtl1_old_trd_cur_onr_prov_upri = p.beansFactory.createTableColumn("Dtl1.old_trd_cur_onr_prov_upri", MCColumnType.NUMBER);
		p.columnDtl1_old_interim_flg = p.beansFactory.createTableColumn("Dtl1.old_interim_flg", MCColumnType.CHECK);
		p.columnDtl1_xrate_cd = p.beansFactory.createTableColumn("Dtl1.xrate_cd", MCColumnType.TEXT);
		p.columnDtl1_xrate_inpt_flg = p.beansFactory.createTableColumn("Dtl1.xrate_inpt_flg", MCColumnType.CHECK);
		p.columnDtl1_base_cur_cd = p.beansFactory.createTableColumn("Dtl1.base_cur_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl1_base_cur_nm = p.beansFactory.createTableColumn("Dtl1.base_cur_nm", MCColumnType.TEXT);
		p.columnDtl1_base_cur_amt_dec_place = p.beansFactory.createTableColumn("Dtl1.base_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnDtl1_base_cur_upri_dec_place = p.beansFactory.createTableColumn("Dtl1.base_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnDtl1_ptax_xrate_inpt_flg = p.beansFactory.createTableColumn("Dtl1.ptax_xrate_inpt_flg", MCColumnType.CHECK);
		p.columnDtl1_ptax_cur_cd = p.beansFactory.createTableColumn("Dtl1.ptax_cur_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl1_ptax_cur_nm = p.beansFactory.createTableColumn("Dtl1.ptax_cur_nm", MCColumnType.TEXT);
		p.columnDtl1_ptax_cur_amt_dec_place = p.beansFactory.createTableColumn("Dtl1.ptax_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnDtl1_ptax_cur_upri_dec_place = p.beansFactory.createTableColumn("Dtl1.ptax_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnDtl1_purc_rsn_cd = p.beansFactory.createTableColumn("Dtl1.purc_rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl1_purc_rsn_nm = p.beansFactory.createTableColumn("Dtl1.purc_rsn_nm", MCColumnType.TEXT);
		p.columnDtl1_xpns_purc_flg = p.beansFactory.createTableColumn("Dtl1.xpns_purc_flg", MCColumnType.CHECK);
		p.columnDtl1_not_xpns_purc_flg = p.beansFactory.createTableColumn("Dtl1.not_xpns_purc_flg", MCColumnType.CHECK);
		p.columnDtl1_intr_rmrks = p.beansFactory.createTableColumn("Dtl1.intr_rmrks", MCColumnType.TEXT);
		p.columnDtl1_trd_d_rmrks = p.beansFactory.createTableColumn("Dtl1.trd_d_rmrks", MCColumnType.TEXT);
		p.columnDtl1_po_cnt_rmrks = p.beansFactory.createTableColumn("Dtl1.po_cnt_rmrks", MCColumnType.TEXT);
		p.columnDtl1_mfg_loc_cd = p.beansFactory.createTableColumn("Dtl1.mfg_loc_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl1_mfg_loc_nm = p.beansFactory.createTableColumn("Dtl1.mfg_loc_nm", MCColumnType.TEXT);
		p.columnDtl1_bom_ptn = p.beansFactory.createTableColumn("Dtl1.bom_ptn", MCColumnType.TEXT_COMBO);
		p.columnDtl1_outsrc_flg = p.beansFactory.createTableColumn("Dtl1.outsrc_flg", MCColumnType.CHECK);
		p.columnDtl1_outsrc_itm_ord_no = p.beansFactory.createTableColumn("Dtl1.outsrc_itm_ord_no", MCColumnType.TEXT);
		p.columnDtl1_bd_lot_mng_typ = p.beansFactory.createTableColumn("Dtl1.bd_lot_mng_typ", MCColumnType.TEXT);
		p.columnDtl1_bd_sublot_mng_typ = p.beansFactory.createTableColumn("Dtl1.bd_sublot_mng_typ", MCColumnType.TEXT);
		p.columnDtl1_bd_lot_no_typ = p.beansFactory.createTableColumn("Dtl1.bd_lot_no_typ", MCColumnType.TEXT);
		p.columnDtl1_bd_sublot_no_typ = p.beansFactory.createTableColumn("Dtl1.bd_sublot_no_typ", MCColumnType.TEXT);
		p.columnDtl1_bd_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl1.bd_sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl1_bd_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl1.bd_sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl1_bd_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl1.bd_sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl1_bd_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl1.bd_sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl1_rqst_fr_usr_cd = p.beansFactory.createTableColumn("Dtl1.rqst_fr_usr_cd", MCColumnType.TEXT);
		p.columnDtl1_rqst_fr_usr_nm = p.beansFactory.createTableColumn("Dtl1.rqst_fr_usr_nm", MCColumnType.TEXT);
		p.columnDtl1_rqst_fr_dpt_cd = p.beansFactory.createTableColumn("Dtl1.rqst_fr_dpt_cd", MCColumnType.TEXT);
		p.columnDtl1_rqst_fr_dpt_nm = p.beansFactory.createTableColumn("Dtl1.rqst_fr_dpt_nm", MCColumnType.TEXT);
		p.columnDtl1_po_schd_no = p.beansFactory.createTableColumn("Dtl1.po_schd_no", MCColumnType.TEXT);
		p.columnDtl1_trd_ptn_typ = p.beansFactory.createTableColumn("Dtl1.trd_ptn_typ", MCColumnType.TEXT);
		p.columnDtl1_po_schd_src_typ = p.beansFactory.createTableColumn("Dtl1.po_schd_src_typ", MCColumnType.TEXT);
		p.columnDtl1_ins_usr_id = p.beansFactory.createTableColumn("Dtl1.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl1_ins_usr_nm = p.beansFactory.createTableColumn("Dtl1.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl1_ins_func_id = p.beansFactory.createTableColumn("Dtl1.ins_func_id", MCColumnType.TEXT);
		p.columnDtl1_ins_func_nm = p.beansFactory.createTableColumn("Dtl1.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl1_ins_ts = p.beansFactory.createTableColumn("Dtl1.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl1_upd_usr_id = p.beansFactory.createTableColumn("Dtl1.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl1_upd_usr_nm = p.beansFactory.createTableColumn("Dtl1.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl1_upd_func_id = p.beansFactory.createTableColumn("Dtl1.upd_func_id", MCColumnType.TEXT);
		p.columnDtl1_upd_func_nm = p.beansFactory.createTableColumn("Dtl1.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl1_upd_ts = p.beansFactory.createTableColumn("Dtl1.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl1_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl1.upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtl1_po_schd_upd_cntr = p.beansFactory.createTableColumn("Dtl1.po_schd_upd_cntr", MCColumnType.NUMBER);
		p.columnDtl1_base_dt = p.beansFactory.createTableColumn("Dtl1.base_dt", MCColumnType.DATE);
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl2(MSBDP_PoSchdSplitReg p) {
		// ブロック関連の初期化
		p.Dtl2Panel = p.beansFactory.createPanel("Dtl2");
		p.Dtl2TitledBorder = p.beansFactory.createTitledBorder();
		p.Dtl2ScrollPane = p.beansFactory.createScrollPane("Dtl2.scroll");
		p.createDtl2Table();
		// ブロックの項目の初期化
		p.columnDtl2_check = p.beansFactory.createTableColumn("Dtl2.check", MCColumnType.CHECK);
		p.columnDtl2_abort_flg = p.beansFactory.createTableColumn("Dtl2.abort_flg", MCColumnType.CHECK);
		p.columnDtl2_rqst_upd_stop_flg = p.beansFactory.createTableColumn("Dtl2.rqst_upd_stop_flg", MCColumnType.CHECK);
		p.columnDtl2_reg_dt = p.beansFactory.createTableColumn("Dtl2.reg_dt", MCColumnType.DATE);
		p.columnDtl2_in_to_loc_cd = p.beansFactory.createTableColumn("Dtl2.in_to_loc_cd", MCColumnType.TEXT);
		p.columnDtl2_in_to_loc_nm = p.beansFactory.createTableColumn("Dtl2.in_to_loc_nm", MCColumnType.TEXT);
		p.columnDtl2_in_to_loc_wg_cd = p.beansFactory.createTableColumn("Dtl2.in_to_loc_wg_cd", MCColumnType.TEXT);
		p.columnDtl2_in_to_loc_wg_nm = p.beansFactory.createTableColumn("Dtl2.in_to_loc_wg_nm", MCColumnType.TEXT);
		p.columnDtl2_drct_dlv_typ = p.beansFactory.createTableColumn("Dtl2.drct_dlv_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl2_drct_dlv_typ_nm = p.beansFactory.createTableColumn("Dtl2.drct_dlv_typ_nm", MCColumnType.TEXT);
		p.columnDtl2_outsrc_sppl_cd = p.beansFactory.createTableColumn("Dtl2.outsrc_sppl_cd", MCColumnType.TEXT);
		p.columnDtl2_str_ln_tgt_flg = p.beansFactory.createTableColumn("Dtl2.str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnDtl2_in_to_loc_cal_cd = p.beansFactory.createTableColumn("Dtl2.in_to_loc_cal_cd", MCColumnType.TEXT);
		p.columnDtl2_site_cd = p.beansFactory.createTableColumn("Dtl2.site_cd", MCColumnType.TEXT);
		p.columnDtl2_lg_grp_cd = p.beansFactory.createTableColumn("Dtl2.lg_grp_cd", MCColumnType.TEXT);
		p.columnDtl2_str_ln_cd = p.beansFactory.createTableColumn("Dtl2.str_ln_cd", MCColumnType.TEXT);
		p.columnDtl2_str_ln_nm = p.beansFactory.createTableColumn("Dtl2.str_ln_nm", MCColumnType.TEXT);
		p.columnDtl2_str_ln_cd_none_flg = p.beansFactory.createTableColumn("Dtl2.str_ln_cd_none_flg", MCColumnType.CHECK);
		p.columnDtl2_rqst_avl_rqst_dt = p.beansFactory.createTableColumn("Dtl2.rqst_avl_rqst_dt", MCColumnType.DATE);
		p.columnDtl2_sundry_itm_flg = p.beansFactory.createTableColumn("Dtl2.sundry_itm_flg", MCColumnType.CHECK);
		p.columnDtl2_ver_flg = p.beansFactory.createTableColumn("Dtl2.ver_flg", MCColumnType.CHECK);
		p.columnDtl2_asset_mng_typ = p.beansFactory.createTableColumn("Dtl2.asset_mng_typ", MCColumnType.TEXT);
		p.columnDtl2_dscnt_itm_flg = p.beansFactory.createTableColumn("Dtl2.dscnt_itm_flg", MCColumnType.CHECK);
		p.columnDtl2_itm_purc_upri_cng_flg = p.beansFactory.createTableColumn("Dtl2.itm_purc_upri_cng_flg", MCColumnType.CHECK);
		p.columnDtl2_trd_unit_cd = p.beansFactory.createTableColumn("Dtl2.trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl2_trd_unit_nm = p.beansFactory.createTableColumn("Dtl2.trd_unit_nm", MCColumnType.TEXT);
		p.columnDtl2_trd_unit_dec_place = p.beansFactory.createTableColumn("Dtl2.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl2_trd_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl2.trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl2_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Dtl2.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnDtl2_trd_unit_conv_qty = p.beansFactory.createTableColumn("Dtl2.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtl2_base_unit_cd = p.beansFactory.createTableColumn("Dtl2.base_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl2_base_unit_nm = p.beansFactory.createTableColumn("Dtl2.base_unit_nm", MCColumnType.TEXT);
		p.columnDtl2_base_unit_dec_place = p.beansFactory.createTableColumn("Dtl2.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl2_base_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl2.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl2_cont_fctr_flg = p.beansFactory.createTableColumn("Dtl2.cont_fctr_flg", MCColumnType.CHECK);
		p.columnDtl2_cont_fctr_dec_place = p.beansFactory.createTableColumn("Dtl2.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnDtl2_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("Dtl2.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnDtl2_sppl_cd = p.beansFactory.createTableColumn("Dtl2.sppl_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl2_sppl_nm = p.beansFactory.createTableColumn("Dtl2.sppl_nm", MCColumnType.TEXT);
		p.columnDtl2_sppl_cntry_cd = p.beansFactory.createTableColumn("Dtl2.sppl_cntry_cd", MCColumnType.TEXT);
		p.columnDtl2_sppl_cntry_nm = p.beansFactory.createTableColumn("Dtl2.sppl_cntry_nm", MCColumnType.TEXT);
		p.columnDtl2_purc_amt_rnd_typ = p.beansFactory.createTableColumn("Dtl2.purc_amt_rnd_typ", MCColumnType.TEXT);
		p.columnDtl2_purc_tax_rnd_typ = p.beansFactory.createTableColumn("Dtl2.purc_tax_rnd_typ", MCColumnType.TEXT);
		p.columnDtl2_sppl_purc_upri_cng_flg = p.beansFactory.createTableColumn("Dtl2.sppl_purc_upri_cng_flg", MCColumnType.CHECK);
		p.columnDtl2_sppl_cal_cd = p.beansFactory.createTableColumn("Dtl2.sppl_cal_cd", MCColumnType.TEXT);
		p.columnDtl2_maker_cd = p.beansFactory.createTableColumn("Dtl2.maker_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl2_maker_nm = p.beansFactory.createTableColumn("Dtl2.maker_nm", MCColumnType.TEXT);
		p.columnDtl2_sppl_itm_cd = p.beansFactory.createTableColumn("Dtl2.sppl_itm_cd", MCColumnType.TEXT);
		p.columnDtl2_sppl_itm_nm = p.beansFactory.createTableColumn("Dtl2.sppl_itm_nm", MCColumnType.TEXT);
		p.columnDtl2_iv_itm_nm = p.beansFactory.createTableColumn("Dtl2.iv_itm_nm", MCColumnType.TEXT);
		p.columnDtl2_purc_schd_dt = p.beansFactory.createTableColumn("Dtl2.purc_schd_dt", MCColumnType.DATE);
		p.columnDtl2_po_schd_dt = p.beansFactory.createTableColumn("Dtl2.po_schd_dt", MCColumnType.DATE);
		p.columnDtl2_purc_dpt_wg_cd = p.beansFactory.createTableColumn("Dtl2.purc_dpt_wg_cd", MCColumnType.TEXT);
		p.columnDtl2_purc_dpt_wg_nm = p.beansFactory.createTableColumn("Dtl2.purc_dpt_wg_nm", MCColumnType.TEXT);
		p.columnDtl2_purc_upri_req_typ = p.beansFactory.createTableColumn("Dtl2.purc_upri_req_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl2_purc_upri_req_typ_nm = p.beansFactory.createTableColumn("Dtl2.purc_upri_req_typ_nm", MCColumnType.TEXT);
		p.columnDtl2_trd_cur_cd = p.beansFactory.createTableColumn("Dtl2.trd_cur_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl2_trd_cur_nm = p.beansFactory.createTableColumn("Dtl2.trd_cur_nm", MCColumnType.TEXT);
		p.columnDtl2_trd_cur_amt_dec_place = p.beansFactory.createTableColumn("Dtl2.trd_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnDtl2_trd_cur_upri_dec_place = p.beansFactory.createTableColumn("Dtl2.trd_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnDtl2_repurc_obli_flg = p.beansFactory.createTableColumn("Dtl2.repurc_obli_flg", MCColumnType.CHECK);
		p.columnDtl2_outsrc_upri_typ = p.beansFactory.createTableColumn("Dtl2.outsrc_upri_typ", MCColumnType.TEXT);
		p.columnDtl2_old_trd_cur_upri = p.beansFactory.createTableColumn("Dtl2.old_trd_cur_upri", MCColumnType.NUMBER);
		p.columnDtl2_old_trd_cur_proc_upri = p.beansFactory.createTableColumn("Dtl2.old_trd_cur_proc_upri", MCColumnType.NUMBER);
		p.columnDtl2_old_trd_cur_onr_prov_upri = p.beansFactory.createTableColumn("Dtl2.old_trd_cur_onr_prov_upri", MCColumnType.NUMBER);
		p.columnDtl2_old_interim_flg = p.beansFactory.createTableColumn("Dtl2.old_interim_flg", MCColumnType.CHECK);
		p.columnDtl2_xrate_cd = p.beansFactory.createTableColumn("Dtl2.xrate_cd", MCColumnType.TEXT);
		p.columnDtl2_xrate_inpt_flg = p.beansFactory.createTableColumn("Dtl2.xrate_inpt_flg", MCColumnType.CHECK);
		p.columnDtl2_base_cur_cd = p.beansFactory.createTableColumn("Dtl2.base_cur_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl2_base_cur_nm = p.beansFactory.createTableColumn("Dtl2.base_cur_nm", MCColumnType.TEXT);
		p.columnDtl2_base_cur_amt_dec_place = p.beansFactory.createTableColumn("Dtl2.base_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnDtl2_base_cur_upri_dec_place = p.beansFactory.createTableColumn("Dtl2.base_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnDtl2_ptax_xrate_inpt_flg = p.beansFactory.createTableColumn("Dtl2.ptax_xrate_inpt_flg", MCColumnType.CHECK);
		p.columnDtl2_ptax_cur_cd = p.beansFactory.createTableColumn("Dtl2.ptax_cur_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl2_ptax_cur_nm = p.beansFactory.createTableColumn("Dtl2.ptax_cur_nm", MCColumnType.TEXT);
		p.columnDtl2_ptax_cur_amt_dec_place = p.beansFactory.createTableColumn("Dtl2.ptax_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnDtl2_ptax_cur_upri_dec_place = p.beansFactory.createTableColumn("Dtl2.ptax_cur_upri_dec_place", MCColumnType.NUMBER);
		p.columnDtl2_purc_rsn_cd = p.beansFactory.createTableColumn("Dtl2.purc_rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl2_purc_rsn_nm = p.beansFactory.createTableColumn("Dtl2.purc_rsn_nm", MCColumnType.TEXT);
		p.columnDtl2_xpns_purc_flg = p.beansFactory.createTableColumn("Dtl2.xpns_purc_flg", MCColumnType.CHECK);
		p.columnDtl2_not_xpns_purc_flg = p.beansFactory.createTableColumn("Dtl2.not_xpns_purc_flg", MCColumnType.CHECK);
		p.columnDtl2_intr_rmrks = p.beansFactory.createTableColumn("Dtl2.intr_rmrks", MCColumnType.TEXT);
		p.columnDtl2_trd_d_rmrks = p.beansFactory.createTableColumn("Dtl2.trd_d_rmrks", MCColumnType.TEXT);
		p.columnDtl2_po_cnt_rmrks = p.beansFactory.createTableColumn("Dtl2.po_cnt_rmrks", MCColumnType.TEXT);
		p.columnDtl2_mfg_loc_cd = p.beansFactory.createTableColumn("Dtl2.mfg_loc_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl2_mfg_loc_nm = p.beansFactory.createTableColumn("Dtl2.mfg_loc_nm", MCColumnType.TEXT);
		p.columnDtl2_bom_ptn = p.beansFactory.createTableColumn("Dtl2.bom_ptn", MCColumnType.TEXT_COMBO);
		p.columnDtl2_outsrc_flg = p.beansFactory.createTableColumn("Dtl2.outsrc_flg", MCColumnType.CHECK);
		p.columnDtl2_outsrc_itm_ord_no = p.beansFactory.createTableColumn("Dtl2.outsrc_itm_ord_no", MCColumnType.TEXT);
		p.columnDtl2_bd_lot_mng_typ = p.beansFactory.createTableColumn("Dtl2.bd_lot_mng_typ", MCColumnType.TEXT);
		p.columnDtl2_bd_sublot_mng_typ = p.beansFactory.createTableColumn("Dtl2.bd_sublot_mng_typ", MCColumnType.TEXT);
		p.columnDtl2_bd_lot_no_typ = p.beansFactory.createTableColumn("Dtl2.bd_lot_no_typ", MCColumnType.TEXT);
		p.columnDtl2_bd_sublot_no_typ = p.beansFactory.createTableColumn("Dtl2.bd_sublot_no_typ", MCColumnType.TEXT);
		p.columnDtl2_bd_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl2.bd_sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl2_bd_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl2.bd_sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl2_bd_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl2.bd_sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl2_bd_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl2.bd_sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl2_rqst_fr_usr_cd = p.beansFactory.createTableColumn("Dtl2.rqst_fr_usr_cd", MCColumnType.TEXT);
		p.columnDtl2_rqst_fr_usr_nm = p.beansFactory.createTableColumn("Dtl2.rqst_fr_usr_nm", MCColumnType.TEXT);
		p.columnDtl2_rqst_fr_dpt_cd = p.beansFactory.createTableColumn("Dtl2.rqst_fr_dpt_cd", MCColumnType.TEXT);
		p.columnDtl2_rqst_fr_dpt_nm = p.beansFactory.createTableColumn("Dtl2.rqst_fr_dpt_nm", MCColumnType.TEXT);
		p.columnDtl2_po_schd_no = p.beansFactory.createTableColumn("Dtl2.po_schd_no", MCColumnType.TEXT);
		p.columnDtl2_trd_ptn_typ = p.beansFactory.createTableColumn("Dtl2.trd_ptn_typ", MCColumnType.TEXT);
		p.columnDtl2_po_schd_src_typ = p.beansFactory.createTableColumn("Dtl2.po_schd_src_typ", MCColumnType.TEXT);
		p.columnDtl2_ins_usr_id = p.beansFactory.createTableColumn("Dtl2.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl2_ins_usr_nm = p.beansFactory.createTableColumn("Dtl2.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl2_ins_func_id = p.beansFactory.createTableColumn("Dtl2.ins_func_id", MCColumnType.TEXT);
		p.columnDtl2_ins_func_nm = p.beansFactory.createTableColumn("Dtl2.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl2_ins_ts = p.beansFactory.createTableColumn("Dtl2.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl2_upd_usr_id = p.beansFactory.createTableColumn("Dtl2.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl2_upd_usr_nm = p.beansFactory.createTableColumn("Dtl2.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl2_upd_func_id = p.beansFactory.createTableColumn("Dtl2.upd_func_id", MCColumnType.TEXT);
		p.columnDtl2_upd_func_nm = p.beansFactory.createTableColumn("Dtl2.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl2_upd_ts = p.beansFactory.createTableColumn("Dtl2.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl2_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl2.upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtl2_po_schd_upd_cntr = p.beansFactory.createTableColumn("Dtl2.po_schd_upd_cntr", MCColumnType.NUMBER);
		p.columnDtl2_base_dt = p.beansFactory.createTableColumn("Dtl2.base_dt", MCColumnType.DATE);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBDP_PoSchdSplitReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_mstr_replace = p.beansFactory.createButton("Btn.mstr_replace");
		p.Btn_upri_replace = p.beansFactory.createButton("Btn.upri_replace");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBDP_PoSchdSplitReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBDP_PoSchdSplitReg p) {
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
	protected static void jbInitCnd(MSBDP_PoSchdSplitReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.Dtl1Panel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_INS);
		p.ScreenOpePanel.add(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0040.CndR.ope_META);
		p.CndPanel.add(p.Cnd_srch_tgt_typ);
		p.CndPanel.setLastBeans(p.Cnd_srch_tgt_typ);
		p.Cnd_srch_tgt_typ.setNextBeans(p.Cnd_srch_tgt_typ_nm);
		p.Cnd_srch_tgt_typ.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0040.CndR.srch_tgt_typ_META);
		p.Cnd_srch_tgt_typ_nm.setListType(MCListType.STRICT);
		p.Cnd_srch_tgt_typ_nm.setLinkBeans(p.Cnd_srch_tgt_typ);
		p.CndPanel.add(p.Cnd_srch_tgt_typ_nm_Label);
		p.CndPanel.add(p.Cnd_srch_tgt_typ_nm);
		p.Cnd_srch_tgt_typ_nm.setNextBeans(p.Cnd_srch_tgt_no);
		p.Cnd_srch_tgt_typ_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0040.CndR.srch_tgt_typ_nm_META);
		p.CndPanel.add(p.Cnd_srch_tgt_no_Label);
		p.CndPanel.add(p.Cnd_srch_tgt_no);
		p.Cnd_srch_tgt_no.setNextBeans(p.Cnd_srch01);
		p.Cnd_srch_tgt_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0040.CndR.srch_tgt_no_META);
		p.Cnd_srch01.setIcon("SEARCH");
		p.Cnd_srch01.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch01);
		p.Cnd_srch01.setNextBeans(p.Cnd_srch02);
		p.Cnd_srch02.setIcon("SEARCH");
		p.Cnd_srch02.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch02);
	}

	/**
	 * [Dtl1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl1(MSBDP_PoSchdSplitReg p) {
		// ブロック関連の初期化
		p.Dtl1Panel.setBorder(p.Dtl1TitledBorder);
		p.add(p.Dtl1Panel);
		p.Dtl1Panel.setNextBeans(p.Dtl2Panel);
		p.Dtl1Panel.add(p.Dtl1ScrollPane);
		p.Dtl1Panel.setLastBeans(p.Dtl1Table);
		p.Dtl1ScrollPane.setViewportView(p.Dtl1Table);
		p.Dtl1Table.setList(p.getDtl1L());
		p.Dtl1Panel.setLayoutPosition("CTC");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl2(MSBDP_PoSchdSplitReg p) {
		// ブロック関連の初期化
		p.Dtl2Panel.setBorder(p.Dtl2TitledBorder);
		p.add(p.Dtl2Panel);
		p.Dtl2Panel.setNextBeans(p.BtnPanel);
		p.Dtl2Panel.add(p.Dtl2ScrollPane);
		p.Dtl2Panel.setLastBeans(p.Dtl2Table);
		p.Dtl2ScrollPane.setViewportView(p.Dtl2Table);
		p.Dtl2Table.setList(p.getDtl2L());
		p.Dtl2Panel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBDP_PoSchdSplitReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_mstr_replace.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_mstr_replace);
		p.BtnPanel.setLastBeans(p.Btn_mstr_replace);
		p.Btn_mstr_replace.setNextBeans(p.Btn_upri_replace);
		p.Btn_upri_replace.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_upri_replace);
		p.Btn_upri_replace.setNextBeans(p.Btn_radd);
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
		p.Btn_rcopy.setNextBeans(p.Btn_ins);
		p.Btn_ins.setIcon("REGISTER");
		p.Btn_ins.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins);
		p.Btn_ins.setNextBeans(p.Btn_sync_p_PPanel);
		p.BtnPanel.add(p.Btn_sync_p_PPanel);
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBDP_PoSchdSplitReg p) {
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
		MSBDP_PoSchdSplitReg_MC.mcInitScreenOpe((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.mcInitCnd((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.mcInitDtl1((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.mcInitDtl2((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.mcInitBtn((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.mcInitEastBtn((MSBDP_PoSchdSplitReg)this);

		// [SRCH_SPLIT]ステータスのモードの設定
		MSBDP_PoSchdSplitReg_MC.statusInitSRCH__SPLIT_ScreenOpe((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitSRCH__SPLIT_Cnd((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitSRCH__SPLIT_Dtl1((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitSRCH__SPLIT_Dtl2((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitSRCH__SPLIT_Btn((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitSRCH__SPLIT_EastBtn((MSBDP_PoSchdSplitReg)this);

		// [INS]ステータスのモードの設定
		MSBDP_PoSchdSplitReg_MC.statusInitINS_ScreenOpe((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitINS_Cnd((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitINS_Dtl1((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitINS_Dtl2((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitINS_Btn((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitINS_EastBtn((MSBDP_PoSchdSplitReg)this);

		// [SRCH_DEL]ステータスのモードの設定
		MSBDP_PoSchdSplitReg_MC.statusInitSRCH__DEL_ScreenOpe((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitSRCH__DEL_Cnd((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitSRCH__DEL_Dtl1((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitSRCH__DEL_Dtl2((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitSRCH__DEL_Btn((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitSRCH__DEL_EastBtn((MSBDP_PoSchdSplitReg)this);

		// [DEL]ステータスのモードの設定
		MSBDP_PoSchdSplitReg_MC.statusInitDEL_ScreenOpe((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitDEL_Cnd((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitDEL_Dtl1((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitDEL_Dtl2((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitDEL_Btn((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitDEL_EastBtn((MSBDP_PoSchdSplitReg)this);

		// [SRCH_REF]ステータスのモードの設定
		MSBDP_PoSchdSplitReg_MC.statusInitSRCH__REF_ScreenOpe((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitSRCH__REF_Cnd((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitSRCH__REF_Dtl1((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitSRCH__REF_Dtl2((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitSRCH__REF_Btn((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitSRCH__REF_EastBtn((MSBDP_PoSchdSplitReg)this);

		// [REF]ステータスのモードの設定
		MSBDP_PoSchdSplitReg_MC.statusInitREF_ScreenOpe((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitREF_Cnd((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitREF_Dtl1((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitREF_Dtl2((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitREF_Btn((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitREF_EastBtn((MSBDP_PoSchdSplitReg)this);

		// [FIX_I]ステータスのモードの設定
		MSBDP_PoSchdSplitReg_MC.statusInitFIX__I_ScreenOpe((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitFIX__I_Cnd((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitFIX__I_Dtl1((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitFIX__I_Dtl2((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitFIX__I_Btn((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitFIX__I_EastBtn((MSBDP_PoSchdSplitReg)this);

		// [FIX_D]ステータスのモードの設定
		MSBDP_PoSchdSplitReg_MC.statusInitFIX__D_ScreenOpe((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitFIX__D_Cnd((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitFIX__D_Dtl1((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitFIX__D_Dtl2((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitFIX__D_Btn((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.statusInitFIX__D_EastBtn((MSBDP_PoSchdSplitReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBDP_PoSchdSplitReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBDP_PoSchdSplitReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_srch_tgt_typ.setListListener(p);
		p.Cnd_srch_tgt_typ.addAllListener(p);
		p.Cnd_srch_tgt_typ_nm.setListListener(p);
		p.Cnd_srch_tgt_typ_nm.addAllListener(p);
		p.Cnd_srch_tgt_no.setListListener(p);
		p.Cnd_srch_tgt_no.addAllListener(p);
		p.Cnd_srch01.addAllListener(p);
		p.Cnd_srch01.setAPMethodName("doCnd_srch01");
		p.Cnd_srch02.addAllListener(p);
		p.Cnd_srch02.setAPMethodName("doCnd_srch02");
	}

	/**
	 *  [Dtl1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl1(MSBDP_PoSchdSplitReg p) {
		p.Dtl1Table.addAllListener(p);
		p.columnDtl1_check.addAllListener(p);
		p.columnDtl1_abort_flg.addAllListener(p);
		p.columnDtl1_rqst_upd_stop_flg.addAllListener(p);
		p.columnDtl1_reg_dt.addAllListener(p);
		p.columnDtl1_reg_dt.setListListener(p);
		p.columnDtl1_in_to_loc_cd.addAllListener(p);
		p.columnDtl1_in_to_loc_cd.setListListener(p);
		p.columnDtl1_in_to_loc_nm.addAllListener(p);
		p.columnDtl1_in_to_loc_nm.setListListener(p);
		p.columnDtl1_in_to_loc_wg_cd.addAllListener(p);
		p.columnDtl1_in_to_loc_wg_cd.setListListener(p);
		p.columnDtl1_in_to_loc_wg_nm.addAllListener(p);
		p.columnDtl1_in_to_loc_wg_nm.setListListener(p);
		p.columnDtl1_drct_dlv_typ.addAllListener(p);
		p.columnDtl1_drct_dlv_typ.setListListener(p);
		p.columnDtl1_drct_dlv_typ_nm.addAllListener(p);
		p.columnDtl1_drct_dlv_typ_nm.setListListener(p);
		p.columnDtl1_outsrc_sppl_cd.addAllListener(p);
		p.columnDtl1_outsrc_sppl_cd.setListListener(p);
		p.columnDtl1_str_ln_tgt_flg.addAllListener(p);
		p.columnDtl1_in_to_loc_cal_cd.addAllListener(p);
		p.columnDtl1_in_to_loc_cal_cd.setListListener(p);
		p.columnDtl1_site_cd.addAllListener(p);
		p.columnDtl1_site_cd.setListListener(p);
		p.columnDtl1_lg_grp_cd.addAllListener(p);
		p.columnDtl1_lg_grp_cd.setListListener(p);
		p.columnDtl1_sundry_itm_flg.addAllListener(p);
		p.columnDtl1_str_ln_cd.addAllListener(p);
		p.columnDtl1_str_ln_cd.setListListener(p);
		p.columnDtl1_str_ln_nm.addAllListener(p);
		p.columnDtl1_str_ln_nm.setListListener(p);
		p.columnDtl1_str_ln_cd_none_flg.addAllListener(p);
		p.columnDtl1_ver_flg.addAllListener(p);
		p.columnDtl1_asset_mng_typ.addAllListener(p);
		p.columnDtl1_asset_mng_typ.setListListener(p);
		p.columnDtl1_dscnt_itm_flg.addAllListener(p);
		p.columnDtl1_itm_purc_upri_cng_flg.addAllListener(p);
		p.Dtl1_ver_no_p_PPanel.columnVerNo_ver_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl1_trd_unit_cd.addAllListener(p);
		p.columnDtl1_trd_unit_cd.setListListener(p);
		p.columnDtl1_trd_unit_nm.addAllListener(p);
		p.columnDtl1_trd_unit_nm.setListListener(p);
		p.columnDtl1_trd_unit_dec_place.addAllListener(p);
		p.columnDtl1_trd_unit_dec_place.setListListener(p);
		p.columnDtl1_trd_unit_rnd_typ.addAllListener(p);
		p.columnDtl1_trd_unit_rnd_typ.setListListener(p);
		p.columnDtl1_trd_unit_conv_base_qty.addAllListener(p);
		p.columnDtl1_trd_unit_conv_base_qty.setListListener(p);
		p.columnDtl1_trd_unit_conv_qty.addAllListener(p);
		p.columnDtl1_trd_unit_conv_qty.setListListener(p);
		p.columnDtl1_base_unit_cd.addAllListener(p);
		p.columnDtl1_base_unit_cd.setListListener(p);
		p.columnDtl1_base_unit_nm.addAllListener(p);
		p.columnDtl1_base_unit_nm.setListListener(p);
		p.columnDtl1_base_unit_dec_place.addAllListener(p);
		p.columnDtl1_base_unit_dec_place.setListListener(p);
		p.columnDtl1_base_unit_rnd_typ.addAllListener(p);
		p.columnDtl1_base_unit_rnd_typ.setListListener(p);
		p.columnDtl1_cont_fctr_flg.addAllListener(p);
		p.columnDtl1_cont_fctr_dec_place.addAllListener(p);
		p.columnDtl1_cont_fctr_dec_place.setListListener(p);
		p.columnDtl1_cont_fctr_rnd_typ.addAllListener(p);
		p.columnDtl1_cont_fctr_rnd_typ.setListListener(p);
		p.columnDtl1_sppl_cd.addAllListener(p);
		p.columnDtl1_sppl_cd.setListListener(p);
		p.columnDtl1_sppl_nm.addAllListener(p);
		p.columnDtl1_sppl_nm.setListListener(p);
		p.columnDtl1_sppl_cntry_cd.addAllListener(p);
		p.columnDtl1_sppl_cntry_cd.setListListener(p);
		p.columnDtl1_sppl_cntry_nm.addAllListener(p);
		p.columnDtl1_sppl_cntry_nm.setListListener(p);
		p.columnDtl1_purc_amt_rnd_typ.addAllListener(p);
		p.columnDtl1_purc_amt_rnd_typ.setListListener(p);
		p.columnDtl1_purc_tax_rnd_typ.addAllListener(p);
		p.columnDtl1_purc_tax_rnd_typ.setListListener(p);
		p.columnDtl1_sppl_purc_upri_cng_flg.addAllListener(p);
		p.columnDtl1_sppl_cal_cd.addAllListener(p);
		p.columnDtl1_sppl_cal_cd.setListListener(p);
		p.columnDtl1_maker_cd.addAllListener(p);
		p.columnDtl1_maker_cd.setListListener(p);
		p.columnDtl1_maker_nm.addAllListener(p);
		p.columnDtl1_maker_nm.setListListener(p);
		p.columnDtl1_sppl_itm_cd.addAllListener(p);
		p.columnDtl1_sppl_itm_cd.setListListener(p);
		p.columnDtl1_sppl_itm_nm.addAllListener(p);
		p.columnDtl1_sppl_itm_nm.setListListener(p);
		p.columnDtl1_iv_itm_nm.addAllListener(p);
		p.columnDtl1_iv_itm_nm.setListListener(p);
		p.columnDtl1_rqst_avl_rqst_dt.addAllListener(p);
		p.columnDtl1_rqst_avl_rqst_dt.setListListener(p);
		p.columnDtl1_purc_schd_dt.addAllListener(p);
		p.columnDtl1_purc_schd_dt.setListListener(p);
		p.columnDtl1_po_schd_dt.addAllListener(p);
		p.columnDtl1_po_schd_dt.setListListener(p);
		p.Dtl1_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl1_purc_dpt_wg_cd.addAllListener(p);
		p.columnDtl1_purc_dpt_wg_cd.setListListener(p);
		p.columnDtl1_purc_dpt_wg_nm.addAllListener(p);
		p.columnDtl1_purc_dpt_wg_nm.setListListener(p);
		p.columnDtl1_purc_upri_req_typ.addAllListener(p);
		p.columnDtl1_purc_upri_req_typ.setListListener(p);
		p.columnDtl1_purc_upri_req_typ_nm.addAllListener(p);
		p.columnDtl1_purc_upri_req_typ_nm.setListListener(p);
		p.columnDtl1_trd_cur_cd.addAllListener(p);
		p.columnDtl1_trd_cur_cd.setListListener(p);
		p.columnDtl1_trd_cur_nm.addAllListener(p);
		p.columnDtl1_trd_cur_nm.setListListener(p);
		p.columnDtl1_trd_cur_amt_dec_place.addAllListener(p);
		p.columnDtl1_trd_cur_amt_dec_place.setListListener(p);
		p.columnDtl1_trd_cur_upri_dec_place.addAllListener(p);
		p.columnDtl1_trd_cur_upri_dec_place.setListListener(p);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl1_repurc_obli_flg.addAllListener(p);
		p.columnDtl1_outsrc_upri_typ.addAllListener(p);
		p.columnDtl1_outsrc_upri_typ.setListListener(p);
		p.columnDtl1_old_trd_cur_upri.addAllListener(p);
		p.columnDtl1_old_trd_cur_upri.setListListener(p);
		p.columnDtl1_old_trd_cur_proc_upri.addAllListener(p);
		p.columnDtl1_old_trd_cur_proc_upri.setListListener(p);
		p.columnDtl1_old_trd_cur_onr_prov_upri.addAllListener(p);
		p.columnDtl1_old_trd_cur_onr_prov_upri.setListListener(p);
		p.columnDtl1_old_interim_flg.addAllListener(p);
		p.columnDtl1_xrate_cd.addAllListener(p);
		p.columnDtl1_xrate_cd.setListListener(p);
		p.columnDtl1_xrate_inpt_flg.addAllListener(p);
		p.columnDtl1_base_cur_cd.addAllListener(p);
		p.columnDtl1_base_cur_cd.setListListener(p);
		p.columnDtl1_base_cur_nm.addAllListener(p);
		p.columnDtl1_base_cur_nm.setListListener(p);
		p.columnDtl1_base_cur_amt_dec_place.addAllListener(p);
		p.columnDtl1_base_cur_amt_dec_place.setListListener(p);
		p.columnDtl1_base_cur_upri_dec_place.addAllListener(p);
		p.columnDtl1_base_cur_upri_dec_place.setListListener(p);
		p.columnDtl1_ptax_xrate_inpt_flg.addAllListener(p);
		p.columnDtl1_ptax_cur_cd.addAllListener(p);
		p.columnDtl1_ptax_cur_cd.setListListener(p);
		p.columnDtl1_ptax_cur_nm.addAllListener(p);
		p.columnDtl1_ptax_cur_nm.setListListener(p);
		p.columnDtl1_ptax_cur_amt_dec_place.addAllListener(p);
		p.columnDtl1_ptax_cur_amt_dec_place.setListListener(p);
		p.columnDtl1_ptax_cur_upri_dec_place.addAllListener(p);
		p.columnDtl1_ptax_cur_upri_dec_place.setListListener(p);
		p.columnDtl1_purc_rsn_cd.addAllListener(p);
		p.columnDtl1_purc_rsn_cd.setListListener(p);
		p.columnDtl1_purc_rsn_nm.addAllListener(p);
		p.columnDtl1_purc_rsn_nm.setListListener(p);
		p.columnDtl1_xpns_purc_flg.addAllListener(p);
		p.columnDtl1_not_xpns_purc_flg.addAllListener(p);
		p.columnDtl1_intr_rmrks.addAllListener(p);
		p.columnDtl1_intr_rmrks.setListListener(p);
		p.columnDtl1_trd_d_rmrks.addAllListener(p);
		p.columnDtl1_trd_d_rmrks.setListListener(p);
		p.columnDtl1_po_cnt_rmrks.addAllListener(p);
		p.columnDtl1_po_cnt_rmrks.setListListener(p);
		p.columnDtl1_mfg_loc_cd.addAllListener(p);
		p.columnDtl1_mfg_loc_cd.setListListener(p);
		p.columnDtl1_mfg_loc_nm.addAllListener(p);
		p.columnDtl1_mfg_loc_nm.setListListener(p);
		p.columnDtl1_bom_ptn.addAllListener(p);
		p.columnDtl1_bom_ptn.setListListener(p);
		p.columnDtl1_outsrc_flg.addAllListener(p);
		p.columnDtl1_outsrc_itm_ord_no.addAllListener(p);
		p.columnDtl1_outsrc_itm_ord_no.setListListener(p);
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl1_bd_lot_mng_typ.addAllListener(p);
		p.columnDtl1_bd_lot_mng_typ.setListListener(p);
		p.columnDtl1_bd_sublot_mng_typ.addAllListener(p);
		p.columnDtl1_bd_sublot_mng_typ.setListListener(p);
		p.columnDtl1_bd_lot_no_typ.addAllListener(p);
		p.columnDtl1_bd_lot_no_typ.setListListener(p);
		p.columnDtl1_bd_sublot_no_typ.addAllListener(p);
		p.columnDtl1_bd_sublot_no_typ.setListListener(p);
		p.columnDtl1_bd_sno1_mng_typ.addAllListener(p);
		p.columnDtl1_bd_sno1_mng_typ.setListListener(p);
		p.columnDtl1_bd_sno2_mng_typ.addAllListener(p);
		p.columnDtl1_bd_sno2_mng_typ.setListListener(p);
		p.columnDtl1_bd_sno3_mng_typ.addAllListener(p);
		p.columnDtl1_bd_sno3_mng_typ.setListListener(p);
		p.columnDtl1_bd_sno4_mng_typ.addAllListener(p);
		p.columnDtl1_bd_sno4_mng_typ.setListListener(p);
		p.columnDtl1_rqst_fr_usr_cd.addAllListener(p);
		p.columnDtl1_rqst_fr_usr_cd.setListListener(p);
		p.columnDtl1_rqst_fr_usr_nm.addAllListener(p);
		p.columnDtl1_rqst_fr_usr_nm.setListListener(p);
		p.columnDtl1_rqst_fr_dpt_cd.addAllListener(p);
		p.columnDtl1_rqst_fr_dpt_cd.setListListener(p);
		p.columnDtl1_rqst_fr_dpt_nm.addAllListener(p);
		p.columnDtl1_rqst_fr_dpt_nm.setListListener(p);
		p.columnDtl1_po_schd_no.addAllListener(p);
		p.columnDtl1_po_schd_no.setListListener(p);
		p.columnDtl1_trd_ptn_typ.addAllListener(p);
		p.columnDtl1_trd_ptn_typ.setListListener(p);
		p.columnDtl1_po_schd_src_typ.addAllListener(p);
		p.columnDtl1_po_schd_src_typ.setListListener(p);
		p.columnDtl1_ins_usr_id.addAllListener(p);
		p.columnDtl1_ins_usr_id.setListListener(p);
		p.columnDtl1_ins_usr_nm.addAllListener(p);
		p.columnDtl1_ins_usr_nm.setListListener(p);
		p.columnDtl1_ins_func_id.addAllListener(p);
		p.columnDtl1_ins_func_id.setListListener(p);
		p.columnDtl1_ins_func_nm.addAllListener(p);
		p.columnDtl1_ins_func_nm.setListListener(p);
		p.columnDtl1_ins_ts.addAllListener(p);
		p.columnDtl1_ins_ts.setListListener(p);
		p.columnDtl1_upd_usr_id.addAllListener(p);
		p.columnDtl1_upd_usr_id.setListListener(p);
		p.columnDtl1_upd_usr_nm.addAllListener(p);
		p.columnDtl1_upd_usr_nm.setListListener(p);
		p.columnDtl1_upd_func_id.addAllListener(p);
		p.columnDtl1_upd_func_id.setListListener(p);
		p.columnDtl1_upd_func_nm.addAllListener(p);
		p.columnDtl1_upd_func_nm.setListListener(p);
		p.columnDtl1_upd_ts.addAllListener(p);
		p.columnDtl1_upd_ts.setListListener(p);
		p.columnDtl1_upd_srv_req_no.addAllListener(p);
		p.columnDtl1_upd_srv_req_no.setListListener(p);
		p.columnDtl1_po_schd_upd_cntr.addAllListener(p);
		p.columnDtl1_po_schd_upd_cntr.setListListener(p);
		p.columnDtl1_base_dt.addAllListener(p);
		p.columnDtl1_base_dt.setListListener(p);
	}

	/**
	 *  [Dtl2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl2(MSBDP_PoSchdSplitReg p) {
		p.Dtl2Table.addAllListener(p);
		p.columnDtl2_check.addAllListener(p);
		p.columnDtl2_abort_flg.addAllListener(p);
		p.columnDtl2_rqst_upd_stop_flg.addAllListener(p);
		p.columnDtl2_reg_dt.addAllListener(p);
		p.columnDtl2_reg_dt.setListListener(p);
		p.columnDtl2_in_to_loc_cd.addAllListener(p);
		p.columnDtl2_in_to_loc_cd.setListListener(p);
		p.columnDtl2_in_to_loc_nm.addAllListener(p);
		p.columnDtl2_in_to_loc_nm.setListListener(p);
		p.columnDtl2_in_to_loc_wg_cd.addAllListener(p);
		p.columnDtl2_in_to_loc_wg_cd.setListListener(p);
		p.columnDtl2_in_to_loc_wg_nm.addAllListener(p);
		p.columnDtl2_in_to_loc_wg_nm.setListListener(p);
		p.columnDtl2_drct_dlv_typ.addAllListener(p);
		p.columnDtl2_drct_dlv_typ.setListListener(p);
		p.columnDtl2_drct_dlv_typ_nm.addAllListener(p);
		p.columnDtl2_drct_dlv_typ_nm.setListListener(p);
		p.columnDtl2_outsrc_sppl_cd.addAllListener(p);
		p.columnDtl2_outsrc_sppl_cd.setListListener(p);
		p.columnDtl2_str_ln_tgt_flg.addAllListener(p);
		p.columnDtl2_in_to_loc_cal_cd.addAllListener(p);
		p.columnDtl2_in_to_loc_cal_cd.setListListener(p);
		p.columnDtl2_site_cd.addAllListener(p);
		p.columnDtl2_site_cd.setListListener(p);
		p.columnDtl2_lg_grp_cd.addAllListener(p);
		p.columnDtl2_lg_grp_cd.setListListener(p);
		p.columnDtl2_str_ln_cd.addAllListener(p);
		p.columnDtl2_str_ln_cd.setListListener(p);
		p.columnDtl2_str_ln_nm.addAllListener(p);
		p.columnDtl2_str_ln_nm.setListListener(p);
		p.columnDtl2_str_ln_cd_none_flg.addAllListener(p);
		p.columnDtl2_rqst_avl_rqst_dt.addAllListener(p);
		p.columnDtl2_rqst_avl_rqst_dt.setListListener(p);
		p.columnDtl2_sundry_itm_flg.addAllListener(p);
		p.columnDtl2_ver_flg.addAllListener(p);
		p.columnDtl2_asset_mng_typ.addAllListener(p);
		p.columnDtl2_asset_mng_typ.setListListener(p);
		p.columnDtl2_dscnt_itm_flg.addAllListener(p);
		p.columnDtl2_itm_purc_upri_cng_flg.addAllListener(p);
		p.Dtl2_ver_no_p_PPanel.columnVerNo_ver_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl2_trd_unit_cd.addAllListener(p);
		p.columnDtl2_trd_unit_cd.setListListener(p);
		p.columnDtl2_trd_unit_nm.addAllListener(p);
		p.columnDtl2_trd_unit_nm.setListListener(p);
		p.columnDtl2_trd_unit_dec_place.addAllListener(p);
		p.columnDtl2_trd_unit_dec_place.setListListener(p);
		p.columnDtl2_trd_unit_rnd_typ.addAllListener(p);
		p.columnDtl2_trd_unit_rnd_typ.setListListener(p);
		p.columnDtl2_trd_unit_conv_base_qty.addAllListener(p);
		p.columnDtl2_trd_unit_conv_base_qty.setListListener(p);
		p.columnDtl2_trd_unit_conv_qty.addAllListener(p);
		p.columnDtl2_trd_unit_conv_qty.setListListener(p);
		p.columnDtl2_base_unit_cd.addAllListener(p);
		p.columnDtl2_base_unit_cd.setListListener(p);
		p.columnDtl2_base_unit_nm.addAllListener(p);
		p.columnDtl2_base_unit_nm.setListListener(p);
		p.columnDtl2_base_unit_dec_place.addAllListener(p);
		p.columnDtl2_base_unit_dec_place.setListListener(p);
		p.columnDtl2_base_unit_rnd_typ.addAllListener(p);
		p.columnDtl2_base_unit_rnd_typ.setListListener(p);
		p.columnDtl2_cont_fctr_flg.addAllListener(p);
		p.columnDtl2_cont_fctr_dec_place.addAllListener(p);
		p.columnDtl2_cont_fctr_dec_place.setListListener(p);
		p.columnDtl2_cont_fctr_rnd_typ.addAllListener(p);
		p.columnDtl2_cont_fctr_rnd_typ.setListListener(p);
		p.columnDtl2_sppl_cd.addAllListener(p);
		p.columnDtl2_sppl_cd.setListListener(p);
		p.columnDtl2_sppl_nm.addAllListener(p);
		p.columnDtl2_sppl_nm.setListListener(p);
		p.columnDtl2_sppl_cntry_cd.addAllListener(p);
		p.columnDtl2_sppl_cntry_cd.setListListener(p);
		p.columnDtl2_sppl_cntry_nm.addAllListener(p);
		p.columnDtl2_sppl_cntry_nm.setListListener(p);
		p.columnDtl2_purc_amt_rnd_typ.addAllListener(p);
		p.columnDtl2_purc_amt_rnd_typ.setListListener(p);
		p.columnDtl2_purc_tax_rnd_typ.addAllListener(p);
		p.columnDtl2_purc_tax_rnd_typ.setListListener(p);
		p.columnDtl2_sppl_purc_upri_cng_flg.addAllListener(p);
		p.columnDtl2_sppl_cal_cd.addAllListener(p);
		p.columnDtl2_sppl_cal_cd.setListListener(p);
		p.columnDtl2_maker_cd.addAllListener(p);
		p.columnDtl2_maker_cd.setListListener(p);
		p.columnDtl2_maker_nm.addAllListener(p);
		p.columnDtl2_maker_nm.setListListener(p);
		p.columnDtl2_sppl_itm_cd.addAllListener(p);
		p.columnDtl2_sppl_itm_cd.setListListener(p);
		p.columnDtl2_sppl_itm_nm.addAllListener(p);
		p.columnDtl2_sppl_itm_nm.setListListener(p);
		p.columnDtl2_iv_itm_nm.addAllListener(p);
		p.columnDtl2_iv_itm_nm.setListListener(p);
		p.columnDtl2_purc_schd_dt.addAllListener(p);
		p.columnDtl2_purc_schd_dt.setListListener(p);
		p.columnDtl2_po_schd_dt.addAllListener(p);
		p.columnDtl2_po_schd_dt.setListListener(p);
		p.Dtl2_usr_dpt_p_PPanel.columnUsrDpt_usr_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl2_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl2_purc_dpt_wg_cd.addAllListener(p);
		p.columnDtl2_purc_dpt_wg_cd.setListListener(p);
		p.columnDtl2_purc_dpt_wg_nm.addAllListener(p);
		p.columnDtl2_purc_dpt_wg_nm.setListListener(p);
		p.columnDtl2_purc_upri_req_typ.addAllListener(p);
		p.columnDtl2_purc_upri_req_typ.setListListener(p);
		p.columnDtl2_purc_upri_req_typ_nm.addAllListener(p);
		p.columnDtl2_purc_upri_req_typ_nm.setListListener(p);
		p.columnDtl2_trd_cur_cd.addAllListener(p);
		p.columnDtl2_trd_cur_cd.setListListener(p);
		p.columnDtl2_trd_cur_nm.addAllListener(p);
		p.columnDtl2_trd_cur_nm.setListListener(p);
		p.columnDtl2_trd_cur_amt_dec_place.addAllListener(p);
		p.columnDtl2_trd_cur_amt_dec_place.setListListener(p);
		p.columnDtl2_trd_cur_upri_dec_place.addAllListener(p);
		p.columnDtl2_trd_cur_upri_dec_place.setListListener(p);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl2_repurc_obli_flg.addAllListener(p);
		p.columnDtl2_outsrc_upri_typ.addAllListener(p);
		p.columnDtl2_outsrc_upri_typ.setListListener(p);
		p.columnDtl2_old_trd_cur_upri.addAllListener(p);
		p.columnDtl2_old_trd_cur_upri.setListListener(p);
		p.columnDtl2_old_trd_cur_proc_upri.addAllListener(p);
		p.columnDtl2_old_trd_cur_proc_upri.setListListener(p);
		p.columnDtl2_old_trd_cur_onr_prov_upri.addAllListener(p);
		p.columnDtl2_old_trd_cur_onr_prov_upri.setListListener(p);
		p.columnDtl2_old_interim_flg.addAllListener(p);
		p.columnDtl2_xrate_cd.addAllListener(p);
		p.columnDtl2_xrate_cd.setListListener(p);
		p.columnDtl2_xrate_inpt_flg.addAllListener(p);
		p.columnDtl2_base_cur_cd.addAllListener(p);
		p.columnDtl2_base_cur_cd.setListListener(p);
		p.columnDtl2_base_cur_nm.addAllListener(p);
		p.columnDtl2_base_cur_nm.setListListener(p);
		p.columnDtl2_base_cur_amt_dec_place.addAllListener(p);
		p.columnDtl2_base_cur_amt_dec_place.setListListener(p);
		p.columnDtl2_base_cur_upri_dec_place.addAllListener(p);
		p.columnDtl2_base_cur_upri_dec_place.setListListener(p);
		p.columnDtl2_ptax_xrate_inpt_flg.addAllListener(p);
		p.columnDtl2_ptax_cur_cd.addAllListener(p);
		p.columnDtl2_ptax_cur_cd.setListListener(p);
		p.columnDtl2_ptax_cur_nm.addAllListener(p);
		p.columnDtl2_ptax_cur_nm.setListListener(p);
		p.columnDtl2_ptax_cur_amt_dec_place.addAllListener(p);
		p.columnDtl2_ptax_cur_amt_dec_place.setListListener(p);
		p.columnDtl2_ptax_cur_upri_dec_place.addAllListener(p);
		p.columnDtl2_ptax_cur_upri_dec_place.setListListener(p);
		p.columnDtl2_purc_rsn_cd.addAllListener(p);
		p.columnDtl2_purc_rsn_cd.setListListener(p);
		p.columnDtl2_purc_rsn_nm.addAllListener(p);
		p.columnDtl2_purc_rsn_nm.setListListener(p);
		p.columnDtl2_xpns_purc_flg.addAllListener(p);
		p.columnDtl2_not_xpns_purc_flg.addAllListener(p);
		p.columnDtl2_intr_rmrks.addAllListener(p);
		p.columnDtl2_intr_rmrks.setListListener(p);
		p.columnDtl2_trd_d_rmrks.addAllListener(p);
		p.columnDtl2_trd_d_rmrks.setListListener(p);
		p.columnDtl2_po_cnt_rmrks.addAllListener(p);
		p.columnDtl2_po_cnt_rmrks.setListListener(p);
		p.columnDtl2_mfg_loc_cd.addAllListener(p);
		p.columnDtl2_mfg_loc_cd.setListListener(p);
		p.columnDtl2_mfg_loc_nm.addAllListener(p);
		p.columnDtl2_mfg_loc_nm.setListListener(p);
		p.columnDtl2_bom_ptn.addAllListener(p);
		p.columnDtl2_bom_ptn.setListListener(p);
		p.columnDtl2_outsrc_flg.addAllListener(p);
		p.columnDtl2_outsrc_itm_ord_no.addAllListener(p);
		p.columnDtl2_outsrc_itm_ord_no.setListListener(p);
		p.Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl2_bd_lot_mng_typ.addAllListener(p);
		p.columnDtl2_bd_lot_mng_typ.setListListener(p);
		p.columnDtl2_bd_sublot_mng_typ.addAllListener(p);
		p.columnDtl2_bd_sublot_mng_typ.setListListener(p);
		p.columnDtl2_bd_lot_no_typ.addAllListener(p);
		p.columnDtl2_bd_lot_no_typ.setListListener(p);
		p.columnDtl2_bd_sublot_no_typ.addAllListener(p);
		p.columnDtl2_bd_sublot_no_typ.setListListener(p);
		p.columnDtl2_bd_sno1_mng_typ.addAllListener(p);
		p.columnDtl2_bd_sno1_mng_typ.setListListener(p);
		p.columnDtl2_bd_sno2_mng_typ.addAllListener(p);
		p.columnDtl2_bd_sno2_mng_typ.setListListener(p);
		p.columnDtl2_bd_sno3_mng_typ.addAllListener(p);
		p.columnDtl2_bd_sno3_mng_typ.setListListener(p);
		p.columnDtl2_bd_sno4_mng_typ.addAllListener(p);
		p.columnDtl2_bd_sno4_mng_typ.setListListener(p);
		p.columnDtl2_rqst_fr_usr_cd.addAllListener(p);
		p.columnDtl2_rqst_fr_usr_cd.setListListener(p);
		p.columnDtl2_rqst_fr_usr_nm.addAllListener(p);
		p.columnDtl2_rqst_fr_usr_nm.setListListener(p);
		p.columnDtl2_rqst_fr_dpt_cd.addAllListener(p);
		p.columnDtl2_rqst_fr_dpt_cd.setListListener(p);
		p.columnDtl2_rqst_fr_dpt_nm.addAllListener(p);
		p.columnDtl2_rqst_fr_dpt_nm.setListListener(p);
		p.columnDtl2_po_schd_no.addAllListener(p);
		p.columnDtl2_po_schd_no.setListListener(p);
		p.columnDtl2_trd_ptn_typ.addAllListener(p);
		p.columnDtl2_trd_ptn_typ.setListListener(p);
		p.columnDtl2_po_schd_src_typ.addAllListener(p);
		p.columnDtl2_po_schd_src_typ.setListListener(p);
		p.columnDtl2_ins_usr_id.addAllListener(p);
		p.columnDtl2_ins_usr_id.setListListener(p);
		p.columnDtl2_ins_usr_nm.addAllListener(p);
		p.columnDtl2_ins_usr_nm.setListListener(p);
		p.columnDtl2_ins_func_id.addAllListener(p);
		p.columnDtl2_ins_func_id.setListListener(p);
		p.columnDtl2_ins_func_nm.addAllListener(p);
		p.columnDtl2_ins_func_nm.setListListener(p);
		p.columnDtl2_ins_ts.addAllListener(p);
		p.columnDtl2_ins_ts.setListListener(p);
		p.columnDtl2_upd_usr_id.addAllListener(p);
		p.columnDtl2_upd_usr_id.setListListener(p);
		p.columnDtl2_upd_usr_nm.addAllListener(p);
		p.columnDtl2_upd_usr_nm.setListListener(p);
		p.columnDtl2_upd_func_id.addAllListener(p);
		p.columnDtl2_upd_func_id.setListListener(p);
		p.columnDtl2_upd_func_nm.addAllListener(p);
		p.columnDtl2_upd_func_nm.setListListener(p);
		p.columnDtl2_upd_ts.addAllListener(p);
		p.columnDtl2_upd_ts.setListListener(p);
		p.columnDtl2_upd_srv_req_no.addAllListener(p);
		p.columnDtl2_upd_srv_req_no.setListListener(p);
		p.columnDtl2_po_schd_upd_cntr.addAllListener(p);
		p.columnDtl2_po_schd_upd_cntr.setListListener(p);
		p.columnDtl2_base_dt.addAllListener(p);
		p.columnDtl2_base_dt.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBDP_PoSchdSplitReg p) {
		p.Btn_mstr_replace.addAllListener(p);
		p.Btn_mstr_replace.setAPMethodName("doBtn_mstr_replace");
		p.Btn_upri_replace.addAllListener(p);
		p.Btn_upri_replace.setAPMethodName("doBtn_upri_replace");
		p.Btn_radd.addAllListener(p);
		p.Btn_radd.setAPMethodName("doBtn_radd");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_ins.addAllListener(p);
		p.Btn_ins.setAPMethodName("doBtn_ins");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBDP_PoSchdSplitReg p) {
	}

	/**
	 * [SRCH_SPLIT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPLIT_ScreenOpe(MSBDP_PoSchdSplitReg p){

	}

	/**
	 * [SRCH_SPLIT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPLIT_Cnd(MSBDP_PoSchdSplitReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_SPLIT, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, SRCH_SPLIT, MCMode.REQUIRED);
		p.Cnd_srch01.putMode(p, SRCH_SPLIT, MCMode.ENABLE);
		p.Cnd_srch02.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_SPLIT]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPLIT_Dtl1(MSBDP_PoSchdSplitReg p){
		p.columnDtl1_check.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_abort_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_rqst_upd_stop_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_reg_dt.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_wg_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_wg_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_drct_dlv_typ.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_drct_dlv_typ_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_sppl_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_str_ln_tgt_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_in_to_loc_cal_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_site_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_lg_grp_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl1_dlv_rqst_tm_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_sundry_itm_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_str_ln_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_str_ln_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_str_ln_cd_none_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_ver_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_asset_mng_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_dscnt_itm_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_itm_purc_upri_cng_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl1_ver_no_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl1_trd_unit_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_rnd_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_conv_base_qty.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_conv_qty.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_qty_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl1_base_unit_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_base_unit_rnd_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl1_base_unit_qty_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl1_inst_cont_qty_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl1_cont_fctr_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_rnd_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl1_cont_unit_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl1_std_cont_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl1_sppl_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_sppl_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_sppl_cntry_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_sppl_cntry_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_purc_amt_rnd_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_purc_tax_rnd_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_sppl_purc_upri_cng_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_sppl_cal_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_maker_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_maker_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_iv_itm_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_rqst_avl_rqst_dt.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl1_rqst_dlv_rqst_tm_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl1_purc_schd_dt.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_po_schd_dt.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl1_usr_dpt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl1_purc_dpt_wg_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_purc_dpt_wg_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_purc_upri_req_typ.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_purc_upri_req_typ_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_trd_cur_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_trd_cur_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_trd_cur_amt_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_trd_cur_upri_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_repurc_obli_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_upri_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_old_trd_cur_upri.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_old_trd_cur_proc_upri.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_old_trd_cur_onr_prov_upri.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_old_interim_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_xrate_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_xrate_inpt_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl1_xrate_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl1_base_cur_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_base_cur_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_base_cur_amt_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_base_cur_upri_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl1_base_cur_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_tax_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl1_base_cur_proc_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_proc_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl1_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_ptax_xrate_inpt_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl1_ptax_xrate_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl1_ptax_cur_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_ptax_cur_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_ptax_cur_amt_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_ptax_cur_upri_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl1_ptax_cur_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl1_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl1_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl1_sno_wrk_no_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl1_purc_rsn_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_purc_rsn_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_xpns_purc_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_not_xpns_purc_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_intr_rmrks.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_trd_d_rmrks.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_po_cnt_rmrks.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_mfg_loc_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_mfg_loc_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_bom_ptn.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_itm_ord_no.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl1_bditm_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl1_bd_lot_mng_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_mng_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_bd_lot_no_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_no_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno1_mng_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno2_mng_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno3_mng_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno4_mng_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_rqst_fr_usr_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_rqst_fr_usr_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_rqst_fr_dpt_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_rqst_fr_dpt_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_po_schd_no.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_trd_ptn_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_po_schd_src_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_ins_usr_id.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_id.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_ins_ts.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_id.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_id.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_upd_ts.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_upd_srv_req_no.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl1_po_schd_upd_cntr.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl1_base_dt.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_SPLIT]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPLIT_Dtl2(MSBDP_PoSchdSplitReg p){
		p.columnDtl2_check.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_abort_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_rqst_upd_stop_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_reg_dt.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_wg_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_wg_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_drct_dlv_typ.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_drct_dlv_typ_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_sppl_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_str_ln_tgt_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_in_to_loc_cal_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_site_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_lg_grp_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_str_ln_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_str_ln_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_str_ln_cd_none_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_rqst_avl_rqst_dt.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl2_itm_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl2_sundry_itm_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_ver_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_asset_mng_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_dscnt_itm_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_itm_purc_upri_cng_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl2_ver_no_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl2_trd_unit_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_rnd_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_conv_base_qty.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_conv_qty.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl2_trd_unit_qty_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl2_base_unit_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_base_unit_rnd_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl2_base_unit_qty_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl2_inst_cont_qty_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl2_cont_fctr_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_cont_fctr_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_cont_fctr_rnd_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl2_cont_unit_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl2_std_cont_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl2_sppl_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_sppl_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_sppl_cntry_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_sppl_cntry_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_purc_amt_rnd_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_purc_tax_rnd_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_sppl_purc_upri_cng_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_sppl_cal_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_maker_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_maker_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_sppl_itm_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_sppl_itm_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_iv_itm_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl2_dlv_rqst_tm_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl2_rqst_dlv_rqst_tm_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl2_purc_schd_dt.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_po_schd_dt.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl2_usr_dpt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl2_purc_dpt_wg_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_purc_dpt_wg_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_purc_upri_req_typ.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_purc_upri_req_typ_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_trd_cur_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_trd_cur_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_trd_cur_amt_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_trd_cur_upri_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_inc_tax_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_repurc_obli_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_upri_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_trd_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_trd_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_old_trd_cur_upri.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_old_trd_cur_proc_upri.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_old_trd_cur_onr_prov_upri.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_old_interim_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_xrate_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_xrate_inpt_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl2_xrate_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl2_base_cur_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_base_cur_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_base_cur_amt_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_base_cur_upri_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl2_base_cur_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_base_cur_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_tax_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl2_base_cur_proc_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_base_cur_proc_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl2_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_ptax_xrate_inpt_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl2_ptax_xrate_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl2_ptax_cur_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_ptax_cur_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_ptax_cur_amt_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_ptax_cur_upri_dec_place.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl2_ptax_cur_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_ptax_cur_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.Dtl2_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_ptax_cur_proc_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl2_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_ptax_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl2_sno_wrk_no_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl2_purc_rsn_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_purc_rsn_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_xpns_purc_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_not_xpns_purc_flg.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_intr_rmrks.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_trd_d_rmrks.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_po_cnt_rmrks.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_mfg_loc_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_mfg_loc_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_bom_ptn.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_flg.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_itm_ord_no.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl2_bditm_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl2_bd_lot_mng_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_bd_sublot_mng_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_bd_lot_no_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_bd_sublot_no_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno1_mng_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno2_mng_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno3_mng_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno4_mng_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl2_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.Dtl2_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_rqst_fr_usr_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_rqst_fr_usr_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_rqst_fr_dpt_cd.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_rqst_fr_dpt_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_po_schd_no.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_trd_ptn_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_src_typ.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_ins_usr_id.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, SRCH_SPLIT, MCMode.READ_ONLY);
		p.columnDtl2_po_schd_upd_cntr.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);
		p.columnDtl2_base_dt.putMode(p, SRCH_SPLIT, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_SPLIT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPLIT_Btn(MSBDP_PoSchdSplitReg p){
		p.Btn_mstr_replace.putMode(p, SRCH_SPLIT, MCMode.DISABLE);
		p.Btn_upri_replace.putMode(p, SRCH_SPLIT, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_SPLIT, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_SPLIT, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_SPLIT, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH_SPLIT, MCMode.DISABLE);
		p.Btn_sync_p_PPanel.putStatus(SRCH_SPLIT, mcframe.clientFSBA.FSBAP0020.FSBAP0020.INIT);
		p.Btn_del.putMode(p, SRCH_SPLIT, MCMode.DISABLE);

	}

	/**
	 * [SRCH_SPLIT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPLIT_EastBtn(MSBDP_PoSchdSplitReg p){

	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBDP_PoSchdSplitReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBDP_PoSchdSplitReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_srch01.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_srch02.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl1(MSBDP_PoSchdSplitReg p){
		p.columnDtl1_check.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_abort_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_rqst_upd_stop_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_reg_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_drct_dlv_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_drct_dlv_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_sppl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_str_ln_tgt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_in_to_loc_cal_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_site_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_dlv_rqst_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_sundry_itm_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_str_ln_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_str_ln_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_str_ln_cd_none_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_ver_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_asset_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_dscnt_itm_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_itm_purc_upri_cng_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_ver_no_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl1_trd_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_conv_base_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl1_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_base_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl1_inst_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl1_cont_fctr_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_cont_unit_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl1_std_cont_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl1_sppl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_sppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_sppl_cntry_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_sppl_cntry_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_purc_amt_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_purc_tax_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_sppl_purc_upri_cng_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_sppl_cal_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_maker_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_maker_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_iv_itm_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_rqst_avl_rqst_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl1_rqst_dlv_rqst_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl1_purc_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_po_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl1_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl1_purc_dpt_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_purc_dpt_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_purc_upri_req_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_purc_upri_req_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_trd_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_trd_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_trd_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_trd_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_repurc_obli_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_upri_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_proc_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_old_trd_cur_upri.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_old_trd_cur_proc_upri.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_old_trd_cur_onr_prov_upri.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_old_interim_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_xrate_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_xrate_inpt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl1_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl1_base_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_base_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_base_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_base_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_base_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl1_base_cur_proc_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_proc_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_base_cur_onr_prov_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_ptax_xrate_inpt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl1_ptax_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl1_ptax_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_ptax_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_ptax_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_ptax_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_ptax_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl1_ptax_cur_proc_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_ptax_cur_onr_prov_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_sno_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl1_purc_rsn_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_purc_rsn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_xpns_purc_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_not_xpns_purc_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_intr_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_trd_d_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_po_cnt_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_mfg_loc_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_mfg_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_bom_ptn.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_itm_ord_no.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_bditm_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl1_bd_lot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_bd_lot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno1_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno2_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno3_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno4_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_rqst_fr_usr_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_rqst_fr_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_rqst_fr_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_rqst_fr_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_po_schd_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_trd_ptn_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_po_schd_src_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_ins_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_ins_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_upd_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_upd_srv_req_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_po_schd_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_base_dt.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl2(MSBDP_PoSchdSplitReg p){
		p.columnDtl2_check.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl2_abort_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_rqst_upd_stop_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_reg_dt.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl2_in_to_loc_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_drct_dlv_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_drct_dlv_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_sppl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_str_ln_tgt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_in_to_loc_cal_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_site_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_str_ln_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_str_ln_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_str_ln_cd_none_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_rqst_avl_rqst_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Dtl2_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl2_sundry_itm_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_ver_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_asset_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_dscnt_itm_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_itm_purc_upri_cng_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_ver_no_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.REQUIRED);
		p.columnDtl2_trd_unit_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl2_trd_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_conv_base_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_trd_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl2_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_base_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl2_inst_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl2_cont_fctr_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_cont_fctr_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_cont_fctr_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_cont_unit_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl2_std_cont_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl2_sppl_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl2_sppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_sppl_cntry_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_sppl_cntry_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_purc_amt_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_purc_tax_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_sppl_purc_upri_cng_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_sppl_cal_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_maker_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl2_maker_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_sppl_itm_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl2_sppl_itm_nm.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl2_iv_itm_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl2_dlv_rqst_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.Dtl2_rqst_dlv_rqst_tm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl2_purc_schd_dt.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl2_po_schd_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Dtl2_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.ENABLE);
		p.Dtl2_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl2_purc_dpt_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_purc_dpt_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_purc_upri_req_typ.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl2_purc_upri_req_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_trd_cur_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl2_trd_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_trd_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_trd_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.ENABLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_inc_tax_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_repurc_obli_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_upri_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_proc_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl2_trd_cur_proc_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_trd_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_onr_prov_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl2_trd_cur_onr_prov_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_trd_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_old_trd_cur_upri.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_old_trd_cur_proc_upri.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_old_trd_cur_onr_prov_upri.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_old_interim_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_xrate_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_xrate_inpt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Dtl2_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.ENABLE);
		p.columnDtl2_base_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_base_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_base_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_base_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_base_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_base_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl2_base_cur_proc_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_base_cur_proc_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_base_cur_onr_prov_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_base_cur_onr_prov_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_ptax_xrate_inpt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Dtl2_ptax_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.ENABLE);
		p.columnDtl2_ptax_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_ptax_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_ptax_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_ptax_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_ptax_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_ptax_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl2_ptax_cur_proc_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_ptax_cur_proc_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_ptax_cur_onr_prov_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_ptax_cur_onr_prov_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_sno_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl2_purc_rsn_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl2_purc_rsn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_xpns_purc_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_not_xpns_purc_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl2_trd_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl2_po_cnt_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl2_mfg_loc_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl2_mfg_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_bom_ptn.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl2_outsrc_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_itm_ord_no.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_bditm_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.ENABLE);
		p.columnDtl2_bd_lot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_bd_sublot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_bd_lot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_bd_sublot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno1_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno2_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno3_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno4_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_rqst_fr_usr_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_rqst_fr_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_rqst_fr_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_rqst_fr_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_po_schd_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_trd_ptn_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_src_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_ins_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_po_schd_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_base_dt.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBDP_PoSchdSplitReg p){
		p.Btn_mstr_replace.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upri_replace.putMode(p, INS, MCMode.ENABLE);
		p.Btn_radd.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, INS, MCMode.DISABLE);
		p.Btn_ins.putMode(p, INS, MCMode.ENABLE);
		p.Btn_sync_p_PPanel.putStatus(INS, mcframe.clientFSBA.FSBAP0020.FSBAP0020.INIT);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBDP_PoSchdSplitReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MSBDP_PoSchdSplitReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MSBDP_PoSchdSplitReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_srch_tgt_no.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_srch01.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Cnd_srch02.putMode(p, SRCH_DEL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Dtl1(MSBDP_PoSchdSplitReg p){
		p.columnDtl1_check.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_abort_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_rqst_upd_stop_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_reg_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_drct_dlv_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_drct_dlv_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_sppl_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_str_ln_tgt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_in_to_loc_cal_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_site_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl1_dlv_rqst_tm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_sundry_itm_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_str_ln_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_str_ln_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_str_ln_cd_none_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_ver_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_asset_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_dscnt_itm_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_itm_purc_upri_cng_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl1_ver_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl1_trd_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_conv_base_qty.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_conv_qty.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl1_base_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_base_unit_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl1_base_unit_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl1_inst_cont_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl1_cont_fctr_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl1_cont_unit_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl1_std_cont_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl1_sppl_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_sppl_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_sppl_cntry_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_sppl_cntry_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_purc_amt_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_purc_tax_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_sppl_purc_upri_cng_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_sppl_cal_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_maker_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_maker_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_iv_itm_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_rqst_avl_rqst_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl1_rqst_dlv_rqst_tm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl1_purc_schd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_po_schd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl1_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl1_purc_dpt_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_purc_dpt_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_purc_upri_req_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_purc_upri_req_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_trd_cur_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_trd_cur_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_trd_cur_amt_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_trd_cur_upri_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_repurc_obli_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_upri_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_old_trd_cur_upri.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_old_trd_cur_proc_upri.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_old_trd_cur_onr_prov_upri.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_old_interim_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_xrate_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_xrate_inpt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl1_xrate_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl1_base_cur_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_base_cur_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_base_cur_amt_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_base_cur_upri_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl1_base_cur_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_tax_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl1_base_cur_proc_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_proc_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl1_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_ptax_xrate_inpt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl1_ptax_xrate_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl1_ptax_cur_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_ptax_cur_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_ptax_cur_amt_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_ptax_cur_upri_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl1_ptax_cur_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl1_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl1_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl1_sno_wrk_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl1_purc_rsn_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_purc_rsn_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_xpns_purc_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_not_xpns_purc_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_intr_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_trd_d_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_po_cnt_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_mfg_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_mfg_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_bom_ptn.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_itm_ord_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl1_bditm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl1_bd_lot_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_bd_lot_no_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_no_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno1_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno2_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno3_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno4_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_rqst_fr_usr_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_rqst_fr_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_rqst_fr_dpt_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_rqst_fr_dpt_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_po_schd_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_trd_ptn_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_po_schd_src_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_ins_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_ins_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_upd_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_upd_srv_req_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl1_po_schd_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl1_base_dt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Dtl2(MSBDP_PoSchdSplitReg p){
		p.columnDtl2_check.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_abort_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_rqst_upd_stop_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_reg_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_drct_dlv_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_drct_dlv_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_sppl_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_str_ln_tgt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_in_to_loc_cal_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_site_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_str_ln_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_str_ln_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_str_ln_cd_none_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_rqst_avl_rqst_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl2_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl2_sundry_itm_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_ver_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_asset_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_dscnt_itm_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_itm_purc_upri_cng_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl2_ver_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl2_trd_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_conv_base_qty.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_conv_qty.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl2_trd_unit_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl2_base_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_base_unit_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl2_base_unit_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl2_inst_cont_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl2_cont_fctr_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_cont_fctr_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_cont_fctr_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl2_cont_unit_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl2_std_cont_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl2_sppl_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_sppl_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_sppl_cntry_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_sppl_cntry_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_purc_amt_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_purc_tax_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_sppl_purc_upri_cng_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_sppl_cal_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_maker_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_maker_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_sppl_itm_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_sppl_itm_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_iv_itm_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl2_dlv_rqst_tm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl2_rqst_dlv_rqst_tm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl2_purc_schd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_po_schd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl2_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl2_purc_dpt_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_purc_dpt_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_purc_upri_req_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_purc_upri_req_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_trd_cur_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_trd_cur_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_trd_cur_amt_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_trd_cur_upri_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_inc_tax_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_repurc_obli_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_upri_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_trd_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_trd_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_old_trd_cur_upri.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_old_trd_cur_proc_upri.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_old_trd_cur_onr_prov_upri.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_old_interim_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_xrate_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_xrate_inpt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl2_xrate_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl2_base_cur_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_base_cur_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_base_cur_amt_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_base_cur_upri_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl2_base_cur_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_base_cur_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_tax_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl2_base_cur_proc_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_base_cur_proc_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl2_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_ptax_xrate_inpt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl2_ptax_xrate_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl2_ptax_cur_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_ptax_cur_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_ptax_cur_amt_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_ptax_cur_upri_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl2_ptax_cur_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_ptax_cur_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Dtl2_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_ptax_cur_proc_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl2_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_ptax_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl2_sno_wrk_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl2_purc_rsn_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_purc_rsn_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_xpns_purc_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_not_xpns_purc_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_intr_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_trd_d_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_po_cnt_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_mfg_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_mfg_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_bom_ptn.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_itm_ord_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl2_bditm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl2_bd_lot_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_bd_sublot_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_bd_lot_no_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_bd_sublot_no_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno1_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno2_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno3_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno4_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl2_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Dtl2_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_rqst_fr_usr_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_rqst_fr_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_rqst_fr_dpt_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_rqst_fr_dpt_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_po_schd_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_trd_ptn_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_src_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_ins_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnDtl2_po_schd_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnDtl2_base_dt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MSBDP_PoSchdSplitReg p){
		p.Btn_mstr_replace.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upri_replace.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_sync_p_PPanel.putStatus(SRCH_DEL, mcframe.clientFSBA.FSBAP0020.FSBAP0020.INIT);
		p.Btn_del.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MSBDP_PoSchdSplitReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBDP_PoSchdSplitReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBDP_PoSchdSplitReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch_tgt_no.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch01.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_srch02.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl1(MSBDP_PoSchdSplitReg p){
		p.columnDtl1_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_abort_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_rqst_upd_stop_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_reg_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_drct_dlv_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_drct_dlv_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_sppl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_str_ln_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_in_to_loc_cal_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_site_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_dlv_rqst_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_sundry_itm_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_str_ln_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_str_ln_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_str_ln_cd_none_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ver_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_asset_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_dscnt_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_itm_purc_upri_cng_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl1_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl1_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl1_inst_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl1_cont_fctr_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_cont_unit_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl1_std_cont_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl1_sppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_sppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_sppl_cntry_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_sppl_cntry_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_purc_amt_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_purc_tax_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_sppl_purc_upri_cng_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_sppl_cal_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_maker_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_maker_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_iv_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_rqst_avl_rqst_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl1_rqst_dlv_rqst_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl1_purc_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_po_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl1_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl1_purc_dpt_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_purc_dpt_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_purc_upri_req_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_purc_upri_req_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_trd_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_trd_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_trd_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_trd_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_repurc_obli_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_upri_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_proc_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_old_trd_cur_upri.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_old_trd_cur_proc_upri.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_old_trd_cur_onr_prov_upri.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_old_interim_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_xrate_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_xrate_inpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl1_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl1_base_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_base_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_base_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_base_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_base_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl1_base_cur_proc_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_proc_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_base_cur_onr_prov_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_ptax_xrate_inpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl1_ptax_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl1_ptax_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ptax_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ptax_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_ptax_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_ptax_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl1_ptax_cur_proc_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_ptax_cur_onr_prov_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl1_purc_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_purc_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_xpns_purc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_not_xpns_purc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_trd_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_po_cnt_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_mfg_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_mfg_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_bom_ptn.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_itm_ord_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_bditm_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl1_bd_lot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_bd_lot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_rqst_fr_usr_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_rqst_fr_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_rqst_fr_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_rqst_fr_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_po_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_trd_ptn_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_po_schd_src_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_po_schd_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_base_dt.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl2(MSBDP_PoSchdSplitReg p){
		p.columnDtl2_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_abort_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_rqst_upd_stop_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_reg_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_drct_dlv_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_drct_dlv_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_sppl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_str_ln_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_in_to_loc_cal_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_site_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_str_ln_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_str_ln_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_str_ln_cd_none_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_rqst_avl_rqst_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl2_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl2_sundry_itm_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ver_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_asset_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_dscnt_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_itm_purc_upri_cng_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl2_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl2_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl2_inst_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl2_cont_fctr_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_cont_fctr_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_cont_fctr_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_cont_unit_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl2_std_cont_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl2_sppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_sppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_sppl_cntry_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_sppl_cntry_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_purc_amt_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_purc_tax_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_sppl_purc_upri_cng_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_sppl_cal_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_maker_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_maker_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_sppl_itm_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_sppl_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_iv_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl2_dlv_rqst_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl2_rqst_dlv_rqst_tm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl2_purc_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_po_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl2_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl2_purc_dpt_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_purc_dpt_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_purc_upri_req_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_purc_upri_req_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_trd_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_trd_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_trd_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_trd_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_inc_tax_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_repurc_obli_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_upri_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_proc_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_trd_cur_proc_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_trd_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_onr_prov_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_trd_cur_onr_prov_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_trd_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_old_trd_cur_upri.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_old_trd_cur_proc_upri.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_old_trd_cur_onr_prov_upri.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_old_interim_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_xrate_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_xrate_inpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl2_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl2_base_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_base_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_base_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_base_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_base_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_base_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl2_base_cur_proc_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_base_cur_proc_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_base_cur_onr_prov_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_base_cur_onr_prov_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_ptax_xrate_inpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl2_ptax_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl2_ptax_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ptax_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ptax_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_ptax_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_ptax_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_ptax_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl2_ptax_cur_proc_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_ptax_cur_proc_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_ptax_cur_onr_prov_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_ptax_cur_onr_prov_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl2_purc_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_purc_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_xpns_purc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_not_xpns_purc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_trd_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_po_cnt_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_mfg_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_mfg_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_bom_ptn.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_itm_ord_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_bditm_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl2_bd_lot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_bd_sublot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_bd_lot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_bd_sublot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_rqst_fr_usr_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_rqst_fr_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_rqst_fr_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_rqst_fr_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_po_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_trd_ptn_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_src_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_po_schd_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_base_dt.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBDP_PoSchdSplitReg p){
		p.Btn_mstr_replace.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upri_replace.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_ins.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_sync_p_PPanel.putStatus(DEL, mcframe.clientFSBA.FSBAP0020.FSBAP0020.INIT);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBDP_PoSchdSplitReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ScreenOpe(MSBDP_PoSchdSplitReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd(MSBDP_PoSchdSplitReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_srch_tgt_no.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_srch01.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Cnd_srch02.putMode(p, SRCH_REF, MCMode.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Dtl1(MSBDP_PoSchdSplitReg p){
		p.columnDtl1_check.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_abort_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_rqst_upd_stop_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_reg_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_wg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_wg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_drct_dlv_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_drct_dlv_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_sppl_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_str_ln_tgt_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_in_to_loc_cal_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_site_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_lg_grp_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl1_dlv_rqst_tm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_sundry_itm_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_str_ln_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_str_ln_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_str_ln_cd_none_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_ver_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_asset_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_dscnt_itm_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_itm_purc_upri_cng_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl1_ver_no_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl1_trd_unit_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_rnd_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_conv_base_qty.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_conv_qty.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl1_base_unit_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_base_unit_rnd_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl1_base_unit_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl1_inst_cont_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl1_cont_fctr_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_rnd_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl1_cont_unit_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl1_std_cont_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl1_sppl_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_sppl_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_sppl_cntry_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_sppl_cntry_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_purc_amt_rnd_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_purc_tax_rnd_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_sppl_purc_upri_cng_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_sppl_cal_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_maker_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_maker_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_iv_itm_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_rqst_avl_rqst_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl1_rqst_dlv_rqst_tm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl1_purc_schd_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_po_schd_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl1_usr_dpt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl1_purc_dpt_wg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_purc_dpt_wg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_purc_upri_req_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_purc_upri_req_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_trd_cur_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_trd_cur_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_trd_cur_amt_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_trd_cur_upri_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_repurc_obli_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_upri_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_old_trd_cur_upri.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_old_trd_cur_proc_upri.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_old_trd_cur_onr_prov_upri.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_old_interim_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_xrate_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_xrate_inpt_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl1_xrate_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl1_base_cur_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_base_cur_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_base_cur_amt_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_base_cur_upri_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl1_base_cur_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_tax_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl1_base_cur_proc_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_proc_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl1_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_ptax_xrate_inpt_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl1_ptax_xrate_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl1_ptax_cur_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_ptax_cur_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_ptax_cur_amt_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_ptax_cur_upri_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl1_ptax_cur_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl1_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl1_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl1_sno_wrk_no_p_PPanel.putStatus(SRCH_REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl1_purc_rsn_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_purc_rsn_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_xpns_purc_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_not_xpns_purc_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_intr_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_trd_d_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_po_cnt_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_mfg_loc_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_mfg_loc_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_bom_ptn.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_itm_ord_no.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl1_bditm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl1_bd_lot_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_bd_lot_no_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_no_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno1_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno2_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno3_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno4_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_rqst_fr_usr_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_rqst_fr_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_rqst_fr_dpt_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_rqst_fr_dpt_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_po_schd_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_trd_ptn_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_po_schd_src_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_ins_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_ins_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_upd_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_upd_srv_req_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl1_po_schd_upd_cntr.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl1_base_dt.putMode(p, SRCH_REF, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Dtl2(MSBDP_PoSchdSplitReg p){
		p.columnDtl2_check.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_abort_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_rqst_upd_stop_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_reg_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_wg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_wg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_drct_dlv_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_drct_dlv_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_sppl_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_str_ln_tgt_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_in_to_loc_cal_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_site_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_lg_grp_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_str_ln_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_str_ln_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_str_ln_cd_none_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_rqst_avl_rqst_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl2_itm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl2_sundry_itm_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_ver_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_asset_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_dscnt_itm_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_itm_purc_upri_cng_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl2_ver_no_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl2_trd_unit_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_rnd_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_conv_base_qty.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_conv_qty.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl2_trd_unit_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl2_base_unit_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_base_unit_rnd_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl2_base_unit_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl2_inst_cont_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl2_cont_fctr_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_cont_fctr_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_cont_fctr_rnd_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl2_cont_unit_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl2_std_cont_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl2_sppl_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_sppl_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_sppl_cntry_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_sppl_cntry_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_purc_amt_rnd_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_purc_tax_rnd_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_sppl_purc_upri_cng_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_sppl_cal_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_maker_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_maker_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_sppl_itm_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_sppl_itm_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_iv_itm_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl2_dlv_rqst_tm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl2_rqst_dlv_rqst_tm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl2_purc_schd_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_po_schd_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl2_usr_dpt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl2_purc_dpt_wg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_purc_dpt_wg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_purc_upri_req_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_purc_upri_req_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_trd_cur_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_trd_cur_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_trd_cur_amt_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_trd_cur_upri_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_inc_tax_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_repurc_obli_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_upri_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_proc_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_trd_cur_proc_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_trd_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_trd_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_old_trd_cur_upri.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_old_trd_cur_proc_upri.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_old_trd_cur_onr_prov_upri.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_old_interim_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_xrate_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_xrate_inpt_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl2_xrate_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl2_base_cur_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_base_cur_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_base_cur_amt_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_base_cur_upri_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl2_base_cur_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_base_cur_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_tax_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl2_base_cur_proc_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_base_cur_proc_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl2_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_ptax_xrate_inpt_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl2_ptax_xrate_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl2_ptax_cur_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_ptax_cur_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_ptax_cur_amt_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_ptax_cur_upri_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl2_ptax_cur_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_ptax_cur_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Dtl2_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_ptax_cur_proc_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl2_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_ptax_cur_onr_prov_amt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl2_sno_wrk_no_p_PPanel.putStatus(SRCH_REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl2_purc_rsn_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_purc_rsn_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_xpns_purc_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_not_xpns_purc_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_intr_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_trd_d_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_po_cnt_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_mfg_loc_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_mfg_loc_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_bom_ptn.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_itm_ord_no.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl2_bditm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl2_bd_lot_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_bd_sublot_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_bd_lot_no_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_bd_sublot_no_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno1_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno2_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno3_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno4_mng_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl2_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Dtl2_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_rqst_fr_usr_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_rqst_fr_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_rqst_fr_dpt_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_rqst_fr_dpt_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_po_schd_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_trd_ptn_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_src_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_ins_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnDtl2_po_schd_upd_cntr.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnDtl2_base_dt.putMode(p, SRCH_REF, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Btn(MSBDP_PoSchdSplitReg p){
		p.Btn_mstr_replace.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_upri_replace.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_sync_p_PPanel.putStatus(SRCH_REF, mcframe.clientFSBA.FSBAP0020.FSBAP0020.INIT);
		p.Btn_del.putMode(p, SRCH_REF, MCMode.DISABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_EastBtn(MSBDP_PoSchdSplitReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBDP_PoSchdSplitReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBDP_PoSchdSplitReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch_tgt_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch01.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_srch02.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl1(MSBDP_PoSchdSplitReg p){
		p.columnDtl1_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_abort_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_rqst_upd_stop_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_reg_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_drct_dlv_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_drct_dlv_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_sppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_in_to_loc_cal_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_site_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_dlv_rqst_tm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_sundry_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_str_ln_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_str_ln_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_str_ln_cd_none_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ver_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_asset_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_dscnt_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_itm_purc_upri_cng_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl1_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl1_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl1_inst_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl1_cont_fctr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_cont_unit_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl1_std_cont_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl1_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_sppl_cntry_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_sppl_cntry_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_purc_amt_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_purc_tax_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_sppl_purc_upri_cng_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_sppl_cal_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_maker_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_maker_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_iv_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_rqst_avl_rqst_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl1_rqst_dlv_rqst_tm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl1_purc_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_po_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl1_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl1_purc_dpt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_purc_dpt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_purc_upri_req_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_purc_upri_req_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_trd_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_trd_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_repurc_obli_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_upri_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_proc_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_old_trd_cur_upri.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_old_trd_cur_proc_upri.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_old_trd_cur_onr_prov_upri.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_old_interim_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_xrate_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_xrate_inpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl1_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl1_base_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_base_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_base_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_base_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_base_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl1_base_cur_proc_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_proc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_base_cur_onr_prov_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_ptax_xrate_inpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl1_ptax_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl1_ptax_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ptax_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ptax_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_ptax_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_ptax_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl1_ptax_cur_proc_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_ptax_cur_onr_prov_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl1_purc_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_purc_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_xpns_purc_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_not_xpns_purc_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_trd_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_po_cnt_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_mfg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_mfg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_bom_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_itm_ord_no.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_bditm_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl1_bd_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_bd_lot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_rqst_fr_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_rqst_fr_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_rqst_fr_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_rqst_fr_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_po_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_po_schd_src_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_po_schd_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_base_dt.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl2(MSBDP_PoSchdSplitReg p){
		p.columnDtl2_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_abort_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_rqst_upd_stop_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_reg_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_drct_dlv_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_drct_dlv_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_sppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_in_to_loc_cal_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_site_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_str_ln_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_str_ln_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_str_ln_cd_none_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_rqst_avl_rqst_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl2_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl2_sundry_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ver_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_asset_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_dscnt_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_itm_purc_upri_cng_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl2_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl2_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl2_inst_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl2_cont_fctr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_cont_fctr_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_cont_fctr_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_cont_unit_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl2_std_cont_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl2_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_sppl_cntry_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_sppl_cntry_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_purc_amt_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_purc_tax_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_sppl_purc_upri_cng_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_sppl_cal_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_maker_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_maker_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_sppl_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_sppl_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_iv_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl2_dlv_rqst_tm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl2_rqst_dlv_rqst_tm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl2_purc_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_po_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl2_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl2_purc_dpt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_purc_dpt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_purc_upri_req_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_purc_upri_req_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_trd_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_trd_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_inc_tax_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_repurc_obli_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_upri_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_proc_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_trd_cur_proc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_trd_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_onr_prov_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_trd_cur_onr_prov_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_trd_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_old_trd_cur_upri.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_old_trd_cur_proc_upri.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_old_trd_cur_onr_prov_upri.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_old_interim_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_xrate_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_xrate_inpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl2_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl2_base_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_base_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_base_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_base_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_base_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_base_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl2_base_cur_proc_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_base_cur_proc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_base_cur_onr_prov_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_base_cur_onr_prov_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_ptax_xrate_inpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl2_ptax_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl2_ptax_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ptax_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ptax_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_ptax_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_ptax_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_ptax_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl2_ptax_cur_proc_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_ptax_cur_proc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_ptax_cur_onr_prov_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_ptax_cur_onr_prov_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl2_purc_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_purc_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_xpns_purc_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_not_xpns_purc_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_trd_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_po_cnt_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_mfg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_mfg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_bom_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_itm_ord_no.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_bditm_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl2_bd_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_bd_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_bd_lot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_bd_sublot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_rqst_fr_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_rqst_fr_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_rqst_fr_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_rqst_fr_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_po_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_src_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_po_schd_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_base_dt.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBDP_PoSchdSplitReg p){
		p.Btn_mstr_replace.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upri_replace.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_ins.putMode(p, REF, MCMode.DISABLE);
		p.Btn_sync_p_PPanel.putStatus(REF, mcframe.clientFSBA.FSBAP0020.FSBAP0020.INIT);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBDP_PoSchdSplitReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBDP_PoSchdSplitReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBDP_PoSchdSplitReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_srch01.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_srch02.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl1(MSBDP_PoSchdSplitReg p){
		p.columnDtl1_check.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_abort_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_rqst_upd_stop_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_reg_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_drct_dlv_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_drct_dlv_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_sppl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_str_ln_tgt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_in_to_loc_cal_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_site_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_dlv_rqst_tm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_sundry_itm_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_str_ln_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_str_ln_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_str_ln_cd_none_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_ver_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_asset_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_dscnt_itm_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_itm_purc_upri_cng_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_ver_no_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl1_trd_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_conv_base_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl1_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_base_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl1_inst_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl1_cont_fctr_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_cont_unit_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl1_std_cont_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl1_sppl_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_sppl_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_sppl_cntry_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_sppl_cntry_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_purc_amt_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_purc_tax_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_sppl_purc_upri_cng_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_sppl_cal_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_maker_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_maker_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_iv_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_rqst_avl_rqst_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl1_rqst_dlv_rqst_tm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl1_purc_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_po_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl1_usr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl1_purc_dpt_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_purc_dpt_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_purc_upri_req_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_purc_upri_req_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_trd_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_trd_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_trd_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_trd_cur_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_repurc_obli_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_upri_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_proc_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_old_trd_cur_upri.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_old_trd_cur_proc_upri.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_old_trd_cur_onr_prov_upri.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_old_interim_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_xrate_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_xrate_inpt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl1_xrate_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl1_base_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_base_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_base_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_base_cur_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_base_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl1_base_cur_proc_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_proc_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_base_cur_onr_prov_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_ptax_xrate_inpt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl1_ptax_xrate_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl1_ptax_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_ptax_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_ptax_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_ptax_cur_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_ptax_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl1_ptax_cur_proc_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_ptax_cur_onr_prov_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_sno_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl1_purc_rsn_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_purc_rsn_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_xpns_purc_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_not_xpns_purc_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_trd_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_po_cnt_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_mfg_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_mfg_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_bom_ptn.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_itm_ord_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_bditm_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl1_bd_lot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_bd_lot_no_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_no_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno1_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno2_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno3_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno4_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_rqst_fr_usr_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_rqst_fr_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_rqst_fr_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_rqst_fr_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_po_schd_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_trd_ptn_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_po_schd_src_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_ins_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_ins_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_upd_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_upd_srv_req_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_po_schd_upd_cntr.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_base_dt.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl2(MSBDP_PoSchdSplitReg p){
		p.columnDtl2_check.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_abort_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_rqst_upd_stop_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_reg_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_drct_dlv_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_drct_dlv_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_sppl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_str_ln_tgt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_in_to_loc_cal_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_site_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_str_ln_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_str_ln_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_str_ln_cd_none_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_rqst_avl_rqst_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl2_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl2_sundry_itm_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_ver_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_asset_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_dscnt_itm_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_itm_purc_upri_cng_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_ver_no_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl2_trd_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_conv_base_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_trd_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl2_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_base_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl2_inst_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl2_cont_fctr_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_cont_fctr_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_cont_fctr_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_cont_unit_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl2_std_cont_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl2_sppl_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_sppl_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_sppl_cntry_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_sppl_cntry_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_purc_amt_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_purc_tax_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_sppl_purc_upri_cng_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_sppl_cal_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_maker_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_maker_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_sppl_itm_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_sppl_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_iv_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl2_dlv_rqst_tm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl2_rqst_dlv_rqst_tm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl2_purc_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_po_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl2_usr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl2_purc_dpt_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_purc_dpt_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_purc_upri_req_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_purc_upri_req_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_trd_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_trd_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_trd_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_trd_cur_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_inc_tax_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_repurc_obli_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_upri_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_proc_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_trd_cur_proc_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_trd_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_onr_prov_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_trd_cur_onr_prov_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_trd_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_old_trd_cur_upri.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_old_trd_cur_proc_upri.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_old_trd_cur_onr_prov_upri.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_old_interim_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_xrate_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_xrate_inpt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl2_xrate_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl2_base_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_base_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_base_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_base_cur_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_base_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_base_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl2_base_cur_proc_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_base_cur_proc_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_base_cur_onr_prov_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_base_cur_onr_prov_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_ptax_xrate_inpt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl2_ptax_xrate_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl2_ptax_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_ptax_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_ptax_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_ptax_cur_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_ptax_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_ptax_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl2_ptax_cur_proc_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_ptax_cur_proc_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_ptax_cur_onr_prov_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_ptax_cur_onr_prov_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_sno_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl2_purc_rsn_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_purc_rsn_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_xpns_purc_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_not_xpns_purc_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_trd_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_po_cnt_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_mfg_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_mfg_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_bom_ptn.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_itm_ord_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_bditm_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl2_bd_lot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_bd_sublot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_bd_lot_no_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_bd_sublot_no_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno1_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno2_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno3_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno4_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_rqst_fr_usr_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_rqst_fr_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_rqst_fr_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_rqst_fr_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_po_schd_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_trd_ptn_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_src_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_ins_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_po_schd_upd_cntr.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_base_dt.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBDP_PoSchdSplitReg p){
		p.Btn_mstr_replace.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upri_replace.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_sync_p_PPanel.putStatus(FIX_I, mcframe.clientFSBA.FSBAP0020.FSBAP0020.INIT);
		p.Btn_del.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MSBDP_PoSchdSplitReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MSBDP_PoSchdSplitReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBDP_PoSchdSplitReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch_tgt_no.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch01.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Cnd_srch02.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl1(MSBDP_PoSchdSplitReg p){
		p.columnDtl1_check.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_abort_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_rqst_upd_stop_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_reg_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_wg_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_in_to_loc_wg_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_drct_dlv_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_drct_dlv_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_sppl_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_str_ln_tgt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_in_to_loc_cal_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_site_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_lg_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_dlv_rqst_tm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_sundry_itm_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_str_ln_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_str_ln_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_str_ln_cd_none_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ver_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_asset_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_dscnt_itm_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_itm_purc_upri_cng_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_ver_no_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl1_trd_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_conv_base_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl1_base_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_base_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_base_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl1_inst_cont_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl1_cont_fctr_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_cont_unit_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl1_std_cont_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl1_sppl_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_sppl_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_sppl_cntry_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_sppl_cntry_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_purc_amt_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_purc_tax_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_sppl_purc_upri_cng_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_sppl_cal_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_maker_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_maker_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_iv_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_rqst_avl_rqst_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl1_rqst_dlv_rqst_tm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl1_purc_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_po_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl1_usr_dpt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl1_purc_dpt_wg_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_purc_dpt_wg_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_purc_upri_req_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_purc_upri_req_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_trd_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_trd_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_trd_cur_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_trd_cur_upri_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_repurc_obli_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_upri_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_proc_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_old_trd_cur_upri.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_old_trd_cur_proc_upri.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_old_trd_cur_onr_prov_upri.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_old_interim_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_xrate_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_xrate_inpt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl1_xrate_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl1_base_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_base_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_base_cur_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_base_cur_upri_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_base_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl1_base_cur_proc_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_proc_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_base_cur_onr_prov_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_ptax_xrate_inpt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl1_ptax_xrate_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl1_ptax_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ptax_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ptax_cur_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_ptax_cur_upri_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_ptax_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl1_ptax_cur_proc_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_ptax_cur_onr_prov_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_sno_wrk_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl1_purc_rsn_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_purc_rsn_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_xpns_purc_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_not_xpns_purc_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_trd_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_po_cnt_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_mfg_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_mfg_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_bom_ptn.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_outsrc_itm_ord_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_bditm_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl1_bd_lot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_bd_lot_no_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_no_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno1_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno2_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno3_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno4_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_rqst_fr_usr_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_rqst_fr_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_rqst_fr_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_rqst_fr_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_po_schd_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_trd_ptn_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_po_schd_src_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_po_schd_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_base_dt.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl2(MSBDP_PoSchdSplitReg p){
		p.columnDtl2_check.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_abort_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_rqst_upd_stop_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_reg_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_wg_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_in_to_loc_wg_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_drct_dlv_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_drct_dlv_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_sppl_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_str_ln_tgt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_in_to_loc_cal_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_site_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_lg_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_str_ln_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_str_ln_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_str_ln_cd_none_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_rqst_avl_rqst_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl2_itm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl2_sundry_itm_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_ver_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_asset_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_dscnt_itm_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_itm_purc_upri_cng_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_ver_no_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl2_trd_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_conv_base_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_trd_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl2_base_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_base_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_base_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl2_inst_cont_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnDtl2_cont_fctr_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_cont_fctr_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_cont_fctr_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_cont_unit_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl2_std_cont_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl2_sppl_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_sppl_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_sppl_cntry_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_sppl_cntry_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_purc_amt_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_purc_tax_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_sppl_purc_upri_cng_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_sppl_cal_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_maker_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_maker_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_sppl_itm_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_sppl_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_iv_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl2_dlv_rqst_tm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Dtl2_rqst_dlv_rqst_tm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnDtl2_purc_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_po_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl2_usr_dpt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnDtl2_purc_dpt_wg_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_purc_dpt_wg_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_purc_upri_req_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_purc_upri_req_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_trd_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_trd_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_trd_cur_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_trd_cur_upri_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_inc_tax_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_repurc_obli_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_upri_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_proc_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_trd_cur_proc_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_trd_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_trd_cur_onr_prov_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_trd_cur_onr_prov_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_trd_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_old_trd_cur_upri.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_old_trd_cur_proc_upri.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_old_trd_cur_onr_prov_upri.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_old_interim_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_xrate_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_xrate_inpt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl2_xrate_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl2_base_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_base_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_base_cur_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_base_cur_upri_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_base_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_base_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl2_base_cur_proc_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_base_cur_proc_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_base_cur_onr_prov_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_base_cur_onr_prov_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_ptax_xrate_inpt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl2_ptax_xrate_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnDtl2_ptax_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_ptax_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_ptax_cur_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_ptax_cur_upri_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_ptax_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_ptax_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_inc_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl2_ptax_cur_proc_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_ptax_cur_proc_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_proc_amt_p_PPanel.columnAmt_tax_amt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_ptax_cur_onr_prov_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl2_ptax_cur_onr_prov_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_sno_wrk_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl2_purc_rsn_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_purc_rsn_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_xpns_purc_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_not_xpns_purc_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_trd_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_po_cnt_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_mfg_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_mfg_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_bom_ptn.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_outsrc_itm_ord_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_bditm_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl2_bd_lot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_bd_sublot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_bd_lot_no_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_bd_sublot_no_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno1_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno2_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno3_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_bd_sno4_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_rqst_fr_usr_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_rqst_fr_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_rqst_fr_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_rqst_fr_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_po_schd_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_trd_ptn_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_po_schd_src_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_po_schd_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_base_dt.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBDP_PoSchdSplitReg p){
		p.Btn_mstr_replace.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_upri_replace.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_sync_p_PPanel.putStatus(FIX_D, mcframe.clientFSBA.FSBAP0020.FSBAP0020.INIT);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBDP_PoSchdSplitReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_SPLIT;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBDP_PoSchdSplitReg_MC.setTableConfigDtl1((MSBDP_PoSchdSplitReg)this);
		MSBDP_PoSchdSplitReg_MC.setTableConfigDtl2((MSBDP_PoSchdSplitReg)this);
	}

	/**
	 * [Dtl1]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl1(MSBDP_PoSchdSplitReg p) {
		p.columnDtl1_check.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.check_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_check);
		p.columnDtl1_abort_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.abort_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_abort_flg);
		p.columnDtl1_rqst_upd_stop_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.rqst_upd_stop_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_rqst_upd_stop_flg);
		p.columnDtl1_reg_dt.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.reg_dt_META);
		p.columnDtl1_reg_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_reg_dt);
		p.columnDtl1_in_to_loc_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.in_to_loc_cd_META);
		p.columnDtl1_in_to_loc_cd.setListType(MCListType.STRICT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_in_to_loc_cd);
		p.columnDtl1_in_to_loc_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.in_to_loc_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_in_to_loc_nm);
		p.columnDtl1_in_to_loc_wg_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.in_to_loc_wg_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_in_to_loc_wg_cd);
		p.columnDtl1_in_to_loc_wg_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.in_to_loc_wg_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_in_to_loc_wg_nm);
		p.columnDtl1_drct_dlv_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.drct_dlv_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_drct_dlv_typ);
		p.columnDtl1_drct_dlv_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.drct_dlv_typ_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_drct_dlv_typ_nm);
		p.columnDtl1_outsrc_sppl_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.outsrc_sppl_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_outsrc_sppl_cd);
		p.columnDtl1_str_ln_tgt_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.str_ln_tgt_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_str_ln_tgt_flg);
		p.columnDtl1_in_to_loc_cal_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.in_to_loc_cal_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_in_to_loc_cal_cd);
		p.columnDtl1_site_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.site_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_site_cd);
		p.columnDtl1_lg_grp_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.lg_grp_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_lg_grp_cd);
		p.Dtl1Table.addTable(p.Dtl1_dlv_rqst_tm_p_PPanel.YmdHmTable);
		p.Dtl1Table.addTable(p.Dtl1_itm_p_PPanel.ItmTable);
		p.columnDtl1_sundry_itm_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.sundry_itm_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sundry_itm_flg);
		p.columnDtl1_str_ln_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.str_ln_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_str_ln_cd);
		p.columnDtl1_str_ln_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.str_ln_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_str_ln_nm);
		p.columnDtl1_str_ln_cd_none_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.str_ln_cd_none_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_str_ln_cd_none_flg);
		p.columnDtl1_ver_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.ver_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ver_flg);
		p.columnDtl1_asset_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.asset_mng_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_asset_mng_typ);
		p.columnDtl1_dscnt_itm_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.dscnt_itm_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_dscnt_itm_flg);
		p.columnDtl1_itm_purc_upri_cng_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.itm_purc_upri_cng_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_itm_purc_upri_cng_flg);
		p.Dtl1Table.addTable(p.Dtl1_ver_no_p_PPanel.VerNoTable);
		p.columnDtl1_trd_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.trd_unit_cd_META);
		p.columnDtl1_trd_unit_cd.addLinkBeans(p.columnDtl1_trd_unit_nm,p.columnDtl1_trd_unit_dec_place,p.columnDtl1_trd_unit_conv_base_qty,p.columnDtl1_trd_unit_conv_qty,p.columnDtl1_trd_unit_rnd_typ);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_unit_cd);
		p.columnDtl1_trd_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.trd_unit_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_unit_nm);
		p.columnDtl1_trd_unit_dec_place.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.trd_unit_dec_place_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_unit_dec_place);
		p.columnDtl1_trd_unit_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.trd_unit_rnd_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_unit_rnd_typ);
		p.columnDtl1_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.trd_unit_conv_base_qty_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_unit_conv_base_qty);
		p.columnDtl1_trd_unit_conv_qty.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.trd_unit_conv_qty_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_unit_conv_qty);
		p.Dtl1Table.addTable(p.Dtl1_trd_unit_qty_p_PPanel.QtyTable);
		p.columnDtl1_base_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.base_unit_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_base_unit_cd);
		p.columnDtl1_base_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.base_unit_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_base_unit_nm);
		p.columnDtl1_base_unit_dec_place.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.base_unit_dec_place_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_base_unit_dec_place);
		p.columnDtl1_base_unit_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.base_unit_rnd_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_base_unit_rnd_typ);
		p.Dtl1Table.addTable(p.Dtl1_base_unit_qty_p_PPanel.QtyTable);
		p.Dtl1Table.addTable(p.Dtl1_inst_cont_qty_p_PPanel.ContQtyTable);
		p.columnDtl1_cont_fctr_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.cont_fctr_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_cont_fctr_flg);
		p.columnDtl1_cont_fctr_dec_place.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.cont_fctr_dec_place_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_cont_fctr_dec_place);
		p.columnDtl1_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.cont_fctr_rnd_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_cont_fctr_rnd_typ);
		p.Dtl1Table.addTable(p.Dtl1_cont_unit_p_PPanel.ContFctrUnitTable);
		p.Dtl1Table.addTable(p.Dtl1_std_cont_p_PPanel.StdContFctrTable);
		p.columnDtl1_sppl_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.sppl_cd_META);
		p.columnDtl1_sppl_cd.addLinkBeans(p.columnDtl1_sppl_nm,p.columnDtl1_trd_cur_cd,p.columnDtl1_purc_usr_cd,p.columnDtl1_purc_dpt_cd,p.columnDtl1_sppl_purc_upri_cng_flg,p.columnDtl1_purc_upri_req_typ,p.columnDtl1_sppl_cal_cd,p.columnDtl1_purc_amt_rnd_typ,p.columnDtl1_purc_tax_rnd_typ,p.columnDtl1_sppl_cntry_cd,p.columnDtl1_sppl_cntry_nm);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sppl_cd);
		p.columnDtl1_sppl_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.sppl_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sppl_nm);
		p.columnDtl1_sppl_cntry_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.sppl_cntry_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sppl_cntry_cd);
		p.columnDtl1_sppl_cntry_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.sppl_cntry_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sppl_cntry_nm);
		p.columnDtl1_purc_amt_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.purc_amt_rnd_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_amt_rnd_typ);
		p.columnDtl1_purc_tax_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.purc_tax_rnd_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_tax_rnd_typ);
		p.columnDtl1_sppl_purc_upri_cng_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.sppl_purc_upri_cng_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sppl_purc_upri_cng_flg);
		p.columnDtl1_sppl_cal_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.sppl_cal_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sppl_cal_cd);
		p.columnDtl1_maker_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.maker_cd_META);
		p.columnDtl1_maker_cd.addLinkBeans(p.columnDtl1_maker_nm);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_maker_cd);
		p.columnDtl1_maker_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.maker_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_maker_nm);
		p.columnDtl1_sppl_itm_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.sppl_itm_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sppl_itm_cd);
		p.columnDtl1_sppl_itm_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.sppl_itm_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sppl_itm_nm);
		p.columnDtl1_iv_itm_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.iv_itm_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_iv_itm_nm);
		p.columnDtl1_rqst_avl_rqst_dt.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.rqst_avl_rqst_dt_META);
		p.columnDtl1_rqst_avl_rqst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_rqst_avl_rqst_dt);
		p.Dtl1Table.addTable(p.Dtl1_rqst_dlv_rqst_tm_p_PPanel.YmdHmTable);
		p.columnDtl1_purc_schd_dt.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.purc_schd_dt_META);
		p.columnDtl1_purc_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_schd_dt);
		p.columnDtl1_po_schd_dt.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.po_schd_dt_META);
		p.columnDtl1_po_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_po_schd_dt);
		p.Dtl1Table.addTable(p.Dtl1_usr_dpt_p_PPanel.UsrDptTable);
		p.Dtl1_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setLinkBeans(p.columnDtl1_purc_dpt_nm, p.columnDtl1_purc_dpt_wg_cd, p.columnDtl1_purc_dpt_wg_nm);
		p.columnDtl1_purc_dpt_wg_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.purc_dpt_wg_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_dpt_wg_cd);
		p.columnDtl1_purc_dpt_wg_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.purc_dpt_wg_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_dpt_wg_nm);
		p.columnDtl1_purc_upri_req_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.purc_upri_req_typ_META);
		p.columnDtl1_purc_upri_req_typ.addLinkBeans(p.columnDtl1_purc_upri_req_typ_nm);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_upri_req_typ);
		p.columnDtl1_purc_upri_req_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.purc_upri_req_typ_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_upri_req_typ_nm);
		p.columnDtl1_trd_cur_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.trd_cur_cd_META);
		p.columnDtl1_trd_cur_cd.addLinkBeans(p.columnDtl1_trd_cur_nm,p.columnDtl1_trd_cur_amt_dec_place,p.columnDtl1_trd_cur_upri_dec_place);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_cur_cd);
		p.columnDtl1_trd_cur_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.trd_cur_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_cur_nm);
		p.columnDtl1_trd_cur_amt_dec_place.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.trd_cur_amt_dec_place_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_cur_amt_dec_place);
		p.columnDtl1_trd_cur_upri_dec_place.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.trd_cur_upri_dec_place_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_cur_upri_dec_place);
		p.Dtl1Table.addTable(p.Dtl1_trd_cur_upri_p_PPanel.TrdUpriAmtTable);
		p.Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd.setLinkBeans(p.columnDtl1_tax_nm, p.columnDtl1_tax_typ, p.columnDtl1_tax_rate, p.columnDtl1_inc_tax_flg);
		p.columnDtl1_repurc_obli_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.repurc_obli_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_repurc_obli_flg);
		p.columnDtl1_outsrc_upri_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.outsrc_upri_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_outsrc_upri_typ);
		p.Dtl1Table.addTable(p.Dtl1_trd_cur_proc_upri_p_PPanel.UpriTable);
		p.Dtl1Table.addTable(p.Dtl1_trd_cur_proc_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.Dtl1Table.addTable(p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.columnDtl1_old_trd_cur_upri.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.old_trd_cur_upri_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_old_trd_cur_upri);
		p.columnDtl1_old_trd_cur_proc_upri.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.old_trd_cur_proc_upri_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_old_trd_cur_proc_upri);
		p.columnDtl1_old_trd_cur_onr_prov_upri.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.old_trd_cur_onr_prov_upri_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_old_trd_cur_onr_prov_upri);
		p.columnDtl1_old_interim_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.old_interim_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_old_interim_flg);
		p.columnDtl1_xrate_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.xrate_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_xrate_cd);
		p.columnDtl1_xrate_inpt_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.xrate_inpt_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_xrate_inpt_flg);
		p.Dtl1Table.addTable(p.Dtl1_xrate_p_PPanel.XrateTable);
		p.columnDtl1_base_cur_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.base_cur_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_base_cur_cd);
		p.columnDtl1_base_cur_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.base_cur_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_base_cur_nm);
		p.columnDtl1_base_cur_amt_dec_place.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.base_cur_amt_dec_place_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_base_cur_amt_dec_place);
		p.columnDtl1_base_cur_upri_dec_place.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.base_cur_upri_dec_place_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_base_cur_upri_dec_place);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_upri_p_PPanel.UpriTable);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_tax_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_proc_upri_p_PPanel.UpriTable);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_proc_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.columnDtl1_ptax_xrate_inpt_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.ptax_xrate_inpt_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ptax_xrate_inpt_flg);
		p.Dtl1Table.addTable(p.Dtl1_ptax_xrate_p_PPanel.XrateTable);
		p.columnDtl1_ptax_cur_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.ptax_cur_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ptax_cur_cd);
		p.columnDtl1_ptax_cur_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.ptax_cur_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ptax_cur_nm);
		p.columnDtl1_ptax_cur_amt_dec_place.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.ptax_cur_amt_dec_place_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ptax_cur_amt_dec_place);
		p.columnDtl1_ptax_cur_upri_dec_place.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.ptax_cur_upri_dec_place_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ptax_cur_upri_dec_place);
		p.Dtl1Table.addTable(p.Dtl1_ptax_cur_upri_p_PPanel.UpriTable);
		p.Dtl1Table.addTable(p.Dtl1_ptax_cur_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_ptax_cur_tax_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_ptax_cur_proc_upri_p_PPanel.UpriTable);
		p.Dtl1Table.addTable(p.Dtl1_ptax_cur_proc_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_ptax_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.Dtl1Table.addTable(p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnDtl1_purc_rsn_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.purc_rsn_cd_META);
		p.columnDtl1_purc_rsn_cd.addLinkBeans(p.columnDtl1_purc_rsn_nm,p.columnDtl1_xpns_purc_flg);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_rsn_cd);
		p.columnDtl1_purc_rsn_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.purc_rsn_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_rsn_nm);
		p.columnDtl1_xpns_purc_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.xpns_purc_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_xpns_purc_flg);
		p.columnDtl1_not_xpns_purc_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.not_xpns_purc_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_not_xpns_purc_flg);
		p.columnDtl1_intr_rmrks.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.intr_rmrks_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_intr_rmrks);
		p.columnDtl1_trd_d_rmrks.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.trd_d_rmrks_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_d_rmrks);
		p.columnDtl1_po_cnt_rmrks.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.po_cnt_rmrks_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_po_cnt_rmrks);
		p.columnDtl1_mfg_loc_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.mfg_loc_cd_META);
		p.columnDtl1_mfg_loc_cd.addLinkBeans(p.columnDtl1_mfg_loc_nm,p.columnDtl1_sppl_cd,p.columnDtl1_maker_cd);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_mfg_loc_cd);
		p.columnDtl1_mfg_loc_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.mfg_loc_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_mfg_loc_nm);
		p.columnDtl1_bom_ptn.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.bom_ptn_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_bom_ptn);
		p.columnDtl1_outsrc_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.outsrc_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_outsrc_flg);
		p.columnDtl1_outsrc_itm_ord_no.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.outsrc_itm_ord_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_outsrc_itm_ord_no);
		p.Dtl1Table.addTable(p.Dtl1_bditm_p_PPanel.BdItemTable);
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_dpt_cd.setLinkBeans(p.columnDtl1_bd_dpt_nm);
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_cd.setLinkBeans(p.columnDtl1_bd_itm_sub1, p.columnDtl1_bd_itm_sub2, p.columnDtl1_bd_itm_sub3, p.columnDtl1_bd_itm_nm, p.columnDtl1_bd_lot_mng_typ, p.columnDtl1_bd_lot_no_typ, p.columnDtl1_bd_sublot_mng_typ, p.columnDtl1_bd_sublot_no_typ, p.columnDtl1_bd_sno1_mng_typ, p.columnDtl1_bd_sno2_mng_typ, p.columnDtl1_bd_sno3_mng_typ, p.columnDtl1_bd_sno4_mng_typ);
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_sub1.setLinkBeans(p.columnDtl1_bd_itm_sub2, p.columnDtl1_bd_itm_sub3, p.columnDtl1_bd_itm_nm, p.columnDtl1_bd_lot_mng_typ, p.columnDtl1_bd_lot_no_typ, p.columnDtl1_bd_sublot_mng_typ, p.columnDtl1_bd_sublot_no_typ, p.columnDtl1_bd_sno1_mng_typ, p.columnDtl1_bd_sno2_mng_typ, p.columnDtl1_bd_sno3_mng_typ, p.columnDtl1_bd_sno4_mng_typ);
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_sub2.setLinkBeans(p.columnDtl1_bd_itm_sub3, p.columnDtl1_bd_itm_nm, p.columnDtl1_bd_lot_mng_typ, p.columnDtl1_bd_lot_no_typ, p.columnDtl1_bd_sublot_mng_typ, p.columnDtl1_bd_sublot_no_typ, p.columnDtl1_bd_sno1_mng_typ, p.columnDtl1_bd_sno2_mng_typ, p.columnDtl1_bd_sno3_mng_typ, p.columnDtl1_bd_sno4_mng_typ);
		p.Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_sub3.setLinkBeans(p.columnDtl1_bd_itm_nm, p.columnDtl1_bd_lot_mng_typ, p.columnDtl1_bd_lot_no_typ, p.columnDtl1_bd_sublot_mng_typ, p.columnDtl1_bd_sublot_no_typ, p.columnDtl1_bd_sno1_mng_typ, p.columnDtl1_bd_sno2_mng_typ, p.columnDtl1_bd_sno3_mng_typ, p.columnDtl1_bd_sno4_mng_typ);
		p.columnDtl1_bd_lot_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.bd_lot_mng_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_bd_lot_mng_typ);
		p.columnDtl1_bd_sublot_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.bd_sublot_mng_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_bd_sublot_mng_typ);
		p.columnDtl1_bd_lot_no_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.bd_lot_no_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_bd_lot_no_typ);
		p.columnDtl1_bd_sublot_no_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.bd_sublot_no_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_bd_sublot_no_typ);
		p.columnDtl1_bd_sno1_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.bd_sno1_mng_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_bd_sno1_mng_typ);
		p.columnDtl1_bd_sno2_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.bd_sno2_mng_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_bd_sno2_mng_typ);
		p.columnDtl1_bd_sno3_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.bd_sno3_mng_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_bd_sno3_mng_typ);
		p.columnDtl1_bd_sno4_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.bd_sno4_mng_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_bd_sno4_mng_typ);
		p.columnDtl1_rqst_fr_usr_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.rqst_fr_usr_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_rqst_fr_usr_cd);
		p.columnDtl1_rqst_fr_usr_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.rqst_fr_usr_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_rqst_fr_usr_nm);
		p.columnDtl1_rqst_fr_dpt_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.rqst_fr_dpt_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_rqst_fr_dpt_cd);
		p.columnDtl1_rqst_fr_dpt_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.rqst_fr_dpt_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_rqst_fr_dpt_nm);
		p.columnDtl1_po_schd_no.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.po_schd_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_po_schd_no);
		p.columnDtl1_trd_ptn_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.trd_ptn_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_ptn_typ);
		p.columnDtl1_po_schd_src_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.po_schd_src_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_po_schd_src_typ);
		p.columnDtl1_ins_usr_id.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.ins_usr_id_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_usr_id);
		p.columnDtl1_ins_usr_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.ins_usr_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_usr_nm);
		p.columnDtl1_ins_func_id.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.ins_func_id_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_func_id);
		p.columnDtl1_ins_func_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.ins_func_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_func_nm);
		p.columnDtl1_ins_ts.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.ins_ts_META);
		p.columnDtl1_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_ts);
		p.columnDtl1_upd_usr_id.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.upd_usr_id_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_usr_id);
		p.columnDtl1_upd_usr_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.upd_usr_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_usr_nm);
		p.columnDtl1_upd_func_id.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.upd_func_id_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_func_id);
		p.columnDtl1_upd_func_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.upd_func_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_func_nm);
		p.columnDtl1_upd_ts.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.upd_ts_META);
		p.columnDtl1_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_ts);
		p.columnDtl1_upd_srv_req_no.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.upd_srv_req_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_srv_req_no);
		p.columnDtl1_po_schd_upd_cntr.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.po_schd_upd_cntr_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_po_schd_upd_cntr);
		p.columnDtl1_base_dt.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.base_dt_META);
		p.columnDtl1_base_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_base_dt);
	}

	/**
	 * [Dtl2]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl2(MSBDP_PoSchdSplitReg p) {
		p.columnDtl2_check.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.check_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_check);
		p.columnDtl2_abort_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.abort_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_abort_flg);
		p.columnDtl2_rqst_upd_stop_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.rqst_upd_stop_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_rqst_upd_stop_flg);
		p.columnDtl2_reg_dt.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.reg_dt_META);
		p.columnDtl2_reg_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_reg_dt);
		p.columnDtl2_in_to_loc_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.in_to_loc_cd_META);
		p.columnDtl2_in_to_loc_cd.setListType(MCListType.STRICT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_in_to_loc_cd);
		p.columnDtl2_in_to_loc_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.in_to_loc_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_in_to_loc_nm);
		p.columnDtl2_in_to_loc_wg_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.in_to_loc_wg_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_in_to_loc_wg_cd);
		p.columnDtl2_in_to_loc_wg_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.in_to_loc_wg_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_in_to_loc_wg_nm);
		p.columnDtl2_drct_dlv_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.drct_dlv_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_drct_dlv_typ);
		p.columnDtl2_drct_dlv_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.drct_dlv_typ_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_drct_dlv_typ_nm);
		p.columnDtl2_outsrc_sppl_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.outsrc_sppl_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_outsrc_sppl_cd);
		p.columnDtl2_str_ln_tgt_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.str_ln_tgt_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_str_ln_tgt_flg);
		p.columnDtl2_in_to_loc_cal_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.in_to_loc_cal_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_in_to_loc_cal_cd);
		p.columnDtl2_site_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.site_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_site_cd);
		p.columnDtl2_lg_grp_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.lg_grp_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_lg_grp_cd);
		p.columnDtl2_str_ln_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.str_ln_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_str_ln_cd);
		p.columnDtl2_str_ln_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.str_ln_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_str_ln_nm);
		p.columnDtl2_str_ln_cd_none_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.str_ln_cd_none_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_str_ln_cd_none_flg);
		p.columnDtl2_rqst_avl_rqst_dt.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.rqst_avl_rqst_dt_META);
		p.columnDtl2_rqst_avl_rqst_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_rqst_avl_rqst_dt);
		p.Dtl2Table.addTable(p.Dtl2_itm_p_PPanel.ItmTable);
		p.columnDtl2_sundry_itm_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.sundry_itm_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sundry_itm_flg);
		p.columnDtl2_ver_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.ver_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ver_flg);
		p.columnDtl2_asset_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.asset_mng_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_asset_mng_typ);
		p.columnDtl2_dscnt_itm_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.dscnt_itm_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_dscnt_itm_flg);
		p.columnDtl2_itm_purc_upri_cng_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.itm_purc_upri_cng_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_itm_purc_upri_cng_flg);
		p.Dtl2Table.addTable(p.Dtl2_ver_no_p_PPanel.VerNoTable);
		p.columnDtl2_trd_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.trd_unit_cd_META);
		p.columnDtl2_trd_unit_cd.addLinkBeans(p.columnDtl2_trd_unit_nm,p.columnDtl2_trd_unit_dec_place,p.columnDtl2_trd_unit_conv_base_qty,p.columnDtl2_trd_unit_conv_qty,p.columnDtl2_trd_unit_rnd_typ);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_trd_unit_cd);
		p.columnDtl2_trd_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.trd_unit_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_trd_unit_nm);
		p.columnDtl2_trd_unit_dec_place.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.trd_unit_dec_place_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_trd_unit_dec_place);
		p.columnDtl2_trd_unit_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.trd_unit_rnd_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_trd_unit_rnd_typ);
		p.columnDtl2_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.trd_unit_conv_base_qty_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_trd_unit_conv_base_qty);
		p.columnDtl2_trd_unit_conv_qty.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.trd_unit_conv_qty_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_trd_unit_conv_qty);
		p.Dtl2Table.addTable(p.Dtl2_trd_unit_qty_p_PPanel.QtyTable);
		p.columnDtl2_base_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.base_unit_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_base_unit_cd);
		p.columnDtl2_base_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.base_unit_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_base_unit_nm);
		p.columnDtl2_base_unit_dec_place.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.base_unit_dec_place_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_base_unit_dec_place);
		p.columnDtl2_base_unit_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.base_unit_rnd_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_base_unit_rnd_typ);
		p.Dtl2Table.addTable(p.Dtl2_base_unit_qty_p_PPanel.QtyTable);
		p.Dtl2Table.addTable(p.Dtl2_inst_cont_qty_p_PPanel.ContQtyTable);
		p.columnDtl2_cont_fctr_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.cont_fctr_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_cont_fctr_flg);
		p.columnDtl2_cont_fctr_dec_place.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.cont_fctr_dec_place_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_cont_fctr_dec_place);
		p.columnDtl2_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.cont_fctr_rnd_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_cont_fctr_rnd_typ);
		p.Dtl2Table.addTable(p.Dtl2_cont_unit_p_PPanel.ContFctrUnitTable);
		p.Dtl2Table.addTable(p.Dtl2_std_cont_p_PPanel.StdContFctrTable);
		p.columnDtl2_sppl_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.sppl_cd_META);
		p.columnDtl2_sppl_cd.addLinkBeans(p.columnDtl2_sppl_nm,p.columnDtl2_trd_cur_cd,p.columnDtl2_purc_usr_cd,p.columnDtl2_purc_dpt_cd,p.columnDtl2_sppl_purc_upri_cng_flg,p.columnDtl2_purc_upri_req_typ,p.columnDtl2_sppl_cal_cd,p.columnDtl2_purc_amt_rnd_typ,p.columnDtl2_purc_tax_rnd_typ,p.columnDtl2_sppl_cntry_cd,p.columnDtl2_sppl_cntry_nm);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sppl_cd);
		p.columnDtl2_sppl_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.sppl_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sppl_nm);
		p.columnDtl2_sppl_cntry_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.sppl_cntry_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sppl_cntry_cd);
		p.columnDtl2_sppl_cntry_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.sppl_cntry_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sppl_cntry_nm);
		p.columnDtl2_purc_amt_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.purc_amt_rnd_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_purc_amt_rnd_typ);
		p.columnDtl2_purc_tax_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.purc_tax_rnd_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_purc_tax_rnd_typ);
		p.columnDtl2_sppl_purc_upri_cng_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.sppl_purc_upri_cng_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sppl_purc_upri_cng_flg);
		p.columnDtl2_sppl_cal_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.sppl_cal_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sppl_cal_cd);
		p.columnDtl2_maker_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.maker_cd_META);
		p.columnDtl2_maker_cd.addLinkBeans(p.columnDtl2_maker_nm);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_maker_cd);
		p.columnDtl2_maker_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.maker_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_maker_nm);
		p.columnDtl2_sppl_itm_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.sppl_itm_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sppl_itm_cd);
		p.columnDtl2_sppl_itm_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.sppl_itm_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sppl_itm_nm);
		p.columnDtl2_iv_itm_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.iv_itm_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_iv_itm_nm);
		p.Dtl2Table.addTable(p.Dtl2_dlv_rqst_tm_p_PPanel.YmdHmTable);
		p.Dtl2Table.addTable(p.Dtl2_rqst_dlv_rqst_tm_p_PPanel.YmdHmTable);
		p.columnDtl2_purc_schd_dt.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.purc_schd_dt_META);
		p.columnDtl2_purc_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_purc_schd_dt);
		p.columnDtl2_po_schd_dt.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.po_schd_dt_META);
		p.columnDtl2_po_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_po_schd_dt);
		p.Dtl2Table.addTable(p.Dtl2_usr_dpt_p_PPanel.UsrDptTable);
		p.Dtl2_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setLinkBeans(p.columnDtl2_purc_dpt_nm, p.columnDtl2_purc_dpt_wg_cd, p.columnDtl2_purc_dpt_wg_nm);
		p.columnDtl2_purc_dpt_wg_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.purc_dpt_wg_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_purc_dpt_wg_cd);
		p.columnDtl2_purc_dpt_wg_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.purc_dpt_wg_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_purc_dpt_wg_nm);
		p.columnDtl2_purc_upri_req_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.purc_upri_req_typ_META);
		p.columnDtl2_purc_upri_req_typ.addLinkBeans(p.columnDtl2_purc_upri_req_typ_nm);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_purc_upri_req_typ);
		p.columnDtl2_purc_upri_req_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.purc_upri_req_typ_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_purc_upri_req_typ_nm);
		p.columnDtl2_trd_cur_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.trd_cur_cd_META);
		p.columnDtl2_trd_cur_cd.addLinkBeans(p.columnDtl2_trd_cur_nm,p.columnDtl2_trd_cur_amt_dec_place,p.columnDtl2_trd_cur_upri_dec_place);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_trd_cur_cd);
		p.columnDtl2_trd_cur_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.trd_cur_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_trd_cur_nm);
		p.columnDtl2_trd_cur_amt_dec_place.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.trd_cur_amt_dec_place_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_trd_cur_amt_dec_place);
		p.columnDtl2_trd_cur_upri_dec_place.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.trd_cur_upri_dec_place_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_trd_cur_upri_dec_place);
		p.Dtl2Table.addTable(p.Dtl2_trd_cur_upri_p_PPanel.TrdUpriAmtTable);
		p.Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd.setLinkBeans(p.columnDtl2_tax_nm, p.columnDtl2_tax_typ, p.columnDtl2_tax_rate, p.columnDtl2_inc_tax_flg);
		p.columnDtl2_repurc_obli_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.repurc_obli_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_repurc_obli_flg);
		p.columnDtl2_outsrc_upri_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.outsrc_upri_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_outsrc_upri_typ);
		p.Dtl2Table.addTable(p.Dtl2_trd_cur_proc_upri_p_PPanel.UpriTable);
		p.Dtl2Table.addTable(p.Dtl2_trd_cur_proc_amt_p_PPanel.AmtTable);
		p.Dtl2Table.addTable(p.Dtl2_trd_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.Dtl2Table.addTable(p.Dtl2_trd_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.columnDtl2_old_trd_cur_upri.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.old_trd_cur_upri_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_old_trd_cur_upri);
		p.columnDtl2_old_trd_cur_proc_upri.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.old_trd_cur_proc_upri_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_old_trd_cur_proc_upri);
		p.columnDtl2_old_trd_cur_onr_prov_upri.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.old_trd_cur_onr_prov_upri_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_old_trd_cur_onr_prov_upri);
		p.columnDtl2_old_interim_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.old_interim_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_old_interim_flg);
		p.columnDtl2_xrate_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.xrate_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_xrate_cd);
		p.columnDtl2_xrate_inpt_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.xrate_inpt_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_xrate_inpt_flg);
		p.Dtl2Table.addTable(p.Dtl2_xrate_p_PPanel.XrateTable);
		p.columnDtl2_base_cur_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.base_cur_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_base_cur_cd);
		p.columnDtl2_base_cur_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.base_cur_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_base_cur_nm);
		p.columnDtl2_base_cur_amt_dec_place.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.base_cur_amt_dec_place_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_base_cur_amt_dec_place);
		p.columnDtl2_base_cur_upri_dec_place.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.base_cur_upri_dec_place_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_base_cur_upri_dec_place);
		p.Dtl2Table.addTable(p.Dtl2_base_cur_upri_p_PPanel.UpriTable);
		p.Dtl2Table.addTable(p.Dtl2_base_cur_amt_p_PPanel.AmtTable);
		p.Dtl2Table.addTable(p.Dtl2_base_cur_tax_amt_p_PPanel.AmtTable);
		p.Dtl2Table.addTable(p.Dtl2_base_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.Dtl2Table.addTable(p.Dtl2_base_cur_proc_upri_p_PPanel.UpriTable);
		p.Dtl2Table.addTable(p.Dtl2_base_cur_proc_amt_p_PPanel.AmtTable);
		p.Dtl2Table.addTable(p.Dtl2_base_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.Dtl2Table.addTable(p.Dtl2_base_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.columnDtl2_ptax_xrate_inpt_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.ptax_xrate_inpt_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ptax_xrate_inpt_flg);
		p.Dtl2Table.addTable(p.Dtl2_ptax_xrate_p_PPanel.XrateTable);
		p.columnDtl2_ptax_cur_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.ptax_cur_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ptax_cur_cd);
		p.columnDtl2_ptax_cur_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.ptax_cur_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ptax_cur_nm);
		p.columnDtl2_ptax_cur_amt_dec_place.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.ptax_cur_amt_dec_place_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ptax_cur_amt_dec_place);
		p.columnDtl2_ptax_cur_upri_dec_place.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.ptax_cur_upri_dec_place_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ptax_cur_upri_dec_place);
		p.Dtl2Table.addTable(p.Dtl2_ptax_cur_upri_p_PPanel.UpriTable);
		p.Dtl2Table.addTable(p.Dtl2_ptax_cur_amt_p_PPanel.AmtTable);
		p.Dtl2Table.addTable(p.Dtl2_ptax_cur_tax_amt_p_PPanel.AmtTable);
		p.Dtl2Table.addTable(p.Dtl2_ptax_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.Dtl2Table.addTable(p.Dtl2_ptax_cur_proc_upri_p_PPanel.UpriTable);
		p.Dtl2Table.addTable(p.Dtl2_ptax_cur_proc_amt_p_PPanel.AmtTable);
		p.Dtl2Table.addTable(p.Dtl2_ptax_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.Dtl2Table.addTable(p.Dtl2_ptax_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.Dtl2Table.addTable(p.Dtl2_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnDtl2_purc_rsn_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.purc_rsn_cd_META);
		p.columnDtl2_purc_rsn_cd.addLinkBeans(p.columnDtl2_purc_rsn_nm,p.columnDtl2_xpns_purc_flg);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_purc_rsn_cd);
		p.columnDtl2_purc_rsn_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.purc_rsn_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_purc_rsn_nm);
		p.columnDtl2_xpns_purc_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.xpns_purc_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_xpns_purc_flg);
		p.columnDtl2_not_xpns_purc_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.not_xpns_purc_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_not_xpns_purc_flg);
		p.columnDtl2_intr_rmrks.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.intr_rmrks_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_intr_rmrks);
		p.columnDtl2_trd_d_rmrks.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.trd_d_rmrks_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_trd_d_rmrks);
		p.columnDtl2_po_cnt_rmrks.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.po_cnt_rmrks_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_po_cnt_rmrks);
		p.columnDtl2_mfg_loc_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.mfg_loc_cd_META);
		p.columnDtl2_mfg_loc_cd.addLinkBeans(p.columnDtl2_mfg_loc_nm,p.columnDtl2_sppl_cd,p.columnDtl2_maker_cd);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_mfg_loc_cd);
		p.columnDtl2_mfg_loc_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.mfg_loc_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_mfg_loc_nm);
		p.columnDtl2_bom_ptn.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.bom_ptn_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_bom_ptn);
		p.columnDtl2_outsrc_flg.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.outsrc_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_outsrc_flg);
		p.columnDtl2_outsrc_itm_ord_no.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.outsrc_itm_ord_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_outsrc_itm_ord_no);
		p.Dtl2Table.addTable(p.Dtl2_bditm_p_PPanel.BdItemTable);
		p.Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_cd.setLinkBeans(p.columnDtl2_bd_itm_sub1, p.columnDtl2_bd_itm_sub2, p.columnDtl2_bd_itm_sub3, p.columnDtl2_bd_itm_nm, p.columnDtl2_bd_lot_mng_typ, p.columnDtl2_bd_lot_no_typ, p.columnDtl2_bd_sublot_mng_typ, p.columnDtl2_bd_sublot_no_typ, p.columnDtl2_bd_sno1_mng_typ, p.columnDtl2_bd_sno2_mng_typ, p.columnDtl2_bd_sno3_mng_typ, p.columnDtl2_bd_sno4_mng_typ);
		p.Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_sub1.setLinkBeans(p.columnDtl2_bd_itm_sub2, p.columnDtl2_bd_itm_sub3, p.columnDtl2_bd_itm_nm, p.columnDtl2_bd_lot_mng_typ, p.columnDtl2_bd_lot_no_typ, p.columnDtl2_bd_sublot_mng_typ, p.columnDtl2_bd_sublot_no_typ, p.columnDtl2_bd_sno1_mng_typ, p.columnDtl2_bd_sno2_mng_typ, p.columnDtl2_bd_sno3_mng_typ, p.columnDtl2_bd_sno4_mng_typ);
		p.Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_sub2.setLinkBeans(p.columnDtl2_bd_itm_sub3, p.columnDtl2_bd_itm_nm, p.columnDtl2_bd_lot_mng_typ, p.columnDtl2_bd_lot_no_typ, p.columnDtl2_bd_sublot_mng_typ, p.columnDtl2_bd_sublot_no_typ, p.columnDtl2_bd_sno1_mng_typ, p.columnDtl2_bd_sno2_mng_typ, p.columnDtl2_bd_sno3_mng_typ, p.columnDtl2_bd_sno4_mng_typ);
		p.Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_sub3.setLinkBeans(p.columnDtl2_bd_itm_nm, p.columnDtl2_bd_lot_mng_typ, p.columnDtl2_bd_lot_no_typ, p.columnDtl2_bd_sublot_mng_typ, p.columnDtl2_bd_sublot_no_typ, p.columnDtl2_bd_sno1_mng_typ, p.columnDtl2_bd_sno2_mng_typ, p.columnDtl2_bd_sno3_mng_typ, p.columnDtl2_bd_sno4_mng_typ);
		p.columnDtl2_bd_lot_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.bd_lot_mng_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_bd_lot_mng_typ);
		p.columnDtl2_bd_sublot_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.bd_sublot_mng_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_bd_sublot_mng_typ);
		p.columnDtl2_bd_lot_no_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.bd_lot_no_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_bd_lot_no_typ);
		p.columnDtl2_bd_sublot_no_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.bd_sublot_no_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_bd_sublot_no_typ);
		p.columnDtl2_bd_sno1_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.bd_sno1_mng_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_bd_sno1_mng_typ);
		p.columnDtl2_bd_sno2_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.bd_sno2_mng_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_bd_sno2_mng_typ);
		p.columnDtl2_bd_sno3_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.bd_sno3_mng_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_bd_sno3_mng_typ);
		p.columnDtl2_bd_sno4_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.bd_sno4_mng_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_bd_sno4_mng_typ);
		p.columnDtl2_rqst_fr_usr_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.rqst_fr_usr_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_rqst_fr_usr_cd);
		p.columnDtl2_rqst_fr_usr_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.rqst_fr_usr_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_rqst_fr_usr_nm);
		p.columnDtl2_rqst_fr_dpt_cd.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.rqst_fr_dpt_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_rqst_fr_dpt_cd);
		p.columnDtl2_rqst_fr_dpt_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.rqst_fr_dpt_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_rqst_fr_dpt_nm);
		p.columnDtl2_po_schd_no.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.po_schd_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_po_schd_no);
		p.columnDtl2_trd_ptn_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.trd_ptn_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_trd_ptn_typ);
		p.columnDtl2_po_schd_src_typ.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.po_schd_src_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_po_schd_src_typ);
		p.columnDtl2_ins_usr_id.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.ins_usr_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_usr_id);
		p.columnDtl2_ins_usr_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.ins_usr_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_usr_nm);
		p.columnDtl2_ins_func_id.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.ins_func_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_func_id);
		p.columnDtl2_ins_func_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.ins_func_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_func_nm);
		p.columnDtl2_ins_ts.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.ins_ts_META);
		p.columnDtl2_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_ts);
		p.columnDtl2_upd_usr_id.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.upd_usr_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_usr_id);
		p.columnDtl2_upd_usr_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.upd_usr_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_usr_nm);
		p.columnDtl2_upd_func_id.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.upd_func_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_func_id);
		p.columnDtl2_upd_func_nm.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.upd_func_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_func_nm);
		p.columnDtl2_upd_ts.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.upd_ts_META);
		p.columnDtl2_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_ts);
		p.columnDtl2_upd_srv_req_no.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.upd_srv_req_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_srv_req_no);
		p.columnDtl2_po_schd_upd_cntr.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.po_schd_upd_cntr_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_po_schd_upd_cntr);
		p.columnDtl2_base_dt.setMeta(mcframe.clientMSBD.MSBDP0040.Dtl1R.base_dt_META);
		p.columnDtl2_base_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_base_dt);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_srch_tgt_typ_nm.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_srch_tgt_typ_nm.getListConfig().setPutter(getCnd_srch_tgt_typ_nm_ListPutter());
		columnDtl1_in_to_loc_cd.getListConfig().setPutter(getDtl1_in_to_loc_cd_ListPutter());
		columnDtl1_drct_dlv_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl1_drct_dlv_typ.getListConfig().setPutter(getDtl1_drct_dlv_typ_ListPutter());
		columnDtl1_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl1_trd_unit_cd.getListConfig().setPutter(getDtl1_trd_unit_cd_ListPutter());
		columnDtl1_base_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl1_base_unit_cd.getListConfig().setPutter(getDtl1_base_unit_cd_ListPutter());
		columnDtl1_sppl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl1_sppl_cd.getListConfig().setPutter(getDtl1_sppl_cd_ListPutter());
		columnDtl1_maker_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl1_maker_cd.getListConfig().setPutter(getDtl1_maker_cd_ListPutter());
		Dtl1_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl1_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.getListConfig().setPutter(getDtl1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter());
		columnDtl1_purc_upri_req_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl1_purc_upri_req_typ.getListConfig().setPutter(getDtl1_purc_upri_req_typ_ListPutter());
		columnDtl1_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl1_trd_cur_cd.getListConfig().setPutter(getDtl1_trd_cur_cd_ListPutter());
		Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd.getListConfig().setPutter(getDtl1_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter());
		columnDtl1_base_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl1_base_cur_cd.getListConfig().setPutter(getDtl1_base_cur_cd_ListPutter());
		columnDtl1_ptax_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl1_ptax_cur_cd.getListConfig().setPutter(getDtl1_ptax_cur_cd_ListPutter());
		columnDtl1_purc_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl1_purc_rsn_cd.getListConfig().setPutter(getDtl1_purc_rsn_cd_ListPutter());
		columnDtl1_mfg_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl1_mfg_loc_cd.getListConfig().setPutter(getDtl1_mfg_loc_cd_ListPutter());
		columnDtl1_bom_ptn.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl1_bom_ptn.getListConfig().setPutter(getDtl1_bom_ptn_ListPutter());
		Dtl1_bditm_p_PPanel.columnBdItem_bd_dpt_cd.getListConfig().setPutter(getDtl1_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter());
		Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_cd.getListConfig().setPutter(getDtl1_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter());
		Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_sub1.getListConfig().setPutter(getDtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter());
		Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_sub2.getListConfig().setPutter(getDtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter());
		Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_sub3.getListConfig().setPutter(getDtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter());
		columnDtl2_in_to_loc_cd.getListConfig().setPutter(getDtl2_in_to_loc_cd_ListPutter());
		columnDtl2_drct_dlv_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_drct_dlv_typ.getListConfig().setPutter(getDtl2_drct_dlv_typ_ListPutter());
		columnDtl2_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_trd_unit_cd.getListConfig().setPutter(getDtl2_trd_unit_cd_ListPutter());
		columnDtl2_base_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_base_unit_cd.getListConfig().setPutter(getDtl2_base_unit_cd_ListPutter());
		columnDtl2_sppl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_sppl_cd.getListConfig().setPutter(getDtl2_sppl_cd_ListPutter());
		columnDtl2_maker_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_maker_cd.getListConfig().setPutter(getDtl2_maker_cd_ListPutter());
		Dtl2_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl2_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.getListConfig().setPutter(getDtl2_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter());
		columnDtl2_purc_upri_req_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_purc_upri_req_typ.getListConfig().setPutter(getDtl2_purc_upri_req_typ_ListPutter());
		columnDtl2_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_trd_cur_cd.getListConfig().setPutter(getDtl2_trd_cur_cd_ListPutter());
		Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd.getListConfig().setPutter(getDtl2_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter());
		columnDtl2_base_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_base_cur_cd.getListConfig().setPutter(getDtl2_base_cur_cd_ListPutter());
		columnDtl2_ptax_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_ptax_cur_cd.getListConfig().setPutter(getDtl2_ptax_cur_cd_ListPutter());
		columnDtl2_purc_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_purc_rsn_cd.getListConfig().setPutter(getDtl2_purc_rsn_cd_ListPutter());
		columnDtl2_mfg_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_mfg_loc_cd.getListConfig().setPutter(getDtl2_mfg_loc_cd_ListPutter());
		columnDtl2_bom_ptn.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_bom_ptn.getListConfig().setPutter(getDtl2_bom_ptn_ListPutter());
		Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_cd.getListConfig().setPutter(getDtl2_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter());
		Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_sub1.getListConfig().setPutter(getDtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter());
		Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_sub2.getListConfig().setPutter(getDtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter());
		Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_sub3.getListConfig().setPutter(getDtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter());
	}

	/**
	 * この画面を[SRCH_SPLIT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_SPLITStatus() {
		status = SRCH_SPLIT;
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
	 * この画面を[SRCH_DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DELStatus() {
		status = SRCH_DEL;
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
	 * この画面を[SRCH_REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_REFStatus() {
		status = SRCH_REF;
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
	 * この画面を[FIX_I]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_IStatus() {
		status = FIX_I;
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_SPLIT.equals(status)) {
			setSRCH_SPLITStatus();
		}
		else if (INS.equals(status)) {
			setINSStatus();
		}
		else if (SRCH_DEL.equals(status)) {
			setSRCH_DELStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (SRCH_REF.equals(status)) {
			setSRCH_REFStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (FIX_I.equals(status)) {
			setFIX_IStatus();
		}
		else if (FIX_D.equals(status)) {
			setFIX_DStatus();
		}
	}

	/**
	 * [Cnd_srch_tgt_typ_nm_ListPutter]の作成
	 */
	protected MCListPutter createCnd_srch_tgt_typ_nm_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.PurcSrchTgtTyp");
		return lp;
	}
	 
	/**
	 * [Dtl1_in_to_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_in_to_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl1_drct_dlv_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_drct_dlv_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl1_trd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_trd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
		return lp;
	}
	 
	/**
	 * [Dtl1_base_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_base_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl1_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlSppl");
		return lp;
	}
	 
	/**
	 * [Dtl1_maker_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_maker_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlMaker");
		return lp;
	}
	 
	/**
	 * [Dtl1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Dtl1_purc_upri_req_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_purc_upri_req_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcUpriReqTyp");
		return lp;
	}
	 
	/**
	 * [Dtl1_trd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_trd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Dtl1_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcTax");
		return lp;
	}

	/**
	 * [Dtl1_base_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_base_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl1_ptax_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_ptax_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl1_purc_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_purc_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcBizRsn");
		return lp;
	}
	 
	/**
	 * [Dtl1_mfg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_mfg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlMfgLoc");
		return lp;
	}
	 
	/**
	 * [Dtl1_bom_ptn_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_bom_ptn_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlBomPtn");
		return lp;
	}
	 
	/**
	 * [Dtl1_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Dtl2_in_to_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_in_to_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl2_drct_dlv_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_drct_dlv_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl2_trd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_trd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
		return lp;
	}
	 
	/**
	 * [Dtl2_base_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_base_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl2_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlSppl");
		return lp;
	}
	 
	/**
	 * [Dtl2_maker_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_maker_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlMaker");
		return lp;
	}
	 
	/**
	 * [Dtl2_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Dtl2_purc_upri_req_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_purc_upri_req_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcUpriReqTyp");
		return lp;
	}
	 
	/**
	 * [Dtl2_trd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_trd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Dtl2_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcTax");
		return lp;
	}

	/**
	 * [Dtl2_base_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_base_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl2_ptax_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_ptax_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl2_purc_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_purc_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcBizRsn");
		return lp;
	}
	 
	/**
	 * [Dtl2_mfg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_mfg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlMfgLoc");
		return lp;
	}
	 
	/**
	 * [Dtl2_bom_ptn_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_bom_ptn_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlBomPtn");
		return lp;
	}
	 
	/**
	 * [Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_bditm_p_PPanel_columnBdItem_bd_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}


	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_srch_tgt_typ_nm) return getCnd_srch_tgt_typ_nm(row, info);
		if(combo == columnDtl1_in_to_loc_cd) return getDtl1_in_to_loc_cd(row, info);
		if(combo == columnDtl1_drct_dlv_typ) return getDtl1_drct_dlv_typ(row, info);
		if(combo == Dtl1_ver_no_p_PPanel.columnVerNo_ver_no) return getDtl1_ver_no_p_PPanel_columnVerNo_ver_no(row, info);
		if(combo == columnDtl1_trd_unit_cd) return getDtl1_trd_unit_cd(row, info);
		if(combo == columnDtl1_base_unit_cd) return getDtl1_base_unit_cd(row, info);
		if(combo == columnDtl1_sppl_cd) return getDtl1_sppl_cd(row, info);
		if(combo == columnDtl1_maker_cd) return getDtl1_maker_cd(row, info);
		if(combo == Dtl1_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd) return getDtl1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(row, info);
		if(combo == columnDtl1_purc_upri_req_typ) return getDtl1_purc_upri_req_typ(row, info);
		if(combo == columnDtl1_trd_cur_cd) return getDtl1_trd_cur_cd(row, info);
		if(combo == Dtl1_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd) return getDtl1_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd(row, info);
		if(combo == columnDtl1_base_cur_cd) return getDtl1_base_cur_cd(row, info);
		if(combo == columnDtl1_ptax_cur_cd) return getDtl1_ptax_cur_cd(row, info);
		if(combo == columnDtl1_purc_rsn_cd) return getDtl1_purc_rsn_cd(row, info);
		if(combo == columnDtl1_mfg_loc_cd) return getDtl1_mfg_loc_cd(row, info);
		if(combo == columnDtl1_bom_ptn) return getDtl1_bom_ptn(row, info);
		if(combo == Dtl1_bditm_p_PPanel.columnBdItem_bd_dpt_cd) return getDtl1_bditm_p_PPanel_columnBdItem_bd_dpt_cd(row, info);
		if(combo == Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_cd) return getDtl1_bditm_p_PPanel_columnBdItem_bd_itm_cd(row, info);
		if(combo == Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_sub1) return getDtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub1(row, info);
		if(combo == Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_sub2) return getDtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub2(row, info);
		if(combo == Dtl1_bditm_p_PPanel.columnBdItem_bd_itm_sub3) return getDtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub3(row, info);
		if(combo == columnDtl2_in_to_loc_cd) return getDtl2_in_to_loc_cd(row, info);
		if(combo == columnDtl2_drct_dlv_typ) return getDtl2_drct_dlv_typ(row, info);
		if(combo == Dtl2_ver_no_p_PPanel.columnVerNo_ver_no) return getDtl2_ver_no_p_PPanel_columnVerNo_ver_no(row, info);
		if(combo == columnDtl2_trd_unit_cd) return getDtl2_trd_unit_cd(row, info);
		if(combo == columnDtl2_base_unit_cd) return getDtl2_base_unit_cd(row, info);
		if(combo == columnDtl2_sppl_cd) return getDtl2_sppl_cd(row, info);
		if(combo == columnDtl2_maker_cd) return getDtl2_maker_cd(row, info);
		if(combo == Dtl2_usr_dpt_p_PPanel.columnUsrDpt_usr_cd) return getDtl2_usr_dpt_p_PPanel_columnUsrDpt_usr_cd(row, info);
		if(combo == Dtl2_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd) return getDtl2_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(row, info);
		if(combo == columnDtl2_purc_upri_req_typ) return getDtl2_purc_upri_req_typ(row, info);
		if(combo == columnDtl2_trd_cur_cd) return getDtl2_trd_cur_cd(row, info);
		if(combo == Dtl2_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd) return getDtl2_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd(row, info);
		if(combo == columnDtl2_base_cur_cd) return getDtl2_base_cur_cd(row, info);
		if(combo == columnDtl2_ptax_cur_cd) return getDtl2_ptax_cur_cd(row, info);
		if(combo == columnDtl2_purc_rsn_cd) return getDtl2_purc_rsn_cd(row, info);
		if(combo == columnDtl2_mfg_loc_cd) return getDtl2_mfg_loc_cd(row, info);
		if(combo == columnDtl2_bom_ptn) return getDtl2_bom_ptn(row, info);
		if(combo == Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_cd) return getDtl2_bditm_p_PPanel_columnBdItem_bd_itm_cd(row, info);
		if(combo == Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_sub1) return getDtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub1(row, info);
		if(combo == Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_sub2) return getDtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub2(row, info);
		if(combo == Dtl2_bditm_p_PPanel.columnBdItem_bd_itm_sub3) return getDtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub3(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch01) doCnd_srch01(info);
		else if (ap == Cnd_srch02) doCnd_srch02(info);
		else if (ap == Btn_mstr_replace) doBtn_mstr_replace(info);
		else if (ap == Btn_upri_replace) doBtn_upri_replace(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_ins) doBtn_ins(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Cnd]パネルの[srch01]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch01(MCEventInfo info);

	/**
	 * [Cnd]パネルの[srch02]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch02(MCEventInfo info);

	/**
	 * [Btn]パネルの[mstr_replace]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_mstr_replace(MCEventInfo info);

	/**
	 * [Btn]パネルの[upri_replace]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upri_replace(MCEventInfo info);

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
		if (vc == Dtl1Table) return doDtl1_VC(info);
		if (vc == Dtl2Table) return doDtl2_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_srch_tgt_typ) return doCnd_srch_tgt_typ_VC(info);
		if (vc == Cnd_srch_tgt_typ_nm) return doCnd_srch_tgt_typ_nm_VC(info);
		if (vc == Cnd_srch_tgt_no) return doCnd_srch_tgt_no_VC(info);
		if (vc == columnDtl1_check) return doDtl1_check_VC(info);
		if (vc == columnDtl1_abort_flg) return doDtl1_abort_flg_VC(info);
		if (vc == columnDtl1_rqst_upd_stop_flg) return doDtl1_rqst_upd_stop_flg_VC(info);
		if (vc == columnDtl1_reg_dt) return doDtl1_reg_dt_VC(info);
		if (vc == columnDtl1_in_to_loc_cd) return doDtl1_in_to_loc_cd_VC(info);
		if (vc == columnDtl1_in_to_loc_nm) return doDtl1_in_to_loc_nm_VC(info);
		if (vc == columnDtl1_in_to_loc_wg_cd) return doDtl1_in_to_loc_wg_cd_VC(info);
		if (vc == columnDtl1_in_to_loc_wg_nm) return doDtl1_in_to_loc_wg_nm_VC(info);
		if (vc == columnDtl1_drct_dlv_typ) return doDtl1_drct_dlv_typ_VC(info);
		if (vc == columnDtl1_drct_dlv_typ_nm) return doDtl1_drct_dlv_typ_nm_VC(info);
		if (vc == columnDtl1_outsrc_sppl_cd) return doDtl1_outsrc_sppl_cd_VC(info);
		if (vc == columnDtl1_str_ln_tgt_flg) return doDtl1_str_ln_tgt_flg_VC(info);
		if (vc == columnDtl1_in_to_loc_cal_cd) return doDtl1_in_to_loc_cal_cd_VC(info);
		if (vc == columnDtl1_site_cd) return doDtl1_site_cd_VC(info);
		if (vc == columnDtl1_lg_grp_cd) return doDtl1_lg_grp_cd_VC(info);
		if (vc == columnDtl1_sundry_itm_flg) return doDtl1_sundry_itm_flg_VC(info);
		if (vc == columnDtl1_str_ln_cd) return doDtl1_str_ln_cd_VC(info);
		if (vc == columnDtl1_str_ln_nm) return doDtl1_str_ln_nm_VC(info);
		if (vc == columnDtl1_str_ln_cd_none_flg) return doDtl1_str_ln_cd_none_flg_VC(info);
		if (vc == columnDtl1_ver_flg) return doDtl1_ver_flg_VC(info);
		if (vc == columnDtl1_asset_mng_typ) return doDtl1_asset_mng_typ_VC(info);
		if (vc == columnDtl1_dscnt_itm_flg) return doDtl1_dscnt_itm_flg_VC(info);
		if (vc == columnDtl1_itm_purc_upri_cng_flg) return doDtl1_itm_purc_upri_cng_flg_VC(info);
		if (vc == columnDtl1_trd_unit_cd) return doDtl1_trd_unit_cd_VC(info);
		if (vc == columnDtl1_trd_unit_nm) return doDtl1_trd_unit_nm_VC(info);
		if (vc == columnDtl1_trd_unit_dec_place) return doDtl1_trd_unit_dec_place_VC(info);
		if (vc == columnDtl1_trd_unit_rnd_typ) return doDtl1_trd_unit_rnd_typ_VC(info);
		if (vc == columnDtl1_trd_unit_conv_base_qty) return doDtl1_trd_unit_conv_base_qty_VC(info);
		if (vc == columnDtl1_trd_unit_conv_qty) return doDtl1_trd_unit_conv_qty_VC(info);
		if (vc == columnDtl1_base_unit_cd) return doDtl1_base_unit_cd_VC(info);
		if (vc == columnDtl1_base_unit_nm) return doDtl1_base_unit_nm_VC(info);
		if (vc == columnDtl1_base_unit_dec_place) return doDtl1_base_unit_dec_place_VC(info);
		if (vc == columnDtl1_base_unit_rnd_typ) return doDtl1_base_unit_rnd_typ_VC(info);
		if (vc == columnDtl1_cont_fctr_flg) return doDtl1_cont_fctr_flg_VC(info);
		if (vc == columnDtl1_cont_fctr_dec_place) return doDtl1_cont_fctr_dec_place_VC(info);
		if (vc == columnDtl1_cont_fctr_rnd_typ) return doDtl1_cont_fctr_rnd_typ_VC(info);
		if (vc == columnDtl1_sppl_cd) return doDtl1_sppl_cd_VC(info);
		if (vc == columnDtl1_sppl_nm) return doDtl1_sppl_nm_VC(info);
		if (vc == columnDtl1_sppl_cntry_cd) return doDtl1_sppl_cntry_cd_VC(info);
		if (vc == columnDtl1_sppl_cntry_nm) return doDtl1_sppl_cntry_nm_VC(info);
		if (vc == columnDtl1_purc_amt_rnd_typ) return doDtl1_purc_amt_rnd_typ_VC(info);
		if (vc == columnDtl1_purc_tax_rnd_typ) return doDtl1_purc_tax_rnd_typ_VC(info);
		if (vc == columnDtl1_sppl_purc_upri_cng_flg) return doDtl1_sppl_purc_upri_cng_flg_VC(info);
		if (vc == columnDtl1_sppl_cal_cd) return doDtl1_sppl_cal_cd_VC(info);
		if (vc == columnDtl1_maker_cd) return doDtl1_maker_cd_VC(info);
		if (vc == columnDtl1_maker_nm) return doDtl1_maker_nm_VC(info);
		if (vc == columnDtl1_sppl_itm_cd) return doDtl1_sppl_itm_cd_VC(info);
		if (vc == columnDtl1_sppl_itm_nm) return doDtl1_sppl_itm_nm_VC(info);
		if (vc == columnDtl1_iv_itm_nm) return doDtl1_iv_itm_nm_VC(info);
		if (vc == columnDtl1_rqst_avl_rqst_dt) return doDtl1_rqst_avl_rqst_dt_VC(info);
		if (vc == columnDtl1_purc_schd_dt) return doDtl1_purc_schd_dt_VC(info);
		if (vc == columnDtl1_po_schd_dt) return doDtl1_po_schd_dt_VC(info);
		if (vc == columnDtl1_purc_dpt_wg_cd) return doDtl1_purc_dpt_wg_cd_VC(info);
		if (vc == columnDtl1_purc_dpt_wg_nm) return doDtl1_purc_dpt_wg_nm_VC(info);
		if (vc == columnDtl1_purc_upri_req_typ) return doDtl1_purc_upri_req_typ_VC(info);
		if (vc == columnDtl1_purc_upri_req_typ_nm) return doDtl1_purc_upri_req_typ_nm_VC(info);
		if (vc == columnDtl1_trd_cur_cd) return doDtl1_trd_cur_cd_VC(info);
		if (vc == columnDtl1_trd_cur_nm) return doDtl1_trd_cur_nm_VC(info);
		if (vc == columnDtl1_trd_cur_amt_dec_place) return doDtl1_trd_cur_amt_dec_place_VC(info);
		if (vc == columnDtl1_trd_cur_upri_dec_place) return doDtl1_trd_cur_upri_dec_place_VC(info);
		if (vc == columnDtl1_repurc_obli_flg) return doDtl1_repurc_obli_flg_VC(info);
		if (vc == columnDtl1_outsrc_upri_typ) return doDtl1_outsrc_upri_typ_VC(info);
		if (vc == columnDtl1_old_trd_cur_upri) return doDtl1_old_trd_cur_upri_VC(info);
		if (vc == columnDtl1_old_trd_cur_proc_upri) return doDtl1_old_trd_cur_proc_upri_VC(info);
		if (vc == columnDtl1_old_trd_cur_onr_prov_upri) return doDtl1_old_trd_cur_onr_prov_upri_VC(info);
		if (vc == columnDtl1_old_interim_flg) return doDtl1_old_interim_flg_VC(info);
		if (vc == columnDtl1_xrate_cd) return doDtl1_xrate_cd_VC(info);
		if (vc == columnDtl1_xrate_inpt_flg) return doDtl1_xrate_inpt_flg_VC(info);
		if (vc == columnDtl1_base_cur_cd) return doDtl1_base_cur_cd_VC(info);
		if (vc == columnDtl1_base_cur_nm) return doDtl1_base_cur_nm_VC(info);
		if (vc == columnDtl1_base_cur_amt_dec_place) return doDtl1_base_cur_amt_dec_place_VC(info);
		if (vc == columnDtl1_base_cur_upri_dec_place) return doDtl1_base_cur_upri_dec_place_VC(info);
		if (vc == columnDtl1_ptax_xrate_inpt_flg) return doDtl1_ptax_xrate_inpt_flg_VC(info);
		if (vc == columnDtl1_ptax_cur_cd) return doDtl1_ptax_cur_cd_VC(info);
		if (vc == columnDtl1_ptax_cur_nm) return doDtl1_ptax_cur_nm_VC(info);
		if (vc == columnDtl1_ptax_cur_amt_dec_place) return doDtl1_ptax_cur_amt_dec_place_VC(info);
		if (vc == columnDtl1_ptax_cur_upri_dec_place) return doDtl1_ptax_cur_upri_dec_place_VC(info);
		if (vc == columnDtl1_purc_rsn_cd) return doDtl1_purc_rsn_cd_VC(info);
		if (vc == columnDtl1_purc_rsn_nm) return doDtl1_purc_rsn_nm_VC(info);
		if (vc == columnDtl1_xpns_purc_flg) return doDtl1_xpns_purc_flg_VC(info);
		if (vc == columnDtl1_not_xpns_purc_flg) return doDtl1_not_xpns_purc_flg_VC(info);
		if (vc == columnDtl1_intr_rmrks) return doDtl1_intr_rmrks_VC(info);
		if (vc == columnDtl1_trd_d_rmrks) return doDtl1_trd_d_rmrks_VC(info);
		if (vc == columnDtl1_po_cnt_rmrks) return doDtl1_po_cnt_rmrks_VC(info);
		if (vc == columnDtl1_mfg_loc_cd) return doDtl1_mfg_loc_cd_VC(info);
		if (vc == columnDtl1_mfg_loc_nm) return doDtl1_mfg_loc_nm_VC(info);
		if (vc == columnDtl1_bom_ptn) return doDtl1_bom_ptn_VC(info);
		if (vc == columnDtl1_outsrc_flg) return doDtl1_outsrc_flg_VC(info);
		if (vc == columnDtl1_outsrc_itm_ord_no) return doDtl1_outsrc_itm_ord_no_VC(info);
		if (vc == columnDtl1_bd_lot_mng_typ) return doDtl1_bd_lot_mng_typ_VC(info);
		if (vc == columnDtl1_bd_sublot_mng_typ) return doDtl1_bd_sublot_mng_typ_VC(info);
		if (vc == columnDtl1_bd_lot_no_typ) return doDtl1_bd_lot_no_typ_VC(info);
		if (vc == columnDtl1_bd_sublot_no_typ) return doDtl1_bd_sublot_no_typ_VC(info);
		if (vc == columnDtl1_bd_sno1_mng_typ) return doDtl1_bd_sno1_mng_typ_VC(info);
		if (vc == columnDtl1_bd_sno2_mng_typ) return doDtl1_bd_sno2_mng_typ_VC(info);
		if (vc == columnDtl1_bd_sno3_mng_typ) return doDtl1_bd_sno3_mng_typ_VC(info);
		if (vc == columnDtl1_bd_sno4_mng_typ) return doDtl1_bd_sno4_mng_typ_VC(info);
		if (vc == columnDtl1_rqst_fr_usr_cd) return doDtl1_rqst_fr_usr_cd_VC(info);
		if (vc == columnDtl1_rqst_fr_usr_nm) return doDtl1_rqst_fr_usr_nm_VC(info);
		if (vc == columnDtl1_rqst_fr_dpt_cd) return doDtl1_rqst_fr_dpt_cd_VC(info);
		if (vc == columnDtl1_rqst_fr_dpt_nm) return doDtl1_rqst_fr_dpt_nm_VC(info);
		if (vc == columnDtl1_po_schd_no) return doDtl1_po_schd_no_VC(info);
		if (vc == columnDtl1_trd_ptn_typ) return doDtl1_trd_ptn_typ_VC(info);
		if (vc == columnDtl1_po_schd_src_typ) return doDtl1_po_schd_src_typ_VC(info);
		if (vc == columnDtl1_ins_usr_id) return doDtl1_ins_usr_id_VC(info);
		if (vc == columnDtl1_ins_usr_nm) return doDtl1_ins_usr_nm_VC(info);
		if (vc == columnDtl1_ins_func_id) return doDtl1_ins_func_id_VC(info);
		if (vc == columnDtl1_ins_func_nm) return doDtl1_ins_func_nm_VC(info);
		if (vc == columnDtl1_ins_ts) return doDtl1_ins_ts_VC(info);
		if (vc == columnDtl1_upd_usr_id) return doDtl1_upd_usr_id_VC(info);
		if (vc == columnDtl1_upd_usr_nm) return doDtl1_upd_usr_nm_VC(info);
		if (vc == columnDtl1_upd_func_id) return doDtl1_upd_func_id_VC(info);
		if (vc == columnDtl1_upd_func_nm) return doDtl1_upd_func_nm_VC(info);
		if (vc == columnDtl1_upd_ts) return doDtl1_upd_ts_VC(info);
		if (vc == columnDtl1_upd_srv_req_no) return doDtl1_upd_srv_req_no_VC(info);
		if (vc == columnDtl1_po_schd_upd_cntr) return doDtl1_po_schd_upd_cntr_VC(info);
		if (vc == columnDtl1_base_dt) return doDtl1_base_dt_VC(info);
		if (vc == columnDtl2_check) return doDtl2_check_VC(info);
		if (vc == columnDtl2_abort_flg) return doDtl2_abort_flg_VC(info);
		if (vc == columnDtl2_rqst_upd_stop_flg) return doDtl2_rqst_upd_stop_flg_VC(info);
		if (vc == columnDtl2_reg_dt) return doDtl2_reg_dt_VC(info);
		if (vc == columnDtl2_in_to_loc_cd) return doDtl2_in_to_loc_cd_VC(info);
		if (vc == columnDtl2_in_to_loc_nm) return doDtl2_in_to_loc_nm_VC(info);
		if (vc == columnDtl2_in_to_loc_wg_cd) return doDtl2_in_to_loc_wg_cd_VC(info);
		if (vc == columnDtl2_in_to_loc_wg_nm) return doDtl2_in_to_loc_wg_nm_VC(info);
		if (vc == columnDtl2_drct_dlv_typ) return doDtl2_drct_dlv_typ_VC(info);
		if (vc == columnDtl2_drct_dlv_typ_nm) return doDtl2_drct_dlv_typ_nm_VC(info);
		if (vc == columnDtl2_outsrc_sppl_cd) return doDtl2_outsrc_sppl_cd_VC(info);
		if (vc == columnDtl2_str_ln_tgt_flg) return doDtl2_str_ln_tgt_flg_VC(info);
		if (vc == columnDtl2_in_to_loc_cal_cd) return doDtl2_in_to_loc_cal_cd_VC(info);
		if (vc == columnDtl2_site_cd) return doDtl2_site_cd_VC(info);
		if (vc == columnDtl2_lg_grp_cd) return doDtl2_lg_grp_cd_VC(info);
		if (vc == columnDtl2_str_ln_cd) return doDtl2_str_ln_cd_VC(info);
		if (vc == columnDtl2_str_ln_nm) return doDtl2_str_ln_nm_VC(info);
		if (vc == columnDtl2_str_ln_cd_none_flg) return doDtl2_str_ln_cd_none_flg_VC(info);
		if (vc == columnDtl2_rqst_avl_rqst_dt) return doDtl2_rqst_avl_rqst_dt_VC(info);
		if (vc == columnDtl2_sundry_itm_flg) return doDtl2_sundry_itm_flg_VC(info);
		if (vc == columnDtl2_ver_flg) return doDtl2_ver_flg_VC(info);
		if (vc == columnDtl2_asset_mng_typ) return doDtl2_asset_mng_typ_VC(info);
		if (vc == columnDtl2_dscnt_itm_flg) return doDtl2_dscnt_itm_flg_VC(info);
		if (vc == columnDtl2_itm_purc_upri_cng_flg) return doDtl2_itm_purc_upri_cng_flg_VC(info);
		if (vc == columnDtl2_trd_unit_cd) return doDtl2_trd_unit_cd_VC(info);
		if (vc == columnDtl2_trd_unit_nm) return doDtl2_trd_unit_nm_VC(info);
		if (vc == columnDtl2_trd_unit_dec_place) return doDtl2_trd_unit_dec_place_VC(info);
		if (vc == columnDtl2_trd_unit_rnd_typ) return doDtl2_trd_unit_rnd_typ_VC(info);
		if (vc == columnDtl2_trd_unit_conv_base_qty) return doDtl2_trd_unit_conv_base_qty_VC(info);
		if (vc == columnDtl2_trd_unit_conv_qty) return doDtl2_trd_unit_conv_qty_VC(info);
		if (vc == columnDtl2_base_unit_cd) return doDtl2_base_unit_cd_VC(info);
		if (vc == columnDtl2_base_unit_nm) return doDtl2_base_unit_nm_VC(info);
		if (vc == columnDtl2_base_unit_dec_place) return doDtl2_base_unit_dec_place_VC(info);
		if (vc == columnDtl2_base_unit_rnd_typ) return doDtl2_base_unit_rnd_typ_VC(info);
		if (vc == columnDtl2_cont_fctr_flg) return doDtl2_cont_fctr_flg_VC(info);
		if (vc == columnDtl2_cont_fctr_dec_place) return doDtl2_cont_fctr_dec_place_VC(info);
		if (vc == columnDtl2_cont_fctr_rnd_typ) return doDtl2_cont_fctr_rnd_typ_VC(info);
		if (vc == columnDtl2_sppl_cd) return doDtl2_sppl_cd_VC(info);
		if (vc == columnDtl2_sppl_nm) return doDtl2_sppl_nm_VC(info);
		if (vc == columnDtl2_sppl_cntry_cd) return doDtl2_sppl_cntry_cd_VC(info);
		if (vc == columnDtl2_sppl_cntry_nm) return doDtl2_sppl_cntry_nm_VC(info);
		if (vc == columnDtl2_purc_amt_rnd_typ) return doDtl2_purc_amt_rnd_typ_VC(info);
		if (vc == columnDtl2_purc_tax_rnd_typ) return doDtl2_purc_tax_rnd_typ_VC(info);
		if (vc == columnDtl2_sppl_purc_upri_cng_flg) return doDtl2_sppl_purc_upri_cng_flg_VC(info);
		if (vc == columnDtl2_sppl_cal_cd) return doDtl2_sppl_cal_cd_VC(info);
		if (vc == columnDtl2_maker_cd) return doDtl2_maker_cd_VC(info);
		if (vc == columnDtl2_maker_nm) return doDtl2_maker_nm_VC(info);
		if (vc == columnDtl2_sppl_itm_cd) return doDtl2_sppl_itm_cd_VC(info);
		if (vc == columnDtl2_sppl_itm_nm) return doDtl2_sppl_itm_nm_VC(info);
		if (vc == columnDtl2_iv_itm_nm) return doDtl2_iv_itm_nm_VC(info);
		if (vc == columnDtl2_purc_schd_dt) return doDtl2_purc_schd_dt_VC(info);
		if (vc == columnDtl2_po_schd_dt) return doDtl2_po_schd_dt_VC(info);
		if (vc == columnDtl2_purc_dpt_wg_cd) return doDtl2_purc_dpt_wg_cd_VC(info);
		if (vc == columnDtl2_purc_dpt_wg_nm) return doDtl2_purc_dpt_wg_nm_VC(info);
		if (vc == columnDtl2_purc_upri_req_typ) return doDtl2_purc_upri_req_typ_VC(info);
		if (vc == columnDtl2_purc_upri_req_typ_nm) return doDtl2_purc_upri_req_typ_nm_VC(info);
		if (vc == columnDtl2_trd_cur_cd) return doDtl2_trd_cur_cd_VC(info);
		if (vc == columnDtl2_trd_cur_nm) return doDtl2_trd_cur_nm_VC(info);
		if (vc == columnDtl2_trd_cur_amt_dec_place) return doDtl2_trd_cur_amt_dec_place_VC(info);
		if (vc == columnDtl2_trd_cur_upri_dec_place) return doDtl2_trd_cur_upri_dec_place_VC(info);
		if (vc == columnDtl2_repurc_obli_flg) return doDtl2_repurc_obli_flg_VC(info);
		if (vc == columnDtl2_outsrc_upri_typ) return doDtl2_outsrc_upri_typ_VC(info);
		if (vc == columnDtl2_old_trd_cur_upri) return doDtl2_old_trd_cur_upri_VC(info);
		if (vc == columnDtl2_old_trd_cur_proc_upri) return doDtl2_old_trd_cur_proc_upri_VC(info);
		if (vc == columnDtl2_old_trd_cur_onr_prov_upri) return doDtl2_old_trd_cur_onr_prov_upri_VC(info);
		if (vc == columnDtl2_old_interim_flg) return doDtl2_old_interim_flg_VC(info);
		if (vc == columnDtl2_xrate_cd) return doDtl2_xrate_cd_VC(info);
		if (vc == columnDtl2_xrate_inpt_flg) return doDtl2_xrate_inpt_flg_VC(info);
		if (vc == columnDtl2_base_cur_cd) return doDtl2_base_cur_cd_VC(info);
		if (vc == columnDtl2_base_cur_nm) return doDtl2_base_cur_nm_VC(info);
		if (vc == columnDtl2_base_cur_amt_dec_place) return doDtl2_base_cur_amt_dec_place_VC(info);
		if (vc == columnDtl2_base_cur_upri_dec_place) return doDtl2_base_cur_upri_dec_place_VC(info);
		if (vc == columnDtl2_ptax_xrate_inpt_flg) return doDtl2_ptax_xrate_inpt_flg_VC(info);
		if (vc == columnDtl2_ptax_cur_cd) return doDtl2_ptax_cur_cd_VC(info);
		if (vc == columnDtl2_ptax_cur_nm) return doDtl2_ptax_cur_nm_VC(info);
		if (vc == columnDtl2_ptax_cur_amt_dec_place) return doDtl2_ptax_cur_amt_dec_place_VC(info);
		if (vc == columnDtl2_ptax_cur_upri_dec_place) return doDtl2_ptax_cur_upri_dec_place_VC(info);
		if (vc == columnDtl2_purc_rsn_cd) return doDtl2_purc_rsn_cd_VC(info);
		if (vc == columnDtl2_purc_rsn_nm) return doDtl2_purc_rsn_nm_VC(info);
		if (vc == columnDtl2_xpns_purc_flg) return doDtl2_xpns_purc_flg_VC(info);
		if (vc == columnDtl2_not_xpns_purc_flg) return doDtl2_not_xpns_purc_flg_VC(info);
		if (vc == columnDtl2_intr_rmrks) return doDtl2_intr_rmrks_VC(info);
		if (vc == columnDtl2_trd_d_rmrks) return doDtl2_trd_d_rmrks_VC(info);
		if (vc == columnDtl2_po_cnt_rmrks) return doDtl2_po_cnt_rmrks_VC(info);
		if (vc == columnDtl2_mfg_loc_cd) return doDtl2_mfg_loc_cd_VC(info);
		if (vc == columnDtl2_mfg_loc_nm) return doDtl2_mfg_loc_nm_VC(info);
		if (vc == columnDtl2_bom_ptn) return doDtl2_bom_ptn_VC(info);
		if (vc == columnDtl2_outsrc_flg) return doDtl2_outsrc_flg_VC(info);
		if (vc == columnDtl2_outsrc_itm_ord_no) return doDtl2_outsrc_itm_ord_no_VC(info);
		if (vc == columnDtl2_bd_lot_mng_typ) return doDtl2_bd_lot_mng_typ_VC(info);
		if (vc == columnDtl2_bd_sublot_mng_typ) return doDtl2_bd_sublot_mng_typ_VC(info);
		if (vc == columnDtl2_bd_lot_no_typ) return doDtl2_bd_lot_no_typ_VC(info);
		if (vc == columnDtl2_bd_sublot_no_typ) return doDtl2_bd_sublot_no_typ_VC(info);
		if (vc == columnDtl2_bd_sno1_mng_typ) return doDtl2_bd_sno1_mng_typ_VC(info);
		if (vc == columnDtl2_bd_sno2_mng_typ) return doDtl2_bd_sno2_mng_typ_VC(info);
		if (vc == columnDtl2_bd_sno3_mng_typ) return doDtl2_bd_sno3_mng_typ_VC(info);
		if (vc == columnDtl2_bd_sno4_mng_typ) return doDtl2_bd_sno4_mng_typ_VC(info);
		if (vc == columnDtl2_rqst_fr_usr_cd) return doDtl2_rqst_fr_usr_cd_VC(info);
		if (vc == columnDtl2_rqst_fr_usr_nm) return doDtl2_rqst_fr_usr_nm_VC(info);
		if (vc == columnDtl2_rqst_fr_dpt_cd) return doDtl2_rqst_fr_dpt_cd_VC(info);
		if (vc == columnDtl2_rqst_fr_dpt_nm) return doDtl2_rqst_fr_dpt_nm_VC(info);
		if (vc == columnDtl2_po_schd_no) return doDtl2_po_schd_no_VC(info);
		if (vc == columnDtl2_trd_ptn_typ) return doDtl2_trd_ptn_typ_VC(info);
		if (vc == columnDtl2_po_schd_src_typ) return doDtl2_po_schd_src_typ_VC(info);
		if (vc == columnDtl2_ins_usr_id) return doDtl2_ins_usr_id_VC(info);
		if (vc == columnDtl2_ins_usr_nm) return doDtl2_ins_usr_nm_VC(info);
		if (vc == columnDtl2_ins_func_id) return doDtl2_ins_func_id_VC(info);
		if (vc == columnDtl2_ins_func_nm) return doDtl2_ins_func_nm_VC(info);
		if (vc == columnDtl2_ins_ts) return doDtl2_ins_ts_VC(info);
		if (vc == columnDtl2_upd_usr_id) return doDtl2_upd_usr_id_VC(info);
		if (vc == columnDtl2_upd_usr_nm) return doDtl2_upd_usr_nm_VC(info);
		if (vc == columnDtl2_upd_func_id) return doDtl2_upd_func_id_VC(info);
		if (vc == columnDtl2_upd_func_nm) return doDtl2_upd_func_nm_VC(info);
		if (vc == columnDtl2_upd_ts) return doDtl2_upd_ts_VC(info);
		if (vc == columnDtl2_upd_srv_req_no) return doDtl2_upd_srv_req_no_VC(info);
		if (vc == columnDtl2_po_schd_upd_cntr) return doDtl2_po_schd_upd_cntr_VC(info);
		if (vc == columnDtl2_base_dt) return doDtl2_base_dt_VC(info);
		return true;
	}

	/**
	 * [Dtl1]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_VC(MCEventInfo info){
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
	 * [Dtl1]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[abort_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_abort_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[rqst_upd_stop_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_rqst_upd_stop_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[reg_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_reg_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[in_to_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_in_to_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[in_to_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_in_to_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[in_to_loc_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_in_to_loc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[in_to_loc_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_in_to_loc_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[drct_dlv_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_drct_dlv_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[drct_dlv_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_drct_dlv_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[outsrc_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_outsrc_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[in_to_loc_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_in_to_loc_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sundry_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[str_ln_cd_none_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_str_ln_cd_none_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ver_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_asset_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[dscnt_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_dscnt_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[itm_purc_upri_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_itm_purc_upri_cng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[trd_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_trd_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[trd_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_trd_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[trd_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_trd_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[base_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_base_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[cont_fctr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_cont_fctr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[cont_fctr_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_cont_fctr_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_cont_fctr_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sppl_cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sppl_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sppl_cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sppl_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[purc_amt_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_amt_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[purc_tax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_tax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sppl_purc_upri_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sppl_purc_upri_cng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sppl_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sppl_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_maker_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sppl_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sppl_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sppl_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sppl_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[iv_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_iv_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[rqst_avl_rqst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_rqst_avl_rqst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[purc_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[po_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_po_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[purc_dpt_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_dpt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[purc_dpt_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_dpt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[purc_upri_req_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_upri_req_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[purc_upri_req_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_upri_req_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[trd_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_trd_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[trd_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_trd_cur_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[repurc_obli_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_repurc_obli_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[outsrc_upri_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_outsrc_upri_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[old_trd_cur_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_old_trd_cur_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[old_trd_cur_proc_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_old_trd_cur_proc_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[old_trd_cur_onr_prov_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_old_trd_cur_onr_prov_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[old_interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_old_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_xrate_inpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[base_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_base_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[base_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_base_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[base_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_base_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[base_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_base_cur_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ptax_xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ptax_xrate_inpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ptax_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ptax_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ptax_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ptax_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ptax_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ptax_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ptax_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ptax_cur_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[purc_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[purc_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[xpns_purc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_xpns_purc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[not_xpns_purc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_not_xpns_purc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[po_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_po_cnt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[outsrc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_outsrc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[outsrc_itm_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_outsrc_itm_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[bd_lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_bd_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[bd_sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_bd_sublot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[bd_lot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_bd_lot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[bd_sublot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_bd_sublot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[bd_sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_bd_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[bd_sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_bd_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[bd_sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_bd_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[bd_sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_bd_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[rqst_fr_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_rqst_fr_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[rqst_fr_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_rqst_fr_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[rqst_fr_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_rqst_fr_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[rqst_fr_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_rqst_fr_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[po_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_po_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[po_schd_src_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_po_schd_src_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[po_schd_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_po_schd_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[base_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_base_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[abort_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_abort_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[rqst_upd_stop_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_rqst_upd_stop_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[reg_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_reg_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[in_to_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_in_to_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[in_to_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_in_to_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[in_to_loc_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_in_to_loc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[in_to_loc_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_in_to_loc_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[drct_dlv_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_drct_dlv_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[drct_dlv_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_drct_dlv_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[outsrc_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_outsrc_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[in_to_loc_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_in_to_loc_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[str_ln_cd_none_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_str_ln_cd_none_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[rqst_avl_rqst_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_rqst_avl_rqst_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sundry_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ver_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_asset_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[dscnt_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_dscnt_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[itm_purc_upri_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_itm_purc_upri_cng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[trd_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_trd_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[trd_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_trd_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[trd_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_trd_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[base_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_base_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[cont_fctr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_cont_fctr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[cont_fctr_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_cont_fctr_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_cont_fctr_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sppl_cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sppl_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sppl_cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sppl_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[purc_amt_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_purc_amt_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[purc_tax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_purc_tax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sppl_purc_upri_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sppl_purc_upri_cng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sppl_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sppl_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_maker_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sppl_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sppl_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sppl_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sppl_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[iv_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_iv_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[purc_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_purc_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[po_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_po_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[purc_dpt_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_purc_dpt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[purc_dpt_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_purc_dpt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[purc_upri_req_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_purc_upri_req_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[purc_upri_req_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_purc_upri_req_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[trd_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_trd_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[trd_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_trd_cur_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[repurc_obli_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_repurc_obli_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[outsrc_upri_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_outsrc_upri_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[old_trd_cur_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_old_trd_cur_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[old_trd_cur_proc_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_old_trd_cur_proc_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[old_trd_cur_onr_prov_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_old_trd_cur_onr_prov_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[old_interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_old_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_xrate_inpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[base_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_base_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[base_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_base_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[base_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_base_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[base_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_base_cur_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ptax_xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ptax_xrate_inpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ptax_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ptax_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ptax_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ptax_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ptax_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ptax_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ptax_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ptax_cur_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[purc_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_purc_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[purc_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_purc_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[xpns_purc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_xpns_purc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[not_xpns_purc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_not_xpns_purc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[po_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_po_cnt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[outsrc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_outsrc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[outsrc_itm_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_outsrc_itm_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[bd_lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_bd_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[bd_sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_bd_sublot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[bd_lot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_bd_lot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[bd_sublot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_bd_sublot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[bd_sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_bd_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[bd_sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_bd_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[bd_sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_bd_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[bd_sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_bd_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[rqst_fr_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_rqst_fr_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[rqst_fr_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_rqst_fr_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[rqst_fr_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_rqst_fr_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[rqst_fr_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_rqst_fr_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[po_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_po_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[po_schd_src_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_po_schd_src_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[po_schd_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_po_schd_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[base_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_base_dt_VC(MCEventInfo info){
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
		if (nc == Dtl1Table) doDtl1_NC(info);
		else if (nc == Dtl2Table) doDtl2_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_NC(info);
		else if (nc == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_NC(info);
		else if (nc == Cnd_srch_tgt_no) doCnd_srch_tgt_no_NC(info);
		else if (nc == columnDtl1_check) doDtl1_check_NC(info);
		else if (nc == columnDtl1_abort_flg) doDtl1_abort_flg_NC(info);
		else if (nc == columnDtl1_rqst_upd_stop_flg) doDtl1_rqst_upd_stop_flg_NC(info);
		else if (nc == columnDtl1_reg_dt) doDtl1_reg_dt_NC(info);
		else if (nc == columnDtl1_in_to_loc_cd) doDtl1_in_to_loc_cd_NC(info);
		else if (nc == columnDtl1_in_to_loc_nm) doDtl1_in_to_loc_nm_NC(info);
		else if (nc == columnDtl1_in_to_loc_wg_cd) doDtl1_in_to_loc_wg_cd_NC(info);
		else if (nc == columnDtl1_in_to_loc_wg_nm) doDtl1_in_to_loc_wg_nm_NC(info);
		else if (nc == columnDtl1_drct_dlv_typ) doDtl1_drct_dlv_typ_NC(info);
		else if (nc == columnDtl1_drct_dlv_typ_nm) doDtl1_drct_dlv_typ_nm_NC(info);
		else if (nc == columnDtl1_outsrc_sppl_cd) doDtl1_outsrc_sppl_cd_NC(info);
		else if (nc == columnDtl1_str_ln_tgt_flg) doDtl1_str_ln_tgt_flg_NC(info);
		else if (nc == columnDtl1_in_to_loc_cal_cd) doDtl1_in_to_loc_cal_cd_NC(info);
		else if (nc == columnDtl1_site_cd) doDtl1_site_cd_NC(info);
		else if (nc == columnDtl1_lg_grp_cd) doDtl1_lg_grp_cd_NC(info);
		else if (nc == columnDtl1_sundry_itm_flg) doDtl1_sundry_itm_flg_NC(info);
		else if (nc == columnDtl1_str_ln_cd) doDtl1_str_ln_cd_NC(info);
		else if (nc == columnDtl1_str_ln_nm) doDtl1_str_ln_nm_NC(info);
		else if (nc == columnDtl1_str_ln_cd_none_flg) doDtl1_str_ln_cd_none_flg_NC(info);
		else if (nc == columnDtl1_ver_flg) doDtl1_ver_flg_NC(info);
		else if (nc == columnDtl1_asset_mng_typ) doDtl1_asset_mng_typ_NC(info);
		else if (nc == columnDtl1_dscnt_itm_flg) doDtl1_dscnt_itm_flg_NC(info);
		else if (nc == columnDtl1_itm_purc_upri_cng_flg) doDtl1_itm_purc_upri_cng_flg_NC(info);
		else if (nc == columnDtl1_trd_unit_cd) doDtl1_trd_unit_cd_NC(info);
		else if (nc == columnDtl1_trd_unit_nm) doDtl1_trd_unit_nm_NC(info);
		else if (nc == columnDtl1_trd_unit_dec_place) doDtl1_trd_unit_dec_place_NC(info);
		else if (nc == columnDtl1_trd_unit_rnd_typ) doDtl1_trd_unit_rnd_typ_NC(info);
		else if (nc == columnDtl1_trd_unit_conv_base_qty) doDtl1_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnDtl1_trd_unit_conv_qty) doDtl1_trd_unit_conv_qty_NC(info);
		else if (nc == columnDtl1_base_unit_cd) doDtl1_base_unit_cd_NC(info);
		else if (nc == columnDtl1_base_unit_nm) doDtl1_base_unit_nm_NC(info);
		else if (nc == columnDtl1_base_unit_dec_place) doDtl1_base_unit_dec_place_NC(info);
		else if (nc == columnDtl1_base_unit_rnd_typ) doDtl1_base_unit_rnd_typ_NC(info);
		else if (nc == columnDtl1_cont_fctr_flg) doDtl1_cont_fctr_flg_NC(info);
		else if (nc == columnDtl1_cont_fctr_dec_place) doDtl1_cont_fctr_dec_place_NC(info);
		else if (nc == columnDtl1_cont_fctr_rnd_typ) doDtl1_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnDtl1_sppl_cd) doDtl1_sppl_cd_NC(info);
		else if (nc == columnDtl1_sppl_nm) doDtl1_sppl_nm_NC(info);
		else if (nc == columnDtl1_sppl_cntry_cd) doDtl1_sppl_cntry_cd_NC(info);
		else if (nc == columnDtl1_sppl_cntry_nm) doDtl1_sppl_cntry_nm_NC(info);
		else if (nc == columnDtl1_purc_amt_rnd_typ) doDtl1_purc_amt_rnd_typ_NC(info);
		else if (nc == columnDtl1_purc_tax_rnd_typ) doDtl1_purc_tax_rnd_typ_NC(info);
		else if (nc == columnDtl1_sppl_purc_upri_cng_flg) doDtl1_sppl_purc_upri_cng_flg_NC(info);
		else if (nc == columnDtl1_sppl_cal_cd) doDtl1_sppl_cal_cd_NC(info);
		else if (nc == columnDtl1_maker_cd) doDtl1_maker_cd_NC(info);
		else if (nc == columnDtl1_maker_nm) doDtl1_maker_nm_NC(info);
		else if (nc == columnDtl1_sppl_itm_cd) doDtl1_sppl_itm_cd_NC(info);
		else if (nc == columnDtl1_sppl_itm_nm) doDtl1_sppl_itm_nm_NC(info);
		else if (nc == columnDtl1_iv_itm_nm) doDtl1_iv_itm_nm_NC(info);
		else if (nc == columnDtl1_rqst_avl_rqst_dt) doDtl1_rqst_avl_rqst_dt_NC(info);
		else if (nc == columnDtl1_purc_schd_dt) doDtl1_purc_schd_dt_NC(info);
		else if (nc == columnDtl1_po_schd_dt) doDtl1_po_schd_dt_NC(info);
		else if (nc == columnDtl1_purc_dpt_wg_cd) doDtl1_purc_dpt_wg_cd_NC(info);
		else if (nc == columnDtl1_purc_dpt_wg_nm) doDtl1_purc_dpt_wg_nm_NC(info);
		else if (nc == columnDtl1_purc_upri_req_typ) doDtl1_purc_upri_req_typ_NC(info);
		else if (nc == columnDtl1_purc_upri_req_typ_nm) doDtl1_purc_upri_req_typ_nm_NC(info);
		else if (nc == columnDtl1_trd_cur_cd) doDtl1_trd_cur_cd_NC(info);
		else if (nc == columnDtl1_trd_cur_nm) doDtl1_trd_cur_nm_NC(info);
		else if (nc == columnDtl1_trd_cur_amt_dec_place) doDtl1_trd_cur_amt_dec_place_NC(info);
		else if (nc == columnDtl1_trd_cur_upri_dec_place) doDtl1_trd_cur_upri_dec_place_NC(info);
		else if (nc == columnDtl1_repurc_obli_flg) doDtl1_repurc_obli_flg_NC(info);
		else if (nc == columnDtl1_outsrc_upri_typ) doDtl1_outsrc_upri_typ_NC(info);
		else if (nc == columnDtl1_old_trd_cur_upri) doDtl1_old_trd_cur_upri_NC(info);
		else if (nc == columnDtl1_old_trd_cur_proc_upri) doDtl1_old_trd_cur_proc_upri_NC(info);
		else if (nc == columnDtl1_old_trd_cur_onr_prov_upri) doDtl1_old_trd_cur_onr_prov_upri_NC(info);
		else if (nc == columnDtl1_old_interim_flg) doDtl1_old_interim_flg_NC(info);
		else if (nc == columnDtl1_xrate_cd) doDtl1_xrate_cd_NC(info);
		else if (nc == columnDtl1_xrate_inpt_flg) doDtl1_xrate_inpt_flg_NC(info);
		else if (nc == columnDtl1_base_cur_cd) doDtl1_base_cur_cd_NC(info);
		else if (nc == columnDtl1_base_cur_nm) doDtl1_base_cur_nm_NC(info);
		else if (nc == columnDtl1_base_cur_amt_dec_place) doDtl1_base_cur_amt_dec_place_NC(info);
		else if (nc == columnDtl1_base_cur_upri_dec_place) doDtl1_base_cur_upri_dec_place_NC(info);
		else if (nc == columnDtl1_ptax_xrate_inpt_flg) doDtl1_ptax_xrate_inpt_flg_NC(info);
		else if (nc == columnDtl1_ptax_cur_cd) doDtl1_ptax_cur_cd_NC(info);
		else if (nc == columnDtl1_ptax_cur_nm) doDtl1_ptax_cur_nm_NC(info);
		else if (nc == columnDtl1_ptax_cur_amt_dec_place) doDtl1_ptax_cur_amt_dec_place_NC(info);
		else if (nc == columnDtl1_ptax_cur_upri_dec_place) doDtl1_ptax_cur_upri_dec_place_NC(info);
		else if (nc == columnDtl1_purc_rsn_cd) doDtl1_purc_rsn_cd_NC(info);
		else if (nc == columnDtl1_purc_rsn_nm) doDtl1_purc_rsn_nm_NC(info);
		else if (nc == columnDtl1_xpns_purc_flg) doDtl1_xpns_purc_flg_NC(info);
		else if (nc == columnDtl1_not_xpns_purc_flg) doDtl1_not_xpns_purc_flg_NC(info);
		else if (nc == columnDtl1_intr_rmrks) doDtl1_intr_rmrks_NC(info);
		else if (nc == columnDtl1_trd_d_rmrks) doDtl1_trd_d_rmrks_NC(info);
		else if (nc == columnDtl1_po_cnt_rmrks) doDtl1_po_cnt_rmrks_NC(info);
		else if (nc == columnDtl1_mfg_loc_cd) doDtl1_mfg_loc_cd_NC(info);
		else if (nc == columnDtl1_mfg_loc_nm) doDtl1_mfg_loc_nm_NC(info);
		else if (nc == columnDtl1_bom_ptn) doDtl1_bom_ptn_NC(info);
		else if (nc == columnDtl1_outsrc_flg) doDtl1_outsrc_flg_NC(info);
		else if (nc == columnDtl1_outsrc_itm_ord_no) doDtl1_outsrc_itm_ord_no_NC(info);
		else if (nc == columnDtl1_bd_lot_mng_typ) doDtl1_bd_lot_mng_typ_NC(info);
		else if (nc == columnDtl1_bd_sublot_mng_typ) doDtl1_bd_sublot_mng_typ_NC(info);
		else if (nc == columnDtl1_bd_lot_no_typ) doDtl1_bd_lot_no_typ_NC(info);
		else if (nc == columnDtl1_bd_sublot_no_typ) doDtl1_bd_sublot_no_typ_NC(info);
		else if (nc == columnDtl1_bd_sno1_mng_typ) doDtl1_bd_sno1_mng_typ_NC(info);
		else if (nc == columnDtl1_bd_sno2_mng_typ) doDtl1_bd_sno2_mng_typ_NC(info);
		else if (nc == columnDtl1_bd_sno3_mng_typ) doDtl1_bd_sno3_mng_typ_NC(info);
		else if (nc == columnDtl1_bd_sno4_mng_typ) doDtl1_bd_sno4_mng_typ_NC(info);
		else if (nc == columnDtl1_rqst_fr_usr_cd) doDtl1_rqst_fr_usr_cd_NC(info);
		else if (nc == columnDtl1_rqst_fr_usr_nm) doDtl1_rqst_fr_usr_nm_NC(info);
		else if (nc == columnDtl1_rqst_fr_dpt_cd) doDtl1_rqst_fr_dpt_cd_NC(info);
		else if (nc == columnDtl1_rqst_fr_dpt_nm) doDtl1_rqst_fr_dpt_nm_NC(info);
		else if (nc == columnDtl1_po_schd_no) doDtl1_po_schd_no_NC(info);
		else if (nc == columnDtl1_trd_ptn_typ) doDtl1_trd_ptn_typ_NC(info);
		else if (nc == columnDtl1_po_schd_src_typ) doDtl1_po_schd_src_typ_NC(info);
		else if (nc == columnDtl1_ins_usr_id) doDtl1_ins_usr_id_NC(info);
		else if (nc == columnDtl1_ins_usr_nm) doDtl1_ins_usr_nm_NC(info);
		else if (nc == columnDtl1_ins_func_id) doDtl1_ins_func_id_NC(info);
		else if (nc == columnDtl1_ins_func_nm) doDtl1_ins_func_nm_NC(info);
		else if (nc == columnDtl1_ins_ts) doDtl1_ins_ts_NC(info);
		else if (nc == columnDtl1_upd_usr_id) doDtl1_upd_usr_id_NC(info);
		else if (nc == columnDtl1_upd_usr_nm) doDtl1_upd_usr_nm_NC(info);
		else if (nc == columnDtl1_upd_func_id) doDtl1_upd_func_id_NC(info);
		else if (nc == columnDtl1_upd_func_nm) doDtl1_upd_func_nm_NC(info);
		else if (nc == columnDtl1_upd_ts) doDtl1_upd_ts_NC(info);
		else if (nc == columnDtl1_upd_srv_req_no) doDtl1_upd_srv_req_no_NC(info);
		else if (nc == columnDtl1_po_schd_upd_cntr) doDtl1_po_schd_upd_cntr_NC(info);
		else if (nc == columnDtl1_base_dt) doDtl1_base_dt_NC(info);
		else if (nc == columnDtl2_check) doDtl2_check_NC(info);
		else if (nc == columnDtl2_abort_flg) doDtl2_abort_flg_NC(info);
		else if (nc == columnDtl2_rqst_upd_stop_flg) doDtl2_rqst_upd_stop_flg_NC(info);
		else if (nc == columnDtl2_reg_dt) doDtl2_reg_dt_NC(info);
		else if (nc == columnDtl2_in_to_loc_cd) doDtl2_in_to_loc_cd_NC(info);
		else if (nc == columnDtl2_in_to_loc_nm) doDtl2_in_to_loc_nm_NC(info);
		else if (nc == columnDtl2_in_to_loc_wg_cd) doDtl2_in_to_loc_wg_cd_NC(info);
		else if (nc == columnDtl2_in_to_loc_wg_nm) doDtl2_in_to_loc_wg_nm_NC(info);
		else if (nc == columnDtl2_drct_dlv_typ) doDtl2_drct_dlv_typ_NC(info);
		else if (nc == columnDtl2_drct_dlv_typ_nm) doDtl2_drct_dlv_typ_nm_NC(info);
		else if (nc == columnDtl2_outsrc_sppl_cd) doDtl2_outsrc_sppl_cd_NC(info);
		else if (nc == columnDtl2_str_ln_tgt_flg) doDtl2_str_ln_tgt_flg_NC(info);
		else if (nc == columnDtl2_in_to_loc_cal_cd) doDtl2_in_to_loc_cal_cd_NC(info);
		else if (nc == columnDtl2_site_cd) doDtl2_site_cd_NC(info);
		else if (nc == columnDtl2_lg_grp_cd) doDtl2_lg_grp_cd_NC(info);
		else if (nc == columnDtl2_str_ln_cd) doDtl2_str_ln_cd_NC(info);
		else if (nc == columnDtl2_str_ln_nm) doDtl2_str_ln_nm_NC(info);
		else if (nc == columnDtl2_str_ln_cd_none_flg) doDtl2_str_ln_cd_none_flg_NC(info);
		else if (nc == columnDtl2_rqst_avl_rqst_dt) doDtl2_rqst_avl_rqst_dt_NC(info);
		else if (nc == columnDtl2_sundry_itm_flg) doDtl2_sundry_itm_flg_NC(info);
		else if (nc == columnDtl2_ver_flg) doDtl2_ver_flg_NC(info);
		else if (nc == columnDtl2_asset_mng_typ) doDtl2_asset_mng_typ_NC(info);
		else if (nc == columnDtl2_dscnt_itm_flg) doDtl2_dscnt_itm_flg_NC(info);
		else if (nc == columnDtl2_itm_purc_upri_cng_flg) doDtl2_itm_purc_upri_cng_flg_NC(info);
		else if (nc == columnDtl2_trd_unit_cd) doDtl2_trd_unit_cd_NC(info);
		else if (nc == columnDtl2_trd_unit_nm) doDtl2_trd_unit_nm_NC(info);
		else if (nc == columnDtl2_trd_unit_dec_place) doDtl2_trd_unit_dec_place_NC(info);
		else if (nc == columnDtl2_trd_unit_rnd_typ) doDtl2_trd_unit_rnd_typ_NC(info);
		else if (nc == columnDtl2_trd_unit_conv_base_qty) doDtl2_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnDtl2_trd_unit_conv_qty) doDtl2_trd_unit_conv_qty_NC(info);
		else if (nc == columnDtl2_base_unit_cd) doDtl2_base_unit_cd_NC(info);
		else if (nc == columnDtl2_base_unit_nm) doDtl2_base_unit_nm_NC(info);
		else if (nc == columnDtl2_base_unit_dec_place) doDtl2_base_unit_dec_place_NC(info);
		else if (nc == columnDtl2_base_unit_rnd_typ) doDtl2_base_unit_rnd_typ_NC(info);
		else if (nc == columnDtl2_cont_fctr_flg) doDtl2_cont_fctr_flg_NC(info);
		else if (nc == columnDtl2_cont_fctr_dec_place) doDtl2_cont_fctr_dec_place_NC(info);
		else if (nc == columnDtl2_cont_fctr_rnd_typ) doDtl2_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnDtl2_sppl_cd) doDtl2_sppl_cd_NC(info);
		else if (nc == columnDtl2_sppl_nm) doDtl2_sppl_nm_NC(info);
		else if (nc == columnDtl2_sppl_cntry_cd) doDtl2_sppl_cntry_cd_NC(info);
		else if (nc == columnDtl2_sppl_cntry_nm) doDtl2_sppl_cntry_nm_NC(info);
		else if (nc == columnDtl2_purc_amt_rnd_typ) doDtl2_purc_amt_rnd_typ_NC(info);
		else if (nc == columnDtl2_purc_tax_rnd_typ) doDtl2_purc_tax_rnd_typ_NC(info);
		else if (nc == columnDtl2_sppl_purc_upri_cng_flg) doDtl2_sppl_purc_upri_cng_flg_NC(info);
		else if (nc == columnDtl2_sppl_cal_cd) doDtl2_sppl_cal_cd_NC(info);
		else if (nc == columnDtl2_maker_cd) doDtl2_maker_cd_NC(info);
		else if (nc == columnDtl2_maker_nm) doDtl2_maker_nm_NC(info);
		else if (nc == columnDtl2_sppl_itm_cd) doDtl2_sppl_itm_cd_NC(info);
		else if (nc == columnDtl2_sppl_itm_nm) doDtl2_sppl_itm_nm_NC(info);
		else if (nc == columnDtl2_iv_itm_nm) doDtl2_iv_itm_nm_NC(info);
		else if (nc == columnDtl2_purc_schd_dt) doDtl2_purc_schd_dt_NC(info);
		else if (nc == columnDtl2_po_schd_dt) doDtl2_po_schd_dt_NC(info);
		else if (nc == columnDtl2_purc_dpt_wg_cd) doDtl2_purc_dpt_wg_cd_NC(info);
		else if (nc == columnDtl2_purc_dpt_wg_nm) doDtl2_purc_dpt_wg_nm_NC(info);
		else if (nc == columnDtl2_purc_upri_req_typ) doDtl2_purc_upri_req_typ_NC(info);
		else if (nc == columnDtl2_purc_upri_req_typ_nm) doDtl2_purc_upri_req_typ_nm_NC(info);
		else if (nc == columnDtl2_trd_cur_cd) doDtl2_trd_cur_cd_NC(info);
		else if (nc == columnDtl2_trd_cur_nm) doDtl2_trd_cur_nm_NC(info);
		else if (nc == columnDtl2_trd_cur_amt_dec_place) doDtl2_trd_cur_amt_dec_place_NC(info);
		else if (nc == columnDtl2_trd_cur_upri_dec_place) doDtl2_trd_cur_upri_dec_place_NC(info);
		else if (nc == columnDtl2_repurc_obli_flg) doDtl2_repurc_obli_flg_NC(info);
		else if (nc == columnDtl2_outsrc_upri_typ) doDtl2_outsrc_upri_typ_NC(info);
		else if (nc == columnDtl2_old_trd_cur_upri) doDtl2_old_trd_cur_upri_NC(info);
		else if (nc == columnDtl2_old_trd_cur_proc_upri) doDtl2_old_trd_cur_proc_upri_NC(info);
		else if (nc == columnDtl2_old_trd_cur_onr_prov_upri) doDtl2_old_trd_cur_onr_prov_upri_NC(info);
		else if (nc == columnDtl2_old_interim_flg) doDtl2_old_interim_flg_NC(info);
		else if (nc == columnDtl2_xrate_cd) doDtl2_xrate_cd_NC(info);
		else if (nc == columnDtl2_xrate_inpt_flg) doDtl2_xrate_inpt_flg_NC(info);
		else if (nc == columnDtl2_base_cur_cd) doDtl2_base_cur_cd_NC(info);
		else if (nc == columnDtl2_base_cur_nm) doDtl2_base_cur_nm_NC(info);
		else if (nc == columnDtl2_base_cur_amt_dec_place) doDtl2_base_cur_amt_dec_place_NC(info);
		else if (nc == columnDtl2_base_cur_upri_dec_place) doDtl2_base_cur_upri_dec_place_NC(info);
		else if (nc == columnDtl2_ptax_xrate_inpt_flg) doDtl2_ptax_xrate_inpt_flg_NC(info);
		else if (nc == columnDtl2_ptax_cur_cd) doDtl2_ptax_cur_cd_NC(info);
		else if (nc == columnDtl2_ptax_cur_nm) doDtl2_ptax_cur_nm_NC(info);
		else if (nc == columnDtl2_ptax_cur_amt_dec_place) doDtl2_ptax_cur_amt_dec_place_NC(info);
		else if (nc == columnDtl2_ptax_cur_upri_dec_place) doDtl2_ptax_cur_upri_dec_place_NC(info);
		else if (nc == columnDtl2_purc_rsn_cd) doDtl2_purc_rsn_cd_NC(info);
		else if (nc == columnDtl2_purc_rsn_nm) doDtl2_purc_rsn_nm_NC(info);
		else if (nc == columnDtl2_xpns_purc_flg) doDtl2_xpns_purc_flg_NC(info);
		else if (nc == columnDtl2_not_xpns_purc_flg) doDtl2_not_xpns_purc_flg_NC(info);
		else if (nc == columnDtl2_intr_rmrks) doDtl2_intr_rmrks_NC(info);
		else if (nc == columnDtl2_trd_d_rmrks) doDtl2_trd_d_rmrks_NC(info);
		else if (nc == columnDtl2_po_cnt_rmrks) doDtl2_po_cnt_rmrks_NC(info);
		else if (nc == columnDtl2_mfg_loc_cd) doDtl2_mfg_loc_cd_NC(info);
		else if (nc == columnDtl2_mfg_loc_nm) doDtl2_mfg_loc_nm_NC(info);
		else if (nc == columnDtl2_bom_ptn) doDtl2_bom_ptn_NC(info);
		else if (nc == columnDtl2_outsrc_flg) doDtl2_outsrc_flg_NC(info);
		else if (nc == columnDtl2_outsrc_itm_ord_no) doDtl2_outsrc_itm_ord_no_NC(info);
		else if (nc == columnDtl2_bd_lot_mng_typ) doDtl2_bd_lot_mng_typ_NC(info);
		else if (nc == columnDtl2_bd_sublot_mng_typ) doDtl2_bd_sublot_mng_typ_NC(info);
		else if (nc == columnDtl2_bd_lot_no_typ) doDtl2_bd_lot_no_typ_NC(info);
		else if (nc == columnDtl2_bd_sublot_no_typ) doDtl2_bd_sublot_no_typ_NC(info);
		else if (nc == columnDtl2_bd_sno1_mng_typ) doDtl2_bd_sno1_mng_typ_NC(info);
		else if (nc == columnDtl2_bd_sno2_mng_typ) doDtl2_bd_sno2_mng_typ_NC(info);
		else if (nc == columnDtl2_bd_sno3_mng_typ) doDtl2_bd_sno3_mng_typ_NC(info);
		else if (nc == columnDtl2_bd_sno4_mng_typ) doDtl2_bd_sno4_mng_typ_NC(info);
		else if (nc == columnDtl2_rqst_fr_usr_cd) doDtl2_rqst_fr_usr_cd_NC(info);
		else if (nc == columnDtl2_rqst_fr_usr_nm) doDtl2_rqst_fr_usr_nm_NC(info);
		else if (nc == columnDtl2_rqst_fr_dpt_cd) doDtl2_rqst_fr_dpt_cd_NC(info);
		else if (nc == columnDtl2_rqst_fr_dpt_nm) doDtl2_rqst_fr_dpt_nm_NC(info);
		else if (nc == columnDtl2_po_schd_no) doDtl2_po_schd_no_NC(info);
		else if (nc == columnDtl2_trd_ptn_typ) doDtl2_trd_ptn_typ_NC(info);
		else if (nc == columnDtl2_po_schd_src_typ) doDtl2_po_schd_src_typ_NC(info);
		else if (nc == columnDtl2_ins_usr_id) doDtl2_ins_usr_id_NC(info);
		else if (nc == columnDtl2_ins_usr_nm) doDtl2_ins_usr_nm_NC(info);
		else if (nc == columnDtl2_ins_func_id) doDtl2_ins_func_id_NC(info);
		else if (nc == columnDtl2_ins_func_nm) doDtl2_ins_func_nm_NC(info);
		else if (nc == columnDtl2_ins_ts) doDtl2_ins_ts_NC(info);
		else if (nc == columnDtl2_upd_usr_id) doDtl2_upd_usr_id_NC(info);
		else if (nc == columnDtl2_upd_usr_nm) doDtl2_upd_usr_nm_NC(info);
		else if (nc == columnDtl2_upd_func_id) doDtl2_upd_func_id_NC(info);
		else if (nc == columnDtl2_upd_func_nm) doDtl2_upd_func_nm_NC(info);
		else if (nc == columnDtl2_upd_ts) doDtl2_upd_ts_NC(info);
		else if (nc == columnDtl2_upd_srv_req_no) doDtl2_upd_srv_req_no_NC(info);
		else if (nc == columnDtl2_po_schd_upd_cntr) doDtl2_po_schd_upd_cntr_NC(info);
		else if (nc == columnDtl2_base_dt) doDtl2_base_dt_NC(info);
	}

	/**
	 * [Dtl1]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_NC(MCEventInfo info){
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
	 * [Dtl1]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_abort_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rqst_upd_stop_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rqst_upd_stop_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[reg_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_reg_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[in_to_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_in_to_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[in_to_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_in_to_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[in_to_loc_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_in_to_loc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[in_to_loc_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_in_to_loc_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[drct_dlv_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_drct_dlv_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[drct_dlv_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_drct_dlv_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[outsrc_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_outsrc_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[in_to_loc_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_in_to_loc_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[str_ln_cd_none_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_str_ln_cd_none_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dscnt_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dscnt_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[itm_purc_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_itm_purc_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_amt_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_amt_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_tax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_tax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_purc_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_purc_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_maker_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[iv_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_iv_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rqst_avl_rqst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rqst_avl_rqst_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_dpt_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_dpt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_dpt_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_dpt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_upri_req_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_upri_req_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_upri_req_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_upri_req_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[repurc_obli_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_repurc_obli_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[outsrc_upri_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_outsrc_upri_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[old_trd_cur_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_old_trd_cur_upri_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[old_trd_cur_proc_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_old_trd_cur_proc_upri_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[old_trd_cur_onr_prov_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_old_trd_cur_onr_prov_upri_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[old_interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_old_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ptax_xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ptax_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ptax_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ptax_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ptax_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ptax_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ptax_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ptax_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ptax_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ptax_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[xpns_purc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_xpns_purc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[not_xpns_purc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_not_xpns_purc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[outsrc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_outsrc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[outsrc_itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_outsrc_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_lot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_lot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_sublot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_sublot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rqst_fr_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rqst_fr_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rqst_fr_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rqst_fr_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rqst_fr_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rqst_fr_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rqst_fr_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rqst_fr_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_schd_src_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_schd_src_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_schd_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_schd_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_abort_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rqst_upd_stop_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rqst_upd_stop_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[reg_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_reg_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[in_to_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_in_to_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[in_to_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_in_to_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[in_to_loc_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_in_to_loc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[in_to_loc_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_in_to_loc_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[drct_dlv_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_drct_dlv_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[drct_dlv_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_drct_dlv_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[outsrc_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_outsrc_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[in_to_loc_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_in_to_loc_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[str_ln_cd_none_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_str_ln_cd_none_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rqst_avl_rqst_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rqst_avl_rqst_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dscnt_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dscnt_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[itm_purc_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_itm_purc_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_amt_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_amt_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_tax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_tax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_purc_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_purc_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_maker_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[iv_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_iv_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_dpt_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_dpt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_dpt_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_dpt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_upri_req_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_upri_req_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_upri_req_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_upri_req_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[repurc_obli_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_repurc_obli_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[outsrc_upri_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_outsrc_upri_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[old_trd_cur_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_old_trd_cur_upri_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[old_trd_cur_proc_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_old_trd_cur_proc_upri_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[old_trd_cur_onr_prov_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_old_trd_cur_onr_prov_upri_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[old_interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_old_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ptax_xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ptax_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ptax_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ptax_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ptax_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ptax_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ptax_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ptax_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ptax_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ptax_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[xpns_purc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_xpns_purc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[not_xpns_purc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_not_xpns_purc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[outsrc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_outsrc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[outsrc_itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_outsrc_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_lot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_lot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_sublot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_sublot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rqst_fr_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rqst_fr_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rqst_fr_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rqst_fr_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rqst_fr_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rqst_fr_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rqst_fr_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rqst_fr_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_schd_src_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_schd_src_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_schd_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_schd_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_dt_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == Dtl1Table) doDtl1_NE(info);
		else if (ne == Dtl2Table) doDtl2_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_NE(info);
		else if (ne == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_NE(info);
		else if (ne == Cnd_srch_tgt_no) doCnd_srch_tgt_no_NE(info);
		else if (ne == columnDtl1_check) doDtl1_check_NE(info);
		else if (ne == columnDtl1_abort_flg) doDtl1_abort_flg_NE(info);
		else if (ne == columnDtl1_rqst_upd_stop_flg) doDtl1_rqst_upd_stop_flg_NE(info);
		else if (ne == columnDtl1_reg_dt) doDtl1_reg_dt_NE(info);
		else if (ne == columnDtl1_in_to_loc_cd) doDtl1_in_to_loc_cd_NE(info);
		else if (ne == columnDtl1_in_to_loc_nm) doDtl1_in_to_loc_nm_NE(info);
		else if (ne == columnDtl1_in_to_loc_wg_cd) doDtl1_in_to_loc_wg_cd_NE(info);
		else if (ne == columnDtl1_in_to_loc_wg_nm) doDtl1_in_to_loc_wg_nm_NE(info);
		else if (ne == columnDtl1_drct_dlv_typ) doDtl1_drct_dlv_typ_NE(info);
		else if (ne == columnDtl1_drct_dlv_typ_nm) doDtl1_drct_dlv_typ_nm_NE(info);
		else if (ne == columnDtl1_outsrc_sppl_cd) doDtl1_outsrc_sppl_cd_NE(info);
		else if (ne == columnDtl1_str_ln_tgt_flg) doDtl1_str_ln_tgt_flg_NE(info);
		else if (ne == columnDtl1_in_to_loc_cal_cd) doDtl1_in_to_loc_cal_cd_NE(info);
		else if (ne == columnDtl1_site_cd) doDtl1_site_cd_NE(info);
		else if (ne == columnDtl1_lg_grp_cd) doDtl1_lg_grp_cd_NE(info);
		else if (ne == columnDtl1_sundry_itm_flg) doDtl1_sundry_itm_flg_NE(info);
		else if (ne == columnDtl1_str_ln_cd) doDtl1_str_ln_cd_NE(info);
		else if (ne == columnDtl1_str_ln_nm) doDtl1_str_ln_nm_NE(info);
		else if (ne == columnDtl1_str_ln_cd_none_flg) doDtl1_str_ln_cd_none_flg_NE(info);
		else if (ne == columnDtl1_ver_flg) doDtl1_ver_flg_NE(info);
		else if (ne == columnDtl1_asset_mng_typ) doDtl1_asset_mng_typ_NE(info);
		else if (ne == columnDtl1_dscnt_itm_flg) doDtl1_dscnt_itm_flg_NE(info);
		else if (ne == columnDtl1_itm_purc_upri_cng_flg) doDtl1_itm_purc_upri_cng_flg_NE(info);
		else if (ne == columnDtl1_trd_unit_cd) doDtl1_trd_unit_cd_NE(info);
		else if (ne == columnDtl1_trd_unit_nm) doDtl1_trd_unit_nm_NE(info);
		else if (ne == columnDtl1_trd_unit_dec_place) doDtl1_trd_unit_dec_place_NE(info);
		else if (ne == columnDtl1_trd_unit_rnd_typ) doDtl1_trd_unit_rnd_typ_NE(info);
		else if (ne == columnDtl1_trd_unit_conv_base_qty) doDtl1_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnDtl1_trd_unit_conv_qty) doDtl1_trd_unit_conv_qty_NE(info);
		else if (ne == columnDtl1_base_unit_cd) doDtl1_base_unit_cd_NE(info);
		else if (ne == columnDtl1_base_unit_nm) doDtl1_base_unit_nm_NE(info);
		else if (ne == columnDtl1_base_unit_dec_place) doDtl1_base_unit_dec_place_NE(info);
		else if (ne == columnDtl1_base_unit_rnd_typ) doDtl1_base_unit_rnd_typ_NE(info);
		else if (ne == columnDtl1_cont_fctr_flg) doDtl1_cont_fctr_flg_NE(info);
		else if (ne == columnDtl1_cont_fctr_dec_place) doDtl1_cont_fctr_dec_place_NE(info);
		else if (ne == columnDtl1_cont_fctr_rnd_typ) doDtl1_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnDtl1_sppl_cd) doDtl1_sppl_cd_NE(info);
		else if (ne == columnDtl1_sppl_nm) doDtl1_sppl_nm_NE(info);
		else if (ne == columnDtl1_sppl_cntry_cd) doDtl1_sppl_cntry_cd_NE(info);
		else if (ne == columnDtl1_sppl_cntry_nm) doDtl1_sppl_cntry_nm_NE(info);
		else if (ne == columnDtl1_purc_amt_rnd_typ) doDtl1_purc_amt_rnd_typ_NE(info);
		else if (ne == columnDtl1_purc_tax_rnd_typ) doDtl1_purc_tax_rnd_typ_NE(info);
		else if (ne == columnDtl1_sppl_purc_upri_cng_flg) doDtl1_sppl_purc_upri_cng_flg_NE(info);
		else if (ne == columnDtl1_sppl_cal_cd) doDtl1_sppl_cal_cd_NE(info);
		else if (ne == columnDtl1_maker_cd) doDtl1_maker_cd_NE(info);
		else if (ne == columnDtl1_maker_nm) doDtl1_maker_nm_NE(info);
		else if (ne == columnDtl1_sppl_itm_cd) doDtl1_sppl_itm_cd_NE(info);
		else if (ne == columnDtl1_sppl_itm_nm) doDtl1_sppl_itm_nm_NE(info);
		else if (ne == columnDtl1_iv_itm_nm) doDtl1_iv_itm_nm_NE(info);
		else if (ne == columnDtl1_rqst_avl_rqst_dt) doDtl1_rqst_avl_rqst_dt_NE(info);
		else if (ne == columnDtl1_purc_schd_dt) doDtl1_purc_schd_dt_NE(info);
		else if (ne == columnDtl1_po_schd_dt) doDtl1_po_schd_dt_NE(info);
		else if (ne == columnDtl1_purc_dpt_wg_cd) doDtl1_purc_dpt_wg_cd_NE(info);
		else if (ne == columnDtl1_purc_dpt_wg_nm) doDtl1_purc_dpt_wg_nm_NE(info);
		else if (ne == columnDtl1_purc_upri_req_typ) doDtl1_purc_upri_req_typ_NE(info);
		else if (ne == columnDtl1_purc_upri_req_typ_nm) doDtl1_purc_upri_req_typ_nm_NE(info);
		else if (ne == columnDtl1_trd_cur_cd) doDtl1_trd_cur_cd_NE(info);
		else if (ne == columnDtl1_trd_cur_nm) doDtl1_trd_cur_nm_NE(info);
		else if (ne == columnDtl1_trd_cur_amt_dec_place) doDtl1_trd_cur_amt_dec_place_NE(info);
		else if (ne == columnDtl1_trd_cur_upri_dec_place) doDtl1_trd_cur_upri_dec_place_NE(info);
		else if (ne == columnDtl1_repurc_obli_flg) doDtl1_repurc_obli_flg_NE(info);
		else if (ne == columnDtl1_outsrc_upri_typ) doDtl1_outsrc_upri_typ_NE(info);
		else if (ne == columnDtl1_old_trd_cur_upri) doDtl1_old_trd_cur_upri_NE(info);
		else if (ne == columnDtl1_old_trd_cur_proc_upri) doDtl1_old_trd_cur_proc_upri_NE(info);
		else if (ne == columnDtl1_old_trd_cur_onr_prov_upri) doDtl1_old_trd_cur_onr_prov_upri_NE(info);
		else if (ne == columnDtl1_old_interim_flg) doDtl1_old_interim_flg_NE(info);
		else if (ne == columnDtl1_xrate_cd) doDtl1_xrate_cd_NE(info);
		else if (ne == columnDtl1_xrate_inpt_flg) doDtl1_xrate_inpt_flg_NE(info);
		else if (ne == columnDtl1_base_cur_cd) doDtl1_base_cur_cd_NE(info);
		else if (ne == columnDtl1_base_cur_nm) doDtl1_base_cur_nm_NE(info);
		else if (ne == columnDtl1_base_cur_amt_dec_place) doDtl1_base_cur_amt_dec_place_NE(info);
		else if (ne == columnDtl1_base_cur_upri_dec_place) doDtl1_base_cur_upri_dec_place_NE(info);
		else if (ne == columnDtl1_ptax_xrate_inpt_flg) doDtl1_ptax_xrate_inpt_flg_NE(info);
		else if (ne == columnDtl1_ptax_cur_cd) doDtl1_ptax_cur_cd_NE(info);
		else if (ne == columnDtl1_ptax_cur_nm) doDtl1_ptax_cur_nm_NE(info);
		else if (ne == columnDtl1_ptax_cur_amt_dec_place) doDtl1_ptax_cur_amt_dec_place_NE(info);
		else if (ne == columnDtl1_ptax_cur_upri_dec_place) doDtl1_ptax_cur_upri_dec_place_NE(info);
		else if (ne == columnDtl1_purc_rsn_cd) doDtl1_purc_rsn_cd_NE(info);
		else if (ne == columnDtl1_purc_rsn_nm) doDtl1_purc_rsn_nm_NE(info);
		else if (ne == columnDtl1_xpns_purc_flg) doDtl1_xpns_purc_flg_NE(info);
		else if (ne == columnDtl1_not_xpns_purc_flg) doDtl1_not_xpns_purc_flg_NE(info);
		else if (ne == columnDtl1_intr_rmrks) doDtl1_intr_rmrks_NE(info);
		else if (ne == columnDtl1_trd_d_rmrks) doDtl1_trd_d_rmrks_NE(info);
		else if (ne == columnDtl1_po_cnt_rmrks) doDtl1_po_cnt_rmrks_NE(info);
		else if (ne == columnDtl1_mfg_loc_cd) doDtl1_mfg_loc_cd_NE(info);
		else if (ne == columnDtl1_mfg_loc_nm) doDtl1_mfg_loc_nm_NE(info);
		else if (ne == columnDtl1_bom_ptn) doDtl1_bom_ptn_NE(info);
		else if (ne == columnDtl1_outsrc_flg) doDtl1_outsrc_flg_NE(info);
		else if (ne == columnDtl1_outsrc_itm_ord_no) doDtl1_outsrc_itm_ord_no_NE(info);
		else if (ne == columnDtl1_bd_lot_mng_typ) doDtl1_bd_lot_mng_typ_NE(info);
		else if (ne == columnDtl1_bd_sublot_mng_typ) doDtl1_bd_sublot_mng_typ_NE(info);
		else if (ne == columnDtl1_bd_lot_no_typ) doDtl1_bd_lot_no_typ_NE(info);
		else if (ne == columnDtl1_bd_sublot_no_typ) doDtl1_bd_sublot_no_typ_NE(info);
		else if (ne == columnDtl1_bd_sno1_mng_typ) doDtl1_bd_sno1_mng_typ_NE(info);
		else if (ne == columnDtl1_bd_sno2_mng_typ) doDtl1_bd_sno2_mng_typ_NE(info);
		else if (ne == columnDtl1_bd_sno3_mng_typ) doDtl1_bd_sno3_mng_typ_NE(info);
		else if (ne == columnDtl1_bd_sno4_mng_typ) doDtl1_bd_sno4_mng_typ_NE(info);
		else if (ne == columnDtl1_rqst_fr_usr_cd) doDtl1_rqst_fr_usr_cd_NE(info);
		else if (ne == columnDtl1_rqst_fr_usr_nm) doDtl1_rqst_fr_usr_nm_NE(info);
		else if (ne == columnDtl1_rqst_fr_dpt_cd) doDtl1_rqst_fr_dpt_cd_NE(info);
		else if (ne == columnDtl1_rqst_fr_dpt_nm) doDtl1_rqst_fr_dpt_nm_NE(info);
		else if (ne == columnDtl1_po_schd_no) doDtl1_po_schd_no_NE(info);
		else if (ne == columnDtl1_trd_ptn_typ) doDtl1_trd_ptn_typ_NE(info);
		else if (ne == columnDtl1_po_schd_src_typ) doDtl1_po_schd_src_typ_NE(info);
		else if (ne == columnDtl1_ins_usr_id) doDtl1_ins_usr_id_NE(info);
		else if (ne == columnDtl1_ins_usr_nm) doDtl1_ins_usr_nm_NE(info);
		else if (ne == columnDtl1_ins_func_id) doDtl1_ins_func_id_NE(info);
		else if (ne == columnDtl1_ins_func_nm) doDtl1_ins_func_nm_NE(info);
		else if (ne == columnDtl1_ins_ts) doDtl1_ins_ts_NE(info);
		else if (ne == columnDtl1_upd_usr_id) doDtl1_upd_usr_id_NE(info);
		else if (ne == columnDtl1_upd_usr_nm) doDtl1_upd_usr_nm_NE(info);
		else if (ne == columnDtl1_upd_func_id) doDtl1_upd_func_id_NE(info);
		else if (ne == columnDtl1_upd_func_nm) doDtl1_upd_func_nm_NE(info);
		else if (ne == columnDtl1_upd_ts) doDtl1_upd_ts_NE(info);
		else if (ne == columnDtl1_upd_srv_req_no) doDtl1_upd_srv_req_no_NE(info);
		else if (ne == columnDtl1_po_schd_upd_cntr) doDtl1_po_schd_upd_cntr_NE(info);
		else if (ne == columnDtl1_base_dt) doDtl1_base_dt_NE(info);
		else if (ne == columnDtl2_check) doDtl2_check_NE(info);
		else if (ne == columnDtl2_abort_flg) doDtl2_abort_flg_NE(info);
		else if (ne == columnDtl2_rqst_upd_stop_flg) doDtl2_rqst_upd_stop_flg_NE(info);
		else if (ne == columnDtl2_reg_dt) doDtl2_reg_dt_NE(info);
		else if (ne == columnDtl2_in_to_loc_cd) doDtl2_in_to_loc_cd_NE(info);
		else if (ne == columnDtl2_in_to_loc_nm) doDtl2_in_to_loc_nm_NE(info);
		else if (ne == columnDtl2_in_to_loc_wg_cd) doDtl2_in_to_loc_wg_cd_NE(info);
		else if (ne == columnDtl2_in_to_loc_wg_nm) doDtl2_in_to_loc_wg_nm_NE(info);
		else if (ne == columnDtl2_drct_dlv_typ) doDtl2_drct_dlv_typ_NE(info);
		else if (ne == columnDtl2_drct_dlv_typ_nm) doDtl2_drct_dlv_typ_nm_NE(info);
		else if (ne == columnDtl2_outsrc_sppl_cd) doDtl2_outsrc_sppl_cd_NE(info);
		else if (ne == columnDtl2_str_ln_tgt_flg) doDtl2_str_ln_tgt_flg_NE(info);
		else if (ne == columnDtl2_in_to_loc_cal_cd) doDtl2_in_to_loc_cal_cd_NE(info);
		else if (ne == columnDtl2_site_cd) doDtl2_site_cd_NE(info);
		else if (ne == columnDtl2_lg_grp_cd) doDtl2_lg_grp_cd_NE(info);
		else if (ne == columnDtl2_str_ln_cd) doDtl2_str_ln_cd_NE(info);
		else if (ne == columnDtl2_str_ln_nm) doDtl2_str_ln_nm_NE(info);
		else if (ne == columnDtl2_str_ln_cd_none_flg) doDtl2_str_ln_cd_none_flg_NE(info);
		else if (ne == columnDtl2_rqst_avl_rqst_dt) doDtl2_rqst_avl_rqst_dt_NE(info);
		else if (ne == columnDtl2_sundry_itm_flg) doDtl2_sundry_itm_flg_NE(info);
		else if (ne == columnDtl2_ver_flg) doDtl2_ver_flg_NE(info);
		else if (ne == columnDtl2_asset_mng_typ) doDtl2_asset_mng_typ_NE(info);
		else if (ne == columnDtl2_dscnt_itm_flg) doDtl2_dscnt_itm_flg_NE(info);
		else if (ne == columnDtl2_itm_purc_upri_cng_flg) doDtl2_itm_purc_upri_cng_flg_NE(info);
		else if (ne == columnDtl2_trd_unit_cd) doDtl2_trd_unit_cd_NE(info);
		else if (ne == columnDtl2_trd_unit_nm) doDtl2_trd_unit_nm_NE(info);
		else if (ne == columnDtl2_trd_unit_dec_place) doDtl2_trd_unit_dec_place_NE(info);
		else if (ne == columnDtl2_trd_unit_rnd_typ) doDtl2_trd_unit_rnd_typ_NE(info);
		else if (ne == columnDtl2_trd_unit_conv_base_qty) doDtl2_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnDtl2_trd_unit_conv_qty) doDtl2_trd_unit_conv_qty_NE(info);
		else if (ne == columnDtl2_base_unit_cd) doDtl2_base_unit_cd_NE(info);
		else if (ne == columnDtl2_base_unit_nm) doDtl2_base_unit_nm_NE(info);
		else if (ne == columnDtl2_base_unit_dec_place) doDtl2_base_unit_dec_place_NE(info);
		else if (ne == columnDtl2_base_unit_rnd_typ) doDtl2_base_unit_rnd_typ_NE(info);
		else if (ne == columnDtl2_cont_fctr_flg) doDtl2_cont_fctr_flg_NE(info);
		else if (ne == columnDtl2_cont_fctr_dec_place) doDtl2_cont_fctr_dec_place_NE(info);
		else if (ne == columnDtl2_cont_fctr_rnd_typ) doDtl2_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnDtl2_sppl_cd) doDtl2_sppl_cd_NE(info);
		else if (ne == columnDtl2_sppl_nm) doDtl2_sppl_nm_NE(info);
		else if (ne == columnDtl2_sppl_cntry_cd) doDtl2_sppl_cntry_cd_NE(info);
		else if (ne == columnDtl2_sppl_cntry_nm) doDtl2_sppl_cntry_nm_NE(info);
		else if (ne == columnDtl2_purc_amt_rnd_typ) doDtl2_purc_amt_rnd_typ_NE(info);
		else if (ne == columnDtl2_purc_tax_rnd_typ) doDtl2_purc_tax_rnd_typ_NE(info);
		else if (ne == columnDtl2_sppl_purc_upri_cng_flg) doDtl2_sppl_purc_upri_cng_flg_NE(info);
		else if (ne == columnDtl2_sppl_cal_cd) doDtl2_sppl_cal_cd_NE(info);
		else if (ne == columnDtl2_maker_cd) doDtl2_maker_cd_NE(info);
		else if (ne == columnDtl2_maker_nm) doDtl2_maker_nm_NE(info);
		else if (ne == columnDtl2_sppl_itm_cd) doDtl2_sppl_itm_cd_NE(info);
		else if (ne == columnDtl2_sppl_itm_nm) doDtl2_sppl_itm_nm_NE(info);
		else if (ne == columnDtl2_iv_itm_nm) doDtl2_iv_itm_nm_NE(info);
		else if (ne == columnDtl2_purc_schd_dt) doDtl2_purc_schd_dt_NE(info);
		else if (ne == columnDtl2_po_schd_dt) doDtl2_po_schd_dt_NE(info);
		else if (ne == columnDtl2_purc_dpt_wg_cd) doDtl2_purc_dpt_wg_cd_NE(info);
		else if (ne == columnDtl2_purc_dpt_wg_nm) doDtl2_purc_dpt_wg_nm_NE(info);
		else if (ne == columnDtl2_purc_upri_req_typ) doDtl2_purc_upri_req_typ_NE(info);
		else if (ne == columnDtl2_purc_upri_req_typ_nm) doDtl2_purc_upri_req_typ_nm_NE(info);
		else if (ne == columnDtl2_trd_cur_cd) doDtl2_trd_cur_cd_NE(info);
		else if (ne == columnDtl2_trd_cur_nm) doDtl2_trd_cur_nm_NE(info);
		else if (ne == columnDtl2_trd_cur_amt_dec_place) doDtl2_trd_cur_amt_dec_place_NE(info);
		else if (ne == columnDtl2_trd_cur_upri_dec_place) doDtl2_trd_cur_upri_dec_place_NE(info);
		else if (ne == columnDtl2_repurc_obli_flg) doDtl2_repurc_obli_flg_NE(info);
		else if (ne == columnDtl2_outsrc_upri_typ) doDtl2_outsrc_upri_typ_NE(info);
		else if (ne == columnDtl2_old_trd_cur_upri) doDtl2_old_trd_cur_upri_NE(info);
		else if (ne == columnDtl2_old_trd_cur_proc_upri) doDtl2_old_trd_cur_proc_upri_NE(info);
		else if (ne == columnDtl2_old_trd_cur_onr_prov_upri) doDtl2_old_trd_cur_onr_prov_upri_NE(info);
		else if (ne == columnDtl2_old_interim_flg) doDtl2_old_interim_flg_NE(info);
		else if (ne == columnDtl2_xrate_cd) doDtl2_xrate_cd_NE(info);
		else if (ne == columnDtl2_xrate_inpt_flg) doDtl2_xrate_inpt_flg_NE(info);
		else if (ne == columnDtl2_base_cur_cd) doDtl2_base_cur_cd_NE(info);
		else if (ne == columnDtl2_base_cur_nm) doDtl2_base_cur_nm_NE(info);
		else if (ne == columnDtl2_base_cur_amt_dec_place) doDtl2_base_cur_amt_dec_place_NE(info);
		else if (ne == columnDtl2_base_cur_upri_dec_place) doDtl2_base_cur_upri_dec_place_NE(info);
		else if (ne == columnDtl2_ptax_xrate_inpt_flg) doDtl2_ptax_xrate_inpt_flg_NE(info);
		else if (ne == columnDtl2_ptax_cur_cd) doDtl2_ptax_cur_cd_NE(info);
		else if (ne == columnDtl2_ptax_cur_nm) doDtl2_ptax_cur_nm_NE(info);
		else if (ne == columnDtl2_ptax_cur_amt_dec_place) doDtl2_ptax_cur_amt_dec_place_NE(info);
		else if (ne == columnDtl2_ptax_cur_upri_dec_place) doDtl2_ptax_cur_upri_dec_place_NE(info);
		else if (ne == columnDtl2_purc_rsn_cd) doDtl2_purc_rsn_cd_NE(info);
		else if (ne == columnDtl2_purc_rsn_nm) doDtl2_purc_rsn_nm_NE(info);
		else if (ne == columnDtl2_xpns_purc_flg) doDtl2_xpns_purc_flg_NE(info);
		else if (ne == columnDtl2_not_xpns_purc_flg) doDtl2_not_xpns_purc_flg_NE(info);
		else if (ne == columnDtl2_intr_rmrks) doDtl2_intr_rmrks_NE(info);
		else if (ne == columnDtl2_trd_d_rmrks) doDtl2_trd_d_rmrks_NE(info);
		else if (ne == columnDtl2_po_cnt_rmrks) doDtl2_po_cnt_rmrks_NE(info);
		else if (ne == columnDtl2_mfg_loc_cd) doDtl2_mfg_loc_cd_NE(info);
		else if (ne == columnDtl2_mfg_loc_nm) doDtl2_mfg_loc_nm_NE(info);
		else if (ne == columnDtl2_bom_ptn) doDtl2_bom_ptn_NE(info);
		else if (ne == columnDtl2_outsrc_flg) doDtl2_outsrc_flg_NE(info);
		else if (ne == columnDtl2_outsrc_itm_ord_no) doDtl2_outsrc_itm_ord_no_NE(info);
		else if (ne == columnDtl2_bd_lot_mng_typ) doDtl2_bd_lot_mng_typ_NE(info);
		else if (ne == columnDtl2_bd_sublot_mng_typ) doDtl2_bd_sublot_mng_typ_NE(info);
		else if (ne == columnDtl2_bd_lot_no_typ) doDtl2_bd_lot_no_typ_NE(info);
		else if (ne == columnDtl2_bd_sublot_no_typ) doDtl2_bd_sublot_no_typ_NE(info);
		else if (ne == columnDtl2_bd_sno1_mng_typ) doDtl2_bd_sno1_mng_typ_NE(info);
		else if (ne == columnDtl2_bd_sno2_mng_typ) doDtl2_bd_sno2_mng_typ_NE(info);
		else if (ne == columnDtl2_bd_sno3_mng_typ) doDtl2_bd_sno3_mng_typ_NE(info);
		else if (ne == columnDtl2_bd_sno4_mng_typ) doDtl2_bd_sno4_mng_typ_NE(info);
		else if (ne == columnDtl2_rqst_fr_usr_cd) doDtl2_rqst_fr_usr_cd_NE(info);
		else if (ne == columnDtl2_rqst_fr_usr_nm) doDtl2_rqst_fr_usr_nm_NE(info);
		else if (ne == columnDtl2_rqst_fr_dpt_cd) doDtl2_rqst_fr_dpt_cd_NE(info);
		else if (ne == columnDtl2_rqst_fr_dpt_nm) doDtl2_rqst_fr_dpt_nm_NE(info);
		else if (ne == columnDtl2_po_schd_no) doDtl2_po_schd_no_NE(info);
		else if (ne == columnDtl2_trd_ptn_typ) doDtl2_trd_ptn_typ_NE(info);
		else if (ne == columnDtl2_po_schd_src_typ) doDtl2_po_schd_src_typ_NE(info);
		else if (ne == columnDtl2_ins_usr_id) doDtl2_ins_usr_id_NE(info);
		else if (ne == columnDtl2_ins_usr_nm) doDtl2_ins_usr_nm_NE(info);
		else if (ne == columnDtl2_ins_func_id) doDtl2_ins_func_id_NE(info);
		else if (ne == columnDtl2_ins_func_nm) doDtl2_ins_func_nm_NE(info);
		else if (ne == columnDtl2_ins_ts) doDtl2_ins_ts_NE(info);
		else if (ne == columnDtl2_upd_usr_id) doDtl2_upd_usr_id_NE(info);
		else if (ne == columnDtl2_upd_usr_nm) doDtl2_upd_usr_nm_NE(info);
		else if (ne == columnDtl2_upd_func_id) doDtl2_upd_func_id_NE(info);
		else if (ne == columnDtl2_upd_func_nm) doDtl2_upd_func_nm_NE(info);
		else if (ne == columnDtl2_upd_ts) doDtl2_upd_ts_NE(info);
		else if (ne == columnDtl2_upd_srv_req_no) doDtl2_upd_srv_req_no_NE(info);
		else if (ne == columnDtl2_po_schd_upd_cntr) doDtl2_po_schd_upd_cntr_NE(info);
		else if (ne == columnDtl2_base_dt) doDtl2_base_dt_NE(info);
	}

	/**
	 * [Dtl1]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_NE(MCEventInfo info){
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
	 * [Dtl1]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_abort_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rqst_upd_stop_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rqst_upd_stop_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[reg_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_reg_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[in_to_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_in_to_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[in_to_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_in_to_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[in_to_loc_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_in_to_loc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[in_to_loc_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_in_to_loc_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[drct_dlv_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_drct_dlv_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[drct_dlv_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_drct_dlv_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[outsrc_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_outsrc_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[in_to_loc_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_in_to_loc_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[str_ln_cd_none_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_str_ln_cd_none_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dscnt_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dscnt_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[itm_purc_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_itm_purc_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_amt_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_amt_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_tax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_tax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_purc_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_purc_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_maker_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[iv_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_iv_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rqst_avl_rqst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rqst_avl_rqst_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_dpt_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_dpt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_dpt_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_dpt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_upri_req_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_upri_req_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_upri_req_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_upri_req_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[repurc_obli_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_repurc_obli_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[outsrc_upri_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_outsrc_upri_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[old_trd_cur_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_old_trd_cur_upri_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[old_trd_cur_proc_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_old_trd_cur_proc_upri_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[old_trd_cur_onr_prov_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_old_trd_cur_onr_prov_upri_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[old_interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_old_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ptax_xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ptax_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ptax_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ptax_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ptax_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ptax_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ptax_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ptax_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ptax_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ptax_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[xpns_purc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_xpns_purc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[not_xpns_purc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_not_xpns_purc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[outsrc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_outsrc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[outsrc_itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_outsrc_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_lot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_lot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_sublot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_sublot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rqst_fr_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rqst_fr_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rqst_fr_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rqst_fr_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rqst_fr_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rqst_fr_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rqst_fr_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rqst_fr_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_schd_src_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_schd_src_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_schd_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_schd_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_abort_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rqst_upd_stop_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rqst_upd_stop_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[reg_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_reg_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[in_to_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_in_to_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[in_to_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_in_to_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[in_to_loc_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_in_to_loc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[in_to_loc_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_in_to_loc_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[drct_dlv_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_drct_dlv_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[drct_dlv_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_drct_dlv_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[outsrc_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_outsrc_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[in_to_loc_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_in_to_loc_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[str_ln_cd_none_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_str_ln_cd_none_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rqst_avl_rqst_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rqst_avl_rqst_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dscnt_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dscnt_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[itm_purc_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_itm_purc_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_amt_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_amt_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_tax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_tax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_purc_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_purc_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_maker_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[iv_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_iv_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_dpt_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_dpt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_dpt_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_dpt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_upri_req_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_upri_req_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_upri_req_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_upri_req_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[repurc_obli_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_repurc_obli_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[outsrc_upri_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_outsrc_upri_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[old_trd_cur_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_old_trd_cur_upri_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[old_trd_cur_proc_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_old_trd_cur_proc_upri_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[old_trd_cur_onr_prov_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_old_trd_cur_onr_prov_upri_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[old_interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_old_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ptax_xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ptax_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ptax_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ptax_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ptax_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ptax_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ptax_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ptax_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ptax_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ptax_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[xpns_purc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_xpns_purc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[not_xpns_purc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_not_xpns_purc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[outsrc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_outsrc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[outsrc_itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_outsrc_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_lot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_lot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_sublot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_sublot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rqst_fr_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rqst_fr_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rqst_fr_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rqst_fr_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rqst_fr_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rqst_fr_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rqst_fr_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rqst_fr_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_schd_src_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_schd_src_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_schd_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_schd_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_dt_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == Dtl1Table) doDtl1_NX(info);
		else if (nx == Dtl2Table) doDtl2_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_NX(info);
		else if (nx == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_NX(info);
		else if (nx == Cnd_srch_tgt_no) doCnd_srch_tgt_no_NX(info);
		else if (nx == columnDtl1_check) doDtl1_check_NX(info);
		else if (nx == columnDtl1_abort_flg) doDtl1_abort_flg_NX(info);
		else if (nx == columnDtl1_rqst_upd_stop_flg) doDtl1_rqst_upd_stop_flg_NX(info);
		else if (nx == columnDtl1_reg_dt) doDtl1_reg_dt_NX(info);
		else if (nx == columnDtl1_in_to_loc_cd) doDtl1_in_to_loc_cd_NX(info);
		else if (nx == columnDtl1_in_to_loc_nm) doDtl1_in_to_loc_nm_NX(info);
		else if (nx == columnDtl1_in_to_loc_wg_cd) doDtl1_in_to_loc_wg_cd_NX(info);
		else if (nx == columnDtl1_in_to_loc_wg_nm) doDtl1_in_to_loc_wg_nm_NX(info);
		else if (nx == columnDtl1_drct_dlv_typ) doDtl1_drct_dlv_typ_NX(info);
		else if (nx == columnDtl1_drct_dlv_typ_nm) doDtl1_drct_dlv_typ_nm_NX(info);
		else if (nx == columnDtl1_outsrc_sppl_cd) doDtl1_outsrc_sppl_cd_NX(info);
		else if (nx == columnDtl1_str_ln_tgt_flg) doDtl1_str_ln_tgt_flg_NX(info);
		else if (nx == columnDtl1_in_to_loc_cal_cd) doDtl1_in_to_loc_cal_cd_NX(info);
		else if (nx == columnDtl1_site_cd) doDtl1_site_cd_NX(info);
		else if (nx == columnDtl1_lg_grp_cd) doDtl1_lg_grp_cd_NX(info);
		else if (nx == columnDtl1_sundry_itm_flg) doDtl1_sundry_itm_flg_NX(info);
		else if (nx == columnDtl1_str_ln_cd) doDtl1_str_ln_cd_NX(info);
		else if (nx == columnDtl1_str_ln_nm) doDtl1_str_ln_nm_NX(info);
		else if (nx == columnDtl1_str_ln_cd_none_flg) doDtl1_str_ln_cd_none_flg_NX(info);
		else if (nx == columnDtl1_ver_flg) doDtl1_ver_flg_NX(info);
		else if (nx == columnDtl1_asset_mng_typ) doDtl1_asset_mng_typ_NX(info);
		else if (nx == columnDtl1_dscnt_itm_flg) doDtl1_dscnt_itm_flg_NX(info);
		else if (nx == columnDtl1_itm_purc_upri_cng_flg) doDtl1_itm_purc_upri_cng_flg_NX(info);
		else if (nx == columnDtl1_trd_unit_cd) doDtl1_trd_unit_cd_NX(info);
		else if (nx == columnDtl1_trd_unit_nm) doDtl1_trd_unit_nm_NX(info);
		else if (nx == columnDtl1_trd_unit_dec_place) doDtl1_trd_unit_dec_place_NX(info);
		else if (nx == columnDtl1_trd_unit_rnd_typ) doDtl1_trd_unit_rnd_typ_NX(info);
		else if (nx == columnDtl1_trd_unit_conv_base_qty) doDtl1_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnDtl1_trd_unit_conv_qty) doDtl1_trd_unit_conv_qty_NX(info);
		else if (nx == columnDtl1_base_unit_cd) doDtl1_base_unit_cd_NX(info);
		else if (nx == columnDtl1_base_unit_nm) doDtl1_base_unit_nm_NX(info);
		else if (nx == columnDtl1_base_unit_dec_place) doDtl1_base_unit_dec_place_NX(info);
		else if (nx == columnDtl1_base_unit_rnd_typ) doDtl1_base_unit_rnd_typ_NX(info);
		else if (nx == columnDtl1_cont_fctr_flg) doDtl1_cont_fctr_flg_NX(info);
		else if (nx == columnDtl1_cont_fctr_dec_place) doDtl1_cont_fctr_dec_place_NX(info);
		else if (nx == columnDtl1_cont_fctr_rnd_typ) doDtl1_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnDtl1_sppl_cd) doDtl1_sppl_cd_NX(info);
		else if (nx == columnDtl1_sppl_nm) doDtl1_sppl_nm_NX(info);
		else if (nx == columnDtl1_sppl_cntry_cd) doDtl1_sppl_cntry_cd_NX(info);
		else if (nx == columnDtl1_sppl_cntry_nm) doDtl1_sppl_cntry_nm_NX(info);
		else if (nx == columnDtl1_purc_amt_rnd_typ) doDtl1_purc_amt_rnd_typ_NX(info);
		else if (nx == columnDtl1_purc_tax_rnd_typ) doDtl1_purc_tax_rnd_typ_NX(info);
		else if (nx == columnDtl1_sppl_purc_upri_cng_flg) doDtl1_sppl_purc_upri_cng_flg_NX(info);
		else if (nx == columnDtl1_sppl_cal_cd) doDtl1_sppl_cal_cd_NX(info);
		else if (nx == columnDtl1_maker_cd) doDtl1_maker_cd_NX(info);
		else if (nx == columnDtl1_maker_nm) doDtl1_maker_nm_NX(info);
		else if (nx == columnDtl1_sppl_itm_cd) doDtl1_sppl_itm_cd_NX(info);
		else if (nx == columnDtl1_sppl_itm_nm) doDtl1_sppl_itm_nm_NX(info);
		else if (nx == columnDtl1_iv_itm_nm) doDtl1_iv_itm_nm_NX(info);
		else if (nx == columnDtl1_rqst_avl_rqst_dt) doDtl1_rqst_avl_rqst_dt_NX(info);
		else if (nx == columnDtl1_purc_schd_dt) doDtl1_purc_schd_dt_NX(info);
		else if (nx == columnDtl1_po_schd_dt) doDtl1_po_schd_dt_NX(info);
		else if (nx == columnDtl1_purc_dpt_wg_cd) doDtl1_purc_dpt_wg_cd_NX(info);
		else if (nx == columnDtl1_purc_dpt_wg_nm) doDtl1_purc_dpt_wg_nm_NX(info);
		else if (nx == columnDtl1_purc_upri_req_typ) doDtl1_purc_upri_req_typ_NX(info);
		else if (nx == columnDtl1_purc_upri_req_typ_nm) doDtl1_purc_upri_req_typ_nm_NX(info);
		else if (nx == columnDtl1_trd_cur_cd) doDtl1_trd_cur_cd_NX(info);
		else if (nx == columnDtl1_trd_cur_nm) doDtl1_trd_cur_nm_NX(info);
		else if (nx == columnDtl1_trd_cur_amt_dec_place) doDtl1_trd_cur_amt_dec_place_NX(info);
		else if (nx == columnDtl1_trd_cur_upri_dec_place) doDtl1_trd_cur_upri_dec_place_NX(info);
		else if (nx == columnDtl1_repurc_obli_flg) doDtl1_repurc_obli_flg_NX(info);
		else if (nx == columnDtl1_outsrc_upri_typ) doDtl1_outsrc_upri_typ_NX(info);
		else if (nx == columnDtl1_old_trd_cur_upri) doDtl1_old_trd_cur_upri_NX(info);
		else if (nx == columnDtl1_old_trd_cur_proc_upri) doDtl1_old_trd_cur_proc_upri_NX(info);
		else if (nx == columnDtl1_old_trd_cur_onr_prov_upri) doDtl1_old_trd_cur_onr_prov_upri_NX(info);
		else if (nx == columnDtl1_old_interim_flg) doDtl1_old_interim_flg_NX(info);
		else if (nx == columnDtl1_xrate_cd) doDtl1_xrate_cd_NX(info);
		else if (nx == columnDtl1_xrate_inpt_flg) doDtl1_xrate_inpt_flg_NX(info);
		else if (nx == columnDtl1_base_cur_cd) doDtl1_base_cur_cd_NX(info);
		else if (nx == columnDtl1_base_cur_nm) doDtl1_base_cur_nm_NX(info);
		else if (nx == columnDtl1_base_cur_amt_dec_place) doDtl1_base_cur_amt_dec_place_NX(info);
		else if (nx == columnDtl1_base_cur_upri_dec_place) doDtl1_base_cur_upri_dec_place_NX(info);
		else if (nx == columnDtl1_ptax_xrate_inpt_flg) doDtl1_ptax_xrate_inpt_flg_NX(info);
		else if (nx == columnDtl1_ptax_cur_cd) doDtl1_ptax_cur_cd_NX(info);
		else if (nx == columnDtl1_ptax_cur_nm) doDtl1_ptax_cur_nm_NX(info);
		else if (nx == columnDtl1_ptax_cur_amt_dec_place) doDtl1_ptax_cur_amt_dec_place_NX(info);
		else if (nx == columnDtl1_ptax_cur_upri_dec_place) doDtl1_ptax_cur_upri_dec_place_NX(info);
		else if (nx == columnDtl1_purc_rsn_cd) doDtl1_purc_rsn_cd_NX(info);
		else if (nx == columnDtl1_purc_rsn_nm) doDtl1_purc_rsn_nm_NX(info);
		else if (nx == columnDtl1_xpns_purc_flg) doDtl1_xpns_purc_flg_NX(info);
		else if (nx == columnDtl1_not_xpns_purc_flg) doDtl1_not_xpns_purc_flg_NX(info);
		else if (nx == columnDtl1_intr_rmrks) doDtl1_intr_rmrks_NX(info);
		else if (nx == columnDtl1_trd_d_rmrks) doDtl1_trd_d_rmrks_NX(info);
		else if (nx == columnDtl1_po_cnt_rmrks) doDtl1_po_cnt_rmrks_NX(info);
		else if (nx == columnDtl1_mfg_loc_cd) doDtl1_mfg_loc_cd_NX(info);
		else if (nx == columnDtl1_mfg_loc_nm) doDtl1_mfg_loc_nm_NX(info);
		else if (nx == columnDtl1_bom_ptn) doDtl1_bom_ptn_NX(info);
		else if (nx == columnDtl1_outsrc_flg) doDtl1_outsrc_flg_NX(info);
		else if (nx == columnDtl1_outsrc_itm_ord_no) doDtl1_outsrc_itm_ord_no_NX(info);
		else if (nx == columnDtl1_bd_lot_mng_typ) doDtl1_bd_lot_mng_typ_NX(info);
		else if (nx == columnDtl1_bd_sublot_mng_typ) doDtl1_bd_sublot_mng_typ_NX(info);
		else if (nx == columnDtl1_bd_lot_no_typ) doDtl1_bd_lot_no_typ_NX(info);
		else if (nx == columnDtl1_bd_sublot_no_typ) doDtl1_bd_sublot_no_typ_NX(info);
		else if (nx == columnDtl1_bd_sno1_mng_typ) doDtl1_bd_sno1_mng_typ_NX(info);
		else if (nx == columnDtl1_bd_sno2_mng_typ) doDtl1_bd_sno2_mng_typ_NX(info);
		else if (nx == columnDtl1_bd_sno3_mng_typ) doDtl1_bd_sno3_mng_typ_NX(info);
		else if (nx == columnDtl1_bd_sno4_mng_typ) doDtl1_bd_sno4_mng_typ_NX(info);
		else if (nx == columnDtl1_rqst_fr_usr_cd) doDtl1_rqst_fr_usr_cd_NX(info);
		else if (nx == columnDtl1_rqst_fr_usr_nm) doDtl1_rqst_fr_usr_nm_NX(info);
		else if (nx == columnDtl1_rqst_fr_dpt_cd) doDtl1_rqst_fr_dpt_cd_NX(info);
		else if (nx == columnDtl1_rqst_fr_dpt_nm) doDtl1_rqst_fr_dpt_nm_NX(info);
		else if (nx == columnDtl1_po_schd_no) doDtl1_po_schd_no_NX(info);
		else if (nx == columnDtl1_trd_ptn_typ) doDtl1_trd_ptn_typ_NX(info);
		else if (nx == columnDtl1_po_schd_src_typ) doDtl1_po_schd_src_typ_NX(info);
		else if (nx == columnDtl1_ins_usr_id) doDtl1_ins_usr_id_NX(info);
		else if (nx == columnDtl1_ins_usr_nm) doDtl1_ins_usr_nm_NX(info);
		else if (nx == columnDtl1_ins_func_id) doDtl1_ins_func_id_NX(info);
		else if (nx == columnDtl1_ins_func_nm) doDtl1_ins_func_nm_NX(info);
		else if (nx == columnDtl1_ins_ts) doDtl1_ins_ts_NX(info);
		else if (nx == columnDtl1_upd_usr_id) doDtl1_upd_usr_id_NX(info);
		else if (nx == columnDtl1_upd_usr_nm) doDtl1_upd_usr_nm_NX(info);
		else if (nx == columnDtl1_upd_func_id) doDtl1_upd_func_id_NX(info);
		else if (nx == columnDtl1_upd_func_nm) doDtl1_upd_func_nm_NX(info);
		else if (nx == columnDtl1_upd_ts) doDtl1_upd_ts_NX(info);
		else if (nx == columnDtl1_upd_srv_req_no) doDtl1_upd_srv_req_no_NX(info);
		else if (nx == columnDtl1_po_schd_upd_cntr) doDtl1_po_schd_upd_cntr_NX(info);
		else if (nx == columnDtl1_base_dt) doDtl1_base_dt_NX(info);
		else if (nx == columnDtl2_check) doDtl2_check_NX(info);
		else if (nx == columnDtl2_abort_flg) doDtl2_abort_flg_NX(info);
		else if (nx == columnDtl2_rqst_upd_stop_flg) doDtl2_rqst_upd_stop_flg_NX(info);
		else if (nx == columnDtl2_reg_dt) doDtl2_reg_dt_NX(info);
		else if (nx == columnDtl2_in_to_loc_cd) doDtl2_in_to_loc_cd_NX(info);
		else if (nx == columnDtl2_in_to_loc_nm) doDtl2_in_to_loc_nm_NX(info);
		else if (nx == columnDtl2_in_to_loc_wg_cd) doDtl2_in_to_loc_wg_cd_NX(info);
		else if (nx == columnDtl2_in_to_loc_wg_nm) doDtl2_in_to_loc_wg_nm_NX(info);
		else if (nx == columnDtl2_drct_dlv_typ) doDtl2_drct_dlv_typ_NX(info);
		else if (nx == columnDtl2_drct_dlv_typ_nm) doDtl2_drct_dlv_typ_nm_NX(info);
		else if (nx == columnDtl2_outsrc_sppl_cd) doDtl2_outsrc_sppl_cd_NX(info);
		else if (nx == columnDtl2_str_ln_tgt_flg) doDtl2_str_ln_tgt_flg_NX(info);
		else if (nx == columnDtl2_in_to_loc_cal_cd) doDtl2_in_to_loc_cal_cd_NX(info);
		else if (nx == columnDtl2_site_cd) doDtl2_site_cd_NX(info);
		else if (nx == columnDtl2_lg_grp_cd) doDtl2_lg_grp_cd_NX(info);
		else if (nx == columnDtl2_str_ln_cd) doDtl2_str_ln_cd_NX(info);
		else if (nx == columnDtl2_str_ln_nm) doDtl2_str_ln_nm_NX(info);
		else if (nx == columnDtl2_str_ln_cd_none_flg) doDtl2_str_ln_cd_none_flg_NX(info);
		else if (nx == columnDtl2_rqst_avl_rqst_dt) doDtl2_rqst_avl_rqst_dt_NX(info);
		else if (nx == columnDtl2_sundry_itm_flg) doDtl2_sundry_itm_flg_NX(info);
		else if (nx == columnDtl2_ver_flg) doDtl2_ver_flg_NX(info);
		else if (nx == columnDtl2_asset_mng_typ) doDtl2_asset_mng_typ_NX(info);
		else if (nx == columnDtl2_dscnt_itm_flg) doDtl2_dscnt_itm_flg_NX(info);
		else if (nx == columnDtl2_itm_purc_upri_cng_flg) doDtl2_itm_purc_upri_cng_flg_NX(info);
		else if (nx == columnDtl2_trd_unit_cd) doDtl2_trd_unit_cd_NX(info);
		else if (nx == columnDtl2_trd_unit_nm) doDtl2_trd_unit_nm_NX(info);
		else if (nx == columnDtl2_trd_unit_dec_place) doDtl2_trd_unit_dec_place_NX(info);
		else if (nx == columnDtl2_trd_unit_rnd_typ) doDtl2_trd_unit_rnd_typ_NX(info);
		else if (nx == columnDtl2_trd_unit_conv_base_qty) doDtl2_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnDtl2_trd_unit_conv_qty) doDtl2_trd_unit_conv_qty_NX(info);
		else if (nx == columnDtl2_base_unit_cd) doDtl2_base_unit_cd_NX(info);
		else if (nx == columnDtl2_base_unit_nm) doDtl2_base_unit_nm_NX(info);
		else if (nx == columnDtl2_base_unit_dec_place) doDtl2_base_unit_dec_place_NX(info);
		else if (nx == columnDtl2_base_unit_rnd_typ) doDtl2_base_unit_rnd_typ_NX(info);
		else if (nx == columnDtl2_cont_fctr_flg) doDtl2_cont_fctr_flg_NX(info);
		else if (nx == columnDtl2_cont_fctr_dec_place) doDtl2_cont_fctr_dec_place_NX(info);
		else if (nx == columnDtl2_cont_fctr_rnd_typ) doDtl2_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnDtl2_sppl_cd) doDtl2_sppl_cd_NX(info);
		else if (nx == columnDtl2_sppl_nm) doDtl2_sppl_nm_NX(info);
		else if (nx == columnDtl2_sppl_cntry_cd) doDtl2_sppl_cntry_cd_NX(info);
		else if (nx == columnDtl2_sppl_cntry_nm) doDtl2_sppl_cntry_nm_NX(info);
		else if (nx == columnDtl2_purc_amt_rnd_typ) doDtl2_purc_amt_rnd_typ_NX(info);
		else if (nx == columnDtl2_purc_tax_rnd_typ) doDtl2_purc_tax_rnd_typ_NX(info);
		else if (nx == columnDtl2_sppl_purc_upri_cng_flg) doDtl2_sppl_purc_upri_cng_flg_NX(info);
		else if (nx == columnDtl2_sppl_cal_cd) doDtl2_sppl_cal_cd_NX(info);
		else if (nx == columnDtl2_maker_cd) doDtl2_maker_cd_NX(info);
		else if (nx == columnDtl2_maker_nm) doDtl2_maker_nm_NX(info);
		else if (nx == columnDtl2_sppl_itm_cd) doDtl2_sppl_itm_cd_NX(info);
		else if (nx == columnDtl2_sppl_itm_nm) doDtl2_sppl_itm_nm_NX(info);
		else if (nx == columnDtl2_iv_itm_nm) doDtl2_iv_itm_nm_NX(info);
		else if (nx == columnDtl2_purc_schd_dt) doDtl2_purc_schd_dt_NX(info);
		else if (nx == columnDtl2_po_schd_dt) doDtl2_po_schd_dt_NX(info);
		else if (nx == columnDtl2_purc_dpt_wg_cd) doDtl2_purc_dpt_wg_cd_NX(info);
		else if (nx == columnDtl2_purc_dpt_wg_nm) doDtl2_purc_dpt_wg_nm_NX(info);
		else if (nx == columnDtl2_purc_upri_req_typ) doDtl2_purc_upri_req_typ_NX(info);
		else if (nx == columnDtl2_purc_upri_req_typ_nm) doDtl2_purc_upri_req_typ_nm_NX(info);
		else if (nx == columnDtl2_trd_cur_cd) doDtl2_trd_cur_cd_NX(info);
		else if (nx == columnDtl2_trd_cur_nm) doDtl2_trd_cur_nm_NX(info);
		else if (nx == columnDtl2_trd_cur_amt_dec_place) doDtl2_trd_cur_amt_dec_place_NX(info);
		else if (nx == columnDtl2_trd_cur_upri_dec_place) doDtl2_trd_cur_upri_dec_place_NX(info);
		else if (nx == columnDtl2_repurc_obli_flg) doDtl2_repurc_obli_flg_NX(info);
		else if (nx == columnDtl2_outsrc_upri_typ) doDtl2_outsrc_upri_typ_NX(info);
		else if (nx == columnDtl2_old_trd_cur_upri) doDtl2_old_trd_cur_upri_NX(info);
		else if (nx == columnDtl2_old_trd_cur_proc_upri) doDtl2_old_trd_cur_proc_upri_NX(info);
		else if (nx == columnDtl2_old_trd_cur_onr_prov_upri) doDtl2_old_trd_cur_onr_prov_upri_NX(info);
		else if (nx == columnDtl2_old_interim_flg) doDtl2_old_interim_flg_NX(info);
		else if (nx == columnDtl2_xrate_cd) doDtl2_xrate_cd_NX(info);
		else if (nx == columnDtl2_xrate_inpt_flg) doDtl2_xrate_inpt_flg_NX(info);
		else if (nx == columnDtl2_base_cur_cd) doDtl2_base_cur_cd_NX(info);
		else if (nx == columnDtl2_base_cur_nm) doDtl2_base_cur_nm_NX(info);
		else if (nx == columnDtl2_base_cur_amt_dec_place) doDtl2_base_cur_amt_dec_place_NX(info);
		else if (nx == columnDtl2_base_cur_upri_dec_place) doDtl2_base_cur_upri_dec_place_NX(info);
		else if (nx == columnDtl2_ptax_xrate_inpt_flg) doDtl2_ptax_xrate_inpt_flg_NX(info);
		else if (nx == columnDtl2_ptax_cur_cd) doDtl2_ptax_cur_cd_NX(info);
		else if (nx == columnDtl2_ptax_cur_nm) doDtl2_ptax_cur_nm_NX(info);
		else if (nx == columnDtl2_ptax_cur_amt_dec_place) doDtl2_ptax_cur_amt_dec_place_NX(info);
		else if (nx == columnDtl2_ptax_cur_upri_dec_place) doDtl2_ptax_cur_upri_dec_place_NX(info);
		else if (nx == columnDtl2_purc_rsn_cd) doDtl2_purc_rsn_cd_NX(info);
		else if (nx == columnDtl2_purc_rsn_nm) doDtl2_purc_rsn_nm_NX(info);
		else if (nx == columnDtl2_xpns_purc_flg) doDtl2_xpns_purc_flg_NX(info);
		else if (nx == columnDtl2_not_xpns_purc_flg) doDtl2_not_xpns_purc_flg_NX(info);
		else if (nx == columnDtl2_intr_rmrks) doDtl2_intr_rmrks_NX(info);
		else if (nx == columnDtl2_trd_d_rmrks) doDtl2_trd_d_rmrks_NX(info);
		else if (nx == columnDtl2_po_cnt_rmrks) doDtl2_po_cnt_rmrks_NX(info);
		else if (nx == columnDtl2_mfg_loc_cd) doDtl2_mfg_loc_cd_NX(info);
		else if (nx == columnDtl2_mfg_loc_nm) doDtl2_mfg_loc_nm_NX(info);
		else if (nx == columnDtl2_bom_ptn) doDtl2_bom_ptn_NX(info);
		else if (nx == columnDtl2_outsrc_flg) doDtl2_outsrc_flg_NX(info);
		else if (nx == columnDtl2_outsrc_itm_ord_no) doDtl2_outsrc_itm_ord_no_NX(info);
		else if (nx == columnDtl2_bd_lot_mng_typ) doDtl2_bd_lot_mng_typ_NX(info);
		else if (nx == columnDtl2_bd_sublot_mng_typ) doDtl2_bd_sublot_mng_typ_NX(info);
		else if (nx == columnDtl2_bd_lot_no_typ) doDtl2_bd_lot_no_typ_NX(info);
		else if (nx == columnDtl2_bd_sublot_no_typ) doDtl2_bd_sublot_no_typ_NX(info);
		else if (nx == columnDtl2_bd_sno1_mng_typ) doDtl2_bd_sno1_mng_typ_NX(info);
		else if (nx == columnDtl2_bd_sno2_mng_typ) doDtl2_bd_sno2_mng_typ_NX(info);
		else if (nx == columnDtl2_bd_sno3_mng_typ) doDtl2_bd_sno3_mng_typ_NX(info);
		else if (nx == columnDtl2_bd_sno4_mng_typ) doDtl2_bd_sno4_mng_typ_NX(info);
		else if (nx == columnDtl2_rqst_fr_usr_cd) doDtl2_rqst_fr_usr_cd_NX(info);
		else if (nx == columnDtl2_rqst_fr_usr_nm) doDtl2_rqst_fr_usr_nm_NX(info);
		else if (nx == columnDtl2_rqst_fr_dpt_cd) doDtl2_rqst_fr_dpt_cd_NX(info);
		else if (nx == columnDtl2_rqst_fr_dpt_nm) doDtl2_rqst_fr_dpt_nm_NX(info);
		else if (nx == columnDtl2_po_schd_no) doDtl2_po_schd_no_NX(info);
		else if (nx == columnDtl2_trd_ptn_typ) doDtl2_trd_ptn_typ_NX(info);
		else if (nx == columnDtl2_po_schd_src_typ) doDtl2_po_schd_src_typ_NX(info);
		else if (nx == columnDtl2_ins_usr_id) doDtl2_ins_usr_id_NX(info);
		else if (nx == columnDtl2_ins_usr_nm) doDtl2_ins_usr_nm_NX(info);
		else if (nx == columnDtl2_ins_func_id) doDtl2_ins_func_id_NX(info);
		else if (nx == columnDtl2_ins_func_nm) doDtl2_ins_func_nm_NX(info);
		else if (nx == columnDtl2_ins_ts) doDtl2_ins_ts_NX(info);
		else if (nx == columnDtl2_upd_usr_id) doDtl2_upd_usr_id_NX(info);
		else if (nx == columnDtl2_upd_usr_nm) doDtl2_upd_usr_nm_NX(info);
		else if (nx == columnDtl2_upd_func_id) doDtl2_upd_func_id_NX(info);
		else if (nx == columnDtl2_upd_func_nm) doDtl2_upd_func_nm_NX(info);
		else if (nx == columnDtl2_upd_ts) doDtl2_upd_ts_NX(info);
		else if (nx == columnDtl2_upd_srv_req_no) doDtl2_upd_srv_req_no_NX(info);
		else if (nx == columnDtl2_po_schd_upd_cntr) doDtl2_po_schd_upd_cntr_NX(info);
		else if (nx == columnDtl2_base_dt) doDtl2_base_dt_NX(info);
	}

	/**
	 * [Dtl1]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_NX(MCEventInfo info){
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
	 * [Dtl1]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_abort_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rqst_upd_stop_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rqst_upd_stop_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[reg_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_reg_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[in_to_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_in_to_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[in_to_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_in_to_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[in_to_loc_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_in_to_loc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[in_to_loc_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_in_to_loc_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[drct_dlv_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_drct_dlv_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[drct_dlv_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_drct_dlv_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[outsrc_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_outsrc_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[in_to_loc_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_in_to_loc_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[str_ln_cd_none_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_str_ln_cd_none_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dscnt_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dscnt_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[itm_purc_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_itm_purc_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_amt_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_amt_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_tax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_tax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_purc_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_purc_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_maker_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[iv_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_iv_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rqst_avl_rqst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rqst_avl_rqst_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_dpt_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_dpt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_dpt_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_dpt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_upri_req_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_upri_req_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_upri_req_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_upri_req_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[repurc_obli_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_repurc_obli_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[outsrc_upri_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_outsrc_upri_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[old_trd_cur_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_old_trd_cur_upri_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[old_trd_cur_proc_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_old_trd_cur_proc_upri_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[old_trd_cur_onr_prov_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_old_trd_cur_onr_prov_upri_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[old_interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_old_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ptax_xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ptax_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ptax_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ptax_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ptax_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ptax_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ptax_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ptax_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ptax_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ptax_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[xpns_purc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_xpns_purc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[not_xpns_purc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_not_xpns_purc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[outsrc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_outsrc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[outsrc_itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_outsrc_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_lot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_lot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_sublot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_sublot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rqst_fr_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rqst_fr_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rqst_fr_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rqst_fr_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rqst_fr_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rqst_fr_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rqst_fr_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rqst_fr_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_schd_src_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_schd_src_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_schd_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_schd_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_abort_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rqst_upd_stop_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rqst_upd_stop_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[reg_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_reg_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[in_to_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_in_to_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[in_to_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_in_to_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[in_to_loc_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_in_to_loc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[in_to_loc_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_in_to_loc_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[drct_dlv_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_drct_dlv_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[drct_dlv_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_drct_dlv_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[outsrc_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_outsrc_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[in_to_loc_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_in_to_loc_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[str_ln_cd_none_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_str_ln_cd_none_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rqst_avl_rqst_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rqst_avl_rqst_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dscnt_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dscnt_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[itm_purc_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_itm_purc_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_amt_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_amt_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_tax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_tax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_purc_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_purc_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_maker_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[iv_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_iv_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_dpt_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_dpt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_dpt_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_dpt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_upri_req_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_upri_req_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_upri_req_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_upri_req_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[repurc_obli_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_repurc_obli_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[outsrc_upri_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_outsrc_upri_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[old_trd_cur_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_old_trd_cur_upri_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[old_trd_cur_proc_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_old_trd_cur_proc_upri_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[old_trd_cur_onr_prov_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_old_trd_cur_onr_prov_upri_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[old_interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_old_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ptax_xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ptax_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ptax_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ptax_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ptax_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ptax_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ptax_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ptax_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ptax_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ptax_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[xpns_purc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_xpns_purc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[not_xpns_purc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_not_xpns_purc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[outsrc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_outsrc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[outsrc_itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_outsrc_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_lot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_lot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_sublot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_sublot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rqst_fr_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rqst_fr_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rqst_fr_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rqst_fr_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rqst_fr_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rqst_fr_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rqst_fr_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rqst_fr_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_schd_src_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_schd_src_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_schd_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_schd_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_dt_NX(MCEventInfo info){
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
		else if (lc == columnDtl1_reg_dt) doDtl1_reg_dt_LC(info);
		else if (lc == columnDtl1_in_to_loc_cd) doDtl1_in_to_loc_cd_LC(info);
		else if (lc == columnDtl1_in_to_loc_nm) doDtl1_in_to_loc_nm_LC(info);
		else if (lc == columnDtl1_in_to_loc_wg_cd) doDtl1_in_to_loc_wg_cd_LC(info);
		else if (lc == columnDtl1_in_to_loc_wg_nm) doDtl1_in_to_loc_wg_nm_LC(info);
		else if (lc == columnDtl1_drct_dlv_typ) doDtl1_drct_dlv_typ_LC(info);
		else if (lc == columnDtl1_drct_dlv_typ_nm) doDtl1_drct_dlv_typ_nm_LC(info);
		else if (lc == columnDtl1_outsrc_sppl_cd) doDtl1_outsrc_sppl_cd_LC(info);
		else if (lc == columnDtl1_in_to_loc_cal_cd) doDtl1_in_to_loc_cal_cd_LC(info);
		else if (lc == columnDtl1_site_cd) doDtl1_site_cd_LC(info);
		else if (lc == columnDtl1_lg_grp_cd) doDtl1_lg_grp_cd_LC(info);
		else if (lc == columnDtl1_str_ln_cd) doDtl1_str_ln_cd_LC(info);
		else if (lc == columnDtl1_str_ln_nm) doDtl1_str_ln_nm_LC(info);
		else if (lc == columnDtl1_asset_mng_typ) doDtl1_asset_mng_typ_LC(info);
		else if (lc == columnDtl1_trd_unit_cd) doDtl1_trd_unit_cd_LC(info);
		else if (lc == columnDtl1_trd_unit_nm) doDtl1_trd_unit_nm_LC(info);
		else if (lc == columnDtl1_trd_unit_dec_place) doDtl1_trd_unit_dec_place_LC(info);
		else if (lc == columnDtl1_trd_unit_rnd_typ) doDtl1_trd_unit_rnd_typ_LC(info);
		else if (lc == columnDtl1_trd_unit_conv_base_qty) doDtl1_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnDtl1_trd_unit_conv_qty) doDtl1_trd_unit_conv_qty_LC(info);
		else if (lc == columnDtl1_base_unit_cd) doDtl1_base_unit_cd_LC(info);
		else if (lc == columnDtl1_base_unit_nm) doDtl1_base_unit_nm_LC(info);
		else if (lc == columnDtl1_base_unit_dec_place) doDtl1_base_unit_dec_place_LC(info);
		else if (lc == columnDtl1_base_unit_rnd_typ) doDtl1_base_unit_rnd_typ_LC(info);
		else if (lc == columnDtl1_cont_fctr_dec_place) doDtl1_cont_fctr_dec_place_LC(info);
		else if (lc == columnDtl1_cont_fctr_rnd_typ) doDtl1_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnDtl1_sppl_cd) doDtl1_sppl_cd_LC(info);
		else if (lc == columnDtl1_sppl_nm) doDtl1_sppl_nm_LC(info);
		else if (lc == columnDtl1_sppl_cntry_cd) doDtl1_sppl_cntry_cd_LC(info);
		else if (lc == columnDtl1_sppl_cntry_nm) doDtl1_sppl_cntry_nm_LC(info);
		else if (lc == columnDtl1_purc_amt_rnd_typ) doDtl1_purc_amt_rnd_typ_LC(info);
		else if (lc == columnDtl1_purc_tax_rnd_typ) doDtl1_purc_tax_rnd_typ_LC(info);
		else if (lc == columnDtl1_sppl_cal_cd) doDtl1_sppl_cal_cd_LC(info);
		else if (lc == columnDtl1_maker_cd) doDtl1_maker_cd_LC(info);
		else if (lc == columnDtl1_maker_nm) doDtl1_maker_nm_LC(info);
		else if (lc == columnDtl1_sppl_itm_cd) doDtl1_sppl_itm_cd_LC(info);
		else if (lc == columnDtl1_sppl_itm_nm) doDtl1_sppl_itm_nm_LC(info);
		else if (lc == columnDtl1_iv_itm_nm) doDtl1_iv_itm_nm_LC(info);
		else if (lc == columnDtl1_rqst_avl_rqst_dt) doDtl1_rqst_avl_rqst_dt_LC(info);
		else if (lc == columnDtl1_purc_schd_dt) doDtl1_purc_schd_dt_LC(info);
		else if (lc == columnDtl1_po_schd_dt) doDtl1_po_schd_dt_LC(info);
		else if (lc == columnDtl1_purc_dpt_wg_cd) doDtl1_purc_dpt_wg_cd_LC(info);
		else if (lc == columnDtl1_purc_dpt_wg_nm) doDtl1_purc_dpt_wg_nm_LC(info);
		else if (lc == columnDtl1_purc_upri_req_typ) doDtl1_purc_upri_req_typ_LC(info);
		else if (lc == columnDtl1_purc_upri_req_typ_nm) doDtl1_purc_upri_req_typ_nm_LC(info);
		else if (lc == columnDtl1_trd_cur_cd) doDtl1_trd_cur_cd_LC(info);
		else if (lc == columnDtl1_trd_cur_nm) doDtl1_trd_cur_nm_LC(info);
		else if (lc == columnDtl1_trd_cur_amt_dec_place) doDtl1_trd_cur_amt_dec_place_LC(info);
		else if (lc == columnDtl1_trd_cur_upri_dec_place) doDtl1_trd_cur_upri_dec_place_LC(info);
		else if (lc == columnDtl1_outsrc_upri_typ) doDtl1_outsrc_upri_typ_LC(info);
		else if (lc == columnDtl1_old_trd_cur_upri) doDtl1_old_trd_cur_upri_LC(info);
		else if (lc == columnDtl1_old_trd_cur_proc_upri) doDtl1_old_trd_cur_proc_upri_LC(info);
		else if (lc == columnDtl1_old_trd_cur_onr_prov_upri) doDtl1_old_trd_cur_onr_prov_upri_LC(info);
		else if (lc == columnDtl1_xrate_cd) doDtl1_xrate_cd_LC(info);
		else if (lc == columnDtl1_base_cur_cd) doDtl1_base_cur_cd_LC(info);
		else if (lc == columnDtl1_base_cur_nm) doDtl1_base_cur_nm_LC(info);
		else if (lc == columnDtl1_base_cur_amt_dec_place) doDtl1_base_cur_amt_dec_place_LC(info);
		else if (lc == columnDtl1_base_cur_upri_dec_place) doDtl1_base_cur_upri_dec_place_LC(info);
		else if (lc == columnDtl1_ptax_cur_cd) doDtl1_ptax_cur_cd_LC(info);
		else if (lc == columnDtl1_ptax_cur_nm) doDtl1_ptax_cur_nm_LC(info);
		else if (lc == columnDtl1_ptax_cur_amt_dec_place) doDtl1_ptax_cur_amt_dec_place_LC(info);
		else if (lc == columnDtl1_ptax_cur_upri_dec_place) doDtl1_ptax_cur_upri_dec_place_LC(info);
		else if (lc == columnDtl1_purc_rsn_cd) doDtl1_purc_rsn_cd_LC(info);
		else if (lc == columnDtl1_purc_rsn_nm) doDtl1_purc_rsn_nm_LC(info);
		else if (lc == columnDtl1_intr_rmrks) doDtl1_intr_rmrks_LC(info);
		else if (lc == columnDtl1_trd_d_rmrks) doDtl1_trd_d_rmrks_LC(info);
		else if (lc == columnDtl1_po_cnt_rmrks) doDtl1_po_cnt_rmrks_LC(info);
		else if (lc == columnDtl1_mfg_loc_cd) doDtl1_mfg_loc_cd_LC(info);
		else if (lc == columnDtl1_mfg_loc_nm) doDtl1_mfg_loc_nm_LC(info);
		else if (lc == columnDtl1_bom_ptn) doDtl1_bom_ptn_LC(info);
		else if (lc == columnDtl1_outsrc_itm_ord_no) doDtl1_outsrc_itm_ord_no_LC(info);
		else if (lc == columnDtl1_bd_lot_mng_typ) doDtl1_bd_lot_mng_typ_LC(info);
		else if (lc == columnDtl1_bd_sublot_mng_typ) doDtl1_bd_sublot_mng_typ_LC(info);
		else if (lc == columnDtl1_bd_lot_no_typ) doDtl1_bd_lot_no_typ_LC(info);
		else if (lc == columnDtl1_bd_sublot_no_typ) doDtl1_bd_sublot_no_typ_LC(info);
		else if (lc == columnDtl1_bd_sno1_mng_typ) doDtl1_bd_sno1_mng_typ_LC(info);
		else if (lc == columnDtl1_bd_sno2_mng_typ) doDtl1_bd_sno2_mng_typ_LC(info);
		else if (lc == columnDtl1_bd_sno3_mng_typ) doDtl1_bd_sno3_mng_typ_LC(info);
		else if (lc == columnDtl1_bd_sno4_mng_typ) doDtl1_bd_sno4_mng_typ_LC(info);
		else if (lc == columnDtl1_rqst_fr_usr_cd) doDtl1_rqst_fr_usr_cd_LC(info);
		else if (lc == columnDtl1_rqst_fr_usr_nm) doDtl1_rqst_fr_usr_nm_LC(info);
		else if (lc == columnDtl1_rqst_fr_dpt_cd) doDtl1_rqst_fr_dpt_cd_LC(info);
		else if (lc == columnDtl1_rqst_fr_dpt_nm) doDtl1_rqst_fr_dpt_nm_LC(info);
		else if (lc == columnDtl1_po_schd_no) doDtl1_po_schd_no_LC(info);
		else if (lc == columnDtl1_trd_ptn_typ) doDtl1_trd_ptn_typ_LC(info);
		else if (lc == columnDtl1_po_schd_src_typ) doDtl1_po_schd_src_typ_LC(info);
		else if (lc == columnDtl1_ins_usr_id) doDtl1_ins_usr_id_LC(info);
		else if (lc == columnDtl1_ins_usr_nm) doDtl1_ins_usr_nm_LC(info);
		else if (lc == columnDtl1_ins_func_id) doDtl1_ins_func_id_LC(info);
		else if (lc == columnDtl1_ins_func_nm) doDtl1_ins_func_nm_LC(info);
		else if (lc == columnDtl1_ins_ts) doDtl1_ins_ts_LC(info);
		else if (lc == columnDtl1_upd_usr_id) doDtl1_upd_usr_id_LC(info);
		else if (lc == columnDtl1_upd_usr_nm) doDtl1_upd_usr_nm_LC(info);
		else if (lc == columnDtl1_upd_func_id) doDtl1_upd_func_id_LC(info);
		else if (lc == columnDtl1_upd_func_nm) doDtl1_upd_func_nm_LC(info);
		else if (lc == columnDtl1_upd_ts) doDtl1_upd_ts_LC(info);
		else if (lc == columnDtl1_upd_srv_req_no) doDtl1_upd_srv_req_no_LC(info);
		else if (lc == columnDtl1_po_schd_upd_cntr) doDtl1_po_schd_upd_cntr_LC(info);
		else if (lc == columnDtl1_base_dt) doDtl1_base_dt_LC(info);
		else if (lc == columnDtl2_reg_dt) doDtl2_reg_dt_LC(info);
		else if (lc == columnDtl2_in_to_loc_cd) doDtl2_in_to_loc_cd_LC(info);
		else if (lc == columnDtl2_in_to_loc_nm) doDtl2_in_to_loc_nm_LC(info);
		else if (lc == columnDtl2_in_to_loc_wg_cd) doDtl2_in_to_loc_wg_cd_LC(info);
		else if (lc == columnDtl2_in_to_loc_wg_nm) doDtl2_in_to_loc_wg_nm_LC(info);
		else if (lc == columnDtl2_drct_dlv_typ) doDtl2_drct_dlv_typ_LC(info);
		else if (lc == columnDtl2_drct_dlv_typ_nm) doDtl2_drct_dlv_typ_nm_LC(info);
		else if (lc == columnDtl2_outsrc_sppl_cd) doDtl2_outsrc_sppl_cd_LC(info);
		else if (lc == columnDtl2_in_to_loc_cal_cd) doDtl2_in_to_loc_cal_cd_LC(info);
		else if (lc == columnDtl2_site_cd) doDtl2_site_cd_LC(info);
		else if (lc == columnDtl2_lg_grp_cd) doDtl2_lg_grp_cd_LC(info);
		else if (lc == columnDtl2_str_ln_cd) doDtl2_str_ln_cd_LC(info);
		else if (lc == columnDtl2_str_ln_nm) doDtl2_str_ln_nm_LC(info);
		else if (lc == columnDtl2_rqst_avl_rqst_dt) doDtl2_rqst_avl_rqst_dt_LC(info);
		else if (lc == columnDtl2_asset_mng_typ) doDtl2_asset_mng_typ_LC(info);
		else if (lc == columnDtl2_trd_unit_cd) doDtl2_trd_unit_cd_LC(info);
		else if (lc == columnDtl2_trd_unit_nm) doDtl2_trd_unit_nm_LC(info);
		else if (lc == columnDtl2_trd_unit_dec_place) doDtl2_trd_unit_dec_place_LC(info);
		else if (lc == columnDtl2_trd_unit_rnd_typ) doDtl2_trd_unit_rnd_typ_LC(info);
		else if (lc == columnDtl2_trd_unit_conv_base_qty) doDtl2_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnDtl2_trd_unit_conv_qty) doDtl2_trd_unit_conv_qty_LC(info);
		else if (lc == columnDtl2_base_unit_cd) doDtl2_base_unit_cd_LC(info);
		else if (lc == columnDtl2_base_unit_nm) doDtl2_base_unit_nm_LC(info);
		else if (lc == columnDtl2_base_unit_dec_place) doDtl2_base_unit_dec_place_LC(info);
		else if (lc == columnDtl2_base_unit_rnd_typ) doDtl2_base_unit_rnd_typ_LC(info);
		else if (lc == columnDtl2_cont_fctr_dec_place) doDtl2_cont_fctr_dec_place_LC(info);
		else if (lc == columnDtl2_cont_fctr_rnd_typ) doDtl2_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnDtl2_sppl_cd) doDtl2_sppl_cd_LC(info);
		else if (lc == columnDtl2_sppl_nm) doDtl2_sppl_nm_LC(info);
		else if (lc == columnDtl2_sppl_cntry_cd) doDtl2_sppl_cntry_cd_LC(info);
		else if (lc == columnDtl2_sppl_cntry_nm) doDtl2_sppl_cntry_nm_LC(info);
		else if (lc == columnDtl2_purc_amt_rnd_typ) doDtl2_purc_amt_rnd_typ_LC(info);
		else if (lc == columnDtl2_purc_tax_rnd_typ) doDtl2_purc_tax_rnd_typ_LC(info);
		else if (lc == columnDtl2_sppl_cal_cd) doDtl2_sppl_cal_cd_LC(info);
		else if (lc == columnDtl2_maker_cd) doDtl2_maker_cd_LC(info);
		else if (lc == columnDtl2_maker_nm) doDtl2_maker_nm_LC(info);
		else if (lc == columnDtl2_sppl_itm_cd) doDtl2_sppl_itm_cd_LC(info);
		else if (lc == columnDtl2_sppl_itm_nm) doDtl2_sppl_itm_nm_LC(info);
		else if (lc == columnDtl2_iv_itm_nm) doDtl2_iv_itm_nm_LC(info);
		else if (lc == columnDtl2_purc_schd_dt) doDtl2_purc_schd_dt_LC(info);
		else if (lc == columnDtl2_po_schd_dt) doDtl2_po_schd_dt_LC(info);
		else if (lc == columnDtl2_purc_dpt_wg_cd) doDtl2_purc_dpt_wg_cd_LC(info);
		else if (lc == columnDtl2_purc_dpt_wg_nm) doDtl2_purc_dpt_wg_nm_LC(info);
		else if (lc == columnDtl2_purc_upri_req_typ) doDtl2_purc_upri_req_typ_LC(info);
		else if (lc == columnDtl2_purc_upri_req_typ_nm) doDtl2_purc_upri_req_typ_nm_LC(info);
		else if (lc == columnDtl2_trd_cur_cd) doDtl2_trd_cur_cd_LC(info);
		else if (lc == columnDtl2_trd_cur_nm) doDtl2_trd_cur_nm_LC(info);
		else if (lc == columnDtl2_trd_cur_amt_dec_place) doDtl2_trd_cur_amt_dec_place_LC(info);
		else if (lc == columnDtl2_trd_cur_upri_dec_place) doDtl2_trd_cur_upri_dec_place_LC(info);
		else if (lc == columnDtl2_outsrc_upri_typ) doDtl2_outsrc_upri_typ_LC(info);
		else if (lc == columnDtl2_old_trd_cur_upri) doDtl2_old_trd_cur_upri_LC(info);
		else if (lc == columnDtl2_old_trd_cur_proc_upri) doDtl2_old_trd_cur_proc_upri_LC(info);
		else if (lc == columnDtl2_old_trd_cur_onr_prov_upri) doDtl2_old_trd_cur_onr_prov_upri_LC(info);
		else if (lc == columnDtl2_xrate_cd) doDtl2_xrate_cd_LC(info);
		else if (lc == columnDtl2_base_cur_cd) doDtl2_base_cur_cd_LC(info);
		else if (lc == columnDtl2_base_cur_nm) doDtl2_base_cur_nm_LC(info);
		else if (lc == columnDtl2_base_cur_amt_dec_place) doDtl2_base_cur_amt_dec_place_LC(info);
		else if (lc == columnDtl2_base_cur_upri_dec_place) doDtl2_base_cur_upri_dec_place_LC(info);
		else if (lc == columnDtl2_ptax_cur_cd) doDtl2_ptax_cur_cd_LC(info);
		else if (lc == columnDtl2_ptax_cur_nm) doDtl2_ptax_cur_nm_LC(info);
		else if (lc == columnDtl2_ptax_cur_amt_dec_place) doDtl2_ptax_cur_amt_dec_place_LC(info);
		else if (lc == columnDtl2_ptax_cur_upri_dec_place) doDtl2_ptax_cur_upri_dec_place_LC(info);
		else if (lc == columnDtl2_purc_rsn_cd) doDtl2_purc_rsn_cd_LC(info);
		else if (lc == columnDtl2_purc_rsn_nm) doDtl2_purc_rsn_nm_LC(info);
		else if (lc == columnDtl2_intr_rmrks) doDtl2_intr_rmrks_LC(info);
		else if (lc == columnDtl2_trd_d_rmrks) doDtl2_trd_d_rmrks_LC(info);
		else if (lc == columnDtl2_po_cnt_rmrks) doDtl2_po_cnt_rmrks_LC(info);
		else if (lc == columnDtl2_mfg_loc_cd) doDtl2_mfg_loc_cd_LC(info);
		else if (lc == columnDtl2_mfg_loc_nm) doDtl2_mfg_loc_nm_LC(info);
		else if (lc == columnDtl2_bom_ptn) doDtl2_bom_ptn_LC(info);
		else if (lc == columnDtl2_outsrc_itm_ord_no) doDtl2_outsrc_itm_ord_no_LC(info);
		else if (lc == columnDtl2_bd_lot_mng_typ) doDtl2_bd_lot_mng_typ_LC(info);
		else if (lc == columnDtl2_bd_sublot_mng_typ) doDtl2_bd_sublot_mng_typ_LC(info);
		else if (lc == columnDtl2_bd_lot_no_typ) doDtl2_bd_lot_no_typ_LC(info);
		else if (lc == columnDtl2_bd_sublot_no_typ) doDtl2_bd_sublot_no_typ_LC(info);
		else if (lc == columnDtl2_bd_sno1_mng_typ) doDtl2_bd_sno1_mng_typ_LC(info);
		else if (lc == columnDtl2_bd_sno2_mng_typ) doDtl2_bd_sno2_mng_typ_LC(info);
		else if (lc == columnDtl2_bd_sno3_mng_typ) doDtl2_bd_sno3_mng_typ_LC(info);
		else if (lc == columnDtl2_bd_sno4_mng_typ) doDtl2_bd_sno4_mng_typ_LC(info);
		else if (lc == columnDtl2_rqst_fr_usr_cd) doDtl2_rqst_fr_usr_cd_LC(info);
		else if (lc == columnDtl2_rqst_fr_usr_nm) doDtl2_rqst_fr_usr_nm_LC(info);
		else if (lc == columnDtl2_rqst_fr_dpt_cd) doDtl2_rqst_fr_dpt_cd_LC(info);
		else if (lc == columnDtl2_rqst_fr_dpt_nm) doDtl2_rqst_fr_dpt_nm_LC(info);
		else if (lc == columnDtl2_po_schd_no) doDtl2_po_schd_no_LC(info);
		else if (lc == columnDtl2_trd_ptn_typ) doDtl2_trd_ptn_typ_LC(info);
		else if (lc == columnDtl2_po_schd_src_typ) doDtl2_po_schd_src_typ_LC(info);
		else if (lc == columnDtl2_ins_usr_id) doDtl2_ins_usr_id_LC(info);
		else if (lc == columnDtl2_ins_usr_nm) doDtl2_ins_usr_nm_LC(info);
		else if (lc == columnDtl2_ins_func_id) doDtl2_ins_func_id_LC(info);
		else if (lc == columnDtl2_ins_func_nm) doDtl2_ins_func_nm_LC(info);
		else if (lc == columnDtl2_ins_ts) doDtl2_ins_ts_LC(info);
		else if (lc == columnDtl2_upd_usr_id) doDtl2_upd_usr_id_LC(info);
		else if (lc == columnDtl2_upd_usr_nm) doDtl2_upd_usr_nm_LC(info);
		else if (lc == columnDtl2_upd_func_id) doDtl2_upd_func_id_LC(info);
		else if (lc == columnDtl2_upd_func_nm) doDtl2_upd_func_nm_LC(info);
		else if (lc == columnDtl2_upd_ts) doDtl2_upd_ts_LC(info);
		else if (lc == columnDtl2_upd_srv_req_no) doDtl2_upd_srv_req_no_LC(info);
		else if (lc == columnDtl2_po_schd_upd_cntr) doDtl2_po_schd_upd_cntr_LC(info);
		else if (lc == columnDtl2_base_dt) doDtl2_base_dt_LC(info);
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
	 * [Dtl1]パネルの[reg_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_reg_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[in_to_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_in_to_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[in_to_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_in_to_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[in_to_loc_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_in_to_loc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[in_to_loc_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_in_to_loc_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[drct_dlv_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_drct_dlv_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[drct_dlv_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_drct_dlv_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[outsrc_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_outsrc_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[in_to_loc_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_in_to_loc_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_amt_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_amt_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_tax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_tax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_maker_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sppl_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sppl_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[iv_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_iv_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rqst_avl_rqst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rqst_avl_rqst_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_dpt_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_dpt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_dpt_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_dpt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_upri_req_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_upri_req_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_upri_req_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_upri_req_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[outsrc_upri_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_outsrc_upri_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[old_trd_cur_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_old_trd_cur_upri_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[old_trd_cur_proc_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_old_trd_cur_proc_upri_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[old_trd_cur_onr_prov_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_old_trd_cur_onr_prov_upri_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ptax_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ptax_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ptax_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ptax_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ptax_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ptax_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ptax_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ptax_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[outsrc_itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_outsrc_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_lot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_lot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_sublot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_sublot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bd_sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bd_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rqst_fr_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rqst_fr_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rqst_fr_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rqst_fr_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rqst_fr_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rqst_fr_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rqst_fr_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rqst_fr_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_schd_src_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_schd_src_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_schd_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_schd_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[reg_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_reg_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[in_to_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_in_to_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[in_to_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_in_to_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[in_to_loc_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_in_to_loc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[in_to_loc_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_in_to_loc_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[drct_dlv_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_drct_dlv_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[drct_dlv_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_drct_dlv_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[outsrc_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_outsrc_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[in_to_loc_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_in_to_loc_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rqst_avl_rqst_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rqst_avl_rqst_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_amt_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_amt_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_tax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_tax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_maker_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sppl_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sppl_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[iv_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_iv_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_dpt_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_dpt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_dpt_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_dpt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_upri_req_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_upri_req_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_upri_req_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_upri_req_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[outsrc_upri_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_outsrc_upri_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[old_trd_cur_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_old_trd_cur_upri_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[old_trd_cur_proc_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_old_trd_cur_proc_upri_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[old_trd_cur_onr_prov_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_old_trd_cur_onr_prov_upri_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ptax_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ptax_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ptax_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ptax_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ptax_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ptax_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ptax_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ptax_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[outsrc_itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_outsrc_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_lot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_lot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_sublot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_sublot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bd_sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bd_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rqst_fr_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rqst_fr_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rqst_fr_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rqst_fr_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rqst_fr_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rqst_fr_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rqst_fr_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rqst_fr_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_schd_src_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_schd_src_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[po_schd_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_po_schd_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[base_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_base_dt_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_srch_tgt_typ_nm]の作成メソッド
	 */
	public MCList getCnd_srch_tgt_typ_nm(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getPurcSrchTgtTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_in_to_loc_cd]の作成メソッド
	 */
	public MCList getDtl1_in_to_loc_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_drct_dlv_typ]の作成メソッド
	 */
	public MCList getDtl1_drct_dlv_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[Dtl1_ver_no_p_PPanel_columnVerNo_ver_no]の作成メソッド
	 */
	public MCList getDtl1_ver_no_p_PPanel_columnVerNo_ver_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmVer(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_trd_unit_cd]の作成メソッド
	 */
	public MCList getDtl1_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_base_unit_cd]の作成メソッド
	 */
	public MCList getDtl1_base_unit_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_sppl_cd]の作成メソッド
	 */
	public MCList getDtl1_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlSppl(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_maker_cd]の作成メソッド
	 */
	public MCList getDtl1_maker_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlMaker(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getDtl1_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_purc_upri_req_typ]の作成メソッド
	 */
	public MCList getDtl1_purc_upri_req_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcUpriReqTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_trd_cur_cd]の作成メソッド
	 */
	public MCList getDtl1_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd]の作成メソッド
	 */
	public MCList getDtl1_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_base_cur_cd]の作成メソッド
	 */
	public MCList getDtl1_base_cur_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_ptax_cur_cd]の作成メソッド
	 */
	public MCList getDtl1_ptax_cur_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_purc_rsn_cd]の作成メソッド
	 */
	public MCList getDtl1_purc_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_mfg_loc_cd]の作成メソッド
	 */
	public MCList getDtl1_mfg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlMfgLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_bom_ptn]の作成メソッド
	 */
	public MCList getDtl1_bom_ptn(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlBomPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_bditm_p_PPanel_columnBdItem_bd_dpt_cd]の作成メソッド
	 */
	public MCList getDtl1_bditm_p_PPanel_columnBdItem_bd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_cd]の作成メソッド
	 */
	public MCList getDtl1_bditm_p_PPanel_columnBdItem_bd_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub1]の作成メソッド
	 */
	public MCList getDtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub2]の作成メソッド
	 */
	public MCList getDtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub3]の作成メソッド
	 */
	public MCList getDtl1_bditm_p_PPanel_columnBdItem_bd_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_in_to_loc_cd]の作成メソッド
	 */
	public MCList getDtl2_in_to_loc_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_drct_dlv_typ]の作成メソッド
	 */
	public MCList getDtl2_drct_dlv_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[Dtl2_ver_no_p_PPanel_columnVerNo_ver_no]の作成メソッド
	 */
	public MCList getDtl2_ver_no_p_PPanel_columnVerNo_ver_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmVer(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_trd_unit_cd]の作成メソッド
	 */
	public MCList getDtl2_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_base_unit_cd]の作成メソッド
	 */
	public MCList getDtl2_base_unit_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_sppl_cd]の作成メソッド
	 */
	public MCList getDtl2_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlSppl(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_maker_cd]の作成メソッド
	 */
	public MCList getDtl2_maker_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlMaker(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl2_usr_dpt_p_PPanel_columnUsrDpt_usr_cd]の作成メソッド
	 */
	public MCList getDtl2_usr_dpt_p_PPanel_columnUsrDpt_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl2_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getDtl2_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_purc_upri_req_typ]の作成メソッド
	 */
	public MCList getDtl2_purc_upri_req_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcUpriReqTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_trd_cur_cd]の作成メソッド
	 */
	public MCList getDtl2_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl2_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd]の作成メソッド
	 */
	public MCList getDtl2_trd_cur_upri_p_PPanel_columnTrdUpriAmt_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_base_cur_cd]の作成メソッド
	 */
	public MCList getDtl2_base_cur_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_ptax_cur_cd]の作成メソッド
	 */
	public MCList getDtl2_ptax_cur_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_purc_rsn_cd]の作成メソッド
	 */
	public MCList getDtl2_purc_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_mfg_loc_cd]の作成メソッド
	 */
	public MCList getDtl2_mfg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlMfgLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_bom_ptn]の作成メソッド
	 */
	public MCList getDtl2_bom_ptn(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlBomPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_cd]の作成メソッド
	 */
	public MCList getDtl2_bditm_p_PPanel_columnBdItem_bd_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub1]の作成メソッド
	 */
	public MCList getDtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub2]の作成メソッド
	 */
	public MCList getDtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub3]の作成メソッド
	 */
	public MCList getDtl2_bditm_p_PPanel_columnBdItem_bd_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBDL0040.Srch01")) {
			return new MS_MSBDL0040_Srch01Bridge();
		}
		if (id.equals("MS.MSBDL0040.Srch02")) {
			return new MS_MSBDL0040_Srch02Bridge();
		}
		if (id.equals("MS.MSBDL0040.Sprt01")) {
			return new MS_MSBDL0040_Sprt01Bridge();
		}
		if (id.equals("MS.MSBDL0040.Sprt02")) {
			return new MS_MSBDL0040_Sprt02Bridge();
		}
		if (id.equals("MS.MSBDL0040.Ins01")) {
			return new MS_MSBDL0040_Ins01Bridge();
		}
		if (id.equals("MS.MSBDL0040.Del01")) {
			return new MS_MSBDL0040_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBDL0040_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0040_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0040_Srch01;

		/** コンストラクタ */
		protected MS_MSBDL0040_Srch01Bridge() {
			p_MS_MSBDL0040_Srch01 = new MCParam(PDef.MS_MSBDL0040_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0040_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0040.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.class));

			p_MS_MSBDL0040_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0040_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0040_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0040_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0040_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0040.CndR up0() {
			return (mcframe.clientMSBD.MSBDP0040.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0040_Srch01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0040_Srch01;
		}

		protected void show() {
			setDtl1L((MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R>)p_MS_MSBDL0040_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtl1L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtl1L());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0040_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0040_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0040_Srch02;

		/** コンストラクタ */
		protected MS_MSBDL0040_Srch02Bridge() {
			p_MS_MSBDL0040_Srch02 = new MCParam(PDef.MS_MSBDL0040_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0040_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0040.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.class));

			p_MS_MSBDL0040_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0040_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0040_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0040_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0040_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0040.CndR up0() {
			return (mcframe.clientMSBD.MSBDP0040.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R>)down(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R> down1() {
			return (MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0040_Srch02.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.class));
			p_MS_MSBDL0040_Srch02.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0040_Srch02;
		}

		protected void show() {
			setDtl1L((MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R>)p_MS_MSBDL0040_Srch02.getContainerParam().getDownBlock(0));
			setDtl2L((MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R>)p_MS_MSBDL0040_Srch02.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getDtl1L().clear();
			getDtl2L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtl1L());
			result.add(getDtl2L());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0040_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0040_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0040_Sprt01;

		/** コンストラクタ */
		protected MS_MSBDL0040_Sprt01Bridge() {
			p_MS_MSBDL0040_Sprt01 = new MCParam(PDef.MS_MSBDL0040_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0040_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.class));

			p_MS_MSBDL0040_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0040_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0040_Sprt01.addUpBlock(getDtl2L().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0040_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0040_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R>)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0040_Sprt01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0040_Sprt01;
		}

		protected void show() {
			setDtl2L((MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R>)p_MS_MSBDL0040_Sprt01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtl2L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtl2L());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtl2L());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0040_Sprt02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0040_Sprt02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0040_Sprt02;

		/** コンストラクタ */
		protected MS_MSBDL0040_Sprt02Bridge() {
			p_MS_MSBDL0040_Sprt02 = new MCParam(PDef.MS_MSBDL0040_Sprt02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0040_Sprt02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.class));

			p_MS_MSBDL0040_Sprt02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0040_Sprt02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0040_Sprt02.addUpBlock(getDtl2L().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0040_Sprt02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0040_Sprt02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R>)up(0);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0040_Sprt02.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0040_Sprt02;
		}

		protected void show() {
			setDtl2L((MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R>)p_MS_MSBDL0040_Sprt02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtl2L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtl2L());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtl2L());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0040_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0040_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0040_Ins01;

		/** コンストラクタ */
		protected MS_MSBDL0040_Ins01Bridge() {
			p_MS_MSBDL0040_Ins01 = new MCParam(PDef.MS_MSBDL0040_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0040_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.class));

			p_MS_MSBDL0040_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0040_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0040_Ins01.addUpBlock(getDtl1L().shallowClone());
			p_MS_MSBDL0040_Ins01.addUpBlock(getDtl2L().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0040_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0040_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R>)up(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R> up1() {
			return (MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R>)up(1);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0040_Ins01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0040_Ins01;
		}

		protected void show() {
			setDtl2L((MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R>)p_MS_MSBDL0040_Ins01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtl2L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtl1L());
			result.add(getDtl2L());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtl2L());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0040_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0040_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0040_Del01;

		/** コンストラクタ */
		protected MS_MSBDL0040_Del01Bridge() {
			p_MS_MSBDL0040_Del01 = new MCParam(PDef.MS_MSBDL0040_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0040_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0040.Dtl1R.class));
			// Down

			p_MS_MSBDL0040_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0040_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0040_Del01.addUpBlock(getDtl1L().shallowClone());
			p_MS_MSBDL0040_Del01.addUpBlock(getDtl2L().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0040_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0040_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R> up0() {
			return (MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R>)up(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R> up1() {
			return (MCList<mcframe.clientMSBD.MSBDP0040.Dtl1R>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBDL0040_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtl1L());
			result.add(getDtl2L());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}