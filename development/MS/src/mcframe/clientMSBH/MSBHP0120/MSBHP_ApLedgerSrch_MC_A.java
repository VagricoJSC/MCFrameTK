package mcframe.clientMSBH.MSBHP0120;

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
import mcframe.clientMSBH.MSBHP0120.MSBHP_ApLedgerSrch_MC.MS_MSBHL0120_Srch01Caller;

/**
 * 画面"MSBHP_ApLedgerSrch"パネルクラスです。<p>
 *
 * 買掛元帳を照会する<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHP_ApLedgerSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBHP0120";

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
	// [Tab1]ブロック関連のField定義
	public MCPanel Tab1Panel = null;
	// [Tab1]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [ApplCnd]ブロック関連のField定義
	public MCPanel ApplCndPanel = null;
	// [ApplCnd]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * TRD,Display in transaction currency;BASE,Display in base currency TRD,取引通貨で表示する;BASE,基準通貨で表示する.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_TRD = null;
	public MCRadioButton Cnd_ope_BASE = null;
	public MCLabel Cnd_ac_ym_Label = null;
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDateField Cnd_ac_ym = null;
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
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_wg_nm = null;
	public MCLabel Cnd_rcpt_iv_no_Label = null;
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_rcpt_iv_no = null;
	public MCLabel Cnd_rcpt_iv_mng_no_Label = null;
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_rcpt_iv_mng_no = null;
	public MCLabel Cnd_purc_act_no_Label = null;
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_purc_act_no = null;
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Cnd_wrk_no_p_PPanel;
	public MCTextField Cnd_wrk_no;	// [Cnd]の[wrk_no_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[wrk_no_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	/**
	 * Reversal of return/discount amount sign 返品・値引金額符号反転.<p>
	 *
	 */
	public MCCheckBox Cnd_sign_rvrs_flg = null;
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_asppl_grp_p_PPanel;
	public MCLabel Cnd_asppl_grp_lab1;	// [Cnd]の[asppl_grp_p.bp_grp_lab1]を[Cnd_asppl_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg1;	// [Cnd]の[asppl_grp_p.bp_grp_flg1]を[Cnd_asppl_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd1;	// [Cnd]の[asppl_grp_p.bp_grp_cd1]を[Cnd_asppl_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm1;	// [Cnd]の[asppl_grp_p.bp_grp_nm1]を[Cnd_asppl_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab2;	// [Cnd]の[asppl_grp_p.bp_grp_lab2]を[Cnd_asppl_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg2;	// [Cnd]の[asppl_grp_p.bp_grp_flg2]を[Cnd_asppl_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd2;	// [Cnd]の[asppl_grp_p.bp_grp_cd2]を[Cnd_asppl_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm2;	// [Cnd]の[asppl_grp_p.bp_grp_nm2]を[Cnd_asppl_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab3;	// [Cnd]の[asppl_grp_p.bp_grp_lab3]を[Cnd_asppl_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg3;	// [Cnd]の[asppl_grp_p.bp_grp_flg3]を[Cnd_asppl_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd3;	// [Cnd]の[asppl_grp_p.bp_grp_cd3]を[Cnd_asppl_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm3;	// [Cnd]の[asppl_grp_p.bp_grp_nm3]を[Cnd_asppl_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab4;	// [Cnd]の[asppl_grp_p.bp_grp_lab4]を[Cnd_asppl_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg4;	// [Cnd]の[asppl_grp_p.bp_grp_flg4]を[Cnd_asppl_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd4;	// [Cnd]の[asppl_grp_p.bp_grp_cd4]を[Cnd_asppl_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm4;	// [Cnd]の[asppl_grp_p.bp_grp_nm4]を[Cnd_asppl_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab5;	// [Cnd]の[asppl_grp_p.bp_grp_lab5]を[Cnd_asppl_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg5;	// [Cnd]の[asppl_grp_p.bp_grp_flg5]を[Cnd_asppl_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd5;	// [Cnd]の[asppl_grp_p.bp_grp_cd5]を[Cnd_asppl_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm5;	// [Cnd]の[asppl_grp_p.bp_grp_nm5]を[Cnd_asppl_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab6;	// [Cnd]の[asppl_grp_p.bp_grp_lab6]を[Cnd_asppl_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg6;	// [Cnd]の[asppl_grp_p.bp_grp_flg6]を[Cnd_asppl_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd6;	// [Cnd]の[asppl_grp_p.bp_grp_cd6]を[Cnd_asppl_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm6;	// [Cnd]の[asppl_grp_p.bp_grp_nm6]を[Cnd_asppl_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab7;	// [Cnd]の[asppl_grp_p.bp_grp_lab7]を[Cnd_asppl_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg7;	// [Cnd]の[asppl_grp_p.bp_grp_flg7]を[Cnd_asppl_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd7;	// [Cnd]の[asppl_grp_p.bp_grp_cd7]を[Cnd_asppl_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm7;	// [Cnd]の[asppl_grp_p.bp_grp_nm7]を[Cnd_asppl_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab8;	// [Cnd]の[asppl_grp_p.bp_grp_lab8]を[Cnd_asppl_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg8;	// [Cnd]の[asppl_grp_p.bp_grp_flg8]を[Cnd_asppl_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd8;	// [Cnd]の[asppl_grp_p.bp_grp_cd8]を[Cnd_asppl_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm8;	// [Cnd]の[asppl_grp_p.bp_grp_nm8]を[Cnd_asppl_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab9;	// [Cnd]の[asppl_grp_p.bp_grp_lab9]を[Cnd_asppl_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg9;	// [Cnd]の[asppl_grp_p.bp_grp_flg9]を[Cnd_asppl_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd9;	// [Cnd]の[asppl_grp_p.bp_grp_cd9]を[Cnd_asppl_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm9;	// [Cnd]の[asppl_grp_p.bp_grp_nm9]を[Cnd_asppl_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_asppl_grp_lab10;	// [Cnd]の[asppl_grp_p.bp_grp_lab10]を[Cnd_asppl_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_asppl_grp_flg10;	// [Cnd]の[asppl_grp_p.bp_grp_flg10]を[Cnd_asppl_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_asppl_grp_cd10;	// [Cnd]の[asppl_grp_p.bp_grp_cd10]を[Cnd_asppl_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_asppl_grp_nm10;	// [Cnd]の[asppl_grp_p.bp_grp_nm10]を[Cnd_asppl_grp_nm10]としてエイリアス定義。
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	// [Rslt]ブロックの項目のField定義
	// [HdrInfo]ブロック関連のField定義
	public MCPanel HdrInfoPanel = null;
	// [HdrInfo]ブロックの項目のField定義
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	public MCTitledBorder HdrTitledBorder = null;
	// [Hdr]ブロックの項目のField定義
	public MCLabel Hdr_ac_ym_Label = null;
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDateField Hdr_ac_ym = null;
	public MCLabel Hdr_trd_cur_cd_Label = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_trd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCTextField Hdr_trd_cur_nm = null;
	public MCLabel Hdr_ap_typ_Label = null;
	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public MCTextField Hdr_ap_typ = null;
	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public MCTextField Hdr_ap_typ_nm = null;
	public MCLabel Hdr_asppl_cd_Label = null;
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_asppl_cd = null;
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public MCTextField Hdr_asppl_nm = null;
	public MCLabel Hdr_ap_dpt_cd_Label = null;
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_ap_dpt_cd = null;
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public MCTextField Hdr_ap_dpt_nm = null;
	public MCLabel Hdr_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Hdr_wg_nm = null;
	public MCLabel Hdr_rcpt_iv_no_Label = null;
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_rcpt_iv_no = null;
	public MCLabel Hdr_rcpt_iv_mng_no_Label = null;
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_rcpt_iv_mng_no = null;
	public MCLabel Hdr_purc_act_no_Label = null;
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_purc_act_no = null;
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Hdr_wrkno_p_PPanel;
	public MCTextField Hdr_wrk_no;	// [Hdr]の[wrkno_p.wrk_no]を[Hdr_wrk_no]としてエイリアス定義。
	public MCTextField Hdr_wrk_nm;	// [Hdr]の[wrkno_p.wrk_nm]を[Hdr_wrk_nm]としてエイリアス定義。
	public MCLabel Hdr_cur_cd_Label = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_cur_cd = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_amt_dec_place = null;
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_upri_dec_place = null;
	public MCLabel Hdr_base_cur_cd_Label = null;
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_base_cur_cd = null;
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public MCTextField Hdr_base_cur_nm = null;
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_init_bal_p_PPanel;
	public MCNumberField Hdr_init_bal;	// [Hdr]の[init_bal_p.amt]を[Hdr_init_bal]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_purc_amt_p_PPanel;
	public MCNumberField Hdr_purc_amt;	// [Hdr]の[purc_amt_p.amt]を[Hdr_purc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_ret_amt_p_PPanel;
	public MCNumberField Hdr_ret_amt;	// [Hdr]の[ret_amt_p.amt]を[Hdr_ret_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_dscnt_amt_p_PPanel;
	public MCNumberField Hdr_dscnt_amt;	// [Hdr]の[dscnt_amt_p.amt]を[Hdr_dscnt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_sw_to_amt_p_PPanel;
	public MCNumberField Hdr_sw_to_amt;	// [Hdr]の[sw_to_amt_p.amt]を[Hdr_sw_to_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_tax_amt_p_PPanel;
	public MCNumberField Hdr_tax_amt;	// [Hdr]の[tax_amt_p.amt]を[Hdr_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_cash_amt_p_PPanel;
	public MCNumberField Hdr_cash_amt;	// [Hdr]の[cash_amt_p.amt]を[Hdr_cash_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_note_amt_p_PPanel;
	public MCNumberField Hdr_note_amt;	// [Hdr]の[note_amt_p.amt]を[Hdr_note_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_account_amt_p_PPanel;
	public MCNumberField Hdr_account_amt;	// [Hdr]の[account_amt_p.amt]を[Hdr_account_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_setoff_amt_p_PPanel;
	public MCNumberField Hdr_setoff_amt;	// [Hdr]の[setoff_amt_p.amt]を[Hdr_setoff_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_sw_amt_p_PPanel;
	public MCNumberField Hdr_sw_amt;	// [Hdr]の[sw_amt_p.amt]を[Hdr_sw_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_end_bal_p_PPanel;
	public MCNumberField Hdr_end_bal;	// [Hdr]の[end_bal_p.amt]を[Hdr_end_bal]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H Hdr_exc_gain_loss_p_PPanel;
	public MCNumberField Hdr_exc_gain_loss;	// [Hdr]の[exc_gain_loss_p.amt]を[Hdr_exc_gain_loss]としてエイリアス定義。
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	// [Dtl]ブロックの項目のField定義
	// [Dtl1Info]ブロック関連のField定義
	public MCPanel Dtl1InfoPanel = null;
	// [Dtl1Info]ブロックの項目のField定義
	// [Dtl1]ブロック関連のField定義
	public MCPanel Dtl1Panel = null;
	public MCTitledBorder Dtl1TitledBorder = null;
	public MCScrollPane Dtl1ScrollPane = null;
	public MCTable2<mcframe.clientMSBH.MSBHP0120.Dtl1R> Dtl1Table = null;
	// [Dtl1]ブロックの項目のField定義
	/**
	 * Row number 行番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_row_num = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ac_dt = null;
	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_slip_sts_typ = null;
	/**
	 * Status 状況.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_slip_sts_typ_nm = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_nm = null;
	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ap_typ = null;
	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_ap_typ_nm = null;
	/**
	 * Result No. 実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_act_no = null;
	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_act_rev = null;
	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_act_seq = null;
	/**
	 * Result details No. 実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_act_d_no = null;
	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_act_d_seq = null;
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_rcpt_iv_no = null;
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_rcpt_iv_mng_no = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl1_itm_p_PPanel;
	public MCColumnConfig columnDtl1_itm_cd;// [Dtl1]の[itm_p.itm_cd]を[columnDtl1_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl1_itm_sub1;// [Dtl1]の[itm_p.itm_sub1]を[columnDtl1_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl1_itm_sub2;// [Dtl1]の[itm_p.itm_sub2]を[columnDtl1_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl1_itm_sub3;// [Dtl1]の[itm_p.itm_sub3]を[columnDtl1_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl1_itm_nm;// [Dtl1]の[itm_p.itm_nm]を[columnDtl1_itm_nm]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Dtl1_sno_p_PPanel;
	public MCColumnConfig columnDtl1_sno1;// [Dtl1]の[sno_p.sno1]を[columnDtl1_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl1_sno2;// [Dtl1]の[sno_p.sno2]を[columnDtl1_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl1_sno3;// [Dtl1]の[sno_p.sno3]を[columnDtl1_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl1_sno4;// [Dtl1]の[sno_p.sno4]を[columnDtl1_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl1_wrk_no;// [Dtl1]の[sno_p.wrk_no]を[columnDtl1_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl1_wrk_nm;// [Dtl1]の[sno_p.wrk_nm]を[columnDtl1_wrk_nm]としてエイリアス定義。
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
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_trd_unit_dec_place = null;
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
	 * Base number of decimal places 基準小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_base_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl1_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl1_base_unit_qty;// [Dtl1]の[base_unit_qty_p.qty]を[columnDtl1_base_unit_qty]としてエイリアス定義。
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_interim_flg = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl1_trd_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl1_trd_cur_upri;// [Dtl1]の[trd_cur_upri_p.upri]を[columnDtl1_trd_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_trd_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl1_trd_cur_amt;// [Dtl1]の[trd_cur_amt_p.amt]を[columnDtl1_trd_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_trd_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl1_trd_cur_inc_tax_amt;// [Dtl1]の[trd_cur_inc_tax_amt_p.amt]を[columnDtl1_trd_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl1_base_cur_upri_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_upri;// [Dtl1]の[base_cur_upri_p.upri]を[columnDtl1_base_cur_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_base_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_amt;// [Dtl1]の[base_cur_amt_p.amt]を[columnDtl1_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_base_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_inc_tax_amt;// [Dtl1]の[base_cur_inc_tax_amt_p.amt]を[columnDtl1_base_cur_inc_tax_amt]としてエイリアス定義。
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_tax_cd = null;
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_tax_nm = null;
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_tax_rate = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_trd_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl1_trd_cur_tax_amt;// [Dtl1]の[trd_cur_tax_amt_p.amt]を[columnDtl1_trd_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_trd_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnDtl1_trd_cur_dscnt_amt;// [Dtl1]の[trd_cur_dscnt_amt_p.amt]を[columnDtl1_trd_cur_dscnt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_tax_amt;// [Dtl1]の[base_cur_tax_amt_p.amt]を[columnDtl1_base_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_base_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_dscnt_amt;// [Dtl1]の[base_cur_dscnt_amt_p.amt]を[columnDtl1_base_cur_dscnt_amt]としてエイリアス定義。
	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_outsrc_flg = null;
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_repurc_obli_flg = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl1_trd_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnDtl1_trd_cur_proc_upri;// [Dtl1]の[trd_cur_proc_upri_p.upri]を[columnDtl1_trd_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl1_trd_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnDtl1_trd_cur_onr_prov_upri;// [Dtl1]の[trd_cur_onr_prov_upri_p.upri]を[columnDtl1_trd_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_trd_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnDtl1_trd_cur_proc_amt;// [Dtl1]の[trd_cur_proc_amt_p.amt]を[columnDtl1_trd_cur_proc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_trd_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnDtl1_trd_cur_onr_prov_amt;// [Dtl1]の[trd_cur_onr_prov_amt_p.amt]を[columnDtl1_trd_cur_onr_prov_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl1_base_cur_proc_upri_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_proc_upri;// [Dtl1]の[base_cur_proc_upri_p.upri]を[columnDtl1_base_cur_proc_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl1_base_cur_onr_prov_upri_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_onr_prov_upri;// [Dtl1]の[base_cur_onr_prov_upri_p.upri]を[columnDtl1_base_cur_onr_prov_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_base_cur_proc_amt_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_proc_amt;// [Dtl1]の[base_cur_proc_amt_p.amt]を[columnDtl1_base_cur_proc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl1_base_cur_onr_prov_amt_p_PPanel;
	public MCColumnConfig columnDtl1_base_cur_onr_prov_amt;// [Dtl1]の[base_cur_onr_prov_amt_p.amt]を[columnDtl1_base_cur_onr_prov_amt]としてエイリアス定義。
	/**
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_base_purc_ac_dt = null;
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_asppl_cd = null;
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_asppl_nm = null;
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
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_wg_nm = null;
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
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_dpt_cd = null;
	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_dpt_nm = null;
	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_usr_cd = null;
	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_purc_usr_nm = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_po_no = null;
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl1_po_d_no = null;
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Dtl1_asppl_grp_p_PPanel;
	public MCColumnConfig columnDtl1_asppl_grp_cd1;// [Dtl1]の[asppl_grp_p.bp_grp_cd1]を[columnDtl1_asppl_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnDtl1_asppl_grp_nm1;// [Dtl1]の[asppl_grp_p.bp_grp_nm1]を[columnDtl1_asppl_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnDtl1_asppl_grp_cd2;// [Dtl1]の[asppl_grp_p.bp_grp_cd2]を[columnDtl1_asppl_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnDtl1_asppl_grp_nm2;// [Dtl1]の[asppl_grp_p.bp_grp_nm2]を[columnDtl1_asppl_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnDtl1_asppl_grp_cd3;// [Dtl1]の[asppl_grp_p.bp_grp_cd3]を[columnDtl1_asppl_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnDtl1_asppl_grp_nm3;// [Dtl1]の[asppl_grp_p.bp_grp_nm3]を[columnDtl1_asppl_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnDtl1_asppl_grp_cd4;// [Dtl1]の[asppl_grp_p.bp_grp_cd4]を[columnDtl1_asppl_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnDtl1_asppl_grp_nm4;// [Dtl1]の[asppl_grp_p.bp_grp_nm4]を[columnDtl1_asppl_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnDtl1_asppl_grp_cd5;// [Dtl1]の[asppl_grp_p.bp_grp_cd5]を[columnDtl1_asppl_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnDtl1_asppl_grp_nm5;// [Dtl1]の[asppl_grp_p.bp_grp_nm5]を[columnDtl1_asppl_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnDtl1_asppl_grp_cd6;// [Dtl1]の[asppl_grp_p.bp_grp_cd6]を[columnDtl1_asppl_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnDtl1_asppl_grp_nm6;// [Dtl1]の[asppl_grp_p.bp_grp_nm6]を[columnDtl1_asppl_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnDtl1_asppl_grp_cd7;// [Dtl1]の[asppl_grp_p.bp_grp_cd7]を[columnDtl1_asppl_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnDtl1_asppl_grp_nm7;// [Dtl1]の[asppl_grp_p.bp_grp_nm7]を[columnDtl1_asppl_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnDtl1_asppl_grp_cd8;// [Dtl1]の[asppl_grp_p.bp_grp_cd8]を[columnDtl1_asppl_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnDtl1_asppl_grp_nm8;// [Dtl1]の[asppl_grp_p.bp_grp_nm8]を[columnDtl1_asppl_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnDtl1_asppl_grp_cd9;// [Dtl1]の[asppl_grp_p.bp_grp_cd9]を[columnDtl1_asppl_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnDtl1_asppl_grp_nm9;// [Dtl1]の[asppl_grp_p.bp_grp_nm9]を[columnDtl1_asppl_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnDtl1_asppl_grp_cd10;// [Dtl1]の[asppl_grp_p.bp_grp_cd10]を[columnDtl1_asppl_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnDtl1_asppl_grp_nm10;// [Dtl1]の[asppl_grp_p.bp_grp_nm10]を[columnDtl1_asppl_grp_nm10]としてエイリアス定義。
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
	// [Dtl1_Btn]ブロック関連のField定義
	public MCPanel Dtl1_BtnPanel = null;
	// [Dtl1_Btn]ブロックの項目のField定義
	public mcframe.clientFXUC.FXUCP0130.FXUCP_Paging Dtl1_Btn_paging_PPanel;
	public MCButton Dtl1_Btn_p_prev;	// [Dtl1_Btn]の[paging.prev]を[Dtl1_Btn_p_prev]としてエイリアス定義。
	public MCButton Dtl1_Btn_p_next;	// [Dtl1_Btn]の[paging.next]を[Dtl1_Btn_p_next]としてエイリアス定義。
	// [Dtl2Info]ブロック関連のField定義
	public MCPanel Dtl2InfoPanel = null;
	// [Dtl2Info]ブロックの項目のField定義
	// [Dtl2]ブロック関連のField定義
	public MCPanel Dtl2Panel = null;
	public MCTitledBorder Dtl2TitledBorder = null;
	public MCScrollPane Dtl2ScrollPane = null;
	public MCTable2<mcframe.clientMSBH.MSBHP0120.Dtl2R> Dtl2Table = null;
	// [Dtl2]ブロックの項目のField定義
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ac_dt = null;
	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_slip_sts_typ = null;
	/**
	 * Status 状況.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_slip_sts_typ_nm = null;
	/**
	 * Result No. 実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_act_no = null;
	/**
	 * Result rev. number 実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_act_rev = null;
	/**
	 * Result sequence number 実績連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_act_seq = null;
	/**
	 * Result details No. 実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_act_d_no = null;
	/**
	 * Result details sequence number 実績明細連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_act_d_seq = null;
	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ap_typ = null;
	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ap_typ_nm = null;
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_purc_act_no = null;
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_rcpt_iv_no = null;
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_rcpt_iv_mng_no = null;
	public mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D Dtl2_wrkno_p_PPanel;
	public MCColumnConfig columnDtl2_wrk_no;// [Dtl2]の[wrkno_p.wrk_no]を[columnDtl2_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl2_wrk_nm;// [Dtl2]の[wrkno_p.wrk_nm]を[columnDtl2_wrk_nm]としてエイリアス定義。
	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ap_sttl_cd = null;
	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ap_sttl_nm = null;
	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ap_sttl_typ = null;
	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ap_sttl_typ_nm = null;
	/**
	 * Advance payment AP settlement method cd. 前渡金債務決済方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_adv_pay_ap_sttl_cd = null;
	/**
	 * Advance payment AP settlement method name 前渡金債務決済方法名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_adv_pay_ap_sttl_nm = null;
	/**
	 * Advance payment AP settlement type 前渡金債務決済区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_adv_pay_ap_sttl_typ = null;
	/**
	 * Advance payment AP settlement type name 前渡金債務決済区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_adv_pay_ap_sttl_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl2_trd_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl2_trd_cur_amt;// [Dtl2]の[trd_cur_amt_p.amt]を[columnDtl2_trd_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Dtl2_base_cur_amt_p_PPanel;
	public MCColumnConfig columnDtl2_base_cur_amt;// [Dtl2]の[base_cur_amt_p.amt]を[columnDtl2_base_cur_amt]としてエイリアス定義。
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_asppl_cd = null;
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_asppl_nm = null;
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ap_dpt_cd = null;
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_ap_dpt_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl2_wg_nm = null;
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Dtl2_asppl_grp_p_PPanel;
	public MCColumnConfig columnDtl2_asppl_grp_cd1;// [Dtl2]の[asppl_grp_p.bp_grp_cd1]を[columnDtl2_asppl_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnDtl2_asppl_grp_nm1;// [Dtl2]の[asppl_grp_p.bp_grp_nm1]を[columnDtl2_asppl_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnDtl2_asppl_grp_cd2;// [Dtl2]の[asppl_grp_p.bp_grp_cd2]を[columnDtl2_asppl_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnDtl2_asppl_grp_nm2;// [Dtl2]の[asppl_grp_p.bp_grp_nm2]を[columnDtl2_asppl_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnDtl2_asppl_grp_cd3;// [Dtl2]の[asppl_grp_p.bp_grp_cd3]を[columnDtl2_asppl_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnDtl2_asppl_grp_nm3;// [Dtl2]の[asppl_grp_p.bp_grp_nm3]を[columnDtl2_asppl_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnDtl2_asppl_grp_cd4;// [Dtl2]の[asppl_grp_p.bp_grp_cd4]を[columnDtl2_asppl_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnDtl2_asppl_grp_nm4;// [Dtl2]の[asppl_grp_p.bp_grp_nm4]を[columnDtl2_asppl_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnDtl2_asppl_grp_cd5;// [Dtl2]の[asppl_grp_p.bp_grp_cd5]を[columnDtl2_asppl_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnDtl2_asppl_grp_nm5;// [Dtl2]の[asppl_grp_p.bp_grp_nm5]を[columnDtl2_asppl_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnDtl2_asppl_grp_cd6;// [Dtl2]の[asppl_grp_p.bp_grp_cd6]を[columnDtl2_asppl_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnDtl2_asppl_grp_nm6;// [Dtl2]の[asppl_grp_p.bp_grp_nm6]を[columnDtl2_asppl_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnDtl2_asppl_grp_cd7;// [Dtl2]の[asppl_grp_p.bp_grp_cd7]を[columnDtl2_asppl_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnDtl2_asppl_grp_nm7;// [Dtl2]の[asppl_grp_p.bp_grp_nm7]を[columnDtl2_asppl_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnDtl2_asppl_grp_cd8;// [Dtl2]の[asppl_grp_p.bp_grp_cd8]を[columnDtl2_asppl_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnDtl2_asppl_grp_nm8;// [Dtl2]の[asppl_grp_p.bp_grp_nm8]を[columnDtl2_asppl_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnDtl2_asppl_grp_cd9;// [Dtl2]の[asppl_grp_p.bp_grp_cd9]を[columnDtl2_asppl_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnDtl2_asppl_grp_nm9;// [Dtl2]の[asppl_grp_p.bp_grp_nm9]を[columnDtl2_asppl_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnDtl2_asppl_grp_cd10;// [Dtl2]の[asppl_grp_p.bp_grp_cd10]を[columnDtl2_asppl_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnDtl2_asppl_grp_nm10;// [Dtl2]の[asppl_grp_p.bp_grp_nm10]を[columnDtl2_asppl_grp_nm10]としてエイリアス定義。
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
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH};
	
	/** [MS_MSBHL0120_Srch01]のCallerの作成 */
	protected MSBHP_ApLedgerSrch_MC.MS_MSBHL0120_Srch01Caller createMS_MSBHL0120_Srch01() {
		MSBHP_ApLedgerSrch_MC.MS_MSBHL0120_Srch01Caller<MSBHP_ApLedgerSrch, MS_MSBHL0120_Srch01Bridge>
		caller = ((MSBHP_ApLedgerSrch_MC)this).new MS_MSBHL0120_Srch01Caller<MSBHP_ApLedgerSrch, MS_MSBHL0120_Srch01Bridge>(
					(MSBHP_ApLedgerSrch)this, new MS_MSBHL0120_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBHL0120_Srch01]の呼び出し */
	protected void callMS_MSBHL0120_Srch01() {
		MCCaller caller = createMS_MSBHL0120_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0120.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0120.HdrR aHdrR;
	/** [Dtl1]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBH.MSBHP0120.Dtl1R> aDtl1L;
	/** [Dtl1_Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0120.Dtl1_BtnR aDtl1_BtnR;
	/** [Dtl2]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBH.MSBHP0120.Dtl2R> aDtl2L;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBH.MSBHP0120.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBH.MSBHP0120.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBH.MSBHP0120.CndR createCndR() {
		return mcframe.clientMSBH.MSBHP0120.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBH.MSBHP0120.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBH.MSBHP0120.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBH.MSBHP0120.HdrR createHdrR() {
		return mcframe.clientMSBH.MSBHP0120.HdrR.create();
	}

	/**
	 * コピーによってaDtl1Lを設定します。
	 *
	 * aDtl1Lのインスタンスは変更されません。
	 *
	 * @param dataset Dtl1L
	 */
	public void setDtl1L(MCList<mcframe.clientMSBH.MSBHP0120.Dtl1R> aList) {
		if (getDtl1L() != aList) {
			getDtl1L().setAll(aList);
		}
	}

	/**
	 * [Dtl1]ブロックのコンテナaDtl1Lを返します。
	 *
	 * @return Dtl1L
	 */
	public MCList<mcframe.clientMSBH.MSBHP0120.Dtl1R> getDtl1L() {
		return aDtl1L;
	}

	/**
	 * aDtl1Rを作成します。
	 *
	 * @return Dtl1R
	 */
	public mcframe.clientMSBH.MSBHP0120.Dtl1R createDtl1R() {
		return mcframe.clientMSBH.MSBHP0120.Dtl1R.create();
	}

	/**
	 * aDtl1Lを作成します。
	 *
	 * @return Dtl1L
	 */
	public MCList<mcframe.clientMSBH.MSBHP0120.Dtl1R> createDtl1L() {
		return MCList.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.class);
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
	 * 項目コピーによってaDtl1_BtnRを設定します。
	 *
	 * aDtl1_BtnRのインスタンスは変更されません。
	 *
	 * @param row Dtl1_BtnR
	 */
	public void setDtl1_BtnR(mcframe.clientMSBH.MSBHP0120.Dtl1_BtnR row) {
		if (row != null) {
			MCRow.copyall(getDtl1_BtnR(), row);
		}
	}

	/**
	 * [Dtl1_Btn]ブロックのコンテナaDtl1_BtnRを返します。
	 *
	 * @return Dtl1_BtnR
	 */
	public mcframe.clientMSBH.MSBHP0120.Dtl1_BtnR getDtl1_BtnR() {
		return aDtl1_BtnR;
	}

	/**
	 * aDtl1_BtnRを作成します。
	 *
	 * @return Dtl1_BtnR
	 */
	public mcframe.clientMSBH.MSBHP0120.Dtl1_BtnR createDtl1_BtnR() {
		return mcframe.clientMSBH.MSBHP0120.Dtl1_BtnR.create();
	}

	/**
	 * コピーによってaDtl2Lを設定します。
	 *
	 * aDtl2Lのインスタンスは変更されません。
	 *
	 * @param dataset Dtl2L
	 */
	public void setDtl2L(MCList<mcframe.clientMSBH.MSBHP0120.Dtl2R> aList) {
		if (getDtl2L() != aList) {
			getDtl2L().setAll(aList);
		}
	}

	/**
	 * [Dtl2]ブロックのコンテナaDtl2Lを返します。
	 *
	 * @return Dtl2L
	 */
	public MCList<mcframe.clientMSBH.MSBHP0120.Dtl2R> getDtl2L() {
		return aDtl2L;
	}

	/**
	 * aDtl2Rを作成します。
	 *
	 * @return Dtl2R
	 */
	public mcframe.clientMSBH.MSBHP0120.Dtl2R createDtl2R() {
		return mcframe.clientMSBH.MSBHP0120.Dtl2R.create();
	}

	/**
	 * aDtl2Lを作成します。
	 *
	 * @return Dtl2L
	 */
	public MCList<mcframe.clientMSBH.MSBHP0120.Dtl2R> createDtl2L() {
		return MCList.create(mcframe.clientMSBH.MSBHP0120.Dtl2R.class);
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
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
		if(!MCCollectionUtil.contains(ret, getDtl1L())) ret.add(getDtl1L());
		if(!MCCollectionUtil.contains(ret, getDtl1_BtnR())) ret.add(getDtl1_BtnR());
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
		if(aCnt == getHdrR()) return "Hdr";
		if(aCnt == getDtl1L()) return "Dtl1";
		if(aCnt == getDtl1_BtnR()) return "Dtl1_Btn";
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
		if(bId.equals("Hdr")) return getHdrR();
		if(bId.equals("Dtl1")) return getDtl1L();
		if(bId.equals("Dtl1_Btn")) return getDtl1_BtnR();
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
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(ApplCndPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(HdrInfoPanel);
		ret.add(HdrPanel);
		ret.add(DtlPanel);
		ret.add(Dtl1InfoPanel);
		ret.add(Dtl1Panel);
		ret.add(Dtl1_BtnPanel);
		ret.add(Dtl2InfoPanel);
		ret.add(Dtl2Panel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBHP_ApLedgerSrch_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtl1L = createDtl1L();
		aDtl1_BtnR = createDtl1_BtnR();
		aDtl2L = createDtl2L();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBHP_ApLedgerSrch_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtl1L = createDtl1L();
		createDtl1Table();
		Dtl1Table.setRowName(name);
		aDtl1_BtnR = createDtl1_BtnR();
		aDtl2L = createDtl2L();
		createDtl2Table();
		Dtl2Table.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBHP_ApLedgerSrch_MC.jbCreateScreenOpe((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbCreateTop((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbCreateFold((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbCreateTab1((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbCreateTab2((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbCreateApplCnd((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbCreateCnd((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbCreateCtrl((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbCreateRslt((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbCreateHdrInfo((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbCreateHdr((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbCreateDtl((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbCreateDtl1Info((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbCreateDtl1((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbCreateDtl1_Btn((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbCreateDtl2Info((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbCreateDtl2((MSBHP_ApLedgerSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBHP_ApLedgerSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBHP_ApLedgerSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBHP_ApLedgerSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBHP_ApLedgerSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBHP_ApLedgerSrch p) {
	}

	/**
	 * [ApplCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateApplCnd(MSBHP_ApLedgerSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBHP_ApLedgerSrch p) {
		p.Cnd_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getCndR().wrk_no_p());
		p.Cnd_wrk_no_p_PPanel.setName("Cnd.wrk_no_p");
		p.Cnd_wrk_no = p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_no;
		p.Cnd_wrk_no.addAliasName("Cnd.wrk_no", p);
		p.Cnd_wrk_nm = p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_nm;
		p.Cnd_wrk_nm.addAliasName("Cnd.wrk_nm", p);
		p.Cnd_asppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().asppl_grp_p());
		p.Cnd_asppl_grp_p_PPanel.setName("Cnd.asppl_grp_p");
		p.Cnd_asppl_grp_lab1 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_asppl_grp_lab1.addAliasName("Cnd.asppl_grp_lab1", p);
		p.Cnd_asppl_grp_flg1 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_asppl_grp_flg1.addAliasName("Cnd.asppl_grp_flg1", p);
		p.Cnd_asppl_grp_cd1 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_asppl_grp_cd1.addAliasName("Cnd.asppl_grp_cd1", p);
		p.Cnd_asppl_grp_nm1 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_asppl_grp_nm1.addAliasName("Cnd.asppl_grp_nm1", p);
		p.Cnd_asppl_grp_lab2 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_asppl_grp_lab2.addAliasName("Cnd.asppl_grp_lab2", p);
		p.Cnd_asppl_grp_flg2 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_asppl_grp_flg2.addAliasName("Cnd.asppl_grp_flg2", p);
		p.Cnd_asppl_grp_cd2 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_asppl_grp_cd2.addAliasName("Cnd.asppl_grp_cd2", p);
		p.Cnd_asppl_grp_nm2 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_asppl_grp_nm2.addAliasName("Cnd.asppl_grp_nm2", p);
		p.Cnd_asppl_grp_lab3 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_asppl_grp_lab3.addAliasName("Cnd.asppl_grp_lab3", p);
		p.Cnd_asppl_grp_flg3 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_asppl_grp_flg3.addAliasName("Cnd.asppl_grp_flg3", p);
		p.Cnd_asppl_grp_cd3 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_asppl_grp_cd3.addAliasName("Cnd.asppl_grp_cd3", p);
		p.Cnd_asppl_grp_nm3 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_asppl_grp_nm3.addAliasName("Cnd.asppl_grp_nm3", p);
		p.Cnd_asppl_grp_lab4 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_asppl_grp_lab4.addAliasName("Cnd.asppl_grp_lab4", p);
		p.Cnd_asppl_grp_flg4 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_asppl_grp_flg4.addAliasName("Cnd.asppl_grp_flg4", p);
		p.Cnd_asppl_grp_cd4 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_asppl_grp_cd4.addAliasName("Cnd.asppl_grp_cd4", p);
		p.Cnd_asppl_grp_nm4 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_asppl_grp_nm4.addAliasName("Cnd.asppl_grp_nm4", p);
		p.Cnd_asppl_grp_lab5 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_asppl_grp_lab5.addAliasName("Cnd.asppl_grp_lab5", p);
		p.Cnd_asppl_grp_flg5 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_asppl_grp_flg5.addAliasName("Cnd.asppl_grp_flg5", p);
		p.Cnd_asppl_grp_cd5 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_asppl_grp_cd5.addAliasName("Cnd.asppl_grp_cd5", p);
		p.Cnd_asppl_grp_nm5 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_asppl_grp_nm5.addAliasName("Cnd.asppl_grp_nm5", p);
		p.Cnd_asppl_grp_lab6 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_asppl_grp_lab6.addAliasName("Cnd.asppl_grp_lab6", p);
		p.Cnd_asppl_grp_flg6 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_asppl_grp_flg6.addAliasName("Cnd.asppl_grp_flg6", p);
		p.Cnd_asppl_grp_cd6 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_asppl_grp_cd6.addAliasName("Cnd.asppl_grp_cd6", p);
		p.Cnd_asppl_grp_nm6 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_asppl_grp_nm6.addAliasName("Cnd.asppl_grp_nm6", p);
		p.Cnd_asppl_grp_lab7 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_asppl_grp_lab7.addAliasName("Cnd.asppl_grp_lab7", p);
		p.Cnd_asppl_grp_flg7 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_asppl_grp_flg7.addAliasName("Cnd.asppl_grp_flg7", p);
		p.Cnd_asppl_grp_cd7 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_asppl_grp_cd7.addAliasName("Cnd.asppl_grp_cd7", p);
		p.Cnd_asppl_grp_nm7 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_asppl_grp_nm7.addAliasName("Cnd.asppl_grp_nm7", p);
		p.Cnd_asppl_grp_lab8 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_asppl_grp_lab8.addAliasName("Cnd.asppl_grp_lab8", p);
		p.Cnd_asppl_grp_flg8 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_asppl_grp_flg8.addAliasName("Cnd.asppl_grp_flg8", p);
		p.Cnd_asppl_grp_cd8 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_asppl_grp_cd8.addAliasName("Cnd.asppl_grp_cd8", p);
		p.Cnd_asppl_grp_nm8 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_asppl_grp_nm8.addAliasName("Cnd.asppl_grp_nm8", p);
		p.Cnd_asppl_grp_lab9 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_asppl_grp_lab9.addAliasName("Cnd.asppl_grp_lab9", p);
		p.Cnd_asppl_grp_flg9 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_asppl_grp_flg9.addAliasName("Cnd.asppl_grp_flg9", p);
		p.Cnd_asppl_grp_cd9 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_asppl_grp_cd9.addAliasName("Cnd.asppl_grp_cd9", p);
		p.Cnd_asppl_grp_nm9 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_asppl_grp_nm9.addAliasName("Cnd.asppl_grp_nm9", p);
		p.Cnd_asppl_grp_lab10 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_asppl_grp_lab10.addAliasName("Cnd.asppl_grp_lab10", p);
		p.Cnd_asppl_grp_flg10 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_asppl_grp_flg10.addAliasName("Cnd.asppl_grp_flg10", p);
		p.Cnd_asppl_grp_cd10 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_asppl_grp_cd10.addAliasName("Cnd.asppl_grp_cd10", p);
		p.Cnd_asppl_grp_nm10 = p.Cnd_asppl_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_asppl_grp_nm10.addAliasName("Cnd.asppl_grp_nm10", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBHP_ApLedgerSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBHP_ApLedgerSrch p) {
	}

	/**
	 * [HdrInfo]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrInfo(MSBHP_ApLedgerSrch p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBHP_ApLedgerSrch p) {
		p.Hdr_wrkno_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getHdrR().wrkno_p());
		p.Hdr_wrkno_p_PPanel.setName("Hdr.wrkno_p");
		p.Hdr_wrk_no = p.Hdr_wrkno_p_PPanel.WrkNo_wrk_no;
		p.Hdr_wrk_no.addAliasName("Hdr.wrk_no", p);
		p.Hdr_wrk_nm = p.Hdr_wrkno_p_PPanel.WrkNo_wrk_nm;
		p.Hdr_wrk_nm.addAliasName("Hdr.wrk_nm", p);
		p.Hdr_init_bal_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().init_bal_p());
		p.Hdr_init_bal_p_PPanel.setName("Hdr.init_bal_p");
		p.Hdr_init_bal = p.Hdr_init_bal_p_PPanel.Amt_amt;
		p.Hdr_init_bal.addAliasName("Hdr.init_bal", p);
		p.Hdr_purc_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().purc_amt_p());
		p.Hdr_purc_amt_p_PPanel.setName("Hdr.purc_amt_p");
		p.Hdr_purc_amt = p.Hdr_purc_amt_p_PPanel.Amt_amt;
		p.Hdr_purc_amt.addAliasName("Hdr.purc_amt", p);
		p.Hdr_ret_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().ret_amt_p());
		p.Hdr_ret_amt_p_PPanel.setName("Hdr.ret_amt_p");
		p.Hdr_ret_amt = p.Hdr_ret_amt_p_PPanel.Amt_amt;
		p.Hdr_ret_amt.addAliasName("Hdr.ret_amt", p);
		p.Hdr_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().dscnt_amt_p());
		p.Hdr_dscnt_amt_p_PPanel.setName("Hdr.dscnt_amt_p");
		p.Hdr_dscnt_amt = p.Hdr_dscnt_amt_p_PPanel.Amt_amt;
		p.Hdr_dscnt_amt.addAliasName("Hdr.dscnt_amt", p);
		p.Hdr_sw_to_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().sw_to_amt_p());
		p.Hdr_sw_to_amt_p_PPanel.setName("Hdr.sw_to_amt_p");
		p.Hdr_sw_to_amt = p.Hdr_sw_to_amt_p_PPanel.Amt_amt;
		p.Hdr_sw_to_amt.addAliasName("Hdr.sw_to_amt", p);
		p.Hdr_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().tax_amt_p());
		p.Hdr_tax_amt_p_PPanel.setName("Hdr.tax_amt_p");
		p.Hdr_tax_amt = p.Hdr_tax_amt_p_PPanel.Amt_amt;
		p.Hdr_tax_amt.addAliasName("Hdr.tax_amt", p);
		p.Hdr_cash_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().cash_amt_p());
		p.Hdr_cash_amt_p_PPanel.setName("Hdr.cash_amt_p");
		p.Hdr_cash_amt = p.Hdr_cash_amt_p_PPanel.Amt_amt;
		p.Hdr_cash_amt.addAliasName("Hdr.cash_amt", p);
		p.Hdr_note_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().note_amt_p());
		p.Hdr_note_amt_p_PPanel.setName("Hdr.note_amt_p");
		p.Hdr_note_amt = p.Hdr_note_amt_p_PPanel.Amt_amt;
		p.Hdr_note_amt.addAliasName("Hdr.note_amt", p);
		p.Hdr_account_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().account_amt_p());
		p.Hdr_account_amt_p_PPanel.setName("Hdr.account_amt_p");
		p.Hdr_account_amt = p.Hdr_account_amt_p_PPanel.Amt_amt;
		p.Hdr_account_amt.addAliasName("Hdr.account_amt", p);
		p.Hdr_setoff_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().setoff_amt_p());
		p.Hdr_setoff_amt_p_PPanel.setName("Hdr.setoff_amt_p");
		p.Hdr_setoff_amt = p.Hdr_setoff_amt_p_PPanel.Amt_amt;
		p.Hdr_setoff_amt.addAliasName("Hdr.setoff_amt", p);
		p.Hdr_sw_amt_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().sw_amt_p());
		p.Hdr_sw_amt_p_PPanel.setName("Hdr.sw_amt_p");
		p.Hdr_sw_amt = p.Hdr_sw_amt_p_PPanel.Amt_amt;
		p.Hdr_sw_amt.addAliasName("Hdr.sw_amt", p);
		p.Hdr_end_bal_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().end_bal_p());
		p.Hdr_end_bal_p_PPanel.setName("Hdr.end_bal_p");
		p.Hdr_end_bal = p.Hdr_end_bal_p_PPanel.Amt_amt;
		p.Hdr_end_bal.addAliasName("Hdr.end_bal", p);
		p.Hdr_exc_gain_loss_p_PPanel = mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.create(p.getHdrR().exc_gain_loss_p());
		p.Hdr_exc_gain_loss_p_PPanel.setName("Hdr.exc_gain_loss_p");
		p.Hdr_exc_gain_loss = p.Hdr_exc_gain_loss_p_PPanel.Amt_amt;
		p.Hdr_exc_gain_loss.addAliasName("Hdr.exc_gain_loss", p);
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBHP_ApLedgerSrch p) {
	}

	/**
	 * [Dtl1Info]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl1Info(MSBHP_ApLedgerSrch p) {
	}

	/**
	 * [Dtl1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl1(MSBHP_ApLedgerSrch p) {
		p.Dtl1_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.$itm_p);
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
		p.Dtl1_sno_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.$sno_p);
		p.Dtl1_sno_p_PPanel.setName("Dtl1.sno_p");
		p.columnDtl1_sno1 = p.Dtl1_sno_p_PPanel.columnSnoWrkNo_sno1;
		p.columnDtl1_sno1.addAliasName("Dtl1.sno1", p);
		p.columnDtl1_sno2 = p.Dtl1_sno_p_PPanel.columnSnoWrkNo_sno2;
		p.columnDtl1_sno2.addAliasName("Dtl1.sno2", p);
		p.columnDtl1_sno3 = p.Dtl1_sno_p_PPanel.columnSnoWrkNo_sno3;
		p.columnDtl1_sno3.addAliasName("Dtl1.sno3", p);
		p.columnDtl1_sno4 = p.Dtl1_sno_p_PPanel.columnSnoWrkNo_sno4;
		p.columnDtl1_sno4.addAliasName("Dtl1.sno4", p);
		p.columnDtl1_wrk_no = p.Dtl1_sno_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnDtl1_wrk_no.addAliasName("Dtl1.wrk_no", p);
		p.columnDtl1_wrk_nm = p.Dtl1_sno_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnDtl1_wrk_nm.addAliasName("Dtl1.wrk_nm", p);
		p.Dtl1_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.$trd_unit_qty_p);
		p.Dtl1_trd_unit_qty_p_PPanel.setName("Dtl1.trd_unit_qty_p");
		p.columnDtl1_trd_unit_qty = p.Dtl1_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl1_trd_unit_qty.addAliasName("Dtl1.trd_unit_qty", p);
		p.Dtl1_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.$base_unit_qty_p);
		p.Dtl1_base_unit_qty_p_PPanel.setName("Dtl1.base_unit_qty_p");
		p.columnDtl1_base_unit_qty = p.Dtl1_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl1_base_unit_qty.addAliasName("Dtl1.base_unit_qty", p);
		p.Dtl1_trd_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.$trd_cur_upri_p);
		p.Dtl1_trd_cur_upri_p_PPanel.setName("Dtl1.trd_cur_upri_p");
		p.columnDtl1_trd_cur_upri = p.Dtl1_trd_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl1_trd_cur_upri.addAliasName("Dtl1.trd_cur_upri", p);
		p.Dtl1_trd_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.$trd_cur_amt_p);
		p.Dtl1_trd_cur_amt_p_PPanel.setName("Dtl1.trd_cur_amt_p");
		p.columnDtl1_trd_cur_amt = p.Dtl1_trd_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_trd_cur_amt.addAliasName("Dtl1.trd_cur_amt", p);
		p.Dtl1_trd_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.$trd_cur_inc_tax_amt_p);
		p.Dtl1_trd_cur_inc_tax_amt_p_PPanel.setName("Dtl1.trd_cur_inc_tax_amt_p");
		p.columnDtl1_trd_cur_inc_tax_amt = p.Dtl1_trd_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_trd_cur_inc_tax_amt.addAliasName("Dtl1.trd_cur_inc_tax_amt", p);
		p.Dtl1_base_cur_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.$base_cur_upri_p);
		p.Dtl1_base_cur_upri_p_PPanel.setName("Dtl1.base_cur_upri_p");
		p.columnDtl1_base_cur_upri = p.Dtl1_base_cur_upri_p_PPanel.columnUpri_upri;
		p.columnDtl1_base_cur_upri.addAliasName("Dtl1.base_cur_upri", p);
		p.Dtl1_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.$base_cur_amt_p);
		p.Dtl1_base_cur_amt_p_PPanel.setName("Dtl1.base_cur_amt_p");
		p.columnDtl1_base_cur_amt = p.Dtl1_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_base_cur_amt.addAliasName("Dtl1.base_cur_amt", p);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.$base_cur_inc_tax_amt_p);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.setName("Dtl1.base_cur_inc_tax_amt_p");
		p.columnDtl1_base_cur_inc_tax_amt = p.Dtl1_base_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_base_cur_inc_tax_amt.addAliasName("Dtl1.base_cur_inc_tax_amt", p);
		p.Dtl1_trd_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.$trd_cur_tax_amt_p);
		p.Dtl1_trd_cur_tax_amt_p_PPanel.setName("Dtl1.trd_cur_tax_amt_p");
		p.columnDtl1_trd_cur_tax_amt = p.Dtl1_trd_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_trd_cur_tax_amt.addAliasName("Dtl1.trd_cur_tax_amt", p);
		p.Dtl1_trd_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.$trd_cur_dscnt_amt_p);
		p.Dtl1_trd_cur_dscnt_amt_p_PPanel.setName("Dtl1.trd_cur_dscnt_amt_p");
		p.columnDtl1_trd_cur_dscnt_amt = p.Dtl1_trd_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_trd_cur_dscnt_amt.addAliasName("Dtl1.trd_cur_dscnt_amt", p);
		p.Dtl1_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.$base_cur_tax_amt_p);
		p.Dtl1_base_cur_tax_amt_p_PPanel.setName("Dtl1.base_cur_tax_amt_p");
		p.columnDtl1_base_cur_tax_amt = p.Dtl1_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_base_cur_tax_amt.addAliasName("Dtl1.base_cur_tax_amt", p);
		p.Dtl1_base_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.$base_cur_dscnt_amt_p);
		p.Dtl1_base_cur_dscnt_amt_p_PPanel.setName("Dtl1.base_cur_dscnt_amt_p");
		p.columnDtl1_base_cur_dscnt_amt = p.Dtl1_base_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_base_cur_dscnt_amt.addAliasName("Dtl1.base_cur_dscnt_amt", p);
		p.Dtl1_trd_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.$trd_cur_proc_upri_p);
		p.Dtl1_trd_cur_proc_upri_p_PPanel.setName("Dtl1.trd_cur_proc_upri_p");
		p.columnDtl1_trd_cur_proc_upri = p.Dtl1_trd_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnDtl1_trd_cur_proc_upri.addAliasName("Dtl1.trd_cur_proc_upri", p);
		p.Dtl1_trd_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.$trd_cur_onr_prov_upri_p);
		p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.setName("Dtl1.trd_cur_onr_prov_upri_p");
		p.columnDtl1_trd_cur_onr_prov_upri = p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnDtl1_trd_cur_onr_prov_upri.addAliasName("Dtl1.trd_cur_onr_prov_upri", p);
		p.Dtl1_trd_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.$trd_cur_proc_amt_p);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.setName("Dtl1.trd_cur_proc_amt_p");
		p.columnDtl1_trd_cur_proc_amt = p.Dtl1_trd_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_trd_cur_proc_amt.addAliasName("Dtl1.trd_cur_proc_amt", p);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.$trd_cur_onr_prov_amt_p);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.setName("Dtl1.trd_cur_onr_prov_amt_p");
		p.columnDtl1_trd_cur_onr_prov_amt = p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_trd_cur_onr_prov_amt.addAliasName("Dtl1.trd_cur_onr_prov_amt", p);
		p.Dtl1_base_cur_proc_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.$base_cur_proc_upri_p);
		p.Dtl1_base_cur_proc_upri_p_PPanel.setName("Dtl1.base_cur_proc_upri_p");
		p.columnDtl1_base_cur_proc_upri = p.Dtl1_base_cur_proc_upri_p_PPanel.columnUpri_upri;
		p.columnDtl1_base_cur_proc_upri.addAliasName("Dtl1.base_cur_proc_upri", p);
		p.Dtl1_base_cur_onr_prov_upri_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.$base_cur_onr_prov_upri_p);
		p.Dtl1_base_cur_onr_prov_upri_p_PPanel.setName("Dtl1.base_cur_onr_prov_upri_p");
		p.columnDtl1_base_cur_onr_prov_upri = p.Dtl1_base_cur_onr_prov_upri_p_PPanel.columnUpri_upri;
		p.columnDtl1_base_cur_onr_prov_upri.addAliasName("Dtl1.base_cur_onr_prov_upri", p);
		p.Dtl1_base_cur_proc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.$base_cur_proc_amt_p);
		p.Dtl1_base_cur_proc_amt_p_PPanel.setName("Dtl1.base_cur_proc_amt_p");
		p.columnDtl1_base_cur_proc_amt = p.Dtl1_base_cur_proc_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_base_cur_proc_amt.addAliasName("Dtl1.base_cur_proc_amt", p);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.$base_cur_onr_prov_amt_p);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.setName("Dtl1.base_cur_onr_prov_amt_p");
		p.columnDtl1_base_cur_onr_prov_amt = p.Dtl1_base_cur_onr_prov_amt_p_PPanel.columnAmt_amt;
		p.columnDtl1_base_cur_onr_prov_amt.addAliasName("Dtl1.base_cur_onr_prov_amt", p);
		p.Dtl1_asppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.$asppl_grp_p);
		p.Dtl1_asppl_grp_p_PPanel.setName("Dtl1.asppl_grp_p");
		p.columnDtl1_asppl_grp_cd1 = p.Dtl1_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnDtl1_asppl_grp_cd1.addAliasName("Dtl1.asppl_grp_cd1", p);
		p.columnDtl1_asppl_grp_nm1 = p.Dtl1_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnDtl1_asppl_grp_nm1.addAliasName("Dtl1.asppl_grp_nm1", p);
		p.columnDtl1_asppl_grp_cd2 = p.Dtl1_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnDtl1_asppl_grp_cd2.addAliasName("Dtl1.asppl_grp_cd2", p);
		p.columnDtl1_asppl_grp_nm2 = p.Dtl1_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnDtl1_asppl_grp_nm2.addAliasName("Dtl1.asppl_grp_nm2", p);
		p.columnDtl1_asppl_grp_cd3 = p.Dtl1_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnDtl1_asppl_grp_cd3.addAliasName("Dtl1.asppl_grp_cd3", p);
		p.columnDtl1_asppl_grp_nm3 = p.Dtl1_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnDtl1_asppl_grp_nm3.addAliasName("Dtl1.asppl_grp_nm3", p);
		p.columnDtl1_asppl_grp_cd4 = p.Dtl1_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnDtl1_asppl_grp_cd4.addAliasName("Dtl1.asppl_grp_cd4", p);
		p.columnDtl1_asppl_grp_nm4 = p.Dtl1_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnDtl1_asppl_grp_nm4.addAliasName("Dtl1.asppl_grp_nm4", p);
		p.columnDtl1_asppl_grp_cd5 = p.Dtl1_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnDtl1_asppl_grp_cd5.addAliasName("Dtl1.asppl_grp_cd5", p);
		p.columnDtl1_asppl_grp_nm5 = p.Dtl1_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnDtl1_asppl_grp_nm5.addAliasName("Dtl1.asppl_grp_nm5", p);
		p.columnDtl1_asppl_grp_cd6 = p.Dtl1_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnDtl1_asppl_grp_cd6.addAliasName("Dtl1.asppl_grp_cd6", p);
		p.columnDtl1_asppl_grp_nm6 = p.Dtl1_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnDtl1_asppl_grp_nm6.addAliasName("Dtl1.asppl_grp_nm6", p);
		p.columnDtl1_asppl_grp_cd7 = p.Dtl1_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnDtl1_asppl_grp_cd7.addAliasName("Dtl1.asppl_grp_cd7", p);
		p.columnDtl1_asppl_grp_nm7 = p.Dtl1_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnDtl1_asppl_grp_nm7.addAliasName("Dtl1.asppl_grp_nm7", p);
		p.columnDtl1_asppl_grp_cd8 = p.Dtl1_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnDtl1_asppl_grp_cd8.addAliasName("Dtl1.asppl_grp_cd8", p);
		p.columnDtl1_asppl_grp_nm8 = p.Dtl1_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnDtl1_asppl_grp_nm8.addAliasName("Dtl1.asppl_grp_nm8", p);
		p.columnDtl1_asppl_grp_cd9 = p.Dtl1_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnDtl1_asppl_grp_cd9.addAliasName("Dtl1.asppl_grp_cd9", p);
		p.columnDtl1_asppl_grp_nm9 = p.Dtl1_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnDtl1_asppl_grp_nm9.addAliasName("Dtl1.asppl_grp_nm9", p);
		p.columnDtl1_asppl_grp_cd10 = p.Dtl1_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnDtl1_asppl_grp_cd10.addAliasName("Dtl1.asppl_grp_cd10", p);
		p.columnDtl1_asppl_grp_nm10 = p.Dtl1_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnDtl1_asppl_grp_nm10.addAliasName("Dtl1.asppl_grp_nm10", p);
	}

	/**
	 * [Dtl1_Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl1_Btn(MSBHP_ApLedgerSrch p) {
		p.Dtl1_Btn_paging_PPanel = mcframe.clientFXUC.FXUCP0130.FXUCP_Paging.create(p.getDtl1_BtnR().paging());
		p.Dtl1_Btn_paging_PPanel.setName("Dtl1_Btn.paging");
		p.Dtl1_Btn_p_prev = p.Dtl1_Btn_paging_PPanel.Btn_prev;
		p.Dtl1_Btn_p_prev.addAliasName("Dtl1_Btn.p_prev", p);
		p.Dtl1_Btn_p_next = p.Dtl1_Btn_paging_PPanel.Btn_next;
		p.Dtl1_Btn_p_next.addAliasName("Dtl1_Btn.p_next", p);
	}

	/**
	 * [Dtl2Info]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl2Info(MSBHP_ApLedgerSrch p) {
	}

	/**
	 * [Dtl2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl2(MSBHP_ApLedgerSrch p) {
		p.Dtl2_wrkno_p_PPanel = mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.create(mcframe.clientMSBH.MSBHP0120.Dtl2R.$wrkno_p);
		p.Dtl2_wrkno_p_PPanel.setName("Dtl2.wrkno_p");
		p.columnDtl2_wrk_no = p.Dtl2_wrkno_p_PPanel.columnWrkNo_wrk_no;
		p.columnDtl2_wrk_no.addAliasName("Dtl2.wrk_no", p);
		p.columnDtl2_wrk_nm = p.Dtl2_wrkno_p_PPanel.columnWrkNo_wrk_nm;
		p.columnDtl2_wrk_nm.addAliasName("Dtl2.wrk_nm", p);
		p.Dtl2_trd_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0120.Dtl2R.$trd_cur_amt_p);
		p.Dtl2_trd_cur_amt_p_PPanel.setName("Dtl2.trd_cur_amt_p");
		p.columnDtl2_trd_cur_amt = p.Dtl2_trd_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl2_trd_cur_amt.addAliasName("Dtl2.trd_cur_amt", p);
		p.Dtl2_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0120.Dtl2R.$base_cur_amt_p);
		p.Dtl2_base_cur_amt_p_PPanel.setName("Dtl2.base_cur_amt_p");
		p.columnDtl2_base_cur_amt = p.Dtl2_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnDtl2_base_cur_amt.addAliasName("Dtl2.base_cur_amt", p);
		p.Dtl2_asppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBH.MSBHP0120.Dtl2R.$asppl_grp_p);
		p.Dtl2_asppl_grp_p_PPanel.setName("Dtl2.asppl_grp_p");
		p.columnDtl2_asppl_grp_cd1 = p.Dtl2_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnDtl2_asppl_grp_cd1.addAliasName("Dtl2.asppl_grp_cd1", p);
		p.columnDtl2_asppl_grp_nm1 = p.Dtl2_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnDtl2_asppl_grp_nm1.addAliasName("Dtl2.asppl_grp_nm1", p);
		p.columnDtl2_asppl_grp_cd2 = p.Dtl2_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnDtl2_asppl_grp_cd2.addAliasName("Dtl2.asppl_grp_cd2", p);
		p.columnDtl2_asppl_grp_nm2 = p.Dtl2_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnDtl2_asppl_grp_nm2.addAliasName("Dtl2.asppl_grp_nm2", p);
		p.columnDtl2_asppl_grp_cd3 = p.Dtl2_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnDtl2_asppl_grp_cd3.addAliasName("Dtl2.asppl_grp_cd3", p);
		p.columnDtl2_asppl_grp_nm3 = p.Dtl2_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnDtl2_asppl_grp_nm3.addAliasName("Dtl2.asppl_grp_nm3", p);
		p.columnDtl2_asppl_grp_cd4 = p.Dtl2_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnDtl2_asppl_grp_cd4.addAliasName("Dtl2.asppl_grp_cd4", p);
		p.columnDtl2_asppl_grp_nm4 = p.Dtl2_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnDtl2_asppl_grp_nm4.addAliasName("Dtl2.asppl_grp_nm4", p);
		p.columnDtl2_asppl_grp_cd5 = p.Dtl2_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnDtl2_asppl_grp_cd5.addAliasName("Dtl2.asppl_grp_cd5", p);
		p.columnDtl2_asppl_grp_nm5 = p.Dtl2_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnDtl2_asppl_grp_nm5.addAliasName("Dtl2.asppl_grp_nm5", p);
		p.columnDtl2_asppl_grp_cd6 = p.Dtl2_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnDtl2_asppl_grp_cd6.addAliasName("Dtl2.asppl_grp_cd6", p);
		p.columnDtl2_asppl_grp_nm6 = p.Dtl2_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnDtl2_asppl_grp_nm6.addAliasName("Dtl2.asppl_grp_nm6", p);
		p.columnDtl2_asppl_grp_cd7 = p.Dtl2_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnDtl2_asppl_grp_cd7.addAliasName("Dtl2.asppl_grp_cd7", p);
		p.columnDtl2_asppl_grp_nm7 = p.Dtl2_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnDtl2_asppl_grp_nm7.addAliasName("Dtl2.asppl_grp_nm7", p);
		p.columnDtl2_asppl_grp_cd8 = p.Dtl2_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnDtl2_asppl_grp_cd8.addAliasName("Dtl2.asppl_grp_cd8", p);
		p.columnDtl2_asppl_grp_nm8 = p.Dtl2_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnDtl2_asppl_grp_nm8.addAliasName("Dtl2.asppl_grp_nm8", p);
		p.columnDtl2_asppl_grp_cd9 = p.Dtl2_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnDtl2_asppl_grp_cd9.addAliasName("Dtl2.asppl_grp_cd9", p);
		p.columnDtl2_asppl_grp_nm9 = p.Dtl2_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnDtl2_asppl_grp_nm9.addAliasName("Dtl2.asppl_grp_nm9", p);
		p.columnDtl2_asppl_grp_cd10 = p.Dtl2_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnDtl2_asppl_grp_cd10.addAliasName("Dtl2.asppl_grp_cd10", p);
		p.columnDtl2_asppl_grp_nm10 = p.Dtl2_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnDtl2_asppl_grp_nm10.addAliasName("Dtl2.asppl_grp_nm10", p);
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBHP_ApLedgerSrch create(){
		MSBHP_ApLedgerSrch p = new MSBHP_ApLedgerSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBHP_ApLedgerSrch create(String name){
		MSBHP_ApLedgerSrch p = new MSBHP_ApLedgerSrch(name);
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
		MSBHP_ApLedgerSrch_MC.jbfInitScreenOpe((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbfInitTop((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbfInitFold((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbfInitTab1((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbfInitTab2((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbfInitApplCnd((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbfInitCnd((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbfInitCtrl((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbfInitRslt((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbfInitHdrInfo((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbfInitHdr((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbfInitDtl((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbfInitDtl1Info((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbfInitDtl1((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbfInitDtl1_Btn((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbfInitDtl2Info((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbfInitDtl2((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbInitScreenOpe((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbInitTop((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbInitFold((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbInitTab1((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbInitTab2((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbInitApplCnd((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbInitCnd((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbInitCtrl((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbInitRslt((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbInitHdrInfo((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbInitHdr((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbInitDtl((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbInitDtl1Info((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbInitDtl1((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbInitDtl1_Btn((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbInitDtl2Info((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.jbInitDtl2((MSBHP_ApLedgerSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBHP_ApLedgerSrch p) {
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
	protected static void jbfInitTab1(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [ApplCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitApplCnd(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.ApplCndPanel = p.beansFactory.createPanel("ApplCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_TRD = p.beansFactory.createRadioButton("Cnd.ope_TRD");
		p.Cnd_ope_BASE = p.beansFactory.createRadioButton("Cnd.ope_BASE");
		p.Cnd_ac_ym_Label = p.beansFactory.createLabel("Cnd.ac_ym_Label");
		p.Cnd_ac_ym = p.beansFactory.createDateField("Cnd.ac_ym");
		p.Cnd_ac_ym.setLabel(p.Cnd_ac_ym_Label);
		p.Cnd_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.trd_cur_cd_Label");
		p.Cnd_trd_cur_cd = p.beansFactory.createTextComboBox("Cnd.trd_cur_cd");
		p.Cnd_trd_cur_cd.setLabel(p.Cnd_trd_cur_cd_Label);
		p.Cnd_trd_cur_nm = p.beansFactory.createTextField("Cnd.trd_cur_nm");
		p.Cnd_ap_typ_Label = p.beansFactory.createLabel("Cnd.ap_typ_Label");
		p.Cnd_ap_typ = p.beansFactory.createTextComboBox("Cnd.ap_typ");
		p.Cnd_ap_typ.setLabel(p.Cnd_ap_typ_Label);
		p.Cnd_ap_typ_nm = p.beansFactory.createTextField("Cnd.ap_typ_nm");
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
		p.Cnd_rcpt_iv_no_Label = p.beansFactory.createLabel("Cnd.rcpt_iv_no_Label");
		p.Cnd_rcpt_iv_no = p.beansFactory.createTextField("Cnd.rcpt_iv_no");
		p.Cnd_rcpt_iv_no.setLabel(p.Cnd_rcpt_iv_no_Label);
		p.Cnd_rcpt_iv_mng_no_Label = p.beansFactory.createLabel("Cnd.rcpt_iv_mng_no_Label");
		p.Cnd_rcpt_iv_mng_no = p.beansFactory.createTextField("Cnd.rcpt_iv_mng_no");
		p.Cnd_rcpt_iv_mng_no.setLabel(p.Cnd_rcpt_iv_mng_no_Label);
		p.Cnd_purc_act_no_Label = p.beansFactory.createLabel("Cnd.purc_act_no_Label");
		p.Cnd_purc_act_no = p.beansFactory.createTextField("Cnd.purc_act_no");
		p.Cnd_purc_act_no.setLabel(p.Cnd_purc_act_no_Label);
		p.Cnd_sign_rvrs_flg = p.beansFactory.createCheckBox("Cnd.sign_rvrs_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		// ブロックの項目の初期化
	}

	/**
	 * [HdrInfo]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrInfo(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.HdrInfoPanel = p.beansFactory.createPanel("HdrInfo");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		p.HdrTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Hdr_ac_ym_Label = p.beansFactory.createLabel("Hdr.ac_ym_Label");
		p.Hdr_ac_ym = p.beansFactory.createDateField("Hdr.ac_ym");
		p.Hdr_ac_ym.setLabel(p.Hdr_ac_ym_Label);
		p.Hdr_trd_cur_cd_Label = p.beansFactory.createLabel("Hdr.trd_cur_cd_Label");
		p.Hdr_trd_cur_cd = p.beansFactory.createTextField("Hdr.trd_cur_cd");
		p.Hdr_trd_cur_cd.setLabel(p.Hdr_trd_cur_cd_Label);
		p.Hdr_trd_cur_nm = p.beansFactory.createTextField("Hdr.trd_cur_nm");
		p.Hdr_ap_typ_Label = p.beansFactory.createLabel("Hdr.ap_typ_Label");
		p.Hdr_ap_typ = p.beansFactory.createTextField("Hdr.ap_typ");
		p.Hdr_ap_typ.setLabel(p.Hdr_ap_typ_Label);
		p.Hdr_ap_typ_nm = p.beansFactory.createTextField("Hdr.ap_typ_nm");
		p.Hdr_asppl_cd_Label = p.beansFactory.createLabel("Hdr.asppl_cd_Label");
		p.Hdr_asppl_cd = p.beansFactory.createTextField("Hdr.asppl_cd");
		p.Hdr_asppl_cd.setLabel(p.Hdr_asppl_cd_Label);
		p.Hdr_asppl_nm = p.beansFactory.createTextField("Hdr.asppl_nm");
		p.Hdr_ap_dpt_cd_Label = p.beansFactory.createLabel("Hdr.ap_dpt_cd_Label");
		p.Hdr_ap_dpt_cd = p.beansFactory.createTextField("Hdr.ap_dpt_cd");
		p.Hdr_ap_dpt_cd.setLabel(p.Hdr_ap_dpt_cd_Label);
		p.Hdr_ap_dpt_nm = p.beansFactory.createTextField("Hdr.ap_dpt_nm");
		p.Hdr_wg_cd_Label = p.beansFactory.createLabel("Hdr.wg_cd_Label");
		p.Hdr_wg_cd = p.beansFactory.createTextField("Hdr.wg_cd");
		p.Hdr_wg_cd.setLabel(p.Hdr_wg_cd_Label);
		p.Hdr_wg_nm = p.beansFactory.createTextField("Hdr.wg_nm");
		p.Hdr_rcpt_iv_no_Label = p.beansFactory.createLabel("Hdr.rcpt_iv_no_Label");
		p.Hdr_rcpt_iv_no = p.beansFactory.createTextField("Hdr.rcpt_iv_no");
		p.Hdr_rcpt_iv_no.setLabel(p.Hdr_rcpt_iv_no_Label);
		p.Hdr_rcpt_iv_mng_no_Label = p.beansFactory.createLabel("Hdr.rcpt_iv_mng_no_Label");
		p.Hdr_rcpt_iv_mng_no = p.beansFactory.createTextField("Hdr.rcpt_iv_mng_no");
		p.Hdr_rcpt_iv_mng_no.setLabel(p.Hdr_rcpt_iv_mng_no_Label);
		p.Hdr_purc_act_no_Label = p.beansFactory.createLabel("Hdr.purc_act_no_Label");
		p.Hdr_purc_act_no = p.beansFactory.createTextField("Hdr.purc_act_no");
		p.Hdr_purc_act_no.setLabel(p.Hdr_purc_act_no_Label);
		p.Hdr_cur_cd_Label = p.beansFactory.createLabel("Hdr.cur_cd_Label");
		p.Hdr_cur_cd = p.beansFactory.createTextField("Hdr.cur_cd");
		p.Hdr_cur_cd.setLabel(p.Hdr_cur_cd_Label);
		p.Hdr_amt_dec_place = p.beansFactory.createNumberField("Hdr.amt_dec_place");
		p.Hdr_upri_dec_place = p.beansFactory.createNumberField("Hdr.upri_dec_place");
		p.Hdr_base_cur_cd_Label = p.beansFactory.createLabel("Hdr.base_cur_cd_Label");
		p.Hdr_base_cur_cd = p.beansFactory.createTextField("Hdr.base_cur_cd");
		p.Hdr_base_cur_cd.setLabel(p.Hdr_base_cur_cd_Label);
		p.Hdr_base_cur_nm = p.beansFactory.createTextField("Hdr.base_cur_nm");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl1Info]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl1Info(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.Dtl1InfoPanel = p.beansFactory.createPanel("Dtl1Info");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl1(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.Dtl1Panel = p.beansFactory.createPanel("Dtl1");
		p.Dtl1TitledBorder = p.beansFactory.createTitledBorder();
		p.Dtl1ScrollPane = p.beansFactory.createScrollPane("Dtl1.scroll");
		p.createDtl1Table();
		// ブロックの項目の初期化
		p.columnDtl1_row_num = p.beansFactory.createTableColumn("Dtl1.row_num", MCColumnType.NUMBER);
		p.columnDtl1_ac_dt = p.beansFactory.createTableColumn("Dtl1.ac_dt", MCColumnType.DATE);
		p.columnDtl1_slip_sts_typ = p.beansFactory.createTableColumn("Dtl1.slip_sts_typ", MCColumnType.TEXT);
		p.columnDtl1_slip_sts_typ_nm = p.beansFactory.createTableColumn("Dtl1.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtl1_trd_cd = p.beansFactory.createTableColumn("Dtl1.trd_cd", MCColumnType.TEXT);
		p.columnDtl1_trd_nm = p.beansFactory.createTableColumn("Dtl1.trd_nm", MCColumnType.TEXT);
		p.columnDtl1_ap_typ = p.beansFactory.createTableColumn("Dtl1.ap_typ", MCColumnType.TEXT);
		p.columnDtl1_ap_typ_nm = p.beansFactory.createTableColumn("Dtl1.ap_typ_nm", MCColumnType.TEXT);
		p.columnDtl1_act_no = p.beansFactory.createTableColumn("Dtl1.act_no", MCColumnType.TEXT);
		p.columnDtl1_act_rev = p.beansFactory.createTableColumn("Dtl1.act_rev", MCColumnType.NUMBER);
		p.columnDtl1_act_seq = p.beansFactory.createTableColumn("Dtl1.act_seq", MCColumnType.NUMBER);
		p.columnDtl1_act_d_no = p.beansFactory.createTableColumn("Dtl1.act_d_no", MCColumnType.TEXT);
		p.columnDtl1_act_d_seq = p.beansFactory.createTableColumn("Dtl1.act_d_seq", MCColumnType.NUMBER);
		p.columnDtl1_rcpt_iv_no = p.beansFactory.createTableColumn("Dtl1.rcpt_iv_no", MCColumnType.TEXT);
		p.columnDtl1_rcpt_iv_mng_no = p.beansFactory.createTableColumn("Dtl1.rcpt_iv_mng_no", MCColumnType.TEXT);
		p.columnDtl1_trd_unit_cd = p.beansFactory.createTableColumn("Dtl1.trd_unit_cd", MCColumnType.TEXT);
		p.columnDtl1_trd_unit_nm = p.beansFactory.createTableColumn("Dtl1.trd_unit_nm", MCColumnType.TEXT);
		p.columnDtl1_trd_unit_dec_place = p.beansFactory.createTableColumn("Dtl1.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl1_base_unit_cd = p.beansFactory.createTableColumn("Dtl1.base_unit_cd", MCColumnType.TEXT);
		p.columnDtl1_base_unit_nm = p.beansFactory.createTableColumn("Dtl1.base_unit_nm", MCColumnType.TEXT);
		p.columnDtl1_base_unit_dec_place = p.beansFactory.createTableColumn("Dtl1.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl1_interim_flg = p.beansFactory.createTableColumn("Dtl1.interim_flg", MCColumnType.CHECK);
		p.columnDtl1_tax_cd = p.beansFactory.createTableColumn("Dtl1.tax_cd", MCColumnType.TEXT);
		p.columnDtl1_tax_nm = p.beansFactory.createTableColumn("Dtl1.tax_nm", MCColumnType.TEXT);
		p.columnDtl1_tax_rate = p.beansFactory.createTableColumn("Dtl1.tax_rate", MCColumnType.NUMBER);
		p.columnDtl1_outsrc_flg = p.beansFactory.createTableColumn("Dtl1.outsrc_flg", MCColumnType.CHECK);
		p.columnDtl1_repurc_obli_flg = p.beansFactory.createTableColumn("Dtl1.repurc_obli_flg", MCColumnType.CHECK);
		p.columnDtl1_base_purc_ac_dt = p.beansFactory.createTableColumn("Dtl1.base_purc_ac_dt", MCColumnType.DATE);
		p.columnDtl1_asppl_cd = p.beansFactory.createTableColumn("Dtl1.asppl_cd", MCColumnType.TEXT);
		p.columnDtl1_asppl_nm = p.beansFactory.createTableColumn("Dtl1.asppl_nm", MCColumnType.TEXT);
		p.columnDtl1_ap_dpt_cd = p.beansFactory.createTableColumn("Dtl1.ap_dpt_cd", MCColumnType.TEXT);
		p.columnDtl1_ap_dpt_nm = p.beansFactory.createTableColumn("Dtl1.ap_dpt_nm", MCColumnType.TEXT);
		p.columnDtl1_wg_cd = p.beansFactory.createTableColumn("Dtl1.wg_cd", MCColumnType.TEXT);
		p.columnDtl1_wg_nm = p.beansFactory.createTableColumn("Dtl1.wg_nm", MCColumnType.TEXT);
		p.columnDtl1_sppl_cd = p.beansFactory.createTableColumn("Dtl1.sppl_cd", MCColumnType.TEXT);
		p.columnDtl1_sppl_nm = p.beansFactory.createTableColumn("Dtl1.sppl_nm", MCColumnType.TEXT);
		p.columnDtl1_purc_dpt_cd = p.beansFactory.createTableColumn("Dtl1.purc_dpt_cd", MCColumnType.TEXT);
		p.columnDtl1_purc_dpt_nm = p.beansFactory.createTableColumn("Dtl1.purc_dpt_nm", MCColumnType.TEXT);
		p.columnDtl1_purc_usr_cd = p.beansFactory.createTableColumn("Dtl1.purc_usr_cd", MCColumnType.TEXT);
		p.columnDtl1_purc_usr_nm = p.beansFactory.createTableColumn("Dtl1.purc_usr_nm", MCColumnType.TEXT);
		p.columnDtl1_po_no = p.beansFactory.createTableColumn("Dtl1.po_no", MCColumnType.TEXT);
		p.columnDtl1_po_d_no = p.beansFactory.createTableColumn("Dtl1.po_d_no", MCColumnType.TEXT);
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
	}

	/**
	 * [Dtl1_Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl1_Btn(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.Dtl1_BtnPanel = p.beansFactory.createPanel("Dtl1_Btn");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl2Info]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl2Info(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.Dtl2InfoPanel = p.beansFactory.createPanel("Dtl2Info");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl2(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.Dtl2Panel = p.beansFactory.createPanel("Dtl2");
		p.Dtl2TitledBorder = p.beansFactory.createTitledBorder();
		p.Dtl2ScrollPane = p.beansFactory.createScrollPane("Dtl2.scroll");
		p.createDtl2Table();
		// ブロックの項目の初期化
		p.columnDtl2_ac_dt = p.beansFactory.createTableColumn("Dtl2.ac_dt", MCColumnType.DATE);
		p.columnDtl2_slip_sts_typ = p.beansFactory.createTableColumn("Dtl2.slip_sts_typ", MCColumnType.TEXT);
		p.columnDtl2_slip_sts_typ_nm = p.beansFactory.createTableColumn("Dtl2.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtl2_act_no = p.beansFactory.createTableColumn("Dtl2.act_no", MCColumnType.TEXT);
		p.columnDtl2_act_rev = p.beansFactory.createTableColumn("Dtl2.act_rev", MCColumnType.NUMBER);
		p.columnDtl2_act_seq = p.beansFactory.createTableColumn("Dtl2.act_seq", MCColumnType.NUMBER);
		p.columnDtl2_act_d_no = p.beansFactory.createTableColumn("Dtl2.act_d_no", MCColumnType.TEXT);
		p.columnDtl2_act_d_seq = p.beansFactory.createTableColumn("Dtl2.act_d_seq", MCColumnType.NUMBER);
		p.columnDtl2_ap_typ = p.beansFactory.createTableColumn("Dtl2.ap_typ", MCColumnType.TEXT);
		p.columnDtl2_ap_typ_nm = p.beansFactory.createTableColumn("Dtl2.ap_typ_nm", MCColumnType.TEXT);
		p.columnDtl2_purc_act_no = p.beansFactory.createTableColumn("Dtl2.purc_act_no", MCColumnType.TEXT);
		p.columnDtl2_rcpt_iv_no = p.beansFactory.createTableColumn("Dtl2.rcpt_iv_no", MCColumnType.TEXT);
		p.columnDtl2_rcpt_iv_mng_no = p.beansFactory.createTableColumn("Dtl2.rcpt_iv_mng_no", MCColumnType.TEXT);
		p.columnDtl2_ap_sttl_cd = p.beansFactory.createTableColumn("Dtl2.ap_sttl_cd", MCColumnType.TEXT);
		p.columnDtl2_ap_sttl_nm = p.beansFactory.createTableColumn("Dtl2.ap_sttl_nm", MCColumnType.TEXT);
		p.columnDtl2_ap_sttl_typ = p.beansFactory.createTableColumn("Dtl2.ap_sttl_typ", MCColumnType.TEXT);
		p.columnDtl2_ap_sttl_typ_nm = p.beansFactory.createTableColumn("Dtl2.ap_sttl_typ_nm", MCColumnType.TEXT);
		p.columnDtl2_adv_pay_ap_sttl_cd = p.beansFactory.createTableColumn("Dtl2.adv_pay_ap_sttl_cd", MCColumnType.TEXT);
		p.columnDtl2_adv_pay_ap_sttl_nm = p.beansFactory.createTableColumn("Dtl2.adv_pay_ap_sttl_nm", MCColumnType.TEXT);
		p.columnDtl2_adv_pay_ap_sttl_typ = p.beansFactory.createTableColumn("Dtl2.adv_pay_ap_sttl_typ", MCColumnType.TEXT);
		p.columnDtl2_adv_pay_ap_sttl_typ_nm = p.beansFactory.createTableColumn("Dtl2.adv_pay_ap_sttl_typ_nm", MCColumnType.TEXT);
		p.columnDtl2_asppl_cd = p.beansFactory.createTableColumn("Dtl2.asppl_cd", MCColumnType.TEXT);
		p.columnDtl2_asppl_nm = p.beansFactory.createTableColumn("Dtl2.asppl_nm", MCColumnType.TEXT);
		p.columnDtl2_ap_dpt_cd = p.beansFactory.createTableColumn("Dtl2.ap_dpt_cd", MCColumnType.TEXT);
		p.columnDtl2_ap_dpt_nm = p.beansFactory.createTableColumn("Dtl2.ap_dpt_nm", MCColumnType.TEXT);
		p.columnDtl2_wg_cd = p.beansFactory.createTableColumn("Dtl2.wg_cd", MCColumnType.TEXT);
		p.columnDtl2_wg_nm = p.beansFactory.createTableColumn("Dtl2.wg_nm", MCColumnType.TEXT);
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
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBHP_ApLedgerSrch p) {
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
	protected static void jbInitTop(MSBHP_ApLedgerSrch p) {
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
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBHP_ApLedgerSrch p) {
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
	protected static void jbInitTab1(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.ApplCndPanel, null);
		p.Tab2Panel.setLastBeans(p.ApplCndPanel);
	}

	/**
	 * [ApplCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitApplCnd(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.ApplCndPanel.setValueCheck(false);
		p.ApplCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ApplCndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_TRD);
		p.Cnd_ope_TRD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_TRD);
		p.ScreenOpePanel.add(p.Cnd_ope_TRD);
		p.Cnd_ope_TRD.setNextBeans(p.Cnd_ope_BASE);
		p.Cnd_ope_BASE.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_BASE);
		p.ScreenOpePanel.add(p.Cnd_ope_BASE);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0120.CndR.ope_META);
		p.CndPanel.add(p.Cnd_ac_ym_Label);
		p.CndPanel.add(p.Cnd_ac_ym);
		p.CndPanel.setLastBeans(p.Cnd_ac_ym);
		p.Cnd_ac_ym.setNextBeans(p.Cnd_trd_cur_cd);
		p.Cnd_ac_ym.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0120.CndR.ac_ym_META);
		p.Cnd_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_trd_cur_cd.setListType(MCListType.STRICT);
		p.Cnd_trd_cur_cd.setLinkBeans(p.Cnd_trd_cur_nm);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0120.CndR.trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_ap_typ);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0120.CndR.trd_cur_nm_META);
		p.Cnd_ap_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ap_typ, true);
		p.Cnd_ap_typ.setLinkBeans(p.Cnd_ap_typ_nm);
		p.CndPanel.add(p.Cnd_ap_typ_Label);
		p.CndPanel.add(p.Cnd_ap_typ);
		p.Cnd_ap_typ.setNextBeans(p.Cnd_ap_typ_nm);
		p.Cnd_ap_typ.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0120.CndR.ap_typ_META);
		p.CndPanel.add(p.Cnd_ap_typ_nm);
		p.Cnd_ap_typ_nm.setNextBeans(p.Cnd_asppl_cd);
		p.Cnd_ap_typ_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0120.CndR.ap_typ_nm_META);
		p.CndPanel.add(p.Cnd_asppl_cd_Label);
		p.CndPanel.add(p.Cnd_asppl_cd);
		p.Cnd_asppl_cd.setNextBeans(p.Cnd_asppl_nm);
		p.Cnd_asppl_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0120.CndR.asppl_cd_META);
		p.Cnd_asppl_cd.addLinkBeans(p.Cnd_asppl_nm);
		p.Cnd_asppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_asppl_cd, true);
		p.CndPanel.add(p.Cnd_asppl_nm);
		p.Cnd_asppl_nm.setNextBeans(p.Cnd_ap_dpt_cd);
		p.Cnd_asppl_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0120.CndR.asppl_nm_META);
		p.setPluralValueEnable(p.Cnd_asppl_nm, true);
		p.CndPanel.add(p.Cnd_ap_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_ap_dpt_cd);
		p.Cnd_ap_dpt_cd.setNextBeans(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0120.CndR.ap_dpt_cd_META);
		p.Cnd_ap_dpt_cd.addLinkBeans(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ap_dpt_cd, true);
		p.CndPanel.add(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_ap_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0120.CndR.ap_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_ap_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0120.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_rcpt_iv_no);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0120.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_rcpt_iv_no_Label);
		p.CndPanel.add(p.Cnd_rcpt_iv_no);
		p.Cnd_rcpt_iv_no.setNextBeans(p.Cnd_rcpt_iv_mng_no);
		p.Cnd_rcpt_iv_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0120.CndR.rcpt_iv_no_META);
		p.setPluralValueEnable(p.Cnd_rcpt_iv_no, true);
		p.CndPanel.add(p.Cnd_rcpt_iv_mng_no_Label);
		p.CndPanel.add(p.Cnd_rcpt_iv_mng_no);
		p.Cnd_rcpt_iv_mng_no.setNextBeans(p.Cnd_purc_act_no);
		p.Cnd_rcpt_iv_mng_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0120.CndR.rcpt_iv_mng_no_META);
		p.setPluralValueEnable(p.Cnd_rcpt_iv_mng_no, true);
		p.CndPanel.add(p.Cnd_purc_act_no_Label);
		p.CndPanel.add(p.Cnd_purc_act_no);
		p.Cnd_purc_act_no.setNextBeans(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_purc_act_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0120.CndR.purc_act_no_META);
		p.setPluralValueEnable(p.Cnd_purc_act_no, true);
		p.CndPanel.add(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_wrk_no_p_PPanel.setNextBeans(p.Cnd_sign_rvrs_flg);
		p.CndPanel.add(p.Cnd_sign_rvrs_flg);
		p.Cnd_sign_rvrs_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0120.CndR.sign_rvrs_flg_META);
		p.ApplCndPanel.add(p.Cnd_asppl_grp_p_PPanel);
		p.ApplCndPanel.setLastBeans(p.Cnd_asppl_grp_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.RsltPanel.add(p.HdrInfoPanel, null);
		p.RsltPanel.setLastBeans(p.HdrInfoPanel);
		p.HdrInfoPanel.setNextBeans(p.DtlPanel);
		p.RsltPanel.add(p.DtlPanel, null);
	}

	/**
	 * [HdrInfo]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrInfo(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.HdrInfoPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.HdrInfoPanel.add(p.HdrPanel, null);
		p.HdrInfoPanel.setLastBeans(p.HdrPanel);
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.HdrPanel.setBorder(p.HdrTitledBorder);
		p.HdrPanel.setValueCheck(false);
		p.HdrPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.HdrPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_ac_ym_Label);
		p.HdrPanel.add(p.Hdr_ac_ym);
		p.HdrPanel.setLastBeans(p.Hdr_ac_ym);
		p.Hdr_ac_ym.setNextBeans(p.Hdr_trd_cur_cd);
		p.Hdr_ac_ym.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0120.HdrR.ac_ym_META);
		p.Hdr_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.HdrPanel.add(p.Hdr_trd_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_trd_cur_cd);
		p.Hdr_trd_cur_cd.setNextBeans(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0120.HdrR.trd_cur_cd_META);
		p.HdrPanel.add(p.Hdr_trd_cur_nm);
		p.Hdr_trd_cur_nm.setNextBeans(p.Hdr_ap_typ);
		p.Hdr_trd_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0120.HdrR.trd_cur_nm_META);
		p.HdrPanel.add(p.Hdr_ap_typ_Label);
		p.HdrPanel.add(p.Hdr_ap_typ);
		p.Hdr_ap_typ.setNextBeans(p.Hdr_ap_typ_nm);
		p.Hdr_ap_typ.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0120.HdrR.ap_typ_META);
		p.HdrPanel.add(p.Hdr_ap_typ_nm);
		p.Hdr_ap_typ_nm.setNextBeans(p.Hdr_asppl_cd);
		p.Hdr_ap_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0120.HdrR.ap_typ_nm_META);
		p.HdrPanel.add(p.Hdr_asppl_cd_Label);
		p.HdrPanel.add(p.Hdr_asppl_cd);
		p.Hdr_asppl_cd.setNextBeans(p.Hdr_asppl_nm);
		p.Hdr_asppl_cd.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0120.HdrR.asppl_cd_META);
		p.HdrPanel.add(p.Hdr_asppl_nm);
		p.Hdr_asppl_nm.setNextBeans(p.Hdr_ap_dpt_cd);
		p.Hdr_asppl_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0120.HdrR.asppl_nm_META);
		p.HdrPanel.add(p.Hdr_ap_dpt_cd_Label);
		p.HdrPanel.add(p.Hdr_ap_dpt_cd);
		p.Hdr_ap_dpt_cd.setNextBeans(p.Hdr_ap_dpt_nm);
		p.Hdr_ap_dpt_cd.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0120.HdrR.ap_dpt_cd_META);
		p.HdrPanel.add(p.Hdr_ap_dpt_nm);
		p.Hdr_ap_dpt_nm.setNextBeans(p.Hdr_wg_cd);
		p.Hdr_ap_dpt_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0120.HdrR.ap_dpt_nm_META);
		p.HdrPanel.add(p.Hdr_wg_cd_Label);
		p.HdrPanel.add(p.Hdr_wg_cd);
		p.Hdr_wg_cd.setNextBeans(p.Hdr_wg_nm);
		p.Hdr_wg_cd.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0120.HdrR.wg_cd_META);
		p.HdrPanel.add(p.Hdr_wg_nm);
		p.Hdr_wg_nm.setNextBeans(p.Hdr_rcpt_iv_no);
		p.Hdr_wg_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0120.HdrR.wg_nm_META);
		p.HdrPanel.add(p.Hdr_rcpt_iv_no_Label);
		p.HdrPanel.add(p.Hdr_rcpt_iv_no);
		p.Hdr_rcpt_iv_no.setNextBeans(p.Hdr_rcpt_iv_mng_no);
		p.Hdr_rcpt_iv_no.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0120.HdrR.rcpt_iv_no_META);
		p.HdrPanel.add(p.Hdr_rcpt_iv_mng_no_Label);
		p.HdrPanel.add(p.Hdr_rcpt_iv_mng_no);
		p.Hdr_rcpt_iv_mng_no.setNextBeans(p.Hdr_purc_act_no);
		p.Hdr_rcpt_iv_mng_no.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0120.HdrR.rcpt_iv_mng_no_META);
		p.HdrPanel.add(p.Hdr_purc_act_no_Label);
		p.HdrPanel.add(p.Hdr_purc_act_no);
		p.Hdr_purc_act_no.setNextBeans(p.Hdr_wrkno_p_PPanel);
		p.Hdr_purc_act_no.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0120.HdrR.purc_act_no_META);
		p.HdrPanel.add(p.Hdr_wrkno_p_PPanel);
		p.Hdr_wrkno_p_PPanel.setNextBeans(p.Hdr_cur_cd);
		p.HdrPanel.add(p.Hdr_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_cur_cd);
		p.Hdr_cur_cd.setNextBeans(p.Hdr_amt_dec_place);
		p.Hdr_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0120.HdrR.cur_cd_META);
		p.HdrPanel.add(p.Hdr_amt_dec_place);
		p.Hdr_amt_dec_place.setNextBeans(p.Hdr_upri_dec_place);
		p.Hdr_amt_dec_place.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0120.HdrR.amt_dec_place_META);
		p.HdrPanel.add(p.Hdr_upri_dec_place);
		p.Hdr_upri_dec_place.setNextBeans(p.Hdr_base_cur_cd);
		p.Hdr_upri_dec_place.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0120.HdrR.upri_dec_place_META);
		p.HdrPanel.add(p.Hdr_base_cur_cd_Label);
		p.HdrPanel.add(p.Hdr_base_cur_cd);
		p.Hdr_base_cur_cd.setNextBeans(p.Hdr_base_cur_nm);
		p.Hdr_base_cur_cd.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0120.HdrR.base_cur_cd_META);
		p.HdrPanel.add(p.Hdr_base_cur_nm);
		p.Hdr_base_cur_nm.setNextBeans(p.Hdr_init_bal_p_PPanel);
		p.Hdr_base_cur_nm.setRow(p.getHdrR(), mcframe.clientMSBH.MSBHP0120.HdrR.base_cur_nm_META);
		p.HdrPanel.add(p.Hdr_init_bal_p_PPanel);
		p.Hdr_init_bal_p_PPanel.setNextBeans(p.Hdr_purc_amt_p_PPanel);
		p.HdrPanel.add(p.Hdr_purc_amt_p_PPanel);
		p.Hdr_purc_amt_p_PPanel.setNextBeans(p.Hdr_ret_amt_p_PPanel);
		p.HdrPanel.add(p.Hdr_ret_amt_p_PPanel);
		p.Hdr_ret_amt_p_PPanel.setNextBeans(p.Hdr_dscnt_amt_p_PPanel);
		p.HdrPanel.add(p.Hdr_dscnt_amt_p_PPanel);
		p.Hdr_dscnt_amt_p_PPanel.setNextBeans(p.Hdr_sw_to_amt_p_PPanel);
		p.HdrPanel.add(p.Hdr_sw_to_amt_p_PPanel);
		p.Hdr_sw_to_amt_p_PPanel.setNextBeans(p.Hdr_tax_amt_p_PPanel);
		p.HdrPanel.add(p.Hdr_tax_amt_p_PPanel);
		p.Hdr_tax_amt_p_PPanel.setNextBeans(p.Hdr_cash_amt_p_PPanel);
		p.HdrPanel.add(p.Hdr_cash_amt_p_PPanel);
		p.Hdr_cash_amt_p_PPanel.setNextBeans(p.Hdr_note_amt_p_PPanel);
		p.HdrPanel.add(p.Hdr_note_amt_p_PPanel);
		p.Hdr_note_amt_p_PPanel.setNextBeans(p.Hdr_account_amt_p_PPanel);
		p.HdrPanel.add(p.Hdr_account_amt_p_PPanel);
		p.Hdr_account_amt_p_PPanel.setNextBeans(p.Hdr_setoff_amt_p_PPanel);
		p.HdrPanel.add(p.Hdr_setoff_amt_p_PPanel);
		p.Hdr_setoff_amt_p_PPanel.setNextBeans(p.Hdr_sw_amt_p_PPanel);
		p.HdrPanel.add(p.Hdr_sw_amt_p_PPanel);
		p.Hdr_sw_amt_p_PPanel.setNextBeans(p.Hdr_end_bal_p_PPanel);
		p.HdrPanel.add(p.Hdr_end_bal_p_PPanel);
		p.Hdr_end_bal_p_PPanel.setNextBeans(p.Hdr_exc_gain_loss_p_PPanel);
		p.HdrPanel.add(p.Hdr_exc_gain_loss_p_PPanel);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.DtlPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.DtlPanel.add(p.Dtl1InfoPanel, null);
		p.DtlPanel.setLastBeans(p.Dtl1InfoPanel);
		p.Dtl1InfoPanel.setNextBeans(p.Dtl2InfoPanel);
		p.DtlPanel.add(p.Dtl2InfoPanel, null);
	}

	/**
	 * [Dtl1Info]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl1Info(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.Dtl1InfoPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.Dtl1InfoPanel.add(p.Dtl1Panel, null);
		p.Dtl1InfoPanel.setLastBeans(p.Dtl1Panel);
		p.Dtl1Panel.setNextBeans(p.Dtl1_BtnPanel);
		p.Dtl1InfoPanel.add(p.Dtl1_BtnPanel, null);
	}

	/**
	 * [Dtl1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl1(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.Dtl1Panel.setBorder(p.Dtl1TitledBorder);
		p.Dtl1Panel.add(p.Dtl1ScrollPane);
		p.Dtl1Panel.setLastBeans(p.Dtl1Table);
		p.Dtl1ScrollPane.setViewportView(p.Dtl1Table);
		p.Dtl1Table.setList(p.getDtl1L());
		p.Dtl1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl1_Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl1_Btn(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.Dtl1_BtnPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Dtl1_BtnPanel.add(p.Dtl1_Btn_paging_PPanel);
		p.Dtl1_BtnPanel.setLastBeans(p.Dtl1_Btn_paging_PPanel);
	}

	/**
	 * [Dtl2Info]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl2Info(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.Dtl2InfoPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.Dtl2InfoPanel.add(p.Dtl2Panel, null);
		p.Dtl2InfoPanel.setLastBeans(p.Dtl2Panel);
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl2(MSBHP_ApLedgerSrch p) {
		// ブロック関連の初期化
		p.Dtl2Panel.setBorder(p.Dtl2TitledBorder);
		p.Dtl2Panel.add(p.Dtl2ScrollPane);
		p.Dtl2Panel.setLastBeans(p.Dtl2Table);
		p.Dtl2ScrollPane.setViewportView(p.Dtl2Table);
		p.Dtl2Table.setList(p.getDtl2L());
		p.Dtl2Panel.setLayoutPosition("C");
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
		MSBHP_ApLedgerSrch_MC.mcInitScreenOpe((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.mcInitTop((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.mcInitFold((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.mcInitTab1((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.mcInitTab2((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.mcInitApplCnd((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.mcInitCnd((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.mcInitCtrl((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.mcInitRslt((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.mcInitHdrInfo((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.mcInitHdr((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.mcInitDtl((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.mcInitDtl1Info((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.mcInitDtl1((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.mcInitDtl1_Btn((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.mcInitDtl2Info((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.mcInitDtl2((MSBHP_ApLedgerSrch)this);

		// [SRCH]ステータスのモードの設定
		MSBHP_ApLedgerSrch_MC.statusInitSRCH_ScreenOpe((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.statusInitSRCH_Top((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.statusInitSRCH_Fold((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.statusInitSRCH_Tab1((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.statusInitSRCH_Tab2((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.statusInitSRCH_ApplCnd((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.statusInitSRCH_Cnd((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.statusInitSRCH_Ctrl((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.statusInitSRCH_Rslt((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.statusInitSRCH_HdrInfo((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.statusInitSRCH_Hdr((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.statusInitSRCH_Dtl((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.statusInitSRCH_Dtl1Info((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.statusInitSRCH_Dtl1((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.statusInitSRCH_Dtl1__Btn((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.statusInitSRCH_Dtl2Info((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.statusInitSRCH_Dtl2((MSBHP_ApLedgerSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBHP_ApLedgerSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBHP_ApLedgerSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBHP_ApLedgerSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBHP_ApLedgerSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBHP_ApLedgerSrch p) {
	}

	/**
	 *  [ApplCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitApplCnd(MSBHP_ApLedgerSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBHP_ApLedgerSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_TRD.addAllListener(p);
		p.Cnd_ope_BASE.addAllListener(p);
		p.Cnd_ac_ym.setListListener(p);
		p.Cnd_ac_ym.addAllListener(p);
		p.Cnd_trd_cur_cd.setListListener(p);
		p.Cnd_trd_cur_cd.addAllListener(p);
		p.Cnd_trd_cur_nm.setListListener(p);
		p.Cnd_trd_cur_nm.addAllListener(p);
		p.Cnd_ap_typ.setListListener(p);
		p.Cnd_ap_typ.addAllListener(p);
		p.Cnd_ap_typ_nm.setListListener(p);
		p.Cnd_ap_typ_nm.addAllListener(p);
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
		p.Cnd_rcpt_iv_no.setListListener(p);
		p.Cnd_rcpt_iv_no.addAllListener(p);
		p.Cnd_rcpt_iv_mng_no.setListListener(p);
		p.Cnd_rcpt_iv_mng_no.addAllListener(p);
		p.Cnd_purc_act_no.setListListener(p);
		p.Cnd_purc_act_no.addAllListener(p);
		p.Cnd_sign_rvrs_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBHP_ApLedgerSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBHP_ApLedgerSrch p) {
	}

	/**
	 *  [HdrInfo]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrInfo(MSBHP_ApLedgerSrch p) {
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBHP_ApLedgerSrch p) {
		p.Hdr_ac_ym.setListListener(p);
		p.Hdr_ac_ym.addAllListener(p);
		p.Hdr_trd_cur_cd.setListListener(p);
		p.Hdr_trd_cur_cd.addAllListener(p);
		p.Hdr_trd_cur_nm.setListListener(p);
		p.Hdr_trd_cur_nm.addAllListener(p);
		p.Hdr_ap_typ.setListListener(p);
		p.Hdr_ap_typ.addAllListener(p);
		p.Hdr_ap_typ_nm.setListListener(p);
		p.Hdr_ap_typ_nm.addAllListener(p);
		p.Hdr_asppl_cd.setListListener(p);
		p.Hdr_asppl_cd.addAllListener(p);
		p.Hdr_asppl_nm.setListListener(p);
		p.Hdr_asppl_nm.addAllListener(p);
		p.Hdr_ap_dpt_cd.setListListener(p);
		p.Hdr_ap_dpt_cd.addAllListener(p);
		p.Hdr_ap_dpt_nm.setListListener(p);
		p.Hdr_ap_dpt_nm.addAllListener(p);
		p.Hdr_wg_cd.setListListener(p);
		p.Hdr_wg_cd.addAllListener(p);
		p.Hdr_wg_nm.setListListener(p);
		p.Hdr_wg_nm.addAllListener(p);
		p.Hdr_rcpt_iv_no.setListListener(p);
		p.Hdr_rcpt_iv_no.addAllListener(p);
		p.Hdr_rcpt_iv_mng_no.setListListener(p);
		p.Hdr_rcpt_iv_mng_no.addAllListener(p);
		p.Hdr_purc_act_no.setListListener(p);
		p.Hdr_purc_act_no.addAllListener(p);
		p.Hdr_cur_cd.setListListener(p);
		p.Hdr_cur_cd.addAllListener(p);
		p.Hdr_amt_dec_place.setListListener(p);
		p.Hdr_amt_dec_place.addAllListener(p);
		p.Hdr_upri_dec_place.setListListener(p);
		p.Hdr_upri_dec_place.addAllListener(p);
		p.Hdr_base_cur_cd.setListListener(p);
		p.Hdr_base_cur_cd.addAllListener(p);
		p.Hdr_base_cur_nm.setListListener(p);
		p.Hdr_base_cur_nm.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBHP_ApLedgerSrch p) {
	}

	/**
	 *  [Dtl1Info]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl1Info(MSBHP_ApLedgerSrch p) {
	}

	/**
	 *  [Dtl1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl1(MSBHP_ApLedgerSrch p) {
		p.Dtl1Table.addAllListener(p);
		p.columnDtl1_row_num.addAllListener(p);
		p.columnDtl1_row_num.setListListener(p);
		p.columnDtl1_ac_dt.addAllListener(p);
		p.columnDtl1_ac_dt.setListListener(p);
		p.columnDtl1_slip_sts_typ.addAllListener(p);
		p.columnDtl1_slip_sts_typ.setListListener(p);
		p.columnDtl1_slip_sts_typ_nm.addAllListener(p);
		p.columnDtl1_slip_sts_typ_nm.setListListener(p);
		p.columnDtl1_trd_cd.addAllListener(p);
		p.columnDtl1_trd_cd.setListListener(p);
		p.columnDtl1_trd_nm.addAllListener(p);
		p.columnDtl1_trd_nm.setListListener(p);
		p.columnDtl1_ap_typ.addAllListener(p);
		p.columnDtl1_ap_typ.setListListener(p);
		p.columnDtl1_ap_typ_nm.addAllListener(p);
		p.columnDtl1_ap_typ_nm.setListListener(p);
		p.columnDtl1_act_no.addAllListener(p);
		p.columnDtl1_act_no.setListListener(p);
		p.columnDtl1_act_rev.addAllListener(p);
		p.columnDtl1_act_rev.setListListener(p);
		p.columnDtl1_act_seq.addAllListener(p);
		p.columnDtl1_act_seq.setListListener(p);
		p.columnDtl1_act_d_no.addAllListener(p);
		p.columnDtl1_act_d_no.setListListener(p);
		p.columnDtl1_act_d_seq.addAllListener(p);
		p.columnDtl1_act_d_seq.setListListener(p);
		p.columnDtl1_rcpt_iv_no.addAllListener(p);
		p.columnDtl1_rcpt_iv_no.setListListener(p);
		p.columnDtl1_rcpt_iv_mng_no.addAllListener(p);
		p.columnDtl1_rcpt_iv_mng_no.setListListener(p);
		p.columnDtl1_trd_unit_cd.addAllListener(p);
		p.columnDtl1_trd_unit_cd.setListListener(p);
		p.columnDtl1_trd_unit_nm.addAllListener(p);
		p.columnDtl1_trd_unit_nm.setListListener(p);
		p.columnDtl1_trd_unit_dec_place.addAllListener(p);
		p.columnDtl1_trd_unit_dec_place.setListListener(p);
		p.columnDtl1_base_unit_cd.addAllListener(p);
		p.columnDtl1_base_unit_cd.setListListener(p);
		p.columnDtl1_base_unit_nm.addAllListener(p);
		p.columnDtl1_base_unit_nm.setListListener(p);
		p.columnDtl1_base_unit_dec_place.addAllListener(p);
		p.columnDtl1_base_unit_dec_place.setListListener(p);
		p.columnDtl1_interim_flg.addAllListener(p);
		p.columnDtl1_tax_cd.addAllListener(p);
		p.columnDtl1_tax_cd.setListListener(p);
		p.columnDtl1_tax_nm.addAllListener(p);
		p.columnDtl1_tax_nm.setListListener(p);
		p.columnDtl1_tax_rate.addAllListener(p);
		p.columnDtl1_tax_rate.setListListener(p);
		p.columnDtl1_outsrc_flg.addAllListener(p);
		p.columnDtl1_repurc_obli_flg.addAllListener(p);
		p.columnDtl1_base_purc_ac_dt.addAllListener(p);
		p.columnDtl1_base_purc_ac_dt.setListListener(p);
		p.columnDtl1_asppl_cd.addAllListener(p);
		p.columnDtl1_asppl_cd.setListListener(p);
		p.columnDtl1_asppl_nm.addAllListener(p);
		p.columnDtl1_asppl_nm.setListListener(p);
		p.columnDtl1_ap_dpt_cd.addAllListener(p);
		p.columnDtl1_ap_dpt_cd.setListListener(p);
		p.columnDtl1_ap_dpt_nm.addAllListener(p);
		p.columnDtl1_ap_dpt_nm.setListListener(p);
		p.columnDtl1_wg_cd.addAllListener(p);
		p.columnDtl1_wg_cd.setListListener(p);
		p.columnDtl1_wg_nm.addAllListener(p);
		p.columnDtl1_wg_nm.setListListener(p);
		p.columnDtl1_sppl_cd.addAllListener(p);
		p.columnDtl1_sppl_cd.setListListener(p);
		p.columnDtl1_sppl_nm.addAllListener(p);
		p.columnDtl1_sppl_nm.setListListener(p);
		p.columnDtl1_purc_dpt_cd.addAllListener(p);
		p.columnDtl1_purc_dpt_cd.setListListener(p);
		p.columnDtl1_purc_dpt_nm.addAllListener(p);
		p.columnDtl1_purc_dpt_nm.setListListener(p);
		p.columnDtl1_purc_usr_cd.addAllListener(p);
		p.columnDtl1_purc_usr_cd.setListListener(p);
		p.columnDtl1_purc_usr_nm.addAllListener(p);
		p.columnDtl1_purc_usr_nm.setListListener(p);
		p.columnDtl1_po_no.addAllListener(p);
		p.columnDtl1_po_no.setListListener(p);
		p.columnDtl1_po_d_no.addAllListener(p);
		p.columnDtl1_po_d_no.setListListener(p);
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
	}

	/**
	 *  [Dtl1_Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl1_Btn(MSBHP_ApLedgerSrch p) {
	}

	/**
	 *  [Dtl2Info]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl2Info(MSBHP_ApLedgerSrch p) {
	}

	/**
	 *  [Dtl2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl2(MSBHP_ApLedgerSrch p) {
		p.Dtl2Table.addAllListener(p);
		p.columnDtl2_ac_dt.addAllListener(p);
		p.columnDtl2_ac_dt.setListListener(p);
		p.columnDtl2_slip_sts_typ.addAllListener(p);
		p.columnDtl2_slip_sts_typ.setListListener(p);
		p.columnDtl2_slip_sts_typ_nm.addAllListener(p);
		p.columnDtl2_slip_sts_typ_nm.setListListener(p);
		p.columnDtl2_act_no.addAllListener(p);
		p.columnDtl2_act_no.setListListener(p);
		p.columnDtl2_act_rev.addAllListener(p);
		p.columnDtl2_act_rev.setListListener(p);
		p.columnDtl2_act_seq.addAllListener(p);
		p.columnDtl2_act_seq.setListListener(p);
		p.columnDtl2_act_d_no.addAllListener(p);
		p.columnDtl2_act_d_no.setListListener(p);
		p.columnDtl2_act_d_seq.addAllListener(p);
		p.columnDtl2_act_d_seq.setListListener(p);
		p.columnDtl2_ap_typ.addAllListener(p);
		p.columnDtl2_ap_typ.setListListener(p);
		p.columnDtl2_ap_typ_nm.addAllListener(p);
		p.columnDtl2_ap_typ_nm.setListListener(p);
		p.columnDtl2_purc_act_no.addAllListener(p);
		p.columnDtl2_purc_act_no.setListListener(p);
		p.columnDtl2_rcpt_iv_no.addAllListener(p);
		p.columnDtl2_rcpt_iv_no.setListListener(p);
		p.columnDtl2_rcpt_iv_mng_no.addAllListener(p);
		p.columnDtl2_rcpt_iv_mng_no.setListListener(p);
		p.columnDtl2_ap_sttl_cd.addAllListener(p);
		p.columnDtl2_ap_sttl_cd.setListListener(p);
		p.columnDtl2_ap_sttl_nm.addAllListener(p);
		p.columnDtl2_ap_sttl_nm.setListListener(p);
		p.columnDtl2_ap_sttl_typ.addAllListener(p);
		p.columnDtl2_ap_sttl_typ.setListListener(p);
		p.columnDtl2_ap_sttl_typ_nm.addAllListener(p);
		p.columnDtl2_ap_sttl_typ_nm.setListListener(p);
		p.columnDtl2_adv_pay_ap_sttl_cd.addAllListener(p);
		p.columnDtl2_adv_pay_ap_sttl_cd.setListListener(p);
		p.columnDtl2_adv_pay_ap_sttl_nm.addAllListener(p);
		p.columnDtl2_adv_pay_ap_sttl_nm.setListListener(p);
		p.columnDtl2_adv_pay_ap_sttl_typ.addAllListener(p);
		p.columnDtl2_adv_pay_ap_sttl_typ.setListListener(p);
		p.columnDtl2_adv_pay_ap_sttl_typ_nm.addAllListener(p);
		p.columnDtl2_adv_pay_ap_sttl_typ_nm.setListListener(p);
		p.columnDtl2_asppl_cd.addAllListener(p);
		p.columnDtl2_asppl_cd.setListListener(p);
		p.columnDtl2_asppl_nm.addAllListener(p);
		p.columnDtl2_asppl_nm.setListListener(p);
		p.columnDtl2_ap_dpt_cd.addAllListener(p);
		p.columnDtl2_ap_dpt_cd.setListListener(p);
		p.columnDtl2_ap_dpt_nm.addAllListener(p);
		p.columnDtl2_ap_dpt_nm.setListListener(p);
		p.columnDtl2_wg_cd.addAllListener(p);
		p.columnDtl2_wg_cd.setListListener(p);
		p.columnDtl2_wg_nm.addAllListener(p);
		p.columnDtl2_wg_nm.setListListener(p);
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
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBHP_ApLedgerSrch p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBHP_ApLedgerSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBHP_ApLedgerSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBHP_ApLedgerSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBHP_ApLedgerSrch p){

	}

	/**
	 * [SRCH]ステータスの[ApplCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ApplCnd(MSBHP_ApLedgerSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBHP_ApLedgerSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ac_ym.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_trd_cur_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ap_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ap_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_asppl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_asppl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_sign_rvrs_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_asppl_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBHP_ApLedgerSrch p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBHP_ApLedgerSrch p){

	}

	/**
	 * [SRCH]ステータスの[HdrInfo]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrInfo(MSBHP_ApLedgerSrch p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBHP_ApLedgerSrch p){
		p.Hdr_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ap_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ap_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_asppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_asppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ap_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ap_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcpt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcpt_iv_mng_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_purc_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wrkno_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.READ_ONLY);
		p.Hdr_cur_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_upri_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_base_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_base_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_init_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_purc_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_ret_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_sw_to_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_cash_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_note_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_account_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_setoff_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_sw_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_end_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);
		p.Hdr_exc_gain_loss_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0060.MAUBP_Amt_H.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBHP_ApLedgerSrch p){

	}

	/**
	 * [SRCH]ステータスの[Dtl1Info]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl1Info(MSBHP_ApLedgerSrch p){

	}

	/**
	 * [SRCH]ステータスの[Dtl1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl1(MSBHP_ApLedgerSrch p){
		p.columnDtl1_row_num.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_slip_sts_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_slip_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ap_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ap_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_act_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_act_d_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl1_rcpt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_rcpt_iv_mng_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl1_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Dtl1_sno_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl1_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl1_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl1_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl1_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl1_interim_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl1_trd_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_trd_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trd_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_inc_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_tax_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl1_trd_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trd_cur_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_outsrc_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_repurc_obli_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl1_trd_cur_proc_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_proc_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_upri_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl1_base_cur_proc_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl1_base_purc_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_asppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_asppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ap_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ap_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_purc_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_purc_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_purc_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_purc_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl1_asppl_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnDtl1_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl1_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Dtl1_Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl1__Btn(MSBHP_ApLedgerSrch p){
		p.Dtl1_Btn_paging_PPanel.putStatus(SRCH, mcframe.clientFXUC.FXUCP0130.FXUCP_Paging.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Dtl2Info]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl2Info(MSBHP_ApLedgerSrch p){

	}

	/**
	 * [SRCH]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl2(MSBHP_ApLedgerSrch p){
		p.columnDtl2_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_slip_sts_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_slip_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_act_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_act_d_seq.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl2_ap_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ap_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_purc_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_rcpt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_rcpt_iv_mng_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl2_wrkno_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnDtl2_ap_sttl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ap_sttl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ap_sttl_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ap_sttl_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_adv_pay_ap_sttl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_adv_pay_ap_sttl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_adv_pay_ap_sttl_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_adv_pay_ap_sttl_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl2_trd_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Dtl2_base_cur_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnDtl2_asppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_asppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ap_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ap_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl2_asppl_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnDtl2_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl2_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

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
		MSBHP_ApLedgerSrch_MC.setTableConfigDtl1((MSBHP_ApLedgerSrch)this);
		MSBHP_ApLedgerSrch_MC.setTableConfigDtl2((MSBHP_ApLedgerSrch)this);
	}

	/**
	 * [Dtl1]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl1(MSBHP_ApLedgerSrch p) {
		p.columnDtl1_row_num.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.row_num_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_row_num);
		p.columnDtl1_ac_dt.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.ac_dt_META);
		p.columnDtl1_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ac_dt);
		p.columnDtl1_slip_sts_typ.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.slip_sts_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_slip_sts_typ);
		p.columnDtl1_slip_sts_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.slip_sts_typ_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_slip_sts_typ_nm);
		p.columnDtl1_trd_cd.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.trd_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_cd);
		p.columnDtl1_trd_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.trd_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_nm);
		p.columnDtl1_ap_typ.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.ap_typ_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ap_typ);
		p.columnDtl1_ap_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.ap_typ_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ap_typ_nm);
		p.columnDtl1_act_no.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.act_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_act_no);
		p.columnDtl1_act_rev.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.act_rev_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_act_rev);
		p.columnDtl1_act_seq.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.act_seq_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_act_seq);
		p.columnDtl1_act_d_no.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.act_d_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_act_d_no);
		p.columnDtl1_act_d_seq.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.act_d_seq_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_act_d_seq);
		p.columnDtl1_rcpt_iv_no.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.rcpt_iv_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_rcpt_iv_no);
		p.columnDtl1_rcpt_iv_mng_no.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.rcpt_iv_mng_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_rcpt_iv_mng_no);
		p.Dtl1Table.addTable(p.Dtl1_itm_p_PPanel.ItmTable);
		p.Dtl1Table.addTable(p.Dtl1_sno_p_PPanel.SnoWrkNoTable);
		p.columnDtl1_trd_unit_cd.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.trd_unit_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_unit_cd);
		p.columnDtl1_trd_unit_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.trd_unit_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_unit_nm);
		p.columnDtl1_trd_unit_dec_place.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.trd_unit_dec_place_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_trd_unit_dec_place);
		p.Dtl1Table.addTable(p.Dtl1_trd_unit_qty_p_PPanel.QtyTable);
		p.columnDtl1_base_unit_cd.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.base_unit_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_base_unit_cd);
		p.columnDtl1_base_unit_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.base_unit_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_base_unit_nm);
		p.columnDtl1_base_unit_dec_place.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.base_unit_dec_place_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_base_unit_dec_place);
		p.Dtl1Table.addTable(p.Dtl1_base_unit_qty_p_PPanel.QtyTable);
		p.columnDtl1_interim_flg.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.interim_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_interim_flg);
		p.Dtl1Table.addTable(p.Dtl1_trd_cur_upri_p_PPanel.UpriTable);
		p.Dtl1Table.addTable(p.Dtl1_trd_cur_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_trd_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_upri_p_PPanel.UpriTable);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.columnDtl1_tax_cd.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.tax_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_tax_cd);
		p.columnDtl1_tax_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.tax_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_tax_nm);
		p.columnDtl1_tax_rate.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.tax_rate_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_tax_rate);
		p.Dtl1Table.addTable(p.Dtl1_trd_cur_tax_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_trd_cur_dscnt_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_tax_amt_p_PPanel.AmtTable);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_dscnt_amt_p_PPanel.AmtTable);
		p.columnDtl1_outsrc_flg.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.outsrc_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_outsrc_flg);
		p.columnDtl1_repurc_obli_flg.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.repurc_obli_flg_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_repurc_obli_flg);
		p.Dtl1Table.addTable(p.Dtl1_trd_cur_proc_upri_p_PPanel.UpriTable);
		p.Dtl1Table.addTable(p.Dtl1_trd_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.Dtl1Table.addTable(p.Dtl1_trd_cur_proc_amt_p_PPanel.AmtTable);
		p.Dtl1_trd_cur_proc_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.Dtl1Table.addTable(p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.Dtl1_trd_cur_onr_prov_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_proc_upri_p_PPanel.UpriTable);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_onr_prov_upri_p_PPanel.UpriTable);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_proc_amt_p_PPanel.AmtTable);
		p.Dtl1_base_cur_proc_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.Dtl1Table.addTable(p.Dtl1_base_cur_onr_prov_amt_p_PPanel.AmtTable);
		p.Dtl1_base_cur_onr_prov_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.columnDtl1_base_purc_ac_dt.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.base_purc_ac_dt_META);
		p.columnDtl1_base_purc_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_base_purc_ac_dt);
		p.columnDtl1_asppl_cd.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.asppl_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_asppl_cd);
		p.columnDtl1_asppl_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.asppl_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_asppl_nm);
		p.columnDtl1_ap_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.ap_dpt_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ap_dpt_cd);
		p.columnDtl1_ap_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.ap_dpt_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ap_dpt_nm);
		p.columnDtl1_wg_cd.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.wg_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_wg_cd);
		p.columnDtl1_wg_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.wg_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_wg_nm);
		p.columnDtl1_sppl_cd.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.sppl_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sppl_cd);
		p.columnDtl1_sppl_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.sppl_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_sppl_nm);
		p.columnDtl1_purc_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.purc_dpt_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_dpt_cd);
		p.columnDtl1_purc_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.purc_dpt_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_dpt_nm);
		p.columnDtl1_purc_usr_cd.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.purc_usr_cd_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_usr_cd);
		p.columnDtl1_purc_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.purc_usr_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_purc_usr_nm);
		p.columnDtl1_po_no.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.po_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_po_no);
		p.columnDtl1_po_d_no.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.po_d_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_po_d_no);
		p.Dtl1Table.addTable(p.Dtl1_asppl_grp_p_PPanel.BpGrpTable);
		p.columnDtl1_ins_usr_id.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.ins_usr_id_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_usr_id);
		p.columnDtl1_ins_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.ins_usr_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_usr_nm);
		p.columnDtl1_ins_func_id.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.ins_func_id_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_func_id);
		p.columnDtl1_ins_func_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.ins_func_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_func_nm);
		p.columnDtl1_ins_ts.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.ins_ts_META);
		p.columnDtl1_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_ins_ts);
		p.columnDtl1_upd_usr_id.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.upd_usr_id_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_usr_id);
		p.columnDtl1_upd_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.upd_usr_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_usr_nm);
		p.columnDtl1_upd_func_id.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.upd_func_id_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_func_id);
		p.columnDtl1_upd_func_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.upd_func_nm_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_func_nm);
		p.columnDtl1_upd_ts.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.upd_ts_META);
		p.columnDtl1_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_ts);
		p.columnDtl1_upd_srv_req_no.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl1R.upd_srv_req_no_META);
		p.Dtl1Table.addColumnConfig(p.columnDtl1_upd_srv_req_no);
	}

	/**
	 * [Dtl2]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl2(MSBHP_ApLedgerSrch p) {
		p.columnDtl2_ac_dt.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.ac_dt_META);
		p.columnDtl2_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ac_dt);
		p.columnDtl2_slip_sts_typ.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.slip_sts_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_slip_sts_typ);
		p.columnDtl2_slip_sts_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.slip_sts_typ_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_slip_sts_typ_nm);
		p.columnDtl2_act_no.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.act_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_act_no);
		p.columnDtl2_act_rev.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.act_rev_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_act_rev);
		p.columnDtl2_act_seq.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.act_seq_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_act_seq);
		p.columnDtl2_act_d_no.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.act_d_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_act_d_no);
		p.columnDtl2_act_d_seq.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.act_d_seq_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_act_d_seq);
		p.columnDtl2_ap_typ.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.ap_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ap_typ);
		p.columnDtl2_ap_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.ap_typ_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ap_typ_nm);
		p.columnDtl2_purc_act_no.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.purc_act_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_purc_act_no);
		p.columnDtl2_rcpt_iv_no.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.rcpt_iv_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_rcpt_iv_no);
		p.columnDtl2_rcpt_iv_mng_no.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.rcpt_iv_mng_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_rcpt_iv_mng_no);
		p.Dtl2Table.addTable(p.Dtl2_wrkno_p_PPanel.WrkNoTable);
		p.columnDtl2_ap_sttl_cd.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.ap_sttl_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ap_sttl_cd);
		p.columnDtl2_ap_sttl_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.ap_sttl_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ap_sttl_nm);
		p.columnDtl2_ap_sttl_typ.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.ap_sttl_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ap_sttl_typ);
		p.columnDtl2_ap_sttl_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.ap_sttl_typ_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ap_sttl_typ_nm);
		p.columnDtl2_adv_pay_ap_sttl_cd.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.adv_pay_ap_sttl_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_adv_pay_ap_sttl_cd);
		p.columnDtl2_adv_pay_ap_sttl_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.adv_pay_ap_sttl_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_adv_pay_ap_sttl_nm);
		p.columnDtl2_adv_pay_ap_sttl_typ.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.adv_pay_ap_sttl_typ_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_adv_pay_ap_sttl_typ);
		p.columnDtl2_adv_pay_ap_sttl_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.adv_pay_ap_sttl_typ_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_adv_pay_ap_sttl_typ_nm);
		p.Dtl2Table.addTable(p.Dtl2_trd_cur_amt_p_PPanel.AmtTable);
		p.Dtl2Table.addTable(p.Dtl2_base_cur_amt_p_PPanel.AmtTable);
		p.columnDtl2_asppl_cd.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.asppl_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_asppl_cd);
		p.columnDtl2_asppl_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.asppl_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_asppl_nm);
		p.columnDtl2_ap_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.ap_dpt_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ap_dpt_cd);
		p.columnDtl2_ap_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.ap_dpt_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ap_dpt_nm);
		p.columnDtl2_wg_cd.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.wg_cd_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_wg_cd);
		p.columnDtl2_wg_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.wg_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_wg_nm);
		p.Dtl2Table.addTable(p.Dtl2_asppl_grp_p_PPanel.BpGrpTable);
		p.columnDtl2_ins_usr_id.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.ins_usr_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_usr_id);
		p.columnDtl2_ins_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.ins_usr_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_usr_nm);
		p.columnDtl2_ins_func_id.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.ins_func_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_func_id);
		p.columnDtl2_ins_func_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.ins_func_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_func_nm);
		p.columnDtl2_ins_ts.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.ins_ts_META);
		p.columnDtl2_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_ins_ts);
		p.columnDtl2_upd_usr_id.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.upd_usr_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_usr_id);
		p.columnDtl2_upd_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.upd_usr_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_usr_nm);
		p.columnDtl2_upd_func_id.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.upd_func_id_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_func_id);
		p.columnDtl2_upd_func_nm.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.upd_func_nm_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_func_nm);
		p.columnDtl2_upd_ts.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.upd_ts_META);
		p.columnDtl2_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_ts);
		p.columnDtl2_upd_srv_req_no.setMeta(mcframe.clientMSBH.MSBHP0120.Dtl2R.upd_srv_req_no_META);
		p.Dtl2Table.addColumnConfig(p.columnDtl2_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cur_cd.getListConfig().setPutter(getCnd_trd_cur_cd_ListPutter());
		Cnd_ap_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ap_typ.getListConfig().setPutter(getCnd_ap_typ_ListPutter());
		Cnd_asppl_cd.getListConfig().setPutter(getCnd_asppl_cd_ListPutter());
		Cnd_ap_dpt_cd.getListConfig().setPutter(getCnd_ap_dpt_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
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
	 * [Cnd_ap_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ap_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ApTyp");
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
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_trd_cur_cd) return getCnd_trd_cur_cd(row, info);
		if(combo == Cnd_ap_typ) return getCnd_ap_typ(row, info);
		if(combo == Cnd_asppl_cd) return getCnd_asppl_cd(row, info);
		if(combo == Cnd_ap_dpt_cd) return getCnd_ap_dpt_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
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
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

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
		if (vc == Cnd_ac_ym) return doCnd_ac_ym_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
		if (vc == Cnd_ap_typ) return doCnd_ap_typ_VC(info);
		if (vc == Cnd_ap_typ_nm) return doCnd_ap_typ_nm_VC(info);
		if (vc == Cnd_asppl_cd) return doCnd_asppl_cd_VC(info);
		if (vc == Cnd_asppl_nm) return doCnd_asppl_nm_VC(info);
		if (vc == Cnd_ap_dpt_cd) return doCnd_ap_dpt_cd_VC(info);
		if (vc == Cnd_ap_dpt_nm) return doCnd_ap_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_rcpt_iv_no) return doCnd_rcpt_iv_no_VC(info);
		if (vc == Cnd_rcpt_iv_mng_no) return doCnd_rcpt_iv_mng_no_VC(info);
		if (vc == Cnd_purc_act_no) return doCnd_purc_act_no_VC(info);
		if (vc == Cnd_sign_rvrs_flg) return doCnd_sign_rvrs_flg_VC(info);
		if (vc == Hdr_ac_ym) return doHdr_ac_ym_VC(info);
		if (vc == Hdr_trd_cur_cd) return doHdr_trd_cur_cd_VC(info);
		if (vc == Hdr_trd_cur_nm) return doHdr_trd_cur_nm_VC(info);
		if (vc == Hdr_ap_typ) return doHdr_ap_typ_VC(info);
		if (vc == Hdr_ap_typ_nm) return doHdr_ap_typ_nm_VC(info);
		if (vc == Hdr_asppl_cd) return doHdr_asppl_cd_VC(info);
		if (vc == Hdr_asppl_nm) return doHdr_asppl_nm_VC(info);
		if (vc == Hdr_ap_dpt_cd) return doHdr_ap_dpt_cd_VC(info);
		if (vc == Hdr_ap_dpt_nm) return doHdr_ap_dpt_nm_VC(info);
		if (vc == Hdr_wg_cd) return doHdr_wg_cd_VC(info);
		if (vc == Hdr_wg_nm) return doHdr_wg_nm_VC(info);
		if (vc == Hdr_rcpt_iv_no) return doHdr_rcpt_iv_no_VC(info);
		if (vc == Hdr_rcpt_iv_mng_no) return doHdr_rcpt_iv_mng_no_VC(info);
		if (vc == Hdr_purc_act_no) return doHdr_purc_act_no_VC(info);
		if (vc == Hdr_cur_cd) return doHdr_cur_cd_VC(info);
		if (vc == Hdr_amt_dec_place) return doHdr_amt_dec_place_VC(info);
		if (vc == Hdr_upri_dec_place) return doHdr_upri_dec_place_VC(info);
		if (vc == Hdr_base_cur_cd) return doHdr_base_cur_cd_VC(info);
		if (vc == Hdr_base_cur_nm) return doHdr_base_cur_nm_VC(info);
		if (vc == columnDtl1_row_num) return doDtl1_row_num_VC(info);
		if (vc == columnDtl1_ac_dt) return doDtl1_ac_dt_VC(info);
		if (vc == columnDtl1_slip_sts_typ) return doDtl1_slip_sts_typ_VC(info);
		if (vc == columnDtl1_slip_sts_typ_nm) return doDtl1_slip_sts_typ_nm_VC(info);
		if (vc == columnDtl1_trd_cd) return doDtl1_trd_cd_VC(info);
		if (vc == columnDtl1_trd_nm) return doDtl1_trd_nm_VC(info);
		if (vc == columnDtl1_ap_typ) return doDtl1_ap_typ_VC(info);
		if (vc == columnDtl1_ap_typ_nm) return doDtl1_ap_typ_nm_VC(info);
		if (vc == columnDtl1_act_no) return doDtl1_act_no_VC(info);
		if (vc == columnDtl1_act_rev) return doDtl1_act_rev_VC(info);
		if (vc == columnDtl1_act_seq) return doDtl1_act_seq_VC(info);
		if (vc == columnDtl1_act_d_no) return doDtl1_act_d_no_VC(info);
		if (vc == columnDtl1_act_d_seq) return doDtl1_act_d_seq_VC(info);
		if (vc == columnDtl1_rcpt_iv_no) return doDtl1_rcpt_iv_no_VC(info);
		if (vc == columnDtl1_rcpt_iv_mng_no) return doDtl1_rcpt_iv_mng_no_VC(info);
		if (vc == columnDtl1_trd_unit_cd) return doDtl1_trd_unit_cd_VC(info);
		if (vc == columnDtl1_trd_unit_nm) return doDtl1_trd_unit_nm_VC(info);
		if (vc == columnDtl1_trd_unit_dec_place) return doDtl1_trd_unit_dec_place_VC(info);
		if (vc == columnDtl1_base_unit_cd) return doDtl1_base_unit_cd_VC(info);
		if (vc == columnDtl1_base_unit_nm) return doDtl1_base_unit_nm_VC(info);
		if (vc == columnDtl1_base_unit_dec_place) return doDtl1_base_unit_dec_place_VC(info);
		if (vc == columnDtl1_interim_flg) return doDtl1_interim_flg_VC(info);
		if (vc == columnDtl1_tax_cd) return doDtl1_tax_cd_VC(info);
		if (vc == columnDtl1_tax_nm) return doDtl1_tax_nm_VC(info);
		if (vc == columnDtl1_tax_rate) return doDtl1_tax_rate_VC(info);
		if (vc == columnDtl1_outsrc_flg) return doDtl1_outsrc_flg_VC(info);
		if (vc == columnDtl1_repurc_obli_flg) return doDtl1_repurc_obli_flg_VC(info);
		if (vc == columnDtl1_base_purc_ac_dt) return doDtl1_base_purc_ac_dt_VC(info);
		if (vc == columnDtl1_asppl_cd) return doDtl1_asppl_cd_VC(info);
		if (vc == columnDtl1_asppl_nm) return doDtl1_asppl_nm_VC(info);
		if (vc == columnDtl1_ap_dpt_cd) return doDtl1_ap_dpt_cd_VC(info);
		if (vc == columnDtl1_ap_dpt_nm) return doDtl1_ap_dpt_nm_VC(info);
		if (vc == columnDtl1_wg_cd) return doDtl1_wg_cd_VC(info);
		if (vc == columnDtl1_wg_nm) return doDtl1_wg_nm_VC(info);
		if (vc == columnDtl1_sppl_cd) return doDtl1_sppl_cd_VC(info);
		if (vc == columnDtl1_sppl_nm) return doDtl1_sppl_nm_VC(info);
		if (vc == columnDtl1_purc_dpt_cd) return doDtl1_purc_dpt_cd_VC(info);
		if (vc == columnDtl1_purc_dpt_nm) return doDtl1_purc_dpt_nm_VC(info);
		if (vc == columnDtl1_purc_usr_cd) return doDtl1_purc_usr_cd_VC(info);
		if (vc == columnDtl1_purc_usr_nm) return doDtl1_purc_usr_nm_VC(info);
		if (vc == columnDtl1_po_no) return doDtl1_po_no_VC(info);
		if (vc == columnDtl1_po_d_no) return doDtl1_po_d_no_VC(info);
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
		if (vc == columnDtl2_ac_dt) return doDtl2_ac_dt_VC(info);
		if (vc == columnDtl2_slip_sts_typ) return doDtl2_slip_sts_typ_VC(info);
		if (vc == columnDtl2_slip_sts_typ_nm) return doDtl2_slip_sts_typ_nm_VC(info);
		if (vc == columnDtl2_act_no) return doDtl2_act_no_VC(info);
		if (vc == columnDtl2_act_rev) return doDtl2_act_rev_VC(info);
		if (vc == columnDtl2_act_seq) return doDtl2_act_seq_VC(info);
		if (vc == columnDtl2_act_d_no) return doDtl2_act_d_no_VC(info);
		if (vc == columnDtl2_act_d_seq) return doDtl2_act_d_seq_VC(info);
		if (vc == columnDtl2_ap_typ) return doDtl2_ap_typ_VC(info);
		if (vc == columnDtl2_ap_typ_nm) return doDtl2_ap_typ_nm_VC(info);
		if (vc == columnDtl2_purc_act_no) return doDtl2_purc_act_no_VC(info);
		if (vc == columnDtl2_rcpt_iv_no) return doDtl2_rcpt_iv_no_VC(info);
		if (vc == columnDtl2_rcpt_iv_mng_no) return doDtl2_rcpt_iv_mng_no_VC(info);
		if (vc == columnDtl2_ap_sttl_cd) return doDtl2_ap_sttl_cd_VC(info);
		if (vc == columnDtl2_ap_sttl_nm) return doDtl2_ap_sttl_nm_VC(info);
		if (vc == columnDtl2_ap_sttl_typ) return doDtl2_ap_sttl_typ_VC(info);
		if (vc == columnDtl2_ap_sttl_typ_nm) return doDtl2_ap_sttl_typ_nm_VC(info);
		if (vc == columnDtl2_adv_pay_ap_sttl_cd) return doDtl2_adv_pay_ap_sttl_cd_VC(info);
		if (vc == columnDtl2_adv_pay_ap_sttl_nm) return doDtl2_adv_pay_ap_sttl_nm_VC(info);
		if (vc == columnDtl2_adv_pay_ap_sttl_typ) return doDtl2_adv_pay_ap_sttl_typ_VC(info);
		if (vc == columnDtl2_adv_pay_ap_sttl_typ_nm) return doDtl2_adv_pay_ap_sttl_typ_nm_VC(info);
		if (vc == columnDtl2_asppl_cd) return doDtl2_asppl_cd_VC(info);
		if (vc == columnDtl2_asppl_nm) return doDtl2_asppl_nm_VC(info);
		if (vc == columnDtl2_ap_dpt_cd) return doDtl2_ap_dpt_cd_VC(info);
		if (vc == columnDtl2_ap_dpt_nm) return doDtl2_ap_dpt_nm_VC(info);
		if (vc == columnDtl2_wg_cd) return doDtl2_wg_cd_VC(info);
		if (vc == columnDtl2_wg_nm) return doDtl2_wg_nm_VC(info);
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
	 * [Cnd]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_ym_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcpt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcpt_iv_mng_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sign_rvrs_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sign_rvrs_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ap_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ap_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ap_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ap_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[asppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_asppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[asppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_asppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ap_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ap_dpt_nm_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[rcpt_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcpt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcpt_iv_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcpt_iv_mng_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[purc_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_purc_act_no_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[base_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_base_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[base_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_base_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[row_num]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_row_num_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[slip_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_slip_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[slip_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_slip_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ap_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ap_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[ap_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_ap_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[act_d_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_act_d_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[rcpt_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_rcpt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[rcpt_iv_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_rcpt_iv_mng_no_VC(MCEventInfo info){
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
	 * [Dtl1]パネルの[interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_tax_rate_VC(MCEventInfo info){
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
	 * [Dtl1]パネルの[repurc_obli_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_repurc_obli_flg_VC(MCEventInfo info){
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
	 * [Dtl1]パネルの[asppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_asppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[asppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_asppl_nm_VC(MCEventInfo info){
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
	 * [Dtl1]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_wg_nm_VC(MCEventInfo info){
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
	 * [Dtl1]パネルの[purc_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[purc_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[purc_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl1]パネルの[purc_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_purc_usr_nm_VC(MCEventInfo info){
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
	 * [Dtl1]パネルの[po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl1_po_d_no_VC(MCEventInfo info){
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
	 * [Dtl2]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[slip_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_slip_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[slip_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_slip_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[act_d_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_act_d_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ap_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ap_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ap_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ap_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[purc_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_purc_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[rcpt_iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_rcpt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[rcpt_iv_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_rcpt_iv_mng_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ap_sttl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ap_sttl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ap_sttl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ap_sttl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ap_sttl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ap_sttl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ap_sttl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ap_sttl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[adv_pay_ap_sttl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_adv_pay_ap_sttl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[adv_pay_ap_sttl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_adv_pay_ap_sttl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[adv_pay_ap_sttl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_adv_pay_ap_sttl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[adv_pay_ap_sttl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_adv_pay_ap_sttl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[asppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_asppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[asppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_asppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[ap_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_ap_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_wg_nm_VC(MCEventInfo info){
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
		else if (nc == Cnd_ac_ym) doCnd_ac_ym_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
		else if (nc == Cnd_ap_typ) doCnd_ap_typ_NC(info);
		else if (nc == Cnd_ap_typ_nm) doCnd_ap_typ_nm_NC(info);
		else if (nc == Cnd_asppl_cd) doCnd_asppl_cd_NC(info);
		else if (nc == Cnd_asppl_nm) doCnd_asppl_nm_NC(info);
		else if (nc == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NC(info);
		else if (nc == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NC(info);
		else if (nc == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_NC(info);
		else if (nc == Cnd_purc_act_no) doCnd_purc_act_no_NC(info);
		else if (nc == Cnd_sign_rvrs_flg) doCnd_sign_rvrs_flg_NC(info);
		else if (nc == Hdr_ac_ym) doHdr_ac_ym_NC(info);
		else if (nc == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NC(info);
		else if (nc == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NC(info);
		else if (nc == Hdr_ap_typ) doHdr_ap_typ_NC(info);
		else if (nc == Hdr_ap_typ_nm) doHdr_ap_typ_nm_NC(info);
		else if (nc == Hdr_asppl_cd) doHdr_asppl_cd_NC(info);
		else if (nc == Hdr_asppl_nm) doHdr_asppl_nm_NC(info);
		else if (nc == Hdr_ap_dpt_cd) doHdr_ap_dpt_cd_NC(info);
		else if (nc == Hdr_ap_dpt_nm) doHdr_ap_dpt_nm_NC(info);
		else if (nc == Hdr_wg_cd) doHdr_wg_cd_NC(info);
		else if (nc == Hdr_wg_nm) doHdr_wg_nm_NC(info);
		else if (nc == Hdr_rcpt_iv_no) doHdr_rcpt_iv_no_NC(info);
		else if (nc == Hdr_rcpt_iv_mng_no) doHdr_rcpt_iv_mng_no_NC(info);
		else if (nc == Hdr_purc_act_no) doHdr_purc_act_no_NC(info);
		else if (nc == Hdr_cur_cd) doHdr_cur_cd_NC(info);
		else if (nc == Hdr_amt_dec_place) doHdr_amt_dec_place_NC(info);
		else if (nc == Hdr_upri_dec_place) doHdr_upri_dec_place_NC(info);
		else if (nc == Hdr_base_cur_cd) doHdr_base_cur_cd_NC(info);
		else if (nc == Hdr_base_cur_nm) doHdr_base_cur_nm_NC(info);
		else if (nc == columnDtl1_row_num) doDtl1_row_num_NC(info);
		else if (nc == columnDtl1_ac_dt) doDtl1_ac_dt_NC(info);
		else if (nc == columnDtl1_slip_sts_typ) doDtl1_slip_sts_typ_NC(info);
		else if (nc == columnDtl1_slip_sts_typ_nm) doDtl1_slip_sts_typ_nm_NC(info);
		else if (nc == columnDtl1_trd_cd) doDtl1_trd_cd_NC(info);
		else if (nc == columnDtl1_trd_nm) doDtl1_trd_nm_NC(info);
		else if (nc == columnDtl1_ap_typ) doDtl1_ap_typ_NC(info);
		else if (nc == columnDtl1_ap_typ_nm) doDtl1_ap_typ_nm_NC(info);
		else if (nc == columnDtl1_act_no) doDtl1_act_no_NC(info);
		else if (nc == columnDtl1_act_rev) doDtl1_act_rev_NC(info);
		else if (nc == columnDtl1_act_seq) doDtl1_act_seq_NC(info);
		else if (nc == columnDtl1_act_d_no) doDtl1_act_d_no_NC(info);
		else if (nc == columnDtl1_act_d_seq) doDtl1_act_d_seq_NC(info);
		else if (nc == columnDtl1_rcpt_iv_no) doDtl1_rcpt_iv_no_NC(info);
		else if (nc == columnDtl1_rcpt_iv_mng_no) doDtl1_rcpt_iv_mng_no_NC(info);
		else if (nc == columnDtl1_trd_unit_cd) doDtl1_trd_unit_cd_NC(info);
		else if (nc == columnDtl1_trd_unit_nm) doDtl1_trd_unit_nm_NC(info);
		else if (nc == columnDtl1_trd_unit_dec_place) doDtl1_trd_unit_dec_place_NC(info);
		else if (nc == columnDtl1_base_unit_cd) doDtl1_base_unit_cd_NC(info);
		else if (nc == columnDtl1_base_unit_nm) doDtl1_base_unit_nm_NC(info);
		else if (nc == columnDtl1_base_unit_dec_place) doDtl1_base_unit_dec_place_NC(info);
		else if (nc == columnDtl1_interim_flg) doDtl1_interim_flg_NC(info);
		else if (nc == columnDtl1_tax_cd) doDtl1_tax_cd_NC(info);
		else if (nc == columnDtl1_tax_nm) doDtl1_tax_nm_NC(info);
		else if (nc == columnDtl1_tax_rate) doDtl1_tax_rate_NC(info);
		else if (nc == columnDtl1_outsrc_flg) doDtl1_outsrc_flg_NC(info);
		else if (nc == columnDtl1_repurc_obli_flg) doDtl1_repurc_obli_flg_NC(info);
		else if (nc == columnDtl1_base_purc_ac_dt) doDtl1_base_purc_ac_dt_NC(info);
		else if (nc == columnDtl1_asppl_cd) doDtl1_asppl_cd_NC(info);
		else if (nc == columnDtl1_asppl_nm) doDtl1_asppl_nm_NC(info);
		else if (nc == columnDtl1_ap_dpt_cd) doDtl1_ap_dpt_cd_NC(info);
		else if (nc == columnDtl1_ap_dpt_nm) doDtl1_ap_dpt_nm_NC(info);
		else if (nc == columnDtl1_wg_cd) doDtl1_wg_cd_NC(info);
		else if (nc == columnDtl1_wg_nm) doDtl1_wg_nm_NC(info);
		else if (nc == columnDtl1_sppl_cd) doDtl1_sppl_cd_NC(info);
		else if (nc == columnDtl1_sppl_nm) doDtl1_sppl_nm_NC(info);
		else if (nc == columnDtl1_purc_dpt_cd) doDtl1_purc_dpt_cd_NC(info);
		else if (nc == columnDtl1_purc_dpt_nm) doDtl1_purc_dpt_nm_NC(info);
		else if (nc == columnDtl1_purc_usr_cd) doDtl1_purc_usr_cd_NC(info);
		else if (nc == columnDtl1_purc_usr_nm) doDtl1_purc_usr_nm_NC(info);
		else if (nc == columnDtl1_po_no) doDtl1_po_no_NC(info);
		else if (nc == columnDtl1_po_d_no) doDtl1_po_d_no_NC(info);
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
		else if (nc == columnDtl2_ac_dt) doDtl2_ac_dt_NC(info);
		else if (nc == columnDtl2_slip_sts_typ) doDtl2_slip_sts_typ_NC(info);
		else if (nc == columnDtl2_slip_sts_typ_nm) doDtl2_slip_sts_typ_nm_NC(info);
		else if (nc == columnDtl2_act_no) doDtl2_act_no_NC(info);
		else if (nc == columnDtl2_act_rev) doDtl2_act_rev_NC(info);
		else if (nc == columnDtl2_act_seq) doDtl2_act_seq_NC(info);
		else if (nc == columnDtl2_act_d_no) doDtl2_act_d_no_NC(info);
		else if (nc == columnDtl2_act_d_seq) doDtl2_act_d_seq_NC(info);
		else if (nc == columnDtl2_ap_typ) doDtl2_ap_typ_NC(info);
		else if (nc == columnDtl2_ap_typ_nm) doDtl2_ap_typ_nm_NC(info);
		else if (nc == columnDtl2_purc_act_no) doDtl2_purc_act_no_NC(info);
		else if (nc == columnDtl2_rcpt_iv_no) doDtl2_rcpt_iv_no_NC(info);
		else if (nc == columnDtl2_rcpt_iv_mng_no) doDtl2_rcpt_iv_mng_no_NC(info);
		else if (nc == columnDtl2_ap_sttl_cd) doDtl2_ap_sttl_cd_NC(info);
		else if (nc == columnDtl2_ap_sttl_nm) doDtl2_ap_sttl_nm_NC(info);
		else if (nc == columnDtl2_ap_sttl_typ) doDtl2_ap_sttl_typ_NC(info);
		else if (nc == columnDtl2_ap_sttl_typ_nm) doDtl2_ap_sttl_typ_nm_NC(info);
		else if (nc == columnDtl2_adv_pay_ap_sttl_cd) doDtl2_adv_pay_ap_sttl_cd_NC(info);
		else if (nc == columnDtl2_adv_pay_ap_sttl_nm) doDtl2_adv_pay_ap_sttl_nm_NC(info);
		else if (nc == columnDtl2_adv_pay_ap_sttl_typ) doDtl2_adv_pay_ap_sttl_typ_NC(info);
		else if (nc == columnDtl2_adv_pay_ap_sttl_typ_nm) doDtl2_adv_pay_ap_sttl_typ_nm_NC(info);
		else if (nc == columnDtl2_asppl_cd) doDtl2_asppl_cd_NC(info);
		else if (nc == columnDtl2_asppl_nm) doDtl2_asppl_nm_NC(info);
		else if (nc == columnDtl2_ap_dpt_cd) doDtl2_ap_dpt_cd_NC(info);
		else if (nc == columnDtl2_ap_dpt_nm) doDtl2_ap_dpt_nm_NC(info);
		else if (nc == columnDtl2_wg_cd) doDtl2_wg_cd_NC(info);
		else if (nc == columnDtl2_wg_nm) doDtl2_wg_nm_NC(info);
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
	 * [Cnd]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sign_rvrs_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sign_rvrs_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_dpt_nm_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_iv_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_iv_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[row_num]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_row_num_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[slip_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_slip_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[slip_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_slip_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ap_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ap_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ap_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ap_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_d_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_d_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rcpt_iv_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcpt_iv_mng_no_NC(MCEventInfo info){
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
	 * [Dtl1]パネルの[interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[outsrc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_outsrc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[repurc_obli_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_repurc_obli_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_purc_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_purc_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[asppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_asppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[asppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_asppl_nm_NC(MCEventInfo info){
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
	 * [Dtl1]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_wg_nm_NC(MCEventInfo info){
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
	 * [Dtl1]パネルの[purc_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_d_no_NC(MCEventInfo info){
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
	 * [Dtl2]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[slip_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_slip_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[slip_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_slip_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_d_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_d_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcpt_iv_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcpt_iv_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_sttl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_sttl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_sttl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_sttl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_sttl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_sttl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_sttl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_sttl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[adv_pay_ap_sttl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_adv_pay_ap_sttl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[adv_pay_ap_sttl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_adv_pay_ap_sttl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[adv_pay_ap_sttl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_adv_pay_ap_sttl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[adv_pay_ap_sttl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_adv_pay_ap_sttl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[asppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_asppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[asppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_asppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_wg_nm_NC(MCEventInfo info){
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
		else if (ne == Cnd_ac_ym) doCnd_ac_ym_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
		else if (ne == Cnd_ap_typ) doCnd_ap_typ_NE(info);
		else if (ne == Cnd_ap_typ_nm) doCnd_ap_typ_nm_NE(info);
		else if (ne == Cnd_asppl_cd) doCnd_asppl_cd_NE(info);
		else if (ne == Cnd_asppl_nm) doCnd_asppl_nm_NE(info);
		else if (ne == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NE(info);
		else if (ne == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NE(info);
		else if (ne == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_NE(info);
		else if (ne == Cnd_purc_act_no) doCnd_purc_act_no_NE(info);
		else if (ne == Cnd_sign_rvrs_flg) doCnd_sign_rvrs_flg_NE(info);
		else if (ne == Hdr_ac_ym) doHdr_ac_ym_NE(info);
		else if (ne == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NE(info);
		else if (ne == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NE(info);
		else if (ne == Hdr_ap_typ) doHdr_ap_typ_NE(info);
		else if (ne == Hdr_ap_typ_nm) doHdr_ap_typ_nm_NE(info);
		else if (ne == Hdr_asppl_cd) doHdr_asppl_cd_NE(info);
		else if (ne == Hdr_asppl_nm) doHdr_asppl_nm_NE(info);
		else if (ne == Hdr_ap_dpt_cd) doHdr_ap_dpt_cd_NE(info);
		else if (ne == Hdr_ap_dpt_nm) doHdr_ap_dpt_nm_NE(info);
		else if (ne == Hdr_wg_cd) doHdr_wg_cd_NE(info);
		else if (ne == Hdr_wg_nm) doHdr_wg_nm_NE(info);
		else if (ne == Hdr_rcpt_iv_no) doHdr_rcpt_iv_no_NE(info);
		else if (ne == Hdr_rcpt_iv_mng_no) doHdr_rcpt_iv_mng_no_NE(info);
		else if (ne == Hdr_purc_act_no) doHdr_purc_act_no_NE(info);
		else if (ne == Hdr_cur_cd) doHdr_cur_cd_NE(info);
		else if (ne == Hdr_amt_dec_place) doHdr_amt_dec_place_NE(info);
		else if (ne == Hdr_upri_dec_place) doHdr_upri_dec_place_NE(info);
		else if (ne == Hdr_base_cur_cd) doHdr_base_cur_cd_NE(info);
		else if (ne == Hdr_base_cur_nm) doHdr_base_cur_nm_NE(info);
		else if (ne == columnDtl1_row_num) doDtl1_row_num_NE(info);
		else if (ne == columnDtl1_ac_dt) doDtl1_ac_dt_NE(info);
		else if (ne == columnDtl1_slip_sts_typ) doDtl1_slip_sts_typ_NE(info);
		else if (ne == columnDtl1_slip_sts_typ_nm) doDtl1_slip_sts_typ_nm_NE(info);
		else if (ne == columnDtl1_trd_cd) doDtl1_trd_cd_NE(info);
		else if (ne == columnDtl1_trd_nm) doDtl1_trd_nm_NE(info);
		else if (ne == columnDtl1_ap_typ) doDtl1_ap_typ_NE(info);
		else if (ne == columnDtl1_ap_typ_nm) doDtl1_ap_typ_nm_NE(info);
		else if (ne == columnDtl1_act_no) doDtl1_act_no_NE(info);
		else if (ne == columnDtl1_act_rev) doDtl1_act_rev_NE(info);
		else if (ne == columnDtl1_act_seq) doDtl1_act_seq_NE(info);
		else if (ne == columnDtl1_act_d_no) doDtl1_act_d_no_NE(info);
		else if (ne == columnDtl1_act_d_seq) doDtl1_act_d_seq_NE(info);
		else if (ne == columnDtl1_rcpt_iv_no) doDtl1_rcpt_iv_no_NE(info);
		else if (ne == columnDtl1_rcpt_iv_mng_no) doDtl1_rcpt_iv_mng_no_NE(info);
		else if (ne == columnDtl1_trd_unit_cd) doDtl1_trd_unit_cd_NE(info);
		else if (ne == columnDtl1_trd_unit_nm) doDtl1_trd_unit_nm_NE(info);
		else if (ne == columnDtl1_trd_unit_dec_place) doDtl1_trd_unit_dec_place_NE(info);
		else if (ne == columnDtl1_base_unit_cd) doDtl1_base_unit_cd_NE(info);
		else if (ne == columnDtl1_base_unit_nm) doDtl1_base_unit_nm_NE(info);
		else if (ne == columnDtl1_base_unit_dec_place) doDtl1_base_unit_dec_place_NE(info);
		else if (ne == columnDtl1_interim_flg) doDtl1_interim_flg_NE(info);
		else if (ne == columnDtl1_tax_cd) doDtl1_tax_cd_NE(info);
		else if (ne == columnDtl1_tax_nm) doDtl1_tax_nm_NE(info);
		else if (ne == columnDtl1_tax_rate) doDtl1_tax_rate_NE(info);
		else if (ne == columnDtl1_outsrc_flg) doDtl1_outsrc_flg_NE(info);
		else if (ne == columnDtl1_repurc_obli_flg) doDtl1_repurc_obli_flg_NE(info);
		else if (ne == columnDtl1_base_purc_ac_dt) doDtl1_base_purc_ac_dt_NE(info);
		else if (ne == columnDtl1_asppl_cd) doDtl1_asppl_cd_NE(info);
		else if (ne == columnDtl1_asppl_nm) doDtl1_asppl_nm_NE(info);
		else if (ne == columnDtl1_ap_dpt_cd) doDtl1_ap_dpt_cd_NE(info);
		else if (ne == columnDtl1_ap_dpt_nm) doDtl1_ap_dpt_nm_NE(info);
		else if (ne == columnDtl1_wg_cd) doDtl1_wg_cd_NE(info);
		else if (ne == columnDtl1_wg_nm) doDtl1_wg_nm_NE(info);
		else if (ne == columnDtl1_sppl_cd) doDtl1_sppl_cd_NE(info);
		else if (ne == columnDtl1_sppl_nm) doDtl1_sppl_nm_NE(info);
		else if (ne == columnDtl1_purc_dpt_cd) doDtl1_purc_dpt_cd_NE(info);
		else if (ne == columnDtl1_purc_dpt_nm) doDtl1_purc_dpt_nm_NE(info);
		else if (ne == columnDtl1_purc_usr_cd) doDtl1_purc_usr_cd_NE(info);
		else if (ne == columnDtl1_purc_usr_nm) doDtl1_purc_usr_nm_NE(info);
		else if (ne == columnDtl1_po_no) doDtl1_po_no_NE(info);
		else if (ne == columnDtl1_po_d_no) doDtl1_po_d_no_NE(info);
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
		else if (ne == columnDtl2_ac_dt) doDtl2_ac_dt_NE(info);
		else if (ne == columnDtl2_slip_sts_typ) doDtl2_slip_sts_typ_NE(info);
		else if (ne == columnDtl2_slip_sts_typ_nm) doDtl2_slip_sts_typ_nm_NE(info);
		else if (ne == columnDtl2_act_no) doDtl2_act_no_NE(info);
		else if (ne == columnDtl2_act_rev) doDtl2_act_rev_NE(info);
		else if (ne == columnDtl2_act_seq) doDtl2_act_seq_NE(info);
		else if (ne == columnDtl2_act_d_no) doDtl2_act_d_no_NE(info);
		else if (ne == columnDtl2_act_d_seq) doDtl2_act_d_seq_NE(info);
		else if (ne == columnDtl2_ap_typ) doDtl2_ap_typ_NE(info);
		else if (ne == columnDtl2_ap_typ_nm) doDtl2_ap_typ_nm_NE(info);
		else if (ne == columnDtl2_purc_act_no) doDtl2_purc_act_no_NE(info);
		else if (ne == columnDtl2_rcpt_iv_no) doDtl2_rcpt_iv_no_NE(info);
		else if (ne == columnDtl2_rcpt_iv_mng_no) doDtl2_rcpt_iv_mng_no_NE(info);
		else if (ne == columnDtl2_ap_sttl_cd) doDtl2_ap_sttl_cd_NE(info);
		else if (ne == columnDtl2_ap_sttl_nm) doDtl2_ap_sttl_nm_NE(info);
		else if (ne == columnDtl2_ap_sttl_typ) doDtl2_ap_sttl_typ_NE(info);
		else if (ne == columnDtl2_ap_sttl_typ_nm) doDtl2_ap_sttl_typ_nm_NE(info);
		else if (ne == columnDtl2_adv_pay_ap_sttl_cd) doDtl2_adv_pay_ap_sttl_cd_NE(info);
		else if (ne == columnDtl2_adv_pay_ap_sttl_nm) doDtl2_adv_pay_ap_sttl_nm_NE(info);
		else if (ne == columnDtl2_adv_pay_ap_sttl_typ) doDtl2_adv_pay_ap_sttl_typ_NE(info);
		else if (ne == columnDtl2_adv_pay_ap_sttl_typ_nm) doDtl2_adv_pay_ap_sttl_typ_nm_NE(info);
		else if (ne == columnDtl2_asppl_cd) doDtl2_asppl_cd_NE(info);
		else if (ne == columnDtl2_asppl_nm) doDtl2_asppl_nm_NE(info);
		else if (ne == columnDtl2_ap_dpt_cd) doDtl2_ap_dpt_cd_NE(info);
		else if (ne == columnDtl2_ap_dpt_nm) doDtl2_ap_dpt_nm_NE(info);
		else if (ne == columnDtl2_wg_cd) doDtl2_wg_cd_NE(info);
		else if (ne == columnDtl2_wg_nm) doDtl2_wg_nm_NE(info);
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
	 * [Cnd]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sign_rvrs_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sign_rvrs_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_dpt_nm_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_iv_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_iv_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[row_num]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_row_num_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[slip_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_slip_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[slip_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_slip_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ap_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ap_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ap_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ap_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_d_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_d_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rcpt_iv_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcpt_iv_mng_no_NE(MCEventInfo info){
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
	 * [Dtl1]パネルの[interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[outsrc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_outsrc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[repurc_obli_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_repurc_obli_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_purc_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_purc_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[asppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_asppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[asppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_asppl_nm_NE(MCEventInfo info){
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
	 * [Dtl1]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_wg_nm_NE(MCEventInfo info){
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
	 * [Dtl1]パネルの[purc_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_d_no_NE(MCEventInfo info){
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
	 * [Dtl2]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[slip_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_slip_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[slip_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_slip_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_d_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_d_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcpt_iv_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcpt_iv_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_sttl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_sttl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_sttl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_sttl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_sttl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_sttl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_sttl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_sttl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[adv_pay_ap_sttl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_adv_pay_ap_sttl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[adv_pay_ap_sttl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_adv_pay_ap_sttl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[adv_pay_ap_sttl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_adv_pay_ap_sttl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[adv_pay_ap_sttl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_adv_pay_ap_sttl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[asppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_asppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[asppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_asppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_wg_nm_NE(MCEventInfo info){
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
		else if (nx == Cnd_ac_ym) doCnd_ac_ym_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
		else if (nx == Cnd_ap_typ) doCnd_ap_typ_NX(info);
		else if (nx == Cnd_ap_typ_nm) doCnd_ap_typ_nm_NX(info);
		else if (nx == Cnd_asppl_cd) doCnd_asppl_cd_NX(info);
		else if (nx == Cnd_asppl_nm) doCnd_asppl_nm_NX(info);
		else if (nx == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NX(info);
		else if (nx == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NX(info);
		else if (nx == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_NX(info);
		else if (nx == Cnd_purc_act_no) doCnd_purc_act_no_NX(info);
		else if (nx == Cnd_sign_rvrs_flg) doCnd_sign_rvrs_flg_NX(info);
		else if (nx == Hdr_ac_ym) doHdr_ac_ym_NX(info);
		else if (nx == Hdr_trd_cur_cd) doHdr_trd_cur_cd_NX(info);
		else if (nx == Hdr_trd_cur_nm) doHdr_trd_cur_nm_NX(info);
		else if (nx == Hdr_ap_typ) doHdr_ap_typ_NX(info);
		else if (nx == Hdr_ap_typ_nm) doHdr_ap_typ_nm_NX(info);
		else if (nx == Hdr_asppl_cd) doHdr_asppl_cd_NX(info);
		else if (nx == Hdr_asppl_nm) doHdr_asppl_nm_NX(info);
		else if (nx == Hdr_ap_dpt_cd) doHdr_ap_dpt_cd_NX(info);
		else if (nx == Hdr_ap_dpt_nm) doHdr_ap_dpt_nm_NX(info);
		else if (nx == Hdr_wg_cd) doHdr_wg_cd_NX(info);
		else if (nx == Hdr_wg_nm) doHdr_wg_nm_NX(info);
		else if (nx == Hdr_rcpt_iv_no) doHdr_rcpt_iv_no_NX(info);
		else if (nx == Hdr_rcpt_iv_mng_no) doHdr_rcpt_iv_mng_no_NX(info);
		else if (nx == Hdr_purc_act_no) doHdr_purc_act_no_NX(info);
		else if (nx == Hdr_cur_cd) doHdr_cur_cd_NX(info);
		else if (nx == Hdr_amt_dec_place) doHdr_amt_dec_place_NX(info);
		else if (nx == Hdr_upri_dec_place) doHdr_upri_dec_place_NX(info);
		else if (nx == Hdr_base_cur_cd) doHdr_base_cur_cd_NX(info);
		else if (nx == Hdr_base_cur_nm) doHdr_base_cur_nm_NX(info);
		else if (nx == columnDtl1_row_num) doDtl1_row_num_NX(info);
		else if (nx == columnDtl1_ac_dt) doDtl1_ac_dt_NX(info);
		else if (nx == columnDtl1_slip_sts_typ) doDtl1_slip_sts_typ_NX(info);
		else if (nx == columnDtl1_slip_sts_typ_nm) doDtl1_slip_sts_typ_nm_NX(info);
		else if (nx == columnDtl1_trd_cd) doDtl1_trd_cd_NX(info);
		else if (nx == columnDtl1_trd_nm) doDtl1_trd_nm_NX(info);
		else if (nx == columnDtl1_ap_typ) doDtl1_ap_typ_NX(info);
		else if (nx == columnDtl1_ap_typ_nm) doDtl1_ap_typ_nm_NX(info);
		else if (nx == columnDtl1_act_no) doDtl1_act_no_NX(info);
		else if (nx == columnDtl1_act_rev) doDtl1_act_rev_NX(info);
		else if (nx == columnDtl1_act_seq) doDtl1_act_seq_NX(info);
		else if (nx == columnDtl1_act_d_no) doDtl1_act_d_no_NX(info);
		else if (nx == columnDtl1_act_d_seq) doDtl1_act_d_seq_NX(info);
		else if (nx == columnDtl1_rcpt_iv_no) doDtl1_rcpt_iv_no_NX(info);
		else if (nx == columnDtl1_rcpt_iv_mng_no) doDtl1_rcpt_iv_mng_no_NX(info);
		else if (nx == columnDtl1_trd_unit_cd) doDtl1_trd_unit_cd_NX(info);
		else if (nx == columnDtl1_trd_unit_nm) doDtl1_trd_unit_nm_NX(info);
		else if (nx == columnDtl1_trd_unit_dec_place) doDtl1_trd_unit_dec_place_NX(info);
		else if (nx == columnDtl1_base_unit_cd) doDtl1_base_unit_cd_NX(info);
		else if (nx == columnDtl1_base_unit_nm) doDtl1_base_unit_nm_NX(info);
		else if (nx == columnDtl1_base_unit_dec_place) doDtl1_base_unit_dec_place_NX(info);
		else if (nx == columnDtl1_interim_flg) doDtl1_interim_flg_NX(info);
		else if (nx == columnDtl1_tax_cd) doDtl1_tax_cd_NX(info);
		else if (nx == columnDtl1_tax_nm) doDtl1_tax_nm_NX(info);
		else if (nx == columnDtl1_tax_rate) doDtl1_tax_rate_NX(info);
		else if (nx == columnDtl1_outsrc_flg) doDtl1_outsrc_flg_NX(info);
		else if (nx == columnDtl1_repurc_obli_flg) doDtl1_repurc_obli_flg_NX(info);
		else if (nx == columnDtl1_base_purc_ac_dt) doDtl1_base_purc_ac_dt_NX(info);
		else if (nx == columnDtl1_asppl_cd) doDtl1_asppl_cd_NX(info);
		else if (nx == columnDtl1_asppl_nm) doDtl1_asppl_nm_NX(info);
		else if (nx == columnDtl1_ap_dpt_cd) doDtl1_ap_dpt_cd_NX(info);
		else if (nx == columnDtl1_ap_dpt_nm) doDtl1_ap_dpt_nm_NX(info);
		else if (nx == columnDtl1_wg_cd) doDtl1_wg_cd_NX(info);
		else if (nx == columnDtl1_wg_nm) doDtl1_wg_nm_NX(info);
		else if (nx == columnDtl1_sppl_cd) doDtl1_sppl_cd_NX(info);
		else if (nx == columnDtl1_sppl_nm) doDtl1_sppl_nm_NX(info);
		else if (nx == columnDtl1_purc_dpt_cd) doDtl1_purc_dpt_cd_NX(info);
		else if (nx == columnDtl1_purc_dpt_nm) doDtl1_purc_dpt_nm_NX(info);
		else if (nx == columnDtl1_purc_usr_cd) doDtl1_purc_usr_cd_NX(info);
		else if (nx == columnDtl1_purc_usr_nm) doDtl1_purc_usr_nm_NX(info);
		else if (nx == columnDtl1_po_no) doDtl1_po_no_NX(info);
		else if (nx == columnDtl1_po_d_no) doDtl1_po_d_no_NX(info);
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
		else if (nx == columnDtl2_ac_dt) doDtl2_ac_dt_NX(info);
		else if (nx == columnDtl2_slip_sts_typ) doDtl2_slip_sts_typ_NX(info);
		else if (nx == columnDtl2_slip_sts_typ_nm) doDtl2_slip_sts_typ_nm_NX(info);
		else if (nx == columnDtl2_act_no) doDtl2_act_no_NX(info);
		else if (nx == columnDtl2_act_rev) doDtl2_act_rev_NX(info);
		else if (nx == columnDtl2_act_seq) doDtl2_act_seq_NX(info);
		else if (nx == columnDtl2_act_d_no) doDtl2_act_d_no_NX(info);
		else if (nx == columnDtl2_act_d_seq) doDtl2_act_d_seq_NX(info);
		else if (nx == columnDtl2_ap_typ) doDtl2_ap_typ_NX(info);
		else if (nx == columnDtl2_ap_typ_nm) doDtl2_ap_typ_nm_NX(info);
		else if (nx == columnDtl2_purc_act_no) doDtl2_purc_act_no_NX(info);
		else if (nx == columnDtl2_rcpt_iv_no) doDtl2_rcpt_iv_no_NX(info);
		else if (nx == columnDtl2_rcpt_iv_mng_no) doDtl2_rcpt_iv_mng_no_NX(info);
		else if (nx == columnDtl2_ap_sttl_cd) doDtl2_ap_sttl_cd_NX(info);
		else if (nx == columnDtl2_ap_sttl_nm) doDtl2_ap_sttl_nm_NX(info);
		else if (nx == columnDtl2_ap_sttl_typ) doDtl2_ap_sttl_typ_NX(info);
		else if (nx == columnDtl2_ap_sttl_typ_nm) doDtl2_ap_sttl_typ_nm_NX(info);
		else if (nx == columnDtl2_adv_pay_ap_sttl_cd) doDtl2_adv_pay_ap_sttl_cd_NX(info);
		else if (nx == columnDtl2_adv_pay_ap_sttl_nm) doDtl2_adv_pay_ap_sttl_nm_NX(info);
		else if (nx == columnDtl2_adv_pay_ap_sttl_typ) doDtl2_adv_pay_ap_sttl_typ_NX(info);
		else if (nx == columnDtl2_adv_pay_ap_sttl_typ_nm) doDtl2_adv_pay_ap_sttl_typ_nm_NX(info);
		else if (nx == columnDtl2_asppl_cd) doDtl2_asppl_cd_NX(info);
		else if (nx == columnDtl2_asppl_nm) doDtl2_asppl_nm_NX(info);
		else if (nx == columnDtl2_ap_dpt_cd) doDtl2_ap_dpt_cd_NX(info);
		else if (nx == columnDtl2_ap_dpt_nm) doDtl2_ap_dpt_nm_NX(info);
		else if (nx == columnDtl2_wg_cd) doDtl2_wg_cd_NX(info);
		else if (nx == columnDtl2_wg_nm) doDtl2_wg_nm_NX(info);
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
	 * [Cnd]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sign_rvrs_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sign_rvrs_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_dpt_nm_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_iv_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_iv_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[row_num]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_row_num_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[slip_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_slip_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[slip_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_slip_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ap_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ap_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ap_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ap_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_d_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_d_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rcpt_iv_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcpt_iv_mng_no_NX(MCEventInfo info){
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
	 * [Dtl1]パネルの[interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[outsrc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_outsrc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[repurc_obli_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_repurc_obli_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_purc_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_purc_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[asppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_asppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[asppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_asppl_nm_NX(MCEventInfo info){
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
	 * [Dtl1]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_wg_nm_NX(MCEventInfo info){
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
	 * [Dtl1]パネルの[purc_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_d_no_NX(MCEventInfo info){
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
	 * [Dtl2]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[slip_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_slip_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[slip_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_slip_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_d_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_d_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcpt_iv_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcpt_iv_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_sttl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_sttl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_sttl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_sttl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_sttl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_sttl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_sttl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_sttl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[adv_pay_ap_sttl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_adv_pay_ap_sttl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[adv_pay_ap_sttl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_adv_pay_ap_sttl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[adv_pay_ap_sttl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_adv_pay_ap_sttl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[adv_pay_ap_sttl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_adv_pay_ap_sttl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[asppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_asppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[asppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_asppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_wg_nm_NX(MCEventInfo info){
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
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_ac_ym) doCnd_ac_ym_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
		else if (lc == Cnd_ap_typ) doCnd_ap_typ_LC(info);
		else if (lc == Cnd_ap_typ_nm) doCnd_ap_typ_nm_LC(info);
		else if (lc == Cnd_asppl_cd) doCnd_asppl_cd_LC(info);
		else if (lc == Cnd_asppl_nm) doCnd_asppl_nm_LC(info);
		else if (lc == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_LC(info);
		else if (lc == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_LC(info);
		else if (lc == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_LC(info);
		else if (lc == Cnd_purc_act_no) doCnd_purc_act_no_LC(info);
		else if (lc == Hdr_ac_ym) doHdr_ac_ym_LC(info);
		else if (lc == Hdr_trd_cur_cd) doHdr_trd_cur_cd_LC(info);
		else if (lc == Hdr_trd_cur_nm) doHdr_trd_cur_nm_LC(info);
		else if (lc == Hdr_ap_typ) doHdr_ap_typ_LC(info);
		else if (lc == Hdr_ap_typ_nm) doHdr_ap_typ_nm_LC(info);
		else if (lc == Hdr_asppl_cd) doHdr_asppl_cd_LC(info);
		else if (lc == Hdr_asppl_nm) doHdr_asppl_nm_LC(info);
		else if (lc == Hdr_ap_dpt_cd) doHdr_ap_dpt_cd_LC(info);
		else if (lc == Hdr_ap_dpt_nm) doHdr_ap_dpt_nm_LC(info);
		else if (lc == Hdr_wg_cd) doHdr_wg_cd_LC(info);
		else if (lc == Hdr_wg_nm) doHdr_wg_nm_LC(info);
		else if (lc == Hdr_rcpt_iv_no) doHdr_rcpt_iv_no_LC(info);
		else if (lc == Hdr_rcpt_iv_mng_no) doHdr_rcpt_iv_mng_no_LC(info);
		else if (lc == Hdr_purc_act_no) doHdr_purc_act_no_LC(info);
		else if (lc == Hdr_cur_cd) doHdr_cur_cd_LC(info);
		else if (lc == Hdr_amt_dec_place) doHdr_amt_dec_place_LC(info);
		else if (lc == Hdr_upri_dec_place) doHdr_upri_dec_place_LC(info);
		else if (lc == Hdr_base_cur_cd) doHdr_base_cur_cd_LC(info);
		else if (lc == Hdr_base_cur_nm) doHdr_base_cur_nm_LC(info);
		else if (lc == columnDtl1_row_num) doDtl1_row_num_LC(info);
		else if (lc == columnDtl1_ac_dt) doDtl1_ac_dt_LC(info);
		else if (lc == columnDtl1_slip_sts_typ) doDtl1_slip_sts_typ_LC(info);
		else if (lc == columnDtl1_slip_sts_typ_nm) doDtl1_slip_sts_typ_nm_LC(info);
		else if (lc == columnDtl1_trd_cd) doDtl1_trd_cd_LC(info);
		else if (lc == columnDtl1_trd_nm) doDtl1_trd_nm_LC(info);
		else if (lc == columnDtl1_ap_typ) doDtl1_ap_typ_LC(info);
		else if (lc == columnDtl1_ap_typ_nm) doDtl1_ap_typ_nm_LC(info);
		else if (lc == columnDtl1_act_no) doDtl1_act_no_LC(info);
		else if (lc == columnDtl1_act_rev) doDtl1_act_rev_LC(info);
		else if (lc == columnDtl1_act_seq) doDtl1_act_seq_LC(info);
		else if (lc == columnDtl1_act_d_no) doDtl1_act_d_no_LC(info);
		else if (lc == columnDtl1_act_d_seq) doDtl1_act_d_seq_LC(info);
		else if (lc == columnDtl1_rcpt_iv_no) doDtl1_rcpt_iv_no_LC(info);
		else if (lc == columnDtl1_rcpt_iv_mng_no) doDtl1_rcpt_iv_mng_no_LC(info);
		else if (lc == columnDtl1_trd_unit_cd) doDtl1_trd_unit_cd_LC(info);
		else if (lc == columnDtl1_trd_unit_nm) doDtl1_trd_unit_nm_LC(info);
		else if (lc == columnDtl1_trd_unit_dec_place) doDtl1_trd_unit_dec_place_LC(info);
		else if (lc == columnDtl1_base_unit_cd) doDtl1_base_unit_cd_LC(info);
		else if (lc == columnDtl1_base_unit_nm) doDtl1_base_unit_nm_LC(info);
		else if (lc == columnDtl1_base_unit_dec_place) doDtl1_base_unit_dec_place_LC(info);
		else if (lc == columnDtl1_tax_cd) doDtl1_tax_cd_LC(info);
		else if (lc == columnDtl1_tax_nm) doDtl1_tax_nm_LC(info);
		else if (lc == columnDtl1_tax_rate) doDtl1_tax_rate_LC(info);
		else if (lc == columnDtl1_base_purc_ac_dt) doDtl1_base_purc_ac_dt_LC(info);
		else if (lc == columnDtl1_asppl_cd) doDtl1_asppl_cd_LC(info);
		else if (lc == columnDtl1_asppl_nm) doDtl1_asppl_nm_LC(info);
		else if (lc == columnDtl1_ap_dpt_cd) doDtl1_ap_dpt_cd_LC(info);
		else if (lc == columnDtl1_ap_dpt_nm) doDtl1_ap_dpt_nm_LC(info);
		else if (lc == columnDtl1_wg_cd) doDtl1_wg_cd_LC(info);
		else if (lc == columnDtl1_wg_nm) doDtl1_wg_nm_LC(info);
		else if (lc == columnDtl1_sppl_cd) doDtl1_sppl_cd_LC(info);
		else if (lc == columnDtl1_sppl_nm) doDtl1_sppl_nm_LC(info);
		else if (lc == columnDtl1_purc_dpt_cd) doDtl1_purc_dpt_cd_LC(info);
		else if (lc == columnDtl1_purc_dpt_nm) doDtl1_purc_dpt_nm_LC(info);
		else if (lc == columnDtl1_purc_usr_cd) doDtl1_purc_usr_cd_LC(info);
		else if (lc == columnDtl1_purc_usr_nm) doDtl1_purc_usr_nm_LC(info);
		else if (lc == columnDtl1_po_no) doDtl1_po_no_LC(info);
		else if (lc == columnDtl1_po_d_no) doDtl1_po_d_no_LC(info);
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
		else if (lc == columnDtl2_ac_dt) doDtl2_ac_dt_LC(info);
		else if (lc == columnDtl2_slip_sts_typ) doDtl2_slip_sts_typ_LC(info);
		else if (lc == columnDtl2_slip_sts_typ_nm) doDtl2_slip_sts_typ_nm_LC(info);
		else if (lc == columnDtl2_act_no) doDtl2_act_no_LC(info);
		else if (lc == columnDtl2_act_rev) doDtl2_act_rev_LC(info);
		else if (lc == columnDtl2_act_seq) doDtl2_act_seq_LC(info);
		else if (lc == columnDtl2_act_d_no) doDtl2_act_d_no_LC(info);
		else if (lc == columnDtl2_act_d_seq) doDtl2_act_d_seq_LC(info);
		else if (lc == columnDtl2_ap_typ) doDtl2_ap_typ_LC(info);
		else if (lc == columnDtl2_ap_typ_nm) doDtl2_ap_typ_nm_LC(info);
		else if (lc == columnDtl2_purc_act_no) doDtl2_purc_act_no_LC(info);
		else if (lc == columnDtl2_rcpt_iv_no) doDtl2_rcpt_iv_no_LC(info);
		else if (lc == columnDtl2_rcpt_iv_mng_no) doDtl2_rcpt_iv_mng_no_LC(info);
		else if (lc == columnDtl2_ap_sttl_cd) doDtl2_ap_sttl_cd_LC(info);
		else if (lc == columnDtl2_ap_sttl_nm) doDtl2_ap_sttl_nm_LC(info);
		else if (lc == columnDtl2_ap_sttl_typ) doDtl2_ap_sttl_typ_LC(info);
		else if (lc == columnDtl2_ap_sttl_typ_nm) doDtl2_ap_sttl_typ_nm_LC(info);
		else if (lc == columnDtl2_adv_pay_ap_sttl_cd) doDtl2_adv_pay_ap_sttl_cd_LC(info);
		else if (lc == columnDtl2_adv_pay_ap_sttl_nm) doDtl2_adv_pay_ap_sttl_nm_LC(info);
		else if (lc == columnDtl2_adv_pay_ap_sttl_typ) doDtl2_adv_pay_ap_sttl_typ_LC(info);
		else if (lc == columnDtl2_adv_pay_ap_sttl_typ_nm) doDtl2_adv_pay_ap_sttl_typ_nm_LC(info);
		else if (lc == columnDtl2_asppl_cd) doDtl2_asppl_cd_LC(info);
		else if (lc == columnDtl2_asppl_nm) doDtl2_asppl_nm_LC(info);
		else if (lc == columnDtl2_ap_dpt_cd) doDtl2_ap_dpt_cd_LC(info);
		else if (lc == columnDtl2_ap_dpt_nm) doDtl2_ap_dpt_nm_LC(info);
		else if (lc == columnDtl2_wg_cd) doDtl2_wg_cd_LC(info);
		else if (lc == columnDtl2_wg_nm) doDtl2_wg_nm_LC(info);
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
	}

	/**
	 * [Cnd]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_dpt_nm_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcpt_iv_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcpt_iv_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[base_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_base_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[row_num]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_row_num_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[slip_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_slip_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[slip_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_slip_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ap_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ap_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[ap_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_ap_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[act_d_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_act_d_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[rcpt_iv_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_rcpt_iv_mng_no_LC(MCEventInfo info){
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
	 * [Dtl1]パネルの[tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_tax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[base_purc_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_base_purc_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[asppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_asppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[asppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_asppl_nm_LC(MCEventInfo info){
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
	 * [Dtl1]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_wg_nm_LC(MCEventInfo info){
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
	 * [Dtl1]パネルの[purc_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[purc_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_purc_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl1]パネルの[po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl1_po_d_no_LC(MCEventInfo info){
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
	 * [Dtl2]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[slip_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_slip_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[slip_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_slip_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[act_d_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_act_d_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[purc_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_purc_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[rcpt_iv_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_rcpt_iv_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_sttl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_sttl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_sttl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_sttl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_sttl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_sttl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_sttl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_sttl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[adv_pay_ap_sttl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_adv_pay_ap_sttl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[adv_pay_ap_sttl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_adv_pay_ap_sttl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[adv_pay_ap_sttl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_adv_pay_ap_sttl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[adv_pay_ap_sttl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_adv_pay_ap_sttl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[asppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_asppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[asppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_asppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[ap_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_ap_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_wg_nm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_trd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ap_typ]の作成メソッド
	 */
	public MCList getCnd_ap_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getApTyp(row, info);
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

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBHL0120.Srch01")) {
			return new MS_MSBHL0120_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBHL0120_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0120_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0120_Srch01;

		/** コンストラクタ */
		protected MS_MSBHL0120_Srch01Bridge() {
			p_MS_MSBHL0120_Srch01 = new MCParam(PDef.MS_MSBHL0120_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0120_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBH.MSBHP0120.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBH.MSBHP0120.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0120.Dtl2R.class));

			p_MS_MSBHL0120_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0120_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0120_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0120_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0120_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBH.MSBHP0120.CndR up0() {
			return (mcframe.clientMSBH.MSBHP0120.CndR)up(0);
		}

		protected mcframe.clientMSBH.MSBHP0120.HdrR down0() {
			return (mcframe.clientMSBH.MSBHP0120.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBH.MSBHP0120.Dtl1R> down1() {
			return (MCList<mcframe.clientMSBH.MSBHP0120.Dtl1R>)down(1);
		}
		protected MCList<mcframe.clientMSBH.MSBHP0120.Dtl2R> down2() {
			return (MCList<mcframe.clientMSBH.MSBHP0120.Dtl2R>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBHL0120_Srch01.addDownBlock(mcframe.clientMSBH.MSBHP0120.HdrR.create());
			p_MS_MSBHL0120_Srch01.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0120.Dtl1R.class));
			p_MS_MSBHL0120_Srch01.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0120.Dtl2R.class));
		}
		protected MCParam param() {
			return p_MS_MSBHL0120_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBH.MSBHP0120.HdrR)p_MS_MSBHL0120_Srch01.getContainerParam().getDownBlock(0));
			setDtl1L((MCList<mcframe.clientMSBH.MSBHP0120.Dtl1R>)p_MS_MSBHL0120_Srch01.getContainerParam().getDownBlock(1));
			setDtl2L((MCList<mcframe.clientMSBH.MSBHP0120.Dtl2R>)p_MS_MSBHL0120_Srch01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdrR().clear();
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
			result.add(getHdrR());
			result.add(getDtl1L());
			result.add(getDtl2L());
			return result;
		}
	}
}