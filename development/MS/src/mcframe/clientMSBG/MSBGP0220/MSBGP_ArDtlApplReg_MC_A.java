package mcframe.clientMSBG.MSBGP0220;

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
import mcframe.clientMSBG.MSBGP0220.MSBGP_ArDtlApplReg_MC.MS_MSBGL0220_Srch01Caller;
import mcframe.clientMSBG.MSBGP0220.MSBGP_ArDtlApplReg_MC.MS_MSBGL0220_Upd01Caller;

/**
 * 画面"MSBGP_ArDtlApplReg"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGP_ArDtlApplReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBG";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBGP0220";

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
	 * UPD,Create/Modify;REF,View UPD,登録・訂正する;REF,参照する.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_rcv_act_d_no_Label = null;
	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_rcv_act_d_no = null;
	public MCLabel Cnd_ac_dt_fr_Label = null;
	/**
	 * Recording date FROM 計上日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_ac_dt_fr = null;
	public MCLabel Cnd_ac_dt_to_Label = null;
	/**
	 * Recording date TO 計上日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_ac_dt_to = null;
	/**
	 * Include unbilled 未請求含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_not_bill_flg = null;
	/**
	 * Include other sales orders 他の受注を含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_otr_slo_flg = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [HdrTab]ブロック関連のField定義
	public MCPanel HdrTabPanel = null;
	public MCTabbedPane HdrTabTab = null;
	// [HdrTab]ブロックの項目のField定義
	// [RcvActD]ブロック関連のField定義
	public MCPanel RcvActDPanel = null;
	// [RcvActD]ブロックの項目のField定義
	public MCLabel RcvActD_rcv_dt_Label = null;
	/**
	 * Payment received date 入金日.<p>
	 *
	 */
	public MCDateField RcvActD_rcv_dt = null;
	public MCLabel RcvActD_ac_ym_Label = null;
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDateField RcvActD_ac_ym = null;
	public MCLabel RcvActD_ac_dt_Label = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDateField RcvActD_ac_dt = null;
	public MCLabel RcvActD_trd_cd_Label = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCTextField RcvActD_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCTextField RcvActD_trd_nm = null;
	public MCLabel RcvActD_slo_no_Label = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCTextField RcvActD_slo_no = null;
	public MCLabel RcvActD_iv_no_Label = null;
	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public MCTextField RcvActD_iv_no = null;
	public MCLabel RcvActD_rcv_mtd_cd_Label = null;
	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public MCTextField RcvActD_rcv_mtd_cd = null;
	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public MCTextField RcvActD_rcv_mtd_nm = null;
	public MCLabel RcvActD_rcst_cd_Label = null;
	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public MCTextField RcvActD_rcst_cd = null;
	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public MCTextField RcvActD_rcst_nm = null;
	public MCLabel RcvActD_bcst_cd_Label = null;
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public MCTextField RcvActD_bcst_cd = null;
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public MCTextField RcvActD_bcst_nm = null;
	public MCLabel RcvActD_bill_dpt_cd_Label = null;
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public MCTextField RcvActD_bill_dpt_cd = null;
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public MCTextField RcvActD_bill_dpt_nm = null;
	public MCLabel RcvActD_acst_cd_Label = null;
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public MCTextField RcvActD_acst_cd = null;
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public MCTextField RcvActD_acst_nm = null;
	public MCLabel RcvActD_ar_dpt_cd_Label = null;
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public MCTextField RcvActD_ar_dpt_cd = null;
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public MCTextField RcvActD_ar_dpt_nm = null;
	public MCLabel RcvActD_wg_cd_Label = null;
	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public MCTextField RcvActD_wg_cd = null;
	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public MCTextField RcvActD_wg_nm = null;
	public MCLabel RcvActD_wrk_no_Label = null;
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCTextField RcvActD_wrk_no = null;
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public MCTextField RcvActD_wrk_nm = null;
	public MCLabel RcvActD_ar_typ_Label = null;
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public MCTextField RcvActD_ar_typ = null;
	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public MCTextField RcvActD_ar_typ_nm = null;
	public MCLabel RcvActD_trd_cur_cd_Label = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextField RcvActD_trd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCTextField RcvActD_trd_cur_nm = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField RcvActD_amt_dec_place = null;
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumberField RcvActD_upri_dec_place = null;
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H RcvActD_appl_tgt_amt_p_PPanel;
	public MCNumberField RcvActD_appl_tgt_amt;	// [RcvActD]の[appl_tgt_amt_p.amt]を[RcvActD_appl_tgt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H RcvActD_ttl_appl_amt_p_PPanel;
	public MCNumberField RcvActD_ttl_appl_amt;	// [RcvActD]の[ttl_appl_amt_p.amt]を[RcvActD_ttl_appl_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H RcvActD_not_appl_amt_p_PPanel;
	public MCNumberField RcvActD_not_appl_amt;	// [RcvActD]の[not_appl_amt_p.amt]を[RcvActD_not_appl_amt]としてエイリアス定義。
	public MCLabel RcvActD_ins_usr_id_Label = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCTextField RcvActD_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCTextField RcvActD_ins_usr_nm = null;
	public MCLabel RcvActD_ins_func_id_Label = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCTextField RcvActD_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCTextField RcvActD_ins_func_nm = null;
	public MCLabel RcvActD_upd_usr_id_Label = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCTextField RcvActD_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCTextField RcvActD_upd_usr_nm = null;
	public MCLabel RcvActD_upd_func_id_Label = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCTextField RcvActD_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCTextField RcvActD_upd_func_nm = null;
	public MCLabel RcvActD_ins_ts_Label = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestampField RcvActD_ins_ts = null;
	public MCLabel RcvActD_upd_ts_Label = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestampField RcvActD_upd_ts = null;
	public MCLabel RcvActD_upd_srv_req_no_Label = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCTextField RcvActD_upd_srv_req_no = null;
	// [Sys]ブロック関連のField定義
	public MCPanel SysPanel = null;
	// [Sys]ブロックの項目のField定義
	// [ApplDtl]ブロック関連のField定義
	public MCPanel ApplDtlPanel = null;
	public MCScrollPane ApplDtlScrollPane = null;
	public MCTable2<mcframe.clientMSBG.MSBGP0220.ApplDtlR> ApplDtlTable = null;
	// [ApplDtl]ブロックの項目のField定義
	/**
	 * Reconcile 消込.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_check = null;
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_ac_ym = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_ac_dt = null;
	/**
	 * Status 状況.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_slip_sts_typ_nm = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_trd_nm = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D ApplDtl_appl_tgt_amt_p_PPanel;
	public MCColumnConfig columnApplDtl_appl_tgt_amt;// [ApplDtl]の[appl_tgt_amt_p.amt]を[columnApplDtl_appl_tgt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D ApplDtl_ttl_appl_amt_p_PPanel;
	public MCColumnConfig columnApplDtl_ttl_appl_amt;// [ApplDtl]の[ttl_appl_amt_p.amt]を[columnApplDtl_ttl_appl_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D ApplDtl_appl_amt_p_PPanel;
	public MCColumnConfig columnApplDtl_appl_amt;// [ApplDtl]の[appl_amt_p.amt]を[columnApplDtl_appl_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D ApplDtl_not_appl_amt_p_PPanel;
	public MCColumnConfig columnApplDtl_not_appl_amt;// [ApplDtl]の[not_appl_amt_p.amt]を[columnApplDtl_not_appl_amt]としてエイリアス定義。
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_ar_typ = null;
	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_ar_typ_nm = null;
	/**
	 * Delivery date 納品日.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_dlv_dt = null;
	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_bill_ym = null;
	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_bill_cl_day = null;
	/**
	 * Billing closing date 請求締処理日.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_bill_dt = null;
	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_bill_no = null;
	/**
	 * Result No. 実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_act_no = null;
	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_act_seq = null;
	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_act_rev = null;
	/**
	 * Result details No. 実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_act_d_no = null;
	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_act_d_seq = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D ApplDtl_itm_p_PPanel;
	public MCColumnConfig columnApplDtl_itm_cd;// [ApplDtl]の[itm_p.itm_cd]を[columnApplDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnApplDtl_itm_sub1;// [ApplDtl]の[itm_p.itm_sub1]を[columnApplDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnApplDtl_itm_sub2;// [ApplDtl]の[itm_p.itm_sub2]を[columnApplDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnApplDtl_itm_sub3;// [ApplDtl]の[itm_p.itm_sub3]を[columnApplDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnApplDtl_itm_nm;// [ApplDtl]の[itm_p.itm_nm]を[columnApplDtl_itm_nm]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D ApplDtl_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnApplDtl_sno1;// [ApplDtl]の[sno_wrk_no_p.sno1]を[columnApplDtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnApplDtl_sno2;// [ApplDtl]の[sno_wrk_no_p.sno2]を[columnApplDtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnApplDtl_sno3;// [ApplDtl]の[sno_wrk_no_p.sno3]を[columnApplDtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnApplDtl_sno4;// [ApplDtl]の[sno_wrk_no_p.sno4]を[columnApplDtl_sno4]としてエイリアス定義。
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_trd_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_trd_unit_nm = null;
	/**
	 * Qty. number of decimal places 数量小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_qty_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ApplDtl_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnApplDtl_trd_unit_qty;// [ApplDtl]の[trd_unit_qty_p.qty]を[columnApplDtl_trd_unit_qty]としてエイリアス定義。
	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_inc_tax_flg = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D ApplDtl_trd_cur_upri_p_PPanel;
	public MCColumnConfig columnApplDtl_trd_cur_upri;// [ApplDtl]の[trd_cur_upri_p.upri]を[columnApplDtl_trd_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D ApplDtl_trd_cur_amt_p_PPanel;
	public MCColumnConfig columnApplDtl_trd_cur_amt;// [ApplDtl]の[trd_cur_amt_p.amt]を[columnApplDtl_trd_cur_amt]としてエイリアス定義。
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_tax_cd = null;
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_tax_nm = null;
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_tax_rate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D ApplDtl_trd_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnApplDtl_trd_cur_tax_amt;// [ApplDtl]の[trd_cur_tax_amt_p.amt]を[columnApplDtl_trd_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D ApplDtl_trd_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnApplDtl_trd_cur_dscnt_amt;// [ApplDtl]の[trd_cur_dscnt_amt_p.amt]を[columnApplDtl_trd_cur_dscnt_amt]としてエイリアス定義。
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_cst_nm = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_dlv_nm = null;
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_dest_cd1 = null;
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_dest_nm1 = null;
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_dest_cd2 = null;
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_dest_nm2 = null;
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_dest_cd3 = null;
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_dest_nm3 = null;
	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_sls_usr_cd = null;
	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_sls_usr_nm = null;
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_sls_dpt_cd = null;
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_sls_dpt_nm = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_slo_no = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_slo_d_no = null;
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_cst_po_no = null;
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_cst_po_d_no = null;
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_dlv_slip_no = null;
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_dlv_slip_d_no = null;
	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_ship_dlv_slip_no = null;
	/**
	 * Delivery note details No. at shipping 出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_ship_dlv_slip_d_no = null;
	/**
	 * Multiple delivery note details at shipping 出荷時納品書明細複数.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_ship_dlv_slip_multi_flg = null;
	public MCColumnConfig columnApplDtl_wrk_no;// [ApplDtl]の[sno_wrk_no_p.wrk_no]を[columnApplDtl_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnApplDtl_wrk_nm;// [ApplDtl]の[sno_wrk_no_p.wrk_nm]を[columnApplDtl_wrk_nm]としてエイリアス定義。
	/**
	 * Transfer recording month 振替計上年月.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_arsw_ac_ym = null;
	/**
	 * Transfer recording date 振替計上日.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_arsw_ac_dt = null;
	/**
	 * Transfer transaction cd. 振替取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_arsw_trd_cd = null;
	/**
	 * Transfer transaction name 振替取引名.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_arsw_trd_nm = null;
	/**
	 * Transfer payment received result No. 振替入金実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_arsw_act_no = null;
	/**
	 * Transfer payment received result details No. 振替入金実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_arsw_act_d_no = null;
	/**
	 * Payment received result No. 入金実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_rcv_act_no = null;
	/**
	 * Payment received result sequence number 入金実績連番.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_rcv_act_seq = null;
	/**
	 * Payment received result details No. 入金実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_rcv_act_d_no = null;
	/**
	 * Payment received result details sequence number 入金実績明細連番.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_rcv_act_d_seq = null;
	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_bill_d_no = null;
	/**
	 * Parent billing details No. 親請求明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_parent_bill_d_no = null;
	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_bill_mng_no = null;
	/**
	 * Billing details update counter 請求明細更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_bill_d_upd_cntr = null;
	/**
	 * Billing details reconciled balance update counter 請求明細消込残高更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_bill_d_appl_bal_upd_cntr = null;
	/**
	 * Payment received result update counter 入金実績更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnApplDtl_rcv_act_upd_cntr = null;
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
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_appl = null;
	/**
	 * Invalid/cancel first 無効・取消優先.<p>
	 *
	 */
	public MCCheckBox Btn_prio_can_red_flg = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [SRCH_APPL]モードを表す定数 */
	public static final String SRCH_APPL = "SRCH_APPL";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [UPD_APPL]モードを表す定数 */
	public static final String UPD_APPL = "UPD_APPL";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, SRCH_APPL, UPD, UPD_APPL, FIX_U, REF};
	
	/** [MS_MSBGL0220_Srch01]のCallerの作成 */
	protected MSBGP_ArDtlApplReg_MC.MS_MSBGL0220_Srch01Caller createMS_MSBGL0220_Srch01() {
		MSBGP_ArDtlApplReg_MC.MS_MSBGL0220_Srch01Caller<MSBGP_ArDtlApplReg, MS_MSBGL0220_Srch01Bridge>
		caller = ((MSBGP_ArDtlApplReg_MC)this).new MS_MSBGL0220_Srch01Caller<MSBGP_ArDtlApplReg, MS_MSBGL0220_Srch01Bridge>(
					(MSBGP_ArDtlApplReg)this, new MS_MSBGL0220_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBGL0220_Srch01]の呼び出し */
	protected void callMS_MSBGL0220_Srch01() {
		MCCaller caller = createMS_MSBGL0220_Srch01();
		caller.exec();
	}
	/** [MS_MSBGL0220_Upd01]のCallerの作成 */
	protected MSBGP_ArDtlApplReg_MC.MS_MSBGL0220_Upd01Caller createMS_MSBGL0220_Upd01() {
		MSBGP_ArDtlApplReg_MC.MS_MSBGL0220_Upd01Caller<MSBGP_ArDtlApplReg, MS_MSBGL0220_Upd01Bridge>
		caller = ((MSBGP_ArDtlApplReg_MC)this).new MS_MSBGL0220_Upd01Caller<MSBGP_ArDtlApplReg, MS_MSBGL0220_Upd01Bridge>(
					(MSBGP_ArDtlApplReg)this, new MS_MSBGL0220_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBGL0220_Upd01]の呼び出し */
	protected void callMS_MSBGL0220_Upd01() {
		MCCaller caller = createMS_MSBGL0220_Upd01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0220.CndR aCndR;
	/** [RcvActD]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0220.RcvActDR aRcvActDR;
	/** [ApplDtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0220.ApplDtlR> aApplDtlL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0220.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBG.MSBGP0220.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0220.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0220.CndR createCndR() {
		return mcframe.clientMSBG.MSBGP0220.CndR.create();
	}

	/**
	 * 項目コピーによってaRcvActDRを設定します。
	 *
	 * aRcvActDRのインスタンスは変更されません。
	 *
	 * @param row RcvActDR
	 */
	public void setRcvActDR(mcframe.clientMSBG.MSBGP0220.RcvActDR row) {
		if (row != null) {
			MCRow.copyall(getRcvActDR(), row);
		}
	}

	/**
	 * [RcvActD]ブロックのコンテナaRcvActDRを返します。
	 *
	 * @return RcvActDR
	 */
	public mcframe.clientMSBG.MSBGP0220.RcvActDR getRcvActDR() {
		return aRcvActDR;
	}

	/**
	 * aRcvActDRを作成します。
	 *
	 * @return RcvActDR
	 */
	public mcframe.clientMSBG.MSBGP0220.RcvActDR createRcvActDR() {
		return mcframe.clientMSBG.MSBGP0220.RcvActDR.create();
	}

	/**
	 * コピーによってaApplDtlLを設定します。
	 *
	 * aApplDtlLのインスタンスは変更されません。
	 *
	 * @param dataset ApplDtlL
	 */
	public void setApplDtlL(MCList<mcframe.clientMSBG.MSBGP0220.ApplDtlR> aList) {
		if (getApplDtlL() != aList) {
			getApplDtlL().setAll(aList);
		}
	}

	/**
	 * [ApplDtl]ブロックのコンテナaApplDtlLを返します。
	 *
	 * @return ApplDtlL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0220.ApplDtlR> getApplDtlL() {
		return aApplDtlL;
	}

	/**
	 * aApplDtlRを作成します。
	 *
	 * @return ApplDtlR
	 */
	public mcframe.clientMSBG.MSBGP0220.ApplDtlR createApplDtlR() {
		return mcframe.clientMSBG.MSBGP0220.ApplDtlR.create();
	}

	/**
	 * aApplDtlLを作成します。
	 *
	 * @return ApplDtlL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0220.ApplDtlR> createApplDtlL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0220.ApplDtlR.class);
	}

	/**
	 * ApplDtlTableを初期化します。
	 */
	protected void createApplDtlTable(){
		if(ApplDtlTable == null){
			ApplDtlTable = beansFactory.createTable2("ApplDtl.table");
		}
	}

	/**
	 * 項目コピーによってaBtnRを設定します。
	 *
	 * aBtnRのインスタンスは変更されません。
	 *
	 * @param row BtnR
	 */
	public void setBtnR(mcframe.clientMSBG.MSBGP0220.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBG.MSBGP0220.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBG.MSBGP0220.BtnR createBtnR() {
		return mcframe.clientMSBG.MSBGP0220.BtnR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getRcvActDR())) ret.add(getRcvActDR());
		if(!MCCollectionUtil.contains(ret, getApplDtlL())) ret.add(getApplDtlL());
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
		if(aCnt == getRcvActDR()) return "RcvActD";
		if(aCnt == getApplDtlL()) return "ApplDtl";
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
		if(bId.equals("RcvActD")) return getRcvActDR();
		if(bId.equals("ApplDtl")) return getApplDtlL();
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
		ret.add(RcvActDPanel);
		ret.add(SysPanel);
		ret.add(ApplDtlPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_ArDtlApplReg_MC_A() {
		aCndR = createCndR();
		aRcvActDR = createRcvActDR();
		aApplDtlL = createApplDtlL();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBGP_ArDtlApplReg_MC_A(String name) {
		aCndR = createCndR();
		aRcvActDR = createRcvActDR();
		aApplDtlL = createApplDtlL();
		createApplDtlTable();
		ApplDtlTable.setRowName(name);
		aBtnR = createBtnR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBGP_ArDtlApplReg_MC.jbCreateScreenOpe((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.jbCreateCnd((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.jbCreateHdrTab((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.jbCreateRcvActD((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.jbCreateSys((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.jbCreateApplDtl((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.jbCreateBtn((MSBGP_ArDtlApplReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBGP_ArDtlApplReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBGP_ArDtlApplReg p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBGP_ArDtlApplReg p) {
	}

	/**
	 * [RcvActD]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRcvActD(MSBGP_ArDtlApplReg p) {
		p.RcvActD_appl_tgt_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getRcvActDR().appl_tgt_amt_p());
		p.RcvActD_appl_tgt_amt_p_PPanel.setName("RcvActD.appl_tgt_amt_p");
		p.RcvActD_appl_tgt_amt = p.RcvActD_appl_tgt_amt_p_PPanel.Amt_amt;
		p.RcvActD_appl_tgt_amt.addAliasName("RcvActD.appl_tgt_amt", p);
		p.RcvActD_ttl_appl_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getRcvActDR().ttl_appl_amt_p());
		p.RcvActD_ttl_appl_amt_p_PPanel.setName("RcvActD.ttl_appl_amt_p");
		p.RcvActD_ttl_appl_amt = p.RcvActD_ttl_appl_amt_p_PPanel.Amt_amt;
		p.RcvActD_ttl_appl_amt.addAliasName("RcvActD.ttl_appl_amt", p);
		p.RcvActD_not_appl_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getRcvActDR().not_appl_amt_p());
		p.RcvActD_not_appl_amt_p_PPanel.setName("RcvActD.not_appl_amt_p");
		p.RcvActD_not_appl_amt = p.RcvActD_not_appl_amt_p_PPanel.Amt_amt;
		p.RcvActD_not_appl_amt.addAliasName("RcvActD.not_appl_amt", p);
	}

	/**
	 * [Sys]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSys(MSBGP_ArDtlApplReg p) {
	}

	/**
	 * [ApplDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateApplDtl(MSBGP_ArDtlApplReg p) {
		p.ApplDtl_appl_tgt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0220.ApplDtlR.$appl_tgt_amt_p);
		p.ApplDtl_appl_tgt_amt_p_PPanel.setName("ApplDtl.appl_tgt_amt_p");
		p.columnApplDtl_appl_tgt_amt = p.ApplDtl_appl_tgt_amt_p_PPanel.columnAmt_amt;
		p.columnApplDtl_appl_tgt_amt.addAliasName("ApplDtl.appl_tgt_amt", p);
		p.ApplDtl_ttl_appl_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0220.ApplDtlR.$ttl_appl_amt_p);
		p.ApplDtl_ttl_appl_amt_p_PPanel.setName("ApplDtl.ttl_appl_amt_p");
		p.columnApplDtl_ttl_appl_amt = p.ApplDtl_ttl_appl_amt_p_PPanel.columnAmt_amt;
		p.columnApplDtl_ttl_appl_amt.addAliasName("ApplDtl.ttl_appl_amt", p);
		p.ApplDtl_appl_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0220.ApplDtlR.$appl_amt_p);
		p.ApplDtl_appl_amt_p_PPanel.setName("ApplDtl.appl_amt_p");
		p.columnApplDtl_appl_amt = p.ApplDtl_appl_amt_p_PPanel.columnAmt_amt;
		p.columnApplDtl_appl_amt.addAliasName("ApplDtl.appl_amt", p);
		p.ApplDtl_not_appl_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0220.ApplDtlR.$not_appl_amt_p);
		p.ApplDtl_not_appl_amt_p_PPanel.setName("ApplDtl.not_appl_amt_p");
		p.columnApplDtl_not_appl_amt = p.ApplDtl_not_appl_amt_p_PPanel.columnAmt_amt;
		p.columnApplDtl_not_appl_amt.addAliasName("ApplDtl.not_appl_amt", p);
		p.ApplDtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBG.MSBGP0220.ApplDtlR.$itm_p);
		p.ApplDtl_itm_p_PPanel.setName("ApplDtl.itm_p");
		p.columnApplDtl_itm_cd = p.ApplDtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnApplDtl_itm_cd.addAliasName("ApplDtl.itm_cd", p);
		p.columnApplDtl_itm_sub1 = p.ApplDtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnApplDtl_itm_sub1.addAliasName("ApplDtl.itm_sub1", p);
		p.columnApplDtl_itm_sub2 = p.ApplDtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnApplDtl_itm_sub2.addAliasName("ApplDtl.itm_sub2", p);
		p.columnApplDtl_itm_sub3 = p.ApplDtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnApplDtl_itm_sub3.addAliasName("ApplDtl.itm_sub3", p);
		p.columnApplDtl_itm_nm = p.ApplDtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnApplDtl_itm_nm.addAliasName("ApplDtl.itm_nm", p);
		p.ApplDtl_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBG.MSBGP0220.ApplDtlR.$sno_wrk_no_p);
		p.ApplDtl_sno_wrk_no_p_PPanel.setName("ApplDtl.sno_wrk_no_p");
		p.columnApplDtl_sno1 = p.ApplDtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnApplDtl_sno1.addAliasName("ApplDtl.sno1", p);
		p.columnApplDtl_sno2 = p.ApplDtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnApplDtl_sno2.addAliasName("ApplDtl.sno2", p);
		p.columnApplDtl_sno3 = p.ApplDtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnApplDtl_sno3.addAliasName("ApplDtl.sno3", p);
		p.columnApplDtl_sno4 = p.ApplDtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnApplDtl_sno4.addAliasName("ApplDtl.sno4", p);
		p.ApplDtl_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBG.MSBGP0220.ApplDtlR.$trd_unit_qty_p);
		p.ApplDtl_trd_unit_qty_p_PPanel.setName("ApplDtl.trd_unit_qty_p");
		p.columnApplDtl_trd_unit_qty = p.ApplDtl_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnApplDtl_trd_unit_qty.addAliasName("ApplDtl.trd_unit_qty", p);
		p.ApplDtl_trd_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBG.MSBGP0220.ApplDtlR.$trd_cur_upri_p);
		p.ApplDtl_trd_cur_upri_p_PPanel.setName("ApplDtl.trd_cur_upri_p");
		p.columnApplDtl_trd_cur_upri = p.ApplDtl_trd_cur_upri_p_PPanel.columnUpri_upri;
		p.columnApplDtl_trd_cur_upri.addAliasName("ApplDtl.trd_cur_upri", p);
		p.ApplDtl_trd_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0220.ApplDtlR.$trd_cur_amt_p);
		p.ApplDtl_trd_cur_amt_p_PPanel.setName("ApplDtl.trd_cur_amt_p");
		p.columnApplDtl_trd_cur_amt = p.ApplDtl_trd_cur_amt_p_PPanel.columnAmt_amt;
		p.columnApplDtl_trd_cur_amt.addAliasName("ApplDtl.trd_cur_amt", p);
		p.ApplDtl_trd_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0220.ApplDtlR.$trd_cur_tax_amt_p);
		p.ApplDtl_trd_cur_tax_amt_p_PPanel.setName("ApplDtl.trd_cur_tax_amt_p");
		p.columnApplDtl_trd_cur_tax_amt = p.ApplDtl_trd_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnApplDtl_trd_cur_tax_amt.addAliasName("ApplDtl.trd_cur_tax_amt", p);
		p.ApplDtl_trd_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0220.ApplDtlR.$trd_cur_dscnt_amt_p);
		p.ApplDtl_trd_cur_dscnt_amt_p_PPanel.setName("ApplDtl.trd_cur_dscnt_amt_p");
		p.columnApplDtl_trd_cur_dscnt_amt = p.ApplDtl_trd_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnApplDtl_trd_cur_dscnt_amt.addAliasName("ApplDtl.trd_cur_dscnt_amt", p);
		p.columnApplDtl_wrk_no = p.ApplDtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnApplDtl_wrk_no.addAliasName("ApplDtl.wrk_no", p);
		p.columnApplDtl_wrk_nm = p.ApplDtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnApplDtl_wrk_nm.addAliasName("ApplDtl.wrk_nm", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBGP_ArDtlApplReg p) {
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

	
	/** [ApplDtl_ar_typ_ListPutter]の定義 */
	private MCListPutter ApplDtl_ar_typ_p = null;

	/**
	 * [ApplDtl_ar_typ_ListPutter]の取得
	 */
	protected MCListPutter getApplDtl_ar_typ_ListPutter() {
		if (ApplDtl_ar_typ_p == null) {
			ApplDtl_ar_typ_p = createApplDtl_ar_typ_ListPutter(columnApplDtl_ar_typ, "ar_typ");

		}
		return ApplDtl_ar_typ_p;
	}
	
	
	/** [ApplDtl_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter ApplDtl_trd_unit_cd_p = null;

	/**
	 * [ApplDtl_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getApplDtl_trd_unit_cd_ListPutter() {
		if (ApplDtl_trd_unit_cd_p == null) {
			ApplDtl_trd_unit_cd_p = createApplDtl_trd_unit_cd_ListPutter(columnApplDtl_trd_unit_cd, "trd_unit_cd");

		}
		return ApplDtl_trd_unit_cd_p;
	}
	
	
	/** [ApplDtl_tax_cd_ListPutter]の定義 */
	private MCListPutter ApplDtl_tax_cd_p = null;

	/**
	 * [ApplDtl_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getApplDtl_tax_cd_ListPutter() {
		if (ApplDtl_tax_cd_p == null) {
			ApplDtl_tax_cd_p = createApplDtl_tax_cd_ListPutter(columnApplDtl_tax_cd, "tax_cd");

		}
		return ApplDtl_tax_cd_p;
	}
	
	
	/** [ApplDtl_cst_cd_ListPutter]の定義 */
	private MCListPutter ApplDtl_cst_cd_p = null;

	/**
	 * [ApplDtl_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getApplDtl_cst_cd_ListPutter() {
		if (ApplDtl_cst_cd_p == null) {
			ApplDtl_cst_cd_p = createApplDtl_cst_cd_ListPutter(columnApplDtl_cst_cd, "cst_cd");

		}
		return ApplDtl_cst_cd_p;
	}
	
	
	/** [ApplDtl_dlv_cd_ListPutter]の定義 */
	private MCListPutter ApplDtl_dlv_cd_p = null;

	/**
	 * [ApplDtl_dlv_cd_ListPutter]の取得
	 */
	protected MCListPutter getApplDtl_dlv_cd_ListPutter() {
		if (ApplDtl_dlv_cd_p == null) {
			ApplDtl_dlv_cd_p = createApplDtl_dlv_cd_ListPutter(columnApplDtl_dlv_cd, "dlv_cd");

		}
		return ApplDtl_dlv_cd_p;
	}
	
	
	/** [ApplDtl_dest_cd1_ListPutter]の定義 */
	private MCListPutter ApplDtl_dest_cd1_p = null;

	/**
	 * [ApplDtl_dest_cd1_ListPutter]の取得
	 */
	protected MCListPutter getApplDtl_dest_cd1_ListPutter() {
		if (ApplDtl_dest_cd1_p == null) {
			ApplDtl_dest_cd1_p = createApplDtl_dest_cd1_ListPutter(columnApplDtl_dest_cd1, "dest_cd1");

		}
		return ApplDtl_dest_cd1_p;
	}
	
	
	/** [ApplDtl_dest_cd2_ListPutter]の定義 */
	private MCListPutter ApplDtl_dest_cd2_p = null;

	/**
	 * [ApplDtl_dest_cd2_ListPutter]の取得
	 */
	protected MCListPutter getApplDtl_dest_cd2_ListPutter() {
		if (ApplDtl_dest_cd2_p == null) {
			ApplDtl_dest_cd2_p = createApplDtl_dest_cd2_ListPutter(columnApplDtl_dest_cd2, "dest_cd2");

		}
		return ApplDtl_dest_cd2_p;
	}
	
	
	/** [ApplDtl_dest_cd3_ListPutter]の定義 */
	private MCListPutter ApplDtl_dest_cd3_p = null;

	/**
	 * [ApplDtl_dest_cd3_ListPutter]の取得
	 */
	protected MCListPutter getApplDtl_dest_cd3_ListPutter() {
		if (ApplDtl_dest_cd3_p == null) {
			ApplDtl_dest_cd3_p = createApplDtl_dest_cd3_ListPutter(columnApplDtl_dest_cd3, "dest_cd3");

		}
		return ApplDtl_dest_cd3_p;
	}
	
	
	/** [ApplDtl_sls_usr_cd_ListPutter]の定義 */
	private MCListPutter ApplDtl_sls_usr_cd_p = null;

	/**
	 * [ApplDtl_sls_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getApplDtl_sls_usr_cd_ListPutter() {
		if (ApplDtl_sls_usr_cd_p == null) {
			ApplDtl_sls_usr_cd_p = createApplDtl_sls_usr_cd_ListPutter(columnApplDtl_sls_usr_cd, "sls_usr_cd");

		}
		return ApplDtl_sls_usr_cd_p;
	}
	
	
	/** [ApplDtl_sls_dpt_cd_ListPutter]の定義 */
	private MCListPutter ApplDtl_sls_dpt_cd_p = null;

	/**
	 * [ApplDtl_sls_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getApplDtl_sls_dpt_cd_ListPutter() {
		if (ApplDtl_sls_dpt_cd_p == null) {
			ApplDtl_sls_dpt_cd_p = createApplDtl_sls_dpt_cd_ListPutter(columnApplDtl_sls_dpt_cd, "sls_dpt_cd");

		}
		return ApplDtl_sls_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_ArDtlApplReg create(){
		MSBGP_ArDtlApplReg p = new MSBGP_ArDtlApplReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_ArDtlApplReg create(String name){
		MSBGP_ArDtlApplReg p = new MSBGP_ArDtlApplReg(name);
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
		MSBGP_ArDtlApplReg_MC.jbfInitScreenOpe((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.jbfInitCnd((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.jbfInitHdrTab((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.jbfInitRcvActD((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.jbfInitSys((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.jbfInitApplDtl((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.jbfInitBtn((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.jbInitScreenOpe((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.jbInitCnd((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.jbInitHdrTab((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.jbInitRcvActD((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.jbInitSys((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.jbInitApplDtl((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.jbInitBtn((MSBGP_ArDtlApplReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBGP_ArDtlApplReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBGP_ArDtlApplReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_rcv_act_d_no_Label = p.beansFactory.createLabel("Cnd.rcv_act_d_no_Label");
		p.Cnd_rcv_act_d_no = p.beansFactory.createTextField("Cnd.rcv_act_d_no");
		p.Cnd_rcv_act_d_no.setLabel(p.Cnd_rcv_act_d_no_Label);
		p.Cnd_ac_dt_fr_Label = p.beansFactory.createLabel("Cnd.ac_dt_fr_Label");
		p.Cnd_ac_dt_fr = p.beansFactory.createDateField("Cnd.ac_dt_fr");
		p.Cnd_ac_dt_fr.setLabel(p.Cnd_ac_dt_fr_Label);
		p.Cnd_ac_dt_to_Label = p.beansFactory.createLabel("Cnd.ac_dt_to_Label");
		p.Cnd_ac_dt_to = p.beansFactory.createDateField("Cnd.ac_dt_to");
		p.Cnd_ac_dt_to.setLabel(p.Cnd_ac_dt_to_Label);
		p.Cnd_inc_not_bill_flg = p.beansFactory.createCheckBox("Cnd.inc_not_bill_flg");
		p.Cnd_inc_otr_slo_flg = p.beansFactory.createCheckBox("Cnd.inc_otr_slo_flg");
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBGP_ArDtlApplReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [RcvActD]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRcvActD(MSBGP_ArDtlApplReg p) {
		// ブロック関連の初期化
		p.RcvActDPanel = p.beansFactory.createPanel("RcvActD");
		// ブロックの項目の初期化
		p.RcvActD_rcv_dt_Label = p.beansFactory.createLabel("RcvActD.rcv_dt_Label");
		p.RcvActD_rcv_dt = p.beansFactory.createDateField("RcvActD.rcv_dt");
		p.RcvActD_rcv_dt.setLabel(p.RcvActD_rcv_dt_Label);
		p.RcvActD_ac_ym_Label = p.beansFactory.createLabel("RcvActD.ac_ym_Label");
		p.RcvActD_ac_ym = p.beansFactory.createDateField("RcvActD.ac_ym");
		p.RcvActD_ac_ym.setLabel(p.RcvActD_ac_ym_Label);
		p.RcvActD_ac_dt_Label = p.beansFactory.createLabel("RcvActD.ac_dt_Label");
		p.RcvActD_ac_dt = p.beansFactory.createDateField("RcvActD.ac_dt");
		p.RcvActD_ac_dt.setLabel(p.RcvActD_ac_dt_Label);
		p.RcvActD_trd_cd_Label = p.beansFactory.createLabel("RcvActD.trd_cd_Label");
		p.RcvActD_trd_cd = p.beansFactory.createTextField("RcvActD.trd_cd");
		p.RcvActD_trd_cd.setLabel(p.RcvActD_trd_cd_Label);
		p.RcvActD_trd_nm = p.beansFactory.createTextField("RcvActD.trd_nm");
		p.RcvActD_slo_no_Label = p.beansFactory.createLabel("RcvActD.slo_no_Label");
		p.RcvActD_slo_no = p.beansFactory.createTextField("RcvActD.slo_no");
		p.RcvActD_slo_no.setLabel(p.RcvActD_slo_no_Label);
		p.RcvActD_iv_no_Label = p.beansFactory.createLabel("RcvActD.iv_no_Label");
		p.RcvActD_iv_no = p.beansFactory.createTextField("RcvActD.iv_no");
		p.RcvActD_iv_no.setLabel(p.RcvActD_iv_no_Label);
		p.RcvActD_rcv_mtd_cd_Label = p.beansFactory.createLabel("RcvActD.rcv_mtd_cd_Label");
		p.RcvActD_rcv_mtd_cd = p.beansFactory.createTextField("RcvActD.rcv_mtd_cd");
		p.RcvActD_rcv_mtd_cd.setLabel(p.RcvActD_rcv_mtd_cd_Label);
		p.RcvActD_rcv_mtd_nm = p.beansFactory.createTextField("RcvActD.rcv_mtd_nm");
		p.RcvActD_rcst_cd_Label = p.beansFactory.createLabel("RcvActD.rcst_cd_Label");
		p.RcvActD_rcst_cd = p.beansFactory.createTextField("RcvActD.rcst_cd");
		p.RcvActD_rcst_cd.setLabel(p.RcvActD_rcst_cd_Label);
		p.RcvActD_rcst_nm = p.beansFactory.createTextField("RcvActD.rcst_nm");
		p.RcvActD_bcst_cd_Label = p.beansFactory.createLabel("RcvActD.bcst_cd_Label");
		p.RcvActD_bcst_cd = p.beansFactory.createTextField("RcvActD.bcst_cd");
		p.RcvActD_bcst_cd.setLabel(p.RcvActD_bcst_cd_Label);
		p.RcvActD_bcst_nm = p.beansFactory.createTextField("RcvActD.bcst_nm");
		p.RcvActD_bill_dpt_cd_Label = p.beansFactory.createLabel("RcvActD.bill_dpt_cd_Label");
		p.RcvActD_bill_dpt_cd = p.beansFactory.createTextField("RcvActD.bill_dpt_cd");
		p.RcvActD_bill_dpt_cd.setLabel(p.RcvActD_bill_dpt_cd_Label);
		p.RcvActD_bill_dpt_nm = p.beansFactory.createTextField("RcvActD.bill_dpt_nm");
		p.RcvActD_acst_cd_Label = p.beansFactory.createLabel("RcvActD.acst_cd_Label");
		p.RcvActD_acst_cd = p.beansFactory.createTextField("RcvActD.acst_cd");
		p.RcvActD_acst_cd.setLabel(p.RcvActD_acst_cd_Label);
		p.RcvActD_acst_nm = p.beansFactory.createTextField("RcvActD.acst_nm");
		p.RcvActD_ar_dpt_cd_Label = p.beansFactory.createLabel("RcvActD.ar_dpt_cd_Label");
		p.RcvActD_ar_dpt_cd = p.beansFactory.createTextField("RcvActD.ar_dpt_cd");
		p.RcvActD_ar_dpt_cd.setLabel(p.RcvActD_ar_dpt_cd_Label);
		p.RcvActD_ar_dpt_nm = p.beansFactory.createTextField("RcvActD.ar_dpt_nm");
		p.RcvActD_wg_cd_Label = p.beansFactory.createLabel("RcvActD.wg_cd_Label");
		p.RcvActD_wg_cd = p.beansFactory.createTextField("RcvActD.wg_cd");
		p.RcvActD_wg_cd.setLabel(p.RcvActD_wg_cd_Label);
		p.RcvActD_wg_nm = p.beansFactory.createTextField("RcvActD.wg_nm");
		p.RcvActD_wrk_no_Label = p.beansFactory.createLabel("RcvActD.wrk_no_Label");
		p.RcvActD_wrk_no = p.beansFactory.createTextField("RcvActD.wrk_no");
		p.RcvActD_wrk_no.setLabel(p.RcvActD_wrk_no_Label);
		p.RcvActD_wrk_nm = p.beansFactory.createTextField("RcvActD.wrk_nm");
		p.RcvActD_ar_typ_Label = p.beansFactory.createLabel("RcvActD.ar_typ_Label");
		p.RcvActD_ar_typ = p.beansFactory.createTextField("RcvActD.ar_typ");
		p.RcvActD_ar_typ.setLabel(p.RcvActD_ar_typ_Label);
		p.RcvActD_ar_typ_nm = p.beansFactory.createTextField("RcvActD.ar_typ_nm");
		p.RcvActD_trd_cur_cd_Label = p.beansFactory.createLabel("RcvActD.trd_cur_cd_Label");
		p.RcvActD_trd_cur_cd = p.beansFactory.createTextField("RcvActD.trd_cur_cd");
		p.RcvActD_trd_cur_cd.setLabel(p.RcvActD_trd_cur_cd_Label);
		p.RcvActD_trd_cur_nm = p.beansFactory.createTextField("RcvActD.trd_cur_nm");
		p.RcvActD_amt_dec_place = p.beansFactory.createNumberField("RcvActD.amt_dec_place");
		p.RcvActD_upri_dec_place = p.beansFactory.createNumberField("RcvActD.upri_dec_place");
		p.RcvActD_ins_usr_id_Label = p.beansFactory.createLabel("RcvActD.ins_usr_id_Label");
		p.RcvActD_ins_usr_id = p.beansFactory.createTextField("RcvActD.ins_usr_id");
		p.RcvActD_ins_usr_id.setLabel(p.RcvActD_ins_usr_id_Label);
		p.RcvActD_ins_usr_nm = p.beansFactory.createTextField("RcvActD.ins_usr_nm");
		p.RcvActD_ins_func_id_Label = p.beansFactory.createLabel("RcvActD.ins_func_id_Label");
		p.RcvActD_ins_func_id = p.beansFactory.createTextField("RcvActD.ins_func_id");
		p.RcvActD_ins_func_id.setLabel(p.RcvActD_ins_func_id_Label);
		p.RcvActD_ins_func_nm = p.beansFactory.createTextField("RcvActD.ins_func_nm");
		p.RcvActD_upd_usr_id_Label = p.beansFactory.createLabel("RcvActD.upd_usr_id_Label");
		p.RcvActD_upd_usr_id = p.beansFactory.createTextField("RcvActD.upd_usr_id");
		p.RcvActD_upd_usr_id.setLabel(p.RcvActD_upd_usr_id_Label);
		p.RcvActD_upd_usr_nm = p.beansFactory.createTextField("RcvActD.upd_usr_nm");
		p.RcvActD_upd_func_id_Label = p.beansFactory.createLabel("RcvActD.upd_func_id_Label");
		p.RcvActD_upd_func_id = p.beansFactory.createTextField("RcvActD.upd_func_id");
		p.RcvActD_upd_func_id.setLabel(p.RcvActD_upd_func_id_Label);
		p.RcvActD_upd_func_nm = p.beansFactory.createTextField("RcvActD.upd_func_nm");
		p.RcvActD_ins_ts_Label = p.beansFactory.createLabel("RcvActD.ins_ts_Label");
		p.RcvActD_ins_ts = p.beansFactory.createTimestampField("RcvActD.ins_ts");
		p.RcvActD_ins_ts.setLabel(p.RcvActD_ins_ts_Label);
		p.RcvActD_upd_ts_Label = p.beansFactory.createLabel("RcvActD.upd_ts_Label");
		p.RcvActD_upd_ts = p.beansFactory.createTimestampField("RcvActD.upd_ts");
		p.RcvActD_upd_ts.setLabel(p.RcvActD_upd_ts_Label);
		p.RcvActD_upd_srv_req_no_Label = p.beansFactory.createLabel("RcvActD.upd_srv_req_no_Label");
		p.RcvActD_upd_srv_req_no = p.beansFactory.createTextField("RcvActD.upd_srv_req_no");
		p.RcvActD_upd_srv_req_no.setLabel(p.RcvActD_upd_srv_req_no_Label);
	}

	/**
	 * [Sys]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSys(MSBGP_ArDtlApplReg p) {
		// ブロック関連の初期化
		p.SysPanel = p.beansFactory.createPanel("Sys");
		// ブロックの項目の初期化
	}

	/**
	 * [ApplDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitApplDtl(MSBGP_ArDtlApplReg p) {
		// ブロック関連の初期化
		p.ApplDtlPanel = p.beansFactory.createPanel("ApplDtl");
		p.ApplDtlScrollPane = p.beansFactory.createScrollPane("ApplDtl.scroll");
		p.createApplDtlTable();
		// ブロックの項目の初期化
		p.columnApplDtl_check = p.beansFactory.createTableColumn("ApplDtl.check", MCColumnType.CHECK);
		p.columnApplDtl_ac_ym = p.beansFactory.createTableColumn("ApplDtl.ac_ym", MCColumnType.DATE);
		p.columnApplDtl_ac_dt = p.beansFactory.createTableColumn("ApplDtl.ac_dt", MCColumnType.DATE);
		p.columnApplDtl_slip_sts_typ_nm = p.beansFactory.createTableColumn("ApplDtl.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnApplDtl_trd_cd = p.beansFactory.createTableColumn("ApplDtl.trd_cd", MCColumnType.TEXT);
		p.columnApplDtl_trd_nm = p.beansFactory.createTableColumn("ApplDtl.trd_nm", MCColumnType.TEXT);
		p.columnApplDtl_ar_typ = p.beansFactory.createTableColumn("ApplDtl.ar_typ", MCColumnType.TEXT_COMBO);
		p.columnApplDtl_ar_typ_nm = p.beansFactory.createTableColumn("ApplDtl.ar_typ_nm", MCColumnType.TEXT);
		p.columnApplDtl_dlv_dt = p.beansFactory.createTableColumn("ApplDtl.dlv_dt", MCColumnType.DATE);
		p.columnApplDtl_bill_ym = p.beansFactory.createTableColumn("ApplDtl.bill_ym", MCColumnType.DATE);
		p.columnApplDtl_bill_cl_day = p.beansFactory.createTableColumn("ApplDtl.bill_cl_day", MCColumnType.NUMBER);
		p.columnApplDtl_bill_dt = p.beansFactory.createTableColumn("ApplDtl.bill_dt", MCColumnType.DATE);
		p.columnApplDtl_bill_no = p.beansFactory.createTableColumn("ApplDtl.bill_no", MCColumnType.TEXT);
		p.columnApplDtl_act_no = p.beansFactory.createTableColumn("ApplDtl.act_no", MCColumnType.TEXT);
		p.columnApplDtl_act_seq = p.beansFactory.createTableColumn("ApplDtl.act_seq", MCColumnType.NUMBER);
		p.columnApplDtl_act_rev = p.beansFactory.createTableColumn("ApplDtl.act_rev", MCColumnType.NUMBER);
		p.columnApplDtl_act_d_no = p.beansFactory.createTableColumn("ApplDtl.act_d_no", MCColumnType.TEXT);
		p.columnApplDtl_act_d_seq = p.beansFactory.createTableColumn("ApplDtl.act_d_seq", MCColumnType.NUMBER);
		p.columnApplDtl_trd_unit_cd = p.beansFactory.createTableColumn("ApplDtl.trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnApplDtl_trd_unit_nm = p.beansFactory.createTableColumn("ApplDtl.trd_unit_nm", MCColumnType.TEXT);
		p.columnApplDtl_qty_dec_place = p.beansFactory.createTableColumn("ApplDtl.qty_dec_place", MCColumnType.NUMBER);
		p.columnApplDtl_inc_tax_flg = p.beansFactory.createTableColumn("ApplDtl.inc_tax_flg", MCColumnType.CHECK);
		p.columnApplDtl_tax_cd = p.beansFactory.createTableColumn("ApplDtl.tax_cd", MCColumnType.TEXT_COMBO);
		p.columnApplDtl_tax_nm = p.beansFactory.createTableColumn("ApplDtl.tax_nm", MCColumnType.TEXT);
		p.columnApplDtl_tax_rate = p.beansFactory.createTableColumn("ApplDtl.tax_rate", MCColumnType.NUMBER);
		p.columnApplDtl_cst_cd = p.beansFactory.createTableColumn("ApplDtl.cst_cd", MCColumnType.TEXT_COMBO);
		p.columnApplDtl_cst_nm = p.beansFactory.createTableColumn("ApplDtl.cst_nm", MCColumnType.TEXT);
		p.columnApplDtl_dlv_cd = p.beansFactory.createTableColumn("ApplDtl.dlv_cd", MCColumnType.TEXT_COMBO);
		p.columnApplDtl_dlv_nm = p.beansFactory.createTableColumn("ApplDtl.dlv_nm", MCColumnType.TEXT);
		p.columnApplDtl_dest_cd1 = p.beansFactory.createTableColumn("ApplDtl.dest_cd1", MCColumnType.TEXT_COMBO);
		p.columnApplDtl_dest_nm1 = p.beansFactory.createTableColumn("ApplDtl.dest_nm1", MCColumnType.TEXT);
		p.columnApplDtl_dest_cd2 = p.beansFactory.createTableColumn("ApplDtl.dest_cd2", MCColumnType.TEXT_COMBO);
		p.columnApplDtl_dest_nm2 = p.beansFactory.createTableColumn("ApplDtl.dest_nm2", MCColumnType.TEXT);
		p.columnApplDtl_dest_cd3 = p.beansFactory.createTableColumn("ApplDtl.dest_cd3", MCColumnType.TEXT_COMBO);
		p.columnApplDtl_dest_nm3 = p.beansFactory.createTableColumn("ApplDtl.dest_nm3", MCColumnType.TEXT);
		p.columnApplDtl_sls_usr_cd = p.beansFactory.createTableColumn("ApplDtl.sls_usr_cd", MCColumnType.TEXT_COMBO);
		p.columnApplDtl_sls_usr_nm = p.beansFactory.createTableColumn("ApplDtl.sls_usr_nm", MCColumnType.TEXT);
		p.columnApplDtl_sls_dpt_cd = p.beansFactory.createTableColumn("ApplDtl.sls_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnApplDtl_sls_dpt_nm = p.beansFactory.createTableColumn("ApplDtl.sls_dpt_nm", MCColumnType.TEXT);
		p.columnApplDtl_slo_no = p.beansFactory.createTableColumn("ApplDtl.slo_no", MCColumnType.TEXT);
		p.columnApplDtl_slo_d_no = p.beansFactory.createTableColumn("ApplDtl.slo_d_no", MCColumnType.TEXT);
		p.columnApplDtl_cst_po_no = p.beansFactory.createTableColumn("ApplDtl.cst_po_no", MCColumnType.TEXT);
		p.columnApplDtl_cst_po_d_no = p.beansFactory.createTableColumn("ApplDtl.cst_po_d_no", MCColumnType.TEXT);
		p.columnApplDtl_dlv_slip_no = p.beansFactory.createTableColumn("ApplDtl.dlv_slip_no", MCColumnType.TEXT);
		p.columnApplDtl_dlv_slip_d_no = p.beansFactory.createTableColumn("ApplDtl.dlv_slip_d_no", MCColumnType.TEXT);
		p.columnApplDtl_ship_dlv_slip_no = p.beansFactory.createTableColumn("ApplDtl.ship_dlv_slip_no", MCColumnType.TEXT);
		p.columnApplDtl_ship_dlv_slip_d_no = p.beansFactory.createTableColumn("ApplDtl.ship_dlv_slip_d_no", MCColumnType.TEXT);
		p.columnApplDtl_ship_dlv_slip_multi_flg = p.beansFactory.createTableColumn("ApplDtl.ship_dlv_slip_multi_flg", MCColumnType.CHECK);
		p.columnApplDtl_arsw_ac_ym = p.beansFactory.createTableColumn("ApplDtl.arsw_ac_ym", MCColumnType.DATE);
		p.columnApplDtl_arsw_ac_dt = p.beansFactory.createTableColumn("ApplDtl.arsw_ac_dt", MCColumnType.DATE);
		p.columnApplDtl_arsw_trd_cd = p.beansFactory.createTableColumn("ApplDtl.arsw_trd_cd", MCColumnType.TEXT);
		p.columnApplDtl_arsw_trd_nm = p.beansFactory.createTableColumn("ApplDtl.arsw_trd_nm", MCColumnType.TEXT);
		p.columnApplDtl_arsw_act_no = p.beansFactory.createTableColumn("ApplDtl.arsw_act_no", MCColumnType.TEXT);
		p.columnApplDtl_arsw_act_d_no = p.beansFactory.createTableColumn("ApplDtl.arsw_act_d_no", MCColumnType.TEXT);
		p.columnApplDtl_rcv_act_no = p.beansFactory.createTableColumn("ApplDtl.rcv_act_no", MCColumnType.TEXT);
		p.columnApplDtl_rcv_act_seq = p.beansFactory.createTableColumn("ApplDtl.rcv_act_seq", MCColumnType.NUMBER);
		p.columnApplDtl_rcv_act_d_no = p.beansFactory.createTableColumn("ApplDtl.rcv_act_d_no", MCColumnType.TEXT);
		p.columnApplDtl_rcv_act_d_seq = p.beansFactory.createTableColumn("ApplDtl.rcv_act_d_seq", MCColumnType.NUMBER);
		p.columnApplDtl_bill_d_no = p.beansFactory.createTableColumn("ApplDtl.bill_d_no", MCColumnType.TEXT);
		p.columnApplDtl_parent_bill_d_no = p.beansFactory.createTableColumn("ApplDtl.parent_bill_d_no", MCColumnType.TEXT);
		p.columnApplDtl_bill_mng_no = p.beansFactory.createTableColumn("ApplDtl.bill_mng_no", MCColumnType.TEXT);
		p.columnApplDtl_bill_d_upd_cntr = p.beansFactory.createTableColumn("ApplDtl.bill_d_upd_cntr", MCColumnType.NUMBER);
		p.columnApplDtl_bill_d_appl_bal_upd_cntr = p.beansFactory.createTableColumn("ApplDtl.bill_d_appl_bal_upd_cntr", MCColumnType.NUMBER);
		p.columnApplDtl_rcv_act_upd_cntr = p.beansFactory.createTableColumn("ApplDtl.rcv_act_upd_cntr", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBGP_ArDtlApplReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_upd_appl = p.beansFactory.createButton("Btn.upd_appl", "upd");
		p.Btn_prio_can_red_flg = p.beansFactory.createCheckBox("Btn.prio_can_red_flg");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBGP_ArDtlApplReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.CndPanel);
		p.ScreenOpePanel.setLayoutPosition("NN");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBGP_ArDtlApplReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.HdrTabPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0220.CndR.ope_META);
		p.CndPanel.add(p.Cnd_rcv_act_d_no_Label);
		p.CndPanel.add(p.Cnd_rcv_act_d_no);
		p.CndPanel.setLastBeans(p.Cnd_rcv_act_d_no);
		p.Cnd_rcv_act_d_no.setNextBeans(p.Cnd_ac_dt_fr);
		p.Cnd_rcv_act_d_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0220.CndR.rcv_act_d_no_META);
		p.CndPanel.add(p.Cnd_ac_dt_fr_Label);
		p.CndPanel.add(p.Cnd_ac_dt_fr);
		p.Cnd_ac_dt_fr.setNextBeans(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_fr.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0220.CndR.ac_dt_fr_META);
		p.Cnd_ac_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_to_Label);
		p.CndPanel.add(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_to.setNextBeans(p.Cnd_inc_not_bill_flg);
		p.Cnd_ac_dt_to.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0220.CndR.ac_dt_to_META);
		p.Cnd_ac_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_inc_not_bill_flg);
		p.Cnd_inc_not_bill_flg.setNextBeans(p.Cnd_inc_otr_slo_flg);
		p.Cnd_inc_not_bill_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0220.CndR.inc_not_bill_flg_META);
		p.CndPanel.add(p.Cnd_inc_otr_slo_flg);
		p.Cnd_inc_otr_slo_flg.setNextBeans(p.Cnd_srch);
		p.Cnd_inc_otr_slo_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0220.CndR.inc_otr_slo_flg_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBGP_ArDtlApplReg p) {
		// ブロック関連の初期化
		p.add(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.ApplDtlPanel);
		p.HdrTabPanel.add(p.HdrTabTab);
		p.HdrTabPanel.setLastBeans(p.HdrTabTab);
		p.HdrTabPanel.setLayoutPosition("CT");
		// ブロックの項目の初期化
		p.HdrTabTab.add(p.RcvActDPanel, "HdrTab.tab1");
		p.HdrTabTab.setLastBeans(p.RcvActDPanel);
		p.RcvActDPanel.setNextBeans(p.SysPanel);
		p.HdrTabTab.add(p.SysPanel, "HdrTab.tab2");
	}

	/**
	 * [RcvActD]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRcvActD(MSBGP_ArDtlApplReg p) {
		// ブロック関連の初期化
		p.RcvActDPanel.setNextBeans(p.SysPanel);
		// ブロックの項目の初期化
		p.RcvActDPanel.add(p.RcvActD_rcv_dt_Label);
		p.RcvActDPanel.add(p.RcvActD_rcv_dt);
		p.RcvActDPanel.setLastBeans(p.RcvActD_rcv_dt);
		p.RcvActD_rcv_dt.setNextBeans(p.RcvActD_ac_ym);
		p.RcvActD_rcv_dt.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.rcv_dt_META);
		p.RcvActD_rcv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RcvActDPanel.add(p.RcvActD_ac_ym_Label);
		p.RcvActDPanel.add(p.RcvActD_ac_ym);
		p.RcvActD_ac_ym.setNextBeans(p.RcvActD_ac_dt);
		p.RcvActD_ac_ym.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.ac_ym_META);
		p.RcvActD_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RcvActDPanel.add(p.RcvActD_ac_dt_Label);
		p.RcvActDPanel.add(p.RcvActD_ac_dt);
		p.RcvActD_ac_dt.setNextBeans(p.RcvActD_trd_cd);
		p.RcvActD_ac_dt.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.ac_dt_META);
		p.RcvActD_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RcvActDPanel.add(p.RcvActD_trd_cd_Label);
		p.RcvActDPanel.add(p.RcvActD_trd_cd);
		p.RcvActD_trd_cd.setNextBeans(p.RcvActD_trd_nm);
		p.RcvActD_trd_cd.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.trd_cd_META);
		p.RcvActDPanel.add(p.RcvActD_trd_nm);
		p.RcvActD_trd_nm.setNextBeans(p.RcvActD_slo_no);
		p.RcvActD_trd_nm.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.trd_nm_META);
		p.RcvActDPanel.add(p.RcvActD_slo_no_Label);
		p.RcvActDPanel.add(p.RcvActD_slo_no);
		p.RcvActD_slo_no.setNextBeans(p.RcvActD_iv_no);
		p.RcvActD_slo_no.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.slo_no_META);
		p.RcvActDPanel.add(p.RcvActD_iv_no_Label);
		p.RcvActDPanel.add(p.RcvActD_iv_no);
		p.RcvActD_iv_no.setNextBeans(p.RcvActD_rcv_mtd_cd);
		p.RcvActD_iv_no.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.iv_no_META);
		p.RcvActDPanel.add(p.RcvActD_rcv_mtd_cd_Label);
		p.RcvActDPanel.add(p.RcvActD_rcv_mtd_cd);
		p.RcvActD_rcv_mtd_cd.setNextBeans(p.RcvActD_rcv_mtd_nm);
		p.RcvActD_rcv_mtd_cd.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.rcv_mtd_cd_META);
		p.RcvActDPanel.add(p.RcvActD_rcv_mtd_nm);
		p.RcvActD_rcv_mtd_nm.setNextBeans(p.RcvActD_rcst_cd);
		p.RcvActD_rcv_mtd_nm.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.rcv_mtd_nm_META);
		p.RcvActDPanel.add(p.RcvActD_rcst_cd_Label);
		p.RcvActDPanel.add(p.RcvActD_rcst_cd);
		p.RcvActD_rcst_cd.setNextBeans(p.RcvActD_rcst_nm);
		p.RcvActD_rcst_cd.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.rcst_cd_META);
		p.RcvActDPanel.add(p.RcvActD_rcst_nm);
		p.RcvActD_rcst_nm.setNextBeans(p.RcvActD_bcst_cd);
		p.RcvActD_rcst_nm.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.rcst_nm_META);
		p.RcvActDPanel.add(p.RcvActD_bcst_cd_Label);
		p.RcvActDPanel.add(p.RcvActD_bcst_cd);
		p.RcvActD_bcst_cd.setNextBeans(p.RcvActD_bcst_nm);
		p.RcvActD_bcst_cd.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.bcst_cd_META);
		p.RcvActDPanel.add(p.RcvActD_bcst_nm);
		p.RcvActD_bcst_nm.setNextBeans(p.RcvActD_bill_dpt_cd);
		p.RcvActD_bcst_nm.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.bcst_nm_META);
		p.RcvActDPanel.add(p.RcvActD_bill_dpt_cd_Label);
		p.RcvActDPanel.add(p.RcvActD_bill_dpt_cd);
		p.RcvActD_bill_dpt_cd.setNextBeans(p.RcvActD_bill_dpt_nm);
		p.RcvActD_bill_dpt_cd.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.bill_dpt_cd_META);
		p.RcvActDPanel.add(p.RcvActD_bill_dpt_nm);
		p.RcvActD_bill_dpt_nm.setNextBeans(p.RcvActD_acst_cd);
		p.RcvActD_bill_dpt_nm.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.bill_dpt_nm_META);
		p.RcvActDPanel.add(p.RcvActD_acst_cd_Label);
		p.RcvActDPanel.add(p.RcvActD_acst_cd);
		p.RcvActD_acst_cd.setNextBeans(p.RcvActD_acst_nm);
		p.RcvActD_acst_cd.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.acst_cd_META);
		p.RcvActDPanel.add(p.RcvActD_acst_nm);
		p.RcvActD_acst_nm.setNextBeans(p.RcvActD_ar_dpt_cd);
		p.RcvActD_acst_nm.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.acst_nm_META);
		p.RcvActDPanel.add(p.RcvActD_ar_dpt_cd_Label);
		p.RcvActDPanel.add(p.RcvActD_ar_dpt_cd);
		p.RcvActD_ar_dpt_cd.setNextBeans(p.RcvActD_ar_dpt_nm);
		p.RcvActD_ar_dpt_cd.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.ar_dpt_cd_META);
		p.RcvActDPanel.add(p.RcvActD_ar_dpt_nm);
		p.RcvActD_ar_dpt_nm.setNextBeans(p.RcvActD_wg_cd);
		p.RcvActD_ar_dpt_nm.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.ar_dpt_nm_META);
		p.RcvActDPanel.add(p.RcvActD_wg_cd_Label);
		p.RcvActDPanel.add(p.RcvActD_wg_cd);
		p.RcvActD_wg_cd.setNextBeans(p.RcvActD_wg_nm);
		p.RcvActD_wg_cd.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.wg_cd_META);
		p.RcvActDPanel.add(p.RcvActD_wg_nm);
		p.RcvActD_wg_nm.setNextBeans(p.RcvActD_wrk_no);
		p.RcvActD_wg_nm.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.wg_nm_META);
		p.RcvActDPanel.add(p.RcvActD_wrk_no_Label);
		p.RcvActDPanel.add(p.RcvActD_wrk_no);
		p.RcvActD_wrk_no.setNextBeans(p.RcvActD_wrk_nm);
		p.RcvActD_wrk_no.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.wrk_no_META);
		p.RcvActDPanel.add(p.RcvActD_wrk_nm);
		p.RcvActD_wrk_nm.setNextBeans(p.RcvActD_ar_typ);
		p.RcvActD_wrk_nm.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.wrk_nm_META);
		p.RcvActDPanel.add(p.RcvActD_ar_typ_Label);
		p.RcvActDPanel.add(p.RcvActD_ar_typ);
		p.RcvActD_ar_typ.setNextBeans(p.RcvActD_ar_typ_nm);
		p.RcvActD_ar_typ.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.ar_typ_META);
		p.RcvActDPanel.add(p.RcvActD_ar_typ_nm);
		p.RcvActD_ar_typ_nm.setNextBeans(p.RcvActD_trd_cur_cd);
		p.RcvActD_ar_typ_nm.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.ar_typ_nm_META);
		p.RcvActDPanel.add(p.RcvActD_trd_cur_cd_Label);
		p.RcvActDPanel.add(p.RcvActD_trd_cur_cd);
		p.RcvActD_trd_cur_cd.setNextBeans(p.RcvActD_trd_cur_nm);
		p.RcvActD_trd_cur_cd.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.trd_cur_cd_META);
		p.RcvActDPanel.add(p.RcvActD_trd_cur_nm);
		p.RcvActD_trd_cur_nm.setNextBeans(p.RcvActD_amt_dec_place);
		p.RcvActD_trd_cur_nm.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.trd_cur_nm_META);
		p.RcvActDPanel.add(p.RcvActD_amt_dec_place);
		p.RcvActD_amt_dec_place.setNextBeans(p.RcvActD_upri_dec_place);
		p.RcvActD_amt_dec_place.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.amt_dec_place_META);
		p.RcvActDPanel.add(p.RcvActD_upri_dec_place);
		p.RcvActD_upri_dec_place.setNextBeans(p.RcvActD_appl_tgt_amt_p_PPanel);
		p.RcvActD_upri_dec_place.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.upri_dec_place_META);
		p.RcvActDPanel.add(p.RcvActD_appl_tgt_amt_p_PPanel);
		p.RcvActD_appl_tgt_amt_p_PPanel.setNextBeans(p.RcvActD_ttl_appl_amt_p_PPanel);
		p.RcvActDPanel.add(p.RcvActD_ttl_appl_amt_p_PPanel);
		p.RcvActD_ttl_appl_amt_p_PPanel.setNextBeans(p.RcvActD_not_appl_amt_p_PPanel);
		p.RcvActDPanel.add(p.RcvActD_not_appl_amt_p_PPanel);
		p.SysPanel.add(p.RcvActD_ins_usr_id_Label);
		p.SysPanel.add(p.RcvActD_ins_usr_id);
		p.SysPanel.setLastBeans(p.RcvActD_ins_usr_id);
		p.RcvActD_ins_usr_id.setNextBeans(p.RcvActD_ins_usr_nm);
		p.RcvActD_ins_usr_id.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.ins_usr_id_META);
		p.SysPanel.add(p.RcvActD_ins_usr_nm);
		p.RcvActD_ins_usr_nm.setNextBeans(p.RcvActD_ins_func_id);
		p.RcvActD_ins_usr_nm.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.ins_usr_nm_META);
		p.SysPanel.add(p.RcvActD_ins_func_id_Label);
		p.SysPanel.add(p.RcvActD_ins_func_id);
		p.RcvActD_ins_func_id.setNextBeans(p.RcvActD_ins_func_nm);
		p.RcvActD_ins_func_id.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.ins_func_id_META);
		p.SysPanel.add(p.RcvActD_ins_func_nm);
		p.RcvActD_ins_func_nm.setNextBeans(p.RcvActD_upd_usr_id);
		p.RcvActD_ins_func_nm.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.ins_func_nm_META);
		p.SysPanel.add(p.RcvActD_upd_usr_id_Label);
		p.SysPanel.add(p.RcvActD_upd_usr_id);
		p.RcvActD_upd_usr_id.setNextBeans(p.RcvActD_upd_usr_nm);
		p.RcvActD_upd_usr_id.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.upd_usr_id_META);
		p.SysPanel.add(p.RcvActD_upd_usr_nm);
		p.RcvActD_upd_usr_nm.setNextBeans(p.RcvActD_upd_func_id);
		p.RcvActD_upd_usr_nm.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.upd_usr_nm_META);
		p.SysPanel.add(p.RcvActD_upd_func_id_Label);
		p.SysPanel.add(p.RcvActD_upd_func_id);
		p.RcvActD_upd_func_id.setNextBeans(p.RcvActD_upd_func_nm);
		p.RcvActD_upd_func_id.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.upd_func_id_META);
		p.SysPanel.add(p.RcvActD_upd_func_nm);
		p.RcvActD_upd_func_nm.setNextBeans(p.RcvActD_ins_ts);
		p.RcvActD_upd_func_nm.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.upd_func_nm_META);
		p.SysPanel.add(p.RcvActD_ins_ts_Label);
		p.SysPanel.add(p.RcvActD_ins_ts);
		p.RcvActD_ins_ts.setNextBeans(p.RcvActD_upd_ts);
		p.RcvActD_ins_ts.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.ins_ts_META);
		p.RcvActD_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.SysPanel.add(p.RcvActD_upd_ts_Label);
		p.SysPanel.add(p.RcvActD_upd_ts);
		p.RcvActD_upd_ts.setNextBeans(p.RcvActD_upd_srv_req_no);
		p.RcvActD_upd_ts.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.upd_ts_META);
		p.RcvActD_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.SysPanel.add(p.RcvActD_upd_srv_req_no_Label);
		p.SysPanel.add(p.RcvActD_upd_srv_req_no);
		p.RcvActD_upd_srv_req_no.setRow(p.getRcvActDR(), mcframe.clientMSBG.MSBGP0220.RcvActDR.upd_srv_req_no_META);
	}

	/**
	 * [Sys]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSys(MSBGP_ArDtlApplReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [ApplDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitApplDtl(MSBGP_ArDtlApplReg p) {
		// ブロック関連の初期化
		p.add(p.ApplDtlPanel);
		p.ApplDtlPanel.setNextBeans(p.BtnPanel);
		p.ApplDtlPanel.add(p.ApplDtlScrollPane);
		p.ApplDtlPanel.setLastBeans(p.ApplDtlTable);
		p.ApplDtlScrollPane.setViewportView(p.ApplDtlTable);
		p.ApplDtlTable.setList(p.getApplDtlL());
		p.ApplDtlPanel.setLayoutPosition("CB");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBGP_ArDtlApplReg p) {
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
		p.Btn_deselect_all.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_upd.setNextBeans(p.Btn_upd_appl);
		p.Btn_upd_appl.setIcon("REGISTER");
		p.Btn_upd_appl.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_appl);
		p.Btn_upd_appl.setNextBeans(p.Btn_prio_can_red_flg);
		p.BtnPanel.add(p.Btn_prio_can_red_flg);
		p.Btn_prio_can_red_flg.setRow(p.getBtnR(), mcframe.clientMSBG.MSBGP0220.BtnR.prio_can_red_flg_META);
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
		MSBGP_ArDtlApplReg_MC.mcInitScreenOpe((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.mcInitCnd((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.mcInitHdrTab((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.mcInitRcvActD((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.mcInitSys((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.mcInitApplDtl((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.mcInitBtn((MSBGP_ArDtlApplReg)this);

		// [SRCH]ステータスのモードの設定
		MSBGP_ArDtlApplReg_MC.statusInitSRCH_ScreenOpe((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitSRCH_Cnd((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitSRCH_HdrTab((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitSRCH_RcvActD((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitSRCH_Sys((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitSRCH_ApplDtl((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitSRCH_Btn((MSBGP_ArDtlApplReg)this);

		// [SRCH_APPL]ステータスのモードの設定
		MSBGP_ArDtlApplReg_MC.statusInitSRCH__APPL_ScreenOpe((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitSRCH__APPL_Cnd((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitSRCH__APPL_HdrTab((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitSRCH__APPL_RcvActD((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitSRCH__APPL_Sys((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitSRCH__APPL_ApplDtl((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitSRCH__APPL_Btn((MSBGP_ArDtlApplReg)this);

		// [UPD]ステータスのモードの設定
		MSBGP_ArDtlApplReg_MC.statusInitUPD_ScreenOpe((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitUPD_Cnd((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitUPD_HdrTab((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitUPD_RcvActD((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitUPD_Sys((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitUPD_ApplDtl((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitUPD_Btn((MSBGP_ArDtlApplReg)this);

		// [UPD_APPL]ステータスのモードの設定
		MSBGP_ArDtlApplReg_MC.statusInitUPD__APPL_ScreenOpe((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitUPD__APPL_Cnd((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitUPD__APPL_HdrTab((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitUPD__APPL_RcvActD((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitUPD__APPL_Sys((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitUPD__APPL_ApplDtl((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitUPD__APPL_Btn((MSBGP_ArDtlApplReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBGP_ArDtlApplReg_MC.statusInitFIX__U_ScreenOpe((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitFIX__U_Cnd((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitFIX__U_HdrTab((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitFIX__U_RcvActD((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitFIX__U_Sys((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitFIX__U_ApplDtl((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitFIX__U_Btn((MSBGP_ArDtlApplReg)this);

		// [REF]ステータスのモードの設定
		MSBGP_ArDtlApplReg_MC.statusInitREF_ScreenOpe((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitREF_Cnd((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitREF_HdrTab((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitREF_RcvActD((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitREF_Sys((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitREF_ApplDtl((MSBGP_ArDtlApplReg)this);
		MSBGP_ArDtlApplReg_MC.statusInitREF_Btn((MSBGP_ArDtlApplReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBGP_ArDtlApplReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBGP_ArDtlApplReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_rcv_act_d_no.setListListener(p);
		p.Cnd_rcv_act_d_no.addAllListener(p);
		p.Cnd_ac_dt_fr.setListListener(p);
		p.Cnd_ac_dt_fr.addAllListener(p);
		p.Cnd_ac_dt_to.setListListener(p);
		p.Cnd_ac_dt_to.addAllListener(p);
		p.Cnd_inc_not_bill_flg.addAllListener(p);
		p.Cnd_inc_otr_slo_flg.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBGP_ArDtlApplReg p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [RcvActD]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRcvActD(MSBGP_ArDtlApplReg p) {
		p.RcvActD_rcv_dt.setListListener(p);
		p.RcvActD_rcv_dt.addAllListener(p);
		p.RcvActD_ac_ym.setListListener(p);
		p.RcvActD_ac_ym.addAllListener(p);
		p.RcvActD_ac_dt.setListListener(p);
		p.RcvActD_ac_dt.addAllListener(p);
		p.RcvActD_trd_cd.setListListener(p);
		p.RcvActD_trd_cd.addAllListener(p);
		p.RcvActD_trd_nm.setListListener(p);
		p.RcvActD_trd_nm.addAllListener(p);
		p.RcvActD_slo_no.setListListener(p);
		p.RcvActD_slo_no.addAllListener(p);
		p.RcvActD_iv_no.setListListener(p);
		p.RcvActD_iv_no.addAllListener(p);
		p.RcvActD_rcv_mtd_cd.setListListener(p);
		p.RcvActD_rcv_mtd_cd.addAllListener(p);
		p.RcvActD_rcv_mtd_nm.setListListener(p);
		p.RcvActD_rcv_mtd_nm.addAllListener(p);
		p.RcvActD_rcst_cd.setListListener(p);
		p.RcvActD_rcst_cd.addAllListener(p);
		p.RcvActD_rcst_nm.setListListener(p);
		p.RcvActD_rcst_nm.addAllListener(p);
		p.RcvActD_bcst_cd.setListListener(p);
		p.RcvActD_bcst_cd.addAllListener(p);
		p.RcvActD_bcst_nm.setListListener(p);
		p.RcvActD_bcst_nm.addAllListener(p);
		p.RcvActD_bill_dpt_cd.setListListener(p);
		p.RcvActD_bill_dpt_cd.addAllListener(p);
		p.RcvActD_bill_dpt_nm.setListListener(p);
		p.RcvActD_bill_dpt_nm.addAllListener(p);
		p.RcvActD_acst_cd.setListListener(p);
		p.RcvActD_acst_cd.addAllListener(p);
		p.RcvActD_acst_nm.setListListener(p);
		p.RcvActD_acst_nm.addAllListener(p);
		p.RcvActD_ar_dpt_cd.setListListener(p);
		p.RcvActD_ar_dpt_cd.addAllListener(p);
		p.RcvActD_ar_dpt_nm.setListListener(p);
		p.RcvActD_ar_dpt_nm.addAllListener(p);
		p.RcvActD_wg_cd.setListListener(p);
		p.RcvActD_wg_cd.addAllListener(p);
		p.RcvActD_wg_nm.setListListener(p);
		p.RcvActD_wg_nm.addAllListener(p);
		p.RcvActD_wrk_no.setListListener(p);
		p.RcvActD_wrk_no.addAllListener(p);
		p.RcvActD_wrk_nm.setListListener(p);
		p.RcvActD_wrk_nm.addAllListener(p);
		p.RcvActD_ar_typ.setListListener(p);
		p.RcvActD_ar_typ.addAllListener(p);
		p.RcvActD_ar_typ_nm.setListListener(p);
		p.RcvActD_ar_typ_nm.addAllListener(p);
		p.RcvActD_trd_cur_cd.setListListener(p);
		p.RcvActD_trd_cur_cd.addAllListener(p);
		p.RcvActD_trd_cur_nm.setListListener(p);
		p.RcvActD_trd_cur_nm.addAllListener(p);
		p.RcvActD_amt_dec_place.setListListener(p);
		p.RcvActD_amt_dec_place.addAllListener(p);
		p.RcvActD_upri_dec_place.setListListener(p);
		p.RcvActD_upri_dec_place.addAllListener(p);
		p.RcvActD_ins_usr_id.setListListener(p);
		p.RcvActD_ins_usr_id.addAllListener(p);
		p.RcvActD_ins_usr_nm.setListListener(p);
		p.RcvActD_ins_usr_nm.addAllListener(p);
		p.RcvActD_ins_func_id.setListListener(p);
		p.RcvActD_ins_func_id.addAllListener(p);
		p.RcvActD_ins_func_nm.setListListener(p);
		p.RcvActD_ins_func_nm.addAllListener(p);
		p.RcvActD_upd_usr_id.setListListener(p);
		p.RcvActD_upd_usr_id.addAllListener(p);
		p.RcvActD_upd_usr_nm.setListListener(p);
		p.RcvActD_upd_usr_nm.addAllListener(p);
		p.RcvActD_upd_func_id.setListListener(p);
		p.RcvActD_upd_func_id.addAllListener(p);
		p.RcvActD_upd_func_nm.setListListener(p);
		p.RcvActD_upd_func_nm.addAllListener(p);
		p.RcvActD_ins_ts.setListListener(p);
		p.RcvActD_ins_ts.addAllListener(p);
		p.RcvActD_upd_ts.setListListener(p);
		p.RcvActD_upd_ts.addAllListener(p);
		p.RcvActD_upd_srv_req_no.setListListener(p);
		p.RcvActD_upd_srv_req_no.addAllListener(p);
	}

	/**
	 *  [Sys]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSys(MSBGP_ArDtlApplReg p) {
	}

	/**
	 *  [ApplDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitApplDtl(MSBGP_ArDtlApplReg p) {
		p.ApplDtlTable.addAllListener(p);
		p.columnApplDtl_check.addAllListener(p);
		p.columnApplDtl_ac_ym.addAllListener(p);
		p.columnApplDtl_ac_ym.setListListener(p);
		p.columnApplDtl_ac_dt.addAllListener(p);
		p.columnApplDtl_ac_dt.setListListener(p);
		p.columnApplDtl_slip_sts_typ_nm.addAllListener(p);
		p.columnApplDtl_slip_sts_typ_nm.setListListener(p);
		p.columnApplDtl_trd_cd.addAllListener(p);
		p.columnApplDtl_trd_cd.setListListener(p);
		p.columnApplDtl_trd_nm.addAllListener(p);
		p.columnApplDtl_trd_nm.setListListener(p);
		p.columnApplDtl_ar_typ.addAllListener(p);
		p.columnApplDtl_ar_typ.setListListener(p);
		p.columnApplDtl_ar_typ_nm.addAllListener(p);
		p.columnApplDtl_ar_typ_nm.setListListener(p);
		p.columnApplDtl_dlv_dt.addAllListener(p);
		p.columnApplDtl_dlv_dt.setListListener(p);
		p.columnApplDtl_bill_ym.addAllListener(p);
		p.columnApplDtl_bill_ym.setListListener(p);
		p.columnApplDtl_bill_cl_day.addAllListener(p);
		p.columnApplDtl_bill_cl_day.setListListener(p);
		p.columnApplDtl_bill_dt.addAllListener(p);
		p.columnApplDtl_bill_dt.setListListener(p);
		p.columnApplDtl_bill_no.addAllListener(p);
		p.columnApplDtl_bill_no.setListListener(p);
		p.columnApplDtl_act_no.addAllListener(p);
		p.columnApplDtl_act_no.setListListener(p);
		p.columnApplDtl_act_seq.addAllListener(p);
		p.columnApplDtl_act_seq.setListListener(p);
		p.columnApplDtl_act_rev.addAllListener(p);
		p.columnApplDtl_act_rev.setListListener(p);
		p.columnApplDtl_act_d_no.addAllListener(p);
		p.columnApplDtl_act_d_no.setListListener(p);
		p.columnApplDtl_act_d_seq.addAllListener(p);
		p.columnApplDtl_act_d_seq.setListListener(p);
		p.columnApplDtl_trd_unit_cd.addAllListener(p);
		p.columnApplDtl_trd_unit_cd.setListListener(p);
		p.columnApplDtl_trd_unit_nm.addAllListener(p);
		p.columnApplDtl_trd_unit_nm.setListListener(p);
		p.columnApplDtl_qty_dec_place.addAllListener(p);
		p.columnApplDtl_qty_dec_place.setListListener(p);
		p.columnApplDtl_inc_tax_flg.addAllListener(p);
		p.columnApplDtl_tax_cd.addAllListener(p);
		p.columnApplDtl_tax_cd.setListListener(p);
		p.columnApplDtl_tax_nm.addAllListener(p);
		p.columnApplDtl_tax_nm.setListListener(p);
		p.columnApplDtl_tax_rate.addAllListener(p);
		p.columnApplDtl_tax_rate.setListListener(p);
		p.columnApplDtl_cst_cd.addAllListener(p);
		p.columnApplDtl_cst_cd.setListListener(p);
		p.columnApplDtl_cst_nm.addAllListener(p);
		p.columnApplDtl_cst_nm.setListListener(p);
		p.columnApplDtl_dlv_cd.addAllListener(p);
		p.columnApplDtl_dlv_cd.setListListener(p);
		p.columnApplDtl_dlv_nm.addAllListener(p);
		p.columnApplDtl_dlv_nm.setListListener(p);
		p.columnApplDtl_dest_cd1.addAllListener(p);
		p.columnApplDtl_dest_cd1.setListListener(p);
		p.columnApplDtl_dest_nm1.addAllListener(p);
		p.columnApplDtl_dest_nm1.setListListener(p);
		p.columnApplDtl_dest_cd2.addAllListener(p);
		p.columnApplDtl_dest_cd2.setListListener(p);
		p.columnApplDtl_dest_nm2.addAllListener(p);
		p.columnApplDtl_dest_nm2.setListListener(p);
		p.columnApplDtl_dest_cd3.addAllListener(p);
		p.columnApplDtl_dest_cd3.setListListener(p);
		p.columnApplDtl_dest_nm3.addAllListener(p);
		p.columnApplDtl_dest_nm3.setListListener(p);
		p.columnApplDtl_sls_usr_cd.addAllListener(p);
		p.columnApplDtl_sls_usr_cd.setListListener(p);
		p.columnApplDtl_sls_usr_nm.addAllListener(p);
		p.columnApplDtl_sls_usr_nm.setListListener(p);
		p.columnApplDtl_sls_dpt_cd.addAllListener(p);
		p.columnApplDtl_sls_dpt_cd.setListListener(p);
		p.columnApplDtl_sls_dpt_nm.addAllListener(p);
		p.columnApplDtl_sls_dpt_nm.setListListener(p);
		p.columnApplDtl_slo_no.addAllListener(p);
		p.columnApplDtl_slo_no.setListListener(p);
		p.columnApplDtl_slo_d_no.addAllListener(p);
		p.columnApplDtl_slo_d_no.setListListener(p);
		p.columnApplDtl_cst_po_no.addAllListener(p);
		p.columnApplDtl_cst_po_no.setListListener(p);
		p.columnApplDtl_cst_po_d_no.addAllListener(p);
		p.columnApplDtl_cst_po_d_no.setListListener(p);
		p.columnApplDtl_dlv_slip_no.addAllListener(p);
		p.columnApplDtl_dlv_slip_no.setListListener(p);
		p.columnApplDtl_dlv_slip_d_no.addAllListener(p);
		p.columnApplDtl_dlv_slip_d_no.setListListener(p);
		p.columnApplDtl_ship_dlv_slip_no.addAllListener(p);
		p.columnApplDtl_ship_dlv_slip_no.setListListener(p);
		p.columnApplDtl_ship_dlv_slip_d_no.addAllListener(p);
		p.columnApplDtl_ship_dlv_slip_d_no.setListListener(p);
		p.columnApplDtl_ship_dlv_slip_multi_flg.addAllListener(p);
		p.columnApplDtl_arsw_ac_ym.addAllListener(p);
		p.columnApplDtl_arsw_ac_ym.setListListener(p);
		p.columnApplDtl_arsw_ac_dt.addAllListener(p);
		p.columnApplDtl_arsw_ac_dt.setListListener(p);
		p.columnApplDtl_arsw_trd_cd.addAllListener(p);
		p.columnApplDtl_arsw_trd_cd.setListListener(p);
		p.columnApplDtl_arsw_trd_nm.addAllListener(p);
		p.columnApplDtl_arsw_trd_nm.setListListener(p);
		p.columnApplDtl_arsw_act_no.addAllListener(p);
		p.columnApplDtl_arsw_act_no.setListListener(p);
		p.columnApplDtl_arsw_act_d_no.addAllListener(p);
		p.columnApplDtl_arsw_act_d_no.setListListener(p);
		p.columnApplDtl_rcv_act_no.addAllListener(p);
		p.columnApplDtl_rcv_act_no.setListListener(p);
		p.columnApplDtl_rcv_act_seq.addAllListener(p);
		p.columnApplDtl_rcv_act_seq.setListListener(p);
		p.columnApplDtl_rcv_act_d_no.addAllListener(p);
		p.columnApplDtl_rcv_act_d_no.setListListener(p);
		p.columnApplDtl_rcv_act_d_seq.addAllListener(p);
		p.columnApplDtl_rcv_act_d_seq.setListListener(p);
		p.columnApplDtl_bill_d_no.addAllListener(p);
		p.columnApplDtl_bill_d_no.setListListener(p);
		p.columnApplDtl_parent_bill_d_no.addAllListener(p);
		p.columnApplDtl_parent_bill_d_no.setListListener(p);
		p.columnApplDtl_bill_mng_no.addAllListener(p);
		p.columnApplDtl_bill_mng_no.setListListener(p);
		p.columnApplDtl_bill_d_upd_cntr.addAllListener(p);
		p.columnApplDtl_bill_d_upd_cntr.setListListener(p);
		p.columnApplDtl_bill_d_appl_bal_upd_cntr.addAllListener(p);
		p.columnApplDtl_bill_d_appl_bal_upd_cntr.setListListener(p);
		p.columnApplDtl_rcv_act_upd_cntr.addAllListener(p);
		p.columnApplDtl_rcv_act_upd_cntr.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBGP_ArDtlApplReg p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_upd_appl.addAllListener(p);
		p.Btn_upd_appl.setAPMethodName("doBtn_upd_appl");
		p.Btn_prio_can_red_flg.addAllListener(p);
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBGP_ArDtlApplReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBGP_ArDtlApplReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_rcv_act_d_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ac_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_inc_not_bill_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_inc_otr_slo_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBGP_ArDtlApplReg p){

	}

	/**
	 * [SRCH]ステータスの[RcvActD]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RcvActD(MSBGP_ArDtlApplReg p){
		p.RcvActD_rcv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_rcv_mtd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_rcv_mtd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_rcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_rcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_bcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_bcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_bill_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_bill_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_acst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_acst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_ar_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_ar_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_wrk_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_wrk_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_ar_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_ar_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.RcvActD_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.RcvActD_appl_tgt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.RcvActD_ttl_appl_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.RcvActD_not_appl_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.RcvActD_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RcvActD_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Sys(MSBGP_ArDtlApplReg p){

	}

	/**
	 * [SRCH]ステータスの[ApplDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ApplDtl(MSBGP_ArDtlApplReg p){
		p.columnApplDtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_slip_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ApplDtl_appl_tgt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.ApplDtl_ttl_appl_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.ApplDtl_appl_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.ApplDtl_not_appl_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnApplDtl_ar_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_ar_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_bill_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_bill_cl_day.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_bill_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_bill_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_act_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnApplDtl_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_act_d_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.ApplDtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.ApplDtl_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnApplDtl_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_qty_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.ApplDtl_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnApplDtl_inc_tax_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.ApplDtl_trd_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.ApplDtl_trd_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnApplDtl_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_tax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ApplDtl_trd_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.ApplDtl_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnApplDtl_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_dest_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_dest_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_dest_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_dest_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_dest_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_dest_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_sls_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_sls_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_sls_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_sls_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_slo_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_cst_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_cst_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_slip_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_ship_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_ship_dlv_slip_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_ship_dlv_slip_multi_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnApplDtl_rcv_act_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnApplDtl_rcv_act_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnApplDtl_rcv_act_d_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnApplDtl_rcv_act_d_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnApplDtl_bill_d_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnApplDtl_parent_bill_d_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnApplDtl_bill_mng_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnApplDtl_bill_d_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnApplDtl_bill_d_appl_bal_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnApplDtl_rcv_act_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBGP_ArDtlApplReg p){
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_appl.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_prio_can_red_flg.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_APPL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__APPL_ScreenOpe(MSBGP_ArDtlApplReg p){

	}

	/**
	 * [SRCH_APPL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__APPL_Cnd(MSBGP_ArDtlApplReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_APPL, MCMode.REQUIRED);
		p.Cnd_rcv_act_d_no.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_APPL, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_APPL, MCMode.ENABLE);
		p.Cnd_inc_not_bill_flg.putMode(p, SRCH_APPL, MCMode.REQUIRED);
		p.Cnd_inc_otr_slo_flg.putMode(p, SRCH_APPL, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, SRCH_APPL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_APPL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__APPL_HdrTab(MSBGP_ArDtlApplReg p){

	}

	/**
	 * [SRCH_APPL]ステータスの[RcvActD]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__APPL_RcvActD(MSBGP_ArDtlApplReg p){
		p.RcvActD_rcv_dt.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_ac_ym.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_ac_dt.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_trd_cd.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_trd_nm.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_slo_no.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_iv_no.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_rcv_mtd_cd.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_rcv_mtd_nm.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_rcst_cd.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_rcst_nm.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_bcst_cd.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_bcst_nm.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_bill_dpt_cd.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_bill_dpt_nm.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_acst_cd.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_acst_nm.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_ar_dpt_cd.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_ar_dpt_nm.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_wg_cd.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_wg_nm.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_wrk_no.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_wrk_nm.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_ar_typ.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_ar_typ_nm.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_trd_cur_cd.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_trd_cur_nm.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_amt_dec_place.putMode(p, SRCH_APPL, MCMode.INVISIBLE);
		p.RcvActD_upri_dec_place.putMode(p, SRCH_APPL, MCMode.INVISIBLE);
		p.RcvActD_appl_tgt_amt_p_PPanel.putStatus(SRCH_APPL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.RcvActD_ttl_appl_amt_p_PPanel.putStatus(SRCH_APPL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.RcvActD_not_appl_amt_p_PPanel.putStatus(SRCH_APPL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.RcvActD_ins_usr_id.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_ins_usr_nm.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_ins_func_id.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_ins_func_nm.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_upd_usr_id.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_upd_usr_nm.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_upd_func_id.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_upd_func_nm.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_ins_ts.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_upd_ts.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.RcvActD_upd_srv_req_no.putMode(p, SRCH_APPL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_APPL]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__APPL_Sys(MSBGP_ArDtlApplReg p){

	}

	/**
	 * [SRCH_APPL]ステータスの[ApplDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__APPL_ApplDtl(MSBGP_ArDtlApplReg p){
		p.columnApplDtl_check.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_ac_ym.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_ac_dt.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_slip_sts_typ_nm.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_trd_cd.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_trd_nm.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.ApplDtl_appl_tgt_amt_p_PPanel.putStatus(SRCH_APPL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.ApplDtl_ttl_appl_amt_p_PPanel.putStatus(SRCH_APPL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.ApplDtl_appl_amt_p_PPanel.putStatus(SRCH_APPL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.ApplDtl_not_appl_amt_p_PPanel.putStatus(SRCH_APPL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnApplDtl_ar_typ.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_ar_typ_nm.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_dt.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_bill_ym.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_bill_cl_day.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_bill_dt.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_bill_no.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_act_no.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_act_seq.putMode(p, SRCH_APPL, MCMode.INVISIBLE);
		p.columnApplDtl_act_rev.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_act_d_no.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_act_d_seq.putMode(p, SRCH_APPL, MCMode.INVISIBLE);
		p.ApplDtl_itm_p_PPanel.putStatus(SRCH_APPL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.ApplDtl_sno_wrk_no_p_PPanel.putStatus(SRCH_APPL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnApplDtl_trd_unit_cd.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_trd_unit_nm.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_qty_dec_place.putMode(p, SRCH_APPL, MCMode.INVISIBLE);
		p.ApplDtl_trd_unit_qty_p_PPanel.putStatus(SRCH_APPL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnApplDtl_inc_tax_flg.putMode(p, SRCH_APPL, MCMode.INVISIBLE);
		p.ApplDtl_trd_cur_upri_p_PPanel.putStatus(SRCH_APPL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.ApplDtl_trd_cur_amt_p_PPanel.putStatus(SRCH_APPL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnApplDtl_tax_cd.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_tax_nm.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_tax_rate.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.ApplDtl_trd_cur_tax_amt_p_PPanel.putStatus(SRCH_APPL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.ApplDtl_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH_APPL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnApplDtl_cst_cd.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_cst_nm.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_cd.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_nm.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_dest_cd1.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_dest_nm1.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_dest_cd2.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_dest_nm2.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_dest_cd3.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_dest_nm3.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_sls_usr_cd.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_sls_usr_nm.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_sls_dpt_cd.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_sls_dpt_nm.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_slo_no.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_slo_d_no.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_cst_po_no.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_cst_po_d_no.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_slip_no.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_slip_d_no.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_ship_dlv_slip_no.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_ship_dlv_slip_d_no.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_ship_dlv_slip_multi_flg.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_ac_ym.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_ac_dt.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_trd_cd.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_trd_nm.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_act_no.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_act_d_no.putMode(p, SRCH_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_rcv_act_no.putMode(p, SRCH_APPL, MCMode.INVISIBLE);
		p.columnApplDtl_rcv_act_seq.putMode(p, SRCH_APPL, MCMode.INVISIBLE);
		p.columnApplDtl_rcv_act_d_no.putMode(p, SRCH_APPL, MCMode.INVISIBLE);
		p.columnApplDtl_rcv_act_d_seq.putMode(p, SRCH_APPL, MCMode.INVISIBLE);
		p.columnApplDtl_bill_d_no.putMode(p, SRCH_APPL, MCMode.INVISIBLE);
		p.columnApplDtl_parent_bill_d_no.putMode(p, SRCH_APPL, MCMode.INVISIBLE);
		p.columnApplDtl_bill_mng_no.putMode(p, SRCH_APPL, MCMode.INVISIBLE);
		p.columnApplDtl_bill_d_upd_cntr.putMode(p, SRCH_APPL, MCMode.INVISIBLE);
		p.columnApplDtl_bill_d_appl_bal_upd_cntr.putMode(p, SRCH_APPL, MCMode.INVISIBLE);
		p.columnApplDtl_rcv_act_upd_cntr.putMode(p, SRCH_APPL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_APPL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__APPL_Btn(MSBGP_ArDtlApplReg p){
		p.Btn_select_all.putMode(p, SRCH_APPL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_APPL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_APPL, MCMode.DISABLE);
		p.Btn_upd_appl.putMode(p, SRCH_APPL, MCMode.INVISIBLE);
		p.Btn_prio_can_red_flg.putMode(p, SRCH_APPL, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBGP_ArDtlApplReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBGP_ArDtlApplReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_rcv_act_d_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_ac_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_inc_not_bill_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_inc_otr_slo_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrTab(MSBGP_ArDtlApplReg p){

	}

	/**
	 * [UPD]ステータスの[RcvActD]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RcvActD(MSBGP_ArDtlApplReg p){
		p.RcvActD_rcv_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_ac_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_ac_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_slo_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_iv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_rcv_mtd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_rcv_mtd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_rcst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_rcst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_bcst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_bcst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_bill_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_bill_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_acst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_acst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_ar_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_ar_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_wrk_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_wrk_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_ar_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_ar_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_trd_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.RcvActD_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.RcvActD_appl_tgt_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.RcvActD_ttl_appl_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.RcvActD_not_appl_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.RcvActD_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.RcvActD_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Sys(MSBGP_ArDtlApplReg p){

	}

	/**
	 * [UPD]ステータスの[ApplDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ApplDtl(MSBGP_ArDtlApplReg p){
		p.columnApplDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnApplDtl_ac_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_ac_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_slip_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ApplDtl_appl_tgt_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.ApplDtl_ttl_appl_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.ApplDtl_appl_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.ApplDtl_not_appl_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnApplDtl_ar_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_ar_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_bill_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_bill_cl_day.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_bill_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_bill_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_act_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnApplDtl_act_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_act_d_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.ApplDtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.ApplDtl_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnApplDtl_trd_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_qty_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.ApplDtl_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnApplDtl_inc_tax_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.ApplDtl_trd_cur_upri_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.ApplDtl_trd_cur_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnApplDtl_tax_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_tax_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_tax_rate.putMode(p, UPD, MCMode.READ_ONLY);
		p.ApplDtl_trd_cur_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.ApplDtl_trd_cur_dscnt_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnApplDtl_cst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_dest_cd1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_dest_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_dest_cd2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_dest_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_dest_cd3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_dest_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_sls_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_sls_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_sls_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_sls_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_slo_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_slo_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_cst_po_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_cst_po_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_slip_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_ship_dlv_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_ship_dlv_slip_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_ship_dlv_slip_multi_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_ac_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_ac_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnApplDtl_rcv_act_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnApplDtl_rcv_act_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnApplDtl_rcv_act_d_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnApplDtl_rcv_act_d_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnApplDtl_bill_d_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnApplDtl_parent_bill_d_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnApplDtl_bill_mng_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnApplDtl_bill_d_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnApplDtl_bill_d_appl_bal_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnApplDtl_rcv_act_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBGP_ArDtlApplReg p){
		p.Btn_select_all.putMode(p, UPD, MCMode.REQUIRED);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.REQUIRED);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd_appl.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_prio_can_red_flg.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD_APPL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APPL_ScreenOpe(MSBGP_ArDtlApplReg p){

	}

	/**
	 * [UPD_APPL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APPL_Cnd(MSBGP_ArDtlApplReg p){
		p.Cnd_ope_Group.putMode(p, UPD_APPL, MCMode.REQUIRED);
		p.Cnd_rcv_act_d_no.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, UPD_APPL, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, UPD_APPL, MCMode.ENABLE);
		p.Cnd_inc_not_bill_flg.putMode(p, UPD_APPL, MCMode.REQUIRED);
		p.Cnd_inc_otr_slo_flg.putMode(p, UPD_APPL, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD_APPL, MCMode.ENABLE);

	}

	/**
	 * [UPD_APPL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APPL_HdrTab(MSBGP_ArDtlApplReg p){

	}

	/**
	 * [UPD_APPL]ステータスの[RcvActD]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APPL_RcvActD(MSBGP_ArDtlApplReg p){
		p.RcvActD_rcv_dt.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_ac_ym.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_ac_dt.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_trd_cd.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_trd_nm.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_slo_no.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_iv_no.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_rcv_mtd_cd.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_rcv_mtd_nm.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_rcst_cd.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_rcst_nm.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_bcst_cd.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_bcst_nm.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_bill_dpt_cd.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_bill_dpt_nm.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_acst_cd.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_acst_nm.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_ar_dpt_cd.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_ar_dpt_nm.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_wg_cd.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_wg_nm.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_wrk_no.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_wrk_nm.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_ar_typ.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_ar_typ_nm.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_trd_cur_cd.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_trd_cur_nm.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_amt_dec_place.putMode(p, UPD_APPL, MCMode.INVISIBLE);
		p.RcvActD_upri_dec_place.putMode(p, UPD_APPL, MCMode.INVISIBLE);
		p.RcvActD_appl_tgt_amt_p_PPanel.putStatus(UPD_APPL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.RcvActD_ttl_appl_amt_p_PPanel.putStatus(UPD_APPL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.RcvActD_not_appl_amt_p_PPanel.putStatus(UPD_APPL, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.RcvActD_ins_usr_id.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_ins_usr_nm.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_ins_func_id.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_ins_func_nm.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_upd_usr_id.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_upd_usr_nm.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_upd_func_id.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_upd_func_nm.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_ins_ts.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_upd_ts.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.RcvActD_upd_srv_req_no.putMode(p, UPD_APPL, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_APPL]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APPL_Sys(MSBGP_ArDtlApplReg p){

	}

	/**
	 * [UPD_APPL]ステータスの[ApplDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APPL_ApplDtl(MSBGP_ArDtlApplReg p){
		p.columnApplDtl_check.putMode(p, UPD_APPL, MCMode.REQUIRED);
		p.columnApplDtl_ac_ym.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_ac_dt.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_slip_sts_typ_nm.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_trd_cd.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_trd_nm.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.ApplDtl_appl_tgt_amt_p_PPanel.putStatus(UPD_APPL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.ApplDtl_ttl_appl_amt_p_PPanel.putStatus(UPD_APPL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.ApplDtl_appl_amt_p_PPanel.putStatus(UPD_APPL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.ApplDtl_not_appl_amt_p_PPanel.putStatus(UPD_APPL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnApplDtl_ar_typ.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_ar_typ_nm.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_dt.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_bill_ym.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_bill_cl_day.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_bill_dt.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_bill_no.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_act_no.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_act_seq.putMode(p, UPD_APPL, MCMode.INVISIBLE);
		p.columnApplDtl_act_rev.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_act_d_no.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_act_d_seq.putMode(p, UPD_APPL, MCMode.INVISIBLE);
		p.ApplDtl_itm_p_PPanel.putStatus(UPD_APPL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.ApplDtl_sno_wrk_no_p_PPanel.putStatus(UPD_APPL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnApplDtl_trd_unit_cd.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_trd_unit_nm.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_qty_dec_place.putMode(p, UPD_APPL, MCMode.INVISIBLE);
		p.ApplDtl_trd_unit_qty_p_PPanel.putStatus(UPD_APPL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnApplDtl_inc_tax_flg.putMode(p, UPD_APPL, MCMode.INVISIBLE);
		p.ApplDtl_trd_cur_upri_p_PPanel.putStatus(UPD_APPL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.ApplDtl_trd_cur_amt_p_PPanel.putStatus(UPD_APPL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnApplDtl_tax_cd.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_tax_nm.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_tax_rate.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.ApplDtl_trd_cur_tax_amt_p_PPanel.putStatus(UPD_APPL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.ApplDtl_trd_cur_dscnt_amt_p_PPanel.putStatus(UPD_APPL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnApplDtl_cst_cd.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_cst_nm.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_cd.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_nm.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_dest_cd1.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_dest_nm1.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_dest_cd2.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_dest_nm2.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_dest_cd3.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_dest_nm3.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_sls_usr_cd.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_sls_usr_nm.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_sls_dpt_cd.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_sls_dpt_nm.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_slo_no.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_slo_d_no.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_cst_po_no.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_cst_po_d_no.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_slip_no.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_slip_d_no.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_ship_dlv_slip_no.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_ship_dlv_slip_d_no.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_ship_dlv_slip_multi_flg.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_ac_ym.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_ac_dt.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_trd_cd.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_trd_nm.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_act_no.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_act_d_no.putMode(p, UPD_APPL, MCMode.READ_ONLY);
		p.columnApplDtl_rcv_act_no.putMode(p, UPD_APPL, MCMode.INVISIBLE);
		p.columnApplDtl_rcv_act_seq.putMode(p, UPD_APPL, MCMode.INVISIBLE);
		p.columnApplDtl_rcv_act_d_no.putMode(p, UPD_APPL, MCMode.INVISIBLE);
		p.columnApplDtl_rcv_act_d_seq.putMode(p, UPD_APPL, MCMode.INVISIBLE);
		p.columnApplDtl_bill_d_no.putMode(p, UPD_APPL, MCMode.INVISIBLE);
		p.columnApplDtl_parent_bill_d_no.putMode(p, UPD_APPL, MCMode.INVISIBLE);
		p.columnApplDtl_bill_mng_no.putMode(p, UPD_APPL, MCMode.INVISIBLE);
		p.columnApplDtl_bill_d_upd_cntr.putMode(p, UPD_APPL, MCMode.INVISIBLE);
		p.columnApplDtl_bill_d_appl_bal_upd_cntr.putMode(p, UPD_APPL, MCMode.INVISIBLE);
		p.columnApplDtl_rcv_act_upd_cntr.putMode(p, UPD_APPL, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_APPL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APPL_Btn(MSBGP_ArDtlApplReg p){
		p.Btn_select_all.putMode(p, UPD_APPL, MCMode.REQUIRED);
		p.Btn_deselect_all.putMode(p, UPD_APPL, MCMode.REQUIRED);
		p.Btn_upd.putMode(p, UPD_APPL, MCMode.INVISIBLE);
		p.Btn_upd_appl.putMode(p, UPD_APPL, MCMode.ENABLE);
		p.Btn_prio_can_red_flg.putMode(p, UPD_APPL, MCMode.REQUIRED);

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBGP_ArDtlApplReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBGP_ArDtlApplReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_rcv_act_d_no.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_ac_dt_fr.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_inc_not_bill_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_inc_otr_slo_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrTab(MSBGP_ArDtlApplReg p){

	}

	/**
	 * [FIX_U]ステータスの[RcvActD]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RcvActD(MSBGP_ArDtlApplReg p){
		p.RcvActD_rcv_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_ac_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_slo_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_rcv_mtd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_rcv_mtd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_rcst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_rcst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_bcst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_bcst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_bill_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_bill_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_acst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_acst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_ar_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_ar_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_wrk_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_wrk_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_ar_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_ar_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_trd_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_trd_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.RcvActD_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.RcvActD_appl_tgt_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.RcvActD_ttl_appl_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.RcvActD_not_appl_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.RcvActD_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.RcvActD_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Sys(MSBGP_ArDtlApplReg p){

	}

	/**
	 * [FIX_U]ステータスの[ApplDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ApplDtl(MSBGP_ArDtlApplReg p){
		p.columnApplDtl_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_ac_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_slip_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ApplDtl_appl_tgt_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.ApplDtl_ttl_appl_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.ApplDtl_appl_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.ApplDtl_not_appl_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnApplDtl_ar_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_ar_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_bill_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_bill_cl_day.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_bill_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_bill_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_act_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnApplDtl_act_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_act_d_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.ApplDtl_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.ApplDtl_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnApplDtl_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_qty_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.ApplDtl_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnApplDtl_inc_tax_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.ApplDtl_trd_cur_upri_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.ApplDtl_trd_cur_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnApplDtl_tax_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_tax_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_tax_rate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ApplDtl_trd_cur_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.ApplDtl_trd_cur_dscnt_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnApplDtl_cst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_cst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_dest_cd1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_dest_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_dest_cd2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_dest_nm2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_dest_cd3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_dest_nm3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_sls_usr_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_sls_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_sls_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_sls_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_slo_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_slo_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_cst_po_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_cst_po_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_slip_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_ship_dlv_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_ship_dlv_slip_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_ship_dlv_slip_multi_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_ac_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnApplDtl_rcv_act_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnApplDtl_rcv_act_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnApplDtl_rcv_act_d_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnApplDtl_rcv_act_d_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnApplDtl_bill_d_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnApplDtl_parent_bill_d_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnApplDtl_bill_mng_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnApplDtl_bill_d_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnApplDtl_bill_d_appl_bal_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnApplDtl_rcv_act_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBGP_ArDtlApplReg p){
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd_appl.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_prio_can_red_flg.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBGP_ArDtlApplReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBGP_ArDtlApplReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rcv_act_d_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ac_dt_fr.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_inc_not_bill_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_inc_otr_slo_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBGP_ArDtlApplReg p){

	}

	/**
	 * [REF]ステータスの[RcvActD]ブロックのモードの設定
	 */
	protected static void statusInitREF_RcvActD(MSBGP_ArDtlApplReg p){
		p.RcvActD_rcv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_rcv_mtd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_rcv_mtd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_rcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_rcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_bcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_bcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_bill_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_bill_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_acst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_acst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_ar_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_ar_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_wrk_no.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_wrk_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_ar_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_ar_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.RcvActD_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.RcvActD_appl_tgt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.RcvActD_ttl_appl_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.RcvActD_not_appl_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.RcvActD_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.RcvActD_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Sys]ブロックのモードの設定
	 */
	protected static void statusInitREF_Sys(MSBGP_ArDtlApplReg p){

	}

	/**
	 * [REF]ステータスの[ApplDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_ApplDtl(MSBGP_ArDtlApplReg p){
		p.columnApplDtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_slip_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ApplDtl_appl_tgt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.ApplDtl_ttl_appl_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.ApplDtl_appl_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.ApplDtl_not_appl_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnApplDtl_ar_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_ar_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_bill_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_bill_cl_day.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_bill_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_bill_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_act_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnApplDtl_act_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_act_d_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.ApplDtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.ApplDtl_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnApplDtl_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_qty_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.ApplDtl_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnApplDtl_inc_tax_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.ApplDtl_trd_cur_upri_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.ApplDtl_trd_cur_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnApplDtl_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_tax_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.ApplDtl_trd_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.ApplDtl_trd_cur_dscnt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnApplDtl_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_dest_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_dest_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_dest_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_dest_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_dest_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_dest_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_sls_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_sls_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_sls_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_sls_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_slo_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_cst_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_cst_po_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_dlv_slip_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_ship_dlv_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_ship_dlv_slip_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_ship_dlv_slip_multi_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_arsw_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnApplDtl_rcv_act_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnApplDtl_rcv_act_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnApplDtl_rcv_act_d_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnApplDtl_rcv_act_d_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnApplDtl_bill_d_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnApplDtl_parent_bill_d_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnApplDtl_bill_mng_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnApplDtl_bill_d_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnApplDtl_bill_d_appl_bal_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnApplDtl_rcv_act_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBGP_ArDtlApplReg p){
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_appl.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_prio_can_red_flg.putMode(p, REF, MCMode.READ_ONLY);

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
		MSBGP_ArDtlApplReg_MC.setTableConfigApplDtl((MSBGP_ArDtlApplReg)this);
	}

	/**
	 * [ApplDtl]ブロックのTableの設定
	 */
	protected static void setTableConfigApplDtl(MSBGP_ArDtlApplReg p) {
		p.columnApplDtl_check.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.check_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_check);
		p.columnApplDtl_ac_ym.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.ac_ym_META);
		p.columnApplDtl_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_ac_ym);
		p.columnApplDtl_ac_dt.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.ac_dt_META);
		p.columnApplDtl_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_ac_dt);
		p.columnApplDtl_slip_sts_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.slip_sts_typ_nm_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_slip_sts_typ_nm);
		p.columnApplDtl_trd_cd.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.trd_cd_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_trd_cd);
		p.columnApplDtl_trd_nm.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.trd_nm_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_trd_nm);
		p.ApplDtlTable.addTable(p.ApplDtl_appl_tgt_amt_p_PPanel.AmtTable);
		p.ApplDtlTable.addTable(p.ApplDtl_ttl_appl_amt_p_PPanel.AmtTable);
		p.ApplDtlTable.addTable(p.ApplDtl_appl_amt_p_PPanel.AmtTable);
		p.ApplDtlTable.addTable(p.ApplDtl_not_appl_amt_p_PPanel.AmtTable);
		p.columnApplDtl_ar_typ.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.ar_typ_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_ar_typ);
		p.columnApplDtl_ar_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.ar_typ_nm_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_ar_typ_nm);
		p.columnApplDtl_dlv_dt.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.dlv_dt_META);
		p.columnApplDtl_dlv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_dlv_dt);
		p.columnApplDtl_bill_ym.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.bill_ym_META);
		p.columnApplDtl_bill_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_bill_ym);
		p.columnApplDtl_bill_cl_day.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.bill_cl_day_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_bill_cl_day);
		p.columnApplDtl_bill_dt.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.bill_dt_META);
		p.columnApplDtl_bill_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_bill_dt);
		p.columnApplDtl_bill_no.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.bill_no_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_bill_no);
		p.columnApplDtl_act_no.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.act_no_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_act_no);
		p.columnApplDtl_act_seq.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.act_seq_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_act_seq);
		p.columnApplDtl_act_rev.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.act_rev_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_act_rev);
		p.columnApplDtl_act_d_no.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.act_d_no_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_act_d_no);
		p.columnApplDtl_act_d_seq.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.act_d_seq_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_act_d_seq);
		p.ApplDtlTable.addTable(p.ApplDtl_itm_p_PPanel.ItmTable);
		p.ApplDtlTable.addTable(p.ApplDtl_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnApplDtl_trd_unit_cd.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.trd_unit_cd_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_trd_unit_cd);
		p.columnApplDtl_trd_unit_nm.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.trd_unit_nm_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_trd_unit_nm);
		p.columnApplDtl_qty_dec_place.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.qty_dec_place_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_qty_dec_place);
		p.ApplDtlTable.addTable(p.ApplDtl_trd_unit_qty_p_PPanel.QtyTable);
		p.columnApplDtl_inc_tax_flg.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.inc_tax_flg_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_inc_tax_flg);
		p.ApplDtlTable.addTable(p.ApplDtl_trd_cur_upri_p_PPanel.UpriTable);
		p.ApplDtlTable.addTable(p.ApplDtl_trd_cur_amt_p_PPanel.AmtTable);
		p.columnApplDtl_tax_cd.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.tax_cd_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_tax_cd);
		p.columnApplDtl_tax_nm.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.tax_nm_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_tax_nm);
		p.columnApplDtl_tax_rate.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.tax_rate_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_tax_rate);
		p.ApplDtlTable.addTable(p.ApplDtl_trd_cur_tax_amt_p_PPanel.AmtTable);
		p.ApplDtlTable.addTable(p.ApplDtl_trd_cur_dscnt_amt_p_PPanel.AmtTable);
		p.columnApplDtl_cst_cd.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.cst_cd_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_cst_cd);
		p.columnApplDtl_cst_nm.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.cst_nm_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_cst_nm);
		p.columnApplDtl_dlv_cd.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.dlv_cd_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_dlv_cd);
		p.columnApplDtl_dlv_nm.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.dlv_nm_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_dlv_nm);
		p.columnApplDtl_dest_cd1.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.dest_cd1_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_dest_cd1);
		p.columnApplDtl_dest_nm1.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.dest_nm1_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_dest_nm1);
		p.columnApplDtl_dest_cd2.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.dest_cd2_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_dest_cd2);
		p.columnApplDtl_dest_nm2.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.dest_nm2_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_dest_nm2);
		p.columnApplDtl_dest_cd3.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.dest_cd3_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_dest_cd3);
		p.columnApplDtl_dest_nm3.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.dest_nm3_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_dest_nm3);
		p.columnApplDtl_sls_usr_cd.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.sls_usr_cd_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_sls_usr_cd);
		p.columnApplDtl_sls_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.sls_usr_nm_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_sls_usr_nm);
		p.columnApplDtl_sls_dpt_cd.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.sls_dpt_cd_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_sls_dpt_cd);
		p.columnApplDtl_sls_dpt_nm.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.sls_dpt_nm_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_sls_dpt_nm);
		p.columnApplDtl_slo_no.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.slo_no_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_slo_no);
		p.columnApplDtl_slo_d_no.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.slo_d_no_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_slo_d_no);
		p.columnApplDtl_cst_po_no.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.cst_po_no_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_cst_po_no);
		p.columnApplDtl_cst_po_d_no.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.cst_po_d_no_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_cst_po_d_no);
		p.columnApplDtl_dlv_slip_no.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.dlv_slip_no_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_dlv_slip_no);
		p.columnApplDtl_dlv_slip_d_no.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.dlv_slip_d_no_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_dlv_slip_d_no);
		p.columnApplDtl_ship_dlv_slip_no.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.ship_dlv_slip_no_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_ship_dlv_slip_no);
		p.columnApplDtl_ship_dlv_slip_d_no.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.ship_dlv_slip_d_no_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_ship_dlv_slip_d_no);
		p.columnApplDtl_ship_dlv_slip_multi_flg.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.ship_dlv_slip_multi_flg_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_ship_dlv_slip_multi_flg);
		p.columnApplDtl_arsw_ac_ym.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.arsw_ac_ym_META);
		p.columnApplDtl_arsw_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_arsw_ac_ym);
		p.columnApplDtl_arsw_ac_dt.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.arsw_ac_dt_META);
		p.columnApplDtl_arsw_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_arsw_ac_dt);
		p.columnApplDtl_arsw_trd_cd.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.arsw_trd_cd_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_arsw_trd_cd);
		p.columnApplDtl_arsw_trd_nm.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.arsw_trd_nm_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_arsw_trd_nm);
		p.columnApplDtl_arsw_act_no.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.arsw_act_no_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_arsw_act_no);
		p.columnApplDtl_arsw_act_d_no.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.arsw_act_d_no_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_arsw_act_d_no);
		p.columnApplDtl_rcv_act_no.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.rcv_act_no_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_rcv_act_no);
		p.columnApplDtl_rcv_act_seq.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.rcv_act_seq_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_rcv_act_seq);
		p.columnApplDtl_rcv_act_d_no.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.rcv_act_d_no_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_rcv_act_d_no);
		p.columnApplDtl_rcv_act_d_seq.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.rcv_act_d_seq_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_rcv_act_d_seq);
		p.columnApplDtl_bill_d_no.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.bill_d_no_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_bill_d_no);
		p.columnApplDtl_parent_bill_d_no.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.parent_bill_d_no_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_parent_bill_d_no);
		p.columnApplDtl_bill_mng_no.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.bill_mng_no_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_bill_mng_no);
		p.columnApplDtl_bill_d_upd_cntr.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.bill_d_upd_cntr_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_bill_d_upd_cntr);
		p.columnApplDtl_bill_d_appl_bal_upd_cntr.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.bill_d_appl_bal_upd_cntr_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_bill_d_appl_bal_upd_cntr);
		p.columnApplDtl_rcv_act_upd_cntr.setMeta(mcframe.clientMSBG.MSBGP0220.ApplDtlR.rcv_act_upd_cntr_META);
		p.ApplDtlTable.addColumnConfig(p.columnApplDtl_rcv_act_upd_cntr);
		// スクロール固定カラムの指定
		p.ApplDtlTable.setUnscrollColumn(p.columnApplDtl_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnApplDtl_ar_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnApplDtl_ar_typ.getListConfig().setPutter(getApplDtl_ar_typ_ListPutter());
		columnApplDtl_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnApplDtl_trd_unit_cd.getListConfig().setPutter(getApplDtl_trd_unit_cd_ListPutter());
		columnApplDtl_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnApplDtl_tax_cd.getListConfig().setPutter(getApplDtl_tax_cd_ListPutter());
		columnApplDtl_cst_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnApplDtl_cst_cd.getListConfig().setPutter(getApplDtl_cst_cd_ListPutter());
		columnApplDtl_dlv_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnApplDtl_dlv_cd.getListConfig().setPutter(getApplDtl_dlv_cd_ListPutter());
		columnApplDtl_dest_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnApplDtl_dest_cd1.getListConfig().setPutter(getApplDtl_dest_cd1_ListPutter());
		columnApplDtl_dest_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnApplDtl_dest_cd2.getListConfig().setPutter(getApplDtl_dest_cd2_ListPutter());
		columnApplDtl_dest_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnApplDtl_dest_cd3.getListConfig().setPutter(getApplDtl_dest_cd3_ListPutter());
		columnApplDtl_sls_usr_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnApplDtl_sls_usr_cd.getListConfig().setPutter(getApplDtl_sls_usr_cd_ListPutter());
		columnApplDtl_sls_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnApplDtl_sls_dpt_cd.getListConfig().setPutter(getApplDtl_sls_dpt_cd_ListPutter());
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
	 * この画面を[SRCH_APPL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_APPLStatus() {
		status = SRCH_APPL;
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
	 * この画面を[UPD_APPL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_APPLStatus() {
		status = UPD_APPL;
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
		else if (SRCH_APPL.equals(status)) {
			setSRCH_APPLStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (UPD_APPL.equals(status)) {
			setUPD_APPLStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * [ApplDtl_ar_typ_ListPutter]の作成
	 */
	protected MCListPutter createApplDtl_ar_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [ApplDtl_trd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createApplDtl_trd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [ApplDtl_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createApplDtl_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [ApplDtl_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createApplDtl_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [ApplDtl_dlv_cd_ListPutter]の作成
	 */
	protected MCListPutter createApplDtl_dlv_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [ApplDtl_dest_cd1_ListPutter]の作成
	 */
	protected MCListPutter createApplDtl_dest_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [ApplDtl_dest_cd2_ListPutter]の作成
	 */
	protected MCListPutter createApplDtl_dest_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [ApplDtl_dest_cd3_ListPutter]の作成
	 */
	protected MCListPutter createApplDtl_dest_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [ApplDtl_sls_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createApplDtl_sls_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [ApplDtl_sls_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createApplDtl_sls_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == columnApplDtl_ar_typ) return getApplDtl_ar_typ(row, info);
		if(combo == columnApplDtl_trd_unit_cd) return getApplDtl_trd_unit_cd(row, info);
		if(combo == columnApplDtl_tax_cd) return getApplDtl_tax_cd(row, info);
		if(combo == columnApplDtl_cst_cd) return getApplDtl_cst_cd(row, info);
		if(combo == columnApplDtl_dlv_cd) return getApplDtl_dlv_cd(row, info);
		if(combo == columnApplDtl_dest_cd1) return getApplDtl_dest_cd1(row, info);
		if(combo == columnApplDtl_dest_cd2) return getApplDtl_dest_cd2(row, info);
		if(combo == columnApplDtl_dest_cd3) return getApplDtl_dest_cd3(row, info);
		if(combo == columnApplDtl_sls_usr_cd) return getApplDtl_sls_usr_cd(row, info);
		if(combo == columnApplDtl_sls_dpt_cd) return getApplDtl_sls_dpt_cd(row, info);
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
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_upd_appl) doBtn_upd_appl(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

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
	 * [Btn]パネルの[upd_appl]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_appl(MCEventInfo info);

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
		if (vc == ApplDtlTable) return doApplDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_rcv_act_d_no) return doCnd_rcv_act_d_no_VC(info);
		if (vc == Cnd_ac_dt_fr) return doCnd_ac_dt_fr_VC(info);
		if (vc == Cnd_ac_dt_to) return doCnd_ac_dt_to_VC(info);
		if (vc == Cnd_inc_not_bill_flg) return doCnd_inc_not_bill_flg_VC(info);
		if (vc == Cnd_inc_otr_slo_flg) return doCnd_inc_otr_slo_flg_VC(info);
		if (vc == RcvActD_rcv_dt) return doRcvActD_rcv_dt_VC(info);
		if (vc == RcvActD_ac_ym) return doRcvActD_ac_ym_VC(info);
		if (vc == RcvActD_ac_dt) return doRcvActD_ac_dt_VC(info);
		if (vc == RcvActD_trd_cd) return doRcvActD_trd_cd_VC(info);
		if (vc == RcvActD_trd_nm) return doRcvActD_trd_nm_VC(info);
		if (vc == RcvActD_slo_no) return doRcvActD_slo_no_VC(info);
		if (vc == RcvActD_iv_no) return doRcvActD_iv_no_VC(info);
		if (vc == RcvActD_rcv_mtd_cd) return doRcvActD_rcv_mtd_cd_VC(info);
		if (vc == RcvActD_rcv_mtd_nm) return doRcvActD_rcv_mtd_nm_VC(info);
		if (vc == RcvActD_rcst_cd) return doRcvActD_rcst_cd_VC(info);
		if (vc == RcvActD_rcst_nm) return doRcvActD_rcst_nm_VC(info);
		if (vc == RcvActD_bcst_cd) return doRcvActD_bcst_cd_VC(info);
		if (vc == RcvActD_bcst_nm) return doRcvActD_bcst_nm_VC(info);
		if (vc == RcvActD_bill_dpt_cd) return doRcvActD_bill_dpt_cd_VC(info);
		if (vc == RcvActD_bill_dpt_nm) return doRcvActD_bill_dpt_nm_VC(info);
		if (vc == RcvActD_acst_cd) return doRcvActD_acst_cd_VC(info);
		if (vc == RcvActD_acst_nm) return doRcvActD_acst_nm_VC(info);
		if (vc == RcvActD_ar_dpt_cd) return doRcvActD_ar_dpt_cd_VC(info);
		if (vc == RcvActD_ar_dpt_nm) return doRcvActD_ar_dpt_nm_VC(info);
		if (vc == RcvActD_wg_cd) return doRcvActD_wg_cd_VC(info);
		if (vc == RcvActD_wg_nm) return doRcvActD_wg_nm_VC(info);
		if (vc == RcvActD_wrk_no) return doRcvActD_wrk_no_VC(info);
		if (vc == RcvActD_wrk_nm) return doRcvActD_wrk_nm_VC(info);
		if (vc == RcvActD_ar_typ) return doRcvActD_ar_typ_VC(info);
		if (vc == RcvActD_ar_typ_nm) return doRcvActD_ar_typ_nm_VC(info);
		if (vc == RcvActD_trd_cur_cd) return doRcvActD_trd_cur_cd_VC(info);
		if (vc == RcvActD_trd_cur_nm) return doRcvActD_trd_cur_nm_VC(info);
		if (vc == RcvActD_amt_dec_place) return doRcvActD_amt_dec_place_VC(info);
		if (vc == RcvActD_upri_dec_place) return doRcvActD_upri_dec_place_VC(info);
		if (vc == RcvActD_ins_usr_id) return doRcvActD_ins_usr_id_VC(info);
		if (vc == RcvActD_ins_usr_nm) return doRcvActD_ins_usr_nm_VC(info);
		if (vc == RcvActD_ins_func_id) return doRcvActD_ins_func_id_VC(info);
		if (vc == RcvActD_ins_func_nm) return doRcvActD_ins_func_nm_VC(info);
		if (vc == RcvActD_upd_usr_id) return doRcvActD_upd_usr_id_VC(info);
		if (vc == RcvActD_upd_usr_nm) return doRcvActD_upd_usr_nm_VC(info);
		if (vc == RcvActD_upd_func_id) return doRcvActD_upd_func_id_VC(info);
		if (vc == RcvActD_upd_func_nm) return doRcvActD_upd_func_nm_VC(info);
		if (vc == RcvActD_ins_ts) return doRcvActD_ins_ts_VC(info);
		if (vc == RcvActD_upd_ts) return doRcvActD_upd_ts_VC(info);
		if (vc == RcvActD_upd_srv_req_no) return doRcvActD_upd_srv_req_no_VC(info);
		if (vc == columnApplDtl_check) return doApplDtl_check_VC(info);
		if (vc == columnApplDtl_ac_ym) return doApplDtl_ac_ym_VC(info);
		if (vc == columnApplDtl_ac_dt) return doApplDtl_ac_dt_VC(info);
		if (vc == columnApplDtl_slip_sts_typ_nm) return doApplDtl_slip_sts_typ_nm_VC(info);
		if (vc == columnApplDtl_trd_cd) return doApplDtl_trd_cd_VC(info);
		if (vc == columnApplDtl_trd_nm) return doApplDtl_trd_nm_VC(info);
		if (vc == columnApplDtl_ar_typ) return doApplDtl_ar_typ_VC(info);
		if (vc == columnApplDtl_ar_typ_nm) return doApplDtl_ar_typ_nm_VC(info);
		if (vc == columnApplDtl_dlv_dt) return doApplDtl_dlv_dt_VC(info);
		if (vc == columnApplDtl_bill_ym) return doApplDtl_bill_ym_VC(info);
		if (vc == columnApplDtl_bill_cl_day) return doApplDtl_bill_cl_day_VC(info);
		if (vc == columnApplDtl_bill_dt) return doApplDtl_bill_dt_VC(info);
		if (vc == columnApplDtl_bill_no) return doApplDtl_bill_no_VC(info);
		if (vc == columnApplDtl_act_no) return doApplDtl_act_no_VC(info);
		if (vc == columnApplDtl_act_seq) return doApplDtl_act_seq_VC(info);
		if (vc == columnApplDtl_act_rev) return doApplDtl_act_rev_VC(info);
		if (vc == columnApplDtl_act_d_no) return doApplDtl_act_d_no_VC(info);
		if (vc == columnApplDtl_act_d_seq) return doApplDtl_act_d_seq_VC(info);
		if (vc == columnApplDtl_trd_unit_cd) return doApplDtl_trd_unit_cd_VC(info);
		if (vc == columnApplDtl_trd_unit_nm) return doApplDtl_trd_unit_nm_VC(info);
		if (vc == columnApplDtl_qty_dec_place) return doApplDtl_qty_dec_place_VC(info);
		if (vc == columnApplDtl_inc_tax_flg) return doApplDtl_inc_tax_flg_VC(info);
		if (vc == columnApplDtl_tax_cd) return doApplDtl_tax_cd_VC(info);
		if (vc == columnApplDtl_tax_nm) return doApplDtl_tax_nm_VC(info);
		if (vc == columnApplDtl_tax_rate) return doApplDtl_tax_rate_VC(info);
		if (vc == columnApplDtl_cst_cd) return doApplDtl_cst_cd_VC(info);
		if (vc == columnApplDtl_cst_nm) return doApplDtl_cst_nm_VC(info);
		if (vc == columnApplDtl_dlv_cd) return doApplDtl_dlv_cd_VC(info);
		if (vc == columnApplDtl_dlv_nm) return doApplDtl_dlv_nm_VC(info);
		if (vc == columnApplDtl_dest_cd1) return doApplDtl_dest_cd1_VC(info);
		if (vc == columnApplDtl_dest_nm1) return doApplDtl_dest_nm1_VC(info);
		if (vc == columnApplDtl_dest_cd2) return doApplDtl_dest_cd2_VC(info);
		if (vc == columnApplDtl_dest_nm2) return doApplDtl_dest_nm2_VC(info);
		if (vc == columnApplDtl_dest_cd3) return doApplDtl_dest_cd3_VC(info);
		if (vc == columnApplDtl_dest_nm3) return doApplDtl_dest_nm3_VC(info);
		if (vc == columnApplDtl_sls_usr_cd) return doApplDtl_sls_usr_cd_VC(info);
		if (vc == columnApplDtl_sls_usr_nm) return doApplDtl_sls_usr_nm_VC(info);
		if (vc == columnApplDtl_sls_dpt_cd) return doApplDtl_sls_dpt_cd_VC(info);
		if (vc == columnApplDtl_sls_dpt_nm) return doApplDtl_sls_dpt_nm_VC(info);
		if (vc == columnApplDtl_slo_no) return doApplDtl_slo_no_VC(info);
		if (vc == columnApplDtl_slo_d_no) return doApplDtl_slo_d_no_VC(info);
		if (vc == columnApplDtl_cst_po_no) return doApplDtl_cst_po_no_VC(info);
		if (vc == columnApplDtl_cst_po_d_no) return doApplDtl_cst_po_d_no_VC(info);
		if (vc == columnApplDtl_dlv_slip_no) return doApplDtl_dlv_slip_no_VC(info);
		if (vc == columnApplDtl_dlv_slip_d_no) return doApplDtl_dlv_slip_d_no_VC(info);
		if (vc == columnApplDtl_ship_dlv_slip_no) return doApplDtl_ship_dlv_slip_no_VC(info);
		if (vc == columnApplDtl_ship_dlv_slip_d_no) return doApplDtl_ship_dlv_slip_d_no_VC(info);
		if (vc == columnApplDtl_ship_dlv_slip_multi_flg) return doApplDtl_ship_dlv_slip_multi_flg_VC(info);
		if (vc == columnApplDtl_arsw_ac_ym) return doApplDtl_arsw_ac_ym_VC(info);
		if (vc == columnApplDtl_arsw_ac_dt) return doApplDtl_arsw_ac_dt_VC(info);
		if (vc == columnApplDtl_arsw_trd_cd) return doApplDtl_arsw_trd_cd_VC(info);
		if (vc == columnApplDtl_arsw_trd_nm) return doApplDtl_arsw_trd_nm_VC(info);
		if (vc == columnApplDtl_arsw_act_no) return doApplDtl_arsw_act_no_VC(info);
		if (vc == columnApplDtl_arsw_act_d_no) return doApplDtl_arsw_act_d_no_VC(info);
		if (vc == columnApplDtl_rcv_act_no) return doApplDtl_rcv_act_no_VC(info);
		if (vc == columnApplDtl_rcv_act_seq) return doApplDtl_rcv_act_seq_VC(info);
		if (vc == columnApplDtl_rcv_act_d_no) return doApplDtl_rcv_act_d_no_VC(info);
		if (vc == columnApplDtl_rcv_act_d_seq) return doApplDtl_rcv_act_d_seq_VC(info);
		if (vc == columnApplDtl_bill_d_no) return doApplDtl_bill_d_no_VC(info);
		if (vc == columnApplDtl_parent_bill_d_no) return doApplDtl_parent_bill_d_no_VC(info);
		if (vc == columnApplDtl_bill_mng_no) return doApplDtl_bill_mng_no_VC(info);
		if (vc == columnApplDtl_bill_d_upd_cntr) return doApplDtl_bill_d_upd_cntr_VC(info);
		if (vc == columnApplDtl_bill_d_appl_bal_upd_cntr) return doApplDtl_bill_d_appl_bal_upd_cntr_VC(info);
		if (vc == columnApplDtl_rcv_act_upd_cntr) return doApplDtl_rcv_act_upd_cntr_VC(info);
		if (vc == Btn_prio_can_red_flg) return doBtn_prio_can_red_flg_VC(info);
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
	 * [ApplDtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcv_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcv_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inc_not_bill_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inc_not_bill_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inc_otr_slo_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inc_otr_slo_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[rcv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_rcv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[rcv_mtd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_rcv_mtd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[rcv_mtd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_rcv_mtd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[rcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_rcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[rcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_rcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[bcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_bcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[bcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_bcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[bill_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_bill_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[bill_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_bill_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[acst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_acst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[acst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_acst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[ar_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_ar_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[ar_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_ar_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[wrk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_wrk_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[ar_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_ar_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[ar_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_ar_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RcvActD]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRcvActD_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[slip_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_slip_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[ar_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_ar_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[ar_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_ar_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[dlv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_dlv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[bill_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_bill_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[bill_cl_day]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_bill_cl_day_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[bill_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_bill_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[bill_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_bill_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[act_d_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_act_d_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[qty_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_qty_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[inc_tax_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_inc_tax_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_tax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_dlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[dest_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_dest_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[dest_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_dest_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[dest_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_dest_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[dest_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_dest_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[dest_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_dest_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[dest_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_dest_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[sls_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_sls_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[sls_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_sls_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[sls_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_sls_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[sls_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_sls_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[cst_po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_cst_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[cst_po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_cst_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_dlv_slip_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[ship_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_ship_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[ship_dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_ship_dlv_slip_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[ship_dlv_slip_multi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_ship_dlv_slip_multi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[arsw_ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_arsw_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[arsw_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_arsw_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[arsw_trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_arsw_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[arsw_trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_arsw_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[arsw_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_arsw_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[arsw_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_arsw_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[rcv_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_rcv_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[rcv_act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_rcv_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[rcv_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_rcv_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[rcv_act_d_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_rcv_act_d_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[bill_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_bill_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[parent_bill_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_parent_bill_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[bill_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_bill_mng_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[bill_d_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_bill_d_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[bill_d_appl_bal_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_bill_d_appl_bal_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ApplDtl]パネルの[rcv_act_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doApplDtl_rcv_act_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn]パネルの[prio_can_red_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_prio_can_red_flg_VC(MCEventInfo info){
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
		else if (nc == ApplDtlTable) doApplDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_rcv_act_d_no) doCnd_rcv_act_d_no_NC(info);
		else if (nc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NC(info);
		else if (nc == Cnd_ac_dt_to) doCnd_ac_dt_to_NC(info);
		else if (nc == Cnd_inc_not_bill_flg) doCnd_inc_not_bill_flg_NC(info);
		else if (nc == Cnd_inc_otr_slo_flg) doCnd_inc_otr_slo_flg_NC(info);
		else if (nc == RcvActD_rcv_dt) doRcvActD_rcv_dt_NC(info);
		else if (nc == RcvActD_ac_ym) doRcvActD_ac_ym_NC(info);
		else if (nc == RcvActD_ac_dt) doRcvActD_ac_dt_NC(info);
		else if (nc == RcvActD_trd_cd) doRcvActD_trd_cd_NC(info);
		else if (nc == RcvActD_trd_nm) doRcvActD_trd_nm_NC(info);
		else if (nc == RcvActD_slo_no) doRcvActD_slo_no_NC(info);
		else if (nc == RcvActD_iv_no) doRcvActD_iv_no_NC(info);
		else if (nc == RcvActD_rcv_mtd_cd) doRcvActD_rcv_mtd_cd_NC(info);
		else if (nc == RcvActD_rcv_mtd_nm) doRcvActD_rcv_mtd_nm_NC(info);
		else if (nc == RcvActD_rcst_cd) doRcvActD_rcst_cd_NC(info);
		else if (nc == RcvActD_rcst_nm) doRcvActD_rcst_nm_NC(info);
		else if (nc == RcvActD_bcst_cd) doRcvActD_bcst_cd_NC(info);
		else if (nc == RcvActD_bcst_nm) doRcvActD_bcst_nm_NC(info);
		else if (nc == RcvActD_bill_dpt_cd) doRcvActD_bill_dpt_cd_NC(info);
		else if (nc == RcvActD_bill_dpt_nm) doRcvActD_bill_dpt_nm_NC(info);
		else if (nc == RcvActD_acst_cd) doRcvActD_acst_cd_NC(info);
		else if (nc == RcvActD_acst_nm) doRcvActD_acst_nm_NC(info);
		else if (nc == RcvActD_ar_dpt_cd) doRcvActD_ar_dpt_cd_NC(info);
		else if (nc == RcvActD_ar_dpt_nm) doRcvActD_ar_dpt_nm_NC(info);
		else if (nc == RcvActD_wg_cd) doRcvActD_wg_cd_NC(info);
		else if (nc == RcvActD_wg_nm) doRcvActD_wg_nm_NC(info);
		else if (nc == RcvActD_wrk_no) doRcvActD_wrk_no_NC(info);
		else if (nc == RcvActD_wrk_nm) doRcvActD_wrk_nm_NC(info);
		else if (nc == RcvActD_ar_typ) doRcvActD_ar_typ_NC(info);
		else if (nc == RcvActD_ar_typ_nm) doRcvActD_ar_typ_nm_NC(info);
		else if (nc == RcvActD_trd_cur_cd) doRcvActD_trd_cur_cd_NC(info);
		else if (nc == RcvActD_trd_cur_nm) doRcvActD_trd_cur_nm_NC(info);
		else if (nc == RcvActD_amt_dec_place) doRcvActD_amt_dec_place_NC(info);
		else if (nc == RcvActD_upri_dec_place) doRcvActD_upri_dec_place_NC(info);
		else if (nc == RcvActD_ins_usr_id) doRcvActD_ins_usr_id_NC(info);
		else if (nc == RcvActD_ins_usr_nm) doRcvActD_ins_usr_nm_NC(info);
		else if (nc == RcvActD_ins_func_id) doRcvActD_ins_func_id_NC(info);
		else if (nc == RcvActD_ins_func_nm) doRcvActD_ins_func_nm_NC(info);
		else if (nc == RcvActD_upd_usr_id) doRcvActD_upd_usr_id_NC(info);
		else if (nc == RcvActD_upd_usr_nm) doRcvActD_upd_usr_nm_NC(info);
		else if (nc == RcvActD_upd_func_id) doRcvActD_upd_func_id_NC(info);
		else if (nc == RcvActD_upd_func_nm) doRcvActD_upd_func_nm_NC(info);
		else if (nc == RcvActD_ins_ts) doRcvActD_ins_ts_NC(info);
		else if (nc == RcvActD_upd_ts) doRcvActD_upd_ts_NC(info);
		else if (nc == RcvActD_upd_srv_req_no) doRcvActD_upd_srv_req_no_NC(info);
		else if (nc == columnApplDtl_check) doApplDtl_check_NC(info);
		else if (nc == columnApplDtl_ac_ym) doApplDtl_ac_ym_NC(info);
		else if (nc == columnApplDtl_ac_dt) doApplDtl_ac_dt_NC(info);
		else if (nc == columnApplDtl_slip_sts_typ_nm) doApplDtl_slip_sts_typ_nm_NC(info);
		else if (nc == columnApplDtl_trd_cd) doApplDtl_trd_cd_NC(info);
		else if (nc == columnApplDtl_trd_nm) doApplDtl_trd_nm_NC(info);
		else if (nc == columnApplDtl_ar_typ) doApplDtl_ar_typ_NC(info);
		else if (nc == columnApplDtl_ar_typ_nm) doApplDtl_ar_typ_nm_NC(info);
		else if (nc == columnApplDtl_dlv_dt) doApplDtl_dlv_dt_NC(info);
		else if (nc == columnApplDtl_bill_ym) doApplDtl_bill_ym_NC(info);
		else if (nc == columnApplDtl_bill_cl_day) doApplDtl_bill_cl_day_NC(info);
		else if (nc == columnApplDtl_bill_dt) doApplDtl_bill_dt_NC(info);
		else if (nc == columnApplDtl_bill_no) doApplDtl_bill_no_NC(info);
		else if (nc == columnApplDtl_act_no) doApplDtl_act_no_NC(info);
		else if (nc == columnApplDtl_act_seq) doApplDtl_act_seq_NC(info);
		else if (nc == columnApplDtl_act_rev) doApplDtl_act_rev_NC(info);
		else if (nc == columnApplDtl_act_d_no) doApplDtl_act_d_no_NC(info);
		else if (nc == columnApplDtl_act_d_seq) doApplDtl_act_d_seq_NC(info);
		else if (nc == columnApplDtl_trd_unit_cd) doApplDtl_trd_unit_cd_NC(info);
		else if (nc == columnApplDtl_trd_unit_nm) doApplDtl_trd_unit_nm_NC(info);
		else if (nc == columnApplDtl_qty_dec_place) doApplDtl_qty_dec_place_NC(info);
		else if (nc == columnApplDtl_inc_tax_flg) doApplDtl_inc_tax_flg_NC(info);
		else if (nc == columnApplDtl_tax_cd) doApplDtl_tax_cd_NC(info);
		else if (nc == columnApplDtl_tax_nm) doApplDtl_tax_nm_NC(info);
		else if (nc == columnApplDtl_tax_rate) doApplDtl_tax_rate_NC(info);
		else if (nc == columnApplDtl_cst_cd) doApplDtl_cst_cd_NC(info);
		else if (nc == columnApplDtl_cst_nm) doApplDtl_cst_nm_NC(info);
		else if (nc == columnApplDtl_dlv_cd) doApplDtl_dlv_cd_NC(info);
		else if (nc == columnApplDtl_dlv_nm) doApplDtl_dlv_nm_NC(info);
		else if (nc == columnApplDtl_dest_cd1) doApplDtl_dest_cd1_NC(info);
		else if (nc == columnApplDtl_dest_nm1) doApplDtl_dest_nm1_NC(info);
		else if (nc == columnApplDtl_dest_cd2) doApplDtl_dest_cd2_NC(info);
		else if (nc == columnApplDtl_dest_nm2) doApplDtl_dest_nm2_NC(info);
		else if (nc == columnApplDtl_dest_cd3) doApplDtl_dest_cd3_NC(info);
		else if (nc == columnApplDtl_dest_nm3) doApplDtl_dest_nm3_NC(info);
		else if (nc == columnApplDtl_sls_usr_cd) doApplDtl_sls_usr_cd_NC(info);
		else if (nc == columnApplDtl_sls_usr_nm) doApplDtl_sls_usr_nm_NC(info);
		else if (nc == columnApplDtl_sls_dpt_cd) doApplDtl_sls_dpt_cd_NC(info);
		else if (nc == columnApplDtl_sls_dpt_nm) doApplDtl_sls_dpt_nm_NC(info);
		else if (nc == columnApplDtl_slo_no) doApplDtl_slo_no_NC(info);
		else if (nc == columnApplDtl_slo_d_no) doApplDtl_slo_d_no_NC(info);
		else if (nc == columnApplDtl_cst_po_no) doApplDtl_cst_po_no_NC(info);
		else if (nc == columnApplDtl_cst_po_d_no) doApplDtl_cst_po_d_no_NC(info);
		else if (nc == columnApplDtl_dlv_slip_no) doApplDtl_dlv_slip_no_NC(info);
		else if (nc == columnApplDtl_dlv_slip_d_no) doApplDtl_dlv_slip_d_no_NC(info);
		else if (nc == columnApplDtl_ship_dlv_slip_no) doApplDtl_ship_dlv_slip_no_NC(info);
		else if (nc == columnApplDtl_ship_dlv_slip_d_no) doApplDtl_ship_dlv_slip_d_no_NC(info);
		else if (nc == columnApplDtl_ship_dlv_slip_multi_flg) doApplDtl_ship_dlv_slip_multi_flg_NC(info);
		else if (nc == columnApplDtl_arsw_ac_ym) doApplDtl_arsw_ac_ym_NC(info);
		else if (nc == columnApplDtl_arsw_ac_dt) doApplDtl_arsw_ac_dt_NC(info);
		else if (nc == columnApplDtl_arsw_trd_cd) doApplDtl_arsw_trd_cd_NC(info);
		else if (nc == columnApplDtl_arsw_trd_nm) doApplDtl_arsw_trd_nm_NC(info);
		else if (nc == columnApplDtl_arsw_act_no) doApplDtl_arsw_act_no_NC(info);
		else if (nc == columnApplDtl_arsw_act_d_no) doApplDtl_arsw_act_d_no_NC(info);
		else if (nc == columnApplDtl_rcv_act_no) doApplDtl_rcv_act_no_NC(info);
		else if (nc == columnApplDtl_rcv_act_seq) doApplDtl_rcv_act_seq_NC(info);
		else if (nc == columnApplDtl_rcv_act_d_no) doApplDtl_rcv_act_d_no_NC(info);
		else if (nc == columnApplDtl_rcv_act_d_seq) doApplDtl_rcv_act_d_seq_NC(info);
		else if (nc == columnApplDtl_bill_d_no) doApplDtl_bill_d_no_NC(info);
		else if (nc == columnApplDtl_parent_bill_d_no) doApplDtl_parent_bill_d_no_NC(info);
		else if (nc == columnApplDtl_bill_mng_no) doApplDtl_bill_mng_no_NC(info);
		else if (nc == columnApplDtl_bill_d_upd_cntr) doApplDtl_bill_d_upd_cntr_NC(info);
		else if (nc == columnApplDtl_bill_d_appl_bal_upd_cntr) doApplDtl_bill_d_appl_bal_upd_cntr_NC(info);
		else if (nc == columnApplDtl_rcv_act_upd_cntr) doApplDtl_rcv_act_upd_cntr_NC(info);
		else if (nc == Btn_prio_can_red_flg) doBtn_prio_can_red_flg_NC(info);
	}

	/**
	 * [HdrTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_not_bill_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_not_bill_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_otr_slo_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_otr_slo_flg_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[rcv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_rcv_dt_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[rcv_mtd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_rcv_mtd_cd_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[rcv_mtd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_rcv_mtd_nm_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[rcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_rcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[rcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_rcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[bcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_bcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[bcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_bcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[bill_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_bill_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[bill_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_bill_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[acst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_acst_cd_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[acst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_acst_nm_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ar_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ar_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ar_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ar_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[wrk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_wrk_nm_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ar_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ar_typ_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ar_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ar_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[slip_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_slip_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ar_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ar_typ_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ar_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ar_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dlv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dlv_dt_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_ym_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_cl_day]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_cl_day_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_dt_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_no_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_act_no_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[act_d_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_act_d_seq_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[qty_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_qty_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[inc_tax_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_inc_tax_flg_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dest_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dest_cd1_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dest_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dest_nm1_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dest_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dest_cd2_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dest_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dest_nm2_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dest_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dest_cd3_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dest_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dest_nm3_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[sls_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_sls_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[sls_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_sls_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[sls_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_sls_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[sls_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_sls_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[cst_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_cst_po_no_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[cst_po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_cst_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ship_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ship_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ship_dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ship_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ship_dlv_slip_multi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ship_dlv_slip_multi_flg_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[arsw_ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_arsw_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[arsw_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_arsw_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[arsw_trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_arsw_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[arsw_trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_arsw_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[arsw_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_arsw_act_no_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[arsw_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_arsw_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[rcv_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_rcv_act_no_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[rcv_act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_rcv_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[rcv_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_rcv_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[rcv_act_d_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_rcv_act_d_seq_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_d_no_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[parent_bill_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_parent_bill_d_no_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_d_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_d_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_d_appl_bal_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_d_appl_bal_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[rcv_act_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_rcv_act_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[prio_can_red_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_prio_can_red_flg_NC(MCEventInfo info){
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
		else if (ne == ApplDtlTable) doApplDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_rcv_act_d_no) doCnd_rcv_act_d_no_NE(info);
		else if (ne == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NE(info);
		else if (ne == Cnd_ac_dt_to) doCnd_ac_dt_to_NE(info);
		else if (ne == Cnd_inc_not_bill_flg) doCnd_inc_not_bill_flg_NE(info);
		else if (ne == Cnd_inc_otr_slo_flg) doCnd_inc_otr_slo_flg_NE(info);
		else if (ne == RcvActD_rcv_dt) doRcvActD_rcv_dt_NE(info);
		else if (ne == RcvActD_ac_ym) doRcvActD_ac_ym_NE(info);
		else if (ne == RcvActD_ac_dt) doRcvActD_ac_dt_NE(info);
		else if (ne == RcvActD_trd_cd) doRcvActD_trd_cd_NE(info);
		else if (ne == RcvActD_trd_nm) doRcvActD_trd_nm_NE(info);
		else if (ne == RcvActD_slo_no) doRcvActD_slo_no_NE(info);
		else if (ne == RcvActD_iv_no) doRcvActD_iv_no_NE(info);
		else if (ne == RcvActD_rcv_mtd_cd) doRcvActD_rcv_mtd_cd_NE(info);
		else if (ne == RcvActD_rcv_mtd_nm) doRcvActD_rcv_mtd_nm_NE(info);
		else if (ne == RcvActD_rcst_cd) doRcvActD_rcst_cd_NE(info);
		else if (ne == RcvActD_rcst_nm) doRcvActD_rcst_nm_NE(info);
		else if (ne == RcvActD_bcst_cd) doRcvActD_bcst_cd_NE(info);
		else if (ne == RcvActD_bcst_nm) doRcvActD_bcst_nm_NE(info);
		else if (ne == RcvActD_bill_dpt_cd) doRcvActD_bill_dpt_cd_NE(info);
		else if (ne == RcvActD_bill_dpt_nm) doRcvActD_bill_dpt_nm_NE(info);
		else if (ne == RcvActD_acst_cd) doRcvActD_acst_cd_NE(info);
		else if (ne == RcvActD_acst_nm) doRcvActD_acst_nm_NE(info);
		else if (ne == RcvActD_ar_dpt_cd) doRcvActD_ar_dpt_cd_NE(info);
		else if (ne == RcvActD_ar_dpt_nm) doRcvActD_ar_dpt_nm_NE(info);
		else if (ne == RcvActD_wg_cd) doRcvActD_wg_cd_NE(info);
		else if (ne == RcvActD_wg_nm) doRcvActD_wg_nm_NE(info);
		else if (ne == RcvActD_wrk_no) doRcvActD_wrk_no_NE(info);
		else if (ne == RcvActD_wrk_nm) doRcvActD_wrk_nm_NE(info);
		else if (ne == RcvActD_ar_typ) doRcvActD_ar_typ_NE(info);
		else if (ne == RcvActD_ar_typ_nm) doRcvActD_ar_typ_nm_NE(info);
		else if (ne == RcvActD_trd_cur_cd) doRcvActD_trd_cur_cd_NE(info);
		else if (ne == RcvActD_trd_cur_nm) doRcvActD_trd_cur_nm_NE(info);
		else if (ne == RcvActD_amt_dec_place) doRcvActD_amt_dec_place_NE(info);
		else if (ne == RcvActD_upri_dec_place) doRcvActD_upri_dec_place_NE(info);
		else if (ne == RcvActD_ins_usr_id) doRcvActD_ins_usr_id_NE(info);
		else if (ne == RcvActD_ins_usr_nm) doRcvActD_ins_usr_nm_NE(info);
		else if (ne == RcvActD_ins_func_id) doRcvActD_ins_func_id_NE(info);
		else if (ne == RcvActD_ins_func_nm) doRcvActD_ins_func_nm_NE(info);
		else if (ne == RcvActD_upd_usr_id) doRcvActD_upd_usr_id_NE(info);
		else if (ne == RcvActD_upd_usr_nm) doRcvActD_upd_usr_nm_NE(info);
		else if (ne == RcvActD_upd_func_id) doRcvActD_upd_func_id_NE(info);
		else if (ne == RcvActD_upd_func_nm) doRcvActD_upd_func_nm_NE(info);
		else if (ne == RcvActD_ins_ts) doRcvActD_ins_ts_NE(info);
		else if (ne == RcvActD_upd_ts) doRcvActD_upd_ts_NE(info);
		else if (ne == RcvActD_upd_srv_req_no) doRcvActD_upd_srv_req_no_NE(info);
		else if (ne == columnApplDtl_check) doApplDtl_check_NE(info);
		else if (ne == columnApplDtl_ac_ym) doApplDtl_ac_ym_NE(info);
		else if (ne == columnApplDtl_ac_dt) doApplDtl_ac_dt_NE(info);
		else if (ne == columnApplDtl_slip_sts_typ_nm) doApplDtl_slip_sts_typ_nm_NE(info);
		else if (ne == columnApplDtl_trd_cd) doApplDtl_trd_cd_NE(info);
		else if (ne == columnApplDtl_trd_nm) doApplDtl_trd_nm_NE(info);
		else if (ne == columnApplDtl_ar_typ) doApplDtl_ar_typ_NE(info);
		else if (ne == columnApplDtl_ar_typ_nm) doApplDtl_ar_typ_nm_NE(info);
		else if (ne == columnApplDtl_dlv_dt) doApplDtl_dlv_dt_NE(info);
		else if (ne == columnApplDtl_bill_ym) doApplDtl_bill_ym_NE(info);
		else if (ne == columnApplDtl_bill_cl_day) doApplDtl_bill_cl_day_NE(info);
		else if (ne == columnApplDtl_bill_dt) doApplDtl_bill_dt_NE(info);
		else if (ne == columnApplDtl_bill_no) doApplDtl_bill_no_NE(info);
		else if (ne == columnApplDtl_act_no) doApplDtl_act_no_NE(info);
		else if (ne == columnApplDtl_act_seq) doApplDtl_act_seq_NE(info);
		else if (ne == columnApplDtl_act_rev) doApplDtl_act_rev_NE(info);
		else if (ne == columnApplDtl_act_d_no) doApplDtl_act_d_no_NE(info);
		else if (ne == columnApplDtl_act_d_seq) doApplDtl_act_d_seq_NE(info);
		else if (ne == columnApplDtl_trd_unit_cd) doApplDtl_trd_unit_cd_NE(info);
		else if (ne == columnApplDtl_trd_unit_nm) doApplDtl_trd_unit_nm_NE(info);
		else if (ne == columnApplDtl_qty_dec_place) doApplDtl_qty_dec_place_NE(info);
		else if (ne == columnApplDtl_inc_tax_flg) doApplDtl_inc_tax_flg_NE(info);
		else if (ne == columnApplDtl_tax_cd) doApplDtl_tax_cd_NE(info);
		else if (ne == columnApplDtl_tax_nm) doApplDtl_tax_nm_NE(info);
		else if (ne == columnApplDtl_tax_rate) doApplDtl_tax_rate_NE(info);
		else if (ne == columnApplDtl_cst_cd) doApplDtl_cst_cd_NE(info);
		else if (ne == columnApplDtl_cst_nm) doApplDtl_cst_nm_NE(info);
		else if (ne == columnApplDtl_dlv_cd) doApplDtl_dlv_cd_NE(info);
		else if (ne == columnApplDtl_dlv_nm) doApplDtl_dlv_nm_NE(info);
		else if (ne == columnApplDtl_dest_cd1) doApplDtl_dest_cd1_NE(info);
		else if (ne == columnApplDtl_dest_nm1) doApplDtl_dest_nm1_NE(info);
		else if (ne == columnApplDtl_dest_cd2) doApplDtl_dest_cd2_NE(info);
		else if (ne == columnApplDtl_dest_nm2) doApplDtl_dest_nm2_NE(info);
		else if (ne == columnApplDtl_dest_cd3) doApplDtl_dest_cd3_NE(info);
		else if (ne == columnApplDtl_dest_nm3) doApplDtl_dest_nm3_NE(info);
		else if (ne == columnApplDtl_sls_usr_cd) doApplDtl_sls_usr_cd_NE(info);
		else if (ne == columnApplDtl_sls_usr_nm) doApplDtl_sls_usr_nm_NE(info);
		else if (ne == columnApplDtl_sls_dpt_cd) doApplDtl_sls_dpt_cd_NE(info);
		else if (ne == columnApplDtl_sls_dpt_nm) doApplDtl_sls_dpt_nm_NE(info);
		else if (ne == columnApplDtl_slo_no) doApplDtl_slo_no_NE(info);
		else if (ne == columnApplDtl_slo_d_no) doApplDtl_slo_d_no_NE(info);
		else if (ne == columnApplDtl_cst_po_no) doApplDtl_cst_po_no_NE(info);
		else if (ne == columnApplDtl_cst_po_d_no) doApplDtl_cst_po_d_no_NE(info);
		else if (ne == columnApplDtl_dlv_slip_no) doApplDtl_dlv_slip_no_NE(info);
		else if (ne == columnApplDtl_dlv_slip_d_no) doApplDtl_dlv_slip_d_no_NE(info);
		else if (ne == columnApplDtl_ship_dlv_slip_no) doApplDtl_ship_dlv_slip_no_NE(info);
		else if (ne == columnApplDtl_ship_dlv_slip_d_no) doApplDtl_ship_dlv_slip_d_no_NE(info);
		else if (ne == columnApplDtl_ship_dlv_slip_multi_flg) doApplDtl_ship_dlv_slip_multi_flg_NE(info);
		else if (ne == columnApplDtl_arsw_ac_ym) doApplDtl_arsw_ac_ym_NE(info);
		else if (ne == columnApplDtl_arsw_ac_dt) doApplDtl_arsw_ac_dt_NE(info);
		else if (ne == columnApplDtl_arsw_trd_cd) doApplDtl_arsw_trd_cd_NE(info);
		else if (ne == columnApplDtl_arsw_trd_nm) doApplDtl_arsw_trd_nm_NE(info);
		else if (ne == columnApplDtl_arsw_act_no) doApplDtl_arsw_act_no_NE(info);
		else if (ne == columnApplDtl_arsw_act_d_no) doApplDtl_arsw_act_d_no_NE(info);
		else if (ne == columnApplDtl_rcv_act_no) doApplDtl_rcv_act_no_NE(info);
		else if (ne == columnApplDtl_rcv_act_seq) doApplDtl_rcv_act_seq_NE(info);
		else if (ne == columnApplDtl_rcv_act_d_no) doApplDtl_rcv_act_d_no_NE(info);
		else if (ne == columnApplDtl_rcv_act_d_seq) doApplDtl_rcv_act_d_seq_NE(info);
		else if (ne == columnApplDtl_bill_d_no) doApplDtl_bill_d_no_NE(info);
		else if (ne == columnApplDtl_parent_bill_d_no) doApplDtl_parent_bill_d_no_NE(info);
		else if (ne == columnApplDtl_bill_mng_no) doApplDtl_bill_mng_no_NE(info);
		else if (ne == columnApplDtl_bill_d_upd_cntr) doApplDtl_bill_d_upd_cntr_NE(info);
		else if (ne == columnApplDtl_bill_d_appl_bal_upd_cntr) doApplDtl_bill_d_appl_bal_upd_cntr_NE(info);
		else if (ne == columnApplDtl_rcv_act_upd_cntr) doApplDtl_rcv_act_upd_cntr_NE(info);
		else if (ne == Btn_prio_can_red_flg) doBtn_prio_can_red_flg_NE(info);
	}

	/**
	 * [HdrTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_not_bill_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_not_bill_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_otr_slo_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_otr_slo_flg_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[rcv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_rcv_dt_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[rcv_mtd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_rcv_mtd_cd_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[rcv_mtd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_rcv_mtd_nm_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[rcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_rcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[rcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_rcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[bcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_bcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[bcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_bcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[bill_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_bill_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[bill_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_bill_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[acst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_acst_cd_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[acst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_acst_nm_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ar_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ar_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ar_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ar_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[wrk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_wrk_nm_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ar_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ar_typ_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ar_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ar_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[slip_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_slip_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ar_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ar_typ_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ar_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ar_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dlv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dlv_dt_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_ym_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_cl_day]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_cl_day_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_dt_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_no_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_act_no_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[act_d_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_act_d_seq_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[qty_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_qty_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[inc_tax_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_inc_tax_flg_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dest_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dest_cd1_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dest_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dest_nm1_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dest_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dest_cd2_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dest_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dest_nm2_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dest_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dest_cd3_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dest_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dest_nm3_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[sls_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_sls_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[sls_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_sls_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[sls_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_sls_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[sls_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_sls_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[cst_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_cst_po_no_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[cst_po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_cst_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ship_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ship_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ship_dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ship_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ship_dlv_slip_multi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ship_dlv_slip_multi_flg_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[arsw_ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_arsw_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[arsw_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_arsw_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[arsw_trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_arsw_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[arsw_trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_arsw_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[arsw_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_arsw_act_no_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[arsw_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_arsw_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[rcv_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_rcv_act_no_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[rcv_act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_rcv_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[rcv_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_rcv_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[rcv_act_d_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_rcv_act_d_seq_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_d_no_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[parent_bill_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_parent_bill_d_no_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_d_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_d_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_d_appl_bal_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_d_appl_bal_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[rcv_act_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_rcv_act_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[prio_can_red_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_prio_can_red_flg_NE(MCEventInfo info){
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
		else if (nx == ApplDtlTable) doApplDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_rcv_act_d_no) doCnd_rcv_act_d_no_NX(info);
		else if (nx == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NX(info);
		else if (nx == Cnd_ac_dt_to) doCnd_ac_dt_to_NX(info);
		else if (nx == Cnd_inc_not_bill_flg) doCnd_inc_not_bill_flg_NX(info);
		else if (nx == Cnd_inc_otr_slo_flg) doCnd_inc_otr_slo_flg_NX(info);
		else if (nx == RcvActD_rcv_dt) doRcvActD_rcv_dt_NX(info);
		else if (nx == RcvActD_ac_ym) doRcvActD_ac_ym_NX(info);
		else if (nx == RcvActD_ac_dt) doRcvActD_ac_dt_NX(info);
		else if (nx == RcvActD_trd_cd) doRcvActD_trd_cd_NX(info);
		else if (nx == RcvActD_trd_nm) doRcvActD_trd_nm_NX(info);
		else if (nx == RcvActD_slo_no) doRcvActD_slo_no_NX(info);
		else if (nx == RcvActD_iv_no) doRcvActD_iv_no_NX(info);
		else if (nx == RcvActD_rcv_mtd_cd) doRcvActD_rcv_mtd_cd_NX(info);
		else if (nx == RcvActD_rcv_mtd_nm) doRcvActD_rcv_mtd_nm_NX(info);
		else if (nx == RcvActD_rcst_cd) doRcvActD_rcst_cd_NX(info);
		else if (nx == RcvActD_rcst_nm) doRcvActD_rcst_nm_NX(info);
		else if (nx == RcvActD_bcst_cd) doRcvActD_bcst_cd_NX(info);
		else if (nx == RcvActD_bcst_nm) doRcvActD_bcst_nm_NX(info);
		else if (nx == RcvActD_bill_dpt_cd) doRcvActD_bill_dpt_cd_NX(info);
		else if (nx == RcvActD_bill_dpt_nm) doRcvActD_bill_dpt_nm_NX(info);
		else if (nx == RcvActD_acst_cd) doRcvActD_acst_cd_NX(info);
		else if (nx == RcvActD_acst_nm) doRcvActD_acst_nm_NX(info);
		else if (nx == RcvActD_ar_dpt_cd) doRcvActD_ar_dpt_cd_NX(info);
		else if (nx == RcvActD_ar_dpt_nm) doRcvActD_ar_dpt_nm_NX(info);
		else if (nx == RcvActD_wg_cd) doRcvActD_wg_cd_NX(info);
		else if (nx == RcvActD_wg_nm) doRcvActD_wg_nm_NX(info);
		else if (nx == RcvActD_wrk_no) doRcvActD_wrk_no_NX(info);
		else if (nx == RcvActD_wrk_nm) doRcvActD_wrk_nm_NX(info);
		else if (nx == RcvActD_ar_typ) doRcvActD_ar_typ_NX(info);
		else if (nx == RcvActD_ar_typ_nm) doRcvActD_ar_typ_nm_NX(info);
		else if (nx == RcvActD_trd_cur_cd) doRcvActD_trd_cur_cd_NX(info);
		else if (nx == RcvActD_trd_cur_nm) doRcvActD_trd_cur_nm_NX(info);
		else if (nx == RcvActD_amt_dec_place) doRcvActD_amt_dec_place_NX(info);
		else if (nx == RcvActD_upri_dec_place) doRcvActD_upri_dec_place_NX(info);
		else if (nx == RcvActD_ins_usr_id) doRcvActD_ins_usr_id_NX(info);
		else if (nx == RcvActD_ins_usr_nm) doRcvActD_ins_usr_nm_NX(info);
		else if (nx == RcvActD_ins_func_id) doRcvActD_ins_func_id_NX(info);
		else if (nx == RcvActD_ins_func_nm) doRcvActD_ins_func_nm_NX(info);
		else if (nx == RcvActD_upd_usr_id) doRcvActD_upd_usr_id_NX(info);
		else if (nx == RcvActD_upd_usr_nm) doRcvActD_upd_usr_nm_NX(info);
		else if (nx == RcvActD_upd_func_id) doRcvActD_upd_func_id_NX(info);
		else if (nx == RcvActD_upd_func_nm) doRcvActD_upd_func_nm_NX(info);
		else if (nx == RcvActD_ins_ts) doRcvActD_ins_ts_NX(info);
		else if (nx == RcvActD_upd_ts) doRcvActD_upd_ts_NX(info);
		else if (nx == RcvActD_upd_srv_req_no) doRcvActD_upd_srv_req_no_NX(info);
		else if (nx == columnApplDtl_check) doApplDtl_check_NX(info);
		else if (nx == columnApplDtl_ac_ym) doApplDtl_ac_ym_NX(info);
		else if (nx == columnApplDtl_ac_dt) doApplDtl_ac_dt_NX(info);
		else if (nx == columnApplDtl_slip_sts_typ_nm) doApplDtl_slip_sts_typ_nm_NX(info);
		else if (nx == columnApplDtl_trd_cd) doApplDtl_trd_cd_NX(info);
		else if (nx == columnApplDtl_trd_nm) doApplDtl_trd_nm_NX(info);
		else if (nx == columnApplDtl_ar_typ) doApplDtl_ar_typ_NX(info);
		else if (nx == columnApplDtl_ar_typ_nm) doApplDtl_ar_typ_nm_NX(info);
		else if (nx == columnApplDtl_dlv_dt) doApplDtl_dlv_dt_NX(info);
		else if (nx == columnApplDtl_bill_ym) doApplDtl_bill_ym_NX(info);
		else if (nx == columnApplDtl_bill_cl_day) doApplDtl_bill_cl_day_NX(info);
		else if (nx == columnApplDtl_bill_dt) doApplDtl_bill_dt_NX(info);
		else if (nx == columnApplDtl_bill_no) doApplDtl_bill_no_NX(info);
		else if (nx == columnApplDtl_act_no) doApplDtl_act_no_NX(info);
		else if (nx == columnApplDtl_act_seq) doApplDtl_act_seq_NX(info);
		else if (nx == columnApplDtl_act_rev) doApplDtl_act_rev_NX(info);
		else if (nx == columnApplDtl_act_d_no) doApplDtl_act_d_no_NX(info);
		else if (nx == columnApplDtl_act_d_seq) doApplDtl_act_d_seq_NX(info);
		else if (nx == columnApplDtl_trd_unit_cd) doApplDtl_trd_unit_cd_NX(info);
		else if (nx == columnApplDtl_trd_unit_nm) doApplDtl_trd_unit_nm_NX(info);
		else if (nx == columnApplDtl_qty_dec_place) doApplDtl_qty_dec_place_NX(info);
		else if (nx == columnApplDtl_inc_tax_flg) doApplDtl_inc_tax_flg_NX(info);
		else if (nx == columnApplDtl_tax_cd) doApplDtl_tax_cd_NX(info);
		else if (nx == columnApplDtl_tax_nm) doApplDtl_tax_nm_NX(info);
		else if (nx == columnApplDtl_tax_rate) doApplDtl_tax_rate_NX(info);
		else if (nx == columnApplDtl_cst_cd) doApplDtl_cst_cd_NX(info);
		else if (nx == columnApplDtl_cst_nm) doApplDtl_cst_nm_NX(info);
		else if (nx == columnApplDtl_dlv_cd) doApplDtl_dlv_cd_NX(info);
		else if (nx == columnApplDtl_dlv_nm) doApplDtl_dlv_nm_NX(info);
		else if (nx == columnApplDtl_dest_cd1) doApplDtl_dest_cd1_NX(info);
		else if (nx == columnApplDtl_dest_nm1) doApplDtl_dest_nm1_NX(info);
		else if (nx == columnApplDtl_dest_cd2) doApplDtl_dest_cd2_NX(info);
		else if (nx == columnApplDtl_dest_nm2) doApplDtl_dest_nm2_NX(info);
		else if (nx == columnApplDtl_dest_cd3) doApplDtl_dest_cd3_NX(info);
		else if (nx == columnApplDtl_dest_nm3) doApplDtl_dest_nm3_NX(info);
		else if (nx == columnApplDtl_sls_usr_cd) doApplDtl_sls_usr_cd_NX(info);
		else if (nx == columnApplDtl_sls_usr_nm) doApplDtl_sls_usr_nm_NX(info);
		else if (nx == columnApplDtl_sls_dpt_cd) doApplDtl_sls_dpt_cd_NX(info);
		else if (nx == columnApplDtl_sls_dpt_nm) doApplDtl_sls_dpt_nm_NX(info);
		else if (nx == columnApplDtl_slo_no) doApplDtl_slo_no_NX(info);
		else if (nx == columnApplDtl_slo_d_no) doApplDtl_slo_d_no_NX(info);
		else if (nx == columnApplDtl_cst_po_no) doApplDtl_cst_po_no_NX(info);
		else if (nx == columnApplDtl_cst_po_d_no) doApplDtl_cst_po_d_no_NX(info);
		else if (nx == columnApplDtl_dlv_slip_no) doApplDtl_dlv_slip_no_NX(info);
		else if (nx == columnApplDtl_dlv_slip_d_no) doApplDtl_dlv_slip_d_no_NX(info);
		else if (nx == columnApplDtl_ship_dlv_slip_no) doApplDtl_ship_dlv_slip_no_NX(info);
		else if (nx == columnApplDtl_ship_dlv_slip_d_no) doApplDtl_ship_dlv_slip_d_no_NX(info);
		else if (nx == columnApplDtl_ship_dlv_slip_multi_flg) doApplDtl_ship_dlv_slip_multi_flg_NX(info);
		else if (nx == columnApplDtl_arsw_ac_ym) doApplDtl_arsw_ac_ym_NX(info);
		else if (nx == columnApplDtl_arsw_ac_dt) doApplDtl_arsw_ac_dt_NX(info);
		else if (nx == columnApplDtl_arsw_trd_cd) doApplDtl_arsw_trd_cd_NX(info);
		else if (nx == columnApplDtl_arsw_trd_nm) doApplDtl_arsw_trd_nm_NX(info);
		else if (nx == columnApplDtl_arsw_act_no) doApplDtl_arsw_act_no_NX(info);
		else if (nx == columnApplDtl_arsw_act_d_no) doApplDtl_arsw_act_d_no_NX(info);
		else if (nx == columnApplDtl_rcv_act_no) doApplDtl_rcv_act_no_NX(info);
		else if (nx == columnApplDtl_rcv_act_seq) doApplDtl_rcv_act_seq_NX(info);
		else if (nx == columnApplDtl_rcv_act_d_no) doApplDtl_rcv_act_d_no_NX(info);
		else if (nx == columnApplDtl_rcv_act_d_seq) doApplDtl_rcv_act_d_seq_NX(info);
		else if (nx == columnApplDtl_bill_d_no) doApplDtl_bill_d_no_NX(info);
		else if (nx == columnApplDtl_parent_bill_d_no) doApplDtl_parent_bill_d_no_NX(info);
		else if (nx == columnApplDtl_bill_mng_no) doApplDtl_bill_mng_no_NX(info);
		else if (nx == columnApplDtl_bill_d_upd_cntr) doApplDtl_bill_d_upd_cntr_NX(info);
		else if (nx == columnApplDtl_bill_d_appl_bal_upd_cntr) doApplDtl_bill_d_appl_bal_upd_cntr_NX(info);
		else if (nx == columnApplDtl_rcv_act_upd_cntr) doApplDtl_rcv_act_upd_cntr_NX(info);
		else if (nx == Btn_prio_can_red_flg) doBtn_prio_can_red_flg_NX(info);
	}

	/**
	 * [HdrTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_not_bill_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_not_bill_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_otr_slo_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_otr_slo_flg_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[rcv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_rcv_dt_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[rcv_mtd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_rcv_mtd_cd_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[rcv_mtd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_rcv_mtd_nm_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[rcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_rcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[rcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_rcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[bcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_bcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[bcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_bcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[bill_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_bill_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[bill_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_bill_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[acst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_acst_cd_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[acst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_acst_nm_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ar_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ar_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ar_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ar_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[wrk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_wrk_nm_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ar_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ar_typ_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ar_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ar_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[slip_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_slip_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ar_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ar_typ_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ar_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ar_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dlv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dlv_dt_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_ym_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_cl_day]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_cl_day_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_dt_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_no_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_act_no_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[act_d_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_act_d_seq_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[qty_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_qty_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[inc_tax_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_inc_tax_flg_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dest_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dest_cd1_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dest_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dest_nm1_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dest_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dest_cd2_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dest_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dest_nm2_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dest_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dest_cd3_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dest_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dest_nm3_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[sls_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_sls_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[sls_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_sls_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[sls_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_sls_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[sls_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_sls_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[cst_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_cst_po_no_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[cst_po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_cst_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ship_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ship_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ship_dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ship_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ship_dlv_slip_multi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ship_dlv_slip_multi_flg_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[arsw_ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_arsw_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[arsw_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_arsw_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[arsw_trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_arsw_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[arsw_trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_arsw_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[arsw_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_arsw_act_no_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[arsw_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_arsw_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[rcv_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_rcv_act_no_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[rcv_act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_rcv_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[rcv_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_rcv_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[rcv_act_d_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_rcv_act_d_seq_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_d_no_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[parent_bill_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_parent_bill_d_no_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_d_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_d_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_d_appl_bal_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_d_appl_bal_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[rcv_act_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_rcv_act_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[prio_can_red_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_prio_can_red_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_rcv_act_d_no) doCnd_rcv_act_d_no_LC(info);
		else if (lc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_LC(info);
		else if (lc == Cnd_ac_dt_to) doCnd_ac_dt_to_LC(info);
		else if (lc == RcvActD_rcv_dt) doRcvActD_rcv_dt_LC(info);
		else if (lc == RcvActD_ac_ym) doRcvActD_ac_ym_LC(info);
		else if (lc == RcvActD_ac_dt) doRcvActD_ac_dt_LC(info);
		else if (lc == RcvActD_trd_cd) doRcvActD_trd_cd_LC(info);
		else if (lc == RcvActD_trd_nm) doRcvActD_trd_nm_LC(info);
		else if (lc == RcvActD_slo_no) doRcvActD_slo_no_LC(info);
		else if (lc == RcvActD_iv_no) doRcvActD_iv_no_LC(info);
		else if (lc == RcvActD_rcv_mtd_cd) doRcvActD_rcv_mtd_cd_LC(info);
		else if (lc == RcvActD_rcv_mtd_nm) doRcvActD_rcv_mtd_nm_LC(info);
		else if (lc == RcvActD_rcst_cd) doRcvActD_rcst_cd_LC(info);
		else if (lc == RcvActD_rcst_nm) doRcvActD_rcst_nm_LC(info);
		else if (lc == RcvActD_bcst_cd) doRcvActD_bcst_cd_LC(info);
		else if (lc == RcvActD_bcst_nm) doRcvActD_bcst_nm_LC(info);
		else if (lc == RcvActD_bill_dpt_cd) doRcvActD_bill_dpt_cd_LC(info);
		else if (lc == RcvActD_bill_dpt_nm) doRcvActD_bill_dpt_nm_LC(info);
		else if (lc == RcvActD_acst_cd) doRcvActD_acst_cd_LC(info);
		else if (lc == RcvActD_acst_nm) doRcvActD_acst_nm_LC(info);
		else if (lc == RcvActD_ar_dpt_cd) doRcvActD_ar_dpt_cd_LC(info);
		else if (lc == RcvActD_ar_dpt_nm) doRcvActD_ar_dpt_nm_LC(info);
		else if (lc == RcvActD_wg_cd) doRcvActD_wg_cd_LC(info);
		else if (lc == RcvActD_wg_nm) doRcvActD_wg_nm_LC(info);
		else if (lc == RcvActD_wrk_no) doRcvActD_wrk_no_LC(info);
		else if (lc == RcvActD_wrk_nm) doRcvActD_wrk_nm_LC(info);
		else if (lc == RcvActD_ar_typ) doRcvActD_ar_typ_LC(info);
		else if (lc == RcvActD_ar_typ_nm) doRcvActD_ar_typ_nm_LC(info);
		else if (lc == RcvActD_trd_cur_cd) doRcvActD_trd_cur_cd_LC(info);
		else if (lc == RcvActD_trd_cur_nm) doRcvActD_trd_cur_nm_LC(info);
		else if (lc == RcvActD_amt_dec_place) doRcvActD_amt_dec_place_LC(info);
		else if (lc == RcvActD_upri_dec_place) doRcvActD_upri_dec_place_LC(info);
		else if (lc == RcvActD_ins_usr_id) doRcvActD_ins_usr_id_LC(info);
		else if (lc == RcvActD_ins_usr_nm) doRcvActD_ins_usr_nm_LC(info);
		else if (lc == RcvActD_ins_func_id) doRcvActD_ins_func_id_LC(info);
		else if (lc == RcvActD_ins_func_nm) doRcvActD_ins_func_nm_LC(info);
		else if (lc == RcvActD_upd_usr_id) doRcvActD_upd_usr_id_LC(info);
		else if (lc == RcvActD_upd_usr_nm) doRcvActD_upd_usr_nm_LC(info);
		else if (lc == RcvActD_upd_func_id) doRcvActD_upd_func_id_LC(info);
		else if (lc == RcvActD_upd_func_nm) doRcvActD_upd_func_nm_LC(info);
		else if (lc == RcvActD_ins_ts) doRcvActD_ins_ts_LC(info);
		else if (lc == RcvActD_upd_ts) doRcvActD_upd_ts_LC(info);
		else if (lc == RcvActD_upd_srv_req_no) doRcvActD_upd_srv_req_no_LC(info);
		else if (lc == columnApplDtl_ac_ym) doApplDtl_ac_ym_LC(info);
		else if (lc == columnApplDtl_ac_dt) doApplDtl_ac_dt_LC(info);
		else if (lc == columnApplDtl_slip_sts_typ_nm) doApplDtl_slip_sts_typ_nm_LC(info);
		else if (lc == columnApplDtl_trd_cd) doApplDtl_trd_cd_LC(info);
		else if (lc == columnApplDtl_trd_nm) doApplDtl_trd_nm_LC(info);
		else if (lc == columnApplDtl_ar_typ) doApplDtl_ar_typ_LC(info);
		else if (lc == columnApplDtl_ar_typ_nm) doApplDtl_ar_typ_nm_LC(info);
		else if (lc == columnApplDtl_dlv_dt) doApplDtl_dlv_dt_LC(info);
		else if (lc == columnApplDtl_bill_ym) doApplDtl_bill_ym_LC(info);
		else if (lc == columnApplDtl_bill_cl_day) doApplDtl_bill_cl_day_LC(info);
		else if (lc == columnApplDtl_bill_dt) doApplDtl_bill_dt_LC(info);
		else if (lc == columnApplDtl_bill_no) doApplDtl_bill_no_LC(info);
		else if (lc == columnApplDtl_act_no) doApplDtl_act_no_LC(info);
		else if (lc == columnApplDtl_act_seq) doApplDtl_act_seq_LC(info);
		else if (lc == columnApplDtl_act_rev) doApplDtl_act_rev_LC(info);
		else if (lc == columnApplDtl_act_d_no) doApplDtl_act_d_no_LC(info);
		else if (lc == columnApplDtl_act_d_seq) doApplDtl_act_d_seq_LC(info);
		else if (lc == columnApplDtl_trd_unit_cd) doApplDtl_trd_unit_cd_LC(info);
		else if (lc == columnApplDtl_trd_unit_nm) doApplDtl_trd_unit_nm_LC(info);
		else if (lc == columnApplDtl_qty_dec_place) doApplDtl_qty_dec_place_LC(info);
		else if (lc == columnApplDtl_tax_cd) doApplDtl_tax_cd_LC(info);
		else if (lc == columnApplDtl_tax_nm) doApplDtl_tax_nm_LC(info);
		else if (lc == columnApplDtl_tax_rate) doApplDtl_tax_rate_LC(info);
		else if (lc == columnApplDtl_cst_cd) doApplDtl_cst_cd_LC(info);
		else if (lc == columnApplDtl_cst_nm) doApplDtl_cst_nm_LC(info);
		else if (lc == columnApplDtl_dlv_cd) doApplDtl_dlv_cd_LC(info);
		else if (lc == columnApplDtl_dlv_nm) doApplDtl_dlv_nm_LC(info);
		else if (lc == columnApplDtl_dest_cd1) doApplDtl_dest_cd1_LC(info);
		else if (lc == columnApplDtl_dest_nm1) doApplDtl_dest_nm1_LC(info);
		else if (lc == columnApplDtl_dest_cd2) doApplDtl_dest_cd2_LC(info);
		else if (lc == columnApplDtl_dest_nm2) doApplDtl_dest_nm2_LC(info);
		else if (lc == columnApplDtl_dest_cd3) doApplDtl_dest_cd3_LC(info);
		else if (lc == columnApplDtl_dest_nm3) doApplDtl_dest_nm3_LC(info);
		else if (lc == columnApplDtl_sls_usr_cd) doApplDtl_sls_usr_cd_LC(info);
		else if (lc == columnApplDtl_sls_usr_nm) doApplDtl_sls_usr_nm_LC(info);
		else if (lc == columnApplDtl_sls_dpt_cd) doApplDtl_sls_dpt_cd_LC(info);
		else if (lc == columnApplDtl_sls_dpt_nm) doApplDtl_sls_dpt_nm_LC(info);
		else if (lc == columnApplDtl_slo_no) doApplDtl_slo_no_LC(info);
		else if (lc == columnApplDtl_slo_d_no) doApplDtl_slo_d_no_LC(info);
		else if (lc == columnApplDtl_cst_po_no) doApplDtl_cst_po_no_LC(info);
		else if (lc == columnApplDtl_cst_po_d_no) doApplDtl_cst_po_d_no_LC(info);
		else if (lc == columnApplDtl_dlv_slip_no) doApplDtl_dlv_slip_no_LC(info);
		else if (lc == columnApplDtl_dlv_slip_d_no) doApplDtl_dlv_slip_d_no_LC(info);
		else if (lc == columnApplDtl_ship_dlv_slip_no) doApplDtl_ship_dlv_slip_no_LC(info);
		else if (lc == columnApplDtl_ship_dlv_slip_d_no) doApplDtl_ship_dlv_slip_d_no_LC(info);
		else if (lc == columnApplDtl_arsw_ac_ym) doApplDtl_arsw_ac_ym_LC(info);
		else if (lc == columnApplDtl_arsw_ac_dt) doApplDtl_arsw_ac_dt_LC(info);
		else if (lc == columnApplDtl_arsw_trd_cd) doApplDtl_arsw_trd_cd_LC(info);
		else if (lc == columnApplDtl_arsw_trd_nm) doApplDtl_arsw_trd_nm_LC(info);
		else if (lc == columnApplDtl_arsw_act_no) doApplDtl_arsw_act_no_LC(info);
		else if (lc == columnApplDtl_arsw_act_d_no) doApplDtl_arsw_act_d_no_LC(info);
		else if (lc == columnApplDtl_rcv_act_no) doApplDtl_rcv_act_no_LC(info);
		else if (lc == columnApplDtl_rcv_act_seq) doApplDtl_rcv_act_seq_LC(info);
		else if (lc == columnApplDtl_rcv_act_d_no) doApplDtl_rcv_act_d_no_LC(info);
		else if (lc == columnApplDtl_rcv_act_d_seq) doApplDtl_rcv_act_d_seq_LC(info);
		else if (lc == columnApplDtl_bill_d_no) doApplDtl_bill_d_no_LC(info);
		else if (lc == columnApplDtl_parent_bill_d_no) doApplDtl_parent_bill_d_no_LC(info);
		else if (lc == columnApplDtl_bill_mng_no) doApplDtl_bill_mng_no_LC(info);
		else if (lc == columnApplDtl_bill_d_upd_cntr) doApplDtl_bill_d_upd_cntr_LC(info);
		else if (lc == columnApplDtl_bill_d_appl_bal_upd_cntr) doApplDtl_bill_d_appl_bal_upd_cntr_LC(info);
		else if (lc == columnApplDtl_rcv_act_upd_cntr) doApplDtl_rcv_act_upd_cntr_LC(info);
	}

	/**
	 * [Cnd]パネルの[rcv_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[rcv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_rcv_dt_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[rcv_mtd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_rcv_mtd_cd_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[rcv_mtd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_rcv_mtd_nm_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[rcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_rcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[rcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_rcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[bcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_bcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[bcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_bcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[bill_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_bill_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[bill_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_bill_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[acst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_acst_cd_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[acst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_acst_nm_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ar_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ar_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ar_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ar_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[wrk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_wrk_nm_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ar_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ar_typ_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ar_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ar_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [RcvActD]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRcvActD_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[slip_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_slip_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ar_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ar_typ_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ar_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ar_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dlv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dlv_dt_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_ym_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_cl_day]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_cl_day_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_dt_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_no_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_act_no_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[act_d_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_act_d_seq_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[qty_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_qty_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_tax_rate_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dest_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dest_cd1_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dest_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dest_nm1_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dest_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dest_cd2_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dest_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dest_nm2_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dest_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dest_cd3_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dest_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dest_nm3_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[sls_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_sls_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[sls_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_sls_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[sls_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_sls_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[sls_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_sls_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[cst_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_cst_po_no_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[cst_po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_cst_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ship_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ship_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[ship_dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_ship_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[arsw_ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_arsw_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[arsw_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_arsw_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[arsw_trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_arsw_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[arsw_trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_arsw_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[arsw_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_arsw_act_no_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[arsw_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_arsw_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[rcv_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_rcv_act_no_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[rcv_act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_rcv_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[rcv_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_rcv_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[rcv_act_d_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_rcv_act_d_seq_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_d_no_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[parent_bill_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_parent_bill_d_no_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_d_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_d_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[bill_d_appl_bal_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_bill_d_appl_bal_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [ApplDtl]パネルの[rcv_act_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doApplDtl_rcv_act_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[columnApplDtl_ar_typ]の作成メソッド
	 */
	public MCList getApplDtl_ar_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnApplDtl_trd_unit_cd]の作成メソッド
	 */
	public MCList getApplDtl_trd_unit_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnApplDtl_tax_cd]の作成メソッド
	 */
	public MCList getApplDtl_tax_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnApplDtl_cst_cd]の作成メソッド
	 */
	public MCList getApplDtl_cst_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnApplDtl_dlv_cd]の作成メソッド
	 */
	public MCList getApplDtl_dlv_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnApplDtl_dest_cd1]の作成メソッド
	 */
	public MCList getApplDtl_dest_cd1(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnApplDtl_dest_cd2]の作成メソッド
	 */
	public MCList getApplDtl_dest_cd2(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnApplDtl_dest_cd3]の作成メソッド
	 */
	public MCList getApplDtl_dest_cd3(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnApplDtl_sls_usr_cd]の作成メソッド
	 */
	public MCList getApplDtl_sls_usr_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnApplDtl_sls_dpt_cd]の作成メソッド
	 */
	public MCList getApplDtl_sls_dpt_cd(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBGL0220.Srch01")) {
			return new MS_MSBGL0220_Srch01Bridge();
		}
		if (id.equals("MS.MSBGL0220.Upd01")) {
			return new MS_MSBGL0220_Upd01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBGL0220_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0220_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0220_Srch01;

		/** コンストラクタ */
		protected MS_MSBGL0220_Srch01Bridge() {
			p_MS_MSBGL0220_Srch01 = new MCParam(PDef.MS_MSBGL0220_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0220_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0220.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBG.MSBGP0220.RcvActDR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0220.ApplDtlR.class));

			p_MS_MSBGL0220_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0220_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0220_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0220_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0220_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0220.CndR up0() {
			return (mcframe.clientMSBG.MSBGP0220.CndR)up(0);
		}

		protected mcframe.clientMSBG.MSBGP0220.RcvActDR down0() {
			return (mcframe.clientMSBG.MSBGP0220.RcvActDR)down(0);
		}
		protected MCList<mcframe.clientMSBG.MSBGP0220.ApplDtlR> down1() {
			return (MCList<mcframe.clientMSBG.MSBGP0220.ApplDtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0220_Srch01.addDownBlock(mcframe.clientMSBG.MSBGP0220.RcvActDR.create());
			p_MS_MSBGL0220_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0220.ApplDtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0220_Srch01;
		}

		protected void show() {
			setRcvActDR((mcframe.clientMSBG.MSBGP0220.RcvActDR)p_MS_MSBGL0220_Srch01.getContainerParam().getDownBlock(0));
			setApplDtlL((MCList<mcframe.clientMSBG.MSBGP0220.ApplDtlR>)p_MS_MSBGL0220_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getRcvActDR().clear();
			getApplDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRcvActDR());
			result.add(getApplDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBGL0220_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0220_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0220_Upd01;

		/** コンストラクタ */
		protected MS_MSBGL0220_Upd01Bridge() {
			p_MS_MSBGL0220_Upd01 = new MCParam(PDef.MS_MSBGL0220_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0220_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBG.MSBGP0220.ApplDtlR.class));
			// Down

			p_MS_MSBGL0220_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0220_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0220_Upd01.addUpBlock(getApplDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0220_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0220_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBG.MSBGP0220.ApplDtlR> up0() {
			return (MCList<mcframe.clientMSBG.MSBGP0220.ApplDtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBGL0220_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getApplDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}