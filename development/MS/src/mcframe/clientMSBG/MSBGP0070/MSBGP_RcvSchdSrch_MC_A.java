package mcframe.clientMSBG.MSBGP0070;

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
import mcframe.clientMSBG.MSBGP0070.MSBGP_RcvSchdSrch_MC.MS_MSBGL0070_Srch01Caller;

/**
 * 画面"MSBGP_RcvSchdSrch"パネルクラスです。<p>
 *
 * 入金予定を照会します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGP_RcvSchdSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBGP0070";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Fold]ブロック関連のField定義
	public MCPanel FoldPanel = null;
	public MCTabbedPane FoldTab = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Tab1]ブロック関連のField定義
	public MCPanel Tab1Panel = null;
	// [Tab1]ブロックの項目のField定義
	// [RcvSchdAdjst]ブロック関連のField定義
	public MCPanel RcvSchdAdjstPanel = null;
	public MCTitledBorder RcvSchdAdjstTitledBorder = null;
	// [RcvSchdAdjst]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [BcstCnd]ブロック関連のField定義
	public MCPanel BcstCndPanel = null;
	// [BcstCnd]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * Not adjusted 未調整.<p>
	 *
	 */
	public MCCheckBox Cnd_not_adjst_flg = null;
	/**
	 * Adjusted 調整済.<p>
	 *
	 */
	public MCCheckBox Cnd_adjst_flg = null;
	public MCLabel Cnd_schd_act_rcv_dt_fr_Label = null;
	/**
	 * Scheduled/Actual payment receipt date FROM 入金予定日／実績日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_schd_act_rcv_dt_fr = null;
	public MCLabel Cnd_schd_act_rcv_dt_to_Label = null;
	/**
	 * Scheduled/Actual payment receipt date TO 入金予定日／実績日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_schd_act_rcv_dt_to = null;
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
	public MCLabel Cnd_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_wg_nm = null;
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
	public MCLabel Cnd_bill_no_Label = null;
	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_bill_no = null;
	public MCLabel Cnd_iv_no_Label = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_iv_no = null;
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Cnd_wrk_no_p_PPanel;
	public MCTextField Cnd_wrk_no;	// [Cnd]の[wrk_no_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[wrk_no_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_rcst_cd_Label = null;
	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_rcst_cd = null;
	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public MCTextField Cnd_rcst_nm = null;
	/**
	 * Display breakdown 内訳表示.<p>
	 *
	 */
	public MCCheckBox Cnd_dtl_flg = null;
	/**
	 * Include payment received 入金済含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_appl_flg = null;
	/**
	 * Include unbilled 未請求含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_not_cl_flg = null;
	/**
	 * Only for target of payment receipt schedule adjustment 入金予定調整対象のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_rcv_schd_adjst_flg = null;
	public MCLabel Cnd_rfrnc_dt_Label = null;
	/**
	 * Delay check base date 遅延確認基準日.<p>
	 *
	 */
	public MCDateField Cnd_rfrnc_dt = null;
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_bcst_grp_p_PPanel;
	public MCLabel Cnd_bcst_grp_lab1;	// [Cnd]の[bcst_grp_p.bp_grp_lab1]を[Cnd_bcst_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg1;	// [Cnd]の[bcst_grp_p.bp_grp_flg1]を[Cnd_bcst_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd1;	// [Cnd]の[bcst_grp_p.bp_grp_cd1]を[Cnd_bcst_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm1;	// [Cnd]の[bcst_grp_p.bp_grp_nm1]を[Cnd_bcst_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab2;	// [Cnd]の[bcst_grp_p.bp_grp_lab2]を[Cnd_bcst_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg2;	// [Cnd]の[bcst_grp_p.bp_grp_flg2]を[Cnd_bcst_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd2;	// [Cnd]の[bcst_grp_p.bp_grp_cd2]を[Cnd_bcst_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm2;	// [Cnd]の[bcst_grp_p.bp_grp_nm2]を[Cnd_bcst_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab3;	// [Cnd]の[bcst_grp_p.bp_grp_lab3]を[Cnd_bcst_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg3;	// [Cnd]の[bcst_grp_p.bp_grp_flg3]を[Cnd_bcst_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd3;	// [Cnd]の[bcst_grp_p.bp_grp_cd3]を[Cnd_bcst_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm3;	// [Cnd]の[bcst_grp_p.bp_grp_nm3]を[Cnd_bcst_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab4;	// [Cnd]の[bcst_grp_p.bp_grp_lab4]を[Cnd_bcst_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg4;	// [Cnd]の[bcst_grp_p.bp_grp_flg4]を[Cnd_bcst_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd4;	// [Cnd]の[bcst_grp_p.bp_grp_cd4]を[Cnd_bcst_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm4;	// [Cnd]の[bcst_grp_p.bp_grp_nm4]を[Cnd_bcst_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab5;	// [Cnd]の[bcst_grp_p.bp_grp_lab5]を[Cnd_bcst_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg5;	// [Cnd]の[bcst_grp_p.bp_grp_flg5]を[Cnd_bcst_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd5;	// [Cnd]の[bcst_grp_p.bp_grp_cd5]を[Cnd_bcst_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm5;	// [Cnd]の[bcst_grp_p.bp_grp_nm5]を[Cnd_bcst_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab6;	// [Cnd]の[bcst_grp_p.bp_grp_lab6]を[Cnd_bcst_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg6;	// [Cnd]の[bcst_grp_p.bp_grp_flg6]を[Cnd_bcst_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd6;	// [Cnd]の[bcst_grp_p.bp_grp_cd6]を[Cnd_bcst_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm6;	// [Cnd]の[bcst_grp_p.bp_grp_nm6]を[Cnd_bcst_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab7;	// [Cnd]の[bcst_grp_p.bp_grp_lab7]を[Cnd_bcst_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg7;	// [Cnd]の[bcst_grp_p.bp_grp_flg7]を[Cnd_bcst_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd7;	// [Cnd]の[bcst_grp_p.bp_grp_cd7]を[Cnd_bcst_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm7;	// [Cnd]の[bcst_grp_p.bp_grp_nm7]を[Cnd_bcst_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab8;	// [Cnd]の[bcst_grp_p.bp_grp_lab8]を[Cnd_bcst_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg8;	// [Cnd]の[bcst_grp_p.bp_grp_flg8]を[Cnd_bcst_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd8;	// [Cnd]の[bcst_grp_p.bp_grp_cd8]を[Cnd_bcst_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm8;	// [Cnd]の[bcst_grp_p.bp_grp_nm8]を[Cnd_bcst_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab9;	// [Cnd]の[bcst_grp_p.bp_grp_lab9]を[Cnd_bcst_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg9;	// [Cnd]の[bcst_grp_p.bp_grp_flg9]を[Cnd_bcst_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd9;	// [Cnd]の[bcst_grp_p.bp_grp_cd9]を[Cnd_bcst_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm9;	// [Cnd]の[bcst_grp_p.bp_grp_nm9]を[Cnd_bcst_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_bcst_grp_lab10;	// [Cnd]の[bcst_grp_p.bp_grp_lab10]を[Cnd_bcst_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_bcst_grp_flg10;	// [Cnd]の[bcst_grp_p.bp_grp_flg10]を[Cnd_bcst_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_bcst_grp_cd10;	// [Cnd]の[bcst_grp_p.bp_grp_cd10]を[Cnd_bcst_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_bcst_grp_nm10;	// [Cnd]の[bcst_grp_p.bp_grp_nm10]を[Cnd_bcst_grp_nm10]としてエイリアス定義。
	/**
	 * Display key column キー項目表示.<p>
	 *
	 */
	public MCCheckBox Cnd_key_flg = null;
	// [LPnl]ブロック関連のField定義
	public MCPanel LPnlPanel = null;
	// [LPnl]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [RPnl]ブロック関連のField定義
	public MCPanel RPnlPanel = null;
	// [RPnl]ブロックの項目のField定義
	/**
	 * Download ダウンロードする.<p>
	 *
	 */
	public MCButton RPnl_dwnld = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBG.MSBGP0070.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_dpt_cd = null;
	/**
	 * Billing dept. name 請求部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_dpt_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_nm = null;
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bcst_cd = null;
	/**
	 * Billing customer name 請求先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bcst_nm = null;
	/**
	 * Scheduled/Actual payment receipt date 入金予定日／実績日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_act_rcv_dt = null;
	/**
	 * Payment received method cd. 入金方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_mtd_cd = null;
	/**
	 * Payment received method name 入金方法名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_mtd_nm = null;
	/**
	 * Payment received type 入金区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_typ = null;
	public MCColumnConfig columnRslt_rcv_reg_typ = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_rcv_schd_amt_p_PPanel;
	public MCColumnConfig columnRslt_rcv_schd_amt;// [Rslt]の[rcv_schd_amt_p.amt]を[columnRslt_rcv_schd_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_rcv_act_amt_p_PPanel;
	public MCColumnConfig columnRslt_rcv_act_amt;// [Rslt]の[rcv_act_amt_p.amt]を[columnRslt_rcv_act_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_not_appl_bal_p_PPanel;
	public MCColumnConfig columnRslt_not_appl_bal;// [Rslt]の[not_appl_bal_p.amt]を[columnRslt_not_appl_bal]としてエイリアス定義。
	/**
	 * Delay 遅延.<p>
	 *
	 */
	public MCColumnConfig columnRslt_delay = null;
	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_ym = null;
	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_cl_day = null;
	/**
	 * Billing closing date 請求締処理日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_dt = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_nm = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt_dec_place = null;
	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_no = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_no = null;
	public mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D Rslt_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcst_cd = null;
	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcst_nm = null;
	/**
	 * For target of payment receipt schedule adjustment 入金予定調整対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_schd_adjst_flg = null;
	/**
	 * Adjusted 調整済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_adjst_flg = null;
	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_mng_no = null;
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_bcst_grp_p_PPanel;
	public MCColumnConfig columnRslt_bcst_grp_cd1;// [Rslt]の[bcst_grp_p.bp_grp_cd1]を[columnRslt_bcst_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_nm1;// [Rslt]の[bcst_grp_p.bp_grp_nm1]を[columnRslt_bcst_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_cd2;// [Rslt]の[bcst_grp_p.bp_grp_cd2]を[columnRslt_bcst_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_nm2;// [Rslt]の[bcst_grp_p.bp_grp_nm2]を[columnRslt_bcst_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_cd3;// [Rslt]の[bcst_grp_p.bp_grp_cd3]を[columnRslt_bcst_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_nm3;// [Rslt]の[bcst_grp_p.bp_grp_nm3]を[columnRslt_bcst_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_cd4;// [Rslt]の[bcst_grp_p.bp_grp_cd4]を[columnRslt_bcst_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_nm4;// [Rslt]の[bcst_grp_p.bp_grp_nm4]を[columnRslt_bcst_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_cd5;// [Rslt]の[bcst_grp_p.bp_grp_cd5]を[columnRslt_bcst_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_nm5;// [Rslt]の[bcst_grp_p.bp_grp_nm5]を[columnRslt_bcst_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_cd6;// [Rslt]の[bcst_grp_p.bp_grp_cd6]を[columnRslt_bcst_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_nm6;// [Rslt]の[bcst_grp_p.bp_grp_nm6]を[columnRslt_bcst_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_cd7;// [Rslt]の[bcst_grp_p.bp_grp_cd7]を[columnRslt_bcst_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_nm7;// [Rslt]の[bcst_grp_p.bp_grp_nm7]を[columnRslt_bcst_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_cd8;// [Rslt]の[bcst_grp_p.bp_grp_cd8]を[columnRslt_bcst_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_nm8;// [Rslt]の[bcst_grp_p.bp_grp_nm8]を[columnRslt_bcst_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_cd9;// [Rslt]の[bcst_grp_p.bp_grp_cd9]を[columnRslt_bcst_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_nm9;// [Rslt]の[bcst_grp_p.bp_grp_nm9]を[columnRslt_bcst_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_cd10;// [Rslt]の[bcst_grp_p.bp_grp_cd10]を[columnRslt_bcst_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_bcst_grp_nm10;// [Rslt]の[bcst_grp_p.bp_grp_nm10]を[columnRslt_bcst_grp_nm10]としてエイリアス定義。
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Payment receipt schedule adjustment 入金予定調整.<p>
	 *
	 */
	public MCButton Btn_open_MSBGP0080 = null;
	/**
	 * Payment received entry 入金登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBGP0140 = null;
	/**
	 * AR reconciliation entry 売掛消込登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBGP0210 = null;
	/**
	 * Incomplete AR details 未消込売掛明細.<p>
	 *
	 */
	public MCButton Btn_open_MSBGP0120 = null;
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
	
	/** [MS_MSBGL0070_Srch01]のCallerの作成 */
	protected MSBGP_RcvSchdSrch_MC.MS_MSBGL0070_Srch01Caller createMS_MSBGL0070_Srch01() {
		MSBGP_RcvSchdSrch_MC.MS_MSBGL0070_Srch01Caller<MSBGP_RcvSchdSrch, MS_MSBGL0070_Srch01Bridge>
		caller = ((MSBGP_RcvSchdSrch_MC)this).new MS_MSBGL0070_Srch01Caller<MSBGP_RcvSchdSrch, MS_MSBGL0070_Srch01Bridge>(
					(MSBGP_RcvSchdSrch)this, new MS_MSBGL0070_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBGL0070_Srch01]の呼び出し */
	protected void callMS_MSBGL0070_Srch01() {
		MCCaller caller = createMS_MSBGL0070_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0070.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0070.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBG.MSBGP0070.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0070.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0070.CndR createCndR() {
		return mcframe.clientMSBG.MSBGP0070.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBG.MSBGP0070.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0070.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBG.MSBGP0070.RsltR createRsltR() {
		return mcframe.clientMSBG.MSBGP0070.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0070.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0070.RsltR.class);
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
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
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
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(RcvSchdAdjstPanel);
		ret.add(Tab2Panel);
		ret.add(BcstCndPanel);
		ret.add(CndPanel);
		ret.add(LPnlPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_RcvSchdSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBGP_RcvSchdSrch_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBGP_RcvSchdSrch_MC.jbCreateTop((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbCreateFold((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbCreateTab1((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbCreateRcvSchdAdjst((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbCreateTab2((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbCreateBcstCnd((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbCreateCnd((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbCreateLPnl((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbCreateCtrl((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbCreateRPnl((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbCreateRslt((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbCreateBtn((MSBGP_RcvSchdSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBGP_RcvSchdSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBGP_RcvSchdSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBGP_RcvSchdSrch p) {
	}

	/**
	 * [RcvSchdAdjst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRcvSchdAdjst(MSBGP_RcvSchdSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBGP_RcvSchdSrch p) {
	}

	/**
	 * [BcstCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBcstCnd(MSBGP_RcvSchdSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBGP_RcvSchdSrch p) {
		p.Cnd_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getCndR().wrk_no_p());
		p.Cnd_wrk_no_p_PPanel.setName("Cnd.wrk_no_p");
		p.Cnd_wrk_no = p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_no;
		p.Cnd_wrk_no.addAliasName("Cnd.wrk_no", p);
		p.Cnd_wrk_nm = p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_nm;
		p.Cnd_wrk_nm.addAliasName("Cnd.wrk_nm", p);
		p.Cnd_bcst_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().bcst_grp_p());
		p.Cnd_bcst_grp_p_PPanel.setName("Cnd.bcst_grp_p");
		p.Cnd_bcst_grp_lab1 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_bcst_grp_lab1.addAliasName("Cnd.bcst_grp_lab1", p);
		p.Cnd_bcst_grp_flg1 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_bcst_grp_flg1.addAliasName("Cnd.bcst_grp_flg1", p);
		p.Cnd_bcst_grp_cd1 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_bcst_grp_cd1.addAliasName("Cnd.bcst_grp_cd1", p);
		p.Cnd_bcst_grp_nm1 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_bcst_grp_nm1.addAliasName("Cnd.bcst_grp_nm1", p);
		p.Cnd_bcst_grp_lab2 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_bcst_grp_lab2.addAliasName("Cnd.bcst_grp_lab2", p);
		p.Cnd_bcst_grp_flg2 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_bcst_grp_flg2.addAliasName("Cnd.bcst_grp_flg2", p);
		p.Cnd_bcst_grp_cd2 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_bcst_grp_cd2.addAliasName("Cnd.bcst_grp_cd2", p);
		p.Cnd_bcst_grp_nm2 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_bcst_grp_nm2.addAliasName("Cnd.bcst_grp_nm2", p);
		p.Cnd_bcst_grp_lab3 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_bcst_grp_lab3.addAliasName("Cnd.bcst_grp_lab3", p);
		p.Cnd_bcst_grp_flg3 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_bcst_grp_flg3.addAliasName("Cnd.bcst_grp_flg3", p);
		p.Cnd_bcst_grp_cd3 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_bcst_grp_cd3.addAliasName("Cnd.bcst_grp_cd3", p);
		p.Cnd_bcst_grp_nm3 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_bcst_grp_nm3.addAliasName("Cnd.bcst_grp_nm3", p);
		p.Cnd_bcst_grp_lab4 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_bcst_grp_lab4.addAliasName("Cnd.bcst_grp_lab4", p);
		p.Cnd_bcst_grp_flg4 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_bcst_grp_flg4.addAliasName("Cnd.bcst_grp_flg4", p);
		p.Cnd_bcst_grp_cd4 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_bcst_grp_cd4.addAliasName("Cnd.bcst_grp_cd4", p);
		p.Cnd_bcst_grp_nm4 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_bcst_grp_nm4.addAliasName("Cnd.bcst_grp_nm4", p);
		p.Cnd_bcst_grp_lab5 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_bcst_grp_lab5.addAliasName("Cnd.bcst_grp_lab5", p);
		p.Cnd_bcst_grp_flg5 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_bcst_grp_flg5.addAliasName("Cnd.bcst_grp_flg5", p);
		p.Cnd_bcst_grp_cd5 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_bcst_grp_cd5.addAliasName("Cnd.bcst_grp_cd5", p);
		p.Cnd_bcst_grp_nm5 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_bcst_grp_nm5.addAliasName("Cnd.bcst_grp_nm5", p);
		p.Cnd_bcst_grp_lab6 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_bcst_grp_lab6.addAliasName("Cnd.bcst_grp_lab6", p);
		p.Cnd_bcst_grp_flg6 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_bcst_grp_flg6.addAliasName("Cnd.bcst_grp_flg6", p);
		p.Cnd_bcst_grp_cd6 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_bcst_grp_cd6.addAliasName("Cnd.bcst_grp_cd6", p);
		p.Cnd_bcst_grp_nm6 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_bcst_grp_nm6.addAliasName("Cnd.bcst_grp_nm6", p);
		p.Cnd_bcst_grp_lab7 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_bcst_grp_lab7.addAliasName("Cnd.bcst_grp_lab7", p);
		p.Cnd_bcst_grp_flg7 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_bcst_grp_flg7.addAliasName("Cnd.bcst_grp_flg7", p);
		p.Cnd_bcst_grp_cd7 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_bcst_grp_cd7.addAliasName("Cnd.bcst_grp_cd7", p);
		p.Cnd_bcst_grp_nm7 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_bcst_grp_nm7.addAliasName("Cnd.bcst_grp_nm7", p);
		p.Cnd_bcst_grp_lab8 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_bcst_grp_lab8.addAliasName("Cnd.bcst_grp_lab8", p);
		p.Cnd_bcst_grp_flg8 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_bcst_grp_flg8.addAliasName("Cnd.bcst_grp_flg8", p);
		p.Cnd_bcst_grp_cd8 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_bcst_grp_cd8.addAliasName("Cnd.bcst_grp_cd8", p);
		p.Cnd_bcst_grp_nm8 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_bcst_grp_nm8.addAliasName("Cnd.bcst_grp_nm8", p);
		p.Cnd_bcst_grp_lab9 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_bcst_grp_lab9.addAliasName("Cnd.bcst_grp_lab9", p);
		p.Cnd_bcst_grp_flg9 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_bcst_grp_flg9.addAliasName("Cnd.bcst_grp_flg9", p);
		p.Cnd_bcst_grp_cd9 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_bcst_grp_cd9.addAliasName("Cnd.bcst_grp_cd9", p);
		p.Cnd_bcst_grp_nm9 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_bcst_grp_nm9.addAliasName("Cnd.bcst_grp_nm9", p);
		p.Cnd_bcst_grp_lab10 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_bcst_grp_lab10.addAliasName("Cnd.bcst_grp_lab10", p);
		p.Cnd_bcst_grp_flg10 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_bcst_grp_flg10.addAliasName("Cnd.bcst_grp_flg10", p);
		p.Cnd_bcst_grp_cd10 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_bcst_grp_cd10.addAliasName("Cnd.bcst_grp_cd10", p);
		p.Cnd_bcst_grp_nm10 = p.Cnd_bcst_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_bcst_grp_nm10.addAliasName("Cnd.bcst_grp_nm10", p);
	}

	/**
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MSBGP_RcvSchdSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBGP_RcvSchdSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBGP_RcvSchdSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBGP_RcvSchdSrch p) {
		p.Rslt_rcv_schd_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0070.RsltR.$rcv_schd_amt_p);
		p.Rslt_rcv_schd_amt_p_PPanel.setName("Rslt.rcv_schd_amt_p");
		p.columnRslt_rcv_schd_amt = p.Rslt_rcv_schd_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_rcv_schd_amt.addAliasName("Rslt.rcv_schd_amt", p);
		p.Rslt_rcv_act_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0070.RsltR.$rcv_act_amt_p);
		p.Rslt_rcv_act_amt_p_PPanel.setName("Rslt.rcv_act_amt_p");
		p.columnRslt_rcv_act_amt = p.Rslt_rcv_act_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_rcv_act_amt.addAliasName("Rslt.rcv_act_amt", p);
		p.Rslt_not_appl_bal_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0070.RsltR.$not_appl_bal_p);
		p.Rslt_not_appl_bal_p_PPanel.setName("Rslt.not_appl_bal_p");
		p.columnRslt_not_appl_bal = p.Rslt_not_appl_bal_p_PPanel.columnAmt_amt;
		p.columnRslt_not_appl_bal.addAliasName("Rslt.not_appl_bal", p);
		p.Rslt_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.create(mcframe.clientMSBG.MSBGP0070.RsltR.$wrk_no_p);
		p.Rslt_wrk_no_p_PPanel.setName("Rslt.wrk_no_p");
		p.columnRslt_wrk_no = p.Rslt_wrk_no_p_PPanel.columnWrkNo_wrk_no;
		p.columnRslt_wrk_no.addAliasName("Rslt.wrk_no", p);
		p.columnRslt_wrk_nm = p.Rslt_wrk_no_p_PPanel.columnWrkNo_wrk_nm;
		p.columnRslt_wrk_nm.addAliasName("Rslt.wrk_nm", p);
		p.Rslt_bcst_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBG.MSBGP0070.RsltR.$bcst_grp_p);
		p.Rslt_bcst_grp_p_PPanel.setName("Rslt.bcst_grp_p");
		p.columnRslt_bcst_grp_cd1 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_bcst_grp_cd1.addAliasName("Rslt.bcst_grp_cd1", p);
		p.columnRslt_bcst_grp_nm1 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_bcst_grp_nm1.addAliasName("Rslt.bcst_grp_nm1", p);
		p.columnRslt_bcst_grp_cd2 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_bcst_grp_cd2.addAliasName("Rslt.bcst_grp_cd2", p);
		p.columnRslt_bcst_grp_nm2 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_bcst_grp_nm2.addAliasName("Rslt.bcst_grp_nm2", p);
		p.columnRslt_bcst_grp_cd3 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_bcst_grp_cd3.addAliasName("Rslt.bcst_grp_cd3", p);
		p.columnRslt_bcst_grp_nm3 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_bcst_grp_nm3.addAliasName("Rslt.bcst_grp_nm3", p);
		p.columnRslt_bcst_grp_cd4 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_bcst_grp_cd4.addAliasName("Rslt.bcst_grp_cd4", p);
		p.columnRslt_bcst_grp_nm4 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_bcst_grp_nm4.addAliasName("Rslt.bcst_grp_nm4", p);
		p.columnRslt_bcst_grp_cd5 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_bcst_grp_cd5.addAliasName("Rslt.bcst_grp_cd5", p);
		p.columnRslt_bcst_grp_nm5 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_bcst_grp_nm5.addAliasName("Rslt.bcst_grp_nm5", p);
		p.columnRslt_bcst_grp_cd6 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_bcst_grp_cd6.addAliasName("Rslt.bcst_grp_cd6", p);
		p.columnRslt_bcst_grp_nm6 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_bcst_grp_nm6.addAliasName("Rslt.bcst_grp_nm6", p);
		p.columnRslt_bcst_grp_cd7 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_bcst_grp_cd7.addAliasName("Rslt.bcst_grp_cd7", p);
		p.columnRslt_bcst_grp_nm7 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_bcst_grp_nm7.addAliasName("Rslt.bcst_grp_nm7", p);
		p.columnRslt_bcst_grp_cd8 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_bcst_grp_cd8.addAliasName("Rslt.bcst_grp_cd8", p);
		p.columnRslt_bcst_grp_nm8 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_bcst_grp_nm8.addAliasName("Rslt.bcst_grp_nm8", p);
		p.columnRslt_bcst_grp_cd9 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_bcst_grp_cd9.addAliasName("Rslt.bcst_grp_cd9", p);
		p.columnRslt_bcst_grp_nm9 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_bcst_grp_nm9.addAliasName("Rslt.bcst_grp_nm9", p);
		p.columnRslt_bcst_grp_cd10 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_bcst_grp_cd10.addAliasName("Rslt.bcst_grp_cd10", p);
		p.columnRslt_bcst_grp_nm10 = p.Rslt_bcst_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_bcst_grp_nm10.addAliasName("Rslt.bcst_grp_nm10", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBGP_RcvSchdSrch p) {
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
	
	
	/** [Cnd_trd_cur_cd_ListPutter]の定義 */
	private MCListPutter Cnd_trd_cur_cd_p = null;

	/**
	 * [Cnd_trd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_trd_cur_cd_ListPutter() {
		if (Cnd_trd_cur_cd_p == null) {
			Cnd_trd_cur_cd_p = createCnd_trd_cur_cd_ListPutter(Cnd_trd_cur_cd, "trd_cur_cd", "trd_cur_nm");

		}
		return Cnd_trd_cur_cd_p;
	}
	
	
	/** [Cnd_rcst_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rcst_cd_p = null;

	/**
	 * [Cnd_rcst_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rcst_cd_ListPutter() {
		if (Cnd_rcst_cd_p == null) {
			Cnd_rcst_cd_p = createCnd_rcst_cd_ListPutter(Cnd_rcst_cd, "rcst_cd", "rcst_nm");

		}
		return Cnd_rcst_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_RcvSchdSrch create(){
		MSBGP_RcvSchdSrch p = new MSBGP_RcvSchdSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_RcvSchdSrch create(String name){
		MSBGP_RcvSchdSrch p = new MSBGP_RcvSchdSrch(name);
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
		MSBGP_RcvSchdSrch_MC.jbfInitTop((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbfInitFold((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbfInitTab1((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbfInitRcvSchdAdjst((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbfInitTab2((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbfInitBcstCnd((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbfInitCnd((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbfInitLPnl((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbfInitCtrl((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbfInitRPnl((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbfInitRslt((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbfInitBtn((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbInitTop((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbInitFold((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbInitTab1((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbInitRcvSchdAdjst((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbInitTab2((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbInitBcstCnd((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbInitCnd((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbInitLPnl((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbInitCtrl((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbInitRPnl((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbInitRslt((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.jbInitBtn((MSBGP_RcvSchdSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBGP_RcvSchdSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBGP_RcvSchdSrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldTab = p.beansFactory.createTabbedPane("Fold.tab");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MSBGP_RcvSchdSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [RcvSchdAdjst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRcvSchdAdjst(MSBGP_RcvSchdSrch p) {
		// ブロック関連の初期化
		p.RcvSchdAdjstPanel = p.beansFactory.createPanel("RcvSchdAdjst");
		p.RcvSchdAdjstTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBGP_RcvSchdSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [BcstCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBcstCnd(MSBGP_RcvSchdSrch p) {
		// ブロック関連の初期化
		p.BcstCndPanel = p.beansFactory.createPanel("BcstCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBGP_RcvSchdSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_not_adjst_flg = p.beansFactory.createCheckBox("Cnd.not_adjst_flg");
		p.Cnd_adjst_flg = p.beansFactory.createCheckBox("Cnd.adjst_flg");
		p.Cnd_schd_act_rcv_dt_fr_Label = p.beansFactory.createLabel("Cnd.schd_act_rcv_dt_fr_Label");
		p.Cnd_schd_act_rcv_dt_fr = p.beansFactory.createDateField("Cnd.schd_act_rcv_dt_fr");
		p.Cnd_schd_act_rcv_dt_fr.setLabel(p.Cnd_schd_act_rcv_dt_fr_Label);
		p.Cnd_schd_act_rcv_dt_to_Label = p.beansFactory.createLabel("Cnd.schd_act_rcv_dt_to_Label");
		p.Cnd_schd_act_rcv_dt_to = p.beansFactory.createDateField("Cnd.schd_act_rcv_dt_to");
		p.Cnd_schd_act_rcv_dt_to.setLabel(p.Cnd_schd_act_rcv_dt_to_Label);
		p.Cnd_bcst_cd_Label = p.beansFactory.createLabel("Cnd.bcst_cd_Label");
		p.Cnd_bcst_cd = p.beansFactory.createTextField("Cnd.bcst_cd");
		p.Cnd_bcst_cd.setLabel(p.Cnd_bcst_cd_Label);
		p.Cnd_bcst_nm = p.beansFactory.createTextField("Cnd.bcst_nm");
		p.Cnd_bill_dpt_cd_Label = p.beansFactory.createLabel("Cnd.bill_dpt_cd_Label");
		p.Cnd_bill_dpt_cd = p.beansFactory.createTextField("Cnd.bill_dpt_cd");
		p.Cnd_bill_dpt_cd.setLabel(p.Cnd_bill_dpt_cd_Label);
		p.Cnd_bill_dpt_nm = p.beansFactory.createTextField("Cnd.bill_dpt_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.trd_cur_cd_Label");
		p.Cnd_trd_cur_cd = p.beansFactory.createTextComboBox("Cnd.trd_cur_cd");
		p.Cnd_trd_cur_cd.setLabel(p.Cnd_trd_cur_cd_Label);
		p.Cnd_trd_cur_nm = p.beansFactory.createTextField("Cnd.trd_cur_nm");
		p.Cnd_bill_no_Label = p.beansFactory.createLabel("Cnd.bill_no_Label");
		p.Cnd_bill_no = p.beansFactory.createTextField("Cnd.bill_no");
		p.Cnd_bill_no.setLabel(p.Cnd_bill_no_Label);
		p.Cnd_iv_no_Label = p.beansFactory.createLabel("Cnd.iv_no_Label");
		p.Cnd_iv_no = p.beansFactory.createTextField("Cnd.iv_no");
		p.Cnd_iv_no.setLabel(p.Cnd_iv_no_Label);
		p.Cnd_rcst_cd_Label = p.beansFactory.createLabel("Cnd.rcst_cd_Label");
		p.Cnd_rcst_cd = p.beansFactory.createTextField("Cnd.rcst_cd");
		p.Cnd_rcst_cd.setLabel(p.Cnd_rcst_cd_Label);
		p.Cnd_rcst_nm = p.beansFactory.createTextField("Cnd.rcst_nm");
		p.Cnd_dtl_flg = p.beansFactory.createCheckBox("Cnd.dtl_flg");
		p.Cnd_inc_appl_flg = p.beansFactory.createCheckBox("Cnd.inc_appl_flg");
		p.Cnd_inc_not_cl_flg = p.beansFactory.createCheckBox("Cnd.inc_not_cl_flg");
		p.Cnd_rcv_schd_adjst_flg = p.beansFactory.createCheckBox("Cnd.rcv_schd_adjst_flg");
		p.Cnd_rfrnc_dt_Label = p.beansFactory.createLabel("Cnd.rfrnc_dt_Label");
		p.Cnd_rfrnc_dt = p.beansFactory.createDateField("Cnd.rfrnc_dt");
		p.Cnd_rfrnc_dt.setLabel(p.Cnd_rfrnc_dt_Label);
		p.Cnd_key_flg = p.beansFactory.createCheckBox("Cnd.key_flg");
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MSBGP_RcvSchdSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBGP_RcvSchdSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBGP_RcvSchdSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBGP_RcvSchdSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_bill_dpt_cd = p.beansFactory.createTableColumn("Rslt.bill_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_bill_dpt_nm = p.beansFactory.createTableColumn("Rslt.bill_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_bcst_cd = p.beansFactory.createTableColumn("Rslt.bcst_cd", MCColumnType.TEXT);
		p.columnRslt_bcst_nm = p.beansFactory.createTableColumn("Rslt.bcst_nm", MCColumnType.TEXT);
		p.columnRslt_schd_act_rcv_dt = p.beansFactory.createTableColumn("Rslt.schd_act_rcv_dt", MCColumnType.DATE);
		p.columnRslt_rcv_mtd_cd = p.beansFactory.createTableColumn("Rslt.rcv_mtd_cd", MCColumnType.TEXT);
		p.columnRslt_rcv_mtd_nm = p.beansFactory.createTableColumn("Rslt.rcv_mtd_nm", MCColumnType.TEXT);
		p.columnRslt_rcv_typ = p.beansFactory.createTableColumn("Rslt.rcv_typ", MCColumnType.TEXT);
		p.columnRslt_rcv_reg_typ = p.beansFactory.createTableColumn("Rslt.rcv_reg_typ", MCColumnType.TEXT);
		p.columnRslt_delay = p.beansFactory.createTableColumn("Rslt.delay", MCColumnType.TEXT);
		p.columnRslt_bill_ym = p.beansFactory.createTableColumn("Rslt.bill_ym", MCColumnType.DATE);
		p.columnRslt_bill_cl_day = p.beansFactory.createTableColumn("Rslt.bill_cl_day", MCColumnType.NUMBER);
		p.columnRslt_bill_dt = p.beansFactory.createTableColumn("Rslt.bill_dt", MCColumnType.DATE);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_amt_dec_place = p.beansFactory.createTableColumn("Rslt.amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_bill_no = p.beansFactory.createTableColumn("Rslt.bill_no", MCColumnType.TEXT);
		p.columnRslt_iv_no = p.beansFactory.createTableColumn("Rslt.iv_no", MCColumnType.TEXT);
		p.columnRslt_rcst_cd = p.beansFactory.createTableColumn("Rslt.rcst_cd", MCColumnType.TEXT);
		p.columnRslt_rcst_nm = p.beansFactory.createTableColumn("Rslt.rcst_nm", MCColumnType.TEXT);
		p.columnRslt_rcv_schd_adjst_flg = p.beansFactory.createTableColumn("Rslt.rcv_schd_adjst_flg", MCColumnType.CHECK);
		p.columnRslt_adjst_flg = p.beansFactory.createTableColumn("Rslt.adjst_flg", MCColumnType.CHECK);
		p.columnRslt_bill_mng_no = p.beansFactory.createTableColumn("Rslt.bill_mng_no", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBGP_RcvSchdSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBGP0080 = p.beansFactory.createButton("Btn.open_MSBGP0080", "open");
		p.Btn_open_MSBGP0140 = p.beansFactory.createButton("Btn.open_MSBGP0140", "open");
		p.Btn_open_MSBGP0210 = p.beansFactory.createButton("Btn.open_MSBGP0210", "open");
		p.Btn_open_MSBGP0120 = p.beansFactory.createButton("Btn.open_MSBGP0120", "open");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBGP_RcvSchdSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.FoldBasePanel);
		p.FoldBasePanel.add(p.FoldScrollPane);
		p.FoldScrollPane.setBorder(null);
		p.FoldScrollPane.setViewportView(p.FoldPanel);
		p.FoldBasePanel.setLayoutPosition("C");
		p.TopPanel.setLastBeans(p.FoldPanel);
		p.FoldPanel.setNextBeans(p.LPnlPanel);
		p.TopPanel.add(p.LPnlPanel, null);
		p.LPnlPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
		p.CtrlPanel.setNextBeans(p.RPnlPanel);
		p.TopPanel.add(p.RPnlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBGP_RcvSchdSrch p) {
		// ブロック関連の初期化
		p.FoldPanel.add(p.FoldTab);
		p.FoldPanel.setLastBeans(p.FoldTab);
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldTab.add(p.Tab1Panel, "Fold.tab1");
		p.FoldTab.setLastBeans(p.Tab1Panel);
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.FoldTab.add(p.Tab2Panel, "Fold.tab2");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MSBGP_RcvSchdSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("NW");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.RcvSchdAdjstPanel, null);
		p.Tab1Panel.setLastBeans(p.RcvSchdAdjstPanel);
		p.RcvSchdAdjstPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [RcvSchdAdjst]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRcvSchdAdjst(MSBGP_RcvSchdSrch p) {
		// ブロック関連の初期化
		p.RcvSchdAdjstPanel.setBorder(p.RcvSchdAdjstTitledBorder);
		p.RcvSchdAdjstPanel.setValueCheck(false);
		p.RcvSchdAdjstPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RcvSchdAdjstPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBGP_RcvSchdSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.BcstCndPanel, null);
		p.Tab2Panel.setLastBeans(p.BcstCndPanel);
	}

	/**
	 * [BcstCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBcstCnd(MSBGP_RcvSchdSrch p) {
		// ブロック関連の初期化
		p.BcstCndPanel.setValueCheck(false);
		p.BcstCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BcstCndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBGP_RcvSchdSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.RcvSchdAdjstPanel.add(p.Cnd_not_adjst_flg);
		p.RcvSchdAdjstPanel.setLastBeans(p.Cnd_not_adjst_flg);
		p.Cnd_not_adjst_flg.setNextBeans(p.Cnd_adjst_flg);
		p.Cnd_not_adjst_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0070.CndR.not_adjst_flg_META);
		p.RcvSchdAdjstPanel.add(p.Cnd_adjst_flg);
		p.Cnd_adjst_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0070.CndR.adjst_flg_META);
		p.CndPanel.add(p.Cnd_schd_act_rcv_dt_fr_Label);
		p.CndPanel.add(p.Cnd_schd_act_rcv_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_schd_act_rcv_dt_fr);
		p.Cnd_schd_act_rcv_dt_fr.setNextBeans(p.Cnd_schd_act_rcv_dt_to);
		p.Cnd_schd_act_rcv_dt_fr.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0070.CndR.schd_act_rcv_dt_fr_META);
		p.Cnd_schd_act_rcv_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_schd_act_rcv_dt_to_Label);
		p.CndPanel.add(p.Cnd_schd_act_rcv_dt_to);
		p.Cnd_schd_act_rcv_dt_to.setNextBeans(p.Cnd_bcst_cd);
		p.Cnd_schd_act_rcv_dt_to.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0070.CndR.schd_act_rcv_dt_to_META);
		p.Cnd_schd_act_rcv_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_bcst_cd_Label);
		p.CndPanel.add(p.Cnd_bcst_cd);
		p.Cnd_bcst_cd.setNextBeans(p.Cnd_bcst_nm);
		p.Cnd_bcst_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0070.CndR.bcst_cd_META);
		p.Cnd_bcst_cd.addLinkBeans(p.Cnd_bcst_nm);
		p.Cnd_bcst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bcst_cd, true);
		p.CndPanel.add(p.Cnd_bcst_nm);
		p.Cnd_bcst_nm.setNextBeans(p.Cnd_bill_dpt_cd);
		p.Cnd_bcst_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0070.CndR.bcst_nm_META);
		p.setPluralValueEnable(p.Cnd_bcst_nm, true);
		p.CndPanel.add(p.Cnd_bill_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_bill_dpt_cd);
		p.Cnd_bill_dpt_cd.setNextBeans(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0070.CndR.bill_dpt_cd_META);
		p.Cnd_bill_dpt_cd.addLinkBeans(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bill_dpt_cd, true);
		p.CndPanel.add(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_bill_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0070.CndR.bill_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_bill_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0070.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_trd_cur_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0070.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_trd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cur_cd, true);
		p.Cnd_trd_cur_cd.setLinkBeans(p.Cnd_trd_cur_nm);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0070.CndR.trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_bill_no);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0070.CndR.trd_cur_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_cur_nm, true);
		p.CndPanel.add(p.Cnd_bill_no_Label);
		p.CndPanel.add(p.Cnd_bill_no);
		p.Cnd_bill_no.setNextBeans(p.Cnd_iv_no);
		p.Cnd_bill_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0070.CndR.bill_no_META);
		p.setPluralValueEnable(p.Cnd_bill_no, true);
		p.CndPanel.add(p.Cnd_iv_no_Label);
		p.CndPanel.add(p.Cnd_iv_no);
		p.Cnd_iv_no.setNextBeans(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_iv_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0070.CndR.iv_no_META);
		p.setPluralValueEnable(p.Cnd_iv_no, true);
		p.CndPanel.add(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_wrk_no_p_PPanel.setNextBeans(p.Cnd_rcst_cd);
		p.CndPanel.add(p.Cnd_rcst_cd_Label);
		p.CndPanel.add(p.Cnd_rcst_cd);
		p.Cnd_rcst_cd.setNextBeans(p.Cnd_rcst_nm);
		p.Cnd_rcst_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0070.CndR.rcst_cd_META);
		p.Cnd_rcst_cd.addLinkBeans(p.Cnd_rcst_nm);
		p.Cnd_rcst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rcst_cd, true);
		p.CndPanel.add(p.Cnd_rcst_nm);
		p.Cnd_rcst_nm.setNextBeans(p.Cnd_dtl_flg);
		p.Cnd_rcst_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0070.CndR.rcst_nm_META);
		p.setPluralValueEnable(p.Cnd_rcst_nm, true);
		p.CndPanel.add(p.Cnd_dtl_flg);
		p.Cnd_dtl_flg.setNextBeans(p.Cnd_inc_appl_flg);
		p.Cnd_dtl_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0070.CndR.dtl_flg_META);
		p.CndPanel.add(p.Cnd_inc_appl_flg);
		p.Cnd_inc_appl_flg.setNextBeans(p.Cnd_inc_not_cl_flg);
		p.Cnd_inc_appl_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0070.CndR.inc_appl_flg_META);
		p.CndPanel.add(p.Cnd_inc_not_cl_flg);
		p.Cnd_inc_not_cl_flg.setNextBeans(p.Cnd_rcv_schd_adjst_flg);
		p.Cnd_inc_not_cl_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0070.CndR.inc_not_cl_flg_META);
		p.CndPanel.add(p.Cnd_rcv_schd_adjst_flg);
		p.Cnd_rcv_schd_adjst_flg.setNextBeans(p.Cnd_rfrnc_dt);
		p.Cnd_rcv_schd_adjst_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0070.CndR.rcv_schd_adjst_flg_META);
		p.CndPanel.add(p.Cnd_rfrnc_dt_Label);
		p.CndPanel.add(p.Cnd_rfrnc_dt);
		p.Cnd_rfrnc_dt.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0070.CndR.rfrnc_dt_META);
		p.Cnd_rfrnc_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BcstCndPanel.add(p.Cnd_bcst_grp_p_PPanel);
		p.BcstCndPanel.setLastBeans(p.Cnd_bcst_grp_p_PPanel);
		p.LPnlPanel.add(p.Cnd_key_flg);
		p.LPnlPanel.setLastBeans(p.Cnd_key_flg);
		p.Cnd_key_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0070.CndR.key_flg_META);
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MSBGP_RcvSchdSrch p) {
		// ブロック関連の初期化
		p.LPnlPanel.setValueCheck(false);
		p.LPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBGP_RcvSchdSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRPnl(MSBGP_RcvSchdSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel.setValueCheck(false);
		p.RPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RPnlPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
		p.RPnl_dwnld.setIcon("DWNLD");
		p.RPnl_dwnld.setFunctionKey(MCFunctionKey.F11);
		p.RPnlPanel.add(p.RPnl_dwnld);
		p.RPnlPanel.setLastBeans(p.RPnl_dwnld);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBGP_RcvSchdSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBGP_RcvSchdSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_open_MSBGP0080.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBGP0080);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBGP0080);
		p.Btn_open_MSBGP0080.setNextBeans(p.Btn_open_MSBGP0140);
		p.Btn_open_MSBGP0140.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBGP0140);
		p.Btn_open_MSBGP0140.setNextBeans(p.Btn_open_MSBGP0210);
		p.Btn_open_MSBGP0210.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MSBGP0210);
		p.Btn_open_MSBGP0210.setNextBeans(p.Btn_open_MSBGP0120);
		p.Btn_open_MSBGP0120.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_open_MSBGP0120);
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
		MSBGP_RcvSchdSrch_MC.mcInitTop((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.mcInitFold((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.mcInitTab1((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.mcInitRcvSchdAdjst((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.mcInitTab2((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.mcInitBcstCnd((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.mcInitCnd((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.mcInitLPnl((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.mcInitCtrl((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.mcInitRPnl((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.mcInitRslt((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.mcInitBtn((MSBGP_RcvSchdSrch)this);

		// [SRCH]ステータスのモードの設定
		MSBGP_RcvSchdSrch_MC.statusInitSRCH_Top((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.statusInitSRCH_Fold((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.statusInitSRCH_Tab1((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.statusInitSRCH_RcvSchdAdjst((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.statusInitSRCH_Tab2((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.statusInitSRCH_BcstCnd((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.statusInitSRCH_Cnd((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.statusInitSRCH_LPnl((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.statusInitSRCH_Ctrl((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.statusInitSRCH_RPnl((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.statusInitSRCH_Rslt((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.statusInitSRCH_Btn((MSBGP_RcvSchdSrch)this);

		// [REF]ステータスのモードの設定
		MSBGP_RcvSchdSrch_MC.statusInitREF_Top((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.statusInitREF_Fold((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.statusInitREF_Tab1((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.statusInitREF_RcvSchdAdjst((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.statusInitREF_Tab2((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.statusInitREF_BcstCnd((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.statusInitREF_Cnd((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.statusInitREF_LPnl((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.statusInitREF_Ctrl((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.statusInitREF_RPnl((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.statusInitREF_Rslt((MSBGP_RcvSchdSrch)this);
		MSBGP_RcvSchdSrch_MC.statusInitREF_Btn((MSBGP_RcvSchdSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBGP_RcvSchdSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBGP_RcvSchdSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBGP_RcvSchdSrch p) {
	}

	/**
	 *  [RcvSchdAdjst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRcvSchdAdjst(MSBGP_RcvSchdSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBGP_RcvSchdSrch p) {
	}

	/**
	 *  [BcstCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBcstCnd(MSBGP_RcvSchdSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBGP_RcvSchdSrch p) {
		p.Cnd_not_adjst_flg.addAllListener(p);
		p.Cnd_adjst_flg.addAllListener(p);
		p.Cnd_schd_act_rcv_dt_fr.setListListener(p);
		p.Cnd_schd_act_rcv_dt_fr.addAllListener(p);
		p.Cnd_schd_act_rcv_dt_to.setListListener(p);
		p.Cnd_schd_act_rcv_dt_to.addAllListener(p);
		p.Cnd_bcst_cd.setListListener(p);
		p.Cnd_bcst_cd.addAllListener(p);
		p.Cnd_bcst_nm.setListListener(p);
		p.Cnd_bcst_nm.addAllListener(p);
		p.Cnd_bill_dpt_cd.setListListener(p);
		p.Cnd_bill_dpt_cd.addAllListener(p);
		p.Cnd_bill_dpt_nm.setListListener(p);
		p.Cnd_bill_dpt_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_trd_cur_cd.setListListener(p);
		p.Cnd_trd_cur_cd.addAllListener(p);
		p.Cnd_trd_cur_nm.setListListener(p);
		p.Cnd_trd_cur_nm.addAllListener(p);
		p.Cnd_bill_no.setListListener(p);
		p.Cnd_bill_no.addAllListener(p);
		p.Cnd_iv_no.setListListener(p);
		p.Cnd_iv_no.addAllListener(p);
		p.Cnd_rcst_cd.setListListener(p);
		p.Cnd_rcst_cd.addAllListener(p);
		p.Cnd_rcst_nm.setListListener(p);
		p.Cnd_rcst_nm.addAllListener(p);
		p.Cnd_dtl_flg.addAllListener(p);
		p.Cnd_inc_appl_flg.addAllListener(p);
		p.Cnd_inc_not_cl_flg.addAllListener(p);
		p.Cnd_rcv_schd_adjst_flg.addAllListener(p);
		p.Cnd_rfrnc_dt.setListListener(p);
		p.Cnd_rfrnc_dt.addAllListener(p);
		p.Cnd_key_flg.addAllListener(p);
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MSBGP_RcvSchdSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBGP_RcvSchdSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBGP_RcvSchdSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBGP_RcvSchdSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_bill_dpt_cd.addAllListener(p);
		p.columnRslt_bill_dpt_cd.setListListener(p);
		p.columnRslt_bill_dpt_nm.addAllListener(p);
		p.columnRslt_bill_dpt_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_bcst_cd.addAllListener(p);
		p.columnRslt_bcst_cd.setListListener(p);
		p.columnRslt_bcst_nm.addAllListener(p);
		p.columnRslt_bcst_nm.setListListener(p);
		p.columnRslt_schd_act_rcv_dt.addAllListener(p);
		p.columnRslt_schd_act_rcv_dt.setListListener(p);
		p.columnRslt_rcv_mtd_cd.addAllListener(p);
		p.columnRslt_rcv_mtd_cd.setListListener(p);
		p.columnRslt_rcv_mtd_nm.addAllListener(p);
		p.columnRslt_rcv_mtd_nm.setListListener(p);
		p.columnRslt_rcv_typ.addAllListener(p);
		p.columnRslt_rcv_typ.setListListener(p);
		p.columnRslt_rcv_reg_typ.addAllListener(p);
		p.columnRslt_rcv_reg_typ.setListListener(p);
		p.columnRslt_delay.addAllListener(p);
		p.columnRslt_delay.setListListener(p);
		p.columnRslt_bill_ym.addAllListener(p);
		p.columnRslt_bill_ym.setListListener(p);
		p.columnRslt_bill_cl_day.addAllListener(p);
		p.columnRslt_bill_cl_day.setListListener(p);
		p.columnRslt_bill_dt.addAllListener(p);
		p.columnRslt_bill_dt.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_amt_dec_place.addAllListener(p);
		p.columnRslt_amt_dec_place.setListListener(p);
		p.columnRslt_bill_no.addAllListener(p);
		p.columnRslt_bill_no.setListListener(p);
		p.columnRslt_iv_no.addAllListener(p);
		p.columnRslt_iv_no.setListListener(p);
		p.columnRslt_rcst_cd.addAllListener(p);
		p.columnRslt_rcst_cd.setListListener(p);
		p.columnRslt_rcst_nm.addAllListener(p);
		p.columnRslt_rcst_nm.setListListener(p);
		p.columnRslt_rcv_schd_adjst_flg.addAllListener(p);
		p.columnRslt_adjst_flg.addAllListener(p);
		p.columnRslt_bill_mng_no.addAllListener(p);
		p.columnRslt_bill_mng_no.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBGP_RcvSchdSrch p) {
		p.Btn_open_MSBGP0080.addAllListener(p);
		p.Btn_open_MSBGP0080.setAPMethodName("doBtn_open_MSBGP0080");
		p.Btn_open_MSBGP0140.addAllListener(p);
		p.Btn_open_MSBGP0140.setAPMethodName("doBtn_open_MSBGP0140");
		p.Btn_open_MSBGP0210.addAllListener(p);
		p.Btn_open_MSBGP0210.setAPMethodName("doBtn_open_MSBGP0210");
		p.Btn_open_MSBGP0120.addAllListener(p);
		p.Btn_open_MSBGP0120.setAPMethodName("doBtn_open_MSBGP0120");
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBGP_RcvSchdSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBGP_RcvSchdSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBGP_RcvSchdSrch p){

	}

	/**
	 * [SRCH]ステータスの[RcvSchdAdjst]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RcvSchdAdjst(MSBGP_RcvSchdSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBGP_RcvSchdSrch p){

	}

	/**
	 * [SRCH]ステータスの[BcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BcstCnd(MSBGP_RcvSchdSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBGP_RcvSchdSrch p){
		p.Cnd_not_adjst_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_adjst_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_schd_act_rcv_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_schd_act_rcv_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bill_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bill_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bill_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_rcst_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcst_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dtl_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_inc_appl_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_inc_not_cl_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_schd_adjst_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rfrnc_dt.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bcst_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_key_flg.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_LPnl(MSBGP_RcvSchdSrch p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBGP_RcvSchdSrch p){

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MSBGP_RcvSchdSrch p){
		p.RPnl_dwnld.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBGP_RcvSchdSrch p){
		p.columnRslt_bill_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_schd_act_rcv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_mtd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_mtd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_rcv_reg_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_rcv_schd_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_rcv_act_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_not_appl_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_delay.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_day.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_bill_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_rcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_adjst_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_adjst_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_mng_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_bcst_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBGP_RcvSchdSrch p){
		p.Btn_open_MSBGP0080.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBGP0140.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBGP0210.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBGP0120.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBGP_RcvSchdSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBGP_RcvSchdSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBGP_RcvSchdSrch p){

	}

	/**
	 * [REF]ステータスの[RcvSchdAdjst]ブロックのモードの設定
	 */
	protected static void statusInitREF_RcvSchdAdjst(MSBGP_RcvSchdSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBGP_RcvSchdSrch p){

	}

	/**
	 * [REF]ステータスの[BcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_BcstCnd(MSBGP_RcvSchdSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBGP_RcvSchdSrch p){
		p.Cnd_not_adjst_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_adjst_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_schd_act_rcv_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_schd_act_rcv_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bill_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bill_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bill_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_rcst_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcst_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dtl_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_inc_appl_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_inc_not_cl_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_schd_adjst_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rfrnc_dt.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bcst_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_key_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_LPnl(MSBGP_RcvSchdSrch p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBGP_RcvSchdSrch p){

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBGP_RcvSchdSrch p){
		p.RPnl_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBGP_RcvSchdSrch p){
		p.columnRslt_bill_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_schd_act_rcv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_mtd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_mtd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_rcv_reg_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_rcv_schd_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_rcv_act_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_not_appl_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_delay.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_day.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_bill_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_rcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_adjst_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_adjst_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_mng_no.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_bcst_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBGP_RcvSchdSrch p){
		p.Btn_open_MSBGP0080.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBGP0140.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBGP0210.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBGP0120.putMode(p, REF, MCMode.ENABLE);

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
		MSBGP_RcvSchdSrch_MC.setTableConfigRslt((MSBGP_RcvSchdSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBGP_RcvSchdSrch p) {
		p.columnRslt_bill_dpt_cd.setMeta(mcframe.clientMSBG.MSBGP0070.RsltR.bill_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_dpt_cd);
		p.columnRslt_bill_dpt_nm.setMeta(mcframe.clientMSBG.MSBGP0070.RsltR.bill_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_dpt_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBG.MSBGP0070.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBG.MSBGP0070.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_bcst_cd.setMeta(mcframe.clientMSBG.MSBGP0070.RsltR.bcst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bcst_cd);
		p.columnRslt_bcst_nm.setMeta(mcframe.clientMSBG.MSBGP0070.RsltR.bcst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bcst_nm);
		p.columnRslt_schd_act_rcv_dt.setMeta(mcframe.clientMSBG.MSBGP0070.RsltR.schd_act_rcv_dt_META);
		p.columnRslt_schd_act_rcv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_act_rcv_dt);
		p.columnRslt_rcv_mtd_cd.setMeta(mcframe.clientMSBG.MSBGP0070.RsltR.rcv_mtd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_mtd_cd);
		p.columnRslt_rcv_mtd_nm.setMeta(mcframe.clientMSBG.MSBGP0070.RsltR.rcv_mtd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_mtd_nm);
		p.columnRslt_rcv_typ.setMeta(mcframe.clientMSBG.MSBGP0070.RsltR.rcv_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_typ);
		p.columnRslt_rcv_reg_typ.setMeta(mcframe.clientMSBG.MSBGP0070.RsltR.rcv_reg_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_reg_typ);
		p.RsltTable.addTable(p.Rslt_rcv_schd_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_rcv_act_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_not_appl_bal_p_PPanel.AmtTable);
		p.columnRslt_delay.setMeta(mcframe.clientMSBG.MSBGP0070.RsltR.delay_META);
		p.RsltTable.addColumnConfig(p.columnRslt_delay);
		p.columnRslt_bill_ym.setMeta(mcframe.clientMSBG.MSBGP0070.RsltR.bill_ym_META);
		p.columnRslt_bill_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_ym);
		p.columnRslt_bill_cl_day.setMeta(mcframe.clientMSBG.MSBGP0070.RsltR.bill_cl_day_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_cl_day);
		p.columnRslt_bill_dt.setMeta(mcframe.clientMSBG.MSBGP0070.RsltR.bill_dt_META);
		p.columnRslt_bill_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_dt);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMSBG.MSBGP0070.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMSBG.MSBGP0070.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_amt_dec_place.setMeta(mcframe.clientMSBG.MSBGP0070.RsltR.amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt_dec_place);
		p.columnRslt_bill_no.setMeta(mcframe.clientMSBG.MSBGP0070.RsltR.bill_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_no);
		p.columnRslt_iv_no.setMeta(mcframe.clientMSBG.MSBGP0070.RsltR.iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_no);
		p.RsltTable.addTable(p.Rslt_wrk_no_p_PPanel.WrkNoTable);
		p.columnRslt_rcst_cd.setMeta(mcframe.clientMSBG.MSBGP0070.RsltR.rcst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcst_cd);
		p.columnRslt_rcst_nm.setMeta(mcframe.clientMSBG.MSBGP0070.RsltR.rcst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcst_nm);
		p.columnRslt_rcv_schd_adjst_flg.setMeta(mcframe.clientMSBG.MSBGP0070.RsltR.rcv_schd_adjst_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_schd_adjst_flg);
		p.columnRslt_adjst_flg.setMeta(mcframe.clientMSBG.MSBGP0070.RsltR.adjst_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_adjst_flg);
		p.columnRslt_bill_mng_no.setMeta(mcframe.clientMSBG.MSBGP0070.RsltR.bill_mng_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_mng_no);
		p.RsltTable.addTable(p.Rslt_bcst_grp_p_PPanel.BpGrpTable);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_bcst_cd.getListConfig().setPutter(getCnd_bcst_cd_ListPutter());
		Cnd_bill_dpt_cd.getListConfig().setPutter(getCnd_bill_dpt_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cur_cd.getListConfig().setPutter(getCnd_trd_cur_cd_ListPutter());
		Cnd_rcst_cd.getListConfig().setPutter(getCnd_rcst_cd_ListPutter());
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
	 * [Cnd_bcst_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bcst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
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
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ArWg");
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
	 * [Cnd_rcst_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rcst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_bcst_cd) return getCnd_bcst_cd(row, info);
		if(combo == Cnd_bill_dpt_cd) return getCnd_bill_dpt_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_trd_cur_cd) return getCnd_trd_cur_cd(row, info);
		if(combo == Cnd_rcst_cd) return getCnd_rcst_cd(row, info);
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
		else if (ap == RPnl_dwnld) doRPnl_dwnld(info);
		else if (ap == Btn_open_MSBGP0080) doBtn_open_MSBGP0080(info);
		else if (ap == Btn_open_MSBGP0140) doBtn_open_MSBGP0140(info);
		else if (ap == Btn_open_MSBGP0210) doBtn_open_MSBGP0210(info);
		else if (ap == Btn_open_MSBGP0120) doBtn_open_MSBGP0120(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [RPnl]パネルの[dwnld]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRPnl_dwnld(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBGP0080]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBGP0080(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBGP0140]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBGP0140(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBGP0210]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBGP0210(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBGP0120]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBGP0120(MCEventInfo info);

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
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_not_adjst_flg) return doCnd_not_adjst_flg_VC(info);
		if (vc == Cnd_adjst_flg) return doCnd_adjst_flg_VC(info);
		if (vc == Cnd_schd_act_rcv_dt_fr) return doCnd_schd_act_rcv_dt_fr_VC(info);
		if (vc == Cnd_schd_act_rcv_dt_to) return doCnd_schd_act_rcv_dt_to_VC(info);
		if (vc == Cnd_bcst_cd) return doCnd_bcst_cd_VC(info);
		if (vc == Cnd_bcst_nm) return doCnd_bcst_nm_VC(info);
		if (vc == Cnd_bill_dpt_cd) return doCnd_bill_dpt_cd_VC(info);
		if (vc == Cnd_bill_dpt_nm) return doCnd_bill_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
		if (vc == Cnd_bill_no) return doCnd_bill_no_VC(info);
		if (vc == Cnd_iv_no) return doCnd_iv_no_VC(info);
		if (vc == Cnd_rcst_cd) return doCnd_rcst_cd_VC(info);
		if (vc == Cnd_rcst_nm) return doCnd_rcst_nm_VC(info);
		if (vc == Cnd_dtl_flg) return doCnd_dtl_flg_VC(info);
		if (vc == Cnd_inc_appl_flg) return doCnd_inc_appl_flg_VC(info);
		if (vc == Cnd_inc_not_cl_flg) return doCnd_inc_not_cl_flg_VC(info);
		if (vc == Cnd_rcv_schd_adjst_flg) return doCnd_rcv_schd_adjst_flg_VC(info);
		if (vc == Cnd_rfrnc_dt) return doCnd_rfrnc_dt_VC(info);
		if (vc == Cnd_key_flg) return doCnd_key_flg_VC(info);
		if (vc == columnRslt_bill_dpt_cd) return doRslt_bill_dpt_cd_VC(info);
		if (vc == columnRslt_bill_dpt_nm) return doRslt_bill_dpt_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_bcst_cd) return doRslt_bcst_cd_VC(info);
		if (vc == columnRslt_bcst_nm) return doRslt_bcst_nm_VC(info);
		if (vc == columnRslt_schd_act_rcv_dt) return doRslt_schd_act_rcv_dt_VC(info);
		if (vc == columnRslt_rcv_mtd_cd) return doRslt_rcv_mtd_cd_VC(info);
		if (vc == columnRslt_rcv_mtd_nm) return doRslt_rcv_mtd_nm_VC(info);
		if (vc == columnRslt_rcv_typ) return doRslt_rcv_typ_VC(info);
		if (vc == columnRslt_rcv_reg_typ) return doRslt_rcv_reg_typ_VC(info);
		if (vc == columnRslt_delay) return doRslt_delay_VC(info);
		if (vc == columnRslt_bill_ym) return doRslt_bill_ym_VC(info);
		if (vc == columnRslt_bill_cl_day) return doRslt_bill_cl_day_VC(info);
		if (vc == columnRslt_bill_dt) return doRslt_bill_dt_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_amt_dec_place) return doRslt_amt_dec_place_VC(info);
		if (vc == columnRslt_bill_no) return doRslt_bill_no_VC(info);
		if (vc == columnRslt_iv_no) return doRslt_iv_no_VC(info);
		if (vc == columnRslt_rcst_cd) return doRslt_rcst_cd_VC(info);
		if (vc == columnRslt_rcst_nm) return doRslt_rcst_nm_VC(info);
		if (vc == columnRslt_rcv_schd_adjst_flg) return doRslt_rcv_schd_adjst_flg_VC(info);
		if (vc == columnRslt_adjst_flg) return doRslt_adjst_flg_VC(info);
		if (vc == columnRslt_bill_mng_no) return doRslt_bill_mng_no_VC(info);
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
	 * [Rslt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_adjst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_adjst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[adjst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_adjst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[schd_act_rcv_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_act_rcv_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[schd_act_rcv_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_act_rcv_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[bill_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dtl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dtl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inc_appl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inc_appl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inc_not_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inc_not_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcv_schd_adjst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcv_schd_adjst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rfrnc_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rfrnc_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[key_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_key_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[schd_act_rcv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_act_rcv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_mtd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_mtd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_mtd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_mtd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_reg_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_reg_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[delay]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_delay_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_cl_day]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_cl_day_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_schd_adjst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_schd_adjst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[adjst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_adjst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_mng_no_VC(MCEventInfo info){
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
		else if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_not_adjst_flg) doCnd_not_adjst_flg_NC(info);
		else if (nc == Cnd_adjst_flg) doCnd_adjst_flg_NC(info);
		else if (nc == Cnd_schd_act_rcv_dt_fr) doCnd_schd_act_rcv_dt_fr_NC(info);
		else if (nc == Cnd_schd_act_rcv_dt_to) doCnd_schd_act_rcv_dt_to_NC(info);
		else if (nc == Cnd_bcst_cd) doCnd_bcst_cd_NC(info);
		else if (nc == Cnd_bcst_nm) doCnd_bcst_nm_NC(info);
		else if (nc == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NC(info);
		else if (nc == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
		else if (nc == Cnd_bill_no) doCnd_bill_no_NC(info);
		else if (nc == Cnd_iv_no) doCnd_iv_no_NC(info);
		else if (nc == Cnd_rcst_cd) doCnd_rcst_cd_NC(info);
		else if (nc == Cnd_rcst_nm) doCnd_rcst_nm_NC(info);
		else if (nc == Cnd_dtl_flg) doCnd_dtl_flg_NC(info);
		else if (nc == Cnd_inc_appl_flg) doCnd_inc_appl_flg_NC(info);
		else if (nc == Cnd_inc_not_cl_flg) doCnd_inc_not_cl_flg_NC(info);
		else if (nc == Cnd_rcv_schd_adjst_flg) doCnd_rcv_schd_adjst_flg_NC(info);
		else if (nc == Cnd_rfrnc_dt) doCnd_rfrnc_dt_NC(info);
		else if (nc == Cnd_key_flg) doCnd_key_flg_NC(info);
		else if (nc == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_NC(info);
		else if (nc == columnRslt_bill_dpt_nm) doRslt_bill_dpt_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_bcst_cd) doRslt_bcst_cd_NC(info);
		else if (nc == columnRslt_bcst_nm) doRslt_bcst_nm_NC(info);
		else if (nc == columnRslt_schd_act_rcv_dt) doRslt_schd_act_rcv_dt_NC(info);
		else if (nc == columnRslt_rcv_mtd_cd) doRslt_rcv_mtd_cd_NC(info);
		else if (nc == columnRslt_rcv_mtd_nm) doRslt_rcv_mtd_nm_NC(info);
		else if (nc == columnRslt_rcv_typ) doRslt_rcv_typ_NC(info);
		else if (nc == columnRslt_rcv_reg_typ) doRslt_rcv_reg_typ_NC(info);
		else if (nc == columnRslt_delay) doRslt_delay_NC(info);
		else if (nc == columnRslt_bill_ym) doRslt_bill_ym_NC(info);
		else if (nc == columnRslt_bill_cl_day) doRslt_bill_cl_day_NC(info);
		else if (nc == columnRslt_bill_dt) doRslt_bill_dt_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_amt_dec_place) doRslt_amt_dec_place_NC(info);
		else if (nc == columnRslt_bill_no) doRslt_bill_no_NC(info);
		else if (nc == columnRslt_iv_no) doRslt_iv_no_NC(info);
		else if (nc == columnRslt_rcst_cd) doRslt_rcst_cd_NC(info);
		else if (nc == columnRslt_rcst_nm) doRslt_rcst_nm_NC(info);
		else if (nc == columnRslt_rcv_schd_adjst_flg) doRslt_rcv_schd_adjst_flg_NC(info);
		else if (nc == columnRslt_adjst_flg) doRslt_adjst_flg_NC(info);
		else if (nc == columnRslt_bill_mng_no) doRslt_bill_mng_no_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_adjst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_adjst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adjst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adjst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_act_rcv_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_act_rcv_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_act_rcv_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_act_rcv_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_appl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_appl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_not_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_not_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_schd_adjst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_adjst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rfrnc_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rfrnc_dt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_act_rcv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_act_rcv_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_mtd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_mtd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_mtd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_mtd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_reg_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_reg_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[delay]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_delay_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_cl_day]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_day_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_schd_adjst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_schd_adjst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adjst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adjst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_mng_no_NC(MCEventInfo info){
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
		else if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_not_adjst_flg) doCnd_not_adjst_flg_NE(info);
		else if (ne == Cnd_adjst_flg) doCnd_adjst_flg_NE(info);
		else if (ne == Cnd_schd_act_rcv_dt_fr) doCnd_schd_act_rcv_dt_fr_NE(info);
		else if (ne == Cnd_schd_act_rcv_dt_to) doCnd_schd_act_rcv_dt_to_NE(info);
		else if (ne == Cnd_bcst_cd) doCnd_bcst_cd_NE(info);
		else if (ne == Cnd_bcst_nm) doCnd_bcst_nm_NE(info);
		else if (ne == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NE(info);
		else if (ne == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
		else if (ne == Cnd_bill_no) doCnd_bill_no_NE(info);
		else if (ne == Cnd_iv_no) doCnd_iv_no_NE(info);
		else if (ne == Cnd_rcst_cd) doCnd_rcst_cd_NE(info);
		else if (ne == Cnd_rcst_nm) doCnd_rcst_nm_NE(info);
		else if (ne == Cnd_dtl_flg) doCnd_dtl_flg_NE(info);
		else if (ne == Cnd_inc_appl_flg) doCnd_inc_appl_flg_NE(info);
		else if (ne == Cnd_inc_not_cl_flg) doCnd_inc_not_cl_flg_NE(info);
		else if (ne == Cnd_rcv_schd_adjst_flg) doCnd_rcv_schd_adjst_flg_NE(info);
		else if (ne == Cnd_rfrnc_dt) doCnd_rfrnc_dt_NE(info);
		else if (ne == Cnd_key_flg) doCnd_key_flg_NE(info);
		else if (ne == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_NE(info);
		else if (ne == columnRslt_bill_dpt_nm) doRslt_bill_dpt_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_bcst_cd) doRslt_bcst_cd_NE(info);
		else if (ne == columnRslt_bcst_nm) doRslt_bcst_nm_NE(info);
		else if (ne == columnRslt_schd_act_rcv_dt) doRslt_schd_act_rcv_dt_NE(info);
		else if (ne == columnRslt_rcv_mtd_cd) doRslt_rcv_mtd_cd_NE(info);
		else if (ne == columnRslt_rcv_mtd_nm) doRslt_rcv_mtd_nm_NE(info);
		else if (ne == columnRslt_rcv_typ) doRslt_rcv_typ_NE(info);
		else if (ne == columnRslt_rcv_reg_typ) doRslt_rcv_reg_typ_NE(info);
		else if (ne == columnRslt_delay) doRslt_delay_NE(info);
		else if (ne == columnRslt_bill_ym) doRslt_bill_ym_NE(info);
		else if (ne == columnRslt_bill_cl_day) doRslt_bill_cl_day_NE(info);
		else if (ne == columnRslt_bill_dt) doRslt_bill_dt_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_amt_dec_place) doRslt_amt_dec_place_NE(info);
		else if (ne == columnRslt_bill_no) doRslt_bill_no_NE(info);
		else if (ne == columnRslt_iv_no) doRslt_iv_no_NE(info);
		else if (ne == columnRslt_rcst_cd) doRslt_rcst_cd_NE(info);
		else if (ne == columnRslt_rcst_nm) doRslt_rcst_nm_NE(info);
		else if (ne == columnRslt_rcv_schd_adjst_flg) doRslt_rcv_schd_adjst_flg_NE(info);
		else if (ne == columnRslt_adjst_flg) doRslt_adjst_flg_NE(info);
		else if (ne == columnRslt_bill_mng_no) doRslt_bill_mng_no_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_adjst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_adjst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adjst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adjst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_act_rcv_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_act_rcv_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_act_rcv_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_act_rcv_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_appl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_appl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_not_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_not_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_schd_adjst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_adjst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rfrnc_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rfrnc_dt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_act_rcv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_act_rcv_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_mtd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_mtd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_mtd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_mtd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_reg_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_reg_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[delay]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_delay_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_cl_day]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_day_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_schd_adjst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_schd_adjst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adjst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adjst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_mng_no_NE(MCEventInfo info){
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
		else if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_not_adjst_flg) doCnd_not_adjst_flg_NX(info);
		else if (nx == Cnd_adjst_flg) doCnd_adjst_flg_NX(info);
		else if (nx == Cnd_schd_act_rcv_dt_fr) doCnd_schd_act_rcv_dt_fr_NX(info);
		else if (nx == Cnd_schd_act_rcv_dt_to) doCnd_schd_act_rcv_dt_to_NX(info);
		else if (nx == Cnd_bcst_cd) doCnd_bcst_cd_NX(info);
		else if (nx == Cnd_bcst_nm) doCnd_bcst_nm_NX(info);
		else if (nx == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NX(info);
		else if (nx == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
		else if (nx == Cnd_bill_no) doCnd_bill_no_NX(info);
		else if (nx == Cnd_iv_no) doCnd_iv_no_NX(info);
		else if (nx == Cnd_rcst_cd) doCnd_rcst_cd_NX(info);
		else if (nx == Cnd_rcst_nm) doCnd_rcst_nm_NX(info);
		else if (nx == Cnd_dtl_flg) doCnd_dtl_flg_NX(info);
		else if (nx == Cnd_inc_appl_flg) doCnd_inc_appl_flg_NX(info);
		else if (nx == Cnd_inc_not_cl_flg) doCnd_inc_not_cl_flg_NX(info);
		else if (nx == Cnd_rcv_schd_adjst_flg) doCnd_rcv_schd_adjst_flg_NX(info);
		else if (nx == Cnd_rfrnc_dt) doCnd_rfrnc_dt_NX(info);
		else if (nx == Cnd_key_flg) doCnd_key_flg_NX(info);
		else if (nx == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_NX(info);
		else if (nx == columnRslt_bill_dpt_nm) doRslt_bill_dpt_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_bcst_cd) doRslt_bcst_cd_NX(info);
		else if (nx == columnRslt_bcst_nm) doRslt_bcst_nm_NX(info);
		else if (nx == columnRslt_schd_act_rcv_dt) doRslt_schd_act_rcv_dt_NX(info);
		else if (nx == columnRslt_rcv_mtd_cd) doRslt_rcv_mtd_cd_NX(info);
		else if (nx == columnRslt_rcv_mtd_nm) doRslt_rcv_mtd_nm_NX(info);
		else if (nx == columnRslt_rcv_typ) doRslt_rcv_typ_NX(info);
		else if (nx == columnRslt_rcv_reg_typ) doRslt_rcv_reg_typ_NX(info);
		else if (nx == columnRslt_delay) doRslt_delay_NX(info);
		else if (nx == columnRslt_bill_ym) doRslt_bill_ym_NX(info);
		else if (nx == columnRslt_bill_cl_day) doRslt_bill_cl_day_NX(info);
		else if (nx == columnRslt_bill_dt) doRslt_bill_dt_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_amt_dec_place) doRslt_amt_dec_place_NX(info);
		else if (nx == columnRslt_bill_no) doRslt_bill_no_NX(info);
		else if (nx == columnRslt_iv_no) doRslt_iv_no_NX(info);
		else if (nx == columnRslt_rcst_cd) doRslt_rcst_cd_NX(info);
		else if (nx == columnRslt_rcst_nm) doRslt_rcst_nm_NX(info);
		else if (nx == columnRslt_rcv_schd_adjst_flg) doRslt_rcv_schd_adjst_flg_NX(info);
		else if (nx == columnRslt_adjst_flg) doRslt_adjst_flg_NX(info);
		else if (nx == columnRslt_bill_mng_no) doRslt_bill_mng_no_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_adjst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_adjst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[adjst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_adjst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_act_rcv_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_act_rcv_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_act_rcv_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_act_rcv_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_appl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_appl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_not_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_not_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_schd_adjst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_adjst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rfrnc_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rfrnc_dt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[key_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_key_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_act_rcv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_act_rcv_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_mtd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_mtd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_mtd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_mtd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_reg_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_reg_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[delay]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_delay_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_cl_day]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_day_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_schd_adjst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_schd_adjst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adjst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adjst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_mng_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_schd_act_rcv_dt_fr) doCnd_schd_act_rcv_dt_fr_LC(info);
		else if (lc == Cnd_schd_act_rcv_dt_to) doCnd_schd_act_rcv_dt_to_LC(info);
		else if (lc == Cnd_bcst_cd) doCnd_bcst_cd_LC(info);
		else if (lc == Cnd_bcst_nm) doCnd_bcst_nm_LC(info);
		else if (lc == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_LC(info);
		else if (lc == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
		else if (lc == Cnd_bill_no) doCnd_bill_no_LC(info);
		else if (lc == Cnd_iv_no) doCnd_iv_no_LC(info);
		else if (lc == Cnd_rcst_cd) doCnd_rcst_cd_LC(info);
		else if (lc == Cnd_rcst_nm) doCnd_rcst_nm_LC(info);
		else if (lc == Cnd_rfrnc_dt) doCnd_rfrnc_dt_LC(info);
		else if (lc == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_LC(info);
		else if (lc == columnRslt_bill_dpt_nm) doRslt_bill_dpt_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_bcst_cd) doRslt_bcst_cd_LC(info);
		else if (lc == columnRslt_bcst_nm) doRslt_bcst_nm_LC(info);
		else if (lc == columnRslt_schd_act_rcv_dt) doRslt_schd_act_rcv_dt_LC(info);
		else if (lc == columnRslt_rcv_mtd_cd) doRslt_rcv_mtd_cd_LC(info);
		else if (lc == columnRslt_rcv_mtd_nm) doRslt_rcv_mtd_nm_LC(info);
		else if (lc == columnRslt_rcv_typ) doRslt_rcv_typ_LC(info);
		else if (lc == columnRslt_rcv_reg_typ) doRslt_rcv_reg_typ_LC(info);
		else if (lc == columnRslt_delay) doRslt_delay_LC(info);
		else if (lc == columnRslt_bill_ym) doRslt_bill_ym_LC(info);
		else if (lc == columnRslt_bill_cl_day) doRslt_bill_cl_day_LC(info);
		else if (lc == columnRslt_bill_dt) doRslt_bill_dt_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_amt_dec_place) doRslt_amt_dec_place_LC(info);
		else if (lc == columnRslt_bill_no) doRslt_bill_no_LC(info);
		else if (lc == columnRslt_iv_no) doRslt_iv_no_LC(info);
		else if (lc == columnRslt_rcst_cd) doRslt_rcst_cd_LC(info);
		else if (lc == columnRslt_rcst_nm) doRslt_rcst_nm_LC(info);
		else if (lc == columnRslt_bill_mng_no) doRslt_bill_mng_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[schd_act_rcv_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_act_rcv_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_act_rcv_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_act_rcv_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rfrnc_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rfrnc_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_act_rcv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_act_rcv_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_mtd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_mtd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_mtd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_mtd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_reg_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_reg_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[delay]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_delay_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_cl_day]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_day_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_mng_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_bcst_cd]の作成メソッド
	 */
	public MCList getCnd_bcst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bill_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_bill_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_trd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rcst_cd]の作成メソッド
	 */
	public MCList getCnd_rcst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBGL0070.Srch01")) {
			return new MS_MSBGL0070_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBGL0070_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0070_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0070_Srch01;

		/** コンストラクタ */
		protected MS_MSBGL0070_Srch01Bridge() {
			p_MS_MSBGL0070_Srch01 = new MCParam(PDef.MS_MSBGL0070_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0070_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0070.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0070.RsltR.class));

			p_MS_MSBGL0070_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0070_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0070_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0070_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0070_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0070.CndR up0() {
			return (mcframe.clientMSBG.MSBGP0070.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBG.MSBGP0070.RsltR> down0() {
			return (MCList<mcframe.clientMSBG.MSBGP0070.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0070_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0070.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0070_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBG.MSBGP0070.RsltR>)p_MS_MSBGL0070_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
}