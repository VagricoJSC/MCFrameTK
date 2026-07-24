package mcframe.clientMSBG.MSBGP0120;

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
import mcframe.clientMSBG.MSBGP0120.MSBGP_ArDtlApplBalSrch_MC.MS_MSBGL0120_Srch01Caller;

/**
 * 画面"MSBGP_ArDtlApplBalSrch"パネルクラスです。<p>
 *
 * 未消込の売掛金を明細単位の一覧形式で照会します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGP_ArDtlApplBalSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBGP0120";

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
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [AcstCnd]ブロック関連のField定義
	public MCPanel AcstCndPanel = null;
	// [AcstCnd]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_rcv_schd_dt_fr_Label = null;
	/**
	 * Scheduled payment receipt date FROM 入金予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_rcv_schd_dt_fr = null;
	public MCLabel Cnd_rcv_schd_dt_to_Label = null;
	/**
	 * Scheduled payment receipt date TO 入金予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_rcv_schd_dt_to = null;
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
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_wg_nm = null;
	public MCLabel Cnd_sls_usr_cd_Label = null;
	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sls_usr_cd = null;
	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public MCTextField Cnd_sls_usr_nm = null;
	public MCLabel Cnd_sls_dpt_cd_Label = null;
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sls_dpt_cd = null;
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public MCTextField Cnd_sls_dpt_nm = null;
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
	public MCLabel Cnd_iv_no_Label = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_iv_no = null;
	public MCLabel Cnd_bill_no_Label = null;
	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_bill_no = null;
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
	 * Include unbilled 未請求含む.<p>
	 *
	 */
	public MCCheckBox Cnd_incl_not_bill_flg = null;
	/**
	 * Include reconciled details 消込済明細含む.<p>
	 *
	 */
	public MCCheckBox Cnd_incl_appl_flg = null;
	/**
	 * Include invalid/cancel 無効・取消含む.<p>
	 *
	 */
	public MCCheckBox Cnd_incl_can_flg = null;
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_acst_grp_p_PPanel;
	public MCLabel Cnd_acst_grp_lab1;	// [Cnd]の[acst_grp_p.bp_grp_lab1]を[Cnd_acst_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg1;	// [Cnd]の[acst_grp_p.bp_grp_flg1]を[Cnd_acst_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd1;	// [Cnd]の[acst_grp_p.bp_grp_cd1]を[Cnd_acst_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm1;	// [Cnd]の[acst_grp_p.bp_grp_nm1]を[Cnd_acst_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab2;	// [Cnd]の[acst_grp_p.bp_grp_lab2]を[Cnd_acst_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg2;	// [Cnd]の[acst_grp_p.bp_grp_flg2]を[Cnd_acst_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd2;	// [Cnd]の[acst_grp_p.bp_grp_cd2]を[Cnd_acst_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm2;	// [Cnd]の[acst_grp_p.bp_grp_nm2]を[Cnd_acst_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab3;	// [Cnd]の[acst_grp_p.bp_grp_lab3]を[Cnd_acst_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg3;	// [Cnd]の[acst_grp_p.bp_grp_flg3]を[Cnd_acst_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd3;	// [Cnd]の[acst_grp_p.bp_grp_cd3]を[Cnd_acst_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm3;	// [Cnd]の[acst_grp_p.bp_grp_nm3]を[Cnd_acst_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab4;	// [Cnd]の[acst_grp_p.bp_grp_lab4]を[Cnd_acst_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg4;	// [Cnd]の[acst_grp_p.bp_grp_flg4]を[Cnd_acst_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd4;	// [Cnd]の[acst_grp_p.bp_grp_cd4]を[Cnd_acst_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm4;	// [Cnd]の[acst_grp_p.bp_grp_nm4]を[Cnd_acst_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab5;	// [Cnd]の[acst_grp_p.bp_grp_lab5]を[Cnd_acst_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg5;	// [Cnd]の[acst_grp_p.bp_grp_flg5]を[Cnd_acst_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd5;	// [Cnd]の[acst_grp_p.bp_grp_cd5]を[Cnd_acst_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm5;	// [Cnd]の[acst_grp_p.bp_grp_nm5]を[Cnd_acst_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab6;	// [Cnd]の[acst_grp_p.bp_grp_lab6]を[Cnd_acst_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg6;	// [Cnd]の[acst_grp_p.bp_grp_flg6]を[Cnd_acst_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd6;	// [Cnd]の[acst_grp_p.bp_grp_cd6]を[Cnd_acst_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm6;	// [Cnd]の[acst_grp_p.bp_grp_nm6]を[Cnd_acst_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab7;	// [Cnd]の[acst_grp_p.bp_grp_lab7]を[Cnd_acst_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg7;	// [Cnd]の[acst_grp_p.bp_grp_flg7]を[Cnd_acst_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd7;	// [Cnd]の[acst_grp_p.bp_grp_cd7]を[Cnd_acst_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm7;	// [Cnd]の[acst_grp_p.bp_grp_nm7]を[Cnd_acst_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab8;	// [Cnd]の[acst_grp_p.bp_grp_lab8]を[Cnd_acst_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg8;	// [Cnd]の[acst_grp_p.bp_grp_flg8]を[Cnd_acst_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd8;	// [Cnd]の[acst_grp_p.bp_grp_cd8]を[Cnd_acst_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm8;	// [Cnd]の[acst_grp_p.bp_grp_nm8]を[Cnd_acst_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab9;	// [Cnd]の[acst_grp_p.bp_grp_lab9]を[Cnd_acst_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg9;	// [Cnd]の[acst_grp_p.bp_grp_flg9]を[Cnd_acst_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd9;	// [Cnd]の[acst_grp_p.bp_grp_cd9]を[Cnd_acst_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm9;	// [Cnd]の[acst_grp_p.bp_grp_nm9]を[Cnd_acst_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_acst_grp_lab10;	// [Cnd]の[acst_grp_p.bp_grp_lab10]を[Cnd_acst_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_acst_grp_flg10;	// [Cnd]の[acst_grp_p.bp_grp_flg10]を[Cnd_acst_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_acst_grp_cd10;	// [Cnd]の[acst_grp_p.bp_grp_cd10]を[Cnd_acst_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_acst_grp_nm10;	// [Cnd]の[acst_grp_p.bp_grp_nm10]を[Cnd_acst_grp_nm10]としてエイリアス定義。
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
	public MCTable2<mcframe.clientMSBG.MSBGP0120.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ar_dpt_cd = null;
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ar_dpt_nm = null;
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
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acst_cd = null;
	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acst_nm = null;
	/**
	 * AR type 債権区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ar_typ = null;
	/**
	 * AR type name 債権区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ar_typ_nm = null;
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
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slip_sts_typ = null;
	/**
	 * Status 状況.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slip_sts_typ_nm = null;
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
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_appl_tgt_amt_p_PPanel;
	public MCColumnConfig columnRslt_appl_tgt_amt;// [Rslt]の[appl_tgt_amt_p.amt]を[columnRslt_appl_tgt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_not_appl_bal_p_PPanel;
	public MCColumnConfig columnRslt_not_appl_bal;// [Rslt]の[not_appl_bal_p.amt]を[columnRslt_not_appl_bal]としてエイリアス定義。
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_ym = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_dt = null;
	/**
	 * Delivery date 納品日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_dt = null;
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
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bill_no = null;
	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_no = null;
	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_d_no = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_no = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_nm = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_nm = null;
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_cd1 = null;
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_nm1 = null;
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_cd2 = null;
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_nm2 = null;
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_cd3 = null;
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_nm3 = null;
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_dpt_cd = null;
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_dpt_nm = null;
	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_usr_cd = null;
	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_usr_nm = null;
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
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_po_no = null;
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_po_d_no = null;
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_slip_no = null;
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_slip_d_no = null;
	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_dlv_slip_no = null;
	/**
	 * Delivery note details No. at shipping 出荷時納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_dlv_slip_d_no = null;
	/**
	 * Multiple delivery note details at shipping 出荷時納品書明細複数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_dlv_slip_multi_flg = null;
	public mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D Rslt_old_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_old_wrk_no;// [Rslt]の[old_wrk_no_p.wrk_no]を[columnRslt_old_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_old_wrk_nm;// [Rslt]の[old_wrk_no_p.wrk_nm]を[columnRslt_old_wrk_nm]としてエイリアス定義。
	/**
	 * Transfer recording month 振替計上年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arsw_ac_ym = null;
	/**
	 * Transfer recording date 振替計上日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arsw_ac_dt = null;
	/**
	 * Transfer transaction cd. 振替取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arsw_trd_cd = null;
	/**
	 * Transfer transaction name 振替取引名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arsw_trd_nm = null;
	/**
	 * Transfer result No. 振替実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arsw_act_no = null;
	/**
	 * Transfer result details No. 振替実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arsw_act_d_no = null;
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_acst_grp_p_PPanel;
	public MCColumnConfig columnRslt_acst_grp_cd1;// [Rslt]の[acst_grp_p.bp_grp_cd1]を[columnRslt_acst_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm1;// [Rslt]の[acst_grp_p.bp_grp_nm1]を[columnRslt_acst_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd2;// [Rslt]の[acst_grp_p.bp_grp_cd2]を[columnRslt_acst_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm2;// [Rslt]の[acst_grp_p.bp_grp_nm2]を[columnRslt_acst_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd3;// [Rslt]の[acst_grp_p.bp_grp_cd3]を[columnRslt_acst_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm3;// [Rslt]の[acst_grp_p.bp_grp_nm3]を[columnRslt_acst_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd4;// [Rslt]の[acst_grp_p.bp_grp_cd4]を[columnRslt_acst_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm4;// [Rslt]の[acst_grp_p.bp_grp_nm4]を[columnRslt_acst_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd5;// [Rslt]の[acst_grp_p.bp_grp_cd5]を[columnRslt_acst_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm5;// [Rslt]の[acst_grp_p.bp_grp_nm5]を[columnRslt_acst_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd6;// [Rslt]の[acst_grp_p.bp_grp_cd6]を[columnRslt_acst_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm6;// [Rslt]の[acst_grp_p.bp_grp_nm6]を[columnRslt_acst_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd7;// [Rslt]の[acst_grp_p.bp_grp_cd7]を[columnRslt_acst_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm7;// [Rslt]の[acst_grp_p.bp_grp_nm7]を[columnRslt_acst_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd8;// [Rslt]の[acst_grp_p.bp_grp_cd8]を[columnRslt_acst_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm8;// [Rslt]の[acst_grp_p.bp_grp_nm8]を[columnRslt_acst_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd9;// [Rslt]の[acst_grp_p.bp_grp_cd9]を[columnRslt_acst_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm9;// [Rslt]の[acst_grp_p.bp_grp_nm9]を[columnRslt_acst_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_cd10;// [Rslt]の[acst_grp_p.bp_grp_cd10]を[columnRslt_acst_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_acst_grp_nm10;// [Rslt]の[acst_grp_p.bp_grp_nm10]を[columnRslt_acst_grp_nm10]としてエイリアス定義。
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
	
	/** [MS_MSBGL0120_Srch01]のCallerの作成 */
	protected MSBGP_ArDtlApplBalSrch_MC.MS_MSBGL0120_Srch01Caller createMS_MSBGL0120_Srch01() {
		MSBGP_ArDtlApplBalSrch_MC.MS_MSBGL0120_Srch01Caller<MSBGP_ArDtlApplBalSrch, MS_MSBGL0120_Srch01Bridge>
		caller = ((MSBGP_ArDtlApplBalSrch_MC)this).new MS_MSBGL0120_Srch01Caller<MSBGP_ArDtlApplBalSrch, MS_MSBGL0120_Srch01Bridge>(
					(MSBGP_ArDtlApplBalSrch)this, new MS_MSBGL0120_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBGL0120_Srch01]の呼び出し */
	protected void callMS_MSBGL0120_Srch01() {
		MCCaller caller = createMS_MSBGL0120_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0120.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0120.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBG.MSBGP0120.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0120.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0120.CndR createCndR() {
		return mcframe.clientMSBG.MSBGP0120.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBG.MSBGP0120.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0120.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBG.MSBGP0120.RsltR createRsltR() {
		return mcframe.clientMSBG.MSBGP0120.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0120.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0120.RsltR.class);
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
		ret.add(Tab2Panel);
		ret.add(AcstCndPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_ArDtlApplBalSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBGP_ArDtlApplBalSrch_MC_A(String name) {
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
		MSBGP_ArDtlApplBalSrch_MC.jbCreateTop((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.jbCreateFold((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.jbCreateTab1((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.jbCreateTab2((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.jbCreateAcstCnd((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.jbCreateCnd((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.jbCreateCtrl((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.jbCreateRPnl((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.jbCreateRslt((MSBGP_ArDtlApplBalSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBGP_ArDtlApplBalSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBGP_ArDtlApplBalSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBGP_ArDtlApplBalSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBGP_ArDtlApplBalSrch p) {
	}

	/**
	 * [AcstCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAcstCnd(MSBGP_ArDtlApplBalSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBGP_ArDtlApplBalSrch p) {
		p.Cnd_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getCndR().wrk_no_p());
		p.Cnd_wrk_no_p_PPanel.setName("Cnd.wrk_no_p");
		p.Cnd_wrk_no = p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_no;
		p.Cnd_wrk_no.addAliasName("Cnd.wrk_no", p);
		p.Cnd_wrk_nm = p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_nm;
		p.Cnd_wrk_nm.addAliasName("Cnd.wrk_nm", p);
		p.Cnd_acst_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().acst_grp_p());
		p.Cnd_acst_grp_p_PPanel.setName("Cnd.acst_grp_p");
		p.Cnd_acst_grp_lab1 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_acst_grp_lab1.addAliasName("Cnd.acst_grp_lab1", p);
		p.Cnd_acst_grp_flg1 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_acst_grp_flg1.addAliasName("Cnd.acst_grp_flg1", p);
		p.Cnd_acst_grp_cd1 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_acst_grp_cd1.addAliasName("Cnd.acst_grp_cd1", p);
		p.Cnd_acst_grp_nm1 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_acst_grp_nm1.addAliasName("Cnd.acst_grp_nm1", p);
		p.Cnd_acst_grp_lab2 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_acst_grp_lab2.addAliasName("Cnd.acst_grp_lab2", p);
		p.Cnd_acst_grp_flg2 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_acst_grp_flg2.addAliasName("Cnd.acst_grp_flg2", p);
		p.Cnd_acst_grp_cd2 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_acst_grp_cd2.addAliasName("Cnd.acst_grp_cd2", p);
		p.Cnd_acst_grp_nm2 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_acst_grp_nm2.addAliasName("Cnd.acst_grp_nm2", p);
		p.Cnd_acst_grp_lab3 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_acst_grp_lab3.addAliasName("Cnd.acst_grp_lab3", p);
		p.Cnd_acst_grp_flg3 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_acst_grp_flg3.addAliasName("Cnd.acst_grp_flg3", p);
		p.Cnd_acst_grp_cd3 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_acst_grp_cd3.addAliasName("Cnd.acst_grp_cd3", p);
		p.Cnd_acst_grp_nm3 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_acst_grp_nm3.addAliasName("Cnd.acst_grp_nm3", p);
		p.Cnd_acst_grp_lab4 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_acst_grp_lab4.addAliasName("Cnd.acst_grp_lab4", p);
		p.Cnd_acst_grp_flg4 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_acst_grp_flg4.addAliasName("Cnd.acst_grp_flg4", p);
		p.Cnd_acst_grp_cd4 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_acst_grp_cd4.addAliasName("Cnd.acst_grp_cd4", p);
		p.Cnd_acst_grp_nm4 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_acst_grp_nm4.addAliasName("Cnd.acst_grp_nm4", p);
		p.Cnd_acst_grp_lab5 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_acst_grp_lab5.addAliasName("Cnd.acst_grp_lab5", p);
		p.Cnd_acst_grp_flg5 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_acst_grp_flg5.addAliasName("Cnd.acst_grp_flg5", p);
		p.Cnd_acst_grp_cd5 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_acst_grp_cd5.addAliasName("Cnd.acst_grp_cd5", p);
		p.Cnd_acst_grp_nm5 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_acst_grp_nm5.addAliasName("Cnd.acst_grp_nm5", p);
		p.Cnd_acst_grp_lab6 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_acst_grp_lab6.addAliasName("Cnd.acst_grp_lab6", p);
		p.Cnd_acst_grp_flg6 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_acst_grp_flg6.addAliasName("Cnd.acst_grp_flg6", p);
		p.Cnd_acst_grp_cd6 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_acst_grp_cd6.addAliasName("Cnd.acst_grp_cd6", p);
		p.Cnd_acst_grp_nm6 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_acst_grp_nm6.addAliasName("Cnd.acst_grp_nm6", p);
		p.Cnd_acst_grp_lab7 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_acst_grp_lab7.addAliasName("Cnd.acst_grp_lab7", p);
		p.Cnd_acst_grp_flg7 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_acst_grp_flg7.addAliasName("Cnd.acst_grp_flg7", p);
		p.Cnd_acst_grp_cd7 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_acst_grp_cd7.addAliasName("Cnd.acst_grp_cd7", p);
		p.Cnd_acst_grp_nm7 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_acst_grp_nm7.addAliasName("Cnd.acst_grp_nm7", p);
		p.Cnd_acst_grp_lab8 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_acst_grp_lab8.addAliasName("Cnd.acst_grp_lab8", p);
		p.Cnd_acst_grp_flg8 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_acst_grp_flg8.addAliasName("Cnd.acst_grp_flg8", p);
		p.Cnd_acst_grp_cd8 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_acst_grp_cd8.addAliasName("Cnd.acst_grp_cd8", p);
		p.Cnd_acst_grp_nm8 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_acst_grp_nm8.addAliasName("Cnd.acst_grp_nm8", p);
		p.Cnd_acst_grp_lab9 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_acst_grp_lab9.addAliasName("Cnd.acst_grp_lab9", p);
		p.Cnd_acst_grp_flg9 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_acst_grp_flg9.addAliasName("Cnd.acst_grp_flg9", p);
		p.Cnd_acst_grp_cd9 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_acst_grp_cd9.addAliasName("Cnd.acst_grp_cd9", p);
		p.Cnd_acst_grp_nm9 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_acst_grp_nm9.addAliasName("Cnd.acst_grp_nm9", p);
		p.Cnd_acst_grp_lab10 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_acst_grp_lab10.addAliasName("Cnd.acst_grp_lab10", p);
		p.Cnd_acst_grp_flg10 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_acst_grp_flg10.addAliasName("Cnd.acst_grp_flg10", p);
		p.Cnd_acst_grp_cd10 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_acst_grp_cd10.addAliasName("Cnd.acst_grp_cd10", p);
		p.Cnd_acst_grp_nm10 = p.Cnd_acst_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_acst_grp_nm10.addAliasName("Cnd.acst_grp_nm10", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBGP_ArDtlApplBalSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBGP_ArDtlApplBalSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBGP_ArDtlApplBalSrch p) {
		p.Rslt_appl_tgt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0120.RsltR.$appl_tgt_amt_p);
		p.Rslt_appl_tgt_amt_p_PPanel.setName("Rslt.appl_tgt_amt_p");
		p.columnRslt_appl_tgt_amt = p.Rslt_appl_tgt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_appl_tgt_amt.addAliasName("Rslt.appl_tgt_amt", p);
		p.Rslt_not_appl_bal_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0120.RsltR.$not_appl_bal_p);
		p.Rslt_not_appl_bal_p_PPanel.setName("Rslt.not_appl_bal_p");
		p.columnRslt_not_appl_bal = p.Rslt_not_appl_bal_p_PPanel.columnAmt_amt;
		p.columnRslt_not_appl_bal.addAliasName("Rslt.not_appl_bal", p);
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBG.MSBGP0120.RsltR.$itm_p);
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
		p.Rslt_sno_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBG.MSBGP0120.RsltR.$sno_p);
		p.Rslt_sno_p_PPanel.setName("Rslt.sno_p");
		p.columnRslt_sno1 = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRslt_sno1.addAliasName("Rslt.sno1", p);
		p.columnRslt_sno2 = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRslt_sno2.addAliasName("Rslt.sno2", p);
		p.columnRslt_sno3 = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRslt_sno3.addAliasName("Rslt.sno3", p);
		p.columnRslt_sno4 = p.Rslt_sno_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRslt_sno4.addAliasName("Rslt.sno4", p);
		p.columnRslt_wrk_no = p.Rslt_sno_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnRslt_wrk_no.addAliasName("Rslt.wrk_no", p);
		p.columnRslt_wrk_nm = p.Rslt_sno_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnRslt_wrk_nm.addAliasName("Rslt.wrk_nm", p);
		p.Rslt_old_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.create(mcframe.clientMSBG.MSBGP0120.RsltR.$old_wrk_no_p);
		p.Rslt_old_wrk_no_p_PPanel.setName("Rslt.old_wrk_no_p");
		p.columnRslt_old_wrk_no = p.Rslt_old_wrk_no_p_PPanel.columnWrkNo_wrk_no;
		p.columnRslt_old_wrk_no.addAliasName("Rslt.old_wrk_no", p);
		p.columnRslt_old_wrk_nm = p.Rslt_old_wrk_no_p_PPanel.columnWrkNo_wrk_nm;
		p.columnRslt_old_wrk_nm.addAliasName("Rslt.old_wrk_nm", p);
		p.Rslt_acst_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBG.MSBGP0120.RsltR.$acst_grp_p);
		p.Rslt_acst_grp_p_PPanel.setName("Rslt.acst_grp_p");
		p.columnRslt_acst_grp_cd1 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_acst_grp_cd1.addAliasName("Rslt.acst_grp_cd1", p);
		p.columnRslt_acst_grp_nm1 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_acst_grp_nm1.addAliasName("Rslt.acst_grp_nm1", p);
		p.columnRslt_acst_grp_cd2 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_acst_grp_cd2.addAliasName("Rslt.acst_grp_cd2", p);
		p.columnRslt_acst_grp_nm2 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_acst_grp_nm2.addAliasName("Rslt.acst_grp_nm2", p);
		p.columnRslt_acst_grp_cd3 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_acst_grp_cd3.addAliasName("Rslt.acst_grp_cd3", p);
		p.columnRslt_acst_grp_nm3 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_acst_grp_nm3.addAliasName("Rslt.acst_grp_nm3", p);
		p.columnRslt_acst_grp_cd4 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_acst_grp_cd4.addAliasName("Rslt.acst_grp_cd4", p);
		p.columnRslt_acst_grp_nm4 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_acst_grp_nm4.addAliasName("Rslt.acst_grp_nm4", p);
		p.columnRslt_acst_grp_cd5 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_acst_grp_cd5.addAliasName("Rslt.acst_grp_cd5", p);
		p.columnRslt_acst_grp_nm5 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_acst_grp_nm5.addAliasName("Rslt.acst_grp_nm5", p);
		p.columnRslt_acst_grp_cd6 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_acst_grp_cd6.addAliasName("Rslt.acst_grp_cd6", p);
		p.columnRslt_acst_grp_nm6 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_acst_grp_nm6.addAliasName("Rslt.acst_grp_nm6", p);
		p.columnRslt_acst_grp_cd7 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_acst_grp_cd7.addAliasName("Rslt.acst_grp_cd7", p);
		p.columnRslt_acst_grp_nm7 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_acst_grp_nm7.addAliasName("Rslt.acst_grp_nm7", p);
		p.columnRslt_acst_grp_cd8 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_acst_grp_cd8.addAliasName("Rslt.acst_grp_cd8", p);
		p.columnRslt_acst_grp_nm8 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_acst_grp_nm8.addAliasName("Rslt.acst_grp_nm8", p);
		p.columnRslt_acst_grp_cd9 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_acst_grp_cd9.addAliasName("Rslt.acst_grp_cd9", p);
		p.columnRslt_acst_grp_nm9 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_acst_grp_nm9.addAliasName("Rslt.acst_grp_nm9", p);
		p.columnRslt_acst_grp_cd10 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_acst_grp_cd10.addAliasName("Rslt.acst_grp_cd10", p);
		p.columnRslt_acst_grp_nm10 = p.Rslt_acst_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_acst_grp_nm10.addAliasName("Rslt.acst_grp_nm10", p);
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
	
	
	/** [Cnd_sls_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sls_usr_cd_p = null;

	/**
	 * [Cnd_sls_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sls_usr_cd_ListPutter() {
		if (Cnd_sls_usr_cd_p == null) {
			Cnd_sls_usr_cd_p = createCnd_sls_usr_cd_ListPutter(Cnd_sls_usr_cd, "sls_usr_cd", "sls_usr_nm");

		}
		return Cnd_sls_usr_cd_p;
	}
	
	
	/** [Cnd_sls_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sls_dpt_cd_p = null;

	/**
	 * [Cnd_sls_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sls_dpt_cd_ListPutter() {
		if (Cnd_sls_dpt_cd_p == null) {
			Cnd_sls_dpt_cd_p = createCnd_sls_dpt_cd_ListPutter(Cnd_sls_dpt_cd, "sls_dpt_cd", "sls_dpt_nm");

		}
		return Cnd_sls_dpt_cd_p;
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_ArDtlApplBalSrch create(){
		MSBGP_ArDtlApplBalSrch p = new MSBGP_ArDtlApplBalSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_ArDtlApplBalSrch create(String name){
		MSBGP_ArDtlApplBalSrch p = new MSBGP_ArDtlApplBalSrch(name);
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
		MSBGP_ArDtlApplBalSrch_MC.jbfInitTop((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.jbfInitFold((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.jbfInitTab1((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.jbfInitTab2((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.jbfInitAcstCnd((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.jbfInitCnd((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.jbfInitCtrl((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.jbfInitRPnl((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.jbfInitRslt((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.jbInitTop((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.jbInitFold((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.jbInitTab1((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.jbInitTab2((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.jbInitAcstCnd((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.jbInitCnd((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.jbInitCtrl((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.jbInitRPnl((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.jbInitRslt((MSBGP_ArDtlApplBalSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBGP_ArDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBGP_ArDtlApplBalSrch p) {
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
	protected static void jbfInitTab1(MSBGP_ArDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBGP_ArDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [AcstCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAcstCnd(MSBGP_ArDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.AcstCndPanel = p.beansFactory.createPanel("AcstCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBGP_ArDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_rcv_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.rcv_schd_dt_fr_Label");
		p.Cnd_rcv_schd_dt_fr = p.beansFactory.createDateField("Cnd.rcv_schd_dt_fr");
		p.Cnd_rcv_schd_dt_fr.setLabel(p.Cnd_rcv_schd_dt_fr_Label);
		p.Cnd_rcv_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.rcv_schd_dt_to_Label");
		p.Cnd_rcv_schd_dt_to = p.beansFactory.createDateField("Cnd.rcv_schd_dt_to");
		p.Cnd_rcv_schd_dt_to.setLabel(p.Cnd_rcv_schd_dt_to_Label);
		p.Cnd_ac_dt_fr_Label = p.beansFactory.createLabel("Cnd.ac_dt_fr_Label");
		p.Cnd_ac_dt_fr = p.beansFactory.createDateField("Cnd.ac_dt_fr");
		p.Cnd_ac_dt_fr.setLabel(p.Cnd_ac_dt_fr_Label);
		p.Cnd_ac_dt_to_Label = p.beansFactory.createLabel("Cnd.ac_dt_to_Label");
		p.Cnd_ac_dt_to = p.beansFactory.createDateField("Cnd.ac_dt_to");
		p.Cnd_ac_dt_to.setLabel(p.Cnd_ac_dt_to_Label);
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
		p.Cnd_sls_usr_cd_Label = p.beansFactory.createLabel("Cnd.sls_usr_cd_Label");
		p.Cnd_sls_usr_cd = p.beansFactory.createTextField("Cnd.sls_usr_cd");
		p.Cnd_sls_usr_cd.setLabel(p.Cnd_sls_usr_cd_Label);
		p.Cnd_sls_usr_nm = p.beansFactory.createTextField("Cnd.sls_usr_nm");
		p.Cnd_sls_dpt_cd_Label = p.beansFactory.createLabel("Cnd.sls_dpt_cd_Label");
		p.Cnd_sls_dpt_cd = p.beansFactory.createTextField("Cnd.sls_dpt_cd");
		p.Cnd_sls_dpt_cd.setLabel(p.Cnd_sls_dpt_cd_Label);
		p.Cnd_sls_dpt_nm = p.beansFactory.createTextField("Cnd.sls_dpt_nm");
		p.Cnd_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.trd_cur_cd_Label");
		p.Cnd_trd_cur_cd = p.beansFactory.createTextComboBox("Cnd.trd_cur_cd");
		p.Cnd_trd_cur_cd.setLabel(p.Cnd_trd_cur_cd_Label);
		p.Cnd_trd_cur_nm = p.beansFactory.createTextField("Cnd.trd_cur_nm");
		p.Cnd_iv_no_Label = p.beansFactory.createLabel("Cnd.iv_no_Label");
		p.Cnd_iv_no = p.beansFactory.createTextField("Cnd.iv_no");
		p.Cnd_iv_no.setLabel(p.Cnd_iv_no_Label);
		p.Cnd_bill_no_Label = p.beansFactory.createLabel("Cnd.bill_no_Label");
		p.Cnd_bill_no = p.beansFactory.createTextField("Cnd.bill_no");
		p.Cnd_bill_no.setLabel(p.Cnd_bill_no_Label);
		p.Cnd_ar_typ_Label = p.beansFactory.createLabel("Cnd.ar_typ_Label");
		p.Cnd_ar_typ = p.beansFactory.createTextComboBox("Cnd.ar_typ");
		p.Cnd_ar_typ.setLabel(p.Cnd_ar_typ_Label);
		p.Cnd_ar_typ_nm = p.beansFactory.createTextField("Cnd.ar_typ_nm");
		p.Cnd_incl_not_bill_flg = p.beansFactory.createCheckBox("Cnd.incl_not_bill_flg");
		p.Cnd_incl_appl_flg = p.beansFactory.createCheckBox("Cnd.incl_appl_flg");
		p.Cnd_incl_can_flg = p.beansFactory.createCheckBox("Cnd.incl_can_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBGP_ArDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBGP_ArDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBGP_ArDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_ar_dpt_cd = p.beansFactory.createTableColumn("Rslt.ar_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_ar_dpt_nm = p.beansFactory.createTableColumn("Rslt.ar_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_acst_cd = p.beansFactory.createTableColumn("Rslt.acst_cd", MCColumnType.TEXT);
		p.columnRslt_acst_nm = p.beansFactory.createTableColumn("Rslt.acst_nm", MCColumnType.TEXT);
		p.columnRslt_ar_typ = p.beansFactory.createTableColumn("Rslt.ar_typ", MCColumnType.TEXT);
		p.columnRslt_ar_typ_nm = p.beansFactory.createTableColumn("Rslt.ar_typ_nm", MCColumnType.TEXT);
		p.columnRslt_rcv_schd_dt = p.beansFactory.createTableColumn("Rslt.rcv_schd_dt", MCColumnType.DATE);
		p.columnRslt_multi_flg = p.beansFactory.createTableColumn("Rslt.multi_flg", MCColumnType.CHECK);
		p.columnRslt_slip_sts_typ = p.beansFactory.createTableColumn("Rslt.slip_sts_typ", MCColumnType.TEXT);
		p.columnRslt_slip_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cd = p.beansFactory.createTableColumn("Rslt.trd_cd", MCColumnType.TEXT);
		p.columnRslt_trd_nm = p.beansFactory.createTableColumn("Rslt.trd_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_amt_dec_place = p.beansFactory.createTableColumn("Rslt.amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_ac_ym = p.beansFactory.createTableColumn("Rslt.ac_ym", MCColumnType.DATE);
		p.columnRslt_ac_dt = p.beansFactory.createTableColumn("Rslt.ac_dt", MCColumnType.DATE);
		p.columnRslt_dlv_dt = p.beansFactory.createTableColumn("Rslt.dlv_dt", MCColumnType.DATE);
		p.columnRslt_bill_ym = p.beansFactory.createTableColumn("Rslt.bill_ym", MCColumnType.DATE);
		p.columnRslt_bill_cl_day = p.beansFactory.createTableColumn("Rslt.bill_cl_day", MCColumnType.NUMBER);
		p.columnRslt_bill_dt = p.beansFactory.createTableColumn("Rslt.bill_dt", MCColumnType.DATE);
		p.columnRslt_bill_no = p.beansFactory.createTableColumn("Rslt.bill_no", MCColumnType.TEXT);
		p.columnRslt_act_no = p.beansFactory.createTableColumn("Rslt.act_no", MCColumnType.TEXT);
		p.columnRslt_act_d_no = p.beansFactory.createTableColumn("Rslt.act_d_no", MCColumnType.TEXT);
		p.columnRslt_iv_no = p.beansFactory.createTableColumn("Rslt.iv_no", MCColumnType.TEXT);
		p.columnRslt_cst_cd = p.beansFactory.createTableColumn("Rslt.cst_cd", MCColumnType.TEXT);
		p.columnRslt_cst_nm = p.beansFactory.createTableColumn("Rslt.cst_nm", MCColumnType.TEXT);
		p.columnRslt_dlv_cd = p.beansFactory.createTableColumn("Rslt.dlv_cd", MCColumnType.TEXT);
		p.columnRslt_dlv_nm = p.beansFactory.createTableColumn("Rslt.dlv_nm", MCColumnType.TEXT);
		p.columnRslt_dest_cd1 = p.beansFactory.createTableColumn("Rslt.dest_cd1", MCColumnType.TEXT);
		p.columnRslt_dest_nm1 = p.beansFactory.createTableColumn("Rslt.dest_nm1", MCColumnType.TEXT);
		p.columnRslt_dest_cd2 = p.beansFactory.createTableColumn("Rslt.dest_cd2", MCColumnType.TEXT);
		p.columnRslt_dest_nm2 = p.beansFactory.createTableColumn("Rslt.dest_nm2", MCColumnType.TEXT);
		p.columnRslt_dest_cd3 = p.beansFactory.createTableColumn("Rslt.dest_cd3", MCColumnType.TEXT);
		p.columnRslt_dest_nm3 = p.beansFactory.createTableColumn("Rslt.dest_nm3", MCColumnType.TEXT);
		p.columnRslt_sls_dpt_cd = p.beansFactory.createTableColumn("Rslt.sls_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_sls_dpt_nm = p.beansFactory.createTableColumn("Rslt.sls_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_sls_usr_cd = p.beansFactory.createTableColumn("Rslt.sls_usr_cd", MCColumnType.TEXT);
		p.columnRslt_sls_usr_nm = p.beansFactory.createTableColumn("Rslt.sls_usr_nm", MCColumnType.TEXT);
		p.columnRslt_slo_no = p.beansFactory.createTableColumn("Rslt.slo_no", MCColumnType.TEXT);
		p.columnRslt_slo_d_no = p.beansFactory.createTableColumn("Rslt.slo_d_no", MCColumnType.TEXT);
		p.columnRslt_cst_po_no = p.beansFactory.createTableColumn("Rslt.cst_po_no", MCColumnType.TEXT);
		p.columnRslt_cst_po_d_no = p.beansFactory.createTableColumn("Rslt.cst_po_d_no", MCColumnType.TEXT);
		p.columnRslt_dlv_slip_no = p.beansFactory.createTableColumn("Rslt.dlv_slip_no", MCColumnType.TEXT);
		p.columnRslt_dlv_slip_d_no = p.beansFactory.createTableColumn("Rslt.dlv_slip_d_no", MCColumnType.TEXT);
		p.columnRslt_ship_dlv_slip_no = p.beansFactory.createTableColumn("Rslt.ship_dlv_slip_no", MCColumnType.TEXT);
		p.columnRslt_ship_dlv_slip_d_no = p.beansFactory.createTableColumn("Rslt.ship_dlv_slip_d_no", MCColumnType.TEXT);
		p.columnRslt_ship_dlv_slip_multi_flg = p.beansFactory.createTableColumn("Rslt.ship_dlv_slip_multi_flg", MCColumnType.CHECK);
		p.columnRslt_arsw_ac_ym = p.beansFactory.createTableColumn("Rslt.arsw_ac_ym", MCColumnType.DATE);
		p.columnRslt_arsw_ac_dt = p.beansFactory.createTableColumn("Rslt.arsw_ac_dt", MCColumnType.DATE);
		p.columnRslt_arsw_trd_cd = p.beansFactory.createTableColumn("Rslt.arsw_trd_cd", MCColumnType.TEXT);
		p.columnRslt_arsw_trd_nm = p.beansFactory.createTableColumn("Rslt.arsw_trd_nm", MCColumnType.TEXT);
		p.columnRslt_arsw_act_no = p.beansFactory.createTableColumn("Rslt.arsw_act_no", MCColumnType.TEXT);
		p.columnRslt_arsw_act_d_no = p.beansFactory.createTableColumn("Rslt.arsw_act_d_no", MCColumnType.TEXT);
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
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBGP_ArDtlApplBalSrch p) {
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
		p.FoldPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
		p.CtrlPanel.setNextBeans(p.RPnlPanel);
		p.TopPanel.add(p.RPnlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBGP_ArDtlApplBalSrch p) {
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
	protected static void jbInitTab1(MSBGP_ArDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBGP_ArDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.AcstCndPanel, null);
		p.Tab2Panel.setLastBeans(p.AcstCndPanel);
	}

	/**
	 * [AcstCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAcstCnd(MSBGP_ArDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.AcstCndPanel.setValueCheck(false);
		p.AcstCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.AcstCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBGP_ArDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_rcv_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_rcv_schd_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_rcv_schd_dt_fr);
		p.Cnd_rcv_schd_dt_fr.setNextBeans(p.Cnd_rcv_schd_dt_to);
		p.Cnd_rcv_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0120.CndR.rcv_schd_dt_fr_META);
		p.Cnd_rcv_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_rcv_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_rcv_schd_dt_to);
		p.Cnd_rcv_schd_dt_to.setNextBeans(p.Cnd_ac_dt_fr);
		p.Cnd_rcv_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0120.CndR.rcv_schd_dt_to_META);
		p.Cnd_rcv_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_fr_Label);
		p.CndPanel.add(p.Cnd_ac_dt_fr);
		p.Cnd_ac_dt_fr.setNextBeans(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_fr.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0120.CndR.ac_dt_fr_META);
		p.Cnd_ac_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_to_Label);
		p.CndPanel.add(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_to.setNextBeans(p.Cnd_acst_cd);
		p.Cnd_ac_dt_to.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0120.CndR.ac_dt_to_META);
		p.Cnd_ac_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_acst_cd_Label);
		p.CndPanel.add(p.Cnd_acst_cd);
		p.Cnd_acst_cd.setNextBeans(p.Cnd_acst_nm);
		p.Cnd_acst_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0120.CndR.acst_cd_META);
		p.Cnd_acst_cd.addLinkBeans(p.Cnd_acst_nm);
		p.Cnd_acst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_acst_cd, true);
		p.CndPanel.add(p.Cnd_acst_nm);
		p.Cnd_acst_nm.setNextBeans(p.Cnd_ar_dpt_cd);
		p.Cnd_acst_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0120.CndR.acst_nm_META);
		p.setPluralValueEnable(p.Cnd_acst_nm, true);
		p.CndPanel.add(p.Cnd_ar_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_ar_dpt_cd);
		p.Cnd_ar_dpt_cd.setNextBeans(p.Cnd_ar_dpt_nm);
		p.Cnd_ar_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0120.CndR.ar_dpt_cd_META);
		p.Cnd_ar_dpt_cd.addLinkBeans(p.Cnd_ar_dpt_nm);
		p.Cnd_ar_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ar_dpt_cd, true);
		p.CndPanel.add(p.Cnd_ar_dpt_nm);
		p.Cnd_ar_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_ar_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0120.CndR.ar_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_ar_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0120.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_sls_usr_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0120.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_sls_usr_cd_Label);
		p.CndPanel.add(p.Cnd_sls_usr_cd);
		p.Cnd_sls_usr_cd.setNextBeans(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0120.CndR.sls_usr_cd_META);
		p.Cnd_sls_usr_cd.addLinkBeans(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_usr_cd, true);
		p.CndPanel.add(p.Cnd_sls_usr_nm);
		p.Cnd_sls_usr_nm.setNextBeans(p.Cnd_sls_dpt_cd);
		p.Cnd_sls_usr_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0120.CndR.sls_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_usr_nm, true);
		p.CndPanel.add(p.Cnd_sls_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_sls_dpt_cd);
		p.Cnd_sls_dpt_cd.setNextBeans(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0120.CndR.sls_dpt_cd_META);
		p.Cnd_sls_dpt_cd.addLinkBeans(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_dpt_cd, true);
		p.CndPanel.add(p.Cnd_sls_dpt_nm);
		p.Cnd_sls_dpt_nm.setNextBeans(p.Cnd_trd_cur_cd);
		p.Cnd_sls_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0120.CndR.sls_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_dpt_nm, true);
		p.Cnd_trd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cur_cd, true);
		p.Cnd_trd_cur_cd.setLinkBeans(p.Cnd_trd_cur_nm);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0120.CndR.trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_iv_no);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0120.CndR.trd_cur_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_cur_nm, true);
		p.CndPanel.add(p.Cnd_iv_no_Label);
		p.CndPanel.add(p.Cnd_iv_no);
		p.Cnd_iv_no.setNextBeans(p.Cnd_bill_no);
		p.Cnd_iv_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0120.CndR.iv_no_META);
		p.setPluralValueEnable(p.Cnd_iv_no, true);
		p.CndPanel.add(p.Cnd_bill_no_Label);
		p.CndPanel.add(p.Cnd_bill_no);
		p.Cnd_bill_no.setNextBeans(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_bill_no.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0120.CndR.bill_no_META);
		p.setPluralValueEnable(p.Cnd_bill_no, true);
		p.CndPanel.add(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_wrk_no_p_PPanel.setNextBeans(p.Cnd_ar_typ);
		p.Cnd_ar_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ar_typ, true);
		p.Cnd_ar_typ.setLinkBeans(p.Cnd_ar_typ_nm);
		p.CndPanel.add(p.Cnd_ar_typ_Label);
		p.CndPanel.add(p.Cnd_ar_typ);
		p.Cnd_ar_typ.setNextBeans(p.Cnd_ar_typ_nm);
		p.Cnd_ar_typ.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0120.CndR.ar_typ_META);
		p.CndPanel.add(p.Cnd_ar_typ_nm);
		p.Cnd_ar_typ_nm.setNextBeans(p.Cnd_incl_not_bill_flg);
		p.Cnd_ar_typ_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0120.CndR.ar_typ_nm_META);
		p.CndPanel.add(p.Cnd_incl_not_bill_flg);
		p.Cnd_incl_not_bill_flg.setNextBeans(p.Cnd_incl_appl_flg);
		p.Cnd_incl_not_bill_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0120.CndR.incl_not_bill_flg_META);
		p.CndPanel.add(p.Cnd_incl_appl_flg);
		p.Cnd_incl_appl_flg.setNextBeans(p.Cnd_incl_can_flg);
		p.Cnd_incl_appl_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0120.CndR.incl_appl_flg_META);
		p.CndPanel.add(p.Cnd_incl_can_flg);
		p.Cnd_incl_can_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0120.CndR.incl_can_flg_META);
		p.AcstCndPanel.add(p.Cnd_acst_grp_p_PPanel);
		p.AcstCndPanel.setLastBeans(p.Cnd_acst_grp_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBGP_ArDtlApplBalSrch p) {
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
	protected static void jbInitRPnl(MSBGP_ArDtlApplBalSrch p) {
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
	protected static void jbInitRslt(MSBGP_ArDtlApplBalSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltPanel.setLayoutPosition("CBC");
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
		MSBGP_ArDtlApplBalSrch_MC.mcInitTop((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.mcInitFold((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.mcInitTab1((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.mcInitTab2((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.mcInitAcstCnd((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.mcInitCnd((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.mcInitCtrl((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.mcInitRPnl((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.mcInitRslt((MSBGP_ArDtlApplBalSrch)this);

		// [SRCH]ステータスのモードの設定
		MSBGP_ArDtlApplBalSrch_MC.statusInitSRCH_Top((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.statusInitSRCH_Fold((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.statusInitSRCH_Tab1((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.statusInitSRCH_Tab2((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.statusInitSRCH_AcstCnd((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.statusInitSRCH_Cnd((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.statusInitSRCH_Ctrl((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.statusInitSRCH_RPnl((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.statusInitSRCH_Rslt((MSBGP_ArDtlApplBalSrch)this);

		// [REF]ステータスのモードの設定
		MSBGP_ArDtlApplBalSrch_MC.statusInitREF_Top((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.statusInitREF_Fold((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.statusInitREF_Tab1((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.statusInitREF_Tab2((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.statusInitREF_AcstCnd((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.statusInitREF_Cnd((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.statusInitREF_Ctrl((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.statusInitREF_RPnl((MSBGP_ArDtlApplBalSrch)this);
		MSBGP_ArDtlApplBalSrch_MC.statusInitREF_Rslt((MSBGP_ArDtlApplBalSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBGP_ArDtlApplBalSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBGP_ArDtlApplBalSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBGP_ArDtlApplBalSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBGP_ArDtlApplBalSrch p) {
	}

	/**
	 *  [AcstCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAcstCnd(MSBGP_ArDtlApplBalSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBGP_ArDtlApplBalSrch p) {
		p.Cnd_rcv_schd_dt_fr.setListListener(p);
		p.Cnd_rcv_schd_dt_fr.addAllListener(p);
		p.Cnd_rcv_schd_dt_to.setListListener(p);
		p.Cnd_rcv_schd_dt_to.addAllListener(p);
		p.Cnd_ac_dt_fr.setListListener(p);
		p.Cnd_ac_dt_fr.addAllListener(p);
		p.Cnd_ac_dt_to.setListListener(p);
		p.Cnd_ac_dt_to.addAllListener(p);
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
		p.Cnd_sls_usr_cd.setListListener(p);
		p.Cnd_sls_usr_cd.addAllListener(p);
		p.Cnd_sls_usr_nm.setListListener(p);
		p.Cnd_sls_usr_nm.addAllListener(p);
		p.Cnd_sls_dpt_cd.setListListener(p);
		p.Cnd_sls_dpt_cd.addAllListener(p);
		p.Cnd_sls_dpt_nm.setListListener(p);
		p.Cnd_sls_dpt_nm.addAllListener(p);
		p.Cnd_trd_cur_cd.setListListener(p);
		p.Cnd_trd_cur_cd.addAllListener(p);
		p.Cnd_trd_cur_nm.setListListener(p);
		p.Cnd_trd_cur_nm.addAllListener(p);
		p.Cnd_iv_no.setListListener(p);
		p.Cnd_iv_no.addAllListener(p);
		p.Cnd_bill_no.setListListener(p);
		p.Cnd_bill_no.addAllListener(p);
		p.Cnd_ar_typ.setListListener(p);
		p.Cnd_ar_typ.addAllListener(p);
		p.Cnd_ar_typ_nm.setListListener(p);
		p.Cnd_ar_typ_nm.addAllListener(p);
		p.Cnd_incl_not_bill_flg.addAllListener(p);
		p.Cnd_incl_appl_flg.addAllListener(p);
		p.Cnd_incl_can_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBGP_ArDtlApplBalSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBGP_ArDtlApplBalSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBGP_ArDtlApplBalSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_ar_dpt_cd.addAllListener(p);
		p.columnRslt_ar_dpt_cd.setListListener(p);
		p.columnRslt_ar_dpt_nm.addAllListener(p);
		p.columnRslt_ar_dpt_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_acst_cd.addAllListener(p);
		p.columnRslt_acst_cd.setListListener(p);
		p.columnRslt_acst_nm.addAllListener(p);
		p.columnRslt_acst_nm.setListListener(p);
		p.columnRslt_ar_typ.addAllListener(p);
		p.columnRslt_ar_typ.setListListener(p);
		p.columnRslt_ar_typ_nm.addAllListener(p);
		p.columnRslt_ar_typ_nm.setListListener(p);
		p.columnRslt_rcv_schd_dt.addAllListener(p);
		p.columnRslt_rcv_schd_dt.setListListener(p);
		p.columnRslt_multi_flg.addAllListener(p);
		p.columnRslt_slip_sts_typ.addAllListener(p);
		p.columnRslt_slip_sts_typ.setListListener(p);
		p.columnRslt_slip_sts_typ_nm.addAllListener(p);
		p.columnRslt_slip_sts_typ_nm.setListListener(p);
		p.columnRslt_trd_cd.addAllListener(p);
		p.columnRslt_trd_cd.setListListener(p);
		p.columnRslt_trd_nm.addAllListener(p);
		p.columnRslt_trd_nm.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_amt_dec_place.addAllListener(p);
		p.columnRslt_amt_dec_place.setListListener(p);
		p.columnRslt_ac_ym.addAllListener(p);
		p.columnRslt_ac_ym.setListListener(p);
		p.columnRslt_ac_dt.addAllListener(p);
		p.columnRslt_ac_dt.setListListener(p);
		p.columnRslt_dlv_dt.addAllListener(p);
		p.columnRslt_dlv_dt.setListListener(p);
		p.columnRslt_bill_ym.addAllListener(p);
		p.columnRslt_bill_ym.setListListener(p);
		p.columnRslt_bill_cl_day.addAllListener(p);
		p.columnRslt_bill_cl_day.setListListener(p);
		p.columnRslt_bill_dt.addAllListener(p);
		p.columnRslt_bill_dt.setListListener(p);
		p.columnRslt_bill_no.addAllListener(p);
		p.columnRslt_bill_no.setListListener(p);
		p.columnRslt_act_no.addAllListener(p);
		p.columnRslt_act_no.setListListener(p);
		p.columnRslt_act_d_no.addAllListener(p);
		p.columnRslt_act_d_no.setListListener(p);
		p.columnRslt_iv_no.addAllListener(p);
		p.columnRslt_iv_no.setListListener(p);
		p.columnRslt_cst_cd.addAllListener(p);
		p.columnRslt_cst_cd.setListListener(p);
		p.columnRslt_cst_nm.addAllListener(p);
		p.columnRslt_cst_nm.setListListener(p);
		p.columnRslt_dlv_cd.addAllListener(p);
		p.columnRslt_dlv_cd.setListListener(p);
		p.columnRslt_dlv_nm.addAllListener(p);
		p.columnRslt_dlv_nm.setListListener(p);
		p.columnRslt_dest_cd1.addAllListener(p);
		p.columnRslt_dest_cd1.setListListener(p);
		p.columnRslt_dest_nm1.addAllListener(p);
		p.columnRslt_dest_nm1.setListListener(p);
		p.columnRslt_dest_cd2.addAllListener(p);
		p.columnRslt_dest_cd2.setListListener(p);
		p.columnRslt_dest_nm2.addAllListener(p);
		p.columnRslt_dest_nm2.setListListener(p);
		p.columnRslt_dest_cd3.addAllListener(p);
		p.columnRslt_dest_cd3.setListListener(p);
		p.columnRslt_dest_nm3.addAllListener(p);
		p.columnRslt_dest_nm3.setListListener(p);
		p.columnRslt_sls_dpt_cd.addAllListener(p);
		p.columnRslt_sls_dpt_cd.setListListener(p);
		p.columnRslt_sls_dpt_nm.addAllListener(p);
		p.columnRslt_sls_dpt_nm.setListListener(p);
		p.columnRslt_sls_usr_cd.addAllListener(p);
		p.columnRslt_sls_usr_cd.setListListener(p);
		p.columnRslt_sls_usr_nm.addAllListener(p);
		p.columnRslt_sls_usr_nm.setListListener(p);
		p.columnRslt_slo_no.addAllListener(p);
		p.columnRslt_slo_no.setListListener(p);
		p.columnRslt_slo_d_no.addAllListener(p);
		p.columnRslt_slo_d_no.setListListener(p);
		p.columnRslt_cst_po_no.addAllListener(p);
		p.columnRslt_cst_po_no.setListListener(p);
		p.columnRslt_cst_po_d_no.addAllListener(p);
		p.columnRslt_cst_po_d_no.setListListener(p);
		p.columnRslt_dlv_slip_no.addAllListener(p);
		p.columnRslt_dlv_slip_no.setListListener(p);
		p.columnRslt_dlv_slip_d_no.addAllListener(p);
		p.columnRslt_dlv_slip_d_no.setListListener(p);
		p.columnRslt_ship_dlv_slip_no.addAllListener(p);
		p.columnRslt_ship_dlv_slip_no.setListListener(p);
		p.columnRslt_ship_dlv_slip_d_no.addAllListener(p);
		p.columnRslt_ship_dlv_slip_d_no.setListListener(p);
		p.columnRslt_ship_dlv_slip_multi_flg.addAllListener(p);
		p.columnRslt_arsw_ac_ym.addAllListener(p);
		p.columnRslt_arsw_ac_ym.setListListener(p);
		p.columnRslt_arsw_ac_dt.addAllListener(p);
		p.columnRslt_arsw_ac_dt.setListListener(p);
		p.columnRslt_arsw_trd_cd.addAllListener(p);
		p.columnRslt_arsw_trd_cd.setListListener(p);
		p.columnRslt_arsw_trd_nm.addAllListener(p);
		p.columnRslt_arsw_trd_nm.setListListener(p);
		p.columnRslt_arsw_act_no.addAllListener(p);
		p.columnRslt_arsw_act_no.setListListener(p);
		p.columnRslt_arsw_act_d_no.addAllListener(p);
		p.columnRslt_arsw_act_d_no.setListListener(p);
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
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBGP_ArDtlApplBalSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBGP_ArDtlApplBalSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBGP_ArDtlApplBalSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBGP_ArDtlApplBalSrch p){

	}

	/**
	 * [SRCH]ステータスの[AcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_AcstCnd(MSBGP_ArDtlApplBalSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBGP_ArDtlApplBalSrch p){
		p.Cnd_rcv_schd_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcv_schd_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_acst_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_acst_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ar_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ar_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bill_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_ar_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ar_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_incl_not_bill_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_incl_appl_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_incl_can_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_acst_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBGP_ArDtlApplBalSrch p){

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MSBGP_ArDtlApplBalSrch p){
		p.RPnl_dwnld.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBGP_ArDtlApplBalSrch p){
		p.columnRslt_ar_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ar_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ar_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_multi_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slip_sts_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_slip_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_appl_tgt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_not_appl_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_day.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bill_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dest_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dest_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dest_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dest_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dest_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dest_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_multi_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_old_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_arsw_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_arsw_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_arsw_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_arsw_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_arsw_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_arsw_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_acst_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBGP_ArDtlApplBalSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBGP_ArDtlApplBalSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBGP_ArDtlApplBalSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBGP_ArDtlApplBalSrch p){

	}

	/**
	 * [REF]ステータスの[AcstCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_AcstCnd(MSBGP_ArDtlApplBalSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBGP_ArDtlApplBalSrch p){
		p.Cnd_rcv_schd_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcv_schd_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_acst_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_acst_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ar_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ar_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bill_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_ar_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ar_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_incl_not_bill_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_incl_appl_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_incl_can_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_acst_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBGP_ArDtlApplBalSrch p){

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBGP_ArDtlApplBalSrch p){
		p.RPnl_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBGP_ArDtlApplBalSrch p){
		p.columnRslt_ar_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ar_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_acst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_acst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ar_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ar_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_multi_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slip_sts_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_slip_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_appl_tgt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_not_appl_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_cl_day.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bill_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dest_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dest_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dest_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dest_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dest_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dest_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sls_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sls_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cst_po_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_multi_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_old_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_arsw_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_arsw_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_arsw_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_arsw_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_arsw_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_arsw_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_acst_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
		MSBGP_ArDtlApplBalSrch_MC.setTableConfigRslt((MSBGP_ArDtlApplBalSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBGP_ArDtlApplBalSrch p) {
		p.columnRslt_ar_dpt_cd.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.ar_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_dpt_cd);
		p.columnRslt_ar_dpt_nm.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.ar_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_dpt_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_acst_cd.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.acst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acst_cd);
		p.columnRslt_acst_nm.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.acst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acst_nm);
		p.columnRslt_ar_typ.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.ar_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_typ);
		p.columnRslt_ar_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.ar_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ar_typ_nm);
		p.columnRslt_rcv_schd_dt.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.rcv_schd_dt_META);
		p.columnRslt_rcv_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_schd_dt);
		p.columnRslt_multi_flg.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.multi_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_multi_flg);
		p.columnRslt_slip_sts_typ.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.slip_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slip_sts_typ);
		p.columnRslt_slip_sts_typ_nm.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.slip_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slip_sts_typ_nm);
		p.columnRslt_trd_cd.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.trd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cd);
		p.columnRslt_trd_nm.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.trd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_nm);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_amt_dec_place.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt_dec_place);
		p.RsltTable.addTable(p.Rslt_appl_tgt_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_not_appl_bal_p_PPanel.AmtTable);
		p.columnRslt_ac_ym.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.ac_ym_META);
		p.columnRslt_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_ym);
		p.columnRslt_ac_dt.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.ac_dt_META);
		p.columnRslt_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_dt);
		p.columnRslt_dlv_dt.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.dlv_dt_META);
		p.columnRslt_dlv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_dt);
		p.columnRslt_bill_ym.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.bill_ym_META);
		p.columnRslt_bill_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_ym);
		p.columnRslt_bill_cl_day.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.bill_cl_day_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_cl_day);
		p.columnRslt_bill_dt.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.bill_dt_META);
		p.columnRslt_bill_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_dt);
		p.columnRslt_bill_no.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.bill_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bill_no);
		p.columnRslt_act_no.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_no);
		p.columnRslt_act_d_no.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.act_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_d_no);
		p.columnRslt_iv_no.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_no);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.RsltTable.addTable(p.Rslt_sno_p_PPanel.SnoWrkNoTable);
		p.columnRslt_cst_cd.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.cst_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_cd);
		p.columnRslt_cst_nm.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.cst_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_nm);
		p.columnRslt_dlv_cd.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.dlv_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_cd);
		p.columnRslt_dlv_nm.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.dlv_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_nm);
		p.columnRslt_dest_cd1.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.dest_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_cd1);
		p.columnRslt_dest_nm1.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.dest_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_nm1);
		p.columnRslt_dest_cd2.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.dest_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_cd2);
		p.columnRslt_dest_nm2.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.dest_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_nm2);
		p.columnRslt_dest_cd3.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.dest_cd3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_cd3);
		p.columnRslt_dest_nm3.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.dest_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_nm3);
		p.columnRslt_sls_dpt_cd.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.sls_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_dpt_cd);
		p.columnRslt_sls_dpt_nm.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.sls_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_dpt_nm);
		p.columnRslt_sls_usr_cd.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.sls_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_usr_cd);
		p.columnRslt_sls_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.sls_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_usr_nm);
		p.columnRslt_slo_no.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.slo_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_no);
		p.columnRslt_slo_d_no.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.slo_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_d_no);
		p.columnRslt_cst_po_no.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.cst_po_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_po_no);
		p.columnRslt_cst_po_d_no.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.cst_po_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_po_d_no);
		p.columnRslt_dlv_slip_no.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.dlv_slip_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_no);
		p.columnRslt_dlv_slip_d_no.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.dlv_slip_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_d_no);
		p.columnRslt_ship_dlv_slip_no.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.ship_dlv_slip_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_dlv_slip_no);
		p.columnRslt_ship_dlv_slip_d_no.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.ship_dlv_slip_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_dlv_slip_d_no);
		p.columnRslt_ship_dlv_slip_multi_flg.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.ship_dlv_slip_multi_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_dlv_slip_multi_flg);
		p.RsltTable.addTable(p.Rslt_old_wrk_no_p_PPanel.WrkNoTable);
		p.columnRslt_arsw_ac_ym.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.arsw_ac_ym_META);
		p.columnRslt_arsw_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_arsw_ac_ym);
		p.columnRslt_arsw_ac_dt.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.arsw_ac_dt_META);
		p.columnRslt_arsw_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_arsw_ac_dt);
		p.columnRslt_arsw_trd_cd.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.arsw_trd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_arsw_trd_cd);
		p.columnRslt_arsw_trd_nm.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.arsw_trd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_arsw_trd_nm);
		p.columnRslt_arsw_act_no.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.arsw_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_arsw_act_no);
		p.columnRslt_arsw_act_d_no.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.arsw_act_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_arsw_act_d_no);
		p.RsltTable.addTable(p.Rslt_acst_grp_p_PPanel.BpGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBG.MSBGP0120.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_acst_cd.getListConfig().setPutter(getCnd_acst_cd_ListPutter());
		Cnd_ar_dpt_cd.getListConfig().setPutter(getCnd_ar_dpt_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_sls_usr_cd.getListConfig().setPutter(getCnd_sls_usr_cd_ListPutter());
		Cnd_sls_dpt_cd.getListConfig().setPutter(getCnd_sls_dpt_cd_ListPutter());
		Cnd_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cur_cd.getListConfig().setPutter(getCnd_trd_cur_cd_ListPutter());
		Cnd_ar_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ar_typ.getListConfig().setPutter(getCnd_ar_typ_ListPutter());
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
	 * [Cnd_sls_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sls_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_sls_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sls_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
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
	 * [Cnd_ar_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ar_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ArTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_acst_cd) return getCnd_acst_cd(row, info);
		if(combo == Cnd_ar_dpt_cd) return getCnd_ar_dpt_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_sls_usr_cd) return getCnd_sls_usr_cd(row, info);
		if(combo == Cnd_sls_dpt_cd) return getCnd_sls_dpt_cd(row, info);
		if(combo == Cnd_trd_cur_cd) return getCnd_trd_cur_cd(row, info);
		if(combo == Cnd_ar_typ) return getCnd_ar_typ(row, info);
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
		if (vc == Cnd_rcv_schd_dt_fr) return doCnd_rcv_schd_dt_fr_VC(info);
		if (vc == Cnd_rcv_schd_dt_to) return doCnd_rcv_schd_dt_to_VC(info);
		if (vc == Cnd_ac_dt_fr) return doCnd_ac_dt_fr_VC(info);
		if (vc == Cnd_ac_dt_to) return doCnd_ac_dt_to_VC(info);
		if (vc == Cnd_acst_cd) return doCnd_acst_cd_VC(info);
		if (vc == Cnd_acst_nm) return doCnd_acst_nm_VC(info);
		if (vc == Cnd_ar_dpt_cd) return doCnd_ar_dpt_cd_VC(info);
		if (vc == Cnd_ar_dpt_nm) return doCnd_ar_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_sls_usr_cd) return doCnd_sls_usr_cd_VC(info);
		if (vc == Cnd_sls_usr_nm) return doCnd_sls_usr_nm_VC(info);
		if (vc == Cnd_sls_dpt_cd) return doCnd_sls_dpt_cd_VC(info);
		if (vc == Cnd_sls_dpt_nm) return doCnd_sls_dpt_nm_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
		if (vc == Cnd_iv_no) return doCnd_iv_no_VC(info);
		if (vc == Cnd_bill_no) return doCnd_bill_no_VC(info);
		if (vc == Cnd_ar_typ) return doCnd_ar_typ_VC(info);
		if (vc == Cnd_ar_typ_nm) return doCnd_ar_typ_nm_VC(info);
		if (vc == Cnd_incl_not_bill_flg) return doCnd_incl_not_bill_flg_VC(info);
		if (vc == Cnd_incl_appl_flg) return doCnd_incl_appl_flg_VC(info);
		if (vc == Cnd_incl_can_flg) return doCnd_incl_can_flg_VC(info);
		if (vc == columnRslt_ar_dpt_cd) return doRslt_ar_dpt_cd_VC(info);
		if (vc == columnRslt_ar_dpt_nm) return doRslt_ar_dpt_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_acst_cd) return doRslt_acst_cd_VC(info);
		if (vc == columnRslt_acst_nm) return doRslt_acst_nm_VC(info);
		if (vc == columnRslt_ar_typ) return doRslt_ar_typ_VC(info);
		if (vc == columnRslt_ar_typ_nm) return doRslt_ar_typ_nm_VC(info);
		if (vc == columnRslt_rcv_schd_dt) return doRslt_rcv_schd_dt_VC(info);
		if (vc == columnRslt_multi_flg) return doRslt_multi_flg_VC(info);
		if (vc == columnRslt_slip_sts_typ) return doRslt_slip_sts_typ_VC(info);
		if (vc == columnRslt_slip_sts_typ_nm) return doRslt_slip_sts_typ_nm_VC(info);
		if (vc == columnRslt_trd_cd) return doRslt_trd_cd_VC(info);
		if (vc == columnRslt_trd_nm) return doRslt_trd_nm_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_amt_dec_place) return doRslt_amt_dec_place_VC(info);
		if (vc == columnRslt_ac_ym) return doRslt_ac_ym_VC(info);
		if (vc == columnRslt_ac_dt) return doRslt_ac_dt_VC(info);
		if (vc == columnRslt_dlv_dt) return doRslt_dlv_dt_VC(info);
		if (vc == columnRslt_bill_ym) return doRslt_bill_ym_VC(info);
		if (vc == columnRslt_bill_cl_day) return doRslt_bill_cl_day_VC(info);
		if (vc == columnRslt_bill_dt) return doRslt_bill_dt_VC(info);
		if (vc == columnRslt_bill_no) return doRslt_bill_no_VC(info);
		if (vc == columnRslt_act_no) return doRslt_act_no_VC(info);
		if (vc == columnRslt_act_d_no) return doRslt_act_d_no_VC(info);
		if (vc == columnRslt_iv_no) return doRslt_iv_no_VC(info);
		if (vc == columnRslt_cst_cd) return doRslt_cst_cd_VC(info);
		if (vc == columnRslt_cst_nm) return doRslt_cst_nm_VC(info);
		if (vc == columnRslt_dlv_cd) return doRslt_dlv_cd_VC(info);
		if (vc == columnRslt_dlv_nm) return doRslt_dlv_nm_VC(info);
		if (vc == columnRslt_dest_cd1) return doRslt_dest_cd1_VC(info);
		if (vc == columnRslt_dest_nm1) return doRslt_dest_nm1_VC(info);
		if (vc == columnRslt_dest_cd2) return doRslt_dest_cd2_VC(info);
		if (vc == columnRslt_dest_nm2) return doRslt_dest_nm2_VC(info);
		if (vc == columnRslt_dest_cd3) return doRslt_dest_cd3_VC(info);
		if (vc == columnRslt_dest_nm3) return doRslt_dest_nm3_VC(info);
		if (vc == columnRslt_sls_dpt_cd) return doRslt_sls_dpt_cd_VC(info);
		if (vc == columnRslt_sls_dpt_nm) return doRslt_sls_dpt_nm_VC(info);
		if (vc == columnRslt_sls_usr_cd) return doRslt_sls_usr_cd_VC(info);
		if (vc == columnRslt_sls_usr_nm) return doRslt_sls_usr_nm_VC(info);
		if (vc == columnRslt_slo_no) return doRslt_slo_no_VC(info);
		if (vc == columnRslt_slo_d_no) return doRslt_slo_d_no_VC(info);
		if (vc == columnRslt_cst_po_no) return doRslt_cst_po_no_VC(info);
		if (vc == columnRslt_cst_po_d_no) return doRslt_cst_po_d_no_VC(info);
		if (vc == columnRslt_dlv_slip_no) return doRslt_dlv_slip_no_VC(info);
		if (vc == columnRslt_dlv_slip_d_no) return doRslt_dlv_slip_d_no_VC(info);
		if (vc == columnRslt_ship_dlv_slip_no) return doRslt_ship_dlv_slip_no_VC(info);
		if (vc == columnRslt_ship_dlv_slip_d_no) return doRslt_ship_dlv_slip_d_no_VC(info);
		if (vc == columnRslt_ship_dlv_slip_multi_flg) return doRslt_ship_dlv_slip_multi_flg_VC(info);
		if (vc == columnRslt_arsw_ac_ym) return doRslt_arsw_ac_ym_VC(info);
		if (vc == columnRslt_arsw_ac_dt) return doRslt_arsw_ac_dt_VC(info);
		if (vc == columnRslt_arsw_trd_cd) return doRslt_arsw_trd_cd_VC(info);
		if (vc == columnRslt_arsw_trd_nm) return doRslt_arsw_trd_nm_VC(info);
		if (vc == columnRslt_arsw_act_no) return doRslt_arsw_act_no_VC(info);
		if (vc == columnRslt_arsw_act_d_no) return doRslt_arsw_act_d_no_VC(info);
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
	 * [Cnd]パネルの[rcv_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcv_schd_dt_fr_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_dpt_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[incl_not_bill_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_incl_not_bill_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[incl_appl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_incl_appl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[incl_can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_incl_can_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ar_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ar_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ar_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ar_dpt_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[acst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[acst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ar_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ar_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ar_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ar_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[slip_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slip_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slip_sts_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bill_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_d_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_usr_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_slip_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_dlv_slip_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_multi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_dlv_slip_multi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[arsw_ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_arsw_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[arsw_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_arsw_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[arsw_trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_arsw_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[arsw_trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_arsw_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[arsw_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_arsw_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[arsw_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_arsw_act_d_no_VC(MCEventInfo info){
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
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == FoldTab) doFold_NC(info);
		else if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_rcv_schd_dt_fr) doCnd_rcv_schd_dt_fr_NC(info);
		else if (nc == Cnd_rcv_schd_dt_to) doCnd_rcv_schd_dt_to_NC(info);
		else if (nc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NC(info);
		else if (nc == Cnd_ac_dt_to) doCnd_ac_dt_to_NC(info);
		else if (nc == Cnd_acst_cd) doCnd_acst_cd_NC(info);
		else if (nc == Cnd_acst_nm) doCnd_acst_nm_NC(info);
		else if (nc == Cnd_ar_dpt_cd) doCnd_ar_dpt_cd_NC(info);
		else if (nc == Cnd_ar_dpt_nm) doCnd_ar_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NC(info);
		else if (nc == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NC(info);
		else if (nc == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NC(info);
		else if (nc == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
		else if (nc == Cnd_iv_no) doCnd_iv_no_NC(info);
		else if (nc == Cnd_bill_no) doCnd_bill_no_NC(info);
		else if (nc == Cnd_ar_typ) doCnd_ar_typ_NC(info);
		else if (nc == Cnd_ar_typ_nm) doCnd_ar_typ_nm_NC(info);
		else if (nc == Cnd_incl_not_bill_flg) doCnd_incl_not_bill_flg_NC(info);
		else if (nc == Cnd_incl_appl_flg) doCnd_incl_appl_flg_NC(info);
		else if (nc == Cnd_incl_can_flg) doCnd_incl_can_flg_NC(info);
		else if (nc == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_NC(info);
		else if (nc == columnRslt_ar_dpt_nm) doRslt_ar_dpt_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_acst_cd) doRslt_acst_cd_NC(info);
		else if (nc == columnRslt_acst_nm) doRslt_acst_nm_NC(info);
		else if (nc == columnRslt_ar_typ) doRslt_ar_typ_NC(info);
		else if (nc == columnRslt_ar_typ_nm) doRslt_ar_typ_nm_NC(info);
		else if (nc == columnRslt_rcv_schd_dt) doRslt_rcv_schd_dt_NC(info);
		else if (nc == columnRslt_multi_flg) doRslt_multi_flg_NC(info);
		else if (nc == columnRslt_slip_sts_typ) doRslt_slip_sts_typ_NC(info);
		else if (nc == columnRslt_slip_sts_typ_nm) doRslt_slip_sts_typ_nm_NC(info);
		else if (nc == columnRslt_trd_cd) doRslt_trd_cd_NC(info);
		else if (nc == columnRslt_trd_nm) doRslt_trd_nm_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_amt_dec_place) doRslt_amt_dec_place_NC(info);
		else if (nc == columnRslt_ac_ym) doRslt_ac_ym_NC(info);
		else if (nc == columnRslt_ac_dt) doRslt_ac_dt_NC(info);
		else if (nc == columnRslt_dlv_dt) doRslt_dlv_dt_NC(info);
		else if (nc == columnRslt_bill_ym) doRslt_bill_ym_NC(info);
		else if (nc == columnRslt_bill_cl_day) doRslt_bill_cl_day_NC(info);
		else if (nc == columnRslt_bill_dt) doRslt_bill_dt_NC(info);
		else if (nc == columnRslt_bill_no) doRslt_bill_no_NC(info);
		else if (nc == columnRslt_act_no) doRslt_act_no_NC(info);
		else if (nc == columnRslt_act_d_no) doRslt_act_d_no_NC(info);
		else if (nc == columnRslt_iv_no) doRslt_iv_no_NC(info);
		else if (nc == columnRslt_cst_cd) doRslt_cst_cd_NC(info);
		else if (nc == columnRslt_cst_nm) doRslt_cst_nm_NC(info);
		else if (nc == columnRslt_dlv_cd) doRslt_dlv_cd_NC(info);
		else if (nc == columnRslt_dlv_nm) doRslt_dlv_nm_NC(info);
		else if (nc == columnRslt_dest_cd1) doRslt_dest_cd1_NC(info);
		else if (nc == columnRslt_dest_nm1) doRslt_dest_nm1_NC(info);
		else if (nc == columnRslt_dest_cd2) doRslt_dest_cd2_NC(info);
		else if (nc == columnRslt_dest_nm2) doRslt_dest_nm2_NC(info);
		else if (nc == columnRslt_dest_cd3) doRslt_dest_cd3_NC(info);
		else if (nc == columnRslt_dest_nm3) doRslt_dest_nm3_NC(info);
		else if (nc == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_NC(info);
		else if (nc == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_NC(info);
		else if (nc == columnRslt_sls_usr_cd) doRslt_sls_usr_cd_NC(info);
		else if (nc == columnRslt_sls_usr_nm) doRslt_sls_usr_nm_NC(info);
		else if (nc == columnRslt_slo_no) doRslt_slo_no_NC(info);
		else if (nc == columnRslt_slo_d_no) doRslt_slo_d_no_NC(info);
		else if (nc == columnRslt_cst_po_no) doRslt_cst_po_no_NC(info);
		else if (nc == columnRslt_cst_po_d_no) doRslt_cst_po_d_no_NC(info);
		else if (nc == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NC(info);
		else if (nc == columnRslt_dlv_slip_d_no) doRslt_dlv_slip_d_no_NC(info);
		else if (nc == columnRslt_ship_dlv_slip_no) doRslt_ship_dlv_slip_no_NC(info);
		else if (nc == columnRslt_ship_dlv_slip_d_no) doRslt_ship_dlv_slip_d_no_NC(info);
		else if (nc == columnRslt_ship_dlv_slip_multi_flg) doRslt_ship_dlv_slip_multi_flg_NC(info);
		else if (nc == columnRslt_arsw_ac_ym) doRslt_arsw_ac_ym_NC(info);
		else if (nc == columnRslt_arsw_ac_dt) doRslt_arsw_ac_dt_NC(info);
		else if (nc == columnRslt_arsw_trd_cd) doRslt_arsw_trd_cd_NC(info);
		else if (nc == columnRslt_arsw_trd_nm) doRslt_arsw_trd_nm_NC(info);
		else if (nc == columnRslt_arsw_act_no) doRslt_arsw_act_no_NC(info);
		else if (nc == columnRslt_arsw_act_d_no) doRslt_arsw_act_d_no_NC(info);
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
	 * [Cnd]パネルの[rcv_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[incl_not_bill_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_incl_not_bill_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[incl_appl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_incl_appl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[incl_can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_incl_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[acst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[slip_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_dt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_multi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_multi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arsw_ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arsw_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arsw_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arsw_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arsw_trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arsw_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arsw_trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arsw_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arsw_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arsw_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arsw_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arsw_act_d_no_NC(MCEventInfo info){
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
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == FoldTab) doFold_NE(info);
		else if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_rcv_schd_dt_fr) doCnd_rcv_schd_dt_fr_NE(info);
		else if (ne == Cnd_rcv_schd_dt_to) doCnd_rcv_schd_dt_to_NE(info);
		else if (ne == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NE(info);
		else if (ne == Cnd_ac_dt_to) doCnd_ac_dt_to_NE(info);
		else if (ne == Cnd_acst_cd) doCnd_acst_cd_NE(info);
		else if (ne == Cnd_acst_nm) doCnd_acst_nm_NE(info);
		else if (ne == Cnd_ar_dpt_cd) doCnd_ar_dpt_cd_NE(info);
		else if (ne == Cnd_ar_dpt_nm) doCnd_ar_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NE(info);
		else if (ne == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NE(info);
		else if (ne == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NE(info);
		else if (ne == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
		else if (ne == Cnd_iv_no) doCnd_iv_no_NE(info);
		else if (ne == Cnd_bill_no) doCnd_bill_no_NE(info);
		else if (ne == Cnd_ar_typ) doCnd_ar_typ_NE(info);
		else if (ne == Cnd_ar_typ_nm) doCnd_ar_typ_nm_NE(info);
		else if (ne == Cnd_incl_not_bill_flg) doCnd_incl_not_bill_flg_NE(info);
		else if (ne == Cnd_incl_appl_flg) doCnd_incl_appl_flg_NE(info);
		else if (ne == Cnd_incl_can_flg) doCnd_incl_can_flg_NE(info);
		else if (ne == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_NE(info);
		else if (ne == columnRslt_ar_dpt_nm) doRslt_ar_dpt_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_acst_cd) doRslt_acst_cd_NE(info);
		else if (ne == columnRslt_acst_nm) doRslt_acst_nm_NE(info);
		else if (ne == columnRslt_ar_typ) doRslt_ar_typ_NE(info);
		else if (ne == columnRslt_ar_typ_nm) doRslt_ar_typ_nm_NE(info);
		else if (ne == columnRslt_rcv_schd_dt) doRslt_rcv_schd_dt_NE(info);
		else if (ne == columnRslt_multi_flg) doRslt_multi_flg_NE(info);
		else if (ne == columnRslt_slip_sts_typ) doRslt_slip_sts_typ_NE(info);
		else if (ne == columnRslt_slip_sts_typ_nm) doRslt_slip_sts_typ_nm_NE(info);
		else if (ne == columnRslt_trd_cd) doRslt_trd_cd_NE(info);
		else if (ne == columnRslt_trd_nm) doRslt_trd_nm_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_amt_dec_place) doRslt_amt_dec_place_NE(info);
		else if (ne == columnRslt_ac_ym) doRslt_ac_ym_NE(info);
		else if (ne == columnRslt_ac_dt) doRslt_ac_dt_NE(info);
		else if (ne == columnRslt_dlv_dt) doRslt_dlv_dt_NE(info);
		else if (ne == columnRslt_bill_ym) doRslt_bill_ym_NE(info);
		else if (ne == columnRslt_bill_cl_day) doRslt_bill_cl_day_NE(info);
		else if (ne == columnRslt_bill_dt) doRslt_bill_dt_NE(info);
		else if (ne == columnRslt_bill_no) doRslt_bill_no_NE(info);
		else if (ne == columnRslt_act_no) doRslt_act_no_NE(info);
		else if (ne == columnRslt_act_d_no) doRslt_act_d_no_NE(info);
		else if (ne == columnRslt_iv_no) doRslt_iv_no_NE(info);
		else if (ne == columnRslt_cst_cd) doRslt_cst_cd_NE(info);
		else if (ne == columnRslt_cst_nm) doRslt_cst_nm_NE(info);
		else if (ne == columnRslt_dlv_cd) doRslt_dlv_cd_NE(info);
		else if (ne == columnRslt_dlv_nm) doRslt_dlv_nm_NE(info);
		else if (ne == columnRslt_dest_cd1) doRslt_dest_cd1_NE(info);
		else if (ne == columnRslt_dest_nm1) doRslt_dest_nm1_NE(info);
		else if (ne == columnRslt_dest_cd2) doRslt_dest_cd2_NE(info);
		else if (ne == columnRslt_dest_nm2) doRslt_dest_nm2_NE(info);
		else if (ne == columnRslt_dest_cd3) doRslt_dest_cd3_NE(info);
		else if (ne == columnRslt_dest_nm3) doRslt_dest_nm3_NE(info);
		else if (ne == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_NE(info);
		else if (ne == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_NE(info);
		else if (ne == columnRslt_sls_usr_cd) doRslt_sls_usr_cd_NE(info);
		else if (ne == columnRslt_sls_usr_nm) doRslt_sls_usr_nm_NE(info);
		else if (ne == columnRslt_slo_no) doRslt_slo_no_NE(info);
		else if (ne == columnRslt_slo_d_no) doRslt_slo_d_no_NE(info);
		else if (ne == columnRslt_cst_po_no) doRslt_cst_po_no_NE(info);
		else if (ne == columnRslt_cst_po_d_no) doRslt_cst_po_d_no_NE(info);
		else if (ne == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NE(info);
		else if (ne == columnRslt_dlv_slip_d_no) doRslt_dlv_slip_d_no_NE(info);
		else if (ne == columnRslt_ship_dlv_slip_no) doRslt_ship_dlv_slip_no_NE(info);
		else if (ne == columnRslt_ship_dlv_slip_d_no) doRslt_ship_dlv_slip_d_no_NE(info);
		else if (ne == columnRslt_ship_dlv_slip_multi_flg) doRslt_ship_dlv_slip_multi_flg_NE(info);
		else if (ne == columnRslt_arsw_ac_ym) doRslt_arsw_ac_ym_NE(info);
		else if (ne == columnRslt_arsw_ac_dt) doRslt_arsw_ac_dt_NE(info);
		else if (ne == columnRslt_arsw_trd_cd) doRslt_arsw_trd_cd_NE(info);
		else if (ne == columnRslt_arsw_trd_nm) doRslt_arsw_trd_nm_NE(info);
		else if (ne == columnRslt_arsw_act_no) doRslt_arsw_act_no_NE(info);
		else if (ne == columnRslt_arsw_act_d_no) doRslt_arsw_act_d_no_NE(info);
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
	 * [Cnd]パネルの[rcv_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[incl_not_bill_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_incl_not_bill_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[incl_appl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_incl_appl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[incl_can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_incl_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[acst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[slip_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_dt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_multi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_multi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arsw_ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arsw_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arsw_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arsw_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arsw_trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arsw_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arsw_trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arsw_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arsw_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arsw_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arsw_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arsw_act_d_no_NE(MCEventInfo info){
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
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == FoldTab) doFold_NX(info);
		else if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_rcv_schd_dt_fr) doCnd_rcv_schd_dt_fr_NX(info);
		else if (nx == Cnd_rcv_schd_dt_to) doCnd_rcv_schd_dt_to_NX(info);
		else if (nx == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NX(info);
		else if (nx == Cnd_ac_dt_to) doCnd_ac_dt_to_NX(info);
		else if (nx == Cnd_acst_cd) doCnd_acst_cd_NX(info);
		else if (nx == Cnd_acst_nm) doCnd_acst_nm_NX(info);
		else if (nx == Cnd_ar_dpt_cd) doCnd_ar_dpt_cd_NX(info);
		else if (nx == Cnd_ar_dpt_nm) doCnd_ar_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_sls_usr_cd) doCnd_sls_usr_cd_NX(info);
		else if (nx == Cnd_sls_usr_nm) doCnd_sls_usr_nm_NX(info);
		else if (nx == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_NX(info);
		else if (nx == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
		else if (nx == Cnd_iv_no) doCnd_iv_no_NX(info);
		else if (nx == Cnd_bill_no) doCnd_bill_no_NX(info);
		else if (nx == Cnd_ar_typ) doCnd_ar_typ_NX(info);
		else if (nx == Cnd_ar_typ_nm) doCnd_ar_typ_nm_NX(info);
		else if (nx == Cnd_incl_not_bill_flg) doCnd_incl_not_bill_flg_NX(info);
		else if (nx == Cnd_incl_appl_flg) doCnd_incl_appl_flg_NX(info);
		else if (nx == Cnd_incl_can_flg) doCnd_incl_can_flg_NX(info);
		else if (nx == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_NX(info);
		else if (nx == columnRslt_ar_dpt_nm) doRslt_ar_dpt_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_acst_cd) doRslt_acst_cd_NX(info);
		else if (nx == columnRslt_acst_nm) doRslt_acst_nm_NX(info);
		else if (nx == columnRslt_ar_typ) doRslt_ar_typ_NX(info);
		else if (nx == columnRslt_ar_typ_nm) doRslt_ar_typ_nm_NX(info);
		else if (nx == columnRslt_rcv_schd_dt) doRslt_rcv_schd_dt_NX(info);
		else if (nx == columnRslt_multi_flg) doRslt_multi_flg_NX(info);
		else if (nx == columnRslt_slip_sts_typ) doRslt_slip_sts_typ_NX(info);
		else if (nx == columnRslt_slip_sts_typ_nm) doRslt_slip_sts_typ_nm_NX(info);
		else if (nx == columnRslt_trd_cd) doRslt_trd_cd_NX(info);
		else if (nx == columnRslt_trd_nm) doRslt_trd_nm_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_amt_dec_place) doRslt_amt_dec_place_NX(info);
		else if (nx == columnRslt_ac_ym) doRslt_ac_ym_NX(info);
		else if (nx == columnRslt_ac_dt) doRslt_ac_dt_NX(info);
		else if (nx == columnRslt_dlv_dt) doRslt_dlv_dt_NX(info);
		else if (nx == columnRslt_bill_ym) doRslt_bill_ym_NX(info);
		else if (nx == columnRslt_bill_cl_day) doRslt_bill_cl_day_NX(info);
		else if (nx == columnRslt_bill_dt) doRslt_bill_dt_NX(info);
		else if (nx == columnRslt_bill_no) doRslt_bill_no_NX(info);
		else if (nx == columnRslt_act_no) doRslt_act_no_NX(info);
		else if (nx == columnRslt_act_d_no) doRslt_act_d_no_NX(info);
		else if (nx == columnRslt_iv_no) doRslt_iv_no_NX(info);
		else if (nx == columnRslt_cst_cd) doRslt_cst_cd_NX(info);
		else if (nx == columnRslt_cst_nm) doRslt_cst_nm_NX(info);
		else if (nx == columnRslt_dlv_cd) doRslt_dlv_cd_NX(info);
		else if (nx == columnRslt_dlv_nm) doRslt_dlv_nm_NX(info);
		else if (nx == columnRslt_dest_cd1) doRslt_dest_cd1_NX(info);
		else if (nx == columnRslt_dest_nm1) doRslt_dest_nm1_NX(info);
		else if (nx == columnRslt_dest_cd2) doRslt_dest_cd2_NX(info);
		else if (nx == columnRslt_dest_nm2) doRslt_dest_nm2_NX(info);
		else if (nx == columnRslt_dest_cd3) doRslt_dest_cd3_NX(info);
		else if (nx == columnRslt_dest_nm3) doRslt_dest_nm3_NX(info);
		else if (nx == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_NX(info);
		else if (nx == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_NX(info);
		else if (nx == columnRslt_sls_usr_cd) doRslt_sls_usr_cd_NX(info);
		else if (nx == columnRslt_sls_usr_nm) doRslt_sls_usr_nm_NX(info);
		else if (nx == columnRslt_slo_no) doRslt_slo_no_NX(info);
		else if (nx == columnRslt_slo_d_no) doRslt_slo_d_no_NX(info);
		else if (nx == columnRslt_cst_po_no) doRslt_cst_po_no_NX(info);
		else if (nx == columnRslt_cst_po_d_no) doRslt_cst_po_d_no_NX(info);
		else if (nx == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NX(info);
		else if (nx == columnRslt_dlv_slip_d_no) doRslt_dlv_slip_d_no_NX(info);
		else if (nx == columnRslt_ship_dlv_slip_no) doRslt_ship_dlv_slip_no_NX(info);
		else if (nx == columnRslt_ship_dlv_slip_d_no) doRslt_ship_dlv_slip_d_no_NX(info);
		else if (nx == columnRslt_ship_dlv_slip_multi_flg) doRslt_ship_dlv_slip_multi_flg_NX(info);
		else if (nx == columnRslt_arsw_ac_ym) doRslt_arsw_ac_ym_NX(info);
		else if (nx == columnRslt_arsw_ac_dt) doRslt_arsw_ac_dt_NX(info);
		else if (nx == columnRslt_arsw_trd_cd) doRslt_arsw_trd_cd_NX(info);
		else if (nx == columnRslt_arsw_trd_nm) doRslt_arsw_trd_nm_NX(info);
		else if (nx == columnRslt_arsw_act_no) doRslt_arsw_act_no_NX(info);
		else if (nx == columnRslt_arsw_act_d_no) doRslt_arsw_act_d_no_NX(info);
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
	 * [Cnd]パネルの[rcv_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[incl_not_bill_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_incl_not_bill_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[incl_appl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_incl_appl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[incl_can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_incl_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[acst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[slip_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_dt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_multi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_multi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arsw_ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arsw_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arsw_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arsw_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arsw_trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arsw_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arsw_trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arsw_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arsw_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arsw_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arsw_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arsw_act_d_no_NX(MCEventInfo info){
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
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_rcv_schd_dt_fr) doCnd_rcv_schd_dt_fr_LC(info);
		else if (lc == Cnd_rcv_schd_dt_to) doCnd_rcv_schd_dt_to_LC(info);
		else if (lc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_LC(info);
		else if (lc == Cnd_ac_dt_to) doCnd_ac_dt_to_LC(info);
		else if (lc == Cnd_acst_cd) doCnd_acst_cd_LC(info);
		else if (lc == Cnd_acst_nm) doCnd_acst_nm_LC(info);
		else if (lc == Cnd_ar_dpt_cd) doCnd_ar_dpt_cd_LC(info);
		else if (lc == Cnd_ar_dpt_nm) doCnd_ar_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_sls_usr_cd) doCnd_sls_usr_cd_LC(info);
		else if (lc == Cnd_sls_usr_nm) doCnd_sls_usr_nm_LC(info);
		else if (lc == Cnd_sls_dpt_cd) doCnd_sls_dpt_cd_LC(info);
		else if (lc == Cnd_sls_dpt_nm) doCnd_sls_dpt_nm_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
		else if (lc == Cnd_iv_no) doCnd_iv_no_LC(info);
		else if (lc == Cnd_bill_no) doCnd_bill_no_LC(info);
		else if (lc == Cnd_ar_typ) doCnd_ar_typ_LC(info);
		else if (lc == Cnd_ar_typ_nm) doCnd_ar_typ_nm_LC(info);
		else if (lc == columnRslt_ar_dpt_cd) doRslt_ar_dpt_cd_LC(info);
		else if (lc == columnRslt_ar_dpt_nm) doRslt_ar_dpt_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_acst_cd) doRslt_acst_cd_LC(info);
		else if (lc == columnRslt_acst_nm) doRslt_acst_nm_LC(info);
		else if (lc == columnRslt_ar_typ) doRslt_ar_typ_LC(info);
		else if (lc == columnRslt_ar_typ_nm) doRslt_ar_typ_nm_LC(info);
		else if (lc == columnRslt_rcv_schd_dt) doRslt_rcv_schd_dt_LC(info);
		else if (lc == columnRslt_slip_sts_typ) doRslt_slip_sts_typ_LC(info);
		else if (lc == columnRslt_slip_sts_typ_nm) doRslt_slip_sts_typ_nm_LC(info);
		else if (lc == columnRslt_trd_cd) doRslt_trd_cd_LC(info);
		else if (lc == columnRslt_trd_nm) doRslt_trd_nm_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_amt_dec_place) doRslt_amt_dec_place_LC(info);
		else if (lc == columnRslt_ac_ym) doRslt_ac_ym_LC(info);
		else if (lc == columnRslt_ac_dt) doRslt_ac_dt_LC(info);
		else if (lc == columnRslt_dlv_dt) doRslt_dlv_dt_LC(info);
		else if (lc == columnRslt_bill_ym) doRslt_bill_ym_LC(info);
		else if (lc == columnRslt_bill_cl_day) doRslt_bill_cl_day_LC(info);
		else if (lc == columnRslt_bill_dt) doRslt_bill_dt_LC(info);
		else if (lc == columnRslt_bill_no) doRslt_bill_no_LC(info);
		else if (lc == columnRslt_act_no) doRslt_act_no_LC(info);
		else if (lc == columnRslt_act_d_no) doRslt_act_d_no_LC(info);
		else if (lc == columnRslt_iv_no) doRslt_iv_no_LC(info);
		else if (lc == columnRslt_cst_cd) doRslt_cst_cd_LC(info);
		else if (lc == columnRslt_cst_nm) doRslt_cst_nm_LC(info);
		else if (lc == columnRslt_dlv_cd) doRslt_dlv_cd_LC(info);
		else if (lc == columnRslt_dlv_nm) doRslt_dlv_nm_LC(info);
		else if (lc == columnRslt_dest_cd1) doRslt_dest_cd1_LC(info);
		else if (lc == columnRslt_dest_nm1) doRslt_dest_nm1_LC(info);
		else if (lc == columnRslt_dest_cd2) doRslt_dest_cd2_LC(info);
		else if (lc == columnRslt_dest_nm2) doRslt_dest_nm2_LC(info);
		else if (lc == columnRslt_dest_cd3) doRslt_dest_cd3_LC(info);
		else if (lc == columnRslt_dest_nm3) doRslt_dest_nm3_LC(info);
		else if (lc == columnRslt_sls_dpt_cd) doRslt_sls_dpt_cd_LC(info);
		else if (lc == columnRslt_sls_dpt_nm) doRslt_sls_dpt_nm_LC(info);
		else if (lc == columnRslt_sls_usr_cd) doRslt_sls_usr_cd_LC(info);
		else if (lc == columnRslt_sls_usr_nm) doRslt_sls_usr_nm_LC(info);
		else if (lc == columnRslt_slo_no) doRslt_slo_no_LC(info);
		else if (lc == columnRslt_slo_d_no) doRslt_slo_d_no_LC(info);
		else if (lc == columnRslt_cst_po_no) doRslt_cst_po_no_LC(info);
		else if (lc == columnRslt_cst_po_d_no) doRslt_cst_po_d_no_LC(info);
		else if (lc == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_LC(info);
		else if (lc == columnRslt_dlv_slip_d_no) doRslt_dlv_slip_d_no_LC(info);
		else if (lc == columnRslt_ship_dlv_slip_no) doRslt_ship_dlv_slip_no_LC(info);
		else if (lc == columnRslt_ship_dlv_slip_d_no) doRslt_ship_dlv_slip_d_no_LC(info);
		else if (lc == columnRslt_arsw_ac_ym) doRslt_arsw_ac_ym_LC(info);
		else if (lc == columnRslt_arsw_ac_dt) doRslt_arsw_ac_dt_LC(info);
		else if (lc == columnRslt_arsw_trd_cd) doRslt_arsw_trd_cd_LC(info);
		else if (lc == columnRslt_arsw_trd_nm) doRslt_arsw_trd_nm_LC(info);
		else if (lc == columnRslt_arsw_act_no) doRslt_arsw_act_no_LC(info);
		else if (lc == columnRslt_arsw_act_d_no) doRslt_arsw_act_d_no_LC(info);
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
	 * [Cnd]パネルの[rcv_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcv_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcv_schd_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_dpt_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bill_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ar_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_dpt_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[acst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ar_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ar_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bill_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_usr_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[cst_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arsw_ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arsw_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arsw_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arsw_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arsw_trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arsw_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arsw_trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arsw_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arsw_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arsw_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arsw_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arsw_act_d_no_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_sls_usr_cd]の作成メソッド
	 */
	public MCList getCnd_sls_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sls_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_sls_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_trd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ar_typ]の作成メソッド
	 */
	public MCList getCnd_ar_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBGL0120.Srch01")) {
			return new MS_MSBGL0120_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBGL0120_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0120_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0120_Srch01;

		/** コンストラクタ */
		protected MS_MSBGL0120_Srch01Bridge() {
			p_MS_MSBGL0120_Srch01 = new MCParam(PDef.MS_MSBGL0120_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0120_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0120.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0120.RsltR.class));

			p_MS_MSBGL0120_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0120_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0120_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0120_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0120_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0120.CndR up0() {
			return (mcframe.clientMSBG.MSBGP0120.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBG.MSBGP0120.RsltR> down0() {
			return (MCList<mcframe.clientMSBG.MSBGP0120.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0120_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0120.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0120_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBG.MSBGP0120.RsltR>)p_MS_MSBGL0120_Srch01.getContainerParam().getDownBlock(0));
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