package mcframe.clientMSBG.MSBGP0240;

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
import mcframe.clientMSBG.MSBGP0240.MSBGP_SwArBalReg_MC.MS_MSBGL0240_Srch01Caller;
import mcframe.clientMSBG.MSBGP0240.MSBGP_SwArBalReg_MC.MS_MSBGL0240_Srch02Caller;
import mcframe.clientMSBG.MSBGP0240.MSBGP_SwArBalReg_MC.MS_MSBGL0240_Upd01Caller;
import mcframe.clientMSBG.MSBGP0240.MSBGP_SwArBalReg_MC.MS_MSBGL0240_Upd02Caller;

/**
 * 画面"MSBGP_SwArBalReg"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGP_SwArBalReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBGP0240";

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
	 * bill_bal,Outstanding billing transfer,0;not_bill,Unbilled balance transfer,1 bill_bal,請求残高振替,0;not_bill,未請求残高振替,1.<p>
	 *
	 */
	public MCButtonGroup Typ_typ_Group = null;
	public MCRadioButton Typ_typ_bill_bal = null;
	public MCRadioButton Typ_typ_not_bill = null;
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_bcst_cd_Label = null;
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bcst_cd = null;
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public MCTextField Cnd_bcst_nm = null;
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
	public MCLabel Cnd_bill_dpt_cd_Label = null;
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bill_dpt_cd = null;
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public MCTextField Cnd_bill_dpt_nm = null;
	public MCLabel Cnd_acst_cd_Label = null;
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_acst_cd = null;
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public MCTextField Cnd_acst_nm = null;
	public MCLabel Cnd_ar_dpt_cd_Label = null;
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_ar_dpt_cd = null;
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public MCTextField Cnd_ar_dpt_nm = null;
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
	public MCLabel Cnd_ar_typ_Label = null;
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ar_typ = null;
	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public MCTextField Cnd_ar_typ_nm = null;
	/**
	 * Include unbilled flg. 未請求含むＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Cnd_not_bill_inc_flg = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Cnd_amt_dec_place = null;
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Cnd_upri_dec_place = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [SwFr]ブロック関連のField定義
	public MCPanel SwFrPanel = null;
	public MCTitledBorder SwFrTitledBorder = null;
	public MCScrollPane SwFrScrollPane = null;
	public MCTable2<mcframe.clientMSBG.MSBGP0240.SwFrR> SwFrTable = null;
	// [SwFr]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_check = null;
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_acst_cd = null;
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_acst_nm = null;
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_ar_dpt_cd = null;
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_ar_dpt_nm = null;
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_bill_dpt_cd = null;
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_bill_dpt_nm = null;
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
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D SwFr_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnSwFr_inc_tax_amt;// [SwFr]の[inc_tax_amt_p.amt]を[columnSwFr_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D SwFr_tgt_sw_amt_p_PPanel;
	public MCColumnConfig columnSwFr_tgt_sw_amt;// [SwFr]の[tgt_sw_amt_p.amt]を[columnSwFr_tgt_sw_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D SwFr_not_appl_wtax_amt_p_PPanel;
	public MCColumnConfig columnSwFr_not_appl_wtax_amt;// [SwFr]の[not_appl_wtax_amt_p.amt]を[columnSwFr_not_appl_wtax_amt]としてエイリアス定義。
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
	 * Sales recorded project No. 売上案件ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_sls_wrk_no = null;
	/**
	 * Sales recorded project name 売上案件名.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_sls_wrk_nm = null;
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_ar_typ = null;
	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_ar_typ_nm = null;
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
	 * Delivery date 納品日.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_dlv_dt = null;
	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_bill_ym = null;
	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_bill_cl_day = null;
	/**
	 * Billing closing date 請求締処理日.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_bill_dt = null;
	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_bill_no = null;
	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_iv_no = null;
	/**
	 * Customer 得意先.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_cst_nm = null;
	/**
	 * Delivery destination 納品先.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_dlv_nm = null;
	/**
	 * Distribution channel 1 仕向先１.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_dest_cd1 = null;
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_dest_nm1 = null;
	/**
	 * Distribution channel 2 仕向先２.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_dest_cd2 = null;
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_dest_nm2 = null;
	/**
	 * Distribution channel 3 仕向先３.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_dest_cd3 = null;
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_dest_nm3 = null;
	/**
	 * Sales PIC 売上担当者.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_sls_usr_cd = null;
	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_sls_usr_nm = null;
	/**
	 * Sales dept. 売上部門.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_sls_dpt_cd = null;
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_sls_dpt_nm = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_slo_no = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_slo_d_no = null;
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_cst_po_no = null;
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_cst_po_d_no = null;
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_dlv_slip_no = null;
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_dlv_slip_d_no = null;
	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_ship_dlv_slip_no = null;
	/**
	 * Delivery note details No. at shipping 出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_ship_dlv_slip_d_no = null;
	/**
	 * Multiple delivery note details at shipping 出荷時納品書明細複数.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_ship_dlv_slip_multi_flg = null;
	/**
	 * Billed 請求済.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_bill_flg = null;
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
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnSwFr_upri_dec_place = null;
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
	public MCLabel Sw_bill_basis_dt_Label = null;
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCDateField Sw_bill_basis_dt = null;
	public MCLabel Sw_trd_cd_Label = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Sw_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCTextField Sw_trd_nm = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCTextField Sw_trd_ptn_typ = null;
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
	public MCLabel SwTo_acst_cd_Label = null;
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public MCTextField SwTo_acst_cd = null;
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public MCTextField SwTo_acst_nm = null;
	public MCLabel SwTo_ar_dpt_cd_Label = null;
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public MCTextField SwTo_ar_dpt_cd = null;
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public MCTextField SwTo_ar_dpt_nm = null;
	public MCLabel SwTo_bcst_cd_Label = null;
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public MCTextField SwTo_bcst_cd = null;
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public MCTextField SwTo_bcst_nm = null;
	public MCLabel SwTo_bill_dpt_cd_Label = null;
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox SwTo_bill_dpt_cd = null;
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public MCTextField SwTo_bill_dpt_nm = null;
	public MCLabel SwTo_wrk_ope_typ_Label = null;
	/**
	 * Sales project process type 案件処理区分.<p>
	 *
	 */
	public MCTextComboBox SwTo_wrk_ope_typ = null;
	/**
	 * Sales project process type name 案件処理区分名.<p>
	 *
	 */
	public MCTextField SwTo_wrk_ope_typ_nm = null;
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
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H SwTo_tgt_sw_amt_p_PPanel;
	public MCNumberField SwTo_tgt_sw_amt;	// [SwTo]の[tgt_sw_amt_p.amt]を[SwTo_tgt_sw_amt]としてエイリアス定義。
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField SwTo_amt_dec_place = null;
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumberField SwTo_upri_dec_place = null;
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
	
	/** [MS_MSBGL0240_Srch01]のCallerの作成 */
	protected MSBGP_SwArBalReg_MC.MS_MSBGL0240_Srch01Caller createMS_MSBGL0240_Srch01() {
		MSBGP_SwArBalReg_MC.MS_MSBGL0240_Srch01Caller<MSBGP_SwArBalReg, MS_MSBGL0240_Srch01Bridge>
		caller = ((MSBGP_SwArBalReg_MC)this).new MS_MSBGL0240_Srch01Caller<MSBGP_SwArBalReg, MS_MSBGL0240_Srch01Bridge>(
					(MSBGP_SwArBalReg)this, new MS_MSBGL0240_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBGL0240_Srch01]の呼び出し */
	protected void callMS_MSBGL0240_Srch01() {
		MCCaller caller = createMS_MSBGL0240_Srch01();
		caller.exec();
	}
	/** [MS_MSBGL0240_Srch02]のCallerの作成 */
	protected MSBGP_SwArBalReg_MC.MS_MSBGL0240_Srch02Caller createMS_MSBGL0240_Srch02() {
		MSBGP_SwArBalReg_MC.MS_MSBGL0240_Srch02Caller<MSBGP_SwArBalReg, MS_MSBGL0240_Srch02Bridge>
		caller = ((MSBGP_SwArBalReg_MC)this).new MS_MSBGL0240_Srch02Caller<MSBGP_SwArBalReg, MS_MSBGL0240_Srch02Bridge>(
					(MSBGP_SwArBalReg)this, new MS_MSBGL0240_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBGL0240_Srch02]の呼び出し */
	protected void callMS_MSBGL0240_Srch02() {
		MCCaller caller = createMS_MSBGL0240_Srch02();
		caller.exec();
	}
	/** [MS_MSBGL0240_Upd01]のCallerの作成 */
	protected MSBGP_SwArBalReg_MC.MS_MSBGL0240_Upd01Caller createMS_MSBGL0240_Upd01() {
		MSBGP_SwArBalReg_MC.MS_MSBGL0240_Upd01Caller<MSBGP_SwArBalReg, MS_MSBGL0240_Upd01Bridge>
		caller = ((MSBGP_SwArBalReg_MC)this).new MS_MSBGL0240_Upd01Caller<MSBGP_SwArBalReg, MS_MSBGL0240_Upd01Bridge>(
					(MSBGP_SwArBalReg)this, new MS_MSBGL0240_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBGL0240_Upd01]の呼び出し */
	protected void callMS_MSBGL0240_Upd01() {
		MCCaller caller = createMS_MSBGL0240_Upd01();
		caller.exec();
	}
	/** [MS_MSBGL0240_Upd02]のCallerの作成 */
	protected MSBGP_SwArBalReg_MC.MS_MSBGL0240_Upd02Caller createMS_MSBGL0240_Upd02() {
		MSBGP_SwArBalReg_MC.MS_MSBGL0240_Upd02Caller<MSBGP_SwArBalReg, MS_MSBGL0240_Upd02Bridge>
		caller = ((MSBGP_SwArBalReg_MC)this).new MS_MSBGL0240_Upd02Caller<MSBGP_SwArBalReg, MS_MSBGL0240_Upd02Bridge>(
					(MSBGP_SwArBalReg)this, new MS_MSBGL0240_Upd02Bridge());
		return caller;
	}
	/** [MS_MSBGL0240_Upd02]の呼び出し */
	protected void callMS_MSBGL0240_Upd02() {
		MCCaller caller = createMS_MSBGL0240_Upd02();
		caller.exec();
	}
	/** [Typ]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0240.TypR aTypR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0240.CndR aCndR;
	/** [SwFr]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0240.SwFrR> aSwFrL;
	/** [Sw]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0240.SwR aSwR;
	/** [SwTo]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0240.SwToR aSwToR;

	/**
	 * 項目コピーによってaTypRを設定します。
	 *
	 * aTypRのインスタンスは変更されません。
	 *
	 * @param row TypR
	 */
	public void setTypR(mcframe.clientMSBG.MSBGP0240.TypR row) {
		if (row != null) {
			MCRow.copyall(getTypR(), row);
		}
	}

	/**
	 * [Typ]ブロックのコンテナaTypRを返します。
	 *
	 * @return TypR
	 */
	public mcframe.clientMSBG.MSBGP0240.TypR getTypR() {
		return aTypR;
	}

	/**
	 * aTypRを作成します。
	 *
	 * @return TypR
	 */
	public mcframe.clientMSBG.MSBGP0240.TypR createTypR() {
		return mcframe.clientMSBG.MSBGP0240.TypR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBG.MSBGP0240.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0240.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0240.CndR createCndR() {
		return mcframe.clientMSBG.MSBGP0240.CndR.create();
	}

	/**
	 * コピーによってaSwFrLを設定します。
	 *
	 * aSwFrLのインスタンスは変更されません。
	 *
	 * @param dataset SwFrL
	 */
	public void setSwFrL(MCList<mcframe.clientMSBG.MSBGP0240.SwFrR> aList) {
		if (getSwFrL() != aList) {
			getSwFrL().setAll(aList);
		}
	}

	/**
	 * [SwFr]ブロックのコンテナaSwFrLを返します。
	 *
	 * @return SwFrL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0240.SwFrR> getSwFrL() {
		return aSwFrL;
	}

	/**
	 * aSwFrRを作成します。
	 *
	 * @return SwFrR
	 */
	public mcframe.clientMSBG.MSBGP0240.SwFrR createSwFrR() {
		return mcframe.clientMSBG.MSBGP0240.SwFrR.create();
	}

	/**
	 * aSwFrLを作成します。
	 *
	 * @return SwFrL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0240.SwFrR> createSwFrL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0240.SwFrR.class);
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
	public void setSwR(mcframe.clientMSBG.MSBGP0240.SwR row) {
		if (row != null) {
			MCRow.copyall(getSwR(), row);
		}
	}

	/**
	 * [Sw]ブロックのコンテナaSwRを返します。
	 *
	 * @return SwR
	 */
	public mcframe.clientMSBG.MSBGP0240.SwR getSwR() {
		return aSwR;
	}

	/**
	 * aSwRを作成します。
	 *
	 * @return SwR
	 */
	public mcframe.clientMSBG.MSBGP0240.SwR createSwR() {
		return mcframe.clientMSBG.MSBGP0240.SwR.create();
	}

	/**
	 * 項目コピーによってaSwToRを設定します。
	 *
	 * aSwToRのインスタンスは変更されません。
	 *
	 * @param row SwToR
	 */
	public void setSwToR(mcframe.clientMSBG.MSBGP0240.SwToR row) {
		if (row != null) {
			MCRow.copyall(getSwToR(), row);
		}
	}

	/**
	 * [SwTo]ブロックのコンテナaSwToRを返します。
	 *
	 * @return SwToR
	 */
	public mcframe.clientMSBG.MSBGP0240.SwToR getSwToR() {
		return aSwToR;
	}

	/**
	 * aSwToRを作成します。
	 *
	 * @return SwToR
	 */
	public mcframe.clientMSBG.MSBGP0240.SwToR createSwToR() {
		return mcframe.clientMSBG.MSBGP0240.SwToR.create();
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
	public MSBGP_SwArBalReg_MC_A() {
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
	public MSBGP_SwArBalReg_MC_A(String name) {
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
		MSBGP_SwArBalReg_MC.jbCreateTyp((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.jbCreateTop((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.jbCreateCnd((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.jbCreateCtrl((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.jbCreateSwFr((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.jbCreateSw((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.jbCreateSwTo((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.jbCreateBtn((MSBGP_SwArBalReg)this);
	}

	/**
	 * [Typ]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTyp(MSBGP_SwArBalReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBGP_SwArBalReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBGP_SwArBalReg p) {
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
	protected static void jbCreateCtrl(MSBGP_SwArBalReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [SwFr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSwFr(MSBGP_SwArBalReg p) {
		p.SwFr_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0240.SwFrR.$inc_tax_amt_p);
		p.SwFr_inc_tax_amt_p_PPanel.setName("SwFr.inc_tax_amt_p");
		p.columnSwFr_inc_tax_amt = p.SwFr_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnSwFr_inc_tax_amt.addAliasName("SwFr.inc_tax_amt", p);
		p.SwFr_tgt_sw_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0240.SwFrR.$tgt_sw_amt_p);
		p.SwFr_tgt_sw_amt_p_PPanel.setName("SwFr.tgt_sw_amt_p");
		p.columnSwFr_tgt_sw_amt = p.SwFr_tgt_sw_amt_p_PPanel.columnAmt_amt;
		p.columnSwFr_tgt_sw_amt.addAliasName("SwFr.tgt_sw_amt", p);
		p.SwFr_not_appl_wtax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0240.SwFrR.$not_appl_wtax_amt_p);
		p.SwFr_not_appl_wtax_amt_p_PPanel.setName("SwFr.not_appl_wtax_amt_p");
		p.columnSwFr_not_appl_wtax_amt = p.SwFr_not_appl_wtax_amt_p_PPanel.columnAmt_amt;
		p.columnSwFr_not_appl_wtax_amt.addAliasName("SwFr.not_appl_wtax_amt", p);
	}

	/**
	 * [Sw]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSw(MSBGP_SwArBalReg p) {
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
	protected static void jbCreateSwTo(MSBGP_SwArBalReg p) {
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
	protected static void jbCreateBtn(MSBGP_SwArBalReg p) {
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

	
	/** [Cnd_bcst_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bcst_cd_p = null;

	/**
	 * [Cnd_bcst_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bcst_cd_ListPutter() {
		if (Cnd_bcst_cd_p == null) {
			Cnd_bcst_cd_p = createCnd_bcst_cd_ListPutter(Cnd_bcst_cd, "bcst_cd", "bcst_nm");

		}
		return Cnd_bcst_cd_p;
	}
	
	
	/** [Cnd_trd_cur_cd_ListPutter]の定義 */
	private MCListPutter Cnd_trd_cur_cd_p = null;

	/**
	 * [Cnd_trd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_trd_cur_cd_ListPutter() {
		if (Cnd_trd_cur_cd_p == null) {
			Cnd_trd_cur_cd_p = createCnd_trd_cur_cd_ListPutter(Cnd_trd_cur_cd, "trd_cur_cd", "trd_cur_nm","amt_dec_place","upri_dec_place");

		}
		return Cnd_trd_cur_cd_p;
	}
	
	
	/** [Cnd_bill_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bill_dpt_cd_p = null;

	/**
	 * [Cnd_bill_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bill_dpt_cd_ListPutter() {
		if (Cnd_bill_dpt_cd_p == null) {
			Cnd_bill_dpt_cd_p = createCnd_bill_dpt_cd_ListPutter(Cnd_bill_dpt_cd, "bill_dpt_cd", "bill_dpt_nm");

		}
		return Cnd_bill_dpt_cd_p;
	}
	
	
	/** [Cnd_acst_cd_ListPutter]の定義 */
	private MCListPutter Cnd_acst_cd_p = null;

	/**
	 * [Cnd_acst_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_acst_cd_ListPutter() {
		if (Cnd_acst_cd_p == null) {
			Cnd_acst_cd_p = createCnd_acst_cd_ListPutter(Cnd_acst_cd, "acst_cd", "acst_nm");

		}
		return Cnd_acst_cd_p;
	}
	
	
	/** [Cnd_ar_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ar_dpt_cd_p = null;

	/**
	 * [Cnd_ar_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ar_dpt_cd_ListPutter() {
		if (Cnd_ar_dpt_cd_p == null) {
			Cnd_ar_dpt_cd_p = createCnd_ar_dpt_cd_ListPutter(Cnd_ar_dpt_cd, "ar_dpt_cd", "ar_dpt_nm");

		}
		return Cnd_ar_dpt_cd_p;
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
	
	
	/** [Cnd_ar_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ar_typ_p = null;

	/**
	 * [Cnd_ar_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ar_typ_ListPutter() {
		if (Cnd_ar_typ_p == null) {
			Cnd_ar_typ_p = createCnd_ar_typ_ListPutter(Cnd_ar_typ, "ar_typ", "ar_typ_nm");

		}
		return Cnd_ar_typ_p;
	}
	
	
	/** [Sw_trd_cd_ListPutter]の定義 */
	private MCListPutter Sw_trd_cd_p = null;

	/**
	 * [Sw_trd_cd_ListPutter]の取得
	 */
	protected MCListPutter getSw_trd_cd_ListPutter() {
		if (Sw_trd_cd_p == null) {
			Sw_trd_cd_p = createSw_trd_cd_ListPutter(Sw_trd_cd, "trd_cd", "trd_nm","trd_ptn_typ");

		}
		return Sw_trd_cd_p;
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
	
	
	/** [SwTo_acst_cd_ListPutter]の定義 */
	private MCListPutter SwTo_acst_cd_p = null;

	/**
	 * [SwTo_acst_cd_ListPutter]の取得
	 */
	protected MCListPutter getSwTo_acst_cd_ListPutter() {
		if (SwTo_acst_cd_p == null) {
			SwTo_acst_cd_p = createSwTo_acst_cd_ListPutter(SwTo_acst_cd, "acst_cd", "acst_nm","bcst_cd","bcst_nm");

		}
		return SwTo_acst_cd_p;
	}
	
	
	/** [SwTo_ar_dpt_cd_ListPutter]の定義 */
	private MCListPutter SwTo_ar_dpt_cd_p = null;

	/**
	 * [SwTo_ar_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getSwTo_ar_dpt_cd_ListPutter() {
		if (SwTo_ar_dpt_cd_p == null) {
			SwTo_ar_dpt_cd_p = createSwTo_ar_dpt_cd_ListPutter(SwTo_ar_dpt_cd, "ar_dpt_cd", "ar_dpt_nm");

		}
		return SwTo_ar_dpt_cd_p;
	}
	
	
	/** [SwTo_bill_dpt_cd_ListPutter]の定義 */
	private MCListPutter SwTo_bill_dpt_cd_p = null;

	/**
	 * [SwTo_bill_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getSwTo_bill_dpt_cd_ListPutter() {
		if (SwTo_bill_dpt_cd_p == null) {
			SwTo_bill_dpt_cd_p = createSwTo_bill_dpt_cd_ListPutter(SwTo_bill_dpt_cd, "bill_dpt_cd", "bill_dpt_nm");

		}
		return SwTo_bill_dpt_cd_p;
	}
	
	
	/** [SwTo_wrk_ope_typ_ListPutter]の定義 */
	private MCListPutter SwTo_wrk_ope_typ_p = null;

	/**
	 * [SwTo_wrk_ope_typ_ListPutter]の取得
	 */
	protected MCListPutter getSwTo_wrk_ope_typ_ListPutter() {
		if (SwTo_wrk_ope_typ_p == null) {
			SwTo_wrk_ope_typ_p = createSwTo_wrk_ope_typ_ListPutter(SwTo_wrk_ope_typ, "wrk_ope_typ", "wrk_ope_typ_nm");

		}
		return SwTo_wrk_ope_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_SwArBalReg create(){
		MSBGP_SwArBalReg p = new MSBGP_SwArBalReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_SwArBalReg create(String name){
		MSBGP_SwArBalReg p = new MSBGP_SwArBalReg(name);
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
		MSBGP_SwArBalReg_MC.jbfInitTyp((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.jbfInitTop((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.jbfInitCnd((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.jbfInitCtrl((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.jbfInitSwFr((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.jbfInitSw((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.jbfInitSwTo((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.jbfInitBtn((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.jbInitTyp((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.jbInitTop((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.jbInitCnd((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.jbInitCtrl((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.jbInitSwFr((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.jbInitSw((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.jbInitSwTo((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.jbInitBtn((MSBGP_SwArBalReg)this);
	}

	/**
	 * [Typ]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTyp(MSBGP_SwArBalReg p) {
		// ブロック関連の初期化
		p.TypPanel = p.beansFactory.createPanel("Typ");
		p.TypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Typ_typ_Group = p.beansFactory.createButtonGroup("Typ.typ");
		p.Typ_typ_bill_bal = p.beansFactory.createRadioButton("Typ.typ_bill_bal");
		p.Typ_typ_not_bill = p.beansFactory.createRadioButton("Typ.typ_not_bill");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBGP_SwArBalReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBGP_SwArBalReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_bcst_cd_Label = p.beansFactory.createLabel("Cnd.bcst_cd_Label");
		p.Cnd_bcst_cd = p.beansFactory.createTextField("Cnd.bcst_cd");
		p.Cnd_bcst_cd.setLabel(p.Cnd_bcst_cd_Label);
		p.Cnd_bcst_nm = p.beansFactory.createTextField("Cnd.bcst_nm");
		p.Cnd_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.trd_cur_cd_Label");
		p.Cnd_trd_cur_cd = p.beansFactory.createTextComboBox("Cnd.trd_cur_cd");
		p.Cnd_trd_cur_cd.setLabel(p.Cnd_trd_cur_cd_Label);
		p.Cnd_trd_cur_nm = p.beansFactory.createTextField("Cnd.trd_cur_nm");
		p.Cnd_bill_dpt_cd_Label = p.beansFactory.createLabel("Cnd.bill_dpt_cd_Label");
		p.Cnd_bill_dpt_cd = p.beansFactory.createTextField("Cnd.bill_dpt_cd");
		p.Cnd_bill_dpt_cd.setLabel(p.Cnd_bill_dpt_cd_Label);
		p.Cnd_bill_dpt_nm = p.beansFactory.createTextField("Cnd.bill_dpt_nm");
		p.Cnd_acst_cd_Label = p.beansFactory.createLabel("Cnd.acst_cd_Label");
		p.Cnd_acst_cd = p.beansFactory.createTextField("Cnd.acst_cd");
		p.Cnd_acst_cd.setLabel(p.Cnd_acst_cd_Label);
		p.Cnd_acst_nm = p.beansFactory.createTextField("Cnd.acst_nm");
		p.Cnd_ar_dpt_cd_Label = p.beansFactory.createLabel("Cnd.ar_dpt_cd_Label");
		p.Cnd_ar_dpt_cd = p.beansFactory.createTextField("Cnd.ar_dpt_cd");
		p.Cnd_ar_dpt_cd.setLabel(p.Cnd_ar_dpt_cd_Label);
		p.Cnd_ar_dpt_nm = p.beansFactory.createTextField("Cnd.ar_dpt_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_ar_typ_Label = p.beansFactory.createLabel("Cnd.ar_typ_Label");
		p.Cnd_ar_typ = p.beansFactory.createTextComboBox("Cnd.ar_typ");
		p.Cnd_ar_typ.setLabel(p.Cnd_ar_typ_Label);
		p.Cnd_ar_typ_nm = p.beansFactory.createTextField("Cnd.ar_typ_nm");
		p.Cnd_not_bill_inc_flg = p.beansFactory.createCheckBox("Cnd.not_bill_inc_flg");
		p.Cnd_amt_dec_place = p.beansFactory.createNumberField("Cnd.amt_dec_place");
		p.Cnd_upri_dec_place = p.beansFactory.createNumberField("Cnd.upri_dec_place");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBGP_SwArBalReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [SwFr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSwFr(MSBGP_SwArBalReg p) {
		// ブロック関連の初期化
		p.SwFrPanel = p.beansFactory.createPanel("SwFr");
		p.SwFrTitledBorder = p.beansFactory.createTitledBorder();
		p.SwFrScrollPane = p.beansFactory.createScrollPane("SwFr.scroll");
		p.createSwFrTable();
		// ブロックの項目の初期化
		p.columnSwFr_check = p.beansFactory.createTableColumn("SwFr.check", MCColumnType.CHECK);
		p.columnSwFr_acst_cd = p.beansFactory.createTableColumn("SwFr.acst_cd", MCColumnType.TEXT);
		p.columnSwFr_acst_nm = p.beansFactory.createTableColumn("SwFr.acst_nm", MCColumnType.TEXT);
		p.columnSwFr_ar_dpt_cd = p.beansFactory.createTableColumn("SwFr.ar_dpt_cd", MCColumnType.TEXT);
		p.columnSwFr_ar_dpt_nm = p.beansFactory.createTableColumn("SwFr.ar_dpt_nm", MCColumnType.TEXT);
		p.columnSwFr_bill_dpt_cd = p.beansFactory.createTableColumn("SwFr.bill_dpt_cd", MCColumnType.TEXT);
		p.columnSwFr_bill_dpt_nm = p.beansFactory.createTableColumn("SwFr.bill_dpt_nm", MCColumnType.TEXT);
		p.columnSwFr_slip_sts_typ_nm = p.beansFactory.createTableColumn("SwFr.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnSwFr_trd_cd = p.beansFactory.createTableColumn("SwFr.trd_cd", MCColumnType.TEXT);
		p.columnSwFr_trd_nm = p.beansFactory.createTableColumn("SwFr.trd_nm", MCColumnType.TEXT);
		p.columnSwFr_act_no = p.beansFactory.createTableColumn("SwFr.act_no", MCColumnType.TEXT);
		p.columnSwFr_act_rev = p.beansFactory.createTableColumn("SwFr.act_rev", MCColumnType.NUMBER);
		p.columnSwFr_act_d_no = p.beansFactory.createTableColumn("SwFr.act_d_no", MCColumnType.TEXT);
		p.columnSwFr_wrk_no = p.beansFactory.createTableColumn("SwFr.wrk_no", MCColumnType.TEXT);
		p.columnSwFr_wrk_nm = p.beansFactory.createTableColumn("SwFr.wrk_nm", MCColumnType.TEXT);
		p.columnSwFr_sls_wrk_no = p.beansFactory.createTableColumn("SwFr.sls_wrk_no", MCColumnType.TEXT);
		p.columnSwFr_sls_wrk_nm = p.beansFactory.createTableColumn("SwFr.sls_wrk_nm", MCColumnType.TEXT);
		p.columnSwFr_ar_typ = p.beansFactory.createTableColumn("SwFr.ar_typ", MCColumnType.TEXT);
		p.columnSwFr_ar_typ_nm = p.beansFactory.createTableColumn("SwFr.ar_typ_nm", MCColumnType.TEXT);
		p.columnSwFr_xrate = p.beansFactory.createTableColumn("SwFr.xrate", MCColumnType.NUMBER);
		p.columnSwFr_ac_ym = p.beansFactory.createTableColumn("SwFr.ac_ym", MCColumnType.DATE);
		p.columnSwFr_ac_dt = p.beansFactory.createTableColumn("SwFr.ac_dt", MCColumnType.DATE);
		p.columnSwFr_dlv_dt = p.beansFactory.createTableColumn("SwFr.dlv_dt", MCColumnType.DATE);
		p.columnSwFr_bill_ym = p.beansFactory.createTableColumn("SwFr.bill_ym", MCColumnType.DATE);
		p.columnSwFr_bill_cl_day = p.beansFactory.createTableColumn("SwFr.bill_cl_day", MCColumnType.NUMBER);
		p.columnSwFr_bill_dt = p.beansFactory.createTableColumn("SwFr.bill_dt", MCColumnType.DATE);
		p.columnSwFr_bill_no = p.beansFactory.createTableColumn("SwFr.bill_no", MCColumnType.TEXT);
		p.columnSwFr_iv_no = p.beansFactory.createTableColumn("SwFr.iv_no", MCColumnType.TEXT);
		p.columnSwFr_cst_cd = p.beansFactory.createTableColumn("SwFr.cst_cd", MCColumnType.TEXT);
		p.columnSwFr_cst_nm = p.beansFactory.createTableColumn("SwFr.cst_nm", MCColumnType.TEXT);
		p.columnSwFr_dlv_cd = p.beansFactory.createTableColumn("SwFr.dlv_cd", MCColumnType.TEXT);
		p.columnSwFr_dlv_nm = p.beansFactory.createTableColumn("SwFr.dlv_nm", MCColumnType.TEXT);
		p.columnSwFr_dest_cd1 = p.beansFactory.createTableColumn("SwFr.dest_cd1", MCColumnType.TEXT);
		p.columnSwFr_dest_nm1 = p.beansFactory.createTableColumn("SwFr.dest_nm1", MCColumnType.TEXT);
		p.columnSwFr_dest_cd2 = p.beansFactory.createTableColumn("SwFr.dest_cd2", MCColumnType.TEXT);
		p.columnSwFr_dest_nm2 = p.beansFactory.createTableColumn("SwFr.dest_nm2", MCColumnType.TEXT);
		p.columnSwFr_dest_cd3 = p.beansFactory.createTableColumn("SwFr.dest_cd3", MCColumnType.TEXT);
		p.columnSwFr_dest_nm3 = p.beansFactory.createTableColumn("SwFr.dest_nm3", MCColumnType.TEXT);
		p.columnSwFr_sls_usr_cd = p.beansFactory.createTableColumn("SwFr.sls_usr_cd", MCColumnType.TEXT);
		p.columnSwFr_sls_usr_nm = p.beansFactory.createTableColumn("SwFr.sls_usr_nm", MCColumnType.TEXT);
		p.columnSwFr_sls_dpt_cd = p.beansFactory.createTableColumn("SwFr.sls_dpt_cd", MCColumnType.TEXT);
		p.columnSwFr_sls_dpt_nm = p.beansFactory.createTableColumn("SwFr.sls_dpt_nm", MCColumnType.TEXT);
		p.columnSwFr_slo_no = p.beansFactory.createTableColumn("SwFr.slo_no", MCColumnType.TEXT);
		p.columnSwFr_slo_d_no = p.beansFactory.createTableColumn("SwFr.slo_d_no", MCColumnType.TEXT);
		p.columnSwFr_cst_po_no = p.beansFactory.createTableColumn("SwFr.cst_po_no", MCColumnType.TEXT);
		p.columnSwFr_cst_po_d_no = p.beansFactory.createTableColumn("SwFr.cst_po_d_no", MCColumnType.TEXT);
		p.columnSwFr_dlv_slip_no = p.beansFactory.createTableColumn("SwFr.dlv_slip_no", MCColumnType.TEXT);
		p.columnSwFr_dlv_slip_d_no = p.beansFactory.createTableColumn("SwFr.dlv_slip_d_no", MCColumnType.TEXT);
		p.columnSwFr_ship_dlv_slip_no = p.beansFactory.createTableColumn("SwFr.ship_dlv_slip_no", MCColumnType.TEXT);
		p.columnSwFr_ship_dlv_slip_d_no = p.beansFactory.createTableColumn("SwFr.ship_dlv_slip_d_no", MCColumnType.TEXT);
		p.columnSwFr_ship_dlv_slip_multi_flg = p.beansFactory.createTableColumn("SwFr.ship_dlv_slip_multi_flg", MCColumnType.CHECK);
		p.columnSwFr_bill_flg = p.beansFactory.createTableColumn("SwFr.bill_flg", MCColumnType.CHECK);
		p.columnSwFr_trd_cur_cd = p.beansFactory.createTableColumn("SwFr.trd_cur_cd", MCColumnType.TEXT);
		p.columnSwFr_amt_dec_place = p.beansFactory.createTableColumn("SwFr.amt_dec_place", MCColumnType.NUMBER);
		p.columnSwFr_upri_dec_place = p.beansFactory.createTableColumn("SwFr.upri_dec_place", MCColumnType.NUMBER);
	}

	/**
	 * [Sw]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSw(MSBGP_SwArBalReg p) {
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
		p.Sw_bill_basis_dt_Label = p.beansFactory.createLabel("Sw.bill_basis_dt_Label");
		p.Sw_bill_basis_dt = p.beansFactory.createDateField("Sw.bill_basis_dt");
		p.Sw_bill_basis_dt.setLabel(p.Sw_bill_basis_dt_Label);
		p.Sw_trd_cd_Label = p.beansFactory.createLabel("Sw.trd_cd_Label");
		p.Sw_trd_cd = p.beansFactory.createTextComboBox("Sw.trd_cd");
		p.Sw_trd_cd.setLabel(p.Sw_trd_cd_Label);
		p.Sw_trd_nm = p.beansFactory.createTextField("Sw.trd_nm");
		p.Sw_trd_ptn_typ = p.beansFactory.createTextField("Sw.trd_ptn_typ");
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
	protected static void jbfInitSwTo(MSBGP_SwArBalReg p) {
		// ブロック関連の初期化
		p.SwToPanel = p.beansFactory.createPanel("SwTo");
		p.SwToTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.SwTo_acst_cd_Label = p.beansFactory.createLabel("SwTo.acst_cd_Label");
		p.SwTo_acst_cd = p.beansFactory.createTextField("SwTo.acst_cd");
		p.SwTo_acst_cd.setLabel(p.SwTo_acst_cd_Label);
		p.SwTo_acst_nm = p.beansFactory.createTextField("SwTo.acst_nm");
		p.SwTo_ar_dpt_cd_Label = p.beansFactory.createLabel("SwTo.ar_dpt_cd_Label");
		p.SwTo_ar_dpt_cd = p.beansFactory.createTextField("SwTo.ar_dpt_cd");
		p.SwTo_ar_dpt_cd.setLabel(p.SwTo_ar_dpt_cd_Label);
		p.SwTo_ar_dpt_nm = p.beansFactory.createTextField("SwTo.ar_dpt_nm");
		p.SwTo_bcst_cd_Label = p.beansFactory.createLabel("SwTo.bcst_cd_Label");
		p.SwTo_bcst_cd = p.beansFactory.createTextField("SwTo.bcst_cd");
		p.SwTo_bcst_cd.setLabel(p.SwTo_bcst_cd_Label);
		p.SwTo_bcst_nm = p.beansFactory.createTextField("SwTo.bcst_nm");
		p.SwTo_bill_dpt_cd_Label = p.beansFactory.createLabel("SwTo.bill_dpt_cd_Label");
		p.SwTo_bill_dpt_cd = p.beansFactory.createTextComboBox("SwTo.bill_dpt_cd");
		p.SwTo_bill_dpt_cd.setLabel(p.SwTo_bill_dpt_cd_Label);
		p.SwTo_bill_dpt_nm = p.beansFactory.createTextField("SwTo.bill_dpt_nm");
		p.SwTo_wrk_ope_typ_Label = p.beansFactory.createLabel("SwTo.wrk_ope_typ_Label");
		p.SwTo_wrk_ope_typ = p.beansFactory.createTextComboBox("SwTo.wrk_ope_typ");
		p.SwTo_wrk_ope_typ.setLabel(p.SwTo_wrk_ope_typ_Label);
		p.SwTo_wrk_ope_typ_nm = p.beansFactory.createTextField("SwTo.wrk_ope_typ_nm");
		p.SwTo_trd_cur_cd_Label = p.beansFactory.createLabel("SwTo.trd_cur_cd_Label");
		p.SwTo_trd_cur_cd = p.beansFactory.createTextField("SwTo.trd_cur_cd");
		p.SwTo_trd_cur_cd.setLabel(p.SwTo_trd_cur_cd_Label);
		p.SwTo_trd_cur_nm = p.beansFactory.createTextField("SwTo.trd_cur_nm");
		p.SwTo_amt_dec_place = p.beansFactory.createNumberField("SwTo.amt_dec_place");
		p.SwTo_upri_dec_place = p.beansFactory.createNumberField("SwTo.upri_dec_place");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBGP_SwArBalReg p) {
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
	protected static void jbInitTyp(MSBGP_SwArBalReg p) {
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
		p.Typ_typ_Group.setFirstBeans(p.Typ_typ_bill_bal);
		p.Typ_typ_bill_bal.setActionCommand("0");
		p.Typ_typ_Group.add(p.Typ_typ_bill_bal);
		p.TypPanel.add(p.Typ_typ_bill_bal);
		p.Typ_typ_bill_bal.setNextBeans(p.Typ_typ_not_bill);
		p.Typ_typ_not_bill.setActionCommand("1");
		p.Typ_typ_Group.add(p.Typ_typ_not_bill);
		p.TypPanel.add(p.Typ_typ_not_bill);
		p.Typ_typ_Group.setRow(p.getTypR(), mcframe.clientMSBG.MSBGP0240.TypR.typ_META);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBGP_SwArBalReg p) {
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
	protected static void jbInitCnd(MSBGP_SwArBalReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_bcst_cd_Label);
		p.CndPanel.add(p.Cnd_bcst_cd);
		p.CndPanel.setLastBeans(p.Cnd_bcst_cd);
		p.Cnd_bcst_cd.setNextBeans(p.Cnd_bcst_nm);
		p.Cnd_bcst_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0240.CndR.bcst_cd_META);
		p.Cnd_bcst_cd.addLinkBeans(p.Cnd_bcst_nm);
		p.Cnd_bcst_cd.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_bcst_nm);
		p.Cnd_bcst_nm.setNextBeans(p.Cnd_trd_cur_cd);
		p.Cnd_bcst_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0240.CndR.bcst_nm_META);
		p.Cnd_trd_cur_cd.setListType(MCListType.STRICT);
		p.Cnd_trd_cur_cd.setLinkBeans(p.Cnd_trd_cur_nm,p.Cnd_amt_dec_place,p.Cnd_upri_dec_place);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0240.CndR.trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_bill_dpt_cd);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0240.CndR.trd_cur_nm_META);
		p.CndPanel.add(p.Cnd_bill_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_bill_dpt_cd);
		p.Cnd_bill_dpt_cd.setNextBeans(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0240.CndR.bill_dpt_cd_META);
		p.Cnd_bill_dpt_cd.addLinkBeans(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bill_dpt_cd, true);
		p.CndPanel.add(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_nm.setNextBeans(p.Cnd_acst_cd);
		p.Cnd_bill_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0240.CndR.bill_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_bill_dpt_nm, true);
		p.CndPanel.add(p.Cnd_acst_cd_Label);
		p.CndPanel.add(p.Cnd_acst_cd);
		p.Cnd_acst_cd.setNextBeans(p.Cnd_acst_nm);
		p.Cnd_acst_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0240.CndR.acst_cd_META);
		p.Cnd_acst_cd.addLinkBeans(p.Cnd_acst_nm);
		p.Cnd_acst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_acst_cd, true);
		p.CndPanel.add(p.Cnd_acst_nm);
		p.Cnd_acst_nm.setNextBeans(p.Cnd_ar_dpt_cd);
		p.Cnd_acst_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0240.CndR.acst_nm_META);
		p.setPluralValueEnable(p.Cnd_acst_nm, true);
		p.CndPanel.add(p.Cnd_ar_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_ar_dpt_cd);
		p.Cnd_ar_dpt_cd.setNextBeans(p.Cnd_ar_dpt_nm);
		p.Cnd_ar_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0240.CndR.ar_dpt_cd_META);
		p.Cnd_ar_dpt_cd.addLinkBeans(p.Cnd_ar_dpt_nm);
		p.Cnd_ar_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ar_dpt_cd, true);
		p.CndPanel.add(p.Cnd_ar_dpt_nm);
		p.Cnd_ar_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_ar_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0240.CndR.ar_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_ar_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0240.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0240.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_wrk_no_p_PPanel.setNextBeans(p.Cnd_ar_typ);
		p.Cnd_ar_typ.setListType(MCListType.STRICT);
		p.Cnd_ar_typ.setLinkBeans(p.Cnd_ar_typ_nm);
		p.CndPanel.add(p.Cnd_ar_typ_Label);
		p.CndPanel.add(p.Cnd_ar_typ);
		p.Cnd_ar_typ.setNextBeans(p.Cnd_ar_typ_nm);
		p.Cnd_ar_typ.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0240.CndR.ar_typ_META);
		p.CndPanel.add(p.Cnd_ar_typ_nm);
		p.Cnd_ar_typ_nm.setNextBeans(p.Cnd_not_bill_inc_flg);
		p.Cnd_ar_typ_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0240.CndR.ar_typ_nm_META);
		p.CndPanel.add(p.Cnd_not_bill_inc_flg);
		p.Cnd_not_bill_inc_flg.setNextBeans(p.Cnd_amt_dec_place);
		p.Cnd_not_bill_inc_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0240.CndR.not_bill_inc_flg_META);
		p.CndPanel.add(p.Cnd_amt_dec_place);
		p.Cnd_amt_dec_place.setNextBeans(p.Cnd_upri_dec_place);
		p.Cnd_amt_dec_place.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0240.CndR.amt_dec_place_META);
		p.CndPanel.add(p.Cnd_upri_dec_place);
		p.Cnd_upri_dec_place.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0240.CndR.upri_dec_place_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBGP_SwArBalReg p) {
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
	protected static void jbInitSwFr(MSBGP_SwArBalReg p) {
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
	protected static void jbInitSw(MSBGP_SwArBalReg p) {
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
		p.Sw_sw_dt.setRow(p.getSwR(), mcframe.clientMSBG.MSBGP0240.SwR.sw_dt_META);
		p.Sw_sw_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.SwPanel.add(p.Sw_ac_dt_Label);
		p.SwPanel.add(p.Sw_ac_dt);
		p.Sw_ac_dt.setNextBeans(p.Sw_bill_basis_dt);
		p.Sw_ac_dt.setRow(p.getSwR(), mcframe.clientMSBG.MSBGP0240.SwR.ac_dt_META);
		p.Sw_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.SwPanel.add(p.Sw_bill_basis_dt_Label);
		p.SwPanel.add(p.Sw_bill_basis_dt);
		p.Sw_bill_basis_dt.setNextBeans(p.Sw_trd_cd);
		p.Sw_bill_basis_dt.setRow(p.getSwR(), mcframe.clientMSBG.MSBGP0240.SwR.bill_basis_dt_META);
		p.Sw_bill_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Sw_trd_cd.setListType(MCListType.STRICT);
		p.Sw_trd_cd.setLinkBeans(p.Sw_trd_nm,p.Sw_trd_ptn_typ);
		p.SwPanel.add(p.Sw_trd_cd_Label);
		p.SwPanel.add(p.Sw_trd_cd);
		p.Sw_trd_cd.setNextBeans(p.Sw_trd_nm);
		p.Sw_trd_cd.setRow(p.getSwR(), mcframe.clientMSBG.MSBGP0240.SwR.trd_cd_META);
		p.SwPanel.add(p.Sw_trd_nm);
		p.Sw_trd_nm.setNextBeans(p.Sw_trd_ptn_typ);
		p.Sw_trd_nm.setRow(p.getSwR(), mcframe.clientMSBG.MSBGP0240.SwR.trd_nm_META);
		p.SwPanel.add(p.Sw_trd_ptn_typ);
		p.Sw_trd_ptn_typ.setNextBeans(p.Sw_usr_dpt_p_PPanel);
		p.Sw_trd_ptn_typ.setRow(p.getSwR(), mcframe.clientMSBG.MSBGP0240.SwR.trd_ptn_typ_META);
		p.SwPanel.add(p.Sw_usr_dpt_p_PPanel);
		p.Sw_usr_dpt_p_PPanel.setNextBeans(p.Sw_trd_rmrks);
		p.Sw_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.Sw_dpt_nm);
		p.SwPanel.add(p.Sw_trd_rmrks_Label);
		p.SwPanel.add(p.Sw_trd_rmrks);
		p.Sw_trd_rmrks.setNextBeans(p.Sw_sub_char1);
		p.Sw_trd_rmrks.setRow(p.getSwR(), mcframe.clientMSBG.MSBGP0240.SwR.trd_rmrks_META);
		p.SwPanel.add(p.Sw_sub_char1_Label);
		p.SwPanel.add(p.Sw_sub_char1);
		p.Sw_sub_char1.setNextBeans(p.Sw_sub_char2);
		p.Sw_sub_char1.setRow(p.getSwR(), mcframe.clientMSBG.MSBGP0240.SwR.sub_char1_META);
		p.SwPanel.add(p.Sw_sub_char2_Label);
		p.SwPanel.add(p.Sw_sub_char2);
		p.Sw_sub_char2.setNextBeans(p.Sw_sub_char3);
		p.Sw_sub_char2.setRow(p.getSwR(), mcframe.clientMSBG.MSBGP0240.SwR.sub_char2_META);
		p.SwPanel.add(p.Sw_sub_char3_Label);
		p.SwPanel.add(p.Sw_sub_char3);
		p.Sw_sub_char3.setRow(p.getSwR(), mcframe.clientMSBG.MSBGP0240.SwR.sub_char3_META);
	}

	/**
	 * [SwTo]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSwTo(MSBGP_SwArBalReg p) {
		// ブロック関連の初期化
		p.SwToPanel.setBorder(p.SwToTitledBorder);
		p.add(p.SwToPanel);
		p.SwToPanel.setNextBeans(p.BtnPanel);
		p.SwToPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.SwToPanel.add(p.SwTo_acst_cd_Label);
		p.SwToPanel.add(p.SwTo_acst_cd);
		p.SwToPanel.setLastBeans(p.SwTo_acst_cd);
		p.SwTo_acst_cd.setNextBeans(p.SwTo_acst_nm);
		p.SwTo_acst_cd.setRow(p.getSwToR(), mcframe.clientMSBG.MSBGP0240.SwToR.acst_cd_META);
		p.SwTo_acst_cd.addLinkBeans(p.SwTo_acst_nm,p.SwTo_bcst_cd,p.SwTo_bcst_nm);
		p.SwTo_acst_cd.setListType(MCListType.STRICT);
		p.SwToPanel.add(p.SwTo_acst_nm);
		p.SwTo_acst_nm.setNextBeans(p.SwTo_ar_dpt_cd);
		p.SwTo_acst_nm.setRow(p.getSwToR(), mcframe.clientMSBG.MSBGP0240.SwToR.acst_nm_META);
		p.SwToPanel.add(p.SwTo_ar_dpt_cd_Label);
		p.SwToPanel.add(p.SwTo_ar_dpt_cd);
		p.SwTo_ar_dpt_cd.setNextBeans(p.SwTo_ar_dpt_nm);
		p.SwTo_ar_dpt_cd.setRow(p.getSwToR(), mcframe.clientMSBG.MSBGP0240.SwToR.ar_dpt_cd_META);
		p.SwTo_ar_dpt_cd.addLinkBeans(p.SwTo_ar_dpt_nm);
		p.SwTo_ar_dpt_cd.setListType(MCListType.STRICT);
		p.SwToPanel.add(p.SwTo_ar_dpt_nm);
		p.SwTo_ar_dpt_nm.setNextBeans(p.SwTo_bcst_cd);
		p.SwTo_ar_dpt_nm.setRow(p.getSwToR(), mcframe.clientMSBG.MSBGP0240.SwToR.ar_dpt_nm_META);
		p.SwToPanel.add(p.SwTo_bcst_cd_Label);
		p.SwToPanel.add(p.SwTo_bcst_cd);
		p.SwTo_bcst_cd.setNextBeans(p.SwTo_bcst_nm);
		p.SwTo_bcst_cd.setRow(p.getSwToR(), mcframe.clientMSBG.MSBGP0240.SwToR.bcst_cd_META);
		p.SwToPanel.add(p.SwTo_bcst_nm);
		p.SwTo_bcst_nm.setNextBeans(p.SwTo_bill_dpt_cd);
		p.SwTo_bcst_nm.setRow(p.getSwToR(), mcframe.clientMSBG.MSBGP0240.SwToR.bcst_nm_META);
		p.SwTo_bill_dpt_cd.setListType(MCListType.STRICT);
		p.SwTo_bill_dpt_cd.setLinkBeans(p.SwTo_bill_dpt_nm);
		p.SwToPanel.add(p.SwTo_bill_dpt_cd_Label);
		p.SwToPanel.add(p.SwTo_bill_dpt_cd);
		p.SwTo_bill_dpt_cd.setNextBeans(p.SwTo_bill_dpt_nm);
		p.SwTo_bill_dpt_cd.setRow(p.getSwToR(), mcframe.clientMSBG.MSBGP0240.SwToR.bill_dpt_cd_META);
		p.SwToPanel.add(p.SwTo_bill_dpt_nm);
		p.SwTo_bill_dpt_nm.setNextBeans(p.SwTo_wrk_ope_typ);
		p.SwTo_bill_dpt_nm.setRow(p.getSwToR(), mcframe.clientMSBG.MSBGP0240.SwToR.bill_dpt_nm_META);
		p.SwTo_wrk_ope_typ.setListType(MCListType.STRICT);
		p.SwTo_wrk_ope_typ.setLinkBeans(p.SwTo_wrk_ope_typ_nm);
		p.SwToPanel.add(p.SwTo_wrk_ope_typ_Label);
		p.SwToPanel.add(p.SwTo_wrk_ope_typ);
		p.SwTo_wrk_ope_typ.setNextBeans(p.SwTo_wrk_ope_typ_nm);
		p.SwTo_wrk_ope_typ.setRow(p.getSwToR(), mcframe.clientMSBG.MSBGP0240.SwToR.wrk_ope_typ_META);
		p.SwToPanel.add(p.SwTo_wrk_ope_typ_nm);
		p.SwTo_wrk_ope_typ_nm.setNextBeans(p.SwTo_wrk_no_p_PPanel);
		p.SwTo_wrk_ope_typ_nm.setRow(p.getSwToR(), mcframe.clientMSBG.MSBGP0240.SwToR.wrk_ope_typ_nm_META);
		p.SwToPanel.add(p.SwTo_wrk_no_p_PPanel);
		p.SwTo_wrk_no_p_PPanel.setNextBeans(p.SwTo_trd_cur_cd);
		p.SwToPanel.add(p.SwTo_trd_cur_cd_Label);
		p.SwToPanel.add(p.SwTo_trd_cur_cd);
		p.SwTo_trd_cur_cd.setNextBeans(p.SwTo_trd_cur_nm);
		p.SwTo_trd_cur_cd.setRow(p.getSwToR(), mcframe.clientMSBG.MSBGP0240.SwToR.trd_cur_cd_META);
		p.SwToPanel.add(p.SwTo_trd_cur_nm);
		p.SwTo_trd_cur_nm.setNextBeans(p.SwTo_tgt_sw_amt_p_PPanel);
		p.SwTo_trd_cur_nm.setRow(p.getSwToR(), mcframe.clientMSBG.MSBGP0240.SwToR.trd_cur_nm_META);
		p.SwToPanel.add(p.SwTo_tgt_sw_amt_p_PPanel);
		p.SwTo_tgt_sw_amt_p_PPanel.setNextBeans(p.SwTo_amt_dec_place);
		p.SwToPanel.add(p.SwTo_amt_dec_place);
		p.SwTo_amt_dec_place.setNextBeans(p.SwTo_upri_dec_place);
		p.SwTo_amt_dec_place.setRow(p.getSwToR(), mcframe.clientMSBG.MSBGP0240.SwToR.amt_dec_place_META);
		p.SwToPanel.add(p.SwTo_upri_dec_place);
		p.SwTo_upri_dec_place.setRow(p.getSwToR(), mcframe.clientMSBG.MSBGP0240.SwToR.upri_dec_place_META);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBGP_SwArBalReg p) {
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
		MSBGP_SwArBalReg_MC.mcInitTyp((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.mcInitTop((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.mcInitCnd((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.mcInitCtrl((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.mcInitSwFr((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.mcInitSw((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.mcInitSwTo((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.mcInitBtn((MSBGP_SwArBalReg)this);

		// [SRCH]ステータスのモードの設定
		MSBGP_SwArBalReg_MC.statusInitSRCH_Typ((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.statusInitSRCH_Top((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.statusInitSRCH_Cnd((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.statusInitSRCH_Ctrl((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.statusInitSRCH_SwFr((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.statusInitSRCH_Sw((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.statusInitSRCH_SwTo((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.statusInitSRCH_Btn((MSBGP_SwArBalReg)this);

		// [UPD]ステータスのモードの設定
		MSBGP_SwArBalReg_MC.statusInitUPD_Typ((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.statusInitUPD_Top((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.statusInitUPD_Cnd((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.statusInitUPD_Ctrl((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.statusInitUPD_SwFr((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.statusInitUPD_Sw((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.statusInitUPD_SwTo((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.statusInitUPD_Btn((MSBGP_SwArBalReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBGP_SwArBalReg_MC.statusInitFIX__U_Typ((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.statusInitFIX__U_Top((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.statusInitFIX__U_Cnd((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.statusInitFIX__U_Ctrl((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.statusInitFIX__U_SwFr((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.statusInitFIX__U_Sw((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.statusInitFIX__U_SwTo((MSBGP_SwArBalReg)this);
		MSBGP_SwArBalReg_MC.statusInitFIX__U_Btn((MSBGP_SwArBalReg)this);

	}

	/**
	 *  [Typ]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTyp(MSBGP_SwArBalReg p) {
		p.Typ_typ_Group.addAllListener(p);
		p.Typ_typ_bill_bal.addAllListener(p);
		p.Typ_typ_not_bill.addAllListener(p);
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBGP_SwArBalReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBGP_SwArBalReg p) {
		p.Cnd_bcst_cd.setListListener(p);
		p.Cnd_bcst_cd.addAllListener(p);
		p.Cnd_bcst_nm.setListListener(p);
		p.Cnd_bcst_nm.addAllListener(p);
		p.Cnd_trd_cur_cd.setListListener(p);
		p.Cnd_trd_cur_cd.addAllListener(p);
		p.Cnd_trd_cur_nm.setListListener(p);
		p.Cnd_trd_cur_nm.addAllListener(p);
		p.Cnd_bill_dpt_cd.setListListener(p);
		p.Cnd_bill_dpt_cd.addAllListener(p);
		p.Cnd_bill_dpt_nm.setListListener(p);
		p.Cnd_bill_dpt_nm.addAllListener(p);
		p.Cnd_acst_cd.setListListener(p);
		p.Cnd_acst_cd.addAllListener(p);
		p.Cnd_acst_nm.setListListener(p);
		p.Cnd_acst_nm.addAllListener(p);
		p.Cnd_ar_dpt_cd.setListListener(p);
		p.Cnd_ar_dpt_cd.addAllListener(p);
		p.Cnd_ar_dpt_nm.setListListener(p);
		p.Cnd_ar_dpt_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_ar_typ.setListListener(p);
		p.Cnd_ar_typ.addAllListener(p);
		p.Cnd_ar_typ_nm.setListListener(p);
		p.Cnd_ar_typ_nm.addAllListener(p);
		p.Cnd_not_bill_inc_flg.addAllListener(p);
		p.Cnd_amt_dec_place.setListListener(p);
		p.Cnd_amt_dec_place.addAllListener(p);
		p.Cnd_upri_dec_place.setListListener(p);
		p.Cnd_upri_dec_place.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBGP_SwArBalReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [SwFr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSwFr(MSBGP_SwArBalReg p) {
		p.SwFrTable.addAllListener(p);
		p.columnSwFr_check.addAllListener(p);
		p.columnSwFr_acst_cd.addAllListener(p);
		p.columnSwFr_acst_cd.setListListener(p);
		p.columnSwFr_acst_nm.addAllListener(p);
		p.columnSwFr_acst_nm.setListListener(p);
		p.columnSwFr_ar_dpt_cd.addAllListener(p);
		p.columnSwFr_ar_dpt_cd.setListListener(p);
		p.columnSwFr_ar_dpt_nm.addAllListener(p);
		p.columnSwFr_ar_dpt_nm.setListListener(p);
		p.columnSwFr_bill_dpt_cd.addAllListener(p);
		p.columnSwFr_bill_dpt_cd.setListListener(p);
		p.columnSwFr_bill_dpt_nm.addAllListener(p);
		p.columnSwFr_bill_dpt_nm.setListListener(p);
		p.columnSwFr_slip_sts_typ_nm.addAllListener(p);
		p.columnSwFr_slip_sts_typ_nm.setListListener(p);
		p.columnSwFr_trd_cd.addAllListener(p);
		p.columnSwFr_trd_cd.setListListener(p);
		p.columnSwFr_trd_nm.addAllListener(p);
		p.columnSwFr_trd_nm.setListListener(p);
		p.columnSwFr_act_no.addAllListener(p);
		p.columnSwFr_act_no.setListListener(p);
		p.columnSwFr_act_rev.addAllListener(p);
		p.columnSwFr_act_rev.setListListener(p);
		p.columnSwFr_act_d_no.addAllListener(p);
		p.columnSwFr_act_d_no.setListListener(p);
		p.columnSwFr_wrk_no.addAllListener(p);
		p.columnSwFr_wrk_no.setListListener(p);
		p.columnSwFr_wrk_nm.addAllListener(p);
		p.columnSwFr_wrk_nm.setListListener(p);
		p.columnSwFr_sls_wrk_no.addAllListener(p);
		p.columnSwFr_sls_wrk_no.setListListener(p);
		p.columnSwFr_sls_wrk_nm.addAllListener(p);
		p.columnSwFr_sls_wrk_nm.setListListener(p);
		p.columnSwFr_ar_typ.addAllListener(p);
		p.columnSwFr_ar_typ.setListListener(p);
		p.columnSwFr_ar_typ_nm.addAllListener(p);
		p.columnSwFr_ar_typ_nm.setListListener(p);
		p.columnSwFr_xrate.addAllListener(p);
		p.columnSwFr_xrate.setListListener(p);
		p.columnSwFr_ac_ym.addAllListener(p);
		p.columnSwFr_ac_ym.setListListener(p);
		p.columnSwFr_ac_dt.addAllListener(p);
		p.columnSwFr_ac_dt.setListListener(p);
		p.columnSwFr_dlv_dt.addAllListener(p);
		p.columnSwFr_dlv_dt.setListListener(p);
		p.columnSwFr_bill_ym.addAllListener(p);
		p.columnSwFr_bill_ym.setListListener(p);
		p.columnSwFr_bill_cl_day.addAllListener(p);
		p.columnSwFr_bill_cl_day.setListListener(p);
		p.columnSwFr_bill_dt.addAllListener(p);
		p.columnSwFr_bill_dt.setListListener(p);
		p.columnSwFr_bill_no.addAllListener(p);
		p.columnSwFr_bill_no.setListListener(p);
		p.columnSwFr_iv_no.addAllListener(p);
		p.columnSwFr_iv_no.setListListener(p);
		p.columnSwFr_cst_cd.addAllListener(p);
		p.columnSwFr_cst_cd.setListListener(p);
		p.columnSwFr_cst_nm.addAllListener(p);
		p.columnSwFr_cst_nm.setListListener(p);
		p.columnSwFr_dlv_cd.addAllListener(p);
		p.columnSwFr_dlv_cd.setListListener(p);
		p.columnSwFr_dlv_nm.addAllListener(p);
		p.columnSwFr_dlv_nm.setListListener(p);
		p.columnSwFr_dest_cd1.addAllListener(p);
		p.columnSwFr_dest_cd1.setListListener(p);
		p.columnSwFr_dest_nm1.addAllListener(p);
		p.columnSwFr_dest_nm1.setListListener(p);
		p.columnSwFr_dest_cd2.addAllListener(p);
		p.columnSwFr_dest_cd2.setListListener(p);
		p.columnSwFr_dest_nm2.addAllListener(p);
		p.columnSwFr_dest_nm2.setListListener(p);
		p.columnSwFr_dest_cd3.addAllListener(p);
		p.columnSwFr_dest_cd3.setListListener(p);
		p.columnSwFr_dest_nm3.addAllListener(p);
		p.columnSwFr_dest_nm3.setListListener(p);
		p.columnSwFr_sls_usr_cd.addAllListener(p);
		p.columnSwFr_sls_usr_cd.setListListener(p);
		p.columnSwFr_sls_usr_nm.addAllListener(p);
		p.columnSwFr_sls_usr_nm.setListListener(p);
		p.columnSwFr_sls_dpt_cd.addAllListener(p);
		p.columnSwFr_sls_dpt_cd.setListListener(p);
		p.columnSwFr_sls_dpt_nm.addAllListener(p);
		p.columnSwFr_sls_dpt_nm.setListListener(p);
		p.columnSwFr_slo_no.addAllListener(p);
		p.columnSwFr_slo_no.setListListener(p);
		p.columnSwFr_slo_d_no.addAllListener(p);
		p.columnSwFr_slo_d_no.setListListener(p);
		p.columnSwFr_cst_po_no.addAllListener(p);
		p.columnSwFr_cst_po_no.setListListener(p);
		p.columnSwFr_cst_po_d_no.addAllListener(p);
		p.columnSwFr_cst_po_d_no.setListListener(p);
		p.columnSwFr_dlv_slip_no.addAllListener(p);
		p.columnSwFr_dlv_slip_no.setListListener(p);
		p.columnSwFr_dlv_slip_d_no.addAllListener(p);
		p.columnSwFr_dlv_slip_d_no.setListListener(p);
		p.columnSwFr_ship_dlv_slip_no.addAllListener(p);
		p.columnSwFr_ship_dlv_slip_no.setListListener(p);
		p.columnSwFr_ship_dlv_slip_d_no.addAllListener(p);
		p.columnSwFr_ship_dlv_slip_d_no.setListListener(p);
		p.columnSwFr_ship_dlv_slip_multi_flg.addAllListener(p);
		p.columnSwFr_bill_flg.addAllListener(p);
		p.columnSwFr_trd_cur_cd.addAllListener(p);
		p.columnSwFr_trd_cur_cd.setListListener(p);
		p.columnSwFr_amt_dec_place.addAllListener(p);
		p.columnSwFr_amt_dec_place.setListListener(p);
		p.columnSwFr_upri_dec_place.addAllListener(p);
		p.columnSwFr_upri_dec_place.setListListener(p);
	}

	/**
	 *  [Sw]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSw(MSBGP_SwArBalReg p) {
		p.Sw_sw_dt.setListListener(p);
		p.Sw_sw_dt.addAllListener(p);
		p.Sw_ac_dt.setListListener(p);
		p.Sw_ac_dt.addAllListener(p);
		p.Sw_bill_basis_dt.setListListener(p);
		p.Sw_bill_basis_dt.addAllListener(p);
		p.Sw_trd_cd.setListListener(p);
		p.Sw_trd_cd.addAllListener(p);
		p.Sw_trd_nm.setListListener(p);
		p.Sw_trd_nm.addAllListener(p);
		p.Sw_trd_ptn_typ.setListListener(p);
		p.Sw_trd_ptn_typ.addAllListener(p);
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
	protected static void mcInitSwTo(MSBGP_SwArBalReg p) {
		p.SwTo_acst_cd.setListListener(p);
		p.SwTo_acst_cd.addAllListener(p);
		p.SwTo_acst_nm.setListListener(p);
		p.SwTo_acst_nm.addAllListener(p);
		p.SwTo_ar_dpt_cd.setListListener(p);
		p.SwTo_ar_dpt_cd.addAllListener(p);
		p.SwTo_ar_dpt_nm.setListListener(p);
		p.SwTo_ar_dpt_nm.addAllListener(p);
		p.SwTo_bcst_cd.setListListener(p);
		p.SwTo_bcst_cd.addAllListener(p);
		p.SwTo_bcst_nm.setListListener(p);
		p.SwTo_bcst_nm.addAllListener(p);
		p.SwTo_bill_dpt_cd.setListListener(p);
		p.SwTo_bill_dpt_cd.addAllListener(p);
		p.SwTo_bill_dpt_nm.setListListener(p);
		p.SwTo_bill_dpt_nm.addAllListener(p);
		p.SwTo_wrk_ope_typ.setListListener(p);
		p.SwTo_wrk_ope_typ.addAllListener(p);
		p.SwTo_wrk_ope_typ_nm.setListListener(p);
		p.SwTo_wrk_ope_typ_nm.addAllListener(p);
		p.SwTo_trd_cur_cd.setListListener(p);
		p.SwTo_trd_cur_cd.addAllListener(p);
		p.SwTo_trd_cur_nm.setListListener(p);
		p.SwTo_trd_cur_nm.addAllListener(p);
		p.SwTo_amt_dec_place.setListListener(p);
		p.SwTo_amt_dec_place.addAllListener(p);
		p.SwTo_upri_dec_place.setListListener(p);
		p.SwTo_upri_dec_place.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBGP_SwArBalReg p) {
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
	protected static void statusInitSRCH_Typ(MSBGP_SwArBalReg p){
		p.Typ_typ_Group.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBGP_SwArBalReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBGP_SwArBalReg p){
		p.Cnd_bcst_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_bill_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bill_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_acst_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_acst_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ar_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ar_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_ar_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ar_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_not_bill_inc_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBGP_SwArBalReg p){

	}

	/**
	 * [SRCH]ステータスの[SwFr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SwFr(MSBGP_SwArBalReg p){
		p.columnSwFr_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_acst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_acst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_ar_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_ar_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_bill_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_bill_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_slip_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwFr_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.SwFr_tgt_sw_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.SwFr_not_appl_wtax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnSwFr_wrk_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_wrk_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_sls_wrk_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_sls_wrk_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_ar_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_ar_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_dlv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_bill_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_bill_cl_day.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_bill_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_bill_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_dlv_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_dlv_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_dest_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_dest_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_dest_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_dest_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_dest_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_dest_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_sls_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_sls_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_sls_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_sls_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_slo_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_cst_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_cst_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_dlv_slip_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_ship_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_ship_dlv_slip_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_ship_dlv_slip_multi_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_bill_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnSwFr_trd_cur_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnSwFr_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnSwFr_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Sw]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Sw(MSBGP_SwArBalReg p){
		p.Sw_sw_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Sw_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Sw_bill_basis_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Sw_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Sw_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Sw_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Sw_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Sw_trd_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Sw_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Sw_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Sw_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[SwTo]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SwTo(MSBGP_SwArBalReg p){
		p.SwTo_acst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwTo_acst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwTo_ar_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwTo_ar_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwTo_bcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwTo_bcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwTo_bill_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwTo_bill_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwTo_wrk_ope_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwTo_wrk_ope_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwTo_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.SwTo_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwTo_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.SwTo_tgt_sw_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.SwTo_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.SwTo_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBGP_SwArBalReg p){
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Typ]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Typ(MSBGP_SwArBalReg p){
		p.Typ_typ_Group.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBGP_SwArBalReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBGP_SwArBalReg p){
		p.Cnd_bcst_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_bcst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_bill_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bill_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_acst_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_acst_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ar_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ar_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_ar_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ar_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_not_bill_inc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBGP_SwArBalReg p){

	}

	/**
	 * [UPD]ステータスの[SwFr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SwFr(MSBGP_SwArBalReg p){
		p.columnSwFr_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnSwFr_acst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_acst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_ar_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_ar_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_bill_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_bill_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_slip_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_act_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.SwFr_inc_tax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.SwFr_tgt_sw_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.SwFr_not_appl_wtax_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnSwFr_wrk_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_wrk_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_sls_wrk_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_sls_wrk_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_ar_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_ar_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_xrate.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_ac_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_ac_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_dlv_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_bill_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_bill_cl_day.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_bill_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_bill_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_iv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_cst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_dlv_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_dlv_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_dest_cd1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_dest_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_dest_cd2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_dest_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_dest_cd3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_dest_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_sls_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_sls_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_sls_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_sls_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_slo_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_slo_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_cst_po_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_cst_po_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_dlv_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_dlv_slip_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_ship_dlv_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_ship_dlv_slip_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_ship_dlv_slip_multi_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_bill_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnSwFr_trd_cur_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnSwFr_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnSwFr_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Sw]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Sw(MSBGP_SwArBalReg p){
		p.Sw_sw_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Sw_ac_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Sw_bill_basis_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Sw_trd_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Sw_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Sw_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
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
	protected static void statusInitUPD_SwTo(MSBGP_SwArBalReg p){
		p.SwTo_acst_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.SwTo_acst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.SwTo_ar_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.SwTo_ar_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.SwTo_bcst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.SwTo_bcst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.SwTo_bill_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.SwTo_bill_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.SwTo_wrk_ope_typ.putMode(p, UPD, MCMode.ENABLE);
		p.SwTo_wrk_ope_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.SwTo_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.SwTo_trd_cur_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.SwTo_trd_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.SwTo_tgt_sw_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.SwTo_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.SwTo_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBGP_SwArBalReg p){
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Typ]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Typ(MSBGP_SwArBalReg p){
		p.Typ_typ_Group.putMode(p, FIX_U, MCMode.REQUIRED);

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MSBGP_SwArBalReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBGP_SwArBalReg p){
		p.Cnd_bcst_cd.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_bcst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_trd_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_bill_dpt_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_bill_dpt_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_acst_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_acst_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ar_dpt_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ar_dpt_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_ar_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ar_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_not_bill_inc_flg.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Cnd_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MSBGP_SwArBalReg p){

	}

	/**
	 * [FIX_U]ステータスの[SwFr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_SwFr(MSBGP_SwArBalReg p){
		p.columnSwFr_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_acst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_acst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_ar_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_ar_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_bill_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_bill_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_slip_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_act_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwFr_inc_tax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.SwFr_tgt_sw_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.SwFr_not_appl_wtax_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnSwFr_wrk_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_wrk_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_sls_wrk_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_sls_wrk_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_ar_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_ar_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_xrate.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_ac_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_dlv_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_bill_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_bill_cl_day.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_bill_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_bill_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_cst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_cst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_dlv_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_dlv_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_dest_cd1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_dest_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_dest_cd2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_dest_nm2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_dest_cd3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_dest_nm3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_sls_usr_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_sls_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_sls_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_sls_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_slo_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_slo_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_cst_po_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_cst_po_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_dlv_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_dlv_slip_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_ship_dlv_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_ship_dlv_slip_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_ship_dlv_slip_multi_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_bill_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnSwFr_trd_cur_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnSwFr_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnSwFr_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Sw]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Sw(MSBGP_SwArBalReg p){
		p.Sw_sw_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Sw_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Sw_bill_basis_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Sw_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Sw_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Sw_trd_ptn_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Sw_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Sw_trd_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Sw_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Sw_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Sw_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[SwTo]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_SwTo(MSBGP_SwArBalReg p){
		p.SwTo_acst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwTo_acst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwTo_ar_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwTo_ar_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwTo_bcst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwTo_bcst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwTo_bill_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwTo_bill_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwTo_wrk_ope_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwTo_wrk_ope_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwTo_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.SwTo_trd_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwTo_trd_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.SwTo_tgt_sw_amt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.SwTo_amt_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.SwTo_upri_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBGP_SwArBalReg p){
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
		MSBGP_SwArBalReg_MC.setTableConfigSwFr((MSBGP_SwArBalReg)this);
	}

	/**
	 * [SwFr]ブロックのTableの設定
	 */
	protected static void setTableConfigSwFr(MSBGP_SwArBalReg p) {
		p.columnSwFr_check.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.check_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_check);
		p.columnSwFr_acst_cd.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.acst_cd_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_acst_cd);
		p.columnSwFr_acst_nm.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.acst_nm_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_acst_nm);
		p.columnSwFr_ar_dpt_cd.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.ar_dpt_cd_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_ar_dpt_cd);
		p.columnSwFr_ar_dpt_nm.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.ar_dpt_nm_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_ar_dpt_nm);
		p.columnSwFr_bill_dpt_cd.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.bill_dpt_cd_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_bill_dpt_cd);
		p.columnSwFr_bill_dpt_nm.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.bill_dpt_nm_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_bill_dpt_nm);
		p.columnSwFr_slip_sts_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.slip_sts_typ_nm_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_slip_sts_typ_nm);
		p.columnSwFr_trd_cd.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.trd_cd_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_trd_cd);
		p.columnSwFr_trd_nm.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.trd_nm_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_trd_nm);
		p.columnSwFr_act_no.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.act_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_act_no);
		p.columnSwFr_act_rev.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.act_rev_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_act_rev);
		p.columnSwFr_act_d_no.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.act_d_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_act_d_no);
		p.SwFrTable.addTable(p.SwFr_inc_tax_amt_p_PPanel.AmtTable);
		p.SwFrTable.addTable(p.SwFr_tgt_sw_amt_p_PPanel.AmtTable);
		p.SwFrTable.addTable(p.SwFr_not_appl_wtax_amt_p_PPanel.AmtTable);
		p.columnSwFr_wrk_no.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.wrk_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_wrk_no);
		p.columnSwFr_wrk_nm.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.wrk_nm_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_wrk_nm);
		p.columnSwFr_sls_wrk_no.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.sls_wrk_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_sls_wrk_no);
		p.columnSwFr_sls_wrk_nm.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.sls_wrk_nm_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_sls_wrk_nm);
		p.columnSwFr_ar_typ.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.ar_typ_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_ar_typ);
		p.columnSwFr_ar_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.ar_typ_nm_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_ar_typ_nm);
		p.columnSwFr_xrate.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.xrate_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_xrate);
		p.columnSwFr_ac_ym.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.ac_ym_META);
		p.columnSwFr_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.SwFrTable.addColumnConfig(p.columnSwFr_ac_ym);
		p.columnSwFr_ac_dt.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.ac_dt_META);
		p.columnSwFr_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.SwFrTable.addColumnConfig(p.columnSwFr_ac_dt);
		p.columnSwFr_dlv_dt.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.dlv_dt_META);
		p.columnSwFr_dlv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.SwFrTable.addColumnConfig(p.columnSwFr_dlv_dt);
		p.columnSwFr_bill_ym.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.bill_ym_META);
		p.columnSwFr_bill_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.SwFrTable.addColumnConfig(p.columnSwFr_bill_ym);
		p.columnSwFr_bill_cl_day.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.bill_cl_day_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_bill_cl_day);
		p.columnSwFr_bill_dt.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.bill_dt_META);
		p.columnSwFr_bill_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.SwFrTable.addColumnConfig(p.columnSwFr_bill_dt);
		p.columnSwFr_bill_no.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.bill_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_bill_no);
		p.columnSwFr_iv_no.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.iv_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_iv_no);
		p.columnSwFr_cst_cd.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.cst_cd_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_cst_cd);
		p.columnSwFr_cst_nm.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.cst_nm_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_cst_nm);
		p.columnSwFr_dlv_cd.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.dlv_cd_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_dlv_cd);
		p.columnSwFr_dlv_nm.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.dlv_nm_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_dlv_nm);
		p.columnSwFr_dest_cd1.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.dest_cd1_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_dest_cd1);
		p.columnSwFr_dest_nm1.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.dest_nm1_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_dest_nm1);
		p.columnSwFr_dest_cd2.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.dest_cd2_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_dest_cd2);
		p.columnSwFr_dest_nm2.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.dest_nm2_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_dest_nm2);
		p.columnSwFr_dest_cd3.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.dest_cd3_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_dest_cd3);
		p.columnSwFr_dest_nm3.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.dest_nm3_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_dest_nm3);
		p.columnSwFr_sls_usr_cd.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.sls_usr_cd_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_sls_usr_cd);
		p.columnSwFr_sls_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.sls_usr_nm_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_sls_usr_nm);
		p.columnSwFr_sls_dpt_cd.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.sls_dpt_cd_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_sls_dpt_cd);
		p.columnSwFr_sls_dpt_nm.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.sls_dpt_nm_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_sls_dpt_nm);
		p.columnSwFr_slo_no.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.slo_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_slo_no);
		p.columnSwFr_slo_d_no.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.slo_d_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_slo_d_no);
		p.columnSwFr_cst_po_no.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.cst_po_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_cst_po_no);
		p.columnSwFr_cst_po_d_no.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.cst_po_d_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_cst_po_d_no);
		p.columnSwFr_dlv_slip_no.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.dlv_slip_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_dlv_slip_no);
		p.columnSwFr_dlv_slip_d_no.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.dlv_slip_d_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_dlv_slip_d_no);
		p.columnSwFr_ship_dlv_slip_no.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.ship_dlv_slip_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_ship_dlv_slip_no);
		p.columnSwFr_ship_dlv_slip_d_no.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.ship_dlv_slip_d_no_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_ship_dlv_slip_d_no);
		p.columnSwFr_ship_dlv_slip_multi_flg.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.ship_dlv_slip_multi_flg_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_ship_dlv_slip_multi_flg);
		p.columnSwFr_bill_flg.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.bill_flg_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_bill_flg);
		p.columnSwFr_trd_cur_cd.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.trd_cur_cd_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_trd_cur_cd);
		p.columnSwFr_amt_dec_place.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.amt_dec_place_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_amt_dec_place);
		p.columnSwFr_upri_dec_place.setMeta(mcframe.clientMSBG.MSBGP0240.SwFrR.upri_dec_place_META);
		p.SwFrTable.addColumnConfig(p.columnSwFr_upri_dec_place);
		// スクロール固定カラムの指定
		p.SwFrTable.setUnscrollColumn(p.columnSwFr_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_bcst_cd.getListConfig().setPutter(getCnd_bcst_cd_ListPutter());
		Cnd_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cur_cd.getListConfig().setPutter(getCnd_trd_cur_cd_ListPutter());
		Cnd_bill_dpt_cd.getListConfig().setPutter(getCnd_bill_dpt_cd_ListPutter());
		Cnd_acst_cd.getListConfig().setPutter(getCnd_acst_cd_ListPutter());
		Cnd_ar_dpt_cd.getListConfig().setPutter(getCnd_ar_dpt_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_ar_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ar_typ.getListConfig().setPutter(getCnd_ar_typ_ListPutter());
		Sw_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Sw_trd_cd.getListConfig().setPutter(getSw_trd_cd_ListPutter());
		Sw_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Sw_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getSw_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		SwTo_acst_cd.getListConfig().setPutter(getSwTo_acst_cd_ListPutter());
		SwTo_ar_dpt_cd.getListConfig().setPutter(getSwTo_ar_dpt_cd_ListPutter());
		SwTo_bill_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		SwTo_bill_dpt_cd.getListConfig().setPutter(getSwTo_bill_dpt_cd_ListPutter());
		SwTo_wrk_ope_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		SwTo_wrk_ope_typ.getListConfig().setPutter(getSwTo_wrk_ope_typ_ListPutter());
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
	 * [Cnd_bcst_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bcst_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Cnd_bill_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bill_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_acst_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_acst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_ar_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ar_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ArWg");
		return lp;
	}
	 
	/**
	 * [Cnd_ar_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ar_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ArTyp");
		return lp;
	}
	 
	/**
	 * [Sw_trd_cd_ListPutter]の作成
	 */
	protected MCListPutter createSw_trd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Trd");
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
	 * [SwTo_acst_cd_ListPutter]の作成
	 */
	protected MCListPutter createSwTo_acst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [SwTo_ar_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createSwTo_ar_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [SwTo_bill_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createSwTo_bill_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [SwTo_wrk_ope_typ_ListPutter]の作成
	 */
	protected MCListPutter createSwTo_wrk_ope_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.WrkOpeTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_bcst_cd) return getCnd_bcst_cd(row, info);
		if(combo == Cnd_trd_cur_cd) return getCnd_trd_cur_cd(row, info);
		if(combo == Cnd_bill_dpt_cd) return getCnd_bill_dpt_cd(row, info);
		if(combo == Cnd_acst_cd) return getCnd_acst_cd(row, info);
		if(combo == Cnd_ar_dpt_cd) return getCnd_ar_dpt_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_ar_typ) return getCnd_ar_typ(row, info);
		if(combo == Sw_trd_cd) return getSw_trd_cd(row, info);
		if(combo == Sw_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getSw_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == SwTo_acst_cd) return getSwTo_acst_cd(row, info);
		if(combo == SwTo_ar_dpt_cd) return getSwTo_ar_dpt_cd(row, info);
		if(combo == SwTo_bill_dpt_cd) return getSwTo_bill_dpt_cd(row, info);
		if(combo == SwTo_wrk_ope_typ) return getSwTo_wrk_ope_typ(row, info);
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
		if (vc == Cnd_bcst_cd) return doCnd_bcst_cd_VC(info);
		if (vc == Cnd_bcst_nm) return doCnd_bcst_nm_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
		if (vc == Cnd_bill_dpt_cd) return doCnd_bill_dpt_cd_VC(info);
		if (vc == Cnd_bill_dpt_nm) return doCnd_bill_dpt_nm_VC(info);
		if (vc == Cnd_acst_cd) return doCnd_acst_cd_VC(info);
		if (vc == Cnd_acst_nm) return doCnd_acst_nm_VC(info);
		if (vc == Cnd_ar_dpt_cd) return doCnd_ar_dpt_cd_VC(info);
		if (vc == Cnd_ar_dpt_nm) return doCnd_ar_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_ar_typ) return doCnd_ar_typ_VC(info);
		if (vc == Cnd_ar_typ_nm) return doCnd_ar_typ_nm_VC(info);
		if (vc == Cnd_not_bill_inc_flg) return doCnd_not_bill_inc_flg_VC(info);
		if (vc == Cnd_amt_dec_place) return doCnd_amt_dec_place_VC(info);
		if (vc == Cnd_upri_dec_place) return doCnd_upri_dec_place_VC(info);
		if (vc == columnSwFr_check) return doSwFr_check_VC(info);
		if (vc == columnSwFr_acst_cd) return doSwFr_acst_cd_VC(info);
		if (vc == columnSwFr_acst_nm) return doSwFr_acst_nm_VC(info);
		if (vc == columnSwFr_ar_dpt_cd) return doSwFr_ar_dpt_cd_VC(info);
		if (vc == columnSwFr_ar_dpt_nm) return doSwFr_ar_dpt_nm_VC(info);
		if (vc == columnSwFr_bill_dpt_cd) return doSwFr_bill_dpt_cd_VC(info);
		if (vc == columnSwFr_bill_dpt_nm) return doSwFr_bill_dpt_nm_VC(info);
		if (vc == columnSwFr_slip_sts_typ_nm) return doSwFr_slip_sts_typ_nm_VC(info);
		if (vc == columnSwFr_trd_cd) return doSwFr_trd_cd_VC(info);
		if (vc == columnSwFr_trd_nm) return doSwFr_trd_nm_VC(info);
		if (vc == columnSwFr_act_no) return doSwFr_act_no_VC(info);
		if (vc == columnSwFr_act_rev) return doSwFr_act_rev_VC(info);
		if (vc == columnSwFr_act_d_no) return doSwFr_act_d_no_VC(info);
		if (vc == columnSwFr_wrk_no) return doSwFr_wrk_no_VC(info);
		if (vc == columnSwFr_wrk_nm) return doSwFr_wrk_nm_VC(info);
		if (vc == columnSwFr_sls_wrk_no) return doSwFr_sls_wrk_no_VC(info);
		if (vc == columnSwFr_sls_wrk_nm) return doSwFr_sls_wrk_nm_VC(info);
		if (vc == columnSwFr_ar_typ) return doSwFr_ar_typ_VC(info);
		if (vc == columnSwFr_ar_typ_nm) return doSwFr_ar_typ_nm_VC(info);
		if (vc == columnSwFr_xrate) return doSwFr_xrate_VC(info);
		if (vc == columnSwFr_ac_ym) return doSwFr_ac_ym_VC(info);
		if (vc == columnSwFr_ac_dt) return doSwFr_ac_dt_VC(info);
		if (vc == columnSwFr_dlv_dt) return doSwFr_dlv_dt_VC(info);
		if (vc == columnSwFr_bill_ym) return doSwFr_bill_ym_VC(info);
		if (vc == columnSwFr_bill_cl_day) return doSwFr_bill_cl_day_VC(info);
		if (vc == columnSwFr_bill_dt) return doSwFr_bill_dt_VC(info);
		if (vc == columnSwFr_bill_no) return doSwFr_bill_no_VC(info);
		if (vc == columnSwFr_iv_no) return doSwFr_iv_no_VC(info);
		if (vc == columnSwFr_cst_cd) return doSwFr_cst_cd_VC(info);
		if (vc == columnSwFr_cst_nm) return doSwFr_cst_nm_VC(info);
		if (vc == columnSwFr_dlv_cd) return doSwFr_dlv_cd_VC(info);
		if (vc == columnSwFr_dlv_nm) return doSwFr_dlv_nm_VC(info);
		if (vc == columnSwFr_dest_cd1) return doSwFr_dest_cd1_VC(info);
		if (vc == columnSwFr_dest_nm1) return doSwFr_dest_nm1_VC(info);
		if (vc == columnSwFr_dest_cd2) return doSwFr_dest_cd2_VC(info);
		if (vc == columnSwFr_dest_nm2) return doSwFr_dest_nm2_VC(info);
		if (vc == columnSwFr_dest_cd3) return doSwFr_dest_cd3_VC(info);
		if (vc == columnSwFr_dest_nm3) return doSwFr_dest_nm3_VC(info);
		if (vc == columnSwFr_sls_usr_cd) return doSwFr_sls_usr_cd_VC(info);
		if (vc == columnSwFr_sls_usr_nm) return doSwFr_sls_usr_nm_VC(info);
		if (vc == columnSwFr_sls_dpt_cd) return doSwFr_sls_dpt_cd_VC(info);
		if (vc == columnSwFr_sls_dpt_nm) return doSwFr_sls_dpt_nm_VC(info);
		if (vc == columnSwFr_slo_no) return doSwFr_slo_no_VC(info);
		if (vc == columnSwFr_slo_d_no) return doSwFr_slo_d_no_VC(info);
		if (vc == columnSwFr_cst_po_no) return doSwFr_cst_po_no_VC(info);
		if (vc == columnSwFr_cst_po_d_no) return doSwFr_cst_po_d_no_VC(info);
		if (vc == columnSwFr_dlv_slip_no) return doSwFr_dlv_slip_no_VC(info);
		if (vc == columnSwFr_dlv_slip_d_no) return doSwFr_dlv_slip_d_no_VC(info);
		if (vc == columnSwFr_ship_dlv_slip_no) return doSwFr_ship_dlv_slip_no_VC(info);
		if (vc == columnSwFr_ship_dlv_slip_d_no) return doSwFr_ship_dlv_slip_d_no_VC(info);
		if (vc == columnSwFr_ship_dlv_slip_multi_flg) return doSwFr_ship_dlv_slip_multi_flg_VC(info);
		if (vc == columnSwFr_bill_flg) return doSwFr_bill_flg_VC(info);
		if (vc == columnSwFr_trd_cur_cd) return doSwFr_trd_cur_cd_VC(info);
		if (vc == columnSwFr_amt_dec_place) return doSwFr_amt_dec_place_VC(info);
		if (vc == columnSwFr_upri_dec_place) return doSwFr_upri_dec_place_VC(info);
		if (vc == Sw_sw_dt) return doSw_sw_dt_VC(info);
		if (vc == Sw_ac_dt) return doSw_ac_dt_VC(info);
		if (vc == Sw_bill_basis_dt) return doSw_bill_basis_dt_VC(info);
		if (vc == Sw_trd_cd) return doSw_trd_cd_VC(info);
		if (vc == Sw_trd_nm) return doSw_trd_nm_VC(info);
		if (vc == Sw_trd_ptn_typ) return doSw_trd_ptn_typ_VC(info);
		if (vc == Sw_trd_rmrks) return doSw_trd_rmrks_VC(info);
		if (vc == Sw_sub_char1) return doSw_sub_char1_VC(info);
		if (vc == Sw_sub_char2) return doSw_sub_char2_VC(info);
		if (vc == Sw_sub_char3) return doSw_sub_char3_VC(info);
		if (vc == SwTo_acst_cd) return doSwTo_acst_cd_VC(info);
		if (vc == SwTo_acst_nm) return doSwTo_acst_nm_VC(info);
		if (vc == SwTo_ar_dpt_cd) return doSwTo_ar_dpt_cd_VC(info);
		if (vc == SwTo_ar_dpt_nm) return doSwTo_ar_dpt_nm_VC(info);
		if (vc == SwTo_bcst_cd) return doSwTo_bcst_cd_VC(info);
		if (vc == SwTo_bcst_nm) return doSwTo_bcst_nm_VC(info);
		if (vc == SwTo_bill_dpt_cd) return doSwTo_bill_dpt_cd_VC(info);
		if (vc == SwTo_bill_dpt_nm) return doSwTo_bill_dpt_nm_VC(info);
		if (vc == SwTo_wrk_ope_typ) return doSwTo_wrk_ope_typ_VC(info);
		if (vc == SwTo_wrk_ope_typ_nm) return doSwTo_wrk_ope_typ_nm_VC(info);
		if (vc == SwTo_trd_cur_cd) return doSwTo_trd_cur_cd_VC(info);
		if (vc == SwTo_trd_cur_nm) return doSwTo_trd_cur_nm_VC(info);
		if (vc == SwTo_amt_dec_place) return doSwTo_amt_dec_place_VC(info);
		if (vc == SwTo_upri_dec_place) return doSwTo_upri_dec_place_VC(info);
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
	 * [Cnd]パネルの[bcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bcst_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[bill_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bill_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[acst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_acst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[acst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_acst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ar_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ar_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ar_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ar_dpt_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ar_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ar_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ar_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ar_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_bill_inc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_bill_inc_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_upri_dec_place_VC(MCEventInfo info){
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
	 * [SwFr]パネルの[acst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_acst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[acst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_acst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[ar_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_ar_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[ar_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_ar_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[bill_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_bill_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[bill_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_bill_dpt_nm_VC(MCEventInfo info){
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
	 * [SwFr]パネルの[sls_wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_sls_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[sls_wrk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_sls_wrk_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[ar_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_ar_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[ar_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_ar_typ_nm_VC(MCEventInfo info){
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
	 * [SwFr]パネルの[dlv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_dlv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[bill_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_bill_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[bill_cl_day]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_bill_cl_day_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[bill_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_bill_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[bill_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_bill_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_dlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[dest_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_dest_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[dest_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_dest_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[dest_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_dest_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[dest_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_dest_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[dest_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_dest_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[dest_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_dest_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[sls_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_sls_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[sls_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_sls_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[sls_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_sls_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[sls_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_sls_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[cst_po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_cst_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[cst_po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_cst_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_dlv_slip_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[ship_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_ship_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[ship_dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_ship_dlv_slip_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[ship_dlv_slip_multi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_ship_dlv_slip_multi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwFr]パネルの[bill_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_bill_flg_VC(MCEventInfo info){
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
	 * [SwFr]パネルの[upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwFr_upri_dec_place_VC(MCEventInfo info){
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
	 * [Sw]パネルの[bill_basis_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSw_bill_basis_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sw]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSw_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sw]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSw_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Sw]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSw_trd_ptn_typ_VC(MCEventInfo info){
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
	 * [SwTo]パネルの[acst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwTo_acst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwTo]パネルの[acst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwTo_acst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwTo]パネルの[ar_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwTo_ar_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwTo]パネルの[ar_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwTo_ar_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwTo]パネルの[bcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwTo_bcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwTo]パネルの[bcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwTo_bcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwTo]パネルの[bill_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwTo_bill_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwTo]パネルの[bill_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwTo_bill_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwTo]パネルの[wrk_ope_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwTo_wrk_ope_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SwTo]パネルの[wrk_ope_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwTo_wrk_ope_typ_nm_VC(MCEventInfo info){
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
	 * [SwTo]パネルの[upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSwTo_upri_dec_place_VC(MCEventInfo info){
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
		else if (nc == Cnd_bcst_cd) doCnd_bcst_cd_NC(info);
		else if (nc == Cnd_bcst_nm) doCnd_bcst_nm_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
		else if (nc == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NC(info);
		else if (nc == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NC(info);
		else if (nc == Cnd_acst_cd) doCnd_acst_cd_NC(info);
		else if (nc == Cnd_acst_nm) doCnd_acst_nm_NC(info);
		else if (nc == Cnd_ar_dpt_cd) doCnd_ar_dpt_cd_NC(info);
		else if (nc == Cnd_ar_dpt_nm) doCnd_ar_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_ar_typ) doCnd_ar_typ_NC(info);
		else if (nc == Cnd_ar_typ_nm) doCnd_ar_typ_nm_NC(info);
		else if (nc == Cnd_not_bill_inc_flg) doCnd_not_bill_inc_flg_NC(info);
		else if (nc == Cnd_amt_dec_place) doCnd_amt_dec_place_NC(info);
		else if (nc == Cnd_upri_dec_place) doCnd_upri_dec_place_NC(info);
		else if (nc == columnSwFr_check) doSwFr_check_NC(info);
		else if (nc == columnSwFr_acst_cd) doSwFr_acst_cd_NC(info);
		else if (nc == columnSwFr_acst_nm) doSwFr_acst_nm_NC(info);
		else if (nc == columnSwFr_ar_dpt_cd) doSwFr_ar_dpt_cd_NC(info);
		else if (nc == columnSwFr_ar_dpt_nm) doSwFr_ar_dpt_nm_NC(info);
		else if (nc == columnSwFr_bill_dpt_cd) doSwFr_bill_dpt_cd_NC(info);
		else if (nc == columnSwFr_bill_dpt_nm) doSwFr_bill_dpt_nm_NC(info);
		else if (nc == columnSwFr_slip_sts_typ_nm) doSwFr_slip_sts_typ_nm_NC(info);
		else if (nc == columnSwFr_trd_cd) doSwFr_trd_cd_NC(info);
		else if (nc == columnSwFr_trd_nm) doSwFr_trd_nm_NC(info);
		else if (nc == columnSwFr_act_no) doSwFr_act_no_NC(info);
		else if (nc == columnSwFr_act_rev) doSwFr_act_rev_NC(info);
		else if (nc == columnSwFr_act_d_no) doSwFr_act_d_no_NC(info);
		else if (nc == columnSwFr_wrk_no) doSwFr_wrk_no_NC(info);
		else if (nc == columnSwFr_wrk_nm) doSwFr_wrk_nm_NC(info);
		else if (nc == columnSwFr_sls_wrk_no) doSwFr_sls_wrk_no_NC(info);
		else if (nc == columnSwFr_sls_wrk_nm) doSwFr_sls_wrk_nm_NC(info);
		else if (nc == columnSwFr_ar_typ) doSwFr_ar_typ_NC(info);
		else if (nc == columnSwFr_ar_typ_nm) doSwFr_ar_typ_nm_NC(info);
		else if (nc == columnSwFr_xrate) doSwFr_xrate_NC(info);
		else if (nc == columnSwFr_ac_ym) doSwFr_ac_ym_NC(info);
		else if (nc == columnSwFr_ac_dt) doSwFr_ac_dt_NC(info);
		else if (nc == columnSwFr_dlv_dt) doSwFr_dlv_dt_NC(info);
		else if (nc == columnSwFr_bill_ym) doSwFr_bill_ym_NC(info);
		else if (nc == columnSwFr_bill_cl_day) doSwFr_bill_cl_day_NC(info);
		else if (nc == columnSwFr_bill_dt) doSwFr_bill_dt_NC(info);
		else if (nc == columnSwFr_bill_no) doSwFr_bill_no_NC(info);
		else if (nc == columnSwFr_iv_no) doSwFr_iv_no_NC(info);
		else if (nc == columnSwFr_cst_cd) doSwFr_cst_cd_NC(info);
		else if (nc == columnSwFr_cst_nm) doSwFr_cst_nm_NC(info);
		else if (nc == columnSwFr_dlv_cd) doSwFr_dlv_cd_NC(info);
		else if (nc == columnSwFr_dlv_nm) doSwFr_dlv_nm_NC(info);
		else if (nc == columnSwFr_dest_cd1) doSwFr_dest_cd1_NC(info);
		else if (nc == columnSwFr_dest_nm1) doSwFr_dest_nm1_NC(info);
		else if (nc == columnSwFr_dest_cd2) doSwFr_dest_cd2_NC(info);
		else if (nc == columnSwFr_dest_nm2) doSwFr_dest_nm2_NC(info);
		else if (nc == columnSwFr_dest_cd3) doSwFr_dest_cd3_NC(info);
		else if (nc == columnSwFr_dest_nm3) doSwFr_dest_nm3_NC(info);
		else if (nc == columnSwFr_sls_usr_cd) doSwFr_sls_usr_cd_NC(info);
		else if (nc == columnSwFr_sls_usr_nm) doSwFr_sls_usr_nm_NC(info);
		else if (nc == columnSwFr_sls_dpt_cd) doSwFr_sls_dpt_cd_NC(info);
		else if (nc == columnSwFr_sls_dpt_nm) doSwFr_sls_dpt_nm_NC(info);
		else if (nc == columnSwFr_slo_no) doSwFr_slo_no_NC(info);
		else if (nc == columnSwFr_slo_d_no) doSwFr_slo_d_no_NC(info);
		else if (nc == columnSwFr_cst_po_no) doSwFr_cst_po_no_NC(info);
		else if (nc == columnSwFr_cst_po_d_no) doSwFr_cst_po_d_no_NC(info);
		else if (nc == columnSwFr_dlv_slip_no) doSwFr_dlv_slip_no_NC(info);
		else if (nc == columnSwFr_dlv_slip_d_no) doSwFr_dlv_slip_d_no_NC(info);
		else if (nc == columnSwFr_ship_dlv_slip_no) doSwFr_ship_dlv_slip_no_NC(info);
		else if (nc == columnSwFr_ship_dlv_slip_d_no) doSwFr_ship_dlv_slip_d_no_NC(info);
		else if (nc == columnSwFr_ship_dlv_slip_multi_flg) doSwFr_ship_dlv_slip_multi_flg_NC(info);
		else if (nc == columnSwFr_bill_flg) doSwFr_bill_flg_NC(info);
		else if (nc == columnSwFr_trd_cur_cd) doSwFr_trd_cur_cd_NC(info);
		else if (nc == columnSwFr_amt_dec_place) doSwFr_amt_dec_place_NC(info);
		else if (nc == columnSwFr_upri_dec_place) doSwFr_upri_dec_place_NC(info);
		else if (nc == Sw_sw_dt) doSw_sw_dt_NC(info);
		else if (nc == Sw_ac_dt) doSw_ac_dt_NC(info);
		else if (nc == Sw_bill_basis_dt) doSw_bill_basis_dt_NC(info);
		else if (nc == Sw_trd_cd) doSw_trd_cd_NC(info);
		else if (nc == Sw_trd_nm) doSw_trd_nm_NC(info);
		else if (nc == Sw_trd_ptn_typ) doSw_trd_ptn_typ_NC(info);
		else if (nc == Sw_trd_rmrks) doSw_trd_rmrks_NC(info);
		else if (nc == Sw_sub_char1) doSw_sub_char1_NC(info);
		else if (nc == Sw_sub_char2) doSw_sub_char2_NC(info);
		else if (nc == Sw_sub_char3) doSw_sub_char3_NC(info);
		else if (nc == SwTo_acst_cd) doSwTo_acst_cd_NC(info);
		else if (nc == SwTo_acst_nm) doSwTo_acst_nm_NC(info);
		else if (nc == SwTo_ar_dpt_cd) doSwTo_ar_dpt_cd_NC(info);
		else if (nc == SwTo_ar_dpt_nm) doSwTo_ar_dpt_nm_NC(info);
		else if (nc == SwTo_bcst_cd) doSwTo_bcst_cd_NC(info);
		else if (nc == SwTo_bcst_nm) doSwTo_bcst_nm_NC(info);
		else if (nc == SwTo_bill_dpt_cd) doSwTo_bill_dpt_cd_NC(info);
		else if (nc == SwTo_bill_dpt_nm) doSwTo_bill_dpt_nm_NC(info);
		else if (nc == SwTo_wrk_ope_typ) doSwTo_wrk_ope_typ_NC(info);
		else if (nc == SwTo_wrk_ope_typ_nm) doSwTo_wrk_ope_typ_nm_NC(info);
		else if (nc == SwTo_trd_cur_cd) doSwTo_trd_cur_cd_NC(info);
		else if (nc == SwTo_trd_cur_nm) doSwTo_trd_cur_nm_NC(info);
		else if (nc == SwTo_amt_dec_place) doSwTo_amt_dec_place_NC(info);
		else if (nc == SwTo_upri_dec_place) doSwTo_upri_dec_place_NC(info);
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
	 * [Cnd]パネルの[bcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[bill_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ar_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_bill_inc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_bill_inc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_check_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[acst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_acst_cd_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[acst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_acst_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ar_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ar_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ar_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ar_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_dpt_nm_NC(MCEventInfo info){
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
	 * [SwFr]パネルの[sls_wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sls_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sls_wrk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sls_wrk_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ar_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ar_typ_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ar_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ar_typ_nm_NC(MCEventInfo info){
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
	 * [SwFr]パネルの[dlv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dlv_dt_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_ym_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_cl_day]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_cl_day_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_dt_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dest_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dest_cd1_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dest_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dest_nm1_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dest_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dest_cd2_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dest_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dest_nm2_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dest_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dest_cd3_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dest_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dest_nm3_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sls_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sls_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sls_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sls_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sls_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sls_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sls_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sls_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[cst_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_cst_po_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[cst_po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_cst_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ship_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ship_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ship_dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ship_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ship_dlv_slip_multi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ship_dlv_slip_multi_flg_NC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_flg_NC(MCEventInfo info){
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
	 * [SwFr]パネルの[upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_upri_dec_place_NC(MCEventInfo info){
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
	 * [Sw]パネルの[bill_basis_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_bill_basis_dt_NC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_trd_ptn_typ_NC(MCEventInfo info){
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
	 * [SwTo]パネルの[acst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_acst_cd_NC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[acst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_acst_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[ar_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_ar_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[ar_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_ar_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bill_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bill_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bill_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bill_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[wrk_ope_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_wrk_ope_typ_NC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[wrk_ope_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_wrk_ope_typ_nm_NC(MCEventInfo info){
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
	 * [SwTo]パネルの[upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_upri_dec_place_NC(MCEventInfo info){
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
		else if (ne == Cnd_bcst_cd) doCnd_bcst_cd_NE(info);
		else if (ne == Cnd_bcst_nm) doCnd_bcst_nm_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
		else if (ne == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NE(info);
		else if (ne == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NE(info);
		else if (ne == Cnd_acst_cd) doCnd_acst_cd_NE(info);
		else if (ne == Cnd_acst_nm) doCnd_acst_nm_NE(info);
		else if (ne == Cnd_ar_dpt_cd) doCnd_ar_dpt_cd_NE(info);
		else if (ne == Cnd_ar_dpt_nm) doCnd_ar_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_ar_typ) doCnd_ar_typ_NE(info);
		else if (ne == Cnd_ar_typ_nm) doCnd_ar_typ_nm_NE(info);
		else if (ne == Cnd_not_bill_inc_flg) doCnd_not_bill_inc_flg_NE(info);
		else if (ne == Cnd_amt_dec_place) doCnd_amt_dec_place_NE(info);
		else if (ne == Cnd_upri_dec_place) doCnd_upri_dec_place_NE(info);
		else if (ne == columnSwFr_check) doSwFr_check_NE(info);
		else if (ne == columnSwFr_acst_cd) doSwFr_acst_cd_NE(info);
		else if (ne == columnSwFr_acst_nm) doSwFr_acst_nm_NE(info);
		else if (ne == columnSwFr_ar_dpt_cd) doSwFr_ar_dpt_cd_NE(info);
		else if (ne == columnSwFr_ar_dpt_nm) doSwFr_ar_dpt_nm_NE(info);
		else if (ne == columnSwFr_bill_dpt_cd) doSwFr_bill_dpt_cd_NE(info);
		else if (ne == columnSwFr_bill_dpt_nm) doSwFr_bill_dpt_nm_NE(info);
		else if (ne == columnSwFr_slip_sts_typ_nm) doSwFr_slip_sts_typ_nm_NE(info);
		else if (ne == columnSwFr_trd_cd) doSwFr_trd_cd_NE(info);
		else if (ne == columnSwFr_trd_nm) doSwFr_trd_nm_NE(info);
		else if (ne == columnSwFr_act_no) doSwFr_act_no_NE(info);
		else if (ne == columnSwFr_act_rev) doSwFr_act_rev_NE(info);
		else if (ne == columnSwFr_act_d_no) doSwFr_act_d_no_NE(info);
		else if (ne == columnSwFr_wrk_no) doSwFr_wrk_no_NE(info);
		else if (ne == columnSwFr_wrk_nm) doSwFr_wrk_nm_NE(info);
		else if (ne == columnSwFr_sls_wrk_no) doSwFr_sls_wrk_no_NE(info);
		else if (ne == columnSwFr_sls_wrk_nm) doSwFr_sls_wrk_nm_NE(info);
		else if (ne == columnSwFr_ar_typ) doSwFr_ar_typ_NE(info);
		else if (ne == columnSwFr_ar_typ_nm) doSwFr_ar_typ_nm_NE(info);
		else if (ne == columnSwFr_xrate) doSwFr_xrate_NE(info);
		else if (ne == columnSwFr_ac_ym) doSwFr_ac_ym_NE(info);
		else if (ne == columnSwFr_ac_dt) doSwFr_ac_dt_NE(info);
		else if (ne == columnSwFr_dlv_dt) doSwFr_dlv_dt_NE(info);
		else if (ne == columnSwFr_bill_ym) doSwFr_bill_ym_NE(info);
		else if (ne == columnSwFr_bill_cl_day) doSwFr_bill_cl_day_NE(info);
		else if (ne == columnSwFr_bill_dt) doSwFr_bill_dt_NE(info);
		else if (ne == columnSwFr_bill_no) doSwFr_bill_no_NE(info);
		else if (ne == columnSwFr_iv_no) doSwFr_iv_no_NE(info);
		else if (ne == columnSwFr_cst_cd) doSwFr_cst_cd_NE(info);
		else if (ne == columnSwFr_cst_nm) doSwFr_cst_nm_NE(info);
		else if (ne == columnSwFr_dlv_cd) doSwFr_dlv_cd_NE(info);
		else if (ne == columnSwFr_dlv_nm) doSwFr_dlv_nm_NE(info);
		else if (ne == columnSwFr_dest_cd1) doSwFr_dest_cd1_NE(info);
		else if (ne == columnSwFr_dest_nm1) doSwFr_dest_nm1_NE(info);
		else if (ne == columnSwFr_dest_cd2) doSwFr_dest_cd2_NE(info);
		else if (ne == columnSwFr_dest_nm2) doSwFr_dest_nm2_NE(info);
		else if (ne == columnSwFr_dest_cd3) doSwFr_dest_cd3_NE(info);
		else if (ne == columnSwFr_dest_nm3) doSwFr_dest_nm3_NE(info);
		else if (ne == columnSwFr_sls_usr_cd) doSwFr_sls_usr_cd_NE(info);
		else if (ne == columnSwFr_sls_usr_nm) doSwFr_sls_usr_nm_NE(info);
		else if (ne == columnSwFr_sls_dpt_cd) doSwFr_sls_dpt_cd_NE(info);
		else if (ne == columnSwFr_sls_dpt_nm) doSwFr_sls_dpt_nm_NE(info);
		else if (ne == columnSwFr_slo_no) doSwFr_slo_no_NE(info);
		else if (ne == columnSwFr_slo_d_no) doSwFr_slo_d_no_NE(info);
		else if (ne == columnSwFr_cst_po_no) doSwFr_cst_po_no_NE(info);
		else if (ne == columnSwFr_cst_po_d_no) doSwFr_cst_po_d_no_NE(info);
		else if (ne == columnSwFr_dlv_slip_no) doSwFr_dlv_slip_no_NE(info);
		else if (ne == columnSwFr_dlv_slip_d_no) doSwFr_dlv_slip_d_no_NE(info);
		else if (ne == columnSwFr_ship_dlv_slip_no) doSwFr_ship_dlv_slip_no_NE(info);
		else if (ne == columnSwFr_ship_dlv_slip_d_no) doSwFr_ship_dlv_slip_d_no_NE(info);
		else if (ne == columnSwFr_ship_dlv_slip_multi_flg) doSwFr_ship_dlv_slip_multi_flg_NE(info);
		else if (ne == columnSwFr_bill_flg) doSwFr_bill_flg_NE(info);
		else if (ne == columnSwFr_trd_cur_cd) doSwFr_trd_cur_cd_NE(info);
		else if (ne == columnSwFr_amt_dec_place) doSwFr_amt_dec_place_NE(info);
		else if (ne == columnSwFr_upri_dec_place) doSwFr_upri_dec_place_NE(info);
		else if (ne == Sw_sw_dt) doSw_sw_dt_NE(info);
		else if (ne == Sw_ac_dt) doSw_ac_dt_NE(info);
		else if (ne == Sw_bill_basis_dt) doSw_bill_basis_dt_NE(info);
		else if (ne == Sw_trd_cd) doSw_trd_cd_NE(info);
		else if (ne == Sw_trd_nm) doSw_trd_nm_NE(info);
		else if (ne == Sw_trd_ptn_typ) doSw_trd_ptn_typ_NE(info);
		else if (ne == Sw_trd_rmrks) doSw_trd_rmrks_NE(info);
		else if (ne == Sw_sub_char1) doSw_sub_char1_NE(info);
		else if (ne == Sw_sub_char2) doSw_sub_char2_NE(info);
		else if (ne == Sw_sub_char3) doSw_sub_char3_NE(info);
		else if (ne == SwTo_acst_cd) doSwTo_acst_cd_NE(info);
		else if (ne == SwTo_acst_nm) doSwTo_acst_nm_NE(info);
		else if (ne == SwTo_ar_dpt_cd) doSwTo_ar_dpt_cd_NE(info);
		else if (ne == SwTo_ar_dpt_nm) doSwTo_ar_dpt_nm_NE(info);
		else if (ne == SwTo_bcst_cd) doSwTo_bcst_cd_NE(info);
		else if (ne == SwTo_bcst_nm) doSwTo_bcst_nm_NE(info);
		else if (ne == SwTo_bill_dpt_cd) doSwTo_bill_dpt_cd_NE(info);
		else if (ne == SwTo_bill_dpt_nm) doSwTo_bill_dpt_nm_NE(info);
		else if (ne == SwTo_wrk_ope_typ) doSwTo_wrk_ope_typ_NE(info);
		else if (ne == SwTo_wrk_ope_typ_nm) doSwTo_wrk_ope_typ_nm_NE(info);
		else if (ne == SwTo_trd_cur_cd) doSwTo_trd_cur_cd_NE(info);
		else if (ne == SwTo_trd_cur_nm) doSwTo_trd_cur_nm_NE(info);
		else if (ne == SwTo_amt_dec_place) doSwTo_amt_dec_place_NE(info);
		else if (ne == SwTo_upri_dec_place) doSwTo_upri_dec_place_NE(info);
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
	 * [Cnd]パネルの[bcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[bill_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ar_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_bill_inc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_bill_inc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_check_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[acst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_acst_cd_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[acst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_acst_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ar_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ar_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ar_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ar_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_dpt_nm_NE(MCEventInfo info){
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
	 * [SwFr]パネルの[sls_wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sls_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sls_wrk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sls_wrk_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ar_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ar_typ_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ar_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ar_typ_nm_NE(MCEventInfo info){
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
	 * [SwFr]パネルの[dlv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dlv_dt_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_ym_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_cl_day]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_cl_day_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_dt_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dest_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dest_cd1_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dest_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dest_nm1_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dest_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dest_cd2_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dest_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dest_nm2_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dest_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dest_cd3_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dest_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dest_nm3_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sls_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sls_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sls_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sls_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sls_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sls_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sls_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sls_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[cst_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_cst_po_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[cst_po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_cst_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ship_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ship_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ship_dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ship_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ship_dlv_slip_multi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ship_dlv_slip_multi_flg_NE(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_flg_NE(MCEventInfo info){
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
	 * [SwFr]パネルの[upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_upri_dec_place_NE(MCEventInfo info){
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
	 * [Sw]パネルの[bill_basis_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_bill_basis_dt_NE(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_trd_ptn_typ_NE(MCEventInfo info){
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
	 * [SwTo]パネルの[acst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_acst_cd_NE(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[acst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_acst_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[ar_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_ar_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[ar_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_ar_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bill_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bill_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bill_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bill_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[wrk_ope_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_wrk_ope_typ_NE(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[wrk_ope_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_wrk_ope_typ_nm_NE(MCEventInfo info){
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
	 * [SwTo]パネルの[upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_upri_dec_place_NE(MCEventInfo info){
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
		else if (nx == Cnd_bcst_cd) doCnd_bcst_cd_NX(info);
		else if (nx == Cnd_bcst_nm) doCnd_bcst_nm_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
		else if (nx == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NX(info);
		else if (nx == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NX(info);
		else if (nx == Cnd_acst_cd) doCnd_acst_cd_NX(info);
		else if (nx == Cnd_acst_nm) doCnd_acst_nm_NX(info);
		else if (nx == Cnd_ar_dpt_cd) doCnd_ar_dpt_cd_NX(info);
		else if (nx == Cnd_ar_dpt_nm) doCnd_ar_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_ar_typ) doCnd_ar_typ_NX(info);
		else if (nx == Cnd_ar_typ_nm) doCnd_ar_typ_nm_NX(info);
		else if (nx == Cnd_not_bill_inc_flg) doCnd_not_bill_inc_flg_NX(info);
		else if (nx == Cnd_amt_dec_place) doCnd_amt_dec_place_NX(info);
		else if (nx == Cnd_upri_dec_place) doCnd_upri_dec_place_NX(info);
		else if (nx == columnSwFr_check) doSwFr_check_NX(info);
		else if (nx == columnSwFr_acst_cd) doSwFr_acst_cd_NX(info);
		else if (nx == columnSwFr_acst_nm) doSwFr_acst_nm_NX(info);
		else if (nx == columnSwFr_ar_dpt_cd) doSwFr_ar_dpt_cd_NX(info);
		else if (nx == columnSwFr_ar_dpt_nm) doSwFr_ar_dpt_nm_NX(info);
		else if (nx == columnSwFr_bill_dpt_cd) doSwFr_bill_dpt_cd_NX(info);
		else if (nx == columnSwFr_bill_dpt_nm) doSwFr_bill_dpt_nm_NX(info);
		else if (nx == columnSwFr_slip_sts_typ_nm) doSwFr_slip_sts_typ_nm_NX(info);
		else if (nx == columnSwFr_trd_cd) doSwFr_trd_cd_NX(info);
		else if (nx == columnSwFr_trd_nm) doSwFr_trd_nm_NX(info);
		else if (nx == columnSwFr_act_no) doSwFr_act_no_NX(info);
		else if (nx == columnSwFr_act_rev) doSwFr_act_rev_NX(info);
		else if (nx == columnSwFr_act_d_no) doSwFr_act_d_no_NX(info);
		else if (nx == columnSwFr_wrk_no) doSwFr_wrk_no_NX(info);
		else if (nx == columnSwFr_wrk_nm) doSwFr_wrk_nm_NX(info);
		else if (nx == columnSwFr_sls_wrk_no) doSwFr_sls_wrk_no_NX(info);
		else if (nx == columnSwFr_sls_wrk_nm) doSwFr_sls_wrk_nm_NX(info);
		else if (nx == columnSwFr_ar_typ) doSwFr_ar_typ_NX(info);
		else if (nx == columnSwFr_ar_typ_nm) doSwFr_ar_typ_nm_NX(info);
		else if (nx == columnSwFr_xrate) doSwFr_xrate_NX(info);
		else if (nx == columnSwFr_ac_ym) doSwFr_ac_ym_NX(info);
		else if (nx == columnSwFr_ac_dt) doSwFr_ac_dt_NX(info);
		else if (nx == columnSwFr_dlv_dt) doSwFr_dlv_dt_NX(info);
		else if (nx == columnSwFr_bill_ym) doSwFr_bill_ym_NX(info);
		else if (nx == columnSwFr_bill_cl_day) doSwFr_bill_cl_day_NX(info);
		else if (nx == columnSwFr_bill_dt) doSwFr_bill_dt_NX(info);
		else if (nx == columnSwFr_bill_no) doSwFr_bill_no_NX(info);
		else if (nx == columnSwFr_iv_no) doSwFr_iv_no_NX(info);
		else if (nx == columnSwFr_cst_cd) doSwFr_cst_cd_NX(info);
		else if (nx == columnSwFr_cst_nm) doSwFr_cst_nm_NX(info);
		else if (nx == columnSwFr_dlv_cd) doSwFr_dlv_cd_NX(info);
		else if (nx == columnSwFr_dlv_nm) doSwFr_dlv_nm_NX(info);
		else if (nx == columnSwFr_dest_cd1) doSwFr_dest_cd1_NX(info);
		else if (nx == columnSwFr_dest_nm1) doSwFr_dest_nm1_NX(info);
		else if (nx == columnSwFr_dest_cd2) doSwFr_dest_cd2_NX(info);
		else if (nx == columnSwFr_dest_nm2) doSwFr_dest_nm2_NX(info);
		else if (nx == columnSwFr_dest_cd3) doSwFr_dest_cd3_NX(info);
		else if (nx == columnSwFr_dest_nm3) doSwFr_dest_nm3_NX(info);
		else if (nx == columnSwFr_sls_usr_cd) doSwFr_sls_usr_cd_NX(info);
		else if (nx == columnSwFr_sls_usr_nm) doSwFr_sls_usr_nm_NX(info);
		else if (nx == columnSwFr_sls_dpt_cd) doSwFr_sls_dpt_cd_NX(info);
		else if (nx == columnSwFr_sls_dpt_nm) doSwFr_sls_dpt_nm_NX(info);
		else if (nx == columnSwFr_slo_no) doSwFr_slo_no_NX(info);
		else if (nx == columnSwFr_slo_d_no) doSwFr_slo_d_no_NX(info);
		else if (nx == columnSwFr_cst_po_no) doSwFr_cst_po_no_NX(info);
		else if (nx == columnSwFr_cst_po_d_no) doSwFr_cst_po_d_no_NX(info);
		else if (nx == columnSwFr_dlv_slip_no) doSwFr_dlv_slip_no_NX(info);
		else if (nx == columnSwFr_dlv_slip_d_no) doSwFr_dlv_slip_d_no_NX(info);
		else if (nx == columnSwFr_ship_dlv_slip_no) doSwFr_ship_dlv_slip_no_NX(info);
		else if (nx == columnSwFr_ship_dlv_slip_d_no) doSwFr_ship_dlv_slip_d_no_NX(info);
		else if (nx == columnSwFr_ship_dlv_slip_multi_flg) doSwFr_ship_dlv_slip_multi_flg_NX(info);
		else if (nx == columnSwFr_bill_flg) doSwFr_bill_flg_NX(info);
		else if (nx == columnSwFr_trd_cur_cd) doSwFr_trd_cur_cd_NX(info);
		else if (nx == columnSwFr_amt_dec_place) doSwFr_amt_dec_place_NX(info);
		else if (nx == columnSwFr_upri_dec_place) doSwFr_upri_dec_place_NX(info);
		else if (nx == Sw_sw_dt) doSw_sw_dt_NX(info);
		else if (nx == Sw_ac_dt) doSw_ac_dt_NX(info);
		else if (nx == Sw_bill_basis_dt) doSw_bill_basis_dt_NX(info);
		else if (nx == Sw_trd_cd) doSw_trd_cd_NX(info);
		else if (nx == Sw_trd_nm) doSw_trd_nm_NX(info);
		else if (nx == Sw_trd_ptn_typ) doSw_trd_ptn_typ_NX(info);
		else if (nx == Sw_trd_rmrks) doSw_trd_rmrks_NX(info);
		else if (nx == Sw_sub_char1) doSw_sub_char1_NX(info);
		else if (nx == Sw_sub_char2) doSw_sub_char2_NX(info);
		else if (nx == Sw_sub_char3) doSw_sub_char3_NX(info);
		else if (nx == SwTo_acst_cd) doSwTo_acst_cd_NX(info);
		else if (nx == SwTo_acst_nm) doSwTo_acst_nm_NX(info);
		else if (nx == SwTo_ar_dpt_cd) doSwTo_ar_dpt_cd_NX(info);
		else if (nx == SwTo_ar_dpt_nm) doSwTo_ar_dpt_nm_NX(info);
		else if (nx == SwTo_bcst_cd) doSwTo_bcst_cd_NX(info);
		else if (nx == SwTo_bcst_nm) doSwTo_bcst_nm_NX(info);
		else if (nx == SwTo_bill_dpt_cd) doSwTo_bill_dpt_cd_NX(info);
		else if (nx == SwTo_bill_dpt_nm) doSwTo_bill_dpt_nm_NX(info);
		else if (nx == SwTo_wrk_ope_typ) doSwTo_wrk_ope_typ_NX(info);
		else if (nx == SwTo_wrk_ope_typ_nm) doSwTo_wrk_ope_typ_nm_NX(info);
		else if (nx == SwTo_trd_cur_cd) doSwTo_trd_cur_cd_NX(info);
		else if (nx == SwTo_trd_cur_nm) doSwTo_trd_cur_nm_NX(info);
		else if (nx == SwTo_amt_dec_place) doSwTo_amt_dec_place_NX(info);
		else if (nx == SwTo_upri_dec_place) doSwTo_upri_dec_place_NX(info);
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
	 * [Cnd]パネルの[bcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[bill_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ar_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_bill_inc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_bill_inc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_check_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[acst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_acst_cd_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[acst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_acst_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ar_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ar_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ar_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ar_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_dpt_nm_NX(MCEventInfo info){
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
	 * [SwFr]パネルの[sls_wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sls_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sls_wrk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sls_wrk_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ar_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ar_typ_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ar_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ar_typ_nm_NX(MCEventInfo info){
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
	 * [SwFr]パネルの[dlv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dlv_dt_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_ym_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_cl_day]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_cl_day_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_dt_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dest_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dest_cd1_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dest_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dest_nm1_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dest_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dest_cd2_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dest_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dest_nm2_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dest_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dest_cd3_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dest_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dest_nm3_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sls_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sls_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sls_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sls_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sls_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sls_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sls_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sls_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[cst_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_cst_po_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[cst_po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_cst_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ship_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ship_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ship_dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ship_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ship_dlv_slip_multi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ship_dlv_slip_multi_flg_NX(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_flg_NX(MCEventInfo info){
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
	 * [SwFr]パネルの[upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_upri_dec_place_NX(MCEventInfo info){
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
	 * [Sw]パネルの[bill_basis_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_bill_basis_dt_NX(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_trd_ptn_typ_NX(MCEventInfo info){
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
	 * [SwTo]パネルの[acst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_acst_cd_NX(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[acst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_acst_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[ar_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_ar_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[ar_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_ar_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bill_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bill_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bill_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bill_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[wrk_ope_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_wrk_ope_typ_NX(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[wrk_ope_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_wrk_ope_typ_nm_NX(MCEventInfo info){
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
	 * [SwTo]パネルの[upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_bcst_cd) doCnd_bcst_cd_LC(info);
		else if (lc == Cnd_bcst_nm) doCnd_bcst_nm_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
		else if (lc == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_LC(info);
		else if (lc == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_LC(info);
		else if (lc == Cnd_acst_cd) doCnd_acst_cd_LC(info);
		else if (lc == Cnd_acst_nm) doCnd_acst_nm_LC(info);
		else if (lc == Cnd_ar_dpt_cd) doCnd_ar_dpt_cd_LC(info);
		else if (lc == Cnd_ar_dpt_nm) doCnd_ar_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_ar_typ) doCnd_ar_typ_LC(info);
		else if (lc == Cnd_ar_typ_nm) doCnd_ar_typ_nm_LC(info);
		else if (lc == Cnd_amt_dec_place) doCnd_amt_dec_place_LC(info);
		else if (lc == Cnd_upri_dec_place) doCnd_upri_dec_place_LC(info);
		else if (lc == columnSwFr_acst_cd) doSwFr_acst_cd_LC(info);
		else if (lc == columnSwFr_acst_nm) doSwFr_acst_nm_LC(info);
		else if (lc == columnSwFr_ar_dpt_cd) doSwFr_ar_dpt_cd_LC(info);
		else if (lc == columnSwFr_ar_dpt_nm) doSwFr_ar_dpt_nm_LC(info);
		else if (lc == columnSwFr_bill_dpt_cd) doSwFr_bill_dpt_cd_LC(info);
		else if (lc == columnSwFr_bill_dpt_nm) doSwFr_bill_dpt_nm_LC(info);
		else if (lc == columnSwFr_slip_sts_typ_nm) doSwFr_slip_sts_typ_nm_LC(info);
		else if (lc == columnSwFr_trd_cd) doSwFr_trd_cd_LC(info);
		else if (lc == columnSwFr_trd_nm) doSwFr_trd_nm_LC(info);
		else if (lc == columnSwFr_act_no) doSwFr_act_no_LC(info);
		else if (lc == columnSwFr_act_rev) doSwFr_act_rev_LC(info);
		else if (lc == columnSwFr_act_d_no) doSwFr_act_d_no_LC(info);
		else if (lc == columnSwFr_wrk_no) doSwFr_wrk_no_LC(info);
		else if (lc == columnSwFr_wrk_nm) doSwFr_wrk_nm_LC(info);
		else if (lc == columnSwFr_sls_wrk_no) doSwFr_sls_wrk_no_LC(info);
		else if (lc == columnSwFr_sls_wrk_nm) doSwFr_sls_wrk_nm_LC(info);
		else if (lc == columnSwFr_ar_typ) doSwFr_ar_typ_LC(info);
		else if (lc == columnSwFr_ar_typ_nm) doSwFr_ar_typ_nm_LC(info);
		else if (lc == columnSwFr_xrate) doSwFr_xrate_LC(info);
		else if (lc == columnSwFr_ac_ym) doSwFr_ac_ym_LC(info);
		else if (lc == columnSwFr_ac_dt) doSwFr_ac_dt_LC(info);
		else if (lc == columnSwFr_dlv_dt) doSwFr_dlv_dt_LC(info);
		else if (lc == columnSwFr_bill_ym) doSwFr_bill_ym_LC(info);
		else if (lc == columnSwFr_bill_cl_day) doSwFr_bill_cl_day_LC(info);
		else if (lc == columnSwFr_bill_dt) doSwFr_bill_dt_LC(info);
		else if (lc == columnSwFr_bill_no) doSwFr_bill_no_LC(info);
		else if (lc == columnSwFr_iv_no) doSwFr_iv_no_LC(info);
		else if (lc == columnSwFr_cst_cd) doSwFr_cst_cd_LC(info);
		else if (lc == columnSwFr_cst_nm) doSwFr_cst_nm_LC(info);
		else if (lc == columnSwFr_dlv_cd) doSwFr_dlv_cd_LC(info);
		else if (lc == columnSwFr_dlv_nm) doSwFr_dlv_nm_LC(info);
		else if (lc == columnSwFr_dest_cd1) doSwFr_dest_cd1_LC(info);
		else if (lc == columnSwFr_dest_nm1) doSwFr_dest_nm1_LC(info);
		else if (lc == columnSwFr_dest_cd2) doSwFr_dest_cd2_LC(info);
		else if (lc == columnSwFr_dest_nm2) doSwFr_dest_nm2_LC(info);
		else if (lc == columnSwFr_dest_cd3) doSwFr_dest_cd3_LC(info);
		else if (lc == columnSwFr_dest_nm3) doSwFr_dest_nm3_LC(info);
		else if (lc == columnSwFr_sls_usr_cd) doSwFr_sls_usr_cd_LC(info);
		else if (lc == columnSwFr_sls_usr_nm) doSwFr_sls_usr_nm_LC(info);
		else if (lc == columnSwFr_sls_dpt_cd) doSwFr_sls_dpt_cd_LC(info);
		else if (lc == columnSwFr_sls_dpt_nm) doSwFr_sls_dpt_nm_LC(info);
		else if (lc == columnSwFr_slo_no) doSwFr_slo_no_LC(info);
		else if (lc == columnSwFr_slo_d_no) doSwFr_slo_d_no_LC(info);
		else if (lc == columnSwFr_cst_po_no) doSwFr_cst_po_no_LC(info);
		else if (lc == columnSwFr_cst_po_d_no) doSwFr_cst_po_d_no_LC(info);
		else if (lc == columnSwFr_dlv_slip_no) doSwFr_dlv_slip_no_LC(info);
		else if (lc == columnSwFr_dlv_slip_d_no) doSwFr_dlv_slip_d_no_LC(info);
		else if (lc == columnSwFr_ship_dlv_slip_no) doSwFr_ship_dlv_slip_no_LC(info);
		else if (lc == columnSwFr_ship_dlv_slip_d_no) doSwFr_ship_dlv_slip_d_no_LC(info);
		else if (lc == columnSwFr_trd_cur_cd) doSwFr_trd_cur_cd_LC(info);
		else if (lc == columnSwFr_amt_dec_place) doSwFr_amt_dec_place_LC(info);
		else if (lc == columnSwFr_upri_dec_place) doSwFr_upri_dec_place_LC(info);
		else if (lc == Sw_sw_dt) doSw_sw_dt_LC(info);
		else if (lc == Sw_ac_dt) doSw_ac_dt_LC(info);
		else if (lc == Sw_bill_basis_dt) doSw_bill_basis_dt_LC(info);
		else if (lc == Sw_trd_cd) doSw_trd_cd_LC(info);
		else if (lc == Sw_trd_nm) doSw_trd_nm_LC(info);
		else if (lc == Sw_trd_ptn_typ) doSw_trd_ptn_typ_LC(info);
		else if (lc == Sw_trd_rmrks) doSw_trd_rmrks_LC(info);
		else if (lc == Sw_sub_char1) doSw_sub_char1_LC(info);
		else if (lc == Sw_sub_char2) doSw_sub_char2_LC(info);
		else if (lc == Sw_sub_char3) doSw_sub_char3_LC(info);
		else if (lc == SwTo_acst_cd) doSwTo_acst_cd_LC(info);
		else if (lc == SwTo_acst_nm) doSwTo_acst_nm_LC(info);
		else if (lc == SwTo_ar_dpt_cd) doSwTo_ar_dpt_cd_LC(info);
		else if (lc == SwTo_ar_dpt_nm) doSwTo_ar_dpt_nm_LC(info);
		else if (lc == SwTo_bcst_cd) doSwTo_bcst_cd_LC(info);
		else if (lc == SwTo_bcst_nm) doSwTo_bcst_nm_LC(info);
		else if (lc == SwTo_bill_dpt_cd) doSwTo_bill_dpt_cd_LC(info);
		else if (lc == SwTo_bill_dpt_nm) doSwTo_bill_dpt_nm_LC(info);
		else if (lc == SwTo_wrk_ope_typ) doSwTo_wrk_ope_typ_LC(info);
		else if (lc == SwTo_wrk_ope_typ_nm) doSwTo_wrk_ope_typ_nm_LC(info);
		else if (lc == SwTo_trd_cur_cd) doSwTo_trd_cur_cd_LC(info);
		else if (lc == SwTo_trd_cur_nm) doSwTo_trd_cur_nm_LC(info);
		else if (lc == SwTo_amt_dec_place) doSwTo_amt_dec_place_LC(info);
		else if (lc == SwTo_upri_dec_place) doSwTo_upri_dec_place_LC(info);
	}

	/**
	 * [Cnd]パネルの[bcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[bill_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ar_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[acst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_acst_cd_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[acst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_acst_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ar_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ar_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ar_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ar_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_dpt_nm_LC(MCEventInfo info){
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
	 * [SwFr]パネルの[sls_wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sls_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sls_wrk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sls_wrk_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ar_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ar_typ_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ar_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ar_typ_nm_LC(MCEventInfo info){
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
	 * [SwFr]パネルの[dlv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dlv_dt_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_ym_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_cl_day]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_cl_day_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_dt_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_bill_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dest_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dest_cd1_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dest_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dest_nm1_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dest_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dest_cd2_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dest_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dest_nm2_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dest_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dest_cd3_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dest_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dest_nm3_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sls_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sls_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sls_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sls_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sls_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sls_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[sls_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_sls_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[cst_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_cst_po_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[cst_po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_cst_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ship_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ship_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [SwFr]パネルの[ship_dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_ship_dlv_slip_d_no_LC(MCEventInfo info){
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
	 * [SwFr]パネルの[upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwFr_upri_dec_place_LC(MCEventInfo info){
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
	 * [Sw]パネルの[bill_basis_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_bill_basis_dt_LC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Sw]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSw_trd_ptn_typ_LC(MCEventInfo info){
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
	 * [SwTo]パネルの[acst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_acst_cd_LC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[acst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_acst_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[ar_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_ar_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[ar_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_ar_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bill_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bill_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[bill_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_bill_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[wrk_ope_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_wrk_ope_typ_LC(MCEventInfo info){
	}

	/**
	 * [SwTo]パネルの[wrk_ope_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_wrk_ope_typ_nm_LC(MCEventInfo info){
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
	 * [SwTo]パネルの[upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSwTo_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_bcst_cd]の作成メソッド
	 */
	public MCList getCnd_bcst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_trd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bill_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_bill_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_acst_cd]の作成メソッド
	 */
	public MCList getCnd_acst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ar_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_ar_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ar_typ]の作成メソッド
	 */
	public MCList getCnd_ar_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Sw_trd_cd]の作成メソッド
	 */
	public MCList getSw_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Sw_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getSw_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[SwTo_acst_cd]の作成メソッド
	 */
	public MCList getSwTo_acst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[SwTo_ar_dpt_cd]の作成メソッド
	 */
	public MCList getSwTo_ar_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[SwTo_bill_dpt_cd]の作成メソッド
	 */
	public MCList getSwTo_bill_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[SwTo_wrk_ope_typ]の作成メソッド
	 */
	public MCList getSwTo_wrk_ope_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getWrkOpeTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBGL0240.Srch01")) {
			return new MS_MSBGL0240_Srch01Bridge();
		}
		if (id.equals("MS.MSBGL0240.Srch02")) {
			return new MS_MSBGL0240_Srch02Bridge();
		}
		if (id.equals("MS.MSBGL0240.Upd01")) {
			return new MS_MSBGL0240_Upd01Bridge();
		}
		if (id.equals("MS.MSBGL0240.Upd02")) {
			return new MS_MSBGL0240_Upd02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBGL0240_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0240_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0240_Srch01;

		/** コンストラクタ */
		protected MS_MSBGL0240_Srch01Bridge() {
			p_MS_MSBGL0240_Srch01 = new MCParam(PDef.MS_MSBGL0240_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0240_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0240.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0240.SwFrR.class));
			param.addDownBlock(mcframe.clientMSBG.MSBGP0240.SwR.create());

			p_MS_MSBGL0240_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0240_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0240_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0240_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0240_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0240.CndR up0() {
			return (mcframe.clientMSBG.MSBGP0240.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBG.MSBGP0240.SwFrR> down0() {
			return (MCList<mcframe.clientMSBG.MSBGP0240.SwFrR>)down(0);
		}
		protected mcframe.clientMSBG.MSBGP0240.SwR down1() {
			return (mcframe.clientMSBG.MSBGP0240.SwR)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0240_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0240.SwFrR.class));
			p_MS_MSBGL0240_Srch01.addDownBlock(mcframe.clientMSBG.MSBGP0240.SwR.create());
		}
		protected MCParam param() {
			return p_MS_MSBGL0240_Srch01;
		}

		protected void show() {
			setSwFrL((MCList<mcframe.clientMSBG.MSBGP0240.SwFrR>)p_MS_MSBGL0240_Srch01.getContainerParam().getDownBlock(0));
			setSwR((mcframe.clientMSBG.MSBGP0240.SwR)p_MS_MSBGL0240_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getSwFrL().clear();
			getSwR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getSwFrL());
			result.add(getSwR());
			return result;
		}
	}
	/**
	 * [MS_MSBGL0240_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0240_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0240_Srch02;

		/** コンストラクタ */
		protected MS_MSBGL0240_Srch02Bridge() {
			p_MS_MSBGL0240_Srch02 = new MCParam(PDef.MS_MSBGL0240_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0240_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0240.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0240.SwFrR.class));
			param.addDownBlock(mcframe.clientMSBG.MSBGP0240.SwR.create());

			p_MS_MSBGL0240_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0240_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0240_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0240_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0240_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0240.CndR up0() {
			return (mcframe.clientMSBG.MSBGP0240.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBG.MSBGP0240.SwFrR> down0() {
			return (MCList<mcframe.clientMSBG.MSBGP0240.SwFrR>)down(0);
		}
		protected mcframe.clientMSBG.MSBGP0240.SwR down1() {
			return (mcframe.clientMSBG.MSBGP0240.SwR)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0240_Srch02.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0240.SwFrR.class));
			p_MS_MSBGL0240_Srch02.addDownBlock(mcframe.clientMSBG.MSBGP0240.SwR.create());
		}
		protected MCParam param() {
			return p_MS_MSBGL0240_Srch02;
		}

		protected void show() {
			setSwFrL((MCList<mcframe.clientMSBG.MSBGP0240.SwFrR>)p_MS_MSBGL0240_Srch02.getContainerParam().getDownBlock(0));
			setSwR((mcframe.clientMSBG.MSBGP0240.SwR)p_MS_MSBGL0240_Srch02.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getSwFrL().clear();
			getSwR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getSwFrL());
			result.add(getSwR());
			return result;
		}
	}
	/**
	 * [MS_MSBGL0240_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0240_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0240_Upd01;

		/** コンストラクタ */
		protected MS_MSBGL0240_Upd01Bridge() {
			p_MS_MSBGL0240_Upd01 = new MCParam(PDef.MS_MSBGL0240_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0240_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBG.MSBGP0240.SwFrR.class));
			param.addUpBlock(mcframe.clientMSBG.MSBGP0240.SwR.create());
			param.addUpBlock(mcframe.clientMSBG.MSBGP0240.SwToR.create());
			// Down

			p_MS_MSBGL0240_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0240_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0240_Upd01.addUpBlock(getSwFrL().shallowClone());
			p_MS_MSBGL0240_Upd01.addUpBlock(getSwR());
			p_MS_MSBGL0240_Upd01.addUpBlock(getSwToR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0240_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0240_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBG.MSBGP0240.SwFrR> up0() {
			return (MCList<mcframe.clientMSBG.MSBGP0240.SwFrR>)up(0);
		}
		protected mcframe.clientMSBG.MSBGP0240.SwR up1() {
			return (mcframe.clientMSBG.MSBGP0240.SwR)up(1);
		}
		protected mcframe.clientMSBG.MSBGP0240.SwToR up2() {
			return (mcframe.clientMSBG.MSBGP0240.SwToR)up(2);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBGL0240_Upd01;
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
	 * [MS_MSBGL0240_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0240_Upd02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0240_Upd02;

		/** コンストラクタ */
		protected MS_MSBGL0240_Upd02Bridge() {
			p_MS_MSBGL0240_Upd02 = new MCParam(PDef.MS_MSBGL0240_Upd02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0240_Upd02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBG.MSBGP0240.SwFrR.class));
			param.addUpBlock(mcframe.clientMSBG.MSBGP0240.SwR.create());
			param.addUpBlock(mcframe.clientMSBG.MSBGP0240.SwToR.create());
			// Down

			p_MS_MSBGL0240_Upd02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0240_Upd02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0240_Upd02.addUpBlock(getSwFrL().shallowClone());
			p_MS_MSBGL0240_Upd02.addUpBlock(getSwR());
			p_MS_MSBGL0240_Upd02.addUpBlock(getSwToR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0240_Upd02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0240_Upd02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBG.MSBGP0240.SwFrR> up0() {
			return (MCList<mcframe.clientMSBG.MSBGP0240.SwFrR>)up(0);
		}
		protected mcframe.clientMSBG.MSBGP0240.SwR up1() {
			return (mcframe.clientMSBG.MSBGP0240.SwR)up(1);
		}
		protected mcframe.clientMSBG.MSBGP0240.SwToR up2() {
			return (mcframe.clientMSBG.MSBGP0240.SwToR)up(2);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBGL0240_Upd02;
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