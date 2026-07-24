package mcframe.clientMSBH.MSBHP0100;

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
import mcframe.clientMSBH.MSBHP0100.MSBHP_PayActListReg_MC.MS_MSBHL0100_Srch01Caller;
import mcframe.clientMSBH.MSBHP0100.MSBHP_PayActListReg_MC.MS_MSBHL0100_Srch02Caller;
import mcframe.clientMSBH.MSBHP0100.MSBHP_PayActListReg_MC.MS_MSBHL0100_Srch03Caller;
import mcframe.clientMSBH.MSBHP0100.MSBHP_PayActListReg_MC.MS_MSBHL0100_Ins01Caller;
import mcframe.clientMSBH.MSBHP0100.MSBHP_PayActListReg_MC.MS_MSBHL0100_Del01Caller;
import mcframe.clientMSBH.MSBHP0100.MSBHP_PayActListReg_MC.MS_MSBHL0100_Prnt01Caller;

/**
 * 画面"MSBHP_PayActListReg"パネルクラスです。<p>
 *
 * 支払実績を一覧形式で登録します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHP_PayActListReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBHP0100";

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
	// [SrchMode]ブロック関連のField定義
	public MCPanel SrchModePanel = null;
	public MCTitledBorder SrchModeTitledBorder = null;
	// [SrchMode]ブロックの項目のField定義
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
	// [Psppl]ブロック関連のField定義
	public MCPanel PspplPanel = null;
	// [Psppl]ブロックの項目のField定義
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [Bsppl]ブロック関連のField定義
	public MCPanel BspplPanel = null;
	// [Bsppl]ブロックの項目のField定義
	// [Tab4]ブロック関連のField定義
	public MCPanel Tab4Panel = null;
	// [Tab4]ブロックの項目のField定義
	// [Asppl]ブロック関連のField定義
	public MCPanel AspplPanel = null;
	// [Asppl]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * INS,Create;DEL,Cancel;REF,View;PRNT,Issue report INS,登録する;DEL,取り消す;REF,参照する;PRNT,帳票発行;.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCRadioButton Cnd_ope_PRNT = null;
	/**
	 * PAYSCHD,Payment schedule unit,PAYSCHD;PAYACTD,Payment result details unit,PAYACTD;SW,Transfer slip unit,SW PAYSCHD,支払予定単位,PAYSCHD;PAYACTD,支払実績明細単位,PAYACTD;SW,振替伝票単位,SW.<p>
	 *
	 */
	public MCButtonGroup Cnd_mode_Group = null;
	public MCRadioButton Cnd_mode_PAYSCHD = null;
	public MCRadioButton Cnd_mode_PAYACTD = null;
	public MCRadioButton Cnd_mode_SW = null;
	public MCLabel Cnd_pay_schd_dt_fr_Label = null;
	/**
	 * Scheduled payment date FROM 支払予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_pay_schd_dt_fr = null;
	public MCLabel Cnd_pay_schd_dt_to_Label = null;
	/**
	 * Scheduled payment date TO 支払予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_pay_schd_dt_to = null;
	public MCLabel Cnd_pay_act_dt_fr_Label = null;
	/**
	 * Actual payment date FROM 支払実績日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_pay_act_dt_fr = null;
	public MCLabel Cnd_pay_act_dt_to_Label = null;
	/**
	 * Actual payment date TO 支払実績日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_pay_act_dt_to = null;
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
	public MCLabel Cnd_bsppl_cl_dt_fr_Label = null;
	/**
	 * Scheduled payee closing year, month, and date FROM 支払予定管理先締年月日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_bsppl_cl_dt_fr = null;
	public MCLabel Cnd_bsppl_cl_dt_to_Label = null;
	/**
	 * Scheduled payee closing year, month, and date TO 支払予定管理先締年月日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_bsppl_cl_dt_to = null;
	public MCLabel Cnd_psppl_cd_Label = null;
	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_psppl_cd = null;
	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public MCTextField Cnd_psppl_nm = null;
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
	public MCLabel Cnd_pay_usr_cd_Label = null;
	/**
	 * Payment PIC cd. 支払担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_pay_usr_cd = null;
	/**
	 * Payment PIC name 支払担当者名.<p>
	 *
	 */
	public MCTextField Cnd_pay_usr_nm = null;
	public MCLabel Cnd_pay_dpt_cd_Label = null;
	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_pay_dpt_cd = null;
	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public MCTextField Cnd_pay_dpt_nm = null;
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
	public MCLabel Cnd_bsppl_usr_cd_Label = null;
	/**
	 * Scheduled payee PIC cd. 支払予定管理先担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_usr_cd = null;
	/**
	 * Scheduled payee PIC name 支払予定管理先担当者名.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_usr_nm = null;
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
	public MCLabel Cnd_trd_cur_cd_Label = null;
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_trd_cur_cd = null;
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public MCTextField Cnd_trd_cur_nm = null;
	public MCLabel Cnd_ap_sttl_cd_Label = null;
	/**
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ap_sttl_cd = null;
	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public MCTextField Cnd_ap_sttl_nm = null;
	public MCLabel Cnd_purc_act_no_Label = null;
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_purc_act_no = null;
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
	public mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H Cnd_wrk_no_p_PPanel;
	public MCTextField Cnd_wrk_no;	// [Cnd]の[wrk_no_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[wrk_no_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_pay_chk_no_Label = null;
	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_pay_chk_no = null;
	public MCLabel Cnd_pay_schd_no_Label = null;
	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_pay_schd_no = null;
	public MCLabel Cnd_pay_act_no_Label = null;
	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_pay_act_no = null;
	public MCLabel Cnd_note_no_Label = null;
	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public MCTextField Cnd_note_no = null;
	public MCLabel Cnd_trd_rmrks_Label = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCTextField Cnd_trd_rmrks = null;
	public MCLabel Cnd_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Cnd_intr_rmrks = null;
	public MCLabel Cnd_trd_d_rmrks_Label = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCTextField Cnd_trd_d_rmrks = null;
	public MCLabel Cnd_intr_d_rmrks_Label = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCTextField Cnd_intr_d_rmrks = null;
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
	public MCLabel Cnd_dtl_sub_char1_Label = null;
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public MCTextField Cnd_dtl_sub_char1 = null;
	public MCLabel Cnd_dtl_sub_char2_Label = null;
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public MCTextField Cnd_dtl_sub_char2 = null;
	public MCLabel Cnd_dtl_sub_char3_Label = null;
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public MCTextField Cnd_dtl_sub_char3 = null;
	/**
	 * Include invalid/cancel 無効・取消含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_can_flg = null;
	/**
	 * Include result at schedule 予定時実績含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_schd_act_flg = null;
	/**
	 * Include transferred 振替済含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_sw_flg = null;
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_psppl_grp_p_PPanel;
	public MCLabel Cnd_psppl_grp_lab1;	// [Cnd]の[psppl_grp_p.bp_grp_lab1]を[Cnd_psppl_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_psppl_grp_flg1;	// [Cnd]の[psppl_grp_p.bp_grp_flg1]を[Cnd_psppl_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_psppl_grp_cd1;	// [Cnd]の[psppl_grp_p.bp_grp_cd1]を[Cnd_psppl_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_psppl_grp_nm1;	// [Cnd]の[psppl_grp_p.bp_grp_nm1]を[Cnd_psppl_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_psppl_grp_lab2;	// [Cnd]の[psppl_grp_p.bp_grp_lab2]を[Cnd_psppl_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_psppl_grp_flg2;	// [Cnd]の[psppl_grp_p.bp_grp_flg2]を[Cnd_psppl_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_psppl_grp_cd2;	// [Cnd]の[psppl_grp_p.bp_grp_cd2]を[Cnd_psppl_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_psppl_grp_nm2;	// [Cnd]の[psppl_grp_p.bp_grp_nm2]を[Cnd_psppl_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_psppl_grp_lab3;	// [Cnd]の[psppl_grp_p.bp_grp_lab3]を[Cnd_psppl_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_psppl_grp_flg3;	// [Cnd]の[psppl_grp_p.bp_grp_flg3]を[Cnd_psppl_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_psppl_grp_cd3;	// [Cnd]の[psppl_grp_p.bp_grp_cd3]を[Cnd_psppl_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_psppl_grp_nm3;	// [Cnd]の[psppl_grp_p.bp_grp_nm3]を[Cnd_psppl_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_psppl_grp_lab4;	// [Cnd]の[psppl_grp_p.bp_grp_lab4]を[Cnd_psppl_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_psppl_grp_flg4;	// [Cnd]の[psppl_grp_p.bp_grp_flg4]を[Cnd_psppl_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_psppl_grp_cd4;	// [Cnd]の[psppl_grp_p.bp_grp_cd4]を[Cnd_psppl_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_psppl_grp_nm4;	// [Cnd]の[psppl_grp_p.bp_grp_nm4]を[Cnd_psppl_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_psppl_grp_lab5;	// [Cnd]の[psppl_grp_p.bp_grp_lab5]を[Cnd_psppl_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_psppl_grp_flg5;	// [Cnd]の[psppl_grp_p.bp_grp_flg5]を[Cnd_psppl_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_psppl_grp_cd5;	// [Cnd]の[psppl_grp_p.bp_grp_cd5]を[Cnd_psppl_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_psppl_grp_nm5;	// [Cnd]の[psppl_grp_p.bp_grp_nm5]を[Cnd_psppl_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_psppl_grp_lab6;	// [Cnd]の[psppl_grp_p.bp_grp_lab6]を[Cnd_psppl_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_psppl_grp_flg6;	// [Cnd]の[psppl_grp_p.bp_grp_flg6]を[Cnd_psppl_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_psppl_grp_cd6;	// [Cnd]の[psppl_grp_p.bp_grp_cd6]を[Cnd_psppl_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_psppl_grp_nm6;	// [Cnd]の[psppl_grp_p.bp_grp_nm6]を[Cnd_psppl_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_psppl_grp_lab7;	// [Cnd]の[psppl_grp_p.bp_grp_lab7]を[Cnd_psppl_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_psppl_grp_flg7;	// [Cnd]の[psppl_grp_p.bp_grp_flg7]を[Cnd_psppl_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_psppl_grp_cd7;	// [Cnd]の[psppl_grp_p.bp_grp_cd7]を[Cnd_psppl_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_psppl_grp_nm7;	// [Cnd]の[psppl_grp_p.bp_grp_nm7]を[Cnd_psppl_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_psppl_grp_lab8;	// [Cnd]の[psppl_grp_p.bp_grp_lab8]を[Cnd_psppl_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_psppl_grp_flg8;	// [Cnd]の[psppl_grp_p.bp_grp_flg8]を[Cnd_psppl_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_psppl_grp_cd8;	// [Cnd]の[psppl_grp_p.bp_grp_cd8]を[Cnd_psppl_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_psppl_grp_nm8;	// [Cnd]の[psppl_grp_p.bp_grp_nm8]を[Cnd_psppl_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_psppl_grp_lab9;	// [Cnd]の[psppl_grp_p.bp_grp_lab9]を[Cnd_psppl_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_psppl_grp_flg9;	// [Cnd]の[psppl_grp_p.bp_grp_flg9]を[Cnd_psppl_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_psppl_grp_cd9;	// [Cnd]の[psppl_grp_p.bp_grp_cd9]を[Cnd_psppl_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_psppl_grp_nm9;	// [Cnd]の[psppl_grp_p.bp_grp_nm9]を[Cnd_psppl_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_psppl_grp_lab10;	// [Cnd]の[psppl_grp_p.bp_grp_lab10]を[Cnd_psppl_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_psppl_grp_flg10;	// [Cnd]の[psppl_grp_p.bp_grp_flg10]を[Cnd_psppl_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_psppl_grp_cd10;	// [Cnd]の[psppl_grp_p.bp_grp_cd10]を[Cnd_psppl_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_psppl_grp_nm10;	// [Cnd]の[psppl_grp_p.bp_grp_nm10]を[Cnd_psppl_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_bsppl_grp_p_PPanel;
	public MCLabel Cnd_bsppl_grp_lab1;	// [Cnd]の[bsppl_grp_p.bp_grp_lab1]を[Cnd_bsppl_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg1;	// [Cnd]の[bsppl_grp_p.bp_grp_flg1]を[Cnd_bsppl_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd1;	// [Cnd]の[bsppl_grp_p.bp_grp_cd1]を[Cnd_bsppl_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm1;	// [Cnd]の[bsppl_grp_p.bp_grp_nm1]を[Cnd_bsppl_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab2;	// [Cnd]の[bsppl_grp_p.bp_grp_lab2]を[Cnd_bsppl_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg2;	// [Cnd]の[bsppl_grp_p.bp_grp_flg2]を[Cnd_bsppl_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd2;	// [Cnd]の[bsppl_grp_p.bp_grp_cd2]を[Cnd_bsppl_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm2;	// [Cnd]の[bsppl_grp_p.bp_grp_nm2]を[Cnd_bsppl_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab3;	// [Cnd]の[bsppl_grp_p.bp_grp_lab3]を[Cnd_bsppl_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg3;	// [Cnd]の[bsppl_grp_p.bp_grp_flg3]を[Cnd_bsppl_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd3;	// [Cnd]の[bsppl_grp_p.bp_grp_cd3]を[Cnd_bsppl_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm3;	// [Cnd]の[bsppl_grp_p.bp_grp_nm3]を[Cnd_bsppl_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab4;	// [Cnd]の[bsppl_grp_p.bp_grp_lab4]を[Cnd_bsppl_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg4;	// [Cnd]の[bsppl_grp_p.bp_grp_flg4]を[Cnd_bsppl_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd4;	// [Cnd]の[bsppl_grp_p.bp_grp_cd4]を[Cnd_bsppl_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm4;	// [Cnd]の[bsppl_grp_p.bp_grp_nm4]を[Cnd_bsppl_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab5;	// [Cnd]の[bsppl_grp_p.bp_grp_lab5]を[Cnd_bsppl_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg5;	// [Cnd]の[bsppl_grp_p.bp_grp_flg5]を[Cnd_bsppl_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd5;	// [Cnd]の[bsppl_grp_p.bp_grp_cd5]を[Cnd_bsppl_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm5;	// [Cnd]の[bsppl_grp_p.bp_grp_nm5]を[Cnd_bsppl_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab6;	// [Cnd]の[bsppl_grp_p.bp_grp_lab6]を[Cnd_bsppl_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg6;	// [Cnd]の[bsppl_grp_p.bp_grp_flg6]を[Cnd_bsppl_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd6;	// [Cnd]の[bsppl_grp_p.bp_grp_cd6]を[Cnd_bsppl_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm6;	// [Cnd]の[bsppl_grp_p.bp_grp_nm6]を[Cnd_bsppl_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab7;	// [Cnd]の[bsppl_grp_p.bp_grp_lab7]を[Cnd_bsppl_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg7;	// [Cnd]の[bsppl_grp_p.bp_grp_flg7]を[Cnd_bsppl_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd7;	// [Cnd]の[bsppl_grp_p.bp_grp_cd7]を[Cnd_bsppl_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm7;	// [Cnd]の[bsppl_grp_p.bp_grp_nm7]を[Cnd_bsppl_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab8;	// [Cnd]の[bsppl_grp_p.bp_grp_lab8]を[Cnd_bsppl_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg8;	// [Cnd]の[bsppl_grp_p.bp_grp_flg8]を[Cnd_bsppl_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd8;	// [Cnd]の[bsppl_grp_p.bp_grp_cd8]を[Cnd_bsppl_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm8;	// [Cnd]の[bsppl_grp_p.bp_grp_nm8]を[Cnd_bsppl_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab9;	// [Cnd]の[bsppl_grp_p.bp_grp_lab9]を[Cnd_bsppl_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg9;	// [Cnd]の[bsppl_grp_p.bp_grp_flg9]を[Cnd_bsppl_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd9;	// [Cnd]の[bsppl_grp_p.bp_grp_cd9]を[Cnd_bsppl_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm9;	// [Cnd]の[bsppl_grp_p.bp_grp_nm9]を[Cnd_bsppl_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_bsppl_grp_lab10;	// [Cnd]の[bsppl_grp_p.bp_grp_lab10]を[Cnd_bsppl_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_bsppl_grp_flg10;	// [Cnd]の[bsppl_grp_p.bp_grp_flg10]を[Cnd_bsppl_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_bsppl_grp_cd10;	// [Cnd]の[bsppl_grp_p.bp_grp_cd10]を[Cnd_bsppl_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_bsppl_grp_nm10;	// [Cnd]の[bsppl_grp_p.bp_grp_nm10]を[Cnd_bsppl_grp_nm10]としてエイリアス定義。
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
	// [BulkSet]ブロック関連のField定義
	public MCPanel BulkSetPanel = null;
	// [BulkSet]ブロックの項目のField定義
	public MCLabel BulkSet_pay_act_dt_Label = null;
	/**
	 * Actual payment date 支払実績日.<p>
	 *
	 */
	public MCDateField BulkSet_pay_act_dt = null;
	public mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H BulkSet_ac_dt_p_PPanel;
	public MCDateField BulkSet_ac_dt;	// [BulkSet]の[ac_dt_p.ac_dt]を[BulkSet_ac_dt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H BulkSet_pay_usr_dpt_p_PPanel;
	public MCTextField BulkSet_pay_usr_cd;	// [BulkSet]の[pay_usr_dpt_p.usr_cd]を[BulkSet_pay_usr_cd]としてエイリアス定義。
	public MCTextField BulkSet_pay_usr_nm;	// [BulkSet]の[pay_usr_dpt_p.usr_nm]を[BulkSet_pay_usr_nm]としてエイリアス定義。
	public MCTextComboBox BulkSet_pay_dpt_cd;	// [BulkSet]の[pay_usr_dpt_p.dpt_cd]を[BulkSet_pay_dpt_cd]としてエイリアス定義。
	public MCTextField BulkSet_pay_dpt_nm;	// [BulkSet]の[pay_usr_dpt_p.dpt_nm]を[BulkSet_pay_dpt_nm]としてエイリアス定義。
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBH.MSBHP0100.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Actual payment date 支払実績日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_act_dt = null;
	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_basis_dt = null;
	public mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D Rslt_ac_dt_p_PPanel;
	public MCColumnConfig columnRslt_ac_dt;// [Rslt]の[ac_dt_p.ac_dt]を[columnRslt_ac_dt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D Rslt_can_ac_dt_p_PPanel;
	public MCColumnConfig columnRslt_can_ac_dt_for_input;// [Rslt]の[can_ac_dt_p.can_ac_dt_for_input]を[columnRslt_can_ac_dt_for_input]としてエイリアス定義。
	public MCColumnConfig columnRslt_can_ac_dt;// [Rslt]の[can_ac_dt_p.can_ac_dt_for_call]を[columnRslt_can_ac_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ac_dt_after_srch;// [Rslt]の[can_ac_dt_p.ac_dt_after_srch]を[columnRslt_ac_dt_after_srch]としてエイリアス定義。
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_ym = null;
	/**
	 * Status 状況.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slip_sts_typ_nm = null;
	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_psppl_cd = null;
	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_psppl_nm = null;
	public mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D Rslt_pay_usr_dpt_p_PPanel;
	public MCColumnConfig columnRslt_pay_usr_cd;// [Rslt]の[pay_usr_dpt_p.usr_cd]を[columnRslt_pay_usr_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_pay_usr_nm;// [Rslt]の[pay_usr_dpt_p.usr_nm]を[columnRslt_pay_usr_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_pay_dpt_cd;// [Rslt]の[pay_usr_dpt_p.dpt_cd]を[columnRslt_pay_dpt_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_pay_dpt_nm;// [Rslt]の[pay_usr_dpt_p.dpt_nm]を[columnRslt_pay_dpt_nm]としてエイリアス定義。
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
	 * AP settlement method cd. 債務決済方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_sttl_cd = null;
	/**
	 * AP settlement method name 債務決済方法名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_sttl_nm = null;
	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_sttl_typ = null;
	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_sttl_typ_nm = null;
	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_cd = null;
	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_nm = null;
	/**
	 * Scheduled payee PIC cd. 支払予定管理先担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_usr_cd = null;
	/**
	 * Scheduled payee PIC name 支払予定管理先担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_usr_nm = null;
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_dpt_cd = null;
	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_dpt_nm = null;
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_act_no = null;
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
	public mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D Rslt_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	/**
	 * Scheduled payee closing year and month 支払予定管理先締年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_cl_ym = null;
	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_cl_day = null;
	/**
	 * Scheduled payee closing year, month, and date 支払予定管理先締年月日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_cl_dt = null;
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_cd = null;
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_nm = null;
	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_amt_dec_place = null;
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate_cd = null;
	public mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D Rslt_xrate_p_PPanel;
	public MCColumnConfig columnRslt_xrate;// [Rslt]の[xrate_p.xrate]を[columnRslt_xrate]としてエイリアス定義。
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
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_pay_schd_amt_p_PPanel;
	public MCColumnConfig columnRslt_pay_schd_amt;// [Rslt]の[pay_schd_amt_p.amt]を[columnRslt_pay_schd_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_amt;// [Rslt]の[trd_cur_amt_p.amt]を[columnRslt_trd_cur_amt]としてエイリアス定義。
	/**
	 * Fee cd. (Transaction currency) 取引通貨手数料税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_com_paid_tax_cd = null;
	/**
	 * Fee tax name (Transaction currency) 取引通貨手数料税名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_com_paid_tax_nm = null;
	/**
	 * Fee tax rate (Transaction currency) 取引通貨手数料税率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_com_paid_tax_rate = null;
	/**
	 * Fee (Transaction currency) 取引通貨手数料額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_com_paid_amt = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_com_paid_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_com_paid_tax_amt;// [Rslt]の[trd_cur_com_paid_tax_amt_p.amt]を[columnRslt_trd_cur_com_paid_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_amt;// [Rslt]の[base_cur_amt_p.amt]を[columnRslt_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_com_paid_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_com_paid_tax_amt;// [Rslt]の[base_cur_com_paid_tax_amt_p.amt]を[columnRslt_base_cur_com_paid_tax_amt]としてエイリアス定義。
	/**
	 * Counterpart invoice No. 相手先請求書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_bill_no = null;
	/**
	 * Advance payment amount payment result No. 前渡金支払実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_adv_pay_act_no = null;
	/**
	 * Payment received No. 入金ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_no = null;
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
	 * AP type 債務区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_typ = null;
	/**
	 * AP type name 債務区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_typ_nm = null;
	/**
	 * AP offset destination type 債務相殺先区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_setoff_typ = null;
	/**
	 * AP offset destination name 債務相殺先区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_setoff_typ_nm = null;
	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_setoff_cd = null;
	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_setoff_nm = null;
	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_so_dpt_cd = null;
	/**
	 * Offset dept. name 相殺部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_so_dpt_nm = null;
	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bank_ac_cd = null;
	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bank_ac_nm = null;
	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_bank_ac_cd = null;
	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_bank_ac_nm = null;
	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_no = null;
	/**
	 * Note type 手形区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_typ = null;
	/**
	 * Note type name 手形区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_typ_nm = null;
	/**
	 * Drawing date 振出日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_draw_dt = null;
	/**
	 * Note sight 手形サイト.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_days = null;
	/**
	 * Payment due date 支払期日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_due_dt = null;
	/**
	 * Drawer name 振出人名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_drawer_nm = null;
	/**
	 * Endorser 裏書人.<p>
	 *
	 */
	public MCColumnConfig columnRslt_endrsr = null;
	/**
	 * Accepted by 引受人.<p>
	 *
	 */
	public MCColumnConfig columnRslt_accptr = null;
	/**
	 * Drawing bank cd. 振出銀行ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_draw_bank_cd = null;
	/**
	 * Drawing bank name 振出銀行名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_draw_bank_nm = null;
	/**
	 * Drawing branch cd. 振出支店ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_draw_branch_cd = null;
	/**
	 * Drawing branch name 振出支店名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_draw_branch_nm = null;
	/**
	 * Note reason cd. 手形理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_rsn_cd = null;
	/**
	 * Note reason name 手形理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_rsn_nm = null;
	/**
	 * Note spare 1 手形予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_sub_char1 = null;
	/**
	 * Note spare 2 手形予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_sub_char2 = null;
	/**
	 * Note spare 3 手形予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_sub_char3 = null;
	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_dt = null;
	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_chk_no = null;
	/**
	 * Payment collation management No. 支払照合管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_chk_mng_no = null;
	/**
	 * Payment schedule No. 支払予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_schd_no = null;
	/**
	 * AP reconciliation schedule No. 買掛消込予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_appl_schd_no = null;
	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_act_no = null;
	/**
	 * Payment result revision number 支払実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_act_rev = null;
	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_act_seq = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnRslt_disp_seq = null;
	/**
	 * Payment result details No. 支払実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_act_d_no = null;
	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_act_d_seq = null;
	/**
	 * Payment status type 支払状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_sts_typ = null;
	/**
	 * Payment status type name 支払状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_sts_typ_nm = null;
	/**
	 * Result at schedule 予定時実績.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_act_flg = null;
	/**
	 * Multiple 複数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_multi_act_d_flg = null;
	/**
	 * Transferred 振替済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_flg = null;
	/**
	 * Transfer destination AP settlement method cd. 振替先債務決済方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_to_ap_sttl_cd = null;
	/**
	 * Transfer destination AP settlement method name 振替先債務決済方法名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_to_ap_sttl_nm = null;
	/**
	 * Transfer destination AP settlement type 振替先債務決済区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_to_ap_sttl_typ = null;
	/**
	 * Transfer destination AP settlement type name 振替先債務決済区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_to_ap_sttl_typ_nm = null;
	/**
	 * Transfer destination AP supplier cd. 振替先買掛先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_to_asppl_cd = null;
	/**
	 * Transfer destination AP supplier name 振替先買掛先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_to_asppl_nm = null;
	/**
	 * Transfer destination AP dept. cd. 振替先債務部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_to_ap_dpt_cd = null;
	/**
	 * Transfer destination AP dept. name 振替先債務部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_to_ap_dpt_nm = null;
	/**
	 * Transfer destination scheduled payee cd. 振替先支払予定管理先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_to_bsppl_cd = null;
	/**
	 * Transfer destination scheduled payee name 振替先支払予定管理先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_to_bsppl_nm = null;
	/**
	 * Cd. of dept. in charge of transfer destination scheduled payee 振替先支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_to_bsppl_dpt_cd = null;
	/**
	 * Name of dept. in charge of transfer destination scheduled payee 振替先支払予定管理先担当部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_to_bsppl_dpt_nm = null;
	/**
	 * Transfer destination sales project No. 振替先案件ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_to_wrk_no = null;
	/**
	 * Transfer destination sales project name 振替先案件名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sw_to_wrk_nm = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_rmrks = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_intr_rmrks = null;
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
	 * Payment notice details remarks 支払通知書明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_ntc_d_print_rmrks = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_d_rmrks = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_intr_d_rmrks = null;
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dtl_sub_char1 = null;
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dtl_sub_char2 = null;
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dtl_sub_char3 = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
	public MCColumnConfig columnRslt_rtn_sts_typ_nm;// [Rslt]の[rts_msg_p.rtn_sts_typ_nm]を[columnRslt_rtn_sts_typ_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_msg_id;// [Rslt]の[rts_msg_p.msg_id]を[columnRslt_msg_id]としてエイリアス定義。
	public MCColumnConfig columnRslt_msg;// [Rslt]の[rts_msg_p.msg]を[columnRslt_msg]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_psppl_grp_p_PPanel;
	public MCColumnConfig columnRslt_psppl_grp_cd1;// [Rslt]の[psppl_grp_p.bp_grp_cd1]を[columnRslt_psppl_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_nm1;// [Rslt]の[psppl_grp_p.bp_grp_nm1]を[columnRslt_psppl_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_cd2;// [Rslt]の[psppl_grp_p.bp_grp_cd2]を[columnRslt_psppl_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_nm2;// [Rslt]の[psppl_grp_p.bp_grp_nm2]を[columnRslt_psppl_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_cd3;// [Rslt]の[psppl_grp_p.bp_grp_cd3]を[columnRslt_psppl_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_nm3;// [Rslt]の[psppl_grp_p.bp_grp_nm3]を[columnRslt_psppl_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_cd4;// [Rslt]の[psppl_grp_p.bp_grp_cd4]を[columnRslt_psppl_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_nm4;// [Rslt]の[psppl_grp_p.bp_grp_nm4]を[columnRslt_psppl_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_cd5;// [Rslt]の[psppl_grp_p.bp_grp_cd5]を[columnRslt_psppl_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_nm5;// [Rslt]の[psppl_grp_p.bp_grp_nm5]を[columnRslt_psppl_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_cd6;// [Rslt]の[psppl_grp_p.bp_grp_cd6]を[columnRslt_psppl_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_nm6;// [Rslt]の[psppl_grp_p.bp_grp_nm6]を[columnRslt_psppl_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_cd7;// [Rslt]の[psppl_grp_p.bp_grp_cd7]を[columnRslt_psppl_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_nm7;// [Rslt]の[psppl_grp_p.bp_grp_nm7]を[columnRslt_psppl_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_cd8;// [Rslt]の[psppl_grp_p.bp_grp_cd8]を[columnRslt_psppl_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_nm8;// [Rslt]の[psppl_grp_p.bp_grp_nm8]を[columnRslt_psppl_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_cd9;// [Rslt]の[psppl_grp_p.bp_grp_cd9]を[columnRslt_psppl_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_nm9;// [Rslt]の[psppl_grp_p.bp_grp_nm9]を[columnRslt_psppl_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_cd10;// [Rslt]の[psppl_grp_p.bp_grp_cd10]を[columnRslt_psppl_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_psppl_grp_nm10;// [Rslt]の[psppl_grp_p.bp_grp_nm10]を[columnRslt_psppl_grp_nm10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_bsppl_grp_p_PPanel;
	public MCColumnConfig columnRslt_bsppl_grp_cd1;// [Rslt]の[bsppl_grp_p.bp_grp_cd1]を[columnRslt_bsppl_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm1;// [Rslt]の[bsppl_grp_p.bp_grp_nm1]を[columnRslt_bsppl_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd2;// [Rslt]の[bsppl_grp_p.bp_grp_cd2]を[columnRslt_bsppl_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm2;// [Rslt]の[bsppl_grp_p.bp_grp_nm2]を[columnRslt_bsppl_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd3;// [Rslt]の[bsppl_grp_p.bp_grp_cd3]を[columnRslt_bsppl_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm3;// [Rslt]の[bsppl_grp_p.bp_grp_nm3]を[columnRslt_bsppl_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd4;// [Rslt]の[bsppl_grp_p.bp_grp_cd4]を[columnRslt_bsppl_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm4;// [Rslt]の[bsppl_grp_p.bp_grp_nm4]を[columnRslt_bsppl_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd5;// [Rslt]の[bsppl_grp_p.bp_grp_cd5]を[columnRslt_bsppl_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm5;// [Rslt]の[bsppl_grp_p.bp_grp_nm5]を[columnRslt_bsppl_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd6;// [Rslt]の[bsppl_grp_p.bp_grp_cd6]を[columnRslt_bsppl_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm6;// [Rslt]の[bsppl_grp_p.bp_grp_nm6]を[columnRslt_bsppl_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd7;// [Rslt]の[bsppl_grp_p.bp_grp_cd7]を[columnRslt_bsppl_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm7;// [Rslt]の[bsppl_grp_p.bp_grp_nm7]を[columnRslt_bsppl_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd8;// [Rslt]の[bsppl_grp_p.bp_grp_cd8]を[columnRslt_bsppl_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm8;// [Rslt]の[bsppl_grp_p.bp_grp_nm8]を[columnRslt_bsppl_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd9;// [Rslt]の[bsppl_grp_p.bp_grp_cd9]を[columnRslt_bsppl_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm9;// [Rslt]の[bsppl_grp_p.bp_grp_nm9]を[columnRslt_bsppl_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_cd10;// [Rslt]の[bsppl_grp_p.bp_grp_cd10]を[columnRslt_bsppl_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_bsppl_grp_nm10;// [Rslt]の[bsppl_grp_p.bp_grp_nm10]を[columnRslt_bsppl_grp_nm10]としてエイリアス定義。
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
	/**
	 * Payment collation header update counter 支払照合ヘッダ更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_chk_upd_cntr = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_cntr = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Payment result entry 支払実績登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBHP0090 = null;
	/**
	 * Transfer slip 振替伝票.<p>
	 *
	 */
	public MCButton Btn_prnt_sw = null;
	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public MCCheckBox Btn_indiv_prnt_flg = null;
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
	public MCButton Btn_ins = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [SRCH_INS]モードを表す定数 */
	public static final String SRCH_INS = "SRCH_INS";
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [SRCH_DEL]モードを表す定数 */
	public static final String SRCH_DEL = "SRCH_DEL";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF_SCHD]モードを表す定数 */
	public static final String REF_SCHD = "REF_SCHD";
	/** [REF_ACT]モードを表す定数 */
	public static final String REF_ACT = "REF_ACT";
	/** [PRNT]モードを表す定数 */
	public static final String PRNT = "PRNT";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_INS, INS, SRCH_DEL, DEL, REF_SCHD, REF_ACT, PRNT};
	
	/** [MS_MSBHL0100_Srch01]のCallerの作成 */
	protected MSBHP_PayActListReg_MC.MS_MSBHL0100_Srch01Caller createMS_MSBHL0100_Srch01() {
		MSBHP_PayActListReg_MC.MS_MSBHL0100_Srch01Caller<MSBHP_PayActListReg, MS_MSBHL0100_Srch01Bridge>
		caller = ((MSBHP_PayActListReg_MC)this).new MS_MSBHL0100_Srch01Caller<MSBHP_PayActListReg, MS_MSBHL0100_Srch01Bridge>(
					(MSBHP_PayActListReg)this, new MS_MSBHL0100_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBHL0100_Srch01]の呼び出し */
	protected void callMS_MSBHL0100_Srch01() {
		MCCaller caller = createMS_MSBHL0100_Srch01();
		caller.exec();
	}
	/** [MS_MSBHL0100_Srch02]のCallerの作成 */
	protected MSBHP_PayActListReg_MC.MS_MSBHL0100_Srch02Caller createMS_MSBHL0100_Srch02() {
		MSBHP_PayActListReg_MC.MS_MSBHL0100_Srch02Caller<MSBHP_PayActListReg, MS_MSBHL0100_Srch02Bridge>
		caller = ((MSBHP_PayActListReg_MC)this).new MS_MSBHL0100_Srch02Caller<MSBHP_PayActListReg, MS_MSBHL0100_Srch02Bridge>(
					(MSBHP_PayActListReg)this, new MS_MSBHL0100_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBHL0100_Srch02]の呼び出し */
	protected void callMS_MSBHL0100_Srch02() {
		MCCaller caller = createMS_MSBHL0100_Srch02();
		caller.exec();
	}
	/** [MS_MSBHL0100_Srch03]のCallerの作成 */
	protected MSBHP_PayActListReg_MC.MS_MSBHL0100_Srch03Caller createMS_MSBHL0100_Srch03() {
		MSBHP_PayActListReg_MC.MS_MSBHL0100_Srch03Caller<MSBHP_PayActListReg, MS_MSBHL0100_Srch03Bridge>
		caller = ((MSBHP_PayActListReg_MC)this).new MS_MSBHL0100_Srch03Caller<MSBHP_PayActListReg, MS_MSBHL0100_Srch03Bridge>(
					(MSBHP_PayActListReg)this, new MS_MSBHL0100_Srch03Bridge());
		return caller;
	}
	/** [MS_MSBHL0100_Srch03]の呼び出し */
	protected void callMS_MSBHL0100_Srch03() {
		MCCaller caller = createMS_MSBHL0100_Srch03();
		caller.exec();
	}
	/** [MS_MSBHL0100_Ins01]のCallerの作成 */
	protected MSBHP_PayActListReg_MC.MS_MSBHL0100_Ins01Caller createMS_MSBHL0100_Ins01() {
		MSBHP_PayActListReg_MC.MS_MSBHL0100_Ins01Caller<MSBHP_PayActListReg, MS_MSBHL0100_Ins01Bridge>
		caller = ((MSBHP_PayActListReg_MC)this).new MS_MSBHL0100_Ins01Caller<MSBHP_PayActListReg, MS_MSBHL0100_Ins01Bridge>(
					(MSBHP_PayActListReg)this, new MS_MSBHL0100_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBHL0100_Ins01]の呼び出し */
	protected void callMS_MSBHL0100_Ins01() {
		MCCaller caller = createMS_MSBHL0100_Ins01();
		caller.exec();
	}
	/** [MS_MSBHL0100_Del01]のCallerの作成 */
	protected MSBHP_PayActListReg_MC.MS_MSBHL0100_Del01Caller createMS_MSBHL0100_Del01() {
		MSBHP_PayActListReg_MC.MS_MSBHL0100_Del01Caller<MSBHP_PayActListReg, MS_MSBHL0100_Del01Bridge>
		caller = ((MSBHP_PayActListReg_MC)this).new MS_MSBHL0100_Del01Caller<MSBHP_PayActListReg, MS_MSBHL0100_Del01Bridge>(
					(MSBHP_PayActListReg)this, new MS_MSBHL0100_Del01Bridge());
		return caller;
	}
	/** [MS_MSBHL0100_Del01]の呼び出し */
	protected void callMS_MSBHL0100_Del01() {
		MCCaller caller = createMS_MSBHL0100_Del01();
		caller.exec();
	}
	/** [MS_MSBHL0100_Prnt01]のCallerの作成 */
	protected MSBHP_PayActListReg_MC.MS_MSBHL0100_Prnt01Caller createMS_MSBHL0100_Prnt01() {
		MSBHP_PayActListReg_MC.MS_MSBHL0100_Prnt01Caller<MSBHP_PayActListReg, MS_MSBHL0100_Prnt01Bridge>
		caller = ((MSBHP_PayActListReg_MC)this).new MS_MSBHL0100_Prnt01Caller<MSBHP_PayActListReg, MS_MSBHL0100_Prnt01Bridge>(
					(MSBHP_PayActListReg)this, new MS_MSBHL0100_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBHL0100_Prnt01]の呼び出し */
	protected void callMS_MSBHL0100_Prnt01() {
		MCCaller caller = createMS_MSBHL0100_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0100.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0100.BulkSetR aBulkSetR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBH.MSBHP0100.RsltR> aRsltL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBH.MSBHP0100.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBH.MSBHP0100.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBH.MSBHP0100.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBH.MSBHP0100.CndR createCndR() {
		return mcframe.clientMSBH.MSBHP0100.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMSBH.MSBHP0100.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBH.MSBHP0100.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBH.MSBHP0100.BulkSetR createBulkSetR() {
		return mcframe.clientMSBH.MSBHP0100.BulkSetR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBH.MSBHP0100.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0100.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBH.MSBHP0100.RsltR createRsltR() {
		return mcframe.clientMSBH.MSBHP0100.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBH.MSBHP0100.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBH.MSBHP0100.RsltR.class);
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
	public void setBtnR(mcframe.clientMSBH.MSBHP0100.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBH.MSBHP0100.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBH.MSBHP0100.BtnR createBtnR() {
		return mcframe.clientMSBH.MSBHP0100.BtnR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getBulkSetR())) ret.add(getBulkSetR());
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
		if(aCnt == getBulkSetR()) return "BulkSet";
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
		if(bId.equals("BulkSet")) return getBulkSetR();
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
		ret.add(SrchModePanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(PspplPanel);
		ret.add(Tab3Panel);
		ret.add(BspplPanel);
		ret.add(Tab4Panel);
		ret.add(AspplPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(BulkSetPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBHP_PayActListReg_MC_A() {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aRsltL = createRsltL();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBHP_PayActListReg_MC_A(String name) {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
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
		MSBHP_PayActListReg_MC.jbCreateScreenOpe((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbCreateSrchMode((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbCreateTop((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbCreateFold((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbCreateTab1((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbCreateTab2((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbCreatePsppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbCreateTab3((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbCreateBsppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbCreateTab4((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbCreateAsppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbCreateCnd((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbCreateCtrl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbCreateRPnl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbCreateBulkSet((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbCreateRslt((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbCreateBtn((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbCreateEastBtn((MSBHP_PayActListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBHP_PayActListReg p) {
	}

	/**
	 * [SrchMode]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchMode(MSBHP_PayActListReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBHP_PayActListReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBHP_PayActListReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBHP_PayActListReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBHP_PayActListReg p) {
	}

	/**
	 * [Psppl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePsppl(MSBHP_PayActListReg p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MSBHP_PayActListReg p) {
	}

	/**
	 * [Bsppl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBsppl(MSBHP_PayActListReg p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MSBHP_PayActListReg p) {
	}

	/**
	 * [Asppl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAsppl(MSBHP_PayActListReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBHP_PayActListReg p) {
		p.Cnd_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.create(p.getCndR().wrk_no_p());
		p.Cnd_wrk_no_p_PPanel.setName("Cnd.wrk_no_p");
		p.Cnd_wrk_no = p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_no;
		p.Cnd_wrk_no.addAliasName("Cnd.wrk_no", p);
		p.Cnd_wrk_nm = p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_nm;
		p.Cnd_wrk_nm.addAliasName("Cnd.wrk_nm", p);
		p.Cnd_psppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().psppl_grp_p());
		p.Cnd_psppl_grp_p_PPanel.setName("Cnd.psppl_grp_p");
		p.Cnd_psppl_grp_lab1 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_psppl_grp_lab1.addAliasName("Cnd.psppl_grp_lab1", p);
		p.Cnd_psppl_grp_flg1 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_psppl_grp_flg1.addAliasName("Cnd.psppl_grp_flg1", p);
		p.Cnd_psppl_grp_cd1 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_psppl_grp_cd1.addAliasName("Cnd.psppl_grp_cd1", p);
		p.Cnd_psppl_grp_nm1 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_psppl_grp_nm1.addAliasName("Cnd.psppl_grp_nm1", p);
		p.Cnd_psppl_grp_lab2 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_psppl_grp_lab2.addAliasName("Cnd.psppl_grp_lab2", p);
		p.Cnd_psppl_grp_flg2 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_psppl_grp_flg2.addAliasName("Cnd.psppl_grp_flg2", p);
		p.Cnd_psppl_grp_cd2 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_psppl_grp_cd2.addAliasName("Cnd.psppl_grp_cd2", p);
		p.Cnd_psppl_grp_nm2 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_psppl_grp_nm2.addAliasName("Cnd.psppl_grp_nm2", p);
		p.Cnd_psppl_grp_lab3 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_psppl_grp_lab3.addAliasName("Cnd.psppl_grp_lab3", p);
		p.Cnd_psppl_grp_flg3 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_psppl_grp_flg3.addAliasName("Cnd.psppl_grp_flg3", p);
		p.Cnd_psppl_grp_cd3 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_psppl_grp_cd3.addAliasName("Cnd.psppl_grp_cd3", p);
		p.Cnd_psppl_grp_nm3 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_psppl_grp_nm3.addAliasName("Cnd.psppl_grp_nm3", p);
		p.Cnd_psppl_grp_lab4 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_psppl_grp_lab4.addAliasName("Cnd.psppl_grp_lab4", p);
		p.Cnd_psppl_grp_flg4 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_psppl_grp_flg4.addAliasName("Cnd.psppl_grp_flg4", p);
		p.Cnd_psppl_grp_cd4 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_psppl_grp_cd4.addAliasName("Cnd.psppl_grp_cd4", p);
		p.Cnd_psppl_grp_nm4 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_psppl_grp_nm4.addAliasName("Cnd.psppl_grp_nm4", p);
		p.Cnd_psppl_grp_lab5 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_psppl_grp_lab5.addAliasName("Cnd.psppl_grp_lab5", p);
		p.Cnd_psppl_grp_flg5 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_psppl_grp_flg5.addAliasName("Cnd.psppl_grp_flg5", p);
		p.Cnd_psppl_grp_cd5 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_psppl_grp_cd5.addAliasName("Cnd.psppl_grp_cd5", p);
		p.Cnd_psppl_grp_nm5 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_psppl_grp_nm5.addAliasName("Cnd.psppl_grp_nm5", p);
		p.Cnd_psppl_grp_lab6 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_psppl_grp_lab6.addAliasName("Cnd.psppl_grp_lab6", p);
		p.Cnd_psppl_grp_flg6 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_psppl_grp_flg6.addAliasName("Cnd.psppl_grp_flg6", p);
		p.Cnd_psppl_grp_cd6 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_psppl_grp_cd6.addAliasName("Cnd.psppl_grp_cd6", p);
		p.Cnd_psppl_grp_nm6 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_psppl_grp_nm6.addAliasName("Cnd.psppl_grp_nm6", p);
		p.Cnd_psppl_grp_lab7 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_psppl_grp_lab7.addAliasName("Cnd.psppl_grp_lab7", p);
		p.Cnd_psppl_grp_flg7 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_psppl_grp_flg7.addAliasName("Cnd.psppl_grp_flg7", p);
		p.Cnd_psppl_grp_cd7 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_psppl_grp_cd7.addAliasName("Cnd.psppl_grp_cd7", p);
		p.Cnd_psppl_grp_nm7 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_psppl_grp_nm7.addAliasName("Cnd.psppl_grp_nm7", p);
		p.Cnd_psppl_grp_lab8 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_psppl_grp_lab8.addAliasName("Cnd.psppl_grp_lab8", p);
		p.Cnd_psppl_grp_flg8 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_psppl_grp_flg8.addAliasName("Cnd.psppl_grp_flg8", p);
		p.Cnd_psppl_grp_cd8 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_psppl_grp_cd8.addAliasName("Cnd.psppl_grp_cd8", p);
		p.Cnd_psppl_grp_nm8 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_psppl_grp_nm8.addAliasName("Cnd.psppl_grp_nm8", p);
		p.Cnd_psppl_grp_lab9 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_psppl_grp_lab9.addAliasName("Cnd.psppl_grp_lab9", p);
		p.Cnd_psppl_grp_flg9 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_psppl_grp_flg9.addAliasName("Cnd.psppl_grp_flg9", p);
		p.Cnd_psppl_grp_cd9 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_psppl_grp_cd9.addAliasName("Cnd.psppl_grp_cd9", p);
		p.Cnd_psppl_grp_nm9 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_psppl_grp_nm9.addAliasName("Cnd.psppl_grp_nm9", p);
		p.Cnd_psppl_grp_lab10 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_psppl_grp_lab10.addAliasName("Cnd.psppl_grp_lab10", p);
		p.Cnd_psppl_grp_flg10 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_psppl_grp_flg10.addAliasName("Cnd.psppl_grp_flg10", p);
		p.Cnd_psppl_grp_cd10 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_psppl_grp_cd10.addAliasName("Cnd.psppl_grp_cd10", p);
		p.Cnd_psppl_grp_nm10 = p.Cnd_psppl_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_psppl_grp_nm10.addAliasName("Cnd.psppl_grp_nm10", p);
		p.Cnd_bsppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().bsppl_grp_p());
		p.Cnd_bsppl_grp_p_PPanel.setName("Cnd.bsppl_grp_p");
		p.Cnd_bsppl_grp_lab1 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_bsppl_grp_lab1.addAliasName("Cnd.bsppl_grp_lab1", p);
		p.Cnd_bsppl_grp_flg1 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_bsppl_grp_flg1.addAliasName("Cnd.bsppl_grp_flg1", p);
		p.Cnd_bsppl_grp_cd1 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_bsppl_grp_cd1.addAliasName("Cnd.bsppl_grp_cd1", p);
		p.Cnd_bsppl_grp_nm1 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_bsppl_grp_nm1.addAliasName("Cnd.bsppl_grp_nm1", p);
		p.Cnd_bsppl_grp_lab2 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_bsppl_grp_lab2.addAliasName("Cnd.bsppl_grp_lab2", p);
		p.Cnd_bsppl_grp_flg2 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_bsppl_grp_flg2.addAliasName("Cnd.bsppl_grp_flg2", p);
		p.Cnd_bsppl_grp_cd2 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_bsppl_grp_cd2.addAliasName("Cnd.bsppl_grp_cd2", p);
		p.Cnd_bsppl_grp_nm2 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_bsppl_grp_nm2.addAliasName("Cnd.bsppl_grp_nm2", p);
		p.Cnd_bsppl_grp_lab3 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_bsppl_grp_lab3.addAliasName("Cnd.bsppl_grp_lab3", p);
		p.Cnd_bsppl_grp_flg3 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_bsppl_grp_flg3.addAliasName("Cnd.bsppl_grp_flg3", p);
		p.Cnd_bsppl_grp_cd3 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_bsppl_grp_cd3.addAliasName("Cnd.bsppl_grp_cd3", p);
		p.Cnd_bsppl_grp_nm3 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_bsppl_grp_nm3.addAliasName("Cnd.bsppl_grp_nm3", p);
		p.Cnd_bsppl_grp_lab4 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_bsppl_grp_lab4.addAliasName("Cnd.bsppl_grp_lab4", p);
		p.Cnd_bsppl_grp_flg4 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_bsppl_grp_flg4.addAliasName("Cnd.bsppl_grp_flg4", p);
		p.Cnd_bsppl_grp_cd4 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_bsppl_grp_cd4.addAliasName("Cnd.bsppl_grp_cd4", p);
		p.Cnd_bsppl_grp_nm4 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_bsppl_grp_nm4.addAliasName("Cnd.bsppl_grp_nm4", p);
		p.Cnd_bsppl_grp_lab5 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_bsppl_grp_lab5.addAliasName("Cnd.bsppl_grp_lab5", p);
		p.Cnd_bsppl_grp_flg5 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_bsppl_grp_flg5.addAliasName("Cnd.bsppl_grp_flg5", p);
		p.Cnd_bsppl_grp_cd5 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_bsppl_grp_cd5.addAliasName("Cnd.bsppl_grp_cd5", p);
		p.Cnd_bsppl_grp_nm5 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_bsppl_grp_nm5.addAliasName("Cnd.bsppl_grp_nm5", p);
		p.Cnd_bsppl_grp_lab6 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_bsppl_grp_lab6.addAliasName("Cnd.bsppl_grp_lab6", p);
		p.Cnd_bsppl_grp_flg6 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_bsppl_grp_flg6.addAliasName("Cnd.bsppl_grp_flg6", p);
		p.Cnd_bsppl_grp_cd6 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_bsppl_grp_cd6.addAliasName("Cnd.bsppl_grp_cd6", p);
		p.Cnd_bsppl_grp_nm6 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_bsppl_grp_nm6.addAliasName("Cnd.bsppl_grp_nm6", p);
		p.Cnd_bsppl_grp_lab7 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_bsppl_grp_lab7.addAliasName("Cnd.bsppl_grp_lab7", p);
		p.Cnd_bsppl_grp_flg7 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_bsppl_grp_flg7.addAliasName("Cnd.bsppl_grp_flg7", p);
		p.Cnd_bsppl_grp_cd7 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_bsppl_grp_cd7.addAliasName("Cnd.bsppl_grp_cd7", p);
		p.Cnd_bsppl_grp_nm7 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_bsppl_grp_nm7.addAliasName("Cnd.bsppl_grp_nm7", p);
		p.Cnd_bsppl_grp_lab8 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_bsppl_grp_lab8.addAliasName("Cnd.bsppl_grp_lab8", p);
		p.Cnd_bsppl_grp_flg8 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_bsppl_grp_flg8.addAliasName("Cnd.bsppl_grp_flg8", p);
		p.Cnd_bsppl_grp_cd8 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_bsppl_grp_cd8.addAliasName("Cnd.bsppl_grp_cd8", p);
		p.Cnd_bsppl_grp_nm8 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_bsppl_grp_nm8.addAliasName("Cnd.bsppl_grp_nm8", p);
		p.Cnd_bsppl_grp_lab9 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_bsppl_grp_lab9.addAliasName("Cnd.bsppl_grp_lab9", p);
		p.Cnd_bsppl_grp_flg9 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_bsppl_grp_flg9.addAliasName("Cnd.bsppl_grp_flg9", p);
		p.Cnd_bsppl_grp_cd9 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_bsppl_grp_cd9.addAliasName("Cnd.bsppl_grp_cd9", p);
		p.Cnd_bsppl_grp_nm9 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_bsppl_grp_nm9.addAliasName("Cnd.bsppl_grp_nm9", p);
		p.Cnd_bsppl_grp_lab10 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_bsppl_grp_lab10.addAliasName("Cnd.bsppl_grp_lab10", p);
		p.Cnd_bsppl_grp_flg10 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_bsppl_grp_flg10.addAliasName("Cnd.bsppl_grp_flg10", p);
		p.Cnd_bsppl_grp_cd10 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_bsppl_grp_cd10.addAliasName("Cnd.bsppl_grp_cd10", p);
		p.Cnd_bsppl_grp_nm10 = p.Cnd_bsppl_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_bsppl_grp_nm10.addAliasName("Cnd.bsppl_grp_nm10", p);
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
	protected static void jbCreateCtrl(MSBHP_PayActListReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBHP_PayActListReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MSBHP_PayActListReg p) {
		p.BulkSet_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.create(p.getBulkSetR().ac_dt_p());
		p.BulkSet_ac_dt_p_PPanel.setName("BulkSet.ac_dt_p");
		p.BulkSet_ac_dt = p.BulkSet_ac_dt_p_PPanel.AcDt_ac_dt;
		p.BulkSet_ac_dt.addAliasName("BulkSet.ac_dt", p);
		p.BulkSet_pay_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getBulkSetR().pay_usr_dpt_p());
		p.BulkSet_pay_usr_dpt_p_PPanel.setName("BulkSet.pay_usr_dpt_p");
		p.BulkSet_pay_usr_cd = p.BulkSet_pay_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.BulkSet_pay_usr_cd.addAliasName("BulkSet.pay_usr_cd", p);
		p.BulkSet_pay_usr_nm = p.BulkSet_pay_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.BulkSet_pay_usr_nm.addAliasName("BulkSet.pay_usr_nm", p);
		p.BulkSet_pay_dpt_cd = p.BulkSet_pay_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.BulkSet_pay_dpt_cd.addAliasName("BulkSet.pay_dpt_cd", p);
		p.BulkSet_pay_dpt_nm = p.BulkSet_pay_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.BulkSet_pay_dpt_nm.addAliasName("BulkSet.pay_dpt_nm", p);
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBHP_PayActListReg p) {
		p.Rslt_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.create(mcframe.clientMSBH.MSBHP0100.RsltR.$ac_dt_p);
		p.Rslt_ac_dt_p_PPanel.setName("Rslt.ac_dt_p");
		p.columnRslt_ac_dt = p.Rslt_ac_dt_p_PPanel.columnAcDt_ac_dt;
		p.columnRslt_ac_dt.addAliasName("Rslt.ac_dt", p);
		p.Rslt_can_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.create(mcframe.clientMSBH.MSBHP0100.RsltR.$can_ac_dt_p);
		p.Rslt_can_ac_dt_p_PPanel.setName("Rslt.can_ac_dt_p");
		p.columnRslt_can_ac_dt_for_input = p.Rslt_can_ac_dt_p_PPanel.columnCanAcDt_can_ac_dt_for_input;
		p.columnRslt_can_ac_dt_for_input.addAliasName("Rslt.can_ac_dt_for_input", p);
		p.columnRslt_can_ac_dt = p.Rslt_can_ac_dt_p_PPanel.columnCanAcDt_can_ac_dt_for_call;
		p.columnRslt_can_ac_dt.addAliasName("Rslt.can_ac_dt", p);
		p.columnRslt_ac_dt_after_srch = p.Rslt_can_ac_dt_p_PPanel.columnCanAcDt_ac_dt_after_srch;
		p.columnRslt_ac_dt_after_srch.addAliasName("Rslt.ac_dt_after_srch", p);
		p.Rslt_pay_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.create(mcframe.clientMSBH.MSBHP0100.RsltR.$pay_usr_dpt_p);
		p.Rslt_pay_usr_dpt_p_PPanel.setName("Rslt.pay_usr_dpt_p");
		p.columnRslt_pay_usr_cd = p.Rslt_pay_usr_dpt_p_PPanel.columnUsrDpt_usr_cd;
		p.columnRslt_pay_usr_cd.addAliasName("Rslt.pay_usr_cd", p);
		p.columnRslt_pay_usr_nm = p.Rslt_pay_usr_dpt_p_PPanel.columnUsrDpt_usr_nm;
		p.columnRslt_pay_usr_nm.addAliasName("Rslt.pay_usr_nm", p);
		p.columnRslt_pay_dpt_cd = p.Rslt_pay_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd;
		p.columnRslt_pay_dpt_cd.addAliasName("Rslt.pay_dpt_cd", p);
		p.columnRslt_pay_dpt_nm = p.Rslt_pay_usr_dpt_p_PPanel.columnUsrDpt_dpt_nm;
		p.columnRslt_pay_dpt_nm.addAliasName("Rslt.pay_dpt_nm", p);
		p.Rslt_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.create(mcframe.clientMSBH.MSBHP0100.RsltR.$wrk_no_p);
		p.Rslt_wrk_no_p_PPanel.setName("Rslt.wrk_no_p");
		p.columnRslt_wrk_no = p.Rslt_wrk_no_p_PPanel.columnWrkNo_wrk_no;
		p.columnRslt_wrk_no.addAliasName("Rslt.wrk_no", p);
		p.columnRslt_wrk_nm = p.Rslt_wrk_no_p_PPanel.columnWrkNo_wrk_nm;
		p.columnRslt_wrk_nm.addAliasName("Rslt.wrk_nm", p);
		p.Rslt_xrate_p_PPanel = mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.create(mcframe.clientMSBH.MSBHP0100.RsltR.$xrate_p);
		p.Rslt_xrate_p_PPanel.setName("Rslt.xrate_p");
		p.columnRslt_xrate = p.Rslt_xrate_p_PPanel.columnXrate_xrate;
		p.columnRslt_xrate.addAliasName("Rslt.xrate", p);
		p.Rslt_pay_schd_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0100.RsltR.$pay_schd_amt_p);
		p.Rslt_pay_schd_amt_p_PPanel.setName("Rslt.pay_schd_amt_p");
		p.columnRslt_pay_schd_amt = p.Rslt_pay_schd_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_pay_schd_amt.addAliasName("Rslt.pay_schd_amt", p);
		p.Rslt_trd_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0100.RsltR.$trd_cur_amt_p);
		p.Rslt_trd_cur_amt_p_PPanel.setName("Rslt.trd_cur_amt_p");
		p.columnRslt_trd_cur_amt = p.Rslt_trd_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_amt.addAliasName("Rslt.trd_cur_amt", p);
		p.Rslt_trd_cur_com_paid_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0100.RsltR.$trd_cur_com_paid_tax_amt_p);
		p.Rslt_trd_cur_com_paid_tax_amt_p_PPanel.setName("Rslt.trd_cur_com_paid_tax_amt_p");
		p.columnRslt_trd_cur_com_paid_tax_amt = p.Rslt_trd_cur_com_paid_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_com_paid_tax_amt.addAliasName("Rslt.trd_cur_com_paid_tax_amt", p);
		p.Rslt_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0100.RsltR.$base_cur_amt_p);
		p.Rslt_base_cur_amt_p_PPanel.setName("Rslt.base_cur_amt_p");
		p.columnRslt_base_cur_amt = p.Rslt_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_amt.addAliasName("Rslt.base_cur_amt", p);
		p.Rslt_base_cur_com_paid_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBH.MSBHP0100.RsltR.$base_cur_com_paid_tax_amt_p);
		p.Rslt_base_cur_com_paid_tax_amt_p_PPanel.setName("Rslt.base_cur_com_paid_tax_amt_p");
		p.columnRslt_base_cur_com_paid_tax_amt = p.Rslt_base_cur_com_paid_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_com_paid_tax_amt.addAliasName("Rslt.base_cur_com_paid_tax_amt", p);
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBH.MSBHP0100.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
		p.columnRslt_rtn_sts_typ_nm = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ_nm;
		p.columnRslt_rtn_sts_typ_nm.addAliasName("Rslt.rtn_sts_typ_nm", p);
		p.columnRslt_msg_id = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_msg_id;
		p.columnRslt_msg_id.addAliasName("Rslt.msg_id", p);
		p.columnRslt_msg = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_msg;
		p.columnRslt_msg.addAliasName("Rslt.msg", p);
		p.Rslt_psppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBH.MSBHP0100.RsltR.$psppl_grp_p);
		p.Rslt_psppl_grp_p_PPanel.setName("Rslt.psppl_grp_p");
		p.columnRslt_psppl_grp_cd1 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_psppl_grp_cd1.addAliasName("Rslt.psppl_grp_cd1", p);
		p.columnRslt_psppl_grp_nm1 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_psppl_grp_nm1.addAliasName("Rslt.psppl_grp_nm1", p);
		p.columnRslt_psppl_grp_cd2 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_psppl_grp_cd2.addAliasName("Rslt.psppl_grp_cd2", p);
		p.columnRslt_psppl_grp_nm2 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_psppl_grp_nm2.addAliasName("Rslt.psppl_grp_nm2", p);
		p.columnRslt_psppl_grp_cd3 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_psppl_grp_cd3.addAliasName("Rslt.psppl_grp_cd3", p);
		p.columnRslt_psppl_grp_nm3 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_psppl_grp_nm3.addAliasName("Rslt.psppl_grp_nm3", p);
		p.columnRslt_psppl_grp_cd4 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_psppl_grp_cd4.addAliasName("Rslt.psppl_grp_cd4", p);
		p.columnRslt_psppl_grp_nm4 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_psppl_grp_nm4.addAliasName("Rslt.psppl_grp_nm4", p);
		p.columnRslt_psppl_grp_cd5 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_psppl_grp_cd5.addAliasName("Rslt.psppl_grp_cd5", p);
		p.columnRslt_psppl_grp_nm5 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_psppl_grp_nm5.addAliasName("Rslt.psppl_grp_nm5", p);
		p.columnRslt_psppl_grp_cd6 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_psppl_grp_cd6.addAliasName("Rslt.psppl_grp_cd6", p);
		p.columnRslt_psppl_grp_nm6 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_psppl_grp_nm6.addAliasName("Rslt.psppl_grp_nm6", p);
		p.columnRslt_psppl_grp_cd7 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_psppl_grp_cd7.addAliasName("Rslt.psppl_grp_cd7", p);
		p.columnRslt_psppl_grp_nm7 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_psppl_grp_nm7.addAliasName("Rslt.psppl_grp_nm7", p);
		p.columnRslt_psppl_grp_cd8 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_psppl_grp_cd8.addAliasName("Rslt.psppl_grp_cd8", p);
		p.columnRslt_psppl_grp_nm8 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_psppl_grp_nm8.addAliasName("Rslt.psppl_grp_nm8", p);
		p.columnRslt_psppl_grp_cd9 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_psppl_grp_cd9.addAliasName("Rslt.psppl_grp_cd9", p);
		p.columnRslt_psppl_grp_nm9 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_psppl_grp_nm9.addAliasName("Rslt.psppl_grp_nm9", p);
		p.columnRslt_psppl_grp_cd10 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_psppl_grp_cd10.addAliasName("Rslt.psppl_grp_cd10", p);
		p.columnRslt_psppl_grp_nm10 = p.Rslt_psppl_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_psppl_grp_nm10.addAliasName("Rslt.psppl_grp_nm10", p);
		p.Rslt_bsppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBH.MSBHP0100.RsltR.$bsppl_grp_p);
		p.Rslt_bsppl_grp_p_PPanel.setName("Rslt.bsppl_grp_p");
		p.columnRslt_bsppl_grp_cd1 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_bsppl_grp_cd1.addAliasName("Rslt.bsppl_grp_cd1", p);
		p.columnRslt_bsppl_grp_nm1 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_bsppl_grp_nm1.addAliasName("Rslt.bsppl_grp_nm1", p);
		p.columnRslt_bsppl_grp_cd2 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_bsppl_grp_cd2.addAliasName("Rslt.bsppl_grp_cd2", p);
		p.columnRslt_bsppl_grp_nm2 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_bsppl_grp_nm2.addAliasName("Rslt.bsppl_grp_nm2", p);
		p.columnRslt_bsppl_grp_cd3 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_bsppl_grp_cd3.addAliasName("Rslt.bsppl_grp_cd3", p);
		p.columnRslt_bsppl_grp_nm3 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_bsppl_grp_nm3.addAliasName("Rslt.bsppl_grp_nm3", p);
		p.columnRslt_bsppl_grp_cd4 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_bsppl_grp_cd4.addAliasName("Rslt.bsppl_grp_cd4", p);
		p.columnRslt_bsppl_grp_nm4 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_bsppl_grp_nm4.addAliasName("Rslt.bsppl_grp_nm4", p);
		p.columnRslt_bsppl_grp_cd5 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_bsppl_grp_cd5.addAliasName("Rslt.bsppl_grp_cd5", p);
		p.columnRslt_bsppl_grp_nm5 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_bsppl_grp_nm5.addAliasName("Rslt.bsppl_grp_nm5", p);
		p.columnRslt_bsppl_grp_cd6 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_bsppl_grp_cd6.addAliasName("Rslt.bsppl_grp_cd6", p);
		p.columnRslt_bsppl_grp_nm6 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_bsppl_grp_nm6.addAliasName("Rslt.bsppl_grp_nm6", p);
		p.columnRslt_bsppl_grp_cd7 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_bsppl_grp_cd7.addAliasName("Rslt.bsppl_grp_cd7", p);
		p.columnRslt_bsppl_grp_nm7 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_bsppl_grp_nm7.addAliasName("Rslt.bsppl_grp_nm7", p);
		p.columnRslt_bsppl_grp_cd8 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_bsppl_grp_cd8.addAliasName("Rslt.bsppl_grp_cd8", p);
		p.columnRslt_bsppl_grp_nm8 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_bsppl_grp_nm8.addAliasName("Rslt.bsppl_grp_nm8", p);
		p.columnRslt_bsppl_grp_cd9 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_bsppl_grp_cd9.addAliasName("Rslt.bsppl_grp_cd9", p);
		p.columnRslt_bsppl_grp_nm9 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_bsppl_grp_nm9.addAliasName("Rslt.bsppl_grp_nm9", p);
		p.columnRslt_bsppl_grp_cd10 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_bsppl_grp_cd10.addAliasName("Rslt.bsppl_grp_cd10", p);
		p.columnRslt_bsppl_grp_nm10 = p.Rslt_bsppl_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_bsppl_grp_nm10.addAliasName("Rslt.bsppl_grp_nm10", p);
		p.Rslt_asppl_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMSBH.MSBHP0100.RsltR.$asppl_grp_p);
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
	protected static void jbCreateBtn(MSBHP_PayActListReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBHP_PayActListReg p) {
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

	
	/** [Cnd_psppl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_psppl_cd_p = null;

	/**
	 * [Cnd_psppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_psppl_cd_ListPutter() {
		if (Cnd_psppl_cd_p == null) {
			Cnd_psppl_cd_p = createCnd_psppl_cd_ListPutter(Cnd_psppl_cd, "psppl_cd", "psppl_nm");

		}
		return Cnd_psppl_cd_p;
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
	
	
	/** [Cnd_pay_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_pay_usr_cd_p = null;

	/**
	 * [Cnd_pay_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pay_usr_cd_ListPutter() {
		if (Cnd_pay_usr_cd_p == null) {
			Cnd_pay_usr_cd_p = createCnd_pay_usr_cd_ListPutter(Cnd_pay_usr_cd, "pay_usr_cd", "pay_usr_nm");

		}
		return Cnd_pay_usr_cd_p;
	}
	
	
	/** [Cnd_pay_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_pay_dpt_cd_p = null;

	/**
	 * [Cnd_pay_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pay_dpt_cd_ListPutter() {
		if (Cnd_pay_dpt_cd_p == null) {
			Cnd_pay_dpt_cd_p = createCnd_pay_dpt_cd_ListPutter(Cnd_pay_dpt_cd, "pay_dpt_cd", "pay_dpt_nm");

		}
		return Cnd_pay_dpt_cd_p;
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
	
	
	/** [Cnd_bsppl_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bsppl_usr_cd_p = null;

	/**
	 * [Cnd_bsppl_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bsppl_usr_cd_ListPutter() {
		if (Cnd_bsppl_usr_cd_p == null) {
			Cnd_bsppl_usr_cd_p = createCnd_bsppl_usr_cd_ListPutter(Cnd_bsppl_usr_cd, "bsppl_usr_cd", "bsppl_usr_nm");

		}
		return Cnd_bsppl_usr_cd_p;
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
	
	
	/** [Cnd_ap_sttl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ap_sttl_cd_p = null;

	/**
	 * [Cnd_ap_sttl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ap_sttl_cd_ListPutter() {
		if (Cnd_ap_sttl_cd_p == null) {
			Cnd_ap_sttl_cd_p = createCnd_ap_sttl_cd_ListPutter(Cnd_ap_sttl_cd, "ap_sttl_cd", "ap_sttl_nm");

		}
		return Cnd_ap_sttl_cd_p;
	}
	
	
	/** [BulkSet_pay_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter BulkSet_pay_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [BulkSet_pay_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getBulkSet_pay_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (BulkSet_pay_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			BulkSet_pay_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createBulkSet_pay_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(BulkSet_pay_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "pay_dpt_cd", "pay_dpt_nm");
		}
		return BulkSet_pay_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [Rslt_pay_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_pay_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = null;

	/**
	 * [Rslt_pay_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_pay_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter() {
		if (Rslt_pay_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p == null) {
			Rslt_pay_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p = createRslt_pay_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(Rslt_pay_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd, "pay_dpt_cd", "pay_dpt_nm","wg_cd","wg_nm");
		}
		return Rslt_pay_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_p;
	}
	
	
	/** [Rslt_trd_cur_com_paid_tax_cd_ListPutter]の定義 */
	private MCListPutter Rslt_trd_cur_com_paid_tax_cd_p = null;

	/**
	 * [Rslt_trd_cur_com_paid_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_trd_cur_com_paid_tax_cd_ListPutter() {
		if (Rslt_trd_cur_com_paid_tax_cd_p == null) {
			Rslt_trd_cur_com_paid_tax_cd_p = createRslt_trd_cur_com_paid_tax_cd_ListPutter(columnRslt_trd_cur_com_paid_tax_cd, "trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_nm","trd_cur_com_paid_tax_rate");

		}
		return Rslt_trd_cur_com_paid_tax_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBHP_PayActListReg create(){
		MSBHP_PayActListReg p = new MSBHP_PayActListReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBHP_PayActListReg create(String name){
		MSBHP_PayActListReg p = new MSBHP_PayActListReg(name);
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
		MSBHP_PayActListReg_MC.jbfInitScreenOpe((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbfInitSrchMode((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbfInitTop((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbfInitFold((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbfInitTab1((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbfInitTab2((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbfInitPsppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbfInitTab3((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbfInitBsppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbfInitTab4((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbfInitAsppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbfInitCnd((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbfInitCtrl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbfInitRPnl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbfInitBulkSet((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbfInitRslt((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbfInitBtn((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbfInitEastBtn((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbInitScreenOpe((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbInitSrchMode((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbInitTop((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbInitFold((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbInitTab1((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbInitTab2((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbInitPsppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbInitTab3((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbInitBsppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbInitTab4((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbInitAsppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbInitCnd((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbInitCtrl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbInitRPnl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbInitBulkSet((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbInitRslt((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbInitBtn((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.jbInitEastBtn((MSBHP_PayActListReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [SrchMode]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchMode(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.SrchModePanel = p.beansFactory.createPanel("SrchMode");
		p.SrchModeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBHP_PayActListReg p) {
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
	protected static void jbfInitTab1(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Psppl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPsppl(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.PspplPanel = p.beansFactory.createPanel("Psppl");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Bsppl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBsppl(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.BspplPanel = p.beansFactory.createPanel("Bsppl");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [Asppl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAsppl(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.AspplPanel = p.beansFactory.createPanel("Asppl");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ope_PRNT = p.beansFactory.createRadioButton("Cnd.ope_PRNT");
		p.Cnd_mode_Group = p.beansFactory.createButtonGroup("Cnd.mode");
		p.Cnd_mode_PAYSCHD = p.beansFactory.createRadioButton("Cnd.mode_PAYSCHD");
		p.Cnd_mode_PAYACTD = p.beansFactory.createRadioButton("Cnd.mode_PAYACTD");
		p.Cnd_mode_SW = p.beansFactory.createRadioButton("Cnd.mode_SW");
		p.Cnd_pay_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.pay_schd_dt_fr_Label");
		p.Cnd_pay_schd_dt_fr = p.beansFactory.createDateField("Cnd.pay_schd_dt_fr");
		p.Cnd_pay_schd_dt_fr.setLabel(p.Cnd_pay_schd_dt_fr_Label);
		p.Cnd_pay_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.pay_schd_dt_to_Label");
		p.Cnd_pay_schd_dt_to = p.beansFactory.createDateField("Cnd.pay_schd_dt_to");
		p.Cnd_pay_schd_dt_to.setLabel(p.Cnd_pay_schd_dt_to_Label);
		p.Cnd_pay_act_dt_fr_Label = p.beansFactory.createLabel("Cnd.pay_act_dt_fr_Label");
		p.Cnd_pay_act_dt_fr = p.beansFactory.createDateField("Cnd.pay_act_dt_fr");
		p.Cnd_pay_act_dt_fr.setLabel(p.Cnd_pay_act_dt_fr_Label);
		p.Cnd_pay_act_dt_to_Label = p.beansFactory.createLabel("Cnd.pay_act_dt_to_Label");
		p.Cnd_pay_act_dt_to = p.beansFactory.createDateField("Cnd.pay_act_dt_to");
		p.Cnd_pay_act_dt_to.setLabel(p.Cnd_pay_act_dt_to_Label);
		p.Cnd_ac_dt_fr_Label = p.beansFactory.createLabel("Cnd.ac_dt_fr_Label");
		p.Cnd_ac_dt_fr = p.beansFactory.createDateField("Cnd.ac_dt_fr");
		p.Cnd_ac_dt_fr.setLabel(p.Cnd_ac_dt_fr_Label);
		p.Cnd_ac_dt_to_Label = p.beansFactory.createLabel("Cnd.ac_dt_to_Label");
		p.Cnd_ac_dt_to = p.beansFactory.createDateField("Cnd.ac_dt_to");
		p.Cnd_ac_dt_to.setLabel(p.Cnd_ac_dt_to_Label);
		p.Cnd_bsppl_cl_dt_fr_Label = p.beansFactory.createLabel("Cnd.bsppl_cl_dt_fr_Label");
		p.Cnd_bsppl_cl_dt_fr = p.beansFactory.createDateField("Cnd.bsppl_cl_dt_fr");
		p.Cnd_bsppl_cl_dt_fr.setLabel(p.Cnd_bsppl_cl_dt_fr_Label);
		p.Cnd_bsppl_cl_dt_to_Label = p.beansFactory.createLabel("Cnd.bsppl_cl_dt_to_Label");
		p.Cnd_bsppl_cl_dt_to = p.beansFactory.createDateField("Cnd.bsppl_cl_dt_to");
		p.Cnd_bsppl_cl_dt_to.setLabel(p.Cnd_bsppl_cl_dt_to_Label);
		p.Cnd_psppl_cd_Label = p.beansFactory.createLabel("Cnd.psppl_cd_Label");
		p.Cnd_psppl_cd = p.beansFactory.createTextField("Cnd.psppl_cd");
		p.Cnd_psppl_cd.setLabel(p.Cnd_psppl_cd_Label);
		p.Cnd_psppl_nm = p.beansFactory.createTextField("Cnd.psppl_nm");
		p.Cnd_bsppl_cd_Label = p.beansFactory.createLabel("Cnd.bsppl_cd_Label");
		p.Cnd_bsppl_cd = p.beansFactory.createTextField("Cnd.bsppl_cd");
		p.Cnd_bsppl_cd.setLabel(p.Cnd_bsppl_cd_Label);
		p.Cnd_bsppl_nm = p.beansFactory.createTextField("Cnd.bsppl_nm");
		p.Cnd_pay_usr_cd_Label = p.beansFactory.createLabel("Cnd.pay_usr_cd_Label");
		p.Cnd_pay_usr_cd = p.beansFactory.createTextField("Cnd.pay_usr_cd");
		p.Cnd_pay_usr_cd.setLabel(p.Cnd_pay_usr_cd_Label);
		p.Cnd_pay_usr_nm = p.beansFactory.createTextField("Cnd.pay_usr_nm");
		p.Cnd_pay_dpt_cd_Label = p.beansFactory.createLabel("Cnd.pay_dpt_cd_Label");
		p.Cnd_pay_dpt_cd = p.beansFactory.createTextField("Cnd.pay_dpt_cd");
		p.Cnd_pay_dpt_cd.setLabel(p.Cnd_pay_dpt_cd_Label);
		p.Cnd_pay_dpt_nm = p.beansFactory.createTextField("Cnd.pay_dpt_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_bsppl_usr_cd_Label = p.beansFactory.createLabel("Cnd.bsppl_usr_cd_Label");
		p.Cnd_bsppl_usr_cd = p.beansFactory.createTextField("Cnd.bsppl_usr_cd");
		p.Cnd_bsppl_usr_cd.setLabel(p.Cnd_bsppl_usr_cd_Label);
		p.Cnd_bsppl_usr_nm = p.beansFactory.createTextField("Cnd.bsppl_usr_nm");
		p.Cnd_bsppl_dpt_cd_Label = p.beansFactory.createLabel("Cnd.bsppl_dpt_cd_Label");
		p.Cnd_bsppl_dpt_cd = p.beansFactory.createTextField("Cnd.bsppl_dpt_cd");
		p.Cnd_bsppl_dpt_cd.setLabel(p.Cnd_bsppl_dpt_cd_Label);
		p.Cnd_bsppl_dpt_nm = p.beansFactory.createTextField("Cnd.bsppl_dpt_nm");
		p.Cnd_trd_cur_cd_Label = p.beansFactory.createLabel("Cnd.trd_cur_cd_Label");
		p.Cnd_trd_cur_cd = p.beansFactory.createTextComboBox("Cnd.trd_cur_cd");
		p.Cnd_trd_cur_cd.setLabel(p.Cnd_trd_cur_cd_Label);
		p.Cnd_trd_cur_nm = p.beansFactory.createTextField("Cnd.trd_cur_nm");
		p.Cnd_ap_sttl_cd_Label = p.beansFactory.createLabel("Cnd.ap_sttl_cd_Label");
		p.Cnd_ap_sttl_cd = p.beansFactory.createTextComboBox("Cnd.ap_sttl_cd");
		p.Cnd_ap_sttl_cd.setLabel(p.Cnd_ap_sttl_cd_Label);
		p.Cnd_ap_sttl_nm = p.beansFactory.createTextField("Cnd.ap_sttl_nm");
		p.Cnd_purc_act_no_Label = p.beansFactory.createLabel("Cnd.purc_act_no_Label");
		p.Cnd_purc_act_no = p.beansFactory.createTextField("Cnd.purc_act_no");
		p.Cnd_purc_act_no.setLabel(p.Cnd_purc_act_no_Label);
		p.Cnd_rcpt_iv_no_Label = p.beansFactory.createLabel("Cnd.rcpt_iv_no_Label");
		p.Cnd_rcpt_iv_no = p.beansFactory.createTextField("Cnd.rcpt_iv_no");
		p.Cnd_rcpt_iv_no.setLabel(p.Cnd_rcpt_iv_no_Label);
		p.Cnd_rcpt_iv_mng_no_Label = p.beansFactory.createLabel("Cnd.rcpt_iv_mng_no_Label");
		p.Cnd_rcpt_iv_mng_no = p.beansFactory.createTextField("Cnd.rcpt_iv_mng_no");
		p.Cnd_rcpt_iv_mng_no.setLabel(p.Cnd_rcpt_iv_mng_no_Label);
		p.Cnd_pay_chk_no_Label = p.beansFactory.createLabel("Cnd.pay_chk_no_Label");
		p.Cnd_pay_chk_no = p.beansFactory.createTextField("Cnd.pay_chk_no");
		p.Cnd_pay_chk_no.setLabel(p.Cnd_pay_chk_no_Label);
		p.Cnd_pay_schd_no_Label = p.beansFactory.createLabel("Cnd.pay_schd_no_Label");
		p.Cnd_pay_schd_no = p.beansFactory.createTextField("Cnd.pay_schd_no");
		p.Cnd_pay_schd_no.setLabel(p.Cnd_pay_schd_no_Label);
		p.Cnd_pay_act_no_Label = p.beansFactory.createLabel("Cnd.pay_act_no_Label");
		p.Cnd_pay_act_no = p.beansFactory.createTextField("Cnd.pay_act_no");
		p.Cnd_pay_act_no.setLabel(p.Cnd_pay_act_no_Label);
		p.Cnd_note_no_Label = p.beansFactory.createLabel("Cnd.note_no_Label");
		p.Cnd_note_no = p.beansFactory.createTextField("Cnd.note_no");
		p.Cnd_note_no.setLabel(p.Cnd_note_no_Label);
		p.Cnd_trd_rmrks_Label = p.beansFactory.createLabel("Cnd.trd_rmrks_Label");
		p.Cnd_trd_rmrks = p.beansFactory.createTextField("Cnd.trd_rmrks");
		p.Cnd_trd_rmrks.setLabel(p.Cnd_trd_rmrks_Label);
		p.Cnd_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.intr_rmrks_Label");
		p.Cnd_intr_rmrks = p.beansFactory.createTextField("Cnd.intr_rmrks");
		p.Cnd_intr_rmrks.setLabel(p.Cnd_intr_rmrks_Label);
		p.Cnd_trd_d_rmrks_Label = p.beansFactory.createLabel("Cnd.trd_d_rmrks_Label");
		p.Cnd_trd_d_rmrks = p.beansFactory.createTextField("Cnd.trd_d_rmrks");
		p.Cnd_trd_d_rmrks.setLabel(p.Cnd_trd_d_rmrks_Label);
		p.Cnd_intr_d_rmrks_Label = p.beansFactory.createLabel("Cnd.intr_d_rmrks_Label");
		p.Cnd_intr_d_rmrks = p.beansFactory.createTextField("Cnd.intr_d_rmrks");
		p.Cnd_intr_d_rmrks.setLabel(p.Cnd_intr_d_rmrks_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
		p.Cnd_dtl_sub_char1_Label = p.beansFactory.createLabel("Cnd.dtl_sub_char1_Label");
		p.Cnd_dtl_sub_char1 = p.beansFactory.createTextField("Cnd.dtl_sub_char1");
		p.Cnd_dtl_sub_char1.setLabel(p.Cnd_dtl_sub_char1_Label);
		p.Cnd_dtl_sub_char2_Label = p.beansFactory.createLabel("Cnd.dtl_sub_char2_Label");
		p.Cnd_dtl_sub_char2 = p.beansFactory.createTextField("Cnd.dtl_sub_char2");
		p.Cnd_dtl_sub_char2.setLabel(p.Cnd_dtl_sub_char2_Label);
		p.Cnd_dtl_sub_char3_Label = p.beansFactory.createLabel("Cnd.dtl_sub_char3_Label");
		p.Cnd_dtl_sub_char3 = p.beansFactory.createTextField("Cnd.dtl_sub_char3");
		p.Cnd_dtl_sub_char3.setLabel(p.Cnd_dtl_sub_char3_Label);
		p.Cnd_inc_can_flg = p.beansFactory.createCheckBox("Cnd.inc_can_flg");
		p.Cnd_inc_schd_act_flg = p.beansFactory.createCheckBox("Cnd.inc_schd_act_flg");
		p.Cnd_inc_sw_flg = p.beansFactory.createCheckBox("Cnd.inc_sw_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
		p.BulkSet_pay_act_dt_Label = p.beansFactory.createLabel("BulkSet.pay_act_dt_Label");
		p.BulkSet_pay_act_dt = p.beansFactory.createDateField("BulkSet.pay_act_dt");
		p.BulkSet_pay_act_dt.setLabel(p.BulkSet_pay_act_dt_Label);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_pay_act_dt = p.beansFactory.createTableColumn("Rslt.pay_act_dt", MCColumnType.DATE);
		p.columnRslt_pay_basis_dt = p.beansFactory.createTableColumn("Rslt.pay_basis_dt", MCColumnType.DATE);
		p.columnRslt_ac_ym = p.beansFactory.createTableColumn("Rslt.ac_ym", MCColumnType.DATE);
		p.columnRslt_slip_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_psppl_cd = p.beansFactory.createTableColumn("Rslt.psppl_cd", MCColumnType.TEXT);
		p.columnRslt_psppl_nm = p.beansFactory.createTableColumn("Rslt.psppl_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_ap_sttl_cd = p.beansFactory.createTableColumn("Rslt.ap_sttl_cd", MCColumnType.TEXT);
		p.columnRslt_ap_sttl_nm = p.beansFactory.createTableColumn("Rslt.ap_sttl_nm", MCColumnType.TEXT);
		p.columnRslt_ap_sttl_typ = p.beansFactory.createTableColumn("Rslt.ap_sttl_typ", MCColumnType.TEXT);
		p.columnRslt_ap_sttl_typ_nm = p.beansFactory.createTableColumn("Rslt.ap_sttl_typ_nm", MCColumnType.TEXT);
		p.columnRslt_bsppl_cd = p.beansFactory.createTableColumn("Rslt.bsppl_cd", MCColumnType.TEXT);
		p.columnRslt_bsppl_nm = p.beansFactory.createTableColumn("Rslt.bsppl_nm", MCColumnType.TEXT);
		p.columnRslt_bsppl_usr_cd = p.beansFactory.createTableColumn("Rslt.bsppl_usr_cd", MCColumnType.TEXT);
		p.columnRslt_bsppl_usr_nm = p.beansFactory.createTableColumn("Rslt.bsppl_usr_nm", MCColumnType.TEXT);
		p.columnRslt_bsppl_dpt_cd = p.beansFactory.createTableColumn("Rslt.bsppl_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_bsppl_dpt_nm = p.beansFactory.createTableColumn("Rslt.bsppl_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_purc_act_no = p.beansFactory.createTableColumn("Rslt.purc_act_no", MCColumnType.TEXT);
		p.columnRslt_rcpt_iv_no = p.beansFactory.createTableColumn("Rslt.rcpt_iv_no", MCColumnType.TEXT);
		p.columnRslt_rcpt_iv_mng_no = p.beansFactory.createTableColumn("Rslt.rcpt_iv_mng_no", MCColumnType.TEXT);
		p.columnRslt_bsppl_cl_ym = p.beansFactory.createTableColumn("Rslt.bsppl_cl_ym", MCColumnType.DATE);
		p.columnRslt_bsppl_cl_day = p.beansFactory.createTableColumn("Rslt.bsppl_cl_day", MCColumnType.NUMBER);
		p.columnRslt_bsppl_cl_dt = p.beansFactory.createTableColumn("Rslt.bsppl_cl_dt", MCColumnType.DATE);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.trd_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_xrate_cd = p.beansFactory.createTableColumn("Rslt.xrate_cd", MCColumnType.TEXT);
		p.columnRslt_base_cur_cd = p.beansFactory.createTableColumn("Rslt.base_cur_cd", MCColumnType.TEXT);
		p.columnRslt_base_cur_nm = p.beansFactory.createTableColumn("Rslt.base_cur_nm", MCColumnType.TEXT);
		p.columnRslt_base_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.base_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_com_paid_tax_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_com_paid_tax_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_trd_cur_com_paid_tax_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_com_paid_tax_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cur_com_paid_tax_rate = p.beansFactory.createTableColumn("Rslt.trd_cur_com_paid_tax_rate", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_com_paid_amt = p.beansFactory.createTableColumn("Rslt.trd_cur_com_paid_amt", MCColumnType.NUMBER);
		p.columnRslt_rcv_bill_no = p.beansFactory.createTableColumn("Rslt.rcv_bill_no", MCColumnType.TEXT);
		p.columnRslt_adv_pay_act_no = p.beansFactory.createTableColumn("Rslt.adv_pay_act_no", MCColumnType.TEXT);
		p.columnRslt_rcv_no = p.beansFactory.createTableColumn("Rslt.rcv_no", MCColumnType.TEXT);
		p.columnRslt_asppl_cd = p.beansFactory.createTableColumn("Rslt.asppl_cd", MCColumnType.TEXT);
		p.columnRslt_asppl_nm = p.beansFactory.createTableColumn("Rslt.asppl_nm", MCColumnType.TEXT);
		p.columnRslt_ap_dpt_cd = p.beansFactory.createTableColumn("Rslt.ap_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_ap_dpt_nm = p.beansFactory.createTableColumn("Rslt.ap_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_ap_typ = p.beansFactory.createTableColumn("Rslt.ap_typ", MCColumnType.TEXT);
		p.columnRslt_ap_typ_nm = p.beansFactory.createTableColumn("Rslt.ap_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ap_setoff_typ = p.beansFactory.createTableColumn("Rslt.ap_setoff_typ", MCColumnType.TEXT);
		p.columnRslt_ap_setoff_typ_nm = p.beansFactory.createTableColumn("Rslt.ap_setoff_typ_nm", MCColumnType.TEXT);
		p.columnRslt_setoff_cd = p.beansFactory.createTableColumn("Rslt.setoff_cd", MCColumnType.TEXT);
		p.columnRslt_setoff_nm = p.beansFactory.createTableColumn("Rslt.setoff_nm", MCColumnType.TEXT);
		p.columnRslt_so_dpt_cd = p.beansFactory.createTableColumn("Rslt.so_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_so_dpt_nm = p.beansFactory.createTableColumn("Rslt.so_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_bank_ac_cd = p.beansFactory.createTableColumn("Rslt.bank_ac_cd", MCColumnType.TEXT);
		p.columnRslt_bank_ac_nm = p.beansFactory.createTableColumn("Rslt.bank_ac_nm", MCColumnType.TEXT);
		p.columnRslt_pay_bank_ac_cd = p.beansFactory.createTableColumn("Rslt.pay_bank_ac_cd", MCColumnType.TEXT);
		p.columnRslt_pay_bank_ac_nm = p.beansFactory.createTableColumn("Rslt.pay_bank_ac_nm", MCColumnType.TEXT);
		p.columnRslt_note_no = p.beansFactory.createTableColumn("Rslt.note_no", MCColumnType.TEXT);
		p.columnRslt_note_typ = p.beansFactory.createTableColumn("Rslt.note_typ", MCColumnType.TEXT);
		p.columnRslt_note_typ_nm = p.beansFactory.createTableColumn("Rslt.note_typ_nm", MCColumnType.TEXT);
		p.columnRslt_draw_dt = p.beansFactory.createTableColumn("Rslt.draw_dt", MCColumnType.DATE);
		p.columnRslt_note_days = p.beansFactory.createTableColumn("Rslt.note_days", MCColumnType.NUMBER);
		p.columnRslt_due_dt = p.beansFactory.createTableColumn("Rslt.due_dt", MCColumnType.DATE);
		p.columnRslt_drawer_nm = p.beansFactory.createTableColumn("Rslt.drawer_nm", MCColumnType.TEXT);
		p.columnRslt_endrsr = p.beansFactory.createTableColumn("Rslt.endrsr", MCColumnType.TEXT);
		p.columnRslt_accptr = p.beansFactory.createTableColumn("Rslt.accptr", MCColumnType.TEXT);
		p.columnRslt_draw_bank_cd = p.beansFactory.createTableColumn("Rslt.draw_bank_cd", MCColumnType.TEXT);
		p.columnRslt_draw_bank_nm = p.beansFactory.createTableColumn("Rslt.draw_bank_nm", MCColumnType.TEXT);
		p.columnRslt_draw_branch_cd = p.beansFactory.createTableColumn("Rslt.draw_branch_cd", MCColumnType.TEXT);
		p.columnRslt_draw_branch_nm = p.beansFactory.createTableColumn("Rslt.draw_branch_nm", MCColumnType.TEXT);
		p.columnRslt_note_rsn_cd = p.beansFactory.createTableColumn("Rslt.note_rsn_cd", MCColumnType.TEXT);
		p.columnRslt_note_rsn_nm = p.beansFactory.createTableColumn("Rslt.note_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_note_sub_char1 = p.beansFactory.createTableColumn("Rslt.note_sub_char1", MCColumnType.TEXT);
		p.columnRslt_note_sub_char2 = p.beansFactory.createTableColumn("Rslt.note_sub_char2", MCColumnType.TEXT);
		p.columnRslt_note_sub_char3 = p.beansFactory.createTableColumn("Rslt.note_sub_char3", MCColumnType.TEXT);
		p.columnRslt_pay_schd_dt = p.beansFactory.createTableColumn("Rslt.pay_schd_dt", MCColumnType.DATE);
		p.columnRslt_pay_chk_no = p.beansFactory.createTableColumn("Rslt.pay_chk_no", MCColumnType.TEXT);
		p.columnRslt_pay_chk_mng_no = p.beansFactory.createTableColumn("Rslt.pay_chk_mng_no", MCColumnType.TEXT);
		p.columnRslt_pay_schd_no = p.beansFactory.createTableColumn("Rslt.pay_schd_no", MCColumnType.TEXT);
		p.columnRslt_ap_appl_schd_no = p.beansFactory.createTableColumn("Rslt.ap_appl_schd_no", MCColumnType.TEXT);
		p.columnRslt_pay_act_no = p.beansFactory.createTableColumn("Rslt.pay_act_no", MCColumnType.TEXT);
		p.columnRslt_pay_act_rev = p.beansFactory.createTableColumn("Rslt.pay_act_rev", MCColumnType.NUMBER);
		p.columnRslt_pay_act_seq = p.beansFactory.createTableColumn("Rslt.pay_act_seq", MCColumnType.NUMBER);
		p.columnRslt_disp_seq = p.beansFactory.createTableColumn("Rslt.disp_seq", MCColumnType.NUMBER);
		p.columnRslt_pay_act_d_no = p.beansFactory.createTableColumn("Rslt.pay_act_d_no", MCColumnType.TEXT);
		p.columnRslt_pay_act_d_seq = p.beansFactory.createTableColumn("Rslt.pay_act_d_seq", MCColumnType.NUMBER);
		p.columnRslt_pay_sts_typ = p.beansFactory.createTableColumn("Rslt.pay_sts_typ", MCColumnType.TEXT);
		p.columnRslt_pay_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.pay_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_schd_act_flg = p.beansFactory.createTableColumn("Rslt.schd_act_flg", MCColumnType.CHECK);
		p.columnRslt_multi_act_d_flg = p.beansFactory.createTableColumn("Rslt.multi_act_d_flg", MCColumnType.CHECK);
		p.columnRslt_sw_flg = p.beansFactory.createTableColumn("Rslt.sw_flg", MCColumnType.CHECK);
		p.columnRslt_sw_to_ap_sttl_cd = p.beansFactory.createTableColumn("Rslt.sw_to_ap_sttl_cd", MCColumnType.TEXT);
		p.columnRslt_sw_to_ap_sttl_nm = p.beansFactory.createTableColumn("Rslt.sw_to_ap_sttl_nm", MCColumnType.TEXT);
		p.columnRslt_sw_to_ap_sttl_typ = p.beansFactory.createTableColumn("Rslt.sw_to_ap_sttl_typ", MCColumnType.TEXT);
		p.columnRslt_sw_to_ap_sttl_typ_nm = p.beansFactory.createTableColumn("Rslt.sw_to_ap_sttl_typ_nm", MCColumnType.TEXT);
		p.columnRslt_sw_to_asppl_cd = p.beansFactory.createTableColumn("Rslt.sw_to_asppl_cd", MCColumnType.TEXT);
		p.columnRslt_sw_to_asppl_nm = p.beansFactory.createTableColumn("Rslt.sw_to_asppl_nm", MCColumnType.TEXT);
		p.columnRslt_sw_to_ap_dpt_cd = p.beansFactory.createTableColumn("Rslt.sw_to_ap_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_sw_to_ap_dpt_nm = p.beansFactory.createTableColumn("Rslt.sw_to_ap_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_sw_to_bsppl_cd = p.beansFactory.createTableColumn("Rslt.sw_to_bsppl_cd", MCColumnType.TEXT);
		p.columnRslt_sw_to_bsppl_nm = p.beansFactory.createTableColumn("Rslt.sw_to_bsppl_nm", MCColumnType.TEXT);
		p.columnRslt_sw_to_bsppl_dpt_cd = p.beansFactory.createTableColumn("Rslt.sw_to_bsppl_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_sw_to_bsppl_dpt_nm = p.beansFactory.createTableColumn("Rslt.sw_to_bsppl_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_sw_to_wrk_no = p.beansFactory.createTableColumn("Rslt.sw_to_wrk_no", MCColumnType.TEXT);
		p.columnRslt_sw_to_wrk_nm = p.beansFactory.createTableColumn("Rslt.sw_to_wrk_nm", MCColumnType.TEXT);
		p.columnRslt_trd_rmrks = p.beansFactory.createTableColumn("Rslt.trd_rmrks", MCColumnType.TEXT);
		p.columnRslt_intr_rmrks = p.beansFactory.createTableColumn("Rslt.intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_pay_ntc_d_print_rmrks = p.beansFactory.createTableColumn("Rslt.pay_ntc_d_print_rmrks", MCColumnType.TEXT);
		p.columnRslt_trd_d_rmrks = p.beansFactory.createTableColumn("Rslt.trd_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_intr_d_rmrks = p.beansFactory.createTableColumn("Rslt.intr_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_dtl_sub_char1 = p.beansFactory.createTableColumn("Rslt.dtl_sub_char1", MCColumnType.TEXT);
		p.columnRslt_dtl_sub_char2 = p.beansFactory.createTableColumn("Rslt.dtl_sub_char2", MCColumnType.TEXT);
		p.columnRslt_dtl_sub_char3 = p.beansFactory.createTableColumn("Rslt.dtl_sub_char3", MCColumnType.TEXT);
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
		p.columnRslt_pay_chk_upd_cntr = p.beansFactory.createTableColumn("Rslt.pay_chk_upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_upd_cntr = p.beansFactory.createTableColumn("Rslt.upd_cntr", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBHP0090 = p.beansFactory.createButton("Btn.open_MSBHP0090", "open");
		p.Btn_prnt_sw = p.beansFactory.createButton("Btn.prnt_sw", "prnt");
		p.Btn_indiv_prnt_flg = p.beansFactory.createCheckBox("Btn.indiv_prnt_flg");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.SrchModePanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchMode]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchMode(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.SrchModePanel.setBorder(p.SrchModeTitledBorder);
		p.add(p.SrchModePanel);
		p.SrchModePanel.setNextBeans(p.TopPanel);
		p.SrchModePanel.setValueCheck(false);
		p.SrchModePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SrchModePanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.BulkSetPanel);
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
	protected static void jbInitFold(MSBHP_PayActListReg p) {
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
		p.Tab3Panel.setNextBeans(p.Tab4Panel);
		p.FoldTab.add(p.Tab4Panel, "Fold.tab4");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("NW");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.PspplPanel, null);
		p.Tab2Panel.setLastBeans(p.PspplPanel);
	}

	/**
	 * [Psppl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPsppl(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.PspplPanel.setValueCheck(false);
		p.PspplPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.PspplPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.Tab3Panel.setNextBeans(p.Tab4Panel);
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.BspplPanel, null);
		p.Tab3Panel.setLastBeans(p.BspplPanel);
	}

	/**
	 * [Bsppl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBsppl(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.BspplPanel.setValueCheck(false);
		p.BspplPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.BspplPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab4(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.Tab4Panel.setValueCheck(false);
		p.Tab4Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab4Panel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.Tab4Panel.add(p.AspplPanel, null);
		p.Tab4Panel.setLastBeans(p.AspplPanel);
	}

	/**
	 * [Asppl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAsppl(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.AspplPanel.setValueCheck(false);
		p.AspplPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.AspplPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_INS);
		p.ScreenOpePanel.add(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setNextBeans(p.Cnd_ope_PRNT);
		p.Cnd_ope_PRNT.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_PRNT);
		p.ScreenOpePanel.add(p.Cnd_ope_PRNT);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.ope_META);
		p.SrchModePanel.setLastBeans(p.Cnd_mode_Group);
		p.Cnd_mode_Group.setFirstBeans(p.Cnd_mode_PAYSCHD);
		p.Cnd_mode_PAYSCHD.setActionCommand("PAYSCHD");
		p.Cnd_mode_Group.add(p.Cnd_mode_PAYSCHD);
		p.SrchModePanel.add(p.Cnd_mode_PAYSCHD);
		p.Cnd_mode_PAYSCHD.setNextBeans(p.Cnd_mode_PAYACTD);
		p.Cnd_mode_PAYACTD.setActionCommand("PAYACTD");
		p.Cnd_mode_Group.add(p.Cnd_mode_PAYACTD);
		p.SrchModePanel.add(p.Cnd_mode_PAYACTD);
		p.Cnd_mode_PAYACTD.setNextBeans(p.Cnd_mode_SW);
		p.Cnd_mode_SW.setActionCommand("SW");
		p.Cnd_mode_Group.add(p.Cnd_mode_SW);
		p.SrchModePanel.add(p.Cnd_mode_SW);
		p.Cnd_mode_Group.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.mode_META);
		p.CndPanel.add(p.Cnd_pay_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_pay_schd_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_pay_schd_dt_fr);
		p.Cnd_pay_schd_dt_fr.setNextBeans(p.Cnd_pay_schd_dt_to);
		p.Cnd_pay_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.pay_schd_dt_fr_META);
		p.Cnd_pay_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_pay_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_pay_schd_dt_to);
		p.Cnd_pay_schd_dt_to.setNextBeans(p.Cnd_pay_act_dt_fr);
		p.Cnd_pay_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.pay_schd_dt_to_META);
		p.Cnd_pay_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_pay_act_dt_fr_Label);
		p.CndPanel.add(p.Cnd_pay_act_dt_fr);
		p.Cnd_pay_act_dt_fr.setNextBeans(p.Cnd_pay_act_dt_to);
		p.Cnd_pay_act_dt_fr.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.pay_act_dt_fr_META);
		p.Cnd_pay_act_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_pay_act_dt_to_Label);
		p.CndPanel.add(p.Cnd_pay_act_dt_to);
		p.Cnd_pay_act_dt_to.setNextBeans(p.Cnd_ac_dt_fr);
		p.Cnd_pay_act_dt_to.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.pay_act_dt_to_META);
		p.Cnd_pay_act_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_fr_Label);
		p.CndPanel.add(p.Cnd_ac_dt_fr);
		p.Cnd_ac_dt_fr.setNextBeans(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_fr.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.ac_dt_fr_META);
		p.Cnd_ac_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_to_Label);
		p.CndPanel.add(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_to.setNextBeans(p.Cnd_bsppl_cl_dt_fr);
		p.Cnd_ac_dt_to.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.ac_dt_to_META);
		p.Cnd_ac_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_bsppl_cl_dt_fr_Label);
		p.CndPanel.add(p.Cnd_bsppl_cl_dt_fr);
		p.Cnd_bsppl_cl_dt_fr.setNextBeans(p.Cnd_bsppl_cl_dt_to);
		p.Cnd_bsppl_cl_dt_fr.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.bsppl_cl_dt_fr_META);
		p.Cnd_bsppl_cl_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_bsppl_cl_dt_to_Label);
		p.CndPanel.add(p.Cnd_bsppl_cl_dt_to);
		p.Cnd_bsppl_cl_dt_to.setNextBeans(p.Cnd_psppl_cd);
		p.Cnd_bsppl_cl_dt_to.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.bsppl_cl_dt_to_META);
		p.Cnd_bsppl_cl_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_psppl_cd_Label);
		p.CndPanel.add(p.Cnd_psppl_cd);
		p.Cnd_psppl_cd.setNextBeans(p.Cnd_psppl_nm);
		p.Cnd_psppl_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.psppl_cd_META);
		p.Cnd_psppl_cd.addLinkBeans(p.Cnd_psppl_nm);
		p.Cnd_psppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_psppl_cd, true);
		p.CndPanel.add(p.Cnd_psppl_nm);
		p.Cnd_psppl_nm.setNextBeans(p.Cnd_bsppl_cd);
		p.Cnd_psppl_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.psppl_nm_META);
		p.setPluralValueEnable(p.Cnd_psppl_nm, true);
		p.CndPanel.add(p.Cnd_bsppl_cd_Label);
		p.CndPanel.add(p.Cnd_bsppl_cd);
		p.Cnd_bsppl_cd.setNextBeans(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.bsppl_cd_META);
		p.Cnd_bsppl_cd.addLinkBeans(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bsppl_cd, true);
		p.CndPanel.add(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_nm.setNextBeans(p.Cnd_pay_usr_cd);
		p.Cnd_bsppl_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.bsppl_nm_META);
		p.setPluralValueEnable(p.Cnd_bsppl_nm, true);
		p.CndPanel.add(p.Cnd_pay_usr_cd_Label);
		p.CndPanel.add(p.Cnd_pay_usr_cd);
		p.Cnd_pay_usr_cd.setNextBeans(p.Cnd_pay_usr_nm);
		p.Cnd_pay_usr_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.pay_usr_cd_META);
		p.Cnd_pay_usr_cd.addLinkBeans(p.Cnd_pay_usr_nm);
		p.Cnd_pay_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_pay_usr_cd, true);
		p.CndPanel.add(p.Cnd_pay_usr_nm);
		p.Cnd_pay_usr_nm.setNextBeans(p.Cnd_pay_dpt_cd);
		p.Cnd_pay_usr_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.pay_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_pay_usr_nm, true);
		p.CndPanel.add(p.Cnd_pay_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_pay_dpt_cd);
		p.Cnd_pay_dpt_cd.setNextBeans(p.Cnd_pay_dpt_nm);
		p.Cnd_pay_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.pay_dpt_cd_META);
		p.Cnd_pay_dpt_cd.addLinkBeans(p.Cnd_pay_dpt_nm);
		p.Cnd_pay_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_pay_dpt_cd, true);
		p.CndPanel.add(p.Cnd_pay_dpt_nm);
		p.Cnd_pay_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_pay_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.pay_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_pay_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_bsppl_usr_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_bsppl_usr_cd_Label);
		p.CndPanel.add(p.Cnd_bsppl_usr_cd);
		p.Cnd_bsppl_usr_cd.setNextBeans(p.Cnd_bsppl_usr_nm);
		p.Cnd_bsppl_usr_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.bsppl_usr_cd_META);
		p.Cnd_bsppl_usr_cd.addLinkBeans(p.Cnd_bsppl_usr_nm);
		p.Cnd_bsppl_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bsppl_usr_cd, true);
		p.CndPanel.add(p.Cnd_bsppl_usr_nm);
		p.Cnd_bsppl_usr_nm.setNextBeans(p.Cnd_bsppl_dpt_cd);
		p.Cnd_bsppl_usr_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.bsppl_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_bsppl_usr_nm, true);
		p.CndPanel.add(p.Cnd_bsppl_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_bsppl_dpt_cd);
		p.Cnd_bsppl_dpt_cd.setNextBeans(p.Cnd_bsppl_dpt_nm);
		p.Cnd_bsppl_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.bsppl_dpt_cd_META);
		p.Cnd_bsppl_dpt_cd.addLinkBeans(p.Cnd_bsppl_dpt_nm);
		p.Cnd_bsppl_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bsppl_dpt_cd, true);
		p.CndPanel.add(p.Cnd_bsppl_dpt_nm);
		p.Cnd_bsppl_dpt_nm.setNextBeans(p.Cnd_trd_cur_cd);
		p.Cnd_bsppl_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.bsppl_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_bsppl_dpt_nm, true);
		p.Cnd_trd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cur_cd, true);
		p.Cnd_trd_cur_cd.setLinkBeans(p.Cnd_trd_cur_nm);
		p.CndPanel.add(p.Cnd_trd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cur_cd);
		p.Cnd_trd_cur_cd.setNextBeans(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.trd_cur_cd_META);
		p.CndPanel.add(p.Cnd_trd_cur_nm);
		p.Cnd_trd_cur_nm.setNextBeans(p.Cnd_ap_sttl_cd);
		p.Cnd_trd_cur_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.trd_cur_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_cur_nm, true);
		p.Cnd_ap_sttl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ap_sttl_cd, true);
		p.Cnd_ap_sttl_cd.setLinkBeans(p.Cnd_ap_sttl_nm);
		p.CndPanel.add(p.Cnd_ap_sttl_cd_Label);
		p.CndPanel.add(p.Cnd_ap_sttl_cd);
		p.Cnd_ap_sttl_cd.setNextBeans(p.Cnd_ap_sttl_nm);
		p.Cnd_ap_sttl_cd.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.ap_sttl_cd_META);
		p.CndPanel.add(p.Cnd_ap_sttl_nm);
		p.Cnd_ap_sttl_nm.setNextBeans(p.Cnd_purc_act_no);
		p.Cnd_ap_sttl_nm.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.ap_sttl_nm_META);
		p.CndPanel.add(p.Cnd_purc_act_no_Label);
		p.CndPanel.add(p.Cnd_purc_act_no);
		p.Cnd_purc_act_no.setNextBeans(p.Cnd_rcpt_iv_no);
		p.Cnd_purc_act_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.purc_act_no_META);
		p.setPluralValueEnable(p.Cnd_purc_act_no, true);
		p.CndPanel.add(p.Cnd_rcpt_iv_no_Label);
		p.CndPanel.add(p.Cnd_rcpt_iv_no);
		p.Cnd_rcpt_iv_no.setNextBeans(p.Cnd_rcpt_iv_mng_no);
		p.Cnd_rcpt_iv_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.rcpt_iv_no_META);
		p.setPluralValueEnable(p.Cnd_rcpt_iv_no, true);
		p.CndPanel.add(p.Cnd_rcpt_iv_mng_no_Label);
		p.CndPanel.add(p.Cnd_rcpt_iv_mng_no);
		p.Cnd_rcpt_iv_mng_no.setNextBeans(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_rcpt_iv_mng_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.rcpt_iv_mng_no_META);
		p.setPluralValueEnable(p.Cnd_rcpt_iv_mng_no, true);
		p.CndPanel.add(p.Cnd_wrk_no_p_PPanel);
		p.Cnd_wrk_no_p_PPanel.setNextBeans(p.Cnd_pay_chk_no);
		p.CndPanel.add(p.Cnd_pay_chk_no_Label);
		p.CndPanel.add(p.Cnd_pay_chk_no);
		p.Cnd_pay_chk_no.setNextBeans(p.Cnd_pay_schd_no);
		p.Cnd_pay_chk_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.pay_chk_no_META);
		p.setPluralValueEnable(p.Cnd_pay_chk_no, true);
		p.CndPanel.add(p.Cnd_pay_schd_no_Label);
		p.CndPanel.add(p.Cnd_pay_schd_no);
		p.Cnd_pay_schd_no.setNextBeans(p.Cnd_pay_act_no);
		p.Cnd_pay_schd_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.pay_schd_no_META);
		p.setPluralValueEnable(p.Cnd_pay_schd_no, true);
		p.CndPanel.add(p.Cnd_pay_act_no_Label);
		p.CndPanel.add(p.Cnd_pay_act_no);
		p.Cnd_pay_act_no.setNextBeans(p.Cnd_note_no);
		p.Cnd_pay_act_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.pay_act_no_META);
		p.setPluralValueEnable(p.Cnd_pay_act_no, true);
		p.CndPanel.add(p.Cnd_note_no_Label);
		p.CndPanel.add(p.Cnd_note_no);
		p.Cnd_note_no.setNextBeans(p.Cnd_trd_rmrks);
		p.Cnd_note_no.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.note_no_META);
		p.setPluralValueEnable(p.Cnd_note_no, true);
		p.CndPanel.add(p.Cnd_trd_rmrks_Label);
		p.CndPanel.add(p.Cnd_trd_rmrks);
		p.Cnd_trd_rmrks.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_trd_rmrks.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.trd_rmrks_META);
		p.setPluralValueEnable(p.Cnd_trd_rmrks, true);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_trd_d_rmrks);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_trd_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_trd_d_rmrks);
		p.Cnd_trd_d_rmrks.setNextBeans(p.Cnd_intr_d_rmrks);
		p.Cnd_trd_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.trd_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_trd_d_rmrks, true);
		p.CndPanel.add(p.Cnd_intr_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_d_rmrks);
		p.Cnd_intr_d_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_intr_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.intr_d_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_d_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_dtl_sub_char1);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.CndPanel.add(p.Cnd_dtl_sub_char1_Label);
		p.CndPanel.add(p.Cnd_dtl_sub_char1);
		p.Cnd_dtl_sub_char1.setNextBeans(p.Cnd_dtl_sub_char2);
		p.Cnd_dtl_sub_char1.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.dtl_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_dtl_sub_char1, true);
		p.CndPanel.add(p.Cnd_dtl_sub_char2_Label);
		p.CndPanel.add(p.Cnd_dtl_sub_char2);
		p.Cnd_dtl_sub_char2.setNextBeans(p.Cnd_dtl_sub_char3);
		p.Cnd_dtl_sub_char2.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.dtl_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_dtl_sub_char2, true);
		p.CndPanel.add(p.Cnd_dtl_sub_char3_Label);
		p.CndPanel.add(p.Cnd_dtl_sub_char3);
		p.Cnd_dtl_sub_char3.setNextBeans(p.Cnd_inc_can_flg);
		p.Cnd_dtl_sub_char3.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.dtl_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_dtl_sub_char3, true);
		p.CndPanel.add(p.Cnd_inc_can_flg);
		p.Cnd_inc_can_flg.setNextBeans(p.Cnd_inc_schd_act_flg);
		p.Cnd_inc_can_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.inc_can_flg_META);
		p.CndPanel.add(p.Cnd_inc_schd_act_flg);
		p.Cnd_inc_schd_act_flg.setNextBeans(p.Cnd_inc_sw_flg);
		p.Cnd_inc_schd_act_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.inc_schd_act_flg_META);
		p.CndPanel.add(p.Cnd_inc_sw_flg);
		p.Cnd_inc_sw_flg.setRow(p.getCndR(), mcframe.clientMSBH.MSBHP0100.CndR.inc_sw_flg_META);
		p.PspplPanel.add(p.Cnd_psppl_grp_p_PPanel);
		p.PspplPanel.setLastBeans(p.Cnd_psppl_grp_p_PPanel);
		p.BspplPanel.add(p.Cnd_bsppl_grp_p_PPanel);
		p.BspplPanel.setLastBeans(p.Cnd_bsppl_grp_p_PPanel);
		p.AspplPanel.add(p.Cnd_asppl_grp_p_PPanel);
		p.AspplPanel.setLastBeans(p.Cnd_asppl_grp_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBHP_PayActListReg p) {
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
	protected static void jbInitRPnl(MSBHP_PayActListReg p) {
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
	 * [BulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBulkSet(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.RsltPanel);
		p.BulkSetPanel.setValueCheck(false);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_pay_act_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_pay_act_dt);
		p.BulkSetPanel.setLastBeans(p.BulkSet_pay_act_dt);
		p.BulkSet_pay_act_dt.setNextBeans(p.BulkSet_ac_dt_p_PPanel);
		p.BulkSet_pay_act_dt.setRow(p.getBulkSetR(), mcframe.clientMSBH.MSBHP0100.BulkSetR.pay_act_dt_META);
		p.BulkSet_pay_act_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_ac_dt_p_PPanel);
		p.BulkSet_ac_dt_p_PPanel.setNextBeans(p.BulkSet_pay_usr_dpt_p_PPanel);
		p.BulkSetPanel.add(p.BulkSet_pay_usr_dpt_p_PPanel);
		p.BulkSet_pay_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.BulkSet_pay_dpt_nm);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBHP_PayActListReg p) {
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
	protected static void jbInitBtn(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBHP0090.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBHP0090);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBHP0090);
		p.Btn_open_MSBHP0090.setNextBeans(p.Btn_prnt_sw);
		p.Btn_prnt_sw.setIcon("PRINT");
		p.Btn_prnt_sw.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_prnt_sw);
		p.Btn_prnt_sw.setNextBeans(p.Btn_indiv_prnt_flg);
		p.BtnPanel.add(p.Btn_indiv_prnt_flg);
		p.Btn_indiv_prnt_flg.setNextBeans(p.Btn_select_all);
		p.Btn_indiv_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBH.MSBHP0100.BtnR.indiv_prnt_flg_META);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_ins);
		p.Btn_ins.setIcon("REGISTER");
		p.Btn_ins.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins);
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBHP_PayActListReg p) {
		// ブロック関連の初期化
		p.add(p.EastBtnPanel);
		p.EastBtnPanel.setLayoutPosition("SE");
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
		MSBHP_PayActListReg_MC.mcInitScreenOpe((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.mcInitSrchMode((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.mcInitTop((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.mcInitFold((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.mcInitTab1((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.mcInitTab2((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.mcInitPsppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.mcInitTab3((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.mcInitBsppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.mcInitTab4((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.mcInitAsppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.mcInitCnd((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.mcInitCtrl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.mcInitRPnl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.mcInitBulkSet((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.mcInitRslt((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.mcInitBtn((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.mcInitEastBtn((MSBHP_PayActListReg)this);

		// [SRCH_INS]ステータスのモードの設定
		MSBHP_PayActListReg_MC.statusInitSRCH__INS_ScreenOpe((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__INS_SrchMode((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__INS_Top((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__INS_Fold((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__INS_Tab1((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__INS_Tab2((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__INS_Psppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__INS_Tab3((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__INS_Bsppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__INS_Tab4((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__INS_Asppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__INS_Cnd((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__INS_Ctrl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__INS_RPnl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__INS_BulkSet((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__INS_Rslt((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__INS_Btn((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__INS_EastBtn((MSBHP_PayActListReg)this);

		// [INS]ステータスのモードの設定
		MSBHP_PayActListReg_MC.statusInitINS_ScreenOpe((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitINS_SrchMode((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitINS_Top((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitINS_Fold((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitINS_Tab1((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitINS_Tab2((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitINS_Psppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitINS_Tab3((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitINS_Bsppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitINS_Tab4((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitINS_Asppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitINS_Cnd((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitINS_Ctrl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitINS_RPnl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitINS_BulkSet((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitINS_Rslt((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitINS_Btn((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitINS_EastBtn((MSBHP_PayActListReg)this);

		// [SRCH_DEL]ステータスのモードの設定
		MSBHP_PayActListReg_MC.statusInitSRCH__DEL_ScreenOpe((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__DEL_SrchMode((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__DEL_Top((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__DEL_Fold((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__DEL_Tab1((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__DEL_Tab2((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__DEL_Psppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__DEL_Tab3((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__DEL_Bsppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__DEL_Tab4((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__DEL_Asppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__DEL_Cnd((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__DEL_Ctrl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__DEL_RPnl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__DEL_BulkSet((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__DEL_Rslt((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__DEL_Btn((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitSRCH__DEL_EastBtn((MSBHP_PayActListReg)this);

		// [DEL]ステータスのモードの設定
		MSBHP_PayActListReg_MC.statusInitDEL_ScreenOpe((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitDEL_SrchMode((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitDEL_Top((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitDEL_Fold((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitDEL_Tab1((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitDEL_Tab2((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitDEL_Psppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitDEL_Tab3((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitDEL_Bsppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitDEL_Tab4((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitDEL_Asppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitDEL_Cnd((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitDEL_Ctrl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitDEL_RPnl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitDEL_BulkSet((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitDEL_Rslt((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitDEL_Btn((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitDEL_EastBtn((MSBHP_PayActListReg)this);

		// [REF_SCHD]ステータスのモードの設定
		MSBHP_PayActListReg_MC.statusInitREF__SCHD_ScreenOpe((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__SCHD_SrchMode((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__SCHD_Top((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__SCHD_Fold((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__SCHD_Tab1((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__SCHD_Tab2((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__SCHD_Psppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__SCHD_Tab3((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__SCHD_Bsppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__SCHD_Tab4((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__SCHD_Asppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__SCHD_Cnd((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__SCHD_Ctrl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__SCHD_RPnl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__SCHD_BulkSet((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__SCHD_Rslt((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__SCHD_Btn((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__SCHD_EastBtn((MSBHP_PayActListReg)this);

		// [REF_ACT]ステータスのモードの設定
		MSBHP_PayActListReg_MC.statusInitREF__ACT_ScreenOpe((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__ACT_SrchMode((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__ACT_Top((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__ACT_Fold((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__ACT_Tab1((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__ACT_Tab2((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__ACT_Psppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__ACT_Tab3((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__ACT_Bsppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__ACT_Tab4((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__ACT_Asppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__ACT_Cnd((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__ACT_Ctrl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__ACT_RPnl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__ACT_BulkSet((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__ACT_Rslt((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__ACT_Btn((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitREF__ACT_EastBtn((MSBHP_PayActListReg)this);

		// [PRNT]ステータスのモードの設定
		MSBHP_PayActListReg_MC.statusInitPRNT_ScreenOpe((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitPRNT_SrchMode((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitPRNT_Top((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitPRNT_Fold((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitPRNT_Tab1((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitPRNT_Tab2((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitPRNT_Psppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitPRNT_Tab3((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitPRNT_Bsppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitPRNT_Tab4((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitPRNT_Asppl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitPRNT_Cnd((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitPRNT_Ctrl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitPRNT_RPnl((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitPRNT_BulkSet((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitPRNT_Rslt((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitPRNT_Btn((MSBHP_PayActListReg)this);
		MSBHP_PayActListReg_MC.statusInitPRNT_EastBtn((MSBHP_PayActListReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBHP_PayActListReg p) {
	}

	/**
	 *  [SrchMode]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchMode(MSBHP_PayActListReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBHP_PayActListReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBHP_PayActListReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBHP_PayActListReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBHP_PayActListReg p) {
	}

	/**
	 *  [Psppl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPsppl(MSBHP_PayActListReg p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MSBHP_PayActListReg p) {
	}

	/**
	 *  [Bsppl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBsppl(MSBHP_PayActListReg p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MSBHP_PayActListReg p) {
	}

	/**
	 *  [Asppl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAsppl(MSBHP_PayActListReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBHP_PayActListReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_PRNT.addAllListener(p);
		p.Cnd_mode_Group.addAllListener(p);
		p.Cnd_mode_PAYSCHD.addAllListener(p);
		p.Cnd_mode_PAYACTD.addAllListener(p);
		p.Cnd_mode_SW.addAllListener(p);
		p.Cnd_pay_schd_dt_fr.setListListener(p);
		p.Cnd_pay_schd_dt_fr.addAllListener(p);
		p.Cnd_pay_schd_dt_to.setListListener(p);
		p.Cnd_pay_schd_dt_to.addAllListener(p);
		p.Cnd_pay_act_dt_fr.setListListener(p);
		p.Cnd_pay_act_dt_fr.addAllListener(p);
		p.Cnd_pay_act_dt_to.setListListener(p);
		p.Cnd_pay_act_dt_to.addAllListener(p);
		p.Cnd_ac_dt_fr.setListListener(p);
		p.Cnd_ac_dt_fr.addAllListener(p);
		p.Cnd_ac_dt_to.setListListener(p);
		p.Cnd_ac_dt_to.addAllListener(p);
		p.Cnd_bsppl_cl_dt_fr.setListListener(p);
		p.Cnd_bsppl_cl_dt_fr.addAllListener(p);
		p.Cnd_bsppl_cl_dt_to.setListListener(p);
		p.Cnd_bsppl_cl_dt_to.addAllListener(p);
		p.Cnd_psppl_cd.setListListener(p);
		p.Cnd_psppl_cd.addAllListener(p);
		p.Cnd_psppl_nm.setListListener(p);
		p.Cnd_psppl_nm.addAllListener(p);
		p.Cnd_bsppl_cd.setListListener(p);
		p.Cnd_bsppl_cd.addAllListener(p);
		p.Cnd_bsppl_nm.setListListener(p);
		p.Cnd_bsppl_nm.addAllListener(p);
		p.Cnd_pay_usr_cd.setListListener(p);
		p.Cnd_pay_usr_cd.addAllListener(p);
		p.Cnd_pay_usr_nm.setListListener(p);
		p.Cnd_pay_usr_nm.addAllListener(p);
		p.Cnd_pay_dpt_cd.setListListener(p);
		p.Cnd_pay_dpt_cd.addAllListener(p);
		p.Cnd_pay_dpt_nm.setListListener(p);
		p.Cnd_pay_dpt_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_bsppl_usr_cd.setListListener(p);
		p.Cnd_bsppl_usr_cd.addAllListener(p);
		p.Cnd_bsppl_usr_nm.setListListener(p);
		p.Cnd_bsppl_usr_nm.addAllListener(p);
		p.Cnd_bsppl_dpt_cd.setListListener(p);
		p.Cnd_bsppl_dpt_cd.addAllListener(p);
		p.Cnd_bsppl_dpt_nm.setListListener(p);
		p.Cnd_bsppl_dpt_nm.addAllListener(p);
		p.Cnd_trd_cur_cd.setListListener(p);
		p.Cnd_trd_cur_cd.addAllListener(p);
		p.Cnd_trd_cur_nm.setListListener(p);
		p.Cnd_trd_cur_nm.addAllListener(p);
		p.Cnd_ap_sttl_cd.setListListener(p);
		p.Cnd_ap_sttl_cd.addAllListener(p);
		p.Cnd_ap_sttl_nm.setListListener(p);
		p.Cnd_ap_sttl_nm.addAllListener(p);
		p.Cnd_purc_act_no.setListListener(p);
		p.Cnd_purc_act_no.addAllListener(p);
		p.Cnd_rcpt_iv_no.setListListener(p);
		p.Cnd_rcpt_iv_no.addAllListener(p);
		p.Cnd_rcpt_iv_mng_no.setListListener(p);
		p.Cnd_rcpt_iv_mng_no.addAllListener(p);
		p.Cnd_pay_chk_no.setListListener(p);
		p.Cnd_pay_chk_no.addAllListener(p);
		p.Cnd_pay_schd_no.setListListener(p);
		p.Cnd_pay_schd_no.addAllListener(p);
		p.Cnd_pay_act_no.setListListener(p);
		p.Cnd_pay_act_no.addAllListener(p);
		p.Cnd_note_no.setListListener(p);
		p.Cnd_note_no.addAllListener(p);
		p.Cnd_trd_rmrks.setListListener(p);
		p.Cnd_trd_rmrks.addAllListener(p);
		p.Cnd_intr_rmrks.setListListener(p);
		p.Cnd_intr_rmrks.addAllListener(p);
		p.Cnd_trd_d_rmrks.setListListener(p);
		p.Cnd_trd_d_rmrks.addAllListener(p);
		p.Cnd_intr_d_rmrks.setListListener(p);
		p.Cnd_intr_d_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_dtl_sub_char1.setListListener(p);
		p.Cnd_dtl_sub_char1.addAllListener(p);
		p.Cnd_dtl_sub_char2.setListListener(p);
		p.Cnd_dtl_sub_char2.addAllListener(p);
		p.Cnd_dtl_sub_char3.setListListener(p);
		p.Cnd_dtl_sub_char3.addAllListener(p);
		p.Cnd_inc_can_flg.addAllListener(p);
		p.Cnd_inc_schd_act_flg.addAllListener(p);
		p.Cnd_inc_sw_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBHP_PayActListReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBHP_PayActListReg p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MSBHP_PayActListReg p) {
		p.BulkSet_pay_act_dt.setListListener(p);
		p.BulkSet_pay_act_dt.addAllListener(p);
		p.BulkSet_pay_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBHP_PayActListReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_pay_act_dt.addAllListener(p);
		p.columnRslt_pay_act_dt.setListListener(p);
		p.columnRslt_pay_basis_dt.addAllListener(p);
		p.columnRslt_pay_basis_dt.setListListener(p);
		p.columnRslt_ac_ym.addAllListener(p);
		p.columnRslt_ac_ym.setListListener(p);
		p.columnRslt_slip_sts_typ_nm.addAllListener(p);
		p.columnRslt_slip_sts_typ_nm.setListListener(p);
		p.columnRslt_psppl_cd.addAllListener(p);
		p.columnRslt_psppl_cd.setListListener(p);
		p.columnRslt_psppl_nm.addAllListener(p);
		p.columnRslt_psppl_nm.setListListener(p);
		p.Rslt_pay_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_ap_sttl_cd.addAllListener(p);
		p.columnRslt_ap_sttl_cd.setListListener(p);
		p.columnRslt_ap_sttl_nm.addAllListener(p);
		p.columnRslt_ap_sttl_nm.setListListener(p);
		p.columnRslt_ap_sttl_typ.addAllListener(p);
		p.columnRslt_ap_sttl_typ.setListListener(p);
		p.columnRslt_ap_sttl_typ_nm.addAllListener(p);
		p.columnRslt_ap_sttl_typ_nm.setListListener(p);
		p.columnRslt_bsppl_cd.addAllListener(p);
		p.columnRslt_bsppl_cd.setListListener(p);
		p.columnRslt_bsppl_nm.addAllListener(p);
		p.columnRslt_bsppl_nm.setListListener(p);
		p.columnRslt_bsppl_usr_cd.addAllListener(p);
		p.columnRslt_bsppl_usr_cd.setListListener(p);
		p.columnRslt_bsppl_usr_nm.addAllListener(p);
		p.columnRslt_bsppl_usr_nm.setListListener(p);
		p.columnRslt_bsppl_dpt_cd.addAllListener(p);
		p.columnRslt_bsppl_dpt_cd.setListListener(p);
		p.columnRslt_bsppl_dpt_nm.addAllListener(p);
		p.columnRslt_bsppl_dpt_nm.setListListener(p);
		p.columnRslt_purc_act_no.addAllListener(p);
		p.columnRslt_purc_act_no.setListListener(p);
		p.columnRslt_rcpt_iv_no.addAllListener(p);
		p.columnRslt_rcpt_iv_no.setListListener(p);
		p.columnRslt_rcpt_iv_mng_no.addAllListener(p);
		p.columnRslt_rcpt_iv_mng_no.setListListener(p);
		p.columnRslt_bsppl_cl_ym.addAllListener(p);
		p.columnRslt_bsppl_cl_ym.setListListener(p);
		p.columnRslt_bsppl_cl_day.addAllListener(p);
		p.columnRslt_bsppl_cl_day.setListListener(p);
		p.columnRslt_bsppl_cl_dt.addAllListener(p);
		p.columnRslt_bsppl_cl_dt.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_trd_cur_amt_dec_place.addAllListener(p);
		p.columnRslt_trd_cur_amt_dec_place.setListListener(p);
		p.columnRslt_xrate_cd.addAllListener(p);
		p.columnRslt_xrate_cd.setListListener(p);
		p.columnRslt_base_cur_cd.addAllListener(p);
		p.columnRslt_base_cur_cd.setListListener(p);
		p.columnRslt_base_cur_nm.addAllListener(p);
		p.columnRslt_base_cur_nm.setListListener(p);
		p.columnRslt_base_cur_amt_dec_place.addAllListener(p);
		p.columnRslt_base_cur_amt_dec_place.setListListener(p);
		p.columnRslt_trd_cur_com_paid_tax_cd.addAllListener(p);
		p.columnRslt_trd_cur_com_paid_tax_cd.setListListener(p);
		p.columnRslt_trd_cur_com_paid_tax_nm.addAllListener(p);
		p.columnRslt_trd_cur_com_paid_tax_nm.setListListener(p);
		p.columnRslt_trd_cur_com_paid_tax_rate.addAllListener(p);
		p.columnRslt_trd_cur_com_paid_tax_rate.setListListener(p);
		p.columnRslt_trd_cur_com_paid_amt.addAllListener(p);
		p.columnRslt_trd_cur_com_paid_amt.setListListener(p);
		p.columnRslt_rcv_bill_no.addAllListener(p);
		p.columnRslt_rcv_bill_no.setListListener(p);
		p.columnRslt_adv_pay_act_no.addAllListener(p);
		p.columnRslt_adv_pay_act_no.setListListener(p);
		p.columnRslt_rcv_no.addAllListener(p);
		p.columnRslt_rcv_no.setListListener(p);
		p.columnRslt_asppl_cd.addAllListener(p);
		p.columnRslt_asppl_cd.setListListener(p);
		p.columnRslt_asppl_nm.addAllListener(p);
		p.columnRslt_asppl_nm.setListListener(p);
		p.columnRslt_ap_dpt_cd.addAllListener(p);
		p.columnRslt_ap_dpt_cd.setListListener(p);
		p.columnRslt_ap_dpt_nm.addAllListener(p);
		p.columnRslt_ap_dpt_nm.setListListener(p);
		p.columnRslt_ap_typ.addAllListener(p);
		p.columnRslt_ap_typ.setListListener(p);
		p.columnRslt_ap_typ_nm.addAllListener(p);
		p.columnRslt_ap_typ_nm.setListListener(p);
		p.columnRslt_ap_setoff_typ.addAllListener(p);
		p.columnRslt_ap_setoff_typ.setListListener(p);
		p.columnRslt_ap_setoff_typ_nm.addAllListener(p);
		p.columnRslt_ap_setoff_typ_nm.setListListener(p);
		p.columnRslt_setoff_cd.addAllListener(p);
		p.columnRslt_setoff_cd.setListListener(p);
		p.columnRslt_setoff_nm.addAllListener(p);
		p.columnRslt_setoff_nm.setListListener(p);
		p.columnRslt_so_dpt_cd.addAllListener(p);
		p.columnRslt_so_dpt_cd.setListListener(p);
		p.columnRslt_so_dpt_nm.addAllListener(p);
		p.columnRslt_so_dpt_nm.setListListener(p);
		p.columnRslt_bank_ac_cd.addAllListener(p);
		p.columnRslt_bank_ac_cd.setListListener(p);
		p.columnRslt_bank_ac_nm.addAllListener(p);
		p.columnRslt_bank_ac_nm.setListListener(p);
		p.columnRslt_pay_bank_ac_cd.addAllListener(p);
		p.columnRslt_pay_bank_ac_cd.setListListener(p);
		p.columnRslt_pay_bank_ac_nm.addAllListener(p);
		p.columnRslt_pay_bank_ac_nm.setListListener(p);
		p.columnRslt_note_no.addAllListener(p);
		p.columnRslt_note_no.setListListener(p);
		p.columnRslt_note_typ.addAllListener(p);
		p.columnRslt_note_typ.setListListener(p);
		p.columnRslt_note_typ_nm.addAllListener(p);
		p.columnRslt_note_typ_nm.setListListener(p);
		p.columnRslt_draw_dt.addAllListener(p);
		p.columnRslt_draw_dt.setListListener(p);
		p.columnRslt_note_days.addAllListener(p);
		p.columnRslt_note_days.setListListener(p);
		p.columnRslt_due_dt.addAllListener(p);
		p.columnRslt_due_dt.setListListener(p);
		p.columnRslt_drawer_nm.addAllListener(p);
		p.columnRslt_drawer_nm.setListListener(p);
		p.columnRslt_endrsr.addAllListener(p);
		p.columnRslt_endrsr.setListListener(p);
		p.columnRslt_accptr.addAllListener(p);
		p.columnRslt_accptr.setListListener(p);
		p.columnRslt_draw_bank_cd.addAllListener(p);
		p.columnRslt_draw_bank_cd.setListListener(p);
		p.columnRslt_draw_bank_nm.addAllListener(p);
		p.columnRslt_draw_bank_nm.setListListener(p);
		p.columnRslt_draw_branch_cd.addAllListener(p);
		p.columnRslt_draw_branch_cd.setListListener(p);
		p.columnRslt_draw_branch_nm.addAllListener(p);
		p.columnRslt_draw_branch_nm.setListListener(p);
		p.columnRslt_note_rsn_cd.addAllListener(p);
		p.columnRslt_note_rsn_cd.setListListener(p);
		p.columnRslt_note_rsn_nm.addAllListener(p);
		p.columnRslt_note_rsn_nm.setListListener(p);
		p.columnRslt_note_sub_char1.addAllListener(p);
		p.columnRslt_note_sub_char1.setListListener(p);
		p.columnRslt_note_sub_char2.addAllListener(p);
		p.columnRslt_note_sub_char2.setListListener(p);
		p.columnRslt_note_sub_char3.addAllListener(p);
		p.columnRslt_note_sub_char3.setListListener(p);
		p.columnRslt_pay_schd_dt.addAllListener(p);
		p.columnRslt_pay_schd_dt.setListListener(p);
		p.columnRslt_pay_chk_no.addAllListener(p);
		p.columnRslt_pay_chk_no.setListListener(p);
		p.columnRslt_pay_chk_mng_no.addAllListener(p);
		p.columnRslt_pay_chk_mng_no.setListListener(p);
		p.columnRslt_pay_schd_no.addAllListener(p);
		p.columnRslt_pay_schd_no.setListListener(p);
		p.columnRslt_ap_appl_schd_no.addAllListener(p);
		p.columnRslt_ap_appl_schd_no.setListListener(p);
		p.columnRslt_pay_act_no.addAllListener(p);
		p.columnRslt_pay_act_no.setListListener(p);
		p.columnRslt_pay_act_rev.addAllListener(p);
		p.columnRslt_pay_act_rev.setListListener(p);
		p.columnRslt_pay_act_seq.addAllListener(p);
		p.columnRslt_pay_act_seq.setListListener(p);
		p.columnRslt_disp_seq.addAllListener(p);
		p.columnRslt_disp_seq.setListListener(p);
		p.columnRslt_pay_act_d_no.addAllListener(p);
		p.columnRslt_pay_act_d_no.setListListener(p);
		p.columnRslt_pay_act_d_seq.addAllListener(p);
		p.columnRslt_pay_act_d_seq.setListListener(p);
		p.columnRslt_pay_sts_typ.addAllListener(p);
		p.columnRslt_pay_sts_typ.setListListener(p);
		p.columnRslt_pay_sts_typ_nm.addAllListener(p);
		p.columnRslt_pay_sts_typ_nm.setListListener(p);
		p.columnRslt_schd_act_flg.addAllListener(p);
		p.columnRslt_multi_act_d_flg.addAllListener(p);
		p.columnRslt_sw_flg.addAllListener(p);
		p.columnRslt_sw_to_ap_sttl_cd.addAllListener(p);
		p.columnRslt_sw_to_ap_sttl_cd.setListListener(p);
		p.columnRslt_sw_to_ap_sttl_nm.addAllListener(p);
		p.columnRslt_sw_to_ap_sttl_nm.setListListener(p);
		p.columnRslt_sw_to_ap_sttl_typ.addAllListener(p);
		p.columnRslt_sw_to_ap_sttl_typ.setListListener(p);
		p.columnRslt_sw_to_ap_sttl_typ_nm.addAllListener(p);
		p.columnRslt_sw_to_ap_sttl_typ_nm.setListListener(p);
		p.columnRslt_sw_to_asppl_cd.addAllListener(p);
		p.columnRslt_sw_to_asppl_cd.setListListener(p);
		p.columnRslt_sw_to_asppl_nm.addAllListener(p);
		p.columnRslt_sw_to_asppl_nm.setListListener(p);
		p.columnRslt_sw_to_ap_dpt_cd.addAllListener(p);
		p.columnRslt_sw_to_ap_dpt_cd.setListListener(p);
		p.columnRslt_sw_to_ap_dpt_nm.addAllListener(p);
		p.columnRslt_sw_to_ap_dpt_nm.setListListener(p);
		p.columnRslt_sw_to_bsppl_cd.addAllListener(p);
		p.columnRslt_sw_to_bsppl_cd.setListListener(p);
		p.columnRslt_sw_to_bsppl_nm.addAllListener(p);
		p.columnRslt_sw_to_bsppl_nm.setListListener(p);
		p.columnRslt_sw_to_bsppl_dpt_cd.addAllListener(p);
		p.columnRslt_sw_to_bsppl_dpt_cd.setListListener(p);
		p.columnRslt_sw_to_bsppl_dpt_nm.addAllListener(p);
		p.columnRslt_sw_to_bsppl_dpt_nm.setListListener(p);
		p.columnRslt_sw_to_wrk_no.addAllListener(p);
		p.columnRslt_sw_to_wrk_no.setListListener(p);
		p.columnRslt_sw_to_wrk_nm.addAllListener(p);
		p.columnRslt_sw_to_wrk_nm.setListListener(p);
		p.columnRslt_trd_rmrks.addAllListener(p);
		p.columnRslt_trd_rmrks.setListListener(p);
		p.columnRslt_intr_rmrks.addAllListener(p);
		p.columnRslt_intr_rmrks.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_pay_ntc_d_print_rmrks.addAllListener(p);
		p.columnRslt_pay_ntc_d_print_rmrks.setListListener(p);
		p.columnRslt_trd_d_rmrks.addAllListener(p);
		p.columnRslt_trd_d_rmrks.setListListener(p);
		p.columnRslt_intr_d_rmrks.addAllListener(p);
		p.columnRslt_intr_d_rmrks.setListListener(p);
		p.columnRslt_dtl_sub_char1.addAllListener(p);
		p.columnRslt_dtl_sub_char1.setListListener(p);
		p.columnRslt_dtl_sub_char2.addAllListener(p);
		p.columnRslt_dtl_sub_char2.setListListener(p);
		p.columnRslt_dtl_sub_char3.addAllListener(p);
		p.columnRslt_dtl_sub_char3.setListListener(p);
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
		p.columnRslt_pay_chk_upd_cntr.addAllListener(p);
		p.columnRslt_pay_chk_upd_cntr.setListListener(p);
		p.columnRslt_upd_cntr.addAllListener(p);
		p.columnRslt_upd_cntr.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBHP_PayActListReg p) {
		p.Btn_open_MSBHP0090.addAllListener(p);
		p.Btn_open_MSBHP0090.setAPMethodName("doBtn_open_MSBHP0090");
		p.Btn_prnt_sw.addAllListener(p);
		p.Btn_prnt_sw.setAPMethodName("doBtn_prnt_sw");
		p.Btn_indiv_prnt_flg.addAllListener(p);
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_ins.addAllListener(p);
		p.Btn_ins.setAPMethodName("doBtn_ins");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBHP_PayActListReg p) {
	}

	/**
	 * [SRCH_INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_ScreenOpe(MSBHP_PayActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_SrchMode(MSBHP_PayActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Top(MSBHP_PayActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Fold(MSBHP_PayActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Tab1(MSBHP_PayActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Tab2(MSBHP_PayActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Psppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Psppl(MSBHP_PayActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Tab3(MSBHP_PayActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Bsppl(MSBHP_PayActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Tab4(MSBHP_PayActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Asppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Asppl(MSBHP_PayActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Cnd(MSBHP_PayActListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_INS, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_pay_schd_dt_fr.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_pay_schd_dt_to.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_pay_act_dt_fr.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_pay_act_dt_to.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_bsppl_cl_dt_fr.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_to.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_psppl_cd.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_psppl_nm.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_pay_usr_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_pay_usr_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_pay_dpt_cd.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_pay_dpt_nm.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_bsppl_usr_cd.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_bsppl_usr_nm.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_ap_sttl_cd.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_ap_sttl_nm.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(SRCH_INS, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_pay_chk_no.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_pay_schd_no.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_pay_act_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_note_no.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char1.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char2.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char3.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_inc_schd_act_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_inc_sw_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Cnd_psppl_grp_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_asppl_grp_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_INS]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Ctrl(MSBHP_PayActListReg p){

	}

	/**
	 * [SRCH_INS]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_RPnl(MSBHP_PayActListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_INS, MCMode.ENABLE);

	}

	/**
	 * [SRCH_INS]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_BulkSet(MSBHP_PayActListReg p){
		p.BulkSet_pay_act_dt.putMode(p, SRCH_INS, MCMode.ENABLE);
		p.BulkSet_ac_dt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.ENABLE);
		p.BulkSet_pay_usr_dpt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);

	}

	/**
	 * [SRCH_INS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Rslt(MSBHP_PayActListReg p){
		p.columnRslt_check.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_pay_act_dt.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_pay_basis_dt.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.INVISIBLE);
		p.columnRslt_ac_ym.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_slip_sts_typ_nm.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_psppl_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_psppl_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Rslt_pay_usr_dpt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_bsppl_usr_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_bsppl_usr_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(SRCH_INS, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_bsppl_cl_ym.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_day.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_dt.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_xrate_cd.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.Rslt_xrate_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.REQUIRED);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.Rslt_pay_schd_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_tax_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_tax_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_tax_rate.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_amt.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.Rslt_trd_cur_com_paid_tax_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_com_paid_tax_amt_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_rcv_bill_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_adv_pay_act_no.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_rcv_no.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_asppl_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ap_typ.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ap_typ_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ap_setoff_typ.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ap_setoff_typ_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_setoff_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_setoff_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_so_dpt_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_so_dpt_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_note_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_note_typ.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_note_typ_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_draw_dt.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_note_days.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_drawer_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_endrsr.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_accptr.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_cd.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_note_sub_char1.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_note_sub_char2.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_note_sub_char3.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_pay_schd_dt.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_mng_no.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_pay_schd_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ap_appl_schd_no.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_pay_act_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_pay_act_rev.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_pay_act_seq.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_pay_act_d_no.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_pay_act_d_seq.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_pay_sts_typ.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_schd_act_flg.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_multi_act_d_flg.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sw_flg.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_ap_sttl_cd.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_ap_sttl_nm.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_ap_sttl_typ.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_ap_sttl_typ_nm.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_asppl_cd.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_asppl_nm.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_ap_dpt_cd.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_ap_dpt_nm.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_bsppl_cd.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_bsppl_nm.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_bsppl_dpt_cd.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_bsppl_dpt_nm.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_wrk_no.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_wrk_nm.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sub_char1.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sub_char2.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_sub_char3.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_pay_ntc_d_print_rmrks.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char1.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char2.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char3.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_psppl_grp_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_bsppl_grp_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_asppl_grp_p_PPanel.putStatus(SRCH_INS, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_upd_cntr.putMode(p, SRCH_INS, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, SRCH_INS, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_Btn(MSBHP_PayActListReg p){
		p.Btn_open_MSBHP0090.putMode(p, SRCH_INS, MCMode.DISABLE);
		p.Btn_prnt_sw.putMode(p, SRCH_INS, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_INS, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, SRCH_INS, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_INS, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH_INS, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_INS, MCMode.DISABLE);

	}

	/**
	 * [SRCH_INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INS_EastBtn(MSBHP_PayActListReg p){

	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBHP_PayActListReg p){

	}

	/**
	 * [INS]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitINS_SrchMode(MSBHP_PayActListReg p){

	}

	/**
	 * [INS]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINS_Top(MSBHP_PayActListReg p){

	}

	/**
	 * [INS]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitINS_Fold(MSBHP_PayActListReg p){

	}

	/**
	 * [INS]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab1(MSBHP_PayActListReg p){

	}

	/**
	 * [INS]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab2(MSBHP_PayActListReg p){

	}

	/**
	 * [INS]ステータスの[Psppl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Psppl(MSBHP_PayActListReg p){

	}

	/**
	 * [INS]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab3(MSBHP_PayActListReg p){

	}

	/**
	 * [INS]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Bsppl(MSBHP_PayActListReg p){

	}

	/**
	 * [INS]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab4(MSBHP_PayActListReg p){

	}

	/**
	 * [INS]ステータスの[Asppl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Asppl(MSBHP_PayActListReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBHP_PayActListReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_pay_schd_dt_fr.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_pay_schd_dt_to.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_pay_act_dt_fr.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_pay_act_dt_to.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_ac_dt_fr.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_ac_dt_to.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_bsppl_cl_dt_fr.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_to.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_psppl_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_psppl_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_pay_usr_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_pay_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_pay_dpt_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_pay_dpt_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_bsppl_usr_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_bsppl_usr_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_ap_sttl_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_ap_sttl_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_pay_chk_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_pay_schd_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_pay_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_note_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_trd_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char1.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char2.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char3.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_inc_schd_act_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_inc_sw_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_psppl_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_asppl_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [INS]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Ctrl(MSBHP_PayActListReg p){

	}

	/**
	 * [INS]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitINS_RPnl(MSBHP_PayActListReg p){
		p.RPnl_dwnld.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [INS]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitINS_BulkSet(MSBHP_PayActListReg p){
		p.BulkSet_pay_act_dt.putMode(p, INS, MCMode.ENABLE);
		p.BulkSet_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.ENABLE);
		p.BulkSet_pay_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);

	}

	/**
	 * [INS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINS_Rslt(MSBHP_PayActListReg p){
		p.columnRslt_check.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_pay_act_dt.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_pay_basis_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Rslt_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.REQUIRED);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.INVISIBLE);
		p.columnRslt_ac_ym.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_slip_sts_typ_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_psppl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_psppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_pay_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.ENABLE);
		p.Rslt_pay_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_bsppl_usr_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_bsppl_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_bsppl_cl_ym.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_day.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_xrate_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Rslt_xrate_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.REQUIRED);
		p.columnRslt_base_cur_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Rslt_pay_schd_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_tax_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_trd_cur_com_paid_tax_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_tax_rate.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_amt.putMode(p, INS, MCMode.INVISIBLE);
		p.Rslt_trd_cur_com_paid_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_com_paid_tax_amt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_rcv_bill_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_adv_pay_act_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_rcv_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_asppl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ap_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ap_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ap_setoff_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ap_setoff_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_setoff_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_setoff_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_so_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_so_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_note_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_note_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_note_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_draw_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_note_days.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_drawer_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_endrsr.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_accptr.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_note_sub_char1.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_note_sub_char2.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_note_sub_char3.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_pay_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_mng_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_pay_schd_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ap_appl_schd_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_pay_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_pay_act_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_pay_act_seq.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_pay_act_d_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_pay_act_d_seq.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_pay_sts_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_schd_act_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_multi_act_d_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sw_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_ap_sttl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_ap_sttl_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_ap_sttl_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_ap_sttl_typ_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_asppl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_asppl_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_ap_dpt_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_ap_dpt_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_bsppl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_bsppl_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_bsppl_dpt_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_bsppl_dpt_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_wrk_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sw_to_wrk_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_trd_rmrks.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_intr_rmrks.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sub_char1.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sub_char2.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_sub_char3.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_pay_ntc_d_print_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_trd_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_intr_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_dtl_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_dtl_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_dtl_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_psppl_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_bsppl_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_asppl_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBHP_PayActListReg p){
		p.Btn_open_MSBHP0090.putMode(p, INS, MCMode.ENABLE);
		p.Btn_prnt_sw.putMode(p, INS, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_ins.putMode(p, INS, MCMode.ENABLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBHP_PayActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MSBHP_PayActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_SrchMode(MSBHP_PayActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MSBHP_PayActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Fold(MSBHP_PayActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab1(MSBHP_PayActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab2(MSBHP_PayActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Psppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Psppl(MSBHP_PayActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab3(MSBHP_PayActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Bsppl(MSBHP_PayActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab4(MSBHP_PayActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Asppl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Asppl(MSBHP_PayActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MSBHP_PayActListReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_pay_schd_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_pay_schd_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_pay_act_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_pay_act_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_psppl_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_psppl_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_pay_usr_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_pay_usr_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_pay_dpt_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_pay_dpt_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_bsppl_usr_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_bsppl_usr_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ap_sttl_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ap_sttl_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_pay_chk_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_pay_schd_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_pay_act_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_note_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_inc_can_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_inc_schd_act_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_inc_sw_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_psppl_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_asppl_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MSBHP_PayActListReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_RPnl(MSBHP_PayActListReg p){
		p.RPnl_dwnld.putMode(p, SRCH_DEL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_BulkSet(MSBHP_PayActListReg p){
		p.BulkSet_pay_act_dt.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.BulkSet_ac_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.ENABLE);
		p.BulkSet_pay_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt(MSBHP_PayActListReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_act_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_basis_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_slip_sts_typ_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_psppl_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_psppl_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_pay_usr_dpt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_usr_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_bsppl_cl_ym.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_day.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_xrate_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_xrate_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_pay_schd_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_tax_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_tax_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_tax_rate.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_amt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_trd_cur_com_paid_tax_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_com_paid_tax_amt_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_rcv_bill_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_adv_pay_act_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_rcv_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_asppl_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ap_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ap_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ap_setoff_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ap_setoff_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_setoff_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_setoff_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_so_dpt_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_so_dpt_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_note_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_note_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_note_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_draw_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_note_days.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_drawer_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_endrsr.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_accptr.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_note_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_note_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_note_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_mng_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_pay_schd_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ap_appl_schd_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_pay_act_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_act_rev.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_act_seq.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_pay_act_d_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_pay_act_d_seq.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_pay_sts_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_schd_act_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_multi_act_d_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_sttl_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_sttl_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_sttl_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_sttl_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_asppl_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_asppl_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_dpt_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_dpt_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bsppl_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bsppl_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bsppl_dpt_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bsppl_dpt_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_wrk_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_wrk_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_ntc_d_print_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_psppl_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_bsppl_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_asppl_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MSBHP_PayActListReg p){
		p.Btn_open_MSBHP0090.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_prnt_sw.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MSBHP_PayActListReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBHP_PayActListReg p){

	}

	/**
	 * [DEL]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitDEL_SrchMode(MSBHP_PayActListReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MSBHP_PayActListReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MSBHP_PayActListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MSBHP_PayActListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MSBHP_PayActListReg p){

	}

	/**
	 * [DEL]ステータスの[Psppl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Psppl(MSBHP_PayActListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab3(MSBHP_PayActListReg p){

	}

	/**
	 * [DEL]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Bsppl(MSBHP_PayActListReg p){

	}

	/**
	 * [DEL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab4(MSBHP_PayActListReg p){

	}

	/**
	 * [DEL]ステータスの[Asppl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Asppl(MSBHP_PayActListReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBHP_PayActListReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_pay_schd_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_pay_schd_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_pay_act_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_pay_act_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_psppl_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_psppl_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_pay_usr_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_pay_usr_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_pay_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_pay_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bsppl_usr_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bsppl_usr_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ap_sttl_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ap_sttl_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_pay_chk_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_pay_schd_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_pay_act_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_note_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_inc_can_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_inc_schd_act_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_inc_sw_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_psppl_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_asppl_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MSBHP_PayActListReg p){

	}

	/**
	 * [DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RPnl(MSBHP_PayActListReg p){
		p.RPnl_dwnld.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MSBHP_PayActListReg p){
		p.BulkSet_pay_act_dt.putMode(p, DEL, MCMode.ENABLE);
		p.BulkSet_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.ENABLE);
		p.BulkSet_pay_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MSBHP_PayActListReg p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_pay_act_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_basis_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.REQUIRED);
		p.columnRslt_ac_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_slip_sts_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_psppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_psppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_pay_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_usr_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_bsppl_cl_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_day.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_xrate_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_xrate_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_pay_schd_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_tax_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_tax_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_tax_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_amt.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_trd_cur_com_paid_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_com_paid_tax_amt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_rcv_bill_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_adv_pay_act_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_rcv_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_asppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ap_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ap_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ap_setoff_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ap_setoff_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_setoff_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_setoff_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_so_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_so_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_note_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_note_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_note_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_draw_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_note_days.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_drawer_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_endrsr.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_accptr.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_note_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_note_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_note_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_mng_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_pay_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ap_appl_schd_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_pay_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_act_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_act_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_pay_act_d_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_pay_act_d_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_pay_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_schd_act_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_multi_act_d_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_sttl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_sttl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_sttl_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_sttl_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_asppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_asppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bsppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bsppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bsppl_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bsppl_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_wrk_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sw_to_wrk_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_ntc_d_print_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_psppl_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_bsppl_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_asppl_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBHP_PayActListReg p){
		p.Btn_open_MSBHP0090.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_prnt_sw.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_ins.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_ScreenOpe(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_SrchMode(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Top(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Fold(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Tab1(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Tab2(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[Psppl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Psppl(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Tab3(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Bsppl(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Tab4(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[Asppl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Asppl(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Cnd(MSBHP_PayActListReg p){
		p.Cnd_ope_Group.putMode(p, REF_SCHD, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, REF_SCHD, MCMode.REQUIRED);
		p.Cnd_pay_schd_dt_fr.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_pay_schd_dt_to.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_pay_act_dt_fr.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_pay_act_dt_to.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_fr.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_to.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_psppl_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_psppl_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_pay_usr_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_pay_usr_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_pay_dpt_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_pay_dpt_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_bsppl_usr_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_bsppl_usr_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_ap_sttl_cd.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_ap_sttl_nm.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(REF_SCHD, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_pay_chk_no.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_pay_schd_no.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_pay_act_no.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_note_no.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Cnd_inc_can_flg.putMode(p, REF_SCHD, MCMode.REQUIRED);
		p.Cnd_inc_schd_act_flg.putMode(p, REF_SCHD, MCMode.REQUIRED);
		p.Cnd_inc_sw_flg.putMode(p, REF_SCHD, MCMode.REQUIRED);
		p.Cnd_psppl_grp_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_asppl_grp_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF_SCHD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Ctrl(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_SCHD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_RPnl(MSBHP_PayActListReg p){
		p.RPnl_dwnld.putMode(p, REF_SCHD, MCMode.ENABLE);

	}

	/**
	 * [REF_SCHD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_BulkSet(MSBHP_PayActListReg p){
		p.BulkSet_pay_act_dt.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.BulkSet_ac_dt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.ENABLE);
		p.BulkSet_pay_usr_dpt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);

	}

	/**
	 * [REF_SCHD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Rslt(MSBHP_PayActListReg p){
		p.columnRslt_check.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_pay_act_dt.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_pay_basis_dt.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.INVISIBLE);
		p.columnRslt_ac_ym.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_slip_sts_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_psppl_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_psppl_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Rslt_pay_usr_dpt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_bsppl_usr_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_bsppl_usr_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(REF_SCHD, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_bsppl_cl_ym.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_day.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_dt.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_xrate_cd.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.Rslt_xrate_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.Rslt_pay_schd_amt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_tax_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_tax_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_tax_rate.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_amt.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.Rslt_trd_cur_com_paid_tax_amt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_com_paid_tax_amt_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_rcv_bill_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_adv_pay_act_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_rcv_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ap_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ap_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ap_setoff_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ap_setoff_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_setoff_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_setoff_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_so_dpt_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_so_dpt_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_note_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_note_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_note_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_draw_dt.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_note_days.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_drawer_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_endrsr.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_accptr.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_note_sub_char1.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_note_sub_char2.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_note_sub_char3.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_mng_no.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_pay_schd_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ap_appl_schd_no.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_pay_act_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_pay_act_rev.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_pay_act_seq.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_pay_act_d_no.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_pay_act_d_seq.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_pay_sts_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_schd_act_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_multi_act_d_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sw_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_sttl_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_sttl_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_sttl_typ.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_sttl_typ_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sw_to_asppl_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sw_to_asppl_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_dpt_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_dpt_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bsppl_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bsppl_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bsppl_dpt_cd.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bsppl_dpt_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sw_to_wrk_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sw_to_wrk_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_pay_ntc_d_print_rmrks.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char1.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char2.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char3.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_psppl_grp_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_bsppl_grp_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_asppl_grp_p_PPanel.putStatus(REF_SCHD, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_upd_cntr.putMode(p, REF_SCHD, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, REF_SCHD, MCMode.INVISIBLE);

	}

	/**
	 * [REF_SCHD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_Btn(MSBHP_PayActListReg p){
		p.Btn_open_MSBHP0090.putMode(p, REF_SCHD, MCMode.ENABLE);
		p.Btn_prnt_sw.putMode(p, REF_SCHD, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, REF_SCHD, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, REF_SCHD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_SCHD, MCMode.DISABLE);
		p.Btn_ins.putMode(p, REF_SCHD, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF_SCHD, MCMode.DISABLE);

	}

	/**
	 * [REF_SCHD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__SCHD_EastBtn(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_ACT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_ScreenOpe(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_ACT]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_SrchMode(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_ACT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Top(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_ACT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Fold(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_ACT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Tab1(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_ACT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Tab2(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_ACT]ステータスの[Psppl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Psppl(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_ACT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Tab3(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_ACT]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Bsppl(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_ACT]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Tab4(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_ACT]ステータスの[Asppl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Asppl(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_ACT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Cnd(MSBHP_PayActListReg p){
		p.Cnd_ope_Group.putMode(p, REF_ACT, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, REF_ACT, MCMode.REQUIRED);
		p.Cnd_pay_schd_dt_fr.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_pay_schd_dt_to.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_pay_act_dt_fr.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_pay_act_dt_to.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_fr.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_to.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_psppl_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_psppl_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_pay_usr_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_pay_usr_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_pay_dpt_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_pay_dpt_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_bsppl_usr_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_bsppl_usr_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_trd_cur_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_ap_sttl_cd.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_ap_sttl_nm.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_rcpt_iv_no.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_rcpt_iv_mng_no.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_wrk_no_p_PPanel.putStatus(REF_ACT, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_pay_chk_no.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_pay_schd_no.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_pay_act_no.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_note_no.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_dtl_sub_char2.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_dtl_sub_char3.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Cnd_inc_can_flg.putMode(p, REF_ACT, MCMode.REQUIRED);
		p.Cnd_inc_schd_act_flg.putMode(p, REF_ACT, MCMode.REQUIRED);
		p.Cnd_inc_sw_flg.putMode(p, REF_ACT, MCMode.REQUIRED);
		p.Cnd_psppl_grp_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_asppl_grp_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF_ACT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Ctrl(MSBHP_PayActListReg p){

	}

	/**
	 * [REF_ACT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_RPnl(MSBHP_PayActListReg p){
		p.RPnl_dwnld.putMode(p, REF_ACT, MCMode.ENABLE);

	}

	/**
	 * [REF_ACT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_BulkSet(MSBHP_PayActListReg p){
		p.BulkSet_pay_act_dt.putMode(p, REF_ACT, MCMode.ENABLE);
		p.BulkSet_ac_dt_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.ENABLE);
		p.BulkSet_pay_usr_dpt_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);

	}

	/**
	 * [REF_ACT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Rslt(MSBHP_PayActListReg p){
		p.columnRslt_check.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_pay_act_dt.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_pay_basis_dt.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.INVISIBLE);
		p.columnRslt_ac_ym.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_slip_sts_typ_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_psppl_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_psppl_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Rslt_pay_usr_dpt_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_usr_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_usr_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_purc_act_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Rslt_wrk_no_p_PPanel.putStatus(REF_ACT, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.READ_ONLY);
		p.columnRslt_bsppl_cl_ym.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_day.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cl_dt.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnRslt_xrate_cd.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.Rslt_xrate_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.Rslt_pay_schd_amt_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_tax_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_tax_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_tax_rate.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_amt.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.Rslt_trd_cur_com_paid_tax_amt_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_com_paid_tax_amt_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_rcv_bill_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_adv_pay_act_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_rcv_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_ap_typ.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_ap_typ_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_ap_setoff_typ.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_ap_setoff_typ_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_setoff_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_setoff_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_so_dpt_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_so_dpt_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_note_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_note_typ.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_note_typ_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_draw_dt.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_note_days.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_drawer_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_endrsr.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_accptr.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_draw_bank_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_draw_branch_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_note_rsn_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_note_sub_char1.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_note_sub_char2.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_note_sub_char3.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_pay_schd_dt.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_mng_no.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnRslt_pay_schd_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_ap_appl_schd_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_pay_act_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_pay_act_rev.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_pay_act_seq.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnRslt_pay_act_d_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_pay_act_d_seq.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnRslt_pay_sts_typ.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_pay_sts_typ_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_schd_act_flg.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_multi_act_d_flg.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnRslt_sw_flg.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_sttl_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_sttl_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_sttl_typ.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_sttl_typ_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_asppl_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_asppl_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_dpt_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_dpt_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bsppl_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bsppl_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bsppl_dpt_cd.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bsppl_dpt_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_wrk_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_wrk_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_pay_ntc_d_print_rmrks.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char1.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char2.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_dtl_sub_char3.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_psppl_grp_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_bsppl_grp_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_asppl_grp_p_PPanel.putStatus(REF_ACT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_upd_cntr.putMode(p, REF_ACT, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, REF_ACT, MCMode.INVISIBLE);

	}

	/**
	 * [REF_ACT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_Btn(MSBHP_PayActListReg p){
		p.Btn_open_MSBHP0090.putMode(p, REF_ACT, MCMode.ENABLE);
		p.Btn_prnt_sw.putMode(p, REF_ACT, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, REF_ACT, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, REF_ACT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_ACT, MCMode.DISABLE);
		p.Btn_ins.putMode(p, REF_ACT, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF_ACT, MCMode.DISABLE);

	}

	/**
	 * [REF_ACT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__ACT_EastBtn(MSBHP_PayActListReg p){

	}

	/**
	 * [PRNT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_ScreenOpe(MSBHP_PayActListReg p){

	}

	/**
	 * [PRNT]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_SrchMode(MSBHP_PayActListReg p){

	}

	/**
	 * [PRNT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Top(MSBHP_PayActListReg p){

	}

	/**
	 * [PRNT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Fold(MSBHP_PayActListReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab1(MSBHP_PayActListReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab2(MSBHP_PayActListReg p){

	}

	/**
	 * [PRNT]ステータスの[Psppl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Psppl(MSBHP_PayActListReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab3(MSBHP_PayActListReg p){

	}

	/**
	 * [PRNT]ステータスの[Bsppl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Bsppl(MSBHP_PayActListReg p){

	}

	/**
	 * [PRNT]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Tab4(MSBHP_PayActListReg p){

	}

	/**
	 * [PRNT]ステータスの[Asppl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Asppl(MSBHP_PayActListReg p){

	}

	/**
	 * [PRNT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Cnd(MSBHP_PayActListReg p){
		p.Cnd_ope_Group.putMode(p, PRNT, MCMode.REQUIRED);
		p.Cnd_mode_Group.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_pay_schd_dt_fr.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_pay_schd_dt_to.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_pay_act_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_pay_act_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ac_dt_fr.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_cl_dt_fr.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_bsppl_cl_dt_to.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_psppl_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_psppl_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_pay_usr_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_pay_usr_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_pay_dpt_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_pay_dpt_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_bsppl_usr_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_bsppl_usr_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_bsppl_dpt_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_bsppl_dpt_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_trd_cur_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_trd_cur_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ap_sttl_cd.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_ap_sttl_nm.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_purc_act_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_rcpt_iv_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_rcpt_iv_mng_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_wrk_no_p_PPanel.putStatus(PRNT, mcframe.clientMSUB.MSUBP0010.MSUBP_WrkNo_H.ENABLE_SRCH);
		p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_wrk_no_p_PPanel.WrkNo_wrk_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_pay_chk_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_pay_schd_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_pay_act_no.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_note_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_trd_rmrks.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_trd_d_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_intr_d_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, PRNT, MCMode.ENABLE);
		p.Cnd_dtl_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_dtl_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_inc_can_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_inc_schd_act_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_inc_sw_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Cnd_psppl_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bsppl_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_asppl_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.READ_ONLY);

	}

	/**
	 * [PRNT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Ctrl(MSBHP_PayActListReg p){

	}

	/**
	 * [PRNT]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_RPnl(MSBHP_PayActListReg p){
		p.RPnl_dwnld.putMode(p, PRNT, MCMode.ENABLE);

	}

	/**
	 * [PRNT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_BulkSet(MSBHP_PayActListReg p){
		p.BulkSet_pay_act_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.BulkSet_ac_dt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.BulkSet_pay_usr_dpt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);

	}

	/**
	 * [PRNT]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Rslt(MSBHP_PayActListReg p){
		p.columnRslt_check.putMode(p, PRNT, MCMode.REQUIRED);
		p.columnRslt_pay_act_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_basis_dt.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_ac_dt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5220.MAUBP_AcDt_D.READ_ONLY);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.INVISIBLE);
		p.columnRslt_ac_ym.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_slip_sts_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_psppl_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_psppl_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.Rslt_pay_usr_dpt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5230.MAUBP_UsrDpt_D.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_ap_sttl_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_bsppl_usr_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_bsppl_usr_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_bsppl_dpt_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_bsppl_dpt_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_purc_act_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_rcpt_iv_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_rcpt_iv_mng_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_wrk_no_p_PPanel.putStatus(PRNT, mcframe.clientMSUB.MSUBP5010.MSUBP_WrkNo_D.INVISIBLE);
		p.columnRslt_bsppl_cl_ym.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_bsppl_cl_day.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_bsppl_cl_dt.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_xrate_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_xrate_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5390.MAUBP_Xrate_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_pay_schd_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_trd_cur_com_paid_tax_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_com_paid_tax_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_com_paid_tax_rate.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_com_paid_amt.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_trd_cur_com_paid_tax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_com_paid_tax_amt_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.INVISIBLE);
		p.columnRslt_rcv_bill_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_adv_pay_act_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_rcv_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_asppl_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_asppl_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ap_dpt_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ap_dpt_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ap_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ap_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ap_setoff_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ap_setoff_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_setoff_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_setoff_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_so_dpt_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_so_dpt_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_bank_ac_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_bank_ac_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_pay_bank_ac_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_pay_bank_ac_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_note_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_note_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_note_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_draw_dt.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_note_days.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_due_dt.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_drawer_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_endrsr.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_accptr.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_draw_bank_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_draw_bank_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_draw_branch_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_draw_branch_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_note_rsn_cd.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_note_rsn_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_note_sub_char1.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_note_sub_char2.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_note_sub_char3.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_pay_schd_dt.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_pay_chk_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_pay_chk_mng_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_pay_schd_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_ap_appl_schd_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_pay_act_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_act_rev.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_act_seq.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_disp_seq.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_pay_act_d_no.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_pay_act_d_seq.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_pay_sts_typ.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_pay_sts_typ_nm.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_schd_act_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_multi_act_d_flg.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sw_flg.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_sw_to_ap_sttl_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_sttl_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_sttl_typ.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_sttl_typ_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_asppl_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_asppl_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_dpt_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_ap_dpt_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bsppl_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bsppl_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bsppl_dpt_cd.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_bsppl_dpt_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_wrk_no.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sw_to_wrk_nm.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_sub_char1.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, PRNT, MCMode.READ_ONLY);
		p.columnRslt_pay_ntc_d_print_rmrks.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_trd_d_rmrks.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_intr_d_rmrks.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char1.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char2.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_dtl_sub_char3.putMode(p, PRNT, MCMode.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_psppl_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_bsppl_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.Rslt_asppl_grp_p_PPanel.putStatus(PRNT, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.INVISIBLE);
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
		p.columnRslt_pay_chk_upd_cntr.putMode(p, PRNT, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, PRNT, MCMode.INVISIBLE);

	}

	/**
	 * [PRNT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_Btn(MSBHP_PayActListReg p){
		p.Btn_open_MSBHP0090.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_prnt_sw.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_indiv_prnt_flg.putMode(p, PRNT, MCMode.REQUIRED);
		p.Btn_select_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, PRNT, MCMode.ENABLE);
		p.Btn_ins.putMode(p, PRNT, MCMode.DISABLE);
		p.Btn_del.putMode(p, PRNT, MCMode.DISABLE);

	}

	/**
	 * [PRNT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitPRNT_EastBtn(MSBHP_PayActListReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_INS;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBHP_PayActListReg_MC.setTableConfigRslt((MSBHP_PayActListReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBHP_PayActListReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_pay_act_dt.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.pay_act_dt_META);
		p.columnRslt_pay_act_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_act_dt);
		p.columnRslt_pay_basis_dt.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.pay_basis_dt_META);
		p.columnRslt_pay_basis_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_basis_dt);
		p.RsltTable.addTable(p.Rslt_ac_dt_p_PPanel.AcDtTable);
		p.RsltTable.addTable(p.Rslt_can_ac_dt_p_PPanel.CanAcDtTable);
		p.columnRslt_ac_ym.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.ac_ym_META);
		p.columnRslt_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_ym);
		p.columnRslt_slip_sts_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.slip_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slip_sts_typ_nm);
		p.columnRslt_psppl_cd.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.psppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_psppl_cd);
		p.columnRslt_psppl_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.psppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_psppl_nm);
		p.RsltTable.addTable(p.Rslt_pay_usr_dpt_p_PPanel.UsrDptTable);
		p.Rslt_pay_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setLinkBeans(p.columnRslt_pay_dpt_nm, p.columnRslt_wg_cd, p.columnRslt_wg_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_ap_sttl_cd.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.ap_sttl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_sttl_cd);
		p.columnRslt_ap_sttl_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.ap_sttl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_sttl_nm);
		p.columnRslt_ap_sttl_typ.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.ap_sttl_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_sttl_typ);
		p.columnRslt_ap_sttl_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.ap_sttl_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_sttl_typ_nm);
		p.columnRslt_bsppl_cd.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.bsppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_cd);
		p.columnRslt_bsppl_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.bsppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_nm);
		p.columnRslt_bsppl_usr_cd.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.bsppl_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_usr_cd);
		p.columnRslt_bsppl_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.bsppl_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_usr_nm);
		p.columnRslt_bsppl_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.bsppl_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_dpt_cd);
		p.columnRslt_bsppl_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.bsppl_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_dpt_nm);
		p.columnRslt_purc_act_no.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.purc_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_act_no);
		p.columnRslt_rcpt_iv_no.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.rcpt_iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_no);
		p.columnRslt_rcpt_iv_mng_no.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.rcpt_iv_mng_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcpt_iv_mng_no);
		p.RsltTable.addTable(p.Rslt_wrk_no_p_PPanel.WrkNoTable);
		p.columnRslt_bsppl_cl_ym.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.bsppl_cl_ym_META);
		p.columnRslt_bsppl_cl_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_cl_ym);
		p.columnRslt_bsppl_cl_day.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.bsppl_cl_day_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_cl_day);
		p.columnRslt_bsppl_cl_dt.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.bsppl_cl_dt_META);
		p.columnRslt_bsppl_cl_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_cl_dt);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_trd_cur_amt_dec_place.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.trd_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_amt_dec_place);
		p.columnRslt_xrate_cd.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.xrate_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate_cd);
		p.RsltTable.addTable(p.Rslt_xrate_p_PPanel.XrateTable);
		p.columnRslt_base_cur_cd.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.base_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_cd);
		p.columnRslt_base_cur_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.base_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_nm);
		p.columnRslt_base_cur_amt_dec_place.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.base_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_amt_dec_place);
		p.RsltTable.addTable(p.Rslt_pay_schd_amt_p_PPanel.AmtTable);
		p.Rslt_pay_schd_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.RsltTable.addTable(p.Rslt_trd_cur_amt_p_PPanel.AmtTable);
		p.Rslt_trd_cur_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.columnRslt_trd_cur_com_paid_tax_cd.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.trd_cur_com_paid_tax_cd_META);
		p.columnRslt_trd_cur_com_paid_tax_cd.addLinkBeans(p.columnRslt_trd_cur_com_paid_tax_nm,p.columnRslt_trd_cur_com_paid_tax_rate);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_com_paid_tax_cd);
		p.columnRslt_trd_cur_com_paid_tax_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.trd_cur_com_paid_tax_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_com_paid_tax_nm);
		p.columnRslt_trd_cur_com_paid_tax_rate.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.trd_cur_com_paid_tax_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_com_paid_tax_rate);
		p.columnRslt_trd_cur_com_paid_amt.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.trd_cur_com_paid_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_com_paid_amt);
		p.RsltTable.addTable(p.Rslt_trd_cur_com_paid_tax_amt_p_PPanel.AmtTable);
		p.Rslt_trd_cur_com_paid_tax_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.RsltTable.addTable(p.Rslt_base_cur_amt_p_PPanel.AmtTable);
		p.Rslt_base_cur_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.RsltTable.addTable(p.Rslt_base_cur_com_paid_tax_amt_p_PPanel.AmtTable);
		p.Rslt_base_cur_com_paid_tax_amt_p_PPanel.columnAmt_amt.setMinusEnable(true);
		p.columnRslt_rcv_bill_no.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.rcv_bill_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_bill_no);
		p.columnRslt_adv_pay_act_no.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.adv_pay_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_adv_pay_act_no);
		p.columnRslt_rcv_no.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.rcv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_no);
		p.columnRslt_asppl_cd.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.asppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asppl_cd);
		p.columnRslt_asppl_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.asppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asppl_nm);
		p.columnRslt_ap_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.ap_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_dpt_cd);
		p.columnRslt_ap_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.ap_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_dpt_nm);
		p.columnRslt_ap_typ.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.ap_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_typ);
		p.columnRslt_ap_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.ap_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_typ_nm);
		p.columnRslt_ap_setoff_typ.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.ap_setoff_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_setoff_typ);
		p.columnRslt_ap_setoff_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.ap_setoff_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_setoff_typ_nm);
		p.columnRslt_setoff_cd.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.setoff_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_setoff_cd);
		p.columnRslt_setoff_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.setoff_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_setoff_nm);
		p.columnRslt_so_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.so_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_so_dpt_cd);
		p.columnRslt_so_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.so_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_so_dpt_nm);
		p.columnRslt_bank_ac_cd.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.bank_ac_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_cd);
		p.columnRslt_bank_ac_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.bank_ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_nm);
		p.columnRslt_pay_bank_ac_cd.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.pay_bank_ac_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_bank_ac_cd);
		p.columnRslt_pay_bank_ac_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.pay_bank_ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_bank_ac_nm);
		p.columnRslt_note_no.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.note_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_no);
		p.columnRslt_note_typ.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.note_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_typ);
		p.columnRslt_note_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.note_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_typ_nm);
		p.columnRslt_draw_dt.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.draw_dt_META);
		p.columnRslt_draw_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_dt);
		p.columnRslt_note_days.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.note_days_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_days);
		p.columnRslt_due_dt.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.due_dt_META);
		p.columnRslt_due_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_due_dt);
		p.columnRslt_drawer_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.drawer_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_drawer_nm);
		p.columnRslt_endrsr.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.endrsr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_endrsr);
		p.columnRslt_accptr.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.accptr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_accptr);
		p.columnRslt_draw_bank_cd.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.draw_bank_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_bank_cd);
		p.columnRslt_draw_bank_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.draw_bank_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_bank_nm);
		p.columnRslt_draw_branch_cd.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.draw_branch_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_branch_cd);
		p.columnRslt_draw_branch_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.draw_branch_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_draw_branch_nm);
		p.columnRslt_note_rsn_cd.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.note_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_rsn_cd);
		p.columnRslt_note_rsn_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.note_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_rsn_nm);
		p.columnRslt_note_sub_char1.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.note_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_sub_char1);
		p.columnRslt_note_sub_char2.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.note_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_sub_char2);
		p.columnRslt_note_sub_char3.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.note_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_sub_char3);
		p.columnRslt_pay_schd_dt.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.pay_schd_dt_META);
		p.columnRslt_pay_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_dt);
		p.columnRslt_pay_chk_no.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.pay_chk_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_chk_no);
		p.columnRslt_pay_chk_mng_no.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.pay_chk_mng_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_chk_mng_no);
		p.columnRslt_pay_schd_no.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.pay_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_schd_no);
		p.columnRslt_ap_appl_schd_no.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.ap_appl_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_appl_schd_no);
		p.columnRslt_pay_act_no.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.pay_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_act_no);
		p.columnRslt_pay_act_rev.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.pay_act_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_act_rev);
		p.columnRslt_pay_act_seq.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.pay_act_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_act_seq);
		p.columnRslt_disp_seq.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.disp_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_seq);
		p.columnRslt_pay_act_d_no.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.pay_act_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_act_d_no);
		p.columnRslt_pay_act_d_seq.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.pay_act_d_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_act_d_seq);
		p.columnRslt_pay_sts_typ.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.pay_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_sts_typ);
		p.columnRslt_pay_sts_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.pay_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_sts_typ_nm);
		p.columnRslt_schd_act_flg.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.schd_act_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_act_flg);
		p.columnRslt_multi_act_d_flg.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.multi_act_d_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_multi_act_d_flg);
		p.columnRslt_sw_flg.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.sw_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_flg);
		p.columnRslt_sw_to_ap_sttl_cd.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.sw_to_ap_sttl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_to_ap_sttl_cd);
		p.columnRslt_sw_to_ap_sttl_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.sw_to_ap_sttl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_to_ap_sttl_nm);
		p.columnRslt_sw_to_ap_sttl_typ.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.sw_to_ap_sttl_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_to_ap_sttl_typ);
		p.columnRslt_sw_to_ap_sttl_typ_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.sw_to_ap_sttl_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_to_ap_sttl_typ_nm);
		p.columnRslt_sw_to_asppl_cd.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.sw_to_asppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_to_asppl_cd);
		p.columnRslt_sw_to_asppl_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.sw_to_asppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_to_asppl_nm);
		p.columnRslt_sw_to_ap_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.sw_to_ap_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_to_ap_dpt_cd);
		p.columnRslt_sw_to_ap_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.sw_to_ap_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_to_ap_dpt_nm);
		p.columnRslt_sw_to_bsppl_cd.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.sw_to_bsppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_to_bsppl_cd);
		p.columnRslt_sw_to_bsppl_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.sw_to_bsppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_to_bsppl_nm);
		p.columnRslt_sw_to_bsppl_dpt_cd.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.sw_to_bsppl_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_to_bsppl_dpt_cd);
		p.columnRslt_sw_to_bsppl_dpt_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.sw_to_bsppl_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_to_bsppl_dpt_nm);
		p.columnRslt_sw_to_wrk_no.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.sw_to_wrk_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_to_wrk_no);
		p.columnRslt_sw_to_wrk_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.sw_to_wrk_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sw_to_wrk_nm);
		p.columnRslt_trd_rmrks.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.trd_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_rmrks);
		p.columnRslt_intr_rmrks.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_pay_ntc_d_print_rmrks.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.pay_ntc_d_print_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_ntc_d_print_rmrks);
		p.columnRslt_trd_d_rmrks.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.trd_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_d_rmrks);
		p.columnRslt_intr_d_rmrks.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.intr_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_d_rmrks);
		p.columnRslt_dtl_sub_char1.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.dtl_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dtl_sub_char1);
		p.columnRslt_dtl_sub_char2.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.dtl_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dtl_sub_char2);
		p.columnRslt_dtl_sub_char3.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.dtl_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dtl_sub_char3);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.RsltTable.addTable(p.Rslt_psppl_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_bsppl_grp_p_PPanel.BpGrpTable);
		p.RsltTable.addTable(p.Rslt_asppl_grp_p_PPanel.BpGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.columnRslt_pay_chk_upd_cntr.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.pay_chk_upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_chk_upd_cntr);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMSBH.MSBHP0100.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_psppl_cd.getListConfig().setPutter(getCnd_psppl_cd_ListPutter());
		Cnd_bsppl_cd.getListConfig().setPutter(getCnd_bsppl_cd_ListPutter());
		Cnd_pay_usr_cd.getListConfig().setPutter(getCnd_pay_usr_cd_ListPutter());
		Cnd_pay_dpt_cd.getListConfig().setPutter(getCnd_pay_dpt_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_bsppl_usr_cd.getListConfig().setPutter(getCnd_bsppl_usr_cd_ListPutter());
		Cnd_bsppl_dpt_cd.getListConfig().setPutter(getCnd_bsppl_dpt_cd_ListPutter());
		Cnd_trd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cur_cd.getListConfig().setPutter(getCnd_trd_cur_cd_ListPutter());
		Cnd_ap_sttl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ap_sttl_cd.getListConfig().setPutter(getCnd_ap_sttl_cd_ListPutter());
		BulkSet_pay_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		BulkSet_pay_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getBulkSet_pay_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		Rslt_pay_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_pay_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd.getListConfig().setPutter(getRslt_pay_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter());
		columnRslt_trd_cur_com_paid_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_trd_cur_com_paid_tax_cd.getListConfig().setPutter(getRslt_trd_cur_com_paid_tax_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH_INS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_INSStatus() {
		status = SRCH_INS;
		setAllStatus(status);
	}

	/**
	 * この画面を[INS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINSStatus() {
		status = INS;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DELStatus() {
		status = SRCH_DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDELStatus() {
		status = DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_SCHD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_SCHDStatus() {
		status = REF_SCHD;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_ACT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_ACTStatus() {
		status = REF_ACT;
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
		if (SRCH_INS.equals(status)) {
			setSRCH_INSStatus();
		}
		else if (INS.equals(status)) {
			setINSStatus();
		}
		else if (SRCH_DEL.equals(status)) {
			setSRCH_DELStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (REF_SCHD.equals(status)) {
			setREF_SCHDStatus();
		}
		else if (REF_ACT.equals(status)) {
			setREF_ACTStatus();
		}
		else if (PRNT.equals(status)) {
			setPRNTStatus();
		}
	}

	/**
	 * [Cnd_psppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_psppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
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
	 * [Cnd_pay_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pay_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_pay_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pay_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Cnd_bsppl_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bsppl_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
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
	 * [Cnd_trd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_trd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Cnd_ap_sttl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ap_sttl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ApSttl");
		return lp;
	}
	 
	/**
	 * [BulkSet_pay_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createBulkSet_pay_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Rslt_pay_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_pay_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Rslt_trd_cur_com_paid_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_trd_cur_com_paid_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Tax");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_psppl_cd) return getCnd_psppl_cd(row, info);
		if(combo == Cnd_bsppl_cd) return getCnd_bsppl_cd(row, info);
		if(combo == Cnd_pay_usr_cd) return getCnd_pay_usr_cd(row, info);
		if(combo == Cnd_pay_dpt_cd) return getCnd_pay_dpt_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_bsppl_usr_cd) return getCnd_bsppl_usr_cd(row, info);
		if(combo == Cnd_bsppl_dpt_cd) return getCnd_bsppl_dpt_cd(row, info);
		if(combo == Cnd_trd_cur_cd) return getCnd_trd_cur_cd(row, info);
		if(combo == Cnd_ap_sttl_cd) return getCnd_ap_sttl_cd(row, info);
		if(combo == BulkSet_pay_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getBulkSet_pay_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == Rslt_pay_usr_dpt_p_PPanel.columnUsrDpt_dpt_cd) return getRslt_pay_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(row, info);
		if(combo == columnRslt_trd_cur_com_paid_tax_cd) return getRslt_trd_cur_com_paid_tax_cd(row, info);
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
		else if (ap == Btn_open_MSBHP0090) doBtn_open_MSBHP0090(info);
		else if (ap == Btn_prnt_sw) doBtn_prnt_sw(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_ins) doBtn_ins(info);
		else if (ap == Btn_del) doBtn_del(info);
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
	 * [Btn]パネルの[open_MSBHP0090]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBHP0090(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_sw]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_sw(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[ins]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins(MCEventInfo info);

	/**
	 * [Btn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del(MCEventInfo info);

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
		if (vc == Cnd_mode_Group) return doCnd_mode_VC(info);
		if (vc == Cnd_pay_schd_dt_fr) return doCnd_pay_schd_dt_fr_VC(info);
		if (vc == Cnd_pay_schd_dt_to) return doCnd_pay_schd_dt_to_VC(info);
		if (vc == Cnd_pay_act_dt_fr) return doCnd_pay_act_dt_fr_VC(info);
		if (vc == Cnd_pay_act_dt_to) return doCnd_pay_act_dt_to_VC(info);
		if (vc == Cnd_ac_dt_fr) return doCnd_ac_dt_fr_VC(info);
		if (vc == Cnd_ac_dt_to) return doCnd_ac_dt_to_VC(info);
		if (vc == Cnd_bsppl_cl_dt_fr) return doCnd_bsppl_cl_dt_fr_VC(info);
		if (vc == Cnd_bsppl_cl_dt_to) return doCnd_bsppl_cl_dt_to_VC(info);
		if (vc == Cnd_psppl_cd) return doCnd_psppl_cd_VC(info);
		if (vc == Cnd_psppl_nm) return doCnd_psppl_nm_VC(info);
		if (vc == Cnd_bsppl_cd) return doCnd_bsppl_cd_VC(info);
		if (vc == Cnd_bsppl_nm) return doCnd_bsppl_nm_VC(info);
		if (vc == Cnd_pay_usr_cd) return doCnd_pay_usr_cd_VC(info);
		if (vc == Cnd_pay_usr_nm) return doCnd_pay_usr_nm_VC(info);
		if (vc == Cnd_pay_dpt_cd) return doCnd_pay_dpt_cd_VC(info);
		if (vc == Cnd_pay_dpt_nm) return doCnd_pay_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_bsppl_usr_cd) return doCnd_bsppl_usr_cd_VC(info);
		if (vc == Cnd_bsppl_usr_nm) return doCnd_bsppl_usr_nm_VC(info);
		if (vc == Cnd_bsppl_dpt_cd) return doCnd_bsppl_dpt_cd_VC(info);
		if (vc == Cnd_bsppl_dpt_nm) return doCnd_bsppl_dpt_nm_VC(info);
		if (vc == Cnd_trd_cur_cd) return doCnd_trd_cur_cd_VC(info);
		if (vc == Cnd_trd_cur_nm) return doCnd_trd_cur_nm_VC(info);
		if (vc == Cnd_ap_sttl_cd) return doCnd_ap_sttl_cd_VC(info);
		if (vc == Cnd_ap_sttl_nm) return doCnd_ap_sttl_nm_VC(info);
		if (vc == Cnd_purc_act_no) return doCnd_purc_act_no_VC(info);
		if (vc == Cnd_rcpt_iv_no) return doCnd_rcpt_iv_no_VC(info);
		if (vc == Cnd_rcpt_iv_mng_no) return doCnd_rcpt_iv_mng_no_VC(info);
		if (vc == Cnd_pay_chk_no) return doCnd_pay_chk_no_VC(info);
		if (vc == Cnd_pay_schd_no) return doCnd_pay_schd_no_VC(info);
		if (vc == Cnd_pay_act_no) return doCnd_pay_act_no_VC(info);
		if (vc == Cnd_note_no) return doCnd_note_no_VC(info);
		if (vc == Cnd_trd_rmrks) return doCnd_trd_rmrks_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_trd_d_rmrks) return doCnd_trd_d_rmrks_VC(info);
		if (vc == Cnd_intr_d_rmrks) return doCnd_intr_d_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_dtl_sub_char1) return doCnd_dtl_sub_char1_VC(info);
		if (vc == Cnd_dtl_sub_char2) return doCnd_dtl_sub_char2_VC(info);
		if (vc == Cnd_dtl_sub_char3) return doCnd_dtl_sub_char3_VC(info);
		if (vc == Cnd_inc_can_flg) return doCnd_inc_can_flg_VC(info);
		if (vc == Cnd_inc_schd_act_flg) return doCnd_inc_schd_act_flg_VC(info);
		if (vc == Cnd_inc_sw_flg) return doCnd_inc_sw_flg_VC(info);
		if (vc == BulkSet_pay_act_dt) return doBulkSet_pay_act_dt_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_pay_act_dt) return doRslt_pay_act_dt_VC(info);
		if (vc == columnRslt_pay_basis_dt) return doRslt_pay_basis_dt_VC(info);
		if (vc == columnRslt_ac_ym) return doRslt_ac_ym_VC(info);
		if (vc == columnRslt_slip_sts_typ_nm) return doRslt_slip_sts_typ_nm_VC(info);
		if (vc == columnRslt_psppl_cd) return doRslt_psppl_cd_VC(info);
		if (vc == columnRslt_psppl_nm) return doRslt_psppl_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_ap_sttl_cd) return doRslt_ap_sttl_cd_VC(info);
		if (vc == columnRslt_ap_sttl_nm) return doRslt_ap_sttl_nm_VC(info);
		if (vc == columnRslt_ap_sttl_typ) return doRslt_ap_sttl_typ_VC(info);
		if (vc == columnRslt_ap_sttl_typ_nm) return doRslt_ap_sttl_typ_nm_VC(info);
		if (vc == columnRslt_bsppl_cd) return doRslt_bsppl_cd_VC(info);
		if (vc == columnRslt_bsppl_nm) return doRslt_bsppl_nm_VC(info);
		if (vc == columnRslt_bsppl_usr_cd) return doRslt_bsppl_usr_cd_VC(info);
		if (vc == columnRslt_bsppl_usr_nm) return doRslt_bsppl_usr_nm_VC(info);
		if (vc == columnRslt_bsppl_dpt_cd) return doRslt_bsppl_dpt_cd_VC(info);
		if (vc == columnRslt_bsppl_dpt_nm) return doRslt_bsppl_dpt_nm_VC(info);
		if (vc == columnRslt_purc_act_no) return doRslt_purc_act_no_VC(info);
		if (vc == columnRslt_rcpt_iv_no) return doRslt_rcpt_iv_no_VC(info);
		if (vc == columnRslt_rcpt_iv_mng_no) return doRslt_rcpt_iv_mng_no_VC(info);
		if (vc == columnRslt_bsppl_cl_ym) return doRslt_bsppl_cl_ym_VC(info);
		if (vc == columnRslt_bsppl_cl_day) return doRslt_bsppl_cl_day_VC(info);
		if (vc == columnRslt_bsppl_cl_dt) return doRslt_bsppl_cl_dt_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_trd_cur_amt_dec_place) return doRslt_trd_cur_amt_dec_place_VC(info);
		if (vc == columnRslt_xrate_cd) return doRslt_xrate_cd_VC(info);
		if (vc == columnRslt_base_cur_cd) return doRslt_base_cur_cd_VC(info);
		if (vc == columnRslt_base_cur_nm) return doRslt_base_cur_nm_VC(info);
		if (vc == columnRslt_base_cur_amt_dec_place) return doRslt_base_cur_amt_dec_place_VC(info);
		if (vc == columnRslt_trd_cur_com_paid_tax_cd) return doRslt_trd_cur_com_paid_tax_cd_VC(info);
		if (vc == columnRslt_trd_cur_com_paid_tax_nm) return doRslt_trd_cur_com_paid_tax_nm_VC(info);
		if (vc == columnRslt_trd_cur_com_paid_tax_rate) return doRslt_trd_cur_com_paid_tax_rate_VC(info);
		if (vc == columnRslt_trd_cur_com_paid_amt) return doRslt_trd_cur_com_paid_amt_VC(info);
		if (vc == columnRslt_rcv_bill_no) return doRslt_rcv_bill_no_VC(info);
		if (vc == columnRslt_adv_pay_act_no) return doRslt_adv_pay_act_no_VC(info);
		if (vc == columnRslt_rcv_no) return doRslt_rcv_no_VC(info);
		if (vc == columnRslt_asppl_cd) return doRslt_asppl_cd_VC(info);
		if (vc == columnRslt_asppl_nm) return doRslt_asppl_nm_VC(info);
		if (vc == columnRslt_ap_dpt_cd) return doRslt_ap_dpt_cd_VC(info);
		if (vc == columnRslt_ap_dpt_nm) return doRslt_ap_dpt_nm_VC(info);
		if (vc == columnRslt_ap_typ) return doRslt_ap_typ_VC(info);
		if (vc == columnRslt_ap_typ_nm) return doRslt_ap_typ_nm_VC(info);
		if (vc == columnRslt_ap_setoff_typ) return doRslt_ap_setoff_typ_VC(info);
		if (vc == columnRslt_ap_setoff_typ_nm) return doRslt_ap_setoff_typ_nm_VC(info);
		if (vc == columnRslt_setoff_cd) return doRslt_setoff_cd_VC(info);
		if (vc == columnRslt_setoff_nm) return doRslt_setoff_nm_VC(info);
		if (vc == columnRslt_so_dpt_cd) return doRslt_so_dpt_cd_VC(info);
		if (vc == columnRslt_so_dpt_nm) return doRslt_so_dpt_nm_VC(info);
		if (vc == columnRslt_bank_ac_cd) return doRslt_bank_ac_cd_VC(info);
		if (vc == columnRslt_bank_ac_nm) return doRslt_bank_ac_nm_VC(info);
		if (vc == columnRslt_pay_bank_ac_cd) return doRslt_pay_bank_ac_cd_VC(info);
		if (vc == columnRslt_pay_bank_ac_nm) return doRslt_pay_bank_ac_nm_VC(info);
		if (vc == columnRslt_note_no) return doRslt_note_no_VC(info);
		if (vc == columnRslt_note_typ) return doRslt_note_typ_VC(info);
		if (vc == columnRslt_note_typ_nm) return doRslt_note_typ_nm_VC(info);
		if (vc == columnRslt_draw_dt) return doRslt_draw_dt_VC(info);
		if (vc == columnRslt_note_days) return doRslt_note_days_VC(info);
		if (vc == columnRslt_due_dt) return doRslt_due_dt_VC(info);
		if (vc == columnRslt_drawer_nm) return doRslt_drawer_nm_VC(info);
		if (vc == columnRslt_endrsr) return doRslt_endrsr_VC(info);
		if (vc == columnRslt_accptr) return doRslt_accptr_VC(info);
		if (vc == columnRslt_draw_bank_cd) return doRslt_draw_bank_cd_VC(info);
		if (vc == columnRslt_draw_bank_nm) return doRslt_draw_bank_nm_VC(info);
		if (vc == columnRslt_draw_branch_cd) return doRslt_draw_branch_cd_VC(info);
		if (vc == columnRslt_draw_branch_nm) return doRslt_draw_branch_nm_VC(info);
		if (vc == columnRslt_note_rsn_cd) return doRslt_note_rsn_cd_VC(info);
		if (vc == columnRslt_note_rsn_nm) return doRslt_note_rsn_nm_VC(info);
		if (vc == columnRslt_note_sub_char1) return doRslt_note_sub_char1_VC(info);
		if (vc == columnRslt_note_sub_char2) return doRslt_note_sub_char2_VC(info);
		if (vc == columnRslt_note_sub_char3) return doRslt_note_sub_char3_VC(info);
		if (vc == columnRslt_pay_schd_dt) return doRslt_pay_schd_dt_VC(info);
		if (vc == columnRslt_pay_chk_no) return doRslt_pay_chk_no_VC(info);
		if (vc == columnRslt_pay_chk_mng_no) return doRslt_pay_chk_mng_no_VC(info);
		if (vc == columnRslt_pay_schd_no) return doRslt_pay_schd_no_VC(info);
		if (vc == columnRslt_ap_appl_schd_no) return doRslt_ap_appl_schd_no_VC(info);
		if (vc == columnRslt_pay_act_no) return doRslt_pay_act_no_VC(info);
		if (vc == columnRslt_pay_act_rev) return doRslt_pay_act_rev_VC(info);
		if (vc == columnRslt_pay_act_seq) return doRslt_pay_act_seq_VC(info);
		if (vc == columnRslt_disp_seq) return doRslt_disp_seq_VC(info);
		if (vc == columnRslt_pay_act_d_no) return doRslt_pay_act_d_no_VC(info);
		if (vc == columnRslt_pay_act_d_seq) return doRslt_pay_act_d_seq_VC(info);
		if (vc == columnRslt_pay_sts_typ) return doRslt_pay_sts_typ_VC(info);
		if (vc == columnRslt_pay_sts_typ_nm) return doRslt_pay_sts_typ_nm_VC(info);
		if (vc == columnRslt_schd_act_flg) return doRslt_schd_act_flg_VC(info);
		if (vc == columnRslt_multi_act_d_flg) return doRslt_multi_act_d_flg_VC(info);
		if (vc == columnRslt_sw_flg) return doRslt_sw_flg_VC(info);
		if (vc == columnRslt_sw_to_ap_sttl_cd) return doRslt_sw_to_ap_sttl_cd_VC(info);
		if (vc == columnRslt_sw_to_ap_sttl_nm) return doRslt_sw_to_ap_sttl_nm_VC(info);
		if (vc == columnRslt_sw_to_ap_sttl_typ) return doRslt_sw_to_ap_sttl_typ_VC(info);
		if (vc == columnRslt_sw_to_ap_sttl_typ_nm) return doRslt_sw_to_ap_sttl_typ_nm_VC(info);
		if (vc == columnRslt_sw_to_asppl_cd) return doRslt_sw_to_asppl_cd_VC(info);
		if (vc == columnRslt_sw_to_asppl_nm) return doRslt_sw_to_asppl_nm_VC(info);
		if (vc == columnRslt_sw_to_ap_dpt_cd) return doRslt_sw_to_ap_dpt_cd_VC(info);
		if (vc == columnRslt_sw_to_ap_dpt_nm) return doRslt_sw_to_ap_dpt_nm_VC(info);
		if (vc == columnRslt_sw_to_bsppl_cd) return doRslt_sw_to_bsppl_cd_VC(info);
		if (vc == columnRslt_sw_to_bsppl_nm) return doRslt_sw_to_bsppl_nm_VC(info);
		if (vc == columnRslt_sw_to_bsppl_dpt_cd) return doRslt_sw_to_bsppl_dpt_cd_VC(info);
		if (vc == columnRslt_sw_to_bsppl_dpt_nm) return doRslt_sw_to_bsppl_dpt_nm_VC(info);
		if (vc == columnRslt_sw_to_wrk_no) return doRslt_sw_to_wrk_no_VC(info);
		if (vc == columnRslt_sw_to_wrk_nm) return doRslt_sw_to_wrk_nm_VC(info);
		if (vc == columnRslt_trd_rmrks) return doRslt_trd_rmrks_VC(info);
		if (vc == columnRslt_intr_rmrks) return doRslt_intr_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_pay_ntc_d_print_rmrks) return doRslt_pay_ntc_d_print_rmrks_VC(info);
		if (vc == columnRslt_trd_d_rmrks) return doRslt_trd_d_rmrks_VC(info);
		if (vc == columnRslt_intr_d_rmrks) return doRslt_intr_d_rmrks_VC(info);
		if (vc == columnRslt_dtl_sub_char1) return doRslt_dtl_sub_char1_VC(info);
		if (vc == columnRslt_dtl_sub_char2) return doRslt_dtl_sub_char2_VC(info);
		if (vc == columnRslt_dtl_sub_char3) return doRslt_dtl_sub_char3_VC(info);
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
		if (vc == columnRslt_pay_chk_upd_cntr) return doRslt_pay_chk_upd_cntr_VC(info);
		if (vc == columnRslt_upd_cntr) return doRslt_upd_cntr_VC(info);
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
	 * [Cnd]パネルの[mode]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mode_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_schd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_act_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_act_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_act_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_act_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[bsppl_cl_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_cl_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_cl_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_cl_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[psppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_psppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[psppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_psppl_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_dpt_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[bsppl_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_usr_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ap_sttl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_sttl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_sttl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_sttl_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_chk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_chk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[note_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_note_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_intr_d_rmrks_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[dtl_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dtl_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dtl_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dtl_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inc_can_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inc_schd_act_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inc_schd_act_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inc_sw_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inc_sw_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[pay_act_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_pay_act_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_act_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_act_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_basis_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_basis_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[slip_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slip_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[psppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_psppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[psppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_psppl_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ap_sttl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_sttl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_sttl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_sttl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_sttl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_sttl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bsppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bsppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bsppl_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bsppl_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_dpt_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[bsppl_cl_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_cl_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bsppl_cl_day]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_cl_day_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bsppl_cl_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_cl_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_cd_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_com_paid_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_com_paid_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_com_paid_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_tax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_com_paid_tax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_com_paid_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_bill_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_bill_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[adv_pay_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_adv_pay_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ap_setoff_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_setoff_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_setoff_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_setoff_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[setoff_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_setoff_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[setoff_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_setoff_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[so_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_so_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[so_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_so_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bank_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bank_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bank_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bank_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_bank_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_bank_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_bank_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_bank_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[draw_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_draw_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[due_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_due_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_drawer_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[endrsr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_endrsr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[accptr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_accptr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[draw_bank_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_draw_bank_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[draw_bank_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_draw_bank_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[draw_branch_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_draw_branch_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[draw_branch_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_draw_branch_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_chk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_chk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_chk_mng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_chk_mng_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_appl_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_appl_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_act_d_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_act_d_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[schd_act_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_act_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[multi_act_d_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_multi_act_d_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_sttl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_to_ap_sttl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_sttl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_to_ap_sttl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_sttl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_to_ap_sttl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_sttl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_to_ap_sttl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_to_asppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_to_asppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_to_asppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_to_asppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_to_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_to_ap_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_to_bsppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_to_bsppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_to_bsppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_to_bsppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_to_bsppl_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_to_bsppl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_to_bsppl_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_to_bsppl_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_to_wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_to_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sw_to_wrk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sw_to_wrk_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_intr_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_ntc_d_print_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_ntc_d_print_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_intr_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dtl_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dtl_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dtl_sub_char3_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_chk_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_chk_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_cntr_VC(MCEventInfo info){
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
		else if (nc == Cnd_mode_Group) doCnd_mode_NC(info);
		else if (nc == Cnd_pay_schd_dt_fr) doCnd_pay_schd_dt_fr_NC(info);
		else if (nc == Cnd_pay_schd_dt_to) doCnd_pay_schd_dt_to_NC(info);
		else if (nc == Cnd_pay_act_dt_fr) doCnd_pay_act_dt_fr_NC(info);
		else if (nc == Cnd_pay_act_dt_to) doCnd_pay_act_dt_to_NC(info);
		else if (nc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NC(info);
		else if (nc == Cnd_ac_dt_to) doCnd_ac_dt_to_NC(info);
		else if (nc == Cnd_bsppl_cl_dt_fr) doCnd_bsppl_cl_dt_fr_NC(info);
		else if (nc == Cnd_bsppl_cl_dt_to) doCnd_bsppl_cl_dt_to_NC(info);
		else if (nc == Cnd_psppl_cd) doCnd_psppl_cd_NC(info);
		else if (nc == Cnd_psppl_nm) doCnd_psppl_nm_NC(info);
		else if (nc == Cnd_bsppl_cd) doCnd_bsppl_cd_NC(info);
		else if (nc == Cnd_bsppl_nm) doCnd_bsppl_nm_NC(info);
		else if (nc == Cnd_pay_usr_cd) doCnd_pay_usr_cd_NC(info);
		else if (nc == Cnd_pay_usr_nm) doCnd_pay_usr_nm_NC(info);
		else if (nc == Cnd_pay_dpt_cd) doCnd_pay_dpt_cd_NC(info);
		else if (nc == Cnd_pay_dpt_nm) doCnd_pay_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_bsppl_usr_cd) doCnd_bsppl_usr_cd_NC(info);
		else if (nc == Cnd_bsppl_usr_nm) doCnd_bsppl_usr_nm_NC(info);
		else if (nc == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NC(info);
		else if (nc == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NC(info);
		else if (nc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NC(info);
		else if (nc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NC(info);
		else if (nc == Cnd_ap_sttl_cd) doCnd_ap_sttl_cd_NC(info);
		else if (nc == Cnd_ap_sttl_nm) doCnd_ap_sttl_nm_NC(info);
		else if (nc == Cnd_purc_act_no) doCnd_purc_act_no_NC(info);
		else if (nc == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NC(info);
		else if (nc == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_NC(info);
		else if (nc == Cnd_pay_chk_no) doCnd_pay_chk_no_NC(info);
		else if (nc == Cnd_pay_schd_no) doCnd_pay_schd_no_NC(info);
		else if (nc == Cnd_pay_act_no) doCnd_pay_act_no_NC(info);
		else if (nc == Cnd_note_no) doCnd_note_no_NC(info);
		else if (nc == Cnd_trd_rmrks) doCnd_trd_rmrks_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NC(info);
		else if (nc == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_dtl_sub_char1) doCnd_dtl_sub_char1_NC(info);
		else if (nc == Cnd_dtl_sub_char2) doCnd_dtl_sub_char2_NC(info);
		else if (nc == Cnd_dtl_sub_char3) doCnd_dtl_sub_char3_NC(info);
		else if (nc == Cnd_inc_can_flg) doCnd_inc_can_flg_NC(info);
		else if (nc == Cnd_inc_schd_act_flg) doCnd_inc_schd_act_flg_NC(info);
		else if (nc == Cnd_inc_sw_flg) doCnd_inc_sw_flg_NC(info);
		else if (nc == BulkSet_pay_act_dt) doBulkSet_pay_act_dt_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_pay_act_dt) doRslt_pay_act_dt_NC(info);
		else if (nc == columnRslt_pay_basis_dt) doRslt_pay_basis_dt_NC(info);
		else if (nc == columnRslt_ac_ym) doRslt_ac_ym_NC(info);
		else if (nc == columnRslt_slip_sts_typ_nm) doRslt_slip_sts_typ_nm_NC(info);
		else if (nc == columnRslt_psppl_cd) doRslt_psppl_cd_NC(info);
		else if (nc == columnRslt_psppl_nm) doRslt_psppl_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_ap_sttl_cd) doRslt_ap_sttl_cd_NC(info);
		else if (nc == columnRslt_ap_sttl_nm) doRslt_ap_sttl_nm_NC(info);
		else if (nc == columnRslt_ap_sttl_typ) doRslt_ap_sttl_typ_NC(info);
		else if (nc == columnRslt_ap_sttl_typ_nm) doRslt_ap_sttl_typ_nm_NC(info);
		else if (nc == columnRslt_bsppl_cd) doRslt_bsppl_cd_NC(info);
		else if (nc == columnRslt_bsppl_nm) doRslt_bsppl_nm_NC(info);
		else if (nc == columnRslt_bsppl_usr_cd) doRslt_bsppl_usr_cd_NC(info);
		else if (nc == columnRslt_bsppl_usr_nm) doRslt_bsppl_usr_nm_NC(info);
		else if (nc == columnRslt_bsppl_dpt_cd) doRslt_bsppl_dpt_cd_NC(info);
		else if (nc == columnRslt_bsppl_dpt_nm) doRslt_bsppl_dpt_nm_NC(info);
		else if (nc == columnRslt_purc_act_no) doRslt_purc_act_no_NC(info);
		else if (nc == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NC(info);
		else if (nc == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_NC(info);
		else if (nc == columnRslt_bsppl_cl_ym) doRslt_bsppl_cl_ym_NC(info);
		else if (nc == columnRslt_bsppl_cl_day) doRslt_bsppl_cl_day_NC(info);
		else if (nc == columnRslt_bsppl_cl_dt) doRslt_bsppl_cl_dt_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NC(info);
		else if (nc == columnRslt_xrate_cd) doRslt_xrate_cd_NC(info);
		else if (nc == columnRslt_base_cur_cd) doRslt_base_cur_cd_NC(info);
		else if (nc == columnRslt_base_cur_nm) doRslt_base_cur_nm_NC(info);
		else if (nc == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NC(info);
		else if (nc == columnRslt_trd_cur_com_paid_tax_cd) doRslt_trd_cur_com_paid_tax_cd_NC(info);
		else if (nc == columnRslt_trd_cur_com_paid_tax_nm) doRslt_trd_cur_com_paid_tax_nm_NC(info);
		else if (nc == columnRslt_trd_cur_com_paid_tax_rate) doRslt_trd_cur_com_paid_tax_rate_NC(info);
		else if (nc == columnRslt_trd_cur_com_paid_amt) doRslt_trd_cur_com_paid_amt_NC(info);
		else if (nc == columnRslt_rcv_bill_no) doRslt_rcv_bill_no_NC(info);
		else if (nc == columnRslt_adv_pay_act_no) doRslt_adv_pay_act_no_NC(info);
		else if (nc == columnRslt_rcv_no) doRslt_rcv_no_NC(info);
		else if (nc == columnRslt_asppl_cd) doRslt_asppl_cd_NC(info);
		else if (nc == columnRslt_asppl_nm) doRslt_asppl_nm_NC(info);
		else if (nc == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NC(info);
		else if (nc == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NC(info);
		else if (nc == columnRslt_ap_typ) doRslt_ap_typ_NC(info);
		else if (nc == columnRslt_ap_typ_nm) doRslt_ap_typ_nm_NC(info);
		else if (nc == columnRslt_ap_setoff_typ) doRslt_ap_setoff_typ_NC(info);
		else if (nc == columnRslt_ap_setoff_typ_nm) doRslt_ap_setoff_typ_nm_NC(info);
		else if (nc == columnRslt_setoff_cd) doRslt_setoff_cd_NC(info);
		else if (nc == columnRslt_setoff_nm) doRslt_setoff_nm_NC(info);
		else if (nc == columnRslt_so_dpt_cd) doRslt_so_dpt_cd_NC(info);
		else if (nc == columnRslt_so_dpt_nm) doRslt_so_dpt_nm_NC(info);
		else if (nc == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NC(info);
		else if (nc == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NC(info);
		else if (nc == columnRslt_pay_bank_ac_cd) doRslt_pay_bank_ac_cd_NC(info);
		else if (nc == columnRslt_pay_bank_ac_nm) doRslt_pay_bank_ac_nm_NC(info);
		else if (nc == columnRslt_note_no) doRslt_note_no_NC(info);
		else if (nc == columnRslt_note_typ) doRslt_note_typ_NC(info);
		else if (nc == columnRslt_note_typ_nm) doRslt_note_typ_nm_NC(info);
		else if (nc == columnRslt_draw_dt) doRslt_draw_dt_NC(info);
		else if (nc == columnRslt_note_days) doRslt_note_days_NC(info);
		else if (nc == columnRslt_due_dt) doRslt_due_dt_NC(info);
		else if (nc == columnRslt_drawer_nm) doRslt_drawer_nm_NC(info);
		else if (nc == columnRslt_endrsr) doRslt_endrsr_NC(info);
		else if (nc == columnRslt_accptr) doRslt_accptr_NC(info);
		else if (nc == columnRslt_draw_bank_cd) doRslt_draw_bank_cd_NC(info);
		else if (nc == columnRslt_draw_bank_nm) doRslt_draw_bank_nm_NC(info);
		else if (nc == columnRslt_draw_branch_cd) doRslt_draw_branch_cd_NC(info);
		else if (nc == columnRslt_draw_branch_nm) doRslt_draw_branch_nm_NC(info);
		else if (nc == columnRslt_note_rsn_cd) doRslt_note_rsn_cd_NC(info);
		else if (nc == columnRslt_note_rsn_nm) doRslt_note_rsn_nm_NC(info);
		else if (nc == columnRslt_note_sub_char1) doRslt_note_sub_char1_NC(info);
		else if (nc == columnRslt_note_sub_char2) doRslt_note_sub_char2_NC(info);
		else if (nc == columnRslt_note_sub_char3) doRslt_note_sub_char3_NC(info);
		else if (nc == columnRslt_pay_schd_dt) doRslt_pay_schd_dt_NC(info);
		else if (nc == columnRslt_pay_chk_no) doRslt_pay_chk_no_NC(info);
		else if (nc == columnRslt_pay_chk_mng_no) doRslt_pay_chk_mng_no_NC(info);
		else if (nc == columnRslt_pay_schd_no) doRslt_pay_schd_no_NC(info);
		else if (nc == columnRslt_ap_appl_schd_no) doRslt_ap_appl_schd_no_NC(info);
		else if (nc == columnRslt_pay_act_no) doRslt_pay_act_no_NC(info);
		else if (nc == columnRslt_pay_act_rev) doRslt_pay_act_rev_NC(info);
		else if (nc == columnRslt_pay_act_seq) doRslt_pay_act_seq_NC(info);
		else if (nc == columnRslt_disp_seq) doRslt_disp_seq_NC(info);
		else if (nc == columnRslt_pay_act_d_no) doRslt_pay_act_d_no_NC(info);
		else if (nc == columnRslt_pay_act_d_seq) doRslt_pay_act_d_seq_NC(info);
		else if (nc == columnRslt_pay_sts_typ) doRslt_pay_sts_typ_NC(info);
		else if (nc == columnRslt_pay_sts_typ_nm) doRslt_pay_sts_typ_nm_NC(info);
		else if (nc == columnRslt_schd_act_flg) doRslt_schd_act_flg_NC(info);
		else if (nc == columnRslt_multi_act_d_flg) doRslt_multi_act_d_flg_NC(info);
		else if (nc == columnRslt_sw_flg) doRslt_sw_flg_NC(info);
		else if (nc == columnRslt_sw_to_ap_sttl_cd) doRslt_sw_to_ap_sttl_cd_NC(info);
		else if (nc == columnRslt_sw_to_ap_sttl_nm) doRslt_sw_to_ap_sttl_nm_NC(info);
		else if (nc == columnRslt_sw_to_ap_sttl_typ) doRslt_sw_to_ap_sttl_typ_NC(info);
		else if (nc == columnRslt_sw_to_ap_sttl_typ_nm) doRslt_sw_to_ap_sttl_typ_nm_NC(info);
		else if (nc == columnRslt_sw_to_asppl_cd) doRslt_sw_to_asppl_cd_NC(info);
		else if (nc == columnRslt_sw_to_asppl_nm) doRslt_sw_to_asppl_nm_NC(info);
		else if (nc == columnRslt_sw_to_ap_dpt_cd) doRslt_sw_to_ap_dpt_cd_NC(info);
		else if (nc == columnRslt_sw_to_ap_dpt_nm) doRslt_sw_to_ap_dpt_nm_NC(info);
		else if (nc == columnRslt_sw_to_bsppl_cd) doRslt_sw_to_bsppl_cd_NC(info);
		else if (nc == columnRslt_sw_to_bsppl_nm) doRslt_sw_to_bsppl_nm_NC(info);
		else if (nc == columnRslt_sw_to_bsppl_dpt_cd) doRslt_sw_to_bsppl_dpt_cd_NC(info);
		else if (nc == columnRslt_sw_to_bsppl_dpt_nm) doRslt_sw_to_bsppl_dpt_nm_NC(info);
		else if (nc == columnRslt_sw_to_wrk_no) doRslt_sw_to_wrk_no_NC(info);
		else if (nc == columnRslt_sw_to_wrk_nm) doRslt_sw_to_wrk_nm_NC(info);
		else if (nc == columnRslt_trd_rmrks) doRslt_trd_rmrks_NC(info);
		else if (nc == columnRslt_intr_rmrks) doRslt_intr_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_pay_ntc_d_print_rmrks) doRslt_pay_ntc_d_print_rmrks_NC(info);
		else if (nc == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NC(info);
		else if (nc == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_NC(info);
		else if (nc == columnRslt_dtl_sub_char1) doRslt_dtl_sub_char1_NC(info);
		else if (nc == columnRslt_dtl_sub_char2) doRslt_dtl_sub_char2_NC(info);
		else if (nc == columnRslt_dtl_sub_char3) doRslt_dtl_sub_char3_NC(info);
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
		else if (nc == columnRslt_pay_chk_upd_cntr) doRslt_pay_chk_upd_cntr_NC(info);
		else if (nc == columnRslt_upd_cntr) doRslt_upd_cntr_NC(info);
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
	 * [Cnd]パネルの[mode]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mode_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[bsppl_cl_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cl_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cl_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cl_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[bsppl_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_usr_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ap_sttl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_chk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_chk_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_d_rmrks_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[dtl_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_schd_act_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_schd_act_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_sw_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_sw_flg_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[pay_act_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_pay_act_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_basis_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_basis_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ap_sttl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[bsppl_cl_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cl_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cl_day]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cl_day_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cl_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cl_dt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_com_paid_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_tax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_tax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_bill_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_pay_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_pay_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ap_setoff_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_setoff_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_setoff_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_setoff_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[setoff_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_setoff_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[setoff_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_setoff_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[so_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_so_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[so_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_so_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_bank_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_bank_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_bank_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_bank_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_days_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[due_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_due_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_drawer_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accptr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accptr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_bank_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_bank_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_bank_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_bank_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_branch_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_branch_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_branch_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_branch_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_mng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_mng_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_appl_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_appl_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_d_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_d_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_act_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_act_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[multi_act_d_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_multi_act_d_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_sttl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_ap_sttl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_sttl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_ap_sttl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_sttl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_ap_sttl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_sttl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_ap_sttl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_asppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_asppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_asppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_asppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_ap_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_bsppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_bsppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_bsppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_bsppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_bsppl_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_bsppl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_bsppl_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_bsppl_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_wrk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_wrk_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_ntc_d_print_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_ntc_d_print_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_sub_char3_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_chk_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NC(MCEventInfo info){
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
		else if (ne == Cnd_mode_Group) doCnd_mode_NE(info);
		else if (ne == Cnd_pay_schd_dt_fr) doCnd_pay_schd_dt_fr_NE(info);
		else if (ne == Cnd_pay_schd_dt_to) doCnd_pay_schd_dt_to_NE(info);
		else if (ne == Cnd_pay_act_dt_fr) doCnd_pay_act_dt_fr_NE(info);
		else if (ne == Cnd_pay_act_dt_to) doCnd_pay_act_dt_to_NE(info);
		else if (ne == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NE(info);
		else if (ne == Cnd_ac_dt_to) doCnd_ac_dt_to_NE(info);
		else if (ne == Cnd_bsppl_cl_dt_fr) doCnd_bsppl_cl_dt_fr_NE(info);
		else if (ne == Cnd_bsppl_cl_dt_to) doCnd_bsppl_cl_dt_to_NE(info);
		else if (ne == Cnd_psppl_cd) doCnd_psppl_cd_NE(info);
		else if (ne == Cnd_psppl_nm) doCnd_psppl_nm_NE(info);
		else if (ne == Cnd_bsppl_cd) doCnd_bsppl_cd_NE(info);
		else if (ne == Cnd_bsppl_nm) doCnd_bsppl_nm_NE(info);
		else if (ne == Cnd_pay_usr_cd) doCnd_pay_usr_cd_NE(info);
		else if (ne == Cnd_pay_usr_nm) doCnd_pay_usr_nm_NE(info);
		else if (ne == Cnd_pay_dpt_cd) doCnd_pay_dpt_cd_NE(info);
		else if (ne == Cnd_pay_dpt_nm) doCnd_pay_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_bsppl_usr_cd) doCnd_bsppl_usr_cd_NE(info);
		else if (ne == Cnd_bsppl_usr_nm) doCnd_bsppl_usr_nm_NE(info);
		else if (ne == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NE(info);
		else if (ne == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NE(info);
		else if (ne == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NE(info);
		else if (ne == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NE(info);
		else if (ne == Cnd_ap_sttl_cd) doCnd_ap_sttl_cd_NE(info);
		else if (ne == Cnd_ap_sttl_nm) doCnd_ap_sttl_nm_NE(info);
		else if (ne == Cnd_purc_act_no) doCnd_purc_act_no_NE(info);
		else if (ne == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NE(info);
		else if (ne == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_NE(info);
		else if (ne == Cnd_pay_chk_no) doCnd_pay_chk_no_NE(info);
		else if (ne == Cnd_pay_schd_no) doCnd_pay_schd_no_NE(info);
		else if (ne == Cnd_pay_act_no) doCnd_pay_act_no_NE(info);
		else if (ne == Cnd_note_no) doCnd_note_no_NE(info);
		else if (ne == Cnd_trd_rmrks) doCnd_trd_rmrks_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NE(info);
		else if (ne == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_dtl_sub_char1) doCnd_dtl_sub_char1_NE(info);
		else if (ne == Cnd_dtl_sub_char2) doCnd_dtl_sub_char2_NE(info);
		else if (ne == Cnd_dtl_sub_char3) doCnd_dtl_sub_char3_NE(info);
		else if (ne == Cnd_inc_can_flg) doCnd_inc_can_flg_NE(info);
		else if (ne == Cnd_inc_schd_act_flg) doCnd_inc_schd_act_flg_NE(info);
		else if (ne == Cnd_inc_sw_flg) doCnd_inc_sw_flg_NE(info);
		else if (ne == BulkSet_pay_act_dt) doBulkSet_pay_act_dt_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_pay_act_dt) doRslt_pay_act_dt_NE(info);
		else if (ne == columnRslt_pay_basis_dt) doRslt_pay_basis_dt_NE(info);
		else if (ne == columnRslt_ac_ym) doRslt_ac_ym_NE(info);
		else if (ne == columnRslt_slip_sts_typ_nm) doRslt_slip_sts_typ_nm_NE(info);
		else if (ne == columnRslt_psppl_cd) doRslt_psppl_cd_NE(info);
		else if (ne == columnRslt_psppl_nm) doRslt_psppl_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_ap_sttl_cd) doRslt_ap_sttl_cd_NE(info);
		else if (ne == columnRslt_ap_sttl_nm) doRslt_ap_sttl_nm_NE(info);
		else if (ne == columnRslt_ap_sttl_typ) doRslt_ap_sttl_typ_NE(info);
		else if (ne == columnRslt_ap_sttl_typ_nm) doRslt_ap_sttl_typ_nm_NE(info);
		else if (ne == columnRslt_bsppl_cd) doRslt_bsppl_cd_NE(info);
		else if (ne == columnRslt_bsppl_nm) doRslt_bsppl_nm_NE(info);
		else if (ne == columnRslt_bsppl_usr_cd) doRslt_bsppl_usr_cd_NE(info);
		else if (ne == columnRslt_bsppl_usr_nm) doRslt_bsppl_usr_nm_NE(info);
		else if (ne == columnRslt_bsppl_dpt_cd) doRslt_bsppl_dpt_cd_NE(info);
		else if (ne == columnRslt_bsppl_dpt_nm) doRslt_bsppl_dpt_nm_NE(info);
		else if (ne == columnRslt_purc_act_no) doRslt_purc_act_no_NE(info);
		else if (ne == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NE(info);
		else if (ne == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_NE(info);
		else if (ne == columnRslt_bsppl_cl_ym) doRslt_bsppl_cl_ym_NE(info);
		else if (ne == columnRslt_bsppl_cl_day) doRslt_bsppl_cl_day_NE(info);
		else if (ne == columnRslt_bsppl_cl_dt) doRslt_bsppl_cl_dt_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NE(info);
		else if (ne == columnRslt_xrate_cd) doRslt_xrate_cd_NE(info);
		else if (ne == columnRslt_base_cur_cd) doRslt_base_cur_cd_NE(info);
		else if (ne == columnRslt_base_cur_nm) doRslt_base_cur_nm_NE(info);
		else if (ne == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NE(info);
		else if (ne == columnRslt_trd_cur_com_paid_tax_cd) doRslt_trd_cur_com_paid_tax_cd_NE(info);
		else if (ne == columnRslt_trd_cur_com_paid_tax_nm) doRslt_trd_cur_com_paid_tax_nm_NE(info);
		else if (ne == columnRslt_trd_cur_com_paid_tax_rate) doRslt_trd_cur_com_paid_tax_rate_NE(info);
		else if (ne == columnRslt_trd_cur_com_paid_amt) doRslt_trd_cur_com_paid_amt_NE(info);
		else if (ne == columnRslt_rcv_bill_no) doRslt_rcv_bill_no_NE(info);
		else if (ne == columnRslt_adv_pay_act_no) doRslt_adv_pay_act_no_NE(info);
		else if (ne == columnRslt_rcv_no) doRslt_rcv_no_NE(info);
		else if (ne == columnRslt_asppl_cd) doRslt_asppl_cd_NE(info);
		else if (ne == columnRslt_asppl_nm) doRslt_asppl_nm_NE(info);
		else if (ne == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NE(info);
		else if (ne == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NE(info);
		else if (ne == columnRslt_ap_typ) doRslt_ap_typ_NE(info);
		else if (ne == columnRslt_ap_typ_nm) doRslt_ap_typ_nm_NE(info);
		else if (ne == columnRslt_ap_setoff_typ) doRslt_ap_setoff_typ_NE(info);
		else if (ne == columnRslt_ap_setoff_typ_nm) doRslt_ap_setoff_typ_nm_NE(info);
		else if (ne == columnRslt_setoff_cd) doRslt_setoff_cd_NE(info);
		else if (ne == columnRslt_setoff_nm) doRslt_setoff_nm_NE(info);
		else if (ne == columnRslt_so_dpt_cd) doRslt_so_dpt_cd_NE(info);
		else if (ne == columnRslt_so_dpt_nm) doRslt_so_dpt_nm_NE(info);
		else if (ne == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NE(info);
		else if (ne == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NE(info);
		else if (ne == columnRslt_pay_bank_ac_cd) doRslt_pay_bank_ac_cd_NE(info);
		else if (ne == columnRslt_pay_bank_ac_nm) doRslt_pay_bank_ac_nm_NE(info);
		else if (ne == columnRslt_note_no) doRslt_note_no_NE(info);
		else if (ne == columnRslt_note_typ) doRslt_note_typ_NE(info);
		else if (ne == columnRslt_note_typ_nm) doRslt_note_typ_nm_NE(info);
		else if (ne == columnRslt_draw_dt) doRslt_draw_dt_NE(info);
		else if (ne == columnRslt_note_days) doRslt_note_days_NE(info);
		else if (ne == columnRslt_due_dt) doRslt_due_dt_NE(info);
		else if (ne == columnRslt_drawer_nm) doRslt_drawer_nm_NE(info);
		else if (ne == columnRslt_endrsr) doRslt_endrsr_NE(info);
		else if (ne == columnRslt_accptr) doRslt_accptr_NE(info);
		else if (ne == columnRslt_draw_bank_cd) doRslt_draw_bank_cd_NE(info);
		else if (ne == columnRslt_draw_bank_nm) doRslt_draw_bank_nm_NE(info);
		else if (ne == columnRslt_draw_branch_cd) doRslt_draw_branch_cd_NE(info);
		else if (ne == columnRslt_draw_branch_nm) doRslt_draw_branch_nm_NE(info);
		else if (ne == columnRslt_note_rsn_cd) doRslt_note_rsn_cd_NE(info);
		else if (ne == columnRslt_note_rsn_nm) doRslt_note_rsn_nm_NE(info);
		else if (ne == columnRslt_note_sub_char1) doRslt_note_sub_char1_NE(info);
		else if (ne == columnRslt_note_sub_char2) doRslt_note_sub_char2_NE(info);
		else if (ne == columnRslt_note_sub_char3) doRslt_note_sub_char3_NE(info);
		else if (ne == columnRslt_pay_schd_dt) doRslt_pay_schd_dt_NE(info);
		else if (ne == columnRslt_pay_chk_no) doRslt_pay_chk_no_NE(info);
		else if (ne == columnRslt_pay_chk_mng_no) doRslt_pay_chk_mng_no_NE(info);
		else if (ne == columnRslt_pay_schd_no) doRslt_pay_schd_no_NE(info);
		else if (ne == columnRslt_ap_appl_schd_no) doRslt_ap_appl_schd_no_NE(info);
		else if (ne == columnRslt_pay_act_no) doRslt_pay_act_no_NE(info);
		else if (ne == columnRslt_pay_act_rev) doRslt_pay_act_rev_NE(info);
		else if (ne == columnRslt_pay_act_seq) doRslt_pay_act_seq_NE(info);
		else if (ne == columnRslt_disp_seq) doRslt_disp_seq_NE(info);
		else if (ne == columnRslt_pay_act_d_no) doRslt_pay_act_d_no_NE(info);
		else if (ne == columnRslt_pay_act_d_seq) doRslt_pay_act_d_seq_NE(info);
		else if (ne == columnRslt_pay_sts_typ) doRslt_pay_sts_typ_NE(info);
		else if (ne == columnRslt_pay_sts_typ_nm) doRslt_pay_sts_typ_nm_NE(info);
		else if (ne == columnRslt_schd_act_flg) doRslt_schd_act_flg_NE(info);
		else if (ne == columnRslt_multi_act_d_flg) doRslt_multi_act_d_flg_NE(info);
		else if (ne == columnRslt_sw_flg) doRslt_sw_flg_NE(info);
		else if (ne == columnRslt_sw_to_ap_sttl_cd) doRslt_sw_to_ap_sttl_cd_NE(info);
		else if (ne == columnRslt_sw_to_ap_sttl_nm) doRslt_sw_to_ap_sttl_nm_NE(info);
		else if (ne == columnRslt_sw_to_ap_sttl_typ) doRslt_sw_to_ap_sttl_typ_NE(info);
		else if (ne == columnRslt_sw_to_ap_sttl_typ_nm) doRslt_sw_to_ap_sttl_typ_nm_NE(info);
		else if (ne == columnRslt_sw_to_asppl_cd) doRslt_sw_to_asppl_cd_NE(info);
		else if (ne == columnRslt_sw_to_asppl_nm) doRslt_sw_to_asppl_nm_NE(info);
		else if (ne == columnRslt_sw_to_ap_dpt_cd) doRslt_sw_to_ap_dpt_cd_NE(info);
		else if (ne == columnRslt_sw_to_ap_dpt_nm) doRslt_sw_to_ap_dpt_nm_NE(info);
		else if (ne == columnRslt_sw_to_bsppl_cd) doRslt_sw_to_bsppl_cd_NE(info);
		else if (ne == columnRslt_sw_to_bsppl_nm) doRslt_sw_to_bsppl_nm_NE(info);
		else if (ne == columnRslt_sw_to_bsppl_dpt_cd) doRslt_sw_to_bsppl_dpt_cd_NE(info);
		else if (ne == columnRslt_sw_to_bsppl_dpt_nm) doRslt_sw_to_bsppl_dpt_nm_NE(info);
		else if (ne == columnRslt_sw_to_wrk_no) doRslt_sw_to_wrk_no_NE(info);
		else if (ne == columnRslt_sw_to_wrk_nm) doRslt_sw_to_wrk_nm_NE(info);
		else if (ne == columnRslt_trd_rmrks) doRslt_trd_rmrks_NE(info);
		else if (ne == columnRslt_intr_rmrks) doRslt_intr_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_pay_ntc_d_print_rmrks) doRslt_pay_ntc_d_print_rmrks_NE(info);
		else if (ne == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NE(info);
		else if (ne == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_NE(info);
		else if (ne == columnRslt_dtl_sub_char1) doRslt_dtl_sub_char1_NE(info);
		else if (ne == columnRslt_dtl_sub_char2) doRslt_dtl_sub_char2_NE(info);
		else if (ne == columnRslt_dtl_sub_char3) doRslt_dtl_sub_char3_NE(info);
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
		else if (ne == columnRslt_pay_chk_upd_cntr) doRslt_pay_chk_upd_cntr_NE(info);
		else if (ne == columnRslt_upd_cntr) doRslt_upd_cntr_NE(info);
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
	 * [Cnd]パネルの[mode]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mode_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[bsppl_cl_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cl_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cl_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cl_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[bsppl_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_usr_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ap_sttl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_chk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_chk_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_d_rmrks_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[dtl_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_schd_act_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_schd_act_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_sw_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_sw_flg_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[pay_act_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_pay_act_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_basis_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_basis_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ap_sttl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[bsppl_cl_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cl_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cl_day]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cl_day_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cl_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cl_dt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_com_paid_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_tax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_tax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_bill_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_pay_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_pay_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ap_setoff_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_setoff_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_setoff_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_setoff_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[setoff_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_setoff_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[setoff_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_setoff_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[so_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_so_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[so_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_so_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_bank_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_bank_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_bank_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_bank_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_days_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[due_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_due_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_drawer_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accptr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accptr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_bank_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_bank_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_bank_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_bank_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_branch_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_branch_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_branch_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_branch_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_mng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_mng_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_appl_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_appl_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_d_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_d_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_act_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_act_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[multi_act_d_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_multi_act_d_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_sttl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_ap_sttl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_sttl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_ap_sttl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_sttl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_ap_sttl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_sttl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_ap_sttl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_asppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_asppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_asppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_asppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_ap_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_bsppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_bsppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_bsppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_bsppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_bsppl_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_bsppl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_bsppl_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_bsppl_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_wrk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_wrk_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_ntc_d_print_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_ntc_d_print_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_sub_char3_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_chk_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NE(MCEventInfo info){
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
		else if (nx == Cnd_mode_Group) doCnd_mode_NX(info);
		else if (nx == Cnd_pay_schd_dt_fr) doCnd_pay_schd_dt_fr_NX(info);
		else if (nx == Cnd_pay_schd_dt_to) doCnd_pay_schd_dt_to_NX(info);
		else if (nx == Cnd_pay_act_dt_fr) doCnd_pay_act_dt_fr_NX(info);
		else if (nx == Cnd_pay_act_dt_to) doCnd_pay_act_dt_to_NX(info);
		else if (nx == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NX(info);
		else if (nx == Cnd_ac_dt_to) doCnd_ac_dt_to_NX(info);
		else if (nx == Cnd_bsppl_cl_dt_fr) doCnd_bsppl_cl_dt_fr_NX(info);
		else if (nx == Cnd_bsppl_cl_dt_to) doCnd_bsppl_cl_dt_to_NX(info);
		else if (nx == Cnd_psppl_cd) doCnd_psppl_cd_NX(info);
		else if (nx == Cnd_psppl_nm) doCnd_psppl_nm_NX(info);
		else if (nx == Cnd_bsppl_cd) doCnd_bsppl_cd_NX(info);
		else if (nx == Cnd_bsppl_nm) doCnd_bsppl_nm_NX(info);
		else if (nx == Cnd_pay_usr_cd) doCnd_pay_usr_cd_NX(info);
		else if (nx == Cnd_pay_usr_nm) doCnd_pay_usr_nm_NX(info);
		else if (nx == Cnd_pay_dpt_cd) doCnd_pay_dpt_cd_NX(info);
		else if (nx == Cnd_pay_dpt_nm) doCnd_pay_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_bsppl_usr_cd) doCnd_bsppl_usr_cd_NX(info);
		else if (nx == Cnd_bsppl_usr_nm) doCnd_bsppl_usr_nm_NX(info);
		else if (nx == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NX(info);
		else if (nx == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NX(info);
		else if (nx == Cnd_trd_cur_cd) doCnd_trd_cur_cd_NX(info);
		else if (nx == Cnd_trd_cur_nm) doCnd_trd_cur_nm_NX(info);
		else if (nx == Cnd_ap_sttl_cd) doCnd_ap_sttl_cd_NX(info);
		else if (nx == Cnd_ap_sttl_nm) doCnd_ap_sttl_nm_NX(info);
		else if (nx == Cnd_purc_act_no) doCnd_purc_act_no_NX(info);
		else if (nx == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_NX(info);
		else if (nx == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_NX(info);
		else if (nx == Cnd_pay_chk_no) doCnd_pay_chk_no_NX(info);
		else if (nx == Cnd_pay_schd_no) doCnd_pay_schd_no_NX(info);
		else if (nx == Cnd_pay_act_no) doCnd_pay_act_no_NX(info);
		else if (nx == Cnd_note_no) doCnd_note_no_NX(info);
		else if (nx == Cnd_trd_rmrks) doCnd_trd_rmrks_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NX(info);
		else if (nx == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_dtl_sub_char1) doCnd_dtl_sub_char1_NX(info);
		else if (nx == Cnd_dtl_sub_char2) doCnd_dtl_sub_char2_NX(info);
		else if (nx == Cnd_dtl_sub_char3) doCnd_dtl_sub_char3_NX(info);
		else if (nx == Cnd_inc_can_flg) doCnd_inc_can_flg_NX(info);
		else if (nx == Cnd_inc_schd_act_flg) doCnd_inc_schd_act_flg_NX(info);
		else if (nx == Cnd_inc_sw_flg) doCnd_inc_sw_flg_NX(info);
		else if (nx == BulkSet_pay_act_dt) doBulkSet_pay_act_dt_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_pay_act_dt) doRslt_pay_act_dt_NX(info);
		else if (nx == columnRslt_pay_basis_dt) doRslt_pay_basis_dt_NX(info);
		else if (nx == columnRslt_ac_ym) doRslt_ac_ym_NX(info);
		else if (nx == columnRslt_slip_sts_typ_nm) doRslt_slip_sts_typ_nm_NX(info);
		else if (nx == columnRslt_psppl_cd) doRslt_psppl_cd_NX(info);
		else if (nx == columnRslt_psppl_nm) doRslt_psppl_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_ap_sttl_cd) doRslt_ap_sttl_cd_NX(info);
		else if (nx == columnRslt_ap_sttl_nm) doRslt_ap_sttl_nm_NX(info);
		else if (nx == columnRslt_ap_sttl_typ) doRslt_ap_sttl_typ_NX(info);
		else if (nx == columnRslt_ap_sttl_typ_nm) doRslt_ap_sttl_typ_nm_NX(info);
		else if (nx == columnRslt_bsppl_cd) doRslt_bsppl_cd_NX(info);
		else if (nx == columnRslt_bsppl_nm) doRslt_bsppl_nm_NX(info);
		else if (nx == columnRslt_bsppl_usr_cd) doRslt_bsppl_usr_cd_NX(info);
		else if (nx == columnRslt_bsppl_usr_nm) doRslt_bsppl_usr_nm_NX(info);
		else if (nx == columnRslt_bsppl_dpt_cd) doRslt_bsppl_dpt_cd_NX(info);
		else if (nx == columnRslt_bsppl_dpt_nm) doRslt_bsppl_dpt_nm_NX(info);
		else if (nx == columnRslt_purc_act_no) doRslt_purc_act_no_NX(info);
		else if (nx == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_NX(info);
		else if (nx == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_NX(info);
		else if (nx == columnRslt_bsppl_cl_ym) doRslt_bsppl_cl_ym_NX(info);
		else if (nx == columnRslt_bsppl_cl_day) doRslt_bsppl_cl_day_NX(info);
		else if (nx == columnRslt_bsppl_cl_dt) doRslt_bsppl_cl_dt_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NX(info);
		else if (nx == columnRslt_xrate_cd) doRslt_xrate_cd_NX(info);
		else if (nx == columnRslt_base_cur_cd) doRslt_base_cur_cd_NX(info);
		else if (nx == columnRslt_base_cur_nm) doRslt_base_cur_nm_NX(info);
		else if (nx == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NX(info);
		else if (nx == columnRslt_trd_cur_com_paid_tax_cd) doRslt_trd_cur_com_paid_tax_cd_NX(info);
		else if (nx == columnRslt_trd_cur_com_paid_tax_nm) doRslt_trd_cur_com_paid_tax_nm_NX(info);
		else if (nx == columnRslt_trd_cur_com_paid_tax_rate) doRslt_trd_cur_com_paid_tax_rate_NX(info);
		else if (nx == columnRslt_trd_cur_com_paid_amt) doRslt_trd_cur_com_paid_amt_NX(info);
		else if (nx == columnRslt_rcv_bill_no) doRslt_rcv_bill_no_NX(info);
		else if (nx == columnRslt_adv_pay_act_no) doRslt_adv_pay_act_no_NX(info);
		else if (nx == columnRslt_rcv_no) doRslt_rcv_no_NX(info);
		else if (nx == columnRslt_asppl_cd) doRslt_asppl_cd_NX(info);
		else if (nx == columnRslt_asppl_nm) doRslt_asppl_nm_NX(info);
		else if (nx == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NX(info);
		else if (nx == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NX(info);
		else if (nx == columnRslt_ap_typ) doRslt_ap_typ_NX(info);
		else if (nx == columnRslt_ap_typ_nm) doRslt_ap_typ_nm_NX(info);
		else if (nx == columnRslt_ap_setoff_typ) doRslt_ap_setoff_typ_NX(info);
		else if (nx == columnRslt_ap_setoff_typ_nm) doRslt_ap_setoff_typ_nm_NX(info);
		else if (nx == columnRslt_setoff_cd) doRslt_setoff_cd_NX(info);
		else if (nx == columnRslt_setoff_nm) doRslt_setoff_nm_NX(info);
		else if (nx == columnRslt_so_dpt_cd) doRslt_so_dpt_cd_NX(info);
		else if (nx == columnRslt_so_dpt_nm) doRslt_so_dpt_nm_NX(info);
		else if (nx == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NX(info);
		else if (nx == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NX(info);
		else if (nx == columnRslt_pay_bank_ac_cd) doRslt_pay_bank_ac_cd_NX(info);
		else if (nx == columnRslt_pay_bank_ac_nm) doRslt_pay_bank_ac_nm_NX(info);
		else if (nx == columnRslt_note_no) doRslt_note_no_NX(info);
		else if (nx == columnRslt_note_typ) doRslt_note_typ_NX(info);
		else if (nx == columnRslt_note_typ_nm) doRslt_note_typ_nm_NX(info);
		else if (nx == columnRslt_draw_dt) doRslt_draw_dt_NX(info);
		else if (nx == columnRslt_note_days) doRslt_note_days_NX(info);
		else if (nx == columnRslt_due_dt) doRslt_due_dt_NX(info);
		else if (nx == columnRslt_drawer_nm) doRslt_drawer_nm_NX(info);
		else if (nx == columnRslt_endrsr) doRslt_endrsr_NX(info);
		else if (nx == columnRslt_accptr) doRslt_accptr_NX(info);
		else if (nx == columnRslt_draw_bank_cd) doRslt_draw_bank_cd_NX(info);
		else if (nx == columnRslt_draw_bank_nm) doRslt_draw_bank_nm_NX(info);
		else if (nx == columnRslt_draw_branch_cd) doRslt_draw_branch_cd_NX(info);
		else if (nx == columnRslt_draw_branch_nm) doRslt_draw_branch_nm_NX(info);
		else if (nx == columnRslt_note_rsn_cd) doRslt_note_rsn_cd_NX(info);
		else if (nx == columnRslt_note_rsn_nm) doRslt_note_rsn_nm_NX(info);
		else if (nx == columnRslt_note_sub_char1) doRslt_note_sub_char1_NX(info);
		else if (nx == columnRslt_note_sub_char2) doRslt_note_sub_char2_NX(info);
		else if (nx == columnRslt_note_sub_char3) doRslt_note_sub_char3_NX(info);
		else if (nx == columnRslt_pay_schd_dt) doRslt_pay_schd_dt_NX(info);
		else if (nx == columnRslt_pay_chk_no) doRslt_pay_chk_no_NX(info);
		else if (nx == columnRslt_pay_chk_mng_no) doRslt_pay_chk_mng_no_NX(info);
		else if (nx == columnRslt_pay_schd_no) doRslt_pay_schd_no_NX(info);
		else if (nx == columnRslt_ap_appl_schd_no) doRslt_ap_appl_schd_no_NX(info);
		else if (nx == columnRslt_pay_act_no) doRslt_pay_act_no_NX(info);
		else if (nx == columnRslt_pay_act_rev) doRslt_pay_act_rev_NX(info);
		else if (nx == columnRslt_pay_act_seq) doRslt_pay_act_seq_NX(info);
		else if (nx == columnRslt_disp_seq) doRslt_disp_seq_NX(info);
		else if (nx == columnRslt_pay_act_d_no) doRslt_pay_act_d_no_NX(info);
		else if (nx == columnRslt_pay_act_d_seq) doRslt_pay_act_d_seq_NX(info);
		else if (nx == columnRslt_pay_sts_typ) doRslt_pay_sts_typ_NX(info);
		else if (nx == columnRslt_pay_sts_typ_nm) doRslt_pay_sts_typ_nm_NX(info);
		else if (nx == columnRslt_schd_act_flg) doRslt_schd_act_flg_NX(info);
		else if (nx == columnRslt_multi_act_d_flg) doRslt_multi_act_d_flg_NX(info);
		else if (nx == columnRslt_sw_flg) doRslt_sw_flg_NX(info);
		else if (nx == columnRslt_sw_to_ap_sttl_cd) doRslt_sw_to_ap_sttl_cd_NX(info);
		else if (nx == columnRslt_sw_to_ap_sttl_nm) doRslt_sw_to_ap_sttl_nm_NX(info);
		else if (nx == columnRslt_sw_to_ap_sttl_typ) doRslt_sw_to_ap_sttl_typ_NX(info);
		else if (nx == columnRslt_sw_to_ap_sttl_typ_nm) doRslt_sw_to_ap_sttl_typ_nm_NX(info);
		else if (nx == columnRslt_sw_to_asppl_cd) doRslt_sw_to_asppl_cd_NX(info);
		else if (nx == columnRslt_sw_to_asppl_nm) doRslt_sw_to_asppl_nm_NX(info);
		else if (nx == columnRslt_sw_to_ap_dpt_cd) doRslt_sw_to_ap_dpt_cd_NX(info);
		else if (nx == columnRslt_sw_to_ap_dpt_nm) doRslt_sw_to_ap_dpt_nm_NX(info);
		else if (nx == columnRslt_sw_to_bsppl_cd) doRslt_sw_to_bsppl_cd_NX(info);
		else if (nx == columnRslt_sw_to_bsppl_nm) doRslt_sw_to_bsppl_nm_NX(info);
		else if (nx == columnRslt_sw_to_bsppl_dpt_cd) doRslt_sw_to_bsppl_dpt_cd_NX(info);
		else if (nx == columnRslt_sw_to_bsppl_dpt_nm) doRslt_sw_to_bsppl_dpt_nm_NX(info);
		else if (nx == columnRslt_sw_to_wrk_no) doRslt_sw_to_wrk_no_NX(info);
		else if (nx == columnRslt_sw_to_wrk_nm) doRslt_sw_to_wrk_nm_NX(info);
		else if (nx == columnRslt_trd_rmrks) doRslt_trd_rmrks_NX(info);
		else if (nx == columnRslt_intr_rmrks) doRslt_intr_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_pay_ntc_d_print_rmrks) doRslt_pay_ntc_d_print_rmrks_NX(info);
		else if (nx == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NX(info);
		else if (nx == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_NX(info);
		else if (nx == columnRslt_dtl_sub_char1) doRslt_dtl_sub_char1_NX(info);
		else if (nx == columnRslt_dtl_sub_char2) doRslt_dtl_sub_char2_NX(info);
		else if (nx == columnRslt_dtl_sub_char3) doRslt_dtl_sub_char3_NX(info);
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
		else if (nx == columnRslt_pay_chk_upd_cntr) doRslt_pay_chk_upd_cntr_NX(info);
		else if (nx == columnRslt_upd_cntr) doRslt_upd_cntr_NX(info);
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
	 * [Cnd]パネルの[mode]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mode_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[bsppl_cl_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cl_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cl_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cl_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[bsppl_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_usr_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ap_sttl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_chk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_chk_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_d_rmrks_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[dtl_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_schd_act_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_schd_act_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_sw_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_sw_flg_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[pay_act_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_pay_act_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_basis_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_basis_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ap_sttl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[bsppl_cl_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cl_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cl_day]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cl_day_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cl_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cl_dt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_com_paid_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_tax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_tax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_bill_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_pay_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_pay_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ap_setoff_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_setoff_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_setoff_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_setoff_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[setoff_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_setoff_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[setoff_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_setoff_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[so_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_so_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[so_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_so_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_bank_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_bank_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_bank_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_bank_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_days_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[due_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_due_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_drawer_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accptr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accptr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_bank_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_bank_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_bank_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_bank_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_branch_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_branch_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_branch_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_branch_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_mng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_mng_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_appl_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_appl_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_d_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_d_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_act_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_act_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[multi_act_d_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_multi_act_d_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_sttl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_ap_sttl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_sttl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_ap_sttl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_sttl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_ap_sttl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_sttl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_ap_sttl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_asppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_asppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_asppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_asppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_ap_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_bsppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_bsppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_bsppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_bsppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_bsppl_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_bsppl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_bsppl_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_bsppl_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_wrk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_wrk_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_ntc_d_print_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_ntc_d_print_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_sub_char3_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_chk_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NX(MCEventInfo info){
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
		if (lc == Cnd_pay_schd_dt_fr) doCnd_pay_schd_dt_fr_LC(info);
		else if (lc == Cnd_pay_schd_dt_to) doCnd_pay_schd_dt_to_LC(info);
		else if (lc == Cnd_pay_act_dt_fr) doCnd_pay_act_dt_fr_LC(info);
		else if (lc == Cnd_pay_act_dt_to) doCnd_pay_act_dt_to_LC(info);
		else if (lc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_LC(info);
		else if (lc == Cnd_ac_dt_to) doCnd_ac_dt_to_LC(info);
		else if (lc == Cnd_bsppl_cl_dt_fr) doCnd_bsppl_cl_dt_fr_LC(info);
		else if (lc == Cnd_bsppl_cl_dt_to) doCnd_bsppl_cl_dt_to_LC(info);
		else if (lc == Cnd_psppl_cd) doCnd_psppl_cd_LC(info);
		else if (lc == Cnd_psppl_nm) doCnd_psppl_nm_LC(info);
		else if (lc == Cnd_bsppl_cd) doCnd_bsppl_cd_LC(info);
		else if (lc == Cnd_bsppl_nm) doCnd_bsppl_nm_LC(info);
		else if (lc == Cnd_pay_usr_cd) doCnd_pay_usr_cd_LC(info);
		else if (lc == Cnd_pay_usr_nm) doCnd_pay_usr_nm_LC(info);
		else if (lc == Cnd_pay_dpt_cd) doCnd_pay_dpt_cd_LC(info);
		else if (lc == Cnd_pay_dpt_nm) doCnd_pay_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_bsppl_usr_cd) doCnd_bsppl_usr_cd_LC(info);
		else if (lc == Cnd_bsppl_usr_nm) doCnd_bsppl_usr_nm_LC(info);
		else if (lc == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_LC(info);
		else if (lc == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_LC(info);
		else if (lc == Cnd_trd_cur_cd) doCnd_trd_cur_cd_LC(info);
		else if (lc == Cnd_trd_cur_nm) doCnd_trd_cur_nm_LC(info);
		else if (lc == Cnd_ap_sttl_cd) doCnd_ap_sttl_cd_LC(info);
		else if (lc == Cnd_ap_sttl_nm) doCnd_ap_sttl_nm_LC(info);
		else if (lc == Cnd_purc_act_no) doCnd_purc_act_no_LC(info);
		else if (lc == Cnd_rcpt_iv_no) doCnd_rcpt_iv_no_LC(info);
		else if (lc == Cnd_rcpt_iv_mng_no) doCnd_rcpt_iv_mng_no_LC(info);
		else if (lc == Cnd_pay_chk_no) doCnd_pay_chk_no_LC(info);
		else if (lc == Cnd_pay_schd_no) doCnd_pay_schd_no_LC(info);
		else if (lc == Cnd_pay_act_no) doCnd_pay_act_no_LC(info);
		else if (lc == Cnd_note_no) doCnd_note_no_LC(info);
		else if (lc == Cnd_trd_rmrks) doCnd_trd_rmrks_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_LC(info);
		else if (lc == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == Cnd_dtl_sub_char1) doCnd_dtl_sub_char1_LC(info);
		else if (lc == Cnd_dtl_sub_char2) doCnd_dtl_sub_char2_LC(info);
		else if (lc == Cnd_dtl_sub_char3) doCnd_dtl_sub_char3_LC(info);
		else if (lc == BulkSet_pay_act_dt) doBulkSet_pay_act_dt_LC(info);
		else if (lc == columnRslt_pay_act_dt) doRslt_pay_act_dt_LC(info);
		else if (lc == columnRslt_pay_basis_dt) doRslt_pay_basis_dt_LC(info);
		else if (lc == columnRslt_ac_ym) doRslt_ac_ym_LC(info);
		else if (lc == columnRslt_slip_sts_typ_nm) doRslt_slip_sts_typ_nm_LC(info);
		else if (lc == columnRslt_psppl_cd) doRslt_psppl_cd_LC(info);
		else if (lc == columnRslt_psppl_nm) doRslt_psppl_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_ap_sttl_cd) doRslt_ap_sttl_cd_LC(info);
		else if (lc == columnRslt_ap_sttl_nm) doRslt_ap_sttl_nm_LC(info);
		else if (lc == columnRslt_ap_sttl_typ) doRslt_ap_sttl_typ_LC(info);
		else if (lc == columnRslt_ap_sttl_typ_nm) doRslt_ap_sttl_typ_nm_LC(info);
		else if (lc == columnRslt_bsppl_cd) doRslt_bsppl_cd_LC(info);
		else if (lc == columnRslt_bsppl_nm) doRslt_bsppl_nm_LC(info);
		else if (lc == columnRslt_bsppl_usr_cd) doRslt_bsppl_usr_cd_LC(info);
		else if (lc == columnRslt_bsppl_usr_nm) doRslt_bsppl_usr_nm_LC(info);
		else if (lc == columnRslt_bsppl_dpt_cd) doRslt_bsppl_dpt_cd_LC(info);
		else if (lc == columnRslt_bsppl_dpt_nm) doRslt_bsppl_dpt_nm_LC(info);
		else if (lc == columnRslt_purc_act_no) doRslt_purc_act_no_LC(info);
		else if (lc == columnRslt_rcpt_iv_no) doRslt_rcpt_iv_no_LC(info);
		else if (lc == columnRslt_rcpt_iv_mng_no) doRslt_rcpt_iv_mng_no_LC(info);
		else if (lc == columnRslt_bsppl_cl_ym) doRslt_bsppl_cl_ym_LC(info);
		else if (lc == columnRslt_bsppl_cl_day) doRslt_bsppl_cl_day_LC(info);
		else if (lc == columnRslt_bsppl_cl_dt) doRslt_bsppl_cl_dt_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_LC(info);
		else if (lc == columnRslt_xrate_cd) doRslt_xrate_cd_LC(info);
		else if (lc == columnRslt_base_cur_cd) doRslt_base_cur_cd_LC(info);
		else if (lc == columnRslt_base_cur_nm) doRslt_base_cur_nm_LC(info);
		else if (lc == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_LC(info);
		else if (lc == columnRslt_trd_cur_com_paid_tax_cd) doRslt_trd_cur_com_paid_tax_cd_LC(info);
		else if (lc == columnRslt_trd_cur_com_paid_tax_nm) doRslt_trd_cur_com_paid_tax_nm_LC(info);
		else if (lc == columnRslt_trd_cur_com_paid_tax_rate) doRslt_trd_cur_com_paid_tax_rate_LC(info);
		else if (lc == columnRslt_trd_cur_com_paid_amt) doRslt_trd_cur_com_paid_amt_LC(info);
		else if (lc == columnRslt_rcv_bill_no) doRslt_rcv_bill_no_LC(info);
		else if (lc == columnRslt_adv_pay_act_no) doRslt_adv_pay_act_no_LC(info);
		else if (lc == columnRslt_rcv_no) doRslt_rcv_no_LC(info);
		else if (lc == columnRslt_asppl_cd) doRslt_asppl_cd_LC(info);
		else if (lc == columnRslt_asppl_nm) doRslt_asppl_nm_LC(info);
		else if (lc == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_LC(info);
		else if (lc == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_LC(info);
		else if (lc == columnRslt_ap_typ) doRslt_ap_typ_LC(info);
		else if (lc == columnRslt_ap_typ_nm) doRslt_ap_typ_nm_LC(info);
		else if (lc == columnRslt_ap_setoff_typ) doRslt_ap_setoff_typ_LC(info);
		else if (lc == columnRslt_ap_setoff_typ_nm) doRslt_ap_setoff_typ_nm_LC(info);
		else if (lc == columnRslt_setoff_cd) doRslt_setoff_cd_LC(info);
		else if (lc == columnRslt_setoff_nm) doRslt_setoff_nm_LC(info);
		else if (lc == columnRslt_so_dpt_cd) doRslt_so_dpt_cd_LC(info);
		else if (lc == columnRslt_so_dpt_nm) doRslt_so_dpt_nm_LC(info);
		else if (lc == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_LC(info);
		else if (lc == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_LC(info);
		else if (lc == columnRslt_pay_bank_ac_cd) doRslt_pay_bank_ac_cd_LC(info);
		else if (lc == columnRslt_pay_bank_ac_nm) doRslt_pay_bank_ac_nm_LC(info);
		else if (lc == columnRslt_note_no) doRslt_note_no_LC(info);
		else if (lc == columnRslt_note_typ) doRslt_note_typ_LC(info);
		else if (lc == columnRslt_note_typ_nm) doRslt_note_typ_nm_LC(info);
		else if (lc == columnRslt_draw_dt) doRslt_draw_dt_LC(info);
		else if (lc == columnRslt_note_days) doRslt_note_days_LC(info);
		else if (lc == columnRslt_due_dt) doRslt_due_dt_LC(info);
		else if (lc == columnRslt_drawer_nm) doRslt_drawer_nm_LC(info);
		else if (lc == columnRslt_endrsr) doRslt_endrsr_LC(info);
		else if (lc == columnRslt_accptr) doRslt_accptr_LC(info);
		else if (lc == columnRslt_draw_bank_cd) doRslt_draw_bank_cd_LC(info);
		else if (lc == columnRslt_draw_bank_nm) doRslt_draw_bank_nm_LC(info);
		else if (lc == columnRslt_draw_branch_cd) doRslt_draw_branch_cd_LC(info);
		else if (lc == columnRslt_draw_branch_nm) doRslt_draw_branch_nm_LC(info);
		else if (lc == columnRslt_note_rsn_cd) doRslt_note_rsn_cd_LC(info);
		else if (lc == columnRslt_note_rsn_nm) doRslt_note_rsn_nm_LC(info);
		else if (lc == columnRslt_note_sub_char1) doRslt_note_sub_char1_LC(info);
		else if (lc == columnRslt_note_sub_char2) doRslt_note_sub_char2_LC(info);
		else if (lc == columnRslt_note_sub_char3) doRslt_note_sub_char3_LC(info);
		else if (lc == columnRslt_pay_schd_dt) doRslt_pay_schd_dt_LC(info);
		else if (lc == columnRslt_pay_chk_no) doRslt_pay_chk_no_LC(info);
		else if (lc == columnRslt_pay_chk_mng_no) doRslt_pay_chk_mng_no_LC(info);
		else if (lc == columnRslt_pay_schd_no) doRslt_pay_schd_no_LC(info);
		else if (lc == columnRslt_ap_appl_schd_no) doRslt_ap_appl_schd_no_LC(info);
		else if (lc == columnRslt_pay_act_no) doRslt_pay_act_no_LC(info);
		else if (lc == columnRslt_pay_act_rev) doRslt_pay_act_rev_LC(info);
		else if (lc == columnRslt_pay_act_seq) doRslt_pay_act_seq_LC(info);
		else if (lc == columnRslt_disp_seq) doRslt_disp_seq_LC(info);
		else if (lc == columnRslt_pay_act_d_no) doRslt_pay_act_d_no_LC(info);
		else if (lc == columnRslt_pay_act_d_seq) doRslt_pay_act_d_seq_LC(info);
		else if (lc == columnRslt_pay_sts_typ) doRslt_pay_sts_typ_LC(info);
		else if (lc == columnRslt_pay_sts_typ_nm) doRslt_pay_sts_typ_nm_LC(info);
		else if (lc == columnRslt_sw_to_ap_sttl_cd) doRslt_sw_to_ap_sttl_cd_LC(info);
		else if (lc == columnRslt_sw_to_ap_sttl_nm) doRslt_sw_to_ap_sttl_nm_LC(info);
		else if (lc == columnRslt_sw_to_ap_sttl_typ) doRslt_sw_to_ap_sttl_typ_LC(info);
		else if (lc == columnRslt_sw_to_ap_sttl_typ_nm) doRslt_sw_to_ap_sttl_typ_nm_LC(info);
		else if (lc == columnRslt_sw_to_asppl_cd) doRslt_sw_to_asppl_cd_LC(info);
		else if (lc == columnRslt_sw_to_asppl_nm) doRslt_sw_to_asppl_nm_LC(info);
		else if (lc == columnRslt_sw_to_ap_dpt_cd) doRslt_sw_to_ap_dpt_cd_LC(info);
		else if (lc == columnRslt_sw_to_ap_dpt_nm) doRslt_sw_to_ap_dpt_nm_LC(info);
		else if (lc == columnRslt_sw_to_bsppl_cd) doRslt_sw_to_bsppl_cd_LC(info);
		else if (lc == columnRslt_sw_to_bsppl_nm) doRslt_sw_to_bsppl_nm_LC(info);
		else if (lc == columnRslt_sw_to_bsppl_dpt_cd) doRslt_sw_to_bsppl_dpt_cd_LC(info);
		else if (lc == columnRslt_sw_to_bsppl_dpt_nm) doRslt_sw_to_bsppl_dpt_nm_LC(info);
		else if (lc == columnRslt_sw_to_wrk_no) doRslt_sw_to_wrk_no_LC(info);
		else if (lc == columnRslt_sw_to_wrk_nm) doRslt_sw_to_wrk_nm_LC(info);
		else if (lc == columnRslt_trd_rmrks) doRslt_trd_rmrks_LC(info);
		else if (lc == columnRslt_intr_rmrks) doRslt_intr_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_pay_ntc_d_print_rmrks) doRslt_pay_ntc_d_print_rmrks_LC(info);
		else if (lc == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_LC(info);
		else if (lc == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_LC(info);
		else if (lc == columnRslt_dtl_sub_char1) doRslt_dtl_sub_char1_LC(info);
		else if (lc == columnRslt_dtl_sub_char2) doRslt_dtl_sub_char2_LC(info);
		else if (lc == columnRslt_dtl_sub_char3) doRslt_dtl_sub_char3_LC(info);
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
		else if (lc == columnRslt_pay_chk_upd_cntr) doRslt_pay_chk_upd_cntr_LC(info);
		else if (lc == columnRslt_upd_cntr) doRslt_upd_cntr_LC(info);
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[bsppl_cl_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cl_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cl_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cl_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[bsppl_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_usr_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ap_sttl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_act_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[pay_chk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_chk_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[note_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_note_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_d_rmrks_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[dtl_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dtl_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dtl_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[pay_act_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_pay_act_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_basis_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_basis_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ap_sttl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_sttl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_sttl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_act_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[bsppl_cl_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cl_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cl_day]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cl_day_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cl_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cl_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cur_com_paid_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_tax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_tax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_com_paid_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_com_paid_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_bill_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adv_pay_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adv_pay_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ap_setoff_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_setoff_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_setoff_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_setoff_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[setoff_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_setoff_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[setoff_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_setoff_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[so_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_so_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[so_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_so_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_bank_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_bank_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_bank_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_bank_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_days_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[due_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_due_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[drawer_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_drawer_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[endrsr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_endrsr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accptr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accptr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_bank_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_bank_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_bank_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_bank_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_branch_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_branch_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[draw_branch_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_draw_branch_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_mng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_mng_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_appl_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_appl_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_d_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_d_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_sttl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_ap_sttl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_sttl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_ap_sttl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_sttl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_ap_sttl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_sttl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_ap_sttl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_asppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_asppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_asppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_asppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_ap_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_ap_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_bsppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_bsppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_bsppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_bsppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_bsppl_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_bsppl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_bsppl_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_bsppl_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sw_to_wrk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sw_to_wrk_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_ntc_d_print_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_ntc_d_print_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dtl_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dtl_sub_char3_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_chk_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_psppl_cd]の作成メソッド
	 */
	public MCList getCnd_psppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bsppl_cd]の作成メソッド
	 */
	public MCList getCnd_bsppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_pay_usr_cd]の作成メソッド
	 */
	public MCList getCnd_pay_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_pay_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_pay_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getApWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bsppl_usr_cd]の作成メソッド
	 */
	public MCList getCnd_bsppl_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bsppl_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_bsppl_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_trd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ap_sttl_cd]の作成メソッド
	 */
	public MCList getCnd_ap_sttl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getApSttl(row, info);
	}

	/**
	 * コンボ／リストのリスト[BulkSet_pay_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getBulkSet_pay_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_pay_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getRslt_pay_usr_dpt_p_PPanel_columnUsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_trd_cur_com_paid_tax_cd]の作成メソッド
	 */
	public MCList getRslt_trd_cur_com_paid_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTax(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBHL0100.Srch01")) {
			return new MS_MSBHL0100_Srch01Bridge();
		}
		if (id.equals("MS.MSBHL0100.Srch02")) {
			return new MS_MSBHL0100_Srch02Bridge();
		}
		if (id.equals("MS.MSBHL0100.Srch03")) {
			return new MS_MSBHL0100_Srch03Bridge();
		}
		if (id.equals("MS.MSBHL0100.Ins01")) {
			return new MS_MSBHL0100_Ins01Bridge();
		}
		if (id.equals("MS.MSBHL0100.Del01")) {
			return new MS_MSBHL0100_Del01Bridge();
		}
		if (id.equals("MS.MSBHL0100.Prnt01")) {
			return new MS_MSBHL0100_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBHL0100_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0100_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0100_Srch01;

		/** コンストラクタ */
		protected MS_MSBHL0100_Srch01Bridge() {
			p_MS_MSBHL0100_Srch01 = new MCParam(PDef.MS_MSBHL0100_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0100_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBH.MSBHP0100.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0100.RsltR.class));

			p_MS_MSBHL0100_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0100_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0100_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0100_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0100_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBH.MSBHP0100.CndR up0() {
			return (mcframe.clientMSBH.MSBHP0100.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBH.MSBHP0100.RsltR> down0() {
			return (MCList<mcframe.clientMSBH.MSBHP0100.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBHL0100_Srch01.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0100.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBHL0100_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBH.MSBHP0100.RsltR>)p_MS_MSBHL0100_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBHL0100_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0100_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0100_Srch02;

		/** コンストラクタ */
		protected MS_MSBHL0100_Srch02Bridge() {
			p_MS_MSBHL0100_Srch02 = new MCParam(PDef.MS_MSBHL0100_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0100_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBH.MSBHP0100.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0100.RsltR.class));

			p_MS_MSBHL0100_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0100_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0100_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0100_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0100_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBH.MSBHP0100.CndR up0() {
			return (mcframe.clientMSBH.MSBHP0100.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBH.MSBHP0100.RsltR> down0() {
			return (MCList<mcframe.clientMSBH.MSBHP0100.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBHL0100_Srch02.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0100.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBHL0100_Srch02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBH.MSBHP0100.RsltR>)p_MS_MSBHL0100_Srch02.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBHL0100_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0100_Srch03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0100_Srch03;

		/** コンストラクタ */
		protected MS_MSBHL0100_Srch03Bridge() {
			p_MS_MSBHL0100_Srch03 = new MCParam(PDef.MS_MSBHL0100_Srch03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0100_Srch03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBH.MSBHP0100.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0100.RsltR.class));

			p_MS_MSBHL0100_Srch03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0100_Srch03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0100_Srch03.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0100_Srch03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0100_Srch03.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBH.MSBHP0100.CndR up0() {
			return (mcframe.clientMSBH.MSBHP0100.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBH.MSBHP0100.RsltR> down0() {
			return (MCList<mcframe.clientMSBH.MSBHP0100.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBHL0100_Srch03.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0100.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBHL0100_Srch03;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBH.MSBHP0100.RsltR>)p_MS_MSBHL0100_Srch03.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBHL0100_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0100_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0100_Ins01;

		/** コンストラクタ */
		protected MS_MSBHL0100_Ins01Bridge() {
			p_MS_MSBHL0100_Ins01 = new MCParam(PDef.MS_MSBHL0100_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0100_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBH.MSBHP0100.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0100.RsltR.class));

			p_MS_MSBHL0100_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0100_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0100_Ins01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0100_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0100_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBH.MSBHP0100.RsltR> up0() {
			return (MCList<mcframe.clientMSBH.MSBHP0100.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBH.MSBHP0100.RsltR> down0() {
			return (MCList<mcframe.clientMSBH.MSBHP0100.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBHL0100_Ins01.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0100.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBHL0100_Ins01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBH.MSBHP0100.RsltR>)p_MS_MSBHL0100_Ins01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBHL0100_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0100_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0100_Del01;

		/** コンストラクタ */
		protected MS_MSBHL0100_Del01Bridge() {
			p_MS_MSBHL0100_Del01 = new MCParam(PDef.MS_MSBHL0100_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0100_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBH.MSBHP0100.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0100.RsltR.class));

			p_MS_MSBHL0100_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0100_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0100_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0100_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0100_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBH.MSBHP0100.RsltR> up0() {
			return (MCList<mcframe.clientMSBH.MSBHP0100.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBH.MSBHP0100.RsltR> down0() {
			return (MCList<mcframe.clientMSBH.MSBHP0100.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBHL0100_Del01.addDownBlock(MCList.create(mcframe.clientMSBH.MSBHP0100.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBHL0100_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBH.MSBHP0100.RsltR>)p_MS_MSBHL0100_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBHL0100_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBHL0100_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBHL0100_Prnt01;

		/** コンストラクタ */
		protected MS_MSBHL0100_Prnt01Bridge() {
			p_MS_MSBHL0100_Prnt01 = new MCParam(PDef.MS_MSBHL0100_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBHL0100_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBH.MSBHP0100.RsltR.class));
			param.addUpBlock(mcframe.clientMSBH.MSBHP0100.BtnR.create());
			// Down

			p_MS_MSBHL0100_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBHL0100_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBHL0100_Prnt01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBHL0100_Prnt01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBHL0100_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBHL0100_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBH.MSBHP0100.RsltR> up0() {
			return (MCList<mcframe.clientMSBH.MSBHP0100.RsltR>)up(0);
		}
		protected mcframe.clientMSBH.MSBHP0100.BtnR up1() {
			return (mcframe.clientMSBH.MSBHP0100.BtnR)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBHL0100_Prnt01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getBtnR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}