package mcframe.clientMSBH.MSBHP0110;

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
import mcframe.clientMSBH.MSBHP0110.MSBHP_MlyApBalSrch_MC.MS_MSBHL0110_Srch01Caller;

/**
 * 画面"MSBHP_MlyApBalSrch"パネルクラスです。<p>
 *
 * 月次の買掛金残高を照会する<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHP_MlyApBalSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBHP0110";

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
	// [AspplCnd]ブロック関連のField定義
	public MCPanel AspplCndPanel = null;
	// [AspplCnd]ブロックの項目のField定義
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [Ap]ブロック関連のField定義
	public MCPanel ApPanel = null;
	public MCTitledBorder ApTitledBorder = null;
	// [Ap]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * AP amount 買掛金.<p>
	 *
	 */
	public MCCheckBox Cnd_ap_typ_ap = null;
	/**
	 * Other accounts payable amount 未払金.<p>
	 *
	 */
	public MCCheckBox Cnd_ap_typ_ac = null;
	/**
	 * Temporary AP 暫定買掛.<p>
	 *
	 */
	public MCCheckBox Cnd_ap_typ_temp_ap = null;
	public MCLabel Cnd_ac_ym_fr_Label = null;
	/**
	 * Recording month FROM 計上年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_ac_ym_fr = null;
	public MCLabel Cnd_ac_ym_to_Label = null;
	/**
	 * Recording month TO 計上年月ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_ac_ym_to = null;
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
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Cnd_wrk_no_p_PPanel;
	public MCTextField Cnd_wrk_no;	// [Cnd]の[wrk_no_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[wrk_no_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public MCCheckBox Cnd_ap_dpt_flg = null;
	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public MCCheckBox Cnd_wg_flg = null;
	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public MCCheckBox Cnd_asppl_flg = null;
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_rcpt_iv_no_flg = null;
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_rcpt_iv_mng_no_flg = null;
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_purc_act_no_flg = null;
	/**
	 * Currency 通貨.<p>
	 *
	 */
	public MCCheckBox Cnd_trd_cur_flg = null;
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCCheckBox Cnd_wrk_no_flg = null;
	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public MCCheckBox Cnd_ap_typ_flg = null;
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Cnd_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Cnd_deselect_all = null;
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
	public MCTable2<mcframe.clientMSBH.MSBHP0110.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_ym = null;
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
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asppl_cd = null;
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asppl_nm = null;
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_iv_no = null;
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcpt_iv_mng_no = null;
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_act_no = null;
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
	public MCColumnConfig columnRslt_trd_cur_amt_dec_place = null;
	public mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D Rslt_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	/**
	 * AP type 債務区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_typ = null;
	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_init_bal_p_PPanel;
	public MCColumnConfig columnRslt_init_bal;// [Rslt]の[init_bal_p.amt]を[columnRslt_init_bal]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_purc_amt_p_PPanel;
	public MCColumnConfig columnRslt_purc_amt;// [Rslt]の[purc_amt_p.amt]を[columnRslt_purc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ret_amt_p_PPanel;
	public MCColumnConfig columnRslt_ret_amt;// [Rslt]の[ret_amt_p.amt]を[columnRslt_ret_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_dscnt_amt_p_PPanel;
	public MCColumnConfig columnRslt_dscnt_amt;// [Rslt]の[dscnt_amt_p.amt]を[columnRslt_dscnt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_sw_to_amt_p_PPanel;
	public MCColumnConfig columnRslt_sw_to_amt;// [Rslt]の[sw_to_amt_p.amt]を[columnRslt_sw_to_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_tax_amt;// [Rslt]の[tax_amt_p.amt]を[columnRslt_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_cash_amt_p_PPanel;
	public MCColumnConfig columnRslt_cash_amt;// [Rslt]の[cash_amt_p.amt]を[columnRslt_cash_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_note_amt_p_PPanel;
	public MCColumnConfig columnRslt_note_amt;// [Rslt]の[note_amt_p.amt]を[columnRslt_note_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_account_amt_p_PPanel;
	public MCColumnConfig columnRslt_account_amt;// [Rslt]の[account_amt_p.amt]を[columnRslt_account_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_setoff_amt_p_PPanel;
	public MCColumnConfig columnRslt_setoff_amt;// [Rslt]の[setoff_amt_p.amt]を[columnRslt_setoff_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_sw_amt_p_PPanel;
	public MCColumnConfig columnRslt_sw_amt;// [Rslt]の[sw_amt_p.amt]を[columnRslt_sw_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_end_bal_p_PPanel;
	public MCColumnConfig columnRslt_end_bal;// [Rslt]の[end_bal_p.amt]を[columnRslt_end_bal]としてエイリアス定義。
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
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_amt_dec_place = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_init_bal_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_init_bal;// [Rslt]の[base_cur_init_bal_p.amt]を[columnRslt_base_cur_init_bal]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_purc_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_purc_amt;// [Rslt]の[base_cur_purc_amt_p.amt]を[columnRslt_base_cur_purc_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_ret_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_ret_amt;// [Rslt]の[base_cur_ret_amt_p.amt]を[columnRslt_base_cur_ret_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_dscnt_amt;// [Rslt]の[base_cur_dscnt_amt_p.amt]を[columnRslt_base_cur_dscnt_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_sw_to_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_sw_to_amt;// [Rslt]の[base_cur_sw_to_amt_p.amt]を[columnRslt_base_cur_sw_to_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_tax_amt;// [Rslt]の[base_cur_tax_amt_p.amt]を[columnRslt_base_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_cash_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_cash_amt;// [Rslt]の[base_cur_cash_amt_p.amt]を[columnRslt_base_cur_cash_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_note_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_note_amt;// [Rslt]の[base_cur_note_amt_p.amt]を[columnRslt_base_cur_note_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_account_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_account_amt;// [Rslt]の[base_cur_account_amt_p.amt]を[columnRslt_base_cur_account_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_setoff_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_setoff_amt;// [Rslt]の[base_cur_setoff_amt_p.amt]を[columnRslt_base_cur_setoff_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_sw_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_sw_amt;// [Rslt]の[base_cur_sw_amt_p.amt]を[columnRslt_base_cur_sw_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_end_bal_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_end_bal;// [Rslt]の[base_cur_end_bal_p.amt]を[columnRslt_base_cur_end_bal]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_exc_gain_loss_p_PPanel;
	public MCColumnConfig columnRslt_exc_gain_loss;// [Rslt]の[exc_gain_loss_p.amt]を[columnRslt_exc_gain_loss]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_total_exc_gain_loss_p_PPanel;
	public MCColumnConfig columnRslt_total_exc_gain_loss;// [Rslt]の[total_exc_gain_loss_p.amt]を[columnRslt_total_exc_gain_loss]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_asppl_grp_p_PPanel;
	public MCColumnConfig columnRslt_asppl_grp_cd1;// [Rslt]の[asppl_grp_p.bp_grp_cd1]を[columnRslt_asppl_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_nm1;// [Rslt]の[asppl_grp_p.bp_grp_nm1]を[columnRslt_asppl_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_cd2;// [Rslt]の[asppl_grp_p.bp_grp_cd2]を[columnRslt_asppl_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_nm2;// [Rslt]の[asppl_grp_p.bp_grp_nm2]を[columnRslt_asppl_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_cd3;// [Rslt]の[asppl_grp_p.bp_grp_cd3]を[columnRslt_asppl_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_nm3;// [Rslt]の[asppl_grp_p.bp_grp_nm3]を[columnRslt_asppl_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_cd4;// [Rslt]の[asppl_grp_p.bp_grp_cd4]を[columnRslt_asppl_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_nm4;// [Rslt]の[asppl_grp_p.bp_grp_nm4]を[columnRslt_asppl_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_cd5;// [Rslt]の[asppl_grp_p.bp_grp_cd5]を[columnRslt_asppl_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_nm5;// [Rslt]の[asppl_grp_p.bp_grp_nm5]を[columnRslt_asppl_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_cd6;// [Rslt]の[asppl_grp_p.bp_grp_cd6]を[columnRslt_asppl_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_nm6;// [Rslt]の[asppl_grp_p.bp_grp_nm6]を[columnRslt_asppl_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_cd7;// [Rslt]の[asppl_grp_p.bp_grp_cd7]を[columnRslt_asppl_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_nm7;// [Rslt]の[asppl_grp_p.bp_grp_nm7]を[columnRslt_asppl_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_cd8;// [Rslt]の[asppl_grp_p.bp_grp_cd8]を[columnRslt_asppl_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_nm8;// [Rslt]の[asppl_grp_p.bp_grp_nm8]を[columnRslt_asppl_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_cd9;// [Rslt]の[asppl_grp_p.bp_grp_cd9]を[columnRslt_asppl_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_nm9;// [Rslt]の[asppl_grp_p.bp_grp_nm9]を[columnRslt_asppl_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_cd10;// [Rslt]の[asppl_grp_p.bp_grp_cd10]を[columnRslt_asppl_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_asppl_grp_nm10;// [Rslt]の[asppl_grp_p.bp_grp_nm10]を[columnRslt_asppl_grp_nm10]としてエイリアス定義。
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
	 * AP subsidiary leger 買掛元帳照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBHP0120 = null;
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
	
	/** [MS_MSBHL0110_Srch01]のCallerの作成 */
	protected MSBHP_MlyApBalSrch_MC.MS_MSBHL0110_Srch01Caller createMS_MSBHL0110_Srch01() {
		MSBHP_MlyApBalSrch_MC.MS_MSBHL0110_Srch01Caller<MSBHP_MlyApBalSrch, MS_MSBHL0110_Srch01Bridge>
		caller = ((MSBHP_MlyApBalSrch_MC)this).new MS_MSBHL0110_Srch01Caller<MSBHP_MlyApBalSrch, MS_MSBHL0110_Srch01Bridge>(
					(MSBHP_MlyApBalSrch)this, new MS_MSBHL0110_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBHL0110_Srch01]の呼び出し */
	protected void callMS_MSBHL0110_Srch01() {
		MCCaller caller = createMS_MSBHL0110_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0110.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBH.MSBHP0110.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBH.MSBHP0110.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBH.MSBHP0110.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBH.MSBHP0110.CndR createCndR() {
		return mcframe.clientMSBH.MSBHP0110.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBH.MSBHP0110.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0110.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBH.MSBHP0110.RsltR createRsltR() {
		return mcframe.clientMSBH.MSBHP0110.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0110.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBH.MSBHP0110.RsltR.class);
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
		ret.add(AspplCndPanel);
		ret.add(Tab3Panel);
		ret.add(Cnd2Panel);
		ret.add(ApPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBHP_MlyApBalSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBHP_MlyApBalSrch_MC_A(String name) {
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
		MSBHP_MlyApBalSrch_MC.jbCreateTop((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbCreateFold((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbCreateTab1((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbCreateTab2((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbCreateAspplCnd((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbCreateTab3((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbCreateCnd2((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbCreateAp((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbCreateCnd((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbCreateCtrl((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbCreateRPnl((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbCreateRslt((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbCreateBtn((MSBHP_MlyApBalSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBHP_MlyApBalSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBHP_MlyApBalSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBHP_MlyApBalSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBHP_MlyApBalSrch p) {
	}

	/**
	 * [AspplCnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAspplCnd(MSBHP_MlyApBalSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBHP_MlyApBalSrch p) {
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MSBHP_MlyApBalSrch p) {
	}

	/**
	 * [Ap]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAp(MSBHP_MlyApBalSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBHP_MlyApBalSrch p) {
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
	protected static void jbCreateCtrl(MSBHP_MlyApBalSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBHP_MlyApBalSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBHP_MlyApBalSrch p) {
		p.Rslt_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$wrk_no_p);
		p.Rslt_wrk_no_p_PPanel.setName("Rslt.wrk_no_p");
		p.columnRslt_wrk_no = p.Rslt_wrk_no_p_PPanel.columnWrkNo_wrk_no;
		p.columnRslt_wrk_no.addAliasName("Rslt.wrk_no", p);
		p.columnRslt_wrk_nm = p.Rslt_wrk_no_p_PPanel.columnWrkNo_wrk_nm;
		p.columnRslt_wrk_nm.addAliasName("Rslt.wrk_nm", p);
		p.Rslt_init_bal_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$init_bal_p);
		p.Rslt_init_bal_p_PPanel.setName("Rslt.init_bal_p");
		p.columnRslt_init_bal = p.Rslt_init_bal_p_PPanel.columnAmt_amt;
		p.columnRslt_init_bal.addAliasName("Rslt.init_bal", p);
		p.Rslt_purc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$purc_amt_p);
		p.Rslt_purc_amt_p_PPanel.setName("Rslt.purc_amt_p");
		p.columnRslt_purc_amt = p.Rslt_purc_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_purc_amt.addAliasName("Rslt.purc_amt", p);
		p.Rslt_ret_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$ret_amt_p);
		p.Rslt_ret_amt_p_PPanel.setName("Rslt.ret_amt_p");
		p.columnRslt_ret_amt = p.Rslt_ret_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ret_amt.addAliasName("Rslt.ret_amt", p);
		p.Rslt_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$dscnt_amt_p);
		p.Rslt_dscnt_amt_p_PPanel.setName("Rslt.dscnt_amt_p");
		p.columnRslt_dscnt_amt = p.Rslt_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_dscnt_amt.addAliasName("Rslt.dscnt_amt", p);
		p.Rslt_sw_to_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$sw_to_amt_p);
		p.Rslt_sw_to_amt_p_PPanel.setName("Rslt.sw_to_amt_p");
		p.columnRslt_sw_to_amt = p.Rslt_sw_to_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_sw_to_amt.addAliasName("Rslt.sw_to_amt", p);
		p.Rslt_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$tax_amt_p);
		p.Rslt_tax_amt_p_PPanel.setName("Rslt.tax_amt_p");
		p.columnRslt_tax_amt = p.Rslt_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_tax_amt.addAliasName("Rslt.tax_amt", p);
		p.Rslt_cash_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$cash_amt_p);
		p.Rslt_cash_amt_p_PPanel.setName("Rslt.cash_amt_p");
		p.columnRslt_cash_amt = p.Rslt_cash_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_cash_amt.addAliasName("Rslt.cash_amt", p);
		p.Rslt_note_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$note_amt_p);
		p.Rslt_note_amt_p_PPanel.setName("Rslt.note_amt_p");
		p.columnRslt_note_amt = p.Rslt_note_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_note_amt.addAliasName("Rslt.note_amt", p);
		p.Rslt_account_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$account_amt_p);
		p.Rslt_account_amt_p_PPanel.setName("Rslt.account_amt_p");
		p.columnRslt_account_amt = p.Rslt_account_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_account_amt.addAliasName("Rslt.account_amt", p);
		p.Rslt_setoff_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$setoff_amt_p);
		p.Rslt_setoff_amt_p_PPanel.setName("Rslt.setoff_amt_p");
		p.columnRslt_setoff_amt = p.Rslt_setoff_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_setoff_amt.addAliasName("Rslt.setoff_amt", p);
		p.Rslt_sw_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$sw_amt_p);
		p.Rslt_sw_amt_p_PPanel.setName("Rslt.sw_amt_p");
		p.columnRslt_sw_amt = p.Rslt_sw_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_sw_amt.addAliasName("Rslt.sw_amt", p);
		p.Rslt_end_bal_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$end_bal_p);
		p.Rslt_end_bal_p_PPanel.setName("Rslt.end_bal_p");
		p.columnRslt_end_bal = p.Rslt_end_bal_p_PPanel.columnAmt_amt;
		p.columnRslt_end_bal.addAliasName("Rslt.end_bal", p);
		p.Rslt_base_cur_init_bal_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$base_cur_init_bal_p);
		p.Rslt_base_cur_init_bal_p_PPanel.setName("Rslt.base_cur_init_bal_p");
		p.columnRslt_base_cur_init_bal = p.Rslt_base_cur_init_bal_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_init_bal.addAliasName("Rslt.base_cur_init_bal", p);
		p.Rslt_base_cur_purc_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$base_cur_purc_amt_p);
		p.Rslt_base_cur_purc_amt_p_PPanel.setName("Rslt.base_cur_purc_amt_p");
		p.columnRslt_base_cur_purc_amt = p.Rslt_base_cur_purc_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_purc_amt.addAliasName("Rslt.base_cur_purc_amt", p);
		p.Rslt_base_cur_ret_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$base_cur_ret_amt_p);
		p.Rslt_base_cur_ret_amt_p_PPanel.setName("Rslt.base_cur_ret_amt_p");
		p.columnRslt_base_cur_ret_amt = p.Rslt_base_cur_ret_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_ret_amt.addAliasName("Rslt.base_cur_ret_amt", p);
		p.Rslt_base_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$base_cur_dscnt_amt_p);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.setName("Rslt.base_cur_dscnt_amt_p");
		p.columnRslt_base_cur_dscnt_amt = p.Rslt_base_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_dscnt_amt.addAliasName("Rslt.base_cur_dscnt_amt", p);
		p.Rslt_base_cur_sw_to_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$base_cur_sw_to_amt_p);
		p.Rslt_base_cur_sw_to_amt_p_PPanel.setName("Rslt.base_cur_sw_to_amt_p");
		p.columnRslt_base_cur_sw_to_amt = p.Rslt_base_cur_sw_to_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_sw_to_amt.addAliasName("Rslt.base_cur_sw_to_amt", p);
		p.Rslt_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$base_cur_tax_amt_p);
		p.Rslt_base_cur_tax_amt_p_PPanel.setName("Rslt.base_cur_tax_amt_p");
		p.columnRslt_base_cur_tax_amt = p.Rslt_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_tax_amt.addAliasName("Rslt.base_cur_tax_amt", p);
		p.Rslt_base_cur_cash_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$base_cur_cash_amt_p);
		p.Rslt_base_cur_cash_amt_p_PPanel.setName("Rslt.base_cur_cash_amt_p");
		p.columnRslt_base_cur_cash_amt = p.Rslt_base_cur_cash_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_cash_amt.addAliasName("Rslt.base_cur_cash_amt", p);
		p.Rslt_base_cur_note_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$base_cur_note_amt_p);
		p.Rslt_base_cur_note_amt_p_PPanel.setName("Rslt.base_cur_note_amt_p");
		p.columnRslt_base_cur_note_amt = p.Rslt_base_cur_note_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_note_amt.addAliasName("Rslt.base_cur_note_amt", p);
		p.Rslt_base_cur_account_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$base_cur_account_amt_p);
		p.Rslt_base_cur_account_amt_p_PPanel.setName("Rslt.base_cur_account_amt_p");
		p.columnRslt_base_cur_account_amt = p.Rslt_base_cur_account_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_account_amt.addAliasName("Rslt.base_cur_account_amt", p);
		p.Rslt_base_cur_setoff_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$base_cur_setoff_amt_p);
		p.Rslt_base_cur_setoff_amt_p_PPanel.setName("Rslt.base_cur_setoff_amt_p");
		p.columnRslt_base_cur_setoff_amt = p.Rslt_base_cur_setoff_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_setoff_amt.addAliasName("Rslt.base_cur_setoff_amt", p);
		p.Rslt_base_cur_sw_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$base_cur_sw_amt_p);
		p.Rslt_base_cur_sw_amt_p_PPanel.setName("Rslt.base_cur_sw_amt_p");
		p.columnRslt_base_cur_sw_amt = p.Rslt_base_cur_sw_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_sw_amt.addAliasName("Rslt.base_cur_sw_amt", p);
		p.Rslt_base_cur_end_bal_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$base_cur_end_bal_p);
		p.Rslt_base_cur_end_bal_p_PPanel.setName("Rslt.base_cur_end_bal_p");
		p.columnRslt_base_cur_end_bal = p.Rslt_base_cur_end_bal_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_end_bal.addAliasName("Rslt.base_cur_end_bal", p);
		p.Rslt_exc_gain_loss_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$exc_gain_loss_p);
		p.Rslt_exc_gain_loss_p_PPanel.setName("Rslt.exc_gain_loss_p");
		p.columnRslt_exc_gain_loss = p.Rslt_exc_gain_loss_p_PPanel.columnAmt_amt;
		p.columnRslt_exc_gain_loss.addAliasName("Rslt.exc_gain_loss", p);
		p.Rslt_total_exc_gain_loss_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$total_exc_gain_loss_p);
		p.Rslt_total_exc_gain_loss_p_PPanel.setName("Rslt.total_exc_gain_loss_p");
		p.columnRslt_total_exc_gain_loss = p.Rslt_total_exc_gain_loss_p_PPanel.columnAmt_amt;
		p.columnRslt_total_exc_gain_loss.addAliasName("Rslt.total_exc_gain_loss", p);
		p.Rslt_asppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBH.MSBHP0110.RsltR.$asppl_grp_p);
		p.Rslt_asppl_grp_p_PPanel.setName("Rslt.asppl_grp_p");
		p.columnRslt_asppl_grp_cd1 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_asppl_grp_cd1.addAliasName("Rslt.asppl_grp_cd1", p);
		p.columnRslt_asppl_grp_nm1 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_asppl_grp_nm1.addAliasName("Rslt.asppl_grp_nm1", p);
		p.columnRslt_asppl_grp_cd2 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_asppl_grp_cd2.addAliasName("Rslt.asppl_grp_cd2", p);
		p.columnRslt_asppl_grp_nm2 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_asppl_grp_nm2.addAliasName("Rslt.asppl_grp_nm2", p);
		p.columnRslt_asppl_grp_cd3 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_asppl_grp_cd3.addAliasName("Rslt.asppl_grp_cd3", p);
		p.columnRslt_asppl_grp_nm3 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_asppl_grp_nm3.addAliasName("Rslt.asppl_grp_nm3", p);
		p.columnRslt_asppl_grp_cd4 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_asppl_grp_cd4.addAliasName("Rslt.asppl_grp_cd4", p);
		p.columnRslt_asppl_grp_nm4 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_asppl_grp_nm4.addAliasName("Rslt.asppl_grp_nm4", p);
		p.columnRslt_asppl_grp_cd5 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_asppl_grp_cd5.addAliasName("Rslt.asppl_grp_cd5", p);
		p.columnRslt_asppl_grp_nm5 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_asppl_grp_nm5.addAliasName("Rslt.asppl_grp_nm5", p);
		p.columnRslt_asppl_grp_cd6 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_asppl_grp_cd6.addAliasName("Rslt.asppl_grp_cd6", p);
		p.columnRslt_asppl_grp_nm6 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_asppl_grp_nm6.addAliasName("Rslt.asppl_grp_nm6", p);
		p.columnRslt_asppl_grp_cd7 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_asppl_grp_cd7.addAliasName("Rslt.asppl_grp_cd7", p);
		p.columnRslt_asppl_grp_nm7 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_asppl_grp_nm7.addAliasName("Rslt.asppl_grp_nm7", p);
		p.columnRslt_asppl_grp_cd8 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_asppl_grp_cd8.addAliasName("Rslt.asppl_grp_cd8", p);
		p.columnRslt_asppl_grp_nm8 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_asppl_grp_nm8.addAliasName("Rslt.asppl_grp_nm8", p);
		p.columnRslt_asppl_grp_cd9 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_asppl_grp_cd9.addAliasName("Rslt.asppl_grp_cd9", p);
		p.columnRslt_asppl_grp_nm9 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_asppl_grp_nm9.addAliasName("Rslt.asppl_grp_nm9", p);
		p.columnRslt_asppl_grp_cd10 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_asppl_grp_cd10.addAliasName("Rslt.asppl_grp_cd10", p);
		p.columnRslt_asppl_grp_nm10 = p.Rslt_asppl_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_asppl_grp_nm10.addAliasName("Rslt.asppl_grp_nm10", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBHP_MlyApBalSrch p) {
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
	public static MSBHP_MlyApBalSrch create(){
		MSBHP_MlyApBalSrch p = new MSBHP_MlyApBalSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBHP_MlyApBalSrch create(String name){
		MSBHP_MlyApBalSrch p = new MSBHP_MlyApBalSrch(name);
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
		MSBHP_MlyApBalSrch_MC.jbfInitTop((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbfInitFold((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbfInitTab1((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbfInitTab2((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbfInitAspplCnd((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbfInitTab3((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbfInitCnd2((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbfInitAp((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbfInitCnd((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbfInitCtrl((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbfInitRPnl((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbfInitRslt((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbfInitBtn((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbInitTop((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbInitFold((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbInitTab1((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbInitTab2((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbInitAspplCnd((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbInitTab3((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbInitCnd2((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbInitAp((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbInitCnd((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbInitCtrl((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbInitRPnl((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbInitRslt((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.jbInitBtn((MSBHP_MlyApBalSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBHP_MlyApBalSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBHP_MlyApBalSrch p) {
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
	protected static void jbfInitTab1(MSBHP_MlyApBalSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBHP_MlyApBalSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [AspplCnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAspplCnd(MSBHP_MlyApBalSrch p) {
		// ブロック関連の初期化
		p.AspplCndPanel = p.beansFactory.createPanel("AspplCnd");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBHP_MlyApBalSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBHP_MlyApBalSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ap]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAp(MSBHP_MlyApBalSrch p) {
		// ブロック関連の初期化
		p.ApPanel = p.beansFactory.createPanel("Ap");
		p.ApTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBHP_MlyApBalSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ap_typ_ap = p.beansFactory.createCheckBox("Cnd.ap_typ_ap");
		p.Cnd_ap_typ_ac = p.beansFactory.createCheckBox("Cnd.ap_typ_ac");
		p.Cnd_ap_typ_temp_ap = p.beansFactory.createCheckBox("Cnd.ap_typ_temp_ap");
		p.Cnd_ac_ym_fr_Label = p.beansFactory.createLabel("Cnd.ac_ym_fr_Label");
		p.Cnd_ac_ym_fr = p.beansFactory.createDateField("Cnd.ac_ym_fr");
		p.Cnd_ac_ym_fr.setLabel(p.Cnd_ac_ym_fr_Label);
		p.Cnd_ac_ym_to_Label = p.beansFactory.createLabel("Cnd.ac_ym_to_Label");
		p.Cnd_ac_ym_to = p.beansFactory.createDateField("Cnd.ac_ym_to");
		p.Cnd_ac_ym_to.setLabel(p.Cnd_ac_ym_to_Label);
		p.Cnd_ap_dpt_cd_Label = p.beansFactory.createLabel("Cnd.ap_dpt_cd_Label");
		p.Cnd_ap_dpt_cd = p.beansFactory.createTextField("Cnd.ap_dpt_cd");
		p.Cnd_ap_dpt_cd.setLabel(p.Cnd_ap_dpt_cd_Label);
		p.Cnd_ap_dpt_nm = p.beansFactory.createTextField("Cnd.ap_dpt_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_asppl_cd_Label = p.beansFactory.createLabel("Cnd.asppl_cd_Label");
		p.Cnd_asppl_cd = p.beansFactory.createTextField("Cnd.asppl_cd");
		p.Cnd_asppl_cd.setLabel(p.Cnd_asppl_cd_Label);
		p.Cnd_asppl_nm = p.beansFactory.createTextField("Cnd.asppl_nm");
		p.Cnd_rcpt_iv_no_Label = p.beansFactory.createLabel("Cnd.rcpt_iv_no_Label");
		p.Cnd_rcpt_iv_no = p.beansFactory.createTextField("Cnd.rcpt_iv_no");
		p.Cnd_rcpt_iv_no.setLabel(p.Cnd_rcpt_iv_no_Label);
		p.Cnd_rcpt_iv_mng_no_Label = p.beansFactory.createLabel("Cnd.rcpt_iv_mng_no_Label");
		p.Cnd_rcpt_iv_mng_no = p.beansFactory.createTextField("Cnd.rcpt_iv_mng_no");
		p.Cnd_rcpt_iv_mng_no.setLabel(p.Cnd_rcpt_iv_mng_no_Label);
		p.Cnd_purc_act_no_Label = p.beansFactory.createLabel("Cnd.purc_act_no_Label");
		p.Cnd_purc_act_no = p.beansFactory.createTextField("Cnd.purc_act_no");
		p.Cnd_purc_act_no.setLabel(p.Cnd_purc_act_no_Label);
		p.Cnd_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.trd_cur_cd_Label");
		p.Cnd_trd_cur_cd = p.beansFactory.createTextComboBox("Cnd.trd_cur_cd");
		p.Cnd_trd_cur_cd.setLabel(p.Cnd_trd_cur_cd_Label);
		p.Cnd_trd_cur_nm = p.beansFactory.createTextField("Cnd.trd_cur_nm");
		p.Cnd_ap_dpt_flg = p.beansFactory.createCheckBox("Cnd.ap_dpt_flg");
		p.Cnd_wg_flg = p.beansFactory.createCheckBox("Cnd.wg_flg");
		p.Cnd_asppl_flg = p.beansFactory.createCheckBox("Cnd.asppl_flg");
		p.Cnd_rcpt_iv_no_flg = p.beansFactory.createCheckBox("Cnd.rcpt_iv_no_flg");
		p.Cnd_rcpt_iv_mng_no_flg = p.beansFactory.createCheckBox("Cnd.rcpt_iv_mng_no_flg");
		p.Cnd_purc_act_no_flg = p.beansFactory.createCheckBox("Cnd.purc_act_no_flg");
		p.Cnd_trd_cur_flg = p.beansFactory.createCheckBox("Cnd.trd_cur_flg");
		p.Cnd_wrk_no_flg = p.beansFactory.createCheckBox("Cnd.wrk_no_flg");
		p.Cnd_ap_typ_flg = p.beansFactory.createCheckBox("Cnd.ap_typ_flg");
		p.Cnd_select_all = p.beansFactory.createButton("Cnd.select_all", "no_border");
		p.Cnd_deselect_all = p.beansFactory.createButton("Cnd.deselect_all", "no_border");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBHP_MlyApBalSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBHP_MlyApBalSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBHP_MlyApBalSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_ac_ym = p.beansFactory.createTableColumn("Rslt.ac_ym", MCColumnType.DATE);
		p.columnRslt_ap_dpt_cd = p.beansFactory.createTableColumn("Rslt.ap_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_ap_dpt_nm = p.beansFactory.createTableColumn("Rslt.ap_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_asppl_cd = p.beansFactory.createTableColumn("Rslt.asppl_cd", MCColumnType.TEXT);
		p.columnRslt_asppl_nm = p.beansFactory.createTableColumn("Rslt.asppl_nm", MCColumnType.TEXT);
		p.columnRslt_rcpt_iv_no = p.beansFactory.createTableColumn("Rslt.rcpt_iv_no", MCColumnType.TEXT);
		p.columnRslt_rcpt_iv_mng_no = p.beansFactory.createTableColumn("Rslt.rcpt_iv_mng_no", MCColumnType.TEXT);
		p.columnRslt_purc_act_no = p.beansFactory.createTableColumn("Rslt.purc_act_no", MCColumnType.TEXT);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.trd_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_ap_typ = p.beansFactory.createTableColumn("Rslt.ap_typ", MCColumnType.TEXT);
		p.columnRslt_ap_typ_nm = p.beansFactory.createTableColumn("Rslt.ap_typ_nm", MCColumnType.TEXT);
		p.columnRslt_base_cur_cd = p.beansFactory.createTableColumn("Rslt.base_cur_cd", MCColumnType.TEXT);
		p.columnRslt_base_cur_nm = p.beansFactory.createTableColumn("Rslt.base_cur_nm", MCColumnType.TEXT);
		p.columnRslt_base_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.base_cur_amt_dec_place", MCColumnType.NUMBER);
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
	protected static void jbfInitBtn(MSBHP_MlyApBalSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBHP0120 = p.beansFactory.createButton("Btn.open_MSBHP0120", "open");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBHP_MlyApBalSrch p) {
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
	protected static void jbInitFold(MSBHP_MlyApBalSrch p) {
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
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.FoldTab.add(p.Tab3Panel, "Fold.tab3");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MSBHP_MlyApBalSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.ApPanel, null);
		p.Tab1Panel.setLastBeans(p.ApPanel);
		p.ApPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBHP_MlyApBalSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.AspplCndPanel, null);
		p.Tab2Panel.setLastBeans(p.AspplCndPanel);
	}

	/**
	 * [AspplCnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAspplCnd(MSBHP_MlyApBalSrch p) {
		// ブロック関連の初期化
		p.AspplCndPanel.setValueCheck(false);
		p.AspplCndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.AspplCndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBHP_MlyApBalSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.Cnd2Panel, null);
		p.Tab3Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBHP_MlyApBalSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Ap]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAp(MSBHP_MlyApBalSrch p) {
		// ブロック関連の初期化
		p.ApPanel.setBorder(p.ApTitledBorder);
		p.ApPanel.setValueCheck(false);
		p.ApPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ApPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBHP_MlyApBalSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ApPanel.add(p.Cnd_ap_typ_ap);
		p.ApPanel.setLastBeans(p.Cnd_ap_typ_ap);
		p.Cnd_ap_typ_ap.setNextBeans(p.Cnd_ap_typ_ac);
		p.Cnd_ap_typ_ap.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0110.CndR.ap_typ_ap_META);
		p.ApPanel.add(p.Cnd_ap_typ_ac);
		p.Cnd_ap_typ_ac.setNextBeans(p.Cnd_ap_typ_temp_ap);
		p.Cnd_ap_typ_ac.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0110.CndR.ap_typ_ac_META);
		p.ApPanel.add(p.Cnd_ap_typ_temp_ap);
		p.Cnd_ap_typ_temp_ap.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0110.CndR.ap_typ_temp_ap_META);
		p.CndPanel.add(p.Cnd_ac_ym_fr_Label);
		p.CndPanel.add(p.Cnd_ac_ym_fr);
		p.CndPanel.setLastBeans(p.Cnd_ac_ym_fr);
		p.Cnd_ac_ym_fr.setNextBeans(p.Cnd_ac_ym_to);
		p.Cnd_ac_ym_fr.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0110.CndR.ac_ym_fr_META);
		p.Cnd_ac_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ac_ym_to_Label);
		p.CndPanel.add(p.Cnd_ac_ym_to);
		p.Cnd_ac_ym_to.setNextBeans(p.Cnd_ap_dpt_cd);
		p.Cnd_ac_ym_to.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0110.CndR.ac_ym_to_META);
		p.Cnd_ac_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ap_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_ap_dpt_cd);
		p.Cnd_ap_dpt_cd.setNextBeans(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0110.CndR.ap_dpt_cd_META);
		p.Cnd_ap_dpt_cd.addLinkBeans(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ap_dpt_cd, true);
		p.CndPanel.add(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_ap_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0110.CndR.ap_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_ap_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0110.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_asppl_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0110.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_asppl_cd_Label);
		p.CndPanel.add(p.Cnd_asppl_cd);
		p.Cnd_asppl_cd.setNextBeans(p.Cnd_asppl_nm);
		p.Cnd_asppl_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0110.CndR.asppl_cd_META);
		p.Cnd_asppl_cd.addLinkBeans(p.Cnd_asppl_nm);
		p.Cnd_asppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_asppl_cd, true);
		p.CndPanel.add(p.Cnd_asppl_nm);
		p.Cnd_asppl_nm.setNextBeans(p.Cnd_rcpt_iv_no);
		p.Cnd_asppl_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0110.CndR.asppl_nm_META);
		p.setPluralValueEnable(p.Cnd_asppl_nm, true);
		p.CndPanel.add(p.Cnd_rcpt_iv_no_Label);
		p.CndPanel.add(p.Cnd_rcpt_iv_no);
		p.Cnd_rcpt_iv_no.setNextBeans(p.Cnd_rcpt_iv_mng_no);
		p.Cnd_rcpt_iv_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0110.CndR.rcpt_iv_no_META);
		p.setPluralValueEnable(p.Cnd_rcpt_iv_no, true);
		p.CndPanel.add(p.Cnd_rcpt_iv_mng_no_Label);
		p.CndPanel.add(p.Cnd_rcpt_iv_mng_no);
		p.Cnd_rcpt_iv_mng_no.setNextBeans(p.Cnd_purc_act_no);
		p.Cnd_rcpt_iv_mng_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0110.CndR.rcpt_iv_mng_no_META);
		p.setPluralValueEnable(p.Cnd_rcpt_iv_mng_no, true);
		p.CndPanel.add(p.Cnd_purc_act_no_Label);
		p.CndPanel.add(p.Cnd_purc_act_no);
		p.Cnd_purc_act_no.setNextBeans(p.Cnd_trd_cur_cd);
		p.Cnd_purc_act_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0110.CndR.purc_act_no_META);
		p.setPluralValueEnable(p.Cnd_purc_act_no, true);
		p.Cnd_trd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cur_cd, true);
		p.Cnd_trd_cur_cd.setLinkBeans(p.Cnd_trd_cur_nm);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0110.CndR.trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0110.CndR.trd_cur_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_cur_nm, true);
		p.CndPanel.add(p.Cnd_wrk_no_p_PPanel);
		p.Cnd2Panel.add(p.Cnd_ap_dpt_flg);
		p.Cnd2Panel.setLastBeans(p.Cnd_ap_dpt_flg);
		p.Cnd_ap_dpt_flg.setNextBeans(p.Cnd_wg_flg);
		p.Cnd_ap_dpt_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0110.CndR.ap_dpt_flg_META);
		p.Cnd2Panel.add(p.Cnd_wg_flg);
		p.Cnd_wg_flg.setNextBeans(p.Cnd_asppl_flg);
		p.Cnd_wg_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0110.CndR.wg_flg_META);
		p.Cnd2Panel.add(p.Cnd_asppl_flg);
		p.Cnd_asppl_flg.setNextBeans(p.Cnd_rcpt_iv_no_flg);
		p.Cnd_asppl_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0110.CndR.asppl_flg_META);
		p.Cnd2Panel.add(p.Cnd_rcpt_iv_no_flg);
		p.Cnd_rcpt_iv_no_flg.setNextBeans(p.Cnd_rcpt_iv_mng_no_flg);
		p.Cnd_rcpt_iv_no_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0110.CndR.rcpt_iv_no_flg_META);
		p.Cnd2Panel.add(p.Cnd_rcpt_iv_mng_no_flg);
		p.Cnd_rcpt_iv_mng_no_flg.setNextBeans(p.Cnd_purc_act_no_flg);
		p.Cnd_rcpt_iv_mng_no_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0110.CndR.rcpt_iv_mng_no_flg_META);
		p.Cnd2Panel.add(p.Cnd_purc_act_no_flg);
		p.Cnd_purc_act_no_flg.setNextBeans(p.Cnd_trd_cur_flg);
		p.Cnd_purc_act_no_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0110.CndR.purc_act_no_flg_META);
		p.Cnd2Panel.add(p.Cnd_trd_cur_flg);
		p.Cnd_trd_cur_flg.setNextBeans(p.Cnd_wrk_no_flg);
		p.Cnd_trd_cur_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0110.CndR.trd_cur_flg_META);
		p.Cnd2Panel.add(p.Cnd_wrk_no_flg);
		p.Cnd_wrk_no_flg.setNextBeans(p.Cnd_ap_typ_flg);
		p.Cnd_wrk_no_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0110.CndR.wrk_no_flg_META);
		p.Cnd2Panel.add(p.Cnd_ap_typ_flg);
		p.Cnd_ap_typ_flg.setNextBeans(p.Cnd_select_all);
		p.Cnd_ap_typ_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0110.CndR.ap_typ_flg_META);
		p.Cnd_select_all.setIcon("SELECT_ALL");
		p.Cnd_select_all.setFunctionKey(MCFunctionKey.F13);
		p.Cnd2Panel.add(p.Cnd_select_all);
		p.Cnd_select_all.setNextBeans(p.Cnd_deselect_all);
		p.Cnd_deselect_all.setIcon("DESELECT_ALL");
		p.Cnd_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.Cnd2Panel.add(p.Cnd_deselect_all);
		p.AspplCndPanel.add(p.Cnd_asppl_grp_p_PPanel);
		p.AspplCndPanel.setLastBeans(p.Cnd_asppl_grp_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBHP_MlyApBalSrch p) {
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
	protected static void jbInitRPnl(MSBHP_MlyApBalSrch p) {
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
	protected static void jbInitRslt(MSBHP_MlyApBalSrch p) {
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
	protected static void jbInitBtn(MSBHP_MlyApBalSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_open_MSBHP0120.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBHP0120);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBHP0120);
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
		MSBHP_MlyApBalSrch_MC.mcInitTop((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.mcInitFold((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.mcInitTab1((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.mcInitTab2((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.mcInitAspplCnd((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.mcInitTab3((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.mcInitCnd2((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.mcInitAp((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.mcInitCnd((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.mcInitCtrl((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.mcInitRPnl((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.mcInitRslt((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.mcInitBtn((MSBHP_MlyApBalSrch)this);

		// [SRCH]ステータスのモードの設定
		MSBHP_MlyApBalSrch_MC.statusInitSRCH_Top((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.statusInitSRCH_Fold((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.statusInitSRCH_Tab1((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.statusInitSRCH_Tab2((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.statusInitSRCH_AspplCnd((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.statusInitSRCH_Tab3((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.statusInitSRCH_Cnd2((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.statusInitSRCH_Ap((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.statusInitSRCH_Cnd((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.statusInitSRCH_Ctrl((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.statusInitSRCH_RPnl((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.statusInitSRCH_Rslt((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.statusInitSRCH_Btn((MSBHP_MlyApBalSrch)this);

		// [REF]ステータスのモードの設定
		MSBHP_MlyApBalSrch_MC.statusInitREF_Top((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.statusInitREF_Fold((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.statusInitREF_Tab1((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.statusInitREF_Tab2((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.statusInitREF_AspplCnd((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.statusInitREF_Tab3((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.statusInitREF_Cnd2((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.statusInitREF_Ap((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.statusInitREF_Cnd((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.statusInitREF_Ctrl((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.statusInitREF_RPnl((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.statusInitREF_Rslt((MSBHP_MlyApBalSrch)this);
		MSBHP_MlyApBalSrch_MC.statusInitREF_Btn((MSBHP_MlyApBalSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBHP_MlyApBalSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBHP_MlyApBalSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBHP_MlyApBalSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBHP_MlyApBalSrch p) {
	}

	/**
	 *  [AspplCnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAspplCnd(MSBHP_MlyApBalSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBHP_MlyApBalSrch p) {
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBHP_MlyApBalSrch p) {
	}

	/**
	 *  [Ap]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAp(MSBHP_MlyApBalSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBHP_MlyApBalSrch p) {
		p.Cnd_ap_typ_ap.addAllListener(p);
		p.Cnd_ap_typ_ac.addAllListener(p);
		p.Cnd_ap_typ_temp_ap.addAllListener(p);
		p.Cnd_ac_ym_fr.setListListener(p);
		p.Cnd_ac_ym_fr.addAllListener(p);
		p.Cnd_ac_ym_to.setListListener(p);
		p.Cnd_ac_ym_to.addAllListener(p);
		p.Cnd_ap_dpt_cd.setListListener(p);
		p.Cnd_ap_dpt_cd.addAllListener(p);
		p.Cnd_ap_dpt_nm.setListListener(p);
		p.Cnd_ap_dpt_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_asppl_cd.setListListener(p);
		p.Cnd_asppl_cd.addAllListener(p);
		p.Cnd_asppl_nm.setListListener(p);
		p.Cnd_asppl_nm.addAllListener(p);
		p.Cnd_rcpt_iv_no.setListListener(p);
		p.Cnd_rcpt_iv_no.addAllListener(p);
		p.Cnd_rcpt_iv_mng_no.setListListener(p);
		p.Cnd_rcpt_iv_mng_no.addAllListener(p);
		p.Cnd_purc_act_no.setListListener(p);
		p.Cnd_purc_act_no.addAllListener(p);
		p.Cnd_trd_cur_cd.setListListener(p);
		p.Cnd_trd_cur_cd.addAllListener(p);
		p.Cnd_trd_cur_nm.setListListener(p);
		p.Cnd_trd_cur_nm.addAllListener(p);
		p.Cnd_ap_dpt_flg.addAllListener(p);
		p.Cnd_wg_flg.addAllListener(p);
		p.Cnd_asppl_flg.addAllListener(p);
		p.Cnd_rcpt_iv_no_flg.addAllListener(p);
		p.Cnd_rcpt_iv_mng_no_flg.addAllListener(p);
		p.Cnd_purc_act_no_flg.addAllListener(p);
		p.Cnd_trd_cur_flg.addAllListener(p);
		p.Cnd_wrk_no_flg.addAllListener(p);
		p.Cnd_ap_typ_flg.addAllListener(p);
		p.Cnd_select_all.addAllListener(p);
		p.Cnd_select_all.setAPMethodName("doCnd_select_all");
		p.Cnd_deselect_all.addAllListener(p);
		p.Cnd_deselect_all.setAPMethodName("doCnd_deselect_all");
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBHP_MlyApBalSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBHP_MlyApBalSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBHP_MlyApBalSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_ac_ym.addAllListener(p);
		p.columnRslt_ac_ym.setListListener(p);
		p.columnRslt_ap_dpt_cd.addAllListener(p);
		p.columnRslt_ap_dpt_cd.setListListener(p);
		p.columnRslt_ap_dpt_nm.addAllListener(p);
		p.columnRslt_ap_dpt_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_asppl_cd.addAllListener(p);
		p.columnRslt_asppl_cd.setListListener(p);
		p.columnRslt_asppl_nm.addAllListener(p);
		p.columnRslt_asppl_nm.setListListener(p);
		p.columnRslt_rcpt_iv_no.addAllListener(p);
		p.columnRslt_rcpt_iv_no.setListListener(p);
		p.columnRslt_rcpt_iv_mng_no.addAllListener(p);
		p.columnRslt_rcpt_iv_mng_no.setListListener(p);
		p.columnRslt_purc_act_no.addAllListener(p);
		p.columnRslt_purc_act_no.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_trd_cur_amt_dec_place.addAllListener(p);
		p.columnRslt_trd_cur_amt_dec_place.setListListener(p);
		p.columnRslt_ap_typ.addAllListener(p);
		p.columnRslt_ap_typ.setListListener(p);
		p.columnRslt_ap_typ_nm.addAllListener(p);
		p.columnRslt_ap_typ_nm.setListListener(p);
		p.columnRslt_base_cur_cd.addAllListener(p);
		p.columnRslt_base_cur_cd.setListListener(p);
		p.columnRslt_base_cur_nm.addAllListener(p);
		p.columnRslt_base_cur_nm.setListListener(p);
		p.columnRslt_base_cur_amt_dec_place.addAllListener(p);
		p.columnRslt_base_cur_amt_dec_place.setListListener(p);
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
	protected static void mcInitBtn(MSBHP_MlyApBalSrch p) {
		p.Btn_open_MSBHP0120.addAllListener(p);
		p.Btn_open_MSBHP0120.setAPMethodName("doBtn_open_MSBHP0120");
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBHP_MlyApBalSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBHP_MlyApBalSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBHP_MlyApBalSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBHP_MlyApBalSrch p){

	}

	/**
	 * [SRCH]ステータスの[AspplCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_AspplCnd(MSBHP_MlyApBalSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MSBHP_MlyApBalSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MSBHP_MlyApBalSrch p){

	}

	/**
	 * [SRCH]ステータスの[Ap]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ap(MSBHP_MlyApBalSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBHP_MlyApBalSrch p){
		p.Cnd_ap_typ_ap.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ap_typ_ac.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ap_typ_temp_ap.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ac_ym_to.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ap_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_asppl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_asppl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_ap_dpt_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_asppl_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_purc_act_no_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_trd_cur_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wrk_no_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ap_typ_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_asppl_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBHP_MlyApBalSrch p){

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MSBHP_MlyApBalSrch p){
		p.RPnl_dwnld.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBHP_MlyApBalSrch p){
		p.columnRslt_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_ap_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ap_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_init_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_init_bal_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_purc_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_ret_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ret_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_dscnt_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_sw_to_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_sw_to_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cash_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_cash_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_note_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_note_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_account_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_account_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_setoff_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_setoff_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_sw_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_sw_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_end_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_end_bal_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_base_cur_init_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_init_bal_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_base_cur_purc_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_purc_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_base_cur_ret_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_ret_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_base_cur_sw_to_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_sw_to_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_base_cur_cash_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_cash_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_base_cur_note_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_note_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_base_cur_account_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_account_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_base_cur_setoff_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_setoff_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_base_cur_sw_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_sw_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_base_cur_end_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_end_bal_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_exc_gain_loss_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_exc_gain_loss_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_total_exc_gain_loss_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_total_exc_gain_loss_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_asppl_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
	protected static void statusInitSRCH_Btn(MSBHP_MlyApBalSrch p){
		p.Btn_open_MSBHP0120.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBHP_MlyApBalSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBHP_MlyApBalSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBHP_MlyApBalSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBHP_MlyApBalSrch p){

	}

	/**
	 * [REF]ステータスの[AspplCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_AspplCnd(MSBHP_MlyApBalSrch p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MSBHP_MlyApBalSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MSBHP_MlyApBalSrch p){

	}

	/**
	 * [REF]ステータスの[Ap]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ap(MSBHP_MlyApBalSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBHP_MlyApBalSrch p){
		p.Cnd_ap_typ_ap.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ap_typ_ac.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ap_typ_temp_ap.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_ym_fr.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ac_ym_to.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ap_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_asppl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_asppl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_ap_dpt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_asppl_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_purc_act_no_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_cur_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wrk_no_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ap_typ_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_select_all.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_deselect_all.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_asppl_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBHP_MlyApBalSrch p){

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBHP_MlyApBalSrch p){
		p.RPnl_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBHP_MlyApBalSrch p){
		p.columnRslt_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_ap_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ap_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_init_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_init_bal_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_purc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_purc_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_ret_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ret_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dscnt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_dscnt_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_sw_to_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_sw_to_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_tax_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cash_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_cash_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_note_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_note_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_account_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_account_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_setoff_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_setoff_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_sw_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_sw_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_end_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_end_bal_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_base_cur_init_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_init_bal_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_base_cur_purc_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_purc_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_base_cur_ret_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_ret_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_base_cur_sw_to_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_sw_to_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_base_cur_cash_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_cash_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_base_cur_note_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_note_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_base_cur_account_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_account_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_base_cur_setoff_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_setoff_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_base_cur_sw_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_sw_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_base_cur_end_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_end_bal_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_exc_gain_loss_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_exc_gain_loss_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_total_exc_gain_loss_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_total_exc_gain_loss_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_asppl_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
	protected static void statusInitREF_Btn(MSBHP_MlyApBalSrch p){
		p.Btn_open_MSBHP0120.putMode(p, REF, MCMode.ENABLE);

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
		MSBHP_MlyApBalSrch_MC.setTableConfigRslt((MSBHP_MlyApBalSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBHP_MlyApBalSrch p) {
		p.columnRslt_ac_ym.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.ac_ym_META);
		p.columnRslt_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_ym);
		p.columnRslt_ap_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.ap_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_dpt_cd);
		p.columnRslt_ap_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.ap_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_dpt_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_asppl_cd.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.asppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asppl_cd);
		p.columnRslt_asppl_nm.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.asppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asppl_nm);
		p.columnRslt_rcpt_iv_no.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.rcpt_iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_no);
		p.columnRslt_rcpt_iv_mng_no.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.rcpt_iv_mng_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_mng_no);
		p.columnRslt_purc_act_no.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.purc_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_act_no);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_trd_cur_amt_dec_place.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.trd_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_amt_dec_place);
		p.RsltTable.addTable(p.Rslt_wrk_no_p_PPanel.WrkNoTable);
		p.columnRslt_ap_typ.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.ap_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_typ);
		p.columnRslt_ap_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.ap_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_typ_nm);
		p.RsltTable.addTable(p.Rslt_init_bal_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_purc_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ret_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_dscnt_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_sw_to_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_cash_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_note_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_account_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_setoff_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_sw_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_end_bal_p_PPanel.AmtTable);
		p.columnRslt_base_cur_cd.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.base_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_cd);
		p.columnRslt_base_cur_nm.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.base_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_nm);
		p.columnRslt_base_cur_amt_dec_place.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.base_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_amt_dec_place);
		p.RsltTable.addTable(p.Rslt_base_cur_init_bal_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_purc_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_ret_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_dscnt_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_sw_to_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_cash_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_note_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_account_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_setoff_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_sw_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_end_bal_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_exc_gain_loss_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_total_exc_gain_loss_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_asppl_grp_p_PPanel.BpGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBH.MSBHP0110.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_ap_dpt_cd.getListConfig().setPutter(getCnd_ap_dpt_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_asppl_cd.getListConfig().setPutter(getCnd_asppl_cd_ListPutter());
		Cnd_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cur_cd.getListConfig().setPutter(getCnd_trd_cur_cd_ListPutter());
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
	 * [Cnd_asppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_asppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_ap_dpt_cd) return getCnd_ap_dpt_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_asppl_cd) return getCnd_asppl_cd(row, info);
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
		if (ap == Cnd_select_all) doCnd_select_all(info);
		else if (ap == Cnd_deselect_all) doCnd_deselect_all(info);
		else if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
		else if (ap == RPnl_dwnld) doRPnl_dwnld(info);
		else if (ap == Btn_open_MSBHP0120) doBtn_open_MSBHP0120(info);
	}

	/**
	 * [Cnd]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_select_all(MCEventInfo info);

	/**
	 * [Cnd]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_deselect_all(MCEventInfo info);

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [RPnl]パネルの[dwnld]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRPnl_dwnld(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBHP0120]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBHP0120(MCEventInfo info);

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
		if (vc == Cnd_ap_typ_ap) return doCnd_ap_typ_ap_VC(info);
		if (vc == Cnd_ap_typ_ac) return doCnd_ap_typ_ac_VC(info);
		if (vc == Cnd_ap_typ_temp_ap) return doCnd_ap_typ_temp_ap_VC(info);
		if (vc == Cnd_ac_ym_fr) return doCnd_ac_ym_fr_VC(info);
		if (vc == Cnd_ac_ym_to) return doCnd_ac_ym_to_VC(info);
		if (vc == Cnd_ap_dpt_cd) return doCnd_ap_dpt_cd_VC(info);
		if (vc == Cnd_ap_dpt_nm) return doCnd_ap_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_asppl_cd) return doCnd_asppl_cd_VC(info);
		if (vc == Cnd_asppl_nm) return doCnd_asppl_nm_VC(info);
		if (vc == Cnd_rcpt_iv_no) return doCnd_rcpt_iv_no_VC(info);
		if (vc == Cnd_rcpt_iv_mng_no) return doCnd_rcpt_iv_mng_no_VC(info);
		if (vc == Cnd_purc_act_no) return doCnd_purc_act_no_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
		if (vc == Cnd_ap_dpt_flg) return doCnd_ap_dpt_flg_VC(info);
		if (vc == Cnd_wg_flg) return doCnd_wg_flg_VC(info);
		if (vc == Cnd_asppl_flg) return doCnd_asppl_flg_VC(info);
		if (vc == Cnd_rcpt_iv_no_flg) return doCnd_rcpt_iv_no_flg_VC(info);
		if (vc == Cnd_rcpt_iv_mng_no_flg) return doCnd_rcpt_iv_mng_no_flg_VC(info);
		if (vc == Cnd_purc_act_no_flg) return doCnd_purc_act_no_flg_VC(info);
		if (vc == Cnd_trd_cur_flg) return doCnd_trd_cur_flg_VC(info);
		if (vc == Cnd_wrk_no_flg) return doCnd_wrk_no_flg_VC(info);
		if (vc == Cnd_ap_typ_flg) return doCnd_ap_typ_flg_VC(info);
		if (vc == columnRslt_ac_ym) return doRslt_ac_ym_VC(info);
		if (vc == columnRslt_ap_dpt_cd) return doRslt_ap_dpt_cd_VC(info);
		if (vc == columnRslt_ap_dpt_nm) return doRslt_ap_dpt_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_asppl_cd) return doRslt_asppl_cd_VC(info);
		if (vc == columnRslt_asppl_nm) return doRslt_asppl_nm_VC(info);
		if (vc == columnRslt_rcpt_iv_no) return doRslt_rcpt_iv_no_VC(info);
		if (vc == columnRslt_rcpt_iv_mng_no) return doRslt_rcpt_iv_mng_no_VC(info);
		if (vc == columnRslt_purc_act_no) return doRslt_purc_act_no_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_trd_cur_amt_dec_place) return doRslt_trd_cur_amt_dec_place_VC(info);
		if (vc == columnRslt_ap_typ) return doRslt_ap_typ_VC(info);
		if (vc == columnRslt_ap_typ_nm) return doRslt_ap_typ_nm_VC(info);
		if (vc == columnRslt_base_cur_cd) return doRslt_base_cur_cd_VC(info);
		if (vc == columnRslt_base_cur_nm) return doRslt_base_cur_nm_VC(info);
		if (vc == columnRslt_base_cur_amt_dec_place) return doRslt_base_cur_amt_dec_place_VC(info);
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
	 * [Cnd]パネルの[ap_typ_ap]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_typ_ap_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_typ_ac]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_typ_ac_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_typ_temp_ap]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_typ_temp_ap_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_ym_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ap_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[asppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcpt_iv_no_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_mng_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcpt_iv_mng_no_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_act_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_act_no_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_cur_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_cur_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wrk_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wrk_no_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_typ_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_typ_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[asppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[asppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asppl_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[rcpt_iv_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcpt_iv_mng_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_act_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_amt_dec_place_VC(MCEventInfo info){
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
		else if (nc == Cnd_ap_typ_ap) doCnd_ap_typ_ap_NC(info);
		else if (nc == Cnd_ap_typ_ac) doCnd_ap_typ_ac_NC(info);
		else if (nc == Cnd_ap_typ_temp_ap) doCnd_ap_typ_temp_ap_NC(info);
		else if (nc == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NC(info);
		else if (nc == Cnd_ac_ym_to) doCnd_ac_ym_to_NC(info);
		else if (nc == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NC(info);
		else if (nc == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_asppl_cd) doCnd_asppl_cd_NC(info);
		else if (nc == Cnd_asppl_nm) doCnd_asppl_nm_NC(info);
		else if (nc == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NC(info);
		else if (nc == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_NC(info);
		else if (nc == Cnd_purc_act_no) doCnd_purc_act_no_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
		else if (nc == Cnd_ap_dpt_flg) doCnd_ap_dpt_flg_NC(info);
		else if (nc == Cnd_wg_flg) doCnd_wg_flg_NC(info);
		else if (nc == Cnd_asppl_flg) doCnd_asppl_flg_NC(info);
		else if (nc == Cnd_rcpt_iv_no_flg) doCnd_rcpt_iv_no_flg_NC(info);
		else if (nc == Cnd_rcpt_iv_mng_no_flg) doCnd_rcpt_iv_mng_no_flg_NC(info);
		else if (nc == Cnd_purc_act_no_flg) doCnd_purc_act_no_flg_NC(info);
		else if (nc == Cnd_trd_cur_flg) doCnd_trd_cur_flg_NC(info);
		else if (nc == Cnd_wrk_no_flg) doCnd_wrk_no_flg_NC(info);
		else if (nc == Cnd_ap_typ_flg) doCnd_ap_typ_flg_NC(info);
		else if (nc == columnRslt_ac_ym) doRslt_ac_ym_NC(info);
		else if (nc == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NC(info);
		else if (nc == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_asppl_cd) doRslt_asppl_cd_NC(info);
		else if (nc == columnRslt_asppl_nm) doRslt_asppl_nm_NC(info);
		else if (nc == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NC(info);
		else if (nc == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_NC(info);
		else if (nc == columnRslt_purc_act_no) doRslt_purc_act_no_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NC(info);
		else if (nc == columnRslt_ap_typ) doRslt_ap_typ_NC(info);
		else if (nc == columnRslt_ap_typ_nm) doRslt_ap_typ_nm_NC(info);
		else if (nc == columnRslt_base_cur_cd) doRslt_base_cur_cd_NC(info);
		else if (nc == columnRslt_base_cur_nm) doRslt_base_cur_nm_NC(info);
		else if (nc == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NC(info);
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
	 * [Cnd]パネルの[ap_typ_ap]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_ap_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_typ_ac]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_ac_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_typ_temp_ap]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_temp_ap_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ap_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_mng_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_mng_no_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_act_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_no_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_no_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_typ_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[asppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_NC(MCEventInfo info){
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
		else if (ne == Cnd_ap_typ_ap) doCnd_ap_typ_ap_NE(info);
		else if (ne == Cnd_ap_typ_ac) doCnd_ap_typ_ac_NE(info);
		else if (ne == Cnd_ap_typ_temp_ap) doCnd_ap_typ_temp_ap_NE(info);
		else if (ne == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NE(info);
		else if (ne == Cnd_ac_ym_to) doCnd_ac_ym_to_NE(info);
		else if (ne == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NE(info);
		else if (ne == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_asppl_cd) doCnd_asppl_cd_NE(info);
		else if (ne == Cnd_asppl_nm) doCnd_asppl_nm_NE(info);
		else if (ne == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NE(info);
		else if (ne == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_NE(info);
		else if (ne == Cnd_purc_act_no) doCnd_purc_act_no_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
		else if (ne == Cnd_ap_dpt_flg) doCnd_ap_dpt_flg_NE(info);
		else if (ne == Cnd_wg_flg) doCnd_wg_flg_NE(info);
		else if (ne == Cnd_asppl_flg) doCnd_asppl_flg_NE(info);
		else if (ne == Cnd_rcpt_iv_no_flg) doCnd_rcpt_iv_no_flg_NE(info);
		else if (ne == Cnd_rcpt_iv_mng_no_flg) doCnd_rcpt_iv_mng_no_flg_NE(info);
		else if (ne == Cnd_purc_act_no_flg) doCnd_purc_act_no_flg_NE(info);
		else if (ne == Cnd_trd_cur_flg) doCnd_trd_cur_flg_NE(info);
		else if (ne == Cnd_wrk_no_flg) doCnd_wrk_no_flg_NE(info);
		else if (ne == Cnd_ap_typ_flg) doCnd_ap_typ_flg_NE(info);
		else if (ne == columnRslt_ac_ym) doRslt_ac_ym_NE(info);
		else if (ne == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NE(info);
		else if (ne == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_asppl_cd) doRslt_asppl_cd_NE(info);
		else if (ne == columnRslt_asppl_nm) doRslt_asppl_nm_NE(info);
		else if (ne == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NE(info);
		else if (ne == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_NE(info);
		else if (ne == columnRslt_purc_act_no) doRslt_purc_act_no_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NE(info);
		else if (ne == columnRslt_ap_typ) doRslt_ap_typ_NE(info);
		else if (ne == columnRslt_ap_typ_nm) doRslt_ap_typ_nm_NE(info);
		else if (ne == columnRslt_base_cur_cd) doRslt_base_cur_cd_NE(info);
		else if (ne == columnRslt_base_cur_nm) doRslt_base_cur_nm_NE(info);
		else if (ne == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NE(info);
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
	 * [Cnd]パネルの[ap_typ_ap]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_ap_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_typ_ac]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_ac_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_typ_temp_ap]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_temp_ap_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ap_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_mng_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_mng_no_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_act_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_no_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_no_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_typ_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[asppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[base_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_NE(MCEventInfo info){
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
		else if (nx == Cnd_ap_typ_ap) doCnd_ap_typ_ap_NX(info);
		else if (nx == Cnd_ap_typ_ac) doCnd_ap_typ_ac_NX(info);
		else if (nx == Cnd_ap_typ_temp_ap) doCnd_ap_typ_temp_ap_NX(info);
		else if (nx == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NX(info);
		else if (nx == Cnd_ac_ym_to) doCnd_ac_ym_to_NX(info);
		else if (nx == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NX(info);
		else if (nx == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_asppl_cd) doCnd_asppl_cd_NX(info);
		else if (nx == Cnd_asppl_nm) doCnd_asppl_nm_NX(info);
		else if (nx == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NX(info);
		else if (nx == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_NX(info);
		else if (nx == Cnd_purc_act_no) doCnd_purc_act_no_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
		else if (nx == Cnd_ap_dpt_flg) doCnd_ap_dpt_flg_NX(info);
		else if (nx == Cnd_wg_flg) doCnd_wg_flg_NX(info);
		else if (nx == Cnd_asppl_flg) doCnd_asppl_flg_NX(info);
		else if (nx == Cnd_rcpt_iv_no_flg) doCnd_rcpt_iv_no_flg_NX(info);
		else if (nx == Cnd_rcpt_iv_mng_no_flg) doCnd_rcpt_iv_mng_no_flg_NX(info);
		else if (nx == Cnd_purc_act_no_flg) doCnd_purc_act_no_flg_NX(info);
		else if (nx == Cnd_trd_cur_flg) doCnd_trd_cur_flg_NX(info);
		else if (nx == Cnd_wrk_no_flg) doCnd_wrk_no_flg_NX(info);
		else if (nx == Cnd_ap_typ_flg) doCnd_ap_typ_flg_NX(info);
		else if (nx == columnRslt_ac_ym) doRslt_ac_ym_NX(info);
		else if (nx == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NX(info);
		else if (nx == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_asppl_cd) doRslt_asppl_cd_NX(info);
		else if (nx == columnRslt_asppl_nm) doRslt_asppl_nm_NX(info);
		else if (nx == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NX(info);
		else if (nx == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_NX(info);
		else if (nx == columnRslt_purc_act_no) doRslt_purc_act_no_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NX(info);
		else if (nx == columnRslt_ap_typ) doRslt_ap_typ_NX(info);
		else if (nx == columnRslt_ap_typ_nm) doRslt_ap_typ_nm_NX(info);
		else if (nx == columnRslt_base_cur_cd) doRslt_base_cur_cd_NX(info);
		else if (nx == columnRslt_base_cur_nm) doRslt_base_cur_nm_NX(info);
		else if (nx == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NX(info);
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
	 * [Cnd]パネルの[ap_typ_ap]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_ap_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_typ_ac]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_ac_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_typ_temp_ap]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_temp_ap_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ap_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_no_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcpt_iv_mng_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcpt_iv_mng_no_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_act_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_no_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cur_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cur_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wrk_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wrk_no_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_typ_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_typ_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[asppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[base_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_NX(MCEventInfo info){
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
		if (lc == Cnd_ac_ym_fr) doCnd_ac_ym_fr_LC(info);
		else if (lc == Cnd_ac_ym_to) doCnd_ac_ym_to_LC(info);
		else if (lc == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_LC(info);
		else if (lc == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_asppl_cd) doCnd_asppl_cd_LC(info);
		else if (lc == Cnd_asppl_nm) doCnd_asppl_nm_LC(info);
		else if (lc == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_LC(info);
		else if (lc == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_LC(info);
		else if (lc == Cnd_purc_act_no) doCnd_purc_act_no_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
		else if (lc == columnRslt_ac_ym) doRslt_ac_ym_LC(info);
		else if (lc == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_LC(info);
		else if (lc == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_asppl_cd) doRslt_asppl_cd_LC(info);
		else if (lc == columnRslt_asppl_nm) doRslt_asppl_nm_LC(info);
		else if (lc == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_LC(info);
		else if (lc == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_LC(info);
		else if (lc == columnRslt_purc_act_no) doRslt_purc_act_no_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_LC(info);
		else if (lc == columnRslt_ap_typ) doRslt_ap_typ_LC(info);
		else if (lc == columnRslt_ap_typ_nm) doRslt_ap_typ_nm_LC(info);
		else if (lc == columnRslt_base_cur_cd) doRslt_base_cur_cd_LC(info);
		else if (lc == columnRslt_base_cur_nm) doRslt_base_cur_nm_LC(info);
		else if (lc == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_LC(info);
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
	 * [Cnd]パネルの[ac_ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[asppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcpt_iv_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcpt_iv_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_asppl_cd]の作成メソッド
	 */
	public MCList getCnd_asppl_cd(MCRow row, MCEventInfo info){
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
		if (id.equals("MS.MSBHL0110.Srch01")) {
			return new MS_MSBHL0110_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBHL0110_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0110_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0110_Srch01;

		/** コンストラクタ */
		protected MS_MSBHL0110_Srch01Bridge() {
			p_MS_MSBHL0110_Srch01 = new MCParam(PDef.MS_MSBHL0110_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0110_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBH.MSBHP0110.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0110.RsltR.class));

			p_MS_MSBHL0110_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0110_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0110_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0110_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0110_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBH.MSBHP0110.CndR up0() {
			return (mcframe.clientMSBH.MSBHP0110.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBH.MSBHP0110.RsltR> down0() {
			return (MCList<mcframe.clientMSBH.MSBHP0110.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBHL0110_Srch01.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0110.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBHL0110_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBH.MSBHP0110.RsltR>)p_MS_MSBHL0110_Srch01.getContainerParam().getDownBlock(0));
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