package mcframe.clientMSBG.MSBGP0270;

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
import mcframe.clientMSBG.MSBGP0270.MSBGP_CredSrch_MC.MS_MSBGL0270_Srch01Caller;

/**
 * 画面"MSBGP_CredSrch"パネルクラスです。<p>
 *
 * 与信管理先の与信の状態（与信枠の使用額や使用率）を一覧形式で照会します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGP_CredSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBGP0270";

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
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_cred_cd_Label = null;
	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_cred_cd = null;
	/**
	 * Credit managed BP name 与信管理先名.<p>
	 *
	 */
	public MCTextField Cnd_cred_nm = null;
	public MCLabel Cnd_cur_cd_Label = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCTextField Cnd_cur_nm = null;
	public MCLabel Cnd_cred_use_fr_Label = null;
	/**
	 * Credit line usage rate FROM 与信枠使用率ＦＲＯＭ.<p>
	 *
	 */
	public MCNumberField Cnd_cred_use_fr = null;
	public MCLabel Cnd_cred_use_to_Label = null;
	/**
	 * Credit line usage rate TO 与信枠使用率ＴＯ.<p>
	 *
	 */
	public MCNumberField Cnd_cred_use_to = null;
	public MCLabel Cnd_cred_amt_fr_Label = null;
	/**
	 * Credit target amount FROM 与信対象額ＦＲＯＭ.<p>
	 *
	 */
	public MCNumberField Cnd_cred_amt_fr = null;
	public MCLabel Cnd_cred_amt_to_Label = null;
	/**
	 * Credit target amount TO 与信対象額ＴＯ.<p>
	 *
	 */
	public MCNumberField Cnd_cred_amt_to = null;
	/**
	 * Alarm アラーム.<p>
	 *
	 */
	public MCCheckBox Cnd_alarm_flg = null;
	public MCLabel Cnd_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Cnd_sub_char1 = null;
	public MCLabel Cnd_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Cnd_sub_char2 = null;
	public MCLabel Cnd_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Cnd_sub_char3 = null;
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_bp_grp_p_PPanel;
	public MCLabel Cnd_cred_grp_lab1;	// [Cnd]の[bp_grp_p.bp_grp_lab1]を[Cnd_cred_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_cred_grp_flg1;	// [Cnd]の[bp_grp_p.bp_grp_flg1]を[Cnd_cred_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_cred_grp_cd1;	// [Cnd]の[bp_grp_p.bp_grp_cd1]を[Cnd_cred_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_cred_grp_nm1;	// [Cnd]の[bp_grp_p.bp_grp_nm1]を[Cnd_cred_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_cred_grp_lab2;	// [Cnd]の[bp_grp_p.bp_grp_lab2]を[Cnd_cred_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_cred_grp_flg2;	// [Cnd]の[bp_grp_p.bp_grp_flg2]を[Cnd_cred_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_cred_grp_cd2;	// [Cnd]の[bp_grp_p.bp_grp_cd2]を[Cnd_cred_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_cred_grp_nm2;	// [Cnd]の[bp_grp_p.bp_grp_nm2]を[Cnd_cred_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_cred_grp_lab3;	// [Cnd]の[bp_grp_p.bp_grp_lab3]を[Cnd_cred_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_cred_grp_flg3;	// [Cnd]の[bp_grp_p.bp_grp_flg3]を[Cnd_cred_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_cred_grp_cd3;	// [Cnd]の[bp_grp_p.bp_grp_cd3]を[Cnd_cred_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_cred_grp_nm3;	// [Cnd]の[bp_grp_p.bp_grp_nm3]を[Cnd_cred_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_cred_grp_lab4;	// [Cnd]の[bp_grp_p.bp_grp_lab4]を[Cnd_cred_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_cred_grp_flg4;	// [Cnd]の[bp_grp_p.bp_grp_flg4]を[Cnd_cred_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_cred_grp_cd4;	// [Cnd]の[bp_grp_p.bp_grp_cd4]を[Cnd_cred_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_cred_grp_nm4;	// [Cnd]の[bp_grp_p.bp_grp_nm4]を[Cnd_cred_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_cred_grp_lab5;	// [Cnd]の[bp_grp_p.bp_grp_lab5]を[Cnd_cred_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_cred_grp_flg5;	// [Cnd]の[bp_grp_p.bp_grp_flg5]を[Cnd_cred_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_cred_grp_cd5;	// [Cnd]の[bp_grp_p.bp_grp_cd5]を[Cnd_cred_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_cred_grp_nm5;	// [Cnd]の[bp_grp_p.bp_grp_nm5]を[Cnd_cred_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_cred_grp_lab6;	// [Cnd]の[bp_grp_p.bp_grp_lab6]を[Cnd_cred_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_cred_grp_flg6;	// [Cnd]の[bp_grp_p.bp_grp_flg6]を[Cnd_cred_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_cred_grp_cd6;	// [Cnd]の[bp_grp_p.bp_grp_cd6]を[Cnd_cred_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_cred_grp_nm6;	// [Cnd]の[bp_grp_p.bp_grp_nm6]を[Cnd_cred_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_cred_grp_lab7;	// [Cnd]の[bp_grp_p.bp_grp_lab7]を[Cnd_cred_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_cred_grp_flg7;	// [Cnd]の[bp_grp_p.bp_grp_flg7]を[Cnd_cred_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_cred_grp_cd7;	// [Cnd]の[bp_grp_p.bp_grp_cd7]を[Cnd_cred_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_cred_grp_nm7;	// [Cnd]の[bp_grp_p.bp_grp_nm7]を[Cnd_cred_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_cred_grp_lab8;	// [Cnd]の[bp_grp_p.bp_grp_lab8]を[Cnd_cred_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_cred_grp_flg8;	// [Cnd]の[bp_grp_p.bp_grp_flg8]を[Cnd_cred_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_cred_grp_cd8;	// [Cnd]の[bp_grp_p.bp_grp_cd8]を[Cnd_cred_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_cred_grp_nm8;	// [Cnd]の[bp_grp_p.bp_grp_nm8]を[Cnd_cred_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_cred_grp_lab9;	// [Cnd]の[bp_grp_p.bp_grp_lab9]を[Cnd_cred_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_cred_grp_flg9;	// [Cnd]の[bp_grp_p.bp_grp_flg9]を[Cnd_cred_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_cred_grp_cd9;	// [Cnd]の[bp_grp_p.bp_grp_cd9]を[Cnd_cred_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_cred_grp_nm9;	// [Cnd]の[bp_grp_p.bp_grp_nm9]を[Cnd_cred_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_cred_grp_lab10;	// [Cnd]の[bp_grp_p.bp_grp_lab10]を[Cnd_cred_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_cred_grp_flg10;	// [Cnd]の[bp_grp_p.bp_grp_flg10]を[Cnd_cred_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_cred_grp_cd10;	// [Cnd]の[bp_grp_p.bp_grp_cd10]を[Cnd_cred_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_cred_grp_nm10;	// [Cnd]の[bp_grp_p.bp_grp_nm10]を[Cnd_cred_grp_nm10]としてエイリアス定義。
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
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
	public MCColumnGroupTable<mcframe.clientMSBG.MSBGP0270.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cred_cd = null;
	/**
	 * Credit managed BP name 与信管理先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cred_nm = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cur_nm = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt_dec_place = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_cred_limit_p_PPanel;
	public MCColumnConfig columnRslt_cred_limit;// [Rslt]の[cred_limit_p.amt]を[columnRslt_cred_limit]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_cred_amt_p_PPanel;
	public MCColumnConfig columnRslt_cred_amt;// [Rslt]の[cred_amt_p.amt]を[columnRslt_cred_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ar_cred_amt_p_PPanel;
	public MCColumnConfig columnRslt_ar_cred_amt;// [Rslt]の[ar_cred_amt_p.amt]を[columnRslt_ar_cred_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_ap_cred_amt_p_PPanel;
	public MCColumnConfig columnRslt_ap_cred_amt;// [Rslt]の[ap_cred_amt_p.amt]を[columnRslt_ap_cred_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_cred_bal_p_PPanel;
	public MCColumnConfig columnRslt_cred_bal;// [Rslt]の[cred_bal_p.amt]を[columnRslt_cred_bal]としてエイリアス定義。
	/**
	 * Usage rate 使用率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cred_use = null;
	/**
	 * Alarm usage rate アラーム使用率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alarm_point = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_alarm_amt_p_PPanel;
	public MCColumnConfig columnRslt_alarm_amt;// [Rslt]の[alarm_amt_p.amt]を[columnRslt_alarm_amt]としてエイリアス定義。
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
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_bp_grp_p_PPanel;
	public MCColumnConfig columnRslt_cred_grp_cd1;// [Rslt]の[bp_grp_p.bp_grp_cd1]を[columnRslt_cred_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_cred_grp_nm1;// [Rslt]の[bp_grp_p.bp_grp_nm1]を[columnRslt_cred_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_cred_grp_cd2;// [Rslt]の[bp_grp_p.bp_grp_cd2]を[columnRslt_cred_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_cred_grp_nm2;// [Rslt]の[bp_grp_p.bp_grp_nm2]を[columnRslt_cred_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_cred_grp_cd3;// [Rslt]の[bp_grp_p.bp_grp_cd3]を[columnRslt_cred_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_cred_grp_nm3;// [Rslt]の[bp_grp_p.bp_grp_nm3]を[columnRslt_cred_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_cred_grp_cd4;// [Rslt]の[bp_grp_p.bp_grp_cd4]を[columnRslt_cred_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_cred_grp_nm4;// [Rslt]の[bp_grp_p.bp_grp_nm4]を[columnRslt_cred_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_cred_grp_cd5;// [Rslt]の[bp_grp_p.bp_grp_cd5]を[columnRslt_cred_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_cred_grp_nm5;// [Rslt]の[bp_grp_p.bp_grp_nm5]を[columnRslt_cred_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_cred_grp_cd6;// [Rslt]の[bp_grp_p.bp_grp_cd6]を[columnRslt_cred_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_cred_grp_nm6;// [Rslt]の[bp_grp_p.bp_grp_nm6]を[columnRslt_cred_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_cred_grp_cd7;// [Rslt]の[bp_grp_p.bp_grp_cd7]を[columnRslt_cred_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_cred_grp_nm7;// [Rslt]の[bp_grp_p.bp_grp_nm7]を[columnRslt_cred_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_cred_grp_cd8;// [Rslt]の[bp_grp_p.bp_grp_cd8]を[columnRslt_cred_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_cred_grp_nm8;// [Rslt]の[bp_grp_p.bp_grp_nm8]を[columnRslt_cred_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_cred_grp_cd9;// [Rslt]の[bp_grp_p.bp_grp_cd9]を[columnRslt_cred_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_cred_grp_nm9;// [Rslt]の[bp_grp_p.bp_grp_nm9]を[columnRslt_cred_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_cred_grp_cd10;// [Rslt]の[bp_grp_p.bp_grp_cd10]を[columnRslt_cred_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_cred_grp_nm10;// [Rslt]の[bp_grp_p.bp_grp_nm10]を[columnRslt_cred_grp_nm10]としてエイリアス定義。
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
	public MCColumnGroup cgRslt_title = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Credit details 与信詳細照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBGP0280 = null;
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
	
	/** [MS_MSBGL0270_Srch01]のCallerの作成 */
	protected MSBGP_CredSrch_MC.MS_MSBGL0270_Srch01Caller createMS_MSBGL0270_Srch01() {
		MSBGP_CredSrch_MC.MS_MSBGL0270_Srch01Caller<MSBGP_CredSrch, MS_MSBGL0270_Srch01Bridge>
		caller = ((MSBGP_CredSrch_MC)this).new MS_MSBGL0270_Srch01Caller<MSBGP_CredSrch, MS_MSBGL0270_Srch01Bridge>(
					(MSBGP_CredSrch)this, new MS_MSBGL0270_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBGL0270_Srch01]の呼び出し */
	protected void callMS_MSBGL0270_Srch01() {
		MCCaller caller = createMS_MSBGL0270_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBG.MSBGP0270.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBG.MSBGP0270.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBG.MSBGP0270.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0270.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBG.MSBGP0270.CndR createCndR() {
		return mcframe.clientMSBG.MSBGP0270.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBG.MSBGP0270.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0270.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBG.MSBGP0270.RsltR createRsltR() {
		return mcframe.clientMSBG.MSBGP0270.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBG.MSBGP0270.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBG.MSBGP0270.RsltR.class);
	}

	/**
	 * RsltTableを初期化します。
	 */
	protected void createRsltTable(){
		if(RsltTable == null){
			RsltTable = beansFactory.createColumnGroupTable("Rslt.table");
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
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBGP_CredSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBGP_CredSrch_MC_A(String name) {
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
		MSBGP_CredSrch_MC.jbCreateTop((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbCreateFold((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbCreateTab1((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbCreateTab2((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbCreateCnd((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbCreateCnd2((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbCreateCtrl((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbCreateRPnl((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbCreateRslt((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbCreateBtn((MSBGP_CredSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBGP_CredSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBGP_CredSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBGP_CredSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBGP_CredSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBGP_CredSrch p) {
		p.Cnd_bp_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().bp_grp_p());
		p.Cnd_bp_grp_p_PPanel.setName("Cnd.bp_grp_p");
		p.Cnd_cred_grp_lab1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_cred_grp_lab1.addAliasName("Cnd.cred_grp_lab1", p);
		p.Cnd_cred_grp_flg1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_cred_grp_flg1.addAliasName("Cnd.cred_grp_flg1", p);
		p.Cnd_cred_grp_cd1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_cred_grp_cd1.addAliasName("Cnd.cred_grp_cd1", p);
		p.Cnd_cred_grp_nm1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_cred_grp_nm1.addAliasName("Cnd.cred_grp_nm1", p);
		p.Cnd_cred_grp_lab2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_cred_grp_lab2.addAliasName("Cnd.cred_grp_lab2", p);
		p.Cnd_cred_grp_flg2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_cred_grp_flg2.addAliasName("Cnd.cred_grp_flg2", p);
		p.Cnd_cred_grp_cd2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_cred_grp_cd2.addAliasName("Cnd.cred_grp_cd2", p);
		p.Cnd_cred_grp_nm2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_cred_grp_nm2.addAliasName("Cnd.cred_grp_nm2", p);
		p.Cnd_cred_grp_lab3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_cred_grp_lab3.addAliasName("Cnd.cred_grp_lab3", p);
		p.Cnd_cred_grp_flg3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_cred_grp_flg3.addAliasName("Cnd.cred_grp_flg3", p);
		p.Cnd_cred_grp_cd3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_cred_grp_cd3.addAliasName("Cnd.cred_grp_cd3", p);
		p.Cnd_cred_grp_nm3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_cred_grp_nm3.addAliasName("Cnd.cred_grp_nm3", p);
		p.Cnd_cred_grp_lab4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_cred_grp_lab4.addAliasName("Cnd.cred_grp_lab4", p);
		p.Cnd_cred_grp_flg4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_cred_grp_flg4.addAliasName("Cnd.cred_grp_flg4", p);
		p.Cnd_cred_grp_cd4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_cred_grp_cd4.addAliasName("Cnd.cred_grp_cd4", p);
		p.Cnd_cred_grp_nm4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_cred_grp_nm4.addAliasName("Cnd.cred_grp_nm4", p);
		p.Cnd_cred_grp_lab5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_cred_grp_lab5.addAliasName("Cnd.cred_grp_lab5", p);
		p.Cnd_cred_grp_flg5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_cred_grp_flg5.addAliasName("Cnd.cred_grp_flg5", p);
		p.Cnd_cred_grp_cd5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_cred_grp_cd5.addAliasName("Cnd.cred_grp_cd5", p);
		p.Cnd_cred_grp_nm5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_cred_grp_nm5.addAliasName("Cnd.cred_grp_nm5", p);
		p.Cnd_cred_grp_lab6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_cred_grp_lab6.addAliasName("Cnd.cred_grp_lab6", p);
		p.Cnd_cred_grp_flg6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_cred_grp_flg6.addAliasName("Cnd.cred_grp_flg6", p);
		p.Cnd_cred_grp_cd6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_cred_grp_cd6.addAliasName("Cnd.cred_grp_cd6", p);
		p.Cnd_cred_grp_nm6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_cred_grp_nm6.addAliasName("Cnd.cred_grp_nm6", p);
		p.Cnd_cred_grp_lab7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_cred_grp_lab7.addAliasName("Cnd.cred_grp_lab7", p);
		p.Cnd_cred_grp_flg7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_cred_grp_flg7.addAliasName("Cnd.cred_grp_flg7", p);
		p.Cnd_cred_grp_cd7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_cred_grp_cd7.addAliasName("Cnd.cred_grp_cd7", p);
		p.Cnd_cred_grp_nm7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_cred_grp_nm7.addAliasName("Cnd.cred_grp_nm7", p);
		p.Cnd_cred_grp_lab8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_cred_grp_lab8.addAliasName("Cnd.cred_grp_lab8", p);
		p.Cnd_cred_grp_flg8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_cred_grp_flg8.addAliasName("Cnd.cred_grp_flg8", p);
		p.Cnd_cred_grp_cd8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_cred_grp_cd8.addAliasName("Cnd.cred_grp_cd8", p);
		p.Cnd_cred_grp_nm8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_cred_grp_nm8.addAliasName("Cnd.cred_grp_nm8", p);
		p.Cnd_cred_grp_lab9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_cred_grp_lab9.addAliasName("Cnd.cred_grp_lab9", p);
		p.Cnd_cred_grp_flg9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_cred_grp_flg9.addAliasName("Cnd.cred_grp_flg9", p);
		p.Cnd_cred_grp_cd9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_cred_grp_cd9.addAliasName("Cnd.cred_grp_cd9", p);
		p.Cnd_cred_grp_nm9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_cred_grp_nm9.addAliasName("Cnd.cred_grp_nm9", p);
		p.Cnd_cred_grp_lab10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_cred_grp_lab10.addAliasName("Cnd.cred_grp_lab10", p);
		p.Cnd_cred_grp_flg10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_cred_grp_flg10.addAliasName("Cnd.cred_grp_flg10", p);
		p.Cnd_cred_grp_cd10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_cred_grp_cd10.addAliasName("Cnd.cred_grp_cd10", p);
		p.Cnd_cred_grp_nm10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_cred_grp_nm10.addAliasName("Cnd.cred_grp_nm10", p);
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MSBGP_CredSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBGP_CredSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBGP_CredSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBGP_CredSrch p) {
		p.Rslt_cred_limit_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0270.RsltR.$cred_limit_p);
		p.Rslt_cred_limit_p_PPanel.setName("Rslt.cred_limit_p");
		p.columnRslt_cred_limit = p.Rslt_cred_limit_p_PPanel.columnAmt_amt;
		p.columnRslt_cred_limit.addAliasName("Rslt.cred_limit", p);
		p.Rslt_cred_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0270.RsltR.$cred_amt_p);
		p.Rslt_cred_amt_p_PPanel.setName("Rslt.cred_amt_p");
		p.columnRslt_cred_amt = p.Rslt_cred_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_cred_amt.addAliasName("Rslt.cred_amt", p);
		p.Rslt_ar_cred_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0270.RsltR.$ar_cred_amt_p);
		p.Rslt_ar_cred_amt_p_PPanel.setName("Rslt.ar_cred_amt_p");
		p.columnRslt_ar_cred_amt = p.Rslt_ar_cred_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ar_cred_amt.addAliasName("Rslt.ar_cred_amt", p);
		p.Rslt_ap_cred_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0270.RsltR.$ap_cred_amt_p);
		p.Rslt_ap_cred_amt_p_PPanel.setName("Rslt.ap_cred_amt_p");
		p.columnRslt_ap_cred_amt = p.Rslt_ap_cred_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_ap_cred_amt.addAliasName("Rslt.ap_cred_amt", p);
		p.Rslt_cred_bal_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0270.RsltR.$cred_bal_p);
		p.Rslt_cred_bal_p_PPanel.setName("Rslt.cred_bal_p");
		p.columnRslt_cred_bal = p.Rslt_cred_bal_p_PPanel.columnAmt_amt;
		p.columnRslt_cred_bal.addAliasName("Rslt.cred_bal", p);
		p.Rslt_alarm_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBG.MSBGP0270.RsltR.$alarm_amt_p);
		p.Rslt_alarm_amt_p_PPanel.setName("Rslt.alarm_amt_p");
		p.columnRslt_alarm_amt = p.Rslt_alarm_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_alarm_amt.addAliasName("Rslt.alarm_amt", p);
		p.Rslt_bp_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBG.MSBGP0270.RsltR.$bp_grp_p);
		p.Rslt_bp_grp_p_PPanel.setName("Rslt.bp_grp_p");
		p.columnRslt_cred_grp_cd1 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_cred_grp_cd1.addAliasName("Rslt.cred_grp_cd1", p);
		p.columnRslt_cred_grp_nm1 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_cred_grp_nm1.addAliasName("Rslt.cred_grp_nm1", p);
		p.columnRslt_cred_grp_cd2 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_cred_grp_cd2.addAliasName("Rslt.cred_grp_cd2", p);
		p.columnRslt_cred_grp_nm2 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_cred_grp_nm2.addAliasName("Rslt.cred_grp_nm2", p);
		p.columnRslt_cred_grp_cd3 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_cred_grp_cd3.addAliasName("Rslt.cred_grp_cd3", p);
		p.columnRslt_cred_grp_nm3 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_cred_grp_nm3.addAliasName("Rslt.cred_grp_nm3", p);
		p.columnRslt_cred_grp_cd4 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_cred_grp_cd4.addAliasName("Rslt.cred_grp_cd4", p);
		p.columnRslt_cred_grp_nm4 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_cred_grp_nm4.addAliasName("Rslt.cred_grp_nm4", p);
		p.columnRslt_cred_grp_cd5 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_cred_grp_cd5.addAliasName("Rslt.cred_grp_cd5", p);
		p.columnRslt_cred_grp_nm5 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_cred_grp_nm5.addAliasName("Rslt.cred_grp_nm5", p);
		p.columnRslt_cred_grp_cd6 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_cred_grp_cd6.addAliasName("Rslt.cred_grp_cd6", p);
		p.columnRslt_cred_grp_nm6 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_cred_grp_nm6.addAliasName("Rslt.cred_grp_nm6", p);
		p.columnRslt_cred_grp_cd7 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_cred_grp_cd7.addAliasName("Rslt.cred_grp_cd7", p);
		p.columnRslt_cred_grp_nm7 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_cred_grp_nm7.addAliasName("Rslt.cred_grp_nm7", p);
		p.columnRslt_cred_grp_cd8 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_cred_grp_cd8.addAliasName("Rslt.cred_grp_cd8", p);
		p.columnRslt_cred_grp_nm8 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_cred_grp_nm8.addAliasName("Rslt.cred_grp_nm8", p);
		p.columnRslt_cred_grp_cd9 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_cred_grp_cd9.addAliasName("Rslt.cred_grp_cd9", p);
		p.columnRslt_cred_grp_nm9 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_cred_grp_nm9.addAliasName("Rslt.cred_grp_nm9", p);
		p.columnRslt_cred_grp_cd10 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_cred_grp_cd10.addAliasName("Rslt.cred_grp_cd10", p);
		p.columnRslt_cred_grp_nm10 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_cred_grp_nm10.addAliasName("Rslt.cred_grp_nm10", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBGP_CredSrch p) {
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

	
	/** [Cnd_cred_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cred_cd_p = null;

	/**
	 * [Cnd_cred_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cred_cd_ListPutter() {
		if (Cnd_cred_cd_p == null) {
			Cnd_cred_cd_p = createCnd_cred_cd_ListPutter(Cnd_cred_cd, "cred_cd", "cred_nm");

		}
		return Cnd_cred_cd_p;
	}
	
	
	/** [Cnd_cur_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cur_cd_p = null;

	/**
	 * [Cnd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cur_cd_ListPutter() {
		if (Cnd_cur_cd_p == null) {
			Cnd_cur_cd_p = createCnd_cur_cd_ListPutter(Cnd_cur_cd, "cur_cd", "cur_nm");

		}
		return Cnd_cur_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_CredSrch create(){
		MSBGP_CredSrch p = new MSBGP_CredSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBGP_CredSrch create(String name){
		MSBGP_CredSrch p = new MSBGP_CredSrch(name);
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
		MSBGP_CredSrch_MC.jbfInitTop((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbfInitFold((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbfInitTab1((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbfInitTab2((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbfInitCnd((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbfInitCnd2((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbfInitCtrl((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbfInitRPnl((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbfInitRslt((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbfInitBtn((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbInitTop((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbInitFold((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbInitTab1((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbInitTab2((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbInitCnd((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbInitCnd2((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbInitCtrl((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbInitRPnl((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbInitRslt((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.jbInitBtn((MSBGP_CredSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBGP_CredSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBGP_CredSrch p) {
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
	protected static void jbfInitTab1(MSBGP_CredSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBGP_CredSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBGP_CredSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_cred_cd_Label = p.beansFactory.createLabel("Cnd.cred_cd_Label");
		p.Cnd_cred_cd = p.beansFactory.createTextField("Cnd.cred_cd");
		p.Cnd_cred_cd.setLabel(p.Cnd_cred_cd_Label);
		p.Cnd_cred_nm = p.beansFactory.createTextField("Cnd.cred_nm");
		p.Cnd_cur_cd_Label = p.beansFactory.createLabel("Cnd.cur_cd_Label");
		p.Cnd_cur_cd = p.beansFactory.createTextComboBox("Cnd.cur_cd");
		p.Cnd_cur_cd.setLabel(p.Cnd_cur_cd_Label);
		p.Cnd_cur_nm = p.beansFactory.createTextField("Cnd.cur_nm");
		p.Cnd_cred_use_fr_Label = p.beansFactory.createLabel("Cnd.cred_use_fr_Label");
		p.Cnd_cred_use_fr = p.beansFactory.createNumberField("Cnd.cred_use_fr");
		p.Cnd_cred_use_fr.setLabel(p.Cnd_cred_use_fr_Label);
		p.Cnd_cred_use_to_Label = p.beansFactory.createLabel("Cnd.cred_use_to_Label");
		p.Cnd_cred_use_to = p.beansFactory.createNumberField("Cnd.cred_use_to");
		p.Cnd_cred_use_to.setLabel(p.Cnd_cred_use_to_Label);
		p.Cnd_cred_amt_fr_Label = p.beansFactory.createLabel("Cnd.cred_amt_fr_Label");
		p.Cnd_cred_amt_fr = p.beansFactory.createNumberField("Cnd.cred_amt_fr");
		p.Cnd_cred_amt_fr.setLabel(p.Cnd_cred_amt_fr_Label);
		p.Cnd_cred_amt_to_Label = p.beansFactory.createLabel("Cnd.cred_amt_to_Label");
		p.Cnd_cred_amt_to = p.beansFactory.createNumberField("Cnd.cred_amt_to");
		p.Cnd_cred_amt_to.setLabel(p.Cnd_cred_amt_to_Label);
		p.Cnd_alarm_flg = p.beansFactory.createCheckBox("Cnd.alarm_flg");
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBGP_CredSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBGP_CredSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBGP_CredSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBGP_CredSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_cred_cd = p.beansFactory.createTableColumn("Rslt.cred_cd", MCColumnType.TEXT);
		p.columnRslt_cred_nm = p.beansFactory.createTableColumn("Rslt.cred_nm", MCColumnType.TEXT);
		p.columnRslt_cur_cd = p.beansFactory.createTableColumn("Rslt.cur_cd", MCColumnType.TEXT);
		p.columnRslt_cur_nm = p.beansFactory.createTableColumn("Rslt.cur_nm", MCColumnType.TEXT);
		p.columnRslt_amt_dec_place = p.beansFactory.createTableColumn("Rslt.amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_cred_use = p.beansFactory.createTableColumn("Rslt.cred_use", MCColumnType.NUMBER);
		p.columnRslt_alarm_point = p.beansFactory.createTableColumn("Rslt.alarm_point", MCColumnType.NUMBER);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
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
		p.cgRslt_title = p.beansFactory.createColumnGroup("Rslt.title");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBGP_CredSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBGP0280 = p.beansFactory.createButton("Btn.open_MSBGP0280", "open");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBGP_CredSrch p) {
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
	protected static void jbInitFold(MSBGP_CredSrch p) {
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
	protected static void jbInitTab1(MSBGP_CredSrch p) {
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
	protected static void jbInitTab2(MSBGP_CredSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Cnd2Panel, null);
		p.Tab2Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBGP_CredSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_cred_cd_Label);
		p.CndPanel.add(p.Cnd_cred_cd);
		p.CndPanel.setLastBeans(p.Cnd_cred_cd);
		p.Cnd_cred_cd.setNextBeans(p.Cnd_cred_nm);
		p.Cnd_cred_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0270.CndR.cred_cd_META);
		p.Cnd_cred_cd.addLinkBeans(p.Cnd_cred_nm);
		p.Cnd_cred_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cred_cd, true);
		p.CndPanel.add(p.Cnd_cred_nm);
		p.Cnd_cred_nm.setNextBeans(p.Cnd_cur_cd);
		p.Cnd_cred_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0270.CndR.cred_nm_META);
		p.setPluralValueEnable(p.Cnd_cred_nm, true);
		p.Cnd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cur_cd, true);
		p.Cnd_cur_cd.setLinkBeans(p.Cnd_cur_nm);
		p.CndPanel.add(p.Cnd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_cur_cd);
		p.Cnd_cur_cd.setNextBeans(p.Cnd_cur_nm);
		p.Cnd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0270.CndR.cur_cd_META);
		p.CndPanel.add(p.Cnd_cur_nm);
		p.Cnd_cur_nm.setNextBeans(p.Cnd_cred_use_fr);
		p.Cnd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0270.CndR.cur_nm_META);
		p.setPluralValueEnable(p.Cnd_cur_nm, true);
		p.CndPanel.add(p.Cnd_cred_use_fr_Label);
		p.CndPanel.add(p.Cnd_cred_use_fr);
		p.Cnd_cred_use_fr.setNextBeans(p.Cnd_cred_use_to);
		p.Cnd_cred_use_fr.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0270.CndR.cred_use_fr_META);
		p.Cnd_cred_use_fr.setMinusEnable(true);
		p.CndPanel.add(p.Cnd_cred_use_to_Label);
		p.CndPanel.add(p.Cnd_cred_use_to);
		p.Cnd_cred_use_to.setNextBeans(p.Cnd_cred_amt_fr);
		p.Cnd_cred_use_to.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0270.CndR.cred_use_to_META);
		p.Cnd_cred_use_to.setMinusEnable(true);
		p.CndPanel.add(p.Cnd_cred_amt_fr_Label);
		p.CndPanel.add(p.Cnd_cred_amt_fr);
		p.Cnd_cred_amt_fr.setNextBeans(p.Cnd_cred_amt_to);
		p.Cnd_cred_amt_fr.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0270.CndR.cred_amt_fr_META);
		p.Cnd_cred_amt_fr.setMinusEnable(true);
		p.CndPanel.add(p.Cnd_cred_amt_to_Label);
		p.CndPanel.add(p.Cnd_cred_amt_to);
		p.Cnd_cred_amt_to.setNextBeans(p.Cnd_alarm_flg);
		p.Cnd_cred_amt_to.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0270.CndR.cred_amt_to_META);
		p.Cnd_cred_amt_to.setMinusEnable(true);
		p.CndPanel.add(p.Cnd_alarm_flg);
		p.Cnd_alarm_flg.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_alarm_flg.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0270.CndR.alarm_flg_META);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0270.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0270.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBG.MSBGP0270.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.Cnd2Panel.add(p.Cnd_bp_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_bp_grp_p_PPanel);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBGP_CredSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBGP_CredSrch p) {
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
	protected static void jbInitRPnl(MSBGP_CredSrch p) {
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
	protected static void jbInitRslt(MSBGP_CredSrch p) {
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
	protected static void jbInitBtn(MSBGP_CredSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBGP0280.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBGP0280);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBGP0280);
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
		MSBGP_CredSrch_MC.mcInitTop((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.mcInitFold((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.mcInitTab1((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.mcInitTab2((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.mcInitCnd((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.mcInitCnd2((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.mcInitCtrl((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.mcInitRPnl((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.mcInitRslt((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.mcInitBtn((MSBGP_CredSrch)this);

		// [SRCH]ステータスのモードの設定
		MSBGP_CredSrch_MC.statusInitSRCH_Top((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.statusInitSRCH_Fold((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.statusInitSRCH_Tab1((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.statusInitSRCH_Tab2((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.statusInitSRCH_Cnd((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.statusInitSRCH_Cnd2((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.statusInitSRCH_Ctrl((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.statusInitSRCH_RPnl((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.statusInitSRCH_Rslt((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.statusInitSRCH_Btn((MSBGP_CredSrch)this);

		// [REF]ステータスのモードの設定
		MSBGP_CredSrch_MC.statusInitREF_Top((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.statusInitREF_Fold((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.statusInitREF_Tab1((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.statusInitREF_Tab2((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.statusInitREF_Cnd((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.statusInitREF_Cnd2((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.statusInitREF_Ctrl((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.statusInitREF_RPnl((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.statusInitREF_Rslt((MSBGP_CredSrch)this);
		MSBGP_CredSrch_MC.statusInitREF_Btn((MSBGP_CredSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBGP_CredSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBGP_CredSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBGP_CredSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBGP_CredSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBGP_CredSrch p) {
		p.Cnd_cred_cd.setListListener(p);
		p.Cnd_cred_cd.addAllListener(p);
		p.Cnd_cred_nm.setListListener(p);
		p.Cnd_cred_nm.addAllListener(p);
		p.Cnd_cur_cd.setListListener(p);
		p.Cnd_cur_cd.addAllListener(p);
		p.Cnd_cur_nm.setListListener(p);
		p.Cnd_cur_nm.addAllListener(p);
		p.Cnd_cred_use_fr.setListListener(p);
		p.Cnd_cred_use_fr.addAllListener(p);
		p.Cnd_cred_use_to.setListListener(p);
		p.Cnd_cred_use_to.addAllListener(p);
		p.Cnd_cred_amt_fr.setListListener(p);
		p.Cnd_cred_amt_fr.addAllListener(p);
		p.Cnd_cred_amt_to.setListListener(p);
		p.Cnd_cred_amt_to.addAllListener(p);
		p.Cnd_alarm_flg.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBGP_CredSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBGP_CredSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBGP_CredSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBGP_CredSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_cred_cd.addAllListener(p);
		p.columnRslt_cred_cd.setListListener(p);
		p.columnRslt_cred_nm.addAllListener(p);
		p.columnRslt_cred_nm.setListListener(p);
		p.columnRslt_cur_cd.addAllListener(p);
		p.columnRslt_cur_cd.setListListener(p);
		p.columnRslt_cur_nm.addAllListener(p);
		p.columnRslt_cur_nm.setListListener(p);
		p.columnRslt_amt_dec_place.addAllListener(p);
		p.columnRslt_amt_dec_place.setListListener(p);
		p.columnRslt_cred_use.addAllListener(p);
		p.columnRslt_cred_use.setListListener(p);
		p.columnRslt_alarm_point.addAllListener(p);
		p.columnRslt_alarm_point.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
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
	protected static void mcInitBtn(MSBGP_CredSrch p) {
		p.Btn_open_MSBGP0280.addAllListener(p);
		p.Btn_open_MSBGP0280.setAPMethodName("doBtn_open_MSBGP0280");
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBGP_CredSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBGP_CredSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBGP_CredSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBGP_CredSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBGP_CredSrch p){
		p.Cnd_cred_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cred_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cred_use_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cred_use_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cred_amt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cred_amt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_alarm_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sub_char1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MSBGP_CredSrch p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBGP_CredSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MSBGP_CredSrch p){
		p.RPnl_dwnld.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBGP_CredSrch p){
		p.columnRslt_cred_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cred_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_cred_limit_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_cred_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ar_cred_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ap_cred_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_cred_bal_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_cred_use.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alarm_point.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_alarm_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_bp_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
	protected static void statusInitSRCH_Btn(MSBGP_CredSrch p){
		p.Btn_open_MSBGP0280.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBGP_CredSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBGP_CredSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBGP_CredSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBGP_CredSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBGP_CredSrch p){
		p.Cnd_cred_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cred_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cred_use_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cred_use_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cred_amt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cred_amt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_alarm_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MSBGP_CredSrch p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBGP_CredSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBGP_CredSrch p){
		p.RPnl_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBGP_CredSrch p){
		p.columnRslt_cred_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cred_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_cred_limit_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_cred_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ar_cred_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_ap_cred_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_cred_bal_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_cred_use.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alarm_point.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_alarm_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_bp_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
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
	protected static void statusInitREF_Btn(MSBGP_CredSrch p){
		p.Btn_open_MSBGP0280.putMode(p, REF, MCMode.ENABLE);

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
		MSBGP_CredSrch_MC.setTableConfigRslt((MSBGP_CredSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBGP_CredSrch p) {
		p.columnRslt_cred_cd.setMeta(mcframe.clientMSBG.MSBGP0270.RsltR.cred_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cred_cd);
		p.columnRslt_cred_nm.setMeta(mcframe.clientMSBG.MSBGP0270.RsltR.cred_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cred_nm);
		p.columnRslt_cur_cd.setMeta(mcframe.clientMSBG.MSBGP0270.RsltR.cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cur_cd);
		p.columnRslt_cur_nm.setMeta(mcframe.clientMSBG.MSBGP0270.RsltR.cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cur_nm);
		p.columnRslt_amt_dec_place.setMeta(mcframe.clientMSBG.MSBGP0270.RsltR.amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt_dec_place);
		p.RsltTable.addTable(p.Rslt_cred_limit_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_cred_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ar_cred_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_ap_cred_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_cred_bal_p_PPanel.AmtTable);
		p.columnRslt_cred_use.setMeta(mcframe.clientMSBG.MSBGP0270.RsltR.cred_use_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cred_use);
		p.columnRslt_alarm_point.setMeta(mcframe.clientMSBG.MSBGP0270.RsltR.alarm_point_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alarm_point);
		p.RsltTable.addTable(p.Rslt_alarm_amt_p_PPanel.AmtTable);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBG.MSBGP0270.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBG.MSBGP0270.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBG.MSBGP0270.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.RsltTable.addTable(p.Rslt_bp_grp_p_PPanel.BpGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBG.MSBGP0270.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0270.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBG.MSBGP0270.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBG.MSBGP0270.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBG.MSBGP0270.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBG.MSBGP0270.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBG.MSBGP0270.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBG.MSBGP0270.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBG.MSBGP0270.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBG.MSBGP0270.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBG.MSBGP0270.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.RsltTable.addColumnGroup(p.Rslt_cred_limit_p_PPanel.AmtTable);
		p.RsltTable.addColumnGroup(p.Rslt_cred_amt_p_PPanel.AmtTable);
		p.cgRslt_title.add(p.Rslt_ar_cred_amt_p_PPanel.AmtTable);
		p.cgRslt_title.add(p.Rslt_ap_cred_amt_p_PPanel.AmtTable);
		p.RsltTable.addColumnGroup(p.cgRslt_title);
		p.RsltTable.addColumnGroup(p.Rslt_cred_bal_p_PPanel.AmtTable);
		p.RsltTable.addColumnGroup(p.Rslt_alarm_amt_p_PPanel.AmtTable);
		p.RsltTable.addColumnGroup(p.Rslt_bp_grp_p_PPanel.BpGrpTable);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_cred_cd.getListConfig().setPutter(getCnd_cred_cd_ListPutter());
		Cnd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cur_cd.getListConfig().setPutter(getCnd_cur_cd_ListPutter());
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
	 * [Cnd_cred_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cred_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_cred_cd) return getCnd_cred_cd(row, info);
		if(combo == Cnd_cur_cd) return getCnd_cur_cd(row, info);
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
		else if (ap == Btn_open_MSBGP0280) doBtn_open_MSBGP0280(info);
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
	 * [Btn]パネルの[open_MSBGP0280]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBGP0280(MCEventInfo info);

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
		if (vc == Cnd_cred_cd) return doCnd_cred_cd_VC(info);
		if (vc == Cnd_cred_nm) return doCnd_cred_nm_VC(info);
		if (vc == Cnd_cur_cd) return doCnd_cur_cd_VC(info);
		if (vc == Cnd_cur_nm) return doCnd_cur_nm_VC(info);
		if (vc == Cnd_cred_use_fr) return doCnd_cred_use_fr_VC(info);
		if (vc == Cnd_cred_use_to) return doCnd_cred_use_to_VC(info);
		if (vc == Cnd_cred_amt_fr) return doCnd_cred_amt_fr_VC(info);
		if (vc == Cnd_cred_amt_to) return doCnd_cred_amt_to_VC(info);
		if (vc == Cnd_alarm_flg) return doCnd_alarm_flg_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == columnRslt_cred_cd) return doRslt_cred_cd_VC(info);
		if (vc == columnRslt_cred_nm) return doRslt_cred_nm_VC(info);
		if (vc == columnRslt_cur_cd) return doRslt_cur_cd_VC(info);
		if (vc == columnRslt_cur_nm) return doRslt_cur_nm_VC(info);
		if (vc == columnRslt_amt_dec_place) return doRslt_amt_dec_place_VC(info);
		if (vc == columnRslt_cred_use) return doRslt_cred_use_VC(info);
		if (vc == columnRslt_alarm_point) return doRslt_alarm_point_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
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
	 * [Cnd]パネルの[cred_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cred_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cred_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cred_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cred_use_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cred_use_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cred_use_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cred_use_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cred_amt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cred_amt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cred_amt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cred_amt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alarm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alarm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cred_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cred_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cred_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cred_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cur_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[cred_use]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cred_use_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alarm_point]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alarm_point_VC(MCEventInfo info){
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
		else if (nc == Cnd_cred_cd) doCnd_cred_cd_NC(info);
		else if (nc == Cnd_cred_nm) doCnd_cred_nm_NC(info);
		else if (nc == Cnd_cur_cd) doCnd_cur_cd_NC(info);
		else if (nc == Cnd_cur_nm) doCnd_cur_nm_NC(info);
		else if (nc == Cnd_cred_use_fr) doCnd_cred_use_fr_NC(info);
		else if (nc == Cnd_cred_use_to) doCnd_cred_use_to_NC(info);
		else if (nc == Cnd_cred_amt_fr) doCnd_cred_amt_fr_NC(info);
		else if (nc == Cnd_cred_amt_to) doCnd_cred_amt_to_NC(info);
		else if (nc == Cnd_alarm_flg) doCnd_alarm_flg_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == columnRslt_cred_cd) doRslt_cred_cd_NC(info);
		else if (nc == columnRslt_cred_nm) doRslt_cred_nm_NC(info);
		else if (nc == columnRslt_cur_cd) doRslt_cur_cd_NC(info);
		else if (nc == columnRslt_cur_nm) doRslt_cur_nm_NC(info);
		else if (nc == columnRslt_amt_dec_place) doRslt_amt_dec_place_NC(info);
		else if (nc == columnRslt_cred_use) doRslt_cred_use_NC(info);
		else if (nc == columnRslt_alarm_point) doRslt_alarm_point_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
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
	 * [Cnd]パネルの[cred_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_use_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_use_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_use_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_use_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_amt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_amt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_amt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_amt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alarm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alarm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cred_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cred_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cred_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cred_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cred_use]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cred_use_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alarm_point]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alarm_point_NC(MCEventInfo info){
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
		else if (ne == Cnd_cred_cd) doCnd_cred_cd_NE(info);
		else if (ne == Cnd_cred_nm) doCnd_cred_nm_NE(info);
		else if (ne == Cnd_cur_cd) doCnd_cur_cd_NE(info);
		else if (ne == Cnd_cur_nm) doCnd_cur_nm_NE(info);
		else if (ne == Cnd_cred_use_fr) doCnd_cred_use_fr_NE(info);
		else if (ne == Cnd_cred_use_to) doCnd_cred_use_to_NE(info);
		else if (ne == Cnd_cred_amt_fr) doCnd_cred_amt_fr_NE(info);
		else if (ne == Cnd_cred_amt_to) doCnd_cred_amt_to_NE(info);
		else if (ne == Cnd_alarm_flg) doCnd_alarm_flg_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == columnRslt_cred_cd) doRslt_cred_cd_NE(info);
		else if (ne == columnRslt_cred_nm) doRslt_cred_nm_NE(info);
		else if (ne == columnRslt_cur_cd) doRslt_cur_cd_NE(info);
		else if (ne == columnRslt_cur_nm) doRslt_cur_nm_NE(info);
		else if (ne == columnRslt_amt_dec_place) doRslt_amt_dec_place_NE(info);
		else if (ne == columnRslt_cred_use) doRslt_cred_use_NE(info);
		else if (ne == columnRslt_alarm_point) doRslt_alarm_point_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
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
	 * [Cnd]パネルの[cred_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_use_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_use_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_use_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_use_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_amt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_amt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_amt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_amt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alarm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alarm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cred_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cred_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cred_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cred_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cred_use]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cred_use_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alarm_point]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alarm_point_NE(MCEventInfo info){
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
		else if (nx == Cnd_cred_cd) doCnd_cred_cd_NX(info);
		else if (nx == Cnd_cred_nm) doCnd_cred_nm_NX(info);
		else if (nx == Cnd_cur_cd) doCnd_cur_cd_NX(info);
		else if (nx == Cnd_cur_nm) doCnd_cur_nm_NX(info);
		else if (nx == Cnd_cred_use_fr) doCnd_cred_use_fr_NX(info);
		else if (nx == Cnd_cred_use_to) doCnd_cred_use_to_NX(info);
		else if (nx == Cnd_cred_amt_fr) doCnd_cred_amt_fr_NX(info);
		else if (nx == Cnd_cred_amt_to) doCnd_cred_amt_to_NX(info);
		else if (nx == Cnd_alarm_flg) doCnd_alarm_flg_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == columnRslt_cred_cd) doRslt_cred_cd_NX(info);
		else if (nx == columnRslt_cred_nm) doRslt_cred_nm_NX(info);
		else if (nx == columnRslt_cur_cd) doRslt_cur_cd_NX(info);
		else if (nx == columnRslt_cur_nm) doRslt_cur_nm_NX(info);
		else if (nx == columnRslt_amt_dec_place) doRslt_amt_dec_place_NX(info);
		else if (nx == columnRslt_cred_use) doRslt_cred_use_NX(info);
		else if (nx == columnRslt_alarm_point) doRslt_alarm_point_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
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
	 * [Cnd]パネルの[cred_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_use_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_use_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_use_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_use_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_amt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_amt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_amt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_amt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alarm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alarm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cred_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cred_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cred_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cred_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cred_use]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cred_use_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alarm_point]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alarm_point_NX(MCEventInfo info){
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
		if (lc == Cnd_cred_cd) doCnd_cred_cd_LC(info);
		else if (lc == Cnd_cred_nm) doCnd_cred_nm_LC(info);
		else if (lc == Cnd_cur_cd) doCnd_cur_cd_LC(info);
		else if (lc == Cnd_cur_nm) doCnd_cur_nm_LC(info);
		else if (lc == Cnd_cred_use_fr) doCnd_cred_use_fr_LC(info);
		else if (lc == Cnd_cred_use_to) doCnd_cred_use_to_LC(info);
		else if (lc == Cnd_cred_amt_fr) doCnd_cred_amt_fr_LC(info);
		else if (lc == Cnd_cred_amt_to) doCnd_cred_amt_to_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == columnRslt_cred_cd) doRslt_cred_cd_LC(info);
		else if (lc == columnRslt_cred_nm) doRslt_cred_nm_LC(info);
		else if (lc == columnRslt_cur_cd) doRslt_cur_cd_LC(info);
		else if (lc == columnRslt_cur_nm) doRslt_cur_nm_LC(info);
		else if (lc == columnRslt_amt_dec_place) doRslt_amt_dec_place_LC(info);
		else if (lc == columnRslt_cred_use) doRslt_cred_use_LC(info);
		else if (lc == columnRslt_alarm_point) doRslt_alarm_point_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
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
	 * [Cnd]パネルの[cred_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_use_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_use_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_use_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_use_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_amt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_amt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_amt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_amt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cred_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cred_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cred_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cred_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cred_use]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cred_use_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alarm_point]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alarm_point_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_cred_cd]の作成メソッド
	 */
	public MCList getCnd_cred_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBGL0270.Srch01")) {
			return new MS_MSBGL0270_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBGL0270_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBGL0270_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBGL0270_Srch01;

		/** コンストラクタ */
		protected MS_MSBGL0270_Srch01Bridge() {
			p_MS_MSBGL0270_Srch01 = new MCParam(PDef.MS_MSBGL0270_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBGL0270_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBG.MSBGP0270.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0270.RsltR.class));

			p_MS_MSBGL0270_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBGL0270_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBGL0270_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBGL0270_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBGL0270_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBG.MSBGP0270.CndR up0() {
			return (mcframe.clientMSBG.MSBGP0270.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBG.MSBGP0270.RsltR> down0() {
			return (MCList<mcframe.clientMSBG.MSBGP0270.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBGL0270_Srch01.addDownBlock(MCList.create(mcframe.clientMSBG.MSBGP0270.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBGL0270_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBG.MSBGP0270.RsltR>)p_MS_MSBGL0270_Srch01.getContainerParam().getDownBlock(0));
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