package mcframe.clientMSBE.MSBEP2240;

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
import mcframe.clientMSBE.MSBEP2240.MSBEP_RcptIvDSel_MC.MS_MSBEL2240_Srch01Caller;

/**
 * 画面"MSBEP_RcptIvDSel"パネルクラスです。<p>
 *
 * 受領インボイス登録画面に表示している明細を除いた、同一インボイスにまとめることができる明細を表示する。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_RcptIvDSel_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBEP2240";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP2240.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bndl_tgt_flg = null;
	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pr_sts_typ = null;
	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pr_sts_typ_nm = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_nm = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_ptn_typ = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_no = null;
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_d_no = null;
	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_schd_no = null;
	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arr_schd_no = null;
	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arr_act_no = null;
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_iv_no = null;
	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_schd_dt = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_arr_schd_dt_p_PPanel;
	public MCColumnConfig columnRslt_arr_schd_dt;// [Rslt]の[arr_schd_dt_p.ymd]を[columnRslt_arr_schd_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_arr_schd_hm;// [Rslt]の[arr_schd_dt_p.hm]を[columnRslt_arr_schd_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_arr_dt_p_PPanel;
	public MCColumnConfig columnRslt_arr_dt;// [Rslt]の[arr_dt_p.ymd]を[columnRslt_arr_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_arr_hm;// [Rslt]の[arr_dt_p.hm]を[columnRslt_arr_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_itm_nm = null;
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sundry_itm_flg = null;
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_mng_typ = null;
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asset_mng_typ = null;
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dscnt_itm_flg = null;
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno4_mng_typ = null;
	/**
	 * Import/export charges type 輸出入諸掛区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_exim_xpns_typ = null;
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_maker_nm = null;
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_nm = null;
	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_conv_base_qty = null;
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_conv_qty = null;
	/**
	 * Unit number of decimal places 単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_dec_place = null;
	/**
	 * Unit rounding type 単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt_trd_unit_qty;// [Rslt]の[trd_unit_qty_p.qty]を[columnRslt_trd_unit_qty]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D Rslt_trd_cur_upri_p_PPanel;
	public MCColumnConfig columnRslt_upri_not_tgt_flg;// [Rslt]の[trd_cur_upri_p.upri_not_tgt_flg]を[columnRslt_upri_not_tgt_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_trd_cur_upri;// [Rslt]の[trd_cur_upri_p.trd_cur_upri]を[columnRslt_trd_cur_upri]としてエイリアス定義。
	public MCColumnConfig columnRslt_interim_flg;// [Rslt]の[trd_cur_upri_p.interim_flg]を[columnRslt_interim_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_trd_cur_amt;// [Rslt]の[trd_cur_upri_p.trd_cur_amt]を[columnRslt_trd_cur_amt]としてエイリアス定義。
	public MCColumnConfig columnRslt_trd_cur_inc_tax_amt;// [Rslt]の[trd_cur_upri_p.trd_cur_inc_tax_amt]を[columnRslt_trd_cur_inc_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnRslt_tax_fix_flg;// [Rslt]の[trd_cur_upri_p.tax_fix_flg]を[columnRslt_tax_fix_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_tax_cd;// [Rslt]の[trd_cur_upri_p.tax_cd]を[columnRslt_tax_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_tax_nm;// [Rslt]の[trd_cur_upri_p.tax_nm]を[columnRslt_tax_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_tax_rate;// [Rslt]の[trd_cur_upri_p.tax_rate]を[columnRslt_tax_rate]としてエイリアス定義。
	public MCColumnConfig columnRslt_tax_typ;// [Rslt]の[trd_cur_upri_p.tax_typ]を[columnRslt_tax_typ]としてエイリアス定義。
	public MCColumnConfig columnRslt_inc_tax_flg;// [Rslt]の[trd_cur_upri_p.inc_tax_flg]を[columnRslt_inc_tax_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_trd_cur_tax_amt;// [Rslt]の[trd_cur_upri_p.trd_cur_tax_amt]を[columnRslt_trd_cur_tax_amt]としてエイリアス定義。
	public MCColumnConfig columnRslt_trd_cur_dscnt_amt;// [Rslt]の[trd_cur_upri_p.trd_cur_dscnt_amt]を[columnRslt_trd_cur_dscnt_amt]としてエイリアス定義。
	public MCColumnConfig columnRslt_dscnt_rsn_cd;// [Rslt]の[trd_cur_upri_p.dscnt_rsn_cd]を[columnRslt_dscnt_rsn_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_dscnt_rsn_nm;// [Rslt]の[trd_cur_upri_p.dscnt_rsn_nm]を[columnRslt_dscnt_rsn_nm]としてエイリアス定義。
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public MCColumnConfig columnRslt_repurc_obli_flg = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_trd_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_proc_upri;// [Rslt]の[trd_cur_proc_upri_p.upri]を[columnRslt_trd_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_proc_amt;// [Rslt]の[trd_cur_proc_amt_p.amt]を[columnRslt_trd_cur_proc_amt]としてエイリアス定義。
	public MCColumnConfig columnRslt_trd_cur_proc_tax_amt;// [Rslt]の[trd_cur_proc_amt_p.tax_amt]を[columnRslt_trd_cur_proc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_trd_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_onr_prov_upri;// [Rslt]の[trd_cur_onr_prov_upri_p.upri]を[columnRslt_trd_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_onr_prov_amt;// [Rslt]の[trd_cur_onr_prov_amt_p.amt]を[columnRslt_trd_cur_onr_prov_amt]としてエイリアス定義。
	public MCColumnConfig columnRslt_trd_cur_onr_prov_tax_amt;// [Rslt]の[trd_cur_onr_prov_amt_p.tax_amt]を[columnRslt_trd_cur_onr_prov_tax_amt]としてエイリアス定義。
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wtax_rate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_wtax_amt_p_PPanel;
	public MCColumnConfig columnRslt_wtax_amt;// [Rslt]の[wtax_amt_p.amt]を[columnRslt_wtax_amt]としてエイリアス定義。
	/**
	 * PO currency cd. 発注通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_cd = null;
	/**
	 * PO currency name 発注通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_nm = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_amt_dec_place = null;
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_upri_dec_place = null;
	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate_inpt_flg = null;
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_base_cur_upri_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_upri;// [Rslt]の[base_cur_upri_p.upri]を[columnRslt_base_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_base_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_proc_upri;// [Rslt]の[base_cur_proc_upri_p.upri]を[columnRslt_base_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_base_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_onr_prov_upri;// [Rslt]の[base_cur_onr_prov_upri_p.upri]を[columnRslt_base_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_dscnt_amt;// [Rslt]の[base_cur_dscnt_amt_p.amt]を[columnRslt_base_cur_dscnt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_amt;// [Rslt]の[base_cur_amt_p.amt]を[columnRslt_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_inc_ctax_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_inc_ctax_amt;// [Rslt]の[base_cur_inc_ctax_amt_p.amt]を[columnRslt_base_cur_inc_ctax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_tax_amt;// [Rslt]の[base_cur_tax_amt_p.amt]を[columnRslt_base_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_proc_amt;// [Rslt]の[base_cur_proc_amt_p.amt]を[columnRslt_base_cur_proc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_onr_prov_amt;// [Rslt]の[base_cur_onr_prov_amt_p.amt]を[columnRslt_base_cur_onr_prov_amt]としてエイリアス定義。
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_cd = null;
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_nm = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_amt_dec_place = null;
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_upri_dec_place = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_ptax_cur_upri_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_upri;// [Rslt]の[ptax_cur_upri_p.upri]を[columnRslt_ptax_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_ptax_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_proc_upri;// [Rslt]の[ptax_cur_proc_upri_p.upri]を[columnRslt_ptax_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Rslt_ptax_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_onr_prov_upri;// [Rslt]の[ptax_cur_onr_prov_upri_p.upri]を[columnRslt_ptax_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_dscnt_amt;// [Rslt]の[ptax_cur_dscnt_amt_p.amt]を[columnRslt_ptax_cur_dscnt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_amt;// [Rslt]の[ptax_cur_amt_p.amt]を[columnRslt_ptax_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_inc_ctax_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_inc_ctax_amt;// [Rslt]の[ptax_cur_inc_ctax_amt_p.amt]を[columnRslt_ptax_cur_inc_ctax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_tax_amt;// [Rslt]の[ptax_cur_tax_amt_p.amt]を[columnRslt_ptax_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_proc_amt;// [Rslt]の[ptax_cur_proc_amt_p.amt]を[columnRslt_ptax_cur_proc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ptax_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnRslt_ptax_cur_onr_prov_amt;// [Rslt]の[ptax_cur_onr_prov_amt_p.amt]を[columnRslt_ptax_cur_onr_prov_amt]としてエイリアス定義。
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_cur_cd = null;
	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_cur_nm = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_amt_dec_place = null;
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_upri_dec_place = null;
	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_xrate_inpt_flg = null;
	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_xrate = null;
	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_itm_cd = null;
	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_itm_nm = null;
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_itm_cd = null;
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_itm_nm = null;
	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_id_typ = null;
	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_id_typ_nm = null;
	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_rsn_cd = null;
	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_rsn_nm = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_wrk_no_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_wrk_no_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_wrk_no_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_wrk_no_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_usr_cd = null;
	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_usr_nm = null;
	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_dpt_cd = null;
	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_dpt_nm = null;
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_dpt_cd = null;
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_dpt_nm = null;
	public mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D Rslt_bditm_p_PPanel;
	public MCColumnConfig columnRslt_bd_dpt_cd;// [Rslt]の[bditm_p.bd_dpt_cd]を[columnRslt_bd_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_dpt_nm;// [Rslt]の[bditm_p.bd_dpt_nm]を[columnRslt_bd_dpt_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_itm_cd;// [Rslt]の[bditm_p.bd_itm_cd]を[columnRslt_bd_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_itm_sub1;// [Rslt]の[bditm_p.bd_itm_sub1]を[columnRslt_bd_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_itm_sub2;// [Rslt]の[bditm_p.bd_itm_sub2]を[columnRslt_bd_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_itm_sub3;// [Rslt]の[bditm_p.bd_itm_sub3]を[columnRslt_bd_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_itm_nm;// [Rslt]の[bditm_p.bd_itm_nm]を[columnRslt_bd_itm_nm]としてエイリアス定義。
	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_lot_mng_typ = null;
	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_sublot_mng_typ = null;
	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_lot_no_typ = null;
	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_sublot_no_typ = null;
	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_sno1_mng_typ = null;
	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_sno2_mng_typ = null;
	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_sno3_mng_typ = null;
	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bd_sno4_mng_typ = null;
	public MCColumnConfig columnRslt_bd_lot_no;// [Rslt]の[bditm_p.bd_lot_no]を[columnRslt_bd_lot_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_sublot_no;// [Rslt]の[bditm_p.bd_sublot_no]を[columnRslt_bd_sublot_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_sno1;// [Rslt]の[bditm_p.bd_sno1]を[columnRslt_bd_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_sno2;// [Rslt]の[bditm_p.bd_sno2]を[columnRslt_bd_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_sno3;// [Rslt]の[bditm_p.bd_sno3]を[columnRslt_bd_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_sno4;// [Rslt]の[bditm_p.bd_sno4]を[columnRslt_bd_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_bp_cd;// [Rslt]の[bditm_p.bd_bp_cd]を[columnRslt_bd_bp_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_bp_nm;// [Rslt]の[bditm_p.bd_bp_nm]を[columnRslt_bd_bp_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_loc_cd;// [Rslt]の[bditm_p.bd_loc_cd]を[columnRslt_bd_loc_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_loc_nm;// [Rslt]の[bditm_p.bd_loc_nm]を[columnRslt_bd_loc_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_ctg_cd;// [Rslt]の[bditm_p.bd_ctg_cd]を[columnRslt_bd_ctg_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_ctg_nm;// [Rslt]の[bditm_p.bd_ctg_nm]を[columnRslt_bd_ctg_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_oper_cd;// [Rslt]の[bditm_p.bd_oper_cd]を[columnRslt_bd_oper_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_oper_nm;// [Rslt]の[bditm_p.bd_oper_nm]を[columnRslt_bd_oper_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_iv_no;// [Rslt]の[bditm_p.bd_iv_no]を[columnRslt_bd_iv_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_slo_no;// [Rslt]の[bditm_p.bd_slo_no]を[columnRslt_bd_slo_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_bd_po_no;// [Rslt]の[bditm_p.bd_po_no]を[columnRslt_bd_po_no]としてエイリアス定義。
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_no = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_d_no = null;
	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trnspt_cd = null;
	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trnspt_nm = null;
	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_vssl_flght = null;
	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_load_port_cd = null;
	/**
	 * Loading port name 船積港名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_load_port_nm = null;
	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_etd_dt = null;
	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dschrg_port_cd = null;
	/**
	 * Unloading port name 船卸港名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dschrg_port_nm = null;
	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_eta_dt = null;
	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_via_port_cd = null;
	/**
	 * Stopover point name 経由地名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_via_port_nm = null;
	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_via_schd_dt = null;
	/**
	 * Purchase biz transaction terms cd. 1 購買取引条件ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_tterm_cd1 = null;
	/**
	 * Purchase biz transaction terms name 1 購買取引条件名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_tterm_nm1 = null;
	/**
	 * Purchase biz transaction terms remarks 1 購買取引条件備考１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_tterm_rmrks1 = null;
	/**
	 * Purchase biz transaction terms cd. 2 購買取引条件ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_tterm_cd2 = null;
	/**
	 * Purchase biz transaction terms name 2 購買取引条件名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_tterm_nm2 = null;
	/**
	 * Purchase biz transaction terms remarks 2 購買取引条件備考２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_tterm_rmrks2 = null;
	/**
	 * Purchase biz transaction terms cd. 3 購買取引条件ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_tterm_cd3 = null;
	/**
	 * Purchase biz transaction terms name 3 購買取引条件名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_tterm_nm3 = null;
	/**
	 * Purchase biz transaction terms remarks 3 購買取引条件備考３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_tterm_rmrks3 = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_rmrks = null;
	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_print_rmrks = null;
	/**
	 * Sales order exchange rate 受注為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_xrate = null;
	/**
	 * Sales order taxpaying exchange rate 受注納税為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_ptax_xrate = null;
	/**
	 * Sales order transaction terms remarks 1 受注取引条件備考１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_tterm_rmrks1 = null;
	/**
	 * Sales order transaction terms remarks 2 受注取引条件備考２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_tterm_rmrks2 = null;
	/**
	 * Sales order transaction terms remarks 3 受注取引条件備考３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_tterm_rmrks3 = null;
	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_basis_typ = null;
	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_basis_typ_nm = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char3 = null;
	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cntry_org_cd = null;
	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cntry_org_nm = null;
	/**
	 * PO details remarks 注文明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_print_d_rmrks = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_dec_place = null;
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_qty;// [Rslt]の[base_unit_qty_p.qty]を[columnRslt_base_unit_qty]としてエイリアス定義。
	/**
	 * Scheduled receipt qty. 入荷予定数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arr_schd_qty = null;
	/**
	 * Receipt result qty. 入荷実績数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arr_act_qty = null;
	/**
	 * Receipt location WG 入荷場所ＷＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arr_loc_wg_cd = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_po_base_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt_po_base_unit_qty;// [Rslt]の[po_base_unit_qty_p.qty]を[columnRslt_po_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_po_trd_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnRslt_po_trd_cur_dscnt_amt;// [Rslt]の[po_trd_cur_dscnt_amt_p.amt]を[columnRslt_po_trd_cur_dscnt_amt]としてエイリアス定義。
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_cd = null;
	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_amt_rnd_typ = null;
	/**
	 * Tax rounding type 消費税端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_tax_rnd_typ = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_srv_req_no = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
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
	 * Apply 反映する.<p>
	 *
	 */
	public MCButton Btn_accept = null;
	/**
	 * Select same details in bulk 同一明細まとめ選択.<p>
	 *
	 */
	public MCCheckBox Btn_select_bndl_grp = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Btn_srch = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, REF};
	
	/** [MS_MSBEL2240_Srch01]のCallerの作成 */
	protected MSBEP_RcptIvDSel_MC.MS_MSBEL2240_Srch01Caller createMS_MSBEL2240_Srch01() {
		MSBEP_RcptIvDSel_MC.MS_MSBEL2240_Srch01Caller<MSBEP_RcptIvDSel, MS_MSBEL2240_Srch01Bridge>
		caller = ((MSBEP_RcptIvDSel_MC)this).new MS_MSBEL2240_Srch01Caller<MSBEP_RcptIvDSel, MS_MSBEL2240_Srch01Bridge>(
					(MSBEP_RcptIvDSel)this, new MS_MSBEL2240_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL2240_Srch01]の呼び出し */
	protected void callMS_MSBEL2240_Srch01() {
		MCCaller caller = createMS_MSBEL2240_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP2240.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP2240.RsltR> aRsltL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP2240.BtnR aBtnR;
	/** [Cnd2]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP2240.Cnd2R> aCnd2L;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP2240.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP2240.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP2240.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP2240.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBE.MSBEP2240.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP2240.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBE.MSBEP2240.RsltR createRsltR() {
		return mcframe.clientMSBE.MSBEP2240.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP2240.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBE.MSBEP2240.RsltR.class);
	}

	/**
	 * RsltTableを初期化します。
	 */
	protected void createRsltTable(){
		if(RsltTable == null){
			RsltTable = beansFactory.createTable2("Rslt.table");
		}
	}

	/**
	 * 項目コピーによってaBtnRを設定します。
	 *
	 * aBtnRのインスタンスは変更されません。
	 *
	 * @param row BtnR
	 */
	public void setBtnR(mcframe.clientMSBE.MSBEP2240.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBE.MSBEP2240.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBE.MSBEP2240.BtnR createBtnR() {
		return mcframe.clientMSBE.MSBEP2240.BtnR.create();
	}

	/**
	 * コピーによってaCnd2Lを設定します。
	 *
	 * aCnd2Lのインスタンスは変更されません。
	 *
	 * @param dataset Cnd2L
	 */
	public void setCnd2L(MCList<mcframe.clientMSBE.MSBEP2240.Cnd2R> aList) {
		if (getCnd2L() != aList) {
			getCnd2L().setAll(aList);
		}
	}

	/**
	 * [Cnd2]ブロックのコンテナaCnd2Lを返します。
	 *
	 * @return Cnd2L
	 */
	public MCList<mcframe.clientMSBE.MSBEP2240.Cnd2R> getCnd2L() {
		return aCnd2L;
	}

	/**
	 * aCnd2Rを作成します。
	 *
	 * @return Cnd2R
	 */
	public mcframe.clientMSBE.MSBEP2240.Cnd2R createCnd2R() {
		return mcframe.clientMSBE.MSBEP2240.Cnd2R.create();
	}

	/**
	 * aCnd2Lを作成します。
	 *
	 * @return Cnd2L
	 */
	public MCList<mcframe.clientMSBE.MSBEP2240.Cnd2R> createCnd2L() {
		return MCList.create(mcframe.clientMSBE.MSBEP2240.Cnd2R.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
		if(!MCCollectionUtil.contains(ret, getBtnR())) ret.add(getBtnR());
		if(!MCCollectionUtil.contains(ret, getCnd2L())) ret.add(getCnd2L());
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
		if(aCnt == getRsltL()) return "Rslt";
		if(aCnt == getBtnR()) return "Btn";
		if(aCnt == getCnd2L()) return "Cnd2";
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
		if(bId.equals("Rslt")) return getRsltL();
		if(bId.equals("Btn")) return getBtnR();
		if(bId.equals("Cnd2")) return getCnd2L();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_RcptIvDSel_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();
		aBtnR = createBtnR();
		aCnd2L = createCnd2L();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_RcptIvDSel_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
		aBtnR = createBtnR();
		aCnd2L = createCnd2L();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBEP_RcptIvDSel_MC.jbCreateRslt((MSBEP_RcptIvDSel)this);
		MSBEP_RcptIvDSel_MC.jbCreateBtn((MSBEP_RcptIvDSel)this);
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBEP_RcptIvDSel p) {
		p.Rslt_arr_schd_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$arr_schd_dt_p);
		p.Rslt_arr_schd_dt_p_PPanel.setName("Rslt.arr_schd_dt_p");
		p.columnRslt_arr_schd_dt = p.Rslt_arr_schd_dt_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_arr_schd_dt.addAliasName("Rslt.arr_schd_dt", p);
		p.columnRslt_arr_schd_hm = p.Rslt_arr_schd_dt_p_PPanel.columnYmdHm_hm;
		p.columnRslt_arr_schd_hm.addAliasName("Rslt.arr_schd_hm", p);
		p.Rslt_arr_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$arr_dt_p);
		p.Rslt_arr_dt_p_PPanel.setName("Rslt.arr_dt_p");
		p.columnRslt_arr_dt = p.Rslt_arr_dt_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_arr_dt.addAliasName("Rslt.arr_dt", p);
		p.columnRslt_arr_hm = p.Rslt_arr_dt_p_PPanel.columnYmdHm_hm;
		p.columnRslt_arr_hm.addAliasName("Rslt.arr_hm", p);
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$itm_p);
		p.Rslt_itm_p_PPanel.setName("Rslt.itm_p");
		p.columnRslt_itm_cd = p.Rslt_itm_p_PPanel.columnItm_itm_cd;
		p.columnRslt_itm_cd.addAliasName("Rslt.itm_cd", p);
		p.columnRslt_itm_sub1 = p.Rslt_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRslt_itm_sub1.addAliasName("Rslt.itm_sub1", p);
		p.columnRslt_itm_sub2 = p.Rslt_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRslt_itm_sub2.addAliasName("Rslt.itm_sub2", p);
		p.columnRslt_itm_sub3 = p.Rslt_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRslt_itm_sub3.addAliasName("Rslt.itm_sub3", p);
		p.columnRslt_itm_nm = p.Rslt_itm_p_PPanel.columnItm_itm_nm;
		p.columnRslt_itm_nm.addAliasName("Rslt.itm_nm", p);
		p.Rslt_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$trd_unit_qty_p);
		p.Rslt_trd_unit_qty_p_PPanel.setName("Rslt.trd_unit_qty_p");
		p.columnRslt_trd_unit_qty = p.Rslt_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_trd_unit_qty.addAliasName("Rslt.trd_unit_qty", p);
		p.Rslt_trd_cur_upri_p_PPanel = mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$trd_cur_upri_p);
		p.Rslt_trd_cur_upri_p_PPanel.setName("Rslt.trd_cur_upri_p");
		p.columnRslt_upri_not_tgt_flg = p.Rslt_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg;
		p.columnRslt_upri_not_tgt_flg.addAliasName("Rslt.upri_not_tgt_flg", p);
		p.columnRslt_trd_cur_upri = p.Rslt_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_upri;
		p.columnRslt_trd_cur_upri.addAliasName("Rslt.trd_cur_upri", p);
		p.columnRslt_interim_flg = p.Rslt_trd_cur_upri_p_PPanel.columnTrdUpriAmt_interim_flg;
		p.columnRslt_interim_flg.addAliasName("Rslt.interim_flg", p);
		p.columnRslt_trd_cur_amt = p.Rslt_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_amt;
		p.columnRslt_trd_cur_amt.addAliasName("Rslt.trd_cur_amt", p);
		p.columnRslt_trd_cur_inc_tax_amt = p.Rslt_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_inc_tax_amt;
		p.columnRslt_trd_cur_inc_tax_amt.addAliasName("Rslt.trd_cur_inc_tax_amt", p);
		p.columnRslt_tax_fix_flg = p.Rslt_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_fix_flg;
		p.columnRslt_tax_fix_flg.addAliasName("Rslt.tax_fix_flg", p);
		p.columnRslt_tax_cd = p.Rslt_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_cd;
		p.columnRslt_tax_cd.addAliasName("Rslt.tax_cd", p);
		p.columnRslt_tax_nm = p.Rslt_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_nm;
		p.columnRslt_tax_nm.addAliasName("Rslt.tax_nm", p);
		p.columnRslt_tax_rate = p.Rslt_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_rate;
		p.columnRslt_tax_rate.addAliasName("Rslt.tax_rate", p);
		p.columnRslt_tax_typ = p.Rslt_trd_cur_upri_p_PPanel.columnTrdUpriAmt_tax_typ;
		p.columnRslt_tax_typ.addAliasName("Rslt.tax_typ", p);
		p.columnRslt_inc_tax_flg = p.Rslt_trd_cur_upri_p_PPanel.columnTrdUpriAmt_inc_tax_flg;
		p.columnRslt_inc_tax_flg.addAliasName("Rslt.inc_tax_flg", p);
		p.columnRslt_trd_cur_tax_amt = p.Rslt_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_tax_amt;
		p.columnRslt_trd_cur_tax_amt.addAliasName("Rslt.trd_cur_tax_amt", p);
		p.columnRslt_trd_cur_dscnt_amt = p.Rslt_trd_cur_upri_p_PPanel.columnTrdUpriAmt_trd_cur_dscnt_amt;
		p.columnRslt_trd_cur_dscnt_amt.addAliasName("Rslt.trd_cur_dscnt_amt", p);
		p.columnRslt_dscnt_rsn_cd = p.Rslt_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_cd;
		p.columnRslt_dscnt_rsn_cd.addAliasName("Rslt.dscnt_rsn_cd", p);
		p.columnRslt_dscnt_rsn_nm = p.Rslt_trd_cur_upri_p_PPanel.columnTrdUpriAmt_dscnt_rsn_nm;
		p.columnRslt_dscnt_rsn_nm.addAliasName("Rslt.dscnt_rsn_nm", p);
		p.Rslt_trd_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$trd_cur_proc_upri_p);
		p.Rslt_trd_cur_proc_upri_p_PPanel.setName("Rslt.trd_cur_proc_upri_p");
		p.columnRslt_trd_cur_proc_upri = p.Rslt_trd_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_trd_cur_proc_upri.addAliasName("Rslt.trd_cur_proc_upri", p);
		p.Rslt_trd_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$trd_cur_proc_amt_p);
		p.Rslt_trd_cur_proc_amt_p_PPanel.setName("Rslt.trd_cur_proc_amt_p");
		p.columnRslt_trd_cur_proc_amt = p.Rslt_trd_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_proc_amt.addAliasName("Rslt.trd_cur_proc_amt", p);
		p.columnRslt_trd_cur_proc_tax_amt = p.Rslt_trd_cur_proc_amt_p_PPanel.columnAmt_tax_amt;
		p.columnRslt_trd_cur_proc_tax_amt.addAliasName("Rslt.trd_cur_proc_tax_amt", p);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$trd_cur_onr_prov_upri_p);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.setName("Rslt.trd_cur_onr_prov_upri_p");
		p.columnRslt_trd_cur_onr_prov_upri = p.Rslt_trd_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_trd_cur_onr_prov_upri.addAliasName("Rslt.trd_cur_onr_prov_upri", p);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$trd_cur_onr_prov_amt_p);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.setName("Rslt.trd_cur_onr_prov_amt_p");
		p.columnRslt_trd_cur_onr_prov_amt = p.Rslt_trd_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_onr_prov_amt.addAliasName("Rslt.trd_cur_onr_prov_amt", p);
		p.columnRslt_trd_cur_onr_prov_tax_amt = p.Rslt_trd_cur_onr_prov_amt_p_PPanel.columnAmt_tax_amt;
		p.columnRslt_trd_cur_onr_prov_tax_amt.addAliasName("Rslt.trd_cur_onr_prov_tax_amt", p);
		p.Rslt_wtax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$wtax_amt_p);
		p.Rslt_wtax_amt_p_PPanel.setName("Rslt.wtax_amt_p");
		p.columnRslt_wtax_amt = p.Rslt_wtax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_wtax_amt.addAliasName("Rslt.wtax_amt", p);
		p.Rslt_base_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$base_cur_upri_p);
		p.Rslt_base_cur_upri_p_PPanel.setName("Rslt.base_cur_upri_p");
		p.columnRslt_base_cur_upri = p.Rslt_base_cur_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_base_cur_upri.addAliasName("Rslt.base_cur_upri", p);
		p.Rslt_base_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$base_cur_proc_upri_p);
		p.Rslt_base_cur_proc_upri_p_PPanel.setName("Rslt.base_cur_proc_upri_p");
		p.columnRslt_base_cur_proc_upri = p.Rslt_base_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_base_cur_proc_upri.addAliasName("Rslt.base_cur_proc_upri", p);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$base_cur_onr_prov_upri_p);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.setName("Rslt.base_cur_onr_prov_upri_p");
		p.columnRslt_base_cur_onr_prov_upri = p.Rslt_base_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_base_cur_onr_prov_upri.addAliasName("Rslt.base_cur_onr_prov_upri", p);
		p.Rslt_base_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$base_cur_dscnt_amt_p);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.setName("Rslt.base_cur_dscnt_amt_p");
		p.columnRslt_base_cur_dscnt_amt = p.Rslt_base_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_dscnt_amt.addAliasName("Rslt.base_cur_dscnt_amt", p);
		p.Rslt_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$base_cur_amt_p);
		p.Rslt_base_cur_amt_p_PPanel.setName("Rslt.base_cur_amt_p");
		p.columnRslt_base_cur_amt = p.Rslt_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_amt.addAliasName("Rslt.base_cur_amt", p);
		p.Rslt_base_cur_inc_ctax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$base_cur_inc_ctax_amt_p);
		p.Rslt_base_cur_inc_ctax_amt_p_PPanel.setName("Rslt.base_cur_inc_ctax_amt_p");
		p.columnRslt_base_cur_inc_ctax_amt = p.Rslt_base_cur_inc_ctax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_inc_ctax_amt.addAliasName("Rslt.base_cur_inc_ctax_amt", p);
		p.Rslt_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$base_cur_tax_amt_p);
		p.Rslt_base_cur_tax_amt_p_PPanel.setName("Rslt.base_cur_tax_amt_p");
		p.columnRslt_base_cur_tax_amt = p.Rslt_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_tax_amt.addAliasName("Rslt.base_cur_tax_amt", p);
		p.Rslt_base_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$base_cur_proc_amt_p);
		p.Rslt_base_cur_proc_amt_p_PPanel.setName("Rslt.base_cur_proc_amt_p");
		p.columnRslt_base_cur_proc_amt = p.Rslt_base_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_proc_amt.addAliasName("Rslt.base_cur_proc_amt", p);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$base_cur_onr_prov_amt_p);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.setName("Rslt.base_cur_onr_prov_amt_p");
		p.columnRslt_base_cur_onr_prov_amt = p.Rslt_base_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_onr_prov_amt.addAliasName("Rslt.base_cur_onr_prov_amt", p);
		p.Rslt_ptax_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$ptax_cur_upri_p);
		p.Rslt_ptax_cur_upri_p_PPanel.setName("Rslt.ptax_cur_upri_p");
		p.columnRslt_ptax_cur_upri = p.Rslt_ptax_cur_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_ptax_cur_upri.addAliasName("Rslt.ptax_cur_upri", p);
		p.Rslt_ptax_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$ptax_cur_proc_upri_p);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.setName("Rslt.ptax_cur_proc_upri_p");
		p.columnRslt_ptax_cur_proc_upri = p.Rslt_ptax_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_ptax_cur_proc_upri.addAliasName("Rslt.ptax_cur_proc_upri", p);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$ptax_cur_onr_prov_upri_p);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.setName("Rslt.ptax_cur_onr_prov_upri_p");
		p.columnRslt_ptax_cur_onr_prov_upri = p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnRslt_ptax_cur_onr_prov_upri.addAliasName("Rslt.ptax_cur_onr_prov_upri", p);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$ptax_cur_dscnt_amt_p);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.setName("Rslt.ptax_cur_dscnt_amt_p");
		p.columnRslt_ptax_cur_dscnt_amt = p.Rslt_ptax_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_dscnt_amt.addAliasName("Rslt.ptax_cur_dscnt_amt", p);
		p.Rslt_ptax_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$ptax_cur_amt_p);
		p.Rslt_ptax_cur_amt_p_PPanel.setName("Rslt.ptax_cur_amt_p");
		p.columnRslt_ptax_cur_amt = p.Rslt_ptax_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_amt.addAliasName("Rslt.ptax_cur_amt", p);
		p.Rslt_ptax_cur_inc_ctax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$ptax_cur_inc_ctax_amt_p);
		p.Rslt_ptax_cur_inc_ctax_amt_p_PPanel.setName("Rslt.ptax_cur_inc_ctax_amt_p");
		p.columnRslt_ptax_cur_inc_ctax_amt = p.Rslt_ptax_cur_inc_ctax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_inc_ctax_amt.addAliasName("Rslt.ptax_cur_inc_ctax_amt", p);
		p.Rslt_ptax_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$ptax_cur_tax_amt_p);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.setName("Rslt.ptax_cur_tax_amt_p");
		p.columnRslt_ptax_cur_tax_amt = p.Rslt_ptax_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_tax_amt.addAliasName("Rslt.ptax_cur_tax_amt", p);
		p.Rslt_ptax_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$ptax_cur_proc_amt_p);
		p.Rslt_ptax_cur_proc_amt_p_PPanel.setName("Rslt.ptax_cur_proc_amt_p");
		p.columnRslt_ptax_cur_proc_amt = p.Rslt_ptax_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_proc_amt.addAliasName("Rslt.ptax_cur_proc_amt", p);
		p.Rslt_ptax_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$ptax_cur_onr_prov_amt_p);
		p.Rslt_ptax_cur_onr_prov_amt_p_PPanel.setName("Rslt.ptax_cur_onr_prov_amt_p");
		p.columnRslt_ptax_cur_onr_prov_amt = p.Rslt_ptax_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ptax_cur_onr_prov_amt.addAliasName("Rslt.ptax_cur_onr_prov_amt", p);
		p.Rslt_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$sno_wrk_no_p);
		p.Rslt_sno_wrk_no_p_PPanel.setName("Rslt.sno_wrk_no_p");
		p.columnRslt_sno1 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRslt_sno1.addAliasName("Rslt.sno1", p);
		p.columnRslt_sno2 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRslt_sno2.addAliasName("Rslt.sno2", p);
		p.columnRslt_sno3 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRslt_sno3.addAliasName("Rslt.sno3", p);
		p.columnRslt_sno4 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRslt_sno4.addAliasName("Rslt.sno4", p);
		p.columnRslt_wrk_no = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnRslt_wrk_no.addAliasName("Rslt.wrk_no", p);
		p.columnRslt_wrk_nm = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnRslt_wrk_nm.addAliasName("Rslt.wrk_nm", p);
		p.Rslt_bditm_p_PPanel = mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$bditm_p);
		p.Rslt_bditm_p_PPanel.setName("Rslt.bditm_p");
		p.columnRslt_bd_dpt_cd = p.Rslt_bditm_p_PPanel.columnBdItem_bd_dpt_cd;
		p.columnRslt_bd_dpt_cd.addAliasName("Rslt.bd_dpt_cd", p);
		p.columnRslt_bd_dpt_nm = p.Rslt_bditm_p_PPanel.columnBdItem_bd_dpt_nm;
		p.columnRslt_bd_dpt_nm.addAliasName("Rslt.bd_dpt_nm", p);
		p.columnRslt_bd_itm_cd = p.Rslt_bditm_p_PPanel.columnBdItem_bd_itm_cd;
		p.columnRslt_bd_itm_cd.addAliasName("Rslt.bd_itm_cd", p);
		p.columnRslt_bd_itm_sub1 = p.Rslt_bditm_p_PPanel.columnBdItem_bd_itm_sub1;
		p.columnRslt_bd_itm_sub1.addAliasName("Rslt.bd_itm_sub1", p);
		p.columnRslt_bd_itm_sub2 = p.Rslt_bditm_p_PPanel.columnBdItem_bd_itm_sub2;
		p.columnRslt_bd_itm_sub2.addAliasName("Rslt.bd_itm_sub2", p);
		p.columnRslt_bd_itm_sub3 = p.Rslt_bditm_p_PPanel.columnBdItem_bd_itm_sub3;
		p.columnRslt_bd_itm_sub3.addAliasName("Rslt.bd_itm_sub3", p);
		p.columnRslt_bd_itm_nm = p.Rslt_bditm_p_PPanel.columnBdItem_bd_itm_nm;
		p.columnRslt_bd_itm_nm.addAliasName("Rslt.bd_itm_nm", p);
		p.columnRslt_bd_lot_no = p.Rslt_bditm_p_PPanel.columnBdItem_bd_lot_no;
		p.columnRslt_bd_lot_no.addAliasName("Rslt.bd_lot_no", p);
		p.columnRslt_bd_sublot_no = p.Rslt_bditm_p_PPanel.columnBdItem_bd_sublot_no;
		p.columnRslt_bd_sublot_no.addAliasName("Rslt.bd_sublot_no", p);
		p.columnRslt_bd_sno1 = p.Rslt_bditm_p_PPanel.columnBdItem_bd_sno1;
		p.columnRslt_bd_sno1.addAliasName("Rslt.bd_sno1", p);
		p.columnRslt_bd_sno2 = p.Rslt_bditm_p_PPanel.columnBdItem_bd_sno2;
		p.columnRslt_bd_sno2.addAliasName("Rslt.bd_sno2", p);
		p.columnRslt_bd_sno3 = p.Rslt_bditm_p_PPanel.columnBdItem_bd_sno3;
		p.columnRslt_bd_sno3.addAliasName("Rslt.bd_sno3", p);
		p.columnRslt_bd_sno4 = p.Rslt_bditm_p_PPanel.columnBdItem_bd_sno4;
		p.columnRslt_bd_sno4.addAliasName("Rslt.bd_sno4", p);
		p.columnRslt_bd_bp_cd = p.Rslt_bditm_p_PPanel.columnBdItem_bd_bp_cd;
		p.columnRslt_bd_bp_cd.addAliasName("Rslt.bd_bp_cd", p);
		p.columnRslt_bd_bp_nm = p.Rslt_bditm_p_PPanel.columnBdItem_bd_bp_nm;
		p.columnRslt_bd_bp_nm.addAliasName("Rslt.bd_bp_nm", p);
		p.columnRslt_bd_loc_cd = p.Rslt_bditm_p_PPanel.columnBdItem_bd_loc_cd;
		p.columnRslt_bd_loc_cd.addAliasName("Rslt.bd_loc_cd", p);
		p.columnRslt_bd_loc_nm = p.Rslt_bditm_p_PPanel.columnBdItem_bd_loc_nm;
		p.columnRslt_bd_loc_nm.addAliasName("Rslt.bd_loc_nm", p);
		p.columnRslt_bd_ctg_cd = p.Rslt_bditm_p_PPanel.columnBdItem_bd_ctg_cd;
		p.columnRslt_bd_ctg_cd.addAliasName("Rslt.bd_ctg_cd", p);
		p.columnRslt_bd_ctg_nm = p.Rslt_bditm_p_PPanel.columnBdItem_bd_ctg_nm;
		p.columnRslt_bd_ctg_nm.addAliasName("Rslt.bd_ctg_nm", p);
		p.columnRslt_bd_oper_cd = p.Rslt_bditm_p_PPanel.columnBdItem_bd_oper_cd;
		p.columnRslt_bd_oper_cd.addAliasName("Rslt.bd_oper_cd", p);
		p.columnRslt_bd_oper_nm = p.Rslt_bditm_p_PPanel.columnBdItem_bd_oper_nm;
		p.columnRslt_bd_oper_nm.addAliasName("Rslt.bd_oper_nm", p);
		p.columnRslt_bd_iv_no = p.Rslt_bditm_p_PPanel.columnBdItem_bd_iv_no;
		p.columnRslt_bd_iv_no.addAliasName("Rslt.bd_iv_no", p);
		p.columnRslt_bd_slo_no = p.Rslt_bditm_p_PPanel.columnBdItem_bd_slo_no;
		p.columnRslt_bd_slo_no.addAliasName("Rslt.bd_slo_no", p);
		p.columnRslt_bd_po_no = p.Rslt_bditm_p_PPanel.columnBdItem_bd_po_no;
		p.columnRslt_bd_po_no.addAliasName("Rslt.bd_po_no", p);
		p.Rslt_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$base_unit_qty_p);
		p.Rslt_base_unit_qty_p_PPanel.setName("Rslt.base_unit_qty_p");
		p.columnRslt_base_unit_qty = p.Rslt_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_qty.addAliasName("Rslt.base_unit_qty", p);
		p.Rslt_po_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$po_base_unit_qty_p);
		p.Rslt_po_base_unit_qty_p_PPanel.setName("Rslt.po_base_unit_qty_p");
		p.columnRslt_po_base_unit_qty = p.Rslt_po_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_po_base_unit_qty.addAliasName("Rslt.po_base_unit_qty", p);
		p.Rslt_po_trd_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP2240.RsltR.$po_trd_cur_dscnt_amt_p);
		p.Rslt_po_trd_cur_dscnt_amt_p_PPanel.setName("Rslt.po_trd_cur_dscnt_amt_p");
		p.columnRslt_po_trd_cur_dscnt_amt = p.Rslt_po_trd_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_po_trd_cur_dscnt_amt.addAliasName("Rslt.po_trd_cur_dscnt_amt", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBEP_RcptIvDSel p) {
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

	
	/** [Rslt_purc_id_typ_ListPutter]の定義 */
	private MCListPutter Rslt_purc_id_typ_p = null;

	/**
	 * [Rslt_purc_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_purc_id_typ_ListPutter() {
		if (Rslt_purc_id_typ_p == null) {
			Rslt_purc_id_typ_p = createRslt_purc_id_typ_ListPutter(columnRslt_purc_id_typ, "purc_id_typ");

		}
		return Rslt_purc_id_typ_p;
	}
	
	
	/** [Rslt_purc_rsn_cd_ListPutter]の定義 */
	private MCListPutter Rslt_purc_rsn_cd_p = null;

	/**
	 * [Rslt_purc_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_purc_rsn_cd_ListPutter() {
		if (Rslt_purc_rsn_cd_p == null) {
			Rslt_purc_rsn_cd_p = createRslt_purc_rsn_cd_ListPutter(columnRslt_purc_rsn_cd, "purc_rsn_cd");

		}
		return Rslt_purc_rsn_cd_p;
	}
	
	
	/** [Rslt_ap_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_ap_dpt_cd_p = null;

	/**
	 * [Rslt_ap_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_ap_dpt_cd_ListPutter() {
		if (Rslt_ap_dpt_cd_p == null) {
			Rslt_ap_dpt_cd_p = createRslt_ap_dpt_cd_ListPutter(columnRslt_ap_dpt_cd, "ap_dpt_cd");

		}
		return Rslt_ap_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_RcptIvDSel create(){
		MSBEP_RcptIvDSel p = new MSBEP_RcptIvDSel();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_RcptIvDSel create(String name){
		MSBEP_RcptIvDSel p = new MSBEP_RcptIvDSel(name);
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
		MSBEP_RcptIvDSel_MC.jbfInitRslt((MSBEP_RcptIvDSel)this);
		MSBEP_RcptIvDSel_MC.jbfInitBtn((MSBEP_RcptIvDSel)this);
		MSBEP_RcptIvDSel_MC.jbInitRslt((MSBEP_RcptIvDSel)this);
		MSBEP_RcptIvDSel_MC.jbInitBtn((MSBEP_RcptIvDSel)this);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBEP_RcptIvDSel p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_bndl_tgt_flg = p.beansFactory.createTableColumn("Rslt.bndl_tgt_flg", MCColumnType.CHECK);
		p.columnRslt_pr_sts_typ = p.beansFactory.createTableColumn("Rslt.pr_sts_typ", MCColumnType.TEXT);
		p.columnRslt_pr_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.pr_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cd = p.beansFactory.createTableColumn("Rslt.trd_cd", MCColumnType.TEXT);
		p.columnRslt_trd_nm = p.beansFactory.createTableColumn("Rslt.trd_nm", MCColumnType.TEXT);
		p.columnRslt_trd_ptn_typ = p.beansFactory.createTableColumn("Rslt.trd_ptn_typ", MCColumnType.TEXT);
		p.columnRslt_po_no = p.beansFactory.createTableColumn("Rslt.po_no", MCColumnType.TEXT);
		p.columnRslt_po_d_no = p.beansFactory.createTableColumn("Rslt.po_d_no", MCColumnType.TEXT);
		p.columnRslt_purc_schd_no = p.beansFactory.createTableColumn("Rslt.purc_schd_no", MCColumnType.TEXT);
		p.columnRslt_arr_schd_no = p.beansFactory.createTableColumn("Rslt.arr_schd_no", MCColumnType.TEXT);
		p.columnRslt_arr_act_no = p.beansFactory.createTableColumn("Rslt.arr_act_no", MCColumnType.TEXT);
		p.columnRslt_rcpt_iv_no = p.beansFactory.createTableColumn("Rslt.rcpt_iv_no", MCColumnType.TEXT);
		p.columnRslt_purc_schd_dt = p.beansFactory.createTableColumn("Rslt.purc_schd_dt", MCColumnType.DATE);
		p.columnRslt_iv_itm_nm = p.beansFactory.createTableColumn("Rslt.iv_itm_nm", MCColumnType.TEXT);
		p.columnRslt_sundry_itm_flg = p.beansFactory.createTableColumn("Rslt.sundry_itm_flg", MCColumnType.CHECK);
		p.columnRslt_stk_mng_typ = p.beansFactory.createTableColumn("Rslt.stk_mng_typ", MCColumnType.TEXT);
		p.columnRslt_asset_mng_typ = p.beansFactory.createTableColumn("Rslt.asset_mng_typ", MCColumnType.TEXT);
		p.columnRslt_dscnt_itm_flg = p.beansFactory.createTableColumn("Rslt.dscnt_itm_flg", MCColumnType.CHECK);
		p.columnRslt_sno1_mng_typ = p.beansFactory.createTableColumn("Rslt.sno1_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno2_mng_typ = p.beansFactory.createTableColumn("Rslt.sno2_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno3_mng_typ = p.beansFactory.createTableColumn("Rslt.sno3_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno4_mng_typ = p.beansFactory.createTableColumn("Rslt.sno4_mng_typ", MCColumnType.TEXT);
		p.columnRslt_exim_xpns_typ = p.beansFactory.createTableColumn("Rslt.exim_xpns_typ", MCColumnType.TEXT);
		p.columnRslt_maker_cd = p.beansFactory.createTableColumn("Rslt.maker_cd", MCColumnType.TEXT);
		p.columnRslt_maker_nm = p.beansFactory.createTableColumn("Rslt.maker_nm", MCColumnType.TEXT);
		p.columnRslt_trd_unit_cd = p.beansFactory.createTableColumn("Rslt.trd_unit_cd", MCColumnType.TEXT);
		p.columnRslt_trd_unit_nm = p.beansFactory.createTableColumn("Rslt.trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Rslt.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_conv_qty = p.beansFactory.createTableColumn("Rslt.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_dec_place = p.beansFactory.createTableColumn("Rslt.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt.trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_repurc_obli_flg = p.beansFactory.createTableColumn("Rslt.repurc_obli_flg", MCColumnType.CHECK);
		p.columnRslt_wtax_rate = p.beansFactory.createTableColumn("Rslt.wtax_rate", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_trd_amt_dec_place = p.beansFactory.createTableColumn("Rslt.trd_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_upri_dec_place = p.beansFactory.createTableColumn("Rslt.trd_upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_xrate_inpt_flg = p.beansFactory.createTableColumn("Rslt.xrate_inpt_flg", MCColumnType.CHECK);
		p.columnRslt_xrate = p.beansFactory.createTableColumn("Rslt.xrate", MCColumnType.NUMBER);
		p.columnRslt_base_cur_cd = p.beansFactory.createTableColumn("Rslt.base_cur_cd", MCColumnType.TEXT);
		p.columnRslt_base_cur_nm = p.beansFactory.createTableColumn("Rslt.base_cur_nm", MCColumnType.TEXT);
		p.columnRslt_base_amt_dec_place = p.beansFactory.createTableColumn("Rslt.base_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_upri_dec_place = p.beansFactory.createTableColumn("Rslt.base_upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_ptax_cur_cd = p.beansFactory.createTableColumn("Rslt.ptax_cur_cd", MCColumnType.TEXT);
		p.columnRslt_ptax_cur_nm = p.beansFactory.createTableColumn("Rslt.ptax_cur_nm", MCColumnType.TEXT);
		p.columnRslt_ptax_amt_dec_place = p.beansFactory.createTableColumn("Rslt.ptax_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_ptax_upri_dec_place = p.beansFactory.createTableColumn("Rslt.ptax_upri_dec_place", MCColumnType.NUMBER);
		p.columnRslt_ptax_xrate_inpt_flg = p.beansFactory.createTableColumn("Rslt.ptax_xrate_inpt_flg", MCColumnType.CHECK);
		p.columnRslt_ptax_xrate = p.beansFactory.createTableColumn("Rslt.ptax_xrate", MCColumnType.NUMBER);
		p.columnRslt_sppl_itm_cd = p.beansFactory.createTableColumn("Rslt.sppl_itm_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_itm_nm = p.beansFactory.createTableColumn("Rslt.sppl_itm_nm", MCColumnType.TEXT);
		p.columnRslt_cst_itm_cd = p.beansFactory.createTableColumn("Rslt.cst_itm_cd", MCColumnType.TEXT);
		p.columnRslt_cst_itm_nm = p.beansFactory.createTableColumn("Rslt.cst_itm_nm", MCColumnType.TEXT);
		p.columnRslt_purc_id_typ = p.beansFactory.createTableColumn("Rslt.purc_id_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_purc_id_typ_nm = p.beansFactory.createTableColumn("Rslt.purc_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_purc_rsn_cd = p.beansFactory.createTableColumn("Rslt.purc_rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_purc_rsn_nm = p.beansFactory.createTableColumn("Rslt.purc_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_purc_usr_cd = p.beansFactory.createTableColumn("Rslt.purc_usr_cd", MCColumnType.TEXT);
		p.columnRslt_purc_usr_nm = p.beansFactory.createTableColumn("Rslt.purc_usr_nm", MCColumnType.TEXT);
		p.columnRslt_purc_dpt_cd = p.beansFactory.createTableColumn("Rslt.purc_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_purc_dpt_nm = p.beansFactory.createTableColumn("Rslt.purc_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_ap_dpt_cd = p.beansFactory.createTableColumn("Rslt.ap_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_ap_dpt_nm = p.beansFactory.createTableColumn("Rslt.ap_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_bd_lot_mng_typ = p.beansFactory.createTableColumn("Rslt.bd_lot_mng_typ", MCColumnType.TEXT);
		p.columnRslt_bd_sublot_mng_typ = p.beansFactory.createTableColumn("Rslt.bd_sublot_mng_typ", MCColumnType.TEXT);
		p.columnRslt_bd_lot_no_typ = p.beansFactory.createTableColumn("Rslt.bd_lot_no_typ", MCColumnType.TEXT);
		p.columnRslt_bd_sublot_no_typ = p.beansFactory.createTableColumn("Rslt.bd_sublot_no_typ", MCColumnType.TEXT);
		p.columnRslt_bd_sno1_mng_typ = p.beansFactory.createTableColumn("Rslt.bd_sno1_mng_typ", MCColumnType.TEXT);
		p.columnRslt_bd_sno2_mng_typ = p.beansFactory.createTableColumn("Rslt.bd_sno2_mng_typ", MCColumnType.TEXT);
		p.columnRslt_bd_sno3_mng_typ = p.beansFactory.createTableColumn("Rslt.bd_sno3_mng_typ", MCColumnType.TEXT);
		p.columnRslt_bd_sno4_mng_typ = p.beansFactory.createTableColumn("Rslt.bd_sno4_mng_typ", MCColumnType.TEXT);
		p.columnRslt_slo_no = p.beansFactory.createTableColumn("Rslt.slo_no", MCColumnType.TEXT);
		p.columnRslt_slo_d_no = p.beansFactory.createTableColumn("Rslt.slo_d_no", MCColumnType.TEXT);
		p.columnRslt_trnspt_cd = p.beansFactory.createTableColumn("Rslt.trnspt_cd", MCColumnType.TEXT);
		p.columnRslt_trnspt_nm = p.beansFactory.createTableColumn("Rslt.trnspt_nm", MCColumnType.TEXT);
		p.columnRslt_vssl_flght = p.beansFactory.createTableColumn("Rslt.vssl_flght", MCColumnType.TEXT);
		p.columnRslt_load_port_cd = p.beansFactory.createTableColumn("Rslt.load_port_cd", MCColumnType.TEXT);
		p.columnRslt_load_port_nm = p.beansFactory.createTableColumn("Rslt.load_port_nm", MCColumnType.TEXT);
		p.columnRslt_etd_dt = p.beansFactory.createTableColumn("Rslt.etd_dt", MCColumnType.DATE);
		p.columnRslt_dschrg_port_cd = p.beansFactory.createTableColumn("Rslt.dschrg_port_cd", MCColumnType.TEXT);
		p.columnRslt_dschrg_port_nm = p.beansFactory.createTableColumn("Rslt.dschrg_port_nm", MCColumnType.TEXT);
		p.columnRslt_eta_dt = p.beansFactory.createTableColumn("Rslt.eta_dt", MCColumnType.DATE);
		p.columnRslt_via_port_cd = p.beansFactory.createTableColumn("Rslt.via_port_cd", MCColumnType.TEXT);
		p.columnRslt_via_port_nm = p.beansFactory.createTableColumn("Rslt.via_port_nm", MCColumnType.TEXT);
		p.columnRslt_via_schd_dt = p.beansFactory.createTableColumn("Rslt.via_schd_dt", MCColumnType.DATE);
		p.columnRslt_purc_tterm_cd1 = p.beansFactory.createTableColumn("Rslt.purc_tterm_cd1", MCColumnType.TEXT);
		p.columnRslt_purc_tterm_nm1 = p.beansFactory.createTableColumn("Rslt.purc_tterm_nm1", MCColumnType.TEXT);
		p.columnRslt_purc_tterm_rmrks1 = p.beansFactory.createTableColumn("Rslt.purc_tterm_rmrks1", MCColumnType.TEXT);
		p.columnRslt_purc_tterm_cd2 = p.beansFactory.createTableColumn("Rslt.purc_tterm_cd2", MCColumnType.TEXT);
		p.columnRslt_purc_tterm_nm2 = p.beansFactory.createTableColumn("Rslt.purc_tterm_nm2", MCColumnType.TEXT);
		p.columnRslt_purc_tterm_rmrks2 = p.beansFactory.createTableColumn("Rslt.purc_tterm_rmrks2", MCColumnType.TEXT);
		p.columnRslt_purc_tterm_cd3 = p.beansFactory.createTableColumn("Rslt.purc_tterm_cd3", MCColumnType.TEXT);
		p.columnRslt_purc_tterm_nm3 = p.beansFactory.createTableColumn("Rslt.purc_tterm_nm3", MCColumnType.TEXT);
		p.columnRslt_purc_tterm_rmrks3 = p.beansFactory.createTableColumn("Rslt.purc_tterm_rmrks3", MCColumnType.TEXT);
		p.columnRslt_trd_rmrks = p.beansFactory.createTableColumn("Rslt.trd_rmrks", MCColumnType.TEXT);
		p.columnRslt_po_print_rmrks = p.beansFactory.createTableColumn("Rslt.po_print_rmrks", MCColumnType.TEXT);
		p.columnRslt_slo_xrate = p.beansFactory.createTableColumn("Rslt.slo_xrate", MCColumnType.NUMBER);
		p.columnRslt_slo_ptax_xrate = p.beansFactory.createTableColumn("Rslt.slo_ptax_xrate", MCColumnType.NUMBER);
		p.columnRslt_slo_tterm_rmrks1 = p.beansFactory.createTableColumn("Rslt.slo_tterm_rmrks1", MCColumnType.TEXT);
		p.columnRslt_slo_tterm_rmrks2 = p.beansFactory.createTableColumn("Rslt.slo_tterm_rmrks2", MCColumnType.TEXT);
		p.columnRslt_slo_tterm_rmrks3 = p.beansFactory.createTableColumn("Rslt.slo_tterm_rmrks3", MCColumnType.TEXT);
		p.columnRslt_purc_basis_typ = p.beansFactory.createTableColumn("Rslt.purc_basis_typ", MCColumnType.TEXT);
		p.columnRslt_purc_basis_typ_nm = p.beansFactory.createTableColumn("Rslt.purc_basis_typ_nm", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_cntry_org_cd = p.beansFactory.createTableColumn("Rslt.cntry_org_cd", MCColumnType.TEXT);
		p.columnRslt_cntry_org_nm = p.beansFactory.createTableColumn("Rslt.cntry_org_nm", MCColumnType.TEXT);
		p.columnRslt_po_print_d_rmrks = p.beansFactory.createTableColumn("Rslt.po_print_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_arr_schd_qty = p.beansFactory.createTableColumn("Rslt.arr_schd_qty", MCColumnType.NUMBER);
		p.columnRslt_arr_act_qty = p.beansFactory.createTableColumn("Rslt.arr_act_qty", MCColumnType.NUMBER);
		p.columnRslt_arr_loc_wg_cd = p.beansFactory.createTableColumn("Rslt.arr_loc_wg_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_cd = p.beansFactory.createTableColumn("Rslt.sppl_cd", MCColumnType.TEXT);
		p.columnRslt_purc_amt_rnd_typ = p.beansFactory.createTableColumn("Rslt.purc_amt_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_purc_tax_rnd_typ = p.beansFactory.createTableColumn("Rslt.purc_tax_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_usr_id = p.beansFactory.createTableColumn("Rslt.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt_upd_usr_nm = p.beansFactory.createTableColumn("Rslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt_upd_func_id = p.beansFactory.createTableColumn("Rslt.upd_func_id", MCColumnType.TEXT);
		p.columnRslt_upd_func_nm = p.beansFactory.createTableColumn("Rslt.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_RcptIvDSel p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_accept = p.beansFactory.createButton("Btn.accept", "upd");
		p.Btn_select_bndl_grp = p.beansFactory.createCheckBox("Btn.select_bndl_grp");
		p.Btn_srch = p.beansFactory.createButton("Btn.srch", "srch");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBEP_RcptIvDSel p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.setLastBeans(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setValueCheck(false);
		p.RsltPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBEP_RcptIvDSel p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.BtnPanel.setLastBeans(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_accept);
		p.Btn_accept.setIcon("REGISTER");
		p.Btn_accept.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_accept);
		p.Btn_accept.setNextBeans(p.Btn_select_bndl_grp);
		p.BtnPanel.add(p.Btn_select_bndl_grp);
		p.Btn_select_bndl_grp.setNextBeans(p.Btn_srch);
		p.Btn_select_bndl_grp.setRow(p.getBtnR(), mcframe.clientMSBE.MSBEP2240.BtnR.select_bndl_grp_META);
		p.Btn_srch.setIcon("SEARCH");
		p.Btn_srch.setFunctionKey(MCFunctionKey.F1);
		p.BtnPanel.add(p.Btn_srch);
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
		MSBEP_RcptIvDSel_MC.mcInitRslt((MSBEP_RcptIvDSel)this);
		MSBEP_RcptIvDSel_MC.mcInitBtn((MSBEP_RcptIvDSel)this);

		// [SRCH]ステータスのモードの設定
		MSBEP_RcptIvDSel_MC.statusInitSRCH_Cnd((MSBEP_RcptIvDSel)this);
		MSBEP_RcptIvDSel_MC.statusInitSRCH_Rslt((MSBEP_RcptIvDSel)this);
		MSBEP_RcptIvDSel_MC.statusInitSRCH_Btn((MSBEP_RcptIvDSel)this);
		MSBEP_RcptIvDSel_MC.statusInitSRCH_Cnd2((MSBEP_RcptIvDSel)this);

		// [REF]ステータスのモードの設定
		MSBEP_RcptIvDSel_MC.statusInitREF_Cnd((MSBEP_RcptIvDSel)this);
		MSBEP_RcptIvDSel_MC.statusInitREF_Rslt((MSBEP_RcptIvDSel)this);
		MSBEP_RcptIvDSel_MC.statusInitREF_Btn((MSBEP_RcptIvDSel)this);
		MSBEP_RcptIvDSel_MC.statusInitREF_Cnd2((MSBEP_RcptIvDSel)this);

	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBEP_RcptIvDSel p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_bndl_tgt_flg.addAllListener(p);
		p.columnRslt_pr_sts_typ.addAllListener(p);
		p.columnRslt_pr_sts_typ.setListListener(p);
		p.columnRslt_pr_sts_typ_nm.addAllListener(p);
		p.columnRslt_pr_sts_typ_nm.setListListener(p);
		p.columnRslt_trd_cd.addAllListener(p);
		p.columnRslt_trd_cd.setListListener(p);
		p.columnRslt_trd_nm.addAllListener(p);
		p.columnRslt_trd_nm.setListListener(p);
		p.columnRslt_trd_ptn_typ.addAllListener(p);
		p.columnRslt_trd_ptn_typ.setListListener(p);
		p.columnRslt_po_no.addAllListener(p);
		p.columnRslt_po_no.setListListener(p);
		p.columnRslt_po_d_no.addAllListener(p);
		p.columnRslt_po_d_no.setListListener(p);
		p.columnRslt_purc_schd_no.addAllListener(p);
		p.columnRslt_purc_schd_no.setListListener(p);
		p.columnRslt_arr_schd_no.addAllListener(p);
		p.columnRslt_arr_schd_no.setListListener(p);
		p.columnRslt_arr_act_no.addAllListener(p);
		p.columnRslt_arr_act_no.setListListener(p);
		p.columnRslt_rcpt_iv_no.addAllListener(p);
		p.columnRslt_rcpt_iv_no.setListListener(p);
		p.columnRslt_purc_schd_dt.addAllListener(p);
		p.columnRslt_purc_schd_dt.setListListener(p);
		p.columnRslt_iv_itm_nm.addAllListener(p);
		p.columnRslt_iv_itm_nm.setListListener(p);
		p.columnRslt_sundry_itm_flg.addAllListener(p);
		p.columnRslt_stk_mng_typ.addAllListener(p);
		p.columnRslt_stk_mng_typ.setListListener(p);
		p.columnRslt_asset_mng_typ.addAllListener(p);
		p.columnRslt_asset_mng_typ.setListListener(p);
		p.columnRslt_dscnt_itm_flg.addAllListener(p);
		p.columnRslt_sno1_mng_typ.addAllListener(p);
		p.columnRslt_sno1_mng_typ.setListListener(p);
		p.columnRslt_sno2_mng_typ.addAllListener(p);
		p.columnRslt_sno2_mng_typ.setListListener(p);
		p.columnRslt_sno3_mng_typ.addAllListener(p);
		p.columnRslt_sno3_mng_typ.setListListener(p);
		p.columnRslt_sno4_mng_typ.addAllListener(p);
		p.columnRslt_sno4_mng_typ.setListListener(p);
		p.columnRslt_exim_xpns_typ.addAllListener(p);
		p.columnRslt_exim_xpns_typ.setListListener(p);
		p.columnRslt_maker_cd.addAllListener(p);
		p.columnRslt_maker_cd.setListListener(p);
		p.columnRslt_maker_nm.addAllListener(p);
		p.columnRslt_maker_nm.setListListener(p);
		p.columnRslt_trd_unit_cd.addAllListener(p);
		p.columnRslt_trd_unit_cd.setListListener(p);
		p.columnRslt_trd_unit_nm.addAllListener(p);
		p.columnRslt_trd_unit_nm.setListListener(p);
		p.columnRslt_trd_unit_conv_base_qty.addAllListener(p);
		p.columnRslt_trd_unit_conv_base_qty.setListListener(p);
		p.columnRslt_trd_unit_conv_qty.addAllListener(p);
		p.columnRslt_trd_unit_conv_qty.setListListener(p);
		p.columnRslt_trd_unit_dec_place.addAllListener(p);
		p.columnRslt_trd_unit_dec_place.setListListener(p);
		p.columnRslt_trd_unit_rnd_typ.addAllListener(p);
		p.columnRslt_trd_unit_rnd_typ.setListListener(p);
		p.columnRslt_repurc_obli_flg.addAllListener(p);
		p.columnRslt_wtax_rate.addAllListener(p);
		p.columnRslt_wtax_rate.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_trd_amt_dec_place.addAllListener(p);
		p.columnRslt_trd_amt_dec_place.setListListener(p);
		p.columnRslt_trd_upri_dec_place.addAllListener(p);
		p.columnRslt_trd_upri_dec_place.setListListener(p);
		p.columnRslt_xrate_inpt_flg.addAllListener(p);
		p.columnRslt_xrate.addAllListener(p);
		p.columnRslt_xrate.setListListener(p);
		p.columnRslt_base_cur_cd.addAllListener(p);
		p.columnRslt_base_cur_cd.setListListener(p);
		p.columnRslt_base_cur_nm.addAllListener(p);
		p.columnRslt_base_cur_nm.setListListener(p);
		p.columnRslt_base_amt_dec_place.addAllListener(p);
		p.columnRslt_base_amt_dec_place.setListListener(p);
		p.columnRslt_base_upri_dec_place.addAllListener(p);
		p.columnRslt_base_upri_dec_place.setListListener(p);
		p.columnRslt_ptax_cur_cd.addAllListener(p);
		p.columnRslt_ptax_cur_cd.setListListener(p);
		p.columnRslt_ptax_cur_nm.addAllListener(p);
		p.columnRslt_ptax_cur_nm.setListListener(p);
		p.columnRslt_ptax_amt_dec_place.addAllListener(p);
		p.columnRslt_ptax_amt_dec_place.setListListener(p);
		p.columnRslt_ptax_upri_dec_place.addAllListener(p);
		p.columnRslt_ptax_upri_dec_place.setListListener(p);
		p.columnRslt_ptax_xrate_inpt_flg.addAllListener(p);
		p.columnRslt_ptax_xrate.addAllListener(p);
		p.columnRslt_ptax_xrate.setListListener(p);
		p.columnRslt_sppl_itm_cd.addAllListener(p);
		p.columnRslt_sppl_itm_cd.setListListener(p);
		p.columnRslt_sppl_itm_nm.addAllListener(p);
		p.columnRslt_sppl_itm_nm.setListListener(p);
		p.columnRslt_cst_itm_cd.addAllListener(p);
		p.columnRslt_cst_itm_cd.setListListener(p);
		p.columnRslt_cst_itm_nm.addAllListener(p);
		p.columnRslt_cst_itm_nm.setListListener(p);
		p.columnRslt_purc_id_typ.addAllListener(p);
		p.columnRslt_purc_id_typ.setListListener(p);
		p.columnRslt_purc_id_typ_nm.addAllListener(p);
		p.columnRslt_purc_id_typ_nm.setListListener(p);
		p.columnRslt_purc_rsn_cd.addAllListener(p);
		p.columnRslt_purc_rsn_cd.setListListener(p);
		p.columnRslt_purc_rsn_nm.addAllListener(p);
		p.columnRslt_purc_rsn_nm.setListListener(p);
		p.columnRslt_purc_usr_cd.addAllListener(p);
		p.columnRslt_purc_usr_cd.setListListener(p);
		p.columnRslt_purc_usr_nm.addAllListener(p);
		p.columnRslt_purc_usr_nm.setListListener(p);
		p.columnRslt_purc_dpt_cd.addAllListener(p);
		p.columnRslt_purc_dpt_cd.setListListener(p);
		p.columnRslt_purc_dpt_nm.addAllListener(p);
		p.columnRslt_purc_dpt_nm.setListListener(p);
		p.columnRslt_ap_dpt_cd.addAllListener(p);
		p.columnRslt_ap_dpt_cd.setListListener(p);
		p.columnRslt_ap_dpt_nm.addAllListener(p);
		p.columnRslt_ap_dpt_nm.setListListener(p);
		p.columnRslt_bd_lot_mng_typ.addAllListener(p);
		p.columnRslt_bd_lot_mng_typ.setListListener(p);
		p.columnRslt_bd_sublot_mng_typ.addAllListener(p);
		p.columnRslt_bd_sublot_mng_typ.setListListener(p);
		p.columnRslt_bd_lot_no_typ.addAllListener(p);
		p.columnRslt_bd_lot_no_typ.setListListener(p);
		p.columnRslt_bd_sublot_no_typ.addAllListener(p);
		p.columnRslt_bd_sublot_no_typ.setListListener(p);
		p.columnRslt_bd_sno1_mng_typ.addAllListener(p);
		p.columnRslt_bd_sno1_mng_typ.setListListener(p);
		p.columnRslt_bd_sno2_mng_typ.addAllListener(p);
		p.columnRslt_bd_sno2_mng_typ.setListListener(p);
		p.columnRslt_bd_sno3_mng_typ.addAllListener(p);
		p.columnRslt_bd_sno3_mng_typ.setListListener(p);
		p.columnRslt_bd_sno4_mng_typ.addAllListener(p);
		p.columnRslt_bd_sno4_mng_typ.setListListener(p);
		p.columnRslt_slo_no.addAllListener(p);
		p.columnRslt_slo_no.setListListener(p);
		p.columnRslt_slo_d_no.addAllListener(p);
		p.columnRslt_slo_d_no.setListListener(p);
		p.columnRslt_trnspt_cd.addAllListener(p);
		p.columnRslt_trnspt_cd.setListListener(p);
		p.columnRslt_trnspt_nm.addAllListener(p);
		p.columnRslt_trnspt_nm.setListListener(p);
		p.columnRslt_vssl_flght.addAllListener(p);
		p.columnRslt_vssl_flght.setListListener(p);
		p.columnRslt_load_port_cd.addAllListener(p);
		p.columnRslt_load_port_cd.setListListener(p);
		p.columnRslt_load_port_nm.addAllListener(p);
		p.columnRslt_load_port_nm.setListListener(p);
		p.columnRslt_etd_dt.addAllListener(p);
		p.columnRslt_etd_dt.setListListener(p);
		p.columnRslt_dschrg_port_cd.addAllListener(p);
		p.columnRslt_dschrg_port_cd.setListListener(p);
		p.columnRslt_dschrg_port_nm.addAllListener(p);
		p.columnRslt_dschrg_port_nm.setListListener(p);
		p.columnRslt_eta_dt.addAllListener(p);
		p.columnRslt_eta_dt.setListListener(p);
		p.columnRslt_via_port_cd.addAllListener(p);
		p.columnRslt_via_port_cd.setListListener(p);
		p.columnRslt_via_port_nm.addAllListener(p);
		p.columnRslt_via_port_nm.setListListener(p);
		p.columnRslt_via_schd_dt.addAllListener(p);
		p.columnRslt_via_schd_dt.setListListener(p);
		p.columnRslt_purc_tterm_cd1.addAllListener(p);
		p.columnRslt_purc_tterm_cd1.setListListener(p);
		p.columnRslt_purc_tterm_nm1.addAllListener(p);
		p.columnRslt_purc_tterm_nm1.setListListener(p);
		p.columnRslt_purc_tterm_rmrks1.addAllListener(p);
		p.columnRslt_purc_tterm_rmrks1.setListListener(p);
		p.columnRslt_purc_tterm_cd2.addAllListener(p);
		p.columnRslt_purc_tterm_cd2.setListListener(p);
		p.columnRslt_purc_tterm_nm2.addAllListener(p);
		p.columnRslt_purc_tterm_nm2.setListListener(p);
		p.columnRslt_purc_tterm_rmrks2.addAllListener(p);
		p.columnRslt_purc_tterm_rmrks2.setListListener(p);
		p.columnRslt_purc_tterm_cd3.addAllListener(p);
		p.columnRslt_purc_tterm_cd3.setListListener(p);
		p.columnRslt_purc_tterm_nm3.addAllListener(p);
		p.columnRslt_purc_tterm_nm3.setListListener(p);
		p.columnRslt_purc_tterm_rmrks3.addAllListener(p);
		p.columnRslt_purc_tterm_rmrks3.setListListener(p);
		p.columnRslt_trd_rmrks.addAllListener(p);
		p.columnRslt_trd_rmrks.setListListener(p);
		p.columnRslt_po_print_rmrks.addAllListener(p);
		p.columnRslt_po_print_rmrks.setListListener(p);
		p.columnRslt_slo_xrate.addAllListener(p);
		p.columnRslt_slo_xrate.setListListener(p);
		p.columnRslt_slo_ptax_xrate.addAllListener(p);
		p.columnRslt_slo_ptax_xrate.setListListener(p);
		p.columnRslt_slo_tterm_rmrks1.addAllListener(p);
		p.columnRslt_slo_tterm_rmrks1.setListListener(p);
		p.columnRslt_slo_tterm_rmrks2.addAllListener(p);
		p.columnRslt_slo_tterm_rmrks2.setListListener(p);
		p.columnRslt_slo_tterm_rmrks3.addAllListener(p);
		p.columnRslt_slo_tterm_rmrks3.setListListener(p);
		p.columnRslt_purc_basis_typ.addAllListener(p);
		p.columnRslt_purc_basis_typ.setListListener(p);
		p.columnRslt_purc_basis_typ_nm.addAllListener(p);
		p.columnRslt_purc_basis_typ_nm.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_cntry_org_cd.addAllListener(p);
		p.columnRslt_cntry_org_cd.setListListener(p);
		p.columnRslt_cntry_org_nm.addAllListener(p);
		p.columnRslt_cntry_org_nm.setListListener(p);
		p.columnRslt_po_print_d_rmrks.addAllListener(p);
		p.columnRslt_po_print_d_rmrks.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_unit_dec_place.addAllListener(p);
		p.columnRslt_base_unit_dec_place.setListListener(p);
		p.columnRslt_base_unit_rnd_typ.addAllListener(p);
		p.columnRslt_base_unit_rnd_typ.setListListener(p);
		p.columnRslt_arr_schd_qty.addAllListener(p);
		p.columnRslt_arr_schd_qty.setListListener(p);
		p.columnRslt_arr_act_qty.addAllListener(p);
		p.columnRslt_arr_act_qty.setListListener(p);
		p.columnRslt_arr_loc_wg_cd.addAllListener(p);
		p.columnRslt_arr_loc_wg_cd.setListListener(p);
		p.columnRslt_sppl_cd.addAllListener(p);
		p.columnRslt_sppl_cd.setListListener(p);
		p.columnRslt_purc_amt_rnd_typ.addAllListener(p);
		p.columnRslt_purc_amt_rnd_typ.setListListener(p);
		p.columnRslt_purc_tax_rnd_typ.addAllListener(p);
		p.columnRslt_purc_tax_rnd_typ.setListListener(p);
		p.columnRslt_ins_usr_id.addAllListener(p);
		p.columnRslt_ins_usr_id.setListListener(p);
		p.columnRslt_ins_usr_nm.addAllListener(p);
		p.columnRslt_ins_usr_nm.setListListener(p);
		p.columnRslt_ins_func_id.addAllListener(p);
		p.columnRslt_ins_func_id.setListListener(p);
		p.columnRslt_ins_func_nm.addAllListener(p);
		p.columnRslt_ins_func_nm.setListListener(p);
		p.columnRslt_ins_ts.addAllListener(p);
		p.columnRslt_ins_ts.setListListener(p);
		p.columnRslt_upd_usr_id.addAllListener(p);
		p.columnRslt_upd_usr_id.setListListener(p);
		p.columnRslt_upd_usr_nm.addAllListener(p);
		p.columnRslt_upd_usr_nm.setListListener(p);
		p.columnRslt_upd_func_id.addAllListener(p);
		p.columnRslt_upd_func_id.setListListener(p);
		p.columnRslt_upd_func_nm.addAllListener(p);
		p.columnRslt_upd_func_nm.setListListener(p);
		p.columnRslt_upd_ts.addAllListener(p);
		p.columnRslt_upd_ts.setListListener(p);
		p.columnRslt_upd_srv_req_no.addAllListener(p);
		p.columnRslt_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_RcptIvDSel p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_accept.addAllListener(p);
		p.Btn_accept.setAPMethodName("doBtn_accept");
		p.Btn_select_bndl_grp.addAllListener(p);
		p.Btn_srch.addAllListener(p);
		p.Btn_srch.setAPMethodName("doBtn_srch");
	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBEP_RcptIvDSel p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBEP_RcptIvDSel p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnRslt_bndl_tgt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_arr_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_arr_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_arr_schd_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_arr_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_stk_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_asset_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_dscnt_itm_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_exim_xpns_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_maker_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.REQUIRED);
		p.Rslt_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_repurc_obli_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_wtax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_inc_ctax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_inc_ctax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_proc_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_onr_prov_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_purc_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_bditm_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnRslt_bd_lot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_bd_sublot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_bd_lot_no_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_bd_sublot_no_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_bd_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_bd_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_bd_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_bd_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trnspt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_vssl_flght.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_load_port_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_load_port_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_etd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_eta_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_via_port_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_via_port_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_via_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_rmrks1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_rmrks2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_rmrks3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_po_print_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_ptax_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_rmrks1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_rmrks2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_rmrks3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_basis_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_basis_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_po_print_d_rmrks.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_arr_schd_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_arr_act_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_arr_loc_wg_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_po_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_po_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_sppl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_purc_amt_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_purc_tax_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBEP_RcptIvDSel p){
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_accept.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_bndl_grp.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_srch.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MSBEP_RcptIvDSel p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBEP_RcptIvDSel p){

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBEP_RcptIvDSel p){
		p.columnRslt_check.putMode(p, REF, MCMode.REQUIRED);
		p.columnRslt_bndl_tgt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.columnRslt_pr_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pr_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_po_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_arr_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_arr_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_arr_schd_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_arr_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_iv_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_stk_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_asset_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_dscnt_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_exim_xpns_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_maker_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5070.MSUBP_TrdUpriAmt_D.READ_ONLY);
		p.Rslt_trd_cur_upri_p_PPanel.columnTrdUpriAmt_upri_not_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_repurc_obli_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_trd_cur_proc_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_proc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_trd_cur_onr_prov_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_wtax_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_wtax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_trd_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_xrate_inpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_base_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_proc_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_inc_ctax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_proc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_onr_prov_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_base_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_ptax_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_proc_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Rslt_ptax_cur_dscnt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_inc_ctax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_proc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ptax_cur_onr_prov_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ptax_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ptax_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ptax_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_ptax_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_ptax_xrate_inpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_purc_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_bditm_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5040.MSUBP_BdItem_D.READ_ONLY);
		p.columnRslt_bd_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_bd_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_bd_lot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_bd_sublot_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_bd_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_bd_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_bd_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_bd_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_bditm_p_PPanel.columnBdItem_bd_bp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_bditm_p_PPanel.columnBdItem_bd_bp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trnspt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trnspt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_vssl_flght.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_load_port_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_load_port_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_etd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dschrg_port_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_eta_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_via_port_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_via_port_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_via_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_rmrks1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_rmrks2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_tterm_rmrks3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_po_print_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_xrate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_ptax_xrate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_rmrks1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_rmrks2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_tterm_rmrks3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_basis_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_basis_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cntry_org_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_cntry_org_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_po_print_d_rmrks.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_arr_schd_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_arr_act_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_arr_loc_wg_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_po_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Rslt_po_trd_cur_dscnt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_sppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_purc_amt_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_purc_tax_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBEP_RcptIvDSel p){
		p.Btn_select_all.putMode(p, REF, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.ENABLE);
		p.Btn_accept.putMode(p, REF, MCMode.ENABLE);
		p.Btn_select_bndl_grp.putMode(p, REF, MCMode.ENABLE);
		p.Btn_srch.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MSBEP_RcptIvDSel p){

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
		MSBEP_RcptIvDSel_MC.setTableConfigRslt((MSBEP_RcptIvDSel)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBEP_RcptIvDSel p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_bndl_tgt_flg.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.bndl_tgt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bndl_tgt_flg);
		p.columnRslt_pr_sts_typ.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.pr_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pr_sts_typ);
		p.columnRslt_pr_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.pr_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pr_sts_typ_nm);
		p.columnRslt_trd_cd.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.trd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cd);
		p.columnRslt_trd_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.trd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_nm);
		p.columnRslt_trd_ptn_typ.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.trd_ptn_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_ptn_typ);
		p.columnRslt_po_no.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.po_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_no);
		p.columnRslt_po_d_no.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.po_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_d_no);
		p.columnRslt_purc_schd_no.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.purc_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_schd_no);
		p.columnRslt_arr_schd_no.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.arr_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_arr_schd_no);
		p.columnRslt_arr_act_no.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.arr_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_arr_act_no);
		p.columnRslt_rcpt_iv_no.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.rcpt_iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_no);
		p.columnRslt_purc_schd_dt.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.purc_schd_dt_META);
		p.columnRslt_purc_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_schd_dt);
		p.RsltTable.addTable(p.Rslt_arr_schd_dt_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_arr_dt_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_iv_itm_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.iv_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_itm_nm);
		p.columnRslt_sundry_itm_flg.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.sundry_itm_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sundry_itm_flg);
		p.columnRslt_stk_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.stk_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_mng_typ);
		p.columnRslt_asset_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.asset_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asset_mng_typ);
		p.columnRslt_dscnt_itm_flg.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.dscnt_itm_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dscnt_itm_flg);
		p.columnRslt_sno1_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.sno1_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno1_mng_typ);
		p.columnRslt_sno2_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.sno2_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno2_mng_typ);
		p.columnRslt_sno3_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.sno3_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno3_mng_typ);
		p.columnRslt_sno4_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.sno4_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno4_mng_typ);
		p.columnRslt_exim_xpns_typ.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.exim_xpns_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_exim_xpns_typ);
		p.columnRslt_maker_cd.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.maker_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_maker_cd);
		p.columnRslt_maker_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.maker_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_maker_nm);
		p.columnRslt_trd_unit_cd.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.trd_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_cd);
		p.columnRslt_trd_unit_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.trd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_nm);
		p.columnRslt_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.trd_unit_conv_base_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_conv_base_qty);
		p.columnRslt_trd_unit_conv_qty.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.trd_unit_conv_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_conv_qty);
		p.columnRslt_trd_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.trd_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_dec_place);
		p.columnRslt_trd_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.trd_unit_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_rnd_typ);
		p.RsltTable.addTable(p.Rslt_trd_unit_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_upri_p_PPanel.TrdUpriAmtTable);
		p.columnRslt_repurc_obli_flg.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.repurc_obli_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_repurc_obli_flg);
		p.RsltTable.addTable(p.Rslt_trd_cur_proc_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_proc_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.columnRslt_wtax_rate.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.wtax_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wtax_rate);
		p.RsltTable.addTable(p.Rslt_wtax_amt_p_PPanel.AmtTable);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_trd_amt_dec_place.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.trd_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_amt_dec_place);
		p.columnRslt_trd_upri_dec_place.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.trd_upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_upri_dec_place);
		p.columnRslt_xrate_inpt_flg.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.xrate_inpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate_inpt_flg);
		p.columnRslt_xrate.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate);
		p.RsltTable.addTable(p.Rslt_base_cur_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_base_cur_proc_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_base_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_base_cur_dscnt_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_inc_ctax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_proc_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.columnRslt_base_cur_cd.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.base_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_cd);
		p.columnRslt_base_cur_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.base_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_nm);
		p.columnRslt_base_amt_dec_place.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.base_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_amt_dec_place);
		p.columnRslt_base_upri_dec_place.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.base_upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_upri_dec_place);
		p.RsltTable.addTable(p.Rslt_ptax_cur_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_proc_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_dscnt_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_inc_ctax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_proc_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ptax_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.columnRslt_ptax_cur_cd.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.ptax_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_cd);
		p.columnRslt_ptax_cur_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.ptax_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_cur_nm);
		p.columnRslt_ptax_amt_dec_place.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.ptax_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_amt_dec_place);
		p.columnRslt_ptax_upri_dec_place.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.ptax_upri_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_upri_dec_place);
		p.columnRslt_ptax_xrate_inpt_flg.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.ptax_xrate_inpt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_xrate_inpt_flg);
		p.columnRslt_ptax_xrate.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.ptax_xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_xrate);
		p.columnRslt_sppl_itm_cd.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.sppl_itm_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_itm_cd);
		p.columnRslt_sppl_itm_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.sppl_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_itm_nm);
		p.columnRslt_cst_itm_cd.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.cst_itm_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_cd);
		p.columnRslt_cst_itm_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.cst_itm_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_itm_nm);
		p.columnRslt_purc_id_typ.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.purc_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_id_typ);
		p.columnRslt_purc_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.purc_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_id_typ_nm);
		p.columnRslt_purc_rsn_cd.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.purc_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_rsn_cd);
		p.columnRslt_purc_rsn_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.purc_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_rsn_nm);
		p.RsltTable.addTable(p.Rslt_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnRslt_purc_usr_cd.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.purc_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_usr_cd);
		p.columnRslt_purc_usr_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.purc_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_usr_nm);
		p.columnRslt_purc_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.purc_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_dpt_cd);
		p.columnRslt_purc_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.purc_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_dpt_nm);
		p.columnRslt_ap_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.ap_dpt_cd_META);
		p.columnRslt_ap_dpt_cd.setListType(MCListType.STRICT);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_dpt_cd);
		p.columnRslt_ap_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.ap_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_dpt_nm);
		p.RsltTable.addTable(p.Rslt_bditm_p_PPanel.BdItemTable);
		p.columnRslt_bd_lot_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.bd_lot_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_lot_mng_typ);
		p.columnRslt_bd_sublot_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.bd_sublot_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_sublot_mng_typ);
		p.columnRslt_bd_lot_no_typ.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.bd_lot_no_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_lot_no_typ);
		p.columnRslt_bd_sublot_no_typ.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.bd_sublot_no_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_sublot_no_typ);
		p.columnRslt_bd_sno1_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.bd_sno1_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_sno1_mng_typ);
		p.columnRslt_bd_sno2_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.bd_sno2_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_sno2_mng_typ);
		p.columnRslt_bd_sno3_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.bd_sno3_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_sno3_mng_typ);
		p.columnRslt_bd_sno4_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.bd_sno4_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bd_sno4_mng_typ);
		p.columnRslt_slo_no.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.slo_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_no);
		p.columnRslt_slo_d_no.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.slo_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_d_no);
		p.columnRslt_trnspt_cd.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.trnspt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trnspt_cd);
		p.columnRslt_trnspt_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.trnspt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trnspt_nm);
		p.columnRslt_vssl_flght.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.vssl_flght_META);
		p.RsltTable.addColumnConfig(p.columnRslt_vssl_flght);
		p.columnRslt_load_port_cd.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.load_port_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_load_port_cd);
		p.columnRslt_load_port_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.load_port_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_load_port_nm);
		p.columnRslt_etd_dt.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.etd_dt_META);
		p.columnRslt_etd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_etd_dt);
		p.columnRslt_dschrg_port_cd.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.dschrg_port_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dschrg_port_cd);
		p.columnRslt_dschrg_port_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.dschrg_port_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dschrg_port_nm);
		p.columnRslt_eta_dt.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.eta_dt_META);
		p.columnRslt_eta_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_eta_dt);
		p.columnRslt_via_port_cd.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.via_port_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_via_port_cd);
		p.columnRslt_via_port_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.via_port_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_via_port_nm);
		p.columnRslt_via_schd_dt.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.via_schd_dt_META);
		p.columnRslt_via_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_via_schd_dt);
		p.columnRslt_purc_tterm_cd1.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.purc_tterm_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_tterm_cd1);
		p.columnRslt_purc_tterm_nm1.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.purc_tterm_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_tterm_nm1);
		p.columnRslt_purc_tterm_rmrks1.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.purc_tterm_rmrks1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_tterm_rmrks1);
		p.columnRslt_purc_tterm_cd2.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.purc_tterm_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_tterm_cd2);
		p.columnRslt_purc_tterm_nm2.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.purc_tterm_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_tterm_nm2);
		p.columnRslt_purc_tterm_rmrks2.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.purc_tterm_rmrks2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_tterm_rmrks2);
		p.columnRslt_purc_tterm_cd3.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.purc_tterm_cd3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_tterm_cd3);
		p.columnRslt_purc_tterm_nm3.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.purc_tterm_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_tterm_nm3);
		p.columnRslt_purc_tterm_rmrks3.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.purc_tterm_rmrks3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_tterm_rmrks3);
		p.columnRslt_trd_rmrks.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.trd_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_rmrks);
		p.columnRslt_po_print_rmrks.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.po_print_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_print_rmrks);
		p.columnRslt_slo_xrate.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.slo_xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_xrate);
		p.columnRslt_slo_ptax_xrate.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.slo_ptax_xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_ptax_xrate);
		p.columnRslt_slo_tterm_rmrks1.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.slo_tterm_rmrks1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_tterm_rmrks1);
		p.columnRslt_slo_tterm_rmrks2.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.slo_tterm_rmrks2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_tterm_rmrks2);
		p.columnRslt_slo_tterm_rmrks3.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.slo_tterm_rmrks3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_tterm_rmrks3);
		p.columnRslt_purc_basis_typ.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.purc_basis_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_basis_typ);
		p.columnRslt_purc_basis_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.purc_basis_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_basis_typ_nm);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_cntry_org_cd.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.cntry_org_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cntry_org_cd);
		p.columnRslt_cntry_org_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.cntry_org_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cntry_org_nm);
		p.columnRslt_po_print_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.po_print_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_print_d_rmrks);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.columnRslt_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.base_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_dec_place);
		p.columnRslt_base_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.base_unit_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_rnd_typ);
		p.RsltTable.addTable(p.Rslt_base_unit_qty_p_PPanel.QtyTable);
		p.columnRslt_arr_schd_qty.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.arr_schd_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_arr_schd_qty);
		p.columnRslt_arr_act_qty.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.arr_act_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_arr_act_qty);
		p.columnRslt_arr_loc_wg_cd.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.arr_loc_wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_arr_loc_wg_cd);
		p.RsltTable.addTable(p.Rslt_po_base_unit_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_po_trd_cur_dscnt_amt_p_PPanel.AmtTable);
		p.columnRslt_sppl_cd.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.sppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_cd);
		p.columnRslt_purc_amt_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.purc_amt_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_amt_rnd_typ);
		p.columnRslt_purc_tax_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.purc_tax_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_tax_rnd_typ);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBE.MSBEP2240.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnRslt_purc_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_purc_id_typ.getListConfig().setPutter(getRslt_purc_id_typ_ListPutter());
		columnRslt_purc_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_purc_rsn_cd.getListConfig().setPutter(getRslt_purc_rsn_cd_ListPutter());
		columnRslt_ap_dpt_cd.getListConfig().setPutter(getRslt_ap_dpt_cd_ListPutter());
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
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * [Rslt_purc_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_purc_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt_purc_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_purc_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt_ap_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_ap_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == columnRslt_purc_id_typ) return getRslt_purc_id_typ(row, info);
		if(combo == columnRslt_purc_rsn_cd) return getRslt_purc_rsn_cd(row, info);
		if(combo == columnRslt_ap_dpt_cd) return getRslt_ap_dpt_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_accept) doBtn_accept(info);
		else if (ap == Btn_srch) doBtn_srch(info);
	}

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[accept]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_accept(MCEventInfo info);

	/**
	 * [Btn]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_srch(MCEventInfo info);

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
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_bndl_tgt_flg) return doRslt_bndl_tgt_flg_VC(info);
		if (vc == columnRslt_pr_sts_typ) return doRslt_pr_sts_typ_VC(info);
		if (vc == columnRslt_pr_sts_typ_nm) return doRslt_pr_sts_typ_nm_VC(info);
		if (vc == columnRslt_trd_cd) return doRslt_trd_cd_VC(info);
		if (vc == columnRslt_trd_nm) return doRslt_trd_nm_VC(info);
		if (vc == columnRslt_trd_ptn_typ) return doRslt_trd_ptn_typ_VC(info);
		if (vc == columnRslt_po_no) return doRslt_po_no_VC(info);
		if (vc == columnRslt_po_d_no) return doRslt_po_d_no_VC(info);
		if (vc == columnRslt_purc_schd_no) return doRslt_purc_schd_no_VC(info);
		if (vc == columnRslt_arr_schd_no) return doRslt_arr_schd_no_VC(info);
		if (vc == columnRslt_arr_act_no) return doRslt_arr_act_no_VC(info);
		if (vc == columnRslt_rcpt_iv_no) return doRslt_rcpt_iv_no_VC(info);
		if (vc == columnRslt_purc_schd_dt) return doRslt_purc_schd_dt_VC(info);
		if (vc == columnRslt_iv_itm_nm) return doRslt_iv_itm_nm_VC(info);
		if (vc == columnRslt_sundry_itm_flg) return doRslt_sundry_itm_flg_VC(info);
		if (vc == columnRslt_stk_mng_typ) return doRslt_stk_mng_typ_VC(info);
		if (vc == columnRslt_asset_mng_typ) return doRslt_asset_mng_typ_VC(info);
		if (vc == columnRslt_dscnt_itm_flg) return doRslt_dscnt_itm_flg_VC(info);
		if (vc == columnRslt_sno1_mng_typ) return doRslt_sno1_mng_typ_VC(info);
		if (vc == columnRslt_sno2_mng_typ) return doRslt_sno2_mng_typ_VC(info);
		if (vc == columnRslt_sno3_mng_typ) return doRslt_sno3_mng_typ_VC(info);
		if (vc == columnRslt_sno4_mng_typ) return doRslt_sno4_mng_typ_VC(info);
		if (vc == columnRslt_exim_xpns_typ) return doRslt_exim_xpns_typ_VC(info);
		if (vc == columnRslt_maker_cd) return doRslt_maker_cd_VC(info);
		if (vc == columnRslt_maker_nm) return doRslt_maker_nm_VC(info);
		if (vc == columnRslt_trd_unit_cd) return doRslt_trd_unit_cd_VC(info);
		if (vc == columnRslt_trd_unit_nm) return doRslt_trd_unit_nm_VC(info);
		if (vc == columnRslt_trd_unit_conv_base_qty) return doRslt_trd_unit_conv_base_qty_VC(info);
		if (vc == columnRslt_trd_unit_conv_qty) return doRslt_trd_unit_conv_qty_VC(info);
		if (vc == columnRslt_trd_unit_dec_place) return doRslt_trd_unit_dec_place_VC(info);
		if (vc == columnRslt_trd_unit_rnd_typ) return doRslt_trd_unit_rnd_typ_VC(info);
		if (vc == columnRslt_repurc_obli_flg) return doRslt_repurc_obli_flg_VC(info);
		if (vc == columnRslt_wtax_rate) return doRslt_wtax_rate_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_trd_amt_dec_place) return doRslt_trd_amt_dec_place_VC(info);
		if (vc == columnRslt_trd_upri_dec_place) return doRslt_trd_upri_dec_place_VC(info);
		if (vc == columnRslt_xrate_inpt_flg) return doRslt_xrate_inpt_flg_VC(info);
		if (vc == columnRslt_xrate) return doRslt_xrate_VC(info);
		if (vc == columnRslt_base_cur_cd) return doRslt_base_cur_cd_VC(info);
		if (vc == columnRslt_base_cur_nm) return doRslt_base_cur_nm_VC(info);
		if (vc == columnRslt_base_amt_dec_place) return doRslt_base_amt_dec_place_VC(info);
		if (vc == columnRslt_base_upri_dec_place) return doRslt_base_upri_dec_place_VC(info);
		if (vc == columnRslt_ptax_cur_cd) return doRslt_ptax_cur_cd_VC(info);
		if (vc == columnRslt_ptax_cur_nm) return doRslt_ptax_cur_nm_VC(info);
		if (vc == columnRslt_ptax_amt_dec_place) return doRslt_ptax_amt_dec_place_VC(info);
		if (vc == columnRslt_ptax_upri_dec_place) return doRslt_ptax_upri_dec_place_VC(info);
		if (vc == columnRslt_ptax_xrate_inpt_flg) return doRslt_ptax_xrate_inpt_flg_VC(info);
		if (vc == columnRslt_ptax_xrate) return doRslt_ptax_xrate_VC(info);
		if (vc == columnRslt_sppl_itm_cd) return doRslt_sppl_itm_cd_VC(info);
		if (vc == columnRslt_sppl_itm_nm) return doRslt_sppl_itm_nm_VC(info);
		if (vc == columnRslt_cst_itm_cd) return doRslt_cst_itm_cd_VC(info);
		if (vc == columnRslt_cst_itm_nm) return doRslt_cst_itm_nm_VC(info);
		if (vc == columnRslt_purc_id_typ) return doRslt_purc_id_typ_VC(info);
		if (vc == columnRslt_purc_id_typ_nm) return doRslt_purc_id_typ_nm_VC(info);
		if (vc == columnRslt_purc_rsn_cd) return doRslt_purc_rsn_cd_VC(info);
		if (vc == columnRslt_purc_rsn_nm) return doRslt_purc_rsn_nm_VC(info);
		if (vc == columnRslt_purc_usr_cd) return doRslt_purc_usr_cd_VC(info);
		if (vc == columnRslt_purc_usr_nm) return doRslt_purc_usr_nm_VC(info);
		if (vc == columnRslt_purc_dpt_cd) return doRslt_purc_dpt_cd_VC(info);
		if (vc == columnRslt_purc_dpt_nm) return doRslt_purc_dpt_nm_VC(info);
		if (vc == columnRslt_ap_dpt_cd) return doRslt_ap_dpt_cd_VC(info);
		if (vc == columnRslt_ap_dpt_nm) return doRslt_ap_dpt_nm_VC(info);
		if (vc == columnRslt_bd_lot_mng_typ) return doRslt_bd_lot_mng_typ_VC(info);
		if (vc == columnRslt_bd_sublot_mng_typ) return doRslt_bd_sublot_mng_typ_VC(info);
		if (vc == columnRslt_bd_lot_no_typ) return doRslt_bd_lot_no_typ_VC(info);
		if (vc == columnRslt_bd_sublot_no_typ) return doRslt_bd_sublot_no_typ_VC(info);
		if (vc == columnRslt_bd_sno1_mng_typ) return doRslt_bd_sno1_mng_typ_VC(info);
		if (vc == columnRslt_bd_sno2_mng_typ) return doRslt_bd_sno2_mng_typ_VC(info);
		if (vc == columnRslt_bd_sno3_mng_typ) return doRslt_bd_sno3_mng_typ_VC(info);
		if (vc == columnRslt_bd_sno4_mng_typ) return doRslt_bd_sno4_mng_typ_VC(info);
		if (vc == columnRslt_slo_no) return doRslt_slo_no_VC(info);
		if (vc == columnRslt_slo_d_no) return doRslt_slo_d_no_VC(info);
		if (vc == columnRslt_trnspt_cd) return doRslt_trnspt_cd_VC(info);
		if (vc == columnRslt_trnspt_nm) return doRslt_trnspt_nm_VC(info);
		if (vc == columnRslt_vssl_flght) return doRslt_vssl_flght_VC(info);
		if (vc == columnRslt_load_port_cd) return doRslt_load_port_cd_VC(info);
		if (vc == columnRslt_load_port_nm) return doRslt_load_port_nm_VC(info);
		if (vc == columnRslt_etd_dt) return doRslt_etd_dt_VC(info);
		if (vc == columnRslt_dschrg_port_cd) return doRslt_dschrg_port_cd_VC(info);
		if (vc == columnRslt_dschrg_port_nm) return doRslt_dschrg_port_nm_VC(info);
		if (vc == columnRslt_eta_dt) return doRslt_eta_dt_VC(info);
		if (vc == columnRslt_via_port_cd) return doRslt_via_port_cd_VC(info);
		if (vc == columnRslt_via_port_nm) return doRslt_via_port_nm_VC(info);
		if (vc == columnRslt_via_schd_dt) return doRslt_via_schd_dt_VC(info);
		if (vc == columnRslt_purc_tterm_cd1) return doRslt_purc_tterm_cd1_VC(info);
		if (vc == columnRslt_purc_tterm_nm1) return doRslt_purc_tterm_nm1_VC(info);
		if (vc == columnRslt_purc_tterm_rmrks1) return doRslt_purc_tterm_rmrks1_VC(info);
		if (vc == columnRslt_purc_tterm_cd2) return doRslt_purc_tterm_cd2_VC(info);
		if (vc == columnRslt_purc_tterm_nm2) return doRslt_purc_tterm_nm2_VC(info);
		if (vc == columnRslt_purc_tterm_rmrks2) return doRslt_purc_tterm_rmrks2_VC(info);
		if (vc == columnRslt_purc_tterm_cd3) return doRslt_purc_tterm_cd3_VC(info);
		if (vc == columnRslt_purc_tterm_nm3) return doRslt_purc_tterm_nm3_VC(info);
		if (vc == columnRslt_purc_tterm_rmrks3) return doRslt_purc_tterm_rmrks3_VC(info);
		if (vc == columnRslt_trd_rmrks) return doRslt_trd_rmrks_VC(info);
		if (vc == columnRslt_po_print_rmrks) return doRslt_po_print_rmrks_VC(info);
		if (vc == columnRslt_slo_xrate) return doRslt_slo_xrate_VC(info);
		if (vc == columnRslt_slo_ptax_xrate) return doRslt_slo_ptax_xrate_VC(info);
		if (vc == columnRslt_slo_tterm_rmrks1) return doRslt_slo_tterm_rmrks1_VC(info);
		if (vc == columnRslt_slo_tterm_rmrks2) return doRslt_slo_tterm_rmrks2_VC(info);
		if (vc == columnRslt_slo_tterm_rmrks3) return doRslt_slo_tterm_rmrks3_VC(info);
		if (vc == columnRslt_purc_basis_typ) return doRslt_purc_basis_typ_VC(info);
		if (vc == columnRslt_purc_basis_typ_nm) return doRslt_purc_basis_typ_nm_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_cntry_org_cd) return doRslt_cntry_org_cd_VC(info);
		if (vc == columnRslt_cntry_org_nm) return doRslt_cntry_org_nm_VC(info);
		if (vc == columnRslt_po_print_d_rmrks) return doRslt_po_print_d_rmrks_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_unit_dec_place) return doRslt_base_unit_dec_place_VC(info);
		if (vc == columnRslt_base_unit_rnd_typ) return doRslt_base_unit_rnd_typ_VC(info);
		if (vc == columnRslt_arr_schd_qty) return doRslt_arr_schd_qty_VC(info);
		if (vc == columnRslt_arr_act_qty) return doRslt_arr_act_qty_VC(info);
		if (vc == columnRslt_arr_loc_wg_cd) return doRslt_arr_loc_wg_cd_VC(info);
		if (vc == columnRslt_sppl_cd) return doRslt_sppl_cd_VC(info);
		if (vc == columnRslt_purc_amt_rnd_typ) return doRslt_purc_amt_rnd_typ_VC(info);
		if (vc == columnRslt_purc_tax_rnd_typ) return doRslt_purc_tax_rnd_typ_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == columnRslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == columnRslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == columnRslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == columnRslt_upd_srv_req_no) return doRslt_upd_srv_req_no_VC(info);
		if (vc == Btn_select_bndl_grp) return doBtn_select_bndl_grp_VC(info);
		return true;
	}

	/**
	 * [Rslt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bndl_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bndl_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pr_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pr_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pr_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pr_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[arr_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_arr_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[arr_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_arr_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcpt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sundry_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asset_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dscnt_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dscnt_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[exim_xpns_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_exim_xpns_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_maker_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[repurc_obli_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_repurc_obli_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wtax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_inpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_xrate_inpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_xrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_sublot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_lot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_lot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_sublot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_sublot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bd_sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bd_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trnspt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trnspt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trnspt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trnspt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[vssl_flght]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_vssl_flght_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[load_port_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_load_port_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[load_port_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_load_port_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[etd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_etd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dschrg_port_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dschrg_port_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dschrg_port_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dschrg_port_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[eta_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_eta_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[via_port_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_via_port_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[via_port_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_via_port_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[via_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_via_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_tterm_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_tterm_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_tterm_rmrks1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_tterm_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_tterm_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_tterm_rmrks2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_tterm_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_tterm_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_tterm_rmrks3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[po_print_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_po_print_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_xrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_ptax_xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_ptax_xrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_tterm_rmrks1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_tterm_rmrks2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_tterm_rmrks3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_basis_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_basis_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_basis_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_basis_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cntry_org_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cntry_org_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cntry_org_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cntry_org_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[po_print_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_po_print_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[arr_schd_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_arr_schd_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[arr_act_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_arr_act_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[arr_loc_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_arr_loc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_amt_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_amt_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_tax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_tax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn]パネルの[select_bndl_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_select_bndl_grp_VC(MCEventInfo info){
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
		if (nc == RsltTable) doRslt_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_bndl_tgt_flg) doRslt_bndl_tgt_flg_NC(info);
		else if (nc == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_NC(info);
		else if (nc == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_NC(info);
		else if (nc == columnRslt_trd_cd) doRslt_trd_cd_NC(info);
		else if (nc == columnRslt_trd_nm) doRslt_trd_nm_NC(info);
		else if (nc == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NC(info);
		else if (nc == columnRslt_po_no) doRslt_po_no_NC(info);
		else if (nc == columnRslt_po_d_no) doRslt_po_d_no_NC(info);
		else if (nc == columnRslt_purc_schd_no) doRslt_purc_schd_no_NC(info);
		else if (nc == columnRslt_arr_schd_no) doRslt_arr_schd_no_NC(info);
		else if (nc == columnRslt_arr_act_no) doRslt_arr_act_no_NC(info);
		else if (nc == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NC(info);
		else if (nc == columnRslt_purc_schd_dt) doRslt_purc_schd_dt_NC(info);
		else if (nc == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NC(info);
		else if (nc == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NC(info);
		else if (nc == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_NC(info);
		else if (nc == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_NC(info);
		else if (nc == columnRslt_dscnt_itm_flg) doRslt_dscnt_itm_flg_NC(info);
		else if (nc == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NC(info);
		else if (nc == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NC(info);
		else if (nc == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NC(info);
		else if (nc == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NC(info);
		else if (nc == columnRslt_exim_xpns_typ) doRslt_exim_xpns_typ_NC(info);
		else if (nc == columnRslt_maker_cd) doRslt_maker_cd_NC(info);
		else if (nc == columnRslt_maker_nm) doRslt_maker_nm_NC(info);
		else if (nc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NC(info);
		else if (nc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NC(info);
		else if (nc == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_NC(info);
		else if (nc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NC(info);
		else if (nc == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_NC(info);
		else if (nc == columnRslt_repurc_obli_flg) doRslt_repurc_obli_flg_NC(info);
		else if (nc == columnRslt_wtax_rate) doRslt_wtax_rate_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_trd_amt_dec_place) doRslt_trd_amt_dec_place_NC(info);
		else if (nc == columnRslt_trd_upri_dec_place) doRslt_trd_upri_dec_place_NC(info);
		else if (nc == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NC(info);
		else if (nc == columnRslt_xrate) doRslt_xrate_NC(info);
		else if (nc == columnRslt_base_cur_cd) doRslt_base_cur_cd_NC(info);
		else if (nc == columnRslt_base_cur_nm) doRslt_base_cur_nm_NC(info);
		else if (nc == columnRslt_base_amt_dec_place) doRslt_base_amt_dec_place_NC(info);
		else if (nc == columnRslt_base_upri_dec_place) doRslt_base_upri_dec_place_NC(info);
		else if (nc == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NC(info);
		else if (nc == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NC(info);
		else if (nc == columnRslt_ptax_amt_dec_place) doRslt_ptax_amt_dec_place_NC(info);
		else if (nc == columnRslt_ptax_upri_dec_place) doRslt_ptax_upri_dec_place_NC(info);
		else if (nc == columnRslt_ptax_xrate_inpt_flg) doRslt_ptax_xrate_inpt_flg_NC(info);
		else if (nc == columnRslt_ptax_xrate) doRslt_ptax_xrate_NC(info);
		else if (nc == columnRslt_sppl_itm_cd) doRslt_sppl_itm_cd_NC(info);
		else if (nc == columnRslt_sppl_itm_nm) doRslt_sppl_itm_nm_NC(info);
		else if (nc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NC(info);
		else if (nc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NC(info);
		else if (nc == columnRslt_purc_id_typ) doRslt_purc_id_typ_NC(info);
		else if (nc == columnRslt_purc_id_typ_nm) doRslt_purc_id_typ_nm_NC(info);
		else if (nc == columnRslt_purc_rsn_cd) doRslt_purc_rsn_cd_NC(info);
		else if (nc == columnRslt_purc_rsn_nm) doRslt_purc_rsn_nm_NC(info);
		else if (nc == columnRslt_purc_usr_cd) doRslt_purc_usr_cd_NC(info);
		else if (nc == columnRslt_purc_usr_nm) doRslt_purc_usr_nm_NC(info);
		else if (nc == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_NC(info);
		else if (nc == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_NC(info);
		else if (nc == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NC(info);
		else if (nc == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NC(info);
		else if (nc == columnRslt_bd_lot_mng_typ) doRslt_bd_lot_mng_typ_NC(info);
		else if (nc == columnRslt_bd_sublot_mng_typ) doRslt_bd_sublot_mng_typ_NC(info);
		else if (nc == columnRslt_bd_lot_no_typ) doRslt_bd_lot_no_typ_NC(info);
		else if (nc == columnRslt_bd_sublot_no_typ) doRslt_bd_sublot_no_typ_NC(info);
		else if (nc == columnRslt_bd_sno1_mng_typ) doRslt_bd_sno1_mng_typ_NC(info);
		else if (nc == columnRslt_bd_sno2_mng_typ) doRslt_bd_sno2_mng_typ_NC(info);
		else if (nc == columnRslt_bd_sno3_mng_typ) doRslt_bd_sno3_mng_typ_NC(info);
		else if (nc == columnRslt_bd_sno4_mng_typ) doRslt_bd_sno4_mng_typ_NC(info);
		else if (nc == columnRslt_slo_no) doRslt_slo_no_NC(info);
		else if (nc == columnRslt_slo_d_no) doRslt_slo_d_no_NC(info);
		else if (nc == columnRslt_trnspt_cd) doRslt_trnspt_cd_NC(info);
		else if (nc == columnRslt_trnspt_nm) doRslt_trnspt_nm_NC(info);
		else if (nc == columnRslt_vssl_flght) doRslt_vssl_flght_NC(info);
		else if (nc == columnRslt_load_port_cd) doRslt_load_port_cd_NC(info);
		else if (nc == columnRslt_load_port_nm) doRslt_load_port_nm_NC(info);
		else if (nc == columnRslt_etd_dt) doRslt_etd_dt_NC(info);
		else if (nc == columnRslt_dschrg_port_cd) doRslt_dschrg_port_cd_NC(info);
		else if (nc == columnRslt_dschrg_port_nm) doRslt_dschrg_port_nm_NC(info);
		else if (nc == columnRslt_eta_dt) doRslt_eta_dt_NC(info);
		else if (nc == columnRslt_via_port_cd) doRslt_via_port_cd_NC(info);
		else if (nc == columnRslt_via_port_nm) doRslt_via_port_nm_NC(info);
		else if (nc == columnRslt_via_schd_dt) doRslt_via_schd_dt_NC(info);
		else if (nc == columnRslt_purc_tterm_cd1) doRslt_purc_tterm_cd1_NC(info);
		else if (nc == columnRslt_purc_tterm_nm1) doRslt_purc_tterm_nm1_NC(info);
		else if (nc == columnRslt_purc_tterm_rmrks1) doRslt_purc_tterm_rmrks1_NC(info);
		else if (nc == columnRslt_purc_tterm_cd2) doRslt_purc_tterm_cd2_NC(info);
		else if (nc == columnRslt_purc_tterm_nm2) doRslt_purc_tterm_nm2_NC(info);
		else if (nc == columnRslt_purc_tterm_rmrks2) doRslt_purc_tterm_rmrks2_NC(info);
		else if (nc == columnRslt_purc_tterm_cd3) doRslt_purc_tterm_cd3_NC(info);
		else if (nc == columnRslt_purc_tterm_nm3) doRslt_purc_tterm_nm3_NC(info);
		else if (nc == columnRslt_purc_tterm_rmrks3) doRslt_purc_tterm_rmrks3_NC(info);
		else if (nc == columnRslt_trd_rmrks) doRslt_trd_rmrks_NC(info);
		else if (nc == columnRslt_po_print_rmrks) doRslt_po_print_rmrks_NC(info);
		else if (nc == columnRslt_slo_xrate) doRslt_slo_xrate_NC(info);
		else if (nc == columnRslt_slo_ptax_xrate) doRslt_slo_ptax_xrate_NC(info);
		else if (nc == columnRslt_slo_tterm_rmrks1) doRslt_slo_tterm_rmrks1_NC(info);
		else if (nc == columnRslt_slo_tterm_rmrks2) doRslt_slo_tterm_rmrks2_NC(info);
		else if (nc == columnRslt_slo_tterm_rmrks3) doRslt_slo_tterm_rmrks3_NC(info);
		else if (nc == columnRslt_purc_basis_typ) doRslt_purc_basis_typ_NC(info);
		else if (nc == columnRslt_purc_basis_typ_nm) doRslt_purc_basis_typ_nm_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_cntry_org_cd) doRslt_cntry_org_cd_NC(info);
		else if (nc == columnRslt_cntry_org_nm) doRslt_cntry_org_nm_NC(info);
		else if (nc == columnRslt_po_print_d_rmrks) doRslt_po_print_d_rmrks_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NC(info);
		else if (nc == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NC(info);
		else if (nc == columnRslt_arr_schd_qty) doRslt_arr_schd_qty_NC(info);
		else if (nc == columnRslt_arr_act_qty) doRslt_arr_act_qty_NC(info);
		else if (nc == columnRslt_arr_loc_wg_cd) doRslt_arr_loc_wg_cd_NC(info);
		else if (nc == columnRslt_sppl_cd) doRslt_sppl_cd_NC(info);
		else if (nc == columnRslt_purc_amt_rnd_typ) doRslt_purc_amt_rnd_typ_NC(info);
		else if (nc == columnRslt_purc_tax_rnd_typ) doRslt_purc_tax_rnd_typ_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == columnRslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == columnRslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NC(info);
		else if (nc == Btn_select_bndl_grp) doBtn_select_bndl_grp_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bndl_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bndl_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[exim_xpns_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_exim_xpns_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[repurc_obli_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_repurc_obli_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_lot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_lot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sublot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sublot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vssl_flght]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vssl_flght_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[etd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_etd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[eta_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_eta_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_rmrks1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_rmrks2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_rmrks3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_print_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_print_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_ptax_xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_ptax_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_rmrks1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_rmrks2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_rmrks3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_basis_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_basis_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_basis_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_basis_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_print_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_print_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_act_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_act_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_loc_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_loc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_amt_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_amt_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[select_bndl_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_select_bndl_grp_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == RsltTable) doRslt_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_bndl_tgt_flg) doRslt_bndl_tgt_flg_NE(info);
		else if (ne == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_NE(info);
		else if (ne == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_NE(info);
		else if (ne == columnRslt_trd_cd) doRslt_trd_cd_NE(info);
		else if (ne == columnRslt_trd_nm) doRslt_trd_nm_NE(info);
		else if (ne == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NE(info);
		else if (ne == columnRslt_po_no) doRslt_po_no_NE(info);
		else if (ne == columnRslt_po_d_no) doRslt_po_d_no_NE(info);
		else if (ne == columnRslt_purc_schd_no) doRslt_purc_schd_no_NE(info);
		else if (ne == columnRslt_arr_schd_no) doRslt_arr_schd_no_NE(info);
		else if (ne == columnRslt_arr_act_no) doRslt_arr_act_no_NE(info);
		else if (ne == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NE(info);
		else if (ne == columnRslt_purc_schd_dt) doRslt_purc_schd_dt_NE(info);
		else if (ne == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NE(info);
		else if (ne == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NE(info);
		else if (ne == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_NE(info);
		else if (ne == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_NE(info);
		else if (ne == columnRslt_dscnt_itm_flg) doRslt_dscnt_itm_flg_NE(info);
		else if (ne == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NE(info);
		else if (ne == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NE(info);
		else if (ne == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NE(info);
		else if (ne == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NE(info);
		else if (ne == columnRslt_exim_xpns_typ) doRslt_exim_xpns_typ_NE(info);
		else if (ne == columnRslt_maker_cd) doRslt_maker_cd_NE(info);
		else if (ne == columnRslt_maker_nm) doRslt_maker_nm_NE(info);
		else if (ne == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NE(info);
		else if (ne == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NE(info);
		else if (ne == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_NE(info);
		else if (ne == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NE(info);
		else if (ne == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_NE(info);
		else if (ne == columnRslt_repurc_obli_flg) doRslt_repurc_obli_flg_NE(info);
		else if (ne == columnRslt_wtax_rate) doRslt_wtax_rate_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_trd_amt_dec_place) doRslt_trd_amt_dec_place_NE(info);
		else if (ne == columnRslt_trd_upri_dec_place) doRslt_trd_upri_dec_place_NE(info);
		else if (ne == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NE(info);
		else if (ne == columnRslt_xrate) doRslt_xrate_NE(info);
		else if (ne == columnRslt_base_cur_cd) doRslt_base_cur_cd_NE(info);
		else if (ne == columnRslt_base_cur_nm) doRslt_base_cur_nm_NE(info);
		else if (ne == columnRslt_base_amt_dec_place) doRslt_base_amt_dec_place_NE(info);
		else if (ne == columnRslt_base_upri_dec_place) doRslt_base_upri_dec_place_NE(info);
		else if (ne == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NE(info);
		else if (ne == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NE(info);
		else if (ne == columnRslt_ptax_amt_dec_place) doRslt_ptax_amt_dec_place_NE(info);
		else if (ne == columnRslt_ptax_upri_dec_place) doRslt_ptax_upri_dec_place_NE(info);
		else if (ne == columnRslt_ptax_xrate_inpt_flg) doRslt_ptax_xrate_inpt_flg_NE(info);
		else if (ne == columnRslt_ptax_xrate) doRslt_ptax_xrate_NE(info);
		else if (ne == columnRslt_sppl_itm_cd) doRslt_sppl_itm_cd_NE(info);
		else if (ne == columnRslt_sppl_itm_nm) doRslt_sppl_itm_nm_NE(info);
		else if (ne == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NE(info);
		else if (ne == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NE(info);
		else if (ne == columnRslt_purc_id_typ) doRslt_purc_id_typ_NE(info);
		else if (ne == columnRslt_purc_id_typ_nm) doRslt_purc_id_typ_nm_NE(info);
		else if (ne == columnRslt_purc_rsn_cd) doRslt_purc_rsn_cd_NE(info);
		else if (ne == columnRslt_purc_rsn_nm) doRslt_purc_rsn_nm_NE(info);
		else if (ne == columnRslt_purc_usr_cd) doRslt_purc_usr_cd_NE(info);
		else if (ne == columnRslt_purc_usr_nm) doRslt_purc_usr_nm_NE(info);
		else if (ne == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_NE(info);
		else if (ne == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_NE(info);
		else if (ne == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NE(info);
		else if (ne == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NE(info);
		else if (ne == columnRslt_bd_lot_mng_typ) doRslt_bd_lot_mng_typ_NE(info);
		else if (ne == columnRslt_bd_sublot_mng_typ) doRslt_bd_sublot_mng_typ_NE(info);
		else if (ne == columnRslt_bd_lot_no_typ) doRslt_bd_lot_no_typ_NE(info);
		else if (ne == columnRslt_bd_sublot_no_typ) doRslt_bd_sublot_no_typ_NE(info);
		else if (ne == columnRslt_bd_sno1_mng_typ) doRslt_bd_sno1_mng_typ_NE(info);
		else if (ne == columnRslt_bd_sno2_mng_typ) doRslt_bd_sno2_mng_typ_NE(info);
		else if (ne == columnRslt_bd_sno3_mng_typ) doRslt_bd_sno3_mng_typ_NE(info);
		else if (ne == columnRslt_bd_sno4_mng_typ) doRslt_bd_sno4_mng_typ_NE(info);
		else if (ne == columnRslt_slo_no) doRslt_slo_no_NE(info);
		else if (ne == columnRslt_slo_d_no) doRslt_slo_d_no_NE(info);
		else if (ne == columnRslt_trnspt_cd) doRslt_trnspt_cd_NE(info);
		else if (ne == columnRslt_trnspt_nm) doRslt_trnspt_nm_NE(info);
		else if (ne == columnRslt_vssl_flght) doRslt_vssl_flght_NE(info);
		else if (ne == columnRslt_load_port_cd) doRslt_load_port_cd_NE(info);
		else if (ne == columnRslt_load_port_nm) doRslt_load_port_nm_NE(info);
		else if (ne == columnRslt_etd_dt) doRslt_etd_dt_NE(info);
		else if (ne == columnRslt_dschrg_port_cd) doRslt_dschrg_port_cd_NE(info);
		else if (ne == columnRslt_dschrg_port_nm) doRslt_dschrg_port_nm_NE(info);
		else if (ne == columnRslt_eta_dt) doRslt_eta_dt_NE(info);
		else if (ne == columnRslt_via_port_cd) doRslt_via_port_cd_NE(info);
		else if (ne == columnRslt_via_port_nm) doRslt_via_port_nm_NE(info);
		else if (ne == columnRslt_via_schd_dt) doRslt_via_schd_dt_NE(info);
		else if (ne == columnRslt_purc_tterm_cd1) doRslt_purc_tterm_cd1_NE(info);
		else if (ne == columnRslt_purc_tterm_nm1) doRslt_purc_tterm_nm1_NE(info);
		else if (ne == columnRslt_purc_tterm_rmrks1) doRslt_purc_tterm_rmrks1_NE(info);
		else if (ne == columnRslt_purc_tterm_cd2) doRslt_purc_tterm_cd2_NE(info);
		else if (ne == columnRslt_purc_tterm_nm2) doRslt_purc_tterm_nm2_NE(info);
		else if (ne == columnRslt_purc_tterm_rmrks2) doRslt_purc_tterm_rmrks2_NE(info);
		else if (ne == columnRslt_purc_tterm_cd3) doRslt_purc_tterm_cd3_NE(info);
		else if (ne == columnRslt_purc_tterm_nm3) doRslt_purc_tterm_nm3_NE(info);
		else if (ne == columnRslt_purc_tterm_rmrks3) doRslt_purc_tterm_rmrks3_NE(info);
		else if (ne == columnRslt_trd_rmrks) doRslt_trd_rmrks_NE(info);
		else if (ne == columnRslt_po_print_rmrks) doRslt_po_print_rmrks_NE(info);
		else if (ne == columnRslt_slo_xrate) doRslt_slo_xrate_NE(info);
		else if (ne == columnRslt_slo_ptax_xrate) doRslt_slo_ptax_xrate_NE(info);
		else if (ne == columnRslt_slo_tterm_rmrks1) doRslt_slo_tterm_rmrks1_NE(info);
		else if (ne == columnRslt_slo_tterm_rmrks2) doRslt_slo_tterm_rmrks2_NE(info);
		else if (ne == columnRslt_slo_tterm_rmrks3) doRslt_slo_tterm_rmrks3_NE(info);
		else if (ne == columnRslt_purc_basis_typ) doRslt_purc_basis_typ_NE(info);
		else if (ne == columnRslt_purc_basis_typ_nm) doRslt_purc_basis_typ_nm_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_cntry_org_cd) doRslt_cntry_org_cd_NE(info);
		else if (ne == columnRslt_cntry_org_nm) doRslt_cntry_org_nm_NE(info);
		else if (ne == columnRslt_po_print_d_rmrks) doRslt_po_print_d_rmrks_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NE(info);
		else if (ne == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NE(info);
		else if (ne == columnRslt_arr_schd_qty) doRslt_arr_schd_qty_NE(info);
		else if (ne == columnRslt_arr_act_qty) doRslt_arr_act_qty_NE(info);
		else if (ne == columnRslt_arr_loc_wg_cd) doRslt_arr_loc_wg_cd_NE(info);
		else if (ne == columnRslt_sppl_cd) doRslt_sppl_cd_NE(info);
		else if (ne == columnRslt_purc_amt_rnd_typ) doRslt_purc_amt_rnd_typ_NE(info);
		else if (ne == columnRslt_purc_tax_rnd_typ) doRslt_purc_tax_rnd_typ_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == columnRslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == columnRslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NE(info);
		else if (ne == Btn_select_bndl_grp) doBtn_select_bndl_grp_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bndl_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bndl_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[exim_xpns_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_exim_xpns_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[repurc_obli_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_repurc_obli_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_lot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_lot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sublot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sublot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vssl_flght]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vssl_flght_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[etd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_etd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[eta_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_eta_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_rmrks1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_rmrks2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_rmrks3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_print_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_print_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_ptax_xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_ptax_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_rmrks1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_rmrks2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_rmrks3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_basis_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_basis_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_basis_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_basis_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_print_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_print_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_act_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_act_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_loc_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_loc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_amt_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_amt_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[select_bndl_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_select_bndl_grp_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == RsltTable) doRslt_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_bndl_tgt_flg) doRslt_bndl_tgt_flg_NX(info);
		else if (nx == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_NX(info);
		else if (nx == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_NX(info);
		else if (nx == columnRslt_trd_cd) doRslt_trd_cd_NX(info);
		else if (nx == columnRslt_trd_nm) doRslt_trd_nm_NX(info);
		else if (nx == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NX(info);
		else if (nx == columnRslt_po_no) doRslt_po_no_NX(info);
		else if (nx == columnRslt_po_d_no) doRslt_po_d_no_NX(info);
		else if (nx == columnRslt_purc_schd_no) doRslt_purc_schd_no_NX(info);
		else if (nx == columnRslt_arr_schd_no) doRslt_arr_schd_no_NX(info);
		else if (nx == columnRslt_arr_act_no) doRslt_arr_act_no_NX(info);
		else if (nx == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NX(info);
		else if (nx == columnRslt_purc_schd_dt) doRslt_purc_schd_dt_NX(info);
		else if (nx == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_NX(info);
		else if (nx == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NX(info);
		else if (nx == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_NX(info);
		else if (nx == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_NX(info);
		else if (nx == columnRslt_dscnt_itm_flg) doRslt_dscnt_itm_flg_NX(info);
		else if (nx == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NX(info);
		else if (nx == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NX(info);
		else if (nx == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NX(info);
		else if (nx == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NX(info);
		else if (nx == columnRslt_exim_xpns_typ) doRslt_exim_xpns_typ_NX(info);
		else if (nx == columnRslt_maker_cd) doRslt_maker_cd_NX(info);
		else if (nx == columnRslt_maker_nm) doRslt_maker_nm_NX(info);
		else if (nx == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NX(info);
		else if (nx == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NX(info);
		else if (nx == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_NX(info);
		else if (nx == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NX(info);
		else if (nx == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_NX(info);
		else if (nx == columnRslt_repurc_obli_flg) doRslt_repurc_obli_flg_NX(info);
		else if (nx == columnRslt_wtax_rate) doRslt_wtax_rate_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_trd_amt_dec_place) doRslt_trd_amt_dec_place_NX(info);
		else if (nx == columnRslt_trd_upri_dec_place) doRslt_trd_upri_dec_place_NX(info);
		else if (nx == columnRslt_xrate_inpt_flg) doRslt_xrate_inpt_flg_NX(info);
		else if (nx == columnRslt_xrate) doRslt_xrate_NX(info);
		else if (nx == columnRslt_base_cur_cd) doRslt_base_cur_cd_NX(info);
		else if (nx == columnRslt_base_cur_nm) doRslt_base_cur_nm_NX(info);
		else if (nx == columnRslt_base_amt_dec_place) doRslt_base_amt_dec_place_NX(info);
		else if (nx == columnRslt_base_upri_dec_place) doRslt_base_upri_dec_place_NX(info);
		else if (nx == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_NX(info);
		else if (nx == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_NX(info);
		else if (nx == columnRslt_ptax_amt_dec_place) doRslt_ptax_amt_dec_place_NX(info);
		else if (nx == columnRslt_ptax_upri_dec_place) doRslt_ptax_upri_dec_place_NX(info);
		else if (nx == columnRslt_ptax_xrate_inpt_flg) doRslt_ptax_xrate_inpt_flg_NX(info);
		else if (nx == columnRslt_ptax_xrate) doRslt_ptax_xrate_NX(info);
		else if (nx == columnRslt_sppl_itm_cd) doRslt_sppl_itm_cd_NX(info);
		else if (nx == columnRslt_sppl_itm_nm) doRslt_sppl_itm_nm_NX(info);
		else if (nx == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_NX(info);
		else if (nx == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_NX(info);
		else if (nx == columnRslt_purc_id_typ) doRslt_purc_id_typ_NX(info);
		else if (nx == columnRslt_purc_id_typ_nm) doRslt_purc_id_typ_nm_NX(info);
		else if (nx == columnRslt_purc_rsn_cd) doRslt_purc_rsn_cd_NX(info);
		else if (nx == columnRslt_purc_rsn_nm) doRslt_purc_rsn_nm_NX(info);
		else if (nx == columnRslt_purc_usr_cd) doRslt_purc_usr_cd_NX(info);
		else if (nx == columnRslt_purc_usr_nm) doRslt_purc_usr_nm_NX(info);
		else if (nx == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_NX(info);
		else if (nx == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_NX(info);
		else if (nx == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NX(info);
		else if (nx == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NX(info);
		else if (nx == columnRslt_bd_lot_mng_typ) doRslt_bd_lot_mng_typ_NX(info);
		else if (nx == columnRslt_bd_sublot_mng_typ) doRslt_bd_sublot_mng_typ_NX(info);
		else if (nx == columnRslt_bd_lot_no_typ) doRslt_bd_lot_no_typ_NX(info);
		else if (nx == columnRslt_bd_sublot_no_typ) doRslt_bd_sublot_no_typ_NX(info);
		else if (nx == columnRslt_bd_sno1_mng_typ) doRslt_bd_sno1_mng_typ_NX(info);
		else if (nx == columnRslt_bd_sno2_mng_typ) doRslt_bd_sno2_mng_typ_NX(info);
		else if (nx == columnRslt_bd_sno3_mng_typ) doRslt_bd_sno3_mng_typ_NX(info);
		else if (nx == columnRslt_bd_sno4_mng_typ) doRslt_bd_sno4_mng_typ_NX(info);
		else if (nx == columnRslt_slo_no) doRslt_slo_no_NX(info);
		else if (nx == columnRslt_slo_d_no) doRslt_slo_d_no_NX(info);
		else if (nx == columnRslt_trnspt_cd) doRslt_trnspt_cd_NX(info);
		else if (nx == columnRslt_trnspt_nm) doRslt_trnspt_nm_NX(info);
		else if (nx == columnRslt_vssl_flght) doRslt_vssl_flght_NX(info);
		else if (nx == columnRslt_load_port_cd) doRslt_load_port_cd_NX(info);
		else if (nx == columnRslt_load_port_nm) doRslt_load_port_nm_NX(info);
		else if (nx == columnRslt_etd_dt) doRslt_etd_dt_NX(info);
		else if (nx == columnRslt_dschrg_port_cd) doRslt_dschrg_port_cd_NX(info);
		else if (nx == columnRslt_dschrg_port_nm) doRslt_dschrg_port_nm_NX(info);
		else if (nx == columnRslt_eta_dt) doRslt_eta_dt_NX(info);
		else if (nx == columnRslt_via_port_cd) doRslt_via_port_cd_NX(info);
		else if (nx == columnRslt_via_port_nm) doRslt_via_port_nm_NX(info);
		else if (nx == columnRslt_via_schd_dt) doRslt_via_schd_dt_NX(info);
		else if (nx == columnRslt_purc_tterm_cd1) doRslt_purc_tterm_cd1_NX(info);
		else if (nx == columnRslt_purc_tterm_nm1) doRslt_purc_tterm_nm1_NX(info);
		else if (nx == columnRslt_purc_tterm_rmrks1) doRslt_purc_tterm_rmrks1_NX(info);
		else if (nx == columnRslt_purc_tterm_cd2) doRslt_purc_tterm_cd2_NX(info);
		else if (nx == columnRslt_purc_tterm_nm2) doRslt_purc_tterm_nm2_NX(info);
		else if (nx == columnRslt_purc_tterm_rmrks2) doRslt_purc_tterm_rmrks2_NX(info);
		else if (nx == columnRslt_purc_tterm_cd3) doRslt_purc_tterm_cd3_NX(info);
		else if (nx == columnRslt_purc_tterm_nm3) doRslt_purc_tterm_nm3_NX(info);
		else if (nx == columnRslt_purc_tterm_rmrks3) doRslt_purc_tterm_rmrks3_NX(info);
		else if (nx == columnRslt_trd_rmrks) doRslt_trd_rmrks_NX(info);
		else if (nx == columnRslt_po_print_rmrks) doRslt_po_print_rmrks_NX(info);
		else if (nx == columnRslt_slo_xrate) doRslt_slo_xrate_NX(info);
		else if (nx == columnRslt_slo_ptax_xrate) doRslt_slo_ptax_xrate_NX(info);
		else if (nx == columnRslt_slo_tterm_rmrks1) doRslt_slo_tterm_rmrks1_NX(info);
		else if (nx == columnRslt_slo_tterm_rmrks2) doRslt_slo_tterm_rmrks2_NX(info);
		else if (nx == columnRslt_slo_tterm_rmrks3) doRslt_slo_tterm_rmrks3_NX(info);
		else if (nx == columnRslt_purc_basis_typ) doRslt_purc_basis_typ_NX(info);
		else if (nx == columnRslt_purc_basis_typ_nm) doRslt_purc_basis_typ_nm_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_cntry_org_cd) doRslt_cntry_org_cd_NX(info);
		else if (nx == columnRslt_cntry_org_nm) doRslt_cntry_org_nm_NX(info);
		else if (nx == columnRslt_po_print_d_rmrks) doRslt_po_print_d_rmrks_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NX(info);
		else if (nx == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NX(info);
		else if (nx == columnRslt_arr_schd_qty) doRslt_arr_schd_qty_NX(info);
		else if (nx == columnRslt_arr_act_qty) doRslt_arr_act_qty_NX(info);
		else if (nx == columnRslt_arr_loc_wg_cd) doRslt_arr_loc_wg_cd_NX(info);
		else if (nx == columnRslt_sppl_cd) doRslt_sppl_cd_NX(info);
		else if (nx == columnRslt_purc_amt_rnd_typ) doRslt_purc_amt_rnd_typ_NX(info);
		else if (nx == columnRslt_purc_tax_rnd_typ) doRslt_purc_tax_rnd_typ_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == columnRslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == columnRslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NX(info);
		else if (nx == Btn_select_bndl_grp) doBtn_select_bndl_grp_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bndl_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bndl_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dscnt_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dscnt_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[exim_xpns_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_exim_xpns_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[repurc_obli_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_repurc_obli_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_lot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_lot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sublot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sublot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vssl_flght]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vssl_flght_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[etd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_etd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[eta_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_eta_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_rmrks1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_rmrks2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_rmrks3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_print_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_print_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_ptax_xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_ptax_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_rmrks1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_rmrks2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_rmrks3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_basis_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_basis_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_basis_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_basis_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_print_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_print_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_act_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_act_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_loc_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_loc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_amt_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_amt_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[select_bndl_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_select_bndl_grp_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == columnRslt_pr_sts_typ) doRslt_pr_sts_typ_LC(info);
		else if (lc == columnRslt_pr_sts_typ_nm) doRslt_pr_sts_typ_nm_LC(info);
		else if (lc == columnRslt_trd_cd) doRslt_trd_cd_LC(info);
		else if (lc == columnRslt_trd_nm) doRslt_trd_nm_LC(info);
		else if (lc == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_LC(info);
		else if (lc == columnRslt_po_no) doRslt_po_no_LC(info);
		else if (lc == columnRslt_po_d_no) doRslt_po_d_no_LC(info);
		else if (lc == columnRslt_purc_schd_no) doRslt_purc_schd_no_LC(info);
		else if (lc == columnRslt_arr_schd_no) doRslt_arr_schd_no_LC(info);
		else if (lc == columnRslt_arr_act_no) doRslt_arr_act_no_LC(info);
		else if (lc == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_LC(info);
		else if (lc == columnRslt_purc_schd_dt) doRslt_purc_schd_dt_LC(info);
		else if (lc == columnRslt_iv_itm_nm) doRslt_iv_itm_nm_LC(info);
		else if (lc == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_LC(info);
		else if (lc == columnRslt_asset_mng_typ) doRslt_asset_mng_typ_LC(info);
		else if (lc == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_LC(info);
		else if (lc == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_LC(info);
		else if (lc == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_LC(info);
		else if (lc == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_LC(info);
		else if (lc == columnRslt_exim_xpns_typ) doRslt_exim_xpns_typ_LC(info);
		else if (lc == columnRslt_maker_cd) doRslt_maker_cd_LC(info);
		else if (lc == columnRslt_maker_nm) doRslt_maker_nm_LC(info);
		else if (lc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_LC(info);
		else if (lc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_LC(info);
		else if (lc == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_LC(info);
		else if (lc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_LC(info);
		else if (lc == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_LC(info);
		else if (lc == columnRslt_wtax_rate) doRslt_wtax_rate_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_trd_amt_dec_place) doRslt_trd_amt_dec_place_LC(info);
		else if (lc == columnRslt_trd_upri_dec_place) doRslt_trd_upri_dec_place_LC(info);
		else if (lc == columnRslt_xrate) doRslt_xrate_LC(info);
		else if (lc == columnRslt_base_cur_cd) doRslt_base_cur_cd_LC(info);
		else if (lc == columnRslt_base_cur_nm) doRslt_base_cur_nm_LC(info);
		else if (lc == columnRslt_base_amt_dec_place) doRslt_base_amt_dec_place_LC(info);
		else if (lc == columnRslt_base_upri_dec_place) doRslt_base_upri_dec_place_LC(info);
		else if (lc == columnRslt_ptax_cur_cd) doRslt_ptax_cur_cd_LC(info);
		else if (lc == columnRslt_ptax_cur_nm) doRslt_ptax_cur_nm_LC(info);
		else if (lc == columnRslt_ptax_amt_dec_place) doRslt_ptax_amt_dec_place_LC(info);
		else if (lc == columnRslt_ptax_upri_dec_place) doRslt_ptax_upri_dec_place_LC(info);
		else if (lc == columnRslt_ptax_xrate) doRslt_ptax_xrate_LC(info);
		else if (lc == columnRslt_sppl_itm_cd) doRslt_sppl_itm_cd_LC(info);
		else if (lc == columnRslt_sppl_itm_nm) doRslt_sppl_itm_nm_LC(info);
		else if (lc == columnRslt_cst_itm_cd) doRslt_cst_itm_cd_LC(info);
		else if (lc == columnRslt_cst_itm_nm) doRslt_cst_itm_nm_LC(info);
		else if (lc == columnRslt_purc_id_typ) doRslt_purc_id_typ_LC(info);
		else if (lc == columnRslt_purc_id_typ_nm) doRslt_purc_id_typ_nm_LC(info);
		else if (lc == columnRslt_purc_rsn_cd) doRslt_purc_rsn_cd_LC(info);
		else if (lc == columnRslt_purc_rsn_nm) doRslt_purc_rsn_nm_LC(info);
		else if (lc == columnRslt_purc_usr_cd) doRslt_purc_usr_cd_LC(info);
		else if (lc == columnRslt_purc_usr_nm) doRslt_purc_usr_nm_LC(info);
		else if (lc == columnRslt_purc_dpt_cd) doRslt_purc_dpt_cd_LC(info);
		else if (lc == columnRslt_purc_dpt_nm) doRslt_purc_dpt_nm_LC(info);
		else if (lc == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_LC(info);
		else if (lc == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_LC(info);
		else if (lc == columnRslt_bd_lot_mng_typ) doRslt_bd_lot_mng_typ_LC(info);
		else if (lc == columnRslt_bd_sublot_mng_typ) doRslt_bd_sublot_mng_typ_LC(info);
		else if (lc == columnRslt_bd_lot_no_typ) doRslt_bd_lot_no_typ_LC(info);
		else if (lc == columnRslt_bd_sublot_no_typ) doRslt_bd_sublot_no_typ_LC(info);
		else if (lc == columnRslt_bd_sno1_mng_typ) doRslt_bd_sno1_mng_typ_LC(info);
		else if (lc == columnRslt_bd_sno2_mng_typ) doRslt_bd_sno2_mng_typ_LC(info);
		else if (lc == columnRslt_bd_sno3_mng_typ) doRslt_bd_sno3_mng_typ_LC(info);
		else if (lc == columnRslt_bd_sno4_mng_typ) doRslt_bd_sno4_mng_typ_LC(info);
		else if (lc == columnRslt_slo_no) doRslt_slo_no_LC(info);
		else if (lc == columnRslt_slo_d_no) doRslt_slo_d_no_LC(info);
		else if (lc == columnRslt_trnspt_cd) doRslt_trnspt_cd_LC(info);
		else if (lc == columnRslt_trnspt_nm) doRslt_trnspt_nm_LC(info);
		else if (lc == columnRslt_vssl_flght) doRslt_vssl_flght_LC(info);
		else if (lc == columnRslt_load_port_cd) doRslt_load_port_cd_LC(info);
		else if (lc == columnRslt_load_port_nm) doRslt_load_port_nm_LC(info);
		else if (lc == columnRslt_etd_dt) doRslt_etd_dt_LC(info);
		else if (lc == columnRslt_dschrg_port_cd) doRslt_dschrg_port_cd_LC(info);
		else if (lc == columnRslt_dschrg_port_nm) doRslt_dschrg_port_nm_LC(info);
		else if (lc == columnRslt_eta_dt) doRslt_eta_dt_LC(info);
		else if (lc == columnRslt_via_port_cd) doRslt_via_port_cd_LC(info);
		else if (lc == columnRslt_via_port_nm) doRslt_via_port_nm_LC(info);
		else if (lc == columnRslt_via_schd_dt) doRslt_via_schd_dt_LC(info);
		else if (lc == columnRslt_purc_tterm_cd1) doRslt_purc_tterm_cd1_LC(info);
		else if (lc == columnRslt_purc_tterm_nm1) doRslt_purc_tterm_nm1_LC(info);
		else if (lc == columnRslt_purc_tterm_rmrks1) doRslt_purc_tterm_rmrks1_LC(info);
		else if (lc == columnRslt_purc_tterm_cd2) doRslt_purc_tterm_cd2_LC(info);
		else if (lc == columnRslt_purc_tterm_nm2) doRslt_purc_tterm_nm2_LC(info);
		else if (lc == columnRslt_purc_tterm_rmrks2) doRslt_purc_tterm_rmrks2_LC(info);
		else if (lc == columnRslt_purc_tterm_cd3) doRslt_purc_tterm_cd3_LC(info);
		else if (lc == columnRslt_purc_tterm_nm3) doRslt_purc_tterm_nm3_LC(info);
		else if (lc == columnRslt_purc_tterm_rmrks3) doRslt_purc_tterm_rmrks3_LC(info);
		else if (lc == columnRslt_trd_rmrks) doRslt_trd_rmrks_LC(info);
		else if (lc == columnRslt_po_print_rmrks) doRslt_po_print_rmrks_LC(info);
		else if (lc == columnRslt_slo_xrate) doRslt_slo_xrate_LC(info);
		else if (lc == columnRslt_slo_ptax_xrate) doRslt_slo_ptax_xrate_LC(info);
		else if (lc == columnRslt_slo_tterm_rmrks1) doRslt_slo_tterm_rmrks1_LC(info);
		else if (lc == columnRslt_slo_tterm_rmrks2) doRslt_slo_tterm_rmrks2_LC(info);
		else if (lc == columnRslt_slo_tterm_rmrks3) doRslt_slo_tterm_rmrks3_LC(info);
		else if (lc == columnRslt_purc_basis_typ) doRslt_purc_basis_typ_LC(info);
		else if (lc == columnRslt_purc_basis_typ_nm) doRslt_purc_basis_typ_nm_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_cntry_org_cd) doRslt_cntry_org_cd_LC(info);
		else if (lc == columnRslt_cntry_org_nm) doRslt_cntry_org_nm_LC(info);
		else if (lc == columnRslt_po_print_d_rmrks) doRslt_po_print_d_rmrks_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_LC(info);
		else if (lc == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_LC(info);
		else if (lc == columnRslt_arr_schd_qty) doRslt_arr_schd_qty_LC(info);
		else if (lc == columnRslt_arr_act_qty) doRslt_arr_act_qty_LC(info);
		else if (lc == columnRslt_arr_loc_wg_cd) doRslt_arr_loc_wg_cd_LC(info);
		else if (lc == columnRslt_sppl_cd) doRslt_sppl_cd_LC(info);
		else if (lc == columnRslt_purc_amt_rnd_typ) doRslt_purc_amt_rnd_typ_LC(info);
		else if (lc == columnRslt_purc_tax_rnd_typ) doRslt_purc_tax_rnd_typ_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
	}

	/**
	 * [Rslt]パネルの[pr_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pr_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pr_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[exim_xpns_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_exim_xpns_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wtax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wtax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_lot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_lot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sublot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sublot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bd_sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bd_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trnspt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trnspt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vssl_flght]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vssl_flght_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[load_port_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_load_port_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[etd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_etd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dschrg_port_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dschrg_port_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[eta_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_eta_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_port_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_port_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[via_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_via_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_rmrks1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_rmrks2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tterm_rmrks3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tterm_rmrks3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_print_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_print_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_ptax_xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_ptax_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_rmrks1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_rmrks2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_tterm_rmrks3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_tterm_rmrks3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_basis_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_basis_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_basis_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_basis_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_org_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_org_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_print_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_print_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_schd_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_schd_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_act_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_act_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_loc_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_loc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_amt_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_amt_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_tax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_tax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[columnRslt_purc_id_typ]の作成メソッド
	 */
	public MCList getRslt_purc_id_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt_purc_rsn_cd]の作成メソッド
	 */
	public MCList getRslt_purc_rsn_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt_ap_dpt_cd]の作成メソッド
	 */
	public MCList getRslt_ap_dpt_cd(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL2240.Srch01")) {
			return new MS_MSBEL2240_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL2240_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2240_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2240_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL2240_Srch01Bridge() {
			p_MS_MSBEL2240_Srch01 = new MCParam(PDef.MS_MSBEL2240_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2240_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2240.CndR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP2240.Cnd2R.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2240.RsltR.class));

			p_MS_MSBEL2240_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2240_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2240_Srch01.addUpBlock(getCndR());
			p_MS_MSBEL2240_Srch01.addUpBlock(getCnd2L().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2240_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2240_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2240.CndR up0() {
			return (mcframe.clientMSBE.MSBEP2240.CndR)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP2240.Cnd2R> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP2240.Cnd2R>)up(1);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2240.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2240.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2240_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2240.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2240_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2240.RsltR>)p_MS_MSBEL2240_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			result.add(getCnd2L());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
}