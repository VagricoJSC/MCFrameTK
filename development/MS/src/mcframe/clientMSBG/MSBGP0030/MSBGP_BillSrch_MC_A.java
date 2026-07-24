package mcframe.clientMSBG.MSBGP0030;

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
import mcframe.clientMSBG.MSBGP0030.MSBGP_BillSrch_MC.MS_MSBGL0030_Srch01Caller;
import mcframe.clientMSBG.MSBGP0030.MSBGP_BillSrch_MC.MS_MSBGL0030_Prnt01Caller;

/**
 * 画面"MSBGP_BillSrch"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGP_BillSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBGP0030";

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
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Fold]ブロック関連のField定義
	public MCPanel FoldPanel = null;
	public MCTabbedPane FoldTab = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [TabSrch]ブロック関連のField定義
	public MCPanel TabSrchPanel = null;
	// [TabSrch]ブロックの項目のField定義
	// [CndClTyp]ブロック関連のField定義
	public MCPanel CndClTypPanel = null;
	public MCTitledBorder CndClTypTitledBorder = null;
	// [CndClTyp]ブロックの項目のField定義
	// [CndPrnt]ブロック関連のField定義
	public MCPanel CndPrntPanel = null;
	public MCTitledBorder CndPrntTitledBorder = null;
	// [CndPrnt]ブロックの項目のField定義
	// [CntryTyp]ブロック関連のField定義
	public MCPanel CntryTypPanel = null;
	public MCTitledBorder CntryTypTitledBorder = null;
	// [CntryTyp]ブロックの項目のField定義
	// [RcvSchdAdjst]ブロック関連のField定義
	public MCPanel RcvSchdAdjstPanel = null;
	public MCTitledBorder RcvSchdAdjstTitledBorder = null;
	// [RcvSchdAdjst]ブロックの項目のField定義
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * PRT,Issue report,1;REF,View,0 PRT,帳票発行,1;REF,参照する,0.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_PRT = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * Unprocessed 未処理.<p>
	 *
	 */
	public MCCheckBox Cnd_not_cl_flg = null;
	/**
	 * Batch closing バッチ締.<p>
	 *
	 */
	public MCCheckBox Cnd_cl_batch_flg = null;
	/**
	 * Screen closing 画面締.<p>
	 *
	 */
	public MCCheckBox Cnd_cl_scrn_flg = null;
	/**
	 * Billing per transaction 都度請求.<p>
	 *
	 */
	public MCCheckBox Cnd_each_sls_flg = null;
	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public MCCheckBox Cnd_not_prnt_flg = null;
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public MCCheckBox Cnd_prnt_flg = null;
	/**
	 * Domestic 国内.<p>
	 *
	 */
	public MCCheckBox Cnd_dmstic_flg = null;
	/**
	 * Foreign 国外.<p>
	 *
	 */
	public MCCheckBox Cnd_foreign_flg = null;
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
	/**
	 * For EDI ＥＤＩ対象.<p>
	 *
	 */
	public MCCheckBox Cnd_on_edi_flg = null;
	/**
	 * Not for EDI ＥＤＩ対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_off_edi_flg = null;
	public MCLabel Cnd_bill_cl_ym_from_Label = null;
	/**
	 * Billing month FROM 請求年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_bill_cl_ym_from = null;
	public MCLabel Cnd_bill_cl_ym_to_Label = null;
	/**
	 * Billing month TO 請求年月ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_bill_cl_ym_to = null;
	public MCLabel Cnd_bill_cl_day_Label = null;
	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCNumberField Cnd_bill_cl_day = null;
	public MCLabel Cnd_rcv_schd_dt_from_Label = null;
	/**
	 * Scheduled payment receipt date FROM 入金予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_rcv_schd_dt_from = null;
	public MCLabel Cnd_rcv_schd_dt_to_Label = null;
	/**
	 * Scheduled payment receipt date TO 入金予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_rcv_schd_dt_to = null;
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
	public MCLabel Cnd_pre_bill_no_Label = null;
	/**
	 * Advance invoice No. 先行請求書ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_pre_bill_no = null;
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
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Cnd_wrkno_p_PPanel;
	public MCTextField Cnd_wrk_no;	// [Cnd]の[wrkno_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[wrkno_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	/**
	 * Include records not to be billed 請求対象外含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_no_bill_flg = null;
	/**
	 * With temporary unit price 仮単価あり.<p>
	 *
	 */
	public MCCheckBox Cnd_interim_flg = null;
	/**
	 * Exclude not to issue 発行対象外を除く.<p>
	 *
	 */
	public MCCheckBox Cnd_not_prnt_ex_flg = null;
	/**
	 * Only for target of payment receipt schedule adjustment 入金予定調整対象のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_rcv_schd_adjst_flg = null;
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_billGrp_p_PPanel;
	public MCLabel Cnd_bp_grp_lab1;	// [Cnd]の[billGrp_p.bp_grp_lab1]を[Cnd_bp_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg1;	// [Cnd]の[billGrp_p.bp_grp_flg1]を[Cnd_bp_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd1;	// [Cnd]の[billGrp_p.bp_grp_cd1]を[Cnd_bp_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm1;	// [Cnd]の[billGrp_p.bp_grp_nm1]を[Cnd_bp_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab2;	// [Cnd]の[billGrp_p.bp_grp_lab2]を[Cnd_bp_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg2;	// [Cnd]の[billGrp_p.bp_grp_flg2]を[Cnd_bp_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd2;	// [Cnd]の[billGrp_p.bp_grp_cd2]を[Cnd_bp_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm2;	// [Cnd]の[billGrp_p.bp_grp_nm2]を[Cnd_bp_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab3;	// [Cnd]の[billGrp_p.bp_grp_lab3]を[Cnd_bp_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg3;	// [Cnd]の[billGrp_p.bp_grp_flg3]を[Cnd_bp_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd3;	// [Cnd]の[billGrp_p.bp_grp_cd3]を[Cnd_bp_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm3;	// [Cnd]の[billGrp_p.bp_grp_nm3]を[Cnd_bp_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab4;	// [Cnd]の[billGrp_p.bp_grp_lab4]を[Cnd_bp_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg4;	// [Cnd]の[billGrp_p.bp_grp_flg4]を[Cnd_bp_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd4;	// [Cnd]の[billGrp_p.bp_grp_cd4]を[Cnd_bp_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm4;	// [Cnd]の[billGrp_p.bp_grp_nm4]を[Cnd_bp_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab5;	// [Cnd]の[billGrp_p.bp_grp_lab5]を[Cnd_bp_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg5;	// [Cnd]の[billGrp_p.bp_grp_flg5]を[Cnd_bp_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd5;	// [Cnd]の[billGrp_p.bp_grp_cd5]を[Cnd_bp_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm5;	// [Cnd]の[billGrp_p.bp_grp_nm5]を[Cnd_bp_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab6;	// [Cnd]の[billGrp_p.bp_grp_lab6]を[Cnd_bp_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg6;	// [Cnd]の[billGrp_p.bp_grp_flg6]を[Cnd_bp_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd6;	// [Cnd]の[billGrp_p.bp_grp_cd6]を[Cnd_bp_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm6;	// [Cnd]の[billGrp_p.bp_grp_nm6]を[Cnd_bp_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab7;	// [Cnd]の[billGrp_p.bp_grp_lab7]を[Cnd_bp_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg7;	// [Cnd]の[billGrp_p.bp_grp_flg7]を[Cnd_bp_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd7;	// [Cnd]の[billGrp_p.bp_grp_cd7]を[Cnd_bp_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm7;	// [Cnd]の[billGrp_p.bp_grp_nm7]を[Cnd_bp_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab8;	// [Cnd]の[billGrp_p.bp_grp_lab8]を[Cnd_bp_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg8;	// [Cnd]の[billGrp_p.bp_grp_flg8]を[Cnd_bp_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd8;	// [Cnd]の[billGrp_p.bp_grp_cd8]を[Cnd_bp_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm8;	// [Cnd]の[billGrp_p.bp_grp_nm8]を[Cnd_bp_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab9;	// [Cnd]の[billGrp_p.bp_grp_lab9]を[Cnd_bp_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg9;	// [Cnd]の[billGrp_p.bp_grp_flg9]を[Cnd_bp_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd9;	// [Cnd]の[billGrp_p.bp_grp_cd9]を[Cnd_bp_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm9;	// [Cnd]の[billGrp_p.bp_grp_nm9]を[Cnd_bp_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab10;	// [Cnd]の[billGrp_p.bp_grp_lab10]を[Cnd_bp_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg10;	// [Cnd]の[billGrp_p.bp_grp_flg10]を[Cnd_bp_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd10;	// [Cnd]の[billGrp_p.bp_grp_cd10]を[Cnd_bp_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm10;	// [Cnd]の[billGrp_p.bp_grp_nm10]を[Cnd_bp_grp_nm10]としてエイリアス定義。
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
	public MCTable2<mcframe.clientMSBG.MSBGP0030.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Billing management No. 請求管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_mng_no = null;
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_prnt_flg = null;
	/**
	 * Billing month 請求年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_cl_ym = null;
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
	 * Foreign 国外.<p>
	 *
	 */
	public MCColumnConfig columnRslt_foreign_flg = null;
	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_no = null;
	/**
	 * Invoice rev. number 請求書改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_rev = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_no = null;
	/**
	 * Advance invoice No. 先行請求書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pre_bill_no = null;
	public mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D Rslt_wrkno_p_PPanel;
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[wrkno_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[wrkno_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_schd_dt = null;
	/**
	 * Multiple 複数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_multi_flg = null;
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
	 * Advance billing date 先行請求日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pre_bill_dt = null;
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
	 * Billing exchange rate 請求為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_xrate = null;
	/**
	 * With temporary unit price 仮単価あり.<p>
	 *
	 */
	public MCColumnConfig columnRslt_interim_flg = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_lastBillAmt_p_PPanel;
	public MCColumnConfig columnRslt_last_bill_amt;// [Rslt]の[lastBillAmt_p.amt]を[columnRslt_last_bill_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_rcvAmt_p_PPanel;
	public MCColumnConfig columnRslt_rcv_amt;// [Rslt]の[rcvAmt_p.amt]を[columnRslt_rcv_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_bfwAmt_p_PPanel;
	public MCColumnConfig columnRslt_bfw_amt;// [Rslt]の[bfwAmt_p.amt]を[columnRslt_bfw_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_slsAmt_p_PPanel;
	public MCColumnConfig columnRslt_sls_amt;// [Rslt]の[slsAmt_p.amt]を[columnRslt_sls_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_retAmt_p_PPanel;
	public MCColumnConfig columnRslt_ret_amt;// [Rslt]の[retAmt_p.amt]を[columnRslt_ret_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_dscntAmt_p_PPanel;
	public MCColumnConfig columnRslt_dscnt_amt;// [Rslt]の[dscntAmt_p.amt]を[columnRslt_dscnt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_setoffAmt_p_PPanel;
	public MCColumnConfig columnRslt_setoff_amt;// [Rslt]の[setoffAmt_p.amt]を[columnRslt_setoff_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_taxAmt_p_PPanel;
	public MCColumnConfig columnRslt_tax_amt;// [Rslt]の[taxAmt_p.amt]を[columnRslt_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_swToAmt_p_PPanel;
	public MCColumnConfig columnRslt_sw_to_amt;// [Rslt]の[swToAmt_p.amt]を[columnRslt_sw_to_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_billAmt_p_PPanel;
	public MCColumnConfig columnRslt_bill_amt;// [Rslt]の[billAmt_p.amt]を[columnRslt_bill_amt]としてエイリアス定義。
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt_dec_place = null;
	/**
	 * Billing closing status type 請求締状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_cl_sts_typ = null;
	/**
	 * Billing closing status type name 請求締状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_cl_sts_typ_nm = null;
	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_edi_flg = null;
	/**
	 * Processed 処理済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sort_ord_flg = null;
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
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_billGrp_p_PPanel;
	public MCColumnConfig columnRslt_bp_grp_cd1;// [Rslt]の[billGrp_p.bp_grp_cd1]を[columnRslt_bp_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm1;// [Rslt]の[billGrp_p.bp_grp_nm1]を[columnRslt_bp_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd2;// [Rslt]の[billGrp_p.bp_grp_cd2]を[columnRslt_bp_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm2;// [Rslt]の[billGrp_p.bp_grp_nm2]を[columnRslt_bp_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd3;// [Rslt]の[billGrp_p.bp_grp_cd3]を[columnRslt_bp_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm3;// [Rslt]の[billGrp_p.bp_grp_nm3]を[columnRslt_bp_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd4;// [Rslt]の[billGrp_p.bp_grp_cd4]を[columnRslt_bp_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm4;// [Rslt]の[billGrp_p.bp_grp_nm4]を[columnRslt_bp_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd5;// [Rslt]の[billGrp_p.bp_grp_cd5]を[columnRslt_bp_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm5;// [Rslt]の[billGrp_p.bp_grp_nm5]を[columnRslt_bp_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd6;// [Rslt]の[billGrp_p.bp_grp_cd6]を[columnRslt_bp_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm6;// [Rslt]の[billGrp_p.bp_grp_nm6]を[columnRslt_bp_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd7;// [Rslt]の[billGrp_p.bp_grp_cd7]を[columnRslt_bp_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm7;// [Rslt]の[billGrp_p.bp_grp_nm7]を[columnRslt_bp_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd8;// [Rslt]の[billGrp_p.bp_grp_cd8]を[columnRslt_bp_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm8;// [Rslt]の[billGrp_p.bp_grp_nm8]を[columnRslt_bp_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd9;// [Rslt]の[billGrp_p.bp_grp_cd9]を[columnRslt_bp_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm9;// [Rslt]の[billGrp_p.bp_grp_nm9]を[columnRslt_bp_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd10;// [Rslt]の[billGrp_p.bp_grp_cd10]を[columnRslt_bp_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm10;// [Rslt]の[billGrp_p.bp_grp_nm10]を[columnRslt_bp_grp_nm10]としてエイリアス定義。
	/**
	 * Sales temporary unit price closing 売上仮単価締.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_interim_cl_flg = null;
	/**
	 * Number of details 明細件数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_d_cnt = null;
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
	 * Billing details list 請求明細照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBGP0040 = null;
	/**
	 * Payment receipt schedule adjustment 入金予定調整.<p>
	 *
	 */
	public MCButton Btn_open_MSBGP0080 = null;
	/**
	 * Correction of sales details 売上明細訂正.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP1370 = null;
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
	 * Invoice 請求書.<p>
	 *
	 */
	public MCButton Btn_prnt = null;
	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public MCCheckBox Btn_indiv_prnt_flg = null;
	// [Edi]ブロック関連のField定義
	public MCPanel EdiPanel = null;
	public MCTitledBorder EdiTitledBorder = null;
	// [Edi]ブロックの項目のField定義
	/** [SRCH_REF]モードを表す定数 */
	public static final String SRCH_REF = "SRCH_REF";
	/** [SRCH_PRNT]モードを表す定数 */
	public static final String SRCH_PRNT = "SRCH_PRNT";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [PRNT]モードを表す定数 */
	public static final String PRNT = "PRNT";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_REF, SRCH_PRNT, REF, PRNT};
	
	/** [MS_MSBGL0030_Srch01]のCallerの作成 */
	protected MSBGP_BillSrch_MC.MS_MSBGL0030_Srch01Caller createMS_MSBGL0030_Srch01() {
		MSBGP_BillSrch_MC.MS_MSBGL0030_Srch01Caller<MSBGP_BillSrch, MS_MSBGL0030_Srch01Bridge>
		caller = ((MSBGP_BillSrch_MC)this).new MS_MSBGL0030_Srch01Caller<MSBGP_BillSrch, MS_MSBGL0030_Srch01Bridge>(
					(MSBGP_BillSrch)this, new MS_MSBGL0030_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBGL0030_Srch01]の呼び出し */
	protected void callMS_MSBGL0030_Srch01() {
		MCCaller caller = createMS_MSBGL0030_Srch01();
		caller.exec();
	}
	/** [MS_MSBGL0030_Prnt01]のCallerの作成 */
	protected MSBGP_BillSrch_MC.MS_MSBGL0030_Prnt01Caller createMS_MSBGL0030_Prnt01() {
		MSBGP_BillSrch_MC.MS_MSBGL0030_Prnt01Caller<MSBGP_BillSrch, MS_MSBGL0030_Prnt01Bridge>
		caller = ((MSBGP_BillSrch_MC)this).new MS_MSBGL0030_Prnt01Caller<MSBGP_BillSrch, MS_MSBGL0030_Prnt01Bridge>(
					(MSBGP_BillSrch)this, new MS_MSBGL0030_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBGL0030_Prnt01]の呼び出し */
	protected void callMS_MSBGL0030_Prnt01() {
		MCCaller caller = createMS_MSBGL0030_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0030.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0030.RsltR> aRsltL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0030.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBG.MSBGP0030.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0030.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0030.CndR createCndR() {
		return mcframe.clientMSBG.MSBGP0030.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBG.MSBGP0030.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0030.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBG.MSBGP0030.RsltR createRsltR() {
		return mcframe.clientMSBG.MSBGP0030.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0030.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0030.RsltR.class);
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
	public void setBtnR(mcframe.clientMSBG.MSBGP0030.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBG.MSBGP0030.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBG.MSBGP0030.BtnR createBtnR() {
		return mcframe.clientMSBG.MSBGP0030.BtnR.create();
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
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(TabSrchPanel);
		ret.add(CndClTypPanel);
		ret.add(CndPrntPanel);
		ret.add(CntryTypPanel);
		ret.add(RcvSchdAdjstPanel);
		ret.add(Cnd2Panel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		ret.add(EdiPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_BillSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBGP_BillSrch_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
		aBtnR = createBtnR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBGP_BillSrch_MC.jbCreateScreenOpe((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbCreateTop((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbCreateFold((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbCreateTabSrch((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbCreateCndClTyp((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbCreateCndPrnt((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbCreateCntryTyp((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbCreateRcvSchdAdjst((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbCreateCnd2((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbCreateCnd((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbCreateCtrl((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbCreateRPnl((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbCreateRslt((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbCreateBtn((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbCreateEdi((MSBGP_BillSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBGP_BillSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBGP_BillSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBGP_BillSrch p) {
	}

	/**
	 * [TabSrch]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTabSrch(MSBGP_BillSrch p) {
	}

	/**
	 * [CndClTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCndClTyp(MSBGP_BillSrch p) {
	}

	/**
	 * [CndPrnt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCndPrnt(MSBGP_BillSrch p) {
	}

	/**
	 * [CntryTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCntryTyp(MSBGP_BillSrch p) {
	}

	/**
	 * [RcvSchdAdjst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRcvSchdAdjst(MSBGP_BillSrch p) {
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MSBGP_BillSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBGP_BillSrch p) {
		p.Cnd_wrkno_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getCndR().wrkno_p());
		p.Cnd_wrkno_p_PPanel.setName("Cnd.wrkno_p");
		p.Cnd_wrk_no = p.Cnd_wrkno_p_PPanel.WrkNo_wrk_no;
		p.Cnd_wrk_no.addAliasName("Cnd.wrk_no", p);
		p.Cnd_wrk_nm = p.Cnd_wrkno_p_PPanel.WrkNo_wrk_nm;
		p.Cnd_wrk_nm.addAliasName("Cnd.wrk_nm", p);
		p.Cnd_billGrp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().billGrp_p());
		p.Cnd_billGrp_p_PPanel.setName("Cnd.billGrp_p");
		p.Cnd_bp_grp_lab1 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_bp_grp_lab1.addAliasName("Cnd.bp_grp_lab1", p);
		p.Cnd_bp_grp_flg1 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_bp_grp_flg1.addAliasName("Cnd.bp_grp_flg1", p);
		p.Cnd_bp_grp_cd1 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_bp_grp_cd1.addAliasName("Cnd.bp_grp_cd1", p);
		p.Cnd_bp_grp_nm1 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_bp_grp_nm1.addAliasName("Cnd.bp_grp_nm1", p);
		p.Cnd_bp_grp_lab2 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_bp_grp_lab2.addAliasName("Cnd.bp_grp_lab2", p);
		p.Cnd_bp_grp_flg2 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_bp_grp_flg2.addAliasName("Cnd.bp_grp_flg2", p);
		p.Cnd_bp_grp_cd2 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_bp_grp_cd2.addAliasName("Cnd.bp_grp_cd2", p);
		p.Cnd_bp_grp_nm2 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_bp_grp_nm2.addAliasName("Cnd.bp_grp_nm2", p);
		p.Cnd_bp_grp_lab3 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_bp_grp_lab3.addAliasName("Cnd.bp_grp_lab3", p);
		p.Cnd_bp_grp_flg3 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_bp_grp_flg3.addAliasName("Cnd.bp_grp_flg3", p);
		p.Cnd_bp_grp_cd3 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_bp_grp_cd3.addAliasName("Cnd.bp_grp_cd3", p);
		p.Cnd_bp_grp_nm3 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_bp_grp_nm3.addAliasName("Cnd.bp_grp_nm3", p);
		p.Cnd_bp_grp_lab4 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_bp_grp_lab4.addAliasName("Cnd.bp_grp_lab4", p);
		p.Cnd_bp_grp_flg4 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_bp_grp_flg4.addAliasName("Cnd.bp_grp_flg4", p);
		p.Cnd_bp_grp_cd4 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_bp_grp_cd4.addAliasName("Cnd.bp_grp_cd4", p);
		p.Cnd_bp_grp_nm4 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_bp_grp_nm4.addAliasName("Cnd.bp_grp_nm4", p);
		p.Cnd_bp_grp_lab5 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_bp_grp_lab5.addAliasName("Cnd.bp_grp_lab5", p);
		p.Cnd_bp_grp_flg5 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_bp_grp_flg5.addAliasName("Cnd.bp_grp_flg5", p);
		p.Cnd_bp_grp_cd5 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_bp_grp_cd5.addAliasName("Cnd.bp_grp_cd5", p);
		p.Cnd_bp_grp_nm5 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_bp_grp_nm5.addAliasName("Cnd.bp_grp_nm5", p);
		p.Cnd_bp_grp_lab6 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_bp_grp_lab6.addAliasName("Cnd.bp_grp_lab6", p);
		p.Cnd_bp_grp_flg6 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_bp_grp_flg6.addAliasName("Cnd.bp_grp_flg6", p);
		p.Cnd_bp_grp_cd6 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_bp_grp_cd6.addAliasName("Cnd.bp_grp_cd6", p);
		p.Cnd_bp_grp_nm6 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_bp_grp_nm6.addAliasName("Cnd.bp_grp_nm6", p);
		p.Cnd_bp_grp_lab7 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_bp_grp_lab7.addAliasName("Cnd.bp_grp_lab7", p);
		p.Cnd_bp_grp_flg7 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_bp_grp_flg7.addAliasName("Cnd.bp_grp_flg7", p);
		p.Cnd_bp_grp_cd7 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_bp_grp_cd7.addAliasName("Cnd.bp_grp_cd7", p);
		p.Cnd_bp_grp_nm7 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_bp_grp_nm7.addAliasName("Cnd.bp_grp_nm7", p);
		p.Cnd_bp_grp_lab8 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_bp_grp_lab8.addAliasName("Cnd.bp_grp_lab8", p);
		p.Cnd_bp_grp_flg8 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_bp_grp_flg8.addAliasName("Cnd.bp_grp_flg8", p);
		p.Cnd_bp_grp_cd8 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_bp_grp_cd8.addAliasName("Cnd.bp_grp_cd8", p);
		p.Cnd_bp_grp_nm8 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_bp_grp_nm8.addAliasName("Cnd.bp_grp_nm8", p);
		p.Cnd_bp_grp_lab9 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_bp_grp_lab9.addAliasName("Cnd.bp_grp_lab9", p);
		p.Cnd_bp_grp_flg9 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_bp_grp_flg9.addAliasName("Cnd.bp_grp_flg9", p);
		p.Cnd_bp_grp_cd9 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_bp_grp_cd9.addAliasName("Cnd.bp_grp_cd9", p);
		p.Cnd_bp_grp_nm9 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_bp_grp_nm9.addAliasName("Cnd.bp_grp_nm9", p);
		p.Cnd_bp_grp_lab10 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_bp_grp_lab10.addAliasName("Cnd.bp_grp_lab10", p);
		p.Cnd_bp_grp_flg10 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_bp_grp_flg10.addAliasName("Cnd.bp_grp_flg10", p);
		p.Cnd_bp_grp_cd10 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_bp_grp_cd10.addAliasName("Cnd.bp_grp_cd10", p);
		p.Cnd_bp_grp_nm10 = p.Cnd_billGrp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_bp_grp_nm10.addAliasName("Cnd.bp_grp_nm10", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBGP_BillSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBGP_BillSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBGP_BillSrch p) {
		p.Rslt_wrkno_p_PPanel = mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.create(mcframe.clientMSBG.MSBGP0030.RsltR.$wrkno_p);
		p.Rslt_wrkno_p_PPanel.setName("Rslt.wrkno_p");
		p.columnRslt_wrk_no = p.Rslt_wrkno_p_PPanel.columnWrkNo_wrk_no;
		p.columnRslt_wrk_no.addAliasName("Rslt.wrk_no", p);
		p.columnRslt_wrk_nm = p.Rslt_wrkno_p_PPanel.columnWrkNo_wrk_nm;
		p.columnRslt_wrk_nm.addAliasName("Rslt.wrk_nm", p);
		p.Rslt_lastBillAmt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0030.RsltR.$lastBillAmt_p);
		p.Rslt_lastBillAmt_p_PPanel.setName("Rslt.lastBillAmt_p");
		p.columnRslt_last_bill_amt = p.Rslt_lastBillAmt_p_PPanel.columnAmt_amt;
		p.columnRslt_last_bill_amt.addAliasName("Rslt.last_bill_amt", p);
		p.Rslt_rcvAmt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0030.RsltR.$rcvAmt_p);
		p.Rslt_rcvAmt_p_PPanel.setName("Rslt.rcvAmt_p");
		p.columnRslt_rcv_amt = p.Rslt_rcvAmt_p_PPanel.columnAmt_amt;
		p.columnRslt_rcv_amt.addAliasName("Rslt.rcv_amt", p);
		p.Rslt_bfwAmt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0030.RsltR.$bfwAmt_p);
		p.Rslt_bfwAmt_p_PPanel.setName("Rslt.bfwAmt_p");
		p.columnRslt_bfw_amt = p.Rslt_bfwAmt_p_PPanel.columnAmt_amt;
		p.columnRslt_bfw_amt.addAliasName("Rslt.bfw_amt", p);
		p.Rslt_slsAmt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0030.RsltR.$slsAmt_p);
		p.Rslt_slsAmt_p_PPanel.setName("Rslt.slsAmt_p");
		p.columnRslt_sls_amt = p.Rslt_slsAmt_p_PPanel.columnAmt_amt;
		p.columnRslt_sls_amt.addAliasName("Rslt.sls_amt", p);
		p.Rslt_retAmt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0030.RsltR.$retAmt_p);
		p.Rslt_retAmt_p_PPanel.setName("Rslt.retAmt_p");
		p.columnRslt_ret_amt = p.Rslt_retAmt_p_PPanel.columnAmt_amt;
		p.columnRslt_ret_amt.addAliasName("Rslt.ret_amt", p);
		p.Rslt_dscntAmt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0030.RsltR.$dscntAmt_p);
		p.Rslt_dscntAmt_p_PPanel.setName("Rslt.dscntAmt_p");
		p.columnRslt_dscnt_amt = p.Rslt_dscntAmt_p_PPanel.columnAmt_amt;
		p.columnRslt_dscnt_amt.addAliasName("Rslt.dscnt_amt", p);
		p.Rslt_setoffAmt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0030.RsltR.$setoffAmt_p);
		p.Rslt_setoffAmt_p_PPanel.setName("Rslt.setoffAmt_p");
		p.columnRslt_setoff_amt = p.Rslt_setoffAmt_p_PPanel.columnAmt_amt;
		p.columnRslt_setoff_amt.addAliasName("Rslt.setoff_amt", p);
		p.Rslt_taxAmt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0030.RsltR.$taxAmt_p);
		p.Rslt_taxAmt_p_PPanel.setName("Rslt.taxAmt_p");
		p.columnRslt_tax_amt = p.Rslt_taxAmt_p_PPanel.columnAmt_amt;
		p.columnRslt_tax_amt.addAliasName("Rslt.tax_amt", p);
		p.Rslt_swToAmt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0030.RsltR.$swToAmt_p);
		p.Rslt_swToAmt_p_PPanel.setName("Rslt.swToAmt_p");
		p.columnRslt_sw_to_amt = p.Rslt_swToAmt_p_PPanel.columnAmt_amt;
		p.columnRslt_sw_to_amt.addAliasName("Rslt.sw_to_amt", p);
		p.Rslt_billAmt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0030.RsltR.$billAmt_p);
		p.Rslt_billAmt_p_PPanel.setName("Rslt.billAmt_p");
		p.columnRslt_bill_amt = p.Rslt_billAmt_p_PPanel.columnAmt_amt;
		p.columnRslt_bill_amt.addAliasName("Rslt.bill_amt", p);
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBG.MSBGP0030.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
		p.Rslt_billGrp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBG.MSBGP0030.RsltR.$billGrp_p);
		p.Rslt_billGrp_p_PPanel.setName("Rslt.billGrp_p");
		p.columnRslt_bp_grp_cd1 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_bp_grp_cd1.addAliasName("Rslt.bp_grp_cd1", p);
		p.columnRslt_bp_grp_nm1 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_bp_grp_nm1.addAliasName("Rslt.bp_grp_nm1", p);
		p.columnRslt_bp_grp_cd2 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_bp_grp_cd2.addAliasName("Rslt.bp_grp_cd2", p);
		p.columnRslt_bp_grp_nm2 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_bp_grp_nm2.addAliasName("Rslt.bp_grp_nm2", p);
		p.columnRslt_bp_grp_cd3 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_bp_grp_cd3.addAliasName("Rslt.bp_grp_cd3", p);
		p.columnRslt_bp_grp_nm3 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_bp_grp_nm3.addAliasName("Rslt.bp_grp_nm3", p);
		p.columnRslt_bp_grp_cd4 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_bp_grp_cd4.addAliasName("Rslt.bp_grp_cd4", p);
		p.columnRslt_bp_grp_nm4 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_bp_grp_nm4.addAliasName("Rslt.bp_grp_nm4", p);
		p.columnRslt_bp_grp_cd5 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_bp_grp_cd5.addAliasName("Rslt.bp_grp_cd5", p);
		p.columnRslt_bp_grp_nm5 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_bp_grp_nm5.addAliasName("Rslt.bp_grp_nm5", p);
		p.columnRslt_bp_grp_cd6 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_bp_grp_cd6.addAliasName("Rslt.bp_grp_cd6", p);
		p.columnRslt_bp_grp_nm6 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_bp_grp_nm6.addAliasName("Rslt.bp_grp_nm6", p);
		p.columnRslt_bp_grp_cd7 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_bp_grp_cd7.addAliasName("Rslt.bp_grp_cd7", p);
		p.columnRslt_bp_grp_nm7 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_bp_grp_nm7.addAliasName("Rslt.bp_grp_nm7", p);
		p.columnRslt_bp_grp_cd8 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_bp_grp_cd8.addAliasName("Rslt.bp_grp_cd8", p);
		p.columnRslt_bp_grp_nm8 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_bp_grp_nm8.addAliasName("Rslt.bp_grp_nm8", p);
		p.columnRslt_bp_grp_cd9 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_bp_grp_cd9.addAliasName("Rslt.bp_grp_cd9", p);
		p.columnRslt_bp_grp_nm9 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_bp_grp_nm9.addAliasName("Rslt.bp_grp_nm9", p);
		p.columnRslt_bp_grp_cd10 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_bp_grp_cd10.addAliasName("Rslt.bp_grp_cd10", p);
		p.columnRslt_bp_grp_nm10 = p.Rslt_billGrp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_bp_grp_nm10.addAliasName("Rslt.bp_grp_nm10", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBGP_BillSrch p) {
	}

	/**
	 * [Edi]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEdi(MSBGP_BillSrch p) {
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
			Cnd_trd_cur_cd_p = createCnd_trd_cur_cd_ListPutter(Cnd_trd_cur_cd, "trd_cur_cd", "trd_cur_nm");

		}
		return Cnd_trd_cur_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_BillSrch create(){
		MSBGP_BillSrch p = new MSBGP_BillSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_BillSrch create(String name){
		MSBGP_BillSrch p = new MSBGP_BillSrch(name);
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
		MSBGP_BillSrch_MC.jbfInitScreenOpe((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbfInitTop((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbfInitFold((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbfInitTabSrch((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbfInitCndClTyp((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbfInitCndPrnt((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbfInitCntryTyp((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbfInitRcvSchdAdjst((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbfInitCnd2((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbfInitCnd((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbfInitCtrl((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbfInitRPnl((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbfInitRslt((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbfInitBtn((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbfInitEdi((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbInitScreenOpe((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbInitTop((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbInitFold((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbInitTabSrch((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbInitCndClTyp((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbInitCndPrnt((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbInitCntryTyp((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbInitRcvSchdAdjst((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbInitCnd2((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbInitCnd((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbInitCtrl((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbInitRPnl((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbInitRslt((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbInitBtn((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.jbInitEdi((MSBGP_BillSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldTab = p.beansFactory.createTabbedPane("Fold.tab");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [TabSrch]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTabSrch(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.TabSrchPanel = p.beansFactory.createPanel("TabSrch");
		// ブロックの項目の初期化
	}

	/**
	 * [CndClTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCndClTyp(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.CndClTypPanel = p.beansFactory.createPanel("CndClTyp");
		p.CndClTypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [CndPrnt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCndPrnt(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.CndPrntPanel = p.beansFactory.createPanel("CndPrnt");
		p.CndPrntTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [CntryTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCntryTyp(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.CntryTypPanel = p.beansFactory.createPanel("CntryTyp");
		p.CntryTypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [RcvSchdAdjst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRcvSchdAdjst(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.RcvSchdAdjstPanel = p.beansFactory.createPanel("RcvSchdAdjst");
		p.RcvSchdAdjstTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_PRT = p.beansFactory.createRadioButton("Cnd.ope_PRT");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_not_cl_flg = p.beansFactory.createCheckBox("Cnd.not_cl_flg");
		p.Cnd_cl_batch_flg = p.beansFactory.createCheckBox("Cnd.cl_batch_flg");
		p.Cnd_cl_scrn_flg = p.beansFactory.createCheckBox("Cnd.cl_scrn_flg");
		p.Cnd_each_sls_flg = p.beansFactory.createCheckBox("Cnd.each_sls_flg");
		p.Cnd_not_prnt_flg = p.beansFactory.createCheckBox("Cnd.not_prnt_flg");
		p.Cnd_prnt_flg = p.beansFactory.createCheckBox("Cnd.prnt_flg");
		p.Cnd_dmstic_flg = p.beansFactory.createCheckBox("Cnd.dmstic_flg");
		p.Cnd_foreign_flg = p.beansFactory.createCheckBox("Cnd.foreign_flg");
		p.Cnd_not_adjst_flg = p.beansFactory.createCheckBox("Cnd.not_adjst_flg");
		p.Cnd_adjst_flg = p.beansFactory.createCheckBox("Cnd.adjst_flg");
		p.Cnd_on_edi_flg = p.beansFactory.createCheckBox("Cnd.on_edi_flg");
		p.Cnd_off_edi_flg = p.beansFactory.createCheckBox("Cnd.off_edi_flg");
		p.Cnd_bill_cl_ym_from_Label = p.beansFactory.createLabel("Cnd.bill_cl_ym_from_Label");
		p.Cnd_bill_cl_ym_from = p.beansFactory.createDateField("Cnd.bill_cl_ym_from");
		p.Cnd_bill_cl_ym_from.setLabel(p.Cnd_bill_cl_ym_from_Label);
		p.Cnd_bill_cl_ym_to_Label = p.beansFactory.createLabel("Cnd.bill_cl_ym_to_Label");
		p.Cnd_bill_cl_ym_to = p.beansFactory.createDateField("Cnd.bill_cl_ym_to");
		p.Cnd_bill_cl_ym_to.setLabel(p.Cnd_bill_cl_ym_to_Label);
		p.Cnd_bill_cl_day_Label = p.beansFactory.createLabel("Cnd.bill_cl_day_Label");
		p.Cnd_bill_cl_day = p.beansFactory.createNumberField("Cnd.bill_cl_day");
		p.Cnd_bill_cl_day.setLabel(p.Cnd_bill_cl_day_Label);
		p.Cnd_rcv_schd_dt_from_Label = p.beansFactory.createLabel("Cnd.rcv_schd_dt_from_Label");
		p.Cnd_rcv_schd_dt_from = p.beansFactory.createDateField("Cnd.rcv_schd_dt_from");
		p.Cnd_rcv_schd_dt_from.setLabel(p.Cnd_rcv_schd_dt_from_Label);
		p.Cnd_rcv_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.rcv_schd_dt_to_Label");
		p.Cnd_rcv_schd_dt_to = p.beansFactory.createDateField("Cnd.rcv_schd_dt_to");
		p.Cnd_rcv_schd_dt_to.setLabel(p.Cnd_rcv_schd_dt_to_Label);
		p.Cnd_bill_dpt_cd_Label = p.beansFactory.createLabel("Cnd.bill_dpt_cd_Label");
		p.Cnd_bill_dpt_cd = p.beansFactory.createTextField("Cnd.bill_dpt_cd");
		p.Cnd_bill_dpt_cd.setLabel(p.Cnd_bill_dpt_cd_Label);
		p.Cnd_bill_dpt_nm = p.beansFactory.createTextField("Cnd.bill_dpt_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_bcst_cd_Label = p.beansFactory.createLabel("Cnd.bcst_cd_Label");
		p.Cnd_bcst_cd = p.beansFactory.createTextField("Cnd.bcst_cd");
		p.Cnd_bcst_cd.setLabel(p.Cnd_bcst_cd_Label);
		p.Cnd_bcst_nm = p.beansFactory.createTextField("Cnd.bcst_nm");
		p.Cnd_bill_no_Label = p.beansFactory.createLabel("Cnd.bill_no_Label");
		p.Cnd_bill_no = p.beansFactory.createTextField("Cnd.bill_no");
		p.Cnd_bill_no.setLabel(p.Cnd_bill_no_Label);
		p.Cnd_iv_no_Label = p.beansFactory.createLabel("Cnd.iv_no_Label");
		p.Cnd_iv_no = p.beansFactory.createTextField("Cnd.iv_no");
		p.Cnd_iv_no.setLabel(p.Cnd_iv_no_Label);
		p.Cnd_pre_bill_no_Label = p.beansFactory.createLabel("Cnd.pre_bill_no_Label");
		p.Cnd_pre_bill_no = p.beansFactory.createTextField("Cnd.pre_bill_no");
		p.Cnd_pre_bill_no.setLabel(p.Cnd_pre_bill_no_Label);
		p.Cnd_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.trd_cur_cd_Label");
		p.Cnd_trd_cur_cd = p.beansFactory.createTextComboBox("Cnd.trd_cur_cd");
		p.Cnd_trd_cur_cd.setLabel(p.Cnd_trd_cur_cd_Label);
		p.Cnd_trd_cur_nm = p.beansFactory.createTextField("Cnd.trd_cur_nm");
		p.Cnd_inc_no_bill_flg = p.beansFactory.createCheckBox("Cnd.inc_no_bill_flg");
		p.Cnd_interim_flg = p.beansFactory.createCheckBox("Cnd.interim_flg");
		p.Cnd_not_prnt_ex_flg = p.beansFactory.createCheckBox("Cnd.not_prnt_ex_flg");
		p.Cnd_rcv_schd_adjst_flg = p.beansFactory.createCheckBox("Cnd.rcv_schd_adjst_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_bill_mng_no = p.beansFactory.createTableColumn("Rslt.bill_mng_no", MCColumnType.TEXT);
		p.columnRslt_prnt_flg = p.beansFactory.createTableColumn("Rslt.prnt_flg", MCColumnType.CHECK);
		p.columnRslt_bill_cl_ym = p.beansFactory.createTableColumn("Rslt.bill_cl_ym", MCColumnType.DATE);
		p.columnRslt_bill_dpt_cd = p.beansFactory.createTableColumn("Rslt.bill_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_bill_dpt_nm = p.beansFactory.createTableColumn("Rslt.bill_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_bcst_cd = p.beansFactory.createTableColumn("Rslt.bcst_cd", MCColumnType.TEXT);
		p.columnRslt_bcst_nm = p.beansFactory.createTableColumn("Rslt.bcst_nm", MCColumnType.TEXT);
		p.columnRslt_foreign_flg = p.beansFactory.createTableColumn("Rslt.foreign_flg", MCColumnType.CHECK);
		p.columnRslt_bill_no = p.beansFactory.createTableColumn("Rslt.bill_no", MCColumnType.TEXT);
		p.columnRslt_bill_rev = p.beansFactory.createTableColumn("Rslt.bill_rev", MCColumnType.NUMBER);
		p.columnRslt_iv_no = p.beansFactory.createTableColumn("Rslt.iv_no", MCColumnType.TEXT);
		p.columnRslt_pre_bill_no = p.beansFactory.createTableColumn("Rslt.pre_bill_no", MCColumnType.TEXT);
		p.columnRslt_rcv_schd_dt = p.beansFactory.createTableColumn("Rslt.rcv_schd_dt", MCColumnType.DATE);
		p.columnRslt_multi_flg = p.beansFactory.createTableColumn("Rslt.multi_flg", MCColumnType.CHECK);
		p.columnRslt_bill_cl_day = p.beansFactory.createTableColumn("Rslt.bill_cl_day", MCColumnType.NUMBER);
		p.columnRslt_bill_dt = p.beansFactory.createTableColumn("Rslt.bill_dt", MCColumnType.DATE);
		p.columnRslt_pre_bill_dt = p.beansFactory.createTableColumn("Rslt.pre_bill_dt", MCColumnType.DATE);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_bill_xrate = p.beansFactory.createTableColumn("Rslt.bill_xrate", MCColumnType.NUMBER);
		p.columnRslt_interim_flg = p.beansFactory.createTableColumn("Rslt.interim_flg", MCColumnType.CHECK);
		p.columnRslt_amt_dec_place = p.beansFactory.createTableColumn("Rslt.amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_bill_cl_sts_typ = p.beansFactory.createTableColumn("Rslt.bill_cl_sts_typ", MCColumnType.TEXT);
		p.columnRslt_bill_cl_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.bill_cl_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_edi_flg = p.beansFactory.createTableColumn("Rslt.edi_flg", MCColumnType.CHECK);
		p.columnRslt_sort_ord_flg = p.beansFactory.createTableColumn("Rslt.sort_ord_flg", MCColumnType.CHECK);
		p.columnRslt_rcv_schd_adjst_flg = p.beansFactory.createTableColumn("Rslt.rcv_schd_adjst_flg", MCColumnType.CHECK);
		p.columnRslt_adjst_flg = p.beansFactory.createTableColumn("Rslt.adjst_flg", MCColumnType.CHECK);
		p.columnRslt_sls_interim_cl_flg = p.beansFactory.createTableColumn("Rslt.sls_interim_cl_flg", MCColumnType.CHECK);
		p.columnRslt_d_cnt = p.beansFactory.createTableColumn("Rslt.d_cnt", MCColumnType.NUMBER);
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
	protected static void jbfInitBtn(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBGP0040 = p.beansFactory.createButton("Btn.open_MSBGP0040", "open");
		p.Btn_open_MSBGP0080 = p.beansFactory.createButton("Btn.open_MSBGP0080", "open");
		p.Btn_open_MSBBP1370 = p.beansFactory.createButton("Btn.open_MSBBP1370", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_prnt = p.beansFactory.createButton("Btn.prnt", "prnt");
		p.Btn_indiv_prnt_flg = p.beansFactory.createCheckBox("Btn.indiv_prnt_flg");
	}

	/**
	 * [Edi]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEdi(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.EdiPanel = p.beansFactory.createPanel("Edi");
		p.EdiTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.TopPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
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
		p.FoldPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
		p.CtrlPanel.setNextBeans(p.RPnlPanel);
		p.TopPanel.add(p.RPnlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.FoldPanel.add(p.FoldTab);
		p.FoldPanel.setLastBeans(p.FoldTab);
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldTab.add(p.TabSrchPanel, "Fold.tab1");
		p.FoldTab.setLastBeans(p.TabSrchPanel);
		p.TabSrchPanel.setNextBeans(p.Cnd2Panel);
		p.FoldTab.add(p.Cnd2Panel, "Fold.tab2");
	}

	/**
	 * [TabSrch]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTabSrch(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.TabSrchPanel.setNextBeans(p.Cnd2Panel);
		p.TabSrchPanel.setValueCheck(false);
		p.TabSrchPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TabSrchPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
		p.TabSrchPanel.add(p.CndClTypPanel, null);
		p.TabSrchPanel.setLastBeans(p.CndClTypPanel);
		p.CndClTypPanel.setNextBeans(p.CndPrntPanel);
		p.TabSrchPanel.add(p.CndPrntPanel, null);
		p.CndPrntPanel.setNextBeans(p.CntryTypPanel);
		p.TabSrchPanel.add(p.CntryTypPanel, null);
		p.CntryTypPanel.setNextBeans(p.RcvSchdAdjstPanel);
		p.TabSrchPanel.add(p.RcvSchdAdjstPanel, null);
		p.RcvSchdAdjstPanel.setNextBeans(p.EdiPanel);
		p.TabSrchPanel.add(p.EdiPanel, null);
		p.EdiPanel.setNextBeans(p.CndPanel);
		p.TabSrchPanel.add(p.CndPanel, null);
	}

	/**
	 * [CndClTyp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCndClTyp(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.CndClTypPanel.setBorder(p.CndClTypTitledBorder);
		p.CndClTypPanel.setValueCheck(false);
		p.CndClTypPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndClTypPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [CndPrnt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCndPrnt(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.CndPrntPanel.setBorder(p.CndPrntTitledBorder);
		p.CndPrntPanel.setValueCheck(false);
		p.CndPrntPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPrntPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [CntryTyp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCntryTyp(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.CntryTypPanel.setBorder(p.CntryTypTitledBorder);
		p.CntryTypPanel.setValueCheck(false);
		p.CntryTypPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CntryTypPanel.setLayoutPosition("NWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [RcvSchdAdjst]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRcvSchdAdjst(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.RcvSchdAdjstPanel.setBorder(p.RcvSchdAdjstTitledBorder);
		p.RcvSchdAdjstPanel.setValueCheck(false);
		p.RcvSchdAdjstPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RcvSchdAdjstPanel.setLayoutPosition("NWXCXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_PRT);
		p.Cnd_ope_PRT.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_PRT);
		p.ScreenOpePanel.add(p.Cnd_ope_PRT);
		p.Cnd_ope_PRT.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.ope_META);
		p.CndClTypPanel.add(p.Cnd_not_cl_flg);
		p.CndClTypPanel.setLastBeans(p.Cnd_not_cl_flg);
		p.Cnd_not_cl_flg.setNextBeans(p.Cnd_cl_batch_flg);
		p.Cnd_not_cl_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.not_cl_flg_META);
		p.CndClTypPanel.add(p.Cnd_cl_batch_flg);
		p.Cnd_cl_batch_flg.setNextBeans(p.Cnd_cl_scrn_flg);
		p.Cnd_cl_batch_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.cl_batch_flg_META);
		p.CndClTypPanel.add(p.Cnd_cl_scrn_flg);
		p.Cnd_cl_scrn_flg.setNextBeans(p.Cnd_each_sls_flg);
		p.Cnd_cl_scrn_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.cl_scrn_flg_META);
		p.CndClTypPanel.add(p.Cnd_each_sls_flg);
		p.Cnd_each_sls_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.each_sls_flg_META);
		p.CndPrntPanel.add(p.Cnd_not_prnt_flg);
		p.CndPrntPanel.setLastBeans(p.Cnd_not_prnt_flg);
		p.Cnd_not_prnt_flg.setNextBeans(p.Cnd_prnt_flg);
		p.Cnd_not_prnt_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.not_prnt_flg_META);
		p.CndPrntPanel.add(p.Cnd_prnt_flg);
		p.Cnd_prnt_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.prnt_flg_META);
		p.CntryTypPanel.add(p.Cnd_dmstic_flg);
		p.CntryTypPanel.setLastBeans(p.Cnd_dmstic_flg);
		p.Cnd_dmstic_flg.setNextBeans(p.Cnd_foreign_flg);
		p.Cnd_dmstic_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.dmstic_flg_META);
		p.CntryTypPanel.add(p.Cnd_foreign_flg);
		p.Cnd_foreign_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.foreign_flg_META);
		p.RcvSchdAdjstPanel.add(p.Cnd_not_adjst_flg);
		p.RcvSchdAdjstPanel.setLastBeans(p.Cnd_not_adjst_flg);
		p.Cnd_not_adjst_flg.setNextBeans(p.Cnd_adjst_flg);
		p.Cnd_not_adjst_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.not_adjst_flg_META);
		p.RcvSchdAdjstPanel.add(p.Cnd_adjst_flg);
		p.Cnd_adjst_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.adjst_flg_META);
		p.EdiPanel.add(p.Cnd_on_edi_flg);
		p.EdiPanel.setLastBeans(p.Cnd_on_edi_flg);
		p.Cnd_on_edi_flg.setNextBeans(p.Cnd_off_edi_flg);
		p.Cnd_on_edi_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.on_edi_flg_META);
		p.EdiPanel.add(p.Cnd_off_edi_flg);
		p.Cnd_off_edi_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.off_edi_flg_META);
		p.CndPanel.add(p.Cnd_bill_cl_ym_from_Label);
		p.CndPanel.add(p.Cnd_bill_cl_ym_from);
		p.CndPanel.setLastBeans(p.Cnd_bill_cl_ym_from);
		p.Cnd_bill_cl_ym_from.setNextBeans(p.Cnd_bill_cl_ym_to);
		p.Cnd_bill_cl_ym_from.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.bill_cl_ym_from_META);
		p.Cnd_bill_cl_ym_from.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_bill_cl_ym_to_Label);
		p.CndPanel.add(p.Cnd_bill_cl_ym_to);
		p.Cnd_bill_cl_ym_to.setNextBeans(p.Cnd_bill_cl_day);
		p.Cnd_bill_cl_ym_to.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.bill_cl_ym_to_META);
		p.Cnd_bill_cl_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_bill_cl_day_Label);
		p.CndPanel.add(p.Cnd_bill_cl_day);
		p.Cnd_bill_cl_day.setNextBeans(p.Cnd_rcv_schd_dt_from);
		p.Cnd_bill_cl_day.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.bill_cl_day_META);
		p.CndPanel.add(p.Cnd_rcv_schd_dt_from_Label);
		p.CndPanel.add(p.Cnd_rcv_schd_dt_from);
		p.Cnd_rcv_schd_dt_from.setNextBeans(p.Cnd_rcv_schd_dt_to);
		p.Cnd_rcv_schd_dt_from.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.rcv_schd_dt_from_META);
		p.Cnd_rcv_schd_dt_from.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_rcv_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_rcv_schd_dt_to);
		p.Cnd_rcv_schd_dt_to.setNextBeans(p.Cnd_bill_dpt_cd);
		p.Cnd_rcv_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.rcv_schd_dt_to_META);
		p.Cnd_rcv_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_bill_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_bill_dpt_cd);
		p.Cnd_bill_dpt_cd.setNextBeans(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.bill_dpt_cd_META);
		p.Cnd_bill_dpt_cd.addLinkBeans(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bill_dpt_cd, true);
		p.CndPanel.add(p.Cnd_bill_dpt_nm);
		p.Cnd_bill_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_bill_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.bill_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_bill_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_bcst_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_bcst_cd_Label);
		p.CndPanel.add(p.Cnd_bcst_cd);
		p.Cnd_bcst_cd.setNextBeans(p.Cnd_bcst_nm);
		p.Cnd_bcst_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.bcst_cd_META);
		p.Cnd_bcst_cd.addLinkBeans(p.Cnd_bcst_nm);
		p.Cnd_bcst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bcst_cd, true);
		p.CndPanel.add(p.Cnd_bcst_nm);
		p.Cnd_bcst_nm.setNextBeans(p.Cnd_bill_no);
		p.Cnd_bcst_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.bcst_nm_META);
		p.setPluralValueEnable(p.Cnd_bcst_nm, true);
		p.CndPanel.add(p.Cnd_bill_no_Label);
		p.CndPanel.add(p.Cnd_bill_no);
		p.Cnd_bill_no.setNextBeans(p.Cnd_iv_no);
		p.Cnd_bill_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.bill_no_META);
		p.setPluralValueEnable(p.Cnd_bill_no, true);
		p.CndPanel.add(p.Cnd_iv_no_Label);
		p.CndPanel.add(p.Cnd_iv_no);
		p.Cnd_iv_no.setNextBeans(p.Cnd_pre_bill_no);
		p.Cnd_iv_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.iv_no_META);
		p.setPluralValueEnable(p.Cnd_iv_no, true);
		p.CndPanel.add(p.Cnd_pre_bill_no_Label);
		p.CndPanel.add(p.Cnd_pre_bill_no);
		p.Cnd_pre_bill_no.setNextBeans(p.Cnd_trd_cur_cd);
		p.Cnd_pre_bill_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.pre_bill_no_META);
		p.setPluralValueEnable(p.Cnd_pre_bill_no, true);
		p.Cnd_trd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cur_cd, true);
		p.Cnd_trd_cur_cd.setLinkBeans(p.Cnd_trd_cur_nm);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_wrkno_p_PPanel);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.trd_cur_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_cur_nm, true);
		p.CndPanel.add(p.Cnd_wrkno_p_PPanel);
		p.Cnd_wrkno_p_PPanel.setNextBeans(p.Cnd_inc_no_bill_flg);
		p.setPluralValueEnable(p.Cnd_wrkno_p_PPanel.WrkNo_wrk_no, true);
		p.Cnd_wrkno_p_PPanel.WrkNo_wrk_nm.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wrkno_p_PPanel.WrkNo_wrk_nm, false);
		p.CndPanel.add(p.Cnd_inc_no_bill_flg);
		p.Cnd_inc_no_bill_flg.setNextBeans(p.Cnd_interim_flg);
		p.Cnd_inc_no_bill_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.inc_no_bill_flg_META);
		p.CndPanel.add(p.Cnd_interim_flg);
		p.Cnd_interim_flg.setNextBeans(p.Cnd_not_prnt_ex_flg);
		p.Cnd_interim_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.interim_flg_META);
		p.CndPanel.add(p.Cnd_not_prnt_ex_flg);
		p.Cnd_not_prnt_ex_flg.setNextBeans(p.Cnd_rcv_schd_adjst_flg);
		p.Cnd_not_prnt_ex_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.not_prnt_ex_flg_META);
		p.CndPanel.add(p.Cnd_rcv_schd_adjst_flg);
		p.Cnd_rcv_schd_adjst_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0030.CndR.rcv_schd_adjst_flg_META);
		p.Cnd2Panel.add(p.Cnd_billGrp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_billGrp_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBGP_BillSrch p) {
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
	protected static void jbInitRPnl(MSBGP_BillSrch p) {
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
	protected static void jbInitRslt(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBGP0040.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBGP0040);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBGP0040);
		p.Btn_open_MSBGP0040.setNextBeans(p.Btn_open_MSBGP0080);
		p.Btn_open_MSBGP0080.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBGP0080);
		p.Btn_open_MSBGP0080.setNextBeans(p.Btn_open_MSBBP1370);
		p.Btn_open_MSBBP1370.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MSBBP1370);
		p.Btn_open_MSBBP1370.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_prnt);
		p.Btn_prnt.setIcon("PRINT");
		p.Btn_prnt.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_prnt);
		p.Btn_prnt.setNextBeans(p.Btn_indiv_prnt_flg);
		p.BtnPanel.add(p.Btn_indiv_prnt_flg);
		p.Btn_indiv_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBG.MSBGP0030.BtnR.indiv_prnt_flg_META);
	}

	/**
	 * [Edi]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEdi(MSBGP_BillSrch p) {
		// ブロック関連の初期化
		p.EdiPanel.setBorder(p.EdiTitledBorder);
		p.EdiPanel.setValueCheck(false);
		p.EdiPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.EdiPanel.setLayoutPosition("NWXCXCXCXC");
		// ブロックの項目の初期化
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
		MSBGP_BillSrch_MC.mcInitScreenOpe((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.mcInitTop((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.mcInitFold((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.mcInitTabSrch((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.mcInitCndClTyp((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.mcInitCndPrnt((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.mcInitCntryTyp((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.mcInitRcvSchdAdjst((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.mcInitCnd2((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.mcInitCnd((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.mcInitCtrl((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.mcInitRPnl((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.mcInitRslt((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.mcInitBtn((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.mcInitEdi((MSBGP_BillSrch)this);

		// [SRCH_REF]ステータスのモードの設定
		MSBGP_BillSrch_MC.statusInitSRCH__REF_ScreenOpe((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__REF_Top((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__REF_Fold((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__REF_TabSrch((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__REF_CndClTyp((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__REF_CndPrnt((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__REF_CntryTyp((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__REF_RcvSchdAdjst((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__REF_Cnd2((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__REF_Cnd((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__REF_Ctrl((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__REF_RPnl((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__REF_Rslt((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__REF_Btn((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__REF_Edi((MSBGP_BillSrch)this);

		// [SRCH_PRNT]ステータスのモードの設定
		MSBGP_BillSrch_MC.statusInitSRCH__PRNT_ScreenOpe((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__PRNT_Top((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__PRNT_Fold((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__PRNT_TabSrch((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__PRNT_CndClTyp((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__PRNT_CndPrnt((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__PRNT_CntryTyp((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__PRNT_RcvSchdAdjst((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__PRNT_Cnd2((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__PRNT_Cnd((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__PRNT_Ctrl((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__PRNT_RPnl((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__PRNT_Rslt((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__PRNT_Btn((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitSRCH__PRNT_Edi((MSBGP_BillSrch)this);

		// [REF]ステータスのモードの設定
		MSBGP_BillSrch_MC.statusInitREF_ScreenOpe((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitREF_Top((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitREF_Fold((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitREF_TabSrch((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitREF_CndClTyp((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitREF_CndPrnt((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitREF_CntryTyp((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitREF_RcvSchdAdjst((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitREF_Cnd2((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitREF_Cnd((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitREF_Ctrl((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitREF_RPnl((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitREF_Rslt((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitREF_Btn((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitREF_Edi((MSBGP_BillSrch)this);

		// [PRNT]ステータスのモードの設定
		MSBGP_BillSrch_MC.statusInitPRNT_ScreenOpe((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitPRNT_Top((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitPRNT_Fold((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitPRNT_TabSrch((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitPRNT_CndClTyp((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitPRNT_CndPrnt((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitPRNT_CntryTyp((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitPRNT_RcvSchdAdjst((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitPRNT_Cnd2((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitPRNT_Cnd((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitPRNT_Ctrl((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitPRNT_RPnl((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitPRNT_Rslt((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitPRNT_Btn((MSBGP_BillSrch)this);
		MSBGP_BillSrch_MC.statusInitPRNT_Edi((MSBGP_BillSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBGP_BillSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBGP_BillSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBGP_BillSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [TabSrch]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTabSrch(MSBGP_BillSrch p) {
	}

	/**
	 *  [CndClTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCndClTyp(MSBGP_BillSrch p) {
	}

	/**
	 *  [CndPrnt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCndPrnt(MSBGP_BillSrch p) {
	}

	/**
	 *  [CntryTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCntryTyp(MSBGP_BillSrch p) {
	}

	/**
	 *  [RcvSchdAdjst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRcvSchdAdjst(MSBGP_BillSrch p) {
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBGP_BillSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBGP_BillSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_PRT.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_not_cl_flg.addAllListener(p);
		p.Cnd_cl_batch_flg.addAllListener(p);
		p.Cnd_cl_scrn_flg.addAllListener(p);
		p.Cnd_each_sls_flg.addAllListener(p);
		p.Cnd_not_prnt_flg.addAllListener(p);
		p.Cnd_prnt_flg.addAllListener(p);
		p.Cnd_dmstic_flg.addAllListener(p);
		p.Cnd_foreign_flg.addAllListener(p);
		p.Cnd_not_adjst_flg.addAllListener(p);
		p.Cnd_adjst_flg.addAllListener(p);
		p.Cnd_on_edi_flg.addAllListener(p);
		p.Cnd_off_edi_flg.addAllListener(p);
		p.Cnd_bill_cl_ym_from.setListListener(p);
		p.Cnd_bill_cl_ym_from.addAllListener(p);
		p.Cnd_bill_cl_ym_to.setListListener(p);
		p.Cnd_bill_cl_ym_to.addAllListener(p);
		p.Cnd_bill_cl_day.setListListener(p);
		p.Cnd_bill_cl_day.addAllListener(p);
		p.Cnd_rcv_schd_dt_from.setListListener(p);
		p.Cnd_rcv_schd_dt_from.addAllListener(p);
		p.Cnd_rcv_schd_dt_to.setListListener(p);
		p.Cnd_rcv_schd_dt_to.addAllListener(p);
		p.Cnd_bill_dpt_cd.setListListener(p);
		p.Cnd_bill_dpt_cd.addAllListener(p);
		p.Cnd_bill_dpt_nm.setListListener(p);
		p.Cnd_bill_dpt_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_bcst_cd.setListListener(p);
		p.Cnd_bcst_cd.addAllListener(p);
		p.Cnd_bcst_nm.setListListener(p);
		p.Cnd_bcst_nm.addAllListener(p);
		p.Cnd_bill_no.setListListener(p);
		p.Cnd_bill_no.addAllListener(p);
		p.Cnd_iv_no.setListListener(p);
		p.Cnd_iv_no.addAllListener(p);
		p.Cnd_pre_bill_no.setListListener(p);
		p.Cnd_pre_bill_no.addAllListener(p);
		p.Cnd_trd_cur_cd.setListListener(p);
		p.Cnd_trd_cur_cd.addAllListener(p);
		p.Cnd_trd_cur_nm.setListListener(p);
		p.Cnd_trd_cur_nm.addAllListener(p);
		p.Cnd_inc_no_bill_flg.addAllListener(p);
		p.Cnd_interim_flg.addAllListener(p);
		p.Cnd_not_prnt_ex_flg.addAllListener(p);
		p.Cnd_rcv_schd_adjst_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBGP_BillSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBGP_BillSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBGP_BillSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_bill_mng_no.addAllListener(p);
		p.columnRslt_bill_mng_no.setListListener(p);
		p.columnRslt_prnt_flg.addAllListener(p);
		p.columnRslt_bill_cl_ym.addAllListener(p);
		p.columnRslt_bill_cl_ym.setListListener(p);
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
		p.columnRslt_foreign_flg.addAllListener(p);
		p.columnRslt_bill_no.addAllListener(p);
		p.columnRslt_bill_no.setListListener(p);
		p.columnRslt_bill_rev.addAllListener(p);
		p.columnRslt_bill_rev.setListListener(p);
		p.columnRslt_iv_no.addAllListener(p);
		p.columnRslt_iv_no.setListListener(p);
		p.columnRslt_pre_bill_no.addAllListener(p);
		p.columnRslt_pre_bill_no.setListListener(p);
		p.columnRslt_rcv_schd_dt.addAllListener(p);
		p.columnRslt_rcv_schd_dt.setListListener(p);
		p.columnRslt_multi_flg.addAllListener(p);
		p.columnRslt_bill_cl_day.addAllListener(p);
		p.columnRslt_bill_cl_day.setListListener(p);
		p.columnRslt_bill_dt.addAllListener(p);
		p.columnRslt_bill_dt.setListListener(p);
		p.columnRslt_pre_bill_dt.addAllListener(p);
		p.columnRslt_pre_bill_dt.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_bill_xrate.addAllListener(p);
		p.columnRslt_bill_xrate.setListListener(p);
		p.columnRslt_interim_flg.addAllListener(p);
		p.columnRslt_amt_dec_place.addAllListener(p);
		p.columnRslt_amt_dec_place.setListListener(p);
		p.columnRslt_bill_cl_sts_typ.addAllListener(p);
		p.columnRslt_bill_cl_sts_typ.setListListener(p);
		p.columnRslt_bill_cl_sts_typ_nm.addAllListener(p);
		p.columnRslt_bill_cl_sts_typ_nm.setListListener(p);
		p.columnRslt_edi_flg.addAllListener(p);
		p.columnRslt_sort_ord_flg.addAllListener(p);
		p.columnRslt_rcv_schd_adjst_flg.addAllListener(p);
		p.columnRslt_adjst_flg.addAllListener(p);
		p.columnRslt_sls_interim_cl_flg.addAllListener(p);
		p.columnRslt_d_cnt.addAllListener(p);
		p.columnRslt_d_cnt.setListListener(p);
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
	protected static void mcInitBtn(MSBGP_BillSrch p) {
		p.Btn_open_MSBGP0040.addAllListener(p);
		p.Btn_open_MSBGP0040.setAPMethodName("doBtn_open_MSBGP0040");
		p.Btn_open_MSBGP0080.addAllListener(p);
		p.Btn_open_MSBGP0080.setAPMethodName("doBtn_open_MSBGP0080");
		p.Btn_open_MSBBP1370.addAllListener(p);
		p.Btn_open_MSBBP1370.setAPMethodName("doBtn_open_MSBBP1370");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_prnt.addAllListener(p);
		p.Btn_prnt.setAPMethodName("doBtn_prnt");
		p.Btn_indiv_prnt_flg.addAllListener(p);
	}

	/**
	 *  [Edi]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEdi(MSBGP_BillSrch p) {
	}

	/**
	 * [SRCH_REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ScreenOpe(MSBGP_BillSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Top(MSBGP_BillSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Fold(MSBGP_BillSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[TabSrch]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_TabSrch(MSBGP_BillSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[CndClTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_CndClTyp(MSBGP_BillSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[CndPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_CndPrnt(MSBGP_BillSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[CntryTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_CntryTyp(MSBGP_BillSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[RcvSchdAdjst]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_RcvSchdAdjst(MSBGP_BillSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd2(MSBGP_BillSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd(MSBGP_BillSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_not_cl_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_cl_batch_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_cl_scrn_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_each_sls_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_not_prnt_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_prnt_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_dmstic_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_foreign_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_not_adjst_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_adjst_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_on_edi_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_off_edi_flg.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_bill_cl_ym_from.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_bill_cl_ym_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_bill_cl_day.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rcv_schd_dt_from.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rcv_schd_dt_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_bill_dpt_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_bill_dpt_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_bill_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_pre_bill_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_wrkno_p_PPanel.putStatus(SRCH_REF, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_wrkno_p_PPanel.WrkNo_wrk_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_inc_no_bill_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_interim_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_not_prnt_ex_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_rcv_schd_adjst_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_billGrp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Ctrl(MSBGP_BillSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_RPnl(MSBGP_BillSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_REF, MCMode.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Rslt(MSBGP_BillSrch p){
		p.columnRslt_check.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_bill_mng_no.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_prnt_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_ym.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_bcst_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_bcst_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_foreign_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_bill_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_bill_rev.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_pre_bill_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_wrkno_p_PPanel.putStatus(SRCH_REF, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_multi_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_day.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_bill_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_pre_bill_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_bill_xrate.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_lastBillAmt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_rcvAmt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_bfwAmt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_slsAmt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_retAmt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_dscntAmt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_setoffAmt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_taxAmt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_swToAmt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_billAmt_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_amt_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_bill_cl_sts_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_sts_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_edi_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sort_ord_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_adjst_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_adjst_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_billGrp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_sls_interim_cl_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_d_cnt.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Btn(MSBGP_BillSrch p){
		p.Btn_open_MSBGP0040.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Btn_open_MSBGP0080.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Btn_open_MSBBP1370.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Btn_deselect_all.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Btn_prnt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_REF]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Edi(MSBGP_BillSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_ScreenOpe(MSBGP_BillSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Top(MSBGP_BillSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Fold(MSBGP_BillSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[TabSrch]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_TabSrch(MSBGP_BillSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[CndClTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_CndClTyp(MSBGP_BillSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[CndPrnt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_CndPrnt(MSBGP_BillSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[CntryTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_CntryTyp(MSBGP_BillSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[RcvSchdAdjst]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_RcvSchdAdjst(MSBGP_BillSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Cnd2(MSBGP_BillSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Cnd(MSBGP_BillSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_not_cl_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_cl_batch_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_cl_scrn_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_each_sls_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_not_prnt_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_prnt_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_dmstic_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_foreign_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_not_adjst_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_adjst_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_on_edi_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_off_edi_flg.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bill_cl_ym_from.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bill_cl_ym_to.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bill_cl_day.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcv_schd_dt_from.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_rcv_schd_dt_to.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bill_dpt_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bill_dpt_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_bill_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_pre_bill_no.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_wrkno_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_wrkno_p_PPanel.WrkNo_wrk_nm.putMode(p, SRCH_PRNT, MCMode.ENABLE);
		p.Cnd_inc_no_bill_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_interim_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_not_prnt_ex_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Cnd_rcv_schd_adjst_flg.putMode(p, SRCH_PRNT, MCMode.REQUIRED);
		p.Cnd_billGrp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Ctrl(MSBGP_BillSrch p){

	}

	/**
	 * [SRCH_PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_RPnl(MSBGP_BillSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_PRNT, MCMode.ENABLE);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Rslt(MSBGP_BillSrch p){
		p.columnRslt_check.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_mng_no.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_prnt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_ym.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bcst_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bcst_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_foreign_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_rev.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pre_bill_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_wrkno_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_multi_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_day.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_pre_bill_dt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_xrate.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_lastBillAmt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_rcvAmt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_bfwAmt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_slsAmt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_retAmt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_dscntAmt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_setoffAmt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_taxAmt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_swToAmt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_billAmt_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_amt_dec_place.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_bill_cl_sts_typ.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_sts_typ_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_edi_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_sort_ord_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_adjst_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_adjst_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.putStatus(SRCH_PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_sls_interim_cl_flg.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_d_cnt.putMode(p, SRCH_PRNT, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Btn(MSBGP_BillSrch p){
		p.Btn_open_MSBGP0040.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Btn_open_MSBGP0080.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Btn_open_MSBBP1370.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Btn_deselect_all.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Btn_prnt.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_PRNT, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_PRNT]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRNT_Edi(MSBGP_BillSrch p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBGP_BillSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBGP_BillSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBGP_BillSrch p){

	}

	/**
	 * [REF]ステータスの[TabSrch]ブロックのモードの設定
	 */
	protected static void statusInitREF_TabSrch(MSBGP_BillSrch p){

	}

	/**
	 * [REF]ステータスの[CndClTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF_CndClTyp(MSBGP_BillSrch p){

	}

	/**
	 * [REF]ステータスの[CndPrnt]ブロックのモードの設定
	 */
	protected static void statusInitREF_CndPrnt(MSBGP_BillSrch p){

	}

	/**
	 * [REF]ステータスの[CntryTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF_CntryTyp(MSBGP_BillSrch p){

	}

	/**
	 * [REF]ステータスの[RcvSchdAdjst]ブロックのモードの設定
	 */
	protected static void statusInitREF_RcvSchdAdjst(MSBGP_BillSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MSBGP_BillSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBGP_BillSrch p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_not_cl_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cl_batch_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cl_scrn_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_each_sls_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_not_prnt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_prnt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dmstic_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_foreign_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_not_adjst_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_adjst_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_on_edi_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_edi_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bill_cl_ym_from.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bill_cl_ym_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bill_cl_day.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_schd_dt_from.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_schd_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bill_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bill_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bill_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_pre_bill_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wrkno_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_wrkno_p_PPanel.WrkNo_wrk_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_inc_no_bill_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_interim_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_not_prnt_ex_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rcv_schd_adjst_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_billGrp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBGP_BillSrch p){

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBGP_BillSrch p){
		p.RPnl_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBGP_BillSrch p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_mng_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_foreign_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pre_bill_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_wrkno_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_multi_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_day.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pre_bill_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_xrate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_lastBillAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_rcvAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_bfwAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_slsAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_retAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_dscntAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_setoffAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_taxAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_swToAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_billAmt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_bill_cl_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_edi_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sort_ord_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_adjst_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_adjst_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_billGrp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_sls_interim_cl_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_d_cnt.putMode(p, REF, MCMode.INVISIBLE);
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
	protected static void statusInitREF_Btn(MSBGP_BillSrch p){
		p.Btn_open_MSBGP0040.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBGP0080.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBBP1370.putMode(p, REF, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.READ_ONLY);
		p.Btn_deselect_all.putMode(p, REF, MCMode.READ_ONLY);
		p.Btn_prnt.putMode(p, REF, MCMode.READ_ONLY);
		p.Btn_indiv_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitREF_Edi(MSBGP_BillSrch p){

	}

	/**
	 * [PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ScreenOpe(MSBGP_BillSrch p){

	}

	/**
	 * [PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Top(MSBGP_BillSrch p){

	}

	/**
	 * [PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Fold(MSBGP_BillSrch p){

	}

	/**
	 * [PRNT]ステータスの[TabSrch]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_TabSrch(MSBGP_BillSrch p){

	}

	/**
	 * [PRNT]ステータスの[CndClTyp]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_CndClTyp(MSBGP_BillSrch p){

	}

	/**
	 * [PRNT]ステータスの[CndPrnt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_CndPrnt(MSBGP_BillSrch p){

	}

	/**
	 * [PRNT]ステータスの[CntryTyp]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_CntryTyp(MSBGP_BillSrch p){

	}

	/**
	 * [PRNT]ステータスの[RcvSchdAdjst]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_RcvSchdAdjst(MSBGP_BillSrch p){

	}

	/**
	 * [PRNT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd2(MSBGP_BillSrch p){

	}

	/**
	 * [PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd(MSBGP_BillSrch p){
		p.Cnd_ope_Group.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_not_cl_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_cl_batch_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_cl_scrn_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_each_sls_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_not_prnt_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_prnt_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_dmstic_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_foreign_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_not_adjst_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_adjst_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_on_edi_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_off_edi_flg.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bill_cl_ym_from.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bill_cl_ym_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bill_cl_day.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcv_schd_dt_from.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_rcv_schd_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bill_dpt_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bill_dpt_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bcst_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bcst_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bill_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_pre_bill_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_wrkno_p_PPanel.putStatus(PRNT, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_wrkno_p_PPanel.WrkNo_wrk_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_inc_no_bill_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_interim_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_not_prnt_ex_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_rcv_schd_adjst_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_billGrp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Ctrl(MSBGP_BillSrch p){

	}

	/**
	 * [PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_RPnl(MSBGP_BillSrch p){
		p.RPnl_dwnld.putMode(p, PRNT, MCMode.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Rslt(MSBGP_BillSrch p){
		p.columnRslt_check.putMode(p, PRNT, MCMode.ENABLE);
		p.columnRslt_bill_mng_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_prnt_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_ym.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_dpt_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bcst_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bcst_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_foreign_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_rev.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pre_bill_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_wrkno_p_PPanel.putStatus(PRNT, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_multi_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_day.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pre_bill_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_xrate.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_interim_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_lastBillAmt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_rcvAmt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_bfwAmt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_slsAmt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_retAmt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_dscntAmt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_setoffAmt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_taxAmt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_swToAmt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_billAmt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_amt_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_bill_cl_sts_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_sts_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_edi_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sort_ord_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_adjst_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_adjst_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_billGrp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_sls_interim_cl_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_d_cnt.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, PRNT, MCMode.READ_ONLY);

	}

	/**
	 * [PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Btn(MSBGP_BillSrch p){
		p.Btn_open_MSBGP0040.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Btn_open_MSBGP0080.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Btn_open_MSBBP1370.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_indiv_prnt_flg.putMode(p, PRNT, MCMode.REQUIRED);

	}

	/**
	 * [PRNT]ステータスの[Edi]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Edi(MSBGP_BillSrch p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_REF;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBGP_BillSrch_MC.setTableConfigRslt((MSBGP_BillSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBGP_BillSrch p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_bill_mng_no.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.bill_mng_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_mng_no);
		p.columnRslt_prnt_flg.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.prnt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_prnt_flg);
		p.columnRslt_bill_cl_ym.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.bill_cl_ym_META);
		p.columnRslt_bill_cl_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_cl_ym);
		p.columnRslt_bill_dpt_cd.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.bill_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_dpt_cd);
		p.columnRslt_bill_dpt_nm.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.bill_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_dpt_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_bcst_cd.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.bcst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bcst_cd);
		p.columnRslt_bcst_nm.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.bcst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bcst_nm);
		p.columnRslt_foreign_flg.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.foreign_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_foreign_flg);
		p.columnRslt_bill_no.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.bill_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_no);
		p.columnRslt_bill_rev.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.bill_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_rev);
		p.columnRslt_iv_no.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_no);
		p.columnRslt_pre_bill_no.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.pre_bill_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pre_bill_no);
		p.RsltTable.addTable(p.Rslt_wrkno_p_PPanel.WrkNoTable);
		p.columnRslt_rcv_schd_dt.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.rcv_schd_dt_META);
		p.columnRslt_rcv_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_schd_dt);
		p.columnRslt_multi_flg.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.multi_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_multi_flg);
		p.columnRslt_bill_cl_day.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.bill_cl_day_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_cl_day);
		p.columnRslt_bill_dt.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.bill_dt_META);
		p.columnRslt_bill_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_dt);
		p.columnRslt_pre_bill_dt.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.pre_bill_dt_META);
		p.columnRslt_pre_bill_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pre_bill_dt);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_bill_xrate.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.bill_xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_xrate);
		p.columnRslt_interim_flg.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.interim_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_interim_flg);
		p.RsltTable.addTable(p.Rslt_lastBillAmt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_rcvAmt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_bfwAmt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_slsAmt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_retAmt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_dscntAmt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_setoffAmt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_taxAmt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_swToAmt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_billAmt_p_PPanel.AmtTable);
		p.columnRslt_amt_dec_place.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt_dec_place);
		p.columnRslt_bill_cl_sts_typ.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.bill_cl_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_cl_sts_typ);
		p.columnRslt_bill_cl_sts_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.bill_cl_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_cl_sts_typ_nm);
		p.columnRslt_edi_flg.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.edi_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_edi_flg);
		p.columnRslt_sort_ord_flg.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.sort_ord_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sort_ord_flg);
		p.columnRslt_rcv_schd_adjst_flg.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.rcv_schd_adjst_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_schd_adjst_flg);
		p.columnRslt_adjst_flg.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.adjst_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_adjst_flg);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.RsltTable.addTable(p.Rslt_billGrp_p_PPanel.BpGrpTable);
		p.columnRslt_sls_interim_cl_flg.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.sls_interim_cl_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_interim_cl_flg);
		p.columnRslt_d_cnt.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.d_cnt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_d_cnt);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBG.MSBGP0030.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_bill_dpt_cd.getListConfig().setPutter(getCnd_bill_dpt_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_bcst_cd.getListConfig().setPutter(getCnd_bcst_cd_ListPutter());
		Cnd_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cur_cd.getListConfig().setPutter(getCnd_trd_cur_cd_ListPutter());
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
	 * この画面を[SRCH_PRNT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_PRNTStatus() {
		status = SRCH_PRNT;
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
	 * この画面を[PRNT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setPRNTStatus() {
		status = PRNT;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_REF.equals(status)) {
			setSRCH_REFStatus();
		}
		else if (SRCH_PRNT.equals(status)) {
			setSRCH_PRNTStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (PRNT.equals(status)) {
			setPRNTStatus();
		}
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
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_bill_dpt_cd) return getCnd_bill_dpt_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_bcst_cd) return getCnd_bcst_cd(row, info);
		if(combo == Cnd_trd_cur_cd) return getCnd_trd_cur_cd(row, info);
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
		else if (ap == Btn_open_MSBGP0040) doBtn_open_MSBGP0040(info);
		else if (ap == Btn_open_MSBGP0080) doBtn_open_MSBGP0080(info);
		else if (ap == Btn_open_MSBBP1370) doBtn_open_MSBBP1370(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_prnt) doBtn_prnt(info);
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
	 * [Btn]パネルの[open_MSBGP0040]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBGP0040(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBGP0080]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBGP0080(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBBP1370]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBBP1370(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt(MCEventInfo info);

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
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_not_cl_flg) return doCnd_not_cl_flg_VC(info);
		if (vc == Cnd_cl_batch_flg) return doCnd_cl_batch_flg_VC(info);
		if (vc == Cnd_cl_scrn_flg) return doCnd_cl_scrn_flg_VC(info);
		if (vc == Cnd_each_sls_flg) return doCnd_each_sls_flg_VC(info);
		if (vc == Cnd_not_prnt_flg) return doCnd_not_prnt_flg_VC(info);
		if (vc == Cnd_prnt_flg) return doCnd_prnt_flg_VC(info);
		if (vc == Cnd_dmstic_flg) return doCnd_dmstic_flg_VC(info);
		if (vc == Cnd_foreign_flg) return doCnd_foreign_flg_VC(info);
		if (vc == Cnd_not_adjst_flg) return doCnd_not_adjst_flg_VC(info);
		if (vc == Cnd_adjst_flg) return doCnd_adjst_flg_VC(info);
		if (vc == Cnd_on_edi_flg) return doCnd_on_edi_flg_VC(info);
		if (vc == Cnd_off_edi_flg) return doCnd_off_edi_flg_VC(info);
		if (vc == Cnd_bill_cl_ym_from) return doCnd_bill_cl_ym_from_VC(info);
		if (vc == Cnd_bill_cl_ym_to) return doCnd_bill_cl_ym_to_VC(info);
		if (vc == Cnd_bill_cl_day) return doCnd_bill_cl_day_VC(info);
		if (vc == Cnd_rcv_schd_dt_from) return doCnd_rcv_schd_dt_from_VC(info);
		if (vc == Cnd_rcv_schd_dt_to) return doCnd_rcv_schd_dt_to_VC(info);
		if (vc == Cnd_bill_dpt_cd) return doCnd_bill_dpt_cd_VC(info);
		if (vc == Cnd_bill_dpt_nm) return doCnd_bill_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_bcst_cd) return doCnd_bcst_cd_VC(info);
		if (vc == Cnd_bcst_nm) return doCnd_bcst_nm_VC(info);
		if (vc == Cnd_bill_no) return doCnd_bill_no_VC(info);
		if (vc == Cnd_iv_no) return doCnd_iv_no_VC(info);
		if (vc == Cnd_pre_bill_no) return doCnd_pre_bill_no_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
		if (vc == Cnd_inc_no_bill_flg) return doCnd_inc_no_bill_flg_VC(info);
		if (vc == Cnd_interim_flg) return doCnd_interim_flg_VC(info);
		if (vc == Cnd_not_prnt_ex_flg) return doCnd_not_prnt_ex_flg_VC(info);
		if (vc == Cnd_rcv_schd_adjst_flg) return doCnd_rcv_schd_adjst_flg_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_bill_mng_no) return doRslt_bill_mng_no_VC(info);
		if (vc == columnRslt_prnt_flg) return doRslt_prnt_flg_VC(info);
		if (vc == columnRslt_bill_cl_ym) return doRslt_bill_cl_ym_VC(info);
		if (vc == columnRslt_bill_dpt_cd) return doRslt_bill_dpt_cd_VC(info);
		if (vc == columnRslt_bill_dpt_nm) return doRslt_bill_dpt_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_bcst_cd) return doRslt_bcst_cd_VC(info);
		if (vc == columnRslt_bcst_nm) return doRslt_bcst_nm_VC(info);
		if (vc == columnRslt_foreign_flg) return doRslt_foreign_flg_VC(info);
		if (vc == columnRslt_bill_no) return doRslt_bill_no_VC(info);
		if (vc == columnRslt_bill_rev) return doRslt_bill_rev_VC(info);
		if (vc == columnRslt_iv_no) return doRslt_iv_no_VC(info);
		if (vc == columnRslt_pre_bill_no) return doRslt_pre_bill_no_VC(info);
		if (vc == columnRslt_rcv_schd_dt) return doRslt_rcv_schd_dt_VC(info);
		if (vc == columnRslt_multi_flg) return doRslt_multi_flg_VC(info);
		if (vc == columnRslt_bill_cl_day) return doRslt_bill_cl_day_VC(info);
		if (vc == columnRslt_bill_dt) return doRslt_bill_dt_VC(info);
		if (vc == columnRslt_pre_bill_dt) return doRslt_pre_bill_dt_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_bill_xrate) return doRslt_bill_xrate_VC(info);
		if (vc == columnRslt_interim_flg) return doRslt_interim_flg_VC(info);
		if (vc == columnRslt_amt_dec_place) return doRslt_amt_dec_place_VC(info);
		if (vc == columnRslt_bill_cl_sts_typ) return doRslt_bill_cl_sts_typ_VC(info);
		if (vc == columnRslt_bill_cl_sts_typ_nm) return doRslt_bill_cl_sts_typ_nm_VC(info);
		if (vc == columnRslt_edi_flg) return doRslt_edi_flg_VC(info);
		if (vc == columnRslt_sort_ord_flg) return doRslt_sort_ord_flg_VC(info);
		if (vc == columnRslt_rcv_schd_adjst_flg) return doRslt_rcv_schd_adjst_flg_VC(info);
		if (vc == columnRslt_adjst_flg) return doRslt_adjst_flg_VC(info);
		if (vc == columnRslt_sls_interim_cl_flg) return doRslt_sls_interim_cl_flg_VC(info);
		if (vc == columnRslt_d_cnt) return doRslt_d_cnt_VC(info);
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
		if (vc == Btn_indiv_prnt_flg) return doBtn_indiv_prnt_flg_VC(info);
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
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cl_batch_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cl_batch_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cl_scrn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cl_scrn_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[each_sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_each_sls_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dmstic_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dmstic_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[foreign_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_foreign_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[on_edi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_on_edi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[off_edi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_off_edi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bill_cl_ym_from]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_cl_ym_from_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bill_cl_ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_cl_ym_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bill_cl_day]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bill_cl_day_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcv_schd_dt_from]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcv_schd_dt_from_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcv_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcv_schd_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[pre_bill_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pre_bill_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[inc_no_bill_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inc_no_bill_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_prnt_ex_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_prnt_ex_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_check_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_cl_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_cl_ym_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[foreign_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_foreign_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_rev_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pre_bill_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pre_bill_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[multi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_multi_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pre_bill_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pre_bill_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_xrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_interim_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_cl_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_cl_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bill_cl_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_cl_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[edi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_edi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sort_ord_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sort_ord_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_interim_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_interim_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[d_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_d_cnt_VC(MCEventInfo info){
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
		if (nc == FoldTab) doFold_NC(info);
		else if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_not_cl_flg) doCnd_not_cl_flg_NC(info);
		else if (nc == Cnd_cl_batch_flg) doCnd_cl_batch_flg_NC(info);
		else if (nc == Cnd_cl_scrn_flg) doCnd_cl_scrn_flg_NC(info);
		else if (nc == Cnd_each_sls_flg) doCnd_each_sls_flg_NC(info);
		else if (nc == Cnd_not_prnt_flg) doCnd_not_prnt_flg_NC(info);
		else if (nc == Cnd_prnt_flg) doCnd_prnt_flg_NC(info);
		else if (nc == Cnd_dmstic_flg) doCnd_dmstic_flg_NC(info);
		else if (nc == Cnd_foreign_flg) doCnd_foreign_flg_NC(info);
		else if (nc == Cnd_not_adjst_flg) doCnd_not_adjst_flg_NC(info);
		else if (nc == Cnd_adjst_flg) doCnd_adjst_flg_NC(info);
		else if (nc == Cnd_on_edi_flg) doCnd_on_edi_flg_NC(info);
		else if (nc == Cnd_off_edi_flg) doCnd_off_edi_flg_NC(info);
		else if (nc == Cnd_bill_cl_ym_from) doCnd_bill_cl_ym_from_NC(info);
		else if (nc == Cnd_bill_cl_ym_to) doCnd_bill_cl_ym_to_NC(info);
		else if (nc == Cnd_bill_cl_day) doCnd_bill_cl_day_NC(info);
		else if (nc == Cnd_rcv_schd_dt_from) doCnd_rcv_schd_dt_from_NC(info);
		else if (nc == Cnd_rcv_schd_dt_to) doCnd_rcv_schd_dt_to_NC(info);
		else if (nc == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NC(info);
		else if (nc == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_bcst_cd) doCnd_bcst_cd_NC(info);
		else if (nc == Cnd_bcst_nm) doCnd_bcst_nm_NC(info);
		else if (nc == Cnd_bill_no) doCnd_bill_no_NC(info);
		else if (nc == Cnd_iv_no) doCnd_iv_no_NC(info);
		else if (nc == Cnd_pre_bill_no) doCnd_pre_bill_no_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
		else if (nc == Cnd_inc_no_bill_flg) doCnd_inc_no_bill_flg_NC(info);
		else if (nc == Cnd_interim_flg) doCnd_interim_flg_NC(info);
		else if (nc == Cnd_not_prnt_ex_flg) doCnd_not_prnt_ex_flg_NC(info);
		else if (nc == Cnd_rcv_schd_adjst_flg) doCnd_rcv_schd_adjst_flg_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_bill_mng_no) doRslt_bill_mng_no_NC(info);
		else if (nc == columnRslt_prnt_flg) doRslt_prnt_flg_NC(info);
		else if (nc == columnRslt_bill_cl_ym) doRslt_bill_cl_ym_NC(info);
		else if (nc == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_NC(info);
		else if (nc == columnRslt_bill_dpt_nm) doRslt_bill_dpt_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_bcst_cd) doRslt_bcst_cd_NC(info);
		else if (nc == columnRslt_bcst_nm) doRslt_bcst_nm_NC(info);
		else if (nc == columnRslt_foreign_flg) doRslt_foreign_flg_NC(info);
		else if (nc == columnRslt_bill_no) doRslt_bill_no_NC(info);
		else if (nc == columnRslt_bill_rev) doRslt_bill_rev_NC(info);
		else if (nc == columnRslt_iv_no) doRslt_iv_no_NC(info);
		else if (nc == columnRslt_pre_bill_no) doRslt_pre_bill_no_NC(info);
		else if (nc == columnRslt_rcv_schd_dt) doRslt_rcv_schd_dt_NC(info);
		else if (nc == columnRslt_multi_flg) doRslt_multi_flg_NC(info);
		else if (nc == columnRslt_bill_cl_day) doRslt_bill_cl_day_NC(info);
		else if (nc == columnRslt_bill_dt) doRslt_bill_dt_NC(info);
		else if (nc == columnRslt_pre_bill_dt) doRslt_pre_bill_dt_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_bill_xrate) doRslt_bill_xrate_NC(info);
		else if (nc == columnRslt_interim_flg) doRslt_interim_flg_NC(info);
		else if (nc == columnRslt_amt_dec_place) doRslt_amt_dec_place_NC(info);
		else if (nc == columnRslt_bill_cl_sts_typ) doRslt_bill_cl_sts_typ_NC(info);
		else if (nc == columnRslt_bill_cl_sts_typ_nm) doRslt_bill_cl_sts_typ_nm_NC(info);
		else if (nc == columnRslt_edi_flg) doRslt_edi_flg_NC(info);
		else if (nc == columnRslt_sort_ord_flg) doRslt_sort_ord_flg_NC(info);
		else if (nc == columnRslt_rcv_schd_adjst_flg) doRslt_rcv_schd_adjst_flg_NC(info);
		else if (nc == columnRslt_adjst_flg) doRslt_adjst_flg_NC(info);
		else if (nc == columnRslt_sls_interim_cl_flg) doRslt_sls_interim_cl_flg_NC(info);
		else if (nc == columnRslt_d_cnt) doRslt_d_cnt_NC(info);
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
		else if (nc == Btn_indiv_prnt_flg) doBtn_indiv_prnt_flg_NC(info);
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
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cl_batch_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cl_batch_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cl_scrn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cl_scrn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[each_sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_each_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmstic_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmstic_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[foreign_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_foreign_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[on_edi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_edi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_edi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_edi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_cl_ym_from]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_ym_from_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_cl_ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_ym_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_cl_day]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_day_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_schd_dt_from]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_dt_from_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[pre_bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_bill_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[inc_no_bill_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_no_bill_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_prnt_ex_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_prnt_ex_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_schd_adjst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_adjst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_cl_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_ym_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[foreign_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_bill_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[multi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_multi_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[pre_bill_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_bill_dt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_cl_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_cl_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sort_ord_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sort_ord_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_interim_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_interim_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_cnt_NC(MCEventInfo info){
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
		if (ne == FoldTab) doFold_NE(info);
		else if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_not_cl_flg) doCnd_not_cl_flg_NE(info);
		else if (ne == Cnd_cl_batch_flg) doCnd_cl_batch_flg_NE(info);
		else if (ne == Cnd_cl_scrn_flg) doCnd_cl_scrn_flg_NE(info);
		else if (ne == Cnd_each_sls_flg) doCnd_each_sls_flg_NE(info);
		else if (ne == Cnd_not_prnt_flg) doCnd_not_prnt_flg_NE(info);
		else if (ne == Cnd_prnt_flg) doCnd_prnt_flg_NE(info);
		else if (ne == Cnd_dmstic_flg) doCnd_dmstic_flg_NE(info);
		else if (ne == Cnd_foreign_flg) doCnd_foreign_flg_NE(info);
		else if (ne == Cnd_not_adjst_flg) doCnd_not_adjst_flg_NE(info);
		else if (ne == Cnd_adjst_flg) doCnd_adjst_flg_NE(info);
		else if (ne == Cnd_on_edi_flg) doCnd_on_edi_flg_NE(info);
		else if (ne == Cnd_off_edi_flg) doCnd_off_edi_flg_NE(info);
		else if (ne == Cnd_bill_cl_ym_from) doCnd_bill_cl_ym_from_NE(info);
		else if (ne == Cnd_bill_cl_ym_to) doCnd_bill_cl_ym_to_NE(info);
		else if (ne == Cnd_bill_cl_day) doCnd_bill_cl_day_NE(info);
		else if (ne == Cnd_rcv_schd_dt_from) doCnd_rcv_schd_dt_from_NE(info);
		else if (ne == Cnd_rcv_schd_dt_to) doCnd_rcv_schd_dt_to_NE(info);
		else if (ne == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NE(info);
		else if (ne == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_bcst_cd) doCnd_bcst_cd_NE(info);
		else if (ne == Cnd_bcst_nm) doCnd_bcst_nm_NE(info);
		else if (ne == Cnd_bill_no) doCnd_bill_no_NE(info);
		else if (ne == Cnd_iv_no) doCnd_iv_no_NE(info);
		else if (ne == Cnd_pre_bill_no) doCnd_pre_bill_no_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
		else if (ne == Cnd_inc_no_bill_flg) doCnd_inc_no_bill_flg_NE(info);
		else if (ne == Cnd_interim_flg) doCnd_interim_flg_NE(info);
		else if (ne == Cnd_not_prnt_ex_flg) doCnd_not_prnt_ex_flg_NE(info);
		else if (ne == Cnd_rcv_schd_adjst_flg) doCnd_rcv_schd_adjst_flg_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_bill_mng_no) doRslt_bill_mng_no_NE(info);
		else if (ne == columnRslt_prnt_flg) doRslt_prnt_flg_NE(info);
		else if (ne == columnRslt_bill_cl_ym) doRslt_bill_cl_ym_NE(info);
		else if (ne == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_NE(info);
		else if (ne == columnRslt_bill_dpt_nm) doRslt_bill_dpt_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_bcst_cd) doRslt_bcst_cd_NE(info);
		else if (ne == columnRslt_bcst_nm) doRslt_bcst_nm_NE(info);
		else if (ne == columnRslt_foreign_flg) doRslt_foreign_flg_NE(info);
		else if (ne == columnRslt_bill_no) doRslt_bill_no_NE(info);
		else if (ne == columnRslt_bill_rev) doRslt_bill_rev_NE(info);
		else if (ne == columnRslt_iv_no) doRslt_iv_no_NE(info);
		else if (ne == columnRslt_pre_bill_no) doRslt_pre_bill_no_NE(info);
		else if (ne == columnRslt_rcv_schd_dt) doRslt_rcv_schd_dt_NE(info);
		else if (ne == columnRslt_multi_flg) doRslt_multi_flg_NE(info);
		else if (ne == columnRslt_bill_cl_day) doRslt_bill_cl_day_NE(info);
		else if (ne == columnRslt_bill_dt) doRslt_bill_dt_NE(info);
		else if (ne == columnRslt_pre_bill_dt) doRslt_pre_bill_dt_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_bill_xrate) doRslt_bill_xrate_NE(info);
		else if (ne == columnRslt_interim_flg) doRslt_interim_flg_NE(info);
		else if (ne == columnRslt_amt_dec_place) doRslt_amt_dec_place_NE(info);
		else if (ne == columnRslt_bill_cl_sts_typ) doRslt_bill_cl_sts_typ_NE(info);
		else if (ne == columnRslt_bill_cl_sts_typ_nm) doRslt_bill_cl_sts_typ_nm_NE(info);
		else if (ne == columnRslt_edi_flg) doRslt_edi_flg_NE(info);
		else if (ne == columnRslt_sort_ord_flg) doRslt_sort_ord_flg_NE(info);
		else if (ne == columnRslt_rcv_schd_adjst_flg) doRslt_rcv_schd_adjst_flg_NE(info);
		else if (ne == columnRslt_adjst_flg) doRslt_adjst_flg_NE(info);
		else if (ne == columnRslt_sls_interim_cl_flg) doRslt_sls_interim_cl_flg_NE(info);
		else if (ne == columnRslt_d_cnt) doRslt_d_cnt_NE(info);
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
		else if (ne == Btn_indiv_prnt_flg) doBtn_indiv_prnt_flg_NE(info);
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
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cl_batch_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cl_batch_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cl_scrn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cl_scrn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[each_sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_each_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmstic_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmstic_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[foreign_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_foreign_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[on_edi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_edi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_edi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_edi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_cl_ym_from]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_ym_from_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_cl_ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_ym_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_cl_day]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_day_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_schd_dt_from]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_dt_from_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[pre_bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_bill_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[inc_no_bill_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_no_bill_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_prnt_ex_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_prnt_ex_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_schd_adjst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_adjst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_cl_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_ym_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[foreign_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_bill_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[multi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_multi_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[pre_bill_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_bill_dt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_cl_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_cl_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sort_ord_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sort_ord_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_interim_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_interim_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_cnt_NE(MCEventInfo info){
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
		if (nx == FoldTab) doFold_NX(info);
		else if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_not_cl_flg) doCnd_not_cl_flg_NX(info);
		else if (nx == Cnd_cl_batch_flg) doCnd_cl_batch_flg_NX(info);
		else if (nx == Cnd_cl_scrn_flg) doCnd_cl_scrn_flg_NX(info);
		else if (nx == Cnd_each_sls_flg) doCnd_each_sls_flg_NX(info);
		else if (nx == Cnd_not_prnt_flg) doCnd_not_prnt_flg_NX(info);
		else if (nx == Cnd_prnt_flg) doCnd_prnt_flg_NX(info);
		else if (nx == Cnd_dmstic_flg) doCnd_dmstic_flg_NX(info);
		else if (nx == Cnd_foreign_flg) doCnd_foreign_flg_NX(info);
		else if (nx == Cnd_not_adjst_flg) doCnd_not_adjst_flg_NX(info);
		else if (nx == Cnd_adjst_flg) doCnd_adjst_flg_NX(info);
		else if (nx == Cnd_on_edi_flg) doCnd_on_edi_flg_NX(info);
		else if (nx == Cnd_off_edi_flg) doCnd_off_edi_flg_NX(info);
		else if (nx == Cnd_bill_cl_ym_from) doCnd_bill_cl_ym_from_NX(info);
		else if (nx == Cnd_bill_cl_ym_to) doCnd_bill_cl_ym_to_NX(info);
		else if (nx == Cnd_bill_cl_day) doCnd_bill_cl_day_NX(info);
		else if (nx == Cnd_rcv_schd_dt_from) doCnd_rcv_schd_dt_from_NX(info);
		else if (nx == Cnd_rcv_schd_dt_to) doCnd_rcv_schd_dt_to_NX(info);
		else if (nx == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_NX(info);
		else if (nx == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_bcst_cd) doCnd_bcst_cd_NX(info);
		else if (nx == Cnd_bcst_nm) doCnd_bcst_nm_NX(info);
		else if (nx == Cnd_bill_no) doCnd_bill_no_NX(info);
		else if (nx == Cnd_iv_no) doCnd_iv_no_NX(info);
		else if (nx == Cnd_pre_bill_no) doCnd_pre_bill_no_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
		else if (nx == Cnd_inc_no_bill_flg) doCnd_inc_no_bill_flg_NX(info);
		else if (nx == Cnd_interim_flg) doCnd_interim_flg_NX(info);
		else if (nx == Cnd_not_prnt_ex_flg) doCnd_not_prnt_ex_flg_NX(info);
		else if (nx == Cnd_rcv_schd_adjst_flg) doCnd_rcv_schd_adjst_flg_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_bill_mng_no) doRslt_bill_mng_no_NX(info);
		else if (nx == columnRslt_prnt_flg) doRslt_prnt_flg_NX(info);
		else if (nx == columnRslt_bill_cl_ym) doRslt_bill_cl_ym_NX(info);
		else if (nx == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_NX(info);
		else if (nx == columnRslt_bill_dpt_nm) doRslt_bill_dpt_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_bcst_cd) doRslt_bcst_cd_NX(info);
		else if (nx == columnRslt_bcst_nm) doRslt_bcst_nm_NX(info);
		else if (nx == columnRslt_foreign_flg) doRslt_foreign_flg_NX(info);
		else if (nx == columnRslt_bill_no) doRslt_bill_no_NX(info);
		else if (nx == columnRslt_bill_rev) doRslt_bill_rev_NX(info);
		else if (nx == columnRslt_iv_no) doRslt_iv_no_NX(info);
		else if (nx == columnRslt_pre_bill_no) doRslt_pre_bill_no_NX(info);
		else if (nx == columnRslt_rcv_schd_dt) doRslt_rcv_schd_dt_NX(info);
		else if (nx == columnRslt_multi_flg) doRslt_multi_flg_NX(info);
		else if (nx == columnRslt_bill_cl_day) doRslt_bill_cl_day_NX(info);
		else if (nx == columnRslt_bill_dt) doRslt_bill_dt_NX(info);
		else if (nx == columnRslt_pre_bill_dt) doRslt_pre_bill_dt_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_bill_xrate) doRslt_bill_xrate_NX(info);
		else if (nx == columnRslt_interim_flg) doRslt_interim_flg_NX(info);
		else if (nx == columnRslt_amt_dec_place) doRslt_amt_dec_place_NX(info);
		else if (nx == columnRslt_bill_cl_sts_typ) doRslt_bill_cl_sts_typ_NX(info);
		else if (nx == columnRslt_bill_cl_sts_typ_nm) doRslt_bill_cl_sts_typ_nm_NX(info);
		else if (nx == columnRslt_edi_flg) doRslt_edi_flg_NX(info);
		else if (nx == columnRslt_sort_ord_flg) doRslt_sort_ord_flg_NX(info);
		else if (nx == columnRslt_rcv_schd_adjst_flg) doRslt_rcv_schd_adjst_flg_NX(info);
		else if (nx == columnRslt_adjst_flg) doRslt_adjst_flg_NX(info);
		else if (nx == columnRslt_sls_interim_cl_flg) doRslt_sls_interim_cl_flg_NX(info);
		else if (nx == columnRslt_d_cnt) doRslt_d_cnt_NX(info);
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
		else if (nx == Btn_indiv_prnt_flg) doBtn_indiv_prnt_flg_NX(info);
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
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cl_batch_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cl_batch_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cl_scrn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cl_scrn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[each_sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_each_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dmstic_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dmstic_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[foreign_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_foreign_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[on_edi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_edi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_edi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_edi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_cl_ym_from]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_ym_from_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_cl_ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_ym_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_cl_day]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_day_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_schd_dt_from]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_dt_from_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[pre_bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_bill_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[inc_no_bill_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_no_bill_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_prnt_ex_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_prnt_ex_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_schd_adjst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_adjst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_cl_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_ym_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[foreign_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_bill_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[multi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_multi_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[pre_bill_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_bill_dt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_cl_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_cl_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sort_ord_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sort_ord_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[sls_interim_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_interim_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_cnt_NX(MCEventInfo info){
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
		if (lc == Cnd_bill_cl_ym_from) doCnd_bill_cl_ym_from_LC(info);
		else if (lc == Cnd_bill_cl_ym_to) doCnd_bill_cl_ym_to_LC(info);
		else if (lc == Cnd_bill_cl_day) doCnd_bill_cl_day_LC(info);
		else if (lc == Cnd_rcv_schd_dt_from) doCnd_rcv_schd_dt_from_LC(info);
		else if (lc == Cnd_rcv_schd_dt_to) doCnd_rcv_schd_dt_to_LC(info);
		else if (lc == Cnd_bill_dpt_cd) doCnd_bill_dpt_cd_LC(info);
		else if (lc == Cnd_bill_dpt_nm) doCnd_bill_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_bcst_cd) doCnd_bcst_cd_LC(info);
		else if (lc == Cnd_bcst_nm) doCnd_bcst_nm_LC(info);
		else if (lc == Cnd_bill_no) doCnd_bill_no_LC(info);
		else if (lc == Cnd_iv_no) doCnd_iv_no_LC(info);
		else if (lc == Cnd_pre_bill_no) doCnd_pre_bill_no_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
		else if (lc == columnRslt_bill_mng_no) doRslt_bill_mng_no_LC(info);
		else if (lc == columnRslt_bill_cl_ym) doRslt_bill_cl_ym_LC(info);
		else if (lc == columnRslt_bill_dpt_cd) doRslt_bill_dpt_cd_LC(info);
		else if (lc == columnRslt_bill_dpt_nm) doRslt_bill_dpt_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_bcst_cd) doRslt_bcst_cd_LC(info);
		else if (lc == columnRslt_bcst_nm) doRslt_bcst_nm_LC(info);
		else if (lc == columnRslt_bill_no) doRslt_bill_no_LC(info);
		else if (lc == columnRslt_bill_rev) doRslt_bill_rev_LC(info);
		else if (lc == columnRslt_iv_no) doRslt_iv_no_LC(info);
		else if (lc == columnRslt_pre_bill_no) doRslt_pre_bill_no_LC(info);
		else if (lc == columnRslt_rcv_schd_dt) doRslt_rcv_schd_dt_LC(info);
		else if (lc == columnRslt_bill_cl_day) doRslt_bill_cl_day_LC(info);
		else if (lc == columnRslt_bill_dt) doRslt_bill_dt_LC(info);
		else if (lc == columnRslt_pre_bill_dt) doRslt_pre_bill_dt_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_bill_xrate) doRslt_bill_xrate_LC(info);
		else if (lc == columnRslt_amt_dec_place) doRslt_amt_dec_place_LC(info);
		else if (lc == columnRslt_bill_cl_sts_typ) doRslt_bill_cl_sts_typ_LC(info);
		else if (lc == columnRslt_bill_cl_sts_typ_nm) doRslt_bill_cl_sts_typ_nm_LC(info);
		else if (lc == columnRslt_d_cnt) doRslt_d_cnt_LC(info);
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
	 * [Cnd]パネルの[bill_cl_ym_from]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_ym_from_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_cl_ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_ym_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_cl_day]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_cl_day_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_schd_dt_from]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_dt_from_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[pre_bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_bill_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_cl_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_ym_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_rev_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_bill_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_schd_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[pre_bill_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_bill_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_cl_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bill_cl_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_cl_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[d_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_d_cnt_LC(MCEventInfo info){
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

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBGL0030.Srch01")) {
			return new MS_MSBGL0030_Srch01Bridge();
		}
		if (id.equals("MS.MSBGL0030.Prnt01")) {
			return new MS_MSBGL0030_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBGL0030_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0030_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0030_Srch01;

		/** コンストラクタ */
		protected MS_MSBGL0030_Srch01Bridge() {
			p_MS_MSBGL0030_Srch01 = new MCParam(PDef.MS_MSBGL0030_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0030_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0030.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0030.RsltR.class));

			p_MS_MSBGL0030_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0030_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0030_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0030_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0030_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0030.CndR up0() {
			return (mcframe.clientMSBG.MSBGP0030.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBG.MSBGP0030.RsltR> down0() {
			return (MCList<mcframe.clientMSBG.MSBGP0030.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0030_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0030.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0030_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBG.MSBGP0030.RsltR>)p_MS_MSBGL0030_Srch01.getContainerParam().getDownBlock(0));
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
	/**
	 * [MS_MSBGL0030_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0030_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0030_Prnt01;

		/** コンストラクタ */
		protected MS_MSBGL0030_Prnt01Bridge() {
			p_MS_MSBGL0030_Prnt01 = new MCParam(PDef.MS_MSBGL0030_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0030_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBG.MSBGP0030.RsltR.class));
			param.addUpBlock(mcframe.clientMSBG.MSBGP0030.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0030.RsltR.class));

			p_MS_MSBGL0030_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0030_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0030_Prnt01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBGL0030_Prnt01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0030_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0030_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBG.MSBGP0030.RsltR> up0() {
			return (MCList<mcframe.clientMSBG.MSBGP0030.RsltR>)up(0);
		}
		protected mcframe.clientMSBG.MSBGP0030.BtnR up1() {
			return (mcframe.clientMSBG.MSBGP0030.BtnR)up(1);
		}

		protected MCList<mcframe.clientMSBG.MSBGP0030.RsltR> down0() {
			return (MCList<mcframe.clientMSBG.MSBGP0030.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0030_Prnt01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0030.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0030_Prnt01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBG.MSBGP0030.RsltR>)p_MS_MSBGL0030_Prnt01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getBtnR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
}