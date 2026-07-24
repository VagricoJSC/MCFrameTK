package mcframe.clientMSBD.MSBDP0150;

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
import mcframe.clientMSBD.MSBDP0150.MSBDP_PurcRetSchdReg_MC.MS_MSBDL0150_Srch01Caller;
import mcframe.clientMSBD.MSBDP0150.MSBDP_PurcRetSchdReg_MC.MS_MSBDL0150_Srch02Caller;
import mcframe.clientMSBD.MSBDP0150.MSBDP_PurcRetSchdReg_MC.MS_MSBDL0150_Srch03Caller;
import mcframe.clientMSBD.MSBDP0150.MSBDP_PurcRetSchdReg_MC.MS_MSBDL0150_Sprt01Caller;
import mcframe.clientMSBD.MSBDP0150.MSBDP_PurcRetSchdReg_MC.MS_MSBDL0150_Ins01Caller;
import mcframe.clientMSBD.MSBDP0150.MSBDP_PurcRetSchdReg_MC.MS_MSBDL0150_Upd01Caller;
import mcframe.clientMSBD.MSBDP0150.MSBDP_PurcRetSchdReg_MC.MS_MSBDL0150_Del01Caller;

/**
 * 画面"MSBDP_PurcRetSchdReg"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDP_PurcRetSchdReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBDP0150";

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
	public MCButton Cnd_srch_arr_act = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch_purc_act = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch_purc_ret_schd = null;
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Fold]ブロック関連のField定義
	public MCPanel FoldPanel = null;
	public MCTabbedPane FoldTab = null;
	// [Fold]ブロックの項目のField定義
	// [Hdr1]ブロック関連のField定義
	public MCPanel Hdr1Panel = null;
	// [Hdr1]ブロックの項目のField定義
	public MCLabel Hdr1_trd_cd_Label = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr1_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCTextField Hdr1_trd_nm = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCTextField Hdr1_trd_ptn_typ = null;
	public MCLabel Hdr1_purc_ret_schd_no_Label = null;
	/**
	 * Purchase return schedule No. 仕入返品予定ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr1_purc_ret_schd_no = null;
	public MCLabel Hdr1_reg_dt_Label = null;
	/**
	 * Entry date 登録日.<p>
	 *
	 */
	public MCDateField Hdr1_reg_dt = null;
	public MCLabel Hdr1_schd_dt_Label = null;
	/**
	 * Scheduled return date 返品予定日.<p>
	 *
	 */
	public MCDateField Hdr1_schd_dt = null;
	public MCLabel Hdr1_sppl_cd_Label = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCTextField Hdr1_sppl_nm = null;
	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public MCCheckBox Hdr1_purc_upri_cng_flg = null;
	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public MCCheckBox Hdr1_subcon_flg = null;
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public MCCheckBox Hdr1_repurc_obli_flg = null;
	public MCLabel Hdr1_outsrc_upri_typ_Label = null;
	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public MCTextField Hdr1_outsrc_upri_typ = null;
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_ap_dpt_cd = null;
	/**
	 * Master AP dept. cd. マスタ債務部門ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_mst_ap_dpt_cd = null;
	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public MCCheckBox Hdr1_pay_spot_flg = null;
	/**
	 * Supplier payment carry-over count 発注先支払繰越回数.<p>
	 *
	 */
	public MCNumberField Hdr1_sppl_pay_crryovr_times = null;
	public mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H Hdr1_sppl_addr_p_PPanel;
	public MCTextField Hdr1_sppl_cntry_cd;	// [Hdr1]の[sppl_addr_p.cntry_cd]を[Hdr1_sppl_cntry_cd]としてエイリアス定義。
	public MCTextField Hdr1_sppl_cntry_nm;	// [Hdr1]の[sppl_addr_p.cntry_nm]を[Hdr1_sppl_cntry_nm]としてエイリアス定義。
	public MCTextField Hdr1_sppl_zip_cd;	// [Hdr1]の[sppl_addr_p.zip_cd]を[Hdr1_sppl_zip_cd]としてエイリアス定義。
	public MCTextField Hdr1_sppl_addr1;	// [Hdr1]の[sppl_addr_p.addr1]を[Hdr1_sppl_addr1]としてエイリアス定義。
	public MCTextField Hdr1_sppl_addr2;	// [Hdr1]の[sppl_addr_p.addr2]を[Hdr1_sppl_addr2]としてエイリアス定義。
	public MCTextField Hdr1_sppl_addr3;	// [Hdr1]の[sppl_addr_p.addr3]を[Hdr1_sppl_addr3]としてエイリアス定義。
	public MCTextField Hdr1_sppl_addr4;	// [Hdr1]の[sppl_addr_p.addr4]を[Hdr1_sppl_addr4]としてエイリアス定義。
	public MCTextField Hdr1_sppl_tel;	// [Hdr1]の[sppl_addr_p.tel]を[Hdr1_sppl_tel]としてエイリアス定義。
	public MCTextField Hdr1_sppl_fax;	// [Hdr1]の[sppl_addr_p.fax]を[Hdr1_sppl_fax]としてエイリアス定義。
	public MCTextField Hdr1_sppl_cntct_dpt;	// [Hdr1]の[sppl_addr_p.cntct_dpt]を[Hdr1_sppl_cntct_dpt]としてエイリアス定義。
	public MCTextField Hdr1_sppl_cntct_psn;	// [Hdr1]の[sppl_addr_p.cntct_psn]を[Hdr1_sppl_cntct_psn]としてエイリアス定義。
	public MCTextComboBox Hdr1_sppl_lg_grp_cd;	// [Hdr1]の[sppl_addr_p.lg_grp_cd]を[Hdr1_sppl_lg_grp_cd]としてエイリアス定義。
	public MCTextField Hdr1_sppl_lg_grp_nm;	// [Hdr1]の[sppl_addr_p.lg_grp_nm]を[Hdr1_sppl_lg_grp_nm]としてエイリアス定義。
	/**
	 * For I/V transaction Ｉ／Ｖ取引対象.<p>
	 *
	 */
	public MCCheckBox Hdr1_sppl_iv_flg = null;
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_prnt_lcl_cd = null;
	public MCLabel Hdr1_asppl_cd_Label = null;
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_asppl_cd = null;
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public MCTextField Hdr1_asppl_nm = null;
	public MCLabel Hdr1_trd_cur_cd_Label = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr1_trd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCTextField Hdr1_trd_cur_nm = null;
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr1_trd_cur_upri_dec_place = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr1_trd_cur_amt_dec_place = null;
	public MCLabel Hdr1_ptax_cur_cd_Label = null;
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr1_ptax_cur_cd = null;
	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public MCTextField Hdr1_ptax_cur_nm = null;
	/**
	 * Unit price number of decimal places (Base currency) 単価小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public MCNumberField Hdr1_ptax_cur_upri_dec_place = null;
	/**
	 * Amount number of decimal places (Base currency) 金額小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public MCNumberField Hdr1_ptax_cur_amt_dec_place = null;
	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public MCCheckBox Hdr1_ptax_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H Hdr1_prax_xrate_p_PPanel;
	public MCNumberField Hdr1_ptax_xrate;	// [Hdr1]の[prax_xrate_p.xrate]を[Hdr1_ptax_xrate]としてエイリアス定義。
	public MCLabel Hdr1_base_cur_cd_Label = null;
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr1_base_cur_cd = null;
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public MCTextField Hdr1_base_cur_nm = null;
	/**
	 * Unit price number of decimal places (Base currency) 単価小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public MCNumberField Hdr1_base_cur_upri_dec_place = null;
	/**
	 * Amount number of decimal places (Base currency) 金額小数部有効桁数（基準通貨）.<p>
	 *
	 */
	public MCNumberField Hdr1_base_cur_amt_dec_place = null;
	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public MCCheckBox Hdr1_xrate_inpt_flg = null;
	public mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H Hdr1_xrate_p_PPanel;
	public MCNumberField Hdr1_xrate;	// [Hdr1]の[xrate_p.xrate]を[Hdr1_xrate]としてエイリアス定義。
	/**
	 * Purchase exchange rate cd. 仕入為替レートＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_xrate_cd = null;
	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public MCTextField Hdr1_purc_amt_rnd_typ = null;
	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public MCTextField Hdr1_purc_tax_rnd_typ = null;
	/**
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public MCTextField Hdr1_purc_tax_calc_typ = null;
	/**
	 * Purchase tax cd. 仕入税ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_purc_tax_cd = null;
	/**
	 * Purchase tax priority 仕入税優先.<p>
	 *
	 */
	public MCCheckBox Hdr1_purc_tax_cd_prio_flg = null;
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr1_trd_cur_amt_p_PPanel;
	public MCNumberField Hdr1_trd_cur_amt;	// [Hdr1]の[trd_cur_amt_p.amt]を[Hdr1_trd_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr1_trd_cur_inc_tax_amt_p_PPanel;
	public MCNumberField Hdr1_trd_cur_inc_tax_amt;	// [Hdr1]の[trd_cur_inc_tax_amt_p.amt]を[Hdr1_trd_cur_inc_tax_amt]としてエイリアス定義。
	public MCLabel Hdr1_ret_sppl_nm_Label = null;
	/**
	 * Return-to name 返品先名.<p>
	 *
	 */
	public MCTextField Hdr1_ret_sppl_nm = null;
	/**
	 * Return-to changeable 返品先変更可能.<p>
	 *
	 */
	public MCCheckBox Hdr1_ret_sppl_enable_flg = null;
	public mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H Hdr1_ret_sppl_addr_p_PPanel;
	public MCTextField Hdr1_ret_sppl_cntry_cd;	// [Hdr1]の[ret_sppl_addr_p.cntry_cd]を[Hdr1_ret_sppl_cntry_cd]としてエイリアス定義。
	public MCTextField Hdr1_ret_sppl_cntry_nm;	// [Hdr1]の[ret_sppl_addr_p.cntry_nm]を[Hdr1_ret_sppl_cntry_nm]としてエイリアス定義。
	public MCTextField Hdr1_ret_sppl_zip_cd;	// [Hdr1]の[ret_sppl_addr_p.zip_cd]を[Hdr1_ret_sppl_zip_cd]としてエイリアス定義。
	public MCTextField Hdr1_ret_sppl_addr1;	// [Hdr1]の[ret_sppl_addr_p.addr1]を[Hdr1_ret_sppl_addr1]としてエイリアス定義。
	public MCTextField Hdr1_ret_sppl_addr2;	// [Hdr1]の[ret_sppl_addr_p.addr2]を[Hdr1_ret_sppl_addr2]としてエイリアス定義。
	public MCTextField Hdr1_ret_sppl_addr3;	// [Hdr1]の[ret_sppl_addr_p.addr3]を[Hdr1_ret_sppl_addr3]としてエイリアス定義。
	public MCTextField Hdr1_ret_sppl_addr4;	// [Hdr1]の[ret_sppl_addr_p.addr4]を[Hdr1_ret_sppl_addr4]としてエイリアス定義。
	public MCTextField Hdr1_ret_sppl_cntct_dpt;	// [Hdr1]の[ret_sppl_addr_p.cntct_dpt]を[Hdr1_ret_sppl_cntct_dpt]としてエイリアス定義。
	public MCTextField Hdr1_ret_sppl_cntct_psn;	// [Hdr1]の[ret_sppl_addr_p.cntct_psn]を[Hdr1_ret_sppl_cntct_psn]としてエイリアス定義。
	public MCTextField Hdr1_ret_sppl_tel;	// [Hdr1]の[ret_sppl_addr_p.tel]を[Hdr1_ret_sppl_tel]としてエイリアス定義。
	public MCTextField Hdr1_ret_sppl_fax;	// [Hdr1]の[ret_sppl_addr_p.fax]を[Hdr1_ret_sppl_fax]としてエイリアス定義。
	public MCTextComboBox Hdr1_ret_sppl_lg_grp_cd;	// [Hdr1]の[ret_sppl_addr_p.lg_grp_cd]を[Hdr1_ret_sppl_lg_grp_cd]としてエイリアス定義。
	public MCTextField Hdr1_ret_sppl_lg_grp_nm;	// [Hdr1]の[ret_sppl_addr_p.lg_grp_nm]を[Hdr1_ret_sppl_lg_grp_nm]としてエイリアス定義。
	public MCLabel Hdr1_ret_sppl_cntct_psn_title_Label = null;
	/**
	 * Return-to PIC form of address 返品先担当者敬称.<p>
	 *
	 */
	public MCTextField Hdr1_ret_sppl_cntct_psn_title = null;
	public MCLabel Hdr1_rcpt_iv_no_Label = null;
	/**
	 * Purchase I/V No. 受領Ｉ／Ｖ　ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr1_rcpt_iv_no = null;
	public MCLabel Hdr1_ref_rcpt_iv_no_Label = null;
	/**
	 * Corresponding receipt I/V No. 対応受領Ｉ／Ｖ　ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr1_ref_rcpt_iv_no = null;
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H Hdr1_purc_usr_dpt_p_PPanel;
	public MCTextField Hdr1_purc_usr_cd;	// [Hdr1]の[purc_usr_dpt_p.usr_cd]を[Hdr1_purc_usr_cd]としてエイリアス定義。
	public MCTextField Hdr1_purc_usr_nm;	// [Hdr1]の[purc_usr_dpt_p.usr_nm]を[Hdr1_purc_usr_nm]としてエイリアス定義。
	public MCTextComboBox Hdr1_purc_dpt_cd;	// [Hdr1]の[purc_usr_dpt_p.dpt_cd]を[Hdr1_purc_dpt_cd]としてエイリアス定義。
	public MCTextField Hdr1_purc_dpt_nm;	// [Hdr1]の[purc_usr_dpt_p.dpt_nm]を[Hdr1_purc_dpt_nm]としてエイリアス定義。
	/**
	 * Default purchasing PIC cd. デフォルト購買担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_def_purc_usr_cd = null;
	/**
	 * Default purchasing dept. cd. デフォルト購買部門ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_def_purc_dpt_cd = null;
	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public MCCheckBox Hdr1_ap_dpt_flg = null;
	public MCLabel Hdr1_purc_dpt_wg_cd_Label = null;
	/**
	 * WG cd. ＷＧ ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr1_purc_dpt_wg_cd = null;
	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public MCTextField Hdr1_purc_dpt_wg_nm = null;
	public MCLabel Hdr1_purc_ret_print_rmrks_Label = null;
	/**
	 * Return slip remarks 返品票備考.<p>
	 *
	 */
	public MCTextField Hdr1_purc_ret_print_rmrks = null;
	public MCLabel Hdr1_trd_rmrks_Label = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCTextField Hdr1_trd_rmrks = null;
	public MCLabel Hdr1_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Hdr1_intr_rmrks = null;
	public MCLabel Hdr1_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Hdr1_sub_char1 = null;
	public MCLabel Hdr1_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Hdr1_sub_char2 = null;
	public MCLabel Hdr1_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Hdr1_sub_char3 = null;
	public MCLabel Hdr1_tterm_cd1_Label = null;
	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Hdr1_tterm_cd1 = null;
	/**
	 * Transaction terms name 1 取引条件名１.<p>
	 *
	 */
	public MCTextField Hdr1_tterm_nm1 = null;
	public MCLabel Hdr1_tterm_rmrks1_Label = null;
	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public MCTextField Hdr1_tterm_rmrks1 = null;
	public MCLabel Hdr1_tterm_cd2_Label = null;
	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Hdr1_tterm_cd2 = null;
	/**
	 * Transaction terms name 2 取引条件名２.<p>
	 *
	 */
	public MCTextField Hdr1_tterm_nm2 = null;
	public MCLabel Hdr1_tterm_rmrks2_Label = null;
	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public MCTextField Hdr1_tterm_rmrks2 = null;
	public MCLabel Hdr1_tterm_cd3_Label = null;
	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Hdr1_tterm_cd3 = null;
	/**
	 * Transaction terms name 3 取引条件名３.<p>
	 *
	 */
	public MCTextField Hdr1_tterm_nm3 = null;
	public MCLabel Hdr1_tterm_rmrks3_Label = null;
	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public MCTextField Hdr1_tterm_rmrks3 = null;
	/**
	 * Update counter (Purchase return schedule header) 更新カウンタ（仕入返品予定ヘッダ）.<p>
	 *
	 */
	public MCNumberField Hdr1_pr_schd_upd_cntr = null;
	public MCLabel Hdr1_ins_usr_id_Label = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Hdr1_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCTextField Hdr1_ins_usr_nm = null;
	public MCLabel Hdr1_ins_func_id_Label = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCTextField Hdr1_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCTextField Hdr1_ins_func_nm = null;
	public MCLabel Hdr1_upd_usr_id_Label = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Hdr1_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCTextField Hdr1_upd_usr_nm = null;
	public MCLabel Hdr1_upd_func_id_Label = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCTextField Hdr1_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCTextField Hdr1_upd_func_nm = null;
	public MCLabel Hdr1_ins_ts_Label = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestampField Hdr1_ins_ts = null;
	public MCLabel Hdr1_upd_ts_Label = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestampField Hdr1_upd_ts = null;
	public MCLabel Hdr1_upd_srv_req_no_Label = null;
	/**
	 * Request No. リクエストNO.<p>
	 *
	 */
	public MCTextField Hdr1_upd_srv_req_no = null;
	// [Hdr2]ブロック関連のField定義
	public MCPanel Hdr2Panel = null;
	// [Hdr2]ブロックの項目のField定義
	// [Dtl1Panel]ブロック関連のField定義
	public MCPanel Dtl1PanelPanel = null;
	// [Dtl1Panel]ブロックの項目のField定義
	// [Dtl1]ブロック関連のField定義
	public MCPanel Dtl1Panel = null;
	public MCScrollPane Dtl1ScrollPane = null;
	public MCTable2<mcframe.clientMSBD.MSBDP0150.Dtl1R> Dtl1Table = null;
	// [Dtl1]ブロックの項目のField定義
	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_peg_no = null;
	/**
	 * Completed 完了.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_cmpl_flg = null;
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_abort_flg = null;
	/**
	 * Return-from location WG cd. 返品元場所ＷＧＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_ret_loc_wg_cd = null;
	/**
	 * Return-from location WG name 返品元場所ＷＧ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_ret_loc_wg_nm = null;
	/**
	 * Return-from location cd. 返品元場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_ret_loc_cd = null;
	/**
	 * Return-from location name 返品元場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_ret_loc_nm = null;
	/**
	 * Return-from supplier cd. 返品元発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_ret_sppl_cd = null;
	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_str_ln_tgt_flg = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Dtl1_str_ln_p_PPanel;
	public MCColumnConfig columnDtl1_str_ln_cd;// [Dtl1]の[str_ln_p.str_ln_cd]を[columnDtl1_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_str_ln_nm;// [Dtl1]の[str_ln_p.str_ln_nm]を[columnDtl1_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl1_str_ln_cd_none_flg;// [Dtl1]の[str_ln_p.str_ln_cd_none_flg]を[columnDtl1_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_asset_mng_typ = null;
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_asset_mng_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl1_itm_p_PPanel;
	public MCColumnConfig columnDtl1_itm_cd;// [Dtl1]の[itm_p.itm_cd]を[columnDtl1_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_itm_sub1;// [Dtl1]の[itm_p.itm_sub1]を[columnDtl1_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl1_itm_sub2;// [Dtl1]の[itm_p.itm_sub2]を[columnDtl1_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl1_itm_sub3;// [Dtl1]の[itm_p.itm_sub3]を[columnDtl1_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl1_itm_nm;// [Dtl1]の[itm_p.itm_nm]を[columnDtl1_itm_nm]としてエイリアス定義。
	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_iv_itm_nm = null;
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sundry_itm_flg = null;
	/**
	 * Allow item purchasing unit price change 品目購買単価変更許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_itm_purc_upri_cng_flg = null;
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_dscnt_itm_flg = null;
	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_arr_skip_flg = null;
	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_itm_pay_crryovr_times = null;
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_stk_mng_typ = null;
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_lot_mng_typ = null;
	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_lot_no_typ = null;
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sublot_mng_typ = null;
	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sublot_no_typ = null;
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sno4_mng_typ = null;
	public mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D Dtl1_lot_no_p_PPanel;
	public MCColumnConfig columnDtl1_crt_lot_flg;// [Dtl1]の[lot_no_p.crt_lot_flg]を[columnDtl1_crt_lot_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl1_lot_no;// [Dtl1]の[lot_no_p.lot_no]を[columnDtl1_lot_no]としてエイリアス定義。
	public MCColumnConfig columnDtl1_sublot_no;// [Dtl1]の[lot_no_p.sublot_no]を[columnDtl1_sublot_no]としてエイリアス定義。
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_bp_lot_no = null;
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ver_flg = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Dtl1_ver_no_p_PPanel;
	public MCColumnConfig columnDtl1_ver_no;// [Dtl1]の[ver_no_p.ver_no]を[columnDtl1_ver_no]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Dtl1_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnDtl1_sno1;// [Dtl1]の[sno_wrk_no_p.sno1]を[columnDtl1_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl1_sno2;// [Dtl1]の[sno_wrk_no_p.sno2]を[columnDtl1_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl1_sno3;// [Dtl1]の[sno_wrk_no_p.sno3]を[columnDtl1_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl1_sno4;// [Dtl1]の[sno_wrk_no_p.sno4]を[columnDtl1_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl1_wrk_no;// [Dtl1]の[sno_wrk_no_p.wrk_no]を[columnDtl1_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl1_wrk_nm;// [Dtl1]の[sno_wrk_no_p.wrk_nm]を[columnDtl1_wrk_nm]としてエイリアス定義。
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
	 * Purchase type 購買区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_typ = null;
	/**
	 * Purchase type name 購買区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_typ_nm = null;
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
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_unit_dec_place = null;
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_unit_rnd_typ = null;
	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_unit_dmn_qty = null;
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
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
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_base_unit_dec_place = null;
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_base_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl1_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl1_base_unit_qty;// [Dtl1]の[base_unit_qty_p.qty]を[columnDtl1_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl1_ret_qty_p_PPanel;
	public MCColumnConfig columnDtl1_ret_qty;// [Dtl1]の[ret_qty_p.qty]を[columnDtl1_ret_qty]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D Dtl1_trd_upri_amt_p_PPanel;
	public MCColumnConfig columnDtl1_upri_not_tgt_flg;// [Dtl1]の[trd_upri_amt_p.upri_not_tgt_flg]を[columnDtl1_upri_not_tgt_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl1_trd_cur_upri;// [Dtl1]の[trd_upri_amt_p.trd_cur_upri]を[columnDtl1_trd_cur_upri]としてエイリアス定義。
	public MCColumnConfig columnDtl1_interim_flg;// [Dtl1]の[trd_upri_amt_p.interim_flg]を[columnDtl1_interim_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl1_trd_cur_amt;// [Dtl1]の[trd_upri_amt_p.trd_cur_amt]を[columnDtl1_trd_cur_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl1_trd_cur_inc_tax_amt;// [Dtl1]の[trd_upri_amt_p.trd_cur_inc_tax_amt]を[columnDtl1_trd_cur_inc_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl1_tax_fix_flg;// [Dtl1]の[trd_upri_amt_p.tax_fix_flg]を[columnDtl1_tax_fix_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl1_tax_cd;// [Dtl1]の[trd_upri_amt_p.tax_cd]を[columnDtl1_tax_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_tax_nm;// [Dtl1]の[trd_upri_amt_p.tax_nm]を[columnDtl1_tax_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl1_tax_rate;// [Dtl1]の[trd_upri_amt_p.tax_rate]を[columnDtl1_tax_rate]としてエイリアス定義。
	public MCColumnConfig columnDtl1_tax_typ;// [Dtl1]の[trd_upri_amt_p.tax_typ]を[columnDtl1_tax_typ]としてエイリアス定義。
	public MCColumnConfig columnDtl1_inc_tax_flg;// [Dtl1]の[trd_upri_amt_p.inc_tax_flg]を[columnDtl1_inc_tax_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl1_trd_cur_tax_amt;// [Dtl1]の[trd_upri_amt_p.trd_cur_tax_amt]を[columnDtl1_trd_cur_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl1_trd_cur_dscnt_amt;// [Dtl1]の[trd_upri_amt_p.trd_cur_dscnt_amt]を[columnDtl1_trd_cur_dscnt_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl1_dscnt_rsn_cd;// [Dtl1]の[trd_upri_amt_p.dscnt_rsn_cd]を[columnDtl1_dscnt_rsn_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_dscnt_rsn_nm;// [Dtl1]の[trd_upri_amt_p.dscnt_rsn_nm]を[columnDtl1_dscnt_rsn_nm]としてエイリアス定義。
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_repurc_obli_flg = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl1_trd_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnDtl1_trd_cur_proc_upri;// [Dtl1]の[trd_cur_proc_upri_p.upri]を[columnDtl1_trd_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl1_trd_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnDtl1_trd_cur_onr_prov_upri;// [Dtl1]の[trd_cur_onr_prov_upri_p.upri]を[columnDtl1_trd_cur_onr_prov_upri]としてエイリアス定義。
	/**
	 * Controlling site type 管轄区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_loc_mng_typ = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_trd_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnDtl1_trd_cur_proc_amt;// [Dtl1]の[trd_cur_proc_amt_p.amt]を[columnDtl1_trd_cur_proc_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl1_trd_cur_proc_tax_amt;// [Dtl1]の[trd_cur_proc_amt_p.tax_amt]を[columnDtl1_trd_cur_proc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_trd_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnDtl1_trd_cur_onr_prov_amt;// [Dtl1]の[trd_cur_onr_prov_amt_p.amt]を[columnDtl1_trd_cur_onr_prov_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl1_trd_cur_onr_prov_tax_amt;// [Dtl1]の[trd_cur_onr_prov_amt_p.tax_amt]を[columnDtl1_trd_cur_onr_prov_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl1_base_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_upri;// [Dtl1]の[base_cur_upri_p.upri]を[columnDtl1_base_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl1_base_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_proc_upri;// [Dtl1]の[base_cur_proc_upri_p.upri]を[columnDtl1_base_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl1_base_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_onr_prov_upri;// [Dtl1]の[base_cur_onr_prov_upri_p.upri]を[columnDtl1_base_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_base_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_dscnt_amt;// [Dtl1]の[base_cur_dscnt_amt_p.amt]を[columnDtl1_base_cur_dscnt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_base_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_amt;// [Dtl1]の[base_cur_amt_p.amt]を[columnDtl1_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_tax_amt;// [Dtl1]の[base_cur_tax_amt_p.amt]を[columnDtl1_base_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_base_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_inc_tax_amt;// [Dtl1]の[base_cur_inc_tax_amt_p.amt]を[columnDtl1_base_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_base_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_proc_amt;// [Dtl1]の[base_cur_proc_amt_p.amt]を[columnDtl1_base_cur_proc_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl1_base_cur_proc_tax_amt;// [Dtl1]の[base_cur_proc_amt_p.tax_amt]を[columnDtl1_base_cur_proc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_base_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_onr_prov_amt;// [Dtl1]の[base_cur_onr_prov_amt_p.amt]を[columnDtl1_base_cur_onr_prov_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl1_base_cur_onr_prov_tax_amt;// [Dtl1]の[base_cur_onr_prov_amt_p.tax_amt]を[columnDtl1_base_cur_onr_prov_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl1_ptax_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl1_ptax_cur_upri;// [Dtl1]の[ptax_cur_upri_p.upri]を[columnDtl1_ptax_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl1_ptax_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnDtl1_ptax_cur_proc_upri;// [Dtl1]の[ptax_cur_proc_upri_p.upri]を[columnDtl1_ptax_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl1_ptax_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnDtl1_ptax_cur_onr_prov_upri;// [Dtl1]の[ptax_cur_onr_prov_upri_p.upri]を[columnDtl1_ptax_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_ptax_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnDtl1_ptax_cur_dscnt_amt;// [Dtl1]の[ptax_cur_dscnt_amt_p.amt]を[columnDtl1_ptax_cur_dscnt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_ptax_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl1_ptax_cur_amt;// [Dtl1]の[ptax_cur_amt_p.amt]を[columnDtl1_ptax_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_ptax_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl1_ptax_cur_tax_amt;// [Dtl1]の[ptax_cur_tax_amt_p.amt]を[columnDtl1_ptax_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_ptax_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl1_ptax_cur_inc_tax_amt;// [Dtl1]の[ptax_cur_inc_tax_amt_p.amt]を[columnDtl1_ptax_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_ptax_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnDtl1_ptax_cur_proc_amt;// [Dtl1]の[ptax_cur_proc_amt_p.amt]を[columnDtl1_ptax_cur_proc_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl1_ptax_cur_proc_tax_amt;// [Dtl1]の[ptax_cur_proc_amt_p.tax_amt]を[columnDtl1_ptax_cur_proc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_ptax_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnDtl1_ptax_cur_onr_prov_amt;// [Dtl1]の[ptax_cur_onr_prov_amt_p.amt]を[columnDtl1_ptax_cur_onr_prov_amt]としてエイリアス定義。
	public MCColumnConfig columnDtl1_ptax_cur_onr_prov_tax_amt;// [Dtl1]の[ptax_cur_onr_prov_amt_p.tax_amt]を[columnDtl1_ptax_cur_onr_prov_tax_amt]としてエイリアス定義。
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_wtax_rate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_wtax_amt_p_PPanel;
	public MCColumnConfig columnDtl1_wtax_amt;// [Dtl1]の[wtax_amt_p.amt]を[columnDtl1_wtax_amt]としてエイリアス定義。
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_mfg_inst_no = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_po_no = null;
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_quality_typ = null;
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_quality_typ_nm = null;
	/**
	 * Inspection 検査.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_insp_flg = null;
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_stk_id_typ = null;
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_stk_id_typ_nm = null;
	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_id_typ = null;
	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_id_typ_nm = null;
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_gd_nm = null;
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_stk_arrv_bp_cd = null;
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_stk_arrv_bp_nm = null;
	/**
	 * Return reason cd. 返品理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_ret_rsn_cd = null;
	/**
	 * Return reason name 返品理由名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_ret_rsn_nm = null;
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ap_dpt_cd = null;
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ap_dpt_nm = null;
	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_pay_crryovr_times = null;
	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_xpns_purc_flg = null;
	public mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D Dtl1_bd_p_PPanel;
	public MCColumnConfig columnDtl1_bd_dpt_cd;// [Dtl1]の[bd_p.bd_dpt_cd]を[columnDtl1_bd_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_dpt_nm;// [Dtl1]の[bd_p.bd_dpt_nm]を[columnDtl1_bd_dpt_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_itm_cd;// [Dtl1]の[bd_p.bd_itm_cd]を[columnDtl1_bd_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_itm_sub1;// [Dtl1]の[bd_p.bd_itm_sub1]を[columnDtl1_bd_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_itm_sub2;// [Dtl1]の[bd_p.bd_itm_sub2]を[columnDtl1_bd_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_itm_sub3;// [Dtl1]の[bd_p.bd_itm_sub3]を[columnDtl1_bd_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_itm_nm;// [Dtl1]の[bd_p.bd_itm_nm]を[columnDtl1_bd_itm_nm]としてエイリアス定義。
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
	public MCColumnConfig columnDtl1_bd_lot_no;// [Dtl1]の[bd_p.bd_lot_no]を[columnDtl1_bd_lot_no]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_sublot_no;// [Dtl1]の[bd_p.bd_sublot_no]を[columnDtl1_bd_sublot_no]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_sno1;// [Dtl1]の[bd_p.bd_sno1]を[columnDtl1_bd_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_sno2;// [Dtl1]の[bd_p.bd_sno2]を[columnDtl1_bd_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_sno3;// [Dtl1]の[bd_p.bd_sno3]を[columnDtl1_bd_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_sno4;// [Dtl1]の[bd_p.bd_sno4]を[columnDtl1_bd_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_bp_cd;// [Dtl1]の[bd_p.bd_bp_cd]を[columnDtl1_bd_bp_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_bp_nm;// [Dtl1]の[bd_p.bd_bp_nm]を[columnDtl1_bd_bp_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_loc_cd;// [Dtl1]の[bd_p.bd_loc_cd]を[columnDtl1_bd_loc_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_loc_nm;// [Dtl1]の[bd_p.bd_loc_nm]を[columnDtl1_bd_loc_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_ctg_cd;// [Dtl1]の[bd_p.bd_ctg_cd]を[columnDtl1_bd_ctg_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_ctg_nm;// [Dtl1]の[bd_p.bd_ctg_nm]を[columnDtl1_bd_ctg_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_oper_cd;// [Dtl1]の[bd_p.bd_oper_cd]を[columnDtl1_bd_oper_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_oper_nm;// [Dtl1]の[bd_p.bd_oper_nm]を[columnDtl1_bd_oper_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_iv_no;// [Dtl1]の[bd_p.bd_iv_no]を[columnDtl1_bd_iv_no]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_slo_no;// [Dtl1]の[bd_p.bd_slo_no]を[columnDtl1_bd_slo_no]としてエイリアス定義。
	public MCColumnConfig columnDtl1_bd_po_no;// [Dtl1]の[bd_p.bd_po_no]を[columnDtl1_bd_po_no]としてエイリアス定義。
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_cont_fctr_flg = null;
	public mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D Dtl1_purc_cont_qty_p_PPanel;
	public MCColumnConfig columnDtl1_purc_cont_qty;// [Dtl1]の[purc_cont_qty_p.purc_cont_qty]を[columnDtl1_purc_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D Dtl1_purc_cont_fctr_p_PPanel;
	public MCColumnConfig columnDtl1_purc_cont_fctr;// [Dtl1]の[purc_cont_fctr_p.purc_cont_fctr]を[columnDtl1_purc_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Dtl1_std_cont_qty_p_PPanel;
	public MCColumnConfig columnDtl1_std_cont_qty;// [Dtl1]の[std_cont_qty_p.cont_qty]を[columnDtl1_std_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D Dtl1_cont_fctr_unit_p_PPanel;
	public MCColumnConfig columnDtl1_cont_fctr_unit_cd;// [Dtl1]の[cont_fctr_unit_p.cont_fctr_unit_cd]を[columnDtl1_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_cont_fctr_unit_nm;// [Dtl1]の[cont_fctr_unit_p.cont_fctr_unit_nm]を[columnDtl1_cont_fctr_unit_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D Dtl1_std_cont_fctr_p_PPanel;
	public MCColumnConfig columnDtl1_std_cont_fctr;// [Dtl1]の[std_cont_fctr_p.std_cont_fctr]を[columnDtl1_std_cont_fctr]としてエイリアス定義。
	public MCColumnConfig columnDtl1_cont_fctr_rnd_typ = null;
	public MCColumnConfig columnDtl1_cont_fctr_dec_place = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_d_rmrks = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_intr_d_rmrks = null;
	/**
	 * Return slip note details remarks 返品票明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_ret_print_d_rmrks = null;
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sub_char1 = null;
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sub_char2 = null;
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_sub_char3 = null;
	/**
	 * Reference receipt result No. 参照入荷実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ref_arr_act_no = null;
	/**
	 * Reference receipt result rev. number 参照入荷実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ref_arr_act_rev = null;
	/**
	 * Reference purchase result No. 参照仕入実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ref_purc_act_no = null;
	/**
	 * Reference purchase result sequence number 参照仕入実績連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ref_purc_act_seq = null;
	/**
	 * Reference purchase result rev. number 参照仕入実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ref_purc_act_rev = null;
	/**
	 * Reference purchase result details No. 参照仕入実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ref_purc_act_d_no = null;
	/**
	 * Reference purchase result details sequence number 参照仕入実績明細連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ref_purc_act_d_seq = null;
	/**
	 * Purchase return schedule details No. 仕入返品予定明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_ret_schd_d_no = null;
	/**
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_base_purc_ac_dt = null;
	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_base_ac_dt = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_disp_seq = null;
	// [Dtl1Btn]ブロック関連のField定義
	public MCPanel Dtl1BtnPanel = null;
	// [Dtl1Btn]ブロックの項目のField定義
	public mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H Dtl1Btn_Btn_open_MSBEP0500_PPanel;
	/**
	 * Reacquire unit price 単価再取得.<p>
	 *
	 */
	public MCButton Dtl1Btn_srch_upri = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Dtl1Btn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Dtl1Btn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Dtl1Btn_rcopy = null;
	public mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H Dtl1Btn_menu_move_p_PPanel;
	// [Dtl2Panel]ブロック関連のField定義
	public MCPanel Dtl2PanelPanel = null;
	// [Dtl2Panel]ブロックの項目のField定義
	// [Dtl2]ブロック関連のField定義
	public MCPanel Dtl2Panel = null;
	public MCScrollPane Dtl2ScrollPane = null;
	public MCTable2<mcframe.clientMSBD.MSBDP0150.Dtl2R> Dtl2Table = null;
	// [Dtl2]ブロックの項目のField定義
	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_dtl_peg_no = null;
	/**
	 * GR/GI pegged No. 受払紐付ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_peg_no = null;
	/**
	 * Return-from location WG cd. 返品元場所ＷＧＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_purc_ret_loc_wg_cd = null;
	/**
	 * Return-from location WG name 返品元場所ＷＧ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_purc_ret_loc_wg_nm = null;
	/**
	 * Return-from location cd. 返品元場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_purc_ret_loc_cd = null;
	/**
	 * Return-from location name 返品元場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_purc_ret_loc_nm = null;
	/**
	 * Return-from supplier cd. 返品元発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_purc_ret_sppl_cd = null;
	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_str_ln_tgt_flg = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Dtl2_str_ln_p_PPanel;
	public MCColumnConfig columnDtl2_str_ln_cd;// [Dtl2]の[str_ln_p.str_ln_cd]を[columnDtl2_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl2_str_ln_nm;// [Dtl2]の[str_ln_p.str_ln_nm]を[columnDtl2_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl2_str_ln_cd_none_flg;// [Dtl2]の[str_ln_p.str_ln_cd_none_flg]を[columnDtl2_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_asset_mng_typ = null;
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_asset_mng_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl2_itm_p_PPanel;
	public MCColumnConfig columnDtl2_itm_cd;// [Dtl2]の[itm_p.itm_cd]を[columnDtl2_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl2_itm_sub1;// [Dtl2]の[itm_p.itm_sub1]を[columnDtl2_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl2_itm_sub2;// [Dtl2]の[itm_p.itm_sub2]を[columnDtl2_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl2_itm_sub3;// [Dtl2]の[itm_p.itm_sub3]を[columnDtl2_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl2_itm_nm;// [Dtl2]の[itm_p.itm_nm]を[columnDtl2_itm_nm]としてエイリアス定義。
	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_iv_itm_nm = null;
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sundry_itm_flg = null;
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_stk_mng_typ = null;
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_lot_mng_typ = null;
	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_lot_no_typ = null;
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sublot_mng_typ = null;
	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sublot_no_typ = null;
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sno4_mng_typ = null;
	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_dscnt_itm_flg = null;
	public mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D Dtl2_lot_no_p_PPanel;
	public MCColumnConfig columnDtl2_crt_lot_flg;// [Dtl2]の[lot_no_p.crt_lot_flg]を[columnDtl2_crt_lot_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl2_lot_no;// [Dtl2]の[lot_no_p.lot_no]を[columnDtl2_lot_no]としてエイリアス定義。
	public MCColumnConfig columnDtl2_sublot_no;// [Dtl2]の[lot_no_p.sublot_no]を[columnDtl2_sublot_no]としてエイリアス定義。
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_bp_lot_no = null;
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ver_flg = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Dtl2_ver_no_p_PPanel;
	public MCColumnConfig columnDtl2_ver_no;// [Dtl2]の[ver_no_p.ver_no]を[columnDtl2_ver_no]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Dtl2_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnDtl2_sno1;// [Dtl2]の[sno_wrk_no_p.sno1]を[columnDtl2_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl2_sno2;// [Dtl2]の[sno_wrk_no_p.sno2]を[columnDtl2_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl2_sno3;// [Dtl2]の[sno_wrk_no_p.sno3]を[columnDtl2_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl2_sno4;// [Dtl2]の[sno_wrk_no_p.sno4]を[columnDtl2_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl2_wrk_no;// [Dtl2]の[sno_wrk_no_p.wrk_no]を[columnDtl2_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl2_wrk_nm;// [Dtl2]の[sno_wrk_no_p.wrk_nm]を[columnDtl2_wrk_nm]としてエイリアス定義。
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
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_trd_unit_dec_place = null;
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_trd_unit_rnd_typ = null;
	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_trd_unit_dmn_qty = null;
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
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
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_base_unit_dec_place = null;
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_base_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl2_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl2_base_unit_qty;// [Dtl2]の[base_unit_qty_p.qty]を[columnDtl2_base_unit_qty]としてエイリアス定義。
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_quality_typ = null;
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_quality_typ_nm = null;
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_stk_id_typ = null;
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_stk_id_typ_nm = null;
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_gd_nm = null;
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_stk_arrv_bp_cd = null;
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_stk_arrv_bp_nm = null;
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_cont_fctr_flg = null;
	public mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D Dtl2_purc_cont_qty_p_PPanel;
	public MCColumnConfig columnDtl2_purc_cont_qty;// [Dtl2]の[purc_cont_qty_p.purc_cont_qty]を[columnDtl2_purc_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D Dtl2_purc_cont_fctr_p_PPanel;
	public MCColumnConfig columnDtl2_purc_cont_fctr;// [Dtl2]の[purc_cont_fctr_p.purc_cont_fctr]を[columnDtl2_purc_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Dtl2_std_cont_qty_p_PPanel;
	public MCColumnConfig columnDtl2_std_cont_qty;// [Dtl2]の[std_cont_qty_p.cont_qty]を[columnDtl2_std_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D Dtl2_std_cont_fctr_p_PPanel;
	public MCColumnConfig columnDtl2_std_cont_fctr;// [Dtl2]の[std_cont_fctr_p.std_cont_fctr]を[columnDtl2_std_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D Dtl2_cont_fctr_unit_p_PPanel;
	public MCColumnConfig columnDtl2_cont_fctr_unit_cd;// [Dtl2]の[cont_fctr_unit_p.cont_fctr_unit_cd]を[columnDtl2_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl2_cont_fctr_unit_nm;// [Dtl2]の[cont_fctr_unit_p.cont_fctr_unit_nm]を[columnDtl2_cont_fctr_unit_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl2_cont_fctr_rnd_typ = null;
	public MCColumnConfig columnDtl2_cont_fctr_dec_place = null;
	/**
	 * GR/GI spare1 受払予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sub_char1 = null;
	/**
	 * GR/GI spare2 受払予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sub_char2 = null;
	/**
	 * GR/GI spare3 受払予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_sub_char3 = null;
	/**
	 * Reference receipt result No. 参照入荷実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ref_arr_act_no = null;
	/**
	 * Reference receipt result rev. number 参照入荷実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ref_arr_act_rev = null;
	/**
	 * Reference purchase result GR/GI No. 参照仕入実績受払ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ref_purc_act_io_no = null;
	/**
	 * Reference purchase result GR/GI sequence number 参照仕入実績受払連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ref_purc_act_io_seq = null;
	/**
	 * Purchase return schedule GR/GI No. 仕入返品予定受払ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_purc_ret_schd_io_no = null;
	// [Dtl2Btn]ブロック関連のField定義
	public MCPanel Dtl2BtnPanel = null;
	// [Dtl2Btn]ブロックの項目のField定義
	public mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H Dtl2Btn_Btn_open_MSBEP0500_PPanel;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Dtl2Btn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Dtl2Btn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Dtl2Btn_rcopy = null;
	/**
	 * Apply details 明細反映.<p>
	 *
	 */
	public MCButton Dtl2Btn_upd_dtl = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Purchase return entry 仕入返品登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBDP0160 = null;
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
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
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
	public static final String[] statusArray = new String[]{INS, FIX_I, SRCH, UPD, FIX_U, DEL, FIX_D, REF};
	
	/** [MS_MSBDL0150_Srch01]のCallerの作成 */
	protected MSBDP_PurcRetSchdReg_MC.MS_MSBDL0150_Srch01Caller createMS_MSBDL0150_Srch01() {
		MSBDP_PurcRetSchdReg_MC.MS_MSBDL0150_Srch01Caller<MSBDP_PurcRetSchdReg, MS_MSBDL0150_Srch01Bridge>
		caller = ((MSBDP_PurcRetSchdReg_MC)this).new MS_MSBDL0150_Srch01Caller<MSBDP_PurcRetSchdReg, MS_MSBDL0150_Srch01Bridge>(
					(MSBDP_PurcRetSchdReg)this, new MS_MSBDL0150_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBDL0150_Srch01]の呼び出し */
	protected void callMS_MSBDL0150_Srch01() {
		MCCaller caller = createMS_MSBDL0150_Srch01();
		caller.exec();
	}
	/** [MS_MSBDL0150_Srch02]のCallerの作成 */
	protected MSBDP_PurcRetSchdReg_MC.MS_MSBDL0150_Srch02Caller createMS_MSBDL0150_Srch02() {
		MSBDP_PurcRetSchdReg_MC.MS_MSBDL0150_Srch02Caller<MSBDP_PurcRetSchdReg, MS_MSBDL0150_Srch02Bridge>
		caller = ((MSBDP_PurcRetSchdReg_MC)this).new MS_MSBDL0150_Srch02Caller<MSBDP_PurcRetSchdReg, MS_MSBDL0150_Srch02Bridge>(
					(MSBDP_PurcRetSchdReg)this, new MS_MSBDL0150_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBDL0150_Srch02]の呼び出し */
	protected void callMS_MSBDL0150_Srch02() {
		MCCaller caller = createMS_MSBDL0150_Srch02();
		caller.exec();
	}
	/** [MS_MSBDL0150_Srch03]のCallerの作成 */
	protected MSBDP_PurcRetSchdReg_MC.MS_MSBDL0150_Srch03Caller createMS_MSBDL0150_Srch03() {
		MSBDP_PurcRetSchdReg_MC.MS_MSBDL0150_Srch03Caller<MSBDP_PurcRetSchdReg, MS_MSBDL0150_Srch03Bridge>
		caller = ((MSBDP_PurcRetSchdReg_MC)this).new MS_MSBDL0150_Srch03Caller<MSBDP_PurcRetSchdReg, MS_MSBDL0150_Srch03Bridge>(
					(MSBDP_PurcRetSchdReg)this, new MS_MSBDL0150_Srch03Bridge());
		return caller;
	}
	/** [MS_MSBDL0150_Srch03]の呼び出し */
	protected void callMS_MSBDL0150_Srch03() {
		MCCaller caller = createMS_MSBDL0150_Srch03();
		caller.exec();
	}
	/** [MS_MSBDL0150_Sprt01]のCallerの作成 */
	protected MSBDP_PurcRetSchdReg_MC.MS_MSBDL0150_Sprt01Caller createMS_MSBDL0150_Sprt01() {
		MSBDP_PurcRetSchdReg_MC.MS_MSBDL0150_Sprt01Caller<MSBDP_PurcRetSchdReg, MS_MSBDL0150_Sprt01Bridge>
		caller = ((MSBDP_PurcRetSchdReg_MC)this).new MS_MSBDL0150_Sprt01Caller<MSBDP_PurcRetSchdReg, MS_MSBDL0150_Sprt01Bridge>(
					(MSBDP_PurcRetSchdReg)this, new MS_MSBDL0150_Sprt01Bridge());
		return caller;
	}
	/** [MS_MSBDL0150_Sprt01]の呼び出し */
	protected void callMS_MSBDL0150_Sprt01() {
		MCCaller caller = createMS_MSBDL0150_Sprt01();
		caller.exec();
	}
	/** [MS_MSBDL0150_Ins01]のCallerの作成 */
	protected MSBDP_PurcRetSchdReg_MC.MS_MSBDL0150_Ins01Caller createMS_MSBDL0150_Ins01() {
		MSBDP_PurcRetSchdReg_MC.MS_MSBDL0150_Ins01Caller<MSBDP_PurcRetSchdReg, MS_MSBDL0150_Ins01Bridge>
		caller = ((MSBDP_PurcRetSchdReg_MC)this).new MS_MSBDL0150_Ins01Caller<MSBDP_PurcRetSchdReg, MS_MSBDL0150_Ins01Bridge>(
					(MSBDP_PurcRetSchdReg)this, new MS_MSBDL0150_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBDL0150_Ins01]の呼び出し */
	protected void callMS_MSBDL0150_Ins01() {
		MCCaller caller = createMS_MSBDL0150_Ins01();
		caller.exec();
	}
	/** [MS_MSBDL0150_Upd01]のCallerの作成 */
	protected MSBDP_PurcRetSchdReg_MC.MS_MSBDL0150_Upd01Caller createMS_MSBDL0150_Upd01() {
		MSBDP_PurcRetSchdReg_MC.MS_MSBDL0150_Upd01Caller<MSBDP_PurcRetSchdReg, MS_MSBDL0150_Upd01Bridge>
		caller = ((MSBDP_PurcRetSchdReg_MC)this).new MS_MSBDL0150_Upd01Caller<MSBDP_PurcRetSchdReg, MS_MSBDL0150_Upd01Bridge>(
					(MSBDP_PurcRetSchdReg)this, new MS_MSBDL0150_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBDL0150_Upd01]の呼び出し */
	protected void callMS_MSBDL0150_Upd01() {
		MCCaller caller = createMS_MSBDL0150_Upd01();
		caller.exec();
	}
	/** [MS_MSBDL0150_Del01]のCallerの作成 */
	protected MSBDP_PurcRetSchdReg_MC.MS_MSBDL0150_Del01Caller createMS_MSBDL0150_Del01() {
		MSBDP_PurcRetSchdReg_MC.MS_MSBDL0150_Del01Caller<MSBDP_PurcRetSchdReg, MS_MSBDL0150_Del01Bridge>
		caller = ((MSBDP_PurcRetSchdReg_MC)this).new MS_MSBDL0150_Del01Caller<MSBDP_PurcRetSchdReg, MS_MSBDL0150_Del01Bridge>(
					(MSBDP_PurcRetSchdReg)this, new MS_MSBDL0150_Del01Bridge());
		return caller;
	}
	/** [MS_MSBDL0150_Del01]の呼び出し */
	protected void callMS_MSBDL0150_Del01() {
		MCCaller caller = createMS_MSBDL0150_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0150.CndR aCndR;
	/** [Hdr1]ブロックのコンテナField定義 */
	private final mcframe.clientMSBD.MSBDP0150.Hdr1R aHdr1R;
	/** [Dtl1]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R> aDtl1L;
	/** [Dtl2]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBD.MSBDP0150.Dtl2R> aDtl2L;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBD.MSBDP0150.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBD.MSBDP0150.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBD.MSBDP0150.CndR createCndR() {
		return mcframe.clientMSBD.MSBDP0150.CndR.create();
	}

	/**
	 * 項目コピーによってaHdr1Rを設定します。
	 *
	 * aHdr1Rのインスタンスは変更されません。
	 *
	 * @param row Hdr1R
	 */
	public void setHdr1R(mcframe.clientMSBD.MSBDP0150.Hdr1R row) {
		if (row != null) {
			MCRow.copyall(getHdr1R(), row);
		}
	}

	/**
	 * [Hdr1]ブロックのコンテナaHdr1Rを返します。
	 *
	 * @return Hdr1R
	 */
	public mcframe.clientMSBD.MSBDP0150.Hdr1R getHdr1R() {
		return aHdr1R;
	}

	/**
	 * aHdr1Rを作成します。
	 *
	 * @return Hdr1R
	 */
	public mcframe.clientMSBD.MSBDP0150.Hdr1R createHdr1R() {
		return mcframe.clientMSBD.MSBDP0150.Hdr1R.create();
	}

	/**
	 * コピーによってaDtl1Lを設定します。
	 *
	 * aDtl1Lのインスタンスは変更されません。
	 *
	 * @param dataset Dtl1L
	 */
	public void setDtl1L(MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R> aList) {
		if (getDtl1L() != aList) {
			getDtl1L().setAll(aList);
		}
	}

	/**
	 * [Dtl1]ブロックのコンテナaDtl1Lを返します。
	 *
	 * @return Dtl1L
	 */
	public MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R> getDtl1L() {
		return aDtl1L;
	}

	/**
	 * aDtl1Rを作成します。
	 *
	 * @return Dtl1R
	 */
	public mcframe.clientMSBD.MSBDP0150.Dtl1R createDtl1R() {
		return mcframe.clientMSBD.MSBDP0150.Dtl1R.create();
	}

	/**
	 * aDtl1Lを作成します。
	 *
	 * @return Dtl1L
	 */
	public MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R> createDtl1L() {
		return MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.class);
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
	public void setDtl2L(MCList<mcframe.clientMSBD.MSBDP0150.Dtl2R> aList) {
		if (getDtl2L() != aList) {
			getDtl2L().setAll(aList);
		}
	}

	/**
	 * [Dtl2]ブロックのコンテナaDtl2Lを返します。
	 *
	 * @return Dtl2L
	 */
	public MCList<mcframe.clientMSBD.MSBDP0150.Dtl2R> getDtl2L() {
		return aDtl2L;
	}

	/**
	 * aDtl2Rを作成します。
	 *
	 * @return Dtl2R
	 */
	public mcframe.clientMSBD.MSBDP0150.Dtl2R createDtl2R() {
		return mcframe.clientMSBD.MSBDP0150.Dtl2R.create();
	}

	/**
	 * aDtl2Lを作成します。
	 *
	 * @return Dtl2L
	 */
	public MCList<mcframe.clientMSBD.MSBDP0150.Dtl2R> createDtl2L() {
		return MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl2R.class);
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
		if(!MCCollectionUtil.contains(ret, getHdr1R())) ret.add(getHdr1R());
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
		if(aCnt == getHdr1R()) return "Hdr1";
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
		if(bId.equals("Hdr1")) return getHdr1R();
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
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Hdr1Panel);
		ret.add(Hdr2Panel);
		ret.add(Dtl1PanelPanel);
		ret.add(Dtl1Panel);
		ret.add(Dtl1BtnPanel);
		ret.add(Dtl2PanelPanel);
		ret.add(Dtl2Panel);
		ret.add(Dtl2BtnPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_PurcRetSchdReg_MC_A() {
		aCndR = createCndR();
		aHdr1R = createHdr1R();
		aDtl1L = createDtl1L();
		aDtl2L = createDtl2L();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBDP_PurcRetSchdReg_MC_A(String name) {
		aCndR = createCndR();
		aHdr1R = createHdr1R();
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
		MSBDP_PurcRetSchdReg_MC.jbCreateScreenOpe((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbCreateCnd((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbCreateTop((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbCreateFold((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbCreateHdr1((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbCreateHdr2((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbCreateDtl1Panel((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbCreateDtl1((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbCreateDtl1Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbCreateDtl2Panel((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbCreateDtl2((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbCreateDtl2Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbCreateBtn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbCreateEastBtn((MSBDP_PurcRetSchdReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBDP_PurcRetSchdReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBDP_PurcRetSchdReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBDP_PurcRetSchdReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBDP_PurcRetSchdReg p) {
	}

	/**
	 * [Hdr1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr1(MSBDP_PurcRetSchdReg p) {
		p.Hdr1_sppl_addr_p_PPanel = mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.create(p.getHdr1R().sppl_addr_p());
		p.Hdr1_sppl_addr_p_PPanel.setName("Hdr1.sppl_addr_p");
		p.Hdr1_sppl_cntry_cd = p.Hdr1_sppl_addr_p_PPanel.Addr_cntry_cd;
		p.Hdr1_sppl_cntry_cd.addAliasName("Hdr1.sppl_cntry_cd", p);
		p.Hdr1_sppl_cntry_nm = p.Hdr1_sppl_addr_p_PPanel.Addr_cntry_nm;
		p.Hdr1_sppl_cntry_nm.addAliasName("Hdr1.sppl_cntry_nm", p);
		p.Hdr1_sppl_zip_cd = p.Hdr1_sppl_addr_p_PPanel.Addr_zip_cd;
		p.Hdr1_sppl_zip_cd.addAliasName("Hdr1.sppl_zip_cd", p);
		p.Hdr1_sppl_addr1 = p.Hdr1_sppl_addr_p_PPanel.Addr_addr1;
		p.Hdr1_sppl_addr1.addAliasName("Hdr1.sppl_addr1", p);
		p.Hdr1_sppl_addr2 = p.Hdr1_sppl_addr_p_PPanel.Addr_addr2;
		p.Hdr1_sppl_addr2.addAliasName("Hdr1.sppl_addr2", p);
		p.Hdr1_sppl_addr3 = p.Hdr1_sppl_addr_p_PPanel.Addr_addr3;
		p.Hdr1_sppl_addr3.addAliasName("Hdr1.sppl_addr3", p);
		p.Hdr1_sppl_addr4 = p.Hdr1_sppl_addr_p_PPanel.Addr_addr4;
		p.Hdr1_sppl_addr4.addAliasName("Hdr1.sppl_addr4", p);
		p.Hdr1_sppl_tel = p.Hdr1_sppl_addr_p_PPanel.Addr_tel;
		p.Hdr1_sppl_tel.addAliasName("Hdr1.sppl_tel", p);
		p.Hdr1_sppl_fax = p.Hdr1_sppl_addr_p_PPanel.Addr_fax;
		p.Hdr1_sppl_fax.addAliasName("Hdr1.sppl_fax", p);
		p.Hdr1_sppl_cntct_dpt = p.Hdr1_sppl_addr_p_PPanel.Addr_cntct_dpt;
		p.Hdr1_sppl_cntct_dpt.addAliasName("Hdr1.sppl_cntct_dpt", p);
		p.Hdr1_sppl_cntct_psn = p.Hdr1_sppl_addr_p_PPanel.Addr_cntct_psn;
		p.Hdr1_sppl_cntct_psn.addAliasName("Hdr1.sppl_cntct_psn", p);
		p.Hdr1_sppl_lg_grp_cd = p.Hdr1_sppl_addr_p_PPanel.Addr_lg_grp_cd;
		p.Hdr1_sppl_lg_grp_cd.addAliasName("Hdr1.sppl_lg_grp_cd", p);
		p.Hdr1_sppl_lg_grp_nm = p.Hdr1_sppl_addr_p_PPanel.Addr_lg_grp_nm;
		p.Hdr1_sppl_lg_grp_nm.addAliasName("Hdr1.sppl_lg_grp_nm", p);
		p.Hdr1_prax_xrate_p_PPanel = mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.create(p.getHdr1R().prax_xrate_p());
		p.Hdr1_prax_xrate_p_PPanel.setName("Hdr1.prax_xrate_p");
		p.Hdr1_ptax_xrate = p.Hdr1_prax_xrate_p_PPanel.Xrate_xrate;
		p.Hdr1_ptax_xrate.addAliasName("Hdr1.ptax_xrate", p);
		p.Hdr1_xrate_p_PPanel = mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.create(p.getHdr1R().xrate_p());
		p.Hdr1_xrate_p_PPanel.setName("Hdr1.xrate_p");
		p.Hdr1_xrate = p.Hdr1_xrate_p_PPanel.Xrate_xrate;
		p.Hdr1_xrate.addAliasName("Hdr1.xrate", p);
		p.Hdr1_trd_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdr1R().trd_cur_amt_p());
		p.Hdr1_trd_cur_amt_p_PPanel.setName("Hdr1.trd_cur_amt_p");
		p.Hdr1_trd_cur_amt = p.Hdr1_trd_cur_amt_p_PPanel.Amt_amt;
		p.Hdr1_trd_cur_amt.addAliasName("Hdr1.trd_cur_amt", p);
		p.Hdr1_trd_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdr1R().trd_cur_inc_tax_amt_p());
		p.Hdr1_trd_cur_inc_tax_amt_p_PPanel.setName("Hdr1.trd_cur_inc_tax_amt_p");
		p.Hdr1_trd_cur_inc_tax_amt = p.Hdr1_trd_cur_inc_tax_amt_p_PPanel.Amt_amt;
		p.Hdr1_trd_cur_inc_tax_amt.addAliasName("Hdr1.trd_cur_inc_tax_amt", p);
		p.Hdr1_ret_sppl_addr_p_PPanel = mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.create(p.getHdr1R().ret_sppl_addr_p());
		p.Hdr1_ret_sppl_addr_p_PPanel.setName("Hdr1.ret_sppl_addr_p");
		p.Hdr1_ret_sppl_cntry_cd = p.Hdr1_ret_sppl_addr_p_PPanel.Addr_cntry_cd;
		p.Hdr1_ret_sppl_cntry_cd.addAliasName("Hdr1.ret_sppl_cntry_cd", p);
		p.Hdr1_ret_sppl_cntry_nm = p.Hdr1_ret_sppl_addr_p_PPanel.Addr_cntry_nm;
		p.Hdr1_ret_sppl_cntry_nm.addAliasName("Hdr1.ret_sppl_cntry_nm", p);
		p.Hdr1_ret_sppl_zip_cd = p.Hdr1_ret_sppl_addr_p_PPanel.Addr_zip_cd;
		p.Hdr1_ret_sppl_zip_cd.addAliasName("Hdr1.ret_sppl_zip_cd", p);
		p.Hdr1_ret_sppl_addr1 = p.Hdr1_ret_sppl_addr_p_PPanel.Addr_addr1;
		p.Hdr1_ret_sppl_addr1.addAliasName("Hdr1.ret_sppl_addr1", p);
		p.Hdr1_ret_sppl_addr2 = p.Hdr1_ret_sppl_addr_p_PPanel.Addr_addr2;
		p.Hdr1_ret_sppl_addr2.addAliasName("Hdr1.ret_sppl_addr2", p);
		p.Hdr1_ret_sppl_addr3 = p.Hdr1_ret_sppl_addr_p_PPanel.Addr_addr3;
		p.Hdr1_ret_sppl_addr3.addAliasName("Hdr1.ret_sppl_addr3", p);
		p.Hdr1_ret_sppl_addr4 = p.Hdr1_ret_sppl_addr_p_PPanel.Addr_addr4;
		p.Hdr1_ret_sppl_addr4.addAliasName("Hdr1.ret_sppl_addr4", p);
		p.Hdr1_ret_sppl_cntct_dpt = p.Hdr1_ret_sppl_addr_p_PPanel.Addr_cntct_dpt;
		p.Hdr1_ret_sppl_cntct_dpt.addAliasName("Hdr1.ret_sppl_cntct_dpt", p);
		p.Hdr1_ret_sppl_cntct_psn = p.Hdr1_ret_sppl_addr_p_PPanel.Addr_cntct_psn;
		p.Hdr1_ret_sppl_cntct_psn.addAliasName("Hdr1.ret_sppl_cntct_psn", p);
		p.Hdr1_ret_sppl_tel = p.Hdr1_ret_sppl_addr_p_PPanel.Addr_tel;
		p.Hdr1_ret_sppl_tel.addAliasName("Hdr1.ret_sppl_tel", p);
		p.Hdr1_ret_sppl_fax = p.Hdr1_ret_sppl_addr_p_PPanel.Addr_fax;
		p.Hdr1_ret_sppl_fax.addAliasName("Hdr1.ret_sppl_fax", p);
		p.Hdr1_ret_sppl_lg_grp_cd = p.Hdr1_ret_sppl_addr_p_PPanel.Addr_lg_grp_cd;
		p.Hdr1_ret_sppl_lg_grp_cd.addAliasName("Hdr1.ret_sppl_lg_grp_cd", p);
		p.Hdr1_ret_sppl_lg_grp_nm = p.Hdr1_ret_sppl_addr_p_PPanel.Addr_lg_grp_nm;
		p.Hdr1_ret_sppl_lg_grp_nm.addAliasName("Hdr1.ret_sppl_lg_grp_nm", p);
		p.Hdr1_purc_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getHdr1R().purc_usr_dpt_p());
		p.Hdr1_purc_usr_dpt_p_PPanel.setName("Hdr1.purc_usr_dpt_p");
		p.Hdr1_purc_usr_cd = p.Hdr1_purc_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.Hdr1_purc_usr_cd.addAliasName("Hdr1.purc_usr_cd", p);
		p.Hdr1_purc_usr_nm = p.Hdr1_purc_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.Hdr1_purc_usr_nm.addAliasName("Hdr1.purc_usr_nm", p);
		p.Hdr1_purc_dpt_cd = p.Hdr1_purc_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.Hdr1_purc_dpt_cd.addAliasName("Hdr1.purc_dpt_cd", p);
		p.Hdr1_purc_dpt_nm = p.Hdr1_purc_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.Hdr1_purc_dpt_nm.addAliasName("Hdr1.purc_dpt_nm", p);
	}

	/**
	 * [Hdr2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr2(MSBDP_PurcRetSchdReg p) {
	}

	/**
	 * [Dtl1Panel]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl1Panel(MSBDP_PurcRetSchdReg p) {
	}

	/**
	 * [Dtl1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl1(MSBDP_PurcRetSchdReg p) {
		p.Dtl1_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$str_ln_p);
		p.Dtl1_str_ln_p_PPanel.setName("Dtl1.str_ln_p");
		p.columnDtl1_str_ln_cd = p.Dtl1_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnDtl1_str_ln_cd.addAliasName("Dtl1.str_ln_cd", p);
		p.columnDtl1_str_ln_nm = p.Dtl1_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnDtl1_str_ln_nm.addAliasName("Dtl1.str_ln_nm", p);
		p.columnDtl1_str_ln_cd_none_flg = p.Dtl1_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnDtl1_str_ln_cd_none_flg.addAliasName("Dtl1.str_ln_cd_none_flg", p);
		p.Dtl1_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$itm_p);
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
		p.Dtl1_lot_no_p_PPanel = mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$lot_no_p);
		p.Dtl1_lot_no_p_PPanel.setName("Dtl1.lot_no_p");
		p.columnDtl1_crt_lot_flg = p.Dtl1_lot_no_p_PPanel.columnLotNo_crt_lot_flg;
		p.columnDtl1_crt_lot_flg.addAliasName("Dtl1.crt_lot_flg", p);
		p.columnDtl1_lot_no = p.Dtl1_lot_no_p_PPanel.columnLotNo_lot_no;
		p.columnDtl1_lot_no.addAliasName("Dtl1.lot_no", p);
		p.columnDtl1_sublot_no = p.Dtl1_lot_no_p_PPanel.columnLotNo_sublot_no;
		p.columnDtl1_sublot_no.addAliasName("Dtl1.sublot_no", p);
		p.Dtl1_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$ver_no_p);
		p.Dtl1_ver_no_p_PPanel.setName("Dtl1.ver_no_p");
		p.columnDtl1_ver_no = p.Dtl1_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnDtl1_ver_no.addAliasName("Dtl1.ver_no", p);
		p.Dtl1_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$sno_wrk_no_p);
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
		p.Dtl1_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$trd_unit_qty_p);
		p.Dtl1_trd_unit_qty_p_PPanel.setName("Dtl1.trd_unit_qty_p");
		p.columnDtl1_trd_unit_qty = p.Dtl1_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl1_trd_unit_qty.addAliasName("Dtl1.trd_unit_qty", p);
		p.Dtl1_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$base_unit_qty_p);
		p.Dtl1_base_unit_qty_p_PPanel.setName("Dtl1.base_unit_qty_p");
		p.columnDtl1_base_unit_qty = p.Dtl1_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl1_base_unit_qty.addAliasName("Dtl1.base_unit_qty", p);
		p.Dtl1_ret_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$ret_qty_p);
		p.Dtl1_ret_qty_p_PPanel.setName("Dtl1.ret_qty_p");
		p.columnDtl1_ret_qty = p.Dtl1_ret_qty_p_PPanel.columnQty_qty;
		p.columnDtl1_ret_qty.addAliasName("Dtl1.ret_qty", p);
		p.Dtl1_trd_upri_amt_p_PPanel = mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$trd_upri_amt_p);
		p.Dtl1_trd_upri_amt_p_PPanel.setName("Dtl1.trd_upri_amt_p");
		p.columnDtl1_upri_not_tgt_flg = p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg;
		p.columnDtl1_upri_not_tgt_flg.addAliasName("Dtl1.upri_not_tgt_flg", p);
		p.columnDtl1_trd_cur_upri = p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_upri;
		p.columnDtl1_trd_cur_upri.addAliasName("Dtl1.trd_cur_upri", p);
		p.columnDtl1_interim_flg = p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_interim_flg;
		p.columnDtl1_interim_flg.addAliasName("Dtl1.interim_flg", p);
		p.columnDtl1_trd_cur_amt = p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_amt;
		p.columnDtl1_trd_cur_amt.addAliasName("Dtl1.trd_cur_amt", p);
		p.columnDtl1_trd_cur_inc_tax_amt = p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_inc_tax_amt;
		p.columnDtl1_trd_cur_inc_tax_amt.addAliasName("Dtl1.trd_cur_inc_tax_amt", p);
		p.columnDtl1_tax_fix_flg = p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_fix_flg;
		p.columnDtl1_tax_fix_flg.addAliasName("Dtl1.tax_fix_flg", p);
		p.columnDtl1_tax_cd = p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd;
		p.columnDtl1_tax_cd.addAliasName("Dtl1.tax_cd", p);
		p.columnDtl1_tax_nm = p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_nm;
		p.columnDtl1_tax_nm.addAliasName("Dtl1.tax_nm", p);
		p.columnDtl1_tax_rate = p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_rate;
		p.columnDtl1_tax_rate.addAliasName("Dtl1.tax_rate", p);
		p.columnDtl1_tax_typ = p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_typ;
		p.columnDtl1_tax_typ.addAliasName("Dtl1.tax_typ", p);
		p.columnDtl1_inc_tax_flg = p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_inc_tax_flg;
		p.columnDtl1_inc_tax_flg.addAliasName("Dtl1.inc_tax_flg", p);
		p.columnDtl1_trd_cur_tax_amt = p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_tax_amt;
		p.columnDtl1_trd_cur_tax_amt.addAliasName("Dtl1.trd_cur_tax_amt", p);
		p.columnDtl1_trd_cur_dscnt_amt = p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt;
		p.columnDtl1_trd_cur_dscnt_amt.addAliasName("Dtl1.trd_cur_dscnt_amt", p);
		p.columnDtl1_dscnt_rsn_cd = p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd;
		p.columnDtl1_dscnt_rsn_cd.addAliasName("Dtl1.dscnt_rsn_cd", p);
		p.columnDtl1_dscnt_rsn_nm = p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm;
		p.columnDtl1_dscnt_rsn_nm.addAliasName("Dtl1.dscnt_rsn_nm", p);
		p.Dtl1_trd_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$trd_cur_proc_upri_p);
		p.Dtl1_trd_cur_proc_upri_p_PPanel.setName("Dtl1.trd_cur_proc_upri_p");
		p.columnDtl1_trd_cur_proc_upri = p.Dtl1_trd_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnDtl1_trd_cur_proc_upri.addAliasName("Dtl1.trd_cur_proc_upri", p);
		p.Dtl1_trd_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$trd_cur_onr_prov_upri_p);
		p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.setName("Dtl1.trd_cur_onr_prov_upri_p");
		p.columnDtl1_trd_cur_onr_prov_upri = p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnDtl1_trd_cur_onr_prov_upri.addAliasName("Dtl1.trd_cur_onr_prov_upri", p);
		p.Dtl1_trd_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$trd_cur_proc_amt_p);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.setName("Dtl1.trd_cur_proc_amt_p");
		p.columnDtl1_trd_cur_proc_amt = p.Dtl1_trd_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_trd_cur_proc_amt.addAliasName("Dtl1.trd_cur_proc_amt", p);
		p.columnDtl1_trd_cur_proc_tax_amt = p.Dtl1_trd_cur_proc_amt_p_PPanel.columnAmt_tax_amt;
		p.columnDtl1_trd_cur_proc_tax_amt.addAliasName("Dtl1.trd_cur_proc_tax_amt", p);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$trd_cur_onr_prov_amt_p);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.setName("Dtl1.trd_cur_onr_prov_amt_p");
		p.columnDtl1_trd_cur_onr_prov_amt = p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_trd_cur_onr_prov_amt.addAliasName("Dtl1.trd_cur_onr_prov_amt", p);
		p.columnDtl1_trd_cur_onr_prov_tax_amt = p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt;
		p.columnDtl1_trd_cur_onr_prov_tax_amt.addAliasName("Dtl1.trd_cur_onr_prov_tax_amt", p);
		p.Dtl1_base_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$base_cur_upri_p);
		p.Dtl1_base_cur_upri_p_PPanel.setName("Dtl1.base_cur_upri_p");
		p.columnDtl1_base_cur_upri = p.Dtl1_base_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl1_base_cur_upri.addAliasName("Dtl1.base_cur_upri", p);
		p.Dtl1_base_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$base_cur_proc_upri_p);
		p.Dtl1_base_cur_proc_upri_p_PPanel.setName("Dtl1.base_cur_proc_upri_p");
		p.columnDtl1_base_cur_proc_upri = p.Dtl1_base_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnDtl1_base_cur_proc_upri.addAliasName("Dtl1.base_cur_proc_upri", p);
		p.Dtl1_base_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$base_cur_onr_prov_upri_p);
		p.Dtl1_base_cur_onr_prov_upri_p_PPanel.setName("Dtl1.base_cur_onr_prov_upri_p");
		p.columnDtl1_base_cur_onr_prov_upri = p.Dtl1_base_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnDtl1_base_cur_onr_prov_upri.addAliasName("Dtl1.base_cur_onr_prov_upri", p);
		p.Dtl1_base_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$base_cur_dscnt_amt_p);
		p.Dtl1_base_cur_dscnt_amt_p_PPanel.setName("Dtl1.base_cur_dscnt_amt_p");
		p.columnDtl1_base_cur_dscnt_amt = p.Dtl1_base_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_base_cur_dscnt_amt.addAliasName("Dtl1.base_cur_dscnt_amt", p);
		p.Dtl1_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$base_cur_amt_p);
		p.Dtl1_base_cur_amt_p_PPanel.setName("Dtl1.base_cur_amt_p");
		p.columnDtl1_base_cur_amt = p.Dtl1_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_base_cur_amt.addAliasName("Dtl1.base_cur_amt", p);
		p.Dtl1_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$base_cur_tax_amt_p);
		p.Dtl1_base_cur_tax_amt_p_PPanel.setName("Dtl1.base_cur_tax_amt_p");
		p.columnDtl1_base_cur_tax_amt = p.Dtl1_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_base_cur_tax_amt.addAliasName("Dtl1.base_cur_tax_amt", p);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$base_cur_inc_tax_amt_p);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.setName("Dtl1.base_cur_inc_tax_amt_p");
		p.columnDtl1_base_cur_inc_tax_amt = p.Dtl1_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_base_cur_inc_tax_amt.addAliasName("Dtl1.base_cur_inc_tax_amt", p);
		p.Dtl1_base_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$base_cur_proc_amt_p);
		p.Dtl1_base_cur_proc_amt_p_PPanel.setName("Dtl1.base_cur_proc_amt_p");
		p.columnDtl1_base_cur_proc_amt = p.Dtl1_base_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_base_cur_proc_amt.addAliasName("Dtl1.base_cur_proc_amt", p);
		p.columnDtl1_base_cur_proc_tax_amt = p.Dtl1_base_cur_proc_amt_p_PPanel.columnAmt_tax_amt;
		p.columnDtl1_base_cur_proc_tax_amt.addAliasName("Dtl1.base_cur_proc_tax_amt", p);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$base_cur_onr_prov_amt_p);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.setName("Dtl1.base_cur_onr_prov_amt_p");
		p.columnDtl1_base_cur_onr_prov_amt = p.Dtl1_base_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_base_cur_onr_prov_amt.addAliasName("Dtl1.base_cur_onr_prov_amt", p);
		p.columnDtl1_base_cur_onr_prov_tax_amt = p.Dtl1_base_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt;
		p.columnDtl1_base_cur_onr_prov_tax_amt.addAliasName("Dtl1.base_cur_onr_prov_tax_amt", p);
		p.Dtl1_ptax_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$ptax_cur_upri_p);
		p.Dtl1_ptax_cur_upri_p_PPanel.setName("Dtl1.ptax_cur_upri_p");
		p.columnDtl1_ptax_cur_upri = p.Dtl1_ptax_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl1_ptax_cur_upri.addAliasName("Dtl1.ptax_cur_upri", p);
		p.Dtl1_ptax_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$ptax_cur_proc_upri_p);
		p.Dtl1_ptax_cur_proc_upri_p_PPanel.setName("Dtl1.ptax_cur_proc_upri_p");
		p.columnDtl1_ptax_cur_proc_upri = p.Dtl1_ptax_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnDtl1_ptax_cur_proc_upri.addAliasName("Dtl1.ptax_cur_proc_upri", p);
		p.Dtl1_ptax_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$ptax_cur_onr_prov_upri_p);
		p.Dtl1_ptax_cur_onr_prov_upri_p_PPanel.setName("Dtl1.ptax_cur_onr_prov_upri_p");
		p.columnDtl1_ptax_cur_onr_prov_upri = p.Dtl1_ptax_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnDtl1_ptax_cur_onr_prov_upri.addAliasName("Dtl1.ptax_cur_onr_prov_upri", p);
		p.Dtl1_ptax_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$ptax_cur_dscnt_amt_p);
		p.Dtl1_ptax_cur_dscnt_amt_p_PPanel.setName("Dtl1.ptax_cur_dscnt_amt_p");
		p.columnDtl1_ptax_cur_dscnt_amt = p.Dtl1_ptax_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_ptax_cur_dscnt_amt.addAliasName("Dtl1.ptax_cur_dscnt_amt", p);
		p.Dtl1_ptax_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$ptax_cur_amt_p);
		p.Dtl1_ptax_cur_amt_p_PPanel.setName("Dtl1.ptax_cur_amt_p");
		p.columnDtl1_ptax_cur_amt = p.Dtl1_ptax_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_ptax_cur_amt.addAliasName("Dtl1.ptax_cur_amt", p);
		p.Dtl1_ptax_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$ptax_cur_tax_amt_p);
		p.Dtl1_ptax_cur_tax_amt_p_PPanel.setName("Dtl1.ptax_cur_tax_amt_p");
		p.columnDtl1_ptax_cur_tax_amt = p.Dtl1_ptax_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_ptax_cur_tax_amt.addAliasName("Dtl1.ptax_cur_tax_amt", p);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$ptax_cur_inc_tax_amt_p);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.setName("Dtl1.ptax_cur_inc_tax_amt_p");
		p.columnDtl1_ptax_cur_inc_tax_amt = p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_ptax_cur_inc_tax_amt.addAliasName("Dtl1.ptax_cur_inc_tax_amt", p);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$ptax_cur_proc_amt_p);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.setName("Dtl1.ptax_cur_proc_amt_p");
		p.columnDtl1_ptax_cur_proc_amt = p.Dtl1_ptax_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_ptax_cur_proc_amt.addAliasName("Dtl1.ptax_cur_proc_amt", p);
		p.columnDtl1_ptax_cur_proc_tax_amt = p.Dtl1_ptax_cur_proc_amt_p_PPanel.columnAmt_tax_amt;
		p.columnDtl1_ptax_cur_proc_tax_amt.addAliasName("Dtl1.ptax_cur_proc_tax_amt", p);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$ptax_cur_onr_prov_amt_p);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.setName("Dtl1.ptax_cur_onr_prov_amt_p");
		p.columnDtl1_ptax_cur_onr_prov_amt = p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_ptax_cur_onr_prov_amt.addAliasName("Dtl1.ptax_cur_onr_prov_amt", p);
		p.columnDtl1_ptax_cur_onr_prov_tax_amt = p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt;
		p.columnDtl1_ptax_cur_onr_prov_tax_amt.addAliasName("Dtl1.ptax_cur_onr_prov_tax_amt", p);
		p.Dtl1_wtax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$wtax_amt_p);
		p.Dtl1_wtax_amt_p_PPanel.setName("Dtl1.wtax_amt_p");
		p.columnDtl1_wtax_amt = p.Dtl1_wtax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_wtax_amt.addAliasName("Dtl1.wtax_amt", p);
		p.Dtl1_bd_p_PPanel = mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$bd_p);
		p.Dtl1_bd_p_PPanel.setName("Dtl1.bd_p");
		p.columnDtl1_bd_dpt_cd = p.Dtl1_bd_p_PPanel.columnBdItem_bd_dpt_cd;
		p.columnDtl1_bd_dpt_cd.addAliasName("Dtl1.bd_dpt_cd", p);
		p.columnDtl1_bd_dpt_nm = p.Dtl1_bd_p_PPanel.columnBdItem_bd_dpt_nm;
		p.columnDtl1_bd_dpt_nm.addAliasName("Dtl1.bd_dpt_nm", p);
		p.columnDtl1_bd_itm_cd = p.Dtl1_bd_p_PPanel.columnBdItem_bd_itm_cd;
		p.columnDtl1_bd_itm_cd.addAliasName("Dtl1.bd_itm_cd", p);
		p.columnDtl1_bd_itm_sub1 = p.Dtl1_bd_p_PPanel.columnBdItem_bd_itm_sub1;
		p.columnDtl1_bd_itm_sub1.addAliasName("Dtl1.bd_itm_sub1", p);
		p.columnDtl1_bd_itm_sub2 = p.Dtl1_bd_p_PPanel.columnBdItem_bd_itm_sub2;
		p.columnDtl1_bd_itm_sub2.addAliasName("Dtl1.bd_itm_sub2", p);
		p.columnDtl1_bd_itm_sub3 = p.Dtl1_bd_p_PPanel.columnBdItem_bd_itm_sub3;
		p.columnDtl1_bd_itm_sub3.addAliasName("Dtl1.bd_itm_sub3", p);
		p.columnDtl1_bd_itm_nm = p.Dtl1_bd_p_PPanel.columnBdItem_bd_itm_nm;
		p.columnDtl1_bd_itm_nm.addAliasName("Dtl1.bd_itm_nm", p);
		p.columnDtl1_bd_lot_no = p.Dtl1_bd_p_PPanel.columnBdItem_bd_lot_no;
		p.columnDtl1_bd_lot_no.addAliasName("Dtl1.bd_lot_no", p);
		p.columnDtl1_bd_sublot_no = p.Dtl1_bd_p_PPanel.columnBdItem_bd_sublot_no;
		p.columnDtl1_bd_sublot_no.addAliasName("Dtl1.bd_sublot_no", p);
		p.columnDtl1_bd_sno1 = p.Dtl1_bd_p_PPanel.columnBdItem_bd_sno1;
		p.columnDtl1_bd_sno1.addAliasName("Dtl1.bd_sno1", p);
		p.columnDtl1_bd_sno2 = p.Dtl1_bd_p_PPanel.columnBdItem_bd_sno2;
		p.columnDtl1_bd_sno2.addAliasName("Dtl1.bd_sno2", p);
		p.columnDtl1_bd_sno3 = p.Dtl1_bd_p_PPanel.columnBdItem_bd_sno3;
		p.columnDtl1_bd_sno3.addAliasName("Dtl1.bd_sno3", p);
		p.columnDtl1_bd_sno4 = p.Dtl1_bd_p_PPanel.columnBdItem_bd_sno4;
		p.columnDtl1_bd_sno4.addAliasName("Dtl1.bd_sno4", p);
		p.columnDtl1_bd_bp_cd = p.Dtl1_bd_p_PPanel.columnBdItem_bd_bp_cd;
		p.columnDtl1_bd_bp_cd.addAliasName("Dtl1.bd_bp_cd", p);
		p.columnDtl1_bd_bp_nm = p.Dtl1_bd_p_PPanel.columnBdItem_bd_bp_nm;
		p.columnDtl1_bd_bp_nm.addAliasName("Dtl1.bd_bp_nm", p);
		p.columnDtl1_bd_loc_cd = p.Dtl1_bd_p_PPanel.columnBdItem_bd_loc_cd;
		p.columnDtl1_bd_loc_cd.addAliasName("Dtl1.bd_loc_cd", p);
		p.columnDtl1_bd_loc_nm = p.Dtl1_bd_p_PPanel.columnBdItem_bd_loc_nm;
		p.columnDtl1_bd_loc_nm.addAliasName("Dtl1.bd_loc_nm", p);
		p.columnDtl1_bd_ctg_cd = p.Dtl1_bd_p_PPanel.columnBdItem_bd_ctg_cd;
		p.columnDtl1_bd_ctg_cd.addAliasName("Dtl1.bd_ctg_cd", p);
		p.columnDtl1_bd_ctg_nm = p.Dtl1_bd_p_PPanel.columnBdItem_bd_ctg_nm;
		p.columnDtl1_bd_ctg_nm.addAliasName("Dtl1.bd_ctg_nm", p);
		p.columnDtl1_bd_oper_cd = p.Dtl1_bd_p_PPanel.columnBdItem_bd_oper_cd;
		p.columnDtl1_bd_oper_cd.addAliasName("Dtl1.bd_oper_cd", p);
		p.columnDtl1_bd_oper_nm = p.Dtl1_bd_p_PPanel.columnBdItem_bd_oper_nm;
		p.columnDtl1_bd_oper_nm.addAliasName("Dtl1.bd_oper_nm", p);
		p.columnDtl1_bd_iv_no = p.Dtl1_bd_p_PPanel.columnBdItem_bd_iv_no;
		p.columnDtl1_bd_iv_no.addAliasName("Dtl1.bd_iv_no", p);
		p.columnDtl1_bd_slo_no = p.Dtl1_bd_p_PPanel.columnBdItem_bd_slo_no;
		p.columnDtl1_bd_slo_no.addAliasName("Dtl1.bd_slo_no", p);
		p.columnDtl1_bd_po_no = p.Dtl1_bd_p_PPanel.columnBdItem_bd_po_no;
		p.columnDtl1_bd_po_no.addAliasName("Dtl1.bd_po_no", p);
		p.Dtl1_purc_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$purc_cont_qty_p);
		p.Dtl1_purc_cont_qty_p_PPanel.setName("Dtl1.purc_cont_qty_p");
		p.columnDtl1_purc_cont_qty = p.Dtl1_purc_cont_qty_p_PPanel.columnPurcContQty_purc_cont_qty;
		p.columnDtl1_purc_cont_qty.addAliasName("Dtl1.purc_cont_qty", p);
		p.Dtl1_purc_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$purc_cont_fctr_p);
		p.Dtl1_purc_cont_fctr_p_PPanel.setName("Dtl1.purc_cont_fctr_p");
		p.columnDtl1_purc_cont_fctr = p.Dtl1_purc_cont_fctr_p_PPanel.columnPurcContFctr_purc_cont_fctr;
		p.columnDtl1_purc_cont_fctr.addAliasName("Dtl1.purc_cont_fctr", p);
		p.Dtl1_std_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$std_cont_qty_p);
		p.Dtl1_std_cont_qty_p_PPanel.setName("Dtl1.std_cont_qty_p");
		p.columnDtl1_std_cont_qty = p.Dtl1_std_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnDtl1_std_cont_qty.addAliasName("Dtl1.std_cont_qty", p);
		p.Dtl1_cont_fctr_unit_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$cont_fctr_unit_p);
		p.Dtl1_cont_fctr_unit_p_PPanel.setName("Dtl1.cont_fctr_unit_p");
		p.columnDtl1_cont_fctr_unit_cd = p.Dtl1_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnDtl1_cont_fctr_unit_cd.addAliasName("Dtl1.cont_fctr_unit_cd", p);
		p.columnDtl1_cont_fctr_unit_nm = p.Dtl1_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnDtl1_cont_fctr_unit_nm.addAliasName("Dtl1.cont_fctr_unit_nm", p);
		p.Dtl1_std_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.$std_cont_fctr_p);
		p.Dtl1_std_cont_fctr_p_PPanel.setName("Dtl1.std_cont_fctr_p");
		p.columnDtl1_std_cont_fctr = p.Dtl1_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnDtl1_std_cont_fctr.addAliasName("Dtl1.std_cont_fctr", p);
	}

	/**
	 * [Dtl1Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl1Btn(MSBDP_PurcRetSchdReg p) {
		p.Dtl1Btn_Btn_open_MSBEP0500_PPanel = mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.create();
		p.Dtl1Btn_Btn_open_MSBEP0500_PPanel.setName("Dtl1Btn.Btn_open_MSBEP0500");
		p.Dtl1Btn_menu_move_p_PPanel = mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.create();
		p.Dtl1Btn_menu_move_p_PPanel.setName("Dtl1Btn.menu_move_p");
	}

	/**
	 * [Dtl2Panel]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl2Panel(MSBDP_PurcRetSchdReg p) {
	}

	/**
	 * [Dtl2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl2(MSBDP_PurcRetSchdReg p) {
		p.Dtl2_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBD.MSBDP0150.Dtl2R.$str_ln_p);
		p.Dtl2_str_ln_p_PPanel.setName("Dtl2.str_ln_p");
		p.columnDtl2_str_ln_cd = p.Dtl2_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnDtl2_str_ln_cd.addAliasName("Dtl2.str_ln_cd", p);
		p.columnDtl2_str_ln_nm = p.Dtl2_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnDtl2_str_ln_nm.addAliasName("Dtl2.str_ln_nm", p);
		p.columnDtl2_str_ln_cd_none_flg = p.Dtl2_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnDtl2_str_ln_cd_none_flg.addAliasName("Dtl2.str_ln_cd_none_flg", p);
		p.Dtl2_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBD.MSBDP0150.Dtl2R.$itm_p);
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
		p.Dtl2_lot_no_p_PPanel = mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.create(mcframe.clientMSBD.MSBDP0150.Dtl2R.$lot_no_p);
		p.Dtl2_lot_no_p_PPanel.setName("Dtl2.lot_no_p");
		p.columnDtl2_crt_lot_flg = p.Dtl2_lot_no_p_PPanel.columnLotNo_crt_lot_flg;
		p.columnDtl2_crt_lot_flg.addAliasName("Dtl2.crt_lot_flg", p);
		p.columnDtl2_lot_no = p.Dtl2_lot_no_p_PPanel.columnLotNo_lot_no;
		p.columnDtl2_lot_no.addAliasName("Dtl2.lot_no", p);
		p.columnDtl2_sublot_no = p.Dtl2_lot_no_p_PPanel.columnLotNo_sublot_no;
		p.columnDtl2_sublot_no.addAliasName("Dtl2.sublot_no", p);
		p.Dtl2_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBD.MSBDP0150.Dtl2R.$ver_no_p);
		p.Dtl2_ver_no_p_PPanel.setName("Dtl2.ver_no_p");
		p.columnDtl2_ver_no = p.Dtl2_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnDtl2_ver_no.addAliasName("Dtl2.ver_no", p);
		p.Dtl2_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBD.MSBDP0150.Dtl2R.$sno_wrk_no_p);
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
		p.Dtl2_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0150.Dtl2R.$trd_unit_qty_p);
		p.Dtl2_trd_unit_qty_p_PPanel.setName("Dtl2.trd_unit_qty_p");
		p.columnDtl2_trd_unit_qty = p.Dtl2_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl2_trd_unit_qty.addAliasName("Dtl2.trd_unit_qty", p);
		p.Dtl2_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBD.MSBDP0150.Dtl2R.$base_unit_qty_p);
		p.Dtl2_base_unit_qty_p_PPanel.setName("Dtl2.base_unit_qty_p");
		p.columnDtl2_base_unit_qty = p.Dtl2_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl2_base_unit_qty.addAliasName("Dtl2.base_unit_qty", p);
		p.Dtl2_purc_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.create(mcframe.clientMSBD.MSBDP0150.Dtl2R.$purc_cont_qty_p);
		p.Dtl2_purc_cont_qty_p_PPanel.setName("Dtl2.purc_cont_qty_p");
		p.columnDtl2_purc_cont_qty = p.Dtl2_purc_cont_qty_p_PPanel.columnPurcContQty_purc_cont_qty;
		p.columnDtl2_purc_cont_qty.addAliasName("Dtl2.purc_cont_qty", p);
		p.Dtl2_purc_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.create(mcframe.clientMSBD.MSBDP0150.Dtl2R.$purc_cont_fctr_p);
		p.Dtl2_purc_cont_fctr_p_PPanel.setName("Dtl2.purc_cont_fctr_p");
		p.columnDtl2_purc_cont_fctr = p.Dtl2_purc_cont_fctr_p_PPanel.columnPurcContFctr_purc_cont_fctr;
		p.columnDtl2_purc_cont_fctr.addAliasName("Dtl2.purc_cont_fctr", p);
		p.Dtl2_std_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBD.MSBDP0150.Dtl2R.$std_cont_qty_p);
		p.Dtl2_std_cont_qty_p_PPanel.setName("Dtl2.std_cont_qty_p");
		p.columnDtl2_std_cont_qty = p.Dtl2_std_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnDtl2_std_cont_qty.addAliasName("Dtl2.std_cont_qty", p);
		p.Dtl2_std_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBD.MSBDP0150.Dtl2R.$std_cont_fctr_p);
		p.Dtl2_std_cont_fctr_p_PPanel.setName("Dtl2.std_cont_fctr_p");
		p.columnDtl2_std_cont_fctr = p.Dtl2_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnDtl2_std_cont_fctr.addAliasName("Dtl2.std_cont_fctr", p);
		p.Dtl2_cont_fctr_unit_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBD.MSBDP0150.Dtl2R.$cont_fctr_unit_p);
		p.Dtl2_cont_fctr_unit_p_PPanel.setName("Dtl2.cont_fctr_unit_p");
		p.columnDtl2_cont_fctr_unit_cd = p.Dtl2_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnDtl2_cont_fctr_unit_cd.addAliasName("Dtl2.cont_fctr_unit_cd", p);
		p.columnDtl2_cont_fctr_unit_nm = p.Dtl2_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnDtl2_cont_fctr_unit_nm.addAliasName("Dtl2.cont_fctr_unit_nm", p);
	}

	/**
	 * [Dtl2Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl2Btn(MSBDP_PurcRetSchdReg p) {
		p.Dtl2Btn_Btn_open_MSBEP0500_PPanel = mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.create();
		p.Dtl2Btn_Btn_open_MSBEP0500_PPanel.setName("Dtl2Btn.Btn_open_MSBEP0500");
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBDP_PurcRetSchdReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBDP_PurcRetSchdReg p) {
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
	
	
	/** [Hdr1_trd_cd_ListPutter]の定義 */
	private MCListPutter Hdr1_trd_cd_p = null;

	/**
	 * [Hdr1_trd_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr1_trd_cd_ListPutter() {
		if (Hdr1_trd_cd_p == null) {
			Hdr1_trd_cd_p = createHdr1_trd_cd_ListPutter(Hdr1_trd_cd, "trd_cd", "trd_nm","trd_ptn_typ");

		}
		return Hdr1_trd_cd_p;
	}
	
	
	/** [Hdr1_sppl_cd_ListPutter]の定義 */
	private MCListPutter Hdr1_sppl_cd_p = null;

	/**
	 * [Hdr1_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr1_sppl_cd_ListPutter() {
		if (Hdr1_sppl_cd_p == null) {
			Hdr1_sppl_cd_p = createHdr1_sppl_cd_ListPutter(Hdr1_sppl_cd, "sppl_cd", "sppl_nm","purc_upri_cng_flg","sppl_cntry_cd","sppl_cntry_nm","sppl_zip_cd","sppl_addr1","sppl_addr2","sppl_addr3","sppl_addr4","sppl_cntct_dpt","sppl_cntct_psn","sppl_tel","sppl_fax","sppl_iv_flg","prnt_lcl_cd","subcon_flg","trd_cur_cd","asppl_cd","purc_amt_rnd_typ","purc_tax_rnd_typ","purc_tax_cd","purc_tax_cd_prio_flg","sppl_pay_crryovr_times","ap_dpt_cd","mst_ap_dpt_cd","pay_spot_flg","tterm_cd1","tterm_cd2","tterm_cd3","def_purc_usr_cd","def_purc_dpt_cd","repurc_obli_flg","outsrc_upri_typ");

		}
		return Hdr1_sppl_cd_p;
	}
	
	
	/** [Hdr1_asppl_cd_ListPutter]の定義 */
	private MCListPutter Hdr1_asppl_cd_p = null;

	/**
	 * [Hdr1_asppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr1_asppl_cd_ListPutter() {
		if (Hdr1_asppl_cd_p == null) {
			Hdr1_asppl_cd_p = createHdr1_asppl_cd_ListPutter(Hdr1_asppl_cd, "asppl_cd", "asppl_nm");

		}
		return Hdr1_asppl_cd_p;
	}
	
	
	/** [Hdr1_trd_cur_cd_ListPutter]の定義 */
	private MCListPutter Hdr1_trd_cur_cd_p = null;

	/**
	 * [Hdr1_trd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr1_trd_cur_cd_ListPutter() {
		if (Hdr1_trd_cur_cd_p == null) {
			Hdr1_trd_cur_cd_p = createHdr1_trd_cur_cd_ListPutter(Hdr1_trd_cur_cd, "trd_cur_cd", "trd_cur_nm","trd_cur_upri_dec_place","trd_cur_amt_dec_place");

		}
		return Hdr1_trd_cur_cd_p;
	}
	
	
	/** [Hdr1_ptax_cur_cd_ListPutter]の定義 */
	private MCListPutter Hdr1_ptax_cur_cd_p = null;

	/**
	 * [Hdr1_ptax_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr1_ptax_cur_cd_ListPutter() {
		if (Hdr1_ptax_cur_cd_p == null) {
			Hdr1_ptax_cur_cd_p = createHdr1_ptax_cur_cd_ListPutter(Hdr1_ptax_cur_cd, "ptax_cur_cd", "ptax_cur_nm","ptax_cur_amt_dec_place","ptax_cur_upri_dec_place");

		}
		return Hdr1_ptax_cur_cd_p;
	}
	
	
	/** [Hdr1_base_cur_cd_ListPutter]の定義 */
	private MCListPutter Hdr1_base_cur_cd_p = null;

	/**
	 * [Hdr1_base_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr1_base_cur_cd_ListPutter() {
		if (Hdr1_base_cur_cd_p == null) {
			Hdr1_base_cur_cd_p = createHdr1_base_cur_cd_ListPutter(Hdr1_base_cur_cd, "base_cur_cd", "base_cur_nm","base_cur_amt_dec_place","base_cur_upri_dec_place");

		}
		return Hdr1_base_cur_cd_p;
	}
	
	
	/** [Hdr1_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Hdr1_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [Hdr1_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr1_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (Hdr1_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			Hdr1_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createHdr1_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(Hdr1_purc_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "purc_dpt_cd", "purc_dpt_nm","purc_dpt_wg_cd","purc_dpt_wg_nm","ap_dpt_flg");
		}
		return Hdr1_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [Hdr1_tterm_cd1_ListPutter]の定義 */
	private MCListPutter Hdr1_tterm_cd1_p = null;

	/**
	 * [Hdr1_tterm_cd1_ListPutter]の取得
	 */
	protected MCListPutter getHdr1_tterm_cd1_ListPutter() {
		if (Hdr1_tterm_cd1_p == null) {
			Hdr1_tterm_cd1_p = createHdr1_tterm_cd1_ListPutter(Hdr1_tterm_cd1, "tterm_cd1", "tterm_nm1");

		}
		return Hdr1_tterm_cd1_p;
	}
	
	
	/** [Hdr1_tterm_cd2_ListPutter]の定義 */
	private MCListPutter Hdr1_tterm_cd2_p = null;

	/**
	 * [Hdr1_tterm_cd2_ListPutter]の取得
	 */
	protected MCListPutter getHdr1_tterm_cd2_ListPutter() {
		if (Hdr1_tterm_cd2_p == null) {
			Hdr1_tterm_cd2_p = createHdr1_tterm_cd2_ListPutter(Hdr1_tterm_cd2, "tterm_cd2", "tterm_nm2");

		}
		return Hdr1_tterm_cd2_p;
	}
	
	
	/** [Hdr1_tterm_cd3_ListPutter]の定義 */
	private MCListPutter Hdr1_tterm_cd3_p = null;

	/**
	 * [Hdr1_tterm_cd3_ListPutter]の取得
	 */
	protected MCListPutter getHdr1_tterm_cd3_ListPutter() {
		if (Hdr1_tterm_cd3_p == null) {
			Hdr1_tterm_cd3_p = createHdr1_tterm_cd3_ListPutter(Hdr1_tterm_cd3, "tterm_cd3", "tterm_nm3");

		}
		return Hdr1_tterm_cd3_p;
	}
	
	
	/** [Dtl1_purc_ret_loc_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_purc_ret_loc_cd_p = null;

	/**
	 * [Dtl1_purc_ret_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_purc_ret_loc_cd_ListPutter() {
		if (Dtl1_purc_ret_loc_cd_p == null) {
			Dtl1_purc_ret_loc_cd_p = createDtl1_purc_ret_loc_cd_ListPutter(columnDtl1_purc_ret_loc_cd, "purc_ret_loc_cd", "purc_ret_loc_wg_cd","purc_ret_loc_wg_nm","purc_ret_loc_nm","str_ln_tgt_flg","purc_ret_sppl_cd","loc_mng_typ");

		}
		return Dtl1_purc_ret_loc_cd_p;
	}
	
	
	/** [Dtl1_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = null;

	/**
	 * [Dtl1_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter() {
		if (Dtl1_str_ln_p_PPanel_columnStrLn_str_ln_cd_p == null) {
			Dtl1_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = createDtl1_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(Dtl1_str_ln_p_PPanel.columnStrLn_str_ln_cd, "str_ln_cd", "str_ln_nm");
		}
		return Dtl1_str_ln_p_PPanel_columnStrLn_str_ln_cd_p;
	}
	
	
	/** [Dtl1_asset_mng_typ_ListPutter]の定義 */
	private MCListPutter Dtl1_asset_mng_typ_p = null;

	/**
	 * [Dtl1_asset_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_asset_mng_typ_ListPutter() {
		if (Dtl1_asset_mng_typ_p == null) {
			Dtl1_asset_mng_typ_p = createDtl1_asset_mng_typ_ListPutter(columnDtl1_asset_mng_typ, "asset_mng_typ", "asset_mng_typ_nm");

		}
		return Dtl1_asset_mng_typ_p;
	}
	
	
	/** [Dtl1_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Dtl1_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Dtl1_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Dtl1_itm_p_PPanel_columnItm_itm_cd_p = createDtl1_itm_p_PPanel_columnItm_itm_cd_ListPutter(Dtl1_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "sundry_itm_flg","itm_nm","itm_sub1","itm_sub2","itm_sub3","lot_mng_typ","lot_no_typ","sublot_mng_typ","sublot_no_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","itm_purc_upri_cng_flg","dscnt_itm_flg","arr_skip_flg","ver_flg","stk_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_unit_nm","cont_fctr_rnd_typ","cont_fctr_dec_place","asset_mng_typ","wtax_rate","itm_pay_crryovr_times","maker_cd","maker_nm","trd_unit_cd");
		}
		return Dtl1_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [Dtl1_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Dtl1_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [Dtl1_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (Dtl1_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			Dtl1_itm_p_PPanel_columnItm_itm_sub1_p = createDtl1_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Dtl1_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "sundry_itm_flg","itm_nm","itm_sub2","itm_sub3","lot_mng_typ","lot_no_typ","sublot_mng_typ","sublot_no_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","itm_purc_upri_cng_flg","dscnt_itm_flg","arr_skip_flg","ver_flg","stk_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_unit_nm","cont_fctr_rnd_typ","cont_fctr_dec_place","asset_mng_typ","wtax_rate","itm_pay_crryovr_times","maker_cd","maker_nm","trd_unit_cd");
		}
		return Dtl1_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [Dtl1_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Dtl1_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [Dtl1_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (Dtl1_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			Dtl1_itm_p_PPanel_columnItm_itm_sub2_p = createDtl1_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Dtl1_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "sundry_itm_flg","itm_nm","itm_sub3","lot_mng_typ","lot_no_typ","sublot_mng_typ","sublot_no_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","itm_purc_upri_cng_flg","dscnt_itm_flg","arr_skip_flg","ver_flg","stk_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_unit_nm","cont_fctr_rnd_typ","cont_fctr_dec_place","asset_mng_typ","wtax_rate","itm_pay_crryovr_times","maker_cd","maker_nm","trd_unit_cd");
		}
		return Dtl1_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [Dtl1_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Dtl1_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [Dtl1_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (Dtl1_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			Dtl1_itm_p_PPanel_columnItm_itm_sub3_p = createDtl1_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Dtl1_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "sundry_itm_flg","itm_nm","lot_mng_typ","lot_no_typ","sublot_mng_typ","sublot_no_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","itm_purc_upri_cng_flg","dscnt_itm_flg","arr_skip_flg","ver_flg","stk_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_unit_nm","cont_fctr_rnd_typ","cont_fctr_dec_place","asset_mng_typ","wtax_rate","itm_pay_crryovr_times","maker_cd","maker_nm","trd_unit_cd");
		}
		return Dtl1_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Dtl1_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の定義 */
	private MCListPutter Dtl1_lot_no_p_PPanel_columnLotNo_lot_no_p = null;

	/**
	 * [Dtl1_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter() {
		if (Dtl1_lot_no_p_PPanel_columnLotNo_lot_no_p == null) {
			Dtl1_lot_no_p_PPanel_columnLotNo_lot_no_p = createDtl1_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter(Dtl1_lot_no_p_PPanel.columnLotNo_lot_no, "lot_no", "sublot_no","ver_no");
		}
		return Dtl1_lot_no_p_PPanel_columnLotNo_lot_no_p;
	}
	
	
	/** [Dtl1_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の定義 */
	private MCListPutter Dtl1_lot_no_p_PPanel_columnLotNo_sublot_no_p = null;

	/**
	 * [Dtl1_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter() {
		if (Dtl1_lot_no_p_PPanel_columnLotNo_sublot_no_p == null) {
			Dtl1_lot_no_p_PPanel_columnLotNo_sublot_no_p = createDtl1_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter(Dtl1_lot_no_p_PPanel.columnLotNo_sublot_no, "sublot_no", "ver_no");
		}
		return Dtl1_lot_no_p_PPanel_columnLotNo_sublot_no_p;
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
	
	
	/** [Dtl1_purc_typ_ListPutter]の定義 */
	private MCListPutter Dtl1_purc_typ_p = null;

	/**
	 * [Dtl1_purc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_purc_typ_ListPutter() {
		if (Dtl1_purc_typ_p == null) {
			Dtl1_purc_typ_p = createDtl1_purc_typ_ListPutter(columnDtl1_purc_typ, "purc_typ", "purc_typ_nm");

		}
		return Dtl1_purc_typ_p;
	}
	
	
	/** [Dtl1_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_trd_unit_cd_p = null;

	/**
	 * [Dtl1_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_trd_unit_cd_ListPutter() {
		if (Dtl1_trd_unit_cd_p == null) {
			Dtl1_trd_unit_cd_p = createDtl1_trd_unit_cd_ListPutter(columnDtl1_trd_unit_cd, "trd_unit_cd", "trd_unit_nm","trd_unit_dec_place","trd_unit_rnd_typ","trd_unit_dmn_qty","trd_unit_conv_qty");

		}
		return Dtl1_trd_unit_cd_p;
	}
	
	
	/** [Dtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p = null;

	/**
	 * [Dtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter() {
		if (Dtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p == null) {
			Dtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p = createDtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd, "tax_cd", "tax_nm","tax_rate","inc_tax_flg","tax_typ");
		}
		return Dtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_p;
	}
	
	
	/** [Dtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p = null;

	/**
	 * [Dtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter() {
		if (Dtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p == null) {
			Dtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p = createDtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter(Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd, "dscnt_rsn_cd", "dscnt_rsn_nm");
		}
		return Dtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_p;
	}
	
	
	/** [Dtl1_quality_typ_ListPutter]の定義 */
	private MCListPutter Dtl1_quality_typ_p = null;

	/**
	 * [Dtl1_quality_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_quality_typ_ListPutter() {
		if (Dtl1_quality_typ_p == null) {
			Dtl1_quality_typ_p = createDtl1_quality_typ_ListPutter(columnDtl1_quality_typ, "quality_typ", "quality_typ_nm");

		}
		return Dtl1_quality_typ_p;
	}
	
	
	/** [Dtl1_stk_id_typ_ListPutter]の定義 */
	private MCListPutter Dtl1_stk_id_typ_p = null;

	/**
	 * [Dtl1_stk_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_stk_id_typ_ListPutter() {
		if (Dtl1_stk_id_typ_p == null) {
			Dtl1_stk_id_typ_p = createDtl1_stk_id_typ_ListPutter(columnDtl1_stk_id_typ, "stk_id_typ", "stk_id_typ_nm");

		}
		return Dtl1_stk_id_typ_p;
	}
	
	
	/** [Dtl1_purc_id_typ_ListPutter]の定義 */
	private MCListPutter Dtl1_purc_id_typ_p = null;

	/**
	 * [Dtl1_purc_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_purc_id_typ_ListPutter() {
		if (Dtl1_purc_id_typ_p == null) {
			Dtl1_purc_id_typ_p = createDtl1_purc_id_typ_ListPutter(columnDtl1_purc_id_typ, "purc_id_typ", "purc_id_typ_nm");

		}
		return Dtl1_purc_id_typ_p;
	}
	
	
	/** [Dtl1_gd_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_gd_cd_p = null;

	/**
	 * [Dtl1_gd_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_gd_cd_ListPutter() {
		if (Dtl1_gd_cd_p == null) {
			Dtl1_gd_cd_p = createDtl1_gd_cd_ListPutter(columnDtl1_gd_cd, "gd_cd", "gd_nm");

		}
		return Dtl1_gd_cd_p;
	}
	
	
	/** [Dtl1_stk_arrv_bp_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_stk_arrv_bp_cd_p = null;

	/**
	 * [Dtl1_stk_arrv_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_stk_arrv_bp_cd_ListPutter() {
		if (Dtl1_stk_arrv_bp_cd_p == null) {
			Dtl1_stk_arrv_bp_cd_p = createDtl1_stk_arrv_bp_cd_ListPutter(columnDtl1_stk_arrv_bp_cd, "stk_arrv_bp_cd", "stk_arrv_bp_nm");

		}
		return Dtl1_stk_arrv_bp_cd_p;
	}
	
	
	/** [Dtl1_purc_ret_rsn_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_purc_ret_rsn_cd_p = null;

	/**
	 * [Dtl1_purc_ret_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_purc_ret_rsn_cd_ListPutter() {
		if (Dtl1_purc_ret_rsn_cd_p == null) {
			Dtl1_purc_ret_rsn_cd_p = createDtl1_purc_ret_rsn_cd_ListPutter(columnDtl1_purc_ret_rsn_cd, "purc_ret_rsn_cd", "purc_ret_rsn_nm","xpns_purc_flg");

		}
		return Dtl1_purc_ret_rsn_cd_p;
	}
	
	
	/** [Dtl1_ap_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_ap_dpt_cd_p = null;

	/**
	 * [Dtl1_ap_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_ap_dpt_cd_ListPutter() {
		if (Dtl1_ap_dpt_cd_p == null) {
			Dtl1_ap_dpt_cd_p = createDtl1_ap_dpt_cd_ListPutter(columnDtl1_ap_dpt_cd, "ap_dpt_cd", "ap_dpt_nm");

		}
		return Dtl1_ap_dpt_cd_p;
	}
	
	
	/** [Dtl1_bd_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_bd_p_PPanel_columnBdItem_bd_dpt_cd_p = null;

	/**
	 * [Dtl1_bd_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_bd_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter() {
		if (Dtl1_bd_p_PPanel_columnBdItem_bd_dpt_cd_p == null) {
			Dtl1_bd_p_PPanel_columnBdItem_bd_dpt_cd_p = createDtl1_bd_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter(Dtl1_bd_p_PPanel.columnBdItem_bd_dpt_cd, "bd_dpt_cd", "bd_dpt_nm");
		}
		return Dtl1_bd_p_PPanel_columnBdItem_bd_dpt_cd_p;
	}
	
	
	/** [Dtl1_bd_p_PPanel_columnBdItem_bd_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl1_bd_p_PPanel_columnBdItem_bd_itm_cd_p = null;

	/**
	 * [Dtl1_bd_p_PPanel_columnBdItem_bd_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_bd_p_PPanel_columnBdItem_bd_itm_cd_ListPutter() {
		if (Dtl1_bd_p_PPanel_columnBdItem_bd_itm_cd_p == null) {
			Dtl1_bd_p_PPanel_columnBdItem_bd_itm_cd_p = createDtl1_bd_p_PPanel_columnBdItem_bd_itm_cd_ListPutter(Dtl1_bd_p_PPanel.columnBdItem_bd_itm_cd, "bd_itm_cd", "bd_itm_sub1","bd_itm_sub2","bd_itm_sub3","bd_itm_nm","bd_lot_mng_typ","bd_lot_no_typ","bd_sublot_mng_typ","bd_sublot_no_typ","bd_sno1_mng_typ","bd_sno2_mng_typ","bd_sno3_mng_typ","bd_sno4_mng_typ");
		}
		return Dtl1_bd_p_PPanel_columnBdItem_bd_itm_cd_p;
	}
	
	
	/** [Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter]の定義 */
	private MCListPutter Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub1_p = null;

	/**
	 * [Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_bd_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter() {
		if (Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub1_p == null) {
			Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub1_p = createDtl1_bd_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter(Dtl1_bd_p_PPanel.columnBdItem_bd_itm_sub1, "bd_itm_sub1", "bd_itm_sub2","bd_itm_sub3","bd_itm_nm","bd_lot_mng_typ","bd_lot_no_typ","bd_sublot_mng_typ","bd_sublot_no_typ","bd_sno1_mng_typ","bd_sno2_mng_typ","bd_sno3_mng_typ","bd_sno4_mng_typ");
		}
		return Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub1_p;
	}
	
	
	/** [Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter]の定義 */
	private MCListPutter Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub2_p = null;

	/**
	 * [Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_bd_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter() {
		if (Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub2_p == null) {
			Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub2_p = createDtl1_bd_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter(Dtl1_bd_p_PPanel.columnBdItem_bd_itm_sub2, "bd_itm_sub2", "bd_itm_sub3","bd_itm_nm","bd_lot_mng_typ","bd_lot_no_typ","bd_sublot_mng_typ","bd_sublot_no_typ","bd_sno1_mng_typ","bd_sno2_mng_typ","bd_sno3_mng_typ","bd_sno4_mng_typ");
		}
		return Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub2_p;
	}
	
	
	/** [Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter]の定義 */
	private MCListPutter Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub3_p = null;

	/**
	 * [Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getDtl1_bd_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter() {
		if (Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub3_p == null) {
			Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub3_p = createDtl1_bd_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter(Dtl1_bd_p_PPanel.columnBdItem_bd_itm_sub3, "bd_itm_sub3", "bd_itm_nm","bd_lot_mng_typ","bd_lot_no_typ","bd_sublot_mng_typ","bd_sublot_no_typ","bd_sno1_mng_typ","bd_sno2_mng_typ","bd_sno3_mng_typ","bd_sno4_mng_typ");
		}
		return Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub3_p;
	}
	
	
	/** [Dtl2_purc_ret_loc_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_purc_ret_loc_cd_p = null;

	/**
	 * [Dtl2_purc_ret_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_purc_ret_loc_cd_ListPutter() {
		if (Dtl2_purc_ret_loc_cd_p == null) {
			Dtl2_purc_ret_loc_cd_p = createDtl2_purc_ret_loc_cd_ListPutter(columnDtl2_purc_ret_loc_cd, "purc_ret_loc_cd", "purc_ret_loc_wg_cd","purc_ret_loc_wg_nm","purc_ret_loc_nm","str_ln_tgt_flg","purc_ret_sppl_cd");

		}
		return Dtl2_purc_ret_loc_cd_p;
	}
	
	
	/** [Dtl2_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = null;

	/**
	 * [Dtl2_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter() {
		if (Dtl2_str_ln_p_PPanel_columnStrLn_str_ln_cd_p == null) {
			Dtl2_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = createDtl2_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(Dtl2_str_ln_p_PPanel.columnStrLn_str_ln_cd, "str_ln_cd", "str_ln_nm");
		}
		return Dtl2_str_ln_p_PPanel_columnStrLn_str_ln_cd_p;
	}
	
	
	/** [Dtl2_asset_mng_typ_ListPutter]の定義 */
	private MCListPutter Dtl2_asset_mng_typ_p = null;

	/**
	 * [Dtl2_asset_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_asset_mng_typ_ListPutter() {
		if (Dtl2_asset_mng_typ_p == null) {
			Dtl2_asset_mng_typ_p = createDtl2_asset_mng_typ_ListPutter(columnDtl2_asset_mng_typ, "asset_mng_typ", "asset_mng_typ_nm");

		}
		return Dtl2_asset_mng_typ_p;
	}
	
	
	/** [Dtl2_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Dtl2_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Dtl2_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Dtl2_itm_p_PPanel_columnItm_itm_cd_p = createDtl2_itm_p_PPanel_columnItm_itm_cd_ListPutter(Dtl2_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "sundry_itm_flg","itm_nm","itm_sub1","itm_sub2","itm_sub3","lot_mng_typ","lot_no_typ","sublot_mng_typ","sublot_no_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","stk_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_unit_nm","cont_fctr_rnd_typ","cont_fctr_dec_place","asset_mng_typ");
		}
		return Dtl2_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [Dtl2_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Dtl2_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [Dtl2_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (Dtl2_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			Dtl2_itm_p_PPanel_columnItm_itm_sub1_p = createDtl2_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Dtl2_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "sundry_itm_flg","itm_nm","itm_sub2","itm_sub3","lot_mng_typ","lot_no_typ","sublot_mng_typ","sublot_no_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","stk_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_unit_nm","cont_fctr_rnd_typ","cont_fctr_dec_place","asset_mng_typ");
		}
		return Dtl2_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [Dtl2_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Dtl2_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [Dtl2_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (Dtl2_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			Dtl2_itm_p_PPanel_columnItm_itm_sub2_p = createDtl2_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Dtl2_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "sundry_itm_flg","itm_nm","itm_sub3","lot_mng_typ","lot_no_typ","sublot_mng_typ","sublot_no_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","stk_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_unit_nm","cont_fctr_rnd_typ","cont_fctr_dec_place","asset_mng_typ");
		}
		return Dtl2_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [Dtl2_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Dtl2_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [Dtl2_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (Dtl2_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			Dtl2_itm_p_PPanel_columnItm_itm_sub3_p = createDtl2_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Dtl2_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "sundry_itm_flg","itm_nm","lot_mng_typ","lot_no_typ","sublot_mng_typ","sublot_no_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","stk_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","cont_fctr_flg","std_cont_fctr","cont_fctr_unit_cd","cont_fctr_unit_nm","cont_fctr_rnd_typ","cont_fctr_dec_place","asset_mng_typ");
		}
		return Dtl2_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Dtl2_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の定義 */
	private MCListPutter Dtl2_lot_no_p_PPanel_columnLotNo_lot_no_p = null;

	/**
	 * [Dtl2_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter() {
		if (Dtl2_lot_no_p_PPanel_columnLotNo_lot_no_p == null) {
			Dtl2_lot_no_p_PPanel_columnLotNo_lot_no_p = createDtl2_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter(Dtl2_lot_no_p_PPanel.columnLotNo_lot_no, "lot_no", "sublot_no","ver_no");
		}
		return Dtl2_lot_no_p_PPanel_columnLotNo_lot_no_p;
	}
	
	
	/** [Dtl2_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の定義 */
	private MCListPutter Dtl2_lot_no_p_PPanel_columnLotNo_sublot_no_p = null;

	/**
	 * [Dtl2_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter() {
		if (Dtl2_lot_no_p_PPanel_columnLotNo_sublot_no_p == null) {
			Dtl2_lot_no_p_PPanel_columnLotNo_sublot_no_p = createDtl2_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter(Dtl2_lot_no_p_PPanel.columnLotNo_sublot_no, "sublot_no", "ver_no");
		}
		return Dtl2_lot_no_p_PPanel_columnLotNo_sublot_no_p;
	}
	
	
	/** [Dtl2_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_trd_unit_cd_p = null;

	/**
	 * [Dtl2_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_trd_unit_cd_ListPutter() {
		if (Dtl2_trd_unit_cd_p == null) {
			Dtl2_trd_unit_cd_p = createDtl2_trd_unit_cd_ListPutter(columnDtl2_trd_unit_cd, "trd_unit_cd", "trd_unit_nm","trd_unit_dec_place","trd_unit_rnd_typ","trd_unit_dmn_qty","trd_unit_conv_qty");

		}
		return Dtl2_trd_unit_cd_p;
	}
	
	
	/** [Dtl2_quality_typ_ListPutter]の定義 */
	private MCListPutter Dtl2_quality_typ_p = null;

	/**
	 * [Dtl2_quality_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_quality_typ_ListPutter() {
		if (Dtl2_quality_typ_p == null) {
			Dtl2_quality_typ_p = createDtl2_quality_typ_ListPutter(columnDtl2_quality_typ, "quality_typ", "quality_typ_nm");

		}
		return Dtl2_quality_typ_p;
	}
	
	
	/** [Dtl2_stk_id_typ_ListPutter]の定義 */
	private MCListPutter Dtl2_stk_id_typ_p = null;

	/**
	 * [Dtl2_stk_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_stk_id_typ_ListPutter() {
		if (Dtl2_stk_id_typ_p == null) {
			Dtl2_stk_id_typ_p = createDtl2_stk_id_typ_ListPutter(columnDtl2_stk_id_typ, "stk_id_typ", "stk_id_typ_nm");

		}
		return Dtl2_stk_id_typ_p;
	}
	
	
	/** [Dtl2_gd_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_gd_cd_p = null;

	/**
	 * [Dtl2_gd_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_gd_cd_ListPutter() {
		if (Dtl2_gd_cd_p == null) {
			Dtl2_gd_cd_p = createDtl2_gd_cd_ListPutter(columnDtl2_gd_cd, "gd_cd", "gd_nm");

		}
		return Dtl2_gd_cd_p;
	}
	
	
	/** [Dtl2_stk_arrv_bp_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_stk_arrv_bp_cd_p = null;

	/**
	 * [Dtl2_stk_arrv_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_stk_arrv_bp_cd_ListPutter() {
		if (Dtl2_stk_arrv_bp_cd_p == null) {
			Dtl2_stk_arrv_bp_cd_p = createDtl2_stk_arrv_bp_cd_ListPutter(columnDtl2_stk_arrv_bp_cd, "stk_arrv_bp_cd", "stk_arrv_bp_nm");

		}
		return Dtl2_stk_arrv_bp_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBDP_PurcRetSchdReg create(){
		MSBDP_PurcRetSchdReg p = new MSBDP_PurcRetSchdReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBDP_PurcRetSchdReg create(String name){
		MSBDP_PurcRetSchdReg p = new MSBDP_PurcRetSchdReg(name);
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
		MSBDP_PurcRetSchdReg_MC.jbfInitScreenOpe((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbfInitCnd((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbfInitTop((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbfInitFold((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbfInitHdr1((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbfInitHdr2((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbfInitDtl1Panel((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbfInitDtl1((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbfInitDtl1Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbfInitDtl2Panel((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbfInitDtl2((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbfInitDtl2Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbfInitBtn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbfInitEastBtn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbInitScreenOpe((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbInitCnd((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbInitTop((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbInitFold((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbInitHdr1((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbInitHdr2((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbInitDtl1Panel((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbInitDtl1((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbInitDtl1Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbInitDtl2Panel((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbInitDtl2((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbInitDtl2Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbInitBtn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.jbInitEastBtn((MSBDP_PurcRetSchdReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBDP_PurcRetSchdReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBDP_PurcRetSchdReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_srch_tgt_typ = p.beansFactory.createTextField("Cnd.srch_tgt_typ");
		p.Cnd_srch_tgt_typ_nm_Label = p.beansFactory.createLabel("Cnd.srch_tgt_typ_nm_Label");
		p.Cnd_srch_tgt_typ_nm = p.beansFactory.createTextComboBox("Cnd.srch_tgt_typ_nm");
		p.Cnd_srch_tgt_typ_nm.setLabel(p.Cnd_srch_tgt_typ_nm_Label);
		p.Cnd_srch_tgt_no = p.beansFactory.createTextField("Cnd.srch_tgt_no");
		p.Cnd_srch_arr_act = p.beansFactory.createButton("Cnd.srch_arr_act", "srch");
		p.Cnd_srch_purc_act = p.beansFactory.createButton("Cnd.srch_purc_act", "srch");
		p.Cnd_srch_purc_ret_schd = p.beansFactory.createButton("Cnd.srch_purc_ret_schd", "srch");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBDP_PurcRetSchdReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBDP_PurcRetSchdReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldTab = p.beansFactory.createTabbedPane("Fold.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr1(MSBDP_PurcRetSchdReg p) {
		// ブロック関連の初期化
		p.Hdr1Panel = p.beansFactory.createPanel("Hdr1");
		// ブロックの項目の初期化
		p.Hdr1_trd_cd_Label = p.beansFactory.createLabel("Hdr1.trd_cd_Label");
		p.Hdr1_trd_cd = p.beansFactory.createTextComboBox("Hdr1.trd_cd");
		p.Hdr1_trd_cd.setLabel(p.Hdr1_trd_cd_Label);
		p.Hdr1_trd_nm = p.beansFactory.createTextField("Hdr1.trd_nm");
		p.Hdr1_trd_ptn_typ = p.beansFactory.createTextField("Hdr1.trd_ptn_typ");
		p.Hdr1_purc_ret_schd_no_Label = p.beansFactory.createLabel("Hdr1.purc_ret_schd_no_Label");
		p.Hdr1_purc_ret_schd_no = p.beansFactory.createTextField("Hdr1.purc_ret_schd_no");
		p.Hdr1_purc_ret_schd_no.setLabel(p.Hdr1_purc_ret_schd_no_Label);
		p.Hdr1_reg_dt_Label = p.beansFactory.createLabel("Hdr1.reg_dt_Label");
		p.Hdr1_reg_dt = p.beansFactory.createDateField("Hdr1.reg_dt");
		p.Hdr1_reg_dt.setLabel(p.Hdr1_reg_dt_Label);
		p.Hdr1_schd_dt_Label = p.beansFactory.createLabel("Hdr1.schd_dt_Label");
		p.Hdr1_schd_dt = p.beansFactory.createDateField("Hdr1.schd_dt");
		p.Hdr1_schd_dt.setLabel(p.Hdr1_schd_dt_Label);
		p.Hdr1_sppl_cd_Label = p.beansFactory.createLabel("Hdr1.sppl_cd_Label");
		p.Hdr1_sppl_cd = p.beansFactory.createTextField("Hdr1.sppl_cd");
		p.Hdr1_sppl_cd.setLabel(p.Hdr1_sppl_cd_Label);
		p.Hdr1_sppl_nm = p.beansFactory.createTextField("Hdr1.sppl_nm");
		p.Hdr1_purc_upri_cng_flg = p.beansFactory.createCheckBox("Hdr1.purc_upri_cng_flg");
		p.Hdr1_subcon_flg = p.beansFactory.createCheckBox("Hdr1.subcon_flg");
		p.Hdr1_repurc_obli_flg = p.beansFactory.createCheckBox("Hdr1.repurc_obli_flg");
		p.Hdr1_outsrc_upri_typ_Label = p.beansFactory.createLabel("Hdr1.outsrc_upri_typ_Label");
		p.Hdr1_outsrc_upri_typ = p.beansFactory.createTextField("Hdr1.outsrc_upri_typ");
		p.Hdr1_outsrc_upri_typ.setLabel(p.Hdr1_outsrc_upri_typ_Label);
		p.Hdr1_ap_dpt_cd = p.beansFactory.createTextField("Hdr1.ap_dpt_cd");
		p.Hdr1_mst_ap_dpt_cd = p.beansFactory.createTextField("Hdr1.mst_ap_dpt_cd");
		p.Hdr1_pay_spot_flg = p.beansFactory.createCheckBox("Hdr1.pay_spot_flg");
		p.Hdr1_sppl_pay_crryovr_times = p.beansFactory.createNumberField("Hdr1.sppl_pay_crryovr_times");
		p.Hdr1_sppl_iv_flg = p.beansFactory.createCheckBox("Hdr1.sppl_iv_flg");
		p.Hdr1_prnt_lcl_cd = p.beansFactory.createTextField("Hdr1.prnt_lcl_cd");
		p.Hdr1_asppl_cd_Label = p.beansFactory.createLabel("Hdr1.asppl_cd_Label");
		p.Hdr1_asppl_cd = p.beansFactory.createTextField("Hdr1.asppl_cd");
		p.Hdr1_asppl_cd.setLabel(p.Hdr1_asppl_cd_Label);
		p.Hdr1_asppl_nm = p.beansFactory.createTextField("Hdr1.asppl_nm");
		p.Hdr1_trd_cur_cd_Label = p.beansFactory.createLabel("Hdr1.trd_cur_cd_Label");
		p.Hdr1_trd_cur_cd = p.beansFactory.createTextComboBox("Hdr1.trd_cur_cd");
		p.Hdr1_trd_cur_cd.setLabel(p.Hdr1_trd_cur_cd_Label);
		p.Hdr1_trd_cur_nm = p.beansFactory.createTextField("Hdr1.trd_cur_nm");
		p.Hdr1_trd_cur_upri_dec_place = p.beansFactory.createNumberField("Hdr1.trd_cur_upri_dec_place");
		p.Hdr1_trd_cur_amt_dec_place = p.beansFactory.createNumberField("Hdr1.trd_cur_amt_dec_place");
		p.Hdr1_ptax_cur_cd_Label = p.beansFactory.createLabel("Hdr1.ptax_cur_cd_Label");
		p.Hdr1_ptax_cur_cd = p.beansFactory.createTextComboBox("Hdr1.ptax_cur_cd");
		p.Hdr1_ptax_cur_cd.setLabel(p.Hdr1_ptax_cur_cd_Label);
		p.Hdr1_ptax_cur_nm = p.beansFactory.createTextField("Hdr1.ptax_cur_nm");
		p.Hdr1_ptax_cur_upri_dec_place = p.beansFactory.createNumberField("Hdr1.ptax_cur_upri_dec_place");
		p.Hdr1_ptax_cur_amt_dec_place = p.beansFactory.createNumberField("Hdr1.ptax_cur_amt_dec_place");
		p.Hdr1_ptax_xrate_inpt_flg = p.beansFactory.createCheckBox("Hdr1.ptax_xrate_inpt_flg");
		p.Hdr1_base_cur_cd_Label = p.beansFactory.createLabel("Hdr1.base_cur_cd_Label");
		p.Hdr1_base_cur_cd = p.beansFactory.createTextComboBox("Hdr1.base_cur_cd");
		p.Hdr1_base_cur_cd.setLabel(p.Hdr1_base_cur_cd_Label);
		p.Hdr1_base_cur_nm = p.beansFactory.createTextField("Hdr1.base_cur_nm");
		p.Hdr1_base_cur_upri_dec_place = p.beansFactory.createNumberField("Hdr1.base_cur_upri_dec_place");
		p.Hdr1_base_cur_amt_dec_place = p.beansFactory.createNumberField("Hdr1.base_cur_amt_dec_place");
		p.Hdr1_xrate_inpt_flg = p.beansFactory.createCheckBox("Hdr1.xrate_inpt_flg");
		p.Hdr1_xrate_cd = p.beansFactory.createTextField("Hdr1.xrate_cd");
		p.Hdr1_purc_amt_rnd_typ = p.beansFactory.createTextField("Hdr1.purc_amt_rnd_typ");
		p.Hdr1_purc_tax_rnd_typ = p.beansFactory.createTextField("Hdr1.purc_tax_rnd_typ");
		p.Hdr1_purc_tax_calc_typ = p.beansFactory.createTextField("Hdr1.purc_tax_calc_typ");
		p.Hdr1_purc_tax_cd = p.beansFactory.createTextField("Hdr1.purc_tax_cd");
		p.Hdr1_purc_tax_cd_prio_flg = p.beansFactory.createCheckBox("Hdr1.purc_tax_cd_prio_flg");
		p.Hdr1_ret_sppl_nm_Label = p.beansFactory.createLabel("Hdr1.ret_sppl_nm_Label");
		p.Hdr1_ret_sppl_nm = p.beansFactory.createTextField("Hdr1.ret_sppl_nm");
		p.Hdr1_ret_sppl_nm.setLabel(p.Hdr1_ret_sppl_nm_Label);
		p.Hdr1_ret_sppl_enable_flg = p.beansFactory.createCheckBox("Hdr1.ret_sppl_enable_flg");
		p.Hdr1_ret_sppl_cntct_psn_title_Label = p.beansFactory.createLabel("Hdr1.ret_sppl_cntct_psn_title_Label");
		p.Hdr1_ret_sppl_cntct_psn_title = p.beansFactory.createTextField("Hdr1.ret_sppl_cntct_psn_title");
		p.Hdr1_ret_sppl_cntct_psn_title.setLabel(p.Hdr1_ret_sppl_cntct_psn_title_Label);
		p.Hdr1_rcpt_iv_no_Label = p.beansFactory.createLabel("Hdr1.rcpt_iv_no_Label");
		p.Hdr1_rcpt_iv_no = p.beansFactory.createTextField("Hdr1.rcpt_iv_no");
		p.Hdr1_rcpt_iv_no.setLabel(p.Hdr1_rcpt_iv_no_Label);
		p.Hdr1_ref_rcpt_iv_no_Label = p.beansFactory.createLabel("Hdr1.ref_rcpt_iv_no_Label");
		p.Hdr1_ref_rcpt_iv_no = p.beansFactory.createTextField("Hdr1.ref_rcpt_iv_no");
		p.Hdr1_ref_rcpt_iv_no.setLabel(p.Hdr1_ref_rcpt_iv_no_Label);
		p.Hdr1_def_purc_usr_cd = p.beansFactory.createTextField("Hdr1.def_purc_usr_cd");
		p.Hdr1_def_purc_dpt_cd = p.beansFactory.createTextField("Hdr1.def_purc_dpt_cd");
		p.Hdr1_ap_dpt_flg = p.beansFactory.createCheckBox("Hdr1.ap_dpt_flg");
		p.Hdr1_purc_dpt_wg_cd_Label = p.beansFactory.createLabel("Hdr1.purc_dpt_wg_cd_Label");
		p.Hdr1_purc_dpt_wg_cd = p.beansFactory.createTextField("Hdr1.purc_dpt_wg_cd");
		p.Hdr1_purc_dpt_wg_cd.setLabel(p.Hdr1_purc_dpt_wg_cd_Label);
		p.Hdr1_purc_dpt_wg_nm = p.beansFactory.createTextField("Hdr1.purc_dpt_wg_nm");
		p.Hdr1_purc_ret_print_rmrks_Label = p.beansFactory.createLabel("Hdr1.purc_ret_print_rmrks_Label");
		p.Hdr1_purc_ret_print_rmrks = p.beansFactory.createTextField("Hdr1.purc_ret_print_rmrks");
		p.Hdr1_purc_ret_print_rmrks.setLabel(p.Hdr1_purc_ret_print_rmrks_Label);
		p.Hdr1_trd_rmrks_Label = p.beansFactory.createLabel("Hdr1.trd_rmrks_Label");
		p.Hdr1_trd_rmrks = p.beansFactory.createTextField("Hdr1.trd_rmrks");
		p.Hdr1_trd_rmrks.setLabel(p.Hdr1_trd_rmrks_Label);
		p.Hdr1_intr_rmrks_Label = p.beansFactory.createLabel("Hdr1.intr_rmrks_Label");
		p.Hdr1_intr_rmrks = p.beansFactory.createTextField("Hdr1.intr_rmrks");
		p.Hdr1_intr_rmrks.setLabel(p.Hdr1_intr_rmrks_Label);
		p.Hdr1_sub_char1_Label = p.beansFactory.createLabel("Hdr1.sub_char1_Label");
		p.Hdr1_sub_char1 = p.beansFactory.createTextField("Hdr1.sub_char1");
		p.Hdr1_sub_char1.setLabel(p.Hdr1_sub_char1_Label);
		p.Hdr1_sub_char2_Label = p.beansFactory.createLabel("Hdr1.sub_char2_Label");
		p.Hdr1_sub_char2 = p.beansFactory.createTextField("Hdr1.sub_char2");
		p.Hdr1_sub_char2.setLabel(p.Hdr1_sub_char2_Label);
		p.Hdr1_sub_char3_Label = p.beansFactory.createLabel("Hdr1.sub_char3_Label");
		p.Hdr1_sub_char3 = p.beansFactory.createTextField("Hdr1.sub_char3");
		p.Hdr1_sub_char3.setLabel(p.Hdr1_sub_char3_Label);
		p.Hdr1_tterm_cd1_Label = p.beansFactory.createLabel("Hdr1.tterm_cd1_Label");
		p.Hdr1_tterm_cd1 = p.beansFactory.createTextComboBox("Hdr1.tterm_cd1");
		p.Hdr1_tterm_cd1.setLabel(p.Hdr1_tterm_cd1_Label);
		p.Hdr1_tterm_nm1 = p.beansFactory.createTextField("Hdr1.tterm_nm1");
		p.Hdr1_tterm_rmrks1_Label = p.beansFactory.createLabel("Hdr1.tterm_rmrks1_Label");
		p.Hdr1_tterm_rmrks1 = p.beansFactory.createTextField("Hdr1.tterm_rmrks1");
		p.Hdr1_tterm_rmrks1.setLabel(p.Hdr1_tterm_rmrks1_Label);
		p.Hdr1_tterm_cd2_Label = p.beansFactory.createLabel("Hdr1.tterm_cd2_Label");
		p.Hdr1_tterm_cd2 = p.beansFactory.createTextComboBox("Hdr1.tterm_cd2");
		p.Hdr1_tterm_cd2.setLabel(p.Hdr1_tterm_cd2_Label);
		p.Hdr1_tterm_nm2 = p.beansFactory.createTextField("Hdr1.tterm_nm2");
		p.Hdr1_tterm_rmrks2_Label = p.beansFactory.createLabel("Hdr1.tterm_rmrks2_Label");
		p.Hdr1_tterm_rmrks2 = p.beansFactory.createTextField("Hdr1.tterm_rmrks2");
		p.Hdr1_tterm_rmrks2.setLabel(p.Hdr1_tterm_rmrks2_Label);
		p.Hdr1_tterm_cd3_Label = p.beansFactory.createLabel("Hdr1.tterm_cd3_Label");
		p.Hdr1_tterm_cd3 = p.beansFactory.createTextComboBox("Hdr1.tterm_cd3");
		p.Hdr1_tterm_cd3.setLabel(p.Hdr1_tterm_cd3_Label);
		p.Hdr1_tterm_nm3 = p.beansFactory.createTextField("Hdr1.tterm_nm3");
		p.Hdr1_tterm_rmrks3_Label = p.beansFactory.createLabel("Hdr1.tterm_rmrks3_Label");
		p.Hdr1_tterm_rmrks3 = p.beansFactory.createTextField("Hdr1.tterm_rmrks3");
		p.Hdr1_tterm_rmrks3.setLabel(p.Hdr1_tterm_rmrks3_Label);
		p.Hdr1_pr_schd_upd_cntr = p.beansFactory.createNumberField("Hdr1.pr_schd_upd_cntr");
		p.Hdr1_ins_usr_id_Label = p.beansFactory.createLabel("Hdr1.ins_usr_id_Label");
		p.Hdr1_ins_usr_id = p.beansFactory.createTextField("Hdr1.ins_usr_id");
		p.Hdr1_ins_usr_id.setLabel(p.Hdr1_ins_usr_id_Label);
		p.Hdr1_ins_usr_nm = p.beansFactory.createTextField("Hdr1.ins_usr_nm");
		p.Hdr1_ins_func_id_Label = p.beansFactory.createLabel("Hdr1.ins_func_id_Label");
		p.Hdr1_ins_func_id = p.beansFactory.createTextField("Hdr1.ins_func_id");
		p.Hdr1_ins_func_id.setLabel(p.Hdr1_ins_func_id_Label);
		p.Hdr1_ins_func_nm = p.beansFactory.createTextField("Hdr1.ins_func_nm");
		p.Hdr1_upd_usr_id_Label = p.beansFactory.createLabel("Hdr1.upd_usr_id_Label");
		p.Hdr1_upd_usr_id = p.beansFactory.createTextField("Hdr1.upd_usr_id");
		p.Hdr1_upd_usr_id.setLabel(p.Hdr1_upd_usr_id_Label);
		p.Hdr1_upd_usr_nm = p.beansFactory.createTextField("Hdr1.upd_usr_nm");
		p.Hdr1_upd_func_id_Label = p.beansFactory.createLabel("Hdr1.upd_func_id_Label");
		p.Hdr1_upd_func_id = p.beansFactory.createTextField("Hdr1.upd_func_id");
		p.Hdr1_upd_func_id.setLabel(p.Hdr1_upd_func_id_Label);
		p.Hdr1_upd_func_nm = p.beansFactory.createTextField("Hdr1.upd_func_nm");
		p.Hdr1_ins_ts_Label = p.beansFactory.createLabel("Hdr1.ins_ts_Label");
		p.Hdr1_ins_ts = p.beansFactory.createTimestampField("Hdr1.ins_ts");
		p.Hdr1_ins_ts.setLabel(p.Hdr1_ins_ts_Label);
		p.Hdr1_upd_ts_Label = p.beansFactory.createLabel("Hdr1.upd_ts_Label");
		p.Hdr1_upd_ts = p.beansFactory.createTimestampField("Hdr1.upd_ts");
		p.Hdr1_upd_ts.setLabel(p.Hdr1_upd_ts_Label);
		p.Hdr1_upd_srv_req_no_Label = p.beansFactory.createLabel("Hdr1.upd_srv_req_no_Label");
		p.Hdr1_upd_srv_req_no = p.beansFactory.createTextField("Hdr1.upd_srv_req_no");
		p.Hdr1_upd_srv_req_no.setLabel(p.Hdr1_upd_srv_req_no_Label);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr2(MSBDP_PurcRetSchdReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel = p.beansFactory.createPanel("Hdr2");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl1Panel]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl1Panel(MSBDP_PurcRetSchdReg p) {
		// ブロック関連の初期化
		p.Dtl1PanelPanel = p.beansFactory.createPanel("Dtl1Panel");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl1(MSBDP_PurcRetSchdReg p) {
		// ブロック関連の初期化
		p.Dtl1Panel = p.beansFactory.createPanel("Dtl1");
		p.Dtl1ScrollPane = p.beansFactory.createScrollPane("Dtl1.scroll");
		p.createDtl1Table();
		// ブロックの項目の初期化
		p.columnDtl1_peg_no = p.beansFactory.createTableColumn("Dtl1.peg_no", MCColumnType.NUMBER);
		p.columnDtl1_cmpl_flg = p.beansFactory.createTableColumn("Dtl1.cmpl_flg", MCColumnType.CHECK);
		p.columnDtl1_abort_flg = p.beansFactory.createTableColumn("Dtl1.abort_flg", MCColumnType.CHECK);
		p.columnDtl1_purc_ret_loc_wg_cd = p.beansFactory.createTableColumn("Dtl1.purc_ret_loc_wg_cd", MCColumnType.TEXT);
		p.columnDtl1_purc_ret_loc_wg_nm = p.beansFactory.createTableColumn("Dtl1.purc_ret_loc_wg_nm", MCColumnType.TEXT);
		p.columnDtl1_purc_ret_loc_cd = p.beansFactory.createTableColumn("Dtl1.purc_ret_loc_cd", MCColumnType.TEXT);
		p.columnDtl1_purc_ret_loc_nm = p.beansFactory.createTableColumn("Dtl1.purc_ret_loc_nm", MCColumnType.TEXT);
		p.columnDtl1_purc_ret_sppl_cd = p.beansFactory.createTableColumn("Dtl1.purc_ret_sppl_cd", MCColumnType.TEXT);
		p.columnDtl1_str_ln_tgt_flg = p.beansFactory.createTableColumn("Dtl1.str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnDtl1_asset_mng_typ = p.beansFactory.createTableColumn("Dtl1.asset_mng_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl1_asset_mng_typ_nm = p.beansFactory.createTableColumn("Dtl1.asset_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl1_iv_itm_nm = p.beansFactory.createTableColumn("Dtl1.iv_itm_nm", MCColumnType.TEXT);
		p.columnDtl1_sundry_itm_flg = p.beansFactory.createTableColumn("Dtl1.sundry_itm_flg", MCColumnType.CHECK);
		p.columnDtl1_itm_purc_upri_cng_flg = p.beansFactory.createTableColumn("Dtl1.itm_purc_upri_cng_flg", MCColumnType.CHECK);
		p.columnDtl1_dscnt_itm_flg = p.beansFactory.createTableColumn("Dtl1.dscnt_itm_flg", MCColumnType.CHECK);
		p.columnDtl1_arr_skip_flg = p.beansFactory.createTableColumn("Dtl1.arr_skip_flg", MCColumnType.CHECK);
		p.columnDtl1_itm_pay_crryovr_times = p.beansFactory.createTableColumn("Dtl1.itm_pay_crryovr_times", MCColumnType.NUMBER);
		p.columnDtl1_stk_mng_typ = p.beansFactory.createTableColumn("Dtl1.stk_mng_typ", MCColumnType.TEXT);
		p.columnDtl1_lot_mng_typ = p.beansFactory.createTableColumn("Dtl1.lot_mng_typ", MCColumnType.TEXT);
		p.columnDtl1_lot_no_typ = p.beansFactory.createTableColumn("Dtl1.lot_no_typ", MCColumnType.TEXT);
		p.columnDtl1_sublot_mng_typ = p.beansFactory.createTableColumn("Dtl1.sublot_mng_typ", MCColumnType.TEXT);
		p.columnDtl1_sublot_no_typ = p.beansFactory.createTableColumn("Dtl1.sublot_no_typ", MCColumnType.TEXT);
		p.columnDtl1_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl1.sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl1_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl1.sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl1_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl1.sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl1_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl1.sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl1_bp_lot_no = p.beansFactory.createTableColumn("Dtl1.bp_lot_no", MCColumnType.TEXT);
		p.columnDtl1_ver_flg = p.beansFactory.createTableColumn("Dtl1.ver_flg", MCColumnType.CHECK);
		p.columnDtl1_maker_cd = p.beansFactory.createTableColumn("Dtl1.maker_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl1_maker_nm = p.beansFactory.createTableColumn("Dtl1.maker_nm", MCColumnType.TEXT);
		p.columnDtl1_sppl_itm_cd = p.beansFactory.createTableColumn("Dtl1.sppl_itm_cd", MCColumnType.TEXT);
		p.columnDtl1_sppl_itm_nm = p.beansFactory.createTableColumn("Dtl1.sppl_itm_nm", MCColumnType.TEXT);
		p.columnDtl1_purc_typ = p.beansFactory.createTableColumn("Dtl1.purc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl1_purc_typ_nm = p.beansFactory.createTableColumn("Dtl1.purc_typ_nm", MCColumnType.TEXT);
		p.columnDtl1_trd_unit_cd = p.beansFactory.createTableColumn("Dtl1.trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl1_trd_unit_nm = p.beansFactory.createTableColumn("Dtl1.trd_unit_nm", MCColumnType.TEXT);
		p.columnDtl1_trd_unit_dec_place = p.beansFactory.createTableColumn("Dtl1.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl1_trd_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl1.trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl1_trd_unit_dmn_qty = p.beansFactory.createTableColumn("Dtl1.trd_unit_dmn_qty", MCColumnType.NUMBER);
		p.columnDtl1_trd_unit_conv_qty = p.beansFactory.createTableColumn("Dtl1.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtl1_base_unit_cd = p.beansFactory.createTableColumn("Dtl1.base_unit_cd", MCColumnType.TEXT);
		p.columnDtl1_base_unit_nm = p.beansFactory.createTableColumn("Dtl1.base_unit_nm", MCColumnType.TEXT);
		p.columnDtl1_base_unit_dec_place = p.beansFactory.createTableColumn("Dtl1.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl1_base_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl1.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl1_repurc_obli_flg = p.beansFactory.createTableColumn("Dtl1.repurc_obli_flg", MCColumnType.CHECK);
		p.columnDtl1_loc_mng_typ = p.beansFactory.createTableColumn("Dtl1.loc_mng_typ", MCColumnType.TEXT);
		p.columnDtl1_wtax_rate = p.beansFactory.createTableColumn("Dtl1.wtax_rate", MCColumnType.NUMBER);
		p.columnDtl1_mfg_inst_no = p.beansFactory.createTableColumn("Dtl1.mfg_inst_no", MCColumnType.TEXT);
		p.columnDtl1_po_no = p.beansFactory.createTableColumn("Dtl1.po_no", MCColumnType.TEXT);
		p.columnDtl1_quality_typ = p.beansFactory.createTableColumn("Dtl1.quality_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl1_quality_typ_nm = p.beansFactory.createTableColumn("Dtl1.quality_typ_nm", MCColumnType.TEXT);
		p.columnDtl1_insp_flg = p.beansFactory.createTableColumn("Dtl1.insp_flg", MCColumnType.CHECK);
		p.columnDtl1_stk_id_typ = p.beansFactory.createTableColumn("Dtl1.stk_id_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl1_stk_id_typ_nm = p.beansFactory.createTableColumn("Dtl1.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnDtl1_purc_id_typ = p.beansFactory.createTableColumn("Dtl1.purc_id_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl1_purc_id_typ_nm = p.beansFactory.createTableColumn("Dtl1.purc_id_typ_nm", MCColumnType.TEXT);
		p.columnDtl1_gd_cd = p.beansFactory.createTableColumn("Dtl1.gd_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl1_gd_nm = p.beansFactory.createTableColumn("Dtl1.gd_nm", MCColumnType.TEXT);
		p.columnDtl1_stk_arrv_bp_cd = p.beansFactory.createTableColumn("Dtl1.stk_arrv_bp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl1_stk_arrv_bp_nm = p.beansFactory.createTableColumn("Dtl1.stk_arrv_bp_nm", MCColumnType.TEXT);
		p.columnDtl1_purc_ret_rsn_cd = p.beansFactory.createTableColumn("Dtl1.purc_ret_rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl1_purc_ret_rsn_nm = p.beansFactory.createTableColumn("Dtl1.purc_ret_rsn_nm", MCColumnType.TEXT);
		p.columnDtl1_ap_dpt_cd = p.beansFactory.createTableColumn("Dtl1.ap_dpt_cd", MCColumnType.TEXT);
		p.columnDtl1_ap_dpt_nm = p.beansFactory.createTableColumn("Dtl1.ap_dpt_nm", MCColumnType.TEXT);
		p.columnDtl1_pay_crryovr_times = p.beansFactory.createTableColumn("Dtl1.pay_crryovr_times", MCColumnType.NUMBER);
		p.columnDtl1_xpns_purc_flg = p.beansFactory.createTableColumn("Dtl1.xpns_purc_flg", MCColumnType.CHECK);
		p.columnDtl1_bd_lot_mng_typ = p.beansFactory.createTableColumn("Dtl1.bd_lot_mng_typ", MCColumnType.TEXT);
		p.columnDtl1_bd_sublot_mng_typ = p.beansFactory.createTableColumn("Dtl1.bd_sublot_mng_typ", MCColumnType.TEXT);
		p.columnDtl1_bd_lot_no_typ = p.beansFactory.createTableColumn("Dtl1.bd_lot_no_typ", MCColumnType.TEXT);
		p.columnDtl1_bd_sublot_no_typ = p.beansFactory.createTableColumn("Dtl1.bd_sublot_no_typ", MCColumnType.TEXT);
		p.columnDtl1_bd_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl1.bd_sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl1_bd_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl1.bd_sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl1_bd_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl1.bd_sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl1_bd_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl1.bd_sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl1_cont_fctr_flg = p.beansFactory.createTableColumn("Dtl1.cont_fctr_flg", MCColumnType.CHECK);
		p.columnDtl1_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("Dtl1.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnDtl1_cont_fctr_dec_place = p.beansFactory.createTableColumn("Dtl1.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnDtl1_trd_d_rmrks = p.beansFactory.createTableColumn("Dtl1.trd_d_rmrks", MCColumnType.TEXT);
		p.columnDtl1_intr_d_rmrks = p.beansFactory.createTableColumn("Dtl1.intr_d_rmrks", MCColumnType.TEXT);
		p.columnDtl1_purc_ret_print_d_rmrks = p.beansFactory.createTableColumn("Dtl1.purc_ret_print_d_rmrks", MCColumnType.TEXT);
		p.columnDtl1_sub_char1 = p.beansFactory.createTableColumn("Dtl1.sub_char1", MCColumnType.TEXT);
		p.columnDtl1_sub_char2 = p.beansFactory.createTableColumn("Dtl1.sub_char2", MCColumnType.TEXT);
		p.columnDtl1_sub_char3 = p.beansFactory.createTableColumn("Dtl1.sub_char3", MCColumnType.TEXT);
		p.columnDtl1_ref_arr_act_no = p.beansFactory.createTableColumn("Dtl1.ref_arr_act_no", MCColumnType.TEXT);
		p.columnDtl1_ref_arr_act_rev = p.beansFactory.createTableColumn("Dtl1.ref_arr_act_rev", MCColumnType.NUMBER);
		p.columnDtl1_ref_purc_act_no = p.beansFactory.createTableColumn("Dtl1.ref_purc_act_no", MCColumnType.TEXT);
		p.columnDtl1_ref_purc_act_seq = p.beansFactory.createTableColumn("Dtl1.ref_purc_act_seq", MCColumnType.NUMBER);
		p.columnDtl1_ref_purc_act_rev = p.beansFactory.createTableColumn("Dtl1.ref_purc_act_rev", MCColumnType.NUMBER);
		p.columnDtl1_ref_purc_act_d_no = p.beansFactory.createTableColumn("Dtl1.ref_purc_act_d_no", MCColumnType.TEXT);
		p.columnDtl1_ref_purc_act_d_seq = p.beansFactory.createTableColumn("Dtl1.ref_purc_act_d_seq", MCColumnType.NUMBER);
		p.columnDtl1_purc_ret_schd_d_no = p.beansFactory.createTableColumn("Dtl1.purc_ret_schd_d_no", MCColumnType.TEXT);
		p.columnDtl1_base_purc_ac_dt = p.beansFactory.createTableColumn("Dtl1.base_purc_ac_dt", MCColumnType.DATE);
		p.columnDtl1_base_ac_dt = p.beansFactory.createTableColumn("Dtl1.base_ac_dt", MCColumnType.DATE);
		p.columnDtl1_disp_seq = p.beansFactory.createTableColumn("Dtl1.disp_seq", MCColumnType.NUMBER);
	}

	/**
	 * [Dtl1Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl1Btn(MSBDP_PurcRetSchdReg p) {
		// ブロック関連の初期化
		p.Dtl1BtnPanel = p.beansFactory.createPanel("Dtl1Btn");
		// ブロックの項目の初期化
		p.Dtl1Btn_srch_upri = p.beansFactory.createButton("Dtl1Btn.srch_upri");
		p.Dtl1Btn_radd = p.beansFactory.createButton("Dtl1Btn.radd", "no_border");
		p.Dtl1Btn_rdel = p.beansFactory.createButton("Dtl1Btn.rdel", "no_border");
		p.Dtl1Btn_rcopy = p.beansFactory.createButton("Dtl1Btn.rcopy", "no_border");
	}

	/**
	 * [Dtl2Panel]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl2Panel(MSBDP_PurcRetSchdReg p) {
		// ブロック関連の初期化
		p.Dtl2PanelPanel = p.beansFactory.createPanel("Dtl2Panel");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl2(MSBDP_PurcRetSchdReg p) {
		// ブロック関連の初期化
		p.Dtl2Panel = p.beansFactory.createPanel("Dtl2");
		p.Dtl2ScrollPane = p.beansFactory.createScrollPane("Dtl2.scroll");
		p.createDtl2Table();
		// ブロックの項目の初期化
		p.columnDtl2_dtl_peg_no = p.beansFactory.createTableColumn("Dtl2.dtl_peg_no", MCColumnType.NUMBER);
		p.columnDtl2_peg_no = p.beansFactory.createTableColumn("Dtl2.peg_no", MCColumnType.NUMBER);
		p.columnDtl2_purc_ret_loc_wg_cd = p.beansFactory.createTableColumn("Dtl2.purc_ret_loc_wg_cd", MCColumnType.TEXT);
		p.columnDtl2_purc_ret_loc_wg_nm = p.beansFactory.createTableColumn("Dtl2.purc_ret_loc_wg_nm", MCColumnType.TEXT);
		p.columnDtl2_purc_ret_loc_cd = p.beansFactory.createTableColumn("Dtl2.purc_ret_loc_cd", MCColumnType.TEXT);
		p.columnDtl2_purc_ret_loc_nm = p.beansFactory.createTableColumn("Dtl2.purc_ret_loc_nm", MCColumnType.TEXT);
		p.columnDtl2_purc_ret_sppl_cd = p.beansFactory.createTableColumn("Dtl2.purc_ret_sppl_cd", MCColumnType.TEXT);
		p.columnDtl2_str_ln_tgt_flg = p.beansFactory.createTableColumn("Dtl2.str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnDtl2_asset_mng_typ = p.beansFactory.createTableColumn("Dtl2.asset_mng_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl2_asset_mng_typ_nm = p.beansFactory.createTableColumn("Dtl2.asset_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl2_iv_itm_nm = p.beansFactory.createTableColumn("Dtl2.iv_itm_nm", MCColumnType.TEXT);
		p.columnDtl2_sundry_itm_flg = p.beansFactory.createTableColumn("Dtl2.sundry_itm_flg", MCColumnType.CHECK);
		p.columnDtl2_stk_mng_typ = p.beansFactory.createTableColumn("Dtl2.stk_mng_typ", MCColumnType.TEXT);
		p.columnDtl2_lot_mng_typ = p.beansFactory.createTableColumn("Dtl2.lot_mng_typ", MCColumnType.TEXT);
		p.columnDtl2_lot_no_typ = p.beansFactory.createTableColumn("Dtl2.lot_no_typ", MCColumnType.TEXT);
		p.columnDtl2_sublot_mng_typ = p.beansFactory.createTableColumn("Dtl2.sublot_mng_typ", MCColumnType.TEXT);
		p.columnDtl2_sublot_no_typ = p.beansFactory.createTableColumn("Dtl2.sublot_no_typ", MCColumnType.TEXT);
		p.columnDtl2_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl2.sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl2_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl2.sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl2_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl2.sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl2_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl2.sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl2_dscnt_itm_flg = p.beansFactory.createTableColumn("Dtl2.dscnt_itm_flg", MCColumnType.CHECK);
		p.columnDtl2_bp_lot_no = p.beansFactory.createTableColumn("Dtl2.bp_lot_no", MCColumnType.TEXT);
		p.columnDtl2_ver_flg = p.beansFactory.createTableColumn("Dtl2.ver_flg", MCColumnType.CHECK);
		p.columnDtl2_trd_unit_cd = p.beansFactory.createTableColumn("Dtl2.trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl2_trd_unit_nm = p.beansFactory.createTableColumn("Dtl2.trd_unit_nm", MCColumnType.TEXT);
		p.columnDtl2_trd_unit_dec_place = p.beansFactory.createTableColumn("Dtl2.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl2_trd_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl2.trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl2_trd_unit_dmn_qty = p.beansFactory.createTableColumn("Dtl2.trd_unit_dmn_qty", MCColumnType.NUMBER);
		p.columnDtl2_trd_unit_conv_qty = p.beansFactory.createTableColumn("Dtl2.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtl2_base_unit_cd = p.beansFactory.createTableColumn("Dtl2.base_unit_cd", MCColumnType.TEXT);
		p.columnDtl2_base_unit_nm = p.beansFactory.createTableColumn("Dtl2.base_unit_nm", MCColumnType.TEXT);
		p.columnDtl2_base_unit_dec_place = p.beansFactory.createTableColumn("Dtl2.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl2_base_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl2.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl2_quality_typ = p.beansFactory.createTableColumn("Dtl2.quality_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl2_quality_typ_nm = p.beansFactory.createTableColumn("Dtl2.quality_typ_nm", MCColumnType.TEXT);
		p.columnDtl2_stk_id_typ = p.beansFactory.createTableColumn("Dtl2.stk_id_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl2_stk_id_typ_nm = p.beansFactory.createTableColumn("Dtl2.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnDtl2_gd_cd = p.beansFactory.createTableColumn("Dtl2.gd_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl2_gd_nm = p.beansFactory.createTableColumn("Dtl2.gd_nm", MCColumnType.TEXT);
		p.columnDtl2_stk_arrv_bp_cd = p.beansFactory.createTableColumn("Dtl2.stk_arrv_bp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl2_stk_arrv_bp_nm = p.beansFactory.createTableColumn("Dtl2.stk_arrv_bp_nm", MCColumnType.TEXT);
		p.columnDtl2_cont_fctr_flg = p.beansFactory.createTableColumn("Dtl2.cont_fctr_flg", MCColumnType.CHECK);
		p.columnDtl2_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("Dtl2.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnDtl2_cont_fctr_dec_place = p.beansFactory.createTableColumn("Dtl2.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnDtl2_sub_char1 = p.beansFactory.createTableColumn("Dtl2.sub_char1", MCColumnType.TEXT);
		p.columnDtl2_sub_char2 = p.beansFactory.createTableColumn("Dtl2.sub_char2", MCColumnType.TEXT);
		p.columnDtl2_sub_char3 = p.beansFactory.createTableColumn("Dtl2.sub_char3", MCColumnType.TEXT);
		p.columnDtl2_ref_arr_act_no = p.beansFactory.createTableColumn("Dtl2.ref_arr_act_no", MCColumnType.TEXT);
		p.columnDtl2_ref_arr_act_rev = p.beansFactory.createTableColumn("Dtl2.ref_arr_act_rev", MCColumnType.NUMBER);
		p.columnDtl2_ref_purc_act_io_no = p.beansFactory.createTableColumn("Dtl2.ref_purc_act_io_no", MCColumnType.TEXT);
		p.columnDtl2_ref_purc_act_io_seq = p.beansFactory.createTableColumn("Dtl2.ref_purc_act_io_seq", MCColumnType.NUMBER);
		p.columnDtl2_purc_ret_schd_io_no = p.beansFactory.createTableColumn("Dtl2.purc_ret_schd_io_no", MCColumnType.TEXT);
	}

	/**
	 * [Dtl2Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl2Btn(MSBDP_PurcRetSchdReg p) {
		// ブロック関連の初期化
		p.Dtl2BtnPanel = p.beansFactory.createPanel("Dtl2Btn");
		// ブロックの項目の初期化
		p.Dtl2Btn_radd = p.beansFactory.createButton("Dtl2Btn.radd", "no_border");
		p.Dtl2Btn_rdel = p.beansFactory.createButton("Dtl2Btn.rdel", "no_border");
		p.Dtl2Btn_rcopy = p.beansFactory.createButton("Dtl2Btn.rcopy", "no_border");
		p.Dtl2Btn_upd_dtl = p.beansFactory.createButton("Dtl2Btn.upd_dtl");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBDP_PurcRetSchdReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBDP0160 = p.beansFactory.createButton("Btn.open_MSBDP0160", "open");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBDP_PurcRetSchdReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBDP_PurcRetSchdReg p) {
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
	protected static void jbInitCnd(MSBDP_PurcRetSchdReg p) {
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
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0150.CndR.ope_META);
		p.CndPanel.add(p.Cnd_srch_tgt_typ);
		p.CndPanel.setLastBeans(p.Cnd_srch_tgt_typ);
		p.Cnd_srch_tgt_typ.setNextBeans(p.Cnd_srch_tgt_typ_nm);
		p.Cnd_srch_tgt_typ.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0150.CndR.srch_tgt_typ_META);
		p.Cnd_srch_tgt_typ_nm.setListType(MCListType.STRICT);
		p.Cnd_srch_tgt_typ_nm.setLinkBeans(p.Cnd_srch_tgt_typ);
		p.CndPanel.add(p.Cnd_srch_tgt_typ_nm_Label);
		p.CndPanel.add(p.Cnd_srch_tgt_typ_nm);
		p.Cnd_srch_tgt_typ_nm.setNextBeans(p.Cnd_srch_tgt_no);
		p.Cnd_srch_tgt_typ_nm.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0150.CndR.srch_tgt_typ_nm_META);
		p.CndPanel.add(p.Cnd_srch_tgt_no);
		p.Cnd_srch_tgt_no.setNextBeans(p.Cnd_srch_arr_act);
		p.Cnd_srch_tgt_no.setRow(p.getCndR(), mcframe.clientMSBD.MSBDP0150.CndR.srch_tgt_no_META);
		p.Cnd_srch_arr_act.setIcon("SEARCH");
		p.Cnd_srch_arr_act.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch_arr_act);
		p.Cnd_srch_arr_act.setNextBeans(p.Cnd_srch_purc_act);
		p.Cnd_srch_purc_act.setIcon("SEARCH");
		p.Cnd_srch_purc_act.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch_purc_act);
		p.Cnd_srch_purc_act.setNextBeans(p.Cnd_srch_purc_ret_schd);
		p.Cnd_srch_purc_ret_schd.setIcon("SEARCH");
		p.Cnd_srch_purc_ret_schd.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch_purc_ret_schd);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBDP_PurcRetSchdReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.Dtl1PanelPanel);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.FoldPanel, null);
		p.TopPanel.setLastBeans(p.FoldPanel);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBDP_PurcRetSchdReg p) {
		// ブロック関連の初期化
		p.FoldPanel.add(p.FoldTab);
		p.FoldPanel.setLastBeans(p.FoldTab);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldTab.add(p.Hdr1Panel, "Fold.tab1");
		p.FoldTab.setLastBeans(p.Hdr1Panel);
		p.Hdr1Panel.setNextBeans(p.Hdr2Panel);
		p.FoldTab.add(p.Hdr2Panel, "Fold.tab2");
	}

	/**
	 * [Hdr1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr1(MSBDP_PurcRetSchdReg p) {
		// ブロック関連の初期化
		p.Hdr1Panel.setNextBeans(p.Hdr2Panel);
		p.Hdr1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Hdr1_trd_cd.setListType(MCListType.STRICT);
		p.Hdr1_trd_cd.setLinkBeans(p.Hdr1_trd_nm,p.Hdr1_trd_ptn_typ);
		p.Hdr1Panel.add(p.Hdr1_trd_cd_Label);
		p.Hdr1Panel.add(p.Hdr1_trd_cd);
		p.Hdr1Panel.setLastBeans(p.Hdr1_trd_cd);
		p.Hdr1_trd_cd.setNextBeans(p.Hdr1_trd_nm);
		p.Hdr1_trd_cd.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.trd_cd_META);
		p.Hdr1Panel.add(p.Hdr1_trd_nm);
		p.Hdr1_trd_nm.setNextBeans(p.Hdr1_trd_ptn_typ);
		p.Hdr1_trd_nm.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.trd_nm_META);
		p.Hdr1Panel.add(p.Hdr1_trd_ptn_typ);
		p.Hdr1_trd_ptn_typ.setNextBeans(p.Hdr1_purc_ret_schd_no);
		p.Hdr1_trd_ptn_typ.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.trd_ptn_typ_META);
		p.Hdr1Panel.add(p.Hdr1_purc_ret_schd_no_Label);
		p.Hdr1Panel.add(p.Hdr1_purc_ret_schd_no);
		p.Hdr1_purc_ret_schd_no.setNextBeans(p.Hdr1_reg_dt);
		p.Hdr1_purc_ret_schd_no.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.purc_ret_schd_no_META);
		p.Hdr1Panel.add(p.Hdr1_reg_dt_Label);
		p.Hdr1Panel.add(p.Hdr1_reg_dt);
		p.Hdr1_reg_dt.setNextBeans(p.Hdr1_schd_dt);
		p.Hdr1_reg_dt.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.reg_dt_META);
		p.Hdr1_reg_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Hdr1Panel.add(p.Hdr1_schd_dt_Label);
		p.Hdr1Panel.add(p.Hdr1_schd_dt);
		p.Hdr1_schd_dt.setNextBeans(p.Hdr1_sppl_cd);
		p.Hdr1_schd_dt.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.schd_dt_META);
		p.Hdr1_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Hdr1Panel.add(p.Hdr1_sppl_cd_Label);
		p.Hdr1Panel.add(p.Hdr1_sppl_cd);
		p.Hdr1_sppl_cd.setNextBeans(p.Hdr1_sppl_nm);
		p.Hdr1_sppl_cd.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.sppl_cd_META);
		p.Hdr1_sppl_cd.addLinkBeans(p.Hdr1_sppl_nm,p.Hdr1_purc_upri_cng_flg,p.Hdr1_sppl_cntry_cd,p.Hdr1_sppl_cntry_nm,p.Hdr1_sppl_zip_cd,p.Hdr1_sppl_addr1,p.Hdr1_sppl_addr2,p.Hdr1_sppl_addr3,p.Hdr1_sppl_addr4,p.Hdr1_sppl_cntct_dpt,p.Hdr1_sppl_cntct_psn,p.Hdr1_sppl_tel,p.Hdr1_sppl_fax,p.Hdr1_sppl_iv_flg,p.Hdr1_prnt_lcl_cd,p.Hdr1_subcon_flg,p.Hdr1_trd_cur_cd,p.Hdr1_asppl_cd,p.Hdr1_purc_amt_rnd_typ,p.Hdr1_purc_tax_rnd_typ,p.Hdr1_purc_tax_cd,p.Hdr1_purc_tax_cd_prio_flg,p.Hdr1_sppl_pay_crryovr_times,p.Hdr1_ap_dpt_cd,p.Hdr1_mst_ap_dpt_cd,p.Hdr1_pay_spot_flg,p.Hdr1_tterm_cd1,p.Hdr1_tterm_cd2,p.Hdr1_tterm_cd3,p.Hdr1_def_purc_usr_cd,p.Hdr1_def_purc_dpt_cd,p.Hdr1_repurc_obli_flg,p.Hdr1_outsrc_upri_typ);
		p.Hdr1_sppl_cd.setListType(MCListType.STRICT);
		p.Hdr1Panel.add(p.Hdr1_sppl_nm);
		p.Hdr1_sppl_nm.setNextBeans(p.Hdr1_purc_upri_cng_flg);
		p.Hdr1_sppl_nm.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.sppl_nm_META);
		p.Hdr1Panel.add(p.Hdr1_purc_upri_cng_flg);
		p.Hdr1_purc_upri_cng_flg.setNextBeans(p.Hdr1_subcon_flg);
		p.Hdr1_purc_upri_cng_flg.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.purc_upri_cng_flg_META);
		p.Hdr1Panel.add(p.Hdr1_subcon_flg);
		p.Hdr1_subcon_flg.setNextBeans(p.Hdr1_repurc_obli_flg);
		p.Hdr1_subcon_flg.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.subcon_flg_META);
		p.Hdr1Panel.add(p.Hdr1_repurc_obli_flg);
		p.Hdr1_repurc_obli_flg.setNextBeans(p.Hdr1_outsrc_upri_typ);
		p.Hdr1_repurc_obli_flg.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.repurc_obli_flg_META);
		p.Hdr1Panel.add(p.Hdr1_outsrc_upri_typ_Label);
		p.Hdr1Panel.add(p.Hdr1_outsrc_upri_typ);
		p.Hdr1_outsrc_upri_typ.setNextBeans(p.Hdr1_ap_dpt_cd);
		p.Hdr1_outsrc_upri_typ.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.outsrc_upri_typ_META);
		p.Hdr1Panel.add(p.Hdr1_ap_dpt_cd);
		p.Hdr1_ap_dpt_cd.setNextBeans(p.Hdr1_mst_ap_dpt_cd);
		p.Hdr1_ap_dpt_cd.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.ap_dpt_cd_META);
		p.Hdr1Panel.add(p.Hdr1_mst_ap_dpt_cd);
		p.Hdr1_mst_ap_dpt_cd.setNextBeans(p.Hdr1_pay_spot_flg);
		p.Hdr1_mst_ap_dpt_cd.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.mst_ap_dpt_cd_META);
		p.Hdr1Panel.add(p.Hdr1_pay_spot_flg);
		p.Hdr1_pay_spot_flg.setNextBeans(p.Hdr1_sppl_pay_crryovr_times);
		p.Hdr1_pay_spot_flg.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.pay_spot_flg_META);
		p.Hdr1Panel.add(p.Hdr1_sppl_pay_crryovr_times);
		p.Hdr1_sppl_pay_crryovr_times.setNextBeans(p.Hdr1_sppl_addr_p_PPanel);
		p.Hdr1_sppl_pay_crryovr_times.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.sppl_pay_crryovr_times_META);
		p.Hdr1Panel.add(p.Hdr1_sppl_addr_p_PPanel);
		p.Hdr1_sppl_addr_p_PPanel.setNextBeans(p.Hdr1_sppl_iv_flg);
		p.Hdr1Panel.add(p.Hdr1_sppl_iv_flg);
		p.Hdr1_sppl_iv_flg.setNextBeans(p.Hdr1_prnt_lcl_cd);
		p.Hdr1_sppl_iv_flg.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.sppl_iv_flg_META);
		p.Hdr1Panel.add(p.Hdr1_prnt_lcl_cd);
		p.Hdr1_prnt_lcl_cd.setNextBeans(p.Hdr1_asppl_cd);
		p.Hdr1_prnt_lcl_cd.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.prnt_lcl_cd_META);
		p.Hdr1Panel.add(p.Hdr1_asppl_cd_Label);
		p.Hdr1Panel.add(p.Hdr1_asppl_cd);
		p.Hdr1_asppl_cd.setNextBeans(p.Hdr1_asppl_nm);
		p.Hdr1_asppl_cd.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.asppl_cd_META);
		p.Hdr1_asppl_cd.addLinkBeans(p.Hdr1_asppl_nm);
		p.Hdr1_asppl_cd.setListType(MCListType.STRICT);
		p.Hdr1Panel.add(p.Hdr1_asppl_nm);
		p.Hdr1_asppl_nm.setNextBeans(p.Hdr1_trd_cur_cd);
		p.Hdr1_asppl_nm.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.asppl_nm_META);
		p.Hdr1_trd_cur_cd.setListType(MCListType.STRICT);
		p.Hdr1_trd_cur_cd.setLinkBeans(p.Hdr1_trd_cur_nm,p.Hdr1_trd_cur_upri_dec_place,p.Hdr1_trd_cur_amt_dec_place);
		p.Hdr1Panel.add(p.Hdr1_trd_cur_cd_Label);
		p.Hdr1Panel.add(p.Hdr1_trd_cur_cd);
		p.Hdr1_trd_cur_cd.setNextBeans(p.Hdr1_trd_cur_nm);
		p.Hdr1_trd_cur_cd.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.trd_cur_cd_META);
		p.Hdr1Panel.add(p.Hdr1_trd_cur_nm);
		p.Hdr1_trd_cur_nm.setNextBeans(p.Hdr1_trd_cur_upri_dec_place);
		p.Hdr1_trd_cur_nm.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.trd_cur_nm_META);
		p.Hdr1Panel.add(p.Hdr1_trd_cur_upri_dec_place);
		p.Hdr1_trd_cur_upri_dec_place.setNextBeans(p.Hdr1_trd_cur_amt_dec_place);
		p.Hdr1_trd_cur_upri_dec_place.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.trd_cur_upri_dec_place_META);
		p.Hdr1Panel.add(p.Hdr1_trd_cur_amt_dec_place);
		p.Hdr1_trd_cur_amt_dec_place.setNextBeans(p.Hdr1_ptax_cur_cd);
		p.Hdr1_trd_cur_amt_dec_place.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.trd_cur_amt_dec_place_META);
		p.Hdr1_ptax_cur_cd.setListType(MCListType.STRICT);
		p.Hdr1_ptax_cur_cd.setLinkBeans(p.Hdr1_ptax_cur_nm,p.Hdr1_ptax_cur_amt_dec_place,p.Hdr1_ptax_cur_upri_dec_place);
		p.Hdr1Panel.add(p.Hdr1_ptax_cur_cd_Label);
		p.Hdr1Panel.add(p.Hdr1_ptax_cur_cd);
		p.Hdr1_ptax_cur_cd.setNextBeans(p.Hdr1_ptax_cur_nm);
		p.Hdr1_ptax_cur_cd.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.ptax_cur_cd_META);
		p.Hdr1Panel.add(p.Hdr1_ptax_cur_nm);
		p.Hdr1_ptax_cur_nm.setNextBeans(p.Hdr1_ptax_cur_upri_dec_place);
		p.Hdr1_ptax_cur_nm.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.ptax_cur_nm_META);
		p.Hdr1Panel.add(p.Hdr1_ptax_cur_upri_dec_place);
		p.Hdr1_ptax_cur_upri_dec_place.setNextBeans(p.Hdr1_ptax_cur_amt_dec_place);
		p.Hdr1_ptax_cur_upri_dec_place.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.ptax_cur_upri_dec_place_META);
		p.Hdr1Panel.add(p.Hdr1_ptax_cur_amt_dec_place);
		p.Hdr1_ptax_cur_amt_dec_place.setNextBeans(p.Hdr1_ptax_xrate_inpt_flg);
		p.Hdr1_ptax_cur_amt_dec_place.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.ptax_cur_amt_dec_place_META);
		p.Hdr1Panel.add(p.Hdr1_ptax_xrate_inpt_flg);
		p.Hdr1_ptax_xrate_inpt_flg.setNextBeans(p.Hdr1_prax_xrate_p_PPanel);
		p.Hdr1_ptax_xrate_inpt_flg.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.ptax_xrate_inpt_flg_META);
		p.Hdr1Panel.add(p.Hdr1_prax_xrate_p_PPanel);
		p.Hdr1_prax_xrate_p_PPanel.setNextBeans(p.Hdr1_base_cur_cd);
		p.Hdr1_base_cur_cd.setListType(MCListType.STRICT);
		p.Hdr1_base_cur_cd.setLinkBeans(p.Hdr1_base_cur_nm,p.Hdr1_base_cur_amt_dec_place,p.Hdr1_base_cur_upri_dec_place);
		p.Hdr1Panel.add(p.Hdr1_base_cur_cd_Label);
		p.Hdr1Panel.add(p.Hdr1_base_cur_cd);
		p.Hdr1_base_cur_cd.setNextBeans(p.Hdr1_base_cur_nm);
		p.Hdr1_base_cur_cd.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.base_cur_cd_META);
		p.Hdr1Panel.add(p.Hdr1_base_cur_nm);
		p.Hdr1_base_cur_nm.setNextBeans(p.Hdr1_base_cur_upri_dec_place);
		p.Hdr1_base_cur_nm.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.base_cur_nm_META);
		p.Hdr1Panel.add(p.Hdr1_base_cur_upri_dec_place);
		p.Hdr1_base_cur_upri_dec_place.setNextBeans(p.Hdr1_base_cur_amt_dec_place);
		p.Hdr1_base_cur_upri_dec_place.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.base_cur_upri_dec_place_META);
		p.Hdr1Panel.add(p.Hdr1_base_cur_amt_dec_place);
		p.Hdr1_base_cur_amt_dec_place.setNextBeans(p.Hdr1_xrate_inpt_flg);
		p.Hdr1_base_cur_amt_dec_place.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.base_cur_amt_dec_place_META);
		p.Hdr1Panel.add(p.Hdr1_xrate_inpt_flg);
		p.Hdr1_xrate_inpt_flg.setNextBeans(p.Hdr1_xrate_p_PPanel);
		p.Hdr1_xrate_inpt_flg.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.xrate_inpt_flg_META);
		p.Hdr1Panel.add(p.Hdr1_xrate_p_PPanel);
		p.Hdr1_xrate_p_PPanel.setNextBeans(p.Hdr1_xrate_cd);
		p.Hdr1Panel.add(p.Hdr1_xrate_cd);
		p.Hdr1_xrate_cd.setNextBeans(p.Hdr1_purc_amt_rnd_typ);
		p.Hdr1_xrate_cd.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.xrate_cd_META);
		p.Hdr1Panel.add(p.Hdr1_purc_amt_rnd_typ);
		p.Hdr1_purc_amt_rnd_typ.setNextBeans(p.Hdr1_purc_tax_rnd_typ);
		p.Hdr1_purc_amt_rnd_typ.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.purc_amt_rnd_typ_META);
		p.Hdr1Panel.add(p.Hdr1_purc_tax_rnd_typ);
		p.Hdr1_purc_tax_rnd_typ.setNextBeans(p.Hdr1_purc_tax_calc_typ);
		p.Hdr1_purc_tax_rnd_typ.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.purc_tax_rnd_typ_META);
		p.Hdr1Panel.add(p.Hdr1_purc_tax_calc_typ);
		p.Hdr1_purc_tax_calc_typ.setNextBeans(p.Hdr1_purc_tax_cd);
		p.Hdr1_purc_tax_calc_typ.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.purc_tax_calc_typ_META);
		p.Hdr1Panel.add(p.Hdr1_purc_tax_cd);
		p.Hdr1_purc_tax_cd.setNextBeans(p.Hdr1_purc_tax_cd_prio_flg);
		p.Hdr1_purc_tax_cd.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.purc_tax_cd_META);
		p.Hdr1Panel.add(p.Hdr1_purc_tax_cd_prio_flg);
		p.Hdr1_purc_tax_cd_prio_flg.setNextBeans(p.Hdr1_trd_cur_amt_p_PPanel);
		p.Hdr1_purc_tax_cd_prio_flg.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.purc_tax_cd_prio_flg_META);
		p.Hdr1Panel.add(p.Hdr1_trd_cur_amt_p_PPanel);
		p.Hdr1_trd_cur_amt_p_PPanel.setNextBeans(p.Hdr1_trd_cur_inc_tax_amt_p_PPanel);
		p.Hdr1Panel.add(p.Hdr1_trd_cur_inc_tax_amt_p_PPanel);
		p.Hdr1_trd_cur_inc_tax_amt_p_PPanel.setNextBeans(p.Hdr1_ret_sppl_nm);
		p.Hdr1Panel.add(p.Hdr1_ret_sppl_nm_Label);
		p.Hdr1Panel.add(p.Hdr1_ret_sppl_nm);
		p.Hdr1_ret_sppl_nm.setNextBeans(p.Hdr1_ret_sppl_enable_flg);
		p.Hdr1_ret_sppl_nm.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.ret_sppl_nm_META);
		p.Hdr1Panel.add(p.Hdr1_ret_sppl_enable_flg);
		p.Hdr1_ret_sppl_enable_flg.setNextBeans(p.Hdr1_ret_sppl_addr_p_PPanel);
		p.Hdr1_ret_sppl_enable_flg.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.ret_sppl_enable_flg_META);
		p.Hdr1Panel.add(p.Hdr1_ret_sppl_addr_p_PPanel);
		p.Hdr1_ret_sppl_addr_p_PPanel.setNextBeans(p.Hdr1_ret_sppl_cntct_psn_title);
		p.Hdr1Panel.add(p.Hdr1_ret_sppl_cntct_psn_title_Label);
		p.Hdr1Panel.add(p.Hdr1_ret_sppl_cntct_psn_title);
		p.Hdr1_ret_sppl_cntct_psn_title.setNextBeans(p.Hdr1_rcpt_iv_no);
		p.Hdr1_ret_sppl_cntct_psn_title.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.ret_sppl_cntct_psn_title_META);
		p.Hdr1Panel.add(p.Hdr1_rcpt_iv_no_Label);
		p.Hdr1Panel.add(p.Hdr1_rcpt_iv_no);
		p.Hdr1_rcpt_iv_no.setNextBeans(p.Hdr1_ref_rcpt_iv_no);
		p.Hdr1_rcpt_iv_no.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.rcpt_iv_no_META);
		p.Hdr1Panel.add(p.Hdr1_ref_rcpt_iv_no_Label);
		p.Hdr1Panel.add(p.Hdr1_ref_rcpt_iv_no);
		p.Hdr1_ref_rcpt_iv_no.setNextBeans(p.Hdr1_purc_usr_dpt_p_PPanel);
		p.Hdr1_ref_rcpt_iv_no.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.ref_rcpt_iv_no_META);
		p.Hdr1Panel.add(p.Hdr1_purc_usr_dpt_p_PPanel);
		p.Hdr1_purc_usr_dpt_p_PPanel.setNextBeans(p.Hdr1_def_purc_usr_cd);
		p.Hdr1_purc_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.Hdr1_purc_dpt_nm,p.Hdr1_purc_dpt_wg_cd,p.Hdr1_purc_dpt_wg_nm,p.Hdr1_ap_dpt_flg);
		p.Hdr1Panel.add(p.Hdr1_def_purc_usr_cd);
		p.Hdr1_def_purc_usr_cd.setNextBeans(p.Hdr1_def_purc_dpt_cd);
		p.Hdr1_def_purc_usr_cd.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.def_purc_usr_cd_META);
		p.Hdr1Panel.add(p.Hdr1_def_purc_dpt_cd);
		p.Hdr1_def_purc_dpt_cd.setNextBeans(p.Hdr1_ap_dpt_flg);
		p.Hdr1_def_purc_dpt_cd.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.def_purc_dpt_cd_META);
		p.Hdr1Panel.add(p.Hdr1_ap_dpt_flg);
		p.Hdr1_ap_dpt_flg.setNextBeans(p.Hdr1_purc_dpt_wg_cd);
		p.Hdr1_ap_dpt_flg.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.ap_dpt_flg_META);
		p.Hdr1Panel.add(p.Hdr1_purc_dpt_wg_cd_Label);
		p.Hdr1Panel.add(p.Hdr1_purc_dpt_wg_cd);
		p.Hdr1_purc_dpt_wg_cd.setNextBeans(p.Hdr1_purc_dpt_wg_nm);
		p.Hdr1_purc_dpt_wg_cd.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.purc_dpt_wg_cd_META);
		p.Hdr1Panel.add(p.Hdr1_purc_dpt_wg_nm);
		p.Hdr1_purc_dpt_wg_nm.setNextBeans(p.Hdr1_purc_ret_print_rmrks);
		p.Hdr1_purc_dpt_wg_nm.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.purc_dpt_wg_nm_META);
		p.Hdr1Panel.add(p.Hdr1_purc_ret_print_rmrks_Label);
		p.Hdr1Panel.add(p.Hdr1_purc_ret_print_rmrks);
		p.Hdr1_purc_ret_print_rmrks.setNextBeans(p.Hdr1_trd_rmrks);
		p.Hdr1_purc_ret_print_rmrks.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.purc_ret_print_rmrks_META);
		p.Hdr1Panel.add(p.Hdr1_trd_rmrks_Label);
		p.Hdr1Panel.add(p.Hdr1_trd_rmrks);
		p.Hdr1_trd_rmrks.setNextBeans(p.Hdr1_intr_rmrks);
		p.Hdr1_trd_rmrks.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.trd_rmrks_META);
		p.Hdr1Panel.add(p.Hdr1_intr_rmrks_Label);
		p.Hdr1Panel.add(p.Hdr1_intr_rmrks);
		p.Hdr1_intr_rmrks.setNextBeans(p.Hdr1_sub_char1);
		p.Hdr1_intr_rmrks.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.intr_rmrks_META);
		p.Hdr1Panel.add(p.Hdr1_sub_char1_Label);
		p.Hdr1Panel.add(p.Hdr1_sub_char1);
		p.Hdr1_sub_char1.setNextBeans(p.Hdr1_sub_char2);
		p.Hdr1_sub_char1.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.sub_char1_META);
		p.Hdr1Panel.add(p.Hdr1_sub_char2_Label);
		p.Hdr1Panel.add(p.Hdr1_sub_char2);
		p.Hdr1_sub_char2.setNextBeans(p.Hdr1_sub_char3);
		p.Hdr1_sub_char2.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.sub_char2_META);
		p.Hdr1Panel.add(p.Hdr1_sub_char3_Label);
		p.Hdr1Panel.add(p.Hdr1_sub_char3);
		p.Hdr1_sub_char3.setNextBeans(p.Hdr1_tterm_cd1);
		p.Hdr1_sub_char3.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.sub_char3_META);
		p.Hdr1_tterm_cd1.setListType(MCListType.STRICT);
		p.Hdr1_tterm_cd1.setLinkBeans(p.Hdr1_tterm_nm1);
		p.Hdr1Panel.add(p.Hdr1_tterm_cd1_Label);
		p.Hdr1Panel.add(p.Hdr1_tterm_cd1);
		p.Hdr1_tterm_cd1.setNextBeans(p.Hdr1_tterm_nm1);
		p.Hdr1_tterm_cd1.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.tterm_cd1_META);
		p.Hdr1Panel.add(p.Hdr1_tterm_nm1);
		p.Hdr1_tterm_nm1.setNextBeans(p.Hdr1_tterm_rmrks1);
		p.Hdr1_tterm_nm1.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.tterm_nm1_META);
		p.Hdr1Panel.add(p.Hdr1_tterm_rmrks1_Label);
		p.Hdr1Panel.add(p.Hdr1_tterm_rmrks1);
		p.Hdr1_tterm_rmrks1.setNextBeans(p.Hdr1_tterm_cd2);
		p.Hdr1_tterm_rmrks1.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.tterm_rmrks1_META);
		p.Hdr1_tterm_cd2.setListType(MCListType.STRICT);
		p.Hdr1_tterm_cd2.setLinkBeans(p.Hdr1_tterm_nm2);
		p.Hdr1Panel.add(p.Hdr1_tterm_cd2_Label);
		p.Hdr1Panel.add(p.Hdr1_tterm_cd2);
		p.Hdr1_tterm_cd2.setNextBeans(p.Hdr1_tterm_nm2);
		p.Hdr1_tterm_cd2.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.tterm_cd2_META);
		p.Hdr1Panel.add(p.Hdr1_tterm_nm2);
		p.Hdr1_tterm_nm2.setNextBeans(p.Hdr1_tterm_rmrks2);
		p.Hdr1_tterm_nm2.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.tterm_nm2_META);
		p.Hdr1Panel.add(p.Hdr1_tterm_rmrks2_Label);
		p.Hdr1Panel.add(p.Hdr1_tterm_rmrks2);
		p.Hdr1_tterm_rmrks2.setNextBeans(p.Hdr1_tterm_cd3);
		p.Hdr1_tterm_rmrks2.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.tterm_rmrks2_META);
		p.Hdr1_tterm_cd3.setListType(MCListType.STRICT);
		p.Hdr1_tterm_cd3.setLinkBeans(p.Hdr1_tterm_nm3);
		p.Hdr1Panel.add(p.Hdr1_tterm_cd3_Label);
		p.Hdr1Panel.add(p.Hdr1_tterm_cd3);
		p.Hdr1_tterm_cd3.setNextBeans(p.Hdr1_tterm_nm3);
		p.Hdr1_tterm_cd3.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.tterm_cd3_META);
		p.Hdr1Panel.add(p.Hdr1_tterm_nm3);
		p.Hdr1_tterm_nm3.setNextBeans(p.Hdr1_tterm_rmrks3);
		p.Hdr1_tterm_nm3.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.tterm_nm3_META);
		p.Hdr1Panel.add(p.Hdr1_tterm_rmrks3_Label);
		p.Hdr1Panel.add(p.Hdr1_tterm_rmrks3);
		p.Hdr1_tterm_rmrks3.setNextBeans(p.Hdr1_pr_schd_upd_cntr);
		p.Hdr1_tterm_rmrks3.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.tterm_rmrks3_META);
		p.Hdr1Panel.add(p.Hdr1_pr_schd_upd_cntr);
		p.Hdr1_pr_schd_upd_cntr.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.pr_schd_upd_cntr_META);
		p.Hdr2Panel.add(p.Hdr1_ins_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr1_ins_usr_id);
		p.Hdr2Panel.setLastBeans(p.Hdr1_ins_usr_id);
		p.Hdr1_ins_usr_id.setNextBeans(p.Hdr1_ins_usr_nm);
		p.Hdr1_ins_usr_id.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.ins_usr_id_META);
		p.Hdr2Panel.add(p.Hdr1_ins_usr_nm);
		p.Hdr1_ins_usr_nm.setNextBeans(p.Hdr1_ins_func_id);
		p.Hdr1_ins_usr_nm.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.ins_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr1_ins_func_id_Label);
		p.Hdr2Panel.add(p.Hdr1_ins_func_id);
		p.Hdr1_ins_func_id.setNextBeans(p.Hdr1_ins_func_nm);
		p.Hdr1_ins_func_id.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.ins_func_id_META);
		p.Hdr2Panel.add(p.Hdr1_ins_func_nm);
		p.Hdr1_ins_func_nm.setNextBeans(p.Hdr1_upd_usr_id);
		p.Hdr1_ins_func_nm.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.ins_func_nm_META);
		p.Hdr2Panel.add(p.Hdr1_upd_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr1_upd_usr_id);
		p.Hdr1_upd_usr_id.setNextBeans(p.Hdr1_upd_usr_nm);
		p.Hdr1_upd_usr_id.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.upd_usr_id_META);
		p.Hdr2Panel.add(p.Hdr1_upd_usr_nm);
		p.Hdr1_upd_usr_nm.setNextBeans(p.Hdr1_upd_func_id);
		p.Hdr1_upd_usr_nm.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.upd_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr1_upd_func_id_Label);
		p.Hdr2Panel.add(p.Hdr1_upd_func_id);
		p.Hdr1_upd_func_id.setNextBeans(p.Hdr1_upd_func_nm);
		p.Hdr1_upd_func_id.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.upd_func_id_META);
		p.Hdr2Panel.add(p.Hdr1_upd_func_nm);
		p.Hdr1_upd_func_nm.setNextBeans(p.Hdr1_ins_ts);
		p.Hdr1_upd_func_nm.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.upd_func_nm_META);
		p.Hdr2Panel.add(p.Hdr1_ins_ts_Label);
		p.Hdr2Panel.add(p.Hdr1_ins_ts);
		p.Hdr1_ins_ts.setNextBeans(p.Hdr1_upd_ts);
		p.Hdr1_ins_ts.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.ins_ts_META);
		p.Hdr1_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr1_upd_ts_Label);
		p.Hdr2Panel.add(p.Hdr1_upd_ts);
		p.Hdr1_upd_ts.setNextBeans(p.Hdr1_upd_srv_req_no);
		p.Hdr1_upd_ts.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.upd_ts_META);
		p.Hdr1_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr1_upd_srv_req_no_Label);
		p.Hdr2Panel.add(p.Hdr1_upd_srv_req_no);
		p.Hdr1_upd_srv_req_no.setRow(p.getHdr1R(), mcframe.clientMSBD.MSBDP0150.Hdr1R.upd_srv_req_no_META);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr2(MSBDP_PurcRetSchdReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl1Panel]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl1Panel(MSBDP_PurcRetSchdReg p) {
		// ブロック関連の初期化
		p.add(p.Dtl1PanelPanel);
		p.Dtl1PanelPanel.setNextBeans(p.Dtl2PanelPanel);
		p.Dtl1PanelPanel.setLayoutPosition("CBCTC+");
		// ブロックの項目の初期化
		p.Dtl1PanelPanel.add(p.Dtl1Panel, null);
		p.Dtl1PanelPanel.setLastBeans(p.Dtl1Panel);
		p.Dtl1Panel.setNextBeans(p.Dtl1BtnPanel);
		p.Dtl1PanelPanel.add(p.Dtl1BtnPanel, null);
	}

	/**
	 * [Dtl1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl1(MSBDP_PurcRetSchdReg p) {
		// ブロック関連の初期化
		p.Dtl1Panel.add(p.Dtl1ScrollPane);
		p.Dtl1Panel.setLastBeans(p.Dtl1Table);
		p.Dtl1ScrollPane.setViewportView(p.Dtl1Table);
		p.Dtl1Table.setList(p.getDtl1L());
		p.Dtl1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl1Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl1Btn(MSBDP_PurcRetSchdReg p) {
		// ブロック関連の初期化
		p.Dtl1BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Dtl1BtnPanel.add(p.Dtl1Btn_Btn_open_MSBEP0500_PPanel);
		p.Dtl1BtnPanel.setLastBeans(p.Dtl1Btn_Btn_open_MSBEP0500_PPanel);
		p.Dtl1Btn_Btn_open_MSBEP0500_PPanel.setNextBeans(p.Dtl1Btn_srch_upri);
		p.Dtl1Btn_srch_upri.setFunctionKey(MCFunctionKey.F7);
		p.Dtl1BtnPanel.add(p.Dtl1Btn_srch_upri);
		p.Dtl1Btn_srch_upri.setNextBeans(p.Dtl1Btn_radd);
		p.Dtl1Btn_radd.setIcon("INSERT_RECORD");
		p.Dtl1Btn_radd.setFunctionKey(MCFunctionKey.F5);
		p.Dtl1BtnPanel.add(p.Dtl1Btn_radd);
		p.Dtl1Btn_radd.setNextBeans(p.Dtl1Btn_rdel);
		p.Dtl1Btn_rdel.setIcon("DELETE_RECORD");
		p.Dtl1Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.Dtl1BtnPanel.add(p.Dtl1Btn_rdel);
		p.Dtl1Btn_rdel.setNextBeans(p.Dtl1Btn_rcopy);
		p.Dtl1Btn_rcopy.setIcon("COPY_RECORD");
		p.Dtl1Btn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.Dtl1BtnPanel.add(p.Dtl1Btn_rcopy);
		p.Dtl1Btn_rcopy.setNextBeans(p.Dtl1Btn_menu_move_p_PPanel);
		p.Dtl1BtnPanel.add(p.Dtl1Btn_menu_move_p_PPanel);
	}

	/**
	 * [Dtl2Panel]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl2Panel(MSBDP_PurcRetSchdReg p) {
		// ブロック関連の初期化
		p.add(p.Dtl2PanelPanel);
		p.Dtl2PanelPanel.setNextBeans(p.BtnPanel);
		p.Dtl2PanelPanel.setLayoutPosition("CBCBCBC+");
		// ブロックの項目の初期化
		p.Dtl2PanelPanel.add(p.Dtl2Panel, null);
		p.Dtl2PanelPanel.setLastBeans(p.Dtl2Panel);
		p.Dtl2Panel.setNextBeans(p.Dtl2BtnPanel);
		p.Dtl2PanelPanel.add(p.Dtl2BtnPanel, null);
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl2(MSBDP_PurcRetSchdReg p) {
		// ブロック関連の初期化
		p.Dtl2Panel.add(p.Dtl2ScrollPane);
		p.Dtl2Panel.setLastBeans(p.Dtl2Table);
		p.Dtl2ScrollPane.setViewportView(p.Dtl2Table);
		p.Dtl2Table.setList(p.getDtl2L());
		p.Dtl2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl2Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl2Btn(MSBDP_PurcRetSchdReg p) {
		// ブロック関連の初期化
		p.Dtl2BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Dtl2BtnPanel.add(p.Dtl2Btn_Btn_open_MSBEP0500_PPanel);
		p.Dtl2BtnPanel.setLastBeans(p.Dtl2Btn_Btn_open_MSBEP0500_PPanel);
		p.Dtl2Btn_Btn_open_MSBEP0500_PPanel.setNextBeans(p.Dtl2Btn_radd);
		p.Dtl2Btn_radd.setIcon("INSERT_RECORD");
		p.Dtl2Btn_radd.setFunctionKey(MCFunctionKey.F11);
		p.Dtl2BtnPanel.add(p.Dtl2Btn_radd);
		p.Dtl2Btn_radd.setNextBeans(p.Dtl2Btn_rdel);
		p.Dtl2Btn_rdel.setIcon("DELETE_RECORD");
		p.Dtl2Btn_rdel.setFunctionKey(MCFunctionKey.F13);
		p.Dtl2BtnPanel.add(p.Dtl2Btn_rdel);
		p.Dtl2Btn_rdel.setNextBeans(p.Dtl2Btn_rcopy);
		p.Dtl2Btn_rcopy.setIcon("COPY_RECORD");
		p.Dtl2Btn_rcopy.setFunctionKey(MCFunctionKey.F14);
		p.Dtl2BtnPanel.add(p.Dtl2Btn_rcopy);
		p.Dtl2Btn_rcopy.setNextBeans(p.Dtl2Btn_upd_dtl);
		p.Dtl2Btn_upd_dtl.setFunctionKey(MCFunctionKey.F16);
		p.Dtl2BtnPanel.add(p.Dtl2Btn_upd_dtl);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBDP_PurcRetSchdReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.Btn_open_MSBDP0160.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBDP0160);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBDP0160);
		p.Btn_open_MSBDP0160.setNextBeans(p.Btn_ins);
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
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBDP_PurcRetSchdReg p) {
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
		MSBDP_PurcRetSchdReg_MC.mcInitScreenOpe((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.mcInitCnd((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.mcInitTop((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.mcInitFold((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.mcInitHdr1((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.mcInitHdr2((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.mcInitDtl1Panel((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.mcInitDtl1((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.mcInitDtl1Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.mcInitDtl2Panel((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.mcInitDtl2((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.mcInitDtl2Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.mcInitBtn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.mcInitEastBtn((MSBDP_PurcRetSchdReg)this);

		// [INS]ステータスのモードの設定
		MSBDP_PurcRetSchdReg_MC.statusInitINS_ScreenOpe((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitINS_Cnd((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitINS_Top((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitINS_Fold((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitINS_Hdr1((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitINS_Hdr2((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitINS_Dtl1Panel((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitINS_Dtl1((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitINS_Dtl1Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitINS_Dtl2Panel((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitINS_Dtl2((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitINS_Dtl2Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitINS_Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitINS_EastBtn((MSBDP_PurcRetSchdReg)this);

		// [FIX_I]ステータスのモードの設定
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__I_ScreenOpe((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__I_Cnd((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__I_Top((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__I_Fold((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__I_Hdr1((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__I_Hdr2((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__I_Dtl1Panel((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__I_Dtl1((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__I_Dtl1Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__I_Dtl2Panel((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__I_Dtl2((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__I_Dtl2Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__I_Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__I_EastBtn((MSBDP_PurcRetSchdReg)this);

		// [SRCH]ステータスのモードの設定
		MSBDP_PurcRetSchdReg_MC.statusInitSRCH_ScreenOpe((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitSRCH_Cnd((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitSRCH_Top((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitSRCH_Fold((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitSRCH_Hdr1((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitSRCH_Hdr2((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitSRCH_Dtl1Panel((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitSRCH_Dtl1((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitSRCH_Dtl1Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitSRCH_Dtl2Panel((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitSRCH_Dtl2((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitSRCH_Dtl2Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitSRCH_Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitSRCH_EastBtn((MSBDP_PurcRetSchdReg)this);

		// [UPD]ステータスのモードの設定
		MSBDP_PurcRetSchdReg_MC.statusInitUPD_ScreenOpe((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitUPD_Cnd((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitUPD_Top((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitUPD_Fold((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitUPD_Hdr1((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitUPD_Hdr2((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitUPD_Dtl1Panel((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitUPD_Dtl1((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitUPD_Dtl1Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitUPD_Dtl2Panel((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitUPD_Dtl2((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitUPD_Dtl2Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitUPD_Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitUPD_EastBtn((MSBDP_PurcRetSchdReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__U_ScreenOpe((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__U_Cnd((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__U_Top((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__U_Fold((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__U_Hdr1((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__U_Hdr2((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__U_Dtl1Panel((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__U_Dtl1((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__U_Dtl1Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__U_Dtl2Panel((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__U_Dtl2((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__U_Dtl2Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__U_Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__U_EastBtn((MSBDP_PurcRetSchdReg)this);

		// [DEL]ステータスのモードの設定
		MSBDP_PurcRetSchdReg_MC.statusInitDEL_ScreenOpe((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitDEL_Cnd((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitDEL_Top((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitDEL_Fold((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitDEL_Hdr1((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitDEL_Hdr2((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitDEL_Dtl1Panel((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitDEL_Dtl1((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitDEL_Dtl1Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitDEL_Dtl2Panel((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitDEL_Dtl2((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitDEL_Dtl2Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitDEL_Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitDEL_EastBtn((MSBDP_PurcRetSchdReg)this);

		// [FIX_D]ステータスのモードの設定
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__D_ScreenOpe((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__D_Cnd((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__D_Top((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__D_Fold((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__D_Hdr1((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__D_Hdr2((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__D_Dtl1Panel((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__D_Dtl1((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__D_Dtl1Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__D_Dtl2Panel((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__D_Dtl2((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__D_Dtl2Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__D_Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitFIX__D_EastBtn((MSBDP_PurcRetSchdReg)this);

		// [REF]ステータスのモードの設定
		MSBDP_PurcRetSchdReg_MC.statusInitREF_ScreenOpe((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitREF_Cnd((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitREF_Top((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitREF_Fold((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitREF_Hdr1((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitREF_Hdr2((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitREF_Dtl1Panel((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitREF_Dtl1((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitREF_Dtl1Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitREF_Dtl2Panel((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitREF_Dtl2((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitREF_Dtl2Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitREF_Btn((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.statusInitREF_EastBtn((MSBDP_PurcRetSchdReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBDP_PurcRetSchdReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBDP_PurcRetSchdReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_srch_tgt_typ.setListListener(p);
		p.Cnd_srch_tgt_typ.addAllListener(p);
		p.Cnd_srch_tgt_typ_nm.setListListener(p);
		p.Cnd_srch_tgt_typ_nm.addAllListener(p);
		p.Cnd_srch_tgt_no.setListListener(p);
		p.Cnd_srch_tgt_no.addAllListener(p);
		p.Cnd_srch_arr_act.addAllListener(p);
		p.Cnd_srch_arr_act.setAPMethodName("doCnd_srch_arr_act");
		p.Cnd_srch_purc_act.addAllListener(p);
		p.Cnd_srch_purc_act.setAPMethodName("doCnd_srch_purc_act");
		p.Cnd_srch_purc_ret_schd.addAllListener(p);
		p.Cnd_srch_purc_ret_schd.setAPMethodName("doCnd_srch_purc_ret_schd");
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBDP_PurcRetSchdReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBDP_PurcRetSchdReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Hdr1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr1(MSBDP_PurcRetSchdReg p) {
		p.Hdr1_trd_cd.setListListener(p);
		p.Hdr1_trd_cd.addAllListener(p);
		p.Hdr1_trd_nm.setListListener(p);
		p.Hdr1_trd_nm.addAllListener(p);
		p.Hdr1_trd_ptn_typ.setListListener(p);
		p.Hdr1_trd_ptn_typ.addAllListener(p);
		p.Hdr1_purc_ret_schd_no.setListListener(p);
		p.Hdr1_purc_ret_schd_no.addAllListener(p);
		p.Hdr1_reg_dt.setListListener(p);
		p.Hdr1_reg_dt.addAllListener(p);
		p.Hdr1_schd_dt.setListListener(p);
		p.Hdr1_schd_dt.addAllListener(p);
		p.Hdr1_sppl_cd.setListListener(p);
		p.Hdr1_sppl_cd.addAllListener(p);
		p.Hdr1_sppl_nm.setListListener(p);
		p.Hdr1_sppl_nm.addAllListener(p);
		p.Hdr1_purc_upri_cng_flg.addAllListener(p);
		p.Hdr1_subcon_flg.addAllListener(p);
		p.Hdr1_repurc_obli_flg.addAllListener(p);
		p.Hdr1_outsrc_upri_typ.setListListener(p);
		p.Hdr1_outsrc_upri_typ.addAllListener(p);
		p.Hdr1_ap_dpt_cd.setListListener(p);
		p.Hdr1_ap_dpt_cd.addAllListener(p);
		p.Hdr1_mst_ap_dpt_cd.setListListener(p);
		p.Hdr1_mst_ap_dpt_cd.addAllListener(p);
		p.Hdr1_pay_spot_flg.addAllListener(p);
		p.Hdr1_sppl_pay_crryovr_times.setListListener(p);
		p.Hdr1_sppl_pay_crryovr_times.addAllListener(p);
		p.Hdr1_sppl_iv_flg.addAllListener(p);
		p.Hdr1_prnt_lcl_cd.setListListener(p);
		p.Hdr1_prnt_lcl_cd.addAllListener(p);
		p.Hdr1_asppl_cd.setListListener(p);
		p.Hdr1_asppl_cd.addAllListener(p);
		p.Hdr1_asppl_nm.setListListener(p);
		p.Hdr1_asppl_nm.addAllListener(p);
		p.Hdr1_trd_cur_cd.setListListener(p);
		p.Hdr1_trd_cur_cd.addAllListener(p);
		p.Hdr1_trd_cur_nm.setListListener(p);
		p.Hdr1_trd_cur_nm.addAllListener(p);
		p.Hdr1_trd_cur_upri_dec_place.setListListener(p);
		p.Hdr1_trd_cur_upri_dec_place.addAllListener(p);
		p.Hdr1_trd_cur_amt_dec_place.setListListener(p);
		p.Hdr1_trd_cur_amt_dec_place.addAllListener(p);
		p.Hdr1_ptax_cur_cd.setListListener(p);
		p.Hdr1_ptax_cur_cd.addAllListener(p);
		p.Hdr1_ptax_cur_nm.setListListener(p);
		p.Hdr1_ptax_cur_nm.addAllListener(p);
		p.Hdr1_ptax_cur_upri_dec_place.setListListener(p);
		p.Hdr1_ptax_cur_upri_dec_place.addAllListener(p);
		p.Hdr1_ptax_cur_amt_dec_place.setListListener(p);
		p.Hdr1_ptax_cur_amt_dec_place.addAllListener(p);
		p.Hdr1_ptax_xrate_inpt_flg.addAllListener(p);
		p.Hdr1_base_cur_cd.setListListener(p);
		p.Hdr1_base_cur_cd.addAllListener(p);
		p.Hdr1_base_cur_nm.setListListener(p);
		p.Hdr1_base_cur_nm.addAllListener(p);
		p.Hdr1_base_cur_upri_dec_place.setListListener(p);
		p.Hdr1_base_cur_upri_dec_place.addAllListener(p);
		p.Hdr1_base_cur_amt_dec_place.setListListener(p);
		p.Hdr1_base_cur_amt_dec_place.addAllListener(p);
		p.Hdr1_xrate_inpt_flg.addAllListener(p);
		p.Hdr1_xrate_cd.setListListener(p);
		p.Hdr1_xrate_cd.addAllListener(p);
		p.Hdr1_purc_amt_rnd_typ.setListListener(p);
		p.Hdr1_purc_amt_rnd_typ.addAllListener(p);
		p.Hdr1_purc_tax_rnd_typ.setListListener(p);
		p.Hdr1_purc_tax_rnd_typ.addAllListener(p);
		p.Hdr1_purc_tax_calc_typ.setListListener(p);
		p.Hdr1_purc_tax_calc_typ.addAllListener(p);
		p.Hdr1_purc_tax_cd.setListListener(p);
		p.Hdr1_purc_tax_cd.addAllListener(p);
		p.Hdr1_purc_tax_cd_prio_flg.addAllListener(p);
		p.Hdr1_ret_sppl_nm.setListListener(p);
		p.Hdr1_ret_sppl_nm.addAllListener(p);
		p.Hdr1_ret_sppl_enable_flg.addAllListener(p);
		p.Hdr1_ret_sppl_cntct_psn_title.setListListener(p);
		p.Hdr1_ret_sppl_cntct_psn_title.addAllListener(p);
		p.Hdr1_rcpt_iv_no.setListListener(p);
		p.Hdr1_rcpt_iv_no.addAllListener(p);
		p.Hdr1_ref_rcpt_iv_no.setListListener(p);
		p.Hdr1_ref_rcpt_iv_no.addAllListener(p);
		p.Hdr1_purc_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr1_def_purc_usr_cd.setListListener(p);
		p.Hdr1_def_purc_usr_cd.addAllListener(p);
		p.Hdr1_def_purc_dpt_cd.setListListener(p);
		p.Hdr1_def_purc_dpt_cd.addAllListener(p);
		p.Hdr1_ap_dpt_flg.addAllListener(p);
		p.Hdr1_purc_dpt_wg_cd.setListListener(p);
		p.Hdr1_purc_dpt_wg_cd.addAllListener(p);
		p.Hdr1_purc_dpt_wg_nm.setListListener(p);
		p.Hdr1_purc_dpt_wg_nm.addAllListener(p);
		p.Hdr1_purc_ret_print_rmrks.setListListener(p);
		p.Hdr1_purc_ret_print_rmrks.addAllListener(p);
		p.Hdr1_trd_rmrks.setListListener(p);
		p.Hdr1_trd_rmrks.addAllListener(p);
		p.Hdr1_intr_rmrks.setListListener(p);
		p.Hdr1_intr_rmrks.addAllListener(p);
		p.Hdr1_sub_char1.setListListener(p);
		p.Hdr1_sub_char1.addAllListener(p);
		p.Hdr1_sub_char2.setListListener(p);
		p.Hdr1_sub_char2.addAllListener(p);
		p.Hdr1_sub_char3.setListListener(p);
		p.Hdr1_sub_char3.addAllListener(p);
		p.Hdr1_tterm_cd1.setListListener(p);
		p.Hdr1_tterm_cd1.addAllListener(p);
		p.Hdr1_tterm_nm1.setListListener(p);
		p.Hdr1_tterm_nm1.addAllListener(p);
		p.Hdr1_tterm_rmrks1.setListListener(p);
		p.Hdr1_tterm_rmrks1.addAllListener(p);
		p.Hdr1_tterm_cd2.setListListener(p);
		p.Hdr1_tterm_cd2.addAllListener(p);
		p.Hdr1_tterm_nm2.setListListener(p);
		p.Hdr1_tterm_nm2.addAllListener(p);
		p.Hdr1_tterm_rmrks2.setListListener(p);
		p.Hdr1_tterm_rmrks2.addAllListener(p);
		p.Hdr1_tterm_cd3.setListListener(p);
		p.Hdr1_tterm_cd3.addAllListener(p);
		p.Hdr1_tterm_nm3.setListListener(p);
		p.Hdr1_tterm_nm3.addAllListener(p);
		p.Hdr1_tterm_rmrks3.setListListener(p);
		p.Hdr1_tterm_rmrks3.addAllListener(p);
		p.Hdr1_pr_schd_upd_cntr.setListListener(p);
		p.Hdr1_pr_schd_upd_cntr.addAllListener(p);
		p.Hdr1_ins_usr_id.setListListener(p);
		p.Hdr1_ins_usr_id.addAllListener(p);
		p.Hdr1_ins_usr_nm.setListListener(p);
		p.Hdr1_ins_usr_nm.addAllListener(p);
		p.Hdr1_ins_func_id.setListListener(p);
		p.Hdr1_ins_func_id.addAllListener(p);
		p.Hdr1_ins_func_nm.setListListener(p);
		p.Hdr1_ins_func_nm.addAllListener(p);
		p.Hdr1_upd_usr_id.setListListener(p);
		p.Hdr1_upd_usr_id.addAllListener(p);
		p.Hdr1_upd_usr_nm.setListListener(p);
		p.Hdr1_upd_usr_nm.addAllListener(p);
		p.Hdr1_upd_func_id.setListListener(p);
		p.Hdr1_upd_func_id.addAllListener(p);
		p.Hdr1_upd_func_nm.setListListener(p);
		p.Hdr1_upd_func_nm.addAllListener(p);
		p.Hdr1_ins_ts.setListListener(p);
		p.Hdr1_ins_ts.addAllListener(p);
		p.Hdr1_upd_ts.setListListener(p);
		p.Hdr1_upd_ts.addAllListener(p);
		p.Hdr1_upd_srv_req_no.setListListener(p);
		p.Hdr1_upd_srv_req_no.addAllListener(p);
	}

	/**
	 *  [Hdr2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr2(MSBDP_PurcRetSchdReg p) {
	}

	/**
	 *  [Dtl1Panel]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl1Panel(MSBDP_PurcRetSchdReg p) {
	}

	/**
	 *  [Dtl1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl1(MSBDP_PurcRetSchdReg p) {
		p.Dtl1Table.addAllListener(p);
		p.columnDtl1_peg_no.addAllListener(p);
		p.columnDtl1_peg_no.setListListener(p);
		p.columnDtl1_cmpl_flg.addAllListener(p);
		p.columnDtl1_abort_flg.addAllListener(p);
		p.columnDtl1_purc_ret_loc_wg_cd.addAllListener(p);
		p.columnDtl1_purc_ret_loc_wg_cd.setListListener(p);
		p.columnDtl1_purc_ret_loc_wg_nm.addAllListener(p);
		p.columnDtl1_purc_ret_loc_wg_nm.setListListener(p);
		p.columnDtl1_purc_ret_loc_cd.addAllListener(p);
		p.columnDtl1_purc_ret_loc_cd.setListListener(p);
		p.columnDtl1_purc_ret_loc_nm.addAllListener(p);
		p.columnDtl1_purc_ret_loc_nm.setListListener(p);
		p.columnDtl1_purc_ret_sppl_cd.addAllListener(p);
		p.columnDtl1_purc_ret_sppl_cd.setListListener(p);
		p.columnDtl1_str_ln_tgt_flg.addAllListener(p);
		p.Dtl1_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl1_asset_mng_typ.addAllListener(p);
		p.columnDtl1_asset_mng_typ.setListListener(p);
		p.columnDtl1_asset_mng_typ_nm.addAllListener(p);
		p.columnDtl1_asset_mng_typ_nm.setListListener(p);
		p.Dtl1_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl1_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl1_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl1_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl1_iv_itm_nm.addAllListener(p);
		p.columnDtl1_iv_itm_nm.setListListener(p);
		p.columnDtl1_sundry_itm_flg.addAllListener(p);
		p.columnDtl1_itm_purc_upri_cng_flg.addAllListener(p);
		p.columnDtl1_dscnt_itm_flg.addAllListener(p);
		p.columnDtl1_arr_skip_flg.addAllListener(p);
		p.columnDtl1_itm_pay_crryovr_times.addAllListener(p);
		p.columnDtl1_itm_pay_crryovr_times.setListListener(p);
		p.columnDtl1_stk_mng_typ.addAllListener(p);
		p.columnDtl1_stk_mng_typ.setListListener(p);
		p.columnDtl1_lot_mng_typ.addAllListener(p);
		p.columnDtl1_lot_mng_typ.setListListener(p);
		p.columnDtl1_lot_no_typ.addAllListener(p);
		p.columnDtl1_lot_no_typ.setListListener(p);
		p.columnDtl1_sublot_mng_typ.addAllListener(p);
		p.columnDtl1_sublot_mng_typ.setListListener(p);
		p.columnDtl1_sublot_no_typ.addAllListener(p);
		p.columnDtl1_sublot_no_typ.setListListener(p);
		p.columnDtl1_sno1_mng_typ.addAllListener(p);
		p.columnDtl1_sno1_mng_typ.setListListener(p);
		p.columnDtl1_sno2_mng_typ.addAllListener(p);
		p.columnDtl1_sno2_mng_typ.setListListener(p);
		p.columnDtl1_sno3_mng_typ.addAllListener(p);
		p.columnDtl1_sno3_mng_typ.setListListener(p);
		p.columnDtl1_sno4_mng_typ.addAllListener(p);
		p.columnDtl1_sno4_mng_typ.setListListener(p);
		p.Dtl1_lot_no_p_PPanel.columnLotNo_lot_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl1_lot_no_p_PPanel.columnLotNo_sublot_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl1_bp_lot_no.addAllListener(p);
		p.columnDtl1_bp_lot_no.setListListener(p);
		p.columnDtl1_ver_flg.addAllListener(p);
		p.columnDtl1_maker_cd.addAllListener(p);
		p.columnDtl1_maker_cd.setListListener(p);
		p.columnDtl1_maker_nm.addAllListener(p);
		p.columnDtl1_maker_nm.setListListener(p);
		p.columnDtl1_sppl_itm_cd.addAllListener(p);
		p.columnDtl1_sppl_itm_cd.setListListener(p);
		p.columnDtl1_sppl_itm_nm.addAllListener(p);
		p.columnDtl1_sppl_itm_nm.setListListener(p);
		p.columnDtl1_purc_typ.addAllListener(p);
		p.columnDtl1_purc_typ.setListListener(p);
		p.columnDtl1_purc_typ_nm.addAllListener(p);
		p.columnDtl1_purc_typ_nm.setListListener(p);
		p.columnDtl1_trd_unit_cd.addAllListener(p);
		p.columnDtl1_trd_unit_cd.setListListener(p);
		p.columnDtl1_trd_unit_nm.addAllListener(p);
		p.columnDtl1_trd_unit_nm.setListListener(p);
		p.columnDtl1_trd_unit_dec_place.addAllListener(p);
		p.columnDtl1_trd_unit_dec_place.setListListener(p);
		p.columnDtl1_trd_unit_rnd_typ.addAllListener(p);
		p.columnDtl1_trd_unit_rnd_typ.setListListener(p);
		p.columnDtl1_trd_unit_dmn_qty.addAllListener(p);
		p.columnDtl1_trd_unit_dmn_qty.setListListener(p);
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
		p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl1_repurc_obli_flg.addAllListener(p);
		p.columnDtl1_loc_mng_typ.addAllListener(p);
		p.columnDtl1_loc_mng_typ.setListListener(p);
		p.columnDtl1_wtax_rate.addAllListener(p);
		p.columnDtl1_wtax_rate.setListListener(p);
		p.columnDtl1_mfg_inst_no.addAllListener(p);
		p.columnDtl1_mfg_inst_no.setListListener(p);
		p.columnDtl1_po_no.addAllListener(p);
		p.columnDtl1_po_no.setListListener(p);
		p.columnDtl1_quality_typ.addAllListener(p);
		p.columnDtl1_quality_typ.setListListener(p);
		p.columnDtl1_quality_typ_nm.addAllListener(p);
		p.columnDtl1_quality_typ_nm.setListListener(p);
		p.columnDtl1_insp_flg.addAllListener(p);
		p.columnDtl1_stk_id_typ.addAllListener(p);
		p.columnDtl1_stk_id_typ.setListListener(p);
		p.columnDtl1_stk_id_typ_nm.addAllListener(p);
		p.columnDtl1_stk_id_typ_nm.setListListener(p);
		p.columnDtl1_purc_id_typ.addAllListener(p);
		p.columnDtl1_purc_id_typ.setListListener(p);
		p.columnDtl1_purc_id_typ_nm.addAllListener(p);
		p.columnDtl1_purc_id_typ_nm.setListListener(p);
		p.columnDtl1_gd_cd.addAllListener(p);
		p.columnDtl1_gd_cd.setListListener(p);
		p.columnDtl1_gd_nm.addAllListener(p);
		p.columnDtl1_gd_nm.setListListener(p);
		p.columnDtl1_stk_arrv_bp_cd.addAllListener(p);
		p.columnDtl1_stk_arrv_bp_cd.setListListener(p);
		p.columnDtl1_stk_arrv_bp_nm.addAllListener(p);
		p.columnDtl1_stk_arrv_bp_nm.setListListener(p);
		p.columnDtl1_purc_ret_rsn_cd.addAllListener(p);
		p.columnDtl1_purc_ret_rsn_cd.setListListener(p);
		p.columnDtl1_purc_ret_rsn_nm.addAllListener(p);
		p.columnDtl1_purc_ret_rsn_nm.setListListener(p);
		p.columnDtl1_ap_dpt_cd.addAllListener(p);
		p.columnDtl1_ap_dpt_cd.setListListener(p);
		p.columnDtl1_ap_dpt_nm.addAllListener(p);
		p.columnDtl1_ap_dpt_nm.setListListener(p);
		p.columnDtl1_pay_crryovr_times.addAllListener(p);
		p.columnDtl1_pay_crryovr_times.setListListener(p);
		p.columnDtl1_xpns_purc_flg.addAllListener(p);
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
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
		p.columnDtl1_cont_fctr_flg.addAllListener(p);
		p.columnDtl1_cont_fctr_rnd_typ.addAllListener(p);
		p.columnDtl1_cont_fctr_rnd_typ.setListListener(p);
		p.columnDtl1_cont_fctr_dec_place.addAllListener(p);
		p.columnDtl1_cont_fctr_dec_place.setListListener(p);
		p.columnDtl1_trd_d_rmrks.addAllListener(p);
		p.columnDtl1_trd_d_rmrks.setListListener(p);
		p.columnDtl1_intr_d_rmrks.addAllListener(p);
		p.columnDtl1_intr_d_rmrks.setListListener(p);
		p.columnDtl1_purc_ret_print_d_rmrks.addAllListener(p);
		p.columnDtl1_purc_ret_print_d_rmrks.setListListener(p);
		p.columnDtl1_sub_char1.addAllListener(p);
		p.columnDtl1_sub_char1.setListListener(p);
		p.columnDtl1_sub_char2.addAllListener(p);
		p.columnDtl1_sub_char2.setListListener(p);
		p.columnDtl1_sub_char3.addAllListener(p);
		p.columnDtl1_sub_char3.setListListener(p);
		p.columnDtl1_ref_arr_act_no.addAllListener(p);
		p.columnDtl1_ref_arr_act_no.setListListener(p);
		p.columnDtl1_ref_arr_act_rev.addAllListener(p);
		p.columnDtl1_ref_arr_act_rev.setListListener(p);
		p.columnDtl1_ref_purc_act_no.addAllListener(p);
		p.columnDtl1_ref_purc_act_no.setListListener(p);
		p.columnDtl1_ref_purc_act_seq.addAllListener(p);
		p.columnDtl1_ref_purc_act_seq.setListListener(p);
		p.columnDtl1_ref_purc_act_rev.addAllListener(p);
		p.columnDtl1_ref_purc_act_rev.setListListener(p);
		p.columnDtl1_ref_purc_act_d_no.addAllListener(p);
		p.columnDtl1_ref_purc_act_d_no.setListListener(p);
		p.columnDtl1_ref_purc_act_d_seq.addAllListener(p);
		p.columnDtl1_ref_purc_act_d_seq.setListListener(p);
		p.columnDtl1_purc_ret_schd_d_no.addAllListener(p);
		p.columnDtl1_purc_ret_schd_d_no.setListListener(p);
		p.columnDtl1_base_purc_ac_dt.addAllListener(p);
		p.columnDtl1_base_purc_ac_dt.setListListener(p);
		p.columnDtl1_base_ac_dt.addAllListener(p);
		p.columnDtl1_base_ac_dt.setListListener(p);
		p.columnDtl1_disp_seq.addAllListener(p);
		p.columnDtl1_disp_seq.setListListener(p);
	}

	/**
	 *  [Dtl1Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl1Btn(MSBDP_PurcRetSchdReg p) {
		p.Dtl1Btn_srch_upri.addAllListener(p);
		p.Dtl1Btn_srch_upri.setAPMethodName("doDtl1Btn_srch_upri");
		p.Dtl1Btn_radd.addAllListener(p);
		p.Dtl1Btn_radd.setAPMethodName("doDtl1Btn_radd");
		p.Dtl1Btn_rdel.addAllListener(p);
		p.Dtl1Btn_rdel.setAPMethodName("doDtl1Btn_rdel");
		p.Dtl1Btn_rcopy.addAllListener(p);
		p.Dtl1Btn_rcopy.setAPMethodName("doDtl1Btn_rcopy");
	}

	/**
	 *  [Dtl2Panel]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl2Panel(MSBDP_PurcRetSchdReg p) {
	}

	/**
	 *  [Dtl2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl2(MSBDP_PurcRetSchdReg p) {
		p.Dtl2Table.addAllListener(p);
		p.columnDtl2_dtl_peg_no.addAllListener(p);
		p.columnDtl2_dtl_peg_no.setListListener(p);
		p.columnDtl2_peg_no.addAllListener(p);
		p.columnDtl2_peg_no.setListListener(p);
		p.columnDtl2_purc_ret_loc_wg_cd.addAllListener(p);
		p.columnDtl2_purc_ret_loc_wg_cd.setListListener(p);
		p.columnDtl2_purc_ret_loc_wg_nm.addAllListener(p);
		p.columnDtl2_purc_ret_loc_wg_nm.setListListener(p);
		p.columnDtl2_purc_ret_loc_cd.addAllListener(p);
		p.columnDtl2_purc_ret_loc_cd.setListListener(p);
		p.columnDtl2_purc_ret_loc_nm.addAllListener(p);
		p.columnDtl2_purc_ret_loc_nm.setListListener(p);
		p.columnDtl2_purc_ret_sppl_cd.addAllListener(p);
		p.columnDtl2_purc_ret_sppl_cd.setListListener(p);
		p.columnDtl2_str_ln_tgt_flg.addAllListener(p);
		p.Dtl2_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl2_asset_mng_typ.addAllListener(p);
		p.columnDtl2_asset_mng_typ.setListListener(p);
		p.columnDtl2_asset_mng_typ_nm.addAllListener(p);
		p.columnDtl2_asset_mng_typ_nm.setListListener(p);
		p.Dtl2_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl2_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl2_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl2_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl2_iv_itm_nm.addAllListener(p);
		p.columnDtl2_iv_itm_nm.setListListener(p);
		p.columnDtl2_sundry_itm_flg.addAllListener(p);
		p.columnDtl2_stk_mng_typ.addAllListener(p);
		p.columnDtl2_stk_mng_typ.setListListener(p);
		p.columnDtl2_lot_mng_typ.addAllListener(p);
		p.columnDtl2_lot_mng_typ.setListListener(p);
		p.columnDtl2_lot_no_typ.addAllListener(p);
		p.columnDtl2_lot_no_typ.setListListener(p);
		p.columnDtl2_sublot_mng_typ.addAllListener(p);
		p.columnDtl2_sublot_mng_typ.setListListener(p);
		p.columnDtl2_sublot_no_typ.addAllListener(p);
		p.columnDtl2_sublot_no_typ.setListListener(p);
		p.columnDtl2_sno1_mng_typ.addAllListener(p);
		p.columnDtl2_sno1_mng_typ.setListListener(p);
		p.columnDtl2_sno2_mng_typ.addAllListener(p);
		p.columnDtl2_sno2_mng_typ.setListListener(p);
		p.columnDtl2_sno3_mng_typ.addAllListener(p);
		p.columnDtl2_sno3_mng_typ.setListListener(p);
		p.columnDtl2_sno4_mng_typ.addAllListener(p);
		p.columnDtl2_sno4_mng_typ.setListListener(p);
		p.columnDtl2_dscnt_itm_flg.addAllListener(p);
		p.Dtl2_lot_no_p_PPanel.columnLotNo_lot_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl2_lot_no_p_PPanel.columnLotNo_sublot_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl2_bp_lot_no.addAllListener(p);
		p.columnDtl2_bp_lot_no.setListListener(p);
		p.columnDtl2_ver_flg.addAllListener(p);
		p.columnDtl2_trd_unit_cd.addAllListener(p);
		p.columnDtl2_trd_unit_cd.setListListener(p);
		p.columnDtl2_trd_unit_nm.addAllListener(p);
		p.columnDtl2_trd_unit_nm.setListListener(p);
		p.columnDtl2_trd_unit_dec_place.addAllListener(p);
		p.columnDtl2_trd_unit_dec_place.setListListener(p);
		p.columnDtl2_trd_unit_rnd_typ.addAllListener(p);
		p.columnDtl2_trd_unit_rnd_typ.setListListener(p);
		p.columnDtl2_trd_unit_dmn_qty.addAllListener(p);
		p.columnDtl2_trd_unit_dmn_qty.setListListener(p);
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
		p.columnDtl2_quality_typ.addAllListener(p);
		p.columnDtl2_quality_typ.setListListener(p);
		p.columnDtl2_quality_typ_nm.addAllListener(p);
		p.columnDtl2_quality_typ_nm.setListListener(p);
		p.columnDtl2_stk_id_typ.addAllListener(p);
		p.columnDtl2_stk_id_typ.setListListener(p);
		p.columnDtl2_stk_id_typ_nm.addAllListener(p);
		p.columnDtl2_stk_id_typ_nm.setListListener(p);
		p.columnDtl2_gd_cd.addAllListener(p);
		p.columnDtl2_gd_cd.setListListener(p);
		p.columnDtl2_gd_nm.addAllListener(p);
		p.columnDtl2_gd_nm.setListListener(p);
		p.columnDtl2_stk_arrv_bp_cd.addAllListener(p);
		p.columnDtl2_stk_arrv_bp_cd.setListListener(p);
		p.columnDtl2_stk_arrv_bp_nm.addAllListener(p);
		p.columnDtl2_stk_arrv_bp_nm.setListListener(p);
		p.columnDtl2_cont_fctr_flg.addAllListener(p);
		p.columnDtl2_cont_fctr_rnd_typ.addAllListener(p);
		p.columnDtl2_cont_fctr_rnd_typ.setListListener(p);
		p.columnDtl2_cont_fctr_dec_place.addAllListener(p);
		p.columnDtl2_cont_fctr_dec_place.setListListener(p);
		p.columnDtl2_sub_char1.addAllListener(p);
		p.columnDtl2_sub_char1.setListListener(p);
		p.columnDtl2_sub_char2.addAllListener(p);
		p.columnDtl2_sub_char2.setListListener(p);
		p.columnDtl2_sub_char3.addAllListener(p);
		p.columnDtl2_sub_char3.setListListener(p);
		p.columnDtl2_ref_arr_act_no.addAllListener(p);
		p.columnDtl2_ref_arr_act_no.setListListener(p);
		p.columnDtl2_ref_arr_act_rev.addAllListener(p);
		p.columnDtl2_ref_arr_act_rev.setListListener(p);
		p.columnDtl2_ref_purc_act_io_no.addAllListener(p);
		p.columnDtl2_ref_purc_act_io_no.setListListener(p);
		p.columnDtl2_ref_purc_act_io_seq.addAllListener(p);
		p.columnDtl2_ref_purc_act_io_seq.setListListener(p);
		p.columnDtl2_purc_ret_schd_io_no.addAllListener(p);
		p.columnDtl2_purc_ret_schd_io_no.setListListener(p);
	}

	/**
	 *  [Dtl2Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl2Btn(MSBDP_PurcRetSchdReg p) {
		p.Dtl2Btn_radd.addAllListener(p);
		p.Dtl2Btn_radd.setAPMethodName("doDtl2Btn_radd");
		p.Dtl2Btn_rdel.addAllListener(p);
		p.Dtl2Btn_rdel.setAPMethodName("doDtl2Btn_rdel");
		p.Dtl2Btn_rcopy.addAllListener(p);
		p.Dtl2Btn_rcopy.setAPMethodName("doDtl2Btn_rcopy");
		p.Dtl2Btn_upd_dtl.addAllListener(p);
		p.Dtl2Btn_upd_dtl.setAPMethodName("doDtl2Btn_upd_dtl");
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBDP_PurcRetSchdReg p) {
		p.Btn_open_MSBDP0160.addAllListener(p);
		p.Btn_open_MSBDP0160.setAPMethodName("doBtn_open_MSBDP0160");
		p.Btn_ins.addAllListener(p);
		p.Btn_ins.setAPMethodName("doBtn_ins");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBDP_PurcRetSchdReg p) {
	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBDP_PurcRetSchdReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_srch_tgt_no.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_srch_arr_act.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_srch_purc_act.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_srch_purc_ret_schd.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [INS]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINS_Top(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [INS]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitINS_Fold(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [INS]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr1(MSBDP_PurcRetSchdReg p){
		p.Hdr1_trd_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr1_trd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_trd_ptn_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_purc_ret_schd_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_reg_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr1_schd_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr1_sppl_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr1_sppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_purc_upri_cng_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_subcon_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_repurc_obli_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_outsrc_upri_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_ap_dpt_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_mst_ap_dpt_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_pay_spot_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_sppl_pay_crryovr_times.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_sppl_addr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.ENABLE);
		p.Hdr1_sppl_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_sppl_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_sppl_iv_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_prnt_lcl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_asppl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_asppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_trd_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_trd_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_ptax_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_ptax_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_ptax_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_ptax_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_ptax_xrate_inpt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr1_prax_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr1_base_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_base_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_base_cur_upri_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_base_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_xrate_inpt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr1_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr1_xrate_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_purc_amt_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_calc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_cd_prio_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_trd_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_trd_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_ret_sppl_nm.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr1_ret_sppl_enable_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.ENABLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_cntry_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_cntry_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_cntct_psn_title.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_rcpt_iv_no.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_ref_rcpt_iv_no.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_purc_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr1_purc_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_def_purc_usr_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_def_purc_dpt_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_ap_dpt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_purc_dpt_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_purc_dpt_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_purc_ret_print_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_trd_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_tterm_cd1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_tterm_nm1.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_tterm_rmrks1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_tterm_cd2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_tterm_nm2.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_tterm_rmrks2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_tterm_cd3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_tterm_nm3.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_tterm_rmrks3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr1_pr_schd_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr1_ins_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_ins_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_ins_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_ins_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_upd_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_upd_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_ins_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_upd_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr1_upd_srv_req_no.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr2(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [INS]ステータスの[Dtl1Panel]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl1Panel(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [INS]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl1(MSBDP_PurcRetSchdReg p){
		p.columnDtl1_peg_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_cmpl_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_abort_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl1_purc_ret_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_sppl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_str_ln_tgt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_str_ln_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.columnDtl1_asset_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_asset_mng_typ_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl1_iv_itm_nm.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl1_sundry_itm_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_itm_purc_upri_cng_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_dscnt_itm_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_arr_skip_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_itm_pay_crryovr_times.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_stk_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_lot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_lot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_sublot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_sublot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_sno1_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_sno2_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_sno3_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_sno4_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_lot_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.ENABLE);
		p.Dtl1_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_bp_lot_no.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl1_ver_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_ver_no_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Dtl1_sno_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.Dtl1_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl1_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_maker_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl1_maker_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl1_sppl_itm_nm.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl1_purc_typ.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl1_purc_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl1_trd_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_dmn_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl1_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_base_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl1_ret_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl1_trd_upri_amt_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl1_repurc_obli_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl1_trd_cur_proc_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.columnDtl1_loc_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.ENABLE);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.ENABLE);
		p.Dtl1_base_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_proc_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_dscnt_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_proc_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_upri_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_dscnt_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_wtax_rate.putMode(p, INS, MCMode.ENABLE);
		p.Dtl1_wtax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_mfg_inst_no.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl1_po_no.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl1_quality_typ.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl1_quality_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_insp_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_stk_id_typ.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl1_stk_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_purc_id_typ.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl1_purc_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_gd_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl1_gd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_stk_arrv_bp_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl1_stk_arrv_bp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_rsn_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl1_purc_ret_rsn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_ap_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl1_ap_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_pay_crryovr_times.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl1_xpns_purc_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_bd_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.ENABLE);
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl1_bd_lot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_bd_lot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno1_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno2_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno3_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno4_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl1_purc_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.REQUIRED);
		p.Dtl1_purc_cont_fctr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Dtl1_std_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl1_cont_fctr_unit_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl1_std_cont_fctr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl1_cont_fctr_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_trd_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl1_intr_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl1_purc_ret_print_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl1_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl1_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl1_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl1_ref_arr_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_ref_arr_act_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_seq.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_ref_purc_act_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_d_seq.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl1_purc_ret_schd_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl1_base_purc_ac_dt.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl1_base_ac_dt.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl1_disp_seq.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Dtl1Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl1Btn(MSBDP_PurcRetSchdReg p){
		p.Dtl1Btn_Btn_open_MSBEP0500_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.ENABLE);
		p.Dtl1Btn_srch_upri.putMode(p, INS, MCMode.ENABLE);
		p.Dtl1Btn_radd.putMode(p, INS, MCMode.ENABLE);
		p.Dtl1Btn_rdel.putMode(p, INS, MCMode.ENABLE);
		p.Dtl1Btn_rcopy.putMode(p, INS, MCMode.ENABLE);
		p.Dtl1Btn_menu_move_p_PPanel.putStatus(INS, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);

	}

	/**
	 * [INS]ステータスの[Dtl2Panel]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl2Panel(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [INS]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl2(MSBDP_PurcRetSchdReg p){
		p.columnDtl2_dtl_peg_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_peg_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_purc_ret_loc_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_loc_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_loc_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl2_purc_ret_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_sppl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_str_ln_tgt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_str_ln_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.columnDtl2_asset_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_asset_mng_typ_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl2_iv_itm_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_sundry_itm_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_stk_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_lot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_lot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_sublot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_sublot_no_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_sno1_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_sno2_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_sno3_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_sno4_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_dscnt_itm_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_lot_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.REQUIRED);
		p.Dtl2_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_bp_lot_no.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl2_ver_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_ver_no_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Dtl2_sno_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl2_trd_unit_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl2_trd_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_dmn_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_trd_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl2_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_base_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl2_quality_typ.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl2_quality_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_stk_id_typ.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl2_stk_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_gd_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl2_gd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_stk_arrv_bp_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl2_stk_arrv_bp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_cont_fctr_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl2_purc_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.REQUIRED);
		p.Dtl2_purc_cont_fctr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Dtl2_std_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl2_std_cont_fctr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl2_cont_fctr_unit_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl2_cont_fctr_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_cont_fctr_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl2_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl2_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl2_ref_arr_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_ref_arr_act_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_ref_purc_act_io_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl2_ref_purc_act_io_seq.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl2_purc_ret_schd_io_no.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Dtl2Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl2Btn(MSBDP_PurcRetSchdReg p){
		p.Dtl2Btn_Btn_open_MSBEP0500_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.ENABLE);
		p.Dtl2Btn_radd.putMode(p, INS, MCMode.ENABLE);
		p.Dtl2Btn_rdel.putMode(p, INS, MCMode.ENABLE);
		p.Dtl2Btn_rcopy.putMode(p, INS, MCMode.ENABLE);
		p.Dtl2Btn_upd_dtl.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBDP_PurcRetSchdReg p){
		p.Btn_open_MSBDP0160.putMode(p, INS, MCMode.DISABLE);
		p.Btn_ins.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBDP_PurcRetSchdReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_srch_arr_act.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_srch_purc_act.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_srch_purc_ret_schd.putMode(p, FIX_I, MCMode.ENABLE);

	}

	/**
	 * [FIX_I]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Top(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [FIX_I]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Fold(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [FIX_I]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr1(MSBDP_PurcRetSchdReg p){
		p.Hdr1_trd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_trd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_trd_ptn_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_purc_ret_schd_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_reg_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_sppl_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_sppl_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_purc_upri_cng_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_subcon_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_repurc_obli_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_outsrc_upri_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_ap_dpt_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_mst_ap_dpt_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_pay_spot_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_sppl_pay_crryovr_times.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_sppl_addr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr1_sppl_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_sppl_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_sppl_iv_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_prnt_lcl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_asppl_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_asppl_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_trd_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_ptax_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_ptax_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_ptax_cur_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_ptax_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_ptax_xrate_inpt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_prax_xrate_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr1_base_cur_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_base_cur_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_base_cur_upri_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_base_cur_amt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_xrate_inpt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_xrate_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr1_xrate_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_purc_amt_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_calc_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_cd_prio_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_trd_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_trd_cur_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_ret_sppl_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_ret_sppl_enable_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_cntct_psn_title.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_rcpt_iv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_ref_rcpt_iv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_purc_usr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr1_def_purc_usr_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_def_purc_dpt_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_ap_dpt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_purc_dpt_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_purc_dpt_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_purc_ret_print_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_trd_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_tterm_cd1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_tterm_nm1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_tterm_rmrks1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_tterm_cd2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_tterm_nm2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_tterm_rmrks2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_tterm_cd3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_tterm_nm3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_tterm_rmrks3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_pr_schd_upd_cntr.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr1_ins_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_ins_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_ins_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_ins_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_upd_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_upd_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_ins_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_upd_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr1_upd_srv_req_no.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr2(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [FIX_I]ステータスの[Dtl1Panel]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl1Panel(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [FIX_I]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl1(MSBDP_PurcRetSchdReg p){
		p.columnDtl1_peg_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_cmpl_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_abort_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_sppl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_str_ln_tgt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_str_ln_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl1_asset_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_asset_mng_typ_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_iv_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_sundry_itm_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_itm_purc_upri_cng_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_dscnt_itm_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_arr_skip_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_itm_pay_crryovr_times.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_stk_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_lot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_lot_no_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_sublot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_sublot_no_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_sno1_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_sno2_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_sno3_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_sno4_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_lot_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl1_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_bp_lot_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_ver_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_ver_no_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Dtl1_sno_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl1_maker_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_maker_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_purc_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_purc_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_dmn_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl1_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_base_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl1_ret_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl1_trd_upri_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_repurc_obli_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl1_trd_cur_proc_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl1_loc_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_proc_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_dscnt_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_proc_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_upri_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_dscnt_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_wtax_rate.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl1_wtax_amt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_mfg_inst_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_po_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_quality_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_quality_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_insp_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_stk_id_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_stk_id_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_purc_id_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_purc_id_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_gd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_gd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_stk_arrv_bp_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_stk_arrv_bp_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_rsn_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_rsn_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_ap_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_ap_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_pay_crryovr_times.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_xpns_purc_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_bd_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl1_bd_lot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_bd_lot_no_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_no_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno1_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno2_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno3_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno4_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl1_purc_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Dtl1_purc_cont_fctr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Dtl1_std_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl1_cont_fctr_unit_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl1_std_cont_fctr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl1_cont_fctr_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_trd_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_intr_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_print_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_ref_arr_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_ref_arr_act_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_seq.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_ref_purc_act_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_d_seq.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl1_purc_ret_schd_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_base_purc_ac_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_base_ac_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl1_disp_seq.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[Dtl1Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl1Btn(MSBDP_PurcRetSchdReg p){
		p.Dtl1Btn_Btn_open_MSBEP0500_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Dtl1Btn_srch_upri.putMode(p, FIX_I, MCMode.DISABLE);
		p.Dtl1Btn_radd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Dtl1Btn_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.Dtl1Btn_rcopy.putMode(p, FIX_I, MCMode.DISABLE);
		p.Dtl1Btn_menu_move_p_PPanel.putStatus(FIX_I, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[Dtl2Panel]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl2Panel(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [FIX_I]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl2(MSBDP_PurcRetSchdReg p){
		p.columnDtl2_dtl_peg_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_peg_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_purc_ret_loc_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_loc_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_sppl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_str_ln_tgt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_str_ln_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl2_asset_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_asset_mng_typ_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl2_iv_itm_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_sundry_itm_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_stk_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_lot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_lot_no_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_sublot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_sublot_no_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_sno1_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_sno2_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_sno3_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_sno4_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_dscnt_itm_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_lot_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl2_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_bp_lot_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_ver_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_ver_no_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Dtl2_sno_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl2_trd_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_dmn_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_trd_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl2_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_base_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl2_quality_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_quality_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_stk_id_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_stk_id_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_gd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_gd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_stk_arrv_bp_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_stk_arrv_bp_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_cont_fctr_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl2_purc_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Dtl2_purc_cont_fctr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Dtl2_std_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl2_std_cont_fctr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl2_cont_fctr_unit_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl2_cont_fctr_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_cont_fctr_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_ref_arr_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_ref_arr_act_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_ref_purc_act_io_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl2_ref_purc_act_io_seq.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl2_purc_ret_schd_io_no.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[Dtl2Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl2Btn(MSBDP_PurcRetSchdReg p){
		p.Dtl2Btn_Btn_open_MSBEP0500_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Dtl2Btn_radd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Dtl2Btn_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.Dtl2Btn_rcopy.putMode(p, FIX_I, MCMode.DISABLE);
		p.Dtl2Btn_upd_dtl.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBDP_PurcRetSchdReg p){
		p.Btn_open_MSBDP0160.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBDP_PurcRetSchdReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch_arr_act.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_srch_purc_act.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_srch_purc_ret_schd.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr1(MSBDP_PurcRetSchdReg p){
		p.Hdr1_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_purc_ret_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_reg_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_purc_upri_cng_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_subcon_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_repurc_obli_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_outsrc_upri_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_ap_dpt_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_mst_ap_dpt_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_pay_spot_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_sppl_pay_crryovr_times.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_sppl_addr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr1_sppl_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_sppl_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_sppl_iv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_prnt_lcl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_asppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_asppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_trd_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_ptax_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ptax_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ptax_cur_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_ptax_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_ptax_xrate_inpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_prax_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr1_base_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_base_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_base_cur_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_base_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_xrate_inpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_xrate_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr1_xrate_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_purc_amt_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_calc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_cd_prio_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_trd_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_trd_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_ret_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ret_sppl_enable_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_cntry_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_cntry_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_cntct_psn_title.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_rcpt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ref_rcpt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_purc_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr1_def_purc_usr_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_def_purc_dpt_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_ap_dpt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_purc_dpt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_purc_dpt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_purc_ret_print_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_trd_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_tterm_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_tterm_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_tterm_rmrks1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_tterm_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_tterm_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_tterm_rmrks2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_tterm_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_tterm_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_tterm_rmrks3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_pr_schd_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr1_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr1_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr2(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [SRCH]ステータスの[Dtl1Panel]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl1Panel(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [SRCH]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl1(MSBDP_PurcRetSchdReg p){
		p.columnDtl1_peg_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_cmpl_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_abort_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_sppl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl1_str_ln_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl1_asset_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_asset_mng_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl1_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_iv_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_sundry_itm_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_itm_purc_upri_cng_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_dscnt_itm_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_arr_skip_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_itm_pay_crryovr_times.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_stk_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_lot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_lot_no_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_sublot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_sublot_no_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl1_lot_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl1_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_bp_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ver_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl1_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Dtl1_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl1_maker_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_maker_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_purc_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_purc_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_dmn_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl1_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl1_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl1_ret_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl1_trd_upri_amt_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_repurc_obli_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl1_trd_cur_proc_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl1_loc_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_proc_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_proc_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_wtax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl1_wtax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_mfg_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_quality_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_quality_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_insp_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_stk_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_stk_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_purc_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_purc_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_gd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_gd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_stk_arrv_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_stk_arrv_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ap_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ap_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_pay_crryovr_times.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_xpns_purc_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl1_bd_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl1_bd_lot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_bd_lot_no_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_no_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl1_purc_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Dtl1_purc_cont_fctr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Dtl1_std_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl1_cont_fctr_unit_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl1_std_cont_fctr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl1_cont_fctr_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_trd_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_intr_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_print_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ref_arr_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ref_arr_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_ref_purc_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_d_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_purc_ret_schd_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_base_purc_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_base_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_disp_seq.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Dtl1Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl1Btn(MSBDP_PurcRetSchdReg p){
		p.Dtl1Btn_Btn_open_MSBEP0500_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Dtl1Btn_srch_upri.putMode(p, SRCH, MCMode.DISABLE);
		p.Dtl1Btn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Dtl1Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Dtl1Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.Dtl1Btn_menu_move_p_PPanel.putStatus(SRCH, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Dtl2Panel]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl2Panel(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [SRCH]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl2(MSBDP_PurcRetSchdReg p){
		p.columnDtl2_dtl_peg_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_peg_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_purc_ret_loc_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_loc_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_sppl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl2_str_ln_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl2_asset_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_asset_mng_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl2_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl2_iv_itm_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_sundry_itm_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_stk_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_lot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_lot_no_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_sublot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_sublot_no_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_dscnt_itm_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl2_lot_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl2_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_bp_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ver_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl2_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Dtl2_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl2_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_dmn_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl2_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl2_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl2_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl2_quality_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_quality_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_stk_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_stk_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_gd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_gd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_stk_arrv_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_stk_arrv_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_cont_fctr_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl2_purc_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Dtl2_purc_cont_fctr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Dtl2_std_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl2_std_cont_fctr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl2_cont_fctr_unit_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl2_cont_fctr_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_cont_fctr_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ref_arr_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ref_arr_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ref_purc_act_io_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ref_purc_act_io_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_purc_ret_schd_io_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Dtl2Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl2Btn(MSBDP_PurcRetSchdReg p){
		p.Dtl2Btn_Btn_open_MSBEP0500_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Dtl2Btn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Dtl2Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Dtl2Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.Dtl2Btn_upd_dtl.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBDP_PurcRetSchdReg p){
		p.Btn_open_MSBDP0160.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBDP_PurcRetSchdReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch_arr_act.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_srch_purc_act.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_srch_purc_ret_schd.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr1(MSBDP_PurcRetSchdReg p){
		p.Hdr1_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_purc_ret_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_reg_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr1_schd_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr1_sppl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr1_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_purc_upri_cng_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_subcon_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_repurc_obli_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_outsrc_upri_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_ap_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_mst_ap_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_pay_spot_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_sppl_pay_crryovr_times.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_sppl_addr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.ENABLE);
		p.Hdr1_sppl_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_sppl_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_sppl_iv_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_prnt_lcl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_asppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_asppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_trd_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_ptax_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_ptax_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_ptax_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_ptax_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_ptax_xrate_inpt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr1_prax_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr1_base_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_base_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_base_cur_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_base_cur_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_xrate_inpt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr1_xrate_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.REQUIRED);
		p.Hdr1_xrate_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_purc_amt_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_calc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_cd_prio_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_trd_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_trd_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_ret_sppl_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr1_ret_sppl_enable_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.ENABLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_cntry_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_cntry_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_cntct_psn_title.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_rcpt_iv_no.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_ref_rcpt_iv_no.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_purc_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Hdr1_purc_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_def_purc_usr_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_def_purc_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_ap_dpt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_purc_dpt_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_purc_dpt_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_purc_ret_print_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_trd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_tterm_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_tterm_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_tterm_rmrks1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_tterm_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_tterm_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_tterm_rmrks2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_tterm_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_tterm_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_tterm_rmrks3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr1_pr_schd_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr1_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr1_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr2(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl1Panel]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl1Panel(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl1(MSBDP_PurcRetSchdReg p){
		p.columnDtl1_peg_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_cmpl_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_abort_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl1_purc_ret_loc_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl1_purc_ret_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_sppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl1_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.columnDtl1_asset_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_asset_mng_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl1_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl1_iv_itm_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl1_sundry_itm_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_itm_purc_upri_cng_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_dscnt_itm_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_arr_skip_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_itm_pay_crryovr_times.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_stk_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_lot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_lot_no_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_sublot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_sublot_no_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl1_lot_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.ENABLE);
		p.Dtl1_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_bp_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_ver_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl1_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Dtl1_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.Dtl1_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl1_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_maker_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_maker_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_sppl_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_purc_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl1_purc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl1_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_dmn_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl1_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl1_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl1_ret_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl1_trd_upri_amt_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl1_repurc_obli_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl1_trd_cur_proc_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.columnDtl1_loc_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.ENABLE);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.ENABLE);
		p.Dtl1_base_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_proc_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_dscnt_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_proc_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_dscnt_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_wtax_rate.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl1_wtax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_mfg_inst_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_po_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_quality_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl1_quality_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_insp_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_stk_id_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl1_stk_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_purc_id_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl1_purc_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_gd_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl1_gd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_stk_arrv_bp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl1_stk_arrv_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_rsn_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl1_purc_ret_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_ap_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl1_ap_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_pay_crryovr_times.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl1_xpns_purc_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl1_bd_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.ENABLE);
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl1_bd_lot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_bd_lot_no_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_no_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl1_purc_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.REQUIRED);
		p.Dtl1_purc_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Dtl1_std_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl1_cont_fctr_unit_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl1_std_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl1_cont_fctr_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_trd_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_intr_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_purc_ret_print_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl1_ref_arr_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_ref_arr_act_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_ref_purc_act_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_d_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl1_purc_ret_schd_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl1_base_purc_ac_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl1_base_ac_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl1_disp_seq.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Dtl1Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl1Btn(MSBDP_PurcRetSchdReg p){
		p.Dtl1Btn_Btn_open_MSBEP0500_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.ENABLE);
		p.Dtl1Btn_srch_upri.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl1Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl1Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl1Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl1Btn_menu_move_p_PPanel.putStatus(UPD, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl2Panel]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl2Panel(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl2(MSBDP_PurcRetSchdReg p){
		p.columnDtl2_dtl_peg_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_peg_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_purc_ret_loc_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_loc_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl2_purc_ret_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_sppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl2_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.columnDtl2_asset_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_asset_mng_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl2_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl2_iv_itm_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_sundry_itm_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_stk_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_lot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_lot_no_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_sublot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_sublot_no_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_dscnt_itm_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl2_lot_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.REQUIRED);
		p.Dtl2_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_bp_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl2_ver_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl2_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Dtl2_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl2_trd_unit_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl2_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_dmn_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl2_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl2_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl2_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl2_quality_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl2_quality_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_stk_id_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl2_stk_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_gd_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl2_gd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_stk_arrv_bp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl2_stk_arrv_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_cont_fctr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl2_purc_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.REQUIRED);
		p.Dtl2_purc_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Dtl2_std_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl2_std_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl2_cont_fctr_unit_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl2_cont_fctr_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_cont_fctr_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl2_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl2_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl2_ref_arr_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ref_arr_act_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ref_purc_act_io_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl2_ref_purc_act_io_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl2_purc_ret_schd_io_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Dtl2Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl2Btn(MSBDP_PurcRetSchdReg p){
		p.Dtl2Btn_Btn_open_MSBEP0500_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.ENABLE);
		p.Dtl2Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl2Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl2Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl2Btn_upd_dtl.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBDP_PurcRetSchdReg p){
		p.Btn_open_MSBDP0160.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_ins.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBDP_PurcRetSchdReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_srch_arr_act.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_srch_purc_act.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_srch_purc_ret_schd.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr1(MSBDP_PurcRetSchdReg p){
		p.Hdr1_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_trd_ptn_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_purc_ret_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_reg_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_sppl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_sppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_purc_upri_cng_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_subcon_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_repurc_obli_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_outsrc_upri_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_ap_dpt_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_mst_ap_dpt_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_pay_spot_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_sppl_pay_crryovr_times.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_sppl_addr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr1_sppl_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_sppl_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_sppl_iv_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_prnt_lcl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_asppl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_asppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_trd_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_ptax_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_ptax_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_ptax_cur_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_ptax_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_ptax_xrate_inpt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_prax_xrate_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr1_base_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_base_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_base_cur_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_base_cur_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_xrate_inpt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_xrate_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr1_xrate_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_purc_amt_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_calc_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_cd_prio_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_trd_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_trd_cur_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_ret_sppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_ret_sppl_enable_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_cntct_psn_title.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_rcpt_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_ref_rcpt_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_purc_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr1_def_purc_usr_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_def_purc_dpt_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_ap_dpt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_purc_dpt_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_purc_dpt_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_purc_ret_print_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_trd_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_tterm_cd1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_tterm_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_tterm_rmrks1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_tterm_cd2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_tterm_nm2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_tterm_rmrks2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_tterm_cd3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_tterm_nm3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_tterm_rmrks3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_pr_schd_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr1_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr1_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr2(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [FIX_U]ステータスの[Dtl1Panel]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl1Panel(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [FIX_U]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl1(MSBDP_PurcRetSchdReg p){
		p.columnDtl1_peg_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_cmpl_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_abort_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_sppl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_str_ln_tgt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl1_str_ln_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl1_asset_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_asset_mng_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl1_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_iv_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_sundry_itm_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_itm_purc_upri_cng_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_dscnt_itm_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_arr_skip_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_itm_pay_crryovr_times.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_stk_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_lot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_lot_no_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_sublot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_sublot_no_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl1_lot_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl1_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_bp_lot_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_ver_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl1_ver_no_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Dtl1_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl1_maker_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_maker_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_purc_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_purc_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_dmn_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl1_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_base_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl1_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl1_ret_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl1_trd_upri_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_repurc_obli_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl1_trd_cur_proc_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl1_loc_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_proc_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_dscnt_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_proc_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_dscnt_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_wtax_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl1_wtax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_mfg_inst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_po_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_quality_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_quality_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_insp_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_stk_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_stk_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_purc_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_purc_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_gd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_gd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_stk_arrv_bp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_stk_arrv_bp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_ap_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_ap_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_pay_crryovr_times.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_xpns_purc_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl1_bd_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl1_bd_lot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_bd_lot_no_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_no_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl1_purc_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Dtl1_purc_cont_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Dtl1_std_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl1_cont_fctr_unit_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl1_std_cont_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl1_cont_fctr_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_trd_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_intr_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_print_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_ref_arr_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_ref_arr_act_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_ref_purc_act_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_d_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl1_purc_ret_schd_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_base_purc_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_base_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl1_disp_seq.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Dtl1Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl1Btn(MSBDP_PurcRetSchdReg p){
		p.Dtl1Btn_Btn_open_MSBEP0500_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Dtl1Btn_srch_upri.putMode(p, FIX_U, MCMode.DISABLE);
		p.Dtl1Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Dtl1Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Dtl1Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Dtl1Btn_menu_move_p_PPanel.putStatus(FIX_U, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Dtl2Panel]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl2Panel(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [FIX_U]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl2(MSBDP_PurcRetSchdReg p){
		p.columnDtl2_dtl_peg_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_peg_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_purc_ret_loc_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_loc_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_sppl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_str_ln_tgt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl2_str_ln_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl2_asset_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_asset_mng_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl2_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl2_iv_itm_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_sundry_itm_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_stk_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_lot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_lot_no_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_sublot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_sublot_no_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_dscnt_itm_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl2_lot_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl2_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_bp_lot_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_ver_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl2_ver_no_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Dtl2_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl2_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_dmn_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl2_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl2_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_base_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl2_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl2_quality_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_quality_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_stk_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_stk_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_gd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_gd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_stk_arrv_bp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_stk_arrv_bp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_cont_fctr_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl2_purc_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Dtl2_purc_cont_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Dtl2_std_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl2_std_cont_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl2_cont_fctr_unit_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl2_cont_fctr_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_cont_fctr_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_ref_arr_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_ref_arr_act_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_ref_purc_act_io_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl2_ref_purc_act_io_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl2_purc_ret_schd_io_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Dtl2Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl2Btn(MSBDP_PurcRetSchdReg p){
		p.Dtl2Btn_Btn_open_MSBEP0500_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Dtl2Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Dtl2Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Dtl2Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Dtl2Btn_upd_dtl.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBDP_PurcRetSchdReg p){
		p.Btn_open_MSBDP0160.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBDP_PurcRetSchdReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch_arr_act.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_srch_purc_act.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_srch_purc_ret_schd.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr1(MSBDP_PurcRetSchdReg p){
		p.Hdr1_trd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_trd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_trd_ptn_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_purc_ret_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_reg_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_sppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_sppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_purc_upri_cng_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_subcon_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_repurc_obli_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_outsrc_upri_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_ap_dpt_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_mst_ap_dpt_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_pay_spot_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_sppl_pay_crryovr_times.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_sppl_addr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr1_sppl_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_sppl_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_sppl_iv_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_prnt_lcl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_asppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_asppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_trd_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_ptax_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_ptax_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_ptax_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_ptax_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_ptax_xrate_inpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_prax_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr1_base_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_base_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_base_cur_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_base_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_xrate_inpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr1_xrate_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_purc_amt_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_calc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_cd_prio_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_trd_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_trd_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_ret_sppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_ret_sppl_enable_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_cntry_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_cntry_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_cntct_psn_title.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_rcpt_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_ref_rcpt_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_purc_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr1_def_purc_usr_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_def_purc_dpt_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_ap_dpt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_purc_dpt_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_purc_dpt_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_purc_ret_print_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_trd_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_tterm_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_tterm_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_tterm_rmrks1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_tterm_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_tterm_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_tterm_rmrks2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_tterm_cd3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_tterm_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_tterm_rmrks3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_pr_schd_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr1_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr1_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr2(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl1Panel]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl1Panel(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl1(MSBDP_PurcRetSchdReg p){
		p.columnDtl1_peg_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_cmpl_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_abort_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_sppl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_str_ln_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_str_ln_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl1_asset_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_asset_mng_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_iv_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_sundry_itm_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_itm_purc_upri_cng_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_dscnt_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_arr_skip_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_itm_pay_crryovr_times.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_stk_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_lot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_lot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_sublot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_sublot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_lot_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl1_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_bp_lot_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ver_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Dtl1_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl1_maker_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_maker_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_purc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_purc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_dmn_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl1_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl1_ret_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl1_trd_upri_amt_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_repurc_obli_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl1_trd_cur_proc_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl1_loc_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_proc_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_dscnt_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_proc_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_upri_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_dscnt_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_wtax_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl1_wtax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_mfg_inst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_po_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_quality_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_quality_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_insp_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_stk_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_stk_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_purc_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_purc_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_gd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_gd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_stk_arrv_bp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_stk_arrv_bp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ap_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ap_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_pay_crryovr_times.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_xpns_purc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_bd_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl1_bd_lot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_bd_lot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl1_purc_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Dtl1_purc_cont_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Dtl1_std_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl1_cont_fctr_unit_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl1_std_cont_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl1_cont_fctr_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_trd_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_intr_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_print_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ref_arr_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ref_arr_act_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_ref_purc_act_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_d_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl1_purc_ret_schd_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_base_purc_ac_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_base_ac_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl1_disp_seq.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Dtl1Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl1Btn(MSBDP_PurcRetSchdReg p){
		p.Dtl1Btn_Btn_open_MSBEP0500_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Dtl1Btn_srch_upri.putMode(p, DEL, MCMode.DISABLE);
		p.Dtl1Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Dtl1Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Dtl1Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Dtl1Btn_menu_move_p_PPanel.putStatus(DEL, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Dtl2Panel]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl2Panel(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl2(MSBDP_PurcRetSchdReg p){
		p.columnDtl2_dtl_peg_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_peg_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_purc_ret_loc_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_loc_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_sppl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_str_ln_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_str_ln_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl2_asset_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_asset_mng_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl2_iv_itm_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_sundry_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_stk_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_lot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_lot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_sublot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_sublot_no_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_dscnt_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_lot_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl2_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_bp_lot_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ver_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Dtl2_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl2_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_dmn_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl2_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl2_quality_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_quality_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_stk_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_stk_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_gd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_gd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_stk_arrv_bp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_stk_arrv_bp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_cont_fctr_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl2_purc_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Dtl2_purc_cont_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Dtl2_std_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl2_std_cont_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl2_cont_fctr_unit_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl2_cont_fctr_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_cont_fctr_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ref_arr_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ref_arr_act_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ref_purc_act_io_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl2_ref_purc_act_io_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl2_purc_ret_schd_io_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Dtl2Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl2Btn(MSBDP_PurcRetSchdReg p){
		p.Dtl2Btn_Btn_open_MSBEP0500_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Dtl2Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Dtl2Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Dtl2Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Dtl2Btn_upd_dtl.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBDP_PurcRetSchdReg p){
		p.Btn_open_MSBDP0160.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_ins.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBDP_PurcRetSchdReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch_arr_act.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_srch_purc_act.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_srch_purc_ret_schd.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Top(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [FIX_D]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Fold(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr1(MSBDP_PurcRetSchdReg p){
		p.Hdr1_trd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_trd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_trd_ptn_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_purc_ret_schd_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_reg_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_schd_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_sppl_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_sppl_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_purc_upri_cng_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_subcon_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_repurc_obli_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_outsrc_upri_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_ap_dpt_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_mst_ap_dpt_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_pay_spot_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_sppl_pay_crryovr_times.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_sppl_addr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr1_sppl_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_sppl_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_sppl_iv_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_prnt_lcl_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_asppl_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_asppl_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_upri_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_trd_cur_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_ptax_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_ptax_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_ptax_cur_upri_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_ptax_cur_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_ptax_xrate_inpt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_prax_xrate_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr1_base_cur_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_base_cur_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_base_cur_upri_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_base_cur_amt_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_xrate_inpt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_xrate_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr1_xrate_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_purc_amt_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_calc_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_cd_prio_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_trd_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_trd_cur_inc_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_ret_sppl_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_ret_sppl_enable_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_cntct_psn_title.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_rcpt_iv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_ref_rcpt_iv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_purc_usr_dpt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr1_def_purc_usr_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_def_purc_dpt_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_ap_dpt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_purc_dpt_wg_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_purc_dpt_wg_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_purc_ret_print_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_trd_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_tterm_cd1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_tterm_nm1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_tterm_rmrks1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_tterm_cd2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_tterm_nm2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_tterm_rmrks2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_tterm_cd3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_tterm_nm3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_tterm_rmrks3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_pr_schd_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr1_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr1_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr2(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [FIX_D]ステータスの[Dtl1Panel]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl1Panel(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [FIX_D]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl1(MSBDP_PurcRetSchdReg p){
		p.columnDtl1_peg_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_cmpl_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_abort_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_wg_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_wg_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_sppl_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_str_ln_tgt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_str_ln_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl1_asset_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_asset_mng_typ_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_itm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_iv_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_sundry_itm_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_itm_purc_upri_cng_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_dscnt_itm_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_arr_skip_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_itm_pay_crryovr_times.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_stk_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_lot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_lot_no_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_sublot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_sublot_no_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_sno1_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_sno2_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_sno3_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_sno4_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_lot_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl1_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_bp_lot_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ver_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_ver_no_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Dtl1_sno_wrk_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl1_maker_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_maker_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_purc_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_purc_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_dmn_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl1_base_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_base_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_base_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl1_ret_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl1_trd_upri_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_repurc_obli_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl1_trd_cur_proc_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl1_loc_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_proc_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_dscnt_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_proc_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_upri_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_dscnt_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_wtax_rate.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl1_wtax_amt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_mfg_inst_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_po_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_quality_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_quality_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_insp_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_stk_id_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_stk_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_purc_id_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_purc_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_gd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_gd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_stk_arrv_bp_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_stk_arrv_bp_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_rsn_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_rsn_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ap_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ap_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_pay_crryovr_times.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_xpns_purc_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_bd_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl1_bd_lot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_bd_lot_no_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_no_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno1_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno2_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno3_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno4_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl1_purc_cont_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Dtl1_purc_cont_fctr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Dtl1_std_cont_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl1_cont_fctr_unit_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl1_std_cont_fctr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl1_cont_fctr_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_trd_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_intr_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_print_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ref_arr_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ref_arr_act_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_ref_purc_act_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_d_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl1_purc_ret_schd_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_base_purc_ac_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_base_ac_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl1_disp_seq.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Dtl1Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl1Btn(MSBDP_PurcRetSchdReg p){
		p.Dtl1Btn_Btn_open_MSBEP0500_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Dtl1Btn_srch_upri.putMode(p, FIX_D, MCMode.DISABLE);
		p.Dtl1Btn_radd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Dtl1Btn_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.Dtl1Btn_rcopy.putMode(p, FIX_D, MCMode.DISABLE);
		p.Dtl1Btn_menu_move_p_PPanel.putStatus(FIX_D, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[Dtl2Panel]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl2Panel(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [FIX_D]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl2(MSBDP_PurcRetSchdReg p){
		p.columnDtl2_dtl_peg_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_peg_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_purc_ret_loc_wg_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_loc_wg_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_sppl_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_str_ln_tgt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_str_ln_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl2_asset_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_asset_mng_typ_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_itm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl2_iv_itm_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_sundry_itm_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_stk_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_lot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_lot_no_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_sublot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_sublot_no_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_sno1_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_sno2_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_sno3_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_sno4_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_dscnt_itm_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_lot_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl2_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_bp_lot_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_ver_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_ver_no_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Dtl2_sno_wrk_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl2_trd_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_dmn_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_trd_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl2_base_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_base_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_base_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl2_quality_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_quality_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_stk_id_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_stk_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_gd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_gd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_stk_arrv_bp_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_stk_arrv_bp_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_cont_fctr_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl2_purc_cont_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Dtl2_purc_cont_fctr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Dtl2_std_cont_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl2_std_cont_fctr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl2_cont_fctr_unit_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl2_cont_fctr_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_cont_fctr_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_ref_arr_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_ref_arr_act_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_ref_purc_act_io_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl2_ref_purc_act_io_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl2_purc_ret_schd_io_no.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Dtl2Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl2Btn(MSBDP_PurcRetSchdReg p){
		p.Dtl2Btn_Btn_open_MSBEP0500_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Dtl2Btn_radd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Dtl2Btn_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.Dtl2Btn_rcopy.putMode(p, FIX_D, MCMode.DISABLE);
		p.Dtl2Btn_upd_dtl.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBDP_PurcRetSchdReg p){
		p.Btn_open_MSBDP0160.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBDP_PurcRetSchdReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch_tgt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch_arr_act.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_srch_purc_act.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_srch_purc_ret_schd.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [REF]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr1(MSBDP_PurcRetSchdReg p){
		p.Hdr1_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_purc_ret_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_reg_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_purc_upri_cng_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_subcon_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_repurc_obli_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_outsrc_upri_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_ap_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_mst_ap_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_pay_spot_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_sppl_pay_crryovr_times.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_sppl_addr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr1_sppl_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_sppl_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_sppl_iv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_prnt_lcl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_asppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_asppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_trd_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_trd_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_ptax_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_ptax_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_ptax_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_ptax_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_ptax_xrate_inpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_prax_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr1_base_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_base_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_base_cur_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_base_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_xrate_inpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_xrate_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0420.MAUBP_Xrate_H.READ_ONLY);
		p.Hdr1_xrate_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_purc_amt_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_calc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_purc_tax_cd_prio_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_trd_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_trd_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr1_ret_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_ret_sppl_enable_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_cntry_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_cntry_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_ret_sppl_cntct_psn_title.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_rcpt_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_ref_rcpt_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_purc_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr1_def_purc_usr_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_def_purc_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_ap_dpt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_purc_dpt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_purc_dpt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_purc_ret_print_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_trd_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_tterm_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_tterm_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_tterm_rmrks1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_tterm_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_tterm_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_tterm_rmrks2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_tterm_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_tterm_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_tterm_rmrks3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_pr_schd_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr1_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr1_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr2(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [REF]ステータスの[Dtl1Panel]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl1Panel(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [REF]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl1(MSBDP_PurcRetSchdReg p){
		p.columnDtl1_peg_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_cmpl_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_abort_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_sppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_str_ln_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl1_asset_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_asset_mng_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl1_iv_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_sundry_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_itm_purc_upri_cng_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_dscnt_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_arr_skip_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_itm_pay_crryovr_times.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_stk_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_lot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_sublot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_lot_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl1_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_bp_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ver_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Dtl1_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl1_maker_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_maker_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_sppl_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_purc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_purc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_dmn_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_trd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl1_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl1_ret_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl1_trd_upri_amt_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_repurc_obli_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl1_trd_cur_proc_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl1_loc_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_proc_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_dscnt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_proc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_proc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_wtax_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl1_wtax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_mfg_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_quality_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_quality_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_insp_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_stk_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_stk_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_purc_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_purc_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_gd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_gd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_stk_arrv_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_stk_arrv_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ap_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ap_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_pay_crryovr_times.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_xpns_purc_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_bd_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnDtl1_bd_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_bd_lot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_bd_sublot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_bd_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl1_purc_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Dtl1_purc_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Dtl1_std_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl1_cont_fctr_unit_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.Dtl1_std_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnDtl1_cont_fctr_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_cont_fctr_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_trd_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_intr_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_purc_ret_print_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ref_arr_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ref_arr_act_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_ref_purc_act_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_ref_purc_act_d_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl1_purc_ret_schd_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_base_purc_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_base_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl1_disp_seq.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Dtl1Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl1Btn(MSBDP_PurcRetSchdReg p){
		p.Dtl1Btn_Btn_open_MSBEP0500_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Dtl1Btn_srch_upri.putMode(p, REF, MCMode.DISABLE);
		p.Dtl1Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Dtl1Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Dtl1Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Dtl1Btn_menu_move_p_PPanel.putStatus(REF, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);

	}

	/**
	 * [REF]ステータスの[Dtl2Panel]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl2Panel(MSBDP_PurcRetSchdReg p){

	}

	/**
	 * [REF]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl2(MSBDP_PurcRetSchdReg p){
		p.columnDtl2_dtl_peg_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_peg_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_purc_ret_loc_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_loc_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_purc_ret_sppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_str_ln_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl2_asset_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_asset_mng_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl2_iv_itm_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_sundry_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_stk_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_lot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_sublot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_dscnt_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_lot_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl2_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_bp_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ver_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Dtl2_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl2_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_dmn_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_trd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl2_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl2_quality_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_quality_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_stk_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_stk_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_gd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_gd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_stk_arrv_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_stk_arrv_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_cont_fctr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl2_purc_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5300.MAUBP_PurcContQty_D.READ_ONLY);
		p.Dtl2_purc_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5330.MAUBP_PurcContFctr_D.READ_ONLY);
		p.Dtl2_std_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl2_std_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl2_cont_fctr_unit_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl2_cont_fctr_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_cont_fctr_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ref_arr_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ref_arr_act_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ref_purc_act_io_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl2_ref_purc_act_io_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl2_purc_ret_schd_io_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Dtl2Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl2Btn(MSBDP_PurcRetSchdReg p){
		p.Dtl2Btn_Btn_open_MSBEP0500_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Dtl2Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Dtl2Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Dtl2Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Dtl2Btn_upd_dtl.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBDP_PurcRetSchdReg p){
		p.Btn_open_MSBDP0160.putMode(p, REF, MCMode.DISABLE);
		p.Btn_ins.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBDP_PurcRetSchdReg p){

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
		MSBDP_PurcRetSchdReg_MC.setTableConfigDtl1((MSBDP_PurcRetSchdReg)this);
		MSBDP_PurcRetSchdReg_MC.setTableConfigDtl2((MSBDP_PurcRetSchdReg)this);
	}

	/**
	 * [Dtl1]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl1(MSBDP_PurcRetSchdReg p) {
		p.columnDtl1_peg_no.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.peg_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_peg_no);
		p.columnDtl1_cmpl_flg.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.cmpl_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_cmpl_flg);
		p.columnDtl1_abort_flg.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.abort_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_abort_flg);
		p.columnDtl1_purc_ret_loc_wg_cd.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.purc_ret_loc_wg_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_ret_loc_wg_cd);
		p.columnDtl1_purc_ret_loc_wg_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.purc_ret_loc_wg_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_ret_loc_wg_nm);
		p.columnDtl1_purc_ret_loc_cd.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.purc_ret_loc_cd_META);
		p.columnDtl1_purc_ret_loc_cd.setListType(MCListType.STRICT);
		p.columnDtl1_purc_ret_loc_cd.addLinkBeans(p.columnDtl1_purc_ret_loc_wg_cd,p.columnDtl1_purc_ret_loc_wg_nm,p.columnDtl1_purc_ret_loc_nm,p.columnDtl1_str_ln_tgt_flg,p.columnDtl1_purc_ret_sppl_cd,p.columnDtl1_loc_mng_typ);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_ret_loc_cd);
		p.columnDtl1_purc_ret_loc_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.purc_ret_loc_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_ret_loc_nm);
		p.columnDtl1_purc_ret_sppl_cd.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.purc_ret_sppl_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_ret_sppl_cd);
		p.columnDtl1_str_ln_tgt_flg.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.str_ln_tgt_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_str_ln_tgt_flg);
		p.Dtl1Table.addTable(p.Dtl1_str_ln_p_PPanel.StrLnTable);
		p.Dtl1_str_ln_p_PPanel.columnStrLn_str_ln_cd.setLinkBeans(p.columnDtl1_str_ln_nm);
		p.columnDtl1_asset_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.asset_mng_typ_META);
		p.columnDtl1_asset_mng_typ.addLinkBeans(p.columnDtl1_asset_mng_typ_nm);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_asset_mng_typ);
		p.columnDtl1_asset_mng_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.asset_mng_typ_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_asset_mng_typ_nm);
		p.Dtl1Table.addTable(p.Dtl1_itm_p_PPanel.ItmTable);
		p.Dtl1_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtl1_sundry_itm_flg, p.columnDtl1_itm_nm, p.columnDtl1_itm_sub1, p.columnDtl1_itm_sub2, p.columnDtl1_itm_sub3, p.columnDtl1_lot_mng_typ, p.columnDtl1_lot_no_typ, p.columnDtl1_sublot_mng_typ, p.columnDtl1_sublot_no_typ, p.columnDtl1_sno1_mng_typ, p.columnDtl1_sno2_mng_typ, p.columnDtl1_sno3_mng_typ, p.columnDtl1_sno4_mng_typ, p.columnDtl1_itm_purc_upri_cng_flg, p.columnDtl1_dscnt_itm_flg, p.columnDtl1_arr_skip_flg, p.columnDtl1_ver_flg, p.columnDtl1_stk_mng_typ, p.columnDtl1_base_unit_cd, p.columnDtl1_base_unit_nm, p.columnDtl1_base_unit_dec_place, p.columnDtl1_base_unit_rnd_typ, p.columnDtl1_cont_fctr_flg, p.columnDtl1_std_cont_fctr, p.columnDtl1_cont_fctr_unit_cd, p.columnDtl1_cont_fctr_unit_nm, p.columnDtl1_cont_fctr_rnd_typ, p.columnDtl1_cont_fctr_dec_place, p.columnDtl1_asset_mng_typ, p.columnDtl1_wtax_rate, p.columnDtl1_itm_pay_crryovr_times, p.columnDtl1_maker_cd, p.columnDtl1_maker_nm, p.columnDtl1_trd_unit_cd);
		p.Dtl1_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtl1_sundry_itm_flg, p.columnDtl1_itm_nm, p.columnDtl1_itm_sub2, p.columnDtl1_itm_sub3, p.columnDtl1_lot_mng_typ, p.columnDtl1_lot_no_typ, p.columnDtl1_sublot_mng_typ, p.columnDtl1_sublot_no_typ, p.columnDtl1_sno1_mng_typ, p.columnDtl1_sno2_mng_typ, p.columnDtl1_sno3_mng_typ, p.columnDtl1_sno4_mng_typ, p.columnDtl1_itm_purc_upri_cng_flg, p.columnDtl1_dscnt_itm_flg, p.columnDtl1_arr_skip_flg, p.columnDtl1_ver_flg, p.columnDtl1_stk_mng_typ, p.columnDtl1_base_unit_cd, p.columnDtl1_base_unit_nm, p.columnDtl1_base_unit_dec_place, p.columnDtl1_base_unit_rnd_typ, p.columnDtl1_cont_fctr_flg, p.columnDtl1_std_cont_fctr, p.columnDtl1_cont_fctr_unit_cd, p.columnDtl1_cont_fctr_unit_nm, p.columnDtl1_cont_fctr_rnd_typ, p.columnDtl1_cont_fctr_dec_place, p.columnDtl1_asset_mng_typ, p.columnDtl1_wtax_rate, p.columnDtl1_itm_pay_crryovr_times, p.columnDtl1_maker_cd, p.columnDtl1_maker_nm, p.columnDtl1_trd_unit_cd);
		p.Dtl1_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtl1_sundry_itm_flg, p.columnDtl1_itm_nm, p.columnDtl1_itm_sub3, p.columnDtl1_lot_mng_typ, p.columnDtl1_lot_no_typ, p.columnDtl1_sublot_mng_typ, p.columnDtl1_sublot_no_typ, p.columnDtl1_sno1_mng_typ, p.columnDtl1_sno2_mng_typ, p.columnDtl1_sno3_mng_typ, p.columnDtl1_sno4_mng_typ, p.columnDtl1_itm_purc_upri_cng_flg, p.columnDtl1_dscnt_itm_flg, p.columnDtl1_arr_skip_flg, p.columnDtl1_ver_flg, p.columnDtl1_stk_mng_typ, p.columnDtl1_base_unit_cd, p.columnDtl1_base_unit_nm, p.columnDtl1_base_unit_dec_place, p.columnDtl1_base_unit_rnd_typ, p.columnDtl1_cont_fctr_flg, p.columnDtl1_std_cont_fctr, p.columnDtl1_cont_fctr_unit_cd, p.columnDtl1_cont_fctr_unit_nm, p.columnDtl1_cont_fctr_rnd_typ, p.columnDtl1_cont_fctr_dec_place, p.columnDtl1_asset_mng_typ, p.columnDtl1_wtax_rate, p.columnDtl1_itm_pay_crryovr_times, p.columnDtl1_maker_cd, p.columnDtl1_maker_nm, p.columnDtl1_trd_unit_cd);
		p.Dtl1_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtl1_sundry_itm_flg, p.columnDtl1_itm_nm, p.columnDtl1_lot_mng_typ, p.columnDtl1_lot_no_typ, p.columnDtl1_sublot_mng_typ, p.columnDtl1_sublot_no_typ, p.columnDtl1_sno1_mng_typ, p.columnDtl1_sno2_mng_typ, p.columnDtl1_sno3_mng_typ, p.columnDtl1_sno4_mng_typ, p.columnDtl1_itm_purc_upri_cng_flg, p.columnDtl1_dscnt_itm_flg, p.columnDtl1_arr_skip_flg, p.columnDtl1_ver_flg, p.columnDtl1_stk_mng_typ, p.columnDtl1_base_unit_cd, p.columnDtl1_base_unit_nm, p.columnDtl1_base_unit_dec_place, p.columnDtl1_base_unit_rnd_typ, p.columnDtl1_cont_fctr_flg, p.columnDtl1_std_cont_fctr, p.columnDtl1_cont_fctr_unit_cd, p.columnDtl1_cont_fctr_unit_nm, p.columnDtl1_cont_fctr_rnd_typ, p.columnDtl1_cont_fctr_dec_place, p.columnDtl1_asset_mng_typ, p.columnDtl1_wtax_rate, p.columnDtl1_itm_pay_crryovr_times, p.columnDtl1_maker_cd, p.columnDtl1_maker_nm, p.columnDtl1_trd_unit_cd);
		p.columnDtl1_iv_itm_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.iv_itm_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_iv_itm_nm);
		p.columnDtl1_sundry_itm_flg.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.sundry_itm_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sundry_itm_flg);
		p.columnDtl1_itm_purc_upri_cng_flg.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.itm_purc_upri_cng_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_itm_purc_upri_cng_flg);
		p.columnDtl1_dscnt_itm_flg.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.dscnt_itm_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_dscnt_itm_flg);
		p.columnDtl1_arr_skip_flg.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.arr_skip_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_arr_skip_flg);
		p.columnDtl1_itm_pay_crryovr_times.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.itm_pay_crryovr_times_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_itm_pay_crryovr_times);
		p.columnDtl1_stk_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.stk_mng_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_stk_mng_typ);
		p.columnDtl1_lot_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.lot_mng_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_lot_mng_typ);
		p.columnDtl1_lot_no_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.lot_no_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_lot_no_typ);
		p.columnDtl1_sublot_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.sublot_mng_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sublot_mng_typ);
		p.columnDtl1_sublot_no_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.sublot_no_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sublot_no_typ);
		p.columnDtl1_sno1_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.sno1_mng_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sno1_mng_typ);
		p.columnDtl1_sno2_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.sno2_mng_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sno2_mng_typ);
		p.columnDtl1_sno3_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.sno3_mng_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sno3_mng_typ);
		p.columnDtl1_sno4_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.sno4_mng_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sno4_mng_typ);
		p.Dtl1Table.addTable(p.Dtl1_lot_no_p_PPanel.LotNoTable);
		p.Dtl1_lot_no_p_PPanel.columnLotNo_lot_no.setLinkBeans(p.columnDtl1_sublot_no, p.columnDtl1_ver_no);
		p.Dtl1_lot_no_p_PPanel.columnLotNo_sublot_no.setLinkBeans(p.columnDtl1_ver_no);
		p.columnDtl1_bp_lot_no.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.bp_lot_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_bp_lot_no);
		p.columnDtl1_ver_flg.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.ver_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ver_flg);
		p.Dtl1Table.addTable(p.Dtl1_ver_no_p_PPanel.VerNoTable);
		p.Dtl1Table.addTable(p.Dtl1_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnDtl1_maker_cd.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.maker_cd_META);
		p.columnDtl1_maker_cd.addLinkBeans(p.columnDtl1_maker_nm);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_maker_cd);
		p.columnDtl1_maker_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.maker_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_maker_nm);
		p.columnDtl1_sppl_itm_cd.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.sppl_itm_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sppl_itm_cd);
		p.columnDtl1_sppl_itm_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.sppl_itm_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sppl_itm_nm);
		p.columnDtl1_purc_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.purc_typ_META);
		p.columnDtl1_purc_typ.addLinkBeans(p.columnDtl1_purc_typ_nm);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_typ);
		p.columnDtl1_purc_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.purc_typ_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_typ_nm);
		p.columnDtl1_trd_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.trd_unit_cd_META);
		p.columnDtl1_trd_unit_cd.addLinkBeans(p.columnDtl1_trd_unit_nm,p.columnDtl1_trd_unit_dec_place,p.columnDtl1_trd_unit_rnd_typ,p.columnDtl1_trd_unit_dmn_qty,p.columnDtl1_trd_unit_conv_qty);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_unit_cd);
		p.columnDtl1_trd_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.trd_unit_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_unit_nm);
		p.columnDtl1_trd_unit_dec_place.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.trd_unit_dec_place_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_unit_dec_place);
		p.columnDtl1_trd_unit_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.trd_unit_rnd_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_unit_rnd_typ);
		p.columnDtl1_trd_unit_dmn_qty.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.trd_unit_dmn_qty_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_unit_dmn_qty);
		p.columnDtl1_trd_unit_conv_qty.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.trd_unit_conv_qty_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_unit_conv_qty);
		p.Dtl1Table.addTable(p.Dtl1_trd_unit_qty_p_PPanel.QtyTable);
		p.columnDtl1_base_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.base_unit_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_base_unit_cd);
		p.columnDtl1_base_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.base_unit_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_base_unit_nm);
		p.columnDtl1_base_unit_dec_place.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.base_unit_dec_place_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_base_unit_dec_place);
		p.columnDtl1_base_unit_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.base_unit_rnd_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_base_unit_rnd_typ);
		p.Dtl1Table.addTable(p.Dtl1_base_unit_qty_p_PPanel.QtyTable);
		p.Dtl1Table.addTable(p.Dtl1_ret_qty_p_PPanel.QtyTable);
		p.Dtl1Table.addTable(p.Dtl1_trd_upri_amt_p_PPanel.TrdUpriAmtTable);
		p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setLinkBeans(p.columnDtl1_tax_nm, p.columnDtl1_tax_rate, p.columnDtl1_inc_tax_flg, p.columnDtl1_tax_typ);
		p.Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setLinkBeans(p.columnDtl1_dscnt_rsn_nm);
		p.columnDtl1_repurc_obli_flg.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.repurc_obli_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_repurc_obli_flg);
		p.Dtl1Table.addTable(p.Dtl1_trd_cur_proc_upri_p_PPanel.UpriTable);
		p.Dtl1Table.addTable(p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.columnDtl1_loc_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.loc_mng_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_loc_mng_typ);
		p.Dtl1Table.addTable(p.Dtl1_trd_cur_proc_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_upri_p_PPanel.UpriTable);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_proc_upri_p_PPanel.UpriTable);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_dscnt_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_tax_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_proc_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_ptax_cur_upri_p_PPanel.UpriTable);
		p.Dtl1Table.addTable(p.Dtl1_ptax_cur_proc_upri_p_PPanel.UpriTable);
		p.Dtl1Table.addTable(p.Dtl1_ptax_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.Dtl1Table.addTable(p.Dtl1_ptax_cur_dscnt_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_ptax_cur_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_ptax_cur_tax_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_ptax_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_ptax_cur_proc_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_ptax_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.columnDtl1_wtax_rate.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.wtax_rate_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_wtax_rate);
		p.Dtl1Table.addTable(p.Dtl1_wtax_amt_p_PPanel.AmtTable);
		p.columnDtl1_mfg_inst_no.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.mfg_inst_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_mfg_inst_no);
		p.columnDtl1_po_no.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.po_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_po_no);
		p.columnDtl1_quality_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.quality_typ_META);
		p.columnDtl1_quality_typ.addLinkBeans(p.columnDtl1_quality_typ_nm);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_quality_typ);
		p.columnDtl1_quality_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.quality_typ_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_quality_typ_nm);
		p.columnDtl1_insp_flg.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.insp_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_insp_flg);
		p.columnDtl1_stk_id_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.stk_id_typ_META);
		p.columnDtl1_stk_id_typ.addLinkBeans(p.columnDtl1_stk_id_typ_nm);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_stk_id_typ);
		p.columnDtl1_stk_id_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.stk_id_typ_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_stk_id_typ_nm);
		p.columnDtl1_purc_id_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.purc_id_typ_META);
		p.columnDtl1_purc_id_typ.addLinkBeans(p.columnDtl1_purc_id_typ_nm);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_id_typ);
		p.columnDtl1_purc_id_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.purc_id_typ_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_id_typ_nm);
		p.columnDtl1_gd_cd.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.gd_cd_META);
		p.columnDtl1_gd_cd.addLinkBeans(p.columnDtl1_gd_nm);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_gd_cd);
		p.columnDtl1_gd_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.gd_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_gd_nm);
		p.columnDtl1_stk_arrv_bp_cd.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.stk_arrv_bp_cd_META);
		p.columnDtl1_stk_arrv_bp_cd.addLinkBeans(p.columnDtl1_stk_arrv_bp_nm);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_stk_arrv_bp_cd);
		p.columnDtl1_stk_arrv_bp_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.stk_arrv_bp_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_stk_arrv_bp_nm);
		p.columnDtl1_purc_ret_rsn_cd.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.purc_ret_rsn_cd_META);
		p.columnDtl1_purc_ret_rsn_cd.addLinkBeans(p.columnDtl1_purc_ret_rsn_nm,p.columnDtl1_xpns_purc_flg);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_ret_rsn_cd);
		p.columnDtl1_purc_ret_rsn_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.purc_ret_rsn_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_ret_rsn_nm);
		p.columnDtl1_ap_dpt_cd.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.ap_dpt_cd_META);
		p.columnDtl1_ap_dpt_cd.setListType(MCListType.STRICT);
		p.columnDtl1_ap_dpt_cd.addLinkBeans(p.columnDtl1_ap_dpt_nm);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ap_dpt_cd);
		p.columnDtl1_ap_dpt_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.ap_dpt_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ap_dpt_nm);
		p.columnDtl1_pay_crryovr_times.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.pay_crryovr_times_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_pay_crryovr_times);
		p.columnDtl1_xpns_purc_flg.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.xpns_purc_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_xpns_purc_flg);
		p.Dtl1Table.addTable(p.Dtl1_bd_p_PPanel.BdItemTable);
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_dpt_cd.setLinkBeans(p.columnDtl1_bd_dpt_nm);
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_itm_cd.setLinkBeans(p.columnDtl1_bd_itm_sub1, p.columnDtl1_bd_itm_sub2, p.columnDtl1_bd_itm_sub3, p.columnDtl1_bd_itm_nm, p.columnDtl1_bd_lot_mng_typ, p.columnDtl1_bd_lot_no_typ, p.columnDtl1_bd_sublot_mng_typ, p.columnDtl1_bd_sublot_no_typ, p.columnDtl1_bd_sno1_mng_typ, p.columnDtl1_bd_sno2_mng_typ, p.columnDtl1_bd_sno3_mng_typ, p.columnDtl1_bd_sno4_mng_typ);
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_itm_sub1.setLinkBeans(p.columnDtl1_bd_itm_sub2, p.columnDtl1_bd_itm_sub3, p.columnDtl1_bd_itm_nm, p.columnDtl1_bd_lot_mng_typ, p.columnDtl1_bd_lot_no_typ, p.columnDtl1_bd_sublot_mng_typ, p.columnDtl1_bd_sublot_no_typ, p.columnDtl1_bd_sno1_mng_typ, p.columnDtl1_bd_sno2_mng_typ, p.columnDtl1_bd_sno3_mng_typ, p.columnDtl1_bd_sno4_mng_typ);
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_itm_sub2.setLinkBeans(p.columnDtl1_bd_itm_sub3, p.columnDtl1_bd_itm_nm, p.columnDtl1_bd_lot_mng_typ, p.columnDtl1_bd_lot_no_typ, p.columnDtl1_bd_sublot_mng_typ, p.columnDtl1_bd_sublot_no_typ, p.columnDtl1_bd_sno1_mng_typ, p.columnDtl1_bd_sno2_mng_typ, p.columnDtl1_bd_sno3_mng_typ, p.columnDtl1_bd_sno4_mng_typ);
		p.Dtl1_bd_p_PPanel.columnBdItem_bd_itm_sub3.setLinkBeans(p.columnDtl1_bd_itm_nm, p.columnDtl1_bd_lot_mng_typ, p.columnDtl1_bd_lot_no_typ, p.columnDtl1_bd_sublot_mng_typ, p.columnDtl1_bd_sublot_no_typ, p.columnDtl1_bd_sno1_mng_typ, p.columnDtl1_bd_sno2_mng_typ, p.columnDtl1_bd_sno3_mng_typ, p.columnDtl1_bd_sno4_mng_typ);
		p.columnDtl1_bd_lot_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.bd_lot_mng_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_bd_lot_mng_typ);
		p.columnDtl1_bd_sublot_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.bd_sublot_mng_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_bd_sublot_mng_typ);
		p.columnDtl1_bd_lot_no_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.bd_lot_no_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_bd_lot_no_typ);
		p.columnDtl1_bd_sublot_no_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.bd_sublot_no_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_bd_sublot_no_typ);
		p.columnDtl1_bd_sno1_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.bd_sno1_mng_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_bd_sno1_mng_typ);
		p.columnDtl1_bd_sno2_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.bd_sno2_mng_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_bd_sno2_mng_typ);
		p.columnDtl1_bd_sno3_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.bd_sno3_mng_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_bd_sno3_mng_typ);
		p.columnDtl1_bd_sno4_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.bd_sno4_mng_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_bd_sno4_mng_typ);
		p.columnDtl1_cont_fctr_flg.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.cont_fctr_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_cont_fctr_flg);
		p.Dtl1Table.addTable(p.Dtl1_purc_cont_qty_p_PPanel.PurcContQtyTable);
		p.Dtl1Table.addTable(p.Dtl1_purc_cont_fctr_p_PPanel.PurcContFctrTable);
		p.Dtl1Table.addTable(p.Dtl1_std_cont_qty_p_PPanel.ContQtyTable);
		p.Dtl1Table.addTable(p.Dtl1_cont_fctr_unit_p_PPanel.ContFctrUnitTable);
		p.Dtl1Table.addTable(p.Dtl1_std_cont_fctr_p_PPanel.StdContFctrTable);
		p.columnDtl1_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.cont_fctr_rnd_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_cont_fctr_rnd_typ);
		p.columnDtl1_cont_fctr_dec_place.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.cont_fctr_dec_place_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_cont_fctr_dec_place);
		p.columnDtl1_trd_d_rmrks.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.trd_d_rmrks_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_d_rmrks);
		p.columnDtl1_intr_d_rmrks.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.intr_d_rmrks_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_intr_d_rmrks);
		p.columnDtl1_purc_ret_print_d_rmrks.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.purc_ret_print_d_rmrks_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_ret_print_d_rmrks);
		p.columnDtl1_sub_char1.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.sub_char1_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sub_char1);
		p.columnDtl1_sub_char2.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.sub_char2_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sub_char2);
		p.columnDtl1_sub_char3.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.sub_char3_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sub_char3);
		p.columnDtl1_ref_arr_act_no.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.ref_arr_act_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ref_arr_act_no);
		p.columnDtl1_ref_arr_act_rev.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.ref_arr_act_rev_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ref_arr_act_rev);
		p.columnDtl1_ref_purc_act_no.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.ref_purc_act_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ref_purc_act_no);
		p.columnDtl1_ref_purc_act_seq.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.ref_purc_act_seq_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ref_purc_act_seq);
		p.columnDtl1_ref_purc_act_rev.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.ref_purc_act_rev_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ref_purc_act_rev);
		p.columnDtl1_ref_purc_act_d_no.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.ref_purc_act_d_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ref_purc_act_d_no);
		p.columnDtl1_ref_purc_act_d_seq.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.ref_purc_act_d_seq_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ref_purc_act_d_seq);
		p.columnDtl1_purc_ret_schd_d_no.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.purc_ret_schd_d_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_ret_schd_d_no);
		p.columnDtl1_base_purc_ac_dt.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.base_purc_ac_dt_META);
		p.columnDtl1_base_purc_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_base_purc_ac_dt);
		p.columnDtl1_base_ac_dt.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.base_ac_dt_META);
		p.columnDtl1_base_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_base_ac_dt);
		p.columnDtl1_disp_seq.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl1R.disp_seq_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_disp_seq);
	}

	/**
	 * [Dtl2]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl2(MSBDP_PurcRetSchdReg p) {
		p.columnDtl2_dtl_peg_no.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.dtl_peg_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_dtl_peg_no);
		p.columnDtl2_peg_no.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.peg_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_peg_no);
		p.columnDtl2_purc_ret_loc_wg_cd.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.purc_ret_loc_wg_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_purc_ret_loc_wg_cd);
		p.columnDtl2_purc_ret_loc_wg_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.purc_ret_loc_wg_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_purc_ret_loc_wg_nm);
		p.columnDtl2_purc_ret_loc_cd.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.purc_ret_loc_cd_META);
		p.columnDtl2_purc_ret_loc_cd.setListType(MCListType.STRICT);
		p.columnDtl2_purc_ret_loc_cd.addLinkBeans(p.columnDtl2_purc_ret_loc_wg_cd,p.columnDtl2_purc_ret_loc_wg_nm,p.columnDtl2_purc_ret_loc_nm,p.columnDtl2_str_ln_tgt_flg,p.columnDtl2_purc_ret_sppl_cd);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_purc_ret_loc_cd);
		p.columnDtl2_purc_ret_loc_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.purc_ret_loc_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_purc_ret_loc_nm);
		p.columnDtl2_purc_ret_sppl_cd.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.purc_ret_sppl_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_purc_ret_sppl_cd);
		p.columnDtl2_str_ln_tgt_flg.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.str_ln_tgt_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_str_ln_tgt_flg);
		p.Dtl2Table.addTable(p.Dtl2_str_ln_p_PPanel.StrLnTable);
		p.Dtl2_str_ln_p_PPanel.columnStrLn_str_ln_cd.setLinkBeans(p.columnDtl2_str_ln_nm);
		p.columnDtl2_asset_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.asset_mng_typ_META);
		p.columnDtl2_asset_mng_typ.addLinkBeans(p.columnDtl2_asset_mng_typ_nm);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_asset_mng_typ);
		p.columnDtl2_asset_mng_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.asset_mng_typ_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_asset_mng_typ_nm);
		p.Dtl2Table.addTable(p.Dtl2_itm_p_PPanel.ItmTable);
		p.Dtl2_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtl2_sundry_itm_flg, p.columnDtl2_itm_nm, p.columnDtl2_itm_sub1, p.columnDtl2_itm_sub2, p.columnDtl2_itm_sub3, p.columnDtl2_lot_mng_typ, p.columnDtl2_lot_no_typ, p.columnDtl2_sublot_mng_typ, p.columnDtl2_sublot_no_typ, p.columnDtl2_sno1_mng_typ, p.columnDtl2_sno2_mng_typ, p.columnDtl2_sno3_mng_typ, p.columnDtl2_sno4_mng_typ, p.columnDtl2_stk_mng_typ, p.columnDtl2_base_unit_cd, p.columnDtl2_base_unit_nm, p.columnDtl2_base_unit_dec_place, p.columnDtl2_base_unit_rnd_typ, p.columnDtl2_cont_fctr_flg, p.columnDtl2_std_cont_fctr, p.columnDtl2_cont_fctr_unit_cd, p.columnDtl2_cont_fctr_unit_nm, p.columnDtl2_cont_fctr_rnd_typ, p.columnDtl2_cont_fctr_dec_place, p.columnDtl2_asset_mng_typ);
		p.Dtl2_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtl2_sundry_itm_flg, p.columnDtl2_itm_nm, p.columnDtl2_itm_sub2, p.columnDtl2_itm_sub3, p.columnDtl2_lot_mng_typ, p.columnDtl2_lot_no_typ, p.columnDtl2_sublot_mng_typ, p.columnDtl2_sublot_no_typ, p.columnDtl2_sno1_mng_typ, p.columnDtl2_sno2_mng_typ, p.columnDtl2_sno3_mng_typ, p.columnDtl2_sno4_mng_typ, p.columnDtl2_stk_mng_typ, p.columnDtl2_base_unit_cd, p.columnDtl2_base_unit_nm, p.columnDtl2_base_unit_dec_place, p.columnDtl2_base_unit_rnd_typ, p.columnDtl2_cont_fctr_flg, p.columnDtl2_std_cont_fctr, p.columnDtl2_cont_fctr_unit_cd, p.columnDtl2_cont_fctr_unit_nm, p.columnDtl2_cont_fctr_rnd_typ, p.columnDtl2_cont_fctr_dec_place, p.columnDtl2_asset_mng_typ);
		p.Dtl2_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtl2_sundry_itm_flg, p.columnDtl2_itm_nm, p.columnDtl2_itm_sub3, p.columnDtl2_lot_mng_typ, p.columnDtl2_lot_no_typ, p.columnDtl2_sublot_mng_typ, p.columnDtl2_sublot_no_typ, p.columnDtl2_sno1_mng_typ, p.columnDtl2_sno2_mng_typ, p.columnDtl2_sno3_mng_typ, p.columnDtl2_sno4_mng_typ, p.columnDtl2_stk_mng_typ, p.columnDtl2_base_unit_cd, p.columnDtl2_base_unit_nm, p.columnDtl2_base_unit_dec_place, p.columnDtl2_base_unit_rnd_typ, p.columnDtl2_cont_fctr_flg, p.columnDtl2_std_cont_fctr, p.columnDtl2_cont_fctr_unit_cd, p.columnDtl2_cont_fctr_unit_nm, p.columnDtl2_cont_fctr_rnd_typ, p.columnDtl2_cont_fctr_dec_place, p.columnDtl2_asset_mng_typ);
		p.Dtl2_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtl2_sundry_itm_flg, p.columnDtl2_itm_nm, p.columnDtl2_lot_mng_typ, p.columnDtl2_lot_no_typ, p.columnDtl2_sublot_mng_typ, p.columnDtl2_sublot_no_typ, p.columnDtl2_sno1_mng_typ, p.columnDtl2_sno2_mng_typ, p.columnDtl2_sno3_mng_typ, p.columnDtl2_sno4_mng_typ, p.columnDtl2_stk_mng_typ, p.columnDtl2_base_unit_cd, p.columnDtl2_base_unit_nm, p.columnDtl2_base_unit_dec_place, p.columnDtl2_base_unit_rnd_typ, p.columnDtl2_cont_fctr_flg, p.columnDtl2_std_cont_fctr, p.columnDtl2_cont_fctr_unit_cd, p.columnDtl2_cont_fctr_unit_nm, p.columnDtl2_cont_fctr_rnd_typ, p.columnDtl2_cont_fctr_dec_place, p.columnDtl2_asset_mng_typ);
		p.columnDtl2_iv_itm_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.iv_itm_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_iv_itm_nm);
		p.columnDtl2_sundry_itm_flg.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.sundry_itm_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sundry_itm_flg);
		p.columnDtl2_stk_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.stk_mng_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_stk_mng_typ);
		p.columnDtl2_lot_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.lot_mng_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_lot_mng_typ);
		p.columnDtl2_lot_no_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.lot_no_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_lot_no_typ);
		p.columnDtl2_sublot_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.sublot_mng_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sublot_mng_typ);
		p.columnDtl2_sublot_no_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.sublot_no_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sublot_no_typ);
		p.columnDtl2_sno1_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.sno1_mng_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sno1_mng_typ);
		p.columnDtl2_sno2_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.sno2_mng_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sno2_mng_typ);
		p.columnDtl2_sno3_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.sno3_mng_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sno3_mng_typ);
		p.columnDtl2_sno4_mng_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.sno4_mng_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sno4_mng_typ);
		p.columnDtl2_dscnt_itm_flg.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.dscnt_itm_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_dscnt_itm_flg);
		p.Dtl2Table.addTable(p.Dtl2_lot_no_p_PPanel.LotNoTable);
		p.Dtl2_lot_no_p_PPanel.columnLotNo_lot_no.setLinkBeans(p.columnDtl2_sublot_no, p.columnDtl2_ver_no);
		p.Dtl2_lot_no_p_PPanel.columnLotNo_sublot_no.setLinkBeans(p.columnDtl2_ver_no);
		p.columnDtl2_bp_lot_no.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.bp_lot_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_bp_lot_no);
		p.columnDtl2_ver_flg.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.ver_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ver_flg);
		p.Dtl2Table.addTable(p.Dtl2_ver_no_p_PPanel.VerNoTable);
		p.Dtl2Table.addTable(p.Dtl2_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnDtl2_trd_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.trd_unit_cd_META);
		p.columnDtl2_trd_unit_cd.addLinkBeans(p.columnDtl2_trd_unit_nm,p.columnDtl2_trd_unit_dec_place,p.columnDtl2_trd_unit_rnd_typ,p.columnDtl2_trd_unit_dmn_qty,p.columnDtl2_trd_unit_conv_qty);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_trd_unit_cd);
		p.columnDtl2_trd_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.trd_unit_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_trd_unit_nm);
		p.columnDtl2_trd_unit_dec_place.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.trd_unit_dec_place_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_trd_unit_dec_place);
		p.columnDtl2_trd_unit_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.trd_unit_rnd_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_trd_unit_rnd_typ);
		p.columnDtl2_trd_unit_dmn_qty.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.trd_unit_dmn_qty_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_trd_unit_dmn_qty);
		p.columnDtl2_trd_unit_conv_qty.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.trd_unit_conv_qty_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_trd_unit_conv_qty);
		p.Dtl2Table.addTable(p.Dtl2_trd_unit_qty_p_PPanel.QtyTable);
		p.columnDtl2_base_unit_cd.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.base_unit_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_base_unit_cd);
		p.columnDtl2_base_unit_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.base_unit_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_base_unit_nm);
		p.columnDtl2_base_unit_dec_place.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.base_unit_dec_place_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_base_unit_dec_place);
		p.columnDtl2_base_unit_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.base_unit_rnd_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_base_unit_rnd_typ);
		p.Dtl2Table.addTable(p.Dtl2_base_unit_qty_p_PPanel.QtyTable);
		p.columnDtl2_quality_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.quality_typ_META);
		p.columnDtl2_quality_typ.addLinkBeans(p.columnDtl2_quality_typ_nm);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_quality_typ);
		p.columnDtl2_quality_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.quality_typ_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_quality_typ_nm);
		p.columnDtl2_stk_id_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.stk_id_typ_META);
		p.columnDtl2_stk_id_typ.addLinkBeans(p.columnDtl2_stk_id_typ_nm);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_stk_id_typ);
		p.columnDtl2_stk_id_typ_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.stk_id_typ_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_stk_id_typ_nm);
		p.columnDtl2_gd_cd.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.gd_cd_META);
		p.columnDtl2_gd_cd.addLinkBeans(p.columnDtl2_gd_nm);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_gd_cd);
		p.columnDtl2_gd_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.gd_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_gd_nm);
		p.columnDtl2_stk_arrv_bp_cd.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.stk_arrv_bp_cd_META);
		p.columnDtl2_stk_arrv_bp_cd.addLinkBeans(p.columnDtl2_stk_arrv_bp_nm);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_stk_arrv_bp_cd);
		p.columnDtl2_stk_arrv_bp_nm.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.stk_arrv_bp_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_stk_arrv_bp_nm);
		p.columnDtl2_cont_fctr_flg.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.cont_fctr_flg_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_cont_fctr_flg);
		p.Dtl2Table.addTable(p.Dtl2_purc_cont_qty_p_PPanel.PurcContQtyTable);
		p.Dtl2Table.addTable(p.Dtl2_purc_cont_fctr_p_PPanel.PurcContFctrTable);
		p.Dtl2Table.addTable(p.Dtl2_std_cont_qty_p_PPanel.ContQtyTable);
		p.Dtl2Table.addTable(p.Dtl2_std_cont_fctr_p_PPanel.StdContFctrTable);
		p.Dtl2Table.addTable(p.Dtl2_cont_fctr_unit_p_PPanel.ContFctrUnitTable);
		p.columnDtl2_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.cont_fctr_rnd_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_cont_fctr_rnd_typ);
		p.columnDtl2_cont_fctr_dec_place.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.cont_fctr_dec_place_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_cont_fctr_dec_place);
		p.columnDtl2_sub_char1.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.sub_char1_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sub_char1);
		p.columnDtl2_sub_char2.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.sub_char2_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sub_char2);
		p.columnDtl2_sub_char3.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.sub_char3_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_sub_char3);
		p.columnDtl2_ref_arr_act_no.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.ref_arr_act_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ref_arr_act_no);
		p.columnDtl2_ref_arr_act_rev.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.ref_arr_act_rev_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ref_arr_act_rev);
		p.columnDtl2_ref_purc_act_io_no.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.ref_purc_act_io_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ref_purc_act_io_no);
		p.columnDtl2_ref_purc_act_io_seq.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.ref_purc_act_io_seq_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ref_purc_act_io_seq);
		p.columnDtl2_purc_ret_schd_io_no.setMeta(mcframe.clientMSBD.MSBDP0150.Dtl2R.purc_ret_schd_io_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_purc_ret_schd_io_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_srch_tgt_typ_nm.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_srch_tgt_typ_nm.getListConfig().setPutter(getCnd_srch_tgt_typ_nm_ListPutter());
		Hdr1_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr1_trd_cd.getListConfig().setPutter(getHdr1_trd_cd_ListPutter());
		Hdr1_sppl_cd.getListConfig().setPutter(getHdr1_sppl_cd_ListPutter());
		Hdr1_asppl_cd.getListConfig().setPutter(getHdr1_asppl_cd_ListPutter());
		Hdr1_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr1_trd_cur_cd.getListConfig().setPutter(getHdr1_trd_cur_cd_ListPutter());
		Hdr1_ptax_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr1_ptax_cur_cd.getListConfig().setPutter(getHdr1_ptax_cur_cd_ListPutter());
		Hdr1_base_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr1_base_cur_cd.getListConfig().setPutter(getHdr1_base_cur_cd_ListPutter());
		Hdr1_purc_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr1_purc_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getHdr1_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		Hdr1_tterm_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr1_tterm_cd1.getListConfig().setPutter(getHdr1_tterm_cd1_ListPutter());
		Hdr1_tterm_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr1_tterm_cd2.getListConfig().setPutter(getHdr1_tterm_cd2_ListPutter());
		Hdr1_tterm_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr1_tterm_cd3.getListConfig().setPutter(getHdr1_tterm_cd3_ListPutter());
		columnDtl1_purc_ret_loc_cd.getListConfig().setPutter(getDtl1_purc_ret_loc_cd_ListPutter());
		Dtl1_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl1_str_ln_p_PPanel.columnStrLn_str_ln_cd.getListConfig().setPutter(getDtl1_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter());
		columnDtl1_asset_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl1_asset_mng_typ.getListConfig().setPutter(getDtl1_asset_mng_typ_ListPutter());
		Dtl1_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtl1_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Dtl1_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl1_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtl1_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Dtl1_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl1_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtl1_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Dtl1_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl1_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtl1_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		Dtl1_lot_no_p_PPanel.columnLotNo_lot_no.getListConfig().setPutter(getDtl1_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter());
		Dtl1_lot_no_p_PPanel.columnLotNo_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl1_lot_no_p_PPanel.columnLotNo_sublot_no.getListConfig().setPutter(getDtl1_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter());
		columnDtl1_maker_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl1_maker_cd.getListConfig().setPutter(getDtl1_maker_cd_ListPutter());
		columnDtl1_purc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl1_purc_typ.getListConfig().setPutter(getDtl1_purc_typ_ListPutter());
		columnDtl1_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl1_trd_unit_cd.getListConfig().setPutter(getDtl1_trd_unit_cd_ListPutter());
		Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd.getListConfig().setPutter(getDtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter());
		Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd.getListConfig().setPutter(getDtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter());
		columnDtl1_quality_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl1_quality_typ.getListConfig().setPutter(getDtl1_quality_typ_ListPutter());
		columnDtl1_stk_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl1_stk_id_typ.getListConfig().setPutter(getDtl1_stk_id_typ_ListPutter());
		columnDtl1_purc_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl1_purc_id_typ.getListConfig().setPutter(getDtl1_purc_id_typ_ListPutter());
		columnDtl1_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl1_gd_cd.getListConfig().setPutter(getDtl1_gd_cd_ListPutter());
		columnDtl1_stk_arrv_bp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl1_stk_arrv_bp_cd.getListConfig().setPutter(getDtl1_stk_arrv_bp_cd_ListPutter());
		columnDtl1_purc_ret_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl1_purc_ret_rsn_cd.getListConfig().setPutter(getDtl1_purc_ret_rsn_cd_ListPutter());
		columnDtl1_ap_dpt_cd.getListConfig().setPutter(getDtl1_ap_dpt_cd_ListPutter());
		Dtl1_bd_p_PPanel.columnBdItem_bd_dpt_cd.getListConfig().setPutter(getDtl1_bd_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter());
		Dtl1_bd_p_PPanel.columnBdItem_bd_itm_cd.getListConfig().setPutter(getDtl1_bd_p_PPanel_columnBdItem_bd_itm_cd_ListPutter());
		Dtl1_bd_p_PPanel.columnBdItem_bd_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl1_bd_p_PPanel.columnBdItem_bd_itm_sub1.getListConfig().setPutter(getDtl1_bd_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter());
		Dtl1_bd_p_PPanel.columnBdItem_bd_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl1_bd_p_PPanel.columnBdItem_bd_itm_sub2.getListConfig().setPutter(getDtl1_bd_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter());
		Dtl1_bd_p_PPanel.columnBdItem_bd_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl1_bd_p_PPanel.columnBdItem_bd_itm_sub3.getListConfig().setPutter(getDtl1_bd_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter());
		columnDtl2_purc_ret_loc_cd.getListConfig().setPutter(getDtl2_purc_ret_loc_cd_ListPutter());
		Dtl2_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl2_str_ln_p_PPanel.columnStrLn_str_ln_cd.getListConfig().setPutter(getDtl2_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter());
		columnDtl2_asset_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_asset_mng_typ.getListConfig().setPutter(getDtl2_asset_mng_typ_ListPutter());
		Dtl2_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtl2_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Dtl2_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl2_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtl2_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Dtl2_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl2_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtl2_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Dtl2_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl2_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtl2_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		Dtl2_lot_no_p_PPanel.columnLotNo_lot_no.getListConfig().setPutter(getDtl2_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter());
		Dtl2_lot_no_p_PPanel.columnLotNo_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl2_lot_no_p_PPanel.columnLotNo_sublot_no.getListConfig().setPutter(getDtl2_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter());
		columnDtl2_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_trd_unit_cd.getListConfig().setPutter(getDtl2_trd_unit_cd_ListPutter());
		columnDtl2_quality_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_quality_typ.getListConfig().setPutter(getDtl2_quality_typ_ListPutter());
		columnDtl2_stk_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_stk_id_typ.getListConfig().setPutter(getDtl2_stk_id_typ_ListPutter());
		columnDtl2_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_gd_cd.getListConfig().setPutter(getDtl2_gd_cd_ListPutter());
		columnDtl2_stk_arrv_bp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl2_stk_arrv_bp_cd.getListConfig().setPutter(getDtl2_stk_arrv_bp_cd_ListPutter());
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
		lp.setListLogicId("MS.MSUAP0010.PurcSrchTgtTyp");
		return lp;
	}
	 
	/**
	 * [Hdr1_trd_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr1_trd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Trd");
		return lp;
	}
	 
	/**
	 * [Hdr1_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr1_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Hdr1_asppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr1_asppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Hdr1_trd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr1_trd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Hdr1_ptax_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr1_ptax_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Hdr1_base_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr1_base_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Hdr1_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr1_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Hdr1_tterm_cd1_ListPutter]の作成
	 */
	protected MCListPutter createHdr1_tterm_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Tterm");
		return lp;
	}
	 
	/**
	 * [Hdr1_tterm_cd2_ListPutter]の作成
	 */
	protected MCListPutter createHdr1_tterm_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Tterm");
		return lp;
	}
	 
	/**
	 * [Hdr1_tterm_cd3_ListPutter]の作成
	 */
	protected MCListPutter createHdr1_tterm_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Tterm");
		return lp;
	}
	 
	/**
	 * [Dtl1_purc_ret_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_purc_ret_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Dtl1_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}

	/**
	 * [Dtl1_asset_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_asset_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AssetMngTyp");
		return lp;
	}
	 
	/**
	 * [Dtl1_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmDtl");
		return lp;
	}

	/**
	 * [Dtl1_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmDtlSub1");
		return lp;
	}

	/**
	 * [Dtl1_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmDtlSub2");
		return lp;
	}

	/**
	 * [Dtl1_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmDtlSub3");
		return lp;
	}

	/**
	 * [Dtl1_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.LotNo");
		return lp;
	}

	/**
	 * [Dtl1_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.SublotNo");
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
	 * [Dtl1_purc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_purc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcTyp");
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
	 * [Dtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcTax");
		return lp;
	}

	/**
	 * [Dtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcDscntBizRsn");
		return lp;
	}

	/**
	 * [Dtl1_quality_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_quality_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.QualityTyp");
		return lp;
	}
	 
	/**
	 * [Dtl1_stk_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_stk_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.StkIdTyp");
		return lp;
	}
	 
	/**
	 * [Dtl1_purc_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_purc_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcIdTyp");
		return lp;
	}
	 
	/**
	 * [Dtl1_gd_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_gd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StkGd");
		return lp;
	}
	 
	/**
	 * [Dtl1_stk_arrv_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_stk_arrv_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.SpplByLoc");
		return lp;
	}
	 
	/**
	 * [Dtl1_purc_ret_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_purc_ret_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcRtnBizRsn");
		return lp;
	}
	 
	/**
	 * [Dtl1_ap_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_ap_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Dtl1_bd_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_bd_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Dtl1_bd_p_PPanel_columnBdItem_bd_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_bd_p_PPanel_columnBdItem_bd_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_bd_p_PPanel_columnBdItem_bd_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_bd_p_PPanel_columnBdItem_bd_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createDtl1_bd_p_PPanel_columnBdItem_bd_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Dtl2_purc_ret_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_purc_ret_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Dtl2_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}

	/**
	 * [Dtl2_asset_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_asset_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AssetMngTyp");
		return lp;
	}
	 
	/**
	 * [Dtl2_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmDtl");
		return lp;
	}

	/**
	 * [Dtl2_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmDtlSub1");
		return lp;
	}

	/**
	 * [Dtl2_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmDtlSub2");
		return lp;
	}

	/**
	 * [Dtl2_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmDtlSub3");
		return lp;
	}

	/**
	 * [Dtl2_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.LotNo");
		return lp;
	}

	/**
	 * [Dtl2_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.SublotNo");
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
	 * [Dtl2_quality_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_quality_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.QualityTyp");
		return lp;
	}
	 
	/**
	 * [Dtl2_stk_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_stk_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.StkIdTyp");
		return lp;
	}
	 
	/**
	 * [Dtl2_gd_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_gd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StkGd");
		return lp;
	}
	 
	/**
	 * [Dtl2_stk_arrv_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_stk_arrv_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.SpplByLoc");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_srch_tgt_typ_nm) return getCnd_srch_tgt_typ_nm(row, info);
		if(combo == Hdr1_trd_cd) return getHdr1_trd_cd(row, info);
		if(combo == Hdr1_sppl_cd) return getHdr1_sppl_cd(row, info);
		if(combo == Hdr1_asppl_cd) return getHdr1_asppl_cd(row, info);
		if(combo == Hdr1_trd_cur_cd) return getHdr1_trd_cur_cd(row, info);
		if(combo == Hdr1_ptax_cur_cd) return getHdr1_ptax_cur_cd(row, info);
		if(combo == Hdr1_base_cur_cd) return getHdr1_base_cur_cd(row, info);
		if(combo == Hdr1_purc_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getHdr1_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == Hdr1_tterm_cd1) return getHdr1_tterm_cd1(row, info);
		if(combo == Hdr1_tterm_cd2) return getHdr1_tterm_cd2(row, info);
		if(combo == Hdr1_tterm_cd3) return getHdr1_tterm_cd3(row, info);
		if(combo == columnDtl1_purc_ret_loc_cd) return getDtl1_purc_ret_loc_cd(row, info);
		if(combo == Dtl1_str_ln_p_PPanel.columnStrLn_str_ln_cd) return getDtl1_str_ln_p_PPanel_columnStrLn_str_ln_cd(row, info);
		if(combo == columnDtl1_asset_mng_typ) return getDtl1_asset_mng_typ(row, info);
		if(combo == Dtl1_itm_p_PPanel.columnItm_itm_cd) return getDtl1_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Dtl1_itm_p_PPanel.columnItm_itm_sub1) return getDtl1_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Dtl1_itm_p_PPanel.columnItm_itm_sub2) return getDtl1_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Dtl1_itm_p_PPanel.columnItm_itm_sub3) return getDtl1_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == Dtl1_lot_no_p_PPanel.columnLotNo_lot_no) return getDtl1_lot_no_p_PPanel_columnLotNo_lot_no(row, info);
		if(combo == Dtl1_lot_no_p_PPanel.columnLotNo_sublot_no) return getDtl1_lot_no_p_PPanel_columnLotNo_sublot_no(row, info);
		if(combo == columnDtl1_maker_cd) return getDtl1_maker_cd(row, info);
		if(combo == columnDtl1_purc_typ) return getDtl1_purc_typ(row, info);
		if(combo == columnDtl1_trd_unit_cd) return getDtl1_trd_unit_cd(row, info);
		if(combo == Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_tax_cd) return getDtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd(row, info);
		if(combo == Dtl1_trd_upri_amt_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd) return getDtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd(row, info);
		if(combo == columnDtl1_quality_typ) return getDtl1_quality_typ(row, info);
		if(combo == columnDtl1_stk_id_typ) return getDtl1_stk_id_typ(row, info);
		if(combo == columnDtl1_purc_id_typ) return getDtl1_purc_id_typ(row, info);
		if(combo == columnDtl1_gd_cd) return getDtl1_gd_cd(row, info);
		if(combo == columnDtl1_stk_arrv_bp_cd) return getDtl1_stk_arrv_bp_cd(row, info);
		if(combo == columnDtl1_purc_ret_rsn_cd) return getDtl1_purc_ret_rsn_cd(row, info);
		if(combo == columnDtl1_ap_dpt_cd) return getDtl1_ap_dpt_cd(row, info);
		if(combo == Dtl1_bd_p_PPanel.columnBdItem_bd_dpt_cd) return getDtl1_bd_p_PPanel_columnBdItem_bd_dpt_cd(row, info);
		if(combo == Dtl1_bd_p_PPanel.columnBdItem_bd_itm_cd) return getDtl1_bd_p_PPanel_columnBdItem_bd_itm_cd(row, info);
		if(combo == Dtl1_bd_p_PPanel.columnBdItem_bd_itm_sub1) return getDtl1_bd_p_PPanel_columnBdItem_bd_itm_sub1(row, info);
		if(combo == Dtl1_bd_p_PPanel.columnBdItem_bd_itm_sub2) return getDtl1_bd_p_PPanel_columnBdItem_bd_itm_sub2(row, info);
		if(combo == Dtl1_bd_p_PPanel.columnBdItem_bd_itm_sub3) return getDtl1_bd_p_PPanel_columnBdItem_bd_itm_sub3(row, info);
		if(combo == columnDtl2_purc_ret_loc_cd) return getDtl2_purc_ret_loc_cd(row, info);
		if(combo == Dtl2_str_ln_p_PPanel.columnStrLn_str_ln_cd) return getDtl2_str_ln_p_PPanel_columnStrLn_str_ln_cd(row, info);
		if(combo == columnDtl2_asset_mng_typ) return getDtl2_asset_mng_typ(row, info);
		if(combo == Dtl2_itm_p_PPanel.columnItm_itm_cd) return getDtl2_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Dtl2_itm_p_PPanel.columnItm_itm_sub1) return getDtl2_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Dtl2_itm_p_PPanel.columnItm_itm_sub2) return getDtl2_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Dtl2_itm_p_PPanel.columnItm_itm_sub3) return getDtl2_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == Dtl2_lot_no_p_PPanel.columnLotNo_lot_no) return getDtl2_lot_no_p_PPanel_columnLotNo_lot_no(row, info);
		if(combo == Dtl2_lot_no_p_PPanel.columnLotNo_sublot_no) return getDtl2_lot_no_p_PPanel_columnLotNo_sublot_no(row, info);
		if(combo == columnDtl2_trd_unit_cd) return getDtl2_trd_unit_cd(row, info);
		if(combo == columnDtl2_quality_typ) return getDtl2_quality_typ(row, info);
		if(combo == columnDtl2_stk_id_typ) return getDtl2_stk_id_typ(row, info);
		if(combo == columnDtl2_gd_cd) return getDtl2_gd_cd(row, info);
		if(combo == columnDtl2_stk_arrv_bp_cd) return getDtl2_stk_arrv_bp_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch_arr_act) doCnd_srch_arr_act(info);
		else if (ap == Cnd_srch_purc_act) doCnd_srch_purc_act(info);
		else if (ap == Cnd_srch_purc_ret_schd) doCnd_srch_purc_ret_schd(info);
		else if (ap == Dtl1Btn_srch_upri) doDtl1Btn_srch_upri(info);
		else if (ap == Dtl1Btn_radd) doDtl1Btn_radd(info);
		else if (ap == Dtl1Btn_rdel) doDtl1Btn_rdel(info);
		else if (ap == Dtl1Btn_rcopy) doDtl1Btn_rcopy(info);
		else if (ap == Dtl2Btn_radd) doDtl2Btn_radd(info);
		else if (ap == Dtl2Btn_rdel) doDtl2Btn_rdel(info);
		else if (ap == Dtl2Btn_rcopy) doDtl2Btn_rcopy(info);
		else if (ap == Dtl2Btn_upd_dtl) doDtl2Btn_upd_dtl(info);
		else if (ap == Btn_open_MSBDP0160) doBtn_open_MSBDP0160(info);
		else if (ap == Btn_ins) doBtn_ins(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Cnd]パネルの[srch_arr_act]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_arr_act(MCEventInfo info);

	/**
	 * [Cnd]パネルの[srch_purc_act]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_purc_act(MCEventInfo info);

	/**
	 * [Cnd]パネルの[srch_purc_ret_schd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_purc_ret_schd(MCEventInfo info);

	/**
	 * [Dtl1Btn]パネルの[srch_upri]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtl1Btn_srch_upri(MCEventInfo info);

	/**
	 * [Dtl1Btn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtl1Btn_radd(MCEventInfo info);

	/**
	 * [Dtl1Btn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtl1Btn_rdel(MCEventInfo info);

	/**
	 * [Dtl1Btn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtl1Btn_rcopy(MCEventInfo info);

	/**
	 * [Dtl2Btn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtl2Btn_radd(MCEventInfo info);

	/**
	 * [Dtl2Btn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtl2Btn_rdel(MCEventInfo info);

	/**
	 * [Dtl2Btn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtl2Btn_rcopy(MCEventInfo info);

	/**
	 * [Dtl2Btn]パネルの[upd_dtl]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtl2Btn_upd_dtl(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBDP0160]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBDP0160(MCEventInfo info);

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
		if (vc == FoldTab) return doFold_VC(info);
		if (vc == Dtl1Table) return doDtl1_VC(info);
		if (vc == Dtl2Table) return doDtl2_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_srch_tgt_typ) return doCnd_srch_tgt_typ_VC(info);
		if (vc == Cnd_srch_tgt_typ_nm) return doCnd_srch_tgt_typ_nm_VC(info);
		if (vc == Cnd_srch_tgt_no) return doCnd_srch_tgt_no_VC(info);
		if (vc == Hdr1_trd_cd) return doHdr1_trd_cd_VC(info);
		if (vc == Hdr1_trd_nm) return doHdr1_trd_nm_VC(info);
		if (vc == Hdr1_trd_ptn_typ) return doHdr1_trd_ptn_typ_VC(info);
		if (vc == Hdr1_purc_ret_schd_no) return doHdr1_purc_ret_schd_no_VC(info);
		if (vc == Hdr1_reg_dt) return doHdr1_reg_dt_VC(info);
		if (vc == Hdr1_schd_dt) return doHdr1_schd_dt_VC(info);
		if (vc == Hdr1_sppl_cd) return doHdr1_sppl_cd_VC(info);
		if (vc == Hdr1_sppl_nm) return doHdr1_sppl_nm_VC(info);
		if (vc == Hdr1_purc_upri_cng_flg) return doHdr1_purc_upri_cng_flg_VC(info);
		if (vc == Hdr1_subcon_flg) return doHdr1_subcon_flg_VC(info);
		if (vc == Hdr1_repurc_obli_flg) return doHdr1_repurc_obli_flg_VC(info);
		if (vc == Hdr1_outsrc_upri_typ) return doHdr1_outsrc_upri_typ_VC(info);
		if (vc == Hdr1_ap_dpt_cd) return doHdr1_ap_dpt_cd_VC(info);
		if (vc == Hdr1_mst_ap_dpt_cd) return doHdr1_mst_ap_dpt_cd_VC(info);
		if (vc == Hdr1_pay_spot_flg) return doHdr1_pay_spot_flg_VC(info);
		if (vc == Hdr1_sppl_pay_crryovr_times) return doHdr1_sppl_pay_crryovr_times_VC(info);
		if (vc == Hdr1_sppl_iv_flg) return doHdr1_sppl_iv_flg_VC(info);
		if (vc == Hdr1_prnt_lcl_cd) return doHdr1_prnt_lcl_cd_VC(info);
		if (vc == Hdr1_asppl_cd) return doHdr1_asppl_cd_VC(info);
		if (vc == Hdr1_asppl_nm) return doHdr1_asppl_nm_VC(info);
		if (vc == Hdr1_trd_cur_cd) return doHdr1_trd_cur_cd_VC(info);
		if (vc == Hdr1_trd_cur_nm) return doHdr1_trd_cur_nm_VC(info);
		if (vc == Hdr1_trd_cur_upri_dec_place) return doHdr1_trd_cur_upri_dec_place_VC(info);
		if (vc == Hdr1_trd_cur_amt_dec_place) return doHdr1_trd_cur_amt_dec_place_VC(info);
		if (vc == Hdr1_ptax_cur_cd) return doHdr1_ptax_cur_cd_VC(info);
		if (vc == Hdr1_ptax_cur_nm) return doHdr1_ptax_cur_nm_VC(info);
		if (vc == Hdr1_ptax_cur_upri_dec_place) return doHdr1_ptax_cur_upri_dec_place_VC(info);
		if (vc == Hdr1_ptax_cur_amt_dec_place) return doHdr1_ptax_cur_amt_dec_place_VC(info);
		if (vc == Hdr1_ptax_xrate_inpt_flg) return doHdr1_ptax_xrate_inpt_flg_VC(info);
		if (vc == Hdr1_base_cur_cd) return doHdr1_base_cur_cd_VC(info);
		if (vc == Hdr1_base_cur_nm) return doHdr1_base_cur_nm_VC(info);
		if (vc == Hdr1_base_cur_upri_dec_place) return doHdr1_base_cur_upri_dec_place_VC(info);
		if (vc == Hdr1_base_cur_amt_dec_place) return doHdr1_base_cur_amt_dec_place_VC(info);
		if (vc == Hdr1_xrate_inpt_flg) return doHdr1_xrate_inpt_flg_VC(info);
		if (vc == Hdr1_xrate_cd) return doHdr1_xrate_cd_VC(info);
		if (vc == Hdr1_purc_amt_rnd_typ) return doHdr1_purc_amt_rnd_typ_VC(info);
		if (vc == Hdr1_purc_tax_rnd_typ) return doHdr1_purc_tax_rnd_typ_VC(info);
		if (vc == Hdr1_purc_tax_calc_typ) return doHdr1_purc_tax_calc_typ_VC(info);
		if (vc == Hdr1_purc_tax_cd) return doHdr1_purc_tax_cd_VC(info);
		if (vc == Hdr1_purc_tax_cd_prio_flg) return doHdr1_purc_tax_cd_prio_flg_VC(info);
		if (vc == Hdr1_ret_sppl_nm) return doHdr1_ret_sppl_nm_VC(info);
		if (vc == Hdr1_ret_sppl_enable_flg) return doHdr1_ret_sppl_enable_flg_VC(info);
		if (vc == Hdr1_ret_sppl_cntct_psn_title) return doHdr1_ret_sppl_cntct_psn_title_VC(info);
		if (vc == Hdr1_rcpt_iv_no) return doHdr1_rcpt_iv_no_VC(info);
		if (vc == Hdr1_ref_rcpt_iv_no) return doHdr1_ref_rcpt_iv_no_VC(info);
		if (vc == Hdr1_def_purc_usr_cd) return doHdr1_def_purc_usr_cd_VC(info);
		if (vc == Hdr1_def_purc_dpt_cd) return doHdr1_def_purc_dpt_cd_VC(info);
		if (vc == Hdr1_ap_dpt_flg) return doHdr1_ap_dpt_flg_VC(info);
		if (vc == Hdr1_purc_dpt_wg_cd) return doHdr1_purc_dpt_wg_cd_VC(info);
		if (vc == Hdr1_purc_dpt_wg_nm) return doHdr1_purc_dpt_wg_nm_VC(info);
		if (vc == Hdr1_purc_ret_print_rmrks) return doHdr1_purc_ret_print_rmrks_VC(info);
		if (vc == Hdr1_trd_rmrks) return doHdr1_trd_rmrks_VC(info);
		if (vc == Hdr1_intr_rmrks) return doHdr1_intr_rmrks_VC(info);
		if (vc == Hdr1_sub_char1) return doHdr1_sub_char1_VC(info);
		if (vc == Hdr1_sub_char2) return doHdr1_sub_char2_VC(info);
		if (vc == Hdr1_sub_char3) return doHdr1_sub_char3_VC(info);
		if (vc == Hdr1_tterm_cd1) return doHdr1_tterm_cd1_VC(info);
		if (vc == Hdr1_tterm_nm1) return doHdr1_tterm_nm1_VC(info);
		if (vc == Hdr1_tterm_rmrks1) return doHdr1_tterm_rmrks1_VC(info);
		if (vc == Hdr1_tterm_cd2) return doHdr1_tterm_cd2_VC(info);
		if (vc == Hdr1_tterm_nm2) return doHdr1_tterm_nm2_VC(info);
		if (vc == Hdr1_tterm_rmrks2) return doHdr1_tterm_rmrks2_VC(info);
		if (vc == Hdr1_tterm_cd3) return doHdr1_tterm_cd3_VC(info);
		if (vc == Hdr1_tterm_nm3) return doHdr1_tterm_nm3_VC(info);
		if (vc == Hdr1_tterm_rmrks3) return doHdr1_tterm_rmrks3_VC(info);
		if (vc == Hdr1_pr_schd_upd_cntr) return doHdr1_pr_schd_upd_cntr_VC(info);
		if (vc == Hdr1_ins_usr_id) return doHdr1_ins_usr_id_VC(info);
		if (vc == Hdr1_ins_usr_nm) return doHdr1_ins_usr_nm_VC(info);
		if (vc == Hdr1_ins_func_id) return doHdr1_ins_func_id_VC(info);
		if (vc == Hdr1_ins_func_nm) return doHdr1_ins_func_nm_VC(info);
		if (vc == Hdr1_upd_usr_id) return doHdr1_upd_usr_id_VC(info);
		if (vc == Hdr1_upd_usr_nm) return doHdr1_upd_usr_nm_VC(info);
		if (vc == Hdr1_upd_func_id) return doHdr1_upd_func_id_VC(info);
		if (vc == Hdr1_upd_func_nm) return doHdr1_upd_func_nm_VC(info);
		if (vc == Hdr1_ins_ts) return doHdr1_ins_ts_VC(info);
		if (vc == Hdr1_upd_ts) return doHdr1_upd_ts_VC(info);
		if (vc == Hdr1_upd_srv_req_no) return doHdr1_upd_srv_req_no_VC(info);
		if (vc == columnDtl1_peg_no) return doDtl1_peg_no_VC(info);
		if (vc == columnDtl1_cmpl_flg) return doDtl1_cmpl_flg_VC(info);
		if (vc == columnDtl1_abort_flg) return doDtl1_abort_flg_VC(info);
		if (vc == columnDtl1_purc_ret_loc_wg_cd) return doDtl1_purc_ret_loc_wg_cd_VC(info);
		if (vc == columnDtl1_purc_ret_loc_wg_nm) return doDtl1_purc_ret_loc_wg_nm_VC(info);
		if (vc == columnDtl1_purc_ret_loc_cd) return doDtl1_purc_ret_loc_cd_VC(info);
		if (vc == columnDtl1_purc_ret_loc_nm) return doDtl1_purc_ret_loc_nm_VC(info);
		if (vc == columnDtl1_purc_ret_sppl_cd) return doDtl1_purc_ret_sppl_cd_VC(info);
		if (vc == columnDtl1_str_ln_tgt_flg) return doDtl1_str_ln_tgt_flg_VC(info);
		if (vc == columnDtl1_asset_mng_typ) return doDtl1_asset_mng_typ_VC(info);
		if (vc == columnDtl1_asset_mng_typ_nm) return doDtl1_asset_mng_typ_nm_VC(info);
		if (vc == columnDtl1_iv_itm_nm) return doDtl1_iv_itm_nm_VC(info);
		if (vc == columnDtl1_sundry_itm_flg) return doDtl1_sundry_itm_flg_VC(info);
		if (vc == columnDtl1_itm_purc_upri_cng_flg) return doDtl1_itm_purc_upri_cng_flg_VC(info);
		if (vc == columnDtl1_dscnt_itm_flg) return doDtl1_dscnt_itm_flg_VC(info);
		if (vc == columnDtl1_arr_skip_flg) return doDtl1_arr_skip_flg_VC(info);
		if (vc == columnDtl1_itm_pay_crryovr_times) return doDtl1_itm_pay_crryovr_times_VC(info);
		if (vc == columnDtl1_stk_mng_typ) return doDtl1_stk_mng_typ_VC(info);
		if (vc == columnDtl1_lot_mng_typ) return doDtl1_lot_mng_typ_VC(info);
		if (vc == columnDtl1_lot_no_typ) return doDtl1_lot_no_typ_VC(info);
		if (vc == columnDtl1_sublot_mng_typ) return doDtl1_sublot_mng_typ_VC(info);
		if (vc == columnDtl1_sublot_no_typ) return doDtl1_sublot_no_typ_VC(info);
		if (vc == columnDtl1_sno1_mng_typ) return doDtl1_sno1_mng_typ_VC(info);
		if (vc == columnDtl1_sno2_mng_typ) return doDtl1_sno2_mng_typ_VC(info);
		if (vc == columnDtl1_sno3_mng_typ) return doDtl1_sno3_mng_typ_VC(info);
		if (vc == columnDtl1_sno4_mng_typ) return doDtl1_sno4_mng_typ_VC(info);
		if (vc == columnDtl1_bp_lot_no) return doDtl1_bp_lot_no_VC(info);
		if (vc == columnDtl1_ver_flg) return doDtl1_ver_flg_VC(info);
		if (vc == columnDtl1_maker_cd) return doDtl1_maker_cd_VC(info);
		if (vc == columnDtl1_maker_nm) return doDtl1_maker_nm_VC(info);
		if (vc == columnDtl1_sppl_itm_cd) return doDtl1_sppl_itm_cd_VC(info);
		if (vc == columnDtl1_sppl_itm_nm) return doDtl1_sppl_itm_nm_VC(info);
		if (vc == columnDtl1_purc_typ) return doDtl1_purc_typ_VC(info);
		if (vc == columnDtl1_purc_typ_nm) return doDtl1_purc_typ_nm_VC(info);
		if (vc == columnDtl1_trd_unit_cd) return doDtl1_trd_unit_cd_VC(info);
		if (vc == columnDtl1_trd_unit_nm) return doDtl1_trd_unit_nm_VC(info);
		if (vc == columnDtl1_trd_unit_dec_place) return doDtl1_trd_unit_dec_place_VC(info);
		if (vc == columnDtl1_trd_unit_rnd_typ) return doDtl1_trd_unit_rnd_typ_VC(info);
		if (vc == columnDtl1_trd_unit_dmn_qty) return doDtl1_trd_unit_dmn_qty_VC(info);
		if (vc == columnDtl1_trd_unit_conv_qty) return doDtl1_trd_unit_conv_qty_VC(info);
		if (vc == columnDtl1_base_unit_cd) return doDtl1_base_unit_cd_VC(info);
		if (vc == columnDtl1_base_unit_nm) return doDtl1_base_unit_nm_VC(info);
		if (vc == columnDtl1_base_unit_dec_place) return doDtl1_base_unit_dec_place_VC(info);
		if (vc == columnDtl1_base_unit_rnd_typ) return doDtl1_base_unit_rnd_typ_VC(info);
		if (vc == columnDtl1_repurc_obli_flg) return doDtl1_repurc_obli_flg_VC(info);
		if (vc == columnDtl1_loc_mng_typ) return doDtl1_loc_mng_typ_VC(info);
		if (vc == columnDtl1_wtax_rate) return doDtl1_wtax_rate_VC(info);
		if (vc == columnDtl1_mfg_inst_no) return doDtl1_mfg_inst_no_VC(info);
		if (vc == columnDtl1_po_no) return doDtl1_po_no_VC(info);
		if (vc == columnDtl1_quality_typ) return doDtl1_quality_typ_VC(info);
		if (vc == columnDtl1_quality_typ_nm) return doDtl1_quality_typ_nm_VC(info);
		if (vc == columnDtl1_insp_flg) return doDtl1_insp_flg_VC(info);
		if (vc == columnDtl1_stk_id_typ) return doDtl1_stk_id_typ_VC(info);
		if (vc == columnDtl1_stk_id_typ_nm) return doDtl1_stk_id_typ_nm_VC(info);
		if (vc == columnDtl1_purc_id_typ) return doDtl1_purc_id_typ_VC(info);
		if (vc == columnDtl1_purc_id_typ_nm) return doDtl1_purc_id_typ_nm_VC(info);
		if (vc == columnDtl1_gd_cd) return doDtl1_gd_cd_VC(info);
		if (vc == columnDtl1_gd_nm) return doDtl1_gd_nm_VC(info);
		if (vc == columnDtl1_stk_arrv_bp_cd) return doDtl1_stk_arrv_bp_cd_VC(info);
		if (vc == columnDtl1_stk_arrv_bp_nm) return doDtl1_stk_arrv_bp_nm_VC(info);
		if (vc == columnDtl1_purc_ret_rsn_cd) return doDtl1_purc_ret_rsn_cd_VC(info);
		if (vc == columnDtl1_purc_ret_rsn_nm) return doDtl1_purc_ret_rsn_nm_VC(info);
		if (vc == columnDtl1_ap_dpt_cd) return doDtl1_ap_dpt_cd_VC(info);
		if (vc == columnDtl1_ap_dpt_nm) return doDtl1_ap_dpt_nm_VC(info);
		if (vc == columnDtl1_pay_crryovr_times) return doDtl1_pay_crryovr_times_VC(info);
		if (vc == columnDtl1_xpns_purc_flg) return doDtl1_xpns_purc_flg_VC(info);
		if (vc == columnDtl1_bd_lot_mng_typ) return doDtl1_bd_lot_mng_typ_VC(info);
		if (vc == columnDtl1_bd_sublot_mng_typ) return doDtl1_bd_sublot_mng_typ_VC(info);
		if (vc == columnDtl1_bd_lot_no_typ) return doDtl1_bd_lot_no_typ_VC(info);
		if (vc == columnDtl1_bd_sublot_no_typ) return doDtl1_bd_sublot_no_typ_VC(info);
		if (vc == columnDtl1_bd_sno1_mng_typ) return doDtl1_bd_sno1_mng_typ_VC(info);
		if (vc == columnDtl1_bd_sno2_mng_typ) return doDtl1_bd_sno2_mng_typ_VC(info);
		if (vc == columnDtl1_bd_sno3_mng_typ) return doDtl1_bd_sno3_mng_typ_VC(info);
		if (vc == columnDtl1_bd_sno4_mng_typ) return doDtl1_bd_sno4_mng_typ_VC(info);
		if (vc == columnDtl1_cont_fctr_flg) return doDtl1_cont_fctr_flg_VC(info);
		if (vc == columnDtl1_cont_fctr_rnd_typ) return doDtl1_cont_fctr_rnd_typ_VC(info);
		if (vc == columnDtl1_cont_fctr_dec_place) return doDtl1_cont_fctr_dec_place_VC(info);
		if (vc == columnDtl1_trd_d_rmrks) return doDtl1_trd_d_rmrks_VC(info);
		if (vc == columnDtl1_intr_d_rmrks) return doDtl1_intr_d_rmrks_VC(info);
		if (vc == columnDtl1_purc_ret_print_d_rmrks) return doDtl1_purc_ret_print_d_rmrks_VC(info);
		if (vc == columnDtl1_sub_char1) return doDtl1_sub_char1_VC(info);
		if (vc == columnDtl1_sub_char2) return doDtl1_sub_char2_VC(info);
		if (vc == columnDtl1_sub_char3) return doDtl1_sub_char3_VC(info);
		if (vc == columnDtl1_ref_arr_act_no) return doDtl1_ref_arr_act_no_VC(info);
		if (vc == columnDtl1_ref_arr_act_rev) return doDtl1_ref_arr_act_rev_VC(info);
		if (vc == columnDtl1_ref_purc_act_no) return doDtl1_ref_purc_act_no_VC(info);
		if (vc == columnDtl1_ref_purc_act_seq) return doDtl1_ref_purc_act_seq_VC(info);
		if (vc == columnDtl1_ref_purc_act_rev) return doDtl1_ref_purc_act_rev_VC(info);
		if (vc == columnDtl1_ref_purc_act_d_no) return doDtl1_ref_purc_act_d_no_VC(info);
		if (vc == columnDtl1_ref_purc_act_d_seq) return doDtl1_ref_purc_act_d_seq_VC(info);
		if (vc == columnDtl1_purc_ret_schd_d_no) return doDtl1_purc_ret_schd_d_no_VC(info);
		if (vc == columnDtl1_base_purc_ac_dt) return doDtl1_base_purc_ac_dt_VC(info);
		if (vc == columnDtl1_base_ac_dt) return doDtl1_base_ac_dt_VC(info);
		if (vc == columnDtl1_disp_seq) return doDtl1_disp_seq_VC(info);
		if (vc == columnDtl2_dtl_peg_no) return doDtl2_dtl_peg_no_VC(info);
		if (vc == columnDtl2_peg_no) return doDtl2_peg_no_VC(info);
		if (vc == columnDtl2_purc_ret_loc_wg_cd) return doDtl2_purc_ret_loc_wg_cd_VC(info);
		if (vc == columnDtl2_purc_ret_loc_wg_nm) return doDtl2_purc_ret_loc_wg_nm_VC(info);
		if (vc == columnDtl2_purc_ret_loc_cd) return doDtl2_purc_ret_loc_cd_VC(info);
		if (vc == columnDtl2_purc_ret_loc_nm) return doDtl2_purc_ret_loc_nm_VC(info);
		if (vc == columnDtl2_purc_ret_sppl_cd) return doDtl2_purc_ret_sppl_cd_VC(info);
		if (vc == columnDtl2_str_ln_tgt_flg) return doDtl2_str_ln_tgt_flg_VC(info);
		if (vc == columnDtl2_asset_mng_typ) return doDtl2_asset_mng_typ_VC(info);
		if (vc == columnDtl2_asset_mng_typ_nm) return doDtl2_asset_mng_typ_nm_VC(info);
		if (vc == columnDtl2_iv_itm_nm) return doDtl2_iv_itm_nm_VC(info);
		if (vc == columnDtl2_sundry_itm_flg) return doDtl2_sundry_itm_flg_VC(info);
		if (vc == columnDtl2_stk_mng_typ) return doDtl2_stk_mng_typ_VC(info);
		if (vc == columnDtl2_lot_mng_typ) return doDtl2_lot_mng_typ_VC(info);
		if (vc == columnDtl2_lot_no_typ) return doDtl2_lot_no_typ_VC(info);
		if (vc == columnDtl2_sublot_mng_typ) return doDtl2_sublot_mng_typ_VC(info);
		if (vc == columnDtl2_sublot_no_typ) return doDtl2_sublot_no_typ_VC(info);
		if (vc == columnDtl2_sno1_mng_typ) return doDtl2_sno1_mng_typ_VC(info);
		if (vc == columnDtl2_sno2_mng_typ) return doDtl2_sno2_mng_typ_VC(info);
		if (vc == columnDtl2_sno3_mng_typ) return doDtl2_sno3_mng_typ_VC(info);
		if (vc == columnDtl2_sno4_mng_typ) return doDtl2_sno4_mng_typ_VC(info);
		if (vc == columnDtl2_dscnt_itm_flg) return doDtl2_dscnt_itm_flg_VC(info);
		if (vc == columnDtl2_bp_lot_no) return doDtl2_bp_lot_no_VC(info);
		if (vc == columnDtl2_ver_flg) return doDtl2_ver_flg_VC(info);
		if (vc == columnDtl2_trd_unit_cd) return doDtl2_trd_unit_cd_VC(info);
		if (vc == columnDtl2_trd_unit_nm) return doDtl2_trd_unit_nm_VC(info);
		if (vc == columnDtl2_trd_unit_dec_place) return doDtl2_trd_unit_dec_place_VC(info);
		if (vc == columnDtl2_trd_unit_rnd_typ) return doDtl2_trd_unit_rnd_typ_VC(info);
		if (vc == columnDtl2_trd_unit_dmn_qty) return doDtl2_trd_unit_dmn_qty_VC(info);
		if (vc == columnDtl2_trd_unit_conv_qty) return doDtl2_trd_unit_conv_qty_VC(info);
		if (vc == columnDtl2_base_unit_cd) return doDtl2_base_unit_cd_VC(info);
		if (vc == columnDtl2_base_unit_nm) return doDtl2_base_unit_nm_VC(info);
		if (vc == columnDtl2_base_unit_dec_place) return doDtl2_base_unit_dec_place_VC(info);
		if (vc == columnDtl2_base_unit_rnd_typ) return doDtl2_base_unit_rnd_typ_VC(info);
		if (vc == columnDtl2_quality_typ) return doDtl2_quality_typ_VC(info);
		if (vc == columnDtl2_quality_typ_nm) return doDtl2_quality_typ_nm_VC(info);
		if (vc == columnDtl2_stk_id_typ) return doDtl2_stk_id_typ_VC(info);
		if (vc == columnDtl2_stk_id_typ_nm) return doDtl2_stk_id_typ_nm_VC(info);
		if (vc == columnDtl2_gd_cd) return doDtl2_gd_cd_VC(info);
		if (vc == columnDtl2_gd_nm) return doDtl2_gd_nm_VC(info);
		if (vc == columnDtl2_stk_arrv_bp_cd) return doDtl2_stk_arrv_bp_cd_VC(info);
		if (vc == columnDtl2_stk_arrv_bp_nm) return doDtl2_stk_arrv_bp_nm_VC(info);
		if (vc == columnDtl2_cont_fctr_flg) return doDtl2_cont_fctr_flg_VC(info);
		if (vc == columnDtl2_cont_fctr_rnd_typ) return doDtl2_cont_fctr_rnd_typ_VC(info);
		if (vc == columnDtl2_cont_fctr_dec_place) return doDtl2_cont_fctr_dec_place_VC(info);
		if (vc == columnDtl2_sub_char1) return doDtl2_sub_char1_VC(info);
		if (vc == columnDtl2_sub_char2) return doDtl2_sub_char2_VC(info);
		if (vc == columnDtl2_sub_char3) return doDtl2_sub_char3_VC(info);
		if (vc == columnDtl2_ref_arr_act_no) return doDtl2_ref_arr_act_no_VC(info);
		if (vc == columnDtl2_ref_arr_act_rev) return doDtl2_ref_arr_act_rev_VC(info);
		if (vc == columnDtl2_ref_purc_act_io_no) return doDtl2_ref_purc_act_io_no_VC(info);
		if (vc == columnDtl2_ref_purc_act_io_seq) return doDtl2_ref_purc_act_io_seq_VC(info);
		if (vc == columnDtl2_purc_ret_schd_io_no) return doDtl2_purc_ret_schd_io_no_VC(info);
		return true;
	}

	/**
	 * [Fold]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doFold_VC(MCEventInfo info){
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
	 * [Hdr1]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[purc_ret_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_purc_ret_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[reg_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_reg_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[purc_upri_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_purc_upri_cng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[subcon_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_subcon_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[repurc_obli_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_repurc_obli_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[outsrc_upri_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_outsrc_upri_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[mst_ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_mst_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[pay_spot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_pay_spot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[sppl_pay_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_sppl_pay_crryovr_times_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[sppl_iv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_sppl_iv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[prnt_lcl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_prnt_lcl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[asppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_asppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[asppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_asppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[trd_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_trd_cur_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[trd_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_trd_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ptax_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ptax_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ptax_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ptax_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ptax_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ptax_cur_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ptax_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ptax_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ptax_xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ptax_xrate_inpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[base_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_base_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[base_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_base_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[base_cur_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_base_cur_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[base_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_base_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_xrate_inpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[purc_amt_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_purc_amt_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[purc_tax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_purc_tax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[purc_tax_calc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_purc_tax_calc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[purc_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_purc_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[purc_tax_cd_prio_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_purc_tax_cd_prio_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ret_sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ret_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ret_sppl_enable_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ret_sppl_enable_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ret_sppl_cntct_psn_title]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ret_sppl_cntct_psn_title_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[rcpt_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_rcpt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ref_rcpt_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ref_rcpt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[def_purc_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_def_purc_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[def_purc_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_def_purc_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ap_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ap_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[purc_dpt_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_purc_dpt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[purc_dpt_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_purc_dpt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[purc_ret_print_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_purc_ret_print_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[tterm_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_tterm_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[tterm_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_tterm_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[tterm_rmrks1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_tterm_rmrks1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[tterm_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_tterm_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[tterm_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_tterm_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[tterm_rmrks2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_tterm_rmrks2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[tterm_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_tterm_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[tterm_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_tterm_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[tterm_rmrks3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_tterm_rmrks3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[pr_schd_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_pr_schd_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr1]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr1_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[peg_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_peg_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_cmpl_flg_VC(MCEventInfo info){
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
	 * [Dtl1]パネルの[purc_ret_loc_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_ret_loc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[purc_ret_loc_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_ret_loc_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[purc_ret_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_ret_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[purc_ret_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_ret_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[purc_ret_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_ret_sppl_cd_VC(MCEventInfo info){
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
	 * [Dtl1]パネルの[asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_asset_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[asset_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_asset_mng_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl1]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sundry_itm_flg_VC(MCEventInfo info){
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
	 * [Dtl1]パネルの[dscnt_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_dscnt_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[arr_skip_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_arr_skip_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[itm_pay_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_itm_pay_crryovr_times_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[lot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_lot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sublot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sublot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sublot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[bp_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_bp_lot_no_VC(MCEventInfo info){
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
	 * [Dtl1]パネルの[purc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[purc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl1]パネルの[trd_unit_dmn_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_trd_unit_dmn_qty_VC(MCEventInfo info){
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
	 * [Dtl1]パネルの[repurc_obli_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_repurc_obli_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[loc_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_loc_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[wtax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_wtax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_mfg_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[insp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_insp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[stk_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_stk_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[stk_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_stk_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[purc_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[purc_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_gd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[stk_arrv_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_stk_arrv_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[stk_arrv_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_stk_arrv_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[purc_ret_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_ret_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[purc_ret_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_ret_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ap_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ap_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[pay_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_pay_crryovr_times_VC(MCEventInfo info){
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
	 * [Dtl1]パネルの[cont_fctr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_cont_fctr_flg_VC(MCEventInfo info){
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
	 * [Dtl1]パネルの[cont_fctr_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_cont_fctr_dec_place_VC(MCEventInfo info){
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
	 * [Dtl1]パネルの[intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_intr_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[purc_ret_print_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_ret_print_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ref_arr_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ref_arr_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ref_arr_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ref_arr_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ref_purc_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ref_purc_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ref_purc_act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ref_purc_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ref_purc_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ref_purc_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ref_purc_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ref_purc_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ref_purc_act_d_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ref_purc_act_d_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[purc_ret_schd_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_ret_schd_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[base_purc_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_base_purc_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[base_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_base_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[dtl_peg_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_dtl_peg_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[peg_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_peg_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[purc_ret_loc_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_purc_ret_loc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[purc_ret_loc_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_purc_ret_loc_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[purc_ret_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_purc_ret_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[purc_ret_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_purc_ret_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[purc_ret_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_purc_ret_sppl_cd_VC(MCEventInfo info){
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
	 * [Dtl2]パネルの[asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_asset_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[asset_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_asset_mng_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl2]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sundry_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[lot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_lot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sublot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sublot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sublot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sno4_mng_typ_VC(MCEventInfo info){
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
	 * [Dtl2]パネルの[bp_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_bp_lot_no_VC(MCEventInfo info){
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
	 * [Dtl2]パネルの[trd_unit_dmn_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_trd_unit_dmn_qty_VC(MCEventInfo info){
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
	 * [Dtl2]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[stk_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_stk_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[stk_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_stk_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_gd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[stk_arrv_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_stk_arrv_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[stk_arrv_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_stk_arrv_bp_nm_VC(MCEventInfo info){
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
	 * [Dtl2]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_cont_fctr_rnd_typ_VC(MCEventInfo info){
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
	 * [Dtl2]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ref_arr_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ref_arr_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ref_arr_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ref_arr_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ref_purc_act_io_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ref_purc_act_io_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ref_purc_act_io_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ref_purc_act_io_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[purc_ret_schd_io_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_purc_ret_schd_io_no_VC(MCEventInfo info){
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
		if (nc == FoldTab) doFold_NC(info);
		else if (nc == Dtl1Table) doDtl1_NC(info);
		else if (nc == Dtl2Table) doDtl2_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_NC(info);
		else if (nc == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_NC(info);
		else if (nc == Cnd_srch_tgt_no) doCnd_srch_tgt_no_NC(info);
		else if (nc == Hdr1_trd_cd) doHdr1_trd_cd_NC(info);
		else if (nc == Hdr1_trd_nm) doHdr1_trd_nm_NC(info);
		else if (nc == Hdr1_trd_ptn_typ) doHdr1_trd_ptn_typ_NC(info);
		else if (nc == Hdr1_purc_ret_schd_no) doHdr1_purc_ret_schd_no_NC(info);
		else if (nc == Hdr1_reg_dt) doHdr1_reg_dt_NC(info);
		else if (nc == Hdr1_schd_dt) doHdr1_schd_dt_NC(info);
		else if (nc == Hdr1_sppl_cd) doHdr1_sppl_cd_NC(info);
		else if (nc == Hdr1_sppl_nm) doHdr1_sppl_nm_NC(info);
		else if (nc == Hdr1_purc_upri_cng_flg) doHdr1_purc_upri_cng_flg_NC(info);
		else if (nc == Hdr1_subcon_flg) doHdr1_subcon_flg_NC(info);
		else if (nc == Hdr1_repurc_obli_flg) doHdr1_repurc_obli_flg_NC(info);
		else if (nc == Hdr1_outsrc_upri_typ) doHdr1_outsrc_upri_typ_NC(info);
		else if (nc == Hdr1_ap_dpt_cd) doHdr1_ap_dpt_cd_NC(info);
		else if (nc == Hdr1_mst_ap_dpt_cd) doHdr1_mst_ap_dpt_cd_NC(info);
		else if (nc == Hdr1_pay_spot_flg) doHdr1_pay_spot_flg_NC(info);
		else if (nc == Hdr1_sppl_pay_crryovr_times) doHdr1_sppl_pay_crryovr_times_NC(info);
		else if (nc == Hdr1_sppl_iv_flg) doHdr1_sppl_iv_flg_NC(info);
		else if (nc == Hdr1_prnt_lcl_cd) doHdr1_prnt_lcl_cd_NC(info);
		else if (nc == Hdr1_asppl_cd) doHdr1_asppl_cd_NC(info);
		else if (nc == Hdr1_asppl_nm) doHdr1_asppl_nm_NC(info);
		else if (nc == Hdr1_trd_cur_cd) doHdr1_trd_cur_cd_NC(info);
		else if (nc == Hdr1_trd_cur_nm) doHdr1_trd_cur_nm_NC(info);
		else if (nc == Hdr1_trd_cur_upri_dec_place) doHdr1_trd_cur_upri_dec_place_NC(info);
		else if (nc == Hdr1_trd_cur_amt_dec_place) doHdr1_trd_cur_amt_dec_place_NC(info);
		else if (nc == Hdr1_ptax_cur_cd) doHdr1_ptax_cur_cd_NC(info);
		else if (nc == Hdr1_ptax_cur_nm) doHdr1_ptax_cur_nm_NC(info);
		else if (nc == Hdr1_ptax_cur_upri_dec_place) doHdr1_ptax_cur_upri_dec_place_NC(info);
		else if (nc == Hdr1_ptax_cur_amt_dec_place) doHdr1_ptax_cur_amt_dec_place_NC(info);
		else if (nc == Hdr1_ptax_xrate_inpt_flg) doHdr1_ptax_xrate_inpt_flg_NC(info);
		else if (nc == Hdr1_base_cur_cd) doHdr1_base_cur_cd_NC(info);
		else if (nc == Hdr1_base_cur_nm) doHdr1_base_cur_nm_NC(info);
		else if (nc == Hdr1_base_cur_upri_dec_place) doHdr1_base_cur_upri_dec_place_NC(info);
		else if (nc == Hdr1_base_cur_amt_dec_place) doHdr1_base_cur_amt_dec_place_NC(info);
		else if (nc == Hdr1_xrate_inpt_flg) doHdr1_xrate_inpt_flg_NC(info);
		else if (nc == Hdr1_xrate_cd) doHdr1_xrate_cd_NC(info);
		else if (nc == Hdr1_purc_amt_rnd_typ) doHdr1_purc_amt_rnd_typ_NC(info);
		else if (nc == Hdr1_purc_tax_rnd_typ) doHdr1_purc_tax_rnd_typ_NC(info);
		else if (nc == Hdr1_purc_tax_calc_typ) doHdr1_purc_tax_calc_typ_NC(info);
		else if (nc == Hdr1_purc_tax_cd) doHdr1_purc_tax_cd_NC(info);
		else if (nc == Hdr1_purc_tax_cd_prio_flg) doHdr1_purc_tax_cd_prio_flg_NC(info);
		else if (nc == Hdr1_ret_sppl_nm) doHdr1_ret_sppl_nm_NC(info);
		else if (nc == Hdr1_ret_sppl_enable_flg) doHdr1_ret_sppl_enable_flg_NC(info);
		else if (nc == Hdr1_ret_sppl_cntct_psn_title) doHdr1_ret_sppl_cntct_psn_title_NC(info);
		else if (nc == Hdr1_rcpt_iv_no) doHdr1_rcpt_iv_no_NC(info);
		else if (nc == Hdr1_ref_rcpt_iv_no) doHdr1_ref_rcpt_iv_no_NC(info);
		else if (nc == Hdr1_def_purc_usr_cd) doHdr1_def_purc_usr_cd_NC(info);
		else if (nc == Hdr1_def_purc_dpt_cd) doHdr1_def_purc_dpt_cd_NC(info);
		else if (nc == Hdr1_ap_dpt_flg) doHdr1_ap_dpt_flg_NC(info);
		else if (nc == Hdr1_purc_dpt_wg_cd) doHdr1_purc_dpt_wg_cd_NC(info);
		else if (nc == Hdr1_purc_dpt_wg_nm) doHdr1_purc_dpt_wg_nm_NC(info);
		else if (nc == Hdr1_purc_ret_print_rmrks) doHdr1_purc_ret_print_rmrks_NC(info);
		else if (nc == Hdr1_trd_rmrks) doHdr1_trd_rmrks_NC(info);
		else if (nc == Hdr1_intr_rmrks) doHdr1_intr_rmrks_NC(info);
		else if (nc == Hdr1_sub_char1) doHdr1_sub_char1_NC(info);
		else if (nc == Hdr1_sub_char2) doHdr1_sub_char2_NC(info);
		else if (nc == Hdr1_sub_char3) doHdr1_sub_char3_NC(info);
		else if (nc == Hdr1_tterm_cd1) doHdr1_tterm_cd1_NC(info);
		else if (nc == Hdr1_tterm_nm1) doHdr1_tterm_nm1_NC(info);
		else if (nc == Hdr1_tterm_rmrks1) doHdr1_tterm_rmrks1_NC(info);
		else if (nc == Hdr1_tterm_cd2) doHdr1_tterm_cd2_NC(info);
		else if (nc == Hdr1_tterm_nm2) doHdr1_tterm_nm2_NC(info);
		else if (nc == Hdr1_tterm_rmrks2) doHdr1_tterm_rmrks2_NC(info);
		else if (nc == Hdr1_tterm_cd3) doHdr1_tterm_cd3_NC(info);
		else if (nc == Hdr1_tterm_nm3) doHdr1_tterm_nm3_NC(info);
		else if (nc == Hdr1_tterm_rmrks3) doHdr1_tterm_rmrks3_NC(info);
		else if (nc == Hdr1_pr_schd_upd_cntr) doHdr1_pr_schd_upd_cntr_NC(info);
		else if (nc == Hdr1_ins_usr_id) doHdr1_ins_usr_id_NC(info);
		else if (nc == Hdr1_ins_usr_nm) doHdr1_ins_usr_nm_NC(info);
		else if (nc == Hdr1_ins_func_id) doHdr1_ins_func_id_NC(info);
		else if (nc == Hdr1_ins_func_nm) doHdr1_ins_func_nm_NC(info);
		else if (nc == Hdr1_upd_usr_id) doHdr1_upd_usr_id_NC(info);
		else if (nc == Hdr1_upd_usr_nm) doHdr1_upd_usr_nm_NC(info);
		else if (nc == Hdr1_upd_func_id) doHdr1_upd_func_id_NC(info);
		else if (nc == Hdr1_upd_func_nm) doHdr1_upd_func_nm_NC(info);
		else if (nc == Hdr1_ins_ts) doHdr1_ins_ts_NC(info);
		else if (nc == Hdr1_upd_ts) doHdr1_upd_ts_NC(info);
		else if (nc == Hdr1_upd_srv_req_no) doHdr1_upd_srv_req_no_NC(info);
		else if (nc == columnDtl1_peg_no) doDtl1_peg_no_NC(info);
		else if (nc == columnDtl1_cmpl_flg) doDtl1_cmpl_flg_NC(info);
		else if (nc == columnDtl1_abort_flg) doDtl1_abort_flg_NC(info);
		else if (nc == columnDtl1_purc_ret_loc_wg_cd) doDtl1_purc_ret_loc_wg_cd_NC(info);
		else if (nc == columnDtl1_purc_ret_loc_wg_nm) doDtl1_purc_ret_loc_wg_nm_NC(info);
		else if (nc == columnDtl1_purc_ret_loc_cd) doDtl1_purc_ret_loc_cd_NC(info);
		else if (nc == columnDtl1_purc_ret_loc_nm) doDtl1_purc_ret_loc_nm_NC(info);
		else if (nc == columnDtl1_purc_ret_sppl_cd) doDtl1_purc_ret_sppl_cd_NC(info);
		else if (nc == columnDtl1_str_ln_tgt_flg) doDtl1_str_ln_tgt_flg_NC(info);
		else if (nc == columnDtl1_asset_mng_typ) doDtl1_asset_mng_typ_NC(info);
		else if (nc == columnDtl1_asset_mng_typ_nm) doDtl1_asset_mng_typ_nm_NC(info);
		else if (nc == columnDtl1_iv_itm_nm) doDtl1_iv_itm_nm_NC(info);
		else if (nc == columnDtl1_sundry_itm_flg) doDtl1_sundry_itm_flg_NC(info);
		else if (nc == columnDtl1_itm_purc_upri_cng_flg) doDtl1_itm_purc_upri_cng_flg_NC(info);
		else if (nc == columnDtl1_dscnt_itm_flg) doDtl1_dscnt_itm_flg_NC(info);
		else if (nc == columnDtl1_arr_skip_flg) doDtl1_arr_skip_flg_NC(info);
		else if (nc == columnDtl1_itm_pay_crryovr_times) doDtl1_itm_pay_crryovr_times_NC(info);
		else if (nc == columnDtl1_stk_mng_typ) doDtl1_stk_mng_typ_NC(info);
		else if (nc == columnDtl1_lot_mng_typ) doDtl1_lot_mng_typ_NC(info);
		else if (nc == columnDtl1_lot_no_typ) doDtl1_lot_no_typ_NC(info);
		else if (nc == columnDtl1_sublot_mng_typ) doDtl1_sublot_mng_typ_NC(info);
		else if (nc == columnDtl1_sublot_no_typ) doDtl1_sublot_no_typ_NC(info);
		else if (nc == columnDtl1_sno1_mng_typ) doDtl1_sno1_mng_typ_NC(info);
		else if (nc == columnDtl1_sno2_mng_typ) doDtl1_sno2_mng_typ_NC(info);
		else if (nc == columnDtl1_sno3_mng_typ) doDtl1_sno3_mng_typ_NC(info);
		else if (nc == columnDtl1_sno4_mng_typ) doDtl1_sno4_mng_typ_NC(info);
		else if (nc == columnDtl1_bp_lot_no) doDtl1_bp_lot_no_NC(info);
		else if (nc == columnDtl1_ver_flg) doDtl1_ver_flg_NC(info);
		else if (nc == columnDtl1_maker_cd) doDtl1_maker_cd_NC(info);
		else if (nc == columnDtl1_maker_nm) doDtl1_maker_nm_NC(info);
		else if (nc == columnDtl1_sppl_itm_cd) doDtl1_sppl_itm_cd_NC(info);
		else if (nc == columnDtl1_sppl_itm_nm) doDtl1_sppl_itm_nm_NC(info);
		else if (nc == columnDtl1_purc_typ) doDtl1_purc_typ_NC(info);
		else if (nc == columnDtl1_purc_typ_nm) doDtl1_purc_typ_nm_NC(info);
		else if (nc == columnDtl1_trd_unit_cd) doDtl1_trd_unit_cd_NC(info);
		else if (nc == columnDtl1_trd_unit_nm) doDtl1_trd_unit_nm_NC(info);
		else if (nc == columnDtl1_trd_unit_dec_place) doDtl1_trd_unit_dec_place_NC(info);
		else if (nc == columnDtl1_trd_unit_rnd_typ) doDtl1_trd_unit_rnd_typ_NC(info);
		else if (nc == columnDtl1_trd_unit_dmn_qty) doDtl1_trd_unit_dmn_qty_NC(info);
		else if (nc == columnDtl1_trd_unit_conv_qty) doDtl1_trd_unit_conv_qty_NC(info);
		else if (nc == columnDtl1_base_unit_cd) doDtl1_base_unit_cd_NC(info);
		else if (nc == columnDtl1_base_unit_nm) doDtl1_base_unit_nm_NC(info);
		else if (nc == columnDtl1_base_unit_dec_place) doDtl1_base_unit_dec_place_NC(info);
		else if (nc == columnDtl1_base_unit_rnd_typ) doDtl1_base_unit_rnd_typ_NC(info);
		else if (nc == columnDtl1_repurc_obli_flg) doDtl1_repurc_obli_flg_NC(info);
		else if (nc == columnDtl1_loc_mng_typ) doDtl1_loc_mng_typ_NC(info);
		else if (nc == columnDtl1_wtax_rate) doDtl1_wtax_rate_NC(info);
		else if (nc == columnDtl1_mfg_inst_no) doDtl1_mfg_inst_no_NC(info);
		else if (nc == columnDtl1_po_no) doDtl1_po_no_NC(info);
		else if (nc == columnDtl1_quality_typ) doDtl1_quality_typ_NC(info);
		else if (nc == columnDtl1_quality_typ_nm) doDtl1_quality_typ_nm_NC(info);
		else if (nc == columnDtl1_insp_flg) doDtl1_insp_flg_NC(info);
		else if (nc == columnDtl1_stk_id_typ) doDtl1_stk_id_typ_NC(info);
		else if (nc == columnDtl1_stk_id_typ_nm) doDtl1_stk_id_typ_nm_NC(info);
		else if (nc == columnDtl1_purc_id_typ) doDtl1_purc_id_typ_NC(info);
		else if (nc == columnDtl1_purc_id_typ_nm) doDtl1_purc_id_typ_nm_NC(info);
		else if (nc == columnDtl1_gd_cd) doDtl1_gd_cd_NC(info);
		else if (nc == columnDtl1_gd_nm) doDtl1_gd_nm_NC(info);
		else if (nc == columnDtl1_stk_arrv_bp_cd) doDtl1_stk_arrv_bp_cd_NC(info);
		else if (nc == columnDtl1_stk_arrv_bp_nm) doDtl1_stk_arrv_bp_nm_NC(info);
		else if (nc == columnDtl1_purc_ret_rsn_cd) doDtl1_purc_ret_rsn_cd_NC(info);
		else if (nc == columnDtl1_purc_ret_rsn_nm) doDtl1_purc_ret_rsn_nm_NC(info);
		else if (nc == columnDtl1_ap_dpt_cd) doDtl1_ap_dpt_cd_NC(info);
		else if (nc == columnDtl1_ap_dpt_nm) doDtl1_ap_dpt_nm_NC(info);
		else if (nc == columnDtl1_pay_crryovr_times) doDtl1_pay_crryovr_times_NC(info);
		else if (nc == columnDtl1_xpns_purc_flg) doDtl1_xpns_purc_flg_NC(info);
		else if (nc == columnDtl1_bd_lot_mng_typ) doDtl1_bd_lot_mng_typ_NC(info);
		else if (nc == columnDtl1_bd_sublot_mng_typ) doDtl1_bd_sublot_mng_typ_NC(info);
		else if (nc == columnDtl1_bd_lot_no_typ) doDtl1_bd_lot_no_typ_NC(info);
		else if (nc == columnDtl1_bd_sublot_no_typ) doDtl1_bd_sublot_no_typ_NC(info);
		else if (nc == columnDtl1_bd_sno1_mng_typ) doDtl1_bd_sno1_mng_typ_NC(info);
		else if (nc == columnDtl1_bd_sno2_mng_typ) doDtl1_bd_sno2_mng_typ_NC(info);
		else if (nc == columnDtl1_bd_sno3_mng_typ) doDtl1_bd_sno3_mng_typ_NC(info);
		else if (nc == columnDtl1_bd_sno4_mng_typ) doDtl1_bd_sno4_mng_typ_NC(info);
		else if (nc == columnDtl1_cont_fctr_flg) doDtl1_cont_fctr_flg_NC(info);
		else if (nc == columnDtl1_cont_fctr_rnd_typ) doDtl1_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnDtl1_cont_fctr_dec_place) doDtl1_cont_fctr_dec_place_NC(info);
		else if (nc == columnDtl1_trd_d_rmrks) doDtl1_trd_d_rmrks_NC(info);
		else if (nc == columnDtl1_intr_d_rmrks) doDtl1_intr_d_rmrks_NC(info);
		else if (nc == columnDtl1_purc_ret_print_d_rmrks) doDtl1_purc_ret_print_d_rmrks_NC(info);
		else if (nc == columnDtl1_sub_char1) doDtl1_sub_char1_NC(info);
		else if (nc == columnDtl1_sub_char2) doDtl1_sub_char2_NC(info);
		else if (nc == columnDtl1_sub_char3) doDtl1_sub_char3_NC(info);
		else if (nc == columnDtl1_ref_arr_act_no) doDtl1_ref_arr_act_no_NC(info);
		else if (nc == columnDtl1_ref_arr_act_rev) doDtl1_ref_arr_act_rev_NC(info);
		else if (nc == columnDtl1_ref_purc_act_no) doDtl1_ref_purc_act_no_NC(info);
		else if (nc == columnDtl1_ref_purc_act_seq) doDtl1_ref_purc_act_seq_NC(info);
		else if (nc == columnDtl1_ref_purc_act_rev) doDtl1_ref_purc_act_rev_NC(info);
		else if (nc == columnDtl1_ref_purc_act_d_no) doDtl1_ref_purc_act_d_no_NC(info);
		else if (nc == columnDtl1_ref_purc_act_d_seq) doDtl1_ref_purc_act_d_seq_NC(info);
		else if (nc == columnDtl1_purc_ret_schd_d_no) doDtl1_purc_ret_schd_d_no_NC(info);
		else if (nc == columnDtl1_base_purc_ac_dt) doDtl1_base_purc_ac_dt_NC(info);
		else if (nc == columnDtl1_base_ac_dt) doDtl1_base_ac_dt_NC(info);
		else if (nc == columnDtl1_disp_seq) doDtl1_disp_seq_NC(info);
		else if (nc == columnDtl2_dtl_peg_no) doDtl2_dtl_peg_no_NC(info);
		else if (nc == columnDtl2_peg_no) doDtl2_peg_no_NC(info);
		else if (nc == columnDtl2_purc_ret_loc_wg_cd) doDtl2_purc_ret_loc_wg_cd_NC(info);
		else if (nc == columnDtl2_purc_ret_loc_wg_nm) doDtl2_purc_ret_loc_wg_nm_NC(info);
		else if (nc == columnDtl2_purc_ret_loc_cd) doDtl2_purc_ret_loc_cd_NC(info);
		else if (nc == columnDtl2_purc_ret_loc_nm) doDtl2_purc_ret_loc_nm_NC(info);
		else if (nc == columnDtl2_purc_ret_sppl_cd) doDtl2_purc_ret_sppl_cd_NC(info);
		else if (nc == columnDtl2_str_ln_tgt_flg) doDtl2_str_ln_tgt_flg_NC(info);
		else if (nc == columnDtl2_asset_mng_typ) doDtl2_asset_mng_typ_NC(info);
		else if (nc == columnDtl2_asset_mng_typ_nm) doDtl2_asset_mng_typ_nm_NC(info);
		else if (nc == columnDtl2_iv_itm_nm) doDtl2_iv_itm_nm_NC(info);
		else if (nc == columnDtl2_sundry_itm_flg) doDtl2_sundry_itm_flg_NC(info);
		else if (nc == columnDtl2_stk_mng_typ) doDtl2_stk_mng_typ_NC(info);
		else if (nc == columnDtl2_lot_mng_typ) doDtl2_lot_mng_typ_NC(info);
		else if (nc == columnDtl2_lot_no_typ) doDtl2_lot_no_typ_NC(info);
		else if (nc == columnDtl2_sublot_mng_typ) doDtl2_sublot_mng_typ_NC(info);
		else if (nc == columnDtl2_sublot_no_typ) doDtl2_sublot_no_typ_NC(info);
		else if (nc == columnDtl2_sno1_mng_typ) doDtl2_sno1_mng_typ_NC(info);
		else if (nc == columnDtl2_sno2_mng_typ) doDtl2_sno2_mng_typ_NC(info);
		else if (nc == columnDtl2_sno3_mng_typ) doDtl2_sno3_mng_typ_NC(info);
		else if (nc == columnDtl2_sno4_mng_typ) doDtl2_sno4_mng_typ_NC(info);
		else if (nc == columnDtl2_dscnt_itm_flg) doDtl2_dscnt_itm_flg_NC(info);
		else if (nc == columnDtl2_bp_lot_no) doDtl2_bp_lot_no_NC(info);
		else if (nc == columnDtl2_ver_flg) doDtl2_ver_flg_NC(info);
		else if (nc == columnDtl2_trd_unit_cd) doDtl2_trd_unit_cd_NC(info);
		else if (nc == columnDtl2_trd_unit_nm) doDtl2_trd_unit_nm_NC(info);
		else if (nc == columnDtl2_trd_unit_dec_place) doDtl2_trd_unit_dec_place_NC(info);
		else if (nc == columnDtl2_trd_unit_rnd_typ) doDtl2_trd_unit_rnd_typ_NC(info);
		else if (nc == columnDtl2_trd_unit_dmn_qty) doDtl2_trd_unit_dmn_qty_NC(info);
		else if (nc == columnDtl2_trd_unit_conv_qty) doDtl2_trd_unit_conv_qty_NC(info);
		else if (nc == columnDtl2_base_unit_cd) doDtl2_base_unit_cd_NC(info);
		else if (nc == columnDtl2_base_unit_nm) doDtl2_base_unit_nm_NC(info);
		else if (nc == columnDtl2_base_unit_dec_place) doDtl2_base_unit_dec_place_NC(info);
		else if (nc == columnDtl2_base_unit_rnd_typ) doDtl2_base_unit_rnd_typ_NC(info);
		else if (nc == columnDtl2_quality_typ) doDtl2_quality_typ_NC(info);
		else if (nc == columnDtl2_quality_typ_nm) doDtl2_quality_typ_nm_NC(info);
		else if (nc == columnDtl2_stk_id_typ) doDtl2_stk_id_typ_NC(info);
		else if (nc == columnDtl2_stk_id_typ_nm) doDtl2_stk_id_typ_nm_NC(info);
		else if (nc == columnDtl2_gd_cd) doDtl2_gd_cd_NC(info);
		else if (nc == columnDtl2_gd_nm) doDtl2_gd_nm_NC(info);
		else if (nc == columnDtl2_stk_arrv_bp_cd) doDtl2_stk_arrv_bp_cd_NC(info);
		else if (nc == columnDtl2_stk_arrv_bp_nm) doDtl2_stk_arrv_bp_nm_NC(info);
		else if (nc == columnDtl2_cont_fctr_flg) doDtl2_cont_fctr_flg_NC(info);
		else if (nc == columnDtl2_cont_fctr_rnd_typ) doDtl2_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnDtl2_cont_fctr_dec_place) doDtl2_cont_fctr_dec_place_NC(info);
		else if (nc == columnDtl2_sub_char1) doDtl2_sub_char1_NC(info);
		else if (nc == columnDtl2_sub_char2) doDtl2_sub_char2_NC(info);
		else if (nc == columnDtl2_sub_char3) doDtl2_sub_char3_NC(info);
		else if (nc == columnDtl2_ref_arr_act_no) doDtl2_ref_arr_act_no_NC(info);
		else if (nc == columnDtl2_ref_arr_act_rev) doDtl2_ref_arr_act_rev_NC(info);
		else if (nc == columnDtl2_ref_purc_act_io_no) doDtl2_ref_purc_act_io_no_NC(info);
		else if (nc == columnDtl2_ref_purc_act_io_seq) doDtl2_ref_purc_act_io_seq_NC(info);
		else if (nc == columnDtl2_purc_ret_schd_io_no) doDtl2_purc_ret_schd_io_no_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
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
	 * [Hdr1]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_ret_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_ret_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[reg_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_reg_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[subcon_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_subcon_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[repurc_obli_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_repurc_obli_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[outsrc_upri_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_outsrc_upri_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[mst_ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_mst_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pay_spot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pay_spot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sppl_pay_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sppl_pay_crryovr_times_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sppl_iv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sppl_iv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[prnt_lcl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_prnt_lcl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[asppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_asppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[asppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_asppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ptax_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ptax_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ptax_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ptax_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ptax_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ptax_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ptax_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ptax_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ptax_xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ptax_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[base_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_base_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[base_cur_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_base_cur_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[base_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_base_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_amt_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_amt_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_tax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_tax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_tax_calc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_tax_calc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_tax_cd_prio_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_tax_cd_prio_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ret_sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ret_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ret_sppl_enable_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ret_sppl_enable_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ret_sppl_cntct_psn_title]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ret_sppl_cntct_psn_title_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ref_rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ref_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[def_purc_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_def_purc_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[def_purc_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_def_purc_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ap_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ap_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_dpt_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_dpt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_dpt_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_dpt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_ret_print_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_ret_print_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_rmrks1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_rmrks1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_rmrks2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_rmrks2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_rmrks3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_rmrks3_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pr_schd_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pr_schd_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[peg_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_peg_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_abort_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_loc_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_loc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_loc_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_loc_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[asset_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_asset_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[iv_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_iv_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[itm_purc_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_itm_purc_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dscnt_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dscnt_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[arr_skip_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_arr_skip_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[itm_pay_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_itm_pay_crryovr_times_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[lot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_lot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sublot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sublot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bp_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bp_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ver_flg_NC(MCEventInfo info){
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
	 * [Dtl1]パネルの[purc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_typ_nm_NC(MCEventInfo info){
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
	 * [Dtl1]パネルの[trd_unit_dmn_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_dmn_qty_NC(MCEventInfo info){
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
	 * [Dtl1]パネルの[repurc_obli_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_repurc_obli_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[loc_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_loc_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[wtax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_wtax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[insp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_insp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[stk_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_stk_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[stk_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_stk_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_gd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[stk_arrv_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_stk_arrv_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[stk_arrv_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_stk_arrv_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ap_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ap_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[pay_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_pay_crryovr_times_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[xpns_purc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_xpns_purc_flg_NC(MCEventInfo info){
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
	 * [Dtl1]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_print_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_print_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_arr_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_arr_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_arr_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_arr_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_purc_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_purc_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_purc_act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_purc_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_purc_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_purc_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_purc_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_purc_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_purc_act_d_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_purc_act_d_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_schd_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_schd_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_purc_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_purc_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dtl_peg_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dtl_peg_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[peg_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_peg_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_ret_loc_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_ret_loc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_ret_loc_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_ret_loc_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_ret_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_ret_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_ret_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_ret_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_ret_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_ret_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[asset_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_asset_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[iv_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_iv_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[lot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_lot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sublot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sublot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dscnt_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dscnt_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bp_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bp_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ver_flg_NC(MCEventInfo info){
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
	 * [Dtl2]パネルの[trd_unit_dmn_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_dmn_qty_NC(MCEventInfo info){
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
	 * [Dtl2]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[stk_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_stk_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[stk_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_stk_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_gd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[stk_arrv_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_stk_arrv_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[stk_arrv_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_stk_arrv_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ref_arr_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ref_arr_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ref_arr_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ref_arr_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ref_purc_act_io_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ref_purc_act_io_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ref_purc_act_io_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ref_purc_act_io_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_ret_schd_io_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_ret_schd_io_no_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == FoldTab) doFold_NE(info);
		else if (ne == Dtl1Table) doDtl1_NE(info);
		else if (ne == Dtl2Table) doDtl2_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_NE(info);
		else if (ne == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_NE(info);
		else if (ne == Cnd_srch_tgt_no) doCnd_srch_tgt_no_NE(info);
		else if (ne == Hdr1_trd_cd) doHdr1_trd_cd_NE(info);
		else if (ne == Hdr1_trd_nm) doHdr1_trd_nm_NE(info);
		else if (ne == Hdr1_trd_ptn_typ) doHdr1_trd_ptn_typ_NE(info);
		else if (ne == Hdr1_purc_ret_schd_no) doHdr1_purc_ret_schd_no_NE(info);
		else if (ne == Hdr1_reg_dt) doHdr1_reg_dt_NE(info);
		else if (ne == Hdr1_schd_dt) doHdr1_schd_dt_NE(info);
		else if (ne == Hdr1_sppl_cd) doHdr1_sppl_cd_NE(info);
		else if (ne == Hdr1_sppl_nm) doHdr1_sppl_nm_NE(info);
		else if (ne == Hdr1_purc_upri_cng_flg) doHdr1_purc_upri_cng_flg_NE(info);
		else if (ne == Hdr1_subcon_flg) doHdr1_subcon_flg_NE(info);
		else if (ne == Hdr1_repurc_obli_flg) doHdr1_repurc_obli_flg_NE(info);
		else if (ne == Hdr1_outsrc_upri_typ) doHdr1_outsrc_upri_typ_NE(info);
		else if (ne == Hdr1_ap_dpt_cd) doHdr1_ap_dpt_cd_NE(info);
		else if (ne == Hdr1_mst_ap_dpt_cd) doHdr1_mst_ap_dpt_cd_NE(info);
		else if (ne == Hdr1_pay_spot_flg) doHdr1_pay_spot_flg_NE(info);
		else if (ne == Hdr1_sppl_pay_crryovr_times) doHdr1_sppl_pay_crryovr_times_NE(info);
		else if (ne == Hdr1_sppl_iv_flg) doHdr1_sppl_iv_flg_NE(info);
		else if (ne == Hdr1_prnt_lcl_cd) doHdr1_prnt_lcl_cd_NE(info);
		else if (ne == Hdr1_asppl_cd) doHdr1_asppl_cd_NE(info);
		else if (ne == Hdr1_asppl_nm) doHdr1_asppl_nm_NE(info);
		else if (ne == Hdr1_trd_cur_cd) doHdr1_trd_cur_cd_NE(info);
		else if (ne == Hdr1_trd_cur_nm) doHdr1_trd_cur_nm_NE(info);
		else if (ne == Hdr1_trd_cur_upri_dec_place) doHdr1_trd_cur_upri_dec_place_NE(info);
		else if (ne == Hdr1_trd_cur_amt_dec_place) doHdr1_trd_cur_amt_dec_place_NE(info);
		else if (ne == Hdr1_ptax_cur_cd) doHdr1_ptax_cur_cd_NE(info);
		else if (ne == Hdr1_ptax_cur_nm) doHdr1_ptax_cur_nm_NE(info);
		else if (ne == Hdr1_ptax_cur_upri_dec_place) doHdr1_ptax_cur_upri_dec_place_NE(info);
		else if (ne == Hdr1_ptax_cur_amt_dec_place) doHdr1_ptax_cur_amt_dec_place_NE(info);
		else if (ne == Hdr1_ptax_xrate_inpt_flg) doHdr1_ptax_xrate_inpt_flg_NE(info);
		else if (ne == Hdr1_base_cur_cd) doHdr1_base_cur_cd_NE(info);
		else if (ne == Hdr1_base_cur_nm) doHdr1_base_cur_nm_NE(info);
		else if (ne == Hdr1_base_cur_upri_dec_place) doHdr1_base_cur_upri_dec_place_NE(info);
		else if (ne == Hdr1_base_cur_amt_dec_place) doHdr1_base_cur_amt_dec_place_NE(info);
		else if (ne == Hdr1_xrate_inpt_flg) doHdr1_xrate_inpt_flg_NE(info);
		else if (ne == Hdr1_xrate_cd) doHdr1_xrate_cd_NE(info);
		else if (ne == Hdr1_purc_amt_rnd_typ) doHdr1_purc_amt_rnd_typ_NE(info);
		else if (ne == Hdr1_purc_tax_rnd_typ) doHdr1_purc_tax_rnd_typ_NE(info);
		else if (ne == Hdr1_purc_tax_calc_typ) doHdr1_purc_tax_calc_typ_NE(info);
		else if (ne == Hdr1_purc_tax_cd) doHdr1_purc_tax_cd_NE(info);
		else if (ne == Hdr1_purc_tax_cd_prio_flg) doHdr1_purc_tax_cd_prio_flg_NE(info);
		else if (ne == Hdr1_ret_sppl_nm) doHdr1_ret_sppl_nm_NE(info);
		else if (ne == Hdr1_ret_sppl_enable_flg) doHdr1_ret_sppl_enable_flg_NE(info);
		else if (ne == Hdr1_ret_sppl_cntct_psn_title) doHdr1_ret_sppl_cntct_psn_title_NE(info);
		else if (ne == Hdr1_rcpt_iv_no) doHdr1_rcpt_iv_no_NE(info);
		else if (ne == Hdr1_ref_rcpt_iv_no) doHdr1_ref_rcpt_iv_no_NE(info);
		else if (ne == Hdr1_def_purc_usr_cd) doHdr1_def_purc_usr_cd_NE(info);
		else if (ne == Hdr1_def_purc_dpt_cd) doHdr1_def_purc_dpt_cd_NE(info);
		else if (ne == Hdr1_ap_dpt_flg) doHdr1_ap_dpt_flg_NE(info);
		else if (ne == Hdr1_purc_dpt_wg_cd) doHdr1_purc_dpt_wg_cd_NE(info);
		else if (ne == Hdr1_purc_dpt_wg_nm) doHdr1_purc_dpt_wg_nm_NE(info);
		else if (ne == Hdr1_purc_ret_print_rmrks) doHdr1_purc_ret_print_rmrks_NE(info);
		else if (ne == Hdr1_trd_rmrks) doHdr1_trd_rmrks_NE(info);
		else if (ne == Hdr1_intr_rmrks) doHdr1_intr_rmrks_NE(info);
		else if (ne == Hdr1_sub_char1) doHdr1_sub_char1_NE(info);
		else if (ne == Hdr1_sub_char2) doHdr1_sub_char2_NE(info);
		else if (ne == Hdr1_sub_char3) doHdr1_sub_char3_NE(info);
		else if (ne == Hdr1_tterm_cd1) doHdr1_tterm_cd1_NE(info);
		else if (ne == Hdr1_tterm_nm1) doHdr1_tterm_nm1_NE(info);
		else if (ne == Hdr1_tterm_rmrks1) doHdr1_tterm_rmrks1_NE(info);
		else if (ne == Hdr1_tterm_cd2) doHdr1_tterm_cd2_NE(info);
		else if (ne == Hdr1_tterm_nm2) doHdr1_tterm_nm2_NE(info);
		else if (ne == Hdr1_tterm_rmrks2) doHdr1_tterm_rmrks2_NE(info);
		else if (ne == Hdr1_tterm_cd3) doHdr1_tterm_cd3_NE(info);
		else if (ne == Hdr1_tterm_nm3) doHdr1_tterm_nm3_NE(info);
		else if (ne == Hdr1_tterm_rmrks3) doHdr1_tterm_rmrks3_NE(info);
		else if (ne == Hdr1_pr_schd_upd_cntr) doHdr1_pr_schd_upd_cntr_NE(info);
		else if (ne == Hdr1_ins_usr_id) doHdr1_ins_usr_id_NE(info);
		else if (ne == Hdr1_ins_usr_nm) doHdr1_ins_usr_nm_NE(info);
		else if (ne == Hdr1_ins_func_id) doHdr1_ins_func_id_NE(info);
		else if (ne == Hdr1_ins_func_nm) doHdr1_ins_func_nm_NE(info);
		else if (ne == Hdr1_upd_usr_id) doHdr1_upd_usr_id_NE(info);
		else if (ne == Hdr1_upd_usr_nm) doHdr1_upd_usr_nm_NE(info);
		else if (ne == Hdr1_upd_func_id) doHdr1_upd_func_id_NE(info);
		else if (ne == Hdr1_upd_func_nm) doHdr1_upd_func_nm_NE(info);
		else if (ne == Hdr1_ins_ts) doHdr1_ins_ts_NE(info);
		else if (ne == Hdr1_upd_ts) doHdr1_upd_ts_NE(info);
		else if (ne == Hdr1_upd_srv_req_no) doHdr1_upd_srv_req_no_NE(info);
		else if (ne == columnDtl1_peg_no) doDtl1_peg_no_NE(info);
		else if (ne == columnDtl1_cmpl_flg) doDtl1_cmpl_flg_NE(info);
		else if (ne == columnDtl1_abort_flg) doDtl1_abort_flg_NE(info);
		else if (ne == columnDtl1_purc_ret_loc_wg_cd) doDtl1_purc_ret_loc_wg_cd_NE(info);
		else if (ne == columnDtl1_purc_ret_loc_wg_nm) doDtl1_purc_ret_loc_wg_nm_NE(info);
		else if (ne == columnDtl1_purc_ret_loc_cd) doDtl1_purc_ret_loc_cd_NE(info);
		else if (ne == columnDtl1_purc_ret_loc_nm) doDtl1_purc_ret_loc_nm_NE(info);
		else if (ne == columnDtl1_purc_ret_sppl_cd) doDtl1_purc_ret_sppl_cd_NE(info);
		else if (ne == columnDtl1_str_ln_tgt_flg) doDtl1_str_ln_tgt_flg_NE(info);
		else if (ne == columnDtl1_asset_mng_typ) doDtl1_asset_mng_typ_NE(info);
		else if (ne == columnDtl1_asset_mng_typ_nm) doDtl1_asset_mng_typ_nm_NE(info);
		else if (ne == columnDtl1_iv_itm_nm) doDtl1_iv_itm_nm_NE(info);
		else if (ne == columnDtl1_sundry_itm_flg) doDtl1_sundry_itm_flg_NE(info);
		else if (ne == columnDtl1_itm_purc_upri_cng_flg) doDtl1_itm_purc_upri_cng_flg_NE(info);
		else if (ne == columnDtl1_dscnt_itm_flg) doDtl1_dscnt_itm_flg_NE(info);
		else if (ne == columnDtl1_arr_skip_flg) doDtl1_arr_skip_flg_NE(info);
		else if (ne == columnDtl1_itm_pay_crryovr_times) doDtl1_itm_pay_crryovr_times_NE(info);
		else if (ne == columnDtl1_stk_mng_typ) doDtl1_stk_mng_typ_NE(info);
		else if (ne == columnDtl1_lot_mng_typ) doDtl1_lot_mng_typ_NE(info);
		else if (ne == columnDtl1_lot_no_typ) doDtl1_lot_no_typ_NE(info);
		else if (ne == columnDtl1_sublot_mng_typ) doDtl1_sublot_mng_typ_NE(info);
		else if (ne == columnDtl1_sublot_no_typ) doDtl1_sublot_no_typ_NE(info);
		else if (ne == columnDtl1_sno1_mng_typ) doDtl1_sno1_mng_typ_NE(info);
		else if (ne == columnDtl1_sno2_mng_typ) doDtl1_sno2_mng_typ_NE(info);
		else if (ne == columnDtl1_sno3_mng_typ) doDtl1_sno3_mng_typ_NE(info);
		else if (ne == columnDtl1_sno4_mng_typ) doDtl1_sno4_mng_typ_NE(info);
		else if (ne == columnDtl1_bp_lot_no) doDtl1_bp_lot_no_NE(info);
		else if (ne == columnDtl1_ver_flg) doDtl1_ver_flg_NE(info);
		else if (ne == columnDtl1_maker_cd) doDtl1_maker_cd_NE(info);
		else if (ne == columnDtl1_maker_nm) doDtl1_maker_nm_NE(info);
		else if (ne == columnDtl1_sppl_itm_cd) doDtl1_sppl_itm_cd_NE(info);
		else if (ne == columnDtl1_sppl_itm_nm) doDtl1_sppl_itm_nm_NE(info);
		else if (ne == columnDtl1_purc_typ) doDtl1_purc_typ_NE(info);
		else if (ne == columnDtl1_purc_typ_nm) doDtl1_purc_typ_nm_NE(info);
		else if (ne == columnDtl1_trd_unit_cd) doDtl1_trd_unit_cd_NE(info);
		else if (ne == columnDtl1_trd_unit_nm) doDtl1_trd_unit_nm_NE(info);
		else if (ne == columnDtl1_trd_unit_dec_place) doDtl1_trd_unit_dec_place_NE(info);
		else if (ne == columnDtl1_trd_unit_rnd_typ) doDtl1_trd_unit_rnd_typ_NE(info);
		else if (ne == columnDtl1_trd_unit_dmn_qty) doDtl1_trd_unit_dmn_qty_NE(info);
		else if (ne == columnDtl1_trd_unit_conv_qty) doDtl1_trd_unit_conv_qty_NE(info);
		else if (ne == columnDtl1_base_unit_cd) doDtl1_base_unit_cd_NE(info);
		else if (ne == columnDtl1_base_unit_nm) doDtl1_base_unit_nm_NE(info);
		else if (ne == columnDtl1_base_unit_dec_place) doDtl1_base_unit_dec_place_NE(info);
		else if (ne == columnDtl1_base_unit_rnd_typ) doDtl1_base_unit_rnd_typ_NE(info);
		else if (ne == columnDtl1_repurc_obli_flg) doDtl1_repurc_obli_flg_NE(info);
		else if (ne == columnDtl1_loc_mng_typ) doDtl1_loc_mng_typ_NE(info);
		else if (ne == columnDtl1_wtax_rate) doDtl1_wtax_rate_NE(info);
		else if (ne == columnDtl1_mfg_inst_no) doDtl1_mfg_inst_no_NE(info);
		else if (ne == columnDtl1_po_no) doDtl1_po_no_NE(info);
		else if (ne == columnDtl1_quality_typ) doDtl1_quality_typ_NE(info);
		else if (ne == columnDtl1_quality_typ_nm) doDtl1_quality_typ_nm_NE(info);
		else if (ne == columnDtl1_insp_flg) doDtl1_insp_flg_NE(info);
		else if (ne == columnDtl1_stk_id_typ) doDtl1_stk_id_typ_NE(info);
		else if (ne == columnDtl1_stk_id_typ_nm) doDtl1_stk_id_typ_nm_NE(info);
		else if (ne == columnDtl1_purc_id_typ) doDtl1_purc_id_typ_NE(info);
		else if (ne == columnDtl1_purc_id_typ_nm) doDtl1_purc_id_typ_nm_NE(info);
		else if (ne == columnDtl1_gd_cd) doDtl1_gd_cd_NE(info);
		else if (ne == columnDtl1_gd_nm) doDtl1_gd_nm_NE(info);
		else if (ne == columnDtl1_stk_arrv_bp_cd) doDtl1_stk_arrv_bp_cd_NE(info);
		else if (ne == columnDtl1_stk_arrv_bp_nm) doDtl1_stk_arrv_bp_nm_NE(info);
		else if (ne == columnDtl1_purc_ret_rsn_cd) doDtl1_purc_ret_rsn_cd_NE(info);
		else if (ne == columnDtl1_purc_ret_rsn_nm) doDtl1_purc_ret_rsn_nm_NE(info);
		else if (ne == columnDtl1_ap_dpt_cd) doDtl1_ap_dpt_cd_NE(info);
		else if (ne == columnDtl1_ap_dpt_nm) doDtl1_ap_dpt_nm_NE(info);
		else if (ne == columnDtl1_pay_crryovr_times) doDtl1_pay_crryovr_times_NE(info);
		else if (ne == columnDtl1_xpns_purc_flg) doDtl1_xpns_purc_flg_NE(info);
		else if (ne == columnDtl1_bd_lot_mng_typ) doDtl1_bd_lot_mng_typ_NE(info);
		else if (ne == columnDtl1_bd_sublot_mng_typ) doDtl1_bd_sublot_mng_typ_NE(info);
		else if (ne == columnDtl1_bd_lot_no_typ) doDtl1_bd_lot_no_typ_NE(info);
		else if (ne == columnDtl1_bd_sublot_no_typ) doDtl1_bd_sublot_no_typ_NE(info);
		else if (ne == columnDtl1_bd_sno1_mng_typ) doDtl1_bd_sno1_mng_typ_NE(info);
		else if (ne == columnDtl1_bd_sno2_mng_typ) doDtl1_bd_sno2_mng_typ_NE(info);
		else if (ne == columnDtl1_bd_sno3_mng_typ) doDtl1_bd_sno3_mng_typ_NE(info);
		else if (ne == columnDtl1_bd_sno4_mng_typ) doDtl1_bd_sno4_mng_typ_NE(info);
		else if (ne == columnDtl1_cont_fctr_flg) doDtl1_cont_fctr_flg_NE(info);
		else if (ne == columnDtl1_cont_fctr_rnd_typ) doDtl1_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnDtl1_cont_fctr_dec_place) doDtl1_cont_fctr_dec_place_NE(info);
		else if (ne == columnDtl1_trd_d_rmrks) doDtl1_trd_d_rmrks_NE(info);
		else if (ne == columnDtl1_intr_d_rmrks) doDtl1_intr_d_rmrks_NE(info);
		else if (ne == columnDtl1_purc_ret_print_d_rmrks) doDtl1_purc_ret_print_d_rmrks_NE(info);
		else if (ne == columnDtl1_sub_char1) doDtl1_sub_char1_NE(info);
		else if (ne == columnDtl1_sub_char2) doDtl1_sub_char2_NE(info);
		else if (ne == columnDtl1_sub_char3) doDtl1_sub_char3_NE(info);
		else if (ne == columnDtl1_ref_arr_act_no) doDtl1_ref_arr_act_no_NE(info);
		else if (ne == columnDtl1_ref_arr_act_rev) doDtl1_ref_arr_act_rev_NE(info);
		else if (ne == columnDtl1_ref_purc_act_no) doDtl1_ref_purc_act_no_NE(info);
		else if (ne == columnDtl1_ref_purc_act_seq) doDtl1_ref_purc_act_seq_NE(info);
		else if (ne == columnDtl1_ref_purc_act_rev) doDtl1_ref_purc_act_rev_NE(info);
		else if (ne == columnDtl1_ref_purc_act_d_no) doDtl1_ref_purc_act_d_no_NE(info);
		else if (ne == columnDtl1_ref_purc_act_d_seq) doDtl1_ref_purc_act_d_seq_NE(info);
		else if (ne == columnDtl1_purc_ret_schd_d_no) doDtl1_purc_ret_schd_d_no_NE(info);
		else if (ne == columnDtl1_base_purc_ac_dt) doDtl1_base_purc_ac_dt_NE(info);
		else if (ne == columnDtl1_base_ac_dt) doDtl1_base_ac_dt_NE(info);
		else if (ne == columnDtl1_disp_seq) doDtl1_disp_seq_NE(info);
		else if (ne == columnDtl2_dtl_peg_no) doDtl2_dtl_peg_no_NE(info);
		else if (ne == columnDtl2_peg_no) doDtl2_peg_no_NE(info);
		else if (ne == columnDtl2_purc_ret_loc_wg_cd) doDtl2_purc_ret_loc_wg_cd_NE(info);
		else if (ne == columnDtl2_purc_ret_loc_wg_nm) doDtl2_purc_ret_loc_wg_nm_NE(info);
		else if (ne == columnDtl2_purc_ret_loc_cd) doDtl2_purc_ret_loc_cd_NE(info);
		else if (ne == columnDtl2_purc_ret_loc_nm) doDtl2_purc_ret_loc_nm_NE(info);
		else if (ne == columnDtl2_purc_ret_sppl_cd) doDtl2_purc_ret_sppl_cd_NE(info);
		else if (ne == columnDtl2_str_ln_tgt_flg) doDtl2_str_ln_tgt_flg_NE(info);
		else if (ne == columnDtl2_asset_mng_typ) doDtl2_asset_mng_typ_NE(info);
		else if (ne == columnDtl2_asset_mng_typ_nm) doDtl2_asset_mng_typ_nm_NE(info);
		else if (ne == columnDtl2_iv_itm_nm) doDtl2_iv_itm_nm_NE(info);
		else if (ne == columnDtl2_sundry_itm_flg) doDtl2_sundry_itm_flg_NE(info);
		else if (ne == columnDtl2_stk_mng_typ) doDtl2_stk_mng_typ_NE(info);
		else if (ne == columnDtl2_lot_mng_typ) doDtl2_lot_mng_typ_NE(info);
		else if (ne == columnDtl2_lot_no_typ) doDtl2_lot_no_typ_NE(info);
		else if (ne == columnDtl2_sublot_mng_typ) doDtl2_sublot_mng_typ_NE(info);
		else if (ne == columnDtl2_sublot_no_typ) doDtl2_sublot_no_typ_NE(info);
		else if (ne == columnDtl2_sno1_mng_typ) doDtl2_sno1_mng_typ_NE(info);
		else if (ne == columnDtl2_sno2_mng_typ) doDtl2_sno2_mng_typ_NE(info);
		else if (ne == columnDtl2_sno3_mng_typ) doDtl2_sno3_mng_typ_NE(info);
		else if (ne == columnDtl2_sno4_mng_typ) doDtl2_sno4_mng_typ_NE(info);
		else if (ne == columnDtl2_dscnt_itm_flg) doDtl2_dscnt_itm_flg_NE(info);
		else if (ne == columnDtl2_bp_lot_no) doDtl2_bp_lot_no_NE(info);
		else if (ne == columnDtl2_ver_flg) doDtl2_ver_flg_NE(info);
		else if (ne == columnDtl2_trd_unit_cd) doDtl2_trd_unit_cd_NE(info);
		else if (ne == columnDtl2_trd_unit_nm) doDtl2_trd_unit_nm_NE(info);
		else if (ne == columnDtl2_trd_unit_dec_place) doDtl2_trd_unit_dec_place_NE(info);
		else if (ne == columnDtl2_trd_unit_rnd_typ) doDtl2_trd_unit_rnd_typ_NE(info);
		else if (ne == columnDtl2_trd_unit_dmn_qty) doDtl2_trd_unit_dmn_qty_NE(info);
		else if (ne == columnDtl2_trd_unit_conv_qty) doDtl2_trd_unit_conv_qty_NE(info);
		else if (ne == columnDtl2_base_unit_cd) doDtl2_base_unit_cd_NE(info);
		else if (ne == columnDtl2_base_unit_nm) doDtl2_base_unit_nm_NE(info);
		else if (ne == columnDtl2_base_unit_dec_place) doDtl2_base_unit_dec_place_NE(info);
		else if (ne == columnDtl2_base_unit_rnd_typ) doDtl2_base_unit_rnd_typ_NE(info);
		else if (ne == columnDtl2_quality_typ) doDtl2_quality_typ_NE(info);
		else if (ne == columnDtl2_quality_typ_nm) doDtl2_quality_typ_nm_NE(info);
		else if (ne == columnDtl2_stk_id_typ) doDtl2_stk_id_typ_NE(info);
		else if (ne == columnDtl2_stk_id_typ_nm) doDtl2_stk_id_typ_nm_NE(info);
		else if (ne == columnDtl2_gd_cd) doDtl2_gd_cd_NE(info);
		else if (ne == columnDtl2_gd_nm) doDtl2_gd_nm_NE(info);
		else if (ne == columnDtl2_stk_arrv_bp_cd) doDtl2_stk_arrv_bp_cd_NE(info);
		else if (ne == columnDtl2_stk_arrv_bp_nm) doDtl2_stk_arrv_bp_nm_NE(info);
		else if (ne == columnDtl2_cont_fctr_flg) doDtl2_cont_fctr_flg_NE(info);
		else if (ne == columnDtl2_cont_fctr_rnd_typ) doDtl2_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnDtl2_cont_fctr_dec_place) doDtl2_cont_fctr_dec_place_NE(info);
		else if (ne == columnDtl2_sub_char1) doDtl2_sub_char1_NE(info);
		else if (ne == columnDtl2_sub_char2) doDtl2_sub_char2_NE(info);
		else if (ne == columnDtl2_sub_char3) doDtl2_sub_char3_NE(info);
		else if (ne == columnDtl2_ref_arr_act_no) doDtl2_ref_arr_act_no_NE(info);
		else if (ne == columnDtl2_ref_arr_act_rev) doDtl2_ref_arr_act_rev_NE(info);
		else if (ne == columnDtl2_ref_purc_act_io_no) doDtl2_ref_purc_act_io_no_NE(info);
		else if (ne == columnDtl2_ref_purc_act_io_seq) doDtl2_ref_purc_act_io_seq_NE(info);
		else if (ne == columnDtl2_purc_ret_schd_io_no) doDtl2_purc_ret_schd_io_no_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
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
	 * [Hdr1]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_ret_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_ret_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[reg_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_reg_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[subcon_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_subcon_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[repurc_obli_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_repurc_obli_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[outsrc_upri_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_outsrc_upri_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[mst_ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_mst_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pay_spot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pay_spot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sppl_pay_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sppl_pay_crryovr_times_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sppl_iv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sppl_iv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[prnt_lcl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_prnt_lcl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[asppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_asppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[asppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_asppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ptax_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ptax_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ptax_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ptax_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ptax_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ptax_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ptax_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ptax_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ptax_xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ptax_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[base_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_base_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[base_cur_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_base_cur_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[base_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_base_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_amt_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_amt_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_tax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_tax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_tax_calc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_tax_calc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_tax_cd_prio_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_tax_cd_prio_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ret_sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ret_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ret_sppl_enable_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ret_sppl_enable_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ret_sppl_cntct_psn_title]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ret_sppl_cntct_psn_title_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ref_rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ref_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[def_purc_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_def_purc_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[def_purc_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_def_purc_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ap_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ap_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_dpt_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_dpt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_dpt_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_dpt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_ret_print_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_ret_print_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_rmrks1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_rmrks1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_rmrks2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_rmrks2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_rmrks3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_rmrks3_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pr_schd_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pr_schd_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[peg_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_peg_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_abort_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_loc_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_loc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_loc_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_loc_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[asset_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_asset_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[iv_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_iv_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[itm_purc_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_itm_purc_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dscnt_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dscnt_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[arr_skip_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_arr_skip_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[itm_pay_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_itm_pay_crryovr_times_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[lot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_lot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sublot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sublot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bp_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bp_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ver_flg_NE(MCEventInfo info){
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
	 * [Dtl1]パネルの[purc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_typ_nm_NE(MCEventInfo info){
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
	 * [Dtl1]パネルの[trd_unit_dmn_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_dmn_qty_NE(MCEventInfo info){
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
	 * [Dtl1]パネルの[repurc_obli_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_repurc_obli_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[loc_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_loc_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[wtax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_wtax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[insp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_insp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[stk_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_stk_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[stk_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_stk_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_gd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[stk_arrv_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_stk_arrv_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[stk_arrv_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_stk_arrv_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ap_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ap_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[pay_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_pay_crryovr_times_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[xpns_purc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_xpns_purc_flg_NE(MCEventInfo info){
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
	 * [Dtl1]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_print_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_print_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_arr_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_arr_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_arr_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_arr_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_purc_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_purc_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_purc_act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_purc_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_purc_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_purc_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_purc_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_purc_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_purc_act_d_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_purc_act_d_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_schd_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_schd_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_purc_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_purc_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dtl_peg_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dtl_peg_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[peg_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_peg_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_ret_loc_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_ret_loc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_ret_loc_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_ret_loc_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_ret_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_ret_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_ret_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_ret_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_ret_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_ret_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[asset_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_asset_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[iv_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_iv_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[lot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_lot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sublot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sublot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dscnt_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dscnt_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bp_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bp_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ver_flg_NE(MCEventInfo info){
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
	 * [Dtl2]パネルの[trd_unit_dmn_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_dmn_qty_NE(MCEventInfo info){
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
	 * [Dtl2]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[stk_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_stk_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[stk_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_stk_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_gd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[stk_arrv_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_stk_arrv_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[stk_arrv_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_stk_arrv_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ref_arr_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ref_arr_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ref_arr_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ref_arr_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ref_purc_act_io_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ref_purc_act_io_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ref_purc_act_io_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ref_purc_act_io_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_ret_schd_io_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_ret_schd_io_no_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == FoldTab) doFold_NX(info);
		else if (nx == Dtl1Table) doDtl1_NX(info);
		else if (nx == Dtl2Table) doDtl2_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_NX(info);
		else if (nx == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_NX(info);
		else if (nx == Cnd_srch_tgt_no) doCnd_srch_tgt_no_NX(info);
		else if (nx == Hdr1_trd_cd) doHdr1_trd_cd_NX(info);
		else if (nx == Hdr1_trd_nm) doHdr1_trd_nm_NX(info);
		else if (nx == Hdr1_trd_ptn_typ) doHdr1_trd_ptn_typ_NX(info);
		else if (nx == Hdr1_purc_ret_schd_no) doHdr1_purc_ret_schd_no_NX(info);
		else if (nx == Hdr1_reg_dt) doHdr1_reg_dt_NX(info);
		else if (nx == Hdr1_schd_dt) doHdr1_schd_dt_NX(info);
		else if (nx == Hdr1_sppl_cd) doHdr1_sppl_cd_NX(info);
		else if (nx == Hdr1_sppl_nm) doHdr1_sppl_nm_NX(info);
		else if (nx == Hdr1_purc_upri_cng_flg) doHdr1_purc_upri_cng_flg_NX(info);
		else if (nx == Hdr1_subcon_flg) doHdr1_subcon_flg_NX(info);
		else if (nx == Hdr1_repurc_obli_flg) doHdr1_repurc_obli_flg_NX(info);
		else if (nx == Hdr1_outsrc_upri_typ) doHdr1_outsrc_upri_typ_NX(info);
		else if (nx == Hdr1_ap_dpt_cd) doHdr1_ap_dpt_cd_NX(info);
		else if (nx == Hdr1_mst_ap_dpt_cd) doHdr1_mst_ap_dpt_cd_NX(info);
		else if (nx == Hdr1_pay_spot_flg) doHdr1_pay_spot_flg_NX(info);
		else if (nx == Hdr1_sppl_pay_crryovr_times) doHdr1_sppl_pay_crryovr_times_NX(info);
		else if (nx == Hdr1_sppl_iv_flg) doHdr1_sppl_iv_flg_NX(info);
		else if (nx == Hdr1_prnt_lcl_cd) doHdr1_prnt_lcl_cd_NX(info);
		else if (nx == Hdr1_asppl_cd) doHdr1_asppl_cd_NX(info);
		else if (nx == Hdr1_asppl_nm) doHdr1_asppl_nm_NX(info);
		else if (nx == Hdr1_trd_cur_cd) doHdr1_trd_cur_cd_NX(info);
		else if (nx == Hdr1_trd_cur_nm) doHdr1_trd_cur_nm_NX(info);
		else if (nx == Hdr1_trd_cur_upri_dec_place) doHdr1_trd_cur_upri_dec_place_NX(info);
		else if (nx == Hdr1_trd_cur_amt_dec_place) doHdr1_trd_cur_amt_dec_place_NX(info);
		else if (nx == Hdr1_ptax_cur_cd) doHdr1_ptax_cur_cd_NX(info);
		else if (nx == Hdr1_ptax_cur_nm) doHdr1_ptax_cur_nm_NX(info);
		else if (nx == Hdr1_ptax_cur_upri_dec_place) doHdr1_ptax_cur_upri_dec_place_NX(info);
		else if (nx == Hdr1_ptax_cur_amt_dec_place) doHdr1_ptax_cur_amt_dec_place_NX(info);
		else if (nx == Hdr1_ptax_xrate_inpt_flg) doHdr1_ptax_xrate_inpt_flg_NX(info);
		else if (nx == Hdr1_base_cur_cd) doHdr1_base_cur_cd_NX(info);
		else if (nx == Hdr1_base_cur_nm) doHdr1_base_cur_nm_NX(info);
		else if (nx == Hdr1_base_cur_upri_dec_place) doHdr1_base_cur_upri_dec_place_NX(info);
		else if (nx == Hdr1_base_cur_amt_dec_place) doHdr1_base_cur_amt_dec_place_NX(info);
		else if (nx == Hdr1_xrate_inpt_flg) doHdr1_xrate_inpt_flg_NX(info);
		else if (nx == Hdr1_xrate_cd) doHdr1_xrate_cd_NX(info);
		else if (nx == Hdr1_purc_amt_rnd_typ) doHdr1_purc_amt_rnd_typ_NX(info);
		else if (nx == Hdr1_purc_tax_rnd_typ) doHdr1_purc_tax_rnd_typ_NX(info);
		else if (nx == Hdr1_purc_tax_calc_typ) doHdr1_purc_tax_calc_typ_NX(info);
		else if (nx == Hdr1_purc_tax_cd) doHdr1_purc_tax_cd_NX(info);
		else if (nx == Hdr1_purc_tax_cd_prio_flg) doHdr1_purc_tax_cd_prio_flg_NX(info);
		else if (nx == Hdr1_ret_sppl_nm) doHdr1_ret_sppl_nm_NX(info);
		else if (nx == Hdr1_ret_sppl_enable_flg) doHdr1_ret_sppl_enable_flg_NX(info);
		else if (nx == Hdr1_ret_sppl_cntct_psn_title) doHdr1_ret_sppl_cntct_psn_title_NX(info);
		else if (nx == Hdr1_rcpt_iv_no) doHdr1_rcpt_iv_no_NX(info);
		else if (nx == Hdr1_ref_rcpt_iv_no) doHdr1_ref_rcpt_iv_no_NX(info);
		else if (nx == Hdr1_def_purc_usr_cd) doHdr1_def_purc_usr_cd_NX(info);
		else if (nx == Hdr1_def_purc_dpt_cd) doHdr1_def_purc_dpt_cd_NX(info);
		else if (nx == Hdr1_ap_dpt_flg) doHdr1_ap_dpt_flg_NX(info);
		else if (nx == Hdr1_purc_dpt_wg_cd) doHdr1_purc_dpt_wg_cd_NX(info);
		else if (nx == Hdr1_purc_dpt_wg_nm) doHdr1_purc_dpt_wg_nm_NX(info);
		else if (nx == Hdr1_purc_ret_print_rmrks) doHdr1_purc_ret_print_rmrks_NX(info);
		else if (nx == Hdr1_trd_rmrks) doHdr1_trd_rmrks_NX(info);
		else if (nx == Hdr1_intr_rmrks) doHdr1_intr_rmrks_NX(info);
		else if (nx == Hdr1_sub_char1) doHdr1_sub_char1_NX(info);
		else if (nx == Hdr1_sub_char2) doHdr1_sub_char2_NX(info);
		else if (nx == Hdr1_sub_char3) doHdr1_sub_char3_NX(info);
		else if (nx == Hdr1_tterm_cd1) doHdr1_tterm_cd1_NX(info);
		else if (nx == Hdr1_tterm_nm1) doHdr1_tterm_nm1_NX(info);
		else if (nx == Hdr1_tterm_rmrks1) doHdr1_tterm_rmrks1_NX(info);
		else if (nx == Hdr1_tterm_cd2) doHdr1_tterm_cd2_NX(info);
		else if (nx == Hdr1_tterm_nm2) doHdr1_tterm_nm2_NX(info);
		else if (nx == Hdr1_tterm_rmrks2) doHdr1_tterm_rmrks2_NX(info);
		else if (nx == Hdr1_tterm_cd3) doHdr1_tterm_cd3_NX(info);
		else if (nx == Hdr1_tterm_nm3) doHdr1_tterm_nm3_NX(info);
		else if (nx == Hdr1_tterm_rmrks3) doHdr1_tterm_rmrks3_NX(info);
		else if (nx == Hdr1_pr_schd_upd_cntr) doHdr1_pr_schd_upd_cntr_NX(info);
		else if (nx == Hdr1_ins_usr_id) doHdr1_ins_usr_id_NX(info);
		else if (nx == Hdr1_ins_usr_nm) doHdr1_ins_usr_nm_NX(info);
		else if (nx == Hdr1_ins_func_id) doHdr1_ins_func_id_NX(info);
		else if (nx == Hdr1_ins_func_nm) doHdr1_ins_func_nm_NX(info);
		else if (nx == Hdr1_upd_usr_id) doHdr1_upd_usr_id_NX(info);
		else if (nx == Hdr1_upd_usr_nm) doHdr1_upd_usr_nm_NX(info);
		else if (nx == Hdr1_upd_func_id) doHdr1_upd_func_id_NX(info);
		else if (nx == Hdr1_upd_func_nm) doHdr1_upd_func_nm_NX(info);
		else if (nx == Hdr1_ins_ts) doHdr1_ins_ts_NX(info);
		else if (nx == Hdr1_upd_ts) doHdr1_upd_ts_NX(info);
		else if (nx == Hdr1_upd_srv_req_no) doHdr1_upd_srv_req_no_NX(info);
		else if (nx == columnDtl1_peg_no) doDtl1_peg_no_NX(info);
		else if (nx == columnDtl1_cmpl_flg) doDtl1_cmpl_flg_NX(info);
		else if (nx == columnDtl1_abort_flg) doDtl1_abort_flg_NX(info);
		else if (nx == columnDtl1_purc_ret_loc_wg_cd) doDtl1_purc_ret_loc_wg_cd_NX(info);
		else if (nx == columnDtl1_purc_ret_loc_wg_nm) doDtl1_purc_ret_loc_wg_nm_NX(info);
		else if (nx == columnDtl1_purc_ret_loc_cd) doDtl1_purc_ret_loc_cd_NX(info);
		else if (nx == columnDtl1_purc_ret_loc_nm) doDtl1_purc_ret_loc_nm_NX(info);
		else if (nx == columnDtl1_purc_ret_sppl_cd) doDtl1_purc_ret_sppl_cd_NX(info);
		else if (nx == columnDtl1_str_ln_tgt_flg) doDtl1_str_ln_tgt_flg_NX(info);
		else if (nx == columnDtl1_asset_mng_typ) doDtl1_asset_mng_typ_NX(info);
		else if (nx == columnDtl1_asset_mng_typ_nm) doDtl1_asset_mng_typ_nm_NX(info);
		else if (nx == columnDtl1_iv_itm_nm) doDtl1_iv_itm_nm_NX(info);
		else if (nx == columnDtl1_sundry_itm_flg) doDtl1_sundry_itm_flg_NX(info);
		else if (nx == columnDtl1_itm_purc_upri_cng_flg) doDtl1_itm_purc_upri_cng_flg_NX(info);
		else if (nx == columnDtl1_dscnt_itm_flg) doDtl1_dscnt_itm_flg_NX(info);
		else if (nx == columnDtl1_arr_skip_flg) doDtl1_arr_skip_flg_NX(info);
		else if (nx == columnDtl1_itm_pay_crryovr_times) doDtl1_itm_pay_crryovr_times_NX(info);
		else if (nx == columnDtl1_stk_mng_typ) doDtl1_stk_mng_typ_NX(info);
		else if (nx == columnDtl1_lot_mng_typ) doDtl1_lot_mng_typ_NX(info);
		else if (nx == columnDtl1_lot_no_typ) doDtl1_lot_no_typ_NX(info);
		else if (nx == columnDtl1_sublot_mng_typ) doDtl1_sublot_mng_typ_NX(info);
		else if (nx == columnDtl1_sublot_no_typ) doDtl1_sublot_no_typ_NX(info);
		else if (nx == columnDtl1_sno1_mng_typ) doDtl1_sno1_mng_typ_NX(info);
		else if (nx == columnDtl1_sno2_mng_typ) doDtl1_sno2_mng_typ_NX(info);
		else if (nx == columnDtl1_sno3_mng_typ) doDtl1_sno3_mng_typ_NX(info);
		else if (nx == columnDtl1_sno4_mng_typ) doDtl1_sno4_mng_typ_NX(info);
		else if (nx == columnDtl1_bp_lot_no) doDtl1_bp_lot_no_NX(info);
		else if (nx == columnDtl1_ver_flg) doDtl1_ver_flg_NX(info);
		else if (nx == columnDtl1_maker_cd) doDtl1_maker_cd_NX(info);
		else if (nx == columnDtl1_maker_nm) doDtl1_maker_nm_NX(info);
		else if (nx == columnDtl1_sppl_itm_cd) doDtl1_sppl_itm_cd_NX(info);
		else if (nx == columnDtl1_sppl_itm_nm) doDtl1_sppl_itm_nm_NX(info);
		else if (nx == columnDtl1_purc_typ) doDtl1_purc_typ_NX(info);
		else if (nx == columnDtl1_purc_typ_nm) doDtl1_purc_typ_nm_NX(info);
		else if (nx == columnDtl1_trd_unit_cd) doDtl1_trd_unit_cd_NX(info);
		else if (nx == columnDtl1_trd_unit_nm) doDtl1_trd_unit_nm_NX(info);
		else if (nx == columnDtl1_trd_unit_dec_place) doDtl1_trd_unit_dec_place_NX(info);
		else if (nx == columnDtl1_trd_unit_rnd_typ) doDtl1_trd_unit_rnd_typ_NX(info);
		else if (nx == columnDtl1_trd_unit_dmn_qty) doDtl1_trd_unit_dmn_qty_NX(info);
		else if (nx == columnDtl1_trd_unit_conv_qty) doDtl1_trd_unit_conv_qty_NX(info);
		else if (nx == columnDtl1_base_unit_cd) doDtl1_base_unit_cd_NX(info);
		else if (nx == columnDtl1_base_unit_nm) doDtl1_base_unit_nm_NX(info);
		else if (nx == columnDtl1_base_unit_dec_place) doDtl1_base_unit_dec_place_NX(info);
		else if (nx == columnDtl1_base_unit_rnd_typ) doDtl1_base_unit_rnd_typ_NX(info);
		else if (nx == columnDtl1_repurc_obli_flg) doDtl1_repurc_obli_flg_NX(info);
		else if (nx == columnDtl1_loc_mng_typ) doDtl1_loc_mng_typ_NX(info);
		else if (nx == columnDtl1_wtax_rate) doDtl1_wtax_rate_NX(info);
		else if (nx == columnDtl1_mfg_inst_no) doDtl1_mfg_inst_no_NX(info);
		else if (nx == columnDtl1_po_no) doDtl1_po_no_NX(info);
		else if (nx == columnDtl1_quality_typ) doDtl1_quality_typ_NX(info);
		else if (nx == columnDtl1_quality_typ_nm) doDtl1_quality_typ_nm_NX(info);
		else if (nx == columnDtl1_insp_flg) doDtl1_insp_flg_NX(info);
		else if (nx == columnDtl1_stk_id_typ) doDtl1_stk_id_typ_NX(info);
		else if (nx == columnDtl1_stk_id_typ_nm) doDtl1_stk_id_typ_nm_NX(info);
		else if (nx == columnDtl1_purc_id_typ) doDtl1_purc_id_typ_NX(info);
		else if (nx == columnDtl1_purc_id_typ_nm) doDtl1_purc_id_typ_nm_NX(info);
		else if (nx == columnDtl1_gd_cd) doDtl1_gd_cd_NX(info);
		else if (nx == columnDtl1_gd_nm) doDtl1_gd_nm_NX(info);
		else if (nx == columnDtl1_stk_arrv_bp_cd) doDtl1_stk_arrv_bp_cd_NX(info);
		else if (nx == columnDtl1_stk_arrv_bp_nm) doDtl1_stk_arrv_bp_nm_NX(info);
		else if (nx == columnDtl1_purc_ret_rsn_cd) doDtl1_purc_ret_rsn_cd_NX(info);
		else if (nx == columnDtl1_purc_ret_rsn_nm) doDtl1_purc_ret_rsn_nm_NX(info);
		else if (nx == columnDtl1_ap_dpt_cd) doDtl1_ap_dpt_cd_NX(info);
		else if (nx == columnDtl1_ap_dpt_nm) doDtl1_ap_dpt_nm_NX(info);
		else if (nx == columnDtl1_pay_crryovr_times) doDtl1_pay_crryovr_times_NX(info);
		else if (nx == columnDtl1_xpns_purc_flg) doDtl1_xpns_purc_flg_NX(info);
		else if (nx == columnDtl1_bd_lot_mng_typ) doDtl1_bd_lot_mng_typ_NX(info);
		else if (nx == columnDtl1_bd_sublot_mng_typ) doDtl1_bd_sublot_mng_typ_NX(info);
		else if (nx == columnDtl1_bd_lot_no_typ) doDtl1_bd_lot_no_typ_NX(info);
		else if (nx == columnDtl1_bd_sublot_no_typ) doDtl1_bd_sublot_no_typ_NX(info);
		else if (nx == columnDtl1_bd_sno1_mng_typ) doDtl1_bd_sno1_mng_typ_NX(info);
		else if (nx == columnDtl1_bd_sno2_mng_typ) doDtl1_bd_sno2_mng_typ_NX(info);
		else if (nx == columnDtl1_bd_sno3_mng_typ) doDtl1_bd_sno3_mng_typ_NX(info);
		else if (nx == columnDtl1_bd_sno4_mng_typ) doDtl1_bd_sno4_mng_typ_NX(info);
		else if (nx == columnDtl1_cont_fctr_flg) doDtl1_cont_fctr_flg_NX(info);
		else if (nx == columnDtl1_cont_fctr_rnd_typ) doDtl1_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnDtl1_cont_fctr_dec_place) doDtl1_cont_fctr_dec_place_NX(info);
		else if (nx == columnDtl1_trd_d_rmrks) doDtl1_trd_d_rmrks_NX(info);
		else if (nx == columnDtl1_intr_d_rmrks) doDtl1_intr_d_rmrks_NX(info);
		else if (nx == columnDtl1_purc_ret_print_d_rmrks) doDtl1_purc_ret_print_d_rmrks_NX(info);
		else if (nx == columnDtl1_sub_char1) doDtl1_sub_char1_NX(info);
		else if (nx == columnDtl1_sub_char2) doDtl1_sub_char2_NX(info);
		else if (nx == columnDtl1_sub_char3) doDtl1_sub_char3_NX(info);
		else if (nx == columnDtl1_ref_arr_act_no) doDtl1_ref_arr_act_no_NX(info);
		else if (nx == columnDtl1_ref_arr_act_rev) doDtl1_ref_arr_act_rev_NX(info);
		else if (nx == columnDtl1_ref_purc_act_no) doDtl1_ref_purc_act_no_NX(info);
		else if (nx == columnDtl1_ref_purc_act_seq) doDtl1_ref_purc_act_seq_NX(info);
		else if (nx == columnDtl1_ref_purc_act_rev) doDtl1_ref_purc_act_rev_NX(info);
		else if (nx == columnDtl1_ref_purc_act_d_no) doDtl1_ref_purc_act_d_no_NX(info);
		else if (nx == columnDtl1_ref_purc_act_d_seq) doDtl1_ref_purc_act_d_seq_NX(info);
		else if (nx == columnDtl1_purc_ret_schd_d_no) doDtl1_purc_ret_schd_d_no_NX(info);
		else if (nx == columnDtl1_base_purc_ac_dt) doDtl1_base_purc_ac_dt_NX(info);
		else if (nx == columnDtl1_base_ac_dt) doDtl1_base_ac_dt_NX(info);
		else if (nx == columnDtl1_disp_seq) doDtl1_disp_seq_NX(info);
		else if (nx == columnDtl2_dtl_peg_no) doDtl2_dtl_peg_no_NX(info);
		else if (nx == columnDtl2_peg_no) doDtl2_peg_no_NX(info);
		else if (nx == columnDtl2_purc_ret_loc_wg_cd) doDtl2_purc_ret_loc_wg_cd_NX(info);
		else if (nx == columnDtl2_purc_ret_loc_wg_nm) doDtl2_purc_ret_loc_wg_nm_NX(info);
		else if (nx == columnDtl2_purc_ret_loc_cd) doDtl2_purc_ret_loc_cd_NX(info);
		else if (nx == columnDtl2_purc_ret_loc_nm) doDtl2_purc_ret_loc_nm_NX(info);
		else if (nx == columnDtl2_purc_ret_sppl_cd) doDtl2_purc_ret_sppl_cd_NX(info);
		else if (nx == columnDtl2_str_ln_tgt_flg) doDtl2_str_ln_tgt_flg_NX(info);
		else if (nx == columnDtl2_asset_mng_typ) doDtl2_asset_mng_typ_NX(info);
		else if (nx == columnDtl2_asset_mng_typ_nm) doDtl2_asset_mng_typ_nm_NX(info);
		else if (nx == columnDtl2_iv_itm_nm) doDtl2_iv_itm_nm_NX(info);
		else if (nx == columnDtl2_sundry_itm_flg) doDtl2_sundry_itm_flg_NX(info);
		else if (nx == columnDtl2_stk_mng_typ) doDtl2_stk_mng_typ_NX(info);
		else if (nx == columnDtl2_lot_mng_typ) doDtl2_lot_mng_typ_NX(info);
		else if (nx == columnDtl2_lot_no_typ) doDtl2_lot_no_typ_NX(info);
		else if (nx == columnDtl2_sublot_mng_typ) doDtl2_sublot_mng_typ_NX(info);
		else if (nx == columnDtl2_sublot_no_typ) doDtl2_sublot_no_typ_NX(info);
		else if (nx == columnDtl2_sno1_mng_typ) doDtl2_sno1_mng_typ_NX(info);
		else if (nx == columnDtl2_sno2_mng_typ) doDtl2_sno2_mng_typ_NX(info);
		else if (nx == columnDtl2_sno3_mng_typ) doDtl2_sno3_mng_typ_NX(info);
		else if (nx == columnDtl2_sno4_mng_typ) doDtl2_sno4_mng_typ_NX(info);
		else if (nx == columnDtl2_dscnt_itm_flg) doDtl2_dscnt_itm_flg_NX(info);
		else if (nx == columnDtl2_bp_lot_no) doDtl2_bp_lot_no_NX(info);
		else if (nx == columnDtl2_ver_flg) doDtl2_ver_flg_NX(info);
		else if (nx == columnDtl2_trd_unit_cd) doDtl2_trd_unit_cd_NX(info);
		else if (nx == columnDtl2_trd_unit_nm) doDtl2_trd_unit_nm_NX(info);
		else if (nx == columnDtl2_trd_unit_dec_place) doDtl2_trd_unit_dec_place_NX(info);
		else if (nx == columnDtl2_trd_unit_rnd_typ) doDtl2_trd_unit_rnd_typ_NX(info);
		else if (nx == columnDtl2_trd_unit_dmn_qty) doDtl2_trd_unit_dmn_qty_NX(info);
		else if (nx == columnDtl2_trd_unit_conv_qty) doDtl2_trd_unit_conv_qty_NX(info);
		else if (nx == columnDtl2_base_unit_cd) doDtl2_base_unit_cd_NX(info);
		else if (nx == columnDtl2_base_unit_nm) doDtl2_base_unit_nm_NX(info);
		else if (nx == columnDtl2_base_unit_dec_place) doDtl2_base_unit_dec_place_NX(info);
		else if (nx == columnDtl2_base_unit_rnd_typ) doDtl2_base_unit_rnd_typ_NX(info);
		else if (nx == columnDtl2_quality_typ) doDtl2_quality_typ_NX(info);
		else if (nx == columnDtl2_quality_typ_nm) doDtl2_quality_typ_nm_NX(info);
		else if (nx == columnDtl2_stk_id_typ) doDtl2_stk_id_typ_NX(info);
		else if (nx == columnDtl2_stk_id_typ_nm) doDtl2_stk_id_typ_nm_NX(info);
		else if (nx == columnDtl2_gd_cd) doDtl2_gd_cd_NX(info);
		else if (nx == columnDtl2_gd_nm) doDtl2_gd_nm_NX(info);
		else if (nx == columnDtl2_stk_arrv_bp_cd) doDtl2_stk_arrv_bp_cd_NX(info);
		else if (nx == columnDtl2_stk_arrv_bp_nm) doDtl2_stk_arrv_bp_nm_NX(info);
		else if (nx == columnDtl2_cont_fctr_flg) doDtl2_cont_fctr_flg_NX(info);
		else if (nx == columnDtl2_cont_fctr_rnd_typ) doDtl2_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnDtl2_cont_fctr_dec_place) doDtl2_cont_fctr_dec_place_NX(info);
		else if (nx == columnDtl2_sub_char1) doDtl2_sub_char1_NX(info);
		else if (nx == columnDtl2_sub_char2) doDtl2_sub_char2_NX(info);
		else if (nx == columnDtl2_sub_char3) doDtl2_sub_char3_NX(info);
		else if (nx == columnDtl2_ref_arr_act_no) doDtl2_ref_arr_act_no_NX(info);
		else if (nx == columnDtl2_ref_arr_act_rev) doDtl2_ref_arr_act_rev_NX(info);
		else if (nx == columnDtl2_ref_purc_act_io_no) doDtl2_ref_purc_act_io_no_NX(info);
		else if (nx == columnDtl2_ref_purc_act_io_seq) doDtl2_ref_purc_act_io_seq_NX(info);
		else if (nx == columnDtl2_purc_ret_schd_io_no) doDtl2_purc_ret_schd_io_no_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
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
	 * [Hdr1]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_ret_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_ret_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[reg_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_reg_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[subcon_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_subcon_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[repurc_obli_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_repurc_obli_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[outsrc_upri_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_outsrc_upri_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[mst_ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_mst_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pay_spot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pay_spot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sppl_pay_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sppl_pay_crryovr_times_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sppl_iv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sppl_iv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[prnt_lcl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_prnt_lcl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[asppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_asppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[asppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_asppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ptax_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ptax_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ptax_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ptax_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ptax_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ptax_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ptax_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ptax_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ptax_xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ptax_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[base_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_base_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[base_cur_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_base_cur_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[base_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_base_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_amt_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_amt_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_tax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_tax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_tax_calc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_tax_calc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_tax_cd_prio_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_tax_cd_prio_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ret_sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ret_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ret_sppl_enable_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ret_sppl_enable_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ret_sppl_cntct_psn_title]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ret_sppl_cntct_psn_title_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ref_rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ref_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[def_purc_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_def_purc_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[def_purc_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_def_purc_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ap_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ap_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_dpt_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_dpt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_dpt_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_dpt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_ret_print_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_ret_print_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_rmrks1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_rmrks1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_rmrks2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_rmrks2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_rmrks3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_rmrks3_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pr_schd_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pr_schd_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[peg_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_peg_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_abort_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_loc_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_loc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_loc_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_loc_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[asset_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_asset_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[iv_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_iv_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[itm_purc_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_itm_purc_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[dscnt_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_dscnt_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[arr_skip_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_arr_skip_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[itm_pay_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_itm_pay_crryovr_times_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[lot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_lot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sublot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sublot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bp_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bp_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ver_flg_NX(MCEventInfo info){
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
	 * [Dtl1]パネルの[purc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_typ_nm_NX(MCEventInfo info){
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
	 * [Dtl1]パネルの[trd_unit_dmn_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_dmn_qty_NX(MCEventInfo info){
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
	 * [Dtl1]パネルの[repurc_obli_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_repurc_obli_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[loc_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_loc_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[wtax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_wtax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[insp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_insp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[stk_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_stk_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[stk_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_stk_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_gd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[stk_arrv_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_stk_arrv_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[stk_arrv_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_stk_arrv_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ap_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ap_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[pay_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_pay_crryovr_times_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[xpns_purc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_xpns_purc_flg_NX(MCEventInfo info){
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
	 * [Dtl1]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_print_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_print_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_arr_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_arr_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_arr_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_arr_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_purc_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_purc_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_purc_act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_purc_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_purc_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_purc_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_purc_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_purc_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_purc_act_d_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_purc_act_d_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_schd_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_schd_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_purc_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_purc_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dtl_peg_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dtl_peg_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[peg_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_peg_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_ret_loc_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_ret_loc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_ret_loc_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_ret_loc_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_ret_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_ret_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_ret_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_ret_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_ret_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_ret_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[asset_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_asset_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[iv_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_iv_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[lot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_lot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sublot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sublot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dscnt_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dscnt_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bp_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bp_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ver_flg_NX(MCEventInfo info){
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
	 * [Dtl2]パネルの[trd_unit_dmn_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_dmn_qty_NX(MCEventInfo info){
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
	 * [Dtl2]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[stk_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_stk_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[stk_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_stk_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_gd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[stk_arrv_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_stk_arrv_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[stk_arrv_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_stk_arrv_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ref_arr_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ref_arr_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ref_arr_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ref_arr_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ref_purc_act_io_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ref_purc_act_io_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ref_purc_act_io_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ref_purc_act_io_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_ret_schd_io_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_ret_schd_io_no_NX(MCEventInfo info){
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
		else if (lc == Hdr1_trd_cd) doHdr1_trd_cd_LC(info);
		else if (lc == Hdr1_trd_nm) doHdr1_trd_nm_LC(info);
		else if (lc == Hdr1_trd_ptn_typ) doHdr1_trd_ptn_typ_LC(info);
		else if (lc == Hdr1_purc_ret_schd_no) doHdr1_purc_ret_schd_no_LC(info);
		else if (lc == Hdr1_reg_dt) doHdr1_reg_dt_LC(info);
		else if (lc == Hdr1_schd_dt) doHdr1_schd_dt_LC(info);
		else if (lc == Hdr1_sppl_cd) doHdr1_sppl_cd_LC(info);
		else if (lc == Hdr1_sppl_nm) doHdr1_sppl_nm_LC(info);
		else if (lc == Hdr1_outsrc_upri_typ) doHdr1_outsrc_upri_typ_LC(info);
		else if (lc == Hdr1_ap_dpt_cd) doHdr1_ap_dpt_cd_LC(info);
		else if (lc == Hdr1_mst_ap_dpt_cd) doHdr1_mst_ap_dpt_cd_LC(info);
		else if (lc == Hdr1_sppl_pay_crryovr_times) doHdr1_sppl_pay_crryovr_times_LC(info);
		else if (lc == Hdr1_prnt_lcl_cd) doHdr1_prnt_lcl_cd_LC(info);
		else if (lc == Hdr1_asppl_cd) doHdr1_asppl_cd_LC(info);
		else if (lc == Hdr1_asppl_nm) doHdr1_asppl_nm_LC(info);
		else if (lc == Hdr1_trd_cur_cd) doHdr1_trd_cur_cd_LC(info);
		else if (lc == Hdr1_trd_cur_nm) doHdr1_trd_cur_nm_LC(info);
		else if (lc == Hdr1_trd_cur_upri_dec_place) doHdr1_trd_cur_upri_dec_place_LC(info);
		else if (lc == Hdr1_trd_cur_amt_dec_place) doHdr1_trd_cur_amt_dec_place_LC(info);
		else if (lc == Hdr1_ptax_cur_cd) doHdr1_ptax_cur_cd_LC(info);
		else if (lc == Hdr1_ptax_cur_nm) doHdr1_ptax_cur_nm_LC(info);
		else if (lc == Hdr1_ptax_cur_upri_dec_place) doHdr1_ptax_cur_upri_dec_place_LC(info);
		else if (lc == Hdr1_ptax_cur_amt_dec_place) doHdr1_ptax_cur_amt_dec_place_LC(info);
		else if (lc == Hdr1_base_cur_cd) doHdr1_base_cur_cd_LC(info);
		else if (lc == Hdr1_base_cur_nm) doHdr1_base_cur_nm_LC(info);
		else if (lc == Hdr1_base_cur_upri_dec_place) doHdr1_base_cur_upri_dec_place_LC(info);
		else if (lc == Hdr1_base_cur_amt_dec_place) doHdr1_base_cur_amt_dec_place_LC(info);
		else if (lc == Hdr1_xrate_cd) doHdr1_xrate_cd_LC(info);
		else if (lc == Hdr1_purc_amt_rnd_typ) doHdr1_purc_amt_rnd_typ_LC(info);
		else if (lc == Hdr1_purc_tax_rnd_typ) doHdr1_purc_tax_rnd_typ_LC(info);
		else if (lc == Hdr1_purc_tax_calc_typ) doHdr1_purc_tax_calc_typ_LC(info);
		else if (lc == Hdr1_purc_tax_cd) doHdr1_purc_tax_cd_LC(info);
		else if (lc == Hdr1_ret_sppl_nm) doHdr1_ret_sppl_nm_LC(info);
		else if (lc == Hdr1_ret_sppl_cntct_psn_title) doHdr1_ret_sppl_cntct_psn_title_LC(info);
		else if (lc == Hdr1_rcpt_iv_no) doHdr1_rcpt_iv_no_LC(info);
		else if (lc == Hdr1_ref_rcpt_iv_no) doHdr1_ref_rcpt_iv_no_LC(info);
		else if (lc == Hdr1_def_purc_usr_cd) doHdr1_def_purc_usr_cd_LC(info);
		else if (lc == Hdr1_def_purc_dpt_cd) doHdr1_def_purc_dpt_cd_LC(info);
		else if (lc == Hdr1_purc_dpt_wg_cd) doHdr1_purc_dpt_wg_cd_LC(info);
		else if (lc == Hdr1_purc_dpt_wg_nm) doHdr1_purc_dpt_wg_nm_LC(info);
		else if (lc == Hdr1_purc_ret_print_rmrks) doHdr1_purc_ret_print_rmrks_LC(info);
		else if (lc == Hdr1_trd_rmrks) doHdr1_trd_rmrks_LC(info);
		else if (lc == Hdr1_intr_rmrks) doHdr1_intr_rmrks_LC(info);
		else if (lc == Hdr1_sub_char1) doHdr1_sub_char1_LC(info);
		else if (lc == Hdr1_sub_char2) doHdr1_sub_char2_LC(info);
		else if (lc == Hdr1_sub_char3) doHdr1_sub_char3_LC(info);
		else if (lc == Hdr1_tterm_cd1) doHdr1_tterm_cd1_LC(info);
		else if (lc == Hdr1_tterm_nm1) doHdr1_tterm_nm1_LC(info);
		else if (lc == Hdr1_tterm_rmrks1) doHdr1_tterm_rmrks1_LC(info);
		else if (lc == Hdr1_tterm_cd2) doHdr1_tterm_cd2_LC(info);
		else if (lc == Hdr1_tterm_nm2) doHdr1_tterm_nm2_LC(info);
		else if (lc == Hdr1_tterm_rmrks2) doHdr1_tterm_rmrks2_LC(info);
		else if (lc == Hdr1_tterm_cd3) doHdr1_tterm_cd3_LC(info);
		else if (lc == Hdr1_tterm_nm3) doHdr1_tterm_nm3_LC(info);
		else if (lc == Hdr1_tterm_rmrks3) doHdr1_tterm_rmrks3_LC(info);
		else if (lc == Hdr1_pr_schd_upd_cntr) doHdr1_pr_schd_upd_cntr_LC(info);
		else if (lc == Hdr1_ins_usr_id) doHdr1_ins_usr_id_LC(info);
		else if (lc == Hdr1_ins_usr_nm) doHdr1_ins_usr_nm_LC(info);
		else if (lc == Hdr1_ins_func_id) doHdr1_ins_func_id_LC(info);
		else if (lc == Hdr1_ins_func_nm) doHdr1_ins_func_nm_LC(info);
		else if (lc == Hdr1_upd_usr_id) doHdr1_upd_usr_id_LC(info);
		else if (lc == Hdr1_upd_usr_nm) doHdr1_upd_usr_nm_LC(info);
		else if (lc == Hdr1_upd_func_id) doHdr1_upd_func_id_LC(info);
		else if (lc == Hdr1_upd_func_nm) doHdr1_upd_func_nm_LC(info);
		else if (lc == Hdr1_ins_ts) doHdr1_ins_ts_LC(info);
		else if (lc == Hdr1_upd_ts) doHdr1_upd_ts_LC(info);
		else if (lc == Hdr1_upd_srv_req_no) doHdr1_upd_srv_req_no_LC(info);
		else if (lc == columnDtl1_peg_no) doDtl1_peg_no_LC(info);
		else if (lc == columnDtl1_purc_ret_loc_wg_cd) doDtl1_purc_ret_loc_wg_cd_LC(info);
		else if (lc == columnDtl1_purc_ret_loc_wg_nm) doDtl1_purc_ret_loc_wg_nm_LC(info);
		else if (lc == columnDtl1_purc_ret_loc_cd) doDtl1_purc_ret_loc_cd_LC(info);
		else if (lc == columnDtl1_purc_ret_loc_nm) doDtl1_purc_ret_loc_nm_LC(info);
		else if (lc == columnDtl1_purc_ret_sppl_cd) doDtl1_purc_ret_sppl_cd_LC(info);
		else if (lc == columnDtl1_asset_mng_typ) doDtl1_asset_mng_typ_LC(info);
		else if (lc == columnDtl1_asset_mng_typ_nm) doDtl1_asset_mng_typ_nm_LC(info);
		else if (lc == columnDtl1_iv_itm_nm) doDtl1_iv_itm_nm_LC(info);
		else if (lc == columnDtl1_itm_pay_crryovr_times) doDtl1_itm_pay_crryovr_times_LC(info);
		else if (lc == columnDtl1_stk_mng_typ) doDtl1_stk_mng_typ_LC(info);
		else if (lc == columnDtl1_lot_mng_typ) doDtl1_lot_mng_typ_LC(info);
		else if (lc == columnDtl1_lot_no_typ) doDtl1_lot_no_typ_LC(info);
		else if (lc == columnDtl1_sublot_mng_typ) doDtl1_sublot_mng_typ_LC(info);
		else if (lc == columnDtl1_sublot_no_typ) doDtl1_sublot_no_typ_LC(info);
		else if (lc == columnDtl1_sno1_mng_typ) doDtl1_sno1_mng_typ_LC(info);
		else if (lc == columnDtl1_sno2_mng_typ) doDtl1_sno2_mng_typ_LC(info);
		else if (lc == columnDtl1_sno3_mng_typ) doDtl1_sno3_mng_typ_LC(info);
		else if (lc == columnDtl1_sno4_mng_typ) doDtl1_sno4_mng_typ_LC(info);
		else if (lc == columnDtl1_bp_lot_no) doDtl1_bp_lot_no_LC(info);
		else if (lc == columnDtl1_maker_cd) doDtl1_maker_cd_LC(info);
		else if (lc == columnDtl1_maker_nm) doDtl1_maker_nm_LC(info);
		else if (lc == columnDtl1_sppl_itm_cd) doDtl1_sppl_itm_cd_LC(info);
		else if (lc == columnDtl1_sppl_itm_nm) doDtl1_sppl_itm_nm_LC(info);
		else if (lc == columnDtl1_purc_typ) doDtl1_purc_typ_LC(info);
		else if (lc == columnDtl1_purc_typ_nm) doDtl1_purc_typ_nm_LC(info);
		else if (lc == columnDtl1_trd_unit_cd) doDtl1_trd_unit_cd_LC(info);
		else if (lc == columnDtl1_trd_unit_nm) doDtl1_trd_unit_nm_LC(info);
		else if (lc == columnDtl1_trd_unit_dec_place) doDtl1_trd_unit_dec_place_LC(info);
		else if (lc == columnDtl1_trd_unit_rnd_typ) doDtl1_trd_unit_rnd_typ_LC(info);
		else if (lc == columnDtl1_trd_unit_dmn_qty) doDtl1_trd_unit_dmn_qty_LC(info);
		else if (lc == columnDtl1_trd_unit_conv_qty) doDtl1_trd_unit_conv_qty_LC(info);
		else if (lc == columnDtl1_base_unit_cd) doDtl1_base_unit_cd_LC(info);
		else if (lc == columnDtl1_base_unit_nm) doDtl1_base_unit_nm_LC(info);
		else if (lc == columnDtl1_base_unit_dec_place) doDtl1_base_unit_dec_place_LC(info);
		else if (lc == columnDtl1_base_unit_rnd_typ) doDtl1_base_unit_rnd_typ_LC(info);
		else if (lc == columnDtl1_loc_mng_typ) doDtl1_loc_mng_typ_LC(info);
		else if (lc == columnDtl1_wtax_rate) doDtl1_wtax_rate_LC(info);
		else if (lc == columnDtl1_mfg_inst_no) doDtl1_mfg_inst_no_LC(info);
		else if (lc == columnDtl1_po_no) doDtl1_po_no_LC(info);
		else if (lc == columnDtl1_quality_typ) doDtl1_quality_typ_LC(info);
		else if (lc == columnDtl1_quality_typ_nm) doDtl1_quality_typ_nm_LC(info);
		else if (lc == columnDtl1_stk_id_typ) doDtl1_stk_id_typ_LC(info);
		else if (lc == columnDtl1_stk_id_typ_nm) doDtl1_stk_id_typ_nm_LC(info);
		else if (lc == columnDtl1_purc_id_typ) doDtl1_purc_id_typ_LC(info);
		else if (lc == columnDtl1_purc_id_typ_nm) doDtl1_purc_id_typ_nm_LC(info);
		else if (lc == columnDtl1_gd_cd) doDtl1_gd_cd_LC(info);
		else if (lc == columnDtl1_gd_nm) doDtl1_gd_nm_LC(info);
		else if (lc == columnDtl1_stk_arrv_bp_cd) doDtl1_stk_arrv_bp_cd_LC(info);
		else if (lc == columnDtl1_stk_arrv_bp_nm) doDtl1_stk_arrv_bp_nm_LC(info);
		else if (lc == columnDtl1_purc_ret_rsn_cd) doDtl1_purc_ret_rsn_cd_LC(info);
		else if (lc == columnDtl1_purc_ret_rsn_nm) doDtl1_purc_ret_rsn_nm_LC(info);
		else if (lc == columnDtl1_ap_dpt_cd) doDtl1_ap_dpt_cd_LC(info);
		else if (lc == columnDtl1_ap_dpt_nm) doDtl1_ap_dpt_nm_LC(info);
		else if (lc == columnDtl1_pay_crryovr_times) doDtl1_pay_crryovr_times_LC(info);
		else if (lc == columnDtl1_bd_lot_mng_typ) doDtl1_bd_lot_mng_typ_LC(info);
		else if (lc == columnDtl1_bd_sublot_mng_typ) doDtl1_bd_sublot_mng_typ_LC(info);
		else if (lc == columnDtl1_bd_lot_no_typ) doDtl1_bd_lot_no_typ_LC(info);
		else if (lc == columnDtl1_bd_sublot_no_typ) doDtl1_bd_sublot_no_typ_LC(info);
		else if (lc == columnDtl1_bd_sno1_mng_typ) doDtl1_bd_sno1_mng_typ_LC(info);
		else if (lc == columnDtl1_bd_sno2_mng_typ) doDtl1_bd_sno2_mng_typ_LC(info);
		else if (lc == columnDtl1_bd_sno3_mng_typ) doDtl1_bd_sno3_mng_typ_LC(info);
		else if (lc == columnDtl1_bd_sno4_mng_typ) doDtl1_bd_sno4_mng_typ_LC(info);
		else if (lc == columnDtl1_cont_fctr_rnd_typ) doDtl1_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnDtl1_cont_fctr_dec_place) doDtl1_cont_fctr_dec_place_LC(info);
		else if (lc == columnDtl1_trd_d_rmrks) doDtl1_trd_d_rmrks_LC(info);
		else if (lc == columnDtl1_intr_d_rmrks) doDtl1_intr_d_rmrks_LC(info);
		else if (lc == columnDtl1_purc_ret_print_d_rmrks) doDtl1_purc_ret_print_d_rmrks_LC(info);
		else if (lc == columnDtl1_sub_char1) doDtl1_sub_char1_LC(info);
		else if (lc == columnDtl1_sub_char2) doDtl1_sub_char2_LC(info);
		else if (lc == columnDtl1_sub_char3) doDtl1_sub_char3_LC(info);
		else if (lc == columnDtl1_ref_arr_act_no) doDtl1_ref_arr_act_no_LC(info);
		else if (lc == columnDtl1_ref_arr_act_rev) doDtl1_ref_arr_act_rev_LC(info);
		else if (lc == columnDtl1_ref_purc_act_no) doDtl1_ref_purc_act_no_LC(info);
		else if (lc == columnDtl1_ref_purc_act_seq) doDtl1_ref_purc_act_seq_LC(info);
		else if (lc == columnDtl1_ref_purc_act_rev) doDtl1_ref_purc_act_rev_LC(info);
		else if (lc == columnDtl1_ref_purc_act_d_no) doDtl1_ref_purc_act_d_no_LC(info);
		else if (lc == columnDtl1_ref_purc_act_d_seq) doDtl1_ref_purc_act_d_seq_LC(info);
		else if (lc == columnDtl1_purc_ret_schd_d_no) doDtl1_purc_ret_schd_d_no_LC(info);
		else if (lc == columnDtl1_base_purc_ac_dt) doDtl1_base_purc_ac_dt_LC(info);
		else if (lc == columnDtl1_base_ac_dt) doDtl1_base_ac_dt_LC(info);
		else if (lc == columnDtl1_disp_seq) doDtl1_disp_seq_LC(info);
		else if (lc == columnDtl2_dtl_peg_no) doDtl2_dtl_peg_no_LC(info);
		else if (lc == columnDtl2_peg_no) doDtl2_peg_no_LC(info);
		else if (lc == columnDtl2_purc_ret_loc_wg_cd) doDtl2_purc_ret_loc_wg_cd_LC(info);
		else if (lc == columnDtl2_purc_ret_loc_wg_nm) doDtl2_purc_ret_loc_wg_nm_LC(info);
		else if (lc == columnDtl2_purc_ret_loc_cd) doDtl2_purc_ret_loc_cd_LC(info);
		else if (lc == columnDtl2_purc_ret_loc_nm) doDtl2_purc_ret_loc_nm_LC(info);
		else if (lc == columnDtl2_purc_ret_sppl_cd) doDtl2_purc_ret_sppl_cd_LC(info);
		else if (lc == columnDtl2_asset_mng_typ) doDtl2_asset_mng_typ_LC(info);
		else if (lc == columnDtl2_asset_mng_typ_nm) doDtl2_asset_mng_typ_nm_LC(info);
		else if (lc == columnDtl2_iv_itm_nm) doDtl2_iv_itm_nm_LC(info);
		else if (lc == columnDtl2_stk_mng_typ) doDtl2_stk_mng_typ_LC(info);
		else if (lc == columnDtl2_lot_mng_typ) doDtl2_lot_mng_typ_LC(info);
		else if (lc == columnDtl2_lot_no_typ) doDtl2_lot_no_typ_LC(info);
		else if (lc == columnDtl2_sublot_mng_typ) doDtl2_sublot_mng_typ_LC(info);
		else if (lc == columnDtl2_sublot_no_typ) doDtl2_sublot_no_typ_LC(info);
		else if (lc == columnDtl2_sno1_mng_typ) doDtl2_sno1_mng_typ_LC(info);
		else if (lc == columnDtl2_sno2_mng_typ) doDtl2_sno2_mng_typ_LC(info);
		else if (lc == columnDtl2_sno3_mng_typ) doDtl2_sno3_mng_typ_LC(info);
		else if (lc == columnDtl2_sno4_mng_typ) doDtl2_sno4_mng_typ_LC(info);
		else if (lc == columnDtl2_bp_lot_no) doDtl2_bp_lot_no_LC(info);
		else if (lc == columnDtl2_trd_unit_cd) doDtl2_trd_unit_cd_LC(info);
		else if (lc == columnDtl2_trd_unit_nm) doDtl2_trd_unit_nm_LC(info);
		else if (lc == columnDtl2_trd_unit_dec_place) doDtl2_trd_unit_dec_place_LC(info);
		else if (lc == columnDtl2_trd_unit_rnd_typ) doDtl2_trd_unit_rnd_typ_LC(info);
		else if (lc == columnDtl2_trd_unit_dmn_qty) doDtl2_trd_unit_dmn_qty_LC(info);
		else if (lc == columnDtl2_trd_unit_conv_qty) doDtl2_trd_unit_conv_qty_LC(info);
		else if (lc == columnDtl2_base_unit_cd) doDtl2_base_unit_cd_LC(info);
		else if (lc == columnDtl2_base_unit_nm) doDtl2_base_unit_nm_LC(info);
		else if (lc == columnDtl2_base_unit_dec_place) doDtl2_base_unit_dec_place_LC(info);
		else if (lc == columnDtl2_base_unit_rnd_typ) doDtl2_base_unit_rnd_typ_LC(info);
		else if (lc == columnDtl2_quality_typ) doDtl2_quality_typ_LC(info);
		else if (lc == columnDtl2_quality_typ_nm) doDtl2_quality_typ_nm_LC(info);
		else if (lc == columnDtl2_stk_id_typ) doDtl2_stk_id_typ_LC(info);
		else if (lc == columnDtl2_stk_id_typ_nm) doDtl2_stk_id_typ_nm_LC(info);
		else if (lc == columnDtl2_gd_cd) doDtl2_gd_cd_LC(info);
		else if (lc == columnDtl2_gd_nm) doDtl2_gd_nm_LC(info);
		else if (lc == columnDtl2_stk_arrv_bp_cd) doDtl2_stk_arrv_bp_cd_LC(info);
		else if (lc == columnDtl2_stk_arrv_bp_nm) doDtl2_stk_arrv_bp_nm_LC(info);
		else if (lc == columnDtl2_cont_fctr_rnd_typ) doDtl2_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnDtl2_cont_fctr_dec_place) doDtl2_cont_fctr_dec_place_LC(info);
		else if (lc == columnDtl2_sub_char1) doDtl2_sub_char1_LC(info);
		else if (lc == columnDtl2_sub_char2) doDtl2_sub_char2_LC(info);
		else if (lc == columnDtl2_sub_char3) doDtl2_sub_char3_LC(info);
		else if (lc == columnDtl2_ref_arr_act_no) doDtl2_ref_arr_act_no_LC(info);
		else if (lc == columnDtl2_ref_arr_act_rev) doDtl2_ref_arr_act_rev_LC(info);
		else if (lc == columnDtl2_ref_purc_act_io_no) doDtl2_ref_purc_act_io_no_LC(info);
		else if (lc == columnDtl2_ref_purc_act_io_seq) doDtl2_ref_purc_act_io_seq_LC(info);
		else if (lc == columnDtl2_purc_ret_schd_io_no) doDtl2_purc_ret_schd_io_no_LC(info);
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
	 * [Hdr1]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_ret_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_ret_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[reg_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_reg_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[outsrc_upri_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_outsrc_upri_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[mst_ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_mst_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sppl_pay_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sppl_pay_crryovr_times_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[prnt_lcl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_prnt_lcl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[asppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_asppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[asppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_asppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ptax_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ptax_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ptax_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ptax_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ptax_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ptax_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ptax_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ptax_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[base_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_base_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[base_cur_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_base_cur_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[base_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_base_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_amt_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_amt_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_tax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_tax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_tax_calc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_tax_calc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ret_sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ret_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ret_sppl_cntct_psn_title]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ret_sppl_cntct_psn_title_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ref_rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ref_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[def_purc_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_def_purc_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[def_purc_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_def_purc_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_dpt_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_dpt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_dpt_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_dpt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[purc_ret_print_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_purc_ret_print_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_rmrks1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_rmrks1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_rmrks2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_rmrks2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[tterm_rmrks3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_tterm_rmrks3_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[pr_schd_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_pr_schd_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Hdr1]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr1_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[peg_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_peg_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_loc_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_loc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_loc_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_loc_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[asset_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_asset_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[iv_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_iv_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[itm_pay_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_itm_pay_crryovr_times_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[lot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_lot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sublot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sublot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[bp_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_bp_lot_no_LC(MCEventInfo info){
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
	 * [Dtl1]パネルの[purc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_typ_nm_LC(MCEventInfo info){
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
	 * [Dtl1]パネルの[trd_unit_dmn_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_unit_dmn_qty_LC(MCEventInfo info){
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
	 * [Dtl1]パネルの[loc_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_loc_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[wtax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_wtax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[stk_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_stk_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[stk_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_stk_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_gd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[stk_arrv_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_stk_arrv_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[stk_arrv_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_stk_arrv_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ap_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ap_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[pay_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_pay_crryovr_times_LC(MCEventInfo info){
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
	 * [Dtl1]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_print_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_print_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_arr_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_arr_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_arr_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_arr_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_purc_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_purc_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_purc_act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_purc_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_purc_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_purc_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_purc_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_purc_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ref_purc_act_d_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ref_purc_act_d_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_ret_schd_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_ret_schd_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_purc_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_purc_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[dtl_peg_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_dtl_peg_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[peg_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_peg_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_ret_loc_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_ret_loc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_ret_loc_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_ret_loc_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_ret_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_ret_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_ret_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_ret_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_ret_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_ret_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[asset_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_asset_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[iv_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_iv_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[lot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_lot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sublot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sublot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[bp_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_bp_lot_no_LC(MCEventInfo info){
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
	 * [Dtl2]パネルの[trd_unit_dmn_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_trd_unit_dmn_qty_LC(MCEventInfo info){
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
	 * [Dtl2]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[stk_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_stk_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[stk_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_stk_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_gd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[stk_arrv_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_stk_arrv_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[stk_arrv_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_stk_arrv_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ref_arr_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ref_arr_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ref_arr_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ref_arr_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ref_purc_act_io_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ref_purc_act_io_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ref_purc_act_io_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ref_purc_act_io_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_ret_schd_io_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_ret_schd_io_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_srch_tgt_typ_nm]の作成メソッド
	 */
	public MCList getCnd_srch_tgt_typ_nm(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getPurcSrchTgtTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr1_trd_cd]の作成メソッド
	 */
	public MCList getHdr1_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr1_sppl_cd]の作成メソッド
	 */
	public MCList getHdr1_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr1_asppl_cd]の作成メソッド
	 */
	public MCList getHdr1_asppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr1_trd_cur_cd]の作成メソッド
	 */
	public MCList getHdr1_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr1_ptax_cur_cd]の作成メソッド
	 */
	public MCList getHdr1_ptax_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr1_base_cur_cd]の作成メソッド
	 */
	public MCList getHdr1_base_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr1_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getHdr1_purc_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr1_tterm_cd1]の作成メソッド
	 */
	public MCList getHdr1_tterm_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTterm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr1_tterm_cd2]の作成メソッド
	 */
	public MCList getHdr1_tterm_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTterm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr1_tterm_cd3]の作成メソッド
	 */
	public MCList getHdr1_tterm_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTterm(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_purc_ret_loc_cd]の作成メソッド
	 */
	public MCList getDtl1_purc_ret_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_str_ln_p_PPanel_columnStrLn_str_ln_cd]の作成メソッド
	 */
	public MCList getDtl1_str_ln_p_PPanel_columnStrLn_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_asset_mng_typ]の作成メソッド
	 */
	public MCList getDtl1_asset_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAssetMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getDtl1_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmDtl(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getDtl1_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmDtlSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getDtl1_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmDtlSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getDtl1_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmDtlSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_lot_no_p_PPanel_columnLotNo_lot_no]の作成メソッド
	 */
	public MCList getDtl1_lot_no_p_PPanel_columnLotNo_lot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getLotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_lot_no_p_PPanel_columnLotNo_sublot_no]の作成メソッド
	 */
	public MCList getDtl1_lot_no_p_PPanel_columnLotNo_sublot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getSublotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_maker_cd]の作成メソッド
	 */
	public MCList getDtl1_maker_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlMaker(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_purc_typ]の作成メソッド
	 */
	public MCList getDtl1_purc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_trd_unit_cd]の作成メソッド
	 */
	public MCList getDtl1_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd]の作成メソッド
	 */
	public MCList getDtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd]の作成メソッド
	 */
	public MCList getDtl1_trd_upri_amt_p_PPanel_columnTrdUpriAmt_dscnt_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcDscntBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_quality_typ]の作成メソッド
	 */
	public MCList getDtl1_quality_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getQualityTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_stk_id_typ]の作成メソッド
	 */
	public MCList getDtl1_stk_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getStkIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_purc_id_typ]の作成メソッド
	 */
	public MCList getDtl1_purc_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_gd_cd]の作成メソッド
	 */
	public MCList getDtl1_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkGd(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_stk_arrv_bp_cd]の作成メソッド
	 */
	public MCList getDtl1_stk_arrv_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getSpplByLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_purc_ret_rsn_cd]の作成メソッド
	 */
	public MCList getDtl1_purc_ret_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcRtnBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl1_ap_dpt_cd]の作成メソッド
	 */
	public MCList getDtl1_ap_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_bd_p_PPanel_columnBdItem_bd_dpt_cd]の作成メソッド
	 */
	public MCList getDtl1_bd_p_PPanel_columnBdItem_bd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_bd_p_PPanel_columnBdItem_bd_itm_cd]の作成メソッド
	 */
	public MCList getDtl1_bd_p_PPanel_columnBdItem_bd_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub1]の作成メソッド
	 */
	public MCList getDtl1_bd_p_PPanel_columnBdItem_bd_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub2]の作成メソッド
	 */
	public MCList getDtl1_bd_p_PPanel_columnBdItem_bd_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl1_bd_p_PPanel_columnBdItem_bd_itm_sub3]の作成メソッド
	 */
	public MCList getDtl1_bd_p_PPanel_columnBdItem_bd_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_purc_ret_loc_cd]の作成メソッド
	 */
	public MCList getDtl2_purc_ret_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl2_str_ln_p_PPanel_columnStrLn_str_ln_cd]の作成メソッド
	 */
	public MCList getDtl2_str_ln_p_PPanel_columnStrLn_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_asset_mng_typ]の作成メソッド
	 */
	public MCList getDtl2_asset_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAssetMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl2_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getDtl2_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmDtl(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl2_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getDtl2_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmDtlSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl2_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getDtl2_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmDtlSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl2_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getDtl2_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmDtlSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl2_lot_no_p_PPanel_columnLotNo_lot_no]の作成メソッド
	 */
	public MCList getDtl2_lot_no_p_PPanel_columnLotNo_lot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getLotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl2_lot_no_p_PPanel_columnLotNo_sublot_no]の作成メソッド
	 */
	public MCList getDtl2_lot_no_p_PPanel_columnLotNo_sublot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getSublotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_trd_unit_cd]の作成メソッド
	 */
	public MCList getDtl2_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_quality_typ]の作成メソッド
	 */
	public MCList getDtl2_quality_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getQualityTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_stk_id_typ]の作成メソッド
	 */
	public MCList getDtl2_stk_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getStkIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_gd_cd]の作成メソッド
	 */
	public MCList getDtl2_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkGd(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl2_stk_arrv_bp_cd]の作成メソッド
	 */
	public MCList getDtl2_stk_arrv_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getSpplByLoc(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBDL0150.Srch01")) {
			return new MS_MSBDL0150_Srch01Bridge();
		}
		if (id.equals("MS.MSBDL0150.Srch02")) {
			return new MS_MSBDL0150_Srch02Bridge();
		}
		if (id.equals("MS.MSBDL0150.Srch03")) {
			return new MS_MSBDL0150_Srch03Bridge();
		}
		if (id.equals("MS.MSBDL0150.Sprt01")) {
			return new MS_MSBDL0150_Sprt01Bridge();
		}
		if (id.equals("MS.MSBDL0150.Ins01")) {
			return new MS_MSBDL0150_Ins01Bridge();
		}
		if (id.equals("MS.MSBDL0150.Upd01")) {
			return new MS_MSBDL0150_Upd01Bridge();
		}
		if (id.equals("MS.MSBDL0150.Del01")) {
			return new MS_MSBDL0150_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBDL0150_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0150_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0150_Srch01;

		/** コンストラクタ */
		protected MS_MSBDL0150_Srch01Bridge() {
			p_MS_MSBDL0150_Srch01 = new MCParam(PDef.MS_MSBDL0150_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0150_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0150.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBD.MSBDP0150.Hdr1R.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl2R.class));

			p_MS_MSBDL0150_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0150_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0150_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0150_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0150_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0150.CndR up0() {
			return (mcframe.clientMSBD.MSBDP0150.CndR)up(0);
		}

		protected mcframe.clientMSBD.MSBDP0150.Hdr1R down0() {
			return (mcframe.clientMSBD.MSBDP0150.Hdr1R)down(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R> down1() {
			return (MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R>)down(1);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0150.Dtl2R> down2() {
			return (MCList<mcframe.clientMSBD.MSBDP0150.Dtl2R>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0150_Srch01.addDownBlock(mcframe.clientMSBD.MSBDP0150.Hdr1R.create());
			p_MS_MSBDL0150_Srch01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.class));
			p_MS_MSBDL0150_Srch01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl2R.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0150_Srch01;
		}

		protected void show() {
			setHdr1R((mcframe.clientMSBD.MSBDP0150.Hdr1R)p_MS_MSBDL0150_Srch01.getContainerParam().getDownBlock(0));
			setDtl1L((MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R>)p_MS_MSBDL0150_Srch01.getContainerParam().getDownBlock(1));
			setDtl2L((MCList<mcframe.clientMSBD.MSBDP0150.Dtl2R>)p_MS_MSBDL0150_Srch01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdr1R().clear();
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
			result.add(getHdr1R());
			result.add(getDtl1L());
			result.add(getDtl2L());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0150_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0150_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0150_Srch02;

		/** コンストラクタ */
		protected MS_MSBDL0150_Srch02Bridge() {
			p_MS_MSBDL0150_Srch02 = new MCParam(PDef.MS_MSBDL0150_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0150_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0150.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBD.MSBDP0150.Hdr1R.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl2R.class));

			p_MS_MSBDL0150_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0150_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0150_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0150_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0150_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0150.CndR up0() {
			return (mcframe.clientMSBD.MSBDP0150.CndR)up(0);
		}

		protected mcframe.clientMSBD.MSBDP0150.Hdr1R down0() {
			return (mcframe.clientMSBD.MSBDP0150.Hdr1R)down(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R> down1() {
			return (MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R>)down(1);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0150.Dtl2R> down2() {
			return (MCList<mcframe.clientMSBD.MSBDP0150.Dtl2R>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0150_Srch02.addDownBlock(mcframe.clientMSBD.MSBDP0150.Hdr1R.create());
			p_MS_MSBDL0150_Srch02.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.class));
			p_MS_MSBDL0150_Srch02.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl2R.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0150_Srch02;
		}

		protected void show() {
			setHdr1R((mcframe.clientMSBD.MSBDP0150.Hdr1R)p_MS_MSBDL0150_Srch02.getContainerParam().getDownBlock(0));
			setDtl1L((MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R>)p_MS_MSBDL0150_Srch02.getContainerParam().getDownBlock(1));
			setDtl2L((MCList<mcframe.clientMSBD.MSBDP0150.Dtl2R>)p_MS_MSBDL0150_Srch02.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdr1R().clear();
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
			result.add(getHdr1R());
			result.add(getDtl1L());
			result.add(getDtl2L());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0150_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0150_Srch03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0150_Srch03;

		/** コンストラクタ */
		protected MS_MSBDL0150_Srch03Bridge() {
			p_MS_MSBDL0150_Srch03 = new MCParam(PDef.MS_MSBDL0150_Srch03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0150_Srch03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0150.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBD.MSBDP0150.Hdr1R.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl2R.class));

			p_MS_MSBDL0150_Srch03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0150_Srch03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0150_Srch03.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0150_Srch03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0150_Srch03.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0150.CndR up0() {
			return (mcframe.clientMSBD.MSBDP0150.CndR)up(0);
		}

		protected mcframe.clientMSBD.MSBDP0150.Hdr1R down0() {
			return (mcframe.clientMSBD.MSBDP0150.Hdr1R)down(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R> down1() {
			return (MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R>)down(1);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0150.Dtl2R> down2() {
			return (MCList<mcframe.clientMSBD.MSBDP0150.Dtl2R>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0150_Srch03.addDownBlock(mcframe.clientMSBD.MSBDP0150.Hdr1R.create());
			p_MS_MSBDL0150_Srch03.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.class));
			p_MS_MSBDL0150_Srch03.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl2R.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0150_Srch03;
		}

		protected void show() {
			setHdr1R((mcframe.clientMSBD.MSBDP0150.Hdr1R)p_MS_MSBDL0150_Srch03.getContainerParam().getDownBlock(0));
			setDtl1L((MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R>)p_MS_MSBDL0150_Srch03.getContainerParam().getDownBlock(1));
			setDtl2L((MCList<mcframe.clientMSBD.MSBDP0150.Dtl2R>)p_MS_MSBDL0150_Srch03.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdr1R().clear();
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
			result.add(getHdr1R());
			result.add(getDtl1L());
			result.add(getDtl2L());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0150_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0150_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0150_Sprt01;

		/** コンストラクタ */
		protected MS_MSBDL0150_Sprt01Bridge() {
			p_MS_MSBDL0150_Sprt01 = new MCParam(PDef.MS_MSBDL0150_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0150_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0150.Hdr1R.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.class));

			p_MS_MSBDL0150_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0150_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0150_Sprt01.addUpBlock(getHdr1R());
			p_MS_MSBDL0150_Sprt01.addUpBlock(getDtl1L().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0150_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0150_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0150.Hdr1R up0() {
			return (mcframe.clientMSBD.MSBDP0150.Hdr1R)up(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R> up1() {
			return (MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R>)up(1);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0150_Sprt01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0150_Sprt01;
		}

		protected void show() {
			setDtl1L((MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R>)p_MS_MSBDL0150_Sprt01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtl1L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdr1R());
			result.add(getDtl1L());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtl1L());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0150_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0150_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0150_Ins01;

		/** コンストラクタ */
		protected MS_MSBDL0150_Ins01Bridge() {
			p_MS_MSBDL0150_Ins01 = new MCParam(PDef.MS_MSBDL0150_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0150_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0150.Hdr1R.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl2R.class));
			// Down
			param.addDownBlock(mcframe.clientMSBD.MSBDP0150.Hdr1R.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl2R.class));

			p_MS_MSBDL0150_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0150_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0150_Ins01.addUpBlock(getHdr1R());
			p_MS_MSBDL0150_Ins01.addUpBlock(getDtl1L().shallowClone());
			p_MS_MSBDL0150_Ins01.addUpBlock(getDtl2L().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0150_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0150_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0150.Hdr1R up0() {
			return (mcframe.clientMSBD.MSBDP0150.Hdr1R)up(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R> up1() {
			return (MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R>)up(1);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0150.Dtl2R> up2() {
			return (MCList<mcframe.clientMSBD.MSBDP0150.Dtl2R>)up(2);
		}

		protected mcframe.clientMSBD.MSBDP0150.Hdr1R down0() {
			return (mcframe.clientMSBD.MSBDP0150.Hdr1R)down(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R> down1() {
			return (MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R>)down(1);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0150.Dtl2R> down2() {
			return (MCList<mcframe.clientMSBD.MSBDP0150.Dtl2R>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0150_Ins01.addDownBlock(mcframe.clientMSBD.MSBDP0150.Hdr1R.create());
			p_MS_MSBDL0150_Ins01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.class));
			p_MS_MSBDL0150_Ins01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl2R.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0150_Ins01;
		}

		protected void show() {
			setHdr1R((mcframe.clientMSBD.MSBDP0150.Hdr1R)p_MS_MSBDL0150_Ins01.getContainerParam().getDownBlock(0));
			setDtl1L((MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R>)p_MS_MSBDL0150_Ins01.getContainerParam().getDownBlock(1));
			setDtl2L((MCList<mcframe.clientMSBD.MSBDP0150.Dtl2R>)p_MS_MSBDL0150_Ins01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdr1R().clear();
			getDtl1L().clear();
			getDtl2L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdr1R());
			result.add(getDtl1L());
			result.add(getDtl2L());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdr1R());
			result.add(getDtl1L());
			result.add(getDtl2L());
			return result;
		}
	}
	/**
	 * [MS_MSBDL0150_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0150_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0150_Upd01;

		/** コンストラクタ */
		protected MS_MSBDL0150_Upd01Bridge() {
			p_MS_MSBDL0150_Upd01 = new MCParam(PDef.MS_MSBDL0150_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0150_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0150.Hdr1R.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl2R.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl2R.class));

			p_MS_MSBDL0150_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0150_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0150_Upd01.addUpBlock(getHdr1R());
			p_MS_MSBDL0150_Upd01.addUpBlock(getDtl1L().shallowClone());
			p_MS_MSBDL0150_Upd01.addUpBlock(getDtl2L().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0150_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0150_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0150.Hdr1R up0() {
			return (mcframe.clientMSBD.MSBDP0150.Hdr1R)up(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R> up1() {
			return (MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R>)up(1);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0150.Dtl2R> up2() {
			return (MCList<mcframe.clientMSBD.MSBDP0150.Dtl2R>)up(2);
		}

		protected MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R> down0() {
			return (MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R>)down(0);
		}
		protected MCList<mcframe.clientMSBD.MSBDP0150.Dtl2R> down1() {
			return (MCList<mcframe.clientMSBD.MSBDP0150.Dtl2R>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBDL0150_Upd01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl1R.class));
			p_MS_MSBDL0150_Upd01.addDownBlock(MCList.create(mcframe.clientMSBD.MSBDP0150.Dtl2R.class));
		}
		protected MCParam param() {
			return p_MS_MSBDL0150_Upd01;
		}

		protected void show() {
			setDtl1L((MCList<mcframe.clientMSBD.MSBDP0150.Dtl1R>)p_MS_MSBDL0150_Upd01.getContainerParam().getDownBlock(0));
			setDtl2L((MCList<mcframe.clientMSBD.MSBDP0150.Dtl2R>)p_MS_MSBDL0150_Upd01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getDtl1L().clear();
			getDtl2L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdr1R());
			result.add(getDtl1L());
			result.add(getDtl2L());
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
	 * [MS_MSBDL0150_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0150_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBDL0150_Del01;

		/** コンストラクタ */
		protected MS_MSBDL0150_Del01Bridge() {
			p_MS_MSBDL0150_Del01 = new MCParam(PDef.MS_MSBDL0150_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBDL0150_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBD.MSBDP0150.Hdr1R.create());
			// Down

			p_MS_MSBDL0150_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBDL0150_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBDL0150_Del01.addUpBlock(getHdr1R());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBDL0150_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBDL0150_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBD.MSBDP0150.Hdr1R up0() {
			return (mcframe.clientMSBD.MSBDP0150.Hdr1R)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBDL0150_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdr1R());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}