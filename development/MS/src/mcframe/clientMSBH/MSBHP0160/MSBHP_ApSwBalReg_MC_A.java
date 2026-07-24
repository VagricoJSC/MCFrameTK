package mcframe.clientMSBH.MSBHP0160;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
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
import mcframe.clientMSBH.MSBHP0160.MSBHP_ApSwBalReg_MC.MS_MSBHL0160_Srch01Caller;
import mcframe.clientMSBH.MSBHP0160.MSBHP_ApSwBalReg_MC.MS_MSBHL0160_Srch02Caller;
import mcframe.clientMSBH.MSBHP0160.MSBHP_ApSwBalReg_MC.MS_MSBHL0160_Upd01Caller;
import mcframe.clientMSBH.MSBHP0160.MSBHP_ApSwBalReg_MC.MS_MSBHL0160_Upd02Caller;

/**
 * 画面"MSBHP_ApSwBalReg"パネルクラスです。<p>
 *
 * 支払依頼、支払予定の振替を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHP_ApSwBalReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBH";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBHP0160";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Typ]ブロック関連のField定義
	public MCPanel TypPanel = null;
	public MCTitledBorder TypTitledBorder = null;
	// [Typ]ブロックの項目のField定義
	/**
	 * chk_bal, Collated balance transfer, 0; not_chk, Uncollated balance transfer, 1 chk_bal,照合済残高振替,0;not_chk,未照合残高振替,1.<p>
	 *
	 */
	public MCButtonGroup Typ_typ_Group = null;
	public MCRadioButton Typ_typ_chk_bal = null;
	public MCRadioButton Typ_typ_not_chk = null;
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_bsppl_cd_Label = null;
	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_cd = null;
	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_nm = null;
	public MCLabel Cnd_trd_cur_cd_Label = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_trd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCTextField Cnd_trd_cur_nm = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Cnd_amt_dec_place = null;
	public MCLabel Cnd_bsppl_dpt_cd_Label = null;
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_dpt_cd = null;
	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_dpt_nm = null;
	public MCLabel Cnd_asppl_cd_Label = null;
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_asppl_cd = null;
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public MCTextField Cnd_asppl_nm = null;
	public MCLabel Cnd_ap_dpt_cd_Label = null;
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_ap_dpt_cd = null;
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public MCTextField Cnd_ap_dpt_nm = null;
	public MCLabel Cnd_wg_cd_Label = null;
	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_wg_cd = null;
	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public MCTextField Cnd_wg_nm = null;
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Cnd_wrk_no_p_PPanel;
	public MCTextField Cnd_wrk_no;	// [Cnd]の[wrk_no_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[wrk_no_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_ap_typ_Label = null;
	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ap_typ = null;
	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public MCTextField Cnd_ap_typ_nm = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [SwFr]ブロック関連のField定義
	public MCPanel SwFrPanel = null;
	public MCTitledBorder SwFrTitledBorder = null;
	public MCScrollPane SwFrScrollPane = null;
	public MCTable2<mcframe.clientMSBH.MSBHP0160.SwFrR> SwFrTable = null;
	// [SwFr]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_check = null;
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_asppl_cd = null;
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_asppl_nm = null;
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_ap_dpt_cd = null;
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_ap_dpt_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_wg_nm = null;
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_bsppl_dpt_cd = null;
	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_bsppl_dpt_nm = null;
	/**
	 * Status 状況.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_slip_sts_typ_nm = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_trd_nm = null;
	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_ap_sttl_cd = null;
	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_ap_sttl_nm = null;
	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_ap_sttl_typ = null;
	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_ap_sttl_typ_nm = null;
	/**
	 * Result No. 実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_act_no = null;
	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_act_rev = null;
	/**
	 * Result details No. 実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_act_d_no = null;
	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_purc_dpt_cd = null;
	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_purc_dpt_nm = null;
	/**
	 * AP details No. 買掛明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_ap_d_no = null;
	/**
	 * Transfer source payment schedule No. 振替元支払予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_sw_src_pay_schd_no = null;
	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_pay_schd_no = null;
	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_pay_chk_mng_no = null;
	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_pay_chk_no = null;
	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_pay_basis_dt = null;
	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_pay_crryovr_times = null;
	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_pay_schd_dt = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D SwFr_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnSwFr_inc_tax_amt;// [SwFr]の[inc_tax_amt_p.amt]を[columnSwFr_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D SwFr_tgt_sw_amt_p_PPanel;
	public MCColumnConfig columnSwFr_tgt_sw_amt;// [SwFr]の[tgt_sw_amt_p.amt]を[columnSwFr_tgt_sw_amt]としてエイリアス定義。
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_interim_flg = null;
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_wrk_no = null;
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_wrk_nm = null;
	/**
	 * Project No. at the time of purchase 仕入時案件ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_purc_wrk_no = null;
	/**
	 * Project name at the time of purchase 仕入時案件名.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_purc_wrk_nm = null;
	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_ap_typ = null;
	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_ap_typ_nm = null;
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_xrate = null;
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_ac_ym = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_ac_dt = null;
	/**
	 * Scheduled payee closing year and month 支払予定管理先締年月.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_bsppl_cl_ym = null;
	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_bsppl_cl_day = null;
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_purc_act_no = null;
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_rcpt_iv_no = null;
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_rcpt_iv_mng_no = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_sppl_nm = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_po_no = null;
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_po_d_no = null;
	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_bp_dlv_slip_no = null;
	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_bp_dlv_slip_d_no = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_trd_cur_cd = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_amt_dec_place = null;
	// [Sw]ブロック関連のField定義
	public MCPanel SwPanel = null;
	public MCTitledBorder SwTitledBorder = null;
	// [Sw]ブロックの項目のField定義
	public MCLabel Sw_sw_dt_Label = null;
	/**
	 * Transfer date 振替日.<p>
	 *
	 */
	public MCDateField Sw_sw_dt = null;
	public MCLabel Sw_ac_dt_Label = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDateField Sw_ac_dt = null;
	public MCLabel Sw_pay_basis_dt_Label = null;
	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public MCDateField Sw_pay_basis_dt = null;
	public MCLabel Sw_pay_crryovr_times_Label = null;
	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCNumberField Sw_pay_crryovr_times = null;
	public MCLabel Sw_pay_schd_dt_Label = null;
	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCDateField Sw_pay_schd_dt = null;
	public MCLabel Sw_ap_sttl_cd_Label = null;
	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Sw_ap_sttl_cd = null;
	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public MCTextField Sw_ap_sttl_nm = null;
	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public MCTextField Sw_ap_sttl_typ = null;
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H Sw_usr_dpt_p_PPanel;
	public MCTextField Sw_usr_cd;	// [Sw]の[usr_dpt_p.usr_cd]を[Sw_usr_cd]としてエイリアス定義。
	public MCTextField Sw_usr_nm;	// [Sw]の[usr_dpt_p.usr_nm]を[Sw_usr_nm]としてエイリアス定義。
	public MCTextComboBox Sw_dpt_cd;	// [Sw]の[usr_dpt_p.dpt_cd]を[Sw_dpt_cd]としてエイリアス定義。
	public MCTextField Sw_dpt_nm;	// [Sw]の[usr_dpt_p.dpt_nm]を[Sw_dpt_nm]としてエイリアス定義。
	public MCLabel Sw_trd_rmrks_Label = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCTextField Sw_trd_rmrks = null;
	public MCLabel Sw_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Sw_sub_char1 = null;
	public MCLabel Sw_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Sw_sub_char2 = null;
	public MCLabel Sw_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Sw_sub_char3 = null;
	// [SwTo]ブロック関連のField定義
	public MCPanel SwToPanel = null;
	public MCTitledBorder SwToTitledBorder = null;
	// [SwTo]ブロックの項目のField定義
	public MCLabel SwTo_asppl_cd_Label = null;
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public MCTextField SwTo_asppl_cd = null;
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public MCTextField SwTo_asppl_nm = null;
	public MCLabel SwTo_ap_dpt_cd_Label = null;
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public MCTextField SwTo_ap_dpt_cd = null;
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public MCTextField SwTo_ap_dpt_nm = null;
	public MCLabel SwTo_bsppl_cd_Label = null;
	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public MCTextField SwTo_bsppl_cd = null;
	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public MCTextField SwTo_bsppl_nm = null;
	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public MCCheckBox SwTo_pay_spot_flg = null;
	public MCLabel SwTo_bsppl_dpt_cd_Label = null;
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox SwTo_bsppl_dpt_cd = null;
	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public MCTextField SwTo_bsppl_dpt_nm = null;
	public MCLabel SwTo_ap_wrk_ope_typ_Label = null;
	/**
	 * Sales project process type 案件処理区分.<p>
	 *
	 */
	public MCTextComboBox SwTo_ap_wrk_ope_typ = null;
	/**
	 * Sales project process type name 案件処理区分名.<p>
	 *
	 */
	public MCTextField SwTo_ap_wrk_ope_typ_nm = null;
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H SwTo_wrk_no_p_PPanel;
	public MCTextField SwTo_wrk_no;	// [SwTo]の[wrk_no_p.wrk_no]を[SwTo_wrk_no]としてエイリアス定義。
	public MCTextField SwTo_wrk_nm;	// [SwTo]の[wrk_no_p.wrk_nm]を[SwTo_wrk_nm]としてエイリアス定義。
	public MCLabel SwTo_trd_cur_cd_Label = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextField SwTo_trd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCTextField SwTo_trd_cur_nm = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField SwTo_amt_dec_place = null;
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H SwTo_tgt_sw_amt_p_PPanel;
	public MCNumberField SwTo_tgt_sw_amt;	// [SwTo]の[tgt_sw_amt_p.amt]を[SwTo_tgt_sw_amt]としてエイリアス定義。
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
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, UPD, FIX_U};
	
	/** [MS_MSBHL0160_Srch01]のCallerの作成 */
	protected MSBHP_ApSwBalReg_MC.MS_MSBHL0160_Srch01Caller createMS_MSBHL0160_Srch01() {
		MSBHP_ApSwBalReg_MC.MS_MSBHL0160_Srch01Caller<MSBHP_ApSwBalReg, MS_MSBHL0160_Srch01Bridge>
		caller = ((MSBHP_ApSwBalReg_MC)this).new MS_MSBHL0160_Srch01Caller<MSBHP_ApSwBalReg, MS_MSBHL0160_Srch01Bridge>(
					(MSBHP_ApSwBalReg)this, new MS_MSBHL0160_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBHL0160_Srch01]の呼び出し */
	protected void callMS_MSBHL0160_Srch01() {
		MCCaller caller = createMS_MSBHL0160_Srch01();
		caller.exec();
	}
	/** [MS_MSBHL0160_Srch02]のCallerの作成 */
	protected MSBHP_ApSwBalReg_MC.MS_MSBHL0160_Srch02Caller createMS_MSBHL0160_Srch02() {
		MSBHP_ApSwBalReg_MC.MS_MSBHL0160_Srch02Caller<MSBHP_ApSwBalReg, MS_MSBHL0160_Srch02Bridge>
		caller = ((MSBHP_ApSwBalReg_MC)this).new MS_MSBHL0160_Srch02Caller<MSBHP_ApSwBalReg, MS_MSBHL0160_Srch02Bridge>(
					(MSBHP_ApSwBalReg)this, new MS_MSBHL0160_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBHL0160_Srch02]の呼び出し */
	protected void callMS_MSBHL0160_Srch02() {
		MCCaller caller = createMS_MSBHL0160_Srch02();
		caller.exec();
	}
	/** [MS_MSBHL0160_Upd01]のCallerの作成 */
	protected MSBHP_ApSwBalReg_MC.MS_MSBHL0160_Upd01Caller createMS_MSBHL0160_Upd01() {
		MSBHP_ApSwBalReg_MC.MS_MSBHL0160_Upd01Caller<MSBHP_ApSwBalReg, MS_MSBHL0160_Upd01Bridge>
		caller = ((MSBHP_ApSwBalReg_MC)this).new MS_MSBHL0160_Upd01Caller<MSBHP_ApSwBalReg, MS_MSBHL0160_Upd01Bridge>(
					(MSBHP_ApSwBalReg)this, new MS_MSBHL0160_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBHL0160_Upd01]の呼び出し */
	protected void callMS_MSBHL0160_Upd01() {
		MCCaller caller = createMS_MSBHL0160_Upd01();
		caller.exec();
	}
	/** [MS_MSBHL0160_Upd02]のCallerの作成 */
	protected MSBHP_ApSwBalReg_MC.MS_MSBHL0160_Upd02Caller createMS_MSBHL0160_Upd02() {
		MSBHP_ApSwBalReg_MC.MS_MSBHL0160_Upd02Caller<MSBHP_ApSwBalReg, MS_MSBHL0160_Upd02Bridge>
		caller = ((MSBHP_ApSwBalReg_MC)this).new MS_MSBHL0160_Upd02Caller<MSBHP_ApSwBalReg, MS_MSBHL0160_Upd02Bridge>(
					(MSBHP_ApSwBalReg)this, new MS_MSBHL0160_Upd02Bridge());
		return caller;
	}
	/** [MS_MSBHL0160_Upd02]の呼び出し */
	protected void callMS_MSBHL0160_Upd02() {
		MCCaller caller = createMS_MSBHL0160_Upd02();
		caller.exec();
	}
	/** [Typ]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0160.TypR aTypR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0160.CndR aCndR;
	/** [SwFr]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBH.MSBHP0160.SwFrR> aSwFrL;
	/** [Sw]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0160.SwR aSwR;
	/** [SwTo]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0160.SwToR aSwToR;

	/**
	 * 項目コピーによってaTypRを設定します。
	 *
	 * aTypRのインスタンスは変更されません。
	 *
	 * @param row TypR
	 */
	public void setTypR(mcframe.clientMSBH.MSBHP0160.TypR row) {
		if (row != null) {
			MCRow.copyall(getTypR(), row);
		}
	}

	/**
	 * [Typ]ブロックのコンテナaTypRを返します。
	 *
	 * @return TypR
	 */
	public mcframe.clientMSBH.MSBHP0160.TypR getTypR() {
		return aTypR;
	}

	/**
	 * aTypRを作成します。
	 *
	 * @return TypR
	 */
	public mcframe.clientMSBH.MSBHP0160.TypR createTypR() {
		return mcframe.clientMSBH.MSBHP0160.TypR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBH.MSBHP0160.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBH.MSBHP0160.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBH.MSBHP0160.CndR createCndR() {
		return mcframe.clientMSBH.MSBHP0160.CndR.create();
	}

	/**
	 * コピーによってaSwFrLを設定します。
	 *
	 * aSwFrLのインスタンスは変更されません。
	 *
	 * @param dataset SwFrL
	 */
	public void setSwFrL(MCList<mcframe.clientMSBH.MSBHP0160.SwFrR> aList) {
		if (getSwFrL() != aList) {
			getSwFrL().setAll(aList);
		}
	}

	/**
	 * [SwFr]ブロックのコンテナaSwFrLを返します。
	 *
	 * @return SwFrL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0160.SwFrR> getSwFrL() {
		return aSwFrL;
	}

	/**
	 * aSwFrRを作成します。
	 *
	 * @return SwFrR
	 */
	public mcframe.clientMSBH.MSBHP0160.SwFrR createSwFrR() {
		return mcframe.clientMSBH.MSBHP0160.SwFrR.create();
	}

	/**
	 * aSwFrLを作成します。
	 *
	 * @return SwFrL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0160.SwFrR> createSwFrL() {
		return MCList.create(mcframe.clientMSBH.MSBHP0160.SwFrR.class);
	}

	/**
	 * SwFrTableを初期化します。
	 */
	protected void createSwFrTable(){
		if(SwFrTable == null){
			SwFrTable = beansFactory.createTable2("SwFr.table");
		}
	}

	/**
	 * 項目コピーによってaSwRを設定します。
	 *
	 * aSwRのインスタンスは変更されません。
	 *
	 * @param row SwR
	 */
	public void setSwR(mcframe.clientMSBH.MSBHP0160.SwR row) {
		if (row != null) {
			MCRow.copyall(getSwR(), row);
		}
	}

	/**
	 * [Sw]ブロックのコンテナaSwRを返します。
	 *
	 * @return SwR
	 */
	public mcframe.clientMSBH.MSBHP0160.SwR getSwR() {
		return aSwR;
	}

	/**
	 * aSwRを作成します。
	 *
	 * @return SwR
	 */
	public mcframe.clientMSBH.MSBHP0160.SwR createSwR() {
		return mcframe.clientMSBH.MSBHP0160.SwR.create();
	}

	/**
	 * 項目コピーによってaSwToRを設定します。
	 *
	 * aSwToRのインスタンスは変更されません。
	 *
	 * @param row SwToR
	 */
	public void setSwToR(mcframe.clientMSBH.MSBHP0160.SwToR row) {
		if (row != null) {
			MCRow.copyall(getSwToR(), row);
		}
	}

	/**
	 * [SwTo]ブロックのコンテナaSwToRを返します。
	 *
	 * @return SwToR
	 */
	public mcframe.clientMSBH.MSBHP0160.SwToR getSwToR() {
		return aSwToR;
	}

	/**
	 * aSwToRを作成します。
	 *
	 * @return SwToR
	 */
	public mcframe.clientMSBH.MSBHP0160.SwToR createSwToR() {
		return mcframe.clientMSBH.MSBHP0160.SwToR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getTypR())) ret.add(getTypR());
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getSwFrL())) ret.add(getSwFrL());
		if(!MCCollectionUtil.contains(ret, getSwR())) ret.add(getSwR());
		if(!MCCollectionUtil.contains(ret, getSwToR())) ret.add(getSwToR());
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
		if(aCnt == getTypR()) return "Typ";
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getSwFrL()) return "SwFr";
		if(aCnt == getSwR()) return "Sw";
		if(aCnt == getSwToR()) return "SwTo";
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
		if(bId.equals("Typ")) return getTypR();
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("SwFr")) return getSwFrL();
		if(bId.equals("Sw")) return getSwR();
		if(bId.equals("SwTo")) return getSwToR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(TypPanel);
		ret.add(TopPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(SwFrPanel);
		ret.add(SwPanel);
		ret.add(SwToPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBHP_ApSwBalReg_MC_A() {
		aTypR = createTypR();
		aCndR = createCndR();
		aSwFrL = createSwFrL();
		aSwR = createSwR();
		aSwToR = createSwToR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBHP_ApSwBalReg_MC_A(String name) {
		aTypR = createTypR();
		aCndR = createCndR();
		aSwFrL = createSwFrL();
		createSwFrTable();
		SwFrTable.setRowName(name);
		aSwR = createSwR();
		aSwToR = createSwToR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBHP_ApSwBalReg_MC.jbCreateTyp((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.jbCreateTop((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.jbCreateCnd((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.jbCreateCtrl((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.jbCreateSwFr((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.jbCreateSw((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.jbCreateSwTo((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.jbCreateBtn((MSBHP_ApSwBalReg)this);
	}

	/**
	 * [Typ]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTyp(MSBHP_ApSwBalReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBHP_ApSwBalReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBHP_ApSwBalReg p) {
		p.Cnd_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getCndR().wrk_no_p());
		p.Cnd_wrk_no_p_PPanel.setName("Cnd.wrk_no_p");
		p.Cnd_wrk_no = p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_no;
		p.Cnd_wrk_no.addAliasName("Cnd.wrk_no", p);
		p.Cnd_wrk_nm = p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_nm;
		p.Cnd_wrk_nm.addAliasName("Cnd.wrk_nm", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBHP_ApSwBalReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [SwFr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSwFr(MSBHP_ApSwBalReg p) {
		p.SwFr_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0160.SwFrR.$inc_tax_amt_p);
		p.SwFr_inc_tax_amt_p_PPanel.setName("SwFr.inc_tax_amt_p");
		p.columnSwFr_inc_tax_amt = p.SwFr_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnSwFr_inc_tax_amt.addAliasName("SwFr.inc_tax_amt", p);
		p.SwFr_tgt_sw_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0160.SwFrR.$tgt_sw_amt_p);
		p.SwFr_tgt_sw_amt_p_PPanel.setName("SwFr.tgt_sw_amt_p");
		p.columnSwFr_tgt_sw_amt = p.SwFr_tgt_sw_amt_p_PPanel.columnAmt_amt;
		p.columnSwFr_tgt_sw_amt.addAliasName("SwFr.tgt_sw_amt", p);
	}

	/**
	 * [Sw]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSw(MSBHP_ApSwBalReg p) {
		p.Sw_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getSwR().usr_dpt_p());
		p.Sw_usr_dpt_p_PPanel.setName("Sw.usr_dpt_p");
		p.Sw_usr_cd = p.Sw_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.Sw_usr_cd.addAliasName("Sw.usr_cd", p);
		p.Sw_usr_nm = p.Sw_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.Sw_usr_nm.addAliasName("Sw.usr_nm", p);
		p.Sw_dpt_cd = p.Sw_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.Sw_dpt_cd.addAliasName("Sw.dpt_cd", p);
		p.Sw_dpt_nm = p.Sw_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.Sw_dpt_nm.addAliasName("Sw.dpt_nm", p);
	}

	/**
	 * [SwTo]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSwTo(MSBHP_ApSwBalReg p) {
		p.SwTo_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getSwToR().wrk_no_p());
		p.SwTo_wrk_no_p_PPanel.setName("SwTo.wrk_no_p");
		p.SwTo_wrk_no = p.SwTo_wrk_no_p_PPanel.WrkNo_wrk_no;
		p.SwTo_wrk_no.addAliasName("SwTo.wrk_no", p);
		p.SwTo_wrk_nm = p.SwTo_wrk_no_p_PPanel.WrkNo_wrk_nm;
		p.SwTo_wrk_nm.addAliasName("SwTo.wrk_nm", p);
		p.SwTo_tgt_sw_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getSwToR().tgt_sw_amt_p());
		p.SwTo_tgt_sw_amt_p_PPanel.setName("SwTo.tgt_sw_amt_p");
		p.SwTo_tgt_sw_amt = p.SwTo_tgt_sw_amt_p_PPanel.Amt_amt;
		p.SwTo_tgt_sw_amt.addAliasName("SwTo.tgt_sw_amt", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBHP_ApSwBalReg p) {
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

	
	/** [Cnd_bsppl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bsppl_cd_p = null;

	/**
	 * [Cnd_bsppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bsppl_cd_ListPutter() {
		if (Cnd_bsppl_cd_p == null) {
			Cnd_bsppl_cd_p = createCnd_bsppl_cd_ListPutter(Cnd_bsppl_cd, "bsppl_cd", "bsppl_nm");

		}
		return Cnd_bsppl_cd_p;
	}
	
	
	/** [Cnd_trd_cur_cd_ListPutter]の定義 */
	private MCListPutter Cnd_trd_cur_cd_p = null;

	/**
	 * [Cnd_trd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_trd_cur_cd_ListPutter() {
		if (Cnd_trd_cur_cd_p == null) {
			Cnd_trd_cur_cd_p = createCnd_trd_cur_cd_ListPutter(Cnd_trd_cur_cd, "trd_cur_cd", "trd_cur_nm","amt_dec_place");

		}
		return Cnd_trd_cur_cd_p;
	}
	
	
	/** [Cnd_bsppl_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bsppl_dpt_cd_p = null;

	/**
	 * [Cnd_bsppl_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bsppl_dpt_cd_ListPutter() {
		if (Cnd_bsppl_dpt_cd_p == null) {
			Cnd_bsppl_dpt_cd_p = createCnd_bsppl_dpt_cd_ListPutter(Cnd_bsppl_dpt_cd, "bsppl_dpt_cd", "bsppl_dpt_nm");

		}
		return Cnd_bsppl_dpt_cd_p;
	}
	
	
	/** [Cnd_asppl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_asppl_cd_p = null;

	/**
	 * [Cnd_asppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_asppl_cd_ListPutter() {
		if (Cnd_asppl_cd_p == null) {
			Cnd_asppl_cd_p = createCnd_asppl_cd_ListPutter(Cnd_asppl_cd, "asppl_cd", "asppl_nm");

		}
		return Cnd_asppl_cd_p;
	}
	
	
	/** [Cnd_ap_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ap_dpt_cd_p = null;

	/**
	 * [Cnd_ap_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ap_dpt_cd_ListPutter() {
		if (Cnd_ap_dpt_cd_p == null) {
			Cnd_ap_dpt_cd_p = createCnd_ap_dpt_cd_ListPutter(Cnd_ap_dpt_cd, "ap_dpt_cd", "ap_dpt_nm");

		}
		return Cnd_ap_dpt_cd_p;
	}
	
	
	/** [Cnd_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_wg_cd_p = null;

	/**
	 * [Cnd_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_wg_cd_ListPutter() {
		if (Cnd_wg_cd_p == null) {
			Cnd_wg_cd_p = createCnd_wg_cd_ListPutter(Cnd_wg_cd, "wg_cd", "wg_nm");

		}
		return Cnd_wg_cd_p;
	}
	
	
	/** [Cnd_ap_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ap_typ_p = null;

	/**
	 * [Cnd_ap_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ap_typ_ListPutter() {
		if (Cnd_ap_typ_p == null) {
			Cnd_ap_typ_p = createCnd_ap_typ_ListPutter(Cnd_ap_typ, "ap_typ", "ap_typ_nm");

		}
		return Cnd_ap_typ_p;
	}
	
	
	/** [Sw_ap_sttl_cd_ListPutter]の定義 */
	private MCListPutter Sw_ap_sttl_cd_p = null;

	/**
	 * [Sw_ap_sttl_cd_ListPutter]の取得
	 */
	protected MCListPutter getSw_ap_sttl_cd_ListPutter() {
		if (Sw_ap_sttl_cd_p == null) {
			Sw_ap_sttl_cd_p = createSw_ap_sttl_cd_ListPutter(Sw_ap_sttl_cd, "ap_sttl_cd", "ap_sttl_nm","ap_sttl_typ");

		}
		return Sw_ap_sttl_cd_p;
	}
	
	
	/** [Sw_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Sw_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [Sw_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getSw_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (Sw_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			Sw_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createSw_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(Sw_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "dpt_cd", "dpt_nm");
		}
		return Sw_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [SwTo_asppl_cd_ListPutter]の定義 */
	private MCListPutter SwTo_asppl_cd_p = null;

	/**
	 * [SwTo_asppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getSwTo_asppl_cd_ListPutter() {
		if (SwTo_asppl_cd_p == null) {
			SwTo_asppl_cd_p = createSwTo_asppl_cd_ListPutter(SwTo_asppl_cd, "asppl_cd", "asppl_nm","bsppl_cd");

		}
		return SwTo_asppl_cd_p;
	}
	
	
	/** [SwTo_ap_dpt_cd_ListPutter]の定義 */
	private MCListPutter SwTo_ap_dpt_cd_p = null;

	/**
	 * [SwTo_ap_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getSwTo_ap_dpt_cd_ListPutter() {
		if (SwTo_ap_dpt_cd_p == null) {
			SwTo_ap_dpt_cd_p = createSwTo_ap_dpt_cd_ListPutter(SwTo_ap_dpt_cd, "ap_dpt_cd", "ap_dpt_nm");

		}
		return SwTo_ap_dpt_cd_p;
	}
	
	
	/** [SwTo_bsppl_dpt_cd_ListPutter]の定義 */
	private MCListPutter SwTo_bsppl_dpt_cd_p = null;

	/**
	 * [SwTo_bsppl_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getSwTo_bsppl_dpt_cd_ListPutter() {
		if (SwTo_bsppl_dpt_cd_p == null) {
			SwTo_bsppl_dpt_cd_p = createSwTo_bsppl_dpt_cd_ListPutter(SwTo_bsppl_dpt_cd, "bsppl_dpt_cd", "bsppl_dpt_nm");

		}
		return SwTo_bsppl_dpt_cd_p;
	}
	
	
	/** [SwTo_ap_wrk_ope_typ_ListPutter]の定義 */
	private MCListPutter SwTo_ap_wrk_ope_typ_p = null;

	/**
	 * [SwTo_ap_wrk_ope_typ_ListPutter]の取得
	 */
	protected MCListPutter getSwTo_ap_wrk_ope_typ_ListPutter() {
		if (SwTo_ap_wrk_ope_typ_p == null) {
			SwTo_ap_wrk_ope_typ_p = createSwTo_ap_wrk_ope_typ_ListPutter(SwTo_ap_wrk_ope_typ, "ap_wrk_ope_typ", "ap_wrk_ope_typ_nm");

		}
		return SwTo_ap_wrk_ope_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBHP_ApSwBalReg create(){
		MSBHP_ApSwBalReg p = new MSBHP_ApSwBalReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBHP_ApSwBalReg create(String name){
		MSBHP_ApSwBalReg p = new MSBHP_ApSwBalReg(name);
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
		MSBHP_ApSwBalReg_MC.jbfInitTyp((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.jbfInitTop((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.jbfInitCnd((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.jbfInitCtrl((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.jbfInitSwFr((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.jbfInitSw((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.jbfInitSwTo((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.jbfInitBtn((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.jbInitTyp((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.jbInitTop((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.jbInitCnd((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.jbInitCtrl((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.jbInitSwFr((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.jbInitSw((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.jbInitSwTo((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.jbInitBtn((MSBHP_ApSwBalReg)this);
	}

	/**
	 * [Typ]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTyp(MSBHP_ApSwBalReg p) {
		// ブロック関連の初期化
		p.TypPanel = p.beansFactory.createPanel("Typ");
		p.TypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Typ_typ_Group = p.beansFactory.createButtonGroup("Typ.typ");
		p.Typ_typ_chk_bal = p.beansFactory.createRadioButton("Typ.typ_chk_bal");
		p.Typ_typ_not_chk = p.beansFactory.createRadioButton("Typ.typ_not_chk");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBHP_ApSwBalReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBHP_ApSwBalReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_bsppl_cd_Label = p.beansFactory.createLabel("Cnd.bsppl_cd_Label");
		p.Cnd_bsppl_cd = p.beansFactory.createTextField("Cnd.bsppl_cd");
		p.Cnd_bsppl_cd.setLabel(p.Cnd_bsppl_cd_Label);
		p.Cnd_bsppl_nm = p.beansFactory.createTextField("Cnd.bsppl_nm");
		p.Cnd_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.trd_cur_cd_Label");
		p.Cnd_trd_cur_cd = p.beansFactory.createTextComboBox("Cnd.trd_cur_cd");
		p.Cnd_trd_cur_cd.setLabel(p.Cnd_trd_cur_cd_Label);
		p.Cnd_trd_cur_nm = p.beansFactory.createTextField("Cnd.trd_cur_nm");
		p.Cnd_amt_dec_place = p.beansFactory.createNumberField("Cnd.amt_dec_place");
		p.Cnd_bsppl_dpt_cd_Label = p.beansFactory.createLabel("Cnd.bsppl_dpt_cd_Label");
		p.Cnd_bsppl_dpt_cd = p.beansFactory.createTextField("Cnd.bsppl_dpt_cd");
		p.Cnd_bsppl_dpt_cd.setLabel(p.Cnd_bsppl_dpt_cd_Label);
		p.Cnd_bsppl_dpt_nm = p.beansFactory.createTextField("Cnd.bsppl_dpt_nm");
		p.Cnd_asppl_cd_Label = p.beansFactory.createLabel("Cnd.asppl_cd_Label");
		p.Cnd_asppl_cd = p.beansFactory.createTextField("Cnd.asppl_cd");
		p.Cnd_asppl_cd.setLabel(p.Cnd_asppl_cd_Label);
		p.Cnd_asppl_nm = p.beansFactory.createTextField("Cnd.asppl_nm");
		p.Cnd_ap_dpt_cd_Label = p.beansFactory.createLabel("Cnd.ap_dpt_cd_Label");
		p.Cnd_ap_dpt_cd = p.beansFactory.createTextField("Cnd.ap_dpt_cd");
		p.Cnd_ap_dpt_cd.setLabel(p.Cnd_ap_dpt_cd_Label);
		p.Cnd_ap_dpt_nm = p.beansFactory.createTextField("Cnd.ap_dpt_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_ap_typ_Label = p.beansFactory.createLabel("Cnd.ap_typ_Label");
		p.Cnd_ap_typ = p.beansFactory.createTextComboBox("Cnd.ap_typ");
		p.Cnd_ap_typ.setLabel(p.Cnd_ap_typ_Label);
		p.Cnd_ap_typ_nm = p.beansFactory.createTextField("Cnd.ap_typ_nm");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBHP_ApSwBalReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [SwFr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSwFr(MSBHP_ApSwBalReg p) {
		// ブロック関連の初期化
		p.SwFrPanel = p.beansFactory.createPanel("SwFr");
		p.SwFrTitledBorder = p.beansFactory.createTitledBorder();
		p.SwFrScrollPane = p.beansFactory.createScrollPane("SwFr.scroll");
		p.createSwFrTable();
		// ブロックの項目の初期化
		p.columnSwFr_check = p.beansFactory.createTableColumn("SwFr.check", MCColumnType.CHECK);
		p.columnSwFr_asppl_cd = p.beansFactory.createTableColumn("SwFr.asppl_cd", MCColumnType.TEXT);
		p.columnSwFr_asppl_nm = p.beansFactory.createTableColumn("SwFr.asppl_nm", MCColumnType.TEXT);
		p.columnSwFr_ap_dpt_cd = p.beansFactory.createTableColumn("SwFr.ap_dpt_cd", MCColumnType.TEXT);
		p.columnSwFr_ap_dpt_nm = p.beansFactory.createTableColumn("SwFr.ap_dpt_nm", MCColumnType.TEXT);
		p.columnSwFr_wg_cd = p.beansFactory.createTableColumn("SwFr.wg_cd", MCColumnType.TEXT);
		p.columnSwFr_wg_nm = p.beansFactory.createTableColumn("SwFr.wg_nm", MCColumnType.TEXT);
		p.columnSwFr_bsppl_dpt_cd = p.beansFactory.createTableColumn("SwFr.bsppl_dpt_cd", MCColumnType.TEXT);
		p.columnSwFr_bsppl_dpt_nm = p.beansFactory.createTableColumn("SwFr.bsppl_dpt_nm", MCColumnType.TEXT);
		p.columnSwFr_slip_sts_typ_nm = p.beansFactory.createTableColumn("SwFr.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnSwFr_trd_cd = p.beansFactory.createTableColumn("SwFr.trd_cd", MCColumnType.TEXT);
		p.columnSwFr_trd_nm = p.beansFactory.createTableColumn("SwFr.trd_nm", MCColumnType.TEXT);
		p.columnSwFr_ap_sttl_cd = p.beansFactory.createTableColumn("SwFr.ap_sttl_cd", MCColumnType.TEXT);
		p.columnSwFr_ap_sttl_nm = p.beansFactory.createTableColumn("SwFr.ap_sttl_nm", MCColumnType.TEXT);
		p.columnSwFr_ap_sttl_typ = p.beansFactory.createTableColumn("SwFr.ap_sttl_typ", MCColumnType.TEXT);
		p.columnSwFr_ap_sttl_typ_nm = p.beansFactory.createTableColumn("SwFr.ap_sttl_typ_nm", MCColumnType.TEXT);
		p.columnSwFr_act_no = p.beansFactory.createTableColumn("SwFr.act_no", MCColumnType.TEXT);
		p.columnSwFr_act_rev = p.beansFactory.createTableColumn("SwFr.act_rev", MCColumnType.NUMBER);
		p.columnSwFr_act_d_no = p.beansFactory.createTableColumn("SwFr.act_d_no", MCColumnType.TEXT);
		p.columnSwFr_purc_dpt_cd = p.beansFactory.createTableColumn("SwFr.purc_dpt_cd", MCColumnType.TEXT);
		p.columnSwFr_purc_dpt_nm = p.beansFactory.createTableColumn("SwFr.purc_dpt_nm", MCColumnType.TEXT);
		p.columnSwFr_ap_d_no = p.beansFactory.createTableColumn("SwFr.ap_d_no", MCColumnType.TEXT);
		p.columnSwFr_sw_src_pay_schd_no = p.beansFactory.createTableColumn("SwFr.sw_src_pay_schd_no", MCColumnType.TEXT);
		p.columnSwFr_pay_schd_no = p.beansFactory.createTableColumn("SwFr.pay_schd_no", MCColumnType.TEXT);
		p.columnSwFr_pay_chk_mng_no = p.beansFactory.createTableColumn("SwFr.pay_chk_mng_no", MCColumnType.TEXT);
		p.columnSwFr_pay_chk_no = p.beansFactory.createTableColumn("SwFr.pay_chk_no", MCColumnType.TEXT);
		p.columnSwFr_pay_basis_dt = p.beansFactory.createTableColumn("SwFr.pay_basis_dt", MCColumnType.DATE);
		p.columnSwFr_pay_crryovr_times = p.beansFactory.createTableColumn("SwFr.pay_crryovr_times", MCColumnType.NUMBER);
		p.columnSwFr_pay_schd_dt = p.beansFactory.createTableColumn("SwFr.pay_schd_dt", MCColumnType.DATE);
		p.columnSwFr_interim_flg = p.beansFactory.createTableColumn("SwFr.interim_flg", MCColumnType.CHECK);
		p.columnSwFr_wrk_no = p.beansFactory.createTableColumn("SwFr.wrk_no", MCColumnType.TEXT);
		p.columnSwFr_wrk_nm = p.beansFactory.createTableColumn("SwFr.wrk_nm", MCColumnType.TEXT);
		p.columnSwFr_purc_wrk_no = p.beansFactory.createTableColumn("SwFr.purc_wrk_no", MCColumnType.TEXT);
		p.columnSwFr_purc_wrk_nm = p.beansFactory.createTableColumn("SwFr.purc_wrk_nm", MCColumnType.TEXT);
		p.columnSwFr_ap_typ = p.beansFactory.createTableColumn("SwFr.ap_typ", MCColumnType.TEXT);
		p.columnSwFr_ap_typ_nm = p.beansFactory.createTableColumn("SwFr.ap_typ_nm", MCColumnType.TEXT);
		p.columnSwFr_xrate = p.beansFactory.createTableColumn("SwFr.xrate", MCColumnType.NUMBER);
		p.columnSwFr_ac_ym = p.beansFactory.createTableColumn("SwFr.ac_ym", MCColumnType.DATE);
		p.columnSwFr_ac_dt = p.beansFactory.createTableColumn("SwFr.ac_dt", MCColumnType.DATE);
		p.columnSwFr_bsppl_cl_ym = p.beansFactory.createTableColumn("SwFr.bsppl_cl_ym", MCColumnType.DATE);
		p.columnSwFr_bsppl_cl_day = p.beansFactory.createTableColumn("SwFr.bsppl_cl_day", MCColumnType.NUMBER);
		p.columnSwFr_purc_act_no = p.beansFactory.createTableColumn("SwFr.purc_act_no", MCColumnType.TEXT);
		p.columnSwFr_rcpt_iv_no = p.beansFactory.createTableColumn("SwFr.rcpt_iv_no", MCColumnType.TEXT);
		p.columnSwFr_rcpt_iv_mng_no = p.beansFactory.createTableColumn("SwFr.rcpt_iv_mng_no", MCColumnType.TEXT);
		p.columnSwFr_sppl_cd = p.beansFactory.createTableColumn("SwFr.sppl_cd", MCColumnType.TEXT);
		p.columnSwFr_sppl_nm = p.beansFactory.createTableColumn("SwFr.sppl_nm", MCColumnType.TEXT);
		p.columnSwFr_po_no = p.beansFactory.createTableColumn("SwFr.po_no", MCColumnType.TEXT);
		p.columnSwFr_po_d_no = p.beansFactory.createTableColumn("SwFr.po_d_no", MCColumnType.TEXT);
		p.columnSwFr_bp_dlv_slip_no = p.beansFactory.createTableColumn("SwFr.bp_dlv_slip_no", MCColumnType.TEXT);
		p.columnSwFr_bp_dlv_slip_d_no = p.beansFactory.createTableColumn("SwFr.bp_dlv_slip_d_no", MCColumnType.TEXT);
		p.columnSwFr_trd_cur_cd = p.beansFactory.createTableColumn("SwFr.trd_cur_cd", MCColumnType.TEXT);
		p.columnSwFr_amt_dec_place = p.beansFactory.createTableColumn("SwFr.amt_dec_place", MCColumnType.NUMBER);
	}

	/**
	 * [Sw]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSw(MSBHP_ApSwBalReg p) {
		// ブロック関連の初期化
		p.SwPanel = p.beansFactory.createPanel("Sw");
		p.SwTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Sw_sw_dt_Label = p.beansFactory.createLabel("Sw.sw_dt_Label");
		p.Sw_sw_dt = p.beansFactory.createDateField("Sw.sw_dt");
		p.Sw_sw_dt.setLabel(p.Sw_sw_dt_Label);
		p.Sw_ac_dt_Label = p.beansFactory.createLabel("Sw.ac_dt_Label");
		p.Sw_ac_dt = p.beansFactory.createDateField("Sw.ac_dt");
		p.Sw_ac_dt.setLabel(p.Sw_ac_dt_Label);
		p.Sw_pay_basis_dt_Label = p.beansFactory.createLabel("Sw.pay_basis_dt_Label");
		p.Sw_pay_basis_dt = p.beansFactory.createDateField("Sw.pay_basis_dt");
		p.Sw_pay_basis_dt.setLabel(p.Sw_pay_basis_dt_Label);
		p.Sw_pay_crryovr_times_Label = p.beansFactory.createLabel("Sw.pay_crryovr_times_Label");
		p.Sw_pay_crryovr_times = p.beansFactory.createNumberField("Sw.pay_crryovr_times");
		p.Sw_pay_crryovr_times.setLabel(p.Sw_pay_crryovr_times_Label);
		p.Sw_pay_schd_dt_Label = p.beansFactory.createLabel("Sw.pay_schd_dt_Label");
		p.Sw_pay_schd_dt = p.beansFactory.createDateField("Sw.pay_schd_dt");
		p.Sw_pay_schd_dt.setLabel(p.Sw_pay_schd_dt_Label);
		p.Sw_ap_sttl_cd_Label = p.beansFactory.createLabel("Sw.ap_sttl_cd_Label");
		p.Sw_ap_sttl_cd = p.beansFactory.createTextComboBox("Sw.ap_sttl_cd");
		p.Sw_ap_sttl_cd.setLabel(p.Sw_ap_sttl_cd_Label);
		p.Sw_ap_sttl_nm = p.beansFactory.createTextField("Sw.ap_sttl_nm");
		p.Sw_ap_sttl_typ = p.beansFactory.createTextField("Sw.ap_sttl_typ");
		p.Sw_trd_rmrks_Label = p.beansFactory.createLabel("Sw.trd_rmrks_Label");
		p.Sw_trd_rmrks = p.beansFactory.createTextField("Sw.trd_rmrks");
		p.Sw_trd_rmrks.setLabel(p.Sw_trd_rmrks_Label);
		p.Sw_sub_char1_Label = p.beansFactory.createLabel("Sw.sub_char1_Label");
		p.Sw_sub_char1 = p.beansFactory.createTextField("Sw.sub_char1");
		p.Sw_sub_char1.setLabel(p.Sw_sub_char1_Label);
		p.Sw_sub_char2_Label = p.beansFactory.createLabel("Sw.sub_char2_Label");
		p.Sw_sub_char2 = p.beansFactory.createTextField("Sw.sub_char2");
		p.Sw_sub_char2.setLabel(p.Sw_sub_char2_Label);
		p.Sw_sub_char3_Label = p.beansFactory.createLabel("Sw.sub_char3_Label");
		p.Sw_sub_char3 = p.beansFactory.createTextField("Sw.sub_char3");
		p.Sw_sub_char3.setLabel(p.Sw_sub_char3_Label);
	}

	/**
	 * [SwTo]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSwTo(MSBHP_ApSwBalReg p) {
		// ブロック関連の初期化
		p.SwToPanel = p.beansFactory.createPanel("SwTo");
		p.SwToTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.SwTo_asppl_cd_Label = p.beansFactory.createLabel("SwTo.asppl_cd_Label");
		p.SwTo_asppl_cd = p.beansFactory.createTextField("SwTo.asppl_cd");
		p.SwTo_asppl_cd.setLabel(p.SwTo_asppl_cd_Label);
		p.SwTo_asppl_nm = p.beansFactory.createTextField("SwTo.asppl_nm");
		p.SwTo_ap_dpt_cd_Label = p.beansFactory.createLabel("SwTo.ap_dpt_cd_Label");
		p.SwTo_ap_dpt_cd = p.beansFactory.createTextField("SwTo.ap_dpt_cd");
		p.SwTo_ap_dpt_cd.setLabel(p.SwTo_ap_dpt_cd_Label);
		p.SwTo_ap_dpt_nm = p.beansFactory.createTextField("SwTo.ap_dpt_nm");
		p.SwTo_bsppl_cd_Label = p.beansFactory.createLabel("SwTo.bsppl_cd_Label");
		p.SwTo_bsppl_cd = p.beansFactory.createTextField("SwTo.bsppl_cd");
		p.SwTo_bsppl_cd.setLabel(p.SwTo_bsppl_cd_Label);
		p.SwTo_bsppl_nm = p.beansFactory.createTextField("SwTo.bsppl_nm");
		p.SwTo_pay_spot_flg = p.beansFactory.createCheckBox("SwTo.pay_spot_flg");
		p.SwTo_bsppl_dpt_cd_Label = p.beansFactory.createLabel("SwTo.bsppl_dpt_cd_Label");
		p.SwTo_bsppl_dpt_cd = p.beansFactory.createTextComboBox("SwTo.bsppl_dpt_cd");
		p.SwTo_bsppl_dpt_cd.setLabel(p.SwTo_bsppl_dpt_cd_Label);
		p.SwTo_bsppl_dpt_nm = p.beansFactory.createTextField("SwTo.bsppl_dpt_nm");
		p.SwTo_ap_wrk_ope_typ_Label = p.beansFactory.createLabel("SwTo.ap_wrk_ope_typ_Label");
		p.SwTo_ap_wrk_ope_typ = p.beansFactory.createTextComboBox("SwTo.ap_wrk_ope_typ");
		p.SwTo_ap_wrk_ope_typ.setLabel(p.SwTo_ap_wrk_ope_typ_Label);
		p.SwTo_ap_wrk_ope_typ_nm = p.beansFactory.createTextField("SwTo.ap_wrk_ope_typ_nm");
		p.SwTo_trd_cur_cd_Label = p.beansFactory.createLabel("SwTo.trd_cur_cd_Label");
		p.SwTo_trd_cur_cd = p.beansFactory.createTextField("SwTo.trd_cur_cd");
		p.SwTo_trd_cur_cd.setLabel(p.SwTo_trd_cur_cd_Label);
		p.SwTo_trd_cur_nm = p.beansFactory.createTextField("SwTo.trd_cur_nm");
		p.SwTo_amt_dec_place = p.beansFactory.createNumberField("SwTo.amt_dec_place");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBHP_ApSwBalReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
	}

	/**
	 * [Typ]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTyp(MSBHP_ApSwBalReg p) {
		// ブロック関連の初期化
		p.TypPanel.setBorder(p.TypTitledBorder);
		p.add(p.TypPanel);
		p.setLastBeans(p.TypPanel);
		p.TypPanel.setNextBeans(p.TopPanel);
		p.TypPanel.setValueCheck(false);
		p.TypPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TypPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
		p.TypPanel.setLastBeans(p.Typ_typ_Group);
		p.Typ_typ_Group.setFirstBeans(p.Typ_typ_chk_bal);
		p.Typ_typ_chk_bal.setActionCommand("0");
		p.Typ_typ_Group.add(p.Typ_typ_chk_bal);
		p.TypPanel.add(p.Typ_typ_chk_bal);
		p.Typ_typ_chk_bal.setNextBeans(p.Typ_typ_not_chk);
		p.Typ_typ_not_chk.setActionCommand("1");
		p.Typ_typ_Group.add(p.Typ_typ_not_chk);
		p.TypPanel.add(p.Typ_typ_not_chk);
		p.Typ_typ_Group.setRow(p.getTypR(), mcframe.clientMSBH.MSBHP0160.TypR.typ_META);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBHP_ApSwBalReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.SwFrPanel);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.CndPanel, null);
		p.TopPanel.setLastBeans(p.CndPanel);
		p.CndPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBHP_ApSwBalReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_bsppl_cd_Label);
		p.CndPanel.add(p.Cnd_bsppl_cd);
		p.CndPanel.setLastBeans(p.Cnd_bsppl_cd);
		p.Cnd_bsppl_cd.setNextBeans(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0160.CndR.bsppl_cd_META);
		p.Cnd_bsppl_cd.addLinkBeans(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_cd.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_nm.setNextBeans(p.Cnd_trd_cur_cd);
		p.Cnd_bsppl_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0160.CndR.bsppl_nm_META);
		p.Cnd_trd_cur_cd.setListType(MCListType.STRICT);
		p.Cnd_trd_cur_cd.setLinkBeans(p.Cnd_trd_cur_nm,p.Cnd_amt_dec_place);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0160.CndR.trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_amt_dec_place);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0160.CndR.trd_cur_nm_META);
		p.CndPanel.add(p.Cnd_amt_dec_place);
		p.Cnd_amt_dec_place.setNextBeans(p.Cnd_bsppl_dpt_cd);
		p.Cnd_amt_dec_place.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0160.CndR.amt_dec_place_META);
		p.CndPanel.add(p.Cnd_bsppl_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_bsppl_dpt_cd);
		p.Cnd_bsppl_dpt_cd.setNextBeans(p.Cnd_bsppl_dpt_nm);
		p.Cnd_bsppl_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0160.CndR.bsppl_dpt_cd_META);
		p.Cnd_bsppl_dpt_cd.addLinkBeans(p.Cnd_bsppl_dpt_nm);
		p.Cnd_bsppl_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bsppl_dpt_cd, true);
		p.CndPanel.add(p.Cnd_bsppl_dpt_nm);
		p.Cnd_bsppl_dpt_nm.setNextBeans(p.Cnd_asppl_cd);
		p.Cnd_bsppl_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0160.CndR.bsppl_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_bsppl_dpt_nm, true);
		p.CndPanel.add(p.Cnd_asppl_cd_Label);
		p.CndPanel.add(p.Cnd_asppl_cd);
		p.Cnd_asppl_cd.setNextBeans(p.Cnd_asppl_nm);
		p.Cnd_asppl_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0160.CndR.asppl_cd_META);
		p.Cnd_asppl_cd.addLinkBeans(p.Cnd_asppl_nm);
		p.Cnd_asppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_asppl_cd, true);
		p.CndPanel.add(p.Cnd_asppl_nm);
		p.Cnd_asppl_nm.setNextBeans(p.Cnd_ap_dpt_cd);
		p.Cnd_asppl_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0160.CndR.asppl_nm_META);
		p.setPluralValueEnable(p.Cnd_asppl_nm, true);
		p.CndPanel.add(p.Cnd_ap_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_ap_dpt_cd);
		p.Cnd_ap_dpt_cd.setNextBeans(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0160.CndR.ap_dpt_cd_META);
		p.Cnd_ap_dpt_cd.addLinkBeans(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ap_dpt_cd, true);
		p.CndPanel.add(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_ap_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0160.CndR.ap_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_ap_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0160.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0160.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_wrk_no_p_PPanel.setNextBeans(p.Cnd_ap_typ);
		p.Cnd_ap_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ap_typ, true);
		p.Cnd_ap_typ.setLinkBeans(p.Cnd_ap_typ_nm);
		p.CndPanel.add(p.Cnd_ap_typ_Label);
		p.CndPanel.add(p.Cnd_ap_typ);
		p.Cnd_ap_typ.setNextBeans(p.Cnd_ap_typ_nm);
		p.Cnd_ap_typ.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0160.CndR.ap_typ_META);
		p.CndPanel.add(p.Cnd_ap_typ_nm);
		p.Cnd_ap_typ_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0160.CndR.ap_typ_nm_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBHP_ApSwBalReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [SwFr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSwFr(MSBHP_ApSwBalReg p) {
		// ブロック関連の初期化
		p.SwFrPanel.setBorder(p.SwFrTitledBorder);
		p.add(p.SwFrPanel);
		p.SwFrPanel.setNextBeans(p.SwPanel);
		p.SwFrPanel.add(p.SwFrScrollPane);
		p.SwFrPanel.setLastBeans(p.SwFrTable);
		p.SwFrScrollPane.setViewportView(p.SwFrTable);
		p.SwFrTable.setList(p.getSwFrL());
		p.SwFrTable.setStatusColumnVisible(false);
		p.SwFrPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Sw]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSw(MSBHP_ApSwBalReg p) {
		// ブロック関連の初期化
		p.SwPanel.setBorder(p.SwTitledBorder);
		p.add(p.SwPanel);
		p.SwPanel.setNextBeans(p.SwToPanel);
		p.SwPanel.setLayoutPosition("SN");
		// ブロックの項目の初期化
		p.SwPanel.add(p.Sw_sw_dt_Label);
		p.SwPanel.add(p.Sw_sw_dt);
		p.SwPanel.setLastBeans(p.Sw_sw_dt);
		p.Sw_sw_dt.setNextBeans(p.Sw_ac_dt);
		p.Sw_sw_dt.setRow(p.getSwR(), mcframe.clientMSBH.MSBHP0160.SwR.sw_dt_META);
		p.Sw_sw_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.SwPanel.add(p.Sw_ac_dt_Label);
		p.SwPanel.add(p.Sw_ac_dt);
		p.Sw_ac_dt.setNextBeans(p.Sw_pay_basis_dt);
		p.Sw_ac_dt.setRow(p.getSwR(), mcframe.clientMSBH.MSBHP0160.SwR.ac_dt_META);
		p.Sw_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.SwPanel.add(p.Sw_pay_basis_dt_Label);
		p.SwPanel.add(p.Sw_pay_basis_dt);
		p.Sw_pay_basis_dt.setNextBeans(p.Sw_pay_crryovr_times);
		p.Sw_pay_basis_dt.setRow(p.getSwR(), mcframe.clientMSBH.MSBHP0160.SwR.pay_basis_dt_META);
		p.Sw_pay_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.SwPanel.add(p.Sw_pay_crryovr_times_Label);
		p.SwPanel.add(p.Sw_pay_crryovr_times);
		p.Sw_pay_crryovr_times.setNextBeans(p.Sw_pay_schd_dt);
		p.Sw_pay_crryovr_times.setRow(p.getSwR(), mcframe.clientMSBH.MSBHP0160.SwR.pay_crryovr_times_META);
		p.SwPanel.add(p.Sw_pay_schd_dt_Label);
		p.SwPanel.add(p.Sw_pay_schd_dt);
		p.Sw_pay_schd_dt.setNextBeans(p.Sw_ap_sttl_cd);
		p.Sw_pay_schd_dt.setRow(p.getSwR(), mcframe.clientMSBH.MSBHP0160.SwR.pay_schd_dt_META);
		p.Sw_pay_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Sw_ap_sttl_cd.setListType(MCListType.STRICT);
		p.Sw_ap_sttl_cd.setLinkBeans(p.Sw_ap_sttl_nm,p.Sw_ap_sttl_typ);
		p.SwPanel.add(p.Sw_ap_sttl_cd_Label);
		p.SwPanel.add(p.Sw_ap_sttl_cd);
		p.Sw_ap_sttl_cd.setNextBeans(p.Sw_ap_sttl_nm);
		p.Sw_ap_sttl_cd.setRow(p.getSwR(), mcframe.clientMSBH.MSBHP0160.SwR.ap_sttl_cd_META);
		p.SwPanel.add(p.Sw_ap_sttl_nm);
		p.Sw_ap_sttl_nm.setNextBeans(p.Sw_ap_sttl_typ);
		p.Sw_ap_sttl_nm.setRow(p.getSwR(), mcframe.clientMSBH.MSBHP0160.SwR.ap_sttl_nm_META);
		p.SwPanel.add(p.Sw_ap_sttl_typ);
		p.Sw_ap_sttl_typ.setNextBeans(p.Sw_usr_dpt_p_PPanel);
		p.Sw_ap_sttl_typ.setRow(p.getSwR(), mcframe.clientMSBH.MSBHP0160.SwR.ap_sttl_typ_META);
		p.SwPanel.add(p.Sw_usr_dpt_p_PPanel);
		p.Sw_usr_dpt_p_PPanel.setNextBeans(p.Sw_trd_rmrks);
		p.Sw_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.Sw_dpt_nm);
		p.SwPanel.add(p.Sw_trd_rmrks_Label);
		p.SwPanel.add(p.Sw_trd_rmrks);
		p.Sw_trd_rmrks.setNextBeans(p.Sw_sub_char1);
		p.Sw_trd_rmrks.setRow(p.getSwR(), mcframe.clientMSBH.MSBHP0160.SwR.trd_rmrks_META);
		p.SwPanel.add(p.Sw_sub_char1_Label);
		p.SwPanel.add(p.Sw_sub_char1);
		p.Sw_sub_char1.setNextBeans(p.Sw_sub_char2);
		p.Sw_sub_char1.setRow(p.getSwR(), mcframe.clientMSBH.MSBHP0160.SwR.sub_char1_META);
		p.SwPanel.add(p.Sw_sub_char2_Label);
		p.SwPanel.add(p.Sw_sub_char2);
		p.Sw_sub_char2.setNextBeans(p.Sw_sub_char3);
		p.Sw_sub_char2.setRow(p.getSwR(), mcframe.clientMSBH.MSBHP0160.SwR.sub_char2_META);
		p.SwPanel.add(p.Sw_sub_char3_Label);
		p.SwPanel.add(p.Sw_sub_char3);
		p.Sw_sub_char3.setRow(p.getSwR(), mcframe.clientMSBH.MSBHP0160.SwR.sub_char3_META);
	}

	/**
	 * [SwTo]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSwTo(MSBHP_ApSwBalReg p) {
		// ブロック関連の初期化
		p.SwToPanel.setBorder(p.SwToTitledBorder);
		p.add(p.SwToPanel);
		p.SwToPanel.setNextBeans(p.BtnPanel);
		p.SwToPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.SwToPanel.add(p.SwTo_asppl_cd_Label);
		p.SwToPanel.add(p.SwTo_asppl_cd);
		p.SwToPanel.setLastBeans(p.SwTo_asppl_cd);
		p.SwTo_asppl_cd.setNextBeans(p.SwTo_asppl_nm);
		p.SwTo_asppl_cd.setRow(p.getSwToR(), mcframe.clientMSBH.MSBHP0160.SwToR.asppl_cd_META);
		p.SwTo_asppl_cd.addLinkBeans(p.SwTo_asppl_nm,p.SwTo_bsppl_cd);
		p.SwTo_asppl_cd.setListType(MCListType.STRICT);
		p.SwToPanel.add(p.SwTo_asppl_nm);
		p.SwTo_asppl_nm.setNextBeans(p.SwTo_ap_dpt_cd);
		p.SwTo_asppl_nm.setRow(p.getSwToR(), mcframe.clientMSBH.MSBHP0160.SwToR.asppl_nm_META);
		p.SwToPanel.add(p.SwTo_ap_dpt_cd_Label);
		p.SwToPanel.add(p.SwTo_ap_dpt_cd);
		p.SwTo_ap_dpt_cd.setNextBeans(p.SwTo_ap_dpt_nm);
		p.SwTo_ap_dpt_cd.setRow(p.getSwToR(), mcframe.clientMSBH.MSBHP0160.SwToR.ap_dpt_cd_META);
		p.SwTo_ap_dpt_cd.addLinkBeans(p.SwTo_ap_dpt_nm);
		p.SwTo_ap_dpt_cd.setListType(MCListType.STRICT);
		p.SwToPanel.add(p.SwTo_ap_dpt_nm);
		p.SwTo_ap_dpt_nm.setNextBeans(p.SwTo_bsppl_cd);
		p.SwTo_ap_dpt_nm.setRow(p.getSwToR(), mcframe.clientMSBH.MSBHP0160.SwToR.ap_dpt_nm_META);
		p.SwToPanel.add(p.SwTo_bsppl_cd_Label);
		p.SwToPanel.add(p.SwTo_bsppl_cd);
		p.SwTo_bsppl_cd.setNextBeans(p.SwTo_bsppl_nm);
		p.SwTo_bsppl_cd.setRow(p.getSwToR(), mcframe.clientMSBH.MSBHP0160.SwToR.bsppl_cd_META);
		p.SwTo_bsppl_cd.addLinkBeans(p.SwTo_bsppl_nm,p.SwTo_pay_spot_flg);
		p.SwToPanel.add(p.SwTo_bsppl_nm);
		p.SwTo_bsppl_nm.setNextBeans(p.SwTo_pay_spot_flg);
		p.SwTo_bsppl_nm.setRow(p.getSwToR(), mcframe.clientMSBH.MSBHP0160.SwToR.bsppl_nm_META);
		p.SwToPanel.add(p.SwTo_pay_spot_flg);
		p.SwTo_pay_spot_flg.setNextBeans(p.SwTo_bsppl_dpt_cd);
		p.SwTo_pay_spot_flg.setRow(p.getSwToR(), mcframe.clientMSBH.MSBHP0160.SwToR.pay_spot_flg_META);
		p.SwTo_bsppl_dpt_cd.setListType(MCListType.STRICT);
		p.SwTo_bsppl_dpt_cd.setLinkBeans(p.SwTo_bsppl_dpt_nm);
		p.SwToPanel.add(p.SwTo_bsppl_dpt_cd_Label);
		p.SwToPanel.add(p.SwTo_bsppl_dpt_cd);
		p.SwTo_bsppl_dpt_cd.setNextBeans(p.SwTo_bsppl_dpt_nm);
		p.SwTo_bsppl_dpt_cd.setRow(p.getSwToR(), mcframe.clientMSBH.MSBHP0160.SwToR.bsppl_dpt_cd_META);
		p.SwToPanel.add(p.SwTo_bsppl_dpt_nm);
		p.SwTo_bsppl_dpt_nm.setNextBeans(p.SwTo_ap_wrk_ope_typ);
		p.SwTo_bsppl_dpt_nm.setRow(p.getSwToR(), mcframe.clientMSBH.MSBHP0160.SwToR.bsppl_dpt_nm_META);
		p.SwTo_ap_wrk_ope_typ.setListType(MCListType.STRICT);
		p.SwTo_ap_wrk_ope_typ.setLinkBeans(p.SwTo_ap_wrk_ope_typ_nm);
		p.SwToPanel.add(p.SwTo_ap_wrk_ope_typ_Label);
		p.SwToPanel.add(p.SwTo_ap_wrk_ope_typ);
		p.SwTo_ap_wrk_ope_typ.setNextBeans(p.SwTo_ap_wrk_ope_typ_nm);
		p.SwTo_ap_wrk_ope_typ.setRow(p.getSwToR(), mcframe.clientMSBH.MSBHP0160.SwToR.ap_wrk_ope_typ_META);
		p.SwToPanel.add(p.SwTo_ap_wrk_ope_typ_nm);
		p.SwTo_ap_wrk_ope_typ_nm.setNextBeans(p.SwTo_wrk_no_p_PPanel);
		p.SwTo_ap_wrk_ope_typ_nm.setRow(p.getSwToR(), mcframe.clientMSBH.MSBHP0160.SwToR.ap_wrk_ope_typ_nm_META);
		p.SwToPanel.add(p.SwTo_wrk_no_p_PPanel);
		p.SwTo_wrk_no_p_PPanel.setNextBeans(p.SwTo_trd_cur_cd);
		p.SwToPanel.add(p.SwTo_trd_cur_cd_Label);
		p.SwToPanel.add(p.SwTo_trd_cur_cd);
		p.SwTo_trd_cur_cd.setNextBeans(p.SwTo_trd_cur_nm);
		p.SwTo_trd_cur_cd.setRow(p.getSwToR(), mcframe.clientMSBH.MSBHP0160.SwToR.trd_cur_cd_META);
		p.SwToPanel.add(p.SwTo_trd_cur_nm);
		p.SwTo_trd_cur_nm.setNextBeans(p.SwTo_amt_dec_place);
		p.SwTo_trd_cur_nm.setRow(p.getSwToR(), mcframe.clientMSBH.MSBHP0160.SwToR.trd_cur_nm_META);
		p.SwToPanel.add(p.SwTo_amt_dec_place);
		p.SwTo_amt_dec_place.setNextBeans(p.SwTo_tgt_sw_amt_p_PPanel);
		p.SwTo_amt_dec_place.setRow(p.getSwToR(), mcframe.clientMSBH.MSBHP0160.SwToR.amt_dec_place_META);
		p.SwToPanel.add(p.SwTo_tgt_sw_amt_p_PPanel);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBHP_ApSwBalReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SSW");
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
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "G";
	}

	@Override
	public void layoutAfterOpen() {
		super.layoutAfterOpen();
		Ctrl_ctrl_PPanel.expandInit();
		Ctrl_ctrl_PPanel.setDefaultDividerLocation();
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSBHP_ApSwBalReg_MC.mcInitTyp((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.mcInitTop((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.mcInitCnd((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.mcInitCtrl((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.mcInitSwFr((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.mcInitSw((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.mcInitSwTo((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.mcInitBtn((MSBHP_ApSwBalReg)this);

		// [SRCH]ステータスのモードの設定
		MSBHP_ApSwBalReg_MC.statusInitSRCH_Typ((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.statusInitSRCH_Top((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.statusInitSRCH_Cnd((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.statusInitSRCH_Ctrl((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.statusInitSRCH_SwFr((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.statusInitSRCH_Sw((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.statusInitSRCH_SwTo((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.statusInitSRCH_Btn((MSBHP_ApSwBalReg)this);

		// [UPD]ステータスのモードの設定
		MSBHP_ApSwBalReg_MC.statusInitUPD_Typ((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.statusInitUPD_Top((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.statusInitUPD_Cnd((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.statusInitUPD_Ctrl((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.statusInitUPD_SwFr((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.statusInitUPD_Sw((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.statusInitUPD_SwTo((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.statusInitUPD_Btn((MSBHP_ApSwBalReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBHP_ApSwBalReg_MC.statusInitFIX__U_Typ((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.statusInitFIX__U_Top((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.statusInitFIX__U_Cnd((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.statusInitFIX__U_Ctrl((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.statusInitFIX__U_SwFr((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.statusInitFIX__U_Sw((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.statusInitFIX__U_SwTo((MSBHP_ApSwBalReg)this);
		MSBHP_ApSwBalReg_MC.statusInitFIX__U_Btn((MSBHP_ApSwBalReg)this);

	}

	/**
	 *  [Typ]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTyp(MSBHP_ApSwBalReg p) {
		p.Typ_typ_Group.addAllListener(p);
		p.Typ_typ_chk_bal.addAllListener(p);
		p.Typ_typ_not_chk.addAllListener(p);
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBHP_ApSwBalReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBHP_ApSwBalReg p) {
		p.Cnd_bsppl_cd.setListListener(p);
		p.Cnd_bsppl_cd.addAllListener(p);
		p.Cnd_bsppl_nm.setListListener(p);
		p.Cnd_bsppl_nm.addAllListener(p);
		p.Cnd_trd_cur_cd.setListListener(p);
		p.Cnd_trd_cur_cd.addAllListener(p);
		p.Cnd_trd_cur_nm.setListListener(p);
		p.Cnd_trd_cur_nm.addAllListener(p);
		p.Cnd_amt_dec_place.setListListener(p);
		p.Cnd_amt_dec_place.addAllListener(p);
		p.Cnd_bsppl_dpt_cd.setListListener(p);
		p.Cnd_bsppl_dpt_cd.addAllListener(p);
		p.Cnd_bsppl_dpt_nm.setListListener(p);
		p.Cnd_bsppl_dpt_nm.addAllListener(p);
		p.Cnd_asppl_cd.setListListener(p);
		p.Cnd_asppl_cd.addAllListener(p);
		p.Cnd_asppl_nm.setListListener(p);
		p.Cnd_asppl_nm.addAllListener(p);
		p.Cnd_ap_dpt_cd.setListListener(p);
		p.Cnd_ap_dpt_cd.addAllListener(p);
		p.Cnd_ap_dpt_nm.setListListener(p);
		p.Cnd_ap_dpt_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_ap_typ.setListListener(p);
		p.Cnd_ap_typ.addAllListener(p);
		p.Cnd_ap_typ_nm.setListListener(p);
		p.Cnd_ap_typ_nm.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBHP_ApSwBalReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [SwFr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSwFr(MSBHP_ApSwBalReg p) {
		p.SwFrTable.addAllListener(p);
		p.columnSwFr_check.addAllListener(p);
		p.columnSwFr_asppl_cd.addAllListener(p);
		p.columnSwFr_asppl_cd.setListListener(p);
		p.columnSwFr_asppl_nm.addAllListener(p);
		p.columnSwFr_asppl_nm.setListListener(p);
		p.columnSwFr_ap_dpt_cd.addAllListener(p);
		p.columnSwFr_ap_dpt_cd.setListListener(p);
		p.columnSwFr_ap_dpt_nm.addAllListener(p);
		p.columnSwFr_ap_dpt_nm.setListListener(p);
		p.columnSwFr_wg_cd.addAllListener(p);
		p.columnSwFr_wg_cd.setListListener(p);
		p.columnSwFr_wg_nm.addAllListener(p);
		p.columnSwFr_wg_nm.setListListener(p);
		p.columnSwFr_bsppl_dpt_cd.addAllListener(p);
		p.columnSwFr_bsppl_dpt_cd.setListListener(p);
		p.columnSwFr_bsppl_dpt_nm.addAllListener(p);
		p.columnSwFr_bsppl_dpt_nm.setListListener(p);
		p.columnSwFr_slip_sts_typ_nm.addAllListener(p);
		p.columnSwFr_slip_sts_typ_nm.setListListener(p);
		p.columnSwFr_trd_cd.addAllListener(p);
		p.columnSwFr_trd_cd.setListListener(p);
		p.columnSwFr_trd_nm.addAllListener(p);
		p.columnSwFr_trd_nm.setListListener(p);
		p.columnSwFr_ap_sttl_cd.addAllListener(p);
		p.columnSwFr_ap_sttl_cd.setListListener(p);
		p.columnSwFr_ap_sttl_nm.addAllListener(p);
		p.columnSwFr_ap_sttl_nm.setListListener(p);
		p.columnSwFr_ap_sttl_typ.addAllListener(p);
		p.columnSwFr_ap_sttl_typ.setListListener(p);
		p.columnSwFr_ap_sttl_typ_nm.addAllListener(p);
		p.columnSwFr_ap_sttl_typ_nm.setListListener(p);
		p.columnSwFr_act_no.addAllListener(p);
		p.columnSwFr_act_no.setListListener(p);
		p.columnSwFr_act_rev.addAllListener(p);
		p.columnSwFr_act_rev.setListListener(p);
		p.columnSwFr_act_d_no.addAllListener(p);
		p.columnSwFr_act_d_no.setListListener(p);
		p.columnSwFr_purc_dpt_cd.addAllListener(p);
		p.columnSwFr_purc_dpt_cd.setListListener(p);
		p.columnSwFr_purc_dpt_nm.addAllListener(p);
		p.columnSwFr_purc_dpt_nm.setListListener(p);
		p.columnSwFr_ap_d_no.addAllListener(p);
		p.columnSwFr_ap_d_no.setListListener(p);
		p.columnSwFr_sw_src_pay_schd_no.addAllListener(p);
		p.columnSwFr_sw_src_pay_schd_no.setListListener(p);
		p.columnSwFr_pay_schd_no.addAllListener(p);
		p.columnSwFr_pay_schd_no.setListListener(p);
		p.columnSwFr_pay_chk_mng_no.addAllListener(p);
		p.columnSwFr_pay_chk_mng_no.setListListener(p);
		p.columnSwFr_pay_chk_no.addAllListener(p);
		p.columnSwFr_pay_chk_no.setListListener(p);
		p.columnSwFr_pay_basis_dt.addAllListener(p);
		p.columnSwFr_pay_basis_dt.setListListener(p);
		p.columnSwFr_pay_crryovr_times.addAllListener(p);
		p.columnSwFr_pay_crryovr_times.setListListener(p);
		p.columnSwFr_pay_schd_dt.addAllListener(p);
		p.columnSwFr_pay_schd_dt.setListListener(p);
		p.columnSwFr_interim_flg.addAllListener(p);
		p.columnSwFr_wrk_no.addAllListener(p);
		p.columnSwFr_wrk_no.setListListener(p);
		p.columnSwFr_wrk_nm.addAllListener(p);
		p.columnSwFr_wrk_nm.setListListener(p);
		p.columnSwFr_purc_wrk_no.addAllListener(p);
		p.columnSwFr_purc_wrk_no.setListListener(p);
		p.columnSwFr_purc_wrk_nm.addAllListener(p);
		p.columnSwFr_purc_wrk_nm.setListListener(p);
		p.columnSwFr_ap_typ.addAllListener(p);
		p.columnSwFr_ap_typ.setListListener(p);
		p.columnSwFr_ap_typ_nm.addAllListener(p);
		p.columnSwFr_ap_typ_nm.setListListener(p);
		p.columnSwFr_xrate.addAllListener(p);
		p.columnSwFr_xrate.setListListener(p);
		p.columnSwFr_ac_ym.addAllListener(p);
		p.columnSwFr_ac_ym.setListListener(p);
		p.columnSwFr_ac_dt.addAllListener(p);
		p.columnSwFr_ac_dt.setListListener(p);
		p.columnSwFr_bsppl_cl_ym.addAllListener(p);
		p.columnSwFr_bsppl_cl_ym.setListListener(p);
		p.columnSwFr_bsppl_cl_day.addAllListener(p);
		p.columnSwFr_bsppl_cl_day.setListListener(p);
		p.columnSwFr_purc_act_no.addAllListener(p);
		p.columnSwFr_purc_act_no.setListListener(p);
		p.columnSwFr_rcpt_iv_no.addAllListener(p);
		p.columnSwFr_rcpt_iv_no.setListListener(p);
		p.columnSwFr_rcpt_iv_mng_no.addAllListener(p);
		p.columnSwFr_rcpt_iv_mng_no.setListListener(p);
		p.columnSwFr_sppl_cd.addAllListener(p);
		p.columnSwFr_sppl_cd.setListListener(p);
		p.columnSwFr_sppl_nm.addAllListener(p);
		p.columnSwFr_sppl_nm.setListListener(p);
		p.columnSwFr_po_no.addAllListener(p);
		p.columnSwFr_po_no.setListListener(p);
		p.columnSwFr_po_d_no.addAllListener(p);
		p.columnSwFr_po_d_no.setListListener(p);
		p.columnSwFr_bp_dlv_slip_no.addAllListener(p);
		p.columnSwFr_bp_dlv_slip_no.setListListener(p);
		p.columnSwFr_bp_dlv_slip_d_no.addAllListener(p);
		p.columnSwFr_bp_dlv_slip_d_no.setListListener(p);
		p.columnSwFr_trd_cur_cd.addAllListener(p);
		p.columnSwFr_trd_cur_cd.setListListener(p);
		p.columnSwFr_amt_dec_place.addAllListener(p);
		p.columnSwFr_amt_dec_place.setListListener(p);
	}

	/**
	 *  [Sw]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSw(MSBHP_ApSwBalReg p) {
		p.Sw_sw_dt.setListListener(p);
		p.Sw_sw_dt.addAllListener(p);
		p.Sw_ac_dt.setListListener(p);
		p.Sw_ac_dt.addAllListener(p);
		p.Sw_pay_basis_dt.setListListener(p);
		p.Sw_pay_basis_dt.addAllListener(p);
		p.Sw_pay_crryovr_times.setListListener(p);
		p.Sw_pay_crryovr_times.addAllListener(p);
		p.Sw_pay_schd_dt.setListListener(p);
		p.Sw_pay_schd_dt.addAllListener(p);
		p.Sw_ap_sttl_cd.setListListener(p);
		p.Sw_ap_sttl_cd.addAllListener(p);
		p.Sw_ap_sttl_nm.setListListener(p);
		p.Sw_ap_sttl_nm.addAllListener(p);
		p.Sw_ap_sttl_typ.setListListener(p);
		p.Sw_ap_sttl_typ.addAllListener(p);
		p.Sw_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Sw_trd_rmrks.setListListener(p);
		p.Sw_trd_rmrks.addAllListener(p);
		p.Sw_sub_char1.setListListener(p);
		p.Sw_sub_char1.addAllListener(p);
		p.Sw_sub_char2.setListListener(p);
		p.Sw_sub_char2.addAllListener(p);
		p.Sw_sub_char3.setListListener(p);
		p.Sw_sub_char3.addAllListener(p);
	}

	/**
	 *  [SwTo]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSwTo(MSBHP_ApSwBalReg p) {
		p.SwTo_asppl_cd.setListListener(p);
		p.SwTo_asppl_cd.addAllListener(p);
		p.SwTo_asppl_nm.setListListener(p);
		p.SwTo_asppl_nm.addAllListener(p);
		p.SwTo_ap_dpt_cd.setListListener(p);
		p.SwTo_ap_dpt_cd.addAllListener(p);
		p.SwTo_ap_dpt_nm.setListListener(p);
		p.SwTo_ap_dpt_nm.addAllListener(p);
		p.SwTo_bsppl_cd.setListListener(p);
		p.SwTo_bsppl_cd.addAllListener(p);
		p.SwTo_bsppl_nm.setListListener(p);
		p.SwTo_bsppl_nm.addAllListener(p);
		p.SwTo_pay_spot_flg.addAllListener(p);
		p.SwTo_bsppl_dpt_cd.setListListener(p);
		p.SwTo_bsppl_dpt_cd.addAllListener(p);
		p.SwTo_bsppl_dpt_nm.setListListener(p);
		p.SwTo_bsppl_dpt_nm.addAllListener(p);
		p.SwTo_ap_wrk_ope_typ.setListListener(p);
		p.SwTo_ap_wrk_ope_typ.addAllListener(p);
		p.SwTo_ap_wrk_ope_typ_nm.setListListener(p);
		p.SwTo_ap_wrk_ope_typ_nm.addAllListener(p);
		p.SwTo_trd_cur_cd.setListListener(p);
		p.SwTo_trd_cur_cd.addAllListener(p);
		p.SwTo_trd_cur_nm.setListListener(p);
		p.SwTo_trd_cur_nm.addAllListener(p);
		p.SwTo_amt_dec_place.setListListener(p);
		p.SwTo_amt_dec_place.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBHP_ApSwBalReg p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
	}

	/**
	 * [SRCH]ステータスの[Typ]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Typ(MSBHP_ApSwBalReg p){
		p.Typ_typ_Group.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBHP_ApSwBalReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBHP_ApSwBalReg p){
		p.Cnd_bsppl_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bsppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_asppl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_asppl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_ap_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ap_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBHP_ApSwBalReg p){

	}

	/**
	 * [SRCH]ステータスの[SwFr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SwFr(MSBHP_ApSwBalReg p){
		p.columnSwFr_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_asppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_asppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_ap_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_ap_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_bsppl_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_bsppl_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_slip_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_ap_sttl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_ap_sttl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_ap_sttl_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_ap_sttl_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_purc_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_purc_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_ap_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_sw_src_pay_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_pay_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_pay_chk_mng_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnSwFr_pay_chk_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_pay_basis_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_pay_crryovr_times.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_pay_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwFr_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.SwFr_tgt_sw_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnSwFr_interim_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_wrk_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_wrk_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_purc_wrk_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_purc_wrk_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_ap_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_ap_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_bsppl_cl_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_bsppl_cl_day.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_purc_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_rcpt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_rcpt_iv_mng_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_bp_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_bp_dlv_slip_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_trd_cur_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnSwFr_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Sw]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Sw(MSBHP_ApSwBalReg p){
		p.Sw_sw_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Sw_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Sw_pay_basis_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Sw_pay_crryovr_times.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Sw_pay_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Sw_ap_sttl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Sw_ap_sttl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Sw_ap_sttl_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Sw_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Sw_trd_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Sw_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Sw_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Sw_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[SwTo]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SwTo(MSBHP_ApSwBalReg p){
		p.SwTo_asppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwTo_asppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwTo_ap_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwTo_ap_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwTo_bsppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwTo_bsppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwTo_pay_spot_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.SwTo_bsppl_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwTo_bsppl_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwTo_ap_wrk_ope_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwTo_ap_wrk_ope_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwTo_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.SwTo_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwTo_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwTo_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.SwTo_tgt_sw_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBHP_ApSwBalReg p){
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Typ]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Typ(MSBHP_ApSwBalReg p){
		p.Typ_typ_Group.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBHP_ApSwBalReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBHP_ApSwBalReg p){
		p.Cnd_bsppl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_bsppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_asppl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_asppl_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_ap_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ap_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBHP_ApSwBalReg p){

	}

	/**
	 * [UPD]ステータスの[SwFr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SwFr(MSBHP_ApSwBalReg p){
		p.columnSwFr_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnSwFr_asppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_asppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_ap_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_ap_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_bsppl_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_bsppl_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_slip_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_ap_sttl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_ap_sttl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_ap_sttl_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_ap_sttl_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_act_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_purc_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_purc_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_ap_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_sw_src_pay_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_pay_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_pay_chk_mng_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnSwFr_pay_chk_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_pay_basis_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_pay_crryovr_times.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_pay_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.SwFr_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.SwFr_tgt_sw_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnSwFr_interim_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_wrk_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_wrk_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_purc_wrk_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_purc_wrk_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_ap_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_ap_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_xrate.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_ac_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_ac_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_bsppl_cl_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_bsppl_cl_day.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_purc_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_rcpt_iv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_rcpt_iv_mng_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_sppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_po_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_po_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_bp_dlv_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_bp_dlv_slip_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_trd_cur_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnSwFr_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Sw]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Sw(MSBHP_ApSwBalReg p){
		p.Sw_sw_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Sw_ac_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Sw_pay_basis_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Sw_pay_crryovr_times.putMode(p, UPD, MCMode.REQUIRED);
		p.Sw_pay_schd_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Sw_ap_sttl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Sw_ap_sttl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Sw_ap_sttl_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Sw_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Sw_usr_dpt_p_PPanel.UsrDpt_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Sw_trd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Sw_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Sw_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Sw_sub_char3.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[SwTo]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SwTo(MSBHP_ApSwBalReg p){
		p.SwTo_asppl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.SwTo_asppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.SwTo_ap_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.SwTo_ap_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.SwTo_bsppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.SwTo_bsppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.SwTo_pay_spot_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.SwTo_bsppl_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.SwTo_bsppl_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.SwTo_ap_wrk_ope_typ.putMode(p, UPD, MCMode.ENABLE);
		p.SwTo_ap_wrk_ope_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.SwTo_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.SwTo_trd_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.SwTo_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.SwTo_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.SwTo_tgt_sw_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBHP_ApSwBalReg p){
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Typ]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Typ(MSBHP_ApSwBalReg p){
		p.Typ_typ_Group.putMode(p, FIX_U, MCMode.REQUIRED);

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MSBHP_ApSwBalReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBHP_ApSwBalReg p){
		p.Cnd_bsppl_cd.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_bsppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_trd_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_asppl_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_asppl_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_ap_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ap_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MSBHP_ApSwBalReg p){

	}

	/**
	 * [FIX_U]ステータスの[SwFr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_SwFr(MSBHP_ApSwBalReg p){
		p.columnSwFr_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_asppl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_asppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_ap_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_ap_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_bsppl_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_bsppl_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_slip_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_ap_sttl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_ap_sttl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_ap_sttl_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_ap_sttl_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_act_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_purc_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_purc_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_ap_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_sw_src_pay_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_pay_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_pay_chk_mng_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnSwFr_pay_chk_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_pay_basis_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_pay_crryovr_times.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_pay_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwFr_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.SwFr_tgt_sw_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnSwFr_interim_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_wrk_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_wrk_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_purc_wrk_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_purc_wrk_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_ap_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_ap_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_xrate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_ac_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_bsppl_cl_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_bsppl_cl_day.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_purc_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_rcpt_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_rcpt_iv_mng_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_sppl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_sppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_po_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_po_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_bp_dlv_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_bp_dlv_slip_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_trd_cur_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnSwFr_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Sw]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Sw(MSBHP_ApSwBalReg p){
		p.Sw_sw_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Sw_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Sw_pay_basis_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Sw_pay_crryovr_times.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Sw_pay_schd_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Sw_ap_sttl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Sw_ap_sttl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Sw_ap_sttl_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Sw_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Sw_trd_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Sw_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Sw_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Sw_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[SwTo]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_SwTo(MSBHP_ApSwBalReg p){
		p.SwTo_asppl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwTo_asppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwTo_ap_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwTo_ap_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwTo_bsppl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwTo_bsppl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwTo_pay_spot_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.SwTo_bsppl_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwTo_bsppl_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwTo_ap_wrk_ope_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwTo_ap_wrk_ope_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwTo_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.SwTo_trd_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwTo_trd_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwTo_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.SwTo_tgt_sw_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBHP_ApSwBalReg p){
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);

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
		MSBHP_ApSwBalReg_MC.setTableConfigSwFr((MSBHP_ApSwBalReg)this);
	}

	/**
	 * [SwFr]ブロックのTableの設定
	 */
	protected static void setTableConfigSwFr(MSBHP_ApSwBalReg p) {
		p.columnSwFr_check.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.check_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_check);
		p.columnSwFr_asppl_cd.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.asppl_cd_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_asppl_cd);
		p.columnSwFr_asppl_nm.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.asppl_nm_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_asppl_nm);
		p.columnSwFr_ap_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.ap_dpt_cd_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_ap_dpt_cd);
		p.columnSwFr_ap_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.ap_dpt_nm_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_ap_dpt_nm);
		p.columnSwFr_wg_cd.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.wg_cd_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_wg_cd);
		p.columnSwFr_wg_nm.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.wg_nm_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_wg_nm);
		p.columnSwFr_bsppl_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.bsppl_dpt_cd_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_bsppl_dpt_cd);
		p.columnSwFr_bsppl_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.bsppl_dpt_nm_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_bsppl_dpt_nm);
		p.columnSwFr_slip_sts_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.slip_sts_typ_nm_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_slip_sts_typ_nm);
		p.columnSwFr_trd_cd.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.trd_cd_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_trd_cd);
		p.columnSwFr_trd_nm.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.trd_nm_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_trd_nm);
		p.columnSwFr_ap_sttl_cd.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.ap_sttl_cd_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_ap_sttl_cd);
		p.columnSwFr_ap_sttl_nm.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.ap_sttl_nm_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_ap_sttl_nm);
		p.columnSwFr_ap_sttl_typ.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.ap_sttl_typ_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_ap_sttl_typ);
		p.columnSwFr_ap_sttl_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.ap_sttl_typ_nm_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_ap_sttl_typ_nm);
		p.columnSwFr_act_no.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.act_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_act_no);
		p.columnSwFr_act_rev.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.act_rev_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_act_rev);
		p.columnSwFr_act_d_no.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.act_d_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_act_d_no);
		p.columnSwFr_purc_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.purc_dpt_cd_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_purc_dpt_cd);
		p.columnSwFr_purc_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.purc_dpt_nm_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_purc_dpt_nm);
		p.columnSwFr_ap_d_no.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.ap_d_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_ap_d_no);
		p.columnSwFr_sw_src_pay_schd_no.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.sw_src_pay_schd_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_sw_src_pay_schd_no);
		p.columnSwFr_pay_schd_no.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.pay_schd_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_pay_schd_no);
		p.columnSwFr_pay_chk_mng_no.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.pay_chk_mng_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_pay_chk_mng_no);
		p.columnSwFr_pay_chk_no.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.pay_chk_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_pay_chk_no);
		p.columnSwFr_pay_basis_dt.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.pay_basis_dt_META);
		p.columnSwFr_pay_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.SwFrTable.addColumnConfig(p.columnSwFr_pay_basis_dt);
		p.columnSwFr_pay_crryovr_times.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.pay_crryovr_times_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_pay_crryovr_times);
		p.columnSwFr_pay_schd_dt.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.pay_schd_dt_META);
		p.columnSwFr_pay_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.SwFrTable.addColumnConfig(p.columnSwFr_pay_schd_dt);
		p.SwFrTable.addTable(p.SwFr_inc_tax_amt_p_PPanel.AmtTable);
		p.SwFrTable.addTable(p.SwFr_tgt_sw_amt_p_PPanel.AmtTable);
		p.columnSwFr_interim_flg.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.interim_flg_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_interim_flg);
		p.columnSwFr_wrk_no.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.wrk_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_wrk_no);
		p.columnSwFr_wrk_nm.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.wrk_nm_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_wrk_nm);
		p.columnSwFr_purc_wrk_no.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.purc_wrk_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_purc_wrk_no);
		p.columnSwFr_purc_wrk_nm.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.purc_wrk_nm_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_purc_wrk_nm);
		p.columnSwFr_ap_typ.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.ap_typ_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_ap_typ);
		p.columnSwFr_ap_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.ap_typ_nm_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_ap_typ_nm);
		p.columnSwFr_xrate.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.xrate_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_xrate);
		p.columnSwFr_ac_ym.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.ac_ym_META);
		p.columnSwFr_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.SwFrTable.addColumnConfig(p.columnSwFr_ac_ym);
		p.columnSwFr_ac_dt.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.ac_dt_META);
		p.columnSwFr_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.SwFrTable.addColumnConfig(p.columnSwFr_ac_dt);
		p.columnSwFr_bsppl_cl_ym.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.bsppl_cl_ym_META);
		p.columnSwFr_bsppl_cl_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.SwFrTable.addColumnConfig(p.columnSwFr_bsppl_cl_ym);
		p.columnSwFr_bsppl_cl_day.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.bsppl_cl_day_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_bsppl_cl_day);
		p.columnSwFr_purc_act_no.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.purc_act_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_purc_act_no);
		p.columnSwFr_rcpt_iv_no.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.rcpt_iv_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_rcpt_iv_no);
		p.columnSwFr_rcpt_iv_mng_no.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.rcpt_iv_mng_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_rcpt_iv_mng_no);
		p.columnSwFr_sppl_cd.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.sppl_cd_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_sppl_cd);
		p.columnSwFr_sppl_nm.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.sppl_nm_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_sppl_nm);
		p.columnSwFr_po_no.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.po_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_po_no);
		p.columnSwFr_po_d_no.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.po_d_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_po_d_no);
		p.columnSwFr_bp_dlv_slip_no.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.bp_dlv_slip_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_bp_dlv_slip_no);
		p.columnSwFr_bp_dlv_slip_d_no.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.bp_dlv_slip_d_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_bp_dlv_slip_d_no);
		p.columnSwFr_trd_cur_cd.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.trd_cur_cd_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_trd_cur_cd);
		p.columnSwFr_amt_dec_place.setMeta(mcframe.clientMSBH.MSBHP0160.SwFrR.amt_dec_place_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_amt_dec_place);
		// スクロール固定カラムの指定
		p.SwFrTable.setUnscrollColumn(p.columnSwFr_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_bsppl_cd.getListConfig().setPutter(getCnd_bsppl_cd_ListPutter());
		Cnd_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cur_cd.getListConfig().setPutter(getCnd_trd_cur_cd_ListPutter());
		Cnd_bsppl_dpt_cd.getListConfig().setPutter(getCnd_bsppl_dpt_cd_ListPutter());
		Cnd_asppl_cd.getListConfig().setPutter(getCnd_asppl_cd_ListPutter());
		Cnd_ap_dpt_cd.getListConfig().setPutter(getCnd_ap_dpt_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_ap_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ap_typ.getListConfig().setPutter(getCnd_ap_typ_ListPutter());
		Sw_ap_sttl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Sw_ap_sttl_cd.getListConfig().setPutter(getSw_ap_sttl_cd_ListPutter());
		Sw_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Sw_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getSw_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		SwTo_asppl_cd.getListConfig().setPutter(getSwTo_asppl_cd_ListPutter());
		SwTo_ap_dpt_cd.getListConfig().setPutter(getSwTo_ap_dpt_cd_ListPutter());
		SwTo_bsppl_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		SwTo_bsppl_dpt_cd.getListConfig().setPutter(getSwTo_bsppl_dpt_cd_ListPutter());
		SwTo_ap_wrk_ope_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		SwTo_ap_wrk_ope_typ.getListConfig().setPutter(getSwTo_ap_wrk_ope_typ_ListPutter());
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
	}

	/**
	 * [Cnd_bsppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bsppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_trd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_trd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Cnd_bsppl_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bsppl_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_asppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_asppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_ap_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ap_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ApWg");
		return lp;
	}
	 
	/**
	 * [Cnd_ap_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ap_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ApTyp");
		return lp;
	}
	 
	/**
	 * [Sw_ap_sttl_cd_ListPutter]の作成
	 */
	protected MCListPutter createSw_ap_sttl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ApSttl");
		return lp;
	}
	 
	/**
	 * [Sw_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createSw_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [SwTo_asppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createSwTo_asppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [SwTo_ap_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createSwTo_ap_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [SwTo_bsppl_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createSwTo_bsppl_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [SwTo_ap_wrk_ope_typ_ListPutter]の作成
	 */
	protected MCListPutter createSwTo_ap_wrk_ope_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.ApWrkOpeTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_bsppl_cd) return getCnd_bsppl_cd(row, info);
		if(combo == Cnd_trd_cur_cd) return getCnd_trd_cur_cd(row, info);
		if(combo == Cnd_bsppl_dpt_cd) return getCnd_bsppl_dpt_cd(row, info);
		if(combo == Cnd_asppl_cd) return getCnd_asppl_cd(row, info);
		if(combo == Cnd_ap_dpt_cd) return getCnd_ap_dpt_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_ap_typ) return getCnd_ap_typ(row, info);
		if(combo == Sw_ap_sttl_cd) return getSw_ap_sttl_cd(row, info);
		if(combo == Sw_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getSw_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == SwTo_asppl_cd) return getSwTo_asppl_cd(row, info);
		if(combo == SwTo_ap_dpt_cd) return getSwTo_ap_dpt_cd(row, info);
		if(combo == SwTo_bsppl_dpt_cd) return getSwTo_bsppl_dpt_cd(row, info);
		if(combo == SwTo_ap_wrk_ope_typ) return getSwTo_ap_wrk_ope_typ(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_upd) doBtn_upd(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

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
		if (vc == SwFrTable) return doSwFr_VC(info);
		if (vc == Typ_typ_Group) return doTyp_typ_VC(info);
		if (vc == Cnd_bsppl_cd) return doCnd_bsppl_cd_VC(info);
		if (vc == Cnd_bsppl_nm) return doCnd_bsppl_nm_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
		if (vc == Cnd_amt_dec_place) return doCnd_amt_dec_place_VC(info);
		if (vc == Cnd_bsppl_dpt_cd) return doCnd_bsppl_dpt_cd_VC(info);
		if (vc == Cnd_bsppl_dpt_nm) return doCnd_bsppl_dpt_nm_VC(info);
		if (vc == Cnd_asppl_cd) return doCnd_asppl_cd_VC(info);
		if (vc == Cnd_asppl_nm) return doCnd_asppl_nm_VC(info);
		if (vc == Cnd_ap_dpt_cd) return doCnd_ap_dpt_cd_VC(info);
		if (vc == Cnd_ap_dpt_nm) return doCnd_ap_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_ap_typ) return doCnd_ap_typ_VC(info);
		if (vc == Cnd_ap_typ_nm) return doCnd_ap_typ_nm_VC(info);
		if (vc == columnSwFr_check) return doSwFr_check_VC(info);
		if (vc == columnSwFr_asppl_cd) return doSwFr_asppl_cd_VC(info);
		if (vc == columnSwFr_asppl_nm) return doSwFr_asppl_nm_VC(info);
		if (vc == columnSwFr_ap_dpt_cd) return doSwFr_ap_dpt_cd_VC(info);
		if (vc == columnSwFr_ap_dpt_nm) return doSwFr_ap_dpt_nm_VC(info);
		if (vc == columnSwFr_wg_cd) return doSwFr_wg_cd_VC(info);
		if (vc == columnSwFr_wg_nm) return doSwFr_wg_nm_VC(info);
		if (vc == columnSwFr_bsppl_dpt_cd) return doSwFr_bsppl_dpt_cd_VC(info);
		if (vc == columnSwFr_bsppl_dpt_nm) return doSwFr_bsppl_dpt_nm_VC(info);
		if (vc == columnSwFr_slip_sts_typ_nm) return doSwFr_slip_sts_typ_nm_VC(info);
		if (vc == columnSwFr_trd_cd) return doSwFr_trd_cd_VC(info);
		if (vc == columnSwFr_trd_nm) return doSwFr_trd_nm_VC(info);
		if (vc == columnSwFr_ap_sttl_cd) return doSwFr_ap_sttl_cd_VC(info);
		if (vc == columnSwFr_ap_sttl_nm) return doSwFr_ap_sttl_nm_VC(info);
		if (vc == columnSwFr_ap_sttl_typ) return doSwFr_ap_sttl_typ_VC(info);
		if (vc == columnSwFr_ap_sttl_typ_nm) return doSwFr_ap_sttl_typ_nm_VC(info);
		if (vc == columnSwFr_act_no) return doSwFr_act_no_VC(info);
		if (vc == columnSwFr_act_rev) return doSwFr_act_rev_VC(info);
		if (vc == columnSwFr_act_d_no) return doSwFr_act_d_no_VC(info);
		if (vc == columnSwFr_purc_dpt_cd) return doSwFr_purc_dpt_cd_VC(info);
		if (vc == columnSwFr_purc_dpt_nm) return doSwFr_purc_dpt_nm_VC(info);
		if (vc == columnSwFr_ap_d_no) return doSwFr_ap_d_no_VC(info);
		if (vc == columnSwFr_sw_src_pay_schd_no) return doSwFr_sw_src_pay_schd_no_VC(info);
		if (vc == columnSwFr_pay_schd_no) return doSwFr_pay_schd_no_VC(info);
		if (vc == columnSwFr_pay_chk_mng_no) return doSwFr_pay_chk_mng_no_VC(info);
		if (vc == columnSwFr_pay_chk_no) return doSwFr_pay_chk_no_VC(info);
		if (vc == columnSwFr_pay_basis_dt) return doSwFr_pay_basis_dt_VC(info);
		if (vc == columnSwFr_pay_crryovr_times) return doSwFr_pay_crryovr_times_VC(info);
		if (vc == columnSwFr_pay_schd_dt) return doSwFr_pay_schd_dt_VC(info);
		if (vc == columnSwFr_interim_flg) return doSwFr_interim_flg_VC(info);
		if (vc == columnSwFr_wrk_no) return doSwFr_wrk_no_VC(info);
		if (vc == columnSwFr_wrk_nm) return doSwFr_wrk_nm_VC(info);
		if (vc == columnSwFr_purc_wrk_no) return doSwFr_purc_wrk_no_VC(info);
		if (vc == columnSwFr_purc_wrk_nm) return doSwFr_purc_wrk_nm_VC(info);
		if (vc == columnSwFr_ap_typ) return doSwFr_ap_typ_VC(info);
		if (vc == columnSwFr_ap_typ_nm) return doSwFr_ap_typ_nm_VC(info);
		if (vc == columnSwFr_xrate) return doSwFr_xrate_VC(info);
		if (vc == columnSwFr_ac_ym) return doSwFr_ac_ym_VC(info);
		if (vc == columnSwFr_ac_dt) return doSwFr_ac_dt_VC(info);
		if (vc == columnSwFr_bsppl_cl_ym) return doSwFr_bsppl_cl_ym_VC(info);
		if (vc == columnSwFr_bsppl_cl_day) return doSwFr_bsppl_cl_day_VC(info);
		if (vc == columnSwFr_purc_act_no) return doSwFr_purc_act_no_VC(info);
		if (vc == columnSwFr_rcpt_iv_no) return doSwFr_rcpt_iv_no_VC(info);
		if (vc == columnSwFr_rcpt_iv_mng_no) return doSwFr_rcpt_iv_mng_no_VC(info);
		if (vc == columnSwFr_sppl_cd) return doSwFr_sppl_cd_VC(info);
		if (vc == columnSwFr_sppl_nm) return doSwFr_sppl_nm_VC(info);
		if (vc == columnSwFr_po_no) return doSwFr_po_no_VC(info);
		if (vc == columnSwFr_po_d_no) return doSwFr_po_d_no_VC(info);
		if (vc == columnSwFr_bp_dlv_slip_no) return doSwFr_bp_dlv_slip_no_VC(info);
		if (vc == columnSwFr_bp_dlv_slip_d_no) return doSwFr_bp_dlv_slip_d_no_VC(info);
		if (vc == columnSwFr_trd_cur_cd) return doSwFr_trd_cur_cd_VC(info);
		if (vc == columnSwFr_amt_dec_place) return doSwFr_amt_dec_place_VC(info);
		if (vc == Sw_sw_dt) return doSw_sw_dt_VC(info);
		if (vc == Sw_ac_dt) return doSw_ac_dt_VC(info);
		if (vc == Sw_pay_basis_dt) return doSw_pay_basis_dt_VC(info);
		if (vc == Sw_pay_crryovr_times) return doSw_pay_crryovr_times_VC(info);
		if (vc == Sw_pay_schd_dt) return doSw_pay_schd_dt_VC(info);
		if (vc == Sw_ap_sttl_cd) return doSw_ap_sttl_cd_VC(info);
		if (vc == Sw_ap_sttl_nm) return doSw_ap_sttl_nm_VC(info);
		if (vc == Sw_ap_sttl_typ) return doSw_ap_sttl_typ_VC(info);
		if (vc == Sw_trd_rmrks) return doSw_trd_rmrks_VC(info);
		if (vc == Sw_sub_char1) return doSw_sub_char1_VC(info);
		if (vc == Sw_sub_char2) return doSw_sub_char2_VC(info);
		if (vc == Sw_sub_char3) return doSw_sub_char3_VC(info);
		if (vc == SwTo_asppl_cd) return doSwTo_asppl_cd_VC(info);
		if (vc == SwTo_asppl_nm) return doSwTo_asppl_nm_VC(info);
		if (vc == SwTo_ap_dpt_cd) return doSwTo_ap_dpt_cd_VC(info);
		if (vc == SwTo_ap_dpt_nm) return doSwTo_ap_dpt_nm_VC(info);
		if (vc == SwTo_bsppl_cd) return doSwTo_bsppl_cd_VC(info);
		if (vc == SwTo_bsppl_nm) return doSwTo_bsppl_nm_VC(info);
		if (vc == SwTo_pay_spot_flg) return doSwTo_pay_spot_flg_VC(info);
		if (vc == SwTo_bsppl_dpt_cd) return doSwTo_bsppl_dpt_cd_VC(info);
		if (vc == SwTo_bsppl_dpt_nm) return doSwTo_bsppl_dpt_nm_VC(info);
		if (vc == SwTo_ap_wrk_ope_typ) return doSwTo_ap_wrk_ope_typ_VC(info);
		if (vc == SwTo_ap_wrk_ope_typ_nm) return doSwTo_ap_wrk_ope_typ_nm_VC(info);
		if (vc == SwTo_trd_cur_cd) return doSwTo_trd_cur_cd_VC(info);
		if (vc == SwTo_trd_cur_nm) return doSwTo_trd_cur_nm_VC(info);
		if (vc == SwTo_amt_dec_place) return doSwTo_amt_dec_place_VC(info);
		return true;
	}

	/**
	 * [SwFr]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Typ]パネルの[typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTyp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[asppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[asppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[asppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_asppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[asppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_asppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[ap_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_ap_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[bsppl_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_bsppl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[bsppl_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_bsppl_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[slip_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_slip_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[ap_sttl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_ap_sttl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[ap_sttl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_ap_sttl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[ap_sttl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_ap_sttl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[ap_sttl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_ap_sttl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[purc_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_purc_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[purc_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_purc_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[ap_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_ap_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[sw_src_pay_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_sw_src_pay_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[pay_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_pay_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[pay_chk_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_pay_chk_mng_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[pay_chk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_pay_chk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[pay_basis_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_pay_basis_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[pay_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_pay_crryovr_times_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[pay_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_pay_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[wrk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_wrk_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[purc_wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_purc_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[purc_wrk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_purc_wrk_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[ap_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_ap_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[ap_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_ap_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_xrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[bsppl_cl_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_bsppl_cl_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[bsppl_cl_day]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_bsppl_cl_day_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[purc_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_purc_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[rcpt_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_rcpt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[rcpt_iv_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_rcpt_iv_mng_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[bp_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_bp_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[bp_dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_bp_dlv_slip_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sw]パネルの[sw_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSw_sw_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sw]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSw_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sw]パネルの[pay_basis_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSw_pay_basis_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sw]パネルの[pay_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSw_pay_crryovr_times_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sw]パネルの[pay_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSw_pay_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sw]パネルの[ap_sttl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSw_ap_sttl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sw]パネルの[ap_sttl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSw_ap_sttl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sw]パネルの[ap_sttl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSw_ap_sttl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sw]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSw_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sw]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSw_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sw]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSw_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sw]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSw_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwTo]パネルの[asppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwTo_asppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwTo]パネルの[asppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwTo_asppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwTo]パネルの[ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwTo_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwTo]パネルの[ap_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwTo_ap_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwTo]パネルの[bsppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwTo_bsppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwTo]パネルの[bsppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwTo_bsppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwTo]パネルの[pay_spot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwTo_pay_spot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwTo]パネルの[bsppl_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwTo_bsppl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwTo]パネルの[bsppl_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwTo_bsppl_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwTo]パネルの[ap_wrk_ope_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwTo_ap_wrk_ope_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwTo]パネルの[ap_wrk_ope_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwTo_ap_wrk_ope_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwTo]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwTo_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwTo]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwTo_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwTo]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwTo_amt_dec_place_VC(MCEventInfo info){
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
		if (nc == SwFrTable) doSwFr_NC(info);
		else if (nc == Typ_typ_Group) doTyp_typ_NC(info);
		else if (nc == Cnd_bsppl_cd) doCnd_bsppl_cd_NC(info);
		else if (nc == Cnd_bsppl_nm) doCnd_bsppl_nm_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
		else if (nc == Cnd_amt_dec_place) doCnd_amt_dec_place_NC(info);
		else if (nc == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NC(info);
		else if (nc == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NC(info);
		else if (nc == Cnd_asppl_cd) doCnd_asppl_cd_NC(info);
		else if (nc == Cnd_asppl_nm) doCnd_asppl_nm_NC(info);
		else if (nc == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NC(info);
		else if (nc == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_ap_typ) doCnd_ap_typ_NC(info);
		else if (nc == Cnd_ap_typ_nm) doCnd_ap_typ_nm_NC(info);
		else if (nc == columnSwFr_check) doSwFr_check_NC(info);
		else if (nc == columnSwFr_asppl_cd) doSwFr_asppl_cd_NC(info);
		else if (nc == columnSwFr_asppl_nm) doSwFr_asppl_nm_NC(info);
		else if (nc == columnSwFr_ap_dpt_cd) doSwFr_ap_dpt_cd_NC(info);
		else if (nc == columnSwFr_ap_dpt_nm) doSwFr_ap_dpt_nm_NC(info);
		else if (nc == columnSwFr_wg_cd) doSwFr_wg_cd_NC(info);
		else if (nc == columnSwFr_wg_nm) doSwFr_wg_nm_NC(info);
		else if (nc == columnSwFr_bsppl_dpt_cd) doSwFr_bsppl_dpt_cd_NC(info);
		else if (nc == columnSwFr_bsppl_dpt_nm) doSwFr_bsppl_dpt_nm_NC(info);
		else if (nc == columnSwFr_slip_sts_typ_nm) doSwFr_slip_sts_typ_nm_NC(info);
		else if (nc == columnSwFr_trd_cd) doSwFr_trd_cd_NC(info);
		else if (nc == columnSwFr_trd_nm) doSwFr_trd_nm_NC(info);
		else if (nc == columnSwFr_ap_sttl_cd) doSwFr_ap_sttl_cd_NC(info);
		else if (nc == columnSwFr_ap_sttl_nm) doSwFr_ap_sttl_nm_NC(info);
		else if (nc == columnSwFr_ap_sttl_typ) doSwFr_ap_sttl_typ_NC(info);
		else if (nc == columnSwFr_ap_sttl_typ_nm) doSwFr_ap_sttl_typ_nm_NC(info);
		else if (nc == columnSwFr_act_no) doSwFr_act_no_NC(info);
		else if (nc == columnSwFr_act_rev) doSwFr_act_rev_NC(info);
		else if (nc == columnSwFr_act_d_no) doSwFr_act_d_no_NC(info);
		else if (nc == columnSwFr_purc_dpt_cd) doSwFr_purc_dpt_cd_NC(info);
		else if (nc == columnSwFr_purc_dpt_nm) doSwFr_purc_dpt_nm_NC(info);
		else if (nc == columnSwFr_ap_d_no) doSwFr_ap_d_no_NC(info);
		else if (nc == columnSwFr_sw_src_pay_schd_no) doSwFr_sw_src_pay_schd_no_NC(info);
		else if (nc == columnSwFr_pay_schd_no) doSwFr_pay_schd_no_NC(info);
		else if (nc == columnSwFr_pay_chk_mng_no) doSwFr_pay_chk_mng_no_NC(info);
		else if (nc == columnSwFr_pay_chk_no) doSwFr_pay_chk_no_NC(info);
		else if (nc == columnSwFr_pay_basis_dt) doSwFr_pay_basis_dt_NC(info);
		else if (nc == columnSwFr_pay_crryovr_times) doSwFr_pay_crryovr_times_NC(info);
		else if (nc == columnSwFr_pay_schd_dt) doSwFr_pay_schd_dt_NC(info);
		else if (nc == columnSwFr_interim_flg) doSwFr_interim_flg_NC(info);
		else if (nc == columnSwFr_wrk_no) doSwFr_wrk_no_NC(info);
		else if (nc == columnSwFr_wrk_nm) doSwFr_wrk_nm_NC(info);
		else if (nc == columnSwFr_purc_wrk_no) doSwFr_purc_wrk_no_NC(info);
		else if (nc == columnSwFr_purc_wrk_nm) doSwFr_purc_wrk_nm_NC(info);
		else if (nc == columnSwFr_ap_typ) doSwFr_ap_typ_NC(info);
		else if (nc == columnSwFr_ap_typ_nm) doSwFr_ap_typ_nm_NC(info);
		else if (nc == columnSwFr_xrate) doSwFr_xrate_NC(info);
		else if (nc == columnSwFr_ac_ym) doSwFr_ac_ym_NC(info);
		else if (nc == columnSwFr_ac_dt) doSwFr_ac_dt_NC(info);
		else if (nc == columnSwFr_bsppl_cl_ym) doSwFr_bsppl_cl_ym_NC(info);
		else if (nc == columnSwFr_bsppl_cl_day) doSwFr_bsppl_cl_day_NC(info);
		else if (nc == columnSwFr_purc_act_no) doSwFr_purc_act_no_NC(info);
		else if (nc == columnSwFr_rcpt_iv_no) doSwFr_rcpt_iv_no_NC(info);
		else if (nc == columnSwFr_rcpt_iv_mng_no) doSwFr_rcpt_iv_mng_no_NC(info);
		else if (nc == columnSwFr_sppl_cd) doSwFr_sppl_cd_NC(info);
		else if (nc == columnSwFr_sppl_nm) doSwFr_sppl_nm_NC(info);
		else if (nc == columnSwFr_po_no) doSwFr_po_no_NC(info);
		else if (nc == columnSwFr_po_d_no) doSwFr_po_d_no_NC(info);
		else if (nc == columnSwFr_bp_dlv_slip_no) doSwFr_bp_dlv_slip_no_NC(info);
		else if (nc == columnSwFr_bp_dlv_slip_d_no) doSwFr_bp_dlv_slip_d_no_NC(info);
		else if (nc == columnSwFr_trd_cur_cd) doSwFr_trd_cur_cd_NC(info);
		else if (nc == columnSwFr_amt_dec_place) doSwFr_amt_dec_place_NC(info);
		else if (nc == Sw_sw_dt) doSw_sw_dt_NC(info);
		else if (nc == Sw_ac_dt) doSw_ac_dt_NC(info);
		else if (nc == Sw_pay_basis_dt) doSw_pay_basis_dt_NC(info);
		else if (nc == Sw_pay_crryovr_times) doSw_pay_crryovr_times_NC(info);
		else if (nc == Sw_pay_schd_dt) doSw_pay_schd_dt_NC(info);
		else if (nc == Sw_ap_sttl_cd) doSw_ap_sttl_cd_NC(info);
		else if (nc == Sw_ap_sttl_nm) doSw_ap_sttl_nm_NC(info);
		else if (nc == Sw_ap_sttl_typ) doSw_ap_sttl_typ_NC(info);
		else if (nc == Sw_trd_rmrks) doSw_trd_rmrks_NC(info);
		else if (nc == Sw_sub_char1) doSw_sub_char1_NC(info);
		else if (nc == Sw_sub_char2) doSw_sub_char2_NC(info);
		else if (nc == Sw_sub_char3) doSw_sub_char3_NC(info);
		else if (nc == SwTo_asppl_cd) doSwTo_asppl_cd_NC(info);
		else if (nc == SwTo_asppl_nm) doSwTo_asppl_nm_NC(info);
		else if (nc == SwTo_ap_dpt_cd) doSwTo_ap_dpt_cd_NC(info);
		else if (nc == SwTo_ap_dpt_nm) doSwTo_ap_dpt_nm_NC(info);
		else if (nc == SwTo_bsppl_cd) doSwTo_bsppl_cd_NC(info);
		else if (nc == SwTo_bsppl_nm) doSwTo_bsppl_nm_NC(info);
		else if (nc == SwTo_pay_spot_flg) doSwTo_pay_spot_flg_NC(info);
		else if (nc == SwTo_bsppl_dpt_cd) doSwTo_bsppl_dpt_cd_NC(info);
		else if (nc == SwTo_bsppl_dpt_nm) doSwTo_bsppl_dpt_nm_NC(info);
		else if (nc == SwTo_ap_wrk_ope_typ) doSwTo_ap_wrk_ope_typ_NC(info);
		else if (nc == SwTo_ap_wrk_ope_typ_nm) doSwTo_ap_wrk_ope_typ_nm_NC(info);
		else if (nc == SwTo_trd_cur_cd) doSwTo_trd_cur_cd_NC(info);
		else if (nc == SwTo_trd_cur_nm) doSwTo_trd_cur_nm_NC(info);
		else if (nc == SwTo_amt_dec_place) doSwTo_amt_dec_place_NC(info);
	}

	/**
	 * [SwFr]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_NC(MCEventInfo info){
	}

	/**
	 * [Typ]パネルの[typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTyp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_check_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[asppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_asppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[asppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_asppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bsppl_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bsppl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bsppl_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bsppl_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[slip_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_slip_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_sttl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_sttl_cd_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_sttl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_sttl_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_sttl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_sttl_typ_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_sttl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_sttl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_act_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[purc_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_purc_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[purc_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_purc_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_d_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sw_src_pay_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sw_src_pay_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[pay_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_pay_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[pay_chk_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_pay_chk_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[pay_chk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_pay_chk_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[pay_basis_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_pay_basis_dt_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[pay_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_pay_crryovr_times_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[pay_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_pay_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[wrk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_wrk_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[purc_wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_purc_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[purc_wrk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_purc_wrk_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_typ_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_xrate_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bsppl_cl_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bsppl_cl_ym_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bsppl_cl_day]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bsppl_cl_day_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[purc_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_purc_act_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[rcpt_iv_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_rcpt_iv_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_po_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bp_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bp_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bp_dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bp_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[sw_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_sw_dt_NC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[pay_basis_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_pay_basis_dt_NC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[pay_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_pay_crryovr_times_NC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[pay_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_pay_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[ap_sttl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_ap_sttl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[ap_sttl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_ap_sttl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[ap_sttl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_ap_sttl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[asppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_asppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[asppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_asppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[ap_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_ap_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bsppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bsppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bsppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bsppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[pay_spot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_pay_spot_flg_NC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bsppl_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bsppl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bsppl_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bsppl_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[ap_wrk_ope_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_ap_wrk_ope_typ_NC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[ap_wrk_ope_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_ap_wrk_ope_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == SwFrTable) doSwFr_NE(info);
		else if (ne == Typ_typ_Group) doTyp_typ_NE(info);
		else if (ne == Cnd_bsppl_cd) doCnd_bsppl_cd_NE(info);
		else if (ne == Cnd_bsppl_nm) doCnd_bsppl_nm_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
		else if (ne == Cnd_amt_dec_place) doCnd_amt_dec_place_NE(info);
		else if (ne == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NE(info);
		else if (ne == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NE(info);
		else if (ne == Cnd_asppl_cd) doCnd_asppl_cd_NE(info);
		else if (ne == Cnd_asppl_nm) doCnd_asppl_nm_NE(info);
		else if (ne == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NE(info);
		else if (ne == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_ap_typ) doCnd_ap_typ_NE(info);
		else if (ne == Cnd_ap_typ_nm) doCnd_ap_typ_nm_NE(info);
		else if (ne == columnSwFr_check) doSwFr_check_NE(info);
		else if (ne == columnSwFr_asppl_cd) doSwFr_asppl_cd_NE(info);
		else if (ne == columnSwFr_asppl_nm) doSwFr_asppl_nm_NE(info);
		else if (ne == columnSwFr_ap_dpt_cd) doSwFr_ap_dpt_cd_NE(info);
		else if (ne == columnSwFr_ap_dpt_nm) doSwFr_ap_dpt_nm_NE(info);
		else if (ne == columnSwFr_wg_cd) doSwFr_wg_cd_NE(info);
		else if (ne == columnSwFr_wg_nm) doSwFr_wg_nm_NE(info);
		else if (ne == columnSwFr_bsppl_dpt_cd) doSwFr_bsppl_dpt_cd_NE(info);
		else if (ne == columnSwFr_bsppl_dpt_nm) doSwFr_bsppl_dpt_nm_NE(info);
		else if (ne == columnSwFr_slip_sts_typ_nm) doSwFr_slip_sts_typ_nm_NE(info);
		else if (ne == columnSwFr_trd_cd) doSwFr_trd_cd_NE(info);
		else if (ne == columnSwFr_trd_nm) doSwFr_trd_nm_NE(info);
		else if (ne == columnSwFr_ap_sttl_cd) doSwFr_ap_sttl_cd_NE(info);
		else if (ne == columnSwFr_ap_sttl_nm) doSwFr_ap_sttl_nm_NE(info);
		else if (ne == columnSwFr_ap_sttl_typ) doSwFr_ap_sttl_typ_NE(info);
		else if (ne == columnSwFr_ap_sttl_typ_nm) doSwFr_ap_sttl_typ_nm_NE(info);
		else if (ne == columnSwFr_act_no) doSwFr_act_no_NE(info);
		else if (ne == columnSwFr_act_rev) doSwFr_act_rev_NE(info);
		else if (ne == columnSwFr_act_d_no) doSwFr_act_d_no_NE(info);
		else if (ne == columnSwFr_purc_dpt_cd) doSwFr_purc_dpt_cd_NE(info);
		else if (ne == columnSwFr_purc_dpt_nm) doSwFr_purc_dpt_nm_NE(info);
		else if (ne == columnSwFr_ap_d_no) doSwFr_ap_d_no_NE(info);
		else if (ne == columnSwFr_sw_src_pay_schd_no) doSwFr_sw_src_pay_schd_no_NE(info);
		else if (ne == columnSwFr_pay_schd_no) doSwFr_pay_schd_no_NE(info);
		else if (ne == columnSwFr_pay_chk_mng_no) doSwFr_pay_chk_mng_no_NE(info);
		else if (ne == columnSwFr_pay_chk_no) doSwFr_pay_chk_no_NE(info);
		else if (ne == columnSwFr_pay_basis_dt) doSwFr_pay_basis_dt_NE(info);
		else if (ne == columnSwFr_pay_crryovr_times) doSwFr_pay_crryovr_times_NE(info);
		else if (ne == columnSwFr_pay_schd_dt) doSwFr_pay_schd_dt_NE(info);
		else if (ne == columnSwFr_interim_flg) doSwFr_interim_flg_NE(info);
		else if (ne == columnSwFr_wrk_no) doSwFr_wrk_no_NE(info);
		else if (ne == columnSwFr_wrk_nm) doSwFr_wrk_nm_NE(info);
		else if (ne == columnSwFr_purc_wrk_no) doSwFr_purc_wrk_no_NE(info);
		else if (ne == columnSwFr_purc_wrk_nm) doSwFr_purc_wrk_nm_NE(info);
		else if (ne == columnSwFr_ap_typ) doSwFr_ap_typ_NE(info);
		else if (ne == columnSwFr_ap_typ_nm) doSwFr_ap_typ_nm_NE(info);
		else if (ne == columnSwFr_xrate) doSwFr_xrate_NE(info);
		else if (ne == columnSwFr_ac_ym) doSwFr_ac_ym_NE(info);
		else if (ne == columnSwFr_ac_dt) doSwFr_ac_dt_NE(info);
		else if (ne == columnSwFr_bsppl_cl_ym) doSwFr_bsppl_cl_ym_NE(info);
		else if (ne == columnSwFr_bsppl_cl_day) doSwFr_bsppl_cl_day_NE(info);
		else if (ne == columnSwFr_purc_act_no) doSwFr_purc_act_no_NE(info);
		else if (ne == columnSwFr_rcpt_iv_no) doSwFr_rcpt_iv_no_NE(info);
		else if (ne == columnSwFr_rcpt_iv_mng_no) doSwFr_rcpt_iv_mng_no_NE(info);
		else if (ne == columnSwFr_sppl_cd) doSwFr_sppl_cd_NE(info);
		else if (ne == columnSwFr_sppl_nm) doSwFr_sppl_nm_NE(info);
		else if (ne == columnSwFr_po_no) doSwFr_po_no_NE(info);
		else if (ne == columnSwFr_po_d_no) doSwFr_po_d_no_NE(info);
		else if (ne == columnSwFr_bp_dlv_slip_no) doSwFr_bp_dlv_slip_no_NE(info);
		else if (ne == columnSwFr_bp_dlv_slip_d_no) doSwFr_bp_dlv_slip_d_no_NE(info);
		else if (ne == columnSwFr_trd_cur_cd) doSwFr_trd_cur_cd_NE(info);
		else if (ne == columnSwFr_amt_dec_place) doSwFr_amt_dec_place_NE(info);
		else if (ne == Sw_sw_dt) doSw_sw_dt_NE(info);
		else if (ne == Sw_ac_dt) doSw_ac_dt_NE(info);
		else if (ne == Sw_pay_basis_dt) doSw_pay_basis_dt_NE(info);
		else if (ne == Sw_pay_crryovr_times) doSw_pay_crryovr_times_NE(info);
		else if (ne == Sw_pay_schd_dt) doSw_pay_schd_dt_NE(info);
		else if (ne == Sw_ap_sttl_cd) doSw_ap_sttl_cd_NE(info);
		else if (ne == Sw_ap_sttl_nm) doSw_ap_sttl_nm_NE(info);
		else if (ne == Sw_ap_sttl_typ) doSw_ap_sttl_typ_NE(info);
		else if (ne == Sw_trd_rmrks) doSw_trd_rmrks_NE(info);
		else if (ne == Sw_sub_char1) doSw_sub_char1_NE(info);
		else if (ne == Sw_sub_char2) doSw_sub_char2_NE(info);
		else if (ne == Sw_sub_char3) doSw_sub_char3_NE(info);
		else if (ne == SwTo_asppl_cd) doSwTo_asppl_cd_NE(info);
		else if (ne == SwTo_asppl_nm) doSwTo_asppl_nm_NE(info);
		else if (ne == SwTo_ap_dpt_cd) doSwTo_ap_dpt_cd_NE(info);
		else if (ne == SwTo_ap_dpt_nm) doSwTo_ap_dpt_nm_NE(info);
		else if (ne == SwTo_bsppl_cd) doSwTo_bsppl_cd_NE(info);
		else if (ne == SwTo_bsppl_nm) doSwTo_bsppl_nm_NE(info);
		else if (ne == SwTo_pay_spot_flg) doSwTo_pay_spot_flg_NE(info);
		else if (ne == SwTo_bsppl_dpt_cd) doSwTo_bsppl_dpt_cd_NE(info);
		else if (ne == SwTo_bsppl_dpt_nm) doSwTo_bsppl_dpt_nm_NE(info);
		else if (ne == SwTo_ap_wrk_ope_typ) doSwTo_ap_wrk_ope_typ_NE(info);
		else if (ne == SwTo_ap_wrk_ope_typ_nm) doSwTo_ap_wrk_ope_typ_nm_NE(info);
		else if (ne == SwTo_trd_cur_cd) doSwTo_trd_cur_cd_NE(info);
		else if (ne == SwTo_trd_cur_nm) doSwTo_trd_cur_nm_NE(info);
		else if (ne == SwTo_amt_dec_place) doSwTo_amt_dec_place_NE(info);
	}

	/**
	 * [SwFr]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_NE(MCEventInfo info){
	}

	/**
	 * [Typ]パネルの[typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTyp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_check_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[asppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_asppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[asppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_asppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bsppl_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bsppl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bsppl_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bsppl_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[slip_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_slip_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_sttl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_sttl_cd_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_sttl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_sttl_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_sttl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_sttl_typ_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_sttl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_sttl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_act_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[purc_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_purc_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[purc_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_purc_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_d_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sw_src_pay_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sw_src_pay_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[pay_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_pay_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[pay_chk_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_pay_chk_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[pay_chk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_pay_chk_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[pay_basis_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_pay_basis_dt_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[pay_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_pay_crryovr_times_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[pay_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_pay_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[wrk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_wrk_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[purc_wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_purc_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[purc_wrk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_purc_wrk_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_typ_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_xrate_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bsppl_cl_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bsppl_cl_ym_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bsppl_cl_day]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bsppl_cl_day_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[purc_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_purc_act_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[rcpt_iv_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_rcpt_iv_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_po_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bp_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bp_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bp_dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bp_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[sw_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_sw_dt_NE(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[pay_basis_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_pay_basis_dt_NE(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[pay_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_pay_crryovr_times_NE(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[pay_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_pay_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[ap_sttl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_ap_sttl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[ap_sttl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_ap_sttl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[ap_sttl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_ap_sttl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[asppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_asppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[asppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_asppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[ap_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_ap_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bsppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bsppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bsppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bsppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[pay_spot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_pay_spot_flg_NE(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bsppl_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bsppl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bsppl_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bsppl_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[ap_wrk_ope_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_ap_wrk_ope_typ_NE(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[ap_wrk_ope_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_ap_wrk_ope_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == SwFrTable) doSwFr_NX(info);
		else if (nx == Typ_typ_Group) doTyp_typ_NX(info);
		else if (nx == Cnd_bsppl_cd) doCnd_bsppl_cd_NX(info);
		else if (nx == Cnd_bsppl_nm) doCnd_bsppl_nm_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
		else if (nx == Cnd_amt_dec_place) doCnd_amt_dec_place_NX(info);
		else if (nx == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NX(info);
		else if (nx == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NX(info);
		else if (nx == Cnd_asppl_cd) doCnd_asppl_cd_NX(info);
		else if (nx == Cnd_asppl_nm) doCnd_asppl_nm_NX(info);
		else if (nx == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NX(info);
		else if (nx == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_ap_typ) doCnd_ap_typ_NX(info);
		else if (nx == Cnd_ap_typ_nm) doCnd_ap_typ_nm_NX(info);
		else if (nx == columnSwFr_check) doSwFr_check_NX(info);
		else if (nx == columnSwFr_asppl_cd) doSwFr_asppl_cd_NX(info);
		else if (nx == columnSwFr_asppl_nm) doSwFr_asppl_nm_NX(info);
		else if (nx == columnSwFr_ap_dpt_cd) doSwFr_ap_dpt_cd_NX(info);
		else if (nx == columnSwFr_ap_dpt_nm) doSwFr_ap_dpt_nm_NX(info);
		else if (nx == columnSwFr_wg_cd) doSwFr_wg_cd_NX(info);
		else if (nx == columnSwFr_wg_nm) doSwFr_wg_nm_NX(info);
		else if (nx == columnSwFr_bsppl_dpt_cd) doSwFr_bsppl_dpt_cd_NX(info);
		else if (nx == columnSwFr_bsppl_dpt_nm) doSwFr_bsppl_dpt_nm_NX(info);
		else if (nx == columnSwFr_slip_sts_typ_nm) doSwFr_slip_sts_typ_nm_NX(info);
		else if (nx == columnSwFr_trd_cd) doSwFr_trd_cd_NX(info);
		else if (nx == columnSwFr_trd_nm) doSwFr_trd_nm_NX(info);
		else if (nx == columnSwFr_ap_sttl_cd) doSwFr_ap_sttl_cd_NX(info);
		else if (nx == columnSwFr_ap_sttl_nm) doSwFr_ap_sttl_nm_NX(info);
		else if (nx == columnSwFr_ap_sttl_typ) doSwFr_ap_sttl_typ_NX(info);
		else if (nx == columnSwFr_ap_sttl_typ_nm) doSwFr_ap_sttl_typ_nm_NX(info);
		else if (nx == columnSwFr_act_no) doSwFr_act_no_NX(info);
		else if (nx == columnSwFr_act_rev) doSwFr_act_rev_NX(info);
		else if (nx == columnSwFr_act_d_no) doSwFr_act_d_no_NX(info);
		else if (nx == columnSwFr_purc_dpt_cd) doSwFr_purc_dpt_cd_NX(info);
		else if (nx == columnSwFr_purc_dpt_nm) doSwFr_purc_dpt_nm_NX(info);
		else if (nx == columnSwFr_ap_d_no) doSwFr_ap_d_no_NX(info);
		else if (nx == columnSwFr_sw_src_pay_schd_no) doSwFr_sw_src_pay_schd_no_NX(info);
		else if (nx == columnSwFr_pay_schd_no) doSwFr_pay_schd_no_NX(info);
		else if (nx == columnSwFr_pay_chk_mng_no) doSwFr_pay_chk_mng_no_NX(info);
		else if (nx == columnSwFr_pay_chk_no) doSwFr_pay_chk_no_NX(info);
		else if (nx == columnSwFr_pay_basis_dt) doSwFr_pay_basis_dt_NX(info);
		else if (nx == columnSwFr_pay_crryovr_times) doSwFr_pay_crryovr_times_NX(info);
		else if (nx == columnSwFr_pay_schd_dt) doSwFr_pay_schd_dt_NX(info);
		else if (nx == columnSwFr_interim_flg) doSwFr_interim_flg_NX(info);
		else if (nx == columnSwFr_wrk_no) doSwFr_wrk_no_NX(info);
		else if (nx == columnSwFr_wrk_nm) doSwFr_wrk_nm_NX(info);
		else if (nx == columnSwFr_purc_wrk_no) doSwFr_purc_wrk_no_NX(info);
		else if (nx == columnSwFr_purc_wrk_nm) doSwFr_purc_wrk_nm_NX(info);
		else if (nx == columnSwFr_ap_typ) doSwFr_ap_typ_NX(info);
		else if (nx == columnSwFr_ap_typ_nm) doSwFr_ap_typ_nm_NX(info);
		else if (nx == columnSwFr_xrate) doSwFr_xrate_NX(info);
		else if (nx == columnSwFr_ac_ym) doSwFr_ac_ym_NX(info);
		else if (nx == columnSwFr_ac_dt) doSwFr_ac_dt_NX(info);
		else if (nx == columnSwFr_bsppl_cl_ym) doSwFr_bsppl_cl_ym_NX(info);
		else if (nx == columnSwFr_bsppl_cl_day) doSwFr_bsppl_cl_day_NX(info);
		else if (nx == columnSwFr_purc_act_no) doSwFr_purc_act_no_NX(info);
		else if (nx == columnSwFr_rcpt_iv_no) doSwFr_rcpt_iv_no_NX(info);
		else if (nx == columnSwFr_rcpt_iv_mng_no) doSwFr_rcpt_iv_mng_no_NX(info);
		else if (nx == columnSwFr_sppl_cd) doSwFr_sppl_cd_NX(info);
		else if (nx == columnSwFr_sppl_nm) doSwFr_sppl_nm_NX(info);
		else if (nx == columnSwFr_po_no) doSwFr_po_no_NX(info);
		else if (nx == columnSwFr_po_d_no) doSwFr_po_d_no_NX(info);
		else if (nx == columnSwFr_bp_dlv_slip_no) doSwFr_bp_dlv_slip_no_NX(info);
		else if (nx == columnSwFr_bp_dlv_slip_d_no) doSwFr_bp_dlv_slip_d_no_NX(info);
		else if (nx == columnSwFr_trd_cur_cd) doSwFr_trd_cur_cd_NX(info);
		else if (nx == columnSwFr_amt_dec_place) doSwFr_amt_dec_place_NX(info);
		else if (nx == Sw_sw_dt) doSw_sw_dt_NX(info);
		else if (nx == Sw_ac_dt) doSw_ac_dt_NX(info);
		else if (nx == Sw_pay_basis_dt) doSw_pay_basis_dt_NX(info);
		else if (nx == Sw_pay_crryovr_times) doSw_pay_crryovr_times_NX(info);
		else if (nx == Sw_pay_schd_dt) doSw_pay_schd_dt_NX(info);
		else if (nx == Sw_ap_sttl_cd) doSw_ap_sttl_cd_NX(info);
		else if (nx == Sw_ap_sttl_nm) doSw_ap_sttl_nm_NX(info);
		else if (nx == Sw_ap_sttl_typ) doSw_ap_sttl_typ_NX(info);
		else if (nx == Sw_trd_rmrks) doSw_trd_rmrks_NX(info);
		else if (nx == Sw_sub_char1) doSw_sub_char1_NX(info);
		else if (nx == Sw_sub_char2) doSw_sub_char2_NX(info);
		else if (nx == Sw_sub_char3) doSw_sub_char3_NX(info);
		else if (nx == SwTo_asppl_cd) doSwTo_asppl_cd_NX(info);
		else if (nx == SwTo_asppl_nm) doSwTo_asppl_nm_NX(info);
		else if (nx == SwTo_ap_dpt_cd) doSwTo_ap_dpt_cd_NX(info);
		else if (nx == SwTo_ap_dpt_nm) doSwTo_ap_dpt_nm_NX(info);
		else if (nx == SwTo_bsppl_cd) doSwTo_bsppl_cd_NX(info);
		else if (nx == SwTo_bsppl_nm) doSwTo_bsppl_nm_NX(info);
		else if (nx == SwTo_pay_spot_flg) doSwTo_pay_spot_flg_NX(info);
		else if (nx == SwTo_bsppl_dpt_cd) doSwTo_bsppl_dpt_cd_NX(info);
		else if (nx == SwTo_bsppl_dpt_nm) doSwTo_bsppl_dpt_nm_NX(info);
		else if (nx == SwTo_ap_wrk_ope_typ) doSwTo_ap_wrk_ope_typ_NX(info);
		else if (nx == SwTo_ap_wrk_ope_typ_nm) doSwTo_ap_wrk_ope_typ_nm_NX(info);
		else if (nx == SwTo_trd_cur_cd) doSwTo_trd_cur_cd_NX(info);
		else if (nx == SwTo_trd_cur_nm) doSwTo_trd_cur_nm_NX(info);
		else if (nx == SwTo_amt_dec_place) doSwTo_amt_dec_place_NX(info);
	}

	/**
	 * [SwFr]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_NX(MCEventInfo info){
	}

	/**
	 * [Typ]パネルの[typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTyp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_check_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[asppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_asppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[asppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_asppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bsppl_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bsppl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bsppl_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bsppl_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[slip_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_slip_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_sttl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_sttl_cd_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_sttl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_sttl_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_sttl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_sttl_typ_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_sttl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_sttl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_act_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[purc_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_purc_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[purc_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_purc_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_d_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sw_src_pay_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sw_src_pay_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[pay_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_pay_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[pay_chk_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_pay_chk_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[pay_chk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_pay_chk_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[pay_basis_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_pay_basis_dt_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[pay_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_pay_crryovr_times_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[pay_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_pay_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[wrk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_wrk_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[purc_wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_purc_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[purc_wrk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_purc_wrk_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_typ_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_xrate_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bsppl_cl_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bsppl_cl_ym_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bsppl_cl_day]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bsppl_cl_day_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[purc_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_purc_act_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[rcpt_iv_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_rcpt_iv_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_po_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bp_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bp_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bp_dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bp_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[sw_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_sw_dt_NX(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[pay_basis_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_pay_basis_dt_NX(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[pay_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_pay_crryovr_times_NX(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[pay_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_pay_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[ap_sttl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_ap_sttl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[ap_sttl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_ap_sttl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[ap_sttl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_ap_sttl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[asppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_asppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[asppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_asppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[ap_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_ap_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bsppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bsppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bsppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bsppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[pay_spot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_pay_spot_flg_NX(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bsppl_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bsppl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bsppl_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bsppl_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[ap_wrk_ope_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_ap_wrk_ope_typ_NX(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[ap_wrk_ope_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_ap_wrk_ope_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_bsppl_cd) doCnd_bsppl_cd_LC(info);
		else if (lc == Cnd_bsppl_nm) doCnd_bsppl_nm_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
		else if (lc == Cnd_amt_dec_place) doCnd_amt_dec_place_LC(info);
		else if (lc == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_LC(info);
		else if (lc == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_LC(info);
		else if (lc == Cnd_asppl_cd) doCnd_asppl_cd_LC(info);
		else if (lc == Cnd_asppl_nm) doCnd_asppl_nm_LC(info);
		else if (lc == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_LC(info);
		else if (lc == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_ap_typ) doCnd_ap_typ_LC(info);
		else if (lc == Cnd_ap_typ_nm) doCnd_ap_typ_nm_LC(info);
		else if (lc == columnSwFr_asppl_cd) doSwFr_asppl_cd_LC(info);
		else if (lc == columnSwFr_asppl_nm) doSwFr_asppl_nm_LC(info);
		else if (lc == columnSwFr_ap_dpt_cd) doSwFr_ap_dpt_cd_LC(info);
		else if (lc == columnSwFr_ap_dpt_nm) doSwFr_ap_dpt_nm_LC(info);
		else if (lc == columnSwFr_wg_cd) doSwFr_wg_cd_LC(info);
		else if (lc == columnSwFr_wg_nm) doSwFr_wg_nm_LC(info);
		else if (lc == columnSwFr_bsppl_dpt_cd) doSwFr_bsppl_dpt_cd_LC(info);
		else if (lc == columnSwFr_bsppl_dpt_nm) doSwFr_bsppl_dpt_nm_LC(info);
		else if (lc == columnSwFr_slip_sts_typ_nm) doSwFr_slip_sts_typ_nm_LC(info);
		else if (lc == columnSwFr_trd_cd) doSwFr_trd_cd_LC(info);
		else if (lc == columnSwFr_trd_nm) doSwFr_trd_nm_LC(info);
		else if (lc == columnSwFr_ap_sttl_cd) doSwFr_ap_sttl_cd_LC(info);
		else if (lc == columnSwFr_ap_sttl_nm) doSwFr_ap_sttl_nm_LC(info);
		else if (lc == columnSwFr_ap_sttl_typ) doSwFr_ap_sttl_typ_LC(info);
		else if (lc == columnSwFr_ap_sttl_typ_nm) doSwFr_ap_sttl_typ_nm_LC(info);
		else if (lc == columnSwFr_act_no) doSwFr_act_no_LC(info);
		else if (lc == columnSwFr_act_rev) doSwFr_act_rev_LC(info);
		else if (lc == columnSwFr_act_d_no) doSwFr_act_d_no_LC(info);
		else if (lc == columnSwFr_purc_dpt_cd) doSwFr_purc_dpt_cd_LC(info);
		else if (lc == columnSwFr_purc_dpt_nm) doSwFr_purc_dpt_nm_LC(info);
		else if (lc == columnSwFr_ap_d_no) doSwFr_ap_d_no_LC(info);
		else if (lc == columnSwFr_sw_src_pay_schd_no) doSwFr_sw_src_pay_schd_no_LC(info);
		else if (lc == columnSwFr_pay_schd_no) doSwFr_pay_schd_no_LC(info);
		else if (lc == columnSwFr_pay_chk_mng_no) doSwFr_pay_chk_mng_no_LC(info);
		else if (lc == columnSwFr_pay_chk_no) doSwFr_pay_chk_no_LC(info);
		else if (lc == columnSwFr_pay_basis_dt) doSwFr_pay_basis_dt_LC(info);
		else if (lc == columnSwFr_pay_crryovr_times) doSwFr_pay_crryovr_times_LC(info);
		else if (lc == columnSwFr_pay_schd_dt) doSwFr_pay_schd_dt_LC(info);
		else if (lc == columnSwFr_wrk_no) doSwFr_wrk_no_LC(info);
		else if (lc == columnSwFr_wrk_nm) doSwFr_wrk_nm_LC(info);
		else if (lc == columnSwFr_purc_wrk_no) doSwFr_purc_wrk_no_LC(info);
		else if (lc == columnSwFr_purc_wrk_nm) doSwFr_purc_wrk_nm_LC(info);
		else if (lc == columnSwFr_ap_typ) doSwFr_ap_typ_LC(info);
		else if (lc == columnSwFr_ap_typ_nm) doSwFr_ap_typ_nm_LC(info);
		else if (lc == columnSwFr_xrate) doSwFr_xrate_LC(info);
		else if (lc == columnSwFr_ac_ym) doSwFr_ac_ym_LC(info);
		else if (lc == columnSwFr_ac_dt) doSwFr_ac_dt_LC(info);
		else if (lc == columnSwFr_bsppl_cl_ym) doSwFr_bsppl_cl_ym_LC(info);
		else if (lc == columnSwFr_bsppl_cl_day) doSwFr_bsppl_cl_day_LC(info);
		else if (lc == columnSwFr_purc_act_no) doSwFr_purc_act_no_LC(info);
		else if (lc == columnSwFr_rcpt_iv_no) doSwFr_rcpt_iv_no_LC(info);
		else if (lc == columnSwFr_rcpt_iv_mng_no) doSwFr_rcpt_iv_mng_no_LC(info);
		else if (lc == columnSwFr_sppl_cd) doSwFr_sppl_cd_LC(info);
		else if (lc == columnSwFr_sppl_nm) doSwFr_sppl_nm_LC(info);
		else if (lc == columnSwFr_po_no) doSwFr_po_no_LC(info);
		else if (lc == columnSwFr_po_d_no) doSwFr_po_d_no_LC(info);
		else if (lc == columnSwFr_bp_dlv_slip_no) doSwFr_bp_dlv_slip_no_LC(info);
		else if (lc == columnSwFr_bp_dlv_slip_d_no) doSwFr_bp_dlv_slip_d_no_LC(info);
		else if (lc == columnSwFr_trd_cur_cd) doSwFr_trd_cur_cd_LC(info);
		else if (lc == columnSwFr_amt_dec_place) doSwFr_amt_dec_place_LC(info);
		else if (lc == Sw_sw_dt) doSw_sw_dt_LC(info);
		else if (lc == Sw_ac_dt) doSw_ac_dt_LC(info);
		else if (lc == Sw_pay_basis_dt) doSw_pay_basis_dt_LC(info);
		else if (lc == Sw_pay_crryovr_times) doSw_pay_crryovr_times_LC(info);
		else if (lc == Sw_pay_schd_dt) doSw_pay_schd_dt_LC(info);
		else if (lc == Sw_ap_sttl_cd) doSw_ap_sttl_cd_LC(info);
		else if (lc == Sw_ap_sttl_nm) doSw_ap_sttl_nm_LC(info);
		else if (lc == Sw_ap_sttl_typ) doSw_ap_sttl_typ_LC(info);
		else if (lc == Sw_trd_rmrks) doSw_trd_rmrks_LC(info);
		else if (lc == Sw_sub_char1) doSw_sub_char1_LC(info);
		else if (lc == Sw_sub_char2) doSw_sub_char2_LC(info);
		else if (lc == Sw_sub_char3) doSw_sub_char3_LC(info);
		else if (lc == SwTo_asppl_cd) doSwTo_asppl_cd_LC(info);
		else if (lc == SwTo_asppl_nm) doSwTo_asppl_nm_LC(info);
		else if (lc == SwTo_ap_dpt_cd) doSwTo_ap_dpt_cd_LC(info);
		else if (lc == SwTo_ap_dpt_nm) doSwTo_ap_dpt_nm_LC(info);
		else if (lc == SwTo_bsppl_cd) doSwTo_bsppl_cd_LC(info);
		else if (lc == SwTo_bsppl_nm) doSwTo_bsppl_nm_LC(info);
		else if (lc == SwTo_bsppl_dpt_cd) doSwTo_bsppl_dpt_cd_LC(info);
		else if (lc == SwTo_bsppl_dpt_nm) doSwTo_bsppl_dpt_nm_LC(info);
		else if (lc == SwTo_ap_wrk_ope_typ) doSwTo_ap_wrk_ope_typ_LC(info);
		else if (lc == SwTo_ap_wrk_ope_typ_nm) doSwTo_ap_wrk_ope_typ_nm_LC(info);
		else if (lc == SwTo_trd_cur_cd) doSwTo_trd_cur_cd_LC(info);
		else if (lc == SwTo_trd_cur_nm) doSwTo_trd_cur_nm_LC(info);
		else if (lc == SwTo_amt_dec_place) doSwTo_amt_dec_place_LC(info);
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[asppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_asppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[asppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_asppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bsppl_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bsppl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bsppl_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bsppl_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[slip_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_slip_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_sttl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_sttl_cd_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_sttl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_sttl_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_sttl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_sttl_typ_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_sttl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_sttl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_act_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[purc_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_purc_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[purc_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_purc_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_d_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sw_src_pay_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sw_src_pay_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[pay_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_pay_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[pay_chk_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_pay_chk_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[pay_chk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_pay_chk_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[pay_basis_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_pay_basis_dt_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[pay_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_pay_crryovr_times_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[pay_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_pay_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[wrk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_wrk_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[purc_wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_purc_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[purc_wrk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_purc_wrk_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_typ_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ap_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ap_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_xrate_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bsppl_cl_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bsppl_cl_ym_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bsppl_cl_day]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bsppl_cl_day_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[purc_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_purc_act_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[rcpt_iv_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_rcpt_iv_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_po_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bp_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bp_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bp_dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bp_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[sw_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_sw_dt_LC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[pay_basis_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_pay_basis_dt_LC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[pay_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_pay_crryovr_times_LC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[pay_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_pay_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[ap_sttl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_ap_sttl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[ap_sttl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_ap_sttl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[ap_sttl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_ap_sttl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[asppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_asppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[asppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_asppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[ap_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_ap_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bsppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bsppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bsppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bsppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bsppl_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bsppl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bsppl_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bsppl_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[ap_wrk_ope_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_ap_wrk_ope_typ_LC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[ap_wrk_ope_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_ap_wrk_ope_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_bsppl_cd]の作成メソッド
	 */
	public MCList getCnd_bsppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_trd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bsppl_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_bsppl_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_asppl_cd]の作成メソッド
	 */
	public MCList getCnd_asppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ap_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_ap_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getApWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ap_typ]の作成メソッド
	 */
	public MCList getCnd_ap_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getApTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Sw_ap_sttl_cd]の作成メソッド
	 */
	public MCList getSw_ap_sttl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getApSttl(row, info);
	}

	/**
	 * コンボ／リストのリスト[Sw_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getSw_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[SwTo_asppl_cd]の作成メソッド
	 */
	public MCList getSwTo_asppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[SwTo_ap_dpt_cd]の作成メソッド
	 */
	public MCList getSwTo_ap_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[SwTo_bsppl_dpt_cd]の作成メソッド
	 */
	public MCList getSwTo_bsppl_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[SwTo_ap_wrk_ope_typ]の作成メソッド
	 */
	public MCList getSwTo_ap_wrk_ope_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getApWrkOpeTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBHL0160.Srch01")) {
			return new MS_MSBHL0160_Srch01Bridge();
		}
		if (id.equals("MS.MSBHL0160.Srch02")) {
			return new MS_MSBHL0160_Srch02Bridge();
		}
		if (id.equals("MS.MSBHL0160.Upd01")) {
			return new MS_MSBHL0160_Upd01Bridge();
		}
		if (id.equals("MS.MSBHL0160.Upd02")) {
			return new MS_MSBHL0160_Upd02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBHL0160_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0160_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0160_Srch01;

		/** コンストラクタ */
		protected MS_MSBHL0160_Srch01Bridge() {
			p_MS_MSBHL0160_Srch01 = new MCParam(PDef.MS_MSBHL0160_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0160_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBH.MSBHP0160.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0160.SwFrR.class));

			p_MS_MSBHL0160_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0160_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0160_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0160_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0160_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBH.MSBHP0160.CndR up0() {
			return (mcframe.clientMSBH.MSBHP0160.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBH.MSBHP0160.SwFrR> down0() {
			return (MCList<mcframe.clientMSBH.MSBHP0160.SwFrR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBHL0160_Srch01.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0160.SwFrR.class));
		}
		protected MCParam param() {
			return p_MS_MSBHL0160_Srch01;
		}

		protected void show() {
			setSwFrL((MCList<mcframe.clientMSBH.MSBHP0160.SwFrR>)p_MS_MSBHL0160_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getSwFrL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getSwFrL());
			return result;
		}
	}
	/**
	 * [MS_MSBHL0160_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0160_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0160_Srch02;

		/** コンストラクタ */
		protected MS_MSBHL0160_Srch02Bridge() {
			p_MS_MSBHL0160_Srch02 = new MCParam(PDef.MS_MSBHL0160_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0160_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBH.MSBHP0160.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0160.SwFrR.class));

			p_MS_MSBHL0160_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0160_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0160_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0160_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0160_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBH.MSBHP0160.CndR up0() {
			return (mcframe.clientMSBH.MSBHP0160.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBH.MSBHP0160.SwFrR> down0() {
			return (MCList<mcframe.clientMSBH.MSBHP0160.SwFrR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBHL0160_Srch02.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0160.SwFrR.class));
		}
		protected MCParam param() {
			return p_MS_MSBHL0160_Srch02;
		}

		protected void show() {
			setSwFrL((MCList<mcframe.clientMSBH.MSBHP0160.SwFrR>)p_MS_MSBHL0160_Srch02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getSwFrL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getSwFrL());
			return result;
		}
	}
	/**
	 * [MS_MSBHL0160_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0160_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0160_Upd01;

		/** コンストラクタ */
		protected MS_MSBHL0160_Upd01Bridge() {
			p_MS_MSBHL0160_Upd01 = new MCParam(PDef.MS_MSBHL0160_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0160_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBH.MSBHP0160.SwFrR.class));
			param.addUpBlock(mcframe.clientMSBH.MSBHP0160.SwR.create());
			param.addUpBlock(mcframe.clientMSBH.MSBHP0160.SwToR.create());
			// Down

			p_MS_MSBHL0160_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0160_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0160_Upd01.addUpBlock(getSwFrL().shallowClone());
			p_MS_MSBHL0160_Upd01.addUpBlock(getSwR());
			p_MS_MSBHL0160_Upd01.addUpBlock(getSwToR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0160_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0160_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBH.MSBHP0160.SwFrR> up0() {
			return (MCList<mcframe.clientMSBH.MSBHP0160.SwFrR>)up(0);
		}
		protected mcframe.clientMSBH.MSBHP0160.SwR up1() {
			return (mcframe.clientMSBH.MSBHP0160.SwR)up(1);
		}
		protected mcframe.clientMSBH.MSBHP0160.SwToR up2() {
			return (mcframe.clientMSBH.MSBHP0160.SwToR)up(2);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBHL0160_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getSwFrL());
			result.add(getSwR());
			result.add(getSwToR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MS_MSBHL0160_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0160_Upd02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0160_Upd02;

		/** コンストラクタ */
		protected MS_MSBHL0160_Upd02Bridge() {
			p_MS_MSBHL0160_Upd02 = new MCParam(PDef.MS_MSBHL0160_Upd02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0160_Upd02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBH.MSBHP0160.SwFrR.class));
			param.addUpBlock(mcframe.clientMSBH.MSBHP0160.SwR.create());
			param.addUpBlock(mcframe.clientMSBH.MSBHP0160.SwToR.create());
			// Down

			p_MS_MSBHL0160_Upd02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0160_Upd02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0160_Upd02.addUpBlock(getSwFrL().shallowClone());
			p_MS_MSBHL0160_Upd02.addUpBlock(getSwR());
			p_MS_MSBHL0160_Upd02.addUpBlock(getSwToR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0160_Upd02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0160_Upd02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBH.MSBHP0160.SwFrR> up0() {
			return (MCList<mcframe.clientMSBH.MSBHP0160.SwFrR>)up(0);
		}
		protected mcframe.clientMSBH.MSBHP0160.SwR up1() {
			return (mcframe.clientMSBH.MSBHP0160.SwR)up(1);
		}
		protected mcframe.clientMSBH.MSBHP0160.SwToR up2() {
			return (mcframe.clientMSBH.MSBHP0160.SwToR)up(2);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBHL0160_Upd02;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getSwFrL());
			result.add(getSwR());
			result.add(getSwToR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}